/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class v5
implements FilenameFilter {
    private String X;
    private String c;
    private static final long a = prr.a((long)-956847881492818298L, (long)760349839220665679L, MethodHandles.lookup().lookupClass()).a(192951914321182L);

    public v5(String string, long l, String string2) {
        l = a ^ l;
        m44.a("v", (Object)this, (String)string, (long)-6296962793262372028L, (long)l);
        m44.a("v", (Object)this, (String)string2, (long)-5191659713577773252L, (long)l);
    }

    @Override
    public boolean accept(File file, String string) {
        Object object;
        block10: {
            block11: {
                boolean bl;
                block14: {
                    block13: {
                        CallSite callSite;
                        long l;
                        block12: {
                            l = a ^ 0x13DB93C2E93L;
                            File file2 = new File(file, string);
                            callSite = m44.a("n", (long)7279525921152034110L, (long)l);
                            try {
                                try {
                                    try {
                                        try {
                                            object = m44.a("q", (Object)file2, (long)8707153724119167916L, (long)l);
                                            if (callSite != false) break block10;
                                            if (object != false) break block11;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("n", (Object)((Object)n92), (long)7085748470964823705L, (long)l);
                                        }
                                        bl = string.startsWith((String)((Object)m44.a("p", (Object)this, (long)9061516747685461528L, (long)l)));
                                        if (callSite != false) break block12;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("n", (Object)((Object)n93), (long)7085748470964823705L, (long)l);
                                    }
                                    if (!bl) break block13;
                                }
                                catch (n9 n94) {
                                    throw m44.a("n", (Object)((Object)n94), (long)7085748470964823705L, (long)l);
                                }
                                bl = string.endsWith((String)((Object)m44.a("p", (Object)this, (long)7111126861941850720L, (long)l)));
                            }
                            catch (n9 n95) {
                                throw m44.a("n", (Object)((Object)n95), (long)7085748470964823705L, (long)l);
                            }
                        }
                        try {
                            if (callSite != false) break block14;
                            if (!bl) break block13;
                        }
                        catch (n9 n96) {
                            throw m44.a("n", (Object)((Object)n96), (long)7085748470964823705L, (long)l);
                        }
                        bl = true;
                        break block14;
                    }
                    bl = false;
                }
                return bl;
            }
            object = false;
        }
        return (boolean)object;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
