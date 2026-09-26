/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.invoke.MethodHandles;

public class oe
implements FilenameFilter {
    private static final long a = prr.a((long)3015594763840425676L, (long)-56210299164361846L, MethodHandles.lookup().lookupClass()).a(93613968449489L);

    @Override
    public boolean accept(File file, String string) {
        long l = a ^ 0x5B16885C5EBBL;
        return (boolean)m44.a("w", (Object)new File(file, string), (long)3310147746748819082L, (long)l);
    }
}
