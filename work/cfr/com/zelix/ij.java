/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.hz;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.oz;
import com.zelix.prr;
import com.zelix.v7;
import java.io.DataOutputStream;
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

public class ij
extends oz {
    int z;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    @Override
    public boolean I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public final boolean T(long l10) {
        return false;
    }

    ij(h1 h12, byte by2, int n10, int n11) {
        long l10 = ((long)by2 << 56 | (long)n10 << 32 >>> 8 | (long)n11 << 40 >>> 40) ^ a;
        super((int)ij.b("y", (int)6346, (long)(0x60CD05F023191DE2L ^ l10)));
        m44.a("u", (Object)this, (int)m44.a("v", (Object)h12, (long)-6173770422921674384L, (long)l10), (long)-5242553030824907490L, (long)l10);
    }

    @Override
    public hz n(hz hz2, boolean bl2, char c10, int n10, boolean bl3, loj loj2, char c11, String string) {
        long l10;
        long l11 = l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)c11 << 48 >>> 48;
        long l12 = l11 ^ 0x5A73015BC1DL;
        long l13 = l11 ^ 0x67D45B4239BAL;
        long l14 = l11 ^ 0x4D53AB9156L;
        v7[] v7Array = hz2.X();
        v7[] v7Array2 = hz2.T();
        int n11 = v7Array.length;
        v7[] v7Array3 = v7.I(n11 + 1, l14);
        System.arraycopy(v7Array, 0, v7Array3, 0, n11);
        v7Array3[n11] = v7.B;
        return new hz(v7Array3, v7Array2, l13, hz2.j(), hz2.k(l12));
    }

    public int J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("r", (Object)this, (long)-4430471189650810717L, (long)l10);
    }

    @Override
    public int T(char c10, int n10, char c11) {
        return 2;
    }

    @Override
    public boolean L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3926A82327E7L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 56);
        int n12 = (int)(l11 << 40 >>> 40);
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n12;
        objectArray2[1] = (int)((byte)n11);
        objectArray2[0] = n10;
        stringBuilder.append((String)((Object)m44.a("s", (Object)this, (Object)objectArray2, (long)-7550383759637692338L, (long)l10)));
        stringBuilder.append((char)ij.b("y", (int)11483, (long)(0x54D0B4AD1419141FL ^ l10)));
        stringBuilder.append((int)m44.a("r", (Object)this, (long)-8443159033597226765L, (long)l10));
        return stringBuilder.toString();
    }

    @Override
    public final boolean Y(long l10, int n10, int n11) {
        return false;
    }

    @Override
    public void h(Object[] objectArray) {
        block4: {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            PrintWriter printWriter;
            block5: {
                long l10 = (Long)objectArray[0];
                printWriter = (PrintWriter)objectArray[1];
                stringBuilder2 = (StringBuilder)objectArray[2];
                long l11 = l10;
                long l12 = l11 ^ 0x5D3C6484BBF6L;
                long l13 = l11 ^ 0x7B7D8DE1E476L;
                long l14 = l11 ^ 0x318FAD45601CL;
                stringBuilder = new StringBuilder((int)ij.b("y", (int)24898, (long)(0x5370AD3D8423998L ^ l10)));
                CallSite callSite = m44.a("h", (long)-1142121718372861931L, (long)l10);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l14;
                stringBuilder.append((String)((Object)m44.a("w", (Object)this, (Object)objectArray2, (long)-1445260621773240695L, (long)l10)));
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = this.X;
                objectArray3[0] = l13;
                CallSite callSite2 = m44.a("h", (Object)objectArray3, (long)-1509257710096725591L, (long)l10);
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = m44.a("h", (int)m44.a("v", (Object)this, (long)-1526739961522687761L, (long)l10), (long)-1207627958331833678L, (long)l10);
                objectArray4[1] = callSite2;
                objectArray4[0] = l12;
                callSite2 = m44.a("h", (Object)objectArray4, (long)-1214410100789358428L, (long)l10);
                try {
                    try {
                        if (callSite != false) break block4;
                        if (((String)((Object)callSite2)).length() <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-716792474683666872L, (long)l10);
                    }
                    stringBuilder.append("\t" + (String)((Object)callSite2));
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-716792474683666872L, (long)l10);
                }
            }
            printWriter.println(stringBuilder2.toString() + stringBuilder2.toString() + stringBuilder);
        }
    }

    @Override
    public boolean d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public void G(short s10, int n10, DataOutputStream dataOutputStream, int n11) {
        long l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
        long l11 = l10 ^ 0L;
        int n12 = (int)(l11 >>> 48);
        int n13 = (int)(l11 << 16 >>> 32);
        int n14 = (int)(l11 << 48 >>> 48);
        super.G((short)n12, n13, dataOutputStream, n14);
        dataOutputStream.writeByte((int)m44.a("s", (Object)this, (long)183229993285654698L, (long)l10));
    }

    public ij(long l10, int n10) {
        l10 = a ^ l10;
        super((int)ij.b("y", (int)27908, (long)(0x5F2422AF7FD02F6L ^ l10)));
        m44.a("u", (Object)this, (int)n10, (long)-2457129019215657018L, (long)l10);
    }

    @Override
    public final boolean v(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        v7 v72 = (v7)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        return false;
    }

    @Override
    public boolean S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public final boolean e(long l10, int n10) {
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ij.a = prr.a(1570983343963676153L, 9055996810387870241L, MethodHandles.lookup().lookupClass()).a(131296161567456L);
                ij.d = new HashMap<K, V>(13);
                var0 = ij.a ^ 91290829076632L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "f\u00fc\u00da\u00ec\u00ab\u007f\u00ce\u009e\u00d8\u0002f\u00ec\u00b3\t\u00b1\u00d5";
                var7_6 = "f\u00fc\u00da\u00ec\u00ab\u007f\u00ce\u009e\u00d8\u0002f\u00ec\u00b3\t\u00b1\u00d5".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00f6\u00ecZ\u0015\u0096\u00b4y\u0017\u00af~vz\u001c]\nB";
                    var7_6 = "\u00f6\u00ecZ\u0015\u0096\u00b4y\u0017\u00af~vz\u001c]\nB".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        ij.b = var8_3;
        ij.c = new Integer[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3E44;
        if (c[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ij", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ij.c[n11] = n12;
        }
        return c[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ij.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ij" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ij.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

