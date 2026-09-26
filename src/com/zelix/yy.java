/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.snp;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.invoke.MethodHandles;

public class yy
extends MouseAdapter {
    final snp Y;
    private static final long a = prr.a((long)-4203166330908345283L, (long)-5010934928146874466L, MethodHandles.lookup().lookupClass()).a(67519983490949L);

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        long l = a ^ 0x5202F14E9AFFL;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)-3530221331290540734L, (long)l), (Object)mouseEvent, (long)-3840971479086958433L, (long)l);
    }

    yy(snp snp2) {
        this.Y = snp2;
    }
}
