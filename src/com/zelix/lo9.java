/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lo9
implements ActionListener {
    final lbc z;
    private static final long a = prr.a((long)-5656112733939263567L, (long)-2323304795090678566L, MethodHandles.lookup().lookupClass()).a(164083356311037L);

    lo9(lbc lbc2) {
        this.z = lbc2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block11: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            block9: {
                long l3 = l2 = a ^ 0x8CED8D96391L;
                long l4 = l3 ^ 0x263235589ADFL;
                l = l3 ^ 0x727ACCB8167FL;
                CallSite callSite3 = m44.a("s", (Object)actionEvent, (long)9221445003678927853L, (long)l2);
                CallSite callSite4 = m44.a("l", (long)6993470726000397929L, (long)l2);
                try {
                    block10: {
                        try {
                            try {
                                callSite2 = callSite3;
                                callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)7088396538186963174L, (long)l2), (long)6938468739577392841L, (long)l2);
                                if (callSite4 == null) break block9;
                                if (callSite2 != callSite) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)((Object)n92), (long)9018919231543037731L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            m44.a("s", (Object)m44.a("r", (Object)this, (long)7088396538186963174L, (long)l2), (Object)objectArray, (long)9208018857370152674L, (long)l2);
                            if (callSite4 != null) break block11;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)((Object)n93), (long)9018919231543037731L, (long)l2);
                        }
                    }
                    callSite2 = callSite3;
                    callSite = m44.a("r", (Object)m44.a("r", (Object)this, (long)7088396538186963174L, (long)l2), (long)7317634296954107765L, (long)l2);
                }
                catch (n9 n94) {
                    throw m44.a("l", (Object)((Object)n94), (long)9018919231543037731L, (long)l2);
                }
            }
            try {
                if (callSite2 == callSite) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    m44.a("s", (Object)m44.a("r", (Object)this, (long)7088396538186963174L, (long)l2), (Object)objectArray, (long)8961651517388293097L, (long)l2);
                }
            }
            catch (n9 n95) {
                throw m44.a("l", (Object)((Object)n95), (long)9018919231543037731L, (long)l2);
            }
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
