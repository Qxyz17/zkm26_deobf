/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class zy
implements Serializable {
    public static final int U = 2;
    private final int c;
    public static final int w = 0;
    public static final int D = 1;
    private static final zy[] b;
    public static final zy a;
    public static final zy d;
    public static final zy e;
    private static final long f;

    public static zy a(int n) {
        long l = f ^ 0x27D85870868BL;
        if (n < 0 || n >= ((CallSite)m44.a("m", (long)-5959019651632966434L, (long)l)).length) {
            throw new IllegalArgumentException();
        }
        return m44.a("m", (long)-5959019651632966434L, (long)l)[n];
    }

    public int a() {
        long l = f ^ 0x68EF45CEBA3L;
        return (int)m44.a("w", (Object)this, (long)-4359863553537331792L, (long)l);
    }

    private zy(int n) {
        this.c = n;
    }

    public String toString() {
        long l = f ^ 0x3EDC9EB78D06L;
        switch (m44.a("r", (Object)this, (long)-6495422798644163819L, (long)l)) {
            case 0: {
                return "ALWAYS";
            }
            case 1: {
                return "NEVER";
            }
            case 2: {
                return "IF_IN_ARCHIVE";
            }
        }
        return "ERROR";
    }

    static {
        f = prr.a((long)7148388705756860886L, (long)-2849508431039311684L, MethodHandles.lookup().lookupClass()).a(25462704815700L);
        long l = f ^ 0x1CDD4ED2541L;
        e = new zy(0);
        a = new zy(1);
        d = new zy(2);
        b = new zy[]{m44.a("o", (long)695808598230818304L, (long)l), m44.a("o", (long)1366200916372602548L, (long)l), m44.a("o", (long)650044023265941116L, (long)l)};
    }
}
