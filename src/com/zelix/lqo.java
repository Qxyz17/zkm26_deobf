/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.File;
import java.io.FileFilter;
import java.lang.invoke.MethodHandles;

public abstract class lqo
implements FileFilter {
    private static int[] x;
    private static final long a;

    public String toString() {
        long l = a ^ 0x383D15D8B027L;
        long l2 = l ^ 0x17B311644EA7L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return m44.a("r", (Object)this, (Object)objectArray, (long)5102452692434916001L, (long)l);
    }

    public static void v(int[] nArray) {
        x = nArray;
    }

    @Override
    public abstract boolean accept(File var1);

    public static int[] X() {
        return x;
    }

    public abstract String x(Object[] var1);

    static {
        a = prr.a((long)6191554193957508212L, (long)-10091544696326435L, MethodHandles.lookup().lookupClass()).a(52065974171800L);
        long l = a ^ 0x71D90B415C27L;
        if (m44.a("m", (long)-5457152425541357373L, (long)l) != null) {
            m44.a("m", (Object)new int[1], (long)-5485378169458559305L, (long)l);
        }
    }
}
