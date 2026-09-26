/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.wa;
import java.io.File;
import java.lang.invoke.MethodHandles;

public class lue
extends lmc {
    final wa n;
    private static final long a = prr.a(-7123749505451961189L, -7041218166573058924L, MethodHandles.lookup().lookupClass()).a(203761284283470L);

    @Override
    public void H(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x69E746BC7E69L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = (Integer)object2;
        objectArray2[0] = (File)object;
        m44.a("u", (Object)this, (Object)objectArray2, (long)5354893029238658482L, (long)l10);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x56B22D5AB9DEL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = false;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5467349438811704733L, (long)l10), (Object)objectArray2, (long)6230706247764054053L, (long)l10);
    }

    lue(wa wa2) {
        this.n = wa2;
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        m44.a("u", (Object)this, (Object)new Object[]{(File)object}, (long)4504971453248006310L, (long)l10);
    }

    public void i(Object[] objectArray) {
        File file = (File)objectArray[0];
        Integer n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x281623A1B4E2L;
        try {
            if (file != null) {
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = null;
                objectArray2[1] = l11;
                objectArray2[0] = file;
                m44.a("t", (Object)m44.a("u", (Object)this, (long)-1849677210284318698L, (long)l10), (Object)objectArray2, (long)-2056420887571302405L, (long)l10);
            }
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)n92, (long)-363008053063407344L, (long)l10);
        }
    }

    public void e(Object[] objectArray) {
        File file = (File)objectArray[0];
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

