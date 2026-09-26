/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e_;
import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.wa;
import java.lang.invoke.CallSite;

public class lux
extends lmc {
    final e_ j;
    final wa i;

    @Override
    public void r(Object[] objectArray) {
        block5: {
            lux lux2;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                long l12 = l11;
                l10 = l12 ^ 0x56B22D5AB9DEL;
                long l13 = l12 ^ 0x7DF00FAAC8F2L;
                CallSite callSite = m44.a("h", (long)5561146463333268445L, (long)l11);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l13;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)5271626361121939005L, (long)l11), (Object)objectArray2, (long)5383093239249358332L, (long)l11);
                CallSite callSite2 = callSite;
                try {
                    try {
                        lux2 = this;
                        if (callSite2 != null) break block4;
                        if (m44.a("v", (Object)lux2, (long)5744842256383619321L, (long)l11) != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)5557251941170941443L, (long)l11);
                    }
                    lux2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)5557251941170941443L, (long)l11);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l10;
            objectArray3[0] = false;
            m44.a("w", (Object)m44.a("v", (Object)lux2, (long)5271626361121939005L, (long)l11), (Object)objectArray3, (long)6230706247764054053L, (long)l11);
        }
    }

    lux(wa wa2, e_ e_2) {
        this.i = wa2;
        this.j = e_2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

