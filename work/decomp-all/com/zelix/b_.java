/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.x8;
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

public class b_
extends kw
implements ni {
    x8 F;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    void z(gu gu2, long l) {
        long l2 = l;
        long l3 = l2 ^ 0x66FDF08525FDL;
        long l4 = l2 ^ 0x6DE1DADD9981L;
        gu2.K((js)this.b, (Object)this, l3, (Object)this.H());
        m44.a("v", (Object)((Object)this), (long)5758444667849450595L, (long)l).e(l4, gu2, (Object)this, this.H());
    }

    b_(_4 _42, int n, String string, short s, h1 h12, l6q l6q2, short s2, int n2) {
        long l;
        long l2 = l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        long l3 = l2 ^ 0x4E87A2C2E86FL;
        long l4 = l2 ^ 0x2C09C45FE3CAL;
        long l5 = l2 ^ 0x60F08C1C8F4EL;
        long l6 = l2 ^ 0xA6265EEA09L;
        super(_42, n, string, l4, h12, l6q2);
        int n3 = h12.readUnsignedShort();
        js js2 = this.m(l5, n3);
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = js2;
        m44.a("q", (Object)((Object)this), (Object)objectArray, (long)-8752299724736723486L, (long)l);
        l6q2.t((Object)m44.a("p", (Object)((Object)this), (long)-7037912433256925731L, (long)l), (Object)this, l6);
    }

    void X(Object[] objectArray) {
        block6: {
            long l;
            js js2;
            block7: {
                String string;
                StringBuilder stringBuilder;
                aw aw2;
                aw aw3;
                block9: {
                    block8: {
                        js2 = (js)objectArray[0];
                        l = (Long)objectArray[1];
                        long l2 = l = a ^ l;
                        long l3 = l2 ^ 0x364699730D9AL;
                        long l4 = l2 ^ 0x45D0B1EF54A9L;
                        CallSite callSite = m44.a("l", (long)-365471725120016886L, (long)l);
                        try {
                            try {
                                aw aw4;
                                try {
                                    if (callSite != false) break block6;
                                    if (js2 instanceof x8) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("l", (Object)((Object)n92), (long)-264489423178080104L, (long)l);
                                }
                                aw3 = aw4;
                                aw2 = aw4;
                                stringBuilder = new StringBuilder().append((String)((Object)b_.b("h", (int)6989, (long)(0x5F70640514D4B2FBL ^ l)))).append(this.h(l3)).append((String)((Object)b_.b("h", (int)7710, (long)(0x124804BF295FB7A9L ^ l)))).append((String)((Object)b_.b("h", (int)22097, (long)(0x43C6F7ED0511FFE5L ^ l)))).append((String)((Object)b_.b("h", (int)8678, (long)(0x21A9F31720238853L ^ l))));
                                if (js2 == null) break block8;
                            }
                            catch (n9 n93) {
                                throw m44.a("l", (Object)((Object)n93), (long)-264489423178080104L, (long)l);
                            }
                            string = js2.A(l4) + " " + js2.E() + " " + js2.getClass().getName();
                            break block9;
                        }
                        catch (n9 n94) {
                            throw m44.a("l", (Object)((Object)n94), (long)-264489423178080104L, (long)l);
                        }
                    }
                    string = "";
                }
                aw3(stringBuilder.append(string).toString());
                throw aw2;
            }
            m44.a("p", (Object)((Object)this), (x8)((x8)js2), (long)-504871817659411593L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void N(Object[] var1_1) {
        block9: {
            block8: {
                var4_2 = (DataOutputStream)var1_1[0];
                var3_3 = (Map)var1_1[1];
                var5_4 = (Long)var1_1[2];
                var2_5 = (lqu)var1_1[3];
                var7_6 = var5_4 ^ 0L;
                v0 = new Object[4];
                v0[3] = var2_5;
                v0[2] = var7_6;
                v0[1] = var3_3;
                v0[0] = var4_2;
                super.N(v0);
                var10_7 = (x8)var3_3.get(m44.a("u", (Object)this, (long)943845968936429200L, (long)var5_4));
                var9_8 = m44.a("k", (long)1680553024964027930L, (long)var5_4);
                try {
                    try {
                        if (var9_8 == false) break block8;
                        if (var10_7 != null) {
                        }
                        ** GOTO lbl32
                    }
                    catch (n9 v1) {
                        throw m44.a("k", (Object)v1, (long)698967704680437119L, (long)var5_4);
                    }
                    var4_2.writeShort(var10_7.E());
                }
                catch (n9 v2) {
                    throw m44.a("k", (Object)v2, (long)698967704680437119L, (long)var5_4);
                }
            }
            try {
                if (var5_4 <= 0L || var9_8 != false) break block9;
lbl32:
                // 2 sources

                var4_2.writeShort(m44.a("u", (Object)this, (long)943845968936429200L, (long)var5_4).E());
            }
            catch (n9 v3) {
                throw m44.a("k", (Object)v3, (long)698967704680437119L, (long)var5_4);
            }
        }
    }

    protected void c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[1];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = dataOutputStream;
        objectArray2[0] = l2;
        super.c(objectArray2);
        dataOutputStream.writeShort(m44.a("w", (Object)((Object)this), (long)1421745646813378610L, (long)l).E());
    }

    public void q(x8 x82, long l, x8 x83) {
        block8: {
            b_ b_2;
            long l2;
            block6: {
                l2 = l ^ 0L;
                CallSite callSite = m44.a("n", (long)-5818679388199650344L, (long)l);
                try {
                    block7: {
                        try {
                            try {
                                b_2 = this;
                                if (callSite != false) break block6;
                                if (m44.a("p", (Object)((Object)b_2), (long)-5968354404536727899L, (long)l) != x82) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)((Object)n92), (long)-6231248166908185270L, (long)l);
                            }
                            m44.a("r", (Object)((Object)this), (x8)x83, (long)-5968354404536727899L, (long)l);
                            if (callSite == false) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)((Object)n93), (long)-6231248166908185270L, (long)l);
                        }
                    }
                    b_2 = this;
                }
                catch (n9 n94) {
                    throw m44.a("n", (Object)((Object)n94), (long)-6231248166908185270L, (long)l);
                }
            }
            super.q(x82, l2, x83);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                b_.a = prr.a((long)7741173154876390420L, (long)-3176777345895165350L, MethodHandles.lookup().lookupClass()).a(143490553868018L);
                b_.g = new HashMap<K, V>(13);
                var0 = b_.a ^ 30587730916537L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u000f\u00aeKm{l\u00ac\u00fc_\u0011P\b(,\u00a4\u0005\u0005\u0019s\u009f\u00023\u00e4\u0000([\u00b8\u00fe\f\u00e2\u009e\u00d5\u0000?[y\u00a9>\u00b0\u00d4\u00c2\u00f1U\u00bc\u00ed\u001eL\u00aa\u0018\u008e\u00d1 R\u00f2x\u00c8:\u00cb\u00aa\u00bb\u008el\"j\u00b1\u001cLY$\u009637\u000e";
                var8_6 = "\u000f\u00aeKm{l\u00ac\u00fc_\u0011P\b(,\u00a4\u0005\u0005\u0019s\u009f\u00023\u00e4\u0000([\u00b8\u00fe\f\u00e2\u009e\u00d5\u0000?[y\u00a9>\u00b0\u00d4\u00c2\u00f1U\u00bc\u00ed\u001eL\u00aa\u0018\u008e\u00d1 R\u00f2x\u00c8:\u00cb\u00aa\u00bb\u008el\"j\u00b1\u001cLY$\u009637\u000e".length();
                var5_7 = 48;
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
                    var9_3[var7_4++] = b_.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0093\f\u00dd\u001b\u00b8\u00f1\u00894\u00beBZ\u001dGR\u00ee\u00e9\u00ef\u00caw\u0085\"\u00d0$\u00da\u0010J\u00a8\t\r\u00bai*\u00db\u0003rw,\u00bef\u00dd\u00ca";
                    var8_6 = "\u0093\f\u00dd\u001b\u00b8\u00f1\u00894\u00beBZ\u001dGR\u00ee\u00e9\u00ef\u00caw\u0085\"\u00d0$\u00da\u0010J\u00a8\t\r\u00bai*\u00db\u0003rw,\u00bef\u00dd\u00ca".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = b_.c(var10_9).intern();
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
        b_.c = var9_3;
        b_.d = new String[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x581F;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/b_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            b_.d[n2] = b_.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b_.b(n, l);
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
            throw new RuntimeException("com/zelix/b_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
