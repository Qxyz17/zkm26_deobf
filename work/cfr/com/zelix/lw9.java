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
    private static final long a = prr.a(-4305233569573569261L, 6843360198165667567L, MethodHandles.lookup().lookupClass()).a(163257905098925L);

    @Override
    public void M(Object[] objectArray) {
        block6: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l10 = (Long)objectArray[2];
            long l11 = l10 ^ 0x47526B4E5A06L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l11;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l10);
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
                            throw m44.a("h", (Object)n92, (long)-6644567456545520802L, (long)l10);
                        }
                        lmu3 = lmu4;
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)n93, (long)-6644567456545520802L, (long)l10);
                    }
                }
                lwr lwr2 = (lwr)lmu3;
                this.b = m44.a("w", (Object)lwr2, (Object)new Object[0], (long)-4968184746715213117L, (long)l10);
            }
        }
    }

    public lw9(int n10, int n11, int n12, int n13) {
        long l10 = ((long)n11 << 32 | (long)n12 << 48 >>> 32 | (long)n13 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x15982B1A4912L;
        super(n10, l11);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

