/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class m_
implements Comparable {
    private String R;
    private String V;
    private String[] E;
    private static final long a = prr.a((long)-7361978116798263939L, (long)-870304073443368776L, MethodHandles.lookup().lookupClass()).a(76783305372682L);
    private static final String b;

    String[] h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("t", (Object)this, (long)568561609083600286L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    private String k(Object[] var1_1) {
        block18: {
            block19: {
                block21: {
                    block20: {
                        var2_2 = (Long)var1_1[0];
                        var2_2 = m_.a ^ var2_2;
                        var4_3 = m44.a("m", (long)8185829545187915807L, (long)var2_2);
                        try {
                            v0 = m44.a("s", (Object)this, (long)8351473861920432076L, (long)var2_2);
                            if (var4_3 != false) break block18;
                            if (v0 != null) break block19;
                        }
                        catch (n9 v1) {
                            throw m44.a("m", (Object)v1, (long)8548950627172806626L, (long)var2_2);
                        }
                        var5_4 = new StringBuffer();
                        try {
                            if (var2_2 > 0L) {
                                v2 = var5_4.append((String)m44.a("s", (Object)this, (long)8313705179676271184L, (long)var2_2) + "(");
                                if (var4_3 != false) break block20;
                            }
                            if (m44.a("s", (Object)this, (long)7794829491609294417L, (long)var2_2) != null) {
                            }
                            ** GOTO lbl59
                        }
                        catch (n9 v3) {
                            throw m44.a("m", (Object)v3, (long)8548950627172806626L, (long)var2_2);
                        }
                        var6_5 = 0;
                        while (var6_5 < ((CallSite)m44.a("s", (Object)this, (long)7794829491609294417L, (long)var2_2)).length) {
                            block22: {
                                block23: {
                                    block24: {
                                        try {
                                            try {
                                                try {
                                                    var5_4.append((String)m44.a("s", (Object)this, (long)7794829491609294417L, (long)var2_2)[var6_5]);
                                                    v4 = var4_3;
                                                    while (true) {
                                                        if (var2_2 > 0L) {
                                                            if (v4 != false) break block21;
                                                            v4 = var4_3;
                                                        }
                                                        if (var2_2 < 0L) break block22;
                                                        if (v4 != false) break block23;
                                                        break;
                                                    }
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("m", (Object)v5, (long)8548950627172806626L, (long)var2_2);
                                                }
                                                if (var6_5 >= ((CallSite)m44.a("s", (Object)this, (long)7794829491609294417L, (long)var2_2)).length - 1) break block24;
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("m", (Object)v6, (long)8548950627172806626L, (long)var2_2);
                                            }
                                            var5_4.append(",");
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("m", (Object)v7, (long)8548950627172806626L, (long)var2_2);
                                        }
                                    }
                                    ++var6_5;
                                }
                                v4 = var4_3;
                            }
                            if (v4 == false) continue;
                        }
                        try {
                            if (var2_2 <= 0L) break block21;
                            v8 = var4_3;
                            if (var2_2 < 0L) ** continue;
                            if (v8 == false) break block20;
lbl59:
                            // 2 sources

                            v2 = var5_4.append(m_.b);
                        }
                        catch (n9 v9) {
                            throw m44.a("m", (Object)v9, (long)8548950627172806626L, (long)var2_2);
                        }
                    }
                    var5_4.append(")");
                }
                m44.a("q", (Object)this, (String)var5_4.toString(), (long)8351473861920432076L, (long)var2_2);
            }
            v0 = m44.a("s", (Object)this, (long)8351473861920432076L, (long)var2_2);
        }
        return v0;
    }

    String E(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-15726544994603272L, (long)l);
    }

    m_(String string, long l, String[] stringArray) {
        l = a ^ l;
        m44.a("t", (Object)this, (String)string, (long)-8730975866040215579L, (long)l);
        m44.a("t", (Object)this, (String[])stringArray, (long)-7378675770813864988L, (long)l);
    }

    public int compareTo(Object object) {
        long l = a ^ 0x4D622F39C5FAL;
        long l2 = l ^ 0x4D13B5CC9AB3L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = (m_)object;
        return (int)m44.a("r", (Object)this, (Object)objectArray, (long)3182792439796988836L, (long)l);
    }

    public int A(Object[] objectArray) {
        m_ m_2 = (m_)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x75296270C06BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l2;
        return ((String)((Object)m44.a("o", (Object)this, (Object)objectArray2, (long)6059908712972425491L, (long)l))).compareTo((String)((Object)m44.a("o", (Object)m_2, (Object)objectArray3, (long)6059908712972425491L, (long)l)));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0xF6DCC187C4EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("]\u0011E\u008b\u0094\u001b\u00cc?".getBytes("ISO-8859-1"));
                b = m_.a(byArray3).intern();
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
