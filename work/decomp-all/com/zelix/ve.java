/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.nt;
import com.zelix.prr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ve
implements ActionListener {
    final nt s;
    private static final long a = prr.a((long)1940061759962983053L, (long)-6441200495560447461L, MethodHandles.lookup().lookupClass()).a(130185444826916L);

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block11: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            long l3;
            block9: {
                long l4 = l3 = a ^ 0x73B3F1047A9CL;
                l2 = l4 ^ 0x4E3EAAC04A40L;
                long l5 = l4 ^ 0xBCE6BFD08B4L;
                long l6 = l4 ^ 0x5E142E5865D1L;
                l = l4 ^ 0x6BE45F41BE55L;
                CallSite callSite3 = m44.a("m", (long)-694592876589452581L, (long)l3);
                try {
                    block10: {
                        try {
                            try {
                                callSite2 = m44.a("r", (Object)actionEvent, (long)-1571720798922875356L, (long)l3);
                                callSite = m44.a("s", (Object)this, (long)-1512356548516876618L, (long)l3);
                                if (callSite3 != null) break block9;
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l5;
                                objectArray[0] = callSite;
                                if (callSite2 != m44.a("m", (Object)objectArray, (long)-706950857490206801L, (long)l3)) break block10;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)((Object)n92), (long)-729948192576706094L, (long)l3);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l6;
                            m44.a("r", (Object)m44.a("s", (Object)this, (long)-1512356548516876618L, (long)l3), (Object)objectArray, (long)-1705567484063100971L, (long)l3);
                            if (callSite3 == null) break block11;
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)((Object)n93), (long)-729948192576706094L, (long)l3);
                        }
                    }
                    callSite2 = m44.a("r", (Object)actionEvent, (long)-1571720798922875356L, (long)l3);
                    callSite = m44.a("s", (Object)this, (long)-1512356548516876618L, (long)l3);
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)((Object)n94), (long)-729948192576706094L, (long)l3);
                }
            }
            try {
                Object[] objectArray = new Object[2];
                objectArray[1] = callSite;
                objectArray[0] = l2;
                if (callSite2 == m44.a("m", (Object)objectArray, (long)-1296222891132008073L, (long)l3)) {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l;
                    m44.a("r", (Object)m44.a("s", (Object)this, (long)-1512356548516876618L, (long)l3), (Object)objectArray2, (long)-594275636118220414L, (long)l3);
                }
            }
            catch (n9 n95) {
                throw m44.a("m", (Object)((Object)n95), (long)-729948192576706094L, (long)l3);
            }
        }
    }

    ve(nt nt2) {
        this.s = nt2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
