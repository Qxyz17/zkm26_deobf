/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.aw;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.lkh;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import com.zelix.x8;
import com.zelix.xt;
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

public class xh
extends js
implements lkh {
    static final va K;
    int e;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public js i(l6q l6q2, l6q l6q3, l6q l6q4, l6q l6q5, long l, PrintWriter printWriter) {
        long l2 = l;
        long l3 = l2 ^ 0x330C83A99E71L;
        int n = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 40);
        int n3 = (int)(l3 << 56 >>> 56);
        long l4 = l2 ^ 0x4D3EB9EBAF7DL;
        long l5 = l2 ^ 0x7DAED87697D7L;
        long l6 = l2 ^ 0x7231103C1230L;
        long l7 = l2 ^ 0x3F5CD60287A2L;
        try {
            js js2 = this.l.m(l6, (int)m44.a("v", (Object)((Object)this), (long)278306873826984222L, (long)l));
            if (js2 instanceof x8) {
                xt xt2 = new xt(this, (x8)js2, l6q2, l5);
                return xt2;
            }
            Object[] objectArray = new Object[3];
            objectArray[2] = (int)((byte)n3);
            objectArray[1] = n2;
            objectArray[0] = n;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l7;
            objectArray2[0] = m44.a("w", (Object)((Object)this), (long)l4, (long)1953651397748351726L, (long)l);
            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)xh.b("n", (int)21981, (long)(0x14DAB829F25B0505L ^ l))) + (String)((Object)xh.b("n", (int)16569, (long)(0x306B5B56DC021063L ^ l))) + (String)((Object)xh.b("n", (int)8267, (long)(0x5C5C1E1BE1107090L ^ l))) + (int)m44.a("v", (Object)((Object)this), (long)278306873826984222L, (long)l) + (String)((Object)xh.b("n", (int)8267, (long)(0x5C5C1E1BE1107090L ^ l))) + (String)((Object)m44.a("h", (Object)objectArray2, (long)2174414554445932441L, (long)l)) + (String)((Object)xh.b("n", (int)5648, (long)(0x11ABEF310C18C6CEL ^ l)));
            throw new aw(string);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            Object[] objectArray = new Object[3];
            objectArray[2] = (int)((byte)n3);
            objectArray[1] = n2;
            objectArray[0] = n;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l7;
            objectArray3[0] = m44.a("w", (Object)((Object)this), (long)l4, (long)1953651397748351726L, (long)l);
            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)xh.b("n", (int)8267, (long)(0x5C5C1E1BE1107090L ^ l))) + (String)((Object)xh.b("n", (int)6235, (long)(0x4DCFB86968B54882L ^ l))) + (String)((Object)xh.b("n", (int)8267, (long)(0x5C5C1E1BE1107090L ^ l))) + (String)((Object)m44.a("w", (Object)arrayIndexOutOfBoundsException, (long)2026021970840546810L, (long)l)) + (String)((Object)xh.b("n", (int)8267, (long)(0x5C5C1E1BE1107090L ^ l))) + (String)((Object)m44.a("h", (Object)objectArray3, (long)2174414554445932441L, (long)l)) + (String)((Object)xh.b("n", (int)3914, (long)(0x2F81AC4D5B8CDF95L ^ l)));
            throw new aw(string);
        }
    }

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-105891284836303786L, (long)l).g());
        dataOutputStream.writeShort((int)m44.a("w", (Object)((Object)this), (long)-1876422755515685065L, (long)l));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                xh.a = prr.a((long)812487088854573598L, (long)-5311556359473819790L, MethodHandles.lookup().lookupClass()).a(125208606060513L);
                var9 = xh.a ^ 79540309748868L;
                xh.d = new HashMap<K, V>(13);
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
                var7_3 = new String[6];
                var5_4 = 0;
                var4_5 = "|\u00bepx\u00b9T\u00b2=n\u00cb$!\u00db]\u00f1\u00ef@\u001e\u009e;e9\u00e1\u00b5\u00a6Y\u0015\u00a0\u009a\u00b6\u00c4\u0005aj\u00cc\u00ae\u00b9a\u001dK\u00fa\u00f3\u00a7M\u0081\u00d6\u0082\u009e\u00fc\u009cI\u009aAo\u00d1\u0002\u0002\u0002\u008e~\u00cc\u00f0/\u00aa\u00c7\"\u0010\u00f2B@\u00ac'x_\u00a2\u00ea(r\u0085\r\u00a4@Wd\u008blkS\u0085\u00a9\u00b1\u00b6\u00e2\u0011b\u00cf\u00f9n\u00112\u00fd#\u009c9;\u00d8(D\u00aa\u00d3\u0006\u0088\u00d6\u00eb\u0088\u00e7~}\u00d6.\u0003\u009b\u00bdX\u00d6z\u0086c\u0087J\u001b8\u00a9\u00cc\tr\u000b\u0083\u00ee\u00bd)5\u0097l\u00cc]\u00101fp\u00d9\u00bf\u00ef+\u00ab\u0090\u00d0\u00c0>\u00d3O\u00b4,";
                var6_6 = "|\u00bepx\u00b9T\u00b2=n\u00cb$!\u00db]\u00f1\u00ef@\u001e\u009e;e9\u00e1\u00b5\u00a6Y\u0015\u00a0\u009a\u00b6\u00c4\u0005aj\u00cc\u00ae\u00b9a\u001dK\u00fa\u00f3\u00a7M\u0081\u00d6\u0082\u009e\u00fc\u009cI\u009aAo\u00d1\u0002\u0002\u0002\u008e~\u00cc\u00f0/\u00aa\u00c7\"\u0010\u00f2B@\u00ac'x_\u00a2\u00ea(r\u0085\r\u00a4@Wd\u008blkS\u0085\u00a9\u00b1\u00b6\u00e2\u0011b\u00cf\u00f9n\u00112\u00fd#\u009c9;\u00d8(D\u00aa\u00d3\u0006\u0088\u00d6\u00eb\u0088\u00e7~}\u00d6.\u0003\u009b\u00bdX\u00d6z\u0086c\u0087J\u001b8\u00a9\u00cc\tr\u000b\u0083\u00ee\u00bd)5\u0097l\u00cc]\u00101fp\u00d9\u00bf\u00ef+\u00ab\u0090\u00d0\u00c0>\u00d3O\u00b4,".length();
                var3_7 = 16;
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
                    var7_3[var5_4++] = xh.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00d2\u00c5[\u0002S\u008e\u00f0p\u0006\u00ccK\t\u0004\u00a94\u00ef\u0010\u00daD\"i\u00da\u0097 M\u00fc\u00b0F\u00b7?\\\u007f\u00e5";
                    var6_6 = "\u00d2\u00c5[\u0002S\u008e\u00f0p\u0006\u00ccK\t\u0004\u00a94\u00ef\u0010\u00daD\"i\u00da\u0097 M\u00fc\u00b0F\u00b7?\\\u007f\u00e5".length();
                    var3_7 = 16;
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
                    var7_3[var5_4++] = xh.b(var8_9).intern();
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
        xh.b = var7_3;
        xh.c = new String[6];
        xh.K = m44.a("k", (long)-4690572698789940654L, (long)var9);
    }

    public boolean G() {
        return true;
    }

    public va A(long l) {
        return m44.a("i", (long)-5200632258789575422L, (long)l);
    }

    xh(int n, h1 h12, long l, to to2) {
        l = a ^ l;
        super(n, to2);
        m44.a("s", (Object)((Object)this), (int)h12.readUnsignedShort(), (long)1861035747743816465L, (long)l);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5AA4;
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
                throw new RuntimeException("com/zelix/xh", exception);
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
            xh.c[n2] = xh.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xh.b(n, l);
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
            throw new RuntimeException("com/zelix/xh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
