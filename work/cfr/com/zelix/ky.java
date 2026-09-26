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
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ky
extends _z {
    final int u;
    private static final long a = prr.a(895981150746798825L, 7186977152316616235L, MethodHandles.lookup().lookupClass()).a(42374296019076L);
    private static final long c;

    /*
     * Unable to fully structure code
     */
    ky(int var1_1, _4 var2_2, h1 var3_3, long var4_4, l6q var6_5, l6q var7_6, PrintWriter var8_7, lb6 var9_8, Map var10_9, Map var11_10) {
        block9: {
            block10: {
                block8: {
                    v0 = var4_4 = ky.a ^ var4_4;
                    var12_11 = v0 ^ 45865180950522L;
                    var14_12 = v0 ^ 29680807602924L;
                    var16_13 = v0 ^ 26791763292892L;
                    var18_14 = v0 ^ 109745366048977L;
                    super(var2_2);
                    var21_15 = o9.f(var12_11);
                    this.u = var3_3.readUnsignedShort();
                    var22_16 = var9_8.U(var16_13);
                    var20_17 = m44.a("n", (long)5676677800424652687L, (long)var4_4);
                    try {
                        try {
                            if (var20_17 == false) break block8;
                            if (var22_16 == -1) {
                            }
                            ** GOTO lbl28
                        }
                        catch (n9 v1) {
                            throw m44.a("n", (Object)v1, (long)5436322662596264163L, (long)var4_4);
                        }
                        this.H = (int)m44.a("p", (Object)this, (long)6078022163505938363L, (long)var4_4);
                    }
                    catch (n9 v2) {
                        throw m44.a("n", (Object)v2, (long)5436322662596264163L, (long)var4_4);
                    }
                }
                try {
                    if (var4_4 < 0L) break block9;
                    if (var20_17 != false) break block10;
lbl28:
                    // 2 sources

                    this.H = var22_16 + 1 + m44.a("p", (Object)this, (long)6078022163505938363L, (long)var4_4);
                }
                catch (n9 v3) {
                    throw m44.a("n", (Object)v3, (long)5436322662596264163L, (long)var4_4);
                }
            }
            var9_8.P(this.H);
            var6_5.t(var21_15.e(var14_12, this.H), this, var18_14);
        }
    }

    public ky(k6 k62, iq iq2, int n10) {
        super(k62);
        this.k = iq2;
        this.u = n10;
        this.M = true;
    }

    @Override
    protected void o(long l10, DataOutputStream dataOutputStream, lb6 lb62, Map map) {
        long l11 = l10 ^ 0x12C07DA49D12L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        dataOutputStream.writeByte((int)m44.a("w", (Object)this, (Object)objectArray, (long)7393733010169429263L, (long)l10));
        dataOutputStream.writeShort((int)m44.a("v", (Object)this, (long)7239365380630499221L, (long)l10));
    }

    @Override
    final void z(gu gu2, long l10) {
    }

    @Override
    public int y(char c10, long l10) {
        int n10 = 1;
        return n10 += 2;
    }

    @Override
    public int K(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (int)c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0xF29EDE03032L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -5599580570172551498L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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

