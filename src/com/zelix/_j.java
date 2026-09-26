/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.zip.ZipOutputStream;

public class _j {
    File v;
    private ZipOutputStream f;
    private static final long a = prr.a((long)1092458764767343126L, (long)-3318864388597292493L, MethodHandles.lookup().lookupClass()).a(77355588523831L);

    public String m(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l;
            block4: {
                l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite2 = m44.a("o", (long)-6940057678551184257L, (long)l);
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)-7417102617718758388L, (long)l);
                        if (callSite2 == false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-8902568105430401078L, (long)l);
                    }
                    callSite = m44.a("q", (Object)this, (long)-7417102617718758388L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)-8902568105430401078L, (long)l);
                }
            }
            return m44.a("p", (Object)callSite, (long)-7486023735363607193L, (long)l);
        }
        return null;
    }

    public ZipOutputStream r(Object[] objectArray) {
        CallSite callSite;
        block4: {
            long l;
            block5: {
                l = (Long)objectArray[0];
                long l2 = (l = a ^ l) ^ 0x41517DE977C3L;
                CallSite callSite2 = m44.a("o", (long)5503341310256537487L, (long)l);
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)6088257957084162069L, (long)l);
                        if (callSite2 == false) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)6306030094837607482L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    m44.a("s", (Object)this, (File)((Object)m44.a("o", (Object)objectArray2, (long)5547014190269230917L, (long)l)), (long)5395617997671774204L, (long)l);
                    m44.a("s", (Object)this, (ZipOutputStream)new ZipOutputStream(new BufferedOutputStream(new FileOutputStream((File)((Object)m44.a("q", (Object)this, (long)5395617997671774204L, (long)l))))), (long)6088257957084162069L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)6306030094837607482L, (long)l);
                }
            }
            callSite = m44.a("q", (Object)this, (long)6088257957084162069L, (long)l);
        }
        return callSite;
    }

    public void T(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l;
            block4: {
                l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite2 = m44.a("h", (long)-3852711672728565072L, (long)l);
                try {
                    try {
                        callSite = m44.a("v", (Object)this, (long)-3059420355788215838L, (long)l);
                        if (callSite2 != false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-2993605354960359987L, (long)l);
                    }
                    callSite = m44.a("v", (Object)this, (long)-3059420355788215838L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-2993605354960359987L, (long)l);
                }
            }
            m44.a("w", (Object)callSite, (long)-3677276641087930674L, (long)l);
        }
    }

    public boolean s(Object[] objectArray) {
        boolean bl;
        long l = (Long)objectArray[0];
        l = a ^ l;
        try {
            bl = m44.a("w", (Object)this, (long)-5018274130947635661L, (long)l) == null;
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)((Object)n92), (long)-5069416097563803108L, (long)l);
        }
        return bl;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
