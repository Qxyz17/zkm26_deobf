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

public class q7
extends v2 {
    private static final long a = prr.a((long)7621269929136931656L, (long)-1523050984588067922L, MethodHandles.lookup().lookupClass()).a(184603104131525L);
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
                l = l4 ^ 0x61016732B5C8L;
                long l5 = l4 ^ 0x48EF352C0649L;
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
                        throw m44.a("j", (Object)((Object)n92), (long)-2400624341401310415L, (long)l3);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l5;
                    objectArray3[0] = 0;
                    object = m44.a("u", (Object)((Object)this), (Object)objectArray3, (long)-2419197939025966992L, (long)l3);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-2400624341401310415L, (long)l3);
                }
            }
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l2;
            CallSite callSite = m44.a("u", (Object)((zl)object), (Object)objectArray4, (long)-2565186629217682125L, (long)l3);
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = ((String)((Object)callSite)).trim();
            objectArray5[0] = l;
            m44.a("u", (Object)lqq2, (Object)objectArray5, (long)-4331564455190423152L, (long)l3);
        }
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return c;
    }

    public q7(int n, int n2, long l) {
        long l2 = ((long)n2 << 32 | l << 32 >>> 32) ^ a;
        long l3 = l2 ^ 0x49A4F80EF253L;
        super(l3, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x29930F1CC564L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("l^\u00cbc\u00f6\u000b\u0083\u00da\u00f9\u00df\u00dc.\u0011\u0011\u0003\u00cdQA|\u00e4\u0080\u009d\u0081U".getBytes("ISO-8859-1"));
                c = q7.b(byArray3).intern();
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
