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
    private static final long a = prr.a((long)6246190972822125762L, (long)2896323385260950324L, MethodHandles.lookup().lookupClass()).a(100854715939348L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lph.b("y", (int)3425, (long)(0x7BB83954AC13DEE6L ^ l));
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3E0224440141L;
        long l4 = l2 ^ 0x7DEC13597D49L;
        int n4 = (int)(l4 >>> 48);
        int n5 = (int)(l4 << 16 >>> 48);
        int n6 = (int)(l4 << 32 >>> 32);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = n6;
        objectArray2[2] = this;
        objectArray2[1] = (int)((short)n5);
        objectArray2[0] = (int)((short)n4);
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6351591804492277407L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lph.b("y", (int)14912, (long)(0x670CBB831E8A2F8BL ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x6DF7BA9051C2L;
        long l4 = l2 ^ 0x550B0FC6572DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray2, (long)3638594277050117288L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l)) + (String)((Object)lph.b("y", (int)18385, (long)(0x5611007F1D39DB78L ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    public lph(char c, int n, int n2, short s) {
        long l = ((long)c << 48 | (long)n2 << 32 >>> 16 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0x4E6F93731A2L;
        super(n, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l = a ^ 0x3E64D8A177BEL;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u00ef\u00d8L\u0010 \u00c5Pd\u009f\u00a1\u00b0\u0019[6\u00af\u0098]\u00a4\u00d7%~\u00b3\u00d9M)\u001a\u00d5c\u00b1\u001e\u00e9>\u001b\u001f\u00c2(\u00c5\u00d2\u00e3\u00e9Zm\u00f6;\u0080\u00d4\u0082\u0085\u0084\u0084F\u00e1\u00f7W\u0096\u00a2\u00c1\u0086\u0081\u008d\u00d6T\u008e\t\u00dbvTod\u00eb\u00dc\u00df \u00fb\u00cd\u00b5\u0092r\u00e0\u00b46\u007f\u0004\u00d3+4\u0099[R\u0095>\u00fc\u00b7\u00a2\u00cb*\u007f!\u0099\u0002\u00e0\u00e5&\u00af%(5\u009d\u00ad\u00da\u00c9\u00c2\\IXdq\u00bb\u00c0n(\u0096xQ\u00c7\u0084+\u00f4;\u008eF\u00baz\u0019\\\u0000\u00c8\u0092\u008b\u00b0o\u0004\u0012\u00da\u00e1\t";
        int n2 = "\u00ef\u00d8L\u0010 \u00c5Pd\u009f\u00a1\u00b0\u0019[6\u00af\u0098]\u00a4\u00d7%~\u00b3\u00d9M)\u001a\u00d5c\u00b1\u001e\u00e9>\u001b\u001f\u00c2(\u00c5\u00d2\u00e3\u00e9Zm\u00f6;\u0080\u00d4\u0082\u0085\u0084\u0084F\u00e1\u00f7W\u0096\u00a2\u00c1\u0086\u0081\u008d\u00d6T\u008e\t\u00dbvTod\u00eb\u00dc\u00df \u00fb\u00cd\u00b5\u0092r\u00e0\u00b46\u007f\u0004\u00d3+4\u0099[R\u0095>\u00fc\u00b7\u00a2\u00cb*\u007f!\u0099\u0002\u00e0\u00e5&\u00af%(5\u009d\u00ad\u00da\u00c9\u00c2\\IXdq\u00bb\u00c0n(\u0096xQ\u00c7\u0084+\u00f4;\u008eF\u00baz\u0019\\\u0000\u00c8\u0092\u008b\u00b0o\u0004\u0012\u00da\u00e1\t".length();
        int n3 = 72;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lph.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                e = stringArray;
                k = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3C28;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])lph.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lph.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lph", exception);
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
            lph.k[n2] = lph.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lph.b(n, l);
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
