/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._v;
import com.zelix.b1;
import com.zelix.bc;
import com.zelix.f8;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.hf;
import com.zelix.js;
import com.zelix.k_;
import com.zelix.kc;
import com.zelix.kg;
import com.zelix.kw;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.loe;
import com.zelix.lqu;
import com.zelix.lw2;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.qr;
import com.zelix.un;
import com.zelix.x8;
import java.io.IOException;
import java.io.PrintWriter;
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

public class b9
extends b1 {
    private static int m;
    private int K;
    private static final long c;
    private static final String[] n;
    private static final String[] p;
    private static final Map q;

    /*
     * Loose catch block
     * Could not resolve type clashes
     */
    @Override
    public void h(Object[] objectArray) {
        block20: {
            b9 b92;
            kw kw2;
            CallSite callSite;
            long l10;
            long l11;
            long l12;
            Set set;
            block25: {
                CallSite callSite2;
                int n10;
                block21: {
                    block22: {
                        kw kw3;
                        long l13;
                        Set set2;
                        Set set3;
                        Set set4;
                        block23: {
                            block24: {
                                long l14;
                                long l15;
                                long l16;
                                block27: {
                                    block19: {
                                        set4 = (Set)objectArray[0];
                                        set = (Set)objectArray[1];
                                        set3 = (Set)objectArray[2];
                                        l12 = (Long)objectArray[3];
                                        set2 = (Set)objectArray[4];
                                        long l17 = l12;
                                        l16 = l17 ^ 0x6CA411FF191L;
                                        l11 = l17 ^ 0x350B9130A9C6L;
                                        l15 = l17 ^ 0x7590928A4C10L;
                                        l14 = l17 ^ 0xEACB56A5B6EL;
                                        l13 = l17 ^ 0x542A748514E5L;
                                        l10 = l17 ^ 0x2E430B7A2445L;
                                        callSite = m44.a("o", (long)4501013693373304638L, (long)l12);
                                        n10 = set2.add(this);
                                        if (callSite == false) break block19;
                                        try {
                                            block26: {
                                                if (n10 == false) break block20;
                                                break block26;
                                                catch (IOException iOException) {
                                                    throw m44.a("o", (Object)iOException, (long)4561349565266835537L, (long)l12);
                                                }
                                            }
                                            n10 = m44.a("q", (Object)this, (long)4411591988893740335L, (long)l12);
                                        }
                                        catch (IOException iOException) {
                                            throw m44.a("o", (Object)iOException, (long)4561349565266835537L, (long)l12);
                                        }
                                    }
                                    callSite2 = m44.a("k", (long)4158516706599933150L, (long)l12);
                                    if (callSite == false) break block21;
                                    if (n10 == callSite2) break block22;
                                    break block27;
                                    catch (IOException iOException) {
                                        throw m44.a("o", (Object)iOException, (long)4561349565266835537L, (long)l12);
                                    }
                                }
                                try {
                                    block28: {
                                        kw3 = this.T[m44.a("q", (Object)this, (long)4411591988893740335L, (long)l12)];
                                        if (callSite == false) break block23;
                                        break block28;
                                        catch (IOException iOException) {
                                            throw m44.a("o", (Object)iOException, (long)4561349565266835537L, (long)l12);
                                        }
                                    }
                                    if (!(kw3 instanceof kc)) break block24;
                                }
                                catch (IOException iOException) {
                                    throw m44.a("o", (Object)iOException, (long)4561349565266835537L, (long)l12);
                                }
                                try {
                                    kw2 = new k_(l15, (kc)this.T[m44.a("q", (Object)this, (long)4411591988893740335L, (long)l12)]);
                                    this.T[m44.a("q", (Object)this, (long)4411591988893740335L, (long)l12)] = kw2;
                                }
                                catch (IOException iOException) {
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l16;
                                    throw new un((String)((Object)b9.c("v", (int)16599, (long)(0x5598D24F2AF92286L ^ l12))) + (String)((Object)m44.a("p", (Object)this, (Object)objectArray2, (long)2869824055269981932L, (long)l12)) + (String)((Object)b9.c("v", (int)2057, (long)(0x67B0962645CB6A5EL ^ l12))) + this.f(l14) + (String)((Object)b9.c("v", (int)16713, (long)(0x3D431ED377AB231FL ^ l12))) + (String)((Object)m44.a("p", (Object)iOException, (long)2812958440281687961L, (long)l12)), iOException);
                                }
                            }
                            kw3 = this.T[m44.a("q", (Object)this, (long)4411591988893740335L, (long)l12)];
                        }
                        kw2 = (k_)kw3;
                        Object[] objectArray3 = new Object[5];
                        objectArray3[4] = l13;
                        objectArray3[3] = set2;
                        objectArray3[2] = set3;
                        objectArray3[1] = set;
                        objectArray3[0] = set4;
                        m44.a("p", (Object)kw2, (Object)objectArray3, (long)4505015273546591277L, (long)l12);
                    }
                    try {
                        b92 = this;
                        if (callSite == false) break block25;
                        n10 = b92.P;
                        callSite2 = m44.a("k", (long)4158516706599933150L, (long)l12);
                    }
                    catch (IOException iOException) {
                        throw m44.a("o", (Object)iOException, (long)4561349565266835537L, (long)l12);
                    }
                }
                if (n10 == callSite2) break block20;
                b92 = this;
            }
            kw2 = (kg)b92.T[this.P];
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l10;
            CallSite callSite3 = m44.a("p", (Object)kw2, (Object)objectArray4, (long)4153822371065035905L, (long)l12);
            while (callSite3.hasMoreElements()) {
                String string = (String)callSite3.nextElement();
                _v _v2 = l62.G(l11, string);
                try {
                    if (l12 >= 0L && _v2 != null) {
                        set.add(_v2);
                    }
                }
                catch (IOException iOException) {
                    throw m44.a("o", (Object)iOException, (long)4561349565266835537L, (long)l12);
                }
                if (callSite != false) continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public b9(long var1_1, _v var3_2, x8 var4_3, x8 var5_4, kw[] var6_5, boolean var7_6, int var8_7) {
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

    @Override
    public void v(Object[] objectArray) {
        hf hf2 = (hf)objectArray[0];
        qr qr2 = (qr)objectArray[1];
        kw kw2 = (kw)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
        PrintWriter printWriter = (PrintWriter)objectArray[4];
        long l10 = (Long)objectArray[5];
    }

    @Override
    public final boolean J() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public bc z(Object[] var1_1) {
        block12: {
            block14: {
                block13: {
                    block11: {
                        block15: {
                            var2_2 = (Long)var1_1[0];
                            v0 = var2_2;
                            var4_3 = v0 ^ 60859083425987L;
                            var6_4 = v0 ^ 74779937289538L;
                            var8_5 = v0 ^ 69540494516796L;
                            var10_6 = m44.a("m", (long)5126470253571487340L, (long)var2_2);
                            v1 /* !! */  = m44.a("s", (Object)this, (long)4930084905534821501L, (long)var2_2);
                            if (var10_6 == false) break block11;
                            if (v1 /* !! */  == m44.a("i", (long)4675921115187113356L, (long)var2_2)) break block12;
                            break block15;
                            catch (IOException v2) {
                                throw m44.a("m", (Object)v2, (long)5052786790458441987L, (long)var2_2);
                            }
                        }
                        try {
                            block16: {
                                v3 = this.T[m44.a("s", (Object)this, (long)4930084905534821501L, (long)var2_2)];
                                if (var10_6 == false) break block13;
                                break block16;
                                catch (IOException v4) {
                                    throw m44.a("m", (Object)v4, (long)5052786790458441987L, (long)var2_2);
                                }
                            }
                            v1 /* !! */  = (CallSite)(v3 instanceof kc);
                        }
                        catch (IOException v5) {
                            throw m44.a("m", (Object)v5, (long)5052786790458441987L, (long)var2_2);
                        }
                    }
                    if (v1 /* !! */  == false) ** GOTO lbl47
                    try {
                        var11_7 = new k_(var6_4, (kc)this.T[m44.a("s", (Object)this, (long)4930084905534821501L, (long)var2_2)]);
                    }
                    catch (IOException var12_8) {
                        v6 = new Object[1];
                        v6[0] = var4_3;
                        throw new un((String)b9.c("v", (int)10270, (long)(5511180172570571548L ^ var2_2)) + (String)m44.a("r", (Object)this, (Object)v6, (long)6809891608493787070L, (long)var2_2) + (String)b9.c("v", (int)19336, (long)(5021955411935252623L ^ var2_2)) + this.f(var8_5) + (String)b9.c("v", (int)18126, (long)(7713973878244335048L ^ var2_2)) + (String)m44.a("r", (Object)var12_8, (long)6799190101461974731L, (long)var2_2), var12_8);
                    }
                    try {
                        block17: {
                            v7 = this.T;
                            v8 = m44.a("s", (Object)this, (long)4930084905534821501L, (long)var2_2);
                            if (var2_2 > 0L) {
                                v7[v8] = var11_7;
                                if (var10_6 != false) break block14;
                            }
                            break block17;
lbl47:
                            // 2 sources

                            v7 = this.T;
                            v8 = m44.a("s", (Object)this, (long)4930084905534821501L, (long)var2_2);
                        }
                        v3 = v7[v8];
                    }
                    catch (IOException v9) {
                        throw m44.a("m", (Object)v9, (long)5052786790458441987L, (long)var2_2);
                    }
                }
                var11_7 = (k_)v3;
            }
            return m44.a("r", (Object)var11_7, (Object)new Object[0], (long)4750115084983683044L, (long)var2_2);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void q(Object[] var1_1) {
        block15: {
            block16: {
                block18: {
                    block14: {
                        var4_2 = (Set)var1_1[0];
                        var5_3 = (Set)var1_1[1];
                        var2_4 = (Long)var1_1[2];
                        v0 = var2_4;
                        var6_5 = v0 ^ 22317500586608L;
                        var8_6 = v0 ^ 113347964200945L;
                        var10_7 = v0 ^ 30970048966799L;
                        var12_8 = v0 ^ 5745908190861L;
                        var14_9 = m44.a("n", (long)1555926176399189215L, (long)var2_4);
                        v1 /* !! */  = var4_2.add(this);
                        if (var14_9 == false) break block14;
                        try {
                            block17: {
                                if (!v1 /* !! */ ) break block15;
                                break block17;
                                catch (IOException v2) {
                                    throw m44.a("n", (Object)v2, (long)1489629096193463216L, (long)var2_4);
                                }
                            }
                            v1 /* !! */  = m44.a("p", (Object)this, (long)1646080010006972110L, (long)var2_4);
                        }
                        catch (IOException v3) {
                            throw m44.a("n", (Object)v3, (long)1489629096193463216L, (long)var2_4);
                        }
                    }
                    v4 = var14_9;
                    if (var2_4 <= 0L) ** GOTO lbl32
                    if (v4 == false) break block16;
                    v4 = m44.a("j", (long)1321549681700159295L, (long)var2_4);
lbl32:
                    // 2 sources

                    if (v1 /* !! */  == v4) break block15;
                    break block18;
                    catch (IOException v5) {
                        throw m44.a("n", (Object)v5, (long)1489629096193463216L, (long)var2_4);
                    }
                }
                try {
                    block19: {
                        v6 = this.T[m44.a("p", (Object)this, (long)1646080010006972110L, (long)var2_4)];
                        if (var14_9 == false) ** GOTO lbl61
                        break block19;
                        catch (IOException v7) {
                            throw m44.a("n", (Object)v7, (long)1489629096193463216L, (long)var2_4);
                        }
                    }
                    v1 /* !! */  = v6 instanceof kc;
                }
                catch (IOException v8) {
                    throw m44.a("n", (Object)v8, (long)1489629096193463216L, (long)var2_4);
                }
            }
            if (v1 /* !! */ ) {
                try {
                    var15_10 = new k_(var8_6, (kc)this.T[m44.a("p", (Object)this, (long)1646080010006972110L, (long)var2_4)]);
                    this.T[m44.a("p", (Object)this, (long)1646080010006972110L, (long)var2_4)] = var15_10;
                }
                catch (IOException var16_11) {
                    v9 = new Object[1];
                    v9[0] = var6_5;
                    throw new un((String)b9.c("v", (int)10270, (long)(5511146174989722031L ^ var2_4)) + (String)m44.a("q", (Object)this, (Object)v9, (long)878970775968863501L, (long)var2_4) + (String)b9.c("v", (int)19336, (long)(5021991610502414908L ^ var2_4)) + this.f(var10_7) + (String)b9.c("v", (int)18126, (long)(7714007875770126203L ^ var2_4)) + (String)m44.a("q", (Object)var16_11, (long)930187156188785784L, (long)var2_4), var16_11);
                }
            } else {
                v6 = this.T[m44.a("p", (Object)this, (long)1646080010006972110L, (long)var2_4)];
lbl61:
                // 2 sources

                var15_10 = (k_)v6;
            }
            v10 = new Object[3];
            v10[2] = var5_3;
            v10[1] = var12_8;
            v10[0] = var4_2;
            m44.a("q", (Object)var15_10, (Object)v10, (long)651542941704187669L, (long)var2_4);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    b9(long var1_1, _4 var3_2, h1 var4_3, l6q var5_4, l6q var6_5, l6q var7_6, PrintWriter var8_7, f8 var9_8) {
        block40: {
            block38: {
                block39: {
                    block36: {
                        block29: {
                            v0 = var1_1 = b9.c ^ var1_1;
                            v1 = v0 ^ 107011232721372L;
                            var10_9 = v1 >>> 16;
                            var12_10 = (int)(v1 << 48 >>> 48);
                            v2 = v0 ^ 46041134160875L;
                            var13_11 = (int)(v2 >>> 56);
                            var14_12 = (int)(v2 << 8 >>> 32);
                            var15_13 = (int)(v2 << 40 >>> 40);
                            var16_14 = v0 ^ 79979248688313L;
                            var18_15 = v0 ^ 50313525998384L;
                            v3 = v0 ^ 83341911647116L;
                            var20_16 = (int)(v3 >>> 32);
                            var21_17 = (int)(v3 << 32 >>> 48);
                            var22_18 = (int)(v3 << 48 >>> 48);
                            v4 = m44.a("i", (long)-7228047191121080489L, (long)var1_1);
                            super(var3_2, (byte)var13_11, var14_12, var15_13, var4_3, var5_4);
                            var23_19 = v4;
                            m44.a("u", (Object)this, (int)m44.a("m", (long)-8923753131005040320L, (long)var1_1), (long)-9176244024057999183L, (long)var1_1);
                            this.J = js.E(this.o, var10_9, (short)var12_10, true);
                            this.T = new kw[this.G];
                            var24_20 = 0;
                            while (var24_20 < this.T.length) {
                                block32: {
                                    block33: {
                                        block34: {
                                            block35: {
                                                block30: {
                                                    try {
                                                        try {
                                                            block31: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v5 = new Object[10];
                                                                            v5[9] = var22_18;
                                                                            v5[8] = var9_8;
                                                                            v5[7] = var8_7;
                                                                            v5[6] = var7_6;
                                                                            v5[5] = var6_5;
                                                                            v5[4] = var21_17;
                                                                            v5[3] = var20_16;
                                                                            v5[2] = var5_4;
                                                                            v5[1] = var4_3;
                                                                            v5[0] = this;
                                                                            this.T[var24_20] = m44.a("i", (Object)v5, (long)-9023126800278775144L, (long)var1_1);
lbl44:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                v6 = this;
                                                                                v7 /* !! */  = var23_19;
                                                                                if (var1_1 >= 0L) {
                                                                                    if (v7 /* !! */  != false) break block29;
                                                                                    v8 = v6.T[var24_20] instanceof kc;
                                                                                    if (var23_19 != false) break block30;
                                                                                }
                                                                                ** GOTO lbl98
                                                                                break;
                                                                            }
                                                                        }
                                                                        catch (n9 v9) {
                                                                            throw m44.a("i", (Object)v9, (long)-9019766239050070577L, (long)var1_1);
                                                                        }
                                                                        if (!v8) break block31;
                                                                    }
                                                                    catch (n9 v10) {
                                                                        throw m44.a("i", (Object)v10, (long)-9019766239050070577L, (long)var1_1);
                                                                    }
                                                                    m44.a("u", (Object)this, (int)var24_20, (long)-9176244024057999183L, (long)var1_1);
                                                                    v11 = var23_19;
                                                                    if (var1_1 < 0L) break block32;
                                                                    if (v11 == false) break block33;
                                                                }
                                                                catch (n9 v12) {
                                                                    throw m44.a("i", (Object)v12, (long)-9019766239050070577L, (long)var1_1);
                                                                }
                                                            }
                                                            v13 = this;
                                                            v14 /* !! */  = (int)var23_19;
                                                            if (var1_1 < 0L) break block34;
                                                            if (v14 /* !! */  != 0) break block35;
                                                        }
                                                        catch (n9 v15) {
                                                            throw m44.a("i", (Object)v15, (long)-9019766239050070577L, (long)var1_1);
                                                        }
                                                        v8 = v13.T[var24_20] instanceof kg;
                                                    }
                                                    catch (n9 v16) {
                                                        throw m44.a("i", (Object)v16, (long)-9019766239050070577L, (long)var1_1);
                                                    }
                                                }
                                                if (!v8) break block33;
                                                v13 = this;
                                            }
                                            v14 /* !! */  = var24_20;
                                        }
                                        v13.P = v14 /* !! */ ;
                                    }
                                    ++var24_20;
                                    v11 = var23_19;
                                }
                                if (v11 == false) continue;
                            }
                            ** while (var1_1 <= 0L)
lbl91:
                            // 1 sources

                            v6 = this;
                        }
                        try {
                            block37: {
                                try {
                                    try {
                                        try {
                                            v7 /* !! */  = var23_19;
lbl98:
                                            // 2 sources

                                            if (var1_1 >= 0L) {
                                                if (v7 /* !! */  != false) break block36;
                                                if (v6.J == null) break block37;
                                            }
                                            ** GOTO lbl127
                                        }
                                        catch (n9 v17) {
                                            throw m44.a("i", (Object)v17, (long)-9019766239050070577L, (long)var1_1);
                                        }
                                        v6 = this;
                                        v18 /* !! */  = var23_19;
                                        if (var1_1 <= 0L) break block38;
                                        if (v18 /* !! */  != false) break block39;
                                    }
                                    catch (n9 v19) {
                                        throw m44.a("i", (Object)v19, (long)-9019766239050070577L, (long)var1_1);
                                    }
                                    if (var1_1 < 0L) break block39;
                                    if (m44.a("i", v6.o, (boolean)true, (long)var16_14, (long)-9125298920164055967L, (long)var1_1) == null) {
                                    }
                                    ** GOTO lbl133
                                }
                                catch (n9 v20) {
                                    throw m44.a("i", (Object)v20, (long)-9019766239050070577L, (long)var1_1);
                                }
                            }
                            v6 = this;
                        }
                        catch (n9 v21) {
                            throw m44.a("i", (Object)v21, (long)-9019766239050070577L, (long)var1_1);
                        }
                    }
                    try {
                        if (var1_1 < 0L) break block39;
                        v7 /* !! */  = (CallSite)false;
lbl127:
                        // 2 sources

                        v22 = new Object[2];
                        v22[1] = var18_15;
                        v22[0] = (boolean)v7 /* !! */ ;
                        m44.a("v", (Object)v6, (Object)v22, (long)-7412082218319357664L, (long)var1_1);
                        if (var23_19 == false) break block40;
lbl133:
                        // 2 sources

                        v6 = this;
                    }
                    catch (n9 v23) {
                        throw m44.a("i", (Object)v23, (long)-9019766239050070577L, (long)var1_1);
                    }
                }
                v18 /* !! */  = (CallSite)true;
            }
            v24 = new Object[2];
            v24[1] = var18_15;
            v24[0] = (boolean)v18 /* !! */ ;
            m44.a("v", (Object)v6, (Object)v24, (long)-7412082218319357664L, (long)var1_1);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void J5(Object[] var1_1) {
        block10: {
            block8: {
                var2_2 = (Map)var1_1[0];
                var3_3 = (Long)var1_1[1];
                var5_4 = (lw2)var1_1[2];
                v0 = var3_3 = b9.c ^ var3_3;
                var6_5 = v0 ^ 10872404534251L;
                var8_6 = v0 ^ 38745688500722L;
                var10_7 = v0 ^ 60876862042843L;
                var12_8 = v0 ^ 33962026238331L;
                var14_9 = v0 ^ 90456545158009L;
                var17_10 = this.B(var8_6);
                var18_11 = (loe)var2_2.get(var17_10);
                var16_12 = m44.a("l", (long)3843239778272174514L, (long)var3_3);
                try {
                    v1 = var18_11;
                    if (var16_12 != false) break block8;
                    if (v1 != null) {
                    }
                    ** GOTO lbl49
                }
                catch (n9 v2) {
                    throw m44.a("l", (Object)v2, (long)3185845058808818474L, (long)var3_3);
                }
                v1 = var18_11;
            }
            try {
                block9: {
                    try {
                        v3 /* !! */  = v1.v().equals(this.Z(var10_7));
                        if (var3_3 > 0L) {
                            if (v3 /* !! */ ) break block9;
                            v4 = new Object[2];
                            v4[1] = var18_11.v();
                            v4[0] = var12_8;
                            m44.a("s", (Object)this, (Object)v4, (long)4016411785537821116L, (long)var3_3);
                            v5 = new Object[4];
                            v5[3] = var18_11.v();
                            v5[2] = var17_10.v();
                            v5[1] = this;
                            v5[0] = var14_9;
                            m44.a("s", (Object)var5_4, (Object)v5, (long)3381760058804282989L, (long)var3_3);
                            v3 /* !! */  = var16_12;
                        }
                        if (!v3 /* !! */ ) break block10;
                    }
                    catch (n9 v6) {
                        throw m44.a("l", (Object)v6, (long)3185845058808818474L, (long)var3_3);
                    }
                }
                v7 = new Object[4];
                v7[3] = m44.a("s", (Object)this, (long)var6_5, (long)3994712236256086862L, (long)var3_3);
                v7[2] = m44.a("s", (Object)this, (long)var6_5, (long)3994712236256086862L, (long)var3_3);
                v7[1] = this;
                v7[0] = var14_9;
                m44.a("s", (Object)var5_4, (Object)v7, (long)3381760058804282989L, (long)var3_3);
            }
            catch (n9 v8) {
                throw m44.a("l", (Object)v8, (long)3185845058808818474L, (long)var3_3);
            }
        }
    }

    @Override
    void z(gu gu2, long l10) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                b9.c = prr.a(-4978335152772984971L, 5869371174361662186L, MethodHandles.lookup().lookupClass()).a(144589192772031L);
                var9 = b9.c ^ 55259801663143L;
                b9.q = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[6];
                var5_4 = 0;
                var4_5 = "j\u00c5\u0095\u00e94\u00df\u001f\u00ab\u00f3\u00e3\u00ef\u0005\u00ba\u00e9mA\u00d3\u00fa\u001f\u00a7\u00a7\u0013O\u00d1G.2\u00e9\u0019\u00ef\u00e3\u00e3\u0010\u00c4\u00c7ri\u0002z\u00a9\u00b9\u00b8bq\u00aa\u00b4\u00fd\u00ff: \u008d\u00be56\u00eat\u00c2\u00cbO\u00fe.\u00b07U\u00a6\u00ee\u00b9\u00f9\u00b4\u00a5B1v 1\u0084qpgbss\u0010~\u00d74\u00bd\f\u00dd\u00e7\u00df\u00ec\u00ce\u00afk\u00d12\u00c0{";
                var6_6 = "j\u00c5\u0095\u00e94\u00df\u001f\u00ab\u00f3\u00e3\u00ef\u0005\u00ba\u00e9mA\u00d3\u00fa\u001f\u00a7\u00a7\u0013O\u00d1G.2\u00e9\u0019\u00ef\u00e3\u00e3\u0010\u00c4\u00c7ri\u0002z\u00a9\u00b9\u00b8bq\u00aa\u00b4\u00fd\u00ff: \u008d\u00be56\u00eat\u00c2\u00cbO\u00fe.\u00b07U\u00a6\u00ee\u00b9\u00f9\u00b4\u00a5B1v 1\u0084qpgbss\u0010~\u00d74\u00bd\f\u00dd\u00e7\u00df\u00ec\u00ce\u00afk\u00d12\u00c0{".length();
                var3_7 = 32;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = b9.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\n@\u00af\u00aa\u00c0\u00a2\u00e8\u00ae/\u00d8\u00e2V\u0014\u00c5\u008f\u00d8\u00b6\u00d5\u00b9\u009eJ\u00d7s\u0095\u0017c\u00b5*)\u00e2\u00d30\u001e*<\u00c5k\u008aU\u00ca(\u00df\u00e6\u008f\u00d1!\u0019\u0013\u00a4\u0085>\\\u00b7(2'\u0003q\u00b3\u0013m\u000e\u008aq\u001e\u00cb\u0088\u0010=#\u0001\u0004\u00a9\u00e4\u0000p\u0083o\u00daI\u00e0";
                    var6_6 = "\n@\u00af\u00aa\u00c0\u00a2\u00e8\u00ae/\u00d8\u00e2V\u0014\u00c5\u008f\u00d8\u00b6\u00d5\u00b9\u009eJ\u00d7s\u0095\u0017c\u00b5*)\u00e2\u00d30\u001e*<\u00c5k\u008aU\u00ca(\u00df\u00e6\u008f\u00d1!\u0019\u0013\u00a4\u0085>\\\u00b7(2'\u0003q\u00b3\u0013m\u000e\u008aq\u001e\u00cb\u0088\u0010=#\u0001\u0004\u00a9\u00e4\u0000p\u0083o\u00daI\u00e0".length();
                    var3_7 = 40;
                    var2_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = b9.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        b9.n = var7_3;
        b9.p = new String[6];
        m44.a("n", (int)-1, (long)7655067925737817940L, (long)var9);
    }

    private static Exception b(Exception exception) {
        return exception;
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

    private static String c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4F3D;
        if (p[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])q.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    q.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/b9", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = n[n11].getBytes("ISO-8859-1");
            b9.p[n11] = b9.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return p[n11];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = b9.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/b9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b9.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

