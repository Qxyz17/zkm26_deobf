/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.loe;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class loc {
    final String O;
    final String d;
    private static final long a = prr.a((long)3776413423838547959L, (long)727568118845547994L, MethodHandles.lookup().lookupClass()).a(3604165754982L);
    private static final String[] g;
    private static final String[] h;
    private static final Map j;

    public loc(long l, loc loc2) {
        l = a ^ l;
        this.O = loc2.v();
        this.d = m44.a("r", (Object)loc2, (Object)new Object[0], (long)-8959535601911929505L, (long)l);
    }

    public loc(String string, String string2) {
        this.O = string.intern();
        this.d = loe.B((String)string2).intern();
    }

    public boolean r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return this.O.equals(loc.a("o", (int)23457, (long)(0x6253EB4A5548B6D4L ^ l)));
    }

    public final String s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Map map = (Map)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x4C435E85787AL;
        return this.O + (String)((Object)m44.a("v", (Object)this, (Object)map, (long)l2, (long)4440134789142023142L, (long)l));
    }

    /*
     * Unable to fully structure code
     */
    public final String e(Object[] var1_1) {
        block8: {
            var2_2 = (Long)var1_1[0];
            var4_3 = (var2_2 = loc.a ^ var2_2) ^ 25446745810207L;
            v0 = new Object[2];
            v0[1] = this.d;
            v0[0] = var4_3;
            var7_4 = m44.a("k", (Object)v0, (long)6647279788961922622L, (long)var2_2);
            var8_5 = new StringBuilder();
            var9_6 = var7_4.size();
            var10_7 = 0;
            var6_8 = m44.a("k", (long)6402490747205400726L, (long)var2_2);
            while (var10_7 < var9_6) {
                block9: {
                    block10: {
                        block11: {
                            try {
                                try {
                                    try {
                                        if (var2_2 < 0L) ** GOTO lbl25
                                        v1 = var8_5;
                                        v2 = (String)var7_4.get(var10_7);
lbl22:
                                        // 2 sources

                                        while (true) {
                                            v3 = v1.append(v2);
                                            if (var6_8 != null) break block8;
lbl25:
                                            // 2 sources

                                            v4 = var6_8;
                                            if (var2_2 < 0L) break block9;
                                            if (v4 != null) break block10;
                                            break;
                                        }
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("k", (Object)v5, (long)6537275541738330380L, (long)var2_2);
                                    }
                                    if (var10_7 >= var9_6 - 1) break block11;
                                }
                                catch (n9 v6) {
                                    throw m44.a("k", (Object)v6, (long)6537275541738330380L, (long)var2_2);
                                }
                                var8_5.append((String)loc.a("o", (int)15893, (long)(8337319707459942570L ^ var2_2)));
                            }
                            catch (n9 v7) {
                                throw m44.a("k", (Object)v7, (long)6537275541738330380L, (long)var2_2);
                            }
                        }
                        ++var10_7;
                    }
                    v4 = var6_8;
                }
                if (v4 == null) continue;
            }
            v1 = new StringBuilder().append(this.O).append("(").append(var8_5.toString());
            v2 = ")";
            ** while (var2_2 <= 0L)
lbl49:
            // 1 sources

            v3 = v1.append(v2);
        }
        return v3.toString();
    }

    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return this.O.equals(loc.a("o", (int)20381, (long)(0x2202FF57DB5B12E4L ^ l)));
    }

    public final String C(Map map, long l) {
        long l2 = (l = a ^ l) ^ 0x3456A9B5ABA6L;
        return loe.p((String)this.d, (Map)map, (long)l2);
    }

    public final String v() {
        return this.O;
    }

    public final String m(Object[] objectArray) {
        return this.d;
    }

    public abstract String Q(Object[] var1);

    /*
     * Enabled aggressive block sorting
     */
    static {
        j = new HashMap(13);
        long l = a ^ 0x6F9C7EA01E8EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "U\u00a5\u0005\u000b\u0006\r\u00ce\u0090\u0017\u00d4@\u001a\u001c\u00c6\u00feR\u0010Yd\u00dbd\u00a4xc\u001e?\u00b9\u00fbn\u00058\u0098\u008e\u0018\u0001\u000br\u0019bw\u00b6\u009d\u00e8Ry\u0082\u00f2\u00ea\u00815\u00e8\u00aa\\q\u0011 \u00e1\u00bf";
        int n2 = "U\u00a5\u0005\u000b\u0006\r\u00ce\u0090\u0017\u00d4@\u001a\u001c\u00c6\u00feR\u0010Yd\u00dbd\u00a4xc\u001e?\u00b9\u00fbn\u00058\u0098\u008e\u0018\u0001\u000br\u0019bw\u00b6\u009d\u00e8Ry\u0082\u00f2\u00ea\u00815\u00e8\u00aa\\q\u0011 \u00e1\u00bf".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = loc.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                g = stringArray;
                h = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x156B;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])j.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/loc", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            loc.h[n2] = loc.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = loc.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/loc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(loc.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
