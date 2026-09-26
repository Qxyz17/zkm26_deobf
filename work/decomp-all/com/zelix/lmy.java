/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.df;
import com.zelix.ed;
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

public class lmy {
    private final int s;
    private final int T;
    Map g;
    private final int f;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public lmy(int n, long l, int n2) {
        long l2 = (l = a ^ l) ^ 0x26BAA4BEE334L;
        this(n, l2, n2, (int)lmy.a("s", (int)4948, (long)(0x3416648C931AC429L ^ l)), (int)lmy.a("s", (int)16116, (long)(0xC6AAC6BBC1F698BL ^ l)));
    }

    public void u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        m44.a("w", (Object)this, (long)-5001022816252455942L, (long)l).clear();
    }

    public lmy(int n, long l, int n2, int n3, int n4) {
        long l2 = (l = a ^ l) ^ 0x53E0CCF061EEL;
        this.T = n2;
        this.f = n3;
        this.s = n4;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = n;
        m44.a("p", (Object)this, (Map)((Object)m44.a("l", (Object)objectArray, (long)-1932290766393089841L, (long)l)), (long)-223583424927214201L, (long)l);
    }

    public lmy(long l) {
        long l2 = (l = a ^ l) ^ 0x347AF91583DCL;
        this((int)lmy.a("s", (int)19684, (long)(0x4D76943BBE986F37L ^ l)), l2, (int)lmy.a("s", (int)15216, (long)(0x3685EF5693B418A1L ^ l)));
    }

    public df n(Object[] objectArray) {
        ed ed2;
        Object object;
        long l;
        block4: {
            ed ed3;
            block5: {
                Object object2 = objectArray[0];
                l = (Long)objectArray[1];
                object = objectArray[2];
                l = a ^ l;
                ed3 = (ed)m44.a("u", (Object)this, (long)5245161545503072680L, (long)l).get(object2);
                CallSite callSite = m44.a("k", (long)5988967044554771755L, (long)l);
                try {
                    try {
                        ed2 = ed3;
                        if (callSite != null) break block4;
                        if (ed2 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)6273526461218703673L, (long)l);
                    }
                    return null;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)6273526461218703673L, (long)l);
                }
            }
            ed2 = ed3;
        }
        return m44.a("t", (Object)ed2, (Object)new Object[]{object}, (long)5973603294413293913L, (long)l);
    }

    public boolean b(Object[] objectArray) {
        ed ed2;
        long l;
        Object object;
        Object object2;
        Object object3;
        block3: {
            ed ed3;
            block4: {
                Object object4 = objectArray[0];
                long l2 = (Long)objectArray[1];
                object3 = objectArray[2];
                object2 = objectArray[3];
                object = objectArray[4];
                long l3 = l2 = a ^ l2;
                l = l3 ^ 0xE6B21E0DF5FL;
                long l4 = l3 ^ 0x71C047AD205BL;
                ed3 = (ed)m44.a("q", (Object)this, (long)965716592327762948L, (long)l2).get(object4);
                CallSite callSite = m44.a("o", (long)1635212894493673607L, (long)l2);
                try {
                    ed2 = ed3;
                    if (callSite != null) break block3;
                    if (ed2 == null) {
                    }
                    break block4;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)((Object)n92), (long)1350076783628520597L, (long)l2);
                }
                ed3 = new ed((int)m44.a("q", (Object)this, (long)1667809641976002324L, (long)l2), l4, (int)m44.a("q", (Object)this, (long)1412090801458221857L, (long)l2), (int)m44.a("q", (Object)this, (long)657688384312214007L, (long)l2));
                boolean bl = ed3.N(object3, l, object2, object);
                m44.a("q", (Object)this, (long)965716592327762948L, (long)l2).put(object4, ed3);
                return bl;
            }
            ed2 = ed3;
        }
        return ed2.N(object3, l, object2, object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                lmy.a = prr.a((long)-5679872209903789910L, (long)-3229877051457257158L, MethodHandles.lookup().lookupClass()).a(168240378834987L);
                lmy.d = new HashMap<K, V>(13);
                var0 = lmy.a ^ 39473916912456L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "5rc\u0004\u00ba\u00e2I\u00fc\"\u00a0\u007f\u00d1\u00f6\u00b8\u0017\b";
                var7_6 = "5rc\u0004\u00ba\u00e2I\u00fc\"\u00a0\u007f\u00d1\u00f6\u00b8\u0017\b".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00e2C\u0090\u000e\u00ec\u00a36 \u00f5\u0099\u00b7\u0014\u00efc\u00ec\u00fa";
                    var7_6 = "\u00e2C\u0090\u000e\u00ec\u00a36 \u00f5\u0099\u00b7\u0014\u00efc\u00ec\u00fa".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        lmy.b = var8_3;
        lmy.c = new Integer[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2A4B;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lmy", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lmy.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = lmy.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lmy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lmy.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
