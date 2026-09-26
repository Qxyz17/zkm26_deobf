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

public class lpv
extends lpm {
    private static final long a = prr.a((long)9201785484628900460L, (long)7702299173624849620L, MethodHandles.lookup().lookupClass()).a(171954830702057L);
    private static final String[] k;
    private static final String[] n;
    private static final Map o;

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lpv.b("j", (int)15643, (long)(0x53E7B15D3EA7BB91L ^ l));
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3E0224440141L;
        long l4 = l2 ^ 0x5A43B2B32D91L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = this;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-5079609363812642663L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpv.b("j", (int)24424, (long)(0x12790F2A43359FAEL ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    public lpv(char c, long l, int n) {
        long l2 = ((long)c << 48 | l << 16 >>> 16) ^ a;
        long l3 = l2 ^ 0xF76C8CB7075L;
        super(n, l3);
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
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l)) + (String)((Object)lpv.b("j", (int)24577, (long)(0xAD77EC20E0BA9A6L ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new HashMap(13);
        long l = a ^ 0x262664EC41F6L;
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
        String string = "/~\u00f8d\u00bb\u009a\u00ed+\u00b4\u00c8\u0094\u009d\u00931#\u00d6\u00b9v\u00f2z\u00b7\u0096M\u00f9\u00a7\f\u00a1\u0006*NZ/7\u00fc\u009ee\u0012\u00d5\u00ad\u00048\u00ca(91\u00cb\u00ebh\u00ac\u00f2\u0002F\u008b\n\u00b1\u00a1%\u00c0\u00c0\u0006\u0014=\u0098\u00dd\u008a\u00a5\u0016\u00ab\u008f\neX08\u0003\u001b\u00e3\u007fSH\u00af5\u00d7e\u00d0\u00ff\u00f1\u0001E\u00bb\u00a3\u00a9\u0083\u00b8\u001b\u00f6\u0010\u0003'\u00b3\u0000n\u00c0G,\u00b07\u009f\u00c4k]\u00ae\u0094\u00a8\u0004\u00d22\u00b7>\u00b3u \u001b\u00f3\u0005\u0081J\"x\r\u00bc\u0081MB\u00ec\u0000\u00e0O0\u001dD\u007f_\u008c\u00b8%\u009dl%tx5\u00e1\u0084";
        int n2 = "/~\u00f8d\u00bb\u009a\u00ed+\u00b4\u00c8\u0094\u009d\u00931#\u00d6\u00b9v\u00f2z\u00b7\u0096M\u00f9\u00a7\f\u00a1\u0006*NZ/7\u00fc\u009ee\u0012\u00d5\u00ad\u00048\u00ca(91\u00cb\u00ebh\u00ac\u00f2\u0002F\u008b\n\u00b1\u00a1%\u00c0\u00c0\u0006\u0014=\u0098\u00dd\u008a\u00a5\u0016\u00ab\u008f\neX08\u0003\u001b\u00e3\u007fSH\u00af5\u00d7e\u00d0\u00ff\u00f1\u0001E\u00bb\u00a3\u00a9\u0083\u00b8\u001b\u00f6\u0010\u0003'\u00b3\u0000n\u00c0G,\u00b07\u009f\u00c4k]\u00ae\u0094\u00a8\u0004\u00d22\u00b7>\u00b3u \u001b\u00f3\u0005\u0081J\"x\r\u00bc\u0081MB\u00ec\u0000\u00e0O0\u001dD\u007f_\u008c\u00b8%\u009dl%tx5\u00e1\u0084".length();
        int n3 = 72;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lpv.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                k = stringArray;
                lpv.n = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6926;
        if (lpv.n[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])o.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lpv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n2].getBytes("ISO-8859-1");
            lpv.n[n2] = lpv.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return lpv.n[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lpv.b(n, l);
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
            throw new RuntimeException("com/zelix/lpv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lpv.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
