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

public class lp4
extends lpm {
    private static final long a = prr.a((long)6070914670433764335L, (long)-6246438528004757036L, MethodHandles.lookup().lookupClass()).a(241107250603681L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lp4.b("b", (int)524, (long)(0x1273B87A956DFADAL ^ l));
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
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l)) + (String)((Object)lp4.b("b", (int)15137, (long)(0x58D474E797DC0CD9L ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3E0224440141L;
        long l4 = l2 ^ 0x385E768B92L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l4;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6528831494773549757L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lp4.b("b", (int)17257, (long)(0x2A2D4B0CA1E17DF3L ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    public lp4(short s, short s2, int n, int n2) {
        long l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        long l2 = l ^ 0x6B2EE500462AL;
        super(n, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l = a ^ 0x34B6FD8C5820L;
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
        String string = "\u00bf\u00a6_$\u00ba\u00f3\\\u00a9\u00c0\u000e(\u0006\u0002\u00f8\u00ef\u00c6I\u00b8=\u00edF\u00d1\u00a3\u00e0\u009c\u00a0\u00d7\u00024\u0012\u00cdLKmE\"\u001d\u00d7\u0091_\u00bf$\u00ad\u00b5h\u00cf\u00a8\f\u00ca8\u00fe,\u00a3k\u000e\u0087?\u009f\u00ed\u00d8\u00c0\u0090<<\u00d30\u00db\u00e8\u001euW\u00c3\u0018u\u00fe\"\u0082\u00ea\u00f5\u00c8\r8Z|1\u0015\u00f0\u001e \u00f3\u0002p\u00a1\u00d5\u00f5\u00e4\u0018\u00a0\u0000\u001a-~\u001fO\r\t\u00c9#\u0099(\u00adm\u0012\u0013G\u00dd7\u00c9\u00bc\u00b5\u000e(<}\u00ca}\u00c9T&\u00860\u0080:5?\u00eb\u009b\u0080\u00c0M|\u009a\u00d1C\u00cc\u0099\u0011?\u00d8\u0012\u0096\u0086\u00a0\u00ce\u00ca\u00b8\u00dc\u00eetXEs";
        int n2 = "\u00bf\u00a6_$\u00ba\u00f3\\\u00a9\u00c0\u000e(\u0006\u0002\u00f8\u00ef\u00c6I\u00b8=\u00edF\u00d1\u00a3\u00e0\u009c\u00a0\u00d7\u00024\u0012\u00cdLKmE\"\u001d\u00d7\u0091_\u00bf$\u00ad\u00b5h\u00cf\u00a8\f\u00ca8\u00fe,\u00a3k\u000e\u0087?\u009f\u00ed\u00d8\u00c0\u0090<<\u00d30\u00db\u00e8\u001euW\u00c3\u0018u\u00fe\"\u0082\u00ea\u00f5\u00c8\r8Z|1\u0015\u00f0\u001e \u00f3\u0002p\u00a1\u00d5\u00f5\u00e4\u0018\u00a0\u0000\u001a-~\u001fO\r\t\u00c9#\u0099(\u00adm\u0012\u0013G\u00dd7\u00c9\u00bc\u00b5\u000e(<}\u00ca}\u00c9T&\u00860\u0080:5?\u00eb\u009b\u0080\u00c0M|\u009a\u00d1C\u00cc\u0099\u0011?\u00d8\u0012\u0096\u0086\u00a0\u00ce\u00ca\u00b8\u00dc\u00eetXEs".length();
        int n3 = 88;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lp4.c(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1779;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])lp4.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lp4.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lp4", exception);
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
            lp4.k[n2] = lp4.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lp4.b(n, l);
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
            throw new RuntimeException("com/zelix/lp4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lp4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
