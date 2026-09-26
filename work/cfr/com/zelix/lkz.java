/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

public class lkz
extends Thread {
    PrintWriter o;
    InputStream y;
    String m;
    boolean w;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        long l10 = a ^ 0x4F2EEBE034D4L;
        boolean bl2 = false;
        CallSite callSite = m44.a("j", (long)4036614777737243452L, (long)l10);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)((Object)m44.a("t", (Object)this, (long)2666915686674632192L, (long)l10)));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String string = null;
            while ((string = bufferedReader.readLine()) != null) {
                bl2 = true;
                try {
                    ((PrintWriter)((Object)m44.a("t", (Object)this, (long)4437080792513592174L, (long)l10))).println((String)((Object)m44.a("t", (Object)this, (long)2433925250575744983L, (long)l10)) + string);
                    if (callSite == false && callSite == false) continue;
                    break;
                }
                catch (IOException iOException) {
                    throw m44.a("j", (Object)iOException, (long)2869131951278792021L, (long)l10);
                }
            }
        }
        catch (IOException iOException) {
            m44.a("u", (Object)iOException, (long)4580391487968860217L, (long)l10);
        }
        try {
            if (!bl2) return;
            m44.a("u", (Object)m44.a("n", (long)2393456083492411413L, (long)l10), (Object)((String)((Object)m44.a("t", (Object)this, (long)2433925250575744983L, (long)l10)) + (String)((Object)lkz.a("f", (int)9134, (long)(0x3442514CF69A975FL ^ l10)))), (long)4199650640994836573L, (long)l10);
            return;
        }
        catch (IOException iOException) {
            throw m44.a("j", (Object)iOException, (long)2869131951278792021L, (long)l10);
        }
    }

    lkz(InputStream inputStream, PrintWriter printWriter, int n10, boolean bl2, long l10) {
        block8: {
            block9: {
                lkz lkz2;
                long l11;
                block6: {
                    l11 = (l10 = a ^ l10) ^ 0x4C9A08F266BFL;
                    CallSite callSite = m44.a("m", (long)2302327356307000523L, (long)l10);
                    CallSite callSite2 = callSite;
                    try {
                        block7: {
                            try {
                                try {
                                    m44.a("q", (Object)this, (InputStream)inputStream, (long)213257870511286775L, (long)l10);
                                    lkz2 = this;
                                    if (callSite2 != false) break block6;
                                    m44.a("q", (Object)lkz2, (PrintWriter)printWriter, (long)1901856257098259609L, (long)l10);
                                    if (!bl2) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("m", (Object)n92, (long)10793932878985890L, (long)l10);
                                }
                                Object[] objectArray = new Object[5];
                                objectArray[4] = (int)lkz.b("l", (int)32435, (long)(0x1FCFD017977A3241L ^ l10));
                                objectArray[3] = l11;
                                objectArray[2] = n10;
                                objectArray[1] = (int)lkz.b("l", (int)18596, (long)(0x30E5026D67230457L ^ l10));
                                objectArray[0] = lkz.a("f", (int)16235, (long)(0x4AD15376C0FEAC6CL ^ l10));
                                m44.a("q", (Object)this, (String)((Object)m44.a("m", (Object)objectArray, (long)423575150674256936L, (long)l10)), (long)445969982529116192L, (long)l10);
                                if (l10 < 0L) break block8;
                                if (callSite2 == false) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("m", (Object)n93, (long)10793932878985890L, (long)l10);
                            }
                        }
                        lkz2 = this;
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)n94, (long)10793932878985890L, (long)l10);
                    }
                }
                Object[] objectArray = new Object[5];
                objectArray[4] = (int)lkz.b("l", (int)19827, (long)(0x3649ADD284330183L ^ l10));
                objectArray[3] = l11;
                objectArray[2] = n10;
                objectArray[1] = (int)lkz.b("l", (int)29714, (long)(0x793A772BB2D7B8E3L ^ l10));
                objectArray[0] = "";
                m44.a("q", (Object)lkz2, (String)((Object)m44.a("m", (Object)objectArray, (long)423575150674256936L, (long)l10)), (long)445969982529116192L, (long)l10);
            }
            m44.a("q", (Object)this, (boolean)bl2, (long)466753396031422617L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    lkz.a = prr.a(1572106303626137798L, -8912401573867359353L, MethodHandles.lookup().lookupClass()).a(5563241064497L);
                    lkz.d = new HashMap<K, V>(13);
                    var11 = lkz.a ^ 83720979739673L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var20_3 = new String[2];
                    var18_4 = 0;
                    var17_5 = "\u00ff\u000e\u001f\\\u0093o5\u007f;9\u00b9\u00e2\u00aa\u0012\u0017\u00b0\u00165 \u00a4\u00b2@{\u00b3\u00af\u000f/\u0094\u0002of\u00f3S\u009bD\u00aa\u00a0&\u0085\u00b22V\u00ae\t\u001b\u00ba`\u00cbU\u00b9\u00f0\u00ed\u00f91 \u00e8\u00c66\u009d\u00b4x1_\u00e6\u0010\u00d4F\u00d6vB\u00c1\u00d0=!\u0015\u00ee\u00a1\u001b1\u0011W";
                    var19_6 = "\u00ff\u000e\u001f\\\u0093o5\u007f;9\u00b9\u00e2\u00aa\u0012\u0017\u00b0\u00165 \u00a4\u00b2@{\u00b3\u00af\u000f/\u0094\u0002of\u00f3S\u009bD\u00aa\u00a0&\u0085\u00b22V\u00ae\t\u001b\u00ba`\u00cbU\u00b9\u00f0\u00ed\u00f91 \u00e8\u00c66\u009d\u00b4x1_\u00e6\u0010\u00d4F\u00d6vB\u00c1\u00d0=!\u0015\u00ee\u00a1\u001b1\u0011W".length();
                    var16_7 = 64;
                    var15_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = lkz.a(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                lkz.b = var20_3;
                lkz.c = new String[2];
                lkz.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "\u00adG\u009a+\u009d6x\u0088\u0014\u008bze\u00a9\u0091\u00efQ";
                var5_15 = "\u00adG\u009a+\u009d6x\u0088\u0014\u008bze\u00a9\u0091\u00efQ".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00c3\u0095?\u00f6\u00c7\u0000e\u00e2\u00absr\u00c7\u008b\u00c2\u00b5\u00bf";
                    var5_15 = "\u00c3\u0095?\u00f6\u00c7\u0000e\u00e2\u00absr\u00c7\u008b\u00c2\u00b5\u00bf".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl71:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl84:
                // 1 sources

                ** continue;
            }
        }
        lkz.e = var6_12;
        lkz.f = new Integer[4];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x182C;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lkz", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            lkz.c[n11] = lkz.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lkz.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lkz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x47D8;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lkz", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lkz.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lkz.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lkz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lkz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(lkz.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

