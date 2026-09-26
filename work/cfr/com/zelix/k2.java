/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._6;
import com.zelix._u;
import com.zelix._v;
import com.zelix.b1;
import com.zelix.eo;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.jf;
import com.zelix.kx;
import com.zelix.l6q;
import com.zelix.loe;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.up;
import com.zelix.xb;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class k2
extends kx
implements up,
eo {
    private b1 m;
    private jf a;
    private xb C;
    private static final long c;
    private static final String[] d;
    private static final String[] g;
    private static final Map i;

    /*
     * Unable to fully structure code
     */
    @Override
    protected void c(Object[] var1_1) {
        block16: {
            block15: {
                block13: {
                    block14: {
                        block12: {
                            var3_2 = (Long)var1_1[0];
                            var2_3 = (DataOutputStream)var1_1[1];
                            var5_4 = var3_2 ^ 0L;
                            v0 = m44.a("i", (long)716282175763740856L, (long)var3_2);
                            v1 = new Object[2];
                            v1[1] = var2_3;
                            v1[0] = var5_4;
                            super.c(v1);
                            var7_5 = v0;
                            try {
                                try {
                                    if (var7_5 == false) break block12;
                                    if (m44.a("w", (Object)this, (long)1198408428474194551L, (long)var3_2) != false) {
                                    }
                                    ** GOTO lbl47
                                }
                                catch (n9 v2) {
                                    throw m44.a("i", (Object)v2, (long)1595133719063704522L, (long)var3_2);
                                }
                                var2_3.writeShort(m44.a("w", (Object)this, (long)1587833232825740908L, (long)var3_2).E());
                            }
                            catch (n9 v3) {
                                throw m44.a("i", (Object)v3, (long)1595133719063704522L, (long)var3_2);
                            }
                        }
                        try {
                            try {
                                v4 = var2_3;
                                v5 = m44.a("w", (Object)this, (long)1082973931734848934L, (long)var3_2);
                                if (var7_5 == false) break block13;
                                if (v5 != null) break block14;
                            }
                            catch (n9 v6) {
                                throw m44.a("i", (Object)v6, (long)1595133719063704522L, (long)var3_2);
                            }
                            v7 = 0;
                            break block15;
                        }
                        catch (n9 v8) {
                            throw m44.a("i", (Object)v8, (long)1595133719063704522L, (long)var3_2);
                        }
                    }
                    v5 = m44.a("w", (Object)this, (long)1082973931734848934L, (long)var3_2);
                }
                v7 = v5.E();
            }
            try {
                v4.writeShort(v7);
                if (var3_2 < 0L || var7_5 != false) break block16;
lbl47:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var3_2));
            }
            catch (n9 v9) {
                throw m44.a("i", (Object)v9, (long)1595133719063704522L, (long)var3_2);
            }
        }
    }

    @Override
    public xb y(Object[] objectArray) {
        xb xb2 = (xb)objectArray[0];
        long l10 = (Long)objectArray[1];
        CallSite callSite = m44.a("p", (Object)this, (long)5649823430751556809L, (long)l10);
        m44.a("r", (Object)this, (xb)xb2, (long)5649823430751556809L, (long)l10);
        return callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void N(Object[] var1_1) {
        block39: {
            block37: {
                block38: {
                    block35: {
                        block34: {
                            block33: {
                                block32: {
                                    var3_2 = (DataOutputStream)var1_1[0];
                                    var2_3 = (Map)var1_1[1];
                                    var5_4 = (Long)var1_1[2];
                                    var4_5 = (lqu)var1_1[3];
                                    var7_6 = var5_4 ^ 0L;
                                    v0 = m44.a("k", (long)1680553024964027930L, (long)var5_4);
                                    v1 = new Object[4];
                                    v1[3] = var4_5;
                                    v1[2] = var7_6;
                                    v1[1] = var2_3;
                                    v1[0] = var3_2;
                                    super.N(v1);
                                    var9_7 = v0;
                                    try {
                                        try {
                                            v2 /* !! */  = this;
                                            if (var9_7 == false) break block32;
                                            if (m44.a("u", (Object)v2 /* !! */ , (long)1009829788873835733L, (long)var5_4) != false) {
                                            }
                                            ** GOTO lbl109
                                        }
                                        catch (n9 v3) {
                                            throw m44.a("k", (Object)v3, (long)612829714967244136L, (long)var5_4);
                                        }
                                        v2 /* !! */  = var2_3.get(m44.a("u", (Object)this, (long)624633809455050958L, (long)var5_4));
                                    }
                                    catch (n9 v4) {
                                        throw m44.a("k", (Object)v4, (long)612829714967244136L, (long)var5_4);
                                    }
                                }
                                var10_8 = (jf)v2 /* !! */ ;
                                try {
                                    try {
                                        v5 = var9_7;
                                        if (var5_4 <= 0L) ** GOTO lbl50
                                        if (v5 == false) break block33;
                                        if (var10_8 != null) {
                                        }
                                        ** GOTO lbl51
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("k", (Object)v6, (long)612829714967244136L, (long)var5_4);
                                    }
                                    var3_2.writeShort(var10_8.E());
                                }
                                catch (n9 v7) {
                                    throw m44.a("k", (Object)v7, (long)612829714967244136L, (long)var5_4);
                                }
                            }
                            try {
                                if (var5_4 < 0L) break block34;
                                v5 = var9_7;
lbl50:
                                // 2 sources

                                if (v5 != false) break block34;
lbl51:
                                // 2 sources

                                var3_2.writeShort(m44.a("u", (Object)this, (long)624633809455050958L, (long)var5_4).E());
                            }
                            catch (n9 v8) {
                                throw m44.a("k", (Object)v8, (long)612829714967244136L, (long)var5_4);
                            }
                        }
                        try {
                            block36: {
                                try {
                                    try {
                                        v9 = m44.a("u", (Object)this, (long)1271501393793338116L, (long)var5_4);
                                        if (var9_7 == false) break block35;
                                        if (v9 != null) break block36;
                                    }
                                    catch (n9 v10) {
                                        throw m44.a("k", (Object)v10, (long)612829714967244136L, (long)var5_4);
                                    }
                                    var3_2.writeShort(0);
                                    v11 = var9_7;
                                    if (var5_4 > 0L) {
                                        if (v11 != false) break block37;
                                    }
                                    ** GOTO lbl108
                                }
                                catch (n9 v12) {
                                    throw m44.a("k", (Object)v12, (long)612829714967244136L, (long)var5_4);
                                }
                            }
                            v9 = (xb)var2_3.get(m44.a("u", (Object)this, (long)1271501393793338116L, (long)var5_4));
                        }
                        catch (n9 v13) {
                            throw m44.a("k", (Object)v13, (long)612829714967244136L, (long)var5_4);
                        }
                    }
                    var11_9 = v9;
                    try {
                        try {
                            v11 = var9_7;
                            if (var5_4 <= 0L) ** GOTO lbl97
                            if (v11 == false) break block38;
                            if (var11_9 != null) {
                            }
                            ** GOTO lbl100
                        }
                        catch (n9 v14) {
                            throw m44.a("k", (Object)v14, (long)612829714967244136L, (long)var5_4);
                        }
                        var3_2.writeShort(var11_9.E());
                    }
                    catch (n9 v15) {
                        throw m44.a("k", (Object)v15, (long)612829714967244136L, (long)var5_4);
                    }
                }
                try {
                    v11 = var9_7;
lbl97:
                    // 2 sources

                    if (var5_4 > 0L) {
                        if (v11 != false) break block37;
                    }
                    ** GOTO lbl108
lbl100:
                    // 2 sources

                    var3_2.writeShort(m44.a("u", (Object)this, (long)1271501393793338116L, (long)var5_4).E());
                }
                catch (n9 v16) {
                    throw m44.a("k", (Object)v16, (long)612829714967244136L, (long)var5_4);
                }
            }
            try {
                if (var5_4 < 0L) break block39;
                v11 = var9_7;
lbl108:
                // 3 sources

                if (v11 != false) break block39;
lbl109:
                // 2 sources

                var3_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var5_4));
            }
            catch (n9 v17) {
                throw m44.a("k", (Object)v17, (long)612829714967244136L, (long)var5_4);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    k2(_4 var1_1, int var2_2, long var3_3, String var5_4, h1 var6_5, l6q var7_6, l6q var8_7, l6q var9_8, PrintWriter var10_9) {
        block54: {
            block41: {
                block55: {
                    block53: {
                        block47: {
                            block48: {
                                block51: {
                                    block52: {
                                        block49: {
                                            block44: {
                                                block45: {
                                                    block46: {
                                                        block42: {
                                                            v0 = var3_3 = k2.c ^ var3_3;
                                                            var11_10 = v0 ^ 85057473403628L;
                                                            var13_11 = v0 ^ 21470566008612L;
                                                            var15_12 = v0 ^ 19443399459852L;
                                                            var17_13 = v0 ^ 129026975764243L;
                                                            var19_14 = v0 ^ 123093286442760L;
                                                            var21_15 = v0 ^ 51267636083009L;
                                                            var23_16 = v0 ^ 86818594675718L;
                                                            super(var1_1, var2_2, var17_13, var5_4, var6_5, var7_6);
                                                            var26_17 = new byte[this.W];
                                                            v1 = m44.a("i", (long)-6176474577065869649L, (long)var3_3);
                                                            var6_5.read(var26_17);
                                                            v2 = new Object[3];
                                                            v2[2] = var11_10;
                                                            v2[1] = false;
                                                            v2[0] = var26_17;
                                                            var27_18 = m44.a("i", (Object)v2, (long)-6299492994574232485L, (long)var3_3);
                                                            var25_19 = v1;
                                                            try {
                                                                v3 = this;
                                                                if (var25_19 != false) break block41;
                                                                if (v3.W == 4) {
                                                                }
                                                                ** GOTO lbl165
                                                            }
                                                            catch (n9 v4) {
                                                                throw m44.a("i", (Object)v4, (long)-5925890251472730070L, (long)var3_3);
                                                            }
                                                            var28_20 = var27_18.readUnsignedShort();
                                                            var29_21 = var27_18.readUnsignedShort();
                                                            var30_22 = this.m(var21_15, var28_20);
                                                            try {
                                                                block43: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var3_3 < 0L || var25_19 != false) break block42;
                                                                                if (var30_22 == null) break block43;
                                                                            }
                                                                            catch (n9 v5) {
                                                                                throw m44.a("i", (Object)v5, (long)-5925890251472730070L, (long)var3_3);
                                                                            }
                                                                            if (var3_3 <= 0L) break block42;
                                                                            if (!(var30_22 instanceof jf)) break block43;
                                                                        }
                                                                        catch (n9 v6) {
                                                                            throw m44.a("i", (Object)v6, (long)-5925890251472730070L, (long)var3_3);
                                                                        }
                                                                        m44.a("u", (Object)this, (jf)((jf)var30_22), (long)-5915176339233712756L, (long)var3_3);
                                                                        var9_8.t(m44.a("w", (Object)this, (long)-5915176339233712756L, (long)var3_3), this, var23_16);
                                                                        v7 /* !! */  = var25_19;
                                                                        if (var3_3 >= 0L) {
                                                                            if (v7 /* !! */  == false) break block44;
                                                                        }
                                                                        ** GOTO lbl88
                                                                    }
                                                                    catch (n9 v8) {
                                                                        throw m44.a("i", (Object)v8, (long)-5925890251472730070L, (long)var3_3);
                                                                    }
                                                                }
                                                                m44.a("u", (Object)this, (boolean)false, (long)-6106435235199098473L, (long)var3_3);
                                                            }
                                                            catch (n9 v9) {
                                                                throw m44.a("i", (Object)v9, (long)-5925890251472730070L, (long)var3_3);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                v10 = var10_9;
                                                                v11 = new StringBuilder().append((String)k2.b("q", (int)19434, (long)(2781120344264670605L ^ var3_3))).append(this.f(var19_14)).append((String)k2.b("q", (int)3694, (long)(8811998604371572750L ^ var3_3))).append((String)k2.b("q", (int)18381, (long)(6732513923228070316L ^ var3_3)));
                                                                v12 = 6014;
                                                                if (var3_3 > 0L) {
                                                                    v13 = k2.b("q", (int)v12, (long)(1825078292451991825L ^ var3_3));
                                                                    if (var25_19 != false) break block45;
                                                                    v11 = v11.append((String)v13);
                                                                    v12 = var28_20;
                                                                }
                                                                v14 = v11.append(v12);
                                                                if (var30_22 == null) break block46;
                                                            }
                                                            catch (n9 v15) {
                                                                throw m44.a("i", (Object)v15, (long)-5925890251472730070L, (long)var3_3);
                                                            }
                                                            v13 = (String)k2.b("q", (int)13476, (long)(7923282938595869386L ^ var3_3)) + (Object)var30_22.A(var15_12);
                                                            break block45;
                                                        }
                                                        catch (n9 v16) {
                                                            throw m44.a("i", (Object)v16, (long)-5925890251472730070L, (long)var3_3);
                                                        }
                                                    }
                                                    v13 = "";
                                                }
                                                v10.println(v14.append((String)v13).toString());
                                            }
                                            try {
                                                v7 /* !! */  = (CallSite)var29_21;
lbl88:
                                                // 2 sources

                                                if (var25_19 != false) break block47;
                                                if (v7 /* !! */  <= 0) break block48;
                                            }
                                            catch (n9 v17) {
                                                throw m44.a("i", (Object)v17, (long)-5925890251472730070L, (long)var3_3);
                                            }
                                            var31_23 = this.m(var21_15, var29_21);
                                            try {
                                                block50: {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var3_3 < 0L || var25_19 != false) break block49;
                                                                if (var31_23 == null) break block50;
                                                            }
                                                            catch (n9 v18) {
                                                                throw m44.a("i", (Object)v18, (long)-5925890251472730070L, (long)var3_3);
                                                            }
                                                            if (var3_3 < 0L) break block49;
                                                            if (!(var31_23 instanceof xb)) break block50;
                                                        }
                                                        catch (n9 v19) {
                                                            throw m44.a("i", (Object)v19, (long)-5925890251472730070L, (long)var3_3);
                                                        }
                                                        m44.a("u", (Object)this, (xb)((xb)var31_23), (long)-5411232656654406074L, (long)var3_3);
                                                        var8_7.t(m44.a("w", (Object)this, (long)-5411232656654406074L, (long)var3_3), this, var23_16);
                                                        v20 = new Object[1];
                                                        v20[0] = var13_11;
                                                        m44.a("v", (Object)((_v)var1_1), (Object)v20, (long)-6178943123680549498L, (long)var3_3);
                                                        if (var3_3 <= 0L || var25_19 == false) break block48;
                                                    }
                                                    catch (n9 v21) {
                                                        throw m44.a("i", (Object)v21, (long)-5925890251472730070L, (long)var3_3);
                                                    }
                                                }
                                                m44.a("u", (Object)this, (boolean)false, (long)-6106435235199098473L, (long)var3_3);
                                            }
                                            catch (n9 v22) {
                                                throw m44.a("i", (Object)v22, (long)-5925890251472730070L, (long)var3_3);
                                            }
                                        }
                                        try {
                                            try {
                                                v23 = var10_9;
                                                v24 = new StringBuilder().append((String)k2.b("q", (int)12908, (long)(8144789172913800197L ^ var3_3))).append(this.f(var19_14)).append((String)k2.b("q", (int)15063, (long)(3306842356383452346L ^ var3_3))).append((String)k2.b("q", (int)31160, (long)(4978968663940157404L ^ var3_3)));
                                                v25 = 9550;
                                                if (var3_3 >= 0L) {
                                                    v26 = k2.b("q", (int)v25, (long)(484564015313621803L ^ var3_3));
                                                    if (var25_19 != false) break block51;
                                                    v24 = v24.append((String)v26);
                                                    v25 = var29_21;
                                                }
                                                v27 = v24.append(v25);
                                                if (var31_23 == null) break block52;
                                            }
                                            catch (n9 v28) {
                                                throw m44.a("i", (Object)v28, (long)-5925890251472730070L, (long)var3_3);
                                            }
                                            v26 = (String)k2.b("q", (int)29753, (long)(5404120145940890197L ^ var3_3)) + (Object)var31_23.A(var15_12);
                                            break block51;
                                        }
                                        catch (n9 v29) {
                                            throw m44.a("i", (Object)v29, (long)-5925890251472730070L, (long)var3_3);
                                        }
                                    }
                                    v26 = "";
                                }
                                v23.println(v27.append((String)v26).toString());
                            }
                            try {
                                v30 = this;
                                if (var25_19 != false) break block53;
                                v7 /* !! */  = m44.a("w", (Object)v30, (long)-6106435235199098473L, (long)var3_3);
                            }
                            catch (n9 v31) {
                                throw m44.a("i", (Object)v31, (long)-5925890251472730070L, (long)var3_3);
                            }
                        }
                        if (v7 /* !! */  != false) break block55;
                        v30 = this;
                    }
                    m44.a("u", (Object)v30, (byte[])var26_17, (long)-6270488403751363355L, (long)var3_3);
                }
                try {
                    block56: {
                        if (var3_3 >= 0L) {
                            if (var25_19 == false) break block54;
                        }
                        break block56;
lbl165:
                        // 2 sources

                        m44.a("u", (Object)this, (boolean)false, (long)-6106435235199098473L, (long)var3_3);
                    }
                    v3 = this;
                }
                catch (n9 v32) {
                    throw m44.a("i", (Object)v32, (long)-5925890251472730070L, (long)var3_3);
                }
            }
            m44.a("u", (Object)v3, (byte[])var26_17, (long)-6270488403751363355L, (long)var3_3);
            var10_9.println((String)k2.b("q", (int)12908, (long)(8144789172913800197L ^ var3_3)) + this.f(var19_14) + (String)k2.b("q", (int)15063, (long)(3306842356383452346L ^ var3_3)) + (String)k2.b("q", (int)31160, (long)(4978968663940157404L ^ var3_3)) + (String)k2.b("q", (int)15270, (long)(1208433069537562052L ^ var3_3)) + this.W);
        }
    }

    @Override
    public void S(Object[] objectArray) {
        block5: {
            k2 k22;
            long l10;
            jf jf2;
            block4: {
                jf jf3 = (jf)objectArray[0];
                jf2 = (jf)objectArray[1];
                l10 = (Long)objectArray[2];
                CallSite callSite = m44.a("o", (long)-7028195342100598978L, (long)l10);
                try {
                    try {
                        k22 = this;
                        if (callSite == false) break block4;
                        if (m44.a("q", (Object)k22, (long)-9110933077110162966L, (long)l10) != jf3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-9104757958237707188L, (long)l10);
                    }
                    k22 = this;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-9104757958237707188L, (long)l10);
                }
            }
            m44.a("s", (Object)k22, (jf)jf2, (long)-9110933077110162966L, (long)l10);
        }
    }

    public String Y(Object[] objectArray) {
        block5: {
            k2 k22;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = c ^ l11) ^ 0x245E8C84EEB2L;
                CallSite callSite = m44.a("i", (long)2103458537239759319L, (long)l11);
                try {
                    try {
                        k22 = this;
                        if (callSite != false) break block4;
                        if (m44.a("w", (Object)k22, (long)2033842508768138991L, (long)l11) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)1926202857744580434L, (long)l11);
                    }
                    k22 = this;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)1926202857744580434L, (long)l11);
                }
            }
            return ((jf)((Object)m44.a("w", (Object)k22, (long)1914363028923245300L, (long)l11))).g(l10);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public void M(Object[] var1_1) {
        block26: {
            block31: {
                block30: {
                    block28: {
                        block29: {
                            block27: {
                                block25: {
                                    var2_2 = (Long)var1_1[0];
                                    var4_3 = (var2_2 = k2.c ^ var2_2) ^ 113996120008822L;
                                    var6_4 = m44.a("i", (long)-5214941199914645784L, (long)var2_2);
                                    try {
                                        try {
                                            v0 = this;
                                            if (var6_4 == false) break block25;
                                            if (m44.a("w", (Object)v0, (long)-5840629552126663641L, (long)var2_2) == false) break block26;
                                        }
                                        catch (n9 v1) {
                                            throw m44.a("i", (Object)v1, (long)-6308560212029305446L, (long)var2_2);
                                        }
                                        v0 = this;
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("i", (Object)v2, (long)-6308560212029305446L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        if (var2_2 < 0L || var6_4 == false) break block27;
                                        if (m44.a("w", (Object)v0, (long)-5668044776766772234L, (long)var2_2) == null) break block26;
                                    }
                                    catch (n9 v3) {
                                        throw m44.a("i", (Object)v3, (long)-6308560212029305446L, (long)var2_2);
                                    }
                                    v0 = this;
                                }
                                catch (n9 v4) {
                                    throw m44.a("i", (Object)v4, (long)-6308560212029305446L, (long)var2_2);
                                }
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            v5 = m44.a("w", (Object)v0, (long)-5707008022865066239L, (long)var2_2);
                                            if (var6_4 == false) break block28;
                                            if (v5 == null) break block29;
                                        }
                                        catch (n9 v6) {
                                            throw m44.a("i", (Object)v6, (long)-6308560212029305446L, (long)var2_2);
                                        }
                                        v5 = m44.a("w", (Object)this, (long)-5707008022865066239L, (long)var2_2);
                                        v7 = var6_4;
                                        if (var2_2 >= 0L) {
                                            if (v7 == false) break block28;
                                        }
                                        ** GOTO lbl65
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("i", (Object)v8, (long)-6308560212029305446L, (long)var2_2);
                                    }
                                    if (v5.Z(var4_3).equals(m44.a("w", (Object)this, (long)-5668044776766772234L, (long)var2_2).A())) break block29;
                                }
                                catch (n9 v9) {
                                    throw m44.a("i", (Object)v9, (long)-6308560212029305446L, (long)var2_2);
                                }
                                m44.a("v", (Object)m44.a("w", (Object)this, (long)-5668044776766772234L, (long)var2_2), (Object)new Object[]{m44.a("w", (Object)this, (long)-5707008022865066239L, (long)var2_2).Z(var4_3)}, (long)-5922463948232523574L, (long)var2_2);
                            }
                            catch (n9 v10) {
                                throw m44.a("i", (Object)v10, (long)-6308560212029305446L, (long)var2_2);
                            }
                        }
                        v5 = m44.a("w", (Object)this, (long)-5707008022865066239L, (long)var2_2);
                    }
                    try {
                        try {
                            try {
                                if (var2_2 < 0L) break block30;
                                v7 = var6_4;
lbl65:
                                // 2 sources

                                if (v7 == false) break block30;
                                if (v5 == null) break block26;
                            }
                            catch (n9 v11) {
                                throw m44.a("i", (Object)v11, (long)-6308560212029305446L, (long)var2_2);
                            }
                            v12 = this;
                            if (var6_4 == false) break block31;
                        }
                        catch (n9 v13) {
                            throw m44.a("i", (Object)v13, (long)-6308560212029305446L, (long)var2_2);
                        }
                        v5 = m44.a("w", (Object)v12, (long)-5707008022865066239L, (long)var2_2);
                    }
                    catch (n9 v14) {
                        throw m44.a("i", (Object)v14, (long)-6308560212029305446L, (long)var2_2);
                    }
                }
                try {
                    if (v5.V().equals(m44.a("w", (Object)this, (long)-5668044776766772234L, (long)var2_2).X())) break block26;
                    v12 = this;
                }
                catch (n9 v15) {
                    throw m44.a("i", (Object)v15, (long)-6308560212029305446L, (long)var2_2);
                }
            }
            m44.a("v", (Object)m44.a("w", (Object)v12, (long)-5668044776766772234L, (long)var2_2), (Object)new Object[]{m44.a("w", (Object)this, (long)-5707008022865066239L, (long)var2_2).V()}, (long)-6075021835008242446L, (long)var2_2);
        }
    }

    @Override
    void z(gu gu2, long l10) {
        block13: {
            CallSite callSite;
            long l11;
            block16: {
                k2 k22;
                CallSite callSite2;
                block14: {
                    block15: {
                        long l12;
                        block12: {
                            long l13 = l10;
                            long l14 = l13 ^ 0x66FDF08525FDL;
                            l11 = l13 ^ 0x6DE1DADD9981L;
                            l12 = l13 ^ 0x6DE1DADD9981L;
                            CallSite callSite3 = m44.a("h", (long)6170399952317654249L, (long)l10);
                            gu2.K(this.b, this, l14, this);
                            callSite2 = callSite3;
                            try {
                                try {
                                    k22 = this;
                                    if (callSite2 == false) break block12;
                                    if (m44.a("v", (Object)k22, (long)5544088189886891558L, (long)l10) == false) break block13;
                                }
                                catch (n9 n92) {
                                    throw m44.a("h", (Object)n92, (long)5364378019087937435L, (long)l10);
                                }
                                k22 = this;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)n93, (long)5364378019087937435L, (long)l10);
                            }
                        }
                        try {
                            try {
                                if (l10 <= 0L || callSite2 == false) break block14;
                                if (m44.a("v", (Object)k22, (long)5357041797980697149L, (long)l10) == null) break block15;
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)n94, (long)5364378019087937435L, (long)l10);
                            }
                            ((jf)((Object)m44.a("v", (Object)this, (long)5357041797980697149L, (long)l10))).e(l12, gu2, this, this);
                        }
                        catch (n9 n95) {
                            throw m44.a("h", (Object)n95, (long)5364378019087937435L, (long)l10);
                        }
                    }
                    k22 = this;
                }
                try {
                    try {
                        callSite = m44.a("v", (Object)k22, (long)6005105650969610743L, (long)l10);
                        if (callSite2 == false) break block16;
                        if (callSite == null) break block13;
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)n96, (long)5364378019087937435L, (long)l10);
                    }
                    callSite = m44.a("v", (Object)this, (long)6005105650969610743L, (long)l10);
                }
                catch (n9 n97) {
                    throw m44.a("h", (Object)n97, (long)5364378019087937435L, (long)l10);
                }
            }
            m44.a("w", (Object)callSite, (long)l11, (Object)gu2, (Object)this, (Object)this, (long)6305468739184479700L, (long)l10);
        }
    }

    public void z(Object[] objectArray) {
        block15: {
            k2 k22;
            _v _v2;
            long l10;
            long l11;
            block19: {
                CallSite callSite;
                CallSite callSite2;
                long l12;
                long l13;
                long l14;
                _6 _62;
                block20: {
                    block18: {
                        Object object;
                        _v _v3;
                        block16: {
                            block17: {
                                k2 k23;
                                long l15;
                                long l16;
                                block14: {
                                    _u _u2 = (_u)objectArray[0];
                                    _62 = (_6)objectArray[1];
                                    l11 = (Long)objectArray[2];
                                    long l17 = l11 = c ^ l11;
                                    l14 = l17 ^ 0x1B6C5DF0CD08L;
                                    l16 = l17 ^ 0xF1936C7822DL;
                                    l10 = l17 ^ 0x4535E79901BCL;
                                    l13 = l17 ^ 0x2F4E495266CL;
                                    l15 = l17 ^ 0x265A99A1704FL;
                                    l12 = l17 ^ 0x7A4F5232A785L;
                                    callSite2 = m44.a("n", (long)5503348340804173079L, (long)l11);
                                    try {
                                        try {
                                            k23 = this;
                                            if (callSite2 == false) break block14;
                                            if (m44.a("p", (Object)k23, (long)6129107643727388632L, (long)l11) == false) break block15;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("n", (Object)n92, (long)6020293845147940453L, (long)l11);
                                        }
                                        k23 = this;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("n", (Object)n93, (long)6020293845147940453L, (long)l11);
                                    }
                                }
                                _v2 = k23.G(l16);
                                try {
                                    try {
                                        _v3 = _v2;
                                        object = callSite2;
                                        if (l11 <= 0L) break block16;
                                        if (object == false) break block17;
                                        if (!_v3.z(l15)) break block18;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("n", (Object)n94, (long)6020293845147940453L, (long)l11);
                                    }
                                    _v3 = _v2;
                                }
                                catch (n9 n95) {
                                    throw m44.a("n", (Object)n95, (long)6020293845147940453L, (long)l11);
                                }
                            }
                            object = false;
                        }
                        callSite = m44.a("q", (Object)_v3, (Object)new Object[object], (long)6135889729814614462L, (long)l11);
                        break block20;
                    }
                    callSite = null;
                }
                CallSite callSite3 = callSite;
                _v2 = _62.g(((jf)((Object)m44.a("p", (Object)this, (long)6027629507373575107L, (long)l11))).g(l12), (Integer)((Object)callSite3), l13, (String)((Object)k2.b("q", (int)24945, (long)(0x7CBEBAF2DD03A95DL ^ l11))) + this.j(l14) + (String)((Object)k2.b("q", (int)23370, (long)(0x249B9E8F8E801363L ^ l11))));
                try {
                    try {
                        try {
                            if (_v2 == null) break block15;
                            k22 = this;
                            if (callSite2 == false) break block19;
                        }
                        catch (n9 n96) {
                            throw m44.a("n", (Object)n96, (long)6020293845147940453L, (long)l11);
                        }
                        if (m44.a("p", (Object)k22, (long)5379571736060170249L, (long)l11) == null) break block15;
                    }
                    catch (n9 n97) {
                        throw m44.a("n", (Object)n97, (long)6020293845147940453L, (long)l11);
                    }
                    k22 = this;
                }
                catch (n9 n98) {
                    throw m44.a("n", (Object)n98, (long)6020293845147940453L, (long)l11);
                }
            }
            m44.a("r", (Object)k22, (b1)_v2.U(new loe(((xb)((Object)m44.a("p", (Object)this, (long)5379571736060170249L, (long)l11))).A(), ((xb)((Object)m44.a("p", (Object)this, (long)5379571736060170249L, (long)l11))).X()), l10), (long)5418884521594797310L, (long)l11);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                k2.c = prr.a(-1248746923009729097L, 4662514101479159219L, MethodHandles.lookup().lookupClass()).a(17952032824235L);
                k2.i = new HashMap<K, V>(13);
                var0 = k2.c ^ 42267369233506L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[13];
                var7_4 = 0;
                var6_5 = "\u00be1\u0099F\u0000\u0012|% .\u00b0\u0099\u00fd\u00ec`\u0099\u00e9\u00ead\u00afx\u00e5\u001cZ\u007f2\u00d0\u009e\u00e1\u009a@\u00f4@\u00f9>@\u00c00u8\u00b9\u00e6\u0005 4JW\u0015\u00d29\u009f\u0084F[)\u00c9\u00c5\u00b0\u00e0\u00a7\r8@\u00ad\u00c45,\u008d\u00ce%\u0083\u00eeA\u00dd\u00bb}[\u00d7yo\u00f1\u0099E\u00f8\u0084\u00ab\u00aa\u009e!8Th\u00d4\u001b\u00dc\u001b6\u0010\u0003U=$\u00ae\u00e5\u0010*\u001b\u00b3\u0007\u0098p$\t\u00aa\u0010\u0014'}\u00b6]$Y\u00f0-O\u00c9\u00f8\u0090\u00d0\u00fa)@\u009f'\u00f8\u00ab\u0099\u00c7rYB\u000eu\u0090\u00ce\u008f\u0010\u00bc2\u00df!$t;\u00bd\u00865\u00be\u009az\u0095\u00e8\u0010\n\u0083\u0001o\u00da\u00e1\u00d4\u00ed\u00f8\u00c9vi\u00edT*m^zx\u0012B\u0096\u00e8/\u00be\u00f0l\u00c2\u00e9\u0098\u0095\u001c\"\u0010\u00aa\u0086Y\u0089\u00d5 \u00f6\u0096\u00b5\u009aa\u0018jz\u0007r@\u0011\u00efA\u0016\u0017N\u00d5\u009eN\u00e6I\u00ec\u00af\u00de\u0080\u00c1f1\u0085\u00b4:\u00f5\u0093A@\u0088\u0011,\u009e\u0099\u001cg\u00d3\u0013\u00b3=\u00ce?2|\u000b\u0084\u00d16>\u00b9o\u00bca\u00d8\u00a7\u000f\u00d0\u00c2O\u00ef\u00e8\u00ea\u00ae\u001e.\u0088\u00c2W \u00b7F\u00a9=T\t~\u0083\u0013\u00d1\u00dc\u00f0>\u0018\u00a5\u009b\fe\u0005buJk9\u00ec\u00f7\u009e\u00af_L\u00d1\u00b5\u0010@p\u008ds\u000b\u00ec\n\u0080w\u00ed\u00f8\u0095\u001d\u00ddMp\u0010\u0098\u00da\u00e5\u0013\u00f8#{\u000f\u0014\u00a5i0x\u0006\u00a8\u00fb\u0018<\u001d\u00d6\u00fbk\u00d6\u00e9)Jy\u00ee\u00a1\u0091\u00c7\u001c\u007f`\u0089]n\u00d4\u008a#\"";
                var8_6 = "\u00be1\u0099F\u0000\u0012|% .\u00b0\u0099\u00fd\u00ec`\u0099\u00e9\u00ead\u00afx\u00e5\u001cZ\u007f2\u00d0\u009e\u00e1\u009a@\u00f4@\u00f9>@\u00c00u8\u00b9\u00e6\u0005 4JW\u0015\u00d29\u009f\u0084F[)\u00c9\u00c5\u00b0\u00e0\u00a7\r8@\u00ad\u00c45,\u008d\u00ce%\u0083\u00eeA\u00dd\u00bb}[\u00d7yo\u00f1\u0099E\u00f8\u0084\u00ab\u00aa\u009e!8Th\u00d4\u001b\u00dc\u001b6\u0010\u0003U=$\u00ae\u00e5\u0010*\u001b\u00b3\u0007\u0098p$\t\u00aa\u0010\u0014'}\u00b6]$Y\u00f0-O\u00c9\u00f8\u0090\u00d0\u00fa)@\u009f'\u00f8\u00ab\u0099\u00c7rYB\u000eu\u0090\u00ce\u008f\u0010\u00bc2\u00df!$t;\u00bd\u00865\u00be\u009az\u0095\u00e8\u0010\n\u0083\u0001o\u00da\u00e1\u00d4\u00ed\u00f8\u00c9vi\u00edT*m^zx\u0012B\u0096\u00e8/\u00be\u00f0l\u00c2\u00e9\u0098\u0095\u001c\"\u0010\u00aa\u0086Y\u0089\u00d5 \u00f6\u0096\u00b5\u009aa\u0018jz\u0007r@\u0011\u00efA\u0016\u0017N\u00d5\u009eN\u00e6I\u00ec\u00af\u00de\u0080\u00c1f1\u0085\u00b4:\u00f5\u0093A@\u0088\u0011,\u009e\u0099\u001cg\u00d3\u0013\u00b3=\u00ce?2|\u000b\u0084\u00d16>\u00b9o\u00bca\u00d8\u00a7\u000f\u00d0\u00c2O\u00ef\u00e8\u00ea\u00ae\u001e.\u0088\u00c2W \u00b7F\u00a9=T\t~\u0083\u0013\u00d1\u00dc\u00f0>\u0018\u00a5\u009b\fe\u0005buJk9\u00ec\u00f7\u009e\u00af_L\u00d1\u00b5\u0010@p\u008ds\u000b\u00ec\n\u0080w\u00ed\u00f8\u0095\u001d\u00ddMp\u0010\u0098\u00da\u00e5\u0013\u00f8#{\u000f\u0014\u00a5i0x\u0006\u00a8\u00fb\u0018<\u001d\u00d6\u00fbk\u00d6\u00e9)Jy\u00ee\u00a1\u0091\u00c7\u001c\u007f`\u0089]n\u00d4\u008a#\"".length();
                var5_7 = 32;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = k2.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "*\u00afn\u00f2\u00f2'\u001a4\u0016\u008a\u00d9#\u00c9O\u00dbH\u0010`\u001c;\u0089#\u0000\u0099\u00f9\u000b\u00d4\u00d5\u00a7\u0003\u00a9\u00fe\u0017";
                    var8_6 = "*\u00afn\u00f2\u00f2'\u001a4\u0016\u008a\u00d9#\u00c9O\u00dbH\u0010`\u001c;\u0089#\u0000\u0099\u00f9\u000b\u00d4\u00d5\u00a7\u0003\u00a9\u00fe\u0017".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = k2.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        k2.d = var9_3;
        k2.g = new String[13];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x176B;
        if (g[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/k2", exception);
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
            k2.g[n11] = k2.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = k2.b(n10, l10);
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
            throw new RuntimeException("com/zelix/k2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(k2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

