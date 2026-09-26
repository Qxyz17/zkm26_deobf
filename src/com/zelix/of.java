/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.o4;
import com.zelix.prr;
import com.zelix.uy;
import java.io.File;
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
import javax.swing.ListModel;

public class of
extends o4 {
    String i;
    boolean y;
    File A;
    private static final long a = prr.a((long)8249236266035934939L, (long)-2727674743561424535L, MethodHandles.lookup().lookupClass()).a(173191392287365L);
    private static final String[] h;
    private static final String[] j;
    private static final Map k;

    public void A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        l = a ^ l;
        m44.a("s", (Object)((Object)this), (boolean)bl, (long)-107401543394324256L, (long)l);
    }

    public of(long l) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x1A31E2AC0DE6L;
        int n = (int)(l3 >>> 48);
        int n2 = (int)(l3 << 16 >>> 48);
        int n3 = (int)(l3 << 32 >>> 32);
        long l4 = l2 ^ 0x383B14E71215L;
        super((char)n, (char)n2, n3);
        m44.a("t", (Object)((Object)this), (boolean)true, (long)1879485209664025719L, (long)l);
        m44.a("t", (Object)((Object)this), (String)((Object)m44.a("h", (Object)of.b("k", (int)1745, (long)(0x28A42492F8F519AL ^ l)), (long)1817726562793910918L, (long)l)), (long)1913335202563917122L, (long)l);
        m44.a("t", (Object)((Object)this), (File)new File((String)((Object)m44.a("v", (Object)((Object)this), (long)1913335202563917122L, (long)l))), (long)2205307407767681039L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        m44.a("i", (Object)((Object)this), (Object)objectArray, (long)1852439563968122801L, (long)l);
    }

    private void L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x72B13B610BC4L;
        m44.a("r", (Object)((Object)this), (Object)new uy(l2, this), (long)4209693825490494745L, (long)l);
    }

    public of(long l, ListModel listModel) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x2B29D7039C45L;
        long l4 = l2 ^ 0x3AF48686BBFCL;
        super(listModel, l3);
        m44.a("u", (Object)((Object)this), (boolean)true, (long)-5477424876086207074L, (long)l);
        m44.a("u", (Object)((Object)this), (String)((Object)m44.a("i", (Object)of.b("k", (int)7613, (long)(0x62B7CA25028E631EL ^ l)), (long)-5705816215247725713L, (long)l)), (long)-5520134457581687637L, (long)l);
        m44.a("u", (Object)((Object)this), (File)new File((String)((Object)m44.a("w", (Object)((Object)this), (long)-5520134457581687637L, (long)l))), (long)-5227604220162207258L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        m44.a("h", (Object)((Object)this), (Object)objectArray, (long)-5738662108509067688L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        k = new HashMap(13);
        long l = a ^ 0x1DE14844B1A2L;
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
        String string = "v\u00a2G\u00db\u00ba\u00956@\u00c5C\u0093B}\u00c9i|\u00d4\u00a5\u0090\u009b\u0019\u0097\u008e\u00ecD\u0085,\u0089\u00b8\u00f2d\u00f7 \u00ff[\u00e1\u0006\f]\u0080\u0011f\u00e5\u00a1\u008d\u00b3\u00dc\u00f4\u008c8(+\u00dev\u00c3qj<\u0011=\u00fdd\r\u00d4|";
        int n2 = "v\u00a2G\u00db\u00ba\u00956@\u00c5C\u0093B}\u00c9i|\u00d4\u00a5\u0090\u009b\u0019\u0097\u008e\u00ecD\u0085,\u0089\u00b8\u00f2d\u00f7 \u00ff[\u00e1\u0006\f]\u0080\u0011f\u00e5\u00a1\u008d\u00b3\u00dc\u00f4\u008c8(+\u00dev\u00c3qj<\u0011=\u00fdd\r\u00d4|".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = of.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                h = stringArray;
                j = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String b(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x40AD;
        if (j[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])k.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/of", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            of.j[n2] = of.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return j[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = of.b(n, l);
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
            throw new RuntimeException("com/zelix/of" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(of.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
