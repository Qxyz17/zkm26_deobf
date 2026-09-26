/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._0;
import com.zelix.f3;
import com.zelix.m;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.us;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Enumeration;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tt {
    private final ol V;
    private static final long a = prr.a((long)7779245746896782276L, (long)8641414161902996472L, MethodHandles.lookup().lookupClass()).a(220571598649548L);
    private static final String b;

    /*
     * Unable to fully structure code
     */
    public void M(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = tt.a ^ var2_2;
        var4_3 = v0 ^ 116080365502223L;
        var6_4 = v0 ^ 18771521823437L;
        var9_5 = m44.a("w", (Object)new f3((Enumeration)m44.a("w", (Object)m44.a("v", (Object)this, (long)-1236938792075538641L, (long)var2_2), (Object)new Object[0], (long)-972094357781090036L, (long)var2_2), var4_3), (long)-1164713546641560983L, (long)var2_2);
        var8_6 = m44.a("h", (long)-1560968385674742688L, (long)var2_2);
        while (var9_5.hasNext()) {
            v1 = new Object[2];
            v1[1] = var9_5.next();
            v1[0] = var6_4;
            m44.a("w", (Object)this, (Object)v1, (long)-1123262087179790635L, (long)var2_2);
lbl16:
            // 2 sources

            ** while (var8_6 != null)
lbl17:
            // 1 sources

        }
lbl18:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl16
    }

    public void V(Object[] objectArray) {
        block4: {
            Map map;
            CallSite callSite;
            Map map2;
            long l;
            long l2;
            Object object;
            long l3;
            block3: {
                l3 = (Long)objectArray[0];
                object = objectArray[1];
                long l4 = l3 = a ^ l3;
                l2 = l4 ^ 0x58E572FFB70CL;
                l = l4 ^ 0x6F98AB173D5DL;
                map2 = m44.a("u", (Object)this, (long)3811922879138698524L, (long)l3).T(object);
                callSite = m44.a("k", (long)3487328277195730515L, (long)l3);
                try {
                    map = map2;
                    if (callSite != null) break block3;
                    if (map == null) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)((Object)n92), (long)3031714450269305384L, (long)l3);
                }
                map = map2;
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l2;
            objectArray2[0] = map.keySet();
            CallSite callSite2 = m44.a("t", (Object)m44.a("k", (Object)objectArray2, (long)3084378014817860319L, (long)l3), (long)3419462865640768781L, (long)l3);
            while (callSite2.hasNext()) {
                m m2 = (m)callSite2.next();
                us us2 = (us)map2.get(m2);
                Object[] objectArray3 = new Object[4];
                objectArray3[3] = object;
                objectArray3[2] = us2;
                objectArray3[1] = l;
                objectArray3[0] = m2;
                CallSite callSite3 = m44.a("t", (Object)this, (Object)objectArray3, (long)3197906568566790034L, (long)l3);
                if (callSite == null) continue;
            }
        }
    }

    public us Z(Object[] objectArray) {
        m m2 = (m)objectArray[0];
        long l = (Long)objectArray[1];
        us us2 = (us)objectArray[2];
        Object object = objectArray[3];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x26B79B0DF363L;
        long l4 = l2 ^ 0x35D2B3675094L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = us2;
        m44.a("w", (Object)m2, (Object)objectArray2, (long)3498317320226108531L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = m2;
        objectArray3[1] = object;
        objectArray3[0] = l4;
        return (us)m44.a("w", (Object)m44.a("v", (Object)this, (long)3550521176681550015L, (long)l), (Object)objectArray3, (long)3559058826598019376L, (long)l);
    }

    public tt(char c, boolean bl, int n, short s) {
        long l = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0x610096E8BFC5L;
        this.V = new ol(l2, bl);
    }

    public void p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        _0 _02 = (_0)objectArray[1];
        us us2 = (us)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x17A30E07696BL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = b;
        objectArray2[1] = us2;
        objectArray2[0] = _02;
        m44.a("p", (Object)this, (Object)objectArray2, (long)-5018822103634271210L, (long)l);
    }

    public void r(Object[] objectArray) {
        m m2 = (m)objectArray[0];
        us us2 = (us)objectArray[1];
        Object object = objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x5FE23CD8CC85L;
        int n = (int)(l3 >>> 48);
        int n2 = (int)(l3 << 16 >>> 48);
        int n3 = (int)(l3 << 32 >>> 32);
        long l4 = l2 ^ 0x1EB5F41AB288L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = us2;
        m44.a("u", (Object)m2, (Object)objectArray2, (long)-1064738333446124466L, (long)l);
        m44.a("t", (Object)this, (long)-1182227491142906259L, (long)l).h((short)n, (char)n2, object, n3, m2, us2);
    }

    public tt(short s, int n, char c) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ a;
        long l2 = l ^ 0x16240FCF062FL;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 32);
        int n4 = (int)(l2 << 48 >>> 48);
        this((char)n2, false, n3, (short)n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x4084A3D8F855L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ed\u00ee\t\u00b1W\u009f\u001d\u00d48\u00e95)P0\u008d\u00a0".getBytes("ISO-8859-1"));
                b = tt.a(byArray3).intern();
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
