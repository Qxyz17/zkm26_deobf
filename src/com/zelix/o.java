/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.nt;
import com.zelix.prr;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class o
implements PropertyChangeListener {
    final nt j;
    private static final long a = prr.a((long)6544031116791629894L, (long)-1030092034864505967L, MethodHandles.lookup().lookupClass()).a(109530513733359L);
    private static final String b;

    /*
     * Unable to fully structure code
     */
    @Override
    public void propertyChange(PropertyChangeEvent var1_1) {
        block15: {
            block16: {
                block14: {
                    var2_2 = o.a ^ 15589611038814L;
                    var4_3 = var2_2 ^ 122729449529439L;
                    var6_4 = m44.a("i", (long)1454721186392477879L, (long)var2_2);
                    try {
                        try {
                            v0 = m44.a("v", (Object)var1_1, (long)856289447247062582L, (long)var2_2);
                            if (var6_4 != null) break block14;
                            if (!v0.equals(o.b)) break block15;
                        }
                        catch (n9 v1) {
                            throw m44.a("i", (Object)v1, (long)1718928839374896150L, (long)var2_2);
                        }
                        v0 = (String)m44.a("v", (Object)var1_1, (long)956004722601035474L, (long)var2_2);
                    }
                    catch (n9 v2) {
                        throw m44.a("i", (Object)v2, (long)1718928839374896150L, (long)var2_2);
                    }
                }
                var7_5 = v0;
                try {
                    try {
                        try {
                            if (var6_4 != null) break block16;
                            if (var7_5 == null) ** GOTO lbl32
                        }
                        catch (n9 v3) {
                            throw m44.a("i", (Object)v3, (long)1718928839374896150L, (long)var2_2);
                        }
                        if (var7_5.length() == 0) {
                        }
                        ** GOTO lbl44
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)1718928839374896150L, (long)var2_2);
                    }
lbl32:
                    // 2 sources

                    v5 = new Object[2];
                    v5[1] = m44.a("w", (Object)this, (long)1423955941521948439L, (long)var2_2);
                    v5[0] = var4_3;
                    m44.a("v", (Object)m44.a("i", (Object)v5, (long)808526477830928036L, (long)var2_2), (boolean)false, (long)948720512925040588L, (long)var2_2);
                }
                catch (n9 v6) {
                    throw m44.a("i", (Object)v6, (long)1718928839374896150L, (long)var2_2);
                }
            }
            try {
                if (var6_4 == null) break block15;
lbl44:
                // 2 sources

                v7 = new Object[2];
                v7[1] = m44.a("w", (Object)this, (long)1423955941521948439L, (long)var2_2);
                v7[0] = var4_3;
                m44.a("v", (Object)m44.a("i", (Object)v7, (long)808526477830928036L, (long)var2_2), (boolean)true, (long)948720512925040588L, (long)var2_2);
            }
            catch (n9 v8) {
                throw m44.a("i", (Object)v8, (long)1718928839374896150L, (long)var2_2);
            }
        }
    }

    o(nt nt2) {
        this.j = nt2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x515EA0B6F5F4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0094\u00ab\u0099\u000f\u00c2s6\u0087\u00e0\u00d5X\u0012h\u00fd8\u00cb".getBytes("ISO-8859-1"));
                b = o.a(byArray3).intern();
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

    private static String a(byte[] byArray) {
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
