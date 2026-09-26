/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.g0;
import com.zelix.lo1;
import com.zelix.m44;
import com.zelix.ms;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.Component;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JList;

public class tq
extends DefaultListCellRenderer {
    final ms f;
    g0 A;
    lo1 Z;
    private static final long a = prr.a((long)-4066507099387616295L, (long)-2489015732801300324L, MethodHandles.lookup().lookupClass()).a(218316884157317L);

    tq(ms ms2, long l) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x67A90C79809AL;
        long l4 = l2 ^ 0x3764B3C7AEB8L;
        this.f = ms2;
        m44.a("v", (Object)this, (g0)new g0(l3), (long)831360816198250838L, (long)l);
        m44.a("v", (Object)this, (lo1)new lo1(l4), (long)1485277687868320032L, (long)l);
    }

    @Override
    public Component getListCellRendererComponent(JList jList, Object object, int n, boolean bl, boolean bl2) {
        CallSite callSite;
        File file;
        CallSite callSite2;
        long l;
        long l2;
        block7: {
            block6: {
                l2 = a ^ 0xB060A7CADC7L;
                l = l2 ^ 0x47346CBE764CL;
                CallSite callSite3 = m44.a("h", (long)804178667271589806L, (long)l2);
                super.getListCellRendererComponent((JList<?>)jList, object, n, bl, bl2);
                callSite2 = callSite3;
                file = (File)object;
                try {
                    try {
                        if (callSite2 != null) break block6;
                        if (file != null) break block7;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)800008848887081809L, (long)l2);
                    }
                    m44.a("w", (Object)this, (Object)"", (long)1427485650736162908L, (long)l2);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)800008848887081809L, (long)l2);
                }
            }
            return this;
        }
        int n2 = 0;
        if (n != -1) {
            callSite = m44.a("w", (Object)file, (long)1303866160774616039L, (long)l2);
            while (callSite != null) {
                ++n2;
                callSite = m44.a("w", (Object)callSite, (long)1303866160774616039L, (long)l2);
                if (callSite2 == null) continue;
            }
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l;
        objectArray[0] = file;
        callSite = m44.a("w", (Object)m44.a("v", (Object)this, (long)697678947455890450L, (long)l2), (Object)objectArray, (long)1716050711037469295L, (long)l2);
        m44.a("t", (Object)m44.a("v", (Object)this, (long)1638172542658735204L, (long)l2), (Icon)((Object)callSite), (long)797917856621494706L, (long)l2);
        m44.a("t", (Object)m44.a("v", (Object)this, (long)1638172542658735204L, (long)l2), (int)n2, (long)578902513264900295L, (long)l2);
        m44.a("w", (Object)this, (Object)m44.a("v", (Object)this, (long)1638172542658735204L, (long)l2), (long)1360943037646471725L, (long)l2);
        return this;
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
