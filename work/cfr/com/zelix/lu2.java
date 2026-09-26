/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.av;
import com.zelix.gs;
import com.zelix.kd;
import com.zelix.lb6;
import com.zelix.lm_;
import com.zelix.lqw;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sh;
import com.zelix.y9;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

public class lu2
implements Runnable {
    final y9 E;
    final PrintWriter y;
    final sh q;
    final av T;
    final kd p;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    lu2(kd kd2, y9 y92, sh sh2, av av2, PrintWriter printWriter) {
        this.p = kd2;
        this.E = y92;
        this.q = sh2;
        this.T = av2;
        this.y = printWriter;
    }

    @Override
    public void run() {
        block13: {
            PrintWriter printWriter;
            long l10;
            block12: {
                PrintWriter printWriter2;
                CallSite callSite;
                block10: {
                    block11: {
                        long l11 = l10 = a ^ 0x3C4B921F5B26L;
                        long l12 = l11 ^ 0x25F4A9318A2CL;
                        long l13 = l11 ^ 0x1C13E4C67C25L;
                        long l14 = l11 ^ 0x975F4E6E134L;
                        int n10 = (int)(l14 >>> 48);
                        int n11 = (int)(l14 << 16 >>> 48);
                        int n12 = (int)(l14 << 32 >>> 32);
                        lm_ lm_2 = null;
                        callSite = m44.a("l", (long)1451603230434358377L, (long)l10);
                        try {
                            boolean bl2 = true;
                            FileWriter fileWriter = new FileWriter((String)((Object)lu2.a("y", (int)24767, (long)(0x5DD850CEC4AECA22L ^ l10))));
                            lm_2 = new lm_((char)n10, (short)n11, fileWriter, bl2, n12);
                        }
                        catch (IOException iOException) {
                            Object[] objectArray = new Object[3];
                            objectArray[2] = (String)((Object)lu2.a("y", (int)21099, (long)(0x32E42287F77778F3L ^ l10))) + iOException.getClass().getName();
                            objectArray[1] = l12;
                            objectArray[0] = lu2.a("y", (int)648, (long)(0x50FB4531530D2817L ^ l10));
                            m44.a("s", (Object)m44.a("r", (Object)this, (long)1279116394362388916L, (long)l10), (Object)objectArray, (long)1085177040998983365L, (long)l10);
                        }
                        printWriter2 = null;
                        try {
                            printWriter2 = new PrintWriter(new FileWriter((String)((Object)lu2.a("y", (int)19992, (long)(0x20A3199FEB13E486L ^ l10)))), true);
                        }
                        catch (IOException iOException) {
                            Object[] objectArray = new Object[3];
                            objectArray[2] = (String)((Object)lu2.a("y", (int)9830, (long)(0x4FB9ED3B5EDF0CFAL ^ l10))) + iOException.getClass().getName();
                            objectArray[1] = l12;
                            objectArray[0] = lu2.a("y", (int)27566, (long)(0x203D160FA214C137L ^ l10));
                            m44.a("s", (Object)m44.a("r", (Object)this, (long)1279116394362388916L, (long)l10), (Object)objectArray, (long)1085177040998983365L, (long)l10);
                        }
                        try {
                            try {
                                Object[] objectArray = new Object[23];
                                objectArray[22] = m44.a("r", (Object)this, (long)998612877166188422L, (long)l10);
                                objectArray[21] = new lb6(0);
                                objectArray[20] = printWriter2;
                                objectArray[19] = lm_2;
                                objectArray[18] = null;
                                objectArray[17] = null;
                                objectArray[16] = m44.a("r", (Object)this, (long)1226952962659853518L, (long)l10);
                                objectArray[15] = m44.a("r", (Object)this, (long)1279116394362388916L, (long)l10);
                                objectArray[14] = true;
                                objectArray[13] = new gs[0];
                                objectArray[12] = new gs[0];
                                objectArray[11] = new gs[0];
                                objectArray[10] = new gs[0];
                                objectArray[9] = null;
                                objectArray[8] = null;
                                objectArray[7] = null;
                                objectArray[6] = l13;
                                objectArray[5] = null;
                                objectArray[4] = null;
                                objectArray[3] = null;
                                objectArray[2] = null;
                                objectArray[1] = new lqw[0];
                                objectArray[0] = new gs[0];
                                m44.a("s", (Object)m44.a("r", (Object)this, (long)1459425163178280254L, (long)l10), (Object)objectArray, (long)1039185478906350155L, (long)l10);
                                printWriter = lm_2;
                                if (callSite != null) break block10;
                                if (printWriter == null) break block11;
                            }
                            catch (IOException iOException) {
                                throw m44.a("l", (Object)iOException, (long)804728581224685196L, (long)l10);
                            }
                            m44.a("s", (Object)lm_2, (long)655724966064831342L, (long)l10);
                        }
                        catch (IOException iOException) {
                            throw m44.a("l", (Object)iOException, (long)804728581224685196L, (long)l10);
                        }
                    }
                    printWriter = printWriter2;
                }
                try {
                    if (callSite != null) break block12;
                    if (printWriter == null) break block13;
                }
                catch (IOException iOException) {
                    throw m44.a("l", (Object)iOException, (long)804728581224685196L, (long)l10);
                }
                printWriter = printWriter2;
            }
            m44.a("s", (Object)printWriter, (long)655724966064831342L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                lu2.a = prr.a(-3101735073478799166L, -2698533046203135543L, MethodHandles.lookup().lookupClass()).a(69247912499759L);
                lu2.d = new HashMap<K, V>(13);
                var0 = lu2.a ^ 30159859838267L;
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
                var6_5 = "WO\u00b9\u00bbyt^\u00ed\u00fc=N\u008cW8\u00eb\u007f|\u00b3\u00e1x\u0090%\u00bc\u00a3PX\u00b2\u0097\n\u0005\u00d5{\u0098\u00f73\u008c\u00ac\u00b3u8\u00c5\u00a7\u00a8\u00ba\u0006\u00e0=uh\u00b46\u001fR]\u00c1\u00b3\u00d5\u008b\u00een\u00983\\& \u00a7\u00feA\u0017#\u00ae\u009e\u00e1\u001a\u0017\u0013\u00d3\u0004\u00b2\u00ffWWb\u00d93\u00df\u009d[f\u00ea^\u00bb4\u00fd\u00e2\u00e0p(\u008d\u00b0\u00f7\u00b9\r\u00f0\u008ba\u00bfF\u000b\u00d2\u00b9\u009aW\u000b\u0004\u0082\u00a3\u0000\u00d3\u00af)\u00be#T\u00e1\u0011\u00c9{\u00e9Q\u0096\u008a\u008an|P\u00e3\u00cb\u0010\u0096E$\u00a8\u0092\"\u00cb8M\u0003&g\u008c-/\u0097";
                var8_6 = "WO\u00b9\u00bbyt^\u00ed\u00fc=N\u008cW8\u00eb\u007f|\u00b3\u00e1x\u0090%\u00bc\u00a3PX\u00b2\u0097\n\u0005\u00d5{\u0098\u00f73\u008c\u00ac\u00b3u8\u00c5\u00a7\u00a8\u00ba\u0006\u00e0=uh\u00b46\u001fR]\u00c1\u00b3\u00d5\u008b\u00een\u00983\\& \u00a7\u00feA\u0017#\u00ae\u009e\u00e1\u001a\u0017\u0013\u00d3\u0004\u00b2\u00ffWWb\u00d93\u00df\u009d[f\u00ea^\u00bb4\u00fd\u00e2\u00e0p(\u008d\u00b0\u00f7\u00b9\r\u00f0\u008ba\u00bfF\u000b\u00d2\u00b9\u009aW\u000b\u0004\u0082\u00a3\u0000\u00d3\u00af)\u00be#T\u00e1\u0011\u00c9{\u00e9Q\u0096\u008a\u008an|P\u00e3\u00cb\u0010\u0096E$\u00a8\u0092\"\u00cb8M\u0003&g\u008c-/\u0097".length();
                var5_7 = 64;
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
                    var9_3[var7_4++] = lu2.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0093\u001d\u00c9\u00cd\u00fe\u00c0[en\u00c0\u00ff\u00e7\u001f\u0013\u0004\u000b?\u0004U]\u00b2Yi\u00e6\u00ca\u009b{\u0085G\u00b0-i4\u00ab\u00b1\u00b3d\u00a89\u0011\u00ce\u00bc\u008a\u0014^y\u00e2\u00f2h\u00ca\u00a8\u001a\u00b9\u001cE\u00eb.\u00f0\u00c7z\u008d\u00d6\u00ff\u00a6\u0010\u00a7\u00f4\u0019V\u0010>F5u\u0010\u000f\u00db,\u00bd\"\u0012";
                    var8_6 = "\u0093\u001d\u00c9\u00cd\u00fe\u00c0[en\u00c0\u00ff\u00e7\u001f\u0013\u0004\u000b?\u0004U]\u00b2Yi\u00e6\u00ca\u009b{\u0085G\u00b0-i4\u00ab\u00b1\u00b3d\u00a89\u0011\u00ce\u00bc\u008a\u0014^y\u00e2\u00f2h\u00ca\u00a8\u001a\u00b9\u001cE\u00eb.\u00f0\u00c7z\u008d\u00d6\u00ff\u00a6\u0010\u00a7\u00f4\u0019V\u0010>F5u\u0010\u000f\u00db,\u00bd\"\u0012".length();
                    var5_7 = 64;
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
                    var9_3[var7_4++] = lu2.a(var10_9).intern();
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
        lu2.b = var9_3;
        lu2.c = new String[6];
    }

    private static IOException a(IOException iOException) {
        return iOException;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x35B7;
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
                throw new RuntimeException("com/zelix/lu2", exception);
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
            lu2.c[n11] = lu2.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lu2.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lu2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lu2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

