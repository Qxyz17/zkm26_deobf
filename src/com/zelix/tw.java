/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix._v;
import com.zelix.hf;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.Map;

public class tw
implements Comparator {
    final hf z;
    private static final long a = prr.a((long)3979930323427437370L, (long)6111847496923859390L, MethodHandles.lookup().lookupClass()).a(170255106736325L);

    public int compare(Object object, Object object2) {
        long l = a ^ 0x64CA52C4E23FL;
        long l2 = l ^ 0x5CDA0BB45FB0L;
        Object[] objectArray = new Object[3];
        objectArray[2] = (Map.Entry)object2;
        objectArray[1] = (Map.Entry)object;
        objectArray[0] = l2;
        return (int)m44.a("s", (Object)this, (Object)objectArray, (long)-4817349133728117680L, (long)l);
    }

    tw(hf hf2) {
        this.z = hf2;
    }

    public int W(Object[] objectArray) {
        int n;
        block4: {
            int n2;
            block5: {
                long l = (Long)objectArray[0];
                Map.Entry entry = (Map.Entry)objectArray[1];
                Map.Entry entry2 = (Map.Entry)objectArray[2];
                long l2 = (l = a ^ l) ^ 0x3F23FD6406A1L;
                Map.Entry entry3 = entry;
                Map.Entry entry4 = entry2;
                CallSite callSite = m44.a("h", (long)-5295912137817401651L, (long)l);
                n2 = ((String)entry3.getValue()).compareTo((String)entry4.getValue());
                try {
                    try {
                        n = n2;
                        if (callSite != null) break block4;
                        if (n != 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-6339311727314379991L, (long)l);
                    }
                    return (int)m44.a("w", (Object)((_f)entry3.getKey()), (Object)((_v)entry4.getKey()), (long)l2, (long)-6236934961729432633L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-6339311727314379991L, (long)l);
                }
            }
            n = n2;
        }
        return n;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
