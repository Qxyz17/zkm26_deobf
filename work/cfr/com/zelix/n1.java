/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lk5;
import com.zelix.m44;
import com.zelix.o4;
import com.zelix.prr;
import com.zelix.sz;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class n1
implements ListSelectionListener {
    private int[] d;
    private lk5 W;
    private static final long a = prr.a(-2834846548318635808L, -2082831237724009099L, MethodHandles.lookup().lookupClass()).a(241961316995348L);

    n1(lk5 lk52, long l10) {
        l10 = a ^ l10;
        m44.a("r", (Object)this, (int[])new int[0], (long)1326188908699012010L, (long)l10);
        m44.a("r", (Object)this, (lk5)lk52, (long)596863866759389470L, (long)l10);
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        long l10;
        long l11 = l10 = a ^ 0x407B3A851174L;
        long l12 = l11 ^ 0x10496BBB8EFEL;
        int n10 = (int)(l12 >>> 32);
        int n11 = (int)(l12 << 32 >>> 48);
        int n12 = (int)(l12 << 48 >>> 48);
        long l13 = l11 ^ 0x4D7C63574D75L;
        long l14 = l11 ^ 0x868ED0D6D45L;
        o4 o42 = (o4)((Object)m44.a("r", (Object)listSelectionEvent, (long)82073978906295199L, (long)l10));
        CallSite callSite = m44.a("r", (Object)o42, (long)2250404675537790149L, (long)l10);
        sz sz2 = new sz(n10, (short)n11, (char)n12);
        sz sz3 = new sz(n10, (short)n11, (char)n12);
        Object[] objectArray = new Object[5];
        objectArray[4] = sz3;
        objectArray[3] = l13;
        objectArray[2] = sz2;
        objectArray[1] = callSite;
        objectArray[0] = m44.a("s", (Object)this, (long)505722357544476361L, (long)l10);
        m44.a("m", (Object)objectArray, (long)2057519234804270550L, (long)l10);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (int[])sz3.t();
        objectArray2[1] = l14;
        objectArray2[0] = (int[])sz2.t();
        m44.a("r", (Object)m44.a("s", (Object)this, (long)2101846774947624061L, (long)l10), (Object)objectArray2, (long)1826433212362433927L, (long)l10);
    }

    public void O(Object[] objectArray) {
        int[] nArray = (int[])objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("p", (Object)this, (int[])nArray, (long)5962079454157474672L, (long)l10);
    }
}

