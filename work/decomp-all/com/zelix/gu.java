/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.df;
import com.zelix.gk;
import com.zelix.j2;
import com.zelix.j5;
import com.zelix.j9;
import com.zelix.jd;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.x6;
import com.zelix.x8;
import com.zelix.xa;
import com.zelix.xb;
import com.zelix.xj;
import com.zelix.xl;
import com.zelix.xm;
import com.zelix.xp;
import com.zelix.xt;
import com.zelix.xy;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class gu {
    private Set X;
    private Set c;
    private Set v;
    private Set j;
    private Set K;
    private Set a;
    private Set W;
    private df T;
    private boolean D;
    private df Z;
    private Set g;
    private df V;
    private df l;
    private Set M;
    private Set H;
    private Set x;
    private Set A;
    private static final long b = prr.a((long)3236243979819974613L, (long)3425014780566366819L, MethodHandles.lookup().lookupClass()).a(76222217767258L);
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;

    public gu(int n, long l) {
        long l2 = (l = b ^ l) ^ 0x46EBD380EE4BL;
        this(n, l2, false);
    }

    public boolean H(Object[] objectArray) {
        xl xl2 = (xl)objectArray[0];
        long l = (Long)objectArray[1];
        l = b ^ l;
        return m44.a("w", (Object)this, (long)8805796875122184405L, (long)l).contains(xl2);
    }

    public Set r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x717B92B181D7L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 40);
        int n3 = (int)(l2 << 56 >>> 56);
        return new gk(n, (Set)((Object)m44.a("w", (Object)this, (long)-8044146418080207036L, (long)l)), n2, (byte)n3);
    }

    private boolean z(Object object, long l, Object object2, xb xb2) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                l = b ^ l;
                bl2 = this.W.add(xb2);
                CallSite callSite = m44.a("n", (long)5992388514963786326L, (long)l);
                try {
                    try {
                        bl = bl2;
                        if (callSite == false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)5828081486614693085L, (long)l);
                    }
                    this.Q(object, object2, xb2.O());
                    this.Q(object, object2, xb2.o());
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)5828081486614693085L, (long)l);
                }
            }
            bl = bl2;
        }
        return bl;
    }

    private boolean Y(Object[] objectArray) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                long l = (Long)objectArray[0];
                Object object = objectArray[1];
                Object object2 = objectArray[2];
                j5 j52 = (j5)objectArray[3];
                long l2 = l = b ^ l;
                long l3 = l2 ^ 0x1CB1529DF1EDL;
                long l4 = l2 ^ 0x230DDDD10EA8L;
                bl2 = m44.a("s", (Object)this, (long)149024889233194248L, (long)l).add(j52);
                CallSite callSite = m44.a("m", (long)1777220165998509645L, (long)l);
                try {
                    try {
                        bl = bl2;
                        if (callSite != false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)408284390703911318L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l3;
                    this.z(object, l4, object2, (xb)m44.a("r", (Object)j52, (Object)objectArray2, (long)2045629336094870435L, (long)l));
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)408284390703911318L, (long)l);
                }
            }
            bl = bl2;
        }
        return bl;
    }

    public Set E(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x38A8AF1FF8B4L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 40);
        int n3 = (int)(l2 << 56 >>> 56);
        return new gk(n, (Set)((Object)m44.a("t", (Object)this, (long)-626308919031634889L, (long)l)), n2, (byte)n3);
    }

    public boolean B(xm xm2) {
        return this.a.contains(xm2);
    }

    private boolean Q(Object object, Object object2, x8 x82) {
        boolean bl = this.j.add(x82);
        return bl;
    }

    public Set w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x5F563A57593BL;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 40);
        int n3 = (int)(l2 << 56 >>> 56);
        return new gk(n, (Set)((Object)m44.a("s", (Object)this, (long)5492171395105917908L, (long)l)), n2, (byte)n3);
    }

    private boolean B(Object[] objectArray) {
        xy xy2 = (xy)objectArray[0];
        return this.K.add(xy2);
    }

    public boolean X(Object[] objectArray) {
        x6 x62 = (x6)objectArray[0];
        long l = (Long)objectArray[1];
        l = b ^ l;
        return m44.a("w", (Object)this, (long)-3337665283795800240L, (long)l).contains(x62);
    }

    private boolean D(Object object, long l, Object object2, jf jf2) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                l = b ^ l;
                bl2 = this.g.add(jf2);
                CallSite callSite = m44.a("k", (long)-4836947586007836101L, (long)l);
                try {
                    try {
                        bl = bl2;
                        if (callSite != false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)-6783329362462640672L, (long)l);
                    }
                    this.Q(object, object2, jf2.F());
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)-6783329362462640672L, (long)l);
                }
            }
            bl = bl2;
        }
        return bl;
    }

    private boolean x(Object[] objectArray) {
        xj xj2 = (xj)objectArray[0];
        return this.K.add(xj2);
    }

    public List x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x1CF99D7E1916L;
        try {
            if (this.D) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l2;
                return new ArrayList(m44.a("p", (Object)m44.a("q", (Object)this, (long)-1130151594550534427L, (long)l), (Object)objectArray2, (long)-1243362377974255520L, (long)l));
            }
        }
        catch (n9 n92) {
            throw m44.a("o", (Object)((Object)n92), (long)-1540040175892709732L, (long)l);
        }
        return null;
    }

    private boolean I(Object[] objectArray) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                Object object = objectArray[0];
                Object object2 = objectArray[1];
                j2 j22 = (j2)objectArray[2];
                long l = (Long)objectArray[3];
                long l2 = (l = b ^ l) ^ 0x27CE4C8DA05FL;
                bl2 = m44.a("v", (Object)this, (long)-6568137616556510839L, (long)l).add(j22);
                CallSite callSite = m44.a("h", (long)-6809665905133815808L, (long)l);
                try {
                    try {
                        bl = bl2;
                        if (callSite == false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-6721754037347682677L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    this.Q(object, object2, (x8)m44.a("w", (Object)j22, (Object)objectArray2, (long)-6447650594752780200L, (long)l));
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-6721754037347682677L, (long)l);
                }
            }
            bl = bl2;
        }
        return bl;
    }

    public boolean K(jf jf2) {
        return this.g.contains(jf2);
    }

    public Set N(Object[] objectArray) {
        Set set;
        CallSite callSite;
        long l;
        block7: {
            long l2;
            js js2;
            block8: {
                l = (Long)objectArray[0];
                js2 = (js)objectArray[1];
                long l3 = l = b ^ l;
                l2 = l3 ^ 0x5DD39351493EL;
                long l4 = l3 ^ 0x275592D634EBL;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l4;
                callSite = m44.a("l", (Object)objectArray2, (long)-7435464154149101236L, (long)l);
                Set set2 = m44.a("r", (Object)this, (long)-7192092719321595466L, (long)l).J(l2, js2);
                CallSite callSite2 = m44.a("l", (long)-8997345621145298340L, (long)l);
                try {
                    try {
                        set = set2;
                        if (callSite2 == false) break block7;
                        if (set == null) break block8;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)-9157017116127734569L, (long)l);
                    }
                    m44.a("s", (Object)callSite, (Object)set2, (long)-7370202268459133333L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)-9157017116127734569L, (long)l);
                }
            }
            set = m44.a("r", (Object)this, (long)-7342004353413925714L, (long)l).J(l2, js2);
        }
        Set set3 = set;
        try {
            if (l > 0L && set3 != null) {
                m44.a("s", (Object)callSite, (Object)set3, (long)-7370202268459133333L, (long)l);
            }
        }
        catch (n9 n94) {
            throw m44.a("l", (Object)((Object)n94), (long)-9157017116127734569L, (long)l);
        }
        return callSite;
    }

    private boolean Z(Object[] objectArray) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                Object object = objectArray[0];
                Object object2 = objectArray[1];
                x6 x62 = (x6)objectArray[2];
                long l = (Long)objectArray[3];
                long l2 = (l = b ^ l) ^ 0x4785D8CDEABEL;
                bl2 = m44.a("t", (Object)this, (long)-8926931059447629085L, (long)l).add(x62);
                CallSite callSite = m44.a("j", (long)-8904417920835658478L, (long)l);
                try {
                    try {
                        bl = bl2;
                        if (callSite == false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-8672354305240935527L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    this.Q(object, object2, (x8)m44.a("u", (Object)x62, (Object)objectArray2, (long)-7202274227332232297L, (long)l));
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-8672354305240935527L, (long)l);
                }
            }
            bl = bl2;
        }
        return bl;
    }

    public boolean i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        j9 j92 = (j9)objectArray[1];
        l = b ^ l;
        return m44.a("w", (Object)this, (long)-6180023459337245232L, (long)l).contains(j92);
    }

    public gu(int n, long l, boolean bl) {
        block5: {
            long l2;
            block4: {
                long l3 = l = b ^ l;
                long l4 = l3 ^ 0x35D90D14FD3L;
                l2 = l3 ^ 0x56DCE765826EL;
                long l5 = l3 ^ 0x4A8344B66FA9L;
                int n2 = (int)(l5 >>> 32);
                int n3 = (int)(l5 << 32 >>> 48);
                int n4 = (int)(l5 << 48 >>> 48);
                long l6 = l3 ^ 0x7C8CDC55E41FL;
                CallSite callSite = m44.a("k", (long)-9033058427245634597L, (long)l);
                int n5 = cf.x((int)n, (int)n2, (char)((char)n3), (short)((short)n4));
                Object[] objectArray = new Object[2];
                objectArray[1] = l4;
                objectArray[0] = n5;
                this.j = m44.a("k", (Object)objectArray, (long)-8948623803772070760L, (long)l);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l4;
                objectArray2[0] = n5;
                this.W = m44.a("k", (Object)objectArray2, (long)-8948623803772070760L, (long)l);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l4;
                objectArray3[0] = n5;
                this.a = m44.a("k", (Object)objectArray3, (long)-8948623803772070760L, (long)l);
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l4;
                objectArray4[0] = n5;
                this.g = m44.a("k", (Object)objectArray4, (long)-8948623803772070760L, (long)l);
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = l4;
                objectArray5[0] = n5;
                m44.a("w", (Object)this, (Set)((Object)m44.a("k", (Object)objectArray5, (long)-8948623803772070760L, (long)l)), (long)-9007308422155399019L, (long)l);
                Object[] objectArray6 = new Object[2];
                objectArray6[1] = l4;
                objectArray6[0] = n5;
                this.K = m44.a("k", (Object)objectArray6, (long)-8948623803772070760L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    try {
                        Object[] objectArray7 = new Object[2];
                        objectArray7[1] = l4;
                        objectArray7[0] = n5;
                        m44.a("w", (Object)this, (Set)((Object)m44.a("k", (Object)objectArray7, (long)-8948623803772070760L, (long)l)), (long)-8730394193290970674L, (long)l);
                        Object[] objectArray8 = new Object[2];
                        objectArray8[1] = l4;
                        objectArray8[0] = n5;
                        m44.a("w", (Object)this, (Set)((Object)m44.a("k", (Object)objectArray8, (long)-8948623803772070760L, (long)l)), (long)-7446784141380514850L, (long)l);
                        Object[] objectArray9 = new Object[2];
                        objectArray9[1] = l4;
                        objectArray9[0] = n5;
                        m44.a("w", (Object)this, (Set)((Object)m44.a("k", (Object)objectArray9, (long)-8948623803772070760L, (long)l)), (long)-8718304313392197038L, (long)l);
                        Object[] objectArray10 = new Object[2];
                        objectArray10[1] = l4;
                        objectArray10[0] = n5;
                        m44.a("w", (Object)this, (Set)((Object)m44.a("k", (Object)objectArray10, (long)-8948623803772070760L, (long)l)), (long)-9052752940185139790L, (long)l);
                        Object[] objectArray11 = new Object[2];
                        objectArray11[1] = l4;
                        objectArray11[0] = n5;
                        m44.a("w", (Object)this, (Set)((Object)m44.a("k", (Object)objectArray11, (long)-8948623803772070760L, (long)l)), (long)-9019534316872139734L, (long)l);
                        Object[] objectArray12 = new Object[2];
                        objectArray12[1] = l4;
                        objectArray12[0] = n5;
                        m44.a("w", (Object)this, (Set)((Object)m44.a("k", (Object)objectArray12, (long)-8948623803772070760L, (long)l)), (long)-8809544408653500577L, (long)l);
                        this.D = bl;
                        if (callSite2 == false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)-9120741864782965424L, (long)l);
                    }
                    m44.a("w", (Object)this, (df)new df(n5, l6), (long)-7082001479901200335L, (long)l);
                    m44.a("w", (Object)this, (df)new df(n5, l6), (long)-7233672588214454999L, (long)l);
                    m44.a("w", (Object)this, (df)new df(l2), (long)-7213416358552022100L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)-9120741864782965424L, (long)l);
                }
            }
            m44.a("w", (Object)this, (df)new df(l2), (long)-7106507827217179436L, (long)l);
        }
    }

    public Set D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x607A8DB55ECDL;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 40);
        int n3 = (int)(l2 << 56 >>> 56);
        return new gk(n, this.g, n2, (byte)n3);
    }

    private boolean v(Object[] objectArray) {
        xp xp2 = (xp)objectArray[0];
        return this.K.add(xp2);
    }

    public Set i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x41AD3038C309L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 40);
        int n3 = (int)(l2 << 56 >>> 56);
        return new gk(n, (Set)((Object)m44.a("q", (Object)this, (long)-3218253548763298298L, (long)l)), n2, (byte)n3);
    }

    public boolean f(Object[] objectArray) {
        xy xy2 = (xy)objectArray[0];
        return this.K.contains(xy2);
    }

    /*
     * Exception decompiling
     */
    public boolean Z(js var1_1, int var2_2, char var3_3, int var4_4) {
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean F(Object[] objectArray) {
        j5 j52 = (j5)objectArray[0];
        long l = (Long)objectArray[1];
        l = b ^ l;
        return m44.a("s", (Object)this, (long)7287162046910618168L, (long)l).contains(j52);
    }

    public boolean q(xb xb2) {
        return this.W.contains(xb2);
    }

    public boolean u(xa xa2) {
        return this.K.contains(xa2);
    }

    public boolean o(Object[] objectArray) {
        long l = (Long)objectArray[0];
        j2 j22 = (j2)objectArray[1];
        l = b ^ l;
        return m44.a("r", (Object)this, (long)-6612021641288109715L, (long)l).contains(j22);
    }

    public boolean Y(x8 x82) {
        return this.j.contains(x82);
    }

    public List T(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x62DCCFD632B4L;
        try {
            if (this.D) {
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l2;
                return new ArrayList(m44.a("r", (Object)m44.a("s", (Object)this, (long)-2460686064116006817L, (long)l), (Object)objectArray2, (long)-4243289543250650174L, (long)l));
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)((Object)n92), (long)-4538832670922271426L, (long)l);
        }
        return null;
    }

    private boolean U(Object[] objectArray) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                long l = (Long)objectArray[0];
                Object object = objectArray[1];
                Object object2 = objectArray[2];
                j9 j92 = (j9)objectArray[3];
                long l2 = l = b ^ l;
                long l3 = l2 ^ 0x111930701421L;
                long l4 = l2 ^ 0xDAA4160A8F6L;
                bl2 = m44.a("q", (Object)this, (long)-3563918463494125210L, (long)l).add(j92);
                CallSite callSite = m44.a("o", (long)-3571245549393635569L, (long)l);
                try {
                    try {
                        bl = bl2;
                        if (callSite == false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-3622899913826920060L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l4;
                    this.U(object, l3, object2, (xm)m44.a("p", (Object)j92, (Object)objectArray2, (long)-3935063948019159644L, (long)l));
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)-3622899913826920060L, (long)l);
                }
            }
            bl = bl2;
        }
        return bl;
    }

    public boolean z(Object[] objectArray) {
        xt xt2 = (xt)objectArray[0];
        long l = (Long)objectArray[1];
        l = b ^ l;
        return m44.a("u", (Object)this, (long)1587516257235600493L, (long)l).contains(xt2);
    }

    public Set y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x77643CB16A38L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 40);
        int n3 = (int)(l2 << 56 >>> 56);
        return new gk(n, this.W, n2, (byte)n3);
    }

    private boolean r(xa xa2) {
        return this.K.add(xa2);
    }

    /*
     * Exception decompiling
     */
    public boolean K(js var1_1, Object var2_2, long var3_3, Object var5_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[TRYBLOCK]], but top level block is 12[SWITCH]
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
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public Set Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x689453C8935FL;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 40);
        int n3 = (int)(l2 << 56 >>> 56);
        return new gk(n, this.j, n2, (byte)n3);
    }

    public Set X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x3C742CD4619CL;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 40);
        int n3 = (int)(l2 << 56 >>> 56);
        return new gk(n, this.a, n2, (byte)n3);
    }

    private boolean U(Object object, long l, Object object2, xm xm2) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                long l2 = l = b ^ l;
                long l3 = l2 ^ 0xB4270127845L;
                long l4 = l2 ^ 0x4F9BD04E8978L;
                bl2 = this.a.add(xm2);
                CallSite callSite = m44.a("m", (long)-9101119218889336627L, (long)l);
                try {
                    try {
                        bl = bl2;
                        if (callSite == false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)-9044660803614943674L, (long)l);
                    }
                    this.D(object, l3, object2, xm2.G());
                    this.z(object, l4, object2, xm2.Q());
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)-9044660803614943674L, (long)l);
                }
            }
            bl = bl2;
        }
        return bl;
    }

    public boolean K(Object[] objectArray) {
        xp xp2 = (xp)objectArray[0];
        return this.K.contains(xp2);
    }

    private boolean k(Object[] objectArray) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                Object object = objectArray[0];
                Object object2 = objectArray[1];
                xl xl2 = (xl)objectArray[2];
                long l = (Long)objectArray[3];
                long l2 = (l = b ^ l) ^ 0x4E2F7C8D1584L;
                bl2 = m44.a("p", (Object)this, (long)-2588725089229883662L, (long)l).add(xl2);
                CallSite callSite = m44.a("n", (long)-4196550553933733082L, (long)l);
                try {
                    try {
                        bl = bl2;
                        if (callSite != false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-2827790321965757187L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    this.Q(object, object2, (x8)m44.a("q", (Object)xl2, (Object)objectArray2, (long)-2365492126171236563L, (long)l));
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-2827790321965757187L, (long)l);
                }
            }
            bl = bl2;
        }
        return bl;
    }

    public Set O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x401D487F4F7FL;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 40);
        int n3 = (int)(l2 << 56 >>> 56);
        return new gk(n, this.K, n2, (byte)n3);
    }

    public boolean J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        jd jd2 = (jd)objectArray[1];
        l = b ^ l;
        return m44.a("s", (Object)this, (long)6325761102652720304L, (long)l).contains(jd2);
    }

    private boolean d(Object[] objectArray) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                long l = (Long)objectArray[0];
                Object object = objectArray[1];
                Object object2 = objectArray[2];
                jd jd2 = (jd)objectArray[3];
                long l2 = l = b ^ l;
                long l3 = l2 ^ 0x2374331C7931L;
                long l4 = l2 ^ 0x1CC8BC508674L;
                bl2 = m44.a("w", (Object)this, (long)-7728859318511171644L, (long)l).add(jd2);
                CallSite callSite = m44.a("i", (long)-8037294113600440687L, (long)l);
                try {
                    try {
                        bl = bl2;
                        if (callSite != false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-8253202867712698038L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l3;
                    this.z(object, l4, object2, (xb)m44.a("v", (Object)jd2, (Object)objectArray2, (long)-7728257438028397697L, (long)l));
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)-8253202867712698038L, (long)l);
                }
            }
            bl = bl2;
        }
        return bl;
    }

    public boolean c(Object[] objectArray) {
        xj xj2 = (xj)objectArray[0];
        return this.K.contains(xj2);
    }

    private boolean G(Object[] objectArray) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                Object object = objectArray[0];
                Object object2 = objectArray[1];
                xt xt2 = (xt)objectArray[2];
                long l = (Long)objectArray[3];
                l = b ^ l;
                boolean bl3 = m44.a("w", (Object)this, (long)3122594825882614079L, (long)l).add(xt2);
                CallSite callSite = m44.a("i", (long)3874747635656184609L, (long)l);
                bl2 = this.K.add(xt2);
                try {
                    try {
                        bl = bl2;
                        if (callSite != false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)2938227518419533050L, (long)l);
                    }
                    this.Q(object, object2, xt2.V());
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)2938227518419533050L, (long)l);
                }
            }
            bl = bl2;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = b ^ 0x69396CD1BB84L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "D\u0086$\u0019\u001e\u00b5\u00e4\u00dby^\"\u00bf\u00b6{\nv";
        int n2 = "D\u0086$\u0019\u001e\u00b5\u00e4\u00dby^\"\u00bf\u00b6{\nv".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        e = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5385;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/gu", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gu.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = gu.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/gu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
