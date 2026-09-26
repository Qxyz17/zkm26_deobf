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

    @Override
    public boolean L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public int T(char c10, int n10, char c11) {
        return 0;
    }

    public boolean B(long l10) {
        boolean bl2;
        block2: {
            block3: {
                l10 = b ^ l10;
                CallSite callSite = m44.a("m", (long)7488336564560047159L, (long)l10);
                try {
                    bl2 = cf.p(this.G) & iq.b("k", (int)3394, (long)(0x447A4AC6EB1E7089L ^ l10));
                    if (callSite == false) break block2;
                    if (!bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)n92, (long)8886459015256298694L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void P(long l10, int n10) {
        this.n = n10;
    }

    @Override
    public void h(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        PrintWriter printWriter = (PrintWriter)objectArray[1];
        StringBuilder stringBuilder = (StringBuilder)objectArray[2];
        long l11 = l10;
        long l12 = l11 ^ 0x46DA214E0271L;
        long l13 = l11 ^ 0x1958DC7C99DL;
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l12;
            if (m44.a("w", (Object)this, (Object)objectArray2, (long)-656251667566589114L, (long)l10) != false) {
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l13;
                printWriter.println(stringBuilder.toString() + (String)((Object)m44.a("w", (Object)this, (Object)objectArray3, (long)-839484870266077503L, (long)l10)));
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)n92, (long)-914690672628736805L, (long)l10);
        }
    }

    private iq(int n10, short s10, char c10, boolean bl2, boolean bl3, int n11, int n12) {
        boolean bl4;
        long l10;
        block7: {
            block8: {
                l10 = ((long)s10 << 48 | (long)c10 << 48 >>> 16 | (long)n12 << 32 >>> 32) ^ b;
                super((int)iq.b("k", (int)3447, (long)(0x79FB581BAE3FD6L ^ l10)));
                this.n = -1;
                this.a = -1;
                CallSite callSite = m44.a("n", (long)2918541093105099612L, (long)l10);
                this.G = 0;
                this.Z(n11);
                this.n = n10;
                CallSite callSite2 = callSite;
                try {
                    try {
                        bl4 = bl2;
                        if (callSite2 == false) break block7;
                        if (!bl4) break block8;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)3762859345271331757L, (long)l10);
                    }
                    this.Z((int)iq.b("k", (int)21991, (long)(0x234CCCEE018DE742L ^ l10)));
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)3762859345271331757L, (long)l10);
                }
            }
            bl4 = bl3;
        }
        try {
            if (bl4) {
                this.Z((int)iq.b("k", (int)14812, (long)(0x4F9492C1223D8B78L ^ l10)));
            }
        }
        catch (n9 n94) {
            throw m44.a("n", (Object)n94, (long)3762859345271331757L, (long)l10);
        }
    }

    public int B() {
        return this.n;
    }

    public iq(long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x6B0D03ABE3E7L;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 48);
        int n12 = (int)(l11 << 32 >>> 32);
        this(0, (short)n10, (char)n11, true, true, 2, n12);
    }

    @Override
    public final boolean T(long l10) {
        return false;
    }

    public boolean x(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                l10 = b ^ l10;
                CallSite callSite = m44.a("h", (long)4329728556463862821L, (long)l10);
                try {
                    bl2 = cf.p(this.G);
                    if (callSite != false) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)4575176573654470891L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public int c() {
        return this.a;
    }

    public boolean G(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = b ^ l10) ^ 0x15917764FF1DL;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 48);
        int n12 = (int)(l11 << 48 >>> 48);
        return this.a((int)iq.b("k", (int)4937, (long)(0x43F6244A7466DDB9L ^ l10)), n10, (char)n11, (char)n12);
    }

    @Override
    public boolean S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public final boolean e(long l10, int n10) {
        return true;
    }

    @Override
    public String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.toString();
    }

    public boolean E(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = b ^ l10;
                CallSite callSite = m44.a("j", (long)3770845922319400840L, (long)l10);
                try {
                    try {
                        bl2 = cf.p(this.G);
                        if (callSite == false) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)2948834563131115385L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)2948834563131115385L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public iq(int n10, int n11, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x42EB15520109L;
        this(l11, n10, false, n11);
    }

    @Override
    public String M(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        int n12 = (Integer)objectArray[2];
        long l10 = (long)n10 << 32 | (long)n11 << 56 >>> 32 | (long)n12 << 40 >>> 40;
        long l11 = l10 ^ 0x93C88A18E66L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("t", (Object)this, (Object)objectArray2, (long)-5502690262610085574L, (long)l10);
    }

    @Override
    public final boolean Y(long l10, int n10, int n11) {
        return false;
    }

    public boolean F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = b ^ l10) ^ 0x3E086053B9B6L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 48);
        int n12 = (int)(l11 << 48 >>> 48);
        return this.a((int)iq.b("k", (int)12395, (long)(0x70CFB681E5163834L ^ l10)), n10, (char)n11, (char)n12);
    }

    public String x(Object[] objectArray) {
        StringBuilder stringBuilder;
        block4: {
            StringBuilder stringBuilder2;
            block5: {
                long l10 = (Long)objectArray[0];
                long l11 = (l10 = b ^ l10) ^ 0x3BC832203416L;
                stringBuilder2 = new StringBuilder((int)iq.b("k", (int)4663, (long)(0x150FE50FFCEF172EL ^ l10)));
                CallSite callSite = m44.a("l", (long)-6973003595704675098L, (long)l10);
                try {
                    try {
                        stringBuilder2.append(c);
                        stringBuilder = stringBuilder2.append(this.n);
                        if (callSite == false) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        if (m44.a("s", (Object)this, (Object)objectArray2, (long)-7444179087217005611L, (long)l10) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)-8970595245792121833L, (long)l10);
                    }
                    stringBuilder2.append((char)iq.b("k", (int)16499, (long)(0x66814C02FBBD456EL ^ l10)));
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)-8970595245792121833L, (long)l10);
                }
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    public void G(m7 m72) {
        this.G |= m72.q();
    }

    public boolean a(int n10, int n11, char c10, char c11) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = ((long)n11 << 32 | (long)c10 << 48 >>> 32 | (long)c11 << 48 >>> 48) ^ b;
                CallSite callSite = m44.a("l", (long)957592243744179577L, (long)l10);
                try {
                    bl2 = cf.p(this.G) & n10;
                    if (callSite != false) break block2;
                    if (!bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)n92, (long)1018392849507623351L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    public iq(boolean bl2, int n10, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0xD24797051EL;
        this(l11, -1, bl2, n10);
    }

    @Override
    public boolean o() {
        return true;
    }

    public iq(int n10, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x4798BC2FFD45L;
        this(l11, -1, false, n10);
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

    public void Z(int n10) {
        this.G |= n10;
    }

    public void H(int n10) {
        this.a = n10;
    }

    public void A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        ow ow2 = (ow)((Object)objectArray[1]);
        long l11 = (l10 = b ^ l10) ^ 0x5A1231CC4F4AL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        this.G &= m44.a("v", (Object)((Object)ow2), (Object)objectArray2, (long)2566457715022909835L, (long)l10);
    }

    @Override
    public void G(short s10, int n10, DataOutputStream dataOutputStream, int n11) {
    }

    @Override
    public boolean d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    public int V(Object[] objectArray) {
        return cf.p(this.G);
    }

    @Override
    public hz n(hz hz2, boolean bl2, char c10, int n10, boolean bl3, loj loj2, char c11, String string) {
        long l10;
        long l11 = l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)c11 << 48 >>> 48;
        long l12 = l11 ^ 0x5A73015BC1DL;
        long l13 = l11 ^ 0x67D45B4239BAL;
        return new hz(hz2.X(), hz2.T(), l13, hz2.j(), hz2.k(l12));
    }

    @Override
    public final boolean v(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        v7 v72 = (v7)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        return false;
    }

    public iq(long l10, int n10, boolean bl2, int n11) {
        long l11 = (l10 = b ^ l10) ^ 0x3626169F89A8L;
        int n12 = (int)(l11 >>> 48);
        int n13 = (int)(l11 << 16 >>> 48);
        int n14 = (int)(l11 << 32 >>> 32);
        this(n10, (short)n12, (char)n13, bl2, false, n11, n14);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    iq.b = prr.a(6638775041074452077L, -8980965042124155292L, MethodHandles.lookup().lookupClass()).a(109008386277393L);
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

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x134B;
        if (e[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
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
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iq.e[n11] = n12;
        }
        return e[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = iq.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
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

