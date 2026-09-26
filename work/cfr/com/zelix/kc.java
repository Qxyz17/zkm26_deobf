/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.f8;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.prr;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class kc
extends kw {
    int P;
    byte[] X;
    int I;
    byte[] L;
    int E;
    int U;
    byte[] K;
    int l;
    private static final long a = prr.a(-6337668223326702043L, -3609603210302821346L, MethodHandles.lookup().lookupClass()).a(220766264768005L);
    private static final long[] c;
    private static final Integer[] d;
    private static final Map g;

    int f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("u", (Object)this, (long)1826688913512752848L, (long)l10);
    }

    kc(_4 _42, int n10, String string, long l10, h1 h12, l6q l6q2, l6q l6q3, PrintWriter printWriter, f8 f82) {
        long l11 = (l10 = a ^ l10) ^ 0x5E9360C1DEB1L;
        super(_42, n10, string, l11, h12, l6q2);
        m44.a("q", (Object)this, (int)h12.readUnsignedShort(), (long)-4951705689032103728L, (long)l10);
        m44.a("q", (Object)this, (int)h12.readUnsignedShort(), (long)-5016474107761203343L, (long)l10);
        m44.a("q", (Object)this, (int)h12.readInt(), (long)-6466204842704497271L, (long)l10);
        m44.a("q", (Object)this, (byte[])new byte[m44.a("s", (Object)this, (long)-6466204842704497271L, (long)l10)], (long)-5127378382684940542L, (long)l10);
        h12.read((byte[])m44.a("s", (Object)this, (long)-5127378382684940542L, (long)l10));
        m44.a("q", (Object)this, (int)h12.readUnsignedShort(), (long)-5082601955730530235L, (long)l10);
        m44.a("q", (Object)this, (byte[])new byte[m44.a("s", (Object)this, (long)-5082601955730530235L, (long)l10) * kc.b("e", (int)19275, (long)(0x7851C91206B8BDD5L ^ l10))], (long)-4972307501954811502L, (long)l10);
        h12.read((byte[])m44.a("s", (Object)this, (long)-4972307501954811502L, (long)l10));
        m44.a("q", (Object)this, (int)h12.readUnsignedShort(), (long)-5107160473616464234L, (long)l10);
        int n11 = this.W - kc.b("e", (int)7056, (long)(0x1234F2AAA3DED0FL ^ l10)) - m44.a("s", (Object)this, (long)-6466204842704497271L, (long)l10) - 2 - ((CallSite)m44.a("s", (Object)this, (long)-4972307501954811502L, (long)l10)).length - 2;
        m44.a("q", (Object)this, (byte[])new byte[n11], (long)-6401662552459667640L, (long)l10);
        h12.read((byte[])m44.a("s", (Object)this, (long)-6401662552459667640L, (long)l10));
    }

    int h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("v", (Object)this, (long)-7893749533967922368L, (long)l10);
    }

    @Override
    void z(gu gu2, long l10) {
        long l11 = l10 ^ 0x66FDF08525FDL;
        gu2.K(this.b, this, l11, this.H());
    }

    public int X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("t", (Object)this, (long)-4154801566095338033L, (long)l10);
    }

    byte[] X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("w", (Object)this, (long)-6463858639614703202L, (long)l10);
    }

    public int j(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("t", (Object)this, (long)8036314676536619670L, (long)l10);
    }

    byte[] U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)this, (long)3508275214545715407L, (long)l10);
    }

    byte[] c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("q", (Object)this, (long)-7028785820231328488L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l10 = a ^ 0x25B1F5059263L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00e4#D\u00fd\u00e4\u00fd1\u00fc^\u00a3+\u00d8\u00eb\u00ca\u00c5\u00b8";
        int n11 = "\u00e4#D\u00fd\u00e4\u00fd1\u00fc^\u00a3+\u00d8\u00eb\u00ca\u00c5\u00b8".length();
        int n12 = 0;
        do {
            byte[] byArray3 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n12 < n11);
        c = lArray;
        d = new Integer[2];
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5CE5;
        if (d[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n11];
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
                throw new RuntimeException("com/zelix/kc", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            kc.d[n11] = n12;
        }
        return d[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = kc.b(n10, l10);
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
            throw new RuntimeException("com/zelix/kc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(kc.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

