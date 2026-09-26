/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.a;
import com.zelix.aw;
import com.zelix.c;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.lk0;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.mb;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.x8;
import com.zelix.xa;
import com.zelix.xp;
import com.zelix.xt;
import com.zelix.y0;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class kl
extends kw
implements a,
mb,
y0 {
    js l;
    private static final long a = prr.a((long)-1225649428526705117L, (long)8929866531307491094L, MethodHandles.lookup().lookupClass()).a(30716932456929L);
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    xt R(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite2 = m44.a("j", (long)7267676528981448083L, (long)l);
                try {
                    try {
                        callSite = m44.a("t", (Object)((Object)this), (long)7465614721151462209L, (long)l);
                        if (callSite2 == false) break block4;
                        if (!(callSite instanceof xt)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)7035935413854883995L, (long)l);
                    }
                    callSite = m44.a("t", (Object)((Object)this), (long)7465614721151462209L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)7035935413854883995L, (long)l);
                }
            }
            return (xt)callSite;
        }
        return null;
    }

    kl(int n, _4 _42, char c2, x8 x82, int n2, c c3) {
        long l = ((long)n << 32 | (long)c2 << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ a;
        super(_42, x82, 2);
        m44.a("t", (Object)((Object)this), (js)((js)c3), (long)6850259108102919115L, (long)l);
    }

    public void V(Object[] objectArray) {
        block5: {
            kl kl2;
            long l;
            xt xt2;
            block4: {
                xt xt3 = (xt)objectArray[0];
                xt2 = (xt)objectArray[1];
                l = (Long)objectArray[2];
                CallSite callSite = m44.a("l", (long)2604643221172671853L, (long)l);
                try {
                    try {
                        kl2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("r", (Object)((Object)kl2), (long)2838751493856340927L, (long)l) != xt3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)2403476904484737125L, (long)l);
                    }
                    kl2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)2403476904484737125L, (long)l);
                }
            }
            m44.a("p", (Object)((Object)kl2), (js)xt2, (long)2838751493856340927L, (long)l);
        }
    }

    xp E(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite2 = m44.a("m", (long)226510299568370284L, (long)l);
                try {
                    try {
                        callSite = m44.a("s", (Object)((Object)this), (long)28272489942977726L, (long)l);
                        if (callSite2 == false) break block4;
                        if (!(callSite instanceof xp)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)458216376351733604L, (long)l);
                    }
                    callSite = m44.a("s", (Object)((Object)this), (long)28272489942977726L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)458216376351733604L, (long)l);
                }
            }
            return (xp)callSite;
        }
        return null;
    }

    xa R(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite2 = m44.a("o", (long)-1144221003044248327L, (long)l);
                try {
                    try {
                        callSite = m44.a("q", (Object)((Object)this), (long)-1511431465696270372L, (long)l);
                        if (callSite2 != false) break block4;
                        if (!(callSite instanceof xa)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-1352828228442334202L, (long)l);
                    }
                    callSite = m44.a("q", (Object)((Object)this), (long)-1511431465696270372L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)-1352828228442334202L, (long)l);
                }
            }
            return (xa)callSite;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    protected void N(Object[] var1_1) {
        block9: {
            block8: {
                var3_2 = (DataOutputStream)var1_1[0];
                var6_3 = (Map)var1_1[1];
                var4_4 = (Long)var1_1[2];
                var2_5 = (lqu)var1_1[3];
                var7_6 = var4_4 ^ 0L;
                v0 = m44.a("k", (long)1083949478671047661L, (long)var4_4);
                v1 = new Object[4];
                v1[3] = var2_5;
                v1[2] = var7_6;
                v1[1] = var6_3;
                v1[0] = var3_2;
                super.N(v1);
                var9_7 = v0;
                var10_8 = (js)var6_3.get(m44.a("u", (Object)this, (long)1446304564557551816L, (long)var4_4));
                try {
                    try {
                        if (var9_7 != false) break block8;
                        if (var10_8 != null) {
                        }
                        ** GOTO lbl33
                    }
                    catch (n9 v2) {
                        throw m44.a("k", (Object)v2, (long)1309939072910435090L, (long)var4_4);
                    }
                    var3_2.writeShort(var10_8.E());
                }
                catch (n9 v3) {
                    throw m44.a("k", (Object)v3, (long)1309939072910435090L, (long)var4_4);
                }
            }
            try {
                if (var4_4 <= 0L || var9_7 == false) break block9;
lbl33:
                // 2 sources

                var3_2.writeShort(m44.a("u", (Object)this, (long)1446304564557551816L, (long)var4_4).E());
            }
            catch (n9 v4) {
                throw m44.a("k", (Object)v4, (long)1309939072910435090L, (long)var4_4);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    kl(_4 var1_1, int var2_2, long var3_3, String var5_4, h1 var6_5, l6q var7_6, l6q var8_7, l6q var9_8, l6q var10_9) {
        block25: {
            block22: {
                block23: {
                    block20: {
                        v0 = var3_3 = kl.a ^ var3_3;
                        var11_10 = v0 ^ 56917038380405L;
                        var13_11 = v0 ^ 68642187884472L;
                        var15_12 = v0 ^ 125994098416444L;
                        var17_13 = v0 ^ 20623950134907L;
                        super(var1_1, var2_2, var5_4, var13_11, var6_5, var7_6);
                        var20_14 = var6_5.readUnsignedShort();
                        var19_15 = m44.a("l", (long)-3427822659421888219L, (long)var3_3);
                        try {
                            block21: {
                                try {
                                    try {
                                        m44.a("p", (Object)this, (js)this.m(var15_12, var20_14), (long)-3229884438790447113L, (long)var3_3);
                                        v1 = m44.a("r", (Object)this, (long)-3229884438790447113L, (long)var3_3) instanceof xt;
                                        if (var19_15 == false) break block20;
                                        if (!v1) break block21;
                                    }
                                    catch (n9 v2) {
                                        throw m44.a("l", (Object)v2, (long)-3093201340762627027L, (long)var3_3);
                                    }
                                    var8_7.t((Object)((xt)m44.a("r", (Object)this, (long)-3229884438790447113L, (long)var3_3)), (Object)this, var17_13);
                                    if (var19_15 != false) break block22;
                                }
                                catch (n9 v3) {
                                    throw m44.a("l", (Object)v3, (long)-3093201340762627027L, (long)var3_3);
                                }
                            }
                            v1 = m44.a("r", (Object)this, (long)-3229884438790447113L, (long)var3_3) instanceof xp;
                        }
                        catch (n9 v4) {
                            throw m44.a("l", (Object)v4, (long)-3093201340762627027L, (long)var3_3);
                        }
                    }
                    try {
                        block24: {
                            try {
                                try {
                                    v5 = var19_15;
                                    if (var3_3 > 0L) {
                                        if (v5 == false) break block23;
                                        if (!v1) break block24;
                                    }
                                    ** GOTO lbl57
                                }
                                catch (n9 v6) {
                                    throw m44.a("l", (Object)v6, (long)-3093201340762627027L, (long)var3_3);
                                }
                                var9_8.t((Object)((xp)m44.a("r", (Object)this, (long)-3229884438790447113L, (long)var3_3)), (Object)this, var17_13);
                                if (var19_15 != false) break block22;
                            }
                            catch (n9 v7) {
                                throw m44.a("l", (Object)v7, (long)-3093201340762627027L, (long)var3_3);
                            }
                        }
                        v1 = m44.a("r", (Object)this, (long)-3229884438790447113L, (long)var3_3) instanceof xa;
                    }
                    catch (n9 v8) {
                        throw m44.a("l", (Object)v8, (long)-3093201340762627027L, (long)var3_3);
                    }
                }
                try {
                    try {
                        if (var3_3 <= 0L) break block25;
                        v5 = var19_15;
lbl57:
                        // 2 sources

                        if (v5 == false) break block25;
                        if (!v1) break block22;
                    }
                    catch (n9 v9) {
                        throw m44.a("l", (Object)v9, (long)-3093201340762627027L, (long)var3_3);
                    }
                    var10_9.t((Object)((xa)m44.a("r", (Object)this, (long)-3229884438790447113L, (long)var3_3)), (Object)this, var17_13);
                }
                catch (n9 v10) {
                    throw m44.a("l", (Object)v10, (long)-3093201340762627027L, (long)var3_3);
                }
            }
            v1 = m44.a("r", (Object)this, (long)-3229884438790447113L, (long)var3_3) instanceof c;
        }
        try {
            if (!v1) {
                throw new aw(this.f(var11_10) + (String)kl.b("y", (int)28507, (long)(62956033193374229L ^ var3_3)) + (String)kl.b("y", (int)493, (long)(3016700474729471138L ^ var3_3)));
            }
        }
        catch (n9 v11) {
            throw m44.a("l", (Object)v11, (long)-3093201340762627027L, (long)var3_3);
        }
    }

    long h(Object[] objectArray) {
        boolean bl;
        long l;
        long l2;
        long l3;
        block4: {
            block5: {
                l3 = (Long)objectArray[0];
                long l4 = l3 = a ^ l3;
                l2 = l4 ^ 0x22E5795090BAL;
                l = l4 ^ 0x79D8C9D44DBFL;
                CallSite callSite = m44.a("l", (long)9193519850851274461L, (long)l3);
                try {
                    try {
                        bl = m44.a("r", (Object)((Object)this), (long)8995159449965752335L, (long)l3) instanceof xa;
                        if (callSite == false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)8857068841762900949L, (long)l3);
                    }
                    return (long)m44.a("s", (Object)((xa)m44.a("r", (Object)((Object)this), (long)8995159449965752335L, (long)l3)), (Object)new Object[0], (long)7113347454717964878L, (long)l3);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)8857068841762900949L, (long)l3);
                }
            }
            bl = false;
        }
        lk0.t((boolean)bl, (String[])new String[]{this.h(l2) + " " + m44.a("r", (Object)((Object)this), (long)8995159449965752335L, (long)l3).getClass().getName()}, (long)l);
        return 0L;
    }

    public void o(Object[] objectArray) {
        block5: {
            kl kl2;
            xp xp2;
            long l;
            block4: {
                xp xp3 = (xp)objectArray[0];
                l = (Long)objectArray[1];
                xp2 = (xp)objectArray[2];
                CallSite callSite = m44.a("k", (long)9122822361943117778L, (long)l);
                try {
                    try {
                        kl2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("u", (Object)((Object)kl2), (long)9068577149142102272L, (long)l) != xp3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)8927706958389529306L, (long)l);
                    }
                    kl2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)8927706958389529306L, (long)l);
                }
            }
            m44.a("w", (Object)((Object)kl2), (js)xp2, (long)9068577149142102272L, (long)l);
        }
    }

    public void U(Object[] objectArray) {
        block5: {
            kl kl2;
            long l;
            xa xa2;
            block4: {
                xa xa3 = (xa)objectArray[0];
                xa2 = (xa)objectArray[1];
                l = (Long)objectArray[2];
                CallSite callSite = m44.a("h", (long)-5624529949562116842L, (long)l);
                try {
                    try {
                        kl2 = this;
                        if (callSite != false) break block4;
                        if (m44.a("v", (Object)((Object)kl2), (long)-6131334405280553421L, (long)l) != xa3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-5992453664820781591L, (long)l);
                    }
                    kl2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-5992453664820781591L, (long)l);
                }
            }
            m44.a("t", (Object)((Object)kl2), (js)xa2, (long)-6131334405280553421L, (long)l);
        }
    }

    void z(gu gu2, long l) {
        long l2 = l;
        long l3 = l2 ^ 0x66FDF08525FDL;
        long l4 = l2 ^ 0x6DE1DADD9981L;
        gu2.K((js)this.b, (Object)this, l3, (Object)this.H());
        m44.a("w", (Object)((c)m44.a("v", (Object)((Object)this), (long)6260393072886143547L, (long)l)), (long)l4, (Object)gu2, (Object)((Object)this), (Object)this.H(), (long)5618071577054747339L, (long)l);
    }

    protected void c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[1];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = dataOutputStream;
        objectArray2[0] = l2;
        super.c(objectArray2);
        dataOutputStream.writeShort(m44.a("w", (Object)((Object)this), (long)770245952242812522L, (long)l).E());
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l = a ^ 0x465843325FAFL;
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
        String string = "}\u00db8\u00ff%\u001a\u009a\u00b82\u00e6\u00fb\u0017\u00ea\u00f6\u009f\u001c8\u0017\u00c4\u008biq\u00c2$\u00d8\u00dfd\u009a\u00c0Q#8\u00c9g\u00b2u\u00b7\u00c6\u00c2\u00b1/+b\u00d6\u00e4K\u00ea\u0001\u00a9\u00fc\u00d1\u00d2\u0095\u00dc\u0003HX\u0095\u00c8\u008a^\u00d9\u009d\u00e6!\u00a7\u00ad\u008d\u00d7\u001d\u00e0s\\";
        int n2 = "}\u00db8\u00ff%\u001a\u009a\u00b82\u00e6\u00fb\u0017\u00ea\u00f6\u009f\u001c8\u0017\u00c4\u008biq\u00c2$\u00d8\u00dfd\u009a\u00c0Q#8\u00c9g\u00b2u\u00b7\u00c6\u00c2\u00b1/+b\u00d6\u00e4K\u00ea\u0001\u00a9\u00fc\u00d1\u00d2\u0095\u00dc\u0003HX\u0095\u00c8\u008a^\u00d9\u009d\u00e6!\u00a7\u00ad\u008d\u00d7\u001d\u00e0s\\".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = kl.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5E3D;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/kl", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            kl.d[n2] = kl.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = kl.b(n, l);
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
            throw new RuntimeException("com/zelix/kl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(kl.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
