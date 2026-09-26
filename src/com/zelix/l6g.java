/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gv;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public class l6g
implements Iterator {
    private Object[] y;
    private int B;
    final gv a;
    private static final long b = prr.a((long)-5730404448940887632L, (long)8972734409696550982L, MethodHandles.lookup().lookupClass()).a(129341517988078L);

    l6g(gv gv2, long l) {
        l = b ^ l;
        this.a = gv2;
        m44.a("v", (Object)this, (Object[])m44.a("j", (Object)new Object[]{m44.a("t", (Object)this, (long)-8550316410642726526L, (long)l)}, (long)-7712042964427023387L, (long)l).toArray(new Object[m44.a("j", (Object)new Object[]{m44.a("t", (Object)this, (long)-8550316410642726526L, (long)l)}, (long)-7712042964427023387L, (long)l).size()]), (long)-8208639425194955020L, (long)l);
        m44.a("v", (Object)this, (int)0, (long)-7597274311405892722L, (long)l);
    }

    @Override
    public boolean hasNext() {
        Object object;
        block4: {
            block5: {
                long l = b ^ 0x6301855AF498L;
                CallSite callSite = m44.a("l", (long)2331270171324923500L, (long)l);
                try {
                    try {
                        object = m44.a("r", (Object)this, (long)4361577661537264024L, (long)l);
                        if (callSite != null) break block4;
                        if (object >= ((CallSite)m44.a("r", (Object)this, (long)2595038126770111714L, (long)l)).length) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw m44.a("l", (Object)unsupportedOperationException, (long)4260886403039473976L, (long)l);
                    }
                    object = true;
                    break block4;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw m44.a("l", (Object)unsupportedOperationException, (long)4260886403039473976L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public Object next() {
        long l = b ^ 0x6837EAF9CD3FL;
        CallSite callSite = m44.a("u", (Object)this, (long)2135944665165823301L, (long)l);
        l6g l6g2 = this;
        CallSite callSite2 = m44.a("u", (Object)l6g2, (long)369406152063457343L, (long)l);
        m44.a("w", (Object)l6g2, (int)(callSite2 + true), (long)369406152063457343L, (long)l);
        return callSite[callSite2];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}
