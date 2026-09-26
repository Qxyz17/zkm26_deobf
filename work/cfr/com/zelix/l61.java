/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
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

public class l61 {
    private static final int w;
    private static final String X;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public static boolean e(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                boolean bl3 = ((Integer)objectArray[0]).intValue();
                long l10 = (Long)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("h", (long)920550978141688560L, (long)l10);
                try {
                    try {
                        bl2 = bl3;
                        if (callSite != null) break block4;
                        if (bl2 < l61.b("n", (int)23937, (long)(0x704E85BC83F1484L ^ l10))) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)1330691913458777690L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)1330691913458777690L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static int I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("k", (long)-8557437522255624775L, (long)l10);
    }

    public static boolean u(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                boolean bl3 = ((Integer)objectArray[1]).intValue();
                l10 = a ^ l10;
                CallSite callSite = m44.a("h", (long)-1027320648392183928L, (long)l10);
                try {
                    try {
                        bl2 = bl3;
                        if (callSite != null) break block4;
                        if (bl2 < l61.b("n", (int)12270, (long)(0xAE6AF287F51B91L ^ l10))) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)-1220514728093220062L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)-1220514728093220062L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static boolean Z(long l10, int n10) {
        boolean bl2;
        block4: {
            block5: {
                l10 = a ^ l10;
                CallSite callSite = m44.a("m", (long)-3194397803462406755L, (long)l10);
                try {
                    try {
                        bl2 = n10;
                        if (callSite != null) break block4;
                        if (bl2 < l61.b("n", (int)19155, (long)(0x4D3EFD506896DCB7L ^ l10))) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)-3667375829318229705L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)-3667375829318229705L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static boolean n(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("h", (long)2244537376776388880L, (long)l10);
                try {
                    try {
                        object = m44.a("l", (long)401541826133707030L, (long)l10);
                        if (callSite != null) break block4;
                        if (object < l61.b("n", (int)21438, (long)(0x144DD90C52DD0949L ^ l10))) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)114797639663349178L, (long)l10);
                    }
                    object = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)114797639663349178L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public static boolean x(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                boolean bl3 = ((Integer)objectArray[0]).intValue();
                long l10 = (Long)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("j", (long)3426250124950122938L, (long)l10);
                try {
                    try {
                        bl2 = bl3;
                        if (callSite != null) break block4;
                        if (bl2 < l61.b("n", (int)11436, (long)(0x4C8063BE27A146EBL ^ l10))) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)3548160683059043600L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)3548160683059043600L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static boolean w(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("n", (long)8383497682547862126L, (long)l10);
                try {
                    try {
                        object = m44.a("j", (long)7992913292389655144L, (long)l10);
                        if (callSite != null) break block4;
                        if (object < l61.b("n", (int)17053, (long)(0x7A104792AF8BF310L ^ l10))) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)7703917039817361092L, (long)l10);
                    }
                    object = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)7703917039817361092L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public static boolean T(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                boolean bl3 = ((Integer)objectArray[0]).intValue();
                long l10 = (Long)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("h", (long)1098357659225559304L, (long)l10);
                try {
                    try {
                        bl2 = bl3;
                        if (callSite != null) break block4;
                        if (bl2 < l61.b("n", (int)13212, (long)(0x1E1B492B6EC1796CL ^ l10))) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)1265444952097160610L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)1265444952097160610L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public static int A(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 4[SWITCH]
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

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    l61.a = prr.a(9082824362887007493L, 3011105699164815745L, MethodHandles.lookup().lookupClass()).a(68485393161632L);
                    var20 = l61.a ^ 128696221497302L;
                    l61.d = new HashMap<K, V>(13);
                    var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var20 >>> 56);
                    for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                        v2 = v2;
                        v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                    }
                    var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var18_3 = new String[3];
                    var16_4 = 0;
                    var15_5 = "8nT\u00fc\u00c8\u00f5\u00abtQ\u00d1\u00e9C:\u00f0>\u00e6\u00b8\u00b7\u00c3\u00c3gK\r\u0003\u00ff\u00aff\u00d8\b\u00ed\u001a\u0014\u00b7\u0099U\u0090\u00d7\u00fd\u00ec\u00be\u0010O\u00dc\u00b5\u00ed\u00fdeQ\u008fwq\u00f2&\u008fuhx8a\u00ca6}\u00ee\u009eZx\u00e6\u001b\u00dd\u00b4$\u00d31\u00ddA\u001f\u00e4\u0083T\u00e9\u00c7\u0006G\u00d2\u00e09F\u0095z\u00d6z>\u00a6\u00c4\u00ab\u001b\u0018(\bC/)\u00e3\u0007\u00f4V\u00b8\u0005A\u00c0\u00f5\u00ff\bf";
                    var17_6 = "8nT\u00fc\u00c8\u00f5\u00abtQ\u00d1\u00e9C:\u00f0>\u00e6\u00b8\u00b7\u00c3\u00c3gK\r\u0003\u00ff\u00aff\u00d8\b\u00ed\u001a\u0014\u00b7\u0099U\u0090\u00d7\u00fd\u00ec\u00be\u0010O\u00dc\u00b5\u00ed\u00fdeQ\u008fwq\u00f2&\u008fuhx8a\u00ca6}\u00ee\u009eZx\u00e6\u001b\u00dd\u00b4$\u00d31\u00ddA\u001f\u00e4\u0083T\u00e9\u00c7\u0006G\u00d2\u00e09F\u0095z\u00d6z>\u00a6\u00c4\u00ab\u001b\u0018(\bC/)\u00e3\u0007\u00f4V\u00b8\u0005A\u00c0\u00f5\u00ff\bf".length();
                    var14_7 = 40;
                    var13_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var18_3[var16_4++] = l61.a(var19_9).intern();
                        if ((var13_8 += var14_7) < var17_6) {
                            var14_7 = var15_5.charAt(var13_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var13_8;
                    var19_9 = var11_1.doFinal(var15_5.substring(v3, v3 + var14_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                l61.b = var18_3;
                l61.c = new String[3];
                l61.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[33];
                var3_13 = 0;
                var4_14 = "\u00ce\u00f6\u0080?\u001e\u0014\u00c0F~`\u00da7ih9\u009c\u00e73<>\u00f5\u008c\u00c6\u0097\u00a6:\u000b\u00e7W\u00ad?\u00a6\u0002\u00d9\u00ae\u00ae7.0\u001f\b\u00cf\u0098\u00bdc\u0095\u00dc\u00db(\u00ce\u00d5I\u00e5\u009c&\u0005\u00f0\u001a\u009b\u00e6v\u0006\u001c\u00f9\u00e6\u0001\u0080\u00dbl\u0091\u0012\u0006\u00c5\u0095_Q@\u00b9\f\u0081\u0090\u00f7a\u00f7[\u00fa\u009eA\u00f2QK>\u00a7L\u0084?\u001f\u00d6\u0016\u00f4U\u00a3\u009dG+j\u008b\u009ao\u00c9IA\u0086\u001e\u00a5\u00b6^\u0081\u00f3O\u008e%z\u0017M\u00bey\u009ac\u0007\u00a3\u00bb\u0083\u00ba\u0092\u00a5\u009cnAG>\u009c}\u00f2\u00ac}\u00e1\u00af\u00d3\u00df\u00bdg\u00cb\u0097\u0097;\u0012\u00b0\u00c90a\u0095V\u00ed\u0019\u00d0u\u00de1\u00c2\u00fe1\u0018G\u00dd!\u00e9\u00e9\u000e\u00f4\u00fd\u00b5R\u0014\u00b7\u0000{G<\u000f\u00b7`\u00b8%dD\u008f\u001e\u0001\u00f2\u00c2\u0089\u00a4y_\u00801\u00dd\u0087\u009c~\u0085d\u00b0\u0082\u00caD\u00f7\u0006Z\u00ea/\u00cb\u00d8\u00a0\u0098B\u00b5\u0005\u00ec\u0089\u00d5\u001b\u00c0!\u001c8\u0097<}.\u00f1,\u0004\u00b4\u00c7\u0093\u00bc";
                var5_15 = "\u00ce\u00f6\u0080?\u001e\u0014\u00c0F~`\u00da7ih9\u009c\u00e73<>\u00f5\u008c\u00c6\u0097\u00a6:\u000b\u00e7W\u00ad?\u00a6\u0002\u00d9\u00ae\u00ae7.0\u001f\b\u00cf\u0098\u00bdc\u0095\u00dc\u00db(\u00ce\u00d5I\u00e5\u009c&\u0005\u00f0\u001a\u009b\u00e6v\u0006\u001c\u00f9\u00e6\u0001\u0080\u00dbl\u0091\u0012\u0006\u00c5\u0095_Q@\u00b9\f\u0081\u0090\u00f7a\u00f7[\u00fa\u009eA\u00f2QK>\u00a7L\u0084?\u001f\u00d6\u0016\u00f4U\u00a3\u009dG+j\u008b\u009ao\u00c9IA\u0086\u001e\u00a5\u00b6^\u0081\u00f3O\u008e%z\u0017M\u00bey\u009ac\u0007\u00a3\u00bb\u0083\u00ba\u0092\u00a5\u009cnAG>\u009c}\u00f2\u00ac}\u00e1\u00af\u00d3\u00df\u00bdg\u00cb\u0097\u0097;\u0012\u00b0\u00c90a\u0095V\u00ed\u0019\u00d0u\u00de1\u00c2\u00fe1\u0018G\u00dd!\u00e9\u00e9\u000e\u00f4\u00fd\u00b5R\u0014\u00b7\u0000{G<\u000f\u00b7`\u00b8%dD\u008f\u001e\u0001\u00f2\u00c2\u0089\u00a4y_\u00801\u00dd\u0087\u009c~\u0085d\u00b0\u0082\u00caD\u00f7\u0006Z\u00ea/\u00cb\u00d8\u00a0\u0098B\u00b5\u0005\u00ec\u0089\u00d5\u001b\u00c0!\u001c8\u0097<}.\u00f1,\u0004\u00b4\u00c7\u0093\u00bc".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00e81\u0002\u009cg\u00b2\u0085\u00b6~\u00fe\u00d9\u00963\u00d5x\u00b5";
                    var5_15 = "\u00e81\u0002\u009cg\u00b2\u0085\u00b6~\u00fe\u00d9\u00963\u00d5x\u00b5".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl71:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl84:
                // 1 sources

                ** continue;
            }
        }
        l61.e = var6_12;
        l61.f = new Integer[33];
        l61.X = m44.a("n", (Object)l61.a("h", (int)4863, (long)(970348354044549654L ^ var20)), (long)274707486393722992L, (long)var20);
        var22_20 = m44.a("q", (Object)m44.a("j", (long)1734360547239028077L, (long)var20), (Object)l61.a("h", (int)17411, (long)(2406004972018306283L ^ var20)), (long)2098444906452580547L, (long)var20);
        l61.w = Integer.parseInt((String)var22_20[0]);
    }

    public static boolean v(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                boolean bl3 = ((Integer)objectArray[0]).intValue();
                long l10 = (Long)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("n", (long)6230849204274743374L, (long)l10);
                try {
                    try {
                        bl2 = bl3;
                        if (callSite != null) break block4;
                        if (bl2 < l61.b("n", (int)24571, (long)(0x46CF6ABEDE2A4C4BL ^ l10))) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)5244874238328153316L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)5244874238328153316L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static boolean g(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                boolean bl3 = ((Integer)objectArray[0]).intValue();
                long l10 = (Long)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("j", (long)-5515725619644617406L, (long)l10);
                try {
                    try {
                        bl2 = bl3;
                        if (callSite != null) break block4;
                        if (bl2 < l61.b("n", (int)17053, (long)(0x7A1059EE1297343CL ^ l10))) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)-5925099079079542296L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)-5925099079079542296L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static boolean m(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("m", (long)-7103511586500934819L, (long)l10);
                try {
                    try {
                        object = m44.a("i", (long)-8655950185323771045L, (long)l10);
                        if (callSite != null) break block4;
                        if (object < l61.b("n", (int)30825, (long)(0x52CCDA0C5E1020CBL ^ l10))) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)-8945656447530012681L, (long)l10);
                    }
                    object = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)-8945656447530012681L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x45F8;
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
                throw new RuntimeException("com/zelix/l61", exception);
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
            l61.c[n11] = l61.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = l61.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/l61" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4B9F;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/l61", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            l61.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = l61.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/l61" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(l61.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(l61.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

