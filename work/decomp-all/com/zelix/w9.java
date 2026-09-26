/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.gv;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rz;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class w9
implements Enumeration {
    private int g;
    private final gv z;
    private boolean s;
    final l6q E;
    private static final long a = prr.a((long)-2310894628413413005L, (long)8705745716827863399L, MethodHandles.lookup().lookupClass()).a(192716891032694L);

    public Object nextElement() {
        Object object;
        block4: {
            long l;
            long l2;
            block5: {
                l2 = a ^ 0x6F4CAD5CC86EL;
                l = l2 ^ 0x390E26635E8DL;
                CallSite callSite = m44.a("i", (long)-8662952447478883855L, (long)l2);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block4;
                        if (m44.a("w", (Object)object, (long)-6924225804263455268L, (long)l2) == false) break block5;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw m44.a("i", (Object)concurrentModificationException, (long)-8853190758692020472L, (long)l2);
                    }
                    throw new ConcurrentModificationException();
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw m44.a("i", (Object)concurrentModificationException, (long)-8853190758692020472L, (long)l2);
                }
            }
            CallSite callSite = m44.a("w", (Object)this, (long)-8978967096385220282L, (long)l2);
            w9 w92 = this;
            CallSite callSite2 = m44.a("w", (Object)w92, (long)-6937368975597131619L, (long)l2);
            m44.a("u", (Object)w92, (int)(callSite2 + true), (long)-6937368975597131619L, (long)l2);
            Object[] objectArray = new Object[2];
            objectArray[1] = (int)callSite2;
            objectArray[0] = l;
            object = m44.a("v", (Object)callSite, (Object)objectArray, (long)-7104371390118022791L, (long)l2);
        }
        return object;
    }

    @Override
    public boolean hasMoreElements() {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l;
                block8: {
                    block9: {
                        l = a ^ 0x661F7C12AD47L;
                        callSite = m44.a("h", (long)-2094723623802241832L, (long)l);
                        try {
                            try {
                                object = m44.a("v", (Object)this, (long)-377954910659485451L, (long)l);
                                if (callSite != null) break block8;
                                if (object == false) break block9;
                            }
                            catch (ConcurrentModificationException concurrentModificationException) {
                                throw m44.a("h", (Object)concurrentModificationException, (long)-2302979079618790879L, (long)l);
                            }
                            throw new ConcurrentModificationException();
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw m44.a("h", (Object)concurrentModificationException, (long)-2302979079618790879L, (long)l);
                        }
                    }
                    object = m44.a("v", (Object)this, (long)-391660335649927756L, (long)l);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object >= m44.a("w", (Object)m44.a("v", (Object)this, (long)-1851747265479723921L, (long)l), (long)-449007325865385813L, (long)l)) break block11;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw m44.a("h", (Object)concurrentModificationException, (long)-2302979079618790879L, (long)l);
                    }
                    object = true;
                    break block10;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw m44.a("h", (Object)concurrentModificationException, (long)-2302979079618790879L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private void H(Object[] objectArray) {
        w9 w92;
        long l;
        block4: {
            block5: {
                l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("o", (long)4467961756628492343L, (long)l);
                try {
                    try {
                        w92 = this;
                        if (callSite != null) break block4;
                        if (m44.a("q", (Object)w92, (long)2751229327218326554L, (long)l) == false) break block5;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw m44.a("o", (Object)concurrentModificationException, (long)4387989035232044750L, (long)l);
                    }
                    throw new ConcurrentModificationException();
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw m44.a("o", (Object)concurrentModificationException, (long)4387989035232044750L, (long)l);
                }
            }
            w92 = this;
        }
        m44.a("s", (Object)w92, (int)0, (long)2774184943683834203L, (long)l);
    }

    private void I(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        m44.a("r", (Object)this, (boolean)true, (long)-2492948855506942125L, (long)l);
    }

    static void N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        w9 w92 = (w9)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x18074E5431FBL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("l", (Object)w92, (Object)objectArray2, (long)-5353554203136706603L, (long)l);
    }

    static void a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        w9 w92 = (w9)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x74EE0EAD3293L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("m", (Object)w92, (Object)objectArray2, (long)5554397623263100796L, (long)l);
    }

    w9(int n, l6q l6q2, rz rz2, byte by, int n2) {
        long l = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ a;
        long l2 = l ^ 0x480029D18EC5L;
        int n3 = (int)(l2 >>> 32);
        int n4 = (int)(l2 << 32 >>> 48);
        int n5 = (int)(l2 << 48 >>> 48);
        this(n3, (char)n4, l6q2, (char)n5);
    }

    private w9(int n, char c, l6q l6q2, char c2) {
        block6: {
            long l;
            long l2 = l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ a;
            long l3 = l2 ^ 0x584E4CE353CBL;
            long l4 = l2 ^ 0xC58CDC9F74CL;
            int n2 = (int)(l4 >>> 48);
            int n3 = (int)(l4 << 16 >>> 32);
            int n4 = (int)(l4 << 48 >>> 48);
            this.E = l6q2;
            CallSite callSite = m44.a("l", (long)3180232170462261780L, (long)l);
            m44.a("p", (Object)this, (boolean)false, (long)3750728538094775865L, (long)l);
            this.z = new gv(l6q2.o.size() * 5, (char)n2, n3, (short)n4);
            Iterator iterator = l6q2.o.values().iterator();
            CallSite callSite2 = callSite;
            block2: while (iterator.hasNext()) {
                List list = (List)iterator.next();
                try {
                    m44.a("s", (Object)m44.a("r", (Object)this, (long)2918677895789312675L, (long)l), (Object)list, (long)3308121615911680292L, (long)l);
                    do {
                        CallSite callSite3 = callSite2;
                        if (n > 0) {
                            if (callSite3 != null) break block6;
                            callSite3 = callSite2;
                        }
                        if (callSite3 == null) continue block2;
                    } while (c < '\u0000');
                    break;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw m44.a("l", (Object)concurrentModificationException, (long)3370472646723745005L, (long)l);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l3;
            m44.a("m", (Object)this, (Object)objectArray, (long)3192211653547564580L, (long)l);
        }
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}
