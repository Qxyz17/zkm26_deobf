/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._z;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.iq;
import com.zelix.k6;
import com.zelix.l6q;
import com.zelix.lb6;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o9;
import com.zelix.prr;
import com.zelix.ss;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ka
extends _z {
    private final ss E;
    private final int U;
    private static final long a = prr.a((long)-3802228163792733949L, (long)83404016436353344L, MethodHandles.lookup().lookupClass()).a(227119640078763L);
    private static final long c;

    public ka(k6 k62, int n, iq iq2, ss ss2) {
        super((_4)k62);
        this.k = iq2;
        this.U = n;
        this.E = ss2;
    }

    public int K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (int)c;
    }

    public int y(char c, long l) {
        long l2 = (long)c << 48 | l << 16 >>> 16;
        long l3 = l2 ^ 0x692D2DE0399AL;
        long l4 = l3 >>> 16;
        int n = (int)(l3 << 48 >>> 48);
        int n2 = 1;
        n2 += 2;
        return n2 += m44.a("s", (Object)((Object)this), (long)-1971609231265429936L, (long)l2).p(l4, (char)n);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    ka(int var1_1, _4 var2_2, h1 var3_3, l6q var4_4, l6q var5_5, PrintWriter var6_6, int var7_7, lb6 var8_8, Map var9_9, int var10_10, Map var11_11) {
        block15: {
            block16: {
                block14: {
                    block12: {
                        block13: {
                            v0 = var12_12 = ((long)var7_7 << 32 | (long)var10_10 << 32 >>> 32) ^ ka.a;
                            var14_13 = v0 ^ 90199812672229L;
                            var16_14 = v0 ^ 106932067373043L;
                            var18_15 = v0 ^ 90953338402868L;
                            var20_16 = v0 ^ 109824051435459L;
                            var22_17 = v0 ^ 26867228034510L;
                            v1 = m44.a("i", (long)3711132674084726631L, (long)var12_12);
                            super(var2_2);
                            var24_18 = v1;
                            var25_19 = o9.f((long)var14_13);
                            try {
                                try {
                                    this.U = var3_3.readUnsignedShort();
                                    v2 = new Object[9];
                                    v2[8] = var25_19;
                                    v2[7] = var18_15;
                                    v2[6] = var11_11;
                                    v2[5] = var9_9;
                                    v2[4] = var6_6;
                                    v2[3] = var5_5;
                                    v2[2] = var4_4;
                                    v2[1] = var3_3;
                                    v2[0] = (k6)var2_2;
                                    this.E = m44.a("i", (Object)v2, (long)4032717665181389887L, (long)var12_12);
                                    v3 /* !! */  = m44.a("v", (Object)m44.a("w", (Object)this, (long)3604899327591436532L, (long)var12_12), (Object)new Object[0], (long)2977020285305432100L, (long)var12_12);
                                    if (var24_18 != false) break block12;
                                    if (v3 /* !! */  != false) break block13;
                                }
                                catch (n9 v4) {
                                    throw m44.a("i", (Object)v4, (long)4023315908768176243L, (long)var12_12);
                                }
                                this.M = false;
                            }
                            catch (n9 v5) {
                                throw m44.a("i", (Object)v5, (long)4023315908768176243L, (long)var12_12);
                            }
                        }
                        v3 /* !! */  = (CallSite)var8_8.U(var20_16);
                    }
                    var26_20 = v3 /* !! */ ;
                    try {
                        try {
                            v6 = var24_18;
                            if (var10_10 > 0) ** GOTO lbl59
                            if (v6 != false) break block14;
                            if (var26_20 == -1) {
                            }
                            ** GOTO lbl60
                        }
                        catch (n9 v7) {
                            throw m44.a("i", (Object)v7, (long)4023315908768176243L, (long)var12_12);
                        }
                        this.H = (int)m44.a("w", (Object)this, (long)4008443479432841039L, (long)var12_12);
                    }
                    catch (n9 v8) {
                        throw m44.a("i", (Object)v8, (long)4023315908768176243L, (long)var12_12);
                    }
                }
                try {
                    if (var7_7 < 0) break block15;
                    v6 = var24_18;
lbl59:
                    // 2 sources

                    if (v6 == false) break block16;
lbl60:
                    // 2 sources

                    this.H = (int)(var26_20 + true + m44.a("w", (Object)this, (long)4008443479432841039L, (long)var12_12));
                }
                catch (n9 v9) {
                    throw m44.a("i", (Object)v9, (long)4023315908768176243L, (long)var12_12);
                }
            }
            var8_8.P(this.H);
            var4_4.t((Object)var25_19.e(var16_14, this.H), (Object)this, var22_17);
        }
    }

    protected void o(long l, DataOutputStream dataOutputStream, lb6 lb62, Map map) {
        long l2 = l;
        long l3 = l2 ^ 0x6E4306A5548EL;
        long l4 = l2 ^ 0x12C07DA49D12L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        dataOutputStream.writeByte((int)m44.a("w", (Object)((Object)this), (Object)objectArray, (long)6978654710417873387L, (long)l));
        dataOutputStream.writeShort((int)m44.a("v", (Object)((Object)this), (long)7102666056179389054L, (long)l));
        m44.a("v", (Object)((Object)this), (long)7437215294876976581L, (long)l).r(dataOutputStream, l3, map);
    }

    final void z(gu gu2, long l) {
        long l2 = l ^ 0L;
        m44.a("v", (Object)((Object)this), (long)5511949763603902093L, (long)l).z(gu2, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x3E34261A651DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -4853221244697931077L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
