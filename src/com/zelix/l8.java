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
    private static final long a = prr.a((long)5225824860677007002L, (long)-6983772609715432975L, MethodHandles.lookup().lookupClass()).a(89946347840403L);
    private static final String b;

    public l8(int n) {
        super(n);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void F(zn zn2, lkc lkc2, long l) {
        zn zn3;
        long l2;
        long l3;
        block6: {
            long l4 = l;
            long l5 = l4 ^ 0L;
            l3 = l4 ^ 0x6D04E46CB3E1L;
            long l6 = l4 ^ 0x2BEAF1B40FB1L;
            l2 = l4 ^ 0x722F6EB869A5L;
            int n = this.y(l6);
            int n2 = 0;
            CallSite callSite = m44.a("h", (long)-3779571992638565438L, (long)l);
            block2: while (n2 < n) {
                try {
                    do {
                        if (l >= 0L) {
                            zn3 = this.g(n2);
                            if (callSite != null) break block6;
                            zn3.F((zn)this, lkc2, l5);
                            ++n2;
                        }
                        if (callSite == null) continue block2;
                    } while (l <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-3267549547343744113L, (long)l);
                }
            }
            zn3 = zn2;
        }
        lj lj2 = (lj)zn3;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("w", (Object)((Object)this), (Object)objectArray, (long)-3617396941260192240L, (long)l);
        objectArray2[0] = l2;
        m44.a("w", (Object)lj2, (Object)objectArray2, (long)-3412882792090800462L, (long)l);
    }

    public void v(Object[] objectArray) {
        long l = (Long)objectArray[0];
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
                    long l;
                    block11: {
                        l = (Long)objectArray[0];
                        l = a ^ l;
                        stringBuilder2 = new StringBuilder();
                        callSite = m44.a("k", (long)-6122864255558012087L, (long)l);
                        try {
                            try {
                                list = this.j;
                                if (callSite != null) break block11;
                                if (list == null) break block12;
                            }
                            catch (n9 n92) {
                                throw m44.a("k", (Object)((Object)n92), (long)-5608071333279558908L, (long)l);
                            }
                            list = this.j;
                        }
                        catch (n9 n93) {
                            throw m44.a("k", (Object)((Object)n93), (long)-5608071333279558908L, (long)l);
                        }
                    }
                    int n = list.size();
                    int n2 = 0;
                    while (n2 < n) {
                        CallSite callSite2;
                        block15: {
                            block16: {
                                block17: {
                                    string = (String)this.j.get(n2);
                                    if (l <= 0L) break block13;
                                    String string2 = string;
                                    try {
                                        try {
                                            try {
                                                stringBuilder = stringBuilder2.append(string2);
                                                if (callSite != null) break block14;
                                                callSite2 = callSite;
                                                if (l <= 0L) break block15;
                                                if (callSite2 != null) break block16;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("k", (Object)((Object)n94), (long)-5608071333279558908L, (long)l);
                                            }
                                            if (n2 >= this.j.size() - 1) break block17;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("k", (Object)((Object)n95), (long)-5608071333279558908L, (long)l);
                                        }
                                        stringBuilder2.append(b);
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("k", (Object)((Object)n96), (long)-5608071333279558908L, (long)l);
                                    }
                                }
                                ++n2;
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
        long l = a ^ 0x66DE4013ACF6L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00e8\u00f4\u00b7\u0005m\u00c5\u00bc\u00ea".getBytes("ISO-8859-1"));
                b = l8.b(byArray3).intern();
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
