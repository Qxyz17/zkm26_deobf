/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lkq;
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

public class lko
extends lkq {
    private static final String f;
    private static final String h;
    private static final Map m;
    private static final String[] l;
    private static final String a;
    private static final String i;
    private static final String b;
    private static final long j;
    private static final String g;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String[] k;

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

    public static String y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = j ^ l;
        return lko.a("i", (int)19120, (long)(0x64E2A1326C050255L ^ l));
    }

    public static String x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = j ^ l;
        return lko.a("i", (int)16202, (long)(0x7B623F55F21464ECL ^ l));
    }

    public static String g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = j ^ l;
        return lko.a("i", (int)26748, (long)(0x77182906F0571B56L ^ l));
    }

    public static String d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = j ^ l;
        return lko.a("i", (int)23613, (long)(0x22803D57866A94B0L ^ l));
    }

    public static String M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = j ^ l;
        return lko.a("i", (int)28623, (long)(0x281CE5D767328C2L ^ l));
    }

    public static String b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = j ^ l;
        return lko.a("i", (int)11333, (long)(0x76A4C6D00B225C8AL ^ l));
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lko" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static String a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = j ^ l;
        return lko.a("i", (int)2585, (long)(0x236DBD40F115FAE9L ^ l));
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lko.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x49FB;
        if (lko.l[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])m.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lko", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n2].getBytes("ISO-8859-1");
            lko.l[n2] = lko.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return lko.l[n2];
    }

    public static String c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = j ^ l;
        return lko.a("i", (int)764, (long)(0x450EE402402DA009L ^ l));
    }

    public static String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = j ^ l;
        return lko.a("i", (int)13482, (long)(0x6A9860FF5EC4E188L ^ l));
    }

    public long j(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = j ^ l;
        return string.hashCode() + ((String)((Object)lko.a("i", (int)1849, (long)(0x6B1C4AC34103EFDBL ^ l)))).hashCode() + ((String)((Object)lko.a("i", (int)26900, (long)(0x6E061FD1F7D301E8L ^ l)))).hashCode();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                lko.j = prr.a((long)8294088378647104038L, (long)639667069031280498L, MethodHandles.lookup().lookupClass()).a(35275836352956L);
                lko.m = new HashMap<K, V>(13);
                var0 = lko.j ^ 15855785661719L;
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
                var9_3 = new String[20];
                var7_4 = 0;
                var6_5 = "M\u0004\u0085\u0085\u00b9\u00f71\b\f\u0000\u00af<\"7\u0019\u008d\u00e65EQ\u00853\u00dc\u00db\u00a0\u00ea]|\u00d4\u0080\u00df\u00e2\u00bd\u00d5\u000f\u00c2\u0015B\u00e8\" \u00f9|\u000f\u0091D\u00c7\u00da\u001ek&\u00e9\u00d9v\u00feM\u00ed\u0003p\u009c\u0089+\u0003\u00b6\u00028\u00e2Q]\u009c\u0089\u001am \u008e\u00d4Q\u00c0\u00c8\u00c0\u00bfV\u00cc\u0014\t.xl9~0C\u0093A\u009a\u0098\u00feA(\u0088\u00bc\r\u00a2\u0018J) \u009dY7\u00ab\u0003\u00a3G\u0090\f\u0096G\u0011N\b\u0097'\u0097\u00c7\u00b7\u00a0$X\u0011\u00afr/00\u00d4\u00d3\u00b0. y\u00ed\u00ee\u00fa\u00e2\u00df-\u00fc\\\u0087\u00d3\u00d9N8\u00e6\u00f2wX\u009e\u00a4\u0010\u00b3\u00f0\u0095h\u0003Q\u00f4\u00ac\u0091\u0095\u00a1(\u00f2\u0018%\u00c5T7\u001cD\u008b\u00b7\u00b5{\u00d0\u00b4a*p\u00b1~\u00d6\u009e\u00d07\u00a5\u00cf\u00c5\u009e\u009b\u00c9<\u0089\u0096\u0089\u0007u\u0089\u0019,j\u00c2 \u00aa9\u0011Dv\u00d5!\u009d\u009f\u00fb\u0014\u0004uo\u0000\u0089\u00ff\u00d8M\u00a2=Lz\u00f3n\u008f\u00c9d\u0016\u00ff7\u0084 B|b\u0000B=\u0088\u00bf\u00d7^O<a\u00a4\u00d8\u00a2\u00c4-\u00b4\u009e\u0082\u00bf\u0002g\u00ea[\u00ae<W\u00f9\u00a5\u0002(\u0093\u00d7c\u0003\u00cep\u00d9\u008588{#I\u00c5n2[dg\u0006\u00b9+\u00b7\u00c5\u0006r\u00aa{\u00c1\u00de\u000f.\u00b1\u00b3\u00a7\u0019\u00d6\u00ce\u00c8\u0087(\u0010\u009b\u00c1\u00b1X\u00d0T\n\u00ae\u0080OU\u00c1\u00c3f\u00ec\u00fb\u00f9f\u00df\u00a9n\u00acB\u00c6\u00b1u\u00bd\u00cf\u00a5R\u00fe\u0086\u0097~\u00bb'\u00c1\u00c6\u00f9\u0018W\u00d6'\u0086<\u00c8/\u00a2O\u00fd\r\u00da\u0006~\u00b4\u00ab*\u00c5\u0012!<5R\u00e0 \u00ac\u00bc)\u00b1\u00eae\u0098\u00dee\u00dd)5\u00aa\nYQ\u0082\u008bQ\u0003V\u0090\u001fA\u00d4-\u00f5\u00e9\u00959\u00e1\u00de \u00ef\u00fe\u008a\u00c2v\u00bft\u00e5=\u00bcAc4*\u0005\u008a\u0090 8\u0003m8\u0003\u00f9\u00b2T(\u00f0\u00a6\u00f9\u00cc. \u00f13\u00a7\u008f\u00a9\u00ef\u00b8\u001fw$\u00f8Wa\u00dae \u00f5\u0005\u00a4\u00b9\u00c0\u0003\u00f1\u00a2\u008d\u00fb\u009b,\u00ba\u0095\u0017\u0007(\u001e\u00d2DR\u0081\u0006#\u00c1\u00ab\u001c;\u00a8\u0005\u00cd\tx\u001a\u00e5'ar\u00a0\u0013\u0017\u0016\u0011\u00b5\u00ce\u00cc\u00f31\u008a\tY\u0005\u00f6\u00dc\u00eb\u00ca\u00af \u00cc\u00f4Y\u0096\u0097w\u00d1\u00cf\u0000\u009b\u00d7\u0085\u0085\u00fc@\u0096\u001b\u0081\u00f0$[c\u00b3m\u00fd\u0082\u00d2}\u0094jv\u00f7 \u0010I\u0090\u00ac\u00e1\u00be\u0004`\u008e\u00c3z\u00d4\u00caJ|(W\u00ace\u0099%jB\u0018\u00c5T;\u00c8\u00d7X#F\u0018\u00ba)\r_I-g\u00a38G)\u0090:\u0012\u007fg\t\u0010\u007f>\u00e1\u00fbk\u000f";
                var8_6 = "M\u0004\u0085\u0085\u00b9\u00f71\b\f\u0000\u00af<\"7\u0019\u008d\u00e65EQ\u00853\u00dc\u00db\u00a0\u00ea]|\u00d4\u0080\u00df\u00e2\u00bd\u00d5\u000f\u00c2\u0015B\u00e8\" \u00f9|\u000f\u0091D\u00c7\u00da\u001ek&\u00e9\u00d9v\u00feM\u00ed\u0003p\u009c\u0089+\u0003\u00b6\u00028\u00e2Q]\u009c\u0089\u001am \u008e\u00d4Q\u00c0\u00c8\u00c0\u00bfV\u00cc\u0014\t.xl9~0C\u0093A\u009a\u0098\u00feA(\u0088\u00bc\r\u00a2\u0018J) \u009dY7\u00ab\u0003\u00a3G\u0090\f\u0096G\u0011N\b\u0097'\u0097\u00c7\u00b7\u00a0$X\u0011\u00afr/00\u00d4\u00d3\u00b0. y\u00ed\u00ee\u00fa\u00e2\u00df-\u00fc\\\u0087\u00d3\u00d9N8\u00e6\u00f2wX\u009e\u00a4\u0010\u00b3\u00f0\u0095h\u0003Q\u00f4\u00ac\u0091\u0095\u00a1(\u00f2\u0018%\u00c5T7\u001cD\u008b\u00b7\u00b5{\u00d0\u00b4a*p\u00b1~\u00d6\u009e\u00d07\u00a5\u00cf\u00c5\u009e\u009b\u00c9<\u0089\u0096\u0089\u0007u\u0089\u0019,j\u00c2 \u00aa9\u0011Dv\u00d5!\u009d\u009f\u00fb\u0014\u0004uo\u0000\u0089\u00ff\u00d8M\u00a2=Lz\u00f3n\u008f\u00c9d\u0016\u00ff7\u0084 B|b\u0000B=\u0088\u00bf\u00d7^O<a\u00a4\u00d8\u00a2\u00c4-\u00b4\u009e\u0082\u00bf\u0002g\u00ea[\u00ae<W\u00f9\u00a5\u0002(\u0093\u00d7c\u0003\u00cep\u00d9\u008588{#I\u00c5n2[dg\u0006\u00b9+\u00b7\u00c5\u0006r\u00aa{\u00c1\u00de\u000f.\u00b1\u00b3\u00a7\u0019\u00d6\u00ce\u00c8\u0087(\u0010\u009b\u00c1\u00b1X\u00d0T\n\u00ae\u0080OU\u00c1\u00c3f\u00ec\u00fb\u00f9f\u00df\u00a9n\u00acB\u00c6\u00b1u\u00bd\u00cf\u00a5R\u00fe\u0086\u0097~\u00bb'\u00c1\u00c6\u00f9\u0018W\u00d6'\u0086<\u00c8/\u00a2O\u00fd\r\u00da\u0006~\u00b4\u00ab*\u00c5\u0012!<5R\u00e0 \u00ac\u00bc)\u00b1\u00eae\u0098\u00dee\u00dd)5\u00aa\nYQ\u0082\u008bQ\u0003V\u0090\u001fA\u00d4-\u00f5\u00e9\u00959\u00e1\u00de \u00ef\u00fe\u008a\u00c2v\u00bft\u00e5=\u00bcAc4*\u0005\u008a\u0090 8\u0003m8\u0003\u00f9\u00b2T(\u00f0\u00a6\u00f9\u00cc. \u00f13\u00a7\u008f\u00a9\u00ef\u00b8\u001fw$\u00f8Wa\u00dae \u00f5\u0005\u00a4\u00b9\u00c0\u0003\u00f1\u00a2\u008d\u00fb\u009b,\u00ba\u0095\u0017\u0007(\u001e\u00d2DR\u0081\u0006#\u00c1\u00ab\u001c;\u00a8\u0005\u00cd\tx\u001a\u00e5'ar\u00a0\u0013\u0017\u0016\u0011\u00b5\u00ce\u00cc\u00f31\u008a\tY\u0005\u00f6\u00dc\u00eb\u00ca\u00af \u00cc\u00f4Y\u0096\u0097w\u00d1\u00cf\u0000\u009b\u00d7\u0085\u0085\u00fc@\u0096\u001b\u0081\u00f0$[c\u00b3m\u00fd\u0082\u00d2}\u0094jv\u00f7 \u0010I\u0090\u00ac\u00e1\u00be\u0004`\u008e\u00c3z\u00d4\u00caJ|(W\u00ace\u0099%jB\u0018\u00c5T;\u00c8\u00d7X#F\u0018\u00ba)\r_I-g\u00a38G)\u0090:\u0012\u007fg\t\u0010\u007f>\u00e1\u00fbk\u000f".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = lko.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "Qz\u00e4\u000b\u0006M\u0016\u00fb(\u00aa\u0014\u0006\"kL\u000e\u00d1PH\u00f6\u0083\u0087\u0080\u00b9(G\n\u001fyr\u00aa\u00a7\u00d2\u00bf\u0005\u0002\u00ff\u00b1\u00a3\u00cc\u00fb\u00ca\u0094\u0098\u00f10\u0004D\u0084\u00d9}<\u008b\u00fb\u0099\u0092\u00bbr\u00a1)\u0001\u00cf\u00db=V";
                    var8_6 = "Qz\u00e4\u000b\u0006M\u0016\u00fb(\u00aa\u0014\u0006\"kL\u000e\u00d1PH\u00f6\u0083\u0087\u0080\u00b9(G\n\u001fyr\u00aa\u00a7\u00d2\u00bf\u0005\u0002\u00ff\u00b1\u00a3\u00cc\u00fb\u00ca\u0094\u0098\u00f10\u0004D\u0084\u00d9}<\u008b\u00fb\u0099\u0092\u00bbr\u00a1)\u0001\u00cf\u00db=V".length();
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
                    var9_3[var7_4++] = lko.b(var10_9).intern();
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
        lko.k = var9_3;
        lko.l = new String[20];
        lko.e = lko.a("i", (int)18271, (long)(7013967931060191642L ^ var0));
        lko.c = lko.a("i", (int)15165, (long)(5941943082250305014L ^ var0));
        lko.g = lko.a("i", (int)12409, (long)(4370339566807840441L ^ var0));
        lko.d = lko.a("i", (int)32735, (long)(8370852623624583446L ^ var0));
        lko.b = lko.a("i", (int)18923, (long)(4018938593224068904L ^ var0));
        lko.h = lko.a("i", (int)6516, (long)(9020133816492253109L ^ var0));
        lko.a = lko.a("i", (int)10596, (long)(2413138125001125809L ^ var0));
        lko.i = lko.a("i", (int)818, (long)(2105128940293539325L ^ var0));
        lko.f = lko.a("i", (int)3692, (long)(8410873384881572001L ^ var0));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lko.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
