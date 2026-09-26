/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.bf;
import com.zelix.bn;
import com.zelix.hf;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Set;

public class mz {
    private final Set X;
    private final Set a;
    private final Set Y;
    private static final long b = prr.a(-8334932907182753479L, -4657382366808803748L, MethodHandles.lookup().lookupClass()).a(193238541553916L);

    void v(Object[] objectArray) {
        _f _f2 = (_f)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = b ^ l10;
        boolean bl2 = m44.a("q", (Object)this, (long)2108541693799194581L, (long)l10).remove(_f2);
        bn[] bnArray = m44.a("p", (Object)_f2, (Object)new Object[0], (long)172181230199874746L, (long)l10);
        CallSite callSite = m44.a("o", (long)380125267643360522L, (long)l10);
        for (CallSite object : bnArray) {
            m44.a("q", (Object)this, (long)1793401892943984687L, (long)l10).remove(object);
            if (callSite == null) continue;
        }
        for (bn bn2 : _f2.I()) {
            m44.a("q", (Object)this, (long)208136034537500286L, (long)l10).remove(bn2);
            if (callSite == null) continue;
        }
    }

    public boolean j(Object[] objectArray) {
        bn bn2 = (bn)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = b ^ l10;
        return m44.a("v", (Object)this, (long)-7328386823837157679L, (long)l10).contains(bn2);
    }

    public void F(Object[] objectArray) {
        bf bf2;
        CallSite callSite;
        long l10;
        long l11;
        hf hf2;
        block12: {
            Object object;
            hf2 = (hf)objectArray[0];
            l11 = (Long)objectArray[1];
            long l12 = l11 = b ^ l11;
            l10 = l12 ^ 0x7DE4063C1DE0L;
            long l13 = l12 ^ 0x37F627A3769BL;
            Iterator iterator = m44.a("u", (Object)this, (long)2864055969856964467L, (long)l11).iterator();
            callSite = m44.a("k", (long)4186698202408376918L, (long)l11);
            block4: while (iterator.hasNext()) {
                object = iterator;
                if (l11 > 0L) {
                    if (callSite != null) break block12;
                    object = object.next();
                }
                do {
                    bf2 = (bf)object;
                    try {
                        if (l11 >= 0L) {
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l13;
                            objectArray2[0] = bf2;
                            if (m44.a("t", (Object)hf2, (Object)objectArray2, (long)4262767133529131786L, (long)l11) == false) {
                                iterator.remove();
                            }
                        }
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)2417220759023114000L, (long)l11);
                    }
                    if (callSite == null) continue block4;
                    object = m44.a("u", (Object)this, (long)4449319629353505058L, (long)l11);
                } while (l11 <= 0L);
            }
            bf bf3 = bf2 = object.iterator();
        }
        while (bf2.hasNext()) {
            bn bn2 = (bn)bf2.next();
            try {
                if (l11 > 0L) {
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = bn2;
                    objectArray3[0] = l10;
                    if (m44.a("t", (Object)hf2, (Object)objectArray3, (long)4309522293439056320L, (long)l11) == false) {
                        bf2.remove();
                    }
                }
            }
            catch (n9 n93) {
                throw m44.a("k", (Object)n93, (long)2417220759023114000L, (long)l11);
            }
            if (callSite == null) continue;
        }
    }

    public Set z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return m44.a("t", (Object)this, (long)3275941837149225451L, (long)l10);
    }

    mz(Set set, char c10, int n10, int n11, Set set2, Set set3) {
        long l10 = ((long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x6A6B407BDEEBL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = set;
        this.X = m44.a("l", (Object)objectArray, (long)4839922608914453304L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = set2;
        this.a = m44.a("l", (Object)objectArray2, (long)4839922608914453304L, (long)l10);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l11;
        objectArray3[0] = set3;
        this.Y = m44.a("l", (Object)objectArray3, (long)4839922608914453304L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

