/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._6;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.l6q;
import com.zelix.l6z;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s8;
import com.zelix.sw;
import com.zelix.x8;
import java.io.DataOutputStream;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class s_
extends sw {
    private s8 K;
    private static final long a = prr.a((long)-5271413347158574466L, (long)-8710795557049130085L, MethodHandles.lookup().lookupClass()).a(95253702479689L);
    private static final String c;

    public void q(x8 x82, long l, x8 x83) {
    }

    String G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x264141C63215L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)m44.a("s", (Object)((Object)this), (long)-874682680606815256L, (long)l), (Object)objectArray2, (long)-866471555317447067L, (long)l);
    }

    public void z(gu gu2, long l) {
        long l2 = l ^ 0L;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6255997287751692005L, (long)l), (Object)gu2, (long)l2, (long)5759007463919830180L, (long)l);
    }

    String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
    }

    boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public void I(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        Set set2 = (Set)objectArray[1];
        Set set3 = (Set)objectArray[2];
        Set set4 = (Set)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = l ^ 0x7C9860CF1B54L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = set4;
        objectArray2[3] = set3;
        objectArray2[2] = l2;
        objectArray2[1] = set2;
        objectArray2[0] = set;
        m44.a("r", (Object)m44.a("s", (Object)((Object)this), (long)-8521677042428022392L, (long)l), (Object)objectArray2, (long)-8121268650560481242L, (long)l);
    }

    public void a(Object[] objectArray) {
        block5: {
            s_ s_2;
            long l;
            long l2;
            Set set;
            block4: {
                set = (Set)objectArray[0];
                l2 = (Long)objectArray[1];
                long l3 = l2;
                l = l3 ^ 0L;
                long l4 = l3 ^ 0x2F737424DE79L;
                CallSite callSite = m44.a("j", (long)2676243613375091819L, (long)l2);
                try {
                    try {
                        s_2 = this;
                        if (callSite == false) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l4;
                        if (m44.a("u", (Object)((Object)s_2), (Object)objectArray2, (long)4433258012436409162L, (long)l2) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)4214461665983765311L, (long)l2);
                    }
                    s_2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)4214461665983765311L, (long)l2);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l;
            objectArray3[0] = set;
            m44.a("u", (Object)m44.a("t", (Object)((Object)s_2), (long)2761695102733999719L, (long)l2), (Object)objectArray3, (long)4103848209812493222L, (long)l2);
        }
    }

    s_(_4 _42, long l, int n, h1 h12, l6q l6q2) {
        block5: {
            s_ s_2;
            long l2;
            long l3;
            block4: {
                long l4 = l = a ^ l;
                long l5 = l4 ^ 0x56FDBB1B84A1L;
                l3 = l4 ^ 0x6710DB54C16EL;
                long l6 = l4 ^ 0x23C06963149DL;
                int n2 = (int)(l6 >>> 48);
                int n3 = (int)(l6 << 16 >>> 48);
                int n4 = (int)(l6 << 32 >>> 32);
                long l7 = l4 ^ 0x7B7495A938ACL;
                l2 = l4 ^ 0x56BB3C775D7FL;
                long l8 = l4 ^ 0x1A25399AC002L;
                CallSite callSite = m44.a("o", (long)-2616933089964421303L, (long)l);
                super((char)n2, _42, (char)n3, n, n4);
                CallSite callSite2 = callSite;
                try {
                    try {
                        Object[] objectArray = new Object[4];
                        objectArray[3] = l8;
                        objectArray[2] = l6q2;
                        objectArray[1] = h12;
                        objectArray[0] = this;
                        m44.a("s", (Object)((Object)this), (s8)m44.a("o", (Object)objectArray, (long)-4428431804279247019L, (long)l), (long)-4573731874644903758L, (long)l);
                        s_2 = this;
                        if (callSite2 != false) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l7;
                        if (m44.a("p", (Object)m44.a("q", (Object)((Object)s_2), (long)-4573731874644903758L, (long)l), (Object)objectArray2, (long)-4209582893882199661L, (long)l) != false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-2546342994072863254L, (long)l);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = false;
                    objectArray[0] = l5;
                    m44.a("p", (Object)((Object)this), (Object)objectArray, (long)-2342666435246309468L, (long)l);
                    s_2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)-2546342994072863254L, (long)l);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = c + (String)((Object)m44.a("p", (Object)m44.a("q", (Object)((Object)this), (long)-4573731874644903758L, (long)l), (Object)objectArray, (long)-4442338302230203400L, (long)l));
            objectArray3[0] = l3;
            m44.a("p", (Object)((Object)s_2), (Object)objectArray3, (long)-4259695429468107427L, (long)l);
            return;
        }
    }

    public void B(Object[] objectArray) {
        HashMap hashMap = (HashMap)objectArray[0];
        long l = (Long)objectArray[1];
        HashMap hashMap2 = (HashMap)objectArray[2];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = hashMap2;
        objectArray2[1] = l2;
        objectArray2[0] = hashMap;
        m44.a("p", (Object)m44.a("q", (Object)((Object)this), (long)-2862430965784534926L, (long)l), (Object)objectArray2, (long)-2639064029076568357L, (long)l);
    }

    public void z(Object[] objectArray) {
        _6 _62 = (_6)objectArray[0];
        long l = (Long)objectArray[1];
        l6z l6z2 = (l6z)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
        long l2 = l ^ 0x2904B096EE81L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = lqu2;
        objectArray2[1] = l6z2;
        objectArray2[0] = _62;
        m44.a("v", (Object)m44.a("w", (Object)((Object)this), (long)3925155394022362700L, (long)l), (Object)objectArray2, (long)3437679733342373926L, (long)l);
    }

    public void j(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        Map map = (Map)objectArray[1];
        long l = (Long)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
        long l2 = l;
        long l3 = l2 ^ 0L;
        long l4 = l2 ^ 0x746C1D80899EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        dataOutputStream.writeByte((int)m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)-3124275330760133103L, (long)l));
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = lqu2;
        objectArray3[2] = l3;
        objectArray3[1] = map;
        objectArray3[0] = dataOutputStream;
        m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)-3011856372634964473L, (long)l), (Object)objectArray3, (long)-2891088759505632508L, (long)l);
    }

    public void G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("q", (Object)m44.a("p", (Object)((Object)this), (long)-3620948443206601333L, (long)l), (Object)objectArray2, (long)-3333237301536978451L, (long)l);
    }

    public void p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)3630682816773048918L, (long)l), (Object)objectArray2, (long)3435558250481840141L, (long)l);
    }

    public int c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        int n = 1;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return n += m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)3420940345336878925L, (long)l), (Object)objectArray2, (long)3463648436597656251L, (long)l);
    }

    public void n(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0L;
        long l4 = l2 ^ 0x65CE406CDE83L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        dataOutputStream.writeByte((int)m44.a("p", (Object)((Object)this), (Object)objectArray2, (long)-8955045563159879412L, (long)l));
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = dataOutputStream;
        m44.a("p", (Object)m44.a("q", (Object)((Object)this), (long)-9138176153034098406L, (long)l), (Object)objectArray3, (long)-6986706802847424452L, (long)l);
    }

    boolean i(Object[] objectArray) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x1E74BC988C58L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00f3m*\u0080\u0011\u00edh\u00e9\u00db0\u00b4H\u00d9\u0007\u00cc\u0010\u009a_\u0098x\u0094\u00ba\u00c3@\u00e2\t\u0089\u0007\u00a8\u00b9a\u0010".getBytes("ISO-8859-1"));
                c = s_.a(byArray3).intern();
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
