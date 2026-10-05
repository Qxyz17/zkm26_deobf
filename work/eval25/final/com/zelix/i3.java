/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._8l;
import com.zelix._ug;
import com.zelix._ur;
import com.zelix._xx;
import com.zelix._y4;
import com.zelix.ei;
import com.zelix.ess;
import com.zelix.gj;
import com.zelix.h8;
import com.zelix.hy;
import com.zelix.hz;
import com.zelix.ij;
import com.zelix.mx;
import com.zelix.wp;
import com.zelix.x44;
import com.zelix.xl;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
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
public class i3
extends ij {
    private int[] N;
    private Integer Z;
    private String X;
    private String[] H;
    private String[] a;
    private String p;
    private int[] s;
    private int F;
    private static final long b;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;
    private static final long[] k;
    private static final Integer[] m;
    private static final Map n;

    /*
     * WARNING - void declaration
     */
    @Override
    public void N(long l, _8l _8l2) {
        block6: {
            void var9_7;
            Object object;
            CallSite callSite;
            long l2;
            block5: {
                long l3 = l;
                long l4 = l3 ^ 0x48F6163747F8L;
                l2 = l3 ^ 0L;
                callSite = x44.a("w", (long)-6348162585463318644L, (long)l);
                try {
                    try {
                        object = x44.a("k", (Object)this, (long)-6484347792055693838L, (long)l);
                        if (callSite == false) break block5;
                        if (object == false) break block6;
                    }
                    catch (gj gj2) {
                        throw x44.a("w", (Object)gj2, (long)-4671259882877132953L, (long)l);
                    }
                    ((mx)((Object)x44.a("k", (Object)this, (long)-6355948463305359489L, (long)l))).O(l4, _8l2, this, this.x());
                    object = false;
                }
                catch (gj gj3) {
                    throw x44.a("w", (Object)gj3, (long)-4671259882877132953L, (long)l);
                }
            }
            CallSite callSite2 = object;
            while (var9_7 < x44.a("k", (Object)this, (long)-6415779040811267671L, (long)l)) {
                x44.a("o", (Object)x44.a("k", (Object)this, (long)-5147556576492009147L, (long)l)[var9_7], (long)l2, (Object)_8l2, (long)-4927400832060802561L, (long)l);
                ++var9_7;
                if (callSite != false) continue;
            }
        }
    }

    @Override
    hz Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return x44.a("h", (Object)this, (long)7155968334200506418L, (long)l);
    }

    @Override
    public void b(mx mx2, short s, mx mx3, int n, short s2) {
        block5: {
            i3 i32;
            long l;
            block4: {
                l = (long)s << 48 | (long)n << 32 >>> 16 | (long)s2 << 48 >>> 48;
                CallSite callSite = x44.a("w", (long)-4813852749984134795L, (long)l);
                try {
                    try {
                        i32 = this;
                        if (callSite != false) break block4;
                        if (x44.a("k", (Object)i32, (long)-6887332765196388129L, (long)l) != mx2) break block5;
                    }
                    catch (gj gj2) {
                        throw x44.a("w", (Object)gj2, (long)-5148674055479338809L, (long)l);
                    }
                    i32 = this;
                }
                catch (gj gj3) {
                    throw x44.a("w", (Object)gj3, (long)-5148674055479338809L, (long)l);
                }
            }
            x44.a("t", (Object)i32, (mx)mx3, (long)-6887332765196388129L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void s(Object[] var1_1) {
        var3_2 = (Long)var1_1[0];
        var2_3 = (DataOutputStream)var1_1[1];
        var5_4 = var3_2 ^ 0L;
        v0 = x44.a("s", (long)829389878961519592L, (long)var3_2);
        var2_3.writeShort(x44.a("o", (Object)this, (long)842029077907428123L, (long)var3_2).B());
        var2_3.writeShort((int)x44.a("o", (Object)this, (long)761896154518185421L, (long)var3_2));
        var7_5 = v0;
        var8_6 = 0;
        while (var8_6 < x44.a("o", (Object)this, (long)761896154518185421L, (long)var3_2)) {
            v1 = new Object[2];
            v1[1] = var2_3;
            v1[0] = var5_4;
            x44.a("k", (Object)x44.a("o", (Object)this, (long)1509949291323548961L, (long)var3_2)[var8_6], (Object)v1, (long)1529639341212515203L, (long)var3_2);
            ++var8_6;
lbl18:
            // 2 sources

            ** while (var7_5 == false)
lbl19:
            // 1 sources

        }
lbl20:
        // 2 sources

        if (var3_2 < 0L) ** GOTO lbl18
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void J(Object[] var1_1) {
        block11: {
            block12: {
                block10: {
                    var4_2 = (DataOutputStream)var1_1[0];
                    var2_3 = (Long)var1_1[1];
                    var5_4 = (Map)var1_1[2];
                    var6_5 = (_ur)var1_1[3];
                    var7_6 = var2_3 ^ 0L;
                    var10_7 = (mx)var5_4.get(x44.a("m", (Object)this, (long)-5963491039407671927L, (long)var2_3));
                    var9_8 = x44.a("q", (long)-5735359121590942685L, (long)var2_3);
                    try {
                        try {
                            if (var9_8 != false) break block10;
                            if (var10_7 != null) {
                            }
                            ** GOTO lbl27
                        }
                        catch (gj v0) {
                            throw x44.a("q", (Object)v0, (long)-5342932649016273519L, (long)var2_3);
                        }
                        var4_2.writeShort(var10_7.B());
                    }
                    catch (gj v1) {
                        throw x44.a("q", (Object)v1, (long)-5342932649016273519L, (long)var2_3);
                    }
                }
                try {
                    v2 = var9_8;
                    if (var2_3 <= 0L) break block11;
                    if (v2 == false) break block12;
lbl27:
                    // 2 sources

                    var4_2.writeShort(x44.a("m", (Object)this, (long)-5963491039407671927L, (long)var2_3).B());
                }
                catch (gj v3) {
                    throw x44.a("q", (Object)v3, (long)-5342932649016273519L, (long)var2_3);
                }
            }
            var4_2.writeShort((int)x44.a("m", (Object)this, (long)-6052595976628911265L, (long)var2_3));
            v2 = var11_9 = (reference)false;
        }
        while (var11_9 < x44.a("m", (Object)this, (long)-6052595976628911265L, (long)var2_3)) {
            v4 = new Object[4];
            v4[3] = var6_5;
            v4[2] = var5_4;
            v4[1] = var7_6;
            v4[0] = var4_2;
            x44.a("i", (Object)x44.a("m", (Object)this, (long)-5591647319232035917L, (long)var2_3)[var11_9], (Object)v4, (long)-5558132278158434777L, (long)var2_3);
            ++var11_9;
lbl44:
            // 2 sources

            ** while (var9_8 != false)
lbl45:
            // 1 sources

        }
lbl46:
        // 2 sources

        if (var2_3 < 0L) ** GOTO lbl44
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void D(Object[] var1_1) {
        block7: {
            block6: {
                var6_2 = (_ug)var1_1[0];
                var4_3 = (ei)var1_1[1];
                var2_4 = (Long)var1_1[2];
                var5_5 = (_ur)var1_1[3];
                v0 = var2_4;
                var7_6 = v0 ^ 41949882388098L;
                var9_7 = v0 ^ 5233283238230L;
                var11_8 = v0 ^ 6532941254330L;
                var13_9 = v0 ^ 118811520162463L;
                var15_10 = v0 ^ 30735561124277L;
                var18_11 = new wp(0);
                var19_12 = hz.w(x44.a("n", (Object)this, (long)-1637515591730318862L, (long)var2_4).u(), var11_8, var18_11);
                var17_13 = x44.a("r", (long)-856558022885392296L, (long)var2_4);
                try {
                    try {
                        v1 = this;
                        if (var17_13 != false) break block6;
                        x44.a("q", (Object)v1, (int)var18_11.C(var13_9), (long)-639607799997507094L, (long)var2_4);
                        if (var19_12 == null) break block7;
                    }
                    catch (gj v2) {
                        throw x44.a("r", (Object)v2, (long)-1035516407788531222L, (long)var2_4);
                    }
                    v1 = this;
                }
                catch (gj v3) {
                    throw x44.a("r", (Object)v3, (long)-1035516407788531222L, (long)var2_4);
                }
            }
            v4 = new Object[4];
            v4[3] = var15_10;
            v4[2] = var4_3;
            v4[1] = (String)i3.b("l", (int)6185, (long)(2174997590515263545L ^ var2_4)) + this.o(var9_7) + (String)i3.b("l", (int)5014, (long)(1282855323981521800L ^ var2_4));
            v4[0] = var19_12;
            x44.a("q", (Object)v1, (hz)x44.a("j", (Object)var6_2, (Object)v4, (long)-811519495843108576L, (long)var2_4), (long)-591929500252267340L, (long)var2_4);
        }
        var20_14 = 0;
        while (var20_14 < x44.a("n", (Object)this, (long)-1694531831779424476L, (long)var2_4)) {
            v5 = new Object[5];
            v5[4] = var7_6;
            v5[3] = var5_5;
            v5[2] = var4_3;
            v5[1] = var6_2;
            v5[0] = x44.a("n", (Object)this, (long)-591929500252267340L, (long)var2_4);
            x44.a("j", (Object)x44.a("n", (Object)this, (long)-712283271114160184L, (long)var2_4)[var20_14], (Object)v5, (long)-1523547012693909469L, (long)var2_4);
            ++var20_14;
lbl49:
            // 2 sources

            ** while (var17_13 != false)
lbl50:
            // 1 sources

        }
lbl51:
        // 2 sources

        if (var2_4 <= 0L) ** GOTO lbl49
    }

    @Override
    String D(Object[] objectArray) {
        block9: {
            i3 i32;
            long l;
            long l2;
            block10: {
                block11: {
                    CallSite callSite;
                    long l3;
                    block8: {
                        l2 = (Long)objectArray[0];
                        long l4 = l2;
                        l = l4 ^ 0x58B4C0D1EB8CL;
                        l3 = l4 ^ 0x1CD4CF63BDA7L;
                        callSite = x44.a("r", (long)2041427158219499536L, (long)l2);
                        try {
                            try {
                                i32 = this;
                                if (callSite != false) break block8;
                                if (x44.a("n", (Object)i32, (long)56229644792572727L, (long)l2) == false) break block9;
                            }
                            catch (gj gj2) {
                                throw x44.a("r", (Object)gj2, (long)1867135100790569378L, (long)l2);
                            }
                            i32 = this;
                        }
                        catch (gj gj3) {
                            throw x44.a("r", (Object)gj3, (long)1867135100790569378L, (long)l2);
                        }
                    }
                    try {
                        try {
                            if (callSite != false) break block10;
                            if (x44.a("n", (Object)i32, (long)2270224787337278716L, (long)l2) == null) break block11;
                        }
                        catch (gj gj4) {
                            throw x44.a("r", (Object)gj4, (long)1867135100790569378L, (long)l2);
                        }
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l3;
                        return x44.a("j", (Object)x44.a("n", (Object)this, (long)2270224787337278716L, (long)l2), (Object)objectArray2, (long)1997115925441539123L, (long)l2);
                    }
                    catch (gj gj5) {
                        throw x44.a("r", (Object)gj5, (long)1867135100790569378L, (long)l2);
                    }
                }
                i32 = this;
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l;
            return x44.a("j", (Object)i32, (Object)objectArray3, (long)494525810144292348L, (long)l2);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    String K(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var5_3 = (String)var1_1[1];
        var4_4 = (Boolean)var1_1[2];
        v0 = var2_2;
        var6_5 = v0 ^ 134890195676468L;
        var8_6 = v0 ^ 135177542855852L;
        var10_7 = v0 ^ 53142057560256L;
        var13_8 = 0;
        var12_9 = x44.a("p", (long)-5809959798271861990L, (long)var2_2);
        block4: while (var13_8 < x44.a("l", (Object)this, (long)-5532156358278685594L, (long)var2_2)) {
            block9: {
                if (!var4_4) break block9;
                v1 = new Object[1];
                v1[0] = var10_7;
                var14_10 = x44.a("h", (Object)x44.a("l", (Object)this, (long)-5953913192507057014L, (long)var2_2)[var13_8], (Object)v1, (long)-6337945518681503876L, (long)var2_2);
                if (var2_2 <= 0L || var12_9 == false) ** GOTO lbl25
            }
            do {
                block7: {
                    block8: {
                        block6: {
                            v2 = new Object[1];
                            v2[0] = var8_6;
                            var14_10 = x44.a("h", (Object)x44.a("l", (Object)this, (long)-5953913192507057014L, (long)var2_2)[var13_8], (Object)v2, (long)-5420563992703665545L, (long)var2_2);
lbl25:
                            // 2 sources

                            try {
                                try {
                                    v3 = var5_3;
                                    if (var12_9 != false) break block6;
                                    v4 /* !! */  = v3.equals(var14_10);
                                    if (var2_2 <= 0L) break block7;
                                    if (!v4 /* !! */ ) break block8;
                                }
                                catch (gj v5) {
                                    throw x44.a("p", (Object)v5, (long)-6133025226793006424L, (long)var2_2);
                                }
                                v6 = new Object[1];
                                v6[0] = var6_5;
                                v3 = x44.a("h", (Object)x44.a("l", (Object)this, (long)-5953913192507057014L, (long)var2_2)[var13_8], (Object)v6, (long)-5989853674025366906L, (long)var2_2);
                            }
                            catch (gj v7) {
                                throw x44.a("p", (Object)v7, (long)-6133025226793006424L, (long)var2_2);
                            }
                        }
                        return v3;
                    }
                    ++var13_8;
                    v4 /* !! */  = var12_9;
                }
                if (!v4 /* !! */ ) continue block4;
            } while (var2_2 < 0L);
        }
        return null;
    }

    @Override
    public void B(Object[] objectArray) {
        block9: {
            i3 i32;
            CallSite callSite;
            long l;
            Set set;
            long l2;
            block8: {
                l2 = (Long)objectArray[0];
                set = (Set)objectArray[1];
                l = l2 ^ 0L;
                callSite = x44.a("r", (long)-5738478356681882600L, (long)l2);
                try {
                    try {
                        i32 = this;
                        if (callSite != false) break block8;
                        if (x44.a("n", (Object)i32, (long)-5994418742849534145L, (long)l2) == false) break block9;
                    }
                    catch (gj gj2) {
                        throw x44.a("r", (Object)gj2, (long)-5340941491105737302L, (long)l2);
                    }
                    i32 = this;
                }
                catch (gj gj3) {
                    throw x44.a("r", (Object)gj3, (long)-5340941491105737302L, (long)l2);
                }
            }
            try {
                if (x44.a("n", (Object)i32, (long)-5509808812079326988L, (long)l2) != null) {
                    set.add(x44.a("n", (Object)this, (long)-5509808812079326988L, (long)l2));
                }
            }
            catch (gj gj4) {
                throw x44.a("r", (Object)gj4, (long)-5340941491105737302L, (long)l2);
            }
            for (int i = 0; i < x44.a("n", (Object)this, (long)-6035983398455983260L, (long)l2); ++i) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = set;
                objectArray2[0] = l;
                x44.a("j", (Object)x44.a("n", (Object)this, (long)-5594236610677062776L, (long)l2)[i], (Object)objectArray2, (long)-6137789122078860601L, (long)l2);
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void p(Object[] var1_1) {
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
    public String s(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return super.s(objectArray2);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void N(Object[] var1_1) {
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
     * Could not resolve type clashes
     */
    @Override
    public void a(Object[] var1_1) {
        block12: {
            block11: {
                block10: {
                    var5_2 = (Set)var1_1[0];
                    var2_3 = (Set)var1_1[1];
                    var6_4 = (Set)var1_1[2];
                    var7_5 = (Set)var1_1[3];
                    var3_6 = (Long)var1_1[4];
                    var8_7 = var3_6 ^ 95479309648348L;
                    var10_8 = x44.a("u", (long)-2243756808174972746L, (long)var3_6);
                    try {
                        try {
                            v0 = x44.a("i", (Object)this, (long)-108630499273435901L, (long)var3_6);
                            if (var10_8 == false) break block10;
                            if (v0 == null) break block11;
                        }
                        catch (gj v1) {
                            throw x44.a("u", (Object)v1, (long)-570266980623968163L, (long)var3_6);
                        }
                        v0 = x44.a("i", (Object)this, (long)-108630499273435901L, (long)var3_6);
                    }
                    catch (gj v2) {
                        throw x44.a("u", (Object)v2, (long)-570266980623968163L, (long)var3_6);
                    }
                }
                try {
                    try {
                        v3 = v0.b();
                        if (var10_8 == false) break block12;
                        if (v3 == 0) break block11;
                    }
                    catch (gj v4) {
                        throw x44.a("u", (Object)v4, (long)-570266980623968163L, (long)var3_6);
                    }
                    var5_2.add((hy)x44.a("i", (Object)this, (long)-108630499273435901L, (long)var3_6));
                }
                catch (gj v5) {
                    throw x44.a("u", (Object)v5, (long)-570266980623968163L, (long)var3_6);
                }
            }
            v3 = var11_9 = 0;
        }
        while (var11_9 < x44.a("i", (Object)this, (long)-2176142257779306861L, (long)var3_6)) {
            v6 = new Object[6];
            v6[5] = var7_5;
            v6[4] = var8_7;
            v6[3] = var6_4;
            v6[2] = var2_3;
            v6[1] = var5_2;
            v6[0] = x44.a("i", (Object)this, (long)-108630499273435901L, (long)var3_6);
            x44.a("m", (Object)x44.a("i", (Object)this, (long)-24087825332662657L, (long)var3_6)[var11_9], (Object)v6, (long)-13226563279594222L, (long)var3_6);
            ++var11_9;
lbl50:
            // 2 sources

            ** while (var10_8 == false)
lbl51:
            // 1 sources

        }
lbl52:
        // 2 sources

        if (var3_6 <= 0L) ** GOTO lbl50
    }

    @Override
    public boolean q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return super.q(objectArray2);
    }

    @Override
    String X(Object[] objectArray) {
        block5: {
            i3 i32;
            long l;
            block4: {
                l = (Long)objectArray[0];
                CallSite callSite = x44.a("v", (long)-1535815509293737275L, (long)l);
                try {
                    try {
                        i32 = this;
                        if (callSite == false) break block4;
                        if (x44.a("j", (Object)i32, (long)-1491927170369142597L, (long)l) == false) break block5;
                    }
                    catch (gj gj2) {
                        throw x44.a("v", (Object)gj2, (long)-980309382223293906L, (long)l);
                    }
                    i32 = this;
                }
                catch (gj gj3) {
                    throw x44.a("v", (Object)gj3, (long)-980309382223293906L, (long)l);
                }
            }
            String string = ((mx)((Object)x44.a("j", (Object)i32, (long)-1548597664475237834L, (long)l))).u();
            return string.substring(1, string.length() - 1);
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void r(Object[] var1_1) {
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
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    String H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ((mx)((Object)x44.a("h", (Object)this, (long)7016722647348525524L, (long)l))).u();
    }

    /*
     * Exception decompiling
     */
    i3(h8 var1_1, long var2_2, int var4_3, xl var5_4, _xx var6_5, _y4 var7_6) {
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
    public int i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return super.i(objectArray2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        i3.b = ess.a(-3001216682404265479L, 5747259992634830657L, MethodHandles.lookup().lookupClass()).a(98475170372931L);
                        i3.i = new HashMap<K, V>(13);
                        var11 = i3.b ^ 25881828016110L;
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
                        var17_5 = "\u00cc\u00ef\u00f39\u00c6j\u000e3\u00ab\u00aa\u009e\u00c2\u0004[,\u0018\u0010\u00aa;V\u0010p\u00ea\u0006\u00c7\u00c5b3\u00df\u0087|\u0016\u0086\u0010\u00bc\u00ad\u00eauh\u00e3\u00e1\u00a3\u00ecG0\u00e01z\u00a2\u00bc\u0010\u00b0\u00b9\u00a4\u008d\u0000\u00b9U\u00f8G\u00e7\u00f9\u0005=\u00d8&u\u0010a\u0018\u00a3\u00ecu\u00ae\u00e0{v\u00a8\u008bD\u0001\u0080\u0007\u00fa\u0010\u00cc\u00c5\u00f6\u00b9\u00be\u00ffRD54\u00e6Q> o1\u0010~\u00c6\u0091\u0086\u00b0O\u00a2\u0086T,\u00c0\t\u0003q\u00e6b@[\u00fa,\u00c5\u00f4\u00cfYL\u007fN\u0003\u000e\u00e9\u00d6\u00ca\u00c9\u0016\u00d6d\u0006\u000byY\u001e\u0098!4c\u00ddO\u00b1PX\u0004\r\u00e1\u001c\tlw\u00b2\u007fT\u00cc\u00e1\u00f8\u00d3S\u00e9\u00ee(#\u00be\u009e~\u00c5\u00e3\u00e2u\u00e8a\u0011P\u0086\u0010iE\u00c0B\u00a7\u00ff\u00c9\u00ef\u0015K%\u00bd\u00bc[\u0018\u009d\u0010y\u00a5\u00f1\u001e\u009c\u00b1\u0010\u0014H*Y\u00da\u0098\u00d4\u00ef\u00fd 2\u00e2\u00b2\u00f2\u009a;\u00e6Q`\u00daa(\u00d5\u00a3\u00d6l\u00f6=\u009b\u00b3\u0082!\u00e5\u00f7\u00bf\u00f3\u00e0\u00d1\u0085b\u0019\u00cc\u0010K\u00f9\u00c1\u0088\u00b0\u00e4\u00af\u00af\u00d7\u00bdp]J\t\u00cdx\u00100+W\u0011\u00d5\u00e3\u00fb\f\u009e\u00fbm\u009a\u0014\u00ca&K\u0010SL\u00e2\u00a1\u00f6\"m\u00ef\u00fd:&\u00fdRcs\u00dd\u0010\u00db;\u00d8_{\u00a7\u00cehD\u00fb\u00f2aq\u0001\u00cb\u00fa\u0010\u00ea!\u00f6\u00d6\u00eeq\u00c3\u0096\b\u00c2w\u00ff]\u001fL\u00b2";
                        var19_6 = "\u00cc\u00ef\u00f39\u00c6j\u000e3\u00ab\u00aa\u009e\u00c2\u0004[,\u0018\u0010\u00aa;V\u0010p\u00ea\u0006\u00c7\u00c5b3\u00df\u0087|\u0016\u0086\u0010\u00bc\u00ad\u00eauh\u00e3\u00e1\u00a3\u00ecG0\u00e01z\u00a2\u00bc\u0010\u00b0\u00b9\u00a4\u008d\u0000\u00b9U\u00f8G\u00e7\u00f9\u0005=\u00d8&u\u0010a\u0018\u00a3\u00ecu\u00ae\u00e0{v\u00a8\u008bD\u0001\u0080\u0007\u00fa\u0010\u00cc\u00c5\u00f6\u00b9\u00be\u00ffRD54\u00e6Q> o1\u0010~\u00c6\u0091\u0086\u00b0O\u00a2\u0086T,\u00c0\t\u0003q\u00e6b@[\u00fa,\u00c5\u00f4\u00cfYL\u007fN\u0003\u000e\u00e9\u00d6\u00ca\u00c9\u0016\u00d6d\u0006\u000byY\u001e\u0098!4c\u00ddO\u00b1PX\u0004\r\u00e1\u001c\tlw\u00b2\u007fT\u00cc\u00e1\u00f8\u00d3S\u00e9\u00ee(#\u00be\u009e~\u00c5\u00e3\u00e2u\u00e8a\u0011P\u0086\u0010iE\u00c0B\u00a7\u00ff\u00c9\u00ef\u0015K%\u00bd\u00bc[\u0018\u009d\u0010y\u00a5\u00f1\u001e\u009c\u00b1\u0010\u0014H*Y\u00da\u0098\u00d4\u00ef\u00fd 2\u00e2\u00b2\u00f2\u009a;\u00e6Q`\u00daa(\u00d5\u00a3\u00d6l\u00f6=\u009b\u00b3\u0082!\u00e5\u00f7\u00bf\u00f3\u00e0\u00d1\u0085b\u0019\u00cc\u0010K\u00f9\u00c1\u0088\u00b0\u00e4\u00af\u00af\u00d7\u00bdp]J\t\u00cdx\u00100+W\u0011\u00d5\u00e3\u00fb\f\u009e\u00fbm\u009a\u0014\u00ca&K\u0010SL\u00e2\u00a1\u00f6\"m\u00ef\u00fd:&\u00fdRcs\u00dd\u0010\u00db;\u00d8_{\u00a7\u00cehD\u00fb\u00f2aq\u0001\u00cb\u00fa\u0010\u00ea!\u00f6\u00d6\u00eeq\u00c3\u0096\b\u00c2w\u00ff]\u001fL\u00b2".length();
                        var16_7 = 16;
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
                            var20_3[var18_4++] = i3.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00ef\u00cf\u00a8\u0003rSc\n\u00ee\u00d1\u008f9\u00d9\u00eb$$ `\u00eb\u00b7\u00d7?\u0084\u00131\u00e4\u0013\u0017\u0013\u00e6Ck\f\u0096\u001c\u0004>=@\f\u00a2kA\u0005O\u00b5K5g";
                            var19_6 = "\u00ef\u00cf\u00a8\u0003rSc\n\u00ee\u00d1\u008f9\u00d9\u00eb$$ `\u00eb\u00b7\u00d7?\u0084\u00131\u00e4\u0013\u0017\u0013\u00e6Ck\f\u0096\u001c\u0004>=@\f\u00a2kA\u0005O\u00b5K5g".length();
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
                            var20_3[var18_4++] = i3.c(var21_9).intern();
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
                i3.g = var20_3;
                i3.h = new String[18];
                i3.n = new HashMap<K, V>(13);
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
                var6_12 = new long[9];
                var3_13 = 0;
                var4_14 = "\u00de\u00a4\u000f\u00c3\u0017\u00a7S'Q\u0002\u00e9\u000f\u008f\u00d7&\u001f\u009c\u0086\u0087\u00b7\u00e5\u00bfq\u00c9\u0010\u0005\n\u008cD\u00a3F\n\u0081\u00d8\u0099\u008eI\u00e0\u00d4\u0086\u007fu\u00a8<\u00b8\u00dc YOc\u007fo^\u00cc\u0085\u00d7";
                var5_15 = "\u00de\u00a4\u000f\u00c3\u0017\u00a7S'Q\u0002\u00e9\u000f\u008f\u00d7&\u001f\u009c\u0086\u0087\u00b7\u00e5\u00bfq\u00c9\u0010\u0005\n\u008cD\u00a3F\n\u0081\u00d8\u0099\u008eI\u00e0\u00d4\u0086\u007fu\u00a8<\u00b8\u00dc YOc\u007fo^\u00cc\u0085\u00d7".length();
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
                    var4_14 = "[g\u009a\u007f(QS\t\u00d1\b[NW-\u00a3\u0010";
                    var5_15 = "[g\u009a\u007f(QS\t\u00d1\b[NW-\u00a3\u0010".length();
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
        i3.k = var6_12;
        i3.m = new Integer[9];
    }

    private static gj a(gj gj2) {
        return gj2;
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x55DE;
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
                throw new RuntimeException("com/zelix/i3", exception);
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
            i3.h[n2] = i3.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = i3.b(n, l);
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
            throw new RuntimeException("com/zelix/i3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x9C2;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i3.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i3.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/i3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            i3.m[n2] = n3;
        }
        return m[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = i3.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/i3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(i3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(i3.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
