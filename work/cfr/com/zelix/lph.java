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

public class lph
extends lpm {
    private static final long a = prr.a(6246190972822125762L, 2896323385260950324L, MethodHandles.lookup().lookupClass()).a(100854715939348L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lph.b("y", (int)3425, (long)(0x7BB83954AC13DEE6L ^ l10));
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
        long l13 = l11 ^ 0x7DEC13597D49L;
        int n13 = (int)(l13 >>> 48);
        int n14 = (int)(l13 << 16 >>> 48);
        int n15 = (int)(l13 << 32 >>> 32);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = n15;
        objectArray2[2] = this;
        objectArray2[1] = (int)((short)n14);
        objectArray2[0] = (int)((short)n13);
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6351591804492277407L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lph.b("y", (int)14912, (long)(0x670CBB831E8A2F8BL ^ l10));
        objectArray3[4] = n12;
        objectArray3[3] = n11;
        objectArray3[2] = l12;
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
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l10)) + (String)((Object)lph.b("y", (int)18385, (long)(0x5611007F1D39DB78L ^ l10)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    public lph(char c10, int n10, int n11, short s10) {
        long l10 = ((long)c10 << 48 | (long)n11 << 32 >>> 16 | (long)s10 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x4E6F93731A2L;
        super(n10, l11);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l10 = a ^ 0x3E64D8A177BEL;
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
        String string = "\u00ef\u00d8L\u0010 \u00c5Pd\u009f\u00a1\u00b0\u0019[6\u00af\u0098]\u00a4\u00d7%~\u00b3\u00d9M)\u001a\u00d5c\u00b1\u001e\u00e9>\u001b\u001f\u00c2(\u00c5\u00d2\u00e3\u00e9Zm\u00f6;\u0080\u00d4\u0082\u0085\u0084\u0084F\u00e1\u00f7W\u0096\u00a2\u00c1\u0086\u0081\u008d\u00d6T\u008e\t\u00dbvTod\u00eb\u00dc\u00df \u00fb\u00cd\u00b5\u0092r\u00e0\u00b46\u007f\u0004\u00d3+4\u0099[R\u0095>\u00fc\u00b7\u00a2\u00cb*\u007f!\u0099\u0002\u00e0\u00e5&\u00af%(5\u009d\u00ad\u00da\u00c9\u00c2\\IXdq\u00bb\u00c0n(\u0096xQ\u00c7\u0084+\u00f4;\u008eF\u00baz\u0019\\\u0000\u00c8\u0092\u008b\u00b0o\u0004\u0012\u00da\u00e1\t";
        int n11 = "\u00ef\u00d8L\u0010 \u00c5Pd\u009f\u00a1\u00b0\u0019[6\u00af\u0098]\u00a4\u00d7%~\u00b3\u00d9M)\u001a\u00d5c\u00b1\u001e\u00e9>\u001b\u001f\u00c2(\u00c5\u00d2\u00e3\u00e9Zm\u00f6;\u0080\u00d4\u0082\u0085\u0084\u0084F\u00e1\u00f7W\u0096\u00a2\u00c1\u0086\u0081\u008d\u00d6T\u008e\t\u00dbvTod\u00eb\u00dc\u00df \u00fb\u00cd\u00b5\u0092r\u00e0\u00b46\u007f\u0004\u00d3+4\u0099[R\u0095>\u00fc\u00b7\u00a2\u00cb*\u007f!\u0099\u0002\u00e0\u00e5&\u00af%(5\u009d\u00ad\u00da\u00c9\u00c2\\IXdq\u00bb\u00c0n(\u0096xQ\u00c7\u0084+\u00f4;\u008eF\u00baz\u0019\\\u0000\u00c8\u0092\u008b\u00b0o\u0004\u0012\u00da\u00e1\t".length();
        int n12 = 72;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lph.c(byArray3).intern();
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3C28;
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
                throw new RuntimeException("com/zelix/lph", exception);
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
            lph.k[n11] = lph.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lph.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lph" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lph.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

