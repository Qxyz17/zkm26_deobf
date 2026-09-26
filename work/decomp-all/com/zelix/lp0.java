/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lpm;
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

public class lp0
extends lpm {
    private static final long a = prr.a((long)-7658209953280912901L, (long)4501797481658398472L, MethodHandles.lookup().lookupClass()).a(174457838147177L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3E0224440141L;
        long l4 = l2 ^ 0x7CAD96848953L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = this;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6447368269992508806L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lp0.b("g", (int)818, (long)(0x1EE0F53D84B86950L ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lp0.b("g", (int)31352, (long)(0x3379121359D05657L ^ l));
    }

    public lp0(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x3F2A88EA0B7EL;
        super(n, l2);
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
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l)) + (String)((Object)lp0.b("g", (int)26497, (long)(0x26051FDD2FB40483L ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l = a ^ 0x7C9236A8C623L;
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
        String string = "8X\u00f06\u0095G\u001dy\u00c6\u0082\u0088\u00aa\u008e8g\u00b8\u001b09x\u00f3\u0014\u001b#\u00f7\u00ae\u00906\u00b1\u00823q E7\u00a8jq\u0002\u0094e\u0011[X~\u0002\u000b\u00ac\u001d\u009e\u0015\u00d3\u00c1&9\u00baX\u00d3\u00db\u0093\u00db7{\u0097\u00b9\u00e6^\u00e16\u00f6\u0016\u00cd\u00e8\u008e\u00ce\u00e1v\u0089\u0096\u0098\u00f1\u00c3\u0003\u00f1\u00c2\u0092!\u00b7[Z\u00c4\u0005\u00fb\u00e7Bn\u00d3\u0018\u001b\\\u00a2\u00ccg\u00e2\u00b3Iw\u00ca\u00acP\u00e7\u008a\u00ebQ\u009b\u00f5v\u00f70I\fd\u008bu\u0094\u0090\u00a4\u0080\u00fes\u00c2\u00af\u00fdU\u00cb\u00e5|\b\u00ca\u009e\u00b7X\u00cd$\u00bb \u0096\u00ec!\u00fc\u000f\u001c\u00e1\u00cf\u00ab\u00f1\u00fa\u001a\u0004\u009e2\u00a3<\n\u00fd\u00b15\u00c0\u00cfWI2\b\u00aa\u008e|_\u00ea";
        int n2 = "8X\u00f06\u0095G\u001dy\u00c6\u0082\u0088\u00aa\u008e8g\u00b8\u001b09x\u00f3\u0014\u001b#\u00f7\u00ae\u00906\u00b1\u00823q E7\u00a8jq\u0002\u0094e\u0011[X~\u0002\u000b\u00ac\u001d\u009e\u0015\u00d3\u00c1&9\u00baX\u00d3\u00db\u0093\u00db7{\u0097\u00b9\u00e6^\u00e16\u00f6\u0016\u00cd\u00e8\u008e\u00ce\u00e1v\u0089\u0096\u0098\u00f1\u00c3\u0003\u00f1\u00c2\u0092!\u00b7[Z\u00c4\u0005\u00fb\u00e7Bn\u00d3\u0018\u001b\\\u00a2\u00ccg\u00e2\u00b3Iw\u00ca\u00acP\u00e7\u008a\u00ebQ\u009b\u00f5v\u00f70I\fd\u008bu\u0094\u0090\u00a4\u0080\u00fes\u00c2\u00af\u00fdU\u00cb\u00e5|\b\u00ca\u009e\u00b7X\u00cd$\u00bb \u0096\u00ec!\u00fc\u000f\u001c\u00e1\u00cf\u00ab\u00f1\u00fa\u001a\u0004\u009e2\u00a3<\n\u00fd\u00b15\u00c0\u00cfWI2\b\u00aa\u008e|_\u00ea".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lp0.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                e = stringArray;
                k = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4382;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])lp0.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lp0.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lp0", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            lp0.k[n2] = lp0.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lp0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lp0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lp0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
