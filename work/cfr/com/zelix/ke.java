/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._v;
import com.zelix.bs;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.jf;
import com.zelix.jv;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import java.io.ByteArrayOutputStream;
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

public class ke
extends kw
implements ni {
    byte[] I;
    boolean g;
    int U;
    bs[] H;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map h;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;

    /*
     * Unable to fully structure code
     */
    protected void S(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var4_3 = (DataOutputStream)var1_1[1];
        var5_4 = (var2_2 = ke.a ^ var2_2) ^ 102876932113296L;
        v0 = m44.a("k", (long)5342110223375146693L, (long)var2_2);
        var4_3.writeShort((int)m44.a("u", (Object)this, (long)5473314220590681441L, (long)var2_2));
        var7_5 = v0;
        var8_6 = 0;
        while (var8_6 < m44.a("u", (Object)this, (long)5473314220590681441L, (long)var2_2)) {
            v1 = new Object[2];
            v1[1] = var5_4;
            v1[0] = var4_3;
            m44.a("t", (Object)m44.a("u", (Object)this, (long)5889329850736722474L, (long)var2_2)[var8_6], (Object)v1, (long)5845450891284736352L, (long)var2_2);
            ++var8_6;
lbl17:
            // 2 sources

            ** while (var7_5 != false)
lbl18:
            // 1 sources

        }
lbl19:
        // 2 sources

        if (var2_2 < 0L) ** GOTO lbl17
    }

    @Override
    void z(gu gu2, long l10) {
        block6: {
            CallSite callSite;
            long l11;
            block5: {
                long l12 = l10;
                long l13 = l12 ^ 0x66FDF08525FDL;
                l11 = l12 ^ 0L;
                callSite = m44.a("h", (long)5618762033536375070L, (long)l10);
                try {
                    int n10;
                    try {
                        n10 = gu2.K(this.b, this, l13, this.H());
                        if (callSite != false) break block5;
                        if (m44.a("v", (Object)this, (long)6224041716033603057L, (long)l10) == null) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)5378370346953889064L, (long)l10);
                    }
                    n10 = 0;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)5378370346953889064L, (long)l10);
                }
            }
            for (int i10 = v9307035; i10 < ((CallSite)m44.a("v", (Object)this, (long)6224041716033603057L, (long)l10)).length; ++i10) {
                m44.a("w", (Object)m44.a("v", (Object)this, (long)6224041716033603057L, (long)l10)[i10], (Object)gu2, (long)l11, (long)6269873558719668327L, (long)l10);
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    ke(_4 var1_1, int var2_2, String var3_3, h1 var4_4, l6q var5_5, long var6_6, l6q var8_7, PrintWriter var9_8) {
        block58: {
            block56: {
                block55: {
                    block47: {
                        block48: {
                            block50: {
                                v0 = var6_6 = ke.a ^ var6_6;
                                var10_9 = v0 ^ 123351793554884L;
                                var12_10 = v0 ^ 126694348402322L;
                                var14_11 = v0 ^ 58660689322342L;
                                v1 = v0 ^ 47368037395471L;
                                var16_12 = (int)(v1 >>> 32);
                                var17_13 = v1 << 32 >>> 32;
                                var19_14 = v0 ^ 117680300745028L;
                                var21_15 = v0 ^ 63069520998551L;
                                var23_16 = v0 ^ 102183860900731L;
                                var25_17 = v0 ^ 129761938158572L;
                                var27_18 = v0 ^ 58526588479900L;
                                var29_19 = v0 ^ 2253372783132L;
                                v2 = m44.a("h", (long)6201903619444966134L, (long)var6_6);
                                super(var1_1, var2_2, var3_3, var27_18, var4_4, var5_5);
                                var31_20 = v2;
                                try {
                                    try {
                                        try {
                                            m44.a("t", (Object)this, (boolean)true, (long)5236559670758743837L, (long)var6_6);
                                            v3 = this.W;
                                            if (var31_20 != false) break block47;
                                            if (v3 >= 2) {
                                            }
                                            ** GOTO lbl184
                                        }
                                        catch (n9 v4) {
                                            throw m44.a("h", (Object)v4, (long)5857920201130462912L, (long)var6_6);
                                        }
                                        m44.a("t", (Object)this, (int)var4_4.readUnsignedShort(), (long)6324871106366722386L, (long)var6_6);
                                        v5 = m44.a("v", (Object)this, (long)6324871106366722386L, (long)var6_6) * ke.c("h", (int)30934, (long)(6923855357177653729L ^ var6_6)) + 2;
                                        if (var6_6 > 0L) {
                                            if (var31_20 != false) break block48;
                                        }
                                        ** GOTO lbl183
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("h", (Object)v6, (long)5857920201130462912L, (long)var6_6);
                                    }
                                    if (v5 == this.W) {
                                    }
                                    ** GOTO lbl165
                                }
                                catch (n9 v7) {
                                    throw m44.a("h", (Object)v7, (long)5857920201130462912L, (long)var6_6);
                                }
                                m44.a("t", (Object)this, (bs[])new bs[m44.a("v", (Object)this, (long)6324871106366722386L, (long)var6_6)], (long)5586839314286534169L, (long)var6_6);
                                var32_21 = 0;
                                while (var32_21 < m44.a("v", (Object)this, (long)6324871106366722386L, (long)var6_6)) {
                                    block54: {
                                        block49: {
                                            block51: {
                                                block52: {
                                                    try {
                                                        block53: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v8 = this;
                                                                                v9 = 5586839314286534169L;
                                                                                v10 = var6_6;
lbl55:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    m44.a("v", (Object)v8, (long)v9, (long)v10)[var32_21] = new bs(var16_12, this, var4_4, var5_5, var8_7, var9_8, var17_13);
                                                                                    v11 = var31_20;
                                                                                    if (var6_6 >= 0L) {
                                                                                        if (v11 != false) break block49;
                                                                                        v11 = m44.a("v", (Object)this, (long)5236559670758743837L, (long)var6_6);
                                                                                    }
                                                                                    v12 = var31_20;
                                                                                    if (var6_6 > 0L) {
                                                                                        if (v12 != false) break block50;
                                                                                    }
                                                                                    ** GOTO lbl149
                                                                                    break;
                                                                                }
                                                                            }
                                                                            catch (n9 v13) {
                                                                                throw m44.a("h", (Object)v13, (long)5857920201130462912L, (long)var6_6);
                                                                            }
                                                                            if (v11 == false) break block51;
                                                                        }
                                                                        catch (n9 v14) {
                                                                            throw m44.a("h", (Object)v14, (long)5857920201130462912L, (long)var6_6);
                                                                        }
                                                                        v15 = m44.a("v", (Object)this, (long)5586839314286534169L, (long)var6_6)[var32_21];
                                                                        if (var31_20 != false) break block52;
                                                                    }
                                                                    catch (n9 v16) {
                                                                        throw m44.a("h", (Object)v16, (long)5857920201130462912L, (long)var6_6);
                                                                    }
                                                                    if (var6_6 <= 0L) break block52;
                                                                    if (m44.a("v", (Object)v15, (long)5635242306733071661L, (long)var6_6) != false) break block53;
                                                                }
                                                                catch (n9 v17) {
                                                                    throw m44.a("h", (Object)v17, (long)5857920201130462912L, (long)var6_6);
                                                                }
                                                                v18 = new Object[2];
                                                                v18[1] = var10_9;
                                                                v18[0] = false;
                                                                m44.a("w", (Object)this, (Object)v18, (long)5864907457107503352L, (long)var6_6);
                                                                var9_8.println((String)ke.b("q", (int)11703, (long)(4758195694375395812L ^ var6_6)) + this.h(var14_11) + (String)ke.b("q", (int)10119, (long)(4762800610998774737L ^ var6_6)) + (String)ke.b("q", (int)15701, (long)(2759988497385058569L ^ var6_6)) + (String)ke.b("q", (int)20070, (long)(2291344457538208308L ^ var6_6)));
                                                                if (var31_20 == false) break block51;
                                                            }
                                                            catch (n9 v19) {
                                                                throw m44.a("h", (Object)v19, (long)5857920201130462912L, (long)var6_6);
                                                            }
                                                        }
                                                        v15 = m44.a("v", (Object)this, (long)5586839314286534169L, (long)var6_6)[var32_21];
                                                    }
                                                    catch (n9 v20) {
                                                        throw m44.a("h", (Object)v20, (long)5857920201130462912L, (long)var6_6);
                                                    }
                                                }
                                                v21 = new Object[1];
                                                v21[0] = var19_14;
                                                var33_23 = m44.a("w", (Object)v15, (Object)v21, (long)5688709618719036635L, (long)var6_6);
                                                try {
                                                    if (var31_20 != false) break block49;
                                                    if (var33_23 == null) break block51;
                                                }
                                                catch (n9 v22) {
                                                    throw m44.a("h", (Object)v22, (long)5857920201130462912L, (long)var6_6);
                                                }
                                                v23 = new Object[1];
                                                v23[0] = var21_15;
                                                var34_24 = m44.a("w", (Object)m44.a("v", (Object)this, (long)5586839314286534169L, (long)var6_6)[var32_21], (Object)v23, (long)6293482493755739025L, (long)var6_6);
                                                v24 = new Object[1];
                                                v24[0] = var23_16;
                                                var35_25 = m44.a("w", (Object)m44.a("v", (Object)this, (long)5586839314286534169L, (long)var6_6)[var32_21], (Object)v24, (long)5671180276345068292L, (long)var6_6);
                                                try {
                                                    try {
                                                        try {
                                                            v25 = var31_20;
                                                            if (var6_6 <= 0L) break block54;
                                                            if (v25 != false) break block49;
                                                            if (var35_25 == null) break block51;
                                                        }
                                                        catch (n9 v26) {
                                                            throw m44.a("h", (Object)v26, (long)5857920201130462912L, (long)var6_6);
                                                        }
                                                        if (var35_25.length() <= var34_24.length() - var33_23.length()) break block51;
                                                    }
                                                    catch (n9 v27) {
                                                        throw m44.a("h", (Object)v27, (long)5857920201130462912L, (long)var6_6);
                                                    }
                                                    var9_8.println((String)ke.b("q", (int)26015, (long)(249136117357619659L ^ var6_6)) + this.h(var14_11) + (String)ke.b("q", (int)22356, (long)(4127460285177928452L ^ var6_6)) + (String)ke.b("q", (int)28022, (long)(4995525578022789411L ^ var6_6)) + (String)ke.b("q", (int)17208, (long)(4733377120594104175L ^ var6_6)) + (String)var35_25 + (String)ke.b("q", (int)13895, (long)(7200097591539366425L ^ var6_6)) + (String)var34_24 + (String)ke.b("q", (int)1839, (long)(2079995771861519218L ^ var6_6)) + (String)var33_23 + "'");
                                                }
                                                catch (n9 v28) {
                                                    throw m44.a("h", (Object)v28, (long)5857920201130462912L, (long)var6_6);
                                                }
                                            }
                                            ++var32_21;
                                        }
                                        v25 = var31_20;
                                    }
                                    if (v25 == false) continue;
                                }
                                v8 = this;
                                v9 = 5236559670758743837L;
                                v10 = var6_6;
                                ** while (var6_6 < 0L)
lbl144:
                                // 1 sources

                                v11 = m44.a("v", (Object)v8, (long)v9, (long)v10);
                            }
                            try {
                                if (var6_6 < 0L) break block55;
                                v12 = var31_20;
lbl149:
                                // 2 sources

                                if (v12 != false) break block55;
                                if (v11 != false) break block47;
                            }
                            catch (n9 v29) {
                                throw m44.a("h", (Object)v29, (long)5857920201130462912L, (long)var6_6);
                            }
                            var32_22 = new ByteArrayOutputStream(this.W);
                            var33_23 = new DataOutputStream(var32_22);
                            try {
                                v30 = new Object[2];
                                v30[1] = var33_23;
                                v30[0] = var25_17;
                                m44.a("w", (Object)this, (Object)v30, (long)5268661490513065584L, (long)var6_6);
                                m44.a("t", (Object)this, (byte[])m44.a("w", (Object)var32_22, (long)5201341476017441696L, (long)var6_6), (long)5423863925804868523L, (long)var6_6);
                                m44.a("t", (Object)this, null, (long)5586839314286534169L, (long)var6_6);
                                if (var6_6 <= 0L || var31_20 == false) break block47;
lbl165:
                                // 2 sources

                                v31 = new Object[2];
                                v31[1] = var10_9;
                                v31[0] = false;
                                m44.a("w", (Object)this, (Object)v31, (long)5864907457107503352L, (long)var6_6);
                                var9_8.println((String)ke.b("q", (int)26015, (long)(249136117357619659L ^ var6_6)) + this.h(var14_11) + (String)ke.b("q", (int)22356, (long)(4127460285177928452L ^ var6_6)) + (String)ke.b("q", (int)28022, (long)(4995525578022789411L ^ var6_6)) + (String)ke.b("q", (int)9172, (long)(890566175206207365L ^ var6_6)));
                                m44.a("t", (Object)this, (byte[])new byte[this.W], (long)5423863925804868523L, (long)var6_6);
                                m44.a("v", (Object)this, (long)5423863925804868523L, (long)var6_6)[0] = (CallSite)((byte)(m44.a("v", (Object)this, (long)6324871106366722386L, (long)var6_6) >>> ke.c("h", (int)30934, (long)(6923855357177653729L ^ var6_6)) & ke.c("h", (int)12826, (long)(4531441615230378798L ^ var6_6))));
                                m44.a("v", (Object)this, (long)5423863925804868523L, (long)var6_6)[1] = (CallSite)((byte)(m44.a("v", (Object)this, (long)6324871106366722386L, (long)var6_6) >>> 0 & ke.c("h", (int)4454, (long)(7836737915923169360L ^ var6_6))));
                                m44.a("w", (Object)var4_4, (Object)m44.a("v", (Object)this, (long)5423863925804868523L, (long)var6_6), (int)2, (int)(this.W - 2), (long)6227039846752567695L, (long)var6_6);
                            }
                            catch (n9 v32) {
                                throw m44.a("h", (Object)v32, (long)5857920201130462912L, (long)var6_6);
                            }
                        }
                        try {
                            if (var6_6 <= 0L) break block47;
                            v5 = var31_20;
lbl183:
                            // 2 sources

                            if (v5 == false) break block47;
lbl184:
                            // 2 sources

                            v33 = new Object[2];
                            v33[1] = var10_9;
                            v33[0] = false;
                            m44.a("w", (Object)this, (Object)v33, (long)5864907457107503352L, (long)var6_6);
                            var9_8.println((String)ke.b("q", (int)26015, (long)(249136117357619659L ^ var6_6)) + this.h(var14_11) + (String)ke.b("q", (int)22356, (long)(4127460285177928452L ^ var6_6)) + (String)ke.b("q", (int)28022, (long)(4995525578022789411L ^ var6_6)) + (String)ke.b("q", (int)13281, (long)(8173378685865295806L ^ var6_6)));
                            m44.a("t", (Object)this, (byte[])new byte[this.W], (long)5423863925804868523L, (long)var6_6);
                            v3 = var4_4.read((byte[])m44.a("v", (Object)this, (long)5423863925804868523L, (long)var6_6));
                        }
                        catch (n9 v34) {
                            throw m44.a("h", (Object)v34, (long)5857920201130462912L, (long)var6_6);
                        }
                    }
                    try {
                        v35 /* !! */  = this;
                        if (var31_20 != false) break block56;
                        v11 = m44.a("v", (Object)v35 /* !! */ , (long)5236559670758743837L, (long)var6_6);
                    }
                    catch (n9 v36) {
                        throw m44.a("h", (Object)v36, (long)5857920201130462912L, (long)var6_6);
                    }
                }
                try {
                    block57: {
                        try {
                            if (var6_6 > 0L) {
                                if (v11 == false) break block57;
                                v37 = new Object[2];
                                v37[1] = var29_19;
                                v37[0] = true;
                                m44.a("w", (Object)((_v)var1_1), (Object)v37, (long)6044197994007154147L, (long)var6_6);
                                v11 = var31_20;
                            }
                            if (v11 == false) break block58;
                        }
                        catch (n9 v38) {
                            throw m44.a("h", (Object)v38, (long)5857920201130462912L, (long)var6_6);
                        }
                    }
                    v35 /* !! */  = var1_1;
                }
                catch (n9 v39) {
                    throw m44.a("h", (Object)v39, (long)5857920201130462912L, (long)var6_6);
                }
            }
            v40 = new Object[2];
            v40[1] = var12_10;
            v40[0] = true;
            m44.a("w", (Object)((_v)v35 /* !! */ ), (Object)v40, (long)5204631254254412970L, (long)var6_6);
        }
    }

    /*
     * WARNING - void declaration
     */
    void T(Object[] objectArray) {
        block4: {
            void var7_6;
            CallSite callSite;
            long l10;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                l11 = (Long)objectArray[0];
                l10 = (l11 = a ^ l11) ^ 0x48C1DE5D91CAL;
                callSite = m44.a("l", (long)2190437681290103426L, (long)l11);
                try {
                    object = m44.a("r", (Object)this, (long)62934164434933609L, (long)l11);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)n92, (long)1819430533875107508L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var7_6 < m44.a("r", (Object)this, (long)2283920732013041958L, (long)l11)) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l10;
                m44.a("s", (Object)m44.a("r", (Object)this, (long)431248033232655981L, (long)l11)[var7_6], (Object)objectArray2, (long)372812470626546788L, (long)l11);
                ++var7_6;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    int O(Object[] var1_1) {
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
     * WARNING - void declaration
     */
    public void v(Object[] objectArray) {
        block4: {
            void var11_10;
            CallSite callSite;
            long l10;
            HashSet hashSet;
            HashSet hashSet2;
            HashSet hashSet3;
            HashSet hashSet4;
            long l11;
            block3: {
                CallSite callSite2;
                Object object;
                l11 = (Long)objectArray[0];
                hashSet4 = (HashSet)objectArray[1];
                hashSet3 = (HashSet)objectArray[2];
                hashSet2 = (HashSet)objectArray[3];
                hashSet = (HashSet)objectArray[4];
                l10 = (l11 = a ^ l11) ^ 0x59CC46FDF12DL;
                callSite = m44.a("m", (long)-7870999896501467613L, (long)l11);
                try {
                    object = m44.a("s", (Object)this, (long)-8322935275061191736L, (long)l11);
                    if (callSite != false) break block3;
                    if (object == false) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)n92, (long)-7665546224435885547L, (long)l11);
                }
                object = callSite2 = (Object)false;
            }
            while (var11_10 < m44.a("s", (Object)this, (long)-7848800040033184377L, (long)l11)) {
                Object[] objectArray2 = new Object[5];
                objectArray2[4] = hashSet;
                objectArray2[3] = hashSet2;
                objectArray2[2] = hashSet3;
                objectArray2[1] = hashSet4;
                objectArray2[0] = l10;
                m44.a("r", (Object)m44.a("s", (Object)this, (long)-8548551233669784884L, (long)l11)[var11_10], (Object)objectArray2, (long)-8639193544583674210L, (long)l11);
                ++var11_10;
                if (callSite == false) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void c(Object[] var1_1) {
        block9: {
            block8: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (DataOutputStream)var1_1[1];
                v0 = var3_2;
                var5_4 = v0 ^ 0L;
                var7_5 = v0 ^ 51658303206485L;
                v1 = m44.a("i", (long)716282175763740856L, (long)var3_2);
                v2 = new Object[2];
                v2[1] = var2_3;
                v2[0] = var5_4;
                super.c(v2);
                var9_6 = v1;
                try {
                    try {
                        v3 = this;
                        if (var9_6 == false) break block8;
                        if (m44.a("w", (Object)v3, (long)1086114875312396452L, (long)var3_2) != false) {
                        }
                        ** GOTO lbl36
                    }
                    catch (n9 v4) {
                        throw m44.a("i", (Object)v4, (long)1653625483943872889L, (long)var3_2);
                    }
                    v3 = this;
                }
                catch (n9 v5) {
                    throw m44.a("i", (Object)v5, (long)1653625483943872889L, (long)var3_2);
                }
            }
            try {
                v6 = new Object[2];
                v6[1] = var2_3;
                v6[0] = var7_5;
                m44.a("v", (Object)v3, (Object)v6, (long)1055904211364671945L, (long)var3_2);
                if (var3_2 <= 0L || var9_6 != false) break block9;
lbl36:
                // 2 sources

                var2_3.write((byte[])m44.a("w", (Object)this, (long)935683844463584274L, (long)var3_2));
            }
            catch (n9 v7) {
                throw m44.a("i", (Object)v7, (long)1653625483943872889L, (long)var3_2);
            }
        }
    }

    @Override
    int g(int n10, byte by2, int n11) {
        long l10 = (long)n10 << 32 | (long)by2 << 56 >>> 32 | (long)n11 << 40 >>> 40;
        return 2 + m44.a("p", (Object)this, (long)-1864423790195810124L, (long)l10) * ke.c("h", (int)392, (long)(0x37E51A11B0C9215BL ^ l10));
    }

    /*
     * WARNING - void declaration
     */
    bs R(Object[] objectArray) {
        block12: {
            void var10_8;
            CallSite callSite;
            long l10;
            long l11;
            long l12;
            jv jv2;
            block11: {
                CallSite callSite2;
                Object object;
                jv2 = (jv)objectArray[0];
                l12 = (Long)objectArray[1];
                long l13 = l12 = a ^ l12;
                l11 = l13 ^ 0x42506D4CCEB0L;
                l10 = l13 ^ 0x42506D4CCEB0L;
                callSite = m44.a("k", (long)4409756773766425045L, (long)l12);
                try {
                    object = m44.a("u", (Object)this, (long)2560563942253687870L, (long)l12);
                    if (callSite != false) break block11;
                    if (object == false) break block12;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)n92, (long)4208771573730321891L, (long)l12);
                }
                object = callSite2 = (Object)false;
            }
            while (var10_8 < m44.a("u", (Object)this, (long)4388046259024083569L, (long)l12)) {
                CallSite callSite3;
                block13: {
                    block14: {
                        block15: {
                            CallSite callSite4;
                            block16: {
                                CallSite callSite5 = m44.a("u", (Object)this, (long)2786458035562624314L, (long)l12)[var10_8];
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite3 = callSite;
                                                if (l12 <= 0L) break block13;
                                                if (callSite3 != false) break block14;
                                                if (m44.a("u", (Object)callSite5, (long)2818604502888671879L, (long)l12) == null) break block15;
                                            }
                                            catch (n9 n93) {
                                                throw m44.a("k", (Object)n93, (long)4208771573730321891L, (long)l12);
                                            }
                                            callSite4 = callSite5;
                                            if (callSite != false) break block16;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("k", (Object)n94, (long)4208771573730321891L, (long)l12);
                                        }
                                        if (!((jf)((Object)m44.a("u", (Object)callSite4, (long)2818604502888671879L, (long)l12))).g(l10).equals(jv2.g(l11))) break block15;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("k", (Object)n95, (long)4208771573730321891L, (long)l12);
                                    }
                                    callSite4 = callSite5;
                                }
                                catch (n9 n96) {
                                    throw m44.a("k", (Object)n96, (long)4208771573730321891L, (long)l12);
                                }
                            }
                            return callSite4;
                        }
                        ++var10_8;
                    }
                    callSite3 = callSite;
                }
                if (callSite3 == false) continue;
            }
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public int M(Object[] var1_1) {
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

    void I(Object[] objectArray) {
        boolean bl2 = (Boolean)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("w", (Object)this, (boolean)bl2, (long)-5570790043848350458L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void N(Object[] var1_1) {
        block15: {
            block14: {
                var6_2 = (DataOutputStream)var1_1[0];
                var5_3 = (Map)var1_1[1];
                var2_4 = (Long)var1_1[2];
                var4_5 = (lqu)var1_1[3];
                v0 = var2_4;
                var7_6 = v0 ^ 0L;
                var9_7 = v0 ^ 91283194383054L;
                v1 = m44.a("k", (long)1680553024964027930L, (long)var2_4);
                v2 = new Object[4];
                v2[3] = var4_5;
                v2[2] = var7_6;
                v2[1] = var5_3;
                v2[0] = var6_2;
                super.N(v2);
                var11_8 = v1;
                try {
                    try {
                        v3 /* !! */  = m44.a("u", (Object)this, (long)1274694015012587014L, (long)var2_4);
                        if (var11_8 == false) break block14;
                        if (v3 /* !! */  != false) {
                        }
                        ** GOTO lbl56
                    }
                    catch (n9 v4) {
                        throw m44.a("k", (Object)v4, (long)599228716201351131L, (long)var2_4);
                    }
                    var6_2.writeShort((int)m44.a("u", (Object)this, (long)1071035341492488265L, (long)var2_4));
                    v3 /* !! */  = (reference)false;
                }
                catch (n9 v5) {
                    throw m44.a("k", (Object)v5, (long)599228716201351131L, (long)var2_4);
                }
            }
            var12_9 = v3 /* !! */ ;
            block8: while (var12_9 < m44.a("u", (Object)this, (long)1071035341492488265L, (long)var2_4)) {
                try {
                    v6 = new Object[3];
                    v6[2] = var9_7;
                    v6[1] = var5_3;
                    v6[0] = var6_2;
                    m44.a("t", (Object)m44.a("u", (Object)this, (long)1482547346245814018L, (long)var2_4)[var12_9], (Object)v6, (long)1298877206783446243L, (long)var2_4);
                    ++var12_9;
                    do {
                        v7 = var11_8;
                        if (var2_4 >= 0L) {
                            if (v7 == false) break block15;
                            v7 = var11_8;
                        }
                        if (v7 != false) continue block8;
                    } while (var2_4 < 0L);
                    break;
                }
                catch (n9 v8) {
                    throw m44.a("k", (Object)v8, (long)599228716201351131L, (long)var2_4);
                }
            }
            try {
                if (var2_4 <= 0L || var11_8 != false) break block15;
lbl56:
                // 2 sources

                var6_2.write((byte[])m44.a("u", (Object)this, (long)1323512613664324272L, (long)var2_4));
            }
            catch (n9 v9) {
                throw m44.a("k", (Object)v9, (long)599228716201351131L, (long)var2_4);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        ke.a = prr.a(-4675285464878294787L, 6714936997996536591L, MethodHandles.lookup().lookupClass()).a(273557647128618L);
                        ke.h = new HashMap<K, V>(13);
                        var11 = ke.a ^ 75194041854991L;
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
                        var20_3 = new String[12];
                        var18_4 = 0;
                        var17_5 = ":o$}>\u0082\u009d\u001b\u008d\u00e1K\u00cc\u00fe\u001e\u000f%\u0018\u000f\u0003\u00f0\u00fe\u00a9\u00c6\u009eT\u00c6-\u00b9m\u00dc\b\u0080d\u00cdvw\u00e7\u00d4Y\u00dd\u00ce\u0010\u00fdJv\u00ad\u00efS\u00dc=\u00a29\u00c4\u00d8\u00b9|\u00ad\u00cf8h\u007f-k|\u000eQl\u00ef\u0013ok\u00dcn[)\u0002\u0017\u00f4\u00cfZ\u0097\u001a\u0002L\u0099\u00ecZ5*n\u00f6R\u00f0\u00c6\u008c\u008a\u0018\u00f6\u001a\u0084\u00b4_\u00b7@\u00da\u009c+\u00ccu\u008a\u00ae\u0019\u000f\u00aaI\u0010\u00ac\u00b6\u001e&\u0099\u00a6\u00bc1\u0014\u00e2\u00a9YC\u00e3\u00ea\u00e7\u0010\u00b3\u0098\u00ad\u00e0\u00fc\u00ba.\u00b1\u008e\u00a0\u0090\u0013\u000e\u0094Va\u0010\u001f&L\u00dc\r\u00cb\u00ad\u00dfT\u00f4\u0003\u00a1$\u009fR\u00c3\u00103\u00f9\u001b\u00dc-\u00af\u0000\f\r\u0014,A\u00ee.\u00926\u0010C\u00ed\u00ee<3|wM9P\u00e2]\u0004\u00ba\u00a0V\u0010H\u00a4\t\u00b0\u00d9-,\u00ca\u00e3x.\u00f8y\u0018\u00cd\u00c1";
                        var19_6 = ":o$}>\u0082\u009d\u001b\u008d\u00e1K\u00cc\u00fe\u001e\u000f%\u0018\u000f\u0003\u00f0\u00fe\u00a9\u00c6\u009eT\u00c6-\u00b9m\u00dc\b\u0080d\u00cdvw\u00e7\u00d4Y\u00dd\u00ce\u0010\u00fdJv\u00ad\u00efS\u00dc=\u00a29\u00c4\u00d8\u00b9|\u00ad\u00cf8h\u007f-k|\u000eQl\u00ef\u0013ok\u00dcn[)\u0002\u0017\u00f4\u00cfZ\u0097\u001a\u0002L\u0099\u00ecZ5*n\u00f6R\u00f0\u00c6\u008c\u008a\u0018\u00f6\u001a\u0084\u00b4_\u00b7@\u00da\u009c+\u00ccu\u008a\u00ae\u0019\u000f\u00aaI\u0010\u00ac\u00b6\u001e&\u0099\u00a6\u00bc1\u0014\u00e2\u00a9YC\u00e3\u00ea\u00e7\u0010\u00b3\u0098\u00ad\u00e0\u00fc\u00ba.\u00b1\u008e\u00a0\u0090\u0013\u000e\u0094Va\u0010\u001f&L\u00dc\r\u00cb\u00ad\u00dfT\u00f4\u0003\u00a1$\u009fR\u00c3\u00103\u00f9\u001b\u00dc-\u00af\u0000\f\r\u0014,A\u00ee.\u00926\u0010C\u00ed\u00ee<3|wM9P\u00e2]\u0004\u00ba\u00a0V\u0010H\u00a4\t\u00b0\u00d9-,\u00ca\u00e3x.\u00f8y\u0018\u00cd\u00c1".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = ke.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00ecT\u008b\u00c2\u009f\u00a3\u0091\u001f\u0091xd\u0017t\u0005\u0000U|\u00aeB\u00dc\u00d6\u00fe\u00b4\u0017>!\u00c48\u0085\u0005\u00cdnaX\u00f5\u0084Kg{\u00ea\u009fw\u00aa\u00bb\u00f3;7\u00f0\u0010s,S\u0088\r\u00e7\u00a3~\u0000\u00cb\u00ba\u00c8m\u00c5\u0097p";
                            var19_6 = "\u00ecT\u008b\u00c2\u009f\u00a3\u0091\u001f\u0091xd\u0017t\u0005\u0000U|\u00aeB\u00dc\u00d6\u00fe\u00b4\u0017>!\u00c48\u0085\u0005\u00cdnaX\u00f5\u0084Kg{\u00ea\u009fw\u00aa\u00bb\u00f3;7\u00f0\u0010s,S\u0088\r\u00e7\u00a3~\u0000\u00cb\u00ba\u00c8m\u00c5\u0097p".length();
                            var16_7 = 48;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = ke.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
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
                ke.c = var20_3;
                ke.d = new String[12];
                ke.k = new HashMap<K, V>(13);
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
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "\u009b\"\tf\u00db\rb\u00bf\u00e0p\u00fa\u001a\u00e02\u009d\u0013";
                var5_15 = "\u009b\"\tf\u00db\rb\u00bf\u00e0p\u00fa\u001a\u00e02\u009d\u0013".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00f1\u00ebnYzTm\u009c\u00ad'\u008d\u00f7\fIK\u001c";
                    var5_15 = "\u00f1\u00ebnYzTm\u009c\u00ad'\u008d\u00f7\fIK\u001c".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl104:
                // 1 sources

                ** continue;
            }
        }
        ke.i = var6_12;
        ke.j = new Integer[4];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1101;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ke", exception);
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
            ke.d[n11] = ke.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ke.b(n10, l10);
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
            throw new RuntimeException("com/zelix/ke" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4C60;
        if (j[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = i[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ke", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ke.j[n11] = n12;
        }
        return j[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ke.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ke" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ke.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ke.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

