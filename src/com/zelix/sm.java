/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._6;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.l6q;
import com.zelix.l6z;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sw;
import com.zelix.x8;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class sm
extends sw {
    private sw[] k;
    private static final long a = prr.a((long)252588246340972284L, (long)6073259587729417199L, MethodHandles.lookup().lookupClass()).a(65747345525879L);
    private static final String c;

    String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public void z(gu var1_1, long var2_2) {
        var4_3 = var2_2 ^ 0L;
        var7_4 = 0;
        var6_5 = m44.a("h", (long)6170399952317654249L, (long)var2_2);
        while (var7_4 < ((CallSite)m44.a("v", (Object)this, (long)6145176661968042112L, (long)var2_2)).length) {
            m44.a("v", (Object)this, (long)6145176661968042112L, (long)var2_2)[var7_4].z(var1_1, var4_3);
            ++var7_4;
lbl8:
            // 2 sources

            ** while (var6_5 == false)
lbl9:
            // 1 sources

        }
lbl10:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl8
    }

    /*
     * Unable to fully structure code
     */
    public void p(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = var2_2 ^ 0L;
        var7_4 = 0;
        var6_5 = m44.a("k", (long)2975428989868539309L, (long)var2_2);
        while (var7_4 < ((CallSite)m44.a("u", (Object)this, (long)3601489058179603507L, (long)var2_2)).length) {
            v0 = new Object[1];
            v0[0] = var4_3;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)3601489058179603507L, (long)var2_2)[var7_4], (Object)v0, (long)3471309099421402960L, (long)var2_2);
            ++var7_4;
lbl13:
            // 2 sources

            ** while (var6_5 != false)
lbl14:
            // 1 sources

        }
lbl15:
        // 2 sources

        if (var2_2 <= 0L) ** GOTO lbl13
    }

    /*
     * Unable to fully structure code
     */
    public void I(Object[] var1_1) {
        var7_2 = (Set)var1_1[0];
        var5_3 = (Set)var1_1[1];
        var6_4 = (Set)var1_1[2];
        var2_5 = (Set)var1_1[3];
        var3_6 = (Long)var1_1[4];
        var8_7 = var3_6 ^ 0L;
        var11_8 = 0;
        var10_9 = m44.a("m", (long)-7884406779132131725L, (long)var3_6);
        while (var11_8 < ((CallSite)m44.a("s", (Object)this, (long)-8492344003282933779L, (long)var3_6)).length) {
            v0 = new Object[5];
            v0[4] = var8_7;
            v0[3] = var2_5;
            v0[2] = var6_4;
            v0[1] = var5_3;
            v0[0] = var7_2;
            m44.a("r", (Object)m44.a("s", (Object)this, (long)-8492344003282933779L, (long)var3_6)[var11_8], (Object)v0, (long)-7857853706302523523L, (long)var3_6);
            ++var11_8;
lbl21:
            // 2 sources

            ** while (var10_9 != false)
lbl22:
            // 1 sources

        }
lbl23:
        // 2 sources

        if (var3_6 <= 0L) ** GOTO lbl21
    }

    /*
     * Unable to fully structure code
     */
    public void B(Object[] var1_1) {
        var2_2 = (HashMap)var1_1[0];
        var4_3 = (Long)var1_1[1];
        var3_4 = (HashMap)var1_1[2];
        var6_5 = var4_3 ^ 0L;
        var9_6 = 0;
        var8_7 = m44.a("o", (long)-2650662772369413506L, (long)var4_3);
        while (var9_6 < ((CallSite)m44.a("q", (Object)this, (long)-2603269917704014313L, (long)var4_3)).length) {
            v0 = new Object[3];
            v0[2] = var3_4;
            v0[1] = var6_5;
            v0[0] = var2_2;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)-2603269917704014313L, (long)var4_3)[var9_6], (Object)v0, (long)-2863630796536996889L, (long)var4_3);
            ++var9_6;
lbl17:
            // 2 sources

            ** while (var8_7 == false)
lbl18:
            // 1 sources

        }
