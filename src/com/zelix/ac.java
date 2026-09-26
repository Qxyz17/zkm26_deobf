/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.a6;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.wf;
import com.zelix.y3;
import java.lang.invoke.MethodHandles;

public class ac
extends Thread {
    final wf V;
    Runnable R;
    String L;
    private static final long a = prr.a((long)-2281627210185239005L, (long)-7899149965977452432L, MethodHandles.lookup().lookupClass()).a(12209015552380L);

    ac(long l, wf wf2) {
        l = a ^ l;
        this.V = wf2;
        m44.a("u", (Object)this, (Runnable)new y3(this), (long)4989500168605687302L, (long)l);
    }

    @Override
    public void run() {
        long l = a ^ 0x2E1F64577C30L;
        long l2 = l ^ 0x57E7E2426685L;
        try {
            Object[] objectArray = new Object[3];
            objectArray[2] = (boolean)m44.a("q", (Object)m44.a("p", (Object)m44.a("p", (Object)this, (long)-4553401260374700715L, (long)l), (long)-4451913057810561339L, (long)l), (long)-4160641567738417771L, (long)l);
            objectArray[1] = l2;
            objectArray[0] = m44.a("q", (Object)m44.a("p", (Object)m44.a("p", (Object)this, (long)-4553401260374700715L, (long)l), (long)-4454249451526801812L, (long)l), (long)-2420683308223587528L, (long)l);
            m44.a("r", (Object)this, (String)((Object)m44.a("q", (Object)m44.a("p", (Object)m44.a("p", (Object)this, (long)-4553401260374700715L, (long)l), (long)-2309141048867801159L, (long)l), (Object)objectArray, (long)-4264937019437177514L, (long)l)), (long)-4490536900638765996L, (long)l);
        }
        catch (a6 a62) {
            m44.a("r", (Object)this, (String)((Object)m44.a("q", (Object)((Object)a62), (long)-2805975072837483697L, (long)l)), (long)-4490536900638765996L, (long)l);
        }
        m44.a("n", (Object)m44.a("p", (Object)this, (long)-2361854923763235839L, (long)l), (long)-2638994200423047875L, (long)l);
    }
}
