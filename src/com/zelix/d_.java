/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._t;
import com.zelix.cf;
import com.zelix.m44;
import com.zelix.o9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
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
public class d_
implements _t {
    private int z;
    private static o9 X;
    private Object[] I;
    private final boolean q;
    private Map L;
    private Map o;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public Set y(Object[] objectArray) {
        BitSet bitSet;
        BitSet bitSet2;
        long l;
        int n;
        int n2;
        int n3;
        long l2;
        long l3;
        block4: {
            block5: {
                Object object = objectArray[0];
                l3 = (Long)objectArray[1];
                long l4 = l3;
                l2 = l4 ^ 0x75EFA0E53DBEL;
                long l5 = l4 ^ 0x3C3174821DC4L;
                n3 = (int)(l5 >>> 32);
                n2 = (int)(l5 << 32 >>> 48);
                n = (int)(l5 << 48 >>> 48);
                l = l4 ^ 0x2B657EC73279L;
                bitSet2 = (BitSet)m44.a("p", (Object)this, (long)-770319780380803700L, (long)l3).remove(object);
                CallSite callSite = m44.a("n", (long)-794854137521444146L, (long)l3);
                try {
                    try {
                        bitSet = bitSet2;
                        if (callSite != null) break block4;
                        if (bitSet != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)-1117027039818718868L, (long)l3);
                    }
                    return null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)-1117027039818718868L, (long)l3);
                }
            }
            bitSet = bitSet2;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = cf.x((int)m44.a("q", (Object)bitSet, (long)-642770632260062794L, (long)l3), (int)n3, (char)((char)n2), (short)((short)n));
        CallSite callSite = m44.a("n", (Object)objectArray2, (long)-1027545577682114827L, (long)l3);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l;
        objectArray3[1] = callSite;
        objectArray3[0] = bitSet2;
        m44.a("o", (Object)this, (Object)objectArray3, (long)-1647313912580252298L, (long)l3);
        return callSite;
    }

    public boolean L(long l, char c, Object object, Object object2) {
        BitSet bitSet;
        Integer n;
        block8: {
            BitSet bitSet2;
            Integer n2;
            CallSite callSite;
            long l2;
            block6: {
                block7: {
                    l2 = l << 16 | (long)c << 48 >>> 48;
                    n = (Integer)m44.a("w", (Object)this, (long)-5213471879974667205L, (long)l2).get(object2);
                    callSite = m44.a("i", (long)-5933753263705377903L, (long)l2);
                    try {
                        try {
                            n2 = n;
                            if (callSite != null) break block6;
                            if (n2 != null) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("i", (Object)illegalArgumentException, (long)-6259850286738229197L, (long)l2);
                        }
                        throw new IllegalArgumentException((String)((Object)d_.a("i", (int)22984, (long)(0x597526D62F12C4AL ^ l2))) + object2 + (String)((Object)d_.a("i", (int)28563, (long)(0x55B0746A29021A12L ^ l2))));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("i", (Object)illegalArgumentException, (long)-6259850286738229197L, (long)l2);
                    }
                }
                n2 = m44.a("w", (Object)this, (long)-6048254334007794477L, (long)l2).get(object);
            }
            bitSet = (BitSet)((Object)n2);
            try {
                bitSet2 = bitSet;
                if (callSite != null || bitSet2 != null) break block8;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("i", (Object)illegalArgumentException, (long)-6259850286738229197L, (long)l2);
            }
            bitSet = new BitSet(this.z);
            bitSet2 = m44.a("w", (Object)this, (long)-6048254334007794477L, (long)l2).put(object, bitSet);
        }
        int n3 = n;
        boolean bl = bitSet.get(n3);
        bitSet.set(n3);
        return bl;
    }

    public boolean A(char c, int n, int n2, Object object) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48;
        return m44.a("q", (Object)this, (long)-4506379719415641675L, (long)l).containsKey(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                d_.a = prr.a((long)-2043321349389758026L, (long)-1766504316284211272L, MethodHandles.lookup().lookupClass()).a(102982944454347L);
                var9 = d_.a ^ 57690915682795L;
                var11_1 = var9 ^ 134605347397554L;
                d_.d = new HashMap<K, V>(13);
                var0_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_3 = 1; var1_3 < 8; ++var1_3) {
                    v2 = v2;
                    v2[var1_3] = (byte)(var9 << var1_3 * 8 >>> 56);
                }
                var0_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_4 = new String[7];
                var5_5 = 0;
                var4_6 = "\u00b3.%\u00aa\u007f\u00e2?y\u008b\u00f7\u00d4\u00f1+\u00843\u00a2SN4\u00b9r\u008a\u00c0\u0098\u00e10\u00d6\u00ed\u0007\u001eO\u00b4m\u00f1\u00e5\u0095U\u00ee\u0017]\u00f7\n\u00f5\u00d6\u00f1U`\u007f6\u0093\u00ceD\u00a5\u000b\u00b4\u00b7q\u00fd\u00bb\u00bb\u0091f\u00a7\u00e2\u0010\u00ba\u0081S\\\u008b \u00de~\u00cdk\u00fda\u00c9-_:@\u00876\b\u00dc'AkO\u00c8\u0085.\u00a24-<\u00b1I v\u00f2\u00c7\u00d96\u00a0)\u0086\u00ae\u00f4\u0095\u00b3\u00da\u00f7\u00a7\u0091\u0001\u00c3\u009f\u00d5}\u00df\u00dd\u00f6\u00b2\u00d4\u0001`\u00f8\u00c6U\u001a\u00a6\u0082!\u0006\u009adLv\u00c4\u0084M\u00c2\u00e0\bP\u00b6\u0002\u00fdR\u00f6Ek\u0089*\u0003\u0086\u00a5\u00cb\u00b60\u00b9\u008c\u0003K?\u009b\u001c5\u00b4\u00b5\u00ea\u00e1\u00df\u00acQ\u00a3k\u0097T\u008e\u0082\u009b+\u00b6\u001d\u00e7\u00ad\u00ae\u0082\u0085'Um\u00c0]\u00b3\u00b9\u00f8\u0013\u0010\u009c\u00a5\u00d7\u00f0@\u00c6b\u00d7W\u00d8\u00b4\u00ed\u0092\u00b5\u0098\u0083\u00f4\u00c8\u000b\u00e6\n\u00fe\u00ec]t\u0010\u00bf\u00ec\u00a3>+&.P\u0087_\u000e\u00b8\u00b9\u0007\u007f1";
                var6_7 = "\u00b3.%\u00aa\u007f\u00e2?y\u008b\u00f7\u00d4\u00f1+\u00843\u00a2SN4\u00b9r\u008a\u00c0\u0098\u00e10\u00d6\u00ed\u0007\u001eO\u00b4m\u00f1\u00e5\u0095U\u00ee\u0017]\u00f7\n\u00f5\u00d6\u00f1U`\u007f6\u0093\u00ceD\u00a5\u000b\u00b4\u00b7q\u00fd\u00bb\u00bb\u0091f\u00a7\u00e2\u0010\u00ba\u0081S\\\u008b \u00de~\u00cdk\u00fda\u00c9-_:@\u00876\b\u00dc'AkO\u00c8\u0085.\u00a24-<\u00b1I v\u00f2\u00c7\u00d96\u00a0)\u0086\u00ae\u00f4\u0095\u00b3\u00da\u00f7\u00a7\u0091\u0001\u00c3\u009f\u00d5}\u00df\u00dd\u00f6\u00b2\u00d4\u0001`\u00f8\u00c6U\u001a\u00a6\u0082!\u0006\u009adLv\u00c4\u0084M\u00c2\u00e0\bP\u00b6\u0002\u00fdR\u00f6Ek\u0089*\u0003\u0086\u00a5\u00cb\u00b60\u00b9\u008c\u0003K?\u009b\u001c5\u00b4\u00b5\u00ea\u00e1\u00df\u00acQ\u00a3k\u0097T\u008e\u0082\u009b+\u00b6\u001d\u00e7\u00ad\u00ae\u0082\u0085'Um\u00c0]\u00b3\u00b9\u00f8\u0013\u0010\u009c\u00a5\u00d7\u00f0@\u00c6b\u00d7W\u00d8\u00b4\u00ed\u0092\u00b5\u0098\u0083\u00f4\u00c8\u000b\u00e6\n\u00fe\u00ec]t\u0010\u00bf\u00ec\u00a3>+&.P\u0087_\u000e\u00b8\u00b9\u0007\u007f1".length();
                var3_8 = 64;
                var2_9 = -1;
