/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.gm;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.hm;
import com.zelix.js;
import com.zelix.lk0;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import java.io.DataOutputStream;
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

public class x8
extends js
implements gm,
hm {
    String p;
    static final va X;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public void A(String string) {
        this.p = string;
        this.p = this.p.intern();
    }

    public String J(Object[] objectArray) {
        CallSite callSite;
        block2: {
            Object object;
            block3: {
                long l = (Long)objectArray[0];
                long l2 = l;
                long l3 = l2 ^ 0x35ADBD43BF30L;
                long l4 = l2 ^ 0xFA7441B1117L;
                int n = (int)(l4 >>> 48);
                int n2 = (int)(l4 << 16 >>> 32);
                int n3 = (int)(l4 << 48 >>> 48);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = this.z((char)n, n2, (short)n3);
                objectArray2[0] = l3;
                object = m44.a("j", (Object)objectArray2, (long)-487202251041244564L, (long)l);
                CallSite callSite2 = m44.a("j", (long)-1890009799743652678L, (long)l);
                try {
                    callSite = object;
                    if (callSite2 == false) break block2;
                    if (((String)((Object)callSite)).length() <= x8.c("j", (int)29778, (long)(0x37034E3675BFA683L ^ l))) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)-461459981245851596L, (long)l);
                }
                object = ((String)object).substring(0, (int)x8.c("j", (int)13595, (long)(0x28F0ABED0CEA67C8L ^ l))) + (String)((Object)x8.b("h", (int)4679, (long)(0x2CE58856D933FC5CL ^ l))) + (((String)object).length() - x8.c("j", (int)22796, (long)(0x62CB2240C64A8BDCL ^ l))) + (String)((Object)x8.b("h", (int)25563, (long)(0x5F7A447CCA008DC7L ^ l))) + ((String)object).substring(((String)object).length() - x8.c("j", (int)5024, (long)(0x2183A7E873BAC172L ^ l)));
            }
            callSite = object;
        }
        return callSite;
    }

    public x8(int n, to to2, String string) {
        super(n, to2);
        this.p = string;
    }

    x8 q(int n) {
        return new x8(n, this.l, this.p);
    }

    public va A(long l) {
        return X;
    }

    public boolean e(long l, gu gu2, Object object, Object object2) {
        long l2 = l ^ 0xB1C2A58BC7CL;
        return gu2.K((js)this, object, l2, object2);
    }

    protected void O(DataOutputStream dataOutputStream, long l) {
        boolean bl;
        byte[] byArray;
        long l2;
        long l3;
        block4: {
            block5: {
                long l4 = l;
                l3 = l4 ^ 0x240E806275A0L;
                long l5 = l4 ^ 0x23B1D9B6F303L;
                l2 = l4 ^ 0x4047A1F5CD62L;
                CallSite callSite = m44.a("i", (long)-509579923954426359L, (long)l);
                dataOutputStream.writeByte(X.g());
                CallSite callSite2 = callSite;
                byArray = cf.v((long)l5, (String)this.p);
                try {
                    try {
                        bl = byArray.length;
                        if (callSite2 != false) break block4;
                        if (bl > x8.c("j", (int)22743, (long)(0x69B16627AC9B89E2L ^ l))) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-397563873650385961L, (long)l);
                    }
                    bl = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)-397563873650385961L, (long)l);
                }
            }
            bl = false;
        }
        lk0.t((boolean)bl, (String[])new String[]{(String)((Object)x8.b("h", (int)25362, (long)(0x278E9A2608170EEEL ^ l))) + this.L(l3) + (String)((Object)x8.b("h", (int)17926, (long)(0x3641E00F7D742BF8L ^ l))) + byArray.length + (String)((Object)x8.b("h", (int)20063, (long)(0x3008627FEA47A3A2L ^ l))) + this.p.length()}, (long)l2);
        dataOutputStream.writeShort(byArray.length);
        dataOutputStream.write(byArray);
    }

    public String W(long l) {
        return this.p;
    }

    public final int R(Object[] objectArray) {
        return this.p.length();
    }

    public String V() {
        return this.p;
    }

    public String z(char c, int n, short s) {
        return this.V();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        x8.a = prr.a((long)-6033145483758706362L, (long)3079839076354994412L, MethodHandles.lookup().lookupClass()).a(223830241126584L);
                        var20 = x8.a ^ 23476239428130L;
                        x8.d = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[5];
                        var16_4 = 0;
                        var15_5 = "\u0019\u00a1\u00b3\u00f9\u00fe\u0001r\u009f\u00ed\u0001L\u00d4\u00b8\t0\u00f3\u00bd8x6\u00afD\u00e0o\nt\u00c3\u00f2\u00eepIm\t \u00e1\u0005\u00b1\u0006\f]\u00ff^\u0019~`Q4\u00eb\u0010\u00ef\u00f5\u00c2\u00a5\u0003\u0093\u00fa\u00ed\u00ae\u00f9K\u0001\u008d\u009f6\u00f1\u0010hAfpjo\u007f\u00a8\u00ad*7\u00b73m\u00aa\u00df";
                        var17_6 = "\u0019\u00a1\u00b3\u00f9\u00fe\u0001r\u009f\u00ed\u0001L\u00d4\u00b8\t0\u00f3\u00bd8x6\u00afD\u00e0o\nt\u00c3\u00f2\u00eepIm\t \u00e1\u0005\u00b1\u0006\f]\u00ff^\u0019~`Q4\u00eb\u0010\u00ef\u00f5\u00c2\u00a5\u0003\u0093\u00fa\u00ed\u00ae\u00f9K\u0001\u008d\u009f6\u00f1\u0010hAfpjo\u007f\u00a8\u00ad*7\u00b73m\u00aa\u00df".length();
                        var14_7 = 48;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = x8.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00b5\u00fd\u00ec'\u00aa\u000e\u00c0\u0097\u009fo\u00e4\u00b3\u00b7\b\u00a18\u009dq\u00eb\u00c9\u00c9(\u00b9\u00a0!'\u00cf\u000b\u0018\u00bb\u009fU\u0010\u0090\u00ae\u0093\u00fb\u00bcN\u00921\u00cfa\u0012^\u00f6\u008ab\u00e1";
                            var17_6 = "\u00b5\u00fd\u00ec'\u00aa\u000e\u00c0\u0097\u009fo\u00e4\u00b3\u00b7\b\u00a18\u009dq\u00eb\u00c9\u00c9(\u00b9\u00a0!'\u00cf\u000b\u0018\u00bb\u009fU\u0010\u0090\u00ae\u0093\u00fb\u00bcN\u00921\u00cfa\u0012^\u00f6\u008ab\u00e1".length();
                            var14_7 = 32;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = x8.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                x8.b = var18_3;
                x8.c = new String[5];
                x8.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "a\b6\u00c8#\u00bb\u00a4VR\u00e3\u00bf\u0083\u0014\u008f\u00e2\u009ar\u00126\u00e6\u008ai\u001e\u00dd";
                var5_15 = "a\b6\u00c8#\u00bb\u00a4VR\u00e3\u00bf\u0083\u0014\u008f\u00e2\u009ar\u00126\u00e6\u008ai\u001e\u00dd".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "p\u00c2\u00d4so\u00d4\u00fe\u00a2o\f \u001b=\u0098\u00c6\u00e7";
                    var5_15 = "p\u00c2\u00d4so\u00d4\u00fe\u00a2o\f \u001b=\u0098\u00c6\u00e7".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl104:
                // 1 sources

                ** continue;
            }
        }
        x8.e = var6_12;
        x8.f = new Integer[5];
        x8.X = m44.a("m", (long)-5547669478105772437L, (long)var20);
    }

    x8(int n, h1 h12, to to2, long l) {
        long l2 = (l = a ^ l) ^ 0x4C298D57CE3AL;
        int n2 = (int)(l2 >>> 32);
        int n3 = (int)(l2 << 32 >>> 56);
        int n4 = (int)(l2 << 40 >>> 40);
        super(n, to2);
        int n5 = h12.readUnsignedShort();
        byte[] byArray = new byte[n5];
        h12.read(byArray);
        this.p = cf.k((byte[])byArray, (int)n2, (byte)((byte)n3), (int)n4);
        this.p = this.p.intern();
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1AA;
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
                throw new RuntimeException("com/zelix/x8", exception);
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
            x8.c[n2] = x8.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = x8.b(n, l);
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
            throw new RuntimeException("com/zelix/x8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3D67;
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
                throw new RuntimeException("com/zelix/x8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            x8.f[n2] = n3;
        }
        return f[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = x8.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/x8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(x8.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(x8.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
