/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.rv;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rk
extends KeyAdapter {
    final rv W;
    private static final long a = prr.a((long)8113834550150622491L, (long)7294835563745703379L, MethodHandles.lookup().lookupClass()).a(194568625195345L);
    private static final long b;

    /*
     * Unable to fully structure code
     */
    @Override
    public void keyPressed(KeyEvent var1_1) {
        block13: {
            block14: {
                block12: {
                    v0 = var2_2 = rk.a ^ 103885782800873L;
                    var4_3 = v0 ^ 139152548617665L;
                    var6_4 = v0 ^ 2162683687184L;
                    var8_5 = v0 ^ 9566845557354L;
                    var10_6 = m44.a("j", (long)1677346279829037495L, (long)var2_2);
                    try {
                        try {
                            v1 = var1_1;
                            if (var10_6 != null) break block12;
                            if (m44.a("u", (Object)v1, (long)1398840876193547837L, (long)var2_2) != (int)rk.b) break block13;
                        }
                        catch (n9 v2) {
                            throw m44.a("j", (Object)v2, (long)1071350920358999427L, (long)var2_2);
                        }
                        v3 = new Object[1];
                        v3[0] = var4_3;
                        m44.a("u", (Object)m44.a("t", (Object)this, (long)1055635023532233981L, (long)var2_2), (Object)v3, (long)1292081471702080227L, (long)var2_2);
                        v1 = m44.a("u", (Object)var1_1, (long)1352797379637595241L, (long)var2_2);
                    }
                    catch (n9 v4) {
                        throw m44.a("j", (Object)v4, (long)1071350920358999427L, (long)var2_2);
                    }
                }
                var11_7 = v1;
                try {
                    try {
                        if (var10_6 != null) break block14;
                        if (var11_7 == m44.a("t", (Object)m44.a("t", (Object)this, (long)1055635023532233981L, (long)var2_2), (long)798325307069373138L, (long)var2_2)) {
                        }
                        ** GOTO lbl44
                    }
                    catch (n9 v5) {
                        throw m44.a("j", (Object)v5, (long)1071350920358999427L, (long)var2_2);
                    }
                    v6 = new Object[2];
                    v6[1] = m44.a("t", (Object)m44.a("t", (Object)this, (long)1055635023532233981L, (long)var2_2), (long)770883444632967664L, (long)var2_2);
                    v6[0] = var6_4;
                    m44.a("u", (Object)m44.a("t", (Object)m44.a("t", (Object)this, (long)1055635023532233981L, (long)var2_2), (long)1684103483623656250L, (long)var2_2), (Object)v6, (long)1386305631979000333L, (long)var2_2);
                }
                catch (n9 v7) {
                    throw m44.a("j", (Object)v7, (long)1071350920358999427L, (long)var2_2);
                }
            }
            try {
                if (var10_6 == null) break block13;
lbl44:
                // 2 sources

                v8 = new Object[1];
                v8[0] = var8_5;
                m44.a("u", (Object)m44.a("t", (Object)m44.a("t", (Object)this, (long)1055635023532233981L, (long)var2_2), (long)1684103483623656250L, (long)var2_2), (Object)v8, (long)1221204394728328126L, (long)var2_2);
            }
            catch (n9 v9) {
                throw m44.a("j", (Object)v9, (long)1071350920358999427L, (long)var2_2);
            }
        }
    }

    rk(rv rv2) {
        this.W = rv2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x486AFDB3932AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -8266040047753556803L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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
