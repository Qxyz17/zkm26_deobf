/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.v2;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ph
extends v2 {
    List T;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long g;

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ph.b("n", (int)4083, (long)(0x54BF28D2BC568CE4L ^ l));
    }

    public ph(int n, long l) {
        long l2 = (l = a ^ l) ^ 0xDF7C233E641L;
        super(l2, n);
        m44.a("w", (Object)((Object)this), new ArrayList(), (long)3066282567724325238L, (long)l);
    }

    void S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        m44.a("r", (Object)((Object)this), (long)2124198937404010113L, (long)l).add(string);
    }

    protected void O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lqq lqq2 = (lqq)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x715D5D31B238L;
        long l4 = l2 ^ 0x15A687E89667L;
        long l5 = l2 ^ 0x67FDC4F267BAL;
        long l6 = l2 ^ 0x383C4EEFE8BEL;
        Iterator iterator = m44.a("t", (Object)((Object)this), (long)-4551847753277131985L, (long)l).iterator();
        CallSite callSite = m44.a("j", (long)-2447378320742416373L, (long)l);
        while (iterator.hasNext()) {
            CallSite callSite2;
            block8: {
                block9: {
                    Object object;
                    block5: {
                        Object object2;
                        block6: {
                            block7: {
                                object = (String)iterator.next();
                                try {
                                    try {
                                        if (l <= 0L) break block5;
                                        object2 = object;
                                        if (callSite != null) break block6;
                                        if (((String)object2).charAt(0) != (int)g) break block7;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)((Object)n92), (long)-4434998399597333064L, (long)l);
                                    }
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l4;
                                    objectArray2[0] = (String)((Object)ph.b("n", (int)14388, (long)(0x2F832C77F69B4788L ^ l))) + (String)object + "'";
                                    m44.a("u", (Object)lqq2, (Object)objectArray2, (long)-4255967806691996554L, (long)l);
                                    callSite2 = callSite;
                                    if (l < 0L) break block8;
                                    if (callSite2 == null) break block9;
                                }
                                catch (n9 n93) {
                                    throw m44.a("j", (Object)((Object)n93), (long)-4434998399597333064L, (long)l);
                                }
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = object;
                            objectArray3[0] = l6;
                            object = m44.a("j", (Object)objectArray3, (long)-2683245913603925806L, (long)l);
                            Object[] objectArray4 = new Object[4];
                            objectArray4[3] = ph.b("n", (int)6526, (long)(0x7D679AD62D26E6C0L ^ l));
                            objectArray4[2] = l3;
                            objectArray4[1] = "?";
                            objectArray4[0] = object;
                            object = m44.a("j", (Object)objectArray4, (long)-2582918911098823181L, (long)l);
                            Object[] objectArray5 = new Object[4];
                            objectArray5[3] = ph.b("n", (int)7570, (long)(0x1B8416918CD2622DL ^ l));
                            objectArray5[2] = l3;
                            objectArray5[1] = "*";
                            objectArray5[0] = object;
                            object2 = m44.a("j", (Object)objectArray5, (long)-2582918911098823181L, (long)l);
                        }
                        object = object2;
                    }
                    Object[] objectArray6 = new Object[2];
                    objectArray6[1] = l5;
                    objectArray6[0] = object;
                    m44.a("u", (Object)lqq2, (Object)objectArray6, (long)-2676147182393445765L, (long)l);
                }
                callSite2 = callSite;
            }
            if (callSite2 == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    ph.a = prr.a((long)4997342162329757180L, (long)6160264715672044530L, MethodHandles.lookup().lookupClass()).a(199503882420738L);
                    ph.e = new HashMap<K, V>(13);
                    var5 = ph.a ^ 17458258607252L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[4];
                    var12_4 = 0;
                    var11_5 = "*\u00f9;\u001f\u0003\u00c5s>\u00caZ\u00f9\u00dd\u00ed\u00dc\u00a6 <\u00e2@_i}\u008b\u0097\u00f4\u0095\u0003k:\u008d\u00bf\u009a \u009a}\u00ca\u00cb\u00d0}\u000e\u00a9\u00da~\u0093\u00e1C\u00e6MW7\u00a1\u00a4\u000eT\u0080t[S\u00b9+&\u00aa\u00e3r\u00ff";
                    var13_6 = "*\u00f9;\u001f\u0003\u00c5s>\u00caZ\u00f9\u00dd\u00ed\u00dc\u00a6 <\u00e2@_i}\u008b\u0097\u00f4\u0095\u0003k:\u008d\u00bf\u009a \u009a}\u00ca\u00cb\u00d0}\u000e\u00a9\u00da~\u0093\u00e1C\u00e6MW7\u00a1\u00a4\u000eT\u0080t[S\u00b9+&\u00aa\u00e3r\u00ff".length();
                    var10_7 = 32;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = ph.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u0018\u00d8\u0013I\u00e4\u00a5O\u0017\u001e\u00115\u00af\u00a5h\u001f\u0085\u00b0\u0086\u00f3Lo\u0081v\u00dd\u00a7Sq84\u00e5n\u0086\u00d6\u00b3\u0098\u00ee\u0000\u00ae\u0016\u00ff\u001aZ\u00b4\u008eM\u0082\u00faG 5\u008c'\u00b4\u00e3\u001d`\u001e\u00bd_E5\u00f7\u0089\u001f;E\u00a9\u00f1\u00da\u00bf\u00cf\u0016*O\u00e6k\u00c2\u00c5\u0080g\u0018\u00bd\u00af\f\bB[G\u008c\u0092\u00cc\u00c2\u00fb\u0080\u001e\u0016\u00f6T\u0014\u0012z\u00f6\f\b\b";
                        var13_6 = "\u0018\u00d8\u0013I\u00e4\u00a5O\u0017\u001e\u00115\u00af\u00a5h\u001f\u0085\u00b0\u0086\u00f3Lo\u0081v\u00dd\u00a7Sq84\u00e5n\u0086\u00d6\u00b3\u0098\u00ee\u0000\u00ae\u0016\u00ff\u001aZ\u00b4\u008eM\u0082\u00faG 5\u008c'\u00b4\u00e3\u001d`\u001e\u00bd_E5\u00f7\u0089\u001f;E\u00a9\u00f1\u00da\u00bf\u00cf\u0016*O\u00e6k\u00c2\u00c5\u0080g\u0018\u00bd\u00af\f\bB[G\u008c\u0092\u00cc\u00c2\u00fb\u0080\u001e\u0016\u00f6T\u0014\u0012z\u00f6\f\b\b".length();
                        var10_7 = 80;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = ph.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            ph.c = var14_3;
            ph.d = new String[4];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 3574368732422197592L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        ph.g = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x30F3;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ph", exception);
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
            ph.d[n2] = ph.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ph.b(n, l);
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
            throw new RuntimeException("com/zelix/ph" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ph.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
