/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._p;
import com.zelix._u;
import com.zelix._x;
import com.zelix.ab;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.v8;
import com.zelix.xn;
import com.zelix.yf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class d6
extends xn {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public d6(String string, v8 v82, _p _p2, _p _p3, long l10, _x _x2, _u _u2, _6 _62, yf yf2) {
        long l11 = (l10 = a ^ l10) ^ 0x3D783C001D6CL;
        super(string, v82, _p2, l11, _p3, _x2, _u2, _62, yf2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void s(Object[] var1_1) {
        block32: {
            block30: {
                block28: {
                    block29: {
                        var2_2 = (String)var1_1[0];
                        var3_3 = (Long)var1_1[1];
                        var6_4 = (String)var1_1[2];
                        var5_5 = (List)var1_1[3];
                        v0 = var3_3;
                        var7_6 = v0 ^ 104523315588565L;
                        var9_7 = v0 ^ 102632066592988L;
                        var11_8 = v0 ^ 113040443675431L;
                        var13_9 = m44.a("k", (long)7372176884749954796L, (long)var3_3);
                        try {
                            try {
                                v1 = var6_4;
                                if (var13_9 == null) break block28;
                                if (v1 != null) break block29;
                            }
                            catch (n9 v2) {
                                throw m44.a("k", (Object)v2, (long)7316700293724979306L, (long)var3_3);
                            }
                            v3 = new Object[2];
                            v3[1] = var9_7;
                            v3[0] = var2_2;
                            throw new ab((String)d6.c("y", (int)5360, (long)(3298997737917398628L ^ var3_3)) + (String)m44.a("k", (Object)v3, (long)7069471435243001748L, (long)var3_3) + (String)d6.c("y", (int)11806, (long)(8390239487245649032L ^ var3_3)));
                        }
                        catch (n9 v4) {
                            throw m44.a("k", (Object)v4, (long)7316700293724979306L, (long)var3_3);
                        }
                    }
                    v1 = var6_4;
                }
                try {
                    block31: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var13_9 == null) break block30;
                                                            if (v1.equals(d6.c("y", (int)12063, (long)(6880865334330426755L ^ var3_3)))) break block31;
                                                        }
                                                        catch (n9 v5) {
                                                            throw m44.a("k", (Object)v5, (long)7316700293724979306L, (long)var3_3);
                                                        }
                                                        v1 = var6_4;
                                                        if (var13_9 == null) break block30;
                                                    }
                                                    catch (n9 v6) {
                                                        throw m44.a("k", (Object)v6, (long)7316700293724979306L, (long)var3_3);
                                                    }
                                                    if (var3_3 <= 0L) break block30;
                                                    if (v1.equals(d6.c("y", (int)16931, (long)(7614070986616465594L ^ var3_3)))) break block31;
                                                }
                                                catch (n9 v7) {
                                                    throw m44.a("k", (Object)v7, (long)7316700293724979306L, (long)var3_3);
                                                }
                                                v1 = var6_4;
                                                if (var13_9 == null) break block30;
                                            }
                                            catch (n9 v8) {
                                                throw m44.a("k", (Object)v8, (long)7316700293724979306L, (long)var3_3);
                                            }
                                            if (var3_3 < 0L) break block30;
                                            if (v1.equals(d6.c("y", (int)6429, (long)(7077451348444590984L ^ var3_3)))) break block31;
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("k", (Object)v9, (long)7316700293724979306L, (long)var3_3);
                                        }
                                        v1 = var6_4;
                                        if (var13_9 == null) break block30;
                                    }
                                    catch (n9 v10) {
                                        throw m44.a("k", (Object)v10, (long)7316700293724979306L, (long)var3_3);
                                    }
                                    if (var3_3 < 0L) break block30;
                                    if (v1.equals(d6.c("y", (int)8259, (long)(5904926200302799569L ^ var3_3)))) break block31;
                                }
                                catch (n9 v11) {
                                    throw m44.a("k", (Object)v11, (long)7316700293724979306L, (long)var3_3);
                                }
                                v12 = var6_4.equals(d6.c("y", (int)28392, (long)(8155860670704665717L ^ var3_3)));
                                if (var13_9 == null) break block32;
                            }
                            catch (n9 v13) {
                                throw m44.a("k", (Object)v13, (long)7316700293724979306L, (long)var3_3);
                            }
                            if (var3_3 <= 0L) break block32;
                            if (v12) {
                            }
                            ** GOTO lbl100
                        }
                        catch (n9 v14) {
                            throw m44.a("k", (Object)v14, (long)7316700293724979306L, (long)var3_3);
                        }
                    }
                    v15 = new Object[2];
                    v15[1] = var7_6;
                    v15[0] = var2_2;
                    v1 = m44.a("t", (Object)this, (Object)v15, (long)8945186266926800385L, (long)var3_3);
                }
                catch (n9 v16) {
                    throw m44.a("k", (Object)v16, (long)7316700293724979306L, (long)var3_3);
                }
            }
            var14_10 = v1;
            try {
                v12 = var5_5.add(var14_10);
                if (var3_3 < 0L || var13_9 != null) break block32;
lbl100:
                // 2 sources

                v17 = new Object[4];
                v17[3] = var11_8;
                v17[2] = true;
                v17[1] = var6_4;
                v17[0] = var2_2;
                v12 = var5_5.add(m44.a("t", (Object)this, (Object)v17, (long)7039753105076786999L, (long)var3_3));
            }
            catch (n9 v18) {
                throw m44.a("k", (Object)v18, (long)7316700293724979306L, (long)var3_3);
            }
        }
    }

    public d6(String string, long l10, _u _u2, _6 _62, yf yf2) {
        long l11 = (l10 = a ^ l10) ^ 0x7D1F8857551DL;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 48);
        int n12 = (int)(l11 << 48 >>> 48);
        super(n10, string, (char)n11, _u2, _62, yf2, (short)n12);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void v(Object[] var1_1) {
        block32: {
            block30: {
                block28: {
                    block29: {
                        var3_2 = (String)var1_1[0];
                        var6_3 = (Long)var1_1[1];
                        var2_4 = (String)var1_1[2];
                        var8_5 = (Map)var1_1[3];
                        var5_6 = (Map)var1_1[4];
                        var4_7 = (Map)var1_1[5];
                        var9_8 = (ol)var1_1[6];
                        v0 = var6_3;
                        var10_9 = v0 ^ 132873280967001L;
                        var12_10 = v0 ^ 80417151880124L;
                        var14_11 = v0 ^ 104092275631573L;
                        var16_12 = m44.a("n", (long)561294493437169513L, (long)var6_3);
                        try {
                            try {
                                v1 = var2_4;
                                if (var16_12 == null) break block28;
                                if (v1 != null) break block29;
                            }
                            catch (n9 v2) {
                                throw m44.a("n", (Object)v2, (long)292454329721299439L, (long)var6_3);
                            }
                            v3 = new Object[2];
                            v3[1] = var10_9;
                            v3[0] = var3_2;
                            throw new ab((String)d6.c("y", (int)6390, (long)(111836617669989344L ^ var6_3)) + (String)m44.a("n", (Object)v3, (long)260904624172004881L, (long)var6_3) + (String)d6.c("y", (int)18361, (long)(7109706561243385003L ^ var6_3)));
                        }
                        catch (n9 v4) {
                            throw m44.a("n", (Object)v4, (long)292454329721299439L, (long)var6_3);
                        }
                    }
                    v1 = (String)d6.c("y", (int)14073, (long)(538850935728143842L ^ var6_3)) + (String)m44.a("p", (Object)this, (long)434156953500189698L, (long)var6_3) + (String)d6.c("y", (int)25862, (long)(753313104178785810L ^ var6_3)) + var2_4 + (String)d6.c("y", (int)26657, (long)(5315767154249540414L ^ var6_3));
                }
                var17_13 = v1;
                try {
                    block31: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v5 = var2_4;
                                                            if (var16_12 == null) break block30;
                                                            if (v5.equals(d6.c("y", (int)8961, (long)(6117543731024554012L ^ var6_3)))) break block31;
                                                        }
                                                        catch (n9 v6) {
                                                            throw m44.a("n", (Object)v6, (long)292454329721299439L, (long)var6_3);
                                                        }
                                                        v5 = var2_4;
                                                        if (var16_12 == null) break block30;
                                                    }
                                                    catch (n9 v7) {
                                                        throw m44.a("n", (Object)v7, (long)292454329721299439L, (long)var6_3);
                                                    }
                                                    if (var6_3 < 0L) break block30;
                                                    if (v5.equals(d6.c("y", (int)28594, (long)(2127970697942017192L ^ var6_3)))) break block31;
                                                }
                                                catch (n9 v8) {
                                                    throw m44.a("n", (Object)v8, (long)292454329721299439L, (long)var6_3);
                                                }
                                                v5 = var2_4;
                                                if (var16_12 == null) break block30;
                                            }
                                            catch (n9 v9) {
                                                throw m44.a("n", (Object)v9, (long)292454329721299439L, (long)var6_3);
                                            }
                                            if (var6_3 < 0L) break block30;
                                            if (v5.equals(d6.c("y", (int)3024, (long)(3349066527064342725L ^ var6_3)))) break block31;
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("n", (Object)v10, (long)292454329721299439L, (long)var6_3);
                                        }
                                        v5 = var2_4;
                                        if (var16_12 == null) break block30;
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("n", (Object)v11, (long)292454329721299439L, (long)var6_3);
                                    }
                                    if (var6_3 <= 0L) break block30;
                                    if (v5.equals(d6.c("y", (int)8436, (long)(8291180324562856952L ^ var6_3)))) break block31;
                                }
                                catch (n9 v12) {
                                    throw m44.a("n", (Object)v12, (long)292454329721299439L, (long)var6_3);
                                }
                                v5 = var2_4;
                                if (var6_3 < 0L || var16_12 == null) break block30;
                            }
                            catch (n9 v13) {
                                throw m44.a("n", (Object)v13, (long)292454329721299439L, (long)var6_3);
                            }
                            if (v5.equals(d6.c("y", (int)16957, (long)(424864777683011875L ^ var6_3)))) {
                            }
                            ** GOTO lbl104
                        }
                        catch (n9 v14) {
                            throw m44.a("n", (Object)v14, (long)292454329721299439L, (long)var6_3);
                        }
                    }
                    v15 = new Object[4];
                    v15[3] = var17_13;
                    v15[2] = var14_11;
                    v15[1] = var8_5;
                    v15[0] = var3_2;
                    v5 = m44.a("q", (Object)this, (Object)v15, (long)167289422349660230L, (long)var6_3);
                }
                catch (n9 v16) {
                    throw m44.a("n", (Object)v16, (long)292454329721299439L, (long)var6_3);
                }
            }
            try {
                if (var6_3 < 0L || var16_12 != null) break block32;
lbl104:
                // 2 sources

                v17 = new Object[6];
                v17[5] = true;
                v17[4] = var2_4;
                v17[3] = var17_13;
                v17[2] = var12_10;
                v17[1] = var8_5;
                v17[0] = var3_2;
                m44.a("q", (Object)this, (Object)v17, (long)1817139738518539806L, (long)var6_3);
            }
            catch (n9 v18) {
                throw m44.a("n", (Object)v18, (long)292454329721299439L, (long)var6_3);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                d6.a = prr.a(-6940185852183948495L, 5854955809948560131L, MethodHandles.lookup().lookupClass()).a(3286901027199L);
                d6.d = new HashMap<K, V>(13);
                var0 = d6.a ^ 34190018357312L;
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
                var9_3 = new String[17];
                var7_4 = 0;
                var6_5 = "\u00aaH\u00d9R\u00be\u00a0\u00adu4\u0086\u00c0%\u00af\u00f21\u00f53<\u00fcy\u0081b\u00c1j\u00d02|\u009b\u0015\u009e]\u00f6 \u00a2\u0090\u0006\u00f0R\u00fbCR/\u009b\u00fb\u0083^\u0083&\u00a8\u00c4(\u00b4~a\u000eG\u00f7\n*>[*$\u00bb\u00c4 \u001a\u00f4\u0093>\u00ba\u0000\u00f3c:\u001d-h\u00ecN\u00e2\u00d8\u00df\u008d\u0098\u00fa6CA\u001f\u00das\u001d\u00a0\u00162\u00b7G\u0010#3=\u0005\u00a7R\u0005\u0086.A\u0002\u008a\u00f1\u00a9\u0098B \u00af\u00aa\u009b\u00ed\u00ccP\u0084\u0017#qR\u00cf\\\u00e2\u00f6\u00a9u\u0017\u0013t\u00a4L{!\u0080!\u00ccz qq\u00d1\u0018\u00d0 \u0082\u0089\u00c0\u00c7PM)\u00eb\u0085\u00072\u001bfk\u00b9\u00fe2\u0093\u00c4\u00ce\u00da\u001a J-L\u009ei\u008a\u009e\u00d5\u008e\u00bf\u00fd<a\u00eb\u0081M\u0011@K\u00ae\u0000\u0093\u0098c\t\u00db\u00a7\u0097\u001b\u0083\u00d7\u008d\u0018\u00ef\u0017\u0016\u00c0\u00dc\u00abP\u008e\u00f1\u00b5\u009csn\u00f9\u0096\f\u00ee\u0081\u00c6dJ]\u00d1\u0087\u0010\u009b\u0010q\u00c8\u00cf\u009d\u00d2\u00da\u0088(\u000bns\u0014\u00be\u0012 k\u00c77/\u00b7\u00bb\u0098\u001eK\r\u00b5\u009f\u00c30\u00de\u00be\u00a1\u0006.\u00e8\u0017\r\u0083\u00d6\u00db\u00ff\u008a\u00b5\u0084\u0019\u00a2.@\u00bd\u0099\u00d9\u0019\u00ca\u00a6\u00e2X\u00ce\u00a0t\u0015\u0014S@\u00a4\u0086\u00ac\u00b3:?\u00cf\u0017\u00ab\u00ddNsW6\u0083\u00d6*\u00cb\u0017\u009b\u001fKh\u00bb\u009f\u00b7^\u00f4\u0083\u0000\u00ee&\u00eb\u0098\u00ad\u00b2\u00a9^\u00b5\u00f4K\u00d5\u0010\u009e\u007f\u009f?\u001a\u00a1 \u00c2\u0010B\u00a8\u00c7j\u0018\u00d6e\u00ec\u00ca\u001e\u00dar|`\u00a8-u\u00f0s\u0084\u00aa\u0090\u00d1\u00a4\u00ce\u001fN\u0086\u00f7C p\u008cDw\u009b\\e\u00de,\u00b6<U\u0002V0.\u0002\u00c6\bU\u00e4\u0011.B\u00c9\u00de\u00e8\u0001\u00cc\u00d6bYH^\u00ea)]!\u00a6\u00c4\u00a2\u00f6\u00a8\u0091, G5_~o\u0011\u00d7\ts\u00f9\u00b2\u001d\u00bc\u0015\u00e6F\u00f0\u001d\u0080\u008c)\u009f|\u00ea&\u00ca\u00f8\u00e4\u0016M\u001e\u00fc\u00ab\u008ak\u0094\u00f6\u00ca\u008em\u008e\u0005\u00ea\u00f1\u00c7\u0099\u0095\u00fc\u00f0\u00ba\u0000\u00a0-\u001d\u00f0U\u0012 \u00a4\u0010\u00a0\u0007\u00b8\b{-\u008c\u00d3\u007f'G7\u0088\u00c4\u00d2!";
                var8_6 = "\u00aaH\u00d9R\u00be\u00a0\u00adu4\u0086\u00c0%\u00af\u00f21\u00f53<\u00fcy\u0081b\u00c1j\u00d02|\u009b\u0015\u009e]\u00f6 \u00a2\u0090\u0006\u00f0R\u00fbCR/\u009b\u00fb\u0083^\u0083&\u00a8\u00c4(\u00b4~a\u000eG\u00f7\n*>[*$\u00bb\u00c4 \u001a\u00f4\u0093>\u00ba\u0000\u00f3c:\u001d-h\u00ecN\u00e2\u00d8\u00df\u008d\u0098\u00fa6CA\u001f\u00das\u001d\u00a0\u00162\u00b7G\u0010#3=\u0005\u00a7R\u0005\u0086.A\u0002\u008a\u00f1\u00a9\u0098B \u00af\u00aa\u009b\u00ed\u00ccP\u0084\u0017#qR\u00cf\\\u00e2\u00f6\u00a9u\u0017\u0013t\u00a4L{!\u0080!\u00ccz qq\u00d1\u0018\u00d0 \u0082\u0089\u00c0\u00c7PM)\u00eb\u0085\u00072\u001bfk\u00b9\u00fe2\u0093\u00c4\u00ce\u00da\u001a J-L\u009ei\u008a\u009e\u00d5\u008e\u00bf\u00fd<a\u00eb\u0081M\u0011@K\u00ae\u0000\u0093\u0098c\t\u00db\u00a7\u0097\u001b\u0083\u00d7\u008d\u0018\u00ef\u0017\u0016\u00c0\u00dc\u00abP\u008e\u00f1\u00b5\u009csn\u00f9\u0096\f\u00ee\u0081\u00c6dJ]\u00d1\u0087\u0010\u009b\u0010q\u00c8\u00cf\u009d\u00d2\u00da\u0088(\u000bns\u0014\u00be\u0012 k\u00c77/\u00b7\u00bb\u0098\u001eK\r\u00b5\u009f\u00c30\u00de\u00be\u00a1\u0006.\u00e8\u0017\r\u0083\u00d6\u00db\u00ff\u008a\u00b5\u0084\u0019\u00a2.@\u00bd\u0099\u00d9\u0019\u00ca\u00a6\u00e2X\u00ce\u00a0t\u0015\u0014S@\u00a4\u0086\u00ac\u00b3:?\u00cf\u0017\u00ab\u00ddNsW6\u0083\u00d6*\u00cb\u0017\u009b\u001fKh\u00bb\u009f\u00b7^\u00f4\u0083\u0000\u00ee&\u00eb\u0098\u00ad\u00b2\u00a9^\u00b5\u00f4K\u00d5\u0010\u009e\u007f\u009f?\u001a\u00a1 \u00c2\u0010B\u00a8\u00c7j\u0018\u00d6e\u00ec\u00ca\u001e\u00dar|`\u00a8-u\u00f0s\u0084\u00aa\u0090\u00d1\u00a4\u00ce\u001fN\u0086\u00f7C p\u008cDw\u009b\\e\u00de,\u00b6<U\u0002V0.\u0002\u00c6\bU\u00e4\u0011.B\u00c9\u00de\u00e8\u0001\u00cc\u00d6bYH^\u00ea)]!\u00a6\u00c4\u00a2\u00f6\u00a8\u0091, G5_~o\u0011\u00d7\ts\u00f9\u00b2\u001d\u00bc\u0015\u00e6F\u00f0\u001d\u0080\u008c)\u009f|\u00ea&\u00ca\u00f8\u00e4\u0016M\u001e\u00fc\u00ab\u008ak\u0094\u00f6\u00ca\u008em\u008e\u0005\u00ea\u00f1\u00c7\u0099\u0095\u00fc\u00f0\u00ba\u0000\u00a0-\u001d\u00f0U\u0012 \u00a4\u0010\u00a0\u0007\u00b8\b{-\u008c\u00d3\u007f'G7\u0088\u00c4\u00d2!".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = d6.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ef\u00e2\u00dc\u00da\u00e2)\u00df\u0099\u00a6S\u00e4\b\u00f7\u00e4l+ \u0088\u00ea\u00d0\u00eb\u00ff<\u0092\u00e7\u0093\u00fap\u0096\u0098\u00ff\u00cd\t\u00f2\u00b3\u00f2Cg\u00c1\u0011\u00dd\u00f3^\u00ed\u0001)\u00aa\u0095\u0088";
                    var8_6 = "\u00ef\u00e2\u00dc\u00da\u00e2)\u00df\u0099\u00a6S\u00e4\b\u00f7\u00e4l+ \u0088\u00ea\u00d0\u00eb\u00ff<\u0092\u00e7\u0093\u00fap\u0096\u0098\u00ff\u00cd\t\u00f2\u00b3\u00f2Cg\u00c1\u0011\u00dd\u00f3^\u00ed\u0001)\u00aa\u0095\u0088".length();
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
                    var9_3[var7_4++] = d6.c(var10_9).intern();
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
        d6.b = var9_3;
        d6.c = new String[17];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }

    private static String c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4695;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/d6", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            d6.c[n11] = d6.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = d6.c(n10, l10);
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
            throw new RuntimeException("com/zelix/d6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d6.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

