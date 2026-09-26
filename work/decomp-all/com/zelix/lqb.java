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

    public boolean accept(File file) {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l;
                block8: {
                    long l2;
                    block9: {
                        l = b ^ 0x4592AF717CE7L;
                        l2 = l ^ 0x6470BB6E2074L;
                        callSite = m44.a("o", (long)-7845751070989609063L, (long)l);
                        try {
                            try {
                                object = m44.a("p", (Object)file, (long)-7996392072170939779L, (long)l);
                                if (callSite != null) break block8;
                                if (object == false) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)((Object)n92), (long)-7918753745219346192L, (long)l);
                            }
                            return true;
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)((Object)n93), (long)-7918753745219346192L, (long)l);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = m44.a("p", (Object)file, (long)-8397026900198430801L, (long)l);
                    objectArray[0] = l2;
                    object = m44.a("o", (Object)objectArray, (long)-7694489943769088979L, (long)l);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object == false) break block11;
                    }
                    catch (n9 n94) {
                        throw m44.a("o", (Object)((Object)n94), (long)-7918753745219346192L, (long)l);
                    }
                    return true;
                }
                catch (n9 n95) {
                    throw m44.a("o", (Object)((Object)n95), (long)-7918753745219346192L, (long)l);
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
        b = prr.a((long)-4150093773050826022L, (long)-1849343173876233473L, MethodHandles.lookup().lookupClass()).a(274933940696065L);
        long l = b ^ 0x1C1629808C71L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00c1\u0011\u00d1\u0097\u0014\u00c2\u00b9p`Z\u0099\u008a\u00be=\u00b3W\u00a7\u00a7$\u00ea\u00bd\u000b\u0099\u00be\u00c6h\u00ce\u0080\u00ce\u00fa\u00b4\u00e5".getBytes("ISO-8859-1"));
                String string = lqb.a(byArray3).intern();
                m44.a("j", (String)string, (long)9072418421775381958L, (long)l);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public String x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("n", (long)616066944173981869L, (long)l);
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
