/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.az;
import com.zelix.bc;
import com.zelix.fh;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.p;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lkv
implements p {
    private List y;
    private bc w;
    private int[] o;
    private static final long a = prr.a((long)-3800843942936829310L, (long)-5021199647800879659L, MethodHandles.lookup().lookupClass()).a(200005614020798L);

    public void m(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        CallSite callSite = m44.a("l", (long)-2862697837967726323L, (long)l);
        for (int i = n; i < this.y.size(); ++i) {
            az az2 = (az)this.y.get(i);
            m44.a("s", (Object)az2, (Object)new Object[0], (long)-2754607004564640182L, (long)l);
            m44.a("s", (Object)az2, (Object)new Object[0], (long)-4176011279473230726L, (long)l);
            if (callSite != false) continue;
        }
    }

    lkv(bc bc2, long l, int n) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x1CC6B1271FB2L;
        long l4 = l2 ^ 0x38343AA210AFL;
        m44.a("s", (Object)this, (bc)bc2, (long)-6444193284314726130L, (long)l);
        this.y = new ArrayList(n);
        String string = m44.a("q", (Object)this, (long)-6444193284314726130L, (long)l).g().V();
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = string;
        objectArray2[0] = (boolean)m44.a("p", (Object)m44.a("q", (Object)this, (long)-6444193284314726130L, (long)l), (Object)objectArray, (long)-4758187896134406389L, (long)l);
        m44.a("n", (Object)this, (Object)objectArray2, (long)-4670559953864590788L, (long)l);
    }

    public void C(Object[] objectArray) {
        block10: {
            int n = (Integer)objectArray[0];
            long l = (Long)objectArray[1];
            int n2 = (Integer)objectArray[2];
            long l2 = (l = a ^ l) ^ 0x45C882C2EE70L;
            int n3 = this.y.size();
            int n4 = n3 - n;
            int n5 = n;
            CallSite callSite = m44.a("k", (long)7265022312399771034L, (long)l);
            try {
                if (n4 == 0) {
                    return;
                }
            }
            catch (n9 n92) {
                throw m44.a("k", (Object)((Object)n92), (long)7304262190002180334L, (long)l);
            }
            ArrayList<az> arrayList = new ArrayList<az>(n5);
            int n6 = n4;
            block4: while (n6 < n3) {
                az az2 = (az)this.y.remove(n4);
                try {
                    arrayList.add(az2);
                    ++n6;
                    do {
                        CallSite callSite2 = callSite;
                        if (l > 0L) {
                            if (callSite2 == false) break block10;
                            callSite2 = callSite;
                        }
                        if (callSite2 != false) continue block4;
                    } while (l < 0L);
                    break;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)7304262190002180334L, (long)l);
                }
            }
            m44.a("t", (Object)this.y, (int)n2, arrayList, (long)9025952554227153297L, (long)l);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            m44.a("t", (Object)this, (Object)objectArray2, (long)9071197306371904002L, (long)l);
        }
    }

    private void u(Object[] objectArray) {
        int n;
        CallSite callSite;
        int n2;
        CallSite callSite2;
        int n3;
        int n4;
        int n5;
        long l;
        block11: {
            int n6;
            block12: {
                int n7 = ((Boolean)objectArray[0]).booleanValue();
                String string = (String)objectArray[1];
                l = (Long)objectArray[2];
                long l2 = l = a ^ l;
                long l3 = l2 ^ 0x73AEBA6CB03EL;
                n5 = (int)(l3 >>> 32);
                n4 = (int)(l3 << 32 >>> 48);
                n3 = (int)(l3 << 48 >>> 48);
                long l4 = l2 ^ 0xC40C6BE8745L;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = string;
                objectArray2[0] = l4;
                callSite2 = m44.a("m", (Object)objectArray2, (long)6220836354906115676L, (long)l);
                n2 = 0;
                callSite = m44.a("m", (long)5216481682449964163L, (long)l);
                try {
                    try {
                        n6 = n7;
                        if (callSite != false) break block11;
                        if (n6 != 0) break block12;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)5887227951096701952L, (long)l);
                    }
                    this.y.add(new az(n2++));
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)5887227951096701952L, (long)l);
                }
            }
            n6 = n = 0;
        }
        while (n < callSite2.size()) {
            CallSite callSite3;
            block15: {
                block13: {
                    String string = (String)callSite2.get(n);
                    try {
                        Object object;
                        block14: {
                            try {
                                try {
                                    Object[] objectArray3 = new Object[4];
                                    objectArray3[3] = (int)((char)n3);
                                    objectArray3[2] = (int)((char)n4);
                                    objectArray3[1] = n5;
                                    objectArray3[0] = string;
                                    object = m44.a("m", (Object)objectArray3, (long)6205169813808316779L, (long)l);
                                    if (callSite != false) break block13;
                                    if (object == false) break block14;
                                }
                                catch (n9 n94) {
                                    throw m44.a("m", (Object)((Object)n94), (long)5887227951096701952L, (long)l);
                                }
                                this.y.add(new az(n2++, true, false));
                                this.y.add(new az(n2++, false, true));
                                callSite3 = callSite;
                                if (l <= 0L) break block15;
                                if (callSite3 == false) break block13;
                            }
                            catch (n9 n95) {
                                throw m44.a("m", (Object)((Object)n95), (long)5887227951096701952L, (long)l);
                            }
                        }
                        object = this.y.add(new az(n2++));
                    }
                    catch (n9 n96) {
                        throw m44.a("m", (Object)((Object)n96), (long)5887227951096701952L, (long)l);
                    }
                }
                ++n;
                callSite3 = callSite;
            }
            if (callSite3 == false) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void l(Object[] var1_1) {
        block28: {
            block29: {
                var6_2 = (Integer)var1_1[0];
                var4_3 = (Integer)var1_1[1];
                var5_4 = (Random)var1_1[2];
                var2_5 = (Long)var1_1[3];
                var7_6 = (var2_5 = lkv.a ^ var2_5) ^ 24304879025742L;
                var10_7 = new ArrayList<ArrayList<E>>(this.y.size());
                var11_8 = var6_2;
                var9_9 = m44.a("m", (long)-5409710873649560156L, (long)var2_5);
                while (var11_8 < var4_3) {
                    block37: {
                        block31: {
                            block34: {
                                block32: {
                                    var12_10 = new ArrayList<az>();
                                    var10_7.add(var12_10);
                                    var13_11 = (az)this.y.get(var11_8);
                                    var12_10.add(var13_11);
                                    if (var2_5 < 0L) break block28;
                                    v0 = var11_8;
                                    if (var9_9 == false) break block29;
                                    var14_12 = v0;
                                    do {
                                        block35: {
                                            block30: {
                                                block38: {
                                                    if (var13_11.y()) break block38;
                                                    try {
                                                        block33: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v1 /* !! */  = var13_11.J();
                                                                        v2 = var9_9;
                                                                        if (var2_5 > 0L) {
                                                                            if (v2 == false) break block30;
                                                                            if (var9_9 == false) break block31;
                                                                        }
                                                                        ** GOTO lbl65
                                                                    }
                                                                    catch (n9 v3) {
                                                                        throw m44.a("m", (Object)v3, (long)-5376277533328588592L, (long)var2_5);
                                                                    }
                                                                    if (var2_5 <= 0L) break block32;
                                                                    if (!v1 /* !! */ ) break;
                                                                }
                                                                catch (n9 v4) {
                                                                    throw m44.a("m", (Object)v4, (long)-5376277533328588592L, (long)var2_5);
                                                                }
                                                                v5 = var14_12;
                                                                v6 = var4_3 - 1;
                                                                v7 /* !! */  = (int)var9_9;
lbl45:
                                                                // 2 sources

                                                                while (v7 /* !! */  != 0) {
                                                                    break block33;
                                                                }
                                                                break block34;
                                                            }
                                                            catch (n9 v8) {
                                                                throw m44.a("m", (Object)v8, (long)-5376277533328588592L, (long)var2_5);
                                                            }
                                                        }
                                                        if (v5 >= v6) break;
                                                    }
                                                    catch (n9 v9) {
                                                        throw m44.a("m", (Object)v9, (long)-5376277533328588592L, (long)var2_5);
                                                    }
                                                }
                                                var13_11 = (az)this.y.get(++var14_12);
                                                v1 /* !! */  = var13_11.y();
                                            }
                                            try {
                                                block36: {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var2_5 < 0L) continue;
                                                                v2 = var9_9;
lbl65:
                                                                // 2 sources

                                                                if (v2 == false) break block35;
                                                                if (v1 /* !! */ ) break block36;
                                                            }
                                                            catch (n9 v10) {
                                                                throw m44.a("m", (Object)v10, (long)-5376277533328588592L, (long)var2_5);
                                                            }
                                                            v11 /* !! */  = var13_11.J();
                                                            if (var2_5 <= 0L) break block37;
                                                            if (var9_9 == false) break block31;
                                                        }
                                                        catch (n9 v12) {
                                                            throw m44.a("m", (Object)v12, (long)-5376277533328588592L, (long)var2_5);
                                                        }
                                                        if (var2_5 <= 0L) break block32;
                                                        if (!v11 /* !! */ ) break;
                                                    }
                                                    catch (n9 v13) {
                                                        throw m44.a("m", (Object)v13, (long)-5376277533328588592L, (long)var2_5);
                                                    }
                                                }
                                                var12_10.add(var13_11);
                                            }
                                            catch (n9 v14) {
                                                throw m44.a("m", (Object)v14, (long)-5376277533328588592L, (long)var2_5);
                                            }
                                        }
                                        v1 /* !! */  = var9_9;
                                    } while (v1 /* !! */ );
                                    v5 = var11_8;
                                }
                                v15 = var12_10.size();
                                v7 /* !! */  = 1;
                                if (var2_5 < 0L) ** GOTO lbl45
                                v6 = v15 - v7 /* !! */ ;
                            }
                            v16 = v5 + v6;
                        }
                        var11_8 = v16;
                        ++var11_8;
                        v11 /* !! */  = var9_9;
                    }
                    if (v11 /* !! */ ) continue;
                }
                m44.a("m", var10_7, (Object)var5_4, (long)-5457603309241161824L, (long)var2_5);
                m44.a("q", (Object)this, (int[])new int[var4_3 - var6_2], (long)-5866356582725409070L, (long)var2_5);
                if (var2_5 < 0L) break block28;
                v0 = var6_2;
            }
            var11_8 = v0;
        }
        var12_10 = var10_7.iterator();
        block19: while (true) {
            v17 /* !! */  = var12_10.hasNext();
            block20: while (v17 /* !! */ ) {
                var13_11 = (List)var12_10.next();
                v18 = var9_9;
                block21: while (v18 != false) {
                    var14_14 = var13_11.iterator();
                    while (var14_14.hasNext()) {
                        var15_15 = (az)var14_14.next();
                        m44.a("s", (Object)this, (long)-5866356582725409070L, (long)var2_5)[var11_8 - var6_2] = (CallSite)var15_15.n();
                        this.y.set(var11_8++, var15_15);
                        if (var9_9 == false) continue block19;
                        v18 = var9_9;
                        if (var2_5 <= 0L) continue block21;
                        if (v18 != false) continue;
                    }
                    v17 /* !! */  = var9_9;
                    if (var2_5 < 0L) continue block20;
                    if (!v17 /* !! */ ) break block19;
                    continue block19;
                }
                continue block19;
            }
            break;
        }
        {
            v19 = new Object[1];
            v19[0] = var7_6;
            m44.a("r", (Object)this, (Object)v19, (long)-5918558727842315716L, (long)var2_5);
            if (var2_5 <= 0L) break;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int u(Object[] objectArray) {
        int n;
        long l = (Long)objectArray[0];
        l = a ^ l;
        int n2 = 0;
        CallSite callSite = m44.a("n", (long)8196494331071243608L, (long)l);
        int n3 = 0;
        block2: while (n3 < this.y.size()) {
            az az2 = (az)this.y.get(n3);
            try {
                do {
                    Object object = az2.x(n2);
                    if (l >= 0L) {
                        if (callSite != false) return n;
                        ++n2;
                        ++n3;
                        object = callSite;
                    }
                    if (object == 0) continue block2;
                } while (l < 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("n", (Object)((Object)n92), (long)7523479748096073179L, (long)l);
            }
        }
        n = ((az)this.y.get(this.y.size() - 1)).n();
        return n;
    }

    public int[] F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("t", (Object)this, (long)-4622507648827934819L, (long)l);
    }

    public int a(Object[] objectArray) {
        return this.y.size();
    }

    public void Z(Object[] objectArray) {
        bc bc2 = (bc)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        m44.a("p", (Object)this, (bc)bc2, (long)-6587940588401032435L, (long)l);
    }

    static boolean s(Object[] objectArray) {
        boolean bl;
        block8: {
            block9: {
                boolean bl2;
                block6: {
                    block7: {
                        String string = (String)objectArray[0];
                        int n = (Integer)objectArray[1];
                        int n2 = (Integer)objectArray[2];
                        int n3 = (Integer)objectArray[3];
                        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ a;
                        CallSite callSite = m44.a("n", (long)1954468981017694200L, (long)l);
                        try {
                            try {
                                try {
                                    bl2 = string.equals("J");
                                    if (callSite != false) break block6;
                                    if (bl2) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("n", (Object)((Object)n92), (long)200590487504680827L, (long)l);
                                }
                                bl = string.equals("D");
                                if (callSite != false) break block8;
                            }
                            catch (n9 n93) {
                                throw m44.a("n", (Object)((Object)n93), (long)200590487504680827L, (long)l);
                            }
                            if (!bl) break block9;
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)((Object)n94), (long)200590487504680827L, (long)l);
                        }
                    }
                    bl2 = true;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public az r(long l, char c, int n) {
        int n2;
        long l2;
        block4: {
            l2 = (l << 16 | (long)c << 48 >>> 48) ^ a;
            CallSite callSite = m44.a("o", (long)-8867995882711878234L, (long)l2);
            try {
                n2 = this.y.isEmpty();
                if (callSite == false) break block4;
                if (n2 != 0) return null;
            }
            catch (n9 n92) {
                throw m44.a("o", (Object)((Object)n92), (long)-8835512487335857966L, (long)l2);
            }
            n2 = n;
        }
        try {
            if (n2 <= this.y.size() - 1) return (az)this.y.get(n);
            return null;
        }
        catch (n9 n93) {
            throw m44.a("o", (Object)((Object)n93), (long)-8835512487335857966L, (long)l2);
        }
    }

    public az z(Object[] objectArray) {
        List list;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("o", (long)8919057090416226081L, (long)l);
                try {
                    try {
                        list = this.y;
                        if (callSite != false) break block4;
                        if (!list.isEmpty()) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)7066662359651948450L, (long)l);
                    }
                    return null;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)7066662359651948450L, (long)l);
                }
            }
            list = this.y.get(this.y.size() - 2);
        }
        az az2 = (az)list;
        return az2;
    }

    public int J(Object[] objectArray) {
        int n;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("i", (long)-4341240779869874393L, (long)l);
                try {
                    try {
                        n = this.y.isEmpty();
                        if (callSite != false) break block4;
                        if (n == 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-2731476808779747420L, (long)l);
                    }
                    return -1;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)-2731476808779747420L, (long)l);
                }
            }
            n = ((az)this.y.get(this.y.size() - 1)).n();
        }
        return n;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public az v(int var1_1, fh var2_2, long var3_3, int var5_4) {
        block29: {
            block25: {
                block26: {
                    block28: {
                        block27: {
                            var6_5 = m44.a("i", (long)7546045484089547248L, (long)var3_3);
                            try {
                                v0 /* !! */  = this.y.size();
                                v1 /* !! */  = var6_5;
                                if (var3_3 > 0L) {
                                    if (v1 /* !! */  == false) break block25;
                                    v1 /* !! */  = (CallSite)var1_1;
                                }
                                if (v0 /* !! */  > v1 /* !! */ ) {
                                }
                                ** GOTO lbl68
                            }
                            catch (n9 v2) {
                                throw m44.a("i", (Object)v2, (long)7581679049737280644L, (long)var3_3);
                            }
                            var7_6 = (az)this.y.get(var1_1);
                            try {
                                try {
                                    try {
                                        v0 /* !! */  = (int)var6_5;
                                        if (var3_3 <= 0L) ** GOTO lbl66
                                        if (v0 /* !! */  == 0) break block26;
                                        if (var2_2.l()) {
                                        }
                                        ** GOTO lbl58
                                    }
                                    catch (n9 v3) {
                                        throw m44.a("i", (Object)v3, (long)7581679049737280644L, (long)var3_3);
                                    }
                                    m44.a("v", (Object)var7_6, (Object)new Object[0], (long)8572184923233291399L, (long)var3_3);
                                    v4 = var7_6;
                                    if (var6_5 == false) break block27;
                                }
                                catch (n9 v5) {
                                    throw m44.a("i", (Object)v5, (long)7581679049737280644L, (long)var3_3);
                                }
                                v4.v();
                                if (this.y.size() > var1_1 + 1) {
                                }
                                ** GOTO lbl45
                            }
                            catch (n9 v6) {
                                throw m44.a("i", (Object)v6, (long)7581679049737280644L, (long)var3_3);
                            }
                            var8_7 = (az)this.y.get(var1_1 + 1);
                            try {
                                m44.a("v", (Object)var8_7, (Object)new Object[0], (long)7582087731629629111L, (long)var3_3);
                                var8_7.f();
                                v7 = var6_5;
                                if (var3_3 > 0L) {
                                    if (v7 != false) break block28;
                                }
                                ** GOTO lbl57
lbl45:
                                // 2 sources

                                v4 = new az(var1_1 + 1, false, true, var5_4);
                            }
                            catch (n9 v8) {
                                throw m44.a("i", (Object)v8, (long)7581679049737280644L, (long)var3_3);
                            }
                        }
                        var8_7 = v4;
                        this.y.add(var8_7);
                    }
                    try {
                        if (var3_3 < 0L) break block26;
                        v7 = var6_5;
lbl57:
                        // 2 sources

                        if (v7 != false) break block29;
lbl58:
                        // 2 sources

                        m44.a("v", (Object)var7_6, (Object)new Object[0], (long)7582087731629629111L, (long)var3_3);
                        m44.a("v", (Object)var7_6, (Object)new Object[0], (long)8572184923233291399L, (long)var3_3);
                    }
                    catch (n9 v9) {
                        throw m44.a("i", (Object)v9, (long)7581679049737280644L, (long)var3_3);
                    }
                }
                try {
                    v0 /* !! */  = (int)var6_5;
lbl66:
                    // 2 sources

                    if (var3_3 <= 0L) break block25;
                    if (v0 /* !! */  != 0) break block29;
lbl68:
                    // 2 sources

                    v0 /* !! */  = this.y.size();
                }
                catch (n9 v10) {
                    throw m44.a("i", (Object)v10, (long)7581679049737280644L, (long)var3_3);
                }
            }
            var8_8 = v0 /* !! */ ;
            block16: while (var8_8 < var1_1) {
                v11 = new az(var8_8, var5_4);
                if (var3_3 <= 0L) ** GOTO lbl98
                var9_10 = v11;
                try {
                    this.y.add(var9_10);
                    ++var8_8;
                    while (var6_5 != false) {
                        if (var6_5 != false) continue block16;
                        if (var3_3 <= 0L) continue;
                        break block16;
                    }
                    ** GOTO lbl-1000
                }
                catch (n9 v12) {
                    throw m44.a("i", (Object)v12, (long)7581679049737280644L, (long)var3_3);
                }
            }
            if (var2_2.l()) {
                var7_6 = new az(var1_1, true, false, var5_4);
                this.y.add(var7_6);
                var8_9 = new az(var1_1 + 1, false, true, var5_4);
                this.y.add(var8_9);
            } else lbl-1000:
            // 2 sources

            {
                v11 = new az(var1_1, var5_4);
lbl98:
                // 2 sources

                var7_6 = v11;
                this.y.add(var7_6);
            }
        }
        return var7_6;
    }

    public lkv(boolean bl, long l, String string, int n) {
        long l2 = (l = a ^ l) ^ 0x4E7BAE306CF4L;
        this.y = new ArrayList(n);
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = string;
        objectArray[0] = bl;
        m44.a("m", (Object)this, (Object)objectArray, (long)-4362404501069625753L, (long)l);
    }

    public az T(Object[] objectArray) {
        az az2;
        block4: {
            long l;
            int n;
            block3: {
                int n2;
                block2: {
                    n = (Integer)objectArray[0];
                    boolean bl = (Boolean)objectArray[1];
                    n2 = (Integer)objectArray[2];
                    l = (Long)objectArray[3];
                    l = a ^ l;
                    CallSite callSite = m44.a("m", (long)-2221188847596816949L, (long)l);
                    if (!bl) break block2;
                    az az3 = new az(n + 1, false, true, n2);
                    m44.a("r", (Object)this.y, (int)n, (Object)az3, (long)-1913525292392222644L, (long)l);
                    az2 = new az(n, true, false, n2);
                    m44.a("r", (Object)this.y, (int)n, (Object)az2, (long)-1913525292392222644L, (long)l);
                    if (l < 0L) break block3;
                    if (callSite == false) break block4;
                }
                az2 = new az(n, n2);
            }
            m44.a("r", (Object)this.y, (int)n, (Object)az2, (long)-1913525292392222644L, (long)l);
        }
        return az2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
