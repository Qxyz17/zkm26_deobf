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

public class lpu
extends lpm {
    private static final long a = prr.a((long)7679513814291803771L, (long)2828748689034656684L, MethodHandles.lookup().lookupClass()).a(210819522173237L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lpu.b("q", (int)25238, (long)(0x4BDF87D1D8833ABAL ^ l));
    }

    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x550B0FC6572DL;
        long l4 = l2 ^ 0x6DF7BA9051C2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        String string = (String)((Object)m44.a("n", (Object)objectArray2, (long)3433008837598041604L, (long)l)) + (String)((Object)lpu.b("q", (int)23184, (long)(0x2FF9F142771C4D93L ^ l)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray3, (long)3638594277050117288L, (long)l);
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    public lpu(char c, int n, short s, int n2) {
        long l = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        long l2 = l ^ 0x669389D00B39L;
        super(n, l2);
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3E0224440141L;
        long l4 = l2 ^ 0x1511ED69AF14L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l4;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4965483563938860012L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpu.b("q", (int)16626, (long)(0x6E3B72720C95E93L ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l = a ^ 0x5FE6F3E13300L;
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
        String string = "\r\tY;\u00d6\u00fd\u00b1a\u00a8C\u00804,k,\u008e\"\u00ec\u00fd\u0003\u00e6E\u00c9jHx\u00c6\u0093\u00d9\u00a4\u00d0t\u00a5\u0006|\u00fe\u00e9\u001f\u008c\u0097S\u0012\u00b6\u0084V\u0012N%\u00da\u00c7\u00ce\u00f7^;\u00cf\u001a=\u00d4\u00b9\u0091\u00e4\u0019\u00e6\u00fc0\u00a6\u001dR\u00b3.\u00bb\u00f0D\u0083QN\u00f4^\u001e\u0099(Ge\u001d\u00ffR\u00a85|\u0016e1\u00fa\u001c\u008bqj8\u00a7\u00abj\u0080\rTa\u0016E\u001c\u0013\u00969\u000b)\u009c\u001b\u00d40\u00bc\u008b\u00dcD3\u0092\u00f8-\u001b\u00a0Ls`x\u0085\u00f7\u00e6\u0082\b\u00ed\u00e9\u00aa{\u00ef\fk5M\u0083f\u009a\"\u00ca\u0099\u00cc\u00c1\u00f6";
        int n2 = "\r\tY;\u00d6\u00fd\u00b1a\u00a8C\u00804,k,\u008e\"\u00ec\u00fd\u0003\u00e6E\u00c9jHx\u00c6\u0093\u00d9\u00a4\u00d0t\u00a5\u0006|\u00fe\u00e9\u001f\u008c\u0097S\u0012\u00b6\u0084V\u0012N%\u00da\u00c7\u00ce\u00f7^;\u00cf\u001a=\u00d4\u00b9\u0091\u00e4\u0019\u00e6\u00fc0\u00a6\u001dR\u00b3.\u00bb\u00f0D\u0083QN\u00f4^\u001e\u0099(Ge\u001d\u00ffR\u00a85|\u0016e1\u00fa\u001c\u008bqj8\u00a7\u00abj\u0080\rTa\u0016E\u001c\u0013\u00969\u000b)\u009c\u001b\u00d40\u00bc\u008b\u00dcD3\u0092\u00f8-\u001b\u00a0Ls`x\u0085\u00f7\u00e6\u0082\b\u00ed\u00e9\u00aa{\u00ef\fk5M\u0083f\u009a\"\u00ca\u0099\u00cc\u00c1\u00f6".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lpu.c(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3783;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])lpu.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lpu.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lpu", exception);
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
            lpu.k[n2] = lpu.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lpu.b(n, l);
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
            throw new RuntimeException("com/zelix/lpu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lpu.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
