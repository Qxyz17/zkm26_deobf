/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.c5;
import com.zelix.cd;
import com.zelix.ce;
import com.zelix.cs;
import com.zelix.e_;
import com.zelix.m44;
import com.zelix.n9;
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

public class wk
extends wm {
    c5 Z;
    cd v;
    ce Y;
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    void M(Object[] objectArray) {
        boolean bl;
        CallSite callSite;
        wk wk2;
        cd cd2;
        cd cd3;
        wk wk3;
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x41AC19A5F305L;
        long l4 = l2 ^ 0x77860B03681EL;
        long l5 = l2 ^ 0xA58B8243141L;
        long l6 = l2 ^ 0x593EA8CC3308L;
        try {
            cd cd4;
            wk3 = this;
            cd3 = cd4;
            cd2 = cd4;
            wk2 = this;
            callSite = m44.a("u", (Object)((Object)this), (long)-6037544844648994508L, (long)l);
            bl = m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l) == true;
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)((Object)n92), (long)-5804788983527049307L, (long)l);
        }
        cd3((JFrame)((Object)wk2), (sn)callSite, l4, bl, (int)m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l));
        m44.a("w", (Object)((Object)wk3), (cd)cd2, (long)-6220425087720653156L, (long)l);
        CallSite callSite2 = m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l);
        boolean bl2 = m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l) != 3;
        CallSite callSite3 = m44.a("u", (Object)((Object)this), (long)-6037544844648994508L, (long)l);
        wk wk4 = this;
        m44.a("w", (Object)((Object)this), (ce)new cs(l5, (JFrame)((Object)wk4), (sn)callSite3, bl2, (int)callSite2), (long)-5627293758417280393L, (long)l);
        m44.a("w", (Object)((Object)this), (c5)new c5(l6, (JFrame)((Object)this), (sn)m44.a("u", (Object)((Object)this), (long)-6037544844648994508L, (long)l), (int)m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l)), (long)-6261975644024977837L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = wk.c("i", (int)1508, (long)(0x3150AFB2EEE988A5L ^ l));
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)wk.c("i", (int)11789, (long)(0x381C2763FEE3A347L ^ l)), null, (Object)m44.a("u", (Object)((Object)this), (long)-6220425087720653156L, (long)l), (Object)m44.a("k", (Object)objectArray2, (long)-5196677285636477633L, (long)l), (long)-5614158834116553654L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = wk.c("i", (int)18976, (long)(0x49FCEB861ED4476FL ^ l));
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)wk.c("i", (int)5817, (long)(0x606913F15C321BF1L ^ l)), null, (Object)m44.a("u", (Object)((Object)this), (long)-5627293758417280393L, (long)l), (Object)m44.a("k", (Object)objectArray3, (long)-5196677285636477633L, (long)l), (long)-5614158834116553654L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l3;
        objectArray4[0] = wk.c("i", (int)11604, (long)(0xB4674C39FBBA019L ^ l));
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)wk.c("i", (int)2933, (long)(0x1996080268050639L ^ l)), null, (Object)m44.a("u", (Object)((Object)this), (long)-6261975644024977837L, (long)l), (Object)m44.a("k", (Object)objectArray4, (long)-5196677285636477633L, (long)l), (long)-5614158834116553654L, (long)l);
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)m44.a("u", (Object)((Object)this), (long)-6261975644024977837L, (long)l), (long)-5285646393501745479L, (long)l);
    }

    public wk(JFrame jFrame, String string, long l, sn sn2, int n, e_ e_2) {
        long l2 = (l = a ^ l) ^ 0x2DE2B99FF7F9L;
        super(jFrame, string, sn2, n, l2, e_2);
    }

    protected final void Z(Object[] objectArray) {
        block17: {
            int n;
            CallSite callSite;
            long l;
            long l2;
            block18: {
                CallSite callSite2;
                block15: {
                    l2 = (Long)objectArray[0];
                    l = l2 ^ 0x7C444B220507L;
                    callSite2 = m44.a("m", (long)7518783055696240296L, (long)l2);
                    try {
                        block16: {
                            try {
                                try {
                                    callSite = m44.a("s", (Object)((Object)this), (long)8195950146899583349L, (long)l2);
                                    n = 1;
                                    if (callSite2 != null) break block15;
                                    if (callSite != n) break block16;
                                }
                                catch (n9 n92) {
                                    throw m44.a("m", (Object)((Object)n92), (long)7854129549125497899L, (long)l2);
                                }
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = wk.c("i", (int)12675, (long)(0x7502ADCC4D3B7F43L ^ l2));
                                objectArray2[0] = l;
                                m44.a("m", (Object)objectArray2, (long)8157000709015404428L, (long)l2);
                                if (callSite2 == null) break block17;
                            }
                            catch (n9 n93) {
                                throw m44.a("m", (Object)((Object)n93), (long)7854129549125497899L, (long)l2);
                            }
                        }
                        callSite = m44.a("s", (Object)((Object)this), (long)8195950146899583349L, (long)l2);
                        n = 2;
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)((Object)n94), (long)7854129549125497899L, (long)l2);
                    }
                }
                try {
                    block19: {
                        try {
                            try {
                                if (l2 < 0L || callSite2 != null) break block18;
                                if (callSite != n) break block19;
                            }
                            catch (n9 n95) {
                                throw m44.a("m", (Object)((Object)n95), (long)7854129549125497899L, (long)l2);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = wk.c("i", (int)19428, (long)(0x669C8C4E69560521L ^ l2));
                            objectArray3[0] = l;
                            m44.a("m", (Object)objectArray3, (long)8157000709015404428L, (long)l2);
                            if (callSite2 == null) break block17;
                        }
                        catch (n9 n96) {
                            throw m44.a("m", (Object)((Object)n96), (long)7854129549125497899L, (long)l2);
                        }
                    }
                    callSite = m44.a("s", (Object)((Object)this), (long)8195950146899583349L, (long)l2);
                    n = 3;
                }
                catch (n9 n97) {
                    throw m44.a("m", (Object)((Object)n97), (long)7854129549125497899L, (long)l2);
                }
            }
            try {
                if (callSite == n) {
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = wk.c("i", (int)9809, (long)(0x26605A5980606896L ^ l2));
                    objectArray4[0] = l;
                    m44.a("m", (Object)objectArray4, (long)8157000709015404428L, (long)l2);
                }
            }
            catch (n9 n98) {
                throw m44.a("m", (Object)((Object)n98), (long)7854129549125497899L, (long)l2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                wk.a = prr.a((long)6987128614463052235L, (long)-3569997710344662634L, MethodHandles.lookup().lookupClass()).a(123012284179447L);
                wk.h = new HashMap<K, V>(13);
                var0 = wk.a ^ 98770025341981L;
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
                var9_3 = new String[9];
                var7_4 = 0;
                var6_5 = "\u00b5>\u0005\u00b9+\u00ff\u00aeBK\u00aa%5\u00d7\u00d6*\u0015(\u0007\u008bd\u00bfK\u00ac\u00fe 2\u00e2\u008e+-l\u00ef\u00f4\t\u00c3\u00beb\u00d8\u0082\u00be\b\u00d0\u00bd\u008d\u00ff\u00b4\u0003\u00bc#(M1&M\u00a1\u00f4\u00d7\u0018\u008e\u00d6\u00d4N\u0000\u00da\u00f5\u001a\u008d\u00df-\u0003\u00e3\u00d6\u000e\u0015+\u00ad\u00c7:\u00b3\u00c6\u0015\u00ef(K\u001e\u00a2\u007f\u0013\u00a7\u00a8\u00bbu\u0001(\u00ec8=^\u001e\u00b6%\u0089\u00ce5\u00bd\u00f2c`\u00d7cf\u00f9\u00fd=\u0005f\u00ec\\\u0094wNA\u00e70\u00a02\u00b8\u0006\u00ac\u009c8c\u0093\u00d5\u00d0\u00ce7u\u00de\u009a\u00f2\u0098\u00ab\u00fb\u00e9#D/4N5c\u008cL`\u00f1b\u00f0\u00a7\u00dc\u001c3\u0011\u0080\u00e3\u000b\u0007k\u0099{\u0000\u0083\u00101\u00c5^\u0000\u00ee\u0097\u00db\u000f\\\u00f7\u00ec\u00c91\u00db\u00d1Q8\u00e9\u000f\u00d0\u00e1t\u00c6\u009f\u00f7\u007f\u00f1\u00e6x\f\u00f66K\u00f0(0\u0006u\u0007\u00d3K`\u008c\u00ce9\u00e2\u00eee\r\u00d9=\u00ab\u00fb\u00c1E\u0092\n\u0088lr\u00a0ghF\u0006\u00d1\u0001\u0017\u00e2\u00a9/UD";
                var8_6 = "\u00b5>\u0005\u00b9+\u00ff\u00aeBK\u00aa%5\u00d7\u00d6*\u0015(\u0007\u008bd\u00bfK\u00ac\u00fe 2\u00e2\u008e+-l\u00ef\u00f4\t\u00c3\u00beb\u00d8\u0082\u00be\b\u00d0\u00bd\u008d\u00ff\u00b4\u0003\u00bc#(M1&M\u00a1\u00f4\u00d7\u0018\u008e\u00d6\u00d4N\u0000\u00da\u00f5\u001a\u008d\u00df-\u0003\u00e3\u00d6\u000e\u0015+\u00ad\u00c7:\u00b3\u00c6\u0015\u00ef(K\u001e\u00a2\u007f\u0013\u00a7\u00a8\u00bbu\u0001(\u00ec8=^\u001e\u00b6%\u0089\u00ce5\u00bd\u00f2c`\u00d7cf\u00f9\u00fd=\u0005f\u00ec\\\u0094wNA\u00e70\u00a02\u00b8\u0006\u00ac\u009c8c\u0093\u00d5\u00d0\u00ce7u\u00de\u009a\u00f2\u0098\u00ab\u00fb\u00e9#D/4N5c\u008cL`\u00f1b\u00f0\u00a7\u00dc\u001c3\u0011\u0080\u00e3\u000b\u0007k\u0099{\u0000\u0083\u00101\u00c5^\u0000\u00ee\u0097\u00db\u000f\\\u00f7\u00ec\u00c91\u00db\u00d1Q8\u00e9\u000f\u00d0\u00e1t\u00c6\u009f\u00f7\u007f\u00f1\u00e6x\f\u00f66K\u00f0(0\u0006u\u0007\u00d3K`\u008c\u00ce9\u00e2\u00eee\r\u00d9=\u00ab\u00fb\u00c1E\u0092\n\u0088lr\u00a0ghF\u0006\u00d1\u0001\u0017\u00e2\u00a9/UD".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = wk.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00a98\u00ae\u00f0\u008f\u000f\u00e4I\u00e6\u00a4\u00bcK\u00ed^,\u0082@\u00b9\u00f9\u00bf#\u00f4\u009f\u00a8\u00d3kRE\u00f6A@\u00b3<o[\u00b0aU\u00b6\"A\u008f\u0001\u00cc\u00ec\u00b3\u0096\u00e74\u00d9by\u0016\u00f2+\u00b1\u00d2a\u00df\u00c8\u0095!\u009cg\u0095VA\u0084N;\u00f5`\u00d6\u00ac\u00af\u00f8\u00eb{?x1";
                    var8_6 = "\u00a98\u00ae\u00f0\u008f\u000f\u00e4I\u00e6\u00a4\u00bcK\u00ed^,\u0082@\u00b9\u00f9\u00bf#\u00f4\u009f\u00a8\u00d3kRE\u00f6A@\u00b3<o[\u00b0aU\u00b6\"A\u008f\u0001\u00cc\u00ec\u00b3\u0096\u00e74\u00d9by\u0016\u00f2+\u00b1\u00d2a\u00df\u00c8\u0095!\u009cg\u0095VA\u0084N;\u00f5`\u00d6\u00ac\u00af\u00f8\u00eb{?x1".length();
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
                    var9_3[var7_4++] = wk.c(var10_9).intern();
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
        wk.c = var9_3;
        wk.g = new String[9];
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F15;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/wk", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            wk.g[n2] = wk.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = wk.c(n, l);
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
            throw new RuntimeException("com/zelix/wk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wk.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
