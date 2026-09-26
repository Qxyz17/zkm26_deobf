/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.prr;
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

public abstract class xg {
    public static final String C;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map f;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                xg.a = prr.a((long)3172019952554788798L, (long)-228177495461755707L, MethodHandles.lookup().lookupClass()).a(9864631502808L);
                var9 = xg.a ^ 82308814356038L;
                xg.f = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[6];
                var5_4 = 0;
                var4_5 = "\u0080\u0098-\u009b\u0007Y\u00a4\u008cl\u00daP\u0018O\u00bc\u0014\\\u00cd_t\u00d7C.6\u0098\u00ecL\b\u00f8\u00bd\u00c7\u00adm\u00af\u0085\u001a\u00d9r\u008c'm\u00c0\u00d41\u00e9\u00ac4\u00fc\u00a3\bI\u0004\u00c7\u00f16\u0082\u0011{\u009c\u00ca*\u00cc~\u00a0\u0001(N\u0010\u0092MTk\u0098\u001fD\u00c2\u00a8\u00e5\u00d3\u008c\u0092 \t\u00cd\u008e\u009aIs\u00ec\u00e0\u001a~cE\u00cf\u0012\u009bC\u00f7\u00a6\u00c0:\u00a8\u00e0I\u0017\u0083H6\u00d9s\u001d\u00f7\u00c6P\u00f6\u00af\u00d1\u0084\u001f8-\u00c2\u00f0\u00f2\u00d0\u00f9\u00c5\u00d5h\u00910\u0091\u00db\u00a2\u00e3\t\u00874r;\u008f;'\u00e9\u00cd\u00c1\u0019\u00a9\u00f8'\u0010\n\u00ce\u001cr\u0018\u00ec\u00ddx\u00bf\u0003\\\u0007\u00a4\u00bc\u00ab\u00ae4\u001et\u009b\u00b5O\\\u00a8\u00f7I\"\u00d50\u00db\u00fb\u00b1\u00f0\u00ad\u00dd7\u00c1 t\u00b5\u007f\u00d59H\u00d9\u00c6\u0005\u00eay4\u00c7`\u0091\u008et\u00a2\u00f6\u00d7\u00e0\u009b$\u00e6x\u0017\u0094\u009c\u00f3\u0080\u00a4\u007f\u0018\u00d7\u0092\u008c\u00db\u00e5\u00c3\u00a7\u00af\u00dd\u00b2G\u00fb\u0082\u001b\u00b0\u00a3I6\u0099\u0010\u0094\u008f\u00b4\u00a8\u00b8\u0001\u0018t\u00b5=V\u0018\u009b\u00e2\u00ed\u00a1@V!\u00ac*S\u0083s\u00e8";
                var6_6 = "\u0080\u0098-\u009b\u0007Y\u00a4\u008cl\u00daP\u0018O\u00bc\u0014\\\u00cd_t\u00d7C.6\u0098\u00ecL\b\u00f8\u00bd\u00c7\u00adm\u00af\u0085\u001a\u00d9r\u008c'm\u00c0\u00d41\u00e9\u00ac4\u00fc\u00a3\bI\u0004\u00c7\u00f16\u0082\u0011{\u009c\u00ca*\u00cc~\u00a0\u0001(N\u0010\u0092MTk\u0098\u001fD\u00c2\u00a8\u00e5\u00d3\u008c\u0092 \t\u00cd\u008e\u009aIs\u00ec\u00e0\u001a~cE\u00cf\u0012\u009bC\u00f7\u00a6\u00c0:\u00a8\u00e0I\u0017\u0083H6\u00d9s\u001d\u00f7\u00c6P\u00f6\u00af\u00d1\u0084\u001f8-\u00c2\u00f0\u00f2\u00d0\u00f9\u00c5\u00d5h\u00910\u0091\u00db\u00a2\u00e3\t\u00874r;\u008f;'\u00e9\u00cd\u00c1\u0019\u00a9\u00f8'\u0010\n\u00ce\u001cr\u0018\u00ec\u00ddx\u00bf\u0003\\\u0007\u00a4\u00bc\u00ab\u00ae4\u001et\u009b\u00b5O\\\u00a8\u00f7I\"\u00d50\u00db\u00fb\u00b1\u00f0\u00ad\u00dd7\u00c1 t\u00b5\u007f\u00d59H\u00d9\u00c6\u0005\u00eay4\u00c7`\u0091\u008et\u00a2\u00f6\u00d7\u00e0\u009b$\u00e6x\u0017\u0094\u009c\u00f3\u0080\u00a4\u007f\u0018\u00d7\u0092\u008c\u00db\u00e5\u00c3\u00a7\u00af\u00dd\u00b2G\u00fb\u0082\u001b\u00b0\u00a3I6\u0099\u0010\u0094\u008f\u00b4\u00a8\u00b8\u0001\u0018t\u00b5=V\u0018\u009b\u00e2\u00ed\u00a1@V!\u00ac*S\u0083s\u00e8".length();
                var3_7 = 80;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = xg.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00d2\u0099\u008c\u009bhp+\u00a0\u00a4\u00fa\u00e3\u001d\u00c6\u0083\u00bc\u001a\u001b\u00ed\u000fA'H\u009en\u00f7\u0015D^x\u0012\u00a4\u0014\u00bf\u000fS\u0088q\u00d4{\u00a8f\u00db\u00b8\u00ab\u00d7\u00bb\u0082=\u000b\u00a6\r&\t\u00b9\u00c6~4f\u00c9\u00d2\u00fc\u0099\u0091\u00cd=\u001e'\u00da\u00e6\u008a\u00c8<\n\u00b8n\u00cf\u00c0\u00a6l\u0000P6\u009d\u00b5\u00ac4R\u00cd\u00d4h!\u00e5\u00bb\u000eM~\tr\u00b5\u0016K>\u0082j\u00fc\u001b\u0017DUkn\u00d9\u00a4@\u0099\u0010\u00bfu\u00c7\n=\u008f\u00bb\u000e)R\u00e5\u008f\u00fd\u0016u\u00a7\u0080\u00b0\u00a7G\u00a7\u00fd\u0012\u0082\u00d0\u0018\u00d7+;\u00be)\u00c4\u00a2\u000f\u00cd\u00af\u00e2\u00f6\u0091pv+6U\u00a1";
                    var6_6 = "\u00d2\u0099\u008c\u009bhp+\u00a0\u00a4\u00fa\u00e3\u001d\u00c6\u0083\u00bc\u001a\u001b\u00ed\u000fA'H\u009en\u00f7\u0015D^x\u0012\u00a4\u0014\u00bf\u000fS\u0088q\u00d4{\u00a8f\u00db\u00b8\u00ab\u00d7\u00bb\u0082=\u000b\u00a6\r&\t\u00b9\u00c6~4f\u00c9\u00d2\u00fc\u0099\u0091\u00cd=\u001e'\u00da\u00e6\u008a\u00c8<\n\u00b8n\u00cf\u00c0\u00a6l\u0000P6\u009d\u00b5\u00ac4R\u00cd\u00d4h!\u00e5\u00bb\u000eM~\tr\u00b5\u0016K>\u0082j\u00fc\u001b\u0017DUkn\u00d9\u00a4@\u0099\u0010\u00bfu\u00c7\n=\u008f\u00bb\u000e)R\u00e5\u008f\u00fd\u0016u\u00a7\u0080\u00b0\u00a7G\u00a7\u00fd\u0012\u0082\u00d0\u0018\u00d7+;\u00be)\u00c4\u00a2\u000f\u00cd\u00af\u00e2\u00f6\u0091pv+6U\u00a1".length();
                    var3_7 = 80;
                    var2_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = xg.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        xg.c = var7_3;
        xg.d = new String[6];
        xg.C = System.getProperty((String)xg.a("t", (int)8652, (long)(7670889498289083377L ^ var9)), "\n");
    }

    String e(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        switch (n) {
            case 0: {
                return xg.a("t", (int)4706, (long)(0xC552D09B3E84757L ^ l));
            }
            case 1: {
                return xg.a("t", (int)24420, (long)(0x4963A0AE85A48A55L ^ l));
            }
            case 2: {
                return xg.a("t", (int)11371, (long)(0x5CD79197DA86F95CL ^ l));
            }
            case 3: {
                return xg.a("t", (int)24847, (long)(0x1AA7FB06793F3439L ^ l));
            }
        }
        return xg.a("t", (int)10730, (long)(0x2B3194B25B2EFCDAL ^ l));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6B65;
        if (d[n2] == null) {
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
                throw new RuntimeException("com/zelix/xg", exception);
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
            xg.d[n2] = xg.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xg.a(n, l);
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
            throw new RuntimeException("com/zelix/xg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
