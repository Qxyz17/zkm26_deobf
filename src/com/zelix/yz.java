/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.tx;
import com.zelix.wa;
import com.zelix.yn;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;

public class yz
extends yn {
    final wa n;
    private static final long a = prr.a((long)-1114815517941988269L, (long)-6973469819797886714L, MethodHandles.lookup().lookupClass()).a(64223309255272L);

    public void a(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x9AA05EF18F8L;
        long l4 = l2 ^ 0L;
        long l5 = l2 ^ 0x4265CC9395ECL;
        long l6 = l2 ^ 0x4D2613F90626L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = string2;
        objectArray2[1] = l4;
        objectArray2[0] = string;
        super.a(objectArray2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = string;
        objectArray3[0] = l3;
        String string3 = string + (String)((Object)m44.a("w", (Object)((Object)this), (Object)objectArray3, (long)-7333679493321471109L, (long)l)) + string2;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = m44.a("v", (Object)((Object)this), (long)-9157175947961111348L, (long)l);
        objectArray4[0] = l5;
        ((PrintWriter)((Object)m44.a("h", (Object)objectArray4, (long)-9217138610865163991L, (long)l))).println(string3);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = m44.a("v", (Object)((Object)this), (long)-9157175947961111348L, (long)l);
        objectArray5[0] = l5;
        m44.a("w", (Object)m44.a("h", (Object)objectArray5, (long)-9217138610865163991L, (long)l), (long)-8868318443501860864L, (long)l);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l6;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)-9157175947961111348L, (long)l), (Object)objectArray6, (long)-7018718978186408231L, (long)l);
    }

    public void I(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        String string3 = (String)objectArray[3];
        long l2 = l;
        long l3 = l2 ^ 0x505744F5B533L;
        long l4 = l2 ^ 0L;
        long l5 = l2 ^ 0x1B988D893827L;
        long l6 = l2 ^ 0x14DB52E3ABEDL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = string3;
        objectArray2[2] = string2;
        objectArray2[1] = l4;
        objectArray2[0] = string;
        super.I(objectArray2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = string;
        objectArray3[0] = l3;
        String string4 = string + (String)((Object)m44.a("t", (Object)((Object)this), (Object)objectArray3, (long)4031514029865002672L, (long)l)) + string2;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = m44.a("u", (Object)((Object)this), (long)3251727576994693383L, (long)l);
        objectArray4[0] = l5;
        ((PrintWriter)((Object)m44.a("k", (Object)objectArray4, (long)3304934839140130018L, (long)l))).println(string4);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = m44.a("u", (Object)((Object)this), (long)3251727576994693383L, (long)l);
        objectArray5[0] = l5;
        ((PrintWriter)((Object)m44.a("k", (Object)objectArray5, (long)3304934839140130018L, (long)l))).println(string3);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = m44.a("u", (Object)((Object)this), (long)3251727576994693383L, (long)l);
        objectArray6[0] = l5;
        m44.a("t", (Object)m44.a("k", (Object)objectArray6, (long)3304934839140130018L, (long)l), (long)2965126269858768331L, (long)l);
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l6;
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)3251727576994693383L, (long)l), (Object)objectArray7, (long)3698539120209077010L, (long)l);
    }

    yz(long l, wa wa2, tx tx2, lqu lqu2) {
        long l2 = (l = a ^ l) ^ 0x38E3056CC750L;
        this.n = wa2;
        super(tx2, l2, lqu2);
    }
}
