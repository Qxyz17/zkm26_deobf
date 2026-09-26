/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e_;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sp;
import com.zelix.t3;
import com.zelix.wa;
import com.zelix.wc;
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

public class w7
extends t3 {
    private static final long ab;
    private static final String[] ob;
    private static final String[] pb;
    private static final Map qb;

    void U(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x438472E97CEAL;
        m44.a("p", (Object)((Object)this), (JButton)new JButton((String)((Object)w7.d("y", (int)15215, (long)(0x2F450C4F8F09A90L ^ l)))), (long)2470194863468240238L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = w7.d("y", (int)19487, (long)(0x65B3C06DC5216DE2L ^ l));
        m44.a("s", (Object)m44.a("r", (Object)((Object)this), (long)2470194863468240238L, (long)l), (Object)m44.a("l", (Object)objectArray2, (long)4039363427687686864L, (long)l), (long)2660938734342521046L, (long)l);
        m44.a("p", (Object)((Object)this), (JButton)new JButton((String)((Object)w7.d("y", (int)32496, (long)(0x21B7BBE79B59DF0EL ^ l)))), (long)2769495773986823765L, (long)l);
        m44.a("s", (Object)m44.a("r", (Object)((Object)this), (long)2769495773986823765L, (long)l), (Object)string, (long)2660938734342521046L, (long)l);
        m44.a("p", (Object)((Object)this), (JButton)new JButton((String)((Object)w7.d("y", (int)22046, (long)(0x12EA67268C0EF7E4L ^ l)))), (long)4529417560990065572L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = w7.d("y", (int)8006, (long)(0xEBA957A12733EBAL ^ l));
        m44.a("s", (Object)m44.a("r", (Object)((Object)this), (long)4529417560990065572L, (long)l), (Object)m44.a("l", (Object)objectArray3, (long)4039363427687686864L, (long)l), (long)2660938734342521046L, (long)l);
        m44.a("p", (Object)((Object)this), (JButton)new JButton((String)((Object)w7.d("y", (int)1038, (long)(0x29F71242F71525F6L ^ l)))), (long)2404533750407623250L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l2;
        objectArray4[0] = w7.d("y", (int)25420, (long)(0x644547A5B34EC2B5L ^ l));
        m44.a("s", (Object)m44.a("r", (Object)((Object)this), (long)2404533750407623250L, (long)l), (Object)m44.a("l", (Object)objectArray4, (long)4039363427687686864L, (long)l), (long)2660938734342521046L, (long)l);
    }

    w7(String string, long l, String string2, wa wa2, sp sp2, wc wc2, lqu lqu2, e_ e_2) {
        long l2 = (l = ab ^ l) ^ 0x7F7F1EC2E9A8L;
        super(string, string2, wa2, sp2, wc2, lqu2, l2, e_2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                w7.ab = prr.a((long)-7080533565920691544L, (long)-8393431925371752817L, MethodHandles.lookup().lookupClass()).a(209083598370491L);
                w7.qb = new HashMap<K, V>(13);
                var0 = w7.ab ^ 117524113082004L;
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
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "\u00c2\u00aa\u00ac\u000b\u0004,\u00d7\u00c4Gcu\u00c7\u00ef\u00fbwL{-0Q\u00bc\u0099z\u00e6\u0011\u00bfO\u00b1]\u00d5@4\u0018\u0091\nJ\\\u0098\u0096\u00cb\u00f8lo\u00f4*\u00a9\u00be\u00ff\u00b1\u00baj\u001c\u00d1\u009d\u001c\u00bex\u0010\u00ecY\n\u0018\u009aaL\u00c5\"\u00cd<T\u008fX<\u00c3 \u0003\u001f26\u00bco\u00e4\u00e9k!\u009cCq\u0086D\u001eca1\u00de\u00cc|J\u00af\u00a39;\u0099\u00e4g\u00a3\u00ea\u0010\u00a8\u00ebn\u00b8\u009b\u00e6\u00c0k)p\u00b2\u008fR\u00faf!";
                var8_6 = "\u00c2\u00aa\u00ac\u000b\u0004,\u00d7\u00c4Gcu\u00c7\u00ef\u00fbwL{-0Q\u00bc\u0099z\u00e6\u0011\u00bfO\u00b1]\u00d5@4\u0018\u0091\nJ\\\u0098\u0096\u00cb\u00f8lo\u00f4*\u00a9\u00be\u00ff\u00b1\u00baj\u001c\u00d1\u009d\u001c\u00bex\u0010\u00ecY\n\u0018\u009aaL\u00c5\"\u00cd<T\u008fX<\u00c3 \u0003\u001f26\u00bco\u00e4\u00e9k!\u009cCq\u0086D\u001eca1\u00de\u00cc|J\u00af\u00a39;\u0099\u00e4g\u00a3\u00ea\u0010\u00a8\u00ebn\u00b8\u009b\u00e6\u00c0k)p\u00b2\u008fR\u00faf!".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = w7.d(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0081\u00d8uY\u000ee\u00fb\u0011tB\u0084\"\u00c3\u00cf1}\u009a\u00aa\u009e\u00be\u00cd\u0083n\u00a9`\u00adA\u00d0\u0089\u0011|\u00a4\u0010#;\u00ef\u0083\u00a8o\u00f3\u00b1\u00cf\u0092\u00b5\u00a5\u00b7E&\u00ba";
                    var8_6 = "\u0081\u00d8uY\u000ee\u00fb\u0011tB\u0084\"\u00c3\u00cf1}\u009a\u00aa\u009e\u00be\u00cd\u0083n\u00a9`\u00adA\u00d0\u0089\u0011|\u00a4\u0010#;\u00ef\u0083\u00a8o\u00f3\u00b1\u00cf\u0092\u00b5\u00a5\u00b7E&\u00ba".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = w7.d(var10_9).intern();
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
        w7.ob = var9_3;
        w7.pb = new String[7];
    }

    private static String d(byte[] byArray) {
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

    private static String d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xC4F;
        if (pb[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])qb.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    qb.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/w7", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = ob[n2].getBytes("ISO-8859-1");
            w7.pb[n2] = w7.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return pb[n2];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = w7.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/w7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(w7.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
