/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l6x;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.u0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class os {
    private l6x M;
    private Map X;
    private l6x y;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void v(Object[] objectArray) {
        CallSite callSite;
        long l;
        block6: {
            l = (Long)objectArray[0];
            long l2 = (l = a ^ l) ^ 0x1E8B29AA6933L;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = this.y;
            objectArray2[0] = l2;
            CallSite callSite2 = m44.a("k", (Object)objectArray2, (long)8715872721152062500L, (long)l);
            callSite = m44.a("k", (long)9006439530720879307L, (long)l);
            try {
                try {
                    if (callSite != null) break block6;
                    if (callSite2 == null) throw new n9((String)((Object)os.a("j", (int)27009, (long)(0x8A10B6BCBDB18EL ^ l))));
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)((Object)n92), (long)7059669511868707100L, (long)l);
                }
                this.y = callSite2;
            }
            catch (n9 n93) {
                throw m44.a("k", (Object)((Object)n93), (long)7059669511868707100L, (long)l);
            }
        }
        try {
            if (callSite == null) return;
            throw new n9((String)((Object)os.a("j", (int)27009, (long)(0x8A10B6BCBDB18EL ^ l))));
        }
        catch (n9 n94) {
            throw m44.a("k", (Object)((Object)n94), (long)7059669511868707100L, (long)l);
        }
    }

    public os(char c, int n, Object object, char c2) {
        long l = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x41443A19D606L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        this.X = m44.a("k", (Object)objectArray, (long)3630680475316213376L, (long)l);
        this.y = this.M = new l6x(this, object, null, null);
        this.X.put(object, this.y);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void P(Object[] var1_1) {
        block25: {
            block24: {
                block22: {
                    block23: {
                        block20: {
                            block21: {
                                var2_2 = (Long)var1_1[0];
                                var4_3 = (l6x)var1_1[1];
                                v0 = var2_2 = os.a ^ var2_2;
                                var5_4 = v0 ^ 20536889419022L;
                                var7_5 = v0 ^ 95235161616973L;
                                var9_6 = m44.a("m", (long)7458811036275538357L, (long)var2_2);
                                try {
                                    try {
                                        v1 = var4_3;
                                        if (var9_6 != null) break block20;
                                        if (v1 != null) break block21;
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("m", (Object)v2, (long)8828942112914860642L, (long)var2_2);
                                    }
                                    throw new IllegalArgumentException((String)os.a("j", (int)17806, (long)(4574061673307637501L ^ var2_2)));
                                }
                                catch (n9 v3) {
                                    throw m44.a("m", (Object)v3, (long)8828942112914860642L, (long)var2_2);
                                }
                            }
                            v1 = var4_3;
                        }
                        try {
                            try {
                                if (var9_6 != null) break block22;
                                if (v1 != this.M) break block23;
                            }
                            catch (n9 v4) {
                                throw m44.a("m", (Object)v4, (long)8828942112914860642L, (long)var2_2);
                            }
                            throw new n9((String)os.a("j", (int)26125, (long)(550755458295113087L ^ var2_2)));
                        }
                        catch (n9 v5) {
                            throw m44.a("m", (Object)v5, (long)8828942112914860642L, (long)var2_2);
                        }
                    }
                    v1 = var10_7 /* !! */  = var4_3;
                }
                while (var10_7 /* !! */  != null) {
                    try {
                        try {
                            v6 = var10_7 /* !! */ ;
                            while (true) {
                                v7 = this.M;
                                v8 = var9_6;
                                if (var2_2 >= 0L) {
                                    if (v8 != null) break block24;
                                    v8 = var9_6;
                                }
                                if (v8 != null) break block24;
                                break;
                            }
                        }
                        catch (n9 v9) {
                            throw m44.a("m", (Object)v9, (long)8828942112914860642L, (long)var2_2);
                        }
                        if (v6 == v7) break;
                    }
                    catch (n9 v10) {
                        throw m44.a("m", (Object)v10, (long)8828942112914860642L, (long)var2_2);
                    }
                    v11 = new Object[2];
                    v11[1] = var10_7 /* !! */ ;
                    v11[0] = var7_5;
                    var10_7 /* !! */  = m44.a("m", (Object)v11, (long)7172906104460488538L, (long)var2_2);
                    if (var9_6 == null) continue;
                }
                try {
                    v6 = var10_7 /* !! */ ;
                    if (var2_2 < 0L) ** continue;
                    if (var9_6 != null) break block25;
                    v7 = this.M;
                }
                catch (n9 v12) {
                    throw m44.a("m", (Object)v12, (long)8828942112914860642L, (long)var2_2);
                }
            }
            try {
                if (v6 != v7) {
                    throw new n9((String)os.a("j", (int)12618, (long)(6100420865912500799L ^ var2_2)));
                }
            }
            catch (n9 v13) {
                throw m44.a("m", (Object)v13, (long)8828942112914860642L, (long)var2_2);
            }
            v14 = new Object[2];
            v14[1] = var4_3;
            v14[0] = var7_5;
            v15 = m44.a("m", (Object)v14, (long)7172906104460488538L, (long)var2_2);
        }
        var11_8 = v15;
        v16 = new Object[3];
        v16[2] = var5_4;
        v16[1] = var4_3;
        v16[0] = var11_8;
        var12_9 = m44.a("m", (Object)v16, (long)7413590973124859324L, (long)var2_2);
    }

    static /* synthetic */ l6x f(os os2) {
        return os2.M;
    }

    static /* synthetic */ void l(Object[] objectArray) {
        os os2 = (os)objectArray[0];
        l6x l6x2 = (l6x)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x4C361A9F3530L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l6x2;
        objectArray2[0] = l2;
        m44.a("l", (Object)os2, (Object)objectArray2, (long)1740156168749348845L, (long)l);
    }

    public boolean h(Object[] objectArray) {
        boolean bl;
        long l = (Long)objectArray[0];
        l = a ^ l;
        try {
            bl = this.y == this.M;
        }
        catch (n9 n92) {
            throw m44.a("n", (Object)((Object)n92), (long)-4535729836288618007L, (long)l);
        }
        return bl;
    }

    public boolean v(Object[] objectArray) {
        block5: {
            block4: {
                long l = (Long)objectArray[0];
                Object object = objectArray[1];
                l = a ^ l;
                l6x l6x2 = (l6x)this.X.get(object);
                CallSite callSite = m44.a("h", (long)3969409111288850720L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (l6x2 == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)3031940159439616759L, (long)l);
                    }
                    this.y = l6x2;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)3031940159439616759L, (long)l);
                }
            }
            return true;
        }
        return false;
    }

    public void B(Object[] objectArray) {
        this.y = this.M;
    }

    public Iterator k(Object[] objectArray) {
        return new u0(this, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Enumeration W(Object[] objectArray) {
        ArrayList<Object> arrayList;
        long l = (Long)objectArray[0];
        l = a ^ l;
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        CallSite callSite = m44.a("h", (long)-4835135875957546288L, (long)l);
        CallSite callSite2 = m44.a("w", (Object)this, (Object)new Object[0], (long)-6847468938653409497L, (long)l);
        block2: while (callSite2.hasNext()) {
            try {
                do {
                    arrayList = arrayList2;
                    Object object = callSite;
                    if (l > 0L) {
                        if (object != null) return Collections.enumeration(arrayList);
                        object = ((l6x)callSite2.next()).W();
                    }
                    arrayList.add(object);
                    if (callSite == null) continue block2;
                } while (l <= 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("h", (Object)((Object)n92), (long)-6781413313831227129L, (long)l);
            }
        }
        arrayList = arrayList2;
        return Collections.enumeration(arrayList);
    }

    public void U(Object[] objectArray) {
        Object object = objectArray[0];
        this.y = l6x.f((l6x)this.y, (Object)object);
        this.X.put(object, this.y);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void A(Object[] objectArray) {
        CallSite callSite;
        long l;
        block7: {
            l = (Long)objectArray[0];
            Object object = objectArray[1];
            long l2 = (l = a ^ l) ^ 0x375F2A0A3B20L;
            callSite = m44.a("h", (long)3381751270351515864L, (long)l);
            try {
                l6x l6x2;
                try {
                    l6x2 = this.y;
                    if (callSite == null) {
                        if (l6x2 == this.M) throw new n9((String)((Object)os.a("j", (int)21806, (long)(0x77FF43585BE1DF33L ^ l))));
                    }
                    break block7;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)3741319006623539983L, (long)l);
                }
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = this.y;
                objectArray2[0] = l2;
                this.y = l6x.f((l6x)m44.a("h", (Object)objectArray2, (long)3091204217636480567L, (long)l), (Object)object);
                l6x2 = this.X.put(object, this.y);
            }
            catch (n9 n93) {
                throw m44.a("h", (Object)((Object)n93), (long)3741319006623539983L, (long)l);
            }
        }
        try {
            if (callSite == null) return;
            throw new n9((String)((Object)os.a("j", (int)21806, (long)(0x77FF43585BE1DF33L ^ l))));
        }
        catch (n9 n94) {
            throw m44.a("h", (Object)((Object)n94), (long)3741319006623539983L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                os.a = prr.a((long)591139263324927894L, (long)-535405586785152623L, MethodHandles.lookup().lookupClass()).a(87957638963534L);
                os.d = new HashMap<K, V>(13);
                var0 = os.a ^ 100069348801868L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "hKW\u00d0\u00f9\u00a4\u00ba\u0003\u001c\r\u00d3e\u0014\u00a3K\u0090\u00b1]\u00ce)\u009d\u00eb)\u00cf\u0080\u001f*Z\u008e\b\u00b4\u00db\u00f8W\u00b5@a}\u00fb%8\u001a\u00b2\u00c1/\u001e\u00b6\u0095\u00a7_q\u00dd\u00cd\u00d9\u00ce\u00a3\u0006\u00b2\u00a7\u00dd\u00c0\u0085\u009f\u00fa\u00a0y)\u00b5\u00b5\u00a5>\u00b5\u00a5)\u00b3Y\u008cW\u00ee\u00ae\u008a\u001b\u008ccNo]3\u00bdC\u00d4\u0005@\u00cd\u00c8\b\u0090\u0018\u00ac\u001c\u00b0\u00a9\u0014aF\u00c5\u00e1\u0011\u00a3\u00ac\u00a9\u00ef\u001cE\u0099\u0081\u00e27\u009fH\u00fa?";
                var8_6 = "hKW\u00d0\u00f9\u00a4\u00ba\u0003\u001c\r\u00d3e\u0014\u00a3K\u0090\u00b1]\u00ce)\u009d\u00eb)\u00cf\u0080\u001f*Z\u008e\b\u00b4\u00db\u00f8W\u00b5@a}\u00fb%8\u001a\u00b2\u00c1/\u001e\u00b6\u0095\u00a7_q\u00dd\u00cd\u00d9\u00ce\u00a3\u0006\u00b2\u00a7\u00dd\u00c0\u0085\u009f\u00fa\u00a0y)\u00b5\u00b5\u00a5>\u00b5\u00a5)\u00b3Y\u008cW\u00ee\u00ae\u008a\u001b\u008ccNo]3\u00bdC\u00d4\u0005@\u00cd\u00c8\b\u0090\u0018\u00ac\u001c\u00b0\u00a9\u0014aF\u00c5\u00e1\u0011\u00a3\u00ac\u00a9\u00ef\u001cE\u0099\u0081\u00e27\u009fH\u00fa?".length();
                var5_7 = 40;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = os.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "3spw3\u00b6\u000f\u00d3D\u0017\u00d20\u00cdk\u0080\u00f8!\u00f3K@\u00d5Q\u00b2\u00c6@rwh\u000b\u00ba\\R\u0006rp\u00d8\fn\u0090\u00be8\u0088\u00ba\u0091Q\u00bc\u0090\u00ed\u00ad\u00f8`\u00cdy\u001c\u0002\u00ad\u0002j\u009a\u00c6\u00fd\u00a9\u0091;\u009e\u0086\u009f\u00d5\u00db\u0019j\u0095M\u0081gN\\\u00c1Y\u0094\u0013K\u00bf\u0017\u00f0\"\u00f1\u00a6D\u001f\u00e9\u00b2\u00a4\u00ca\u00fdh ";
                    var8_6 = "3spw3\u00b6\u000f\u00d3D\u0017\u00d20\u00cdk\u0080\u00f8!\u00f3K@\u00d5Q\u00b2\u00c6@rwh\u000b\u00ba\\R\u0006rp\u00d8\fn\u0090\u00be8\u0088\u00ba\u0091Q\u00bc\u0090\u00ed\u00ad\u00f8`\u00cdy\u001c\u0002\u00ad\u0002j\u009a\u00c6\u00fd\u00a9\u0091;\u009e\u0086\u009f\u00d5\u00db\u0019j\u0095M\u0081gN\\\u00c1Y\u0094\u0013K\u00bf\u0017\u00f0\"\u00f1\u00a6D\u001f\u00e9\u00b2\u00a4\u00ca\u00fdh ".length();
                    var5_7 = 40;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = os.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        os.b = var9_3;
        os.c = new String[5];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2AB3;
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
                throw new RuntimeException("com/zelix/os", exception);
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
            os.c[n2] = os.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = os.a(n, l);
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
            throw new RuntimeException("com/zelix/os" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(os.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
