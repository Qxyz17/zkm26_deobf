/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.f_;
import com.zelix.m;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ro;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class d2 {
    private static final long a = prr.a((long)-6999494903892582608L, (long)5854007148484165746L, MethodHandles.lookup().lookupClass()).a(276069286733078L);

    public d2(f_ f_2, m m2, Object object, Object object2, Object object3, long l) {
        block8: {
            long l2;
            block7: {
                CallSite callSite;
                block6: {
                    long l3 = l = a ^ l;
                    l2 = l3 ^ 0x435158A21D00L;
                    long l4 = l3 ^ 0x244B8411BC8EL;
                    CallSite callSite2 = m44.a("n", (long)3514952033575870371L, (long)l);
                    callSite = callSite2;
                    try {
                        try {
                            if (callSite == null) break block6;
                            if (m44.a("n", (long)3521383846207724559L, (long)l) == false) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)((Object)n92), (long)3223549306967838212L, (long)l);
                        }
                        Object[] objectArray = new Object[6];
                        objectArray[5] = l4;
                        objectArray[4] = object3;
                        objectArray[3] = object2;
                        objectArray[2] = object;
                        objectArray[1] = m2;
                        objectArray[0] = f_2;
                        m44.a("q", (Object)this, (Object)objectArray, (long)3761365729261338290L, (long)l);
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)((Object)n93), (long)3223549306967838212L, (long)l);
                    }
                }
                if (callSite != null) break block8;
            }
            ro ro2 = new ro(this, f_2, m2, object, object2, l2, object3);
            m44.a("n", (Object)ro2, (long)3936265465219920125L, (long)l);
        }
    }

    public final void F(Object[] objectArray) {
        f_ f_2 = (f_)objectArray[0];
        m m2 = (m)objectArray[1];
        Object object = objectArray[2];
        Object object2 = objectArray[3];
        Object object3 = objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = a ^ l) ^ 0x158953EBA8B8L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = object3;
        objectArray2[3] = object2;
        objectArray2[2] = object;
        objectArray2[1] = l2;
        objectArray2[0] = m2;
        m44.a("r", (Object)f_2, (Object)objectArray2, (long)-7615586803155345575L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
