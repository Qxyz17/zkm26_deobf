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
    private static final long a = prr.a((long)1293464036200517229L, (long)-9131823637296237591L, MethodHandles.lookup().lookupClass()).a(146081670940499L);

    public void E(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        String string = (String)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ a;
        m44.a("t", (Object)((Object)this), (String)string, (long)-2688288225831751911L, (long)l);
    }

    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        m44.a("v", (Object)((Object)this), (String)string, (long)9085320358914187509L, (long)l);
    }

    public void F(zn zn2, lkc lkc2, long l) {
        block14: {
            l_ l_2;
            long l2;
            long l3;
            block15: {
                block16: {
                    Object object;
                    CallSite callSite;
                    long l4;
                    block12: {
                        long l5;
                        block13: {
                            long l6 = l;
                            l4 = l6 ^ 0L;
                            l3 = l6 ^ 0x59A5FD2F74E8L;
                            l2 = l6 ^ 0x2097E33A5618L;
                            l5 = l6 ^ 0x2BEAF1B40FB1L;
                            callSite = m44.a("h", (long)-3779571992638565438L, (long)l);
                            try {
                                object = m44.a("w", (Object)lkc2, (Object)new Object[0], (long)-3798897849792170735L, (long)l);
                                if (callSite != null) break block12;
                                if (object != false) break block13;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)-3900834717698874270L, (long)l);
                            }
                            return;
                        }
                        object = this.y(l5);
                    }
                    CallSite callSite2 = object;
                    int n = 0;
                    block8: while (n < callSite2) {
                        zn zn3 = this.g(n);
                        try {
                            zn3.F((zn)this, lkc2, l4);
                            ++n;
                            do {
                                CallSite callSite3 = callSite;
                                if (l >= 0L) {
                                    if (callSite3 != null) break block14;
                                    callSite3 = callSite;
                                }
                                if (callSite3 == null) continue block8;
                            } while (l <= 0L);
                            break;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-3900834717698874270L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (l <= 0L) break block14;
                            l_2 = this;
                            if (callSite != null) break block15;
                            if (m44.a("v", (Object)((Object)l_2), (long)-3497183073809673833L, (long)l) != null) break block16;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)((Object)n94), (long)-3900834717698874270L, (long)l);
                        }
                        m44.a("t", (Object)((Object)this), (String)((Object)m44.a("v", (Object)((Object)this), (long)-3167981400114208351L, (long)l)), (long)-3497183073809673833L, (long)l);
                    }
                    catch (n9 n95) {
                        throw m44.a("h", (Object)((Object)n95), (long)-3900834717698874270L, (long)l);
                    }
                }
                l_2 = zn2;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l3;
            Object[] objectArray2 = new Object[5];
            objectArray2[4] = (int)m44.a("w", (Object)((Object)this), (Object)objectArray, (long)-3038110640191701118L, (long)l);
            objectArray2[3] = m44.a("v", (Object)((Object)this), (long)-3394829011051703520L, (long)l);
            objectArray2[2] = m44.a("v", (Object)((Object)this), (long)-3167981400114208351L, (long)l);
            objectArray2[1] = l2;
            objectArray2[0] = m44.a("v", (Object)((Object)this), (long)-3497183073809673833L, (long)l);
            m44.a("w", (Object)((jp)l_2), (Object)objectArray2, (long)-3470890373614696602L, (long)l);
        }
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        m44.a("w", (Object)((Object)this), (String)string, (long)-3294260412108861045L, (long)l);
    }

    public l_(int n) {
        super(n);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
