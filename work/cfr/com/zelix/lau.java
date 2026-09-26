/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lwr;
import com.zelix.lyn;
import com.zelix.m44;
import com.zelix.prr;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lau
extends lyn {
    String e;
    private static final long a = prr.a(-4343951284872254313L, -1500741740701290717L, MethodHandles.lookup().lookupClass()).a(114990506596020L);
    private static final String f;

    @Override
    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x43EA633718BEL;
        long l13 = l11 ^ 0L;
        long l14 = l11 ^ 0x408CF84350F9L;
        long l15 = l11 ^ 0x2C69CF006FB0L;
        long l16 = l11 ^ 0x1A86BD711C75L;
        long l17 = l11 ^ 0x47526B4E5A06L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l17;
        CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
        lwr lwr2 = (lwr)this.V(0);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l15;
        CallSite callSite2 = m44.a("w", (Object)lqu2, (Object)objectArray3, (long)-6410373196425327712L, (long)l10);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l12;
        CallSite callSite3 = m44.a("w", (Object)lqu2, (Object)objectArray4, (long)-5092376014320582940L, (long)l10);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l14;
        CallSite callSite4 = m44.a("w", (Object)lqu2, (Object)objectArray5, (long)-5139488470093813520L, (long)l10);
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = l13;
        objectArray6[1] = lqu2;
        objectArray6[0] = this;
        m44.a("w", (Object)lwr2, (Object)objectArray6, (long)-4740954200097092079L, (long)l10);
        m44.a("t", (Object)this, (String)((Object)m44.a("w", (Object)lwr2, (Object)new Object[0], (long)-4968184746715213117L, (long)l10)), (long)-6423358085239276720L, (long)l10);
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = (int)callSite4;
        objectArray7[3] = (int)callSite3;
        objectArray7[2] = l16;
        objectArray7[1] = (int)callSite2;
        objectArray7[0] = lqu2;
        m44.a("w", (Object)this, (Object)objectArray7, (long)-4901973715932657786L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return f;
    }

    public lau(int n10, char c10, long l10) {
        long l11 = ((long)c10 << 48 | l10 << 16 >>> 16) ^ a;
        long l12 = l11 ^ 0x160C6D4FF7DBL;
        super(l12, n10);
    }

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x257F4A20D8A1L;
        long l13 = l11 ^ 0x1D83FF76DE4EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite = m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4963623474998811189L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        String string = (String)((Object)m44.a("m", (Object)objectArray3, (long)-6429108569517432985L, (long)l10)) + " " + (String)((Object)m44.a("s", (Object)this, (long)-4994844534222559451L, (long)l10));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("r", (Object)m44.a("i", (long)-6626972079646401238L, (long)l10), (Object)string, (long)-4650195723326610078L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x668070CC8191L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("M\u00d3\u00bb_\u0088\u00c8k!".getBytes("ISO-8859-1"));
                f = lau.c(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
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

