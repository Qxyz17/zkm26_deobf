/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.v2;
import com.zelix.zl;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pi
extends v2 {
    private static final long a = prr.a((long)5074356602730075940L, (long)-3287411956607190002L, MethodHandles.lookup().lookupClass()).a(280365967920302L);
    private static final String c;

    /*
     * Unable to fully structure code
     */
    protected void O(Object[] var1_1) {
        block9: {
            block8: {
                var6_2 = (Long)var1_1[0];
                var4_3 = (lqq)var1_1[1];
                var3_4 = (Integer)var1_1[2];
                var5_5 = (Integer)var1_1[3];
                var2_6 = (Integer)var1_1[4];
                v0 = var6_2;
                var8_7 = v0 ^ 117400713146342L;
                var10_8 = v0 ^ 53436544052411L;
                var12_9 = v0 ^ 80192226461257L;
                var14_10 = v0 ^ 126172462975526L;
                var16_11 = m44.a("j", (long)-2447378320742416373L, (long)var6_2);
                try {
                    try {
                        if (var16_11 != null) break block8;
                        v1 = new Object[1];
                        v1[0] = var14_10;
                        if (m44.a("u", (Object)this, (Object)v1, (long)-2630633816245593429L, (long)var6_2) == true) {
                        }
                        ** GOTO lbl44
                    }
                    catch (n9 v2) {
                        throw m44.a("j", (Object)v2, (long)-2472037788491956012L, (long)var6_2);
                    }
                    v3 = new Object[2];
                    v3[1] = var12_9;
                    v3[0] = 0;
                    v4 = new Object[1];
                    v4[0] = var8_7;
                    v5 = new Object[2];
                    v5[1] = m44.a("u", (Object)((zl)m44.a("u", (Object)this, (Object)v3, (long)-2419197939025966992L, (long)var6_2)), (Object)v4, (long)-2565186629217682125L, (long)var6_2);
                    v5[0] = var10_8;
                    m44.a("u", (Object)var4_3, (Object)v5, (long)-2728479928950257869L, (long)var6_2);
                }
                catch (n9 v6) {
                    throw m44.a("j", (Object)v6, (long)-2472037788491956012L, (long)var6_2);
                }
            }
            try {
                if (var6_2 < 0L || var16_11 == null) break block9;
lbl44:
                // 2 sources

                v7 = new Object[2];
                v7[1] = "";
                v7[0] = var10_8;
                m44.a("u", (Object)var4_3, (Object)v7, (long)-2728479928950257869L, (long)var6_2);
            }
            catch (n9 v8) {
                throw m44.a("j", (Object)v8, (long)-2472037788491956012L, (long)var6_2);
            }
        }
    }

    public pi(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x7C788689760BL;
        super(l2, n);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x6C3065DEFB3L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u009aw\u00f6\u00beN\u0010\u00dd\u001b\u0006\u0001\u00c2\u00cd\u00d1\u00f3\u00f4\u00e5\u00d7#^\u0003\u00c3\u00d6\u008cT\u00c7gc\u0096\u0002\u00ffDi".getBytes("ISO-8859-1"));
                c = pi.b(byArray3).intern();
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

    private static String b(byte[] byArray) {
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
}
