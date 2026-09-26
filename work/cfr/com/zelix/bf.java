/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._f;
import com.zelix._v;
import com.zelix.b4;
import com.zelix.bk;
import com.zelix.cf;
import com.zelix.df;
import com.zelix.f8;
import com.zelix.h1;
import com.zelix.h5;
import com.zelix.kl;
import com.zelix.kr;
import com.zelix.kw;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.l6w;
import com.zelix.lk0;
import com.zelix.m44;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.sh;
import com.zelix.w;
import com.zelix.x8;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bf
extends b4 {
    private static final long b;
    private static final String[] k;
    private static final String[] l;
    private static final Map m;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void s(Object[] var1_1) {
        block39: {
            block40: {
                block38: {
                    block37: {
                        block31: {
                            block36: {
                                block34: {
                                    block35: {
                                        block33: {
                                            block32: {
                                                var17_2 = (Long)var1_1[0];
                                                var8_3 = (l62)var1_1[1];
                                                var2_4 = (l6w)var1_1[2];
                                                var20_5 = (ol)var1_1[3];
                                                var13_6 = (ol)var1_1[4];
                                                var15_7 = (Map)var1_1[5];
                                                var14_8 = (l6q)var1_1[6];
                                                var6_9 = (l6q)var1_1[7];
                                                var3_10 = (Map)var1_1[8];
                                                var10_11 = (Map)var1_1[9];
                                                var4_12 = (String)var1_1[10];
                                                var11_13 = (h5)var1_1[11];
                                                var9_14 = (Map)var1_1[12];
                                                var7_15 = (HashMap)var1_1[13];
                                                var12_16 = (HashMap)var1_1[14];
                                                var16_17 = (df)var1_1[15];
                                                var5_18 = (ol)var1_1[16];
                                                var19_19 = (Map)var1_1[17];
                                                v0 = var17_2 = bf.b ^ var17_2;
                                                var21_20 = v0 ^ 55271325005397L;
                                                v1 = v0 ^ 73040589742956L;
                                                var23_21 = (int)(v1 >>> 48);
                                                var24_22 = (int)(v1 << 16 >>> 48);
                                                var25_23 = (int)(v1 << 32 >>> 32);
                                                var26_24 = v0 ^ 3601267658035L;
                                                var28_25 = v0 ^ 64208883936850L;
                                                var30_26 = v0 ^ 120918841726788L;
                                                var32_27 = v0 ^ 135212412859860L;
                                                var34_28 = v0 ^ 13457606460248L;
                                                var36_29 = v0 ^ 32962012896552L;
                                                var38_30 = v0 ^ 1940400589263L;
                                                var40_31 = v0 ^ 6335235864500L;
                                                var42_32 = v0 ^ 125557244619656L;
                                                var45_33 = this.d(var30_26);
                                                v2 = new Object[1];
                                                v2[0] = var21_20;
                                                var46_34 = m44.a("t", (Object)this, (Object)v2, (long)-4148624902006334079L, (long)var17_2);
                                                var44_35 = m44.a("k", (long)-2764371857839970070L, (long)var17_2);
                                                v3 = new Object[2];
                                                v3[1] = var26_24;
                                                v3[0] = this;
                                                if (m44.a("t", (Object)var11_13, (Object)v3, (long)-4254753999803569247L, (long)var17_2) == false) ** GOTO lbl54
                                                var47_36 = var45_33;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var17_2 <= 0L || var44_35 != false) break block31;
lbl54:
                                                                // 2 sources

                                                                v4 /* !! */  = var10_11;
                                                                if (var17_2 < 0L || var44_35 == false) break block32;
                                                            }
                                                            catch (NumberFormatException v5) {
                                                                throw m44.a("k", (Object)v5, (long)-4586518660954705468L, (long)var17_2);
                                                            }
                                                            if (var17_2 <= 0L) break block32;
                                                            if (v4 /* !! */  != null) {
                                                            }
                                                            ** GOTO lbl78
                                                        }
                                                        catch (NumberFormatException v6) {
                                                            throw m44.a("k", (Object)v6, (long)-4586518660954705468L, (long)var17_2);
                                                        }
                                                        v7 = var10_11.containsKey(this);
                                                        if (var17_2 < 0L || var44_35 == false) break block33;
                                                    }
                                                    catch (NumberFormatException v8) {
                                                        throw m44.a("k", (Object)v8, (long)-4586518660954705468L, (long)var17_2);
                                                    }
                                                    if (v7) {
                                                    }
                                                    ** GOTO lbl78
                                                }
                                                catch (NumberFormatException v9) {
                                                    throw m44.a("k", (Object)v9, (long)-4586518660954705468L, (long)var17_2);
                                                }
                                                var47_36 = (String)var10_11.get(this);
                                                try {
                                                    if (var17_2 <= 0L || var44_35 != false) break block31;
lbl78:
                                                    // 3 sources

                                                    v4 /* !! */  = var19_19;
                                                }
                                                catch (NumberFormatException v10) {
                                                    throw m44.a("k", (Object)v10, (long)-4586518660954705468L, (long)var17_2);
                                                }
                                            }
                                            try {
                                                if (var17_2 <= 0L) break block34;
                                                v11 = this;
                                                if (var44_35 == false) break block35;
                                                v7 = v4 /* !! */ .containsKey(v11);
                                            }
                                            catch (NumberFormatException v12) {
                                                throw m44.a("k", (Object)v12, (long)-4586518660954705468L, (long)var17_2);
                                            }
                                        }
                                        try {
                                            if (!v7) break block36;
                                            v13 = var19_19;
                                            v11 = this;
                                        }
                                        catch (NumberFormatException v14) {
                                            throw m44.a("k", (Object)v14, (long)-4586518660954705468L, (long)var17_2);
                                        }
                                    }
                                    v4 /* !! */  = v13.get(v11);
                                }
                                var47_36 = (String)v4 /* !! */ ;
                                var15_7.put(var47_36, this);
                                var3_10.put(var47_36, this);
                                v15 = new Object[1];
                                v15[0] = var36_29;
                                var6_9.t(m44.a("t", (Object)this, (Object)v15, (long)-2704339658656343102L, (long)var17_2), var47_36, var40_31);
                                if (var17_2 < 0L || var44_35 != false) break block31;
                            }
                            v16 = new Object[1];
                            v16[0] = var36_29;
                            var48_37 = m44.a("t", (Object)this, (Object)v16, (long)-2704339658656343102L, (long)var17_2);
                            v17 = new Object[1];
                            v17[0] = var34_28;
                            v18 = new Object[15];
                            v18[14] = var5_18;
                            v18[13] = var16_17;
                            v18[12] = var7_15;
                            v18[11] = var9_14;
                            v18[10] = (boolean)m44.a("t", (Object)this, (Object)v17, (long)-4285947137443980384L, (long)var17_2);
                            v18[9] = var3_10;
                            v18[8] = var6_9;
                            v18[7] = var14_8;
                            v18[6] = var15_7;
                            v18[5] = var38_30;
                            v18[4] = var48_37;
                            v18[3] = var46_34;
                            v18[2] = var45_33;
                            v18[1] = this;
                            v18[0] = var8_3;
                            var47_36 = m44.a("t", (Object)var2_4, (Object)v18, (long)-4082035984220038057L, (long)var17_2);
                        }
                        try {
                            v19 = var47_36;
                            if (var44_35 == false) break block37;
                            if (v19 != null) break block38;
                        }
                        catch (NumberFormatException v20) {
                            throw m44.a("k", (Object)v20, (long)-4586518660954705468L, (long)var17_2);
                        }
                        v19 = var45_33;
                    }
                    var47_36 = v19;
                }
                var48_37 = new w(var45_33, this.V());
                var49_38 = new w((String)var47_36, this.V());
                var50_39 = (w)var20_5.h((short)var23_21, (char)var24_22, var4_12, var25_23, var48_37, var49_38);
                var51_40 = (w)var13_6.h((short)var23_21, (char)var24_22, var4_12, var25_23, var49_38, var48_37);
                try {
                    try {
                        v21 = var51_40;
                        if (var44_35 == false) break block39;
                        if (v21 == null) break block40;
                    }
                    catch (NumberFormatException v22) {
                        throw m44.a("k", (Object)v22, (long)-4586518660954705468L, (long)var17_2);
                    }
                    lk0.t(false, new String[]{(String)bf.c("y", (int)28209, (long)(1112875924123308763L ^ var17_2)) + cf.a((String)cf.J(var28_25, var4_12, var12_16)) + (String)bf.c("y", (int)25247, (long)(1129227873365876336L ^ var17_2)) + (String)m44.a("t", (Object)var48_37, (Object)new Object[0], (long)-4549130756573622122L, (long)var17_2) + (String)bf.c("y", (int)18651, (long)(3398800324302337084L ^ var17_2)) + (String)m44.a("t", (Object)var51_40, (Object)new Object[0], (long)-4549130756573622122L, (long)var17_2) + (String)bf.c("y", (int)1024, (long)(8721430954897946852L ^ var17_2)) + (String)m44.a("t", (Object)var49_38, (Object)new Object[0], (long)-4549130756573622122L, (long)var17_2) + (String)bf.c("y", (int)14466, (long)(766859024937387108L ^ var17_2))}, var42_32);
                }
                catch (NumberFormatException v23) {
                    throw m44.a("k", (Object)v23, (long)-4586518660954705468L, (long)var17_2);
                }
            }
            v21 = var7_15.put(this, var47_36);
        }
        var52_41 = v21;
        try {
            if (var17_2 >= 0L && !var47_36.equals(var45_33)) {
                v24 = new Object[2];
                v24[1] = var47_36;
                v24[0] = var32_27;
                m44.a("t", (Object)this, (Object)v24, (long)-4578358026091835615L, (long)var17_2);
            }
        }
        catch (NumberFormatException v25) {
            throw m44.a("k", (Object)v25, (long)-4586518660954705468L, (long)var17_2);
        }
    }

    bf(_4 _42, h1 h12, l6q l6q2, l6q l6q3, long l10, l6q l6q4, l6q l6q5, l6q l6q6, l6q l6q7, l6q l6q8, PrintWriter printWriter, f8 f82) {
        block13: {
            Object object;
            bf bf2;
            long l11;
            block11: {
                block12: {
                    block10: {
                        long l12 = l10 = b ^ l10;
                        long l13 = l12 ^ 0x4C27B9EE5FFBL;
                        long l14 = l12 ^ 0x60BF9DEBD805L;
                        long l15 = l12 ^ 0x57897474224CL;
                        l11 = l12 ^ 0x5C08486F78CL;
                        long l16 = l12 ^ 0x7CE4150C5BAEL;
                        CallSite callSite = m44.a("m", (long)5139883976595420700L, (long)l10);
                        super(_42, h12, l6q2, printWriter, l13);
                        CallSite callSite2 = callSite;
                        this.T = new kw[this.G];
                        int n10 = 0;
                        block6: while (n10 < this.T.length) {
                            try {
                                Object[] objectArray = new Object[14];
                                objectArray[13] = f82;
                                objectArray[12] = null;
                                objectArray[11] = l16;
                                objectArray[10] = printWriter;
                                objectArray[9] = null;
                                objectArray[8] = l6q8;
                                objectArray[7] = l6q7;
                                objectArray[6] = l6q6;
                                objectArray[5] = l6q5;
                                objectArray[4] = l6q4;
                                objectArray[3] = l6q3;
                                objectArray[2] = l6q2;
                                objectArray[1] = h12;
                                objectArray[0] = this;
                                this.T[n10] = m44.a("m", (Object)objectArray, (long)4729808789718405598L, (long)l10);
                                ++n10;
                                do {
                                    CallSite callSite3 = callSite2;
                                    if (l10 > 0L) {
                                        if (callSite3 == false) break block10;
                                        callSite3 = callSite2;
                                    }
                                    if (callSite3 != false) continue block6;
                                } while (l10 <= 0L);
                                break;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("m", (Object)numberFormatException, (long)6822701490872102706L, (long)l10);
                            }
                        }
                        try {
                            try {
                                bf2 = this;
                                object = callSite2;
                                if (l10 < 0L) break block11;
                                if (object == false) break block12;
                                if (m44.a("m", bf2.V(), (boolean)true, (long)l14, (long)5035100219117887709L, (long)l10) != null) break block10;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("m", (Object)numberFormatException, (long)6822701490872102706L, (long)l10);
                            }
                            printWriter.println((String)((Object)bf.c("y", (int)30211, (long)(0xBD1ECE890D25410L ^ l10))) + this.f(l15) + (String)((Object)bf.c("y", (int)1697, (long)(0x73CF7813C80C24BEL ^ l10))) + (String)((Object)bf.c("y", (int)12914, (long)(0x53D82DD10F2A1068L ^ l10))));
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l11;
                            objectArray[0] = false;
                            m44.a("r", (Object)this, (Object)objectArray, (long)6746065121124752796L, (long)l10);
                            if (callSite2 != false) break block13;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw m44.a("m", (Object)numberFormatException, (long)6822701490872102706L, (long)l10);
                        }
                    }
                    bf2 = this;
                }
                object = true;
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l11;
            objectArray[0] = (boolean)object;
            m44.a("r", (Object)bf2, (Object)objectArray, (long)6746065121124752796L, (long)l10);
        }
    }

    public boolean g(Object[] objectArray) {
        return this.A.V().equals("J");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean K(Object[] var1_1) {
        block19: {
            block23: {
                var2_2 = (Long)var1_1[0];
                var2_2 = bf.b ^ var2_2;
                var5_3 = null;
                var4_4 = m44.a("n", (long)4280625001443707439L, (long)var2_2);
                var6_5 = new kw[this.T.length - 1];
                var7_6 = 0;
                var8_7 = 0;
                while (var8_7 < this.T.length) {
                    block21: {
                        block22: {
                            block20: {
                                try {
                                    try {
                                        v0 = this.T[var8_7];
                                        while (true) {
                                            v1 = v0 instanceof kl;
                                            v2 /* !! */  = var4_4;
                                            if (var2_2 > 0L) {
                                                if (v2 /* !! */  == false) break block19;
                                                v2 /* !! */  = var4_4;
                                            }
                                            if (var2_2 >= 0L) {
                                                if (v2 /* !! */  == false) break block20;
                                            }
                                            ** GOTO lbl43
                                            break;
                                        }
                                    }
                                    catch (NumberFormatException v3) {
                                        throw m44.a("n", (Object)v3, (long)2493945428382438145L, (long)var2_2);
                                    }
                                    if (v1) {
                                    }
                                    ** GOTO lbl35
                                }
                                catch (NumberFormatException v4) {
                                    throw m44.a("n", (Object)v4, (long)2493945428382438145L, (long)var2_2);
                                }
                                var5_3 = (kl)this.T[var8_7];
                                try {
                                    v5 /* !! */  = var4_4;
                                    if (var2_2 < 0L) break block21;
                                    if (v5 /* !! */  != false) break block22;
lbl35:
                                    // 2 sources

                                    v5 /* !! */  = (CallSite)var7_6;
                                }
                                catch (NumberFormatException v6) {
                                    throw m44.a("n", (Object)v6, (long)2493945428382438145L, (long)var2_2);
                                }
                            }
                            try {
                                if (var2_2 < 0L) break block21;
                                v2 /* !! */  = (CallSite)var6_5.length;
lbl43:
                                // 2 sources

                                if (v5 /* !! */  < v2 /* !! */ ) {
                                    var6_5[var7_6++] = this.T[var8_7];
                                }
                            }
                            catch (NumberFormatException v7) {
                                throw m44.a("n", (Object)v7, (long)2493945428382438145L, (long)var2_2);
                            }
                        }
                        ++var8_7;
                        v5 /* !! */  = var4_4;
                    }
                    if (v5 /* !! */  != false) continue;
                }
                try {
                    if (var2_2 > 0L) {
                        v0 = var5_3;
                        if (var2_2 < 0L) ** continue;
                        if (v0 == null) break block23;
                        this.T = var6_5;
                        this.G = this.T.length;
                    }
                    return true;
                }
                catch (NumberFormatException v8) {
                    throw m44.a("n", (Object)v8, (long)2493945428382438145L, (long)var2_2);
                }
            }
            v1 = false;
        }
        return v1;
    }

    @Override
    public boolean J() {
        return true;
    }

    public _f r(Object[] objectArray) {
        block3: {
            String string;
            long l10;
            block2: {
                long l11 = (Long)objectArray[0];
                long l12 = l11 = b ^ l11;
                long l13 = l12 ^ 0x7CABCB313D7L;
                l10 = l12 ^ 0x19CB65B7C72BL;
                String string2 = _v.H(this.V(), l13);
                CallSite callSite = m44.a("o", (long)8666761444053167265L, (long)l11);
                try {
                    string = string2;
                    if (callSite != false) break block2;
                    if (string == null) break block3;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("o", (Object)numberFormatException, (long)8783538956685510776L, (long)l11);
                }
                string = string2;
            }
            return l62.B(string, l10);
        }
        return null;
    }

    public _f V() {
        return (_f)this.H();
    }

    @Override
    public _v G(long l10) {
        return this.V();
    }

    @Override
    public boolean r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.A.V().equals(bf.c("y", (int)24432, (long)(0x55EC8A45C618F6CFL ^ l10)));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void d(Object[] var1_1) {
        block38: {
            block37: {
                block35: {
                    block36: {
                        block39: {
                            block29: {
                                var2_2 = (Integer)var1_1[0];
                                var3_3 = (Long)var1_1[1];
                                v0 = var3_3 = bf.b ^ var3_3;
                                var5_4 = v0 ^ 71175492633128L;
                                var7_5 = v0 ^ 48961094636596L;
                                v1 = v0 ^ 100805357461907L;
                                var9_6 = (int)(v1 >>> 48);
                                var10_7 = (int)(v1 << 16 >>> 32);
                                var11_8 = (int)(v1 << 48 >>> 48);
                                var12_9 = v0 ^ 43517189475808L;
                                var14_10 = m44.a("i", (long)450609511560204967L, (long)var3_3);
                                if (var2_2 != 1) break block38;
                                var15_11 = new ArrayList<kw>(this.T.length);
                                var16_12 = 0;
                                while (var16_12 < this.T.length) {
                                    block34: {
                                        block32: {
                                            block33: {
                                                block30: {
                                                    block31: {
                                                        try {
                                                            try {
                                                                v2 /* !! */  = this.T[var16_12] instanceof bk;
                                                                v3 /* !! */  = var14_10;
                                                                if (var3_3 < 0L) ** GOTO lbl89
                                                                if (v3 /* !! */  != false) break block29;
                                                                v4 = var14_10;
                                                                if (var3_3 >= 0L) {
                                                                    if (v4 != false) break block30;
                                                                }
                                                                ** GOTO lbl42
                                                            }
                                                            catch (NumberFormatException v5) {
                                                                throw m44.a("i", (Object)v5, (long)568299417550583422L, (long)var3_3);
                                                            }
                                                            if (v2 /* !! */  == 0) break block31;
                                                        }
                                                        catch (NumberFormatException v6) {
                                                            throw m44.a("i", (Object)v6, (long)568299417550583422L, (long)var3_3);
                                                        }
                                                        if (var3_3 >= 0L) break block32;
                                                    }
                                                    v7 = this.T[var16_12] instanceof kr;
                                                }
                                                try {
                                                    v4 = var14_10;
lbl42:
                                                    // 2 sources

                                                    if (v4 != false) break block32;
                                                    if (v7) {
                                                    }
                                                    ** GOTO lbl74
                                                }
                                                catch (NumberFormatException v8) {
                                                    throw m44.a("i", (Object)v8, (long)568299417550583422L, (long)var3_3);
                                                }
                                                var17_14 = (kr)this.T[var16_12];
                                                try {
                                                    try {
                                                        v9 = new Object[1];
                                                        v9[0] = var7_5;
                                                        m44.a("v", (Object)var17_14, (Object)v9, (long)326696432252584542L, (long)var3_3);
                                                        v10 = new Object[3];
                                                        v10[2] = (int)((short)var11_8);
                                                        v10[1] = var10_7;
                                                        v10[0] = (int)((char)var9_6);
                                                        v11 /* !! */  = m44.a("v", (Object)var17_14, (Object)v10, (long)146565115450417626L, (long)var3_3);
                                                        if (var14_10 != false || v11 /* !! */  != false) break block33;
                                                    }
                                                    catch (NumberFormatException v12) {
                                                        throw m44.a("i", (Object)v12, (long)568299417550583422L, (long)var3_3);
                                                    }
                                                    v11 /* !! */  = (CallSite)var15_11.add(this.T[var16_12]);
                                                }
                                                catch (NumberFormatException v13) {
                                                    throw m44.a("i", (Object)v13, (long)568299417550583422L, (long)var3_3);
                                                }
                                            }
                                            try {
                                                v14 = var14_10;
                                                if (var3_3 < 0L) break block34;
                                                if (v14 == false) break block32;
lbl74:
                                                // 2 sources

                                                v7 = var15_11.add(this.T[var16_12]);
                                            }
                                            catch (NumberFormatException v15) {
                                                throw m44.a("i", (Object)v15, (long)568299417550583422L, (long)var3_3);
                                            }
                                        }
                                        ++var16_12;
                                        v14 = var14_10;
                                    }
                                    if (v14 == false) continue;
                                }
                                v16 = var15_11;
                                if (var3_3 <= 0L) break block39;
                                v2 /* !! */  = v16.size();
                            }
                            try {
                                v3 /* !! */  = var14_10;
lbl89:
                                // 2 sources

                                if (var3_3 >= 0L) {
                                    if (v3 /* !! */  != false) break block35;
                                    v3 /* !! */  = (CallSite)this.T.length;
                                }
                                if (v2 /* !! */  >= v3 /* !! */ ) break block36;
                            }
                            catch (NumberFormatException v17) {
                                throw m44.a("i", (Object)v17, (long)568299417550583422L, (long)var3_3);
                            }
                            v16 = var15_11;
                        }
                        var16_13 = new kw[v16.size()];
                        this.T = var15_11.toArray(var16_13);
                        this.G = this.T.length;
                    }
                    try {
                        v18 = this;
                        if (var14_10 != false) break block37;
                        v19 = new Object[1];
                        v19[0] = var5_4;
                        v2 /* !! */  = (int)m44.a("v", (Object)v18, (Object)v19, (long)2282315180578660463L, (long)var3_3);
                    }
                    catch (NumberFormatException v20) {
                        throw m44.a("i", (Object)v20, (long)568299417550583422L, (long)var3_3);
                    }
                }
                if (v2 /* !! */  == 0) break block38;
                v18 = this;
            }
            v21 = new Object[2];
            v21[1] = false;
            v21[0] = var12_9;
            m44.a("v", (Object)v18, (Object)v21, (long)344109155294623316L, (long)var3_3);
        }
    }

    /*
     * Exception decompiling
     */
    public boolean Y(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    bf(_v var1_1, x8 var2_2, x8 var3_3, kw[] var4_4, long var5_5, int var7_6) {
        var8_7 = (var5_5 = bf.b ^ var5_5) ^ 114939363926422L;
        super(var1_1, var2_2, var8_7, var3_3, var4_4, var7_6);
        var11_8 = 0;
        var10_9 = m44.a("h", (long)8424491033454904737L, (long)var5_5);
        while (var11_8 < var4_4.length) {
            m44.a("w", (Object)var4_4[var11_8], (Object)new Object[]{this}, (long)8553628973562990720L, (long)var5_5);
            ++var11_8;
lbl9:
            // 2 sources

            ** while (var10_9 == false)
lbl10:
            // 1 sources

        }
lbl11:
        // 2 sources

        if (var5_5 < 0L) ** GOTO lbl9
    }

    /*
     * Exception decompiling
     */
    @Override
    kl D(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void m(Object[] var1_1) {
        block17: {
            block18: {
                block19: {
                    block24: {
                        block20: {
                            block21: {
                                var6_2 = (String)var1_1[0];
                                var2_3 = (String)var1_1[1];
                                var7_4 = (Long)var1_1[2];
                                var4_5 = (ol)var1_1[3];
                                var5_6 = (_f)var1_1[4];
                                var3_7 = (sh)var1_1[5];
                                v0 = var7_4 = bf.b ^ var7_4;
                                v1 = v0 ^ 114728214864502L;
                                var9_8 = (int)(v1 >>> 48);
                                var10_9 = (int)(v1 << 16 >>> 48);
                                var11_10 = (int)(v1 << 32 >>> 32);
                                var12_11 = v0 ^ 3547817834391L;
                                var14_12 = v0 ^ 78957412243038L;
                                var16_13 = v0 ^ 88853206512846L;
                                var18_14 = v0 ^ 59261477902961L;
                                var20_15 = v0 ^ 90886924812130L;
                                var23_16 = this.h(var12_11);
                                var24_17 = this.d(var14_12);
                                var22_18 = m44.a("i", (long)1781402656561261040L, (long)var7_4);
                                var25_19 = var24_17.substring(var6_2.length());
                                var26_20 = var2_3 + var25_19;
                                try {
                                    v2 = var3_7;
                                    if (var22_18 == false) break block17;
                                    v3 = new Object[3];
                                    v3[2] = var26_20;
                                    v3[1] = var23_16;
                                    v4 = v3;
                                    v3[0] = var20_15;
                                    v5 = 2172757548028106696L;
                                    v6 = var7_4;
                                    if (var7_4 < 0L) break block18;
                                    if (m44.a("v", (Object)v2, (Object)v4, (long)v5, (long)v6) == false) break block19;
                                }
                                catch (NumberFormatException v7) {
                                    throw m44.a("i", (Object)v7, (long)90990781111857374L, (long)var7_4);
                                }
                                var27_21 = new StringBuffer();
                                try {
                                    v8 = var25_19;
                                    if (var22_18 == false) break block20;
                                    if (v8.length() <= 0) break block21;
                                }
                                catch (NumberFormatException v9) {
                                    throw m44.a("i", (Object)v9, (long)90990781111857374L, (long)var7_4);
                                }
                                var28_22 = var25_19.length() - 1;
                                while (var28_22 >= 0) {
                                    block22: {
                                        block25: {
                                            block23: {
                                                block26: {
                                                    var29_24 = var25_19.charAt(var28_22);
                                                    v10 = var22_18;
                                                    if (var7_4 < 0L) ** GOTO lbl58
                                                    if (v10 == false) break block17;
                                                    v10 = var22_18;
lbl58:
                                                    // 2 sources

                                                    if (var7_4 <= 0L) break block22;
                                                    if (v10 == false) break block25;
                                                    break block26;
                                                    catch (NumberFormatException v11) {
                                                        throw m44.a("i", (Object)v11, (long)90990781111857374L, (long)var7_4);
                                                    }
                                                }
                                                try {
                                                    block27: {
                                                        if (m44.a("i", (char)var29_24, (long)2100754486464934964L, (long)var7_4) == false) break block23;
                                                        break block27;
                                                        catch (NumberFormatException v12) {
                                                            throw m44.a("i", (Object)v12, (long)90990781111857374L, (long)var7_4);
                                                        }
                                                    }
                                                    m44.a("v", (Object)var27_21, (int)0, (char)var29_24, (long)2242927019340154539L, (long)var7_4);
                                                }
                                                catch (NumberFormatException v13) {
                                                    throw m44.a("i", (Object)v13, (long)90990781111857374L, (long)var7_4);
                                                }
                                            }
                                            --var28_22;
                                        }
                                        v10 = var22_18;
                                    }
                                    if (v10 != false) continue;
                                }
                            }
                            if (var7_4 <= 0L) break block17;
                            v8 = var26_20.substring(0, var26_20.length() - m44.a("v", (Object)var27_21, (long)1824291041149463661L, (long)var7_4));
                        }
                        var28_23 = v8;
                        var29_24 = '\uffffffff';
                        try {
                            v14 = m44.a("v", (Object)var27_21, (long)1824291041149463661L, (long)var7_4);
                            if (var22_18 != false) {
                                if (v14 <= 0) break block24;
                            }
                            ** GOTO lbl109
                        }
                        catch (NumberFormatException v15) {
                            throw m44.a("i", (Object)v15, (long)90990781111857374L, (long)var7_4);
                        }
                        try {
                            var29_24 = Integer.parseInt(var27_21.toString());
                        }
                        catch (NumberFormatException var30_25) {
                            // empty catch block
                        }
                    }
                    do {
                        var26_20 = var28_23 + ++var29_24;
                        v16 = new Object[3];
                        v16[2] = var26_20;
                        v16[1] = var23_16;
                        v16[0] = var20_15;
                        v14 = m44.a("v", (Object)var3_7, (Object)v16, (long)2172757548028106696L, (long)var7_4);
lbl109:
                        // 2 sources

                    } while (v14 != false);
                }
                v17 = new Object[2];
                v17[1] = var26_20;
                v17[0] = var16_13;
                m44.a("v", (Object)this, (Object)v17, (long)102542205681733179L, (long)var7_4);
                v18 = var3_7;
                v19 = new Object[4];
                v19[3] = var24_17;
                v19[2] = this;
                v19[1] = var18_14;
                v4 = v19;
                v19[0] = var5_6;
                v5 = 546204816689181596L;
                v6 = var7_4;
            }
            m44.a("v", (Object)v18, (Object)v4, (long)v5, (long)v6);
            v2 = var4_5.h((short)var9_8, (char)var10_9, var23_16, var11_10, var24_17, var26_20);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static String s(Object[] var0) {
        block36: {
            block35: {
                block26: {
                    block27: {
                        block28: {
                            block31: {
                                block30: {
                                    block29: {
                                        block33: {
                                            block34: {
                                                block32: {
                                                    var3_1 = (String)var0[0];
                                                    var1_2 = (Long)var0[1];
                                                    var4_3 = (var1_2 = bf.b ^ var1_2) ^ 125799366631903L;
                                                    var6_4 = m44.a("m", (long)-2887741611953454325L, (long)var1_2);
                                                    var8_5 = var3_1.lastIndexOf("/");
                                                    if (var8_5 == -1) break block32;
                                                    var7_6 = var3_1.substring(var8_5 + 1);
                                                    if (var1_2 < 0L) break block33;
                                                    if (var6_4 == false) break block34;
                                                }
                                                var7_6 = var3_1;
                                            }
                                            v0 = new Object[4];
                                            v0[3] = bf.c("y", (int)18045, (long)(8561524667748871301L ^ var1_2));
                                            v0[2] = var4_3;
                                            v0[1] = bf.c("y", (int)13767, (long)(7913505359417745212L ^ var1_2));
                                            v0[0] = var7_6;
                                            var7_6 = m44.a("m", (Object)v0, (long)-3476598748049650156L, (long)var1_2);
                                        }
                                        var9_7 = new StringBuilder();
                                        var10_8 = m44.a("m", (char)var7_6.charAt(0), (long)-3474063799893429867L, (long)var1_2);
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v1 = var6_4;
                                                        if (var1_2 <= 0L) break block26;
                                                        if (v1 != false) break block27;
                                                        if (var10_8 == bf.e("y", (int)6953, (long)(150144217251027270L ^ var1_2))) break block28;
                                                    }
                                                    catch (NumberFormatException v2) {
                                                        throw m44.a("m", (Object)v2, (long)-3004096714023229486L, (long)var1_2);
                                                    }
                                                    v3 = var10_8;
                                                    v4 = bf.e("y", (int)5401, (long)(1689157500115064692L ^ var1_2));
                                                    v5 = var6_4;
                                                    if (var1_2 > 0L) {
                                                        if (v5 != false) break block29;
                                                    }
                                                    ** GOTO lbl58
                                                }
                                                catch (NumberFormatException v6) {
                                                    throw m44.a("m", (Object)v6, (long)-3004096714023229486L, (long)var1_2);
                                                }
                                                if (v3 == v4) break block28;
                                            }
                                            catch (NumberFormatException v7) {
                                                throw m44.a("m", (Object)v7, (long)-3004096714023229486L, (long)var1_2);
                                            }
                                            v3 = var10_8;
                                            v4 = bf.e("y", (int)19896, (long)(6758351887675314134L ^ var1_2));
                                        }
                                        catch (NumberFormatException v8) {
                                            throw m44.a("m", (Object)v8, (long)-3004096714023229486L, (long)var1_2);
                                        }
                                    }
                                    try {
                                        try {
                                            v5 = var6_4;
lbl58:
                                            // 2 sources

                                            if (var1_2 >= 0L) {
                                                if (v5 != false) break block30;
                                                if (v3 == v4) break block28;
                                            }
                                            ** GOTO lbl74
                                        }
                                        catch (NumberFormatException v9) {
                                            throw m44.a("m", (Object)v9, (long)-3004096714023229486L, (long)var1_2);
                                        }
                                        v3 = var10_8;
                                        v4 = bf.e("y", (int)15293, (long)(187241166554118612L ^ var1_2));
                                    }
                                    catch (NumberFormatException v10) {
                                        throw m44.a("m", (Object)v10, (long)-3004096714023229486L, (long)var1_2);
                                    }
                                }
                                try {
                                    try {
                                        v5 = var6_4;
lbl74:
                                        // 2 sources

                                        if (v5 != false) break block31;
                                        if (v3 == v4) break block28;
                                    }
                                    catch (NumberFormatException v11) {
                                        throw m44.a("m", (Object)v11, (long)-3004096714023229486L, (long)var1_2);
                                    }
                                    v3 = var10_8;
                                    v4 = bf.e("y", (int)26372, (long)(8482237837042673000L ^ var1_2));
                                }
                                catch (NumberFormatException v12) {
                                    throw m44.a("m", (Object)v12, (long)-3004096714023229486L, (long)var1_2);
                                }
                            }
                            if (v3 != v4) break block35;
                        }
                        var9_7 = var9_7.append((String)bf.c("y", (int)8874, (long)(6221480700404369495L ^ var1_2)));
                    }
                    v1 = var6_4;
                }
                if (v1 == false) break block36;
            }
            var9_7 = var9_7.append("a");
        }
        var9_7.append((char)var10_8 + var7_6.substring(1));
        return var9_7.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        bf.b = prr.a(-6901020571230870213L, -4679226270385738576L, MethodHandles.lookup().lookupClass()).a(178376536254706L);
                        bf.m = new HashMap<K, V>(13);
                        var11 = bf.b ^ 16267333541052L;
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
                        var20_3 = new String[12];
                        var18_4 = 0;
                        var17_5 = "\u00a4\u00e9\u00c0\u00c4=\u0082A\u0095\u001a5\u00fa3\u00d3?\u00e3V8_\u0006\u00dfL\u00e8\u00eess\u00da\u0097,\u0000Zc\u00ee\u009c\u00d7?\u00afZ$\u00ce\u0097\u00a1\u008f\u00ebt\u00fa\u00f8\u00bd\u00d7\u00aa\u001asa\u009d\u0094Y>\u00c0\u00b2q|\u000f\u0001\u00d50\u0086\u00e7\u00da\u00ddu\u00d8\u00c3\u00aeq\u0010\u00e8\u00c9x4\u008dJH\u00d84\u0011v;\u001b;\u00c4\u00ac\u0010t\u00da\f\u00e56\u0080\u00adC\u00f2\u007f\u00d6\u00d6.\u00bft\u00f1\u0010\u00c7\u00fe4\u00f68\u00d7\u00fa\u00a2\u0080\u00e0Wd\u00fd_Y\u00f0(\u0012\u00b4\u00e8\u001a!\u0080\u0090\u008f\b\u00ea\u00c3O\u0017\u007fJ\u00d7}{\u00b0)\u0012\u008f\u008f\u0088)V\u00e6C\u00ff\\V\u0086\u00ee\u0016\u00fe`\u00f5y\u00c4\u0085\u0010v\u001f\u007f\u0097eD\u00aa\u00ac7\u0015\u0086#\u00c8\u00c2\u00cd=0\u00aa\u0096\u00cb\fC\u00f9gM\u00e1N\u00be\u001bF\u0083-$l\u00c1\u009e\u00b8\u007f\u0096\u00d0\u008e\u0018Bk\u00ff\u008bvYV\u00bdc?\u00fdg\u00fd\u00dd\u009b6}7\u00f6\u0014\u00d2\u00fcQ\u0010\u008eY\u00d7\u0006\u0014aqN\u0085cd_\u00e6\u0007\\3\u00180\u00ca\u00a6\u0003,\u00e4.\u00ad:z9\u00ee\u00d5<+|>\u00842\u0003\u00854Xg";
                        var19_6 = "\u00a4\u00e9\u00c0\u00c4=\u0082A\u0095\u001a5\u00fa3\u00d3?\u00e3V8_\u0006\u00dfL\u00e8\u00eess\u00da\u0097,\u0000Zc\u00ee\u009c\u00d7?\u00afZ$\u00ce\u0097\u00a1\u008f\u00ebt\u00fa\u00f8\u00bd\u00d7\u00aa\u001asa\u009d\u0094Y>\u00c0\u00b2q|\u000f\u0001\u00d50\u0086\u00e7\u00da\u00ddu\u00d8\u00c3\u00aeq\u0010\u00e8\u00c9x4\u008dJH\u00d84\u0011v;\u001b;\u00c4\u00ac\u0010t\u00da\f\u00e56\u0080\u00adC\u00f2\u007f\u00d6\u00d6.\u00bft\u00f1\u0010\u00c7\u00fe4\u00f68\u00d7\u00fa\u00a2\u0080\u00e0Wd\u00fd_Y\u00f0(\u0012\u00b4\u00e8\u001a!\u0080\u0090\u008f\b\u00ea\u00c3O\u0017\u007fJ\u00d7}{\u00b0)\u0012\u008f\u008f\u0088)V\u00e6C\u00ff\\V\u0086\u00ee\u0016\u00fe`\u00f5y\u00c4\u0085\u0010v\u001f\u007f\u0097eD\u00aa\u00ac7\u0015\u0086#\u00c8\u00c2\u00cd=0\u00aa\u0096\u00cb\fC\u00f9gM\u00e1N\u00be\u001bF\u0083-$l\u00c1\u009e\u00b8\u007f\u0096\u00d0\u008e\u0018Bk\u00ff\u008bvYV\u00bdc?\u00fdg\u00fd\u00dd\u009b6}7\u00f6\u0014\u00d2\u00fcQ\u0010\u008eY\u00d7\u0006\u0014aqN\u0085cd_\u00e6\u0007\\3\u00180\u00ca\u00a6\u0003,\u00e4.\u00ad:z9\u00ee\u00d5<+|>\u00842\u0003\u00854Xg".length();
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
                            var20_3[var18_4++] = bf.d(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "N K-\u00d9\u007fF\u009eEX\u008d\u00b3\u00ae\u0090\u0011r\u0010t\u00e2\u0013E\u00a4\u0019\u000f\u008fE4yt\u007f<\\B";
                            var19_6 = "N K-\u00d9\u007fF\u009eEX\u008d\u00b3\u00ae\u0090\u0011r\u0010t\u00e2\u0013E\u00a4\u0019\u000f\u008fE4yt\u007f<\\B".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = bf.d(var21_9).intern();
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
                bf.k = var20_3;
                bf.l = new String[12];
                bf.q = new HashMap<K, V>(13);
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
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "\u000b<Iw_t\u00da\u00a9\u007f\u001b\u00bc\u00c0\u00d7J\u0019LB\u00bc\u008b\u00bc\u0095\u00cd\u00c2\u00f1";
                var5_15 = "\u000b<Iw_t\u00da\u00a9\u007f\u001b\u00bc\u00c0\u00d7J\u0019LB\u00bc\u008b\u00bc\u0095\u00cd\u00c2\u00f1".length();
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
                    var4_14 = "'\u0016\u001b?\u00a5PP\u00f0\u008a].\u00cd\u00d7s\u00bbr";
                    var5_15 = "'\u0016\u001b?\u00a5PP\u00f0\u008a].\u00cd\u00d7s\u00bbr".length();
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
        bf.o = var6_12;
        bf.p = new Integer[5];
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String d(byte[] byArray) {
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

    private static String c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7651;
        if (l[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])m.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bf", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n11].getBytes("ISO-8859-1");
            bf.l[n11] = bf.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return l[n11];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = bf.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/bf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5EC7;
        if (p[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = o[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    q.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bf", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bf.p[n11] = n12;
        }
        return p[n11];
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = bf.e(n10, l10);
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
            throw new RuntimeException("com/zelix/bf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bf.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bf.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

