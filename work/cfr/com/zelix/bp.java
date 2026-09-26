/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.kx;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.xl;
import java.io.DataOutputStream;
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

public class bp
extends kx
implements ni {
    private final xl[] F;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    @Override
    public void W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        int n11 = (Integer)objectArray[2];
        HashMap hashMap = (HashMap)objectArray[3];
        HashMap hashMap2 = (HashMap)objectArray[4];
    }

    @Override
    void z(gu gu2, long l10) {
        block6: {
            bp bp2;
            CallSite callSite;
            long l11;
            block5: {
                long l12 = l10;
                l11 = l12 ^ 0x6DE1DADD9981L;
                long l13 = l12 ^ 0x6DE1DADD9981L;
                CallSite callSite2 = m44.a("h", (long)6170399952317654249L, (long)l10);
                this.b.e(l13, gu2, this, this.H());
                callSite = callSite2;
                try {
                    try {
                        bp2 = this;
                        if (callSite == false) break block5;
                        if (m44.a("v", (Object)bp2, (long)5544088189886891558L, (long)l10) == false) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)5242048403138877337L, (long)l10);
                    }
                    bp2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)5242048403138877337L, (long)l10);
                }
            }
            for (CallSite callSite3 : m44.a("v", (Object)bp2, (long)6210703513456955906L, (long)l10)) {
                m44.a("w", (Object)callSite3, (long)l11, (Object)gu2, (Object)this, (Object)this.H(), (long)5994452879398371859L, (long)l10);
                if (callSite != false) continue;
            }
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
                var5_4 = var3_2 ^ 0L;
                v0 = m44.a("i", (long)1272493964096652623L, (long)var3_2);
                v1 = new Object[2];
                v1[1] = var2_3;
                v1[0] = var5_4;
                super.c(v1);
                var7_5 = v0;
                try {
                    try {
                        v2 = this;
                        if (var7_5 != false) break block14;
                        if (m44.a("w", (Object)v2, (long)1198408428474194551L, (long)var3_2) != false) {
                        }
                        ** GOTO lbl48
                    }
                    catch (n9 v3) {
                        throw m44.a("i", (Object)v3, (long)1508261637018307528L, (long)var3_2);
                    }
                    var2_3.writeShort(((CallSite)m44.a("w", (Object)this, (long)748104657522593363L, (long)var3_2)).length);
                    v2 = this;
                }
                catch (n9 v4) {
                    throw m44.a("i", (Object)v4, (long)1508261637018307528L, (long)var3_2);
                }
            }
            var8_6 = m44.a("w", (Object)v2, (long)748104657522593363L, (long)var3_2);
            var9_7 = ((CallSite)var8_6).length;
            var10_8 = 0;
            block8: while (var10_8 < var9_7) {
                var11_9 = var8_6[var10_8];
                try {
                    var2_3.writeShort(var11_9.E());
                    ++var10_8;
                    do {
                        v5 = var7_5;
                        if (var3_2 >= 0L) {
                            if (v5 != false) break block15;
                            v5 = var7_5;
                        }
                        if (v5 == false) continue block8;
                    } while (var3_2 < 0L);
                    break;
                }
                catch (n9 v6) {
                    throw m44.a("i", (Object)v6, (long)1508261637018307528L, (long)var3_2);
                }
            }
            try {
                if (var3_2 < 0L || var7_5 == false) break block15;
lbl48:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var3_2));
            }
            catch (n9 v7) {
                throw m44.a("i", (Object)v7, (long)1508261637018307528L, (long)var3_2);
            }
        }
    }

    /*
     * Exception decompiling
     */
    bp(_4 var1_1, int var2_2, String var3_3, h1 var4_4, l6q var5_5, long var6_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 29[DOLOOP]
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
    @Override
    public void N(Object[] var1_1) {
        block15: {
            block14: {
                var2_2 = (DataOutputStream)var1_1[0];
                var6_3 = (Map)var1_1[1];
                var3_4 = (Long)var1_1[2];
                var5_5 = (lqu)var1_1[3];
                var7_6 = var3_4 ^ 62442288127650L;
                v0 = m44.a("k", (long)1680553024964027930L, (long)var3_4);
                v1 = new Object[2];
                v1[1] = var2_2;
                v1[0] = var7_6;
                super.c(v1);
                var9_7 = v0;
                try {
                    try {
                        v2 = this;
                        if (var9_7 == false) break block14;
                        if (m44.a("u", (Object)v2, (long)1009829788873835733L, (long)var3_4) != false) {
                        }
                        ** GOTO lbl50
                    }
                    catch (n9 v3) {
                        throw m44.a("k", (Object)v3, (long)742059563367552362L, (long)var3_4);
                    }
                    var2_2.writeShort(((CallSite)m44.a("u", (Object)this, (long)1496309923432370417L, (long)var3_4)).length);
                    v2 = this;
                }
                catch (n9 v4) {
                    throw m44.a("k", (Object)v4, (long)742059563367552362L, (long)var3_4);
                }
            }
            var10_8 = m44.a("u", (Object)v2, (long)1496309923432370417L, (long)var3_4);
            var11_9 = ((CallSite)var10_8).length;
            var12_10 = 0;
            block8: while (var12_10 < var11_9) {
                var13_11 = var10_8[var12_10];
                try {
                    var2_2.writeShort(var13_11.E());
                    ++var12_10;
                    do {
                        v5 = var9_7;
                        if (var3_4 > 0L) {
                            if (v5 == false) break block15;
                            v5 = var9_7;
                        }
                        if (v5 != false) continue block8;
                    } while (var3_4 < 0L);
                    break;
                }
                catch (n9 v6) {
                    throw m44.a("k", (Object)v6, (long)742059563367552362L, (long)var3_4);
                }
            }
            try {
                if (var3_4 < 0L || var9_7 != false) break block15;
lbl50:
                // 2 sources

                var2_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var3_4));
            }
            catch (n9 v7) {
                throw m44.a("k", (Object)v7, (long)742059563367552362L, (long)var3_4);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                bp.a = prr.a(6052307050413571575L, 1137380884055777169L, MethodHandles.lookup().lookupClass()).a(13311590161386L);
                bp.g = new HashMap<K, V>(13);
                var0 = bp.a ^ 9972728133990L;
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
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "\u008e\u0084\u00ddJ\u00bd\u009b\u00f8p\u00aa\u00e4\u00a2\u00b3\u0089\u00a2\u001evS\u00e1^W\u00ac\u00a1|\u00ee\u00d6X\u00e4h* \u0000X'\u0088\u00f9\b\u00ea\u001b\u00c0\u0095HlX\u00c6\u00d94\u00a9}\u00a15\nP\u008f\u00c22w\\\u00e2\u0085\u0012\u0089\u00cd\u0083\u00e0bca\u00e0\u00ce4Q{\u00ff\u00d9\u0017 \u00ea\u00f8\u00bb\u001d\u00a3\u00b0\u0002\u00e1\u0017\u008b\u0084\u00a8\u0084{zPU`\u00b8\u00e4\u0010LS\u00d2%\u0099\u00ad\u0080$\u00fbQ\"\u001b[a\u00f0\u0092@L4\u00d8\u00a4\u008c\u000b\u00fe}Z\u00d8Z\u00d9\u00dfS\u009e\u0097$\u0007\u0005b\u00d9~\u00feb\t_kt\u00bd\u0082\u0091\u00e3 \u00fc(\u0086\u00c3{\u0007\u00e4\u0007\u00cf\u008a\u008f\u008e\u00ce^\u0084\u00cbM\u00a4\u0019\u00ff\u00b5~\u00a9\t\bB\u00f0\u009eS\u0005G\u0010(u\u00aa\u00ed\u00c8\u00e6\u0007\u00c0l\u008d-\u00dc\u00db$l\u00c48}V\u00be;\u00d4\u00ee\u0081\u00f0\u00ee*\u0002\u00a7\u00cb\u00ad\u008a7mSP(Q\u00e8\u00e2 \u00dc\u00e6?S\u00e6[\u0097\u001c\u00f5W\u0003N\u00de\b5~\u0084m\u0093\u00c3\u0083\\.s\u00912\u00ec\u000b\u00d4z\u00f1\u00ab8\u008f\u00fa.\u00a6\u0000\u00ca\u00c3\u0088n\u00fc\u0019s.v\u008a\u0082\u00b4\u0082\u00dc\u00e7\u0092-\u009a\u008b\u00cew\u001e/%t\u00cb\u0010G\u00ce\u00cb\u00c6{3\u00b8\u00de,\u0088W \u007f\u0005M\\\u00eax\u00da\u00fb\u0006@e\n";
                var8_6 = "\u008e\u0084\u00ddJ\u00bd\u009b\u00f8p\u00aa\u00e4\u00a2\u00b3\u0089\u00a2\u001evS\u00e1^W\u00ac\u00a1|\u00ee\u00d6X\u00e4h* \u0000X'\u0088\u00f9\b\u00ea\u001b\u00c0\u0095HlX\u00c6\u00d94\u00a9}\u00a15\nP\u008f\u00c22w\\\u00e2\u0085\u0012\u0089\u00cd\u0083\u00e0bca\u00e0\u00ce4Q{\u00ff\u00d9\u0017 \u00ea\u00f8\u00bb\u001d\u00a3\u00b0\u0002\u00e1\u0017\u008b\u0084\u00a8\u0084{zPU`\u00b8\u00e4\u0010LS\u00d2%\u0099\u00ad\u0080$\u00fbQ\"\u001b[a\u00f0\u0092@L4\u00d8\u00a4\u008c\u000b\u00fe}Z\u00d8Z\u00d9\u00dfS\u009e\u0097$\u0007\u0005b\u00d9~\u00feb\t_kt\u00bd\u0082\u0091\u00e3 \u00fc(\u0086\u00c3{\u0007\u00e4\u0007\u00cf\u008a\u008f\u008e\u00ce^\u0084\u00cbM\u00a4\u0019\u00ff\u00b5~\u00a9\t\bB\u00f0\u009eS\u0005G\u0010(u\u00aa\u00ed\u00c8\u00e6\u0007\u00c0l\u008d-\u00dc\u00db$l\u00c48}V\u00be;\u00d4\u00ee\u0081\u00f0\u00ee*\u0002\u00a7\u00cb\u00ad\u008a7mSP(Q\u00e8\u00e2 \u00dc\u00e6?S\u00e6[\u0097\u001c\u00f5W\u0003N\u00de\b5~\u0084m\u0093\u00c3\u0083\\.s\u00912\u00ec\u000b\u00d4z\u00f1\u00ab8\u008f\u00fa.\u00a6\u0000\u00ca\u00c3\u0088n\u00fc\u0019s.v\u008a\u0082\u00b4\u0082\u00dc\u00e7\u0092-\u009a\u008b\u00cew\u001e/%t\u00cb\u0010G\u00ce\u00cb\u00c6{3\u00b8\u00de,\u0088W \u007f\u0005M\\\u00eax\u00da\u00fb\u0006@e\n".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = bp.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u001ac\u00e3\f)O\u0011:\u008bP\u00d8\u00b9\u0000\u0013!\u00ce@\u00d5\u00ff\u00ad\u00aeC|\u00cc\u0082\u00a4\u0083.]p\u00bd_\u008f&\u00d1\u009dE\u001f\u00bfk$?qb\u00d9\u00c9\u00e8\u00ee,\u0018\u00cc\u00d3c\u009f\u0087;\f,\u00acR\u0096ra\u008a\u00e1\u00af\u008f)\u00ea\u00ba\u00b2\u0005 \"\u001a\u00f69\u009ba\u00e7|";
                    var8_6 = "\u001ac\u00e3\f)O\u0011:\u008bP\u00d8\u00b9\u0000\u0013!\u00ce@\u00d5\u00ff\u00ad\u00aeC|\u00cc\u0082\u00a4\u0083.]p\u00bd_\u008f&\u00d1\u009dE\u001f\u00bfk$?qb\u00d9\u00c9\u00e8\u00ee,\u0018\u00cc\u00d3c\u009f\u0087;\f,\u00acR\u0096ra\u008a\u00e1\u00af\u008f)\u00ea\u00ba\u00b2\u0005 \"\u001a\u00f69\u009ba\u00e7|".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = bp.c(var10_9).intern();
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
        bp.c = var9_3;
        bp.d = new String[8];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x632B;
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
                throw new RuntimeException("com/zelix/bp", exception);
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
            bp.d[n11] = bp.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = bp.b(n10, l10);
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
            throw new RuntimeException("com/zelix/bp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bp.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

