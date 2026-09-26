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
    private static final long a = prr.a((long)-2407787263643714259L, (long)-6355597064814010845L, MethodHandles.lookup().lookupClass()).a(49329889769780L);

    public final boolean v(Object[] objectArray) {
        boolean bl;
        block5: {
            block6: {
                boolean bl2 = ((Integer)objectArray[0]).intValue();
                v7 v72 = (v7)objectArray[1];
                long l = (Long)objectArray[2];
                int n = (Integer)objectArray[3];
                CallSite callSite = m44.a("j", (long)-4319878175848984624L, (long)l);
                try {
                    try {
                        bl = bl2;
                        Object object = callSite;
                        if (l >= 0L) {
                            if (object == false) break block5;
                            object = n;
                        }
                        if (bl < object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-2851170302078856102L, (long)l);
                    }
                    bl = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-2851170302078856102L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    iw(int n, h1 h12, int n2, char c, char c2, int n3) {
        long l = ((long)n2 << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ a;
        super(n);
        m44.a("p", (Object)((Object)this), (int)n3, (long)2495162215121247877L, (long)l);
        m44.a("p", (Object)((Object)this), (int)m44.a("l", (Object)new Object[]{n3}, (long)2468074967557240609L, (long)l), (long)4076666663795249492L, (long)l);
        m44.a("s", (Object)h12, (long)((long)m44.a("r", (Object)((Object)this), (long)4076666663795249492L, (long)l)), (long)2850441467488977746L, (long)l);
    }

    public boolean N() {
        return true;
    }

    public final void Q(Map map, l6q l6q2, List list, long l) {
        long l2 = l ^ 0x3CAB7583A160L;
        this.Z = null;
        CallSite callSite = m44.a("o", (long)-3097945099772748067L, (long)l);
        for (int i = 0; i < this.g.length; ++i) {
            nc nc2;
            block4: {
                nc nc3;
                block3: {
                    iq iq2 = this.g[i];
                    nc2 = null;
                    nc3 = nc2 = (nc)map.get(iq2);
                    try {
                        if (callSite == false) break block3;
                        if (nc3 != null) break block4;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-3935075971348085417L, (long)l);
                    }
                    nc2 = new nc();
                    list.add(nc2);
                    nc3 = map.put(iq2, nc2);
                }
                nc nc4 = nc3;
            }
            l6q2.t((Object)this, (Object)nc2, l2);
            if (callSite != false) continue;
        }
    }

    public boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public void d(Integer n, iq iq2, long l) {
        long l2 = l ^ 0x66C9424EC537L;
        int n2 = this.g.length;
        CallSite callSite = m44.a("n", (long)4672507789549291755L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = true;
        m44.a("q", (Object)iq2, (Object)objectArray, (long)4953808353644756951L, (long)l);
        int n3 = 0;
        while (n3 < n2) {
            CallSite callSite2;
            block9: {
                block10: {
                    block11: {
                        block12: {
                            Integer n4 = (Integer)this.Z.get(n3);
                            try {
                                int n5;
                                iq[] iqArray;
                                try {
                                    try {
                                        try {
                                            callSite2 = callSite;
                                            if (l <= 0L) break block9;
                                            if (callSite2 != false) break block10;
                                            if (!n4.equals(n)) break block11;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("n", (Object)((Object)n92), (long)4857934781499887454L, (long)l);
                                        }
                                        iqArray = this.g;
                                        n5 = n3;
                                        if (callSite != false) break block12;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("n", (Object)((Object)n93), (long)4857934781499887454L, (long)l);
                                    }
                                    if (iqArray[n5] != null) break block11;
                                }
                                catch (n9 n94) {
                                    throw m44.a("n", (Object)((Object)n94), (long)4857934781499887454L, (long)l);
                                }
                                iqArray = this.g;
                                n5 = n3;
                            }
                            catch (n9 n95) {
                                throw m44.a("n", (Object)((Object)n95), (long)4857934781499887454L, (long)l);
                            }
                        }
                        iqArray[n5] = iq2;
                    }
                    ++n3;
                }
                callSite2 = callSite;
            }
            if (callSite2 == false) continue;
        }
    }

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public final boolean Y(long l, int n, int n2) {
        boolean bl;
        block5: {
            block6: {
                CallSite callSite = m44.a("k", (long)6173625216586931614L, (long)l);
                try {
                    try {
                        bl = n;
                        Object object = callSite;
                        if (l > 0L) {
                            if (object != false) break block5;
                            object = n2;
                        }
                        if (bl < object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)6205911404487825963L, (long)l);
                    }
                    bl = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)6205911404487825963L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public m7 i(long l) {
        return m44.a("k", (long)-5891862527333598110L, (long)l);
    }

    public String R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x3A32AF8F9793L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 56);
        int n3 = (int)(l2 << 40 >>> 40);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n3;
        objectArray2[1] = (int)((byte)n2);
        objectArray2[0] = n;
        return m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)2829288529623150650L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List L(Object[] objectArray) {
        ArrayList<iq> arrayList;
        long l = (Long)objectArray[0];
        l = a ^ l;
        ArrayList<iq> arrayList2 = new ArrayList<iq>(this.g.length);
        CallSite callSite = m44.a("i", (long)-8176287171637525157L, (long)l);
        iq[] iqArray = this.g;
        int n = iqArray.length;
        int n2 = 0;
        block2: while (n2 < n) {
            iq iq2 = iqArray[n2];
            try {
                do {
                    if (l >= 0L) {
                        arrayList = arrayList2;
                        if (callSite == false) return arrayList;
                        arrayList.add(iq2);
                        ++n2;
                    }
                    if (callSite != false) continue block2;
                } while (l < 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("i", (Object)((Object)n92), (long)-7861648620384477487L, (long)l);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    public final hz n(hz hz2, boolean bl, char c, int n, boolean bl2, loj loj2, char c2, String string) {
        long l;
        long l2 = l = (long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48;
        long l3 = l2 ^ 0x5A73015BC1DL;
        long l4 = l2 ^ 0x67D45B4239BAL;
        long l5 = l2 ^ 0x4D53AB9156L;
        v7[] v7Array = hz2.X();
        v7[] v7Array2 = hz2.T();
        int n2 = v7Array.length;
        v7[] v7Array3 = v7.I((int)(n2 - 1), (long)l5);
        System.arraycopy(v7Array, 0, v7Array3, 0, n2 - 1);
        return new hz(v7Array3, v7Array2, l4, hz2.j(), hz2.k(l3));
    }

    public final boolean T(long l) {
        return false;
    }

    static int J(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        return (4 - (n + 1) % 4) % 4;
    }

    public void X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        df df2 = (df)objectArray[1];
        long l2 = l ^ 0x6F3E14B71D18L;
        long l3 = l2 >>> 16;
        int n = (int)(l2 << 48 >>> 48);
        iq[] iqArray = this.g;
        int n2 = iqArray.length;
        CallSite callSite = m44.a("i", (long)-5217550765958136757L, (long)l);
        for (int i = 0; i < n2; ++i) {
            iq iq2 = iqArray[i];
            df2.L(l3, (char)n, (Object)iq2, (Object)this);
            if (callSite != false) continue;
        }
    }

    public final boolean e(long l, int n) {
        return false;
    }

    /*
     * Unable to fully structure code
     */
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

    public iw(int n) {
        super(n);
    }

    public void P(long l, int n) {
        m44.a("q", (Object)((Object)this), (int)n, (long)6125429975390890276L, (long)l);
        CallSite callSite = m44.a("m", (Object)new Object[]{n}, (long)6188266739423969408L, (long)l);
        m44.a("q", (Object)((Object)this), (int)callSite, (long)5706698925822584565L, (long)l);
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}
