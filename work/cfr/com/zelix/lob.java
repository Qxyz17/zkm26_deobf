/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.IOException;
import java.io.Reader;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lob {
    protected boolean w;
    protected int L;
    protected int y;
    protected int[] v;
    int W;
    protected int[] V;
    int k;
    protected int b;
    protected boolean R;
    protected int X;
    int i;
    public int o;
    protected Reader I;
    protected char[] t;
    protected int s;
    private static final long a;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;

    public char d(Object[] objectArray) {
        Object object;
        long l10;
        long l11;
        block17: {
            block18: {
                CallSite callSite;
                long l12;
                block13: {
                    block14: {
                        int n10;
                        block15: {
                            block16: {
                                l11 = (Long)objectArray[0];
                                long l13 = l11 = a ^ l11;
                                l10 = l13 ^ 0x82A6FF7AD71L;
                                l12 = l13 ^ 0x8C8ABF9097L;
                                callSite = m44.a("j", (long)176935645334458700L, (long)l11);
                                try {
                                    try {
                                        try {
                                            try {
                                                object = m44.a("t", (Object)this, (long)1889031438968178580L, (long)l11);
                                                if (callSite != false) break block13;
                                                if (object <= 0) break block14;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("j", (Object)n92, (long)199287762109417676L, (long)l11);
                                            }
                                            lob lob2 = this;
                                            m44.a("v", (Object)lob2, (int)(m44.a("t", (Object)lob2, (long)1889031438968178580L, (long)l11) - true), (long)1889031438968178580L, (long)l11);
                                            n10 = this.o = this.o + 1;
                                            if (callSite != false) break block15;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("j", (Object)n93, (long)199287762109417676L, (long)l11);
                                        }
                                        if (n10 != m44.a("t", (Object)this, (long)415441654599437579L, (long)l11)) break block16;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("j", (Object)n94, (long)199287762109417676L, (long)l11);
                                    }
                                    this.o = 0;
                                }
                                catch (n9 n95) {
                                    throw m44.a("j", (Object)n95, (long)199287762109417676L, (long)l11);
                                }
                            }
                            n10 = (int)m44.a("t", (Object)this, (long)234287840525203223L, (long)l11)[this.o];
                        }
                        return (char)n10;
                    }
                    int n11 = this.o + 1;
                    object = n11;
                    this.o = n11;
                }
                try {
                    try {
                        CallSite callSite2 = callSite;
                        if (l11 >= 0L) {
                            if (callSite2 != false) break block17;
                            callSite2 = m44.a("t", (Object)this, (long)248329401689853705L, (long)l11);
                        }
                        if (object < callSite2) break block18;
                    }
                    catch (n9 n96) {
                        throw m44.a("j", (Object)n96, (long)199287762109417676L, (long)l11);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l12;
                    m44.a("u", (Object)this, (Object)objectArray2, (long)1786362624335676256L, (long)l11);
                }
                catch (n9 n97) {
                    throw m44.a("j", (Object)n97, (long)199287762109417676L, (long)l11);
                }
            }
            object = m44.a("t", (Object)this, (long)234287840525203223L, (long)l11)[this.o];
        }
        Object object2 = object;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = (int)object2;
        objectArray3[0] = l10;
        m44.a("u", (Object)this, (Object)objectArray3, (long)266813452115723340L, (long)l11);
        return (char)object2;
    }

    /*
     * Exception decompiling
     */
    protected void P(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[TRYBLOCK]], but top level block is 11[SWITCH]
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
    protected void e(Object[] var1_1) {
        block9: {
            var2_2 = (Long)var1_1[0];
            var4_3 = (Boolean)var1_1[1];
            var2_2 = lob.a ^ var2_2;
            var6_4 = new char[m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) + lob.a("l", (int)15271, (long)(3339092750385198027L ^ var2_2))];
            var5_5 = m44.a("i", (long)8797779483876174127L, (long)var2_2);
            var7_6 = new int[m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) + lob.a("l", (int)22637, (long)(3860053170589880323L ^ var2_2))];
            var8_7 = new int[m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) + lob.a("l", (int)22637, (long)(3860053170589880323L ^ var2_2))];
            try {
                block8: {
                    block10: {
                        if (var5_5 != false) break block8;
                        if (!var4_3) ** GOTO lbl33
                        break block10;
                        catch (Throwable v0) {
                            throw m44.a("i", (Object)v0, (long)8838143784961585327L, (long)var2_2);
                        }
                    }
                    try {
                        block11: {
                            System.arraycopy(m44.a("w", (Object)this, (long)8873002037111541620L, (long)var2_2), (int)m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2), var6_4, 0, (int)(m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) - m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2)));
                            System.arraycopy(m44.a("w", (Object)this, (long)8873002037111541620L, (long)var2_2), 0, var6_4, (int)(m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) - m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2)), this.o);
                            m44.a("u", (Object)this, (char[])var6_4, (long)8873002037111541620L, (long)var2_2);
                            System.arraycopy(m44.a("w", (Object)this, (long)7213656388004059536L, (long)var2_2), (int)m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2), var7_6, 0, (int)(m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) - m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2)));
                            System.arraycopy(m44.a("w", (Object)this, (long)7213656388004059536L, (long)var2_2), 0, var7_6, (int)(m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) - m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2)), this.o);
                            m44.a("u", (Object)this, (int[])var7_6, (long)7213656388004059536L, (long)var2_2);
                            System.arraycopy(m44.a("w", (Object)this, (long)7154876104727288979L, (long)var2_2), (int)m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2), var8_7, 0, (int)(m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) - m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2)));
                            System.arraycopy(m44.a("w", (Object)this, (long)7154876104727288979L, (long)var2_2), 0, var8_7, (int)(m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) - m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2)), this.o);
                            m44.a("u", (Object)this, (int[])var8_7, (long)7154876104727288979L, (long)var2_2);
                            m44.a("u", (Object)this, (int)(this.o += m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) - m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2)), (long)8867967674998142826L, (long)var2_2);
                            if (var5_5 == false) break block9;
                            break block11;
                            catch (Throwable v1) {
                                throw m44.a("i", (Object)v1, (long)8838143784961585327L, (long)var2_2);
                            }
                        }
                        System.arraycopy(m44.a("w", (Object)this, (long)8873002037111541620L, (long)var2_2), (int)m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2), var6_4, 0, (int)(m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) - m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2)));
                        m44.a("u", (Object)this, (char[])var6_4, (long)8873002037111541620L, (long)var2_2);
                        System.arraycopy(m44.a("w", (Object)this, (long)7213656388004059536L, (long)var2_2), (int)m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2), var7_6, 0, (int)(m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) - m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2)));
                        m44.a("u", (Object)this, (int[])var7_6, (long)7213656388004059536L, (long)var2_2);
                        System.arraycopy(m44.a("w", (Object)this, (long)7154876104727288979L, (long)var2_2), (int)m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2), var8_7, 0, (int)(m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2) - m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2)));
                        m44.a("u", (Object)this, (int[])var8_7, (long)7154876104727288979L, (long)var2_2);
                    }
                    catch (Throwable v2) {
                        throw m44.a("i", (Object)v2, (long)8838143784961585327L, (long)var2_2);
                    }
                }
                m44.a("u", (Object)this, (int)(this.o -= m44.a("w", (Object)this, (long)9088444470175373312L, (long)var2_2)), (long)8867967674998142826L, (long)var2_2);
            }
            catch (Throwable var9_8) {
                throw new Error((String)m44.a("v", (Object)var9_8, (long)7315298740620514308L, (long)var2_2));
            }
        }
        v3 = this;
        m44.a("u", (Object)v3, (int)(m44.a("w", (Object)v3, (long)9052400315527574888L, (long)var2_2) + lob.a("l", (int)22637, (long)(3860053170589880323L ^ var2_2))), (long)9052400315527574888L, (long)var2_2);
        m44.a("u", (Object)this, (int)m44.a("w", (Object)this, (long)9052400315527574888L, (long)var2_2), (long)8991788515249261466L, (long)var2_2);
        m44.a("u", (Object)this, (int)0, (long)9088444470175373312L, (long)var2_2);
    }

    public lob(Reader reader, int n10, int n11, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x1E895A70F790L;
        this(l11, reader, n10, n11, (int)lob.a("l", (int)5079, (long)(0x5CAF9106AAC15EA4L ^ l10)));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void J(Object[] var1_1) {
        block44: {
            block49: {
                block50: {
                    block48: {
                        block63: {
                            block62: {
                                block45: {
                                    block47: {
                                        block46: {
                                            block59: {
                                                block58: {
                                                    block57: {
                                                        block56: {
                                                            block55: {
                                                                block54: {
                                                                    var2_2 = (Long)var1_1[0];
                                                                    v0 = var2_2 = lob.a ^ var2_2;
                                                                    var4_3 = v0 ^ 11059782961069L;
                                                                    var6_4 = v0 ^ 113624674003188L;
                                                                    var8_5 = m44.a("j", (long)-4133483804234529180L, (long)var2_2);
                                                                    v1 = m44.a("t", (Object)this, (long)-2314284423432268903L, (long)var2_2);
                                                                    v2 = m44.a("t", (Object)this, (long)-2865948482413383831L, (long)var2_2);
                                                                    if (var8_5 == false) ** GOTO lbl167
                                                                    if (v1 != v2) break block44;
                                                                    break block54;
                                                                    catch (IOException v3) {
                                                                        throw m44.a("j", (Object)v3, (long)-2426243949367225252L, (long)var2_2);
                                                                    }
                                                                }
                                                                v4 = m44.a("t", (Object)this, (long)-2865948482413383831L, (long)var2_2);
                                                                v5 = m44.a("t", (Object)this, (long)-2786658165744791141L, (long)var2_2);
                                                                v6 = var8_5;
                                                                if (var2_2 < 0L) ** GOTO lbl108
                                                                if (v6 == false) break block45;
                                                                break block55;
                                                                catch (IOException v7) {
                                                                    throw m44.a("j", (Object)v7, (long)-2426243949367225252L, (long)var2_2);
                                                                }
                                                            }
                                                            if (var2_2 < 0L) break block45;
                                                            if (v4 != v5) ** GOTO lbl99
                                                            break block56;
                                                            catch (IOException v8) {
                                                                throw m44.a("j", (Object)v8, (long)-2426243949367225252L, (long)var2_2);
                                                            }
                                                        }
                                                        v9 = m44.a("t", (Object)this, (long)-2678516846921368333L, (long)var2_2);
                                                        if (var2_2 < 0L || var8_5 == false) break block46;
                                                        break block57;
                                                        catch (IOException v10) {
                                                            throw m44.a("j", (Object)v10, (long)-2426243949367225252L, (long)var2_2);
                                                        }
                                                    }
                                                    if (v9 <= lob.a("l", (int)22637, (long)(3860133406177359088L ^ var2_2))) ** GOTO lbl58
                                                    break block58;
                                                    catch (IOException v11) {
                                                        throw m44.a("j", (Object)v11, (long)-2426243949367225252L, (long)var2_2);
                                                    }
                                                }
                                                m44.a("v", (Object)this, (int)0, (long)-2314284423432268903L, (long)var2_2);
                                                this.o = 0;
                                                m44.a("v", (Object)this, (int)m44.a("t", (Object)this, (long)-2678516846921368333L, (long)var2_2), (long)-2865948482413383831L, (long)var2_2);
                                                v9 = var8_5;
                                                if (var2_2 <= 0L) ** GOTO lbl165
                                                if (v9 != false) break block44;
                                                break block59;
                                                catch (IOException v12) {
                                                    throw m44.a("j", (Object)v12, (long)-2426243949367225252L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                block60: {
                                                    v13 = this;
                                                    if (var2_2 < 0L || var8_5 == false) break block47;
                                                    break block60;
                                                    catch (IOException v14) {
                                                        throw m44.a("j", (Object)v14, (long)-2426243949367225252L, (long)var2_2);
                                                    }
                                                }
                                                v9 = m44.a("t", (Object)v13, (long)-2678516846921368333L, (long)var2_2);
                                            }
                                            catch (IOException v15) {
                                                throw m44.a("j", (Object)v15, (long)-2426243949367225252L, (long)var2_2);
                                            }
                                        }
                                        if (var2_2 <= 0L) ** GOTO lbl78
                                        if (v9 >= 0) ** GOTO lbl83
                                        try {
                                            block61: {
                                                m44.a("v", (Object)this, (int)0, (long)-2314284423432268903L, (long)var2_2);
                                                this.o = 0;
                                                v9 = var8_5;
lbl78:
                                                // 2 sources

                                                if (var2_2 < 0L) ** GOTO lbl165
                                                if (v9 != false) break block44;
                                                break block61;
                                                catch (IOException v16) {
                                                    throw m44.a("j", (Object)v16, (long)-2426243949367225252L, (long)var2_2);
                                                }
                                            }
                                            v13 = this;
                                        }
                                        catch (IOException v17) {
                                            throw m44.a("j", (Object)v17, (long)-2426243949367225252L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        v18 = new Object[2];
                                        v18[1] = false;
                                        v18[0] = var6_4;
                                        m44.a("u", (Object)v13, (Object)v18, (long)-4493298724536746213L, (long)var2_2);
                                        v9 = var8_5;
                                        if (var2_2 >= 0L) {
                                            if (v9 != false) break block44;
                                        }
                                        ** GOTO lbl165
lbl99:
                                        // 2 sources

                                        v4 = m44.a("t", (Object)this, (long)-2865948482413383831L, (long)var2_2);
                                        v5 = m44.a("t", (Object)this, (long)-2678516846921368333L, (long)var2_2);
                                    }
                                    catch (IOException v19) {
                                        throw m44.a("j", (Object)v19, (long)-2426243949367225252L, (long)var2_2);
                                    }
                                }
                                if (var2_2 <= 0L) break block48;
                                v6 = var8_5;
lbl108:
                                // 2 sources

                                if (v6 == false) break block48;
                                if (v4 <= v5) ** GOTO lbl123
                                break block62;
                                catch (IOException v20) {
                                    throw m44.a("j", (Object)v20, (long)-2426243949367225252L, (long)var2_2);
                                }
                            }
                            m44.a("v", (Object)this, (int)m44.a("t", (Object)this, (long)-2786658165744791141L, (long)var2_2), (long)-2865948482413383831L, (long)var2_2);
                            v9 = var8_5;
                            if (var2_2 <= 0L) ** GOTO lbl165
                            if (v9 != false) break block44;
                            break block63;
                            catch (IOException v21) {
                                throw m44.a("j", (Object)v21, (long)-2426243949367225252L, (long)var2_2);
                            }
                        }
                        try {
                            block64: {
                                v22 = this;
                                v23 = var8_5;
                                if (var2_2 < 0L) break block49;
                                if (v23 == false) break block50;
                                break block64;
                                catch (IOException v24) {
                                    throw m44.a("j", (Object)v24, (long)-2426243949367225252L, (long)var2_2);
                                }
                            }
                            v4 = m44.a("t", (Object)v22, (long)-2678516846921368333L, (long)var2_2) - m44.a("t", (Object)this, (long)-2865948482413383831L, (long)var2_2);
                            v5 = lob.a("l", (int)22637, (long)(3860133406177359088L ^ var2_2));
                        }
                        catch (IOException v25) {
                            throw m44.a("j", (Object)v25, (long)-2426243949367225252L, (long)var2_2);
                        }
                    }
                    if (v4 >= v5) ** GOTO lbl153
                    try {
                        block65: {
                            v26 = new Object[2];
                            v26[1] = true;
                            v26[0] = var6_4;
                            m44.a("u", (Object)this, (Object)v26, (long)-4493298724536746213L, (long)var2_2);
                            v9 = var8_5;
                            if (var2_2 < 0L) ** GOTO lbl165
                            if (v9 != false) break block44;
                            break block65;
                            catch (IOException v27) {
                                throw m44.a("j", (Object)v27, (long)-2426243949367225252L, (long)var2_2);
                            }
                        }
                        v22 = this;
                    }
                    catch (IOException v28) {
                        throw m44.a("j", (Object)v28, (long)-2426243949367225252L, (long)var2_2);
                    }
                }
                v23 = m44.a("t", (Object)this, (long)-2678516846921368333L, (long)var2_2);
            }
            m44.a("v", (Object)v22, (int)v23, (long)-2865948482413383831L, (long)var2_2);
        }
        try {
            v9 = m44.a("u", (Object)m44.a("t", (Object)this, (long)-2638964424826301051L, (long)var2_2), (Object)m44.a("t", (Object)this, (long)-2319240151405335673L, (long)var2_2), (int)m44.a("t", (Object)this, (long)-2314284423432268903L, (long)var2_2), (int)(m44.a("t", (Object)this, (long)-2865948482413383831L, (long)var2_2) - m44.a("t", (Object)this, (long)-2314284423432268903L, (long)var2_2)), (long)-2870604649695342715L, (long)var2_2);
lbl165:
            // 6 sources

            v2 = v9;
            v1 = v9;
lbl167:
            // 2 sources

            var9_6 = v2;
            try {
                if (v1 == -1) {
                    m44.a("u", (Object)m44.a("t", (Object)this, (long)-2638964424826301051L, (long)var2_2), (long)-4250736086195702927L, (long)var2_2);
                    throw new IOException();
                }
            }
            catch (IOException v29) {
                throw m44.a("j", (Object)v29, (long)-2426243949367225252L, (long)var2_2);
            }
            v30 = this;
            m44.a("v", (Object)v30, (int)(m44.a("t", (Object)v30, (long)-2314284423432268903L, (long)var2_2) + var9_6), (long)-2314284423432268903L, (long)var2_2);
            return;
        }
        catch (IOException var10_7) {
            block53: {
                block51: {
                    block52: {
                        try {
                            try {
                                --this.o;
                                v31 = new Object[2];
                                v31[1] = 0;
                                v31[0] = var4_3;
                                m44.a("u", (Object)this, (Object)v31, (long)-2321347253047110642L, (long)var2_2);
                                v32 = this;
                                v33 /* !! */  = var8_5;
                                if (var2_2 < 0L) break block51;
                                if (v33 /* !! */  == false) break block52;
                                if (m44.a("t", (Object)v32, (long)-2678516846921368333L, (long)var2_2) != -1) break block53;
                            }
                            catch (IOException v34) {
                                throw m44.a("j", (Object)v34, (long)-2426243949367225252L, (long)var2_2);
                            }
                            v32 = this;
                        }
                        catch (IOException v35) {
                            throw m44.a("j", (Object)v35, (long)-2426243949367225252L, (long)var2_2);
                        }
                    }
                    v33 /* !! */  = (CallSite)this.o;
                }
                m44.a("v", (Object)v32, (int)v33 /* !! */ , (long)-2678516846921368333L, (long)var2_2);
            }
            throw var10_7;
        }
    }

    public int l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("s", (Object)this, (long)9173869297504256732L, (long)l10)[this.o];
    }

    public String n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            if (this.o >= m44.a("v", (Object)this, (long)-7270556608372310727L, (long)l10)) {
                return new String((char[])m44.a("v", (Object)this, (long)-7054234565612000691L, (long)l10), (int)m44.a("v", (Object)this, (long)-7270556608372310727L, (long)l10), this.o - m44.a("v", (Object)this, (long)-7270556608372310727L, (long)l10) + 1);
            }
        }
        catch (n9 n92) {
            throw m44.a("h", (Object)n92, (long)-6945100738720311914L, (long)l10);
        }
        return new String((char[])m44.a("v", (Object)this, (long)-7054234565612000691L, (long)l10), (int)m44.a("v", (Object)this, (long)-7270556608372310727L, (long)l10), (int)(m44.a("v", (Object)this, (long)-7450649784776109999L, (long)l10) - m44.a("v", (Object)this, (long)-7270556608372310727L, (long)l10))) + new String((char[])m44.a("v", (Object)this, (long)-7054234565612000691L, (long)l10), 0, this.o + 1);
    }

    public int f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("w", (Object)this, (long)-8895938413150356653L, (long)l10)[m44.a("w", (Object)this, (long)-7358641160548352064L, (long)l10)];
    }

    public int i(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("u", (Object)this, (long)-6481166685863912574L, (long)l10)[m44.a("u", (Object)this, (long)-4885579412535027182L, (long)l10)];
    }

    public char g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x4F5C22DC0433L;
        m44.a("r", (Object)this, (int)-1, (long)5654182259590801495L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        CallSite callSite = m44.a("q", (Object)this, (Object)objectArray2, (long)5641099269837774929L, (long)l10);
        m44.a("r", (Object)this, (int)this.o, (long)5654182259590801495L, (long)l10);
        return (char)callSite;
    }

    public char[] N(Object[] objectArray) {
        Object object;
        block8: {
            char[] cArray;
            block9: {
                lob lob2;
                int n10;
                long l10;
                block6: {
                    l10 = (Long)objectArray[0];
                    n10 = (Integer)objectArray[1];
                    l10 = a ^ l10;
                    cArray = new char[n10];
                    CallSite callSite = m44.a("m", (long)-2948774042434730965L, (long)l10);
                    try {
                        block7: {
                            try {
                                try {
                                    lob2 = this;
                                    if (callSite != false) break block6;
                                    if (lob2.o + 1 < n10) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("m", (Object)n92, (long)-2908410014088061525L, (long)l10);
                                }
                                object = m44.a("s", (Object)this, (long)-3015414877499399568L, (long)l10);
                                if (l10 <= 0L) break block8;
                                System.arraycopy(object, this.o - n10 + 1, cArray, 0, n10);
                                if (callSite == false) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("m", (Object)n93, (long)-2908410014088061525L, (long)l10);
                            }
                        }
                        System.arraycopy(m44.a("s", (Object)this, (long)-3015414877499399568L, (long)l10), (int)(m44.a("s", (Object)this, (long)-3412406550994216852L, (long)l10) - (n10 - this.o - 1)), cArray, 0, n10 - this.o - 1);
                        lob2 = this;
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)n94, (long)-2908410014088061525L, (long)l10);
                    }
                }
                System.arraycopy(m44.a("s", (Object)lob2, (long)-3015414877499399568L, (long)l10), 0, cArray, n10 - this.o - 1, this.o + 1);
            }
            object = cArray;
        }
        return object;
    }

    public void f(Object[] objectArray) {
        block5: {
            int n10;
            block4: {
                long l10 = (Long)objectArray[0];
                int n11 = (Integer)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("h", (long)-3672443394718806578L, (long)l10);
                lob lob2 = this;
                m44.a("t", (Object)lob2, (int)(m44.a("v", (Object)lob2, (long)-3671213703875882834L, (long)l10) + n11), (long)-3671213703875882834L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    lob lob3;
                    try {
                        lob lob4 = this;
                        lob3 = lob4;
                        n10 = lob4.o - n11;
                        if (callSite2 == false) break block4;
                        lob3.o = n10;
                        if (n10 >= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-3026971272047386634L, (long)l10);
                    }
                    lob lob5 = this;
                    lob3 = lob5;
                    n10 = lob5.o + m44.a("v", (Object)this, (long)-3244285562326345167L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-3026971272047386634L, (long)l10);
                }
            }
            lob3.o = n10;
        }
    }

    public lob(long l10, Reader reader, int n10, int n11, int n12) {
        l10 = a ^ l10;
        this.o = -1;
        m44.a("s", (Object)this, (int)0, (long)80227360635714952L, (long)l10);
        m44.a("s", (Object)this, (int)1, (long)1913956535406394011L, (long)l10);
        m44.a("s", (Object)this, (boolean)false, (long)2039322724774864158L, (long)l10);
        m44.a("s", (Object)this, (boolean)false, (long)1904100445142630186L, (long)l10);
        m44.a("s", (Object)this, (int)0, (long)405047787850582500L, (long)l10);
        m44.a("s", (Object)this, (int)0, (long)2078985734028018041L, (long)l10);
        m44.a("s", (Object)this, (int)lob.a("l", (int)3277, (long)(0x16A7E00E6067FA2CL ^ l10)), (long)2242557866206898814L, (long)l10);
        m44.a("s", (Object)this, (Reader)reader, (long)80367236323741688L, (long)l10);
        m44.a("s", (Object)this, (int)n10, (long)1913956535406394011L, (long)l10);
        m44.a("s", (Object)this, (int)(n11 - 1), (long)80227360635714952L, (long)l10);
        int n13 = n12;
        m44.a("s", (Object)this, (int)n13, (long)229344298438151142L, (long)l10);
        m44.a("s", (Object)this, (int)n13, (long)164132136944923924L, (long)l10);
        m44.a("s", (Object)this, (char[])new char[n12], (long)409089914002780666L, (long)l10);
        m44.a("s", (Object)this, (int[])new int[n12], (long)1914684117198890782L, (long)l10);
        m44.a("s", (Object)this, (int[])new int[n12], (long)2145231453959365149L, (long)l10);
    }

    public int Z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("w", (Object)this, (long)6441084853588551355L, (long)l10)[this.o];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                lob.a = prr.a(-4576473966580846800L, 2259959811861740696L, MethodHandles.lookup().lookupClass()).a(262276355494584L);
                lob.e = new HashMap<K, V>(13);
                var0 = lob.a ^ 80509418600919L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "h\u00f0\u0095j\u0083lx$\u00ecC^\u008d\u007f\u00dd\u00ec<x?;S\u0090QE<";
                var7_6 = "h\u00f0\u0095j\u0083lx$\u00ecC^\u008d\u007f\u00dd\u00ec<x?;S\u0090QE<".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u001c\b`\u00b8\u00a4A66\u001c\u00de+<\u00f1\u00a8x\u00bb";
                    var7_6 = "\u001c\b`\u00b8\u00a4A66\u001c\u00de+<\u00f1\u00a8x\u00bb".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        lob.c = var8_3;
        lob.d = new Integer[5];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x66A0;
        if (d[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lob", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lob.d[n11] = n12;
        }
        return d[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lob.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lob" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lob.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

