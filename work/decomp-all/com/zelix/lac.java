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

public class lac
extends lyn {
    private static final long a = prr.a((long)7954938163272807402L, (long)1824162984484156191L, MethodHandles.lookup().lookupClass()).a(57921648413125L);
    private static final String[] e;
    private static final String[] f;
    private static final Map g;

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
        m44.a("w", (Object)((Object)this), (Object)objectArray5, (long)-6605449421998177939L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lac.b("z", (int)128, (long)(0x11471DB3FA972BDCL ^ l));
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x4F7B1D0BADACL;
        long l4 = l2 ^ 0x257F4A20D8A1L;
        long l5 = l2 ^ 0x1D83FF76DE4EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4963623474998811189L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        String string = (String)((Object)m44.a("m", (Object)objectArray3, (long)-6429108569517432985L, (long)l)) + (String)((Object)lac.b("z", (int)1663, (long)(0x23049593F72D6B6DL ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("r", (Object)m44.a("i", (long)-6626972079646401238L, (long)l), (Object)string, (long)-4650195723326610078L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        m44.a("r", (Object)lqu2, (Object)objectArray4, (long)-5095955024197432840L, (long)l);
    }

    public lac(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x56C30F782932L;
        super(l2, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l = a ^ 0x31DAAFA252CBL;
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
        String string = "\u00a4\u000b4\u00e4>\u00e1\u000b\u0006\u00e9\u00bb'^\u00f2to]>2\u00c9\u00f8\u00ee[\u00f97\u0002KY\u00cb;\u000f\u0013\u00f1\u00aecU\u0081i\u00e3\u000bV\r\u009dx9\u00f5\u0006O\u00b9H_M+J)2\u00ae2\u0099\u00c6\u00bf\u00c2\u00fd\u0004I\u00d2V\u007f\u00ab\u00ce\u00c0)\u00f2\u00bf\u00a2\u0017\u00c3\u00c8\u00a5pb\u00fbO\u00ce\u00a9\u00ddh\u0098$+\u00c5<\u00b2V\u00de\u00e1\u0018\u00cb\u00c9\u00f5\u00be g\u00e53\u00f4\u00d3\u00bfg\u00b5C\u0004\u0085X\u0019\u00a5YZ\u00d4K\u00ad\u00af";
        int n2 = "\u00a4\u000b4\u00e4>\u00e1\u000b\u0006\u00e9\u00bb'^\u00f2to]>2\u00c9\u00f8\u00ee[\u00f97\u0002KY\u00cb;\u000f\u0013\u00f1\u00aecU\u0081i\u00e3\u000bV\r\u009dx9\u00f5\u0006O\u00b9H_M+J)2\u00ae2\u0099\u00c6\u00bf\u00c2\u00fd\u0004I\u00d2V\u007f\u00ab\u00ce\u00c0)\u00f2\u00bf\u00a2\u0017\u00c3\u00c8\u00a5pb\u00fbO\u00ce\u00a9\u00ddh\u0098$+\u00c5<\u00b2V\u00de\u00e1\u0018\u00cb\u00c9\u00f5\u00be g\u00e53\u00f4\u00d3\u00bfg\u00b5C\u0004\u0085X\u0019\u00a5YZ\u00d4K\u00ad\u00af".length();
        int n3 = 48;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lac.c(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x44F1;
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
                throw new RuntimeException("com/zelix/lac", exception);
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
            lac.f[n2] = lac.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lac.b(n, l);
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
            throw new RuntimeException("com/zelix/lac" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lac.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
