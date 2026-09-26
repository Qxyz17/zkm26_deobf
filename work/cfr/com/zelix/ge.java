/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ah;
import com.zelix.g9;
import com.zelix.l6l;
import com.zelix.lkp;
import com.zelix.lm7;
import com.zelix.loz;
import com.zelix.lqe;
import com.zelix.m44;
import com.zelix.md;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ge
implements lkp,
loz {
    private boolean G;
    private List E;
    private List O;
    private String U;
    private boolean a;
    private int x;
    private ah v;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long f;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean k(Object[] var1_1) {
        block18: {
            block19: {
                var4_2 = (Boolean)var1_1[0];
                var2_3 = (Long)var1_1[1];
                v0 = var2_3;
                var5_4 = v0 ^ 101747208547237L;
                var7_5 = v0 ^ 0L;
                var9_6 = v0 ^ 11707660690873L;
                var11_7 = m44.a("l", (long)4022236455885607079L, (long)var2_3);
                try {
                    v1 = m44.a("r", (Object)this, (long)3384772058622032201L, (long)var2_3);
                    if (var11_7 == null) break block18;
                    if (v1 != false) break block19;
                }
                catch (NumberFormatException v2) {
                    throw m44.a("l", (Object)v2, (long)3581532805614078252L, (long)var2_3);
                }
                m44.a("p", (Object)this, (boolean)true, (long)3384772058622032201L, (long)var2_3);
                var12_8 = 0;
                while (var12_8 < m44.a("r", (Object)this, (long)3340095089053232837L, (long)var2_3).size()) {
                    block25: {
                        block23: {
                            block24: {
                                block22: {
                                    block21: {
                                        block20: {
                                            var13_9 = 0;
                                            var14_10 = (lkp)m44.a("r", (Object)this, (long)3340095089053232837L, (long)var2_3).get(var12_8);
                                            try {
                                                try {
                                                    try {
                                                        v3 = new Object[2];
                                                        v3[1] = var7_5;
                                                        v3[0] = var4_2;
                                                        v1 = m44.a("s", (Object)var14_10, (Object)v3, (long)3477580809084826625L, (long)var2_3);
                                                        v4 = var11_7;
                                                        if (var2_3 > 0L) {
                                                            if (v4 == null) break block18;
                                                            v4 = var11_7;
                                                        }
                                                        if (v4 == null) break block20;
                                                    }
                                                    catch (NumberFormatException v5) {
                                                        throw m44.a("l", (Object)v5, (long)3581532805614078252L, (long)var2_3);
                                                    }
                                                    if (v1 != false) {
                                                    }
                                                    ** GOTO lbl54
                                                }
                                                catch (NumberFormatException v6) {
                                                    throw m44.a("l", (Object)v6, (long)3581532805614078252L, (long)var2_3);
                                                }
                                                v7 = new Object[1];
                                                v7[0] = var5_4;
                                                v8 = m44.a("s", (Object)var14_10, (Object)v7, (long)3033789447482455744L, (long)var2_3);
                                            }
                                            catch (NumberFormatException v9) {
                                                throw m44.a("l", (Object)v9, (long)3581532805614078252L, (long)var2_3);
                                            }
                                        }
                                        var13_9 = v8;
                                        try {
                                            if (var2_3 < 0L || var11_7 != null) break block21;
lbl54:
                                            // 2 sources

                                            m44.a("p", (Object)this, (boolean)false, (long)3384772058622032201L, (long)var2_3);
                                        }
                                        catch (NumberFormatException v10) {
                                            throw m44.a("l", (Object)v10, (long)3581532805614078252L, (long)var2_3);
                                        }
                                    }
                                    try {
                                        v11 /* !! */  = m44.a("r", (Object)this, (long)3384772058622032201L, (long)var2_3);
                                        if (var2_3 <= 0L || var11_7 == null) break block22;
                                        if (v11 /* !! */  == false) break block23;
                                    }
                                    catch (NumberFormatException v12) {
                                        throw m44.a("l", (Object)v12, (long)3581532805614078252L, (long)var2_3);
                                    }
                                    v11 /* !! */  = (CallSite)var12_8;
                                }
                                try {
                                    if (v11 /* !! */  != false) break block24;
                                    m44.a("p", (Object)this, (int)var13_9, (long)3702076410657776567L, (long)var2_3);
                                    v13 = var11_7;
                                    if (var2_3 <= 0L) break block25;
                                    if (v13 != null) break block23;
                                }
                                catch (NumberFormatException v14) {
                                    throw m44.a("l", (Object)v14, (long)3581532805614078252L, (long)var2_3);
                                }
                            }
                            var15_11 = (String)m44.a("r", (Object)this, (long)3845217978787231963L, (long)var2_3).get(var12_8 - 1);
                            v15 = new Object[4];
                            v15[3] = var15_11;
                            v15[2] = var13_9;
                            v15[1] = (int)m44.a("r", (Object)this, (long)3702076410657776567L, (long)var2_3);
                            v15[0] = var9_6;
                            m44.a("p", (Object)this, (int)m44.a("m", (Object)this, (Object)v15, (long)3101667232343940439L, (long)var2_3), (long)3702076410657776567L, (long)var2_3);
                        }
                        ++var12_8;
                        v13 = var11_7;
                    }
                    if (v13 != null) continue;
                }
            }
            v1 = m44.a("r", (Object)this, (long)3384772058622032201L, (long)var2_3);
        }
        return (boolean)v1;
    }

    @Override
    public void b(Object[] objectArray) {
        block6: {
            long l10 = (Long)objectArray[0];
            long l11 = l10 ^ 0L;
            int n10 = 0;
            CallSite callSite = m44.a("m", (long)-5811687548070229970L, (long)l10);
            block2: while (n10 < m44.a("s", (Object)this, (long)-5272870184820017588L, (long)l10).size()) {
                lkp lkp2 = (lkp)m44.a("s", (Object)this, (long)-5272870184820017588L, (long)l10).get(n10);
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    m44.a("r", (Object)lkp2, (Object)objectArray2, (long)-6298714522431475577L, (long)l10);
                    ++n10;
                    do {
                        CallSite callSite2 = callSite;
                        if (l10 > 0L) {
                            if (callSite2 == null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 != null) continue block2;
                    } while (l10 <= 0L);
                    break;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("m", (Object)numberFormatException, (long)-6251753477436894811L, (long)l10);
                }
            }
            m44.a("q", (Object)this, (boolean)false, (long)-5300659759029689920L, (long)l10);
            m44.a("q", (Object)this, (int)((int)f), (long)-6059297907811894466L, (long)l10);
        }
    }

    private boolean X(Object[] objectArray) {
        boolean bl2;
        block16: {
            block17: {
                boolean bl3;
                block14: {
                    block15: {
                        String string = (String)objectArray[0];
                        long l10 = (Long)objectArray[1];
                        l10 = b ^ l10;
                        CallSite callSite = m44.a("o", (long)-3512005199987611596L, (long)l10);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    bl3 = string.equals("+");
                                                    if (callSite == null) break block14;
                                                    if (bl3) break block15;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw m44.a("o", (Object)numberFormatException, (long)-3952143683682242113L, (long)l10);
                                                }
                                                bl3 = string.equals("-");
                                                if (callSite == null) break block14;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw m44.a("o", (Object)numberFormatException, (long)-3952143683682242113L, (long)l10);
                                            }
                                            if (bl3) break block15;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw m44.a("o", (Object)numberFormatException, (long)-3952143683682242113L, (long)l10);
                                        }
                                        bl3 = string.equals("*");
                                        if (callSite == null) break block14;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw m44.a("o", (Object)numberFormatException, (long)-3952143683682242113L, (long)l10);
                                    }
                                    if (bl3) break block15;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw m44.a("o", (Object)numberFormatException, (long)-3952143683682242113L, (long)l10);
                                }
                                bl2 = string.equals("/");
                                if (callSite == null) break block16;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("o", (Object)numberFormatException, (long)-3952143683682242113L, (long)l10);
                            }
                            if (!bl2) break block17;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw m44.a("o", (Object)numberFormatException, (long)-3952143683682242113L, (long)l10);
                        }
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public boolean m(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 ^ 0L;
                lkp lkp2 = (lkp)m44.a("v", (Object)this, (long)3924326848835450601L, (long)l10).get(0);
                CallSite callSite = m44.a("h", (long)3458129054616914059L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        object = m44.a("w", (Object)lkp2, (Object)objectArray2, (long)3243571081845136993L, (long)l10);
                        if (callSite == null) break block4;
                        if (object == false) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("h", (Object)numberFormatException, (long)2997230966203683072L, (long)l10);
                    }
                    return true;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("h", (Object)numberFormatException, (long)2997230966203683072L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    int n(Object[] objectArray) {
        int n10;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = b ^ l10) ^ 0x245E81677AC5L;
                lkp lkp2 = (lkp)m44.a("v", (Object)this, (long)-4220327091618740751L, (long)l10).get(0);
                CallSite callSite = m44.a("h", (long)-2529370796847989869L, (long)l10);
                try {
                    n10 = lkp2 instanceof g9;
                    if (callSite == null) break block2;
                    if (n10 == 0) break block3;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("h", (Object)numberFormatException, (long)-2702110247914708456L, (long)l10);
                }
                g9 g92 = (g9)lkp2;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l11;
                return (int)m44.a("w", (Object)g92, (Object)objectArray2, (long)-4489546701586018504L, (long)l10);
            }
            n10 = 0;
        }
        return n10;
    }

    @Override
    public boolean s(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 ^ 0L;
                lkp lkp2 = (lkp)m44.a("w", (Object)this, (long)-1957049810362522552L, (long)l10).get(0);
                CallSite callSite = m44.a("i", (long)-190112262786917846L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        object = m44.a("v", (Object)lkp2, (Object)objectArray2, (long)-1955331785578528524L, (long)l10);
                        if (callSite == null) break block4;
                        if (object == false) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("i", (Object)numberFormatException, (long)-344131446075898975L, (long)l10);
                    }
                    return true;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("i", (Object)numberFormatException, (long)-344131446075898975L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    ge(long l10, ah ah2, String string) {
        l10 = b ^ l10;
        m44.a("w", (Object)this, new ArrayList(), (long)-7841495032203062350L, (long)l10);
        m44.a("w", (Object)this, new ArrayList(), (long)-8634532458675681876L, (long)l10);
        m44.a("w", (Object)this, (ah)ah2, (long)-7843975019509901160L, (long)l10);
        m44.a("w", (Object)this, (String)string, (long)-8280184205536859071L, (long)l10);
    }

    public boolean r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return (boolean)m44.a("u", (Object)this, (long)-2225200524721736018L, (long)l10);
    }

    int E(Object[] objectArray) {
        Object object;
        block8: {
            long l10 = (Long)objectArray[0];
            long l11 = l10 = b ^ l10;
            long l12 = l11 ^ 0x1481FE6F67C8L;
            long l13 = l11 ^ 0x480820578C6DL;
            long l14 = l11 ^ 0x42ADC6A369D4L;
            Object object2 = 0;
            int n10 = 1;
            CallSite callSite = m44.a("i", (long)-4918895379058549558L, (long)l10);
            while (n10 < m44.a("w", (Object)this, (long)-6757881307983977816L, (long)l10).size()) {
                CallSite callSite2;
                block6: {
                    block7: {
                        block9: {
                            lkp lkp2 = (lkp)m44.a("w", (Object)this, (long)-6757881307983977816L, (long)l10).get(n10);
                            try {
                                try {
                                    callSite2 = callSite;
                                    if (l10 <= 0L) break block6;
                                    if (callSite2 == null) break block7;
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l13;
                                    objectArray2[0] = false;
                                    object = m44.a("v", (Object)lkp2, (Object)objectArray2, (long)-4886527254883927956L, (long)l10);
                                    if (callSite == null) break block8;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw m44.a("i", (Object)numberFormatException, (long)-4766671990887119551L, (long)l10);
                                }
                                if (object == 0) break block9;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("i", (Object)numberFormatException, (long)-4766671990887119551L, (long)l10);
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l12;
                            CallSite callSite3 = m44.a("v", (Object)lkp2, (Object)objectArray3, (long)-6451574253856572755L, (long)l10);
                            String string = (String)m44.a("w", (Object)this, (long)-5102088644737796938L, (long)l10).get(n10 - 1);
                            Object[] objectArray4 = new Object[4];
                            objectArray4[3] = string;
                            objectArray4[2] = (int)callSite3;
                            objectArray4[1] = object2;
                            objectArray4[0] = l14;
                            object2 = m44.a("h", (Object)this, (Object)objectArray4, (long)-6384382564261179078L, (long)l10);
                        }
                        ++n10;
                    }
                    callSite2 = callSite;
                }
                if (callSite2 != null) continue;
            }
            object = object2;
            if (l10 >= 0L) {
                object = object * -1;
            }
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String Q(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = ge.b ^ var2_2;
        var4_3 = v0 ^ 55040567446580L;
        var6_4 = v0 ^ 2769133130897L;
        var8_5 = v0 ^ 40764700002971L;
        var10_6 = v0 ^ 37124666856485L;
        var12_7 = v0 ^ 115833154772309L;
        var14_8 = v0 ^ 103563922994331L;
        var16_9 = v0 ^ 102619423066277L;
        var18_10 = v0 ^ 85303851562552L;
        var20_11 = v0 ^ 47968924722806L;
        var22_12 = v0 ^ 111399664843788L;
        var24_13 = v0 ^ 47968924722806L;
        v1 = v0 ^ 46677688395687L;
        var26_14 = (int)(v1 >>> 48);
        var27_15 = (int)(v1 << 16 >>> 48);
        var28_16 = (int)(v1 << 32 >>> 32);
        v2 = m44.a("o", (long)5688753324989114756L, (long)var2_2);
        m44.a("s", (Object)this, (boolean)true, (long)6133234469948218878L, (long)var2_2);
        var30_17 = new StringTokenizer((String)m44.a("q", (Object)this, (long)5278982855506012181L, (long)var2_2), (String)ge.a("h", (int)4064, (long)(5182136473154158484L ^ var2_2)), true);
        var29_18 = v2;
        while (var30_17.hasMoreTokens()) {
            block44: {
                block42: {
                    block41: {
                        block45: {
                            block40: {
                                block39: {
                                    block38: {
                                        block36: {
                                            block37: {
                                                block32: {
                                                    block33: {
                                                        block35: {
                                                            block34: {
                                                                block31: {
                                                                    block30: {
                                                                        var31_19 = var30_17.nextToken().trim();
                                                                        if (var2_2 <= 0L) break block30;
                                                                        v3 = new Object[2];
                                                                        v3[1] = var4_3;
                                                                        v3[0] = var31_19;
                                                                        v4 /* !! */  = m44.a("n", (Object)this, (Object)v3, (long)5647453173596818043L, (long)var2_2);
                                                                        if (var29_18 == null) break block30;
                                                                        try {
                                                                            block43: {
                                                                                if (v4 /* !! */  == false) break block31;
                                                                                break block43;
                                                                                catch (NumberFormatException v5) {
                                                                                    throw m44.a("o", (Object)v5, (long)5230773327587799055L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            v4 /* !! */  = (CallSite)m44.a("q", (Object)this, (long)5512314530638758392L, (long)var2_2).add(var31_19);
                                                                        }
                                                                        catch (NumberFormatException v6) {
                                                                            throw m44.a("o", (Object)v6, (long)5230773327587799055L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    v7 = var29_18;
                                                                    if (var2_2 < 0L) break block44;
                                                                    if (v7 != null) break block42;
                                                                }
                                                                var32_20 = null;
                                                                var33_21 = var31_19.indexOf(".");
                                                                try {
                                                                    v8 = new Object[2];
                                                                    v8[1] = var8_5;
                                                                    v8[0] = var31_19;
                                                                    v9 /* !! */  = m44.a("o", (Object)v8, (long)6272168057973420254L, (long)var2_2);
                                                                    v10 = var29_18;
                                                                    if (var2_2 >= 0L) {
                                                                        if (v10 == null) break block32;
                                                                        if (v9 /* !! */  != false) {
                                                                        }
                                                                        break block33;
                                                                    }
                                                                    ** GOTO lbl90
                                                                }
                                                                catch (NumberFormatException v11) {
                                                                    throw m44.a("o", (Object)v11, (long)5230773327587799055L, (long)var2_2);
                                                                }
                                                                var34_22 = new l6l(var22_12, (ah)m44.a("q", (Object)this, (long)6300761152560291020L, (long)var2_2), var31_19);
                                                                v12 = new Object[1];
                                                                v12[0] = var24_13;
                                                                var35_27 = m44.a("p", (Object)var34_22, (Object)v12, (long)5650020141150517449L, (long)var2_2);
                                                                try {
                                                                    v13 = var35_27;
                                                                    if (var29_18 == null) break block34;
                                                                    if (v13 == null) break block35;
                                                                }
                                                                catch (NumberFormatException v14) {
                                                                    throw m44.a("o", (Object)v14, (long)5230773327587799055L, (long)var2_2);
                                                                }
                                                                v13 = var35_27;
                                                            }
                                                            return v13;
                                                        }
                                                        var32_20 = var34_22;
                                                        break block45;
                                                    }
                                                    v9 /* !! */  = (CallSite)var33_21;
                                                }
                                                try {
                                                    v10 = var29_18;
lbl90:
                                                    // 2 sources

                                                    if (var2_2 >= 0L) {
                                                        if (v10 == null) break block36;
                                                        if (v9 /* !! */  == -1) break block37;
                                                    }
                                                    ** GOTO lbl119
                                                }
                                                catch (NumberFormatException v15) {
                                                    throw m44.a("o", (Object)v15, (long)5230773327587799055L, (long)var2_2);
                                                }
                                                var34_23 = var31_19.substring(0, var33_21).trim();
                                                var35_27 = var31_19.substring(var33_21 + 1).trim();
                                                v16 = new Object[2];
                                                v16[1] = var35_27;
                                                v16[0] = var14_8;
                                                var36_28 = m44.a("o", (Object)v16, (long)5614753834299207225L, (long)var2_2);
                                                if (var34_23.equals(ge.a("h", (int)25287, (long)(5926002862834979511L ^ var2_2)))) {
                                                    var32_20 = new g9((short)var26_14, (ah)m44.a("q", (Object)this, (long)6300761152560291020L, (long)var2_2), (int)var36_28, (short)var27_15, var28_16);
                                                } else {
                                                    v17 = new Object[2];
                                                    v17[1] = var6_4;
                                                    v17[0] = var34_23;
                                                    var37_29 = m44.a("p", (Object)m44.a("q", (Object)this, (long)6300761152560291020L, (long)var2_2), (Object)v17, (long)5340154219028119771L, (long)var2_2);
                                                    var32_20 = new lm7((lqe)var37_29, (int)var36_28, var18_10);
                                                }
                                                break block45;
                                            }
                                            v9 /* !! */  = m44.a("o", (char)var31_19.charAt(0), (long)5650092754607515514L, (long)var2_2);
                                        }
                                        try {
                                            v10 = var29_18;
lbl119:
                                            // 2 sources

                                            if (v10 != null) {
                                                if (v9 /* !! */  == false) break block38;
                                            }
                                            ** GOTO lbl127
                                        }
                                        catch (NumberFormatException v18) {
                                            throw m44.a("o", (Object)v18, (long)5230773327587799055L, (long)var2_2);
                                        }
                                        try {
                                            v9 /* !! */  = (CallSite)Integer.parseInt(var31_19);
lbl127:
                                            // 2 sources

                                            var34_24 /* !! */  = v9 /* !! */ ;
                                            var32_20 = new md(var10_6, (int)var34_24 /* !! */ );
                                        }
                                        catch (NumberFormatException var34_25) {
                                            return (String)ge.a("h", (int)11065, (long)(607902110978202444L ^ var2_2)) + (String)m44.a("q", (Object)this, (long)5278982855506012181L, (long)var2_2) + "'";
                                        }
                                    }
                                    v19 = new Object[2];
                                    v19[1] = var12_7;
                                    v19[0] = var31_19;
                                    var34_26 = m44.a("p", (Object)m44.a("q", (Object)this, (long)6300761152560291020L, (long)var2_2), (Object)v19, (long)6040208710683724881L, (long)var2_2);
                                    v20 = new Object[1];
                                    v20[0] = var20_11;
                                    var35_27 = m44.a("p", (Object)var34_26, (Object)v20, (long)6260900406913359525L, (long)var2_2);
                                    try {
                                        v21 = var35_27;
                                        if (var29_18 == null) break block39;
                                        if (v21 == null) break block40;
                                    }
                                    catch (NumberFormatException v22) {
                                        throw m44.a("o", (Object)v22, (long)5230773327587799055L, (long)var2_2);
                                    }
                                    v21 = var35_27;
                                }
                                return v21;
                            }
                            var32_20 = var34_26;
                        }
                        try {
                            try {
                                m44.a("q", (Object)this, (long)6303138928420919270L, (long)var2_2).add(var32_20);
                                v23 /* !! */  = m44.a("q", (Object)this, (long)6303138928420919270L, (long)var2_2).size();
                                if (var2_2 < 0L || var29_18 == null) break block41;
                                if (v23 /* !! */  <= 1) break block42;
                            }
                            catch (NumberFormatException v24) {
                                throw m44.a("o", (Object)v24, (long)5230773327587799055L, (long)var2_2);
                            }
                            v25 = new Object[1];
                            v25[0] = var16_9;
                            v23 /* !! */  = (int)m44.a("p", (Object)var32_20, (Object)v25, (long)5686021159291118374L, (long)var2_2);
                        }
                        catch (NumberFormatException v26) {
                            throw m44.a("o", (Object)v26, (long)5230773327587799055L, (long)var2_2);
                        }
                    }
                    try {
                        if (v23 /* !! */  != 0) {
                            return (String)ge.a("h", (int)23125, (long)(5881243059196013091L ^ var2_2)) + var31_19 + (String)ge.a("h", (int)25512, (long)(5933566498820821983L ^ var2_2)) + (String)m44.a("q", (Object)this, (long)5278982855506012181L, (long)var2_2) + "'";
                        }
                    }
                    catch (NumberFormatException v27) {
                        throw m44.a("o", (Object)v27, (long)5230773327587799055L, (long)var2_2);
                    }
                }
                v7 = var29_18;
            }
            if (v7 != null) continue;
        }
        return null;
    }

    public String d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return m44.a("r", (Object)this, (long)5566877542855945238L, (long)l10);
    }

    @Override
    public boolean t(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = l10 ^ 0L;
                lkp lkp2 = (lkp)m44.a("v", (Object)this, (long)4543578270562353041L, (long)l10).get(0);
                CallSite callSite = m44.a("h", (long)2775822840957895155L, (long)l10);
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        object = m44.a("w", (Object)lkp2, (Object)objectArray2, (long)4455038207810681447L, (long)l10);
                        if (callSite == null) break block4;
                        if (object == false) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("h", (Object)numberFormatException, (long)2368972054227523704L, (long)l10);
                    }
                    return true;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("h", (Object)numberFormatException, (long)2368972054227523704L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    @Override
    public String v(Object[] objectArray) {
        block5: {
            ge ge2;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                long l12 = l11;
                long l13 = l12 ^ 0x1455EBCD07DCL;
                l10 = l12 ^ 0x434D786AEBF2L;
                CallSite callSite = m44.a("i", (long)-6303728162048339982L, (long)l11);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l13;
                m44.a("v", (Object)this, (Object)objectArray2, (long)-6047067548193966356L, (long)l11);
                CallSite callSite2 = callSite;
                try {
                    try {
                        ge2 = this;
                        if (callSite2 == null) break block4;
                        if (m44.a("w", (Object)ge2, (long)-5518163115838653560L, (long)l11) != false) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("i", (Object)numberFormatException, (long)-5845290785628318087L, (long)l11);
                    }
                    ge2 = this;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("i", (Object)numberFormatException, (long)-5845290785628318087L, (long)l11);
                }
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l10;
            return m44.a("h", (Object)ge2, (Object)objectArray3, (long)-5338060917609185776L, (long)l11);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int g(Object[] var1_1) {
        block17: {
            block18: {
                block15: {
                    block16: {
                        block13: {
                            block14: {
                                var2_2 = (Long)var1_1[0];
                                var6_3 = (Integer)var1_1[1];
                                var5_4 = (Integer)var1_1[2];
                                var4_5 = (String)var1_1[3];
                                var2_2 = ge.b ^ var2_2;
                                var7_6 = m44.a("i", (long)-2311269138563467110L, (long)var2_2);
                                try {
                                    try {
                                        v0 = var4_5.equals("+");
                                        if (var7_6 == null) break block13;
                                        if (v0 == 0) break block14;
                                    }
                                    catch (NumberFormatException v1) {
                                        throw m44.a("i", (Object)v1, (long)-2771601270008389359L, (long)var2_2);
                                    }
                                    return var6_3 + var5_4;
                                }
                                catch (NumberFormatException v2) {
                                    throw m44.a("i", (Object)v2, (long)-2771601270008389359L, (long)var2_2);
                                }
                            }
                            v0 = var4_5.equals("-");
                        }
                        try {
                            try {
                                v3 = var7_6;
                                if (var2_2 >= 0L) {
                                    if (v3 == null) break block15;
                                    if (v0 == 0) break block16;
                                }
                                ** GOTO lbl41
                            }
                            catch (NumberFormatException v4) {
                                throw m44.a("i", (Object)v4, (long)-2771601270008389359L, (long)var2_2);
                            }
                            return var6_3 - var5_4;
                        }
                        catch (NumberFormatException v5) {
                            throw m44.a("i", (Object)v5, (long)-2771601270008389359L, (long)var2_2);
                        }
                    }
                    v0 = (int)var4_5.equals("*");
                }
                try {
                    try {
                        v3 = var7_6;
lbl41:
                        // 2 sources

                        if (v3 == null) break block17;
                        if (v0 == 0) break block18;
                    }
                    catch (NumberFormatException v6) {
                        throw m44.a("i", (Object)v6, (long)-2771601270008389359L, (long)var2_2);
                    }
                    return var6_3 * var5_4;
                }
                catch (NumberFormatException v7) {
                    throw m44.a("i", (Object)v7, (long)-2771601270008389359L, (long)var2_2);
                }
            }
            v0 = var6_3 / var5_4;
        }
        return v0;
    }

    @Override
    public int u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (int)m44.a("w", (Object)this, (long)-2826793369414088686L, (long)l10);
    }

    @Override
    public boolean P(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        lkp lkp2 = (lkp)m44.a("t", (Object)this, (long)2295817805204119363L, (long)l10).get(0);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("u", (Object)lkp2, (Object)objectArray2, (long)454181086334069635L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    ge.b = prr.a(-3802885422526644750L, 9091789180246772880L, MethodHandles.lookup().lookupClass()).a(130492724285248L);
                    ge.e = new HashMap<K, V>(13);
                    var5 = ge.b ^ 134634789630971L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[5];
                    var12_4 = 0;
                    var11_5 = "\u00d33\n\u0010\u00be\u00e4\u0080\u00d2\u00b2I`\u00b2M`R\u00c1\u0018\u009b\u00d8\u0003\u00cc\u00f1\u00f0\u00f0;\u0005\u00e9c \u00e0\u000b\f\u0014e\u0083s,\u00f4\u00fb\u0005@p\u00ff\u00e6{^\u00f5\u00d4I\u0003\u00e4o\u00d7\u00a3X\u00fe\u0083\u00a72\u0013\u0006\u009a\u00b2\u00b3\u00e7\u00ba\u00e4L;\u00f9\u00cb\u000e=\u00e5\u009a\u008bI\u00e4\u00bds\u0004W\u00a1\u00dc\u008a\u00cc\u0091\u00e5\u00be\u0084\u0090\u00d8\u00f7\u00ad\u00b4\u0085\u00c7\u00eb\u0086<G9\u00af8\u00a9\u00cd\u00db-7\u00cd\u00fezA\n9\u0017\u0010\u00800R\u0082\u00bcU\u00ab\u00e0\u00aa\u00c0\u008b\u00b1\u0014\u0004f\u00ac:\u008b-`\u00fb@\u00f0\u00d2\u00ac\u001e\u00b86he\u009e[\u00c1\u00a2c\u00c1#";
                    var13_6 = "\u00d33\n\u0010\u00be\u00e4\u0080\u00d2\u00b2I`\u00b2M`R\u00c1\u0018\u009b\u00d8\u0003\u00cc\u00f1\u00f0\u00f0;\u0005\u00e9c \u00e0\u000b\f\u0014e\u0083s,\u00f4\u00fb\u0005@p\u00ff\u00e6{^\u00f5\u00d4I\u0003\u00e4o\u00d7\u00a3X\u00fe\u0083\u00a72\u0013\u0006\u009a\u00b2\u00b3\u00e7\u00ba\u00e4L;\u00f9\u00cb\u000e=\u00e5\u009a\u008bI\u00e4\u00bds\u0004W\u00a1\u00dc\u008a\u00cc\u0091\u00e5\u00be\u0084\u0090\u00d8\u00f7\u00ad\u00b4\u0085\u00c7\u00eb\u0086<G9\u00af8\u00a9\u00cd\u00db-7\u00cd\u00fezA\n9\u0017\u0010\u00800R\u0082\u00bcU\u00ab\u00e0\u00aa\u00c0\u008b\u00b1\u0014\u0004f\u00ac:\u008b-`\u00fb@\u00f0\u00d2\u00ac\u001e\u00b86he\u009e[\u00c1\u00a2c\u00c1#".length();
                    var10_7 = 16;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = ge.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u0090\u00c2\u00e3W\u0087\u00d6*\u001a\u000f\u00ae\u0091\u0011\u00a7t\r, \u00bd\u0086&D\u0085JL\u00a0\u0091\u00fe(\u000f\u00ee\u00db\u00fbi3\u00b3\u00ea\u00d3\u00a8\u0002lBj\f\u009f\u00b6B\u00b8\u00020";
                        var13_6 = "\u0090\u00c2\u00e3W\u0087\u00d6*\u001a\u000f\u00ae\u0091\u0011\u00a7t\r, \u00bd\u0086&D\u0085JL\u00a0\u0091\u00fe(\u000f\u00ee\u00db\u00fbi3\u00b3\u00ea\u00d3\u00a8\u0002lBj\f\u009f\u00b6B\u00b8\u00020".length();
                        var10_7 = 16;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = ge.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            ge.c = var14_3;
            ge.d = new String[5];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 4154680098146909999L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        ge.f = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x289C;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ge", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            ge.d[n11] = ge.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ge.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ge" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ge.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