lbl19:
        // 2 sources

        if (var4_3 < 0L) ** GOTO lbl17
    }

    /*
     * Exception decompiling
     */
    String G(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[DOLOOP], 14[WHILELOOP]], but top level block is 6[TRYBLOCK]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrApi.lambda$main$2(CfrApi.java:31)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    public void j(Object[] var1_1) {
        var3_2 = (DataOutputStream)var1_1[0];
        var6_3 = (Map)var1_1[1];
        var4_4 = (Long)var1_1[2];
        var2_5 = (lqu)var1_1[3];
        v0 = var4_4;
        var7_6 = v0 ^ 128007700253086L;
        var9_7 = v0 ^ 0L;
        v1 = new Object[1];
        v1[0] = var7_6;
        var3_2.writeByte((int)m44.a("u", (Object)this, (Object)v1, (long)-3124275330760133103L, (long)var4_4));
        v2 = m44.a("j", (long)-3079385837568482293L, (long)var4_4);
        var3_2.writeShort(((CallSite)m44.a("t", (Object)this, (long)-3050496705703724958L, (long)var4_4)).length);
        var11_8 = v2;
        var12_9 = 0;
        while (var12_9 < ((CallSite)m44.a("t", (Object)this, (long)-3050496705703724958L, (long)var4_4)).length) {
            v3 = new Object[4];
            v3[3] = var2_5;
            v3[2] = var9_7;
            v3[1] = var6_3;
            v3[0] = var3_2;
            m44.a("u", (Object)m44.a("t", (Object)this, (long)-3050496705703724958L, (long)var4_4)[var12_9], (Object)v3, (long)-3779428243829530914L, (long)var4_4);
            ++var12_9;
lbl27:
            // 2 sources

            ** while (var11_8 == false)
lbl28:
            // 1 sources

        }
lbl29:
        // 2 sources

        if (var4_4 <= 0L) ** GOTO lbl27
    }

    /*
     * Unable to fully structure code
     */
    public void G(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = var2_2 ^ 0L;
        var7_4 = 0;
        var6_5 = m44.a("n", (long)-3544437497256820857L, (long)var2_2);
        while (var7_4 < ((CallSite)m44.a("p", (Object)this, (long)-3592175483984960530L, (long)var2_2)).length) {
            v0 = new Object[1];
            v0[0] = var4_3;
            m44.a("q", (Object)m44.a("p", (Object)this, (long)-3592175483984960530L, (long)var2_2)[var7_4], (Object)v0, (long)-3669141907159206498L, (long)var2_2);
            ++var7_4;
lbl13:
            // 2 sources

            ** while (var6_5 == false)
lbl14:
            // 1 sources

        }
lbl15:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl13
    }

    sm(long l, _4 _42, int n, h1 h12, l6q l6q2) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x5781716A6A74L;
        long l4 = l2 ^ 0x70D9576AAF7EL;
        long l5 = l2 ^ 0x41343725EAB1L;
        long l6 = l2 ^ 0x5E485123F42L;
        int n2 = (int)(l6 >>> 48);
        int n3 = (int)(l6 << 16 >>> 48);
        int n4 = (int)(l6 << 32 >>> 32);
        long l7 = l2 ^ 0x4BF1E01AB9E7L;
        long l8 = l2 ^ 0x5D5079D81373L;
        CallSite callSite = m44.a("h", (long)-1120851925751454570L, (long)l);
        super((char)n2, _42, (char)n3, n, n4);
        CallSite callSite2 = callSite;
        int n5 = h12.readUnsignedShort();
        m44.a("t", (Object)((Object)this), (sw[])new sw[n5], (long)-1675276604185082616L, (long)l);
        int n6 = 0;
        while (n6 < n5) {
            CallSite callSite3;
            block5: {
                block6: {
                    CallSite callSite4;
                    block7: {
                        Object[] objectArray = new Object[4];
                        objectArray[3] = l6q2;
                        objectArray[2] = h12;
                        objectArray[1] = l7;
                        objectArray[0] = this;
                        callSite4 = m44.a("h", (Object)objectArray, (long)-1123187128684327466L, (long)l);
                        try {
                            try {
                                callSite3 = callSite2;
                                if (l <= 0L) break block5;
                                if (callSite3 != false) break block6;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l8;
                                if (m44.a("w", (Object)callSite4, (Object)objectArray2, (long)-1113397843154835904L, (long)l) != false) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)-1106576996329065556L, (long)l);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = false;
                            objectArray3[0] = l4;
                            m44.a("w", (Object)((Object)this), (Object)objectArray3, (long)-819079611133946757L, (long)l);
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l3;
                            Object[] objectArray5 = new Object[2];
                            objectArray5[1] = c + (String)((Object)m44.a("w", (Object)callSite4, (Object)objectArray4, (long)-1493073549922974464L, (long)l));
                            objectArray5[0] = l5;
                            m44.a("w", (Object)((Object)this), (Object)objectArray5, (long)-1207629116287490430L, (long)l);
                            return;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-1106576996329065556L, (long)l);
                        }
                    }
                    m44.a("v", (Object)((Object)this), (long)-1675276604185082616L, (long)l)[n6] = callSite4;
                    ++n6;
                }
                callSite3 = callSite2;
            }
            if (callSite3 == false) continue;
        }
    }

    public void q(x8 x82, long l, x8 x83) {
    }

    boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public int c(Object[] objectArray) {
        void v2;
        CallSite callSite;
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        boolean bl = true;
        var7_5 += 2;
        int n = 0;
        CallSite callSite2 = m44.a("h", (long)3769936412615860406L, (long)l);
        block0: while (n < ((CallSite)m44.a("v", (Object)((Object)this), (long)3233680053179269416L, (long)l)).length) {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            CallSite callSite3 = callSite + m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)3233680053179269416L, (long)l)[n], (Object)objectArray2, (long)3037185531397059972L, (long)l);
            boolean bl2 = true;
            do {
                block5: {
                    block4: {
                        if (!bl2 || (bl2 = false)) break block4;
                        if (l <= 0L) break block5;
                        if (callSite2 != false) return (int)v2;
                        callSite = callSite3;
                        ++n;
                    }
                    callSite3 = callSite2;
                }
                if (callSite3 == false) continue block0;
            } while (l < 0L);
        }
        v2 = callSite;
        return (int)v2;
    }

    /*
     * WARNING - void declaration
     */
    public void a(Object[] objectArray) {
        block4: {
            void var10_8;
            CallSite callSite;
            long l;
            long l2;
            Set set;
            block3: {
                CallSite callSite2;
                Object object;
                set = (Set)objectArray[0];
                l2 = (Long)objectArray[1];
                long l3 = l2;
                l = l3 ^ 0L;
                long l4 = l3 ^ 0x2F737424DE79L;
                callSite = m44.a("j", (long)2676243613375091819L, (long)l2);
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l4;
                    object = m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)4433258012436409162L, (long)l2);
                    if (callSite == false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)4444723213822541478L, (long)l2);
                }
                object = callSite2 = (Object)false;
            }
            while (var10_8 < ((CallSite)m44.a("t", (Object)((Object)this), (long)2723071315039373314L, (long)l2)).length) {
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l;
                objectArray3[0] = set;
                m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)2723071315039373314L, (long)l2)[var10_8], (Object)objectArray3, (long)2798088661780629141L, (long)l2);
                ++var10_8;
                if (callSite != false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void n(Object[] var1_1) {
        var4_2 = (DataOutputStream)var1_1[0];
        var2_3 = (Long)var1_1[1];
        v0 = var2_3;
        var5_4 = v0 ^ 111936518545027L;
        var7_5 = v0 ^ 0L;
        v1 = m44.a("o", (long)-7347988811094634783L, (long)var2_3);
        v2 = new Object[1];
        v2[0] = var5_4;
        var4_2.writeByte((int)m44.a("p", (Object)this, (Object)v2, (long)-8955045563159879412L, (long)var2_3));
        var9_6 = v1;
        var4_2.writeShort(((CallSite)m44.a("q", (Object)this, (long)-9027636105772798081L, (long)var2_3)).length);
        var10_7 = 0;
        while (var10_7 < ((CallSite)m44.a("q", (Object)this, (long)-9027636105772798081L, (long)var2_3)).length) {
            v3 = new Object[2];
            v3[1] = var7_5;
            v3[0] = var4_2;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)-9027636105772798081L, (long)var2_3)[var10_7], (Object)v3, (long)-9188786594168031134L, (long)var2_3);
            ++var10_7;
