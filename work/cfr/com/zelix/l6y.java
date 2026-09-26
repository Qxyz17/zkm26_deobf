/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._e;
import com.zelix.f7;
import com.zelix.lkd;
import com.zelix.m44;
import com.zelix.n9;
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

public class l6y
extends Exception
implements lkd {
    protected boolean U;
    public String[] d;
    public int[][] T;
    public f7 y;
    protected String n;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    public l6y(long l10) {
        l10 = a ^ l10;
        m44.a("p", (Object)this, (String)_e.n, (long)-4431391469198590028L, (long)l10);
        m44.a("p", (Object)this, (boolean)false, (long)-2452793639111367439L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    protected String t(Object[] var1_1) {
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

    /*
     * Unable to fully structure code
     */
    @Override
    public String getMessage() {
        block40: {
            block41: {
                block33: {
                    block39: {
                        block38: {
                            block37: {
                                block29: {
                                    block28: {
                                        var1_1 = l6y.a ^ 98089659421485L;
                                        var3_2 = var1_1 ^ 119688527344681L;
                                        var5_3 = m44.a("m", (long)680422346965750079L, (long)var1_1);
                                        try {
                                            try {
                                                v0 = this;
                                                if (var5_3 != null) break block28;
                                                if (m44.a("s", (Object)v0, (long)1093488164734449192L, (long)var1_1) != false) break block29;
                                            }
                                            catch (n9 v1) {
                                                throw m44.a("m", (Object)v1, (long)901257432984494021L, (long)var1_1);
                                            }
                                            v0 = this;
                                        }
                                        catch (n9 v2) {
                                            throw m44.a("m", (Object)v2, (long)901257432984494021L, (long)var1_1);
                                        }
                                    }
                                    return super.getMessage();
                                }
                                var6_4 = "";
                                var7_5 = 0;
                                var8_6 = 0;
                                while (var8_6 < ((CallSite)m44.a("s", (Object)this, (long)1204954491002605645L, (long)var1_1)).length) {
                                    block32: {
                                        block30: {
                                            block31: {
                                                try {
                                                    v3 = var7_5;
                                                    if (var5_3 != null) break block30;
                                                    if (v3 >= ((CallSite)m44.a("s", (Object)this, (long)1204954491002605645L, (long)var1_1)[var8_6]).length) break block31;
                                                }
                                                catch (n9 v4) {
                                                    throw m44.a("m", (Object)v4, (long)901257432984494021L, (long)var1_1);
                                                }
                                                var7_5 = ((CallSite)m44.a("s", (Object)this, (long)1204954491002605645L, (long)var1_1)[var8_6]).length;
                                            }
                                            v3 = var9_8 = 0;
                                        }
                                        while (var9_8 < ((CallSite)m44.a("s", (Object)this, (long)1204954491002605645L, (long)var1_1)[var8_6]).length) {
                                            var6_4 = var6_4 + (String)m44.a("s", (Object)this, (long)884689726247942592L, (long)var1_1)[m44.a("s", (Object)this, (long)1204954491002605645L, (long)var1_1)[var8_6][var9_8]] + " ";
                                            try {
                                                ++var9_8;
                                                if (var5_3 == null) {
                                                    if (var5_3 == null) continue;
                                                    break;
                                                }
                                                break block32;
                                            }
                                            catch (n9 v5) {
                                                throw m44.a("m", (Object)v5, (long)901257432984494021L, (long)var1_1);
                                            }
                                        }
                                        if (m44.a("s", (Object)this, (long)1204954491002605645L, (long)var1_1)[var8_6][((CallSite)m44.a("s", (Object)this, (long)1204954491002605645L, (long)var1_1)[var8_6]).length - 1] != false) {
                                            var6_4 = var6_4 + (String)l6y.a("d", (int)25733, (long)(8395456250509298671L ^ var1_1));
                                        }
                                        var6_4 = var6_4 + (String)m44.a("s", (Object)this, (long)1178179969067674989L, (long)var1_1) + (String)l6y.a("d", (int)5266, (long)(344408570402733041L ^ var1_1));
                                        ++var8_6;
                                    }
                                    if (var5_3 == null) continue;
                                }
                                var8_7 = m44.a("s", (Object)this, (long)941455654753483371L, (long)var1_1).g;
                                var9_9 = m44.a("s", (Object)this, (long)941455654753483371L, (long)var1_1).X;
                                var10_10 = l6y.a("d", (int)32606, (long)(2719106573323145266L ^ var1_1));
                                for (var11_11 = 0; var11_11 < var7_5; ++var11_11) {
                                    block36: {
                                        block34: {
                                            block35: {
                                                try {
                                                    try {
                                                        v6 = var11_11;
                                                        if (var5_3 != null) break block33;
                                                        if (var5_3 != null) break block34;
                                                    }
                                                    catch (n9 v7) {
                                                        throw m44.a("m", (Object)v7, (long)901257432984494021L, (long)var1_1);
                                                    }
                                                    if (v6 == 0) break block35;
                                                }
                                                catch (n9 v8) {
                                                    throw m44.a("m", (Object)v8, (long)901257432984494021L, (long)var1_1);
                                                }
                                                var10_10 = (String)var10_10 + " ";
                                            }
                                            try {
                                                v9 = var9_9;
                                                if (var5_3 != null) break block36;
                                                v10 = v9.v;
                                            }
                                            catch (n9 v11) {
                                                throw m44.a("m", (Object)v11, (long)901257432984494021L, (long)var1_1);
                                            }
                                        }
                                        if (v10 == 0) {
                                            var10_10 = (String)var10_10 + (String)m44.a("s", (Object)this, (long)884689726247942592L, (long)var1_1)[0];
                                            if (var5_3 == null) break;
                                        }
                                        v12 = new Object[2];
                                        v12[1] = var9_9.g;
                                        v12[0] = var3_2;
                                        var10_10 = (String)var10_10 + (String)m44.a("r", (Object)this, (Object)v12, (long)1691028758188669072L, (long)var1_1);
                                        v9 = var9_9.X;
                                    }
                                    var9_9 = v9;
                                    if (var5_3 == null) continue;
                                }
                                try {
                                    v13 = new StringBuilder().append((String)var10_10).append((String)l6y.a("d", (int)25105, (long)(7393428487919865196L ^ var1_1))).append((String)m44.a("s", (Object)this, (long)1178179969067674989L, (long)var1_1));
                                    v14 = var8_7;
                                    if (var5_3 != null) break block37;
                                    if (v14 == null) break block38;
                                }
                                catch (n9 v15) {
                                    throw m44.a("m", (Object)v15, (long)901257432984494021L, (long)var1_1);
                                }
                                v14 = var8_7;
                            }
                            try {
                                try {
                                    if (var5_3 != null) break block39;
                                    if (v14.length() <= 0) break block38;
                                }
                                catch (n9 v16) {
                                    throw m44.a("m", (Object)v16, (long)901257432984494021L, (long)var1_1);
                                }
                                v14 = (String)l6y.a("d", (int)11436, (long)(2155672144594453441L ^ var1_1)) + var8_7 + "\"" + (String)m44.a("s", (Object)this, (long)1178179969067674989L, (long)var1_1);
                                break block39;
                            }
                            catch (n9 v17) {
                                throw m44.a("m", (Object)v17, (long)901257432984494021L, (long)var1_1);
                            }
                        }
                        v14 = "";
                    }
                    v18 = v13.append(v14).append((String)l6y.a("d", (int)889, (long)(6631164274338589727L ^ var1_1))).append(m44.a("s", (Object)this, (long)941455654753483371L, (long)var1_1).X.P).append((String)l6y.a("d", (int)158, (long)(5927904237331804156L ^ var1_1))).append(m44.a("s", (Object)this, (long)941455654753483371L, (long)var1_1).X.M).append(".").append((String)m44.a("s", (Object)this, (long)1178179969067674989L, (long)var1_1)).toString();
                    if (var5_3 != null) break block41;
                    var10_10 = v18;
                    v6 = ((CallSite)m44.a("s", (Object)this, (long)1204954491002605645L, (long)var1_1)).length;
                }
                if (v6 != 1) ** GOTO lbl123
                var10_10 = (String)var10_10 + (String)l6y.a("d", (int)4504, (long)(7039968222574247652L ^ var1_1)) + (String)m44.a("s", (Object)this, (long)1178179969067674989L, (long)var1_1) + (String)l6y.a("d", (int)8701, (long)(5745222598251302556L ^ var1_1));
                try {
                    if (var5_3 == null) break block40;
lbl123:
                    // 2 sources

                    v18 = (String)var10_10 + (String)l6y.a("d", (int)9440, (long)(4918253370281905028L ^ var1_1)) + (String)m44.a("s", (Object)this, (long)1178179969067674989L, (long)var1_1) + (String)l6y.a("d", (int)8701, (long)(5745222598251302556L ^ var1_1));
                }
                catch (n9 v19) {
                    throw m44.a("m", (Object)v19, (long)901257432984494021L, (long)var1_1);
                }
            }
            var10_10 = v18;
        }
        var10_10 = (String)var10_10 + var6_4;
        return var10_10;
    }

    public l6y(f7 f72, int[][] nArray, long l10, String[] stringArray) {
        l10 = a ^ l10;
        super("");
        m44.a("v", (Object)this, (String)_e.n, (long)-4650381736103460286L, (long)l10);
        m44.a("v", (Object)this, (boolean)true, (long)-6916434246563030777L, (long)l10);
        m44.a("v", (Object)this, (f7)f72, (long)-6755536958442072764L, (long)l10);
        m44.a("v", (Object)this, (int[][])nArray, (long)-4640992701550133406L, (long)l10);
        m44.a("v", (Object)this, (String[])stringArray, (long)-6672022796636875025L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        l6y.a = prr.a(6580040781834662391L, 5437445462690207015L, MethodHandles.lookup().lookupClass()).a(142883756806086L);
                        l6y.e = new HashMap<K, V>(13);
                        var11 = l6y.a ^ 87069586119756L;
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
                        var20_3 = new String[18];
                        var18_4 = 0;
                        var17_5 = "\u0018\u00c1'\u00c42\u00f7\u00b8\u00d6\u00b61\u00a7\u00ee=\u00a4!\u00a2\u0002\u000f]\u00dd\u0017pA\u00dc\u00eb\u00a6\u008c\u00f2X`\u00db^\u00baz\u0015\u008bG\u001d\u00f0\u00a5\u00ee+\u00ef\u00ba\u00d6\u00db6\u00fc z\u008f\u00d663OzP\u008d\u0087I6\u00ffH\u00c0\u0000$R\u00b0\u00fe\u0011\u008fQ\u0093\u00c7\u00b8\u0016\u00c4\u0017u\u00f4\u00b7\u0010*>\u00e0\u00af\u0090\u00d7\u00c9\u00d3\u008b9\u00bb\u009c{\u00a1T\u00f2\u0010j\u0002\u00a9\u00a8\u000b\u00140\u008e\u00d1\u00af\u00fb\u00b6@\u00b9\u00d4K\u0010E\u00d8I\b (\u0019qe\u00ff\u00f1\u00a8\u00c9\u0081\u001d\u0099\u0010Cg+\u0096\u000e\u0000\u0086\u001coj\u00b9Y\u009c\u0016\u0093\u00f0\u0010\u00a8\u00ca\u00bdn1B\u00b7\u00c5`\u0001\u007f\u00df\u00ad\u0006\u008c\u00af\u0010+_\u00d7k\u0010\u00a8lE$5@&^/\u00a7\u00df(\u00d9\u0099!R\u0097m\u00a9r\u001a\u00e6\u00c6\u009f]\u009a\u00e2\u00f3\u00b1D\u00ffe\u00fbv\u00ba+\u0082\u00c38\u00f0\u00be\u00ad\u00d3\u00fdn\u00f7\u008e\u00be.yL*\u0010\u00cfu\u00edW\u0093\u0018\u00c8\u001f\u0010\u0011\u00d1\u00ef+\u00d4\u0087\u00c8 \u001cm2\u00fe\u00cb\u001a\u00a1\u00eb\u00a4\u0085\u00a9pX)N#\u00fa\u00feJ\u00a0\u00feW[\u00b73\u00de\u00f8#\u00cds\u0092\u008d\u0010\u00e2\u00e3\u00f9\u00ba)\u0006\u00b9\u000bt\u008a\u001au\u00bd\u00a9&\u00f2\u0010V\u00a9\u001c\u0007 \u00ae\u00cb\u00a7\u0003\u001f\u00fc\u00ef\u00c5N?\u00dd\u0010*\u00f2\u00f9B\u00e8\u00bf\u0093\u00bb\u00ebLz\u00efn\u00917*\u0018\u00a0\u001fr&0X\u00eb\u00c4\u00a5\u00a0\r\u00d8\u00edVLL\u00a9\u0002\u00a0\b@\u00b0?\u00cc\u00106\u00c6\u0080\u0010_0\u00fd\u00fb\f\u00a9\u009e\u000e\u00f5y\u00b8u";
                        var19_6 = "\u0018\u00c1'\u00c42\u00f7\u00b8\u00d6\u00b61\u00a7\u00ee=\u00a4!\u00a2\u0002\u000f]\u00dd\u0017pA\u00dc\u00eb\u00a6\u008c\u00f2X`\u00db^\u00baz\u0015\u008bG\u001d\u00f0\u00a5\u00ee+\u00ef\u00ba\u00d6\u00db6\u00fc z\u008f\u00d663OzP\u008d\u0087I6\u00ffH\u00c0\u0000$R\u00b0\u00fe\u0011\u008fQ\u0093\u00c7\u00b8\u0016\u00c4\u0017u\u00f4\u00b7\u0010*>\u00e0\u00af\u0090\u00d7\u00c9\u00d3\u008b9\u00bb\u009c{\u00a1T\u00f2\u0010j\u0002\u00a9\u00a8\u000b\u00140\u008e\u00d1\u00af\u00fb\u00b6@\u00b9\u00d4K\u0010E\u00d8I\b (\u0019qe\u00ff\u00f1\u00a8\u00c9\u0081\u001d\u0099\u0010Cg+\u0096\u000e\u0000\u0086\u001coj\u00b9Y\u009c\u0016\u0093\u00f0\u0010\u00a8\u00ca\u00bdn1B\u00b7\u00c5`\u0001\u007f\u00df\u00ad\u0006\u008c\u00af\u0010+_\u00d7k\u0010\u00a8lE$5@&^/\u00a7\u00df(\u00d9\u0099!R\u0097m\u00a9r\u001a\u00e6\u00c6\u009f]\u009a\u00e2\u00f3\u00b1D\u00ffe\u00fbv\u00ba+\u0082\u00c38\u00f0\u00be\u00ad\u00d3\u00fdn\u00f7\u008e\u00be.yL*\u0010\u00cfu\u00edW\u0093\u0018\u00c8\u001f\u0010\u0011\u00d1\u00ef+\u00d4\u0087\u00c8 \u001cm2\u00fe\u00cb\u001a\u00a1\u00eb\u00a4\u0085\u00a9pX)N#\u00fa\u00feJ\u00a0\u00feW[\u00b73\u00de\u00f8#\u00cds\u0092\u008d\u0010\u00e2\u00e3\u00f9\u00ba)\u0006\u00b9\u000bt\u008a\u001au\u00bd\u00a9&\u00f2\u0010V\u00a9\u001c\u0007 \u00ae\u00cb\u00a7\u0003\u001f\u00fc\u00ef\u00c5N?\u00dd\u0010*\u00f2\u00f9B\u00e8\u00bf\u0093\u00bb\u00ebLz\u00efn\u00917*\u0018\u00a0\u001fr&0X\u00eb\u00c4\u00a5\u00a0\r\u00d8\u00edVLL\u00a9\u0002\u00a0\b@\u00b0?\u00cc\u00106\u00c6\u0080\u0010_0\u00fd\u00fb\f\u00a9\u009e\u000e\u00f5y\u00b8u".length();
                        var16_7 = 48;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = l6y.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "@\u0019'V\u0097\u00c1l\u000e\u0086\u00aa \u000f\u00deP\u00e8\u00ec+2\u00f0\u001a\u00bf\u0018L\u0081\u00ff\u000b\u00ca\u0087\u00f4\u00b1`\u00ed\u0010R\u008fW\u00b8\u00c3\f\u00af+'\u00e8\u00c0\u0001;\u001a\u0084\u007f";
                            var19_6 = "@\u0019'V\u0097\u00c1l\u000e\u0086\u00aa \u000f\u00deP\u00e8\u00ec+2\u00f0\u001a\u00bf\u0018L\u0081\u00ff\u000b\u00ca\u0087\u00f4\u00b1`\u00ed\u0010R\u008fW\u00b8\u00c3\f\u00af+'\u00e8\u00c0\u0001;\u001a\u0084\u007f".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = l6y.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
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
                l6y.b = var20_3;
                l6y.c = new String[18];
                l6y.h = new HashMap<K, V>(13);
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
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "\u00b30~\u0002\u00d5\u00c6\u00c2\u0085\u00cb\u00f9y`+M@\u00a3\u00ceB}\u00b0A\u00a0\u00d8\u00b0";
                var5_15 = "\u00b30~\u0002\u00d5\u00c6\u00c2\u0085\u00cb\u00f9y`+M@\u00a3\u00ceB}\u00b0A\u00a0\u00d8\u00b0".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        l6y.f = var6_12;
        l6y.g = new Integer[3];
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6986;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/l6y", exception);
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
            l6y.c[n11] = l6y.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = l6y.a(n10, l10);
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
            throw new RuntimeException("com/zelix/l6y" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7C8E;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/l6y", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            l6y.g[n11] = n12;
        }
        return g[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = l6y.b(n10, l10);
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
            throw new RuntimeException("com/zelix/l6y" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(l6y.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(l6y.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

