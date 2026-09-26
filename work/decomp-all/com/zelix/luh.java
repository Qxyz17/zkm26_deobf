/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.lu4;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.wa;
import java.lang.invoke.CallSite;

public class luh
extends lmc {
    final lu4 p;
    final wa Y;

    luh(wa wa2, lu4 lu42) {
        this.Y = wa2;
        this.p = lu42;
    }

    public void r(Object[] objectArray) {
        block5: {
            luh luh2;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                long l3 = l2;
                long l4 = l3 ^ 0x2CC9B515DEFCL;
                l = l3 ^ 0x56B22D5AB9DEL;
                long l5 = l3 ^ 0x7DF00FAAC8F2L;
                long l6 = l3 ^ 0x31575F7C174AL;
                CallSite callSite = m44.a("h", (long)5561146463333268445L, (long)l2);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l5;
                m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5751857749131580667L, (long)l2), (Object)objectArray2, (long)5383093239249358332L, (long)l2);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = m44.a("v", (Object)((Object)this), (long)5751857749131580667L, (long)l2);
                objectArray3[0] = l4;
                m44.a("h", (Object)objectArray3, (long)5200215195953389601L, (long)l2).Z(l6, " ");
                CallSite callSite2 = callSite;
                try {
                    try {
                        luh2 = this;
                        if (callSite2 != null) break block4;
                        if (m44.a("v", (Object)((Object)luh2), (long)5273519769164029642L, (long)l2) != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)5708771829852301960L, (long)l2);
                    }
                    luh2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)5708771829852301960L, (long)l2);
                }
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l;
            objectArray4[0] = false;
            m44.a("w", (Object)m44.a("v", (Object)((Object)luh2), (long)5751857749131580667L, (long)l2), (Object)objectArray4, (long)6230706247764054053L, (long)l2);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
