/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.aw;
import com.zelix.h1;
import com.zelix.j0;
import com.zelix.jd;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import com.zelix.xb;
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

public class j4
extends j0 {
    static final va W;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public js i(l6q l6q2, l6q l6q3, l6q l6q4, l6q l6q5, long l, PrintWriter printWriter) {
        long l2 = l ^ 0x33A78480DC98L;
        Object[] objectArray = new Object[6];
        objectArray[5] = printWriter;
        objectArray[4] = l6q5;
        objectArray[3] = l2;
        objectArray[2] = l6q4;
        objectArray[1] = l6q3;
        objectArray[0] = l6q2;
        return m44.a("w", (Object)((Object)this), (Object)objectArray, (long)2226957953742415902L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                j4.a = prr.a((long)3481296878419504782L, (long)8202527180560537422L, MethodHandles.lookup().lookupClass()).a(186809700186616L);
                var9 = j4.a ^ 36984032170976L;
                j4.d = new HashMap<K, V>(13);
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
                var4_5 = "\u00baHf#\u0012w\u00f831\u00e4\u00f5\u0093\u00a4-J\u00e2&\u00a4/\u00ce\u0007\u0007$\u0092\u00c6~\u00b6m\u009d\u0097\u00ca/\u00e3\u001e\u00f0\u0016\u00d5\u0000\u009a\u001c\u00dd\u008f\u00d3i\u009bbWD#b\u00a1\u00f0r\u00cb\u00bak\u00a3\u0013\u00b5S\u00bbu\u00e6\u0095P?\u00b5@\u0015e\"%y\"#\u00e4\nf=n\u00f7\u0013\u0018\u00b4\u00e6}\u008e\u00a9\u0086\u00cf ]\u0087\u00b0\u0098\u0085i\u00b9\u0091\u009dMS\u00f7\u0011p\u001dT\u001d\u0007\u00e8\u00a6\u00e6P\u0017v_D\u00f8='A5\u009ah@\u00a9\u0085hB\u00b8\u00ae-\u00d4\u00baB\u0005\u00a0\u001eG\u00f58\u0013\u00063\u00e2\u0010\u001e\u0013@\u00eaK\u00f9t;`K\r\u009f\u0001\u00f8L\u00a7\u0010\u00f0\u00e8P\u00f9.\u00df\u00f7>\u008a\u00d8.\u0089\u001f\u00ef\u00a4\u00bb";
                var6_6 = "\u00baHf#\u0012w\u00f831\u00e4\u00f5\u0093\u00a4-J\u00e2&\u00a4/\u00ce\u0007\u0007$\u0092\u00c6~\u00b6m\u009d\u0097\u00ca/\u00e3\u001e\u00f0\u0016\u00d5\u0000\u009a\u001c\u00dd\u008f\u00d3i\u009bbWD#b\u00a1\u00f0r\u00cb\u00bak\u00a3\u0013\u00b5S\u00bbu\u00e6\u0095P?\u00b5@\u0015e\"%y\"#\u00e4\nf=n\u00f7\u0013\u0018\u00b4\u00e6}\u008e\u00a9\u0086\u00cf ]\u0087\u00b0\u0098\u0085i\u00b9\u0091\u009dMS\u00f7\u0011p\u001dT\u001d\u0007\u00e8\u00a6\u00e6P\u0017v_D\u00f8='A5\u009ah@\u00a9\u0085hB\u00b8\u00ae-\u00d4\u00baB\u0005\u00a0\u001eG\u00f58\u0013\u00063\u00e2\u0010\u001e\u0013@\u00eaK\u00f9t;`K\r\u009f\u0001\u00f8L\u00a7\u0010\u00f0\u00e8P\u00f9.\u00df\u00f7>\u008a\u00d8.\u0089\u001f\u00ef\u00a4\u00bb".length();
                var3_7 = 64;
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
                    var7_3[var5_4++] = j4.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00f6Jb\u00fd\u0092\u00db\u0003\u009a\u009f|2h\u0087p\u0084\u00f7\u008c\u001e\u00c3$\u00ec\u00f1\u00f4Z=\u00a7H5@:\u0089R\u0010\u00ed\u00a2\u0000XY\u00d4\u00d0\u00b4\u0086L\u00f2\u00bf\u00b8}\u00d8)";
                    var6_6 = "\u00f6Jb\u00fd\u0092\u00db\u0003\u009a\u009f|2h\u0087p\u0084\u00f7\u008c\u001e\u00c3$\u00ec\u00f1\u00f4Z=\u00a7H5@:\u0089R\u0010\u00ed\u00a2\u0000XY\u00d4\u00d0\u00b4\u0086L\u00f2\u00bf\u00b8}\u00d8)".length();
                    var3_7 = 32;
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
                    var7_3[var5_4++] = j4.b(var8_9).intern();
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
        j4.b = var7_3;
        j4.c = new String[6];
        j4.W = m44.a("j", (long)4004307793706510815L, (long)var9);
    }

    public j4(int n, h1 h12, to to2) {
        super(n, h12, to2);
    }

    public jd H(Object[] objectArray) {
        l6q l6q2 = (l6q)objectArray[0];
        l6q l6q3 = (l6q)objectArray[1];
        l6q l6q4 = (l6q)objectArray[2];
        long l = (Long)objectArray[3];
        l6q l6q5 = (l6q)objectArray[4];
        PrintWriter printWriter = (PrintWriter)objectArray[5];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x688C3E9078D9L;
        long l4 = l2 ^ 0x6114FB140574L;
        int n = (int)(l4 >>> 56);
        long l5 = l4 << 8 >>> 8;
        long l6 = l2 ^ 0x57839747C594L;
        long l7 = l2 ^ 0x7516A6223497L;
        int n2 = (int)(l7 >>> 48);
        int n3 = (int)(l7 << 16 >>> 48);
        int n4 = (int)(l7 << 32 >>> 32);
        long l8 = l2 ^ 0x25E1F8AEED4BL;
        long l9 = l2 ^ 0x57839747C594L;
        long l10 = l2 ^ 0x8DA94D21D9EL;
        CallSite callSite = m44.a("i", (long)8371528349560607433L, (long)l);
        try {
            jd jd2;
            block10: {
                l6q l6q6;
                js js2;
                block9: {
                    boolean bl;
                    block7: {
                        block8: {
                            js2 = this.l.m(l3, (int)m44.a("w", (Object)((Object)this), (long)7861194534351862891L, (long)l));
                            try {
                                bl = js2.G();
                                if (callSite != false) break block7;
                                if (!bl) break block8;
                            }
                            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                throw m44.a("i", (Object)arrayIndexOutOfBoundsException, (long)7741223057766607110L, (long)l);
                            }
                            return null;
                        }
                        bl = js2 instanceof xb;
                    }
                    if (!bl) {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l8;
                        objectArray2[0] = js2.A(l6);
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l8;
                        objectArray3[0] = m44.a("v", (Object)((Object)this), (long)l9, (long)8353690062424477277L, (long)l);
                        String string = this.l.I((byte)n, l5) + (String)((Object)j4.b("h", (int)17782, (long)(0x46931215F528E6FFL ^ l))) + (String)((Object)j4.b("h", (int)30544, (long)(0x19CB8DD8CAC1D4DAL ^ l))) + (String)((Object)j4.b("h", (int)27591, (long)(0x7C812A1179EA484FL ^ l))) + (int)m44.a("w", (Object)((Object)this), (long)7861194534351862891L, (long)l) + (String)((Object)j4.b("h", (int)27591, (long)(0x7C812A1179EA484FL ^ l))) + (String)((Object)m44.a("i", (Object)objectArray2, (long)8413859046462590320L, (long)l)) + (String)((Object)j4.b("h", (int)27591, (long)(0x7C812A1179EA484FL ^ l))) + (String)((Object)m44.a("i", (Object)objectArray3, (long)8413859046462590320L, (long)l)) + (String)((Object)j4.b("h", (int)15917, (long)(0x7EDC24D42701DA2L ^ l))) + this.E();
                        throw new aw(string);
                    }
                    jd2 = new jd(this.E(), this.l, (char)n2, (int)m44.a("w", (Object)((Object)this), (long)7735682787058383371L, (long)l), (short)n3, (xb)js2, n4);
                    try {
                        l6q6 = l6q3;
                        if (callSite != false) break block9;
                        if (l6q6 == null) break block10;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw m44.a("i", (Object)arrayIndexOutOfBoundsException, (long)7741223057766607110L, (long)l);
                    }
                    l6q6 = l6q3;
                }
                l6q6.t((Object)((xb)js2), (Object)jd2, l10);
            }
            return jd2;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l8;
            objectArray4[0] = m44.a("v", (Object)((Object)this), (long)l9, (long)8353690062424477277L, (long)l);
            String string = this.l.I((byte)n, l5) + (String)((Object)j4.b("h", (int)27591, (long)(0x7C812A1179EA484FL ^ l))) + (String)((Object)j4.b("h", (int)3052, (long)(0x1AF3ECB3B1D4A867L ^ l))) + (String)((Object)j4.b("h", (int)27591, (long)(0x7C812A1179EA484FL ^ l))) + (String)((Object)m44.a("v", (Object)arrayIndexOutOfBoundsException, (long)8571751429893130003L, (long)l)) + (String)((Object)j4.b("h", (int)27591, (long)(0x7C812A1179EA484FL ^ l))) + (String)((Object)m44.a("i", (Object)objectArray4, (long)8413859046462590320L, (long)l)) + (String)((Object)j4.b("h", (int)3951, (long)(0x66702BE20C89ACE1L ^ l)));
            throw new aw(string);
        }
    }

    public va A(long l) {
        return m44.a("i", (long)-6182402545079233341L, (long)l);
    }

    private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return arrayIndexOutOfBoundsException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x431D;
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
                throw new RuntimeException("com/zelix/j4", exception);
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
            j4.c[n2] = j4.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = j4.b(n, l);
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
            throw new RuntimeException("com/zelix/j4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(j4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
