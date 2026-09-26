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

public class lax
extends lyn {
    private static final long a = prr.a((long)4520827933563502226L, (long)1360363163437980783L, MethodHandles.lookup().lookupClass()).a(126501698638227L);
    private static final String[] e;
    private static final String[] f;
    private static final Map g;

    public void M(Object[] objectArray) {
        lmu lmu2 = (lmu)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x43EA633718BEL;
        long l4 = l2 ^ 0x1A86BD711C75L;
        long l5 = l2 ^ 0x408CF84350F9L;
        long l6 = l2 ^ 0x2C69CF006FB0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l5;
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = (int)m44.a("w", (Object)lqu2, (Object)objectArray4, (long)-5139488470093813520L, (long)l);
        objectArray5[3] = (int)m44.a("w", (Object)lqu2, (Object)objectArray3, (long)-5092376014320582940L, (long)l);
        objectArray5[2] = l4;
        objectArray5[1] = (int)m44.a("w", (Object)lqu2, (Object)objectArray2, (long)-6410373196425327712L, (long)l);
        objectArray5[0] = lqu2;
        m44.a("w", (Object)((Object)this), (Object)objectArray5, (long)-5057882865906223091L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lax.b("y", (int)14754, (long)(0x144A85E2B18BC866L ^ l));
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x5C29B3C57D21L;
        long l4 = l2 ^ 0x257F4A20D8A1L;
        long l5 = l2 ^ 0x1D83FF76DE4EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4963623474998811189L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        String string = (String)((Object)m44.a("m", (Object)objectArray3, (long)-6429108569517432985L, (long)l)) + (String)((Object)lax.b("y", (int)30315, (long)(0x4068DC127FCE41E1L ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("r", (Object)m44.a("i", (long)-6626972079646401238L, (long)l), (Object)string, (long)-4650195723326610078L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        m44.a("r", (Object)lqu2, (Object)objectArray4, (long)-6735528157078419705L, (long)l);
    }

    public lax(int n, int n2, int n3, int n4) {
        long l = ((long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)n4 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x71FB6F4BAE8DL;
        super(l2, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l = a ^ 0x49F4932F4794L;
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
        String string = "\u00b40SR\b\u0014\u00a0\u0002 D\u00fd\u00f5\u00ad\u0092O\u00dd\u00c7Bm\u0080h+JJ\u00c8\u0017\u00a3'\u00b9\u0096\"b\u008e\u0081\u0098\u008c\u008b9\u00c4'h\t\u00a6\u00f6\u00c7Ih\u0087afM\u00d5D\u0098\u0081\u00b2\u009a\u009d\u0011\u00ec5\u00d9oW\u0095}.\u00b2\u00ca\u00admN8\u00ca\u00cb\u00d3\u0018QCu8\u00d5S\u00d4\u00c3\u00de\u00de\u00fe\u0088\u00cb.\u0097\u0094P\u00b9C\u00b5\rf\u00e7A\u00db\u00ae\u0082C\u001f\u00ee\u0013L\u00d6\u0089\u00cb\u00cc\u00ac\u00df\u008a|q1\u00d9\u00afQ\u000f\u00aef\u00ae\u00c6\u0095&\u0014\u00c7\u0097\u0084_\u00a1\u00fd\u0088";
        int n2 = "\u00b40SR\b\u0014\u00a0\u0002 D\u00fd\u00f5\u00ad\u0092O\u00dd\u00c7Bm\u0080h+JJ\u00c8\u0017\u00a3'\u00b9\u0096\"b\u008e\u0081\u0098\u008c\u008b9\u00c4'h\t\u00a6\u00f6\u00c7Ih\u0087afM\u00d5D\u0098\u0081\u00b2\u009a\u009d\u0011\u00ec5\u00d9oW\u0095}.\u00b2\u00ca\u00admN8\u00ca\u00cb\u00d3\u0018QCu8\u00d5S\u00d4\u00c3\u00de\u00de\u00fe\u0088\u00cb.\u0097\u0094P\u00b9C\u00b5\rf\u00e7A\u00db\u00ae\u0082C\u001f\u00ee\u0013L\u00d6\u0089\u00cb\u00cc\u00ac\u00df\u008a|q1\u00d9\u00afQ\u000f\u00aef\u00ae\u00c6\u0095&\u0014\u00c7\u0097\u0084_\u00a1\u00fd\u0088".length();
        int n3 = 80;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lax.c(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1E68;
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
                throw new RuntimeException("com/zelix/lax", exception);
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
            lax.f[n2] = lax.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lax.b(n, l);
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
            throw new RuntimeException("com/zelix/lax" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lax.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
