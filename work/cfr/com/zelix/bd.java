/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.b5;
import com.zelix.h1;
import com.zelix.l6q;
import com.zelix.lkv;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bd
extends b5 {
    private static final long b = prr.a(-4704447026613819946L, -4106000492509430068L, MethodHandles.lookup().lookupClass()).a(253580860057787L);
    private static final String d;

    @Override
    public void S(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = (Integer)objectArray[2];
        HashMap hashMap = (HashMap)objectArray[3];
        long l11 = l10 ^ 0x584114EB5F36L;
        String string = this.O().V();
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = this;
        objectArray2[4] = hashMap;
        objectArray2[3] = n11;
        objectArray2[2] = n10;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        CallSite callSite = m44.a("m", (Object)objectArray2, (long)-7491983056205073157L, (long)l10);
        try {
            if (!string.equals(callSite)) {
                this.O().A((String)((Object)callSite));
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)n92, (long)-9065968597966878795L, (long)l10);
        }
    }

    @Override
    public String R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return d;
    }

    bd(_4 _42, h1 h12, short s10, int n10, lkv lkv2, l6q l6q2, l6q l6q3, short s11) {
        long l10 = ((long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)s11 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x6341339ECF9AL;
        super(_42, h12, lkv2, l6q2, l6q3, l11);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = b ^ 0x7E9F9CAB1EEBL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("-\u00a0\u00ad`\u00182O\u00a9z\u00ce\u00fa\u00fc\u00c4\u0014Z\u0005\u00de}\u00d3\u0085\u0085s(A".getBytes("ISO-8859-1"));
                d = bd.c(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 d(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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

