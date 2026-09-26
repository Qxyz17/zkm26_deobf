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

public class kp
extends _z {
    final ss p;
    final int c;
    private static final long a = prr.a((long)8489733740342059866L, (long)-8405888808498565286L, MethodHandles.lookup().lookupClass()).a(101118176783549L);
    private static final long f;

    protected void o(long l, DataOutputStream dataOutputStream, lb6 lb62, Map map) {
        long l2 = l ^ 0x6E4306A5548EL;
        dataOutputStream.writeByte(this.c);
        this.p.r(dataOutputStream, l2, map);
    }

    public int y(char c, long l) {
        long l2 = (long)c << 48 | l << 16 >>> 16;
        long l3 = l2 ^ 0x692D2DE0399AL;
        long l4 = l3 >>> 16;
        int n = (int)(l3 << 48 >>> 48);
        int n2 = 1;
        return n2 += this.p.p(l4, (char)n);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    kp(int var1_1, _4 var2_2, h1 var3_3, l6q var4_4, l6q var5_5, PrintWriter var6_6, long var7_7, lb6 var9_8, Map var10_9, Map var11_10) {
        block15: {
            block16: {
                block14: {
                    block12: {
                        block13: {
                            v0 = var7_7 = kp.a ^ var7_7;
                            var12_11 = v0 ^ 140467142676647L;
                            var14_12 = v0 ^ 84152469378481L;
                            var16_13 = v0 ^ 140123048141430L;
                            var18_14 = v0 ^ 85943075573121L;
                            var20_15 = v0 ^ 58994772811660L;
                            super(var2_2);
                            this.c = var1_1;
                            var22_16 = m44.a("k", (long)8186077467620737234L, (long)var7_7);
                            var24_17 = o9.f((long)var12_11);
                            var23_18 = this.c - (int)kp.f;
                            try {
                                try {
                                    v1 = new Object[9];
                                    v1[8] = var24_17;
                                    v1[7] = var16_13;
                                    v1[6] = var11_10;
                                    v1[5] = var10_9;
                                    v1[4] = var6_6;
                                    v1[3] = var5_5;
                                    v1[2] = var4_4;
                                    v1[1] = var3_3;
                                    v1[0] = (k6)var2_2;
                                    this.p = m44.a("k", (Object)v1, (long)7905289119146380925L, (long)var7_7);
                                    v2 /* !! */  = m44.a("t", (Object)this.p, (Object)new Object[0], (long)8291881065068130918L, (long)var7_7);
                                    if (var22_16 == false) break block12;
                                    if (v2 /* !! */  != false) break block13;
                                }
                                catch (n9 v3) {
                                    throw m44.a("k", (Object)v3, (long)7981490715032451740L, (long)var7_7);
                                }
                                this.M = false;
                            }
                            catch (n9 v4) {
                                throw m44.a("k", (Object)v4, (long)7981490715032451740L, (long)var7_7);
                            }
                        }
                        v2 /* !! */  = (CallSite)var9_8.U(var18_14);
                    }
                    var25_19 = v2 /* !! */ ;
                    try {
                        try {
                            v5 = var22_16;
                            if (var7_7 < 0L) ** GOTO lbl59
                            if (v5 == false) break block14;
                            if (var25_19 == -1) {
                            }
                            ** GOTO lbl60
                        }
                        catch (n9 v6) {
                            throw m44.a("k", (Object)v6, (long)7981490715032451740L, (long)var7_7);
                        }
                        this.H = var23_18;
                    }
                    catch (n9 v7) {
                        throw m44.a("k", (Object)v7, (long)7981490715032451740L, (long)var7_7);
                    }
                }
                try {
                    if (var7_7 <= 0L) break block15;
                    v5 = var22_16;
lbl59:
                    // 2 sources

                    if (v5 != false) break block16;
lbl60:
                    // 2 sources

                    this.H = (int)(var25_19 + true + var23_18);
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)7981490715032451740L, (long)var7_7);
                }
            }
            var9_8.P(this.H);
            var4_4.t((Object)var24_17.e(var14_12, this.H), (Object)this, var20_15);
        }
    }

    public kp(k6 k62, int n, iq iq2, ss ss2) {
        super((_4)k62);
        this.k = iq2;
        this.c = n;
        this.p = ss2;
    }

    final void z(gu gu2, long l) {
        long l2 = l ^ 0L;
        this.p.z(gu2, l2);
    }

    public int K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x6F084341BCD3L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 912863230379472652L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                f = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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
