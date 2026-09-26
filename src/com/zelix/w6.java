/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cd;
import com.zelix.e_;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sn;
import com.zelix.wm;
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
import javax.swing.JFrame;

public class w6
extends wm {
    cd h;
    private static final long a = prr.a((long)-4251253069644899715L, (long)304398161826548125L, MethodHandles.lookup().lookupClass()).a(73620285726254L);
    private static final String[] c;
    private static final String[] g;
    private static final Map l;

    protected final void Z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7C444B220507L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = w6.c("q", (int)28115, (long)(0x73F3C32A1E1EEF99L ^ l));
        objectArray2[0] = l2;
        m44.a("m", (Object)objectArray2, (long)8157000709015404428L, (long)l);
    }

    public w6(long l, JFrame jFrame, String string, sn sn2, int n, e_ e_2) {
        long l2 = (l = a ^ l) ^ 0x74830A50E5FEL;
        super(jFrame, string, sn2, n, l2, e_2);
    }

    void M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x77860B03681EL;
        m44.a("w", (Object)((Object)this), (cd)new cd((JFrame)((Object)this), (sn)m44.a("u", (Object)((Object)this), (long)-6037544844648994508L, (long)l), l2, false, (int)m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l)), (long)-6264623312312610741L, (long)l);
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)w6.c("q", (int)22538, (long)(0x457A53BF591899CFL ^ l)), (Object)m44.a("u", (Object)((Object)this), (long)-6264623312312610741L, (long)l), (long)-5274372387623342091L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        l = new HashMap(13);
        long l = a ^ 0x4CCE406CC178L;
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
        String string = "\u00c0SOD;\u00acux'\u0084\u00d8\u00d2.\u00db\u00b5\u00c3\u0010I\u00de\u00c0\tw\u00e2/\r\u00dd\u00a1\u00e0\u00f3\u00f4\u00c9y\u000e";
        int n2 = "\u00c0SOD;\u00acux'\u0084\u00d8\u00d2.\u00db\u00b5\u00c3\u0010I\u00de\u00c0\tw\u00e2/\r\u00dd\u00a1\u00e0\u00f3\u00f4\u00c9y\u000e".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = w6.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                g = new String[2];
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

    private static String c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6399;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])w6.l.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    w6.l.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/w6", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            w6.g[n2] = w6.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = w6.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/w6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(w6.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
