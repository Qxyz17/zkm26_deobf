/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.g6;
import com.zelix.lq7;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lwz {
    private final int R;
    private final boolean q;
    private final boolean C;
    private final g6 U;
    private final boolean V;
    private static final long a = prr.a(7417667601270073212L, -3912385527468078781L, MethodHandles.lookup().lookupClass()).a(144329349853917L);

    public boolean q(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("u", (Object)this, (long)4747050717746875709L, (long)l10) == m44.a("o", (long)6697817882446206257L, (long)l10);
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)n92, (long)4628751491218102985L, (long)l10);
        }
        return bl2;
    }

    public boolean D(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("q", (Object)this, (long)-9035162094394536383L, (long)l10) == m44.a("k", (long)-7016447121844789818L, (long)l10);
        }
        catch (n9 n92) {
            throw m44.a("o", (Object)n92, (long)-8988922635156481611L, (long)l10);
        }
        return bl2;
    }

    public boolean b(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l11 = (l10 << 16 | (long)n10 << 48 >>> 48) ^ a;
        try {
            bl2 = m44.a("w", (Object)this, (long)-2755481266705312481L, (long)l11) == m44.a("m", (long)-2773755560268517646L, (long)l11);
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)n92, (long)-2873619904424787221L, (long)l11);
        }
        return bl2;
    }

    private lwz(int n10, g6 g62, boolean bl2, boolean bl3, boolean bl4) {
        this.R = n10;
        this.U = g62;
        this.C = bl2;
        this.q = bl3;
        this.V = bl4;
    }

    public g6 E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("r", (Object)this, (long)-1936572678090495550L, (long)l10);
    }

    public boolean E(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("p", (Object)this, (long)143425442266844448L, (long)l10) == m44.a("j", (long)1958907153140512561L, (long)l10);
        }
        catch (n9 n92) {
            throw m44.a("n", (Object)n92, (long)9505420219259604L, (long)l10);
        }
        return bl2;
    }

    lwz(int n10, g6 g62, boolean bl2, boolean bl3, boolean bl4, lq7 lq72) {
        this(n10, g62, bl2, bl3, bl4);
    }

    public int V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("u", (Object)this, (long)6947828650362770037L, (long)l10);
    }

    public boolean l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("p", (Object)this, (long)-1970674413946365011L, (long)l10);
    }

    public boolean r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("q", (Object)this, (long)1639816464764103318L, (long)l10);
    }

    public boolean w(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("w", (Object)this, (long)5107848135077186111L, (long)l10) == m44.a("m", (long)6776861343667162554L, (long)l10);
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)n92, (long)5133806019472219595L, (long)l10);
        }
        return bl2;
    }

    public boolean O(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("w", (Object)this, (long)6422863388115391999L, (long)l10) == m44.a("m", (long)6460738769036606910L, (long)l10);
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)n92, (long)6412793506837250571L, (long)l10);
        }
        return bl2;
    }

    public boolean e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("p", (Object)this, (long)2673626610286370819L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

