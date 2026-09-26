/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l68;
import com.zelix.lqh;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ii {
    Map V;
    private static final long a = prr.a((long)-2569916936827418247L, (long)-9096067232648220601L, MethodHandles.lookup().lookupClass()).a(115940666658119L);

    public lqh q(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (lqh)m44.a("r", (Object)this, (long)-1491248423617414855L, (long)l).get(object);
    }

    public void S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        m44.a("u", (Object)this, (long)-4327579122238746234L, (long)l).clear();
    }

    public Enumeration i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x1ED8AED0A3BFL;
        return new l68(l2, m44.a("u", (Object)this, (long)-5613344341186420626L, (long)l).keySet());
    }

    public int y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)this, (long)-5928677915590885426L, (long)l).size();
    }

    public void A(Object[] objectArray) {
        lqh lqh2;
        long l;
        long l2;
        Object object;
        Object object2;
        Object object3;
        block2: {
            lqh lqh3;
            block3: {
                Object object4 = objectArray[0];
                object3 = objectArray[1];
                object2 = objectArray[2];
                object = objectArray[3];
                l2 = (Long)objectArray[4];
                long l3 = l2 = a ^ l2;
                long l4 = l3 ^ 0x2FD3141E2F1FL;
                l = l3 ^ 0x76C6B3707173L;
                lqh3 = (lqh)m44.a("t", (Object)this, (long)-3755922200140179049L, (long)l2).get(object4);
                CallSite callSite = m44.a("j", (long)-3333720150263148662L, (long)l2);
                try {
                    lqh2 = lqh3;
                    if (callSite != null) break block2;
                    if (lqh2 != null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)-3596359260490618824L, (long)l2);
                }
                lqh3 = new lqh(l4);
                m44.a("t", (Object)this, (long)-3755922200140179049L, (long)l2).put(object4, lqh3);
            }
            lqh2 = lqh3;
        }
        m44.a("u", (Object)lqh2, (Object)object3, (Object)object2, (Object)object, (long)l, (long)-3525506543108142883L, (long)l2);
    }

    public ii(char c, int n, short s, int n2) {
        long l = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0x6BC4A5CCB9F0L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = n2;
        m44.a("v", (Object)this, (Map)((Object)m44.a("j", (Object)objectArray, (long)4409349410297985233L, (long)l)), (long)2697788965743687431L, (long)l);
    }

    public Set y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-3810260453642331800L, (long)l).entrySet();
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
