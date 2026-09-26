/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class lw3 {
    private final HashSet g;
    private static final long a = prr.a(-3562994643159259698L, 2650797206224570009L, MethodHandles.lookup().lookupClass()).a(206018957431504L);

    public Object clone() {
        long l10 = a ^ 0x659A49D67273L;
        long l11 = l10 ^ 0x2EE65FB12D97L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = m44.a("u", (Object)this, (long)-5863942570172146816L, (long)l10);
        return new lw3((HashSet)((Object)m44.a("k", (Object)objectArray, (long)-6284703384221056325L, (long)l10)));
    }

    public lw3(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x701DDFBCD5D8L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        this.g = m44.a("o", (Object)objectArray, (long)8790107243637899391L, (long)l10);
    }

    public lw3(HashSet hashSet) {
        this.g = hashSet;
    }

    public Iterator g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("q", (Object)m44.a("p", (Object)this, (long)-6687211582227278291L, (long)l10), (long)-6851809748066186608L, (long)l10);
    }

    public boolean U(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return (boolean)m44.a("u", (Object)m44.a("t", (Object)this, (long)-1556473611304476807L, (long)l10), (Object)object, (long)-1508231000018238031L, (long)l10);
    }

    public boolean S(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return ((HashSet)((Object)m44.a("r", (Object)this, (long)-4764745148298884865L, (long)l10))).add(object);
    }

    public int I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("v", (Object)m44.a("w", (Object)this, (long)5466614157060144834L, (long)l10), (long)5242754079532423741L, (long)l10);
    }

    public synchronized Enumeration E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return Collections.enumeration(m44.a("r", (Object)this, (long)6221723240099472199L, (long)l10));
    }
}

