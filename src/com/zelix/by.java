/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.eo;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.kx;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
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

public class by
extends kx
implements ni,
eo {
    private jf X;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    /*
     * Unable to fully structure code
     */
    by(char var1_1, _4 var2_2, int var3_3, int var4_4, char var5_5, String var6_6, h1 var7_7, l6q var8_8, l6q var9_9) {
        block23: {
            block24: {
                block21: {
                    block22: {
                        v0 = var10_10 = ((long)var1_1 << 48 | (long)var4_4 << 32 >>> 16 | (long)var5_5 << 48 >>> 48) ^ by.a;
                        var12_11 = v0 ^ 15361807081739L;
                        var14_12 = v0 ^ 52023545162991L;
                        var16_13 = v0 ^ 15934644374113L;
                        var18_14 = v0 ^ 25642022189328L;
                        var20_15 = v0 ^ 84301579128642L;
                        var22_16 = v0 ^ 49466613688837L;
                        super(var2_2, var3_3, var18_14, var6_6, var7_7, var8_8);
                        m44.a("v", (Object)this, (byte[])new byte[this.W], (long)-6991378758009574682L, (long)var10_10);
                        var7_7.read((byte[])m44.a("t", (Object)this, (long)-6991378758009574682L, (long)var10_10));
                        v1 = new Object[3];
                        v1[2] = var14_12;
                        v1[1] = false;
                        v1[0] = m44.a("t", (Object)this, (long)-6991378758009574682L, (long)var10_10);
                        var25_17 = m44.a("j", (Object)v1, (long)-7020876024530967976L, (long)var10_10);
                        var26_18 = null;
                        var24_19 = m44.a("j", (long)-8929561298467228325L, (long)var10_10);
                        var27_20 = var25_17.readUnsignedShort();
                        var28_23 = var2_2.m(var20_15, var27_20);
                        v2 = var28_23;
                        if (var24_19 == false) break block21;
                        try {
                            block27: {
                                if (v2 != null) break block22;
                                break block27;
                                catch (Throwable v3) {
                                    throw m44.a("j", (Object)v3, (long)-8962598520013260082L, (long)var10_10);
                                }
                            }
                            m44.a("v", (Object)this, (boolean)false, (long)-7114852286755088492L, (long)var10_10);
                            throw new aw((String)m44.a("u", (Object)var2_2.G(var16_13), (long)var12_11, (long)-8766497456888514825L, (long)var10_10) + (String)by.b("s", (int)11071, (long)(4698102895292478941L ^ var10_10)) + var27_20 + (String)by.b("s", (int)15209, (long)(57201640330618249L ^ var10_10)));
                        }
                        catch (Throwable v4) {
                            throw m44.a("j", (Object)v4, (long)-8962598520013260082L, (long)var10_10);
                        }
                    }
                    v2 = var28_23;
                }
                try {
                    if (!(v2 instanceof jf)) {
                        m44.a("v", (Object)this, (boolean)false, (long)-7114852286755088492L, (long)var10_10);
                        throw new aw((String)m44.a("u", (Object)var2_2.G(var16_13), (long)var12_11, (long)-8766497456888514825L, (long)var10_10) + (String)by.b("s", (int)11793, (long)(2652577630959464695L ^ var10_10)) + var27_20 + (String)by.b("s", (int)7312, (long)(38439881728705139L ^ var10_10)) + var28_23.getClass().getName() + (String)by.b("s", (int)31127, (long)(2885141867237746550L ^ var10_10)));
                    }
                }
                catch (Throwable v5) {
                    throw m44.a("j", (Object)v5, (long)-8962598520013260082L, (long)var10_10);
                }
                m44.a("v", (Object)this, (jf)((jf)var28_23), (long)-9022420004901896212L, (long)var10_10);
                var9_9.t((Object)m44.a("t", (Object)this, (long)-9022420004901896212L, (long)var10_10), (Object)this, var22_16);
                if (var25_17 == null) break block23;
                if (var26_18 == null) break block24;
                try {
                    m44.a("u", (Object)var25_17, (long)-9028803178732810344L, (long)var10_10);
                }
                catch (Throwable var27_21) {
                    m44.a("u", (Object)var26_18, (Object)var27_21, (long)-7110413924136574678L, (long)var10_10);
                }
                break block23;
            }
            m44.a("u", (Object)var25_17, (long)-9028803178732810344L, (long)var10_10);
            break block23;
            catch (Throwable var27_22) {
                try {
                    var26_18 = var27_22;
                    throw var27_22;
                }
                catch (Throwable var29_24) {
                    block26: {
                        block25: {
                            try {
                                if (var25_17 == null) break block25;
                                if (var26_18 != null) {
                                }
                                ** GOTO lbl81
                            }
                            catch (Throwable v6) {
                                throw m44.a("j", (Object)v6, (long)-8962598520013260082L, (long)var10_10);
                            }
                            try {
                                m44.a("u", (Object)var25_17, (long)-9028803178732810344L, (long)var10_10);
                            }
                            catch (Throwable var30_25) {
                                try {
                                    v7 = var26_18;
                                    if (var5_5 <= '\u0000') break block26;
                                    m44.a("u", (Object)v7, (Object)var30_25, (long)-7110413924136574678L, (long)var10_10);
                                    if (var24_19 != false) break block25;
lbl81:
                                    // 2 sources

                                    m44.a("u", (Object)var25_17, (long)-9028803178732810344L, (long)var10_10);
                                }
                                catch (Throwable v8) {
                                    throw m44.a("j", (Object)v8, (long)-8962598520013260082L, (long)var10_10);
                                }
                            }
                        }
                        v7 = var29_24;
                    }
                    throw v7;
                }
            }
        }
    }

    void z(gu gu2, long l) {
        block4: {
            long l2 = l;
            long l3 = l2 ^ 0x6DE1DADD9981L;
            long l4 = l2 ^ 0x6DE1DADD9981L;
            CallSite callSite = m44.a("h", (long)6170399952317654249L, (long)l);
            this.b.e(l4, gu2, (Object)this, (Object)this.H());
            CallSite callSite2 = callSite;
            try {
                Object object;
                try {
                    object = m44.a("v", (Object)((Object)this), (long)5544088189886891558L, (long)l);
                    if (callSite2 == false || object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)5921122448880249724L, (long)l);
                }
                object = m44.a("v", (Object)((Object)this), (long)6015566180948012638L, (long)l).e(l3, gu2, (Object)this, this.H());
            }
            catch (n9 n93) {
                throw m44.a("h", (Object)((Object)n93), (long)5921122448880249724L, (long)l);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void N(Object[] var1_1) {
        block20: {
            block19: {
                block18: {
                    block17: {
                        var5_2 = (DataOutputStream)var1_1[0];
                        var4_3 = (Map)var1_1[1];
                        var2_4 = (Long)var1_1[2];
                        var6_5 = (lqu)var1_1[3];
                        var7_6 = var2_4 ^ 62442288127650L;
                        v0 = m44.a("k", (long)1680553024964027930L, (long)var2_4);
                        v1 = new Object[2];
                        v1[1] = var5_2;
                        v1[0] = var7_6;
                        super.c(v1);
                        var9_7 = v0;
                        try {
                            try {
                                v2 /* !! */  = this;
                                if (var9_7 == false) break block17;
                                if (m44.a("u", (Object)v2 /* !! */ , (long)1009829788873835733L, (long)var2_4) != false) {
                                }
                                ** GOTO lbl59
                            }
                            catch (n9 v3) {
                                throw m44.a("k", (Object)v3, (long)1215727244862974351L, (long)var2_4);
                            }
                            v2 /* !! */  = var4_3.get(m44.a("u", (Object)this, (long)1263463740155178157L, (long)var2_4));
                        }
                        catch (n9 v4) {
                            throw m44.a("k", (Object)v4, (long)1215727244862974351L, (long)var2_4);
                        }
                    }
                    var10_8 = (js)v2 /* !! */ ;
                    try {
                        try {
                            v5 = var9_7;
                            if (var2_4 <= 0L) ** GOTO lbl47
                            if (v5 == false) break block18;
                            if (var10_8 != null) {
                            }
                            ** GOTO lbl50
                        }
                        catch (n9 v6) {
                            throw m44.a("k", (Object)v6, (long)1215727244862974351L, (long)var2_4);
                        }
                        var5_2.writeShort(var10_8.E());
                    }
                    catch (n9 v7) {
                        throw m44.a("k", (Object)v7, (long)1215727244862974351L, (long)var2_4);
                    }
                }
                try {
                    v5 = var9_7;
lbl47:
                    // 2 sources

                    if (var2_4 > 0L) {
                        if (v5 != false) break block19;
                    }
                    ** GOTO lbl58
lbl50:
                    // 2 sources

                    var5_2.writeShort(m44.a("u", (Object)this, (long)1263463740155178157L, (long)var2_4).E());
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)1215727244862974351L, (long)var2_4);
                }
            }
            try {
                if (var2_4 < 0L) break block20;
                v5 = var9_7;
lbl58:
                // 2 sources

                if (v5 != false) break block20;
lbl59:
                // 2 sources

                var5_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var2_4));
            }
            catch (n9 v9) {
                throw m44.a("k", (Object)v9, (long)1215727244862974351L, (long)var2_4);
            }
        }
    }

    public void W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        HashMap hashMap = (HashMap)objectArray[3];
        HashMap hashMap2 = (HashMap)objectArray[4];
    }

    public void S(Object[] objectArray) {
        block5: {
            by by2;
            long l;
            jf jf2;
            block4: {
                jf jf3 = (jf)objectArray[0];
                jf2 = (jf)objectArray[1];
                l = (Long)objectArray[2];
                CallSite callSite = m44.a("o", (long)-7028195342100598978L, (long)l);
                try {
                    try {
                        by2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("q", (Object)((Object)by2), (long)-7445318714952473207L, (long)l) != jf3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-7351155538670133077L, (long)l);
                    }
                    by2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)-7351155538670133077L, (long)l);
                }
            }
            m44.a("s", (Object)((Object)by2), (jf)jf2, (long)-7445318714952473207L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void c(Object[] var1_1) {
        block9: {
            block8: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (DataOutputStream)var1_1[1];
                var5_4 = var3_2 ^ 0L;
                v0 = m44.a("i", (long)1272493964096652623L, (long)var3_2);
                v1 = new Object[2];
                v1[1] = var2_3;
                v1[0] = var5_4;
                super.c(v1);
                var7_5 = v0;
                try {
                    try {
                        if (var7_5 != false) break block8;
                        if (m44.a("w", (Object)this, (long)1198408428474194551L, (long)var3_2) != false) {
                        }
                        ** GOTO lbl28
                    }
                    catch (n9 v2) {
                        throw m44.a("i", (Object)v2, (long)1044018960639817517L, (long)var3_2);
                    }
                    var2_3.writeShort(m44.a("w", (Object)this, (long)1092828081542803983L, (long)var3_2).E());
                }
                catch (n9 v3) {
                    throw m44.a("i", (Object)v3, (long)1044018960639817517L, (long)var3_2);
                }
            }
            try {
                if (var3_2 < 0L || var7_5 == false) break block9;
lbl28:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var3_2));
            }
            catch (n9 v4) {
                throw m44.a("i", (Object)v4, (long)1044018960639817517L, (long)var3_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                by.a = prr.a((long)2218374709013416660L, (long)-6474929128115925101L, MethodHandles.lookup().lookupClass()).a(200945639403253L);
                by.g = new HashMap<K, V>(13);
                var0 = by.a ^ 118155392945489L;
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
                var6_5 = "|\u00b18/\u00e2bI\u00d4]\u00e5a\u0002\u00b7'C\u0097\u00e3\u00de(\u009c\u00a8\u0013\u0086\u0084x\u001dp\u00c5Deo$\u00b1\u00bek\u00d0\u00f5\u00f1\u00bc\u00bc+W{\t\u00c2i\u00d2\u00acS\u00ae0\u0005uC\u0095!\u00de\u0001\u00b8\u0080%\u0086\u007f}\u00b0\u0092\u00a0\u0085\u00c7KO<}\u0015I!X\u00ba\u007f\u00f3\u0010\u00d1JH\u00b4\u00fa\u00f9;\u00de:A\u009e\u0099\u00c6J\u0082H0|\u00ee+\u00fa\u00e8W\u008a~t\u00ef\u0096\u00bbJ\u00f5\u0017O\u007f\u00d1\u0091,\u009a\u00bc\u00cc,\u00b8.\u0001\u00adQz4\u008f\u00b3\u0087a\u00d4\u0091\u00c7\u0002@/\u00fe5NY\\\u00f2i";
                var8_6 = "|\u00b18/\u00e2bI\u00d4]\u00e5a\u0002\u00b7'C\u0097\u00e3\u00de(\u009c\u00a8\u0013\u0086\u0084x\u001dp\u00c5Deo$\u00b1\u00bek\u00d0\u00f5\u00f1\u00bc\u00bc+W{\t\u00c2i\u00d2\u00acS\u00ae0\u0005uC\u0095!\u00de\u0001\u00b8\u0080%\u0086\u007f}\u00b0\u0092\u00a0\u0085\u00c7KO<}\u0015I!X\u00ba\u007f\u00f3\u0010\u00d1JH\u00b4\u00fa\u00f9;\u00de:A\u009e\u0099\u00c6J\u0082H0|\u00ee+\u00fa\u00e8W\u008a~t\u00ef\u0096\u00bbJ\u00f5\u0017O\u007f\u00d1\u0091,\u009a\u00bc\u00cc,\u00b8.\u0001\u00adQz4\u008f\u00b3\u0087a\u00d4\u0091\u00c7\u0002@/\u00fe5NY\\\u00f2i".length();
                var5_7 = 80;
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
                    var9_3[var7_4++] = by.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00b7\u0013\u0090\u00ec\u00c8P\u00caST>\u00ec*2u\u00ad\u00ed\u001cZ\u0098\u0092Sr\u0005\u00f0\u0083\u001c\u00e2~X:>\u0013~!\u00b4$i\u0094\u00c2\u00cb]\u00db\u00f4\u0093\u0018\u00ca\u0080j\u00d10V\u00f4\u0017\u0011w\u0085\u00cb\u00b4\u0001=\u00c7]\u008d\u00860w\u00a7\u0004\u0013\u0098\u007f\u00b9\u0014\u000ex\u00c4\u0001\u00a8\u00a87\u0012\u00b2j\u00fc\u0096a\u0011\u0080\u00deHl!\u00e2\u00a0\u0083\u00c5\u00eb\u00d1 \u00b7S\u0003\u00c7\u008b\u001f!E\u0080\u00a2i8\u00ddV";
                    var8_6 = "\u00b7\u0013\u0090\u00ec\u00c8P\u00caST>\u00ec*2u\u00ad\u00ed\u001cZ\u0098\u0092Sr\u0005\u00f0\u0083\u001c\u00e2~X:>\u0013~!\u00b4$i\u0094\u00c2\u00cb]\u00db\u00f4\u0093\u0018\u00ca\u0080j\u00d10V\u00f4\u0017\u0011w\u0085\u00cb\u00b4\u0001=\u00c7]\u008d\u00860w\u00a7\u0004\u0013\u0098\u007f\u00b9\u0014\u000ex\u00c4\u0001\u00a8\u00a87\u0012\u00b2j\u00fc\u0096a\u0011\u0080\u00deHl!\u00e2\u00a0\u0083\u00c5\u00eb\u00d1 \u00b7S\u0003\u00c7\u008b\u001f!E\u0080\u00a2i8\u00ddV".length();
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
                    var9_3[var7_4++] = by.c(var10_9).intern();
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
        by.c = var9_3;
        by.d = new String[5];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x49EF;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/by", exception);
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
            by.d[n2] = by.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = by.b(n, l);
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
            throw new RuntimeException("com/zelix/by" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(by.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
