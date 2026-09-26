/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.hz;
import com.zelix.iq;
import com.zelix.iy;
import com.zelix.l6q;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class it
extends iy {
    private static final long b = prr.a(-7689582913322699252L, 369767071174187050L, MethodHandles.lookup().lookupClass()).a(191661313356624L);
    private static final long m;

    @Override
    public boolean w(long l10) {
        boolean bl2;
        block5: {
            block6: {
                CallSite callSite = m44.a("n", (long)7368052272814009756L, (long)l10);
                try {
                    try {
                        bl2 = this.q();
                        int n10 = callSite;
                        if (l10 > 0L) {
                            if (n10 == false) break block5;
                            n10 = (int)m;
                        }
                        if (bl2 != n10) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)8899750138784791596L, (long)l10);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)8899750138784791596L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    it(long l10, int n10, h1 h12, int n11, l6q l6q2) {
        long l11 = (l10 = b ^ l10) ^ 0x73205BDCBBA3L;
        super(n10, h12, l11, n11, l6q2);
    }

    @Override
    public int T(char c10, int n10, char c11) {
        return 5;
    }

    /*
     * Exception decompiling
     */
    @Override
    public hz n(hz var1_1, boolean var2_2, char var3_3, int var4_4, boolean var5_5, loj var6_6, char var7_7, String var8_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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
    int a(Object[] objectArray) {
        h1 h12 = (h1)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n10 = h12.readInt();
        return this.i + n10;
    }

    public it(int n10, iq iq2) {
        super(n10, iq2);
    }

    @Override
    public List N(long l10) {
        return null;
    }

    @Override
    void U(DataOutputStream dataOutputStream, long l10) {
        m44.a("t", (Object)dataOutputStream, (int)this.J(), (long)-5375610491616155962L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = b ^ 0x21A97168B407L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 2035514767423694977L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                m = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

