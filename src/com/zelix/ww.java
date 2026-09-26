/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lo_;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.tx;
import com.zelix.vs;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.Action;
import javax.swing.JFrame;

public abstract class ww
extends tx {
    protected JFrame P;
    private boolean A;
    private static final long ab = prr.a((long)-3942979428148748657L, (long)5810898458795618909L, MethodHandles.lookup().lookupClass()).a(171671025411517L);

    protected abstract void G(Object[] var1);

    public ww(JFrame jFrame, String string, Object object, Object object2, Object object3, long l, Object object4, Object object5, Object object6) {
        long l2 = (l = ab ^ l) ^ 0x4CF484CD289DL;
        this(jFrame, string, true, object, object2, object3, object4, object5, object6, null, l2);
    }

    protected abstract void k(Object[] var1);

    public ww(JFrame jFrame, String string, long l, Object object) {
        long l2 = (l = ab ^ l) ^ 0x51F83C32D938L;
        this(jFrame, string, true, object, null, null, null, null, null, null, l2);
    }

    public void d(Object[] objectArray) {
        block5: {
            Object object;
            long l;
            block4: {
                l = (Long)objectArray[0];
                long l2 = l ^ 0L;
                CallSite callSite = m44.a("n", (long)-7140529009458793597L, (long)l);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l2;
                super.d(objectArray2);
                CallSite callSite2 = callSite;
                try {
                    try {
                        object = this;
                        if (callSite2 == null) break block4;
                        if (m44.a("p", (Object)object, (long)-9182600581820437487L, (long)l) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-8823073499889312986L, (long)l);
                    }
                    m44.a("q", (Object)m44.a("p", (Object)((Object)this), (long)-8740700882878538676L, (long)l), (boolean)true, (long)-8696608377258459508L, (long)l);
                    object = m44.a("p", (Object)((Object)this), (long)-8740700882878538676L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-8823073499889312986L, (long)l);
                }
            }
            m44.a("q", (Object)object, (long)-7361488722799512498L, (long)l);
        }
    }

    public ww(long l, JFrame jFrame, String string, Object object, Object object2, Object object3) {
        long l2 = (l = ab ^ l) ^ 0x1CAAA6C5AEBL;
        this(jFrame, string, true, object, object2, object3, null, null, null, null, l2);
    }

    public ww(JFrame jFrame, String string, Object object, long l, Object object2) {
        long l2 = (l = ab ^ l) ^ 0x32D6E1C0CFBEL;
        this(jFrame, string, true, object, object2, null, null, null, null, null, l2);
    }

    public void P(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    public Action r(Object[] objectArray) {
        return new lo_(this);
    }

    public ww(JFrame jFrame, String string, Object object, Object object2, Object object3, long l, Object object4) {
        long l2 = (l = ab ^ l) ^ 0x66EBF45EDC4CL;
        this(jFrame, string, true, object, object2, object3, object4, null, null, null, l2);
    }

    public ww(JFrame jFrame, String string, Object object, long l, Object object2, Object object3, Object object4, Object object5) {
        long l2 = (l = ab ^ l) ^ 0x15FCD807FF0L;
        this(jFrame, string, true, object, object2, object3, object4, object5, null, null, l2);
    }

    public final void F(Object[] objectArray) {
        Object[] objectArray2;
        long l;
        long l2;
        block3: {
            Object object;
            Object object2;
            long l3;
            block4: {
                CallSite callSite;
                CallSite callSite2;
                int n;
                int n2;
                block2: {
                    n2 = (Integer)objectArray[0];
                    n = (Integer)objectArray[1];
                    boolean bl = (Boolean)objectArray[2];
                    l2 = (Long)objectArray[3];
                    long l4 = l2 = ab ^ l2;
                    l = l4 ^ 0x47AD5EA5E2D9L;
                    l3 = l4 ^ 0x23664C081CC3L;
                    callSite2 = m44.a("u", (Object)((Object)this), (long)6102511322945683224L, (long)l2);
                    Object[] objectArray3 = m44.a("j", (long)6056147670719789935L, (long)l2);
                    if (!bl) break block2;
                    callSite = m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)5647151445977142432L, (long)l2), (long)5748385889761757061L, (long)l2);
                    CallSite callSite3 = m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)5647151445977142432L, (long)l2), (long)5594130664464661874L, (long)l2);
                    object2 = m44.a("t", (Object)callSite3, (long)5248267815727363411L, (long)l2) / 2 - m44.a("t", (Object)callSite2, (long)5248267815727363411L, (long)l2) / 2 + m44.a("t", (Object)callSite, (long)5205199124917818099L, (long)l2);
                    object = m44.a("t", (Object)callSite3, (long)6156529618295514754L, (long)l2) / 2 - m44.a("t", (Object)callSite2, (long)6156529618295514754L, (long)l2) / 2 + m44.a("t", (Object)callSite, (long)5824617367458569122L, (long)l2);
                    object2 = Math.max(0, (int)object2) + n2;
                    object = Math.max(0, (int)object) + n;
                    objectArray2 = objectArray3;
                    if (l2 < 0L) break block3;
                    if (objectArray2 != null) break block4;
                }
                callSite = m44.a("u", (Object)m44.a("j", (long)6171997529765151104L, (long)l2), (long)5603323153484992939L, (long)l2);
                object2 = m44.a("t", (Object)callSite, (long)5248267815727363411L, (long)l2) / 2 - m44.a("t", (Object)callSite2, (long)5248267815727363411L, (long)l2) / 2;
                object = m44.a("t", (Object)callSite, (long)6156529618295514754L, (long)l2) / 2 - m44.a("t", (Object)callSite2, (long)6156529618295514754L, (long)l2) / 2;
                object2 = Math.max(0, (int)object2) + n2;
                object = Math.max(0, (int)object) + n;
            }
            m44.a("u", (Object)((Object)this), (int)object2, (int)object, (long)5415363908453115952L, (long)l2);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = this;
            objectArray2 = objectArray4;
            objectArray4[0] = l3;
        }
        m44.a("j", (Object)objectArray2, (long)6123212124973830812L, (long)l2);
        m44.a("u", (Object)((Object)this), (long)5372717728955054242L, (long)l2);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l;
        m44.a("u", (Object)((Object)this), (Object)objectArray5, (long)5453777316856601947L, (long)l2);
    }

    public ww(JFrame jFrame, long l, String string) {
        long l2 = (l = ab ^ l) ^ 0x52AAAF9A2609L;
        this(jFrame, string, true, null, null, null, null, null, null, null, l2);
    }

    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = ab ^ l) ^ 0xF7BF1AE5087L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = true;
        objectArray2[1] = 0;
        objectArray2[0] = 0;
        m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)-2381674425273696267L, (long)l);
    }

    public ww(JFrame jFrame, String string, boolean bl, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, long l) {
        long l2;
        block5: {
            boolean bl2;
            Object object8;
            block4: {
                long l3 = l = ab ^ l;
                long l4 = l3 ^ 0x64A10C43FC0CL;
                l2 = l3 ^ 0xFA0FE99B872L;
                CallSite callSite = m44.a("l", (long)4403946135450653305L, (long)l);
                super(string, l4);
                CallSite callSite2 = callSite;
                try {
                    try {
                        m44.a("p", (Object)((Object)this), (JFrame)jFrame, (long)2830655047094730166L, (long)l);
                        object8 = this;
                        bl2 = bl;
                        if (callSite2 == null) break block4;
                        m44.a("p", (Object)object8, (boolean)bl2, (long)2407897977594547691L, (long)l);
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)2626845952463665884L, (long)l);
                    }
                    object8 = jFrame;
                    bl2 = false;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)2626845952463665884L, (long)l);
                }
            }
            m44.a("s", (Object)object8, (boolean)bl2, (long)2789201369120710518L, (long)l);
        }
        vs vs2 = new vs(this);
        m44.a("s", (Object)((Object)this), (Object)vs2, (long)4392626197869312388L, (long)l);
        Object[] objectArray = new Object[8];
        objectArray[7] = object7;
        objectArray[6] = object6;
        objectArray[5] = object5;
        objectArray[4] = l2;
        objectArray[3] = object4;
        objectArray[2] = object3;
        objectArray[1] = object2;
        objectArray[0] = object;
        m44.a("s", (Object)((Object)this), (Object)objectArray, (long)4495200530000992467L, (long)l);
    }

    private static n9 c(n9 n92) {
        return n92;
    }
}
