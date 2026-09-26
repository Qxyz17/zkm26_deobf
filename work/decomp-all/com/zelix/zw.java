/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fu;
import com.zelix.lq5;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.q1;
import com.zelix.zj;
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

public class zw
extends zj
implements lq5 {
    private boolean h;
    private static final long a;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public void S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        m44.a("s", (Object)((Object)this), (boolean)true, (long)2638156869884807889L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void X(Object[] var1_1) {
        block30: {
            block31: {
                block33: {
                    block32: {
                        block27: {
                            block29: {
                                block28: {
                                    block26: {
                                        var4_2 = (fu)var1_1[0];
                                        var2_3 = (Long)var1_1[1];
                                        var5_4 = (lqq)var1_1[2];
                                        v0 = var2_3;
                                        var6_5 = v0 ^ 19547077594193L;
                                        var8_6 = v0 ^ 55940588088632L;
                                        var10_7 = v0 ^ 125934028382052L;
                                        var12_8 = v0 ^ 85213539767481L;
                                        var14_9 = v0 ^ 0L;
                                        v1 = m44.a("m", (long)-1921333740741510316L, (long)var2_3);
                                        v2 = new Object[3];
                                        v2[2] = var5_4;
                                        v2[1] = var14_9;
                                        v2[0] = var4_2;
                                        super.X(v2);
                                        v3 = new Object[1];
                                        v3[0] = var6_5;
                                        var17_10 = (q1)m44.a("r", (Object)this, (Object)v3, (long)-1797704930665120443L, (long)var2_3);
                                        v4 = new Object[1];
                                        v4[0] = var12_8;
                                        var18_11 = m44.a("r", (Object)this, (Object)v4, (long)-1785247222142810516L, (long)var2_3);
                                        var16_12 = v1;
                                        try {
                                            try {
                                                v5 /* !! */  = var18_11.equals(zw.a("i", (int)12293, (long)(9107390505826248468L ^ var2_3)));
                                                if (var16_12 != null) break block26;
                                                if (!v5 /* !! */ ) {
                                                }
                                                ** GOTO lbl53
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("m", (Object)v6, (long)-2187507178488754313L, (long)var2_3);
                                            }
                                            v5 /* !! */  = var18_11.equals(zw.a("i", (int)10811, (long)(8529235929585384745L ^ var2_3)));
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("m", (Object)v7, (long)-2187507178488754313L, (long)var2_3);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                v8 = var16_12;
                                                if (var2_3 < 0L) ** GOTO lbl84
                                                if (v8 != null) break block27;
                                                if (v5 /* !! */ ) {
                                                }
                                                ** GOTO lbl74
                                            }
                                            catch (n9 v9) {
                                                throw m44.a("m", (Object)v9, (long)-2187507178488754313L, (long)var2_3);
                                            }
lbl53:
                                            // 2 sources

                                            v10 = var17_10;
                                            v11 = new StringBuilder();
                                            if (m44.a("s", (Object)this, (long)-2294970102650155413L, (long)var2_3) == false) break block28;
                                        }
                                        catch (n9 v12) {
                                            throw m44.a("m", (Object)v12, (long)-2187507178488754313L, (long)var2_3);
                                        }
                                        v13 = "!";
                                        break block29;
                                    }
                                    catch (n9 v14) {
                                        throw m44.a("m", (Object)v14, (long)-2187507178488754313L, (long)var2_3);
                                    }
                                }
                                v13 = "";
                            }
                            try {
                                v15 = new Object[2];
                                v15[1] = v11.append(v13).append((String)var18_11).toString();
                                v15[0] = var10_7;
                                m44.a("r", (Object)v10, (Object)v15, (long)-529024947438854496L, (long)var2_3);
                                if (var16_12 == null) break block30;
lbl74:
                                // 2 sources

                                v5 /* !! */  = var18_11.equals(zw.a("i", (int)30361, (long)(3669372738597888394L ^ var2_3)));
                            }
                            catch (n9 v16) {
                                throw m44.a("m", (Object)v16, (long)-2187507178488754313L, (long)var2_3);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (var2_3 < 0L) break block31;
                                    v8 = var16_12;
lbl84:
                                    // 2 sources

                                    if (v8 != null) break block31;
                                    if (v5 /* !! */ ) {
                                    }
                                    ** GOTO lbl111
                                }
                                catch (n9 v17) {
                                    throw m44.a("m", (Object)v17, (long)-2187507178488754313L, (long)var2_3);
                                }
                                v18 = var17_10;
                                v19 = new StringBuilder();
                                if (m44.a("s", (Object)this, (long)-2294970102650155413L, (long)var2_3) == false) break block32;
                            }
                            catch (n9 v20) {
                                throw m44.a("m", (Object)v20, (long)-2187507178488754313L, (long)var2_3);
                            }
                            v21 = "!";
                            break block33;
                        }
                        catch (n9 v22) {
                            throw m44.a("m", (Object)v22, (long)-2187507178488754313L, (long)var2_3);
                        }
                    }
                    v21 = "";
                }
                try {
                    v23 = new Object[2];
                    v23[1] = v19.append(v21).append((String)zw.a("i", (int)10760, (long)(658937210558512412L ^ var2_3))).toString();
                    v23[0] = var10_7;
                    m44.a("r", (Object)v18, (Object)v23, (long)-529024947438854496L, (long)var2_3);
                    if (var16_12 == null) break block30;
lbl111:
                    // 2 sources

                    v5 /* !! */  = m44.a("s", (Object)this, (long)-2294970102650155413L, (long)var2_3);
                }
                catch (n9 v24) {
                    throw m44.a("m", (Object)v24, (long)-2187507178488754313L, (long)var2_3);
                }
            }
            try {
                if (v5 /* !! */ ) {
                    v25 = new Object[1];
                    v25[0] = var12_8;
                    v26 = new Object[2];
                    v26[1] = var8_6;
                    v26[0] = (String)zw.a("i", (int)17071, (long)(1176315796086166975L ^ var2_3)) + (String)m44.a("r", (Object)this, (Object)v25, (long)-1785247222142810516L, (long)var2_3) + (String)zw.a("i", (int)14112, (long)(3408129599039365173L ^ var2_3));
                    m44.a("r", (Object)var5_4, (Object)v26, (long)-22266681956419799L, (long)var2_3);
                }
            }
            catch (n9 v27) {
                throw m44.a("m", (Object)v27, (long)-2187507178488754313L, (long)var2_3);
            }
        }
    }

    public zw(int n, int n2, byte by, int n3) {
        long l = ((long)n2 << 32 | (long)by << 56 >>> 32 | (long)n3 << 40 >>> 40) ^ a;
        long l2 = l ^ 0x174464E6F7F6L;
        super(l2, n);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                zw.a = prr.a((long)884396015484866719L, (long)-84400481978005085L, MethodHandles.lookup().lookupClass()).a(150638007401202L);
                zw.f = new HashMap<K, V>(13);
                var0 = zw.a ^ 98283302794729L;
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
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "Man\u00a7*\u009a\u00cb\u00fb\u0091\u0091\u00df\u00b08\u00a6\u00bd\u0013\u0018\u00f9\u001e\u009c\u00ef\u00e7\u001a\u00c6\u00aeO\u00ce\u00be>\u0094k\u00e2\u0017\u00fb\u00bf\u00d7H:A\u00e7X\u0010\u00e8\u000f\u00b8pa\u00f6\u00ecPd=\u00e5\u0016)\u00b8AN :|\u00eeW\u009b9\u00fb!\u008c\u00ee7\u00f0/R\u0091\u0085q$@\u00a7:t\u00cfQ\u009f\u00c0\u0087};X\u00f6\u0006";
                var8_6 = "Man\u00a7*\u009a\u00cb\u00fb\u0091\u0091\u00df\u00b08\u00a6\u00bd\u0013\u0018\u00f9\u001e\u009c\u00ef\u00e7\u001a\u00c6\u00aeO\u00ce\u00be>\u0094k\u00e2\u0017\u00fb\u00bf\u00d7H:A\u00e7X\u0010\u00e8\u000f\u00b8pa\u00f6\u00ecPd=\u00e5\u0016)\u00b8AN :|\u00eeW\u009b9\u00fb!\u008c\u00ee7\u00f0/R\u0091\u0085q$@\u00a7:t\u00cfQ\u009f\u00c0\u0087};X\u00f6\u0006".length();
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
                    var9_3[var7_4++] = zw.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "C\\L.\u00be\u008fSt\u00c2;QJ\r\u00c3\u00ec\u00c4\u00f9\u00eao?\u00ae-\u0086\u0088\u00a5\u0016pZ\u008f\u00fd\u00a1I8.w\u00ee\u00c6\u0084@<9/\u0084=\u00bf\u001c\u0090\u00d6l\u00ba\u0092\u0011\u000f\u001d\u000fp(\u00dc|\u0015[\u0097_)*\u00c1\u001c\u008a_\"\u0013\u00e9\u008d\u000f\u00ee\u00a40\u00c8\u00d2\u00e7*\u00e1(!\u00a5\\\u00db\u00fb\u00d1";
                    var8_6 = "C\\L.\u00be\u008fSt\u00c2;QJ\r\u00c3\u00ec\u00c4\u00f9\u00eao?\u00ae-\u0086\u0088\u00a5\u0016pZ\u008f\u00fd\u00a1I8.w\u00ee\u00c6\u0084@<9/\u0084=\u00bf\u001c\u0090\u00d6l\u00ba\u0092\u0011\u000f\u001d\u000fp(\u00dc|\u0015[\u0097_)*\u00c1\u001c\u008a_\"\u0013\u00e9\u008d\u000f\u00ee\u00a40\u00c8\u00d2\u00e7*\u00e1(!\u00a5\\\u00db\u00fb\u00d1".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = zw.a(var10_9).intern();
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
        zw.d = var9_3;
        zw.e = new String[6];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2302;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/zw", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            zw.e[n2] = zw.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = zw.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/zw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(zw.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
