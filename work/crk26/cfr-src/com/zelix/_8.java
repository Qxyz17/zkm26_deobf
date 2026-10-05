/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.c6;
import com.zelix.c8;
import com.zelix.c_;
import com.zelix.cb;
import com.zelix.cl;
import com.zelix.co;
import com.zelix.cp;
import com.zelix.cq;
import com.zelix.cu;
import com.zelix.cz;
import com.zelix.fv;
import com.zelix.gy;
import com.zelix.i2;
import com.zelix.iz;
import com.zelix.l64;
import com.zelix.l69;
import com.zelix.lmb;
import com.zelix.m44;
import com.zelix.mt;
import com.zelix.o0;
import com.zelix.prr;
import com.zelix.ta;
import java.io.Reader;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class _8
implements l64,
l69 {
    private static int l;
    private static int v;
    public static gy V;
    private static int X;
    static cz D;
    private static boolean m;
    private static final ta R;
    private static int n;
    private static int[] A;
    private static int[] M;
    private static gy b;
    public static fv K;
    private static gy P;
    private static List I;
    private static int[] u;
    public static _8 p;
    public static gy f;
    private static final int[] Z;
    protected static lmb e;
    private static boolean j;
    private static int C;
    private static final mt[] q;
    private static final long a;
    private static final String d;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    /*
     * Exception decompiling
     */
    public static final void j(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
     * Could not resolve type clashes
     */
    public static final void o(Object[] var0) {
        var1_1 = (Long)var0[0];
        v0 = var1_1 = _8.a ^ var1_1;
        var3_2 = v0 ^ 22757511426252L;
        var5_3 = v0 ^ 123305352542275L;
        var7_4 = v0 ^ 56143609776782L;
        var9_5 = v0 ^ 12545999481223L;
        var11_6 = v0 ^ 70759991629285L;
        var13_7 = v0 ^ 59336653595236L;
        var15_8 = v0 ^ 99366534571202L;
        var17_9 = v0 ^ 79702172610827L;
        var19_10 = v0 ^ 18799691220400L;
        var22_11 = new cq(var13_7, 3);
        var21_12 = m44.a("m", (long)-8369823391086318875L, (long)var1_1);
        var23_13 = true;
        v1 = new Object[2];
        v1[1] = var9_5;
        v1[0] = var22_11;
        m44.a("r", (Object)m44.a("i", (long)-7970648880080504984L, (long)var1_1), (Object)v1, (long)-8565781737410089470L, (long)var1_1);
        try {
            v2 = new Object[1];
            v2[0] = var19_10;
            m44.a("m", (Object)v2, (long)-7991866576029387733L, (long)var1_1);
            v3 = new Object[1];
            v3[0] = var17_9;
            m44.a("m", (Object)v3, (long)-7517338970647609330L, (long)var1_1);
            v4 = new Object[2];
            v4[1] = var5_3;
            v4[0] = (int)_8.a("f", (int)7303, (long)(3884234873903956715L ^ var1_1));
            m44.a("m", (Object)v4, (long)-7686554748809586330L, (long)var1_1);
            v5 = new Object[1];
            v5[0] = var3_2;
            m44.a("m", (Object)v5, (long)-7557989251245341411L, (long)var1_1);
            ** if (var21_12 != false) goto lbl-1000
        }
        catch (Throwable var24_14) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block27: {
                                    v8 /* !! */  = var23_13;
                                    if (var1_1 <= 0L) ** GOTO lbl79
                                    if (var21_12 != false) break block27;
                                    try {
                                        block32: {
                                            if (!v8 /* !! */ ) ** GOTO lbl82
                                            break block32;
                                            catch (Throwable v9) {
                                                throw m44.a("m", (Object)v9, (long)-8504488722042325094L, (long)var1_1);
                                            }
                                        }
                                        v10 = new Object[2];
                                        v10[1] = var11_6;
                                        v10[0] = var22_11;
                                        m44.a("r", (Object)m44.a("i", (long)-7970648880080504984L, (long)var1_1), (Object)v10, (long)-7519786216810795853L, (long)var1_1);
                                        v11 = false;
                                    }
                                    catch (Throwable v12) {
                                        throw m44.a("m", (Object)v12, (long)-8504488722042325094L, (long)var1_1);
                                    }
                                }
                                var23_13 = v11;
                                try {
                                    v8 /* !! */  = var21_12;
lbl79:
                                    // 2 sources

                                    if (var1_1 > 0L) {
                                        if (!v8 /* !! */ ) break block28;
                                    }
                                    ** GOTO lbl93
lbl82:
                                    // 2 sources

                                    v13 = new Object[1];
                                    v13[0] = var7_4;
                                    m44.a("r", (Object)m44.a("i", (long)-7970648880080504984L, (long)var1_1), (Object)v13, (long)-8063147861739963706L, (long)var1_1);
                                }
                                catch (Throwable v14) {
                                    throw m44.a("m", (Object)v14, (long)-8504488722042325094L, (long)var1_1);
                                }
                            }
                            v8 /* !! */  = var24_14 instanceof RuntimeException;
lbl93:
                            // 2 sources

                            if (var1_1 < 0L || var21_12 != false) break block29;
                            try {
                                block33: {
                                    if (!v8 /* !! */ ) break block30;
                                    break block33;
                                    catch (Throwable v15) {
                                        throw m44.a("m", (Object)v15, (long)-8504488722042325094L, (long)var1_1);
                                    }
                                }
                                throw (RuntimeException)var24_14;
                            }
                            catch (Throwable v16) {
                                throw m44.a("m", (Object)v16, (long)-8504488722042325094L, (long)var1_1);
                            }
                        }
                        try {
                            v17 = var24_14;
                            if (var21_12 != false) break block31;
                            v8 /* !! */  = v17 instanceof o0;
                        }
                        catch (Throwable v18) {
                            throw m44.a("m", (Object)v18, (long)-8504488722042325094L, (long)var1_1);
                        }
                    }
                    try {
                        if (v8 /* !! */ ) {
                            throw (o0)var24_14;
                        }
                    }
                    catch (Throwable v19) {
                        throw m44.a("m", (Object)v19, (long)-8504488722042325094L, (long)var1_1);
                    }
                    v17 = var24_14;
                }
                throw (Error)v17;
            }
            catch (Throwable var25_15) {
                try {
                    if (var1_1 > 0L && var23_13) {
                        v20 = new Object[3];
                        v20[2] = true;
                        v20[1] = var22_11;
                        v20[0] = var15_8;
                        m44.a("r", (Object)m44.a("i", (long)-7970648880080504984L, (long)var1_1), (Object)v20, (long)-8319469817229588791L, (long)var1_1);
                    }
                }
                catch (Throwable v21) {
                    throw m44.a("m", (Object)v21, (long)-8504488722042325094L, (long)var1_1);
                }
                throw var25_15;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var23_13) ** GOTO lbl134
                v6 = new Object[3];
                v6[2] = true;
                v6[1] = var22_11;
                v6[0] = var15_8;
                m44.a("r", (Object)m44.a("i", (long)-7970648880080504984L, (long)var1_1), (Object)v6, (long)-8319469817229588791L, (long)var1_1);
            }
            catch (Throwable v7) {
                throw m44.a("m", (Object)v7, (long)-8504488722042325094L, (long)var1_1);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl134:
        // 3 sources

    }

    private static boolean v(Object[] objectArray) {
        Object object;
        block12: {
            block13: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 = a ^ l10;
                long l12 = l11 ^ 0x13189702EE44L;
                long l13 = l11 ^ 0x431B04DDC27AL;
                long l14 = l11 ^ 0x133630B1DAE7L;
                CallSite callSite = m44.a("k", (long)3345260192857939566L, (long)l10);
                CallSite callSite2 = m44.a("o", (long)3008969063219579135L, (long)l10);
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l12;
                                        object = m44.a("o", (Object)objectArray2, (long)3736238881870028007L, (long)l10);
                                        if (callSite2 != false) break block12;
                                        if (object == false) break block13;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw m44.a("o", (Object)runtimeException, (long)3162534107347768704L, (long)l10);
                                    }
                                    m44.a("l", (gy)((Object)callSite), (long)3345260192857939566L, (long)l10);
                                    Object[] objectArray3 = new Object[1];
                                    objectArray3[0] = l14;
                                    object = m44.a("o", (Object)objectArray3, (long)3746812866071356492L, (long)l10);
                                    if (callSite2 != false) break block12;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw m44.a("o", (Object)runtimeException, (long)3162534107347768704L, (long)l10);
                                }
                                if (object == false) break block13;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("o", (Object)runtimeException, (long)3162534107347768704L, (long)l10);
                            }
                            m44.a("l", (gy)((Object)callSite), (long)3345260192857939566L, (long)l10);
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l13;
                            object = m44.a("o", (Object)objectArray4, (long)4027232861317045098L, (long)l10);
                            if (callSite2 != false) break block12;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("o", (Object)runtimeException, (long)3162534107347768704L, (long)l10);
                        }
                        if (object == false) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("o", (Object)runtimeException, (long)3162534107347768704L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("o", (Object)runtimeException, (long)3162534107347768704L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private static boolean P(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l10;
        long l11;
        long l12;
        block9: {
            Object object;
            block8: {
                l12 = (Long)objectArray[0];
                long l13 = l12 = a ^ l12;
                l11 = l13 ^ 0x3F44FD0F584EL;
                long l14 = l13 ^ 0x2E9DF8BE21B6L;
                l10 = l13 ^ 0x4B2C8D6C56F6L;
                callSite2 = m44.a("o", (long)266357972137599631L, (long)l12);
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l14;
                    object = m44.a("o", (Object)objectArray2, (long)2000979786515704259L, (long)l12);
                    if (callSite2 != false) break block8;
                    if (object == false) break block9;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("o", (Object)runtimeException, (long)113678792467709936L, (long)l12);
                }
                object = true;
            }
            return (boolean)object;
        }
        block2: while (true) {
            CallSite callSite3;
            callSite = m44.a("k", (long)296263589658915870L, (long)l12);
            do {
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l11;
                callSite3 = m44.a("o", (Object)objectArray3, (long)113166235703923111L, (long)l12);
                do {
                    if (callSite3 == false) continue block2;
                    m44.a("l", (gy)((Object)callSite), (long)296263589658915870L, (long)l12);
                    callSite3 = callSite2;
                } while (l12 < 0L);
            } while (callSite3 != false);
            break;
        }
        block5: while (true) {
            CallSite callSite4;
            callSite = m44.a("k", (long)296263589658915870L, (long)l12);
            do {
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l10;
                callSite4 = m44.a("o", (Object)objectArray4, (long)2198713162970815089L, (long)l12);
                do {
                    if (callSite4 == false) continue block5;
                    m44.a("l", (gy)((Object)callSite), (long)296263589658915870L, (long)l12);
                    callSite4 = callSite2;
                } while (l12 <= 0L);
            } while (callSite4 != false);
            break;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static gy Y(Object[] var0) {
        block27: {
            block28: {
                block29: {
                    block31: {
                        block30: {
                            block26: {
                                block24: {
                                    var1_1 = (Integer)var0[0];
                                    var2_2 = (Long)var0[1];
                                    v0 = var2_2 = _8.a ^ var2_2;
                                    var4_3 = v0 ^ 124542372754787L;
                                    var6_4 = v0 ^ 15187284304666L;
                                    var9_5 = m44.a("n", (long)7136213788049374046L, (long)var2_2);
                                    var8_6 = m44.a("j", (long)7471990193151489522L, (long)var2_2);
                                    try {
                                        block25: {
                                            try {
                                                try {
                                                    v1 = m44.a("n", (long)7380383351447181124L, (long)var2_2);
                                                    m44.a("i", (gy)v1, (long)7136213788049374046L, (long)var2_2);
                                                    v2 = m44.a("t", (Object)v1, (long)8767082151502016152L, (long)var2_2);
                                                    if (var8_6 == false) break block24;
                                                    if (v2 == null) break block25;
                                                }
                                                catch (RuntimeException v3) {
                                                    throw m44.a("j", (Object)v3, (long)7342835063491599237L, (long)var2_2);
                                                }
                                                m44.a("i", (gy)m44.a("t", (Object)m44.a("n", (long)7380383351447181124L, (long)var2_2), (long)8767082151502016152L, (long)var2_2), (long)7380383351447181124L, (long)var2_2);
                                                v4 /* !! */  = var8_6;
                                                if (var2_2 > 0L) {
                                                    if (v4 /* !! */  != false) break block26;
                                                }
                                                ** GOTO lbl52
                                            }
                                            catch (RuntimeException v5) {
                                                throw m44.a("j", (Object)v5, (long)7342835063491599237L, (long)var2_2);
                                            }
                                        }
                                        v6 = m44.a("n", (long)7380383351447181124L, (long)var2_2);
                                        m44.a("n", (long)7328681786267437989L, (long)var2_2);
                                        v7 = new Object[1];
                                        v7[0] = var4_3;
                                        v8 = m44.a("j", (Object)v7, (long)8816013789033790241L, (long)var2_2);
                                        v2 = v8;
                                        m44.a("v", (Object)v6, (gy)v8, (long)8767082151502016152L, (long)var2_2);
                                    }
                                    catch (RuntimeException v9) {
                                        throw m44.a("j", (Object)v9, (long)7342835063491599237L, (long)var2_2);
                                    }
                                }
                                m44.a("i", (gy)v2, (long)7380383351447181124L, (long)var2_2);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            v10 = 7136213788049374046L;
                                            if (var2_2 <= 0L) break block27;
                                            v4 /* !! */  = m44.a("t", (Object)m44.a("n", (long)v10, (long)var2_2), (long)7258796646215971418L, (long)var2_2);
lbl52:
                                            // 2 sources

                                            if (var8_6 == false) break block28;
                                            if (v4 /* !! */  != var1_1) break block29;
                                        }
                                        catch (RuntimeException v11) {
                                            throw m44.a("j", (Object)v11, (long)7342835063491599237L, (long)var2_2);
                                        }
                                        m44.a("i", (int)(m44.a("n", (long)8882654504458247726L, (long)var2_2) + true), (long)8882654504458247726L, (long)var2_2);
                                        v12 = m44.a("n", (long)8730888072022624856L, (long)var2_2) + true;
                                        v13 /* !! */  = v12;
                                        m44.a("i", (int)v12, (long)8730888072022624856L, (long)var2_2);
                                        if (var8_6 == false) break block30;
                                    }
                                    catch (RuntimeException v14) {
                                        throw m44.a("j", (Object)v14, (long)7342835063491599237L, (long)var2_2);
                                    }
                                    if (v13 /* !! */  <= _8.a("f", (int)9159, (long)(8693237257405501858L ^ var2_2))) break block31;
                                }
                                catch (RuntimeException v15) {
                                    throw m44.a("j", (Object)v15, (long)7342835063491599237L, (long)var2_2);
                                }
                                m44.a("i", (int)0, (long)8730888072022624856L, (long)var2_2);
                                v13 /* !! */  = (CallSite)false;
                            }
                            catch (RuntimeException v16) {
                                throw m44.a("j", (Object)v16, (long)7342835063491599237L, (long)var2_2);
                            }
                        }
                        var10_7 = v13 /* !! */ ;
                        block18: while (true) {
                            v17 = var10_7;
                            v18 /* !! */  = ((CallSite)m44.a("n", (long)7493463362685302296L, (long)var2_2)).length;
                            block19: while (v17 < v18 /* !! */ ) {
                                var11_8 = m44.a("n", (long)7493463362685302296L, (long)var2_2)[var10_7];
                                while (var11_8 != null) {
                                    block32: {
                                        block33: {
                                            try {
                                                if (var2_2 < 0L) break block32;
                                                v19 = var11_8;
                                                if (var8_6 == false) break block33;
                                                v17 = m44.a("t", (Object)v19, (long)7380599067584437385L, (long)var2_2);
                                                v18 /* !! */  = (int)m44.a("n", (long)8882654504458247726L, (long)var2_2);
                                                if (var8_6 == false || var2_2 <= 0L) continue block19;
                                            }
                                            catch (RuntimeException v20) {
                                                throw m44.a("j", (Object)v20, (long)7342835063491599237L, (long)var2_2);
                                            }
                                            try {
                                                if (v17 < v18 /* !! */ ) {
                                                    m44.a("v", (Object)var11_8, null, (long)7351882572687455281L, (long)var2_2);
                                                }
                                            }
                                            catch (RuntimeException v21) {
                                                throw m44.a("j", (Object)v21, (long)7342835063491599237L, (long)var2_2);
                                            }
                                            v19 = m44.a("t", (Object)var11_8, (long)8734584580563807422L, (long)var2_2);
                                        }
                                        var11_8 = v19;
                                    }
                                    v22 = var8_6;
lbl103:
                                    // 2 sources

                                    ** while (v22 == false)
lbl104:
                                    // 1 sources

                                }
lbl105:
                                // 2 sources

                                ++var10_7;
                                v22 = var8_6;
                                if (var2_2 <= 0L) ** GOTO lbl103
                                if (v22 != false) continue block18;
                            }
                            break;
                        }
                    }
                    return m44.a("n", (long)7136213788049374046L, (long)var2_2);
                }
                m44.a("i", (gy)m44.a("n", (long)7136213788049374046L, (long)var2_2), (long)7380383351447181124L, (long)var2_2);
                m44.a("i", (gy)var9_5, (long)7136213788049374046L, (long)var2_2);
                v4 /* !! */  = (CallSite)var1_1;
            }
            m44.a("i", (int)v4 /* !! */ , (long)8963227554375352170L, (long)var2_2);
            v10 = var6_4;
        }
        v23 = new Object[1];
        v23[0] = v10;
        throw m44.a("j", (Object)v23, (long)7325928414812851577L, (long)var2_2);
    }

    /*
     * Exception decompiling
     */
    private static void B(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[CASE]], but top level block is 2[TRYBLOCK]
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

    private static boolean g(Object[] objectArray) {
        Object object;
        block20: {
            block21: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 = a ^ l10;
                long l12 = l11 ^ 0x45897E027911L;
                long l13 = l11 ^ 0x4A61A7B6AA40L;
                long l14 = l11 ^ 0x30129B764EC5L;
                long l15 = l11 ^ 0x294A7F849FD0L;
                long l16 = l11 ^ 0x6B2399AA2C92L;
                CallSite callSite = m44.a("i", (long)-110655961672741260L, (long)l10);
                CallSite callSite2 = m44.a("m", (long)-455250053344023571L, (long)l10);
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        Object[] objectArray2 = new Object[1];
                                                        objectArray2[0] = l15;
                                                        object = m44.a("m", (Object)objectArray2, (long)-303846260711824806L, (long)l10);
                                                        if (callSite2 == false) break block20;
                                                        if (object == false) break block21;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw m44.a("m", (Object)runtimeException, (long)-290048328060664422L, (long)l10);
                                                    }
                                                    m44.a("n", (gy)((Object)callSite), (long)-110655961672741260L, (long)l10);
                                                    Object[] objectArray3 = new Object[1];
                                                    objectArray3[0] = l16;
                                                    object = m44.a("m", (Object)objectArray3, (long)-73530132107050722L, (long)l10);
                                                    if (callSite2 == false) break block20;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw m44.a("m", (Object)runtimeException, (long)-290048328060664422L, (long)l10);
                                                }
                                                if (object == false) break block21;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw m44.a("m", (Object)runtimeException, (long)-290048328060664422L, (long)l10);
                                            }
                                            m44.a("n", (gy)((Object)callSite), (long)-110655961672741260L, (long)l10);
                                            Object[] objectArray4 = new Object[1];
                                            objectArray4[0] = l12;
                                            object = m44.a("m", (Object)objectArray4, (long)-543107897481972967L, (long)l10);
                                            if (callSite2 == false) break block20;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw m44.a("m", (Object)runtimeException, (long)-290048328060664422L, (long)l10);
                                        }
                                        if (object == false) break block21;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw m44.a("m", (Object)runtimeException, (long)-290048328060664422L, (long)l10);
                                    }
                                    m44.a("n", (gy)((Object)callSite), (long)-110655961672741260L, (long)l10);
                                    Object[] objectArray5 = new Object[1];
                                    objectArray5[0] = l14;
                                    object = m44.a("m", (Object)objectArray5, (long)-1822828123234655492L, (long)l10);
                                    if (callSite2 == false) break block20;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw m44.a("m", (Object)runtimeException, (long)-290048328060664422L, (long)l10);
                                }
                                if (object == false) break block21;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("m", (Object)runtimeException, (long)-290048328060664422L, (long)l10);
                            }
                            m44.a("n", (gy)((Object)callSite), (long)-110655961672741260L, (long)l10);
                            Object[] objectArray6 = new Object[1];
                            objectArray6[0] = l13;
                            object = m44.a("m", (Object)objectArray6, (long)-2201702700722704853L, (long)l10);
                            if (callSite2 == false) break block20;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("m", (Object)runtimeException, (long)-290048328060664422L, (long)l10);
                        }
                        if (object == false) break block21;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("m", (Object)runtimeException, (long)-290048328060664422L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("m", (Object)runtimeException, (long)-290048328060664422L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void m(Object[] var0) {
        var1_1 = (Long)var0[0];
        v0 = var1_1 = _8.a ^ var1_1;
        var3_2 = v0 ^ 97289362166456L;
        var5_3 = v0 ^ 11344586944473L;
        var7_4 = v0 ^ 55214928186576L;
        var9_5 = v0 ^ 133065432346802L;
        var11_6 = v0 ^ 108857003540885L;
        var13_7 = v0 ^ 27347030293129L;
        var16_8 = new c8((int)_8.a("f", (int)15726, (long)(1905562470387287675L ^ var1_1)), var13_7);
        var17_9 = true;
        var15_10 = m44.a("j", (long)7996685561268812986L, (long)var1_1);
        v1 = new Object[2];
        v1[1] = var7_4;
        v1[0] = var16_8;
        m44.a("u", (Object)m44.a("n", (long)8373784127686988351L, (long)var1_1), (Object)v1, (long)7815719775788419925L, (long)var1_1);
        try {
            v2 = new Object[1];
            v2[0] = var3_2;
            m44.a("j", (Object)v2, (long)7662886277094222849L, (long)var1_1);
            ** if (var15_10 == false) goto lbl-1000
        }
        catch (Throwable var18_11) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block27: {
                                    v5 /* !! */  = var17_9;
                                    if (var1_1 <= 0L) ** GOTO lbl62
                                    if (var15_10 == false) break block27;
                                    try {
                                        block32: {
                                            if (!v5 /* !! */ ) ** GOTO lbl65
                                            break block32;
                                            catch (Throwable v6) {
                                                throw m44.a("j", (Object)v6, (long)7831414291866587853L, (long)var1_1);
                                            }
                                        }
                                        v7 = new Object[2];
                                        v7[1] = var9_5;
                                        v7[0] = var16_8;
                                        m44.a("u", (Object)m44.a("n", (long)8373784127686988351L, (long)var1_1), (Object)v7, (long)8283073101607258596L, (long)var1_1);
                                        v8 = false;
                                    }
                                    catch (Throwable v9) {
                                        throw m44.a("j", (Object)v9, (long)7831414291866587853L, (long)var1_1);
                                    }
                                }
                                var17_9 = v8;
                                try {
                                    v5 /* !! */  = var15_10;
lbl62:
                                    // 2 sources

                                    if (var1_1 >= 0L) {
                                        if (v5 /* !! */ ) break block28;
                                    }
                                    ** GOTO lbl76
lbl65:
                                    // 2 sources

                                    v10 = new Object[1];
                                    v10[0] = var5_3;
                                    m44.a("u", (Object)m44.a("n", (long)8373784127686988351L, (long)var1_1), (Object)v10, (long)8452914431468248977L, (long)var1_1);
                                }
                                catch (Throwable v11) {
                                    throw m44.a("j", (Object)v11, (long)7831414291866587853L, (long)var1_1);
                                }
                            }
                            v5 /* !! */  = var18_11 instanceof RuntimeException;
lbl76:
                            // 2 sources

                            if (var1_1 < 0L || var15_10 == false) break block29;
                            try {
                                block33: {
                                    if (!v5 /* !! */ ) break block30;
                                    break block33;
                                    catch (Throwable v12) {
                                        throw m44.a("j", (Object)v12, (long)7831414291866587853L, (long)var1_1);
                                    }
                                }
                                throw (RuntimeException)var18_11;
                            }
                            catch (Throwable v13) {
                                throw m44.a("j", (Object)v13, (long)7831414291866587853L, (long)var1_1);
                            }
                        }
                        try {
                            v14 = var18_11;
                            if (var15_10 == false) break block31;
                            v5 /* !! */  = v14 instanceof o0;
                        }
                        catch (Throwable v15) {
                            throw m44.a("j", (Object)v15, (long)7831414291866587853L, (long)var1_1);
                        }
                    }
                    try {
                        if (v5 /* !! */ ) {
                            throw (o0)var18_11;
                        }
                    }
                    catch (Throwable v16) {
                        throw m44.a("j", (Object)v16, (long)7831414291866587853L, (long)var1_1);
                    }
                    v14 = var18_11;
                }
                throw (Error)v14;
            }
            catch (Throwable var19_12) {
                try {
                    if (var1_1 > 0L && var17_9) {
                        v17 = new Object[3];
                        v17[2] = true;
                        v17[1] = var16_8;
                        v17[0] = var11_6;
                        m44.a("u", (Object)m44.a("n", (long)8373784127686988351L, (long)var1_1), (Object)v17, (long)7628102819015009182L, (long)var1_1);
                    }
                }
                catch (Throwable v18) {
                    throw m44.a("j", (Object)v18, (long)7831414291866587853L, (long)var1_1);
                }
                throw var19_12;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var17_9) ** GOTO lbl117
                v3 = new Object[3];
                v3[2] = true;
                v3[1] = var16_8;
                v3[0] = var11_6;
                m44.a("u", (Object)m44.a("n", (long)8373784127686988351L, (long)var1_1), (Object)v3, (long)7628102819015009182L, (long)var1_1);
            }
            catch (Throwable v4) {
                throw m44.a("j", (Object)v4, (long)7831414291866587853L, (long)var1_1);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl117:
        // 3 sources

    }

    /*
     * Exception decompiling
     */
    public static final void W(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [18[CASE]], but top level block is 2[TRYBLOCK]
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
     * Could not resolve type clashes
     */
    public static o0 S(Object[] var0) {
        block34: {
            block33: {
                block29: {
                    block30: {
                        var1_1 = (Long)var0[0];
                        v0 = var1_1 = _8.a ^ var1_1;
                        var3_2 = v0 ^ 105654540835581L;
                        var5_3 = v0 ^ 108105741387703L;
                        var7_4 = v0 ^ 77538898017891L;
                        v1 = m44.a("l", (long)-8000737588018756940L, (long)var1_1);
                        m44.a("h", (long)-8071411578233810582L, (long)var1_1).clear();
                        var9_5 = v1;
                        var10_6 = new boolean[_8.a("f", (int)15342, (long)(5398757823689653996L ^ var1_1))];
                        try {
                            try {
                                v2 /* !! */  = m44.a("h", (long)-8420118272020527060L, (long)var1_1);
                                if (var9_5 == false) break block29;
                                if (v2 /* !! */  < 0) break block30;
                            }
                            catch (RuntimeException v3) {
                                throw m44.a("l", (Object)v3, (long)-7881157074065101629L, (long)var1_1);
                            }
                            var10_6[m44.a("h", (long)-8420118272020527060L, (long)var1_1)] = true;
                            m44.a("o", (int)-1, (long)-8420118272020527060L, (long)var1_1);
                        }
                        catch (RuntimeException v4) {
                            throw m44.a("l", (Object)v4, (long)-7881157074065101629L, (long)var1_1);
                        }
                    }
                    v2 /* !! */  = (CallSite)false;
                }
                var11_7 = v2 /* !! */ ;
                block18: while (true) {
                    v5 /* !! */  = var11_7;
                    block19: while (v5 /* !! */  < _8.a("f", (int)20153, (long)(3675818279487703941L ^ var1_1))) {
                        block32: {
                            block31: {
                                try {
                                    try {
                                        v6 = m44.a("h", (long)-8490155770556780603L, (long)var1_1)[var11_7];
lbl35:
                                        // 3 sources

                                        while (true) {
                                            v7 /* !! */  = var9_5;
                                            if (var1_1 >= 0L) {
                                                if (v7 /* !! */  == false) break block31;
                                                v7 /* !! */  = m44.a("h", (long)-8357559655543068312L, (long)var1_1);
                                            }
                                            if (var1_1 > 0L && var9_5 != false) {
                                            }
                                            ** GOTO lbl75
                                            break;
                                        }
                                    }
                                    catch (RuntimeException v8) {
                                        throw m44.a("l", (Object)v8, (long)-7881157074065101629L, (long)var1_1);
                                    }
                                    if (v6 != v7 /* !! */ ) break block32;
                                }
                                catch (RuntimeException v9) {
                                    throw m44.a("l", (Object)v9, (long)-7881157074065101629L, (long)var1_1);
                                }
                                v6 = var12_9 = (reference)false;
                            }
                            while (var12_9 < _8.a("f", (int)2500, (long)(6348556687293304030L ^ var1_1))) {
                                v5 /* !! */  = (CallSite)(m44.a("h", (long)-8403602784753479147L, (long)var1_1)[var11_7] & 1 << var12_9);
                                if (var9_5 == false) continue block19;
                                try {
                                    if (var1_1 <= 0L) ** GOTO lbl35
                                    if (v5 /* !! */  != false) {
                                        var10_6[var12_9] = true;
                                    }
                                }
                                catch (RuntimeException v10) {
                                    throw m44.a("l", (Object)v10, (long)-7881157074065101629L, (long)var1_1);
                                }
                                ++var12_9;
                                if (var9_5 != false) continue;
                            }
                        }
                        ++var11_7;
                        v5 /* !! */  = var9_5;
                        if (var1_1 <= 0L) continue;
                        if (v5 /* !! */  != false) continue block18;
                    }
                    break;
                }
                v11 = false;
                if (var1_1 >= 0L) ** break;
                ** while (true)
                var11_7 = (reference)v11;
                do {
                    block35: {
                        v12 /* !! */  = var11_7;
                        v7 /* !! */  = _8.a("f", (int)25039, (long)(2206813455428494552L ^ var1_1));
lbl75:
                        // 2 sources

                        try {
                            try {
                                try {
                                    try {
                                        if (var1_1 < 0L) break block33;
                                        if (v12 /* !! */  >= v7 /* !! */ ) break;
                                        v13 = var10_6[var11_7];
                                        if (var9_5 == false) break block34;
                                    }
                                    catch (RuntimeException v14) {
                                        throw m44.a("l", (Object)v14, (long)-7881157074065101629L, (long)var1_1);
                                    }
                                    if (var9_5 == false) break block35;
                                }
                                catch (RuntimeException v15) {
                                    throw m44.a("l", (Object)v15, (long)-7881157074065101629L, (long)var1_1);
                                }
                                if (var1_1 <= 0L) continue;
                                if (v13 == 0) break block35;
                            }
                            catch (RuntimeException v16) {
                                throw m44.a("l", (Object)v16, (long)-7881157074065101629L, (long)var1_1);
                            }
                            m44.a("o", (int[])new int[1], (long)-8496315234531643866L, (long)var1_1);
                            m44.a("h", (long)-8496315234531643866L, (long)var1_1)[0] = var11_7;
                            v17 = m44.a("h", (long)-8071411578233810582L, (long)var1_1);
lbl98:
                            // 2 sources

                            while (true) {
                                v17.add(m44.a("h", (long)-8496315234531643866L, (long)var1_1));
                                break;
                            }
                        }
                        catch (RuntimeException v18) {
                            throw m44.a("l", (Object)v18, (long)-7881157074065101629L, (long)var1_1);
                        }
                    }
                    ++var11_7;
                    v19 = var9_5;
                } while (v19 != false);
                m44.a("o", (int)0, (long)-8096026534781704024L, (long)var1_1);
                v20 = new Object[1];
                v20[0] = var5_3;
                m44.a("l", (Object)v20, (long)-8263458054509421691L, (long)var1_1);
                v12 /* !! */  = (CallSite)false;
                v7 /* !! */  = (CallSite)false;
            }
            v21 = new Object[3];
            v21[2] = var7_4;
            v21[1] = (int)v7 /* !! */ ;
            v21[0] = (int)v12 /* !! */ ;
            m44.a("l", (Object)v21, (long)-8414259449099361254L, (long)var1_1);
            v17 = m44.a("h", (long)-8071411578233810582L, (long)var1_1);
            ** while (var1_1 < 0L)
lbl123:
            // 1 sources

            v13 = v17.size();
        }
        var11_8 = new int[v13][];
        var12_9 = (reference)false;
        while (var12_9 < m44.a("h", (long)-8071411578233810582L, (long)var1_1).size()) {
            var11_8[var12_9] = (int[])m44.a("h", (long)-8071411578233810582L, (long)var1_1).get((int)var12_9);
            ++var12_9;
lbl130:
            // 2 sources

            ** while (var9_5 == false)
lbl131:
            // 1 sources

        }
lbl132:
        // 2 sources

        if (var1_1 <= 0L) ** GOTO lbl130
        return new o0((gy)m44.a("h", (long)-7760106425462518760L, (long)var1_1), var11_8, (String[])m44.a("h", (long)-8458718871144181704L, (long)var1_1), var3_2);
    }

    /*
     * Exception decompiling
     */
    public static final void s(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[CASE]], but top level block is 1[TRYBLOCK]
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

    private static boolean O(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x636DC6B06B7AL;
                CallSite callSite = m44.a("i", (long)554676399534986737L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)_8.a("f", (int)29867, (long)(0x246278E8BF6BA6C4L ^ l10));
                        object = m44.a("i", (Object)objectArray2, (long)2090040881897510415L, (long)l10);
                        if (callSite == false) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("i", (Object)runtimeException, (long)424941276964551558L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("i", (Object)runtimeException, (long)424941276964551558L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean s(Object[] var0) {
        block17: {
            block18: {
                block15: {
                    block16: {
                        block13: {
                            block14: {
                                var1_1 = (Long)var0[0];
                                v0 = var1_1 = _8.a ^ var1_1;
                                var3_2 = v0 ^ 27111993325510L;
                                var5_3 = v0 ^ 111547213548694L;
                                var7_4 = v0 ^ 84112590032300L;
                                var9_5 = m44.a("m", (long)6928826102378365205L, (long)var1_1);
                                try {
                                    try {
                                        v1 = new Object[1];
                                        v1[0] = var3_2;
                                        v2 /* !! */  = m44.a("m", (Object)v1, (long)9171233849651319353L, (long)var1_1);
                                        if (var9_5 != false) break block13;
                                        if (v2 /* !! */  == false) break block14;
                                    }
                                    catch (RuntimeException v3) {
                                        throw m44.a("m", (Object)v3, (long)7064379565990550634L, (long)var1_1);
                                    }
                                    return true;
                                }
                                catch (RuntimeException v4) {
                                    throw m44.a("m", (Object)v4, (long)7064379565990550634L, (long)var1_1);
                                }
                            }
                            v5 = new Object[1];
                            v5[0] = var7_4;
                            v2 /* !! */  = m44.a("m", (Object)v5, (long)7274849717752877988L, (long)var1_1);
                        }
                        try {
                            try {
                                v6 = var9_5;
                                if (var1_1 >= 0L) {
                                    if (v6 != false) break block15;
                                    if (v2 /* !! */  == false) break block16;
                                }
                                ** GOTO lbl52
                            }
                            catch (RuntimeException v7) {
                                throw m44.a("m", (Object)v7, (long)7064379565990550634L, (long)var1_1);
                            }
                            return true;
                        }
                        catch (RuntimeException v8) {
                            throw m44.a("m", (Object)v8, (long)7064379565990550634L, (long)var1_1);
                        }
                    }
                    v9 = new Object[2];
                    v9[1] = var5_3;
                    v9[0] = (int)_8.a("f", (int)32741, (long)(3509715527501793909L ^ var1_1));
                    v2 /* !! */  = m44.a("m", (Object)v9, (long)8857831723530056163L, (long)var1_1);
                }
                try {
                    try {
                        v6 = var9_5;
lbl52:
                        // 2 sources

                        if (v6 != false) break block17;
                        if (v2 /* !! */  == false) break block18;
                    }
                    catch (RuntimeException v10) {
                        throw m44.a("m", (Object)v10, (long)7064379565990550634L, (long)var1_1);
                    }
                    return true;
                }
                catch (RuntimeException v11) {
                    throw m44.a("m", (Object)v11, (long)7064379565990550634L, (long)var1_1);
                }
            }
            v2 /* !! */  = (CallSite)false;
        }
        return (boolean)v2 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    public static void Z(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[DOLOOP]], but top level block is 9[SIMPLE_IF_TAKEN]
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
     * Could not resolve type clashes
     */
    public static final void l(Object[] var0) {
        var1_1 = (Long)var0[0];
        v0 = var1_1 = _8.a ^ var1_1;
        var3_2 = v0 ^ 39219728227173L;
        var5_3 = v0 ^ 30569056794732L;
        var7_4 = v0 ^ 89057861862414L;
        var9_5 = v0 ^ 133456623306310L;
        var11_6 = v0 ^ 82445872149801L;
        v1 = v0 ^ 126500579948688L;
        var13_7 = (int)(v1 >>> 48);
        var14_8 = (int)(v1 << 16 >>> 32);
        var15_9 = (int)(v1 << 48 >>> 48);
        v2 = m44.a("n", (long)6504823887149598726L, (long)var1_1);
        var17_10 = new c_((char)var13_7, (int)_8.a("f", (int)16640, (long)(8765407537028943491L ^ var1_1)), var14_8, var15_9);
        var18_11 = true;
        v3 = new Object[2];
        v3[1] = var5_3;
        v3[0] = var17_10;
        m44.a("q", (Object)m44.a("j", (long)4650390711462356611L, (long)var1_1), (Object)v3, (long)6398254153469427689L, (long)var1_1);
        var16_12 = v2;
        try {
            v4 = new Object[1];
            v4[0] = var9_5;
            m44.a("n", (Object)v4, (long)6736849356815465495L, (long)var1_1);
            ** if (var16_12 == false) goto lbl-1000
        }
        catch (Throwable var19_13) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block27: {
                                    v7 /* !! */  = var18_11;
                                    if (var1_1 < 0L) ** GOTO lbl67
                                    if (var16_12 == false) break block27;
                                    try {
                                        block32: {
                                            if (!v7 /* !! */ ) ** GOTO lbl70
                                            break block32;
                                            catch (Throwable v8) {
                                                throw m44.a("n", (Object)v8, (long)6346394535555966577L, (long)var1_1);
                                            }
                                        }
                                        v9 = new Object[2];
                                        v9[1] = var7_4;
                                        v9[0] = var17_10;
                                        m44.a("q", (Object)m44.a("j", (long)4650390711462356611L, (long)var1_1), (Object)v9, (long)5066350446748106072L, (long)var1_1);
                                        v10 = false;
                                    }
                                    catch (Throwable v11) {
                                        throw m44.a("n", (Object)v11, (long)6346394535555966577L, (long)var1_1);
                                    }
                                }
                                var18_11 = v10;
                                try {
                                    v7 /* !! */  = var16_12;
lbl67:
                                    // 2 sources

                                    if (var1_1 >= 0L) {
                                        if (v7 /* !! */ ) break block28;
                                    }
                                    ** GOTO lbl81
lbl70:
                                    // 2 sources

                                    v12 = new Object[1];
                                    v12[0] = var3_2;
                                    m44.a("q", (Object)m44.a("j", (long)4650390711462356611L, (long)var1_1), (Object)v12, (long)4752108054447336237L, (long)var1_1);
                                }
                                catch (Throwable v13) {
                                    throw m44.a("n", (Object)v13, (long)6346394535555966577L, (long)var1_1);
                                }
                            }
                            v7 /* !! */  = var19_13 instanceof RuntimeException;
lbl81:
                            // 2 sources

                            if (var1_1 <= 0L || var16_12 == false) break block29;
                            try {
                                block33: {
                                    if (!v7 /* !! */ ) break block30;
                                    break block33;
                                    catch (Throwable v14) {
                                        throw m44.a("n", (Object)v14, (long)6346394535555966577L, (long)var1_1);
                                    }
                                }
                                throw (RuntimeException)var19_13;
                            }
                            catch (Throwable v15) {
                                throw m44.a("n", (Object)v15, (long)6346394535555966577L, (long)var1_1);
                            }
                        }
                        try {
                            v16 = var19_13;
                            if (var16_12 == false) break block31;
                            v7 /* !! */  = v16 instanceof o0;
                        }
                        catch (Throwable v17) {
                            throw m44.a("n", (Object)v17, (long)6346394535555966577L, (long)var1_1);
                        }
                    }
                    try {
                        if (v7 /* !! */ ) {
                            throw (o0)var19_13;
                        }
                    }
                    catch (Throwable v18) {
                        throw m44.a("n", (Object)v18, (long)6346394535555966577L, (long)var1_1);
                    }
                    v16 = var19_13;
                }
                throw (Error)v16;
            }
            catch (Throwable var20_14) {
                try {
                    if (var1_1 >= 0L && var18_11) {
                        v19 = new Object[3];
                        v19[2] = true;
                        v19[1] = var17_10;
                        v19[0] = var11_6;
                        m44.a("q", (Object)m44.a("j", (long)4650390711462356611L, (long)var1_1), (Object)v19, (long)6728482176207197986L, (long)var1_1);
                    }
                }
                catch (Throwable v20) {
                    throw m44.a("n", (Object)v20, (long)6346394535555966577L, (long)var1_1);
                }
                throw var20_14;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var18_11) ** GOTO lbl122
                v5 = new Object[3];
                v5[2] = true;
                v5[1] = var17_10;
                v5[0] = var11_6;
                m44.a("q", (Object)m44.a("j", (long)4650390711462356611L, (long)var1_1), (Object)v5, (long)6728482176207197986L, (long)var1_1);
            }
            catch (Throwable v6) {
                throw m44.a("n", (Object)v6, (long)6346394535555966577L, (long)var1_1);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl122:
        // 3 sources

    }

    /*
     * Exception decompiling
     */
    public static final void N(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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

    private static boolean A(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x24822ABEFF64L;
                CallSite callSite = m44.a("o", (long)-7805621264141401617L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)_8.a("f", (int)2499, (long)(0x22610B4DCF8F4FA8L ^ l10));
                        object = m44.a("o", (Object)objectArray2, (long)-8566102728344534511L, (long)l10);
                        if (callSite == false) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("o", (Object)runtimeException, (long)-7927471994720620648L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("o", (Object)runtimeException, (long)-7927471994720620648L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public _8(int var1_1, char var2_2, short var3_3, Reader var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[DOLOOP]], but top level block is 13[SIMPLE_IF_TAKEN]
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

    private static boolean p(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x461E825EEAL;
                CallSite callSite = m44.a("i", (long)3626602303810687849L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)_8.a("f", (int)2499, (long)(0x22612F89FBB3EE26L ^ l10));
                        object = m44.a("i", (Object)objectArray2, (long)2923172815210914719L, (long)l10);
                        if (callSite != false) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("i", (Object)runtimeException, (long)3491929069626150422L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("i", (Object)runtimeException, (long)3491929069626150422L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private static boolean J(Object[] objectArray) {
        Object object;
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x282B075D21A8L;
        long l13 = l11 ^ 0x33E779188B7BL;
        CallSite callSite = m44.a("j", (long)-4649438963320754886L, (long)l10);
        m44.a("i", (int)n10, (long)-6697558066184258670L, (long)l10);
        CallSite callSite2 = m44.a("n", (long)-4917679855254527082L, (long)l10);
        m44.a("i", (gy)((Object)callSite2), (long)-5142651841160165213L, (long)l10);
        m44.a("i", (gy)((Object)callSite2), (long)-4900376768103235733L, (long)l10);
        CallSite callSite3 = callSite;
        try {
            Object object2;
            block6: {
                block7: {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l13;
                        object2 = m44.a("j", (Object)objectArray2, (long)-4892120316530200952L, (long)l10);
                        if (callSite3 == false) break block6;
                        if (object2 != false) break block7;
                    }
                    catch (ta ta2) {
                        throw m44.a("j", (Object)ta2, (long)-4814641512976759987L, (long)l10);
                    }
                    object2 = true;
                    break block6;
                }
                object2 = false;
            }
            object = object2;
        }
        catch (ta ta3) {
            boolean bl2;
            try {
                bl2 = true;
            }
            catch (Throwable throwable) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = l12;
                objectArray3[1] = n10;
                objectArray3[0] = 1;
                m44.a("j", (Object)objectArray3, (long)-6813014786778327266L, (long)l10);
                throw throwable;
            }
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = l12;
            objectArray4[1] = n10;
            objectArray4[0] = 1;
            m44.a("j", (Object)objectArray4, (long)-6813014786778327266L, (long)l10);
            return bl2;
        }
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l12;
        objectArray5[1] = n10;
        objectArray5[0] = 1;
        m44.a("j", (Object)objectArray5, (long)-6813014786778327266L, (long)l10);
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean X(Object[] var0) {
        block53: {
            block54: {
                block49: {
                    block51: {
                        block52: {
                            block46: {
                                block50: {
                                    block47: {
                                        block48: {
                                            block45: {
                                                block42: {
                                                    block43: {
                                                        var1_1 = (Integer)var0[0];
                                                        var2_2 = (Long)var0[1];
                                                        v0 = var2_2 = _8.a ^ var2_2;
                                                        var4_3 = v0 ^ 51995468196422L;
                                                        var6_4 = v0 ^ 110473740244480L;
                                                        var8_5 = m44.a("o", (long)4098899019658156511L, (long)var2_2);
                                                        try {
                                                            block44: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v1 = m44.a("k", (long)4561293138575052622L, (long)var2_2);
                                                                                if (var8_5 != false) break block42;
                                                                                v2 = 4328816715123374214L;
                                                                                v3 = var2_2;
                                                                                if (var2_2 <= 0L) ** GOTO lbl69
                                                                                if (v1 == m44.a("k", (long)v2, (long)v3)) {
                                                                                }
                                                                                ** GOTO lbl66
                                                                            }
                                                                            catch (RuntimeException v4) {
                                                                                throw m44.a("o", (Object)v4, (long)4234407954183963808L, (long)var2_2);
                                                                            }
                                                                            m44.a("l", (int)(m44.a("k", (long)2657168827637988479L, (long)var2_2) - true), (long)2657168827637988479L, (long)var2_2);
                                                                            v5 = m44.a("q", (Object)m44.a("k", (long)4561293138575052622L, (long)var2_2), (long)2778633881714930109L, (long)var2_2);
                                                                            if (var2_2 <= 0L || var8_5 != false) break block43;
                                                                        }
                                                                        catch (RuntimeException v6) {
                                                                            throw m44.a("o", (Object)v6, (long)4234407954183963808L, (long)var2_2);
                                                                        }
                                                                        if (var2_2 <= 0L) break block43;
                                                                        if (v5 != null) break block44;
                                                                    }
                                                                    catch (RuntimeException v7) {
                                                                        throw m44.a("o", (Object)v7, (long)4234407954183963808L, (long)var2_2);
                                                                    }
                                                                    v8 = m44.a("k", (long)4561293138575052622L, (long)var2_2);
                                                                    m44.a("k", (long)4220413046244430976L, (long)var2_2);
                                                                    v9 = new Object[1];
                                                                    v9[0] = var4_3;
                                                                    v10 = m44.a("o", (Object)v9, (long)2701486718854865924L, (long)var2_2);
                                                                    m44.a("s", (Object)v8, (gy)v10, (long)2778633881714930109L, (long)var2_2);
                                                                    m44.a("l", (gy)v10, (long)4561293138575052622L, (long)var2_2);
                                                                    m44.a("l", (gy)v10, (long)4328816715123374214L, (long)var2_2);
                                                                    v11 /* !! */  = var8_5;
                                                                    if (var2_2 > 0L) {
                                                                        if (v11 /* !! */  == false) break block45;
                                                                    }
                                                                    ** GOTO lbl78
                                                                }
                                                                catch (RuntimeException v12) {
                                                                    throw m44.a("o", (Object)v12, (long)4234407954183963808L, (long)var2_2);
                                                                }
                                                            }
                                                            v13 = m44.a("q", (Object)m44.a("k", (long)4561293138575052622L, (long)var2_2), (long)2778633881714930109L, (long)var2_2);
                                                            v5 = v13;
                                                            m44.a("l", (gy)v13, (long)4561293138575052622L, (long)var2_2);
                                                        }
                                                        catch (RuntimeException v14) {
                                                            throw m44.a("o", (Object)v14, (long)4234407954183963808L, (long)var2_2);
                                                        }
                                                    }
                                                    try {
                                                        m44.a("l", (gy)v5, (long)4328816715123374214L, (long)var2_2);
                                                        v11 /* !! */  = var8_5;
                                                        if (var2_2 >= 0L) {
                                                            if (v11 /* !! */  == false) break block45;
                                                        }
                                                        ** GOTO lbl78
lbl66:
                                                        // 2 sources

                                                        v15 = m44.a("k", (long)4561293138575052622L, (long)var2_2);
                                                        v2 = 2778633881714930109L;
                                                        v3 = var2_2;
lbl69:
                                                        // 2 sources

                                                        v1 = m44.a("q", (Object)v15, (long)v2, (long)v3);
                                                    }
                                                    catch (RuntimeException v16) {
                                                        throw m44.a("o", (Object)v16, (long)4234407954183963808L, (long)var2_2);
                                                    }
                                                }
                                                m44.a("l", (gy)v1, (long)4561293138575052622L, (long)var2_2);
                                            }
                                            try {
                                                v11 /* !! */  = m44.a("k", (long)2308079596516876147L, (long)var2_2);
lbl78:
                                                // 3 sources

                                                v17 = var8_5;
                                                if (var2_2 > 0L) {
                                                    if (v17 != false) break block46;
                                                    if (v11 /* !! */  == false) break block47;
                                                }
                                                ** GOTO lbl137
                                            }
                                            catch (RuntimeException v18) {
                                                throw m44.a("o", (Object)v18, (long)4234407954183963808L, (long)var2_2);
                                            }
                                            var9_6 = 0;
                                            var10_7 = m44.a("k", (long)4336318480403342459L, (long)var2_2);
                                            while (var10_7 != null) {
                                                try {
                                                    try {
                                                        v19 = var10_7;
                                                        v20 = var8_5;
                                                        if (var2_2 >= 0L) {
                                                            if (v20 != false) break block48;
                                                            v21 = m44.a("k", (long)4561293138575052622L, (long)var2_2);
                                                            if (var2_2 < 0L || var8_5 != false) break block49;
                                                        }
                                                        ** GOTO lbl114
                                                    }
                                                    catch (RuntimeException v22) {
                                                        throw m44.a("o", (Object)v22, (long)4234407954183963808L, (long)var2_2);
                                                    }
                                                    if (v19 == v21) break;
                                                }
                                                catch (RuntimeException v23) {
                                                    throw m44.a("o", (Object)v23, (long)4234407954183963808L, (long)var2_2);
                                                }
                                                ++var9_6;
                                                var10_7 = m44.a("q", (Object)var10_7, (long)2778633881714930109L, (long)var2_2);
                                                if (var8_5 == false) continue;
                                            }
                                            if (var2_2 <= 0L) break block54;
                                            v19 = var10_7;
                                        }
                                        try {
                                            try {
                                                v20 = var8_5;
lbl114:
                                                // 2 sources

                                                if (v20 != false) break block50;
                                                if (v19 == null) break block47;
                                            }
                                            catch (RuntimeException v24) {
                                                throw m44.a("o", (Object)v24, (long)4234407954183963808L, (long)var2_2);
                                            }
                                            v25 = new Object[3];
                                            v25[2] = var6_4;
                                            v25[1] = var9_6;
                                            v25[0] = var1_1;
                                            m44.a("o", (Object)v25, (long)2547253295547075705L, (long)var2_2);
                                        }
                                        catch (RuntimeException v26) {
                                            throw m44.a("o", (Object)v26, (long)4234407954183963808L, (long)var2_2);
                                        }
                                    }
                                    v19 = m44.a("k", (long)4561293138575052622L, (long)var2_2);
                                }
                                v11 /* !! */  = m44.a("q", (Object)v19, (long)4294519898634562943L, (long)var2_2);
                            }
                            try {
                                try {
                                    v17 = var8_5;
lbl137:
                                    // 2 sources

                                    if (var2_2 > 0L) {
                                        if (v17 != false) break block51;
                                        if (v11 /* !! */  == var1_1) break block52;
                                    }
                                    ** GOTO lbl153
                                }
                                catch (RuntimeException v27) {
                                    throw m44.a("o", (Object)v27, (long)4234407954183963808L, (long)var2_2);
                                }
                                return true;
                            }
                            catch (RuntimeException v28) {
                                throw m44.a("o", (Object)v28, (long)4234407954183963808L, (long)var2_2);
                            }
                        }
                        v11 /* !! */  = m44.a("k", (long)2657168827637988479L, (long)var2_2);
                    }
                    try {
                        try {
                            v17 = var8_5;
lbl153:
                            // 2 sources

                            if (v17 != false) break block53;
                            if (v11 /* !! */  != false) break block54;
                        }
                        catch (RuntimeException v29) {
                            throw m44.a("o", (Object)v29, (long)4234407954183963808L, (long)var2_2);
                        }
                        v30 = m44.a("k", (long)4561293138575052622L, (long)var2_2);
                        v21 = m44.a("k", (long)4328816715123374214L, (long)var2_2);
                    }
                    catch (RuntimeException v31) {
                        throw m44.a("o", (Object)v31, (long)4234407954183963808L, (long)var2_2);
                    }
                }
                try {
                    if (v30 == v21) {
                        throw m44.a("k", (long)4206224318446697752L, (long)var2_2);
                    }
                }
                catch (RuntimeException v32) {
                    throw m44.a("o", (Object)v32, (long)4234407954183963808L, (long)var2_2);
                }
            }
            v11 /* !! */  = (CallSite)false;
        }
        return (boolean)v11 /* !! */ ;
    }

    private static boolean Q(Object[] objectArray) {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = (Long)objectArray[0];
                        long l12 = l10 = a ^ l10;
                        long l13 = l12 ^ 0x429FE1BE631EL;
                        l11 = l12 ^ 0x60FAB3E72DA4L;
                        callSite = m44.a("m", (long)1125905736506011293L, (long)l10);
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l13;
                                objectArray2[0] = (int)_8.a("f", (int)11470, (long)(0x5B5903D0146376CDL ^ l10));
                                object = m44.a("m", (Object)objectArray2, (long)1541762597442133611L, (long)l10);
                                if (callSite != false) break block8;
                                if (object == false) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("m", (Object)runtimeException, (long)973217483627525090L, (long)l10);
                            }
                            return true;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("m", (Object)runtimeException, (long)973217483627525090L, (long)l10);
                        }
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l11;
                    object = m44.a("m", (Object)objectArray3, (long)1717743809986061777L, (long)l10);
                }
                try {
                    try {
                        if (callSite != false) break block10;
                        if (object == false) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("m", (Object)runtimeException, (long)973217483627525090L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("m", (Object)runtimeException, (long)973217483627525090L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private static boolean o(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x24AC8D0DCBC7L;
                CallSite callSite = m44.a("l", (long)-6408660759832758964L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)_8.a("f", (int)21958, (long)(0x3216A560579CA715L ^ l10));
                        object = m44.a("l", (Object)objectArray2, (long)-4774916377209850190L, (long)l10);
                        if (callSite == false) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("l", (Object)runtimeException, (long)-6532200683869643973L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("l", (Object)runtimeException, (long)-6532200683869643973L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private static void q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        int[] nArray = new int[_8.a("f", (int)20153, (long)(0x33034CC6554768A2L ^ l10))];
        nArray[0] = (int)_8.a("f", (int)10044, (long)(0x719F60830F2010AL ^ l10));
        nArray[1] = (int)_8.a("f", (int)17436, (long)(0x55139A117E436204L ^ l10));
        nArray[2] = (int)_8.a("f", (int)23083, (long)(0x28555C65647B7C24L ^ l10));
        nArray[3] = (int)_8.a("f", (int)7488, (long)(0x24BC8335721CBB55L ^ l10));
        nArray[4] = (int)_8.a("f", (int)7488, (long)(0x24BC8335721CBB55L ^ l10));
        nArray[5] = (int)_8.a("f", (int)7488, (long)(0x24BC8335721CBB55L ^ l10));
        nArray[_8.a("f", (int)28739, (long)(0x32DAF0392A43D65EL ^ l10))] = (int)_8.a("f", (int)7488, (long)(0x24BC8335721CBB55L ^ l10));
        nArray[_8.a("f", (int)15726, (long)(0x1A71C3AADCAD1B52L ^ l10))] = (int)_8.a("f", (int)7488, (long)(0x24BC8335721CBB55L ^ l10));
        nArray[_8.a("f", (int)4879, (long)(0x1C309AF635C7B501L ^ l10))] = (int)_8.a("f", (int)9835, (long)(0x3104F2FD9EC2004CL ^ l10));
        nArray[_8.a("f", (int)10686, (long)(0x509559CF8BB88FAAL ^ l10))] = (int)_8.a("f", (int)18246, (long)(0x3A05631A5F15617FL ^ l10));
        nArray[_8.a("f", (int)30751, (long)(0x48C63B6390B7DE03L ^ l10))] = (int)_8.a("f", (int)32443, (long)(0x4E4328D1BD70D883L ^ l10));
        nArray[_8.a("f", (int)30579, (long)(0xC4258461E8FD144L ^ l10))] = (int)_8.a("f", (int)6415, (long)(0x753F454FB35DBF2DL ^ l10));
        nArray[_8.a("f", (int)8011, (long)(0x3D6EDD1178B53978L ^ l10))] = (int)_8.a("f", (int)13476, (long)(0x73F3F194B6A9128FL ^ l10));
        nArray[_8.a("f", (int)7370, (long)(0x19BE09E12C913AFFL ^ l10))] = (int)_8.a("f", (int)10986, (long)(0x6EE31DCD79A58CFBL ^ l10));
        nArray[_8.a("f", (int)32741, (long)(0x30B558F805C2D9FBL ^ l10))] = (int)_8.a("f", (int)6334, (long)(0x504E2504DA63BE8AL ^ l10));
        m44.a("h", (int[])nArray, (long)7513985718521098546L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void H(Object[] var0) {
        var1_1 = (Long)var0[0];
        v0 = var1_1 = _8.a ^ var1_1;
        var3_2 = v0 ^ 8342086306961L;
        var5_3 = v0 ^ 18263176595211L;
        var7_4 = v0 ^ 45057933190146L;
        var9_5 = v0 ^ 109714166241376L;
        var11_6 = v0 ^ 131522891587353L;
        var13_7 = v0 ^ 133918610385223L;
        var16_8 = new cl(var3_2, 5);
        var17_9 = true;
        v1 = m44.a("h", (long)458604562031765344L, (long)var1_1);
        v2 = new Object[2];
        v2[1] = var7_4;
        v2[0] = var16_8;
        m44.a("w", (Object)m44.a("l", (long)2082829620350171885L, (long)var1_1), (Object)v2, (long)334701747944104839L, (long)var1_1);
        var15_10 = v1;
        try {
            v3 = new Object[1];
            v3[0] = var11_6;
            m44.a("h", (Object)v3, (long)1859253034981474737L, (long)var1_1);
            ** if (var15_10 != false) goto lbl-1000
        }
        catch (Throwable var18_11) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block27: {
                                    v6 /* !! */  = var17_9;
                                    if (var1_1 < 0L) ** GOTO lbl63
                                    if (var15_10 != false) break block27;
                                    try {
                                        block32: {
                                            if (!v6 /* !! */ ) ** GOTO lbl66
                                            break block32;
                                            catch (Throwable v7) {
                                                throw m44.a("h", (Object)v7, (long)323378478039988767L, (long)var1_1);
                                            }
                                        }
                                        v8 = new Object[2];
                                        v8[1] = var9_5;
                                        v8[0] = var16_8;
                                        m44.a("w", (Object)m44.a("l", (long)2082829620350171885L, (long)var1_1), (Object)v8, (long)1882920074043498806L, (long)var1_1);
                                        v9 = false;
                                    }
                                    catch (Throwable v10) {
                                        throw m44.a("h", (Object)v10, (long)323378478039988767L, (long)var1_1);
                                    }
                                }
                                var17_9 = v9;
                                try {
                                    v6 /* !! */  = var15_10;
lbl63:
                                    // 2 sources

                                    if (var1_1 >= 0L) {
                                        if (!v6 /* !! */ ) break block28;
                                    }
                                    ** GOTO lbl77
lbl66:
                                    // 2 sources

                                    v11 = new Object[1];
                                    v11[0] = var5_3;
                                    m44.a("w", (Object)m44.a("l", (long)2082829620350171885L, (long)var1_1), (Object)v11, (long)2133811421434378051L, (long)var1_1);
                                }
                                catch (Throwable v12) {
                                    throw m44.a("h", (Object)v12, (long)323378478039988767L, (long)var1_1);
                                }
                            }
                            v6 /* !! */  = var18_11 instanceof RuntimeException;
lbl77:
                            // 2 sources

                            if (var1_1 <= 0L || var15_10 != false) break block29;
                            try {
                                block33: {
                                    if (!v6 /* !! */ ) break block30;
                                    break block33;
                                    catch (Throwable v13) {
                                        throw m44.a("h", (Object)v13, (long)323378478039988767L, (long)var1_1);
                                    }
                                }
                                throw (RuntimeException)var18_11;
                            }
                            catch (Throwable v14) {
                                throw m44.a("h", (Object)v14, (long)323378478039988767L, (long)var1_1);
                            }
                        }
                        try {
                            v15 = var18_11;
                            if (var15_10 != false) break block31;
                            v6 /* !! */  = v15 instanceof o0;
                        }
                        catch (Throwable v16) {
                            throw m44.a("h", (Object)v16, (long)323378478039988767L, (long)var1_1);
                        }
                    }
                    try {
                        if (v6 /* !! */ ) {
                            throw (o0)var18_11;
                        }
                    }
                    catch (Throwable v17) {
                        throw m44.a("h", (Object)v17, (long)323378478039988767L, (long)var1_1);
                    }
                    v15 = var18_11;
                }
                throw (Error)v15;
            }
            catch (Throwable var19_12) {
                try {
                    if (var1_1 > 0L && var17_9) {
                        v18 = new Object[3];
                        v18[2] = true;
                        v18[1] = var16_8;
                        v18[0] = var13_7;
                        m44.a("w", (Object)m44.a("l", (long)2082829620350171885L, (long)var1_1), (Object)v18, (long)76119002383895372L, (long)var1_1);
                    }
                }
                catch (Throwable v19) {
                    throw m44.a("h", (Object)v19, (long)323378478039988767L, (long)var1_1);
                }
                throw var19_12;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var17_9) ** GOTO lbl118
                v4 = new Object[3];
                v4[2] = true;
                v4[1] = var16_8;
                v4[0] = var13_7;
                m44.a("w", (Object)m44.a("l", (long)2082829620350171885L, (long)var1_1), (Object)v4, (long)76119002383895372L, (long)var1_1);
            }
            catch (Throwable v5) {
                throw m44.a("h", (Object)v5, (long)323378478039988767L, (long)var1_1);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl118:
        // 3 sources

    }

    /*
     * Exception decompiling
     */
    public static final void S(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 2[TRYBLOCK]
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
     * Could not resolve type clashes
     */
    public static final void d(Object[] var0) {
        var1_1 = (Long)var0[0];
        v0 = var1_1 = _8.a ^ var1_1;
        var3_2 = v0 ^ 5172467241855L;
        var5_3 = v0 ^ 95240377527838L;
        var7_4 = v0 ^ 122011512966423L;
        var9_5 = v0 ^ 41549700166005L;
        var11_6 = v0 ^ 70156173361234L;
        v1 = v0 ^ 83572625712581L;
        var13_7 = (int)(v1 >>> 32);
        var14_8 = (int)(v1 << 32 >>> 48);
        var15_9 = (int)(v1 << 48 >>> 48);
        var17_10 = new cb((int)_8.a("f", (int)4879, (long)(2031386678398511599L ^ var1_1)), var13_7, (char)var14_8, (char)var15_9);
        var18_11 = true;
        var16_12 = m44.a("m", (long)-5819015851228922499L, (long)var1_1);
        v2 = new Object[2];
        v2[1] = var7_4;
        v2[0] = var17_10;
        m44.a("r", (Object)m44.a("i", (long)-5335933760802417672L, (long)var1_1), (Object)v2, (long)-5931135749959153006L, (long)var1_1);
        try {
            v3 = new Object[1];
            v3[0] = var3_2;
            m44.a("m", (Object)v3, (long)-6080045625353212474L, (long)var1_1);
            ** if (var16_12 == false) goto lbl-1000
        }
        catch (Throwable var19_13) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block27: {
                                    v6 /* !! */  = var18_11;
                                    if (var1_1 <= 0L) ** GOTO lbl66
                                    if (var16_12 == false) break block27;
                                    try {
                                        block32: {
                                            if (!v6 /* !! */ ) ** GOTO lbl69
                                            break block32;
                                            catch (Throwable v7) {
                                                throw m44.a("m", (Object)v7, (long)-5951057198901767414L, (long)var1_1);
                                            }
                                        }
                                        v8 = new Object[2];
                                        v8[1] = var9_5;
                                        v8[0] = var17_10;
                                        m44.a("r", (Object)m44.a("i", (long)-5335933760802417672L, (long)var1_1), (Object)v8, (long)-5533727853454489565L, (long)var1_1);
                                        v9 = false;
                                    }
                                    catch (Throwable v10) {
                                        throw m44.a("m", (Object)v10, (long)-5951057198901767414L, (long)var1_1);
                                    }
                                }
                                var18_11 = v9;
                                try {
                                    v6 /* !! */  = var16_12;
lbl66:
                                    // 2 sources

                                    if (var1_1 > 0L) {
                                        if (v6 /* !! */ ) break block28;
                                    }
                                    ** GOTO lbl80
lbl69:
                                    // 2 sources

                                    v11 = new Object[1];
                                    v11[0] = var5_3;
                                    m44.a("r", (Object)m44.a("i", (long)-5335933760802417672L, (long)var1_1), (Object)v11, (long)-5437652156582863274L, (long)var1_1);
                                }
                                catch (Throwable v12) {
                                    throw m44.a("m", (Object)v12, (long)-5951057198901767414L, (long)var1_1);
                                }
                            }
                            v6 /* !! */  = var19_13 instanceof RuntimeException;
lbl80:
                            // 2 sources

                            if (var1_1 < 0L || var16_12 == false) break block29;
                            try {
                                block33: {
                                    if (!v6 /* !! */ ) break block30;
                                    break block33;
                                    catch (Throwable v13) {
                                        throw m44.a("m", (Object)v13, (long)-5951057198901767414L, (long)var1_1);
                                    }
                                }
                                throw (RuntimeException)var19_13;
                            }
                            catch (Throwable v14) {
                                throw m44.a("m", (Object)v14, (long)-5951057198901767414L, (long)var1_1);
                            }
                        }
                        try {
                            v15 = var19_13;
                            if (var16_12 == false) break block31;
                            v6 /* !! */  = v15 instanceof o0;
                        }
                        catch (Throwable v16) {
                            throw m44.a("m", (Object)v16, (long)-5951057198901767414L, (long)var1_1);
                        }
                    }
                    try {
                        if (v6 /* !! */ ) {
                            throw (o0)var19_13;
                        }
                    }
                    catch (Throwable v17) {
                        throw m44.a("m", (Object)v17, (long)-5951057198901767414L, (long)var1_1);
                    }
                    v15 = var19_13;
                }
                throw (Error)v15;
            }
            catch (Throwable var20_14) {
                try {
                    if (var1_1 > 0L && var18_11) {
                        v18 = new Object[3];
                        v18[2] = true;
                        v18[1] = var17_10;
                        v18[0] = var11_6;
                        m44.a("r", (Object)m44.a("i", (long)-5335933760802417672L, (long)var1_1), (Object)v18, (long)-6333420250506829223L, (long)var1_1);
                    }
                }
                catch (Throwable v19) {
                    throw m44.a("m", (Object)v19, (long)-5951057198901767414L, (long)var1_1);
                }
                throw var20_14;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var18_11) ** GOTO lbl121
                v4 = new Object[3];
                v4[2] = true;
                v4[1] = var17_10;
                v4[0] = var11_6;
                m44.a("r", (Object)m44.a("i", (long)-5335933760802417672L, (long)var1_1), (Object)v4, (long)-6333420250506829223L, (long)var1_1);
            }
            catch (Throwable v5) {
                throw m44.a("m", (Object)v5, (long)-5951057198901767414L, (long)var1_1);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl121:
        // 3 sources

    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    _8.a = prr.a(5402107164228344281L, -5247420808852759799L, MethodHandles.lookup().lookupClass()).a(96966005909586L);
                    v0 = var14 = _8.a ^ 106543507426175L;
                    var16_1 = v0 ^ 107410061824343L;
                    var18_2 = v0 ^ 52157172591091L;
                    var11_3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v1 = SecretKeyFactory.getInstance("DES");
                    v2 = new byte[8];
                    v3 = v2;
                    v2[0] = (byte)(var14 >>> 56);
                    for (var12_4 = 1; var12_4 < 8; ++var12_4) {
                        v3 = v3;
                        v3[var12_4] = (byte)(var14 << var12_4 * 8 >>> 56);
                    }
                    break block12;
lbl16:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var11_3.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                var13_5 = var11_3.doFinal(">\u008f\u001akQ)\u0011E\u00bc\u00adc\u00ef\u0017;\u00ee\u0013\u007f\u0091\u0092O\u0083\u0010\u00e5'=\u001f2\u001bO\u00b2\u0013\u001c3\u00be\u00c7u\u000f\u007f\u00d1\u0018\u00e7\u00ddL\u00d0\u00aa\u00a5\u00fa\u00bfH'A\u00f1\u00ea\u00c1\u00fd6".getBytes("ISO-8859-1"));
                ** while (true)
                _8.d = _8.c(var13_5).intern();
                _8.i = new HashMap<K, V>(13);
                var0_6 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var14 >>> 56);
                for (var1_7 = 1; var1_7 < 8; ++var1_7) {
                    v6 = v6;
                    v6[var1_7] = (byte)(var14 << var1_7 * 8 >>> 56);
                }
                var0_6.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_8 = new long[58];
                var3_9 = 0;
                var4_10 = "\u00f2<\u00af\u00ebQ\u009d\u0006D\u00ebW({B\u00ee\u009c:\u00cf\u009d\u00caB\u001e\\5N\u008b\u00c8\u00deI,\u0014\u0092\u00ac\u00a9E\u00e1S\u00c7b\u00fa\u00ee,\u0098\u00ce\u00ab\u00af-\u00e3\u00e1Kq(\u00e0cR\u0003\u00a4\u00f2\u00ac\u00cb\u0089\u00f4\u00a7Nx?\u0011\u001b\u0082\u00a3V7\u0084\u008aM\u00fb\u00b9\u00d1qD\u000b\u0082\u00d7\u0087\u00ce\u00ca\u00a9\u00edn\u00f2\u00dd[\u008b\u008dU-\u00bf\u00885G\u00a2-\u00e86\u00ae\u0096\u0006\u00ce\u00e6\u0011\u00bc\u001bz\u00e47\b\u00bd\u00aanD\u00cd\u0090yR\u00da\u00d6`\u001a\u00be\u00f2\u00d8\u0006\u00f7\u00f4\u00e0\u00af0N\u00ae\u00f8a\u00ec@j\u00c2U\u00a6\u001f\u00b8\u0006%:\u009f\u0001\u00c7\u0096\u009d3a`\b2\u00eam\u00b1\u00e7\u00ad\u00d9e\u00a7^\u00b0\u00f3\tw\u00a1\u00d6\u0094M\u00b9e4\u00e1t#\b\u00c6WcH\u0096\u00815U_?\u00f0\u0018\u00f3\u0002\u00c0\u00a8\u00eb\u00c7\u00d7\u00c1\u00ff0\u009e\u00e9\u00c5\u00ab\u001a\u00e0\u00b3yR\u00f7\u00eb\u0015\u00cc]\u00bb\u0006\\\u00e9g^\u00cb\u00c1\u00e6\u009fQ\u00ec\u000b.\u00f6\u00be\u00b3^{\u0090\u00efW\u00c5\u00ae\u001d\u000e\u0004#s3FK&9\u00f3 V\u0014\u00a7\u00ebbN\u00f3{\u00d0\u0083\u00c7\u0084^\u0000}\u00d1\u00b9\u00b1\u00c7\u0001p\u00d6\u008a\u00b4\u0080\u00d3m6${\u00b8s\u00ab\u00cdqg\u00c6\u00a5\u00f2\u00cb\u00d7\u0080v\u0015\u0013\u0003$\u0000>,\u00f9\u00ec\u00da{:)\u00ca\u00ed\u00e8\u00ca\u00dd\u00fa\u001b\r\u00ab\u0086\u0082\u00cam\u0093kQG`\u0011\u00af\u00f9\u00ff\u00eb\u0002\u009d\u00e8\u00ef\u00df7T,\u0011I\u0087\u00d1\u00a2e\u00bf\u00dc\u00a44\u00d8[Z\u00fc\u00e9\u007f@p\u0013\"\u00d1\u00a4\u00e7\u0080\u00e33\u00c9\\\u009c\u00d6\u00b2\u00ab\u00f5\u00dfH\u00e3\u0099\u00ec\u00f5\b\u00b1\u0080t\u008b-u\u0019~iz\u009cL\u0091g\u00c7\r\u0004\u009d\u0004\u00a2.\u0005\u00a0$f\u00af\u001c\u0094\\\u009e\u0000\u001c\u00bc\u00de\u00db\u00dc\u00d1\u00c1?K\u00d3\u0015\u00bfvi5>X\u00b58.\u00a0\u00de|\u0011\u00c4\u00f6e\u00c8D\u007f\u008b\u009d\u00cd";
                var5_11 = "\u00f2<\u00af\u00ebQ\u009d\u0006D\u00ebW({B\u00ee\u009c:\u00cf\u009d\u00caB\u001e\\5N\u008b\u00c8\u00deI,\u0014\u0092\u00ac\u00a9E\u00e1S\u00c7b\u00fa\u00ee,\u0098\u00ce\u00ab\u00af-\u00e3\u00e1Kq(\u00e0cR\u0003\u00a4\u00f2\u00ac\u00cb\u0089\u00f4\u00a7Nx?\u0011\u001b\u0082\u00a3V7\u0084\u008aM\u00fb\u00b9\u00d1qD\u000b\u0082\u00d7\u0087\u00ce\u00ca\u00a9\u00edn\u00f2\u00dd[\u008b\u008dU-\u00bf\u00885G\u00a2-\u00e86\u00ae\u0096\u0006\u00ce\u00e6\u0011\u00bc\u001bz\u00e47\b\u00bd\u00aanD\u00cd\u0090yR\u00da\u00d6`\u001a\u00be\u00f2\u00d8\u0006\u00f7\u00f4\u00e0\u00af0N\u00ae\u00f8a\u00ec@j\u00c2U\u00a6\u001f\u00b8\u0006%:\u009f\u0001\u00c7\u0096\u009d3a`\b2\u00eam\u00b1\u00e7\u00ad\u00d9e\u00a7^\u00b0\u00f3\tw\u00a1\u00d6\u0094M\u00b9e4\u00e1t#\b\u00c6WcH\u0096\u00815U_?\u00f0\u0018\u00f3\u0002\u00c0\u00a8\u00eb\u00c7\u00d7\u00c1\u00ff0\u009e\u00e9\u00c5\u00ab\u001a\u00e0\u00b3yR\u00f7\u00eb\u0015\u00cc]\u00bb\u0006\\\u00e9g^\u00cb\u00c1\u00e6\u009fQ\u00ec\u000b.\u00f6\u00be\u00b3^{\u0090\u00efW\u00c5\u00ae\u001d\u000e\u0004#s3FK&9\u00f3 V\u0014\u00a7\u00ebbN\u00f3{\u00d0\u0083\u00c7\u0084^\u0000}\u00d1\u00b9\u00b1\u00c7\u0001p\u00d6\u008a\u00b4\u0080\u00d3m6${\u00b8s\u00ab\u00cdqg\u00c6\u00a5\u00f2\u00cb\u00d7\u0080v\u0015\u0013\u0003$\u0000>,\u00f9\u00ec\u00da{:)\u00ca\u00ed\u00e8\u00ca\u00dd\u00fa\u001b\r\u00ab\u0086\u0082\u00cam\u0093kQG`\u0011\u00af\u00f9\u00ff\u00eb\u0002\u009d\u00e8\u00ef\u00df7T,\u0011I\u0087\u00d1\u00a2e\u00bf\u00dc\u00a44\u00d8[Z\u00fc\u00e9\u007f@p\u0013\"\u00d1\u00a4\u00e7\u0080\u00e33\u00c9\\\u009c\u00d6\u00b2\u00ab\u00f5\u00dfH\u00e3\u0099\u00ec\u00f5\b\u00b1\u0080t\u008b-u\u0019~iz\u009cL\u0091g\u00c7\r\u0004\u009d\u0004\u00a2.\u0005\u00a0$f\u00af\u001c\u0094\\\u009e\u0000\u001c\u00bc\u00de\u00db\u00dc\u00d1\u00c1?K\u00d3\u0015\u00bfvi5>X\u00b58.\u00a0\u00de|\u0011\u00c4\u00f6e\u00c8D\u007f\u008b\u009d\u00cd".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v7 = var6_8;
                    v8 = var3_9++;
                    v9 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v10 = -1;
                    break block10;
                    break;
                }
