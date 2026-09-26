/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._t;
import com.zelix.cf;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class df
implements _t {
    Map L;
    protected int U;
    protected int g;
    protected final boolean H;
    private static final long b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;

    public Set X(Object[] objectArray) {
        Object object = objectArray[0];
        Set set = (Set)objectArray[1];
        return this.L.put(object, set);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void l(Object[] objectArray) {
        df df2;
        Object object;
        CallSite callSite;
        long l10;
        long l11;
        block7: {
            block8: {
                Object object2;
                l11 = (Long)objectArray[0];
                Object[] objectArray2 = (Object[])objectArray[1];
                long l12 = l11;
                long l13 = l12 ^ 0x374B2958960DL;
                l10 = l12 ^ 0x61790D16A451L;
                long l14 = l12 ^ 0x7E95FD3FB677L;
                int n10 = (int)(l14 >>> 32);
                int n11 = (int)(l14 << 32 >>> 48);
                int n12 = (int)(l14 << 48 >>> 48);
                long l15 = l12 ^ 0x2FF7E5AB973L;
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l13;
                objectArray3[0] = cf.x(objectArray2.length, n10, (char)n11, (short)n12);
                callSite = m44.a("m", (Object)objectArray3, (long)6489174799238450502L, (long)l11);
                object = objectArray2;
                int n13 = ((Object[])object).length;
                CallSite callSite2 = m44.a("m", (long)6866686489077825917L, (long)l11);
                block5: for (int i10 = 0; i10 < n13; ++i10) {
                    object2 = object[i10];
                    do {
                        Object object3 = object2;
                        boolean bl2 = callSite.add(object3);
                        if (callSite2 == null) continue block5;
                        Object[] objectArray4 = new Object[2];
                        objectArray4[1] = l15;
                        objectArray4[0] = cf.x(this.L.size(), n10, (char)n11, (short)n12);
                        object2 = m44.a("r", (Object)this, (Object)objectArray4, (long)4896837387241486684L, (long)l11);
                    } while (l11 < 0L);
                }
                object = object2;
                try {
                    df2 = this;
                    if (callSite2 != null) break block7;
                    if (!df2.H) break block8;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)n92, (long)6716078812276989557L, (long)l11);
                }
                Map map = this.L;
                synchronized (map) {
                    Object[] objectArray5 = new Object[3];
                    objectArray5[2] = object;
                    objectArray5[1] = l10;
                    objectArray5[0] = callSite;
                    m44.a("l", (Object)this, (Object)objectArray5, (long)6796003352267613357L, (long)l11);
                }
            }
            df2 = this;
        }
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = object;
        objectArray6[1] = l10;
        objectArray6[0] = callSite;
        m44.a("l", (Object)df2, (Object)objectArray6, (long)6796003352267613357L, (long)l11);
        this.L = object;
    }

    @Override
    public Set J(long l10, Object object) {
        return (Set)this.L.get(object);
    }

    public df w(Object[] objectArray) {
        df df2;
        block7: {
            long l10 = (Long)objectArray[0];
            long l11 = l10;
            long l12 = l11 ^ 0x1823D2121B57L;
            long l13 = l11 ^ 0x5214F6D4DAFAL;
            int n10 = (int)(l13 >>> 32);
            int n11 = (int)(l13 << 32 >>> 48);
            int n12 = (int)(l13 << 48 >>> 48);
            long l14 = l11 ^ 0x51FD06753B2DL;
            int n13 = (int)(l14 >>> 32);
            int n14 = (int)(l14 << 32 >>> 48);
            int n15 = (int)(l14 << 48 >>> 48);
            int n16 = this.L.size();
            CallSite callSite = m44.a("o", (long)-3309739370700878809L, (long)l10);
            df df3 = new df(n10, n11, (char)n12, n16 * 2 + 1, this.H);
            for (Map.Entry entry : this.L.entrySet()) {
                CallSite callSite2;
                Set set;
                block10: {
                    int n17;
                    block8: {
                        int n18;
                        block9: {
                            set = (Set)entry.getValue();
                            n18 = cf.x(set.size(), n13, (char)n14, (short)n15);
                            try {
                                try {
                                    try {
                                        df2 = this;
                                        if (callSite != null) break block7;
                                        n17 = df2.H;
                                        if (callSite != null) break block8;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("o", (Object)n92, (long)-3427695131476192465L, (long)l10);
                                    }
                                    if (n17 == 0) break block9;
                                }
                                catch (n9 n93) {
                                    throw m44.a("o", (Object)n93, (long)-3427695131476192465L, (long)l10);
                                }
                                callSite2 = m44.a("o", new ConcurrentHashMap(n18), (long)-3224552660440475790L, (long)l10);
                                break block10;
                            }
                            catch (n9 n94) {
                                throw m44.a("o", (Object)n94, (long)-3427695131476192465L, (long)l10);
                            }
                        }
                        n17 = n18;
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l12;
                    objectArray2[0] = n17;
                    callSite2 = m44.a("o", (Object)objectArray2, (long)-2930715869693820900L, (long)l10);
                }
                CallSite callSite3 = callSite2;
                callSite3.addAll(set);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = callSite3;
                objectArray3[0] = entry.getKey();
                m44.a("p", (Object)df3, (Object)objectArray3, (long)-3726975821585574750L, (long)l10);
                if (callSite == null) continue;
            }
            df2 = df3;
        }
        return df2;
    }

    @Override
    public boolean C(Object object, long l10, Object object2) {
        Object object3;
        Set set;
        block4: {
            block5: {
                Set set2;
                block6: {
                    set2 = (Set)this.L.get(object);
                    CallSite callSite = m44.a("h", (long)-6447424405421508432L, (long)l10);
                    try {
                        try {
                            set = set2;
                            object3 = callSite;
                            if (l10 < 0L) break block4;
                            if (object3 != null) break block5;
                            if (set != null) break block6;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)n92, (long)-6559152788422269000L, (long)l10);
                        }
                        return false;
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)n93, (long)-6559152788422269000L, (long)l10);
                    }
                }
                set = set2;
            }
            object3 = object2;
        }
        return set.contains(object3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Enumeration h(Object[] objectArray) {
        Set set;
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = b ^ l10) ^ 0x272F1EA7A5B8L;
        Set set2 = this.y((int)df.a("u", (int)12004, (long)(0x36FDEB17C5BF31F4L ^ l10)), l11);
        Iterator iterator = this.L.entrySet().iterator();
        CallSite callSite = m44.a("l", (long)-7441619431698233716L, (long)l10);
        block2: while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Set set3 = (Set)entry.getValue();
            try {
                do {
                    if (l10 > 0L) {
                        set = set2;
                        if (callSite != null) return Collections.enumeration(set);
                        set.addAll(set3);
                    }
                    if (callSite == null) continue block2;
                } while (l10 <= 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("l", (Object)n92, (long)-7294390562189026940L, (long)l10);
            }
        }
        set = set2;
        return Collections.enumeration(set);
    }

    @Override
    public Set y(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        return (Set)this.L.remove(object);
    }

    public df(long l10, boolean bl2) {
        long l11 = (l10 = b ^ l10) ^ 0x20B97FE21362L;
        this((int)df.a("u", (int)23565, (long)(0x6BC8B287D5716452L ^ l10)), (int)df.a("u", (int)19567, (long)(0x7F0390B9FD0BF432L ^ l10)), bl2, l11);
    }

    @Override
    public List x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        Set set = (Set)this.L.get(object);
        try {
            if (set != null) {
                return new ArrayList((Collection)this.L.get(object));
            }
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)n92, (long)8300264038039040113L, (long)l10);
        }
        return null;
    }

    Map K(Object[] objectArray) {
        int n10;
        long l10;
        long l11;
        block4: {
            int n11;
            block5: {
                n11 = (Integer)objectArray[0];
                l11 = (Long)objectArray[1];
                l10 = l11 ^ 0x38828F5960E4L;
                CallSite callSite = m44.a("n", (long)-1857633671973963762L, (long)l11);
                try {
                    try {
                        n10 = this.H;
                        if (callSite != null) break block4;
                        if (n10 == 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-1997543351220001018L, (long)l11);
                    }
                    return new ConcurrentHashMap(n11);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-1997543351220001018L, (long)l11);
                }
            }
            n10 = n11;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l10;
        objectArray2[0] = n10;
        return m44.a("n", (Object)objectArray2, (long)-2007069779491921467L, (long)l11);
    }

    public df(int n10, int n11, boolean bl2, long l10) {
        block8: {
            long l11;
            block6: {
                long l12 = l10 = b ^ l10;
                long l13 = l12 ^ 0x785049B6B7C3L;
                int n12 = (int)(l13 >>> 32);
                int n13 = (int)(l13 << 32 >>> 48);
                int n14 = (int)(l13 << 48 >>> 48);
                l11 = l12 ^ 0x43ACAD3B8C7L;
                CallSite callSite = m44.a("i", (long)6845286984923758793L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    df df2;
                    block7: {
                        try {
                            try {
                                this.U = cf.x(n10, n12, (char)n13, (short)n14);
                                this.g = cf.x(n11, n12, (char)n13, (short)n14);
                                df2 = this;
                                if (callSite2 != null) break block6;
                                df2.H = bl2;
                                if (!bl2) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)n92, (long)6665407562630111169L, (long)l10);
                            }
                            this.L = new ConcurrentHashMap(this.U);
                            if (callSite2 == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)n93, (long)6665407562630111169L, (long)l10);
                        }
                    }
                    df2 = this;
                }
                catch (n9 n94) {
                    throw m44.a("i", (Object)n94, (long)6665407562630111169L, (long)l10);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l11;
            objectArray[0] = this.U;
            df2.L = m44.a("v", (Object)this, (Object)objectArray, (long)4774107443911751912L, (long)l10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final l6q s(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2 = df.b ^ var2_2;
        var4_3 = v0 ^ 30180225606000L;
        var6_4 = v0 ^ 126892372769349L;
        var9_5 = this.L.size();
        var10_6 = new l6q(var9_5 * 2 + 1, this.H, var6_4);
        var8_7 = m44.a("h", (long)-5589415093703889832L, (long)var2_2);
        try {
            v1 = this;
            if (var8_7 != null) break block19;
            if (v1.H) {
            }
            ** GOTO lbl36
        }
        catch (n9 v2) {
            throw m44.a("h", (Object)v2, (long)-5759690001811246256L, (long)var2_2);
        }
        var11_8 = this.L;
        synchronized (var11_8) {
            block21: {
                block19: {
                    block20: {
                        block10: for (Map.Entry<K, V> var13_12 : this.L.entrySet()) {
                            try {
                                var10_6.u(var13_12.getKey(), (Collection)var13_12.getValue(), var4_3);
                                do {
                                    v3 = var8_7;
                                    if (var2_2 > 0L) {
                                        if (v3 != null) break block20;
                                        v3 = var8_7;
                                    }
                                    if (v3 == null) continue block10;
                                } while (var2_2 < 0L);
                                break;
                            }
                            catch (n9 v4) {
                                throw m44.a("h", (Object)v4, (long)-5759690001811246256L, (long)var2_2);
                            }
                        }
                    }
                    try {
                        if (var8_7 == null) break block21;
lbl36:
                        // 2 sources

                        v1 = this;
                    }
                    catch (n9 v5) {
                        throw m44.a("h", (Object)v5, (long)-5759690001811246256L, (long)var2_2);
                    }
                }
                block12: for (Map.Entry var12_11 : v1.L.entrySet()) {
                    try {
                        do {
                            v6 = var10_6;
                            v7 /* !! */  = var8_7;
                            if (var2_2 > 0L) {
                                if (v7 /* !! */  != null) return v6;
                                v7 /* !! */  = var12_11.getKey();
                            }
                            v6.u(v7 /* !! */ , (Collection)var12_11.getValue(), var4_3);
                            if (var8_7 == null) continue block12;
                        } while (var2_2 <= 0L);
                        break;
                    }
                    catch (n9 v8) {
                        throw m44.a("h", (Object)v8, (long)-5759690001811246256L, (long)var2_2);
                    }
                }
            }
            v6 = var10_6;
            return v6;
        }
    }

    public df(int n10, int n11, char c10, int n12, boolean bl2) {
        long l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)c10 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x7BB9B9175614L;
        this(n12, (int)df.a("u", (int)19567, (long)(0x7F03CBB93BFEB144L ^ l10)), bl2, l11);
    }

    public Object clone() {
        long l10 = b ^ 0x5DB4E771ED42L;
        long l11 = l10 ^ 0x49D8FB4C37BL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        return m44.a("s", (Object)this, (Object)objectArray, (long)1427432179139882553L, (long)l10);
    }

    @Override
    public int J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.L.size();
    }

    public Set r(Object[] objectArray) {
        return this.L.entrySet();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean L(long var1_1, char var3_2, Object var4_3, Object var5_4) {
        block6: {
            block5: {
                var6_5 = var1_1 << 16 | (long)var3_2 << 48 >>> 48;
                var8_6 = var6_5 ^ 65398013333669L;
                var12_7 = (Set)this.L.get(var4_3);
                var10_8 = m44.a("i", (long)-5933753263705377903L, (long)var6_5);
                try {
                    v0 = var12_7;
                    if (var10_8 != null) break block5;
                    if (v0 == null) {
                    }
                    ** GOTO lbl23
                }
                catch (n9 v1) {
                    throw m44.a("i", (Object)v1, (long)-5775864065914049383L, (long)var6_5);
                }
                v0 = var12_7 = this.y(this.g, var8_6);
                if (var1_1 < 0L) break block5;
                v0.add(var5_4);
                this.L.put(var4_3, var12_7);
                var11_9 = true;
                try {
                    if (var10_8 == null) break block6;
lbl23:
                    // 2 sources

                    v0 = var12_7;
                }
                catch (n9 v2) {
                    throw m44.a("i", (Object)v2, (long)-5775864065914049383L, (long)var6_5);
                }
            }
            var11_9 = v0.add(var5_4);
        }
        return var11_9;
    }

    public df(int n10, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x6F044D42F32FL;
        int n11 = (int)(l11 >>> 32);
        int n12 = (int)(l11 << 32 >>> 48);
        int n13 = (int)(l11 << 48 >>> 48);
        this(n10, (int)df.a("u", (int)19567, (long)(0x7F03FE5F53BCDB25L ^ l10)), n11, (short)n12, (short)n13);
    }

    @Override
    public Set A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.L.keySet();
    }

    @Override
    public void F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        this.L.clear();
    }

    @Override
    public boolean l(Object[] objectArray) {
        boolean bl2;
        block8: {
            boolean bl3;
            block7: {
                Set set;
                CallSite callSite;
                long l10;
                Object object;
                block6: {
                    object = objectArray[0];
                    l10 = (Long)objectArray[1];
                    Object object2 = objectArray[2];
                    bl3 = false;
                    callSite = m44.a("o", (long)-3584478662618656649L, (long)l10);
                    Set set2 = (Set)this.L.get(object);
                    try {
                        set = set2;
                        if (l10 <= 0L || callSite != null) break block6;
                        if (set == null) break block7;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-3729456277645127809L, (long)l10);
                    }
                    bl3 = set2.remove(object2);
                    set = set2;
                }
                try {
                    try {
                        bl2 = set.size();
                        if (callSite != null) break block8;
                        if (bl2) break block7;
                    }
                    catch (n9 n93) {
                        throw m44.a("o", (Object)n93, (long)-3729456277645127809L, (long)l10);
                    }
                    this.L.remove(object);
                }
                catch (n9 n94) {
                    throw m44.a("o", (Object)n94, (long)-3729456277645127809L, (long)l10);
                }
            }
            bl2 = bl3;
        }
        return bl2;
    }

    public df(long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x45547672955EL;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 48);
        int n12 = (int)(l11 << 48 >>> 48);
        this((int)df.a("u", (int)21956, (long)(0x1B8F747C7915A4FEL ^ l10)), (int)df.a("u", (int)19247, (long)(0x44C5C5EA9810BA12L ^ l10)), n10, (short)n11, (short)n12);
    }

    @Override
    public Enumeration u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return Collections.enumeration(this.L.keySet());
    }

    public df(int n10, int n11, int n12, short s10, short s11) {
        long l10 = ((long)n12 << 32 | (long)s10 << 48 >>> 32 | (long)s11 << 48 >>> 48) ^ b;
        long l11 = l10 ^ 0x2B82F4CA3D33L;
        this(n10, n11, false, l11);
    }

    /*
     * Exception decompiling
     */
    private void Y(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[WHILELOOP], 12[DOLOOP]], but top level block is 3[TRYBLOCK]
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
    public boolean A(char c10, int n10, int n11, Object object) {
        return this.L.containsKey(object);
    }

    Set y(int n10, long l10) {
        int n11;
        long l11;
        block4: {
            block5: {
                l11 = l10 ^ 0x4012D171F444L;
                CallSite callSite = m44.a("l", (long)4396121966279140148L, (long)l10);
                try {
                    try {
                        n11 = this.H;
                        if (callSite != null) break block4;
                        if (n11 == 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)4574875749045337148L, (long)l10);
                    }
                    return m44.a("l", new ConcurrentHashMap(n10), (long)4346904108863879265L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)4574875749045337148L, (long)l10);
                }
            }
            n11 = n10;
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = n11;
        return m44.a("l", (Object)objectArray, (long)4055308123872636687L, (long)l10);
    }

    protected df(long l10, Map map, int n10, int n11, boolean bl2) {
        long l11 = (l10 = b ^ l10) ^ 0x4BC948B2DF9L;
        int n12 = (int)(l11 >>> 32);
        int n13 = (int)(l11 << 32 >>> 48);
        int n14 = (int)(l11 << 48 >>> 48);
        this.L = map;
        this.U = cf.x(n10, n12, (char)n13, (short)n14);
        this.g = cf.x(n11, n12, (char)n13, (short)n14);
        this.H = bl2;
    }

    public void a(Object[] objectArray) {
        block4: {
            Collection collection;
            CallSite callSite;
            int n10;
            long l10;
            Object object;
            block3: {
                object = objectArray[0];
                Collection collection2 = (Collection)objectArray[1];
                long l11 = (Long)objectArray[2];
                long l12 = (l11 = b ^ l11) ^ 0x29607E82A34BL;
                l10 = l12 >>> 16;
                n10 = (int)(l12 << 48 >>> 48);
                callSite = m44.a("j", (long)1075300073208025306L, (long)l11);
                try {
                    collection = collection2;
                    if (callSite != null) break block3;
                    if (collection == null) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)n92, (long)906115622536826834L, (long)l11);
                }
                collection = collection2;
            }
            for (Object e10 : collection) {
                this.L(l10, (char)n10, object, e10);
                if (callSite == null) continue;
            }
        }
    }

    @Override
    public boolean K(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                CallSite callSite = m44.a("n", (long)6714867378364171014L, (long)l10);
                try {
                    bl2 = this.L.size();
                    if (callSite != null) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)6867726298244455438L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                df.b = prr.a(-711016192377225218L, 6631741796358104401L, MethodHandles.lookup().lookupClass()).a(133903053105121L);
                df.e = new HashMap<K, V>(13);
                var0 = df.b ^ 18524292412602L;
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
                var6_5 = "L.\u00b4\u0094\u00a7;\u00a3 _\u00cd`\u00fb\u00ec\u0092\u00db-\u00b5\u00e4\u00c3\u00d4I\u001c\u001f\u00bf";
                var7_6 = "L.\u00b4\u0094\u00a7;\u00a3 _\u00cd`\u00fb\u00ec\u0092\u00db-\u00b5\u00e4\u00c3\u00d4I\u001c\u001f\u00bf".length();
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
                    var6_5 = ",\u00d6\u008c\u00af\u0002\u0092\u00932\u008e|\u00ad\u00a6\u00aeS\u00a0'";
                    var7_6 = ",\u00d6\u008c\u00af\u0002\u0092\u00932\u008e|\u00ad\u00a6\u00aeS\u00a0'".length();
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
        df.c = var8_3;
        df.d = new Integer[5];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x9EA;
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
                throw new RuntimeException("com/zelix/df", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            df.d[n11] = n12;
        }
        return d[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = df.a(n10, l10);
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
            throw new RuntimeException("com/zelix/df" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(df.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

