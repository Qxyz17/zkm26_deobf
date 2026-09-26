/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lpc;
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

public class lpx
extends lpc {
    private static final long e = prr.a((long)-425283127850525088L, (long)-2629790465355859635L, MethodHandles.lookup().lookupClass()).a(76433988290066L);
    private static final String[] k;
    private static final String[] n;
    private static final Map o;

    public lpx(long l, int n) {
        long l2 = (l = e ^ l) ^ 0x7DC4D400E7L;
        super(l2, n);
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
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l)) + (String)((Object)lpx.b("s", (int)4423, (long)(0x7983E5B34676285BL ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lpx.b("s", (int)1576, (long)(0x4F2031C25ED2F01AL ^ l));
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x4AE27A5DBE0FL;
        long l4 = l2 ^ 0x3E0224440141L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l3;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6542494940040753976L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpx.b("s", (int)31297, (long)(0x1AD65B077AB4CA3FL ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l4;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new HashMap(13);
        long l = e ^ 0x5B203C8B9CD1L;
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
        String string = "\u00fc\u00e6\u00ec8\u00822\u0004\u00b0K\u00e7d\u001e\u009a\u0012t\u00c8O\u00e1\u00ec\u00b5\u00e6\u00d1\u00c8PO\u00a3\u00c5\u0080\nP\u009c{\u00ef\u0094G\u0014#s\u00a0\u0083\u0094ms\u0085\u0089\u0088\u009c\u00c5|\u00e8f\u00c3\r\u0085<j0ba\u00bf\n\u00a5$\u00e4a\u0095m\u0084W\u009e Q\u00e5\u0083\u00b6\u00b6\u00f6\u00db\u0004A\u0018\u0017ei\u00d9\u00a1\u00cb)\u0015?\u00b7\u00b2\u00eaf\u0093\u00e0\u0003\u008c\u00b6\u0091\u0096\u00e7\u00f5\u0010\u00060!\u00bdF\u0085+64\u00cd\u008e\u0092\u0019_)T;s\u00b5\u00db]\u0019b{\u00b6\u00a05\u00c4w\u0099&V\u00d74@7BD\u00aa\u00fa\u00e3\u00bb>1\u0012/\u0001\u00c0[+";
        int n2 = "\u00fc\u00e6\u00ec8\u00822\u0004\u00b0K\u00e7d\u001e\u009a\u0012t\u00c8O\u00e1\u00ec\u00b5\u00e6\u00d1\u00c8PO\u00a3\u00c5\u0080\nP\u009c{\u00ef\u0094G\u0014#s\u00a0\u0083\u0094ms\u0085\u0089\u0088\u009c\u00c5|\u00e8f\u00c3\r\u0085<j0ba\u00bf\n\u00a5$\u00e4a\u0095m\u0084W\u009e Q\u00e5\u0083\u00b6\u00b6\u00f6\u00db\u0004A\u0018\u0017ei\u00d9\u00a1\u00cb)\u0015?\u00b7\u00b2\u00eaf\u0093\u00e0\u0003\u008c\u00b6\u0091\u0096\u00e7\u00f5\u0010\u00060!\u00bdF\u0085+64\u00cd\u008e\u0092\u0019_)T;s\u00b5\u00db]\u0019b{\u00b6\u00a05\u00c4w\u0099&V\u00d74@7BD\u00aa\u00fa\u00e3\u00bb>1\u0012/\u0001\u00c0[+".length();
        int n3 = 80;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lpx.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                k = stringArray;
                lpx.n = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x199D;
        if (lpx.n[n2] == null) {
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
                throw new RuntimeException("com/zelix/lpx", exception);
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
            lpx.n[n2] = lpx.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return lpx.n[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lpx.b(n, l);
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
            throw new RuntimeException("com/zelix/lpx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lpx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
