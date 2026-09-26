/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._e;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.k3;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.x8;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bz
extends _4
implements ni {
    String X;
    private x8 h;
    boolean w;
    private int l;
    private static final long a = prr.a(-6790783244392525827L, 5951580102105090884L, MethodHandles.lookup().lookupClass()).a(132988671165919L);
    private static final String b;
    private static final long c;

    bz(k3 k32, to to2, long l10, List list) {
        x8 x82;
        l10 = a ^ l10;
        super(k32);
        m44.a("u", (Object)this, (boolean)true, (long)-7242778781357462415L, (long)l10);
        this.h = x82 = to2.t("a", list);
    }

    boolean F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("v", (Object)this, (long)-3157865173823331552L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    bz(_4 _42, h1 h12, l6q l6q2, int n10, char c10, short s10) {
        block12: {
            js js2;
            long l10;
            long l11;
            long l12;
            block13: {
                int n11;
                bz bz2;
                CallSite callSite;
                long l13;
                long l14;
                block11: {
                    long l15 = l12 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)s10 << 48 >>> 48) ^ a;
                    l11 = l15 ^ 0x64970BD6A421L;
                    l10 = l15 ^ 0x16F5643F8CFEL;
                    l14 = l15 ^ 0x5B98A201196CL;
                    l13 = l15 ^ 0x3BCE08437C2BL;
                    super(_42);
                    CallSite callSite2 = m44.a("l", (long)749202965696110210L, (long)l12);
                    m44.a("p", (Object)this, (boolean)true, (long)1418944774428239036L, (long)l12);
                    callSite = callSite2;
                    int n12 = h12.readUnsignedShort();
                    try {
                        try {
                            bz2 = this;
                            n11 = h12.readUnsignedShort();
                            if (callSite != false) break block11;
                            m44.a("p", (Object)bz2, (int)n11, (long)774478763694984101L, (long)l12);
                            if (n12 == 0) break block12;
                        }
                        catch (n9 n92) {
                            throw m44.a("l", (Object)n92, (long)962252510408722740L, (long)l12);
                        }
                        bz2 = this;
                        n11 = n12;
                    }
                    catch (n9 n93) {
                        throw m44.a("l", (Object)n93, (long)962252510408722740L, (long)l12);
                    }
                }
                js2 = bz2.m(l14, n11);
                try {
                    block14: {
                        try {
                            try {
                                Object object = callSite;
                                if (c10 >= '\u0000') {
                                    if (object != false) break block13;
                                    object = js2 instanceof x8;
                                }
                                if (object == false) break block14;
                            }
                            catch (n9 n94) {
                                throw m44.a("l", (Object)n94, (long)962252510408722740L, (long)l12);
                            }
                            this.h = (x8)js2;
                            l6q2.t(this.h, this, l13);
                            if (callSite == false) break block12;
                        }
                        catch (n9 n95) {
                            throw m44.a("l", (Object)n95, (long)962252510408722740L, (long)l12);
                        }
                    }
                    m44.a("p", (Object)this, (boolean)false, (long)1418944774428239036L, (long)l12);
                }
                catch (n9 n96) {
                    throw m44.a("l", (Object)n96, (long)962252510408722740L, (long)l12);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l10;
            objectArray[0] = js2.A(l11);
            m44.a("p", (Object)this, (String)(b + (String)((Object)m44.a("l", (Object)objectArray, (long)1545081215819541701L, (long)l12)) + "'"), (long)967953152293785590L, (long)l12);
        }
    }

    @Override
    void z(gu gu2, long l10) {
        long l11 = l10 ^ 0x66FDF08525FDL;
        try {
            if (this.h != null) {
                gu2.K(this.h, this, l11, this.H());
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)n92, (long)5388264360302644904L, (long)l10);
        }
    }

    String i(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)5468152993468811642L, (long)l10);
    }

    @Override
    public void q(x8 x82, long l10, x8 x83) {
        block9: {
            block10: {
                bz bz2;
                x8 x84;
                block8: {
                    CallSite callSite = m44.a("n", (long)-5231047857311529425L, (long)l10);
                    try {
                        try {
                            try {
                                x84 = this.h;
                                if (l10 < 0L || callSite == false) break block8;
                                if (x84 == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)n92, (long)-6340845885325874066L, (long)l10);
                            }
                            bz2 = this;
                            if (callSite == false) break block10;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)n93, (long)-6340845885325874066L, (long)l10);
                        }
                        x84 = bz2.h;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)n94, (long)-6340845885325874066L, (long)l10);
                    }
                }
                try {
                    if (x84 != x82) break block9;
                    bz2 = this;
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)n95, (long)-6340845885325874066L, (long)l10);
                }
            }
            bz2.h = x83;
        }
    }

    int W(Object[] objectArray) {
        return 4;
    }

    /*
     * Unable to fully structure code
     */
    void W(Object[] var1_1) {
        block6: {
            var3_2 = (Long)var1_1[0];
            var2_3 = (Integer)var1_1[1];
            var3_2 = bz.a ^ var3_2;
            var5_4 = m44.a("m", (long)-300460568987324621L, (long)var3_2);
            try {
                if (this.h == null) break block6;
                if (_e.vH) {
                }
                ** GOTO lbl17
            }
            catch (n9 v0) {
                throw m44.a("m", (Object)v0, (long)-221904417218086779L, (long)var3_2);
            }
            var6_5 = this.h.V() + (char)bz.c + "a";
            try {
                this.h.A(var6_5);
                if (var3_2 < 0L || var5_4 == false) break block6;
lbl17:
                // 2 sources

                this.h.A("a");
            }
            catch (n9 v1) {
                throw m44.a("m", (Object)v1, (long)-221904417218086779L, (long)var3_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void L(Object[] var1_1) {
        block9: {
            block10: {
                block8: {
                    var4_2 = (DataOutputStream)var1_1[0];
                    var2_3 = (Long)var1_1[1];
                    var2_3 = bz.a ^ var2_3;
                    var5_4 = m44.a("i", (long)-7108717360216544240L, (long)var2_3);
                    try {
                        try {
                            if (var5_4 == false) break block8;
                            if (this.h != null) {
                            }
                            ** GOTO lbl22
                        }
                        catch (n9 v0) {
                            throw m44.a("i", (Object)v0, (long)-9061351533179550127L, (long)var2_3);
                        }
                        var4_2.writeShort(this.h.E());
                    }
                    catch (n9 v1) {
                        throw m44.a("i", (Object)v1, (long)-9061351533179550127L, (long)var2_3);
                    }
                }
                try {
                    if (var2_3 < 0L) break block9;
                    if (var5_4 != false) break block10;
lbl22:
                    // 2 sources

                    var4_2.writeShort(0);
                }
                catch (n9 v2) {
                    throw m44.a("i", (Object)v2, (long)-9061351533179550127L, (long)var2_3);
                }
            }
            var4_2.writeShort((int)m44.a("w", (Object)this, (long)-8801574017059781440L, (long)var2_3));
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void l(Object[] var1_1) {
        block20: {
            block21: {
                block19: {
                    block18: {
                        block17: {
                            var4_2 = (Long)var1_1[0];
                            var6_3 = (DataOutputStream)var1_1[1];
                            var3_4 = (Map)var1_1[2];
                            var2_5 = (lqu)var1_1[3];
                            var4_2 = bz.a ^ var4_2;
                            var7_6 = m44.a("j", (long)-4304386850661550837L, (long)var4_2);
                            try {
                                try {
                                    v0 /* !! */  = this.h;
                                    if (var7_6 == false) break block17;
                                    if (v0 /* !! */  != null) {
                                    }
                                    ** GOTO lbl52
                                }
                                catch (n9 v1) {
                                    throw m44.a("j", (Object)v1, (long)-2655750471499440310L, (long)var4_2);
                                }
                                v0 /* !! */  = (js)var3_4.get(this.h);
                            }
                            catch (n9 v2) {
                                throw m44.a("j", (Object)v2, (long)-2655750471499440310L, (long)var4_2);
                            }
                        }
                        var8_7 = v0 /* !! */ ;
                        try {
                            try {
                                v3 = var7_6;
                                if (var4_2 <= 0L) ** GOTO lbl40
                                if (v3 == false) break block18;
                                if (var8_7 != null) {
                                }
                                ** GOTO lbl43
                            }
                            catch (n9 v4) {
                                throw m44.a("j", (Object)v4, (long)-2655750471499440310L, (long)var4_2);
                            }
                            var6_3.writeShort(var8_7.E());
                        }
                        catch (n9 v5) {
                            throw m44.a("j", (Object)v5, (long)-2655750471499440310L, (long)var4_2);
                        }
                    }
                    try {
                        v3 = var7_6;
lbl40:
                        // 2 sources

                        if (var4_2 > 0L) {
                            if (v3 != false) break block19;
                        }
                        ** GOTO lbl51
lbl43:
                        // 2 sources

                        var6_3.writeShort(this.h.E());
                    }
                    catch (n9 v6) {
                        throw m44.a("j", (Object)v6, (long)-2655750471499440310L, (long)var4_2);
                    }
                }
                try {
                    if (var4_2 <= 0L) break block20;
                    v3 = var7_6;
lbl51:
                    // 2 sources

                    if (v3 != false) break block21;
lbl52:
                    // 2 sources

                    var6_3.writeShort(0);
                }
                catch (n9 v7) {
                    throw m44.a("j", (Object)v7, (long)-2655750471499440310L, (long)var4_2);
                }
            }
            var6_3.writeShort((int)m44.a("t", (Object)this, (long)-2539472883452781093L, (long)var4_2));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x30705BE07F6CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        byte[] byArray3 = cipher.doFinal("\u00e8d\u00ca\u00b5J\u0084\u0094R|\u00f5\u0001\u001a\u0082\u00b7\u00ba\u00c8\t\u00fb\u0001W\u00b4{\u00a1\u0012\u009e\u008a:N,\u00f7\u0094\u0010\u00d8\u0099\u0016\u0004\u001a(\u001d+".getBytes("ISO-8859-1"));
        b = bz.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = -173261465987690240L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                c = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
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
}

