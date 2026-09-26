/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.prr;
import com.zelix.xg;
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

public abstract class xx
extends xg {
    public static final String e;
    private static final long b;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                xx.b = prr.a((long)990228157551518185L, (long)1603342982611361292L, MethodHandles.lookup().lookupClass()).a(101387351204494L);
                var9 = xx.b ^ 96515377642970L;
                xx.i = new HashMap<K, V>(13);
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
                var7_3 = new String[7];
                var5_4 = 0;
                var4_5 = "D\u00eaL`\u0016o\u000f\u00f8\u0002\u0002\u00b89\u0012ek\u00ce}\u0096H\u00f5(\u00e8\u0088\u00ebZ+\u001c\u0086\u008e\u00d7\u00a3/H\u00f51\u00bc<?\u00fd\thN{Wl\u0003p\u00da\u009f\u00cf\u00c7\u00a7d\u00cb\u0082mS\u0098EIH\u0001A\u0017\u00f7\u00d6\u009d\u00ff#)H\u00ccj\u00ba|\u00c8\u0083\u00a4\u00d9\u00b5o\u00a7\u0093\u00e1JK\u000b^\u00f6\u00ef\u0086\u0089\u00f2\u00feKM\u00b5^\u001f\u0084H\u009f\u00e5D\u009dP)\u00cc\u00d0C\u00bb\n\u00d1\u00bb\u00a0E~\u008c\u0081\u00ae\u008d\u00d5&\u00a1pw\f8\u0082\u00a4\u00d9\u00a0\"\b\r\u001c\u00e7+>\u00f0I\u00c7,\u0002\u00eb\u009a\u009as\u00bc\u007f'\u0018\u00c2\u00e9\u001b\u0084)\u00a588\u008c\u0000\u00ff\u00d3\u00fd\u0015\u00894V\u00b2\u00ac\u00ab\u00d2|\u00b6\u00e6\u008d\u001c\u009f\u0014\u009c\u0092w\u00b2dp\u0010\u0094\u00aa\u00dc\u00a7\u00be$\u00e8=\u00fe\u00dd\u00fe\u00c8\u00bbk\u009b;H\u0002\u00beC\u0082\u00ff\u00f0\u00f4\u00d5\u00f0t\u001a\u00cdr\u00fd\u00ba\u0087c\u0010\u00ab!\u00b6\u00d6\u008a\u0086{!5P?\u0098Mxqy\\\u00a2\u00bf<\u00c4p\u0003\u001e\r\u00ae7.\u00c4\u00cc[\u00ce\u00d1\u00e3c\u00cen\u000e\u00c3\u009d\u00fa+\u00ceh\u00f8\u00f2\t\u0003\u001e\"\u0088|\u00d5\u00e3";
                var6_6 = "D\u00eaL`\u0016o\u000f\u00f8\u0002\u0002\u00b89\u0012ek\u00ce}\u0096H\u00f5(\u00e8\u0088\u00ebZ+\u001c\u0086\u008e\u00d7\u00a3/H\u00f51\u00bc<?\u00fd\thN{Wl\u0003p\u00da\u009f\u00cf\u00c7\u00a7d\u00cb\u0082mS\u0098EIH\u0001A\u0017\u00f7\u00d6\u009d\u00ff#)H\u00ccj\u00ba|\u00c8\u0083\u00a4\u00d9\u00b5o\u00a7\u0093\u00e1JK\u000b^\u00f6\u00ef\u0086\u0089\u00f2\u00feKM\u00b5^\u001f\u0084H\u009f\u00e5D\u009dP)\u00cc\u00d0C\u00bb\n\u00d1\u00bb\u00a0E~\u008c\u0081\u00ae\u008d\u00d5&\u00a1pw\f8\u0082\u00a4\u00d9\u00a0\"\b\r\u001c\u00e7+>\u00f0I\u00c7,\u0002\u00eb\u009a\u009as\u00bc\u007f'\u0018\u00c2\u00e9\u001b\u0084)\u00a588\u008c\u0000\u00ff\u00d3\u00fd\u0015\u00894V\u00b2\u00ac\u00ab\u00d2|\u00b6\u00e6\u008d\u001c\u009f\u0014\u009c\u0092w\u00b2dp\u0010\u0094\u00aa\u00dc\u00a7\u00be$\u00e8=\u00fe\u00dd\u00fe\u00c8\u00bbk\u009b;H\u0002\u00beC\u0082\u00ff\u00f0\u00f4\u00d5\u00f0t\u001a\u00cdr\u00fd\u00ba\u0087c\u0010\u00ab!\u00b6\u00d6\u008a\u0086{!5P?\u0098Mxqy\\\u00a2\u00bf<\u00c4p\u0003\u001e\r\u00ae7.\u00c4\u00cc[\u00ce\u00d1\u00e3c\u00cen\u000e\u00c3\u009d\u00fa+\u00ceh\u00f8\u00f2\t\u0003\u001e\"\u0088|\u00d5\u00e3".length();
                var3_7 = 32;
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
                    var7_3[var5_4++] = xx.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u009eh}\u00a7\u00a9\u0005\u009c\u00e6\u00f83\u00c2I\u001a\u007f\u0007H~\u0017\u00d07\u00ef\u00cf\u00bf\u00dd\u000f\u00e0\u00d6\u0090\u00ca\u00c0P\u001a\u00ca\u00fd\u00d2c\u008b\u00a9\u00e3\b\u00f9\u009f\u00ef\u00ff\u00e4\u00fe*]vk]\u0001\u00eel fO\u00c9\u00d9\u0016\u00be0\u00ff\u0099\u00b1\u0002^\u00b53q3nP\u00c9\u00169\u009e\u00e2\u00e4\u0006cV\u00f1;07\u00ac\u0012\u0013C\u00c5\u001c\u00e9\u00c9A5\u0013,\u00dek\u00ba\u0081ZI\u00e4\u00eb./\u0082\u001f/\u00be\u00f6\u00d6\u00fb-\t\u00e0D\u00de+{M'\u00e0\u00c7\u009fI\u0093\u00b0\u00c78&\u00e5C:XBRQ\u00b6\u00f7\n\u007f\u0084%\u00b5\u00eeT\u00b6+,\u00ef";
                    var6_6 = "\u009eh}\u00a7\u00a9\u0005\u009c\u00e6\u00f83\u00c2I\u001a\u007f\u0007H~\u0017\u00d07\u00ef\u00cf\u00bf\u00dd\u000f\u00e0\u00d6\u0090\u00ca\u00c0P\u001a\u00ca\u00fd\u00d2c\u008b\u00a9\u00e3\b\u00f9\u009f\u00ef\u00ff\u00e4\u00fe*]vk]\u0001\u00eel fO\u00c9\u00d9\u0016\u00be0\u00ff\u0099\u00b1\u0002^\u00b53q3nP\u00c9\u00169\u009e\u00e2\u00e4\u0006cV\u00f1;07\u00ac\u0012\u0013C\u00c5\u001c\u00e9\u00c9A5\u0013,\u00dek\u00ba\u0081ZI\u00e4\u00eb./\u0082\u001f/\u00be\u00f6\u00d6\u00fb-\t\u00e0D\u00de+{M'\u00e0\u00c7\u009fI\u0093\u00b0\u00c78&\u00e5C:XBRQ\u00b6\u00f7\n\u007f\u0084%\u00b5\u00eeT\u00b6+,\u00ef".length();
                    var3_7 = 72;
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
                    var7_3[var5_4++] = xx.b(var8_9).intern();
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
        xx.g = var7_3;
        xx.h = new String[7];
        xx.e = System.getProperty((String)xx.b("n", (int)6290, (long)(2947060438367225907L ^ var9)), (String)xx.b("n", (int)15913, (long)(4936922228251520651L ^ var9)));
    }

    String C(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = b ^ l;
        switch (n) {
            case 0: {
                return xx.b("n", (int)10091, (long)(0x7FFE56E230F875FAL ^ l));
            }
            case 1: {
                return xx.b("n", (int)21856, (long)(0x4B7522D4EBF807F2L ^ l));
            }
            case 2: {
                return xx.b("n", (int)13094, (long)(0x4F49BF2B4A5DE1B2L ^ l));
            }
            case 3: {
                return xx.b("n", (int)15891, (long)(0x2EF88498180E6C85L ^ l));
            }
        }
        return xx.b("n", (int)824, (long)(0x4E22C6CDC49151ADL ^ l));
    }

    private static String b(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2655;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/xx", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            xx.h[n2] = xx.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xx.b(n, l);
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
            throw new RuntimeException("com/zelix/xx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
