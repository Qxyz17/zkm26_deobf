/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.hz;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.oz;
import com.zelix.prr;
import com.zelix.v7;
import java.io.DataOutputStream;
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

public class ib
extends oz {
    private static Map P;
    private static String[] c;
    private int n;
    private static final long a;
    private static final long[] b;
    private static final Integer[] d;
    private static final Map e;

    @Override
    public final boolean e(long l10, int n10) {
        return true;
    }

    ib(long l10, h1 h12) {
        l10 = a ^ l10;
        super((int)ib.b("a", (int)12948, (long)(0x416786F348831620L ^ l10)));
        m44.a("u", (Object)this, (int)h12.read(), (long)7903289083963185075L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        ib.a = prr.a(-1301466714317885110L, 2157499729175686468L, MethodHandles.lookup().lookupClass()).a(244824226701923L);
                        var20 = ib.a ^ 139071676008053L;
                        var22_1 = var20 ^ 31777876233948L;
                        var12_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_3 = 1; var13_3 < 8; ++var13_3) {
                            v2 = v2;
                            v2[var13_3] = (byte)(var20 << var13_3 * 8 >>> 56);
                        }
                        var12_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_4 = new String[8];
                        var17_5 = 0;
                        var16_6 = "e\u00dbc-\u0098\u00fc\u0099\u0004\b\u001d\u00a0\nFd8`\u0084\b\"Zc\u0096\u00ce\u00cf\u0085w\b\u00c6\u00e5\u000b\u007f\u00cc\u00fc\u00cc\u0086\b\u00a0duZ\u00fb\u00f1\u00ee*\b\u0086\u00075\u00a7\u00a6\u0007G@";
                        var18_7 = "e\u00dbc-\u0098\u00fc\u0099\u0004\b\u001d\u00a0\nFd8`\u0084\b\"Zc\u0096\u00ce\u00cf\u0085w\b\u00c6\u00e5\u000b\u007f\u00cc\u00fc\u00cc\u0086\b\u00a0duZ\u00fb\u00f1\u00ee*\b\u0086\u00075\u00a7\u00a6\u0007G@".length();
                        var15_8 = 8;
                        var14_9 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_9;
                            v4 = var16_6.substring(v3, v3 + var15_8);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = ib.b(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            var16_6 = "_\u00ec@u\u00c0OqE\b\u00be\u0001\u00b2_\u00bf\u00e6<\u00b3";
                            var18_7 = "_\u00ec@u\u00c0OqE\b\u00be\u0001\u00b2_\u00bf\u00e6<\u00b3".length();
                            var15_8 = 8;
                            var14_9 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_9;
                                v4 = var16_6.substring(v6, v6 + var15_8);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = ib.b(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_10 = var12_2.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                ib.e = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v9 = v9;
                    v9[var1_12] = (byte)(var20 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[17];
                var3_14 = 0;
                var4_15 = "\u00d7\u00892t\u00b4\u00db\u008d\u00cdpP;\u00c7m:\u00fb(\u00ce\u00fevia\u0001\u00eeaM\u0088:\u00e6M\u0089\u00b4\u001f\u0019\u00b3\u001f_\u0092\u00be/\u0096M\u000f\u00a4\u008b/\u0010?\u00c9X\b\u00b24\u00d5\u00d9\u0004\u0098\u00b6\u00cd`0q\u0000\"1\u0016\u00b5\u0017PO-\u0006\u00d2\u00af-\u00be\u00dc\u00fc\u00bfS6\u00d8\u00act\u0011\u00b4\u00b54,8\u0095\u00b9~\u00ff`*w\u00ab''\u00a2\u00e0\u00eb*\u00be\u00eb\u00a1\u00ed|\u00b9\r%\u00d9\u009a\u0085\u00cc\u001eK\u00c8\u00cb\r";
                var5_16 = "\u00d7\u00892t\u00b4\u00db\u008d\u00cdpP;\u00c7m:\u00fb(\u00ce\u00fevia\u0001\u00eeaM\u0088:\u00e6M\u0089\u00b4\u001f\u0019\u00b3\u001f_\u0092\u00be/\u0096M\u000f\u00a4\u008b/\u0010?\u00c9X\b\u00b24\u00d5\u00d9\u0004\u0098\u00b6\u00cd`0q\u0000\"1\u0016\u00b5\u0017PO-\u0006\u00d2\u00af-\u00be\u00dc\u00fc\u00bfS6\u00d8\u00act\u0011\u00b4\u00b54,8\u0095\u00b9~\u00ff`*w\u00ab''\u00a2\u00e0\u00eb*\u00be\u00eb\u00a1\u00ed|\u00b9\r%\u00d9\u009a\u0085\u00cc\u001eK\u00c8\u00cb\r".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v10 = var6_13;
                    v11 = var3_14++;
                    v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl77:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "\u0091\u00d2\u00b4\u0007{\u00e7m\u00c2U\u007f\u0016\u0006\u0091Rm\u00bc";
                    var5_16 = "\u0091\u00d2\u00b4\u0007{\u00e7m\u00c2U\u007f\u0016\u0006\u0091Rm\u00bc".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v10 = var6_13;
                        v11 = var3_14++;
                        v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    break block21;
                    break;
                }
            }
            var8_19 = v12;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v14 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl103:
                // 1 sources

                ** continue;
            }
        }
        ib.b = var6_13;
        ib.d = new Integer[17];
        m44.a("j", (String[])new String[ib.b("a", (int)30083, (long)(7487959399279301481L ^ var20))], (long)-5400637871320750640L, (long)var20);
        v15 = new Object[1];
        v15[0] = var22_1;
        m44.a("j", (Map)m44.a("i", (Object)v15, (long)-6144993444269601190L, (long)var20), (long)-6262799631634352408L, (long)var20);
        m44.a("m", (long)-5400637871320750640L, (long)var20)[4] = var11_4[0];
        m44.a("m", (long)-5400637871320750640L, (long)var20)[5] = var11_4[6];
        m44.a("m", (long)-5400637871320750640L, (long)var20)[ib.b("a", (int)5528, (long)(3997148681380328312L ^ var20))] = var11_4[5];
        m44.a("m", (long)-5400637871320750640L, (long)var20)[ib.b("a", (int)19037, (long)(2704222376624204981L ^ var20))] = var11_4[4];
        m44.a("m", (long)-5400637871320750640L, (long)var20)[ib.b("a", (int)30522, (long)(1351437503898816984L ^ var20))] = var11_4[1];
        m44.a("m", (long)-5400637871320750640L, (long)var20)[ib.b("a", (int)8669, (long)(4723964866331461432L ^ var20))] = var11_4[7];
        m44.a("m", (long)-5400637871320750640L, (long)var20)[ib.b("a", (int)31868, (long)(4474019060683872917L ^ var20))] = var11_4[2];
        m44.a("m", (long)-5400637871320750640L, (long)var20)[ib.b("a", (int)16075, (long)(3967661152526653487L ^ var20))] = var11_4[3];
        m44.a("m", (long)-6262799631634352408L, (long)var20).put("Z", 4);
        m44.a("m", (long)-6262799631634352408L, (long)var20).put("C", 5);
        m44.a("m", (long)-6262799631634352408L, (long)var20).put("F", (int)ib.b("a", (int)7223, (long)(1400500260721425115L ^ var20)));
        m44.a("m", (long)-6262799631634352408L, (long)var20).put("D", (int)ib.b("a", (int)8768, (long)(719764198757418151L ^ var20)));
        m44.a("m", (long)-6262799631634352408L, (long)var20).put("B", (int)ib.b("a", (int)32382, (long)(3746755483019483285L ^ var20)));
        m44.a("m", (long)-6262799631634352408L, (long)var20).put("S", (int)ib.b("a", (int)20038, (long)(1239425640493918376L ^ var20)));
        m44.a("m", (long)-6262799631634352408L, (long)var20).put("I", (int)ib.b("a", (int)8699, (long)(1904693069641172756L ^ var20)));
        m44.a("m", (long)-6262799631634352408L, (long)var20).put("J", (int)ib.b("a", (int)5656, (long)(7518528565884317945L ^ var20)));
    }

    /*
     * Exception decompiling
     */
    @Override
    public hz n(hz var1_1, boolean var2_2, char var3_3, int var4_4, boolean var5_5, loj var6_6, char var7_7, String var8_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[TRYBLOCK]], but top level block is 10[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public final boolean v(Object[] objectArray) {
        boolean bl2;
        block5: {
            block6: {
                boolean bl3 = ((Integer)objectArray[0]).intValue();
                v7 v72 = (v7)objectArray[1];
                long l10 = (Long)objectArray[2];
                int n10 = (Integer)objectArray[3];
                CallSite callSite = m44.a("j", (long)-4319878175848984624L, (long)l10);
                try {
                    try {
                        bl2 = bl3;
                        Object object = callSite;
                        if (l10 > 0L) {
                            if (object == false) break block5;
                            object = n10 - 1;
                        }
                        if (bl2 != object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-4265168431831777401L, (long)l10);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-4265168431831777401L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public boolean S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public boolean L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public void G(short s10, int n10, DataOutputStream dataOutputStream, int n11) {
        long l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
        long l11 = l10 ^ 0L;
        int n12 = (int)(l11 >>> 48);
        int n13 = (int)(l11 << 16 >>> 32);
        int n14 = (int)(l11 << 48 >>> 48);
        super.G((short)n12, n13, dataOutputStream, n14);
        dataOutputStream.writeByte((int)m44.a("s", (Object)this, (long)333940638626971327L, (long)l10));
    }

    public ib(int n10, long l10) {
        l10 = a ^ l10;
        super((int)ib.b("a", (int)4898, (long)(0x4F2E76D000BAB9DCL ^ l10)));
        m44.a("v", (Object)this, (int)n10, (long)7202707190289930728L, (long)l10);
    }

    @Override
    public final boolean T(long l10) {
        return false;
    }

    public ib(String string, short s10, short s11, int n10) {
        long l10 = ((long)s10 << 48 | (long)s11 << 48 >>> 16 | (long)n10 << 32 >>> 32) ^ a;
        super((int)ib.b("a", (int)12948, (long)(0x4167AA575622B9A4L ^ l10)));
        m44.a("q", (Object)this, (int)((Integer)m44.a("i", (long)-4261980955205117148L, (long)l10).get(string)), (long)-4455692632416798665L, (long)l10);
    }

    @Override
    public boolean d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public int T(char c10, int n10, char c11) {
        return 2;
    }

    @Override
    public final boolean Y(long l10, int n10, int n11) {
        boolean bl2;
        block5: {
            block6: {
                CallSite callSite = m44.a("k", (long)5367725136247488929L, (long)l10);
                try {
                    try {
                        bl2 = n10;
                        Object object = callSite;
                        if (l10 > 0L) {
                            if (object == false) break block5;
                            object = n11 - 1;
                        }
                        if (bl2 != object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)5385843175221654006L, (long)l10);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)5385843175221654006L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3926A82327E7L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 56);
        int n12 = (int)(l11 << 40 >>> 40);
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n12;
        objectArray2[1] = (int)((byte)n11);
        objectArray2[0] = n10;
        stringBuilder.append((String)((Object)m44.a("s", (Object)this, (Object)objectArray2, (long)-7550383759637692338L, (long)l10)));
        stringBuilder.append((char)ib.b("a", (int)11130, (long)(0x386F56EEC4BD6E81L ^ l10)));
        stringBuilder.append((String)((Object)m44.a("h", (long)-7633569193337977139L, (long)l10)[m44.a("r", (Object)this, (long)-8287946992464759066L, (long)l10)]));
        return stringBuilder.toString();
    }

    @Override
    public void h(Object[] objectArray) {
        block4: {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            PrintWriter printWriter;
            block5: {
                long l10 = (Long)objectArray[0];
                printWriter = (PrintWriter)objectArray[1];
                stringBuilder2 = (StringBuilder)objectArray[2];
                long l11 = l10;
                long l12 = l11 ^ 0x5D3C6484BBF6L;
                long l13 = l11 ^ 0x65C1E45CBF52L;
                long l14 = l11 ^ 0x8A9056647FBL;
                int n10 = (int)(l14 >>> 32);
                int n11 = (int)(l14 << 32 >>> 56);
                int n12 = (int)(l14 << 40 >>> 40);
                stringBuilder = new StringBuilder((int)ib.b("a", (int)28159, (long)(0x14DAA92D34FFC81DL ^ l10)));
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = n12;
                objectArray2[1] = (int)((byte)n11);
                objectArray2[0] = n10;
                CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-636251684499120046L, (long)l10);
                stringBuilder.append((String)((Object)callSite) + " " + (int)m44.a("v", (Object)this, (long)-1375993101535176966L, (long)l10));
                CallSite callSite2 = m44.a("l", (long)-717148981746145583L, (long)l10)[m44.a("v", (Object)this, (long)-1375993101535176966L, (long)l10)];
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l13;
                CallSite callSite3 = m44.a("w", (Object)this, (Object)objectArray3, (long)-1388346946909084418L, (long)l10);
                CallSite callSite4 = m44.a("h", (long)-1142121718372861931L, (long)l10);
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = callSite2;
                objectArray4[1] = callSite3;
                objectArray4[0] = l12;
                callSite3 = m44.a("h", (Object)objectArray4, (long)-1214410100789358428L, (long)l10);
                try {
                    try {
                        if (callSite4 != false) break block4;
                        if (((String)((Object)callSite3)).length() <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-1210031371508853635L, (long)l10);
                    }
                    stringBuilder.append("\t" + (String)((Object)callSite3));
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-1210031371508853635L, (long)l10);
                }
            }
            printWriter.println(stringBuilder2.toString() + stringBuilder2.toString() + stringBuilder);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4372;
        if (d[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ib", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ib.d[n11] = n12;
        }
        return d[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ib.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ib" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ib.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

