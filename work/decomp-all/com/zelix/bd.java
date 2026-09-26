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
    private static final long b = prr.a((long)-4704447026613819946L, (long)-4106000492509430068L, MethodHandles.lookup().lookupClass()).a(253580860057787L);
    private static final String d;

    public void S(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = (Integer)objectArray[2];
        HashMap hashMap = (HashMap)objectArray[3];
        long l2 = l ^ 0x584114EB5F36L;
        String string = this.O().V();
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = this;
        objectArray2[4] = hashMap;
        objectArray2[3] = n2;
        objectArray2[2] = n;
        objectArray2[1] = l2;
        objectArray2[0] = string;
        CallSite callSite = m44.a("m", (Object)objectArray2, (long)-7491983056205073157L, (long)l);
        try {
            if (!string.equals(callSite)) {
                this.O().A((String)((Object)callSite));
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)((Object)n92), (long)-9065968597966878795L, (long)l);
        }
    }

    public String R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return d;
    }

    bd(_4 _42, h1 h12, short s, int n, lkv lkv2, l6q l6q2, l6q l6q3, short s2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ b;
        long l2 = l ^ 0x6341339ECF9AL;
        super(_42, h12, lkv2, l6q2, l6q3, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x7E9F9CAB1EEBL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("-\u00a0\u00ad`\u00182O\u00a9z\u00ce\u00fa\u00fc\u00c4\u0014Z\u0005\u00de}\u00d3\u0085\u0085s(A".getBytes("ISO-8859-1"));
                d = bd.c(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static n9 d(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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
