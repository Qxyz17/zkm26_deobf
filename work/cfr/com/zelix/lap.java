/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lpm;
import com.zelix.lqu;
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

public class lap
extends lpm {
    private static final long a = prr.a(-6739017776065156193L, 3817117552385415054L, MethodHandles.lookup().lookupClass()).a(21352867286398L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    @Override
    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10;
        long l12 = l11 ^ 0x550B0FC6572DL;
        long l13 = l11 ^ 0x6DF7BA9051C2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        String string = (String)((Object)m44.a("n", (Object)objectArray2, (long)3433008837598041604L, (long)l10)) + (String)((Object)lap.b("q", (int)26783, (long)(0x70809A9D85AB5C1CL ^ l10)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray3, (long)3638594277050117288L, (long)l10);
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lap.b("q", (int)24338, (long)(0x5A2A5B44DCF924BEL ^ l10));
    }

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x28F1C20C39A2L;
        long l13 = l11 ^ 0x3E0224440141L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l12;
        objectArray2[0] = this;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6588428563206278884L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lap.b("q", (int)10962, (long)(0x36FBE4AF954E9733L ^ l10));
        objectArray3[4] = n12;
        objectArray3[3] = n11;
        objectArray3[2] = l13;
        objectArray3[1] = n10;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)this, (Object)objectArray3, (long)-4778337559753001233L, (long)l10);
    }

    public lap(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x1C43E1963899L;
        super(n10, l11);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l10 = a ^ 0x369747DFD21L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n10 = 0;
        String string = "\u008a\u00c9\u00ff\u00f7\u00baZ\u00c5;\u00c8\n\u0083\u00b9\u0093\u00c8:_\u00992\u00b6\u00d9\u00b4\u0080Y\u008b\u001d\u0007\u00fb\u00ae3Q:\u00dd0\u00d5\u00fe1\u000e\u00a2\u00c6A\u00e9\u009a_\u00fe\u0088JR\u008f\u00b3\u001b\u0003\u00bb\u0099\u00a1\u0084\u00e5\u00c2\u00be\u00b8(\u0007X\u00c5\u00b3\u001d\u00ef\u00f3U\u0085'\u00a8h\u0086j\u00eb\u0086X\u00d56\u00a9\u00d1 \u0018V\u0005r\u00e5\u00ff\u0087\u008dxk\u008e\u00e1\u00f7\t\u0091s\u00d7&\u00acL\\g\u0087\u00a3\u00eebyS0\u0096\u00b9\u0086";
        int n11 = "\u008a\u00c9\u00ff\u00f7\u00baZ\u00c5;\u00c8\n\u0083\u00b9\u0093\u00c8:_\u00992\u00b6\u00d9\u00b4\u0080Y\u008b\u001d\u0007\u00fb\u00ae3Q:\u00dd0\u00d5\u00fe1\u000e\u00a2\u00c6A\u00e9\u009a_\u00fe\u0088JR\u008f\u00b3\u001b\u0003\u00bb\u0099\u00a1\u0084\u00e5\u00c2\u00be\u00b8(\u0007X\u00c5\u00b3\u001d\u00ef\u00f3U\u0085'\u00a8h\u0086j\u00eb\u0086X\u00d56\u00a9\u00d1 \u0018V\u0005r\u00e5\u00ff\u0087\u008dxk\u008e\u00e1\u00f7\t\u0091s\u00d7&\u00acL\\g\u0087\u00a3\u00eebyS0\u0096\u00b9\u0086".length();
        int n12 = 32;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lap.c(byArray3).intern();
            if ((n13 += n12) >= n11) {
                e = stringArray;
                k = new String[3];
                return;
            }
            n12 = string.charAt(n13);
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1403;
        if (k[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])n.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lap", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n11].getBytes("ISO-8859-1");
            lap.k[n11] = lap.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lap.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lap" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lap.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

