/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.b0;
import com.zelix.hf;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.Map;

public class lo2
implements Comparator {
    final hf i;
    private static final long a = prr.a((long)2841895399715247088L, (long)-2318159512377097876L, MethodHandles.lookup().lookupClass()).a(210321010682056L);

    public int compare(Object object, Object object2) {
        long l = a ^ 0x2CA606BE4D3AL;
        long l2 = l ^ 0x52ABC0CD95C5L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (Map.Entry)object2;
        objectArray[1] = (Map.Entry)object;
        objectArray[0] = l2;
        return (int)m44.a("p", (Object)this, (Object)objectArray, (long)-2201265890815986987L, (long)l);
    }

    public int p(Object[] objectArray) {
        int n;
        block6: {
            int n2;
            block7: {
                CallSite callSite;
                block8: {
                    CallSite callSite2;
                    block9: {
                        long l = (Long)objectArray[0];
                        Map.Entry entry = (Map.Entry)objectArray[1];
                        Map.Entry entry2 = (Map.Entry)objectArray[2];
                        long l2 = l = a ^ l;
                        long l3 = l2 ^ 0x55C0FF450593L;
                        long l4 = l2 ^ 0x4E8B03BEE98CL;
                        long l5 = l2 ^ 0x793E626763D1L;
                        Map.Entry entry3 = entry;
                        CallSite callSite3 = m44.a("h", (long)-3174644225267092547L, (long)l);
                        Map.Entry entry4 = entry2;
                        n2 = ((String)entry3.getValue()).compareTo((String)entry4.getValue());
                        try {
                            n = n2;
                            if (callSite3 != null) break block6;
                            if (n != 0) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)((Object)n92), (long)-3253293665477718178L, (long)l);
                        }
                        b0 b02 = (b0)entry3.getKey();
                        b0 b03 = (b0)entry4.getKey();
                        callSite2 = m44.a("w", (Object)b02.G(l3), (Object)b03.G(l3), (long)l5, (long)-3746516946248239433L, (long)l);
                        try {
                            try {
                                callSite = callSite2;
                                if (callSite3 != null) break block8;
                                if (callSite != false) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)((Object)n93), (long)-3253293665477718178L, (long)l);
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l4;
                            objectArray2[0] = b03;
                            return (int)m44.a("w", (Object)b02, (Object)objectArray2, (long)-3899698970236878715L, (long)l);
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)((Object)n94), (long)-3253293665477718178L, (long)l);
                        }
                    }
                    callSite = callSite2;
                }
                return (int)callSite;
            }
            n = n2;
        }
        return n;
    }

    lo2(hf hf2) {
        this.i = hf2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
