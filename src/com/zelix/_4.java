/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix._h;
import com.zelix._v;
import com.zelix.b1;
import com.zelix.b4;
import com.zelix.gu;
import com.zelix.hp;
import com.zelix.js;
import com.zelix.kw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o9;
import com.zelix.prr;
import com.zelix.to;
import java.lang.invoke.MethodHandles;

public abstract class _4
extends _h
implements hp {
    static final o9 S;
    private static boolean z;
    private _4 v;
    private static final long cb;

    void r(Object[] objectArray) {
        _4 _42 = (_4)((Object)objectArray[0]);
        this.v = _42;
    }

    /*
     * Unable to fully structure code
     */
    public _v G(long var1_1) {
        block3: {
            var4_2 = this;
            var3_3 = m44.a("k", (long)-3570548350852153542L, (long)var1_1);
            while (var4_2.v != null) {
                v0 = var4_2.v;
                if (var3_3 != false) {
                    var4_2 = v0;
lbl7:
                    // 2 sources

                    ** while (var3_3 == false)
lbl8:
                    // 1 sources

                    continue;
                }
                break block3;
            }
lbl10:
            // 2 sources

            if (var1_1 < 0L) ** GOTO lbl7
            v0 = var4_2;
        }
        return (_v)v0;
    }

    /*
     * Unable to fully structure code
     */
    final int J(long var1_1) {
        block17: {
            block18: {
                block15: {
                    block16: {
                        block13: {
                            block14: {
                                var1_1 = _4.cb ^ var1_1;
                                var3_2 = m44.a("n", (long)-6701357486701096009L, (long)var1_1);
                                try {
                                    try {
                                        v0 = this.v instanceof _v;
                                        if (var3_2 == false) break block13;
                                        if (v0 == 0) break block14;
                                    }
                                    catch (n9 v1) {
                                        throw m44.a("n", (Object)v1, (long)-4714199894865100146L, (long)var1_1);
                                    }
                                    return 1;
                                }
                                catch (n9 v2) {
                                    throw m44.a("n", (Object)v2, (long)-4714199894865100146L, (long)var1_1);
                                }
                            }
                            v0 = this.v instanceof b4;
                        }
                        try {
                            try {
                                v3 = var3_2;
                                if (var1_1 >= 0L) {
                                    if (v3 == false) break block15;
                                    if (v0 == 0) break block16;
                                }
                                ** GOTO lbl36
                            }
                            catch (n9 v4) {
                                throw m44.a("n", (Object)v4, (long)-4714199894865100146L, (long)var1_1);
                            }
                            return 2;
                        }
                        catch (n9 v5) {
                            throw m44.a("n", (Object)v5, (long)-4714199894865100146L, (long)var1_1);
                        }
                    }
                    v0 = this.v instanceof b1;
                }
                try {
                    try {
                        v3 = var3_2;
lbl36:
                        // 2 sources

                        if (v3 == false) break block17;
                        if (v0 == 0) break block18;
                    }
                    catch (n9 v6) {
                        throw m44.a("n", (Object)v6, (long)-4714199894865100146L, (long)var1_1);
                    }
                    return 3;
                }
                catch (n9 v7) {
                    throw m44.a("n", (Object)v7, (long)-4714199894865100146L, (long)var1_1);
                }
            }
            v0 = 4;
        }
        return v0;
    }

    public static boolean c() {
        boolean bl = _4.q();
        return !bl;
    }

    public to m(long l) {
        long l2 = l ^ 0L;
        return m44.a("r", (Object)((Object)this.v), (long)l2, (long)-8811290108558233872L, (long)l);
    }

    static {
        cb = prr.a((long)3739401218190065652L, (long)-7329193758785788370L, MethodHandles.lookup().lookupClass()).a(249852454171711L);
        long l = cb ^ 0x623012956A47L;
        long l2 = l ^ 0x135D4BB24896L;
        S = o9.f((long)l2);
        m44.a("j", (boolean)true, (long)8605677338683872019L, (long)l);
    }

    public String z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("t", (Object)((Object)this.v), (Object)objectArray2, (long)2438632899999309377L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    final _v z(long var1_1, _v var3_2) {
        block11: {
            block10: {
                v0 = var1_1 = _4.cb ^ var1_1;
                var4_3 = v0 ^ 67233830465663L;
                var6_4 = v0 ^ 121237152644339L;
                var8_5 = v0 ^ 87605156061688L;
                v1 = v0 ^ 117167438448861L;
                var10_6 = (int)(v1 >>> 48);
                var11_7 = (int)(v1 << 16 >>> 48);
                var12_8 = (int)(v1 << 32 >>> 32);
                var15_9 = this.G(var8_5);
                var13_10 = m44.a("k", (long)-589159283250912459L, (long)var1_1);
                try {
                    try {
                        try {
                            v2 /* !! */  = var15_9;
                            if (var13_10 != false) break block10;
                            if (v2 /* !! */ .n(var4_3)) {
                            }
                            ** GOTO lbl42
                        }
                        catch (n9 v3) {
                            throw m44.a("k", (Object)v3, (long)-871833078139744261L, (long)var1_1);
                        }
                        v2 /* !! */  = var3_2;
                        if (var13_10 != false) break block10;
                    }
                    catch (n9 v4) {
                        throw m44.a("k", (Object)v4, (long)-871833078139744261L, (long)var1_1);
                    }
                    if (v2 /* !! */ .P((char)var10_6, (short)var11_7, var12_8)) {
                    }
                    ** GOTO lbl42
                }
                catch (n9 v5) {
                    throw m44.a("k", (Object)v5, (long)-871833078139744261L, (long)var1_1);
                }
                v6 = new Object[2];
                v6[1] = m44.a("t", (Object)var15_9, (Object)new Object[0], (long)-652371553930710421L, (long)var1_1);
                v6[0] = var6_4;
                v2 /* !! */  = m44.a("t", (Object)var3_2, (Object)v6, (long)-1292508440751181210L, (long)var1_1);
                if (var1_1 < 0L) break block10;
                var14_11 = v2 /* !! */ ;
                try {
                    if (var13_10 == false) break block11;
lbl42:
                    // 3 sources

                    v2 /* !! */  = var3_2;
                }
                catch (n9 v7) {
                    throw m44.a("k", (Object)v7, (long)-871833078139744261L, (long)var1_1);
                }
            }
            var14_11 = v2 /* !! */ ;
        }
        return var14_11;
    }

    public String O(long l, int n) {
        long l2 = l << 32 | (long)n << 32 >>> 32;
        long l3 = l2 ^ 0L;
        long l4 = l3 >>> 32;
        int n2 = (int)(l3 << 32 >>> 32);
        return m44.a("p", (Object)((Object)this.v), (long)l4, (int)n2, (long)2393136833806562469L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    public final kw B(Object[] var1_1) {
        block8: {
            var2_2 = (Long)var1_1[0];
            var2_2 = _4.cb ^ var2_2;
            var5_3 = this;
            var4_4 = m44.a("i", (long)-1429710921175949984L, (long)var2_2);
            block4: while (var5_3.v != null) {
                try {
                    try {
                        v0 = var5_3;
                        v1 = var4_4;
                        if (var2_2 >= 0L) {
                            if (v1 == false) break block8;
                            v1 = var4_4;
                        }
                        if (v1 == false) break block8;
                    }
                    catch (n9 v2) {
                        throw m44.a("i", (Object)v2, (long)-1133614566460584871L, (long)var2_2);
                    }
                    if (!(v0 instanceof kw)) {
                    }
                    ** GOTO lbl26
                }
                catch (n9 v3) {
                    throw m44.a("i", (Object)v3, (long)-1133614566460584871L, (long)var2_2);
                }
                do {
                    var5_3 = var5_3.v;
                    if (var4_4 != false) continue block4;
lbl26:
                    // 3 sources

                } while (var2_2 < 0L);
            }
            v0 = var5_3;
        }
        return (kw)v0;
    }

    public String w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("p", (Object)((Object)this.v), (Object)objectArray2, (long)-2278070652470652775L, (long)l);
    }

    public _4(_4 _42) {
        this.v = _42;
    }

    public String K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return "";
    }

    abstract void z(gu var1, long var2);

    public String u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("t", (Object)((Object)this.v), (Object)objectArray2, (long)2369969407298868279L, (long)l);
    }

    public _4 H() {
        return this.v;
    }

    public String f(long l) {
        long l2 = l ^ 0L;
        return this.v.f(l2);
    }

    public boolean a(Object[] objectArray) {
        return false;
    }

    public static boolean q() {
        return z;
    }

    public String h(long l) {
        long l2 = l ^ 0L;
        return this.v.h(l2);
    }

    public static void z(boolean bl) {
        z = bl;
    }

    public js m(long l, int n) {
        long l2 = l ^ 0L;
        return this.v.m(l2, n);
    }

    final _f B(_f _f2, short s, int n, char c) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ cb;
        long l2 = l ^ 0xC09D76E1191L;
        return (_f)m44.a("w", (Object)((Object)this), (long)l2, (Object)_f2, (long)-694115722771139348L, (long)l);
    }

    public String T(long l) {
        long l2 = l ^ 0L;
        return m44.a("t", (Object)((Object)this.v), (long)l2, (long)1949620101158451283L, (long)l);
    }

    public String p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("p", (Object)((Object)this.v), (Object)objectArray2, (long)-6734324870748802042L, (long)l);
    }

    public String j(long l) {
        long l2 = l ^ 0L;
        return this.v.j(l2);
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}
