/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._e;
import com.zelix.lkt;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.rc;
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

public class lma
extends Exception
implements rc {
    int E;
    public int[][] z;
    public String[] t;
    public lkt h;
    protected boolean Y;
    protected String X;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /*
     * Exception decompiling
     */
    protected String L(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[TRYBLOCK]], but top level block is 15[SWITCH]
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

    public lma(lkt lkt2, int[][] nArray, long l10, String[] stringArray, int n10) {
        l10 = a ^ l10;
        super("");
        m44.a("u", (Object)this, (String)_e.n, (long)7746009164692430014L, (long)l10);
        m44.a("u", (Object)this, (boolean)true, (long)8114034924172034247L, (long)l10);
        m44.a("u", (Object)this, (lkt)lkt2, (long)7638804449886720129L, (long)l10);
        m44.a("u", (Object)this, (int[][])nArray, (long)8481783390187006524L, (long)l10);
        m44.a("u", (Object)this, (String[])stringArray, (long)7988534838893836344L, (long)l10);
        m44.a("u", (Object)this, (int)n10, (long)7655835117268651890L, (long)l10);
    }

    public lma(long l10) {
        l10 = a ^ l10;
        m44.a("v", (Object)this, (String)_e.n, (long)7533496839312875341L, (long)l10);
        m44.a("v", (Object)this, (boolean)false, (long)8316414563021964084L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    @Override
    public String getMessage() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [43[TRYBLOCK]], but top level block is 58[SWITCH]
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
        block21: {
            block20: {
                block19: {
                    block18: {
                        lma.a = prr.a(3350899681341765612L, 8125028754992892552L, MethodHandles.lookup().lookupClass()).a(150259523451605L);
                        lma.d = new HashMap<K, V>(13);
                        var11 = lma.a ^ 36660392361153L;
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
                        var20_3 = new String[22];
                        var18_4 = 0;
                        var17_5 = "yob\u001a\u00f5\u00c4W`\u00e0\u00bc\u00c5H\u000f\u0088C\u0095^\u0006\u00fb\u000bt\u001d\u0000\u0019\u00ec\u008e\u00c4\u00b9\u00ba%dqKn\u0002\u00cb\u009d\b\u0000\u000f\u000b{`MS\u0095\u00a4\u00a6\u0010}4\u00ae\u00b4\u00b7u\u0093\u00e2\u00dd\u00af38\u00c0\u00d6\u0003\u009e\u0018\u008d~\u00e3\u0012Z,|\u0094\u00bb\u0014\u00bf\u00d7\u00ca\u00ec\u001f\u001e\u00dd\u00be\u00b5\u00b5N\u00eaj\u0099 \u00ef\u00c0.\u001aj\u00bc\u00eb\u00f3\u0096S#\u0016\u00e6iXh\u00b2c\u0018\u00a6\u00d82K,\u00d4\u00f7\u00d4\u0083\u00d6uF\u00a2\u0010{\u00e9AU\u0005P!w\u00f1)\u00eae\u00d0 \u00cbo\u0010f\u00c7\u009d\u00ee\u0012P\u00c1(j:Q\u00f7\u0083=\u00c1F g\u009d\u001c\u0085\u0016'\u0092\u00e51jW;\u0089\u00f5|\u00dfA\n\u00e4\u00b1}K\u000b\u00a0E\u009c\u00d9\u00aa\u00f4\u0018\u00eb\u00e8\u0010\u00d6\u00bcqv\u0086\u00e9\u00d8\u00a9\u0088\u00bd\u00d6\u00ebsG-d\u0010\u000fJ_)\u00b7\u00e8\u00d7\u00ac\u00ec\u0010DX\u00ef\u0019O1\u0010k\u00a7\u00d5W\u00df\u00e9\u00142\u00c0uL\u00b0\u00f7{.6\u00182I\u008b+\u00d5\u000e\u0017\f~\u00a7\u0018q\u008f\u00fa\u00e8\u00e7\u00b1]X\u00fe\u001a\u00bbgn(\u0090#\u0001\u00c5\u001d\u00e6WReF\u00d8^\u00c7*5{\u00e3\u0087'~;\u00dd(r\u009c)W4\u00d3Y\u00e1s)\u00bd={h\u0096[\u009c\u00104\u00f3\u00e9\u008f<\u0003x\u0089\u00afL\u00f0\u00af\u0091\u00c1\u00dc\u00c7\u0010u\u0095=\u00e4\u00bb\u00e5\u008b\u000f5\u00c7D^P\u0012z\u0002 \u00cek\u00f0U\u0083\u00df\u0016\u00de\u00fb\u00dfT\u001f\u00d6,\u0010\u0011\u00b3\u008e\u00de\u00a8\u0083\u00a6\u009d\u00a5\u001c\u00de\u00e3\u00d4\u00baV,w\u0010a\u00e0\u00e4u\u0011GoC;\u00c0o1?\u00b1:\u00e3\u0010\u0001\u00cc\u00bf\u00d6UM0-\u00a7\u00e2\u00d6\u00f0LD\u00d5\u00ad\u0010\u00d3\u00c8\u00e9_0\u008f\u0099\u00c0\u0087\u00f9\u00b9\u0092v\u00b9=\u00ee\u0010\u00b3\u0099\u00ffB\u001d\u0010\u00fe\u00c4\u00a72\u0002\u008c\u00daC\u00ea\u001a\u0010\u0002Z\u00a99\u0000?.\u00f6\u0096\u0099\u00d0\u0092XI\u00e1y";
                        var19_6 = "yob\u001a\u00f5\u00c4W`\u00e0\u00bc\u00c5H\u000f\u0088C\u0095^\u0006\u00fb\u000bt\u001d\u0000\u0019\u00ec\u008e\u00c4\u00b9\u00ba%dqKn\u0002\u00cb\u009d\b\u0000\u000f\u000b{`MS\u0095\u00a4\u00a6\u0010}4\u00ae\u00b4\u00b7u\u0093\u00e2\u00dd\u00af38\u00c0\u00d6\u0003\u009e\u0018\u008d~\u00e3\u0012Z,|\u0094\u00bb\u0014\u00bf\u00d7\u00ca\u00ec\u001f\u001e\u00dd\u00be\u00b5\u00b5N\u00eaj\u0099 \u00ef\u00c0.\u001aj\u00bc\u00eb\u00f3\u0096S#\u0016\u00e6iXh\u00b2c\u0018\u00a6\u00d82K,\u00d4\u00f7\u00d4\u0083\u00d6uF\u00a2\u0010{\u00e9AU\u0005P!w\u00f1)\u00eae\u00d0 \u00cbo\u0010f\u00c7\u009d\u00ee\u0012P\u00c1(j:Q\u00f7\u0083=\u00c1F g\u009d\u001c\u0085\u0016'\u0092\u00e51jW;\u0089\u00f5|\u00dfA\n\u00e4\u00b1}K\u000b\u00a0E\u009c\u00d9\u00aa\u00f4\u0018\u00eb\u00e8\u0010\u00d6\u00bcqv\u0086\u00e9\u00d8\u00a9\u0088\u00bd\u00d6\u00ebsG-d\u0010\u000fJ_)\u00b7\u00e8\u00d7\u00ac\u00ec\u0010DX\u00ef\u0019O1\u0010k\u00a7\u00d5W\u00df\u00e9\u00142\u00c0uL\u00b0\u00f7{.6\u00182I\u008b+\u00d5\u000e\u0017\f~\u00a7\u0018q\u008f\u00fa\u00e8\u00e7\u00b1]X\u00fe\u001a\u00bbgn(\u0090#\u0001\u00c5\u001d\u00e6WReF\u00d8^\u00c7*5{\u00e3\u0087'~;\u00dd(r\u009c)W4\u00d3Y\u00e1s)\u00bd={h\u0096[\u009c\u00104\u00f3\u00e9\u008f<\u0003x\u0089\u00afL\u00f0\u00af\u0091\u00c1\u00dc\u00c7\u0010u\u0095=\u00e4\u00bb\u00e5\u008b\u000f5\u00c7D^P\u0012z\u0002 \u00cek\u00f0U\u0083\u00df\u0016\u00de\u00fb\u00dfT\u001f\u00d6,\u0010\u0011\u00b3\u008e\u00de\u00a8\u0083\u00a6\u009d\u00a5\u001c\u00de\u00e3\u00d4\u00baV,w\u0010a\u00e0\u00e4u\u0011GoC;\u00c0o1?\u00b1:\u00e3\u0010\u0001\u00cc\u00bf\u00d6UM0-\u00a7\u00e2\u00d6\u00f0LD\u00d5\u00ad\u0010\u00d3\u00c8\u00e9_0\u008f\u0099\u00c0\u0087\u00f9\u00b9\u0092v\u00b9=\u00ee\u0010\u00b3\u0099\u00ffB\u001d\u0010\u00fe\u00c4\u00a72\u0002\u008c\u00daC\u00ea\u001a\u0010\u0002Z\u00a99\u0000?.\u00f6\u0096\u0099\u00d0\u0092XI\u00e1y".length();
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
                            var20_3[var18_4++] = lma.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "S?\u0018\u00edd@J\u00b4\u00f4\u00dd\u00d9,\u00dd\u00ea\u0002T\u00cd\u0002\u00cb!\u00b9\u0016M\u00c4\u0092\u0011\u00cd\u00d8_\u00b7\u00d5 \u0010\u00e8\u00c5\u00fc\u0007\u0094\f\u008a\u0088|\u0011a\u008bn\u009f\u00af\u0093";
                            var19_6 = "S?\u0018\u00edd@J\u00b4\u00f4\u00dd\u00d9,\u00dd\u00ea\u0002T\u00cd\u0002\u00cb!\u00b9\u0016M\u00c4\u0092\u0011\u00cd\u00d8_\u00b7\u00d5 \u0010\u00e8\u00c5\u00fc\u0007\u0094\f\u008a\u0088|\u0011a\u008bn\u009f\u00af\u0093".length();
                            var16_7 = 32;
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
                            var20_3[var18_4++] = lma.a(var21_9).intern();
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
                lma.b = var20_3;
                lma.c = new String[22];
                lma.g = new HashMap<K, V>(13);
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
                var6_12 = new long[23];
                var3_13 = 0;
                var4_14 = "\u0004\u0098\u00d5r\u00ebn\u00a3u\u00cf\u000e`Z`S)X[\u00b6LL\u007f)'\u00f0\u00e2i\u00a3!\u001a\u00e0~\u00b3\u00c1\u00cf\u00fb/\u008b\u00fb\u00e1\u00e9\u00fc\u0080\u00aa\u00af\u00ea\bN-\u00a8\u00dbS7\u0097\u0082J\u00ab\\\u00ef\u0094\u00d1U\u0003KE\u0018P\u00ae%\u00c6O\u00ab\u00dd]t~\u00e1\u00a5\u00a6dO\u00c3mh\u00eaW\u00efM\u0098\u0093\u00ea!\u00b8\u0001L\u00be\u0085M#\u00fa\u00fb\u0090\u000e\u000b\u00acZ\u00da\u0018\u00b8%\u00bf\u00b2\u00c0\u00c0|\u0087\u00a6\u00f74\u00d8\u007f\u0003\u00d49e=(\u00e1x\u008ahY\u00b7L\u00c6\u008c\u00972\u001f\u00fdT\u00c4\u001b5G\u0082@\u000e\u0083\u00ad\u00a47J\u00e8!\u00b8\u00f2xZ\u00a0\u0011!V\u00c1_q\u00ce,\u001f";
                var5_15 = "\u0004\u0098\u00d5r\u00ebn\u00a3u\u00cf\u000e`Z`S)X[\u00b6LL\u007f)'\u00f0\u00e2i\u00a3!\u001a\u00e0~\u00b3\u00c1\u00cf\u00fb/\u008b\u00fb\u00e1\u00e9\u00fc\u0080\u00aa\u00af\u00ea\bN-\u00a8\u00dbS7\u0097\u0082J\u00ab\\\u00ef\u0094\u00d1U\u0003KE\u0018P\u00ae%\u00c6O\u00ab\u00dd]t~\u00e1\u00a5\u00a6dO\u00c3mh\u00eaW\u00efM\u0098\u0093\u00ea!\u00b8\u0001L\u00be\u0085M#\u00fa\u00fb\u0090\u000e\u000b\u00acZ\u00da\u0018\u00b8%\u00bf\u00b2\u00c0\u00c0|\u0087\u00a6\u00f74\u00d8\u007f\u0003\u00d49e=(\u00e1x\u008ahY\u00b7L\u00c6\u008c\u00972\u001f\u00fdT\u00c4\u001b5G\u0082@\u000e\u0083\u00ad\u00a47J\u00e8!\u00b8\u00f2xZ\u00a0\u0011!V\u00c1_q\u00ce,\u001f".length();
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
                    var4_14 = "h\u001b\n\u00b1\u00d1\u00e7\u00d3\u00ac\u00ef\u0093UL\u001b\u00ab\u00ca\u00cf";
                    var5_15 = "h\u001b\n\u00b1\u00d1\u00e7\u00d3\u00ac\u00ef\u0093UL\u001b\u00ab\u00ca\u00cf".length();
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
        lma.e = var6_12;
        lma.f = new Integer[23];
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x34FE;
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
                throw new RuntimeException("com/zelix/lma", exception);
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
            lma.c[n11] = lma.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lma.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lma" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2820;
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
                throw new RuntimeException("com/zelix/lma", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lma.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lma.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lma" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lma.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lma.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

