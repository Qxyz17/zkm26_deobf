/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbg;
import com.zelix.lu4;
import com.zelix.m44;
import com.zelix.mu;
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
import javax.swing.JFrame;

public class lur
extends lu4 {
    final mu w;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public void r(Object[] objectArray) {
        block13: {
            Object object;
            long l;
            long l2;
            long l3;
            block14: {
                block15: {
                    lur lur2;
                    CallSite callSite;
                    long l4;
                    block11: {
                        l3 = (Long)objectArray[0];
                        long l5 = l3;
                        l2 = l5 ^ 0x3FE7FFB9FD0AL;
                        l4 = l5 ^ 0x3A7CE8399BF9L;
                        long l6 = l5 ^ 0x15F6F36544F9L;
                        long l7 = l5 ^ 0x52A05B057B65L;
                        l = l5 ^ 0x5568E71DD3BL;
                        callSite = m44.a("h", (long)5561146463333268445L, (long)l3);
                        try {
                            block12: {
                                try {
                                    try {
                                        lur2 = this;
                                        if (callSite != null) break block11;
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l6;
                                        if (m44.a("w", (Object)((Object)lur2), (Object)objectArray2, (long)5223209049430320351L, (long)l3) != false) {
                                        }
                                        break block12;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)((Object)n92), (long)5424981195388330074L, (long)l3);
                                    }
                                    Object[] objectArray3 = new Object[2];
                                    objectArray3[1] = m44.a("v", (Object)((Object)this), (long)6143274097719916641L, (long)l3);
                                    objectArray3[0] = l7;
                                    m44.a("h", (Object)objectArray3, (long)5755041018037276561L, (long)l3);
                                    if (callSite == null) break block13;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)((Object)n93), (long)5424981195388330074L, (long)l3);
                                }
                            }
                            lur2 = this;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)((Object)n94), (long)5424981195388330074L, (long)l3);
                        }
                    }
                    try {
                        try {
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l4;
                            object = m44.a("w", (Object)((Object)lur2), (Object)objectArray4, (long)5220050754365077973L, (long)l3);
                            if (callSite != null) break block14;
                            if (object == null) break block15;
                        }
                        catch (n9 n95) {
                            throw m44.a("h", (Object)((Object)n95), (long)5424981195388330074L, (long)l3);
                        }
                        Object[] objectArray5 = new Object[1];
                        objectArray5[0] = l4;
                        object = (String)((Object)lur.a("o", (int)28489, (long)(0x370732A7E166407FL ^ l3))) + (String)((Object)m44.a("w", (Object)((Object)this), (Object)objectArray5, (long)5220050754365077973L, (long)l3)) + ".";
                        break block14;
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)((Object)n96), (long)5424981195388330074L, (long)l3);
                    }
                }
                object = "";
            }
            Object object2 = object;
            new lbg((JFrame)((Object)m44.a("v", (Object)m44.a("v", (Object)((Object)this), (long)6143274097719916641L, (long)l3), (long)6198686428827307685L, (long)l3)), l2, (String)((Object)lur.a("o", (int)25359, (long)(0x24B994BBBB49CC3EL ^ l3))), (String)((Object)lur.a("o", (int)28432, (long)(0x7158089336E54023L ^ l3))), (String)((Object)lur.a("o", (int)25930, (long)(0x2F05538DAADFCA7EL ^ l3))) + (String)object2 + (String)((Object)lur.a("o", (int)16334, (long)(0x40CAE4D6B39310FBL ^ l3))) + (String)((Object)lur.a("o", (int)6722, (long)(0xE6A4CD83DDAB575L ^ l3))) + (String)((Object)lur.a("o", (int)23691, (long)(0xAAE3BE63D5EF3BBL ^ l3))));
            Object[] objectArray6 = new Object[3];
            objectArray6[2] = m44.a("v", (Object)m44.a("v", (Object)((Object)this), (long)6143274097719916641L, (long)l3), (long)5412023410585143199L, (long)l3);
            objectArray6[1] = m44.a("v", (Object)((Object)this), (long)6143274097719916641L, (long)l3);
            objectArray6[0] = l;
            m44.a("h", (Object)objectArray6, (long)5857348703630402827L, (long)l3);
        }
    }

    lur(mu mu2, long l) {
        long l2 = (l = a ^ l) ^ 0x205ED8151E64L;
        this.w = mu2;
        super(l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                lur.a = prr.a((long)-8053278971105545471L, (long)568630334771095271L, MethodHandles.lookup().lookupClass()).a(216355893635036L);
                lur.e = new HashMap<K, V>(13);
                var0 = lur.a ^ 26951135952322L;
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
                var6_5 = "\u00a7{1b\u009a\u00f67\u00fb'\u00db\u008f\u00c0\u0086\u00ef\u00e3W\u00f3\u00d87/\u00e5m\u00e1eW\u00acd\u0015\u0007\u00dbQ\u00f4\u0088\u00f3\u00ae\u0016\u00cb\u00c5\u0095\u0086U\u00cd\u00b9\u00c9\u000e\u0004\u001b\u00e7p\u00c8\u00c2\u00e6l\u0005jR\u00a9\u00e2j\u00ec|\u0082h\u00c7a\u0094~$\u0087\u00fe\u00e4\u00fa\u00bc\u00f0\u0011\u0089\u0001\u0097\u00c9\u00c7T\u00b3\u00cd\u00f3\u00d4\u00ccH\u00c38\u00fd?,N\u00f2\u00f7\u00f1\u00bf\\\u0006\u009b\u00a3P\u00dc%\u00caIk\u0001\u00d3m\u00c8~\u00eb\u0080pay\u0017,3i\u0005\u008c\u00f1\u00fb\u00c3]_q\u00b42>\u0014\u0091%\u00f4\u00bc\u00f4\u0005c\u00149\u00c1,\u00e9([\u008e8\u000f\u00f8\u008c\u0016\u00c6L\u008c)\u0093lx2\u00ff\u00d2\u00be\u00a13\u00cd\u00dfr\u0081\u0003h\u00b8\u00f2\u009c]\u00e2\u0097eZ\u00d0\u00f5\u007f\u00bc\u001c\u00f5\u0010\\|\u000f\u0092\u00bc\u00a1\u0089\u001f\u00bf;N\u009a\u009a\u0089\u00e5J \u00f5\u00e0{&wgj\u00f6\rF)\u0088a\u00bb\u00f3\u00f8,\u00ee3;j\u00b7\u0092o\"\u0087\u0092\u00b5\u0086\u00c9\u009d\u00e6";
                var8_6 = "\u00a7{1b\u009a\u00f67\u00fb'\u00db\u008f\u00c0\u0086\u00ef\u00e3W\u00f3\u00d87/\u00e5m\u00e1eW\u00acd\u0015\u0007\u00dbQ\u00f4\u0088\u00f3\u00ae\u0016\u00cb\u00c5\u0095\u0086U\u00cd\u00b9\u00c9\u000e\u0004\u001b\u00e7p\u00c8\u00c2\u00e6l\u0005jR\u00a9\u00e2j\u00ec|\u0082h\u00c7a\u0094~$\u0087\u00fe\u00e4\u00fa\u00bc\u00f0\u0011\u0089\u0001\u0097\u00c9\u00c7T\u00b3\u00cd\u00f3\u00d4\u00ccH\u00c38\u00fd?,N\u00f2\u00f7\u00f1\u00bf\\\u0006\u009b\u00a3P\u00dc%\u00caIk\u0001\u00d3m\u00c8~\u00eb\u0080pay\u0017,3i\u0005\u008c\u00f1\u00fb\u00c3]_q\u00b42>\u0014\u0091%\u00f4\u00bc\u00f4\u0005c\u00149\u00c1,\u00e9([\u008e8\u000f\u00f8\u008c\u0016\u00c6L\u008c)\u0093lx2\u00ff\u00d2\u00be\u00a13\u00cd\u00dfr\u0081\u0003h\u00b8\u00f2\u009c]\u00e2\u0097eZ\u00d0\u00f5\u007f\u00bc\u001c\u00f5\u0010\\|\u000f\u0092\u00bc\u00a1\u0089\u001f\u00bf;N\u009a\u009a\u0089\u00e5J \u00f5\u00e0{&wgj\u00f6\rF)\u0088a\u00bb\u00f3\u00f8,\u00ee3;j\u00b7\u0092o\"\u0087\u0092\u00b5\u0086\u00c9\u009d\u00e6".length();
                var5_7 = 88;
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
                    var9_3[var7_4++] = lur.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u001b\u00f9\u00e1\u0015\u00bb\u001e\u0088\u0097\u00c2\n\u0088\u00ceG_\u009eE\f\u00abS\u0083HW]\u00f3\u00a1!\u00a30\u00b8\u00a3\u00ed\u00b8>e\u00f7\u00df\u009cu\u00af\u0099\u0095\u00bc\u00d4g\u00f8\u00f4\u001f}\u00eeB\u00db\u00f0P\u0082\u009d+}\u00eb\u008c,\u00bf\u0018\u0015\u008e(\u00ac\u00e45\u00d7\u00c0l<%at\u007f'\u0005\u00f4\u00cdV=J1\u00c0a\u00f8O\u00cd>^3\u000fVU\u0015-\u00cf\u009c<\u00e2UR\u00e8\u00f0";
                    var8_6 = "\u001b\u00f9\u00e1\u0015\u00bb\u001e\u0088\u0097\u00c2\n\u0088\u00ceG_\u009eE\f\u00abS\u0083HW]\u00f3\u00a1!\u00a30\u00b8\u00a3\u00ed\u00b8>e\u00f7\u00df\u009cu\u00af\u0099\u0095\u00bc\u00d4g\u00f8\u00f4\u001f}\u00eeB\u00db\u00f0P\u0082\u009d+}\u00eb\u008c,\u00bf\u0018\u0015\u008e(\u00ac\u00e45\u00d7\u00c0l<%at\u007f'\u0005\u00f4\u00cdV=J1\u00c0a\u00f8O\u00cd>^3\u000fVU\u0015-\u00cf\u009c<\u00e2UR\u00e8\u00f0".length();
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
                    var9_3[var7_4++] = lur.a(var10_9).intern();
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
        lur.c = var9_3;
        lur.d = new String[7];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6B92;
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
                throw new RuntimeException("com/zelix/lur", exception);
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
            lur.d[n2] = lur.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lur.a(n, l);
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
            throw new RuntimeException("com/zelix/lur" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lur.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
