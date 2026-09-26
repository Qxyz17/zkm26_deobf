/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.br;
import com.zelix.cf;
import com.zelix.e_;
import com.zelix.ff;
import com.zelix.lbc;
import com.zelix.lqu;
import com.zelix.lug;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.qr;
import com.zelix.sh;
import com.zelix.t4;
import com.zelix.u2;
import com.zelix.u3;
import com.zelix.wa;
import com.zelix.wy;
import java.awt.Frame;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JFrame;

public class uq
implements ff {
    private sh p;
    private final qr o;
    private wa G;
    private final br U;
    private lqu n;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    void y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x77C2284241CDL;
        long l4 = l2 ^ 0x25E3BDD6541BL;
        long l5 = l2 ^ 0x4FA693E4E5ADL;
        long l6 = l2 ^ 0x5097D59EF9EAL;
        lug lug2 = new lug(this);
        CallSite callSite = null;
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            callSite = m44.a("s", (Object)m44.a("r", (Object)this, (long)-8130071337151976810L, (long)l), (Object)objectArray2, (long)-8241526981555513516L, (long)l);
        }
        catch (u3 u32) {
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l5;
            new lbc((Frame)((Object)m44.a("r", (Object)this, (long)-8130071337151976810L, (long)l)), (String)((Object)uq.a("u", (int)8916, (long)(0x4250DF1FAEE932C2L ^ l))), l3, (String)((Object)uq.a("u", (int)905, (long)(0x619B4A5956AD9397L ^ l))) + cf.a((String)((Object)m44.a("s", (Object)((Object)u32), (Object)objectArray3, (long)-7624887499685523083L, (long)l))) + (String)((Object)uq.a("u", (int)2417, (long)(0x53EC3BF5EDD31965L ^ l))));
        }
        catch (u2 u22) {
            new lbc((Frame)((Object)m44.a("r", (Object)this, (long)-8130071337151976810L, (long)l)), (String)((Object)uq.a("u", (int)31854, (long)(0x7F0CD9F35A0FEC7FL ^ l))), l3, (String)((Object)uq.a("u", (int)20999, (long)(0x4D9FFD9D3E23C21EL ^ l))) + (String)((Object)m44.a("s", (Object)((Object)u22), (long)-7857999672791520235L, (long)l)) + "'");
        }
        new t4((String)((Object)uq.a("u", (int)10273, (long)(0x56F95237D7E43833L ^ l))), (wa)m44.a("r", (Object)this, (long)-8130071337151976810L, (long)l), (List)((Object)callSite), (br)m44.a("r", (Object)this, (long)-8314794676562811772L, (long)l), l6, (sh)m44.a("r", (Object)this, (long)-7739288676217601620L, (long)l), (qr)m44.a("r", (Object)this, (long)-8418538652060909407L, (long)l), (lqu)m44.a("r", (Object)this, (long)-7791029433678991574L, (long)l), (e_)lug2);
    }

    void E(Object[] objectArray) {
        String string = (String)objectArray[0];
        wa wa2 = (wa)objectArray[1];
        qr qr2 = (qr)objectArray[2];
        e_ e_2 = (e_)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x150C6F534D59L;
        long l4 = l2 ^ 0x1C7968837819L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = uq.a("u", (int)54, (long)(0x22DB9E476C9893B5L ^ l));
        new wy(l4, string, (String)((Object)uq.a("u", (int)20997, (long)(0x4DC0E3655E27C18BL ^ l))), (String)((Object)m44.a("o", (Object)objectArray2, (long)701969088976343907L, (long)l)), (JFrame)wa2, qr2, e_2);
    }

    void Q(Object[] objectArray) {
        block5: {
            long l;
            long l2;
            e_ e_2;
            block4: {
                Integer n = (Integer)objectArray[0];
                e_2 = (e_)objectArray[1];
                l2 = (Long)objectArray[2];
                long l3 = l2 = a ^ l2;
                l = l3 ^ 0x6C6994DF6085L;
                long l4 = l3 ^ 0x61F0EA0EBCEAL;
                int n2 = n;
                CallSite callSite = m44.a("m", (long)7633631146287177472L, (long)l2);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (n2 != 1) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)8467525799547796112L, (long)l2);
                    }
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = uq.a("u", (int)31204, (long)(0x40F54193C3261611L ^ l2));
                    objectArray2[1] = m44.a("i", (long)7980639429358958845L, (long)l2);
                    objectArray2[0] = l4;
                    m44.a("r", (Object)m44.a("s", (Object)this, (long)8318881150855666541L, (long)l2), (Object)objectArray2, (long)8211036469896613832L, (long)l2);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)8467525799547796112L, (long)l2);
                }
            }
            Object[] objectArray3 = new Object[5];
            objectArray3[4] = l;
            objectArray3[3] = e_2;
            objectArray3[2] = m44.a("s", (Object)this, (long)8413330674816679752L, (long)l2);
            objectArray3[1] = m44.a("s", (Object)this, (long)8126005757325038975L, (long)l2);
            objectArray3[0] = uq.a("u", (int)26667, (long)(0x59AE9917B6BB07D5L ^ l2));
            m44.a("r", (Object)this, (Object)objectArray3, (long)8145511269129177123L, (long)l2);
        }
    }

    public void W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x7B654491E268L;
        m44.a("q", (Object)m44.a("p", (Object)this, (long)1129911827468134932L, (long)l), (boolean)true, (long)1362411382407995173L, (long)l);
        m44.a("q", (Object)m44.a("p", (Object)this, (long)1129911827468134932L, (long)l), (long)1059185692687295493L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = false;
        m44.a("q", (Object)m44.a("p", (Object)this, (long)1129911827468134932L, (long)l), (Object)objectArray2, (long)991292769123421075L, (long)l);
    }

    public uq(long l, wa wa2, sh sh2, lqu lqu2) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x6D505F1D0388L;
        long l4 = l2 ^ 0x94AF5917D9DL;
        this.o = new qr((String)((Object)m44.a("j", (long)-1131559579075402122L, (long)l)), (String)((Object)uq.a("u", (int)31722, (long)(0x614008FD576C8A9BL ^ l))));
        m44.a("r", (Object)this, (wa)wa2, (long)-1274986094021260300L, (long)l);
        m44.a("r", (Object)this, (sh)sh2, (long)-721987564630925106L, (long)l);
        m44.a("r", (Object)this, (lqu)lqu2, (long)-971988256176009656L, (long)l);
        m44.a("q", (Object)wa2, (boolean)false, (long)-934400328631288123L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = true;
        m44.a("q", (Object)wa2, (Object)objectArray, (long)-1431632650945222029L, (long)l);
        this.U = m44.a("n", (Object)m44.a("j", (long)-1131559579075402122L, (long)l), (Object)uq.a("u", (int)11671, (long)(0x9E69CFF8EA55CE0L ^ l)), (long)-765184133051999891L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        m44.a("q", (Object)this, (Object)objectArray2, (long)-1257313977187358424L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    void K(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (Long)var1_1[0];
                var5_3 = (qr)var1_1[1];
                var4_4 = (Integer)var1_1[2];
                v0 = var2_2 = uq.a ^ var2_2;
                var6_5 = v0 ^ 48824662930141L;
                var8_6 = v0 ^ 74236111106655L;
                var10_7 = v0 ^ 8099508939035L;
                var12_8 = v0 ^ 44933932596600L;
                var15_9 = var4_4;
                var14_10 = m44.a("n", (long)4051893801826930379L, (long)var2_2);
                try {
                    try {
                        m44.a("q", (Object)var5_3, (Object)m44.a("j", (long)4542937558348523830L, (long)var2_2), (Object)uq.a("u", (int)3190, (long)(5498761488080286283L ^ var2_2)), (long)4276768661627724888L, (long)var2_2);
                        if (var14_10 != null) break block8;
                        if (var15_9 == 1) {
                        }
                        ** GOTO lbl43
                    }
                    catch (n9 v1) {
                        throw m44.a("n", (Object)v1, (long)2614793951530330971L, (long)var2_2);
                    }
                    v2 = new Object[1];
                    v2[0] = var8_6;
                    m44.a("q", (Object)this, (Object)v2, (long)4510157389536813174L, (long)var2_2);
                    v3 = new Object[1];
                    v3[0] = var10_7;
                    v4 = new Object[5];
                    v4[4] = null;
                    v4[3] = var12_8;
                    v4[2] = m44.a("p", (Object)this, (long)4450375540723335432L, (long)var2_2);
                    v4[1] = var5_3;
                    v4[0] = m44.a("q", (Object)m44.a("p", (Object)this, (long)2502231935082793638L, (long)var2_2), (Object)v3, (long)2642798888840502981L, (long)var2_2);
                    m44.a("q", (Object)m44.a("p", (Object)this, (long)2381968564370080948L, (long)var2_2), (Object)v4, (long)2378909905494726072L, (long)var2_2);
                }
                catch (n9 v5) {
                    throw m44.a("n", (Object)v5, (long)2614793951530330971L, (long)var2_2);
                }
            }
            try {
                if (var2_2 <= 0L || var14_10 == null) break block9;
lbl43:
                // 2 sources

                v6 = new Object[1];
                v6[0] = var6_5;
                m44.a("q", (Object)this, (Object)v6, (long)2435667520388916840L, (long)var2_2);
            }
            catch (n9 v7) {
                throw m44.a("n", (Object)v7, (long)2614793951530330971L, (long)var2_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                uq.a = prr.a((long)6260187153664181602L, (long)-1099543630848220719L, MethodHandles.lookup().lookupClass()).a(280154309213017L);
                uq.d = new HashMap<K, V>(13);
                var0 = uq.a ^ 103941054079219L;
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
                var9_3 = new String[13];
                var7_4 = 0;
                var6_5 = "\u00ccP\u00e6\u00d6\u00c7\u00ec)\u00acR\\K\u00f6b\u00a1\u00f3I\u001e\u0087\u00f3\u00e0\u00fd\u00bcK\u00a0 m\u0099\raV\u00aa\u009aiQ\u00be\u00ce[#|![\n>\b\u00b3\u00e1gP[~\u0002v\u0006\u00ec\u0012R~@\u00bc\u00bd\u00d3\u0099\u0006=\u008c\u009c`\\\u00cb\u00ccT\u009d\u00da\u00e8AB\u00d9-\u00bd\u00dbL\u00c6%\u00e7\u00bf\u009e\u0015\r\b\u009d(\u00c4\\1\u00bd\u00ad\u00dfv\u0014\u000e\u00a1\u0014\u008d\\\n\u00bdG:\u009b\u0011T\u00f6\u0003\u00f9NG\u00f0\u00f3\u0091\u0016\u00cc\u00a2\u0018\u00e7>\u009b\u0004\u0019\u00a2N\u00c7[g\u00ae\u0095\u00b6\u00c1\u0017QF\u00cfva\u0006y\u00d1t \u008c\u00aa\u0080\"0?\u0005};S\u00b2\u00e9\u008e\u00aaG\u008b\u00cal\u0006\u00b9v\u00c9LL\u00bb\u008e\u001a\u00d9\u00bee\tf\u0018\u0013\u0095\u00dd\u00e9_\u00bf\u0018\u0004\u00dd{-\u00ff\u0086\u00c7\u00f3\u0087~\u00f05\u00c1\u00b09\"z \u001esK\u00b5\u00bd\u000b\u0093\u0003\u000b\u00bbnc\u0092\u00bf \u00a0RA\u0093,\u00e3\u0096\u00c0\u00da\u00d5A\u00d9\u00e4l=\u00aa\u00dd86%\u00bb\u001e\u00f44\u00dds\u00bd\u00fb\u00d1\u0005\u00fe#\u009d\u00af>\u0093\u0088\u0004G\u00c3S#\u00e1tj\u001d\u001d\u00fb\u00a4\u008c\u00d2\u0099\u00a7\u00e6\u0000W\u00b04\u000b%\u00fdf\u00c6\u008d\u0080\u0085;w\u00e6qa\u00d3#\u0089\u00109\u00ff\u00eb\"z\u0084H\u00d2\u0017\u00b6\u00e0\u00e3j\u00e6M}\u0018\u00f7\u0096\u00ab\u0001\u0092,\u00c9\u00fb.3\u0015\u00f5\u00d8\u00e2\u00db~\u00b8\u00d56\u008e\u00e0\u00ff\u0014\u008d \u00f0\u00dd\u00bf4\u0085`\u00cb>)\u0085\u00d5\u00af}\u0010\u00a2\u00f1\u0003\u00cdx\u0017\u001d\u00bek\u00be{\u00dc\u009bl!\u00f4\f\u00fd";
                var8_6 = "\u00ccP\u00e6\u00d6\u00c7\u00ec)\u00acR\\K\u00f6b\u00a1\u00f3I\u001e\u0087\u00f3\u00e0\u00fd\u00bcK\u00a0 m\u0099\raV\u00aa\u009aiQ\u00be\u00ce[#|![\n>\b\u00b3\u00e1gP[~\u0002v\u0006\u00ec\u0012R~@\u00bc\u00bd\u00d3\u0099\u0006=\u008c\u009c`\\\u00cb\u00ccT\u009d\u00da\u00e8AB\u00d9-\u00bd\u00dbL\u00c6%\u00e7\u00bf\u009e\u0015\r\b\u009d(\u00c4\\1\u00bd\u00ad\u00dfv\u0014\u000e\u00a1\u0014\u008d\\\n\u00bdG:\u009b\u0011T\u00f6\u0003\u00f9NG\u00f0\u00f3\u0091\u0016\u00cc\u00a2\u0018\u00e7>\u009b\u0004\u0019\u00a2N\u00c7[g\u00ae\u0095\u00b6\u00c1\u0017QF\u00cfva\u0006y\u00d1t \u008c\u00aa\u0080\"0?\u0005};S\u00b2\u00e9\u008e\u00aaG\u008b\u00cal\u0006\u00b9v\u00c9LL\u00bb\u008e\u001a\u00d9\u00bee\tf\u0018\u0013\u0095\u00dd\u00e9_\u00bf\u0018\u0004\u00dd{-\u00ff\u0086\u00c7\u00f3\u0087~\u00f05\u00c1\u00b09\"z \u001esK\u00b5\u00bd\u000b\u0093\u0003\u000b\u00bbnc\u0092\u00bf \u00a0RA\u0093,\u00e3\u0096\u00c0\u00da\u00d5A\u00d9\u00e4l=\u00aa\u00dd86%\u00bb\u001e\u00f44\u00dds\u00bd\u00fb\u00d1\u0005\u00fe#\u009d\u00af>\u0093\u0088\u0004G\u00c3S#\u00e1tj\u001d\u001d\u00fb\u00a4\u008c\u00d2\u0099\u00a7\u00e6\u0000W\u00b04\u000b%\u00fdf\u00c6\u008d\u0080\u0085;w\u00e6qa\u00d3#\u0089\u00109\u00ff\u00eb\"z\u0084H\u00d2\u0017\u00b6\u00e0\u00e3j\u00e6M}\u0018\u00f7\u0096\u00ab\u0001\u0092,\u00c9\u00fb.3\u0015\u00f5\u00d8\u00e2\u00db~\u00b8\u00d56\u008e\u00e0\u00ff\u0014\u008d \u00f0\u00dd\u00bf4\u0085`\u00cb>)\u0085\u00d5\u00af}\u0010\u00a2\u00f1\u0003\u00cdx\u0017\u001d\u00bek\u00be{\u00dc\u009bl!\u00f4\f\u00fd".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = uq.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u000fZq\u00061p\u0085gaa1Q\u0003\u00f42\u008a\u00a9\u0010\u00e0\u0001\u00aa\u00fc\u00f0}\u0084\u0089\u00fbvtf\u00e0:J\u0094\"\u009f\u00c5P\u00cf\u00d7\u0083\u00d1\u00e2eY\u00db2\u001c\u00f0\u009a\u00e1\u008d\u00e2{\u00c7\u00ac\u00862b\u00ac\u00a6;U\u009f\u00fa\u008ec\u00ca\u00b9\u00e3\u007f\u0095}Fi\u00a9m\u0089AP\u00beo\u00e7\u0015\u0003SJ\u009d\\Z0;\f\u00dd\u00f7R\u0004z9\u0010V\u00ea\u00f3\u00b6X\u0087\u0094M\u00f7\u000bhW\u0084<\u0015\u00ee\u00f5\u00ddP\u00f3\u00d0V\u0081\u00f6\u0016\u00fb\u0003\u00c8\u00b4\u00e3,\u00f4\u00e5@Kg'<\u0017\u00d6\u0006C\u00d6\u0093'z\u0082\u0091O\u0080\u00cb\u00a4\u009b\u0012\u00e0_\u00b9\u00f1\r\u00c29c\u00ff\u0087\u0083\u008d\u001ce\u00ec\u00f0\u00b7`\u008a#\u009a\u00c5\u00a2\u00ddG\u009a\u0083!\u009c\u0087\u008a\u00b7\u0003\u00c18\u00d28\u00a55";
                    var8_6 = "\u000fZq\u00061p\u0085gaa1Q\u0003\u00f42\u008a\u00a9\u0010\u00e0\u0001\u00aa\u00fc\u00f0}\u0084\u0089\u00fbvtf\u00e0:J\u0094\"\u009f\u00c5P\u00cf\u00d7\u0083\u00d1\u00e2eY\u00db2\u001c\u00f0\u009a\u00e1\u008d\u00e2{\u00c7\u00ac\u00862b\u00ac\u00a6;U\u009f\u00fa\u008ec\u00ca\u00b9\u00e3\u007f\u0095}Fi\u00a9m\u0089AP\u00beo\u00e7\u0015\u0003SJ\u009d\\Z0;\f\u00dd\u00f7R\u0004z9\u0010V\u00ea\u00f3\u00b6X\u0087\u0094M\u00f7\u000bhW\u0084<\u0015\u00ee\u00f5\u00ddP\u00f3\u00d0V\u0081\u00f6\u0016\u00fb\u0003\u00c8\u00b4\u00e3,\u00f4\u00e5@Kg'<\u0017\u00d6\u0006C\u00d6\u0093'z\u0082\u0091O\u0080\u00cb\u00a4\u009b\u0012\u00e0_\u00b9\u00f1\r\u00c29c\u00ff\u0087\u0083\u008d\u001ce\u00ec\u00f0\u00b7`\u008a#\u009a\u00c5\u00a2\u00ddG\u009a\u0083!\u009c\u0087\u008a\u00b7\u0003\u00c18\u00d28\u00a55".length();
                    var5_7 = 104;
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
                    var9_3[var7_4++] = uq.a(var10_9).intern();
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
        uq.b = var9_3;
        uq.c = new String[13];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xF86;
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
                throw new RuntimeException("com/zelix/uq", exception);
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
            uq.c[n2] = uq.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = uq.a(n, l);
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
            throw new RuntimeException("com/zelix/uq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(uq.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
