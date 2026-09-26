/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.zj;
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

public class zu
extends zj {
    private static final long a = prr.a((long)-3621222608157301402L, (long)4684052111997075354L, MethodHandles.lookup().lookupClass()).a(100229368898888L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public zu(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x7EAA14FE1B07L;
        super(l2, n);
    }

    public final void X(Object[] objectArray) {
        fu fu2 = (fu)objectArray[0];
        long l = (Long)objectArray[1];
        lqq lqq2 = (lqq)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x32E0AEE1AD38L;
        long l4 = l2 ^ 0x4D8052C494B9L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = (String)((Object)zu.a("i", (int)25854, (long)(0x5B500EB4EEF04BADL ^ l))) + (String)((Object)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1785247222142810516L, (long)l)) + (String)((Object)zu.a("i", (int)21722, (long)(0x189FFC358BF47B88L ^ l)));
        m44.a("r", (Object)lqq2, (Object)objectArray3, (long)-22266681956419799L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = a ^ 0x7DA4D380237EL;
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
        String string = "\"dP\u0012[\u00f5[\u0010\u001c0\u00c9\u00bb\u001a\u00b7\u00f4n\u00bc\u00f1\u00cf\u000e\u0090\u00d8a\u0006\u00ca\u0088\u001e\u0013\u00d2\fb\u00dc7}B\u00db \u0019\u00eb\u00bd\u00ef\u0099_@lZ\u00f7W/w\u00d1\u001fV\u001b\u0099(\u0092\u008f\u00e9\u0007\u0099\u00f0H\u00f1Dl_E\u009dd\rY\u00ccV\u00ea\u0098D:\u00df\u00aa8\u0093\u00d8PS\u00ff\u0080\u00d4a\u00b1\u00ac\u00df\u00e5[G4\u001e\u00fdq\u00c8\u0094\u00d4\u00a6[S\u00e6\u00e8\u00d6\u008f\u00aa\u0091u8?F\u009c$\u00ba\u00e7@\t\u008a\u0011\u00e4\u00d4\u00dca|\u00c1Q?\u008a\u00e1\u00b6I\u00c4 ";
        int n2 = "\"dP\u0012[\u00f5[\u0010\u001c0\u00c9\u00bb\u001a\u00b7\u00f4n\u00bc\u00f1\u00cf\u000e\u0090\u00d8a\u0006\u00ca\u0088\u001e\u0013\u00d2\fb\u00dc7}B\u00db \u0019\u00eb\u00bd\u00ef\u0099_@lZ\u00f7W/w\u00d1\u001fV\u001b\u0099(\u0092\u008f\u00e9\u0007\u0099\u00f0H\u00f1Dl_E\u009dd\rY\u00ccV\u00ea\u0098D:\u00df\u00aa8\u0093\u00d8PS\u00ff\u0080\u00d4a\u00b1\u00ac\u00df\u00e5[G4\u001e\u00fdq\u00c8\u0094\u00d4\u00a6[S\u00e6\u00e8\u00d6\u008f\u00aa\u0091u8?F\u009c$\u00ba\u00e7@\t\u008a\u0011\u00e4\u00d4\u00dca|\u00c1Q?\u008a\u00e1\u00b6I\u00c4 ".length();
        int n3 = 80;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = zu.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5B40;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/zu", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            zu.e[n2] = zu.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = zu.a(n, l);
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
            throw new RuntimeException("com/zelix/zu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(zu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
