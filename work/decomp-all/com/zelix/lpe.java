/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lpc;
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

public class lpe
extends lpc {
    private static final long e = prr.a((long)-2715438760506728416L, (long)1333508585820059804L, MethodHandles.lookup().lookupClass()).a(228640841964431L);
    private static final String[] k;
    private static final String[] n;
    private static final Map o;

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lpe.b("i", (int)31646, (long)(0x5D1E30E7CF4F92F5L ^ l));
    }

    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x550B0FC6572DL;
        long l4 = l2 ^ 0x6DF7BA9051C2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        String string = (String)((Object)m44.a("n", (Object)objectArray2, (long)3433008837598041604L, (long)l)) + (String)((Object)lpe.b("i", (int)4342, (long)(0xE18E542F4A436B0L ^ l)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray3, (long)3638594277050117288L, (long)l);
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
        long l4 = l2 ^ 0x2A6D8BBD30E6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l4;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6496292337675940997L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpe.b("i", (int)26911, (long)(0x78DAF4F9AB9CC639L ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    public lpe(int n, long l) {
        long l2 = (l = e ^ l) ^ 0x518920C8C9D2L;
        super(l2, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new HashMap(13);
        long l = e ^ 0x4DE5E9A3A45BL;
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
        String string = "\u0012\u00fb\u00a8\u0095\u00af\u00f0\u008f\u00f0G\u00b1\u00f7\u00ac[w\\\u00dfO\u00fe\u00e1\u00d0\u00f7\u00dd\u00bdH\u00b9\u00d9\u0099\f\u00f1\u0004lbd\u00b1\u00dba\u00d4\u00fb=\u00c4]\u00b8e9\u0097]]\u00b2\u0096\u00e7\u0002\u00e2\u00b0\u009c\u00ae9PV\u00e4\u00b0\u00abj\u00b7r;\u0086\u00a2w\u0014\tZ\u00e6\u00daz\u00c2\u00c6\u00ffgl\u0005\u00ab3\u00bcZ\u00ca\u00de\u00a9{/!qL\u00e6]S\u00e2k\u00b9\u0003\u007f \u0093AL\u001e\u001d\u00b9\n@el(V\u00a0L\u0087\u00fe\u00c4\u00e0\u001c\u001c\u0001\u0004C\u0019v\u0085q\u00fa\u0090\u00cbH\u00c0\u0086\u000ef\u00d4 Rt5b>\u00cf\u00d4\u00c8\u00da\u00d4\u00f7\u00beR\u00ae\u0086\u0000\u0095u\u00d6\u00c2\u00f7|\u00b1\u00af\u00dbf\u00ec$\u00a0q\u00db\u00c1";
        int n2 = "\u0012\u00fb\u00a8\u0095\u00af\u00f0\u008f\u00f0G\u00b1\u00f7\u00ac[w\\\u00dfO\u00fe\u00e1\u00d0\u00f7\u00dd\u00bdH\u00b9\u00d9\u0099\f\u00f1\u0004lbd\u00b1\u00dba\u00d4\u00fb=\u00c4]\u00b8e9\u0097]]\u00b2\u0096\u00e7\u0002\u00e2\u00b0\u009c\u00ae9PV\u00e4\u00b0\u00abj\u00b7r;\u0086\u00a2w\u0014\tZ\u00e6\u00daz\u00c2\u00c6\u00ffgl\u0005\u00ab3\u00bcZ\u00ca\u00de\u00a9{/!qL\u00e6]S\u00e2k\u00b9\u0003\u007f \u0093AL\u001e\u001d\u00b9\n@el(V\u00a0L\u0087\u00fe\u00c4\u00e0\u001c\u001c\u0001\u0004C\u0019v\u0085q\u00fa\u0090\u00cbH\u00c0\u0086\u000ef\u00d4 Rt5b>\u00cf\u00d4\u00c8\u00da\u00d4\u00f7\u00beR\u00ae\u0086\u0000\u0095u\u00d6\u00c2\u00f7|\u00b1\u00af\u00dbf\u00ec$\u00a0q\u00db\u00c1".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lpe.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                k = stringArray;
                lpe.n = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6C6;
        if (lpe.n[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])o.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lpe", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n2].getBytes("ISO-8859-1");
            lpe.n[n2] = lpe.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return lpe.n[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lpe.b(n, l);
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
            throw new RuntimeException("com/zelix/lpe" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lpe.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
