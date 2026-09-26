/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dc {
    dc Z;
    private final String Y;
    dc v;
    private int t;
    private final char[] q;
    private static final long a = prr.a(-8732033650637427414L, 7267015941395847582L, MethodHandles.lookup().lookupClass()).a(133905151437011L);
    private static final String b;

    dc(char[] cArray) {
        this(cArray, "");
    }

    boolean H(Object[] objectArray) {
        boolean bl2;
        block8: {
            block9: {
                block12: {
                    long l10;
                    Object object;
                    long l11;
                    block10: {
                        long l12;
                        block11: {
                            l11 = (Long)objectArray[0];
                            l12 = (l11 = a ^ l11) ^ 0x493E318E0629L;
                            ++this.t;
                            this.t %= this.q.length;
                            CallSite callSite = m44.a("j", (long)-1009013445425086172L, (long)l11);
                            try {
                                try {
                                    try {
                                        try {
                                            bl2 = this.t;
                                            if (callSite != null) break block8;
                                            if (bl2) break block9;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("j", (Object)illegalArgumentException, (long)-786680001075731265L, (long)l11);
                                        }
                                        object = this;
                                        l10 = -1606661884980929757L;
                                        if (l11 < 0L) break block10;
                                        object = m44.a("t", (Object)object, (long)l10, (long)l11);
                                        if (callSite != null) break block11;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("j", (Object)illegalArgumentException, (long)-786680001075731265L, (long)l11);
                                    }
                                    if (object == null) break block12;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)-786680001075731265L, (long)l11);
                                }
                                object = m44.a("t", (Object)this, (long)-1606661884980929757L, (long)l11);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("j", (Object)illegalArgumentException, (long)-786680001075731265L, (long)l11);
                            }
                        }
                        l10 = l12;
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l10;
                    CallSite callSite = m44.a("u", (Object)object, (Object)objectArray2, (long)-1439748857744247000L, (long)l11);
                    return (boolean)callSite;
                }
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    dc(char[] cArray, String string) {
        this.q = cArray;
        this.Y = string;
    }

    private void V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        dc dc2 = (dc)objectArray[1];
        l10 = a ^ l10;
        m44.a("p", (Object)this, (dc)dc2, (long)8679622540949599526L, (long)l10);
    }

    void d(Object[] objectArray) {
        dc dc2;
        dc dc3;
        long l10;
        long l11;
        block4: {
            dc dc4;
            block5: {
                dc4 = (dc)objectArray[0];
                l11 = (Long)objectArray[1];
                l10 = (l11 = a ^ l11) ^ 0x33ED3B2C902CL;
                CallSite callSite = m44.a("i", (long)-883752117686942873L, (long)l11);
                try {
                    try {
                        dc3 = dc4;
                        dc2 = this;
                        if (callSite != null) break block4;
                        if (dc3 != dc2) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("i", (Object)illegalArgumentException, (long)-624261971198925060L, (long)l11);
                    }
                    throw new IllegalArgumentException(b);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)-624261971198925060L, (long)l11);
                }
            }
            m44.a("u", (Object)this, (dc)dc4, (long)-1445384756793419424L, (long)l11);
            dc3 = dc4;
            dc2 = this;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = dc2;
        objectArray2[0] = l10;
        m44.a("h", (Object)dc3, (Object)objectArray2, (long)-1628356134918862602L, (long)l11);
    }

    StringBuilder D(Object[] objectArray) {
        StringBuilder stringBuilder;
        block4: {
            StringBuilder stringBuilder2;
            block5: {
                long l10 = (Long)objectArray[0];
                stringBuilder2 = (StringBuilder)objectArray[1];
                long l11 = (l10 = a ^ l10) ^ 0x493E318E0629L;
                CallSite callSite = m44.a("l", (long)7967230336550166090L, (long)l10);
                try {
                    try {
                        stringBuilder = stringBuilder2.append(this.q[this.t]);
                        if (callSite != null) break block4;
                        if (m44.a("r", (Object)this, (long)8312604237614300686L, (long)l10) == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)7672775789022788561L, (long)l10);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = stringBuilder2;
                    objectArray2[0] = l11;
                    m44.a("s", (Object)m44.a("r", (Object)this, (long)8312604237614300686L, (long)l10), (Object)objectArray2, (long)8577680584854363940L, (long)l10);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)7672775789022788561L, (long)l10);
                }
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x4864F7BCBA32L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ddZ\u00d9\u00e0\u00ac\u0005%{\u00a5\u00e2\u00e3\u00f2\"\u00a7\u00b7\u0003<\u00ab\u00da!0\u0010\u00abHQ\u0085\u0015d\u00117,T".getBytes("ISO-8859-1"));
                b = dc.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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

