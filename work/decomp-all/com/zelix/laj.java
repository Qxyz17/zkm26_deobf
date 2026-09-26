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

public class laj
extends lpm {
    private static final long a = prr.a((long)4912599746595711658L, (long)-2014097256904575912L, MethodHandles.lookup().lookupClass()).a(200122355277899L);
    private static final String[] e;
    private static final String[] k;
    private static final Map n;

    public laj(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x5003786657C8L;
        super(n, l2);
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3786AC24B4C1L;
        long l4 = l2 ^ 0x3E0224440141L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l3;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-5035554401005591795L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = laj.b("m", (int)14451, (long)(0x33870A7BDADF8777L ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l4;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return laj.b("m", (int)2296, (long)(0x20905048A843F1B1L ^ l));
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
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l)) + (String)((Object)laj.b("m", (int)4849, (long)(0x51AD3C3F826BA497L ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = new HashMap(13);
        long l = a ^ 0x68AF215902B7L;
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
        String string = "\u00d0\u000ek\u000evcc\u00a9gmhj\u000b\u00ae+\u00b7\u00e4\u00bdJ\u0091\u009b\u00a7g\u00b7\u00f8\u000f\u0083\u00b8=\u00e9\u00ea\u009aP/\u00fdyQ\u00b5l\u00a1\u00e2\u0097n\u00ff\u00ad\u00a2'\u00e6\u00ae\u00ff\u00b7+u\u00d3 \u0097x=\u0087\u00ff`\u00e4c\u00132\u009e\u00127\u00b0\r\u00db\b\u0002\u00d3\u00fb\u00c8x\u0091\u008e\u00d1N$\u0015\u0001*\u0092\u00b6jL\u00e35\u00ed\u00e9\u00c5FO\u0018\u00cf\u0005\u0003;\u00f5\u00e9U?\u0085bs\u00d3\u00d4R\u00f9\u00860.[\u00dcy,{\u000f\u0010ow\u0097Q\u00e6\u00c5-@\u000b\u00a7N\u001d\u0097\u00d1d\u00f4#\u0090m,2\u00ceX\u008e\u0012\u001e\u0089\u008f\u00bd[\u009e\u00ca\u009f\u00b6s;`\u001e.K";
        int n2 = "\u00d0\u000ek\u000evcc\u00a9gmhj\u000b\u00ae+\u00b7\u00e4\u00bdJ\u0091\u009b\u00a7g\u00b7\u00f8\u000f\u0083\u00b8=\u00e9\u00ea\u009aP/\u00fdyQ\u00b5l\u00a1\u00e2\u0097n\u00ff\u00ad\u00a2'\u00e6\u00ae\u00ff\u00b7+u\u00d3 \u0097x=\u0087\u00ff`\u00e4c\u00132\u009e\u00127\u00b0\r\u00db\b\u0002\u00d3\u00fb\u00c8x\u0091\u008e\u00d1N$\u0015\u0001*\u0092\u00b6jL\u00e35\u00ed\u00e9\u00c5FO\u0018\u00cf\u0005\u0003;\u00f5\u00e9U?\u0085bs\u00d3\u00d4R\u00f9\u00860.[\u00dcy,{\u000f\u0010ow\u0097Q\u00e6\u00c5-@\u000b\u00a7N\u001d\u0097\u00d1d\u00f4#\u0090m,2\u00ceX\u008e\u0012\u001e\u0089\u008f\u00bd[\u009e\u00ca\u009f\u00b6s;`\u001e.K".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = laj.c(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x16E6;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])laj.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    laj.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/laj", exception);
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
            laj.k[n2] = laj.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = laj.b(n, l);
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
            throw new RuntimeException("com/zelix/laj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(laj.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
