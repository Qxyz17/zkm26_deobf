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

    protected void K(Object[] objectArray) {
        l62 l622 = (l62)objectArray[0];
        long l = (Long)objectArray[1];
        int n = (Integer)objectArray[2];
        Object object = objectArray[3];
        long l2 = l ^ 0x4A291CB3122EL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = n;
        objectArray2[0] = l2;
        m44.a("r", (Object)l622, (Object)objectArray2, (long)7486319315358205094L, (long)l);
        ((ArrayList)object).add(l622);
    }
}
