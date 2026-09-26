/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._v;
import com.zelix.aa;
import com.zelix.b1;
import com.zelix.cf;
import com.zelix.d_;
import com.zelix.df;
import com.zelix.ei;
import com.zelix.fs;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.loc;
import com.zelix.loe;
import com.zelix.lox;
import com.zelix.lq0;
import com.zelix.lqu;
import com.zelix.lw3;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.s0;
import com.zelix.sh;
import com.zelix.sz;
import com.zelix.u2;
import com.zelix.u3;
import com.zelix.u5;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ee {
    private final boolean P;
    private static final fs Z;
    private Set G;
    private ol K;
    private final df N;
    private Map v;
    private Map x;
    private ol B;
    private final boolean u;
    private ol b;
    private ol T;
    private ol r;
    private df S;
    private d_ c;
    private final _6 w;
    private static final fs d;
    private static final fs R;
    private static final long a;
    private static final String[] e;
    private static final String[] f;
    private static final Map g;
    private static final long[] h;
    private static final Integer[] i;
    private static final Map j;

    public final sz i(Object[] objectArray) {
        l62 l622 = (l62)objectArray[0];
        loe loe2 = (loe)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x2463D652256DL;
        return (sz)m44.a("t", (Object)this, (long)207790779956238145L, (long)l).m(l2, l622, loe2);
    }

    private void I(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x47D5FCF1F33AL;
        long l4 = l3 >>> 16;
        int n = (int)(l3 << 48 >>> 48);
        long l5 = l2 ^ 0x22CFBAFEC07CL;
        Object[] objectArray2 = new b1[this.x.size()];
        CallSite callSite = m44.a("k", (long)6616470126283078558L, (long)l);
        m44.a("t", this.x.keySet(), (Object)objectArray2, (long)6882226688038082815L, (long)l);
        m44.a("w", (Object)this, (d_)new d_(l5, objectArray2, this.x.values().size()), (long)6908093045600844178L, (long)l);
        for (Map.Entry entry : this.x.entrySet()) {
            m44.a("t", (Object)m44.a("u", (Object)this, (long)6908093045600844178L, (long)l), (long)l4, (char)((char)n), entry.getValue(), entry.getKey(), (long)6499349240617207103L, (long)l);
            if (callSite == null) continue;
        }
    }

    /*
     * Exception decompiling
     */
    private boolean P(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 7[SWITCH]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final Map f(Object[] objectArray) {
        String string = (String)objectArray[0];
        Map map = (Map)objectArray[1];
        long l = (Long)objectArray[2];
        l = a ^ l;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = map;
        objectArray2[0] = string;
        return m44.a("w", (Object)m44.a("v", (Object)this, (long)2270068949509373842L, (long)l), (Object)objectArray2, (long)2193703340480359426L, (long)l);
    }

    private final Set u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l62 l622 = (l62)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x4269453EA4ACL;
        return m44.a("p", (Object)this, (long)8036750017853459321L, (long)l).J(l2, l622);
    }

    Map d(Object[] objectArray) {
        CallSite callSite;
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x5AFAA9EEB364L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        CallSite callSite2 = m44.a("i", (Object)objectArray2, (long)6269255981576500194L, (long)l);
        Iterator iterator = m44.a("v", (Object)m44.a("w", (Object)this, (long)5395603929380347714L, (long)l), (Object)new Object[0], (long)6260432024332768545L, (long)l).iterator();
        CallSite callSite3 = m44.a("i", (long)5992056185006928740L, (long)l);
        block0: while (iterator.hasNext()) {
            callSite = iterator.next();
            do {
                Object object3;
                Map.Entry entry = (Map.Entry)((Object)callSite);
                Object object2 = entry.getValue();
                while (true) {
                    block3: for (Object object3 : ((Map)object2).entrySet()) {
                        do {
                            Map.Entry entry2 = (Map.Entry)object3;
                            loe loe2 = (loe)entry2.getKey();
                            sz sz2 = (sz)entry2.getValue();
                            loe loe3 = callSite2.put(sz2, loe2);
                            if (callSite3 != null) continue block0;
                            object2 = callSite3;
                            if (l < 0L) continue block3;
                            if (object2 == null) continue block3;
                            object3 = callSite3;
                        } while (l <= 0L);
                    }
                    break;
                }
                if (object3 == null) continue block0;
                callSite = callSite2;
            } while (l < 0L);
        }
        return callSite;
    }

    public final void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        sz sz2 = (sz)objectArray[1];
        u5 u52 = (u5)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x31F8493A56C4L;
        sz sz3 = (sz)m44.a("p", (Object)this, (long)794635747218506475L, (long)l).get(sz2);
        sz3.Z(l2, (Object)u52);
    }

    public final b1 W(Object[] objectArray) {
        b1 b12;
        block2: {
            b1 b13;
            block3: {
                b13 = (b1)objectArray[0];
                long l = (Long)objectArray[1];
                l = a ^ l;
                b1 b14 = (b1)this.x.get(b13);
                CallSite callSite = m44.a("k", (long)7440531551489427214L, (long)l);
                try {
                    b12 = b14;
                    if (callSite != null) break block2;
                    if (b12 == null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)((Object)n92), (long)8958580287941301688L, (long)l);
                }
                b12 = b14;
                break block2;
            }
            b12 = b13;
        }
        return b12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Set x(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        long l2;
        block20: {
            CallSite callSite4;
            long l3;
            block19: {
                CallSite callSite5;
                block18: {
                    ee ee2;
                    b1 b12;
                    block16: {
                        block17: {
                            boolean bl;
                            long l4;
                            block15: {
                                l2 = (Long)objectArray[0];
                                b12 = (b1)objectArray[1];
                                long l5 = l2 = a ^ l2;
                                long l6 = l5 ^ 0x5866B99233CCL;
                                l4 = l5 ^ 0x2F30791453E2L;
                                l3 = l5 ^ 0x33988F49BB8EL;
                                l = l5 ^ 0x63F59EDF2CBL;
                                long l7 = l5 ^ 0xA4E0DDCF36FL;
                                callSite4 = m44.a("l", (long)8137192841502658721L, (long)l2);
                                try {
                                    try {
                                        bl = b12.D(l6);
                                        if (callSite4 != null) break block15;
                                        if (bl) return null;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("l", (Object)((Object)n92), (long)7781178429940810263L, (long)l2);
                                    }
                                    bl = b12.f(l7);
                                }
                                catch (n9 n93) {
                                    throw m44.a("l", (Object)((Object)n93), (long)7781178429940810263L, (long)l2);
                                }
                            }
                            try {
                                if (bl) {
                                    return null;
                                }
                            }
                            catch (n9 n94) {
                                throw m44.a("l", (Object)((Object)n94), (long)7781178429940810263L, (long)l2);
                            }
                            try {
                                try {
                                    ee2 = this;
                                    if (callSite4 != null) break block16;
                                    if (m44.a("r", (Object)ee2, (long)8422025176940171949L, (long)l2) != null) break block17;
                                }
                                catch (n9 n95) {
                                    throw m44.a("l", (Object)((Object)n95), (long)7781178429940810263L, (long)l2);
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l4;
                                m44.a("m", (Object)this, (Object)objectArray2, (long)7960996773964893394L, (long)l2);
                            }
                            catch (n9 n96) {
                                throw m44.a("l", (Object)((Object)n96), (long)7781178429940810263L, (long)l2);
                            }
                        }
                        ee2 = this;
                    }
                    callSite3 = m44.a("s", (Object)ee2, (Object)new Object[]{b12}, (long)8396827048959868984L, (long)l2);
                    try {
                        callSite5 = callSite3;
                        if (callSite4 != null) break block18;
                        if (callSite5 != null) break block19;
                    }
                    catch (n9 n97) {
                        throw m44.a("l", (Object)((Object)n97), (long)7781178429940810263L, (long)l2);
                    }
                    callSite5 = b12;
                }
                callSite3 = callSite5;
            }
            CallSite callSite6 = m44.a("s", (Object)m44.a("r", (Object)this, (long)8422025176940171949L, (long)l2), (long)l3, (Object)callSite3, (long)7698701555197727876L, (long)l2);
            callSite2 = null;
            try {
                callSite = callSite6;
                if (callSite4 != null) break block20;
                if (callSite == null) return callSite2;
            }
            catch (n9 n98) {
                throw m44.a("l", (Object)((Object)n98), (long)7781178429940810263L, (long)l2);
            }
            callSite = callSite6;
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l;
        objectArray3[0] = callSite;
        callSite2 = m44.a("l", (Object)objectArray3, (long)8001409638902562584L, (long)l2);
        callSite2.add(callSite3);
        return callSite2;
    }

    public final boolean Q(Object[] objectArray) {
        lox lox2;
        long l;
        block4: {
            loe loe2;
            long l2;
            block3: {
                loe loe3;
                block2: {
                    l = (Long)objectArray[0];
                    loe3 = (loe)objectArray[1];
                    l2 = (l = a ^ l) ^ 0x128931921C92L;
                    CallSite callSite = m44.a("i", (long)5836730037956587852L, (long)l);
                    if (m44.a("w", (Object)this, (long)6141353907566197065L, (long)l) == false) break block2;
                    loe2 = loe3;
                    if (l < 0L) break block3;
                    lox2 = loe2;
                    if (callSite == null) break block4;
                }
                loe2 = loe3;
            }
            lox2 = loe2.M(l2);
        }
        return m44.a("w", (Object)this, (long)5467897831791758503L, (long)l).contains(lox2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int W(Object[] var1_1) {
        block39: {
            block37: {
                block38: {
                    block36: {
                        block34: {
                            block35: {
                                block33: {
                                    block32: {
                                        block30: {
                                            block31: {
                                                block28: {
                                                    block29: {
                                                        var5_2 = (l62)var1_1[0];
                                                        var2_3 = (loc)var1_1[1];
                                                        var7_4 = (loc)var1_1[2];
                                                        var3_5 = (Long)var1_1[3];
                                                        var6_6 = (Set)var1_1[4];
                                                        var8_7 = (sz)var1_1[5];
                                                        v0 = var3_5 = ee.a ^ var3_5;
                                                        v1 = v0 ^ 108144388515722L;
                                                        var9_8 = (int)(v1 >>> 48);
                                                        var10_9 = (int)(v1 << 16 >>> 48);
                                                        var11_10 = (int)(v1 << 32 >>> 32);
                                                        v2 = v0 ^ 107306852041023L;
                                                        var12_11 = (int)(v2 >>> 48);
                                                        var13_12 = v2 << 16 >>> 16;
                                                        var15_13 = v0 ^ 28421741075895L;
                                                        var17_14 = m44.a("m", (long)-8839379350306495208L, (long)var3_5);
                                                        try {
                                                            try {
                                                                v3 /* !! */  = var5_2;
                                                                if (var17_14 != null) break block28;
                                                                if (!v3 /* !! */ .c((short)var12_11, var13_12)) break block29;
                                                            }
                                                            catch (n9 v4) {
                                                                throw m44.a("m", (Object)v4, (long)-7042110186003286098L, (long)var3_5);
                                                            }
                                                            return 2;
                                                        }
                                                        catch (n9 v5) {
                                                            throw m44.a("m", (Object)v5, (long)-7042110186003286098L, (long)var3_5);
                                                        }
                                                    }
                                                    v3 /* !! */  = m44.a("s", (Object)this, (long)-7175207131853523881L, (long)var3_5).h((short)var9_8, (char)var10_9, var5_2, var11_10, var2_3, m44.a("i", (long)-8706389608826552240L, (long)var3_5));
                                                }
                                                var18_15 = (fs)v3 /* !! */ ;
                                                try {
                                                    try {
                                                        v6 = var18_15;
                                                        if (var3_5 <= 0L || var17_14 != null) break block30;
                                                        if (v6 != null) break block31;
                                                    }
                                                    catch (n9 v7) {
                                                        throw m44.a("m", (Object)v7, (long)-7042110186003286098L, (long)var3_5);
                                                    }
                                                    return 0;
                                                }
                                                catch (n9 v8) {
                                                    throw m44.a("m", (Object)v8, (long)-7042110186003286098L, (long)var3_5);
                                                }
                                            }
                                            v6 = var18_15;
                                        }
                                        try {
                                            try {
                                                v9 = m44.a("i", (long)-9125980355592467837L, (long)var3_5);
                                                v10 = var17_14;
                                                if (var3_5 >= 0L) {
                                                    if (v10 != null) break block32;
                                                    if (v6 == v9) break block33;
                                                }
                                                ** GOTO lbl70
                                            }
                                            catch (n9 v11) {
                                                throw m44.a("m", (Object)v11, (long)-7042110186003286098L, (long)var3_5);
                                            }
                                            v6 = var18_15;
                                            v9 = m44.a("i", (long)-8911186037596885869L, (long)var3_5);
                                        }
                                        catch (n9 v12) {
                                            throw m44.a("m", (Object)v12, (long)-7042110186003286098L, (long)var3_5);
                                        }
                                    }
                                    try {
                                        if (var3_5 < 0L) break block34;
                                        v10 = var17_14;
lbl70:
                                        // 2 sources

                                        if (v10 != null) break block34;
                                        if (v6 != v9) break block35;
                                    }
                                    catch (n9 v13) {
                                        throw m44.a("m", (Object)v13, (long)-7042110186003286098L, (long)var3_5);
                                    }
                                }
                                var19_16 = new ei(var5_2, var18_15, (fs)m44.a("i", (long)-8706389608826552240L, (long)var3_5));
                                var6_6.add(var19_16);
                                return 0;
                            }
                            try {
                                v6 = var18_15;
                                if (var3_5 <= 0L || var17_14 != null) break block36;
                                v9 = m44.a("i", (long)-8706389608826552240L, (long)var3_5);
                            }
                            catch (n9 v14) {
                                throw m44.a("m", (Object)v14, (long)-7042110186003286098L, (long)var3_5);
                            }
                        }
                        try {
                            if (v6 == v9) {
                                return 1;
                            }
                        }
                        catch (n9 v15) {
                            throw m44.a("m", (Object)v15, (long)-7042110186003286098L, (long)var3_5);
                        }
                        v6 = var18_15;
                    }
                    try {
                        try {
                            try {
                                try {
                                    v16 = m44.a("s", (Object)v6, (long)-9044609604675687084L, (long)var3_5);
                                    if (var17_14 != null) break block37;
                                    if (v16 == null) break block38;
                                }
                                catch (n9 v17) {
                                    throw m44.a("m", (Object)v17, (long)-7042110186003286098L, (long)var3_5);
                                }
                                v18 = m44.a("s", (Object)var18_15, (long)-9044609604675687084L, (long)var3_5).equals(var7_4);
                                if (var17_14 != null) break block39;
                            }
                            catch (n9 v19) {
                                throw m44.a("m", (Object)v19, (long)-7042110186003286098L, (long)var3_5);
                            }
                            if (v18 == 0) break block38;
                        }
                        catch (n9 v20) {
                            throw m44.a("m", (Object)v20, (long)-7042110186003286098L, (long)var3_5);
                        }
                        m44.a("s", (Object)this, (long)-7175207131853523881L, (long)var3_5).h((short)var9_8, (char)var10_9, var5_2, var11_10, var2_3, var18_15);
                        return 1;
                    }
                    catch (n9 v21) {
                        throw m44.a("m", (Object)v21, (long)-7042110186003286098L, (long)var3_5);
                    }
                }
                v16 = m44.a("s", (Object)this, (long)-7175207131853523881L, (long)var3_5).h((short)var9_8, (char)var10_9, var5_2, var11_10, var2_3, var18_15);
            }
            var8_7.Z(var15_13, (Object)m44.a("s", (Object)var18_15, (long)-9044609604675687084L, (long)var3_5));
            v18 = -1;
        }
        return v18;
    }

    public final _v b(Object[] objectArray) {
        String string = (String)objectArray[0];
        loe loe2 = (loe)objectArray[1];
        long l = (Long)objectArray[2];
        _v _v2 = (_v)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x64BDD200C28BL;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 48);
        int n3 = (int)(l2 << 32 >>> 32);
        return (_v)m44.a("r", (Object)this, (long)-1932605328372682009L, (long)l).h((short)n, (char)n2, string, n3, loe2, _v2);
    }

    public final Map a(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        Map map = (Map)objectArray[2];
        l = a ^ l;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = map;
        objectArray2[0] = string;
        return m44.a("q", (Object)m44.a("p", (Object)this, (long)1489637584981476197L, (long)l), (Object)objectArray2, (long)1227130344160977780L, (long)l);
    }

    public final void L(Object[] objectArray) {
        lox lox2;
        long l;
        block4: {
            loe loe2;
            long l2;
            block3: {
                loe loe3;
                block2: {
                    l = (Long)objectArray[0];
                    loe3 = (loe)objectArray[1];
                    l2 = (l = a ^ l) ^ 0x31B6CACB9392L;
                    CallSite callSite = m44.a("i", (long)-2449931583908954548L, (long)l);
                    if (m44.a("w", (Object)this, (long)-2721761969325918647L, (long)l) == false) break block2;
                    loe2 = loe3;
                    if (l <= 0L) break block3;
                    lox2 = loe2;
                    if (callSite == null) break block4;
                }
                loe2 = loe3;
            }
            lox2 = loe2.M(l2);
        }
        boolean bl = m44.a("w", (Object)this, (long)-4259909211396635737L, (long)l).add(lox2);
    }

    /*
     * Exception decompiling
     */
    public final boolean l(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final b1 S(Object[] objectArray) {
        b1 b12 = (b1)objectArray[0];
        return (b1)this.x.get(b12);
    }

    public boolean o(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("t", (Object)this, (long)-7874255262219993398L, (long)l);
    }

    private void z(Object[] objectArray) {
        Set set;
        CallSite callSite;
        long l;
        long l2;
        Set set2;
        block13: {
            Set set3;
            block14: {
                l62 l622;
                block12: {
                    Object object;
                    int n;
                    int n2;
                    block11: {
                        l622 = (l62)objectArray[0];
                        n2 = (Integer)objectArray[1];
                        int n3 = (Integer)objectArray[2];
                        n = (Integer)objectArray[3];
                        loc loc2 = (loc)objectArray[4];
                        loc loc3 = (loc)objectArray[5];
                        set3 = (Set)objectArray[6];
                        set2 = (Set)objectArray[7];
                        long l3 = l2 = ((long)n2 << 48 | (long)n3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ a;
                        long l4 = l3 ^ 0x4E0A4591F743L;
                        long l5 = l3 ^ 0x5898C0C74C49L;
                        l = l3 ^ 0x5F4C3B4A7F6AL;
                        Object[] objectArray2 = new Object[3];
                        objectArray2[2] = l4;
                        objectArray2[1] = new loe(loc3, l5);
                        objectArray2[0] = l622;
                        CallSite callSite2 = m44.a("s", (Object)this, (Object)objectArray2, (long)-7948523439645907633L, (long)l2);
                        callSite = m44.a("l", (long)-7731221979536624391L, (long)l2);
                        try {
                            try {
                                object = callSite2;
                                if (callSite != null) break block11;
                                if (object == null) break block12;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)((Object)n92), (long)-8096205652905089457L, (long)l2);
                            }
                            object = callSite2.t();
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)((Object)n93), (long)-8096205652905089457L, (long)l2);
                        }
                    }
                    List list = (List)object;
                    int n4 = 0;
                    block6: while (n4 < list.size()) {
                        l62 l623 = (l62)list.get(n4);
                        set = set3;
                        if (n2 < 0) break block13;
                        boolean bl = set.add(l623);
                        try {
                            ++n4;
                            while (callSite == null) {
                                if (callSite == null) continue block6;
                                if (n >= 0) continue;
                                break block6;
                            }
                            break block14;
                        }
                        catch (n9 n94) {
                            throw m44.a("l", (Object)((Object)n94), (long)-8096205652905089457L, (long)l2);
                        }
                    }
                    if (callSite == null) break block14;
                }
                boolean bl = set3.add(l622);
            }
            set = set3;
        }
        for (l62 l624 : set) {
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = set2;
            objectArray3[1] = l624;
            objectArray3[0] = l;
            m44.a("m", (Object)this, (Object)objectArray3, (long)-8051982071901251075L, (long)l2);
            if (callSite == null) continue;
        }
    }

    public final String y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        sz sz2 = (sz)objectArray[1];
        l = a ^ l;
        return (String)((sz)m44.a("r", (Object)this, (long)4378954721578939689L, (long)l).get(sz2)).t();
    }

    private void o(Object[] objectArray) {
        lw3 lw32 = (lw3)objectArray[0];
        long l = (Long)objectArray[1];
        l62 l622 = (l62)objectArray[2];
        l6q l6q2 = (l6q)objectArray[3];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x7CA91B339C6DL;
        long l4 = l2 ^ 0x47173BBF6588L;
        int n = (int)(l4 >>> 48);
        int n2 = (int)(l4 << 16 >>> 32);
        int n3 = (int)(l4 << 48 >>> 48);
        long l5 = l2 ^ 0x5E70939C78DDL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = l622;
        CallSite callSite = m44.a("q", (Object)lw32, (Object)objectArray2, (long)-1379949117767027189L, (long)l);
        CallSite callSite2 = m44.a("n", (long)-689283708659984861L, (long)l);
        try {
            if (callSite == false) {
                return;
            }
        }
        catch (n9 n92) {
            throw m44.a("n", (Object)((Object)n92), (long)-1333490628720835435L, (long)l);
        }
        List list = l6q2.t((char)n, (Object)l622, n2, (short)n3);
        if (list != null) {
            for (int i = 0; i < list.size(); ++i) {
                l62 l623 = (l62)list.get(i);
                Object[] objectArray3 = new Object[4];
                objectArray3[3] = l6q2;
                objectArray3[2] = l623;
                objectArray3[1] = l5;
                objectArray3[0] = lw32;
                m44.a("o", (Object)this, (Object)objectArray3, (long)-1274844861351227471L, (long)l);
                if (callSite2 == null) continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final _v n(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[UNCONDITIONALDOLOOP]], but top level block is 11[WHILELOOP]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void K(Object[] var1_1) {
        block35: {
            block37: {
                block36: {
                    block34: {
                        var3_2 = (Long)var1_1[0];
                        var2_3 = (Map.Entry)var1_1[1];
                        v0 = var3_2 = ee.a ^ var3_2;
                        var5_4 = v0 ^ 69287999777585L;
                        var7_5 = v0 ^ 51975525412842L;
                        var9_6 = v0 ^ 75647465987887L;
                        var11_7 = v0 ^ 746036608483L;
                        var13_8 = v0 ^ 105756922238550L;
                        var15_9 = v0 ^ 120039685745554L;
                        v1 = v0 ^ 48843329875067L;
                        var17_10 = (int)(v1 >>> 48);
                        var18_11 = v1 << 16 >>> 16;
                        var21_12 = (String)var2_3.getKey();
                        var20_13 = m44.a("i", (long)7498628225263798364L, (long)var3_2);
                        var22_14 = l62.t((String)var21_12);
                        try {
                            v2 = var22_14;
                            if (var20_13 != null) break block34;
                            if (v2 == null) break block35;
                        }
                        catch (n9 v3) {
                            throw m44.a("i", (Object)v3, (long)8286953085667039978L, (long)var3_2);
                        }
                        v2 = var22_14;
                    }
                    try {
                        try {
                            if (var20_13 != null) break block36;
                            if (v2.c((short)var17_10, var18_11)) break block35;
                        }
                        catch (n9 v4) {
                            throw m44.a("i", (Object)v4, (long)8286953085667039978L, (long)var3_2);
                        }
                        v2 = var22_14;
                    }
                    catch (n9 v5) {
                        throw m44.a("i", (Object)v5, (long)8286953085667039978L, (long)var3_2);
                    }
                }
                var23_15 = m44.a("v", (Object)v2, (long)7684519490202622860L, (long)var3_2);
                var24_16 = (Map)var2_3.getValue();
                try {
                    v6 = var24_16;
                    if (var20_13 != null) break block37;
                    if (v6 == null) break block35;
                }
                catch (n9 v7) {
                    throw m44.a("i", (Object)v7, (long)8286953085667039978L, (long)var3_2);
                }
                v6 = var24_16;
            }
            for (loe var26_18 : v6.keySet()) {
                block39: {
                    block44: {
                        block46: {
                            block45: {
                                block42: {
                                    block43: {
                                        block41: {
                                            block40: {
                                                block38: {
                                                    var27_19 = (_v)var24_16.get(var26_18);
                                                    var28_20 = var23_15.U(var26_18, var11_7);
                                                    try {
                                                        v8 = var28_20;
                                                        if (var3_2 <= 0L || var20_13 != null) break block38;
                                                        if (v8 == null) break block39;
                                                    }
                                                    catch (n9 v9) {
                                                        throw m44.a("i", (Object)v9, (long)8286953085667039978L, (long)var3_2);
                                                    }
                                                    v8 = var28_20;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            v10 = v8.D(var5_4);
                                                            if (var3_2 < 0L || var20_13 != null) break block40;
                                                            if (v10) break block39;
                                                        }
                                                        catch (n9 v11) {
                                                            throw m44.a("i", (Object)v11, (long)8286953085667039978L, (long)var3_2);
                                                        }
                                                        v12 = var28_20;
                                                        if (var20_13 != null) break block41;
                                                    }
                                                    catch (n9 v13) {
                                                        throw m44.a("i", (Object)v13, (long)8286953085667039978L, (long)var3_2);
                                                    }
                                                    v10 = v12.f(var15_9);
                                                }
                                                catch (n9 v14) {
                                                    throw m44.a("i", (Object)v14, (long)8286953085667039978L, (long)var3_2);
                                                }
                                            }
                                            try {
                                                if (v10) break block39;
                                                v12 = var27_19.U(var26_18, var11_7);
                                            }
                                            catch (n9 v15) {
                                                throw m44.a("i", (Object)v15, (long)8286953085667039978L, (long)var3_2);
                                            }
                                        }
                                        var29_21 = v12;
                                        try {
                                            v16 = var27_19.t(var7_5);
                                            if (var20_13 != null) break block42;
                                            if (v16) {
                                            }
                                            ** GOTO lbl114
                                        }
                                        catch (n9 v17) {
                                            throw m44.a("i", (Object)v17, (long)8286953085667039978L, (long)var3_2);
                                        }
                                        v18 /* !! */  = (lq0)m44.a("w", (Object)this, (long)7707780234721281143L, (long)var3_2).m(var13_8, var27_19.h(var9_6), var26_18);
                                        try {
                                            if (var20_13 != null) break block43;
                                            if (v18 /* !! */  != null) {
                                            }
                                            ** GOTO lbl114
                                        }
                                        catch (n9 v19) {
                                            throw m44.a("i", (Object)v19, (long)8286953085667039978L, (long)var3_2);
                                        }
                                        var27_19 = (_v)var31_23.S();
                                        v18 /* !! */  = var31_23.D();
                                    }
                                    var29_21 = (b1)v18 /* !! */ ;
                                    try {
                                        v20 = var20_13;
                                        if (var3_2 <= 0L) break block39;
                                        if (v20 == null) break block44;
lbl114:
                                        // 4 sources

                                        while (true) {
                                            v16 = false;
                                            break;
                                        }
                                    }
                                    catch (n9 v21) {
                                        throw m44.a("i", (Object)v21, (long)8286953085667039978L, (long)var3_2);
                                    }
                                }
                                var30_22 = v16;
                                v22 = var32_24 /* !! */  = (_v)m44.a("w", (Object)this, (long)7884477639217527458L, (long)var3_2).m(var13_8, var27_19.h(var9_6), var26_18);
                                if (var3_2 <= 0L) break block45;
                                if (v22 == null) break block46;
                                v22 = var27_19 = var32_24 /* !! */ ;
                            }
                            var29_21 = v22.U(var26_18, var11_7);
                            var30_22 = true;
                        }
                        if (var30_22) ** continue;
                    }
                    v20 = var32_24 /* !! */  = this.x.put(var28_20, var29_21);
                }
                if (var20_13 == null) continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    private boolean b(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 10[SWITCH]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private void J(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [71[DOLOOP]], but top level block is 6[TRYBLOCK]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private boolean d(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final boolean a(Object[] objectArray) {
        boolean bl;
        block16: {
            block17: {
                block15: {
                    CallSite callSite;
                    loe loe2;
                    CallSite callSite2;
                    long l;
                    block14: {
                        fs fs2;
                        fs fs3;
                        block12: {
                            block13: {
                                Object object;
                                block19: {
                                    loe loe3;
                                    long l2;
                                    l62 l622;
                                    block20: {
                                        long l3;
                                        loe loe4;
                                        loe loe5;
                                        block18: {
                                            l = (Long)objectArray[0];
                                            l622 = (l62)objectArray[1];
                                            loe5 = (loe)objectArray[2];
                                            loe4 = (loe)objectArray[3];
                                            long l4 = l = a ^ l;
                                            l2 = l4 ^ 0x7963B22E5EF2L;
                                            l3 = l4 ^ 0x4A6A57A42D26L;
                                            callSite2 = m44.a("m", (long)6968304375634002168L, (long)l);
                                            if (m44.a("s", (Object)this, (long)7245764259576449277L, (long)l) == false) break block18;
                                            loe2 = loe4;
                                            loe3 = loe5;
                                            object = callSite2;
                                            if (l <= 0L) break block19;
                                            if (object == null) break block20;
                                        }
                                        loe2 = loe4.M(l3);
                                        loe3 = loe5.M(l3);
                                    }
                                    object = m44.a("s", (Object)this, (long)8758621225942290871L, (long)l).m(l2, l622, loe3);
                                }
                                fs3 = (fs)object;
                                try {
                                    try {
                                        fs2 = fs3;
                                        if (l <= 0L || callSite2 != null) break block12;
                                        if (fs2 != null) break block13;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("m", (Object)((Object)n92), (long)8909583101074920014L, (long)l);
                                    }
                                    return false;
                                }
                                catch (n9 n93) {
                                    throw m44.a("m", (Object)((Object)n93), (long)8909583101074920014L, (long)l);
                                }
                            }
                            fs2 = fs3;
                        }
                        try {
                            try {
                                callSite = m44.a("s", (Object)fs2, (long)7465635318792833204L, (long)l);
                                if (l < 0L || callSite2 != null) break block14;
                                if (callSite == null) break block15;
                            }
                            catch (n9 n94) {
                                throw m44.a("m", (Object)((Object)n94), (long)8909583101074920014L, (long)l);
                            }
                            callSite = m44.a("s", (Object)fs3, (long)7465635318792833204L, (long)l);
                        }
                        catch (n9 n95) {
                            throw m44.a("m", (Object)((Object)n95), (long)8909583101074920014L, (long)l);
                        }
                    }
                    try {
                        bl = callSite.equals(loe2);
                        if (callSite2 != null) break block16;
                        if (bl) break block17;
                    }
                    catch (n9 n96) {
                        throw m44.a("m", (Object)((Object)n96), (long)8909583101074920014L, (long)l);
                    }
                }
                bl = true;
                break block16;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int U(Object[] var1_1) {
        block30: {
            block31: {
                block28: {
                    block29: {
                        block26: {
                            block27: {
                                block24: {
                                    block25: {
                                        block22: {
                                            block23: {
                                                var6_2 = (l62)var1_1[0];
                                                var2_3 = (loc)var1_1[1];
                                                var5_4 = (sz)var1_1[2];
                                                var3_5 = (Long)var1_1[3];
                                                v0 = var3_5 = ee.a ^ var3_5;
                                                v1 = v0 ^ 105027045079801L;
                                                var7_6 = (int)(v1 >>> 48);
                                                var8_7 = (int)(v1 << 16 >>> 48);
                                                var9_8 = (int)(v1 << 32 >>> 32);
                                                v2 = v0 ^ 101457909406796L;
                                                var10_9 = (int)(v2 >>> 48);
                                                var11_10 = v2 << 16 >>> 16;
                                                var13_11 = v0 ^ 39615229444292L;
                                                var15_12 = m44.a("n", (long)-7483000648462174101L, (long)var3_5);
                                                try {
                                                    try {
                                                        v3 /* !! */  = var6_2;
                                                        if (var15_12 != null) break block22;
                                                        if (!v3 /* !! */ .c((short)var10_9, var11_10)) break block23;
                                                    }
                                                    catch (n9 v4) {
                                                        throw m44.a("n", (Object)v4, (long)-8991898698317878563L, (long)var3_5);
                                                    }
                                                    return 2;
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("n", (Object)v5, (long)-8991898698317878563L, (long)var3_5);
                                                }
                                            }
                                            v3 /* !! */  = m44.a("p", (Object)this, (long)-9142387508104959708L, (long)var3_5).h((short)var7_6, (char)var8_7, var6_2, var9_8, var2_3, m44.a("j", (long)-7411193951791091232L, (long)var3_5));
                                        }
                                        var16_13 = (fs)v3 /* !! */ ;
                                        try {
                                            try {
                                                v6 /* !! */  = var16_13;
                                                if (var3_5 <= 0L || var15_12 != null) break block24;
                                                if (v6 /* !! */  != null) break block25;
                                            }
                                            catch (n9 v7) {
                                                throw m44.a("n", (Object)v7, (long)-8991898698317878563L, (long)var3_5);
                                            }
                                            return 0;
                                        }
                                        catch (n9 v8) {
                                            throw m44.a("n", (Object)v8, (long)-8991898698317878563L, (long)var3_5);
                                        }
                                    }
                                    v6 /* !! */  = var16_13;
                                }
                                try {
                                    try {
                                        v9 = m44.a("j", (long)-7194151958224185360L, (long)var3_5);
                                        v10 = var15_12;
                                        if (var3_5 > 0L) {
                                            if (v10 != null) break block26;
                                            if (v6 /* !! */  != v9) break block27;
                                        }
                                        ** GOTO lbl72
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("n", (Object)v11, (long)-8991898698317878563L, (long)var3_5);
                                    }
                                    m44.a("p", (Object)this, (long)-9142387508104959708L, (long)var3_5).h((short)var7_6, (char)var8_7, var6_2, var9_8, var2_3, var16_13);
                                    return 1;
                                }
                                catch (n9 v12) {
                                    throw m44.a("n", (Object)v12, (long)-8991898698317878563L, (long)var3_5);
                                }
                            }
                            v6 /* !! */  = var16_13;
                            v9 = m44.a("j", (long)-7411193951791091232L, (long)var3_5);
                        }
                        try {
                            try {
                                if (var3_5 <= 0L) break block28;
                                v10 = var15_12;
lbl72:
                                // 2 sources

                                if (v10 != null) break block28;
                                if (v6 /* !! */  != v9) break block29;
                            }
                            catch (n9 v13) {
                                throw m44.a("n", (Object)v13, (long)-8991898698317878563L, (long)var3_5);
                            }
                            return 1;
                        }
                        catch (n9 v14) {
                            throw m44.a("n", (Object)v14, (long)-8991898698317878563L, (long)var3_5);
                        }
                    }
                    try {
                        if (var3_5 <= 0L) break block30;
                        v6 /* !! */  = var16_13;
                        if (var15_12 != null) break block31;
                        v9 = m44.a("j", (long)-7322979327717941981L, (long)var3_5);
                    }
                    catch (n9 v15) {
                        throw m44.a("n", (Object)v15, (long)-8991898698317878563L, (long)var3_5);
                    }
                }
                try {
                    if (v6 /* !! */  == v9) {
                        m44.a("p", (Object)this, (long)-9142387508104959708L, (long)var3_5).h((short)var7_6, (char)var8_7, var6_2, var9_8, var2_3, m44.a("j", (long)-7322979327717941981L, (long)var3_5));
                        return 1;
                    }
                }
                catch (n9 v16) {
                    throw m44.a("n", (Object)v16, (long)-8991898698317878563L, (long)var3_5);
                }
                v6 /* !! */  = m44.a("p", (Object)this, (long)-9142387508104959708L, (long)var3_5).h((short)var7_6, (char)var8_7, var6_2, var9_8, var2_3, var16_13);
            }
            var5_4.Z(var13_11, (Object)m44.a("p", (Object)var16_13, (long)-6987287942476451801L, (long)var3_5));
        }
        return -1;
    }

    /*
     * Exception decompiling
     */
    final boolean j(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean H(Object[] objectArray) {
        b1 b12 = (b1)objectArray[0];
        return this.x.containsKey(b12);
    }

    private /* synthetic */ void D(long l, Map.Entry entry) {
        long l2 = (l = a ^ l) ^ 0x41E22628DD46L;
        Object[] objectArray = new Object[2];
        objectArray[1] = entry;
        objectArray[0] = l2;
        m44.a("k", (Object)this, (Object)objectArray, (long)-3198009207542403611L, (long)l);
    }

    public boolean B(Object[] objectArray) {
        CallSite callSite;
        int n;
        int n2;
        int n3;
        b1 b12;
        long l;
        block4: {
            block5: {
                l = (Long)objectArray[0];
                b12 = (b1)objectArray[1];
                long l2 = l = a ^ l;
                long l3 = l2 ^ 0x5070FCC7D092L;
                long l4 = l2 ^ 0x1EEA9CA13613L;
                n3 = (int)(l4 >>> 48);
                n2 = (int)(l4 << 16 >>> 32);
                n = (int)(l4 << 48 >>> 48);
                CallSite callSite2 = m44.a("l", (long)-892448822019648559L, (long)l);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)-607576904169827875L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)-1689918797103873689L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l3;
                    m44.a("m", (Object)this, (Object)objectArray2, (long)-1365897853814779998L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)-1689918797103873689L, (long)l);
                }
            }
            callSite = m44.a("r", (Object)this, (long)-607576904169827875L, (long)l);
        }
        return (boolean)m44.a("s", (Object)callSite, (char)((char)n3), (int)n2, (int)n, (Object)b12, (long)-1582711464751034604L, (long)l);
    }

    /*
     * Exception decompiling
     */
    private boolean K(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[TRYBLOCK]], but top level block is 18[SWITCH]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean U(Object[] objectArray) {
        Object object;
        block6: {
            block7: {
                lox lox2;
                CallSite callSite;
                long l;
                sz sz2;
                long l2;
                l62 l622;
                block10: {
                    loe loe2;
                    long l3;
                    block9: {
                        loe loe3;
                        block8: {
                            l622 = (l62)objectArray[0];
                            l2 = (Long)objectArray[1];
                            loe3 = (loe)objectArray[2];
                            loe loe4 = (loe)objectArray[3];
                            b1 b12 = (b1)objectArray[4];
                            sz2 = (sz)objectArray[5];
                            long l4 = l2 = a ^ l2;
                            l = l4 ^ 0x5A50F6B68EEDL;
                            l3 = l4 ^ 0x502BB0B6EEC2L;
                            callSite = m44.a("i", (long)-6678704480308575460L, (long)l2);
                            if (m44.a("w", (Object)this, (long)-6383225244616471783L, (long)l2) == false) break block8;
                            loe2 = loe3;
                            if (l2 <= 0L) break block9;
                            lox2 = loe2;
                            if (callSite == null) break block10;
                        }
                        loe2 = loe3;
                    }
                    lox2 = loe2.M(l3);
                }
                Object[] objectArray2 = new Object[4];
                objectArray2[3] = sz2;
                objectArray2[2] = lox2;
                objectArray2[1] = l;
                objectArray2[0] = l622;
                CallSite callSite2 = m44.a("h", (Object)this, (Object)objectArray2, (long)-6602785446070946584L, (long)l2);
                try {
                    try {
                        object = callSite2;
                        if (callSite != null) break block6;
                        if (object == -1) break block7;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-5169805946193047126L, (long)l2);
                    }
                    object = true;
                    break block6;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)-5169805946193047126L, (long)l2);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        ee.a = prr.a((long)-3122784976840223037L, (long)-5405287206381342106L, MethodHandles.lookup().lookupClass()).a(148949699085264L);
                        ee.g = new HashMap<K, V>(13);
                        var11 = ee.a ^ 36968183542341L;
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
                        var20_3 = new String[7];
                        var18_4 = 0;
                        var17_5 = "\u00f3\u009c9\u0017\u0000\u009de\u00f4\u009cgI,\u0014\u00ba[\u00b2\u00f7\u00dbk\u00be\u0019\u0084\u001d\u0011\u00ab\u00bb\u0005S\u0091\u009a\u00f0\u0011\u008d\u0093Z\u00d8*]\u00c6\u00c4\u00ad\u00e6C\u008e\u00cd\u00f2%\u009aX\u009d\u00b1 rj\u00c6\u0002\u0094p\u00bd\u00ef\u00d3\u0014ss\u00bf\u00c69T\u00ea\u00d0\u008c\u00b4F\u00ea=r\u00b9\b\bOZ<\u00ff\u00cc\u0096\u001dZ\u00ac\u008fX\u0015D\u00d7uNS9\u00c4\u00a9)\u0014`\u00d7\u008d&cvC\u0097Y\u00c3%\u008a\u00d5\u00be@\u0096\u00c3\u00fa\u00e3\u0086\u0080-~A\u0000B<\u0004b~\u00878\u009f\u00a3\u0004. !^\u00e9\u00ad\u0092~I\u0016\u0005\u008d\u00caPFO\u000f\u00cc\u00abF\u00a5\u00fc\u00eb\u00daE\u00cecj\u00956\u00b7i\u0019\n\u0010\u00b3\u00af\u00cd\u00fa\u00da;\u00e0\u00beoi|\u00f3\u00cfB\u00e6\f\u0010\u00f4l$\u00f5E\u0018oy$T\u00b4\u0090\u00fc\u00b2\u00c6\u00b3";
                        var19_6 = "\u00f3\u009c9\u0017\u0000\u009de\u00f4\u009cgI,\u0014\u00ba[\u00b2\u00f7\u00dbk\u00be\u0019\u0084\u001d\u0011\u00ab\u00bb\u0005S\u0091\u009a\u00f0\u0011\u008d\u0093Z\u00d8*]\u00c6\u00c4\u00ad\u00e6C\u008e\u00cd\u00f2%\u009aX\u009d\u00b1 rj\u00c6\u0002\u0094p\u00bd\u00ef\u00d3\u0014ss\u00bf\u00c69T\u00ea\u00d0\u008c\u00b4F\u00ea=r\u00b9\b\bOZ<\u00ff\u00cc\u0096\u001dZ\u00ac\u008fX\u0015D\u00d7uNS9\u00c4\u00a9)\u0014`\u00d7\u008d&cvC\u0097Y\u00c3%\u008a\u00d5\u00be@\u0096\u00c3\u00fa\u00e3\u0086\u0080-~A\u0000B<\u0004b~\u00878\u009f\u00a3\u0004. !^\u00e9\u00ad\u0092~I\u0016\u0005\u008d\u00caPFO\u000f\u00cc\u00abF\u00a5\u00fc\u00eb\u00daE\u00cecj\u00956\u00b7i\u0019\n\u0010\u00b3\u00af\u00cd\u00fa\u00da;\u00e0\u00beoi|\u00f3\u00cfB\u00e6\f\u0010\u00f4l$\u00f5E\u0018oy$T\u00b4\u0090\u00fc\u00b2\u00c6\u00b3".length();
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
                            var20_3[var18_4++] = ee.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "r8{\u001c\u00d4\u00fb\u0096\u00c1l\u00ffU,\u00e5\u009dJB-|\u00f0B\u0015\u00bc\u0017E\u008cP\u0085\u00d02\u008d\u00e9\u00fc\u00dc\u00c8c\u0014\u00ed\u00b8\u0080\u00ad\u0010\u00e1\u00b5\u00b5\u0004F\u0002\u0013N\u00de\u00c5\u0095\u0092\u0097\u00abz!";
                            var19_6 = "r8{\u001c\u00d4\u00fb\u0096\u00c1l\u00ffU,\u00e5\u009dJB-|\u00f0B\u0015\u00bc\u0017E\u008cP\u0085\u00d02\u008d\u00e9\u00fc\u00dc\u00c8c\u0014\u00ed\u00b8\u0080\u00ad\u0010\u00e1\u00b5\u00b5\u0004F\u0002\u0013N\u00de\u00c5\u0095\u0092\u0097\u00abz!".length();
                            var16_7 = 40;
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
                            var20_3[var18_4++] = ee.a(var21_9).intern();
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
                ee.e = var20_3;
                ee.f = new String[7];
                ee.j = new HashMap<K, V>(13);
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
                var6_12 = new long[8];
                var3_13 = 0;
                var4_14 = "\u0090\u00cc@\u00e9\u00ea\u00e7\u00c2?\u0003\u00da\u009cf\u007fYv\u00d0Y\u001aX\u00ed2\u00edM\u00aa\u0000\u00a1\u00f5\\\u0095\u00f2^ \u00cf\u00c7\u00f9\u00c8\u008d?(\u00feX\t\u00ecP\u00c1\u00c3\u00d4\u00ff";
                var5_15 = "\u0090\u00cc@\u00e9\u00ea\u00e7\u00c2?\u0003\u00da\u009cf\u007fYv\u00d0Y\u001aX\u00ed2\u00edM\u00aa\u0000\u00a1\u00f5\\\u0095\u00f2^ \u00cf\u00c7\u00f9\u00c8\u008d?(\u00feX\t\u00ecP\u00c1\u00c3\u00d4\u00ff".length();
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
                    var4_14 = "\u0001S\u00ad\u00f0\u00da\u008eUZ0a\u0014d\u00ea\u00ffc\u00e0";
                    var5_15 = "\u0001S\u00ad\u00f0\u00da\u008eUZ0a\u0014d\u00ea\u00ffc\u00e0".length();
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
        ee.h = var6_12;
        ee.i = new Integer[8];
        ee.Z = new fs(1);
        ee.R = new fs(2);
        ee.d = new fs(3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void c(Object[] var1_1) {
        block36: {
            block38: {
                block37: {
                    block32: {
                        block31: {
                            block30: {
                                var3_2 = (l62)var1_1[0];
                                var7_3 = (l62)var1_1[1];
                                var6_4 = (Boolean)var1_1[2];
                                var8_5 = (Set)var1_1[3];
                                var4_6 = (Long)var1_1[4];
                                var2_7 = (ol)var1_1[5];
                                v0 = var4_6 = ee.a ^ var4_6;
                                v1 = v0 ^ 100427379014360L;
                                var9_8 = (int)(v1 >>> 48);
                                var10_9 = (int)(v1 << 16 >>> 48);
                                var11_10 = (int)(v1 << 32 >>> 32);
                                var12_11 = v0 ^ 26653373363201L;
                                var14_12 = v0 ^ 41139836232204L;
                                var16_13 = v0 ^ 1326978461148L;
                                var18_14 = v0 ^ 16815964551061L;
                                var20_15 = v0 ^ 103553242444346L;
                                var22_16 = v0 ^ 103837605853405L;
                                var24_17 = m44.a("o", (long)6342772920469829706L, (long)var4_6);
                                try {
                                    try {
                                        try {
                                            v2 /* !! */  = var6_4;
                                            if (var24_17 != null) break block30;
                                            if (!v2 /* !! */ ) break block31;
                                        }
                                        catch (n9 v3) {
                                            throw m44.a("o", (Object)v3, (long)4834437270809471740L, (long)var4_6);
                                        }
                                        v4 = var7_3;
                                        if (var24_17 != null) break block32;
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("o", (Object)v5, (long)4834437270809471740L, (long)var4_6);
                                    }
                                    v6 = new Object[1];
                                    v6[0] = var14_12;
                                    v2 /* !! */  = m44.a("p", (Object)v4, (Object)v6, (long)6886651215602239383L, (long)var4_6);
                                }
                                catch (n9 v7) {
                                    throw m44.a("o", (Object)v7, (long)4834437270809471740L, (long)var4_6);
                                }
                            }
                            if (!v2 /* !! */ ) {
                                var6_4 = false;
                                var25_18 = new ArrayList<E>(5);
                                v8 = new Object[2];
                                v8[1] = var20_15;
                                v8[0] = var25_18;
                                m44.a("p", (Object)var7_3, (Object)v8, (long)6382236997415646517L, (long)var4_6);
                                var26_19 = 0;
                                while (var26_19 < var25_18.size()) {
                                    block33: {
                                        block34: {
                                            v4 = (l62)var25_18.get(var26_19);
                                            if (var24_17 != null) break block32;
                                            var27_22 = v4;
                                            try {
                                                block35: {
                                                    try {
                                                        try {
                                                            if (var4_6 <= 0L) break block33;
                                                            v9 = new Object[3];
                                                            v9[2] = var3_2;
                                                            v9[1] = var27_22;
                                                            v9[0] = var16_13;
                                                            v10 /* !! */  = m44.a("p", (Object)var2_7, (Object)v9, (long)5002325827451663430L, (long)var4_6);
                                                            if (var24_17 != null) break block34;
                                                            if (v10 /* !! */  == false) break block35;
                                                        }
                                                        catch (n9 v11) {
                                                            throw m44.a("o", (Object)v11, (long)4834437270809471740L, (long)var4_6);
                                                        }
                                                        if (var24_17 == null) break;
                                                    }
                                                    catch (n9 v12) {
                                                        throw m44.a("o", (Object)v12, (long)4834437270809471740L, (long)var4_6);
                                                    }
                                                }
                                                var2_7.h((short)var9_8, (char)var10_9, (Object)var27_22, var11_10, (Object)var3_2, (Object)"d");
                                                v10 /* !! */  = (CallSite)var8_5.add(var27_22);
                                            }
                                            catch (n9 v13) {
                                                throw m44.a("o", (Object)v13, (long)4834437270809471740L, (long)var4_6);
                                            }
                                        }
                                        ++var26_19;
                                    }
                                    if (var24_17 == null) continue;
                                }
                            }
                        }
                        v4 = var7_3;
                    }
                    v14 = new Object[1];
                    v14[0] = var12_11;
                    var25_18 = m44.a("p", (Object)v4, (Object)v14, (long)4838627993200857040L, (long)var4_6);
                    try {
                        try {
                            v15 = var25_18;
                            if (var24_17 != null) break block36;
                            if (v15 != null) {
                            }
                            ** GOTO lbl127
                        }
                        catch (n9 v16) {
                            throw m44.a("o", (Object)v16, (long)4834437270809471740L, (long)var4_6);
                        }
lbl103:
                        // 2 sources

                        while (var25_18.hasMoreElements()) {
                            break block37;
                        }
                        ** GOTO lbl127
                    }
                    catch (n9 v17) {
                        throw m44.a("o", (Object)v17, (long)4834437270809471740L, (long)var4_6);
                    }
                }
                do {
                    v18 = (l62)var25_18.nextElement();
                    if (var24_17 != null) break block38;
                    var26_20 = v18;
                    var2_7.h((short)var9_8, (char)var10_9, (Object)var26_20, var11_10, (Object)var3_2, (Object)"i");
                    v19 = new Object[6];
                    v19[5] = var2_7;
                    v19[4] = var22_16;
                    v19[3] = var8_5;
                    v19[2] = var6_4;
                    v19[1] = var26_20;
                    v19[0] = var3_2;
                    m44.a("n", (Object)this, (Object)v19, (long)4642909353172795573L, (long)var4_6);
                    var8_5.add(var26_20);
                    if (var24_17 == null) ** GOTO lbl103
lbl127:
                    // 3 sources

                } while (var4_6 <= 0L);
                v18 = var7_3;
            }
            v20 = new Object[1];
            v20[0] = var18_14;
            v15 = m44.a("p", (Object)v18, (Object)v20, (long)5096282332769507171L, (long)var4_6);
        }
        var26_21 = v15;
        try {
            v21 = var26_21;
            if (var24_17 != null) ** GOTO lbl146
            if (v21 != null) {
            }
            ** GOTO lbl176
        }
        catch (n9 v22) {
            throw m44.a("o", (Object)v22, (long)4834437270809471740L, (long)var4_6);
        }
        block25: while (true) {
            v21 = var26_21;
lbl146:
            // 2 sources

            if (!v21.hasMoreElements()) ** GOTO lbl176
            do {
                block39: {
                    var27_22 = (l62)var26_21.nextElement();
                    try {
                        try {
                            var2_7.h((short)var9_8, (char)var10_9, (Object)var27_22, var11_10, (Object)var3_2, (Object)"i");
                            v23 = new Object[6];
                            v23[5] = var2_7;
                            v23[4] = var22_16;
                            v23[3] = var8_5;
                            v23[2] = var6_4;
                            v23[1] = var27_22;
                            v23[0] = var3_2;
                            m44.a("n", (Object)this, (Object)v23, (long)4642909353172795573L, (long)var4_6);
                            v24 = new Object[1];
                            v24[0] = var14_12;
                            v25 /* !! */  = m44.a("p", (Object)var27_22, (Object)v24, (long)6886651215602239383L, (long)var4_6);
                            if (var24_17 != null || v25 /* !! */  != false) break block39;
                        }
                        catch (n9 v26) {
                            throw m44.a("o", (Object)v26, (long)4834437270809471740L, (long)var4_6);
                        }
                        v25 /* !! */  = (CallSite)var8_5.add(var27_22);
                    }
                    catch (n9 v27) {
                        throw m44.a("o", (Object)v27, (long)4834437270809471740L, (long)var4_6);
                    }
                }
                if (var24_17 == null) continue block25;
lbl176:
                // 3 sources

            } while (var4_6 <= 0L);
            break;
        }
    }

    public final _v h(Object[] objectArray) {
        block3: {
            b1 b12;
            long l;
            block2: {
                long l2 = (Long)objectArray[0];
                b1 b13 = (b1)objectArray[1];
                l = (l2 = a ^ l2) ^ 0x76A98245D7F0L;
                b1 b14 = (b1)this.x.get(b13);
                CallSite callSite = m44.a("k", (long)113230511332483550L, (long)l2);
                try {
                    b12 = b14;
                    if (callSite != null) break block2;
                    if (b12 == null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)((Object)n92), (long)1910396798550586216L, (long)l2);
                }
                b12 = b14;
            }
            return b12.G(l);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void h(Object[] objectArray) {
        Object object;
        Object object2;
        Object object3;
        long l = (Long)objectArray[0];
        Set set = (Set)objectArray[1];
        Set set2 = (Set)objectArray[2];
        loc loc2 = (loc)objectArray[3];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x5AA5A35DF03DL;
        int n = (int)(l3 >>> 48);
        int n2 = (int)(l3 << 16 >>> 48);
        int n3 = (int)(l3 << 32 >>> 32);
        long l4 = l2 ^ 0x2EFBB9C0B2FEL;
        Object object4 = set.iterator();
        CallSite callSite = m44.a("j", (long)-3250737263103987025L, (long)l);
        block2: while (object4.hasNext()) {
            object3 = object4.next();
            do {
                object2 = (l62)object3;
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = loc2;
                objectArray2[1] = object2;
                objectArray2[0] = l4;
                object = m44.a("u", (Object)m44.a("t", (Object)this, (long)-3757211690186038304L, (long)l), (Object)objectArray2, (long)-3238569664809266342L, (long)l);
                if (callSite == null) continue block2;
                object3 = new ArrayList(set2);
            } while (l < 0L);
        }
        object4 = object3;
        Collections.reverse(object4);
        object2 = object4.iterator();
        block4: while (object2.hasNext()) {
            object = (ei)object2.next();
            fs fs2 = (fs)m44.a("t", (Object)this, (long)-3757211690186038304L, (long)l).h((short)n, (char)n2, m44.a("t", (Object)object, (long)-3789760902245481430L, (long)l), n3, loc2, m44.a("t", (Object)object, (long)-3214692951984724077L, (long)l));
            try {
                do {
                    CallSite callSite2 = callSite;
                    if (l >= 0L) {
                        if (callSite2 != null) return;
                        callSite2 = callSite;
                    }
                    if (callSite2 == null) continue block4;
                } while (l < 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("j", (Object)((Object)n92), (long)-3894946384601915367L, (long)l);
            }
        }
        set.clear();
        object4.clear();
    }

    public final boolean k(Object[] objectArray) {
        l62 l622 = (l62)objectArray[0];
        long l = (Long)objectArray[1];
        loc loc2 = (loc)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x11A4F8B831CFL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = loc2;
        objectArray2[1] = l622;
        objectArray2[0] = l2;
        return (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)2102515533335622934L, (long)l), (Object)objectArray2, (long)1835432653661726805L, (long)l);
    }

    public final void t(Object[] objectArray) {
        sz sz2 = (sz)objectArray[0];
        long l = (Long)objectArray[1];
        String string = (String)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x2385039AB28AL;
        sz sz3 = (sz)m44.a("v", (Object)this, (long)-1204414394920229211L, (long)l).get(sz2);
        sz3.Z(l2, (Object)string);
    }

    private Map p(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ a;
        return m44.a("r", (Object)this, (long)-2979992874442377546L, (long)l).T(string);
    }

    public final u5 F(Object[] objectArray) {
        sz sz2 = (sz)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (u5)((sz)m44.a("v", (Object)this, (long)6571139885427069661L, (long)l).get(sz2)).t();
    }

    public final Map S(Object[] objectArray) {
        CallSite callSite;
        block5: {
            CallSite callSite2;
            block6: {
                CallSite callSite3;
                String string = (String)objectArray[0];
                sz sz2 = (sz)objectArray[1];
                lqu lqu2 = (lqu)objectArray[2];
                Random random = (Random)objectArray[3];
                long l = (Long)objectArray[4];
                String string2 = (String)objectArray[5];
                long l2 = l = a ^ l;
                long l3 = l2 ^ 0x1F12ACA6DE60L;
                long l4 = l2 ^ 0x1EB448DDCA74L;
                int n = (int)(l4 >>> 32);
                int n2 = (int)(l4 << 32 >>> 32);
                long l5 = l2 ^ 0x903DFB2141CL;
                long l6 = l2 ^ 0x36E713A5850EL;
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = n2;
                objectArray2[1] = n;
                objectArray2[0] = string;
                callSite2 = m44.a("l", (Object)this, (Object)objectArray2, (long)8882417074553569735L, (long)l);
                CallSite callSite4 = m44.a("m", (long)7290231926253684064L, (long)l);
                try {
                    callSite = callSite2;
                    if (callSite4 != null) break block5;
                    if (callSite != null) break block6;
                }
                catch (u3 u32) {
                    throw m44.a("m", (Object)((Object)u32), (long)9096508217063888854L, (long)l);
                }
                try {
                    Object[] objectArray3 = new Object[3];
                    objectArray3[2] = l6;
                    objectArray3[1] = string2;
                    objectArray3[0] = string;
                    callSite3 = m44.a("r", (Object)m44.a("s", (Object)this, (long)8928675605911552154L, (long)l), (Object)objectArray3, (long)9140431283528323614L, (long)l);
                }
                catch (u3 u33) {
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l5;
                    throw new aa((String)((Object)ee.a("o", (int)22583, (long)(0x4A56CFAB7C8424ACL ^ l))) + cf.a((String)((Object)m44.a("r", (Object)((Object)u33), (Object)objectArray4, (long)7466884150687654084L, (long)l))) + (String)((Object)ee.a("o", (int)2184, (long)(0x74B3E2FCE2DD7415L ^ l))) + string2 + (String)((Object)ee.a("o", (int)13890, (long)(0x64ECBC3ABAA44ADEL ^ l))));
                }
                catch (u2 u22) {
                    throw new aa((String)((Object)m44.a("r", (Object)((Object)u22), (long)7152701693182270884L, (long)l)));
                }
                Object[] objectArray5 = new Object[5];
                objectArray5[4] = random;
                objectArray5[3] = l3;
                objectArray5[2] = lqu2;
                objectArray5[1] = sz2;
                objectArray5[0] = this;
                callSite2 = m44.a("r", (Object)callSite3, (Object)objectArray5, (long)8657386197033815838L, (long)l);
            }
            callSite = callSite2;
        }
        return callSite;
    }

    /*
     * Exception decompiling
     */
    final boolean g(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [18[WHILELOOP], 19[DOLOOP]], but top level block is 8[TRYBLOCK]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void v(Object[] objectArray) {
        block4: {
            Set set;
            CallSite callSite;
            Set set2;
            block3: {
                long l = (Long)objectArray[0];
                l62 l622 = (l62)objectArray[1];
                set2 = (Set)objectArray[2];
                long l2 = (l = a ^ l) ^ 0x1F0B3075861L;
                Set set3 = m44.a("u", (Object)this, (long)-8437669991998386700L, (long)l).J(l2, l622);
                callSite = m44.a("k", (long)-7853662371803237554L, (long)l);
                try {
                    set = set3;
                    if (callSite != null) break block3;
                    if (set == null) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)((Object)n92), (long)-8641423733572820488L, (long)l);
                }
                set = set3;
            }
            for (l62 l623 : set) {
                set2.add(l623);
                if (callSite == null) continue;
            }
        }
    }

    public ee(sh sh2, s0 s02, _6 _62, lqu lqu2, int n, long l, boolean bl, boolean bl2, boolean bl3) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x1F8F3C5914A1L;
        long l4 = l2 ^ 0x4EEDAB71A3A3L;
        long l5 = l2 ^ 0x1EF79462425BL;
        long l6 = l2 ^ 0x129FA7D9D806L;
        int n2 = (int)(l6 >>> 32);
        int n3 = (int)(l6 << 32 >>> 48);
        int n4 = (int)(l6 << 48 >>> 48);
        long l7 = l2 ^ 0x795B8E4DBC30L;
        int n5 = (int)(l7 >>> 32);
        int n6 = (int)(l7 << 32 >>> 48);
        int n7 = (int)(l7 << 48 >>> 48);
        long l8 = l2 ^ 0x7CD37A50CBBEL;
        this.N = new df(l4);
        m44.a("r", (Object)this, (ol)new ol(n5, (short)n6, (short)n7), (long)-4909401731153645955L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l5;
        m44.a("r", (Object)this, (Map)((Object)m44.a("n", (Object)objectArray, (long)-6467280028230958371L, (long)l)), (long)-6397564316048691493L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        m44.a("r", (Object)this, (Set)((Object)m44.a("n", (Object)objectArray2, (long)-5150477065597370106L, (long)l)), (long)-5118745289991422032L, (long)l);
        m44.a("r", (Object)this, (df)new df(l4), (long)-4903792029786456863L, (long)l);
        this.w = _62;
        this.P = bl;
        this.u = bl3;
        m44.a("r", (Object)this, (ol)new ol(n, (int)ee.b("a", (int)23063, (long)(0x9C47039D00C9607L ^ l)), n2, (char)n3, (short)n4), (long)-4958472921694448876L, (long)l);
        m44.a("r", (Object)this, (ol)new ol(n, (int)ee.b("a", (int)15354, (long)(0x5D2CF79BF0FEF7EEL ^ l)), n2, (char)n3, (short)n4), (long)-6685909651056049372L, (long)l);
        m44.a("r", (Object)this, (ol)new ol(n, (int)ee.b("a", (int)10680, (long)(0x7FFBE2D09DFB65A9L ^ l)), n2, (char)n3, (short)n4), (long)-6382590984998686555L, (long)l);
        m44.a("r", (Object)this, (ol)new ol((int)ee.b("a", (int)7708, (long)(0x572338A5C183520EL ^ l)), (int)ee.b("a", (int)14815, (long)(0x6B78D7BA650D75C8L ^ l)), n2, (char)n3, (short)n4), (long)-6849771922535870864L, (long)l);
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = bl2;
        objectArray3[3] = l8;
        objectArray3[2] = lqu2;
        objectArray3[1] = s02;
        objectArray3[0] = sh2;
        m44.a("o", (Object)this, (Object)objectArray3, (long)-4666259099093957746L, (long)l);
    }

    private Map D(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-1146355480557934626L, (long)l).T(string);
    }

    private boolean h(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        loe loe2 = (loe)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x5F447BAB48E1L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = loe2;
        objectArray2[1] = string;
        objectArray2[0] = l2;
        return (boolean)m44.a("u", (Object)m44.a("t", (Object)this, (long)8665031419697704841L, (long)l), (Object)objectArray2, (long)6941888323920826747L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int Z(Object[] var1_1) {
        block30: {
            block31: {
                block28: {
                    block29: {
                        block26: {
                            block27: {
                                block24: {
                                    block25: {
                                        block22: {
                                            block23: {
                                                var2_2 = (l62)var1_1[0];
                                                var3_3 = (Long)var1_1[1];
                                                var6_4 = (loc)var1_1[2];
                                                var5_5 = (sz)var1_1[3];
                                                v0 = var3_3 = ee.a ^ var3_3;
                                                v1 = v0 ^ 44540884776894L;
                                                var7_6 = (int)(v1 >>> 48);
                                                var8_7 = (int)(v1 << 16 >>> 48);
                                                var9_8 = (int)(v1 << 32 >>> 32);
                                                v2 = v0 ^ 47560228966667L;
                                                var10_9 = (int)(v2 >>> 48);
                                                var11_10 = v2 << 16 >>> 16;
                                                var13_11 = v0 ^ 91261000617347L;
                                                var15_12 = m44.a("i", (long)6152055120336991532L, (long)var3_3);
                                                try {
                                                    try {
                                                        v3 /* !! */  = var2_2;
                                                        if (var15_12 != null) break block22;
                                                        if (!v3 /* !! */ .c((short)var10_9, var11_10)) break block23;
                                                    }
                                                    catch (n9 v4) {
                                                        throw m44.a("i", (Object)v4, (long)5652348217423882138L, (long)var3_3);
                                                    }
                                                    return 2;
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("i", (Object)v5, (long)5652348217423882138L, (long)var3_3);
                                                }
                                            }
                                            v3 /* !! */  = m44.a("w", (Object)this, (long)5501360215934936163L, (long)var3_3).h((short)var7_6, (char)var8_7, var2_2, var9_8, var6_4, m44.a("m", (long)5867710854345398967L, (long)var3_3));
                                        }
                                        var16_13 = (fs)v3 /* !! */ ;
                                        try {
                                            try {
                                                v6 /* !! */  = var16_13;
                                                if (var3_3 < 0L || var15_12 != null) break block24;
                                                if (v6 /* !! */  != null) break block25;
                                            }
                                            catch (n9 v7) {
                                                throw m44.a("i", (Object)v7, (long)5652348217423882138L, (long)var3_3);
                                            }
                                            return 0;
                                        }
                                        catch (n9 v8) {
                                            throw m44.a("i", (Object)v8, (long)5652348217423882138L, (long)var3_3);
                                        }
                                    }
                                    v6 /* !! */  = var16_13;
                                }
                                try {
                                    try {
                                        v9 = m44.a("m", (long)5867710854345398967L, (long)var3_3);
                                        v10 = var15_12;
                                        if (var3_3 >= 0L) {
                                            if (v10 != null) break block26;
                                            if (v6 /* !! */  != v9) break block27;
                                        }
                                        ** GOTO lbl70
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("i", (Object)v11, (long)5652348217423882138L, (long)var3_3);
                                    }
                                    return 1;
                                }
                                catch (n9 v12) {
                                    throw m44.a("i", (Object)v12, (long)5652348217423882138L, (long)var3_3);
                                }
                            }
                            v6 /* !! */  = var16_13;
                            v9 = m44.a("m", (long)6080230419148324007L, (long)var3_3);
                        }
                        try {
                            try {
                                if (var3_3 <= 0L) break block28;
                                v10 = var15_12;
lbl70:
                                // 2 sources

                                if (v10 != null) break block28;
                                if (v6 /* !! */  != v9) break block29;
                            }
                            catch (n9 v13) {
                                throw m44.a("i", (Object)v13, (long)5652348217423882138L, (long)var3_3);
                            }
                            m44.a("w", (Object)this, (long)5501360215934936163L, (long)var3_3).h((short)var7_6, (char)var8_7, var2_2, var9_8, var6_4, var16_13);
                            return 1;
                        }
                        catch (n9 v14) {
                            throw m44.a("i", (Object)v14, (long)5652348217423882138L, (long)var3_3);
                        }
                    }
                    try {
                        if (var3_3 < 0L) break block30;
                        v6 /* !! */  = var16_13;
                        if (var15_12 != null) break block31;
                        v9 = m44.a("m", (long)6276041088872222820L, (long)var3_3);
                    }
                    catch (n9 v15) {
                        throw m44.a("i", (Object)v15, (long)5652348217423882138L, (long)var3_3);
                    }
                }
                try {
                    if (v6 /* !! */  == v9) {
                        m44.a("w", (Object)this, (long)5501360215934936163L, (long)var3_3).h((short)var7_6, (char)var8_7, var2_2, var9_8, var6_4, m44.a("m", (long)6276041088872222820L, (long)var3_3));
                        return 1;
                    }
                }
                catch (n9 v16) {
                    throw m44.a("i", (Object)v16, (long)5652348217423882138L, (long)var3_3);
                }
                v6 /* !! */  = m44.a("w", (Object)this, (long)5501360215934936163L, (long)var3_3).h((short)var7_6, (char)var8_7, var2_2, var9_8, var6_4, var16_13);
            }
            var5_5.Z(var13_11, (Object)m44.a("w", (Object)var16_13, (long)5931062197747318112L, (long)var3_3));
        }
        return -1;
    }

    final boolean E(Object[] objectArray) {
        sz sz2 = (sz)objectArray[0];
        loe loe2 = (loe)objectArray[1];
        long l = (Long)objectArray[2];
        loe loe3 = (loe)objectArray[3];
        sz sz3 = (sz)objectArray[4];
        long l2 = (l = a ^ l) ^ 0x9077178DD91L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = null;
        objectArray2[4] = sz3;
        objectArray2[3] = loe3;
        objectArray2[2] = loe2;
        objectArray2[1] = l2;
        objectArray2[0] = sz2;
        return (boolean)m44.a("w", (Object)this, (Object)objectArray2, (long)-593042456001854679L, (long)l);
    }

    public final boolean J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l62 l622 = (l62)objectArray[1];
        loe loe2 = (loe)objectArray[2];
        loe loe3 = (loe)objectArray[3];
        sz sz2 = (sz)objectArray[4];
        long l2 = (l = a ^ l) ^ 0x285CB4C6FDA5L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = sz2;
        objectArray2[4] = false;
        objectArray2[3] = loe3;
        objectArray2[2] = loe2;
        objectArray2[1] = l622;
        objectArray2[0] = l2;
        return (boolean)m44.a("r", (Object)this, (Object)objectArray2, (long)-8147526634877887685L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int J(Object[] var1_1) {
        block40: {
            block38: {
                block39: {
                    block37: {
                        block35: {
                            block36: {
                                block32: {
                                    block33: {
                                        block30: {
                                            block31: {
                                                var2_2 = (l62)var1_1[0];
                                                var3_3 = (loc)var1_1[1];
                                                var8_4 = (loc)var1_1[2];
                                                var5_5 = (Long)var1_1[3];
                                                var4_6 = (Set)var1_1[4];
                                                var7_7 = (sz)var1_1[5];
                                                v0 = var5_5 = ee.a ^ var5_5;
                                                v1 = v0 ^ 21003227565582L;
                                                var9_8 = (int)(v1 >>> 48);
                                                var10_9 = (int)(v1 << 16 >>> 48);
                                                var11_10 = (int)(v1 << 32 >>> 32);
                                                v2 = v0 ^ 18525015763131L;
                                                var12_11 = (int)(v2 >>> 48);
                                                var13_12 = v2 << 16 >>> 16;
                                                var15_13 = v0 ^ 115002345288755L;
                                                var17_14 = m44.a("i", (long)3229157972663422108L, (long)var5_5);
                                                try {
                                                    try {
                                                        v3 /* !! */  = var2_2;
                                                        if (var17_14 != null) break block30;
                                                        if (!v3 /* !! */ .c((short)var12_11, var13_12)) break block31;
                                                    }
                                                    catch (n9 v4) {
                                                        throw m44.a("i", (Object)v4, (long)4017518017170284074L, (long)var5_5);
                                                    }
                                                    return 2;
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("i", (Object)v5, (long)4017518017170284074L, (long)var5_5);
                                                }
                                            }
                                            v3 /* !! */  = m44.a("w", (Object)this, (long)3884629970008595923L, (long)var5_5).h((short)var9_8, (char)var10_9, var2_2, var11_10, var3_3, m44.a("m", (long)3362149903563909588L, (long)var5_5));
                                        }
                                        var18_15 = (fs)v3 /* !! */ ;
                                        try {
                                            try {
                                                v6 /* !! */  = var18_15;
                                                v7 = var17_14;
                                                if (var5_5 >= 0L) {
                                                    if (v7 != null) break block32;
                                                    if (v6 /* !! */  != null) break block33;
                                                }
                                                ** GOTO lbl58
                                            }
                                            catch (n9 v8) {
                                                throw m44.a("i", (Object)v8, (long)4017518017170284074L, (long)var5_5);
                                            }
                                            return 0;
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("i", (Object)v9, (long)4017518017170284074L, (long)var5_5);
                                        }
                                    }
                                    v6 /* !! */  = var18_15;
                                }
                                try {
                                    block34: {
                                        try {
                                            try {
                                                try {
                                                    v7 = var17_14;
lbl58:
                                                    // 2 sources

                                                    if (v7 != null) ** GOTO lbl78
                                                    if (v6 /* !! */  == m44.a("m", (long)2944914861533979399L, (long)var5_5)) break block34;
                                                }
                                                catch (n9 v10) {
                                                    throw m44.a("i", (Object)v10, (long)4017518017170284074L, (long)var5_5);
                                                }
                                                v11 = var18_15;
                                                v12 = m44.a("m", (long)3301537384497825047L, (long)var5_5);
                                                if (var5_5 <= 0L || var17_14 != null) break block35;
                                            }
                                            catch (n9 v13) {
                                                throw m44.a("i", (Object)v13, (long)4017518017170284074L, (long)var5_5);
                                            }
                                            if (v11 != v12) break block36;
                                        }
                                        catch (n9 v14) {
                                            throw m44.a("i", (Object)v14, (long)4017518017170284074L, (long)var5_5);
                                        }
                                    }
                                    v6 /* !! */  = m44.a("w", (Object)this, (long)3884629970008595923L, (long)var5_5).h((short)var9_8, (char)var10_9, var2_2, var11_10, var3_3, var18_15);
                                }
                                catch (n9 v15) {
                                    throw m44.a("i", (Object)v15, (long)4017518017170284074L, (long)var5_5);
                                }
lbl78:
                                // 2 sources

                                var7_7.Z(var15_13, (Object)m44.a("w", (Object)var18_15, (long)3170365076063356112L, (long)var5_5));
                                return -1;
                            }
                            try {
                                v11 = var18_15;
                                if (var5_5 < 0L || var17_14 != null) break block37;
                                v12 = m44.a("m", (long)3362149903563909588L, (long)var5_5);
                            }
                            catch (n9 v16) {
                                throw m44.a("i", (Object)v16, (long)4017518017170284074L, (long)var5_5);
                            }
                        }
                        try {
                            if (v11 == v12) {
                                m44.a("w", (Object)this, (long)3884629970008595923L, (long)var5_5).h((short)var9_8, (char)var10_9, var2_2, var11_10, var3_3, var18_15);
                                var7_7.Z(var15_13, (Object)m44.a("w", (Object)var18_15, (long)3170365076063356112L, (long)var5_5));
                                return -1;
                            }
                        }
                        catch (n9 v17) {
                            throw m44.a("i", (Object)v17, (long)4017518017170284074L, (long)var5_5);
                        }
                        v11 = var18_15;
                    }
                    try {
                        try {
                            try {
                                try {
                                    v18 = m44.a("w", (Object)v11, (long)3170365076063356112L, (long)var5_5);
                                    if (var17_14 != null) break block38;
                                    if (v18 == null) break block39;
                                }
                                catch (n9 v19) {
                                    throw m44.a("i", (Object)v19, (long)4017518017170284074L, (long)var5_5);
                                }
                                v20 = m44.a("w", (Object)var18_15, (long)3170365076063356112L, (long)var5_5).equals(var8_4);
                                if (var17_14 != null) break block40;
                            }
                            catch (n9 v21) {
                                throw m44.a("i", (Object)v21, (long)4017518017170284074L, (long)var5_5);
                            }
                            if (v20 == 0) break block39;
                        }
                        catch (n9 v22) {
                            throw m44.a("i", (Object)v22, (long)4017518017170284074L, (long)var5_5);
                        }
                        m44.a("w", (Object)this, (long)3884629970008595923L, (long)var5_5).h((short)var9_8, (char)var10_9, var2_2, var11_10, var3_3, var18_15);
                        return 1;
                    }
                    catch (n9 v23) {
                        throw m44.a("i", (Object)v23, (long)4017518017170284074L, (long)var5_5);
                    }
                }
                v18 = m44.a("w", (Object)this, (long)3884629970008595923L, (long)var5_5).h((short)var9_8, (char)var10_9, var2_2, var11_10, var3_3, var18_15);
            }
            var7_7.Z(var15_13, (Object)m44.a("w", (Object)var18_15, (long)3170365076063356112L, (long)var5_5));
            v20 = -1;
        }
        return v20;
    }

    public final _v P(Object[] objectArray) {
        String string = (String)objectArray[0];
        loe loe2 = (loe)objectArray[1];
        _v _v2 = (_v)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x46F84B4CE283L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 48);
        int n3 = (int)(l2 << 32 >>> 32);
        return (_v)m44.a("r", (Object)this, (long)-4504522956505505426L, (long)l).h((short)n, (char)n2, string, n3, loe2, _v2);
    }

    private int K(Object[] objectArray) {
        int n;
        block20: {
            fs fs2;
            long l;
            long l2;
            sz sz2;
            block18: {
                Object object;
                int n2;
                int n3;
                int n4;
                loc loc2;
                l62 l622;
                block19: {
                    fs fs3;
                    CallSite callSite;
                    loc loc3;
                    block16: {
                        block17: {
                            block15: {
                                int n5;
                                block14: {
                                    l622 = (l62)objectArray[0];
                                    loc2 = (loc)objectArray[1];
                                    loc3 = (loc)objectArray[2];
                                    sz2 = (sz)objectArray[3];
                                    l2 = (Long)objectArray[4];
                                    long l4 = l2 = a ^ l2;
                                    l4 = l4 ^ 0x6EEF4F2F80D0L;
                                    n4 = (int)(l4 >>> 48);
                                    n3 = (int)(l4 << 16 >>> 48);
                                    n2 = (int)(l4 << 32 >>> 32);
                                    long l5 = l3 ^ 0x6D2C4E3F6665L;
                                    int n6 = (int)(l5 >>> 48);
                                    long l6 = l5 << 16 >>> 16;
                                    l = l3 ^ 0x156D6F34FAEDL;
                                    callSite = m44.a("o", (long)-6769407338328767934L, (long)l2);
                                    try {
                                        n5 = l622.c((short)n6, l6);
                                        if (callSite != null) break block14;
                                        if (n5 == 0) break block15;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("o", (Object)((Object)n92), (long)-5107246162580205324L, (long)l2);
                                    }
                                    n5 = 2;
                                }
                                return n5;
                            }
                            fs fs4 = new fs(loc3);
                            fs2 = (fs)m44.a("q", (Object)this, (long)-4956625264899108083L, (long)l2).h((short)n4, (char)n3, l622, n2, loc2, fs4);
                            try {
                                try {
                                    fs3 = fs2;
                                    if (l2 <= 0L || callSite != null) break block16;
                                    if (fs3 != null) break block17;
                                }
                                catch (n9 n93) {
                                    throw m44.a("o", (Object)((Object)n93), (long)-5107246162580205324L, (long)l2);
                                }
                                return 0;
                            }
                            catch (n9 n94) {
                                throw m44.a("o", (Object)((Object)n94), (long)-5107246162580205324L, (long)l2);
                            }
                        }
                        fs3 = fs2;
                    }
                    try {
                        try {
                            try {
                                try {
                                    object = m44.a("q", (Object)fs3, (long)-6547921836442973682L, (long)l2);
                                    if (callSite != null) break block18;
                                    if (object == null) break block19;
                                }
                                catch (n9 n95) {
                                    throw m44.a("o", (Object)((Object)n95), (long)-5107246162580205324L, (long)l2);
                                }
                                n = m44.a("q", (Object)fs2, (long)-6547921836442973682L, (long)l2).equals(loc3);
                                if (callSite != null) break block20;
                            }
                            catch (n9 n96) {
                                throw m44.a("o", (Object)((Object)n96), (long)-5107246162580205324L, (long)l2);
                            }
                            if (n == 0) break block19;
                        }
                        catch (n9 n97) {
                            throw m44.a("o", (Object)((Object)n97), (long)-5107246162580205324L, (long)l2);
                        }
                        return 1;
                    }
                    catch (n9 n98) {
                        throw m44.a("o", (Object)((Object)n98), (long)-5107246162580205324L, (long)l2);
                    }
                }
                object = m44.a("q", (Object)this, (long)-4956625264899108083L, (long)l2).h((short)n4, (char)n3, l622, n2, loc2, fs2);
            }
            sz2.Z(l, (Object)m44.a("q", (Object)fs2, (long)-6547921836442973682L, (long)l2));
            n = -1;
        }
        return n;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x12BA;
        if (f[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ee", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            ee.f[n2] = ee.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ee.a(n, l);
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
            throw new RuntimeException("com/zelix/ee" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x650A;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ee", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ee.i[n2] = n3;
        }
        return i[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ee.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ee" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ee.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ee.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
