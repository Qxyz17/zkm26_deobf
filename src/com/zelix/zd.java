/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.r3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.MethodHandles;

public class zd
implements ActionListener {
    r3 p;
    private static final long a = prr.a((long)-8423752943702443036L, (long)1664094033335996747L, MethodHandles.lookup().lookupClass()).a(224813419030165L);

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        long l = a ^ 0x301F637D8D77L;
        long l2 = l ^ 0x4861A0A3A0A9L;
        Object[] objectArray = new Object[2];
        objectArray[1] = actionEvent;
        objectArray[0] = l2;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)1913732519907458781L, (long)l), (Object)objectArray, (long)272602547229143093L, (long)l);
    }

    zd(r3 r32, long l) {
        l = a ^ l;
        m44.a("w", (Object)this, (r3)r32, (long)-7592920594898095373L, (long)l);
    }
}
