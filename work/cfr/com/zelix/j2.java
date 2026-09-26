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
import com.zelix.va;
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
    private static final long a = prr.a(2405471810702964665L, -9038183232671904480L, MethodHandles.lookup().lookupClass()).a(136617523305121L);

    @Override
    public boolean e(long l10, gu gu2, Object object, Object object2) {
        long l11 = l10 ^ 0xB1C2A58BC7CL;
        return gu2.K(this, object, l11, object2);
    }

    public x8 O(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)6131490504985776780L, (long)l10);
    }

    @Override
    public String z(char c10, int n10, short s10) {
        long l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)s10 << 48 >>> 48;
        long l11 = l10 ^ 0x36E0BF96533BL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        return m44.a("r", (Object)this, (Object)objectArray, (long)-894840240216811767L, (long)l10);
    }

    public void d(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        Set set2 = (Set)objectArray[1];
        long l10 = (Long)objectArray[2];
        Set set3 = (Set)objectArray[3];
        Set set4 = (Set)objectArray[4];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x502164A75AF8L;
        long l13 = l11 ^ 0x2A836F8BC40FL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("q", (Object)this, (Object)objectArray2, (long)-407710683076501814L, (long)l10);
        objectArray3[0] = l13;
        CallSite callSite = m44.a("n", (Object)objectArray3, (long)-410547525338876732L, (long)l10);
        set2.addAll(callSite);
    }

    public j2(int n10, int n11, char c10, to to2, short s10, x8 x82) {
        long l10 = ((long)n11 << 32 | (long)c10 << 48 >>> 32 | (long)s10 << 48 >>> 48) ^ a;
        super(n10, to2);
        m44.a("p", (Object)this, (x8)x82, (long)3889819240644014688L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
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

    @Override
    public void q(x8 x82, long l10, x8 x83) {
        block5: {
            j2 j22;
            block4: {
                CallSite callSite = m44.a("n", (long)-5906177365838858378L, (long)l10);
                try {
                    try {
                        j22 = this;
                        if (callSite == false) break block4;
                        if (m44.a("p", (Object)j22, (long)-5739460955351779390L, (long)l10) != x82) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-5750007290962808145L, (long)l10);
                    }
                    j22 = this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-5750007290962808145L, (long)l10);
                }
            }
            m44.a("r", (Object)j22, (x8)x83, (long)-5739460955351779390L, (long)l10);
        }
    }

    void F(Object[] objectArray) {
        HashMap hashMap = (HashMap)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x79544564F76EL;
        String string = ((x8)((Object)m44.a("q", (Object)this, (long)7840804935273458507L, (long)l10))).V();
        CallSite callSite = m44.a("o", string, (Object)hashMap, (long)l11, (long)7599250884037162343L, (long)l10);
        try {
            if (callSite != string) {
                ((x8)((Object)m44.a("q", (Object)this, (long)7840804935273458507L, (long)l10))).A((String)((Object)callSite));
            }
        }
        catch (n9 n92) {
            throw m44.a("o", (Object)n92, (long)7834762472020225574L, (long)l10);
        }
    }

    public String p(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return ((x8)((Object)m44.a("w", (Object)this, (long)-874241209169202107L, (long)l10))).V();
    }

    @Override
    void O(DataOutputStream dataOutputStream, long l10) {
        dataOutputStream.writeByte(((va)((Object)m44.a("m", (long)-1793574981721560766L, (long)l10))).g());
        dataOutputStream.writeShort(((js)((Object)m44.a("w", (Object)this, (long)-543234486562242579L, (long)l10))).E());
    }

    public void J(Object[] objectArray) {
        block8: {
            boolean bl2;
            Object object;
            Set set;
            block9: {
                long l10 = (Long)objectArray[0];
                Set set2 = (Set)objectArray[1];
                set = (Set)objectArray[2];
                Set set3 = (Set)objectArray[3];
                Set set4 = (Set)objectArray[4];
                long l11 = l10 = a ^ l10;
                long l12 = l11 ^ 0x6E48541D2B46L;
                long l13 = l11 ^ 0xE8FABB1C08FL;
                long l14 = l11 ^ 0x31E60E358A34L;
                long l15 = l11 ^ 0x349C7DBEFDEFL;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l14;
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = m44.a("u", (Object)this, (Object)objectArray2, (long)3070298862381239814L, (long)l10);
                objectArray3[0] = l15;
                object = m44.a("j", (Object)objectArray3, (long)3673347826053253220L, (long)l10);
                CallSite callSite = m44.a("j", (long)3304901846564172962L, (long)l10);
                CallSite callSite2 = m44.a("u", (Object)this.l, (Object)new Object[0], (long)2920785740898377535L, (long)l10);
                try {
                    bl2 = ((_v)((Object)callSite2)).n(l12);
                    if (callSite == false) break block8;
                    if (!bl2) break block9;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)n92, (long)3740110397420925307L, (long)l10);
                }
                ArrayList<_f> arrayList = new ArrayList<_f>(object.size());
                Iterator iterator = object.iterator();
                block4: while (iterator.hasNext()) {
                    _v _v2 = (_v)iterator.next();
                    try {
                        Object[] objectArray4 = new Object[2];
                        objectArray4[1] = _v2;
                        objectArray4[0] = l13;
                        arrayList.add((_f)((Object)m44.a("u", (Object)this, (Object)objectArray4, (long)3662419226151313555L, (long)l10)));
                        do {
                            CallSite callSite3 = callSite;
                            if (l10 > 0L) {
                                if (callSite3 == false) break block8;
                                callSite3 = callSite;
                            }
                            if (callSite3 != false) continue block4;
                        } while (l10 < 0L);
                        break;
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)n93, (long)3740110397420925307L, (long)l10);
                    }
                }
                object = arrayList;
            }
            bl2 = set.addAll(object);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

