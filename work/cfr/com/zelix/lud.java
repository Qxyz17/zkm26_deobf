/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.lu4;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.sz;
import com.zelix.wa;
import java.lang.invoke.CallSite;

public class lud
extends lmc {
    final lu4 j;
    final wa p;

    @Override
    public void r(Object[] objectArray) {
        block5: {
            lud lud2;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                long l12 = l11;
                long l13 = l12 ^ 0x2CC9B515DEFCL;
                l10 = l12 ^ 0x56B22D5AB9DEL;
                long l14 = l12 ^ 0x7DF00FAAC8F2L;
                long l15 = l12 ^ 0x31575F7C174AL;
                CallSite callSite = m44.a("h", (long)5561146463333268445L, (long)l11);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l14;
                m44.a("w", (Object)m44.a("v", (Object)this, (long)5227639810006172118L, (long)l11), (Object)objectArray2, (long)5383093239249358332L, (long)l11);
                CallSite callSite2 = callSite;
                try {
                    try {
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = m44.a("v", (Object)this, (long)5227639810006172118L, (long)l11);
                        objectArray3[0] = l13;
                        ((sz)((Object)m44.a("h", (Object)objectArray3, (long)5200215195953389601L, (long)l11))).Z(l15, " ");
                        lud2 = this;
                        if (callSite2 != null) break block4;
                        if (m44.a("v", (Object)lud2, (long)6094254526432993164L, (long)l11) != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)5810911469446533786L, (long)l11);
                    }
                    lud2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)5810911469446533786L, (long)l11);
                }
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l10;
            objectArray4[0] = false;
            m44.a("w", (Object)m44.a("v", (Object)lud2, (long)5227639810006172118L, (long)l11), (Object)objectArray4, (long)6230706247764054053L, (long)l11);
        }
    }

    lud(wa wa2, lu4 lu42) {
        this.p = wa2;
        this.j = lu42;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

