/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._x;
import com.zelix.ds;
import com.zelix.dx;
import com.zelix.lb6;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.v8;
import com.zelix.y5;
import com.zelix.yf;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cn {
    private dx d;
    private List O;
    private boolean v;
    private String e;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    public void z(Object[] objectArray) {
        block6: {
            ZipOutputStream zipOutputStream = (ZipOutputStream)objectArray[0];
            Long l10 = (Long)objectArray[1];
            v8 v82 = (v8)objectArray[2];
            v8 v83 = (v8)objectArray[3];
            _x _x2 = (_x)objectArray[4];
            long l11 = (Long)objectArray[5];
            boolean bl2 = (Boolean)objectArray[6];
            yf yf2 = (yf)objectArray[7];
            long l12 = l11 = a ^ l11;
            long l13 = l12 ^ 0x2E9629904107L;
            long l14 = l12 ^ 0x5DF088918D53L;
            long l15 = l12 ^ 0x5BE8C1663D59L;
            long l16 = l12 ^ 0x67058856933BL;
            long l17 = l12 ^ 0x67058856933BL;
            long l18 = l12 ^ 0x34BC4AD07A9EL;
            y5 y52 = new y5(l18, zipOutputStream, (String)((Object)cn.a("b", (int)755, (long)(0x12FDC376DCDBB324L ^ l11))), bl2);
            CallSite callSite = m44.a("i", (long)-8601688309699885882L, (long)l11);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l14;
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)((Object)m44.a("v", (Object)y52, (Object)objectArray2, (long)-7753667276458579629L, (long)l11)), (String)((Object)cn.a("b", (int)6852, (long)(0x6E71A28363A52B14L ^ l11)))));
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = v82;
            objectArray3[0] = l13;
            CallSite callSite2 = m44.a("i", (Object)objectArray3, (long)-8376790063219610875L, (long)l11);
            Object[] objectArray4 = new Object[8];
            objectArray4[7] = yf2;
            objectArray4[6] = (boolean)callSite2;
            objectArray4[5] = m44.a("w", (Object)this, (long)-7982066593219679888L, (long)l11);
            objectArray4[4] = l17;
            objectArray4[3] = _x2;
            objectArray4[2] = v83;
            objectArray4[1] = v82;
            objectArray4[0] = printWriter;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)-7756773719047303156L, (long)l11), (Object)objectArray4, (long)-7551994823796430970L, (long)l11);
            int n10 = 0;
            CallSite callSite3 = callSite;
            block2: while (n10 < m44.a("w", (Object)this, (long)-8542198469113365917L, (long)l11).size()) {
                ds ds2 = (ds)m44.a("w", (Object)this, (long)-8542198469113365917L, (long)l11).get(n10);
                try {
                    Object[] objectArray5 = new Object[8];
                    objectArray5[7] = yf2;
                    objectArray5[6] = (boolean)callSite2;
                    objectArray5[5] = m44.a("w", (Object)this, (long)-7982066593219679888L, (long)l11);
                    objectArray5[4] = l16;
                    objectArray5[3] = _x2;
                    objectArray5[2] = v83;
                    objectArray5[1] = v82;
                    objectArray5[0] = printWriter;
                    m44.a("v", (Object)ds2, (Object)objectArray5, (long)-7761856069819105484L, (long)l11);
                    ++n10;
                    do {
                        CallSite callSite4 = callSite3;
                        if (l11 >= 0L) {
                            if (callSite4 == null) break block6;
                            callSite4 = callSite3;
                        }
                        if (callSite4 != null) continue block2;
                    } while (l11 < 0L);
                    break;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("i", (Object)numberFormatException, (long)-7744168399065939746L, (long)l11);
                }
            }
            m44.a("v", (Object)printWriter, (long)-8416017948647045159L, (long)l11);
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = l15;
            objectArray6[0] = l10;
            m44.a("v", (Object)y52, (Object)objectArray6, (long)-8630450371925806404L, (long)l11);
        }
    }

    public boolean A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x2993262E0537L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)-4407052532451916159L, (long)l10), (Object)objectArray2, (long)-2359310132257252522L, (long)l10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public cn(ZipFile var1_1, ZipEntry var2_2, long var3_3) {
        block40: {
            block37: {
                block35: {
                    block36: {
                        v0 = var3_3 = cn.a ^ var3_3;
                        var5_4 = v0 ^ 70731664040805L;
                        v1 = v0 ^ 113190092520383L;
                        var7_5 = v1 >>> 32;
                        var9_6 = (int)(v1 << 32 >>> 32);
                        var10_7 = v0 ^ 111783320521411L;
                        var12_8 = v0 ^ 105590036108392L;
                        var14_9 = v0 ^ 21916483995480L;
                        v2 = m44.a("o", (long)-3936432500879194824L, (long)var3_3);
                        super();
                        m44.a("s", (Object)this, new ArrayList<E>(), (long)-3996290797046400099L, (long)var3_3);
                        var16_10 = v2;
                        var17_11 = null;
                        var18_12 = null;
                        m44.a("s", (Object)this, (String)m44.a("p", (Object)var1_1, (long)-3597571678382659823L, (long)var3_3), (long)-3403505498398480242L, (long)var3_3);
                        v3 = this;
                        v4 /* !! */  = m44.a("p", (Object)var2_2, (long)-3125401803868797184L, (long)var3_3);
                        if (var16_10 == null) break block35;
                        try {
                            block42: {
                                if (v4 /* !! */  != cn.b("v", (int)20062, (long)(7307472197930100016L ^ var3_3))) break block36;
                                break block42;
                                catch (IOException v5) {
                                    throw m44.a("o", (Object)v5, (long)-3064278784088686304L, (long)var3_3);
                                }
                            }
                            v4 /* !! */  = (CallSite)true;
                            break block35;
                        }
                        catch (IOException v6) {
                            throw m44.a("o", (Object)v6, (long)-3064278784088686304L, (long)var3_3);
                        }
                    }
                    v4 /* !! */  = (CallSite)false;
                }
                m44.a("s", (Object)v3, (boolean)v4 /* !! */ , (long)-3547386568195517608L, (long)var3_3);
                try {
                    var17_11 = m44.a("p", (Object)var1_1, (Object)var2_2, (long)-3789157015677833566L, (long)var3_3);
                    v7 = new Object[4];
                    v7[3] = null;
                    v7[2] = cn.a("b", (int)9778, (long)(773115330881836569L ^ var3_3));
                    v7[1] = var17_11;
                    v7[0] = var12_8;
                    var18_12 = m44.a("o", (Object)v7, (long)-3543397971938400466L, (long)var3_3);
                    m44.a("s", (Object)this, (dx)new dx((BufferedReader)var18_12, var7_5, var9_6), (long)-3052255174628748814L, (long)var3_3);
                    v8 = new Object[1];
                    v8[0] = var10_7;
                    var19_13 = m44.a("p", (Object)m44.a("q", (Object)this, (long)-3052255174628748814L, (long)var3_3), (Object)v8, (long)-3871412134470407026L, (long)var3_3);
                    while (var19_13 == false) {
                        block38: {
                            block39: {
                                block43: {
                                    var20_16 = new ds(var14_9, (BufferedReader)var18_12);
                                    if (var3_3 < 0L || var16_10 == null) break block37;
                                    v9 = new Object[1];
                                    v9[0] = var5_4;
                                    v10 = m44.a("p", (Object)var20_16, (Object)v9, (long)-3270370981398712662L, (long)var3_3);
                                    if (var16_10 == null) break block38;
                                    break block43;
                                    catch (IOException v11) {
                                        throw m44.a("o", (Object)v11, (long)-3064278784088686304L, (long)var3_3);
                                    }
                                }
                                try {
                                    block44: {
                                        if (v10 != false) break block39;
                                        break block44;
                                        catch (IOException v12) {
                                            throw m44.a("o", (Object)v12, (long)-3064278784088686304L, (long)var3_3);
                                        }
                                    }
                                    m44.a("q", (Object)this, (long)-3996290797046400099L, (long)var3_3).add(var20_16);
                                }
                                catch (IOException v13) {
                                    throw m44.a("o", (Object)v13, (long)-3064278784088686304L, (long)var3_3);
                                }
                            }
                            v14 = new Object[1];
                            v14[0] = var10_7;
                            v10 = var19_13 = m44.a("p", (Object)var20_16, (Object)v14, (long)-3871412134470407026L, (long)var3_3);
                        }
                        if (var16_10 != null) continue;
                    }
                }
                catch (Throwable var21_17) {
                    block41: {
                        try {
                            if (var3_3 <= 0L) break block41;
                            v15 = var18_12;
                            if (var16_10 == null) ** GOTO lbl94
                            if (v15 != null) {
                            }
                            ** GOTO lbl100
                        }
                        catch (IOException v16) {
                            throw m44.a("o", (Object)v16, (long)-3064278784088686304L, (long)var3_3);
                        }
                        try {
                            v15 = var18_12;
lbl94:
                            // 2 sources

                            m44.a("p", v15, (long)-3372658661534342797L, (long)var3_3);
                            break block41;
                        }
                        catch (IOException var22_18) {
                            try {
                                try {
                                    if (var3_3 >= 0L && var16_10 != null) break block41;
lbl100:
                                    // 2 sources

                                    if (var3_3 <= 0L) break block41;
                                    v17 = var17_11;
                                    if (var16_10 != null) {
                                    }
                                    ** GOTO lbl113
                                }
                                catch (IOException v18) {
                                    throw m44.a("o", (Object)v18, (long)-3064278784088686304L, (long)var3_3);
                                }
                                if (v17 == null) break block41;
                            }
                            catch (IOException v19) {
                                throw m44.a("o", (Object)v19, (long)-3064278784088686304L, (long)var3_3);
                            }
                        }
                        try {
                            v17 = var17_11;
lbl113:
                            // 2 sources

                            m44.a("p", (Object)v17, (long)-3421318426312640987L, (long)var3_3);
                        }
                        catch (IOException var22_19) {
                            // empty catch block
                        }
                    }
                    throw var21_17;
                }
                try {
                    if (var3_3 <= 0L) break block37;
                    if (var3_3 <= 0L) break block40;
                    v20 = var18_12;
                    if (var16_10 != null) {
                        if (v20 == null) break block37;
                    }
                    ** GOTO lbl131
                }
                catch (IOException v21) {
                    throw m44.a("o", (Object)v21, (long)-3064278784088686304L, (long)var3_3);
                }
                try {
                    v20 = var18_12;
lbl131:
                    // 2 sources

                    m44.a("p", (Object)v20, (long)-3372658661534342797L, (long)var3_3);
                }
                catch (IOException var19_14) {}
                break block40;
            }
            try {
                if (var3_3 <= 0L) break block40;
                v22 = var17_11;
                if (var16_10 != null) {
                    if (v22 == null) break block40;
                }
                ** GOTO lbl147
            }
            catch (IOException v23) {
                throw m44.a("o", (Object)v23, (long)-3064278784088686304L, (long)var3_3);
            }
            try {
                v22 = var17_11;
lbl147:
                // 2 sources

                m44.a("p", (Object)v22, (long)-3421318426312640987L, (long)var3_3);
            }
            catch (IOException var19_15) {}
        }
    }

    /*
     * Loose catch block
     */
    public static boolean M(Object[] objectArray) {
        int n10;
        block10: {
            block11: {
                int n11;
                block12: {
                    block13: {
                        CallSite callSite;
                        lb6 lb62;
                        String string;
                        long l10;
                        block14: {
                            l10 = (Long)objectArray[0];
                            string = (String)objectArray[1];
                            lb62 = (lb6)objectArray[2];
                            l10 = a ^ l10;
                            CallSite callSite2 = m44.a("m", (long)5401106431442912914L, (long)l10);
                            lb62.P(-1);
                            callSite = callSite2;
                            n10 = string.startsWith((String)((Object)cn.a("b", (int)3588, (long)(0x531DA0B9E597FD84L ^ l10))));
                            if (callSite == null) break block10;
                            if (n10 == 0) break block11;
                            break block14;
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("m", (Object)numberFormatException, (long)6256362447734588042L, (long)l10);
                            }
                        }
                        try {
                            block15: {
                                n10 = string.length();
                                if (callSite == null) break block10;
                                break block15;
                                catch (NumberFormatException numberFormatException) {
                                    throw m44.a("m", (Object)numberFormatException, (long)6256362447734588042L, (long)l10);
                                }
                            }
                            if (n10 <= ((String)((Object)cn.a("b", (int)27347, (long)(0x25CB1567C9B29951L ^ l10)))).length()) break block11;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw m44.a("m", (Object)numberFormatException, (long)6256362447734588042L, (long)l10);
                        }
                        String string2 = string.substring(((String)((Object)cn.a("b", (int)27347, (long)(0x25CB1567C9B29951L ^ l10)))).length());
                        int n12 = string2.indexOf((int)cn.b("v", (int)28724, (long)(0x4D8E8193A4FA18F1L ^ l10)));
                        try {
                            n11 = n12;
                            if (callSite == null) break block12;
                            if (n11 <= 0) break block13;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw m44.a("m", (Object)numberFormatException, (long)6256362447734588042L, (long)l10);
                        }
                        String string3 = string2.substring(0, n12);
                        try {
                            int n13 = Integer.parseInt(string3);
                            lb62.P(n13);
                            return true;
                        }
                        catch (NumberFormatException numberFormatException) {
                            return false;
                        }
                    }
                    n11 = 0;
                }
                return n11 != 0;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    public void Z(Object[] objectArray) {
        String string = (String)objectArray[0];
        Map map = (Map)objectArray[1];
        Map map2 = (Map)objectArray[2];
        Map map3 = (Map)objectArray[3];
        long l10 = (Long)objectArray[4];
        long l11 = (l10 = a ^ l10) ^ 0x74A64F35051L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = map3;
        objectArray2[3] = l11;
        objectArray2[2] = map2;
        objectArray2[1] = map;
        objectArray2[0] = string;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-1929474245467381393L, (long)l10), (Object)objectArray2, (long)-486584309365821160L, (long)l10);
        CallSite callSite = m44.a("j", (long)-449255994996148827L, (long)l10);
        for (int i10 = 0; i10 < m44.a("t", (Object)this, (long)-569910120173810944L, (long)l10).size(); ++i10) {
            ds ds2 = (ds)m44.a("t", (Object)this, (long)-569910120173810944L, (long)l10).get(i10);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = map;
            objectArray3[0] = string;
            m44.a("u", (Object)ds2, (Object)objectArray3, (long)-2234780618186615459L, (long)l10);
            if (callSite != null) continue;
        }
    }

    public boolean E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("t", (Object)this, (long)-7498391228554376595L, (long)l10);
    }

    public boolean d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x1C8AFCE2EAE7L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("t", (Object)m44.a("u", (Object)this, (long)2576182303453882262L, (long)l10), (Object)objectArray2, (long)2334873116393168308L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    static boolean N(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 2[TRYBLOCK]
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

    public String q(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x4467057E0A8BL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return m44.a("r", (Object)m44.a("s", (Object)this, (long)-4805864293562337000L, (long)l10), (Object)objectArray2, (long)-6804460074611936950L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        cn.a = prr.a(948083894866334375L, 3097900749959731573L, MethodHandles.lookup().lookupClass()).a(154623099175644L);
                        cn.f = new HashMap<K, V>(13);
                        var11 = cn.a ^ 25721664798039L;
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
                        var17_5 = "\u00cd\u009f\u00a5\u0086\u00e9?\u0006\u00e1\u007f\u007f\u00e84\u00c1$\u00da\u008f\u00af\u00bdeLVk\u008dSu\u00f0g4,y)?fZ\u000f\u0004^Z\u00aey\u0011\u00ba\u00a7y~\u0004\u0097\u00dd\u0010\u00a0T:\u0010\u00ed\u00fb\u0014\u00c1\u0088\u00f8\u00ebu\u009f\u009a\u0080\u0012(\u000e\u00c3>\u0084m\u00fd\u00c4\u00eb\u00f1\u008d\u00f9\u00beK\u0083\u0019\u00f2\u0018-\u00bd-\u00cd\u00cfIX\u0007^~\u00d1\u009f\u009f\u00f1\u00d5(\u00cb\u00f5\u00b9\u00ad3D\u000b";
                        var19_6 = "\u00cd\u009f\u00a5\u0086\u00e9?\u0006\u00e1\u007f\u007f\u00e84\u00c1$\u00da\u008f\u00af\u00bdeLVk\u008dSu\u00f0g4,y)?fZ\u000f\u0004^Z\u00aey\u0011\u00ba\u00a7y~\u0004\u0097\u00dd\u0010\u00a0T:\u0010\u00ed\u00fb\u0014\u00c1\u0088\u00f8\u00ebu\u009f\u009a\u0080\u0012(\u000e\u00c3>\u0084m\u00fd\u00c4\u00eb\u00f1\u008d\u00f9\u00beK\u0083\u0019\u00f2\u0018-\u00bd-\u00cd\u00cfIX\u0007^~\u00d1\u009f\u009f\u00f1\u00d5(\u00cb\u00f5\u00b9\u00ad3D\u000b".length();
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
                            var20_3[var18_4++] = cn.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u0006\u00ed2\u001a2%=\u0096\u00a0\u00d2\u008d\u0091\u00ca\u0016<\u00b6\f\f\u000b\u0011\u00c7\u0086\u00faO7\u00be^\u008a\u00a3$\u009e\u00f230\u00d0U\u00b8\u0091d3\u0010\u001a\u00f47g\u00c6PW\u00e7b\u001e&v)\u00ac\u00c2\u008f";
                            var19_6 = "\u0006\u00ed2\u001a2%=\u0096\u00a0\u00d2\u008d\u0091\u00ca\u0016<\u00b6\f\f\u000b\u0011\u00c7\u0086\u00faO7\u00be^\u008a\u00a3$\u009e\u00f230\u00d0U\u00b8\u0091d3\u0010\u001a\u00f47g\u00c6PW\u00e7b\u001e&v)\u00ac\u00c2\u008f".length();
                            var16_7 = 40;
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
                            var20_3[var18_4++] = cn.a(var21_9).intern();
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
                cn.b = var20_3;
                cn.c = new String[5];
                cn.i = new HashMap<K, V>(13);
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
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "\u0007e\u00bd\u0019\u0003\u0019Z3\u00dek7b\u0091\u00ad4\u001f";
                var5_15 = "\u0007e\u00bd\u0019\u0003\u0019Z3\u00dek7b\u0091\u00ad4\u001f".length();
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
        cn.g = var6_12;
        cn.h = new Integer[2];
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2B0A;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/cn", exception);
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
            cn.c[n11] = cn.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = cn.a(n10, l10);
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
            throw new RuntimeException("com/zelix/cn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x304F;
        if (h[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = g[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/cn", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cn.h[n11] = n12;
        }
        return h[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = cn.b(n10, l10);
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
            throw new RuntimeException("com/zelix/cn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cn.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cn.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

