/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.at;
import com.zelix.e_;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.r1;
import com.zelix.t0;
import com.zelix.un;
import com.zelix.yf;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JFrame;

public class ea
implements Runnable {
    final Vector U;
    final yf K;
    final t0 g;
    final e_ T;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    @Override
    public void run() {
        long l;
        long l2 = l = a ^ 0x4C984D2C7884L;
        long l3 = l2 ^ 0x786073D65178L;
        long l4 = l2 ^ 0x11F00082973BL;
        long l5 = l2 ^ 0x171C4D570EBDL;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        try {
            Object[] objectArray = new Object[8];
            objectArray[7] = m44.a("v", (Object)m44.a("v", (Object)this, (long)-3880458491773668906L, (long)l), (long)-3807965575825262691L, (long)l);
            objectArray[6] = m44.a("v", (Object)m44.a("v", (Object)this, (long)-3880458491773668906L, (long)l), (long)-3581493623226334099L, (long)l);
            objectArray[5] = m44.a("v", (Object)this, (long)-3897664624929333279L, (long)l);
            objectArray[4] = m44.a("v", (Object)this, (long)-3887339390532077007L, (long)l);
            objectArray[3] = l5;
            objectArray[2] = printWriter;
            objectArray[1] = null;
            objectArray[0] = m44.a("v", (Object)this, (long)-3491937383884413865L, (long)l);
            m44.a("w", (Object)m44.a("v", (Object)m44.a("v", (Object)this, (long)-3880458491773668906L, (long)l), (long)-3488552363572235274L, (long)l), (Object)objectArray, (long)-4033487044202304071L, (long)l);
            m44.a("w", (Object)printWriter, (long)-3292755896613871558L, (long)l);
            CallSite callSite = m44.a("w", (Object)byteArrayOutputStream, (long)-3560079452882126903L, (long)l);
            try {
                if (((String)((Object)callSite)).length() > -1) {
                    new r1((JFrame)((Object)m44.a("v", (Object)this, (long)-3880458491773668906L, (long)l)), (String)((Object)ea.a("z", (int)12292, (long)(0x61C946FECD1E24F6L ^ l))), l4, (String)((Object)ea.a("z", (int)13120, (long)(0x763DBC11727D27B1L ^ l))), (String)((Object)callSite), false, true, false);
                }
            }
            catch (at at2) {
                throw m44.a("h", (Object)((Object)at2), (long)-3956330890098061963L, (long)l);
            }
        }
        catch (at at3) {
            Object[] objectArray = new Object[3];
            objectArray[2] = m44.a("w", (Object)((Object)at3), (long)-3510525291362004848L, (long)l);
            objectArray[1] = l3;
            objectArray[0] = ea.a("z", (int)3086, (long)(0x8D45420635F18FEL ^ l));
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-3887339390532077007L, (long)l), (Object)objectArray, (long)-3118933069981872777L, (long)l);
        }
        catch (un un2) {
            Object[] objectArray = new Object[3];
            objectArray[2] = m44.a("w", (Object)((Object)un2), (long)-3409112415968195158L, (long)l);
            objectArray[1] = l3;
            objectArray[0] = ea.a("z", (int)13088, (long)(0x7EFE2596527627D3L ^ l));
            m44.a("w", (Object)m44.a("v", (Object)this, (long)-3887339390532077007L, (long)l), (Object)objectArray, (long)-3118933069981872777L, (long)l);
        }
    }

    ea(t0 t02, Vector vector, yf yf2, e_ e_2) {
        this.g = t02;
        this.U = vector;
        this.K = yf2;
        this.T = e_2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                ea.a = prr.a((long)5273264146816618360L, (long)-1120971997990250622L, MethodHandles.lookup().lookupClass()).a(264546742615567L);
                ea.d = new HashMap<K, V>(13);
                var0 = ea.a ^ 34564872060251L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u0004\u00cd<@\u008b\u00fe \u00e7\u00ad\u0094\u0090\u0003y=\u00ee\u0087(\u00e5\u0017\u00e6_1\u00c9\u0094\u00c1\u008d\u0084H8\u00fb\u0096\u001ae\u00b6\u00a7\u00d1V\u0085\u00f0\u00e9Ort\u00f1$C\u009e\u00a0\u0015d\t_\u0088\u009d\u00a0\"\u008e";
                var8_6 = "\u0004\u00cd<@\u008b\u00fe \u00e7\u00ad\u0094\u0090\u0003y=\u00ee\u0087(\u00e5\u0017\u00e6_1\u00c9\u0094\u00c1\u008d\u0084H8\u00fb\u0096\u001ae\u00b6\u00a7\u00d1V\u0085\u00f0\u00e9Ort\u00f1$C\u009e\u00a0\u0015d\t_\u0088\u009d\u00a0\"\u008e".length();
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
                    var9_3[var7_4++] = ea.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00b3*\u00b2z^\u00c8\u00e3=\u00cb\u00fb\u0017\u00feK\u0014\u00be\u00ddZ\u00ee\u00ffK\u00dd\u00dd\u00aa $<P+Zi\u00fe\u00db\u001fl\u00f7\u00ae\u00b5\u00df\u008f  \u00d8sn\u00d5\u0083q\u009a\u001d\u0019Oi\u00a1\u007f \u00b8\u00ff\u00bb\u00d25\u00b0\u00b7\u00aeis\u00d1\u00cerDBE\u00ffe";
                    var8_6 = "\u00b3*\u00b2z^\u00c8\u00e3=\u00cb\u00fb\u0017\u00feK\u0014\u00be\u00ddZ\u00ee\u00ffK\u00dd\u00dd\u00aa $<P+Zi\u00fe\u00db\u001fl\u00f7\u00ae\u00b5\u00df\u008f  \u00d8sn\u00d5\u0083q\u009a\u001d\u0019Oi\u00a1\u007f \u00b8\u00ff\u00bb\u00d25\u00b0\u00b7\u00aeis\u00d1\u00cerDBE\u00ffe".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = ea.a(var10_9).intern();
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
        ea.b = var9_3;
        ea.c = new String[4];
    }

    private static at a(at at2) {
        return at2;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x508C;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ea", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            ea.c[n2] = ea.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ea.a(n, l);
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
            throw new RuntimeException("com/zelix/ea" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ea.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
