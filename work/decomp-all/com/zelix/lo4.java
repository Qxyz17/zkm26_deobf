/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fy;
import com.zelix.lyt;
import com.zelix.m44;
import com.zelix.mn;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.uf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lo4
implements fy {
    private String j;
    private static final long a = prr.a((long)-8600498033722302301L, (long)-2600604317231585277L, MethodHandles.lookup().lookupClass()).a(241085963516275L);

    lo4(long l, String string) {
        l = a ^ l;
        m44.a("s", (Object)this, (String)string, (long)-6721805253941756598L, (long)l);
    }

    public boolean i(char c, int n, short s, String string) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        long l2 = l ^ 0x3737528C0D12L;
        return mn.R((String)string, (long)l2, (String)((Object)m44.a("w", (Object)this, (long)4726900197009497700L, (long)l)));
    }

    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean V(Object[] objectArray) {
        boolean bl;
        block5: {
            block6: {
                long l = (Long)objectArray[0];
                CallSite callSite = m44.a("j", (long)-3577336447021134180L, (long)l);
                try {
                    try {
                        bl = ((String)((Object)m44.a("t", (Object)this, (long)-3568467555137744505L, (long)l))).indexOf("*");
                        Object object = callSite;
                        if (l >= 0L) {
                            if (object == false) break block5;
                            object = -1;
                        }
                        if (bl != object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-3733695110188320325L, (long)l);
                    }
                    bl = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-3733695110188320325L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public double t(Object[] objectArray) {
        double d;
        block9: {
            double d2;
            block7: {
                block8: {
                    CallSite callSite;
                    CallSite callSite2;
                    long l;
                    block6: {
                        uf uf2 = (uf)objectArray[0];
                        l = (Long)objectArray[1];
                        lyt lyt2 = (lyt)objectArray[2];
                        long l2 = l ^ 0x7C1796786D70L;
                        d2 = 1.0;
                        callSite2 = m44.a("m", (long)-6157003669538788789L, (long)l);
                        try {
                            try {
                                callSite = m44.a("m", (Object)new Object[]{m44.a("s", (Object)this, (long)-6148236928482249392L, (long)l)}, (long)-6320424018681079622L, (long)l);
                                if (callSite2 == false) break block6;
                                if (callSite != false) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)((Object)n92), (long)-6271241965849879188L, (long)l);
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l2;
                            objectArray2[0] = m44.a("s", (Object)this, (long)-6148236928482249392L, (long)l);
                            callSite = m44.a("m", (Object)objectArray2, (long)-5587688783752955443L, (long)l);
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)((Object)n93), (long)-6271241965849879188L, (long)l);
                        }
                    }
                    if (callSite != false) break block8;
                    d = d2 * 0.1;
                    if (l <= 0L) break block9;
                    d2 = d;
                    if (callSite2 != false) break block7;
                }
                d2 *= 0.5;
            }
            d = d2;
        }
        return d;
    }

    public String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("p", (Object)this, (long)-5078274900934957445L, (long)l);
    }

    public String l(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("p", (Object)this, (long)-8411031081184635717L, (long)l);
    }

    public boolean u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
