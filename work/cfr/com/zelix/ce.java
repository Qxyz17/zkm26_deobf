/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gg;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sn;
import java.lang.invoke.MethodHandles;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class ce
extends JPanel
implements gg {
    JTextField Z;
    JFrame C;
    sn P;
    public int F;
    JLabel h;
    private static final long e = prr.a(1278055900577906680L, 7637480487753127101L, MethodHandles.lookup().lookupClass()).a(173003090862108L);

    public abstract void R(Object[] var1);

    public ce(JFrame jFrame, sn sn2, int n10, long l10) {
        l10 = e ^ l10;
        m44.a("w", (Object)this, (int)n10, (long)-1706532672213545108L, (long)l10);
        m44.a("w", (Object)this, (JFrame)jFrame, (long)-1471706577102123029L, (long)l10);
        m44.a("w", (Object)this, (sn)sn2, (long)-1498343015029252241L, (long)l10);
    }
}

