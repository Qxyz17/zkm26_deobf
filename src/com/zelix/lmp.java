/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._u;
import com.zelix.fr;
import com.zelix.ho;
import com.zelix.l;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o_;
import com.zelix.ou;
import com.zelix.prr;
import com.zelix.zr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.HashSet;
import java.util.Map;

public class lmp {
    final fr G;
    final Map X;
    final Map v;
    final fr L;
    final loj u;
    final ou S;
    HashSet C;
    final boolean T;
    final _u m;
    final Map w;
    final HashSet A;
    final l N;
    final Map P;
    final Map t;
    int z;
    final fr p;
    final ho h;
    final boolean D;
    boolean K;
    private zr a;
    Map k;
    private static final long b = prr.a((long)-609044909863005363L, (long)8390587058996127011L, MethodHandles.lookup().lookupClass()).a(9582739495046L);

    boolean Z(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        o_ o_2 = (o_)objectArray[1];
        l2 = b ^ l2;
        return ((HashSet)((Object)m44.a("t", (Object)this, (long)1367478105495857563L, (long)l2))).add(o_2);
    }

    lmp(l l2, HashSet hashSet, boolean bl, ou ou2, fr fr2, fr fr3, fr fr4, loj loj2, _u _u2, Map map, long l3, boolean bl2, Map map2, Map map3, Map map4, Map map5, int n, Map map6) {
        long l4 = l3 = b ^ l3;
        long l5 = l4 ^ 0x586B8F9B2E2CL;
        long l6 = l4 ^ 0x56D624F41A28L;
        this.N = l2;
        this.h = new ho(l6);
        m44.a("w", (Object)this, (zr)new zr(true), (long)-9066952016516509202L, (long)l3);
        m44.a("w", (Object)this, (HashSet)hashSet, (long)-7425306772899224193L, (long)l3);
        this.T = bl;
        this.S = ou2;
        this.p = fr2;
        this.G = fr3;
        this.L = fr4;
        this.u = loj2;
        this.m = _u2;
        this.v = map;
        Object[] objectArray = new Object[1];
        objectArray[0] = l5;
        this.A = m44.a("k", (Object)objectArray, (long)-9076842866662704245L, (long)l3);
        this.D = bl2;
        this.w = map2;
        this.X = map3;
        this.P = map4;
        this.t = map5;
        m44.a("w", (Object)this, (int)n, (long)-8987851114080614307L, (long)l3);
        m44.a("w", (Object)this, (Map)map6, (long)-8973387586104129005L, (long)l3);
    }

    lmp(l l2, HashSet hashSet, boolean bl, ou ou2, fr fr2, fr fr3, fr fr4, loj loj2, long l3, _u _u2, Map map, boolean bl2, Map map2, Map map3, Map map4, Map map5, Map map6) {
        long l4 = (l3 = b ^ l3) ^ 0x4DE3EDA4B9CCL;
        this(l2, hashSet, bl, ou2, fr2, fr3, fr4, loj2, _u2, map, l4, bl2, map2, map3, map4, map5, 0, map6);
    }

    lmp(l l2, lmp lmp2, ou ou2, long l3) {
        long l4 = (l3 = b ^ l3) ^ 0x57B6EE534A3AL;
        this(l4, l2, lmp2, ou2, (int)(m44.a("p", (Object)lmp2, (long)3833097242711096872L, (long)l3) + true));
    }

    void X(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = b ^ l2;
        m44.a("r", (Object)this, (long)1604680978321180033L, (long)l2).I(bl);
    }

    boolean V(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        o_ o_2 = (o_)objectArray[1];
        l2 = b ^ l2;
        return (boolean)m44.a("u", (Object)m44.a("t", (Object)this, (long)-7966241169412199917L, (long)l2), (Object)o_2, (long)-8508051711239139743L, (long)l2);
    }

    HashSet n(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        HashSet hashSet = (HashSet)objectArray[1];
        l2 = b ^ l2;
        CallSite callSite = m44.a("t", (Object)this, (long)2453624316226215814L, (long)l2);
        m44.a("v", (Object)this, (HashSet)hashSet, (long)2453624316226215814L, (long)l2);
        return callSite;
    }

    lmp(long l2, l l3, lmp lmp2, ou ou2, int n) {
        long l4 = (l2 = b ^ l2) ^ 0x3ED164695B8EL;
        this(l3, l4, lmp2, ou2, n, false);
    }

    boolean d(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return m44.a("w", (Object)this, (long)2781490392063620444L, (long)l2).S();
    }

    int z(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return (int)m44.a("w", (Object)this, (long)-8300549290295081001L, (long)l2);
    }

