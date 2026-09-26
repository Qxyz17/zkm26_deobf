/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.wf;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class lul
extends lmc {
    final wf j;
    private static final long a = prr.a(-3895397301604606639L, 1022759465865740557L, MethodHandles.lookup().lookupClass()).a(199632241614985L);

    public void U(Object[] objectArray) {
        block5: {
            long l10 = (Long)objectArray[0];
            List list = (List)objectArray[1];
            String string = (String)objectArray[2];
            Integer n10 = (Integer)objectArray[3];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x42D436FC9393L;
            long l13 = l11 ^ 0x3C7A98E9DC16L;
            try {
                try {
                    if (list != null && string != null) {
                    }
                    break block5;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)4681173975742695411L, (long)l10);
                }
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = new ArrayList(list);
                objectArray2[1] = m44.a("q", (Object)this, (long)6910265286096671688L, (long)l10);
                objectArray2[0] = l13;
                m44.a("o", (Object)objectArray2, (long)5101107044239352916L, (long)l10);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = m44.a("q", (Object)this, (long)6910265286096671688L, (long)l10);
                objectArray3[0] = l12;
                m44.a("p", (Object)m44.a("o", (Object)objectArray3, (long)4903743781257412840L, (long)l10), (Object)string, (long)5051016498740695243L, (long)l10);
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = m44.a("q", (Object)this, (long)6910265286096671688L, (long)l10);
                objectArray4[0] = l12;
                m44.a("p", (Object)m44.a("o", (Object)objectArray4, (long)4903743781257412840L, (long)l10), (int)0, (long)5103509204576565910L, (long)l10);
            }
            catch (n9 n93) {
                throw m44.a("o", (Object)n93, (long)4681173975742695411L, (long)l10);
            }
        }
    }

    @Override
    public void W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        Object object2 = objectArray[2];
        Object object3 = objectArray[3];
        long l11 = l10 ^ 0x5F30EF792A6CL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = (Integer)object3;
        objectArray2[2] = (String)object2;
        objectArray2[1] = (List)object;
        objectArray2[0] = l11;
        m44.a("t", (Object)this, (Object)objectArray2, (long)5756738927605299041L, (long)l10);
    }

    lul(wf wf2) {
        this.j = wf2;
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

