/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._83;
import com.zelix._8e;
import com.zelix._8l;
import com.zelix._h;
import com.zelix._s8;
import com.zelix._sz;
import com.zelix._ug;
import com.zelix._xx;
import com.zelix._y4;
import com.zelix._yv;
import com.zelix._zk;
import com.zelix.bq;
import com.zelix.ei;
import com.zelix.ess;
import com.zelix.gj;
import com.zelix.hu;
import com.zelix.hy;
import com.zelix.iu;
import com.zelix.lh;
import com.zelix.m8;
import com.zelix.mc;
import com.zelix.md;
import com.zelix.mf;
import com.zelix.mg;
import com.zelix.mn;
import com.zelix.mo;
import com.zelix.mq;
import com.zelix.mr;
import com.zelix.ms;
import com.zelix.mx;
import com.zelix.my;
import com.zelix.mz;
import com.zelix.sh;
import com.zelix.w;
import com.zelix.we;
import com.zelix.x2;
import com.zelix.x4;
import com.zelix.x44;
import com.zelix.x7;
import com.zelix.x_;
import com.zelix.xb;
import com.zelix.xe;
import com.zelix.xh;
import com.zelix.xl;
import com.zelix.xv;
import com.zelix.yn;
import java.io.PrintWriter;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class _8c
extends _83 {
    private ArrayList S;
    private ArrayList O;
    private ArrayList N;
    static final char[] w;
    private ArrayList p;
    private int C;
    static final String m;
    private static final Map F;
    private ArrayList x;
    private static final Map A;
    private List W;
    private List K;
    private static final long f;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;
    private static final long[] k;
    private static final Integer[] l;
    private static final Map n;

    public mf K(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        List list = (List)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = f ^ l) ^ 0x51EC9910422DL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = true;
        objectArray2[1] = list;
        objectArray2[0] = n;
        return x44.a("k", (Object)this, (Object)objectArray2, (long)1910492466911014267L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public _8c(_xx var1_1, PrintWriter var2_2, hy var3_3, _y4 var4_4, _y4 var5_5, _y4 var6_6, _y4 var7_7, _y4 var8_8, long var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 21[SWITCH]
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
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        HashMap hashMap = (HashMap)objectArray[1];
        long l2 = l ^ 0x1FC14B7A0C05L;
        Iterator iterator = x44.a("o", (Object)this, (long)2045648266930629988L, (long)l).iterator();
        CallSite callSite = x44.a("s", (long)1967458088919400108L, (long)l);
        while (iterator.hasNext()) {
            mq mq2 = (mq)iterator.next();
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l2;
            objectArray2[0] = hashMap;
            x44.a("k", (Object)mq2, (Object)objectArray2, (long)1859376080449046730L, (long)l);
            if (callSite == null) continue;
        }
    }

    public mr O(Object[] objectArray) {
        String string;
        _8c _8c2;
        long l;
        long l2;
        int n;
        int n2;
        int n3;
        boolean bl;
        _ug _ug2;
        _yv _yv2;
        List list;
        long l3;
        String string2;
        String string3;
        block13: {
            String string4;
            block12: {
                Object object;
                Object object2;
                block10: {
                    CallSite callSite;
                    long l4;
                    block11: {
                        string4 = (String)objectArray[0];
                        string3 = (String)objectArray[1];
                        string2 = (String)objectArray[2];
                        l3 = (Long)objectArray[3];
                        list = (List)objectArray[4];
                        _yv2 = (_yv)objectArray[5];
                        _ug2 = (_ug)objectArray[6];
                        bl = (Boolean)objectArray[7];
                        long l5 = l3 = f ^ l3;
                        long l6 = l5 ^ 0x375590C64566L;
                        n3 = (int)(l6 >>> 32);
                        n2 = (int)(l6 << 32 >>> 40);
                        n = (int)(l6 << 56 >>> 56);
                        long l7 = l5 ^ 0x5EF5DE24F8A7L;
                        l2 = l5 ^ 0x6E72EF6CB8B5L;
                        l4 = l5 ^ 0x575134EA8E3DL;
                        l = l5 ^ 0x6BE8AAC37175L;
                        Object[] objectArray2 = new Object[4];
                        objectArray2[3] = l7;
                        objectArray2[2] = string2;
                        objectArray2[1] = string3;
                        objectArray2[0] = string4;
                        object2 = x44.a("k", (Object)this, (Object)objectArray2, (long)189320164331770677L, (long)l3);
                        callSite = x44.a("s", (long)75990922345473260L, (long)l3);
                        try {
                            try {
                                object = object2;
                                if (callSite != null) break block10;
                                if (object == null) break block11;
                            }
                            catch (gj gj2) {
                                throw x44.a("s", (Object)gj2, (long)2087597777679385863L, (long)l3);
                            }
                            return object2;
                        }
                        catch (gj gj3) {
                            throw x44.a("s", (Object)gj3, (long)2087597777679385863L, (long)l3);
                        }
                    }
                    _8c2 = this;
                    string = string4;
                    if (callSite != null) break block13;
                    object = object2 = (mr)_8c2.R(string, string3, string2, list, l4);
                }
                try {
                    if (l3 > 0L) {
                        if (object == null) break block12;
                        object = object2;
                    }
                    return object;
                }
                catch (gj gj4) {
                    throw x44.a("s", (Object)gj4, (long)2087597777679385863L, (long)l3);
                }
            }
            _8c2 = this;
            string = string4;
        }
        List list2 = list;
        String string5 = string;
        x7 x72 = _8c2.a(n3, n2, string5, list2, (byte)n);
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = l2;
        objectArray3[2] = list;
        objectArray3[1] = string2;
        objectArray3[0] = string3;
        CallSite callSite = x44.a("k", (Object)this, (Object)objectArray3, (long)2255127722671546484L, (long)l3);
        mr mr2 = new mr(0, this, x72, (mn)((Object)callSite), _yv2, l, _ug2, bl);
        list.add(mr2);
        return mr2;
    }

    /*
     * Unable to fully structure code
     */
    public void n(Object[] var1_1) {
        var2_2 = (Set)var1_1[0];
        var7_3 = (Map)var1_1[1];
        var6_4 = (_yv)var1_1[2];
        var4_5 = (Long)var1_1[3];
        var3_6 = (_zk)var1_1[4];
        v0 = var4_5 = _8c.f ^ var4_5;
        var8_7 = v0 ^ 132228190849244L;
        var10_8 = v0 ^ 70364431170904L;
        var12_9 = v0 ^ 53133478357409L;
        var14_10 = v0 ^ 116824486132512L;
        var16_12 = x44.a("s", (long)6252643153806701348L, (long)var4_5);
        for (var17_11 = 0; var17_11 < this.Q.size(); ++var17_11) {
            var18_13 = (m8)this.Q.get(var17_11);
            try {
                block20: {
                    block21: {
                        v1 = new Object[2];
                        v1[1] = var6_4;
                        v1[0] = var12_9;
                        v2 = x44.a("k", (Object)var18_13, (Object)v1, (long)5413967565232901450L, (long)var4_5);
                        v3 = var16_12;
                        if (var4_5 <= 0L) ** GOTO lbl86
                        if (v3 != null) ** GOTO lbl85
                        if (var16_12 != null) break block20;
                        break block21;
                        catch (_sz v4) {
                            throw x44.a("s", (Object)v4, (long)5417975053756846799L, (long)var4_5);
                        }
                    }
                    try {
                        block22: {
                            if (v2 == null) continue;
                            break block22;
                            catch (_sz v5) {
                                throw x44.a("s", (Object)v5, (long)5417975053756846799L, (long)var4_5);
                            }
                        }
                        var7_3.put(var18_13, var19_14);
                    }
                    catch (_sz v6) {
                        throw x44.a("s", (Object)v6, (long)5417975053756846799L, (long)var4_5);
                    }
                }
                var2_2.add((hy)this.c);
                continue;
            }
            catch (_sz var20_16) {
                v7 = new Object[1];
                v7[0] = var10_8;
                v8 = new Object[1];
                v8[0] = var14_10;
                v9 = new Object[3];
                v9[2] = (String)_8c.a("j", (int)19234, (long)(4808712678911891090L ^ var4_5)) + (String)x44.a("k", (Object)var18_13, (Object)v7, (long)6253637024522550497L, (long)var4_5) + (String)_8c.a("j", (int)22225, (long)(7203431325500787557L ^ var4_5)) + (String)x44.a("k", (Object)var20_16, (Object)v8, (long)5248850269887742107L, (long)var4_5) + (String)_8c.a("j", (int)13080, (long)(5537844598367137449L ^ var4_5));
                v9[1] = _8c.a("j", (int)31936, (long)(898842382626873720L ^ var4_5));
                v9[0] = var8_7;
                x44.a("k", (Object)var3_6, (Object)v9, (long)5263248528966123922L, (long)var4_5);
                continue;
            }
            catch (_s8 var20_17) {
                v10 = new Object[1];
                v10[0] = var10_8;
                v11 = new Object[3];
                v11[2] = (String)_8c.a("j", (int)3669, (long)(3643695284940805114L ^ var4_5)) + (String)x44.a("k", (Object)var18_13, (Object)v10, (long)6253637024522550497L, (long)var4_5) + (String)_8c.a("j", (int)24945, (long)(4646683347070418136L ^ var4_5)) + (String)x44.a("k", (Object)var20_17, (long)5844325692460410804L, (long)var4_5);
                v11[1] = _8c.a("j", (int)17102, (long)(4878454673751465847L ^ var4_5));
                v11[0] = var8_7;
                x44.a("k", (Object)var3_6, (Object)v11, (long)5263248528966123922L, (long)var4_5);
            }
            if (var16_12 == null) continue;
        }
        v12 = 0;
        if (var4_5 < 0L) ** GOTO lbl76
        var17_11 = v12;
        do {
            block19: {
                v12 = var17_11;
lbl76:
                // 2 sources

                if (v12 >= x44.a("o", (Object)this, (long)5323793802082142829L, (long)var4_5).size()) break;
                var18_13 = (m8)x44.a("o", (Object)this, (long)5323793802082142829L, (long)var4_5).get(var17_11);
                try {
                    block18: {
                        v13 = new Object[2];
                        v13[1] = var6_4;
                        v13[0] = var12_9;
                        v2 = x44.a("k", (Object)var18_13, (Object)v13, (long)5413967565232901450L, (long)var4_5);
lbl85:
                        // 3 sources

                        v3 = var16_12;
lbl86:
                        // 2 sources

                        if (v3 != null) break block18;
                        try {
                            block23: {
                                if (v2 == null) break block19;
                                break block23;
                                catch (_sz v14) {
                                    throw x44.a("s", (Object)v14, (long)5417975053756846799L, (long)var4_5);
                                }
                            }
                            v2 = var7_3.put(var18_13, var19_14);
                        }
                        catch (_sz v15) {
                            throw x44.a("s", (Object)v15, (long)5417975053756846799L, (long)var4_5);
                        }
                    }
                    var2_2.add((hy)this.c);
                }
                catch (_sz var20_18) {
                    v16 = new Object[1];
                    v16[0] = var10_8;
                    v17 = new Object[1];
                    v17[0] = var14_10;
                    v18 = new Object[3];
                    v18[2] = (String)_8c.a("j", (int)3669, (long)(3643695284940805114L ^ var4_5)) + (String)x44.a("k", (Object)var18_13, (Object)v16, (long)6253637024522550497L, (long)var4_5) + (String)_8c.a("j", (int)28518, (long)(3787248025122829004L ^ var4_5)) + (String)x44.a("k", (Object)var20_18, (Object)v17, (long)5248850269887742107L, (long)var4_5) + (String)_8c.a("j", (int)25962, (long)(1118032842805147842L ^ var4_5));
                    v18[1] = _8c.a("j", (int)17102, (long)(4878454673751465847L ^ var4_5));
                    v18[0] = var8_7;
                    x44.a("k", (Object)var3_6, (Object)v18, (long)5263248528966123922L, (long)var4_5);
                }
                catch (_s8 var20_19) {
                    v19 = new Object[1];
                    v19[0] = var10_8;
                    v20 = new Object[3];
                    v20[2] = (String)_8c.a("j", (int)3669, (long)(3643695284940805114L ^ var4_5)) + (String)x44.a("k", (Object)var18_13, (Object)v19, (long)6253637024522550497L, (long)var4_5) + (String)_8c.a("j", (int)31552, (long)(712343015265494781L ^ var4_5)) + (String)x44.a("k", (Object)var20_19, (long)5844325692460410804L, (long)var4_5);
                    v20[1] = _8c.a("j", (int)17102, (long)(4878454673751465847L ^ var4_5));
                    v20[0] = var8_7;
                    x44.a("k", (Object)var3_6, (Object)v20, (long)5263248528966123922L, (long)var4_5);
                }
            }
            ++var17_11;
        } while (var16_12 == null);
    }

    public int z(Object[] objectArray) {
        int n;
        block9: {
            int n2 = (Integer)objectArray[0];
            int n3 = (Integer)objectArray[1];
            long l = (Long)objectArray[2];
            long l2 = l = f ^ l;
            long l3 = l2 ^ 0x6790BC87E5EL;
            long l4 = l2 ^ 0x10F0ABEEB1E5L;
            int n4 = 0;
            Object[] objectArray2 = x44.a("s", (long)-2340204838758008220L, (long)l);
            Iterator iterator = ((ArrayList)((Object)x44.a("o", (Object)this, (long)-4501555771487712924L, (long)l))).iterator();
            while (iterator.hasNext()) {
                block10: {
                    Object[] objectArray3;
                    mf mf2;
                    block7: {
                        block8: {
                            mf mf3 = (mf)iterator.next();
                            try {
                                try {
                                    try {
                                        mf2 = mf3;
                                        objectArray3 = objectArray2;
                                        if (l < 0L) break block7;
                                        if (objectArray3 != null) break block8;
                                        Object[] objectArray4 = new Object[1];
                                        objectArray4[0] = l3;
                                        n = (int)x44.a("k", (Object)mf2, (Object)objectArray4, (long)-2536820986688718863L, (long)l);
                                        if (objectArray2 != null) break block9;
                                    }
                                    catch (gj gj2) {
                                        throw x44.a("s", (Object)gj2, (long)-4435845178164880497L, (long)l);
                                    }
                                    if (n != n2) break block10;
                                }
                                catch (gj gj3) {
                                    throw x44.a("s", (Object)gj3, (long)-4435845178164880497L, (long)l);
                                }
                                mf2 = mf3;
                            }
                            catch (gj gj4) {
                                throw x44.a("s", (Object)gj4, (long)-4435845178164880497L, (long)l);
                            }
                        }
                        Object[] objectArray5 = new Object[2];
                        objectArray5[1] = n3;
                        objectArray3 = objectArray5;
                        objectArray5[0] = l4;
                    }
                    x44.a("k", (Object)mf2, (Object)objectArray3, (long)-4428061681530960802L, (long)l);
                    ++n4;
                }
                if (objectArray2 == null) continue;
            }
            n = n4;
        }
        return n;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void w(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [23[DOLOOP]], but top level block is 7[TRYBLOCK]
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
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List j(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (we)var1_1[1];
        var5_4 = (String)var1_1[2];
        v0 = var2_2 = _8c.f ^ var2_2;
        v1 = v0 ^ 114970166395824L;
        var6_5 = v1 >>> 16;
        var8_6 = (int)(v1 << 48 >>> 48);
        var9_7 = v0 ^ 72767813698037L;
        var11_8 = v0 ^ 86473480673946L;
        var14_9 = new ArrayList<x7>();
        var15_10 = this.a.iterator();
        var13_11 = x44.a("s", (long)-8296311919410288324L, (long)var2_2);
        block14: while (var15_10.hasNext()) {
            v2 /* !! */  = var15_10.next();
            do {
                block16: {
                    block17: {
                        var16_12 = (x7)v2 /* !! */ ;
                        v3 = var16_12;
                        if (var13_11 != null) break block17;
                        try {
                            block18: {
                                if (v3.t(var9_7)) break block16;
                                break block18;
                                catch (_s8 v4) {
                                    throw x44.a("s", (Object)v4, (long)-7986907393554249513L, (long)var2_2);
                                }
                            }
                            v3 = var16_12;
                        }
                        catch (_s8 v5) {
                            throw x44.a("s", (Object)v5, (long)-7986907393554249513L, (long)var2_2);
                        }
                    }
                    var17_13 = v3.W(var11_8);
                    try {
                        block20: {
                            block19: {
                                v6 = var17_13.equals(var5_4);
                                if (var13_11 != null) break block16;
                                if (v6) ** GOTO lbl57
                                break block19;
                                catch (_s8 v7) {
                                    throw x44.a("s", (Object)v7, (long)-7986907393554249513L, (long)var2_2);
                                }
                            }
                            v6 = var4_3.m(var6_5, (short)var8_6, var17_13, var5_4);
                            if (var13_11 != null) break block16;
                            break block20;
                            catch (_s8 v8) {
                                throw x44.a("s", (Object)v8, (long)-7986907393554249513L, (long)var2_2);
                            }
                        }
                        try {
                            block21: {
                                if (!v6) break block16;
                                break block21;
                                catch (_s8 v9) {
                                    throw x44.a("s", (Object)v9, (long)-7986907393554249513L, (long)var2_2);
                                }
                            }
                            v6 = var14_9.add(var16_12);
                        }
                        catch (_s8 v10) {
                            throw x44.a("s", (Object)v10, (long)-7986907393554249513L, (long)var2_2);
                        }
                    }
                    catch (_s8 var18_14) {
                        // empty catch block
                    }
                }
                if (var13_11 == null) continue block14;
                v2 /* !! */  = var14_9;
            } while (var2_2 <= 0L);
        }
        return v2 /* !! */ ;
    }

    /*
     * Exception decompiling
     */
    private String Y(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[DOLOOP], 16[WHILELOOP]], but top level block is 7[TRYBLOCK]
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
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean j(Object[] objectArray) {
        CallSite callSite;
        Object object;
        CallSite callSite2;
        long l;
        String string;
        block22: {
            block23: {
                char c;
                block20: {
                    block21: {
                        String string2;
                        block19: {
                            string = (String)objectArray[0];
                            l = (Long)objectArray[1];
                            l = f ^ l;
                            callSite2 = x44.a("p", (long)2456324784502163447L, (long)l);
                            try {
                                string2 = string;
                                if (callSite2 != null) break block19;
                                if (string2 == null) return false;
                            }
                            catch (gj gj2) {
                                throw x44.a("p", (Object)gj2, (long)4603738926653023772L, (long)l);
                            }
                            string2 = string;
                        }
                        try {
                            try {
                                c = string2.length();
                                if (callSite2 != null) break block20;
                                if (c != '\u0000') break block21;
                                return false;
                            }
                            catch (gj gj3) {
                                throw x44.a("p", (Object)gj3, (long)4603738926653023772L, (long)l);
                            }
                        }
                        catch (gj gj4) {
                            throw x44.a("p", (Object)gj4, (long)4603738926653023772L, (long)l);
                        }
                    }
                    c = string.charAt(0);
                }
                char c2 = c;
                try {
                    try {
                        object = x44.a("p", (char)c2, (long)2808914756315145260L, (long)l);
                        if (callSite2 != null) break block22;
                        if (object != false) break block23;
                        return false;
                    }
                    catch (gj gj5) {
                        throw x44.a("p", (Object)gj5, (long)4603738926653023772L, (long)l);
                    }
                }
                catch (gj gj6) {
                    throw x44.a("p", (Object)gj6, (long)4603738926653023772L, (long)l);
                }
            }
            object = string.length();
        }
        CallSite callSite3 = object;
        int n = 1;
        do {
            block24: {
                block25: {
                    Object object2;
                    if (n >= callSite3) return '\u0001' != '\u0000';
                    char c = string.charAt(n);
                    try {
                        try {
                            try {
                                char c3;
                                try {
                                    callSite = callSite2;
                                    if (l <= 0L) continue;
                                    if (callSite != null) break block24;
                                    c3 = c;
                                    if (callSite2 != null) return c3 != '\u0000';
                                }
                                catch (gj gj7) {
                                    throw x44.a("p", (Object)gj7, (long)4603738926653023772L, (long)l);
                                }
                                if (c3 == _8c.b("p", (int)14047, (long)(0x17432CEA4A3D7A4DL ^ l))) break block25;
                            }
                            catch (gj gj8) {
                                throw x44.a("p", (Object)gj8, (long)4603738926653023772L, (long)l);
                            }
                            object2 = x44.a("p", (char)c, (long)2616572362563813027L, (long)l);
                            if (callSite2 != null) return (boolean)object2;
                        }
                        catch (gj gj9) {
                            throw x44.a("p", (Object)gj9, (long)4603738926653023772L, (long)l);
                        }
                        if (object2 != false) break block25;
                    }
                    catch (gj gj10) {
                        throw x44.a("p", (Object)gj10, (long)4603738926653023772L, (long)l);
                    }
                    object2 = false;
                    return (boolean)object2;
                }
                ++n;
            }
            callSite = callSite2;
        } while (callSite == null);
        return '\u0001' != '\u0000';
    }

    public my X(long l, String string, String string2, String string3, List list, _yv _yv2, _ug _ug2) {
        String string4;
        _8c _8c2;
        long l2;
        long l3;
        int n;
        int n2;
        int n3;
        block13: {
            block12: {
                my my2;
                my my3;
                block10: {
                    CallSite callSite;
                    long l4;
                    block11: {
                        long l5 = l = f ^ l;
                        long l6 = l5 ^ 0x637FA62853FCL;
                        long l7 = l5 ^ 0x3299A4698EB8L;
                        n3 = (int)(l7 >>> 32);
                        n2 = (int)(l7 << 32 >>> 40);
                        n = (int)(l7 << 56 >>> 56);
                        l3 = l5 ^ 0x6BBEDBC3736BL;
                        l2 = l5 ^ 0x147924EA40D7L;
                        l4 = l5 ^ 0x529D004545E3L;
                        my3 = this.i(string, string2, l6, string3);
                        callSite = x44.a("u", (long)-3831441113564991694L, (long)l);
                        try {
                            try {
                                my2 = my3;
                                if (callSite != null) break block10;
                                if (my2 == null) break block11;
                            }
                            catch (gj gj2) {
                                throw x44.a("u", (Object)gj2, (long)-2943481883673604391L, (long)l);
                            }
                            return my3;
                        }
                        catch (gj gj3) {
                            throw x44.a("u", (Object)gj3, (long)-2943481883673604391L, (long)l);
                        }
                    }
                    _8c2 = this;
                    string4 = string;
                    if (callSite != null) break block13;
                    my2 = my3 = (my)_8c2.R(string4, string2, string3, list, l4);
                }
                try {
                    if (l > 0L) {
                        if (my2 == null) break block12;
                        my2 = my3;
                    }
                    return my2;
                }
                catch (gj gj4) {
                    throw x44.a("u", (Object)gj4, (long)-2943481883673604391L, (long)l);
                }
            }
            _8c2 = this;
            string4 = string;
        }
        List list2 = list;
        String string5 = string4;
        x7 x72 = _8c2.a(n3, n2, string5, list2, (byte)n);
        Object[] objectArray = new Object[4];
        objectArray[3] = l3;
        objectArray[2] = list;
        objectArray[1] = string3;
        objectArray[0] = string2;
        CallSite callSite = x44.a("m", (Object)this, (Object)objectArray, (long)-3128357442785186902L, (long)l);
        my my4 = new my(0, this, x72, (mn)((Object)callSite), _yv2, l2, _ug2);
        list.add(my4);
        return my4;
    }

    /*
     * Exception decompiling
     */
    private void D(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public void H(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    boolean C(Object[] objectArray) {
        return true;
    }

    public ms G(long l, List list, long l2) {
        long l3 = (l2 = f ^ l2) ^ 0x732951E447FCL;
        Object[] objectArray = new Object[5];
        objectArray[4] = false;
        objectArray[3] = true;
        objectArray[2] = list;
        objectArray[1] = l3;
        objectArray[0] = l;
        return x44.a("k", (Object)this, (Object)objectArray, (long)-2633077765130562079L, (long)l2);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public my w(Object[] objectArray) {
        Object object;
        long l;
        long l2;
        _ug _ug2;
        _yv _yv2;
        List list;
        String string;
        block6: {
            string = (String)objectArray[0];
            list = (List)objectArray[1];
            _yv2 = (_yv)objectArray[2];
            _ug2 = (_ug)objectArray[3];
            l2 = (Long)objectArray[4];
            long l3 = l2 = f ^ l2;
            long l4 = l3 ^ 0x762081FFEA8AL;
            l = l3 ^ 0x2250C9B3D82FL;
            CallSite callSite = x44.a("s", (long)-4195705595026890716L, (long)l2);
            object = string;
            if (callSite == null) {
                switch (((String)object).charAt(0)) {
                    case 'B': 
                    case 'C': 
                    case 'S': {
                        string = "I";
                        break;
                    }
                }
            }
            break block6;
            {
                catch (gj gj2) {
                    throw x44.a("s", (Object)gj2, (long)-2868650349810794033L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l4;
            objectArray2[0] = string;
            object = x44.a("s", (Object)objectArray2, (long)-2717436711032729070L, (long)l2);
        }
        String string2 = object;
        String string3 = (String)x44.a("j", (long)-2754224340749431898L, (long)l2).get(string);
        String string4 = (String)x44.a("j", (long)-4385598650351222650L, (long)l2).get(string);
        return this.X(l, string2, string3, string4, list, _yv2, _ug2);
    }

    public ms A(Object[] objectArray) {
        ms ms2;
        block40: {
            List list;
            block41: {
                long l;
                long l2;
                block39: {
                    Object object;
                    CallSite callSite;
                    long l3;
                    block29: {
                        boolean bl;
                        block30: {
                            xl xl2;
                            Iterator iterator;
                            l2 = (Long)objectArray[0];
                            l3 = (Long)objectArray[1];
                            list = (List)objectArray[2];
                            boolean bl2 = (Boolean)objectArray[3];
                            bl = (Boolean)objectArray[4];
                            long l4 = l3 = f ^ l3;
                            long l5 = l4 ^ 0x75E76FE846ADL;
                            long l6 = l4 ^ 0x604B0B676C76L;
                            l = l4 ^ 0x3D6950D90A23L;
                            callSite = x44.a("v", (long)5731088671483374185L, (long)l3);
                            try {
                                object = bl2;
                                if (callSite != null) break block29;
                                if (!object) break block30;
                            }
                            catch (gj gj2) {
                                throw x44.a("v", (Object)gj2, (long)5944101151849827202L, (long)l3);
                            }
                            int n = 0;
                            block22: while (n < ((ArrayList)((Object)x44.a("j", (Object)this, (long)5492739464481840490L, (long)l3))).size()) {
                                iterator = ((ArrayList)((Object)x44.a("j", (Object)this, (long)5492739464481840490L, (long)l3))).get(n);
                                do {
                                    CallSite callSite2;
                                    block31: {
                                        block32: {
                                            block33: {
                                                xl xl3;
                                                block34: {
                                                    xl2 = (ms)((Object)iterator);
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        callSite2 = callSite;
                                                                        if (l3 <= 0L) break block31;
                                                                        if (callSite2 != null) break block32;
                                                                        Object[] objectArray2 = new Object[1];
                                                                        objectArray2[0] = l5;
                                                                        object = x44.a("n", (Object)xl2, (Object)objectArray2, (long)5903651917967681651L, (long)l3);
                                                                        if (callSite != null) break block29;
                                                                    }
                                                                    catch (gj gj3) {
                                                                        throw x44.a("v", (Object)gj3, (long)5944101151849827202L, (long)l3);
                                                                    }
                                                                    if (object) break block33;
                                                                }
                                                                catch (gj gj4) {
                                                                    throw x44.a("v", (Object)gj4, (long)5944101151849827202L, (long)l3);
                                                                }
                                                                xl3 = xl2;
                                                                if (callSite != null) break block34;
                                                            }
                                                            catch (gj gj5) {
                                                                throw x44.a("v", (Object)gj5, (long)5944101151849827202L, (long)l3);
                                                            }
                                                            if (!((ms)xl3).Q(l2, l6)) break block33;
                                                        }
                                                        catch (gj gj6) {
                                                            throw x44.a("v", (Object)gj6, (long)5944101151849827202L, (long)l3);
                                                        }
                                                        xl3 = xl2;
                                                    }
                                                    catch (gj gj7) {
                                                        throw x44.a("v", (Object)gj7, (long)5944101151849827202L, (long)l3);
                                                    }
                                                }
                                                return xl3;
                                            }
                                            ++n;
                                        }
                                        callSite2 = callSite;
                                    }
                                    if (callSite2 == null) continue block22;
                                    iterator = list.iterator();
                                } while (l3 < 0L);
                            }
                            Iterator iterator2 = iterator;
                            while (iterator2.hasNext()) {
                                block36: {
                                    xl xl4;
                                    block38: {
                                        Object object2;
                                        xl xl5;
                                        block37: {
                                            xl xl6;
                                            block35: {
                                                xl2 = (xl)iterator2.next();
                                                try {
                                                    try {
                                                        xl6 = xl2;
                                                        if (callSite != null) break block35;
                                                        object = xl6 instanceof ms;
                                                        if (callSite != null) break block29;
                                                    }
                                                    catch (gj gj8) {
                                                        throw x44.a("v", (Object)gj8, (long)5944101151849827202L, (long)l3);
                                                    }
                                                    if (!object) break block36;
                                                }
                                                catch (gj gj9) {
                                                    throw x44.a("v", (Object)gj9, (long)5944101151849827202L, (long)l3);
                                                }
                                                xl6 = xl2;
                                            }
                                            xl5 = xl6;
                                            try {
                                                try {
                                                    try {
                                                        Object[] objectArray3 = new Object[1];
                                                        objectArray3[0] = l5;
                                                        object2 = x44.a("n", (Object)xl5, (Object)objectArray3, (long)5903651917967681651L, (long)l3);
                                                        if (callSite != null) break block37;
                                                        if (object2 != false) break block36;
                                                    }
                                                    catch (gj gj10) {
                                                        throw x44.a("v", (Object)gj10, (long)5944101151849827202L, (long)l3);
                                                    }
                                                    xl4 = xl5;
                                                    if (callSite != null) break block38;
                                                }
                                                catch (gj gj11) {
                                                    throw x44.a("v", (Object)gj11, (long)5944101151849827202L, (long)l3);
                                                }
                                                object2 = ((ms)xl4).Q(l2, l6);
                                            }
                                            catch (gj gj12) {
                                                throw x44.a("v", (Object)gj12, (long)5944101151849827202L, (long)l3);
                                            }
                                        }
                                        if (object2 == false) break block36;
                                        xl4 = xl5;
                                    }
                                    return xl4;
                                }
                                if (callSite == null) continue;
                            }
                        }
                        if (l3 < 0L) break block39;
                        object = bl;
                    }
                    if (!object) break block39;
                    ms2 = new ms(0, l, this, l2, true);
                    if (l3 <= 0L) break block40;
                    if (callSite == null) break block41;
                }
                ms2 = new ms(0, l, this, l2, false);
            }
            list.add(ms2);
        }
        return ms2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public x_ F(Object[] var1_1) {
        var2_2 = (_h)var1_1[0];
        var5_3 = (mo)var1_1[1];
        var3_4 = (Long)var1_1[2];
        var6_5 = (List)var1_1[3];
        v0 = var3_4 = _8c.f ^ var3_4;
        var7_6 = v0 ^ 117617741337894L;
        v1 = v0 ^ 68571752975204L;
        var9_7 = (int)(v1 >>> 48);
        var10_8 = (int)(v1 << 16 >>> 48);
        var11_9 = (int)(v1 << 32 >>> 32);
        var12_10 = v0 ^ 67309528440052L;
        var15_11 = x44.a("i", (Object)this, (long)5180348502605869752L, (long)var3_4).iterator();
        var14_12 = x44.a("u", (long)5004549305670246546L, (long)var3_4);
        block22: while (var15_11.hasNext()) {
            v2 /* !! */  = var15_11.next();
            do {
                block31: {
                    block32: {
                        block30: {
                            var16_13 = (x_)v2 /* !! */ ;
                            try {
                                try {
                                    try {
                                        v3 = var16_13;
                                        v4 = var14_12;
                                        if (var3_4 < 0L) ** GOTO lbl49
                                        if (v4 != null) break block30;
                                        v5 = new Object[1];
                                        v5[0] = var12_10;
                                        v6 /* !! */  = x44.a("m", (Object)v3, (Object)v5, (long)5122169653087940085L, (long)var3_4);
                                        if (var14_12 == null) {
                                        }
                                        ** GOTO lbl74
                                    }
                                    catch (gj v7) {
                                        throw x44.a("u", (Object)v7, (long)6379033712059793785L, (long)var3_4);
                                    }
                                    if (v6 /* !! */  != var2_2) break block31;
                                }
                                catch (gj v8) {
                                    throw x44.a("u", (Object)v8, (long)6379033712059793785L, (long)var3_4);
                                }
                                v3 = var16_13;
                            }
                            catch (gj v9) {
                                throw x44.a("u", (Object)v9, (long)6379033712059793785L, (long)var3_4);
                            }
                        }
                        try {
                            try {
                                v4 = var14_12;
lbl49:
                                // 2 sources

                                if (var3_4 > 0L) {
                                    if (v4 != null) break block32;
                                    v10 = new Object[3];
                                    v10[2] = var7_6;
                                    v10[1] = var5_3;
                                    v4 = v10;
                                    v10[0] = var2_2;
                                }
                                if (x44.a("m", (Object)v3, (Object)v4, (long)6496259060284606324L, (long)var3_4) == false) break block31;
                            }
                            catch (gj v11) {
                                throw x44.a("u", (Object)v11, (long)6379033712059793785L, (long)var3_4);
                            }
                            v3 = var16_13;
                        }
                        catch (gj v12) {
                            throw x44.a("u", (Object)v12, (long)6379033712059793785L, (long)var3_4);
                        }
                    }
                    return v3;
                }
                if (var14_12 == null) continue block22;
                v2 /* !! */  = var6_5.iterator();
            } while (var3_4 <= 0L);
        }
        var15_11 = v2 /* !! */ ;
        block24: while (var15_11.hasNext()) {
            v6 /* !! */  = var15_11.next();
lbl74:
            // 2 sources

            v13 /* !! */  = (xl)v6 /* !! */ ;
            do {
                block34: {
                    block36: {
                        block35: {
                            block33: {
                                var16_13 = v13 /* !! */ ;
                                try {
                                    try {
                                        v14 = var16_13;
                                        if (var14_12 != null) break block33;
                                        if (!(v14 instanceof x_)) break block34;
                                    }
                                    catch (gj v15) {
                                        throw x44.a("u", (Object)v15, (long)6379033712059793785L, (long)var3_4);
                                    }
                                    v14 = var16_13;
                                }
                                catch (gj v16) {
                                    throw x44.a("u", (Object)v16, (long)6379033712059793785L, (long)var3_4);
                                }
                            }
                            var17_14 = v14;
                            try {
                                try {
                                    v17 = var17_14;
                                    v18 = var14_12;
                                    if (var3_4 >= 0L) {
                                        if (v18 != null) break block35;
                                        v19 = new Object[1];
                                        v19[0] = var12_10;
                                        if (x44.a("m", (Object)v17, (Object)v19, (long)5122169653087940085L, (long)var3_4) != var2_2) break block34;
                                    }
                                    ** GOTO lbl113
                                }
                                catch (gj v20) {
                                    throw x44.a("u", (Object)v20, (long)6379033712059793785L, (long)var3_4);
                                }
                                v17 = var17_14;
                            }
                            catch (gj v21) {
                                throw x44.a("u", (Object)v21, (long)6379033712059793785L, (long)var3_4);
                            }
                        }
                        try {
                            try {
                                v18 = var14_12;
lbl113:
                                // 2 sources

                                if (var3_4 >= 0L) {
                                    if (v18 != null) break block36;
                                    v22 = new Object[3];
                                    v22[2] = var7_6;
                                    v22[1] = var5_3;
                                    v18 = v22;
                                    v22[0] = var2_2;
                                }
                                if (x44.a("m", (Object)v17, (Object)v18, (long)6496259060284606324L, (long)var3_4) == false) break block34;
                            }
                            catch (gj v23) {
                                throw x44.a("u", (Object)v23, (long)6379033712059793785L, (long)var3_4);
                            }
                            v17 = var17_14;
                        }
                        catch (gj v24) {
                            throw x44.a("u", (Object)v24, (long)6379033712059793785L, (long)var3_4);
                        }
                    }
                    return v17;
                }
                if (var14_12 == null) continue block24;
                v13 /* !! */  = new x_(0, this, (short)var9_7, (short)var10_8, var2_2, var11_9, var5_3);
            } while (var3_4 <= 0L);
        }
        var15_11 = v13 /* !! */ ;
        var6_5.add(var15_11);
        return var15_11;
    }

    public void N(Object[] objectArray) {
        ArrayList arrayList;
        Object object;
        Object object2;
        CallSite callSite;
        long l;
        long l2;
        HashMap hashMap;
        block11: {
            _8c _8c2;
            hashMap = (HashMap)objectArray[0];
            l2 = (Long)objectArray[1];
            l = (l2 = f ^ l2) ^ 0x33195632ABE2L;
            int n = 0;
            callSite = x44.a("u", (long)-5651011831009454990L, (long)l2);
            block6: while (n < ((ArrayList)((Object)x44.a("i", (Object)this, (long)-5902453599501733625L, (long)l2))).size()) {
                _8c2 = this;
                do {
                    CallSite callSite2;
                    block12: {
                        block13: {
                            block14: {
                                CallSite callSite3 = x44.a("i", (Object)_8c2, (long)-5902453599501733625L, (long)l2);
                                if (l2 >= 0L) {
                                    if (callSite != null) break block11;
                                    callSite3 = ((ArrayList)((Object)callSite3)).get(n);
                                }
                                xl xl2 = (mx)((Object)callSite3);
                                object2 = ((mx)xl2).u();
                                object = x44.a("u", (Object)object2, (Object)hashMap, (long)l, (long)-5220262423914268342L, (long)l2);
                                try {
                                    try {
                                        callSite2 = callSite;
                                        if (l2 <= 0L) break block12;
                                        if (callSite2 != null) break block13;
                                        if (((String)object).equals(object2)) break block14;
                                    }
                                    catch (gj gj2) {
                                        throw x44.a("u", (Object)gj2, (long)-6023906556833090151L, (long)l2);
                                    }
                                    ((mx)xl2).v((String)object);
                                }
                                catch (gj gj3) {
                                    throw x44.a("u", (Object)gj3, (long)-6023906556833090151L, (long)l2);
                                }
                            }
                            ++n;
                        }
                        callSite2 = callSite;
                    }
                    if (callSite2 == null) continue block6;
                    _8c2 = this;
                } while (l2 < 0L);
            }
            arrayList = _8c2.L;
        }
        for (xl xl2 : arrayList) {
            object2 = ((md)xl2).U();
            object = ((mx)object2).u();
            CallSite callSite4 = x44.a("u", (Object)object, (Object)hashMap, (long)l, (long)-5220262423914268342L, (long)l2);
            try {
                if (l2 >= 0L && !((String)((Object)callSite4)).equals(object)) {
                    ((mx)object2).v((String)((Object)callSite4));
                }
            }
            catch (gj gj4) {
                throw x44.a("u", (Object)gj4, (long)-6023906556833090151L, (long)l2);
            }
            if (callSite == null) continue;
        }
    }

    @Override
    public void o(Object[] objectArray) {
        block6: {
            _y4 _y42 = (_y4)objectArray[0];
            long l = (Long)objectArray[1];
            _y4 _y43 = (_y4)objectArray[2];
            _y4 _y44 = (_y4)objectArray[3];
            _y4 _y45 = (_y4)objectArray[4];
            _y4 _y46 = (_y4)objectArray[5];
            _y4 _y47 = (_y4)objectArray[6];
            _y4 _y48 = (_y4)objectArray[7];
            _y4 _y49 = (_y4)objectArray[8];
            long l2 = l;
            long l3 = l2 ^ 0L;
            long l4 = l2 ^ 0x3CAF593B9ADEL;
            long l5 = l2 ^ 0x747EC594F17AL;
            long l6 = l2 ^ 0x3255B62438E1L;
            CallSite callSite = x44.a("w", (long)908010001863764344L, (long)l);
            Object[] objectArray2 = new Object[9];
            objectArray2[8] = _y49;
            objectArray2[7] = _y48;
            objectArray2[6] = _y47;
            objectArray2[5] = _y46;
            objectArray2[4] = _y45;
            objectArray2[3] = _y44;
            objectArray2[2] = _y43;
            objectArray2[1] = l3;
            objectArray2[0] = _y42;
            super.o(objectArray2);
            CallSite callSite2 = callSite;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l5;
            objectArray3[0] = sh.Q(this.a.size(), l6);
            CallSite callSite3 = x44.a("w", (Object)objectArray3, (long)1115171251980011722L, (long)l);
            block2: for (x7 x72 : this.a) {
                try {
                    callSite3.put(x72.W(l4), x72);
                    do {
                        CallSite callSite4 = callSite2;
                        if (l >= 0L) {
                            if (callSite4 != null) break block6;
                            callSite4 = callSite2;
                        }
                        if (callSite4 == null) continue block2;
                    } while (l < 0L);
                    break;
                }
                catch (gj gj2) {
                    throw x44.a("w", (Object)gj2, (long)1255585105211066515L, (long)l);
                }
            }
            x44.a("t", (Object)this, (Map)((Object)callSite3), (long)1301822784165407489L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public synchronized int K(Object[] var1_1) {
        var2_2 = (List)var1_1[0];
        var3_3 = (Long)var1_1[1];
        v0 = var3_3;
        var5_4 = v0 ^ 61390453662698L;
        var7_5 = v0 ^ 0L;
        v1 = new Object[2];
        v1[1] = var7_5;
        v1[0] = var2_2;
        var10_6 = super.K(v1);
        var11_7 = var2_2.size();
        var9_8 = x44.a("w", (long)2331124787923666360L, (long)var3_3);
        var12_9 = 0;
        while (var12_9 < var11_7) {
            this.w(var5_4, (xl)var2_2.get(var12_9));
            ++var12_9;
lbl20:
            // 2 sources

            ** while (var9_8 != null)
lbl21:
            // 1 sources

        }
lbl22:
        // 2 sources

        if (var3_3 < 0L) ** GOTO lbl20
        return var10_6;
    }

    public md M(Object[] objectArray) {
        String string = (String)objectArray[0];
        List list = (List)objectArray[1];
        long l = (Long)objectArray[2];
        boolean bl = (Boolean)objectArray[3];
        long l2 = (l = f ^ l) ^ 0x3D6B08B787C9L;
        mx mx2 = new mx(0, this, string);
        md md2 = new md(0, this, l2, mx2, bl);
        list.add(mx2);
        list.add(md2);
        return md2;
    }

    public void C(Object[] objectArray) {
        int n;
        CallSite callSite;
        long l;
        ei ei2;
        long l2;
        _ug _ug2;
        _yv _yv2;
        block28: {
            int n2;
            long l3;
            Set set;
            block27: {
                int n3;
                long l4;
                block26: {
                    int n4;
                    block25: {
                        set = (Set)objectArray[0];
                        _yv2 = (_yv)objectArray[1];
                        _ug2 = (_ug)objectArray[2];
                        l2 = (Long)objectArray[3];
                        ei2 = (ei)objectArray[4];
                        long l5 = l2 = f ^ l2;
                        l4 = l5 ^ 0x578B7241933L;
                        l = l5 ^ 0x5E6043BC8DE3L;
                        long l6 = l5 ^ 0x578B7241933L;
                        l3 = l5 ^ 0x2FC70CC652CBL;
                        int n5 = this.R.size();
                        n4 = 0;
                        callSite = x44.a("w", (long)2173483420642212808L, (long)l2);
                        block8: while (n4 < n5) {
                            mr mr2 = (mr)this.R.get(n4);
                            try {
                                Object[] objectArray2 = new Object[4];
                                objectArray2[3] = l6;
                                objectArray2[2] = ei2;
                                objectArray2[1] = _ug2;
                                objectArray2[0] = _yv2;
                                x44.a("o", (Object)mr2, (Object)objectArray2, (long)2195886159307460226L, (long)l2);
                                ++n4;
                                do {
                                    CallSite callSite2 = callSite;
                                    if (l2 > 0L) {
                                        if (callSite2 != null) break block25;
                                        callSite2 = callSite;
                                    }
                                    if (callSite2 == null) continue block8;
                                } while (l2 <= 0L);
                                break;
                            }
                            catch (gj gj2) {
                                throw x44.a("w", (Object)gj2, (long)278266528034691619L, (long)l2);
                            }
                        }
                        n4 = this.Q.size();
                    }
                    n3 = 0;
                    block10: while (n3 < n4) {
                        my my2 = (my)this.Q.get(n3);
                        try {
                            Object[] objectArray3 = new Object[4];
                            objectArray3[3] = l4;
                            objectArray3[2] = ei2;
                            objectArray3[1] = _ug2;
                            objectArray3[0] = _yv2;
                            x44.a("o", (Object)my2, (Object)objectArray3, (long)1860511368874510645L, (long)l2);
                            ++n3;
                            do {
                                CallSite callSite3 = callSite;
                                if (l2 > 0L) {
                                    if (callSite3 != null) break block26;
                                    callSite3 = callSite;
                                }
                                if (callSite3 == null) continue block10;
                            } while (l2 < 0L);
                            break;
                        }
                        catch (gj gj3) {
                            throw x44.a("w", (Object)gj3, (long)278266528034691619L, (long)l2);
                        }
                    }
                    n3 = ((ArrayList)((Object)x44.a("k", (Object)this, (long)75980876406653569L, (long)l2))).size();
                }
                n2 = 0;
                block12: while (n2 < n3) {
                    mz mz2 = (mz)((ArrayList)((Object)x44.a("k", (Object)this, (long)75980876406653569L, (long)l2))).get(n2);
                    try {
                        Object[] objectArray4 = new Object[4];
                        objectArray4[3] = l4;
                        objectArray4[2] = ei2;
                        objectArray4[1] = _ug2;
                        objectArray4[0] = _yv2;
                        x44.a("o", (Object)mz2, (Object)objectArray4, (long)1860511368874510645L, (long)l2);
                        ++n2;
                        do {
                            CallSite callSite4 = callSite;
                            if (l2 > 0L) {
                                if (callSite4 != null) break block27;
                                callSite4 = callSite;
                            }
                            if (callSite4 == null) continue block12;
                        } while (l2 < 0L);
                        break;
                    }
                    catch (gj gj4) {
                        throw x44.a("w", (Object)gj4, (long)278266528034691619L, (long)l2);
                    }
                }
                n2 = ((ArrayList)((Object)x44.a("k", (Object)this, (long)137817688679610187L, (long)l2))).size();
            }
            n = 0;
            block14: while (n < n2) {
                x4 x42 = (x4)((ArrayList)((Object)x44.a("k", (Object)this, (long)137817688679610187L, (long)l2))).get(n);
                try {
                    Object[] objectArray5 = new Object[5];
                    objectArray5[4] = ei2;
                    objectArray5[3] = _ug2;
                    objectArray5[2] = _yv2;
                    objectArray5[1] = set;
                    objectArray5[0] = l3;
                    x44.a("o", (Object)x42, (Object)objectArray5, (long)76104495590797460L, (long)l2);
                    ++n;
                    do {
                        CallSite callSite5 = callSite;
                        if (l2 >= 0L) {
                            if (callSite5 != null) break block28;
                            callSite5 = callSite;
                        }
                        if (callSite5 == null) continue block14;
                    } while (l2 < 0L);
                    break;
                }
                catch (gj gj5) {
                    throw x44.a("w", (Object)gj5, (long)278266528034691619L, (long)l2);
                }
            }
            n = ((ArrayList)((Object)x44.a("k", (Object)this, (long)2192476295984028154L, (long)l2))).size();
        }
        for (int i = 0; i < n; ++i) {
            x2 x22 = (x2)((ArrayList)((Object)x44.a("k", (Object)this, (long)2192476295984028154L, (long)l2))).get(i);
            Object[] objectArray6 = new Object[4];
            objectArray6[3] = ei2;
            objectArray6[2] = _ug2;
            objectArray6[1] = l;
            objectArray6[0] = _yv2;
            x44.a("o", (Object)x22, (Object)objectArray6, (long)2102212950799568131L, (long)l2);
            if (callSite == null) continue;
        }
    }

    public mf L(Object[] objectArray) {
        mf mf2;
        block40: {
            List list;
            block41: {
                int n;
                int n2;
                int n3;
                int n4;
                block39: {
                    Object object;
                    CallSite callSite;
                    long l;
                    block29: {
                        boolean bl;
                        block30: {
                            xl xl2;
                            Iterator iterator;
                            n4 = (Integer)objectArray[0];
                            l = (Long)objectArray[1];
                            list = (List)objectArray[2];
                            boolean bl2 = (Boolean)objectArray[3];
                            bl = (Boolean)objectArray[4];
                            long l2 = l = f ^ l;
                            long l3 = l2 ^ 0x7495406A2D5BL;
                            n3 = (int)(l3 >>> 32);
                            n2 = (int)(l3 << 32 >>> 48);
                            n = (int)(l3 << 48 >>> 48);
                            long l4 = l2 ^ 0x56767295684EL;
                            long l5 = l2 ^ 0x21E2A10A713FL;
                            callSite = x44.a("p", (long)-2956984357970332905L, (long)l);
                            try {
                                object = bl2;
                                if (callSite != null) break block29;
                                if (!object) break block30;
                            }
                            catch (gj gj2) {
                                throw x44.a("p", (Object)gj2, (long)-3817939582012534020L, (long)l);
                            }
                            int n5 = 0;
                            block22: while (n5 < ((ArrayList)((Object)x44.a("l", (Object)this, (long)-3966544693416001513L, (long)l))).size()) {
                                iterator = ((ArrayList)((Object)x44.a("l", (Object)this, (long)-3966544693416001513L, (long)l))).get(n5);
                                do {
                                    CallSite callSite2;
                                    block31: {
                                        block32: {
                                            block33: {
                                                xl xl3;
                                                block34: {
                                                    xl2 = (mf)((Object)iterator);
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        callSite2 = callSite;
                                                                        if (l < 0L) break block31;
                                                                        if (callSite2 != null) break block32;
                                                                        Object[] objectArray2 = new Object[1];
                                                                        objectArray2[0] = l4;
                                                                        object = x44.a("h", (Object)xl2, (Object)objectArray2, (long)-3414151356466866741L, (long)l);
                                                                        if (callSite != null) break block29;
                                                                    }
                                                                    catch (gj gj3) {
                                                                        throw x44.a("p", (Object)gj3, (long)-3817939582012534020L, (long)l);
                                                                    }
                                                                    if (object) break block33;
                                                                }
                                                                catch (gj gj4) {
                                                                    throw x44.a("p", (Object)gj4, (long)-3817939582012534020L, (long)l);
                                                                }
                                                                xl3 = xl2;
                                                                if (callSite != null) break block34;
                                                            }
                                                            catch (gj gj5) {
                                                                throw x44.a("p", (Object)gj5, (long)-3817939582012534020L, (long)l);
                                                            }
                                                            Object[] objectArray3 = new Object[2];
                                                            objectArray3[1] = n4;
                                                            objectArray3[0] = l5;
                                                            if (x44.a("h", (Object)xl3, (Object)objectArray3, (long)-3616230991971941875L, (long)l) == false) break block33;
                                                        }
                                                        catch (gj gj6) {
                                                            throw x44.a("p", (Object)gj6, (long)-3817939582012534020L, (long)l);
                                                        }
                                                        xl3 = xl2;
                                                    }
                                                    catch (gj gj7) {
                                                        throw x44.a("p", (Object)gj7, (long)-3817939582012534020L, (long)l);
                                                    }
                                                }
                                                return xl3;
                                            }
                                            ++n5;
                                        }
                                        callSite2 = callSite;
                                    }
                                    if (callSite2 == null) continue block22;
                                    iterator = list.iterator();
                                } while (l < 0L);
                            }
                            Iterator iterator2 = iterator;
                            while (iterator2.hasNext()) {
                                block36: {
                                    xl xl4;
                                    block38: {
                                        CallSite callSite3;
                                        xl xl5;
                                        block37: {
                                            xl xl6;
                                            block35: {
                                                xl2 = (xl)iterator2.next();
                                                try {
                                                    try {
                                                        xl6 = xl2;
                                                        if (callSite != null) break block35;
                                                        object = xl6 instanceof mf;
                                                        if (callSite != null) break block29;
                                                    }
                                                    catch (gj gj8) {
                                                        throw x44.a("p", (Object)gj8, (long)-3817939582012534020L, (long)l);
                                                    }
                                                    if (!object) break block36;
                                                }
                                                catch (gj gj9) {
                                                    throw x44.a("p", (Object)gj9, (long)-3817939582012534020L, (long)l);
                                                }
                                                xl6 = xl2;
                                            }
                                            xl5 = xl6;
                                            try {
                                                try {
                                                    try {
                                                        Object[] objectArray4 = new Object[1];
                                                        objectArray4[0] = l4;
                                                        callSite3 = x44.a("h", (Object)xl5, (Object)objectArray4, (long)-3414151356466866741L, (long)l);
                                                        if (callSite != null) break block37;
                                                        if (callSite3 != false) break block36;
                                                    }
                                                    catch (gj gj10) {
                                                        throw x44.a("p", (Object)gj10, (long)-3817939582012534020L, (long)l);
                                                    }
                                                    xl4 = xl5;
                                                    if (callSite != null) break block38;
                                                }
                                                catch (gj gj11) {
                                                    throw x44.a("p", (Object)gj11, (long)-3817939582012534020L, (long)l);
                                                }
                                                Object[] objectArray5 = new Object[2];
                                                objectArray5[1] = n4;
                                                objectArray5[0] = l5;
                                                callSite3 = x44.a("h", (Object)xl4, (Object)objectArray5, (long)-3616230991971941875L, (long)l);
                                            }
                                            catch (gj gj12) {
                                                throw x44.a("p", (Object)gj12, (long)-3817939582012534020L, (long)l);
                                            }
                                        }
                                        if (callSite3 == false) break block36;
                                        xl4 = xl5;
                                    }
                                    return xl4;
                                }
                                if (callSite == null) continue;
                            }
                        }
                        if (l < 0L) break block39;
                        object = bl;
                    }
                    if (!object) break block39;
                    mf2 = new mf(0, n3, (char)n2, this, n4, (char)n, true);
                    if (l <= 0L) break block40;
                    if (callSite == null) break block41;
                }
                mf2 = new mf(0, n3, (char)n2, this, n4, (char)n, false);
            }
            list.add(mf2);
        }
        return mf2;
    }

    /*
     * Exception decompiling
     */
    public int v(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[DOLOOP]], but top level block is 13[SIMPLE_IF_TAKEN]
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
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public int Y(Object[] objectArray) {
        int n;
        block7: {
            String string = (String)objectArray[0];
            long l = (Long)objectArray[1];
            String string2 = (String)objectArray[2];
            long l2 = (l = f ^ l) ^ 0x1DC14BE455CDL;
            int n2 = 0;
            Iterator iterator = this.L.iterator();
            CallSite callSite = x44.a("s", (long)-3416580794277907084L, (long)l);
            while (iterator.hasNext()) {
                block8: {
                    block5: {
                        md md2;
                        block6: {
                            md md3 = (md)iterator.next();
                            try {
                                try {
                                    if (l <= 0L) break block5;
                                    md2 = md3;
                                    if (callSite != null) break block6;
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l2;
                                    n = ((String)((Object)x44.a("k", (Object)md2, (Object)objectArray2, (long)-3933090263788716927L, (long)l))).equals(string) ? 1 : '\u0000';
                                    if (callSite != null) break block7;
                                }
                                catch (gj gj2) {
                                    throw x44.a("s", (Object)gj2, (long)-3647766613239573345L, (long)l);
                                }
                                if (n == 0) break block8;
                            }
                            catch (gj gj3) {
                                throw x44.a("s", (Object)gj3, (long)-3647766613239573345L, (long)l);
                            }
                            md2 = md3;
                        }
                        md2.U().v(string2);
                    }
                    ++n2;
                }
                if (callSite == null) continue;
            }
            n = n2;
        }
        return n;
    }

    public void W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = f ^ l) ^ 0x765B40926458L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        Iterator iterator = this.L.iterator();
        CallSite callSite = x44.a("p", (long)-7363752872740324305L, (long)l);
        while (iterator.hasNext()) {
            md md2 = (md)iterator.next();
            Object[] objectArray2 = new Object[4];
            objectArray2[3] = n3;
            objectArray2[2] = n2;
            objectArray2[1] = false;
            objectArray2[0] = (int)((short)n);
            x44.a("h", (Object)md2, (Object)objectArray2, (long)-9109626441602008700L, (long)l);
            if (callSite == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void E(Object[] var1_1) {
        block10: {
            var2_2 = (Long)var1_1[0];
            var4_3 = (bq)var1_1[1];
            v0 = var2_2 = _8c.f ^ var2_2;
            var5_4 = v0 ^ 1691722082830L;
            var7_5 = v0 ^ 48232823099891L;
            var9_6 = v0 ^ 7573331681408L;
            var12_7 = x44.a("j", (Object)this, (long)-3233387300184611454L, (long)var2_2).iterator();
            var11_8 = x44.a("v", (long)-3683715026592749311L, (long)var2_2);
            block2: while (var12_7.hasNext()) {
                var13_9 /* !! */  = (x4)var12_7.next();
                v1 = new Object[1];
                v1[0] = var7_5;
                v2 = new Object[2];
                v2[1] = (int)x44.a("n", (Object)var13_9 /* !! */ , (Object)v1, (long)-3687646555056398786L, (long)var2_2);
                v2[0] = var5_4;
                v3 = new Object[2];
                v3[1] = x44.a("n", (Object)var4_3, (Object)v2, (long)-4016935719372507029L, (long)var2_2);
                v3[0] = var9_6;
                v4 /* !! */  = x44.a("n", (Object)var13_9 /* !! */ , (Object)v3, (long)-3195980080104211560L, (long)var2_2);
                if (var2_2 > 0L) {
                    var14_10 /* !! */  = v4 /* !! */ ;
                    try {
                        while (var11_8 == null) {
                            if (var11_8 == null) continue block2;
                            if (var2_2 < 0L) continue;
                            break block2;
                        }
                        break block10;
                    }
                    catch (gj v5) {
                        throw x44.a("v", (Object)v5, (long)-3380643137669281558L, (long)var2_2);
                    }
                }
                ** GOTO lbl44
            }
            var12_7 = x44.a("j", (Object)this, (long)-3700781833514366157L, (long)var2_2).iterator();
        }
        do {
            block11: {
                v6 = var12_7;
                if (var2_2 < 0L) break block11;
                v4 /* !! */  = v6.hasNext();
lbl44:
                // 2 sources

                if (!v4 /* !! */ ) break;
                v6 = var12_7.next();
            }
            var13_9 /* !! */  = (x2)v6;
            v7 = new Object[1];
            v7[0] = var7_5;
            v8 = new Object[2];
            v8[1] = (int)x44.a("n", (Object)var13_9 /* !! */ , (Object)v7, (long)-3687646555056398786L, (long)var2_2);
            v8[0] = var5_4;
            v9 = new Object[2];
            v9[1] = x44.a("n", (Object)var4_3, (Object)v8, (long)-4016935719372507029L, (long)var2_2);
            v9[0] = var9_6;
            var14_10 /* !! */  = x44.a("n", (Object)var13_9 /* !! */ , (Object)v9, (long)-3195980080104211560L, (long)var2_2);
        } while (var11_8 == null);
    }

    /*
     * Exception decompiling
     */
    private void w(long var1_1, xl var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 18[SWITCH]
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
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public void u(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [42[DOLOOP]], but top level block is 50[SIMPLE_IF_TAKEN]
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
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public md R(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        List list = (List)objectArray[2];
        long l2 = (l = f ^ l) ^ 0x35A4B0F5F5DCL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = true;
        objectArray2[2] = l2;
        objectArray2[1] = list;
        objectArray2[0] = string;
        return x44.a("h", (Object)this, (Object)objectArray2, (long)8974999631643713326L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void P(Object[] var1_1) {
        block206: {
            block204: {
                block199: {
                    block200: {
                        block194: {
                            block195: {
                                block189: {
                                    block190: {
                                        block184: {
                                            block185: {
                                                block180: {
                                                    block176: {
                                                        block172: {
                                                            block168: {
                                                                block163: {
                                                                    block164: {
                                                                        block159: {
                                                                            block155: {
                                                                                block150: {
                                                                                    block151: {
                                                                                        block145: {
                                                                                            block146: {
                                                                                                block140: {
                                                                                                    block141: {
                                                                                                        var2_2 = (Long)var1_1[0];
                                                                                                        var4_3 = (_8l)var1_1[1];
                                                                                                        v0 = var2_2 = _8c.f ^ var2_2;
                                                                                                        var5_4 = v0 ^ 69588989660423L;
                                                                                                        var7_5 = v0 ^ 37379601164450L;
                                                                                                        var9_6 = v0 ^ 128597297292175L;
                                                                                                        var11_7 = v0 ^ 51702594456221L;
                                                                                                        var13_8 = v0 ^ 131168267830422L;
                                                                                                        var15_9 = v0 ^ 98463031055280L;
                                                                                                        var17_10 = v0 ^ 79932618144868L;
                                                                                                        var19_11 = v0 ^ 92951826472716L;
                                                                                                        var21_12 = v0 ^ 118906942174992L;
                                                                                                        var23_13 = v0 ^ 99767620843369L;
                                                                                                        var25_14 = v0 ^ 139494342960342L;
                                                                                                        var27_15 = v0 ^ 115648461406982L;
                                                                                                        var29_16 = v0 ^ 27639661391281L;
                                                                                                        var31_17 = v0 ^ 51368002617352L;
                                                                                                        var33_18 = v0 ^ 24379540170952L;
                                                                                                        var36_19 = this.a.size();
                                                                                                        v1 = new Object[2];
                                                                                                        v1[1] = var27_15;
                                                                                                        v1[0] = sh.Q(var36_19, var11_7);
                                                                                                        var37_20 = x44.a("s", (Object)v1, (long)-214484996782687562L, (long)var2_2);
                                                                                                        var38_21 = new ArrayList<Object>(var36_19);
                                                                                                        var35_22 = x44.a("s", (long)-79381331847046396L, (long)var2_2);
                                                                                                        v2 = new Object[1];
                                                                                                        v2[0] = var5_4;
                                                                                                        var39_23 = x44.a("k", (Object)var4_3, (Object)v2, (long)-191394102996924196L, (long)var2_2);
                                                                                                        var40_24 = 0;
                                                                                                        while (var40_24 < var36_19) {
                                                                                                            block138: {
                                                                                                                block139: {
                                                                                                                    block142: {
                                                                                                                        var41_26 = (x7)this.a.get(var40_24);
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v3 = var35_22;
                                                                                                                                    while (true) {
                                                                                                                                        if (var2_2 < 0L) break block138;
                                                                                                                                        if (v3 != null) break block139;
                                                                                                                                        v4 = var39_23;
                                                                                                                                        if (var2_2 <= 0L) break block140;
                                                                                                                                        v5 = (int)v4.contains(var41_26);
                                                                                                                                        if (var35_22 != null) break block141;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                catch (gj v6) {
                                                                                                                                    throw x44.a("s", (Object)v6, (long)-2084989260598707473L, (long)var2_2);
                                                                                                                                }
                                                                                                                                if (v5 == 0) break block142;
                                                                                                                            }
                                                                                                                            catch (gj v7) {
                                                                                                                                throw x44.a("s", (Object)v7, (long)-2084989260598707473L, (long)var2_2);
                                                                                                                            }
                                                                                                                            var38_21.add(var41_26);
                                                                                                                            var37_20.put(var41_26.W(var7_5), var41_26);
                                                                                                                        }
                                                                                                                        catch (gj v8) {
                                                                                                                            throw x44.a("s", (Object)v8, (long)-2084989260598707473L, (long)var2_2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    ++var40_24;
                                                                                                                }
                                                                                                                v3 = var35_22;
                                                                                                            }
                                                                                                            if (v3 == null) continue;
                                                                                                            v9 = new String[3];
                                                                                                            if (var2_2 <= 0L) ** continue;
                                                                                                            x44.a("s", (Object)v9, (long)-515882033037255583L, (long)var2_2);
                                                                                                            break;
                                                                                                        }
                                                                                                        x44.a("p", (Object)this, (Map)var37_20, (long)-2275129541207615107L, (long)var2_2);
                                                                                                        this.a = var38_21;
                                                                                                        v5 = this.G.size();
                                                                                                    }
                                                                                                    var36_19 = v5;
                                                                                                    v10 = new Object[1];
                                                                                                    v10[0] = var15_9;
                                                                                                    v4 = x44.a("k", (Object)var4_3, (Object)v10, (long)-213943645921196914L, (long)var2_2);
                                                                                                }
                                                                                                var40_25 = v4;
                                                                                                var41_26 = new ArrayList<E>(var36_19);
                                                                                                var42_27 = 0;
                                                                                                block106: while (var42_27 < var36_19) {
                                                                                                    v11 = this.G.get(var42_27);
                                                                                                    do {
                                                                                                        block143: {
                                                                                                            block144: {
                                                                                                                block147: {
                                                                                                                    var43_29 = (mx)v11;
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v12 = var35_22;
                                                                                                                                if (var2_2 <= 0L) break block143;
                                                                                                                                if (v12 != null) break block144;
                                                                                                                                v13 = var40_25;
                                                                                                                                if (var2_2 < 0L) break block145;
                                                                                                                                v14 = (int)v13.contains(var43_29);
                                                                                                                                if (var35_22 != null) break block146;
                                                                                                                            }
                                                                                                                            catch (gj v15) {
                                                                                                                                throw x44.a("s", (Object)v15, (long)-2084989260598707473L, (long)var2_2);
                                                                                                                            }
                                                                                                                            if (v14 == 0) break block147;
                                                                                                                        }
                                                                                                                        catch (gj v16) {
                                                                                                                            throw x44.a("s", (Object)v16, (long)-2084989260598707473L, (long)var2_2);
                                                                                                                        }
                                                                                                                        var41_26.add(var43_29);
                                                                                                                    }
                                                                                                                    catch (gj v17) {
                                                                                                                        throw x44.a("s", (Object)v17, (long)-2084989260598707473L, (long)var2_2);
                                                                                                                    }
                                                                                                                }
                                                                                                                ++var42_27;
                                                                                                            }
                                                                                                            v12 = var35_22;
                                                                                                        }
                                                                                                        if (v12 == null) continue block106;
                                                                                                        this.G = var41_26;
                                                                                                        v11 = this.y;
                                                                                                    } while (var2_2 <= 0L);
                                                                                                }
                                                                                                v14 = v11.size();
                                                                                            }
                                                                                            var36_19 = v14;
                                                                                            v18 = new Object[1];
                                                                                            v18[0] = var17_10;
                                                                                            v13 = x44.a("k", (Object)var4_3, (Object)v18, (long)-2107901272071588887L, (long)var2_2);
                                                                                        }
                                                                                        var42_28 = v13;
                                                                                        var43_29 = new ArrayList<E>(var36_19);
                                                                                        var44_30 = 0;
                                                                                        block108: while (var44_30 < var36_19) {
                                                                                            v19 = this.y.get(var44_30);
                                                                                            do {
                                                                                                block148: {
                                                                                                    block149: {
                                                                                                        block152: {
                                                                                                            var45_32 = (mn)v19;
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        v20 = var35_22;
                                                                                                                        if (var2_2 <= 0L) break block148;
                                                                                                                        if (v20 != null) break block149;
                                                                                                                        v21 = var42_28;
                                                                                                                        if (var2_2 <= 0L) break block150;
                                                                                                                        v22 = (int)v21.contains(var45_32);
                                                                                                                        if (var35_22 != null) break block151;
                                                                                                                    }
                                                                                                                    catch (gj v23) {
                                                                                                                        throw x44.a("s", (Object)v23, (long)-2084989260598707473L, (long)var2_2);
                                                                                                                    }
                                                                                                                    if (v22 == 0) break block152;
                                                                                                                }
                                                                                                                catch (gj v24) {
                                                                                                                    throw x44.a("s", (Object)v24, (long)-2084989260598707473L, (long)var2_2);
                                                                                                                }
                                                                                                                var43_29.add(var45_32);
                                                                                                            }
                                                                                                            catch (gj v25) {
                                                                                                                throw x44.a("s", (Object)v25, (long)-2084989260598707473L, (long)var2_2);
                                                                                                            }
                                                                                                        }
                                                                                                        ++var44_30;
                                                                                                    }
                                                                                                    v20 = var35_22;
                                                                                                }
                                                                                                if (v20 == null) continue block108;
                                                                                                this.y = var43_29;
                                                                                                v19 = this.R;
                                                                                            } while (var2_2 <= 0L);
                                                                                        }
                                                                                        v22 = v19.size();
                                                                                    }
                                                                                    var36_19 = v22;
                                                                                    v26 = new Object[1];
                                                                                    v26[0] = var19_11;
                                                                                    v21 = x44.a("k", (Object)var4_3, (Object)v26, (long)-2107543498078079912L, (long)var2_2);
                                                                                }
                                                                                var44_31 = v21;
                                                                                var45_32 = new ArrayList<E>(var36_19);
                                                                                var46_33 = 0;
                                                                                block110: while (var46_33 < var36_19) {
                                                                                    v27 = this.R.get(var46_33);
                                                                                    do {
                                                                                        block153: {
                                                                                            block154: {
                                                                                                block156: {
                                                                                                    var47_35 = (mr)v27;
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v28 = var35_22;
                                                                                                                if (var2_2 < 0L) break block153;
                                                                                                                if (v28 != null) break block154;
                                                                                                                v29 = (int)var44_31.contains(var47_35);
                                                                                                                if (var35_22 != null) break block155;
                                                                                                            }
                                                                                                            catch (gj v30) {
                                                                                                                throw x44.a("s", (Object)v30, (long)-2084989260598707473L, (long)var2_2);
                                                                                                            }
                                                                                                            if (v29 == 0) break block156;
                                                                                                        }
                                                                                                        catch (gj v31) {
                                                                                                            throw x44.a("s", (Object)v31, (long)-2084989260598707473L, (long)var2_2);
                                                                                                        }
                                                                                                        var45_32.add(var47_35);
                                                                                                    }
                                                                                                    catch (gj v32) {
                                                                                                        throw x44.a("s", (Object)v32, (long)-2084989260598707473L, (long)var2_2);
                                                                                                    }
                                                                                                }
                                                                                                ++var46_33;
                                                                                            }
                                                                                            v28 = var35_22;
                                                                                        }
                                                                                        if (v28 == null) continue block110;
                                                                                        this.R = var45_32;
                                                                                        v27 = this.Q;
                                                                                    } while (var2_2 < 0L);
                                                                                }
                                                                                v29 = v27.size();
                                                                            }
                                                                            var36_19 = v29;
                                                                            var46_34 = new ArrayList<my>(var36_19);
                                                                            var47_36 = 0;
                                                                            block112: while (var47_36 < var36_19) {
                                                                                v33 = this.Q.get(var47_36);
                                                                                do {
                                                                                    block157: {
                                                                                        block158: {
                                                                                            block160: {
                                                                                                var48_38 = (my)v33;
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v34 = var35_22;
                                                                                                            if (var2_2 < 0L) break block157;
                                                                                                            if (v34 != null) break block158;
                                                                                                            v35 = (int)var44_31.contains(var48_38);
                                                                                                            if (var35_22 != null) break block159;
                                                                                                        }
                                                                                                        catch (gj v36) {
                                                                                                            throw x44.a("s", (Object)v36, (long)-2084989260598707473L, (long)var2_2);
                                                                                                        }
                                                                                                        if (v35 == 0) break block160;
                                                                                                    }
                                                                                                    catch (gj v37) {
                                                                                                        throw x44.a("s", (Object)v37, (long)-2084989260598707473L, (long)var2_2);
                                                                                                    }
                                                                                                    var46_34.add(var48_38);
                                                                                                }
                                                                                                catch (gj v38) {
                                                                                                    throw x44.a("s", (Object)v38, (long)-2084989260598707473L, (long)var2_2);
                                                                                                }
                                                                                            }
                                                                                            ++var47_36;
                                                                                        }
                                                                                        v34 = var35_22;
                                                                                    }
                                                                                    if (v34 == null) continue block112;
                                                                                    this.Q = var46_34;
                                                                                    v33 = x44.a("o", (Object)this, (long)-2179240245377047987L, (long)var2_2);
                                                                                } while (var2_2 < 0L);
                                                                            }
                                                                            v35 = v33.size();
                                                                        }
                                                                        var36_19 = v35;
                                                                        var47_37 = new ArrayList<Object>(var36_19);
                                                                        var48_39 = 0;
                                                                        block114: while (var48_39 < var36_19) {
                                                                            v39 = x44.a("o", (Object)this, (long)-2179240245377047987L, (long)var2_2).get(var48_39);
                                                                            do {
                                                                                block161: {
                                                                                    block162: {
                                                                                        block165: {
                                                                                            var49_41 = (mz)v39;
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v40 = var35_22;
                                                                                                        if (var2_2 < 0L) break block161;
                                                                                                        if (v40 != null) break block162;
                                                                                                        v41 = var44_31;
                                                                                                        if (var2_2 < 0L) break block163;
                                                                                                        v42 = (int)v41.contains(var49_41);
                                                                                                        if (var35_22 != null) break block164;
                                                                                                    }
                                                                                                    catch (gj v43) {
                                                                                                        throw x44.a("s", (Object)v43, (long)-2084989260598707473L, (long)var2_2);
                                                                                                    }
                                                                                                    if (v42 == 0) break block165;
                                                                                                }
                                                                                                catch (gj v44) {
                                                                                                    throw x44.a("s", (Object)v44, (long)-2084989260598707473L, (long)var2_2);
                                                                                                }
                                                                                                var47_37.add(var49_41);
                                                                                            }
                                                                                            catch (gj v45) {
                                                                                                throw x44.a("s", (Object)v45, (long)-2084989260598707473L, (long)var2_2);
                                                                                            }
                                                                                        }
                                                                                        ++var48_39;
                                                                                    }
                                                                                    v40 = var35_22;
                                                                                }
                                                                                if (v40 == null) continue block114;
                                                                                x44.a("p", (Object)this, var47_37, (long)-2179240245377047987L, (long)var2_2);
                                                                                v39 = this.L;
                                                                            } while (var2_2 <= 0L);
                                                                        }
                                                                        v42 = v39.size();
                                                                    }
                                                                    var36_19 = v42;
                                                                    v46 = new Object[1];
                                                                    v46[0] = var31_17;
                                                                    v41 = x44.a("k", (Object)var4_3, (Object)v46, (long)-2029161463440848140L, (long)var2_2);
                                                                }
                                                                var48_40 = v41;
                                                                var49_41 = new ArrayList<E>(var36_19);
                                                                var50_42 = 0;
                                                                block116: while (var50_42 < var36_19) {
                                                                    v47 = this.L.get(var50_42);
                                                                    do {
                                                                        block166: {
                                                                            block167: {
                                                                                block169: {
                                                                                    var51_44 = (md)v47;
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v48 = var35_22;
                                                                                                if (var2_2 < 0L) break block166;
                                                                                                if (v48 != null) break block167;
                                                                                                v49 = (int)var48_40.contains(var51_44);
                                                                                                if (var35_22 != null) break block168;
                                                                                            }
                                                                                            catch (gj v50) {
                                                                                                throw x44.a("s", (Object)v50, (long)-2084989260598707473L, (long)var2_2);
                                                                                            }
                                                                                            if (v49 == 0) break block169;
                                                                                        }
                                                                                        catch (gj v51) {
                                                                                            throw x44.a("s", (Object)v51, (long)-2084989260598707473L, (long)var2_2);
                                                                                        }
                                                                                        var49_41.add(var51_44);
                                                                                    }
                                                                                    catch (gj v52) {
                                                                                        throw x44.a("s", (Object)v52, (long)-2084989260598707473L, (long)var2_2);
                                                                                    }
                                                                                }
                                                                                ++var50_42;
                                                                            }
                                                                            v48 = var35_22;
                                                                        }
                                                                        if (v48 == null) continue block116;
                                                                        this.L = var49_41;
                                                                        v47 = x44.a("o", (Object)this, (long)-2240727868184877052L, (long)var2_2);
                                                                    } while (var2_2 <= 0L);
                                                                }
                                                                v49 = v47.size();
                                                            }
                                                            var36_19 = v49;
                                                            var50_43 = new ArrayList<mf>(var36_19);
                                                            var51_45 = 0;
                                                            block118: while (var51_45 < var36_19) {
                                                                v53 = x44.a("o", (Object)this, (long)-2240727868184877052L, (long)var2_2).get(var51_45);
                                                                do {
                                                                    block170: {
                                                                        block171: {
                                                                            block173: {
                                                                                var52_47 = (mf)v53;
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v54 = var35_22;
                                                                                            if (var2_2 <= 0L) break block170;
                                                                                            if (v54 != null) break block171;
                                                                                            v55 = (int)var48_40.contains(var52_47);
                                                                                            if (var35_22 != null) break block172;
                                                                                        }
                                                                                        catch (gj v56) {
                                                                                            throw x44.a("s", (Object)v56, (long)-2084989260598707473L, (long)var2_2);
                                                                                        }
                                                                                        if (v55 == 0) break block173;
                                                                                    }
                                                                                    catch (gj v57) {
                                                                                        throw x44.a("s", (Object)v57, (long)-2084989260598707473L, (long)var2_2);
                                                                                    }
                                                                                    var50_43.add(var52_47);
                                                                                }
                                                                                catch (gj v58) {
                                                                                    throw x44.a("s", (Object)v58, (long)-2084989260598707473L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            ++var51_45;
                                                                        }
                                                                        v54 = var35_22;
                                                                    }
                                                                    if (v54 == null) continue block118;
                                                                    x44.a("p", (Object)this, var50_43, (long)-2240727868184877052L, (long)var2_2);
                                                                    v53 = x44.a("o", (Object)this, (long)-191630988386227193L, (long)var2_2);
                                                                } while (var2_2 <= 0L);
                                                            }
                                                            v55 = v53.size();
                                                        }
                                                        var36_19 = v55;
                                                        var51_46 = new ArrayList<ms>(var36_19);
                                                        var52_48 = 0;
                                                        block120: while (var52_48 < var36_19) {
                                                            v59 = x44.a("o", (Object)this, (long)-191630988386227193L, (long)var2_2).get(var52_48);
                                                            do {
                                                                block174: {
                                                                    block175: {
                                                                        block177: {
                                                                            var53_50 = (ms)v59;
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v60 = var35_22;
                                                                                        if (var2_2 <= 0L) break block174;
                                                                                        if (v60 != null) break block175;
                                                                                        v61 = (int)var48_40.contains(var53_50);
                                                                                        if (var35_22 != null) break block176;
                                                                                    }
                                                                                    catch (gj v62) {
                                                                                        throw x44.a("s", (Object)v62, (long)-2084989260598707473L, (long)var2_2);
                                                                                    }
                                                                                    if (v61 == 0) break block177;
                                                                                }
                                                                                catch (gj v63) {
                                                                                    throw x44.a("s", (Object)v63, (long)-2084989260598707473L, (long)var2_2);
                                                                                }
                                                                                var51_46.add(var53_50);
                                                                            }
                                                                            catch (gj v64) {
                                                                                throw x44.a("s", (Object)v64, (long)-2084989260598707473L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        ++var52_48;
                                                                    }
                                                                    v60 = var35_22;
                                                                }
                                                                if (v60 == null) continue block120;
                                                                x44.a("p", (Object)this, var51_46, (long)-191630988386227193L, (long)var2_2);
                                                                v59 = x44.a("o", (Object)this, (long)-41815090450425608L, (long)var2_2);
                                                            } while (var2_2 <= 0L);
                                                        }
                                                        v61 = v59.size();
                                                    }
                                                    var36_19 = v61;
                                                    var52_49 = new ArrayList<xv>(var36_19);
                                                    var53_51 = 0;
                                                    block122: while (var53_51 < var36_19) {
                                                        v65 = x44.a("o", (Object)this, (long)-41815090450425608L, (long)var2_2).get(var53_51);
                                                        do {
                                                            block178: {
                                                                block179: {
                                                                    block181: {
                                                                        var54_53 = (xv)v65;
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v66 = var35_22;
                                                                                    if (var2_2 <= 0L) break block178;
                                                                                    if (v66 != null) break block179;
                                                                                    v67 = (int)var48_40.contains(var54_53);
                                                                                    if (var35_22 != null) break block180;
                                                                                }
                                                                                catch (gj v68) {
                                                                                    throw x44.a("s", (Object)v68, (long)-2084989260598707473L, (long)var2_2);
                                                                                }
                                                                                if (v67 == 0) break block181;
                                                                            }
                                                                            catch (gj v69) {
                                                                                throw x44.a("s", (Object)v69, (long)-2084989260598707473L, (long)var2_2);
                                                                            }
                                                                            var52_49.add(var54_53);
                                                                        }
                                                                        catch (gj v70) {
                                                                            throw x44.a("s", (Object)v70, (long)-2084989260598707473L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    ++var53_51;
                                                                }
                                                                v66 = var35_22;
                                                            }
                                                            if (v66 == null) continue block122;
                                                            x44.a("p", (Object)this, var52_49, (long)-41815090450425608L, (long)var2_2);
                                                            v65 = x44.a("o", (Object)this, (long)-192310897467518580L, (long)var2_2);
                                                        } while (var2_2 <= 0L);
                                                    }
                                                    v67 = v65.size();
                                                }
                                                var36_19 = v67;
                                                var53_52 = new ArrayList<Object>(var36_19);
                                                var54_54 = 0;
                                                block124: while (var54_54 < var36_19) {
                                                    v71 = x44.a("o", (Object)this, (long)-192310897467518580L, (long)var2_2).get(var54_54);
                                                    do {
                                                        block182: {
                                                            block183: {
                                                                block186: {
                                                                    var55_56 = (xh)v71;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v72 = var35_22;
                                                                                if (var2_2 <= 0L) break block182;
                                                                                if (v72 != null) break block183;
                                                                                v73 = var48_40;
                                                                                if (var2_2 <= 0L) break block184;
                                                                                v74 = (int)v73.contains(var55_56);
                                                                                if (var35_22 != null) break block185;
                                                                            }
                                                                            catch (gj v75) {
                                                                                throw x44.a("s", (Object)v75, (long)-2084989260598707473L, (long)var2_2);
                                                                            }
                                                                            if (v74 == 0) break block186;
                                                                        }
                                                                        catch (gj v76) {
                                                                            throw x44.a("s", (Object)v76, (long)-2084989260598707473L, (long)var2_2);
                                                                        }
                                                                        var53_52.add(var55_56);
                                                                    }
                                                                    catch (gj v77) {
                                                                        throw x44.a("s", (Object)v77, (long)-2084989260598707473L, (long)var2_2);
                                                                    }
                                                                }
                                                                ++var54_54;
                                                            }
                                                            v72 = var35_22;
                                                        }
                                                        if (v72 == null) continue block124;
                                                        x44.a("p", (Object)this, var53_52, (long)-192310897467518580L, (long)var2_2);
                                                        v71 = x44.a("o", (Object)this, (long)-98792023486203594L, (long)var2_2);
                                                    } while (var2_2 <= 0L);
                                                }
                                                v74 = v71.size();
                                            }
                                            var36_19 = v74;
                                            v78 = new Object[1];
                                            v78[0] = var9_6;
                                            v73 = x44.a("k", (Object)var4_3, (Object)v78, (long)-553896828653310484L, (long)var2_2);
                                        }
                                        var54_55 = v73;
                                        var55_56 = new ArrayList<E>(var36_19);
                                        var56_57 = 0;
                                        block126: while (var56_57 < var36_19) {
                                            v79 = x44.a("o", (Object)this, (long)-98792023486203594L, (long)var2_2).get(var56_57);
                                            do {
                                                block187: {
                                                    block188: {
                                                        block191: {
                                                            var57_59 = (x2)v79;
                                                            try {
                                                                try {
                                                                    try {
                                                                        v80 = var35_22;
                                                                        if (var2_2 < 0L) break block187;
                                                                        if (v80 != null) break block188;
                                                                        v81 = var54_55;
                                                                        if (var2_2 <= 0L) break block189;
                                                                        v82 = (int)v81.contains(var57_59);
                                                                        if (var35_22 != null) break block190;
                                                                    }
                                                                    catch (gj v83) {
                                                                        throw x44.a("s", (Object)v83, (long)-2084989260598707473L, (long)var2_2);
                                                                    }
                                                                    if (v82 == 0) break block191;
                                                                }
                                                                catch (gj v84) {
                                                                    throw x44.a("s", (Object)v84, (long)-2084989260598707473L, (long)var2_2);
                                                                }
                                                                var55_56.add(var57_59);
                                                            }
                                                            catch (gj v85) {
                                                                throw x44.a("s", (Object)v85, (long)-2084989260598707473L, (long)var2_2);
                                                            }
                                                        }
                                                        ++var56_57;
                                                    }
                                                    v80 = var35_22;
                                                }
                                                if (v80 == null) continue block126;
                                                x44.a("p", (Object)this, (ArrayList)var55_56, (long)-98792023486203594L, (long)var2_2);
                                                v79 = x44.a("o", (Object)this, (long)-2223202841036417145L, (long)var2_2);
                                            } while (var2_2 <= 0L);
                                        }
                                        v82 = v79.size();
                                    }
                                    var36_19 = v82;
                                    v86 = new Object[1];
                                    v86[0] = var25_14;
                                    v81 = x44.a("k", (Object)var4_3, (Object)v86, (long)-375947757742213357L, (long)var2_2);
                                }
                                var56_58 = v81;
                                var57_59 = new ArrayList<E>(var36_19);
                                var58_60 = 0;
                                block128: while (var58_60 < var36_19) {
                                    v87 = x44.a("o", (Object)this, (long)-2223202841036417145L, (long)var2_2).get(var58_60);
                                    do {
                                        block192: {
                                            block193: {
                                                block196: {
                                                    var59_62 = (x4)v87;
                                                    try {
                                                        try {
                                                            try {
                                                                v88 = var35_22;
                                                                if (var2_2 < 0L) break block192;
                                                                if (v88 != null) break block193;
                                                                v89 = var56_58;
                                                                if (var2_2 <= 0L) break block194;
                                                                v90 = (int)v89.contains(var59_62);
                                                                if (var35_22 != null) break block195;
                                                            }
                                                            catch (gj v91) {
                                                                throw x44.a("s", (Object)v91, (long)-2084989260598707473L, (long)var2_2);
                                                            }
                                                            if (v90 == 0) break block196;
                                                        }
                                                        catch (gj v92) {
                                                            throw x44.a("s", (Object)v92, (long)-2084989260598707473L, (long)var2_2);
                                                        }
                                                        var57_59.add(var59_62);
                                                    }
                                                    catch (gj v93) {
                                                        throw x44.a("s", (Object)v93, (long)-2084989260598707473L, (long)var2_2);
                                                    }
                                                }
                                                ++var58_60;
                                            }
                                            v88 = var35_22;
                                        }
                                        if (v88 == null) continue block128;
                                        x44.a("p", (Object)this, (ArrayList)var57_59, (long)-2223202841036417145L, (long)var2_2);
                                        v87 = x44.a("o", (Object)this, (long)-24903705723851897L, (long)var2_2);
                                    } while (var2_2 < 0L);
                                }
                                v90 = v87.size();
                            }
                            var36_19 = v90;
                            v94 = new Object[1];
                            v94[0] = var33_18;
                            v89 = x44.a("k", (Object)var4_3, (Object)v94, (long)-1810121968878932269L, (long)var2_2);
                        }
                        var58_61 = v89;
                        var59_62 = new ArrayList<E>(var36_19);
                        var60_63 = 0;
                        block130: while (var60_63 < var36_19) {
                            v95 = x44.a("o", (Object)this, (long)-24903705723851897L, (long)var2_2).get(var60_63);
                            do {
                                block197: {
                                    block198: {
                                        block201: {
                                            var61_65 = (xb)v95;
                                            try {
                                                try {
                                                    try {
                                                        v96 = var35_22;
                                                        if (var2_2 <= 0L) break block197;
                                                        if (v96 != null) break block198;
                                                        v97 = var58_61;
                                                        if (var2_2 <= 0L) break block199;
                                                        v98 = (int)v97.contains(var61_65);
                                                        if (var35_22 != null) break block200;
                                                    }
                                                    catch (gj v99) {
                                                        throw x44.a("s", (Object)v99, (long)-2084989260598707473L, (long)var2_2);
                                                    }
                                                    if (v98 == 0) break block201;
                                                }
                                                catch (gj v100) {
                                                    throw x44.a("s", (Object)v100, (long)-2084989260598707473L, (long)var2_2);
                                                }
                                                var59_62.add(var61_65);
                                            }
                                            catch (gj v101) {
                                                throw x44.a("s", (Object)v101, (long)-2084989260598707473L, (long)var2_2);
                                            }
                                        }
                                        ++var60_63;
                                    }
                                    v96 = var35_22;
                                }
                                if (v96 == null) continue block130;
                                x44.a("p", (Object)this, (ArrayList)var59_62, (long)-24903705723851897L, (long)var2_2);
                                v95 = x44.a("o", (Object)this, (long)-256129544315074258L, (long)var2_2);
                            } while (var2_2 <= 0L);
                        }
                        v98 = v95.size();
                    }
                    var36_19 = v98;
                    v102 = new Object[1];
                    v102[0] = var23_13;
                    v97 = x44.a("k", (Object)var4_3, (Object)v102, (long)-106509936656350601L, (long)var2_2);
                }
                var60_64 = v97;
                var61_65 = new ArrayList<E>(var36_19);
                var62_66 = 0;
                block132: while (var62_66 < var36_19) {
                    v103 /* !! */  = x44.a("o", (Object)this, (long)-256129544315074258L, (long)var2_2).get(var62_66);
                    do {
                        block202: {
                            block203: {
                                block205: {
                                    var63_67 = (x_)v103 /* !! */ ;
                                    try {
                                        try {
                                            try {
                                                v104 = var35_22;
                                                if (var2_2 <= 0L) break block202;
                                                if (v104 != null) break block203;
                                                v105 = (int)var60_64.contains(var63_67);
                                                if (var35_22 != null) break block204;
                                            }
                                            catch (gj v106) {
                                                throw x44.a("s", (Object)v106, (long)-2084989260598707473L, (long)var2_2);
                                            }
                                            if (v105 == 0) break block205;
                                        }
                                        catch (gj v107) {
                                            throw x44.a("s", (Object)v107, (long)-2084989260598707473L, (long)var2_2);
                                        }
                                        var61_65.add(var63_67);
                                    }
                                    catch (gj v108) {
                                        throw x44.a("s", (Object)v108, (long)-2084989260598707473L, (long)var2_2);
                                    }
                                }
                                ++var62_66;
                            }
                            v104 = var35_22;
                        }
                        if (v104 == null) continue block132;
                        x44.a("p", (Object)this, (ArrayList)var61_65, (long)-256129544315074258L, (long)var2_2);
                        v103 /* !! */  = this.z;
                    } while (var2_2 <= 0L);
                }
                v105 = ((E)v103 /* !! */ ).length;
            }
            var62_66 = v105;
            var63_67 = new ArrayList<E>(var36_19);
            var64_68 = 0;
            while (var64_68 < var62_66) {
                block210: {
                    block211: {
                        block209: {
                            block207: {
                                var65_69 = this.z[var64_68];
                                try {
                                    block208: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var35_22 != null) break block206;
                                                        v109 = var65_69 instanceof mg;
                                                        if (var2_2 < 0L || var35_22 != null) break block207;
                                                    }
                                                    catch (gj v110) {
                                                        throw x44.a("s", (Object)v110, (long)-2084989260598707473L, (long)var2_2);
                                                    }
                                                    if (var2_2 <= 0L) break block207;
                                                    if (v109) break block208;
                                                }
                                                catch (gj v111) {
                                                    throw x44.a("s", (Object)v111, (long)-2084989260598707473L, (long)var2_2);
                                                }
                                                v112 = (int)var4_3.l(var21_12, var65_69);
                                                if (var2_2 <= 0L || var35_22 != null) break block209;
                                            }
                                            catch (gj v113) {
                                                throw x44.a("s", (Object)v113, (long)-2084989260598707473L, (long)var2_2);
                                            }
                                            if (var2_2 < 0L) break block209;
                                            if (v112 != 0) {
                                            }
                                            ** GOTO lbl711
                                        }
                                        catch (gj v114) {
                                            throw x44.a("s", (Object)v114, (long)-2084989260598707473L, (long)var2_2);
                                        }
                                    }
                                    v109 = var63_67.add(var65_69);
                                }
                                catch (gj v115) {
                                    throw x44.a("s", (Object)v115, (long)-2084989260598707473L, (long)var2_2);
                                }
                            }
                            try {
                                v116 = var35_22;
                                if (var2_2 <= 0L) break block210;
                                if (v116 == null) break block211;
lbl711:
                                // 2 sources

                                v112 = var65_69.o(var29_16);
                            }
                            catch (gj v117) {
                                throw x44.a("s", (Object)v117, (long)-2084989260598707473L, (long)var2_2);
                            }
                        }
                        try {
                            if (v112 == 2) {
                                ++var64_68;
                            }
                        }
                        catch (gj v118) {
                            throw x44.a("s", (Object)v118, (long)-2084989260598707473L, (long)var2_2);
                        }
                    }
                    ++var64_68;
                    v116 = var35_22;
                }
                if (v116 == null) continue;
            }
            this.z = var63_67.toArray(new xl[var63_67.size()]);
            v119 = new Object[1];
            v119[0] = var13_8;
            x44.a("k", (Object)this, (Object)v119, (long)-2103880960687356425L, (long)var2_2);
            x44.a("p", (Object)this, (int)this.z.length, (long)-1804340995245289154L, (long)var2_2);
            if (var2_2 > 0L) {
                // empty if block
            }
        }
    }

    public mz y(Object[] objectArray) {
        String string;
        _8c _8c2;
        int n;
        int n2;
        int n3;
        long l;
        int n4;
        int n5;
        int n6;
        _ug _ug2;
        _yv _yv2;
        List list;
        String string2;
        String string3;
        long l2;
        block13: {
            String string4;
            block12: {
                Object object;
                Object object2;
                block10: {
                    CallSite callSite;
                    long l3;
                    block11: {
                        string4 = (String)objectArray[0];
                        l2 = (Long)objectArray[1];
                        string3 = (String)objectArray[2];
                        string2 = (String)objectArray[3];
                        list = (List)objectArray[4];
                        _yv2 = (_yv)objectArray[5];
                        _ug2 = (_ug)objectArray[6];
                        long l4 = l2 = f ^ l2;
                        long l5 = l4 ^ 0x4ED406443654L;
                        n6 = (int)(l5 >>> 32);
                        n5 = (int)(l5 << 32 >>> 40);
                        n4 = (int)(l5 << 56 >>> 56);
                        long l6 = l4 ^ 0x7A001D5E2222L;
                        l = l4 ^ 0x17F379EECB87L;
                        long l7 = l4 ^ 0x27499CB9561BL;
                        n3 = (int)(l7 >>> 48);
                        n2 = (int)(l7 << 16 >>> 48);
                        n = (int)(l7 << 32 >>> 32);
                        l3 = l4 ^ 0x2ED0A268FD0FL;
                        Object[] objectArray2 = new Object[4];
                        objectArray2[3] = l6;
                        objectArray2[2] = string2;
                        objectArray2[1] = string3;
                        objectArray2[0] = string4;
                        object2 = x44.a("i", (Object)this, (Object)objectArray2, (long)8414915120276069087L, (long)l2);
                        callSite = x44.a("q", (long)8232440303857702878L, (long)l2);
                        try {
                            try {
                                object = object2;
                                if (callSite != null) break block10;
                                if (object == null) break block11;
                            }
                            catch (gj gj2) {
                                throw x44.a("q", (Object)gj2, (long)8055491263479936565L, (long)l2);
                            }
                            return object2;
                        }
                        catch (gj gj3) {
                            throw x44.a("q", (Object)gj3, (long)8055491263479936565L, (long)l2);
                        }
                    }
                    _8c2 = this;
                    string = string4;
                    if (callSite != null) break block13;
                    object = object2 = (mz)_8c2.R(string, string3, string2, list, l3);
                }
                try {
                    if (l2 >= 0L) {
                        if (object == null) break block12;
                        object = object2;
                    }
                    return object;
                }
                catch (gj gj4) {
                    throw x44.a("q", (Object)gj4, (long)8055491263479936565L, (long)l2);
                }
            }
            _8c2 = this;
            string = string4;
        }
        List list2 = list;
        String string5 = string;
        x7 x72 = _8c2.a(n6, n5, string5, list2, (byte)n4);
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = l;
        objectArray3[2] = list;
        objectArray3[1] = string2;
        objectArray3[0] = string3;
        CallSite callSite = x44.a("i", (Object)this, (Object)objectArray3, (long)7816466879487890246L, (long)l2);
        mz mz2 = new mz(0, (char)n3, this, x72, (mn)((Object)callSite), (short)n2, _yv2, _ug2, n);
        list.add(mz2);
        return mz2;
    }

    @Override
    public void R(Object[] objectArray) {
        block8: {
            String string = (String)objectArray[0];
            long l = (Long)objectArray[1];
            long l2 = l;
            long l3 = l2 ^ 0x387E0A3FD9AEL;
            long l4 = l2 ^ 0x642A51F868E4L;
            long l5 = l2 ^ 0x2CFBCD570340L;
            long l6 = l2 ^ 0x6AD0BEE7CADBL;
            long l7 = l2 ^ 0x286007909305L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l3;
            CallSite callSite = x44.a("m", (Object)this, (Object)objectArray2, (long)-2277640860869400443L, (long)l);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l5;
            objectArray3[0] = sh.Q(x44.a("i", (Object)this, (long)-2293642373823751877L, (long)l).size(), l6);
            CallSite callSite2 = x44.a("u", (Object)objectArray3, (long)-197108498558027024L, (long)l);
            Iterator iterator = this.a.iterator();
            CallSite callSite3 = x44.a("u", (long)-98024982863111358L, (long)l);
            while (iterator.hasNext()) {
                block9: {
                    Object object;
                    x7 x72;
                    block10: {
                        x72 = (x7)iterator.next();
                        try {
                            try {
                                try {
                                    if (callSite3 != null) break block8;
                                    object = x72.W(l4);
                                    if (callSite3 != null) break block9;
                                }
                                catch (gj gj2) {
                                    throw x44.a("u", (Object)gj2, (long)-2065212118186886487L, (long)l);
                                }
                                if (!((String)object).equals(callSite)) break block10;
                            }
                            catch (gj gj3) {
                                throw x44.a("u", (Object)gj3, (long)-2065212118186886487L, (long)l);
                            }
                            Object[] objectArray4 = new Object[2];
                            objectArray4[1] = l7;
                            objectArray4[0] = string;
                            x44.a("m", (Object)x72, (Object)objectArray4, (long)-1887873792827620705L, (long)l);
                        }
                        catch (gj gj4) {
                            throw x44.a("u", (Object)gj4, (long)-2065212118186886487L, (long)l);
                        }
                    }
                    object = ((HashMap)((Object)callSite2)).put(x72.W(l4), x72);
                }
                if (callSite3 == null) continue;
            }
            x44.a("v", (Object)this, (Map)((Object)callSite2), (long)-2293642373823751877L, (long)l);
            if (l > 0L) {
                // empty if block
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void x(Object[] var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    public void O(Object[] var1_1) {
        var4_2 = (lh)var1_1[0];
        var2_3 = (Long)var1_1[1];
        v0 = var2_3 = _8c.f ^ var2_3;
        var5_4 = v0 ^ 55828656223767L;
        var7_5 = v0 ^ 16584680603611L;
        var9_6 = v0 ^ 89642295506773L;
        var11_7 = v0 ^ 113104836445394L;
        var14_8 = this.c.k(var5_4);
        var15_9 = this.a.size();
        var13_11 = x44.a("r", (long)7610192710528535677L, (long)var2_3);
        for (var16_10 = 0; var16_10 < var15_9; ++var16_10) {
            block16: {
                block15: {
                    block14: {
                        var17_12 = (x7)this.a.get(var16_10);
                        var18_13 = var17_12.W(var7_5);
                        try {
                            try {
                                v1 = var18_13;
                                if (var13_11 != null) break block14;
                                if (!v1.startsWith("[")) break block15;
                            }
                            catch (gj v2) {
                                throw x44.a("r", (Object)v2, (long)8388393810109263254L, (long)var2_3);
                            }
                            v3 = new Object[2];
                            v3[1] = var11_7;
                            v3[0] = var18_13;
                            v1 = x44.a("r", (Object)v3, (long)8254877945486507327L, (long)var2_3);
                        }
                        catch (gj v4) {
                            throw x44.a("r", (Object)v4, (long)8388393810109263254L, (long)var2_3);
                        }
                    }
                    var18_13 = v1;
                }
                var19_14 = null;
                try {
                    v5 = var18_13;
                    v6 = var13_11;
                    if (var2_3 >= 0L) {
                        if (v6 != null) break block16;
                        if (v5 == null) continue;
                    }
                    ** GOTO lbl51
                }
                catch (gj v7) {
                    throw x44.a("r", (Object)v7, (long)8388393810109263254L, (long)var2_3);
                }
                v5 = var18_13;
            }
            try {
                try {
                    v6 = var13_11;
lbl51:
                    // 2 sources

                    if (v6 != null) ** GOTO lbl60
                    if (v5.equals(var14_8)) continue;
                }
                catch (gj v8) {
                    throw x44.a("r", (Object)v8, (long)8388393810109263254L, (long)var2_3);
                }
                v5 = var18_13;
            }
            catch (gj v9) {
                throw x44.a("r", (Object)v9, (long)8388393810109263254L, (long)var2_3);
            }
lbl60:
            // 2 sources

            var19_14 = yn.Z(var9_6, v5);
            try {
                if (var19_14 == null) continue;
                x44.a("j", (Object)var4_2, (Object)var19_14, (long)7541032249625791429L, (long)var2_3);
                continue;
            }
            catch (gj v10) {
                throw x44.a("r", (Object)v10, (long)8388393810109263254L, (long)var2_3);
            }
        }
    }

    private void V(Object[] objectArray) {
        block11: {
            iu iu2;
            long l;
            long l2;
            _zk _zk2;
            HashMap hashMap;
            Set set;
            long l3;
            block12: {
                Object[] objectArray2;
                long l4;
                iu iu3;
                block10: {
                    iu3 = (iu)objectArray[0];
                    l3 = (Long)objectArray[1];
                    set = (Set)objectArray[2];
                    hashMap = (HashMap)objectArray[3];
                    _zk2 = (_zk)objectArray[4];
                    long l5 = l3 = f ^ l3;
                    l4 = l5 ^ 0x661AFED9D7DAL;
                    l2 = l5 ^ 0x3982EAC974E5L;
                    l = l5 ^ 0x4012DBD14EBDL;
                    objectArray2 = x44.a("w", (long)-4858832453919778448L, (long)l3);
                    try {
                        iu2 = iu3;
                        if (objectArray2 != null) break block10;
                        if (iu2 == null) break block11;
                    }
                    catch (gj gj2) {
                        throw x44.a("w", (Object)gj2, (long)-6817130519595108197L, (long)l3);
                    }
                    iu2 = iu3;
                }
                try {
                    try {
                        Object[] objectArray3 = objectArray2;
                        if (l3 > 0L) {
                            if (objectArray3 != null) break block12;
                            Object[] objectArray4 = new Object[1];
                            objectArray3 = objectArray4;
                            objectArray4[0] = l4;
                        }
                        if (x44.a("o", (Object)iu2, (Object)objectArray3, (long)-6388186316591384010L, (long)l3) == false) break block11;
                    }
                    catch (gj gj3) {
                        throw x44.a("w", (Object)gj3, (long)-6817130519595108197L, (long)l3);
                    }
                    iu2 = iu3;
                }
                catch (gj gj4) {
                    throw x44.a("w", (Object)gj4, (long)-6817130519595108197L, (long)l3);
                }
            }
            hu hu2 = (hu)iu2.d(l2);
            try {
                if (l3 > 0L && set.add(hu2)) {
                    Object[] objectArray5 = new Object[3];
                    objectArray5[2] = _zk2;
                    objectArray5[1] = l;
                    objectArray5[0] = hashMap;
                    x44.a("o", (Object)hu2, (Object)objectArray5, (long)-5010544225076249670L, (long)l3);
                }
            }
            catch (gj gj5) {
                throw x44.a("w", (Object)gj5, (long)-6817130519595108197L, (long)l3);
            }
        }
    }

    public void l(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = (l2 = f ^ l2) ^ 0x7A385EB21648L;
                CallSite callSite2 = x44.a("r", (long)-1516319109617578219L, (long)l2);
                try {
                    try {
                        callSite = x44.a("n", (Object)this, (long)-777838371265543274L, (long)l2);
                        if (callSite2 != null) break block4;
                        if (((ArrayList)((Object)callSite)).size() <= 0) break block5;
                    }
                    catch (gj gj2) {
                        throw x44.a("r", (Object)gj2, (long)-648050484247236866L, (long)l2);
                    }
                    callSite = ((ArrayList)((Object)x44.a("n", (Object)this, (long)-777838371265543274L, (long)l2))).get(0);
                }
                catch (gj gj3) {
                    throw x44.a("r", (Object)gj3, (long)-648050484247236866L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            x44.a("j", (Object)((x4)((Object)callSite)), (Object)objectArray2, (long)-1594806968092110525L, (long)l2);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    block19: {
                        _8c.f = ess.a(5206955435899553159L, 254585892895093151L, MethodHandles.lookup().lookupClass()).a(185724149128575L);
                        var20 = _8c.f ^ 106319314758934L;
                        var22_1 = var20 ^ 68747526146697L;
                        _8c.i = new HashMap<K, V>(13);
                        var11_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_3 = 1; var12_3 < 8; ++var12_3) {
                            v2 = v2;
                            v2[var12_3] = (byte)(var20 << var12_3 * 8 >>> 56);
                        }
                        var11_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_4 = new String[29];
                        var16_5 = 0;
                        var15_6 = "\u009cC\u00ab\u00fb\u00bf\u00ed\u00f6_\n\u00f6\u0086\u0012\u00b4\fP\u00d5\u00a7\u00cf0\u001f\u0016}\u0003}v70\u008b\u00cf\u0001L\u00ac\u00f0\u0082\u0099\\K&\u00bd\u009b.6\u00d4\u00d0\u001dl\u00c9)\u0010\u000f\u00de\u00e1\u00b4\u001f\u00a73\u0084=Xs\\\u00aa\u0007\u00b5\u00c9\u0010-\u00cd\u00d5\u00f1\u00a3]\u0080\u0095\u00a0\u007f\u0088;\f#\u00b3\u00c3 \u0002\u00e4%wR\u00da]%'/\u000b\u00c7\u0001\u009a\u0003\"I\u00a3\u0098\u00fd\u00b2\u00d0\u00bf\u00bc>\u00c972\u00bbW\u009f\u0091(\u00c7m8dC\u00bf\u00ec\u0013\u0002r\u00ba\u00bd\u00b6\u00f8\u00cc1\u00f0\u009dM\u00fe0I\u0086\u0082\u00e4\u00c5d2\u00c9\u00d3R/^\u00cb\u0094\u009e\u00ba,M\\(\u0091\u00df\u00b6\u00aa\u00b2PZ\\\u00bb\u0095\u00fe\u00f4\u001dQJX\u00b6\u00c2\u0098\u000f\u0096\u008e\u00d6\u00a7\u00fe\u0014\u00c5)K\u00ef+\u009d\u00ac\\h\u00db!\u00ab\u00b0\u0097HRF\n0/v\u00ac\u0002\u00e6\u00d9\u00e0\u00f2a\u00a2p\u00b9\u0094w\u00c1?\u00b8\u00db\u0012O\u00c9\u000bs\u001eUon\u00c3\u0092\u0011\u00cc\u00a7\u0091\u00e1Q\u00ef\u009b\u00fd\u00c6\u00bb~\u00b1\u0097\u0011\fd\u00d0\u0091\u001cBp\u00f4\u000f\u009eg\u00f5\u0096\u0082\u00ad\u00c3e/C\n\u00d2D\u00ec\u00df\u0010\u00e8K\u00af)\u0097\u0090\u00e5\u00e0\u00a9`\u00b1\u0087Y\u00b4 t\u0010)@$?Bg/#\u0014\u00e3\u0099\u00a9\u00f5\u001adePk\u00c4\u00d8\u00c4{\u0085mU\"\u00d6\u00a19\u0005\u00f4t`9\b\u00f3\u00109\u0002\u001e\u00c4\u008d\u0019\u00c2n\u00e5\f\u00b3_\u00a4GN[\u0080o\u00c5\u00c8'J\u00d1\u00dfN\u001c(\u000e\u00d0\u00d6\u00e5\u0016\"\u00e4z\u001f\u0005c\u00e2\u0082\u00f1\u00efZ\u0099\b(E\u00c7\u00d4:\r\u00b8\u008c\u0094\u0007jy\u00cd\u00bb\u000f\u00102\u0010@\u0010\u00caxq\u0012\u000f\u008a\u00df\u00ef\u00ca\r\u00a6\u0085\u0018\u00a3\u0080\u0016SG\u0094`\u00bcW\u0094}#d8\u0002\u0080\u00c6j2\u00d8\u00bf\u00d9\u0083\u00cdp\u008cNL\u00a5\u00bd\u0007\u000b\u00e6_\u00a3V\u00ca\u00b6\u0090c\u0090\u0095\u00ab\u0083\u00ff%W\u00d7D\u00ebi\u001a=\u00b6\u00b7\u00ba\\\u00e4CGCt^7\u00bdQ\\%Yy\u0010\u00b2\u00dd\u0018\u0082\u009d\u00f9IL<9o\u00f6\u00f4\u00b7\u0014\u00e8\u00af\u00cc3g\u001bF\u00a0\u0005\u0085/\u00f7\u00aef\u00bdz\u00d3=M\u00b7\u00a1\u00e4.\u008a\u00ca\u00f5:Pf\u007f\u00b8\u009a\u001f\u00cb\u0012\u00eb\u00ae\u00f9\u00ff\u00a5z\u00b3.\u00ac\u00fe)\u00adX\u0082BH(\u0096r\u001c\u00fd\u00c6\u00bf\u00df\u00fc\u00911\u00a0\u00ee\u00c8\u00e5\u00fb\u00d6\u00b2\u00f2\u00dc\u007f\u00e9:(\u00ad\u00e2\u00e9r\t\u00cb+\u00a11L-o\u00d3\u00b9\u0098\u0019\u009c\u0010[\u009a\u0000\u00e0/\u00a5\u00d3\u008b\u00c6v\u00f08\u0006\u0087'\u0000 )_\u00a1>\u0094\u00daL\u00c1\u0089o{\u00fe\u001c/tz:\u00c7\u00b1p\u00b1\u00b9\f\u00d6.\u001b\u00d3/\u0018\u008e\b\u00f1 \u0001$\u0085UNA2\u00f2\u00f6W\u00d7N(\t\u009a\u008b p\u00c9\u008eJ\u00bbfr\u008d2\u00e1\u000f\u00bd\u009b\u00d9\u0096\u0018\u00b1Tk\u0004\u00e4\u00bbN\u00e6,\u00f7\b\u0091QC\u00b0=\u0092\u00f7M3\u00f2][\u008c(\u009e\u0089\u00ee&O=9\u00d2bz\u00bdQ\u00f17=\u00bbl\u008d_{g\u0083dU\u00e8\u009co\u00fe\u00d3\u00c6\u0080\u00f4\u0087\u00bf{\u00ea\n\u00c6;\u000e\u0018\u00c4\f\u00ec\u00dc\u0012\u000e\u00bc\u00ccP\u00be\u000e&%j\u00a4]\"wy\u00a8\u00b3\u00b6\u0015\u00898\u00b8\u00d7E\u00e7\u00bb\u0098\u0012\u00bd\u00a7\u00f7\u008f\u000b\u00fd\u008d\u00e0W\u00c2\t\u00c1\u00f6\n\u009e\u00d0]\u00a8\u0004\u00fb\u00e0\u00eb\u001e\u008c\u00d9\u00cf\u00c2\u001ciz!\u00d9\u008b\u00ff\u00b5\u0000\u00d5\u0003$g#mL\u00f5\u00e7\u009b\na|x\u00de\u008b\u00ben?LLh/\u00d3mm\u0092\u00f0A\u00c0\u00bd\u00c1\u0012\u0004\u00be\u00bc\u00c1\u0002\u0083p\r\u00db\u00a2P\u00c4\u00a2\u00acPp\u000f\u0099\u0090&n\u00c0\u00a8T\u00e9Y\u00df\u0098\u008b\u007f\u00d5N\u0087N\u009ej\u00ee\u00a85\u0014\u0098\u001f6\u00dd\u00fd\u000eaEN\u00de7N\u00e8\u00a3B\u0089<\u00f4\u00b1M\u00f4\u001e\u00ef\u00ca\u008d\u00c5\u0083\u0014\u00eb\u0097~\u0012\u008a<\u0090]4o\u00b8\u00cd\u00a3\u00e1\u0095\u00b3\u009f%\u00a0+4\u00bb\u00e3\u00e0q\u00a0\u00cd\u00a6\bz\u008b\u000b\u0096\u0010\"z\u00b43+*fd$\u00f5\u00a5\u00b99\u0084\u00e53P\u00cb\u00b5\u00b0\u00cf\u00dd#!\u00e6p\u009e\u00e1\u00d8\u00a9\u0096?\u00ec\u00b9\u0090*\u009f{[a\u00fb\u008b7\u00d3\u00a36\\p\tu\u00f6\u00c1\u00a8\u00d3@\u0091x\u00989@\u00fd\u00a7\u00b6#\u0092\u00f0\u00a2\u001f\u00b2\u00c8\u00b4\u00b3\u001an~t\u00a6\u00fc7L\u009aZ\u00fd=\u00f90k\u008c\fL\u0083\u0011\u00b4\u0004\u0080\u00c7s \u001d\u00ebi\u00ff\u0090\u00c9\u00beE\u0094\u00ea\\\u00c8\u00d9\u0084Hsp2\u0013n\u0080\u00fa\u00c6\u001f\u00e5\u00f7\u00a9V>\u00db\u0013\u00b5\u0010\u0002\u00fd|\u00c3f\u00ed\u0093\u000e\u00fd(\u00c5Rh\u00dc\u00a6\b\u0018\u0095\u00bf\u00a6)\u00d2\u00c3\u00d4r\u008f\u00a8\u0004\u00a4^\u00c6\u00ea&\u00f8\u00036\u00deh\u0019\u0003\u00b4";
                        var17_7 = "\u009cC\u00ab\u00fb\u00bf\u00ed\u00f6_\n\u00f6\u0086\u0012\u00b4\fP\u00d5\u00a7\u00cf0\u001f\u0016}\u0003}v70\u008b\u00cf\u0001L\u00ac\u00f0\u0082\u0099\\K&\u00bd\u009b.6\u00d4\u00d0\u001dl\u00c9)\u0010\u000f\u00de\u00e1\u00b4\u001f\u00a73\u0084=Xs\\\u00aa\u0007\u00b5\u00c9\u0010-\u00cd\u00d5\u00f1\u00a3]\u0080\u0095\u00a0\u007f\u0088;\f#\u00b3\u00c3 \u0002\u00e4%wR\u00da]%'/\u000b\u00c7\u0001\u009a\u0003\"I\u00a3\u0098\u00fd\u00b2\u00d0\u00bf\u00bc>\u00c972\u00bbW\u009f\u0091(\u00c7m8dC\u00bf\u00ec\u0013\u0002r\u00ba\u00bd\u00b6\u00f8\u00cc1\u00f0\u009dM\u00fe0I\u0086\u0082\u00e4\u00c5d2\u00c9\u00d3R/^\u00cb\u0094\u009e\u00ba,M\\(\u0091\u00df\u00b6\u00aa\u00b2PZ\\\u00bb\u0095\u00fe\u00f4\u001dQJX\u00b6\u00c2\u0098\u000f\u0096\u008e\u00d6\u00a7\u00fe\u0014\u00c5)K\u00ef+\u009d\u00ac\\h\u00db!\u00ab\u00b0\u0097HRF\n0/v\u00ac\u0002\u00e6\u00d9\u00e0\u00f2a\u00a2p\u00b9\u0094w\u00c1?\u00b8\u00db\u0012O\u00c9\u000bs\u001eUon\u00c3\u0092\u0011\u00cc\u00a7\u0091\u00e1Q\u00ef\u009b\u00fd\u00c6\u00bb~\u00b1\u0097\u0011\fd\u00d0\u0091\u001cBp\u00f4\u000f\u009eg\u00f5\u0096\u0082\u00ad\u00c3e/C\n\u00d2D\u00ec\u00df\u0010\u00e8K\u00af)\u0097\u0090\u00e5\u00e0\u00a9`\u00b1\u0087Y\u00b4 t\u0010)@$?Bg/#\u0014\u00e3\u0099\u00a9\u00f5\u001adePk\u00c4\u00d8\u00c4{\u0085mU\"\u00d6\u00a19\u0005\u00f4t`9\b\u00f3\u00109\u0002\u001e\u00c4\u008d\u0019\u00c2n\u00e5\f\u00b3_\u00a4GN[\u0080o\u00c5\u00c8'J\u00d1\u00dfN\u001c(\u000e\u00d0\u00d6\u00e5\u0016\"\u00e4z\u001f\u0005c\u00e2\u0082\u00f1\u00efZ\u0099\b(E\u00c7\u00d4:\r\u00b8\u008c\u0094\u0007jy\u00cd\u00bb\u000f\u00102\u0010@\u0010\u00caxq\u0012\u000f\u008a\u00df\u00ef\u00ca\r\u00a6\u0085\u0018\u00a3\u0080\u0016SG\u0094`\u00bcW\u0094}#d8\u0002\u0080\u00c6j2\u00d8\u00bf\u00d9\u0083\u00cdp\u008cNL\u00a5\u00bd\u0007\u000b\u00e6_\u00a3V\u00ca\u00b6\u0090c\u0090\u0095\u00ab\u0083\u00ff%W\u00d7D\u00ebi\u001a=\u00b6\u00b7\u00ba\\\u00e4CGCt^7\u00bdQ\\%Yy\u0010\u00b2\u00dd\u0018\u0082\u009d\u00f9IL<9o\u00f6\u00f4\u00b7\u0014\u00e8\u00af\u00cc3g\u001bF\u00a0\u0005\u0085/\u00f7\u00aef\u00bdz\u00d3=M\u00b7\u00a1\u00e4.\u008a\u00ca\u00f5:Pf\u007f\u00b8\u009a\u001f\u00cb\u0012\u00eb\u00ae\u00f9\u00ff\u00a5z\u00b3.\u00ac\u00fe)\u00adX\u0082BH(\u0096r\u001c\u00fd\u00c6\u00bf\u00df\u00fc\u00911\u00a0\u00ee\u00c8\u00e5\u00fb\u00d6\u00b2\u00f2\u00dc\u007f\u00e9:(\u00ad\u00e2\u00e9r\t\u00cb+\u00a11L-o\u00d3\u00b9\u0098\u0019\u009c\u0010[\u009a\u0000\u00e0/\u00a5\u00d3\u008b\u00c6v\u00f08\u0006\u0087'\u0000 )_\u00a1>\u0094\u00daL\u00c1\u0089o{\u00fe\u001c/tz:\u00c7\u00b1p\u00b1\u00b9\f\u00d6.\u001b\u00d3/\u0018\u008e\b\u00f1 \u0001$\u0085UNA2\u00f2\u00f6W\u00d7N(\t\u009a\u008b p\u00c9\u008eJ\u00bbfr\u008d2\u00e1\u000f\u00bd\u009b\u00d9\u0096\u0018\u00b1Tk\u0004\u00e4\u00bbN\u00e6,\u00f7\b\u0091QC\u00b0=\u0092\u00f7M3\u00f2][\u008c(\u009e\u0089\u00ee&O=9\u00d2bz\u00bdQ\u00f17=\u00bbl\u008d_{g\u0083dU\u00e8\u009co\u00fe\u00d3\u00c6\u0080\u00f4\u0087\u00bf{\u00ea\n\u00c6;\u000e\u0018\u00c4\f\u00ec\u00dc\u0012\u000e\u00bc\u00ccP\u00be\u000e&%j\u00a4]\"wy\u00a8\u00b3\u00b6\u0015\u00898\u00b8\u00d7E\u00e7\u00bb\u0098\u0012\u00bd\u00a7\u00f7\u008f\u000b\u00fd\u008d\u00e0W\u00c2\t\u00c1\u00f6\n\u009e\u00d0]\u00a8\u0004\u00fb\u00e0\u00eb\u001e\u008c\u00d9\u00cf\u00c2\u001ciz!\u00d9\u008b\u00ff\u00b5\u0000\u00d5\u0003$g#mL\u00f5\u00e7\u009b\na|x\u00de\u008b\u00ben?LLh/\u00d3mm\u0092\u00f0A\u00c0\u00bd\u00c1\u0012\u0004\u00be\u00bc\u00c1\u0002\u0083p\r\u00db\u00a2P\u00c4\u00a2\u00acPp\u000f\u0099\u0090&n\u00c0\u00a8T\u00e9Y\u00df\u0098\u008b\u007f\u00d5N\u0087N\u009ej\u00ee\u00a85\u0014\u0098\u001f6\u00dd\u00fd\u000eaEN\u00de7N\u00e8\u00a3B\u0089<\u00f4\u00b1M\u00f4\u001e\u00ef\u00ca\u008d\u00c5\u0083\u0014\u00eb\u0097~\u0012\u008a<\u0090]4o\u00b8\u00cd\u00a3\u00e1\u0095\u00b3\u009f%\u00a0+4\u00bb\u00e3\u00e0q\u00a0\u00cd\u00a6\bz\u008b\u000b\u0096\u0010\"z\u00b43+*fd$\u00f5\u00a5\u00b99\u0084\u00e53P\u00cb\u00b5\u00b0\u00cf\u00dd#!\u00e6p\u009e\u00e1\u00d8\u00a9\u0096?\u00ec\u00b9\u0090*\u009f{[a\u00fb\u008b7\u00d3\u00a36\\p\tu\u00f6\u00c1\u00a8\u00d3@\u0091x\u00989@\u00fd\u00a7\u00b6#\u0092\u00f0\u00a2\u001f\u00b2\u00c8\u00b4\u00b3\u001an~t\u00a6\u00fc7L\u009aZ\u00fd=\u00f90k\u008c\fL\u0083\u0011\u00b4\u0004\u0080\u00c7s \u001d\u00ebi\u00ff\u0090\u00c9\u00beE\u0094\u00ea\\\u00c8\u00d9\u0084Hsp2\u0013n\u0080\u00fa\u00c6\u001f\u00e5\u00f7\u00a9V>\u00db\u0013\u00b5\u0010\u0002\u00fd|\u00c3f\u00ed\u0093\u000e\u00fd(\u00c5Rh\u00dc\u00a6\b\u0018\u0095\u00bf\u00a6)\u00d2\u00c3\u00d4r\u008f\u00a8\u0004\u00a4^\u00c6\u00ea&\u00f8\u00036\u00deh\u0019\u0003\u00b4".length();
                        var14_8 = 48;
                        var13_9 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_9;
                            v4 = var15_6.substring(v3, v3 + var14_8);
                            v5 = -1;
                            break block19;
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = _8c.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            var15_6 = "\u00fby\u00f4|?&\u00d2\u009cE>\u0011\u00d9X>]\u00aa\u0010\n\u00e6\u00ad4^w\u00f7\u00c0( \u00ec.\u008a^y\u00f0";
                            var17_7 = "\u00fby\u00f4|?&\u00d2\u009cE>\u0011\u00d9X>]\u00aa\u0010\n\u00e6\u00ad4^w\u00f7\u00c0( \u00ec.\u008a^y\u00f0".length();
                            var14_8 = 16;
                            var13_9 = -1;
lbl36:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_9;
                                v4 = var15_6.substring(v6, v6 + var14_8);
                                v5 = 0;
                                break block19;
                                break;
                            }
                            break;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = _8c.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            break block20;
                            break;
                        }
                    }
                    var19_10 = var11_2.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl53:
                        // 1 sources

                        ** continue;
                    }
                }
                _8c.g = var18_4;
                _8c.h = new String[29];
                _8c.n = new HashMap<K, V>(13);
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
                var6_13 = new long[19];
                var3_14 = 0;
                var4_15 = "cz)\u0080\u001e\u00968p\u00e3\u00b7 \u00bd\u00b1\u0000*z&\u00b3\u00fb\u009f\u00ed\u00e5c~\u00d9\u00c6\u00af\u00cf\u00de\u00e7v\u00da\f\u00b2\u00f8n\u001c8??\u00fbP\u0014\u00a2\u009e\n\u00d4^j\u00bb\u00ba\u00c6\u00cd\u00b1\u00a2Sx\u00a9wl\u00e7\\\u00e5\u00a2\u00f3\u0096T\u0000\u00a1\u00e6\u00beg\u00c7\u0006\u00dcB\b\u00ea\u001e\u00a3O\u008c\u00fc7\u00ae\u009f})\u008c\u00a9\u0016?\u00dc\u00e1\u00f4o\u00a3!\u0097\u00f6E\u00edo\u00f7Tb\u0012l\u0087O\u0099\u0012~p\u00af\u00c2C\u00bc\u0013\u0091\u00a6h\u0017ZH8\u0006\u0090\u00a5r!\u00dd\u00a4\u00d0\u00e4|";
                var5_16 = "cz)\u0080\u001e\u00968p\u00e3\u00b7 \u00bd\u00b1\u0000*z&\u00b3\u00fb\u009f\u00ed\u00e5c~\u00d9\u00c6\u00af\u00cf\u00de\u00e7v\u00da\f\u00b2\u00f8n\u001c8??\u00fbP\u0014\u00a2\u009e\n\u00d4^j\u00bb\u00ba\u00c6\u00cd\u00b1\u00a2Sx\u00a9wl\u00e7\\\u00e5\u00a2\u00f3\u0096T\u0000\u00a1\u00e6\u00beg\u00c7\u0006\u00dcB\b\u00ea\u001e\u00a3O\u008c\u00fc7\u00ae\u009f})\u008c\u00a9\u0016?\u00dc\u00e1\u00f4o\u00a3!\u0097\u00f6E\u00edo\u00f7Tb\u0012l\u0087O\u0099\u0012~p\u00af\u00c2C\u00bc\u0013\u0091\u00a6h\u0017ZH8\u0006\u0090\u00a5r!\u00dd\u00a4\u00d0\u00e4|".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v10 = var6_13;
                    v11 = var3_14++;
                    v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v13 = -1;
                    break block21;
                    break;
                }
lbl80:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "w\u00e7rg-\u00b7\u00c4\u0082\u00da\u00c1w\u00d0\u00ed%\u00a3\"";
                    var5_16 = "w\u00e7rg-\u00b7\u00c4\u0082\u00da\u00c1w\u00d0\u00ed%\u00a3\"".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v10 = var6_13;
                        v11 = var3_14++;
                        v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v13 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl93:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    break block22;
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
lbl106:
                // 1 sources

                ** continue;
            }
        }
        _8c.k = var6_13;
        _8c.l = new Integer[19];
        _8c.w = new char[]{(char)_8c.b("p", (int)15929, (long)(5309417736729405407L ^ var20)), (char)_8c.b("p", (int)1335, (long)(2901717019390876894L ^ var20)), (char)_8c.b("p", (int)17727, (long)(2274943469574970584L ^ var20))};
        v15 = new Object[2];
        v15[1] = var22_1;
        v15[0] = (int)_8c.b("p", (int)31478, (long)(5386780715939029762L ^ var20));
        _8c.F = x44.a("t", (Object)v15, (long)-825662175924456647L, (long)var20);
        v16 = new Object[2];
        v16[1] = var22_1;
        v16[0] = (int)_8c.b("p", (int)16691, (long)(411440543393601746L ^ var20));
        _8c.A = x44.a("t", (Object)v16, (long)-825662175924456647L, (long)var20);
        var24_21 = new StringBuilder();
        for (CallSite var28_25 : x44.a("m", (long)-1578307840097404943L, (long)var20)) {
            var24_21.append((char)var28_25);
        }
        var24_21.append((String)_8c.a("j", (int)32652, (long)(3748253446508888967L ^ var20)));
        var24_21.append((char)_8c.b("p", (int)19916, (long)(3846078664347604004L ^ var20)));
        _8c.m = var24_21.toString();
        x44.a("m", (long)-1483812102244435703L, (long)var20).put("B", _8c.a("j", (int)28101, (long)(8811331558356865479L ^ var20)));
        x44.a("m", (long)-1483812102244435703L, (long)var20).put("C", _8c.a("j", (int)6539, (long)(7702918931087861121L ^ var20)));
        x44.a("m", (long)-1483812102244435703L, (long)var20).put("D", _8c.a("j", (int)11037, (long)(1721575717352544030L ^ var20)));
        x44.a("m", (long)-1483812102244435703L, (long)var20).put("F", _8c.a("j", (int)14664, (long)(6715315444591461713L ^ var20)));
        x44.a("m", (long)-1483812102244435703L, (long)var20).put("I", _8c.a("j", (int)8993, (long)(8720729371125784361L ^ var20)));
        x44.a("m", (long)-1483812102244435703L, (long)var20).put("J", _8c.a("j", (int)24699, (long)(7185411582519237754L ^ var20)));
        x44.a("m", (long)-1483812102244435703L, (long)var20).put("S", _8c.a("j", (int)14716, (long)(577738158789494125L ^ var20)));
        x44.a("m", (long)-1483812102244435703L, (long)var20).put("Z", _8c.a("j", (int)8271, (long)(3490679811028065362L ^ var20)));
        x44.a("m", (long)-1041371584347229655L, (long)var20).put("B", _8c.a("j", (int)27806, (long)(1946996912282456218L ^ var20)));
        x44.a("m", (long)-1041371584347229655L, (long)var20).put("C", _8c.a("j", (int)29293, (long)(7271460447940955765L ^ var20)));
        x44.a("m", (long)-1041371584347229655L, (long)var20).put("D", _8c.a("j", (int)31997, (long)(6967686313475981555L ^ var20)));
        x44.a("m", (long)-1041371584347229655L, (long)var20).put("F", _8c.a("j", (int)8731, (long)(6060858028792782354L ^ var20)));
        x44.a("m", (long)-1041371584347229655L, (long)var20).put("I", _8c.a("j", (int)21367, (long)(1189973214413451111L ^ var20)));
        x44.a("m", (long)-1041371584347229655L, (long)var20).put("J", _8c.a("j", (int)18309, (long)(3247154252847643551L ^ var20)));
        x44.a("m", (long)-1041371584347229655L, (long)var20).put("S", _8c.a("j", (int)3496, (long)(8268518201733165499L ^ var20)));
        x44.a("m", (long)-1041371584347229655L, (long)var20).put("Z", _8c.a("j", (int)9160, (long)(611027767194460125L ^ var20)));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public synchronized void U(Object[] var1_1) {
        block50: {
            block48: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (Set)var1_1[1];
                v0 = var2_2 = _8c.f ^ var2_2;
                var5_4 = v0 ^ 105894958884446L;
                var7_5 = v0 ^ 15561561476985L;
                var10_6 = this.L.iterator();
                var9_8 = x44.a("s", (long)2030538616314231244L, (long)var2_2);
                block30: while (var10_6.hasNext()) {
                    v1 /* !! */  = var10_6.next();
                    do {
                        block45: {
                            var11_9 = (md)v1 /* !! */ ;
                            try {
                                try {
                                    v2 = var4_3.contains(var11_9);
                                    if (var9_8 == null) {
                                        if (!v2) break block45;
                                    }
                                    ** GOTO lbl34
                                }
                                catch (gj v3) {
                                    throw x44.a("s", (Object)v3, (long)133056661318834215L, (long)var2_2);
                                }
                                var10_6.remove();
                            }
                            catch (gj v4) {
                                throw x44.a("s", (Object)v4, (long)133056661318834215L, (long)var2_2);
                            }
                        }
                        if (var9_8 == null) continue block30;
                        v1 /* !! */  = this.G.iterator();
                    } while (var2_2 <= 0L);
                }
                var10_6 = v1 /* !! */ ;
                block32: while (true) {
                    v2 = var10_6.hasNext();
lbl34:
                    // 2 sources

                    if (!v2) ** GOTO lbl53
                    v5 /* !! */  = var10_6.next();
                    do {
                        block46: {
                            var11_9 = (mx)v5 /* !! */ ;
                            try {
                                try {
                                    v6 = var4_3.contains(var11_9);
                                    if (var9_8 == null) {
                                        if (!v6) break block46;
                                    }
                                    ** GOTO lbl58
                                }
                                catch (gj v7) {
                                    throw x44.a("s", (Object)v7, (long)133056661318834215L, (long)var2_2);
                                }
                                var10_6.remove();
                            }
                            catch (gj v8) {
                                throw x44.a("s", (Object)v8, (long)133056661318834215L, (long)var2_2);
                            }
                        }
                        if (var9_8 == null) continue block32;
lbl53:
                        // 2 sources

                        v5 /* !! */  = x44.a("o", (Object)this, (long)157418060543642316L, (long)var2_2).iterator();
                    } while (var2_2 <= 0L);
                    break;
                }
                var10_6 = v5 /* !! */ ;
                block34: while (true) {
                    v6 = var10_6.hasNext();
lbl58:
                    // 2 sources

                    if (!v6) ** GOTO lbl77
                    v9 /* !! */  = var10_6.next();
                    do {
                        block47: {
                            var11_9 = (mf)v9 /* !! */ ;
                            try {
                                try {
                                    v10 = var4_3.contains(var11_9);
                                    if (var9_8 == null) {
                                        if (!v10) break block47;
                                    }
                                    ** GOTO lbl82
                                }
                                catch (gj v11) {
                                    throw x44.a("s", (Object)v11, (long)133056661318834215L, (long)var2_2);
                                }
                                var10_6.remove();
                            }
                            catch (gj v12) {
                                throw x44.a("s", (Object)v12, (long)133056661318834215L, (long)var2_2);
                            }
                        }
                        if (var9_8 == null) continue block34;
lbl77:
                        // 2 sources

                        v9 /* !! */  = x44.a("o", (Object)this, (long)2278583529453571791L, (long)var2_2).iterator();
                    } while (var2_2 <= 0L);
                    break;
                }
                var10_6 = v9 /* !! */ ;
                block36: while (true) {
                    v10 = var10_6.hasNext();
lbl82:
                    // 2 sources

                    if (!v10) ** GOTO lbl100
                    v13 /* !! */  = var10_6.next();
                    do {
                        block49: {
                            var11_9 = (ms)v13 /* !! */ ;
                            try {
                                try {
                                    v14 = (int)var4_3.contains(var11_9);
                                    if (var9_8 != null) break block48;
                                    if (v14 == 0) break block49;
                                }
                                catch (gj v15) {
                                    throw x44.a("s", (Object)v15, (long)133056661318834215L, (long)var2_2);
                                }
                                var10_6.remove();
                            }
                            catch (gj v16) {
                                throw x44.a("s", (Object)v16, (long)133056661318834215L, (long)var2_2);
                            }
                        }
                        if (var9_8 == null) continue block36;
lbl100:
                        // 2 sources

                        v13 /* !! */  = this.z;
                    } while (var2_2 <= 0L);
                    break;
                }
                v14 = ((E)v13 /* !! */ ).length;
            }
            var10_7 = v14;
            var11_9 = new ArrayList<E>(var10_7);
            var12_10 = 0;
            while (var12_10 < var10_7) {
                block54: {
                    block55: {
                        block53: {
                            block51: {
                                var13_11 = this.z[var12_10];
                                try {
                                    block52: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var9_8 != null) break block50;
                                                        v17 = var13_11 instanceof mg;
                                                        if (var2_2 <= 0L || var9_8 != null) break block51;
                                                    }
                                                    catch (gj v18) {
                                                        throw x44.a("s", (Object)v18, (long)133056661318834215L, (long)var2_2);
                                                    }
                                                    if (var2_2 <= 0L) break block51;
                                                    if (v17) break block52;
                                                }
                                                catch (gj v19) {
                                                    throw x44.a("s", (Object)v19, (long)133056661318834215L, (long)var2_2);
                                                }
                                                v20 = (int)var4_3.contains(var13_11);
                                                if (var2_2 <= 0L || var9_8 != null) break block53;
                                            }
                                            catch (gj v21) {
                                                throw x44.a("s", (Object)v21, (long)133056661318834215L, (long)var2_2);
                                            }
                                            if (var2_2 < 0L) break block53;
                                            if (v20 == 0) {
                                            }
                                            ** GOTO lbl146
                                        }
                                        catch (gj v22) {
                                            throw x44.a("s", (Object)v22, (long)133056661318834215L, (long)var2_2);
                                        }
                                    }
                                    v17 = var11_9.add(var13_11);
                                }
                                catch (gj v23) {
                                    throw x44.a("s", (Object)v23, (long)133056661318834215L, (long)var2_2);
                                }
                            }
                            try {
                                v24 = var9_8;
                                if (var2_2 <= 0L) break block54;
                                if (v24 == null) break block55;
lbl146:
                                // 2 sources

                                v20 = var13_11.o(var7_5);
                            }
                            catch (gj v25) {
                                throw x44.a("s", (Object)v25, (long)133056661318834215L, (long)var2_2);
                            }
                        }
                        try {
                            if (v20 == 2) {
                                ++var12_10;
                            }
                        }
                        catch (gj v26) {
                            throw x44.a("s", (Object)v26, (long)133056661318834215L, (long)var2_2);
                        }
                    }
                    ++var12_10;
                    v24 = var9_8;
                }
                if (v24 == null) continue;
            }
            this.z = var11_9.toArray(new xl[var11_9.size()]);
            v27 = new Object[1];
            v27[0] = var5_4;
            x44.a("k", (Object)this, (Object)v27, (long)1570573606922047L, (long)var2_2);
            x44.a("p", (Object)this, (int)this.z.length, (long)305583319059280886L, (long)var2_2);
            if (var2_2 > 0L) {
                // empty if block
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void c(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[WHILELOOP]], but top level block is 19[DOLOOP]
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
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public xe[] G(Object[] objectArray) {
        xe[] xeArray;
        block38: {
            int n;
            CallSite callSite;
            xe[] xeArray2;
            long l;
            block36: {
                int n2;
                block34: {
                    block33: {
                        int n3;
                        block31: {
                            block30: {
                                int n4;
                                block28: {
                                    block27: {
                                        l = (Long)objectArray[0];
                                        l = f ^ l;
                                        int n5 = ((ArrayList)((Object)x44.a("l", (Object)this, (long)-3477798122734319777L, (long)l))).size() + ((ArrayList)((Object)x44.a("l", (Object)this, (long)-3311266914341551268L, (long)l))).size() + ((ArrayList)((Object)x44.a("l", (Object)this, (long)-3445177242172213341L, (long)l))).size() + ((ArrayList)((Object)x44.a("l", (Object)this, (long)-3310160392065368361L, (long)l))).size() + this.L.size();
                                        xeArray2 = new xe[n5];
                                        int n6 = 0;
                                        callSite = x44.a("p", (long)-3332998036755925921L, (long)l);
                                        n = 0;
                                        block18: while (n < this.L.size()) {
                                            try {
                                                xeArray2[n6++] = (xe)this.L.get(n);
                                                ++n;
                                                while (l > 0L && callSite == null) {
                                                    if (callSite == null) continue block18;
                                                    if (l < 0L) continue;
                                                    break block18;
                                                }
                                                break block27;
                                            }
                                            catch (gj gj2) {
                                                throw x44.a("p", (Object)gj2, (long)-3725719645607340620L, (long)l);
                                            }
                                        }
                                        n = 0;
                                    }
                                    try {
                                        do {
                                            try {
                                                n4 = n;
                                                if (l <= 0L) break block28;
                                                if (n4 >= ((ArrayList)((Object)x44.a("l", (Object)this, (long)-3477798122734319777L, (long)l))).size()) break;
                                                xeArray2[n6++] = (xe)((ArrayList)((Object)x44.a("l", (Object)this, (long)-3477798122734319777L, (long)l))).get(n);
                                                ++n;
                                                if (l > 0L && callSite == null) {
                                                    continue;
                                                }
                                                break block30;
                                            }
                                            catch (gj gj3) {
                                                throw x44.a("p", (Object)gj3, (long)-3725719645607340620L, (long)l);
                                            }
                                        } while (callSite == null || l <= 0L);
                                    }
                                    catch (gj gj4) {
                                        throw x44.a("p", (Object)gj4, (long)-3725719645607340620L, (long)l);
                                    }
                                    n4 = 0;
                                }
                                n = n4;
                            }
                            try {
                                do {
                                    try {
                                        n3 = n;
                                        if (l <= 0L) break block31;
                                        if (n3 >= ((ArrayList)((Object)x44.a("l", (Object)this, (long)-3311266914341551268L, (long)l))).size()) break;
                                        xeArray2[n6++] = (xe)((ArrayList)((Object)x44.a("l", (Object)this, (long)-3311266914341551268L, (long)l))).get(n);
                                        ++n;
                                        if (l >= 0L && callSite == null) {
                                            continue;
                                        }
                                        break block33;
                                    }
                                    catch (gj gj5) {
                                        throw x44.a("p", (Object)gj5, (long)-3725719645607340620L, (long)l);
                                    }
                                } while (callSite == null || l <= 0L);
                            }
                            catch (gj gj6) {
                                throw x44.a("p", (Object)gj6, (long)-3725719645607340620L, (long)l);
                            }
                            n3 = 0;
                        }
                        n = n3;
                    }
                    try {
                        do {
                            try {
                                n2 = n;
                                if (l <= 0L) break block34;
                                if (n2 >= ((ArrayList)((Object)x44.a("l", (Object)this, (long)-3445177242172213341L, (long)l))).size()) break;
                                xeArray2[n6++] = (xe)((ArrayList)((Object)x44.a("l", (Object)this, (long)-3445177242172213341L, (long)l))).get(n);
                                ++n;
                                if (l >= 0L && callSite == null) {
                                    continue;
                                }
                                break block36;
                            }
                            catch (gj gj7) {
                                throw x44.a("p", (Object)gj7, (long)-3725719645607340620L, (long)l);
                            }
                        } while (callSite == null || l < 0L);
                    }
                    catch (gj gj8) {
                        throw x44.a("p", (Object)gj8, (long)-3725719645607340620L, (long)l);
                    }
                    n2 = 0;
                }
                n = n2;
            }
            try {
                do {
                    try {
                        if (l >= 0L && n >= ((ArrayList)((Object)x44.a("l", (Object)this, (long)-3310160392065368361L, (long)l))).size()) break;
                        xeArray = xeArray2;
                        if (callSite != null) break block38;
                    }
                    catch (gj gj9) {
                        throw x44.a("p", (Object)gj9, (long)-3725719645607340620L, (long)l);
                    }
                    xeArray[n6++] = (xe)((ArrayList)((Object)x44.a("l", (Object)this, (long)-3310160392065368361L, (long)l))).get(n);
                    ++n;
                } while (callSite == null || l < 0L);
            }
            catch (gj gj10) {
                throw x44.a("p", (Object)gj10, (long)-3725719645607340620L, (long)l);
            }
            xeArray = xeArray2;
        }
        return xeArray;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public _8e q(Object[] var1_1) {
        block194: {
            block192: {
                block193: {
                    block191: {
                        block182: {
                            block177: {
                                block176: {
                                    block195: {
                                        block171: {
                                            block169: {
                                                block170: {
                                                    block163: {
                                                        block164: {
                                                            block159: {
                                                                block156: {
                                                                    block153: {
                                                                        block150: {
                                                                            block147: {
                                                                                var2_2 = (_8l)var1_1[0];
                                                                                var5_3 = (Set)var1_1[1];
                                                                                var3_4 = (Long)var1_1[2];
                                                                                v0 = var3_4 = _8c.f ^ var3_4;
                                                                                var6_5 = v0 ^ 68802421385987L;
                                                                                var8_6 = v0 ^ 68802421385987L;
                                                                                var10_7 = v0 ^ 68802421385987L;
                                                                                var12_8 = v0 ^ 78785108197274L;
                                                                                var14_9 = v0 ^ 81222679067264L;
                                                                                var16_10 = v0 ^ 16549469616834L;
                                                                                var18_11 = v0 ^ 29704448328809L;
                                                                                var20_12 = v0 ^ 19724457580209L;
                                                                                v1 = v0 ^ 24461693010690L;
                                                                                var22_13 = (int)(v1 >>> 56);
                                                                                var23_14 = (int)(v1 << 8 >>> 32);
                                                                                var24_15 = (int)(v1 << 40 >>> 40);
                                                                                var25_16 = v0 ^ 75226161820572L;
                                                                                var27_17 = v0 ^ 68802421385987L;
                                                                                var29_18 = v0 ^ 123254932169641L;
                                                                                var31_19 = v0 ^ 113423562476388L;
                                                                                var33_20 = v0 ^ 98661534467453L;
                                                                                var35_21 = v0 ^ 65767440548583L;
                                                                                var37_22 = v0 ^ 68802421385987L;
                                                                                var39_23 = v0 ^ 131290623643210L;
                                                                                var41_24 = v0 ^ 124531291454862L;
                                                                                var43_25 = v0 ^ 89124158745672L;
                                                                                var45_26 = v0 ^ 78269374389244L;
                                                                                var47_27 = v0 ^ 60343314428740L;
                                                                                var49_28 = v0 ^ 68802421385987L;
                                                                                var51_29 = v0 ^ 121615151168865L;
                                                                                var53_30 = v0 ^ 51888636997357L;
                                                                                var55_31 = v0 ^ 25450472695251L;
                                                                                var57_32 = v0 ^ 139582463123439L;
                                                                                v2 = new Object[2];
                                                                                v2[1] = var55_31;
                                                                                v2[0] = sh.Q(Math.max((int)_8c.b("p", (int)10233, (long)(4122536077451186503L ^ var3_4)), (int)((double)(x44.a("n", (Object)this, (Object)new Object[0], (long)-8841817840229645938L, (long)var3_4) - x44.a("j", (Object)this, (long)-9214136793833752597L, (long)var3_4)) * 0.7)), var43_25);
                                                                                var60_33 = x44.a("v", (Object)v2, (long)-7219128352755835805L, (long)var3_4);
                                                                                var61_34 = (xl[])this.z.clone();
                                                                                var62_35 = Math.max((int)_8c.b("p", (int)31892, (long)(7863375198065035812L ^ var3_4)), (int)((double)x44.a("j", (Object)this, (long)-9214136793833752597L, (long)var3_4) * 0.7));
                                                                                var63_36 = new _y4(var57_32, var62_35, 1);
                                                                                var64_37 = new ArrayList<E>(Math.max(5, (int)((double)x44.a("j", (Object)this, (long)-9214136793833752597L, (long)var3_4) * 0.7)));
                                                                                var65_38 = 0;
                                                                                var59_40 = x44.a("v", (long)-7480332667391443503L, (long)var3_4);
                                                                                while (var65_38 < this.G.size()) {
                                                                                    block148: {
                                                                                        block149: {
                                                                                            var66_41 = (mx)this.G.get(var65_38);
                                                                                            try {
                                                                                                if (var59_40 != null) break block147;
                                                                                                if (var2_2.W(var66_41)) {
                                                                                                }
                                                                                                ** GOTO lbl63
                                                                                            }
                                                                                            catch (gj v3) {
                                                                                                throw x44.a("v", (Object)v3, (long)-8807387912865440710L, (long)var3_4);
                                                                                            }
                                                                                            var67_44 = var66_41.t(var27_17);
                                                                                            try {
                                                                                                var63_36.G(var67_44, var66_41, var39_23);
                                                                                                v4 = var59_40;
                                                                                                if (var3_4 <= 0L) break block148;
                                                                                                if (v4 == null) break block149;
lbl63:
                                                                                                // 2 sources

                                                                                                var61_34[var66_41.B()] = null;
                                                                                            }
                                                                                            catch (gj v5) {
                                                                                                throw x44.a("v", (Object)v5, (long)-8807387912865440710L, (long)var3_4);
                                                                                            }
                                                                                        }
                                                                                        ++var65_38;
                                                                                        v4 = var59_40;
                                                                                    }
                                                                                    if (v4 == null) continue;
                                                                                }
                                                                                v6 = new Object[5];
                                                                                v6[4] = var18_11;
                                                                                v6[3] = var60_33;
                                                                                v6[2] = var61_34;
                                                                                v6[1] = var64_37;
                                                                                v6[0] = var63_36;
                                                                                x44.a("h", (Object)this, (Object)v6, (long)-7454222982511243332L, (long)var3_4);
                                                                                if (var3_4 >= 0L) {
                                                                                    // empty if block
                                                                                }
                                                                            }
                                                                            var65_39 = new _y4(var57_32, Math.max((int)_8c.b("p", (int)7152, (long)(4342519442228964687L ^ var3_4)), (int)((x44.a("n", (Object)this, (Object)new Object[0], (long)-8841817840229645938L, (long)var3_4) - x44.a("j", (Object)this, (long)-9214136793833752597L, (long)var3_4)) / 4)), 1);
                                                                            var66_42 = 0;
                                                                            while (var66_42 < this.y.size()) {
                                                                                block151: {
                                                                                    block152: {
                                                                                        var67_44 = (mn)this.y.get(var66_42);
                                                                                        try {
                                                                                            if (var59_40 != null) break block150;
                                                                                            if (var2_2.F((mn)var67_44)) {
                                                                                            }
                                                                                            ** GOTO lbl100
                                                                                        }
                                                                                        catch (gj v7) {
                                                                                            throw x44.a("v", (Object)v7, (long)-8807387912865440710L, (long)var3_4);
                                                                                        }
                                                                                        var68_47 = var67_44.t(var6_5);
                                                                                        try {
                                                                                            var65_39.G(var68_47, var67_44, var39_23);
                                                                                            v8 = var59_40;
                                                                                            if (var3_4 <= 0L) break block151;
                                                                                            if (v8 == null) break block152;
lbl100:
                                                                                            // 2 sources

                                                                                            var61_34[var67_44.B()] = null;
                                                                                        }
                                                                                        catch (gj v9) {
                                                                                            throw x44.a("v", (Object)v9, (long)-8807387912865440710L, (long)var3_4);
                                                                                        }
                                                                                    }
                                                                                    ++var66_42;
                                                                                    v8 = var59_40;
                                                                                }
                                                                                if (v8 == null) continue;
                                                                            }
                                                                            v10 = new Object[5];
                                                                            v10[4] = var18_11;
                                                                            v10[3] = var60_33;
                                                                            v10[2] = var61_34;
                                                                            v10[1] = var64_37;
                                                                            v10[0] = var65_39;
                                                                            x44.a("h", (Object)this, (Object)v10, (long)-7454222982511243332L, (long)var3_4);
                                                                            if (var3_4 > 0L) {
                                                                                // empty if block
                                                                            }
                                                                        }
                                                                        var66_43 = new _y4(var57_32, Math.max((int)_8c.b("p", (int)11542, (long)(8861620974296914863L ^ var3_4)), (int)((x44.a("n", (Object)this, (Object)new Object[0], (long)-8841817840229645938L, (long)var3_4) - x44.a("j", (Object)this, (long)-9214136793833752597L, (long)var3_4)) / 4)), 1);
                                                                        var67_45 = 0;
                                                                        while (var67_45 < this.L.size()) {
                                                                            block154: {
                                                                                block155: {
                                                                                    var68_47 = (md)this.L.get(var67_45);
                                                                                    try {
                                                                                        if (var59_40 != null) break block153;
                                                                                        v11 = new Object[2];
                                                                                        v11[1] = var68_47;
                                                                                        v11[0] = var53_30;
                                                                                        if (x44.a("n", (Object)var2_2, (Object)v11, (long)-9153266369453968071L, (long)var3_4) != false) {
                                                                                        }
                                                                                        ** GOTO lbl141
                                                                                    }
                                                                                    catch (gj v12) {
                                                                                        throw x44.a("v", (Object)v12, (long)-8807387912865440710L, (long)var3_4);
                                                                                    }
                                                                                    var69_50 = x44.a("n", (Object)var68_47, (long)var37_22, (long)-8689823076177382954L, (long)var3_4);
                                                                                    try {
                                                                                        var66_43.G(var69_50, var68_47, var39_23);
                                                                                        v13 = var59_40;
                                                                                        if (var3_4 <= 0L) break block154;
                                                                                        if (v13 == null) break block155;
lbl141:
                                                                                        // 2 sources

                                                                                        var61_34[var68_47.B()] = null;
                                                                                    }
                                                                                    catch (gj v14) {
                                                                                        throw x44.a("v", (Object)v14, (long)-8807387912865440710L, (long)var3_4);
                                                                                    }
                                                                                }
                                                                                ++var67_45;
                                                                                v13 = var59_40;
                                                                            }
                                                                            if (v13 == null) continue;
                                                                        }
                                                                        v15 = new Object[5];
                                                                        v15[4] = var18_11;
                                                                        v15[3] = var60_33;
                                                                        v15[2] = var61_34;
                                                                        v15[1] = var64_37;
                                                                        v15[0] = var66_43;
                                                                        x44.a("h", (Object)this, (Object)v15, (long)-7454222982511243332L, (long)var3_4);
                                                                        if (var3_4 > 0L) {
                                                                            // empty if block
                                                                        }
                                                                    }
                                                                    var67_46 = new _y4(var57_32, Math.max((int)_8c.b("p", (int)11542, (long)(8861620974296914863L ^ var3_4)), (int)((x44.a("n", (Object)this, (Object)new Object[0], (long)-8841817840229645938L, (long)var3_4) - x44.a("j", (Object)this, (long)-9214136793833752597L, (long)var3_4)) / 4)), 1);
                                                                    var68_48 = 0;
                                                                    while (var68_48 < x44.a("j", (Object)this, (long)-8651161168993914542L, (long)var3_4).size()) {
                                                                        block157: {
                                                                            block158: {
                                                                                var69_50 = (x4)x44.a("j", (Object)this, (long)-8651161168993914542L, (long)var3_4).get(var68_48);
                                                                                try {
                                                                                    if (var59_40 != null) break block156;
                                                                                    v16 = new Object[2];
                                                                                    v16[1] = var20_12;
                                                                                    v16[0] = var69_50;
                                                                                    if (x44.a("n", (Object)var2_2, (Object)v16, (long)-7362394864615926981L, (long)var3_4) != false) {
                                                                                    }
                                                                                    ** GOTO lbl182
                                                                                }
                                                                                catch (gj v17) {
                                                                                    throw x44.a("v", (Object)v17, (long)-8807387912865440710L, (long)var3_4);
                                                                                }
                                                                                var70_53 = x44.a("n", (Object)var69_50, (long)var49_28, (long)-8677188747055724170L, (long)var3_4);
                                                                                try {
                                                                                    var67_46.G(var70_53, var69_50, var39_23);
                                                                                    v18 = var59_40;
                                                                                    if (var3_4 <= 0L) break block157;
                                                                                    if (v18 == null) break block158;
lbl182:
                                                                                    // 2 sources

                                                                                    var61_34[var69_50.B()] = null;
                                                                                }
                                                                                catch (gj v19) {
                                                                                    throw x44.a("v", (Object)v19, (long)-8807387912865440710L, (long)var3_4);
                                                                                }
                                                                            }
                                                                            ++var68_48;
                                                                            v18 = var59_40;
                                                                        }
                                                                        if (v18 == null) continue;
                                                                    }
                                                                    v20 = new Object[5];
                                                                    v20[4] = var18_11;
                                                                    v20[3] = var60_33;
                                                                    v20[2] = var61_34;
                                                                    v20[1] = var64_37;
                                                                    v20[0] = var67_46;
                                                                    x44.a("h", (Object)this, (Object)v20, (long)-7454222982511243332L, (long)var3_4);
                                                                    if (var3_4 > 0L) {
                                                                        // empty if block
                                                                    }
                                                                }
                                                                var68_49 = new _y4(var57_32, Math.max((int)_8c.b("p", (int)11542, (long)(8861620974296914863L ^ var3_4)), (int)((x44.a("n", (Object)this, (Object)new Object[0], (long)-8841817840229645938L, (long)var3_4) - x44.a("j", (Object)this, (long)-9214136793833752597L, (long)var3_4)) / 4)), 1);
                                                                var69_51 = 0;
                                                                while (var69_51 < x44.a("j", (Object)this, (long)-8776904435112489263L, (long)var3_4).size()) {
                                                                    block162: {
                                                                        block161: {
                                                                            block160: {
                                                                                var70_53 = (mf)x44.a("j", (Object)this, (long)-8776904435112489263L, (long)var3_4).get(var69_51);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v21 = var59_40;
                                                                                            if (var3_4 > 0L) {
                                                                                                if (v21 != null) break block159;
                                                                                                v21 = var59_40;
                                                                                            }
                                                                                            if (var3_4 > 0L) {
                                                                                                if (v21 != null) break block160;
                                                                                            }
                                                                                            ** GOTO lbl232
                                                                                        }
                                                                                        catch (gj v22) {
                                                                                            throw x44.a("v", (Object)v22, (long)-8807387912865440710L, (long)var3_4);
                                                                                        }
                                                                                        if (var3_4 <= 0L) break block161;
                                                                                        if (x44.a("n", (Object)var2_2, (Object)new Object[]{var70_53}, (long)-9148902428665400694L, (long)var3_4) != false) {
                                                                                        }
                                                                                        ** GOTO lbl234
                                                                                    }
                                                                                    catch (gj v23) {
                                                                                        throw x44.a("v", (Object)v23, (long)-8807387912865440710L, (long)var3_4);
                                                                                    }
                                                                                    var68_49.G(x44.a("n", (Object)var70_53, (long)var10_7, (long)-6971798074844453212L, (long)var3_4), var70_53, var39_23);
                                                                                }
                                                                                catch (gj v24) {
                                                                                    throw x44.a("v", (Object)v24, (long)-8807387912865440710L, (long)var3_4);
                                                                                }
                                                                            }
                                                                            try {
                                                                                v21 = var59_40;
lbl232:
                                                                                // 2 sources

                                                                                if (var3_4 < 0L) break block162;
                                                                                if (v21 == null) break block161;
lbl234:
                                                                                // 2 sources

                                                                                var61_34[var70_53.B()] = null;
                                                                            }
                                                                            catch (gj v25) {
                                                                                throw x44.a("v", (Object)v25, (long)-8807387912865440710L, (long)var3_4);
                                                                            }
                                                                        }
                                                                        ++var69_51;
                                                                        v21 = var59_40;
                                                                    }
                                                                    if (v21 == null) continue;
                                                                }
                                                                v26 = new Object[5];
                                                                v26[4] = var18_11;
                                                                v26[3] = var60_33;
                                                                v26[2] = var61_34;
                                                                v26[1] = var64_37;
                                                                v26[0] = var68_49;
                                                                x44.a("h", (Object)this, (Object)v26, (long)-7454222982511243332L, (long)var3_4);
                                                                if (var3_4 > 0L) {
                                                                    // empty if block
                                                                }
                                                            }
                                                            var69_52 = new _y4(var57_32, Math.max((int)_8c.b("p", (int)11542, (long)(8861620974296914863L ^ var3_4)), (int)((x44.a("n", (Object)this, (Object)new Object[0], (long)-8841817840229645938L, (long)var3_4) - x44.a("j", (Object)this, (long)-9214136793833752597L, (long)var3_4)) / 4)), 1);
                                                            var70_54 = 0;
                                                            block101: while (var70_54 < x44.a("j", (Object)this, (long)-7241138756552733998L, (long)var3_4).size()) {
                                                                v27 /* !! */  = x44.a("j", (Object)this, (long)-7241138756552733998L, (long)var3_4).get(var70_54);
                                                                do {
                                                                    block167: {
                                                                        block168: {
                                                                            block165: {
                                                                                var71_55 = (ms)v27 /* !! */ ;
                                                                                try {
                                                                                    block166: {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (var3_4 <= 0L) break block163;
                                                                                                    v28 = var2_2.D((ms)var71_55);
                                                                                                    if (var59_40 != null) break block164;
                                                                                                    if (var59_40 != null) break block165;
                                                                                                }
                                                                                                catch (gj v29) {
                                                                                                    throw x44.a("v", (Object)v29, (long)-8807387912865440710L, (long)var3_4);
                                                                                                }
                                                                                                if (var3_4 < 0L) break block165;
                                                                                                if (v28 == 0) break block166;
                                                                                            }
                                                                                            catch (gj v30) {
                                                                                                throw x44.a("v", (Object)v30, (long)-8807387912865440710L, (long)var3_4);
                                                                                            }
                                                                                            var69_52.G(x44.a("n", (Object)var71_55, (long)var8_6, (long)-7003001188370110629L, (long)var3_4), var71_55, var39_23);
                                                                                            v31 = var59_40;
                                                                                            if (var3_4 < 0L) break block167;
                                                                                            if (v31 == null) break block168;
                                                                                        }
                                                                                        catch (gj v32) {
                                                                                            throw x44.a("v", (Object)v32, (long)-8807387912865440710L, (long)var3_4);
                                                                                        }
                                                                                    }
                                                                                    v33 = var71_55.B();
                                                                                }
                                                                                catch (gj v34) {
                                                                                    throw x44.a("v", (Object)v34, (long)-8807387912865440710L, (long)var3_4);
                                                                                }
                                                                            }
                                                                            var72_56 = v33;
                                                                            var61_34[var72_56] = null;
                                                                            var61_34[var72_56 + true] = null;
                                                                        }
                                                                        ++var70_54;
                                                                        v31 = var59_40;
                                                                    }
                                                                    if (v31 == null) continue block101;
                                                                    v35 = new Object[5];
                                                                    v35[4] = var18_11;
                                                                    v35[3] = var60_33;
                                                                    v35[2] = var61_34;
                                                                    v35[1] = var64_37;
                                                                    v35[0] = var69_52;
                                                                    x44.a("h", (Object)this, (Object)v35, (long)-7454222982511243332L, (long)var3_4);
                                                                    v36 = new Object[3];
                                                                    v36[2] = var61_34;
                                                                    v36[1] = var45_26;
                                                                    v36[0] = var2_2;
                                                                    x44.a("h", (Object)this, (Object)v36, (long)-8869078137750514316L, (long)var3_4);
                                                                    v27 /* !! */  = var61_34;
                                                                } while (var3_4 <= 0L);
                                                            }
                                                            v28 = ((E)v27 /* !! */ ).length;
                                                        }
                                                        var70_54 = v28;
                                                    }
                                                    var71_55 = new ArrayList<E>(var70_54);
                                                    var72_56 = x44.a("o", (long)-8693202242117975659L, (long)var3_4);
                                                    v37 = new Object[2];
                                                    v37[1] = sh.Q(var70_54, var43_25);
                                                    v37[0] = var25_16;
                                                    var73_57 = x44.a("v", (Object)v37, (long)-9119500153825263515L, (long)var3_4);
                                                    var71_55.add(var61_34[0]);
                                                    var73_57.add(var61_34[0]);
                                                    var74_58 = new w(var60_33.size(), (byte)var22_13, var23_14, var24_15);
                                                    for (Object var76_60 : var60_33.entrySet()) {
                                                        var74_58.u(var12_8, var76_60.getValue(), var76_60.getKey());
                                                        if (var59_40 == null) continue;
                                                    }
                                                    var75_59 = null;
                                                    v38 = new Object[1];
                                                    v38[0] = var14_9;
                                                    var76_60 = x44.a("n", (Object)var2_2, (Object)v38, (long)-8777966885041011766L, (long)var3_4);
                                                    try {
                                                        v39 /* !! */  = mc.n;
                                                        v40 = var59_40;
                                                        if (var3_4 < 0L) break block169;
                                                        if (v40 != null) break block170;
                                                        if (v39 /* !! */  != 0) break block171;
                                                    }
                                                    catch (gj v41) {
                                                        throw x44.a("v", (Object)v41, (long)-8807387912865440710L, (long)var3_4);
                                                    }
                                                    v39 /* !! */  = (int)_8c.b("p", (int)15013, (long)(2199433534520839178L ^ var3_4));
                                                }
                                                v42 = new Object[2];
                                                v40 = v42;
                                                v42[1] = var47_27;
                                            }
                                            v40[0] = v39 /* !! */ ;
                                            var75_59 = x44.a("v", (Object)v40, (long)-7396353269751716227L, (long)var3_4);
                                            v43 = new Object[3];
                                            v43[2] = var75_59;
                                            v43[1] = var29_18;
                                            v43[0] = var76_60;
                                            x44.a("v", (Object)v43, (long)-7403122985760244157L, (long)var3_4);
                                            break block195;
                                        }
                                        Collections.sort(var76_60);
                                    }
                                    var77_61 = var76_60.iterator();
                                    block104: while (var77_61.hasNext()) {
                                        v44 /* !! */  = var77_61.next();
                                        do {
                                            var78_62 = (xl)v44 /* !! */ ;
                                            v45 = sh.a(var78_62, (Map)var60_33, var41_24);
                                            block106: while (true) {
                                                block173: {
                                                    block175: {
                                                        block174: {
                                                            block172: {
                                                                var79_63 = (xl)v45;
                                                                try {
                                                                    try {
                                                                        v46 = var73_57.add(var79_63);
                                                                        v47 = var59_40;
                                                                        if (var3_4 > 0L) {
                                                                            if (v47 != null) break block172;
                                                                            if (v46 == 0) break block173;
                                                                        }
                                                                        ** GOTO lbl397
                                                                    }
                                                                    catch (gj v48) {
                                                                        throw x44.a("v", (Object)v48, (long)-8807387912865440710L, (long)var3_4);
                                                                    }
                                                                    var71_55.add(var79_63);
                                                                    v46 = var71_55.size();
                                                                }
                                                                catch (gj v49) {
                                                                    throw x44.a("v", (Object)v49, (long)-8807387912865440710L, (long)var3_4);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    v47 = var59_40;
lbl397:
                                                                    // 2 sources

                                                                    if (v47 != null) break block174;
                                                                    if (v46 <= _8c.b("p", (int)16693, (long)(2841417943676729218L ^ var3_4))) break block173;
                                                                }
                                                                catch (gj v50) {
                                                                    throw x44.a("v", (Object)v50, (long)-8807387912865440710L, (long)var3_4);
                                                                }
                                                                v51 = new Object[2];
                                                                v51[1] = var79_63;
                                                                v51[0] = var16_10;
                                                                v46 = (int)var5_3.addAll(x44.a("n", (Object)var2_2, (Object)v51, (long)-8899497700098441452L, (long)var3_4));
                                                            }
                                                            catch (gj v52) {
                                                                throw x44.a("v", (Object)v52, (long)-8807387912865440710L, (long)var3_4);
                                                            }
                                                        }
                                                        var80_64 = var74_58.N(var51_29, var79_63);
                                                        try {
                                                            v53 = var80_64;
                                                            if (var59_40 != null) break block175;
                                                            if (v53 == null) break block173;
                                                        }
                                                        catch (gj v54) {
                                                            throw x44.a("v", (Object)v54, (long)-8807387912865440710L, (long)var3_4);
                                                        }
                                                        v53 = var80_64;
                                                    }
                                                    for (Object var82_69 : v53) {
                                                        v55 = new Object[2];
                                                        v55[1] = var82_69;
                                                        v55[0] = var16_10;
                                                        var5_3.addAll(x44.a("n", (Object)var2_2, (Object)v55, (long)-8899497700098441452L, (long)var3_4));
                                                        if (var59_40 != null) continue block104;
                                                        v45 = var59_40;
                                                        if (var3_4 <= 0L) continue block106;
                                                        if (v45 == null) continue;
                                                    }
                                                }
                                                v45 = var59_40;
                                                if (var3_4 >= 0L) break;
                                            }
                                            if (v45 == null) continue block104;
                                            v56 = new Object[1];
                                            v56[0] = var33_20;
                                            v44 /* !! */  = x44.a("n", (Object)var2_2, (Object)v56, (long)-7405802075820545726L, (long)var3_4);
                                        } while (var3_4 <= 0L);
                                    }
                                    var77_61 = v44 /* !! */ ;
                                    try {
                                        try {
                                            v57 = var59_40;
                                            if (var3_4 < 0L) ** GOTO lbl466
                                            if (v57 != null) break block176;
                                            if (!mc.n) {
                                            }
                                            ** GOTO lbl467
                                        }
                                        catch (gj v58) {
                                            throw x44.a("v", (Object)v58, (long)-8807387912865440710L, (long)var3_4);
                                        }
                                        v59 = new Object[3];
                                        v59[2] = var75_59;
                                        v59[1] = var29_18;
                                        v59[0] = var77_61;
                                        x44.a("v", (Object)v59, (long)-7403122985760244157L, (long)var3_4);
                                    }
                                    catch (gj v60) {
                                        throw x44.a("v", (Object)v60, (long)-8807387912865440710L, (long)var3_4);
                                    }
                                }
                                try {
                                    if (var3_4 <= 0L) break block177;
                                    v57 = var59_40;
lbl466:
                                    // 2 sources

                                    if (v57 == null) break block177;
lbl467:
                                    // 2 sources

                                    Collections.sort(var77_61);
                                }
                                catch (gj v61) {
                                    throw x44.a("v", (Object)v61, (long)-8807387912865440710L, (long)var3_4);
                                }
                            }
                            var78_62 = var77_61.iterator();
                            block108: while (var78_62.hasNext()) {
                                v62 /* !! */  = var78_62.next();
                                do {
                                    var79_63 = (xl)v62 /* !! */ ;
                                    v63 = sh.a(var79_63, (Map)var60_33, var41_24);
                                    block110: while (true) {
                                        block179: {
                                            block181: {
                                                block180: {
                                                    block178: {
                                                        var80_64 = (xl)v63;
                                                        try {
                                                            try {
                                                                v64 = var73_57.add(var80_64);
                                                                v65 = var59_40;
                                                                if (var3_4 >= 0L) {
                                                                    if (v65 != null) break block178;
                                                                    if (v64 == 0) break block179;
                                                                }
                                                                ** GOTO lbl501
                                                            }
                                                            catch (gj v66) {
                                                                throw x44.a("v", (Object)v66, (long)-8807387912865440710L, (long)var3_4);
                                                            }
                                                            var71_55.add(var80_64);
                                                            v64 = var71_55.size();
                                                        }
                                                        catch (gj v67) {
                                                            throw x44.a("v", (Object)v67, (long)-8807387912865440710L, (long)var3_4);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            v65 = var59_40;
lbl501:
                                                            // 2 sources

                                                            if (v65 != null) break block180;
                                                            if (v64 > _8c.b("p", (int)5342, (long)(5828888013653402226L ^ var3_4))) break block179;
                                                        }
                                                        catch (gj v68) {
                                                            throw x44.a("v", (Object)v68, (long)-8807387912865440710L, (long)var3_4);
                                                        }
                                                        v69 = new Object[2];
                                                        v69[1] = var80_64;
                                                        v69[0] = var16_10;
                                                        v64 = (int)var5_3.addAll(x44.a("n", (Object)var2_2, (Object)v69, (long)-8899497700098441452L, (long)var3_4));
                                                    }
                                                    catch (gj v70) {
                                                        throw x44.a("v", (Object)v70, (long)-8807387912865440710L, (long)var3_4);
                                                    }
                                                }
                                                var81_68 = var74_58.N(var51_29, var80_64);
                                                try {
                                                    v71 = var81_68;
                                                    if (var59_40 != null) break block181;
                                                    if (v71 == null) break block179;
                                                }
                                                catch (gj v72) {
                                                    throw x44.a("v", (Object)v72, (long)-8807387912865440710L, (long)var3_4);
                                                }
                                                v71 = var81_68;
                                            }
                                            var82_69 = v71.iterator();
                                            while (var82_69.hasNext()) {
                                                var83_70 = (xl)var82_69.next();
                                                v73 = new Object[2];
                                                v73[1] = var83_70;
                                                v73[0] = var16_10;
                                                var5_3.addAll(x44.a("n", (Object)var2_2, (Object)v73, (long)-8899497700098441452L, (long)var3_4));
                                                if (var59_40 != null) continue block108;
                                                v63 = var59_40;
                                                if (var3_4 < 0L) continue block110;
                                                if (v63 == null) continue;
                                            }
                                        }
                                        v63 = var59_40;
                                        if (var3_4 > 0L) break;
                                    }
                                    if (v63 == null) continue block108;
                                    v62 /* !! */  = new ArrayList<E>();
                                } while (var3_4 < 0L);
                            }
                            var78_62 = v62 /* !! */ ;
                            var79_63 = new ArrayList<E>();
                            var80_65 = 0;
                            while (var80_65 < var70_54) {
                                block188: {
                                    block189: {
                                        block184: {
                                            block190: {
                                                block185: {
                                                    block186: {
                                                        block183: {
                                                            var81_68 = var61_34[var80_65];
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (var3_4 < 0L || var59_40 != null) break block182;
                                                                        if (var81_68 != null) {
                                                                        }
                                                                        ** GOTO lbl640
                                                                    }
                                                                    catch (gj v74) {
                                                                        throw x44.a("v", (Object)v74, (long)-8807387912865440710L, (long)var3_4);
                                                                    }
                                                                    v75 = var73_57.contains(var81_68);
                                                                    v76 = var59_40;
                                                                    if (var3_4 >= 0L) {
                                                                        if (v76 != null) break block183;
                                                                    }
                                                                    ** GOTO lbl579
                                                                }
                                                                catch (gj v77) {
                                                                    throw x44.a("v", (Object)v77, (long)-8807387912865440710L, (long)var3_4);
                                                                }
                                                                if (v75 != 0) break block184;
                                                            }
                                                            catch (gj v78) {
                                                                throw x44.a("v", (Object)v78, (long)-8807387912865440710L, (long)var3_4);
                                                            }
                                                            v75 = (int)mc.n;
                                                        }
                                                        try {
                                                            block187: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v76 = var59_40;
lbl579:
                                                                                // 2 sources

                                                                                if (v76 != null) break block185;
                                                                                if (v75 == 0) {
                                                                                }
                                                                                ** GOTO lbl614
                                                                            }
                                                                            catch (gj v79) {
                                                                                throw x44.a("v", (Object)v79, (long)-8807387912865440710L, (long)var3_4);
                                                                            }
                                                                            v80 = var81_68.o(var31_19);
                                                                            if (var3_4 < 0L || var59_40 != null) break block186;
                                                                        }
                                                                        catch (gj v81) {
                                                                            throw x44.a("v", (Object)v81, (long)-8807387912865440710L, (long)var3_4);
                                                                        }
                                                                        if (var3_4 < 0L) break block186;
                                                                        if (v80 != 2) break block187;
                                                                    }
                                                                    catch (gj v82) {
                                                                        throw x44.a("v", (Object)v82, (long)-8807387912865440710L, (long)var3_4);
                                                                    }
                                                                    var79_63.add(var81_68);
                                                                    ++var80_65;
                                                                    if (var59_40 == null) break block184;
                                                                }
                                                                catch (gj v83) {
                                                                    throw x44.a("v", (Object)v83, (long)-8807387912865440710L, (long)var3_4);
                                                                }
                                                            }
                                                            v80 = (int)var78_62.add(var81_68);
                                                        }
                                                        catch (gj v84) {
                                                            throw x44.a("v", (Object)v84, (long)-8807387912865440710L, (long)var3_4);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            block196: {
                                                                v85 = var59_40;
                                                                if (var3_4 >= 0L) {
                                                                    if (v85 == null) break block184;
                                                                }
                                                                break block196;
lbl614:
                                                                // 2 sources

                                                                var71_55.add(var81_68);
                                                                var73_57.add(var81_68);
                                                                v85 = var59_40;
                                                            }
                                                            if (var3_4 <= 0L) break block188;
                                                            if (v85 != null) break block189;
                                                        }
                                                        catch (gj v86) {
                                                            throw x44.a("v", (Object)v86, (long)-8807387912865440710L, (long)var3_4);
                                                        }
                                                        v75 = var81_68.o(var31_19);
                                                    }
                                                    catch (gj v87) {
                                                        throw x44.a("v", (Object)v87, (long)-8807387912865440710L, (long)var3_4);
                                                    }
                                                }
                                                if (v75 != 2) break block184;
                                                var82_69 = (mg)var61_34[++var80_65];
                                                try {
                                                    try {
                                                        try {
                                                            var71_55.add(var82_69);
                                                            var73_57.add(var82_69);
                                                            if (var3_4 > 0L && var59_40 == null) break block184;
lbl640:
                                                            // 2 sources

                                                            v88 /* !! */  = var72_56;
                                                            if (var59_40 != null) break block190;
                                                        }
                                                        catch (gj v89) {
                                                            throw x44.a("v", (Object)v89, (long)-8807387912865440710L, (long)var3_4);
                                                        }
                                                        if (v88 /* !! */  != false) break block184;
                                                    }
                                                    catch (gj v90) {
                                                        throw x44.a("v", (Object)v90, (long)-8807387912865440710L, (long)var3_4);
                                                    }
                                                    var71_55.add(new mx(var80_65, this, (String)x44.a("o", (long)-9175872362060360284L, (long)var3_4)));
                                                    v88 /* !! */  = (CallSite)true;
                                                }
                                                catch (gj v91) {
                                                    throw x44.a("v", (Object)v91, (long)-8807387912865440710L, (long)var3_4);
                                                }
                                            }
                                            var72_56 = v88 /* !! */ ;
                                        }
                                        ++var80_65;
                                    }
                                    v85 = var59_40;
                                }
                                if (v85 == null) continue;
                            }
                            try {
                                v92 = var78_62.size();
                                if (var3_4 <= 0L || var59_40 != null) break block191;
                                if (v92 <= 0) break block182;
                            }
                            catch (gj v93) {
                                throw x44.a("v", (Object)v93, (long)-8807387912865440710L, (long)var3_4);
                            }
                            v94 = new Object[3];
                            v94[2] = var75_59;
                            v94[1] = var29_18;
                            v94[0] = var78_62;
                            x44.a("v", (Object)v94, (long)-7403122985760244157L, (long)var3_4);
                            var80_66 = var78_62.iterator();
                            block113: while (var80_66.hasNext()) {
                                var81_68 = (xl)var80_66.next();
                                try {
                                    var71_55.add(var81_68);
                                    var73_57.add(var81_68);
                                    do {
                                        v95 = var59_40;
                                        if (var3_4 >= 0L) {
                                            if (v95 != null) break block192;
                                            v95 = var59_40;
                                        }
                                        if (v95 == null) continue block113;
                                    } while (var3_4 < 0L);
                                    break;
                                }
                                catch (gj v96) {
                                    throw x44.a("v", (Object)v96, (long)-8807387912865440710L, (long)var3_4);
                                }
                            }
                        }
                        try {
                            if (var3_4 <= 0L) break block192;
                            v97 = var79_63;
                            if (var59_40 != null) break block193;
                            v92 = v97.size();
                        }
                        catch (gj v98) {
                            throw x44.a("v", (Object)v98, (long)-8807387912865440710L, (long)var3_4);
                        }
                    }
                    if (v92 > 0) {
                        v99 = new Object[3];
                        v99[2] = var75_59;
                        v99[1] = var29_18;
                        v99[0] = var79_63;
                        x44.a("v", (Object)v99, (long)-7403122985760244157L, (long)var3_4);
                        var80_67 = this.M[0];
                        var81_68 = var79_63.iterator();
                        block115: while (var81_68.hasNext()) {
                            var82_69 = (xl)var81_68.next();
                            try {
                                var71_55.add(var82_69);
                                var73_57.add(var82_69);
                                var71_55.add(var80_67);
                                var73_57.add(var80_67);
                                while (var3_4 >= 0L && var59_40 == null) {
                                    if (var59_40 == null) continue block115;
                                    if (var3_4 < 0L) continue;
                                    break block115;
                                }
                                break block192;
                            }
                            catch (gj v100) {
                                throw x44.a("v", (Object)v100, (long)-8807387912865440710L, (long)var3_4);
                            }
                        }
                    }
                    v97 = var71_55;
                }
                var61_34 = v97.toArray(new xl[var71_55.size()]);
            }
            try {
                v101 = new _8e(var35_21, this, var61_34, (Map)var60_33);
                v102 = x44.a("v", (long)-8893122182892393414L, (long)var3_4);
                if (var3_4 > 0L) {
                    if (v102 != null) break block194;
                    v102 = new String[1];
                }
                x44.a("v", (Object)v102, (long)-8683532453400641637L, (long)var3_4);
            }
            catch (gj v103) {
                throw x44.a("v", (Object)v103, (long)-8807387912865440710L, (long)var3_4);
            }
        }
        return v101;
    }

    public mf F(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        List list = (List)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = f ^ l) ^ 0x207152BB8CF6L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = false;
        objectArray2[3] = bl;
        objectArray2[2] = list;
        objectArray2[1] = l2;
        objectArray2[0] = n;
        return x44.a("o", (Object)this, (Object)objectArray2, (long)-7730477719652246694L, (long)l);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x463D;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_8c", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            _8c.h[n2] = _8c.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _8c.a(n, l);
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
            throw new RuntimeException("com/zelix/_8c" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x63CB;
        if (_8c.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])_8c.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    _8c.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_8c", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8c.l[n2] = n3;
        }
        return _8c.l[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = _8c.b(n, l);
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
            throw new RuntimeException("com/zelix/_8c" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8c.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8c.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
