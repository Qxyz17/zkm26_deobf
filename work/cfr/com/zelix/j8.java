/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.j6;
import com.zelix.lb;
import com.zelix.lkc;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.zn;
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

public class j8
extends j6 {
    private static final String[] a;
    private static final String[] b;
    private static final Map c;

    /*
     * Unable to fully structure code
     */
    @Override
    public void F(zn var1_1, lkc var2_2, long var3_3) {
        block24: {
            block27: {
                block25: {
                    block22: {
                        v0 = var3_3;
                        var5_4 = v0 ^ 63922461995707L;
                        var7_5 = v0 ^ 87303549007794L;
                        var9_6 = v0 ^ 97566275871319L;
                        var11_7 = v0 ^ 72411267672165L;
                        var14_8 = (lb)this.x;
                        var13_9 = m44.a("h", (long)-3779571992638565438L, (long)var3_3);
                        try {
                            block23: {
                                try {
                                    try {
                                        v1 = this.T.equals(j8.a("a", (int)20054, (long)(3165531172400073161L ^ var3_3)));
                                        if (var13_9 != null) break block22;
                                        if (!v1) break block23;
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("h", (Object)v2, (long)-3527224295154830378L, (long)var3_3);
                                    }
                                    v3 = new Object[1];
                                    v3[0] = var7_5;
                                    m44.a("w", (Object)var14_8, (Object)v3, (long)-3331031026456828125L, (long)var3_3);
                                    if (var13_9 == null) break block24;
                                }
                                catch (n9 v4) {
                                    throw m44.a("h", (Object)v4, (long)-3527224295154830378L, (long)var3_3);
                                }
                            }
                            v1 = this.T.equals(j8.a("a", (int)2841, (long)(8947150121764048004L ^ var3_3)));
                        }
                        catch (n9 v5) {
                            throw m44.a("h", (Object)v5, (long)-3527224295154830378L, (long)var3_3);
                        }
                    }
                    try {
                        block26: {
                            try {
                                try {
                                    v6 = var13_9;
                                    if (var3_3 > 0L) {
                                        if (v6 != null) break block25;
                                        if (!v1) break block26;
                                    }
                                    ** GOTO lbl62
                                }
                                catch (n9 v7) {
                                    throw m44.a("h", (Object)v7, (long)-3527224295154830378L, (long)var3_3);
                                }
                                v8 = new Object[1];
                                v8[0] = var5_4;
                                m44.a("w", (Object)var14_8, (Object)v8, (long)-3568866377981012342L, (long)var3_3);
                                if (var13_9 == null) break block24;
                            }
                            catch (n9 v9) {
                                throw m44.a("h", (Object)v9, (long)-3527224295154830378L, (long)var3_3);
                            }
                        }
                        v1 = this.T.equals(j8.a("a", (int)17089, (long)(8491358129697064285L ^ var3_3)));
                    }
                    catch (n9 v10) {
                        throw m44.a("h", (Object)v10, (long)-3527224295154830378L, (long)var3_3);
                    }
                }
                try {
                    block28: {
                        try {
                            try {
                                if (var3_3 < 0L) break block27;
                                v6 = var13_9;
lbl62:
                                // 2 sources

                                if (v6 != null) break block27;
                                if (!v1) break block28;
                            }
                            catch (n9 v11) {
                                throw m44.a("h", (Object)v11, (long)-3527224295154830378L, (long)var3_3);
                            }
                            v12 = new Object[1];
                            v12[0] = var11_7;
                            m44.a("w", (Object)var14_8, (Object)v12, (long)-3475219019790774525L, (long)var3_3);
                            if (var13_9 == null) break block24;
                        }
                        catch (n9 v13) {
                            throw m44.a("h", (Object)v13, (long)-3527224295154830378L, (long)var3_3);
                        }
                    }
                    v1 = this.T.equals(j8.a("a", (int)27996, (long)(8227043610913286850L ^ var3_3)));
                }
                catch (n9 v14) {
                    throw m44.a("h", (Object)v14, (long)-3527224295154830378L, (long)var3_3);
                }
            }
            try {
                if (v1) {
                    v15 = new Object[1];
                    v15[0] = var9_6;
                    m44.a("w", (Object)var14_8, (Object)v15, (long)-3573945995167416001L, (long)var3_3);
                }
            }
            catch (n9 v16) {
                throw m44.a("h", (Object)v16, (long)-3527224295154830378L, (long)var3_3);
            }
        }
    }

    public j8(int n10) {
        super(n10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                j8.c = new HashMap<K, V>(13);
                var0 = prr.a(3904794697913754029L, -1331629430498675865L, MethodHandles.lookup().lookupClass()).a(21761222930493L) ^ 90284720755980L;
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
                var6_5 = "\u0081L%\r\u00dc?\u00b6\u00e0\b\u00fc\u00d9\u001a0\u00ec\u0019\u0081\u0018\u00b0\u00e0\u00f3x\u0096\u0007\u008a\u0013,R@:1\"j\u00faqfV\u0002-UZ\u00b0";
                var8_6 = "\u0081L%\r\u00dc?\u00b6\u00e0\b\u00fc\u00d9\u001a0\u00ec\u0019\u0081\u0018\u00b0\u00e0\u00f3x\u0096\u0007\u008a\u0013,R@:1\"j\u00faqfV\u0002-UZ\u00b0".length();
                var5_7 = 16;
                var4_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = j8.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00df>\u00e2\u00b3\u00c5\u00a9\u00f4^t)\u001c\u00d3\u0085\u00fe\u008fr\u0010\u0013\u009f6\u009c:\u009a\n b\u008e9#\u00fd\u00d6\u00e0\u00a5";
                    var8_6 = "\u00df>\u00e2\u00b3\u00c5\u00a9\u00f4^t)\u001c\u00d3\u0085\u00fe\u008fr\u0010\u0013\u009f6\u009c:\u009a\n b\u008e9#\u00fd\u00d6\u00e0\u00a5".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl33:
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
lbl38:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = j8.b(var10_9).intern();
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
lbl50:
                // 1 sources

                ** continue;
            }
        }
        j8.a = var9_3;
        j8.b = new String[4];
    }

    private static n9 a(n9 n92) {
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x38B;
        if (b[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])c.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    c.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/j8", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = a[n11].getBytes("ISO-8859-1");
            j8.b[n11] = j8.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return b[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = j8.a(n10, l10);
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
            throw new RuntimeException("com/zelix/j8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(j8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

