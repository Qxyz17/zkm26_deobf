/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lyz;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class la9
extends l7t
implements r5 {
    private String l;
    private String Z;
    private static final long a = prr.a(6096238399203345955L, 8921042417724864631L, MethodHandles.lookup().lookupClass()).a(258603591332984L);

    @Override
    public void r(Object[] objectArray) {
        block8: {
            la9 la92;
            String string;
            long l10;
            block6: {
                l10 = (Long)objectArray[0];
                string = (String)objectArray[1];
                CallSite callSite = m44.a("o", (long)-8556877710995355143L, (long)l10);
                try {
                    block7: {
                        try {
                            try {
                                la92 = this;
                                if (callSite == false) break block6;
                                if (m44.a("q", (Object)la92, (long)-8470485240861638387L, (long)l10) != null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)n92, (long)-8417057654190871172L, (long)l10);
                            }
                            m44.a("s", (Object)this, (String)string, (long)-8470485240861638387L, (long)l10);
                            if (callSite != false) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)n93, (long)-8417057654190871172L, (long)l10);
                        }
                    }
                    la92 = this;
                }
                catch (n9 n94) {
                    throw m44.a("o", (Object)n94, (long)-8417057654190871172L, (long)l10);
                }
            }
            m44.a("s", (Object)la92, (String)string, (long)-7768464418237233910L, (long)l10);
        }
    }

    public la9(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x23CCEB3FA72DL;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void M(Object[] objectArray) {
        lmu lmu2;
        long l10;
        long l11;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l11 = (Long)objectArray[2];
            long l12 = l11;
            long l13 = l12 ^ 0x47526B4E5A06L;
            long l14 = l12 ^ 0L;
            l10 = l12 ^ 0x76161CEB9BA5L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l11);
            CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l11);
            int n10 = 0;
            block2: while (n10 < callSite) {
                try {
                    do {
                        if (l11 >= 0L) {
                            lmu2 = this.V(n10);
                            if (callSite2 != false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l14;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l11);
                            ++n10;
                        }
                        if (callSite2 == false) continue block2;
                    } while (l11 <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-4969728810106856117L, (long)l11);
                }
            }
            lmu2 = lmu3;
        }
        lyz lyz2 = (lyz)lmu2;
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = m44.a("v", (Object)this, (long)-6627119867650411203L, (long)l11);
        objectArray4[1] = m44.a("v", (Object)this, (long)-5024423031213723334L, (long)l11);
        objectArray4[0] = l10;
        m44.a("w", (Object)lyz2, (Object)objectArray4, (long)-6883801747137827115L, (long)l11);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

