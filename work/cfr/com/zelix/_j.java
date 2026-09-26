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
    private static final long a = prr.a(1092458764767343126L, -3318864388597292493L, MethodHandles.lookup().lookupClass()).a(77355588523831L);

    public String m(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l10;
            block4: {
                l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite2 = m44.a("o", (long)-6940057678551184257L, (long)l10);
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)-7417102617718758388L, (long)l10);
                        if (callSite2 == false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-8902568105430401078L, (long)l10);
                    }
                    callSite = m44.a("q", (Object)this, (long)-7417102617718758388L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-8902568105430401078L, (long)l10);
                }
            }
            return m44.a("p", (Object)callSite, (long)-7486023735363607193L, (long)l10);
        }
        return null;
    }

    public ZipOutputStream r(Object[] objectArray) {
        CallSite callSite;
        block4: {
            long l10;
            block5: {
                l10 = (Long)objectArray[0];
                long l11 = (l10 = a ^ l10) ^ 0x41517DE977C3L;
                CallSite callSite2 = m44.a("o", (long)5503341310256537487L, (long)l10);
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)6088257957084162069L, (long)l10);
                        if (callSite2 == false) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)6306030094837607482L, (long)l10);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    m44.a("s", (Object)this, (File)((Object)m44.a("o", (Object)objectArray2, (long)5547014190269230917L, (long)l10)), (long)5395617997671774204L, (long)l10);
                    m44.a("s", (Object)this, (ZipOutputStream)new ZipOutputStream(new BufferedOutputStream(new FileOutputStream((File)((Object)m44.a("q", (Object)this, (long)5395617997671774204L, (long)l10))))), (long)6088257957084162069L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)6306030094837607482L, (long)l10);
                }
            }
            callSite = m44.a("q", (Object)this, (long)6088257957084162069L, (long)l10);
        }
        return callSite;
    }

    public void T(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l10;
            block4: {
                l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite2 = m44.a("h", (long)-3852711672728565072L, (long)l10);
                try {
                    try {
                        callSite = m44.a("v", (Object)this, (long)-3059420355788215838L, (long)l10);
                        if (callSite2 != false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-2993605354960359987L, (long)l10);
                    }
                    callSite = m44.a("v", (Object)this, (long)-3059420355788215838L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-2993605354960359987L, (long)l10);
                }
            }
            m44.a("w", (Object)callSite, (long)-3677276641087930674L, (long)l10);
        }
    }

    public boolean s(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("w", (Object)this, (long)-5018274130947635661L, (long)l10) == null;
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)n92, (long)-5069416097563803108L, (long)l10);
        }
        return bl2;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

