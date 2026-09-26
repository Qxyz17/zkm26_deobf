/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.va;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l6u {
    static final int[] r;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l10 = prr.a(-6505344663052625840L, 4000517949417662934L, MethodHandles.lookup().lookupClass()).a(63008727981641L) ^ 0x63B4522D314BL;
        long l11 = l10 ^ 0x2716288E3FC2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "^\u008aa\u00f0 b\u00aa\u007fEb\u00c3\u00de\u001f\u00ea\u00be\u00aa";
        int n11 = "^\u008aa\u00f0 b\u00aa\u007fEb\u00c3\u00de\u001f\u00ea\u00be\u00aa".length();
        int n12 = 0;
        do {
            byte[] byArray3 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l12 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l12 >>> 56), (byte)(l12 >>> 48), (byte)(l12 >>> 40), (byte)(l12 >>> 32), (byte)(l12 >>> 24), (byte)(l12 >>> 16), (byte)(l12 >>> 8), (byte)l12});
            lArray[n13] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n12 < n11);
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        r = new int[((CallSite)m44.a("h", (Object)objectArray, (long)3830493535087385872L, (long)l10)).length];
        try {
            l6u.r[va.Q.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            l6u.r[((Enum)((Object)m44.a("l", (long)3312589634590105933L, (long)l10))).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            l6u.r[((Enum)((Object)m44.a("l", (long)3222562614441601231L, (long)l10))).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            l6u.r[((Enum)((Object)m44.a("l", (long)3065640016710897204L, (long)l10))).ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            l6u.r[((Enum)((Object)m44.a("l", (long)3063643068210207937L, (long)l10))).ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            l6u.r[((Enum)((Object)m44.a("l", (long)3407230749865371464L, (long)l10))).ordinal()] = (int)lArray[1];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            l6u.r[((Enum)((Object)m44.a("l", (long)3530063119160283855L, (long)l10))).ordinal()] = (int)lArray[0];
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

