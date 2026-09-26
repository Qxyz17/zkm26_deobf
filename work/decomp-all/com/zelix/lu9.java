/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lu4;
import com.zelix.m44;
import com.zelix.mu;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lu9
extends lu4 {
    final mu w;
    private static final long a = prr.a((long)8271116587704355024L, (long)9103066325215583315L, MethodHandles.lookup().lookupClass()).a(91527526381218L);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void r(Object[] objectArray) {
        block8: {
            lu9 lu92;
            long l;
            long l2;
            block6: {
                l2 = (Long)objectArray[0];
                long l3 = l2;
                long l4 = l3 ^ 0x15F6F36544F9L;
                long l5 = l3 ^ 0x2ECE32FF0BBEL;
                l = l3 ^ 0x6D3DAC6E26F3L;
                CallSite callSite = m44.a("h", (long)5561146463333268445L, (long)l2);
                try {
                    block7: {
                        try {
                            try {
                                lu92 = this;
                                if (callSite != null) break block6;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l4;
                                if (m44.a("w", (Object)((Object)lu92), (Object)objectArray2, (long)5223209049430320351L, (long)l2) == false) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)6207108405700613226L, (long)l2);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = m44.a("v", (Object)((Object)this), (long)5449831481625691714L, (long)l2);
                            objectArray3[0] = l5;
                            m44.a("h", (Object)objectArray3, (long)6073569148330368578L, (long)l2);
                            if (callSite == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)6207108405700613226L, (long)l2);
                        }
                    }
                    lu92 = this;
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)((Object)n94), (long)6207108405700613226L, (long)l2);
                }
            }
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = m44.a("v", (Object)m44.a("v", (Object)((Object)this), (long)5449831481625691714L, (long)l2), (long)6200959092451086461L, (long)l2);
            objectArray4[1] = m44.a("v", (Object)((Object)lu92), (long)5449831481625691714L, (long)l2);
            objectArray4[0] = l;
            m44.a("h", (Object)objectArray4, (long)5636822610453225572L, (long)l2);
        }
    }

    lu9(mu mu2, short s, long l) {
        long l2 = ((long)s << 48 | l << 16 >>> 16) ^ a;
        long l3 = l2 ^ 0x4978A238CEA6L;
        this.w = mu2;
        super(l3);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
