/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lk5;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.JComboBox;

public class lkr
implements ItemListener {
    lk5 D;
    private static final long a = prr.a(8774414619623898337L, 1533741654832645074L, MethodHandles.lookup().lookupClass()).a(124510731825998L);

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        block5: {
            Object object;
            long l10;
            long l11;
            block4: {
                l11 = a ^ 0x6ABF597437CL;
                l10 = l11 ^ 0xFEF00B37C61L;
                CallSite callSite = m44.a("j", (long)8230152096216450247L, (long)l11);
                try {
                    try {
                        object = itemEvent;
                        if (callSite != null) break block4;
                        if (m44.a("u", (Object)object, (long)8383656039518446831L, (long)l11) != true) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)7934254781530823547L, (long)l11);
                    }
                    object = m44.a("u", (Object)itemEvent, (long)7920757896553568656L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)7934254781530823547L, (long)l11);
                }
            }
            JComboBox jComboBox = (JComboBox)object;
            Object[] objectArray = new Object[2];
            objectArray[1] = l10;
            objectArray[0] = (int)m44.a("u", (Object)jComboBox, (long)8424998208644394579L, (long)l11);
            m44.a("u", (Object)m44.a("t", (Object)this, (long)7763666458408689599L, (long)l11), (Object)objectArray, (long)7496571491212613884L, (long)l11);
        }
    }

    lkr(lk5 lk52, long l10) {
        l10 = a ^ l10;
        m44.a("u", (Object)this, (lk5)lk52, (long)7921094828316989932L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

