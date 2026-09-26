/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._6;
import com.zelix._u;
import com.zelix.f8;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.hf;
import com.zelix.kx;
import com.zelix.l6q;
import com.zelix.l6z;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.sa;
import com.zelix.x8;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bo
extends kx
implements ni {
    private sa[] E;
    private static final long a = prr.a(-3576721022412417820L, 4710962158062983398L, MethodHandles.lookup().lookupClass()).a(148883396631740L);
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    public void s(Object[] objectArray) {
        block6: {
            bo bo2;
            CallSite callSite;
            long l10;
            long l11;
            block5: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = a ^ l11) ^ 0x39FA8A39D46EL;
                callSite = m44.a("h", (long)-4014528555063527167L, (long)l11);
                try {
                    try {
                        bo2 = this;
                        if (callSite == false) break block5;
                        if (m44.a("v", (Object)bo2, (long)-3379771985195689010L, (long)l11) == false) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-2932627977385610278L, (long)l11);
                    }
                    bo2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-2932627977385610278L, (long)l11);
                }
            }
            for (CallSite callSite2 : m44.a("v", (Object)bo2, (long)-3859580167184468495L, (long)l11)) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l10;
                m44.a("w", (Object)callSite2, (Object)objectArray2, (long)-3674416324305028875L, (long)l11);
                if (callSite != false) continue;
            }
        }
    }

    @Override
    void z(gu gu2, long l10) {
        long l11 = l10;
        long l12 = l11 ^ 0x66FDF08525FDL;
        long l13 = l11 ^ 0L;
        CallSite callSite = m44.a("h", (long)5618762033536375070L, (long)l10);
        gu2.K(this.b, this, l12, this.H());
        CallSite callSite2 = callSite;
        for (CallSite callSite3 : m44.a("v", (Object)this, (long)6311840874744391705L, (long)l10)) {
            m44.a("w", (Object)callSite3, (Object)gu2, (long)l13, (long)6157663015356180091L, (long)l10);
            if (callSite2 == false) continue;
        }
    }

    public void B(Object[] objectArray) {
        block6: {
            bo bo2;
            CallSite callSite;
            long l10;
            lqu lqu2;
            long l11;
            l6z l6z2;
            _6 _62;
            _u _u2;
            block5: {
                _u2 = (_u)objectArray[0];
                _62 = (_6)objectArray[1];
                l6z2 = (l6z)objectArray[2];
                l11 = (Long)objectArray[3];
                lqu2 = (lqu)objectArray[4];
                l10 = (l11 = a ^ l11) ^ 0x286D0D10F7F4L;
                callSite = m44.a("k", (long)1228035829776015426L, (long)l11);
                try {
                    try {
                        bo2 = this;
                        if (callSite == false) break block5;
                        if (m44.a("u", (Object)bo2, (long)602348553513124493L, (long)l11) == false) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)1012867896613284505L, (long)l11);
                    }
                    bo2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)1012867896613284505L, (long)l11);
                }
            }
            for (CallSite callSite2 : m44.a("u", (Object)bo2, (long)1383554863183785138L, (long)l11)) {
                Object[] objectArray2 = new Object[5];
                objectArray2[4] = lqu2;
                objectArray2[3] = l6z2;
                objectArray2[2] = _62;
                objectArray2[1] = _u2;
                objectArray2[0] = l10;
                m44.a("t", (Object)callSite2, (Object)objectArray2, (long)972864537557244481L, (long)l11);
                if (callSite != false) continue;
            }
        }
    }

    public void Q(Object[] objectArray) {
        block6: {
            bo bo2;
            CallSite callSite;
            long l10;
            long l11;
            block5: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = a ^ l11) ^ 0x4CD88CC14C45L;
                callSite = m44.a("j", (long)-5565443981048495221L, (long)l11);
                try {
                    try {
                        bo2 = this;
                        if (callSite == false) break block5;
                        if (m44.a("t", (Object)bo2, (long)-6083599028705402556L, (long)l11) == false) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-5924727445850912432L, (long)l11);
                    }
                    bo2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-5924727445850912432L, (long)l11);
                }
            }
            for (CallSite callSite2 : m44.a("t", (Object)bo2, (long)-5694219080755458181L, (long)l11)) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l10;
                m44.a("u", (Object)callSite2, (Object)objectArray2, (long)-5497201721026278745L, (long)l11);
                if (callSite != false) continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public bo(_4 var1_1, int var2_2, String var3_3, h1 var4_4, long var5_5, l6q var7_6, l6q var8_7, f8 var9_8, PrintWriter var10_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [21[DOLOOP]], but top level block is 2[TRYBLOCK]
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

    @Override
    public void q(x8 x82, long l10, x8 x83) {
        long l11 = l10;
        long l12 = l11 ^ 0L;
        long l13 = l11 ^ 0L;
        super.q(x82, l13, x83);
        CallSite callSite = m44.a("p", (Object)this, (long)-5377836210650232097L, (long)l10);
        CallSite callSite2 = m44.a("n", (long)-5818679388199650344L, (long)l10);
        for (CallSite callSite3 : callSite) {
            m44.a("q", (Object)callSite3, (Object)x82, (long)l12, (Object)x83, (long)-6102695480830743733L, (long)l10);
            if (callSite2 == false) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void c(Object[] var1_1) {
        block15: {
            block14: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (DataOutputStream)var1_1[1];
                v0 = var3_2;
                var5_4 = v0 ^ 0L;
                var7_5 = v0 ^ 114414899878189L;
                v1 = m44.a("i", (long)716282175763740856L, (long)var3_2);
                v2 = new Object[2];
                v2[1] = var2_3;
                v2[0] = var5_4;
                super.c(v2);
                var9_6 = v1;
                try {
                    try {
                        v3 = this;
                        if (var9_6 == false) break block14;
                        if (m44.a("w", (Object)v3, (long)1198408428474194551L, (long)var3_2) != false) {
                        }
                        ** GOTO lbl54
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)1653963665845465699L, (long)var3_2);
                    }
                    var2_3.writeShort(((CallSite)m44.a("w", (Object)this, (long)849277203714831432L, (long)var3_2)).length);
                    v3 = this;
                }
                catch (n9 v5) {
                    throw m44.a("i", (Object)v5, (long)1653963665845465699L, (long)var3_2);
                }
            }
            var10_7 = m44.a("w", (Object)v3, (long)849277203714831432L, (long)var3_2);
            var11_8 = ((CallSite)var10_7).length;
            var12_9 = 0;
            block8: while (var12_9 < var11_8) {
                var13_10 = var10_7[var12_9];
                try {
                    v6 = new Object[2];
                    v6[1] = var2_3;
                    v6[0] = var7_5;
                    m44.a("v", (Object)var13_10, (Object)v6, (long)1087789839368241751L, (long)var3_2);
                    ++var12_9;
                    do {
                        v7 = var9_6;
                        if (var3_2 >= 0L) {
                            if (v7 == false) break block15;
                            v7 = var9_6;
                        }
                        if (v7 != false) continue block8;
                    } while (var3_2 <= 0L);
                    break;
                }
                catch (n9 v8) {
                    throw m44.a("i", (Object)v8, (long)1653963665845465699L, (long)var3_2);
                }
            }
            try {
                if (var3_2 <= 0L || var9_6 != false) break block15;
lbl54:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var3_2));
            }
            catch (n9 v9) {
                throw m44.a("i", (Object)v9, (long)1653963665845465699L, (long)var3_2);
            }
        }
    }

    public void q(Object[] objectArray) {
        block6: {
            bo bo2;
            CallSite callSite;
            long l10;
            long l11;
            block5: {
                l11 = (Long)objectArray[0];
                l10 = (l11 = a ^ l11) ^ 0x757179CC0435L;
                callSite = m44.a("m", (long)-8001605062228524013L, (long)l11);
                try {
                    try {
                        bo2 = this;
                        if (callSite != false) break block5;
                        if (m44.a("s", (Object)bo2, (long)-7926966401852482773L, (long)l11) == false) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-7518663768814472385L, (long)l11);
                    }
                    bo2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-7518663768814472385L, (long)l11);
                }
            }
            for (CallSite callSite2 : m44.a("s", (Object)bo2, (long)-8460745212674968300L, (long)l11)) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l10;
                m44.a("r", (Object)callSite2, (Object)objectArray2, (long)-8280202387524446285L, (long)l11);
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void N(Object[] var1_1) {
        block15: {
            block14: {
                var6_2 = (DataOutputStream)var1_1[0];
                var2_3 = (Map)var1_1[1];
                var4_4 = (Long)var1_1[2];
                var3_5 = (lqu)var1_1[3];
                v0 = var4_4;
                var7_6 = v0 ^ 62442288127650L;
                var9_7 = v0 ^ 41248768431158L;
                v1 = m44.a("k", (long)1680553024964027930L, (long)var4_4);
                v2 = new Object[2];
                v2[1] = var6_2;
                v2[0] = var7_6;
                super.c(v2);
                var11_8 = v1;
                try {
                    try {
                        v3 = this;
                        if (var11_8 == false) break block14;
                        if (m44.a("u", (Object)v3, (long)1009829788873835733L, (long)var4_4) != false) {
                        }
                        ** GOTO lbl58
                    }
                    catch (n9 v4) {
                        throw m44.a("k", (Object)v4, (long)600729149807013057L, (long)var4_4);
                    }
                    var6_2.writeShort(((CallSite)m44.a("u", (Object)this, (long)1543333720447347434L, (long)var4_4)).length);
                    v3 = this;
                }
                catch (n9 v5) {
                    throw m44.a("k", (Object)v5, (long)600729149807013057L, (long)var4_4);
                }
            }
            var12_9 = m44.a("u", (Object)v3, (long)1543333720447347434L, (long)var4_4);
            var13_10 = ((CallSite)var12_9).length;
            var14_11 = 0;
            block8: while (var14_11 < var13_10) {
                var15_12 = var12_9[var14_11];
                try {
                    v6 = new Object[4];
                    v6[3] = var3_5;
                    v6[2] = var2_3;
                    v6[1] = var6_2;
                    v6[0] = var9_7;
                    m44.a("t", (Object)var15_12, (Object)v6, (long)799490087685503260L, (long)var4_4);
                    ++var14_11;
                    do {
                        v7 = var11_8;
                        if (var4_4 >= 0L) {
                            if (v7 == false) break block15;
                            v7 = var11_8;
                        }
                        if (v7 != false) continue block8;
                    } while (var4_4 <= 0L);
                    break;
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)600729149807013057L, (long)var4_4);
                }
            }
            try {
                if (var4_4 <= 0L || var11_8 != false) break block15;
lbl58:
                // 2 sources

                var6_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var4_4));
            }
            catch (n9 v9) {
                throw m44.a("k", (Object)v9, (long)600729149807013057L, (long)var4_4);
            }
        }
    }

    public void v(Object[] objectArray) {
        block6: {
            bo bo2;
            CallSite callSite;
            long l10;
            HashSet hashSet;
            HashSet hashSet2;
            long l11;
            HashSet hashSet3;
            HashSet hashSet4;
            block5: {
                hashSet4 = (HashSet)objectArray[0];
                hashSet3 = (HashSet)objectArray[1];
                l11 = (Long)objectArray[2];
                hashSet2 = (HashSet)objectArray[3];
                hashSet = (HashSet)objectArray[4];
                l10 = (l11 = a ^ l11) ^ 0x3BF477DD036L;
                callSite = m44.a("j", (long)622583262816590916L, (long)l11);
                try {
                    try {
                        bo2 = this;
                        if (callSite != false) break block5;
                        if (m44.a("t", (Object)bo2, (long)696519402154083196L, (long)l11) == false) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)1152672575241399144L, (long)l11);
                    }
                    bo2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)1152672575241399144L, (long)l11);
                }
            }
            for (CallSite callSite2 : m44.a("t", (Object)bo2, (long)1351695290465545539L, (long)l11)) {
                Object[] objectArray2 = new Object[5];
                objectArray2[4] = hashSet;
                objectArray2[3] = hashSet2;
                objectArray2[2] = hashSet3;
                objectArray2[1] = hashSet4;
                objectArray2[0] = l10;
                m44.a("u", (Object)callSite2, (Object)objectArray2, (long)1298491253097994408L, (long)l11);
                if (callSite == false) continue;
            }
        }
    }

    @Override
    void W(Object[] objectArray) {
        block6: {
            bo bo2;
            CallSite callSite;
            long l10;
            HashMap hashMap;
            HashMap hashMap2;
            int n10;
            int n11;
            long l11;
            block5: {
                l11 = (Long)objectArray[0];
                n11 = (Integer)objectArray[1];
                n10 = (Integer)objectArray[2];
                hashMap2 = (HashMap)objectArray[3];
                hashMap = (HashMap)objectArray[4];
                l10 = l11 ^ 0x7BA7DC0C371CL;
                callSite = m44.a("n", (long)7658353343727016719L, (long)l11);
                try {
                    try {
                        bo2 = this;
                        if (callSite == false) break block5;
                        if (m44.a("p", (Object)bo2, (long)8293039031803492800L, (long)l11) == false) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)8449700829120582100L, (long)l11);
                    }
                    bo2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)8449700829120582100L, (long)l11);
                }
            }
            for (CallSite callSite2 : m44.a("p", (Object)bo2, (long)7529574441497597951L, (long)l11)) {
                Object[] objectArray2 = new Object[5];
                objectArray2[4] = hashMap;
                objectArray2[3] = hashMap2;
                objectArray2[2] = n10;
                objectArray2[1] = l10;
                objectArray2[0] = n11;
                m44.a("q", (Object)callSite2, (Object)objectArray2, (long)7536543497312256546L, (long)l11);
                if (callSite != false) continue;
            }
        }
    }

    public void L(Object[] objectArray) {
        block6: {
            bo bo2;
            CallSite callSite;
            long l10;
            PrintWriter printWriter;
            long l11;
            lqu lqu2;
            hf hf2;
            block5: {
                hf2 = (hf)objectArray[0];
                lqu2 = (lqu)objectArray[1];
                l11 = (Long)objectArray[2];
                printWriter = (PrintWriter)objectArray[3];
                l10 = (l11 = a ^ l11) ^ 0x5057E0395778L;
                callSite = m44.a("n", (long)-3028786871508172528L, (long)l11);
                try {
                    try {
                        bo2 = this;
                        if (callSite != false) break block5;
                        if (m44.a("p", (Object)bo2, (long)-3098825113502147032L, (long)l11) == false) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-3266420522091284932L, (long)l11);
                    }
                    bo2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-3266420522091284932L, (long)l11);
                }
            }
            for (CallSite callSite2 : m44.a("p", (Object)bo2, (long)-3488488734906732521L, (long)l11)) {
                Object[] objectArray2 = new Object[4];
                objectArray2[3] = printWriter;
                objectArray2[2] = l10;
                objectArray2[1] = lqu2;
                objectArray2[0] = hf2;
                m44.a("q", (Object)callSite2, (Object)objectArray2, (long)-3183904851816553261L, (long)l11);
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l10 = a ^ 0x5C3D18078695L;
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
        String[] stringArray = new String[3];
        int n10 = 0;
        String string = "|\u00far\u001a\u00f13W\u00e7SB\u00de\u00a1\u009c\u00ac\u00a3\u001d\u0010p\u00e4`\u00d9\u00c4(\u00cd=~k\u00afz\u00a7\u00c28@\u0010\u00fa\u008b\u008f\u0017\u00f1\u00cd\u00e6\u00eb\u0081!\u00ed\u00b9\u00b2O\u0003s";
        int n11 = "|\u00far\u001a\u00f13W\u00e7SB\u00de\u00a1\u009c\u00ac\u00a3\u001d\u0010p\u00e4`\u00d9\u00c4(\u00cd=~k\u00afz\u00a7\u00c28@\u0010\u00fa\u008b\u008f\u0017\u00f1\u00cd\u00e6\u00eb\u0081!\u00ed\u00b9\u00b2O\u0003s".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = bo.c(byArray3).intern();
            if ((n13 += n12) >= n11) {
                c = stringArray;
                d = new String[3];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3FF6;
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
                throw new RuntimeException("com/zelix/bo", exception);
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
            bo.d[n11] = bo.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = bo.b(n10, l10);
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
            throw new RuntimeException("com/zelix/bo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bo.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