lbl47:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = ";\r\u00cd\u00ces\u0017\u0096C\u00d2\u0088\u00ca\u0083\u00a4K\u00e3\u00d9";
                    var5_11 = ";\r\u00cd\u00ces\u0017\u0096C\u00d2\u0088\u00ca\u0083\u00a4K\u00e3\u00d9".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v7 = var6_8;
                        v8 = var3_9++;
                        v9 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v10 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_12 < var5_11) ** continue;
                    break block11;
                    break;
                }
            }
            var8_14 = v9;
            var10_15 = var0_6.doFinal(new byte[]{(byte)(var8_14 >>> 56), (byte)(var8_14 >>> 48), (byte)(var8_14 >>> 40), (byte)(var8_14 >>> 32), (byte)(var8_14 >>> 24), (byte)(var8_14 >>> 16), (byte)(var8_14 >>> 8), (byte)var8_14});
            v11 = ((long)var10_15[0] & 255L) << 56 | ((long)var10_15[1] & 255L) << 48 | ((long)var10_15[2] & 255L) << 40 | ((long)var10_15[3] & 255L) << 32 | ((long)var10_15[4] & 255L) << 24 | ((long)var10_15[5] & 255L) << 16 | ((long)var10_15[6] & 255L) << 8 | (long)var10_15[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl73:
                // 1 sources

                ** continue;
            }
        }
        _8.g = var6_8;
        _8.h = new Integer[58];
        m44.a("o", (lmb)new lmb(var16_1), (long)-7731590590255353159L, (long)var14);
        m44.a("o", (boolean)false, (long)-8204830751832088172L, (long)var14);
        _8.Z = new int[_8.a("f", (int)10204, (long)(3181345838276017218L ^ var14))];
        v12 = new Object[1];
        v12[0] = var18_2;
        m44.a("l", (Object)v12, (long)-7900954987902872839L, (long)var14);
        _8.q = new mt[2];
        m44.a("o", (boolean)false, (long)-7571426858895693416L, (long)var14);
        m44.a("o", (int)0, (long)-8006248712549669994L, (long)var14);
        _8.R = new ta(null);
        m44.a("o", new ArrayList<E>(), (long)-7965558931843379230L, (long)var14);
        m44.a("o", (int)-1, (long)-7661317038104652124L, (long)var14);
        m44.a("o", (int[])new int[_8.a("f", (int)18587, (long)(1211978853596369726L ^ var14))], (long)-8366366799581022806L, (long)var14);
    }

    private static boolean a(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x191EFA708FFFL;
                CallSite callSite = m44.a("l", (long)-2071270122125983108L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)_8.a("f", (int)31180, (long)(0x574E7A92ABE04F32L ^ l10));
                        object = m44.a("l", (Object)objectArray2, (long)-467200731514178934L, (long)l10);
                        if (callSite != false) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("l", (Object)runtimeException, (long)-2206539911184539901L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("l", (Object)runtimeException, (long)-2206539911184539901L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void K(Object[] var0) {
        var1_1 = (Long)var0[0];
        v0 = var1_1 = _8.a ^ var1_1;
        v1 = v0 ^ 129904032912561L;
        var3_2 = (int)(v1 >>> 32);
        var4_3 = (int)(v1 << 32 >>> 48);
        var5_4 = (int)(v1 << 48 >>> 48);
        var6_5 = v0 ^ 25304103775618L;
        var8_6 = v0 ^ 92535645773647L;
        var10_7 = v0 ^ 119089887902790L;
        var12_8 = v0 ^ 43421205725220L;
        var14_9 = v0 ^ 67591030681859L;
        var16_10 = v0 ^ 58921284439064L;
        var18_11 = v0 ^ 31043581369836L;
        var21_12 = new cu(2, var3_2, var4_3, var5_4);
        var20_13 = m44.a("l", (long)-2418519456789263316L, (long)var1_1);
        var22_14 = true;
        v2 = new Object[2];
        v2[1] = var10_7;
        v2[0] = var21_12;
        m44.a("s", (Object)m44.a("h", (long)-4277304516920024407L, (long)var1_1), (Object)v2, (long)-2530638425660982333L, (long)var1_1);
        try {
            v3 = new Object[1];
            v3[0] = var16_10;
            m44.a("l", (Object)v3, (long)-4349756008296399363L, (long)var1_1);
            v4 = new Object[2];
            v4[1] = var6_5;
            v4[0] = (int)_8.a("f", (int)23433, (long)(2624400037750132797L ^ var1_1));
            m44.a("l", (Object)v4, (long)-4570388324992316249L, (long)var1_1);
            v5 = new Object[1];
            v5[0] = var18_11;
            m44.a("l", (Object)v5, (long)-2462401055886956592L, (long)var1_1);
            v6 = new Object[2];
            v6[1] = var6_5;
            v6[0] = (int)_8.a("f", (int)28129, (long)(6812561736090543738L ^ var1_1));
            m44.a("l", (Object)v6, (long)-4570388324992316249L, (long)var1_1);
            ** if (var20_13 == false) goto lbl-1000
        }
        catch (Throwable var23_15) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block27: {
                                    v9 /* !! */  = var22_14;
                                    if (var1_1 <= 0L) ** GOTO lbl84
                                    if (var20_13 == false) break block27;
                                    try {
                                        block32: {
                                            if (!v9 /* !! */ ) ** GOTO lbl87
                                            break block32;
                                            catch (Throwable v10) {
                                                throw m44.a("l", (Object)v10, (long)-2578139579744214437L, (long)var1_1);
                                            }
                                        }
                                        v11 = new Object[2];
                                        v11[1] = var12_8;
                                        v11[0] = var21_12;
                                        m44.a("s", (Object)m44.a("h", (long)-4277304516920024407L, (long)var1_1), (Object)v11, (long)-4439074367363843726L, (long)var1_1);
                                        v12 = false;
                                    }
                                    catch (Throwable v13) {
                                        throw m44.a("l", (Object)v13, (long)-2578139579744214437L, (long)var1_1);
                                    }
                                }
                                var22_14 = v12;
                                try {
                                    v9 /* !! */  = var20_13;
lbl84:
                                    // 2 sources

                                    if (var1_1 > 0L) {
                                        if (v9 /* !! */ ) break block28;
                                    }
                                    ** GOTO lbl98
lbl87:
                                    // 2 sources

                                    v14 = new Object[1];
                                    v14[0] = var8_6;
                                    m44.a("s", (Object)m44.a("h", (long)-4277304516920024407L, (long)var1_1), (Object)v14, (long)-4190433857982910713L, (long)var1_1);
                                }
                                catch (Throwable v15) {
                                    throw m44.a("l", (Object)v15, (long)-2578139579744214437L, (long)var1_1);
                                }
                            }
                            v9 /* !! */  = var23_15 instanceof RuntimeException;
lbl98:
                            // 2 sources

                            if (var1_1 <= 0L || var20_13 == false) break block29;
                            try {
                                block33: {
                                    if (!v9 /* !! */ ) break block30;
                                    break block33;
                                    catch (Throwable v16) {
                                        throw m44.a("l", (Object)v16, (long)-2578139579744214437L, (long)var1_1);
                                    }
                                }
                                throw (RuntimeException)var23_15;
                            }
                            catch (Throwable v17) {
                                throw m44.a("l", (Object)v17, (long)-2578139579744214437L, (long)var1_1);
                            }
                        }
                        try {
                            v18 = var23_15;
                            if (var20_13 == false) break block31;
                            v9 /* !! */  = v18 instanceof o0;
                        }
                        catch (Throwable v19) {
                            throw m44.a("l", (Object)v19, (long)-2578139579744214437L, (long)var1_1);
                        }
                    }
                    try {
                        if (v9 /* !! */ ) {
                            throw (o0)var23_15;
                        }
                    }
                    catch (Throwable v20) {
                        throw m44.a("l", (Object)v20, (long)-2578139579744214437L, (long)var1_1);
                    }
                    v18 = var23_15;
                }
                throw (Error)v18;
            }
            catch (Throwable var24_16) {
                try {
                    if (var1_1 >= 0L && var22_14) {
                        v21 = new Object[3];
                        v21[2] = true;
                        v21[1] = var21_12;
                        v21[0] = var14_9;
                        m44.a("s", (Object)m44.a("h", (long)-4277304516920024407L, (long)var1_1), (Object)v21, (long)-2789371521375464696L, (long)var1_1);
                    }
                }
                catch (Throwable v22) {
                    throw m44.a("l", (Object)v22, (long)-2578139579744214437L, (long)var1_1);
                }
                throw var24_16;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var22_14) ** GOTO lbl139
                v7 = new Object[3];
                v7[2] = true;
                v7[1] = var21_12;
                v7[0] = var14_9;
                m44.a("s", (Object)m44.a("h", (long)-4277304516920024407L, (long)var1_1), (Object)v7, (long)-2789371521375464696L, (long)var1_1);
            }
            catch (Throwable v8) {
                throw m44.a("l", (Object)v8, (long)-2578139579744214437L, (long)var1_1);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl139:
        // 3 sources

    }

    /*
     * Exception decompiling
     */
    public static final iz Y(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE]], but top level block is 1[TRYBLOCK]
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
     * Could not resolve type clashes
     */
    private static boolean t(Object[] var0) {
        block32: {
            block33: {
                block31: {
                    block30: {
                        block28: {
                            block29: {
                                block26: {
                                    block27: {
                                        block24: {
                                            block25: {
                                                var1_1 = (Long)var0[0];
                                                v0 = var1_1 = _8.a ^ var1_1;
                                                var3_2 = v0 ^ 90738722615959L;
                                                var5_3 = v0 ^ 27244594010343L;
                                                var7_4 = v0 ^ 52080201238983L;
                                                var9_5 = m44.a("l", (long)7311990435270394948L, (long)var1_1);
                                                try {
                                                    try {
                                                        v1 = new Object[1];
                                                        v1[0] = var3_2;
                                                        v2 /* !! */  = m44.a("l", (Object)v1, (long)8797657309719189352L, (long)var1_1);
                                                        if (var9_5 != false) break block24;
                                                        if (v2 /* !! */  == false) break block25;
                                                    }
                                                    catch (RuntimeException v3) {
                                                        throw m44.a("l", (Object)v3, (long)7446981152915200315L, (long)var1_1);
                                                    }
                                                    return true;
                                                }
                                                catch (RuntimeException v4) {
                                                    throw m44.a("l", (Object)v4, (long)7446981152915200315L, (long)var1_1);
                                                }
                                            }
                                            v5 = new Object[1];
                                            v5[0] = var5_3;
                                            v2 /* !! */  = m44.a("l", (Object)v5, (long)8917672515327762066L, (long)var1_1);
                                        }
                                        try {
                                            try {
                                                v6 = var9_5;
                                                if (var1_1 > 0L) {
                                                    if (v6 != false) break block26;
                                                    if (v2 /* !! */  == false) break block27;
                                                }
                                                ** GOTO lbl52
                                            }
                                            catch (RuntimeException v7) {
                                                throw m44.a("l", (Object)v7, (long)7446981152915200315L, (long)var1_1);
                                            }
                                            return true;
                                        }
                                        catch (RuntimeException v8) {
                                            throw m44.a("l", (Object)v8, (long)7446981152915200315L, (long)var1_1);
                                        }
                                    }
                                    v9 = new Object[2];
                                    v9[1] = var7_4;
                                    v9[0] = (int)_8.a("f", (int)23433, (long)(2624432811962854237L ^ var1_1));
                                    v2 /* !! */  = m44.a("l", (Object)v9, (long)9204263812463522994L, (long)var1_1);
                                }
                                try {
                                    try {
                                        v6 = var9_5;
lbl52:
                                        // 2 sources

                                        if (var1_1 > 0L) {
                                            if (v6 != false) break block28;
                                            if (v2 /* !! */  == false) break block29;
                                        }
                                        ** GOTO lbl70
                                    }
                                    catch (RuntimeException v10) {
                                        throw m44.a("l", (Object)v10, (long)7446981152915200315L, (long)var1_1);
                                    }
                                    return true;
                                }
                                catch (RuntimeException v11) {
                                    throw m44.a("l", (Object)v11, (long)7446981152915200315L, (long)var1_1);
                                }
                            }
                            v12 = new Object[1];
                            v12[0] = var5_3;
                            v2 /* !! */  = m44.a("l", (Object)v12, (long)8917672515327762066L, (long)var1_1);
                        }
                        try {
                            v6 = var9_5;
lbl70:
                            // 2 sources

                            if (v6 != false) break block30;
                            if (v2 /* !! */  == false) break block31;
                        }
                        catch (RuntimeException v13) {
                            throw m44.a("l", (Object)v13, (long)7446981152915200315L, (long)var1_1);
                        }
                        v2 /* !! */  = (CallSite)true;
                    }
                    return (boolean)v2 /* !! */ ;
                }
                var10_6 = m44.a("h", (long)7122347768202531541L, (long)var1_1);
                try {
                    try {
                        try {
                            try {
                                v14 = new Object[2];
                                v14[1] = var7_4;
                                v14[0] = (int)_8.a("f", (int)8011, (long)(4426700241335627687L ^ var1_1));
                                v15 /* !! */  = m44.a("l", (Object)v14, (long)9204263812463522994L, (long)var1_1);
                                if (var9_5 != false) break block32;
                                if (v15 /* !! */  == false) break block33;
                            }
                            catch (RuntimeException v16) {
                                throw m44.a("l", (Object)v16, (long)7446981152915200315L, (long)var1_1);
                            }
                            m44.a("o", (gy)var10_6, (long)7122347768202531541L, (long)var1_1);
                            v17 = new Object[2];
                            v17[1] = var7_4;
                            v17[0] = (int)_8.a("f", (int)7370, (long)(1854947146895600672L ^ var1_1));
                            v15 /* !! */  = m44.a("l", (Object)v17, (long)9204263812463522994L, (long)var1_1);
                            if (var9_5 != false) break block32;
                        }
                        catch (RuntimeException v18) {
                            throw m44.a("l", (Object)v18, (long)7446981152915200315L, (long)var1_1);
                        }
                        if (v15 /* !! */  == false) break block33;
                    }
                    catch (RuntimeException v19) {
                        throw m44.a("l", (Object)v19, (long)7446981152915200315L, (long)var1_1);
                    }
                    return true;
                }
                catch (RuntimeException v20) {
                    throw m44.a("l", (Object)v20, (long)7446981152915200315L, (long)var1_1);
                }
            }
            v15 /* !! */  = (CallSite)false;
        }
        return (boolean)v15 /* !! */ ;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x308135192804L;
        long l13 = l11 ^ 0x4BCD617239C0L;
        long l14 = l11 ^ 0x1AFBE45B7485L;
        long l15 = l11 ^ 0x230DF44914DEL;
        long l16 = l11 ^ 0x6FAE869BBEC5L;
        cp cp2 = new cp((int)_8.a("f", (int)12328, (long)(0x56B3898FF1A5FE12L ^ l10)), l16);
        boolean bl2 = true;
        CallSite callSite = m44.a("j", (long)1990355039246285474L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = cp2;
        m44.a("u", (Object)m44.a("n", (long)82702750471300911L, (long)l10), (Object)objectArray2, (long)1830566192478240325L, (long)l10);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l12;
            objectArray3[0] = (int)_8.a("f", (int)2499, (long)(0x22614141B4A2C7EDL ^ l10));
            CallSite callSite2 = m44.a("j", (Object)objectArray3, (long)366092885520107809L, (long)l10);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = cp2;
            objectArray4[0] = l14;
            m44.a("u", (Object)m44.a("n", (long)82702750471300911L, (long)l10), (Object)objectArray4, (long)2075049900438443662L, (long)l10);
            bl2 = false;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = m44.a("t", (Object)callSite2, (long)2305408632928175407L, (long)l10);
            objectArray5[0] = l15;
            m44.a("u", (Object)cp2, (Object)objectArray5, (long)2284821773750076140L, (long)l10);
            if (callSite != false) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = true;
                objectArray6[1] = cp2;
                objectArray6[0] = l14;
                m44.a("u", (Object)m44.a("n", (long)82702750471300911L, (long)l10), (Object)objectArray6, (long)2075049900438443662L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("j", (Object)runtimeException, (long)1855127030480005085L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = true;
            objectArray7[1] = cp2;
            objectArray7[0] = l14;
            m44.a("u", (Object)m44.a("n", (long)82702750471300911L, (long)l10), (Object)objectArray7, (long)2075049900438443662L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("j", (Object)runtimeException, (long)1855127030480005085L, (long)l10);
        }
    }

    private static boolean Y(Object[] objectArray) {
        Object object;
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x3EB7D0093ED8L;
        long l13 = l11 ^ 0x6F55EFA3915AL;
        CallSite callSite = m44.a("j", (long)-6881650892862570174L, (long)l10);
        m44.a("i", (int)n10, (long)-4864616640914070302L, (long)l10);
        CallSite callSite2 = callSite;
        CallSite callSite3 = m44.a("n", (long)-6579492257267598106L, (long)l10);
        m44.a("i", (gy)((Object)callSite3), (long)-6354095317365303341L, (long)l10);
        m44.a("i", (gy)((Object)callSite3), (long)-6589245821345783781L, (long)l10);
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            Object object2 = m44.a("j", (Object)objectArray2, (long)-4880193165422914530L, (long)l10);
            if (callSite2 == false) {
                object2 = object2 == false ? (Object)true : (Object)false;
            }
            object = object2;
        }
        catch (ta ta2) {
            boolean bl2;
            try {
                bl2 = true;
            }
            catch (Throwable throwable) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = l12;
                objectArray3[1] = n10;
                objectArray3[0] = 0;
                m44.a("j", (Object)objectArray3, (long)-4754858129667389330L, (long)l10);
                throw throwable;
            }
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = l12;
            objectArray4[1] = n10;
            objectArray4[0] = 0;
            m44.a("j", (Object)objectArray4, (long)-4754858129667389330L, (long)l10);
            return bl2;
        }
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l12;
        objectArray5[1] = n10;
        objectArray5[0] = 0;
        m44.a("j", (Object)objectArray5, (long)-4754858129667389330L, (long)l10);
        return (boolean)object;
    }

    private static boolean q(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x6C851F04B82BL;
                CallSite callSite = m44.a("h", (long)-3106475663492151648L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)_8.a("f", (int)8118, (long)(0x4D9162E264EA9EBFL ^ l10));
                        object = m44.a("h", (Object)objectArray2, (long)-3580257305683344034L, (long)l10);
                        if (callSite == false) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("h", (Object)runtimeException, (long)-2975544272261240617L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("h", (Object)runtimeException, (long)-2975544272261240617L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private static boolean E(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x422FF8ACEDA8L;
                CallSite callSite = m44.a("k", (long)-9145115407901695957L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)_8.a("f", (int)21958, (long)(0x3216C3E3223D817AL ^ l10));
                        object = m44.a("k", (Object)objectArray2, (long)-7218302246070054691L, (long)l10);
                        if (callSite != false) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("k", (Object)runtimeException, (long)-8991559160428233388L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("k", (Object)runtimeException, (long)-8991559160428233388L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public static final void z(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
     * Could not resolve type clashes
     */
    public static final void e(Object[] var0) {
        var1_1 = (Long)var0[0];
        v0 = var1_1 = _8.a ^ var1_1;
        var3_2 = v0 ^ 99074316741953L;
        var5_3 = v0 ^ 62884524463871L;
        var7_4 = v0 ^ 1475682203126L;
        var9_5 = v0 ^ 81800244136340L;
        var11_6 = v0 ^ 103576435347181L;
        var13_7 = v0 ^ 88377821640883L;
        var16_8 = new c6((int)_8.a("f", (int)2778, (long)(1138910115801991414L ^ var1_1)), var3_2);
        var17_9 = true;
        var15_10 = m44.a("l", (long)6316689654819042964L, (long)var1_1);
        v1 = new Object[2];
        v1[1] = var7_4;
        v1[0] = var16_8;
        m44.a("s", (Object)m44.a("h", (long)5553953380557875993L, (long)var1_1), (Object)v1, (long)6147748679944008307L, (long)var1_1);
        try {
            v2 = new Object[1];
            v2[0] = var11_6;
            m44.a("l", (Object)v2, (long)5204275943043633221L, (long)var1_1);
            ** if (var15_10 != false) goto lbl-1000
        }
        catch (Throwable var18_11) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block27: {
                                    v5 /* !! */  = var17_9;
                                    if (var1_1 <= 0L) ** GOTO lbl62
                                    if (var15_10 != false) break block27;
                                    try {
                                        block32: {
                                            if (!v5 /* !! */ ) ** GOTO lbl65
                                            break block32;
                                            catch (Throwable v6) {
                                                throw m44.a("l", (Object)v6, (long)6163447318919850987L, (long)var1_1);
                                            }
                                        }
                                        v7 = new Object[2];
                                        v7[1] = var9_5;
                                        v7[0] = var16_8;
                                        m44.a("s", (Object)m44.a("h", (long)5553953380557875993L, (long)var1_1), (Object)v7, (long)5464362205691113666L, (long)var1_1);
                                        v8 = false;
                                    }
                                    catch (Throwable v9) {
                                        throw m44.a("l", (Object)v9, (long)6163447318919850987L, (long)var1_1);
                                    }
                                }
                                var17_9 = v8;
                                try {
                                    v5 /* !! */  = var15_10;
lbl62:
                                    // 2 sources

                                    if (var1_1 > 0L) {
                                        if (!v5 /* !! */ ) break block28;
                                    }
                                    ** GOTO lbl76
lbl65:
                                    // 2 sources

                                    v10 = new Object[1];
                                    v10[0] = var5_3;
                                    m44.a("s", (Object)m44.a("h", (long)5553953380557875993L, (long)var1_1), (Object)v10, (long)5505927088745293495L, (long)var1_1);
                                }
                                catch (Throwable v11) {
                                    throw m44.a("l", (Object)v11, (long)6163447318919850987L, (long)var1_1);
                                }
                            }
                            v5 /* !! */  = var18_11 instanceof RuntimeException;
lbl76:
                            // 2 sources

                            if (var1_1 < 0L || var15_10 != false) break block29;
                            try {
                                block33: {
                                    if (!v5 /* !! */ ) break block30;
                                    break block33;
                                    catch (Throwable v12) {
                                        throw m44.a("l", (Object)v12, (long)6163447318919850987L, (long)var1_1);
                                    }
                                }
                                throw (RuntimeException)var18_11;
                            }
                            catch (Throwable v13) {
                                throw m44.a("l", (Object)v13, (long)6163447318919850987L, (long)var1_1);
                            }
                        }
                        try {
                            v14 = var18_11;
                            if (var15_10 != false) break block31;
                            v5 /* !! */  = v14 instanceof o0;
                        }
                        catch (Throwable v15) {
                            throw m44.a("l", (Object)v15, (long)6163447318919850987L, (long)var1_1);
                        }
                    }
                    try {
                        if (v5 /* !! */ ) {
                            throw (o0)var18_11;
                        }
                    }
                    catch (Throwable v16) {
                        throw m44.a("l", (Object)v16, (long)6163447318919850987L, (long)var1_1);
                    }
                    v14 = var18_11;
                }
                throw (Error)v14;
            }
            catch (Throwable var19_12) {
                try {
                    if (var1_1 >= 0L && var17_9) {
                        v17 = new Object[3];
                        v17[2] = true;
                        v17[1] = var16_8;
                        v17[0] = var13_7;
                        m44.a("s", (Object)m44.a("h", (long)5553953380557875993L, (long)var1_1), (Object)v17, (long)5835051554132368056L, (long)var1_1);
                    }
                }
                catch (Throwable v18) {
                    throw m44.a("l", (Object)v18, (long)6163447318919850987L, (long)var1_1);
                }
                throw var19_12;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var17_9) ** GOTO lbl117
                v3 = new Object[3];
                v3[2] = true;
                v3[1] = var16_8;
                v3[0] = var13_7;
                m44.a("s", (Object)m44.a("h", (long)5553953380557875993L, (long)var1_1), (Object)v3, (long)5835051554132368056L, (long)var1_1);
            }
            catch (Throwable v4) {
                throw m44.a("l", (Object)v4, (long)6163447318919850987L, (long)var1_1);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl117:
        // 3 sources

    }

    private static boolean z(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x7481B961D35AL;
                CallSite callSite = m44.a("i", (long)-4619510886000992551L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)_8.a("f", (int)29867, (long)(0x24626F04C0BA1EE4L ^ l10));
                        object = m44.a("i", (Object)objectArray2, (long)-6547874353523315153L, (long)l10);
                        if (callSite != false) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("i", (Object)runtimeException, (long)-4772225455781657690L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("i", (Object)runtimeException, (long)-4772225455781657690L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Exception decompiling
     */
    public static final void P(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[CASE]], but top level block is 2[TRYBLOCK]
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

    private static boolean l(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x5346E40F1AE6L;
                CallSite callSite = m44.a("m", (long)8527588521768294245L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l11;
                        objectArray2[0] = (int)_8.a("f", (int)2499, (long)(0x22617C89013EAA2AL ^ l10));
                        object = m44.a("m", (Object)objectArray2, (long)7826518590138673043L, (long)l10);
                        if (callSite != false) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("m", (Object)runtimeException, (long)8392882300540422682L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("m", (Object)runtimeException, (long)8392882300540422682L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void c(Object[] var0) {
        var1_1 = (Long)var0[0];
        v0 = var1_1 = _8.a ^ var1_1;
        var3_2 = v0 ^ 56150605294733L;
        var5_3 = v0 ^ 123399321394752L;
        var7_4 = v0 ^ 79567499492681L;
        var9_5 = v0 ^ 3778756935979L;
        var11_6 = v0 ^ 55769269940370L;
        var13_7 = v0 ^ 130015336338568L;
        var15_8 = v0 ^ 27948520550412L;
        var17_9 = v0 ^ 38152716276089L;
        var19_10 = v0 ^ 90357315899774L;
        var22_11 = new co(4, var11_6);
        v1 = m44.a("k", (long)-2350714851144725213L, (long)var1_1);
        var23_12 = true;
        v2 = new Object[2];
        v2[1] = var7_4;
        v2[0] = var22_11;
        m44.a("t", (Object)m44.a("o", (long)-4202753290549402714L, (long)var1_1), (Object)v2, (long)-2454890810572145972L, (long)var1_1);
        var21_13 = v1;
        try {
            v3 = new Object[1];
            v3[0] = var19_10;
            m44.a("k", (Object)v3, (long)-4190198656379510555L, (long)var1_1);
            v4 = new Object[1];
            v4[0] = var13_7;
            m44.a("k", (Object)v4, (long)-4339083945831862825L, (long)var1_1);
            v5 = new Object[2];
            v5[1] = var3_2;
            v5[0] = (int)_8.a("f", (int)23433, (long)(2624360532536348978L ^ var1_1));
            m44.a("k", (Object)v5, (long)-4495265215184532056L, (long)var1_1);
            v6 = new Object[1];
            v6[0] = var17_9;
            m44.a("k", (Object)v6, (long)-4473378185973500818L, (long)var1_1);
            ** if (var21_13 == false) goto lbl-1000
        }
        catch (Throwable var24_14) {
            try {
                block31: {
                    block29: {
                        block30: {
                            block28: {
                                block27: {
                                    v9 /* !! */  = var23_12;
                                    if (var1_1 < 0L) ** GOTO lbl80
                                    if (var21_13 == false) break block27;
                                    try {
                                        block32: {
                                            if (!v9 /* !! */ ) ** GOTO lbl83
                                            break block32;
                                            catch (Throwable v10) {
                                                throw m44.a("k", (Object)v10, (long)-2506323955690462380L, (long)var1_1);
                                            }
                                        }
                                        v11 = new Object[2];
                                        v11[1] = var9_5;
                                        v11[0] = var22_11;
                                        m44.a("t", (Object)m44.a("o", (long)-4202753290549402714L, (long)var1_1), (Object)v11, (long)-4365648903459014531L, (long)var1_1);
                                        v12 = false;
                                    }
                                    catch (Throwable v13) {
                                        throw m44.a("k", (Object)v13, (long)-2506323955690462380L, (long)var1_1);
                                    }
                                }
                                var23_12 = v12;
                                try {
                                    v9 /* !! */  = var21_13;
lbl80:
                                    // 2 sources

                                    if (var1_1 > 0L) {
                                        if (v9 /* !! */ ) break block28;
                                    }
                                    ** GOTO lbl94
lbl83:
                                    // 2 sources

                                    v14 = new Object[1];
                                    v14[0] = var5_3;
                                    m44.a("t", (Object)m44.a("o", (long)-4202753290549402714L, (long)var1_1), (Object)v14, (long)-4262742217869447672L, (long)var1_1);
                                }
                                catch (Throwable v15) {
                                    throw m44.a("k", (Object)v15, (long)-2506323955690462380L, (long)var1_1);
                                }
                            }
                            v9 /* !! */  = var24_14 instanceof RuntimeException;
lbl94:
                            // 2 sources

                            if (var1_1 < 0L || var21_13 == false) break block29;
                            try {
                                block33: {
                                    if (!v9 /* !! */ ) break block30;
                                    break block33;
                                    catch (Throwable v16) {
                                        throw m44.a("k", (Object)v16, (long)-2506323955690462380L, (long)var1_1);
                                    }
                                }
                                throw (RuntimeException)var24_14;
                            }
                            catch (Throwable v17) {
                                throw m44.a("k", (Object)v17, (long)-2506323955690462380L, (long)var1_1);
                            }
                        }
                        try {
                            v18 = var24_14;
                            if (var21_13 == false) break block31;
                            v9 /* !! */  = v18 instanceof o0;
                        }
                        catch (Throwable v19) {
                            throw m44.a("k", (Object)v19, (long)-2506323955690462380L, (long)var1_1);
                        }
                    }
                    try {
                        if (v9 /* !! */ ) {
                            throw (o0)var24_14;
                        }
                    }
                    catch (Throwable v20) {
                        throw m44.a("k", (Object)v20, (long)-2506323955690462380L, (long)var1_1);
                    }
                    v18 = var24_14;
                }
                throw (Error)v18;
            }
            catch (Throwable var25_15) {
                try {
                    if (var1_1 >= 0L && var23_12) {
                        v21 = new Object[3];
                        v21[2] = true;
                        v21[1] = var22_11;
                        v21[0] = var15_8;
                        m44.a("t", (Object)m44.a("o", (long)-4202753290549402714L, (long)var1_1), (Object)v21, (long)-2862867199223197177L, (long)var1_1);
                    }
                }
                catch (Throwable v22) {
                    throw m44.a("k", (Object)v22, (long)-2506323955690462380L, (long)var1_1);
                }
                throw var25_15;
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                if (!var23_12) ** GOTO lbl135
                v7 = new Object[3];
                v7[2] = true;
                v7[1] = var22_11;
                v7[0] = var15_8;
                m44.a("t", (Object)m44.a("o", (long)-4202753290549402714L, (long)var1_1), (Object)v7, (long)-2862867199223197177L, (long)var1_1);
            }
            catch (Throwable v8) {
                throw m44.a("k", (Object)v8, (long)-2506323955690462380L, (long)var1_1);
            }
        }
lbl-1000:
        // 1 sources

        {
        }
lbl135:
        // 3 sources

    }

    /*
     * Exception decompiling
     */
    private static void X(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
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

    private static boolean F(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x1AACFC21F19AL;
                CallSite callSite = m44.a("m", (long)78937397800263717L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        object = m44.a("m", (Object)objectArray2, (long)2298776295456722918L, (long)l10);
                        if (callSite != false) break block4;
                        if (object == false) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("m", (Object)runtimeException, (long)232467876503780698L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("m", (Object)runtimeException, (long)232467876503780698L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x3E6D967131CBL;
        long l13 = l11 ^ 0x4521C21A200FL;
        long l14 = l11 ^ 0x141747336D4AL;
        long l15 = l11 ^ 0x65F97075979DL;
        i2 i22 = new i2((int)_8.a("f", (int)24879, (long)(0x3CB2D51A62F236E2L ^ l10)), l15);
        CallSite callSite = m44.a("m", (long)154978569852309605L, (long)l10);
        boolean bl2 = true;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = i22;
        m44.a("r", (Object)m44.a("i", (long)1795492980117880544L, (long)l10), (Object)objectArray2, (long)47416080249464714L, (long)l10);
        CallSite callSite2 = callSite;
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l12;
            objectArray3[0] = (int)_8.a("f", (int)30459, (long)(0x5B0F010800FA11DL ^ l10));
            m44.a("m", (Object)objectArray3, (long)2079415522638778606L, (long)l10);
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l12;
            objectArray4[0] = (int)_8.a("f", (int)17787, (long)(0x66538F078EDF92ADL ^ l10));
            m44.a("m", (Object)objectArray4, (long)2079415522638778606L, (long)l10);
            if (callSite2 == false) return;
        }
        catch (Throwable throwable) {
            try {
                if (l10 <= 0L || !bl2) throw throwable;
                Object[] objectArray5 = new Object[3];
                objectArray5[2] = true;
                objectArray5[1] = i22;
                objectArray5[0] = l14;
                m44.a("r", (Object)m44.a("i", (long)1795492980117880544L, (long)l10), (Object)objectArray5, (long)361132460848697153L, (long)l10);
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                throw m44.a("m", (Object)runtimeException, (long)32003314016353810L, (long)l10);
            }
        }
        try {
            if (!bl2) return;
            Object[] objectArray6 = new Object[3];
            objectArray6[2] = true;
            objectArray6[1] = i22;
            objectArray6[0] = l14;
            m44.a("r", (Object)m44.a("i", (long)1795492980117880544L, (long)l10), (Object)objectArray6, (long)361132460848697153L, (long)l10);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw m44.a("m", (Object)runtimeException, (long)32003314016353810L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    private static void i(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [33[DOLOOP], 30[UNCONDITIONALDOLOOP], 32[DOLOOP]], but top level block is 12[TRYBLOCK]
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

    private static boolean R(Object[] objectArray) {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = (Long)objectArray[0];
                        l11 = (l10 = a ^ l10) ^ 0x5D78DBAAC860L;
                        callSite = m44.a("k", (long)-6581829255552174357L, (long)l10);
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l11;
                                objectArray2[0] = (int)_8.a("f", (int)30459, (long)(0x5B0CD0AA95E0793L ^ l10));
                                object = m44.a("k", (Object)objectArray2, (long)-4748079272611990251L, (long)l10);
                                if (callSite == false) break block8;
                                if (object == false) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw m44.a("k", (Object)runtimeException, (long)-6413249280516695908L, (long)l10);
                            }
                            return true;
                        }
                        catch (RuntimeException runtimeException) {
                            throw m44.a("k", (Object)runtimeException, (long)-6413249280516695908L, (long)l10);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l11;
                    objectArray3[0] = (int)_8.a("f", (int)17787, (long)(0x6653B21DA78E3423L ^ l10));
                    object = m44.a("k", (Object)objectArray3, (long)-4748079272611990251L, (long)l10);
                }
                try {
                    try {
                        if (callSite == false) break block10;
                        if (object == false) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw m44.a("k", (Object)runtimeException, (long)-6413249280516695908L, (long)l10);
                    }
                    return true;
                }
                catch (RuntimeException runtimeException) {
                    throw m44.a("k", (Object)runtimeException, (long)-6413249280516695908L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x449E;
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
                throw new RuntimeException("com/zelix/_8", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8.h[n11] = n12;
        }
        return h[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = _8.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/_8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

