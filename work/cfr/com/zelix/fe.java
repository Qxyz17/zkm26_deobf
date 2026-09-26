/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._u;
import com.zelix.a_;
import com.zelix.an;
import com.zelix.eh;
import com.zelix.gs;
import com.zelix.h9;
import com.zelix.lb6;
import com.zelix.lbo;
import com.zelix.lqw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.ry;
import com.zelix.sz;
import com.zelix.ur;
import com.zelix.yf;
import com.zelix.yu;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fe {
    lqw[] I;
    private final eh d;
    Map A;
    private final _6 v;
    yf s;
    private final _u k;
    private Set n;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    /*
     * Unable to fully structure code
     */
    private void Q(Object[] var1_1) {
        var3_2 = (Long)var1_1[0];
        var5_3 = (Enumeration)var1_1[1];
        var2_4 = (Map)var1_1[2];
        v0 = var3_2 = fe.a ^ var3_2;
        var6_5 = v0 ^ 66889971821105L;
        v1 = v0 ^ 76916768504640L;
        var8_6 = v1 >>> 8;
        var10_7 = (int)(v1 << 56 >>> 56);
        var11_8 = v0 ^ 117279540721598L;
        var13_9 = v0 ^ 104425809145170L;
        var15_10 = v0 ^ 114320889221740L;
        var17_11 = m44.a("j", (long)-911034996651027689L, (long)var3_2);
        try {
            v2 = var5_3;
            if (var17_11 != null) ** GOTO lbl26
            if (v2 != null) {
            }
            ** GOTO lbl53
        }
        catch (IOException v3) {
            throw m44.a("j", (Object)v3, (long)-881219088558968121L, (long)var3_2);
        }
        block4: while (true) {
            v2 = var5_3;
lbl26:
            // 2 sources

            if (!v2.hasMoreElements()) ** GOTO lbl53
            do {
                var18_12 = (gs)var5_3.nextElement();
                var19_13 = var18_12.B(var6_5);
                try {
                    v4 = new Object[2];
                    v4[1] = (int)((byte)var10_7);
                    v4[0] = var8_6;
                    var20_14 = new FileInputStream((File)m44.a("u", (Object)var18_12, (Object)v4, (long)-1503359196530718460L, (long)var3_2));
                    v5 = new Object[2];
                    v5[1] = var20_14;
                    v5[0] = var15_10;
                    var21_16 = m44.a("j", (Object)v5, (long)-1656511248860004886L, (long)var3_2);
                    new h9((BufferedReader)var21_16, var19_13, var11_8, var2_4);
                }
                catch (IOException var20_15) {
                    v6 = new Object[3];
                    v6[2] = (String)fe.a("k", (int)8495, (long)(6061403355696441938L ^ var3_2)) + var19_13 + (String)fe.a("k", (int)31276, (long)(1286432223647691074L ^ var3_2)) + (String)m44.a("u", (Object)var20_15, (long)-993952205742435676L, (long)var3_2);
                    v6[1] = var13_9;
                    v6[0] = fe.a("k", (int)17334, (long)(790429406458333383L ^ var3_2));
                    m44.a("u", (Object)m44.a("t", (Object)this, (long)-616508608450221762L, (long)var3_2), (Object)v6, (long)-1685062608684109475L, (long)var3_2);
                }
                if (var17_11 == null) continue block4;
lbl53:
                // 3 sources

            } while (var3_2 < 0L);
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void n(Object[] var1_1) {
        var2_2 = (Enumeration)var1_1[0];
        var5_3 = (Map)var1_1[1];
        var3_4 = (Long)var1_1[2];
        v0 = var3_4 = fe.a ^ var3_4;
        var6_5 = v0 ^ 133037706829897L;
        v1 = v0 ^ 2052405752120L;
        var8_6 = v1 >>> 8;
        var10_7 = (int)(v1 << 56 >>> 56);
        var11_8 = v0 ^ 14414456094864L;
        var13_9 = v0 ^ 29484128528170L;
        var15_10 = v0 ^ 39377061124116L;
        var17_11 = m44.a("j", (long)8728853858008766831L, (long)var3_4);
        try {
            v2 = var2_2;
            if (var17_11 != null) ** GOTO lbl26
            if (v2 != null) {
            }
            ** GOTO lbl53
        }
        catch (IOException v3) {
            throw m44.a("j", (Object)v3, (long)8772171777211480255L, (long)var3_4);
        }
        block4: while (true) {
            v2 = var2_2;
lbl26:
            // 2 sources

            if (!v2.hasMoreElements()) ** GOTO lbl53
            do {
                var18_12 = (gs)var2_2.nextElement();
                var19_13 = var18_12.B(var6_5);
                try {
                    v4 = new Object[2];
                    v4[1] = (int)((byte)var10_7);
                    v4[0] = var8_6;
                    var20_14 = new FileInputStream((File)m44.a("u", (Object)var18_12, (Object)v4, (long)7015124909147538300L, (long)var3_4));
                    v5 = new Object[2];
                    v5[1] = var20_14;
                    v5[0] = var15_10;
                    var21_16 = m44.a("j", (Object)v5, (long)7168226350262728594L, (long)var3_4);
                    new ry(var11_8, (BufferedReader)var21_16, var19_13, var5_3);
                }
                catch (IOException var20_15) {
                    v6 = new Object[3];
                    v6[2] = (String)fe.a("k", (int)25894, (long)(4359583956791223358L ^ var3_4)) + var19_13 + (String)fe.a("k", (int)29689, (long)(578054867026309867L ^ var3_4)) + (String)m44.a("u", (Object)var20_15, (long)8668445861430302940L, (long)var3_4);
                    v6[1] = var13_9;
                    v6[0] = fe.a("k", (int)17334, (long)(790504271089713855L ^ var3_4));
                    m44.a("u", (Object)m44.a("t", (Object)this, (long)9010010184807424838L, (long)var3_4), (Object)v6, (long)7126155128915409701L, (long)var3_4);
                }
                if (var17_11 == null) continue block4;
lbl53:
                // 3 sources

            } while (var3_4 <= 0L);
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void a(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var5_3 = (Enumeration)var1_1[1];
        var4_4 = (Map)var1_1[2];
        v0 = var2_2 = fe.a ^ var2_2;
        v1 = v0 ^ 1005039768948L;
        var6_5 = v1 >>> 16;
        var8_6 = (int)(v1 << 48 >>> 48);
        var9_7 = v0 ^ 138664218438372L;
        var11_8 = m44.a("o", (long)4291499729056455618L, (long)var2_2);
        try {
            v2 = var5_3;
            if (var11_8 != null) ** GOTO lbl23
            if (v2 != null) {
            }
            ** GOTO lbl38
        }
        catch (n9 v3) {
            throw m44.a("o", (Object)v3, (long)4256013605173262866L, (long)var2_2);
        }
        block2: while (true) {
            v2 = var5_3;
lbl23:
            // 2 sources

            if (!v2.hasMoreElements()) ** GOTO lbl38
            do {
                var12_9 = (a_)var5_3.nextElement();
                v4 = new Object[1];
                v4[0] = var9_7;
                v5 = new Object[4];
                v5[3] = (int)((short)var8_6);
                v5[2] = var4_4;
                v5[1] = m44.a("p", (Object)var12_9, (Object)v4, (long)2332045347701234724L, (long)var2_2);
                v5[0] = var6_5;
                m44.a("p", (Object)var12_9, (Object)v5, (long)4411297811833821219L, (long)var2_2);
                if (var11_8 == null) continue block2;
lbl38:
                // 3 sources

            } while (var2_2 < 0L);
            break;
        }
    }

    private boolean u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        ZipFile zipFile = (ZipFile)objectArray[1];
        ZipEntry zipEntry = (ZipEntry)objectArray[2];
        yf yf2 = (yf)objectArray[3];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x50EE0943F07L;
        long l13 = l11 ^ 0x7CB062BF575AL;
        try {
            return (boolean)m44.a("j", (Object)zipFile, (Object)zipEntry, (long)l12, (long)-3099439723470676646L, (long)l10);
        }
        catch (IOException iOException) {
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = (String)((Object)fe.a("k", (int)3453, (long)(0x5388CB41F080BC18L ^ l10))) + (String)((Object)m44.a("u", (Object)iOException, (long)-4018081724696319828L, (long)l10));
            objectArray2[1] = l13;
            objectArray2[0] = fe.a("k", (int)17334, (long)(0xAF809129205F2CFL ^ l10));
            m44.a("u", (Object)yf2, (Object)objectArray2, (long)-3272614764875216043L, (long)l10);
            return false;
        }
    }

    void b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x380F8D9864D9L;
        long l13 = l11 ^ 0x73AEC80B9BFAL;
        CallSite callSite = m44.a("h", (long)9189924970820280261L, (long)l10);
        for (int i10 = 0; i10 < ((CallSite)m44.a("v", (Object)this, (long)6955353492524142956L, (long)l10)).length; ++i10) {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l12;
            CallSite callSite2 = m44.a("w", (Object)m44.a("v", (Object)this, (long)6955353492524142956L, (long)l10)[i10], (Object)objectArray2, (long)8868934988015322273L, (long)l10);
            try {
                yu yu2 = new yu((String)((Object)callSite2));
                m44.a("v", (Object)this, (long)9163107915195446479L, (long)l10).put(m44.a("v", (Object)this, (long)6955353492524142956L, (long)l10)[i10], yu2);
                continue;
            }
            catch (IOException iOException) {
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = l13;
                objectArray3[1] = (String)((Object)fe.a("k", (int)27882, (long)(0x251CBD1FF8C6EB47L ^ l10))) + (String)((Object)callSite2) + (String)((Object)fe.a("k", (int)5219, (long)(0x298CF744D55293D9L ^ l10))) + (String)((Object)m44.a("w", (Object)iOException, (long)9144193805490527862L, (long)l10));
                objectArray3[0] = fe.a("k", (int)20216, (long)(0x2F192DDD6DBDC94EL ^ l10));
                m44.a("w", (Object)m44.a("v", (Object)this, (long)8909191823185683948L, (long)l10), (Object)objectArray3, (long)7257290223371257906L, (long)l10);
            }
            if (callSite == null) continue;
        }
    }

    private void y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x2F895C0D2CC1L;
        Iterator iterator = m44.a("u", (Object)this, (long)-4029953939619331084L, (long)l10).values().iterator();
        CallSite callSite = m44.a("k", (long)-3984999345149007618L, (long)l10);
        while (iterator.hasNext()) {
            ZipFile zipFile = (ZipFile)iterator.next();
            CallSite callSite2 = m44.a("t", (Object)zipFile, (long)-2986215014014058611L, (long)l10);
            try {
                m44.a("t", (Object)zipFile, (long)-2951217549999252817L, (long)l10);
            }
            catch (IOException iOException) {
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l11;
                objectArray2[1] = (String)((Object)fe.a("k", (int)25690, (long)(0x73CDA44C71CFD4D6L ^ l10))) + (String)((Object)callSite2) + (String)((Object)fe.a("k", (int)32677, (long)(0x5A6C3BDCD565CF2EL ^ l10))) + (String)((Object)m44.a("t", (Object)iOException, (long)-3900697858204915379L, (long)l10));
                objectArray2[0] = fe.a("k", (int)5809, (long)(0x2477A9EE379BA62DL ^ l10));
                m44.a("t", (Object)m44.a("u", (Object)this, (long)-3704049180381375785L, (long)l10), (Object)objectArray2, (long)-3203098208327483639L, (long)l10);
            }
            if (callSite == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void u(Object[] var1_1) {
        var8_2 = (Enumeration)var1_1[0];
        var2_3 = (Map)var1_1[1];
        var7_4 = (Map)var1_1[2];
        var4_5 = (Map)var1_1[3];
        var3_6 = (ol)var1_1[4];
        var5_7 = (Long)var1_1[5];
        v0 = var5_7 = fe.a ^ var5_7;
        v1 = v0 ^ 87282526743356L;
        var9_8 = (int)(v1 >>> 32);
        var10_9 = (int)(v1 << 32 >>> 48);
        var11_10 = (int)(v1 << 48 >>> 48);
        var12_11 = v0 ^ 134183961066468L;
        v2 = v0 ^ 3473537952405L;
        var14_12 = v2 >>> 8;
        var16_13 = (int)(v2 << 56 >>> 56);
        var17_14 = v0 ^ 124622967115122L;
        var19_15 = v0 ^ 33208873177885L;
        var21_16 = v0 ^ 60909547581740L;
        var23_17 = v0 ^ 26550096723079L;
        var25_18 = m44.a("o", (long)-2121726885942689086L, (long)var5_7);
        try {
            v3 = var8_2;
            if (var25_18 != null) ** GOTO lbl35
            if (v3 != null) {
            }
            ** GOTO lbl101
        }
        catch (ur v4) {
            throw m44.a("o", (Object)v4, (long)-2157222897529052398L, (long)var5_7);
        }
        block6: while (true) {
            v3 = var8_2;
lbl35:
            // 2 sources

            if (!v3.hasMoreElements()) ** GOTO lbl101
            do {
                var26_19 = (gs)var8_2.nextElement();
                var27_20 = var26_19.B(var12_11);
                try {
                    var28_21 = new sz(var9_8, (short)var10_9, (char)var11_10);
                    var29_25 = new lb6(0);
                    var30_26 = new lb6(0);
                    var31_27 = new lb6((int)fe.b("n", (int)4724, (long)(1083730773483310459L ^ var5_7)));
                    v5 = new Object[2];
                    v5[1] = (int)((byte)var16_13);
                    v5[0] = var14_12;
                    v6 = new Object[6];
                    v6[5] = var31_27;
                    v6[4] = var30_26;
                    v6[3] = var29_25;
                    v6[2] = var28_21;
                    v6[1] = var19_15;
                    v6[0] = m44.a("p", (Object)var26_19, (Object)v5, (long)-362618820844627759L, (long)var5_7);
                    var32_28 = m44.a("o", (Object)v6, (long)-416531165780607702L, (long)var5_7);
                    v7 = new Object[7];
                    v7[6] = m44.a("q", (Object)this, (long)-1827055775540987669L, (long)var5_7);
                    v7[5] = m44.a("q", (Object)this, (long)-1973039810413412968L, (long)var5_7);
                    v7[4] = m44.a("q", (Object)this, (long)-1833388954733588402L, (long)var5_7);
                    v7[3] = m44.a("q", (Object)this, (long)-1736700151715955409L, (long)var5_7);
                    v7[2] = var32_28;
                    v7[1] = var17_14;
                    v7[0] = var27_20;
                    var33_29 = m44.a("o", (Object)v7, (long)-2097943413735530869L, (long)var5_7);
                    v8 = new Object[2];
                    v8[1] = (int)((byte)var16_13);
                    v8[0] = var14_12;
                    new an((File)m44.a("p", (Object)var26_19, (Object)v8, (long)-362618820844627759L, (long)var5_7), var29_25, var21_16, var30_26, var31_27, (String)var28_21.t(), (_u)m44.a("q", (Object)this, (long)-1833388954733588402L, (long)var5_7), (lbo)var33_29, var2_3, var7_4, var4_5, var3_6);
                }
                catch (ur var28_22) {
                    v9 = new Object[3];
                    v9[2] = (String)fe.a("k", (int)31985, (long)(5200681014364431958L ^ var5_7)) + var27_20 + (String)fe.a("k", (int)19702, (long)(4599823725801133644L ^ var5_7)) + (String)m44.a("p", (Object)var28_22, (long)-1962800191663578699L, (long)var5_7);
                    v9[1] = var23_17;
                    v9[0] = fe.a("k", (int)21131, (long)(5719260648947075106L ^ var5_7));
                    m44.a("p", (Object)m44.a("q", (Object)this, (long)-1827055775540987669L, (long)var5_7), (Object)v9, (long)-484081296843202424L, (long)var5_7);
                }
                catch (IOException var28_23) {
                    v10 = new Object[3];
                    v10[2] = (String)fe.a("k", (int)27272, (long)(2260675208065708078L ^ var5_7)) + var27_20 + (String)fe.a("k", (int)32578, (long)(8076077120824403427L ^ var5_7)) + (String)m44.a("p", (Object)var28_23, (long)-2026193908876803215L, (long)var5_7);
                    v10[1] = var23_17;
                    v10[0] = fe.a("k", (int)17334, (long)(790502162763340050L ^ var5_7));
                    m44.a("p", (Object)m44.a("q", (Object)this, (long)-1827055775540987669L, (long)var5_7), (Object)v10, (long)-484081296843202424L, (long)var5_7);
                }
                catch (Exception var28_24) {
                    v11 = new Object[3];
                    v11[2] = (String)fe.a("k", (int)2286, (long)(4424963959635186263L ^ var5_7)) + var27_20 + (String)fe.a("k", (int)32578, (long)(8076077120824403427L ^ var5_7)) + (String)m44.a("p", (Object)var28_24, (long)-2032492827791217304L, (long)var5_7);
                    v11[1] = var23_17;
                    v11[0] = fe.a("k", (int)17334, (long)(790502162763340050L ^ var5_7));
                    m44.a("p", (Object)m44.a("q", (Object)this, (long)-1827055775540987669L, (long)var5_7), (Object)v11, (long)-484081296843202424L, (long)var5_7);
                }
                if (var25_18 == null) continue block6;
lbl101:
                // 3 sources

            } while (var5_7 < 0L);
            break;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    fe(lqw[] lqwArray, Set set, ol ol2, ol ol3, ol ol4, Enumeration enumeration, Enumeration enumeration2, eh eh2, Enumeration enumeration3, Enumeration enumeration4, long l10, _u _u2, _6 _62, yf yf2, Map map, Map map2, Map map3, ol ol5, Map map4) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x425B96313DB8L;
        long l13 = l11 ^ 0x58DCCF6E1844L;
        long l14 = l11 ^ 0x2EB18FF89496L;
        long l15 = l11 ^ 0x4FB5B68AF7FL;
        long l16 = l11 ^ 0xC8AF14A5C43L;
        long l17 = l11 ^ 0xAA51BC70EFBL;
        long l18 = l11 ^ 0x686DA5AF8543L;
        long l19 = l11 ^ 0x6A98C7BB1EEEL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        m44.a("q", (Object)this, (Map)((Object)m44.a("m", (Object)objectArray, (long)-2748102078105404098L, (long)l10)), (long)-2498127867340269902L, (long)l10);
        m44.a("q", (Object)this, (lqw[])lqwArray, (long)-4396820761977146607L, (long)l10);
        m44.a("q", (Object)this, (Set)set, (long)-2343271579490568197L, (long)l10);
        this.d = eh2;
        this.k = _u2;
        this.v = _62;
        m44.a("q", (Object)this, (yf)yf2, (long)-2747489154049079407L, (long)l10);
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            m44.a("r", (Object)this, (Object)objectArray2, (long)-2623239899500412712L, (long)l10);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = map;
            objectArray3[1] = enumeration;
            objectArray3[0] = l16;
            m44.a("l", (Object)this, (Object)objectArray3, (long)-2683565709963592884L, (long)l10);
            Object[] objectArray4 = new Object[6];
            objectArray4[5] = l18;
            objectArray4[4] = ol5;
            objectArray4[3] = map3;
            objectArray4[2] = map2;
            objectArray4[1] = map;
            objectArray4[0] = enumeration2;
            m44.a("l", (Object)this, (Object)objectArray4, (long)-4179180743062653419L, (long)l10);
            Object[] objectArray5 = new Object[3];
            objectArray5[2] = l19;
            objectArray5[1] = map;
            objectArray5[0] = enumeration3;
            m44.a("l", (Object)this, (Object)objectArray5, (long)-2352125683962041147L, (long)l10);
            Object[] objectArray6 = new Object[3];
            objectArray6[2] = map;
            objectArray6[1] = enumeration4;
            objectArray6[0] = l14;
            m44.a("l", (Object)this, (Object)objectArray6, (long)-2472516868998343552L, (long)l10);
            Object[] objectArray7 = new Object[9];
            objectArray7[8] = ol4;
            objectArray7[7] = ol3;
            objectArray7[6] = ol2;
            objectArray7[5] = map4;
            objectArray7[4] = ol5;
            objectArray7[3] = l17;
            objectArray7[2] = map3;
            objectArray7[1] = map2;
            objectArray7[0] = map;
            m44.a("l", (Object)this, (Object)objectArray7, (long)-2625151415181722799L, (long)l10);
        }
        catch (Throwable throwable) {
            Object[] objectArray8 = new Object[1];
            objectArray8[0] = l15;
            m44.a("l", (Object)this, (Object)objectArray8, (long)-2854867330681361116L, (long)l10);
            throw throwable;
        }
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l15;
        m44.a("l", (Object)this, (Object)objectArray9, (long)-2854867330681361116L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    private void D(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [91[DOLOOP]], but top level block is 2[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        fe.a = prr.a(8073010772645879102L, 3303827686232353049L, MethodHandles.lookup().lookupClass()).a(76927305029749L);
                        fe.e = new HashMap<K, V>(13);
                        var11 = fe.a ^ 47661997776949L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[29];
                        var18_4 = 0;
                        var17_5 = "\u0080%\u00c5\"\u00d4&\u00c3\u0087T\u00fc\u00b5\u00dbk\u0017\u0085xH\u00a0\u00de\u0015\u00e0fVd-',\u00d5o\u00aa\u007f8\u0014\u00f1\u0089\u009f\u00bf\u00ff\u0014\u00af\u00d2$~lHjW\u008dJd\u00f3\u0099\u00d8\u00d9\u009d\"\u00efD\u0018\u000b\u00a8rIE\u008f\u00d2\u0010\u00920\u001c\u00b6\u00c1\u0081\u00d3\u00e3D\u00db\u00916\u00ef\u00b0Co\u00f8w\u00f3\u009e\u00fd\u001b\u0018C\u00a8\u008coA_Z\u0092\u001e\u00d8T-\u00cd\u00b0n\u00d4\u00e1\u00b8\u00ac%\u0010\u00e3\u000bL(*\u00cc\u0084\u00ae\u00133M\u00b2\u0007c\u00de\u0083\u0004\u0014\u0084v\u0087\u00ce1*s\u008f\u001c\u0084\u00d5I*\u00d3$\u00f5\u00e4\u001d\u001anA\u009c\u00eb1\u009e\u00ed\u0010\u00bc\u00f3h;@m\u00aa,v'\u0084\u001d\u008aA\u00fa\u00e6H(NTt,y\\m\u00c3!'\u00d8!\u00e8&\u00a5\u009e:\u00c7\u00bf\u0081X\u0018^\u00cb\u00eb\u0096\u001erK\u00eb\u00c20\u00e3\u00ed\u00d4w\u00b5\u00cbc\u00b9k\u00e6A\u008c\u008d\u0080\u00b4\\\u0015\u00f8\u00b1+\u0012~\n\u00026z\u00c1\t\u0011\u00f1B\u0019\u001aN\u00d6\u00e8t\u00de\u00a5@\u000f\u00e3\u0019\u00e8\u00ec%\u0081\u00a75\b%9\u0091\u00caPy1\u00f7\u00edf\u009f\u00eeZ\u00a2\u0016R\u00f2\u009c\u0092\u00edT\u00b6^\u00be\u00b8\u009f\u00b7\u0099k\u0017\u00cdS\u00d8<`a\u00bd*\u0086\u00c6\u00fe\u00c5\u00068{\u0093h\u00c6\u00d8]\u0081\u0084\u00da\u00e0@Y\u00a9\u00be>\b\u00cd\u00a9\f\u008f'Xz\u001d\u00e5\u00d8I\u0091\u0081\u009b\u00b5\u00b7\u001f-\u00af\u00f1\u00cfy\u00e1\u00efB\u00ce\u00c8\u00bf\u00fcz\u0081\u00b5<\u009b\u00f3\u00ad9b\u00d9\u001f\u000f\u00cf\u00a6\u00e5\u0080\u00a1}=\u00aa\u00a4s\u0000\u00ebX\u00f6K\u001e7\n\u0018Q\u001d\u00a7a\u0002\u00e3\u00f5o\u0090B\u00c0Q#u\u00861h\u00ea\b\u00c9_iX\u0095 \u0090\u00ef\u00d1\u009e<\u008fW\u00e0e\u00d3C\u0014\u00a5Pg\u00bf&\u00b3\u00d3\u0011\u00eaQ\u00cfl\u0015F\u00b0\u00b1E#\u00f2\u008b@\u0082I((|\b?\u0086\u0094\u001e\u00bb\u001c\u0003\u00e5\u00c3o\u00a3\u0095Dm#\u0099\u0017\u00b3VC\u00e2x\u00f8\u001b[k\u00b20\u00ea\u00e8J\u008cA\u00b2\u000bO10\u00941[d\u00cc\u00e2\u00ea\u00c5\u00b4m<\u0002\u00fa\b\u001fV@\u00d6\u00b0\u00d6(\u00ed\u0017\u001a\u00d0`\u008b\u00f0L\u0092OF\u00a6\u00aa9\"C\u001b\u00b8b8\t\u00da\u008cR@\u00ef\u0084\u008e(1\u0091q|\u00d2p\u0083dN\u00a6!\u00183\u0084y$\u00cf\u00ceI\u00c3\u008a\f\u00d7\u008e\u0091LH\u00e88\u0002\u00b3\u00a1\u00ee\u009a\u0004~\u0010\u00dc\u0097\u00bc+\u00928EZ\\\u0094\u0016\u00f6\u00c7Y\u00a2\u00c0\u0010\u0087\u00ac\u0002\u00b9\u00b8?^X\u00abzJ\u001e\u00bci}4\u0010\u000e.\u00a7n&<~\u0016v\u00d2\u00ec5\u00e7\u00c1\f\u00d48K\u00fc/N\u00e2\u00b6\u008f\u00c4\u00be\u00ad\u00ba\u00ed\u000f\u00fa\u00dev\u00ac\u0018\u00d7nm\u00eb\u00a2\u00d0\u00fa-\u00ac\u008a)\u00d2aho\u0001\u0010C\u00ef\u00c8\u00b0\u0081\u00ec\u000e\u00bf\u00a5]\bG0Or\u0084\u00fb\u00c6\u0007\u0091\u0096\u0010\u00b9V\u00d6G\u009dF\u000e]\b\u00fe<e8lY\u00b9 \u00cbOX\u00c5\\#t\u00d6\u00ab#\u0010\u00ee\u00e74\u00c9t\u00cc\u0005E0\u001b\u0007&\u00f5t@\u001e5\u00ac+3\u001e\u0018cr\u00ec2\u0013\u00df\u00ff\u001a\u0087Q\u008f\u00bdJ\u00e9\u00b2\u00cb\u0082\u0094\u00c3\u0083\u008d\u00c1\u00a0\u00d3(\u00e8[%\u00ef\u00c2\u00d5=\u009b\u0092A\u0016X\u00ec\u00bc\f:\u00db40K4\u00b6]\u001a\u00e9\u00fa\u00d1\u00d84\u00bdd\u000f\u008b\u0096\u008f\u00ce\u0003\u000b}\u00a2@\u00bbk\u0086\u0083\u00c3\u00ff!\u00c1\u001e\u001eU\u0002\u00f3L\u00df\u00c7\u0084\u0005\u00bb\u00c6^\u0002\u009f\u00e4\u00f9\u0016\u00fd\u0081\u0082\u0085\u00e0>\u00f4\u00e5/Z\u009dQf\u00e1!\u0088\u000el`M\u00b3\u00e2#_\u00ca\u0099\u0080+6\\\u00eb\u0016Y\u00f3\u00af\u0091\u0002\u00e8 \u0083\u00cfxU\u00b6\u00c7\u00c3\u00b9\u00bc\u00edb\u00b0ko3\u00e6\u0097\u008eg\u000f\u00f5?.7X\u0096\u009a\u00beF\u00ba\u00a4= B\u00a3\u00e2\u00d6\u00dbx\u00a65\u0090\u00b3\u0014\u007f\u0084G\u00a7\u00e5\u00e25EN\b\u00d9\u000bd\u0086\u0083[.\u00cfP\u00f0\u00c5(\u001b\u001e\u00b2\u00f5\u00ec\u0003.rU\u009d\u0014\u0089\u00b5A/\u0003\u0094} \u0005\u009a\u0080Y\u00c6\u00e0m7\u008e\u00ef\u000f\u0091'\u001fcA\u00c5\u00ca\u00ce\u00fce\u0018,N\u00af/\u000f]E\u0083\u0097\u00f5C\u007f\u00c2]\u000b\u0000\u001bV\u00ea=\u0016J\u00022\u0018\u00f1\u000e\u0006Fd\u00a6\u00e2\"VDH\u00d6\u001e\u0082\u00c2\u008f\u0095\u0006\u00f6\r\u00a8\u001fJx";
                        var19_6 = "\u0080%\u00c5\"\u00d4&\u00c3\u0087T\u00fc\u00b5\u00dbk\u0017\u0085xH\u00a0\u00de\u0015\u00e0fVd-',\u00d5o\u00aa\u007f8\u0014\u00f1\u0089\u009f\u00bf\u00ff\u0014\u00af\u00d2$~lHjW\u008dJd\u00f3\u0099\u00d8\u00d9\u009d\"\u00efD\u0018\u000b\u00a8rIE\u008f\u00d2\u0010\u00920\u001c\u00b6\u00c1\u0081\u00d3\u00e3D\u00db\u00916\u00ef\u00b0Co\u00f8w\u00f3\u009e\u00fd\u001b\u0018C\u00a8\u008coA_Z\u0092\u001e\u00d8T-\u00cd\u00b0n\u00d4\u00e1\u00b8\u00ac%\u0010\u00e3\u000bL(*\u00cc\u0084\u00ae\u00133M\u00b2\u0007c\u00de\u0083\u0004\u0014\u0084v\u0087\u00ce1*s\u008f\u001c\u0084\u00d5I*\u00d3$\u00f5\u00e4\u001d\u001anA\u009c\u00eb1\u009e\u00ed\u0010\u00bc\u00f3h;@m\u00aa,v'\u0084\u001d\u008aA\u00fa\u00e6H(NTt,y\\m\u00c3!'\u00d8!\u00e8&\u00a5\u009e:\u00c7\u00bf\u0081X\u0018^\u00cb\u00eb\u0096\u001erK\u00eb\u00c20\u00e3\u00ed\u00d4w\u00b5\u00cbc\u00b9k\u00e6A\u008c\u008d\u0080\u00b4\\\u0015\u00f8\u00b1+\u0012~\n\u00026z\u00c1\t\u0011\u00f1B\u0019\u001aN\u00d6\u00e8t\u00de\u00a5@\u000f\u00e3\u0019\u00e8\u00ec%\u0081\u00a75\b%9\u0091\u00caPy1\u00f7\u00edf\u009f\u00eeZ\u00a2\u0016R\u00f2\u009c\u0092\u00edT\u00b6^\u00be\u00b8\u009f\u00b7\u0099k\u0017\u00cdS\u00d8<`a\u00bd*\u0086\u00c6\u00fe\u00c5\u00068{\u0093h\u00c6\u00d8]\u0081\u0084\u00da\u00e0@Y\u00a9\u00be>\b\u00cd\u00a9\f\u008f'Xz\u001d\u00e5\u00d8I\u0091\u0081\u009b\u00b5\u00b7\u001f-\u00af\u00f1\u00cfy\u00e1\u00efB\u00ce\u00c8\u00bf\u00fcz\u0081\u00b5<\u009b\u00f3\u00ad9b\u00d9\u001f\u000f\u00cf\u00a6\u00e5\u0080\u00a1}=\u00aa\u00a4s\u0000\u00ebX\u00f6K\u001e7\n\u0018Q\u001d\u00a7a\u0002\u00e3\u00f5o\u0090B\u00c0Q#u\u00861h\u00ea\b\u00c9_iX\u0095 \u0090\u00ef\u00d1\u009e<\u008fW\u00e0e\u00d3C\u0014\u00a5Pg\u00bf&\u00b3\u00d3\u0011\u00eaQ\u00cfl\u0015F\u00b0\u00b1E#\u00f2\u008b@\u0082I((|\b?\u0086\u0094\u001e\u00bb\u001c\u0003\u00e5\u00c3o\u00a3\u0095Dm#\u0099\u0017\u00b3VC\u00e2x\u00f8\u001b[k\u00b20\u00ea\u00e8J\u008cA\u00b2\u000bO10\u00941[d\u00cc\u00e2\u00ea\u00c5\u00b4m<\u0002\u00fa\b\u001fV@\u00d6\u00b0\u00d6(\u00ed\u0017\u001a\u00d0`\u008b\u00f0L\u0092OF\u00a6\u00aa9\"C\u001b\u00b8b8\t\u00da\u008cR@\u00ef\u0084\u008e(1\u0091q|\u00d2p\u0083dN\u00a6!\u00183\u0084y$\u00cf\u00ceI\u00c3\u008a\f\u00d7\u008e\u0091LH\u00e88\u0002\u00b3\u00a1\u00ee\u009a\u0004~\u0010\u00dc\u0097\u00bc+\u00928EZ\\\u0094\u0016\u00f6\u00c7Y\u00a2\u00c0\u0010\u0087\u00ac\u0002\u00b9\u00b8?^X\u00abzJ\u001e\u00bci}4\u0010\u000e.\u00a7n&<~\u0016v\u00d2\u00ec5\u00e7\u00c1\f\u00d48K\u00fc/N\u00e2\u00b6\u008f\u00c4\u00be\u00ad\u00ba\u00ed\u000f\u00fa\u00dev\u00ac\u0018\u00d7nm\u00eb\u00a2\u00d0\u00fa-\u00ac\u008a)\u00d2aho\u0001\u0010C\u00ef\u00c8\u00b0\u0081\u00ec\u000e\u00bf\u00a5]\bG0Or\u0084\u00fb\u00c6\u0007\u0091\u0096\u0010\u00b9V\u00d6G\u009dF\u000e]\b\u00fe<e8lY\u00b9 \u00cbOX\u00c5\\#t\u00d6\u00ab#\u0010\u00ee\u00e74\u00c9t\u00cc\u0005E0\u001b\u0007&\u00f5t@\u001e5\u00ac+3\u001e\u0018cr\u00ec2\u0013\u00df\u00ff\u001a\u0087Q\u008f\u00bdJ\u00e9\u00b2\u00cb\u0082\u0094\u00c3\u0083\u008d\u00c1\u00a0\u00d3(\u00e8[%\u00ef\u00c2\u00d5=\u009b\u0092A\u0016X\u00ec\u00bc\f:\u00db40K4\u00b6]\u001a\u00e9\u00fa\u00d1\u00d84\u00bdd\u000f\u008b\u0096\u008f\u00ce\u0003\u000b}\u00a2@\u00bbk\u0086\u0083\u00c3\u00ff!\u00c1\u001e\u001eU\u0002\u00f3L\u00df\u00c7\u0084\u0005\u00bb\u00c6^\u0002\u009f\u00e4\u00f9\u0016\u00fd\u0081\u0082\u0085\u00e0>\u00f4\u00e5/Z\u009dQf\u00e1!\u0088\u000el`M\u00b3\u00e2#_\u00ca\u0099\u0080+6\\\u00eb\u0016Y\u00f3\u00af\u0091\u0002\u00e8 \u0083\u00cfxU\u00b6\u00c7\u00c3\u00b9\u00bc\u00edb\u00b0ko3\u00e6\u0097\u008eg\u000f\u00f5?.7X\u0096\u009a\u00beF\u00ba\u00a4= B\u00a3\u00e2\u00d6\u00dbx\u00a65\u0090\u00b3\u0014\u007f\u0084G\u00a7\u00e5\u00e25EN\b\u00d9\u000bd\u0086\u0083[.\u00cfP\u00f0\u00c5(\u001b\u001e\u00b2\u00f5\u00ec\u0003.rU\u009d\u0014\u0089\u00b5A/\u0003\u0094} \u0005\u009a\u0080Y\u00c6\u00e0m7\u008e\u00ef\u000f\u0091'\u001fcA\u00c5\u00ca\u00ce\u00fce\u0018,N\u00af/\u000f]E\u0083\u0097\u00f5C\u007f\u00c2]\u000b\u0000\u001bV\u00ea=\u0016J\u00022\u0018\u00f1\u000e\u0006Fd\u00a6\u00e2\"VDH\u00d6\u001e\u0082\u00c2\u008f\u0095\u0006\u00f6\r\u00a8\u001fJx".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = fe.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00a1l\u000en\u0087\u009a\u00fa\u00d5\u00ad\u00a3i\u00ea[\u00069\u00b7\u008c\u0002\u00f8\u00e3\u00b7\u0081\u00e9|\u0086\u0082\u00df\u0098\u0086\u0098w\u00ce\u00e7\u00c78?h\u00a3\u00aeQu\u00a7\u0011\u00ec\u008a\u0004\u00b5\u00b4\u00f9\u00ba\u00c8\u0080\u00c4\u00d1\u0086\u00952\u0081u\u00d3\u00e2\u0081N*\u00af\u008eR\u009d\u0094z\u0005\u009d(\u008bI\u00d5\u0016\u00b4\u001ey\u00a0\f\u0094\u00ed\u009c\u0081\u00f7\u00c9\u0086&\u0083\u00ae\u0083:\u00d5\u00fc\u00fe\u0089\u00c9\u0014\u0001}2\u00a1U'2\u001a\u00f8=DD\u00a0";
                            var19_6 = "\u00a1l\u000en\u0087\u009a\u00fa\u00d5\u00ad\u00a3i\u00ea[\u00069\u00b7\u008c\u0002\u00f8\u00e3\u00b7\u0081\u00e9|\u0086\u0082\u00df\u0098\u0086\u0098w\u00ce\u00e7\u00c78?h\u00a3\u00aeQu\u00a7\u0011\u00ec\u008a\u0004\u00b5\u00b4\u00f9\u00ba\u00c8\u0080\u00c4\u00d1\u0086\u00952\u0081u\u00d3\u00e2\u0081N*\u00af\u008eR\u009d\u0094z\u0005\u009d(\u008bI\u00d5\u0016\u00b4\u001ey\u00a0\f\u0094\u00ed\u009c\u0081\u00f7\u00c9\u0086&\u0083\u00ae\u0083:\u00d5\u00fc\u00fe\u0089\u00c9\u0014\u0001}2\u00a1U'2\u001a\u00f8=DD\u00a0".length();
                            var16_7 = 72;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = fe.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                fe.b = var20_3;
                fe.c = new String[29];
                fe.h = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = ",P\u0097\u0082\u0088\u00c4\u0005\u00af\u000e\u00e6\nm\u008a\u00e2\u00170";
                var5_15 = ",P\u0097\u0082\u0088\u00c4\u0005\u00af\u000e\u00e6\nm\u008a\u00e2\u00170".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        fe.f = var6_12;
        fe.g = new Integer[2];
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7333;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/fe", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            fe.c[n11] = fe.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = fe.a(n10, l10);
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
            throw new RuntimeException("com/zelix/fe" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x368F;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/fe", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fe.g[n11] = n12;
        }
        return g[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = fe.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/fe" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fe.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(fe.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