lbl22:
                // 2 sources

                while (true) {
                    v3 = ++var2_9;
                    v4 = var4_6.substring(v3, v3 + var3_8);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    var7_4[var5_5++] = d_.a(var8_10).intern();
                    if ((var2_9 += var3_8) < var6_7) {
                        var3_8 = var4_6.charAt(var2_9);
                        ** continue;
                    }
                    var4_6 = "\u00df\u0092\u00dc\u00f3\u008d\u0010]{j\u00d1\u00f2V4eLg\u00d6^\u001f\u0087J[\u00be`\u00a5\u00c0rRKD\u00d1{\u00ad\u00dd~\u00ea:\u009f\u00f6\u00c3\u0083\u00dfe\u00f2(2\u0007\u0092\u009dE\u00d9\u00fe\u00d1\u00b9oK\u008f:)b\u008d\u00a77\u00af\u0010\u0016\u00deKJi\u00dd\u00ba\u00f4\u00bf\u0018\u00a8\u00b9\u0004sG\u00a4";
                    var6_7 = "\u00df\u0092\u00dc\u00f3\u008d\u0010]{j\u00d1\u00f2V4eLg\u00d6^\u001f\u0087J[\u00be`\u00a5\u00c0rRKD\u00d1{\u00ad\u00dd~\u00ea:\u009f\u00f6\u00c3\u0083\u00dfe\u00f2(2\u0007\u0092\u009dE\u00d9\u00fe\u00d1\u00b9oK\u008f:)b\u008d\u00a77\u00af\u0010\u0016\u00deKJi\u00dd\u00ba\u00f4\u00bf\u0018\u00a8\u00b9\u0004sG\u00a4".length();
                    var3_8 = 64;
                    var2_9 = -1;
lbl36:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_9;
                        v4 = var4_6.substring(v6, v6 + var3_8);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    var7_4[var5_5++] = d_.a(var8_10).intern();
                    if ((var2_9 += var3_8) < var6_7) {
                        var3_8 = var4_6.charAt(var2_9);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_10 = var0_2.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        d_.b = var7_4;
        d_.c = new String[7];
        m44.a("m", (o9)o9.f((long)var11_1), (long)-4621520257088678112L, (long)var9);
    }

    public boolean l(Object[] objectArray) {
        Object object;
        block13: {
            boolean bl;
            block14: {
                Integer n;
                CallSite callSite;
                Integer n2;
                long l;
                Object object2;
                block11: {
                    block12: {
                        object2 = objectArray[0];
                        l = (Long)objectArray[1];
                        Object object3 = objectArray[2];
                        n2 = (Integer)m44.a("q", (Object)this, (long)-3152436661502320675L, (long)l).get(object3);
                        callSite = m44.a("o", (long)-3584478662618656649L, (long)l);
                        try {
                            try {
                                n = n2;
                                if (callSite != null) break block11;
                                if (n != null) break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("o", (Object)illegalArgumentException, (long)-3835160153088042027L, (long)l);
                            }
                            throw new IllegalArgumentException((String)((Object)d_.a("i", (int)14371, (long)(0x8DD251C7C45AE40L ^ l))) + object3 + (String)((Object)d_.a("i", (int)30078, (long)(0x550FF2795F48E31BL ^ l))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("o", (Object)illegalArgumentException, (long)-3835160153088042027L, (long)l);
                        }
                    }
                    n = m44.a("q", (Object)this, (long)-3461572907378096331L, (long)l).get(object2);
                }
                BitSet bitSet = (BitSet)((Object)n);
                try {
                    if (bitSet == null) {
                        return false;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)-3835160153088042027L, (long)l);
                }
                int n3 = n2;
                bl = bitSet.get(n3);
                try {
                    try {
                        bitSet.clear(n3);
                        object = m44.a("p", (Object)bitSet, (long)-3626197622031070449L, (long)l);
                        if (callSite != null) break block13;
                        if (object != false) break block14;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("o", (Object)illegalArgumentException, (long)-3835160153088042027L, (long)l);
                    }
                    m44.a("q", (Object)this, (long)-3461572907378096331L, (long)l).remove(object2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)-3835160153088042027L, (long)l);
                }
            }
            object = bl;
        }
        return (boolean)object;
    }

    public boolean K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (boolean)m44.a("q", (Object)m44.a("p", (Object)this, (long)6667396935474238532L, (long)l), (long)6823643480055479027L, (long)l);
    }

    public Set A(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6461A7967326L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("w", (Object)this, (long)-722796466283872965L, (long)l).keySet();
        return m44.a("i", (Object)objectArray2, (long)-1231780734963286283L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public void l(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[WHILELOOP], 16[DOLOOP], 18[DOLOOP]], but top level block is 4[TRYBLOCK]
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

    public Set J(long l, Object object) {
        BitSet bitSet;
        BitSet bitSet2;
        long l2;
        int n;
        int n2;
        int n3;
        long l3;
        block4: {
            block5: {
                long l4 = l;
                l3 = l4 ^ 0x7E65E11B076AL;
                long l5 = l4 ^ 0x37BB357C2710L;
                n3 = (int)(l5 >>> 32);
                n2 = (int)(l5 << 32 >>> 48);
                n = (int)(l5 << 48 >>> 48);
                l2 = l4 ^ 0x20EF3F3908ADL;
                bitSet2 = (BitSet)m44.a("t", (Object)this, (long)-3487108033948956840L, (long)l).get(object);
                CallSite callSite = m44.a("j", (long)-3590468595882733542L, (long)l);
                try {
                    try {
                        bitSet = bitSet2;
                        if (callSite != null) break block4;
                        if (bitSet != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)-3842821343743091784L, (long)l);
                    }
                    return null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)-3842821343743091784L, (long)l);
                }
            }
            bitSet = bitSet2;
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = cf.x((int)m44.a("u", (Object)bitSet, (long)-3620788505515668638L, (long)l), (int)n3, (char)((char)n2), (short)((short)n));
        CallSite callSite = m44.a("j", (Object)objectArray, (long)-3789384123349083103L, (long)l);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = callSite;
        objectArray2[0] = bitSet2;
        m44.a("k", (Object)this, (Object)objectArray2, (long)-3172896768326735966L, (long)l);
        return callSite;
    }

    public int J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("r", (Object)this, (long)4277683241458742174L, (long)l).size();
    }

    public Enumeration u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return Collections.enumeration(m44.a("s", (Object)this, (long)-8963284121913816225L, (long)l).keySet());
    }

    public List x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        long l2 = l ^ 0x51F33F72B7CEL;
        BitSet bitSet = (BitSet)m44.a("w", (Object)this, (long)8140323035757705275L, (long)l).get(object);
        try {
            if (bitSet == null) {
                return null;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("i", (Object)illegalArgumentException, (long)8487314169977955547L, (long)l);
        }
        ArrayList arrayList = new ArrayList((int)m44.a("v", (Object)bitSet, (long)8260464926533907457L, (long)l));
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = arrayList;
        objectArray2[0] = bitSet;
        m44.a("h", (Object)this, (Object)objectArray2, (long)7824135941016901825L, (long)l);
        return arrayList;
    }

    public d_(long l, Object[] objectArray, int n) {
        long l2 = (l = a ^ l) ^ 0x47F064E58098L;
        this(objectArray, l2, n, true);
    }

    public boolean C(Object object, long l, Object object2) {
        BitSet bitSet;
        Integer n;
        block10: {
            BitSet bitSet2;
            block11: {
                Integer n2;
                CallSite callSite;
                block8: {
                    block9: {
                        n = (Integer)m44.a("v", (Object)this, (long)-4861862833724115174L, (long)l).get(object2);
                        callSite = m44.a("h", (long)-6447424405421508432L, (long)l);
                        try {
                            try {
                                n2 = n;
                                if (callSite != null) break block8;
                                if (n2 != null) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("h", (Object)illegalArgumentException, (long)-6772925496994090222L, (long)l);
                            }
                            throw new IllegalArgumentException((String)((Object)d_.a("i", (int)22984, (long)(0x597651CF05D276BL ^ l))) + object2 + (String)((Object)d_.a("i", (int)21850, (long)(0x592ED3129C11ABFDL ^ l))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("h", (Object)illegalArgumentException, (long)-6772925496994090222L, (long)l);
                        }
                    }
                    n2 = m44.a("v", (Object)this, (long)-6399193081424138254L, (long)l).get(object);
                }
                bitSet2 = (BitSet)((Object)n2);
                try {
                    try {
                        bitSet = bitSet2;
                        if (callSite != null) break block10;
                        if (bitSet != null) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)-6772925496994090222L, (long)l);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)-6772925496994090222L, (long)l);
                }
            }
            bitSet = bitSet2;
        }
        return bitSet.get(n);
    }

    public d_(d_ d_2, int n, long l) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x4A564CD48F1FL;
        long l4 = l2 ^ 0x75BDF76B3E3FL;
        this((Object[])m44.a("t", (Object)d_2, (long)497860717086062143L, (long)l), l3, n, false);
        Object[] objectArray = new Object[2];
        objectArray[1] = d_2;
        objectArray[0] = l4;
        m44.a("u", (Object)this, (Object)objectArray, (long)2256861047474256091L, (long)l);
    }

    public void F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        m44.a("p", (Object)this, (long)-8730376938630574572L, (long)l).clear();
    }

    /*
     * Unable to fully structure code
     */
    public d_(Object[] var1_1, long var2_2, int var4_3, boolean var5_4) {
        block17: {
            block15: {
                block16: {
                    block14: {
                        v0 = var2_2 = d_.a ^ var2_2;
                        var6_5 = v0 ^ 107964617860877L;
                        var8_6 = v0 ^ 93134262016165L;
                        v1 = v0 ^ 17989716342597L;
                        var10_7 = (int)(v1 >>> 32);
                        var11_8 = (int)(v1 << 32 >>> 48);
                        var12_9 = (int)(v1 << 48 >>> 48);
                        v2 = m44.a("o", (long)2195839286621503567L, (long)var2_2);
                        super();
                        var13_10 = v2;
                        try {
                            try {
                                if (var13_10 != null) break block14;
                                if (var5_4) {
                                }
                                ** GOTO lbl30
                            }
                            catch (IllegalArgumentException v3) {
                                throw m44.a("o", (Object)v3, (long)1945178725486005229L, (long)var2_2);
                            }
                            m44.a("s", (Object)this, (Object[])new Object[var1_1.length], (long)2129506382845062490L, (long)var2_2);
                            System.arraycopy(var1_1, 0, m44.a("q", (Object)this, (long)2129506382845062490L, (long)var2_2), 0, var1_1.length);
                        }
                        catch (IllegalArgumentException v4) {
                            throw m44.a("o", (Object)v4, (long)1945178725486005229L, (long)var2_2);
                        }
                    }
                    try {
                        if (var2_2 < 0L) break block15;
                        if (var13_10 == null) break block16;
lbl30:
                        // 2 sources

                        m44.a("s", (Object)this, (Object[])var1_1, (long)2129506382845062490L, (long)var2_2);
                    }
                    catch (IllegalArgumentException v5) {
                        throw m44.a("o", (Object)v5, (long)1945178725486005229L, (long)var2_2);
                    }
                }
                v6 = new Object[2];
                v6[1] = var8_6;
                v6[0] = cf.x((int)var4_3, (int)var10_7, (char)((char)var11_8), (short)((short)var12_9));
                m44.a("s", (Object)this, (Map)m44.a("o", (Object)v6, (long)2045787195137431940L, (long)var2_2), (long)2291886153497122573L, (long)var2_2);
                v7 = new Object[2];
                v7[1] = var8_6;
                v7[0] = cf.x((int)((CallSite)m44.a("q", (Object)this, (long)2129506382845062490L, (long)var2_2)).length, (int)var10_7, (char)((char)var11_8), (short)((short)var12_9));
                m44.a("s", (Object)this, (Map)m44.a("o", (Object)v7, (long)2045787195137431940L, (long)var2_2), (long)322047061563641829L, (long)var2_2);
                this.z = ((CallSite)m44.a("q", (Object)this, (long)2129506382845062490L, (long)var2_2)).length;
            }
            var14_11 = 0;
            block8: while (var14_11 < this.z) {
                try {
                    m44.a("q", (Object)this, (long)322047061563641829L, (long)var2_2).put(m44.a("q", (Object)this, (long)2129506382845062490L, (long)var2_2)[var14_11], m44.a("k", (long)176806808097303177L, (long)var2_2).e(var6_5, var14_11));
                    ++var14_11;
                    do {
                        v8 = var13_10;
                        if (var2_2 > 0L) {
                            if (v8 != null) break block17;
                            v8 = var13_10;
                        }
                        if (v8 == null) continue block8;
                    } while (var2_2 < 0L);
                    break;
                }
                catch (IllegalArgumentException v9) {
                    throw m44.a("o", (Object)v9, (long)1945178725486005229L, (long)var2_2);
                }
            }
            this.q = var5_4;
        }
    }

    /*
     * Loose catch block
     * Could not resolve type clashes
     */
    private Collection x(Object[] objectArray) {
        BitSet bitSet = (BitSet)objectArray[0];
        Collection collection = (Collection)objectArray[1];
        long l = (Long)objectArray[2];
        l = a ^ l;
        CallSite callSite = m44.a("r", (Object)bitSet, (long)5843224641172625333L, (long)l);
        int n = 0;
        CallSite callSite2 = m44.a("m", (long)5979436728836574413L, (long)l);
        block8: for (int i = 0; i < this.z; ++i) {
            while (true) {
                int n2;
                block10: {
                    block11: {
                        try {
                            try {
                                n2 = bitSet.get(i);
                                if (l <= 0L || callSite2 != null) break block10;
                                if (n2 == 0) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("m", (Object)illegalArgumentException, (long)6232035800040327023L, (long)l);
                            }
                            m44.a("r", (Object)collection, (Object)m44.a("s", (Object)this, (long)5841042212694942168L, (long)l)[i], (long)5817860930927484436L, (long)l);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("m", (Object)illegalArgumentException, (long)6232035800040327023L, (long)l);
                        }
                    }
                    n2 = ++n;
                }
                try {
                    if (n2 >= callSite && callSite2 == null) break block8;
                    continue block8;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)6232035800040327023L, (long)l);
                }
                break;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("m", (Object)illegalArgumentException, (long)6232035800040327023L, (long)l);
            }
        }
        return collection;
    }

    /*
     * Unable to fully structure code
     */
    public void s(Object[] var1_1) {
        block10: {
            block11: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (d_)var1_1[1];
                var2_2 = d_.a ^ var2_2;
                var5_4 = m44.a("o", (long)-5811596416017780369L, (long)var2_2);
                try {
                    try {
                        v0 = var4_3;
                        if (var5_4 != null) break block10;
                        if (m44.a("q", (Object)v0, (long)-6003939119051858822L, (long)var2_2) == m44.a("q", (Object)this, (long)-6003939119051858822L, (long)var2_2)) break block11;
                    }
                    catch (IllegalArgumentException v1) {
                        throw m44.a("o", (Object)v1, (long)-6062242756200088883L, (long)var2_2);
                    }
                    throw new IllegalArgumentException((String)d_.a("i", (int)27743, (long)(8616204994453969697L ^ var2_2)) + System.identityHashCode(m44.a("q", (Object)this, (long)-6003939119051858822L, (long)var2_2)) + (String)d_.a("i", (int)1300, (long)(3426685799231025773L ^ var2_2)) + System.identityHashCode(m44.a("q", (Object)var4_3, (long)-6003939119051858822L, (long)var2_2)));
                }
                catch (IllegalArgumentException v2) {
                    throw m44.a("o", (Object)v2, (long)-6062242756200088883L, (long)var2_2);
                }
            }
            v0 = var4_3;
        }
        for (Map.Entry<K, V> var7_6 : m44.a("q", (Object)v0, (long)-5841637400854747603L, (long)var2_2).entrySet()) {
            block13: {
                block14: {
                    block12: {
                        var8_7 = var7_6.getKey();
                        var9_8 = (BitSet)var7_6.getValue();
                        var10_9 = (BitSet)m44.a("q", (Object)this, (long)-5841637400854747603L, (long)var2_2).get(var8_7);
                        try {
                            v3 = var10_9;
                            if (var5_4 != null) break block12;
                            if (v3 == null) {
                            }
                            ** GOTO lbl37
                        }
                        catch (IllegalArgumentException v4) {
                            throw m44.a("o", (Object)v4, (long)-6062242756200088883L, (long)var2_2);
                        }
                        var11_10 = m44.a("q", (Object)this, (long)-5841637400854747603L, (long)var2_2).put(var8_7, (BitSet)var9_8.clone());
                        try {
                            v5 = var5_4;
                            if (var2_2 <= 0L) break block13;
                            if (v5 == null) break block14;
lbl37:
                            // 2 sources

                            v3 = var10_9;
                        }
                        catch (IllegalArgumentException v6) {
                            throw m44.a("o", (Object)v6, (long)-6062242756200088883L, (long)var2_2);
                        }
                    }
                    v3.or(var9_8);
                }
                v5 = var5_4;
            }
            if (v5 == null) continue;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5665;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/d_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            d_.c[n2] = d_.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = d_.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/d_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
