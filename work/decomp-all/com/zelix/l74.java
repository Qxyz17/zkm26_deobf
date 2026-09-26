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
    private static final long b = prr.a((long)-9214790219495030297L, (long)-2763634010983458170L, MethodHandles.lookup().lookupClass()).a(22837463904258L);

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x47526B4E5A06L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        Object object = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
        CallSite callSite = m44.a("h", (long)-6823249310977527178L, (long)l);
        for (int i = 0; i < object; ++i) {
            lwr lwr2 = (lwr)this.V(i);
            ((ArrayList)((Object)m44.a("v", (Object)((Object)this), (long)-6540852980704551086L, (long)l))).add(m44.a("w", (Object)lwr2, (Object)new Object[0], (long)-4968184746715213117L, (long)l));
            if (callSite == false) continue;
        }
    }

    public l74(int n, long l) {
        long l2 = (l = b ^ l) ^ 0x74AAAE4F3D89L;
        super(l2, n);
        m44.a("q", (Object)((Object)this), new ArrayList(), (long)-8473730272325472241L, (long)l);
        m44.a("q", (Object)((Object)this), (boolean)false, (long)-8126491971859519806L, (long)l);
    }

    void Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        m44.a("u", (Object)((Object)this), (boolean)true, (long)7995179729595795214L, (long)l);
    }

    protected int d(Object[] objectArray) {
        int n;
        block6: {
            block5: {
                CallSite callSite;
                block4: {
                    long l = (Long)objectArray[0];
                    CallSite callSite2 = m44.a("i", (long)-2499579499954172297L, (long)l);
                    try {
                        try {
                            callSite = m44.a("w", (Object)((Object)this), (long)-2793498916372372653L, (long)l);
                            if (callSite2 != false) break block4;
                            if (callSite == null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("i", (Object)illegalArgumentException, (long)-4123009070395204903L, (long)l);
                        }
                        callSite = m44.a("w", (Object)((Object)this), (long)-2793498916372372653L, (long)l);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("i", (Object)illegalArgumentException, (long)-4123009070395204903L, (long)l);
                    }
                }
                n = ((ArrayList)((Object)callSite)).size();
                break block6;
            }
            n = 0;
        }
        return n;
    }

    protected String y(Object[] objectArray) {
        int n;
        long l;
        block4: {
            l = (Long)objectArray[0];
            Object object = objectArray;
            n = (Integer)objectArray[1];
            try {
                if (l > 0L) {
                    if (n >= ((ArrayList)((Object)m44.a("w", (Object)((Object)this), (long)7456688189240778003L, (long)l))).size()) break block4;
                    object = ((ArrayList)((Object)m44.a("w", (Object)((Object)this), (long)7456688189240778003L, (long)l))).get(n);
                }
                return (String)object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("i", (Object)illegalArgumentException, (long)8685232527759303833L, (long)l);
            }
        }
        throw new IllegalArgumentException((String)((Object)m44.a("i", (int)n, (long)9112152124006700027L, (long)l)));
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}
