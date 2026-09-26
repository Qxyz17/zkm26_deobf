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
import com.zelix.x6;
import com.zelix.x8;
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

public class x5
extends js
implements lkh {
    static final va i;
    int g;
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
        long l5 = l2 ^ 0x7231103C1230L;
        long l6 = l2 ^ 0x3F5CD60287A2L;
        long l7 = l2 ^ 0x1EA0FD34170DL;
        try {
            js js2 = this.l.m(l5, (int)m44.a("v", (Object)((Object)this), (long)2204212166948358983L, (long)l));
            if (js2 instanceof x8) {
                x6 x62 = new x6(this, l7, (x8)js2, l6q2);
                return x62;
            }
            Object[] objectArray = new Object[3];
            objectArray[2] = (int)((byte)n3);
            objectArray[1] = n2;
            objectArray[0] = n;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l6;
            objectArray2[0] = m44.a("w", (Object)((Object)this), (long)l4, (long)1931529790554306209L, (long)l);
            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)x5.b("j", (int)20056, (long)(0x70C8D9395CCED162L ^ l))) + (String)((Object)x5.b("j", (int)14501, (long)(0x36B0EFF58481279AL ^ l))) + (String)((Object)x5.b("j", (int)11404, (long)(0x6C391D862F5B3B5L ^ l))) + (int)m44.a("v", (Object)((Object)this), (long)2204212166948358983L, (long)l) + (String)((Object)x5.b("j", (int)11404, (long)(0x6C391D862F5B3B5L ^ l))) + (String)((Object)m44.a("h", (Object)objectArray2, (long)2174414554445932441L, (long)l)) + (String)((Object)x5.b("j", (int)1020, (long)(0x68084D31CF389CC4L ^ l)));
            throw new aw(string);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            Object[] objectArray = new Object[3];
            objectArray[2] = (int)((byte)n3);
            objectArray[1] = n2;
            objectArray[0] = n;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l6;
            objectArray3[0] = m44.a("w", (Object)((Object)this), (long)l4, (long)1931529790554306209L, (long)l);
            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)x5.b("j", (int)11404, (long)(0x6C391D862F5B3B5L ^ l))) + (String)((Object)x5.b("j", (int)24078, (long)(0x76CBB3420D25C130L ^ l))) + (String)((Object)x5.b("j", (int)11404, (long)(0x6C391D862F5B3B5L ^ l))) + (String)((Object)m44.a("w", (Object)arrayIndexOutOfBoundsException, (long)2026021970840546810L, (long)l)) + (String)((Object)x5.b("j", (int)11404, (long)(0x6C391D862F5B3B5L ^ l))) + (String)((Object)m44.a("h", (Object)objectArray3, (long)2174414554445932441L, (long)l)) + (String)((Object)x5.b("j", (int)12564, (long)(0x620BB744FBC9AE2FL ^ l)));
            throw new aw(string);
        }
    }

    x5(int n, long l, h1 h12, to to2) {
        l = a ^ l;
        super(n, to2);
        m44.a("v", (Object)((Object)this), (int)h12.readUnsignedShort(), (long)1446995279975809477L, (long)l);
    }

    public boolean G() {
        return true;
    }

    public va A(long l) {
        return m44.a("i", (long)-5638386883876356298L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                x5.a = prr.a((long)4279891732410504425L, (long)-8369926091564442239L, MethodHandles.lookup().lookupClass()).a(2459302149637L);
                var9 = x5.a ^ 88454409637947L;
                x5.d = new HashMap<K, V>(13);
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
                var4_5 = "7\u00a8B1\u0083\u00b0\u00e3$\u008e\b\u0087z;:1\u000e\u0010\u00ca\u00b9\u001a!\u0014j\u00cf\u00c1\u00b9\u0097\u0086R\u00e3\u00dbM\u00fa\u0010\u00fe\u0090\u00ea\u00day*\u00cf\u00cb\n\u008fUAo\u00d6\u00f1u\u00104\u00ed\u0019h\u0003(\u00de}}\u00f0 \u00cb\u0081V\u00c6T";
                var6_6 = "7\u00a8B1\u0083\u00b0\u00e3$\u008e\b\u0087z;:1\u000e\u0010\u00ca\u00b9\u001a!\u0014j\u00cf\u00c1\u00b9\u0097\u0086R\u00e3\u00dbM\u00fa\u0010\u00fe\u0090\u00ea\u00day*\u00cf\u00cb\n\u008fUAo\u00d6\u00f1u\u00104\u00ed\u0019h\u0003(\u00de}}\u00f0 \u00cb\u0081V\u00c6T".length();
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
                    var7_3[var5_4++] = x5.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u0013\u00e1I\u00f2oX\u0080g.F\u0083\u00fba\u00bf\u001e\u0083S\u00f6\u00b9}\u00cd\u00e9\u001c\u000e\u0086=\u00cd%5^F\u00aa\u00b1\u00ef\u00f8/\u008a\u00b8\u008cL\u00d6\u00d9p\u00bbx\u0006\u001b\u008fx\u00a7\u00df\u00d9:\u0085\u00b9D\u00cbah\u00fd\u0083\u00c3t\u00a9@\u00c0g\u00b7\u00d1.\u009c\u00adOcu\u00b2\u00e9\u008a\u001e\u00a7.\u0013\u00f1\u00d7\u008e\u000f\u00ae\u00d2\n*\u00fdV0.T]\u009eG9\u001c9\u00f2\u00c0\u0095\u0093\u00f4*\u00aa\u00dd\u001c{Z\u0095\u00f7n\u00b4\u00da\u009b\u00ef\u00c9\u0002ha_\u00bbf\u0093\u00f7\u0094";
                    var6_6 = "\u0013\u00e1I\u00f2oX\u0080g.F\u0083\u00fba\u00bf\u001e\u0083S\u00f6\u00b9}\u00cd\u00e9\u001c\u000e\u0086=\u00cd%5^F\u00aa\u00b1\u00ef\u00f8/\u008a\u00b8\u008cL\u00d6\u00d9p\u00bbx\u0006\u001b\u008fx\u00a7\u00df\u00d9:\u0085\u00b9D\u00cbah\u00fd\u0083\u00c3t\u00a9@\u00c0g\u00b7\u00d1.\u009c\u00adOcu\u00b2\u00e9\u008a\u001e\u00a7.\u0013\u00f1\u00d7\u008e\u000f\u00ae\u00d2\n*\u00fdV0.T]\u009eG9\u001c9\u00f2\u00c0\u0095\u0093\u00f4*\u00aa\u00dd\u001c{Z\u0095\u00f7n\u00b4\u00da\u009b\u00ef\u00c9\u0002ha_\u00bbf\u0093\u00f7\u0094".length();
                    var3_7 = 64;
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
                    var7_3[var5_4++] = x5.b(var8_9).intern();
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
        x5.b = var7_3;
        x5.c = new String[6];
        x5.i = m44.a("i", (long)4360532252080454723L, (long)var9);
    }

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-534795942134630814L, (long)l).g());
        dataOutputStream.writeShort((int)m44.a("w", (Object)((Object)this), (long)-522476264338231954L, (long)l));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1544;
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
                throw new RuntimeException("com/zelix/x5", exception);
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
            x5.c[n2] = x5.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = x5.b(n, l);
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
            throw new RuntimeException("com/zelix/x5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(x5.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
