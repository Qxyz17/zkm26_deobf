/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class m3 {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public static void o(Object[] var0) {
        block46: {
            block45: {
                block44: {
                    var1_1 = (Integer)var0[0];
                    var2_2 = (Integer)var0[1];
                    var3_3 = (Integer)var0[2];
                    var4_4 = ((long)var1_1 << 48 | (long)var2_2 << 32 >>> 16 | (long)var3_3 << 48 >>> 48) ^ m3.a;
                    var6_5 = var4_4 ^ 86468251042720L;
                    var8_6 = m44.a("o", (long)2440458234699202962L, (long)var4_4);
                    try {
                        block43: {
                            block42: {
                                var9_7 = m44.a("o", (long)4570393881741878589L, (long)var4_4);
                                v0 = var9_7;
                                if (var8_6 != null) break block42;
                                try {
                                    block50: {
                                        v1 = new Object[4];
                                        v1[3] = m3.a("n", (int)19499, (long)(9085503052252363796L ^ var4_4));
                                        v1[2] = m3.a("n", (int)8233, (long)(1174929591822602263L ^ var4_4));
                                        v1[1] = var6_5;
                                        v1[0] = v0;
                                        if (!m44.a("o", (Object)v1, (long)4496231775685230944L, (long)var4_4).equals(m3.a("n", (int)1090, (long)(5809953875085849727L ^ var4_4)))) break block43;
                                        break block50;
                                        catch (SecurityException v2) {
                                            throw m44.a("o", (Object)v2, (long)4549361020459970793L, (long)var4_4);
                                        }
                                    }
                                    v0 = var9_7;
                                }
                                catch (SecurityException v3) {
                                    throw m44.a("o", (Object)v3, (long)4549361020459970793L, (long)var4_4);
                                }
                            }
                            for (Object var11_12 : v0.entrySet()) {
                                try {
                                    v4 /* !! */  = var8_6;
                                    if (var2_2 >= 0) {
                                        if (v4 /* !! */  != null) break block44;
                                        v4 /* !! */  = var11_12.getKey();
                                    }
                                    if (m44.a("o", (Object)((String)v4 /* !! */ ), (long)2598237715369447345L, (long)var4_4) == null) {
                                        // empty if block
                                    }
                                }
                                catch (SecurityException v5) {
                                    throw m44.a("o", (Object)v5, (long)4549361020459970793L, (long)var4_4);
                                }
                                if (var8_6 == null) continue;
                            }
                        }
                        if (var3_3 >= 0) {
                            // empty if block
                        }
                    }
                    catch (SecurityException var9_8) {
                        // empty catch block
                    }
                }
                var9_7 = new File((String)m3.a("n", (int)27878, (long)(5300618225861205210L ^ var4_4)));
                v6 = m44.a("p", (Object)var9_7, (long)4081294284746341755L, (long)var4_4);
                if (var8_6 != null) break block45;
                try {
                    block51: {
                        if (v6 == false) break block46;
                        break block51;
                        catch (SecurityException v7) {
                            throw m44.a("o", (Object)v7, (long)4549361020459970793L, (long)var4_4);
                        }
                    }
                    v6 = m44.a("p", (Object)var9_7, (long)2708665603360943853L, (long)var4_4);
                }
                catch (SecurityException v8) {
                    throw m44.a("o", (Object)v8, (long)4549361020459970793L, (long)var4_4);
                }
            }
            if (v6 != false) break block46;
            try {
                block47: {
                    var10_9 = new FileReader((File)var9_7);
                    var11_12 = null;
                    var12_13 = new Properties();
                    m44.a("p", (Object)var12_13, (Object)var10_9, (long)4483017902148117231L, (long)var4_4);
                    var13_16 = m44.a("p", (Object)var12_13, (long)2306700825068864007L, (long)var4_4).iterator();
                    block32: while (var13_16.hasNext()) {
                        var14_17 = (String)var13_16.next();
                        try {
                            m44.a("o", (Object)var14_17, (Object)m44.a("p", (Object)var12_13, (Object)var14_17, (long)4525113148324755265L, (long)var4_4), (long)2418810297345346786L, (long)var4_4);
                            do {
                                v9 = var8_6;
                                if (var3_3 > 0) {
                                    if (v9 != null) break block46;
                                    v9 = var8_6;
                                }
                                if (v9 == null) continue block32;
                            } while (var1_1 < 0);
                            break;
                        }
                        catch (SecurityException v10) {
                            throw m44.a("o", (Object)v10, (long)4549361020459970793L, (long)var4_4);
                        }
                    }
                    try {
                        if (var10_9 == null) break block46;
                        if (var11_12 == null) break block47;
                    }
                    catch (SecurityException v11) {
                        throw m44.a("o", (Object)v11, (long)4549361020459970793L, (long)var4_4);
                    }
                    try {
                        m44.a("p", (Object)var10_9, (long)2733535984589018012L, (long)var4_4);
                    }
                    catch (Throwable var12_14) {
                        m44.a("p", (Object)var11_12, (Object)var12_14, (long)2346302544836599031L, (long)var4_4);
                    }
                    break block46;
                }
                m44.a("p", (Object)var10_9, (long)2733535984589018012L, (long)var4_4);
                break block46;
                catch (Throwable var12_15) {
                    try {
                        var11_12 = var12_15;
                        throw var12_15;
                    }
                    catch (Throwable var15_18) {
                        block49: {
                            block48: {
                                try {
                                    if (var10_9 == null) break block48;
                                    if (var11_12 != null) {
                                    }
                                    ** GOTO lbl124
                                }
                                catch (SecurityException v12) {
                                    throw m44.a("o", (Object)v12, (long)4549361020459970793L, (long)var4_4);
                                }
                                try {
                                    m44.a("p", (Object)var10_9, (long)2733535984589018012L, (long)var4_4);
                                }
                                catch (Throwable var16_19) {
                                    try {
                                        v13 = var11_12;
                                        if (var3_3 < 0) break block49;
                                        m44.a("p", (Object)v13, (Object)var16_19, (long)2346302544836599031L, (long)var4_4);
                                        if (var8_6 == null) break block48;
lbl124:
                                        // 2 sources

                                        m44.a("p", (Object)var10_9, (long)2733535984589018012L, (long)var4_4);
                                    }
                                    catch (SecurityException v14) {
                                        throw m44.a("o", (Object)v14, (long)4549361020459970793L, (long)var4_4);
                                    }
                                }
                            }
                            v13 = var15_18;
                        }
                        throw v13;
                    }
                }
            }
            catch (FileNotFoundException var10_10) {
                m44.a("p", (Object)var10_10, (long)2323240908912382616L, (long)var4_4);
            }
            catch (IOException var10_11) {
                m44.a("p", (Object)var10_11, (long)4151679641883401780L, (long)var4_4);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                m3.a = prr.a((long)1817267710142078328L, (long)-1945279265364979826L, MethodHandles.lookup().lookupClass()).a(263300447170353L);
                m3.d = new HashMap<K, V>(13);
                var0 = m3.a ^ 84408862140688L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "t\u0019W\u0007,O\u0012\u00fc\u00c4H\u00a6\u00a6\u0011\r\u00ea\u00d8(4\u0099JM\u00e9'\u0083:7j\u008f\f\u00ab\u0012\u00a3\u00bd\u0016V\u00d1k\u00ee\u00ba>aW\u0000\u00dd6_\u0097\u00da\u001b\u00e7\u00cf\u008d\u00c4\u00fc]\u00d2\u00eb";
                var8_6 = "t\u0019W\u0007,O\u0012\u00fc\u00c4H\u00a6\u00a6\u0011\r\u00ea\u00d8(4\u0099JM\u00e9'\u0083:7j\u008f\f\u00ab\u0012\u00a3\u00bd\u0016V\u00d1k\u00ee\u00ba>aW\u0000\u00dd6_\u0097\u00da\u001b\u00e7\u00cf\u008d\u00c4\u00fc]\u00d2\u00eb".length();
                var5_7 = 16;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = m3.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e4\u00d7\u0096\u0093\u00f1u\u00ea\u00ac\u00cb\u00b0\u00e6\u00f53\u00ce\u00caz\u00d0j\u00a2\u00ceo\u008b\u00c3\u00a3\u00ed\u00f7\u0019J\b\u00dd\u00df\u008b\u0080\u00de\u00ddP\u00a3\u000f\u008b\u00e2\u00b0\u00b4\u0081\u00ea&R\u00c9\u0011\u0091\u001c^O\u00f2\u00d8\u00d4\u00adu\u00cc\u00cbz\u0091\u00ec\u0080\u00e7\u00e1J\u0088gO\u00e6h\u0007L<\u0093\u00cc\u00d4\t\u00d0\u00ef\u0001\u0089p\u00ec\u009f\u0006\u0096X\u00ab\u00ff\u00b3\u0089? \u00d8\u00c1;z\u008e\u00ae\u00a9\u00fa\u0005\u00c3\u00c6_\u00e7\u00ef\u00aa\u00af*+\u00b4BO\u008eq\u00c7(W\u00c0\u00e3iBT:y\u00c7\u009f}*\u00b2b\b\u00d3\u00ca>u\u0007S\u00bfi#\u008f\u00bb\u001fhm\u00db\u00e6\u009e\u00c5\u00de[\u00c4\u00ad\u00f6\u00ec\u00ed\u0005\u0098\u00ec)\u00a5\u00d0\u00b36Z5\u0003\"H\b\u00eb\u00c5E\u00e2\u008c\bYq\u001ar\fD\u00aa\u001e\u001e\u00b1\u00d5O\u00d8\u00eeJ\u00ac^\u00ab>\u00cf\u00b2\u0082\u0096\u008c\u00d5'\u0019q\u00f6\u0096ILg\u000b\u00b2I\u0084/\u00c6(%\u00bc\u0012E\u0016,";
                    var8_6 = "\u00e4\u00d7\u0096\u0093\u00f1u\u00ea\u00ac\u00cb\u00b0\u00e6\u00f53\u00ce\u00caz\u00d0j\u00a2\u00ceo\u008b\u00c3\u00a3\u00ed\u00f7\u0019J\b\u00dd\u00df\u008b\u0080\u00de\u00ddP\u00a3\u000f\u008b\u00e2\u00b0\u00b4\u0081\u00ea&R\u00c9\u0011\u0091\u001c^O\u00f2\u00d8\u00d4\u00adu\u00cc\u00cbz\u0091\u00ec\u0080\u00e7\u00e1J\u0088gO\u00e6h\u0007L<\u0093\u00cc\u00d4\t\u00d0\u00ef\u0001\u0089p\u00ec\u009f\u0006\u0096X\u00ab\u00ff\u00b3\u0089? \u00d8\u00c1;z\u008e\u00ae\u00a9\u00fa\u0005\u00c3\u00c6_\u00e7\u00ef\u00aa\u00af*+\u00b4BO\u008eq\u00c7(W\u00c0\u00e3iBT:y\u00c7\u009f}*\u00b2b\b\u00d3\u00ca>u\u0007S\u00bfi#\u008f\u00bb\u001fhm\u00db\u00e6\u009e\u00c5\u00de[\u00c4\u00ad\u00f6\u00ec\u00ed\u0005\u0098\u00ec)\u00a5\u00d0\u00b36Z5\u0003\"H\b\u00eb\u00c5E\u00e2\u008c\bYq\u001ar\fD\u00aa\u001e\u001e\u00b1\u00d5O\u00d8\u00eeJ\u00ac^\u00ab>\u00cf\u00b2\u0082\u0096\u008c\u00d5'\u0019q\u00f6\u0096ILg\u000b\u00b2I\u0084/\u00c6(%\u00bc\u0012E\u0016,".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = m3.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        m3.b = var9_3;
        m3.c = new String[4];
    }

    private static SecurityException a(SecurityException securityException) {
        return securityException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5AED;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/m3", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            m3.c[n2] = m3.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = m3.a(n, l);
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
            throw new RuntimeException("com/zelix/m3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
