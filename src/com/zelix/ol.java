/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
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
public class ol {
    private boolean N;
    Map H;
    private int g;
    private int v;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    /*
     * Exception decompiling
     */
    public Enumeration t(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[WHILELOOP]], but top level block is 3[WHILELOOP]
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

    public ol(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x6064332E949AL;
        this(l2, n, (int)ol.a("n", (int)6143, (long)(0x55539DB444E5DE21L ^ l)), false);
    }

    public ol I(Object[] objectArray) {
        ol ol2;
        block5: {
            long l = (Long)objectArray[0];
            long l2 = l = a ^ l;
            long l3 = l2 ^ 0x484D95911A41L;
            long l4 = l2 ^ 0x7EBD03EAFE80L;
            int n = this.H.size();
            ol ol3 = new ol(n * 2 + 1, this.N, l3);
            CallSite callSite = m44.a("o", (long)207565812606180567L, (long)l);
            for (Map.Entry entry : this.H.entrySet()) {
                CallSite callSite2;
                block7: {
                    Object object;
                    block8: {
                        Map map;
                        block6: {
                            map = (Map)entry.getValue();
                            try {
                                ol2 = this;
                                if (callSite != null) break block5;
                                if (!ol2.N) break block6;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)((Object)n92), (long)91649237884016250L, (long)l);
                            }
                            object = new ConcurrentHashMap(map);
                            callSite2 = callSite;
                            if (l < 0L) break block7;
                            if (callSite2 == null) break block8;
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l4;
                        objectArray2[0] = map;
                        object = m44.a("o", (Object)objectArray2, (long)1834726403416779257L, (long)l);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = object;
                    objectArray3[0] = entry.getKey();
                    m44.a("p", (Object)ol3, (Object)objectArray3, (long)540010274854237453L, (long)l);
                    callSite2 = callSite;
                }
                if (callSite2 == null) continue;
            }
            ol2 = ol3;
        }
        return ol2;
    }

