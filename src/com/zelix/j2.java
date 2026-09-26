/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix._v;
import com.zelix.gm;
import com.zelix.gu;
import com.zelix.js;
import com.zelix.jz;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.x8;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class j2
extends jz
implements ni,
gm {
    private x8 p;
    private static final long a = prr.a((long)2405471810702964665L, (long)-9038183232671904480L, MethodHandles.lookup().lookupClass()).a(136617523305121L);

    public boolean e(long l, gu gu2, Object object, Object object2) {
        long l2 = l ^ 0xB1C2A58BC7CL;
        return gu2.K((js)this, object, l2, object2);
    }

    public x8 O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)((Object)this), (long)6131490504985776780L, (long)l);
    }

    public String z(char c, int n, short s) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        long l2 = l ^ 0x36E0BF96533BL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return m44.a("r", (Object)((Object)this), (Object)objectArray, (long)-894840240216811767L, (long)l);
    }

    public void d(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        Set set2 = (Set)objectArray[1];
        long l = (Long)objectArray[2];
        Set set3 = (Set)objectArray[3];
        Set set4 = (Set)objectArray[4];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x502164A75AF8L;
        long l4 = l2 ^ 0x2A836F8BC40FL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("q", (Object)((Object)this), (Object)objectArray2, (long)-407710683076501814L, (long)l);
        objectArray3[0] = l4;
        CallSite callSite = m44.a("n", (Object)objectArray3, (long)-410547525338876732L, (long)l);
        set2.addAll(callSite);
    }

    public j2(int n, int n2, char c, to to2, short s, x8 x82) {
        long l = ((long)n2 << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        super(n, to2);
        m44.a("p", (Object)((Object)this), (x8)x82, (long)3889819240644014688L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    void w(long var1_1, DataOutputStream var3_2, Map var4_3) {
        block9: {
            block8: {
                v0 = m44.a("h", (long)7191396267850401064L, (long)var1_1);
                var3_2.writeByte(m44.a("l", (long)8951627742617072227L, (long)var1_1).g());
                var5_4 = v0;
                var6_5 = (x8)var4_3.get(m44.a("v", (Object)this, (long)7158304565001626828L, (long)var1_1));
                try {
                    try {
                        v1 = var5_4;
                        if (var1_1 <= 0L) ** GOTO lbl23
                        if (v1 != false) break block8;
                        if (var6_5 != null) {
                        }
                        ** GOTO lbl24
                    }
                    catch (n9 v2) {
                        throw m44.a("h", (Object)v2, (long)7151118545088389537L, (long)var1_1);
                    }
                    var3_2.writeShort(var6_5.E());
                }
                catch (n9 v3) {
                    throw m44.a("h", (Object)v3, (long)7151118545088389537L, (long)var1_1);
                }
            }
            try {
                if (var1_1 <= 0L) break block9;
                v1 = var5_4;
lbl23:
                // 2 sources

                if (v1 == false) break block9;
lbl24:
                // 2 sources

                var3_2.writeShort(m44.a("v", (Object)this, (long)7158304565001626828L, (long)var1_1).E());
            }
            catch (n9 v4) {
                throw m44.a("h", (Object)v4, (long)7151118545088389537L, (long)var1_1);
            }
        }
    }

    public void q(x8 x82, long l, x8 x83) {
        block5: {
            j2 j22;
            block4: {
                CallSite callSite = m44.a("n", (long)-5906177365838858378L, (long)l);
                try {
                    try {
                        j22 = this;
                        if (callSite == false) break block4;
                        if (m44.a("p", (Object)((Object)j22), (long)-5739460955351779390L, (long)l) != x82) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-5750007290962808145L, (long)l);
                    }
                    j22 = this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-5750007290962808145L, (long)l);
                }
            }
            m44.a("r", (Object)((Object)j22), (x8)x83, (long)-5739460955351779390L, (long)l);
        }
    }

    void F(Object[] objectArray) {
        HashMap hashMap = (HashMap)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x79544564F76EL;
        String string = m44.a("q", (Object)((Object)this), (long)7840804935273458507L, (long)l).V();
        CallSite callSite = m44.a("o", (Object)string, (Object)hashMap, (long)l2, (long)7599250884037162343L, (long)l);
        try {
            if (callSite != string) {
                m44.a("q", (Object)((Object)this), (long)7840804935273458507L, (long)l).A((String)((Object)callSite));
            }
        }
        catch (n9 n92) {
            throw m44.a("o", (Object)((Object)n92), (long)7834762472020225574L, (long)l);
        }
    }

    public String p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("w", (Object)((Object)this), (long)-874241209169202107L, (long)l).V();
    }

    void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-1793574981721560766L, (long)l).g());
        dataOutputStream.writeShort(m44.a("w", (Object)((Object)this), (long)-543234486562242579L, (long)l).E());
    }

    public void J(Object[] objectArray) {
        block8: {
            boolean bl;
            Object object;
            Set set;
            block9: {
                long l = (Long)objectArray[0];
                Set set2 = (Set)objectArray[1];
                set = (Set)objectArray[2];
                Set set3 = (Set)objectArray[3];
                Set set4 = (Set)objectArray[4];
                long l2 = l = a ^ l;
                long l3 = l2 ^ 0x6E48541D2B46L;
                long l4 = l2 ^ 0xE8FABB1C08FL;
                long l5 = l2 ^ 0x31E60E358A34L;
                long l6 = l2 ^ 0x349C7DBEFDEFL;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l5;
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)3070298862381239814L, (long)l);
                objectArray3[0] = l6;
                object = m44.a("j", (Object)objectArray3, (long)3673347826053253220L, (long)l);
                CallSite callSite = m44.a("j", (long)3304901846564172962L, (long)l);
                CallSite callSite2 = m44.a("u", (Object)this.l, (Object)new Object[0], (long)2920785740898377535L, (long)l);
                try {
                    bl = callSite2.n(l3);
                    if (callSite == false) break block8;
                    if (!bl) break block9;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)3740110397420925307L, (long)l);
                }
                ArrayList<_f> arrayList = new ArrayList<_f>(object.size());
                Iterator iterator = object.iterator();
                block4: while (iterator.hasNext()) {
                    _v _v2 = (_v)iterator.next();
                    try {
                        Object[] objectArray4 = new Object[2];
                        objectArray4[1] = _v2;
                        objectArray4[0] = l4;
                        arrayList.add((_f)m44.a("u", (Object)((Object)this), (Object)objectArray4, (long)3662419226151313555L, (long)l));
                        do {
                            CallSite callSite3 = callSite;
                            if (l > 0L) {
                                if (callSite3 == false) break block8;
                                callSite3 = callSite;
                            }
                            if (callSite3 != false) continue block4;
                        } while (l < 0L);
                        break;
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)((Object)n93), (long)3740110397420925307L, (long)l);
                    }
                }
                object = arrayList;
            }
            bl = set.addAll(object);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
