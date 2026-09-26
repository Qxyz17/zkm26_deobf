/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Stack;
import java.util.Vector;

public class fk {
    private Stack F;
    private static final long a = prr.a(6735328149891466178L, 5560013847867290986L, MethodHandles.lookup().lookupClass()).a(7305677530018L);

    public fk(long l10) {
        l10 = a ^ l10;
        m44.a("v", (Object)this, new Stack(), (long)378153854399028271L, (long)l10);
    }

    public int k(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return ((Vector)((Object)m44.a("t", (Object)this, (long)4843375211600632359L, (long)l10))).size();
    }

    public Object w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        CallSite callSite = m44.a("w", (Object)m44.a("v", (Object)this, (long)-2802031973633834995L, (long)l10), (long)-4036463864895690012L, (long)l10);
        return callSite;
    }

    public int S(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return (int)m44.a("w", (Object)m44.a("v", (Object)this, (long)4802264482676890549L, (long)l10), (Object)object, (long)4781883975177168861L, (long)l10);
    }

    public Object I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        l10 = a ^ l10;
        m44.a("s", (Object)m44.a("r", (Object)this, (long)-618909079849013639L, (long)l10), (Object)object, (long)-1625213003257662155L, (long)l10);
        return object;
    }

    public boolean a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)2884901044683616537L, (long)l10), (long)3137053504362729859L, (long)l10);
    }

    public Object i(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("w", (Object)m44.a("v", (Object)this, (long)-6839454139680376827L, (long)l10), (long)-6888756132089462144L, (long)l10);
    }

    public Object F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        l10 = a ^ l10;
        return m44.a("s", (Object)m44.a("r", (Object)this, (long)-2168079633688037127L, (long)l10), (int)(((Vector)((Object)m44.a("r", (Object)this, (long)-2168079633688037127L, (long)l10))).size() - 1 - n10), (long)-1786433540414538464L, (long)l10);
    }
}

