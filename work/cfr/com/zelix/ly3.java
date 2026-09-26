/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lkz;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lwr;
import com.zelix.lyn;
import com.zelix.m44;
import com.zelix.prr;
import java.io.IOException;
import java.io.InputStream;
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

public class ly3
extends lyn {
    String U;
    private static final long a;
    private static final String[] e;
    private static final String[] f;
    private static final Map g;

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x43EA633718BEL;
        long l13 = l11 ^ 0L;
        long l14 = l11 ^ 0x408CF84350F9L;
        long l15 = l11 ^ 0x1A86BD711C75L;
        long l16 = l11 ^ 0x2C69CF006FB0L;
        long l17 = l11 ^ 0x47526B4E5A06L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l17;
        CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
        lwr lwr2 = (lwr)this.V(0);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l16;
        CallSite callSite2 = m44.a("w", (Object)lqu2, (Object)objectArray3, (long)-6410373196425327712L, (long)l10);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l12;
        CallSite callSite3 = m44.a("w", (Object)lqu2, (Object)objectArray4, (long)-5092376014320582940L, (long)l10);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l14;
        CallSite callSite4 = m44.a("w", (Object)lqu2, (Object)objectArray5, (long)-5139488470093813520L, (long)l10);
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = l13;
        objectArray6[1] = lqu2;
        objectArray6[0] = this;
        m44.a("w", (Object)lwr2, (Object)objectArray6, (long)-4740954200097092079L, (long)l10);
        m44.a("t", (Object)this, (String)((Object)m44.a("w", (Object)lwr2, (Object)new Object[0], (long)-4968184746715213117L, (long)l10)), (long)-5106530567656490893L, (long)l10);
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = (int)callSite4;
        objectArray7[3] = (int)callSite3;
        objectArray7[2] = l15;
        objectArray7[1] = (int)callSite2;
        objectArray7[0] = lqu2;
        m44.a("w", (Object)this, (Object)objectArray7, (long)-6696292234793046670L, (long)l10);
    }

    public ly3(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x392B657D6455L;
        super(l11, n10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void m(Object[] var1_1) {
        block42: {
            block40: {
                var7_2 = (lqu)var1_1[0];
                var4_3 = (Integer)var1_1[1];
                var5_4 = (Long)var1_1[2];
                var2_5 = (Integer)var1_1[3];
                var3_6 = (Integer)var1_1[4];
                v0 = var5_4;
                var8_7 = v0 ^ 139052689147471L;
                var10_8 = v0 ^ 86555404386089L;
                var12_9 = v0 ^ 117183604112065L;
                var14_10 = v0 ^ 41228634740897L;
                var16_11 = v0 ^ 32452763901518L;
                v1 = new Object[1];
                v1[0] = var14_10;
                var19_12 = m44.a("r", (Object)var7_2, (Object)v1, (long)-4963623474998811189L, (long)var5_4);
                v2 = new Object[1];
                v2[0] = var16_11;
                var20_13 = m44.a("m", (Object)v2, (long)-6429108569517432985L, (long)var5_4);
                var18_14 = m44.a("m", (long)-6521875426121538117L, (long)var5_4);
                var21_15 = (String)var20_13 + (String)ly3.b("i", (int)13485, (long)(1519154334766150893L ^ var5_4));
                var19_12.println(var21_15 + (String)ly3.b("i", (int)25356, (long)(2811840442736206664L ^ var5_4)) + (String)m44.a("s", (Object)this, (long)-6533334343289920506L, (long)var5_4) + "]");
                m44.a("r", (Object)m44.a("i", (long)-6626972079646401238L, (long)var5_4), (Object)var21_15, (long)-4650195723326610078L, (long)var5_4);
                var22_16 = m44.a("m", (long)-4992281869728831884L, (long)var5_4);
                var23_17 = null;
                var24_18 = null;
                try {
                    block43: {
                        block38: {
                            block39: {
                                block35: {
                                    block36: {
                                        block37: {
                                            block47: {
                                                block46: {
                                                    block45: {
                                                        block44: {
                                                            block33: {
                                                                block34: {
                                                                    try {
                                                                        v3 = m44.a("i", (long)-6348403953969857996L, (long)var5_4).startsWith((String)ly3.b("i", (int)8567, (long)(7323812795726340404L ^ var5_4)));
                                                                        if (var18_14 == false) break block33;
                                                                        if (v3 == 0) break block34;
                                                                    }
                                                                    catch (InterruptedException v4) {
                                                                        throw m44.a("m", (Object)v4, (long)-4873665316658290046L, (long)var5_4);
                                                                    }
                                                                    var24_18 = ly3.b("i", (int)15685, (long)(9208984462814657803L ^ var5_4));
                                                                    break block43;
                                                                }
                                                                try {
                                                                    v5 = m44.a("i", (long)-6348403953969857996L, (long)var5_4);
                                                                    v6 /* !! */  = var18_14;
                                                                    if (var5_4 >= 0L) {
                                                                        if (v6 /* !! */  == false) break block35;
                                                                        v6 /* !! */  = (CallSite)6511;
                                                                    }
                                                                    v3 = (int)v5.startsWith((String)ly3.b("i", (int)v6 /* !! */ , (long)(2744123252053252387L ^ var5_4)));
                                                                }
                                                                catch (InterruptedException v7) {
                                                                    throw m44.a("m", (Object)v7, (long)-4873665316658290046L, (long)var5_4);
                                                                }
                                                            }
                                                            if (var5_4 <= 0L) break block36;
                                                            if (v3 != 0) break block37;
                                                            v5 = m44.a("i", (long)-6348403953969857996L, (long)var5_4);
                                                            if (var18_14 == false) break block35;
                                                            break block44;
                                                            catch (InterruptedException v8) {
                                                                throw m44.a("m", (Object)v8, (long)-4873665316658290046L, (long)var5_4);
                                                            }
                                                        }
                                                        v3 = (int)v5.startsWith((String)ly3.b("i", (int)20637, (long)(447007745745047762L ^ var5_4)));
                                                        if (var5_4 < 0L) break block36;
                                                        if (v3 != 0) break block37;
                                                        break block45;
                                                        catch (InterruptedException v9) {
                                                            throw m44.a("m", (Object)v9, (long)-4873665316658290046L, (long)var5_4);
                                                        }
                                                    }
                                                    v5 = m44.a("i", (long)-6348403953969857996L, (long)var5_4);
                                                    if (var18_14 == false) break block35;
                                                    break block46;
                                                    catch (InterruptedException v10) {
                                                        throw m44.a("m", (Object)v10, (long)-4873665316658290046L, (long)var5_4);
                                                    }
                                                }
                                                v3 = (int)v5.startsWith((String)ly3.b("i", (int)16327, (long)(8286911183297593216L ^ var5_4)));
                                                if (var5_4 < 0L) break block36;
                                                if (v3 != 0) break block37;
                                                break block47;
                                                catch (InterruptedException v11) {
                                                    throw m44.a("m", (Object)v11, (long)-4873665316658290046L, (long)var5_4);
                                                }
                                            }
                                            try {
                                                block48: {
                                                    v12 = m44.a("i", (long)-6348403953969857996L, (long)var5_4).startsWith((String)ly3.b("i", (int)20037, (long)(4446066364506983944L ^ var5_4)));
                                                    if (var18_14 == false) break block38;
                                                    break block48;
                                                    catch (InterruptedException v13) {
                                                        throw m44.a("m", (Object)v13, (long)-4873665316658290046L, (long)var5_4);
                                                    }
                                                }
                                                if (!v12) break block39;
                                            }
                                            catch (InterruptedException v14) {
                                                throw m44.a("m", (Object)v14, (long)-4873665316658290046L, (long)var5_4);
                                            }
                                        }
                                        v3 = 32016;
                                    }
                                    v5 = ly3.b("i", (int)v3, (long)(2715268096543587674L ^ var5_4));
                                }
                                var24_18 = v5;
                                break block43;
                            }
                            try {
                                block49: {
                                    v15 = m44.a("i", (long)-6348403953969857996L, (long)var5_4);
                                    v16 /* !! */  = var18_14;
                                    if (var5_4 < 0L) break block49;
                                    if (v16 /* !! */  == false) ** GOTO lbl120
                                    v16 /* !! */  = (CallSite)800;
                                }
                                v12 = v15.startsWith((String)ly3.b("i", (int)v16 /* !! */ , (long)(6629941336324178786L ^ var5_4)));
                            }
                            catch (InterruptedException v17) {
                                throw m44.a("m", (Object)v17, (long)-4873665316658290046L, (long)var5_4);
                            }
                        }
                        if (v12) {
                            var24_18 = ly3.b("i", (int)524, (long)(4274160522494018122L ^ var5_4));
                        } else {
                            v15 = "";
lbl120:
                            // 2 sources

                            var24_18 = v15;
                        }
                    }
                    var23_17 = m44.a("r", (Object)var22_16, (Object)((String)var24_18 + (String)m44.a("s", (Object)this, (long)-6533334343289920506L, (long)var5_4)), (long)-6901090939925482373L, (long)var5_4);
                    var25_19 = new lkz((InputStream)m44.a("r", (Object)var23_17, (long)-5093248039686031359L, (long)var5_4), (PrintWriter)var19_12, var20_13.length() + 1, true, var12_9);
                    var26_23 = new lkz((InputStream)m44.a("r", (Object)var23_17, (long)-6545423081317862373L, (long)var5_4), (PrintWriter)var19_12, var20_13.length() + 1, false, var12_9);
                    try {
                        m44.a("r", (Object)var25_19, (long)-4621829707186068180L, (long)var5_4);
                        m44.a("r", (Object)var26_23, (long)-4621829707186068180L, (long)var5_4);
                        v18 /* !! */  = var18_14;
                        if (var5_4 > 0L) {
                            if (v18 /* !! */  == false) break block40;
                            v18 /* !! */  = (CallSite)m44.a("i", (long)-4661280946630894594L, (long)var5_4).startsWith((String)ly3.b("i", (int)11144, (long)(3747351275329596353L ^ var5_4)));
                        }
                        if (v18 /* !! */  != false) break block40;
                    }
                    catch (InterruptedException v19) {
                        throw m44.a("m", (Object)v19, (long)-4873665316658290046L, (long)var5_4);
                    }
                    try {
                        m44.a("r", (Object)var25_19, (long)-4755926796783423197L, (long)var5_4);
                        m44.a("r", (Object)var26_23, (long)-4755926796783423197L, (long)var5_4);
                    }
                    catch (InterruptedException var27_24) {}
                }
                catch (IOException var25_20) {
                    v20 = new Object[1];
                    v20[0] = var8_7;
                    v21 = new Object[2];
                    v21[1] = var10_8;
                    v21[0] = (String)m44.a("r", (Object)this, (Object)v20, (long)-6375394569998293984L, (long)var5_4) + (String)ly3.b("i", (int)6914, (long)(3457247268004830025L ^ var5_4)) + (String)var24_18 + (String)m44.a("s", (Object)this, (long)-6533334343289920506L, (long)var5_4) + (String)ly3.b("i", (int)18704, (long)(8886660022911289685L ^ var5_4)) + (String)m44.a("r", (Object)var25_20, (long)-4804274569044548174L, (long)var5_4) + "'";
                    m44.a("r", (Object)var7_2, (Object)v21, (long)-4793997075062359565L, (long)var5_4);
                }
            }
            try {
                block41: {
                    try {
                        v22 = var23_17;
                        if (var18_14 == false) break block41;
                        if (v22 == null) break block42;
                    }
                    catch (InterruptedException v23) {
                        throw m44.a("m", (Object)v23, (long)-4873665316658290046L, (long)var5_4);
                    }
                    v22 = var23_17;
                }
                var25_21 = m44.a("r", (Object)v22, (long)-6765353176893537034L, (long)var5_4);
            }
            catch (InterruptedException var25_22) {
                // empty catch block
            }
        }
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return ly3.b("i", (int)533, (long)(0x15527933CC4DC41BL ^ l10));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                ly3.a = prr.a(2398723644195619164L, 2463981553894451498L, MethodHandles.lookup().lookupClass()).a(199876878909605L);
                ly3.g = new HashMap<K, V>(13);
                var0 = ly3.a ^ 20873156528455L;
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
                var9_3 = new String[15];
                var7_4 = 0;
                var6_5 = "\u00ba\u00ec\u0081\u00dc\u009e\f\u00a0PitP\u008a\u0090\b\u00d37\u00e1^YW\u00b4\u0095v\u00dd\u0010\u009b\u00c2\u00a3BHl\u00cco\u0015+\u0013\u00b7\u001c\u00b7\u008cc\u0010H\u0001}:\u0097\u00bf\u00bcp\u00a0O\u00b3\u00ddg\u00cf\u0003\u0092\u0010vtH\u00de(\u0082\u00ee%L\u00f1]m\u000eG\u000fo \u00d8IL1\u00ca\u0017`'\u00e2\u00aa<c/[\u00da\u00e62\b\u00e9\u00f8P|&\u00a2FmE\u00fb\u00b2\u0094)m\u0010\u00c3\u00ac$\u00d6\u00c8\u0090\u00ae\u00ee\u00c1G\u00d1\u0018\u00ad&\u008a\u0099\u0010\u00b1\u0015|\u00d4\u0080C\f\u001e\u008e\u00f7\u0010\u00d3H\u00d8\u0002\u0019(-\u009c\u0002~\u0098\u00dd'\u0085\u00ded\u00af\u0095}f`\u00de\u0087b\u0010\u0086#\u00a8\u0082\u00d2j\u001f\u0000\u008b\u00bd8\u0014\u009f\u00a9K\u0007\u00b7\u0099*\u0099\u001c ,\u0080\u00cf\u001f\u00b2!U1R\u001d~/\u001c\u00b9[St\u00e2\u00a6v\u00ee\u001a\u00afl\u00d3\u0084&\u00f5\u0085\u00f1\u00c6~ T \u00e0\u00a8.6\u00e3\u00a9\u00c2'\u00da\u00c2\u00fez\u00d3\u00fb\u000e\u00c5B\u00b1\u00d6\u008bG\u0092\"qb\u0097\u009c\u0006\u00afP\u0010\u008c\u00e0\u001f\f\u00ed\u0090L\u00a4>%\u00ee\u00f8W\u00bc\u00ed\u0011\u0018\u00db_\u00eb'Y\u00ac\u00a2j\u00e9\u0012\u00afV\u0000nr\u00e9f\u001cO\u00ba\u008e\u0080\u00ddJ\u0018el-\u007f\u00bc\u00e1M\u00c2\"\u000e\u0080\u0085\u00d7b\u00b3\u00d0\u00c8\u00f4b\u00b1\u00d57\u00c9\u00bc";
                var8_6 = "\u00ba\u00ec\u0081\u00dc\u009e\f\u00a0PitP\u008a\u0090\b\u00d37\u00e1^YW\u00b4\u0095v\u00dd\u0010\u009b\u00c2\u00a3BHl\u00cco\u0015+\u0013\u00b7\u001c\u00b7\u008cc\u0010H\u0001}:\u0097\u00bf\u00bcp\u00a0O\u00b3\u00ddg\u00cf\u0003\u0092\u0010vtH\u00de(\u0082\u00ee%L\u00f1]m\u000eG\u000fo \u00d8IL1\u00ca\u0017`'\u00e2\u00aa<c/[\u00da\u00e62\b\u00e9\u00f8P|&\u00a2FmE\u00fb\u00b2\u0094)m\u0010\u00c3\u00ac$\u00d6\u00c8\u0090\u00ae\u00ee\u00c1G\u00d1\u0018\u00ad&\u008a\u0099\u0010\u00b1\u0015|\u00d4\u0080C\f\u001e\u008e\u00f7\u0010\u00d3H\u00d8\u0002\u0019(-\u009c\u0002~\u0098\u00dd'\u0085\u00ded\u00af\u0095}f`\u00de\u0087b\u0010\u0086#\u00a8\u0082\u00d2j\u001f\u0000\u008b\u00bd8\u0014\u009f\u00a9K\u0007\u00b7\u0099*\u0099\u001c ,\u0080\u00cf\u001f\u00b2!U1R\u001d~/\u001c\u00b9[St\u00e2\u00a6v\u00ee\u001a\u00afl\u00d3\u0084&\u00f5\u0085\u00f1\u00c6~ T \u00e0\u00a8.6\u00e3\u00a9\u00c2'\u00da\u00c2\u00fez\u00d3\u00fb\u000e\u00c5B\u00b1\u00d6\u008bG\u0092\"qb\u0097\u009c\u0006\u00afP\u0010\u008c\u00e0\u001f\f\u00ed\u0090L\u00a4>%\u00ee\u00f8W\u00bc\u00ed\u0011\u0018\u00db_\u00eb'Y\u00ac\u00a2j\u00e9\u0012\u00afV\u0000nr\u00e9f\u001cO\u00ba\u008e\u0080\u00ddJ\u0018el-\u007f\u00bc\u00e1M\u00c2\"\u000e\u0080\u0085\u00d7b\u00b3\u00d0\u00c8\u00f4b\u00b1\u00d57\u00c9\u00bc".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = ly3.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00c8\u00a4`\u0086\u00f3:lZI\u001a\u0089\u008c_\u0082\u00a6\u008c 2\u00fb\f\u00a6\u0007g\u00b3\u009a\u00b1\u00f5b\u0084\u0007\u001d}[\u00d7\u00d5\u000b\u0006'\u00fe\u009d\u00b5\u00b3\u00b8\u00b8{1\u0096}\u009d";
                    var8_6 = "\u00c8\u00a4`\u0086\u00f3:lZI\u001a\u0089\u008c_\u0082\u00a6\u008c 2\u00fb\f\u00a6\u0007g\u00b3\u009a\u00b1\u00f5b\u0084\u0007\u001d}[\u00d7\u00d5\u000b\u0006'\u00fe\u009d\u00b5\u00b3\u00b8\u00b8{1\u0096}\u009d".length();
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
                    var9_3[var7_4++] = ly3.c(var10_9).intern();
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
        ly3.e = var9_3;
        ly3.f = new String[15];
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x29A5;
        if (f[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ly3", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n11].getBytes("ISO-8859-1");
            ly3.f[n11] = ly3.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ly3.b(n10, l10);
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
            throw new RuntimeException("com/zelix/ly3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ly3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

