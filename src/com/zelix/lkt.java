/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
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

public class lkt {
    int Z;
    public int j;
    public lkt g;
    public int S;
    public int E;
    public String P;
    public int K;
    public int y;
    public lkt c;
    static final String[] b;
    private static final long a;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public void M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l = a ^ l;
        m44.a("u", (Object)this, (int)n, (long)8138992682521170808L, (long)l);
    }

    public final String toString() {
        CallSite callSite;
        block4: {
            long l;
            block5: {
                l = a ^ 0x69E50A988D91L;
                long l2 = l ^ 0x601E6722C6E2L;
                CallSite callSite2 = m44.a("k", (long)1280091885530091781L, (long)l);
                try {
                    try {
                        callSite = m44.a("u", (Object)this, (long)1350623755231379444L, (long)l);
                        if (callSite2 == false) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)946269397491011187L, (long)l);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = this;
                    objectArray[0] = l2;
                    return "<" + (String)((Object)m44.a("k", (Object)objectArray, (long)625343255904507102L, (long)l)) + (String)((Object)lkt.a("e", (int)1641, (long)(0x5BEF15F7F1E386B5L ^ l)));
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)946269397491011187L, (long)l);
                }
            }
            callSite = m44.a("u", (Object)this, (long)1350623755231379444L, (long)l);
        }
        return callSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        lkt.a = prr.a((long)6951335363467373232L, (long)-705451280998453825L, MethodHandles.lookup().lookupClass()).a(124319416840786L);
                        var20 = lkt.a ^ 53378227966282L;
                        lkt.f = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[8];
                        var16_4 = 0;
                        var15_5 = "\u00c2\u008b\u00fc\u00fd\u0018\u00b0@\u008dS\u009c\u00ce\u0005\u00db\u00e4SjZ4\u00b6,\u00ba\u0001\u0086\u0005\u00b1\u00efd\u00bc\u00b2\"\u000b\u00c6\u00d1*\u00ac|@\u007f\u0006\u00c1xzjB\u00f9\u00d4\u000e\u00ad8\u0081YH\u00e9,p~t=\u00c9n\u00f3:.\u00e9\u0007\u00f9\u0099\u00efs\u00edX\u001e\u008b\u00c8\r\u00a8\t~\u0011Go\u00a5\u00fc\u0017\u0080\u0099\u0080\u009f\u00f3N9\u00d4|\u00be\u0007\u0004\u0001\u00c3/3\u00bf\u00ef7e#0w\u0098\u00d3j\u00c1\u00a0\u00c3\u001eMb\u00fb,$\u00a5\u00b5\u00f5\u00c5\u00d4\u00a4\u00a7\u00c2Q\u0087\u00b6\u00d9\u0086\u0019\u00b2{\u00ab'\u00ea\u0088XU%\u00ea\u00a2\u0007E\u00f4\u0087b\u00d9\u00c5\u00bfDw(\u008d\u0013\u00df\u00ba\u00ca\u00af\u008e\u00d8Q\u00b9\u00b61\u008b\u00cdu\u00f4ga\u00e7\u0081\u001e\u0081\u001eu1\u00f6\u00c8Y\u0017!\u00fb/\u00c0\u008fL\u00b6\u00d7\u00d3\u00a1\u008884\u00d0\u0082\u00a9\u0096~\u00e2\\(R]\u00f4\u00ec\u0084i\u0092\u009aL\u00e2\u00dc\u00c4\u00b0\u0081\u00f7F=\u00ef[\u00d7Q\n\u00a8G4R\u00d5\nU\u00ea\u008c>8\u00f5\u00e4\u00be\u00b9S\u0002,mzW\u00dc\u0010|\u00bd\u0010]Qt\u00eb\u00a1\u009b\u0083\u00b6\u0083\u008a\u0010\u009a\u009c\u0012$b";
                        var17_6 = "\u00c2\u008b\u00fc\u00fd\u0018\u00b0@\u008dS\u009c\u00ce\u0005\u00db\u00e4SjZ4\u00b6,\u00ba\u0001\u0086\u0005\u00b1\u00efd\u00bc\u00b2\"\u000b\u00c6\u00d1*\u00ac|@\u007f\u0006\u00c1xzjB\u00f9\u00d4\u000e\u00ad8\u0081YH\u00e9,p~t=\u00c9n\u00f3:.\u00e9\u0007\u00f9\u0099\u00efs\u00edX\u001e\u008b\u00c8\r\u00a8\t~\u0011Go\u00a5\u00fc\u0017\u0080\u0099\u0080\u009f\u00f3N9\u00d4|\u00be\u0007\u0004\u0001\u00c3/3\u00bf\u00ef7e#0w\u0098\u00d3j\u00c1\u00a0\u00c3\u001eMb\u00fb,$\u00a5\u00b5\u00f5\u00c5\u00d4\u00a4\u00a7\u00c2Q\u0087\u00b6\u00d9\u0086\u0019\u00b2{\u00ab'\u00ea\u0088XU%\u00ea\u00a2\u0007E\u00f4\u0087b\u00d9\u00c5\u00bfDw(\u008d\u0013\u00df\u00ba\u00ca\u00af\u008e\u00d8Q\u00b9\u00b61\u008b\u00cdu\u00f4ga\u00e7\u0081\u001e\u0081\u001eu1\u00f6\u00c8Y\u0017!\u00fb/\u00c0\u008fL\u00b6\u00d7\u00d3\u00a1\u008884\u00d0\u0082\u00a9\u0096~\u00e2\\(R]\u00f4\u00ec\u0084i\u0092\u009aL\u00e2\u00dc\u00c4\u00b0\u0081\u00f7F=\u00ef[\u00d7Q\n\u00a8G4R\u00d5\nU\u00ea\u008c>8\u00f5\u00e4\u00be\u00b9S\u0002,mzW\u00dc\u0010|\u00bd\u0010]Qt\u00eb\u00a1\u009b\u0083\u00b6\u0083\u008a\u0010\u009a\u009c\u0012$b".length();
                        var14_7 = 48;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = lkt.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00c0\"\u0097\u00ff\u00f4<^\n\u00ac?/d\u00ad\u00f1\u008e\u0080\u00c8=$\u00b0\u0092,\u0012\u0010\u00bd\u00afH\u001c\u0006\u00bed\u00f9\u008f\u009c\u00d6\r\u00ce\u00e1r10{\u0081\u00f0i\u00ef@\u0016peZk\u008fz\u00aff\t\u000b:\u00b9\u00c2\u00a8\u00d2m\u008c/\u0083\u00c1T\u00ed\u00f1%\u00b7\u000e=\u00bb\u00a03u\u00bf=p\u00ec\u00a3\u00f2F\u00a9\u0099\u00b0";
                            var17_6 = "\u00c0\"\u0097\u00ff\u00f4<^\n\u00ac?/d\u00ad\u00f1\u008e\u0080\u00c8=$\u00b0\u0092,\u0012\u0010\u00bd\u00afH\u001c\u0006\u00bed\u00f9\u008f\u009c\u00d6\r\u00ce\u00e1r10{\u0081\u00f0i\u00ef@\u0016peZk\u008fz\u00aff\t\u000b:\u00b9\u00c2\u00a8\u00d2m\u008c/\u0083\u00c1T\u00ed\u00f1%\u00b7\u000e=\u00bb\u00a03u\u00bf=p\u00ec\u00a3\u00f2F\u00a9\u0099\u00b0".length();
                            var14_7 = 40;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = lkt.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                lkt.d = var18_3;
                lkt.e = new String[8];
                var1_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var2_11 = 1; var2_11 < 8; ++var2_11) {
                    v9 = v9;
                    v9[var2_11] = (byte)(var20 << var2_11 * 8 >>> 56);
                }
                var1_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_12 = new long[4];
                var4_13 = 0;
                var5_14 = "\u00c7e\u00bc\u00e0\u00a0T\u009e\u00c6~\u0095\u00ce|&\u00dat4";
                var6_15 = "\u00c7e\u00bc\u00e0\u00a0T\u009e\u00c6~\u0095\u00ce|&\u00dat4".length();
                var3_16 = 0;
                while (true) {
                    var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                    v10 = var0_12;
                    v11 = var4_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl77:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "\u00b3\u0093)\u00cfC-\u00ecT\u00b8\u00b1\u00dd\u00fe3^3z";
                    var6_15 = "\u00b3\u0093)\u00cfC-\u00ecT\u00b8\u00b1\u00dd\u00fe3^3z".length();
                    var3_16 = 0;
                    while (true) {
                        var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                        v10 = var0_12;
                        v11 = var4_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl103:
                // 1 sources

                ** continue;
            }
        }
        lkt.b = new String[(int)var0_12[1]];
        m44.a("l", (long)-8220936071834044299L, (long)var20)[0] = "";
        m44.a("l", (long)-8220936071834044299L, (long)var20)[2] = lkt.a("e", (int)13668, (long)(1039117563584784742L ^ var20));
        m44.a("l", (long)-8220936071834044299L, (long)var20)[3] = lkt.a("e", (int)3425, (long)(7858457539575681381L ^ var20));
        m44.a("l", (long)-8220936071834044299L, (long)var20)[4] = lkt.a("e", (int)6454, (long)(8820866480447817015L ^ var20));
        m44.a("l", (long)-8220936071834044299L, (long)var20)[5] = lkt.a("e", (int)19128, (long)(4349310726160340670L ^ var20));
        m44.a("l", (long)-8220936071834044299L, (long)var20)[(int)var0_12[0]] = lkt.a("e", (int)14475, (long)(151487791272502414L ^ var20));
        m44.a("l", (long)-8220936071834044299L, (long)var20)[(int)var0_12[2]] = lkt.a("e", (int)14698, (long)(3741931014923986282L ^ var20));
        m44.a("l", (long)-8220936071834044299L, (long)var20)[(int)var0_12[3]] = lkt.a("e", (int)29730, (long)(3395929067077855265L ^ var20));
    }

    public String C(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("l", (long)-8736588731903642787L, (long)l)[m44.a("v", (Object)this, (long)-8875853021608384679L, (long)l)];
    }

    public static final lkt T(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        switch (n) {
            default: 
        }
        return new lkt();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D85;
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
                throw new RuntimeException("com/zelix/lkt", exception);
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
            lkt.e[n2] = lkt.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lkt.a(n, l);
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
            throw new RuntimeException("com/zelix/lkt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lkt.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
