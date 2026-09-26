/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.kx;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.x8;
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

public class bw
extends kx
implements ni {
    private x8 D;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    /*
     * Unable to fully structure code
     */
    bw(_4 var1_1, int var2_2, String var3_3, h1 var4_4, l6q var5_5, long var6_6) {
        block23: {
            block24: {
                block21: {
                    block22: {
                        v0 = var6_6 = bw.a ^ var6_6;
                        var8_7 = v0 ^ 58790364631718L;
                        var10_8 = v0 ^ 26182878551874L;
                        var12_9 = v0 ^ 60467016923596L;
                        var14_10 = v0 ^ 52582183504573L;
                        var16_11 = v0 ^ 127730119916783L;
                        var18_12 = v0 ^ 22530696862120L;
                        v1 = m44.a("o", (long)-5206464841328769290L, (long)var6_6);
                        super(var1_1, var2_2, var14_10, var3_3, var4_4, var5_5);
                        m44.a("s", (Object)this, (byte[])new byte[this.W], (long)-5956966467069961909L, (long)var6_6);
                        var4_4.read((byte[])m44.a("q", (Object)this, (long)-5956966467069961909L, (long)var6_6));
                        var20_13 = v1;
                        v2 = new Object[3];
                        v2[2] = var10_8;
                        v2[1] = false;
                        v2[0] = m44.a("q", (Object)this, (long)-5956966467069961909L, (long)var6_6);
                        var21_14 = m44.a("o", (Object)v2, (long)-5963347596875968011L, (long)var6_6);
                        var22_15 = null;
                        var23_16 = var21_14.readUnsignedShort();
                        var24_19 = var1_1.m(var16_11, var23_16);
                        v3 = var24_19;
                        if (var20_13 == false) break block21;
                        try {
                            block27: {
                                if (v3 != null) break block22;
                                break block27;
                                catch (Throwable v4) {
                                    throw m44.a("o", (Object)v4, (long)-5757871733810709836L, (long)var6_6);
                                }
                            }
                            m44.a("s", (Object)this, (boolean)false, (long)-5841222549495126983L, (long)var6_6);
                            throw new aw((String)m44.a("p", (Object)var1_1.G(var12_9), (long)var8_7, (long)-5333918364416195238L, (long)var6_6) + (String)bw.b("y", (int)28438, (long)(6068729843703208683L ^ var6_6)) + var23_16 + (String)bw.b("y", (int)29357, (long)(6024627171372549974L ^ var6_6)));
                        }
                        catch (Throwable v5) {
                            throw m44.a("o", (Object)v5, (long)-5757871733810709836L, (long)var6_6);
                        }
                    }
                    v3 = var24_19;
                }
                try {
                    if (!(v3 instanceof x8)) {
                        m44.a("s", (Object)this, (boolean)false, (long)-5841222549495126983L, (long)var6_6);
                        throw new aw((String)m44.a("p", (Object)var1_1.G(var12_9), (long)var8_7, (long)-5333918364416195238L, (long)var6_6) + (String)bw.b("y", (int)27242, (long)(5477615983056412566L ^ var6_6)) + var23_16 + (String)bw.b("y", (int)9457, (long)(1355130027443982606L ^ var6_6)) + var24_19.getClass().getName() + (String)bw.b("y", (int)18976, (long)(7832921545922248670L ^ var6_6)));
                    }
                }
                catch (Throwable v6) {
                    throw m44.a("o", (Object)v6, (long)-5757871733810709836L, (long)var6_6);
                }
                m44.a("s", (Object)this, (x8)((x8)var24_19), (long)-5312216559296712897L, (long)var6_6);
                var5_5.t(m44.a("q", (Object)this, (long)-5312216559296712897L, (long)var6_6), this, var18_12);
                if (var21_14 == null) break block23;
                if (var22_15 == null) break block24;
                try {
                    m44.a("p", (Object)var21_14, (long)-5684097051215283147L, (long)var6_6);
                }
                catch (Throwable var23_17) {
                    m44.a("p", (Object)var22_15, (Object)var23_17, (long)-5836800675298143609L, (long)var6_6);
                }
                break block23;
            }
            m44.a("p", (Object)var21_14, (long)-5684097051215283147L, (long)var6_6);
            break block23;
            catch (Throwable var23_18) {
                try {
                    var22_15 = var23_18;
                    throw var23_18;
                }
                catch (Throwable var25_20) {
                    block26: {
                        block25: {
                            try {
                                if (var21_14 == null) break block25;
                                if (var22_15 != null) {
                                }
                                ** GOTO lbl82
                            }
                            catch (Throwable v7) {
                                throw m44.a("o", (Object)v7, (long)-5757871733810709836L, (long)var6_6);
                            }
                            try {
                                m44.a("p", (Object)var21_14, (long)-5684097051215283147L, (long)var6_6);
                            }
                            catch (Throwable var26_21) {
                                try {
                                    v8 = var22_15;
                                    if (var6_6 < 0L) break block26;
                                    m44.a("p", (Object)v8, (Object)var26_21, (long)-5836800675298143609L, (long)var6_6);
                                    if (var20_13 != false) break block25;
lbl82:
                                    // 2 sources

                                    m44.a("p", (Object)var21_14, (long)-5684097051215283147L, (long)var6_6);
                                }
                                catch (Throwable v9) {
                                    throw m44.a("o", (Object)v9, (long)-5757871733810709836L, (long)var6_6);
                                }
                            }
                        }
                        v8 = var25_20;
                    }
                    throw v8;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void c(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (DataOutputStream)var1_1[1];
                var5_4 = var2_2 ^ 0L;
                v0 = m44.a("i", (long)716282175763740856L, (long)var2_2);
                v1 = new Object[2];
                v1[1] = var4_3;
                v1[0] = var5_4;
                super.c(v1);
                var7_5 = v0;
                try {
                    try {
                        if (var7_5 == false) break block8;
                        if (m44.a("w", (Object)this, (long)1198408428474194551L, (long)var2_2) != false) {
                        }
                        ** GOTO lbl28
                    }
                    catch (n9 v2) {
                        throw m44.a("i", (Object)v2, (long)1034063464213873914L, (long)var2_2);
                    }
                    var4_3.writeShort(m44.a("w", (Object)this, (long)579102022259003761L, (long)var2_2).E());
                }
                catch (n9 v3) {
                    throw m44.a("i", (Object)v3, (long)1034063464213873914L, (long)var2_2);
                }
            }
            try {
                if (var2_2 < 0L || var7_5 != false) break block9;
lbl28:
                // 2 sources

                var4_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var2_2));
            }
            catch (n9 v4) {
                throw m44.a("i", (Object)v4, (long)1034063464213873914L, (long)var2_2);
            }
        }
    }

    @Override
    void z(gu gu2, long l10) {
        block4: {
            long l11 = l10 ^ 0x6DE1DADD9981L;
            CallSite callSite = m44.a("h", (long)6170399952317654249L, (long)l10);
            this.b.e(l11, gu2, this, this.H());
            CallSite callSite2 = callSite;
            try {
                Object object;
                try {
                    object = m44.a("v", (Object)this, (long)5544088189886891558L, (long)l10);
                    if (callSite2 == false || object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)5911167980024223915L, (long)l10);
                }
                object = ((x8)((Object)m44.a("v", (Object)this, (long)6077738474324692256L, (long)l10))).e(l11, gu2, this, this.H());
            }
            catch (n9 n93) {
                throw m44.a("h", (Object)n93, (long)5911167980024223915L, (long)l10);
            }
        }
    }

    @Override
    public void W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        int n11 = (Integer)objectArray[2];
        HashMap hashMap = (HashMap)objectArray[3];
        HashMap hashMap2 = (HashMap)objectArray[4];
    }

    @Override
    public void N(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        Map map = (Map)objectArray[1];
        long l10 = (Long)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
        long l11 = l10 ^ 0x38CA7A671EA2L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = dataOutputStream;
        objectArray2[0] = l11;
        m44.a("t", (Object)this, (Object)objectArray2, (long)593294161513379226L, (long)l10);
    }

    @Override
    public void q(x8 x82, long l10, x8 x83) {
        block8: {
            bw bw2;
            long l11;
            block6: {
                l11 = l10 ^ 0L;
                CallSite callSite = m44.a("n", (long)-5231047857311529425L, (long)l10);
                try {
                    block7: {
                        try {
                            try {
                                bw2 = this;
                                if (callSite == false) break block6;
                                if (m44.a("p", (Object)bw2, (long)-5287708300416978970L, (long)l10) != x82) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)-5706464980617250195L, (long)l10);
                            }
                            m44.a("r", (Object)this, (x8)x83, (long)-5287708300416978970L, (long)l10);
                            if (callSite != false) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)-5706464980617250195L, (long)l10);
                        }
                    }
                    bw2 = this;
                }
                catch (n9 n94) {
                    throw m44.a("n", (Object)n94, (long)-5706464980617250195L, (long)l10);
                }
            }
            super.q(x82, l11, x83);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                bw.a = prr.a(-5923672588911462869L, -4885082978473725188L, MethodHandles.lookup().lookupClass()).a(126167404116780L);
                bw.g = new HashMap<K, V>(13);
                var0 = bw.a ^ 105794012359974L;
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
                var6_5 = "\u00d4\u008b\u0002\u00a0\u0092p\u00a8\u00c7\u00eaV:\u00f5\b,\u00fds@\u0081\u0000T\u008c\\\u00ed?\u00eb\u0098\u00c0\u0084\u00a9\u0098\u0095YKW%\u00d2r\u007fDR\u00e0\u00bdv\u00b9\u00e8F\u00dc\u00c7J\u000e\u00ed\u0017\u0092\u008e\u00c8:U\u00f7\u00f6\u00ad\u00923\u00deX\u0015\u00bbs\u00ff\u00ecor\u008f\u0084\u00c1\b\u00d6\u008d(\u0019\u00e5\u00db@\u0094\u00aaf3\u0097\u00ea\u00a5\u0012\u00e7A-\u00efq\u00f4\u0017*\u0011\u00b7\u00c7\u00df\u0017?a\u00e6\u00ac\u00a6\u00ee?\u00a6!\u0014\u00f7\u0081z\u0015\u00bd;\u00da2\u00b2\u009cf\u00c2\u00d4\u00df$\u00ab~\u009d\u00d2\u00feq\u00b1\u0086\\z+\u00fc\u00e9\u00a5\u00c2\u0012\u008f'";
                var8_6 = "\u00d4\u008b\u0002\u00a0\u0092p\u00a8\u00c7\u00eaV:\u00f5\b,\u00fds@\u0081\u0000T\u008c\\\u00ed?\u00eb\u0098\u00c0\u0084\u00a9\u0098\u0095YKW%\u00d2r\u007fDR\u00e0\u00bdv\u00b9\u00e8F\u00dc\u00c7J\u000e\u00ed\u0017\u0092\u008e\u00c8:U\u00f7\u00f6\u00ad\u00923\u00deX\u0015\u00bbs\u00ff\u00ecor\u008f\u0084\u00c1\b\u00d6\u008d(\u0019\u00e5\u00db@\u0094\u00aaf3\u0097\u00ea\u00a5\u0012\u00e7A-\u00efq\u00f4\u0017*\u0011\u00b7\u00c7\u00df\u0017?a\u00e6\u00ac\u00a6\u00ee?\u00a6!\u0014\u00f7\u0081z\u0015\u00bd;\u00da2\u00b2\u009cf\u00c2\u00d4\u00df$\u00ab~\u009d\u00d2\u00feq\u00b1\u0086\\z+\u00fc\u00e9\u00a5\u00c2\u0012\u008f'".length();
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
                    var9_3[var7_4++] = bw.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = ".U\u00ed\u00d2\u009aYGY\u00a9H\u00e4?\u00c0\n\u0081C\u00a8\u00a4\"\u00d5l\u000ey@\u00d1\u009b\u00e7\u00c4\u00be\u00b7\u0015\u00eb\u00a1\u0013Mj\u00c2h\u0091CH\u00fcq\u00d1\u000e\u00a7\u00ac\u0087\u0087\u0011/P=\u00b0>\u0098\u0098\u00cc\u00aa\u00d9\u00f7\u00f3k\u008e\u00a1)\u0090cP\u00fa\u00a52a\tv\u0085D\u00ead'\u00e9\u00d0k\u0004Sr\u0081\u0011\u0003\u00fd\u00faW\u00ae\r\u00a8\u00edah\u009b\u00bc\u0002\u00fb\u00d0\u00de\u000fD\u00a0\u00c0\u00bf\u00b4Xl\u0091";
                    var8_6 = ".U\u00ed\u00d2\u009aYGY\u00a9H\u00e4?\u00c0\n\u0081C\u00a8\u00a4\"\u00d5l\u000ey@\u00d1\u009b\u00e7\u00c4\u00be\u00b7\u0015\u00eb\u00a1\u0013Mj\u00c2h\u0091CH\u00fcq\u00d1\u000e\u00a7\u00ac\u0087\u0087\u0011/P=\u00b0>\u0098\u0098\u00cc\u00aa\u00d9\u00f7\u00f3k\u008e\u00a1)\u0090cP\u00fa\u00a52a\tv\u0085D\u00ead'\u00e9\u00d0k\u0004Sr\u0081\u0011\u0003\u00fd\u00faW\u00ae\r\u00a8\u00edah\u009b\u00bc\u0002\u00fb\u00d0\u00de\u000fD\u00a0\u00c0\u00bf\u00b4Xl\u0091".length();
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
                    var9_3[var7_4++] = bw.c(var10_9).intern();
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
        bw.c = var9_3;
        bw.d = new String[5];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x115F;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bw", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            bw.d[n11] = bw.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = bw.b(n10, l10);
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
            throw new RuntimeException("com/zelix/bw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bw.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

