/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bn;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class fn
implements Comparator {
    private static final long a = prr.a(-1840574805815960372L, -5143970296929056987L, MethodHandles.lookup().lookupClass()).a(93620604571456L);

    public int compare(Object object, Object object2) {
        long l10 = a ^ 0x39C35F00F493L;
        long l11 = l10 ^ 0x372F11591C3AL;
        Object[] objectArray = new Object[3];
        objectArray[2] = (bn)object2;
        objectArray[1] = (bn)object;
        objectArray[0] = l11;
        return (int)m44.a("u", (Object)this, (Object)objectArray, (long)8339431729385711003L, (long)l10);
    }

    public int R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        bn bn2 = (bn)objectArray[1];
        bn bn3 = (bn)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x512635C26461L;
        String string = bn2.Z(l11) + bn2.V();
        String string2 = bn3.Z(l11) + bn3.V();
        return string.compareTo(string2);
    }

    fn() {
    }
}

