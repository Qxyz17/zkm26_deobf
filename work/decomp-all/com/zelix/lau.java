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
    private static final long a = prr.a((long)-4343951284872254313L, (long)-1500741740701290717L, MethodHandles.lookup().lookupClass()).a(114990506596020L);
    private static final String f;

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x43EA633718BEL;
        long l4 = l2 ^ 0L;
        long l5 = l2 ^ 0x408CF84350F9L;
        long l6 = l2 ^ 0x2C69CF006FB0L;
        long l7 = l2 ^ 0x1A86BD711C75L;
        long l8 = l2 ^ 0x47526B4E5A06L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l8;
        CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
        lwr lwr2 = (lwr)this.V(0);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l6;
        CallSite callSite2 = m44.a("w", (Object)lqu2, (Object)objectArray3, (long)-6410373196425327712L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        CallSite callSite3 = m44.a("w", (Object)lqu2, (Object)objectArray4, (long)-5092376014320582940L, (long)l);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l5;
        CallSite callSite4 = m44.a("w", (Object)lqu2, (Object)objectArray5, (long)-5139488470093813520L, (long)l);
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = l4;
        objectArray6[1] = lqu2;
        objectArray6[0] = this;
        m44.a("w", (Object)lwr2, (Object)objectArray6, (long)-4740954200097092079L, (long)l);
        m44.a("t", (Object)((Object)this), (String)((Object)m44.a("w", (Object)lwr2, (Object)new Object[0], (long)-4968184746715213117L, (long)l)), (long)-6423358085239276720L, (long)l);
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = (int)callSite4;
        objectArray7[3] = (int)callSite3;
        objectArray7[2] = l7;
        objectArray7[1] = (int)callSite2;
        objectArray7[0] = lqu2;
        m44.a("w", (Object)((Object)this), (Object)objectArray7, (long)-4901973715932657786L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return f;
    }

    public lau(int n, char c, long l) {
        long l2 = ((long)c << 48 | l << 16 >>> 16) ^ a;
        long l3 = l2 ^ 0x160C6D4FF7DBL;
        super(l3, n);
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x257F4A20D8A1L;
        long l4 = l2 ^ 0x1D83FF76DE4EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4963623474998811189L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        String string = (String)((Object)m44.a("m", (Object)objectArray3, (long)-6429108569517432985L, (long)l)) + " " + (String)((Object)m44.a("s", (Object)((Object)this), (long)-4994844534222559451L, (long)l));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("r", (Object)m44.a("i", (long)-6626972079646401238L, (long)l), (Object)string, (long)-4650195723326610078L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x668070CC8191L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("M\u00d3\u00bb_\u0088\u00c8k!".getBytes("ISO-8859-1"));
                f = lau.c(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
