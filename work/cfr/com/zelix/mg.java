/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class mg {
    static final int[] l;

    static {
        long l10 = prr.a(-677241951977061422L, 7388488185426950496L, MethodHandles.lookup().lookupClass()).a(252579466934292L) ^ 0x6709FEE3FF87L;
        long l11 = l10 ^ 0x5CB6D5D49DD4L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        l = new int[((CallSite)m44.a("k", (Object)objectArray, (long)-6373073481025629199L, (long)l10)).length];
        try {
            m44.a("o", (long)-5068018256930242992L, (long)l10)[n.f.ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)-5068018256930242992L, (long)l10)[n.R.ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)-5068018256930242992L, (long)l10)[n.J.ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

