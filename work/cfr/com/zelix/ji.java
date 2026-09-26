/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.bg;
import com.zelix.gm;
import com.zelix.gu;
import com.zelix.j9;
import com.zelix.jd;
import com.zelix.js;
import com.zelix.jx;
import com.zelix.lk0;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.up;
import com.zelix.xb;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class ji
extends jx
implements up,
gm {
    bg L;
    int S;
    xb b;
    private static final long c;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] k;
    private static final Integer[] m;
    private static final Map n;

    public void E(Object[] objectArray) {
        block12: {
            ji ji2;
            CallSite callSite;
            long l10;
            long l11;
            Set set;
            Set set2;
            block10: {
                block11: {
                    set2 = (Set)objectArray[0];
                    set = (Set)objectArray[1];
                    Set set3 = (Set)objectArray[2];
                    l11 = (Long)objectArray[3];
                    Set set4 = (Set)objectArray[4];
                    long l12 = l11;
                    long l13 = l12 ^ 0xC4201AA7E81L;
                    l10 = l12 ^ 0x374374F5D3EL;
                    callSite = m44.a("j", (long)3122465035675988522L, (long)l11);
                    try {
                        try {
                            ji2 = this;
                            if (callSite == false) break block10;
                            if (ji2.L == null) break block11;
                        }
                        catch (n9 n92) {
                            throw m44.a("j", (Object)n92, (long)3403787040638171233L, (long)l11);
                        }
                        Object[] objectArray2 = new Object[5];
                        objectArray2[4] = set4;
                        objectArray2[3] = set3;
                        objectArray2[2] = l13;
                        objectArray2[1] = set;
                        objectArray2[0] = set2;
                        m44.a("u", (Object)this.L, (Object)objectArray2, (long)3499016626979359022L, (long)l11);
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)n93, (long)3403787040638171233L, (long)l11);
                    }
                }
                ji2 = this;
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l10;
            CallSite callSite2 = m44.a("u", (Object)m44.a("t", (Object)ji2, (long)3598909097609658737L, (long)l11), (Object)objectArray3, (long)3594744571716654192L, (long)l11);
            try {
                boolean bl2;
                block13: {
                    try {
                        try {
                            bl2 = ((xb)((Object)m44.a("t", (Object)this, (long)3598909097609658737L, (long)l11))).A().equals(ji.b("m", (int)3162, (long)(0x6BA8B73F09C5E30FL ^ l11)));
                            if (callSite == false) break block12;
                            if (!bl2) break block13;
                        }
                        catch (n9 n94) {
                            throw m44.a("j", (Object)n94, (long)3403787040638171233L, (long)l11);
                        }
                        set2.addAll(callSite2);
                        if (callSite != false) break block12;
                    }
                    catch (n9 n95) {
                        throw m44.a("j", (Object)n95, (long)3403787040638171233L, (long)l11);
                    }
                }
                bl2 = set.addAll(callSite2);
            }
            catch (n9 n96) {
                throw m44.a("j", (Object)n96, (long)3403787040638171233L, (long)l11);
            }
        }
    }

    public String H(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = c ^ l10;
        return ((xb)((Object)m44.a("p", (Object)this, (long)3183455761110736045L, (long)l10))).X();
    }

    @Override
    public xb y(Object[] objectArray) {
        xb xb2 = (xb)objectArray[0];
        long l10 = (Long)objectArray[1];
        CallSite callSite = m44.a("p", (Object)this, (long)5428446479306357717L, (long)l10);
        m44.a("r", (Object)this, (xb)xb2, (long)5428446479306357717L, (long)l10);
        return callSite;
    }

    public ji(int n10, to to2, int n11, xb xb2, long l10) {
        l10 = c ^ l10;
        super(n10, to2);
        m44.a("q", (Object)this, (int)n11, (long)7570766579237393106L, (long)l10);
        m44.a("q", (Object)this, (xb)xb2, (long)8288531459324068742L, (long)l10);
    }

    public js[] b(Object[] objectArray) {
        CallSite callSite;
        block6: {
            block5: {
                bg bg2;
                long l10;
                block4: {
                    l10 = (Long)objectArray[0];
                    l10 = c ^ l10;
                    CallSite callSite2 = m44.a("i", (long)-8365997889795665255L, (long)l10);
                    try {
                        try {
                            bg2 = this.L;
                            if (callSite2 == false) break block4;
                            if (bg2 == null) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("i", (Object)n92, (long)-8102092204852094766L, (long)l10);
                        }
                        bg2 = this.L;
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)n93, (long)-8102092204852094766L, (long)l10);
                    }
                }
                callSite = m44.a("v", (Object)bg2, (Object)new Object[0], (long)-8063986589991927388L, (long)l10);
                break block6;
            }
            callSite = null;
        }
        return callSite;
    }

    public String m(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = c ^ l10) ^ 0x366E07DD4A86L;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 32);
        int n12 = (int)(l11 << 48 >>> 48);
        return m44.a("t", (Object)m44.a("u", (Object)this, (long)-6561548423286582160L, (long)l10), (char)((char)n10), (int)n11, (short)((short)n12), (long)-4944003568933623353L, (long)l10);
    }

    int G(Object[] objectArray) {
        ji ji2;
        long l10;
        block4: {
            block5: {
                l10 = (Long)objectArray[0];
                long l11 = (l10 = c ^ l10) ^ 0x12768B367BD5L;
                CallSite callSite = m44.a("i", (long)-4742945752180336439L, (long)l10);
                try {
                    try {
                        ji2 = this;
                        if (callSite != false) break block4;
                        if (ji2.L == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-6588783471839317038L, (long)l10);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    return (int)m44.a("v", (Object)this.L, (Object)objectArray2, (long)-4665557174837412751L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-6588783471839317038L, (long)l10);
                }
            }
            ji2 = this;
        }
        return (int)m44.a("w", (Object)ji2, (long)-6893680944958481514L, (long)l10);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public void Z(Object[] var1_1) {
        block43: {
            block38: {
                block39: {
                    block45: {
                        block35: {
                            block36: {
                                block37: {
                                    block33: {
                                        block34: {
                                            block32: {
                                                block31: {
                                                    var5_2 = (Set)var1_1[0];
                                                    var4_3 = (Set)var1_1[1];
                                                    var2_4 = (Long)var1_1[2];
                                                    var6_5 = (Set)var1_1[3];
                                                    var7_6 = (Set)var1_1[4];
                                                    v0 = var2_4;
                                                    var8_7 = v0 ^ 106390386941352L;
                                                    var10_8 = v0 ^ 52592986195593L;
                                                    var12_9 = v0 ^ 67027877001421L;
                                                    var14_10 = v0 ^ 114829390115521L;
                                                    v1 = v0 ^ 109454147895261L;
                                                    var16_11 = v1 >>> 16;
                                                    var18_12 = (int)(v1 << 48 >>> 48);
                                                    var19_13 = v0 ^ 123233840088121L;
                                                    var21_14 = v0 ^ 125814499056208L;
                                                    v2 = v0 ^ 110025852742022L;
                                                    var23_15 = (int)(v2 >>> 48);
                                                    var24_16 = (int)(v2 << 16 >>> 48);
                                                    var25_17 = (int)(v2 << 32 >>> 32);
                                                    var26_18 = v0 ^ 6092263193924L;
                                                    var28_19 = v0 ^ 22392832589051L;
                                                    var30_20 = m44.a("h", (long)-2900595962250096960L, (long)var2_4);
                                                    try {
                                                        try {
                                                            v3 = this.L;
                                                            if (var30_20 == false) break block31;
                                                            if (v3 == null) break block32;
                                                        }
                                                        catch (n9 v4) {
                                                            throw m44.a("h", (Object)v4, (long)-3182192840847588213L, (long)var2_4);
                                                        }
                                                        v3 = this.L;
                                                    }
                                                    catch (n9 v5) {
                                                        throw m44.a("h", (Object)v5, (long)-3182192840847588213L, (long)var2_4);
                                                    }
                                                }
                                                v6 = new Object[5];
                                                v6[4] = var7_6;
                                                v6[3] = var6_5;
                                                v6[2] = var10_8;
                                                v6[1] = var4_3;
                                                v6[0] = var5_2;
                                                m44.a("w", (Object)v3, (Object)v6, (long)-3704091918601813906L, (long)var2_4);
                                            }
                                            var31_21 = null;
                                            try {
                                                v7 = this.A(var12_9).equals(m44.a("l", (long)-3473318886503313023L, (long)var2_4));
                                                v8 /* !! */  = var30_20;
                                                if (var2_4 > 0L) {
                                                    if (v8 /* !! */  == false) break block33;
                                                    if (!v7) break block34;
                                                }
                                                ** GOTO lbl70
                                            }
                                            catch (n9 v9) {
                                                throw m44.a("h", (Object)v9, (long)-3182192840847588213L, (long)var2_4);
                                            }
                                            v10 = new Object[1];
                                            v10[0] = var26_18;
                                            var31_21 = m44.a("w", (Object)m44.a("v", (Object)this, (long)-3667092286646256229L, (long)var2_4), (Object)v10, (long)-3277576446020060474L, (long)var2_4);
                                            break block45;
                                        }
                                        v7 = this.A(var12_9).equals(m44.a("l", (long)-3667963217596165136L, (long)var2_4));
                                    }
                                    try {
                                        v8 /* !! */  = var30_20;
lbl70:
                                        // 2 sources

                                        if (var2_4 <= 0L) break block35;
                                        if (v8 /* !! */  == false) break block36;
                                        if (!v7) break block37;
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("h", (Object)v11, (long)-3182192840847588213L, (long)var2_4);
                                    }
                                    var31_21 = new ArrayList<E>(1);
                                    var32_22 = js.m(m44.a("v", (Object)this, (long)-3667092286646256229L, (long)var2_4).X(), var16_11, (char)var18_12);
                                    try {
                                        if (var2_4 < 0L || var32_22 == null) ** GOTO lbl93
                                        var31_21.add((_f)var32_22);
                                    }
                                    catch (n9 v12) {
                                        throw m44.a("h", (Object)v12, (long)-3182192840847588213L, (long)var2_4);
                                    }
                                }
                                v7 = false;
                            }
                            v8 /* !! */  = (CallSite)true;
                        }
                        v13 = new String[v8 /* !! */ ];
                        v13[0] = (String)ji.b("m", (int)3548, (long)(9119709198731812455L ^ var2_4)) + (Object)this.A(var12_9) + (String)ji.b("m", (int)19655, (long)(6406579439039930237L ^ var2_4)) + this.L(var19_13) + "'";
                        lk0.t(v7, v13, var28_19);
                    }
                    v14 = new Object[1];
                    v14[0] = var21_14;
                    var32_22 = m44.a("w", (Object)this, (Object)v14, (long)-3383541923960661569L, (long)var2_4);
                    try {
                        v15 = var32_22.z(var14_10);
                        v16 = var30_20;
                        if (var2_4 >= 0L) {
                            if (v16 == false) break block38;
                            if (!v15) break block39;
                        }
                        ** GOTO lbl162
                    }
                    catch (n9 v17) {
                        throw m44.a("h", (Object)v17, (long)-3182192840847588213L, (long)var2_4);
                    }
                    var33_23 = m44.a("w", (Object)var32_22, (Object)new Object[0], (long)-2906720588415249616L, (long)var2_4);
                    var34_24 = new ArrayList<_f>(var31_21.size());
                    block26: for (ArrayList<_f> v18 : var31_21) {
                        do {
                            block42: {
                                block40: {
                                    var36_26 = (_f)v18;
                                    try {
                                        block41: {
                                            try {
                                                try {
                                                    try {
                                                        v15 = var36_26.P((char)var23_15, (short)var24_16, var25_17);
                                                        v19 = var30_20;
                                                        if (var2_4 >= 0L) {
                                                            if (v19 == false) break block38;
                                                            v19 = var30_20;
                                                        }
                                                        if (v19 == false) break block40;
                                                    }
                                                    catch (n9 v20) {
                                                        throw m44.a("h", (Object)v20, (long)-3182192840847588213L, (long)var2_4);
                                                    }
                                                    if (var2_4 <= 0L) break block40;
                                                    if (!v15) break block41;
                                                }
                                                catch (n9 v21) {
                                                    throw m44.a("h", (Object)v21, (long)-3182192840847588213L, (long)var2_4);
                                                }
                                                v22 = new Object[2];
                                                v22[1] = var33_23;
                                                v22[0] = var8_7;
                                                var34_24.add((_f)m44.a("w", (Object)var36_26, (Object)v22, (long)-3509684089029995715L, (long)var2_4));
                                                v23 = var30_20;
                                                if (var2_4 < 0L) break block42;
                                                if (v23 != false) break block40;
                                            }
                                            catch (n9 v24) {
                                                throw m44.a("h", (Object)v24, (long)-3182192840847588213L, (long)var2_4);
                                            }
                                        }
                                        var34_24.add(var36_26);
                                    }
                                    catch (n9 v25) {
                                        throw m44.a("h", (Object)v25, (long)-3182192840847588213L, (long)var2_4);
                                    }
                                }
                                v23 = var30_20;
                            }
                            if (v23 != false) continue block26;
                            v18 = var34_24;
                        } while (var2_4 < 0L);
                    }
                    var31_21 = v18;
                }
                v15 = m44.a("v", (Object)this, (long)-3667092286646256229L, (long)var2_4).A().equals(ji.b("m", (int)9322, (long)(4865231627518064595L ^ var2_4)));
            }
            try {
                block44: {
                    try {
                        try {
                            v16 = var30_20;
lbl162:
                            // 2 sources

                            if (v16 == false) break block43;
                            if (!v15) break block44;
                        }
                        catch (n9 v26) {
                            throw m44.a("h", (Object)v26, (long)-3182192840847588213L, (long)var2_4);
                        }
                        var5_2.addAll(var31_21);
                        if (var30_20 != false) break block43;
                    }
                    catch (n9 v27) {
                        throw m44.a("h", (Object)v27, (long)-3182192840847588213L, (long)var2_4);
                    }
                }
                v15 = var4_3.addAll(var31_21);
            }
            catch (n9 v28) {
                throw m44.a("h", (Object)v28, (long)-3182192840847588213L, (long)var2_4);
            }
        }
    }

    public int j(Object[] objectArray) {
        int n10;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = c ^ l10;
                String string = js.Z(((xb)((Object)m44.a("w", (Object)this, (long)-6853645276346150814L, (long)l10))).X());
                CallSite callSite = m44.a("i", (long)-6589359131388099991L, (long)l10);
                try {
                    try {
                        n10 = string.equals("V");
                        if (callSite != false) break block4;
                        if (n10 == 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-4742361425920890510L, (long)l10);
                    }
                    return 0;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-4742361425920890510L, (long)l10);
                }
            }
            n10 = 1;
        }
        return n10;
    }

    public String Q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = c ^ l10) ^ 0x6E8F50CDBDABL;
        return ji.T((xb)((Object)m44.a("r", (Object)this, (long)785873174889708135L, (long)l10)), l11);
    }

    @Override
    public String z(char c10, int n10, short s10) {
        StringBuilder stringBuilder;
        block8: {
            StringBuilder stringBuilder2;
            block6: {
                long l10;
                long l11 = l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)s10 << 48 >>> 48;
                long l12 = l11 ^ 0L;
                int n11 = (int)(l12 >>> 48);
                int n12 = (int)(l12 << 16 >>> 32);
                int n13 = (int)(l12 << 48 >>> 48);
                long l13 = l11 ^ 0xD80714D2DFL;
                stringBuilder2 = new StringBuilder();
                CallSite callSite = m44.a("m", (long)-1578066152563700483L, (long)l10);
                stringBuilder2.append((char)ji.e("q", (int)17837, (long)(0x3474953950AE41E1L ^ l10)));
                stringBuilder2.append((String)((Object)m44.a("r", (Object)m44.a("s", (Object)this, (long)-1263677410127651082L, (long)l10), (char)((char)n11), (int)n12, (short)((short)n13), (long)-1016291118076140735L, (long)l10)));
                CallSite callSite2 = callSite;
                try {
                    StringBuilder stringBuilder3;
                    block7: {
                        try {
                            try {
                                stringBuilder2.append((char)ji.e("q", (int)28126, (long)(0x317087A142EE993L ^ l10)));
                                stringBuilder3 = stringBuilder2.append((String)((Object)ji.b("m", (int)9953, (long)(0x694B583D16F01634L ^ l10))));
                                if (callSite2 != false) break block6;
                                if (this.L == null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)n92, (long)-1100058561410160666L, (long)l10);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l13;
                            stringBuilder = stringBuilder2.append((String)((Object)m44.a("r", (Object)this.L, (Object)objectArray, (long)-616116511841925456L, (long)l10)));
                            if (c10 < '\u0000') break block8;
                            if (callSite2 == false) break block6;
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)n93, (long)-1100058561410160666L, (long)l10);
                        }
                    }
                    stringBuilder3 = stringBuilder2.append((int)m44.a("s", (Object)this, (long)-837520605974196318L, (long)l10));
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)n94, (long)-1100058561410160666L, (long)l10);
                }
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    public bg T(Object[] objectArray) {
        return this.L;
    }

    public ji(int n10, long l10, xb xb2, jd jd2) {
        long l11 = (l10 = c ^ l10) ^ 0x5D713C5AB59AL;
        super(n10, jd2.l);
        m44.a("r", (Object)this, (xb)xb2, (long)8362610385819485325L, (long)l10);
        this.L = m44.a("q", (Object)jd2, (Object)new Object[0], (long)7557619589769844608L, (long)l10);
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("r", (Object)this, (int)m44.a("q", (Object)this.L, (Object)objectArray, (long)8146962730233279038L, (long)l10), (long)7934206420553176537L, (long)l10);
    }

    @Override
    public boolean e(long l10, gu gu2, Object object, Object object2) {
        long l11 = l10 ^ 0xB1C2A58BC7CL;
        return gu2.K(this, object, l11, object2);
    }

    boolean Y(Object[] objectArray) {
        boolean bl2;
        block10: {
            bg bg2;
            block11: {
                ji ji2;
                block12: {
                    block9: {
                        bg bg3;
                        block8: {
                            long l10 = (Long)objectArray[0];
                            bg2 = (bg)objectArray[1];
                            l10 = c ^ l10;
                            bl2 = false;
                            CallSite callSite = m44.a("o", (long)-7173170110686561641L, (long)l10);
                            try {
                                try {
                                    try {
                                        bg3 = this.L;
                                        if (callSite != false) break block8;
                                        if (bg3 == null) break block9;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("o", (Object)n92, (long)-8732026219248660084L, (long)l10);
                                    }
                                    if (l10 < 0L) break block10;
                                    ji2 = this;
                                    if (callSite != false) break block11;
                                }
                                catch (n9 n93) {
                                    throw m44.a("o", (Object)n93, (long)-8732026219248660084L, (long)l10);
                                }
                                bg3 = ji2.L;
                            }
                            catch (n9 n94) {
                                throw m44.a("o", (Object)n94, (long)-8732026219248660084L, (long)l10);
                            }
                        }
                        if (bg3 == bg2) break block12;
                    }
                    bl2 = true;
                }
                ji2 = this;
            }
            ji2.L = bg2;
        }
        return bl2;
    }

    public j9 v(Object[] objectArray) {
        CallSite callSite;
        block6: {
            block5: {
                bg bg2;
                long l10;
                long l11;
                block4: {
                    l11 = (Long)objectArray[0];
                    l10 = (l11 = c ^ l11) ^ 0x6C70DCF966D0L;
                    CallSite callSite2 = m44.a("h", (long)5512144917987333376L, (long)l11);
                    try {
                        try {
                            bg2 = this.L;
                            if (callSite2 == false) break block4;
                            if (bg2 == null) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)n92, (long)5194486239772254027L, (long)l11);
                        }
                        bg2 = this.L;
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)n93, (long)5194486239772254027L, (long)l11);
                    }
                }
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l10;
                callSite = m44.a("w", (Object)bg2, (Object)objectArray2, (long)5780159549518157466L, (long)l11);
                break block6;
            }
            callSite = null;
        }
        return callSite;
    }

    @Override
    protected void O(DataOutputStream dataOutputStream, long l10) {
        block8: {
            block9: {
                Object object;
                DataOutputStream dataOutputStream2;
                block6: {
                    long l11 = l10;
                    long l12 = l11 ^ 0x22436F673D15L;
                    long l13 = l11 ^ 0x68EC39ED4954L;
                    CallSite callSite = m44.a("i", (long)-509579923954426359L, (long)l10);
                    try {
                        block7: {
                            try {
                                try {
                                    dataOutputStream2 = dataOutputStream;
                                    object = this.A(l13).g();
                                    if (callSite != false) break block6;
                                    dataOutputStream2.writeByte((int)object);
                                    if (this.L == null) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("i", (Object)n92, (long)-2139279767627877102L, (long)l10);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l12;
                                dataOutputStream.writeShort((int)m44.a("v", (Object)this.L, (Object)objectArray, (long)-468184961261028687L, (long)l10));
                                if (l10 < 0L) break block8;
                                if (callSite == false) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("i", (Object)n93, (long)-2139279767627877102L, (long)l10);
                            }
                        }
                        dataOutputStream2 = dataOutputStream;
                        object = m44.a("w", (Object)this, (long)-1831687958796722858L, (long)l10);
                    }
                    catch (n9 n94) {
                        throw m44.a("i", (Object)n94, (long)-2139279767627877102L, (long)l10);
                    }
                }
                dataOutputStream2.writeShort((int)object);
            }
            dataOutputStream.writeShort(((js)((Object)m44.a("w", (Object)this, (long)-251485914855977982L, (long)l10))).E());
        }
    }

    void N(Object[] objectArray) {
        block5: {
            bg bg2;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = c ^ l11) ^ 0x6E25A59A98DCL;
                CallSite callSite = m44.a("m", (long)1793136156639904157L, (long)l11);
                try {
                    try {
                        bg2 = this.L;
                        if (callSite == false) break block4;
                        if (bg2 == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)2056993815284534230L, (long)l11);
                    }
                    bg2 = this.L;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)2056993815284534230L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            m44.a("r", (Object)bg2, (Object)objectArray2, (long)2075983359413866921L, (long)l11);
        }
    }

    public final xb l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = c ^ l10;
        return m44.a("s", (Object)this, (long)-8113618416842719258L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void w(long var1_1, DataOutputStream var3_2, Map var4_3) {
        block19: {
            block18: {
                block16: {
                    block17: {
                        block14: {
                            v0 = var1_1;
                            var5_4 = v0 ^ 71798685869620L;
                            var7_5 = v0 ^ 13072699806325L;
                            var9_6 = m44.a("h", (long)7191396267850401064L, (long)var1_1);
                            try {
                                block15: {
                                    try {
                                        try {
                                            v1 = var3_2;
                                            v2 /* !! */  = this.A(var7_5).g();
                                            if (var9_6 != false) break block14;
                                            v1.writeByte(v2 /* !! */ );
                                            if (this.L == null) break block15;
                                        }
                                        catch (n9 v3) {
                                            throw m44.a("h", (Object)v3, (long)8750110815632338483L, (long)var1_1);
                                        }
                                        v4 = var3_2;
                                        if (var1_1 <= 0L) break block16;
                                        v5 = new Object[1];
                                        v5[0] = var5_4;
                                        v4.writeShort((int)m44.a("w", (Object)this.L, (Object)v5, (long)7107189619247456656L, (long)var1_1));
                                        if (var9_6 == false) break block17;
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("h", (Object)v6, (long)8750110815632338483L, (long)var1_1);
                                    }
                                }
                                v1 = var3_2;
                                v2 /* !! */  = (int)m44.a("v", (Object)this, (long)9058404121480136311L, (long)var1_1);
                            }
                            catch (n9 v7) {
                                throw m44.a("h", (Object)v7, (long)8750110815632338483L, (long)var1_1);
                            }
                        }
                        v1.writeShort(v2 /* !! */ );
                    }
                    v4 = var4_3.get(m44.a("v", (Object)this, (long)7468069802950743843L, (long)var1_1));
                }
                var10_7 = (xb)v4;
                try {
                    try {
                        v8 = var9_6;
                        if (var1_1 < 0L) ** GOTO lbl57
                        if (v8 != false) break block18;
                        if (var10_7 != null) {
                        }
                        ** GOTO lbl58
                    }
                    catch (n9 v9) {
                        throw m44.a("h", (Object)v9, (long)8750110815632338483L, (long)var1_1);
                    }
                    var3_2.writeShort(var10_7.E());
                }
                catch (n9 v10) {
                    throw m44.a("h", (Object)v10, (long)8750110815632338483L, (long)var1_1);
                }
            }
            try {
                if (var1_1 < 0L) break block19;
                v8 = var9_6;
lbl57:
                // 2 sources

                if (v8 == false) break block19;
lbl58:
                // 2 sources

                var3_2.writeShort(m44.a("v", (Object)this, (long)7468069802950743843L, (long)var1_1).E());
            }
            catch (n9 v11) {
                throw m44.a("h", (Object)v11, (long)8750110815632338483L, (long)var1_1);
            }
        }
    }

    public ji(int n10, to to2, long l10, xb xb2, bg bg2) {
        long l11 = (l10 = c ^ l10) ^ 0x623AE7E7EE95L;
        super(n10, to2);
        m44.a("u", (Object)this, (xb)xb2, (long)3387492645839183746L, (long)l10);
        this.L = bg2;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("u", (Object)this, (int)m44.a("v", (Object)bg2, (Object)objectArray, (long)3026678690262804785L, (long)l10), (long)3824904051004231382L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        ji.c = prr.a(-1087223876289712113L, -510676611010076296L, MethodHandles.lookup().lookupClass()).a(168975719377414L);
                        ji.f = new HashMap<K, V>(13);
                        var11 = ji.c ^ 69078680161129L;
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
                        var20_3 = new String[5];
                        var18_4 = 0;
                        var17_5 = "\u00f5|<9\u008d7\u00c7\u00b2a\u0011;\r\u00f5\u00a4\u009fd\u000eC\u00c3\u00d0\u0011Z\u00bew\u00d0\u0086:\u001b/\u00e1\u00bf\u0003\u0010\u00c7\u00a37\u00e5J\u00ed_\u001b+\u00eb\u00d6\u009a\u0014[\u00a6\u00ab\u0010\u00a1\u0092$\u00ec\u00dc^\u00aeB\u0000\u009b\u0080\u0094E\u0016\u00a7\u00c4";
                        var19_6 = "\u00f5|<9\u008d7\u00c7\u00b2a\u0011;\r\u00f5\u00a4\u009fd\u000eC\u00c3\u00d0\u0011Z\u00bew\u00d0\u0086:\u001b/\u00e1\u00bf\u0003\u0010\u00c7\u00a37\u00e5J\u00ed_\u001b+\u00eb\u00d6\u009a\u0014[\u00a6\u00ab\u0010\u00a1\u0092$\u00ec\u00dc^\u00aeB\u0000\u009b\u0080\u0094E\u0016\u00a7\u00c4".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = ji.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "6\u00cd},\u00fb\u0091\u008f1\u0003\u00ec\u00c5\u009d\u0087\u0000\u00b9\u00d7\u0010k\u00f9,%o\u0091\u00fd\u00a3\u00f1\u00eb\u00cc\u00e2\u0018\u00e32\u00a4";
                            var19_6 = "6\u00cd},\u00fb\u0091\u008f1\u0003\u00ec\u00c5\u009d\u0087\u0000\u00b9\u00d7\u0010k\u00f9,%o\u0091\u00fd\u00a3\u00f1\u00eb\u00cc\u00e2\u0018\u00e32\u00a4".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = ji.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
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
                ji.d = var20_3;
                ji.e = new String[5];
                ji.n = new HashMap<K, V>(13);
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
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "\u00d7\u0086\u008c.+d\u00e2)\u00c9\u0099\u00f6f\u00ae\u00f6\u00da6";
                var5_15 = "\u00d7\u0086\u008c.+d\u00e2)\u00c9\u0099\u00f6f\u00ae\u00f6\u00da6".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        ji.k = var6_12;
        ji.m = new Integer[2];
    }

    private static n9 b(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4E74;
        if (e[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ji", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n11].getBytes("ISO-8859-1");
            ji.e[n11] = ji.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ji.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ji" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7AEE;
        if (m[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = k[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])n.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ji", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ji.m[n11] = n12;
        }
        return m[n11];
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ji.e(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ji" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ji.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ji.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

