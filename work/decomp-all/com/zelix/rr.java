/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ah;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.rh;
import java.io.BufferedReader;
import java.io.IOException;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public abstract class rr
extends rh {
    protected BufferedReader I;
    protected JTextArea Q;
    protected ah n;
    protected JLabel v;
    static final String l;
    private static final long d;
    private static final long[] t;
    private static final Integer[] u;
    private static final Map w;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public rr(JFrame var1_1, String var2_2, String var3_3, BufferedReader var4_4, boolean var5_5, boolean var6_6, long var7_7, boolean var9_8) {
        block25: {
            block22: {
                v0 = var7_7 = rr.d ^ var7_7;
                v1 = v0 ^ 29610982657177L;
                var10_9 = (int)(v1 >>> 32);
                var11_10 = (int)(v1 << 32 >>> 48);
                var12_11 = (int)(v1 << 48 >>> 48);
                var13_12 = v0 ^ 62640734002304L;
                super(var10_9, var1_1, var2_2, (short)var11_10, var6_6, (char)var12_11);
                v2 = new Object[1];
                v2[0] = var13_12;
                m44.a("s", (Object)this, (Object)v2, (long)-5441945304530376436L, (long)var7_7);
                m44.a("s", (Object)m44.a("r", (Object)this, (long)-5802563343813196103L, (long)var7_7), (Object)var3_3, (long)-6001201067992866463L, (long)var7_7);
                m44.a("p", (Object)this, (BufferedReader)var4_4, (long)-5887098710465316580L, (long)var7_7);
                var16_13 = null;
                var17_14 = new StringBuffer();
                var15_15 = m44.a("l", (long)-5718002924562014271L, (long)var7_7);
                m44.a("s", (Object)m44.a("r", (Object)this, (long)-5527098046415897436L, (long)var7_7), (boolean)var5_5, (long)-5812551538350722144L, (long)var7_7);
                var18_16 = false;
                try {
                    v3 = var4_4;
                    if (var15_15 != null) {
                        if (v3 == null) break block22;
                    }
                    ** GOTO lbl31
                }
                catch (IOException v4) {
                    throw m44.a("l", (Object)v4, (long)-5596447508185436813L, (long)var7_7);
                }
                v3 = var4_4;
lbl31:
                // 2 sources

                var16_13 = v3.readLine();
                while (var16_13 != null) {
                    block23: {
                        block24: {
                            v5 = var18_16;
                            if (var7_7 < 0L) break block23;
                            v6 /* !! */  = rr.d("t", (int)9699, (long)(8510377626061928747L ^ var7_7));
                            if (var15_15 == null) break block24;
                            try {
                                block26: {
                                    if (v5 >= v6 /* !! */ ) break;
                                    break block26;
                                    catch (IOException v7) {
                                        throw m44.a("l", (Object)v7, (long)-5596447508185436813L, (long)var7_7);
                                    }
                                }
                                v8 = var18_16;
                                v6 /* !! */  = (CallSite)var16_13.length();
                            }
                            catch (IOException v9) {
                                throw m44.a("l", (Object)v9, (long)-5596447508185436813L, (long)var7_7);
                            }
                        }
                        v5 = v8 + v6 /* !! */ ;
                    }
                    var18_16 = v5;
                    var17_14.append(var16_13 + (String)m44.a("h", (long)-5413897493332799729L, (long)var7_7));
                    var16_13 = var4_4.readLine();
lbl56:
                    // 2 sources

                    ** while (var15_15 == null)
lbl57:
                    // 1 sources

                }
lbl58:
                // 3 sources

                try {
                    m44.a("s", (Object)var4_4, (long)-5371963610303265488L, (long)var7_7);
                    if (var7_7 <= 0L) ** GOTO lbl56
                }
                catch (IOException var19_17) {}
                break block22;
                catch (IOException var19_18) {
                    try {
                        m44.a("s", (Object)var4_4, (long)-5371963610303265488L, (long)var7_7);
                    }
                    catch (IOException var19_19) {}
                    catch (Throwable var20_20) {
                        try {
                            m44.a("s", (Object)var4_4, (long)-5371963610303265488L, (long)var7_7);
                        }
                        catch (IOException var21_21) {
                            // empty catch block
                        }
                        throw var20_20;
                    }
                }
            }
            try {
                if (var7_7 <= 0L) break block25;
                if (var16_13 != null) {
                    var17_14.append((String)m44.a("h", (long)-5983156384190284854L, (long)var7_7));
                }
            }
            catch (IOException v10) {
                throw m44.a("l", (Object)v10, (long)-5596447508185436813L, (long)var7_7);
            }
            m44.a("s", (Object)m44.a("r", (Object)this, (long)-5527098046415897436L, (long)var7_7), (Object)var17_14.toString(), (long)-5439904413296897358L, (long)var7_7);
            m44.a("s", (Object)m44.a("r", (Object)this, (long)-5527098046415897436L, (long)var7_7), (int)0, (long)-5496248679325837151L, (long)var7_7);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = prr.a((long)1372301989399688154L, (long)-8047636194216766718L, MethodHandles.lookup().lookupClass()).a(70545600671254L);
        long l = d ^ 0x39449C7E985BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u001aU\u00dd\u00a5\u0083'\u001c\u008c\u0091\u00ddS\u0087p?\u00d1\u00f9\u0010\u00b6\u000e\u00bf\u00b7_\u00b1\u0016\u008dX\u00f5\u00ca\u00fb\u0090\u00a0\u00fc\u009a";
        int n2 = "\u001aU\u00dd\u00a5\u0083'\u001c\u008c\u0091\u00ddS\u0087p?\u00d1\u00f9\u0010\u00b6\u000e\u00bf\u00b7_\u00b1\u0016\u008dX\u00f5\u00ca\u00fb\u0090\u00a0\u00fc\u009a".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = rr.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        w = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n6 = 0;
        String string2 = "g\u0086\u009b\u00e4\u008b\u001b\u0081\u00e8\u00d7\u00ac2\u0093\u00de\u008b\u00a4\u00c3";
        int n7 = "g\u0086\u009b\u00e4\u008b\u001b\u0081\u00e8\u00d7\u00ac2\u0093\u00de\u008b\u00a4\u00c3".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        t = lArray;
        u = new Integer[2];
        rr.l = (String)((Object)m44.a("h", (long)1145487664671487031L, (long)l)) + (String)((Object)m44.a("h", (long)1145487664671487031L, (long)l)) + stringArray[1] + (int)rr.d("t", (int)17647, (long)(0x13A2604C60F8A31EL ^ l)) + stringArray[0];
    }

    protected abstract void o(Object[] var1);

    private static IOException a(IOException iOException) {
        return iOException;
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

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x63AA;
        if (u[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = t[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])w.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    w.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/rr", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            rr.u[n2] = n3;
        }
        return u[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = rr.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/rr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(rr.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
