/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbj;
import com.zelix.lbl;
import com.zelix.m44;
import com.zelix.mc;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.Cursor;
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
import javax.swing.JPanel;

public class om
extends JPanel {
    mc Z;
    boolean Q;
    Cursor u;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void x(Object[] var1_1) {
        block13: {
            block14: {
                block15: {
                    block11: {
                        block12: {
                            var2_2 = (Long)var1_1[0];
                            var2_2 = om.a ^ var2_2;
                            var4_3 = m44.a("h", (long)-6065920270553709387L, (long)var2_2);
                            try {
                                try {
                                    v0 /* !! */  = m44.a("v", (Object)m44.a("v", (Object)this, (long)-5344216193926035952L, (long)var2_2), (long)-5924433637840863085L, (long)var2_2);
                                    if (var4_3 == null) break block11;
                                    if (v0 /* !! */  == false) {
                                    }
                                    ** GOTO lbl26
                                }
                                catch (n9 v1) {
                                    throw m44.a("h", (Object)v1, (long)-5922706256337506913L, (long)var2_2);
                                }
                                if (!((double)m44.a("v", (Object)m44.a("v", (Object)this, (long)-5344216193926035952L, (long)var2_2), (long)-5842932371330168845L, (long)var2_2) < 0.5)) break block12;
                            }
                            catch (n9 v2) {
                                throw m44.a("h", (Object)v2, (long)-5922706256337506913L, (long)var2_2);
                            }
                            var5_4 = new Cursor((int)om.a("x", (int)26360, (long)(7600701530990493899L ^ var2_2)));
                            if (var2_2 <= 0L) break block13;
                            if (var4_3 != null) break block14;
                        }
                        var5_4 = new Cursor((int)om.a("x", (int)25564, (long)(6885823550925063661L ^ var2_2)));
                        try {
                            if (var2_2 < 0L) break block13;
                            if (var4_3 != null) break block14;
lbl26:
                            // 2 sources

                            v0 /* !! */  = (CallSite)((cfr_temp_0 = (double)m44.a("v", (Object)m44.a("v", (Object)this, (long)-5344216193926035952L, (long)var2_2), (long)-5842932371330168845L, (long)var2_2) - 0.5) == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
                        }
                        catch (n9 v3) {
                            throw m44.a("h", (Object)v3, (long)-5922706256337506913L, (long)var2_2);
                        }
                    }
                    if (v0 /* !! */  >= 0) break block15;
                    var5_4 = new Cursor((int)om.a("x", (int)2644, (long)(5436408358139014244L ^ var2_2)));
                    if (var2_2 < 0L) break block13;
                    if (var4_3 != null) break block14;
                }
                var5_4 = new Cursor((int)om.a("x", (int)32520, (long)(1514930798380407098L ^ var2_2)));
            }
            m44.a("w", (Object)this, (Object)var5_4, (long)-5909326661299657474L, (long)var2_2);
        }
    }

    om(mc mc2, long l) {
        l = a ^ l;
        m44.a("r", (Object)this, (boolean)false, (long)5219245226691977374L, (long)l);
        m44.a("r", (Object)this, (mc)mc2, (long)6220591802667689366L, (long)l);
        m44.a("q", (Object)this, (Object)m44.a("q", (Object)m44.a("j", (long)5235704731882622369L, (long)l), (long)5198025710307654405L, (long)l), (long)5468989025573716834L, (long)l);
        m44.a("q", (Object)this, (Object)new lbj(this), (long)6181208989756844167L, (long)l);
        m44.a("q", (Object)this, (Object)new lbl(this), (long)5951155470740890643L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                om.a = prr.a((long)-514178555746888098L, (long)-3152179899264176676L, MethodHandles.lookup().lookupClass()).a(271963461749357L);
                om.d = new HashMap<K, V>(13);
                var0 = om.a ^ 13124340538336L;
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
                var6_5 = "\u009b|\u0082\u00ce\u009a\u0082e\u00ebf\u00a1\u00ba\u00e5Q_gD";
                var7_6 = "\u009b|\u0082\u00ce\u009a\u0082e\u00ebf\u00a1\u00ba\u00e5Q_gD".length();
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
                    var6_5 = ">\u0093\u0080\u00a7W\u00ab\u0089\u0016\u00ac\u000ev\u00fb\u0005\u00aa\u00a4\u00e4";
                    var7_6 = ">\u0093\u0080\u00a7W\u00ab\u0089\u0016\u00ac\u000ev\u00fb\u0005\u00aa\u00a4\u00e4".length();
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
        om.b = var8_3;
        om.c = new Integer[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x225;
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
                throw new RuntimeException("com/zelix/om", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            om.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = om.a(n, l);
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
            throw new RuntimeException("com/zelix/om" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(om.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
