/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.yf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class y1
extends yf {
    private lqu B;
    private int E;
    private static final long a = prr.a((long)7739258379296169880L, (long)3018685445444709682L, MethodHandles.lookup().lookupClass()).a(10914299178592L);

    public void a(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l ^ 0x429BFB06F9ABL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = string2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)-9179964963667299919L, (long)l), (Object)objectArray2, (long)-6927239753567844068L, (long)l);
    }

    public void p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l ^ 0x5ED2047C8C6FL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string2;
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5763057635137748689L, (long)l), (Object)objectArray2, (long)5371664568700986371L, (long)l);
    }

    public void T(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l ^ 0x65E9365AE786L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string2;
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)-2372697925083173319L, (long)l), (Object)objectArray2, (long)-2525848655322111559L, (long)l);
    }

    public void f(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x7A2B9E76B657L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = string2;
        m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)-369174520494601269L, (long)l), (Object)objectArray2, (long)-1954654214277944250L, (long)l);
    }

    public y1(long l, lqu lqu2, int n) {
        Object object;
        y1 y12;
        long l2;
        block2: {
            block3: {
                long l3 = l = a ^ l;
                l2 = l3 ^ 0x4098D99A9EB8L;
                long l4 = l3 ^ 0x71935089C0A3L;
                long l5 = l3 ^ 0x8CFF88D3D4EL;
                int n2 = (int)(l5 >>> 48);
                int n3 = (int)(l5 << 16 >>> 48);
                int n4 = (int)(l5 << 32 >>> 32);
                super((short)n2, (short)n3, n4);
                CallSite callSite = m44.a("j", (long)-12678101234974956L, (long)l);
                m44.a("v", (Object)((Object)this), (lqu)lqu2, (long)-1814897233769768965L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    m44.a("v", (Object)((Object)this), (int)n, (long)-2084603396352365620L, (long)l);
                    y12 = this;
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l4;
                    object = m44.a("u", (Object)lqu2, (Object)objectArray, (long)-1830616882984378953L, (long)l);
                    if (callSite2 == false) break block2;
                    if (object != false) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)-2028149748540699412L, (long)l);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = (boolean)object;
        objectArray[0] = l2;
        m44.a("u", (Object)((Object)y12), (Object)objectArray, (long)-1748165461039124961L, (long)l);
    }

    public void K(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l ^ 0x54B72D6A40E0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = string2;
        m44.a("r", (Object)m44.a("s", (Object)((Object)this), (long)889253283910630780L, (long)l), (Object)objectArray2, (long)1326453875433200369L, (long)l);
    }

    public void n(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l = (Long)objectArray[2];
        String string3 = (String)objectArray[3];
        long l2 = l;
        long l3 = l2 ^ 0x3B74BF987889L;
        long l4 = l2 ^ 0x2BFD66C9E3BDL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string2;
        objectArray2[0] = l3;
        String string4 = string2 + (String)((Object)m44.a("v", (Object)((Object)this), (Object)objectArray2, (long)-411873183810540790L, (long)l)) + string3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = string4;
        m44.a("v", (Object)m44.a("w", (Object)((Object)this), (long)-2239691586027695680L, (long)l), (Object)objectArray3, (long)-2167313018347772569L, (long)l);
    }

    public void I(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        String string3 = (String)objectArray[3];
        long l2 = l;
        long l3 = l2 ^ 0x505744F5B533L;
        long l4 = l2 ^ 0x1B66BA1C5460L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string2;
        objectArray2[0] = l3;
        String string4 = string2 + (String)((Object)m44.a("t", (Object)((Object)this), (Object)objectArray2, (long)4031514029865002672L, (long)l)) + string3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = string4;
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)3265513789814905978L, (long)l), (Object)objectArray3, (long)3609311673917465815L, (long)l);
    }

    public void t(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l ^ 0x29F667C08BE6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = string2;
        m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)-8597364724605503077L, (long)l), (Object)objectArray2, (long)-8523297307066348228L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
