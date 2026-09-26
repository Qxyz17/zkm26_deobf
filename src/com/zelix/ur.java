/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;

public class ur
extends Exception {
    private static int c;

    public ur(String string) {
        super(string);
    }

    public static int r() {
        return c;
    }

    public static int l() {
        int n = ur.r();
        if (n == 0) {
            return 44;
        }
        return 0;
    }

    public ur(String string, Throwable throwable) {
        super(string, throwable);
    }

    public static void T(int n) {
        c = n;
    }

    static {
        long l = prr.a((long)-4923241417067820504L, (long)-381505283947554433L, MethodHandles.lookup().lookupClass()).a(84410666060441L) ^ 0x9C420535143L;
        if (m44.a("j", (long)-2457525409959589745L, (long)l) != false) {
            m44.a("j", (int)19, (long)-4412909525959459149L, (long)l);
        }
    }
}
