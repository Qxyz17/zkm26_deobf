/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ay;
import com.zelix.b0;
import com.zelix.bf;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.nj;
import com.zelix.o4;
import com.zelix.prr;
import com.zelix.sh;
import com.zelix.tt;
import com.zelix.wa;
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
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ny
extends nj {
    private static final long a;
    private static final String[] M;
    private static final String[] P;
    private static final Map X;
    private static final long[] hb;
    private static final Integer[] ib;
    private static final Map jb;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void E(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x6A2221FB4C70L;
        CallSite callSite = m44.a("p", (Object)((Object)this), (long)-160441707847360165L, (long)l);
        synchronized (callSite) {
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = string;
            objectArray2[1] = l2;
            objectArray2[0] = (bf)m44.a("p", (Object)((Object)this), (long)-446421354088837004L, (long)l);
            m44.a("q", (Object)m44.a("p", (Object)((Object)this), (long)-160441707847360165L, (long)l), (Object)objectArray2, (long)-541109632549386870L, (long)l);
        }
    }

    int p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (int)ny.f("e", (int)12889, (long)(0x4344A1956703B08CL ^ l));
    }

    void Q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        o4 o42 = (o4)objectArray[1];
        DefaultListModel defaultListModel = (DefaultListModel)((Object)m44.a("s", (Object)o42, (long)-7982812456648693490L, (long)l));
        m44.a("s", (Object)defaultListModel, (Object)ny.c("k", (int)26562, (long)(0x4F0EB421691AFA2CL ^ l)), (long)-8262748918071857545L, (long)l);
        m44.a("s", (Object)defaultListModel, (Object)ny.c("k", (int)12792, (long)(0x769C0D1D1E77AC11L ^ l)), (long)-8262748918071857545L, (long)l);
        m44.a("s", (Object)defaultListModel, (Object)ny.c("k", (int)28221, (long)(0x43E877A4DB0BF3D0L ^ l)), (long)-8262748918071857545L, (long)l);
        m44.a("s", (Object)defaultListModel, (Object)ny.c("k", (int)18151, (long)(0x17573BD486465B0FL ^ l)), (long)-8262748918071857545L, (long)l);
    }

    void G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        super.G(objectArray2);
        m44.a("p", (Object)((Object)this), (int)0, (long)5495266710159221109L, (long)l);
        m44.a("p", (Object)((Object)this), (int)1, (long)5324810129088711965L, (long)l);
        m44.a("p", (Object)((Object)this), (int)ny.f("e", (int)30310, (long)(0x4DF107906AC24449L ^ l)), (long)6029622590318314291L, (long)l);
        m44.a("p", (Object)((Object)this), (int)ny.f("e", (int)13438, (long)(0x3330C0D7689B0657L ^ l)), (long)5910171864372210505L, (long)l);
    }

    ny(long l, bf bf2, sh sh2, o4 o42, wa wa2, tt tt2) {
        long l2 = (l = a ^ l) ^ 0x1DE668368902L;
        super((b0)bf2, sh2, l2, (JList)o42, wa2, tt2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    void O(Object[] var1_1) {
        block28: {
            block29: {
                block31: {
                    block30: {
                        block35: {
                            block26: {
                                block27: {
                                    block33: {
                                        block32: {
                                            var2_2 = (Long)var1_1[0];
                                            var4_3 = (Integer)var1_1[1];
                                            v0 = var2_2;
                                            var5_4 = v0 ^ 51504951601716L;
                                            var7_5 = v0 ^ 82549045148588L;
                                            var9_6 = v0 ^ 55030064788582L;
                                            var11_7 = m44.a("o", (long)-1204064367421646406L, (long)var2_2);
                                            v1 = var4_3 & ny.f("e", (int)10144, (long)(6220964565880648574L ^ var2_2));
                                            if (var11_7 != null) break block26;
                                            if (v1 == 0) break block27;
                                            break block32;
                                            catch (n9 v2) {
                                                throw m44.a("o", (Object)v2, (long)-736370688501521724L, (long)var2_2);
                                            }
                                        }
                                        v1 = var4_3 & ny.f("e", (int)3288, (long)(1926044200384010240L ^ var2_2));
                                        if (var2_2 <= 0L || var11_7 != null) break block26;
                                        break block33;
                                        catch (n9 v3) {
                                            throw m44.a("o", (Object)v3, (long)-736370688501521724L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        block34: {
                                            if (v1 == 0) break block27;
                                            break block34;
                                            catch (n9 v4) {
                                                throw m44.a("o", (Object)v4, (long)-736370688501521724L, (long)var2_2);
                                            }
                                        }
                                        throw new ay((String)ny.c("k", (int)11426, (long)(2524769128191022438L ^ var2_2)));
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("o", (Object)v5, (long)-736370688501521724L, (long)var2_2);
                                    }
                                }
                                try {
                                    v6 = this;
                                    if (var11_7 != null) break block28;
                                    v1 = (int)m44.a("q", (Object)v6, (long)-1649243461925158747L, (long)var2_2).G(var7_5).t(var5_4);
                                }
                                catch (n9 v7) {
                                    throw m44.a("o", (Object)v7, (long)-736370688501521724L, (long)var2_2);
                                }
                            }
                            if (var2_2 <= 0L) ** GOTO lbl49
                            if (v1 == 0) break block29;
                            v1 = var4_3 & ny.f("e", (int)21805, (long)(8355131427055911412L ^ var2_2));
lbl49:
                            // 2 sources

                            v8 = var11_7;
                            if (var2_2 <= 0L) ** GOTO lbl70
                            if (v8 != null) break block30;
                            break block35;
                            catch (n9 v9) {
                                throw m44.a("o", (Object)v9, (long)-736370688501521724L, (long)var2_2);
                            }
                        }
                        try {
                            block36: {
                                if (v1 == 0) ** GOTO lbl84
                                break block36;
                                catch (n9 v10) {
                                    throw m44.a("o", (Object)v10, (long)-736370688501521724L, (long)var2_2);
                                }
                            }
                            v1 = var4_3 & ny.f("e", (int)20874, (long)(1888398458783647061L ^ var2_2));
                        }
                        catch (n9 v11) {
                            throw m44.a("o", (Object)v11, (long)-736370688501521724L, (long)var2_2);
                        }
                    }
                    if (var2_2 < 0L) break block31;
                    v8 = var11_7;
lbl70:
                    // 2 sources

                    if (v8 != null) break block31;
                    try {
                        block37: {
                            if (v1 == 0) ** GOTO lbl84
                            break block37;
                            catch (n9 v12) {
                                throw m44.a("o", (Object)v12, (long)-736370688501521724L, (long)var2_2);
                            }
                        }
                        v1 = var4_3 & 1;
                    }
                    catch (n9 v13) {
                        throw m44.a("o", (Object)v13, (long)-736370688501521724L, (long)var2_2);
                    }
                }
                try {
                    if (v1 != 0) break block29;
lbl84:
                    // 3 sources

                    throw new ay((String)ny.c("k", (int)2459, (long)(7821443577950007388L ^ var2_2)));
                }
                catch (n9 v14) {
                    throw m44.a("o", (Object)v14, (long)-736370688501521724L, (long)var2_2);
                }
            }
            v6 = this;
        }
        var12_8 = m44.a("q", (Object)v6, (long)-1363265818092375670L, (long)var2_2);
        synchronized (var12_8) {
            v15 = new Object[2];
            v15[1] = var9_6;
            v15[0] = var4_3;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)-1649243461925158747L, (long)var2_2), (Object)v15, (long)-777463695220440413L, (long)var2_2);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        ny.a = prr.a((long)2752210881898138258L, (long)6916488289561775117L, MethodHandles.lookup().lookupClass()).a(37636260305288L);
                        ny.X = new HashMap<K, V>(13);
                        var11 = ny.a ^ 87289379735769L;
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
                        var20_3 = new String[6];
                        var18_4 = 0;
                        var17_5 = "\u00a9\u0084\u000f\u001b\u001by\u000f\u0004\u00bb\u00f7}\u0094\u008b\u00f6\u0085\u00d6DK\u008c%>G\u00fc\u00b6u\u00da3\u00c2%\u00ce\u00cf\u00a6X\u00df#w\u0084\u00ed\"m($\u00b1\u00fc\u0001\u0000\u00b6v\u00f1\u00ff5&\u00f2\u0088\u00ad<I\u00c0\u00b4\u00c2GM\"S@\u00f9$\u0001\u0083\u00c1\u00f2\u0090ol:\u0098~\u0091\u00e9\\\u00c89 \u00c8\u00e6h\u008b\u000e\u0013\u00ed\u0018\u00e13\u009a\u0090;\u00a9\u00bf\u00d3lJ\u00d7M?\u00e8\u0010\u009e\u00f4\u00e1r\u00d0U\u0094\u00a3\rFZ\u00f9h\u0085\u00ca@\u00b7\u00c2\u007f\u00e2\u00e7\u00d7u\\\u0081\u0098*\u00d4\u00f7\u00a6\u00c7\u001e\u00ea\u00e5^i\u00cb \u00f5y\u00cc$\u00a6\u00c0k\u00cdg\u00e9\u00fb$F\u000b\u00d8Rx#pO\u00bc\u0005Gf\u00c5\tLG\r\u00a8.\u00fa\u00d8\u00e2\u00cd\u00a0\u00a6\u0011\u0080\u00ab\u0012s\u0010-\u00aa\u00ad\u0006]\u00ac\u00d5\u00c7(\u0018D\u00dd?\u001d\u00c4\u00e4";
                        var19_6 = "\u00a9\u0084\u000f\u001b\u001by\u000f\u0004\u00bb\u00f7}\u0094\u008b\u00f6\u0085\u00d6DK\u008c%>G\u00fc\u00b6u\u00da3\u00c2%\u00ce\u00cf\u00a6X\u00df#w\u0084\u00ed\"m($\u00b1\u00fc\u0001\u0000\u00b6v\u00f1\u00ff5&\u00f2\u0088\u00ad<I\u00c0\u00b4\u00c2GM\"S@\u00f9$\u0001\u0083\u00c1\u00f2\u0090ol:\u0098~\u0091\u00e9\\\u00c89 \u00c8\u00e6h\u008b\u000e\u0013\u00ed\u0018\u00e13\u009a\u0090;\u00a9\u00bf\u00d3lJ\u00d7M?\u00e8\u0010\u009e\u00f4\u00e1r\u00d0U\u0094\u00a3\rFZ\u00f9h\u0085\u00ca@\u00b7\u00c2\u007f\u00e2\u00e7\u00d7u\\\u0081\u0098*\u00d4\u00f7\u00a6\u00c7\u001e\u00ea\u00e5^i\u00cb \u00f5y\u00cc$\u00a6\u00c0k\u00cdg\u00e9\u00fb$F\u000b\u00d8Rx#pO\u00bc\u0005Gf\u00c5\tLG\r\u00a8.\u00fa\u00d8\u00e2\u00cd\u00a0\u00a6\u0011\u0080\u00ab\u0012s\u0010-\u00aa\u00ad\u0006]\u00ac\u00d5\u00c7(\u0018D\u00dd?\u001d\u00c4\u00e4".length();
                        var16_7 = 32;
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
                            var20_3[var18_4++] = ny.d(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\b\u008f\u00f0E\u00da\u00d9z0\u00f2\u00cb\u00d7\u00f62K%f \u0011\u00b0\u0002\u00e1\u00a8!dW\u00ceN\u000en\u00949\u00cc\u0001ew\u009a\u0094J\u001fu\u0093\u0015i\u00f3\u00a2\u00eb\r\u0013\u00fb";
                            var19_6 = "\b\u008f\u00f0E\u00da\u00d9z0\u00f2\u00cb\u00d7\u00f62K%f \u0011\u00b0\u0002\u00e1\u00a8!dW\u00ceN\u000en\u00949\u00cc\u0001ew\u009a\u0094J\u001fu\u0093\u0015i\u00f3\u00a2\u00eb\r\u0013\u00fb".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = ny.d(var21_9).intern();
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
                ny.M = var20_3;
                ny.P = new String[6];
                ny.jb = new HashMap<K, V>(13);
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
                var6_12 = new long[7];
                var3_13 = 0;
                var4_14 = "\u00bc)\u0015\u0005\u0013ZX\u00e7\u00e2\u0099\u00ect\u00f8\u001e*\u00c1\u0094\u00f3r\u0081\u00e1\u0011\u00f3\u00f4`\u008d\u0014\u00b0\u00f3\u00c5\u00f0\u0010\u00c1\u0019\u0002\u0006\u0002\u00ec=5";
                var5_15 = "\u00bc)\u0015\u0005\u0013ZX\u00e7\u00e2\u0099\u00ect\u00f8\u001e*\u00c1\u0094\u00f3r\u0081\u00e1\u0011\u00f3\u00f4`\u008d\u0014\u00b0\u00f3\u00c5\u00f0\u0010\u00c1\u0019\u0002\u0006\u0002\u00ec=5".length();
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
                    var4_14 = "\u00b2\u00f5E{y.\u00d9\u00f2\u00ce\u0017\u008d\u000f:^\u00c5\u00f7";
                    var5_15 = "\u00b2\u00f5E{y.\u00d9\u00f2\u00ce\u0017\u008d\u000f:^\u00c5\u00f7".length();
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
        ny.hb = var6_12;
        ny.ib = new Integer[7];
    }

    private static n9 b(n9 n92) {
        return n92;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1F06;
        if (P[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])X.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    X.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ny", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = M[n2].getBytes("ISO-8859-1");
            ny.P[n2] = ny.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return P[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ny.c(n, l);
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
            throw new RuntimeException("com/zelix/ny" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int f(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x721A;
        if (ib[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = hb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])jb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    jb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ny", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ny.ib[n2] = n3;
        }
        return ib[n2];
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ny.f(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ny" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ny.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ny.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
