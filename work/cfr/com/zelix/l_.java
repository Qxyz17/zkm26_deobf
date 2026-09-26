/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jp;
import com.zelix.lb;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zn;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class l_
extends lb {
    private String L;
    private String i;
    private String n;
    private static final long a = prr.a(1293464036200517229L, -9131823637296237591L, MethodHandles.lookup().lookupClass()).a(146081670940499L);

    public void E(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        String string = (String)objectArray[1];
        int n11 = (Integer)objectArray[2];
        int n12 = (Integer)objectArray[3];
        long l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ a;
        m44.a("t", (Object)this, (String)string, (long)-2688288225831751911L, (long)l10);
    }

    public void d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        m44.a("v", (Object)this, (String)string, (long)9085320358914187509L, (long)l10);
    }

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        block14: {
            zn zn3;
            long l11;
            long l12;
            block15: {
                block16: {
                    Object object;
                    CallSite callSite;
                    long l13;
                    block12: {
                        long l14;
                        block13: {
                            long l15 = l10;
                            l13 = l15 ^ 0L;
                            l12 = l15 ^ 0x59A5FD2F74E8L;
                            l11 = l15 ^ 0x2097E33A5618L;
                            l14 = l15 ^ 0x2BEAF1B40FB1L;
                            callSite = m44.a("h", (long)-3779571992638565438L, (long)l10);
                            try {
                                object = m44.a("w", (Object)lkc2, (Object)new Object[0], (long)-3798897849792170735L, (long)l10);
                                if (callSite != null) break block12;
                                if (object != false) break block13;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)n92, (long)-3900834717698874270L, (long)l10);
                            }
                            return;
                        }
                        object = this.y(l14);
                    }
                    CallSite callSite2 = object;
                    int n10 = 0;
                    block8: while (n10 < callSite2) {
                        zn zn4 = this.g(n10);
                        try {
                            zn4.F(this, lkc2, l13);
                            ++n10;
                            do {
                                CallSite callSite3 = callSite;
                                if (l10 >= 0L) {
                                    if (callSite3 != null) break block14;
                                    callSite3 = callSite;
                                }
                                if (callSite3 == null) continue block8;
                            } while (l10 <= 0L);
                            break;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)-3900834717698874270L, (long)l10);
                        }
                    }
                    try {
                        try {
                            if (l10 <= 0L) break block14;
                            zn3 = this;
                            if (callSite != null) break block15;
                            if (m44.a("v", (Object)zn3, (long)-3497183073809673833L, (long)l10) != null) break block16;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)n94, (long)-3900834717698874270L, (long)l10);
                        }
                        m44.a("t", (Object)this, (String)((Object)m44.a("v", (Object)this, (long)-3167981400114208351L, (long)l10)), (long)-3497183073809673833L, (long)l10);
                    }
                    catch (n9 n95) {
                        throw m44.a("h", (Object)n95, (long)-3900834717698874270L, (long)l10);
                    }
                }
                zn3 = zn2;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l12;
            Object[] objectArray2 = new Object[5];
            objectArray2[4] = (int)m44.a("w", (Object)this, (Object)objectArray, (long)-3038110640191701118L, (long)l10);
            objectArray2[3] = m44.a("v", (Object)this, (long)-3394829011051703520L, (long)l10);
            objectArray2[2] = m44.a("v", (Object)this, (long)-3167981400114208351L, (long)l10);
            objectArray2[1] = l11;
            objectArray2[0] = m44.a("v", (Object)this, (long)-3497183073809673833L, (long)l10);
            m44.a("w", (Object)((jp)zn3), (Object)objectArray2, (long)-3470890373614696602L, (long)l10);
        }
    }

    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        m44.a("w", (Object)this, (String)string, (long)-3294260412108861045L, (long)l10);
    }

    public l_(int n10) {
        super(n10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

