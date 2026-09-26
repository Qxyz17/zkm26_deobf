/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._p;
import com.zelix._u;
import com.zelix._x;
import com.zelix.dy;
import com.zelix.eh;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.v8;
import com.zelix.yf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class dm
extends dy {
    final Map E;
    final Map u;
    final Map c;
    final eh o;
    private static final long a;
    private static final String[] d;
    private static final String[] j;
    private static final Map t;

    abstract List t(Object[] var1);

    public dm(int n10, String string, char c10, eh eh2, _u _u2, _6 _62, char c11, yf yf2) {
        long l10;
        long l11 = l10 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)c11 << 48 >>> 48) ^ a;
        long l12 = l11 ^ 0x21928962B813L;
        long l13 = l11 ^ 0x612B62F3B8CBL;
        super(string, _u2, _62, l13, yf2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        this.E = m44.a("n", (Object)objectArray, (long)6662974980219746453L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        this.u = m44.a("n", (Object)objectArray2, (long)6662974980219746453L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        this.c = m44.a("n", (Object)objectArray3, (long)6662974980219746453L, (long)l10);
        this.o = eh2;
    }

    void B(Object[] objectArray) {
        block29: {
            CallSite callSite;
            Object object;
            CallSite callSite2;
            long l10;
            long l11;
            block28: {
                CallSite callSite3;
                block30: {
                    Object object2;
                    String string;
                    String string2;
                    sz sz2;
                    long l12;
                    block26: {
                        long l13;
                        block27: {
                            int n10;
                            int n11;
                            int n12;
                            String string3;
                            block23: {
                                block25: {
                                    String string4;
                                    block24: {
                                        int n13;
                                        block21: {
                                            string3 = (String)objectArray[0];
                                            l11 = (Long)objectArray[1];
                                            long l14 = l11 = a ^ l11;
                                            l10 = l14 ^ 0x1B21416A684FL;
                                            long l15 = l14 ^ 0x9243523244CL;
                                            n12 = (int)(l15 >>> 32);
                                            n11 = (int)(l15 << 32 >>> 48);
                                            n10 = (int)(l15 << 48 >>> 48);
                                            l13 = l14 ^ 0x329B9759C486L;
                                            l12 = l14 ^ 0x790CAEE805C8L;
                                            callSite3 = null;
                                            callSite2 = m44.a("o", (long)-6002415750871047152L, (long)l11);
                                            try {
                                                block22: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        n13 = string3.startsWith((String)((Object)dm.e("v", (int)8504, (long)(0x60544508ED974A7AL ^ l11))));
                                                                        if (callSite2 == null) break block21;
                                                                        if (n13 != 0) break block22;
                                                                    }
                                                                    catch (n9 n92) {
                                                                        throw m44.a("o", (Object)n92, (long)-5796301711256224332L, (long)l11);
                                                                    }
                                                                    n13 = string3.startsWith((String)((Object)dm.e("v", (int)30953, (long)(0x3D174EB229C193A8L ^ l11)))) ? 1 : 0;
                                                                    if (callSite2 == null) break block21;
                                                                }
                                                                catch (n9 n93) {
                                                                    throw m44.a("o", (Object)n93, (long)-5796301711256224332L, (long)l11);
                                                                }
                                                                if (l11 < 0L) break block21;
                                                                if (n13 != 0) break block22;
                                                            }
                                                            catch (n9 n94) {
                                                                throw m44.a("o", (Object)n94, (long)-5796301711256224332L, (long)l11);
                                                            }
                                                            n13 = string3.startsWith((String)((Object)dm.e("v", (int)17131, (long)(0x11E53970552929A8L ^ l11)))) ? 1 : 0;
                                                            if (callSite2 == null) break block21;
                                                        }
                                                        catch (n9 n95) {
                                                            throw m44.a("o", (Object)n95, (long)-5796301711256224332L, (long)l11);
                                                        }
                                                        if (n13 == 0) break block23;
                                                    }
                                                    catch (n9 n96) {
                                                        throw m44.a("o", (Object)n96, (long)-5796301711256224332L, (long)l11);
                                                    }
                                                }
                                                n13 = string3.indexOf(":");
                                            }
                                            catch (n9 n97) {
                                                throw m44.a("o", (Object)n97, (long)-5796301711256224332L, (long)l11);
                                            }
                                        }
                                        int n14 = n13;
                                        object = string3.substring(n14 + 1);
                                        try {
                                            try {
                                                string4 = object;
                                                if (callSite2 == null) break block24;
                                                if (!string4.startsWith("/")) break block25;
                                            }
                                            catch (n9 n98) {
                                                throw m44.a("o", (Object)n98, (long)-5796301711256224332L, (long)l11);
                                            }
                                            string4 = ((String)object).substring(1);
                                        }
                                        catch (n9 n99) {
                                            throw m44.a("o", (Object)n99, (long)-5796301711256224332L, (long)l11);
                                        }
                                    }
                                    object = string4;
                                }
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = null;
                                objectArray2[1] = object;
                                objectArray2[0] = l12;
                                callSite3 = m44.a("p", (Object)this, (Object)objectArray2, (long)-5405689344830414559L, (long)l11);
                                break block30;
                            }
                            sz2 = new sz(n12, (short)n11, (char)n10);
                            object = new sz(n12, (short)n11, (char)n10);
                            Object[] objectArray3 = new Object[4];
                            objectArray3[3] = l13;
                            objectArray3[2] = object;
                            objectArray3[1] = sz2;
                            objectArray3[0] = m44.a("q", (Object)this, (long)-6093178607622618167L, (long)l11);
                            CallSite callSite4 = m44.a("o", (Object)objectArray3, (long)-6029042491980385932L, (long)l11);
                            string2 = (String)sz2.t();
                            string = string3;
                            try {
                                object2 = string;
                                if (callSite2 == null) break block26;
                                if (!((String)object2).startsWith("/")) break block27;
                            }
                            catch (n9 n910) {
                                throw m44.a("o", (Object)n910, (long)-5796301711256224332L, (long)l11);
                            }
                            string = string.substring(1);
                        }
                        Object[] objectArray4 = new Object[4];
                        objectArray4[3] = l13;
                        objectArray4[2] = object;
                        objectArray4[1] = sz2;
                        objectArray4[0] = string;
                        object2 = m44.a("o", (Object)objectArray4, (long)-6029042491980385932L, (long)l11);
                    }
                    String string5 = object2;
                    String string6 = (String)sz2.t();
                    String string7 = (String)((sz)object).t();
                    Object[] objectArray5 = new Object[3];
                    objectArray5[2] = string2;
                    objectArray5[1] = string;
                    objectArray5[0] = l12;
                    callSite3 = m44.a("p", (Object)this, (Object)objectArray5, (long)-5405689344830414559L, (long)l11);
                }
                try {
                    callSite = callSite3;
                    if (callSite2 == null) break block28;
                    if (callSite == null) break block29;
                }
                catch (n9 n911) {
                    throw m44.a("o", (Object)n911, (long)-5796301711256224332L, (long)l11);
                }
                callSite = callSite3;
            }
            Iterator iterator = callSite.iterator();
            while (iterator.hasNext()) {
                object = (String)iterator.next();
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = l10;
                objectArray6[1] = m44.a("q", (Object)this, (long)-5944941165319114885L, (long)l11);
                objectArray6[0] = object;
                m44.a("p", (Object)m44.a("q", (Object)this, (long)-6103856534942650405L, (long)l11), (Object)objectArray6, (long)-6172965131735705406L, (long)l11);
                if (callSite2 != null) continue;
            }
        }
    }

    public dm(String string, v8 v82, _p _p2, _p _p3, eh eh2, _x _x2, _u _u2, _6 _62, long l10, yf yf2) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x40D8B4FE66FFL;
        long l13 = l11 ^ 0x1433E682F7D9L;
        super(string, v82, _p2, _p3, _x2, _u2, _62, yf2, l13);
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        this.E = m44.a("j", (Object)objectArray, (long)-9035411368201886087L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        this.u = m44.a("j", (Object)objectArray2, (long)-9035411368201886087L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        this.c = m44.a("j", (Object)objectArray3, (long)-9035411368201886087L, (long)l10);
        this.o = eh2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    List W(Object[] objectArray) {
        ArrayList<String> arrayList;
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        StringTokenizer stringTokenizer = new StringTokenizer(string, (String)((Object)dm.e("v", (int)26642, (long)(0x64BF85D61E9951A8L ^ l10))));
        CallSite callSite = m44.a("m", (long)-123554815769741590L, (long)l10);
        ArrayList<String> arrayList2 = new ArrayList<String>(stringTokenizer.countTokens());
        block2: while (stringTokenizer.hasMoreTokens()) {
            try {
                do {
                    if (l10 > 0L) {
                        arrayList = arrayList2;
                        if (callSite == null) return arrayList;
                        arrayList.add(stringTokenizer.nextToken());
                    }
                    if (callSite != null) continue block2;
                } while (l10 <= 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("m", (Object)n92, (long)-183152883333910706L, (long)l10);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                dm.a = prr.a(-140590992057483386L, -7271783371194758509L, MethodHandles.lookup().lookupClass()).a(118473641451796L);
                dm.t = new HashMap<K, V>(13);
                var0 = dm.a ^ 137664419896991L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "R%\u00d5\u00f7))\u0086\u00b8\u0089b*V!`\u00c6\u00ab\u00e0\u009at\u00bc\u00df\u00d8f\u008c\u00fe\u001el\u00acR\u00f0>\u00a0\u0010\u008a}X\u0018\u00af\u001c:2N\u0097I\u00a4\u00a7[\u009f\u00a6";
                var8_6 = "R%\u00d5\u00f7))\u0086\u00b8\u0089b*V!`\u00c6\u00ab\u00e0\u009at\u00bc\u00df\u00d8f\u008c\u00fe\u001el\u00acR\u00f0>\u00a0\u0010\u008a}X\u0018\u00af\u001c:2N\u0097I\u00a4\u00a7[\u009f\u00a6".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = dm.e(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00f4~\u00e8\u00a1\u000b\u00fb\u00c55@\u00b46\u00a4\u00b5\u00ba\u00a3| \u00195\u00c6v\u00d5Y\u0092U\u00abY\u00e0W\u0007\u0091\u00c3\u00bd\u00a6*+\u007f\u00ed\"\u0087B\u00c9\u00862\u001d\u00a4\u00e7@8";
                    var8_6 = "\u00f4~\u00e8\u00a1\u000b\u00fb\u00c55@\u00b46\u00a4\u00b5\u00ba\u00a3| \u00195\u00c6v\u00d5Y\u0092U\u00abY\u00e0W\u0007\u0091\u00c3\u00bd\u00a6*+\u007f\u00ed\"\u0087B\u00c9\u00862\u001d\u00a4\u00e7@8".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = dm.e(var10_9).intern();
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
        dm.d = var9_3;
        dm.j = new String[4];
    }

    private static n9 b(n9 n92) {
        return n92;
    }

    private static String e(byte[] byArray) {
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

    private static String e(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4DB1;
        if (j[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])t.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    t.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/dm", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n11].getBytes("ISO-8859-1");
            dm.j[n11] = dm.e(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return j[n11];
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = dm.e(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/dm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dm.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

