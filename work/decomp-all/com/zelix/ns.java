/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.Insets;
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
import javax.swing.JButton;

public class ns
extends JButton {
    private static String f;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     */
    public ns(short var1_1, int var2_2, short var3_3) {
        block9: {
            block10: {
                block8: {
                    var4_4 = ((long)var1_1 << 48 | (long)var2_2 << 32 >>> 16 | (long)var3_3 << 48 >>> 48) ^ ns.a;
                    var6_5 = var4_4 ^ 54178616376537L;
                    v0 = m44.a("j", (long)-4599457578476747604L, (long)var4_4);
                    super();
                    v1 = new Object[1];
                    v1[0] = var6_5;
                    var9_6 = m44.a("j", (Object)v1, (long)-4604375884237411756L, (long)var4_4);
                    var8_7 = v0;
                    try {
                        try {
                            if (var8_7 != null) break block8;
                            if (var9_6 != null) {
                            }
                            ** GOTO lbl27
                        }
                        catch (n9 v2) {
                            throw m44.a("j", (Object)v2, (long)-4570138928559016900L, (long)var4_4);
                        }
                        m44.a("u", (Object)this, (Object)var9_6, (long)-2476358036807008630L, (long)var4_4);
                    }
                    catch (n9 v3) {
                        throw m44.a("j", (Object)v3, (long)-4570138928559016900L, (long)var4_4);
                    }
                }
                try {
                    if (var1_1 < 0) break block9;
                    if (var8_7 == null) break block10;
lbl27:
                    // 2 sources

                    m44.a("u", (Object)this, (Object)m44.a("n", (long)-4379045215608121747L, (long)var4_4), (long)-2554922779826319883L, (long)var4_4);
                }
                catch (n9 v4) {
                    throw m44.a("j", (Object)v4, (long)-4570138928559016900L, (long)var4_4);
                }
            }
            m44.a("u", (Object)this, (Object)ns.a("i", (int)25008, (long)(6115813268778474051L ^ var4_4)), (long)-4286682044051488913L, (long)var4_4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)8725002831040218594L, (long)-3930146624453409839L, MethodHandles.lookup().lookupClass()).a(178660901786961L);
        long l = a ^ 0x4D7150E56990L;
        d = new HashMap(13);
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
        String string = "\u00d7\u00a6\u00d6.\u0007\u00e9\u00e7&\u00b9v\u0082N\u00a5\u0087\u00d6\f\u0018!\u00b5\u00fcTs\u00b2\u0014Z\u0013\u0017\u009d/\u00e5\u00014K\u007fV\u009a\u00b1\u00ab\u0099\u00a4\u0099";
        int n2 = "\u00d7\u00a6\u00d6.\u0007\u00e9\u00e7&\u00b9v\u0082N\u00a5\u0087\u00d6\f\u0018!\u00b5\u00fcTs\u00b2\u0014Z\u0013\u0017\u009d/\u00e5\u00014K\u007fV\u009a\u00b1\u00ab\u0099\u00a4\u0099".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ns.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                m44.a("i", (String)((Object)ns.a("i", (int)21711, (long)(0x58BDA0A5564DF3FDL ^ l))), (long)6916061920569739949L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    @Override
    public float getAlignmentY() {
        return 0.5f;
    }

    @Override
    public Insets getMargin() {
        return new Insets(1, 1, 1, 1);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7687;
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
                throw new RuntimeException("com/zelix/ns", exception);
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
            ns.c[n2] = ns.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ns.a(n, l);
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
            throw new RuntimeException("com/zelix/ns" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ns.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
