/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.aw;
import com.zelix.h1;
import com.zelix.j2;
import com.zelix.js;
import com.zelix.jz;
import com.zelix.l6q;
import com.zelix.lkh;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
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

public class j3
extends jz
implements lkh {
    final int k;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public j3(int n, h1 h12, to to2) {
        super(n, to2);
        this.k = h12.readUnsignedShort();
    }

    void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-1793574981721560766L, (long)l).g());
        dataOutputStream.writeShort((int)m44.a("w", (Object)((Object)this), (long)-2203323514214018782L, (long)l));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public j2 G(Object[] var1_1) {
        var3_2 = (l6q)var1_1[0];
        var5_3 = (l6q)var1_1[1];
        var2_4 = (l6q)var1_1[2];
        var4_5 = (l6q)var1_1[3];
        var6_6 = (PrintWriter)var1_1[4];
        var7_7 = (Long)var1_1[5];
        v0 = var7_7 = j3.a ^ var7_7;
        var9_8 = v0 ^ 57388644965753L;
        var11_9 = v0 ^ 110840152724962L;
        var13_10 = v0 ^ 100885866326191L;
        v1 = v0 ^ 90544751367426L;
        var15_11 = (int)(v1 >>> 56);
        var16_12 = v1 << 8 >>> 8;
        var18_13 = v0 ^ 24930473688381L;
        v2 = v0 ^ 87463345970012L;
        var20_14 = (int)(v2 >>> 32);
        var21_15 = (int)(v2 << 32 >>> 48);
        var22_16 = (int)(v2 << 48 >>> 48);
        var23_17 = v0 ^ 65523894963688L;
        var25_18 = m44.a("o", (long)-5003398649447390225L, (long)var7_7);
        try {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            block16: {
                                block15: {
                                    var26_19 = this.l.m(var13_10, (int)m44.a("q", (Object)this, (long)-4766439175849161324L, (long)var7_7));
                                    if (!(var26_19 instanceof x8)) break block20;
                                    var27_21 = new j2(this.E(), var20_14, (char)var21_15, this.l, (short)var22_16, (x8)var26_19);
                                    try {
                                        v3 = var3_2;
                                        if (var25_18 == false) break block15;
                                        if (v3 == null) break block16;
                                    }
                                    catch (ArrayIndexOutOfBoundsException v4) {
                                        throw m44.a("o", (Object)v4, (long)-6662700956318509257L, (long)var7_7);
                                    }
                                    v3 = var3_2;
                                }
                                v3.t((Object)((x8)var26_19), (Object)var27_21, var23_17);
                            }
                            v5 = new Object[1];
                            v5[0] = var9_8;
                            var28_23 = m44.a("p", (Object)var27_21, (Object)v5, (long)-4767375372193064629L, (long)var7_7);
                            v6 = var28_23.startsWith("(");
                            v7 /* !! */  = var25_18;
                            if (var7_7 < 0L) ** GOTO lbl63
                            if (v7 /* !! */  == false) break block17;
                            try {
                                block21: {
                                    if (v6 == 0) ** GOTO lbl78
                                    break block21;
                                    catch (ArrayIndexOutOfBoundsException v8) {
                                        throw m44.a("o", (Object)v8, (long)-6662700956318509257L, (long)var7_7);
                                    }
                                }
                                v6 = var28_23.indexOf(")");
                            }
                            catch (ArrayIndexOutOfBoundsException v9) {
                                throw m44.a("o", (Object)v9, (long)-6662700956318509257L, (long)var7_7);
                            }
                        }
                        v7 /* !! */  = (CallSite)-1;
lbl63:
                        // 2 sources

                        if (var7_7 < 0L || var25_18 == false) break block18;
                        try {
                            block22: {
                                if (v6 == v7 /* !! */ ) ** GOTO lbl78
                                break block22;
                                catch (ArrayIndexOutOfBoundsException v10) {
                                    throw m44.a("o", (Object)v10, (long)-6662700956318509257L, (long)var7_7);
                                }
                            }
                            v6 = var28_23.indexOf(")");
                            v7 /* !! */  = (CallSite)(var28_23.length() - 1);
                        }
                        catch (ArrayIndexOutOfBoundsException v11) {
                            throw m44.a("o", (Object)v11, (long)-6662700956318509257L, (long)var7_7);
                        }
                    }
                    try {
                        if (v6 < v7 /* !! */ ) break block19;
lbl78:
                        // 3 sources

                        v12 = new Object[2];
                        v12[1] = var18_13;
                        v12[0] = m44.a("p", (Object)this, (long)var11_9, (long)-4988506890828791594L, (long)var7_7);
                        throw new aw(this.l.I((byte)var15_11, var16_12) + (String)j3.b("f", (int)11488, (long)(1757839760499412990L ^ var7_7)) + (String)j3.b("f", (int)17177, (long)(3686389551770329091L ^ var7_7)) + (String)j3.b("f", (int)4563, (long)(4648826139253519052L ^ var7_7)) + (String)var28_23 + (String)j3.b("f", (int)4563, (long)(4648826139253519052L ^ var7_7)) + (String)m44.a("o", (Object)v12, (long)-6579130736061326074L, (long)var7_7) + (String)j3.b("f", (int)32353, (long)(2201355460237679992L ^ var7_7)));
                    }
                    catch (ArrayIndexOutOfBoundsException v13) {
                        throw m44.a("o", (Object)v13, (long)-6662700956318509257L, (long)var7_7);
                    }
                }
                return var27_21;
            }
            v14 = new Object[2];
            v14[1] = var18_13;
            v14[0] = m44.a("p", (Object)this, (long)var11_9, (long)-4988506890828791594L, (long)var7_7);
            throw new aw(this.l.I((byte)var15_11, var16_12) + (String)j3.b("f", (int)4563, (long)(4648826139253519052L ^ var7_7)) + (String)j3.b("f", (int)22930, (long)(1975749138057624202L ^ var7_7)) + (String)j3.b("f", (int)4563, (long)(4648826139253519052L ^ var7_7)) + (int)m44.a("q", (Object)this, (long)-4766439175849161324L, (long)var7_7) + (String)j3.b("f", (int)4563, (long)(4648826139253519052L ^ var7_7)) + (String)m44.a("o", (Object)v14, (long)-6579130736061326074L, (long)var7_7) + (String)j3.b("f", (int)21603, (long)(901707621635258232L ^ var7_7)));
        }
        catch (ArrayIndexOutOfBoundsException var26_20) {
            v15 = new Object[2];
            v15[1] = var18_13;
            v15[0] = m44.a("p", (Object)this, (long)var11_9, (long)-4988506890828791594L, (long)var7_7);
            var27_22 = this.l.I((byte)var15_11, var16_12) + (String)j3.b("f", (int)4563, (long)(4648826139253519052L ^ var7_7)) + (String)j3.b("f", (int)6564, (long)(5599575421195008697L ^ var7_7)) + (String)j3.b("f", (int)4563, (long)(4648826139253519052L ^ var7_7)) + (String)m44.a("p", (Object)var26_20, (long)-6448369822239303835L, (long)var7_7) + (String)j3.b("f", (int)4563, (long)(4648826139253519052L ^ var7_7)) + (String)m44.a("o", (Object)v15, (long)-6579130736061326074L, (long)var7_7) + (String)j3.b("f", (int)21603, (long)(901707621635258232L ^ var7_7));
            throw new aw(var27_22);
        }
    }

    public js i(l6q l6q2, l6q l6q3, l6q l6q4, l6q l6q5, long l, PrintWriter printWriter) {
        long l2 = l ^ 0x5DDE2C080352L;
        Object[] objectArray = new Object[6];
        objectArray[5] = l2;
        objectArray[4] = printWriter;
        objectArray[3] = l6q5;
        objectArray[2] = l6q4;
        objectArray[1] = l6q3;
        objectArray[0] = l6q2;
        return m44.a("w", (Object)((Object)this), (Object)objectArray, (long)36043502715668236L, (long)l);
    }

    public boolean G() {
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                j3.a = prr.a((long)-5437936384388835602L, (long)5512909605305433614L, MethodHandles.lookup().lookupClass()).a(185459420205911L);
                j3.d = new HashMap<K, V>(13);
                var0 = j3.a ^ 36966696480939L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "D\u0088\u00c8hNm~\u0094\u00cb\u00ec\u001e\u009fF\u00e6\u00c3v8\u0093\u008f$\u00b0\u008f\u00dd\u00e8\u00a4\u0093\u008f\u00ec\u00f5N\u00f7\u00c7\u00f7\u00ae-\u001c\u00d3\u00a3%p\u00fc\u00ce(\u00c1\u0081\u0082\u009d\u00c9\u0013\u00e8\u00f8\u00b10\u008c\u00b3X}{\u0007!;\u0017\u00a69\u00ca7M\u0093\u00df\u00ad\u008f(\u0017\u0010\u00d3d\u00eb#\u00d0\u00bb;f\u00fe\u00db\u009e\u00c4R\u00a8\u0018\u00beH\u009b\u00db\u00d4\ty\u00d8\u00a4B\u001b\u00e8y\u00c4\u00f5\u00d5\u00f9!0)\u0087,\u00cd\u0086\u00bfHM\u00f4\u0097\u0086\u007f\u0089>#Fm\u001c\u0001\u00e3S=\u00fca\u00d6\u00f8\bz\u0096|\u00945X\u00f6\t\r\u00d8\u00dfwp\u001e\r\u00cb\u009a\u0014\u00df\u00cc\u00bd\u00c8!_=\u00e8\u0090\u00eb\u0010\u00b7%d\u00d5\u007f\u008a:\u001b$\u00d5\u0083\u00bd\u0000S\u00c6E";
                var8_6 = "D\u0088\u00c8hNm~\u0094\u00cb\u00ec\u001e\u009fF\u00e6\u00c3v8\u0093\u008f$\u00b0\u008f\u00dd\u00e8\u00a4\u0093\u008f\u00ec\u00f5N\u00f7\u00c7\u00f7\u00ae-\u001c\u00d3\u00a3%p\u00fc\u00ce(\u00c1\u0081\u0082\u009d\u00c9\u0013\u00e8\u00f8\u00b10\u008c\u00b3X}{\u0007!;\u0017\u00a69\u00ca7M\u0093\u00df\u00ad\u008f(\u0017\u0010\u00d3d\u00eb#\u00d0\u00bb;f\u00fe\u00db\u009e\u00c4R\u00a8\u0018\u00beH\u009b\u00db\u00d4\ty\u00d8\u00a4B\u001b\u00e8y\u00c4\u00f5\u00d5\u00f9!0)\u0087,\u00cd\u0086\u00bfHM\u00f4\u0097\u0086\u007f\u0089>#Fm\u001c\u0001\u00e3S=\u00fca\u00d6\u00f8\bz\u0096|\u00945X\u00f6\t\r\u00d8\u00dfwp\u001e\r\u00cb\u009a\u0014\u00df\u00cc\u00bd\u00c8!_=\u00e8\u0090\u00eb\u0010\u00b7%d\u00d5\u007f\u008a:\u001b$\u00d5\u0083\u00bd\u0000S\u00c6E".length();
                var5_7 = 16;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = j3.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0082-W\u00e1\u00e1\u00c8$-S\u007f\u00b1\u0001]\u008e\u00a9\u00bd@\u0082\u00e9\u00e2s\u0013\u00eb\u00d6\u0087\u00cc\u00ead\u0084\u00ee\u0013\u00f52V\u00e8\u00c2d\u00d4W\u00a9\u00f5\u00a3\u00a4\u00f5\u00e8\u00c4G\u00e93\u00a3YM#\u00f2E\u00dfma\u00ad\u0018\u00b6x\u0006V\u001a\u00f8\u008d\u00b1\u0092N+\u00ec\u00df`x\u0007D)\u00a6\u00f4\u001b";
                    var8_6 = "\u0082-W\u00e1\u00e1\u00c8$-S\u007f\u00b1\u0001]\u008e\u00a9\u00bd@\u0082\u00e9\u00e2s\u0013\u00eb\u00d6\u0087\u00cc\u00ead\u0084\u00ee\u0013\u00f52V\u00e8\u00c2d\u00d4W\u00a9\u00f5\u00a3\u00a4\u00f5\u00e8\u00c4G\u00e93\u00a3YM#\u00f2E\u00dfma\u00ad\u0018\u00b6x\u0006V\u001a\u00f8\u008d\u00b1\u0092N+\u00ec\u00df`x\u0007D)\u00a6\u00f4\u001b".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = j3.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        j3.b = var9_3;
        j3.c = new String[7];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x13FB;
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
                throw new RuntimeException("com/zelix/j3", exception);
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
            j3.c[n2] = j3.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = j3.b(n, l);
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
            throw new RuntimeException("com/zelix/j3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(j3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
