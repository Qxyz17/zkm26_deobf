/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.d;
import com.zelix.iz;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.rq;
import com.zelix.ue;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ck
extends iz
implements d {
    private List i;
    private static final long a = prr.a((long)5735066186506950150L, (long)-6342909655411003515L, MethodHandles.lookup().lookupClass()).a(224961339816628L);
    private static final long b;

    public ck(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x5136984E1F40L;
        super(n, l2);
        m44.a("v", (Object)((Object)this), new ArrayList(), (long)7925537370121829226L, (long)l);
    }

    public void t(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("w", (Object)((Object)this), (long)5633530286498437305L, (long)l).add(string);
    }

    /*
     * Unable to fully structure code
     */
    public void o(Object[] var1_1) {
        block9: {
            var2_2 = (rq)var1_1[0];
            var3_3 = (ue)var1_1[1];
            var4_4 = (Long)var1_1[2];
            v0 = var4_4;
            var6_5 = v0 ^ 0L;
            var8_6 = v0 ^ 131965968878637L;
            v1 = new Object[3];
            v1[2] = var6_5;
            v1[1] = var3_3;
            v1[0] = var2_2;
            super.o(v1);
            var11_7 = (d)var2_2;
            var10_8 = m44.a("l", (long)-4080326000156175076L, (long)var4_4);
            var12_9 = m44.a("r", (Object)this, (long)-4466680264074570604L, (long)var4_4).size();
            var13_10 = new StringBuilder();
            var14_11 = 0;
            while (var14_11 < var12_9) {
                block10: {
                    block11: {
                        block12: {
                            try {
                                try {
                                    try {
                                        var13_10.append((String)m44.a("r", (Object)this, (long)-4466680264074570604L, (long)var4_4).get(var14_11));
lbl26:
                                        // 2 sources

                                        while (true) {
                                            v2 = var10_8;
                                            if (var4_4 > 0L) {
                                                if (v2 == false) break block9;
                                                v2 = var10_8;
                                            }
                                            if (var4_4 <= 0L) break block10;
                                            if (v2 == false) break block11;
                                            break;
                                        }
                                    }
                                    catch (n9 v3) {
                                        throw m44.a("l", (Object)v3, (long)-4159996692277972517L, (long)var4_4);
                                    }
                                    if (var14_11 >= var12_9 - 1) break block12;
                                }
                                catch (n9 v4) {
                                    throw m44.a("l", (Object)v4, (long)-4159996692277972517L, (long)var4_4);
                                }
                                var13_10.append((char)ck.b);
                            }
                            catch (n9 v5) {
                                throw m44.a("l", (Object)v5, (long)-4159996692277972517L, (long)var4_4);
                            }
                        }
                        ++var14_11;
                    }
                    v2 = var10_8;
                }
                if (v2 != false) continue;
            }
            v6 = new Object[2];
            v6[1] = var13_10.toString();
            v6[0] = var8_6;
            m44.a("s", (Object)var11_7, (Object)v6, (long)-2838901962873148324L, (long)var4_4);
            ** while (var4_4 < 0L)
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x52CCA8678779L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 7033966810042539587L;
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
