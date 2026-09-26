/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ir;
import com.zelix.l7q;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lyt;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lt8
extends l7t
implements r5 {
    private ArrayList q;
    private ArrayList X;
    private static final long a;
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    public void o(Object[] objectArray) {
        lyt lyt2 = (lyt)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        ((ArrayList)((Object)m44.a("r", (Object)this, (long)-3345461630133653761L, (long)l10))).add(lyt2);
    }

    public lt8(int n10, short s10, char c10, int n11) {
        long l10 = ((long)s10 << 48 | (long)c10 << 48 >>> 16 | (long)n11 << 32 >>> 32) ^ a;
        long l11 = l10 ^ 0x4167B9542B23L;
        int n12 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n12, n10, l12);
        m44.a("s", (Object)this, new ArrayList(), (long)3723415119788906386L, (long)l10);
        m44.a("s", (Object)this, new ArrayList(), (long)3878087278069271228L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void M(Object[] objectArray) {
        lmu lmu2;
        long l10;
        long l11;
        long l12;
        long l13;
        long l14;
        block6: {
            lmu lmu3 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            l14 = (Long)objectArray[2];
            long l15 = l14;
            l13 = l15 ^ 0x42500E90B385L;
            l12 = l15 ^ 0x503060A74E69L;
            l11 = l15 ^ 0x7D9057BD72C4L;
            l10 = l15 ^ 0x670A30593866L;
            long l16 = l15 ^ 0x47526B4E5A06L;
            long l17 = l15 ^ 0L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l16;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l14);
            int n10 = 0;
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l14);
            block2: while (n10 < callSite) {
                try {
                    do {
                        if (l14 > 0L) {
                            lmu2 = this.V(n10);
                            if (callSite2 == false) break block6;
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l17;
                            objectArray3[1] = lqu2;
                            objectArray3[0] = this;
                            m44.a("w", (Object)lmu2, (Object)objectArray3, (long)-6656114929610942631L, (long)l14);
                            ++n10;
                        }
                        if (callSite2 != false) continue block2;
                    } while (l14 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-5177868666801382267L, (long)l14);
                }
            }
            lmu2 = lmu3;
        }
        l7q l7q2 = (l7q)lmu2;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l12;
        objectArray4[0] = ((ArrayList)((Object)m44.a("v", (Object)this, (long)-6485481996440479085L, (long)l14))).toArray(new lyt[((ArrayList)((Object)m44.a("v", (Object)this, (long)-6485481996440479085L, (long)l14))).size()]);
        m44.a("w", (Object)l7q2, (Object)objectArray4, (long)-6606636839438654798L, (long)l14);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l11;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l13;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = new ir(((ArrayList)((Object)m44.a("v", (Object)this, (long)-6664357697843329091L, (long)l14))).size(), (String)((Object)m44.a("w", (Object)this, (Object)objectArray5, (long)-6787853481097809299L, (long)l14)), (Pattern)((Object)m44.a("i", (Object)this, (Object)objectArray6, (long)-6844893272263847591L, (long)l14)));
        objectArray7[0] = l10;
        m44.a("w", (Object)l7q2, (Object)objectArray7, (long)-4876827090073005414L, (long)l14);
    }

    @Override
    public void r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        ((ArrayList)((Object)m44.a("q", (Object)this, (long)-7803591736132978806L, (long)l10))).add(string);
    }

    public String C(Object[] objectArray) {
        StringBuffer stringBuffer;
        block8: {
            long l10;
            block9: {
                l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("m", (long)6425422016847383059L, (long)l10);
                stringBuffer = new StringBuffer();
                m44.a("r", (Object)stringBuffer, (char)lt8.b("d", (int)8159, (long)(0x17897365CCFC8739L ^ l10)), (long)6680298979842306809L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    if (callSite2 != false) break block8;
                    if (m44.a("s", (Object)this, (long)6622029072933355480L, (long)l10) == null) break block9;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)n92, (long)4630226264794686688L, (long)l10);
                }
                int n10 = ((ArrayList)((Object)m44.a("s", (Object)this, (long)6622029072933355480L, (long)l10))).size();
                int n11 = 0;
                block4: while (n11 < n10) {
                    String string = (String)((ArrayList)((Object)m44.a("s", (Object)this, (long)6622029072933355480L, (long)l10))).get(n11);
                    try {
                        stringBuffer.append(string);
                        ++n11;
                        do {
                            CallSite callSite3 = callSite2;
                            if (l10 > 0L) {
                                if (callSite3 != false) break block8;
                                callSite3 = callSite2;
                            }
                            if (callSite3 == false) continue block4;
                        } while (l10 < 0L);
                        break;
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)n93, (long)4630226264794686688L, (long)l10);
                    }
                }
            }
            m44.a("r", (Object)stringBuffer, (char)lt8.b("d", (int)23982, (long)(0x185EF3ED286CC549L ^ l10)), (long)6680298979842306809L, (long)l10);
        }
        return stringBuffer.toString();
    }

    /*
     * Exception decompiling
     */
    public static String V(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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

    private Pattern I(Object[] objectArray) {
        String string;
        long l10;
        block19: {
            Object object;
            l10 = (Long)objectArray[0];
            long l11 = (l10 = a ^ l10) ^ 0x51C94426A607L;
            CallSite callSite = m44.a("l", (long)-9210744984878645014L, (long)l10);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)((Object)lt8.a("h", (int)13967, (long)(0x67E230018D80B353L ^ l10))));
            Iterator iterator = ((ArrayList)((Object)m44.a("r", (Object)this, (long)-7302846714288947559L, (long)l10))).iterator();
            CallSite callSite2 = callSite;
            block16: while (iterator.hasNext()) {
                object = iterator.next();
                do {
                    Object object2;
                    block24: {
                        block25: {
                            String string2;
                            block20: {
                                string2 = (String)object;
                                try {
                                    block21: {
                                        try {
                                            block22: {
                                                block23: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    string = string2;
                                                                    if (callSite2 == false) break block19;
                                                                    object2 = string.equals("*");
                                                                    if (l10 < 0L || callSite2 == false) break block20;
                                                                }
                                                                catch (n9 n92) {
                                                                    throw m44.a("l", (Object)n92, (long)-9151066497980258911L, (long)l10);
                                                                }
                                                                if (l10 < 0L) break block20;
                                                                if (object2 == false) break block21;
                                                            }
                                                            catch (n9 n93) {
                                                                throw m44.a("l", (Object)n93, (long)-9151066497980258911L, (long)l10);
                                                            }
                                                            object2 = ((ArrayList)((Object)m44.a("r", (Object)this, (long)-7302846714288947559L, (long)l10))).size();
                                                            if (l10 <= 0L) break block22;
                                                            if (object2 != 1) break block23;
                                                        }
                                                        catch (n9 n94) {
                                                            throw m44.a("l", (Object)n94, (long)-9151066497980258911L, (long)l10);
                                                        }
                                                        stringBuilder.append((String)((Object)lt8.a("h", (int)25732, (long)(0x1083A5096FCE6159L ^ l10))));
                                                        object2 = callSite2;
                                                        if (l10 <= 0L) break block24;
                                                        if (object2 != 0) break block25;
                                                    }
                                                    catch (n9 n95) {
                                                        throw m44.a("l", (Object)n95, (long)-9151066497980258911L, (long)l10);
                                                    }
                                                }
                                                stringBuilder.append((String)((Object)lt8.a("h", (int)1558, (long)(0x22EFB86D8C1783CCL ^ l10))));
                                                object2 = callSite2;
                                            }
                                            if (l10 < 0L) break block24;
                                            if (object2 != 0) break block25;
                                        }
                                        catch (n9 n96) {
                                            throw m44.a("l", (Object)n96, (long)-9151066497980258911L, (long)l10);
                                        }
                                    }
                                    object2 = string2.equals("?");
                                }
                                catch (n9 n97) {
                                    throw m44.a("l", (Object)n97, (long)-9151066497980258911L, (long)l10);
                                }
                            }
                            try {
                                block26: {
                                    try {
                                        if (l10 >= 0L) {
                                            if (object2 == false) break block26;
                                            stringBuilder.append((String)((Object)lt8.a("h", (int)25205, (long)(0x190622229C567ABL ^ l10))));
                                            object2 = callSite2;
                                        }
                                        if (l10 < 0L) break block24;
                                        if (object2 != false) break block25;
                                    }
                                    catch (n9 n98) {
                                        throw m44.a("l", (Object)n98, (long)-9151066497980258911L, (long)l10);
                                    }
                                }
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l11;
                                objectArray2[0] = string2;
                                stringBuilder.append((String)((Object)m44.a("l", (Object)objectArray2, (long)-6993402928559933333L, (long)l10)));
                            }
                            catch (n9 n99) {
                                throw m44.a("l", (Object)n99, (long)-9151066497980258911L, (long)l10);
                            }
                        }
                        object2 = callSite2;
                    }
                    if (object2 != false) continue block16;
                    stringBuilder.append((String)((Object)lt8.a("h", (int)4161, (long)(0x71FBFECA75B89599L ^ l10))));
                    object = stringBuilder;
                } while (l10 < 0L);
            }
            string = ((StringBuilder)object).toString();
        }
        return m44.a("l", string, (long)-8940136938539684522L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        lt8.a = prr.a(-1811539657800774507L, -5308320496727089655L, MethodHandles.lookup().lookupClass()).a(208599716035168L);
                        lt8.e = new HashMap<K, V>(13);
                        var11 = lt8.a ^ 90390738042934L;
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
                        var20_3 = new String[7];
                        var18_4 = 0;
                        var17_5 = "\u009c\u0010\u00ec\u009b\u00f0Z\u00a8o\u009e||:\u00a3\u00fd\u00c3l\u0010'\u00ed2\u008e\u00a7&\u00b2\u00e1\u00cb\u00b4\u001a\u001cd\\^\u00ca0,\u00cb\u00a5m\u001du\u00bf\u00f71m\u0000*\u0001Yz\u0010\u00e0ay\\\u00f9\u00b1\u00aa\u00d8\u009f\u0080\\O0\u00d7\u0091\u00f5J\u00fdO\u0019\u008a\u0016\u00e7c\u00ed\u00d3\u0086\u00e2\u00ec\u00b0j\n\u0010\u0089\u0091m\u00b2UzL\u0019\u00afr\u00a7\u0085\u00d4\u009bXM\u0010\"\u000b3\u000e\u00fb\u0099\u00db\u00de\u0013P\"\u00e8\u000b\u00b11\u00a8";
                        var19_6 = "\u009c\u0010\u00ec\u009b\u00f0Z\u00a8o\u009e||:\u00a3\u00fd\u00c3l\u0010'\u00ed2\u008e\u00a7&\u00b2\u00e1\u00cb\u00b4\u001a\u001cd\\^\u00ca0,\u00cb\u00a5m\u001du\u00bf\u00f71m\u0000*\u0001Yz\u0010\u00e0ay\\\u00f9\u00b1\u00aa\u00d8\u009f\u0080\\O0\u00d7\u0091\u00f5J\u00fdO\u0019\u008a\u0016\u00e7c\u00ed\u00d3\u0086\u00e2\u00ec\u00b0j\n\u0010\u0089\u0091m\u00b2UzL\u0019\u00afr\u00a7\u0085\u00d4\u009bXM\u0010\"\u000b3\u000e\u00fb\u0099\u00db\u00de\u0013P\"\u00e8\u000b\u00b11\u00a8".length();
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
                            var20_3[var18_4++] = lt8.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u001e\u00ce\u00bb\u00ceBn\u00f1\u00c8\u0089g\u00f5\u00b8\u00b9K\u00ce\u00868'..\u00b4\u008a\u00b4|\u00c0\u00e4H\u00d3\u009e\u0094]\u0091\u00bf\u00ffi7p\u009e\u0004\u0097\u008b'\u00c3\u00b5\u00dd*\u000b9\u00f2\u00a2\u0019\u00b5$\u00f5\u00cc\u00f5\u00f7.\u00a6(\u00bdo\u0092\u00ec\u0002\u000b\u00a9\u00c5\u00e5\u00cb\u00fb\u009an";
                            var19_6 = "\u001e\u00ce\u00bb\u00ceBn\u00f1\u00c8\u0089g\u00f5\u00b8\u00b9K\u00ce\u00868'..\u00b4\u008a\u00b4|\u00c0\u00e4H\u00d3\u009e\u0094]\u0091\u00bf\u00ffi7p\u009e\u0004\u0097\u008b'\u00c3\u00b5\u00dd*\u000b9\u00f2\u00a2\u0019\u00b5$\u00f5\u00cc\u00f5\u00f7.\u00a6(\u00bdo\u0092\u00ec\u0002\u000b\u00a9\u00c5\u00e5\u00cb\u00fb\u009an".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = lt8.b(var21_9).intern();
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
                lt8.b = var20_3;
                lt8.d = new String[7];
                lt8.h = new HashMap<K, V>(13);
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
                var4_14 = "\u00ae\u00b6@\u00e5\u00b2\f\u009au\u008a,\u008b\u00df\u001a\u009f\u00f5\u0003";
                var5_15 = "\u00ae\u00b6@\u00e5\u00b2\f\u009au\u008a,\u008b\u00df\u001a\u009f\u00f5\u0003".length();
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
        lt8.f = var6_12;
        lt8.g = new Integer[2];
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x96F;
        if (d[n11] == null) {
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
                throw new RuntimeException("com/zelix/lt8", exception);
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
            lt8.d[n11] = lt8.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lt8.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lt8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5515;
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
                throw new RuntimeException("com/zelix/lt8", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lt8.g[n11] = n12;
        }
        return g[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lt8.b(n10, l10);
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
            throw new RuntimeException("com/zelix/lt8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lt8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lt8.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

