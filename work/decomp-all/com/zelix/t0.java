/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.br;
import com.zelix.e_;
import com.zelix.ea;
import com.zelix.lbc;
import com.zelix.lmi;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.qr;
import com.zelix.sh;
import com.zelix.td;
import com.zelix.tx;
import com.zelix.un;
import com.zelix.wa;
import com.zelix.yf;
import com.zelix.yn;
import java.awt.Frame;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JButton;

public abstract class t0
extends td {
    JButton g;
    private static final long v;
    private static final String[] L;
    private static final String[] V;
    private static final Map lb;
    private static final long sb;

    t0(String string, wa wa2, List list, long l, br br2, sh sh2, qr qr2, lqu lqu2, short s, e_ e_2, int n) {
        long l2 = (l << 16 | (long)s << 48 >>> 48) ^ v;
        long l3 = l2 ^ 0x4C257C32E18FL;
        super(string, wa2, l3, list, br2, sh2, qr2, lqu2, e_2, n);
    }

    /*
     * Loose catch block
     */
    final void h(Object[] objectArray) {
        Object object;
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        block10: {
            long l8;
            block11: {
                l7 = (Long)objectArray[0];
                long l9 = l7 = v ^ l7;
                l6 = l9 ^ 0x2D56F638B5D3L;
                l5 = l9 ^ 0x4BAE49710AAFL;
                l4 = l9 ^ 0x4411ABB48DDBL;
                l8 = l9 ^ 0x255A974BA955L;
                long l10 = l9 ^ 0x326ED204A18AL;
                l3 = l9 ^ 0x36DD86866C16L;
                long l11 = l9 ^ 0x6875CCB90B2FL;
                l2 = l9 ^ 0x72E86BA7947L;
                long l12 = l9 ^ 0x24D5F4BE284CL;
                l = l9 ^ 0x34A83C8513DCL;
                CallSite callSite3 = m44.a("j", (long)6489503281279347967L, (long)l7);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l12;
                m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)6498018537175796027L, (long)l7);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l11;
                callSite2 = m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)6635760012862648765L, (long)l7), (Object)objectArray3, (long)5087225614738521329L, (long)l7);
                CallSite callSite4 = callSite3;
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l10;
                callSite = m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)6371536586234127372L, (long)l7), (Object)objectArray4, (long)6866923468209426874L, (long)l7);
                if (callSite4 != null) break block10;
                try {
                    block12: {
                        if (callSite == false) break block11;
                        break block12;
                        catch (un un2) {
                            throw m44.a("j", (Object)((Object)un2), (long)6897900752954768403L, (long)l7);
                        }
                    }
                    new lbc((Frame)((Object)this), (String)((Object)t0.e("h", (int)2790, (long)(0x26889F3A20742FD1L ^ l7))), l4, (String)((Object)t0.e("h", (int)14913, (long)(0x21124434BD7D9F75L ^ l7))));
                    return;
                }
                catch (un un3) {
                    throw m44.a("j", (Object)((Object)un3), (long)6897900752954768403L, (long)l7);
                }
            }
            Object[] objectArray5 = new Object[1];
            objectArray5[0] = l8;
            callSite = m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)6371536586234127372L, (long)l7), (Object)objectArray5, (long)6748570565320977365L, (long)l7);
        }
        try {
            if (callSite == false) {
                new lbc((Frame)((Object)this), (String)((Object)t0.e("h", (int)7666, (long)(0x544EBCD8ABE238C7L ^ l7))), l4, (String)((Object)t0.e("h", (int)6105, (long)(0x242A0A45AC29B2EAL ^ l7))));
                return;
            }
        }
        catch (un un4) {
            throw m44.a("j", (Object)((Object)un4), (long)6897900752954768403L, (long)l7);
        }
        Vector<yn> vector = new Vector<yn>(1);
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = (int)sb;
        objectArray6[1] = callSite2;
        objectArray6[0] = l;
        CallSite callSite5 = m44.a("j", (Object)objectArray6, (long)5097386805376713596L, (long)l7);
        if (callSite5 != null) {
            object = null;
            try {
                Object[] objectArray7 = new Object[3];
                objectArray7[2] = m44.a("t", (Object)((Object)this), (long)6691629571924189287L, (long)l7);
                objectArray7[1] = callSite5;
                objectArray7[0] = l6;
                object = m44.a("j", (Object)objectArray7, (long)6715106275765429872L, (long)l7);
            }
            catch (un un5) {
                Object[] objectArray8 = new Object[2];
                objectArray8[1] = l5;
                objectArray8[0] = m44.a("u", (Object)((Object)un5), (long)5137046479509723728L, (long)l7);
                m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)6691629571924189287L, (long)l7), (Object)objectArray8, (long)6352219371879370942L, (long)l7);
                new lbc((Frame)((Object)this), (String)((Object)t0.e("h", (int)18057, (long)(0x6AA8F6A4784FE3BBL ^ l7))), l4, (String)((Object)t0.e("h", (int)22456, (long)(0x72A0C5911AE1F28EL ^ l7))));
                return;
            }
            vector.addElement((yn)object);
        }
        object = new yn((tx)this, l2, (lqu)m44.a("t", (Object)((Object)this), (long)6691629571924189287L, (long)l7));
        lmi lmi2 = new lmi(this);
        ea ea2 = new ea(this, vector, (yf)object, (e_)lmi2);
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l3;
        m44.a("u", (Object)((Object)this), (Object)objectArray9, (long)6756409041467863113L, (long)l7);
        m44.a("u", (Object)new Thread((Runnable)ea2), (long)6744888485021164804L, (long)l7);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    t0.v = prr.a((long)-553613909843277548L, (long)1509856279535503409L, MethodHandles.lookup().lookupClass()).a(17791046113712L);
                    t0.lb = new HashMap<K, V>(13);
                    var5 = t0.v ^ 116429826627059L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[6];
                    var12_4 = 0;
                    var11_5 = "\u00bc\u0002k{W\u00fe9\u00c9\u00e4Q\u00d9)\u00fd\u0093v\u00df\u00a3\u0018]\u0090\u00fc\u009b#\u0006N\u009fJ\u0010\u00f05\u00e5\u00f5\u009e\u00fe5T\u00a5\u00a4\u00ef\u00bax\u009e\u00cd\u0092\u00b1nS>\u000f\u000f\u00bc\u00ec\u00c4-\u00d1\u00dc \u008b\u009e;\u00bfd\u008f`\u0000\u00fa\u0098\u0084\u0080L\u00185[W\u00e7\u001e6\u00e3%\u0080\u000f~n\u00c1\u0015\u00d4\\[\u001a\u009d\u00fda\u00d3v\u009d\u00c9@{\u008c%\u000f\u00ecnJ\u00f2\u008e\u0011\u009f\u00be\u008afz\u00d3\u0095\u0099\u00d9\u00a3puukaY\ty\u00d5\u00a9,\u00f4_\u0011\u00d9\u001f\u00efa\u0000\u00bc\u00a9\u00ea\u00e2\u000e\n<\u00d8\u00c1\u00fd0\u00e4\u00f6\u00d1\u00f5r\u00cf)\u00a9\u0013\u0092t\u00d6\u00fd\u00118\u00e8\u008e\u00a9\u00ab\u00fa5\u00a9>\u0007\u0087-Jzx~\u00a4~\u00d1K|$\u0010\u008e/\f\u000b\u00eeA~\u00fdu\u0003Hi\u001f\u00ef\u001d\u00af\u00d6\n\u00b3\u00be*\u00ceS\u0096\u0080p\u00d2;\u00f1\u0092\u001f^\u00cf \u0080\u008d/\u0010\u0014t\u00eb\u001c\u0088\u001a\u00a1W\u00fb\u00a4\u00c4\u007f\u00c9\u00aaE\u00d0\u00d2\u00e74Q\u00cb7\u00b3,*O\u00d6\u00b9\u008c'\u0097\u00d5\u0083@-\u0099\u0083\u00e5\u00f3s\u009a2\u00ac\u008b\u00a2\u009a\u00ed\u0001\u00d4l\u0097$\u00f09\u00bcuGBI\u009e$q\u0014\u00c6\u0095\u0001\u0094 ;\u00e9*\u00ee0Q(u\u0095n\r\r\u0091Y\u00ee\u0014\u00cb\nY\u0082>\u0011\u0095\u00bf\u000e\u000eqr;\u00d9\u0003\u0080cA\u00d23\u00b3\u00abY\u009eX\u0093\fg\u00ed\u0090\b\u00fe\u00ab-\u001b6\u00ec\u0004\u00e3|F";
                    var13_6 = "\u00bc\u0002k{W\u00fe9\u00c9\u00e4Q\u00d9)\u00fd\u0093v\u00df\u00a3\u0018]\u0090\u00fc\u009b#\u0006N\u009fJ\u0010\u00f05\u00e5\u00f5\u009e\u00fe5T\u00a5\u00a4\u00ef\u00bax\u009e\u00cd\u0092\u00b1nS>\u000f\u000f\u00bc\u00ec\u00c4-\u00d1\u00dc \u008b\u009e;\u00bfd\u008f`\u0000\u00fa\u0098\u0084\u0080L\u00185[W\u00e7\u001e6\u00e3%\u0080\u000f~n\u00c1\u0015\u00d4\\[\u001a\u009d\u00fda\u00d3v\u009d\u00c9@{\u008c%\u000f\u00ecnJ\u00f2\u008e\u0011\u009f\u00be\u008afz\u00d3\u0095\u0099\u00d9\u00a3puukaY\ty\u00d5\u00a9,\u00f4_\u0011\u00d9\u001f\u00efa\u0000\u00bc\u00a9\u00ea\u00e2\u000e\n<\u00d8\u00c1\u00fd0\u00e4\u00f6\u00d1\u00f5r\u00cf)\u00a9\u0013\u0092t\u00d6\u00fd\u00118\u00e8\u008e\u00a9\u00ab\u00fa5\u00a9>\u0007\u0087-Jzx~\u00a4~\u00d1K|$\u0010\u008e/\f\u000b\u00eeA~\u00fdu\u0003Hi\u001f\u00ef\u001d\u00af\u00d6\n\u00b3\u00be*\u00ceS\u0096\u0080p\u00d2;\u00f1\u0092\u001f^\u00cf \u0080\u008d/\u0010\u0014t\u00eb\u001c\u0088\u001a\u00a1W\u00fb\u00a4\u00c4\u007f\u00c9\u00aaE\u00d0\u00d2\u00e74Q\u00cb7\u00b3,*O\u00d6\u00b9\u008c'\u0097\u00d5\u0083@-\u0099\u0083\u00e5\u00f3s\u009a2\u00ac\u008b\u00a2\u009a\u00ed\u0001\u00d4l\u0097$\u00f09\u00bcuGBI\u009e$q\u0014\u00c6\u0095\u0001\u0094 ;\u00e9*\u00ee0Q(u\u0095n\r\r\u0091Y\u00ee\u0014\u00cb\nY\u0082>\u0011\u0095\u00bf\u000e\u000eqr;\u00d9\u0003\u0080cA\u00d23\u00b3\u00abY\u009eX\u0093\fg\u00ed\u0090\b\u00fe\u00ab-\u001b6\u00ec\u0004\u00e3|F".length();
                    var10_7 = 40;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = t0.e(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u00a0kx\u00a7Tw\u0014\u007fn5:\u00aa?(-\u009a\u00ff\u00bdE\u00af\u00e4\u00b7\u00f4>?4\b\u00ef\u00ed8\u0010\u009e\u00d6\u00aa\u000b,\u0088\u00d5\u00ee\u00c34\u00b2\u00a5\u00b7\u00f5\u00b8]\u0019\u001d$\u00c7\n\u007fH\u0013dC\u0080P\u00b2tR\u00f1t\u0010\u0080^\u0094\u00b1\u00e0\u00b7\u00a5q\u0096\u00c3\u009eM\u00ff\u000b.\u00bc\u00cd\fn\u00a1?f\u0015\u00caM\u00f4\u00b8B\u00f6/I\u00a6`\u00b1\u00b0\u00b6L\u009cP)\u00ea\u00d6\u00b8:\n1(\u0092\u00a6\u00dd\u0086\u0080\u0091\u00d66\u008f\u00df\u00d0\u00f0D\u001d>\b\u00b50\u000e\u00f9\u000b\u00e2\u00f0\u00f7\u00b4\u00bc~|(q\u00dbS\u00ea\u00c8D.U\u0083\u008dq\u009b\u00cfx\u00e3\u00858\u00cdn\u001a\u00f7\u0016\u0018\u0095X\u00b4@\u0010\u00c6\u00ae\u00eb!\u00e3\u000e\u00ceEGu-\u00a4F7\u00ef\u00e7";
                        var13_6 = "\u00a0kx\u00a7Tw\u0014\u007fn5:\u00aa?(-\u009a\u00ff\u00bdE\u00af\u00e4\u00b7\u00f4>?4\b\u00ef\u00ed8\u0010\u009e\u00d6\u00aa\u000b,\u0088\u00d5\u00ee\u00c34\u00b2\u00a5\u00b7\u00f5\u00b8]\u0019\u001d$\u00c7\n\u007fH\u0013dC\u0080P\u00b2tR\u00f1t\u0010\u0080^\u0094\u00b1\u00e0\u00b7\u00a5q\u0096\u00c3\u009eM\u00ff\u000b.\u00bc\u00cd\fn\u00a1?f\u0015\u00caM\u00f4\u00b8B\u00f6/I\u00a6`\u00b1\u00b0\u00b6L\u009cP)\u00ea\u00d6\u00b8:\n1(\u0092\u00a6\u00dd\u0086\u0080\u0091\u00d66\u008f\u00df\u00d0\u00f0D\u001d>\b\u00b50\u000e\u00f9\u000b\u00e2\u00f0\u00f7\u00b4\u00bc~|(q\u00dbS\u00ea\u00c8D.U\u0083\u008dq\u009b\u00cfx\u00e3\u00858\u00cdn\u001a\u00f7\u0016\u0018\u0095X\u00b4@\u0010\u00c6\u00ae\u00eb!\u00e3\u000e\u00ceEGu-\u00a4F7\u00ef\u00e7".length();
                        var10_7 = 168;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = t0.e(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            t0.L = var14_3;
            t0.V = new String[6];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 6855004933851736506L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        t0.sb = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static un a(un un2) {
        return un2;
    }

    private static String e(byte[] byArray) {
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

    private static String e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x76B2;
        if (V[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])lb.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/t0", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = L[n2].getBytes("ISO-8859-1");
            t0.V[n2] = t0.e(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return V[n2];
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = t0.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/t0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(t0.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
