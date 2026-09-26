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
    private static final long a = prr.a(-6999494903892582608L, 5854007148484165746L, MethodHandles.lookup().lookupClass()).a(276069286733078L);

    public d2(f_ f_2, m m10, Object object, Object object2, Object object3, long l10) {
        block8: {
            long l11;
            block7: {
                CallSite callSite;
                block6: {
                    long l12 = l10 = a ^ l10;
                    l11 = l12 ^ 0x435158A21D00L;
                    long l13 = l12 ^ 0x244B8411BC8EL;
                    CallSite callSite2 = m44.a("n", (long)3514952033575870371L, (long)l10);
                    callSite = callSite2;
                    try {
                        try {
                            if (callSite == null) break block6;
                            if (m44.a("n", (long)3521383846207724559L, (long)l10) == false) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)3223549306967838212L, (long)l10);
                        }
                        Object[] objectArray = new Object[6];
                        objectArray[5] = l13;
                        objectArray[4] = object3;
                        objectArray[3] = object2;
                        objectArray[2] = object;
                        objectArray[1] = m10;
                        objectArray[0] = f_2;
                        m44.a("q", (Object)this, (Object)objectArray, (long)3761365729261338290L, (long)l10);
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)3223549306967838212L, (long)l10);
                    }
                }
                if (callSite != null) break block8;
            }
            ro ro2 = new ro(this, f_2, m10, object, object2, l11, object3);
            m44.a("n", (Object)ro2, (long)3936265465219920125L, (long)l10);
        }
    }

    public final void F(Object[] objectArray) {
        f_ f_2 = (f_)objectArray[0];
        m m10 = (m)objectArray[1];
        Object object = objectArray[2];
        Object object2 = objectArray[3];
        Object object3 = objectArray[4];
        long l10 = (Long)objectArray[5];
        long l11 = (l10 = a ^ l10) ^ 0x158953EBA8B8L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = object3;
        objectArray2[3] = object2;
        objectArray2[2] = object;
        objectArray2[1] = l11;
        objectArray2[0] = m10;
        m44.a("r", (Object)f_2, (Object)objectArray2, (long)-7615586803155345575L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

