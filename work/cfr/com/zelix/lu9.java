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
    private static final long a = prr.a(8271116587704355024L, 9103066325215583315L, MethodHandles.lookup().lookupClass()).a(91527526381218L);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void r(Object[] objectArray) {
        block8: {
            lu9 lu92;
            long l10;
            long l11;
            block6: {
                l11 = (Long)objectArray[0];
                long l12 = l11;
                long l13 = l12 ^ 0x15F6F36544F9L;
                long l14 = l12 ^ 0x2ECE32FF0BBEL;
                l10 = l12 ^ 0x6D3DAC6E26F3L;
                CallSite callSite = m44.a("h", (long)5561146463333268445L, (long)l11);
                try {
                    block7: {
                        try {
                            try {
                                lu92 = this;
                                if (callSite != null) break block6;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l13;
                                if (m44.a("w", (Object)lu92, (Object)objectArray2, (long)5223209049430320351L, (long)l11) == false) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)n92, (long)6207108405700613226L, (long)l11);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = m44.a("v", (Object)this, (long)5449831481625691714L, (long)l11);
                            objectArray3[0] = l14;
                            m44.a("h", (Object)objectArray3, (long)6073569148330368578L, (long)l11);
                            if (callSite == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)6207108405700613226L, (long)l11);
                        }
                    }
                    lu92 = this;
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)n94, (long)6207108405700613226L, (long)l11);
                }
            }
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = m44.a("v", (Object)m44.a("v", (Object)this, (long)5449831481625691714L, (long)l11), (long)6200959092451086461L, (long)l11);
            objectArray4[1] = m44.a("v", (Object)lu92, (long)5449831481625691714L, (long)l11);
            objectArray4[0] = l10;
            m44.a("h", (Object)objectArray4, (long)5636822610453225572L, (long)l11);
        }
    }

    lu9(mu mu2, short s10, long l10) {
        long l11 = ((long)s10 << 48 | l10 << 16 >>> 16) ^ a;
        long l12 = l11 ^ 0x4978A238CEA6L;
        this.w = mu2;
        super(l12);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

