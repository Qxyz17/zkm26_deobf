/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._e;
import com.zelix.fx;
import com.zelix.lma;
import com.zelix.lpc;
import com.zelix.lpm;
import com.zelix.lqu;
import com.zelix.ltf;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.un;
import com.zelix.vg;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
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

public class lps
extends lpc {
    private static final long e;
    private static final String[] k;
    private static final String[] n;
    private static final Map o;
    private static final long[] p;
    private static final Integer[] q;
    private static final Map s;

    @Override
    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10;
        long l12 = l11 ^ 0x550B0FC6572DL;
        long l13 = l11 ^ 0x6DF7BA9051C2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        String string = (String)((Object)m44.a("n", (Object)objectArray2, (long)3433008837598041604L, (long)l10)) + (String)((Object)lps.b("v", (int)29246, (long)(0x7B69429C89ED6F13L ^ l10)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray3, (long)3638594277050117288L, (long)l10);
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    public static int H(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = e ^ l10;
        return ((String)((Object)lps.b("v", (int)13818, (long)(0x1B303CB6818EADFDL ^ l10)))).length();
    }

    public lps(long l10, int n10) {
        long l11 = (l10 = e ^ l10) ^ 0x6A8EA8D67B9EL;
        super(l11, n10);
    }

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x3E0224440141L;
        long l13 = l11 ^ 0x32167BD74214L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = this;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6895120770844105625L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lps.b("v", (int)22000, (long)(0x539C06D011FB41BCL ^ l10));
        objectArray3[4] = n12;
        objectArray3[3] = n11;
        objectArray3[2] = l12;
        objectArray3[1] = n10;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)this, (Object)objectArray3, (long)-4778337559753001233L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String b(Object[] var0) {
        block22: {
            var3_1 = (Long)var0[0];
            var1_2 = (List)var0[1];
            var2_3 = (Integer)var0[2];
            var5_4 = (var3_1 = lps.e ^ var3_1) ^ 65968745697836L;
            var8_5 = var1_2.size();
            var7_6 = m44.a("n", (long)3685837127601337312L, (long)var3_1);
            if (var8_5 <= 0) break block22;
            v0 = new Object[5];
            v0[4] = (int)lps.c("q", (int)9095, (long)(1457258907521851249L ^ var3_1));
            v0[3] = var5_4;
            v0[2] = var2_3;
            v0[1] = (int)lps.c("q", (int)20453, (long)(7805905987227972369L ^ var3_1));
            v0[0] = "";
            var9_7 = m44.a("n", (Object)v0, (long)3563367924582977723L, (long)var3_1);
            var10_8 = new StringBuffer((int)lps.c("q", (int)17312, (long)(70881607282851671L ^ var3_1)));
            v1 = new Object[5];
            v1[4] = (int)lps.c("q", (int)6008, (long)(6783584230715960203L ^ var3_1));
            v1[3] = var5_4;
            v1[2] = var2_3;
            v1[1] = (int)lps.c("q", (int)23, (long)(6286746427972599010L ^ var3_1));
            v1[0] = lps.b("v", (int)20932, (long)(6662378439051826130L ^ var3_1));
            var10_8.append(_e.n + (String)m44.a("n", (Object)v1, (long)3563367924582977723L, (long)var3_1));
            var11_9 = 0;
            block10: while (var11_9 < var8_5) {
                v2 = var1_2.get(var11_9);
                do {
                    block21: {
                        block19: {
                            block17: {
                                block18: {
                                    var12_10 = v2;
                                    try {
                                        try {
                                            v3 /* !! */  = var11_9;
                                            v4 /* !! */  = var7_6;
                                            if (var3_1 > 0L) {
                                                if (v4 /* !! */  == false) break block17;
                                                if (v3 /* !! */  <= 0) break block18;
                                            }
                                            ** GOTO lbl63
                                        }
                                        catch (n9 v5) {
                                            throw m44.a("n", (Object)v5, (long)3106526458977490145L, (long)var3_1);
                                        }
                                        var10_8.append((String)var9_7);
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("n", (Object)v6, (long)3106526458977490145L, (long)var3_1);
                                    }
                                }
                                try {
                                    if (var3_1 > 0L) {
                                        v7 = var10_8.append(var12_10.toString());
                                        if (var7_6 == false) break block19;
                                    }
                                    v3 /* !! */  = var11_9;
                                }
                                catch (n9 v8) {
                                    throw m44.a("n", (Object)v8, (long)3106526458977490145L, (long)var3_1);
                                }
                            }
                            try {
                                block20: {
                                    try {
                                        block23: {
                                            if (var3_1 <= 0L) break block23;
                                            v4 /* !! */  = (CallSite)(var8_5 - 1);
lbl63:
                                            // 2 sources

                                            if (v3 /* !! */  >= v4 /* !! */ ) break block20;
                                            var10_8.append((String)lps.b("v", (int)4423, (long)(5952800104019497811L ^ var3_1)) + _e.n);
                                            v3 /* !! */  = (int)var7_6;
                                        }
                                        if (var3_1 <= 0L) break block21;
                                        if (v3 /* !! */  != 0) break block19;
                                    }
                                    catch (n9 v9) {
                                        throw m44.a("n", (Object)v9, (long)3106526458977490145L, (long)var3_1);
                                    }
                                }
                                v7 = var10_8.append(";" + _e.n);
                            }
                            catch (n9 v10) {
                                throw m44.a("n", (Object)v10, (long)3106526458977490145L, (long)var3_1);
                            }
                        }
                        ++var11_9;
                        v3 /* !! */  = (int)var7_6;
                    }
                    if (v3 /* !! */  != 0) continue block10;
                    v2 = var10_8.toString();
                } while (var3_1 <= 0L);
            }
            return v2;
        }
        return null;
    }

    public static lpm i(Object[] objectArray) {
        String string = (String)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 = e ^ l10;
        long l12 = l11 ^ 0x81DDCDE6C53L;
        long l13 = l11 ^ 0x4AEBFA12D9EDL;
        long l14 = l11 ^ 0x27A5B2811C28L;
        long l15 = l11 ^ 0x89756AC236EL;
        BufferedReader bufferedReader = new BufferedReader(new StringReader(string));
        try {
            fx fx2 = new fx(bufferedReader, l12);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            CallSite callSite = m44.a("q", (Object)fx2, (Object)objectArray2, (long)-7110540261541489030L, (long)l10);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l15;
            objectArray3[1] = lqu2;
            objectArray3[0] = null;
            m44.a("q", (Object)callSite, (Object)objectArray3, (long)-8914802971669385271L, (long)l10);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l14;
            CallSite callSite2 = m44.a("q", (Object)((ltf)((Object)callSite)), (Object)objectArray4, (long)-9004962431417753354L, (long)l10);
            return callSite2;
        }
        catch (lma lma2) {
            throw new un((String)((Object)m44.a("q", (Object)lma2, (long)-8915139841539967607L, (long)l10)));
        }
        catch (vg vg2) {
            throw new un((String)((Object)m44.a("q", (Object)vg2, (long)-7157189326384585661L, (long)l10)));
        }
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lps.b("v", (int)20932, (long)(0x5C75E61FE6F103C6L ^ l10));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        lps.e = prr.a(-8225382452314360299L, 8698911606256270551L, MethodHandles.lookup().lookupClass()).a(5873374526735L);
                        lps.o = new HashMap<K, V>(13);
                        var11 = lps.e ^ 25329653515630L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[5];
                        var18_4 = 0;
                        var17_5 = "\u0093\u009c\u00a6\u0098\u00d7B\r\u00db\u00b1J\u00bca\u00ebS4D\u000fpv_$\n\u00ae4\u00fa\u0001U\u00d8$&\u0094Wh}&\u00e4V\u00d8\u00fe\u0004-|\u00b7\u00a9\u001dD\u0085\t R\u000f@\u00e2w\u00d9=\u0088e\u00c6\u00dd\u00b75\u00f8+\n\u009d0\u0080\u0084P\u0080\u0018\u00b8\u00f7\u000e\u00ca\u0014\u0001\u00f1\u00d0A\u0010\u0018\u00eaXi\u00e9\u0094\t\u00d4\u0016\u00b6\u00c6\u00cc\u00abA\u00f3\u008f";
                        var19_6 = "\u0093\u009c\u00a6\u0098\u00d7B\r\u00db\u00b1J\u00bca\u00ebS4D\u000fpv_$\n\u00ae4\u00fa\u0001U\u00d8$&\u0094Wh}&\u00e4V\u00d8\u00fe\u0004-|\u00b7\u00a9\u001dD\u0085\t R\u000f@\u00e2w\u00d9=\u0088e\u00c6\u00dd\u00b75\u00f8+\n\u009d0\u0080\u0084P\u0080\u0018\u00b8\u00f7\u000e\u00ca\u0014\u0001\u00f1\u00d0A\u0010\u0018\u00eaXi\u00e9\u0094\t\u00d4\u0016\u00b6\u00c6\u00cc\u00abA\u00f3\u008f".length();
                        var16_7 = 48;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = lps.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "{\u00cd\u00d6&\u008a\u00f8n\u0081\u00f6\u00df\u00f4\u00ce\u00fb+g\u0093\u009b\u00b4\u00b1<M\u0014\tC\u00ef\b>1y~T\u00ffH@x\u00c3\u0089\u00ca\n\u0086\u00f3\u00f1\u008c6e\u00ba\u00df\u009b\u00a5\u00e9d\u00cfk\u00fb\u0090\u00ed\f^\\-\u00f8\u00e5\u0092\u00c6\u009b5\u0087\u008c}\u00deP\f0\b\\C\u0096\t;\u0015}h\u00a7n\u00c3\u00a3\u00b8(\u00aa\u00c8_p\u00a6\u00e8\u009a4OT\u00da/o\u00866\u00e2\u00a3&;\u00db\u00ef\u00a3\u00f5D\u009fk\u00ff?=\u00b0\u0007\u00e8\u00cb";
                            var19_6 = "{\u00cd\u00d6&\u008a\u00f8n\u0081\u00f6\u00df\u00f4\u00ce\u00fb+g\u0093\u009b\u00b4\u00b1<M\u0014\tC\u00ef\b>1y~T\u00ffH@x\u00c3\u0089\u00ca\n\u0086\u00f3\u00f1\u008c6e\u00ba\u00df\u009b\u00a5\u00e9d\u00cfk\u00fb\u0090\u00ed\f^\\-\u00f8\u00e5\u0092\u00c6\u009b5\u0087\u008c}\u00deP\f0\b\\C\u0096\t;\u0015}h\u00a7n\u00c3\u00a3\u00b8(\u00aa\u00c8_p\u00a6\u00e8\u009a4OT\u00da/o\u00866\u00e2\u00a3&;\u00db\u00ef\u00a3\u00f5D\u009fk\u00ff?=\u00b0\u0007\u00e8\u00cb".length();
                            var16_7 = 72;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = lps.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                lps.k = var20_3;
                lps.n = new String[5];
                lps.s = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "\u0000\rI\u0095W\u00ccwQ\u00e0\u00be\u0007\"'\u00ff\u00fc\u00cal\u00e1K\u00fcB/\r2";
                var5_15 = "\u0000\rI\u0095W\u00ccwQ\u00e0\u00be\u0007\"'\u00ff\u00fc\u00cal\u00e1K\u00fcB/\r2".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00865=M\u009b\u00ac\u00c7\u0099\t\u00e6)D(\u00c1\u00e0\u008d";
                    var5_15 = "\u00865=M\u009b\u00ac\u00c7\u0099\t\u00e6)D(\u00c1\u00e0\u008d".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl104:
                // 1 sources

                ** continue;
            }
        }
        lps.p = var6_12;
        lps.q = new Integer[5];
    }

    private static n9 c(n9 n92) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3DAF;
        if (n[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])o.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lps", exception);
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
            lps.n[n11] = lps.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return n[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lps.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lps" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x34E;
        if (q[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = p[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])s.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    s.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lps", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lps.q[n11] = n12;
        }
        return q[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lps.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lps" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lps.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(lps.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

