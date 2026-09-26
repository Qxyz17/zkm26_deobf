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
    private static final long a = prr.a((long)9050626593998508816L, (long)-8827813661591095111L, MethodHandles.lookup().lookupClass()).a(135070572468909L);

    b(ti ti2) {
        this.O = ti2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        block9: {
            block10: {
                long l6 = l5 = a ^ 0x11041581588DL;
                l4 = l6 ^ 0x4E2320BA5EEFL;
                l3 = l6 ^ 0x3CAC9215E86EL;
                l2 = l6 ^ 0x3F8430ACC96L;
                l = l6 ^ 0x246B29F72D43L;
                callSite3 = m44.a("h", (long)-7760485735295688003L, (long)l5);
                try {
                    callSite2 = m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l5), (long)-8559086810704999264L, (long)l5);
                    if (callSite3 != null) break block9;
                    if (callSite2 == false) break block10;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-8070081459877241100L, (long)l5);
                }
                return;
            }
            callSite2 = m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l5), (long)-7985843825178476590L, (long)l5), (long)-7748201783160034913L, (long)l5);
        }
        if ((callSite = callSite2) > -1) {
            gj gj2;
            block13: {
                block11: {
                    gj2 = (gj)m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l5), (long)-7985843825178476590L, (long)l5), (long)-7930614459064216880L, (long)l5);
                    try {
                        block12: {
                            try {
                                try {
                                    if (callSite3 != null) break block11;
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l3;
                                    if (m44.a("w", (Object)gj2, (Object)objectArray, (long)-8640585042252474023L, (long)l5) != false) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)((Object)n93), (long)-8070081459877241100L, (long)l5);
                                }
                                m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l5), (long)-8529397622515133444L, (long)l5), (boolean)true, (long)-8537752668825224347L, (long)l5);
                                m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l5), (long)-8156795126719714546L, (long)l5), (boolean)true, (long)-8537752668825224347L, (long)l5);
                                if (callSite3 == null) break block13;
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)((Object)n94), (long)-8070081459877241100L, (long)l5);
                            }
                        }
                        m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l5), (long)-8529397622515133444L, (long)l5), (boolean)false, (long)-8537752668825224347L, (long)l5);
                    }
                    catch (n9 n95) {
                        throw m44.a("h", (Object)((Object)n95), (long)-8070081459877241100L, (long)l5);
                    }
                }
                m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l5), (long)-8156795126719714546L, (long)l5), (boolean)false, (long)-8537752668825224347L, (long)l5);
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l4;
            String string = (String)((Object)m44.a("w", (Object)gj2, (Object)objectArray, (long)-7521550496970421711L, (long)l5));
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l2;
            objectArray2[0] = string;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = (int)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l5), (long)-7595189036401423020L, (long)l5);
            objectArray3[0] = l;
            CallSite callSite4 = m44.a("w", (Object)m44.a("w", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l5), (Object)objectArray2, (long)-7600082336755945768L, (long)l5), (Object)objectArray3, (long)-8609893088031150076L, (long)l5);
            m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l5), (long)-8261579418633425188L, (long)l5), (Object)callSite4, (long)-7627417968163426282L, (long)l5);
            m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-8637480990556634622L, (long)l5), (long)-8261579418633425188L, (long)l5), (int)0, (long)-7990226911372051963L, (long)l5);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
