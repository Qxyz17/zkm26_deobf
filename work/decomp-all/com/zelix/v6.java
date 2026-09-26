/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.b0;
import com.zelix.hf;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class v6
implements Comparator {
    final hf f;
    private static final long a = prr.a((long)-8726247831051398326L, (long)4104041821653195495L, MethodHandles.lookup().lookupClass()).a(109391562364281L);

    public int compare(Object object, Object object2) {
        long l = a ^ 0x36834F9E9D85L;
        long l2 = l ^ 0x236F0E783EC3L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (b0)object2;
        objectArray[1] = l2;
        objectArray[0] = (b0)object;
        return (int)m44.a("r", (Object)this, (Object)objectArray, (long)4923199403363895517L, (long)l);
    }

    public int h(Object[] objectArray) {
        b0 b02 = (b0)objectArray[0];
        long l = (Long)objectArray[1];
        b0 b03 = (b0)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x7498A80EFEBEL;
        String string = b02.d(l2);
        String string2 = b03.d(l2);
        return string.compareTo(string2);
    }

    v6(hf hf2) {
        this.f = hf2;
    }
}
