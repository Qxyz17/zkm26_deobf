/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lt9;
import com.zelix.lwr;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lw9
extends lt9 {
    private static final long a = prr.a((long)-4305233569573569261L, (long)6843360198165667567L, MethodHandles.lookup().lookupClass()).a(163257905098925L);

    public void M(Object[] objectArray) {
        block6: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l = (Long)objectArray[2];
            long l2 = l ^ 0x47526B4E5A06L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l);
            if (callSite == true) {
                lmu lmu3;
                block5: {
                    lmu lmu4 = this.V(0);
                    try {
                        try {
                            lmu3 = lmu4;
                            if (callSite2 == false) break block5;
                            if (!(lmu3 instanceof lwr)) break block6;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)((Object)n92), (long)-6644567456545520802L, (long)l);
                        }
                        lmu3 = lmu4;
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)((Object)n93), (long)-6644567456545520802L, (long)l);
                    }
                }
                lwr lwr2 = (lwr)lmu3;
                this.b = m44.a("w", (Object)lwr2, (Object)new Object[0], (long)-4968184746715213117L, (long)l);
            }
        }
    }

    public lw9(int n, int n2, int n3, int n4) {
        long l = ((long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)n4 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x15982B1A4912L;
        super(n, l2);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
