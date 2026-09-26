/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lk2;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sz;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ZKMProGuardTranslate
extends lk2 {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     */
    public static void main(String[] var0) {
        block34: {
            block37: {
                block35: {
                    block33: {
                        block31: {
                            block30: {
                                block29: {
                                    v0 = var1_1 = prr.a(4234051557461128992L, -1965485518582592033L, MethodHandles.lookup().lookupClass()).a(271189672243232L) ^ 11320057637472L;
                                    var3_2 = v0 ^ 128382090950359L;
                                    v1 = v0 ^ 13728366729322L;
                                    var5_3 = (int)(v1 >>> 32);
                                    var6_4 = (int)(v1 << 32 >>> 48);
                                    var7_5 = (int)(v1 << 48 >>> 48);
                                    var8_6 = v0 ^ 14227775552218L;
                                    var10_7 = v0 ^ 96076431607056L;
                                    var12_8 = v0 ^ 25474148915879L;
                                    var14_9 = m44.a("i", (long)-8105528133021412088L, (long)var1_1);
                                    try {
                                        try {
                                            v2 = var0.length;
                                            if (var14_9 == false) break block29;
                                            if (v2 == 2) break block30;
                                        }
                                        catch (n9 v3) {
                                            throw m44.a("i", (Object)v3, (long)-8073314382158040782L, (long)var1_1);
                                        }
                                        m44.a("v", (Object)m44.a("m", (long)-7549079015163122146L, (long)var1_1), (Object)ZKMProGuardTranslate.a("o", (int)23343, (long)(8351379683302794309L ^ var1_1)), (long)-8339783600963217834L, (long)var1_1);
                                        v2 = 1;
                                    }
                                    catch (n9 v4) {
                                        throw m44.a("i", (Object)v4, (long)-8073314382158040782L, (long)var1_1);
                                    }
                                }
                                m44.a("i", (int)v2, (long)-8618870075285667212L, (long)var1_1);
                            }
                            var15_10 = new File(var0[0]);
                            var16_11 = new File(var0[1]);
                            try {
                                block32: {
                                    try {
                                        try {
                                            try {
                                                if (var14_9 == false) break block31;
                                                if (m44.a("v", (Object)var15_10, (long)-8600243682666443395L, (long)var1_1) == false) break block32;
                                            }
                                            catch (n9 v5) {
                                                throw m44.a("i", (Object)v5, (long)-8073314382158040782L, (long)var1_1);
                                            }
                                            v6 = m44.a("v", (Object)var15_10, (long)-7669210790488416533L, (long)var1_1);
                                            if (var14_9 == false) break block33;
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("i", (Object)v7, (long)-8073314382158040782L, (long)var1_1);
                                        }
                                        if (v6 != false) {
                                        }
                                        ** GOTO lbl59
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("i", (Object)v8, (long)-8073314382158040782L, (long)var1_1);
                                    }
                                }
                                m44.a("v", (Object)m44.a("m", (long)-7549079015163122146L, (long)var1_1), (Object)((String)ZKMProGuardTranslate.a("o", (int)12161, (long)(102594287685538029L ^ var1_1)) + (String)m44.a("v", (Object)var15_10, (long)-8587689927461472855L, (long)var1_1) + (String)ZKMProGuardTranslate.a("o", (int)5154, (long)(1346764745788828489L ^ var1_1))), (long)-8339783600963217834L, (long)var1_1);
                            }
                            catch (n9 v9) {
                                throw m44.a("i", (Object)v9, (long)-8073314382158040782L, (long)var1_1);
                            }
                        }
                        try {
                            try {
                                if (var14_9 != false) break block34;
lbl59:
                                // 2 sources

                                v10 = var16_11;
                                if (var14_9 == false) break block35;
                            }
                            catch (n9 v11) {
                                throw m44.a("i", (Object)v11, (long)-8073314382158040782L, (long)var1_1);
                            }
                            v6 = m44.a("v", (Object)v10, (long)-7669210790488416533L, (long)var1_1);
                        }
                        catch (n9 v12) {
                            throw m44.a("i", (Object)v12, (long)-8073314382158040782L, (long)var1_1);
                        }
                    }
                    try {
                        block36: {
                            try {
                                if (v6 == false) break block36;
                                m44.a("v", (Object)m44.a("m", (long)-7549079015163122146L, (long)var1_1), (Object)((String)ZKMProGuardTranslate.a("o", (int)22649, (long)(2315468722195588880L ^ var1_1)) + (String)m44.a("v", (Object)var16_11, (long)-8587689927461472855L, (long)var1_1) + (String)ZKMProGuardTranslate.a("o", (int)30247, (long)(1752308041316419919L ^ var1_1))), (long)-8339783600963217834L, (long)var1_1);
                                if (var14_9 != false) break block34;
                            }
                            catch (n9 v13) {
                                throw m44.a("i", (Object)v13, (long)-8073314382158040782L, (long)var1_1);
                            }
                        }
                        v10 = var15_10;
                    }
                    catch (n9 v14) {
                        throw m44.a("i", (Object)v14, (long)-8073314382158040782L, (long)var1_1);
                    }
                }
                v15 = new Object[2];
                v15[1] = v10;
                v15[0] = var8_6;
                var17_12 = m44.a("i", (Object)v15, (long)-8371116520941147540L, (long)var1_1);
                v16 = new Object[3];
                v16[2] = var10_7;
                v16[1] = new Properties();
                v16[0] = var17_12;
                var18_13 = m44.a("i", (Object)v16, (long)-8099009468735141373L, (long)var1_1);
                var19_14 = new sz(var5_3, (short)var6_4, (char)var7_5);
                try {
                    try {
                        v17 = new Object[4];
                        v17[3] = var19_14;
                        v17[2] = var16_11;
                        v17[1] = var18_13;
                        v17[0] = var3_2;
                        m44.a("i", (Object)v17, (long)-8554065841047415700L, (long)var1_1);
                        if (var14_9 == false) break block37;
                        if (var19_14.a(var12_8)) {
                        }
                        ** GOTO lbl118
                    }
                    catch (n9 v18) {
                        throw m44.a("i", (Object)v18, (long)-8073314382158040782L, (long)var1_1);
                    }
                    m44.a("v", (Object)m44.a("m", (long)-7549079015163122146L, (long)var1_1), (Object)((String)ZKMProGuardTranslate.a("o", (int)16762, (long)(1110707493232475671L ^ var1_1)) + (String)m44.a("v", (Object)var15_10, (long)-8587689927461472855L, (long)var1_1) + (String)ZKMProGuardTranslate.a("o", (int)31048, (long)(2550058668552603175L ^ var1_1)) + (String)m44.a("v", (Object)var16_11, (long)-8587689927461472855L, (long)var1_1) + "'"), (long)-8339783600963217834L, (long)var1_1);
                }
                catch (n9 v19) {
                    throw m44.a("i", (Object)v19, (long)-8073314382158040782L, (long)var1_1);
                }
            }
            try {
                if (var14_9 != false) break block34;
lbl118:
                // 2 sources

                m44.a("v", (Object)m44.a("m", (long)-7549079015163122146L, (long)var1_1), (Object)((String)ZKMProGuardTranslate.a("o", (int)27658, (long)(8547319611852641124L ^ var1_1)) + (String)var19_14.t() + "'"), (long)-8339783600963217834L, (long)var1_1);
            }
            catch (n9 v20) {
                throw m44.a("i", (Object)v20, (long)-8073314382158040782L, (long)var1_1);
            }
        }
    }

    public void close() {
        long l10 = a ^ 0x3DEBA481F498L;
        long l11 = l10 ^ 0x68E541D0CF5L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("j", (Object)objectArray, (long)5729255953144706933L, (long)l10);
    }

    public String getTranslatedStackTrace(String string) {
        long l10 = a ^ 0x79C98777995DL;
        long l11 = l10 ^ 0x4D85C1D870C6L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l11;
        objectArray[1] = new Properties();
        objectArray[0] = string;
        return m44.a("o", (Object)objectArray, (long)4200894353105747925L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                ZKMProGuardTranslate.a = prr.a(-6530813132343206684L, -833982330432999747L, MethodHandles.lookup().lookupClass()).a(118660867862472L);
                ZKMProGuardTranslate.d = new HashMap<K, V>(13);
                var0 = ZKMProGuardTranslate.a ^ 92700075130987L;
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
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "\u0089\u00f7\u00ec].\u00b4\u00d8 \u00e9\u00e3\u00c9\u00ebo\u00ad\u0097\f(\u008b\u00d3\u0016\u00a1#\u00e8\u00e6u`\u00d2\u00d3\u00e6\u00b6w\u00de\u00d0\u00d9\u000e\u00c9fpT\u00f9\u00b4\u009d`\u009a\u00d7C\u0090\u00e4\u0014\u009f1}-1\u009ec\u008c@1ATl&$\u00fe\u008eM^\u001f\u00ce\u00d5\u0095\u00e7\u000b\u00a7j\u00d6C5\u00c2\u008b\u008d\u00ff\u00f0\u0012\u00ca\u000f\u00fc\u00f0\u00c8\u00a1g\u0088<\u0081m\u00d4C\u00df0\u0093\u00b3\u0012a\u00dc\u00a8A.0\u00f6\u009d\u00b0\u00e6}\u008b\u00ec\u00a7\u00e1u\u00f5\b\u0003\u0088\u00cc\u00e0\u00f6\u00d4\u00ee\u0002\u0001C\u00da\u00d1\u00c7\u001bt2\u00d4u\u00c8^\u0092>\u00fa\u00c8\tc\u0001\u00afQl\u001aq\u008c\u00ea\u00e1\u00d3\u00bf\u00b3\u00f8\u001c\u00a9\u00a0\u0090\u0000\u009a\u00c6\u0012\u00c0\u00e8Q~\u00f0F\u00be\u0093u,\u009c\u00da\u0092\u00a5\u00f65F3'\u00ecO\u0086\u00a2\u00a0\"\u00e0\u00f9;c\f\u0001\u009c\u00b7\u009c\u0085\u00e3\u00d28jf\u00ce\u00cc0.b\u0081_\u00d8\r\u0013C8\u00a8\bKD\u00c41A4\u0002\u00bb\\d\bm\u00db\u00f5\u0007\u00a2\u00b8\u0011\u0005\u00fa\u00d9$\u00aa\u0083\u00c7qk\u00ff\u0010\u001e J\u0089\u00a9\u0083\u00b5\u00e70w\u0081\u0094Z\u0083\u00a2\u00f3\u00f6\u00eb\u00fa\u00f6\u0093!\u00e7\u00c0i\u00a2'`\u00aa/\u008c\u00f3-\u00e4->y\u0086I\u0098\u009f\u00fc\u00fb\u0086!a\u00a6Xh8\u0002\u00f3`\u00e6\u00edVT\u0010\u00a3I;-$<J>\u00827\u00fb\u00ff\u0099\u00e5\u0084\u00ed";
                var8_6 = "\u0089\u00f7\u00ec].\u00b4\u00d8 \u00e9\u00e3\u00c9\u00ebo\u00ad\u0097\f(\u008b\u00d3\u0016\u00a1#\u00e8\u00e6u`\u00d2\u00d3\u00e6\u00b6w\u00de\u00d0\u00d9\u000e\u00c9fpT\u00f9\u00b4\u009d`\u009a\u00d7C\u0090\u00e4\u0014\u009f1}-1\u009ec\u008c@1ATl&$\u00fe\u008eM^\u001f\u00ce\u00d5\u0095\u00e7\u000b\u00a7j\u00d6C5\u00c2\u008b\u008d\u00ff\u00f0\u0012\u00ca\u000f\u00fc\u00f0\u00c8\u00a1g\u0088<\u0081m\u00d4C\u00df0\u0093\u00b3\u0012a\u00dc\u00a8A.0\u00f6\u009d\u00b0\u00e6}\u008b\u00ec\u00a7\u00e1u\u00f5\b\u0003\u0088\u00cc\u00e0\u00f6\u00d4\u00ee\u0002\u0001C\u00da\u00d1\u00c7\u001bt2\u00d4u\u00c8^\u0092>\u00fa\u00c8\tc\u0001\u00afQl\u001aq\u008c\u00ea\u00e1\u00d3\u00bf\u00b3\u00f8\u001c\u00a9\u00a0\u0090\u0000\u009a\u00c6\u0012\u00c0\u00e8Q~\u00f0F\u00be\u0093u,\u009c\u00da\u0092\u00a5\u00f65F3'\u00ecO\u0086\u00a2\u00a0\"\u00e0\u00f9;c\f\u0001\u009c\u00b7\u009c\u0085\u00e3\u00d28jf\u00ce\u00cc0.b\u0081_\u00d8\r\u0013C8\u00a8\bKD\u00c41A4\u0002\u00bb\\d\bm\u00db\u00f5\u0007\u00a2\u00b8\u0011\u0005\u00fa\u00d9$\u00aa\u0083\u00c7qk\u00ff\u0010\u001e J\u0089\u00a9\u0083\u00b5\u00e70w\u0081\u0094Z\u0083\u00a2\u00f3\u00f6\u00eb\u00fa\u00f6\u0093!\u00e7\u00c0i\u00a2'`\u00aa/\u008c\u00f3-\u00e4->y\u0086I\u0098\u009f\u00fc\u00fb\u0086!a\u00a6Xh8\u0002\u00f3`\u00e6\u00edVT\u0010\u00a3I;-$<J>\u00827\u00fb\u00ff\u0099\u00e5\u0084\u00ed".length();
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
                    var9_3[var7_4++] = ZKMProGuardTranslate.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "V\u00a5(\u0003$\u00c5%\u00c8c\u00ac\u0098W5\u0003\u00b9\u00a4\u00ce\u00b0\u00b2\u00ee\u00b9\u000bmf\u0018\u00183.G\u0017\u000146\u00f21\u00b3\u00c9\u00908\u00ad\u00f1\u00e5M\u00a8\u00e28\u00b6%\u00fc";
                    var8_6 = "V\u00a5(\u0003$\u00c5%\u00c8c\u00ac\u0098W5\u0003\u00b9\u00a4\u00ce\u00b0\u00b2\u00ee\u00b9\u000bmf\u0018\u00183.G\u0017\u000146\u00f21\u00b3\u00c9\u00908\u00ad\u00f1\u00e5M\u00a8\u00e28\u00b6%\u00fc".length();
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
                    var9_3[var7_4++] = ZKMProGuardTranslate.b(var10_9).intern();
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
        ZKMProGuardTranslate.b = var9_3;
        ZKMProGuardTranslate.c = new String[8];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x25BF;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ZKMProGuardTranslate", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            ZKMProGuardTranslate.c[n11] = ZKMProGuardTranslate.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ZKMProGuardTranslate.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ZKMProGuardTranslate" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ZKMProGuardTranslate.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

