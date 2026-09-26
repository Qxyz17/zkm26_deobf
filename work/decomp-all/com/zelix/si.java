/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.eo;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.ko;
import com.zelix.l6q;
import com.zelix.lk0;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ss;
import com.zelix.t6;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class si
extends ss
implements eo {
    private jf M;
    private static final long b;
    private static final String[] h;
    private static final String[] i;
    private static final Map j;

    public void S(Object[] objectArray) {
        block5: {
            jf jf2;
            block4: {
                jf jf3 = (jf)objectArray[0];
                jf2 = (jf)objectArray[1];
                long l = (Long)objectArray[2];
                CallSite callSite = m44.a("o", (long)-7028195342100598978L, (long)l);
                try {
                    si si2;
                    try {
                        si2 = this;
                        if (callSite == false) break block4;
                        if (si2.M != jf3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-7157747953390602373L, (long)l);
                    }
                    si2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)-7157747953390602373L, (long)l);
                }
            }
            si2.M = jf2;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void r(DataOutputStream var1_1, long var2_2, Map var4_3) {
        block22: {
            block19: {
                block21: {
                    block20: {
                        block23: {
                            block17: {
                                block18: {
                                    v0 = var2_2;
                                    var5_4 = v0 ^ 37746908501545L;
                                    var7_5 = v0 ^ 113115607996493L;
                                    var9_6 = m44.a("n", (long)3620787434600556248L, (long)var2_2);
                                    try {
                                        try {
                                            if (var9_6 != false) break block17;
                                            if (this.c) break block18;
                                        }
                                        catch (n9 v1) {
                                            throw m44.a("n", (Object)v1, (long)2935125513433121642L, (long)var2_2);
                                        }
                                        v2 = new String[1];
                                        v3 = new Object[1];
                                        v3[0] = var5_4;
                                        v2[0] = (String)si.b("d", (int)29786, (long)(4839662750596648076L ^ var2_2)) + (String)m44.a("q", (Object)this, (Object)v3, (long)3793153905972666927L, (long)var2_2);
                                        lk0.t((boolean)false, (String[])v2, (long)var7_5);
                                    }
                                    catch (n9 v4) {
                                        throw m44.a("n", (Object)v4, (long)2935125513433121642L, (long)var2_2);
                                    }
                                }
                                try {
                                    if (var2_2 <= 0L) break block17;
                                    v5 = var1_1;
                                    v6 = this.R;
                                    if (var9_6 != false) break block19;
                                    v5.writeByte(v6);
                                }
                                catch (n9 v7) {
                                    throw m44.a("n", (Object)v7, (long)2935125513433121642L, (long)var2_2);
                                }
                            }
                            v8 /* !! */  = var4_3;
                            if (var2_2 < 0L) break block23;
                            if (v8 /* !! */  == null) ** GOTO lbl67
                            v8 /* !! */  = var4_3.get(this.M);
                        }
                        var10_7 = (js)v8 /* !! */ ;
                        try {
                            try {
                                v9 = var9_6;
                                if (var2_2 < 0L) ** GOTO lbl56
                                if (v9 != false) break block20;
                                if (var10_7 != null) {
                                }
                                ** GOTO lbl59
                            }
                            catch (n9 v10) {
                                throw m44.a("n", (Object)v10, (long)2935125513433121642L, (long)var2_2);
                            }
                            var1_1.writeShort(var10_7.E());
                        }
                        catch (n9 v11) {
                            throw m44.a("n", (Object)v11, (long)2935125513433121642L, (long)var2_2);
                        }
                    }
                    try {
                        v9 = var9_6;
lbl56:
                        // 2 sources

                        if (var2_2 >= 0L) {
                            if (v9 == false) break block21;
                        }
                        ** GOTO lbl66
lbl59:
                        // 2 sources

                        var1_1.writeShort(this.M.E());
                    }
                    catch (n9 v12) {
                        throw m44.a("n", (Object)v12, (long)2935125513433121642L, (long)var2_2);
                    }
                }
                try {
                    v9 = var9_6;
lbl66:
                    // 2 sources

                    if (v9 == false) break block22;
lbl67:
                    // 2 sources

                    v5 = var1_1;
                    v6 = this.M.E();
                }
                catch (n9 v13) {
                    throw m44.a("n", (Object)v13, (long)2935125513433121642L, (long)var2_2);
                }
            }
            v5.writeShort(v6);
        }
    }

    protected si(_4 _42, long l, int n, int n2, h1 h12, l6q l6q2, PrintWriter printWriter) {
        block8: {
            long l2;
            block6: {
                long l3 = l = b ^ l;
                l2 = l3 ^ 0xA8BDFC8EF81L;
                long l4 = l3 ^ 0x4BD8916881C8L;
                long l5 = l3 ^ 0x2B8E3B2AE48FL;
                super(_42, n);
                js js2 = this.m(l4, n2);
                CallSite callSite = m44.a("h", (long)-7871829939134806490L, (long)l);
                try {
                    block7: {
                        try {
                            try {
                                if (callSite != false) break block6;
                                if (!(js2 instanceof jf)) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)-8627327307014757484L, (long)l);
                            }
                            this.M = (jf)js2;
                            l6q2.t((Object)this.M, (Object)this, l5);
                            if (callSite == false) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-8627327307014757484L, (long)l);
                        }
                    }
                    this.c = false;
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)((Object)n94), (long)-8627327307014757484L, (long)l);
                }
            }
            printWriter.println((String)((Object)si.b("d", (int)25511, (long)(0x1ED49C1062B67B8AL ^ l))) + this.f(l2) + (String)((Object)si.b("d", (int)9505, (long)(0x389CFBF2C8D2BD0BL ^ l))) + (String)((Object)si.b("d", (int)7711, (long)(0x1E2D785019EF8636L ^ l))) + (String)((Object)si.b("d", (int)10734, (long)(0x6D159D15ADF431C5L ^ l))));
        }
    }

    static ss V(ko ko2, int n, long l, String string, t6 t62, Set set, List list, Map map) {
        si si2;
        block9: {
            block8: {
                long l2;
                block7: {
                    String string2;
                    Map map2;
                    CallSite callSite;
                    block6: {
                        l2 = (l = b ^ l) ^ 0x315910A609E0L;
                        callSite = m44.a("l", (long)4192275033229708133L, (long)l);
                        try {
                            try {
                                map2 = map;
                                string2 = string;
                                if (callSite == false) break block6;
                                if (!map2.containsKey(string2)) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)((Object)n92), (long)4103259010465207072L, (long)l);
                            }
                            map2 = map;
                            string2 = string;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)((Object)n93), (long)4103259010465207072L, (long)l);
                        }
                    }
                    si2 = (si)((Object)map2.get(string2));
                    if (l <= 0L) break block8;
                    if (callSite != false) break block9;
                }
                si2 = new si((_4)ko2, n, string, t62, set, list, l2);
            }
            map.put(string, si2);
        }
        return si2;
    }

    public boolean h(short s, short s2, int n, ss ss2) {
        int n2;
        block2: {
            block3: {
                long l = (long)s << 48 | (long)s2 << 48 >>> 16 | (long)n << 32 >>> 32;
                long l2 = l ^ 0x54D0047E1579L;
                CallSite callSite = m44.a("j", (long)-97956903315664917L, (long)l);
                try {
                    n2 = this.R;
                    if (callSite == false) break block2;
                    if (n2 != ss2.R) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)-252277389486925906L, (long)l);
                }
                si si2 = (si)ss2;
                return this.M.g(l2).equals(si2.M.g(l2));
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected si(_4 var1_1, int var2_2, String var3_3, t6 var4_4, Set var5_5, List var6_6, long var7_7) {
        block18: {
            block19: {
                block17: {
                    block16: {
                        v0 = var7_7 = si.b ^ var7_7;
                        var9_8 = v0 ^ 91800052786221L;
                        var11_9 = v0 ^ 114049673575299L;
                        v1 = m44.a("k", (long)8566592488607785477L, (long)var7_7);
                        super(var1_1, var2_2);
                        var13_10 = v1;
                        try {
                            try {
                                try {
                                    v2 = var3_3;
                                    if (var13_10 != false) break block16;
                                    if (v2.startsWith("L")) {
                                    }
                                    ** GOTO lbl33
                                }
                                catch (n9 v3) {
                                    throw m44.a("k", (Object)v3, (long)7811090709820295095L, (long)var7_7);
                                }
                                v2 = var3_3;
                                if (var13_10 != false) break block16;
                            }
                            catch (n9 v4) {
                                throw m44.a("k", (Object)v4, (long)7811090709820295095L, (long)var7_7);
                            }
                            if (v2.endsWith(";")) {
                            }
                            ** GOTO lbl33
                        }
                        catch (n9 v5) {
                            throw m44.a("k", (Object)v5, (long)7811090709820295095L, (long)var7_7);
                        }
                        v2 = var3_3.substring(1, var3_3.length() - 1);
                        if (var7_7 <= 0L) break block16;
                        var14_11 = v2;
                        try {
                            if (var13_10 == false) break block17;
lbl33:
                            // 3 sources

                            v2 = var3_3;
                        }
                        catch (n9 v6) {
                            throw m44.a("k", (Object)v6, (long)7811090709820295095L, (long)var7_7);
                        }
                    }
                    var14_11 = v2;
                }
                var15_12 = jf.C((String)var14_11, (long)var11_9, (Collection)var5_5);
                try {
                    block20: {
                        try {
                            try {
                                v7 /* !! */  = var13_10;
                                if (var7_7 <= 0L) break block18;
                                if (v7 /* !! */  != false) break block19;
                                if (var15_12 != null) break block20;
                            }
                            catch (n9 v8) {
                                throw m44.a("k", (Object)v8, (long)7811090709820295095L, (long)var7_7);
                            }
                            this.M = var4_4.S(var14_11, var9_8, var6_6);
                            if (var13_10 == false) break block18;
                        }
                        catch (n9 v9) {
                            throw m44.a("k", (Object)v9, (long)7811090709820295095L, (long)var7_7);
                        }
                    }
                    this.M = var15_12;
                }
                catch (n9 v10) {
                    throw m44.a("k", (Object)v10, (long)7811090709820295095L, (long)var7_7);
                }
            }
            v7 /* !! */  = (CallSite)var5_5.remove(var15_12);
        }
    }

    void z(gu gu2, long l) {
        long l2 = l ^ 0x6DE1DADD9981L;
        this.M.e(l2, gu2, (Object)this, (Object)this.H());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                si.b = prr.a((long)130600684722111516L, (long)5033208993611462586L, MethodHandles.lookup().lookupClass()).a(174405882617379L);
                si.j = new HashMap<K, V>(13);
                var0 = si.b ^ 119137378208797L;
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
                var6_5 = "\u0017\u00c6\u00d2\n\u00e00\u00fdiV\u00d2-wy\u0090\u0013\u00f7\u00e3J\u00b6A>n\u00a8Qi\u00b3\u009bJ\u00a1p?\u00fd\u00e0YG\u00c1\u00f2!K\u001fE;%O\u0010\u00b2\u00b1\u00fa0\u00ffr]s\u00efum_\u00d5Rgv\u00c6\u0000J@_\u00b4I\u00ea\u00d15T\u00c5o\f\u00e3\u00f9\u00bf.\"\u00d2\u00db\u00f4\u0089Lrqu\u0096|\u00cd\u0099\u00ce\u00c1\u009f\u0098T\u0010f\u0014\u0092\u00b2\u00cc\u00fe\u0092 \u00ef\u00c7B~^8%4";
                var8_6 = "\u0017\u00c6\u00d2\n\u00e00\u00fdiV\u00d2-wy\u0090\u0013\u00f7\u00e3J\u00b6A>n\u00a8Qi\u00b3\u009bJ\u00a1p?\u00fd\u00e0YG\u00c1\u00f2!K\u001fE;%O\u0010\u00b2\u00b1\u00fa0\u00ffr]s\u00efum_\u00d5Rgv\u00c6\u0000J@_\u00b4I\u00ea\u00d15T\u00c5o\f\u00e3\u00f9\u00bf.\"\u00d2\u00db\u00f4\u0089Lrqu\u0096|\u00cd\u0099\u00ce\u00c1\u009f\u0098T\u0010f\u0014\u0092\u00b2\u00cc\u00fe\u0092 \u00ef\u00c7B~^8%4".length();
                var5_7 = 48;
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
                    var9_3[var7_4++] = si.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "^g\u009a%O\u0013\u0094\f]\u000b\u00e2\u00e6Uu\u00e7\u00bb\u0010\u0015\u00c5\u00ba0\u0006DU\u00ac\u00a0\u00eei5\u00d1=\u00e7\u009d";
                    var8_6 = "^g\u009a%O\u0013\u0094\f]\u000b\u00e2\u00e6Uu\u00e7\u00bb\u0010\u0015\u00c5\u00ba0\u0006DU\u00ac\u00a0\u00eei5\u00d1=\u00e7\u009d".length();
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
                    var9_3[var7_4++] = si.c(var10_9).intern();
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
        si.h = var9_3;
        si.i = new String[5];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1AE;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])j.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/si", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            si.i[n2] = si.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = si.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/si" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(si.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
