/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e_;
import com.zelix.lqu;
import com.zelix.prr;
import com.zelix.sp;
import com.zelix.w7;
import com.zelix.wa;
import com.zelix.wc;
import java.io.File;
import java.lang.invoke.MethodHandles;

public class wj
extends w7 {
    private static final long db = prr.a((long)1052806844619235864L, (long)-914130786668685782L, MethodHandles.lookup().lookupClass()).a(231564507845965L);

    wj(String string, String string2, long l, char c, wa wa2, sp sp2, wc wc2, lqu lqu2, e_ e_2) {
        long l2 = (l << 16 | (long)c << 48 >>> 48) ^ db;
        long l3 = l2 ^ 0x39789C753730L;
        super(string, l3, string2, wa2, sp2, wc2, lqu2, e_2);
    }

    protected boolean R(Object[] objectArray) {
        String string = (String)objectArray[0];
        File file = (File)objectArray[1];
        long l = (Long)objectArray[2];
        return true;
    }

    protected boolean o(Object[] objectArray) {
        String string = (String)objectArray[0];
        File file = (File)objectArray[1];
        long l = (Long)objectArray[2];
        return true;
    }
}
