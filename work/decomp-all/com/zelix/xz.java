/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._p;
import com.zelix._u;
import com.zelix._x;
import com.zelix.ab;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.v8;
import com.zelix.xn;
import com.zelix.yf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xz
extends xn {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public xz(String string, int n, _u _u2, _6 _62, long l, yf yf2) {
        long l2 = ((long)n << 32 | l << 32 >>> 32) ^ a;
        long l3 = l2 ^ 0x71A27CBF896EL;
        int n2 = (int)(l3 >>> 32);
        int n3 = (int)(l3 << 32 >>> 48);
        int n4 = (int)(l3 << 48 >>> 48);
        super(n2, string, (char)n3, _u2, _62, yf2, (short)n4);
    }

    public xz(String string, v8 v82, _p _p2, _p _p3, int n, _x _x2, _u _u2, long l, _6 _62, yf yf2) {
        long l2 = ((long)n << 32 | l << 32 >>> 32) ^ a;
        long l3 = l2 ^ 0x2A815ACEF3ADL;
        super(string, v82, _p2, l3, _p3, _x2, _u2, _62, yf2);
    }

    /*
     * Unable to fully structure code
     */
    public void v(Object[] var1_1) {
        block17: {
            block18: {
                block16: {
                    block14: {
                        block15: {
                            var9_2 = (String)var1_1[0];
                            var7_3 = (Long)var1_1[1];
                            var4_4 = (String)var1_1[2];
                            var6_5 = (Map)var1_1[3];
                            var3_6 = (Map)var1_1[4];
                            var2_7 = (Map)var1_1[5];
                            var5_8 = (ol)var1_1[6];
                            v0 = var7_3;
                            var10_9 = v0 ^ 132873280967001L;
                            var12_10 = v0 ^ 80417151880124L;
                            var14_11 = m44.a("n", (long)561294493437169513L, (long)var7_3);
                            try {
                                try {
                                    v1 = var4_4;
                                    if (var14_11 == null) break block14;
                                    if (v1 != null) break block15;
                                }
                                catch (n9 v2) {
                                    throw m44.a("n", (Object)v2, (long)1871819094746173944L, (long)var7_3);
                                }
                                v3 = new Object[2];
                                v3[1] = var10_9;
                                v3[0] = var9_2;
                                throw new ab((String)xz.c("m", (int)30523, (long)(1283766003050606763L ^ var7_3)) + (String)m44.a("n", (Object)v3, (long)260904624172004881L, (long)var7_3) + (String)xz.c("m", (int)23660, (long)(7433147987020241907L ^ var7_3)));
                            }
                            catch (n9 v4) {
                                throw m44.a("n", (Object)v4, (long)1871819094746173944L, (long)var7_3);
                            }
                        }
                        v1 = (String)xz.c("m", (int)6678, (long)(2801243342238096769L ^ var7_3)) + (String)m44.a("p", (Object)this, (long)434156953500189698L, (long)var7_3) + (String)xz.c("m", (int)6926, (long)(1313297474649824412L ^ var7_3)) + var4_4 + (String)xz.c("m", (int)9577, (long)(1928613648210862839L ^ var7_3));
                    }
                    var15_12 = v1;
                    try {
                        try {
                            v5 = var4_4.equals(xz.c("m", (int)4250, (long)(641827436303521545L ^ var7_3)));
                            v6 = var14_11;
                            if (var7_3 >= 0L) {
                                if (v6 == null) break block16;
                                if (v5) break block17;
                            }
                            ** GOTO lbl52
                        }
                        catch (n9 v7) {
                            throw m44.a("n", (Object)v7, (long)1871819094746173944L, (long)var7_3);
                        }
                        v5 = var4_4.equals(xz.c("m", (int)30566, (long)(126409471403225343L ^ var7_3)));
                    }
                    catch (n9 v8) {
                        throw m44.a("n", (Object)v8, (long)1871819094746173944L, (long)var7_3);
                    }
                }
                try {
                    try {
                        v6 = var14_11;
lbl52:
                        // 2 sources

                        if (v6 == null) break block18;
                        if (v5) break block17;
                    }
                    catch (n9 v9) {
                        throw m44.a("n", (Object)v9, (long)1871819094746173944L, (long)var7_3);
                    }
                    v5 = var4_4.equals(xz.c("m", (int)28989, (long)(588130638938273449L ^ var7_3)));
                }
                catch (n9 v10) {
                    throw m44.a("n", (Object)v10, (long)1871819094746173944L, (long)var7_3);
                }
            }
            if (!v5) {
                v11 = new Object[6];
                v11[5] = true;
                v11[4] = var4_4;
                v11[3] = var15_12;
                v11[2] = var12_10;
                v11[1] = var6_5;
                v11[0] = var9_2;
                m44.a("q", (Object)this, (Object)v11, (long)1817139738518539806L, (long)var7_3);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void s(Object[] var1_1) {
        block24: {
            block22: {
                block20: {
                    block21: {
                        var5_2 = (String)var1_1[0];
                        var2_3 = (Long)var1_1[1];
                        var4_4 = (String)var1_1[2];
                        var6_5 = (List)var1_1[3];
                        v0 = var2_3;
                        var7_6 = v0 ^ 102632066592988L;
                        var9_7 = v0 ^ 113040443675431L;
                        var11_8 = v0 ^ 110053682845850L;
                        var13_9 = m44.a("k", (long)7372176884749954796L, (long)var2_3);
                        try {
                            try {
                                v1 = var4_4;
                                if (var13_9 == null) break block20;
                                if (v1 != null) break block21;
                            }
                            catch (n9 v2) {
                                throw m44.a("k", (Object)v2, (long)8682707001098825853L, (long)var2_3);
                            }
                            v3 = new Object[2];
                            v3[1] = var7_6;
                            v3[0] = var5_2;
                            throw new ab((String)xz.c("m", (int)5679, (long)(3186301013760208955L ^ var2_3)) + (String)m44.a("k", (Object)v3, (long)7069471435243001748L, (long)var2_3) + (String)xz.c("m", (int)9123, (long)(1979349918206870963L ^ var2_3)));
                        }
                        catch (n9 v4) {
                            throw m44.a("k", (Object)v4, (long)8682707001098825853L, (long)var2_3);
                        }
                    }
                    v1 = var4_4;
                }
                try {
                    block23: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var13_9 == null) break block22;
                                            if (v1.equals(xz.c("m", (int)32153, (long)(7240270583382678410L ^ var2_3)))) break block23;
                                        }
                                        catch (n9 v5) {
                                            throw m44.a("k", (Object)v5, (long)8682707001098825853L, (long)var2_3);
                                        }
                                        v1 = var4_4;
                                        if (var13_9 == null) break block22;
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("k", (Object)v6, (long)8682707001098825853L, (long)var2_3);
                                    }
                                    if (var2_3 <= 0L) break block22;
                                    if (v1.equals(xz.c("m", (int)29734, (long)(8802457226282734143L ^ var2_3)))) break block23;
                                }
                                catch (n9 v7) {
                                    throw m44.a("k", (Object)v7, (long)8682707001098825853L, (long)var2_3);
                                }
                                v8 = var4_4.equals(xz.c("m", (int)20193, (long)(2079180847404689657L ^ var2_3)));
                                if (var13_9 == null) break block24;
                            }
                            catch (n9 v9) {
                                throw m44.a("k", (Object)v9, (long)8682707001098825853L, (long)var2_3);
                            }
                            if (var2_3 < 0L) break block24;
                            if (v8) {
                            }
                            ** GOTO lbl76
                        }
                        catch (n9 v10) {
                            throw m44.a("k", (Object)v10, (long)8682707001098825853L, (long)var2_3);
                        }
                    }
                    v11 = new Object[2];
                    v11[1] = var5_2;
                    v11[0] = var11_8;
                    v1 = m44.a("t", (Object)m44.a("u", (Object)this, (long)7053605457514912161L, (long)var2_3), (Object)v11, (long)8957176293915375393L, (long)var2_3);
                }
                catch (n9 v12) {
                    throw m44.a("k", (Object)v12, (long)8682707001098825853L, (long)var2_3);
                }
            }
            var14_10 = v1;
            try {
                v8 = var6_5.add(var14_10);
                if (var2_3 <= 0L || var13_9 != null) break block24;
lbl76:
                // 2 sources

                v13 = new Object[4];
                v13[3] = var9_7;
                v13[2] = true;
                v13[1] = var4_4;
                v13[0] = var5_2;
                v8 = var6_5.add(m44.a("t", (Object)this, (Object)v13, (long)7039753105076786999L, (long)var2_3));
            }
            catch (n9 v14) {
                throw m44.a("k", (Object)v14, (long)8682707001098825853L, (long)var2_3);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                xz.a = prr.a((long)-1506234294184101049L, (long)3569583434798470817L, MethodHandles.lookup().lookupClass()).a(42138882971174L);
                xz.d = new HashMap<K, V>(13);
                var0 = xz.a ^ 116784606465083L;
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
                var9_3 = new String[13];
                var7_4 = 0;
                var6_5 = "\u0082\u008d\u001f%\\\u00f5R\u001d\t6k\u001d\u00d2\u00b4\u0098\u008c\u0010\u00f5\u00cc\u0088\u00d6\u00a8\u00bc\u00f3s\u00e3E\u00d5\u00dd\u0088$\u0010\u0080\u0018\u0092\u00a8|\u00db\u0010[\u0098\u00c10\nZ\u00bc\\\u00ff\u0005\u0080\u00dd\u00d5\u008d\u00b6\u00e2\u008f\u0091\u0005\u0018\u00ab>\u0015\u0006@\u00f8\r\u00af\u00f2\u00da\u009c\u009c\u00badl\u00fe\u009c\u008cD\u00da\u00d54M\u001b@~\u00b9+\u00da$\u0098\u00f090\u00fd\u00fd\u00e7\"\u009c\u00f8\ni_>3\u00a9\u00b3\u00ea]+u\u00f46e\u008b\u00bd\u00d7\u00b3\u00b5\u00fe\u00e8\u00ec DDT\u00f0\u008b\u00fc%\u009a\u0012g*\u00af\u00e2n\u0083\u00c4\u00ed\u00c8\u00d0'9\u001erp\u0098\u00ee@\u00fe\u00ea\u00c3\u008a\u000fT\u00c4\u009bT\u0086S\u00f3t\u00a2\u0010\u00b7\u00b5:wSJ\u001f\u0004/\u001b<\u00f3F/\u00af\u00c0c\u00fb\u00c5\u00fe8 \u00aa\u009b\u00010t\u00d3\u001fy\u00c7\u00ea\u00d5\u00f7i\u00ae\u00b9?\u0096\u00bd\u00b2d\u00a5\u0084\u0003\u009c3\f% \u00ebfY\u00ca\u008f\u008e>#\u00061\u00d4\u00aablV\u00f7\u00c1y)z\u008d\u00d2\u00c5\u00f6\u0006\u00b6\u0010\u0001\u0018,m8\u0010\u0088\u00c4\u00e6G/l4\u008a<\u00c8\u00f6\u00c3M\u0000B\u00a8\u0010\u0096\u00fbK\u00f9\u00c16\u00d9\u000b\u00f1B\u00ee%Wwk{ X\u0090^\u00e2\u0001\u0099m\u001b:\u00df\u00a4\u00b1\u00ca\u00c4\u00f9.\u00a7\u00f74k\u001d\u000e*\u000e\u00ba\u00ac\u008d\u00d15\u00f2\u00c9\u008a\u0010#\u0005M\u00f8\u0011\u00fc3;\u00ce\u00b7\u00c4\u00fb@wk^";
                var8_6 = "\u0082\u008d\u001f%\\\u00f5R\u001d\t6k\u001d\u00d2\u00b4\u0098\u008c\u0010\u00f5\u00cc\u0088\u00d6\u00a8\u00bc\u00f3s\u00e3E\u00d5\u00dd\u0088$\u0010\u0080\u0018\u0092\u00a8|\u00db\u0010[\u0098\u00c10\nZ\u00bc\\\u00ff\u0005\u0080\u00dd\u00d5\u008d\u00b6\u00e2\u008f\u0091\u0005\u0018\u00ab>\u0015\u0006@\u00f8\r\u00af\u00f2\u00da\u009c\u009c\u00badl\u00fe\u009c\u008cD\u00da\u00d54M\u001b@~\u00b9+\u00da$\u0098\u00f090\u00fd\u00fd\u00e7\"\u009c\u00f8\ni_>3\u00a9\u00b3\u00ea]+u\u00f46e\u008b\u00bd\u00d7\u00b3\u00b5\u00fe\u00e8\u00ec DDT\u00f0\u008b\u00fc%\u009a\u0012g*\u00af\u00e2n\u0083\u00c4\u00ed\u00c8\u00d0'9\u001erp\u0098\u00ee@\u00fe\u00ea\u00c3\u008a\u000fT\u00c4\u009bT\u0086S\u00f3t\u00a2\u0010\u00b7\u00b5:wSJ\u001f\u0004/\u001b<\u00f3F/\u00af\u00c0c\u00fb\u00c5\u00fe8 \u00aa\u009b\u00010t\u00d3\u001fy\u00c7\u00ea\u00d5\u00f7i\u00ae\u00b9?\u0096\u00bd\u00b2d\u00a5\u0084\u0003\u009c3\f% \u00ebfY\u00ca\u008f\u008e>#\u00061\u00d4\u00aablV\u00f7\u00c1y)z\u008d\u00d2\u00c5\u00f6\u0006\u00b6\u0010\u0001\u0018,m8\u0010\u0088\u00c4\u00e6G/l4\u008a<\u00c8\u00f6\u00c3M\u0000B\u00a8\u0010\u0096\u00fbK\u00f9\u00c16\u00d9\u000b\u00f1B\u00ee%Wwk{ X\u0090^\u00e2\u0001\u0099m\u001b:\u00df\u00a4\u00b1\u00ca\u00c4\u00f9.\u00a7\u00f74k\u001d\u000e*\u000e\u00ba\u00ac\u008d\u00d15\u00f2\u00c9\u008a\u0010#\u0005M\u00f8\u0011\u00fc3;\u00ce\u00b7\u00c4\u00fb@wk^".length();
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
                    var9_3[var7_4++] = xz.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "B\u00e0o \u009f\u00e1\u007fzR\u0095\u00ce\u00ab\u00dd>\u00c7\u00e8 >B0\u00d9\u00b0\u009e\u007f\u00e3\u00df\u00ad\u00b3\u00f4\u009f\u0097\u00d7n.\ts\u00bd\u00df\u00e5tl\u00811\u00ef\f\u00d0\u00a8$\u00fa";
                    var8_6 = "B\u00e0o \u009f\u00e1\u007fzR\u0095\u00ce\u00ab\u00dd>\u00c7\u00e8 >B0\u00d9\u00b0\u009e\u007f\u00e3\u00df\u00ad\u00b3\u00f4\u009f\u0097\u00d7n.\ts\u00bd\u00df\u00e5tl\u00811\u00ef\f\u00d0\u00a8$\u00fa".length();
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
                    var9_3[var7_4++] = xz.c(var10_9).intern();
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
        xz.b = var9_3;
        xz.c = new String[13];
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

    private static String c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA1C;
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
                throw new RuntimeException("com/zelix/xz", exception);
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
            xz.c[n2] = xz.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xz.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/xz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xz.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
