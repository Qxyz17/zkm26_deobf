/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lyn;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class l7t
implements lmu {
    protected int i;
    protected static String T;
    protected lmu[] r;
    private static int c;
    protected lmu y;
    private static final long H;
    private static final String ab;

    @Override
    public void X(Object[] objectArray) {
    }

    public static String S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = H ^ l10) ^ 0x78A7A1CCBEL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return "[" + (String)((Object)m44.a("m", (Object)objectArray2, (long)-888073039423871290L, (long)l10)) + "]";
    }

    public l7t(byte by2, int n10, long l10) {
        long l11 = ((long)by2 << 56 | l10 << 8 >>> 8) ^ H;
        m44.a("v", (Object)this, (int)n10, (long)-8190713273918732824L, (long)l11);
    }

    @Override
    public lmu X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return m44.a("w", (Object)this, (long)-1633577291296472404L, (long)l10);
    }

    public String i(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = H ^ l10;
        return m44.a("l", (long)113563030557627960L, (long)l10)[m44.a("v", (Object)this, (long)80718747081231010L, (long)l10)];
    }

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0x722758683446L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        throw new Error(ab + (String)((Object)m44.a("w", (Object)this, (Object)objectArray2, (long)-4980655768152182429L, (long)l10)));
    }

    @Override
    public int A(Object[] objectArray) {
        int n10;
        block6: {
            lmu[] lmuArray;
            block4: {
                block5: {
                    long l10 = (Long)objectArray[0];
                    CallSite callSite = m44.a("n", (long)-2085455737247341624L, (long)l10);
                    try {
                        try {
                            lmuArray = this.r;
                            if (callSite == false) break block4;
                            if (lmuArray != null) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)-69138106421728376L, (long)l10);
                        }
                        n10 = 0;
                        break block6;
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)-69138106421728376L, (long)l10);
                    }
                }
                lmuArray = this.r;
            }
            n10 = lmuArray.length;
        }
        return n10;
    }

    @Override
    public void k(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        long l10 = (Long)objectArray[1];
        m44.a("s", (Object)this, (lmu)lmu2, (long)4747483932797348378L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void T(Object[] var1_1) {
        block12: {
            block13: {
                block14: {
                    block15: {
                        block11: {
                            var4_2 = (lmu)var1_1[0];
                            var2_3 = (Long)var1_1[1];
                            var5_4 = (Integer)var1_1[2];
                            var6_5 = m44.a("j", (long)8404495719012430948L, (long)var2_3);
                            try {
                                try {
                                    v0 = this;
                                    v1 /* !! */  = var6_5;
                                    if (var2_3 <= 0L) ** GOTO lbl26
                                    if (v1 /* !! */  == false) break block11;
                                    if (v0.r == null) {
                                    }
                                    ** GOTO lbl29
                                }
                                catch (n9 v2) {
                                    throw m44.a("j", (Object)v2, (long)7540822513859607588L, (long)var2_3);
                                }
                                v0 = this;
                            }
                            catch (n9 v3) {
                                throw m44.a("j", (Object)v3, (long)7540822513859607588L, (long)var2_3);
                            }
                        }
                        try {
                            try {
                                try {
                                    v1 /* !! */  = (CallSite)(var5_4 + 1);
lbl26:
                                    // 2 sources

                                    v0.r = new lmu[v1 /* !! */ ];
                                    if (var2_3 <= 0L) break block12;
                                    if (var6_5 != false) break block13;
lbl29:
                                    // 2 sources

                                    v4 = var5_4;
                                    if (var2_3 < 0L) break block14;
                                    v5 = this.r.length;
                                    if (var6_5 == false) break block15;
                                }
                                catch (n9 v6) {
                                    throw m44.a("j", (Object)v6, (long)7540822513859607588L, (long)var2_3);
                                }
                                if (v4 < v5) break block13;
                            }
                            catch (n9 v7) {
                                throw m44.a("j", (Object)v7, (long)7540822513859607588L, (long)var2_3);
                            }
                            v8 = var5_4;
                            v5 = 1;
                        }
                        catch (n9 v9) {
                            throw m44.a("j", (Object)v9, (long)7540822513859607588L, (long)var2_3);
                        }
                    }
                    v4 = v8 + v5;
                }
                var7_6 = new lmu[v4];
                System.arraycopy(this.r, 0, var7_6, 0, this.r.length);
                this.r = var7_6;
            }
            this.r[var5_4] = var4_2;
        }
    }

    @Override
    public void t(Object[] objectArray) {
    }

    public static int T() {
        return c;
    }

    public static int k() {
        int n10 = l7t.T();
        if (n10 == 0) {
            return 5;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        H = prr.a(-5201513659960010478L, -4274676902728920695L, MethodHandles.lookup().lookupClass()).a(184297316497196L);
        long l10 = H ^ 0x35752AD27653L;
        if (m44.a("j", (long)-1435336970681041108L, (long)l10) != false) {
            m44.a("j", (int)41, (long)-1254879142268321950L, (long)l10);
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("xH\u0088\u00fc\u008c\u00e4*Y=\u00d9\u00e8\u0094s8#k#6\u00b8mw\u00eb@1^\u00ba\u00b1\u00ebx\u00066%\u00a8RD\u00d3\u00c1\u00f1\u00bd\u001c%r\u00068\u00c0\u0017\u00d2\u001fw\u00a9\u00eb98\u008c;\u00aa".getBytes("ISO-8859-1"));
                ab = l7t.a(byArray3).intern();
                m44.a("i", "!", (long)-757815504864260182L, (long)l10);
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    @Override
    public lyn D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("p", (Object)m44.a("q", (Object)this, (long)446517125099548106L, (long)l10), (Object)objectArray2, (long)463455339284746257L, (long)l10);
    }

    public static void A(int n10) {
        c = n10;
    }

    @Override
    public lmu V(int n10) {
        return this.r[n10];
    }

    private static n9 b(n9 n92) {
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

