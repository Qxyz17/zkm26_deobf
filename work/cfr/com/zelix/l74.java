/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7e;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lwr;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class l74
extends l7e {
    private boolean n;
    private ArrayList z;
    private static final long b = prr.a(-9214790219495030297L, -2763634010983458170L, MethodHandles.lookup().lookupClass()).a(22837463904258L);

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x47526B4E5A06L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        Object object = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
        CallSite callSite = m44.a("h", (long)-6823249310977527178L, (long)l10);
        for (int i10 = 0; i10 < object; ++i10) {
            lwr lwr2 = (lwr)this.V(i10);
            ((ArrayList)((Object)m44.a("v", (Object)this, (long)-6540852980704551086L, (long)l10))).add(m44.a("w", (Object)lwr2, (Object)new Object[0], (long)-4968184746715213117L, (long)l10));
            if (callSite == false) continue;
        }
    }

    public l74(int n10, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x74AAAE4F3D89L;
        super(l11, n10);
        m44.a("q", (Object)this, new ArrayList(), (long)-8473730272325472241L, (long)l10);
        m44.a("q", (Object)this, (boolean)false, (long)-8126491971859519806L, (long)l10);
    }

    void Z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        m44.a("u", (Object)this, (boolean)true, (long)7995179729595795214L, (long)l10);
    }

    @Override
    protected int d(Object[] objectArray) {
        int n10;
        block6: {
            block5: {
                CallSite callSite;
                block4: {
                    long l10 = (Long)objectArray[0];
                    CallSite callSite2 = m44.a("i", (long)-2499579499954172297L, (long)l10);
                    try {
                        try {
                            callSite = m44.a("w", (Object)this, (long)-2793498916372372653L, (long)l10);
                            if (callSite2 != false) break block4;
                            if (callSite == null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("i", (Object)illegalArgumentException, (long)-4123009070395204903L, (long)l10);
                        }
                        callSite = m44.a("w", (Object)this, (long)-2793498916372372653L, (long)l10);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("i", (Object)illegalArgumentException, (long)-4123009070395204903L, (long)l10);
                    }
                }
                n10 = ((ArrayList)((Object)callSite)).size();
                break block6;
            }
            n10 = 0;
        }
        return n10;
    }

    @Override
    protected String y(Object[] objectArray) {
        int n10;
        long l10;
        block4: {
            l10 = (Long)objectArray[0];
            Object object = objectArray;
            n10 = (Integer)objectArray[1];
            try {
                if (l10 > 0L) {
                    if (n10 >= ((ArrayList)((Object)m44.a("w", (Object)this, (long)7456688189240778003L, (long)l10))).size()) break block4;
                    object = ((ArrayList)((Object)m44.a("w", (Object)this, (long)7456688189240778003L, (long)l10))).get(n10);
                }
                return (String)object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("i", (Object)illegalArgumentException, (long)8685232527759303833L, (long)l10);
            }
        }
        throw new IllegalArgumentException((String)((Object)m44.a("i", (int)n10, (long)9112152124006700027L, (long)l10)));
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

