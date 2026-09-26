/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.as;
import com.zelix.e_;
import com.zelix.ff;
import com.zelix.gs;
import com.zelix.lqw;
import com.zelix.lu7;
import com.zelix.luj;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s4;
import com.zelix.sz;
import com.zelix.tz;
import com.zelix.wa;
import com.zelix.we;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JFrame;

public class lqd
implements ff {
    private boolean z;
    static String k;
    private as m;
    private gs[] h;
    private wa B;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    private void X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x668DF1B82437L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = null;
        m44.a("o", (Object)this, (Object)objectArray2, (long)-3982475096714793560L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void r(Object[] var1_1) {
        block21: {
            block22: {
                block20: {
                    block18: {
                        block19: {
                            var4_2 = (gs[])var1_1[0];
                            var3_3 = (lqw[])var1_1[1];
                            var7_4 = (gs[])var1_1[2];
                            var2_5 = (gs[])var1_1[3];
                            var5_6 = (sz)var1_1[4];
                            var8_7 = (Boolean)var1_1[5];
                            var9_8 = (Set)var1_1[6];
                            var6_9 = (Integer)var1_1[7];
                            var10_10 = (Long)var1_1[8];
                            v0 = var10_10 = lqd.a ^ var10_10;
                            var12_11 = v0 ^ 30965873786077L;
                            var14_12 = v0 ^ 119543599767969L;
                            var16_13 = v0 ^ 86563987351868L;
                            var18_14 = v0 ^ 66164386611075L;
                            var20_15 = m44.a("m", (long)5492198180769446600L, (long)var10_10);
                            try {
                                try {
                                    v1 /* !! */  = var4_2;
                                    if (var20_15 != null) break block18;
                                    if (v1 /* !! */  == null) break block19;
                                }
                                catch (n9 v2) {
                                    throw m44.a("m", (Object)v2, (long)5381992821769275086L, (long)var10_10);
                                }
                                m44.a("q", (Object)this, (gs[])var4_2, (long)6125478648294415468L, (long)var10_10);
                                m44.a("q", (Object)this, (boolean)true, (long)5438517176017346085L, (long)var10_10);
                            }
                            catch (n9 v3) {
                                throw m44.a("m", (Object)v3, (long)5381992821769275086L, (long)var10_10);
                            }
                        }
                        v1 /* !! */  = var5_6.t();
                    }
                    var21_16 = (String)v1 /* !! */ ;
                    try {
                        if (var10_10 > 0L && var21_16 != null) {
                            m44.a("r", (Object)m44.a("s", (Object)this, (long)5349534784303427645L, (long)var10_10), (Object)var21_16, (long)5386655413313300025L, (long)var10_10);
                        }
                    }
                    catch (n9 v4) {
                        throw m44.a("m", (Object)v4, (long)5381992821769275086L, (long)var10_10);
                    }
                    try {
                        if (var10_10 > 0L) {
                            if (var6_9 != 1) break block20;
                            v5 = new Object[9];
                            v5[8] = null;
                            v5[7] = var9_8;
                            v5[6] = var8_7;
                            v5[5] = var18_14;
                            v5[4] = var5_6;
                            v5[3] = var2_5;
                            v5[2] = var7_4;
                            v5[1] = var3_3;
                            v5[0] = m44.a("s", (Object)this, (long)6125478648294415468L, (long)var10_10);
                            m44.a("r", (Object)m44.a("s", (Object)this, (long)5281132894308124781L, (long)var10_10), (Object)v5, (long)5230311566626861592L, (long)var10_10);
                        }
                        if (var20_15 == null) break block21;
                    }
                    catch (n9 v6) {
                        throw m44.a("m", (Object)v6, (long)5381992821769275086L, (long)var10_10);
                    }
                }
                v7 = new Object[1];
                v7[0] = var16_13;
                var22_17 = m44.a("r", (Object)m44.a("s", (Object)this, (long)5281132894308124781L, (long)var10_10), (Object)v7, (long)5839869423194210676L, (long)var10_10);
                try {
                    try {
                        v8 = var20_15;
                        if (var10_10 < 0L) ** GOTO lbl86
                        if (v8 != null) break block22;
                        if (var22_17 == null) {
                        }
                        ** GOTO lbl87
                    }
                    catch (n9 v9) {
                        throw m44.a("m", (Object)v9, (long)5381992821769275086L, (long)var10_10);
                    }
                    v10 = new Object[1];
                    v10[0] = var14_12;
                    m44.a("l", (Object)this, (Object)v10, (long)6218324907253579543L, (long)var10_10);
                }
                catch (n9 v11) {
                    throw m44.a("m", (Object)v11, (long)5381992821769275086L, (long)var10_10);
                }
            }
            try {
                if (var10_10 <= 0L) break block21;
                v8 = var20_15;
lbl86:
                // 2 sources

                if (v8 == null) break block21;
lbl87:
                // 2 sources

                v12 = new Object[2];
                v12[1] = var22_17;
                v12[0] = var12_11;
                m44.a("l", (Object)this, (Object)v12, (long)5691966587886667474L, (long)var10_10);
            }
            catch (n9 v13) {
                throw m44.a("m", (Object)v13, (long)5381992821769275086L, (long)var10_10);
            }
        }
    }

    private void a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x321A893C0319L;
        long l4 = l2 ^ 0x6089FB6356F8L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("v", (Object)m44.a("w", (Object)this, (long)8542893431256119209L, (long)l), (Object)objectArray2, (long)7984684776671690416L, (long)l);
        objectArray3[0] = l3;
        m44.a("h", (Object)this, (Object)objectArray3, (long)8158766910015846678L, (long)l);
    }

    private void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        s4 s42 = (s4)objectArray[1];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x796AD0D8B653L;
        long l4 = l2 ^ 0x619021D2DEB2L;
        lu7 lu72 = new lu7(this);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = lqd.a("b", (int)24344, (long)(0x4D8E1FA741AC4356L ^ l));
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = lqd.a("b", (int)1412, (long)(0x31CAD89A0B6299CDL ^ l));
        new we((JFrame)((Object)m44.a("s", (Object)this, (long)-1445087303991203115L, (long)l)), (String)((Object)m44.a("i", (long)-659941470423293770L, (long)l)) + (String)((Object)lqd.a("b", (int)12756, (long)(0x2CF0EE13B1CE2D9BL ^ l))), s42, (String)((Object)m44.a("m", (Object)objectArray2, (long)-957145434399790999L, (long)l)), l4, (String)((Object)lqd.a("b", (int)14789, (long)(0x27D4C9D8703DA58DL ^ l))), (String)((Object)m44.a("m", (Object)objectArray3, (long)-957145434399790999L, (long)l)), (as)m44.a("s", (Object)this, (long)-1691942610564754811L, (long)l), (e_)lu72);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                lqd.a = prr.a((long)-1612995881496542701L, (long)-7739393194160444285L, MethodHandles.lookup().lookupClass()).a(211467248053666L);
                var9 = lqd.a ^ 116803318245651L;
                lqd.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[7];
                var5_4 = 0;
                var4_5 = "\u00c7\u00f8\u00b8\u00fe\u00bfi\u00ed\u00b8\u00d4\u0019\u001e\u008cv1\u00ed\u00b2n\u0014(1}\u00ac\u009c\u008f5\u00dc1Pa\u0089\u00e3\u00c3\u0010\u00ff\u008b8\u00c6\u000e\u00e7\u00a9\bF~#\u0019\u008did\u00e9\u0018>X\u00f68A\u00de\u00ac\u00dd\u00eb\u00f2HF\u00f9\u0088\u0000\u00e9\u00d0HY6v\u00b9\u00b6\u0000\u0018\u00aa\u00cffe\r\u0015\u0004&\u00a6*h\u00a9D\u009f\u00f1\u00a50+\u00cdB#\u00a7\u00e8\u00aa\u0010;O\u00b1\u0096\bO\b\u00e0\u00b8K\u00d8\u00ea\u0005\u009c\u00883";
                var6_6 = "\u00c7\u00f8\u00b8\u00fe\u00bfi\u00ed\u00b8\u00d4\u0019\u001e\u008cv1\u00ed\u00b2n\u0014(1}\u00ac\u009c\u008f5\u00dc1Pa\u0089\u00e3\u00c3\u0010\u00ff\u008b8\u00c6\u000e\u00e7\u00a9\bF~#\u0019\u008did\u00e9\u0018>X\u00f68A\u00de\u00ac\u00dd\u00eb\u00f2HF\u00f9\u0088\u0000\u00e9\u00d0HY6v\u00b9\u00b6\u0000\u0018\u00aa\u00cffe\r\u0015\u0004&\u00a6*h\u00a9D\u009f\u00f1\u00a50+\u00cdB#\u00a7\u00e8\u00aa\u0010;O\u00b1\u0096\bO\b\u00e0\u00b8K\u00d8\u00ea\u0005\u009c\u00883".length();
                var3_7 = 32;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = lqd.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "y$\u00e9\u00af\u00a2\u0002\u00a6\u000b\u0013^`\u00e9\u00d2B`\u00cbV\u00ab\u00da\u00f2\u009c\u0017s%6\u00f5I\u00fbYd\u0000d(\t\u0011\u00fc\u0015#\u00e0\u0084\u00bc\u0088\u0006\u0016\u0014\u00ef%D\u000e\\\u0092xj\u00034\u00fdF\u00a8\u00f7\u00ae\u00de\u0084\u009e\u0095\u00e7\u00d6\u000fF\u00e3\u00e3\u001a\u00d9\u00a5";
                    var6_6 = "y$\u00e9\u00af\u00a2\u0002\u00a6\u000b\u0013^`\u00e9\u00d2B`\u00cbV\u00ab\u00da\u00f2\u009c\u0017s%6\u00f5I\u00fbYd\u0000d(\t\u0011\u00fc\u0015#\u00e0\u0084\u00bc\u0088\u0006\u0016\u0014\u00ef%D\u000e\\\u0092xj\u00034\u00fdF\u00a8\u00f7\u00ae\u00de\u0084\u009e\u0095\u00e7\u00d6\u000fF\u00e3\u00e3\u001a\u00d9\u00a5".length();
                    var3_7 = 32;
                    var2_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = lqd.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        lqd.b = var7_3;
        lqd.c = new String[7];
        m44.a("j", (String)lqd.a("b", (int)3525, (long)(6058700537892012531L ^ var9)), (long)7398011782652391626L, (long)var9);
    }

    private void n(Object[] objectArray) {
        block8: {
            Object[] objectArray2;
            lqd lqd2;
            long l;
            block9: {
                long l2;
                block10: {
                    l = (Long)objectArray[0];
                    s4 s42 = (s4)objectArray[1];
                    Integer n = (Integer)objectArray[2];
                    long l3 = l = a ^ l;
                    l2 = l3 ^ 0x68ED15088210L;
                    long l4 = l3 ^ 0x4CEAC9A83842L;
                    int n2 = n;
                    Object[] objectArray3 = m44.a("i", (long)7758706469037088092L, (long)l);
                    try {
                        block11: {
                            try {
                                try {
                                    try {
                                        if (n2 != 1) break block8;
                                        lqd2 = this;
                                        objectArray2 = objectArray3;
                                        if (l < 0L) break block9;
                                        if (objectArray2 != null) break block10;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("i", (Object)((Object)n92), (long)7864673341841776986L, (long)l);
                                    }
                                    if (l < 0L) break block10;
                                    if (m44.a("w", (Object)lqd2, (long)8256876202382343160L, (long)l) != null) break block11;
                                }
                                catch (n9 n93) {
                                    throw m44.a("i", (Object)((Object)n93), (long)7864673341841776986L, (long)l);
                                }
                                Object[] objectArray4 = new Object[1];
                                objectArray4[0] = l4;
                                m44.a("h", (Object)this, (Object)objectArray4, (long)7938093962180601425L, (long)l);
                                if (objectArray3 == null) break block8;
                            }
                            catch (n9 n94) {
                                throw m44.a("i", (Object)((Object)n94), (long)7864673341841776986L, (long)l);
                            }
                        }
                        lqd2 = this;
                    }
                    catch (n9 n95) {
                        throw m44.a("i", (Object)((Object)n95), (long)7864673341841776986L, (long)l);
                    }
                }
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = l2;
                objectArray2 = objectArray5;
                objectArray5[0] = m44.a("w", (Object)this, (long)8256876202382343160L, (long)l);
            }
            m44.a("h", (Object)lqd2, (Object)objectArray2, (long)7970361572189604751L, (long)l);
        }
    }

    private void l(Object[] objectArray) {
        gs[] gsArray = (gs[])objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x208C44F6FA4BL;
        luj luj2 = new luj(this);
        m44.a("s", (Object)m44.a("r", (Object)this, (long)8262754345594516364L, (long)l), (boolean)false, (long)8334501603459923559L, (long)l);
        new tz((JFrame)((Object)m44.a("r", (Object)this, (long)8262754345594516364L, (long)l)), (String)((Object)m44.a("h", (long)8038464875330697711L, (long)l)) + (String)((Object)lqd.a("b", (int)27343, (long)(0x58400D4DDB046FDAL ^ l))), (String)((Object)lqd.a("b", (int)10512, (long)(0x2E0F64A80010AC04L ^ l))), l2, true, (String)((Object)m44.a("s", (Object)m44.a("r", (Object)this, (long)8204490503222479836L, (long)l), (long)7649857410508005256L, (long)l)), (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)8204490503222479836L, (long)l), (long)8258565963419587392L, (long)l), null, (e_)luj2);
    }

    public lqd(wa wa2, int n, short s, as as2, short s2) {
        long l;
        long l2 = l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x282FAD1127E7L;
        long l4 = l2 ^ 0x7EAF4F8AA3F1L;
        long l5 = l2 ^ 0x7ABCDF4E7206L;
        m44.a("s", (Object)this, (wa)wa2, (long)5940369290185462615L, (long)l);
        m44.a("s", (Object)this, (as)as2, (long)5838751498182945543L, (long)l);
        m44.a("p", (Object)wa2, (boolean)false, (long)6012661903715458748L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = true;
        m44.a("p", (Object)wa2, (Object)objectArray, (long)5501360591389362698L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = m44.a("p", (Object)wa2, (Object)objectArray2, (long)5346149111862205006L, (long)l);
        objectArray3[0] = l3;
        m44.a("n", (Object)this, (Object)objectArray3, (long)6181148098054168040L, (long)l);
    }

    public void H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x17F6F0B33B74L;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-3822140750731326510L, (long)l), (boolean)true, (long)-3750322576371333575L, (long)l);
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-3822140750731326510L, (long)l), (long)-2905218317609353959L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = false;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)-3822140750731326510L, (long)l), (Object)objectArray2, (long)-3108140053480533361L, (long)l);
    }

    static /* synthetic */ as M(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lqd lqd2 = (lqd)objectArray[1];
        l = a ^ l;
        return m44.a("s", (Object)lqd2, (long)-3799536523179658939L, (long)l);
    }

    static /* synthetic */ void Q(Object[] objectArray) {
        lqd lqd2 = (lqd)objectArray[0];
        long l = (Long)objectArray[1];
        gs[] gsArray = (gs[])objectArray[2];
        lqw[] lqwArray = (lqw[])objectArray[3];
        gs[] gsArray2 = (gs[])objectArray[4];
        gs[] gsArray3 = (gs[])objectArray[5];
        sz sz2 = (sz)objectArray[6];
        Boolean bl = (Boolean)objectArray[7];
        Set set = (Set)objectArray[8];
        int n = (Integer)objectArray[9];
        long l2 = (l = a ^ l) ^ 0x5F6BB4FE305L;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = l2;
        objectArray2[7] = n;
        objectArray2[6] = set;
        objectArray2[5] = bl;
        objectArray2[4] = sz2;
        objectArray2[3] = gsArray3;
        objectArray2[2] = gsArray2;
        objectArray2[1] = lqwArray;
        objectArray2[0] = gsArray;
        m44.a("l", (Object)lqd2, (Object)objectArray2, (long)3744248484443975990L, (long)l);
    }

    static /* synthetic */ void U(Object[] objectArray) {
        lqd lqd2 = (lqd)objectArray[0];
        s4 s42 = (s4)objectArray[1];
        long l = (Long)objectArray[2];
        Integer n = (Integer)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x1300A585C4D1L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = s42;
        objectArray2[0] = l2;
        m44.a("l", (Object)lqd2, (Object)objectArray2, (long)3832950872867327062L, (long)l);
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7B46;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lqd", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            lqd.c[n2] = lqd.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lqd.a(n, l);
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
            throw new RuntimeException("com/zelix/lqd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lqd.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
