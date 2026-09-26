/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m4;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class m0
implements Comparable {
    private boolean i;
    Set g;
    private static final long a = prr.a(-1075064203274371279L, 2091939148285653056L, MethodHandles.lookup().lookupClass()).a(269209550980077L);

    void M(Object[] objectArray) {
        ArrayList arrayList = (ArrayList)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x1758D8E5A44FL;
        long l13 = l11 ^ 0x38A725B3B850L;
        CallSite callSite = m44.a("i", (long)7586446264091740420L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = arrayList;
        objectArray2[0] = l13;
        m44.a("v", (Object)this, (Object)objectArray2, (long)8356307495187693163L, (long)l10);
        CallSite callSite2 = callSite;
        Iterator iterator = m44.a("w", (Object)this, (long)7560638814467975425L, (long)l10).iterator();
        while (iterator.hasNext()) {
            m4 m42 = (m4)iterator.next();
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l12;
            objectArray3[0] = arrayList;
            m44.a("v", (Object)m42, (Object)objectArray3, (long)7540836087004946944L, (long)l10);
            if (callSite2 == null) continue;
        }
    }

    abstract void n(Object[] var1);

    final void H(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String[] stringArray = (String[])objectArray[2];
        Map map = (Map)objectArray[3];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x5FAB7BCA132EL;
        long l13 = l11 ^ 0x2C2F241AE40FL;
        long l14 = l11 ^ 0x20D4113E4EABL;
        long l15 = l11 ^ 0x1758D8E5A44FL;
        CallSite callSite = m44.a("m", (long)-8794335862443547208L, (long)l10);
        if (n10 < stringArray.length) {
            boolean bl2;
            String string;
            block25: {
                boolean bl3;
                block26: {
                    Map map2;
                    Object object;
                    block24: {
                        Object object2;
                        StringBuilder stringBuilder;
                        block22: {
                            block23: {
                                Object object3;
                                Object object4;
                                block20: {
                                    m0 m02;
                                    string = stringArray[n10];
                                    object4 = m44.a("s", (Object)this, (long)-8912466984068643395L, (long)l10).iterator();
                                    block16: while (object4.hasNext()) {
                                        m02 = object4.next();
                                        do {
                                            block21: {
                                                block19: {
                                                    object = (m4)m02;
                                                    try {
                                                        try {
                                                            try {
                                                                if (callSite != null) break block19;
                                                                object3 = string;
                                                                if (callSite != null) break block20;
                                                            }
                                                            catch (n9 n92) {
                                                                throw m44.a("m", (Object)n92, (long)-8885508584685747696L, (long)l10);
                                                            }
                                                            Object[] objectArray2 = new Object[1];
                                                            objectArray2[0] = l13;
                                                            if (!((String)object3).equals(m44.a("r", (Object)object, (Object)objectArray2, (long)-9164050831355288631L, (long)l10))) break block21;
                                                        }
                                                        catch (n9 n93) {
                                                            throw m44.a("m", (Object)n93, (long)-8885508584685747696L, (long)l10);
                                                        }
                                                        ++n10;
                                                        Object[] objectArray3 = new Object[4];
                                                        objectArray3[3] = map;
                                                        objectArray3[2] = stringArray;
                                                        objectArray3[1] = l15;
                                                        objectArray3[0] = n10;
                                                        m44.a("r", (Object)object, (Object)objectArray3, (long)-7461389717378463033L, (long)l10);
                                                    }
                                                    catch (n9 n94) {
                                                        throw m44.a("m", (Object)n94, (long)-8885508584685747696L, (long)l10);
                                                    }
                                                }
                                                return;
                                            }
                                            if (callSite == null) continue block16;
                                            m02 = this;
                                        } while (l10 < 0L);
                                    }
                                    Object[] objectArray4 = new Object[1];
                                    objectArray4[0] = l12;
                                    object3 = m44.a("r", (Object)m02, (Object)objectArray4, (long)-8822185116668251105L, (long)l10);
                                }
                                object4 = object3;
                                try {
                                    try {
                                        stringBuilder = new StringBuilder();
                                        object2 = object4;
                                        if (callSite != null) break block22;
                                        if (((String)object2).length() <= 0) break block23;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("m", (Object)n95, (long)-8885508584685747696L, (long)l10);
                                    }
                                    object2 = (String)object4 + "/";
                                    break block22;
                                }
                                catch (n9 n96) {
                                    throw m44.a("m", (Object)n96, (long)-8885508584685747696L, (long)l10);
                                }
                            }
                            object2 = "";
                        }
                        object = stringBuilder.append((String)object2).append(string).toString();
                        bl2 = false;
                        try {
                            map2 = map;
                            if (l10 <= 0L || callSite != null) break block24;
                            if (map2 == null) break block25;
                        }
                        catch (n9 n97) {
                            throw m44.a("m", (Object)n97, (long)-8885508584685747696L, (long)l10);
                        }
                        map2 = map;
                    }
                    try {
                        try {
                            bl3 = map2.containsKey(object);
                            if (callSite != null) break block26;
                            if (!bl3) break block25;
                        }
                        catch (n9 n98) {
                            throw m44.a("m", (Object)n98, (long)-8885508584685747696L, (long)l10);
                        }
                        bl3 = (Boolean)map.get(object);
                    }
                    catch (n9 n99) {
                        throw m44.a("m", (Object)n99, (long)-8885508584685747696L, (long)l10);
                    }
                }
                bl2 = bl3;
            }
            m4 m42 = new m4(this, string, bl2, l14);
            m44.a("s", (Object)this, (long)-8912466984068643395L, (long)l10).add(m42);
            ++n10;
            Object[] objectArray5 = new Object[4];
            objectArray5[3] = map;
            objectArray5[2] = stringArray;
            objectArray5[1] = l15;
            objectArray5[0] = n10;
            m44.a("r", (Object)m42, (Object)objectArray5, (long)-7461389717378463033L, (long)l10);
        }
    }

    void O(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("s", (Object)this, (boolean)bl2, (long)5890128410203956878L, (long)l10);
    }

    void B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Map map = (Map)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x1758D8E5A44FL;
        long l13 = l11 ^ 0x352B6E7F47D7L;
        CallSite callSite = m44.a("k", (long)-5246108330560202882L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = map;
        objectArray2[0] = l13;
        m44.a("t", (Object)this, (Object)objectArray2, (long)-5967601297470356506L, (long)l10);
        CallSite callSite2 = callSite;
        Iterator iterator = m44.a("u", (Object)this, (long)-5289860273843325061L, (long)l10).iterator();
        while (iterator.hasNext()) {
            m4 m42 = (m4)iterator.next();
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = map;
            objectArray3[0] = l12;
            m44.a("t", (Object)m42, (Object)objectArray3, (long)-5956171023908176653L, (long)l10);
            if (callSite2 == null) continue;
        }
    }

    void X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        ArrayList arrayList = (ArrayList)objectArray[1];
    }

    public int compareTo(Object object) {
        long l10 = a ^ 0x7369FFA26C0AL;
        long l11 = l10 ^ 0x47299C379FF5L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = (m0)object;
        return (int)m44.a("u", (Object)this, (Object)objectArray, (long)-4247722344264579461L, (long)l10);
    }

    public abstract boolean W(Object[] var1);

    public boolean h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("p", (Object)this, (long)-7357507292019396905L, (long)l10);
    }

    public abstract String E(Object[] var1);

    public m0(long l10) {
        l10 = a ^ l10;
        m44.a("w", (Object)this, new LinkedHashSet(), (long)-4141352654779562133L, (long)l10);
        m44.a("w", (Object)this, (boolean)true, (long)-2728619786183758574L, (long)l10);
    }

    public final int w(Object[] objectArray) {
        m0 m02 = (m0)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x4E23D50B6E2BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l11;
        return ((String)((Object)m44.a("w", (Object)this, (Object)objectArray2, (long)-534700302293448422L, (long)l10))).toLowerCase().compareTo(((String)((Object)m44.a("w", (Object)m02, (Object)objectArray3, (long)-534700302293448422L, (long)l10))).toLowerCase());
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

