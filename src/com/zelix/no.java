/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.r1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.MethodHandles;

public class no
implements ActionListener {
    final r1 F;
    private static final long a = prr.a((long)9017555200683790308L, (long)-1579611355999338831L, MethodHandles.lookup().lookupClass()).a(190310264207231L);

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        long l = a ^ 0x9B08C0D2B4FL;
        long l2 = l ^ 0x6EC148708875L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("q", (Object)m44.a("p", (Object)this, (long)4824978441572073023L, (long)l), (Object)objectArray, (long)6621897135420079601L, (long)l);
    }

    no(r1 r12) {
        this.F = r12;
    }
}
