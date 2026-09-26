/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lpv;
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

public class lpf
extends lpv {
    private static final long e = prr.a(5142841801360310980L, 4627476098909616603L, MethodHandles.lookup().lookupClass()).a(97675281392630L);
    private static final String[] p;
    private static final String[] q;
    private static final Map s;

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return lpf.c("g", (int)32251, (long)(0x2D79AFB48C9B2963L ^ l10));
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
        long l13 = l11 ^ 0x2994FDF535DBL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = this;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6389987419473827950L, (long)l10);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpf.c("g", (int)11233, (long)(0x2A2B02056F29B937L ^ l10));
        objectArray3[4] = n12;
        objectArray3[3] = n11;
        objectArray3[2] = l12;
        objectArray3[1] = n10;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)this, (Object)objectArray3, (long)-4778337559753001233L, (long)l10);
    }

    @Override
    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10;
        long l12 = l11 ^ 0x6DF7BA9051C2L;
        long l13 = l11 ^ 0x550B0FC6572DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray2, (long)3638594277050117288L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l10)) + (String)((Object)lpf.c("g", (int)8190, (long)(0x72522D8455E30449L ^ l10)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l10), (Object)string, (long)3896853000951639041L, (long)l10);
    }

    public lpf(long l10, int n10) {
        long l11 = (l10 = e ^ l10) ^ 0x352D3B8B36C4L;
        int n11 = (int)(l11 >>> 48);
        long l12 = l11 << 16 >>> 16;
        super((char)n11, l12, n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        s = new HashMap(13);
        long l10 = e ^ 0x296889525A37L;
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
        String string = "~$Q\u0090zf\u00cf\u0019a\u00a1\u00b6v\u00f8}\u00fda\u00ce\u0005\u00be\u00fe\u001f\u0007X=@\u0007\u00a5\u00b5w\u00b2\u00eb\u00fe\u00a6&\u0007\"\u00b27%KWL\u00daDZPRy1\u0012\u0013\u00b3\u001c\u00e6\u00c4\u0088\u00c1\u0082\u000ev)\u00ba\u0090\rG\u008b\u00d9\u00ae\u00d9\u008b\u00d6\u00a8\\}\u009a\u00f5\u00e2>\u0010C!\u00aa6\u00d3\fk5omXV\u00ed\u00d7z\u00ee\u00de\u00a2\u00ed,\u00af\u00ad)\"\u0091\u00f3W\u00b5Z\u00eb\u008b\u00f5\u00d72PM\u00c42\u00dfPv\u00fe\u00ec\u00dad\u0016\u00e5\u00d53\u00c2(\u00acM\u00df\u00f7T\u0004\f\u00f8\u00f3nI2\u00e0\u00b5\u00c8\u0010Vm\u00f3d}\u00d5\u00a7\u00a1\u00bb\u00aas$\u00d3c\u0007\u0018BF\u0003x\u00d5\u00a2\u00b1\u009e1\u00e2&\u00c9\u00c7\u00a1\u001e\u000b";
        int n11 = "~$Q\u0090zf\u00cf\u0019a\u00a1\u00b6v\u00f8}\u00fda\u00ce\u0005\u00be\u00fe\u001f\u0007X=@\u0007\u00a5\u00b5w\u00b2\u00eb\u00fe\u00a6&\u0007\"\u00b27%KWL\u00daDZPRy1\u0012\u0013\u00b3\u001c\u00e6\u00c4\u0088\u00c1\u0082\u000ev)\u00ba\u0090\rG\u008b\u00d9\u00ae\u00d9\u008b\u00d6\u00a8\\}\u009a\u00f5\u00e2>\u0010C!\u00aa6\u00d3\fk5omXV\u00ed\u00d7z\u00ee\u00de\u00a2\u00ed,\u00af\u00ad)\"\u0091\u00f3W\u00b5Z\u00eb\u008b\u00f5\u00d72PM\u00c42\u00dfPv\u00fe\u00ec\u00dad\u0016\u00e5\u00d53\u00c2(\u00acM\u00df\u00f7T\u0004\f\u00f8\u00f3nI2\u00e0\u00b5\u00c8\u0010Vm\u00f3d}\u00d5\u00a7\u00a1\u00bb\u00aas$\u00d3c\u0007\u0018BF\u0003x\u00d5\u00a2\u00b1\u009e1\u00e2&\u00c9\u00c7\u00a1\u001e\u000b".length();
        int n12 = 24;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lpf.d(byArray3).intern();
            if ((n13 += n12) >= n11) {
                p = stringArray;
                q = new String[3];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static String d(byte[] byArray) {
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

    private static String c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3B34;
        if (q[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])s.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    s.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lpf", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = p[n11].getBytes("ISO-8859-1");
            lpf.q[n11] = lpf.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return q[n11];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lpf.c(n10, l10);
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
            throw new RuntimeException("com/zelix/lpf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lpf.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

