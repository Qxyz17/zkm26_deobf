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

public class lae
extends lyn {
    private static final long a = prr.a((long)2907109255660550188L, (long)-7097374327573624902L, MethodHandles.lookup().lookupClass()).a(3528276925218L);
    private static final String[] e;
    private static final String[] f;
    private static final Map g;

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lae.b("h", (int)8047, (long)(0x29EDA632B6B1C8C6L ^ l));
    }

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x43EA633718BEL;
        long l4 = l2 ^ 0x408CF84350F9L;
        long l5 = l2 ^ 0x1A86BD711C75L;
        long l6 = l2 ^ 0x2C69CF006FB0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l4;
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = (int)m44.a("w", (Object)lqu2, (Object)objectArray4, (long)-5139488470093813520L, (long)l);
        objectArray5[3] = (int)m44.a("w", (Object)lqu2, (Object)objectArray3, (long)-5092376014320582940L, (long)l);
        objectArray5[2] = l5;
        objectArray5[1] = (int)m44.a("w", (Object)lqu2, (Object)objectArray2, (long)-6410373196425327712L, (long)l);
        objectArray5[0] = lqu2;
        m44.a("w", (Object)((Object)this), (Object)objectArray5, (long)-4748111424107166285L, (long)l);
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x2DFC2A8DAD74L;
        long l4 = l2 ^ 0x257F4A20D8A1L;
        long l5 = l2 ^ 0x1D83FF76DE4EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4963623474998811189L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        String string = (String)((Object)m44.a("m", (Object)objectArray3, (long)-6429108569517432985L, (long)l)) + (String)((Object)lae.b("h", (int)30613, (long)(0x26BCCAD783956672L ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("r", (Object)m44.a("i", (long)-6626972079646401238L, (long)l), (Object)string, (long)-4650195723326610078L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        m44.a("r", (Object)lqu2, (Object)objectArray4, (long)-6687158874277553144L, (long)l);
    }

    public lae(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x3918463DC27AL;
        super(l2, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l = a ^ 0x2BC988F7AB94L;
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
        String string = "`yzt\u001a\u0015\u00d09\u00c3T\"\u00c7_\u00a7\u00ce\u0011n\u0091\u0098QD,~(J\fE?8\u0086\u0092\u00be\u000f\u00c1\u008f+\u00de:\u00d8h\u00a1E+D\u0006+\u00cd\u00a1\u000e\u00f3\u008bd\u000f\u00fd\u000eg\u00fe\u00af:\u00bb\u0007W\u00b3?X;e\u00e3&\u0095\u00dd\u00c1\u00ca\u00c5n#\u00f8\u00fb\u00a1\u00c0Nr\u00b8\u0098\t$n\u00b2Up[\u009f\u001brW\u00c9\u00aa\u00b7\u00a0\u00a1e/q\u00acT\u009aB\u00d4g\u00d0V\b\u00ea0\u001f\u00e0\u0084\u00f6\u00be.\u00ff\u0015\u00c8\u0093\u0014\u000e\u00eak\u0085\u00b1\u00e0\u00ef7<&\u009b\u008d\u00b8\u00a2\u00a9t\u00a3szuf\u00e2\bN\u00ad\u0091\u00d6L";
        int n2 = "`yzt\u001a\u0015\u00d09\u00c3T\"\u00c7_\u00a7\u00ce\u0011n\u0091\u0098QD,~(J\fE?8\u0086\u0092\u00be\u000f\u00c1\u008f+\u00de:\u00d8h\u00a1E+D\u0006+\u00cd\u00a1\u000e\u00f3\u008bd\u000f\u00fd\u000eg\u00fe\u00af:\u00bb\u0007W\u00b3?X;e\u00e3&\u0095\u00dd\u00c1\u00ca\u00c5n#\u00f8\u00fb\u00a1\u00c0Nr\u00b8\u0098\t$n\u00b2Up[\u009f\u001brW\u00c9\u00aa\u00b7\u00a0\u00a1e/q\u00acT\u009aB\u00d4g\u00d0V\b\u00ea0\u001f\u00e0\u0084\u00f6\u00be.\u00ff\u0015\u00c8\u0093\u0014\u000e\u00eak\u0085\u00b1\u00e0\u00ef7<&\u009b\u008d\u00b8\u00a2\u00a9t\u00a3szuf\u00e2\bN\u00ad\u0091\u00d6L".length();
        int n3 = 64;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lae.c(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3804;
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
                throw new RuntimeException("com/zelix/lae", exception);
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
            lae.f[n2] = lae.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lae.b(n, l);
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
            throw new RuntimeException("com/zelix/lae" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lae.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
