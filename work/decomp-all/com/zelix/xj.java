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

public class xj
extends x7 {
    static final va N;
    double E;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public String j(long l) {
        return xj.b("b", (int)10932, (long)(0x4AA0D805CFDDCDBFL ^ l));
    }

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-2130584810284094411L, (long)l).g());
        m44.a("v", (Object)dataOutputStream, (double)m44.a("w", (Object)((Object)this), (long)-163360753852861102L, (long)l), (long)-136304465281207724L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)-5064975809587515937L, (long)2552511811732842630L, MethodHandles.lookup().lookupClass()).a(253930118795128L);
        long l = a ^ 0x3839B82AC7D7L;
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
        String string = "F\u00ab\u0091\u00ae\u00f9\u00a5\u00e1h\u00b7\u00e7\u001d\u00ca\u00bf`\u007f-(\u001e\u00fen\u00ee\u00a6\u008a\u00f5\u00b6\u00bc\u0018\u0017\u00d8\u000e\u00b8\u008d\u00a5\u0003e\b+\u00fcJ\u0085\u00a9Y\u00c8\u00adpF:\u0019\u0091y\u00e3\u0086m\u008f\u00cc\u00c1\u00f9";
        int n2 = "F\u00ab\u0091\u00ae\u00f9\u00a5\u00e1h\u00b7\u00e7\u001d\u00ca\u00bf`\u007f-(\u001e\u00fen\u00ee\u00a6\u008a\u00f5\u00b6\u00bc\u0018\u0017\u00d8\u000e\u00b8\u008d\u00a5\u0003e\b+\u00fcJ\u0085\u00a9Y\u00c8\u00adpF:\u0019\u0091y\u00e3\u0086m\u008f\u00cc\u00c1\u00f9".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = xj.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                N = m44.a("m", (long)5628006700170111466L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public va A(long l) {
        return m44.a("i", (long)-6108345045142657695L, (long)l);
    }

    public String u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x555E98E15F66L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        return m44.a("t", (Object)((Object)this), (char)((char)n), (int)n2, (short)((short)n3), (long)-5678196126482055853L, (long)l);
    }

    public String z(char c, int n, short s) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        return m44.a("m", (double)m44.a("s", (Object)((Object)this), (long)-1202550499714979930L, (long)l), (long)-820977463345469618L, (long)l);
    }

    public void b(Object[] objectArray) {
        CallSite callSite;
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l2 = l ^ 0x3C02A3BC840AL;
        try {
            callSite = m44.a("r", (Object)m44.a("m", (Object)string, (long)3529392663083143367L, (long)l), (long)3267450302827639803L, (long)l);
        }
        catch (NumberFormatException numberFormatException) {
            throw new ay(string + (String)((Object)xj.b("b", (int)19783, (long)(0x3587F00FFA033E32L ^ l))));
        }
        m44.a("q", (Object)((Object)this), (double)callSite, (long)3332569105107707606L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)3889767407696488877L, (long)l);
    }

    public boolean e(long l, gu gu2, Object object, Object object2) {
        long l2 = l ^ 0xB1C2A58BC7CL;
        return gu2.K((js)this, object, l2, object2);
    }

    protected int x(long l) {
        return 2;
    }

    xj(int n, h1 h12, long l, to to2) {
        l = a ^ l;
        super(n, to2);
        m44.a("r", (Object)((Object)this), (double)m44.a("q", (Object)h12, (long)-775021020922202116L, (long)l), (long)-685516048119546219L, (long)l);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4CA6;
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
                throw new RuntimeException("com/zelix/xj", exception);
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
            xj.c[n2] = xj.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xj.b(n, l);
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
            throw new RuntimeException("com/zelix/xj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xj.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
