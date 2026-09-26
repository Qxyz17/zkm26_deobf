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

public class lp9
extends lpm {
    private static final long a = prr.a(-7406948936555230347L, 7396211876883432886L, MethodHandles.lookup().lookupClass()).a(20725348423445L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x443DBDCC57FFL;
        long l13 = l11 ^ 0x3E0224440141L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l12;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6877365516155334375L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lp9.b("r", (int)15673, (long)(0x492EF58292520CFAL ^ l10));
        objectArray3[4] = n12;
        objectArray3[3] = n11;
        objectArray3[2] = l13;
        objectArray3[1] = n10;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)this, (Object)objectArray3, (long)-4778337559753001233L, (long)l10);
    }

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
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l10)) + (String)((Object)lp9.b("r", (int)11314, (long)(0x61836E3070939490L ^ l10)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lp9.b("r", (int)8204, (long)(0x11895DEB12D15781L ^ l10));
    }

    public lp9(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x78A57178423CL;
        super(n10, l11);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l10 = a ^ 0x4240253F30E6L;
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
        String string = "\u00f0a0-\u00a7\u0090\u00c2{\u0016\u00db:\u00a8\u00a4\u00b2\u00ec=-\u001e\u001c\n\u00bf\u00a3\u00f0Q\u00d3\u00b19\u0003\u00b7]\u0004f0U\u00ac\u00a0\u000b\u00be\u00cd\u00d7\u00fcH\u00e6\u00f4\u00a9Y\u00a9\u000b\u0011~\u00f0#?\u00de\u0090\u001d\u00850\u001b\u00a3*\u00fd\u00f8\u00ba\u00c1~\u00a7:\u00ef\u00f7\u00ed\u008f\u008c0g\u0004\u001b\u00a4B\u00fb\u0014P\u00df \u0097\u0010\u00e6\u0010\u00fa\u00f1\u009a\u0011z\u00a0\u00cb\u00a9\r\u00e4\u00c7\u0004\u00df\u00a4h\u008a 0'\u00dfTe\u0094 \u00ca`n\u00b7\u00bd\u0089\u0002\u0085\u00e5{V\u00e4\u00fc\u00a9m\u00f3\u0093\u00f5iH\u00b5\u00e5\u00ba\u00e5\u00ef\u0014\u0007\u008b1\u00bblT\u00b9\u00c1\u00f3\u001d\u00fd\u00c2\u007f\u00d8FC\u00e3\u00db\u00e6\u00fdlN\u00ed\u009f";
        int n11 = "\u00f0a0-\u00a7\u0090\u00c2{\u0016\u00db:\u00a8\u00a4\u00b2\u00ec=-\u001e\u001c\n\u00bf\u00a3\u00f0Q\u00d3\u00b19\u0003\u00b7]\u0004f0U\u00ac\u00a0\u000b\u00be\u00cd\u00d7\u00fcH\u00e6\u00f4\u00a9Y\u00a9\u000b\u0011~\u00f0#?\u00de\u0090\u001d\u00850\u001b\u00a3*\u00fd\u00f8\u00ba\u00c1~\u00a7:\u00ef\u00f7\u00ed\u008f\u008c0g\u0004\u001b\u00a4B\u00fb\u0014P\u00df \u0097\u0010\u00e6\u0010\u00fa\u00f1\u009a\u0011z\u00a0\u00cb\u00a9\r\u00e4\u00c7\u0004\u00df\u00a4h\u008a 0'\u00dfTe\u0094 \u00ca`n\u00b7\u00bd\u0089\u0002\u0085\u00e5{V\u00e4\u00fc\u00a9m\u00f3\u0093\u00f5iH\u00b5\u00e5\u00ba\u00e5\u00ef\u0014\u0007\u008b1\u00bblT\u00b9\u00c1\u00f3\u001d\u00fd\u00c2\u007f\u00d8FC\u00e3\u00db\u00e6\u00fdlN\u00ed\u009f".length();
        int n12 = 32;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lp9.c(byArray3).intern();
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1821;
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
                throw new RuntimeException("com/zelix/lp9", exception);
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
            lp9.k[n11] = lp9.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lp9.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lp9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lp9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

