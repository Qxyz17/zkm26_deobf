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
    private static final long a = prr.a(878384631896977242L, -8118846211742560152L, MethodHandles.lookup().lookupClass()).a(258166768876544L);
    private static final long f;

    @Override
    public int y(char c10, long l10) {
        int n10;
        block3: {
            long l11 = (long)c10 << 48 | l10 << 16 >>> 16;
            long l12 = l11 ^ 0x692D2DE0399AL;
            long l13 = l12 >>> 16;
            int n11 = (int)(l12 << 48 >>> 48);
            int n12 = 1;
            n12 += 2;
            CallSite callSite = m44.a("s", (Object)this, (long)-1733658927070931471L, (long)l11);
            CallSite callSite2 = m44.a("m", (long)-181088659291206604L, (long)l11);
            int n13 = ((CallSite)callSite).length;
            int n14 = 0;
            while (n14 < n13) {
                CallSite callSite3 = callSite[n14];
                Object object = n12 + ((ss)((Object)callSite3)).p(l13, (char)n11);
                if (c10 >= '\u0000') {
                    if (callSite2 == false) break block3;
                    n12 = object;
                    ++n14;
                    object = callSite2;
                }
                if (object != 0) continue;
            }
            n10 = n12;
        }
        return n10;
    }

    @Override
    protected void o(long l10, DataOutputStream dataOutputStream, lb6 lb62, Map map) {
        long l11 = l10 ^ 0x6E4306A5548EL;
        CallSite callSite = m44.a("h", (long)7399960369771655766L, (long)l10);
        dataOutputStream.writeByte((int)m44.a("v", (Object)this, (long)7462033103525301800L, (long)l10));
        dataOutputStream.writeShort((int)m44.a("v", (Object)this, (long)8760331049929785360L, (long)l10));
        CallSite callSite2 = m44.a("v", (Object)this, (long)7234446029883774564L, (long)l10);
        int n10 = ((CallSite)callSite2).length;
        CallSite callSite3 = callSite;
        for (int i10 = 0; i10 < n10; ++i10) {
            CallSite callSite4 = callSite2[i10];
            ((ss)((Object)callSite4)).r(dataOutputStream, l11, map);
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
                        var23_17 = o9.f(var12_11);
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
            var4_4.t(var23_17.e(var14_12, this.H), this, var20_15);
        }
    }

    @Override
    public int K(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (int)m44.a("t", (Object)this, (long)-388324064857402566L, (long)l10);
    }

    public ss[] z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (ss[])m44.a("t", (Object)this, (long)-4161411710513138626L, (long)l10).clone();
    }

    public _2(k6 k62, int n10, int n11, iq iq2, ss[] ssArray) {
        super(k62);
        this.E = n10;
        this.k = iq2;
        this.r = n11;
        this.c = ssArray;
    }

    @Override
    final void z(gu gu2, long l10) {
        long l11 = l10 ^ 0L;
        CallSite callSite = m44.a("v", (Object)this, (long)5705428125293428012L, (long)l10);
        CallSite callSite2 = m44.a("h", (long)6170399952317654249L, (long)l10);
        for (CallSite callSite3 : callSite) {
            ((ss)((Object)callSite3)).z(gu2, l11);
            if (callSite2 != false) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x30171EE6A4BEL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -6021102964103369425L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                f = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

