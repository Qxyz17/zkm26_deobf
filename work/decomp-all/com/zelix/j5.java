/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._f;
import com.zelix._u;
import com.zelix._v;
import com.zelix.b4;
import com.zelix.bf;
import com.zelix.cf;
import com.zelix.j2;
import com.zelix.j9;
import com.zelix.ji;
import com.zelix.l62;
import com.zelix.l6z;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import com.zelix.xb;
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

public class j5
extends ji {
    static final va J;
    private b4 W;
    private static final long a;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;
    private static final long j;

    /*
     * Unable to fully structure code
     */
    public void E(Object[] var1_1) {
        block16: {
            block17: {
                block15: {
                    var7_2 = (Set)var1_1[0];
                    var5_3 = (Set)var1_1[1];
                    var2_4 = (Set)var1_1[2];
                    var3_5 = (Long)var1_1[3];
                    var6_6 = (Set)var1_1[4];
                    v0 = var3_5;
                    var8_7 = v0 ^ 16039365994762L;
                    var10_8 = v0 ^ 129051528125716L;
                    var12_9 = v0 ^ 135322747468873L;
                    var14_10 = v0 ^ 0L;
                    var16_11 = v0 ^ 39282596256961L;
                    v1 = m44.a("j", (long)3863795904545444730L, (long)var3_5);
                    v2 = new Object[5];
                    v2[4] = var6_6;
                    v2[3] = var14_10;
                    v2[2] = var2_4;
                    v2[1] = var5_3;
                    v2[0] = var7_2;
                    super.E(v2);
                    var18_12 = v1;
                    try {
                        try {
                            v3 = m44.a("t", (Object)this, (long)3620241532806550954L, (long)var3_5);
                            if (var18_12 != false) break block15;
                            if (v3 == null) break block16;
                        }
                        catch (n9 v4) {
                            throw m44.a("j", (Object)v4, (long)3628529537390972657L, (long)var3_5);
                        }
                        var2_4.add(m44.a("t", (Object)this, (long)3620241532806550954L, (long)var3_5));
                        v3 = m44.a("t", (Object)this, (long)3620241532806550954L, (long)var3_5);
                    }
                    catch (n9 v5) {
                        throw m44.a("j", (Object)v5, (long)3628529537390972657L, (long)var3_5);
                    }
                }
                var19_13 = v3.G(var12_9);
                try {
                    try {
                        v6 = l62.r((long)var16_11, (String)var19_13.h(var10_8));
                        v7 = var18_12;
                        if (var3_5 >= 0L) {
                            if (v7 != false) break block17;
                            if (v6) break block16;
                        }
                        ** GOTO lbl61
                    }
                    catch (n9 v8) {
                        throw m44.a("j", (Object)v8, (long)3628529537390972657L, (long)var3_5);
                    }
                    v6 = m44.a("t", (Object)this, (long)3620241532806550954L, (long)var3_5).D(var8_7);
                }
                catch (n9 v9) {
                    throw m44.a("j", (Object)v9, (long)3628529537390972657L, (long)var3_5);
                }
            }
            try {
                block18: {
                    try {
                        try {
                            v7 = var18_12;
lbl61:
                            // 2 sources

                            if (v7 != false) break block16;
                            if (!v6) break block18;
                        }
                        catch (n9 v10) {
                            throw m44.a("j", (Object)v10, (long)3628529537390972657L, (long)var3_5);
                        }
                        var5_3.add((_f)var19_13);
                        if (var18_12 == false) break block16;
                    }
                    catch (n9 v11) {
                        throw m44.a("j", (Object)v11, (long)3628529537390972657L, (long)var3_5);
                    }
                }
                v6 = var7_2.add(var19_13);
            }
            catch (n9 v12) {
                throw m44.a("j", (Object)v12, (long)3628529537390972657L, (long)var3_5);
            }
        }
    }

    public va A(long l) {
        return m44.a("i", (long)-5278992088102846175L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)-1553576953159764458L, (long)6832234895731986533L, MethodHandles.lookup().lookupClass()).a(201009508058425L);
        long l = a ^ 0x32FF072129E0L;
        i = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = ".\u00d2\u0016\u00fb-\u00b2w\u00cd\u00f6\u00fa\u00b6\u00e7\u008f\u0089$\u0006\u0082\u00fe.\u0085\u0088\u0019-\b\u00fb\u0087\u00ac\u00bb\u00cd\u0096\u0015qu\u001d\u0004\u00c4\u008f\u007f\u0005\u0018\u00caro4\u00cf\u0019V\u00a1n\u00eb\u00dd\t\u00ca\u001e\u00e0\u0096\u00a1a\u00c2\"R\u001d\u00cd\u00ae(#ig\u00b3\u008dO\u00d0\u008a\u00d2}\u00e0\u00bb\u00ca\u0011\u00ad\u00df}?\u0094X\u0007\u009a9\b\u001b\u00e4\u0001f\u00f4\u00db\u0091\u00db\u0081\u008fZX\u00e1U\u00cfB";
        int n2 = ".\u00d2\u0016\u00fb-\u00b2w\u00cd\u00f6\u00fa\u00b6\u00e7\u008f\u0089$\u0006\u0082\u00fe.\u0085\u0088\u0019-\b\u00fb\u0087\u00ac\u00bb\u00cd\u0096\u0015qu\u001d\u0004\u00c4\u008f\u007f\u0005\u0018\u00caro4\u00cf\u0019V\u00a1n\u00eb\u00dd\t\u00ca\u001e\u00e0\u0096\u00a1a\u00c2\"R\u001d\u00cd\u00ae(#ig\u00b3\u008dO\u00d0\u008a\u00d2}\u00e0\u00bb\u00ca\u0011\u00ad\u00df}?\u0094X\u0007\u009a9\b\u001b\u00e4\u0001f\u00f4\u00db\u0091\u00db\u0081\u008fZX\u00e1U\u00cfB".length();
        int n3 = 64;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = j5.c(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        g = stringArray;
        h = new String[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -7675276794149511704L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                j = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                J = m44.a("o", (long)-3201013945442873989L, (long)l);
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
        }
    }

    public j5(int n, to to2, int n2, long l, xb xb2) {
        long l2 = (l = a ^ l) ^ 0x5D98961E5E4L;
        super(n, to2, n2, xb2, l2);
    }

    public void Z(Object[] objectArray) {
        block15: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            long l3;
            Set set;
            Set set2;
            block16: {
                block17: {
                    Set set3;
                    block14: {
                        set2 = (Set)objectArray[0];
                        set = (Set)objectArray[1];
                        l3 = (Long)objectArray[2];
                        set3 = (Set)objectArray[3];
                        Set set4 = (Set)objectArray[4];
                        long l4 = l3;
                        long l5 = l4 ^ 0L;
                        l2 = l4 ^ 0x34A95E9B95E0L;
                        l = l4 ^ 0x412C626700A3L;
                        CallSite callSite3 = m44.a("h", (long)-2900595962250096960L, (long)l3);
                        Object[] objectArray2 = new Object[5];
                        objectArray2[4] = set4;
                        objectArray2[3] = set3;
                        objectArray2[2] = l5;
                        objectArray2[1] = set;
                        objectArray2[0] = set2;
                        super.Z(objectArray2);
                        callSite2 = callSite3;
                        try {
                            try {
                                callSite = m44.a("v", (Object)((Object)this), (long)-3542199573162153664L, (long)l3);
                                if (callSite2 == false) break block14;
                                if (callSite == null) break block15;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)-3553029645909724645L, (long)l3);
                            }
                            callSite = m44.a("v", (Object)((Object)this), (long)-3542199573162153664L, (long)l3);
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-3553029645909724645L, (long)l3);
                        }
                    }
                    try {
                        boolean bl;
                        try {
                            if (l3 <= 0L) break block16;
                            bl = callSite.J();
                            if (callSite2 == false) break block17;
                            if (!bl) break block15;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)((Object)n94), (long)-3553029645909724645L, (long)l3);
                        }
                        bl = set3.add((bf)m44.a("v", (Object)((Object)this), (long)-3542199573162153664L, (long)l3));
                    }
                    catch (n9 n95) {
                        throw m44.a("h", (Object)((Object)n95), (long)-3553029645909724645L, (long)l3);
                    }
                }
                callSite = m44.a("v", (Object)((Object)this), (long)-3542199573162153664L, (long)l3);
            }
            _v _v2 = callSite.G(l);
            try {
                boolean bl;
                block18: {
                    try {
                        try {
                            bl = m44.a("v", (Object)((Object)this), (long)-3542199573162153664L, (long)l3).D(l2);
                            if (callSite2 == false) break block15;
                            if (!bl) break block18;
                        }
                        catch (n9 n96) {
                            throw m44.a("h", (Object)((Object)n96), (long)-3553029645909724645L, (long)l3);
                        }
                        set.add((_f)_v2);
                        if (callSite2 != false) break block15;
                    }
                    catch (n9 n97) {
                        throw m44.a("h", (Object)((Object)n97), (long)-3553029645909724645L, (long)l3);
                    }
                }
                bl = set2.add((_f)_v2);
            }
            catch (n9 n98) {
                throw m44.a("h", (Object)((Object)n98), (long)-3553029645909724645L, (long)l3);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void i(Object[] var1_1) {
        block38: {
            block36: {
                block34: {
                    block35: {
                        block29: {
                            block37: {
                                block28: {
                                    block27: {
                                        var6_2 = (_u)var1_1[0];
                                        var5_3 = (_6)var1_1[1];
                                        var4_4 = (l6z)var1_1[2];
                                        var2_5 = (Long)var1_1[3];
                                        v0 = var2_5 = j5.a ^ var2_5;
                                        var7_6 = v0 ^ 135941625361408L;
                                        var9_7 = v0 ^ 14522164784972L;
                                        var11_8 = v0 ^ 19241318641453L;
                                        var13_9 = v0 ^ 55503919195169L;
                                        var15_10 = v0 ^ 134480196072815L;
                                        var17_11 = v0 ^ 100518786621620L;
                                        var19_12 = v0 ^ 140486897940119L;
                                        var21_13 = v0 ^ 111905677139462L;
                                        var24_14 = m44.a("p", (Object)this, (long)-8552958750842177075L, (long)var2_5).A();
                                        var23_15 = m44.a("n", (long)-8276815180352721978L, (long)var2_5);
                                        var25_16 = m44.a("n", (Object)new Object[]{m44.a("p", (Object)this, (long)-8552958750842177075L, (long)var2_5).X()}, (long)-7697624574349308668L, (long)var2_5);
                                        try {
                                            try {
                                                try {
                                                    v1 /* !! */  = var25_16.charAt(0);
                                                    if (var23_15 != false) break block27;
                                                    if (v1 /* !! */  == (int)j5.j) break block28;
                                                }
                                                catch (n9 v2) {
                                                    throw m44.a("n", (Object)v2, (long)-8437760022519597491L, (long)var2_5);
                                                }
                                                v3 = var25_16;
                                                if (var23_15 != false) break block29;
                                            }
                                            catch (n9 v4) {
                                                throw m44.a("n", (Object)v4, (long)-8437760022519597491L, (long)var2_5);
                                            }
                                            v5 = new Object[2];
                                            v5[1] = var11_8;
                                            v5[0] = v3;
                                            v1 /* !! */  = (char)m44.a("n", (Object)v5, (long)-8389769382171649437L, (long)var2_5);
                                        }
                                        catch (n9 v6) {
                                            throw m44.a("n", (Object)v6, (long)-8437760022519597491L, (long)var2_5);
                                        }
                                    }
                                    if (v1 /* !! */  == '\u0000') break block37;
                                }
                                return;
                            }
                            v3 = var25_16.substring(1, var25_16.length() - 1);
                        }
                        var26_17 = v3;
                        var27_18 = m44.a("q", (Object)this.L, (Object)new Object[0], (long)-8639624648683054677L, (long)var2_5);
                        v7 = new Object[1];
                        v7[0] = var13_9;
                        var28_19 = m44.a("n", (Object)v7, (long)-8645229506111475322L, (long)var2_5);
                        var29_20 = 0;
                        while (var29_20 < ((CallSite)var27_18).length) {
                            block32: {
                                block33: {
                                    block30: {
                                        try {
                                            block31: {
                                                try {
                                                    try {
                                                        v8 /* !! */  = var27_18[var29_20];
lbl60:
                                                        // 2 sources

                                                        while (true) {
                                                            v9 = v8 /* !! */  instanceof j2;
                                                            v10 = var23_15;
                                                            if (var2_5 >= 0L) {
                                                                if (v10 != false) break block30;
                                                                if (!v9) break block31;
                                                            }
                                                            ** GOTO lbl90
                                                            break;
                                                        }
                                                    }
                                                    catch (n9 v11) {
                                                        throw m44.a("n", (Object)v11, (long)-8437760022519597491L, (long)var2_5);
                                                    }
                                                    v12 = new Object[1];
                                                    v12[0] = var7_6;
                                                    var28_19.add(m44.a("q", (Object)((j2)var27_18[var29_20]), (Object)v12, (long)-7732769855904239566L, (long)var2_5));
                                                    v13 = var23_15;
                                                    if (var2_5 <= 0L) break block32;
                                                    if (v13 == false) break block33;
                                                }
                                                catch (n9 v14) {
                                                    throw m44.a("n", (Object)v14, (long)-8437760022519597491L, (long)var2_5);
                                                }
                                            }
                                            v9 = var27_18[var29_20] instanceof j9;
                                        }
                                        catch (n9 v15) {
                                            throw m44.a("n", (Object)v15, (long)-8437760022519597491L, (long)var2_5);
                                        }
                                    }
                                    try {
                                        try {
                                            v10 = var23_15;
lbl90:
                                            // 2 sources

                                            if (v10 != false || !v9) break block33;
                                        }
                                        catch (n9 v16) {
                                            throw m44.a("n", (Object)v16, (long)-8437760022519597491L, (long)var2_5);
                                        }
                                        v17 = new Object[1];
                                        v17[0] = var15_10;
                                        v9 = var28_19.add(m44.a("q", (Object)((j9)var27_18[var29_20]), (Object)v17, (long)-7711658080593809347L, (long)var2_5).v());
                                    }
                                    catch (n9 v18) {
                                        throw m44.a("n", (Object)v18, (long)-8437760022519597491L, (long)var2_5);
                                    }
                                }
                                ++var29_20;
                                v13 = var23_15;
                            }
                            if (v13 == false) continue;
                        }
                        v8 /* !! */  = this;
                        ** while (var2_5 < 0L)
lbl108:
                        // 1 sources

                        v19 = new Object[1];
                        v19[0] = var21_13;
                        var29_21 = m44.a("q", (Object)v8 /* !! */ , (Object)v19, (long)-7683940144276398615L, (long)var2_5);
                        try {
                            try {
                                v20 = var29_21;
                                v21 /* !! */  = var23_15;
                                if (var2_5 <= 0L) break block34;
                                if (v21 /* !! */  != false) break block35;
                                if (!v20.z(var19_12)) break block36;
                            }
                            catch (n9 v22) {
                                throw m44.a("n", (Object)v22, (long)-8437760022519597491L, (long)var2_5);
                            }
                            v20 = var29_21;
                        }
                        catch (n9 v23) {
                            throw m44.a("n", (Object)v23, (long)-8437760022519597491L, (long)var2_5);
                        }
                    }
                    v21 /* !! */  = (CallSite)false;
                }
                v24 = m44.a("q", (Object)v20, (Object)new Object[v21 /* !! */ ], (long)-7782406334060325018L, (long)var2_5);
                break block38;
            }
            v24 = null;
        }
        var30_22 = v24;
        v25 = new Object[1];
        v25[0] = var9_7;
        var31_23 = var5_3.g((String)var26_17, (Integer)var30_22, var17_11, (String)j5.c("k", (int)14368, (long)(754678513529019403L ^ var2_5)) + cf.a((String)var26_17) + (String)j5.c("k", (int)10452, (long)(2510677173527235838L ^ var2_5)) + (String)m44.a("q", (Object)this, (Object)v25, (long)-8587959747138571072L, (long)var2_5) + "'");
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

    private static String c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7DB3;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/j5", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            j5.h[n2] = j5.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = j5.c(n, l);
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
            throw new RuntimeException("com/zelix/j5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(j5.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
