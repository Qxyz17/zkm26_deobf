/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.hz;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.m7;
import com.zelix.n9;
import com.zelix.ow;
import com.zelix.oz;
import com.zelix.prr;
import com.zelix.v7;
import java.io.DataOutputStream;
import java.io.PrintWriter;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iq
extends oz {
    private int G;
    private int a;
    private int n;
    private static final long b;
    private static final String c;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map g;

    public boolean L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public int T(char c, int n, char c2) {
        return 0;
    }

    public boolean B(long l) {
        boolean bl;
        block2: {
            block3: {
                l = b ^ l;
                CallSite callSite = m44.a("m", (long)7488336564560047159L, (long)l);
                try {
                    bl = cf.p((int)this.G) & iq.b("k", (int)3394, (long)(0x447A4AC6EB1E7089L ^ l));
                    if (callSite == false) break block2;
                    if (!bl) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)((Object)n92), (long)8886459015256298694L, (long)l);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public void P(long l, int n) {
        this.n = n;
    }

    public void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        PrintWriter printWriter = (PrintWriter)objectArray[1];
        StringBuilder stringBuilder = (StringBuilder)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x46DA214E0271L;
        long l4 = l2 ^ 0x1958DC7C99DL;
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l3;
            if (m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-656251667566589114L, (long)l) != false) {
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l4;
                printWriter.println(stringBuilder.toString() + (String)((Object)m44.a("w", (Object)((Object)this), (Object)objectArray3, (long)-839484870266077503L, (long)l)));
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)((Object)n92), (long)-914690672628736805L, (long)l);
        }
    }

    private iq(int n, short s, char c, boolean bl, boolean bl2, int n2, int n3) {
        boolean bl3;
        long l;
        block7: {
            block8: {
                l = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n3 << 32 >>> 32) ^ b;
                super((int)iq.b("k", (int)3447, (long)(0x79FB581BAE3FD6L ^ l)));
                this.n = -1;
                this.a = -1;
                CallSite callSite = m44.a("n", (long)2918541093105099612L, (long)l);
                this.G = 0;
                this.Z(n2);
                this.n = n;
                CallSite callSite2 = callSite;
                try {
                    try {
                        bl3 = bl;
                        if (callSite2 == false) break block7;
                        if (!bl3) break block8;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)3762859345271331757L, (long)l);
                    }
                    this.Z((int)iq.b("k", (int)21991, (long)(0x234CCCEE018DE742L ^ l)));
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)3762859345271331757L, (long)l);
                }
            }
            bl3 = bl2;
        }
        try {
            if (bl3) {
                this.Z((int)iq.b("k", (int)14812, (long)(0x4F9492C1223D8B78L ^ l)));
            }
        }
        catch (n9 n94) {
            throw m44.a("n", (Object)((Object)n94), (long)3762859345271331757L, (long)l);
        }
    }

    public int B() {
        return this.n;
    }

    public iq(long l) {
        long l2 = (l = b ^ l) ^ 0x6B0D03ABE3E7L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 48);
        int n3 = (int)(l2 << 32 >>> 32);
        this(0, (short)n, (char)n2, true, true, 2, n3);
    }

    public final boolean T(long l) {
        return false;
    }

    public boolean x(Object[] objectArray) {
        boolean bl;
        block2: {
            block3: {
                long l = (Long)objectArray[0];
                l = b ^ l;
                CallSite callSite = m44.a("h", (long)4329728556463862821L, (long)l);
                try {
                    bl = cf.p((int)this.G);
                    if (callSite != false) break block2;
                    if (bl) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)4575176573654470891L, (long)l);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public int c() {
        return this.a;
    }

    public boolean G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x15917764FF1DL;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 48);
        int n3 = (int)(l2 << 48 >>> 48);
        return this.a((int)iq.b("k", (int)4937, (long)(0x43F6244A7466DDB9L ^ l)), n, (char)n2, (char)n3);
    }

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public final boolean e(long l, int n) {
        return true;
    }

    public String l(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ((Object)((Object)this)).toString();
    }

    public boolean E(Object[] objectArray) {
        boolean bl;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                l = b ^ l;
                CallSite callSite = m44.a("j", (long)3770845922319400840L, (long)l);
                try {
                    try {
                        bl = cf.p((int)this.G);
                        if (callSite == false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)2948834563131115385L, (long)l);
                    }
                    bl = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)2948834563131115385L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public iq(int n, int n2, long l) {
        long l2 = (l = b ^ l) ^ 0x42EB15520109L;
        this(l2, n, false, n2);
    }

    public String M(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        long l = (long)n << 32 | (long)n2 << 56 >>> 32 | (long)n3 << 40 >>> 40;
        long l2 = l ^ 0x93C88A18E66L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("t", (Object)((Object)this), (Object)objectArray2, (long)-5502690262610085574L, (long)l);
    }

    public final boolean Y(long l, int n, int n2) {
        return false;
    }

    public boolean F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x3E086053B9B6L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 48);
        int n3 = (int)(l2 << 48 >>> 48);
        return this.a((int)iq.b("k", (int)12395, (long)(0x70CFB681E5163834L ^ l)), n, (char)n2, (char)n3);
    }

    public String x(Object[] objectArray) {
        StringBuilder stringBuilder;
        block4: {
            StringBuilder stringBuilder2;
            block5: {
                long l = (Long)objectArray[0];
                long l2 = (l = b ^ l) ^ 0x3BC832203416L;
                stringBuilder2 = new StringBuilder((int)iq.b("k", (int)4663, (long)(0x150FE50FFCEF172EL ^ l)));
                CallSite callSite = m44.a("l", (long)-6973003595704675098L, (long)l);
                try {
                    try {
                        stringBuilder2.append(c);
                        stringBuilder = stringBuilder2.append(this.n);
                        if (callSite == false) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        if (m44.a("s", (Object)((Object)this), (Object)objectArray2, (long)-7444179087217005611L, (long)l) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)-8970595245792121833L, (long)l);
                    }
                    stringBuilder2.append((char)iq.b("k", (int)16499, (long)(0x66814C02FBBD456EL ^ l)));
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)-8970595245792121833L, (long)l);
                }
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    public void G(m7 m72) {
        this.G |= m72.q();
    }

    public boolean a(int n, int n2, char c, char c2) {
        boolean bl;
        block2: {
            block3: {
                long l = ((long)n2 << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ b;
                CallSite callSite = m44.a("l", (long)957592243744179577L, (long)l);
                try {
                    bl = cf.p((int)this.G) & n;
                    if (callSite != false) break block2;
                    if (!bl) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)((Object)n92), (long)1018392849507623351L, (long)l);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public iq(boolean bl, int n, long l) {
        long l2 = (l = b ^ l) ^ 0xD24797051EL;
        this(l2, -1, bl, n);
    }

    public boolean o() {
        return true;
    }

    public iq(int n, long l) {
        long l2 = (l = b ^ l) ^ 0x4798BC2FFD45L;
        this(l2, -1, false, n);
    }

    /*
     * Unable to fully structure code
     */
    public void j(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (Boolean)var1_1[0];
                var3_3 = (Long)var1_1[1];
                var5_4 = (var3_3 = iq.b ^ var3_3) ^ 89572782489224L;
                var7_5 = m44.a("h", (long)4376976311370167437L, (long)var3_3);
                try {
                    try {
                        if (var7_5 != false) break block8;
                        if (var2_2) {
                        }
                        ** GOTO lbl22
                    }
                    catch (n9 v0) {
                        throw m44.a("h", (Object)v0, (long)4599907186737221699L, (long)var3_3);
                    }
                    this.Z((int)iq.b("k", (int)4937, (long)(4897188592785467905L ^ var3_3)));
                }
                catch (n9 v1) {
                    throw m44.a("h", (Object)v1, (long)4599907186737221699L, (long)var3_3);
                }
            }
            try {
                if (var3_3 < 0L || var7_5 == false) break block9;
lbl22:
                // 2 sources

                v2 = new Object[2];
                v2[1] = m44.a("l", (long)4233387218212172009L, (long)var3_3);
                v2[0] = var5_4;
                m44.a("w", (Object)this, (Object)v2, (long)2318370245675407160L, (long)var3_3);
            }
            catch (n9 v3) {
                throw m44.a("h", (Object)v3, (long)4599907186737221699L, (long)var3_3);
            }
        }
    }

    public void Z(int n) {
        this.G |= n;
    }

    public void H(int n) {
        this.a = n;
    }

    public void A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        ow ow2 = (ow)objectArray[1];
        long l2 = (l = b ^ l) ^ 0x5A1231CC4F4AL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        this.G &= m44.a("v", (Object)ow2, (Object)objectArray2, (long)2566457715022909835L, (long)l);
    }

    public void G(short s, int n, DataOutputStream dataOutputStream, int n2) {
    }

    public boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public int V(Object[] objectArray) {
        return cf.p((int)this.G);
    }

    public hz n(hz hz2, boolean bl, char c, int n, boolean bl2, loj loj2, char c2, String string) {
        long l;
        long l2 = l = (long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48;
        long l3 = l2 ^ 0x5A73015BC1DL;
        long l4 = l2 ^ 0x67D45B4239BAL;
        return new hz(hz2.X(), hz2.T(), l4, hz2.j(), hz2.k(l3));
    }

    public final boolean v(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        v7 v72 = (v7)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        return false;
    }

    public iq(long l, int n, boolean bl, int n2) {
        long l2 = (l = b ^ l) ^ 0x3626169F89A8L;
        int n3 = (int)(l2 >>> 48);
        int n4 = (int)(l2 << 16 >>> 48);
        int n5 = (int)(l2 << 32 >>> 32);
        this(n, (short)n3, (char)n4, bl, false, n2, n5);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    iq.b = prr.a((long)6638775041074452077L, (long)-8980965042124155292L, MethodHandles.lookup().lookupClass()).a(109008386277393L);
                    var11 = iq.b ^ 69614710940482L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    break block12;
lbl13:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var15_3 = var13_1.doFinal("h\u00edP\u00b7*\u00d8~1".getBytes("ISO-8859-1"));
                ** while (true)
                iq.c = iq.b(var15_3).intern();
                iq.g = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var11 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v5 = v5;
                    v5[var1_5] = (byte)(var11 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_6 = new long[8];
                var3_7 = 0;
                var4_8 = "\u00c4U\u00ed\u0092\u00d3dE\u00ceC\u00e3\u00f1;[\u00d8\u0096r(i\u00ba\u00e4\u009e|i\u0018\u00f3\u00042\u00d1\u00d7pg\u00db\u00f2\u00df\u00d2b\u00b9d\u00f6\u0018H\u0012\u00eb\u00ef\u0089\u0090\u00f0N";
                var5_9 = "\u00c4U\u00ed\u0092\u00d3dE\u00ceC\u00e3\u00f1;[\u00d8\u0096r(i\u00ba\u00e4\u009e|i\u0018\u00f3\u00042\u00d1\u00d7pg\u00db\u00f2\u00df\u00d2b\u00b9d\u00f6\u0018H\u0012\u00eb\u00ef\u0089\u0090\u00f0N".length();
                var2_10 = 0;
                while (true) {
                    var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                    v6 = var6_6;
                    v7 = var3_7++;
                    v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                    v9 = -1;
                    break block10;
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    var4_8 = "\u0002\u00d8h\u00b5\u00de\u00a7\u00fb\u00b3\u00d7\u00b9<%\u00e6s7\u001c";
                    var5_9 = "\u0002\u00d8h\u00b5\u00de\u00a7\u00fb\u00b3\u00d7\u00b9<%\u00e6s7\u001c".length();
                    var2_10 = 0;
                    while (true) {
                        var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                        v6 = var6_6;
                        v7 = var3_7++;
                        v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                        v9 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl57:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    break block11;
                    break;
                }
            }
            var8_12 = v8;
            var10_13 = var0_4.doFinal(new byte[]{(byte)(var8_12 >>> 56), (byte)(var8_12 >>> 48), (byte)(var8_12 >>> 40), (byte)(var8_12 >>> 32), (byte)(var8_12 >>> 24), (byte)(var8_12 >>> 16), (byte)(var8_12 >>> 8), (byte)var8_12});
            v10 = ((long)var10_13[0] & 255L) << 56 | ((long)var10_13[1] & 255L) << 48 | ((long)var10_13[2] & 255L) << 40 | ((long)var10_13[3] & 255L) << 32 | ((long)var10_13[4] & 255L) << 24 | ((long)var10_13[5] & 255L) << 16 | ((long)var10_13[6] & 255L) << 8 | (long)var10_13[7] & 255L;
            switch (v9) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl70:
                // 1 sources

                ** continue;
            }
        }
        iq.d = var6_6;
        iq.e = new Integer[8];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x134B;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/iq", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iq.e[n2] = n3;
        }
        return e[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = iq.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/iq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(iq.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
