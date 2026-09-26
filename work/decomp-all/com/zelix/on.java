/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class on {
    static final int[] W;

    static {
        long l = prr.a((long)5290720608426872197L, (long)8971657168642023612L, MethodHandles.lookup().lookupClass()).a(25523592898073L) ^ 0x245E4DFDE190L;
        long l2 = l ^ 0x6C16FCC744B5L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        W = new int[((CallSite)m44.a("k", (Object)objectArray, (long)9217222611609971744L, (long)l)).length];
        try {
            m44.a("o", (long)8788277492576583455L, (long)l)[m44.a("o", (long)9167335534095037441L, (long)l).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)8788277492576583455L, (long)l)[m44.a("o", (long)8904445630135984706L, (long)l).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)8788277492576583455L, (long)l)[m44.a("o", (long)7476743423881138051L, (long)l).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)8788277492576583455L, (long)l)[m44.a("o", (long)6985677440900655555L, (long)l).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
