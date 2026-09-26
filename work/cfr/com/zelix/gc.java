/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class gc {
    private Object r;
    private final Object P;
    private static final long a = prr.a(6807531483848465494L, 5207453293960608768L, MethodHandles.lookup().lookupClass()).a(109285833689070L);

    public Object I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("q", (Object)this, (long)1196625706294844297L, (long)l10);
    }

    public Object L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("w", (Object)this, (long)-9117140692179929728L, (long)l10);
    }

    public boolean equals(Object object) {
        boolean bl2;
        block24: {
            block25: {
                boolean bl3;
                block33: {
                    block27: {
                        block30: {
                            CallSite callSite;
                            gc gc2;
                            CallSite callSite2;
                            long l10;
                            block32: {
                                block31: {
                                    block28: {
                                        block26: {
                                            l10 = a ^ 0x574773C07D6BL;
                                            callSite2 = m44.a("j", (long)-6310530784212175270L, (long)l10);
                                            try {
                                                bl2 = object instanceof gc;
                                                if (callSite2 != null) break block24;
                                                if (!bl2) break block25;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                                            }
                                            gc2 = (gc)object;
                                            try {
                                                try {
                                                    callSite = m44.a("t", (Object)this, (long)-5573756190909154892L, (long)l10);
                                                    if (callSite2 != null) break block26;
                                                    if (!callSite.equals(m44.a("t", (Object)gc2, (long)-5573756190909154892L, (long)l10))) break block27;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                                                }
                                                callSite = m44.a("t", (Object)this, (long)-5336120348272230133L, (long)l10);
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                                            }
                                        }
                                        try {
                                            block29: {
                                                try {
                                                    try {
                                                        try {
                                                            if (callSite2 != null) break block28;
                                                            if (callSite != null) break block29;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                                                        }
                                                        callSite = m44.a("t", (Object)gc2, (long)-5336120348272230133L, (long)l10);
                                                        if (callSite2 != null) break block28;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                                                    }
                                                    if (callSite == null) break block30;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                                                }
                                            }
                                            callSite = m44.a("t", (Object)this, (long)-5336120348272230133L, (long)l10);
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite2 != null) break block31;
                                            if (callSite == null) break block27;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                                        }
                                        callSite = m44.a("t", (Object)gc2, (long)-5336120348272230133L, (long)l10);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite2 != null) break block32;
                                        if (callSite == null) break block27;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                                    }
                                    callSite = m44.a("t", (Object)this, (long)-5336120348272230133L, (long)l10);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                                }
                            }
                            try {
                                bl3 = callSite.equals(m44.a("t", (Object)gc2, (long)-5336120348272230133L, (long)l10));
                                if (callSite2 != null) break block33;
                                if (!bl3) break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("j", (Object)illegalArgumentException, (long)-5229185640295439173L, (long)l10);
                            }
                        }
                        bl3 = true;
                        break block33;
                    }
                    bl3 = false;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public gc(long l10, Object object) {
        block4: {
            block5: {
                l10 = a ^ l10;
                CallSite callSite = m44.a("o", (long)-5705744159342481689L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("o", (Object)illegalArgumentException, (long)-5777184729297978362L, (long)l10);
                    }
                    throw new IllegalArgumentException(this.getClass().getName());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)-5777184729297978362L, (long)l10);
                }
            }
            this.P = object;
        }
    }

    public int hashCode() {
        CallSite callSite;
        long l10;
        block4: {
            block5: {
                l10 = a ^ 0x67E1BE730A35L;
                CallSite callSite2 = m44.a("l", (long)-2363742151295188732L, (long)l10);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)-4419022484998490539L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-4598170841494154267L, (long)l10);
                    }
                    return m44.a("r", (Object)this, (long)-4181527518965477654L, (long)l10).hashCode();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)-4598170841494154267L, (long)l10);
                }
            }
            callSite = m44.a("r", (Object)this, (long)-4181527518965477654L, (long)l10);
        }
        return callSite.hashCode() ^ m44.a("r", (Object)this, (long)-4419022484998490539L, (long)l10).hashCode();
    }

    public Object y(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        CallSite callSite = m44.a("q", (Object)this, (long)139337604548965654L, (long)l10);
        m44.a("s", (Object)this, (Object)object, (long)139337604548965654L, (long)l10);
        return callSite;
    }

    public gc(Object object, Object object2, long l10) {
        block4: {
            block5: {
                l10 = a ^ l10;
                CallSite callSite = m44.a("i", (long)3676992126652853553L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("i", (Object)illegalArgumentException, (long)3171943890560057296L, (long)l10);
                    }
                    throw new IllegalArgumentException(this.getClass().getName());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)3171943890560057296L, (long)l10);
                }
            }
            this.P = object;
            m44.a("u", (Object)this, (Object)object2, (long)3357850943823583840L, (long)l10);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

