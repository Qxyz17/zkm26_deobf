/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7;
import com.zelix.lj;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.vx;
import com.zelix.zn;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l8
extends l7
implements vx {
    List j = new ArrayList();
    private static final long a = prr.a(5225824860677007002L, -6983772609715432975L, MethodHandles.lookup().lookupClass()).a(89946347840403L);
    private static final String b;

    public l8(int n10) {
        super(n10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        zn zn3;
        long l11;
        long l12;
        block6: {
            long l13 = l10;
            long l14 = l13 ^ 0L;
            l12 = l13 ^ 0x6D04E46CB3E1L;
            long l15 = l13 ^ 0x2BEAF1B40FB1L;
            l11 = l13 ^ 0x722F6EB869A5L;
            int n10 = this.y(l15);
            int n11 = 0;
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l10);
            block2: while (n11 < n10) {
                try {
                    do {
                        if (l10 >= 0L) {
                            zn3 = this.g(n11);
                            if (callSite != null) break block6;
                            zn3.F(this, lkc2, l14);
                            ++n11;
                        }
                        if (callSite == null) continue block2;
                    } while (l10 <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-3267549547343744113L, (long)l10);
                }
            }
            zn3 = zn2;
        }
        lj lj10 = (lj)zn3;
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("w", (Object)this, (Object)objectArray, (long)-3617396941260192240L, (long)l10);
        objectArray2[0] = l11;
        m44.a("w", (Object)lj10, (Object)objectArray2, (long)-3412882792090800462L, (long)l10);
    }

    @Override
    public void v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        this.j.add(string);
    }

    public String w(Object[] objectArray) {
        String string;
        block13: {
            StringBuilder stringBuilder;
            block14: {
                StringBuilder stringBuilder2;
                block12: {
                    List list;
                    CallSite callSite;
                    long l10;
                    block11: {
                        l10 = (Long)objectArray[0];
                        l10 = a ^ l10;
                        stringBuilder2 = new StringBuilder();
                        callSite = m44.a("k", (long)-6122864255558012087L, (long)l10);
                        try {
                            try {
                                list = this.j;
                                if (callSite != null) break block11;
                                if (list == null) break block12;
                            }
                            catch (n9 n92) {
                                throw m44.a("k", (Object)n92, (long)-5608071333279558908L, (long)l10);
                            }
                            list = this.j;
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)n93, (long)-5608071333279558908L, (long)l10);
                        }
                    }
                    int n10 = list.size();
                    int n11 = 0;
                    while (n11 < n10) {
                        CallSite callSite2;
                        block15: {
                            block16: {
                                block17: {
                                    string = (String)this.j.get(n11);
                                    if (l10 <= 0L) break block13;
                                    String string2 = string;
                                    try {
                                        try {
                                            try {
                                                stringBuilder = stringBuilder2.append(string2);
                                                if (callSite != null) break block14;
                                                callSite2 = callSite;
                                                if (l10 <= 0L) break block15;
                                                if (callSite2 != null) break block16;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("k", (Object)n94, (long)-5608071333279558908L, (long)l10);
                                            }
                                            if (n11 >= this.j.size() - 1) break block17;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("k", (Object)n95, (long)-5608071333279558908L, (long)l10);
                                        }
                                        stringBuilder2.append(b);
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("k", (Object)n96, (long)-5608071333279558908L, (long)l10);
                                    }
                                }
                                ++n11;
                            }
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue;
                    }
                }
                stringBuilder = stringBuilder2;
            }
            string = stringBuilder.toString();
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x66DE4013ACF6L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00e8\u00f4\u00b7\u0005m\u00c5\u00bc\u00ea".getBytes("ISO-8859-1"));
                b = l8.b(byArray3).intern();
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

    private static String b(byte[] byArray) {
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

