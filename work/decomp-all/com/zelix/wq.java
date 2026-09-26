/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cd;
import com.zelix.cx;
import com.zelix.e_;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sn;
import com.zelix.wm;
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
import javax.swing.JFrame;

public class wq
extends wm {
    cx B;
    cd a;
    private static final long c;
    private static final String[] g;
    private static final String[] h;
    private static final Map l;

    void M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x41AC19A5F305L;
        long l4 = l2 ^ 0x6BEC66AF91EEL;
        long l5 = l2 ^ 0x77860B03681EL;
        m44.a("w", (Object)((Object)this), (cd)new cd((JFrame)((Object)this), (sn)m44.a("u", (Object)((Object)this), (long)-6037544844648994508L, (long)l), l5, false, (int)m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l)), (long)-5603121970401781071L, (long)l);
        m44.a("w", (Object)((Object)this), (cx)new cx((JFrame)((Object)this), (sn)m44.a("u", (Object)((Object)this), (long)-6037544844648994508L, (long)l), l4, (int)m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l)), (long)-5545680165530206469L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = wq.c("d", (int)17462, (long)(0x6E10EE7B23113C26L ^ l));
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)wq.c("d", (int)30930, (long)(0x4C1C866CA65580C1L ^ l)), null, (Object)m44.a("u", (Object)((Object)this), (long)-5603121970401781071L, (long)l), (Object)m44.a("k", (Object)objectArray2, (long)-5196677285636477633L, (long)l), (long)-5614158834116553654L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = wq.c("d", (int)14667, (long)(0x14C13EC98AF6C15AL ^ l));
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)wq.c("d", (int)28953, (long)(0x6B3972B96C80890CL ^ l)), null, (Object)m44.a("u", (Object)((Object)this), (long)-5545680165530206469L, (long)l), (Object)m44.a("k", (Object)objectArray3, (long)-5196677285636477633L, (long)l), (long)-5614158834116553654L, (long)l);
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)m44.a("u", (Object)((Object)this), (long)-5545680165530206469L, (long)l), (long)-5285646393501745479L, (long)l);
    }

    public wq(JFrame jFrame, byte by, long l, String string, sn sn2, int n, e_ e_2) {
        long l2 = ((long)by << 56 | l << 8 >>> 8) ^ c;
        long l3 = l2 ^ 0x109E7345109CL;
        super(jFrame, string, sn2, n, l3, e_2);
    }

    protected final void Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7C444B220507L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = wq.c("d", (int)29779, (long)(0x546423BB9D3ECFCFL ^ l));
        objectArray2[0] = l2;
        m44.a("m", (Object)objectArray2, (long)8157000709015404428L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                wq.c = prr.a((long)-152447808980976458L, (long)-7888926525138312843L, MethodHandles.lookup().lookupClass()).a(237161319405023L);
                wq.l = new HashMap<K, V>(13);
                var0 = wq.c ^ 132100580528295L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u0006\u0005\u00f7\u00daQ\u00b1W9f\u00a7\u007f4P\u0086\u00f3\u00ee\u00f0q\u00e7\u00f3/?\u000e$v\u00fcj#\u009b\u00c9\u00b5*\u0097k\u009bP\u00cf\u001b\u00edL\u00a9NP\u00de\u00c9\u00dd\u00dcP@j\u000b\u008b\u001b\u00bf\u0004\\o\u00ccTUG\u0002q\u00bd\r\u00037]F\u00e1\u00e6\u008d\u00e2\u00b1\u00bf\u0000=[\u00ad\u009dY3\u009d?.\u00ae\u0084({N.\u0097W\u00b4\u0007\u00a0\u00df:\u00c2:\u00a7\u0083\u0080F|\u00ddH\u0082\u00d4\u0089\u00efV*(\u00eb\u00fb\u00af\u00aa2J\r\u009a$=cfJ\u00a9B5\u0088\u0098\\\u008e\u00c3\u00e8\u00e9\u00b9z\u008e\u0097\u0093\u00cf\u00bc\u00e3F\u00afT\u00eb\u0004\r0\u00af\u00da";
                var8_6 = "\u0006\u0005\u00f7\u00daQ\u00b1W9f\u00a7\u007f4P\u0086\u00f3\u00ee\u00f0q\u00e7\u00f3/?\u000e$v\u00fcj#\u009b\u00c9\u00b5*\u0097k\u009bP\u00cf\u001b\u00edL\u00a9NP\u00de\u00c9\u00dd\u00dcP@j\u000b\u008b\u001b\u00bf\u0004\\o\u00ccTUG\u0002q\u00bd\r\u00037]F\u00e1\u00e6\u008d\u00e2\u00b1\u00bf\u0000=[\u00ad\u009dY3\u009d?.\u00ae\u0084({N.\u0097W\u00b4\u0007\u00a0\u00df:\u00c2:\u00a7\u0083\u0080F|\u00ddH\u0082\u00d4\u0089\u00efV*(\u00eb\u00fb\u00af\u00aa2J\r\u009a$=cfJ\u00a9B5\u0088\u0098\\\u008e\u00c3\u00e8\u00e9\u00b9z\u008e\u0097\u0093\u00cf\u00bc\u00e3F\u00afT\u00eb\u0004\r0\u00af\u00da".length();
                var5_7 = 48;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = wq.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\b\u00cc\u00ac:\u009e\u0007s\u0095\u0012\u00edS\u00c1ZD\u0083i\u0010\u00ef\u00d1+\u00fc&\u00fb&585\u00d9D\u00ec\u00d3\u00a9\u00cb";
                    var8_6 = "\b\u00cc\u00ac:\u009e\u0007s\u0095\u0012\u00edS\u00c1ZD\u0083i\u0010\u00ef\u00d1+\u00fc&\u00fb&585\u00d9D\u00ec\u00d3\u00a9\u00cb".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = wq.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        wq.g = var9_3;
        wq.h = new String[5];
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

    private static String c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5A4D;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])wq.l.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    wq.l.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/wq", exception);
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
            wq.h[n2] = wq.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = wq.c(n, l);
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
            throw new RuntimeException("com/zelix/wq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wq.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
