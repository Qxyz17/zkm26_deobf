/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class l68
implements Enumeration {
    private Enumeration K;
    private static final long a = prr.a((long)-8759402806389519300L, (long)2452586693663677649L, MethodHandles.lookup().lookupClass()).a(18112331495076L);

    public final Object nextElement() {
        long l = a ^ 0x390996B5B261L;
        return m44.a("q", (Object)this, (long)-2118012844468124839L, (long)l).nextElement();
    }

    @Override
    public final boolean hasMoreElements() {
        long l = a ^ 0x1B4EFDED32E8L;
        return m44.a("p", (Object)this, (long)7066830394307101648L, (long)l).hasMoreElements();
    }

    public l68(long l, Collection collection) {
        l = a ^ l;
        ArrayList arrayList = new ArrayList(collection);
        m44.a("q", (Object)this, Collections.enumeration(arrayList), (long)6143289979621078147L, (long)l);
    }
}
