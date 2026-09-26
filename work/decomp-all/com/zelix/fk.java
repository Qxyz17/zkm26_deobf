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
    private static final long a = prr.a((long)6735328149891466178L, (long)5560013847867290986L, MethodHandles.lookup().lookupClass()).a(7305677530018L);

    public fk(long l) {
        l = a ^ l;
        m44.a("v", (Object)this, new Stack(), (long)378153854399028271L, (long)l);
    }

    public int k(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return ((Vector)((Object)m44.a("t", (Object)this, (long)4843375211600632359L, (long)l))).size();
    }

    public Object w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        CallSite callSite = m44.a("w", (Object)m44.a("v", (Object)this, (long)-2802031973633834995L, (long)l), (long)-4036463864895690012L, (long)l);
        return callSite;
    }

    public int S(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (int)m44.a("w", (Object)m44.a("v", (Object)this, (long)4802264482676890549L, (long)l), (Object)object, (long)4781883975177168861L, (long)l);
    }

    public Object I(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        l = a ^ l;
        m44.a("s", (Object)m44.a("r", (Object)this, (long)-618909079849013639L, (long)l), (Object)object, (long)-1625213003257662155L, (long)l);
        return object;
    }

    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)2884901044683616537L, (long)l), (long)3137053504362729859L, (long)l);
    }

    public Object i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("w", (Object)m44.a("v", (Object)this, (long)-6839454139680376827L, (long)l), (long)-6888756132089462144L, (long)l);
    }

    public Object F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = a ^ l;
        return m44.a("s", (Object)m44.a("r", (Object)this, (long)-2168079633688037127L, (long)l), (int)(((Vector)((Object)m44.a("r", (Object)this, (long)-2168079633688037127L, (long)l))).size() - 1 - n), (long)-1786433540414538464L, (long)l);
    }
}
