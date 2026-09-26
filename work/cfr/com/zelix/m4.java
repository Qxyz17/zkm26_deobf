/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.h5;
import com.zelix.l60;
import com.zelix.l6q;
import com.zelix.lke;
import com.zelix.m0;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class m4
extends m0 {
    private boolean I;
    final String U;
    final m0 c;
    private static final long b = prr.a(-8144559803416312340L, -2580140882859824058L, MethodHandles.lookup().lookupClass()).a(112830072294225L);
    private static final long d;

    /*
     * Unable to fully structure code
     */
    void b(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var7_3 = (Map)var1_1[1];
        var5_4 = (h5)var1_1[2];
        var4_5 = (lke)var1_1[3];
        var6_6 = (String)var1_1[4];
        v0 = var2_2 = m4.b ^ var2_2;
        var8_7 = v0 ^ 129337750070413L;
        var10_8 = v0 ^ 75798686405566L;
        var12_9 = v0 ^ 16284414851094L;
        var14_10 = v0 ^ 30442900106280L;
        var16_11 = v0 ^ 82891655468215L;
        var19_12 = m44.a("u", (Object)this, (long)-4947544605483320645L, (long)var2_2).iterator();
        var18_13 = m44.a("k", (long)-4975780240939296066L, (long)var2_2);
        while (var19_12.hasNext()) {
            block26: {
                block27: {
                    block25: {
                        block22: {
                            block24: {
                                block23: {
                                    block21: {
                                        var20_14 = var6_6;
                                        var21_15 = (m4)var19_12.next();
                                        v1 = new Object[1];
                                        v1[0] = var14_10;
                                        var22_16 = m44.a("t", (Object)var21_15, (Object)v1, (long)-6494953574854813855L, (long)var2_2);
                                        try {
                                            v2 = var4_5;
                                            if (var2_2 < 0L || var18_13 != null) break block21;
                                            if (v2 != null) {
                                            }
                                            ** GOTO lbl76
                                        }
                                        catch (n9 v3) {
                                            throw m44.a("k", (Object)v3, (long)-4693770434013058144L, (long)var2_2);
                                        }
                                        v2 = var4_5;
                                    }
                                    try {
                                        v4 = new Object[2];
                                        v4[1] = var22_16;
                                        v4[0] = var16_11;
                                        v5 = m44.a("t", (Object)v2, (Object)v4, (long)-4902961687577324616L, (long)var2_2);
                                        if (var18_13 != null) break block22;
                                        if (v5 != false) {
                                        }
                                        ** GOTO lbl76
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("k", (Object)v6, (long)-4693770434013058144L, (long)var2_2);
                                    }
                                    v7 = new Object[2];
                                    v7[1] = var8_7;
                                    v7[0] = var22_16;
                                    var23_17 = m44.a("t", (Object)var4_5, (Object)v7, (long)-4802340048380092431L, (long)var2_2);
                                    try {
                                        v8 = var23_17;
                                        if (var18_13 != null) break block23;
                                        if (v8 != null) {
                                        }
                                        ** GOTO lbl64
                                    }
                                    catch (n9 v9) {
                                        throw m44.a("k", (Object)v9, (long)-4693770434013058144L, (long)var2_2);
                                    }
                                    var20_14 = var23_17;
                                    try {
                                        v10 = var18_13;
                                        if (var2_2 >= 0L) {
                                            if (v10 == null) break block24;
                                        }
                                        ** GOTO lbl75
lbl64:
                                        // 2 sources

                                        v8 = var22_16;
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("k", (Object)v11, (long)-4693770434013058144L, (long)var2_2);
                                    }
                                }
                                var20_14 = v8;
                            }
                            try {
                                try {
                                    block28: {
                                        if (var2_2 < 0L) break block28;
                                        v10 = var18_13;
lbl75:
                                        // 2 sources

                                        if (v10 == null) break block25;
                                    }
                                    if (var2_2 <= 0L) break block26;
                                    v12 = var5_4;
                                    if (var18_13 != null) break block27;
                                }
                                catch (n9 v13) {
                                    throw m44.a("k", (Object)v13, (long)-4693770434013058144L, (long)var2_2);
                                }
                                v14 = new Object[2];
                                v14[1] = var10_8;
                                v14[0] = var22_16;
                                v5 = m44.a("t", (Object)v12, (Object)v14, (long)-4672194592073500650L, (long)var2_2);
                            }
                            catch (n9 v15) {
                                throw m44.a("k", (Object)v15, (long)-4693770434013058144L, (long)var2_2);
                            }
                        }
                        if (v5 != false) {
                            var20_14 = var22_16;
                        }
                    }
                    v12 = var7_3.put(var22_16, var20_14);
                }
                v16 = new Object[5];
                v16[4] = var20_14;
                v16[3] = var4_5;
                v16[2] = var5_4;
                v16[1] = var7_3;
                v16[0] = var12_9;
                m44.a("t", (Object)var21_15, (Object)v16, (long)-6658950282492858447L, (long)var2_2);
            }
            if (var18_13 == null) continue;
        }
    }

    public String Q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return m44.a("r", (Object)this, (long)6593278803504981241L, (long)l10);
    }

    public m4 R(Object[] objectArray) {
        CallSite callSite;
        long l10;
        long l11;
        block4: {
            block5: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = b ^ l11) ^ 0xECF82C33816L;
                CallSite callSite2 = m44.a("n", (long)7450996789358233387L, (long)l11);
                try {
                    try {
                        callSite = m44.a("p", (Object)this, (long)7378031784996246593L, (long)l11);
                        if (callSite2 != null) break block4;
                        if (m44.a("q", (Object)callSite, (Object)new Object[0], (long)7366461507643220939L, (long)l11) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)7154346829181253173L, (long)l11);
                    }
                    return this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)7154346829181253173L, (long)l11);
                }
            }
            callSite = m44.a("p", (Object)this, (long)7378031784996246593L, (long)l11);
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l10;
        return m44.a("q", (Object)((m4)((Object)callSite)), (Object)objectArray2, (long)6953352626449416268L, (long)l11);
    }

    private void u(Object[] objectArray) {
        block21: {
            String string;
            StringBuilder stringBuilder;
            String string2;
            CallSite callSite;
            long l10;
            l6q l6q2;
            Map map;
            block24: {
                block25: {
                    Object object;
                    Object object2;
                    CallSite callSite2;
                    long l11;
                    block22: {
                        Object object3;
                        long l12;
                        long l13;
                        Set set;
                        ol ol2;
                        l60 l602;
                        lke lke2;
                        h5 h52;
                        block23: {
                            Map map2;
                            long l14;
                            block19: {
                                Map map3;
                                CallSite callSite3;
                                block20: {
                                    Object object4;
                                    block18: {
                                        block17: {
                                            block16: {
                                                h52 = (h5)objectArray[0];
                                                l11 = (Long)objectArray[1];
                                                lke2 = (lke)objectArray[2];
                                                l602 = (l60)objectArray[3];
                                                map = (Map)objectArray[4];
                                                l6q2 = (l6q)objectArray[5];
                                                ol2 = (ol)objectArray[6];
                                                set = (Set)objectArray[7];
                                                long l15 = l11 = b ^ l11;
                                                l14 = l15 ^ 0x57CA83AC1E31L;
                                                long l16 = l15 ^ 0x4AE0BF2A4BFCL;
                                                long l17 = l15 ^ 0x57CA83AC1E31L;
                                                l13 = l15 ^ 0x45238742F71CL;
                                                l12 = l15 ^ 0x782E0330A843L;
                                                l10 = l15 ^ 0x24E7493AFEEDL;
                                                Object[] objectArray2 = new Object[1];
                                                objectArray2[0] = l17;
                                                callSite = m44.a("u", (Object)this, (Object)objectArray2, (long)-7510871302921312904L, (long)l11);
                                                callSite2 = m44.a("j", (long)-8580705010680797017L, (long)l11);
                                                try {
                                                    try {
                                                        Object[] objectArray3 = new Object[1];
                                                        objectArray3[0] = l16;
                                                        object4 = m44.a("u", (Object)this, (Object)objectArray3, (long)-8129849168953152611L, (long)l11);
                                                        if (callSite2 != null) break block16;
                                                        if (object4 == false) break block17;
                                                    }
                                                    catch (n9 n92) {
                                                        throw m44.a("j", (Object)n92, (long)-8303181056879060551L, (long)l11);
                                                    }
                                                    object4 = m44.a("t", (Object)this, (long)-7956482140780621295L, (long)l11);
                                                }
                                                catch (n9 n93) {
                                                    throw m44.a("j", (Object)n93, (long)-8303181056879060551L, (long)l11);
                                                }
                                            }
                                            try {
                                                if (callSite2 != null) break block18;
                                                if (object4 == false) break block17;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("j", (Object)n94, (long)-8303181056879060551L, (long)l11);
                                            }
                                            object4 = true;
                                            break block18;
                                        }
                                        object4 = false;
                                    }
                                    object3 = object4;
                                    try {
                                        try {
                                            map2 = map;
                                            if (l11 <= 0L) break block19;
                                            callSite3 = callSite;
                                            if (callSite2 != null) break block20;
                                            if (map2.containsKey(callSite3)) break block21;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("j", (Object)n95, (long)-8303181056879060551L, (long)l11);
                                        }
                                        map3 = map;
                                        Object[] objectArray4 = new Object[1];
                                        objectArray4[0] = l14;
                                        callSite3 = m44.a("u", (Object)m44.a("t", (Object)this, (long)-8509414561998373939L, (long)l11), (Object)objectArray4, (long)-8606865966688225024L, (long)l11);
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("j", (Object)n96, (long)-8303181056879060551L, (long)l11);
                                    }
                                }
                                map2 = map3.get(callSite3);
                            }
                            object2 = (String)((Object)map2);
                            try {
                                object = object2;
                                if (callSite2 != null) break block22;
                                if (object != null) break block23;
                            }
                            catch (n9 n97) {
                                throw m44.a("j", (Object)n97, (long)-8303181056879060551L, (long)l11);
                            }
                            Object[] objectArray5 = new Object[1];
                            objectArray5[0] = l14;
                            object2 = m44.a("u", (Object)m44.a("t", (Object)this, (long)-8509414561998373939L, (long)l11), (Object)objectArray5, (long)-8606865966688225024L, (long)l11);
                        }
                        Object[] objectArray6 = new Object[1];
                        objectArray6[0] = l12;
                        Object[] objectArray7 = new Object[9];
                        objectArray7[8] = h52;
                        objectArray7[7] = lke2;
                        objectArray7[6] = set;
                        objectArray7[5] = ol2;
                        objectArray7[4] = l6q2;
                        objectArray7[3] = (boolean)object3;
                        objectArray7[2] = (boolean)m44.a("u", (Object)this, (Object)objectArray6, (long)-8159013691956792199L, (long)l11);
                        objectArray7[1] = object2;
                        objectArray7[0] = l13;
                        object = m44.a("u", (Object)l602, (Object)objectArray7, (long)-7991224243666000805L, (long)l11);
                    }
                    string2 = object;
                    try {
                        try {
                            stringBuilder = new StringBuilder();
                            string = object2;
                            if (callSite2 != null) break block24;
                            if (string.length() <= 0) break block25;
                        }
                        catch (n9 n98) {
                            throw m44.a("j", (Object)n98, (long)-8303181056879060551L, (long)l11);
                        }
                        string = (String)object2 + "/";
                        break block24;
                    }
                    catch (n9 n99) {
                        throw m44.a("j", (Object)n99, (long)-8303181056879060551L, (long)l11);
                    }
                }
                string = "";
            }
            String string3 = stringBuilder.append(string).append(string2).toString();
            String string4 = map.put(callSite, string3);
            l6q2.t(string3, callSite, l10);
        }
    }

    public m4(m0 m02, String string, boolean bl2, long l10) {
        block5: {
            m4 m42;
            long l11;
            block4: {
                long l12 = l10 = b ^ l10;
                long l13 = l12 ^ 0x428F0F179024L;
                l11 = l12 ^ 0x4CD919D91BB8L;
                super(l13);
                this.c = m02;
                CallSite callSite = m44.a("h", (long)-916183202791451899L, (long)l10);
                try {
                    try {
                        m42 = this;
                        if (callSite != null) break block4;
                        m42.U = string;
                        if (bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-619514705770978789L, (long)l10);
                    }
                    m42 = this;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-619514705770978789L, (long)l10);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l11;
            objectArray[0] = false;
            m44.a("w", (Object)m42, (Object)objectArray, (long)-867307516291032378L, (long)l10);
        }
    }

    public boolean n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return (boolean)m44.a("w", (Object)m44.a("v", (Object)this, (long)-431720331537446873L, (long)l10), (Object)new Object[0], (long)-406206039114760275L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    void l(Object[] var1_1) {
        block30: {
            block28: {
                block23: {
                    block24: {
                        var3_2 = (h5)var1_1[0];
                        var11_3 = (lke)var1_1[1];
                        var8_4 = (l60)var1_1[2];
                        var10_5 = (Map)var1_1[3];
                        var2_6 = (l6q)var1_1[4];
                        var9_7 = (ol)var1_1[5];
                        var4_8 = (l6q)var1_1[6];
                        var5_9 = (Boolean)var1_1[7];
                        var6_10 = (Long)var1_1[8];
                        v0 = var6_10 = m4.b ^ var6_10;
                        var12_11 = v0 ^ 86457586823617L;
                        v1 = v0 ^ 59476692783323L;
                        var14_12 = (int)(v1 >>> 48);
                        var15_13 = (int)(v1 << 16 >>> 32);
                        var16_14 = (int)(v1 << 48 >>> 48);
                        var17_15 = v0 ^ 97723003663571L;
                        var19_16 = v0 ^ 16284414851094L;
                        var21_17 = v0 ^ 66612511725030L;
                        var23_18 = v0 ^ 10749951964554L;
                        var25_19 = v0 ^ 137407031194298L;
                        var27_20 = v0 ^ 111671002952641L;
                        var29_21 = v0 ^ 14348067731960L;
                        v2 = new Object[1];
                        v2[0] = var23_18;
                        var32_22 = m44.a("m", (Object)v2, (long)-2761056025585016787L, (long)var6_10);
                        v3 = new Object[1];
                        v3[0] = var21_17;
                        var33_23 = var4_8.t((char)var14_12, m44.a("r", (Object)m44.a("s", (Object)this, (long)-4449811700988137446L, (long)var6_10), (Object)v3, (long)-4370410978658782505L, (long)var6_10), var15_13, (short)var16_14);
                        var31_24 = m44.a("m", (long)-4378522351206030480L, (long)var6_10);
                        try {
                            if (var31_24 != null) break block23;
                            if (var33_23 == null) break block24;
                        }
                        catch (n9 v4) {
                            throw m44.a("m", (Object)v4, (long)-4102137636271041938L, (long)var6_10);
                        }
                        var34_25 = 0;
                        while (var34_25 < var33_23.size()) {
                            block25: {
                                block26: {
                                    block27: {
                                        var35_27 = (_f)var33_23.get(var34_25);
                                        try {
                                            try {
                                                try {
                                                    v5 = var31_24;
                                                    if (var6_10 > 0L) {
                                                        if (v5 != null) break block23;
                                                        v5 = var31_24;
                                                    }
                                                    if (var6_10 <= 0L) break block25;
                                                    if (v5 != null) break block26;
                                                }
                                                catch (n9 v6) {
                                                    throw m44.a("m", (Object)v6, (long)-4102137636271041938L, (long)var6_10);
                                                }
                                                v7 = new Object[2];
                                                v7[1] = var17_15;
                                                v7[0] = var35_27;
                                                if (m44.a("r", (Object)var3_2, (Object)v7, (long)-4295815657631973681L, (long)var6_10) == false) break block27;
                                            }
                                            catch (n9 v8) {
                                                throw m44.a("m", (Object)v8, (long)-4102137636271041938L, (long)var6_10);
                                            }
                                            var32_22.add(var35_27.I(var25_19));
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("m", (Object)v9, (long)-4102137636271041938L, (long)var6_10);
                                        }
                                    }
                                    ++var34_25;
                                }
                                v5 = var31_24;
                            }
                            if (v5 == null) continue;
                        }
                    }
                    v10 = new Object[8];
                    v10[7] = var32_22;
                    v10[6] = var9_7;
                    v10[5] = var2_6;
                    v10[4] = var10_5;
                    v10[3] = var8_4;
                    v10[2] = var11_3;
                    v10[1] = var27_20;
                    v10[0] = var3_2;
                    m44.a("l", (Object)this, (Object)v10, (long)-4039454904055828978L, (long)var6_10);
                    if (var6_10 > 0L) {
                        // empty if block
                    }
                }
                var34_26 = (m4[])m44.a("r", (Object)m44.a("s", (Object)this, (long)-4424525767864335499L, (long)var6_10), (Object)new m4[m44.a("s", (Object)this, (long)-4424525767864335499L, (long)var6_10).size()], (long)-4076701949927456751L, (long)var6_10);
                try {
                    block29: {
                        try {
                            try {
                                v11 = var31_24;
                                if (var6_10 >= 0L) {
                                    if (v11 != null) break block28;
                                    if (var5_9) break block29;
                                }
                                ** GOTO lbl126
                            }
                            catch (n9 v12) {
                                throw m44.a("m", (Object)v12, (long)-4102137636271041938L, (long)var6_10);
                            }
                            if (var6_10 < 0L) break block30;
                            if (m44.a("i", (long)-4087800767117729154L, (long)var6_10) != false) {
                            }
                            ** GOTO lbl127
                        }
                        catch (n9 v13) {
                            throw m44.a("m", (Object)v13, (long)-4102137636271041938L, (long)var6_10);
                        }
                    }
                    v14 = new Object[2];
                    v14[1] = var29_21;
                    v14[0] = (int)m4.d;
                    v15 = new Object[3];
                    v15[2] = var12_11;
                    v15[1] = m44.a("m", (Object)v14, (long)-2804536560777552337L, (long)var6_10);
                    v15[0] = m44.a("m", (Object)var34_26, (long)-4401106519826986152L, (long)var6_10);
                    m44.a("m", (Object)v15, (long)-4421167192715467065L, (long)var6_10);
                }
                catch (n9 v16) {
                    throw m44.a("m", (Object)v16, (long)-4102137636271041938L, (long)var6_10);
                }
            }
            try {
                if (var6_10 <= 0L) break block30;
                v11 = var31_24;
lbl126:
                // 2 sources

                if (v11 == null) break block30;
lbl127:
                // 2 sources

                m44.a("m", (Object)var34_26, (long)-4166577202478412505L, (long)var6_10);
            }
            catch (n9 v17) {
                throw m44.a("m", (Object)v17, (long)-4102137636271041938L, (long)var6_10);
            }
        }
        for (var35_28 = 0; var35_28 < var34_26.length; ++var35_28) {
            var36_29 = var34_26[var35_28];
            v18 = new Object[9];
            v18[8] = var19_16;
            v18[7] = var5_9;
            v18[6] = var4_8;
            v18[5] = var9_7;
            v18[4] = var2_6;
            v18[3] = var10_5;
            v18[2] = var8_4;
            v18[1] = var11_3;
            v18[0] = var3_2;
            m44.a("r", (Object)var36_29, (Object)v18, (long)-2658121813302996457L, (long)var6_10);
            if (var31_24 == null) continue;
        }
    }

    @Override
    public boolean W(Object[] objectArray) {
        return false;
    }

    @Override
    public String E(Object[] objectArray) {
        CallSite callSite;
        block15: {
            long l10;
            block16: {
                CallSite callSite2;
                CallSite callSite3;
                block14: {
                    CallSite callSite4;
                    long l11;
                    block12: {
                        block13: {
                            l10 = (Long)objectArray[0];
                            l11 = l10 ^ 0L;
                            callSite3 = m44.a("k", (long)-7576636169839380842L, (long)l10);
                            try {
                                try {
                                    callSite4 = m44.a("u", (Object)this, (long)-7504919746230295044L, (long)l10);
                                    if (callSite3 != null) break block12;
                                    if (callSite4 != null) break block13;
                                }
                                catch (n9 n92) {
                                    throw m44.a("k", (Object)n92, (long)-7857520104071460984L, (long)l10);
                                }
                                callSite2 = null;
                                break block14;
                            }
                            catch (n9 n93) {
                                throw m44.a("k", (Object)n93, (long)-7857520104071460984L, (long)l10);
                            }
                        }
                        callSite4 = m44.a("u", (Object)this, (long)-7504919746230295044L, (long)l10);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    callSite2 = m44.a("t", (Object)callSite4, (Object)objectArray2, (long)-7584322581670779087L, (long)l10);
                }
                CallSite callSite5 = callSite2;
                try {
                    try {
                        try {
                            try {
                                callSite = callSite5;
                                if (callSite3 != null) break block15;
                                if (callSite == null) break block16;
                            }
                            catch (n9 n94) {
                                throw m44.a("k", (Object)n94, (long)-7857520104071460984L, (long)l10);
                            }
                            callSite = callSite5;
                            if (callSite3 != null) break block15;
                        }
                        catch (n9 n95) {
                            throw m44.a("k", (Object)n95, (long)-7857520104071460984L, (long)l10);
                        }
                        if (((String)((Object)callSite)).length() <= 0) break block16;
                    }
                    catch (n9 n96) {
                        throw m44.a("k", (Object)n96, (long)-7857520104071460984L, (long)l10);
                    }
                    return (String)((Object)callSite5) + "/" + (String)((Object)m44.a("u", (Object)this, (long)-7730581144729211954L, (long)l10));
                }
                catch (n9 n97) {
                    throw m44.a("k", (Object)n97, (long)-7857520104071460984L, (long)l10);
                }
            }
            callSite = m44.a("u", (Object)this, (long)-7730581144729211954L, (long)l10);
        }
        return callSite;
    }

    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        m44.a("q", (Object)this, (boolean)true, (long)-8193276479309541938L, (long)l10);
    }

    @Override
    void n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Map map = (Map)objectArray[1];
        long l11 = l10 ^ 0x40E4019A663FL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        CallSite callSite = m44.a("s", (Object)this, (Object)objectArray2, (long)-1168101952135537290L, (long)l10);
        map.put(callSite, this);
    }

    @Override
    void X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        ArrayList arrayList = (ArrayList)objectArray[1];
        long l11 = l10 ^ 0x21824B2C47C2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        CallSite callSite = m44.a("v", (Object)this, (Object)objectArray2, (long)-3587275360209503093L, (long)l10);
        arrayList.add(callSite);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = b ^ 0x314F6A95A122L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -2841100317769091770L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                d = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}

