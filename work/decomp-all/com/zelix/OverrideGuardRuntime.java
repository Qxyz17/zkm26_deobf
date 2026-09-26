/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._v;
import com.zelix.b0;
import com.zelix.b1;
import com.zelix.jf;
import com.zelix.jv;
import com.zelix.l62;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Set;

public final class OverrideGuardRuntime {
    private static final MethodHandle RENAME_METHOD = OverrideGuardRuntime.findRenameMethod();

    private OverrideGuardRuntime() {
    }

    public static void rename(Object object, Object object2) {
        boolean bl;
        b0 b02 = (b0)object;
        Object[] objectArray = (Object[])object2;
        boolean bl2 = bl = b02 instanceof b1 && OverrideGuardRuntime.overridesExternal((b1)b02);
        if ("run".equals(b02.F) || "keyPressed".equals(b02.F) || bl) {
            _4 _42 = b02.H();
            String string = _42 instanceof _v ? ((_v)_42).G : "<unknown>";
            System.err.println("[OverrideGuard] " + string + "." + b02.F + b02.W + " preserve=" + bl);
        }
        if (!bl) {
            try {
                RENAME_METHOD.invokeExact(b02, objectArray);
            }
            catch (Throwable throwable) {
                OverrideGuardRuntime.rethrow(throwable);
            }
        }
    }

    private static MethodHandle findRenameMethod() {
        try {
            return MethodHandles.lookup().findVirtual(b0.class, "I", MethodType.methodType(Void.TYPE, Object[].class));
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new ExceptionInInitializerError(reflectiveOperationException);
        }
    }

    private static <T extends Throwable> void rethrow(Throwable throwable) throws T {
        throw throwable;
    }

    private static boolean overridesExternal(b1 b12) {
        _4 _42 = b12.H();
        if (!(_42 instanceof _v)) {
            return false;
        }
        _v _v2 = (_v)_42;
        HashSet<String> hashSet = new HashSet<String>();
        if (OverrideGuardRuntime.hasExternalDeclaration(_v2.c, b12.F, b12.W, hashSet)) {
            return true;
        }
        if (_v2.o != null) {
            for (jv jv2 : _v2.o) {
                if (!OverrideGuardRuntime.hasExternalDeclaration(jv2, b12.F, b12.W, hashSet)) continue;
                return true;
            }
        }
        Set<_v> set = Collections.newSetFromMap(new IdentityHashMap());
        if (OverrideGuardRuntime.hasExternalDeclaration(OverrideGuardRuntime.resolveType(_v2.c), b12.F, b12.W, set)) {
            return true;
        }
        if (_v2.o == null) {
            return false;
        }
        for (jv jv3 : _v2.o) {
            if (!OverrideGuardRuntime.hasExternalDeclaration(OverrideGuardRuntime.resolveType(jv3), b12.F, b12.W, set)) continue;
            return true;
        }
        return false;
    }

    private static boolean hasExternalDeclaration(jv jv2, String string, String string2, Set<String> set) {
        String string3 = OverrideGuardRuntime.referenceName(jv2);
        if (string3 == null || !set.add(string3)) {
            return false;
        }
        try {
            Class<?> clazz = Class.forName(string3.replace('/', '.'), false, OverrideGuardRuntime.class.getClassLoader());
            for (Method method : clazz.getDeclaredMethods()) {
                int clazz2 = method.getModifiers();
                if (Modifier.isPrivate(clazz2) || Modifier.isStatic(clazz2) || !string.equals(method.getName()) || !OverrideGuardRuntime.sameParameters(string2, OverrideGuardRuntime.descriptor(method))) continue;
                return true;
            }
            Class<?> clazz2 = clazz.getSuperclass();
            if (clazz2 != null && OverrideGuardRuntime.hasExternalDeclaration(clazz2, string, string2, set)) {
                return true;
            }
            for (Class<?> clazz3 : clazz.getInterfaces()) {
                if (!OverrideGuardRuntime.hasExternalDeclaration(clazz3, string, string2, set)) continue;
                return true;
            }
        }
        catch (ClassNotFoundException | LinkageError throwable) {
            return false;
        }
        return false;
    }

