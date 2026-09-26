/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.loi;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lo5
extends loi
implements Comparable {
    private static final long a = prr.a((long)-7707638077073170489L, (long)-8037748992416686011L, MethodHandles.lookup().lookupClass()).a(235482821385736L);

    public int compareTo(Object object) {
        long l = a ^ 0xE5FC2712823L;
        return (int)m44.a("s", (Object)this, (Object)new Object[]{(lo5)object}, (long)-5403859635431471680L, (long)l);
    }

    lo5(String string, String string2, int n) {
        super(string, string2, n);
    }

    public final int Z(Object[] objectArray) {
        lo5 lo52 = (lo5)objectArray[0];
        return this.w.compareTo(lo52.w);
    }

    public int hashCode() {
        String string;
        block4: {
            block5: {
                long l = a ^ 0x4609CD73DD27L;
                CallSite callSite = m44.a("h", (long)4937158219956411594L, (long)l);
                try {
                    try {
                        string = this.D;
                        if (callSite != null) break block4;
                        if (string != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)4784908336781272489L, (long)l);
                    }
                    return this.w.hashCode();
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)4784908336781272489L, (long)l);
                }
            }
            string = this.w;
        }
        return string.hashCode() ^ this.D.hashCode();
    }

    public boolean equals(Object object) {
        boolean bl;
        block24: {
            block25: {
                boolean bl2;
                block33: {
                    block27: {
                        block30: {
                            String string;
                            lo5 lo52;
                            CallSite callSite;
                            long l;
                            block32: {
                                block31: {
                                    block28: {
                                        block26: {
                                            l = a ^ 0x59A60D0D82CBL;
                                            callSite = m44.a("l", (long)1974917024263471910L, (long)l);
                                            try {
                                                bl = object instanceof lo5;
                                                if (callSite != null) break block24;
                                                if (!bl) break block25;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("l", (Object)((Object)n92), (long)2128926537974118981L, (long)l);
                                            }
                                            lo52 = (lo5)object;
                                            try {
                                                try {
                                                    string = this.w;
                                                    if (callSite != null) break block26;
                                                    if (!string.equals(lo52.w)) break block27;
                                                }
                                                catch (n9 n93) {
                                                    throw m44.a("l", (Object)((Object)n93), (long)2128926537974118981L, (long)l);
                                                }
                                                string = this.D;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("l", (Object)((Object)n94), (long)2128926537974118981L, (long)l);
                                            }
                                        }
                                        try {
                                            block29: {
                                                try {
                                                    try {
                                                        try {
                                                            if (callSite != null) break block28;
                                                            if (string != null) break block29;
                                                        }
                                                        catch (n9 n95) {
                                                            throw m44.a("l", (Object)((Object)n95), (long)2128926537974118981L, (long)l);
                                                        }
                                                        string = lo52.D;
                                                        if (callSite != null) break block28;
                                                    }
                                                    catch (n9 n96) {
                                                        throw m44.a("l", (Object)((Object)n96), (long)2128926537974118981L, (long)l);
                                                    }
                                                    if (string == null) break block30;
                                                }
                                                catch (n9 n97) {
                                                    throw m44.a("l", (Object)((Object)n97), (long)2128926537974118981L, (long)l);
                                                }
                                            }
                                            string = this.D;
                                        }
                                        catch (n9 n98) {
                                            throw m44.a("l", (Object)((Object)n98), (long)2128926537974118981L, (long)l);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite != null) break block31;
                                            if (string == null) break block27;
                                        }
                                        catch (n9 n99) {
                                            throw m44.a("l", (Object)((Object)n99), (long)2128926537974118981L, (long)l);
                                        }
                                        string = lo52.D;
                                    }
                                    catch (n9 n910) {
                                        throw m44.a("l", (Object)((Object)n910), (long)2128926537974118981L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite != null) break block32;
                                        if (string == null) break block27;
                                    }
                                    catch (n9 n911) {
                                        throw m44.a("l", (Object)((Object)n911), (long)2128926537974118981L, (long)l);
                                    }
                                    string = this.D;
                                }
                                catch (n9 n912) {
                                    throw m44.a("l", (Object)((Object)n912), (long)2128926537974118981L, (long)l);
                                }
                            }
                            try {
                                bl2 = string.equals(lo52.D);
                                if (callSite != null) break block33;
                                if (!bl2) break block27;
                            }
                            catch (n9 n913) {
                                throw m44.a("l", (Object)((Object)n913), (long)2128926537974118981L, (long)l);
                            }
                        }
                        bl2 = true;
                        break block33;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
