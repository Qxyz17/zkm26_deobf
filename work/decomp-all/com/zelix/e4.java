/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class e4
implements Enumeration {
    private int B;
    private Object[] T;
    private int h;
    private static final long a = prr.a((long)-1331391770141184864L, (long)-975822580141911655L, MethodHandles.lookup().lookupClass()).a(51891193675920L);
    private static final String b;

    public e4(long l, Object[] objectArray) {
        block4: {
            block5: {
                l = a ^ l;
                CallSite callSite = m44.a("j", (long)-3531855409324175158L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (objectArray != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)-3229285649345252369L, (long)l);
                    }
                    throw new IllegalArgumentException();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)-3229285649345252369L, (long)l);
                }
            }
            this.T = (Object[])objectArray.clone();
            this.h = this.T.length;
        }
    }

    @Override
    public final boolean hasMoreElements() {
        int n;
        block4: {
            block5: {
                long l = a ^ 0x7AEF344530CFL;
                CallSite callSite = m44.a("m", (long)-8506433915530209339L, (long)l);
                try {
                    try {
                        n = this.B;
                        if (callSite != null) break block4;
                        if (n >= this.h) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)-7773210120975141664L, (long)l);
                    }
                    n = 1;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)-7773210120975141664L, (long)l);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    public final Object nextElement() {
        Object object;
        block4: {
            block5: {
                long l = a ^ 0x606E001D79D5L;
                CallSite callSite = m44.a("o", (long)-4546091435154940193L, (long)l);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block4;
                        if (((e4)object).B < this.h) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("o", (Object)illegalArgumentException, (long)-2505663762282414598L, (long)l);
                    }
                    throw new NoSuchElementException(this.getClass().getName());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)-2505663762282414598L, (long)l);
                }
            }
            object = this.T[this.B++];
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public static Enumeration p(Object[] var0) {
        block6: {
            block7: {
                var1_1 = (Collection)var0[0];
                var2_2 = (Long)var0[1];
                var4_3 = (var2_2 = e4.a ^ var2_2) ^ 94686251762356L;
                var6_4 = m44.a("k", (long)-4956974679022066429L, (long)var2_2);
                try {
                    try {
                        v0 = var1_1;
                        if (var6_4 != null) break block6;
                        if (v0 != null) break block7;
                    }
                    catch (IllegalArgumentException v1) {
                        throw m44.a("k", (Object)v1, (long)-6420347244549372378L, (long)var2_2);
                    }
                    throw new IllegalArgumentException(e4.b);
                }
                catch (IllegalArgumentException v2) {
                    throw m44.a("k", (Object)v2, (long)-6420347244549372378L, (long)var2_2);
                }
            }
            v0 = var1_1;
        }
        var7_5 = new Object[v0.size()];
        var8_6 = 0;
        var9_7 = var1_1.iterator();
        while (var9_7.hasNext()) {
            var7_5[var8_6++] = var9_7.next();
lbl26:
            // 2 sources

            ** while (var6_4 != null)
lbl27:
            // 1 sources

        }
lbl28:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl26
        return new e4(var4_3, var7_5);
    }

    public void m(Object[] objectArray) {
        e4 e42;
        Comparator comparator;
        long l;
        block4: {
            block5: {
                l = (Long)objectArray[0];
                comparator = (Comparator)objectArray[1];
                l = a ^ l;
                CallSite callSite = m44.a("l", (long)6454240128690571172L, (long)l);
                try {
                    try {
                        e42 = this;
                        if (callSite != null) break block4;
                        if (e42.B <= 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)4918213140147004545L, (long)l);
                    }
                    throw new IllegalStateException();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)4918213140147004545L, (long)l);
                }
            }
            e42 = this;
        }
        Object[] objectArray2 = e42.T;
        this.T = m44.a("l", (Object)new Object[]{this.T}, (long)6747876278831359379L, (long)l);
        m44.a("l", (Object)this.T, (Object)comparator, (long)4726086919125484466L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x1B9B5144284BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal(">\u008f\u000b\u001f\u0081a\u00ea\u00d9+O\u00b1\u001c)\u000f5\u00ca\u00bd\u00c5\u008c\u00caB\u00bfG\u009f\n\u00e6\u0098i\u00f3\u008b\u00d7\u0091".getBytes("ISO-8859-1"));
                b = e4.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