    private static boolean hasExternalDeclaration(Class<?> clazz, String string, String string2, Set<String> set) {
        if (clazz == null || !set.add(clazz.getName().replace('.', '/'))) {
            return false;
        }
        for (Method genericDeclaration : clazz.getDeclaredMethods()) {
            int n = genericDeclaration.getModifiers();
            if (Modifier.isPrivate(n) || Modifier.isStatic(n) || !string.equals(genericDeclaration.getName()) || !OverrideGuardRuntime.sameParameters(string2, OverrideGuardRuntime.descriptor(genericDeclaration))) continue;
            return true;
        }
        if (OverrideGuardRuntime.hasExternalDeclaration(clazz.getSuperclass(), string, string2, set)) {
            return true;
        }
        for (GenericDeclaration genericDeclaration : clazz.getInterfaces()) {
            if (!OverrideGuardRuntime.hasExternalDeclaration(genericDeclaration, string, string2, set)) continue;
            return true;
        }
        return false;
    }

    private static String descriptor(Method method) {
        StringBuilder stringBuilder = new StringBuilder("(");
        for (Class<?> clazz : method.getParameterTypes()) {
            OverrideGuardRuntime.appendDescriptor(stringBuilder, clazz);
        }
        stringBuilder.append(')');
        OverrideGuardRuntime.appendDescriptor(stringBuilder, method.getReturnType());
        return stringBuilder.toString();
    }

    private static void appendDescriptor(StringBuilder stringBuilder, Class<?> clazz) {
        if (clazz.isArray()) {
            stringBuilder.append(clazz.getName().replace('.', '/'));
        } else if (!clazz.isPrimitive()) {
            stringBuilder.append('L').append(clazz.getName().replace('.', '/')).append(';');
        } else if (clazz == Void.TYPE) {
            stringBuilder.append('V');
        } else if (clazz == Boolean.TYPE) {
            stringBuilder.append('Z');
        } else if (clazz == Byte.TYPE) {
            stringBuilder.append('B');
        } else if (clazz == Character.TYPE) {
            stringBuilder.append('C');
        } else if (clazz == Short.TYPE) {
            stringBuilder.append('S');
        } else if (clazz == Integer.TYPE) {
            stringBuilder.append('I');
        } else if (clazz == Long.TYPE) {
            stringBuilder.append('J');
        } else if (clazz == Float.TYPE) {
            stringBuilder.append('F');
        } else if (clazz == Double.TYPE) {
            stringBuilder.append('D');
        }
    }

    private static boolean hasExternalDeclaration(_v _v2, String string, String string2, Set<_v> set) {
        if (_v2 == null || !set.add(_v2)) {
            return false;
        }
        b1[] b1Array = _v2.A(0L);
        if (!_v2.G() && b1Array != null) {
            for (b1 b12 : b1Array) {
                if (b12 == null || !string.equals(b12.F) || !OverrideGuardRuntime.sameParameters(string2, b12.W)) continue;
                return true;
            }
        }
        if (OverrideGuardRuntime.hasExternalDeclaration(OverrideGuardRuntime.resolveType(_v2.c), string, string2, set)) {
            return true;
        }
        if (_v2.o != null) {
            for (b1 b12 : _v2.o) {
                if (!OverrideGuardRuntime.hasExternalDeclaration(OverrideGuardRuntime.resolveType((jv)b12), string, string2, set)) continue;
                return true;
            }
        }
        return false;
    }

    private static _v resolveType(jv jv2) {
        String string = OverrideGuardRuntime.referenceName(jv2);
        if (string == null) {
            return null;
        }
        l62 l622 = l62.t((String)string);
        return l622 == null ? null : l622.R();
    }

    private static String referenceName(jv jv2) {
        return jv2 instanceof jf ? ((jf)jv2).m.V() : null;
    }

    private static boolean sameParameters(String string, String string2) {
        if (string == null || string2 == null) {
            return false;
        }
        int n = string.indexOf(41);
        int n2 = string2.indexOf(41);
        return n >= 0 && n2 >= 0 && string.regionMatches(0, string2, 0, n + 1) && n == n2;
    }
}
