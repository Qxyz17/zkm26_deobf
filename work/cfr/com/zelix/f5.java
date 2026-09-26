/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l6q;
import com.zelix.lun;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.nh;
import com.zelix.prr;
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
public class f5
implements lun {
    private final List X;
    private long y;
    private final int D;
    private f5 e;
    private static int C;
    private final int[] n;
    private int Z;
    private f5 b;
    private static final long a;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map f;

    void N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        this.X.add(l10);
    }

    public boolean equals(Object object) {
        boolean bl2;
        block10: {
            block11: {
                long l10;
                block12: {
                    block13: {
                        Object object2;
                        CallSite callSite;
                        long l11;
                        int n10;
                        long l12;
                        block8: {
                            block9: {
                                l12 = a ^ 0x2D205197542AL;
                                long l13 = l12 ^ 0x625CEBA60D36L;
                                n10 = (int)(l13 >>> 32);
                                l11 = l13 << 32 >>> 32;
                                callSite = m44.a("j", (long)8525935934372507385L, (long)l12);
                                try {
                                    try {
                                        object2 = this;
                                        if (callSite == null) break block8;
                                        if (object2 != object) break block9;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)n92, (long)7652361841271444569L, (long)l12);
                                    }
                                    return true;
                                }
                                catch (n9 n93) {
                                    throw m44.a("j", (Object)n93, (long)7652361841271444569L, (long)l12);
                                }
                            }
                            object2 = object;
                        }
                        try {
                            bl2 = object2 instanceof f5;
                            if (callSite == null) break block10;
                            if (!bl2) break block11;
                        }
                        catch (n9 n94) {
                            throw m44.a("j", (Object)n94, (long)7652361841271444569L, (long)l12);
                        }
                        f5 f52 = (f5)object;
                        try {
                            long l14 = nh.W(this.M(), n10, l11, (int)f5.a("p", (int)23634, (long)(0x21FEBAE49844612CL ^ l12)), this.n) - nh.W(f52.M(), n10, l11, (int)f5.a("p", (int)23634, (long)(0x21FEBAE49844612CL ^ l12)), f52.n);
                            l10 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                            if (callSite == null) break block12;
                            if (l10 != false) break block13;
                        }
                        catch (n9 n95) {
                            throw m44.a("j", (Object)n95, (long)7652361841271444569L, (long)l12);
                        }
                        l10 = 1;
                        break block12;
                    }
                    l10 = 0;
                }
                long l15 = l10;
                return (boolean)l15;
            }
            bl2 = false;
        }
        return bl2;
    }

    public void Q(Object[] objectArray) {
        int[] nArray = (int[])objectArray[0];
        System.arraycopy(nArray, 0, this.n, 0, this.n.length);
    }

    public int e(int n10, int n11, char c10) {
        long l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)c10 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x53038FE771F1L;
        int n12 = (int)(l11 >>> 32);
        int n13 = (int)(l11 << 32 >>> 48);
        int n14 = (int)(l11 << 48 >>> 48);
        return (int)nh.x(this.M(), n12, (short)n13, (int)f5.a("p", (int)23634, (long)(0x21FEFC3175B81268L ^ l10)), (int)f5.a("p", (int)6039, (long)(0x3B74B6291656D9A8L ^ l10)), this.n, n14);
    }

    @Override
    public long A(Object[] objectArray) {
        long l10;
        block5: {
            CallSite callSite;
            long l11;
            long l12;
            long l13;
            block4: {
                l13 = (Long)objectArray[0];
                l12 = (Long)objectArray[1];
                long l14 = l12;
                l11 = l14 ^ 0L;
                long l15 = l14 ^ 0x7980EBD31ECL;
                int n10 = (int)(l15 >>> 32);
                int n11 = (int)(l15 << 32 >>> 48);
                int n12 = (int)(l15 << 48 >>> 48);
                long l16 = this.M();
                CallSite callSite2 = m44.a("k", (long)4975113924159790496L, (long)l12);
                int[] nArray = this.n;
                l10 = nh.x(l16, n10, (short)n11, (int)f5.a("p", (int)1007, (long)(0x3AB9C1E2AB318DC9L ^ l12)), (int)f5.a("p", (int)9582, (long)(0x20EFCF95E994AB4BL ^ l12)), nArray, n12);
                long l17 = l16 ^ (m44.a("u", (Object)this, (long)6479605879399344004L, (long)l12) ^ l13);
                try {
                    try {
                        this.X.add(l17);
                        callSite = m44.a("u", (Object)this, (long)6427046367577698425L, (long)l12);
                        if (callSite2 == null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)6443442439701866240L, (long)l12);
                    }
                    callSite = m44.a("u", (Object)this, (long)6427046367577698425L, (long)l12);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)6443442439701866240L, (long)l12);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l11;
            objectArray2[0] = l13;
            m44.a("t", (Object)callSite, (Object)objectArray2, (long)6755617430841199912L, (long)l12);
        }
        return l10;
    }

    public int hashCode() {
        long l10 = a ^ 0x4532AB1B9353L;
        long l11 = l10 ^ 0xA4E112ACA4FL;
        int n10 = (int)(l11 >>> 32);
        long l12 = l11 << 32 >>> 32;
        int n11 = (int)nh.W(this.M(), n10, l12, (int)f5.a("p", (int)1007, (long)(0x3AB9BBBE3D1B79E9L ^ l10)), this.n);
        return n11;
    }

    /*
     * Exception decompiling
     */
    public boolean J(Object[] var1_1) {
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
    public long M() {
        return (Long)this.X.get(this.X.size() - 1);
    }

    long m(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (long)m44.a("s", (Object)this, (long)7357277278377433202L, (long)l10);
    }

    @Override
    public boolean Y(Object[] objectArray) {
        return true;
    }

    @Override
    public void n(Object[] objectArray) {
        block11: {
            Object[] objectArray2;
            Object object;
            long l10;
            block12: {
                f5 f52;
                long l11;
                block13: {
                    Object[] objectArray3;
                    block10: {
                        lun lun2 = (lun)objectArray[0];
                        l10 = (Long)objectArray[1];
                        l11 = l10 ^ 0L;
                        f52 = (f5)lun2;
                        objectArray3 = m44.a("h", (long)-5359217087332668149L, (long)l10);
                        try {
                            try {
                                object = this;
                                if (objectArray3 == null) break block10;
                                if (object == f52) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)n92, (long)-6214774557167134805L, (long)l10);
                            }
                            object = m44.a("v", (Object)this, (long)-6225541301532688174L, (long)l10);
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)-6214774557167134805L, (long)l10);
                        }
                    }
                    try {
                        block14: {
                            try {
                                try {
                                    objectArray2 = objectArray3;
                                    if (l10 < 0L) break block12;
                                    if (objectArray2 == null) break block13;
                                    if (object != null) break block14;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)n94, (long)-6214774557167134805L, (long)l10);
                                }
                                m44.a("t", (Object)this, (f5)f52, (long)-6225541301532688174L, (long)l10);
                                m44.a("t", (Object)f52, (f5)this, (long)-5398746749682527121L, (long)l10);
                                if (objectArray3 != null) break block11;
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)n95, (long)-6214774557167134805L, (long)l10);
                            }
                        }
                        object = m44.a("v", (Object)this, (long)-6225541301532688174L, (long)l10);
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)n96, (long)-6214774557167134805L, (long)l10);
                    }
                }
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l11;
                objectArray2 = objectArray4;
                objectArray4[0] = f52;
            }
            m44.a("w", (Object)object, (Object)objectArray2, (long)-5450145898532760175L, (long)l10);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Q(Object[] objectArray) {
        f5 f52 = (f5)objectArray[0];
        int n10 = (Integer)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = ((long)n10 << 48 | l10 << 16 >>> 16) ^ a;
        long l12 = l11 ^ 0x18C7E0FE1B7BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        f5 f53 = (f5)((Object)m44.a("q", (Object)this, (Object)objectArray2, (long)1883855182712131679L, (long)l11));
        CallSite callSite = m44.a("n", (long)235909261792746477L, (long)l11);
        while (f53 != null) {
            block5: {
                f5 f54;
                block6: {
                    try {
                        try {
                            if (n10 < 0) break block5;
                            f54 = f53;
                            if (callSite == null) break block5;
                            if (f54 != f52) break block6;
                            return true;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)2244636748428501325L, (long)l11);
                        }
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)2244636748428501325L, (long)l11);
                    }
                }
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l12;
                f54 = f53 = (f5)((Object)m44.a("q", (Object)f53, (Object)objectArray3, (long)1883855182712131679L, (long)l11));
            }
            if (callSite != null) continue;
        }
        boolean bl2 = false;
        if (n10 < 0) return bl2;
        return bl2;
    }

    public long f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        int n11 = (Integer)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x22001545114DL;
        int n12 = (int)(l11 >>> 32);
        int n13 = (int)(l11 << 32 >>> 48);
        int n14 = (int)(l11 << 48 >>> 48);
        return nh.x(this.M(), n12, (short)n13, n10, n11, this.n, n14);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                f5.a = prr.a(4358785756371716848L, 2254396833204661250L, MethodHandles.lookup().lookupClass()).a(163362201442629L);
                var11 = f5.a ^ 104262352779612L;
                f5.f = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[8];
                var3_4 = 0;
                var4_5 = "%\u00ecYf\u0081\u001f\u0002\u00f5\u00d8\u0016\u00ce\u00ccP\u00b7@\u00b3@\u00e4\u00f7\u0089%\u009d\\0\u00e6\u00e1\u0003A\u009f\u00d0\u009f2<\u0085\r\u00fc\r\u00d1\u00a3`~\u00c3v\u00c0\u00b6\u00c8;\u001b";
                var5_6 = "%\u00ecYf\u0081\u001f\u0002\u00f5\u00d8\u0016\u00ce\u00ccP\u00b7@\u00b3@\u00e4\u00f7\u0089%\u009d\\0\u00e6\u00e1\u0003A\u009f\u00d0\u009f2<\u0085\r\u00fc\r\u00d1\u00a3`~\u00c3v\u00c0\u00b6\u00c8;\u001b".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "?bq\u0088r\u0085\u00aa\u00a3\u00bd\u000f\r$N\u00d1\u00e8\u00a4";
                    var5_6 = "?bq\u0088r\u0085\u00aa\u00a3\u00bd\u000f\r$N\u00d1\u00e8\u00a4".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        f5.c = var6_3;
        f5.d = new Integer[8];
        m44.a("o", (int)0, (long)1993063748576211484L, (long)var11);
    }

    f5(int n10, long l10, int n11, int[] nArray, l6q l6q2, long l11, Set set) {
        long l12 = l11 = a ^ l11;
        long l13 = l12 ^ 0x984F8E0247CL;
        long l14 = l12 ^ 0x157AC5FAC672L;
        this.X = new ArrayList();
        Object[] objectArray = new Object[5];
        objectArray[4] = nArray;
        objectArray[3] = n11;
        objectArray[2] = l13;
        objectArray[1] = l10;
        objectArray[0] = n10;
        CallSite callSite = m44.a("m", (Object)objectArray, (long)-5954090553748833574L, (long)l11);
        this.n = nArray;
        this.X.add((long)callSite);
        CallSite callSite2 = m44.a("i", (long)-5293458166674333891L, (long)l11);
        m44.a("n", (int)(callSite2 + true), (long)-5293458166674333891L, (long)l11);
        this.D = (int)callSite2;
        l6q2.t(nArray, this, l14);
        set.add(nArray);
    }

    public void B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (Long)objectArray[1];
        l11 = a ^ l11;
        m44.a("v", (Object)this, (long)l10, (long)-3187132562791666259L, (long)l11);
    }

    f5(f5 f52, long l10, int[] nArray) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x69A84BF3AD54L;
        long l13 = l11 ^ 0x3F0DF6B27766L;
        long l14 = l11 ^ 0x17EDB68A153CL;
        int n10 = (int)(l14 >>> 32);
        int n11 = (int)(l14 << 32 >>> 48);
        int n12 = (int)(l14 << 48 >>> 48);
        this.X = new ArrayList();
        this.n = nArray;
        int n13 = f52.e(n10, n11, (char)n12);
        Object[] objectArray = new Object[1];
        objectArray[0] = l13;
        CallSite callSite = m44.a("r", (Object)f52, (Object)objectArray, (long)4386443281595055642L, (long)l10);
        int n14 = f52.hashCode();
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = nArray;
        objectArray2[3] = n14;
        objectArray2[2] = l12;
        objectArray2[1] = (long)callSite;
        objectArray2[0] = n13;
        CallSite callSite2 = m44.a("m", (Object)objectArray2, (long)2627483159852823538L, (long)l10);
        this.X.add((long)callSite2);
        CallSite callSite3 = m44.a("i", (long)4585152583809619477L, (long)l10);
        m44.a("n", (int)(callSite3 + true), (long)4585152583809619477L, (long)l10);
        this.D = (int)callSite3;
    }

    public int y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("q", (Object)this, (long)1150051467715595121L, (long)l10);
    }

    int[] N(Object[] objectArray) {
        return this.n;
    }

    Long B(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        return (Long)this.X.get(n10);
    }

    public void T(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("p", (Object)this, (int)n10, (long)5996213705486014386L, (long)l10);
    }

    long T(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x758FD98B5006L;
        int n11 = (int)(l11 >>> 32);
        int n12 = (int)(l11 << 32 >>> 48);
        int n13 = (int)(l11 << 48 >>> 48);
        long l12 = nh.x((Long)((Object)m44.a("v", (Object)this, (Object)new Object[]{n10}, (long)4410013027094541128L, (long)l10)), n11, (short)n12, (int)f5.a("p", (int)1007, (long)(0x3AB9B3F57C07EC23L ^ l10)), (int)f5.a("p", (int)9582, (long)(0x20EFBD823EA2CAA1L ^ l10)), this.n, n13);
        return l12;
    }

    public lun J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)this, (long)3098481467077722696L, (long)l10);
    }

    @Override
    public boolean Y(int n10, short s10, int n11, lun lun2) {
        boolean bl2;
        block10: {
            block11: {
                boolean bl3;
                block12: {
                    block13: {
                        lun lun3;
                        CallSite callSite;
                        int n12;
                        int n13;
                        int n14;
                        long l10;
                        block8: {
                            block9: {
                                l10 = (long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)n11 << 48 >>> 48;
                                long l11 = l10 ^ 0x13C797EA3029L;
                                n14 = (int)(l11 >>> 32);
                                n13 = (int)(l11 << 32 >>> 48);
                                n12 = (int)(l11 << 48 >>> 48);
                                callSite = m44.a("h", (long)1889314222145110675L, (long)l10);
                                try {
                                    try {
                                        lun3 = this;
                                        if (callSite == null) break block8;
                                        if (lun3 != lun2) break block9;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)n92, (long)457293782832019507L, (long)l10);
                                    }
                                    return true;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)n93, (long)457293782832019507L, (long)l10);
                                }
                            }
                            lun3 = lun2;
                        }
                        try {
                            bl2 = lun3 instanceof f5;
                            if (callSite == null) break block10;
                            if (!bl2) break block11;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)n94, (long)457293782832019507L, (long)l10);
                        }
                        f5 f52 = (f5)lun2;
                        try {
                            bl3 = this.e(n14, n13, (char)n12) - f52.e(n14, n13, (char)n12);
                            if (callSite == null) break block12;
                            if (bl3 > false) break block13;
                        }
                        catch (n9 n95) {
                            throw m44.a("h", (Object)n95, (long)457293782832019507L, (long)l10);
                        }
                        bl3 = true;
                        break block12;
                    }
                    bl3 = false;
                }
                return bl3;
            }
            bl2 = true;
        }
        return bl2;
    }

    f5(long l10, int[] nArray, long l11, l6q l6q2, Set set) {
        long l12 = (l11 = a ^ l11) ^ 0x7CEDA7C03A43L;
        this.X = new ArrayList();
        this.n = nArray;
        this.X.add(l10);
        CallSite callSite = m44.a("h", (long)5384249344747021068L, (long)l11);
        m44.a("o", (int)(callSite + true), (long)5384249344747021068L, (long)l11);
        this.D = (int)callSite;
        l6q2.t(nArray, this, l12);
        set.add(nArray);
    }

    public boolean M(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("r", (Object)this, (long)-1380463918234628693L, (long)l10) != null;
        }
        catch (n9 n92) {
            throw m44.a("l", (Object)n92, (long)-1151522403836522897L, (long)l10);
        }
        return bl2;
    }

    @Override
    public long J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x2A3887C63CACL;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 48);
        int n12 = (int)(l11 << 48 >>> 48);
        long l12 = nh.x(this.M(), n10, (short)n11, (int)f5.a("p", (int)22352, (long)(0x10C506DBA3855430L ^ l10)), (int)f5.a("p", (int)23218, (long)(0x1232E09171EAD9D3L ^ l10)), this.n, n12);
        return l12;
    }

    String y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x35C547B25AFDL;
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("q", (Object)stringBuilder, (long)m44.a("q", (Object)this, (Object)objectArray2, (long)1244343852788028289L, (long)l10), (long)807408603200094844L, (long)l10);
        stringBuilder.append((char)f5.a("p", (int)29753, (long)(0x5BA8E98EE64CADA7L ^ l10)));
        stringBuilder.append(this.hashCode());
        return stringBuilder.toString();
    }

    public long z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x7289315A5B2DL;
        int n10 = (int)(l11 >>> 32);
        long l12 = l11 << 32 >>> 32;
        long l13 = nh.W(this.M(), n10, l12, (int)f5.a("p", (int)8593, (long)(0x65188D963681CAF7L ^ l10)), this.n);
        return l13;
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4654;
        if (d[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/f5", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f5.d[n11] = n12;
        }
        return d[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = f5.a(n10, l10);
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
            throw new RuntimeException("com/zelix/f5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

