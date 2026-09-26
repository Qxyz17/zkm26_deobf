/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lt9;
import com.zelix.lwc;
import com.zelix.m44;
import com.zelix.mn;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class ltc
extends l7t
implements dd {
    private String f;
    private List Q;
    private static final long a = prr.a(-9045379442993402837L, 469678527270908405L, MethodHandles.lookup().lookupClass()).a(186543618109611L);

    @Override
    public void M(Object[] objectArray) {
        block9: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l10 = (Long)objectArray[2];
            long l11 = l10 ^ 0x47526B4E5A06L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l11;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
            CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l10);
            StringBuilder stringBuilder = new StringBuilder();
            int n10 = 0;
            while (n10 < callSite) {
                CallSite callSite3;
                block10: {
                    block11: {
                        block12: {
                            CallSite callSite4 = m44.a("w", (Object)((lt9)this.V(n10)), (Object)new Object[0], (long)-4968184746715213117L, (long)l10);
                            try {
                                try {
                                    try {
                                        m44.a("v", (Object)this, (long)-5036607664752409362L, (long)l10).add(callSite4);
                                        stringBuilder.append((String)((Object)callSite4));
                                        callSite3 = callSite2;
                                        if (l10 > 0L) {
                                            if (callSite3 != false) break block9;
                                            callSite3 = callSite2;
                                        }
                                        if (l10 <= 0L) break block10;
                                        if (callSite3 != false) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)n92, (long)-4892455316936313536L, (long)l10);
                                    }
                                    if (n10 >= callSite - true) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)n93, (long)-4892455316936313536L, (long)l10);
                                }
                                stringBuilder.append(".");
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)n94, (long)-4892455316936313536L, (long)l10);
                            }
                        }
                        ++n10;
                    }
                    callSite3 = callSite2;
                }
                if (callSite3 == false) continue;
            }
            m44.a("t", (Object)this, (String)stringBuilder.toString(), (long)-6350911104441308869L, (long)l10);
            if (l10 >= 0L) {
                // empty if block
            }
        }
    }

    @Override
    public String e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (String)((Object)m44.a("p", (Object)this, (long)-6380737968257291883L, (long)l10)) + "/";
    }

    @Override
    public boolean i(char c10, int n10, short s10, String string) {
        long l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)s10 << 48 >>> 48;
        long l11 = l10 ^ 0x3737528C0D12L;
        return mn.R(string, l11, (String)((Object)m44.a("w", (Object)this, (long)6875894725722362250L, (long)l10)));
    }

    public ltc(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x68B1370BAA35L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
        m44.a("u", (Object)this, new ArrayList(), (long)-6115041135853480489L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List j(Object[] objectArray) {
        ArrayList<CallSite> arrayList;
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x6D4E6E6323D7L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        CallSite callSite = m44.a("v", (Object)this, (Object)objectArray2, (long)-4382703346356799132L, (long)l10);
        CallSite callSite2 = m44.a("i", (long)-4550442945665220577L, (long)l10);
        ArrayList<CallSite> arrayList2 = new ArrayList<CallSite>((int)callSite);
        int n10 = 0;
        block2: while (n10 < callSite) {
            lwc lwc2 = (lwc)this.V(n10);
            try {
                do {
                    if (l10 >= 0L) {
                        arrayList = arrayList2;
                        if (callSite2 == false) return arrayList;
                        arrayList.add(m44.a("v", (Object)lwc2, (Object)new Object[0], (long)-4405544803980547310L, (long)l10));
                        ++n10;
                    }
                    if (callSite2 != false) continue block2;
                } while (l10 < 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("i", (Object)n92, (long)-4194069702963147631L, (long)l10);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

