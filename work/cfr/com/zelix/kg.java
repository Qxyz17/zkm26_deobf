/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.e4;
import com.zelix.eo;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.x8;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kg
extends kw
implements eo {
    private jf[] O;
    private int m;
    private static final long a = prr.a(470484526258641764L, 473308856055843375L, MethodHandles.lookup().lookupClass()).a(96345661815032L);
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    kg(x8 x82, jf[] jfArray, int n10, int n11) {
        long l10 = ((long)n10 << 32 | (long)n11 << 32 >>> 32) ^ a;
        super(null, x82, jfArray.length * 2 + 2);
        m44.a("p", (Object)this, (int)jfArray.length, (long)-9177934777185060909L, (long)l10);
        m44.a("p", (Object)this, (jf[])jfArray, (long)-8877074051619807785L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    void z(gu var1_1, long var2_2) {
        v0 = var2_2;
        var4_3 = v0 ^ 113240848016893L;
        var6_4 = v0 ^ 120816807025025L;
        v1 = m44.a("h", (long)5618762033536375070L, (long)var2_2);
        var1_1.K(this.b, this, var4_3, this);
        var9_5 = 0;
        var8_6 = v1;
        while (var9_5 < ((CallSite)m44.a("v", (Object)this, (long)5294610036777144419L, (long)var2_2)).length) {
            m44.a("v", (Object)this, (long)5294610036777144419L, (long)var2_2)[var9_5].e(var6_4, var1_1, this, this);
            ++var9_5;
lbl14:
            // 2 sources

            ** while (var8_6 != false)
lbl15:
            // 1 sources

        }
lbl16:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl14
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void c(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (DataOutputStream)var1_1[1];
        var5_4 = var2_2 ^ 0L;
        v0 = m44.a("i", (long)1272493964096652623L, (long)var2_2);
        v1 = new Object[2];
        v1[1] = var4_3;
        v1[0] = var5_4;
        super.c(v1);
        var4_3.writeShort((int)m44.a("w", (Object)this, (long)1244136792191313462L, (long)var2_2));
        var7_5 = v0;
        var8_6 = 0;
        while (var8_6 < m44.a("w", (Object)this, (long)1244136792191313462L, (long)var2_2)) {
            var4_3.writeShort(m44.a("w", (Object)this, (long)1525364639074716722L, (long)var2_2)[var8_6].E());
            ++var8_6;
lbl18:
            // 2 sources

            ** while (var7_5 != false)
lbl19:
            // 1 sources

        }
lbl20:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl18
    }

    kg(long l10, _4 _42, int n10, String string, h1 h12, l6q l6q2, l6q l6q3) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0xF3E448FE041L;
        long l13 = l11 ^ 0xF5E8D8768BBL;
        long l14 = l11 ^ 0x43A7C5C4043FL;
        long l15 = l11 ^ 0x23F16F866178L;
        super(_42, n10, string, l13, h12, l6q2);
        m44.a("s", (Object)this, (int)h12.readUnsignedShort(), (long)1718806370099699880L, (long)l10);
        CallSite callSite = m44.a("o", (long)1112068340150533670L, (long)l10);
        m44.a("s", (Object)this, (jf[])new jf[m44.a("q", (Object)this, (long)1718806370099699880L, (long)l10)], (long)1420126563357919916L, (long)l10);
        int n11 = 0;
        CallSite callSite2 = callSite;
        while (n11 < m44.a("q", (Object)this, (long)1718806370099699880L, (long)l10)) {
            CallSite callSite3;
            block5: {
                block6: {
                    js js2;
                    block7: {
                        int n12 = h12.readUnsignedShort();
                        js2 = this.m(l14, n12);
                        try {
                            try {
                                callSite3 = callSite2;
                                if (l10 <= 0L) break block5;
                                if (callSite3 == false) break block6;
                                if (js2 instanceof jf) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)n92, (long)711721067775773233L, (long)l10);
                            }
                            throw new aw(this.h(l12) + (String)((Object)kg.b("b", (int)14539, (long)(0x404A01BA7EABF7FBL ^ l10))) + (String)((Object)kg.b("b", (int)26070, (long)(0x53FB27ABE55BAAE7L ^ l10))));
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)n93, (long)711721067775773233L, (long)l10);
                        }
                    }
                    m44.a("q", (Object)this, (long)1420126563357919916L, (long)l10)[n11] = (jf)js2;
                    l6q3.t(m44.a("q", (Object)this, (long)1420126563357919916L, (long)l10)[n11], this, l15);
                    ++n11;
                }
                callSite3 = callSite2;
            }
            if (callSite3 != false) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void N(Object[] var1_1) {
        var2_2 = (DataOutputStream)var1_1[0];
        var6_3 = (Map)var1_1[1];
        var3_4 = (Long)var1_1[2];
        var5_5 = (lqu)var1_1[3];
        var7_6 = var3_4 ^ 0L;
        v0 = m44.a("k", (long)1680553024964027930L, (long)var3_4);
        v1 = new Object[4];
        v1[3] = var5_5;
        v1[2] = var7_6;
        v1[1] = var6_3;
        v1[0] = var2_2;
        super.N(v1);
        var9_7 = v0;
        var2_2.writeShort((int)m44.a("u", (Object)this, (long)1145663733124151444L, (long)var3_4));
        var10_8 = 0;
        while (var10_8 < m44.a("u", (Object)this, (long)1145663733124151444L, (long)var3_4)) {
            block10: {
                block11: {
                    block9: {
                        var11_9 = (js)var6_3.get(m44.a("u", (Object)this, (long)831221740072506000L, (long)var3_4)[var10_8]);
                        try {
                            try {
                                v2 = var9_7;
                                if (var3_4 <= 0L) ** GOTO lbl38
                                if (v2 == false) break block9;
                                if (var11_9 != null) {
                                }
                                ** GOTO lbl40
                            }
                            catch (n9 v3) {
                                throw m44.a("k", (Object)v3, (long)1287133234089349645L, (long)var3_4);
                            }
                            var2_2.writeShort(var11_9.E());
                        }
                        catch (n9 v4) {
                            throw m44.a("k", (Object)v4, (long)1287133234089349645L, (long)var3_4);
                        }
                    }
                    try {
                        v2 = var9_7;
lbl38:
                        // 2 sources

                        if (var3_4 < 0L) break block10;
                        if (v2 != false) break block11;
lbl40:
                        // 2 sources

                        var2_2.writeShort(m44.a("u", (Object)this, (long)831221740072506000L, (long)var3_4)[var10_8].E());
                    }
                    catch (n9 v5) {
                        throw m44.a("k", (Object)v5, (long)1287133234089349645L, (long)var3_4);
                    }
                }
                ++var10_8;
                v2 = var9_7;
            }
            if (v2 != false) continue;
        }
    }

    int Q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("v", (Object)this, (long)-5929769474399593785L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void S(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 2[TRYBLOCK]
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
    Enumeration E(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (var2_2 = kg.a ^ var2_2) ^ 92464372460558L;
        var7_4 = new jf[((CallSite)m44.a("w", (Object)this, (long)6055950094809681170L, (long)var2_2)).length];
        var6_5 = m44.a("i", (long)5246868732893280664L, (long)var2_2);
        var8_6 = 0;
        while (var8_6 < ((CallSite)m44.a("w", (Object)this, (long)6055950094809681170L, (long)var2_2)).length) {
            var7_4[var8_6] = m44.a("w", (Object)this, (long)6055950094809681170L, (long)var2_2)[var8_6];
            ++var8_6;
lbl11:
            // 2 sources

            ** while (var6_5 == false)
lbl12:
            // 1 sources

        }
lbl13:
        // 2 sources

        if (var2_2 <= 0L) ** GOTO lbl11
        return new e4(var4_3, var7_4);
    }

    jf g(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return m44.a("w", (Object)this, (long)5238566603448766890L, (long)l10)[n10];
    }

    /*
     * Unable to fully structure code
     */
    public Enumeration Y(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = kg.a ^ var2_2;
        var4_3 = v0 ^ 31639945331613L;
        var6_4 = v0 ^ 140639383145625L;
        var9_5 = new String[((CallSite)m44.a("t", (Object)this, (long)-4929112445311573375L, (long)var2_2)).length];
        var8_6 = m44.a("j", (long)-6394030040873052661L, (long)var2_2);
        var10_7 = 0;
        while (var10_7 < ((CallSite)m44.a("t", (Object)this, (long)-4929112445311573375L, (long)var2_2)).length) {
            var9_5[var10_7] = m44.a("t", (Object)this, (long)-4929112445311573375L, (long)var2_2)[var10_7].g(var6_4);
            ++var10_7;
lbl13:
            // 2 sources

            ** while (var8_6 == false)
lbl14:
            // 1 sources

        }
lbl15:
        // 2 sources

        if (var2_2 <= 0L) ** GOTO lbl13
        return new e4(var4_3, var9_5);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l10 = a ^ 0x53B3F25E535DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n10 = 0;
        String string = "\u00f2xT\t\u0083J\u00f2\u00c0\u0082\u00fcL>\u00cf\u0013\u00d3`H\u009d*\u0006\u00b6b\u00c9\u0080\u00db\u00b2\u0002\u00e2U\u00f8`\u009eF\u0007#77\u00c5\u00fds\u00e0v\u0016N\u0089\u0003\u000bf\u00cc\u00fb\u009a*\u00d5\u00f0\u00a7\u00a9&<j]gK\u00c5}\u0094\u00af9\u00a5S\u00831\u007f\u001e2\u00bf\u00c0\u00d1\u00ce\u00c3u=\u00a2\u00a7\u00cb\u0016\u00e7;\u00df\u001f";
        int n11 = "\u00f2xT\t\u0083J\u00f2\u00c0\u0082\u00fcL>\u00cf\u0013\u00d3`H\u009d*\u0006\u00b6b\u00c9\u0080\u00db\u00b2\u0002\u00e2U\u00f8`\u009eF\u0007#77\u00c5\u00fds\u00e0v\u0016N\u0089\u0003\u000bf\u00cc\u00fb\u009a*\u00d5\u00f0\u00a7\u00a9&<j]gK\u00c5}\u0094\u00af9\u00a5S\u00831\u007f\u001e2\u00bf\u00c0\u00d1\u00ce\u00c3u=\u00a2\u00a7\u00cb\u0016\u00e7;\u00df\u001f".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = kg.c(byArray3).intern();
            if ((n13 += n12) >= n11) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5340;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/kg", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            kg.d[n11] = kg.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = kg.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/kg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(kg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

