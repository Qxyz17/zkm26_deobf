/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.df;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.iq;
import com.zelix.l6q;
import com.zelix.lmt;
import com.zelix.m44;
import com.zelix.m7;
import com.zelix.n9;
import com.zelix.prr;
import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bi
extends _4
implements lmt,
Comparable {
    private int m;
    private iq K;
    private static final long a = prr.a((long)6524789785056877836L, (long)-3621490419276670401L, MethodHandles.lookup().lookupClass()).a(24552143462080L);
    private static final String b;

    public m7 i(long l) {
        return m7.S;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int m(Object[] var1_1) {
        block21: {
            block22: {
                block25: {
                    block23: {
                        block24: {
                            block19: {
                                block20: {
                                    var3_2 = (Long)var1_1[0];
                                    var2_3 = (bi)var1_1[1];
                                    var3_2 = bi.a ^ var3_2;
                                    var5_4 = m44.a("h", (long)-3881616863628051607L, (long)var3_2);
                                    try {
                                        try {
                                            v0 = this.K.B();
                                            v1 /* !! */  = var2_3.K.B();
                                            if (var5_4 == false) break block19;
                                            if (v0 >= v1 /* !! */ ) break block20;
                                        }
                                        catch (n9 v2) {
                                            throw m44.a("h", (Object)v2, (long)-3438023528499730022L, (long)var3_2);
                                        }
                                        return -1;
                                    }
                                    catch (n9 v3) {
                                        throw m44.a("h", (Object)v3, (long)-3438023528499730022L, (long)var3_2);
                                    }
                                }
                                try {
                                    v0 = this.K.B();
                                    v1 /* !! */  = (int)var5_4;
                                    if (var3_2 <= 0L) break block19;
                                    if (v1 /* !! */  == 0) break block21;
                                    v1 /* !! */  = var2_3.K.B();
                                }
                                catch (n9 v4) {
                                    throw m44.a("h", (Object)v4, (long)-3438023528499730022L, (long)var3_2);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (var3_2 > 0L) {
                                            if (v0 != v1 /* !! */ ) break block22;
                                            v5 = this.m;
                                            v1 /* !! */  = var2_3.m;
                                        }
                                        if (var3_2 < 0L || var5_4 == false) break block23;
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("h", (Object)v6, (long)-3438023528499730022L, (long)var3_2);
                                    }
                                    if (var3_2 >= 0L) {
                                        if (v5 >= v1 /* !! */ ) break block24;
                                    }
                                    ** GOTO lbl53
                                }
                                catch (n9 v7) {
                                    throw m44.a("h", (Object)v7, (long)-3438023528499730022L, (long)var3_2);
                                }
                                return -1;
                            }
                            catch (n9 v8) {
                                throw m44.a("h", (Object)v8, (long)-3438023528499730022L, (long)var3_2);
                            }
                        }
                        try {
                            v5 = this.m;
                            v1 /* !! */  = (int)var5_4;
lbl53:
                            // 2 sources

                            if (var3_2 <= 0L) break block23;
                            if (v1 /* !! */  == 0) break block25;
                            v1 /* !! */  = var2_3.m;
                        }
                        catch (n9 v9) {
                            throw m44.a("h", (Object)v9, (long)-3438023528499730022L, (long)var3_2);
                        }
                    }
                    try {
                        if (v5 == v1 /* !! */ ) {
                            return 0;
                        }
                    }
                    catch (n9 v10) {
                        throw m44.a("h", (Object)v10, (long)-3438023528499730022L, (long)var3_2);
                    }
                    v5 = 1;
                }
                return v5;
            }
            v0 = 1;
        }
        return v0;
    }

    public void T(int n) {
        this.m = n;
    }

    public void d(Integer n, iq iq2, long l) {
        this.K = iq2;
    }

    public int compareTo(Object object) {
        long l = a ^ 0x1A191665CB13L;
        long l2 = l ^ 0x56E25002122CL;
        Object[] objectArray = new Object[2];
        objectArray[1] = (bi)object;
        objectArray[0] = l2;
        return (int)m44.a("t", (Object)this, (Object)objectArray, (long)-5226852794049110134L, (long)l);
    }

    void z(gu gu2, long l) {
    }

    public String R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return b;
    }

    public iq k(Object[] objectArray) {
        return this.K;
    }

    protected void k(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.K.B());
        dataOutputStream.writeShort(this.m);
    }

    bi(long l, int n, _4 _42, h1 h12, l6q l6q2) {
        long l2;
        long l3 = l2 = (l << 32 | (long)n << 32 >>> 32) ^ a;
        long l4 = l3 ^ 0x69134EC9EBF8L;
        long l5 = l3 ^ 0x103DC2B8A1C5L;
        super(_42);
        int n2 = h12.readUnsignedShort();
        l6q2.t((Object)S.e(l4, n2), (Object)this, l5);
        this.m = h12.readUnsignedShort();
    }

    public void X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        df df2 = (df)objectArray[1];
        long l2 = l ^ 0x6F3E14B71D18L;
        long l3 = l2 >>> 16;
        int n = (int)(l2 << 48 >>> 48);
        df2.L(l3, (char)n, (Object)this.K, (Object)this);
    }

    public int q() {
        return this.m;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x1BD424BE56CAL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("U\u0084\u00f2\u0096\u00f2\u00b4\u00bc]\u00b6\u00a5\u0005tx\u00df\u00dd\f".getBytes("ISO-8859-1"));
                b = bi.a(byArray3).intern();
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
