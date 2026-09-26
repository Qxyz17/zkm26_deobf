/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.x6;
import java.io.DataOutputStream;
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

public class b3
extends _4 {
    private x6 D;
    private boolean q;
    private final byte[] J;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    @Override
    void z(gu gu2, long l10) {
        long l11 = l10 ^ 0x6DE1DADD9981L;
        m44.a("w", (Object)m44.a("v", (Object)this, (long)5598417758798278403L, (long)l10), (long)l11, (Object)gu2, (Object)this, (Object)this.H(), (long)6237079643253363842L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void D(Object[] var1_1) {
        block11: {
            block12: {
                block10: {
                    var5_2 = (DataOutputStream)var1_1[0];
                    var2_3 = (Long)var1_1[1];
                    var4_4 = (Map)var1_1[2];
                    var2_3 = b3.a ^ var2_3;
                    var7_5 = (js)var4_4.get(m44.a("p", (Object)this, (long)-7870146134355726219L, (long)var2_3));
                    var6_6 = m44.a("n", (long)-7885848237614315928L, (long)var2_3);
                    try {
                        try {
                            if (var6_6 != false) break block10;
                            if (var7_5 != null) {
                            }
                            ** GOTO lbl25
                        }
                        catch (n9 v0) {
                            throw m44.a("n", (Object)v0, (long)-7509496657009313459L, (long)var2_3);
                        }
                        var5_2.writeShort(var7_5.E());
                    }
                    catch (n9 v1) {
                        throw m44.a("n", (Object)v1, (long)-7509496657009313459L, (long)var2_3);
                    }
                }
                try {
                    v2 = var6_6;
                    if (var2_3 <= 0L) break block11;
                    if (v2 == false) break block12;
lbl25:
                    // 2 sources

                    var5_2.writeShort(m44.a("p", (Object)this, (long)-7870146134355726219L, (long)var2_3).E());
                }
                catch (n9 v3) {
                    throw m44.a("n", (Object)v3, (long)-7509496657009313459L, (long)var2_3);
                }
            }
            var5_2.writeShort(((CallSite)m44.a("p", (Object)this, (long)-8045344451734594427L, (long)var2_3)).length);
            v2 = var8_7 = (reference)false;
        }
        while (var8_7 < ((CallSite)m44.a("p", (Object)this, (long)-8045344451734594427L, (long)var2_3)).length) {
            var5_2.writeByte((int)m44.a("p", (Object)this, (long)-8045344451734594427L, (long)var2_3)[var8_7]);
            ++var8_7;
lbl36:
            // 2 sources

            ** while (var6_6 != false)
lbl37:
            // 1 sources

        }
lbl38:
        // 2 sources

        if (var2_3 <= 0L) ** GOTO lbl36
    }

    b3(int n10, _4 _42, short s10, h1 h12, int n11) {
        block18: {
            int n12;
            CallSite callSite;
            long l10;
            block16: {
                js js2;
                block17: {
                    js js3;
                    int n13;
                    long l11;
                    long l12;
                    block14: {
                        block15: {
                            long l13 = l10 = ((long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)n11 << 48 >>> 48) ^ a;
                            l12 = l13 ^ 0x5A656A17C6E8L;
                            l11 = l13 ^ 0x59E3CBCB6D82L;
                            long l14 = l13 ^ 0x1B3624B7A8A1L;
                            CallSite callSite2 = m44.a("i", (long)-6633656211259338056L, (long)l10);
                            super(_42);
                            n13 = h12.readUnsignedShort();
                            callSite = callSite2;
                            js2 = _42.m(l14, n13);
                            try {
                                try {
                                    js3 = js2;
                                    if (callSite == false) break block14;
                                    if (js3 != null) break block15;
                                }
                                catch (n9 n92) {
                                    throw m44.a("i", (Object)n92, (long)-4688305679534337942L, (long)l10);
                                }
                                throw new aw((String)((Object)m44.a("v", (Object)_42.G(l11), (long)l12, (long)-6794679909012647660L, (long)l10)) + (String)((Object)b3.a("t", (int)2554, (long)(0x3DA61010F56E471L ^ l10))) + n13 + (String)((Object)b3.a("t", (int)15011, (long)(0xFA6CBFCD14FD72BL ^ l10))));
                            }
                            catch (n9 n93) {
                                throw m44.a("i", (Object)n93, (long)-4688305679534337942L, (long)l10);
                            }
                        }
                        js3 = js2;
                    }
                    try {
                        try {
                            n12 = js3 instanceof x6;
                            if (callSite == false) break block16;
                            if (n12 != 0) break block17;
                        }
                        catch (n9 n94) {
                            throw m44.a("i", (Object)n94, (long)-4688305679534337942L, (long)l10);
                        }
                        throw new aw((String)((Object)m44.a("v", (Object)_42.G(l11), (long)l12, (long)-6794679909012647660L, (long)l10)) + (String)((Object)b3.a("t", (int)8890, (long)(0x258A53B9E268CF30L ^ l10))) + n13 + (String)((Object)b3.a("t", (int)22885, (long)(0x63E4983A87534EBL ^ l10))) + js2.getClass().getName() + (String)((Object)b3.a("t", (int)4315, (long)(0x534CBF8092CD7D52L ^ l10))));
                    }
                    catch (n9 n95) {
                        throw m44.a("i", (Object)n95, (long)-4688305679534337942L, (long)l10);
                    }
                }
                m44.a("u", (Object)this, (x6)((x6)js2), (long)-4908715198610597550L, (long)l10);
                n12 = h12.readUnsignedShort();
            }
            int n14 = n12;
            this.J = new byte[n14];
            int n15 = 0;
            block10: while (n15 < n14) {
                try {
                    m44.a("w", (Object)this, (long)-5080601778376788574L, (long)l10)[n15] = (CallSite)((byte)h12.readUnsignedByte());
                    ++n15;
                    do {
                        CallSite callSite3 = callSite;
                        if (n11 >= 0) {
                            if (callSite3 == false) break block18;
                            callSite3 = callSite;
                        }
                        if (callSite3 != false) continue block10;
                    } while (n10 < 0);
                    break;
                }
                catch (n9 n96) {
                    throw m44.a("i", (Object)n96, (long)-4688305679534337942L, (long)l10);
                }
            }
            m44.a("u", (Object)this, (boolean)true, (long)-6644385328143398836L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void q(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (DataOutputStream)var1_1[1];
        var2_2 = b3.a ^ var2_2;
        v0 = m44.a("m", (long)-3639832691831423948L, (long)var2_2);
        var4_3.writeShort(m44.a("s", (Object)this, (long)-3067920935792445474L, (long)var2_2).E());
        var5_4 = v0;
        var4_3.writeShort(((CallSite)m44.a("s", (Object)this, (long)-2886208982694208722L, (long)var2_2)).length);
        var6_5 = 0;
        while (var6_5 < ((CallSite)m44.a("s", (Object)this, (long)-2886208982694208722L, (long)var2_2)).length) {
            var4_3.writeByte((int)m44.a("s", (Object)this, (long)-2886208982694208722L, (long)var2_2)[var6_5]);
            ++var6_5;
lbl13:
            // 2 sources

            ** while (var5_4 == false)
lbl14:
            // 1 sources

        }
lbl15:
        // 2 sources

        if (var2_2 <= 0L) ** GOTO lbl13
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                b3.a = prr.a(-188192986273127368L, 4729952750486142939L, MethodHandles.lookup().lookupClass()).a(212768171983645L);
                b3.d = new HashMap<K, V>(13);
                var0 = b3.a ^ 24114853040824L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "b\u0099h\u00dcm\u0083\u008f\u00a0*\u001fd\u00c9\u00cc<\u008e$)\u00edc\u00df\u00e3g0i\u00d5\u0093HGz\u001f\u00e2\u0095@\u00f0\u00fa\fOvY\u00d7H\u0013\u00ab\u001e\u00f5%U\u00d0\u00db\u00c9\u00c1\t\u0001\u00f4o\u007f\u00d9f\u00f6W\u00cf\u00a5y\u0011\u00f3\u0092utqX\u00c4\u0018\u0095\u00ec:\u0007\u00a6ZJRx\u00can\u008b4\u00c8\u00d1t\u00e2Z9\u00eb\u00e4\u00e5(\u00886#\u0006a\u00bdA\u00d5@7i\u008ca=;#\u0096o0\u00a8\u00b2\u009c?\u00b3\u0007d\u00e6\u0096\r\u00f5\u00bc\b|\u009e<\u00a6d\u001d\u000f]\u00cbC\u0086\u00a2,\u000b2\u00e4D\u00891\\]\u00d1\u00ffArt\u00db\u0097M\u00f9\u0006 \u00a3\u00efZ";
                var8_6 = "b\u0099h\u00dcm\u0083\u008f\u00a0*\u001fd\u00c9\u00cc<\u008e$)\u00edc\u00df\u00e3g0i\u00d5\u0093HGz\u001f\u00e2\u0095@\u00f0\u00fa\fOvY\u00d7H\u0013\u00ab\u001e\u00f5%U\u00d0\u00db\u00c9\u00c1\t\u0001\u00f4o\u007f\u00d9f\u00f6W\u00cf\u00a5y\u0011\u00f3\u0092utqX\u00c4\u0018\u0095\u00ec:\u0007\u00a6ZJRx\u00can\u008b4\u00c8\u00d1t\u00e2Z9\u00eb\u00e4\u00e5(\u00886#\u0006a\u00bdA\u00d5@7i\u008ca=;#\u0096o0\u00a8\u00b2\u009c?\u00b3\u0007d\u00e6\u0096\r\u00f5\u00bc\b|\u009e<\u00a6d\u001d\u000f]\u00cbC\u0086\u00a2,\u000b2\u00e4D\u00891\\]\u00d1\u00ffArt\u00db\u0097M\u00f9\u0006 \u00a3\u00efZ".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = b3.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0081\u00f2\u0097\u0088\u0005(\u0094\u00e4\u001c9\u00b6\r=\u0090Y\u000b\u00b7.\u0019\u00fd \u00e3)A\u00f2\u00e9 \u008c\u0007\u0094\u00e0\u0080i\u0011\u00e8E\u00b1\u000bW>;b\u00b4\u00be\u00e6t\u00d9\u00d4?\u00a92e5L\u00d8\u00a4\u0081X\u00e9\f\u00d0\u0005f\u00f3\u0010\u001a\u00a5\u00e5\u00c9X\u0013w\u00f5\u00e2\u0015\u00da\u001d#_\u00a8)";
                    var8_6 = "\u0081\u00f2\u0097\u0088\u0005(\u0094\u00e4\u001c9\u00b6\r=\u0090Y\u000b\u00b7.\u0019\u00fd \u00e3)A\u00f2\u00e9 \u008c\u0007\u0094\u00e0\u0080i\u0011\u00e8E\u00b1\u000bW>;b\u00b4\u00be\u00e6t\u00d9\u00d4?\u00a92e5L\u00d8\u00a4\u0081X\u00e9\f\u00d0\u0005f\u00f3\u0010\u001a\u00a5\u00e5\u00c9X\u0013w\u00f5\u00e2\u0015\u00da\u001d#_\u00a8)".length();
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
                    var9_3[var7_4++] = b3.a(var10_9).intern();
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
        b3.b = var9_3;
        b3.c = new String[5];
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5D64;
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
                throw new RuntimeException("com/zelix/b3", exception);
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
            b3.c[n11] = b3.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = b3.a(n10, l10);
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
            throw new RuntimeException("com/zelix/b3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

