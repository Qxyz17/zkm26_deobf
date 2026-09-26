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
    private static final long e = prr.a(-2715438760506728416L, 1333508585820059804L, MethodHandles.lookup().lookupClass()).a(228640841964431L);
    private static final String[] k;
    private static final String[] n;
    private static final Map o;

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lpe.b("i", (int)31646, (long)(0x5D1E30E7CF4F92F5L ^ l10));
    }

    @Override
    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10;
        long l12 = l11 ^ 0x550B0FC6572DL;
        long l13 = l11 ^ 0x6DF7BA9051C2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        String string = (String)((Object)m44.a("n", (Object)objectArray2, (long)3433008837598041604L, (long)l10)) + (String)((Object)lpe.b("i", (int)4342, (long)(0xE18E542F4A436B0L ^ l10)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray3, (long)3638594277050117288L, (long)l10);
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    @Override
    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        int n12 = (Integer)objectArray[4];
        long l11 = l10;
        long l12 = l11 ^ 0x3E0224440141L;
        long l13 = l11 ^ 0x2A6D8BBD30E6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l13;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6496292337675940997L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpe.b("i", (int)26911, (long)(0x78DAF4F9AB9CC639L ^ l10));
        objectArray3[4] = n12;
        objectArray3[3] = n11;
        objectArray3[2] = l12;
        objectArray3[1] = n10;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)this, (Object)objectArray3, (long)-4778337559753001233L, (long)l10);
    }

    public lpe(int n10, long l10) {
        long l11 = (l10 = e ^ l10) ^ 0x518920C8C9D2L;
        super(l11, n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new HashMap(13);
        long l10 = e ^ 0x4DE5E9A3A45BL;
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
        String string = "\u0012\u00fb\u00a8\u0095\u00af\u00f0\u008f\u00f0G\u00b1\u00f7\u00ac[w\\\u00dfO\u00fe\u00e1\u00d0\u00f7\u00dd\u00bdH\u00b9\u00d9\u0099\f\u00f1\u0004lbd\u00b1\u00dba\u00d4\u00fb=\u00c4]\u00b8e9\u0097]]\u00b2\u0096\u00e7\u0002\u00e2\u00b0\u009c\u00ae9PV\u00e4\u00b0\u00abj\u00b7r;\u0086\u00a2w\u0014\tZ\u00e6\u00daz\u00c2\u00c6\u00ffgl\u0005\u00ab3\u00bcZ\u00ca\u00de\u00a9{/!qL\u00e6]S\u00e2k\u00b9\u0003\u007f \u0093AL\u001e\u001d\u00b9\n@el(V\u00a0L\u0087\u00fe\u00c4\u00e0\u001c\u001c\u0001\u0004C\u0019v\u0085q\u00fa\u0090\u00cbH\u00c0\u0086\u000ef\u00d4 Rt5b>\u00cf\u00d4\u00c8\u00da\u00d4\u00f7\u00beR\u00ae\u0086\u0000\u0095u\u00d6\u00c2\u00f7|\u00b1\u00af\u00dbf\u00ec$\u00a0q\u00db\u00c1";
        int n11 = "\u0012\u00fb\u00a8\u0095\u00af\u00f0\u008f\u00f0G\u00b1\u00f7\u00ac[w\\\u00dfO\u00fe\u00e1\u00d0\u00f7\u00dd\u00bdH\u00b9\u00d9\u0099\f\u00f1\u0004lbd\u00b1\u00dba\u00d4\u00fb=\u00c4]\u00b8e9\u0097]]\u00b2\u0096\u00e7\u0002\u00e2\u00b0\u009c\u00ae9PV\u00e4\u00b0\u00abj\u00b7r;\u0086\u00a2w\u0014\tZ\u00e6\u00daz\u00c2\u00c6\u00ffgl\u0005\u00ab3\u00bcZ\u00ca\u00de\u00a9{/!qL\u00e6]S\u00e2k\u00b9\u0003\u007f \u0093AL\u001e\u001d\u00b9\n@el(V\u00a0L\u0087\u00fe\u00c4\u00e0\u001c\u001c\u0001\u0004C\u0019v\u0085q\u00fa\u0090\u00cbH\u00c0\u0086\u000ef\u00d4 Rt5b>\u00cf\u00d4\u00c8\u00da\u00d4\u00f7\u00beR\u00ae\u0086\u0000\u0095u\u00d6\u00c2\u00f7|\u00b1\u00af\u00dbf\u00ec$\u00a0q\u00db\u00c1".length();
        int n12 = 56;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lpe.c(byArray3).intern();
            if ((n13 += n12) >= n11) {
                k = stringArray;
                n = new String[3];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6C6;
        if (n[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])o.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lpe", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n11].getBytes("ISO-8859-1");
            lpe.n[n11] = lpe.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return n[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lpe.b(n10, l10);
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

