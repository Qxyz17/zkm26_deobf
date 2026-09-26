/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.ur;
import java.lang.invoke.MethodHandles;

public class un
extends ur {
    private static int[] L;

    public un(String string, Throwable throwable) {
        super(string, throwable);
    }

    public un(String string) {
        super(string);
    }

    public static int[] A() {
        return L;
    }

    public static void i(int[] nArray) {
        L = nArray;
    }

    static {
        long l = prr.a((long)8876947252709503494L, (long)2235257048698401138L, MethodHandles.lookup().lookupClass()).a(107299419761771L) ^ 0x6A965817EA51L;
        if (m44.a("o", (long)929470041729428650L, (long)l) != null) {
            m44.a("o", (Object)new int[3], (long)1543286897017834907L, (long)l);
        }
    }
}
