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
    private static final long a = prr.a((long)-6790783244392525827L, (long)5951580102105090884L, MethodHandles.lookup().lookupClass()).a(132988671165919L);
    private static final String b;
    private static final long c;

    bz(k3 k32, to to2, long l, List list) {
        x8 x82;
        l = a ^ l;
        super((_4)k32);
        m44.a("u", (Object)((Object)this), (boolean)true, (long)-7242778781357462415L, (long)l);
        this.h = x82 = to2.t("a", list);
    }

    boolean F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("v", (Object)((Object)this), (long)-3157865173823331552L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    bz(_4 _42, h1 h12, l6q l6q2, int n, char c, short s) {
        block12: {
            js js2;
            long l;
            long l2;
            long l3;
            block13: {
                int n2;
                bz bz2;
                CallSite callSite;
                long l4;
                long l5;
                block11: {
                    long l6 = l3 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
                    l2 = l6 ^ 0x64970BD6A421L;
                    l = l6 ^ 0x16F5643F8CFEL;
                    l5 = l6 ^ 0x5B98A201196CL;
                    l4 = l6 ^ 0x3BCE08437C2BL;
                    super(_42);
                    CallSite callSite2 = m44.a("l", (long)749202965696110210L, (long)l3);
                    m44.a("p", (Object)((Object)this), (boolean)true, (long)1418944774428239036L, (long)l3);
                    callSite = callSite2;
                    int n3 = h12.readUnsignedShort();
                    try {
                        try {
                            bz2 = this;
                            n2 = h12.readUnsignedShort();
                            if (callSite != false) break block11;
                            m44.a("p", (Object)((Object)bz2), (int)n2, (long)774478763694984101L, (long)l3);
                            if (n3 == 0) break block12;
                        }
                        catch (n9 n92) {
                            throw m44.a("l", (Object)((Object)n92), (long)962252510408722740L, (long)l3);
                        }
                        bz2 = this;
                        n2 = n3;
                    }
                    catch (n9 n93) {
                        throw m44.a("l", (Object)((Object)n93), (long)962252510408722740L, (long)l3);
                    }
                }
                js2 = bz2.m(l5, n2);
                try {
                    block14: {
                        try {
                            try {
                                Object object = callSite;
                                if (c >= '\u0000') {
                                    if (object != false) break block13;
                                    object = js2 instanceof x8;
                                }
                                if (object == false) break block14;
                            }
                            catch (n9 n94) {
                                throw m44.a("l", (Object)((Object)n94), (long)962252510408722740L, (long)l3);
                            }
                            this.h = (x8)js2;
                            l6q2.t((Object)this.h, (Object)this, l4);
                            if (callSite == false) break block12;
                        }
                        catch (n9 n95) {
                            throw m44.a("l", (Object)((Object)n95), (long)962252510408722740L, (long)l3);
                        }
                    }
                    m44.a("p", (Object)((Object)this), (boolean)false, (long)1418944774428239036L, (long)l3);
                }
                catch (n9 n96) {
                    throw m44.a("l", (Object)((Object)n96), (long)962252510408722740L, (long)l3);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = js2.A(l2);
            m44.a("p", (Object)((Object)this), (String)(b + (String)((Object)m44.a("l", (Object)objectArray, (long)1545081215819541701L, (long)l3)) + "'"), (long)967953152293785590L, (long)l3);
        }
    }

    void z(gu gu2, long l) {
        long l2 = l ^ 0x66FDF08525FDL;
        try {
            if (this.h != null) {
                gu2.K((js)this.h, (Object)this, l2, (Object)this.H());
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)((Object)n92), (long)5388264360302644904L, (long)l);
        }
    }

    String i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)((Object)this), (long)5468152993468811642L, (long)l);
    }

    public void q(x8 x82, long l, x8 x83) {
        block9: {
            block10: {
                bz bz2;
                x8 x84;
                block8: {
                    CallSite callSite = m44.a("n", (long)-5231047857311529425L, (long)l);
                    try {
                        try {
                            try {
                                x84 = this.h;
                                if (l < 0L || callSite == false) break block8;
                                if (x84 == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)((Object)n92), (long)-6340845885325874066L, (long)l);
                            }
                            bz2 = this;
                            if (callSite == false) break block10;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)((Object)n93), (long)-6340845885325874066L, (long)l);
                        }
                        x84 = bz2.h;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)((Object)n94), (long)-6340845885325874066L, (long)l);
                    }
                }
                try {
                    if (x84 != x82) break block9;
                    bz2 = this;
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)((Object)n95), (long)-6340845885325874066L, (long)l);
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
                                    v0 = this.h;
                                    if (var7_6 == false) break block17;
                                    if (v0 != null) {
                                    }
                                    ** GOTO lbl52
                                }
                                catch (n9 v1) {
                                    throw m44.a("j", (Object)v1, (long)-2655750471499440310L, (long)var4_2);
                                }
                                v0 = (js)var3_4.get(this.h);
                            }
                            catch (n9 v2) {
                                throw m44.a("j", (Object)v2, (long)-2655750471499440310L, (long)var4_2);
                            }
                        }
                        var8_7 = v0;
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
        long l = a ^ 0x30705BE07F6CL;
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
        byte[] byArray3 = cipher.doFinal("\u00e8d\u00ca\u00b5J\u0084\u0094R|\u00f5\u0001\u001a\u0082\u00b7\u00ba\u00c8\t\u00fb\u0001W\u00b4{\u00a1\u0012\u009e\u008a:N,\u00f7\u0094\u0010\u00d8\u0099\u0016\u0004\u001a(\u001d+".getBytes("ISO-8859-1"));
        b = bz.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -173261465987690240L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
}
