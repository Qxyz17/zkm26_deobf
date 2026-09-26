/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class yx
implements Comparator {
    private static final yx q;
    private static final long a;

    static {
        a = prr.a((long)-4591359759051157355L, (long)6107190662573945544L, MethodHandles.lookup().lookupClass()).a(180607616177888L);
        q = new yx();
    }

    public int compare(Object object, Object object2) {
        long l = a ^ 0x3552B959D829L;
        long l2 = l ^ 0x430CA27A6F4CL;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = (File)object2;
        objectArray[0] = (File)object;
        return (int)m44.a("w", (Object)this, (Object)objectArray, (long)8025509689451092768L, (long)l);
    }

    public static yx P(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("i", (long)2338154957452724247L, (long)l);
    }

    public int L(Object[] objectArray) {
        Object object;
        block16: {
            String string;
            String string2;
            block17: {
                CallSite callSite;
                long l;
                block12: {
                    File file;
                    block13: {
                        Object object2;
                        block14: {
                            block15: {
                                File file2 = (File)objectArray[0];
                                file = (File)objectArray[1];
                                l = (Long)objectArray[2];
                                l = a ^ l;
                                string2 = ((String)((Object)m44.a("u", (Object)file2, (long)-6750174420806283638L, (long)l))).toLowerCase();
                                callSite = m44.a("j", (long)-6714043694149848830L, (long)l);
                                string = ((String)((Object)m44.a("u", (Object)file, (long)-6750174420806283638L, (long)l))).toLowerCase();
                                try {
                                    try {
                                        try {
                                            try {
                                                object = m44.a("u", (Object)file2, (long)-5178489346945420456L, (long)l);
                                                if (callSite == false) break block12;
                                                if (object == false) break block13;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("j", (Object)((Object)n92), (long)-6350153367208830926L, (long)l);
                                            }
                                            object2 = m44.a("u", (Object)file, (long)-5178489346945420456L, (long)l);
                                            if (callSite == false) break block14;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("j", (Object)((Object)n93), (long)-6350153367208830926L, (long)l);
                                        }
                                        if (object2 != false) break block15;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("j", (Object)((Object)n94), (long)-6350153367208830926L, (long)l);
                                    }
                                    return -1;
                                }
                                catch (n9 n95) {
                                    throw m44.a("j", (Object)((Object)n95), (long)-6350153367208830926L, (long)l);
                                }
                            }
                            object2 = string2.compareTo(string);
                        }
                        return (int)object2;
                    }
                    object = m44.a("u", (Object)file, (long)-5178489346945420456L, (long)l);
                }
                try {
                    try {
                        if (callSite == false) break block16;
                        if (object == false) break block17;
                    }
                    catch (n9 n96) {
                        throw m44.a("j", (Object)((Object)n96), (long)-6350153367208830926L, (long)l);
                    }
                    return 1;
                }
                catch (n9 n97) {
                    throw m44.a("j", (Object)((Object)n97), (long)-6350153367208830926L, (long)l);
                }
            }
            object = string2.compareTo(string);
        }
        return (int)object;
    }

    private yx() {
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
