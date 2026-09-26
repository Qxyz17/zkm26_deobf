/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.eo;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.kx;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import java.io.DataOutputStream;
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

public class bm
extends kx
implements ni,
eo {
    jf r;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void N(Object[] var1_1) {
        block20: {
            block19: {
                block18: {
                    block17: {
                        var4_2 = (DataOutputStream)var1_1[0];
                        var2_3 = (Map)var1_1[1];
                        var5_4 = (Long)var1_1[2];
                        var3_5 = (lqu)var1_1[3];
                        var7_6 = var5_4 ^ 62442288127650L;
                        v0 = m44.a("k", (long)1680553024964027930L, (long)var5_4);
                        v1 = new Object[2];
                        v1[1] = var4_2;
                        v1[0] = var7_6;
                        super.c(v1);
                        var9_7 = v0;
                        try {
                            try {
                                v2 /* !! */  = this;
                                if (var9_7 == false) break block17;
                                if (m44.a("u", (Object)v2 /* !! */ , (long)1009829788873835733L, (long)var5_4) != false) {
                                }
                                ** GOTO lbl59
                            }
                            catch (n9 v3) {
                                throw m44.a("k", (Object)v3, (long)949431090037371457L, (long)var5_4);
                            }
                            v2 /* !! */  = var2_3.get(m44.a("u", (Object)this, (long)788959137845036175L, (long)var5_4));
                        }
                        catch (n9 v4) {
                            throw m44.a("k", (Object)v4, (long)949431090037371457L, (long)var5_4);
                        }
                    }
                    var10_8 = (js)v2 /* !! */ ;
                    try {
                        try {
                            v5 = var9_7;
                            if (var5_4 <= 0L) ** GOTO lbl47
                            if (v5 == false) break block18;
                            if (var10_8 != null) {
                            }
                            ** GOTO lbl50
                        }
                        catch (n9 v6) {
                            throw m44.a("k", (Object)v6, (long)949431090037371457L, (long)var5_4);
                        }
                        var4_2.writeShort(var10_8.E());
                    }
                    catch (n9 v7) {
                        throw m44.a("k", (Object)v7, (long)949431090037371457L, (long)var5_4);
                    }
                }
                try {
                    v5 = var9_7;
lbl47:
                    // 2 sources

                    if (var5_4 >= 0L) {
                        if (v5 != false) break block19;
                    }
                    ** GOTO lbl58
lbl50:
                    // 2 sources

                    var4_2.writeShort(m44.a("u", (Object)this, (long)788959137845036175L, (long)var5_4).E());
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)949431090037371457L, (long)var5_4);
                }
            }
            try {
                if (var5_4 < 0L) break block20;
                v5 = var9_7;
lbl58:
                // 2 sources

                if (v5 != false) break block20;
lbl59:
                // 2 sources

                var4_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var5_4));
            }
            catch (n9 v9) {
                throw m44.a("k", (Object)v9, (long)949431090037371457L, (long)var5_4);
            }
        }
    }

    public void W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        HashMap hashMap = (HashMap)objectArray[3];
        HashMap hashMap2 = (HashMap)objectArray[4];
    }

    String L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x5C03B4E07A1DL;
        return m44.a("p", (Object)((Object)this), (long)-8329547900271869414L, (long)l).g(l2);
    }

    /*
     * Unable to fully structure code
     */
    public void c(Object[] var1_1) {
        block9: {
            block8: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (DataOutputStream)var1_1[1];
                var5_4 = var3_2 ^ 0L;
                v0 = m44.a("i", (long)1272493964096652623L, (long)var3_2);
                v1 = new Object[2];
                v1[1] = var2_3;
                v1[0] = var5_4;
                super.c(v1);
                var7_5 = v0;
                try {
                    try {
                        if (var7_5 != false) break block8;
                        if (m44.a("w", (Object)this, (long)1198408428474194551L, (long)var3_2) != false) {
                        }
                        ** GOTO lbl28
                    }
                    catch (n9 v2) {
                        throw m44.a("i", (Object)v2, (long)1409404864244788451L, (long)var3_2);
                    }
                    var2_3.writeShort(m44.a("w", (Object)this, (long)1463893000767298093L, (long)var3_2).E());
                }
                catch (n9 v3) {
                    throw m44.a("i", (Object)v3, (long)1409404864244788451L, (long)var3_2);
                }
            }
            try {
                if (var3_2 <= 0L || var7_5 == false) break block9;
lbl28:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var3_2));
            }
            catch (n9 v4) {
                throw m44.a("i", (Object)v4, (long)1409404864244788451L, (long)var3_2);
            }
        }
    }

    public void S(Object[] objectArray) {
        block5: {
            bm bm2;
            long l;
            jf jf2;
            block4: {
                jf jf3 = (jf)objectArray[0];
                jf2 = (jf)objectArray[1];
                l = (Long)objectArray[2];
                CallSite callSite = m44.a("o", (long)-7028195342100598978L, (long)l);
                try {
                    try {
                        bm2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("q", (Object)((Object)bm2), (long)-8946785869605057109L, (long)l) != jf3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-8932506082117797019L, (long)l);
                    }
                    bm2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)-8932506082117797019L, (long)l);
                }
            }
            m44.a("s", (Object)((Object)bm2), (jf)jf2, (long)-8946785869605057109L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    bm(_4 var1_1, int var2_2, String var3_3, h1 var4_4, long var5_5, l6q var7_6, l6q var8_7) {
        block23: {
            block24: {
                block21: {
                    block22: {
                        v0 = var5_5 = bm.a ^ var5_5;
                        var9_8 = v0 ^ 137207116779844L;
                        var11_9 = v0 ^ 103775445769376L;
                        var13_10 = v0 ^ 139967156746798L;
                        var15_11 = v0 ^ 112564816480607L;
                        var17_12 = v0 ^ 137207116779844L;
                        var19_13 = v0 ^ 67728611524365L;
                        var21_14 = v0 ^ 103147424373322L;
                        v1 = m44.a("m", (long)-5450302787467229932L, (long)var5_5);
                        super(var1_1, var2_2, var15_11, var3_3, var4_4, var7_6);
                        m44.a("q", (Object)this, (byte[])new byte[this.W], (long)-5857262006253806935L, (long)var5_5);
                        var4_4.read((byte[])m44.a("s", (Object)this, (long)-5857262006253806935L, (long)var5_5));
                        var23_15 = v1;
                        v2 = new Object[3];
                        v2[2] = var11_9;
                        v2[1] = false;
                        v2[0] = m44.a("s", (Object)this, (long)-5857262006253806935L, (long)var5_5);
                        var24_16 = m44.a("m", (Object)v2, (long)-5845769869936602601L, (long)var5_5);
                        var25_17 = null;
                        var26_18 = var24_16.readUnsignedShort();
                        var27_21 = var1_1.m(var19_13, var26_18);
                        v3 = var27_21;
                        if (var23_15 == false) break block21;
                        try {
                            block27: {
                                if (v3 != null) break block22;
                                break block27;
                                catch (Throwable v4) {
                                    throw m44.a("m", (Object)v4, (long)-5898823926810537649L, (long)var5_5);
                                }
                            }
                            m44.a("q", (Object)this, (boolean)false, (long)-5976973004999006245L, (long)var5_5);
                            throw new aw((String)m44.a("r", (Object)var1_1.G(var13_10), (long)var9_8, (long)-5325413993363126600L, (long)var5_5) + (String)bm.b("k", (int)24318, (long)(203162117777556715L ^ var5_5)) + (String)bm.b("k", (int)12533, (long)(7295099343338105579L ^ var5_5)) + (String)bm.b("k", (int)27212, (long)(194784784106500179L ^ var5_5)) + var26_18 + (String)bm.b("k", (int)18288, (long)(7130392331967929700L ^ var5_5)) + this.f(var17_12) + (String)bm.b("k", (int)4304, (long)(2884745255669418700L ^ var5_5)));
                        }
                        catch (Throwable v5) {
                            throw m44.a("m", (Object)v5, (long)-5898823926810537649L, (long)var5_5);
                        }
                    }
                    v3 = var27_21;
                }
                try {
                    if (!(v3 instanceof jf)) {
                        m44.a("q", (Object)this, (boolean)false, (long)-5976973004999006245L, (long)var5_5);
                        throw new aw((String)m44.a("r", (Object)var1_1.G(var13_10), (long)var9_8, (long)-5325413993363126600L, (long)var5_5) + (String)bm.b("k", (int)24461, (long)(3085105869958448532L ^ var5_5)) + (String)bm.b("k", (int)25731, (long)(8072918608561880734L ^ var5_5)) + (String)bm.b("k", (int)21301, (long)(8203394598445451565L ^ var5_5)) + var26_18 + (String)bm.b("k", (int)13158, (long)(2896575571742026108L ^ var5_5)) + this.f(var17_12) + (String)bm.b("k", (int)29865, (long)(2855373177833631410L ^ var5_5)));
                    }
                }
                catch (Throwable v6) {
                    throw m44.a("m", (Object)v6, (long)-5898823926810537649L, (long)var5_5);
                }
                m44.a("q", (Object)this, (jf)((jf)var27_21), (long)-6197843380361435263L, (long)var5_5);
                var8_7.t((Object)m44.a("s", (Object)this, (long)-6197843380361435263L, (long)var5_5), (Object)this, var21_14);
                if (var24_16 == null) break block23;
                if (var25_17 == null) break block24;
                try {
                    m44.a("r", (Object)var24_16, (long)-5549474420184072233L, (long)var5_5);
                }
                catch (Throwable var26_19) {
                    m44.a("r", (Object)var25_17, (Object)var26_19, (long)-5972392097324461723L, (long)var5_5);
                }
                break block23;
            }
            m44.a("r", (Object)var24_16, (long)-5549474420184072233L, (long)var5_5);
            break block23;
            catch (Throwable var26_20) {
                try {
                    var25_17 = var26_20;
                    throw var26_20;
                }
                catch (Throwable var28_22) {
                    block26: {
                        block25: {
                            try {
                                if (var24_16 == null) break block25;
                                if (var25_17 != null) {
                                }
                                ** GOTO lbl83
                            }
                            catch (Throwable v7) {
                                throw m44.a("m", (Object)v7, (long)-5898823926810537649L, (long)var5_5);
                            }
                            try {
                                m44.a("r", (Object)var24_16, (long)-5549474420184072233L, (long)var5_5);
                            }
                            catch (Throwable var29_23) {
                                try {
                                    v8 = var25_17;
                                    if (var5_5 <= 0L) break block26;
                                    m44.a("r", (Object)v8, (Object)var29_23, (long)-5972392097324461723L, (long)var5_5);
                                    if (var23_15 != false) break block25;
lbl83:
                                    // 2 sources

                                    m44.a("r", (Object)var24_16, (long)-5549474420184072233L, (long)var5_5);
                                }
                                catch (Throwable v9) {
                                    throw m44.a("m", (Object)v9, (long)-5898823926810537649L, (long)var5_5);
                                }
                            }
                        }
                        v8 = var28_22;
                    }
                    throw v8;
                }
            }
        }
    }

    void z(gu gu2, long l) {
        block4: {
            long l2 = l;
            long l3 = l2 ^ 0x6DE1DADD9981L;
            long l4 = l2 ^ 0x6DE1DADD9981L;
            CallSite callSite = m44.a("h", (long)5618762033536375070L, (long)l);
            this.b.e(l4, gu2, (Object)this, (Object)this.H());
            CallSite callSite2 = callSite;
            try {
                Object object;
                try {
                    object = m44.a("v", (Object)((Object)this), (long)5544088189886891558L, (long)l);
                    if (callSite2 != false || object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)5755075349065560242L, (long)l);
                }
                object = m44.a("v", (Object)((Object)this), (long)5188672499982141052L, (long)l).e(l3, gu2, (Object)this, this.H());
            }
            catch (n9 n93) {
                throw m44.a("h", (Object)((Object)n93), (long)5755075349065560242L, (long)l);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                bm.a = prr.a((long)6008233077702815218L, (long)-1132160097263668197L, MethodHandles.lookup().lookupClass()).a(57795491342140L);
                bm.g = new HashMap<K, V>(13);
                var0 = bm.a ^ 23044072751742L;
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
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "Z>\u001b\u00ed1\u00e86\u00ff~2X\u00c5f*\u00fe\u00f2h\u0098\u00db\"d\u00cd\u00fe\u008a\u0084G7\u00bd\u00d7=mQ&gQ\u00df\u0002\u00e45q\u00bcp>$\u000bJj'q\u00f5O\u00ee\u0099\u00ca(H\u0013\u0089\u0004\u00c5}\u0084.\u008b \u00d1\u0083'f\u0017\u00c3?\u000fUdq(\u0082\u00c5\u00d8\"\u00caaZC\u00f44\u00ce\u0083\u0084s\u00f1\u00e9*\u0096\u00d2& \u00f1l\u00af\u00fa\u00fa\u0002tF\u0006\u00bevV\u0019\u00d33\u0005\u00e5\u00b3\u00fa\u001f=Px+\u00f6E^\u0084-\u00960\u00d5 \u00a6\u00f4\u00c3\u0017\u000fq\u00f0\u0098\u0080\u00a8\u0018rNd\u0081\u00ec?d\u00d0\u00f7D4\u00dbf\u00b6\u00bbW\u00ec@\u00d0\u001d\u001e\u0010\u00eb\u00da\u001ai\u00b2\u00af\u001e\u00fc\u00a8\u00a3-B\u0017\u009e\u00efs8\u0010z]\u00cd_\u00e5^C\u0093A~\u00b25C}\u00b3\u0082\u0096G\u0091\u00aa\u008a[\u008f8D\u00db=\u00c2\u00eamQ2M*\u00e0\u0010\u00f0\u001f\u00caw\u00fa\u00b0SF\u0092;N\u00de\u009e\u00b837j\u0097\t\u00101p\n}\t\u00da@\u00a7:\u00d4\u00f8\u00cd\u00a6Pd\u00f6@wI\u00b2A\u0096\u00931\u009ec\u00ff\u00d7r;\u0000Znb@\u001d\u00baMU\u00c0RD\u00a7z\u008b\u00c3\u00b9\u008d\u009d\u00e1\u00b2\u00157\u00c9\u00d8A\u009d\u008e\u00ed\u00db\u00f5\u000b\u0010F\u00cf\u0096\u00c6vss\u00aa\u0096?ME\u00fd\u00ed\u00b4\u00e3\u00d6\u0006";
                var8_6 = "Z>\u001b\u00ed1\u00e86\u00ff~2X\u00c5f*\u00fe\u00f2h\u0098\u00db\"d\u00cd\u00fe\u008a\u0084G7\u00bd\u00d7=mQ&gQ\u00df\u0002\u00e45q\u00bcp>$\u000bJj'q\u00f5O\u00ee\u0099\u00ca(H\u0013\u0089\u0004\u00c5}\u0084.\u008b \u00d1\u0083'f\u0017\u00c3?\u000fUdq(\u0082\u00c5\u00d8\"\u00caaZC\u00f44\u00ce\u0083\u0084s\u00f1\u00e9*\u0096\u00d2& \u00f1l\u00af\u00fa\u00fa\u0002tF\u0006\u00bevV\u0019\u00d33\u0005\u00e5\u00b3\u00fa\u001f=Px+\u00f6E^\u0084-\u00960\u00d5 \u00a6\u00f4\u00c3\u0017\u000fq\u00f0\u0098\u0080\u00a8\u0018rNd\u0081\u00ec?d\u00d0\u00f7D4\u00dbf\u00b6\u00bbW\u00ec@\u00d0\u001d\u001e\u0010\u00eb\u00da\u001ai\u00b2\u00af\u001e\u00fc\u00a8\u00a3-B\u0017\u009e\u00efs8\u0010z]\u00cd_\u00e5^C\u0093A~\u00b25C}\u00b3\u0082\u0096G\u0091\u00aa\u008a[\u008f8D\u00db=\u00c2\u00eamQ2M*\u00e0\u0010\u00f0\u001f\u00caw\u00fa\u00b0SF\u0092;N\u00de\u009e\u00b837j\u0097\t\u00101p\n}\t\u00da@\u00a7:\u00d4\u00f8\u00cd\u00a6Pd\u00f6@wI\u00b2A\u0096\u00931\u009ec\u00ff\u00d7r;\u0000Znb@\u001d\u00baMU\u00c0RD\u00a7z\u008b\u00c3\u00b9\u008d\u009d\u00e1\u00b2\u00157\u00c9\u00d8A\u009d\u008e\u00ed\u00db\u00f5\u000b\u0010F\u00cf\u0096\u00c6vss\u00aa\u0096?ME\u00fd\u00ed\u00b4\u00e3\u00d6\u0006".length();
                var5_7 = 64;
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
                    var9_3[var7_4++] = bm.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "2\u00c4l\u00b1\u00c9\u00af*\u00a2d\u00a9\u009aL\u009a\u0083\u0004I@\u009en\u007f;\u00d8\u00bb\u00a7\u0087A\u001d[\u00d6\u00fd+\u00fa\u00f4\u000e\u00e2\u00ab~(!4\u00eb\u001b\u00f4\t\u00e1$\u00ee%o\u00c4}m\u0017\u001d\u00d7@\u009c\u00cd/ego\u0095\u0087\u0017\u00f9cJ\u00cb\u00b8\u00b2_F\bxc3_\u0091\u0095\u00d0";
                    var8_6 = "2\u00c4l\u00b1\u00c9\u00af*\u00a2d\u00a9\u009aL\u009a\u0083\u0004I@\u009en\u007f;\u00d8\u00bb\u00a7\u0087A\u001d[\u00d6\u00fd+\u00fa\u00f4\u000e\u00e2\u00ab~(!4\u00eb\u001b\u00f4\t\u00e1$\u00ee%o\u00c4}m\u0017\u001d\u00d7@\u009c\u00cd/ego\u0095\u0087\u0017\u00f9cJ\u00cb\u00b8\u00b2_F\bxc3_\u0091\u0095\u00d0".length();
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
                    var9_3[var7_4++] = bm.c(var10_9).intern();
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
        bm.c = var9_3;
        bm.d = new String[10];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String c(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7D5E;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bm", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            bm.d[n2] = bm.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bm.b(n, l);
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
            throw new RuntimeException("com/zelix/bm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bm.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
