/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lyz;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class la9
extends l7t
implements r5 {
    private String l;
    private String Z;
    private static final long a = prr.a((long)6096238399203345955L, (long)8921042417724864631L, MethodHandles.lookup().lookupClass()).a(258603591332984L);

    public void r(Object[] objectArray) {
        block8: {
            la9 la92;
            String string;
            long l;
            block6: {
                l = (Long)objectArray[0];
                string = (String)objectArray[1];
                CallSite callSite = m44.a("o", (long)-8556877710995355143L, (long)l);
                try {
                    block7: {
                        try {
                            try {
                                la92 = this;
                                if (callSite == false) break block6;
                                if (m44.a("q", (Object)((Object)la92), (long)-8470485240861638387L, (long)l) != null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)((Object)n92), (long)-8417057654190871172L, (long)l);
                            }
                            m44.a("s", (Object)((Object)this), (String)string, (long)-8470485240861638387L, (long)l);
                            if (callSite != false) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)((Object)n93), (long)-8417057654190871172L, (long)l);
                        }
                    }
                    la92 = this;
                }
                catch (n9 n94) {
                    throw m44.a("o", (Object)((Object)n94), (long)-8417057654190871172L, (long)l);
                }
            }
            m44.a("s", (Object)((Object)la92), (String)string, (long)-7768464418237233910L, (long)l);
        }
    }

    public la9(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x23CCEB3FA72DL;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void M(Object[] objectArray) {
        lmu lmu2;
        long l;
        long l2;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l2 = (Long)objectArray[2];
            long l3 = l2;
            long l4 = l3 ^ 0x47526B4E5A06L;
            long l5 = l3 ^ 0L;
            l = l3 ^ 0x76161CEB9BA5L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l2);
            CallSite callSite2 = m44.a("h", (long)-6823249310977527178L, (long)l2);
            int n = 0;
            block2: while (n < callSite) {
                try {
                    do {
                        if (l2 >= 0L) {
                            lmu2 = this.V(n);
                            if (callSite2 != false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l5;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l2);
                            ++n;
                        }
                        if (callSite2 == false) continue block2;
                    } while (l2 <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-4969728810106856117L, (long)l2);
                }
            }
            lmu2 = lmu3;
        }
        lyz lyz2 = (lyz)lmu2;
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = m44.a("v", (Object)((Object)this), (long)-6627119867650411203L, (long)l2);
        objectArray4[1] = m44.a("v", (Object)((Object)this), (long)-5024423031213723334L, (long)l2);
        objectArray4[0] = l;
        m44.a("w", (Object)lyz2, (Object)objectArray4, (long)-6883801747137827115L, (long)l2);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
