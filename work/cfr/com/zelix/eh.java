/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.df;
import com.zelix.dv;
import com.zelix.l6q;
import com.zelix.lb6;
import com.zelix.lmy;
import com.zelix.lqw;
import com.zelix.m44;
import com.zelix.mn;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.vi;
import com.zelix.yf;
import com.zelix.yu;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eh {
    private l6q S;
    private ol G;
    private ol m;
    private l6q l;
    private Map h;
    private final lmy P;
    private l6q t;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public eh(short s10, short s11, int n10) {
        long l10;
        long l11 = l10 = ((long)s10 << 48 | (long)s11 << 48 >>> 16 | (long)n10 << 32 >>> 32) ^ a;
        long l12 = l11 ^ 0x7B8063736644L;
        long l13 = l11 ^ 0x2B2F0BCDB7AEL;
        int n11 = (int)(l13 >>> 48);
        int n12 = (int)(l13 << 16 >>> 32);
        int n13 = (int)(l13 << 48 >>> 48);
        long l14 = l11 ^ 0xE7CA0AEF3ECL;
        long l15 = l11 ^ 0x69D0BA810D87L;
        int n14 = (int)(l15 >>> 32);
        int n15 = (int)(l15 << 32 >>> 48);
        int n16 = (int)(l15 << 48 >>> 48);
        m44.a("u", (Object)this, (l6q)new l6q((short)n11, n12, n13), (long)1357445986476394956L, (long)l10);
        Object[] objectArray = new Object[1];
        objectArray[0] = l14;
        m44.a("u", (Object)this, (Map)((Object)m44.a("i", (Object)objectArray, (long)1695758776375473002L, (long)l10)), (long)1318545655021883075L, (long)l10);
        this.P = new lmy(l12);
        m44.a("u", (Object)this, (ol)new ol(n14, (short)n15, (short)n16), (long)639827439091285385L, (long)l10);
        m44.a("u", (Object)this, (ol)new ol(n14, (short)n15, (short)n16), (long)1649742761940183666L, (long)l10);
        m44.a("u", (Object)this, (l6q)new l6q((short)n11, n12, n13), (long)1713162049294121754L, (long)l10);
        m44.a("u", (Object)this, (l6q)new l6q((short)n11, n12, n13), (long)986201658119900732L, (long)l10);
    }

    public void d(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        lqw lqw2 = (lqw)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0xBA13EDA5756L;
        ((l6q)((Object)m44.a("w", (Object)this, (long)2316784480165411644L, (long)l10))).t(string, lqw2, l11);
    }

    public void x(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x5A5EBB0D7C15L;
        ((l6q)((Object)m44.a("t", (Object)this, (long)1041823458387632809L, (long)l10))).t(string, string2, l11);
        ((l6q)((Object)m44.a("t", (Object)this, (long)1449211344613365647L, (long)l10))).t(string2, string, l11);
    }

    public Map j(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        return ((ol)((Object)m44.a("v", (Object)this, (long)7917458582753974408L, (long)l10))).T(string);
    }

    public void B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0xAC99B2FB9C8L;
        long l13 = l11 ^ 0x4451CF5CB1EAL;
        long l14 = l11 ^ 0x22E619C882DEL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-2022731071483119369L, (long)l10), (Object)objectArray2, (long)-561088129026533990L, (long)l10);
        m44.a("t", (Object)this, (long)-2056131368750399496L, (long)l10).clear();
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-2084035487385689843L, (long)l10), (Object)objectArray3, (long)-290398651012207475L, (long)l10);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l14;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-442950860528710478L, (long)l10), (Object)objectArray4, (long)-1946657117842821782L, (long)l10);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l14;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-1738849682016593079L, (long)l10), (Object)objectArray5, (long)-1946657117842821782L, (long)l10);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l12;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-1802263458449339871L, (long)l10), (Object)objectArray6, (long)-561088129026533990L, (long)l10);
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l12;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-246294939778040057L, (long)l10), (Object)objectArray7, (long)-561088129026533990L, (long)l10);
    }

    public void h(Object[] objectArray) {
        String string = (String)objectArray[0];
        Map map = (Map)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x4145ED4AC3D9L;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 48);
        int n12 = (int)(l11 << 32 >>> 32);
        Iterator iterator = map.entrySet().iterator();
        CallSite callSite = m44.a("n", (long)-2284895085321950999L, (long)l10);
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String string2 = (String)((ol)((Object)m44.a("p", (Object)this, (long)-1998929870726719275L, (long)l10))).h((short)n10, (char)n11, string, n12, entry.getKey(), entry.getValue());
            if (callSite != null) continue;
        }
    }

    public void n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        Map map = (Map)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x22AC6491AEC3L;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 48);
        int n12 = (int)(l11 << 32 >>> 32);
        Iterator iterator = map.entrySet().iterator();
        CallSite callSite = m44.a("l", (long)-8264087796725971469L, (long)l10);
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            _f _f2 = (_f)((ol)((Object)m44.a("r", (Object)this, (long)-7540094702224940492L, (long)l10))).h((short)n10, (char)n11, string, n12, entry.getKey(), entry.getValue());
            if (callSite != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean q(Object[] var1_1) {
        block28: {
            block29: {
                block26: {
                    block27: {
                        block25: {
                            block23: {
                                var5_2 = (String)var1_1[0];
                                var2_3 = (String)var1_1[1];
                                var3_4 = (Long)var1_1[2];
                                var6_5 = (String)var1_1[3];
                                var7_6 = (var3_4 = eh.a ^ var3_4) ^ 48919020736271L;
                                var10_7 = var2_3.replace((char)eh.b("m", (int)6820, (long)(343939566894888402L ^ var3_4)), (char)m44.a("h", (long)-2561638187742006025L, (long)var3_4));
                                var9_8 = m44.a("l", (long)-4217558701318779429L, (long)var3_4);
                                var11_9 = new StringBuilder();
                                try {
                                    block24: {
                                        try {
                                            try {
                                                try {
                                                    if (var9_8 == null) break block23;
                                                    if (var5_2 == null) break block24;
                                                }
                                                catch (n9 v0) {
                                                    throw m44.a("l", (Object)v0, (long)-2471551111606499567L, (long)var3_4);
                                                }
                                                v1 /* !! */  = var5_2.length();
                                                if (var3_4 <= 0L || var9_8 == null) break block25;
                                            }
                                            catch (n9 v2) {
                                                throw m44.a("l", (Object)v2, (long)-2471551111606499567L, (long)var3_4);
                                            }
                                            if (v1 /* !! */  == 0) {
                                            }
                                            ** GOTO lbl42
                                        }
                                        catch (n9 v3) {
                                            throw m44.a("l", (Object)v3, (long)-2471551111606499567L, (long)var3_4);
                                        }
                                    }
                                    var11_9.append(var10_7);
                                }
                                catch (n9 v4) {
                                    throw m44.a("l", (Object)v4, (long)-2471551111606499567L, (long)var3_4);
                                }
                            }
                            try {
                                try {
                                    block30: {
                                        if (var3_4 >= 0L) {
                                            if (var9_8 != null) break block26;
                                        }
                                        break block30;
lbl42:
                                        // 2 sources

                                        var11_9.append(var5_2.replace((char)eh.b("m", (int)14658, (long)(5748364491176318519L ^ var3_4)), (char)m44.a("h", (long)-2561638187742006025L, (long)var3_4)));
                                    }
                                    v5 = var11_9;
                                    if (var9_8 == null) break block26;
                                }
                                catch (n9 v6) {
                                    throw m44.a("l", (Object)v6, (long)-2471551111606499567L, (long)var3_4);
                                }
                                v1 /* !! */  = (int)m44.a("s", (Object)v5, (int)(var11_9.length() - 1), (long)-4225629782632208130L, (long)var3_4);
                            }
                            catch (n9 v7) {
                                throw m44.a("l", (Object)v7, (long)-2471551111606499567L, (long)var3_4);
                            }
                        }
                        try {
                            try {
                                v8 = m44.a("h", (long)-2561638187742006025L, (long)var3_4);
                                if (var3_4 > 0L) {
                                    if (v1 /* !! */  == v8) break block27;
                                    v1 /* !! */  = var10_7.charAt(var10_7.length() - 1);
                                    v8 = m44.a("h", (long)-2561638187742006025L, (long)var3_4);
                                }
                                if (v1 /* !! */  == v8) break block27;
                            }
                            catch (n9 v9) {
                                throw m44.a("l", (Object)v9, (long)-2471551111606499567L, (long)var3_4);
                            }
                            var11_9.append((char)m44.a("h", (long)-2561638187742006025L, (long)var3_4));
                        }
                        catch (n9 v10) {
                            throw m44.a("l", (Object)v10, (long)-2471551111606499567L, (long)var3_4);
                        }
                    }
                    v5 = var11_9.append(var10_7);
                }
                var12_10 = "*" + var6_5.replace((char)eh.b("m", (int)14658, (long)(5748364491176318519L ^ var3_4)), (char)m44.a("h", (long)-2561638187742006025L, (long)var3_4));
                try {
                    try {
                        v11 = mn.R(var11_9.toString(), var7_6, var12_10);
                        if (var9_8 == null) break block28;
                        if (!v11) break block29;
                    }
                    catch (n9 v12) {
                        throw m44.a("l", (Object)v12, (long)-2471551111606499567L, (long)var3_4);
                    }
                    return true;
                }
                catch (n9 v13) {
                    throw m44.a("l", (Object)v13, (long)-2471551111606499567L, (long)var3_4);
                }
            }
            v11 = false;
        }
        return v11;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    List j(Object[] objectArray) {
        Object object;
        CallSite callSite;
        CallSite callSite2;
        long l10;
        long l11;
        long l12;
        long l13;
        long l14;
        int n10;
        int n11;
        int n12;
        long l15;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        yf yf2;
        dv dv2;
        long l16;
        block22: {
            l16 = (Long)objectArray[0];
            String string = (String)objectArray[1];
            String string2 = (String)objectArray[2];
            dv2 = (dv)((Object)objectArray[3]);
            yf2 = (yf)objectArray[4];
            long l17 = l16 = a ^ l16;
            long l18 = l17 ^ 0x4618B52AB627L;
            long l19 = l17 ^ 0x2E3E129B24A2L;
            n21 = (int)(l19 >>> 48);
            n20 = (int)(l19 << 16 >>> 32);
            n19 = (int)(l19 << 48 >>> 48);
            long l20 = l17 ^ 0x7E6DE59178CDL;
            n18 = (int)(l20 >>> 48);
            n17 = (int)(l20 << 16 >>> 32);
            n16 = (int)(l20 << 48 >>> 48);
            long l21 = l17 ^ 0x46A5DD086298L;
            n15 = (int)(l21 >>> 32);
            n14 = (int)(l21 << 32 >>> 48);
            n13 = (int)(l21 << 48 >>> 48);
            l15 = l17 ^ 0x1793651F07AL;
            long l22 = l17 ^ 0x75822C9E6DF0L;
            n12 = (int)(l22 >>> 32);
            n11 = (int)(l22 << 32 >>> 48);
            n10 = (int)(l22 << 48 >>> 48);
            l14 = l17 ^ 0x5C67D7939555L;
            l13 = l17 ^ 0x50EBEFD56866L;
            l12 = l17 ^ 0x17F3DA1EDAB9L;
            l11 = l17 ^ 0x11E27C1D7523L;
            l10 = l17 ^ 0x28A1516A92F2L;
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l18;
            objectArray2[1] = string2;
            objectArray2[0] = string;
            callSite2 = m44.a("j", (Object)this, (Object)objectArray2, (long)-714536543418763758L, (long)l16);
            callSite = m44.a("k", (long)-1556155106876693820L, (long)l16);
            try {
                if (callSite2.size() != 0 || string2 == null) break block22;
            }
            catch (IOException iOException) {
                throw m44.a("k", (Object)iOException, (long)-960360992804165618L, (long)l16);
            }
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l18;
            objectArray3[1] = null;
            objectArray3[0] = string;
            callSite2 = m44.a("j", (Object)this, (Object)objectArray3, (long)-714536543418763758L, (long)l16);
        }
        ArrayList<vi> arrayList = new ArrayList<vi>();
        Iterator iterator = callSite2.iterator();
        block16: while (iterator.hasNext()) {
            object = iterator.next();
            while (true) {
                CallSite callSite3;
                block26: {
                    block27: {
                        CallSite callSite4;
                        Object object2;
                        Object object3;
                        Comparable comparable;
                        Object object4;
                        Object object5;
                        boolean bl2;
                        String string;
                        block23: {
                            block24: {
                                string = (String)object;
                                try {
                                    bl2 = ((l6q)((Object)m44.a("u", (Object)this, (long)-1559139003708182202L, (long)l16))).J((short)n21, string, n20, (char)n19);
                                    if (callSite == null) break block23;
                                    if (!bl2) break block24;
                                }
                                catch (IOException iOException) {
                                    throw m44.a("k", (Object)iOException, (long)-960360992804165618L, (long)l16);
                                }
                                object5 = ((l6q)((Object)m44.a("u", (Object)this, (long)-1559139003708182202L, (long)l16))).t((char)n18, string, n17, (short)n16);
                                object4 = object5.iterator();
                                while (object4.hasNext()) {
                                    block25: {
                                        comparable = (lqw)object4.next();
                                        Object[] objectArray4 = new Object[1];
                                        objectArray4[0] = l15;
                                        object3 = m44.a("t", (Object)comparable, (Object)objectArray4, (long)-1173205194395725822L, (long)l16);
                                        object2 = null;
                                        try {
                                            object2 = new yu((String)object3);
                                        }
                                        catch (IOException iOException) {
                                            Object[] objectArray5 = new Object[1];
                                            objectArray5[0] = l13;
                                            Object[] objectArray6 = new Object[3];
                                            objectArray6[2] = (String)((Object)eh.a("l", (int)20045, (long)(0x311671AB275AEDE9L ^ l16))) + (String)object3 + (String)((Object)eh.a("l", (int)9065, (long)(0x2E7C6F1E4A2680C1L ^ l16))) + (String)((Object)m44.a("t", (Object)comparable, (Object)objectArray5, (long)-829869676834708883L, (long)l16)) + (String)((Object)eh.a("l", (int)758, (long)(0x495D4484C486215FL ^ l16))) + (String)((Object)m44.a("t", (Object)iOException, (long)-1565692841980687659L, (long)l16));
                                            objectArray6[1] = l11;
                                            objectArray6[0] = eh.a("l", (int)18219, (long)(0x64C1619A78D76489L ^ l16));
                                            m44.a("t", (Object)yf2, (Object)objectArray6, (long)-1086428093275952852L, (long)l16);
                                            if (callSite != null) continue;
                                            break block25;
                                        }
                                        try {
                                            callSite3 = callSite;
                                            if (l16 < 0L) break block26;
                                            if (callSite3 == null) break block27;
                                        }
                                        catch (IOException iOException) {
                                            throw m44.a("k", (Object)iOException, (long)-960360992804165618L, (long)l16);
                                        }
                                    }
                                    CallSite callSite5 = m44.a("t", (Object)object2, (Object)string, (long)-1599681064428582713L, (long)l16);
                                    sz sz2 = new sz(n15, (short)n14, (char)n13);
                                    lb6 lb62 = new lb6(0);
                                    lb6 lb63 = new lb6(0);
                                    lb6 lb64 = new lb6((int)eh.b("m", (int)23938, (long)(0xEC192E3AD9DDDE9L ^ l16)));
                                    try {
                                        Object[] objectArray7 = new Object[7];
                                        objectArray7[6] = lb64;
                                        objectArray7[5] = lb63;
                                        objectArray7[4] = l14;
                                        objectArray7[3] = lb62;
                                        objectArray7[2] = sz2;
                                        objectArray7[1] = callSite5;
                                        objectArray7[0] = object2;
                                        callSite4 = m44.a("k", (Object)objectArray7, (long)-1108694398938933002L, (long)l16);
                                    }
                                    catch (IOException iOException) {
                                        Object[] objectArray8 = new Object[1];
                                        objectArray8[0] = l13;
                                        Object[] objectArray9 = new Object[3];
                                        objectArray9[2] = (String)((Object)eh.a("l", (int)31501, (long)(0x4ECC9504BC48D8ADL ^ l16))) + ((ZipEntry)((Object)callSite5)).getName() + (String)((Object)eh.a("l", (int)13625, (long)(0x14F754B98E8D1698L ^ l16))) + (String)object3 + (String)((Object)eh.a("l", (int)5795, (long)(0x1D447037A0263505L ^ l16))) + (String)((Object)m44.a("t", (Object)comparable, (Object)objectArray8, (long)-829869676834708883L, (long)l16)) + (String)((Object)eh.a("l", (int)32262, (long)(0x30A8097C93815DA1L ^ l16))) + (String)((Object)m44.a("t", (Object)iOException, (long)-1565692841980687659L, (long)l16));
                                        objectArray9[1] = l11;
                                        objectArray9[0] = eh.a("l", (int)22511, (long)(0x7843C4C64E7F744CL ^ l16));
                                        m44.a("t", (Object)yf2, (Object)objectArray9, (long)-1086428093275952852L, (long)l16);
                                        continue;
                                    }
                                    Object[] objectArray10 = new Object[5];
                                    objectArray10[4] = (int)((short)n10);
                                    objectArray10[3] = (int)((char)n11);
                                    objectArray10[2] = callSite4;
                                    objectArray10[1] = n12;
                                    objectArray10[0] = string;
                                    CallSite callSite6 = m44.a("k", (Object)objectArray10, (long)-1057206177787959109L, (long)l16);
                                    try {
                                        if (l16 >= 0L && callSite6 == dv2) {
                                            Object[] objectArray11 = new Object[3];
                                            objectArray11[2] = l10;
                                            objectArray11[1] = callSite5;
                                            objectArray11[0] = object2;
                                            arrayList.add(new vi(sz2, lb62, lb63, lb64, (String)((Object)m44.a("k", (Object)objectArray11, (long)-1214718218956825533L, (long)l16)), (String)((Object)callSite4)));
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw m44.a("k", (Object)iOException, (long)-960360992804165618L, (long)l16);
                                    }
                                    if (callSite != null) continue;
                                }
                            }
                            object = m44.a("u", (Object)this, (long)-1529494404018588087L, (long)l16);
                            if (l16 <= 0L) continue;
                            bl2 = object.containsKey(string);
                        }
                        if (bl2) {
                            object5 = new sz(n15, (short)n14, (char)n13);
                            object4 = new lb6(0);
                            comparable = new lb6(0);
                            object3 = new lb6((int)eh.b("m", (int)11924, (long)(0x3B680EE4CD632EFCL ^ l16)));
                            try {
                                Object[] objectArray12 = new Object[6];
                                objectArray12[5] = object3;
                                objectArray12[4] = comparable;
                                objectArray12[3] = object4;
                                objectArray12[2] = object5;
                                objectArray12[1] = l12;
                                objectArray12[0] = (File)m44.a("u", (Object)this, (long)-1529494404018588087L, (long)l16).get(string);
                                callSite4 = m44.a("k", (Object)objectArray12, (long)-892795902999366514L, (long)l16);
                                Object[] objectArray13 = new Object[5];
                                objectArray13[4] = (int)((short)n10);
                                objectArray13[3] = (int)((char)n11);
                                objectArray13[2] = callSite4;
                                objectArray13[1] = n12;
                                objectArray13[0] = string;
                                object2 = m44.a("k", (Object)objectArray13, (long)-1057206177787959109L, (long)l16);
                                try {
                                    if (l16 > 0L && object2 == dv2) {
                                        arrayList.add(new vi((sz)object5, (lb6)object4, (lb6)comparable, (lb6)object3, string, (String)((Object)callSite4)));
                                    }
                                }
                                catch (IOException iOException) {
                                    throw m44.a("k", (Object)iOException, (long)-960360992804165618L, (long)l16);
                                }
                            }
                            catch (IOException iOException) {
                                Object[] objectArray14 = new Object[3];
                                objectArray14[2] = (String)((Object)eh.a("l", (int)9868, (long)(0x662547B057B88527L ^ l16))) + string + (String)((Object)eh.a("l", (int)1185, (long)(0x17CF26E4217CA704L ^ l16))) + (String)((Object)m44.a("t", (Object)iOException, (long)-1565692841980687659L, (long)l16));
                                objectArray14[1] = l11;
                                objectArray14[0] = eh.a("l", (int)22511, (long)(0x7843C4C64E7F744CL ^ l16));
                                m44.a("t", (Object)yf2, (Object)objectArray14, (long)-1086428093275952852L, (long)l16);
                            }
                        }
                    }
                    callSite3 = callSite;
                }
                if (callSite3 != null) continue block16;
                object = arrayList;
                if (l16 >= 0L) break block16;
            }
        }
        return object;
    }

    public void p(Object[] objectArray) {
        File file = (File)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("w", (Object)this, (long)4011603021888088867L, (long)l10).put(m44.a("v", (Object)file, (long)3407562575893942833L, (long)l10), file);
    }

    public void b(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        String string3 = (String)objectArray[2];
        long l10 = (Long)objectArray[3];
        _f _f2 = (_f)objectArray[4];
        long l11 = (l10 = a ^ l10) ^ 0x147BF4F626AAL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = _f2;
        objectArray2[3] = string3;
        objectArray2[2] = string2;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        m44.a("s", (Object)m44.a("r", (Object)this, (long)-4347536256142917197L, (long)l10), (Object)objectArray2, (long)-2706659042213994562L, (long)l10);
    }

    public List U(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0xA352449282FL;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 32);
        int n12 = (int)(l11 << 48 >>> 48);
        return ((l6q)((Object)m44.a("w", (Object)this, (long)-4634655715486362766L, (long)l10))).t((char)n10, string, n11, (short)n12);
    }

    public List d(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x29CD610B7027L;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 32);
        int n12 = (int)(l11 << 48 >>> 48);
        return ((l6q)((Object)m44.a("w", (Object)this, (long)-157722509225378212L, (long)l10))).t((char)n10, string, n11, (short)n12);
    }

    public df F(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x7B3190DBF81CL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = string2;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return m44.a("q", (Object)m44.a("p", (Object)this, (long)6390741153637980841L, (long)l10), (Object)objectArray2, (long)5140506033375277797L, (long)l10);
    }

    public Map f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        return ((ol)((Object)m44.a("t", (Object)this, (long)-7983083025614770783L, (long)l10))).T(string);
    }

    private List i(Object[] objectArray) {
        ArrayList arrayList3;
        eh eh2;
        Object[] objectArray2;
        ArrayList arrayList2;
        long l10;
        long l11;
        String string;
        String string2;
        block14: {
            string2 = (String)objectArray[0];
            string = (String)objectArray[1];
            l11 = (Long)objectArray[2];
            long l12 = l11 = a ^ l11;
            l10 = l12 ^ 0x13808E979938L;
            long l13 = l12 ^ 0x31450C01E556L;
            arrayList2 = new ArrayList();
            objectArray2 = m44.a("n", (long)-7790626984162682047L, (long)l11);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l13;
            CallSite callSite = m44.a("q", (Object)m44.a("p", (Object)this, (long)-7793025666196633405L, (long)l11), (Object)objectArray3, (long)-8087761779551294987L, (long)l11);
            while (callSite.hasMoreElements()) {
                block15: {
                    String string3 = (String)callSite.nextElement();
                    try {
                        Object object;
                        try {
                            try {
                                eh2 = this;
                                Object[] objectArray4 = objectArray2;
                                if (l11 > 0L) {
                                    if (objectArray4 == null) break block14;
                                    Object[] objectArray5 = new Object[4];
                                    objectArray5[3] = string2;
                                    objectArray5[2] = l10;
                                    objectArray5[1] = string3;
                                    objectArray4 = objectArray5;
                                    objectArray5[0] = string;
                                }
                                object = m44.a("o", (Object)eh2, (Object)objectArray4, (long)-8358375658453493306L, (long)l11);
                                if (objectArray2 == null) break block15;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)-8419105772501642869L, (long)l11);
                            }
                            if (object == false) break block15;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)-8419105772501642869L, (long)l11);
                        }
                        object = arrayList2.add(string3);
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)n94, (long)-8419105772501642869L, (long)l11);
                    }
                }
                if (objectArray2 != null) continue;
            }
            eh2 = this;
        }
        block11: for (ArrayList arrayList3 : m44.a("p", (Object)eh2, (long)-7835300362329567284L, (long)l11).entrySet()) {
            do {
                block16: {
                    Map.Entry entry = (Map.Entry)((Object)arrayList3);
                    String string4 = (String)entry.getKey();
                    try {
                        Object object;
                        try {
                            Object[] objectArray6 = new Object[4];
                            objectArray6[3] = string2;
                            objectArray6[2] = l10;
                            objectArray6[1] = string4;
                            objectArray6[0] = string;
                            object = m44.a("o", (Object)this, (Object)objectArray6, (long)-8358375658453493306L, (long)l11);
                            if (objectArray2 == null || object == false) break block16;
                        }
                        catch (n9 n95) {
                            throw m44.a("n", (Object)n95, (long)-8419105772501642869L, (long)l11);
                        }
                        object = arrayList2.add(string4);
                    }
                    catch (n9 n96) {
                        throw m44.a("n", (Object)n96, (long)-8419105772501642869L, (long)l11);
                    }
                }
                if (objectArray2 != null) continue block11;
                arrayList3 = arrayList2;
            } while (l11 < 0L);
        }
        return arrayList3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        eh.a = prr.a(8554985633972221641L, 3011976034305100302L, MethodHandles.lookup().lookupClass()).a(15596417917540L);
                        eh.d = new HashMap<K, V>(13);
                        var11 = eh.a ^ 51814346850047L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[11];
                        var18_4 = 0;
                        var17_5 = "\u00b3S\u001dO\u00179w\u00d5\u00d2I\u00c8p\u0018\u0089S\u00110\u0083\u00d6>q?\u00f0\t\r\u009c\u00cc\u0094*\u009a\u009c\u00d5=\u0019\u00afa\u00e2\u00eb\u0090\u00a9\u007f\u00a1\u008eR\u00c5{\u0013\u00e9\u0012p^m\u00cf\u00f4z\u000e\u0085\u0085209t\u00da\u008a\u009f\u0010\u0085|\u00a2\b\u00bd\u00acN\u00b4\u0013\u0096#`\u00a9\u00b6%b\u0010\u00e5[\u00fe\u00e7j\u0014\u00c1\u0015\u0083\u000f-\u00c5\u00af9\u00d0\u001c\u0010\u00dc&\u0088\u0005\u0000\u00be\u00b5\u00bb\u00e7\u00c4Bc\u00d4\u0016\u00fa/(\u008e\u0000\u008f3\u00f8'\u00fb2\u00cf\u0019\u00c5\u00dc\u00d2\u00e1\u00a2m\t_\u0005\u00b30\u0016\t\u00a4x'\u00e6\u00f6dl\u0096\u00ae\u0095\u00d95z\u00da\u00c23%\u0010\u00f4\u00f5$\u0081\u00e2\"\u00c4\u00b6\u00b7\u00ebo\u008eo\u00db\u00d0;\u0010a\u0099I\u00c2\u00a1N\u00a1\u00b1+d!\u00ae\u00bc\u00c7\u00cd\u00dd\u0010W\u00b6\u0087\u00ee'\u00cc\u00b9\u00c5F\u00aa\u00d4m\u009b\u008b&,";
                        var19_6 = "\u00b3S\u001dO\u00179w\u00d5\u00d2I\u00c8p\u0018\u0089S\u00110\u0083\u00d6>q?\u00f0\t\r\u009c\u00cc\u0094*\u009a\u009c\u00d5=\u0019\u00afa\u00e2\u00eb\u0090\u00a9\u007f\u00a1\u008eR\u00c5{\u0013\u00e9\u0012p^m\u00cf\u00f4z\u000e\u0085\u0085209t\u00da\u008a\u009f\u0010\u0085|\u00a2\b\u00bd\u00acN\u00b4\u0013\u0096#`\u00a9\u00b6%b\u0010\u00e5[\u00fe\u00e7j\u0014\u00c1\u0015\u0083\u000f-\u00c5\u00af9\u00d0\u001c\u0010\u00dc&\u0088\u0005\u0000\u00be\u00b5\u00bb\u00e7\u00c4Bc\u00d4\u0016\u00fa/(\u008e\u0000\u008f3\u00f8'\u00fb2\u00cf\u0019\u00c5\u00dc\u00d2\u00e1\u00a2m\t_\u0005\u00b30\u0016\t\u00a4x'\u00e6\u00f6dl\u0096\u00ae\u0095\u00d95z\u00da\u00c23%\u0010\u00f4\u00f5$\u0081\u00e2\"\u00c4\u00b6\u00b7\u00ebo\u008eo\u00db\u00d0;\u0010a\u0099I\u00c2\u00a1N\u00a1\u00b1+d!\u00ae\u00bc\u00c7\u00cd\u00dd\u0010W\u00b6\u0087\u00ee'\u00cc\u00b9\u00c5F\u00aa\u00d4m\u009b\u008b&,".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = eh.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "g\u00e4\b|\u00da\u00bf\u00da\u009eE\u00a6W\u00ce\u001e\u00b0\u00058\u00a2\u0007\u0096\u007f\u0088\u00f5\u0000\u00ccj\u00fb\u0015\f\u00d2a\u00c7 \u00ecs\u00abe\u0011u\u00e4\u00f4@\u00f6[\u00c9\u0096:\u00ac\u0091\u00f8:\u000b\u00f4?\u0095\u008e\u00e8\u0094\u0015\u00bfC\u00f3\u00b9s\u00c9#\u00f2\u00c3\u00aa\u00f4H\u0097\u00b4\u00b5\u0010a\u0081\u0019\u00fcE\u00df\u00c1\u0005\u0095\u00ec\u008c\u0092\u00b9\u00e8q\u00e2=f\u0093(\u0094:\u0000\u00bd\u00bb\u00afK\u00970\u008e\u009e";
                            var19_6 = "g\u00e4\b|\u00da\u00bf\u00da\u009eE\u00a6W\u00ce\u001e\u00b0\u00058\u00a2\u0007\u0096\u007f\u0088\u00f5\u0000\u00ccj\u00fb\u0015\f\u00d2a\u00c7 \u00ecs\u00abe\u0011u\u00e4\u00f4@\u00f6[\u00c9\u0096:\u00ac\u0091\u00f8:\u000b\u00f4?\u0095\u008e\u00e8\u0094\u0015\u00bfC\u00f3\u00b9s\u00c9#\u00f2\u00c3\u00aa\u00f4H\u0097\u00b4\u00b5\u0010a\u0081\u0019\u00fcE\u00df\u00c1\u0005\u0095\u00ec\u008c\u0092\u00b9\u00e8q\u00e2=f\u0093(\u0094:\u0000\u00bd\u00bb\u00afK\u00970\u008e\u009e".length();
                            var16_7 = 40;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = eh.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl51:
                        // 1 sources

                        ** continue;
                    }
                }
                eh.b = var20_3;
                eh.c = new String[11];
                eh.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "ItUC\u00a3_\u00d8\u00f0h\u00a3\u00e7.\u0000\u00a5\u0091Z";
                var5_15 = "ItUC\u00a3_\u00d8\u00f0h\u00a3\u00e7.\u0000\u00a5\u0091Z".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00ac\u00b7\u00006\u00d3\u00c8\u00bf\u00b5 x(\u00a5\u0018\u00f0\u00cf!";
                    var5_15 = "\u00ac\u00b7\u00006\u00d3\u00c8\u00bf\u00b5 x(\u00a5\u0018\u00f0\u00cf!".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl104:
                // 1 sources

                ** continue;
            }
        }
        eh.e = var6_12;
        eh.f = new Integer[4];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(byte[] byArray) {
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4385;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/eh", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            eh.c[n11] = eh.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = eh.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/eh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x604C;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/eh", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eh.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = eh.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/eh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(eh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