lbl23:
            // 2 sources

            ** while (var9_6 != false)
lbl24:
            // 1 sources

        }
lbl25:
        // 2 sources

        if (var2_3 < 0L) ** GOTO lbl23
    }

    /*
     * Unable to fully structure code
     */
    public void z(Object[] var1_1) {
        var5_2 = (_6)var1_1[0];
        var3_3 = (Long)var1_1[1];
        var6_4 = (l6z)var1_1[2];
        var2_5 = (lqu)var1_1[3];
        var7_6 = var3_3 ^ 0L;
        var10_7 = 0;
        var9_8 = m44.a("i", (long)3821474139566064704L, (long)var3_3);
        while (var10_7 < ((CallSite)m44.a("w", (Object)this, (long)3882452482461685801L, (long)var3_3)).length) {
            v0 = new Object[4];
            v0[3] = var2_5;
            v0[2] = var6_4;
            v0[1] = var7_6;
            v0[0] = var5_2;
            m44.a("v", (Object)m44.a("w", (Object)this, (long)3882452482461685801L, (long)var3_3)[var10_7], (Object)v0, (long)4009394009123319403L, (long)var3_3);
            ++var10_7;
lbl19:
            // 2 sources

            ** while (var9_8 == false)
lbl20:
            // 1 sources

        }
lbl21:
        // 2 sources

        if (var3_3 < 0L) ** GOTO lbl19
    }

    boolean i(Object[] objectArray) {
        return true;
    }

    sw[] H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)((Object)this), (long)-2289212113287737869L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x78B33E2CE5A2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("}\u009e\u0018\u009d\u00d0\u00c31\u00bc\u00af\u001b\u00e0\u00bew\u0087k=\u00f9 a\u0006\u00a5\u00fcw\u00ff\u0005Z\u00de\u009b%v\u009f\u00bb".getBytes("ISO-8859-1"));
                c = sm.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
}
