/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dh;
import com.zelix.gd;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n4;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zy;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class d4
extends dh {
    private gd F;
    private static final long e = prr.a(-6687470709563168906L, 4925941947814969264L, MethodHandles.lookup().lookupClass()).a(187925060638473L);

    d4(n4 n42, boolean bl2, boolean bl3, String string, int n10, int n11, boolean bl4, zy zy2, HashMap hashMap, l6q l6q2, Map map, List list, long l10) {
        long l11 = (l10 = e ^ l10) ^ 0x7EBD8415D080L;
        super(n42, bl2, l11, bl3, string, n10, n11, bl4, zy2, hashMap, l6q2, map, list);
    }

    @Override
    gd S(Object[] objectArray) {
        CallSite callSite;
        block4: {
            long l10;
            block5: {
                char[] cArray = (char[])objectArray[0];
                char[] cArray2 = (char[])objectArray[1];
                char[] cArray3 = (char[])objectArray[2];
                l10 = (Long)objectArray[3];
                char[] cArray4 = (char[])objectArray[4];
                List list = (List)objectArray[5];
                long l11 = l10 ^ 0x5361830D405DL;
                CallSite callSite2 = m44.a("l", (long)6646477747554172017L, (long)l10);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)5074690950811323947L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)4687577601190868660L, (long)l10);
                    }
                    m44.a("p", (Object)this, (gd)new gd(cArray, cArray2, l11, cArray3, cArray4, list, (boolean)m44.a("r", (Object)this, (long)6605499827288897627L, (long)l10)), (long)5074690950811323947L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)4687577601190868660L, (long)l10);
                }
            }
            callSite = m44.a("r", (Object)this, (long)5074690950811323947L, (long)l10);
        }
        return callSite;
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}