    lmp(l l2, long l3, lmp lmp2, ou ou2, int n, boolean bl) {
        long l4 = l3 = b ^ l3;
        long l5 = l4 ^ 0x671B90BCBDE9L;
        long l6 = l4 ^ 0x23BB1B8CA5D6L;
        this.N = l2;
        this.h = new ho(l5);
        m44.a("v", (Object)this, (zr)new zr(true), (long)2732144436427175471L, (long)l3);
        m44.a("v", (Object)this, (HashSet)((Object)m44.a("t", (Object)lmp2, (long)4554602780777677502L, (long)l3)), (long)4554602780777677502L, (long)l3);
        this.T = m44.a("t", (Object)lmp2, (long)4086886022317907676L, (long)l3);
        this.S = ou2;
        this.p = m44.a("t", (Object)lmp2, (long)4103185765280905137L, (long)l3);
        this.G = m44.a("t", (Object)lmp2, (long)2772770893993033501L, (long)l3);
        this.L = m44.a("t", (Object)lmp2, (long)4565560048999877978L, (long)l3);
        this.u = m44.a("t", (Object)lmp2, (long)2860418616713474388L, (long)l3);
        this.m = m44.a("t", (Object)lmp2, (long)4218886155078346166L, (long)l3);
        this.v = m44.a("t", (Object)lmp2, (long)2470764512588322577L, (long)l3);
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = m44.a("t", (Object)lmp2, (long)2356069828812954579L, (long)l3);
        this.A = m44.a("j", (Object)objectArray, (long)2344460935545129722L, (long)l3);
        this.D = m44.a("t", (Object)lmp2, (long)2761414506893246169L, (long)l3);
        this.w = m44.a("t", (Object)lmp2, (long)2467424606480728572L, (long)l3);
        this.X = m44.a("t", (Object)lmp2, (long)4173675800118073904L, (long)l3);
        CallSite callSite = m44.a("j", (long)2821770281793999864L, (long)l3);
        try {
            this.P = m44.a("t", (Object)lmp2, (long)4089108581850917109L, (long)l3);
            this.t = m44.a("t", (Object)lmp2, (long)2360507660516430188L, (long)l3);
            m44.a("v", (Object)this, (int)n, (long)2631664338215694236L, (long)l3);
            m44.a("v", (Object)this, (boolean)bl, (long)2383483010546810447L, (long)l3);
            m44.a("v", (Object)this, (Map)((Object)m44.a("t", (Object)lmp2, (long)2646197130583453138L, (long)l3)), (long)2646197130583453138L, (long)l3);
            m44.a("v", (Object)this, (zr)m44.a("t", (Object)lmp2, (long)2732144436427175471L, (long)l3), (long)2732144436427175471L, (long)l3);
            if (callSite != null) {
                m44.a("j", (Object)"vMPLSc", (long)2433488576399065158L, (long)l3);
            }
        }
        catch (n9 n92) {
            throw m44.a("j", (Object)((Object)n92), (long)2598979819225444887L, (long)l3);
        }
    }

    lmp(l l2, long l3, lmp lmp2, boolean bl) {
        long l4 = l3 = b ^ l3;
        long l5 = l4 ^ 0x6034FB9A7DDL;
        long l6 = l4 ^ 0x42A3C489BFE2L;
        CallSite callSite = m44.a("n", (long)4403552891828226508L, (long)l3);
        this.N = l2;
        this.h = new ho(l5);
        m44.a("r", (Object)this, (zr)new zr(true), (long)4602370936309034011L, (long)l3);
        m44.a("r", (Object)this, (HashSet)((Object)m44.a("p", (Object)lmp2, (long)2666502622223505546L, (long)l3)), (long)2666502622223505546L, (long)l3);
        this.T = m44.a("p", (Object)lmp2, (long)2487086745426953448L, (long)l3);
        this.S = m44.a("p", (Object)lmp2, (long)2525804491214715088L, (long)l3);
        this.p = m44.a("p", (Object)lmp2, (long)2505427107681987973L, (long)l3);
        this.G = m44.a("p", (Object)lmp2, (long)4345619010012456233L, (long)l3);
        this.L = m44.a("p", (Object)lmp2, (long)2695476618438072174L, (long)l3);
        this.u = m44.a("p", (Object)lmp2, (long)4433334836318169952L, (long)l3);
        CallSite callSite2 = callSite;
        try {
            this.m = m44.a("p", (Object)lmp2, (long)2357669048709758850L, (long)l3);
            this.v = m44.a("p", (Object)lmp2, (long)4070561521534684453L, (long)l3);
            Object[] objectArray = new Object[2];
            objectArray[1] = l6;
            objectArray[0] = m44.a("p", (Object)lmp2, (long)4217075823782150631L, (long)l3);
            this.A = m44.a("n", (Object)objectArray, (long)4232631396876128462L, (long)l3);
            this.D = bl;
            this.w = m44.a("p", (Object)lmp2, (long)4038159328276028360L, (long)l3);
            this.X = m44.a("p", (Object)lmp2, (long)2584926677765947396L, (long)l3);
            this.P = m44.a("p", (Object)lmp2, (long)2489100329300046529L, (long)l3);
            this.t = m44.a("p", (Object)lmp2, (long)4248675851487316824L, (long)l3);
            m44.a("r", (Object)this, (int)(m44.a("p", (Object)lmp2, (long)4517653436290692520L, (long)l3) + true), (long)4517653436290692520L, (long)l3);
            m44.a("r", (Object)this, (Map)((Object)m44.a("p", (Object)lmp2, (long)4507346067096909798L, (long)l3)), (long)4507346067096909798L, (long)l3);
            m44.a("r", (Object)this, (zr)m44.a("p", (Object)lmp2, (long)4602370936309034011L, (long)l3), (long)4602370936309034011L, (long)l3);
            if (m44.a("n", (long)4453836415468963062L, (long)l3) == null) {
                m44.a("n", (Object)new String[3], (long)4051045717099939524L, (long)l3);
            }
        }
        catch (n9 n92) {
            throw m44.a("n", (Object)((Object)n92), (long)4478002416726468643L, (long)l3);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
