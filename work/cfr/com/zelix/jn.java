/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.j1;
import com.zelix.j9;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.lkh;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
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

public class jn
extends j1
implements lkh {
    final int j;
    final int P;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;

    /*
     * Exception decompiling
     */
    public j9 v(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 15[SWITCH]
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
    protected void O(DataOutputStream dataOutputStream, long l10) {
        dataOutputStream.writeByte((int)e);
        dataOutputStream.writeByte((int)m44.a("w", (Object)this, (long)-2268718579249156683L, (long)l10));
        dataOutputStream.writeShort((int)m44.a("w", (Object)this, (long)-56582270040052497L, (long)l10));
    }

    @Override
    public boolean G() {
        return true;
    }

    @Override
    public js i(l6q l6q2, l6q l6q3, l6q l6q4, l6q l6q5, long l10, PrintWriter printWriter) {
        long l11 = l10 ^ 0x38607A03F544L;
        Object[] objectArray = new Object[6];
        objectArray[5] = l11;
        objectArray[4] = printWriter;
        objectArray[3] = l6q5;
        objectArray[2] = l6q4;
        objectArray[1] = l6q3;
        objectArray[0] = l6q2;
        return m44.a("w", (Object)this, (Object)objectArray, (long)313962048335400051L, (long)l10);
    }

    public jn(int n10, h1 h12, to to2) {
        super(n10, to2);
        this.P = h12.readUnsignedByte();
        this.j = h12.readUnsignedShort();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    jn.a = prr.a(1001979486789470725L, -4361556773469200312L, MethodHandles.lookup().lookupClass()).a(137998632451621L);
                    jn.d = new HashMap<K, V>(13);
                    var5 = jn.a ^ 76323444337616L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[13];
                    var12_4 = 0;
                    var11_5 = "\u00bf\u0081S\u0084\u009c!\u00bf\u00aa\u0017Z\\\u00fb|\u0018\u0006\u00cb\u00d3Hm_\u00a7.%Z\u009d\u00c4tL\u001d\u00d1|\u001d\u00c3\u009a\u000b,|Q3m\u0085~\u00eb\u00ebZ\u00e5\u00c0#\u0084n\u00a0F\u007f\u00abt\u00aaT\u00f1\u00c6<D9\u0085#\u00108\u0099\u0003\u00b0\u00c2\u00a0^\u00af\u0004\u00e7\u00e9\u00a0IqI\u0015\u0010\u00b1\u0092N\u00b4\u00c1=s\u00b5\u00a8\u00b6\u00f1Z&\u00d1\u00e1#(-\u0015}\u00a7\u00c1\u00aaV&\u00bc\u00f2{\u00bai\u008c\u00ef\u009axq%\u00fa\u000f^\u00ce\u0080\u0088}L\u00f2\u008ds\u00a8\u0013\f\u0000tPQ|\u00ee\u0091\u0010\u00cd\u00f9'\u00ff\u00e4\u00berCBK\u0093\u00a5C\\kw8\u00c1\u0003O.\u000f \u00a3\u00a7\u00fc\u00f5\u00bd\u0016\u00fa$\u00c3\u00c0P\u008a\u00e8!\u00fcLQFpi\u007fKF\u009d\u00aa,>\u008dzy\u00b0\u00df\u0098\u00de\u0095\u00a6:\u00c8>\u008b\u0094\u00fd\f\u00a99\u00ec\u00e1z\u0005\u00038h\u00e5\u0082\u0018\u00e7S\u00cd\u0000\u00f1\u00a0\u00c7-\u000b\u00e3\u00e4\u00fb~\u00c03\u0019\u0091\"\u0080\u00b2\u00d1rg\u0086\u00a8*\u0002\u00c1l\u00b4\u00b4\u0002\u008a\u0086S8\u0012\u00a1\u00cb\u00bc\u00ae\u0096\u00d1$+0p\u0091\u00c2\u008e\u0099:(U\u00beM\u00c5vzu\u00ed8h\u0083\u00b3Bm\u0083\u00b1\u0002E0\u008c\u0018W\u00a6\u00e8\u00a2\u0096\u008a\u00c8{\u00e1V\u0086\u00c8:\u001a\u00a0Q5\u00e7(\u0010s\u00db\t\u00cf4\u00bf\u00e4E+\u001d\u00f7\u00b5\u00c7\u00f12\u00b9\u0010a\u00fc\u00bb0pIwa\u00cd\u008d\u00d8\u008cA\u00af\u008b\u009f8\u00edD\u001e`\u00f8\u00a2<t\u00be\u00a1\u0089\u0014B\u00bf\u00f5\u0083\u00e5\u001b\u008d0\u00dd\u0019D}\u00f6\u00ee\u0087\u00c5Q\u001a\u009a\u00d4A)\u00d2\u00ec\u00f9Y\u00fel\u0092\u0096H}44\u001c\u0001%\u00d3<\u0019\u00ff\u00f4\u00af\u00fe";
                    var13_6 = "\u00bf\u0081S\u0084\u009c!\u00bf\u00aa\u0017Z\\\u00fb|\u0018\u0006\u00cb\u00d3Hm_\u00a7.%Z\u009d\u00c4tL\u001d\u00d1|\u001d\u00c3\u009a\u000b,|Q3m\u0085~\u00eb\u00ebZ\u00e5\u00c0#\u0084n\u00a0F\u007f\u00abt\u00aaT\u00f1\u00c6<D9\u0085#\u00108\u0099\u0003\u00b0\u00c2\u00a0^\u00af\u0004\u00e7\u00e9\u00a0IqI\u0015\u0010\u00b1\u0092N\u00b4\u00c1=s\u00b5\u00a8\u00b6\u00f1Z&\u00d1\u00e1#(-\u0015}\u00a7\u00c1\u00aaV&\u00bc\u00f2{\u00bai\u008c\u00ef\u009axq%\u00fa\u000f^\u00ce\u0080\u0088}L\u00f2\u008ds\u00a8\u0013\f\u0000tPQ|\u00ee\u0091\u0010\u00cd\u00f9'\u00ff\u00e4\u00berCBK\u0093\u00a5C\\kw8\u00c1\u0003O.\u000f \u00a3\u00a7\u00fc\u00f5\u00bd\u0016\u00fa$\u00c3\u00c0P\u008a\u00e8!\u00fcLQFpi\u007fKF\u009d\u00aa,>\u008dzy\u00b0\u00df\u0098\u00de\u0095\u00a6:\u00c8>\u008b\u0094\u00fd\f\u00a99\u00ec\u00e1z\u0005\u00038h\u00e5\u0082\u0018\u00e7S\u00cd\u0000\u00f1\u00a0\u00c7-\u000b\u00e3\u00e4\u00fb~\u00c03\u0019\u0091\"\u0080\u00b2\u00d1rg\u0086\u00a8*\u0002\u00c1l\u00b4\u00b4\u0002\u008a\u0086S8\u0012\u00a1\u00cb\u00bc\u00ae\u0096\u00d1$+0p\u0091\u00c2\u008e\u0099:(U\u00beM\u00c5vzu\u00ed8h\u0083\u00b3Bm\u0083\u00b1\u0002E0\u008c\u0018W\u00a6\u00e8\u00a2\u0096\u008a\u00c8{\u00e1V\u0086\u00c8:\u001a\u00a0Q5\u00e7(\u0010s\u00db\t\u00cf4\u00bf\u00e4E+\u001d\u00f7\u00b5\u00c7\u00f12\u00b9\u0010a\u00fc\u00bb0pIwa\u00cd\u008d\u00d8\u008cA\u00af\u008b\u009f8\u00edD\u001e`\u00f8\u00a2<t\u00be\u00a1\u0089\u0014B\u00bf\u00f5\u0083\u00e5\u001b\u008d0\u00dd\u0019D}\u00f6\u00ee\u0087\u00c5Q\u001a\u009a\u00d4A)\u00d2\u00ec\u00f9Y\u00fel\u0092\u0096H}44\u001c\u0001%\u00d3<\u0019\u00ff\u00f4\u00af\u00fe".length();
                    var10_7 = 64;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = jn.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "-\u00b4[X\u0089\u00e9B)\u00ff\u009d\u001c\u0013Q\u00b9\u00f9\u00e9\u0081\u00b3\u00eclB\u00c2\u00d1\u0080\u00c7\u00ef\u0089v\u00b1\u00f0;\u00a1\u00f4TV\u0002B\u00ec\u000b\u00c2\u0098\u0086W\u001d\u0095\u00dcD\u00cc`\u00d7\u00ab\u0001*\u00daWd\u00ae\u00a6\u0011\u00f3\u0012\u00a7\u00ff\u008c\"\u00a5C\u00b49\u00c9\u00fcR\u0010\u00b3\u00e5>\"\u00eb\u00b9\u008b,\u0006v\u00f3-\u0012\u009d\\\b";
                        var13_6 = "-\u00b4[X\u0089\u00e9B)\u00ff\u009d\u001c\u0013Q\u00b9\u00f9\u00e9\u0081\u00b3\u00eclB\u00c2\u00d1\u0080\u00c7\u00ef\u0089v\u00b1\u00f0;\u00a1\u00f4TV\u0002B\u00ec\u000b\u00c2\u0098\u0086W\u001d\u0095\u00dcD\u00cc`\u00d7\u00ab\u0001*\u00daWd\u00ae\u00a6\u0011\u00f3\u0012\u00a7\u00ff\u008c\"\u00a5C\u00b49\u00c9\u00fcR\u0010\u00b3\u00e5>\"\u00eb\u00b9\u008b,\u0006v\u00f3-\u0012\u009d\\\b".length();
                        var10_7 = 72;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = jn.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            jn.b = var14_3;
            jn.c = new String[13];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 3063276474667562910L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        jn.e = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return arrayIndexOutOfBoundsException;
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x610C;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/jn", exception);
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
            jn.c[n11] = jn.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = jn.b(n10, l10);
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
            throw new RuntimeException("com/zelix/jn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(jn.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

