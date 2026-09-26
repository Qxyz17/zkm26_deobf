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

    public String l(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x6B9DB85C7821L;
        int n = (int)(l3 >>> 48);
        int n2 = (int)(l3 << 16 >>> 32);
        int n3 = (int)(l3 << 48 >>> 48);
        long l4 = l2 ^ 0x3926A82327E7L;
        int n4 = (int)(l4 >>> 32);
        int n5 = (int)(l4 << 32 >>> 56);
        int n6 = (int)(l4 << 40 >>> 40);
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n6;
        objectArray2[1] = (int)((byte)n5);
        objectArray2[0] = n4;
        stringBuilder.append((String)((Object)m44.a("s", (Object)((Object)this), (Object)objectArray2, (long)-7550383759637692338L, (long)l)));
        stringBuilder.append((char)ig.c("i", (int)8583, (long)(0xBAF04A0B00D449BL ^ l)));
        stringBuilder.append((String)((Object)m44.a("s", (Object)this.k, (char)((char)n), (int)n2, (short)((short)n3), (long)-7853083534666706113L, (long)l)));
        stringBuilder.append((char)ig.c("i", (int)13084, (long)(0x13ED43234E455601L ^ l)));
        stringBuilder.append((int)m44.a("r", (Object)((Object)this), (long)-7572350059293638322L, (long)l));
        return stringBuilder.toString();
    }

    public int T(char c, int n, char c2) {
        return 4;
    }

    public boolean Y(long l, int n, int n2) {
        boolean bl;
        block5: {
            block6: {
                CallSite callSite = m44.a("k", (long)6173625216586931614L, (long)l);
                try {
                    try {
                        bl = n;
                        Object object = callSite;
                        if (l >= 0L) {
                            if (object != false) break block5;
                            object = n2 - 1;
                        }
                        if (bl < object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)5250459910756699068L, (long)l);
                    }
                    bl = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)5250459910756699068L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean v(Object[] objectArray) {
        boolean bl;
        block5: {
            block6: {
                boolean bl2 = ((Integer)objectArray[0]).intValue();
                v7 v72 = (v7)objectArray[1];
                long l = (Long)objectArray[2];
                int n = (Integer)objectArray[3];
                CallSite callSite = m44.a("j", (long)-4319878175848984624L, (long)l);
                try {
                    try {
                        bl = bl2;
                        Object object = callSite;
                        if (l >= 0L) {
                            if (object == false) break block5;
                            object = n - 1;
                        }
                        if (bl < object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-4130881381298502195L, (long)l);
                    }
                    bl = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-4130881381298502195L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void H(DataOutputStream dataOutputStream, Map map, long l) {
        long l2 = l ^ 0L;
        super.H(dataOutputStream, map, l2);
        dataOutputStream.writeByte((int)m44.a("v", (Object)((Object)this), (long)5601864211733010970L, (long)l));
    }

    public void h(Object[] objectArray) {
        block4: {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            PrintWriter printWriter;
            block5: {
                long l = (Long)objectArray[0];
                printWriter = (PrintWriter)objectArray[1];
                stringBuilder2 = (StringBuilder)objectArray[2];
                long l2 = l;
                long l3 = l2 ^ 0x5D3C6484BBF6L;
                long l4 = l2 ^ 0x7B7D8DE1E476L;
                long l5 = l2 ^ 0x5A121519183DL;
                int n = (int)(l5 >>> 48);
                int n2 = (int)(l5 << 16 >>> 32);
                int n3 = (int)(l5 << 48 >>> 48);
                long l6 = l2 ^ 0x8A9056647FBL;
                int n4 = (int)(l6 >>> 32);
                int n5 = (int)(l6 << 32 >>> 56);
                int n6 = (int)(l6 << 40 >>> 40);
                CallSite callSite = m44.a("h", (long)-1155528826364025814L, (long)l);
                stringBuilder = new StringBuilder((int)ig.c("i", (int)28351, (long)(0x7106AFEAC63AEBBDL ^ l)));
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = n6;
                objectArray2[1] = (int)((byte)n5);
                objectArray2[0] = n4;
                CallSite callSite2 = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-636251684499120046L, (long)l);
                stringBuilder.append((String)((Object)callSite2) + " " + this.k.E() + " " + (int)m44.a("v", (Object)((Object)this), (long)-651427438997249710L, (long)l));
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = this.X;
                objectArray3[0] = l4;
                CallSite callSite3 = m44.a("h", (Object)objectArray3, (long)-1509257710096725591L, (long)l);
                CallSite callSite4 = callSite;
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = m44.a("w", (Object)this.k, (char)((char)n), (int)n2, (short)((short)n3), (long)-929976081543482589L, (long)l);
                objectArray4[1] = callSite3;
                objectArray4[0] = l3;
                callSite3 = m44.a("h", (Object)objectArray4, (long)-1214410100789358428L, (long)l);
                Object[] objectArray5 = new Object[3];
                objectArray5[2] = m44.a("h", (int)m44.a("v", (Object)((Object)this), (long)-651427438997249710L, (long)l), (long)-1207627958331833678L, (long)l);
                objectArray5[1] = callSite3;
                objectArray5[0] = l3;
                callSite3 = m44.a("h", (Object)objectArray5, (long)-1214410100789358428L, (long)l);
                try {
                    try {
                        if (callSite4 == false) break block4;
                        if (((String)((Object)callSite3)).length() <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-1344851921672098249L, (long)l);
                    }
                    stringBuilder.append("\t" + (String)((Object)callSite3));
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-1344851921672098249L, (long)l);
                }
            }
            printWriter.println(stringBuilder2.toString() + stringBuilder2.toString() + stringBuilder);
        }
    }

    ig(h1 h12, hp hp2, l6q l6q2, long l, l6q l6q3, l6q l6q4, l6q l6q5, l6q l6q6) {
        long l2 = (l = a ^ l) ^ 0x4046BF87C01AL;
        super((int)ig.c("i", (int)12028, (long)(0x37D92077739C6487L ^ l)), h12, hp2, l2, l6q2, l6q3, l6q4, l6q5, l6q6);
        m44.a("t", (Object)((Object)this), (int)h12.read(), (long)-5076145462014431702L, (long)l);
    }

    public hz n(hz hz2, boolean bl, char c, int n, boolean bl2, loj loj2, char c2, String string) {
        long l;
        long l2 = l = (long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48;
        long l3 = l2 ^ 0x5A73015BC1DL;
        long l4 = l2 ^ 0x67D45B4239BAL;
        long l5 = l2 ^ 0x4D53AB9156L;
        long l6 = l2 ^ 0x5CB84099E42BL;
        int n2 = (int)(l6 >>> 56);
        int n3 = (int)(l6 << 8 >>> 32);
        int n4 = (int)(l6 << 40 >>> 40);
        long l7 = l2 ^ 0x3C9A175ECDB5L;
        v7[] v7Array = hz2.X();
        v7[] v7Array2 = hz2.T();
        int n5 = v7Array.length;
        v7[] v7Array3 = v7.I((int)(n5 - m44.a("r", (Object)((Object)this), (long)-2697154176992326346L, (long)l) + 1), (long)l5);
        int n6 = v7Array3.length;
        System.arraycopy(v7Array, 0, v7Array3, 0, n6 - 1);
        jf jf2 = (jf)this.k;
        String string2 = jf2.h(l7);
        v7Array3[n6 - 1] = v7.M((byte)((byte)n2), (int)n3, (int)n4, (String)string2);
        return new hz(v7Array3, v7Array2, l4, hz2.j(), hz2.k(l3));
    }

    public void G(short s, int n, DataOutputStream dataOutputStream, int n2) {
        long l = (long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48;
        long l2 = l ^ 0L;
        int n3 = (int)(l2 >>> 48);
        int n4 = (int)(l2 << 16 >>> 32);
        int n5 = (int)(l2 << 48 >>> 48);
        super.G((short)n3, n4, dataOutputStream, n5);
        dataOutputStream.writeByte((int)m44.a("s", (Object)((Object)this), (long)2211463814104647959L, (long)l));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ig.a = prr.a((long)9022966993366451950L, (long)9202538121336802945L, MethodHandles.lookup().lookupClass()).a(272781277159717L);
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

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x639E;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])u.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    u.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ig.i[n2] = n3;
        }
        return i[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ig.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
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
