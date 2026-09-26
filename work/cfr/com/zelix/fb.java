/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.iq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.BitSet;

public class fb
extends BitSet {
    private iq A;
    private static final long a = prr.a(5029605558058996987L, 4378708468317133351L, MethodHandles.lookup().lookupClass()).a(139175292236466L);

    public iq F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("r", (Object)this, (long)4235589408007965643L, (long)l10);
    }

    @Override
    public Object clone() {
        long l10 = a ^ 0x39CBDE521BBEL;
        fb fb2 = null;
        fb2 = (fb)super.clone();
        m44.a("q", (Object)fb2, (iq)((Object)m44.a("s", (Object)this, (long)-6517034682589227902L, (long)l10)), (long)-6517034682589227902L, (long)l10);
        return fb2;
    }

    public fb(iq iq2, long l10, int n10) {
        l10 = a ^ l10;
        super(n10);
        m44.a("u", (Object)this, (iq)iq2, (long)-9035740817372187754L, (long)l10);
    }

    public boolean I(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        fb fb2 = (fb)objectArray[1];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("s", (Object)this, (long)5190021465629047050L, (long)l10) == m44.a("s", (Object)fb2, (long)5190021465629047050L, (long)l10);
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)n92, (long)6287909780636337592L, (long)l10);
        }
        return bl2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

