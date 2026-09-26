/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ef;
import com.zelix.l62;
import com.zelix.m44;
import java.util.ArrayList;

public class er
extends ef {
    er() {
    }

    @Override
    protected void K(Object[] objectArray) {
        l62 l622 = (l62)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n10 = (Integer)objectArray[2];
        Object object = objectArray[3];
        long l11 = l10 ^ 0x4A291CB3122EL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = n10;
        objectArray2[0] = l11;
        m44.a("r", (Object)l622, (Object)objectArray2, (long)7486319315358205094L, (long)l10);
        ((ArrayList)object).add(l622);
    }
}

