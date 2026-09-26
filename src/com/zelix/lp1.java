/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lpr;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import java.io.PrintWriter;
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

public class lp1
extends lpr {
    private static final long e = prr.a((long)-5886755443158434392L, (long)-9019451485427142046L, MethodHandles.lookup().lookupClass()).a(270666434245206L);
    private static final String[] p;
    private static final String[] q;
    private static final Map s;

    public lp1(long l, int n) {
        long l2 = (l = e ^ l) ^ 0x2D78EE13ECDFL;
        super(l2, n);
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3E0224440141L;
        long l4 = l2 ^ 0x3CE819B97D22L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l4;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6465574177801714999L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lp1.c("r", (int)20817, (long)(0x117ECBA95EFC5CEL ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lp1.c("r", (int)31532, (long)(0x53BA13A96E51A9FFL ^ l));
    }

    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x6DF7BA9051C2L;
        long l4 = l2 ^ 0x550B0FC6572DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray2, (long)3638594277050117288L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l)) + (String)((Object)lp1.c("r", (int)8499, (long)(0x1D740B5F95CABCCEL ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        s = new HashMap(13);
        long l = e ^ 0xB7355F6AEA2L;
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
        String string = "|`L\u00cd\u0084\u00f6Z\u0090\u00ee)\u00c6\u00b44\u0087z\u000f\u00b22\u008b\u0007\u001f\u008fS'js\u00d35\u00c2\u00bfG\u00e1\u0004+\u001f&\u00a9%'8\u00c9m\u00d4\u00f2\u0099<]z\u0084P\u008e\u00dd\u00cc=@&d\u00b7\u0099\u00d5\u0092,W\u0000W\u0002?'\u00e4[\u00c1\u00a67\u0017T\u0098\u008b\u00b8l\u00f6\u009ao\u00f65\u0007\u0001\u0017\u0004 i|\u00f9\u00ddb\u00f8m$C\fr\\D\u001d\f\u0007\u0018\u00bd\u00c79\u00b4\u0018!U_\u00a8U\u00bfQ)'\u00b0@\u00dd\u00b5-x\u00b4\u001e,\u00f4\r\u00fc\u00fb\u00bb\u00d6p\u00c6\u00dc\u0013\\\u00bdx\u0006\u00f5\\\u0016\u0019-\u00d0\u00eb\u00dc\u00dfA!\u00af\u00c6\u00aa\u00d6\u0085\u00db\u00d1$\u00f1\u00f8h\u00ac\u001ebZ;\u00d2\r\u009fz\u00d4\u0014\u00e2\u000b\u00e8\u008akd\u00fa986";
        int n2 = "|`L\u00cd\u0084\u00f6Z\u0090\u00ee)\u00c6\u00b44\u0087z\u000f\u00b22\u008b\u0007\u001f\u008fS'js\u00d35\u00c2\u00bfG\u00e1\u0004+\u001f&\u00a9%'8\u00c9m\u00d4\u00f2\u0099<]z\u0084P\u008e\u00dd\u00cc=@&d\u00b7\u0099\u00d5\u0092,W\u0000W\u0002?'\u00e4[\u00c1\u00a67\u0017T\u0098\u008b\u00b8l\u00f6\u009ao\u00f65\u0007\u0001\u0017\u0004 i|\u00f9\u00ddb\u00f8m$C\fr\\D\u001d\f\u0007\u0018\u00bd\u00c79\u00b4\u0018!U_\u00a8U\u00bfQ)'\u00b0@\u00dd\u00b5-x\u00b4\u001e,\u00f4\r\u00fc\u00fb\u00bb\u00d6p\u00c6\u00dc\u0013\\\u00bdx\u0006\u00f5\\\u0016\u0019-\u00d0\u00eb\u00dc\u00dfA!\u00af\u00c6\u00aa\u00d6\u0085\u00db\u00d1$\u00f1\u00f8h\u00ac\u001ebZ;\u00d2\r\u009fz\u00d4\u0014\u00e2\u000b\u00e8\u008akd\u00fa986".length();
        int n3 = 88;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lp1.d(byArray3).intern();
            if ((n4 += n3) >= n2) {
                p = stringArray;
                q = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String d(byte[] byArray) {
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

    private static String c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3D7C;
        if (q[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])s.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    s.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lp1", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = p[n2].getBytes("ISO-8859-1");
            lp1.q[n2] = lp1.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return q[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lp1.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lp1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lp1.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
