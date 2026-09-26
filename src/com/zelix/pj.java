/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.v2;
import com.zelix.zl;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pj
extends v2 {
    private static final long a = prr.a((long)-2804175050106931693L, (long)-1964192711091425925L, MethodHandles.lookup().lookupClass()).a(224808505891464L);
    private static final String c;

    protected void O(Object[] objectArray) {
        block5: {
            Object object;
            long l;
            long l2;
            lqq lqq2;
            long l3;
            block4: {
                l3 = (Long)objectArray[0];
                lqq2 = (lqq)objectArray[1];
                int n = (Integer)objectArray[2];
                int n2 = (Integer)objectArray[3];
                int n3 = (Integer)objectArray[4];
                long l4 = l3;
                l2 = l4 ^ 0x6AC67BCDAFE6L;
                long l5 = l4 ^ 0x48EF352C0649L;
                l = l4 ^ 0x578F8B357BA4L;
                long l6 = l4 ^ 0x72C0D0D60A26L;
                CallSite callSite = m44.a("j", (long)-2447378320742416373L, (long)l3);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l6;
                        if (m44.a("u", (Object)object, (Object)objectArray2, (long)-2630633816245593429L, (long)l3) <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-2634715077615344640L, (long)l3);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l5;
                    objectArray3[0] = 0;
                    object = m44.a("u", (Object)((Object)this), (Object)objectArray3, (long)-2419197939025966992L, (long)l3);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-2634715077615344640L, (long)l3);
                }
            }
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l2;
            CallSite callSite = m44.a("u", (Object)((zl)object), (Object)objectArray4, (long)-2565186629217682125L, (long)l3);
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = callSite;
            objectArray5[0] = l;
            m44.a("u", (Object)lqq2, (Object)objectArray5, (long)-2679331581904501670L, (long)l3);
        }
    }

    public pj(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x577E1C0C59C4L;
        super(l2, n);
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x4E03823E8A92L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal(";\u00ef\u00de\u00d8\rU\u0003#f\u00b0?\u0000\u00be\u0004\u00a8+\u0013\u009d\u0011\u0014\u00800%\u00cfF8\u00c6.\u0081:YH".getBytes("ISO-8859-1"));
                c = pj.b(byArray3).intern();
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
