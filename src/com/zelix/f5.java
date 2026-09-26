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
        long l = (Long)objectArray[0];
        this.X.add(l);
    }

    public boolean equals(Object object) {
        boolean bl;
        block10: {
            block11: {
                long l;
                block12: {
                    block13: {
                        Object object2;
                        CallSite callSite;
                        long l2;
                        int n;
                        long l3;
                        block8: {
                            block9: {
                                l3 = a ^ 0x2D205197542AL;
                                long l4 = l3 ^ 0x625CEBA60D36L;
                                n = (int)(l4 >>> 32);
                                l2 = l4 << 32 >>> 32;
                                callSite = m44.a("j", (long)8525935934372507385L, (long)l3);
                                try {
                                    try {
                                        object2 = this;
                                        if (callSite == null) break block8;
                                        if (object2 != object) break block9;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)((Object)n92), (long)7652361841271444569L, (long)l3);
                                    }
                                    return true;
                                }
                                catch (n9 n93) {
                                    throw m44.a("j", (Object)((Object)n93), (long)7652361841271444569L, (long)l3);
                                }
                            }
                            object2 = object;
                        }
                        try {
                            bl = object2 instanceof f5;
                            if (callSite == null) break block10;
                            if (!bl) break block11;
                        }
                        catch (n9 n94) {
                            throw m44.a("j", (Object)((Object)n94), (long)7652361841271444569L, (long)l3);
                        }
                        f5 f52 = (f5)object;
                        try {
                            long l5 = nh.W((long)this.M(), (int)n, (long)l2, (int)f5.a("p", (int)23634, (long)(0x21FEBAE49844612CL ^ l3)), (int[])this.n) - nh.W((long)f52.M(), (int)n, (long)l2, (int)f5.a("p", (int)23634, (long)(0x21FEBAE49844612CL ^ l3)), (int[])f52.n);
                            l = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                            if (callSite == null) break block12;
                            if (l != false) break block13;
                        }
                        catch (n9 n95) {
                            throw m44.a("j", (Object)((Object)n95), (long)7652361841271444569L, (long)l3);
                        }
                        l = 1;
                        break block12;
                    }
                    l = 0;
                }
                long l6 = l;
                return (boolean)l6;
            }
            bl = false;
        }
        return bl;
    }

    public void Q(Object[] objectArray) {
        int[] nArray = (int[])objectArray[0];
        System.arraycopy(nArray, 0, this.n, 0, this.n.length);
    }

    public int e(int n, int n2, char c) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ a;
        long l2 = l ^ 0x53038FE771F1L;
        int n3 = (int)(l2 >>> 32);
        int n4 = (int)(l2 << 32 >>> 48);
        int n5 = (int)(l2 << 48 >>> 48);
        return (int)nh.x((long)this.M(), (int)n3, (short)((short)n4), (int)f5.a("p", (int)23634, (long)(0x21FEFC3175B81268L ^ l)), (int)f5.a("p", (int)6039, (long)(0x3B74B6291656D9A8L ^ l)), (int[])this.n, (int)n5);
    }

    public long A(Object[] objectArray) {
        long l;
        block5: {
            CallSite callSite;
            long l2;
            long l3;
            long l4;
            block4: {
                l4 = (Long)objectArray[0];
                l3 = (Long)objectArray[1];
                long l5 = l3;
                l2 = l5 ^ 0L;
                long l6 = l5 ^ 0x7980EBD31ECL;
                int n = (int)(l6 >>> 32);
                int n2 = (int)(l6 << 32 >>> 48);
                int n3 = (int)(l6 << 48 >>> 48);
                long l7 = this.M();
                CallSite callSite2 = m44.a("k", (long)4975113924159790496L, (long)l3);
                int[] nArray = this.n;
                l = nh.x((long)l7, (int)n, (short)((short)n2), (int)f5.a("p", (int)1007, (long)(0x3AB9C1E2AB318DC9L ^ l3)), (int)f5.a("p", (int)9582, (long)(0x20EFCF95E994AB4BL ^ l3)), (int[])nArray, (int)n3);
                long l8 = l7 ^ (m44.a("u", (Object)this, (long)6479605879399344004L, (long)l3) ^ l4);
                try {
                    try {
                        this.X.add(l8);
                        callSite = m44.a("u", (Object)this, (long)6427046367577698425L, (long)l3);
                        if (callSite2 == null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)6443442439701866240L, (long)l3);
                    }
                    callSite = m44.a("u", (Object)this, (long)6427046367577698425L, (long)l3);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)6443442439701866240L, (long)l3);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l2;
            objectArray2[0] = l4;
            m44.a("t", (Object)callSite, (Object)objectArray2, (long)6755617430841199912L, (long)l3);
        }
        return l;
    }

    public int hashCode() {
        long l = a ^ 0x4532AB1B9353L;
        long l2 = l ^ 0xA4E112ACA4FL;
        int n = (int)(l2 >>> 32);
        long l3 = l2 << 32 >>> 32;
        int n2 = (int)nh.W((long)this.M(), (int)n, (long)l3, (int)f5.a("p", (int)1007, (long)(0x3AB9BBBE3D1B79E9L ^ l)), (int[])this.n);
        return n2;
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

    public long M() {
        return (Long)this.X.get(this.X.size() - 1);
    }

    long m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (long)m44.a("s", (Object)this, (long)7357277278377433202L, (long)l);
    }

    public boolean Y(Object[] objectArray) {
        return true;
    }

    public void n(Object[] objectArray) {
        block11: {
            Object[] objectArray2;
            Object object;
            long l;
            block12: {
                f5 f52;
                long l2;
                block13: {
                    Object[] objectArray3;
                    block10: {
                        lun lun2 = (lun)objectArray[0];
                        l = (Long)objectArray[1];
                        l2 = l ^ 0L;
                        f52 = (f5)lun2;
                        objectArray3 = m44.a("h", (long)-5359217087332668149L, (long)l);
                        try {
                            try {
                                object = this;
                                if (objectArray3 == null) break block10;
                                if (object == f52) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)-6214774557167134805L, (long)l);
                            }
                            object = m44.a("v", (Object)this, (long)-6225541301532688174L, (long)l);
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-6214774557167134805L, (long)l);
                        }
                    }
                    try {
                        block14: {
                            try {
                                try {
                                    objectArray2 = objectArray3;
                                    if (l < 0L) break block12;
                                    if (objectArray2 == null) break block13;
                                    if (object != null) break block14;
                                }
                                catch (n9 n94) {
                                    throw m44.a("h", (Object)((Object)n94), (long)-6214774557167134805L, (long)l);
                                }
                                m44.a("t", (Object)this, (f5)f52, (long)-6225541301532688174L, (long)l);
                                m44.a("t", (Object)f52, (f5)this, (long)-5398746749682527121L, (long)l);
                                if (objectArray3 != null) break block11;
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)((Object)n95), (long)-6214774557167134805L, (long)l);
                            }
                        }
                        object = m44.a("v", (Object)this, (long)-6225541301532688174L, (long)l);
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)((Object)n96), (long)-6214774557167134805L, (long)l);
                    }
                }
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l2;
                objectArray2 = objectArray4;
                objectArray4[0] = f52;
            }
            m44.a("w", (Object)object, (Object)objectArray2, (long)-5450145898532760175L, (long)l);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Q(Object[] objectArray) {
        f5 f52 = (f5)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = ((long)n << 48 | l << 16 >>> 16) ^ a;
        long l3 = l2 ^ 0x18C7E0FE1B7BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        f5 f53 = (f5)((Object)m44.a("q", (Object)this, (Object)objectArray2, (long)1883855182712131679L, (long)l2));
        CallSite callSite = m44.a("n", (long)235909261792746477L, (long)l2);
        while (f53 != null) {
            block5: {
                f5 f54;
                block6: {
                    try {
                        try {
                            if (n < 0) break block5;
                            f54 = f53;
                            if (callSite == null) break block5;
                            if (f54 != f52) break block6;
                            return true;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)((Object)n92), (long)2244636748428501325L, (long)l2);
                        }
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)((Object)n93), (long)2244636748428501325L, (long)l2);
                    }
                }
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l3;
                f54 = f53 = (f5)((Object)m44.a("q", (Object)f53, (Object)objectArray3, (long)1883855182712131679L, (long)l2));
            }
            if (callSite != null) continue;
        }
        boolean bl = false;
        if (n < 0) return bl;
        return bl;
    }

    public long f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x22001545114DL;
        int n3 = (int)(l2 >>> 32);
        int n4 = (int)(l2 << 32 >>> 48);
        int n5 = (int)(l2 << 48 >>> 48);
        return nh.x((long)this.M(), (int)n3, (short)((short)n4), (int)n, (int)n2, (int[])this.n, (int)n5);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                f5.a = prr.a((long)4358785756371716848L, (long)2254396833204661250L, MethodHandles.lookup().lookupClass()).a(163362201442629L);
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

    f5(int n, long l, int n2, int[] nArray, l6q l6q2, long l2, Set set) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x984F8E0247CL;
        long l5 = l3 ^ 0x157AC5FAC672L;
        this.X = new ArrayList();
        Object[] objectArray = new Object[5];
        objectArray[4] = nArray;
        objectArray[3] = n2;
        objectArray[2] = l4;
        objectArray[1] = l;
        objectArray[0] = n;
        CallSite callSite = m44.a("m", (Object)objectArray, (long)-5954090553748833574L, (long)l2);
        this.n = nArray;
        this.X.add((long)callSite);
        CallSite callSite2 = m44.a("i", (long)-5293458166674333891L, (long)l2);
        m44.a("n", (int)(callSite2 + true), (long)-5293458166674333891L, (long)l2);
        this.D = (int)callSite2;
        l6q2.t((Object)nArray, (Object)this, l5);
        set.add(nArray);
    }

    public void B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        m44.a("v", (Object)this, (long)l, (long)-3187132562791666259L, (long)l2);
    }

    f5(f5 f52, long l, int[] nArray) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x69A84BF3AD54L;
        long l4 = l2 ^ 0x3F0DF6B27766L;
        long l5 = l2 ^ 0x17EDB68A153CL;
        int n = (int)(l5 >>> 32);
        int n2 = (int)(l5 << 32 >>> 48);
        int n3 = (int)(l5 << 48 >>> 48);
        this.X = new ArrayList();
        this.n = nArray;
        int n4 = f52.e(n, n2, (char)n3);
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        CallSite callSite = m44.a("r", (Object)f52, (Object)objectArray, (long)4386443281595055642L, (long)l);
        int n5 = f52.hashCode();
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = nArray;
        objectArray2[3] = n5;
        objectArray2[2] = l3;
        objectArray2[1] = (long)callSite;
        objectArray2[0] = n4;
        CallSite callSite2 = m44.a("m", (Object)objectArray2, (long)2627483159852823538L, (long)l);
        this.X.add((long)callSite2);
        CallSite callSite3 = m44.a("i", (long)4585152583809619477L, (long)l);
        m44.a("n", (int)(callSite3 + true), (long)4585152583809619477L, (long)l);
        this.D = (int)callSite3;
    }

    public int y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("q", (Object)this, (long)1150051467715595121L, (long)l);
    }

    int[] N(Object[] objectArray) {
        return this.n;
    }

    Long B(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        return (Long)this.X.get(n);
    }

    public void T(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        m44.a("p", (Object)this, (int)n, (long)5996213705486014386L, (long)l);
    }

    long T(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x758FD98B5006L;
        int n2 = (int)(l2 >>> 32);
        int n3 = (int)(l2 << 32 >>> 48);
        int n4 = (int)(l2 << 48 >>> 48);
        long l3 = nh.x((long)((Long)((Object)m44.a("v", (Object)this, (Object)new Object[]{n}, (long)4410013027094541128L, (long)l))), (int)n2, (short)((short)n3), (int)f5.a("p", (int)1007, (long)(0x3AB9B3F57C07EC23L ^ l)), (int)f5.a("p", (int)9582, (long)(0x20EFBD823EA2CAA1L ^ l)), (int[])this.n, (int)n4);
        return l3;
    }

    public lun J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("t", (Object)this, (long)3098481467077722696L, (long)l);
    }

    public boolean Y(int n, short s, int n2, lun lun2) {
        boolean bl;
        block10: {
            block11: {
                boolean bl2;
                block12: {
                    block13: {
                        f5 f52;
                        CallSite callSite;
                        int n3;
                        int n4;
                        int n5;
                        long l;
                        block8: {
                            block9: {
                                l = (long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48;
                                long l2 = l ^ 0x13C797EA3029L;
                                n5 = (int)(l2 >>> 32);
                                n4 = (int)(l2 << 32 >>> 48);
                                n3 = (int)(l2 << 48 >>> 48);
                                callSite = m44.a("h", (long)1889314222145110675L, (long)l);
                                try {
                                    try {
                                        f52 = this;
                                        if (callSite == null) break block8;
                                        if (f52 != lun2) break block9;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)((Object)n92), (long)457293782832019507L, (long)l);
                                    }
                                    return true;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)((Object)n93), (long)457293782832019507L, (long)l);
                                }
                            }
                            f52 = lun2;
                        }
                        try {
                            bl = f52 instanceof f5;
                            if (callSite == null) break block10;
                            if (!bl) break block11;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)((Object)n94), (long)457293782832019507L, (long)l);
                        }
                        f5 f53 = (f5)lun2;
                        try {
                            bl2 = this.e(n5, n4, (char)n3) - f53.e(n5, n4, (char)n3);
                            if (callSite == null) break block12;
                            if (bl2 > false) break block13;
                        }
                        catch (n9 n95) {
                            throw m44.a("h", (Object)((Object)n95), (long)457293782832019507L, (long)l);
                        }
                        bl2 = true;
                        break block12;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = true;
        }
        return bl;
    }

    f5(long l, int[] nArray, long l2, l6q l6q2, Set set) {
        long l3 = (l2 = a ^ l2) ^ 0x7CEDA7C03A43L;
        this.X = new ArrayList();
        this.n = nArray;
        this.X.add(l);
        CallSite callSite = m44.a("h", (long)5384249344747021068L, (long)l2);
        m44.a("o", (int)(callSite + true), (long)5384249344747021068L, (long)l2);
        this.D = (int)callSite;
        l6q2.t((Object)nArray, (Object)this, l3);
        set.add(nArray);
    }

    public boolean M(Object[] objectArray) {
        boolean bl;
        long l = (Long)objectArray[0];
        l = a ^ l;
        try {
            bl = m44.a("r", (Object)this, (long)-1380463918234628693L, (long)l) != null;
        }
        catch (n9 n92) {
            throw m44.a("l", (Object)((Object)n92), (long)-1151522403836522897L, (long)l);
        }
        return bl;
    }

    public long J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2A3887C63CACL;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 48);
        int n3 = (int)(l2 << 48 >>> 48);
        long l3 = nh.x((long)this.M(), (int)n, (short)((short)n2), (int)f5.a("p", (int)22352, (long)(0x10C506DBA3855430L ^ l)), (int)f5.a("p", (int)23218, (long)(0x1232E09171EAD9D3L ^ l)), (int[])this.n, (int)n3);
        return l3;
    }

    String y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x35C547B25AFDL;
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("q", (Object)stringBuilder, (long)m44.a("q", (Object)this, (Object)objectArray2, (long)1244343852788028289L, (long)l), (long)807408603200094844L, (long)l);
        stringBuilder.append((char)f5.a("p", (int)29753, (long)(0x5BA8E98EE64CADA7L ^ l)));
        stringBuilder.append(this.hashCode());
        return stringBuilder.toString();
    }

    public long z(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x7289315A5B2DL;
        int n = (int)(l2 >>> 32);
        long l3 = l2 << 32 >>> 32;
        long l4 = nh.W((long)this.M(), (int)n, (long)l3, (int)f5.a("p", (int)8593, (long)(0x65188D963681CAF7L ^ l)), (int[])this.n);
        return l4;
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4654;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
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
                throw new RuntimeException("com/zelix/f5", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f5.d[n2] = n3;
        }
        return d[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = f5.a(n, l);
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
