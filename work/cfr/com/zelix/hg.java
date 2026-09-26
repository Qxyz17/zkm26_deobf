/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.h8;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sh;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class hg
extends h8 {
    private final Set F;
    private static final long a = prr.a(6862761972409673445L, 2361377757204155078L, MethodHandles.lookup().lookupClass()).a(279646019405389L);
    private static final String[] c;
    private static final String[] g;
    private static final Map l;

    public hg(sh sh2, List list, long l10, lqu lqu2) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x61E5D97DDD5FL;
        long l13 = l11 ^ 0x79C8CA13F171L;
        super(sh2, list, l12, lqu2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l13;
        this.F = m44.a("n", (Object)objectArray, (long)6725477478838510806L, (long)l10);
    }

    public boolean Y(Object[] objectArray) {
        boolean bl2;
        Object v10;
        long l10;
        block4: {
            Object v11;
            block5: {
                _f _f2 = (_f)objectArray[0];
                _f _f3 = (_f)objectArray[1];
                l10 = (Long)objectArray[2];
                l10 = a ^ l10;
                v11 = m44.a("q", (Object)this, (long)-7879300912887989076L, (long)l10).remove(_f2);
                CallSite callSite = m44.a("o", (long)-8347900200774341526L, (long)l10);
                try {
                    v10 = v11;
                    if (callSite != null) break block4;
                    if (v10 == null) break block5;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)-8523414061757894731L, (long)l10);
                }
                _f _f4 = m44.a("q", (Object)this, (long)-7533856557913568412L, (long)l10).put(_f2, _f3);
            }
            v10 = v11;
        }
        try {
            bl2 = v10 != null;
        }
        catch (n9 n93) {
            throw m44.a("o", (Object)n93, (long)-8523414061757894731L, (long)l10);
        }
        return bl2;
    }

    public Enumeration h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return Collections.enumeration(m44.a("q", (Object)this, (long)6523245177271612706L, (long)l10));
    }

    public boolean I(Object[] objectArray) {
        _f _f2 = (_f)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return m44.a("s", (Object)this, (long)6148917876616264432L, (long)l10).contains(_f2);
    }

    @Override
    public final boolean H(Object[] objectArray) {
        CallSite callSite;
        block4: {
            CallSite callSite2;
            block5: {
                _f _f2 = (_f)objectArray[0];
                long l10 = (Long)objectArray[1];
                String string = (String)objectArray[2];
                long l11 = l10;
                long l12 = l11 ^ 0x1BCFCFF06A4AL;
                long l13 = l11 ^ 0x777F654131A8L;
                CallSite callSite3 = m44.a("j", (long)8632014630147331975L, (long)l10);
                m44.a("t", (Object)this, (long)8480879215439632919L, (long)l10).add(_f2);
                CallSite callSite4 = callSite3;
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l13;
                objectArray2[1] = _f2;
                objectArray2[0] = _f2;
                callSite2 = m44.a("u", (Object)this, (Object)objectArray2, (long)7592129961195226924L, (long)l10);
                try {
                    try {
                        callSite = m44.a("u", (Object)m44.a("t", (Object)this, (long)8020529457851660062L, (long)l10), (long)7848231766345397921L, (long)l10);
                        if (callSite4 != null) break block4;
                        if (callSite == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)8240355300727526488L, (long)l10);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = _f2;
                    objectArray3[0] = l12;
                    ((PrintWriter)((Object)m44.a("t", (Object)this, (long)7842799110244750941L, (long)l10))).println((String)((Object)hg.b("o", (int)4290, (long)(0x6DAA388201E2B9D3L ^ l10))) + (String)((Object)m44.a("u", (Object)this, (Object)objectArray3, (long)8060888911998922393L, (long)l10)) + (String)((Object)hg.b("o", (int)15926, (long)(0x1B3E99598271726L ^ l10))) + string + "\"");
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)8240355300727526488L, (long)l10);
                }
            }
            callSite = callSite2;
        }
        return (boolean)callSite;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        l = new HashMap(13);
        long l10 = a ^ 0x4717E7E8B22BL;
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
        String[] stringArray = new String[2];
        int n10 = 0;
        String string = "\u000es\u00d4p\u0011_i}\u00afKhOr\u00af\u00e5\u0007\u00cd\u00c6\u0007\u0018po\u00f1\\\u00c46\u00fbX5\u00f7x\u0003\\\u0017\u00ff\u00fc\u00e8\u00edr\u00bb(\u00a0\u00ef\u00b6\u0095\u00ea\n\r\u00c0]\u00ed\u00f5F@z\u00f5$X\u000b(~\u00cf\u0013m'\u0082\u00e1&'\u0090\u00ff4\u00e0a\u00cf\u008f;wg\u00f6\u00b9";
        int n11 = "\u000es\u00d4p\u0011_i}\u00afKhOr\u00af\u00e5\u0007\u00cd\u00c6\u0007\u0018po\u00f1\\\u00c46\u00fbX5\u00f7x\u0003\\\u0017\u00ff\u00fc\u00e8\u00edr\u00bb(\u00a0\u00ef\u00b6\u0095\u00ea\n\r\u00c0]\u00ed\u00f5F@z\u00f5$X\u000b(~\u00cf\u0013m'\u0082\u00e1&'\u0090\u00ff4\u00e0a\u00cf\u008f;wg\u00f6\u00b9".length();
        int n12 = 40;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = hg.b(byArray3).intern();
            if ((n13 += n12) >= n11) {
                c = stringArray;
                g = new String[2];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static n9 c(n9 n92) {
        return n92;
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x55D4;
        if (g[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])l.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/hg", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            hg.g[n11] = hg.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = hg.b(n10, l10);
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
            throw new RuntimeException("com/zelix/hg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

