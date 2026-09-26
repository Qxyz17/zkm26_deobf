/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.hp;
import com.zelix.hz;
import com.zelix.i_;
import com.zelix.jf;
import com.zelix.l6q;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.n9;
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

public class ig
extends i_ {
    private int h;
    private static final long a;
    private static final long[] c;
    private static final Integer[] i;
    private static final Map u;

    @Override
    public String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10;
        long l12 = l11 ^ 0x6B9DB85C7821L;
        int n10 = (int)(l12 >>> 48);
        int n11 = (int)(l12 << 16 >>> 32);
        int n12 = (int)(l12 << 48 >>> 48);
        long l13 = l11 ^ 0x3926A82327E7L;
        int n13 = (int)(l13 >>> 32);
        int n14 = (int)(l13 << 32 >>> 56);
        int n15 = (int)(l13 << 40 >>> 40);
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n15;
        objectArray2[1] = (int)((byte)n14);
        objectArray2[0] = n13;
        stringBuilder.append((String)((Object)m44.a("s", (Object)this, (Object)objectArray2, (long)-7550383759637692338L, (long)l10)));
        stringBuilder.append((char)ig.c("i", (int)8583, (long)(0xBAF04A0B00D449BL ^ l10)));
        stringBuilder.append((String)((Object)m44.a("s", (Object)this.k, (char)((char)n10), (int)n11, (short)((short)n12), (long)-7853083534666706113L, (long)l10)));
        stringBuilder.append((char)ig.c("i", (int)13084, (long)(0x13ED43234E455601L ^ l10)));
        stringBuilder.append((int)m44.a("r", (Object)this, (long)-7572350059293638322L, (long)l10));
        return stringBuilder.toString();
    }

    @Override
    public int T(char c10, int n10, char c11) {
        return 4;
    }

    @Override
    public boolean Y(long l10, int n10, int n11) {
        boolean bl2;
        block5: {
            block6: {
                CallSite callSite = m44.a("k", (long)6173625216586931614L, (long)l10);
                try {
                    try {
                        bl2 = n10;
                        Object object = callSite;
                        if (l10 >= 0L) {
                            if (object != false) break block5;
                            object = n11 - 1;
                        }
                        if (bl2 < object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)5250459910756699068L, (long)l10);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)5250459910756699068L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public boolean v(Object[] objectArray) {
        boolean bl2;
        block5: {
            block6: {
                boolean bl3 = ((Integer)objectArray[0]).intValue();
                v7 v72 = (v7)objectArray[1];
                long l10 = (Long)objectArray[2];
                int n10 = (Integer)objectArray[3];
                CallSite callSite = m44.a("j", (long)-4319878175848984624L, (long)l10);
                try {
                    try {
                        bl2 = bl3;
                        Object object = callSite;
                        if (l10 >= 0L) {
                            if (object == false) break block5;
                            object = n10 - 1;
                        }
                        if (bl2 < object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-4130881381298502195L, (long)l10);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-4130881381298502195L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void H(DataOutputStream dataOutputStream, Map map, long l10) {
        long l11 = l10 ^ 0L;
        super.H(dataOutputStream, map, l11);
        dataOutputStream.writeByte((int)m44.a("v", (Object)this, (long)5601864211733010970L, (long)l10));
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
                long l14 = l11 ^ 0x5A121519183DL;
                int n10 = (int)(l14 >>> 48);
                int n11 = (int)(l14 << 16 >>> 32);
                int n12 = (int)(l14 << 48 >>> 48);
                long l15 = l11 ^ 0x8A9056647FBL;
                int n13 = (int)(l15 >>> 32);
                int n14 = (int)(l15 << 32 >>> 56);
                int n15 = (int)(l15 << 40 >>> 40);
                CallSite callSite = m44.a("h", (long)-1155528826364025814L, (long)l10);
                stringBuilder = new StringBuilder((int)ig.c("i", (int)28351, (long)(0x7106AFEAC63AEBBDL ^ l10)));
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = n15;
                objectArray2[1] = (int)((byte)n14);
                objectArray2[0] = n13;
                CallSite callSite2 = m44.a("w", (Object)this, (Object)objectArray2, (long)-636251684499120046L, (long)l10);
                stringBuilder.append((String)((Object)callSite2) + " " + this.k.E() + " " + (int)m44.a("v", (Object)this, (long)-651427438997249710L, (long)l10));
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = this.X;
                objectArray3[0] = l13;
                CallSite callSite3 = m44.a("h", (Object)objectArray3, (long)-1509257710096725591L, (long)l10);
                CallSite callSite4 = callSite;
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = m44.a("w", (Object)this.k, (char)((char)n10), (int)n11, (short)((short)n12), (long)-929976081543482589L, (long)l10);
                objectArray4[1] = callSite3;
                objectArray4[0] = l12;
                callSite3 = m44.a("h", (Object)objectArray4, (long)-1214410100789358428L, (long)l10);
                Object[] objectArray5 = new Object[3];
                objectArray5[2] = m44.a("h", (int)m44.a("v", (Object)this, (long)-651427438997249710L, (long)l10), (long)-1207627958331833678L, (long)l10);
                objectArray5[1] = callSite3;
                objectArray5[0] = l12;
                callSite3 = m44.a("h", (Object)objectArray5, (long)-1214410100789358428L, (long)l10);
                try {
                    try {
                        if (callSite4 == false) break block4;
                        if (((String)((Object)callSite3)).length() <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-1344851921672098249L, (long)l10);
                    }
                    stringBuilder.append("\t" + (String)((Object)callSite3));
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-1344851921672098249L, (long)l10);
                }
            }
            printWriter.println(stringBuilder2.toString() + stringBuilder2.toString() + stringBuilder);
        }
    }

    ig(h1 h12, hp hp2, l6q l6q2, long l10, l6q l6q3, l6q l6q4, l6q l6q5, l6q l6q6) {
        long l11 = (l10 = a ^ l10) ^ 0x4046BF87C01AL;
        super((int)ig.c("i", (int)12028, (long)(0x37D92077739C6487L ^ l10)), h12, hp2, l11, l6q2, l6q3, l6q4, l6q5, l6q6);
        m44.a("t", (Object)this, (int)h12.read(), (long)-5076145462014431702L, (long)l10);
    }

    @Override
    public hz n(hz hz2, boolean bl2, char c10, int n10, boolean bl3, loj loj2, char c11, String string) {
        long l10;
        long l11 = l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)c11 << 48 >>> 48;
        long l12 = l11 ^ 0x5A73015BC1DL;
        long l13 = l11 ^ 0x67D45B4239BAL;
        long l14 = l11 ^ 0x4D53AB9156L;
        long l15 = l11 ^ 0x5CB84099E42BL;
        int n11 = (int)(l15 >>> 56);
        int n12 = (int)(l15 << 8 >>> 32);
        int n13 = (int)(l15 << 40 >>> 40);
        long l16 = l11 ^ 0x3C9A175ECDB5L;
        v7[] v7Array = hz2.X();
        v7[] v7Array2 = hz2.T();
        int n14 = v7Array.length;
        v7[] v7Array3 = v7.I(n14 - m44.a("r", (Object)this, (long)-2697154176992326346L, (long)l10) + 1, l14);
        int n15 = v7Array3.length;
        System.arraycopy(v7Array, 0, v7Array3, 0, n15 - 1);
        jf jf2 = (jf)this.k;
        String string2 = jf2.h(l16);
        v7Array3[n15 - 1] = v7.M((byte)n11, n12, n13, string2);
        return new hz(v7Array3, v7Array2, l13, hz2.j(), hz2.k(l12));
    }

    @Override
    public void G(short s10, int n10, DataOutputStream dataOutputStream, int n11) {
        long l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
        long l11 = l10 ^ 0L;
        int n12 = (int)(l11 >>> 48);
        int n13 = (int)(l11 << 16 >>> 32);
        int n14 = (int)(l11 << 48 >>> 48);
        super.G((short)n12, n13, dataOutputStream, n14);
        dataOutputStream.writeByte((int)m44.a("s", (Object)this, (long)2211463814104647959L, (long)l10));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ig.a = prr.a(9022966993366451950L, 9202538121336802945L, MethodHandles.lookup().lookupClass()).a(272781277159717L);
                ig.u = new HashMap<K, V>(13);
                var0 = ig.a ^ 36325821789835L;
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
                var6_5 = "\u00ecT\u0091\u00c5!\u0091-\u00b4/JA\u00fc\u00b6gQ\u008a";
                var7_6 = "\u00ecT\u0091\u00c5!\u0091-\u00b4/JA\u00fc\u00b6gQ\u008a".length();
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
                    var6_5 = "rmI\u00f1\u0004\u00fc\u00fd\u0011lJ\u00d0*}BV\u009f";
                    var7_6 = "rmI\u00f1\u0004\u00fc\u00fd\u0011lJ\u00d0*}BV\u009f".length();
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
        ig.c = var8_3;
        ig.i = new Integer[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x639E;
        if (i[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])u.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    u.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ig", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ig.i[n11] = n12;
        }
        return i[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ig.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ig" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ig.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

