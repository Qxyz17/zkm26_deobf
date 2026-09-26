/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._v;
import com.zelix.aw;
import com.zelix.b4;
import com.zelix.b6;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.w;
import com.zelix.x8;
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

public class bv
extends b4 {
    private static final long b;
    private static final String[] k;
    private static final String[] l;
    private static final Map m;

    /*
     * Unable to fully structure code
     */
    bv(char var1_1, _v var2_2, x8 var3_3, long var4_4, x8 var6_5, kw[] var7_6, int var8_7) {
        var9_8 = ((long)var1_1 << 48 | var4_4 << 16 >>> 16) ^ bv.b;
        var11_9 = var9_8 ^ 71015745185862L;
        v0 = m44.a("h", (long)-4811561933595620239L, (long)var9_8);
        super(var2_2, var3_3, var11_9, var6_5, var7_6, var8_7);
        var13_10 = v0;
        var14_11 = 0;
        while (var14_11 < var7_6.length) {
            m44.a("w", (Object)var7_6[var14_11], (Object)new Object[]{this}, (long)-4655402442941212336L, (long)var9_8);
            ++var14_11;
lbl11:
            // 2 sources

            ** while (var13_10 == false)
lbl12:
            // 1 sources

        }
lbl13:
        // 2 sources

        if (var1_1 < '\u0000') ** GOTO lbl11
    }

    void d(Object[] objectArray) {
        block6: {
            w w10;
            w w11;
            w w12;
            long l10;
            long l11;
            block5: {
                Map map = (Map)objectArray[0];
                l11 = (Long)objectArray[1];
                long l12 = l11 = b ^ l11;
                long l13 = l12 ^ 0x20512776FC09L;
                l10 = l12 ^ 0x300FEFE7B338L;
                w12 = this.Z(l13);
                CallSite callSite = m44.a("o", (long)510807657871135729L, (long)l11);
                w11 = (w)map.get(w12);
                try {
                    w10 = w11;
                    if (callSite != false) break block5;
                    if (w10 == null) break block6;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)229646528939320107L, (long)l11);
                }
                w10 = w11;
            }
            try {
                if (!w10.equals(w12)) {
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = m44.a("p", (Object)w11, (Object)new Object[0], (long)446550548365301370L, (long)l11);
                    objectArray2[0] = l10;
                    m44.a("p", (Object)this, (Object)objectArray2, (long)475742564743186893L, (long)l11);
                }
            }
            catch (n9 n93) {
                throw m44.a("o", (Object)n93, (long)229646528939320107L, (long)l11);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    bv(_4 var1_1, h1 var2_2, l6q var3_3, long var4_4) {
        v0 = var4_4 = bv.b ^ var4_4;
        var6_5 = v0 ^ 28970615246479L;
        var8_6 = v0 ^ 97773875619292L;
        var10_7 = v0 ^ 100512448073398L;
        v1 = v0 ^ 100851924420164L;
        var12_8 = (int)(v1 >>> 32);
        var13_9 = (int)(v1 << 32 >>> 32);
        var14_10 = v0 ^ 28310541142933L;
        super(var12_8, var1_1, var13_9, var2_2, var3_3);
        this.T = new kw[this.G];
        var16_11 = m44.a("m", (long)-7449809171114701701L, (long)var4_4);
        for (var17_12 = 0; var17_12 < this.G; ++var17_12) {
            block12: {
                block13: {
                    block10: {
                        block11: {
                            var18_13 = var2_2.readUnsignedShort();
                            var19_14 = var1_1.m(var14_10, var18_13);
                            try {
                                try {
                                    v2 = var19_14;
                                    v3 = var16_11;
                                    if (var4_4 >= 0L) {
                                        if (v3 != false) break block10;
                                        if (v2 != null) break block11;
                                    }
                                    ** GOTO lbl37
                                }
                                catch (n9 v4) {
                                    throw m44.a("m", (Object)v4, (long)-7159060321256866655L, (long)var4_4);
                                }
                                throw new aw((String)m44.a("r", (Object)var1_1.G(var10_7), (long)var8_6, (long)-9043104807810141664L, (long)var4_4) + (String)bv.c("u", (int)29118, (long)(90252923453961101L ^ var4_4)) + var18_13 + (String)bv.c("u", (int)25241, (long)(4176144093311099054L ^ var4_4)));
                            }
                            catch (n9 v5) {
                                throw m44.a("m", (Object)v5, (long)-7159060321256866655L, (long)var4_4);
                            }
                        }
                        v2 = var19_14;
                    }
                    try {
                        try {
                            v3 = var16_11;
lbl37:
                            // 2 sources

                            if (v3 != false) break block12;
                            if (v2 instanceof x8) break block13;
                        }
                        catch (n9 v6) {
                            throw m44.a("m", (Object)v6, (long)-7159060321256866655L, (long)var4_4);
                        }
                        throw new aw((String)m44.a("r", (Object)var1_1.G(var10_7), (long)var8_6, (long)-9043104807810141664L, (long)var4_4) + (String)bv.c("u", (int)25613, (long)(4416982596476003901L ^ var4_4)) + var18_13 + (String)bv.c("u", (int)9389, (long)(8196098338593777308L ^ var4_4)) + var19_14.getClass().getName() + (String)bv.c("u", (int)10621, (long)(2267805590799461199L ^ var4_4)));
                    }
                    catch (n9 v7) {
                        throw m44.a("m", (Object)v7, (long)-7159060321256866655L, (long)var4_4);
                    }
                }
                v2 = var19_14;
            }
            var20_15 = (x8)v2;
            var21_16 = var20_15.V();
            this.T[var17_12] = new b6(var6_5, var1_1, var18_13, var21_16, var2_2, var3_3);
            if (var16_11 == false) continue;
        }
    }

    @Override
    void z(gu gu2, long l10) {
    }

    @Override
    public boolean J() {
        return false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                bv.b = prr.a(4638421277724243456L, -5295734442030708114L, MethodHandles.lookup().lookupClass()).a(254763391229396L);
                bv.m = new HashMap<K, V>(13);
                var0 = bv.b ^ 60319057937609L;
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
                var6_5 = "\u009d~Am\u00d6\u00bd\u00e9\u0087\u00ed\u0083\u00aa\u00c8\u0099\u00ba\u0013\u00e3\u009c\u00b4\u00f9l\u00b5m\u0014\u00fcE\u009d&\u009a~\u00db\u00b4\u00d8\\\u00e8X\u00c3\u00b9yk[\u0013d\u00ad\u00dcb\u0019\u009f\u00c5\u00c6lI\u00ccO^S44\u00d8K\u0083\u0082_p\u00f1\u00d1>\u00b9\u0000\u00c1\u00e9XF\u0085\u00dcc&\u00d8\u0086\t\u00fd@L\u00c9\u0099\u00a4Q\u00fe{a_\u00da+\u0004\u001e#\u00b3\u0012\u001b@\u0094\u00a5\u0097\u00d1\u00e1\u009e\u00d5\u00c8\u00ab\u0089\u00d5c}\u00d1\u00cd\u00e3\u008fa|\u00b4\u00f7\u008b\u00f9\u00e4\u00e4f\u00cd\u00c7l\u0093\u0085H*,p0\u00af\u0007R\u00ff.hI\u000f}\u0013\u0010\u00ec5/\u00c2\u008d%\u001a\u00b33\u00892hg\u00e4\u00f0\u00f4";
                var8_6 = "\u009d~Am\u00d6\u00bd\u00e9\u0087\u00ed\u0083\u00aa\u00c8\u0099\u00ba\u0013\u00e3\u009c\u00b4\u00f9l\u00b5m\u0014\u00fcE\u009d&\u009a~\u00db\u00b4\u00d8\\\u00e8X\u00c3\u00b9yk[\u0013d\u00ad\u00dcb\u0019\u009f\u00c5\u00c6lI\u00ccO^S44\u00d8K\u0083\u0082_p\u00f1\u00d1>\u00b9\u0000\u00c1\u00e9XF\u0085\u00dcc&\u00d8\u0086\t\u00fd@L\u00c9\u0099\u00a4Q\u00fe{a_\u00da+\u0004\u001e#\u00b3\u0012\u001b@\u0094\u00a5\u0097\u00d1\u00e1\u009e\u00d5\u00c8\u00ab\u0089\u00d5c}\u00d1\u00cd\u00e3\u008fa|\u00b4\u00f7\u008b\u00f9\u00e4\u00e4f\u00cd\u00c7l\u0093\u0085H*,p0\u00af\u0007R\u00ff.hI\u000f}\u0013\u0010\u00ec5/\u00c2\u008d%\u001a\u00b33\u00892hg\u00e4\u00f0\u00f4".length();
                var5_7 = 80;
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
                    var9_3[var7_4++] = bv.d(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "z\u00fd\u00bcOq6\u00afn\u00c3\u00d1E\u00e4\u00fe\u00c2\u00f7\u00f3\u0080|\u00bef\u00ce.\u00e0\u001eA\f\u00f4d\u00f7\u0097\u0004Ou@\u00efE\u00c5'\"\u00bf8\u00f9\u009dQ3M\u00cbS]\u001etk;l\u00a2\u00e3\u0006@\u00da\u00f89\u0013\r\u00e6\t\u00a6\u00af1\u00b0zq\n\u0007\u00e9W\u00c1j<\u00eb=\u00b8)\u00da\u001b\u00fevr\u00b1\u00a4\u0005\u00b4O\u0097\u00ad\u00fe\u0007C";
                    var8_6 = "z\u00fd\u00bcOq6\u00afn\u00c3\u00d1E\u00e4\u00fe\u00c2\u00f7\u00f3\u0080|\u00bef\u00ce.\u00e0\u001eA\f\u00f4d\u00f7\u0097\u0004Ou@\u00efE\u00c5'\"\u00bf8\u00f9\u009dQ3M\u00cbS]\u001etk;l\u00a2\u00e3\u0006@\u00da\u00f89\u0013\r\u00e6\t\u00a6\u00af1\u00b0zq\n\u0007\u00e9W\u00c1j<\u00eb=\u00b8)\u00da\u001b\u00fevr\u00b1\u00a4\u0005\u00b4O\u0097\u00ad\u00fe\u0007C".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = bv.d(var10_9).intern();
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
        bv.k = var9_3;
        bv.l = new String[5];
    }

    private static n9 e(n9 n92) {
        return n92;
    }

    private static String d(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x11E9;
        if (l[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])m.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n11].getBytes("ISO-8859-1");
            bv.l[n11] = bv.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return l[n11];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = bv.c(n10, l10);
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
            throw new RuntimeException("com/zelix/bv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bv.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

