/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.mn;
import com.zelix.ra;

public class l6d
implements ra {
    private final String d;
    public static final ra h = new l6d("*");

    public l6d(String string) {
        this.d = string;
    }

    public boolean n(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x1BE7100D79F2L;
        return mn.R((String)string, (long)l2, (String)((Object)m44.a("w", (Object)this, (long)3662769066280558012L, (long)l)));
    }
}
