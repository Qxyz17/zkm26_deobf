/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.d2;
import com.zelix.f_;
import com.zelix.m;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ro
implements Runnable {
    private d2 n;
    private m O;
    private f_ p;
    private Object L;
    private Object d;
    private Object v;
    private static final long a = prr.a((long)4525410235516912069L, (long)-3328967358090191122L, MethodHandles.lookup().lookupClass()).a(229728665387025L);

    ro(d2 d22, f_ f_2, m m2, Object object, Object object2, long l, Object object3) {
        l = a ^ l;
        m44.a("r", (Object)this, (d2)d22, (long)8770183187710106004L, (long)l);
        m44.a("r", (Object)this, (f_)f_2, (long)7025332737567922950L, (long)l);
        m44.a("r", (Object)this, (m)m2, (long)9055918108752952438L, (long)l);
        m44.a("r", (Object)this, (Object)object, (long)7387193150367889219L, (long)l);
        m44.a("r", (Object)this, (Object)object2, (long)9146423561195002019L, (long)l);
        m44.a("r", (Object)this, (Object)object3, (long)6966783519571876869L, (long)l);
    }

    @Override
    public void run() {
        long l = a ^ 0x56117CE54B92L;
        long l2 = l ^ 0xBD0E8C085F5L;
        Object[] objectArray = new Object[6];
        objectArray[5] = l2;
        objectArray[4] = m44.a("s", (Object)this, (long)665859059210384790L, (long)l);
        objectArray[3] = m44.a("s", (Object)this, (long)1692781983284850992L, (long)l);
        objectArray[2] = m44.a("s", (Object)this, (long)1087605006283382480L, (long)l);
        objectArray[1] = m44.a("s", (Object)this, (long)1458729156734506469L, (long)l);
        objectArray[0] = m44.a("s", (Object)this, (long)643338673533612693L, (long)l);
        m44.a("r", (Object)m44.a("s", (Object)this, (long)1163781238532943879L, (long)l), (Object)objectArray, (long)957051929175918537L, (long)l);
    }
}
