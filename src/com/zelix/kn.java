/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._6;
import com.zelix._u;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.hf;
import com.zelix.js;
import com.zelix.ki;
import com.zelix.l6q;
import com.zelix.l6z;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sw;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kn
extends ki {
    private sw g;
    private String O;
    private static final long c = prr.a((long)-8037439490382309817L, (long)-7051281324094028480L, MethodHandles.lookup().lookupClass()).a(97051718689672L);
    private static final String d;

    public void f(Object[] objectArray) {
        block5: {
            kn kn2;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = l2 ^ 0x366379B23F1CL;
                CallSite callSite = m44.a("o", (long)1012921621379907398L, (long)l2);
                try {
                    try {
                        kn2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("q", (Object)((Object)kn2), (long)1684269418671496585L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)1362016362888435891L, (long)l2);
                    }
                    kn2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)1362016362888435891L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            m44.a("p", (Object)m44.a("q", (Object)((Object)kn2), (long)815121921919985819L, (long)l2), (Object)objectArray2, (long)1094558708151236684L, (long)l2);
        }
    }

    public void s(Object[] objectArray) {
        block5: {
            kn kn2;
            long l;
            Set set;
            Set set2;
            long l2;
            Set set3;
            Set set4;
            block4: {
                set4 = (Set)objectArray[0];
                set3 = (Set)objectArray[1];
                l2 = (Long)objectArray[2];
                set2 = (Set)objectArray[3];
                set = (Set)objectArray[4];
                l = l2 ^ 0x3069E97196CDL;
                CallSite callSite = m44.a("h", (long)2018094200126205257L, (long)l2);
                try {
                    try {
                        kn2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("v", (Object)((Object)kn2), (long)382965665269731206L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)65849240057350844L, (long)l2);
                    }
                    kn2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)65849240057350844L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[5];
            objectArray2[4] = l;
            objectArray2[3] = set;
            objectArray2[2] = set2;
            objectArray2[1] = set3;
            objectArray2[0] = set4;
            m44.a("w", (Object)m44.a("v", (Object)((Object)kn2), (long)1819680968949742228L, (long)l2), (Object)objectArray2, (long)305817916042404272L, (long)l2);
        }
    }

    public void z(Object[] objectArray) {
        block5: {
            kn kn2;
            long l;
            long l2;
            Set set;
            block4: {
                set = (Set)objectArray[0];
                l2 = (Long)objectArray[1];
                l = l2 ^ 0x1E0A187EA644L;
                CallSite callSite = m44.a("n", (long)-8977939699643452881L, (long)l2);
                try {
                    try {
                        kn2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("p", (Object)((Object)kn2), (long)-7334437805944123168L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-6949134375962634790L, (long)l2);
                    }
                    kn2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-6949134375962634790L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l;
            objectArray2[0] = set;
            m44.a("q", (Object)m44.a("p", (Object)((Object)kn2), (long)-8780180195675331086L, (long)l2), (Object)objectArray2, (long)-9182610005369216815L, (long)l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    kn(_4 _42, int n, long l, String string, h1 h12, l6q l6q2, PrintWriter printWriter) {
        block7: {
            long l2 = l = c ^ l;
            long l3 = l2 ^ 0xAE6F1B749A3L;
            long l4 = l2 ^ 0x3E3866A5A302L;
            long l5 = l2 ^ 0x169660C79A30L;
            long l6 = l2 ^ 0x1929AE62AC01L;
            long l7 = l2 ^ 0x37F90530A4L;
            super(_42, n, string, h12, l6, l6q2);
            byte[] byArray = new byte[this.W];
            CallSite callSite = m44.a("o", (long)-3747344364506924362L, (long)l);
            h12.read(byArray);
            Object[] objectArray = new Object[3];
            objectArray[2] = l4;
            objectArray[1] = false;
            objectArray[0] = byArray;
            CallSite callSite2 = m44.a("o", (Object)objectArray, (long)-3351303620400370251L, (long)l);
            try {
                Object[] objectArray2 = new Object[4];
                objectArray2[3] = l6q2;
                objectArray2[2] = callSite2;
                objectArray2[1] = l5;
                objectArray2[0] = this;
                m44.a("s", (Object)((Object)this), (sw)m44.a("o", (Object)objectArray2, (long)-3188832045314347519L, (long)l), (long)-3548913544365511317L, (long)l);
                if (callSite == false) break block7;
                try {
                    block8: {
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l7;
                        if (m44.a("p", (Object)m44.a("q", (Object)((Object)this), (long)-3548913544365511317L, (long)l), (Object)objectArray3, (long)-3216916039089732201L, (long)l) != false) break block7;
                        break block8;
                        catch (n9 n92) {
                            throw m44.a("o", (Object)((Object)n92), (long)-2948021206485967549L, (long)l);
                        }
                    }
                    m44.a("s", (Object)((Object)this), (boolean)false, (long)-3265137344992372615L, (long)l);
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l3;
                    m44.a("s", (Object)((Object)this), (String)(d + (String)((Object)m44.a("p", (Object)m44.a("q", (Object)((Object)this), (long)-3548913544365511317L, (long)l), (Object)objectArray4, (long)-3994458794404714793L, (long)l))), (long)-3367535993361094788L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)-2948021206485967549L, (long)l);
                }
            }
            finally {
                m44.a("p", (Object)callSite2, (long)-3648427861427175307L, (long)l);
            }
        }
    }

    public boolean l(Object[] objectArray) {
        hf hf2 = (hf)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l = (Long)objectArray[2];
        PrintWriter printWriter = (PrintWriter)objectArray[3];
        return false;
    }

    public void W(Object[] objectArray) {
        block5: {
            kn kn2;
            long l;
            HashMap hashMap;
            HashMap hashMap2;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                int n = (Integer)objectArray[1];
                int n2 = (Integer)objectArray[2];
                hashMap2 = (HashMap)objectArray[3];
                hashMap = (HashMap)objectArray[4];
                l = l2 ^ 0x1B8AC0D7B171L;
                CallSite callSite = m44.a("n", (long)8223466915102598904L, (long)l2);
                try {
                    try {
                        kn2 = this;
                        if (callSite != false) break block4;
                        if (m44.a("p", (Object)((Object)kn2), (long)8293039031803492800L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)8552243029444099322L, (long)l2);
                    }
                    kn2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)8552243029444099322L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = hashMap;
            objectArray2[1] = l;
            objectArray2[0] = hashMap2;
            m44.a("q", (Object)m44.a("p", (Object)((Object)kn2), (long)8000244528512748754L, (long)l2), (Object)objectArray2, (long)7580487795791932054L, (long)l2);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void c(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (DataOutputStream)var1_1[1];
                v0 = var2_2;
                var5_4 = v0 ^ 0L;
                var7_5 = v0 ^ 138122824747950L;
                v1 = m44.a("i", (long)1272493964096652623L, (long)var2_2);
                v2 = new Object[2];
                v2[1] = var4_3;
                v2[0] = var5_4;
                super.c(v2);
                var9_6 = v1;
                try {
                    try {
                        v3 = this;
                        if (var9_6 != false) break block8;
                        if (m44.a("w", (Object)v3, (long)1198408428474194551L, (long)var2_2) != false) {
                        }
                        ** GOTO lbl36
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)1520240488307892045L, (long)var2_2);
                    }
                    v3 = this;
                }
                catch (n9 v5) {
                    throw m44.a("i", (Object)v5, (long)1520240488307892045L, (long)var2_2);
                }
            }
            try {
                v6 = new Object[2];
                v6[1] = var7_5;
                v6[0] = var4_3;
                m44.a("v", (Object)m44.a("w", (Object)v3, (long)914728874700615525L, (long)var2_2), (Object)v6, (long)852485286001226700L, (long)var2_2);
                if (var2_2 < 0L || var9_6 == false) break block9;
lbl36:
                // 2 sources

                var4_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var2_2));
            }
            catch (n9 v7) {
                throw m44.a("i", (Object)v7, (long)1520240488307892045L, (long)var2_2);
            }
        }
    }

    public void J(Object[] objectArray) {
        block5: {
            kn kn2;
            long l;
            lqu lqu2;
            l6z l6z2;
            _6 _62;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                _u _u2 = (_u)objectArray[1];
                _62 = (_6)objectArray[2];
                l6z2 = (l6z)objectArray[3];
                lqu2 = (lqu)objectArray[4];
                l = l2 ^ 0x6C1F99F7B66L;
                CallSite callSite = m44.a("o", (long)6212413212200665809L, (long)l2);
                try {
                    try {
                        kn2 = this;
                        if (callSite != false) break block4;
                        if (m44.a("q", (Object)((Object)kn2), (long)6286946463132720617L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)5946678715875809491L, (long)l2);
                    }
                    kn2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)5946678715875809491L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[4];
            objectArray2[3] = lqu2;
            objectArray2[2] = l6z2;
            objectArray2[1] = l;
            objectArray2[0] = _62;
            m44.a("p", (Object)m44.a("q", (Object)((Object)kn2), (long)5417803356946557179L, (long)l2), (Object)objectArray2, (long)5531049650544481549L, (long)l2);
        }
    }

    public void z(gu gu2, long l) {
        block5: {
            kn kn2;
            long l2;
            block4: {
                long l3 = l;
                l2 = l3 ^ 0L;
                long l4 = l3 ^ 0x66FDF08525FDL;
                CallSite callSite = m44.a("h", (long)5618762033536375070L, (long)l);
                gu2.K((js)this.b, (Object)this, l4, (Object)this.H());
                CallSite callSite2 = callSite;
                try {
                    try {
                        kn2 = this;
                        if (callSite2 != false) break block4;
                        if (m44.a("v", (Object)((Object)kn2), (long)5544088189886891558L, (long)l) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)5281014147514778396L, (long)l);
                    }
                    kn2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)5281014147514778396L, (long)l);
                }
            }
            m44.a("v", (Object)((Object)kn2), (long)5827888646966932276L, (long)l).z(gu2, l2);
        }
    }

    public void K(Object[] objectArray) {
        block5: {
            kn kn2;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = l2 ^ 0x70616B9E34FL;
                CallSite callSite = m44.a("i", (long)3880088275935781183L, (long)l2);
                try {
                    try {
                        kn2 = this;
                        if (callSite != false) break block4;
                        if (m44.a("w", (Object)((Object)kn2), (long)3805967349933800967L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)3560345736308734781L, (long)l2);
                    }
                    kn2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)3560345736308734781L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            m44.a("v", (Object)m44.a("w", (Object)((Object)kn2), (long)2936870524947696405L, (long)l2), (Object)objectArray2, (long)3340423965922252497L, (long)l2);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void N(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (DataOutputStream)var1_1[0];
                var6_3 = (Map)var1_1[1];
                var4_4 = (Long)var1_1[2];
                var3_5 = (lqu)var1_1[3];
                v0 = var4_4;
                var7_6 = v0 ^ 0L;
                var9_7 = v0 ^ 93420344099345L;
                v1 = m44.a("k", (long)1680553024964027930L, (long)var4_4);
                v2 = new Object[4];
                v2[3] = var3_5;
                v2[2] = var7_6;
                v2[1] = var6_3;
                v2[0] = var2_2;
                super.N(v2);
                var11_8 = v1;
                try {
                    try {
                        v3 = this;
                        if (var11_8 == false) break block8;
                        if (m44.a("u", (Object)v3, (long)1009829788873835733L, (long)var4_4) != false) {
                        }
                        ** GOTO lbl42
                    }
                    catch (n9 v4) {
                        throw m44.a("k", (Object)v4, (long)845201602433581551L, (long)var4_4);
                    }
                    v3 = this;
                }
                catch (n9 v5) {
                    throw m44.a("k", (Object)v5, (long)845201602433581551L, (long)var4_4);
                }
            }
            try {
                v6 = new Object[4];
                v6[3] = var3_5;
                v6[2] = var9_7;
                v6[1] = var6_3;
                v6[0] = var2_2;
                m44.a("t", (Object)m44.a("u", (Object)v3, (long)1302663833478083015L, (long)var4_4), (Object)v6, (long)692871538480422095L, (long)var4_4);
                if (var4_4 <= 0L || var11_8 != false) break block9;
lbl42:
                // 2 sources

                var2_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var4_4));
            }
            catch (n9 v7) {
                throw m44.a("k", (Object)v7, (long)845201602433581551L, (long)var4_4);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = c ^ 0x42BD0122CBE6L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ce\u00e2][/Q\u00ebu\u0089\u001f\u00c4'\u009d\u00d1\u00f2\u0081\u00dd\u0016\u00c6\u00fa\u00eb\u000f\u0017\u0088\u00ee*c\u0006S\u00ec\u00b9S".getBytes("ISO-8859-1"));
                d = kn.c(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
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
}
