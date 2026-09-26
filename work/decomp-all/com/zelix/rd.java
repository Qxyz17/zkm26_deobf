/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o4;
import com.zelix.prr;
import com.zelix.wa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class rd
implements ActionListener,
ListSelectionListener {
    wa C;
    private static final long a = prr.a((long)5912572383356965538L, (long)2766753854868864530L, MethodHandles.lookup().lookupClass()).a(184769434002956L);

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        CallSite callSite;
        long l;
        long l2;
        block5: {
            o4 o42;
            block6: {
                l2 = a ^ 0x666619CD682DL;
                l = l2 ^ 0x2983E3E5899DL;
                o42 = (o4)m44.a("v", (Object)listSelectionEvent, (long)-1292637004269759309L, (long)l2);
                CallSite callSite2 = m44.a("i", (long)-1521018412704228332L, (long)l2);
                try {
                    callSite = m44.a("v", (Object)listSelectionEvent, (long)-1599352926227824457L, (long)l2);
                    if (callSite2 != null) break block5;
                    if (callSite == false) break block6;
                }
                catch (n9 n92) {
                    throw m44.a("i", (Object)((Object)n92), (long)-1436283542497739539L, (long)l2);
                }
                return;
            }
            callSite = m44.a("v", (Object)o42, (long)-1597371001060299515L, (long)l2);
        }
        CallSite callSite3 = callSite;
        try {
            if (callSite3 > -1) {
                Object[] objectArray = new Object[2];
                objectArray[1] = l;
                objectArray[0] = (int)callSite3;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)-1605730273210052705L, (long)l2), (Object)objectArray, (long)-1593611773358163795L, (long)l2);
            }
        }
        catch (n9 n93) {
            throw m44.a("i", (Object)((Object)n93), (long)-1436283542497739539L, (long)l2);
        }
    }

    rd(wa wa2, long l) {
        l = a ^ l;
        m44.a("u", (Object)this, (wa)wa2, (long)1033348983089113215L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
