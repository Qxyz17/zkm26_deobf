/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class um {
    static final int[] T;

    static {
        long l = prr.a((long)4615218991831455590L, (long)5298786655854301232L, MethodHandles.lookup().lookupClass()).a(163724120153886L) ^ 0x1929ADBC98BEL;
        long l2 = l ^ 0xA1AD7A498DCL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        T = new int[((CallSite)m44.a("o", (Object)objectArray, (long)-8347597434071050286L, (long)l)).length];
        try {
            m44.a("k", (long)-8061269653806561973L, (long)l)[m44.a("k", (long)-8496896345978738331L, (long)l).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("k", (long)-8061269653806561973L, (long)l)[m44.a("k", (long)-8374942517316957227L, (long)l).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("k", (long)-8061269653806561973L, (long)l)[m44.a("k", (long)-8568448386665396146L, (long)l).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
