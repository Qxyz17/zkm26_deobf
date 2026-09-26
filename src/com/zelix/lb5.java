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

public class lb5 {
    static final int[] G;
    static final int[] T;
    static final int[] x;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l;
        long l2 = l = prr.a((long)63214843438400848L, (long)-668734525909268896L, MethodHandles.lookup().lookupClass()).a(208850223539776L) ^ 0x3392E0F122F9L;
        long l3 = l2 ^ 0x4DBCF8627622L;
        long l4 = l2 ^ 0x4563535F9D71L;
        long l5 = l2 ^ 0xE2E2F68D3A5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00a9\u00b8`c\u00b5Ac\u0097\u00da._K\b\u001d\u00f7\u00cc";
        int n2 = "\u00a9\u00b8`c\u00b5Ac\u0097\u00da._K\b\u001d\u00f7\u00cc".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l6 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l6 >>> 56), (byte)(l6 >>> 48), (byte)(l6 >>> 40), (byte)(l6 >>> 32), (byte)(l6 >>> 24), (byte)(l6 >>> 16), (byte)(l6 >>> 8), (byte)l6});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        G = new int[((CallSite)m44.a("k", (Object)objectArray, (long)6430381098993364436L, (long)l)).length];
        try {
            m44.a("o", (long)4914817813810214564L, (long)l)[m44.a("o", (long)5111567619673154496L, (long)l).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)4914817813810214564L, (long)l)[m44.a("o", (long)6585119725119246866L, (long)l).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)4914817813810214564L, (long)l)[m44.a("o", (long)5093339529223249206L, (long)l).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)4914817813810214564L, (long)l)[m44.a("o", (long)4839783992206839561L, (long)l).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)4914817813810214564L, (long)l)[m44.a("o", (long)5079952093235956392L, (long)l).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        T = new int[((CallSite)m44.a("k", (Object)objectArray2, (long)6678707393063191670L, (long)l)).length];
        try {
            m44.a("o", (long)6456121891489116410L, (long)l)[m44.a("o", (long)5073428864188795711L, (long)l).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)6456121891489116410L, (long)l)[m44.a("o", (long)4741341409723140312L, (long)l).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)6456121891489116410L, (long)l)[m44.a("o", (long)6368229371481344032L, (long)l).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)6456121891489116410L, (long)l)[m44.a("o", (long)6696829477628442797L, (long)l).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)6456121891489116410L, (long)l)[m44.a("o", (long)4955521428317913860L, (long)l).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        x = new int[((CallSite)m44.a("k", (Object)objectArray3, (long)6484402460601312837L, (long)l)).length];
        try {
            m44.a("o", (long)5187537308106285678L, (long)l)[m44.a("o", (long)4738525036955310637L, (long)l).ordinal()] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)5187537308106285678L, (long)l)[m44.a("o", (long)4833476940295428397L, (long)l).ordinal()] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)5187537308106285678L, (long)l)[m44.a("o", (long)4981960767709778893L, (long)l).ordinal()] = (CallSite)3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)5187537308106285678L, (long)l)[m44.a("o", (long)4916571506780000839L, (long)l).ordinal()] = (CallSite)4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)5187537308106285678L, (long)l)[m44.a("o", (long)6916344866890871472L, (long)l).ordinal()] = (CallSite)5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)5187537308106285678L, (long)l)[m44.a("o", (long)6461486988304799599L, (long)l).ordinal()] = (CallSite)((int)lArray[1]);
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            m44.a("o", (long)5187537308106285678L, (long)l)[m44.a("o", (long)4688313834142623870L, (long)l).ordinal()] = (CallSite)((int)lArray[0]);
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
