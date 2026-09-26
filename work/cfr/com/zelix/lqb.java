/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqo;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lqb
extends lqo {
    private static String m;
    private static final long b;

    @Override
    public boolean accept(File file) {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = b ^ 0x4592AF717CE7L;
                        l11 = l10 ^ 0x6470BB6E2074L;
                        callSite = m44.a("o", (long)-7845751070989609063L, (long)l10);
                        try {
                            try {
                                object = m44.a("p", (Object)file, (long)-7996392072170939779L, (long)l10);
                                if (callSite != null) break block8;
                                if (object == false) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)n92, (long)-7918753745219346192L, (long)l10);
                            }
                            return true;
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)n93, (long)-7918753745219346192L, (long)l10);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = m44.a("p", (Object)file, (long)-8397026900198430801L, (long)l10);
                    objectArray[0] = l11;
                    object = m44.a("o", (Object)objectArray, (long)-7694489943769088979L, (long)l10);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object == false) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("o", (Object)n94, (long)-7918753745219346192L, (long)l10);
                    }
                    return true;
                }
                catch (n9 n95) {
                    throw m44.a("o", (Object)n95, (long)-7918753745219346192L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = prr.a(-4150093773050826022L, -1849343173876233473L, MethodHandles.lookup().lookupClass()).a(274933940696065L);
        long l10 = b ^ 0x1C1629808C71L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00c1\u0011\u00d1\u0097\u0014\u00c2\u00b9p`Z\u0099\u008a\u00be=\u00b3W\u00a7\u00a7$\u00ea\u00bd\u000b\u0099\u00be\u00c6h\u00ce\u0080\u00ce\u00fa\u00b4\u00e5".getBytes("ISO-8859-1"));
                String string = lqb.a(byArray3).intern();
                m44.a("j", string, (long)9072418421775381958L, (long)l10);
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    @Override
    public String x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return m44.a("n", (long)616066944173981869L, (long)l10);
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

