/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gj;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ti;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class b
implements ListSelectionListener {
    final ti O;
    private static final long a = prr.a(9050626593998508816L, -8827813661591095111L, MethodHandles.lookup().lookupClass()).a(135070572468909L);

    b(ti ti2) {
        this.O = ti2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l10;
        long l11;
        long l12;
        long l13;
        long l14;
        block9: {
            block10: {
                long l15 = l14 = a ^ 0x11041581588DL;
                l13 = l15 ^ 0x4E2320BA5EEFL;
                l12 = l15 ^ 0x3CAC9215E86EL;
                l11 = l15 ^ 0x3F8430ACC96L;
                l10 = l15 ^ 0x246B29F72D43L;
                callSite3 = m44.a("h", (long)-7760485735295688003L, (long)l14);
                try {
                    callSite2 = m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l14), (long)-8559086810704999264L, (long)l14);
                    if (callSite3 != null) break block9;
                    if (callSite2 == false) break block10;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-8070081459877241100L, (long)l14);
                }
                return;
            }
            callSite2 = m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l14), (long)-7985843825178476590L, (long)l14), (long)-7748201783160034913L, (long)l14);
        }
        if ((callSite = callSite2) > -1) {
            gj gj2;
            block13: {
                block11: {
                    gj2 = (gj)((Object)m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l14), (long)-7985843825178476590L, (long)l14), (long)-7930614459064216880L, (long)l14));
                    try {
                        block12: {
                            try {
                                try {
                                    if (callSite3 != null) break block11;
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l12;
                                    if (m44.a("w", (Object)gj2, (Object)objectArray, (long)-8640585042252474023L, (long)l14) != false) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)n93, (long)-8070081459877241100L, (long)l14);
                                }
                                m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l14), (long)-8529397622515133444L, (long)l14), (boolean)true, (long)-8537752668825224347L, (long)l14);
                                m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l14), (long)-8156795126719714546L, (long)l14), (boolean)true, (long)-8537752668825224347L, (long)l14);
                                if (callSite3 == null) break block13;
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)n94, (long)-8070081459877241100L, (long)l14);
                            }
                        }
                        m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l14), (long)-8529397622515133444L, (long)l14), (boolean)false, (long)-8537752668825224347L, (long)l14);
                    }
                    catch (n9 n95) {
                        throw m44.a("h", (Object)n95, (long)-8070081459877241100L, (long)l14);
                    }
                }
                m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l14), (long)-8156795126719714546L, (long)l14), (boolean)false, (long)-8537752668825224347L, (long)l14);
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l13;
            String string = (String)((Object)m44.a("w", (Object)gj2, (Object)objectArray, (long)-7521550496970421711L, (long)l14));
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l11;
            objectArray2[0] = string;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = (int)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l14), (long)-7595189036401423020L, (long)l14);
            objectArray3[0] = l10;
            CallSite callSite4 = m44.a("w", (Object)m44.a("w", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l14), (Object)objectArray2, (long)-7600082336755945768L, (long)l14), (Object)objectArray3, (long)-8609893088031150076L, (long)l14);
            m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l14), (long)-8261579418633425188L, (long)l14), (Object)callSite4, (long)-7627417968163426282L, (long)l14);
            m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l14), (long)-8261579418633425188L, (long)l14), (int)0, (long)-7990226911372051963L, (long)l14);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

