/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.sun.kvem.environment.Obfuscator;
import com.zelix.c2;
import com.zelix.m44;
import com.zelix.prr;
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

public class ZKMWtkPlugin
extends c2
implements Obfuscator {
    private File q;
    private static final long a = prr.a(-6480535944418023691L, 8394949736533878202L, MethodHandles.lookup().lookupClass()).a(205725226913586L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public void run(File file, String string, String string2, String string3, String string4, String string5, String string6) {
        long l10 = a ^ 0x660A6EC335D6L;
        m44.a("k", (Object)m44.a("u", (Object)this, (long)3077718889588478208L, (long)l10), (Object)string3, (Object)file, (Object)string5, (Object)string4, (long)4022594610445567954L, (long)l10);
    }

    public void createScriptFile(File file, File file2) {
        CallSite callSite;
        long l10;
        block7: {
            block8: {
                l10 = a ^ 0x6292D011333CL;
                CallSite callSite2 = m44.a("i", (long)3880801802953322320L, (long)l10);
                m44.a("u", (Object)this, (File)file, (long)3196506383432046570L, (long)l10);
                CallSite callSite3 = callSite2;
                try {
                    try {
                        callSite = m44.a("w", (Object)this, (long)3196506383432046570L, (long)l10);
                        if (callSite3 == false) break block7;
                        if (callSite != null) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("i", (Object)illegalArgumentException, (long)3820453179163968484L, (long)l10);
                    }
                    throw new IllegalArgumentException((String)((Object)ZKMWtkPlugin.a("g", (int)23346, (long)(0x12921D9307585004L ^ l10))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)3820453179163968484L, (long)l10);
                }
            }
            callSite = m44.a("w", (Object)this, (long)3196506383432046570L, (long)l10);
        }
        try {
            if (m44.a("v", (Object)callSite, (long)3674315357930534693L, (long)l10) == false) {
                throw new IllegalArgumentException((String)((Object)ZKMWtkPlugin.a("g", (int)18958, (long)(0x1701007C635AC13BL ^ l10))) + (String)((Object)m44.a("v", (Object)m44.a("w", (Object)this, (long)3196506383432046570L, (long)l10), (long)3641833426381557745L, (long)l10)) + (String)((Object)ZKMWtkPlugin.a("g", (int)25964, (long)(0x11E6F9E6E781EE58L ^ l10))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("i", (Object)illegalArgumentException, (long)3820453179163968484L, (long)l10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0x33F5C15D90EAL;
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
        String string = "\u00db\u00f7y\"k\u00c0\u00f8\"\u0083h\u0015<Q\u00f8\u00e5\u00ba\u00ecw\u0083x\u00b4\u00ec?\u00cdQ5\u00c1\u001f\u00ccv\u00a2\u00ad\u0084WJ<\u0016\u0098\u00ac* Z\u0086o{\u009d%a\u0097c\u008f\u00a2\u0012\u00dd\u00c7 \u00ac&\u0091g\u00b5jvr\u009b\u00f3\u00c0\u00ab\u00b1\u00d1d\u00f2\u0082(=\u0094\u00df\u00c1\u00e2\u00d3\u00ect\nF\u00baq\u0000\u009c\u00f0\u0015\u00af\u001a\u0086[\u00be\u0093\u00f5\u00bdel\u00d6\u000bLG\u009a\u009f;\u00a0_\u00c8\u0004\u000f<\u0003";
        int n11 = "\u00db\u00f7y\"k\u00c0\u00f8\"\u0083h\u0015<Q\u00f8\u00e5\u00ba\u00ecw\u0083x\u00b4\u00ec?\u00cdQ5\u00c1\u001f\u00ccv\u00a2\u00ad\u0084WJ<\u0016\u0098\u00ac* Z\u0086o{\u009d%a\u0097c\u008f\u00a2\u0012\u00dd\u00c7 \u00ac&\u0091g\u00b5jvr\u009b\u00f3\u00c0\u00ab\u00b1\u00d1d\u00f2\u0082(=\u0094\u00df\u00c1\u00e2\u00d3\u00ect\nF\u00baq\u0000\u009c\u00f0\u0015\u00af\u001a\u0086[\u00be\u0093\u00f5\u00bdel\u00d6\u000bLG\u009a\u009f;\u00a0_\u00c8\u0004\u000f<\u0003".length();
        int n12 = 40;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = ZKMWtkPlugin.b(byArray3).intern();
            if ((n13 += n12) >= n11) {
                b = stringArray;
                c = new String[3];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String b(byte[] byArray) {
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2BBA;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ZKMWtkPlugin", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            ZKMWtkPlugin.c[n11] = ZKMWtkPlugin.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ZKMWtkPlugin.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ZKMWtkPlugin" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ZKMWtkPlugin.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

