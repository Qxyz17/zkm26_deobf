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
    private static final long a = prr.a(3436365702778783361L, -4853678023044658648L, MethodHandles.lookup().lookupClass()).a(157080784425017L);

    public jk(int n10) {
        super(n10);
    }

    @Override
    protected void O(Object[] objectArray) {
        zn zn2 = (zn)objectArray[0];
        lkc lkc2 = (lkc)objectArray[1];
        int n10 = (Integer)objectArray[2];
        long l10 = (Long)objectArray[3];
        long l11 = l10 ^ 0x2D8E3D3ABC09L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("q", (Object)lkc2, (Object)objectArray2, (long)4997027385602464745L, (long)l10);
    }

    void l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        m44.a("w", (Object)this, (boolean)true, (long)-7289917496168516899L, (long)l10);
    }

    void P(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        m44.a("p", (Object)this, (String)string, (long)7987048398672371793L, (long)l10);
    }

    void R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        m44.a("s", (Object)this, (String)string, (long)-475172129452526975L, (long)l10);
    }

    @Override
    protected void k(Object[] objectArray) {
        jk jk2;
        long l10;
        long l11;
        block10: {
            block11: {
                jk jk3;
                block12: {
                    l11 = (Long)objectArray[0];
                    lkc lkc2 = (lkc)objectArray[1];
                    l10 = l11 ^ 0xB12FC02AAL;
                    CallSite callSite = m44.a("j", (long)7374193648435527192L, (long)l11);
                    try {
                        block13: {
                            try {
                                try {
                                    try {
                                        try {
                                            jk2 = this;
                                            if (callSite != null) break block10;
                                            if (m44.a("t", (Object)jk2, (long)7469974054999845964L, (long)l11) != null) break block11;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("j", (Object)n92, (long)7359960397682878586L, (long)l11);
                                        }
                                        jk3 = this;
                                        if (callSite != null) break block12;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("j", (Object)n93, (long)7359960397682878586L, (long)l11);
                                    }
                                    if (l11 < 0L) break block12;
                                    if (m44.a("t", (Object)jk3, (long)8825979109953213044L, (long)l11) == false) break block13;
                                }
                                catch (n9 n94) {
                                    throw m44.a("j", (Object)n94, (long)7359960397682878586L, (long)l11);
                                }
                                m44.a("v", (Object)this, (String)((Object)m44.a("t", (Object)this, (long)9023443965843420095L, (long)l11)), (long)7469974054999845964L, (long)l11);
                                if (callSite == null) break block11;
                            }
                            catch (n9 n95) {
                                throw m44.a("j", (Object)n95, (long)7359960397682878586L, (long)l11);
                            }
                        }
                        jk3 = this;
                    }
                    catch (n9 n96) {
                        throw m44.a("j", (Object)n96, (long)7359960397682878586L, (long)l11);
                    }
                }
                m44.a("v", (Object)jk3, (String)"", (long)7469974054999845964L, (long)l11);
            }
            jk2 = this;
        }
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l10;
        objectArray2[1] = m44.a("t", (Object)this, (long)9023443965843420095L, (long)l11);
        objectArray2[0] = m44.a("t", (Object)this, (long)7469974054999845964L, (long)l11);
        m44.a("u", (Object)m44.a("t", (Object)jk2, (long)8871810686016648836L, (long)l11), (Object)objectArray2, (long)6936567383751139164L, (long)l11);
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}

