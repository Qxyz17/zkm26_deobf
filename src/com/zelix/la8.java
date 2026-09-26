/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lyn;
import com.zelix.m44;
import com.zelix.prr;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class la8
extends lyn {
    private static final long a = prr.a((long)4504055904562914157L, (long)-7929260735107731791L, MethodHandles.lookup().lookupClass()).a(144240675289652L);
    private static final String[] e;
    private static final String[] f;
    private static final Map g;

    public la8(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x7C44435821F9L;
        super(l2, n);
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x33BC780B54ECL;
        long l4 = l2 ^ 0x257F4A20D8A1L;
        long l5 = l2 ^ 0x1D83FF76DE4EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4963623474998811189L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        String string = (String)((Object)m44.a("m", (Object)objectArray3, (long)-6429108569517432985L, (long)l)) + (String)((Object)la8.b("c", (int)11462, (long)(0x28BE32BAFC886A6FL ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("r", (Object)m44.a("i", (long)-6626972079646401238L, (long)l), (Object)string, (long)-4650195723326610078L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        m44.a("r", (Object)lqu2, (Object)objectArray4, (long)-4767164161027549515L, (long)l);
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x43EA633718BEL;
        long l4 = l2 ^ 0x408CF84350F9L;
        long l5 = l2 ^ 0x2C69CF006FB0L;
        long l6 = l2 ^ 0x1A86BD711C75L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l4;
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = (int)m44.a("w", (Object)lqu2, (Object)objectArray4, (long)-5139488470093813520L, (long)l);
        objectArray5[3] = (int)m44.a("w", (Object)lqu2, (Object)objectArray3, (long)-5092376014320582940L, (long)l);
        objectArray5[2] = l6;
        objectArray5[1] = (int)m44.a("w", (Object)lqu2, (Object)objectArray2, (long)-6410373196425327712L, (long)l);
        objectArray5[0] = lqu2;
        m44.a("w", (Object)((Object)this), (Object)objectArray5, (long)-6430941091978753300L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return la8.b("c", (int)8588, (long)(0xBA07F61B9F7A16BL ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l = a ^ 0xA36D06F1765L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00c7\u00b8x\u00ffC\u00c5\u009a\u00c4r\u00c8S#7u\u0094\u008d\u00c9\u0091\u00fbc\u00ff\u00bd\u00adk9\u009bK\u0087\u00bel\u0099\u00ba\u00c7\u00ef}K-\u00b3\u0099\u0093\u008e\u00ac\u00b2\u00d2\u007f\u00edT\u00fc\u00c3vBK\u00c9\u009a\u0099\u008a\u00a9\u00e6t\u00830\u00e5=\u00e08^B\u0006\u0080 \u00ff\u00be\u00ce\u00cf\u0093\u00aaN~\u00ac\u00a44\u00951\u0004n\u00b3\u008e\u00fc\u00d1\u0082b\u00c9\u000eo\u00fa\u00f2\u00c6\u00ba\u0088\u00ca\u008b\u008fU\u00d7\u0086\u00db\u00f1S\u00ea\r\u00e7u\u00d7\u00a8p\u0003\u00cf{P\u008f\u00df";
        int n2 = "\u00c7\u00b8x\u00ffC\u00c5\u009a\u00c4r\u00c8S#7u\u0094\u008d\u00c9\u0091\u00fbc\u00ff\u00bd\u00adk9\u009bK\u0087\u00bel\u0099\u00ba\u00c7\u00ef}K-\u00b3\u0099\u0093\u008e\u00ac\u00b2\u00d2\u007f\u00edT\u00fc\u00c3vBK\u00c9\u009a\u0099\u008a\u00a9\u00e6t\u00830\u00e5=\u00e08^B\u0006\u0080 \u00ff\u00be\u00ce\u00cf\u0093\u00aaN~\u00ac\u00a44\u00951\u0004n\u00b3\u008e\u00fc\u00d1\u0082b\u00c9\u000eo\u00fa\u00f2\u00c6\u00ba\u0088\u00ca\u008b\u008fU\u00d7\u0086\u00db\u00f1S\u00ea\r\u00e7u\u00d7\u00a8p\u0003\u00cf{P\u008f\u00df".length();
        int n3 = 64;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = la8.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                e = stringArray;
                f = new String[2];
                return;
            }
            n3 = string.charAt(n4);
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6F4B;
        if (f[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/la8", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            la8.f[n2] = la8.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = la8.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/la8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(la8.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
