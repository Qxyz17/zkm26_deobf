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
        long l = a ^ 0x4F2EEBE034D4L;
        boolean bl = false;
        CallSite callSite = m44.a("j", (long)4036614777737243452L, (long)l);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)((Object)m44.a("t", (Object)this, (long)2666915686674632192L, (long)l)));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String string = null;
            while ((string = bufferedReader.readLine()) != null) {
                bl = true;
                try {
                    ((PrintWriter)((Object)m44.a("t", (Object)this, (long)4437080792513592174L, (long)l))).println((String)((Object)m44.a("t", (Object)this, (long)2433925250575744983L, (long)l)) + string);
                    if (callSite == false && callSite == false) continue;
                    break;
                }
                catch (IOException iOException) {
                    throw m44.a("j", (Object)iOException, (long)2869131951278792021L, (long)l);
                }
            }
        }
        catch (IOException iOException) {
            m44.a("u", (Object)iOException, (long)4580391487968860217L, (long)l);
        }
        try {
            if (!bl) return;
            m44.a("u", (Object)m44.a("n", (long)2393456083492411413L, (long)l), (Object)((String)((Object)m44.a("t", (Object)this, (long)2433925250575744983L, (long)l)) + (String)((Object)lkz.a("f", (int)9134, (long)(0x3442514CF69A975FL ^ l)))), (long)4199650640994836573L, (long)l);
            return;
        }
        catch (IOException iOException) {
            throw m44.a("j", (Object)iOException, (long)2869131951278792021L, (long)l);
        }
    }

    lkz(InputStream inputStream, PrintWriter printWriter, int n, boolean bl, long l) {
        block8: {
            block9: {
                lkz lkz2;
                long l2;
                block6: {
                    l2 = (l = a ^ l) ^ 0x4C9A08F266BFL;
                    CallSite callSite = m44.a("m", (long)2302327356307000523L, (long)l);
                    CallSite callSite2 = callSite;
                    try {
                        block7: {
                            try {
                                try {
                                    m44.a("q", (Object)this, (InputStream)inputStream, (long)213257870511286775L, (long)l);
                                    lkz2 = this;
                                    if (callSite2 != false) break block6;
                                    m44.a("q", (Object)lkz2, (PrintWriter)printWriter, (long)1901856257098259609L, (long)l);
                                    if (!bl) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("m", (Object)((Object)n92), (long)10793932878985890L, (long)l);
                                }
                                Object[] objectArray = new Object[5];
                                objectArray[4] = (int)lkz.b("l", (int)32435, (long)(0x1FCFD017977A3241L ^ l));
                                objectArray[3] = l2;
                                objectArray[2] = n;
                                objectArray[1] = (int)lkz.b("l", (int)18596, (long)(0x30E5026D67230457L ^ l));
                                objectArray[0] = lkz.a("f", (int)16235, (long)(0x4AD15376C0FEAC6CL ^ l));
                                m44.a("q", (Object)this, (String)((Object)m44.a("m", (Object)objectArray, (long)423575150674256936L, (long)l)), (long)445969982529116192L, (long)l);
                                if (l < 0L) break block8;
                                if (callSite2 == false) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("m", (Object)((Object)n93), (long)10793932878985890L, (long)l);
                            }
                        }
                        lkz2 = this;
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)((Object)n94), (long)10793932878985890L, (long)l);
                    }
                }
                Object[] objectArray = new Object[5];
                objectArray[4] = (int)lkz.b("l", (int)19827, (long)(0x3649ADD284330183L ^ l));
                objectArray[3] = l2;
                objectArray[2] = n;
                objectArray[1] = (int)lkz.b("l", (int)29714, (long)(0x793A772BB2D7B8E3L ^ l));
                objectArray[0] = "";
                m44.a("q", (Object)lkz2, (String)((Object)m44.a("m", (Object)objectArray, (long)423575150674256936L, (long)l)), (long)445969982529116192L, (long)l);
            }
            m44.a("q", (Object)this, (boolean)bl, (long)466753396031422617L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    lkz.a = prr.a((long)1572106303626137798L, (long)-8912401573867359353L, MethodHandles.lookup().lookupClass()).a(5563241064497L);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x182C;
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
                throw new RuntimeException("com/zelix/lkz", exception);
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
            lkz.c[n2] = lkz.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lkz.a(n, l);
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x47D8;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lkz.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = lkz.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
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
