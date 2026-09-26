/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;

public class lm_
extends PrintWriter {
    private HashMap B;
    private static final long a = prr.a((long)-7137005611621630180L, (long)-3439564606574846672L, MethodHandles.lookup().lookupClass()).a(281356853581091L);

    @Override
    public void println(String string) {
        long l = a ^ 0x1EF4A5CD13A0L;
        String string2 = ((HashMap)((Object)m44.a("v", (Object)this, (long)-8344247738041567395L, (long)l))).put(string, string);
        try {
            if (string2 == null) {
                super.println(string);
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)((Object)n92), (long)-8567222259843334310L, (long)l);
        }
    }

    public lm_(long l, OutputStream outputStream) {
        long l2 = (l = a ^ l) ^ 0x79BB05C24614L;
        super(outputStream);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("u", (Object)this, (HashMap)((Object)m44.a("i", (Object)objectArray, (long)-6741611183931865454L, (long)l)), (long)-4827184259473488276L, (long)l);
    }

    public lm_(char c, short s, Writer writer, boolean bl, int n) {
        long l = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n << 32 >>> 32) ^ a;
        long l2 = l ^ 0x7739CE639A9AL;
        super(writer, bl);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("s", (Object)this, (HashMap)((Object)m44.a("o", (Object)objectArray, (long)9151018511186860572L, (long)l)), (long)7029111861901007586L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
