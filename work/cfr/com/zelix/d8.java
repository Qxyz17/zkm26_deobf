/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.oz;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class d8
implements lmw {
    private String A;
    private oz l;
    private static final long a = prr.a(2802847159170652701L, -1151450398629601411L, MethodHandles.lookup().lookupClass()).a(261782485836221L);
    private static final String b;

    @Override
    public String B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0xF10DCA4132EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)7173974909880133734L, (long)l10);
    }

    public d8(oz oz2, byte by2, String string, long l10) {
        block8: {
            d8 d82;
            long l11;
            block6: {
                l11 = ((long)by2 << 56 | l10 << 8 >>> 8) ^ a;
                CallSite callSite = m44.a("k", (long)234639182567307153L, (long)l11);
                CallSite callSite2 = callSite;
                try {
                    block7: {
                        try {
                            try {
                                d82 = this;
                                if (callSite2 != null) break block6;
                                m44.a("w", (Object)d82, (oz)oz2, (long)40550252323891618L, (long)l11);
                                if (!string.startsWith("[")) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("k", (Object)n92, (long)2064076055207715605L, (long)l11);
                            }
                            m44.a("w", (Object)this, (String)b, (long)2070397524198958952L, (long)l11);
                            if (callSite2 == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)n93, (long)2064076055207715605L, (long)l11);
                        }
                    }
                    d82 = this;
                }
                catch (n9 n94) {
                    throw m44.a("k", (Object)n94, (long)2064076055207715605L, (long)l11);
                }
            }
            m44.a("w", (Object)d82, (String)string, (long)2070397524198958952L, (long)l11);
        }
    }

    @Override
    public String x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return m44.a("p", (Object)this, (long)418427138130263581L, (long)l10);
    }

    @Override
    public boolean S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    public int hashCode() {
        d8 d82;
        int n10;
        long l10;
        block3: {
            block4: {
                l10 = a ^ 0x52A926758D1AL;
                n10 = 0;
                CallSite callSite = m44.a("j", (long)3594025666393851184L, (long)l10);
                try {
                    d82 = this;
                    if (callSite != null) break block3;
                    if (m44.a("t", (Object)d82, (long)3616672420436663043L, (long)l10) == null) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)n92, (long)3315777865652277684L, (long)l10);
                }
                n10 = m44.a("t", (Object)this, (long)3616672420436663043L, (long)l10).hashCode();
            }
            d82 = this;
        }
        if (m44.a("t", (Object)d82, (long)3322134590419572169L, (long)l10) != null) {
            n10 ^= ((String)((Object)m44.a("t", (Object)this, (long)3322134590419572169L, (long)l10))).hashCode();
        }
        return n10;
    }

    @Override
    public int n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    public boolean equals(Object var1_1) {
        block29: {
            block30: {
                block35: {
                    block36: {
                        block37: {
                            block38: {
                                block40: {
                                    block39: {
                                        block34: {
                                            block31: {
                                                block33: {
                                                    block32: {
                                                        var2_2 = d8.a ^ 18080144145992L;
                                                        var4_3 = m44.a("h", (long)194439378098910818L, (long)var2_2);
                                                        try {
                                                            v0 = var1_1 instanceof d8;
                                                            if (var4_3 != null) break block29;
                                                            if (!v0) break block30;
                                                        }
                                                        catch (n9 v1) {
                                                            throw m44.a("h", (Object)v1, (long)2113948260265272038L, (long)var2_2);
                                                        }
                                                        var6_4 = (d8)var1_1;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v2 = m44.a("v", (Object)this, (long)99997005709862993L, (long)var2_2);
                                                                        if (var4_3 != null) break block31;
                                                                        if (v2 != null) {
                                                                        }
                                                                        ** GOTO lbl42
                                                                    }
                                                                    catch (n9 v3) {
                                                                        throw m44.a("h", (Object)v3, (long)2113948260265272038L, (long)var2_2);
                                                                    }
                                                                    v4 = m44.a("v", (Object)var6_4, (long)99997005709862993L, (long)var2_2);
                                                                    if (var4_3 != null) break block32;
                                                                }
                                                                catch (n9 v5) {
                                                                    throw m44.a("h", (Object)v5, (long)2113948260265272038L, (long)var2_2);
                                                                }
                                                                if (v4 == null) break block33;
                                                            }
                                                            catch (n9 v6) {
                                                                throw m44.a("h", (Object)v6, (long)2113948260265272038L, (long)var2_2);
                                                            }
                                                            v4 = m44.a("v", (Object)this, (long)99997005709862993L, (long)var2_2);
                                                        }
                                                        catch (n9 v7) {
                                                            throw m44.a("h", (Object)v7, (long)2113948260265272038L, (long)var2_2);
                                                        }
                                                    }
                                                    var5_5 = v4.equals(m44.a("v", (Object)var6_4, (long)99997005709862993L, (long)var2_2));
                                                    if (var4_3 == null) break block34;
                                                }
                                                var5_5 = false;
                                                try {
                                                    if (var4_3 == null) break block34;
lbl42:
                                                    // 2 sources

                                                    v2 = m44.a("v", (Object)var6_4, (long)99997005709862993L, (long)var2_2);
                                                }
                                                catch (n9 v8) {
                                                    throw m44.a("h", (Object)v8, (long)2113948260265272038L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                v9 = v2 == null;
                                            }
                                            catch (n9 v10) {
                                                throw m44.a("h", (Object)v10, (long)2113948260265272038L, (long)var2_2);
                                            }
                                            var5_5 = v9;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v11 = var5_5;
                                                                if (var4_3 != null) break block35;
                                                                if (!v11) break block36;
                                                            }
                                                            catch (n9 v12) {
                                                                throw m44.a("h", (Object)v12, (long)2113948260265272038L, (long)var2_2);
                                                            }
                                                            v13 = m44.a("v", (Object)this, (long)2110170717082035867L, (long)var2_2);
                                                            if (var4_3 != null) break block37;
                                                        }
                                                        catch (n9 v14) {
                                                            throw m44.a("h", (Object)v14, (long)2113948260265272038L, (long)var2_2);
                                                        }
                                                        if (v13 == null) break block38;
                                                    }
                                                    catch (n9 v15) {
                                                        throw m44.a("h", (Object)v15, (long)2113948260265272038L, (long)var2_2);
                                                    }
                                                    v16 = m44.a("v", (Object)var6_4, (long)2110170717082035867L, (long)var2_2);
                                                    if (var4_3 != null) break block39;
                                                }
                                                catch (n9 v17) {
                                                    throw m44.a("h", (Object)v17, (long)2113948260265272038L, (long)var2_2);
                                                }
                                                if (v16 == null) break block40;
                                            }
                                            catch (n9 v18) {
                                                throw m44.a("h", (Object)v18, (long)2113948260265272038L, (long)var2_2);
                                            }
                                            v16 = m44.a("v", (Object)this, (long)2110170717082035867L, (long)var2_2);
                                        }
                                        catch (n9 v19) {
                                            throw m44.a("h", (Object)v19, (long)2113948260265272038L, (long)var2_2);
                                        }
                                    }
                                    return v16.equals(m44.a("v", (Object)var6_4, (long)2110170717082035867L, (long)var2_2));
                                }
                                return false;
                            }
                            v13 = m44.a("v", (Object)var6_4, (long)2110170717082035867L, (long)var2_2);
                        }
                        try {
                            v20 = v13 == null;
                        }
                        catch (n9 v21) {
                            throw m44.a("h", (Object)v21, (long)2113948260265272038L, (long)var2_2);
                        }
                        return v20;
                    }
                    v11 = false;
                }
                return v11;
            }
            v0 = false;
        }
        return v0;
    }

    @Override
    public boolean Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public boolean a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public String D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return m44.a("r", (Object)this, (long)8121377626617367399L, (long)l10);
    }

    @Override
    public String U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)7584116271267144361L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x1EE41ECD275DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("a#\u00f8\u00d7|u\u00bb\u00b3\u00f8Q^\u0095==\u0097!\u00b3\u009f\u00ee\u0086\u001e\u00e8\u00a0c".getBytes("ISO-8859-1"));
                b = d8.a(byArray3).intern();
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

    private static String a(byte[] byArray) {
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
}