    public Object T(Object[] objectArray) {
        Map map;
        block10: {
            Map map2;
            block9: {
                Map map3;
                CallSite callSite;
                Map map4;
                Object object;
                long l;
                block8: {
                    l = (Long)objectArray[0];
                    object = objectArray[1];
                    Object object2 = objectArray[2];
                    l = a ^ l;
                    map2 = null;
                    map4 = (Map)this.H.get(object);
                    callSite = m44.a("k", (long)-2239111917984940325L, (long)l);
                    try {
                        try {
                            map3 = map4;
                            if (callSite != null) break block8;
                            if (map3 == null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)((Object)n92), (long)-2068869750418377610L, (long)l);
                        }
                        map3 = map4.remove(object2);
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)((Object)n93), (long)-2068869750418377610L, (long)l);
                    }
                }
                map2 = map3;
                try {
                    try {
                        map = map4;
                        if (callSite != null) break block10;
                        if (map.size() != 0) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)((Object)n94), (long)-2068869750418377610L, (long)l);
                    }
                    this.H.remove(object);
                }
                catch (n9 n95) {
                    throw m44.a("k", (Object)((Object)n95), (long)-2068869750418377610L, (long)l);
                }
            }
            map = map2;
        }
        return map;
    }

    public Object h(short s, char c, Object object, int n, Object object2, Object object3) {
        Object object4;
        block3: {
            Map map;
            block2: {
                long l = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ a;
                long l2 = l ^ 0x68F4C92E9723L;
                object4 = null;
                map = (Map)this.H.get(object);
                if (map != null) break block2;
                map = this.x(l2);
                map.put(object2, object3);
                this.H.put(object, map);
                if (n > 0) break block3;
            }
            object4 = map.put(object2, object3);
        }
        return object4;
    }

    public boolean V(Object[] objectArray) {
        Map map;
        Object object;
        block4: {
            Map map2;
            block5: {
                long l = (Long)objectArray[0];
                Object object2 = objectArray[1];
                object = objectArray[2];
                l = a ^ l;
                map2 = (Map)this.H.get(object2);
                CallSite callSite = m44.a("l", (long)-5392429783824946404L, (long)l);
                try {
                    try {
                        map = map2;
                        if (callSite != null) break block4;
                        if (map != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)-5292068417345707599L, (long)l);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)-5292068417345707599L, (long)l);
                }
            }
            map = map2;
        }
        return map.containsKey(object);
    }

    public boolean f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("t", (Object)this.H, (long)1704369011851506662L, (long)l);
    }

    public Enumeration i(Object[] objectArray) {
        return Collections.enumeration(this.H.values());
    }

    public Map T(Object object) {
        return (Map)this.H.get(object);
    }

    public Map b(Object[] objectArray) {
        Object object = objectArray[0];
        Map map = (Map)objectArray[1];
        return this.H.put(object, map);
    }

    public int m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        int n = 0;
        CallSite callSite = m44.a("n", (long)-4366184995494896290L, (long)l);
        for (Map map : this.H.values()) {
            if (map != null) {
                n += map.size();
            }
            if (callSite == null) continue;
        }
        return n;
    }

    public Map d(Object[] objectArray) {
        Object object = objectArray[0];
        return (Map)this.H.remove(object);
    }

    public void L(Object[] objectArray) {
        block6: {
            long l = (Long)objectArray[0];
            l = a ^ l;
            Iterator iterator = this.H.values().iterator();
            CallSite callSite = m44.a("k", (long)-2254888488819884413L, (long)l);
            block2: while (iterator.hasNext()) {
                try {
                    ((Map)iterator.next()).clear();
                    do {
                        CallSite callSite2 = callSite;
                        if (l >= 0L) {
                            if (callSite2 != null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 == null) continue block2;
                    } while (l <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)((Object)n92), (long)-2084620567676259282L, (long)l);
                }
            }
            this.H.clear();
        }
    }

    public Set t(Object[] objectArray) {
        return this.H.keySet();
    }

    public ol(int n, boolean bl, long l) {
        long l2 = (l = a ^ l) ^ 0x71FDE8EFC996L;
        this(l2, n, (int)ol.a("n", (int)6143, (long)(0x55538C2D9F24832DL ^ l)), bl);
    }

    public Set m(Object[] objectArray) {
        return this.H.entrySet();
    }

    public int A(Object[] objectArray) {
        return this.H.size();
    }

    public boolean I(Object object) {
        return this.H.containsKey(object);
    }

    public ol(int n, int n2, int n3, char c, short s) {
        long l = ((long)n3 << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0x35F295A7AE68L;
        this(l2, n, n2, false);
    }

    public ol(long l, int n, int n2, boolean bl) {
        block3: {
            long l2;
            block2: {
                long l3 = l = a ^ l;
                l2 = l3 ^ 0x313736E057EAL;
                long l4 = l3 ^ 0x75DF3ADC380AL;
                int n3 = (int)(l4 >>> 32);
                int n4 = (int)(l4 << 32 >>> 48);
                int n5 = (int)(l4 << 48 >>> 48);
                this.N = bl;
                this.v = cf.x((int)n, (int)n3, (char)((char)n4), (short)((short)n5));
                this.g = cf.x((int)n2, (int)n3, (char)((char)n4), (short)((short)n5));
                if (!bl) break block2;
                this.H = new ConcurrentHashMap(this.v);
                if (l > 0L) break block3;
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l2;
            objectArray[0] = this.v;
            this.H = m44.a("h", (Object)objectArray, (long)-3230350736276629813L, (long)l);
        }
    }

    public Map x(long l) {
        long l2 = (l = a ^ l) ^ 0x60F2A06B366EL;
        try {
            if (this.N) {
                return new ConcurrentHashMap(this.g);
            }
        }
        catch (n9 n92) {
            throw m44.a("l", (Object)((Object)n92), (long)-5541976162777521111L, (long)l);
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this.g;
        return m44.a("l", (Object)objectArray, (long)-5571184893603072177L, (long)l);
    }

    public Enumeration z(Object[] objectArray) {
        return Collections.enumeration(this.H.keySet());
    }

    public Map q(Object[] objectArray) {
        Object object;
        block4: {
            Map map;
            long l;
            long l2;
            block3: {
                Map map2;
                block2: {
                    l2 = (Long)objectArray[0];
                    map2 = (Map)objectArray[1];
                    l = (l2 = a ^ l2) ^ 0x174B64F1E056L;
                    CallSite callSite = m44.a("i", (long)2033100318835933697L, (long)l2);
                    if (!this.N) break block2;
                    map = new ConcurrentHashMap(map2);
                    if (l2 < 0L) break block3;
                    object = map;
                    if (callSite == null) break block4;
                }
                map = map2;
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l;
            objectArray2[0] = map;
            object = m44.a("i", (Object)objectArray2, (long)549483165215160111L, (long)l2);
        }
        return object;
    }

    public ol(long l, boolean bl) {
        long l2 = (l = a ^ l) ^ 0x2661817DD38L;
        this(l2, (int)ol.a("n", (int)13729, (long)(0x78FA106F79D735DFL ^ l)), (int)ol.a("n", (int)6143, (long)(0x5553FFB66FDC9783L ^ l)), bl);
    }

    public ol(int n, short s, short s2) {
        long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x5E36BC33CA5EL;
        this(l2, (int)ol.a("n", (int)26626, (long)(0x7400F3F252C67F1BL ^ l)), (int)ol.a("n", (int)17746, (long)(0xC17EC4F4E01D249L ^ l)), false);
    }

    public Object m(long l, Object object, Object object2) {
        Map map;
        block4: {
            Map map2;
            block5: {
                l = a ^ l;
                map2 = (Map)this.H.get(object);
                CallSite callSite = m44.a("h", (long)-4704528450684215168L, (long)l);
                try {
                    try {
                        map = map2;
                        if (callSite != null) break block4;
                        if (map != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-4822547944381830611L, (long)l);
                    }
                    return null;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-4822547944381830611L, (long)l);
                }
            }
            map = map2.get(object2);
        }
        return map;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ol.a = prr.a((long)-5135071756485699053L, (long)2327638087074152869L, MethodHandles.lookup().lookupClass()).a(195538668249178L);
                ol.d = new HashMap<K, V>(13);
                var0 = ol.a ^ 44753532765416L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "}\u00fe\u0006\u00b3\u0099:\u009c\u008a\u00d7\u00b6\u0004W\u00bc%0\u00f5";
                var7_6 = "}\u00fe\u0006\u00b3\u0099:\u009c\u008a\u00d7\u00b6\u0004W\u00bc%0\u00f5".length();
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
                    var6_5 = "\u00b9]Q\u00cc\u00e7\u00eb\u00d0h\u00c6\u001fb#\u0099}\u000b\u008e";
                    var7_6 = "\u00b9]Q\u00cc\u00e7\u00eb\u00d0h\u00c6\u001fb#\u0099}\u000b\u008e".length();
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
        ol.b = var8_3;
        ol.c = new Integer[4];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x78D;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ol", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ol.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ol.a(n, l);
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
            throw new RuntimeException("com/zelix/ol" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ol.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
