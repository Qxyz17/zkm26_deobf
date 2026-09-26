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
    private static final long a = prr.a(-1225649428526705117L, 8929866531307491094L, MethodHandles.lookup().lookupClass()).a(30716932456929L);
    private static final String[] c;
    private static final String[] d;
    private static final Map g;

    xt R(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite2 = m44.a("j", (long)7267676528981448083L, (long)l10);
                try {
                    try {
                        callSite = m44.a("t", (Object)this, (long)7465614721151462209L, (long)l10);
                        if (callSite2 == false) break block4;
                        if (!(callSite instanceof xt)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)7035935413854883995L, (long)l10);
                    }
                    callSite = m44.a("t", (Object)this, (long)7465614721151462209L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)7035935413854883995L, (long)l10);
                }
            }
            return (xt)((Object)callSite);
        }
        return null;
    }

    kl(int n10, _4 _42, char c10, x8 x82, int n11, c c11) {
        long l10 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)n11 << 48 >>> 48) ^ a;
        super(_42, x82, 2);
        m44.a("t", (Object)this, (js)((js)((Object)c11)), (long)6850259108102919115L, (long)l10);
    }

    @Override
    public void V(Object[] objectArray) {
        block5: {
            kl kl2;
            long l10;
            xt xt2;
            block4: {
                xt xt3 = (xt)objectArray[0];
                xt2 = (xt)objectArray[1];
                l10 = (Long)objectArray[2];
                CallSite callSite = m44.a("l", (long)2604643221172671853L, (long)l10);
                try {
                    try {
                        kl2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("r", (Object)kl2, (long)2838751493856340927L, (long)l10) != xt3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)2403476904484737125L, (long)l10);
                    }
                    kl2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)2403476904484737125L, (long)l10);
                }
            }
            m44.a("p", (Object)kl2, (js)xt2, (long)2838751493856340927L, (long)l10);
        }
    }

    xp E(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite2 = m44.a("m", (long)226510299568370284L, (long)l10);
                try {
                    try {
                        callSite = m44.a("s", (Object)this, (long)28272489942977726L, (long)l10);
                        if (callSite2 == false) break block4;
                        if (!(callSite instanceof xp)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)458216376351733604L, (long)l10);
                    }
                    callSite = m44.a("s", (Object)this, (long)28272489942977726L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)458216376351733604L, (long)l10);
                }
            }
            return (xp)((Object)callSite);
        }
        return null;
    }

    xa R(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite2 = m44.a("o", (long)-1144221003044248327L, (long)l10);
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)-1511431465696270372L, (long)l10);
                        if (callSite2 != false) break block4;
                        if (!(callSite instanceof xa)) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-1352828228442334202L, (long)l10);
                    }
                    callSite = m44.a("q", (Object)this, (long)-1511431465696270372L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-1352828228442334202L, (long)l10);
                }
            }
            return (xa)((Object)callSite);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    @Override
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
                                    var8_7.t((xt)m44.a("r", (Object)this, (long)-3229884438790447113L, (long)var3_3), this, var17_13);
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
                                var9_8.t((xp)m44.a("r", (Object)this, (long)-3229884438790447113L, (long)var3_3), this, var17_13);
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
                    var10_9.t((xa)m44.a("r", (Object)this, (long)-3229884438790447113L, (long)var3_3), this, var17_13);
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
        boolean bl2;
        long l10;
        long l11;
        long l12;
        block4: {
            block5: {
                l12 = (Long)objectArray[0];
                long l13 = l12 = a ^ l12;
                l11 = l13 ^ 0x22E5795090BAL;
                l10 = l13 ^ 0x79D8C9D44DBFL;
                CallSite callSite = m44.a("l", (long)9193519850851274461L, (long)l12);
                try {
                    try {
                        bl2 = m44.a("r", (Object)this, (long)8995159449965752335L, (long)l12) instanceof xa;
                        if (callSite == false) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)8857068841762900949L, (long)l12);
                    }
                    return (long)m44.a("s", (Object)((xa)((Object)m44.a("r", (Object)this, (long)8995159449965752335L, (long)l12))), (Object)new Object[0], (long)7113347454717964878L, (long)l12);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)8857068841762900949L, (long)l12);
                }
            }
            bl2 = false;
        }
        lk0.t(bl2, new String[]{this.h(l11) + " " + m44.a("r", (Object)this, (long)8995159449965752335L, (long)l12).getClass().getName()}, l10);
        return 0L;
    }

    @Override
    public void o(Object[] objectArray) {
        block5: {
            kl kl2;
            xp xp2;
            long l10;
            block4: {
                xp xp3 = (xp)objectArray[0];
                l10 = (Long)objectArray[1];
                xp2 = (xp)objectArray[2];
                CallSite callSite = m44.a("k", (long)9122822361943117778L, (long)l10);
                try {
                    try {
                        kl2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("u", (Object)kl2, (long)9068577149142102272L, (long)l10) != xp3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)8927706958389529306L, (long)l10);
                    }
                    kl2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)8927706958389529306L, (long)l10);
                }
            }
            m44.a("w", (Object)kl2, (js)xp2, (long)9068577149142102272L, (long)l10);
        }
    }

    @Override
    public void U(Object[] objectArray) {
        block5: {
            kl kl2;
            long l10;
            xa xa2;
            block4: {
                xa xa3 = (xa)objectArray[0];
                xa2 = (xa)objectArray[1];
                l10 = (Long)objectArray[2];
                CallSite callSite = m44.a("h", (long)-5624529949562116842L, (long)l10);
                try {
                    try {
                        kl2 = this;
                        if (callSite != false) break block4;
                        if (m44.a("v", (Object)kl2, (long)-6131334405280553421L, (long)l10) != xa3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-5992453664820781591L, (long)l10);
                    }
                    kl2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-5992453664820781591L, (long)l10);
                }
            }
            m44.a("t", (Object)kl2, (js)xa2, (long)-6131334405280553421L, (long)l10);
        }
    }

    @Override
    void z(gu gu2, long l10) {
        long l11 = l10;
        long l12 = l11 ^ 0x66FDF08525FDL;
        long l13 = l11 ^ 0x6DE1DADD9981L;
        gu2.K(this.b, this, l12, this.H());
        m44.a("w", (Object)((c)((Object)m44.a("v", (Object)this, (long)6260393072886143547L, (long)l10))), (long)l13, (Object)gu2, (Object)this, (Object)this.H(), (long)5618071577054747339L, (long)l10);
    }

    @Override
    protected void c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[1];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = dataOutputStream;
        objectArray2[0] = l11;
        super.c(objectArray2);
        dataOutputStream.writeShort(((js)((Object)m44.a("w", (Object)this, (long)770245952242812522L, (long)l10))).E());
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l10 = a ^ 0x465843325FAFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n10 = 0;
        String string = "}\u00db8\u00ff%\u001a\u009a\u00b82\u00e6\u00fb\u0017\u00ea\u00f6\u009f\u001c8\u0017\u00c4\u008biq\u00c2$\u00d8\u00dfd\u009a\u00c0Q#8\u00c9g\u00b2u\u00b7\u00c6\u00c2\u00b1/+b\u00d6\u00e4K\u00ea\u0001\u00a9\u00fc\u00d1\u00d2\u0095\u00dc\u0003HX\u0095\u00c8\u008a^\u00d9\u009d\u00e6!\u00a7\u00ad\u008d\u00d7\u001d\u00e0s\\";
        int n11 = "}\u00db8\u00ff%\u001a\u009a\u00b82\u00e6\u00fb\u0017\u00ea\u00f6\u009f\u001c8\u0017\u00c4\u008biq\u00c2$\u00d8\u00dfd\u009a\u00c0Q#8\u00c9g\u00b2u\u00b7\u00c6\u00c2\u00b1/+b\u00d6\u00e4K\u00ea\u0001\u00a9\u00fc\u00d1\u00d2\u0095\u00dc\u0003HX\u0095\u00c8\u008a^\u00d9\u009d\u00e6!\u00a7\u00ad\u008d\u00d7\u001d\u00e0s\\".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = kl.c(byArray3).intern();
            if ((n13 += n12) >= n11) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5E3D;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/kl", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            kl.d[n11] = kl.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = kl.b(n10, l10);
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

