/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lpc;
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

public class lpi
extends lpc {
    private static final long e = prr.a(1244650982512404389L, 8834187667757762020L, MethodHandles.lookup().lookupClass()).a(271052244204207L);
    private static final String[] k;
    private static final String[] n;
    private static final Map o;

    @Override
    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10;
        long l12 = l11 ^ 0x6DF7BA9051C2L;
        long l13 = l11 ^ 0x550B0FC6572DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray2, (long)3638594277050117288L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l10)) + (String)((Object)lpi.b("b", (int)6364, (long)(0x48D6CC3C357D38DBL ^ l10)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lpi.b("b", (int)8326, (long)(0x230554C05AD1CFAEL ^ l10));
    }

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x3E0224440141L;
        long l13 = l11 ^ 0x268009877B77L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = this;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6416120663529261688L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpi.b("b", (int)8653, (long)(0x2FED5379F2FF88A8L ^ l10));
        objectArray3[4] = n12;
        objectArray3[3] = n11;
        objectArray3[2] = l12;
        objectArray3[1] = n10;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)this, (Object)objectArray3, (long)-4778337559753001233L, (long)l10);
    }

    public lpi(int n10, long l10) {
        long l11 = (l10 = e ^ l10) ^ 0x75901F99C8E8L;
        super(l11, n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new HashMap(13);
        long l10 = e ^ 0x292E5A48B0EEL;
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
        String string = "\u00ef\u0002\u00b7X\n_\u00d1Y\u00ff\u0091\u00de\u009b\u00f8\u00f3!x\u00b1)`q\u00b81\u00be!P._9\u00ea\u00aaX?\u009b\u0099\u0005\u00a5\u00b6\u0080\u00bf\u00e4+\u00f9Y1}\u000f\u0006[\u0094\u00e2\u009fJrY\u0010e\u00d5\u00ba\u00f6*n\u00fb[GHN\u00ddi\u00d4\u00a0\u00fe\u00caP\u0001\u00ady/\u0085\u00de\u00ef\u0086\n\u00a5\u00cf|3\u0087\u00f4P+\u00caq$^b\u00b3qq\u00ef\u00d5\u00ce\u00dd\u00cef\u00150\u00f4\u00c0\u000fB\u00be\u00aa\u00afg\u00d6]\u00d3\u00bd\u00ac\u00f5\u00bf\u0098\u0015P\u00eb\u00f0\u00ed\u00f1\u00a4\u00cc\u0093'\u00d0\u00d8\u00ff\u001ePz\u00e6\u00d1R]\u000f+\u0015\u00b4\u00fe\u00e7\u0094~\u00d3\u0098\u00ce\u001e";
        int n11 = "\u00ef\u0002\u00b7X\n_\u00d1Y\u00ff\u0091\u00de\u009b\u00f8\u00f3!x\u00b1)`q\u00b81\u00be!P._9\u00ea\u00aaX?\u009b\u0099\u0005\u00a5\u00b6\u0080\u00bf\u00e4+\u00f9Y1}\u000f\u0006[\u0094\u00e2\u009fJrY\u0010e\u00d5\u00ba\u00f6*n\u00fb[GHN\u00ddi\u00d4\u00a0\u00fe\u00caP\u0001\u00ady/\u0085\u00de\u00ef\u0086\n\u00a5\u00cf|3\u0087\u00f4P+\u00caq$^b\u00b3qq\u00ef\u00d5\u00ce\u00dd\u00cef\u00150\u00f4\u00c0\u000fB\u00be\u00aa\u00afg\u00d6]\u00d3\u00bd\u00ac\u00f5\u00bf\u0098\u0015P\u00eb\u00f0\u00ed\u00f1\u00a4\u00cc\u0093'\u00d0\u00d8\u00ff\u001ePz\u00e6\u00d1R]\u000f+\u0015\u00b4\u00fe\u00e7\u0094~\u00d3\u0098\u00ce\u001e".length();
        int n12 = 24;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lpi.c(byArray3).intern();
            if ((n13 += n12) >= n11) {
                k = stringArray;
                n = new String[3];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x87;
        if (n[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])o.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lpi", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n11].getBytes("ISO-8859-1");
            lpi.n[n11] = lpi.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return n[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lpi.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lpi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lpi.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

