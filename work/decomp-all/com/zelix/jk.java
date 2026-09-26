/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jj;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zn;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class jk
extends jj {
    boolean q;
    String d;
    String g;
    private static final long a = prr.a((long)3436365702778783361L, (long)-4853678023044658648L, MethodHandles.lookup().lookupClass()).a(157080784425017L);

    public jk(int n) {
        super(n);
    }

    protected void O(Object[] objectArray) {
        zn zn2 = (zn)objectArray[0];
        lkc lkc2 = (lkc)objectArray[1];
        int n = (Integer)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l ^ 0x2D8E3D3ABC09L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("q", (Object)lkc2, (Object)objectArray2, (long)4997027385602464745L, (long)l);
    }

    void l(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        m44.a("w", (Object)((Object)this), (boolean)true, (long)-7289917496168516899L, (long)l);
    }

    void P(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        m44.a("p", (Object)((Object)this), (String)string, (long)7987048398672371793L, (long)l);
    }

    void R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        m44.a("s", (Object)((Object)this), (String)string, (long)-475172129452526975L, (long)l);
    }

    protected void k(Object[] objectArray) {
        jk jk2;
        long l;
        long l2;
        block10: {
            block11: {
                jk jk3;
                block12: {
                    l2 = (Long)objectArray[0];
                    lkc lkc2 = (lkc)objectArray[1];
                    l = l2 ^ 0xB12FC02AAL;
                    CallSite callSite = m44.a("j", (long)7374193648435527192L, (long)l2);
                    try {
                        block13: {
                            try {
                                try {
                                    try {
                                        try {
                                            jk2 = this;
                                            if (callSite != null) break block10;
                                            if (m44.a("t", (Object)((Object)jk2), (long)7469974054999845964L, (long)l2) != null) break block11;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("j", (Object)((Object)n92), (long)7359960397682878586L, (long)l2);
                                        }
                                        jk3 = this;
                                        if (callSite != null) break block12;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("j", (Object)((Object)n93), (long)7359960397682878586L, (long)l2);
                                    }
                                    if (l2 < 0L) break block12;
                                    if (m44.a("t", (Object)((Object)jk3), (long)8825979109953213044L, (long)l2) == false) break block13;
                                }
                                catch (n9 n94) {
                                    throw m44.a("j", (Object)((Object)n94), (long)7359960397682878586L, (long)l2);
                                }
                                m44.a("v", (Object)((Object)this), (String)((Object)m44.a("t", (Object)((Object)this), (long)9023443965843420095L, (long)l2)), (long)7469974054999845964L, (long)l2);
                                if (callSite == null) break block11;
                            }
                            catch (n9 n95) {
                                throw m44.a("j", (Object)((Object)n95), (long)7359960397682878586L, (long)l2);
                            }
                        }
                        jk3 = this;
                    }
                    catch (n9 n96) {
                        throw m44.a("j", (Object)((Object)n96), (long)7359960397682878586L, (long)l2);
                    }
                }
                m44.a("v", (Object)((Object)jk3), (String)"", (long)7469974054999845964L, (long)l2);
            }
            jk2 = this;
        }
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l;
        objectArray2[1] = m44.a("t", (Object)((Object)this), (long)9023443965843420095L, (long)l2);
        objectArray2[0] = m44.a("t", (Object)((Object)this), (long)7469974054999845964L, (long)l2);
        m44.a("u", (Object)m44.a("t", (Object)((Object)jk2), (long)8871810686016648836L, (long)l2), (Object)objectArray2, (long)6936567383751139164L, (long)l2);
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}
