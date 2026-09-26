/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ay;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import com.zelix.x7;
import java.io.DataOutputStream;
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

public class xy
extends x7 {
    static final va L;
    float J;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public boolean e(long l, gu gu2, Object object, Object object2) {
        long l2 = l ^ 0xB1C2A58BC7CL;
        return gu2.K((js)this, object, l2, object2);
    }

    public String j(long l) {
        return xy.b("m", (int)2304, (long)(0x52C77EF6FA6D5D56L ^ l));
    }

    public String u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x555E98E15F66L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        return m44.a("t", (Object)((Object)this), (char)((char)n), (int)n2, (short)((short)n3), (long)-5456974492690933189L, (long)l);
    }

    public void b(Object[] objectArray) {
        CallSite callSite;
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l2 = l ^ 0x3C02A3BC840AL;
        try {
            callSite = m44.a("r", (Object)m44.a("m", (Object)string, (long)3430818431217077085L, (long)l), (long)3618982592334955859L, (long)l);
        }
        catch (NumberFormatException numberFormatException) {
            throw new ay(string + (String)((Object)xy.b("m", (int)2702, (long)(0x2DC4BF51F47CCAA6L ^ l))));
        }
        m44.a("q", (Object)((Object)this), (float)callSite, (long)3092825309695262257L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)3889767407696488877L, (long)l);
    }

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-278918059764791689L, (long)l).g());
        m44.a("v", (Object)dataOutputStream, (float)m44.a("w", (Object)((Object)this), (long)-472907059889181259L, (long)l), (long)-45966136327629298L, (long)l);
    }

    public String z(char c, int n, short s) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        return m44.a("m", (float)m44.a("s", (Object)((Object)this), (long)-1469321937948836031L, (long)l), (long)-1249385698684858119L, (long)l);
    }

    public va A(long l) {
        return m44.a("i", (long)-5371249074946568413L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)1462629531159101126L, (long)-4139725631461066913L, MethodHandles.lookup().lookupClass()).a(133465571238564L);
        long l = a ^ 0x76A3595E8FF7L;
        d = new HashMap(13);
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
        String string = "\u00ef\u001d\u00c0ZE\u009a|8\u00e0\u0097\u00a0B!\u00f8m\u00b1(\u00dfL\u0080\u00b3Lt\u00ac3\u0001\u008dh+\u008a\u00bb\u00fdp\u00c3}\u009a\u00ee\u0086\u00d9b\u00d3\u00d4`{@\u0083\u00b4t\u00dcv\u00f1\u00e1)_\u0013\u009f\u00f1";
        int n2 = "\u00ef\u001d\u00c0ZE\u009a|8\u00e0\u0097\u00a0B!\u00f8m\u00b1(\u00dfL\u0080\u00b3Lt\u00ac3\u0001\u008dh+\u008a\u00bb\u00fdp\u00c3}\u009a\u00ee\u0086\u00d9b\u00d3\u00d4`{@\u0083\u00b4t\u00dcv\u00f1\u00e1)_\u0013\u009f\u00f1".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = xy.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                L = m44.a("l", (long)-5495568771026571254L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    xy(int n, h1 h12, long l, to to2) {
        l = a ^ l;
        super(n, to2);
        m44.a("r", (Object)((Object)this), (float)m44.a("q", (Object)h12, (long)-2640316940313998770L, (long)l), (long)-4501098285813738158L, (long)l);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7FFB;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/xy", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            xy.c[n2] = xy.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xy.b(n, l);
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
            throw new RuntimeException("com/zelix/xy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xy.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
