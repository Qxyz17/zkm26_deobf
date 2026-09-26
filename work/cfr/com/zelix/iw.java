/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.df;
import com.zelix.el;
import com.zelix.h1;
import com.zelix.hz;
import com.zelix.iq;
import com.zelix.l6q;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.m7;
import com.zelix.n9;
import com.zelix.nc;
import com.zelix.oz;
import com.zelix.prr;
import com.zelix.v7;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class iw
extends oz
implements el {
    int u;
    int i;
    List Z;
    iq[] g;
    private static final long a = prr.a(-2407787263643714259L, -6355597064814010845L, MethodHandles.lookup().lookupClass()).a(49329889769780L);

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
                        if (l10 >= 0L) {
                            if (object == false) break block5;
                            object = n10;
                        }
                        if (bl2 < object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-2851170302078856102L, (long)l10);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-2851170302078856102L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public boolean L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    iw(int n10, h1 h12, int n11, char c10, char c11, int n12) {
        long l10 = ((long)n11 << 32 | (long)c10 << 48 >>> 32 | (long)c11 << 48 >>> 48) ^ a;
        super(n10);
        m44.a("p", (Object)this, (int)n12, (long)2495162215121247877L, (long)l10);
        m44.a("p", (Object)this, (int)m44.a("l", (Object)new Object[]{n12}, (long)2468074967557240609L, (long)l10), (long)4076666663795249492L, (long)l10);
        m44.a("s", (Object)h12, (long)((long)m44.a("r", (Object)this, (long)4076666663795249492L, (long)l10)), (long)2850441467488977746L, (long)l10);
    }

    @Override
    public boolean N() {
        return true;
    }

    @Override
    public final void Q(Map map, l6q l6q2, List list, long l10) {
        long l11 = l10 ^ 0x3CAB7583A160L;
        this.Z = null;
        CallSite callSite = m44.a("o", (long)-3097945099772748067L, (long)l10);
        for (int i10 = 0; i10 < this.g.length; ++i10) {
            nc nc2;
            block4: {
                nc nc3;
                block3: {
                    iq iq2 = this.g[i10];
                    nc2 = null;
                    nc3 = nc2 = (nc)map.get(iq2);
                    try {
                        if (callSite == false) break block3;
                        if (nc3 != null) break block4;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-3935075971348085417L, (long)l10);
                    }
                    nc2 = new nc();
                    list.add(nc2);
                    nc3 = map.put(iq2, nc2);
                }
                nc nc4 = nc3;
            }
            l6q2.t(this, nc2, l11);
            if (callSite != false) continue;
        }
    }

    @Override
    public boolean d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public void d(Integer n10, iq iq2, long l10) {
        long l11 = l10 ^ 0x66C9424EC537L;
        int n11 = this.g.length;
        CallSite callSite = m44.a("n", (long)4672507789549291755L, (long)l10);
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = true;
        m44.a("q", (Object)iq2, (Object)objectArray, (long)4953808353644756951L, (long)l10);
        int n12 = 0;
        while (n12 < n11) {
            CallSite callSite2;
            block9: {
                block10: {
                    block11: {
                        block12: {
                            Integer n13 = (Integer)this.Z.get(n12);
                            try {
                                int n14;
                                iq[] iqArray;
                                try {
                                    try {
                                        try {
                                            callSite2 = callSite;
                                            if (l10 <= 0L) break block9;
                                            if (callSite2 != false) break block10;
                                            if (!n13.equals(n10)) break block11;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("n", (Object)n92, (long)4857934781499887454L, (long)l10);
                                        }
                                        iqArray = this.g;
                                        n14 = n12;
                                        if (callSite != false) break block12;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("n", (Object)n93, (long)4857934781499887454L, (long)l10);
                                    }
                                    if (iqArray[n14] != null) break block11;
                                }
                                catch (n9 n94) {
                                    throw m44.a("n", (Object)n94, (long)4857934781499887454L, (long)l10);
                                }
                                iqArray = this.g;
                                n14 = n12;
                            }
                            catch (n9 n95) {
                                throw m44.a("n", (Object)n95, (long)4857934781499887454L, (long)l10);
                            }
                        }
                        iqArray[n14] = iq2;
                    }
                    ++n12;
                }
                callSite2 = callSite;
            }
            if (callSite2 == false) continue;
        }
    }

    @Override
    public boolean S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public final boolean Y(long l10, int n10, int n11) {
        boolean bl2;
        block5: {
            block6: {
                CallSite callSite = m44.a("k", (long)6173625216586931614L, (long)l10);
                try {
                    try {
                        bl2 = n10;
                        Object object = callSite;
                        if (l10 > 0L) {
                            if (object != false) break block5;
                            object = n11;
                        }
                        if (bl2 < object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)6205911404487825963L, (long)l10);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)6205911404487825963L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public m7 i(long l10) {
        return m44.a("k", (long)-5891862527333598110L, (long)l10);
    }

    @Override
    public String R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3A32AF8F9793L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 56);
        int n12 = (int)(l11 << 40 >>> 40);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n12;
        objectArray2[1] = (int)((byte)n11);
        objectArray2[0] = n10;
        return m44.a("w", (Object)this, (Object)objectArray2, (long)2829288529623150650L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List L(Object[] objectArray) {
        ArrayList<iq> arrayList;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        ArrayList<iq> arrayList2 = new ArrayList<iq>(this.g.length);
        CallSite callSite = m44.a("i", (long)-8176287171637525157L, (long)l10);
        iq[] iqArray = this.g;
        int n10 = iqArray.length;
        int n11 = 0;
        block2: while (n11 < n10) {
            iq iq2 = iqArray[n11];
            try {
                do {
                    if (l10 >= 0L) {
                        arrayList = arrayList2;
                        if (callSite == false) return arrayList;
                        arrayList.add(iq2);
                        ++n11;
                    }
                    if (callSite != false) continue block2;
                } while (l10 < 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("i", (Object)n92, (long)-7861648620384477487L, (long)l10);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    @Override
    public final hz n(hz hz2, boolean bl2, char c10, int n10, boolean bl3, loj loj2, char c11, String string) {
        long l10;
        long l11 = l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)c11 << 48 >>> 48;
        long l12 = l11 ^ 0x5A73015BC1DL;
        long l13 = l11 ^ 0x67D45B4239BAL;
        long l14 = l11 ^ 0x4D53AB9156L;
        v7[] v7Array = hz2.X();
        v7[] v7Array2 = hz2.T();
        int n11 = v7Array.length;
        v7[] v7Array3 = v7.I(n11 - 1, l14);
        System.arraycopy(v7Array, 0, v7Array3, 0, n11 - 1);
        return new hz(v7Array3, v7Array2, l13, hz2.j(), hz2.k(l12));
    }

    @Override
    public final boolean T(long l10) {
        return false;
    }

    static int J(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        return (4 - (n10 + 1) % 4) % 4;
    }

    @Override
    public void X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        df df2 = (df)objectArray[1];
        long l11 = l10 ^ 0x6F3E14B71D18L;
        long l12 = l11 >>> 16;
        int n10 = (int)(l11 << 48 >>> 48);
        iq[] iqArray = this.g;
        int n11 = iqArray.length;
        CallSite callSite = m44.a("i", (long)-5217550765958136757L, (long)l10);
        for (int i10 = 0; i10 < n11; ++i10) {
            iq iq2 = iqArray[i10];
            df2.L(l12, (char)n10, iq2, this);
            if (callSite != false) continue;
        }
    }

    @Override
    public final boolean e(long l10, int n10) {
        return false;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void G(short var1_1, int var2_2, DataOutputStream var3_3, int var4_4) {
        var5_5 = (long)var1_1 << 48 | (long)var2_2 << 32 >>> 16 | (long)var4_4 << 48 >>> 48;
        v0 = var5_5 ^ 0L;
        var7_6 = (int)(v0 >>> 48);
        var8_7 = (int)(v0 << 16 >>> 32);
        var9_8 = (int)(v0 << 48 >>> 48);
        v1 = m44.a("m", (long)1757326295451471952L, (long)var5_5);
        super.G((short)var7_6, var8_7, var3_3, var9_8);
        var11_9 = 0;
        var10_11 = v1;
        while (var11_9 < m44.a("s", (Object)this, (long)187530747046095709L, (long)var5_5)) {
            var3_3.writeByte(0);
            ++var11_9;
lbl15:
            // 2 sources

            ** while (var10_11 != false)
lbl16:
            // 1 sources

        }
lbl17:
        // 2 sources

        if (var1_1 < 0) ** GOTO lbl15
        var11_10 = this.g[this.g.length - 1];
        m44.a("r", (Object)var3_3, (int)(var11_10.B() - m44.a("s", (Object)this, (long)1777123409618232460L, (long)var5_5)), (long)2304601887738989656L, (long)var5_5);
    }

    public iw(int n10) {
        super(n10);
    }

    @Override
    public void P(long l10, int n10) {
        m44.a("q", (Object)this, (int)n10, (long)6125429975390890276L, (long)l10);
        CallSite callSite = m44.a("m", (Object)new Object[]{n10}, (long)6188266739423969408L, (long)l10);
        m44.a("q", (Object)this, (int)callSite, (long)5706698925822584565L, (long)l10);
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}

