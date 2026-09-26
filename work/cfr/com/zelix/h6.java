/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.hk;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sh;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class h6
extends hk {
    protected HashSet h;
    protected HashSet W;
    protected HashSet b;
    protected HashSet m;
    protected HashSet F;
    protected HashSet z;
    private static final long a = prr.a(5408181748801147169L, 7706205985338547480L, MethodHandles.lookup().lookupClass()).a(217726882779628L);

    public boolean C(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("k", (long)7990088553467940526L, (long)l10);
                try {
                    object = m44.a("t", (Object)m44.a("u", (Object)this, (long)7954402298788163086L, (long)l10), (long)8392468664423196295L, (long)l10);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)n92, (long)8033494536092810064L, (long)l10);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public Enumeration w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x6F8258E6F16BL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("s", (Object)this, (long)-509577837676644224L, (long)l10);
        return m44.a("m", (Object)objectArray2, (long)-164706873652018079L, (long)l10);
    }

    public final boolean q(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("l", (long)-1640015637217048207L, (long)l10);
                try {
                    object = m44.a("s", (Object)m44.a("r", (Object)this, (long)-1039676628329105304L, (long)l10), (long)-889733005348560552L, (long)l10);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)n92, (long)-1683301772034900849L, (long)l10);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public Enumeration f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x33300AE4DBB6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("v", (Object)this, (long)-2951151813297269580L, (long)l10);
        return m44.a("h", (Object)objectArray2, (long)-2924090379782705476L, (long)l10);
    }

    public abstract Enumeration I(Object[] var1);

    public Enumeration x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = (l10 << 16 | (long)n10 << 48 >>> 48) ^ a;
        long l12 = l11 ^ 0x60C8E39330CBL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l12;
        objectArray2[0] = m44.a("s", (Object)this, (long)2624491165643850038L, (long)l11);
        return m44.a("m", (Object)objectArray2, (long)4329886351527626177L, (long)l11);
    }

    public Enumeration q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x3B421EA39557L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = m44.a("w", (Object)this, (long)-6996896427848017051L, (long)l10);
        return m44.a("i", (Object)objectArray2, (long)-7382944359061299107L, (long)l10);
    }

    public boolean Y(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("m", (long)2293561206141845400L, (long)l10);
                try {
                    object = m44.a("r", (Object)m44.a("s", (Object)this, (long)176790911924922158L, (long)l10), (long)382290571586623409L, (long)l10);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)n92, (long)2182722173237856870L, (long)l10);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public h6(int n10, sh sh2, short s10, List list, short s11, lqu lqu2) {
        long l10 = ((long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)s11 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x52F601851FDCL;
        super(sh2, list, l11, lqu2);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

