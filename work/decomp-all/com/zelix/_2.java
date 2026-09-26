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

public class _2
extends _z {
    private final ss[] c;
    private final int E;
    private final int r;
    private static final long a = prr.a((long)878384631896977242L, (long)-8118846211742560152L, MethodHandles.lookup().lookupClass()).a(258166768876544L);
    private static final long f;

    public int y(char c, long l) {
        int n;
        block3: {
            long l2 = (long)c << 48 | l << 16 >>> 16;
            long l3 = l2 ^ 0x692D2DE0399AL;
            long l4 = l3 >>> 16;
            int n2 = (int)(l3 << 48 >>> 48);
            int n3 = 1;
            n3 += 2;
            CallSite callSite = m44.a("s", (Object)((Object)this), (long)-1733658927070931471L, (long)l2);
            CallSite callSite2 = m44.a("m", (long)-181088659291206604L, (long)l2);
            int n4 = ((CallSite)callSite).length;
            int n5 = 0;
            while (n5 < n4) {
                CallSite callSite3 = callSite[n5];
                Object object = n3 + callSite3.p(l4, (char)n2);
                if (c >= '\u0000') {
                    if (callSite2 == false) break block3;
                    n3 = object;
                    ++n5;
                    object = callSite2;
                }
                if (object != 0) continue;
            }
            n = n3;
        }
        return n;
    }

    protected void o(long l, DataOutputStream dataOutputStream, lb6 lb62, Map map) {
        long l2 = l ^ 0x6E4306A5548EL;
        CallSite callSite = m44.a("h", (long)7399960369771655766L, (long)l);
        dataOutputStream.writeByte((int)m44.a("v", (Object)((Object)this), (long)7462033103525301800L, (long)l));
        dataOutputStream.writeShort((int)m44.a("v", (Object)((Object)this), (long)8760331049929785360L, (long)l));
        CallSite callSite2 = m44.a("v", (Object)((Object)this), (long)7234446029883774564L, (long)l);
        int n = ((CallSite)callSite2).length;
        CallSite callSite3 = callSite;
        for (int i = 0; i < n; ++i) {
            CallSite callSite4 = callSite2[i];
            callSite4.r(dataOutputStream, l2, map);
            if (callSite3 == false) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    _2(int var1_1, _4 var2_2, h1 var3_3, l6q var4_4, long var5_5, l6q var7_6, PrintWriter var8_7, lb6 var9_8, Map var10_9, Map var11_10) {
        block23: {
            block24: {
                block22: {
                    block20: {
                        v0 = var5_5 = _2.a ^ var5_5;
                        var12_11 = v0 ^ 65655897723646L;
                        var14_12 = v0 ^ 9891248412648L;
                        var16_13 = v0 ^ 64902505963567L;
                        var18_14 = v0 ^ 11397034397656L;
                        var20_15 = v0 ^ 125140048829909L;
                        v1 = m44.a("j", (long)3729981469881221771L, (long)var5_5);
                        super(var2_2);
                        var22_16 = v1;
                        this.E = var1_1;
                        var23_17 = o9.f((long)var12_11);
                        this.r = var3_3.readUnsignedShort();
                        var24_18 = m44.a("t", (Object)this, (long)3072713969886462722L, (long)var5_5) - (int)_2.f;
                        this.c = new ss[var24_18];
                        var25_19 = 0;
                        while (var25_19 < var24_18) {
                            block18: {
                                block19: {
                                    block21: {
                                        try {
                                            try {
                                                try {
                                                    v2 = new Object[9];
                                                    v2[8] = var23_17;
                                                    v2[7] = var16_13;
                                                    v2[6] = var11_10;
                                                    v2[5] = var10_9;
                                                    v2[4] = var8_7;
                                                    v2[3] = var7_6;
                                                    v2[2] = var4_4;
                                                    v2[1] = var3_3;
                                                    v2[0] = (k6)var2_2;
                                                    m44.a("t", (Object)this, (long)2976849480975342414L, (long)var5_5)[var25_19] = m44.a("j", (Object)v2, (long)3453274542123338788L, (long)var5_5);
                                                    v3 = var22_16;
                                                    while (true) {
                                                        if (var5_5 < 0L) break block18;
                                                        if (v3 == false) break block19;
                                                        v4 /* !! */  = (int)m44.a("u", (Object)m44.a("t", (Object)this, (long)2976849480975342414L, (long)var5_5)[var25_19], (Object)new Object[0], (long)3552189547632537663L, (long)var5_5);
                                                        v5 /* !! */  = (int)var22_16;
                                                        if (var5_5 >= 0L) {
                                                            if (v5 /* !! */  == 0) break block20;
                                                        }
                                                        ** GOTO lbl73
                                                        break;
                                                    }
                                                }
                                                catch (n9 v6) {
                                                    throw m44.a("j", (Object)v6, (long)3598440347556017840L, (long)var5_5);
                                                }
                                                if (v4 /* !! */  != 0) break block21;
                                            }
                                            catch (n9 v7) {
                                                throw m44.a("j", (Object)v7, (long)3598440347556017840L, (long)var5_5);
                                            }
                                            this.M = false;
                                        }
                                        catch (n9 v8) {
                                            throw m44.a("j", (Object)v8, (long)3598440347556017840L, (long)var5_5);
                                        }
                                    }
                                    ++var25_19;
                                }
                                v3 = var22_16;
                            }
                            if (v3 != false) continue;
                        }
                        var25_19 = var9_8.U(var18_14);
                        try {
                            v9 = var22_16;
                            if (var5_5 < 0L) ** continue;
                            if (var5_5 > 0L) {
                                if (v9 == false) break block22;
                                v4 /* !! */  = var25_19;
                            }
                            ** GOTO lbl83
                        }
                        catch (n9 v10) {
                            throw m44.a("j", (Object)v10, (long)3598440347556017840L, (long)var5_5);
                        }
                    }
                    try {
                        v5 /* !! */  = -1;
lbl73:
                        // 2 sources

                        if (v4 /* !! */  == v5 /* !! */ ) {
                            this.H = (int)m44.a("t", (Object)this, (long)3799063559435029818L, (long)var5_5);
                        }
                        ** GOTO lbl84
                    }
                    catch (n9 v11) {
                        throw m44.a("j", (Object)v11, (long)3598440347556017840L, (long)var5_5);
                    }
                }
                try {
                    if (var5_5 <= 0L) break block23;
                    v12 = var22_16;
lbl83:
                    // 2 sources

                    if (v12 != false) break block24;
lbl84:
                    // 2 sources

                    this.H = var25_19 + 1 + m44.a("t", (Object)this, (long)3799063559435029818L, (long)var5_5);
                }
                catch (n9 v13) {
                    throw m44.a("j", (Object)v13, (long)3598440347556017840L, (long)var5_5);
                }
            }
            var9_8.P(this.H);
            var4_4.t((Object)var23_17.e(var14_12, this.H), (Object)this, var20_15);
        }
    }

    public int K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (int)m44.a("t", (Object)((Object)this), (long)-388324064857402566L, (long)l);
    }

    public ss[] z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (ss[])m44.a("t", (Object)((Object)this), (long)-4161411710513138626L, (long)l).clone();
    }

    public _2(k6 k62, int n, int n2, iq iq2, ss[] ssArray) {
        super((_4)k62);
        this.E = n;
        this.k = iq2;
        this.r = n2;
        this.c = ssArray;
    }

    final void z(gu gu2, long l) {
        long l2 = l ^ 0L;
        CallSite callSite = m44.a("v", (Object)((Object)this), (long)5705428125293428012L, (long)l);
        CallSite callSite2 = m44.a("h", (long)6170399952317654249L, (long)l);
        for (CallSite callSite3 : callSite) {
            callSite3.z(gu2, l2);
            if (callSite2 != false) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x30171EE6A4BEL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -6021102964103369425L;
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
