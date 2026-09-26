/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.v5;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ht {
    private static Map H;
    private static File E;
    public static final String Q;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;

    /*
     * Unable to fully structure code
     */
    public static void V(Object[] var0) {
        block8: {
            var1_1 = (Long)var0[0];
            var3_2 = (var1_1 = ht.a ^ var1_1) ^ 131747138875508L;
            var5_3 = m44.a("l", (long)6776972612212674012L, (long)var1_1);
            try {
                block12: {
                    var6_4 = m44.a("l", (long)6425937827313092765L, (long)var1_1);
                    var8_6 = m44.a("s", (Object)m44.a("h", (long)6773952810183312553L, (long)var1_1), (Object)new v5((String)ht.a("b", (int)18225, (long)(3833751401536114690L ^ var1_1)), var3_2, (String)ht.a("b", (int)16060, (long)(6283598704199084425L ^ var1_1))), (long)6351868867198172178L, (long)var1_1);
                    if (var8_6 == null) break block12;
                    var9_7 = 0;
                    while (var9_7 < ((CallSite)var8_6).length) {
                        block9: {
                            block10: {
                                block11: {
                                    var10_8 = new File((File)m44.a("h", (long)6773952810183312553L, (long)var1_1), (String)var8_6[var9_7]);
                                    var11_9 = m44.a("s", (Object)var10_8, (long)6448981002358909797L, (long)var1_1);
                                    v0 = var5_3;
                                    if (var1_1 <= 0L) ** GOTO lbl20
                                    if (v0 == false) break block8;
                                    try {
                                        block13: {
                                            v0 = var5_3;
lbl20:
                                            // 2 sources

                                            if (var1_1 <= 0L) break block9;
                                            if (v0 == false) break block10;
                                            break block13;
                                            catch (Throwable v1) {
                                                throw m44.a("l", (Object)v1, (long)5165071807691592962L, (long)var1_1);
                                            }
                                        }
                                        if (var6_4 - var11_9 <= ht.e) break block11;
                                    }
                                    catch (Throwable v2) {
                                        throw m44.a("l", (Object)v2, (long)5165071807691592962L, (long)var1_1);
                                    }
                                    var13_10 = m44.a("s", (Object)var10_8, (long)6533559439280759513L, (long)var1_1);
                                }
                                ++var9_7;
                            }
                            v0 = var5_3;
                        }
                        if (v0 != false) continue;
                    }
                }
                if (var1_1 >= 0L) {
                    // empty if block
                }
            }
            catch (Throwable var6_5) {
                m44.a("s", (Object)var6_5, (long)6584812015428891569L, (long)var1_1);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String c(String var0, long var1_1) {
        block16: {
            block15: {
                block14: {
                    block13: {
                        var1_1 = ht.a ^ var1_1;
                        var3_2 = m44.a("j", (long)-5117644613827151678L, (long)var1_1);
                        try {
                            try {
                                try {
                                    v0 = ht.H.size();
                                    if (var3_2 != false) break block13;
                                    if (v0 != 0) {
                                    }
                                    ** GOTO lbl25
                                }
                                catch (n9 v1) {
                                    throw m44.a("j", (Object)v1, (long)-6451284072168131372L, (long)var1_1);
                                }
                                v2 = var0;
                                if (var3_2 != false) break block14;
                            }
                            catch (n9 v3) {
                                throw m44.a("j", (Object)v3, (long)-6451284072168131372L, (long)var1_1);
                            }
                            v0 = v2.indexOf((String)ht.a("b", (int)28159, (long)(2729732719893748507L ^ var1_1)));
                        }
                        catch (n9 v4) {
                            throw m44.a("j", (Object)v4, (long)-6451284072168131372L, (long)var1_1);
                        }
                    }
                    try {
                        if (v0 != -1) break block15;
lbl25:
                        // 2 sources

                        v2 = var0;
                    }
                    catch (n9 v5) {
                        throw m44.a("j", (Object)v5, (long)-6451284072168131372L, (long)var1_1);
                    }
                }
                return v2;
            }
            var4_3 = ht.H.entrySet();
            for (Map.Entry<K, V> var6_5 : var4_3) {
                var7_6 = (String)var6_5.getKey();
                var8_7 = (String)var6_5.getValue();
                v6 = var0;
                if (var3_2 == false) {
                    v7 /* !! */  = var9_8 = v6.indexOf(var7_6);
                    if (var1_1 >= 0L) {
                        if (v7 /* !! */  > -1) {
                            var10_9 = new StringBuilder();
                            var10_9.append(var0.substring(0, var9_8));
                            var10_9.append(var8_7);
                            var10_9.append(var0.substring(var9_8 + var7_6.length()));
                            return var10_9.toString();
                        }
                        v7 /* !! */  = (int)var3_2;
                    }
                    if (v7 /* !! */  == 0) continue;
                }
                break block16;
            }
            v6 = var0;
        }
        return v6;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    ht.a = prr.a(8715760288977667236L, -6147339406537910546L, MethodHandles.lookup().lookupClass()).a(147891843325351L);
                    var14 = ht.a ^ 42523158579861L;
                    var16_1 = var14 ^ 82313240765532L;
                    ht.d = new HashMap<K, V>(13);
                    var5_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var6_3 = 1; var6_3 < 8; ++var6_3) {
                        v2 = v2;
                        v2[var6_3] = (byte)(var14 << var6_3 * 8 >>> 56);
                    }
                    var5_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var12_4 = new String[6];
                    var10_5 = 0;
                    var9_6 = "\u00df9Y\u00e9>w\u00dbS\u00aeh?\u00a9\n?u\u00a6\u00fd\u0010\u00a2Y\u00b7\u00bf\u00ad\u00a6 t)m#X\u0088}\u0019i\u00b9\u00c1\u00a3P\u0085\u00c5\tH_X\u0094\u00e3\u00d8\u00c4=L\u00f5\u008d\u00c9$W\u00f1X\u0010\u00f2\u00f3\u0010h\u00f9\u00d4\u00b9jX\u008f\u00f3\u00e7\u008c\u00ea\u001e\u00c2\u0010\b\u00fa\b\u00b3\u00c4\u0003:\u00d7\f~<}\u0088(\u0083.";
                    var11_7 = "\u00df9Y\u00e9>w\u00dbS\u00aeh?\u00a9\n?u\u00a6\u00fd\u0010\u00a2Y\u00b7\u00bf\u00ad\u00a6 t)m#X\u0088}\u0019i\u00b9\u00c1\u00a3P\u0085\u00c5\tH_X\u0094\u00e3\u00d8\u00c4=L\u00f5\u008d\u00c9$W\u00f1X\u0010\u00f2\u00f3\u0010h\u00f9\u00d4\u00b9jX\u008f\u00f3\u00e7\u008c\u00ea\u001e\u00c2\u0010\b\u00fa\b\u00b3\u00c4\u0003:\u00d7\f~<}\u0088(\u0083.".length();
                    var8_8 = 24;
                    var7_9 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v3 = ++var7_9;
                        v4 = var9_6.substring(v3, v3 + var8_8);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var12_4[var10_5++] = ht.a(var13_10).intern();
                        if ((var7_9 += var8_8) < var11_7) {
                            var8_8 = var9_6.charAt(var7_9);
                            ** continue;
                        }
                        var9_6 = "\u0096S\u00b5\u008e\u009c\u008f\u00ef\u009a\u00bd\u00e6\u00f5>\u00a9l\u009cx\u0010\u001b\u00fd,\u0007/\u008eR?\u00e2\u0084\u00b0\u00dc\u0011\u00d0L\u00a0";
                        var11_7 = "\u0096S\u00b5\u008e\u009c\u008f\u00ef\u009a\u00bd\u00e6\u00f5>\u00a9l\u009cx\u0010\u001b\u00fd,\u0007/\u008eR?\u00e2\u0084\u00b0\u00dc\u0011\u00d0L\u00a0".length();
                        var8_8 = 16;
                        var7_9 = -1;
lbl36:
                        // 2 sources

                        while (true) {
                            v6 = ++var7_9;
                            v4 = var9_6.substring(v6, v6 + var8_8);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl41:
                    // 1 sources

                    while (true) {
                        var12_4[var10_5++] = ht.a(var13_10).intern();
                        if ((var7_9 += var8_8) < var11_7) {
                            var8_8 = var9_6.charAt(var7_9);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var13_10 = var5_2.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl53:
                    // 1 sources

                    ** continue;
                }
            }
            ht.b = var12_4;
            ht.c = new String[6];
            var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var14 >>> 56);
            for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                v9 = v9;
                v9[var1_12] = (byte)(var14 << var1_12 * 8 >>> 56);
            }
            break block14;
lbl67:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_13 = 2114643235268341695L;
        var4_14 = var0_11.doFinal(new byte[]{(byte)(var2_13 >>> 56), (byte)(var2_13 >>> 48), (byte)(var2_13 >>> 40), (byte)(var2_13 >>> 32), (byte)(var2_13 >>> 24), (byte)(var2_13 >>> 16), (byte)(var2_13 >>> 8), (byte)var2_13});
        ** while (true)
        ht.e = ((long)var4_14[0] & 255L) << 56 | ((long)var4_14[1] & 255L) << 48 | ((long)var4_14[2] & 255L) << 40 | ((long)var4_14[3] & 255L) << 32 | ((long)var4_14[4] & 255L) << 24 | ((long)var4_14[5] & 255L) << 16 | ((long)var4_14[6] & 255L) << 8 | (long)var4_14[7] & 255L;
        ht.Q = m44.a("i", (Object)ht.a("b", (int)28905, (long)(7427919181256532859L ^ var14)), (Object)m44.a("i", (Object)ht.a("b", (int)24138, (long)(3053619906664467929L ^ var14)), (long)126360032817212031L, (long)var14), (long)319407544152942450L, (long)var14);
        m44.a("j", (File)new File((String)m44.a("m", (long)1834519355306115406L, (long)var14)), (long)1919888593938546700L, (long)var14);
        v10 = new Object[1];
        v10[0] = var16_1;
        ht.H = m44.a("i", (Object)v10, (long)15990467267880154L, (long)var14);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Y(Object[] objectArray) {
        boolean bl2;
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l10;
        block9: {
            boolean bl3;
            block8: {
                File file = (File)objectArray[0];
                l10 = (Long)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite4 = m44.a("q", (Object)file, (long)-2380548546048904658L, (long)l10);
                callSite3 = m44.a("n", (long)-2416485488879186522L, (long)l10);
                callSite2 = m44.a("q", (Object)file, (long)-2418922983055317453L, (long)l10);
                try {
                    try {
                        try {
                            bl3 = ((String)((Object)callSite4)).startsWith((String)((Object)ht.a("b", (int)12120, (long)(0x546F8D306330B816L ^ l10))));
                            if (callSite3 == false) break block8;
                            if (!bl3) return false;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)-4047528118643911304L, (long)l10);
                        }
                        callSite = callSite4;
                        if (l10 < 0L || callSite3 == false) break block9;
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)-4047528118643911304L, (long)l10);
                    }
                    bl3 = ((String)((Object)callSite)).endsWith((String)((Object)ht.a("b", (int)16060, (long)(0x57339C55AFE0A9F3L ^ l10))));
                }
                catch (n9 n94) {
                    throw m44.a("n", (Object)n94, (long)-4047528118643911304L, (long)l10);
                }
            }
            if (!bl3) return false;
            callSite = callSite2;
        }
        try {
            if (callSite == null) return false;
            bl2 = new File((String)((Object)callSite2)).equals(new File((String)((Object)m44.a("j", (long)-2473900076579601007L, (long)l10))));
            if (callSite3 == false) return bl2;
        }
        catch (n9 n95) {
            throw m44.a("n", (Object)n95, (long)-4047528118643911304L, (long)l10);
        }
        if (!bl2) return false;
        return true;
    }

    public static File n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x62781FD77CB8L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = null;
        objectArray2[0] = l11;
        return m44.a("o", (Object)objectArray2, (long)2308267461225591779L, (long)l10);
    }

    public static String p(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l10 = a ^ l10;
        Iterator iterator = H.entrySet().iterator();
        CallSite callSite = m44.a("i", (long)-4248744017440914127L, (long)l10);
        while (iterator.hasNext()) {
            Object object;
            block6: {
                block7: {
                    String string2;
                    block5: {
                        Map.Entry entry = iterator.next();
                        try {
                            try {
                                string2 = (String)entry.getValue();
                                if (callSite != false) break block5;
                                object = string2.equals(string);
                                if (l10 <= 0L) break block6;
                                if (!object) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)n92, (long)-2626869806276409049L, (long)l10);
                            }
                            string2 = (String)entry.getKey();
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)n93, (long)-2626869806276409049L, (long)l10);
                        }
                    }
                    return string2;
                }
                object = callSite;
            }
            if (!object) continue;
        }
        return null;
    }

    public static File M(Object[] objectArray) {
        CallSite callSite;
        block4: {
            CallSite callSite2;
            block5: {
                long l10 = (Long)objectArray[0];
                String string = (String)objectArray[1];
                l10 = a ^ l10;
                callSite2 = m44.a("l", (Object)ht.a("b", (int)18225, (long)(0x353474D3DF67492AL ^ l10)), (Object)ht.a("b", (int)16060, (long)(0x57339FFF703430A1L ^ l10)), (Object)m44.a("h", (long)5127812673570626945L, (long)l10), (long)6651497705487155144L, (long)l10);
                CallSite callSite3 = m44.a("l", (long)4612916594025939004L, (long)l10);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != false) break block4;
                        m44.a("s", (Object)callSite, (long)6902488354262106239L, (long)l10);
                        if (string == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)6811211974970936362L, (long)l10);
                    }
                    H.put(m44.a("s", (Object)callSite2, (long)4654280781547617772L, (long)l10), string);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)6811211974970936362L, (long)l10);
                }
            }
            callSite = callSite2;
        }
        return callSite;
    }

    public static String u(Object[] objectArray) {
        String string = (String)objectArray[0];
        return (String)H.get(string);
    }

    public static boolean E(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0xA9967954890L;
        File file = new File(string);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = file;
        return (boolean)m44.a("m", (Object)objectArray2, (long)-8556726065788159492L, (long)l10);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5C8D;
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
                throw new RuntimeException("com/zelix/ht", exception);
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
            ht.c[n11] = ht.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ht.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ht" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ht.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

