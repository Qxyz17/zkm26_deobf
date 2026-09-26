/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix._v;
import com.zelix.d0;
import com.zelix.h5;
import com.zelix.lke;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.s0;
import com.zelix.sh;
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

public class n4 {
    lke Y;
    final Set u;
    private final sh N;
    final HashMap g;
    private Set l;
    final Set n;
    Set b;
    private final HashMap F;
    Set E;
    private d0 p;
    private final _f[] R;
    private final _v[] Z;
    final h5 e;
    private boolean q;
    final Map m;
    private final s0 G;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map f;

    /*
     * Exception decompiling
     */
    private void I(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
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
     * Exception decompiling
     */
    void R(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [54[DOLOOP], 53[WHILELOOP]], but top level block is 19[TRYBLOCK]
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

    boolean W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("p", (Object)this, (long)-9123849994759212176L, (long)l10);
    }

    n4(h5 h52, lke lke2, boolean bl2, sh sh2, _f[] _fArray, _v[] _vArray, s0 s02, long l10, HashMap hashMap, HashMap hashMap2) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x94974FF76F2L;
        long l13 = l11 ^ 0x831DCC42008L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        this.n = m44.a("m", (Object)objectArray, (long)-2677738918897278123L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        this.u = m44.a("m", (Object)objectArray2, (long)-2677738918897278123L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        this.m = m44.a("m", (Object)objectArray3, (long)-4292900411188797298L, (long)l10);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l12;
        m44.a("q", (Object)this, (Set)((Object)m44.a("m", (Object)objectArray4, (long)-2677738918897278123L, (long)l10)), (long)-2310922593450012176L, (long)l10);
        this.R = _fArray;
        this.Z = _vArray;
        m44.a("q", (Object)this, (lke)lke2, (long)-2379329076046111114L, (long)l10);
        m44.a("q", (Object)this, (boolean)bl2, (long)-2753166756773090341L, (long)l10);
        this.G = s02;
        this.N = sh2;
        this.e = h52;
        this.g = hashMap;
        this.F = hashMap2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                n4.a = prr.a(-3825770859524271214L, 3658221768319056098L, MethodHandles.lookup().lookupClass()).a(65385061780722L);
                n4.f = new HashMap<K, V>(13);
                var0 = n4.a ^ 91593085252655L;
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
                var9_3 = new String[12];
                var7_4 = 0;
                var6_5 = "l\u0086O\u00f6\u00ad\u008d\u009a\u0089\u00a9\u0012Y\u00afh\u00e4n\u0098PpA\u00d5?\u00a3\u00ae\u001bX(\r\u00b2do$[\u00ec\u00bdjrv\u00b1,\u00e2\u00fe\u00e0\u00d7N\u0010\u0098\u0087\u00e1\u00a2(\u00a0\u008bb\u00e0I\u00baE\u00d8\u00c9\u008b\u0011\u0094cf\u0092\u00b1\u00df\u0005\u0012`\u00e2\u00ee\u00f5s\u0082\u00e1\u009b\u0018\u00bd\u0082\u00d8\u00c4f\u00b1\u00f6\u00bf\u0003T\u00ac\u00d7\u00de\u0003\u00a3\u00ab\u0017\\\u00ab@c\u00cc\u00d0UF\u0000\u00adA\u0004S\u00b0.w|\u0001\u0087\u00ee\u00a1\u00de\u00efh\u00ca*K\u00e1CJ\u001a\u00b8\u00dd/\u0012\u008e_h\u0083\u0082\u00f1\u001b\u00b7\u0004\u00b2\u00d9M\u00a1\u00988QH\u00a2\u00a1\u00c1\u00cb\u00ae\u00d3b\u00c4oVL[\u00ee\u00e0Q\u0010\u00c3jl\u00d6k\u00ee|\u001c\u0083\u00062\u00a9\u00b8\u0097\u0096\u00c48C=D\u00a4\u00a1\u00b2\u000bg\u00b4\u00b0\u00d3I\u00f9/K\u0018\u008c\u00fb\u00f7(:\u0005l\u00c8\u00a2tt\"|/o\u00c0\u00078-L\u00d6\u00ed1\\\u00a5`\u00ebY\u00c5\u0092\u0010\u0091u\u00fe\u0005\f\u00d8\u009c\u00dcr($\u00b0\u0007\\\u001e\u00b5\u00faYFDu\u00ad\u008eQ\u0088\u00ec\u00a9\u00ef\u000f\u0083\u0098\u0080\u00ef\u0080\u00c4z\u00d0\u00e4\u00c5hsb\u00c1\u0010\u009eh_\u00ae~\u0091\u00a0\u00ef\u0004\u00d9\u0013\u00bd\u00ce\u00e5\u00f4>\u000fu\u00fd&\u0010\u00f6c\u00d3D\r\u0083\u00a5\u008e\r\u00e9I\\\u00b5_\u00fe\u00d1\u0087\u008a=f\u0003,\u00cfa\u00e7\u00945:|C#\u001cg^\u0014\u00d0\u0004\u00e7\u0002A\u00b9\f\u00c6\u0095/\u00a9\u00acf\u00c0\u008c\u00ca\u00b0u@`\u0094;\u0001\u009c\u00f3\u00a3r\u00df\u00fc\u00bfV\u00d3Kt\u00c4\u00d6\u00a90\u00e8k\u00fa\u00f3n\"\u00f4\u00eb\u001cK\u00f8\u00bb\u00b9?y\u00d4\u00c9R\u00fc\u008e2\u00f1\u00db\u00e1\u001c\u00bd#\u00d6=\u00cch\u00ef\u0005f\u0004\u00d8m\u0017\u00ec\u0098\u001a\fZ\u00a6\u00b1\u008eE\u00ca\u001ay\u00a2S\u00a9\u00e4\u0096\u0093\u00d8a\u00c2\u0001\u0014\u0085\u00c4\u0080}Z\u0006\u00ed\u0088\u0001\u008e\u00f2\u00be\u0018\\6\u00c1\u001e\u00b4,\u00eeV \u000e\u00da(YHn\u00e4\u0014\u00f7\u00e5\u009c\t\u001b\u00e8\u008f\u0010\u000e~\u00b9\u0011\u0005X\u00d1\u00d4\u00ac\u00de\u00c1\u00c2LI\u00e8\u0012X*4\u00b58mIe|\u00b9\u00efV\u00fa\u000eR\u001c\u00b0\u0006\\\u00b9\u0016\u0004c\u00ca\u00de\u00f0\u0094\u00a8<\u00d8~\u0083\u00ff\u00158\u0015~J\u00bf\u00b1i}\u00bf\u00e9\u00c0\u00ac\u00c0_L\u0093v\u00ed\b-?\u00bb\u00b6\u00f8Xb4\u0092\u00f0\u0016\u0090\u0018\u008b\u00e2\u00ecG\u00e2\u00a4\u00dd\u0002[>\u001d\u00e6r%\u0091(\u00b0\u0086~U \u00cec";
                var8_6 = "l\u0086O\u00f6\u00ad\u008d\u009a\u0089\u00a9\u0012Y\u00afh\u00e4n\u0098PpA\u00d5?\u00a3\u00ae\u001bX(\r\u00b2do$[\u00ec\u00bdjrv\u00b1,\u00e2\u00fe\u00e0\u00d7N\u0010\u0098\u0087\u00e1\u00a2(\u00a0\u008bb\u00e0I\u00baE\u00d8\u00c9\u008b\u0011\u0094cf\u0092\u00b1\u00df\u0005\u0012`\u00e2\u00ee\u00f5s\u0082\u00e1\u009b\u0018\u00bd\u0082\u00d8\u00c4f\u00b1\u00f6\u00bf\u0003T\u00ac\u00d7\u00de\u0003\u00a3\u00ab\u0017\\\u00ab@c\u00cc\u00d0UF\u0000\u00adA\u0004S\u00b0.w|\u0001\u0087\u00ee\u00a1\u00de\u00efh\u00ca*K\u00e1CJ\u001a\u00b8\u00dd/\u0012\u008e_h\u0083\u0082\u00f1\u001b\u00b7\u0004\u00b2\u00d9M\u00a1\u00988QH\u00a2\u00a1\u00c1\u00cb\u00ae\u00d3b\u00c4oVL[\u00ee\u00e0Q\u0010\u00c3jl\u00d6k\u00ee|\u001c\u0083\u00062\u00a9\u00b8\u0097\u0096\u00c48C=D\u00a4\u00a1\u00b2\u000bg\u00b4\u00b0\u00d3I\u00f9/K\u0018\u008c\u00fb\u00f7(:\u0005l\u00c8\u00a2tt\"|/o\u00c0\u00078-L\u00d6\u00ed1\\\u00a5`\u00ebY\u00c5\u0092\u0010\u0091u\u00fe\u0005\f\u00d8\u009c\u00dcr($\u00b0\u0007\\\u001e\u00b5\u00faYFDu\u00ad\u008eQ\u0088\u00ec\u00a9\u00ef\u000f\u0083\u0098\u0080\u00ef\u0080\u00c4z\u00d0\u00e4\u00c5hsb\u00c1\u0010\u009eh_\u00ae~\u0091\u00a0\u00ef\u0004\u00d9\u0013\u00bd\u00ce\u00e5\u00f4>\u000fu\u00fd&\u0010\u00f6c\u00d3D\r\u0083\u00a5\u008e\r\u00e9I\\\u00b5_\u00fe\u00d1\u0087\u008a=f\u0003,\u00cfa\u00e7\u00945:|C#\u001cg^\u0014\u00d0\u0004\u00e7\u0002A\u00b9\f\u00c6\u0095/\u00a9\u00acf\u00c0\u008c\u00ca\u00b0u@`\u0094;\u0001\u009c\u00f3\u00a3r\u00df\u00fc\u00bfV\u00d3Kt\u00c4\u00d6\u00a90\u00e8k\u00fa\u00f3n\"\u00f4\u00eb\u001cK\u00f8\u00bb\u00b9?y\u00d4\u00c9R\u00fc\u008e2\u00f1\u00db\u00e1\u001c\u00bd#\u00d6=\u00cch\u00ef\u0005f\u0004\u00d8m\u0017\u00ec\u0098\u001a\fZ\u00a6\u00b1\u008eE\u00ca\u001ay\u00a2S\u00a9\u00e4\u0096\u0093\u00d8a\u00c2\u0001\u0014\u0085\u00c4\u0080}Z\u0006\u00ed\u0088\u0001\u008e\u00f2\u00be\u0018\\6\u00c1\u001e\u00b4,\u00eeV \u000e\u00da(YHn\u00e4\u0014\u00f7\u00e5\u009c\t\u001b\u00e8\u008f\u0010\u000e~\u00b9\u0011\u0005X\u00d1\u00d4\u00ac\u00de\u00c1\u00c2LI\u00e8\u0012X*4\u00b58mIe|\u00b9\u00efV\u00fa\u000eR\u001c\u00b0\u0006\\\u00b9\u0016\u0004c\u00ca\u00de\u00f0\u0094\u00a8<\u00d8~\u0083\u00ff\u00158\u0015~J\u00bf\u00b1i}\u00bf\u00e9\u00c0\u00ac\u00c0_L\u0093v\u00ed\b-?\u00bb\u00b6\u00f8Xb4\u0092\u00f0\u0016\u0090\u0018\u008b\u00e2\u00ecG\u00e2\u00a4\u00dd\u0002[>\u001d\u00e6r%\u0091(\u00b0\u0086~U \u00cec".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = n4.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "s\u00d0\u00df\u00a36\u00cc\u0003\t\u00bc\u00e2K\u00fc\u0080S\b\u0011\u00c0`\u0098.>\u00ca\u00f4\u0019h\u00b2\u00e7\u00e36\u00c3\u00f8\u00c5(\u0001_Q\u00ae\u00ba6z\u0007{=\u00fdd,\u00cf\n'\u00ddP\u00d5\u00ef\u00fe\u00169<\u00f9\u00ae\u00d1|\u00a5\u00dcZm\u00f0\u0017:\u0082(bL\n";
                    var8_6 = "s\u00d0\u00df\u00a36\u00cc\u0003\t\u00bc\u00e2K\u00fc\u0080S\b\u0011\u00c0`\u0098.>\u00ca\u00f4\u0019h\u00b2\u00e7\u00e36\u00c3\u00f8\u00c5(\u0001_Q\u00ae\u00ba6z\u0007{=\u00fdd,\u00cf\n'\u00ddP\u00d5\u00ef\u00fe\u00169<\u00f9\u00ae\u00d1|\u00a5\u00dcZm\u00f0\u0017:\u0082(bL\n".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = n4.a(var10_9).intern();
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
        n4.c = var9_3;
        n4.d = new String[12];
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0xA61;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/n4", exception);
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
            n4.d[n11] = n4.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = n4.a(n10, l10);
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
            throw new RuntimeException("com/zelix/n4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(n4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

