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
    private static final long a = prr.a((long)-9045379442993402837L, (long)469678527270908405L, MethodHandles.lookup().lookupClass()).a(186543618109611L);

    public void M(Object[] objectArray) {
        block9: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l = (Long)objectArray[2];
            long l2 = l ^ 0x47526B4E5A06L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
            CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l);
            StringBuilder stringBuilder = new StringBuilder();
            int n = 0;
            while (n < callSite) {
                CallSite callSite3;
                block10: {
                    block11: {
                        block12: {
                            CallSite callSite4 = m44.a("w", (Object)((lt9)this.V(n)), (Object)new Object[0], (long)-4968184746715213117L, (long)l);
                            try {
                                try {
                                    try {
                                        m44.a("v", (Object)((Object)this), (long)-5036607664752409362L, (long)l).add(callSite4);
                                        stringBuilder.append((String)((Object)callSite4));
                                        callSite3 = callSite2;
                                        if (l > 0L) {
                                            if (callSite3 != false) break block9;
                                            callSite3 = callSite2;
                                        }
                                        if (l <= 0L) break block10;
                                        if (callSite3 != false) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)((Object)n92), (long)-4892455316936313536L, (long)l);
                                    }
                                    if (n >= callSite - true) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)((Object)n93), (long)-4892455316936313536L, (long)l);
                                }
                                stringBuilder.append(".");
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)((Object)n94), (long)-4892455316936313536L, (long)l);
                            }
                        }
                        ++n;
                    }
                    callSite3 = callSite2;
                }
                if (callSite3 == false) continue;
            }
            m44.a("t", (Object)((Object)this), (String)stringBuilder.toString(), (long)-6350911104441308869L, (long)l);
            if (l >= 0L) {
                // empty if block
            }
        }
    }

    public String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (String)((Object)m44.a("p", (Object)((Object)this), (long)-6380737968257291883L, (long)l)) + "/";
    }

    public boolean i(char c, int n, short s, String string) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        long l2 = l ^ 0x3737528C0D12L;
        return mn.R((String)string, (long)l2, (String)((Object)m44.a("w", (Object)((Object)this), (long)6875894725722362250L, (long)l)));
    }

    public ltc(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x68B1370BAA35L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
        m44.a("u", (Object)((Object)this), new ArrayList(), (long)-6115041135853480489L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List j(Object[] objectArray) {
        ArrayList<CallSite> arrayList;
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x6D4E6E6323D7L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        CallSite callSite = m44.a("v", (Object)((Object)this), (Object)objectArray2, (long)-4382703346356799132L, (long)l);
        CallSite callSite2 = m44.a("i", (long)-4550442945665220577L, (long)l);
        ArrayList<CallSite> arrayList2 = new ArrayList<CallSite>((int)callSite);
        int n = 0;
        block2: while (n < callSite) {
            lwc lwc2 = (lwc)this.V(n);
            try {
                do {
                    if (l >= 0L) {
                        arrayList = arrayList2;
                        if (callSite2 == false) return arrayList;
                        arrayList.add(m44.a("v", (Object)lwc2, (Object)new Object[0], (long)-4405544803980547310L, (long)l));
                        ++n;
                    }
                    if (callSite2 != false) continue block2;
                } while (l < 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("i", (Object)((Object)n92), (long)-4194069702963147631L, (long)l);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
