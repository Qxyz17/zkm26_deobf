/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zn;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class l7
implements zn {
    private static int[] K;
    protected zn[] S;
    protected int D;
    protected zn x;
    private static final long m;
    private static final String p;

    @Override
    public void n() {
    }

    public static void h(int[] nArray) {
        K = nArray;
    }

    @Override
    public void m(zn zn2) {
        this.x = zn2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void w(char var1_1, int var2_2, zn var3_3, int var4_4, int var5_5) {
        block12: {
            block13: {
                block14: {
                    block15: {
                        block11: {
                            var6_6 = (long)var1_1 << 48 | (long)var2_2 << 32 >>> 16 | (long)var5_5 << 48 >>> 48;
                            var8_7 = m44.a("o", (long)1354205349444618885L, (long)var6_6);
                            try {
                                try {
                                    v0 = this;
                                    if (var8_7 != null) break block11;
                                    if (v0.S == null) {
                                    }
                                    ** GOTO lbl23
                                }
                                catch (n9 v1) {
                                    throw m44.a("o", (Object)v1, (long)1123935431947418344L, (long)var6_6);
                                }
                                v0 = this;
                            }
                            catch (n9 v2) {
                                throw m44.a("o", (Object)v2, (long)1123935431947418344L, (long)var6_6);
                            }
                        }
                        try {
                            try {
                                try {
                                    v0.S = new zn[var4_4 + 1];
                                    if (var5_5 <= 0) break block12;
                                    if (var8_7 == null) break block13;
lbl23:
                                    // 2 sources

                                    v3 = var4_4;
                                    if (var2_2 < 0) break block14;
                                    v4 = this.S.length;
                                    if (var8_7 != null) break block15;
                                }
                                catch (n9 v5) {
                                    throw m44.a("o", (Object)v5, (long)1123935431947418344L, (long)var6_6);
                                }
                                if (v3 < v4) break block13;
                            }
                            catch (n9 v6) {
                                throw m44.a("o", (Object)v6, (long)1123935431947418344L, (long)var6_6);
                            }
                            v7 = var4_4;
                            v4 = 1;
                        }
                        catch (n9 v8) {
                            throw m44.a("o", (Object)v8, (long)1123935431947418344L, (long)var6_6);
                        }
                    }
                    v3 = v7 + v4;
                }
                var9_8 = new zn[v3];
                System.arraycopy(this.S, 0, var9_8, 0, this.S.length);
                this.S = var9_8;
            }
            this.S[var4_4] = var3_3;
        }
    }

    @Override
    public void z() {
    }

    @Override
    public int y(long l10) {
        int n10;
        block6: {
            zn[] znArray;
            block4: {
                block5: {
                    CallSite callSite = m44.a("i", (long)-4306170603192755085L, (long)l10);
                    try {
                        try {
                            znArray = this.S;
                            if (callSite != null) break block4;
                            if (znArray != null) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("i", (Object)n92, (long)-2778871174030906338L, (long)l10);
                        }
                        n10 = 0;
                        break block6;
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)n93, (long)-2778871174030906338L, (long)l10);
                    }
                }
                znArray = this.S;
            }
            n10 = znArray.length;
        }
        return n10;
    }

    public static int[] O() {
        return K;
    }

    @Override
    public zn g(int n10) {
        return this.S[n10];
    }

    @Override
    public void s(long l10) {
        block7: {
            long l11 = l10 ^ 0L;
            CallSite callSite = m44.a("h", (long)2471378454369384962L, (long)l10);
            if (this.S != null) {
                int n10 = 0;
                block2: while (n10 < this.S.length) {
                    try {
                        this.S[n10].s(l11);
                        this.S[n10] = null;
                        ++n10;
                        do {
                            CallSite callSite2 = callSite;
                            if (l10 > 0L) {
                                if (callSite2 != null) break block7;
                                callSite2 = callSite;
                            }
                            if (callSite2 == null) continue block2;
                        } while (l10 < 0L);
                        break;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)4548079653333125743L, (long)l10);
                    }
                }
                this.S = null;
            }
        }
    }

    public String j(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = m ^ l10;
        return m44.a("o", (long)146783520024824091L, (long)l10)[this.D];
    }

    @Override
    public void F(zn zn2, lkc lkc2, long l10) {
        long l11 = l10 ^ 0x188A2EBEB7B9L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        throw new Error(p + (String)((Object)m44.a("w", (Object)this, (Object)objectArray, (long)-2889863405578499867L, (long)l10)));
    }

    public l7(int n10) {
        this.D = n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = prr.a(6794924816856347341L, 2342373189857694146L, MethodHandles.lookup().lookupClass()).a(154865382818411L);
        long l10 = m ^ 0x234D582C610FL;
        if (m44.a("j", (long)803432458028684136L, (long)l10) != null) {
            m44.a("j", (Object)new int[4], (long)1155011673690988044L, (long)l10);
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
                byte[] byArray3 = cipher.doFinal("\u00f5\u00c8,\u00af\u00a3\u00c6\u00fa\u0019\u00eaK\u00b7C\u0095\u00df\u00d6\u00d1\u00a0\u0096\nTz@\rgg;\u00a5\u00a4\u0013N\u00c1\u009cr\u00ba\"%*\u000e\u0015BK\u00a6\u00a9#ZW\u0093\u00ad\u0088\u00ea\u0002\"\u00e2\b\u00b7i".getBytes("ISO-8859-1"));
                p = l7.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 c(n9 n92) {
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

