/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix._g;
import com.zelix.a7;
import com.zelix.aj;
import com.zelix.cf;
import com.zelix.e4;
import com.zelix.f8;
import com.zelix.gs;
import com.zelix.h1;
import com.zelix.lb6;
import com.zelix.m;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.s4;
import com.zelix.sz;
import com.zelix.tt;
import com.zelix.un;
import com.zelix.us;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Path;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class loq
implements us {
    private static final Boolean Y;
    private static final Boolean r;
    private ol y;
    private final boolean L;
    private s4 j;
    private sz A;
    private ol M;
    private _g f;
    private tt v;
    private HashMap w;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean A(Object[] var1_1) {
        block23: {
            block24: {
                block21: {
                    block22: {
                        block20: {
                            block19: {
                                block17: {
                                    block18: {
                                        var5_2 = (String)var1_1[0];
                                        var2_3 = (String)var1_1[1];
                                        var3_4 = (Long)var1_1[2];
                                        v0 = var3_4 = loq.a ^ var3_4;
                                        v1 = v0 ^ 8512459121123L;
                                        var6_5 = (int)(v1 >>> 48);
                                        var7_6 = (int)(v1 << 16 >>> 48);
                                        var8_7 = (int)(v1 << 32 >>> 32);
                                        var9_8 = v0 ^ 46530625308935L;
                                        v2 = v0 ^ 139077740677561L;
                                        var11_9 = (int)(v2 >>> 32);
                                        var12_10 = (int)(v2 << 32 >>> 48);
                                        var13_11 = (int)(v2 << 48 >>> 48);
                                        var14_12 = v0 ^ 1027000398518L;
                                        var16_13 = v0 ^ 79430010617211L;
                                        var21_14 = m44.a("l", (long)233433701554873201L, (long)var3_4);
                                        try {
                                            try {
                                                v3 = var5_2;
                                                if (var21_14 != null) break block17;
                                                if (!v3.equals(loq.a("c", (int)26563, (long)(1994044291306723028L ^ var3_4)))) break block18;
                                            }
                                            catch (n9 v4) {
                                                throw m44.a("l", (Object)v4, (long)572437225879741936L, (long)var3_4);
                                            }
                                            return false;
                                        }
                                        catch (n9 v5) {
                                            throw m44.a("l", (Object)v5, (long)572437225879741936L, (long)var3_4);
                                        }
                                    }
                                    v3 = m44.a("r", (Object)this, (long)91511744590129412L, (long)var3_4).m(var16_13, var2_3, var5_2);
                                }
                                var22_15 = (Boolean)v3;
                                try {
                                    v6 = var22_15;
                                    if (var21_14 != null) break block19;
                                    if (v6 == null) break block20;
                                }
                                catch (n9 v7) {
                                    throw m44.a("l", (Object)v7, (long)572437225879741936L, (long)var3_4);
                                }
                                v6 = var22_15;
                            }
                            return v6;
                        }
                        v8 = new Object[2];
                        v8[1] = var9_8;
                        v8[0] = var5_2;
                        var24_16 = m44.a("s", (Object)this, (Object)v8, (long)1846023635297040947L, (long)var3_4);
                        var23_17 = var24_16.a(var11_9, var12_10, var13_11);
                        try {
                            try {
                                v9 /* !! */  = var23_17.equals(var2_3);
                                v10 = var21_14;
                                if (var3_4 > 0L) {
                                    if (v10 != null) break block21;
                                    if (!v9 /* !! */ ) break block22;
                                }
                                ** GOTO lbl75
                            }
                            catch (n9 v11) {
                                throw m44.a("l", (Object)v11, (long)572437225879741936L, (long)var3_4);
                            }
                            m44.a("r", (Object)this, (long)91511744590129412L, (long)var3_4).h((short)var6_5, (char)var7_6, var2_3, var8_7, var5_2, m44.a("h", (long)455959964970529028L, (long)var3_4));
                            return true;
                        }
                        catch (n9 v12) {
                            throw m44.a("l", (Object)v12, (long)572437225879741936L, (long)var3_4);
                        }
                    }
                    v9 /* !! */  = var23_17.equals(loq.a("c", (int)26563, (long)(1994044291306723028L ^ var3_4)));
                }
                try {
                    try {
                        v10 = var21_14;
lbl75:
                        // 2 sources

                        if (v10 != null) break block23;
                        if (!v9 /* !! */ ) break block24;
                    }
                    catch (n9 v13) {
                        throw m44.a("l", (Object)v13, (long)572437225879741936L, (long)var3_4);
                    }
                    m44.a("r", (Object)this, (long)91511744590129412L, (long)var3_4).h((short)var6_5, (char)var7_6, var2_3, var8_7, var5_2, m44.a("h", (long)322745076998837571L, (long)var3_4));
                    return false;
                }
                catch (n9 v14) {
                    throw m44.a("l", (Object)v14, (long)572437225879741936L, (long)var3_4);
                }
            }
            v15 = new Object[3];
            v15[2] = var14_12;
            v15[1] = var2_3;
            v15[0] = var23_17;
            v9 /* !! */  = m44.a("s", (Object)this, (Object)v15, (long)516320938283418089L, (long)var3_4);
        }
        var25_18 = v9 /* !! */ ;
        try {
            v16 = m44.a("r", (Object)this, (long)91511744590129412L, (long)var3_4);
            v17 = var2_3;
            v18 = var5_2;
            v19 = var25_18 != false ? m44.a("h", (long)455959964970529028L, (long)var3_4) : m44.a("h", (long)322745076998837571L, (long)var3_4);
        }
        catch (n9 v20) {
            throw m44.a("l", (Object)v20, (long)572437225879741936L, (long)var3_4);
        }
        var18_19 = v19;
        var19_20 = v18;
        var20_21 = v17;
        v16.h((short)var6_5, (char)var7_6, var20_21, var8_7, var19_20, var18_19);
        return var25_18;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean y(Object[] var1_1) {
        block26: {
            block25: {
                block24: {
                    block22: {
                        block23: {
                            var5_2 = (String)var1_1[0];
                            var2_3 = (String)var1_1[1];
                            var3_4 = (Long)var1_1[2];
                            v0 = var3_4 = loq.a ^ var3_4;
                            var6_5 = v0 ^ 41940972017663L;
                            v1 = v0 ^ 93950490724847L;
                            var8_6 = (int)(v1 >>> 48);
                            var9_7 = (int)(v1 << 16 >>> 48);
                            var10_8 = (int)(v1 << 32 >>> 32);
                            var11_9 = v0 ^ 132623135334667L;
                            v2 = v0 ^ 49147125047733L;
                            var13_10 = (int)(v2 >>> 32);
                            var14_11 = (int)(v2 << 32 >>> 48);
                            var15_12 = (int)(v2 << 48 >>> 48);
                            var16_13 = v0 ^ 29630009136503L;
                            var18_14 = v0 ^ 104611400258077L;
                            var20_15 = v0 ^ 1027000398518L;
                            var25_16 = m44.a("h", (long)7723955357763111805L, (long)var3_4);
                            try {
                                try {
                                    v3 = var5_2;
                                    if (var25_16 != null) break block22;
                                    if (!v3.equals(loq.a("c", (int)26563, (long)(1993993442522431192L ^ var3_4)))) break block23;
                                }
                                catch (n9 v4) {
                                    throw m44.a("h", (Object)v4, (long)8069859341735284220L, (long)var3_4);
                                }
                                return false;
                            }
                            catch (n9 v5) {
                                throw m44.a("h", (Object)v5, (long)8069859341735284220L, (long)var3_4);
                            }
                        }
                        v3 = m44.a("v", (Object)this, (long)8393318808231217317L, (long)var3_4).m(var16_13, var2_3, var5_2);
                    }
                    var26_17 = (Boolean)v3;
                    try {
                        v6 = var26_17;
                        if (var25_16 != null) break block24;
                        if (v6 == null) break block25;
                    }
                    catch (n9 v7) {
                        throw m44.a("h", (Object)v7, (long)8069859341735284220L, (long)var3_4);
                    }
                    v6 = var26_17;
                }
                return v6;
            }
            v8 = new Object[2];
            v8[1] = var11_9;
            v8[0] = var5_2;
            var27_18 = m44.a("w", (Object)this, (Object)v8, (long)8183663363241316927L, (long)var3_4);
            v9 = new Object[1];
            v9[0] = var18_14;
            var28_19 = new e4(var6_5, (Object[])m44.a("w", (Object)var27_18, (Object)v9, (long)8143345346287872542L, (long)var3_4));
            block18: while (var28_19.hasMoreElements()) {
                block27: {
                    var29_20 = (String)var28_19.nextElement();
                    try {
                        try {
                            try {
                                v10 /* !! */  = var29_20.equals(var2_3);
                                v11 = var25_16;
                                if (var3_4 > 0L) {
                                    if (v11 != null) break block26;
                                    v11 = var25_16;
                                }
                                if (v11 == null) {
                                }
                                ** GOTO lbl95
                            }
                            catch (n9 v12) {
                                throw m44.a("h", (Object)v12, (long)8069859341735284220L, (long)var3_4);
                            }
                            if (!v10 /* !! */ ) break block27;
                        }
                        catch (n9 v13) {
                            throw m44.a("h", (Object)v13, (long)8069859341735284220L, (long)var3_4);
                        }
                        m44.a("v", (Object)this, (long)8393318808231217317L, (long)var3_4).h((short)var8_6, (char)var9_7, var2_3, var10_8, var5_2, m44.a("l", (long)7953277654229342472L, (long)var3_4));
                        return true;
                    }
                    catch (n9 v14) {
                        throw m44.a("h", (Object)v14, (long)8069859341735284220L, (long)var3_4);
                    }
                }
                v15 = this;
                v16 = new Object[3];
                v16[2] = var20_15;
                v16[1] = var2_3;
                v17 = v16;
                v16[0] = var29_20;
                v18 = 8402139207270974004L;
                v19 = var3_4;
                do {
                    block29: {
                        block28: {
                            v20 = m44.a("w", (Object)v15, (Object)v17, (long)v18, (long)v19);
lbl95:
                            // 2 sources

                            var30_21 = v20;
                            try {
                                try {
                                    v21 = var30_21;
                                    if (var25_16 != null) break block28;
                                    if (!v21) break block29;
                                }
                                catch (n9 v22) {
                                    throw m44.a("h", (Object)v22, (long)8069859341735284220L, (long)var3_4);
                                }
                                m44.a("v", (Object)this, (long)8393318808231217317L, (long)var3_4).h((short)var8_6, (char)var9_7, var2_3, var10_8, var5_2, m44.a("l", (long)7953277654229342472L, (long)var3_4));
                                v21 = true;
                            }
                            catch (n9 v23) {
                                throw m44.a("h", (Object)v23, (long)8069859341735284220L, (long)var3_4);
                            }
                        }
                        return v21;
                    }
                    if (var25_16 == null) continue block18;
                    var29_20 = var27_18.a(var13_10, var14_11, var15_12);
                    v15 = this;
                    v24 = new Object[3];
                    v24[2] = var20_15;
                    v24[1] = var2_3;
                    v17 = v24;
                    v24[0] = var29_20;
                    v18 = 8402139207270974004L;
                    v19 = var3_4;
                } while (var3_4 < 0L);
            }
            v10 /* !! */  = m44.a("w", (Object)v15, (Object)v17, (long)v18, (long)v19);
        }
        var30_21 = v10 /* !! */ ;
        try {
            v25 = m44.a("v", (Object)this, (long)8393318808231217317L, (long)var3_4);
            v26 = var2_3;
            v27 = var5_2;
            v28 = var30_21 != false ? m44.a("l", (long)7953277654229342472L, (long)var3_4) : m44.a("l", (long)7815658776320539983L, (long)var3_4);
        }
        catch (n9 v29) {
            throw m44.a("h", (Object)v29, (long)8069859341735284220L, (long)var3_4);
        }
        var22_22 = v28;
        var23_23 = v27;
        var24_24 = v26;
        v25.h((short)var8_6, (char)var9_7, var24_24, var10_8, var23_23, var22_22);
        return var30_21;
    }

    public _f l(Object[] objectArray) {
        Object object;
        Object object2;
        Object object3;
        int n10;
        Object object4;
        _f _f2;
        CallSite callSite;
        int n11;
        long l10;
        long l11;
        int n12;
        int n13;
        int n14;
        long l12;
        long l13;
        long l14;
        long l15;
        int n15;
        int n16;
        int n17;
        long l16;
        long l17;
        Object object5;
        block28: {
            block29: {
                long l18;
                long l19;
                long l20;
                int n18;
                int n19;
                int n20;
                long l21;
                block27: {
                    _f _f3;
                    block26: {
                        String string;
                        block24: {
                            block25: {
                                object5 = (String)objectArray[0];
                                l17 = (Long)objectArray[1];
                                long l22 = l17 = a ^ l17;
                                l16 = l22 ^ 0x59E8CAA15CD2L;
                                l21 = l22 ^ 0x59F5CD916800L;
                                long l23 = l22 ^ 0x2BC957AF713EL;
                                n20 = (int)(l23 >>> 32);
                                n19 = (int)(l23 << 32 >>> 48);
                                n18 = (int)(l23 << 48 >>> 48);
                                long l24 = l22 ^ 0x21AC406DC963L;
                                n17 = (int)(l24 >>> 32);
                                n16 = (int)(l24 << 32 >>> 48);
                                n15 = (int)(l24 << 48 >>> 48);
                                l15 = l22 ^ 0x46611E950FB3L;
                                l14 = l22 ^ 0x6514525CA900L;
                                l13 = l22 ^ 0x1123D19B1C87L;
                                l12 = l22 ^ 0x456959C760F3L;
                                long l25 = l22 ^ 0x5AE783C60D8CL;
                                n14 = (int)(l25 >>> 32);
                                n13 = (int)(l25 << 32 >>> 48);
                                n12 = (int)(l25 << 48 >>> 48);
                                l11 = l22 ^ 0x36B3F3E420DFL;
                                long l26 = l22 ^ 0x5E1B4C707386L;
                                l10 = l26 >>> 8;
                                n11 = (int)(l26 << 56 >>> 56);
                                l20 = l22 ^ 0x14CBCB32E8E1L;
                                l19 = l22 ^ 0x2B418E233FC7L;
                                l18 = l22 ^ 0x729B4D9D41D8L;
                                callSite = m44.a("m", (long)-536922279149135680L, (long)l17);
                                try {
                                    string = object5;
                                    if (callSite != null) break block24;
                                    if (!string.startsWith("[")) break block25;
                                }
                                catch (IOException iOException) {
                                    throw m44.a("m", (Object)iOException, (long)-270042112595108287L, (long)l17);
                                }
                                object5 = loq.a("c", (int)25736, (long)(0x3352C0B2CBA26E39L ^ l17));
                            }
                            string = ((HashMap)((Object)m44.a("s", (Object)this, (long)-43902967452020117L, (long)l17))).get(object5);
                        }
                        _f2 = (_f)((Object)string);
                        try {
                            _f3 = _f2;
                            if (callSite != null) break block26;
                            if (_f3 == null) break block27;
                        }
                        catch (IOException iOException) {
                            throw m44.a("m", (Object)iOException, (long)-270042112595108287L, (long)l17);
                        }
                        _f3 = _f2;
                    }
                    return _f3;
                }
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l21;
                objectArray2[1] = false;
                objectArray2[0] = object5;
                object4 = m44.a("r", (Object)m44.a("s", (Object)this, (long)-2215969967718070695L, (long)l17), (Object)objectArray2, (long)-2111940979501248333L, (long)l17);
                n10 = 0;
                object3 = null;
                try {
                    if (object4 != null) break block28;
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l19;
                    if (m44.a("r", (Object)m44.a("s", (Object)this, (long)-2266896295778300651L, (long)l17), (Object)objectArray3, (long)-1879150232891758519L, (long)l17) == false) break block29;
                }
                catch (IOException iOException) {
                    throw m44.a("m", (Object)iOException, (long)-270042112595108287L, (long)l17);
                }
                object2 = null;
                try {
                    block30: {
                        block31: {
                            object = new sz(n20, (short)n19, (char)n18);
                            Object[] objectArray4 = new Object[3];
                            objectArray4[2] = l18;
                            objectArray4[1] = object;
                            objectArray4[0] = object5;
                            object2 = m44.a("r", (Object)m44.a("s", (Object)this, (long)-2266896295778300651L, (long)l17), (Object)objectArray4, (long)-230994287168313642L, (long)l17);
                            try {
                                if (callSite != null) break block30;
                                if (object2 != null) {
                                }
                                break block31;
                            }
                            catch (IOException iOException) {
                                throw m44.a("m", (Object)iOException, (long)-270042112595108287L, (long)l17);
                            }
                            object4 = new gs((Path)((sz)object).t(), l20, (s4)((Object)m44.a("s", (Object)this, (long)-2266896295778300651L, (long)l17)));
                            break block30;
                        }
                        throw new aj(n17, (char)n16, n15, (String)object5, (String)((Object)loq.a("c", (int)29301, (long)(0x10FC42C5410778C2L ^ l17))) + cf.a((String)object5) + (String)((Object)loq.a("c", (int)10072, (long)(0xC42BF739AACADE0L ^ l17))));
                    }
                    object3 = new ByteArrayInputStream((byte[])object2);
                    n10 = ((Object)object2).length;
                }
                catch (IOException iOException) {
                    throw new aj(n17, (char)n16, n15, (String)object5, (String)((Object)loq.a("c", (int)15473, (long)(0x785AA86ABB3BB6CEL ^ l17))) + cf.a((String)object5) + (String)((Object)loq.a("c", (int)17889, (long)(0x381C7A3541FCCF57L ^ l17))));
                }
            }
            throw new aj(n17, (char)n16, n15, (String)object5, (String)((Object)loq.a("c", (int)15473, (long)(0x785AA86ABB3BB6CEL ^ l17))) + cf.a((String)object5) + (String)((Object)loq.a("c", (int)32559, (long)(0x778B1EA425BBF59CL ^ l17))));
        }
        object2 = new lb6(0);
        try {
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = object2;
            objectArray5[0] = l14;
            object3 = m44.a("r", (Object)object4, (Object)objectArray5, (long)-458242266907583951L, (long)l17);
            n10 = ((lb6)object2).U(l13);
        }
        catch (IOException iOException) {
            throw new aj(n17, (char)n16, n15, (String)object5, "'" + (String)object5 + (String)((Object)loq.a("c", (int)18489, (long)(0xAA2C7BA1989C285L ^ l17))) + iOException + "'");
        }
        try {
            block33: {
                block34: {
                    Object object6;
                    block35: {
                        CallSite callSite2;
                        block32: {
                            try {
                                callSite2 = object3;
                                if (callSite != null) break block32;
                                if (callSite2 == null) break block33;
                            }
                            catch (IOException iOException) {
                                throw m44.a("m", (Object)iOException, (long)-270042112595108287L, (long)l17);
                            }
                            callSite2 = object3;
                        }
                        Object[] objectArray6 = new Object[3];
                        objectArray6[2] = n10;
                        objectArray6[1] = callSite2;
                        objectArray6[0] = l12;
                        object2 = m44.a("m", (Object)objectArray6, (long)-512367747464306309L, (long)l17);
                        object = new StringWriter();
                        PrintWriter printWriter = new PrintWriter((Writer)object);
                        StringWriter stringWriter = new StringWriter();
                        PrintWriter printWriter2 = new PrintWriter(stringWriter);
                        f8 f82 = new f8(4, 3, 5, 5, n14, n13, (char)n12, false);
                        try {
                            _f2 = new _f((h1)object2, l10, (gs)object4, (sz)((Object)m44.a("s", (Object)this, (long)-559647290384076442L, (long)l17)), (byte)n11, (tt)((Object)m44.a("s", (Object)this, (long)-286844349247544028L, (long)l17)), printWriter, printWriter2, f82);
                        }
                        catch (un un2) {
                            throw new a7((String)((Object)m44.a("r", (Object)un2, (long)-1779657703589954985L, (long)l17)));
                        }
                        try {
                            if (l17 < 0L) break block34;
                            object6 = object5;
                            if (callSite != null) break block34;
                            if (((String)object6).equals(_f2.h(l15))) break block35;
                        }
                        catch (IOException iOException) {
                            throw m44.a("m", (Object)iOException, (long)-270042112595108287L, (long)l17);
                        }
                        String string = ((gs)object4).n();
                        String string2 = ((gs)object4).N(l11);
                        try {
                            if (string2 != null) {
                                Object[] objectArray7 = new Object[1];
                                objectArray7[0] = l16;
                                throw new a7((String)((Object)loq.a("c", (int)30129, (long)(0xFBD9BD20943FF15L ^ l17))) + string + (String)((Object)loq.a("c", (int)720, (long)(0x2296049AD591886DL ^ l17))) + string2 + (String)((Object)loq.a("c", (int)4684, (long)(0x21B3258EBAAA98FCL ^ l17))) + (String)((Object)m44.a("r", (Object)_f2, (Object)objectArray7, (long)-1815286009519091467L, (long)l17)) + (String)((Object)loq.a("c", (int)815, (long)(0x5E110CADAEE8991L ^ l17))) + cf.a((String)object5) + (String)((Object)loq.a("c", (int)17121, (long)(0x40F30EDA09CF4854L ^ l17))));
                            }
                        }
                        catch (IOException iOException) {
                            throw m44.a("m", (Object)iOException, (long)-270042112595108287L, (long)l17);
                        }
                        Object[] objectArray8 = new Object[1];
                        objectArray8[0] = l16;
                        throw new a7((String)((Object)loq.a("c", (int)29732, (long)(0x63CAE42F911FE9DL ^ l17))) + string + (String)((Object)loq.a("c", (int)1791, (long)(0x5648FCD380D90C45L ^ l17))) + (String)((Object)m44.a("r", (Object)_f2, (Object)objectArray8, (long)-1815286009519091467L, (long)l17)) + (String)((Object)loq.a("c", (int)22770, (long)(0x1D171EE837F75249L ^ l17))) + cf.a((String)object5) + (String)((Object)loq.a("c", (int)22755, (long)(0x64DAB093BEC3D244L ^ l17))));
                    }
                    object6 = ((HashMap)((Object)m44.a("s", (Object)this, (long)-43902967452020117L, (long)l17))).put(object5, _f2);
                }
                return _f2;
            }
            throw new a7((String)((Object)loq.a("c", (int)15473, (long)(0x785AA86ABB3BB6CEL ^ l17))) + cf.a((String)object5) + (String)((Object)loq.a("c", (int)18385, (long)(0xD3D52BD84CD4D65L ^ l17))));
        }
        catch (IOException iOException) {
            throw new a7("'" + cf.a((String)object5) + (String)((Object)loq.a("c", (int)32027, (long)(0x14911E1B818177A9L ^ l17))) + iOException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                loq.a = prr.a(6527016304535576088L, 3441062455367043226L, MethodHandles.lookup().lookupClass()).a(18494297683574L);
                var9 = loq.a ^ 128865006714897L;
                loq.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[19];
                var5_4 = 0;
                var4_5 = "Gm\u00ec\u00d0\u0016!\u00a3\u00f37\u00fd4\u00af\u00d2\u00b5\u00e2\u00af\u00f7\u00e74E\u00f4\u00df3\u008b\u00cfE\u00bbh\u0084\u0010\u00f8\u00f6&\u0014\u0086W^\u008d\u0000\u00c4\u00da\u00f1\u00d9\u008av\u00feQ|\u00ae\u009d-\u00e8*\u0014\u000b\u001d\u00df\u001f\n\u00f0\u00c5\u00b1\u001c\u00d1\u00b1\u00bd\n&O)^\u00ab\u00e7Yn\u00cd\u00a8\u009d\u00d7\u00c6\u00afS9\u00b1\u001b\u00a2\u00f3\u0095\u0010|\u00e7|_\u0003\u00eb\u00d4\u00dd3\u00a9SWh\u00d1\u00e2jh\u00de\u00fa\u0018\u00ca\u00c5\u00d8\u00154\u00ba\u009e0\u00aa/\u00c3\u00d7\u00f9\u0095\u001b.\u00ab\u00b1\u0091\u00f0s\u00bb\u00bas\u00f3E\u00c1\u00d5\u001cow\u00b9\u00a3\u00ee\u001dl5b\u0099\u0094C\u0090\u00f1\u009f{\u0019\u00f1g\u0094j#\u00a2\u00e8\u00fc/\u00bb\u00e8\u00a5O=\u00fd5\u00e9\u009e\u00d7~\u0017\u0090m\u00c3\u00b7sj\u0087\u00a3\u00c6\u001d\u00c8{\u00f6\u00109\u0018\u00a9\u00a8\u0006\u00ef?\r\u0005\u00eeA6K[C\u00d3\u00ff\u00f7\u009d\u00ec\u0018\u00e4\u0017\u008f\u00a9\u00ac1[g\u00e2\u00cfx\u00e7\u00edb\u00a3\u0095\u00b9Ya\u00e4\u00ad\u00bd\u0094\u009c('\u00dar\u00ad\u00c1\u00a5de\u0098\u00df\u001f\u00cb8 \u00c3\u0012\u0012\u00fd\u00a1\u00fa\u0002\u0080M`\u009f\u00be\u00ed\u008aC]*.3\u000fD\u00ef%\u00eaj\u00f6h\u001d\u008b\u00b4$\u00d2\u00cc\u00bd\u00d2w\u0015\u00012\u00b5Yz\u00da\u0006yB\u00cb\u0088\u009a\u00ee\\P\u00a4,\u0082(%\u00dd2\u0006\u00bd_\u00e6^V\u00b2\u00de\u00d9\u00bf\u0005\u009a\u0002&\u00e5)\u00ae6\u00e1\u00da\u00b4\u0097\u00c6w\u00d0\u00adP\u00a5\u00d95\u00a1a\u00a0q\u001dBVT\u001b\u00b81\u0087[\u009c\u007f` \tH\u00c0\tC\u00ca\u00e0\u0086\u00cb\u00a5\u0016\u0088\\\u0092N\u0084Q\u00ee0\u00cc\f0d\u00eaf(\u00ea\u00cf\u00d6\u0087\u00ae\u00b0q\u00f6\u001c[\u00bc\u00aeg\u0007\u001e\u00e4\u00feh(\u0099\u00ee\u0000$J\u00db\u00b9\u00a9#^\u00dc\u000f#\u0080\u00b1Q\u00aa\u00d0\u00b9\u00e5;(\u00cfpb\u000b5\u00bf\u00cc\u000e8DD\u008fG\u0001\u0001\u00c7\u00f9E\u009fb\u00eb\u00b3J\u00c6N<\u00fft.'\u00b4=\u008cX\u00c1\u0010\u00c0\u00ca\u0093\u001b\u0018\u00e0t,\u00c6F[\u00e0;\u00ef>\u0006\u00a7\u00bdT\u000e\u0082B \u00b3\u0094Rlj=\u0010\u00b9_\u00d4\u00bd\u0003\u0091\u00cc\u00a9K\u001b\u00f5\u0013\u0003\u000f\u0000N(\u00eb\u00f0\u0088\u00d4g\u0017\u001a\u00bf\u00b6H\u00ebV\u00f6Z\u00de\u00d5\u008b\u00be\u0013\u00fb&\r\u00a5\u00b6\u0011\u00f3\u0096!\u00ba\u00e4J`S\u00d6\u0086\u00e0H/\u00bf\u0087\u0010@t\u00e9\u00b2+\u00f3\u0085vhmAuL\u0098as(\u0095\u0093\u00f9\u00e8\u00e0\u00be!\u008b\u000b\u00b8\u009d4\u000eyH\u00c9\u0016q\u00b9z[\u00e3\u00aa\u00ce\u001b\u0082\u00bf\u008ch+\u00b9K&2Y\u00bc\u00ab\u00bc\u00b5\u0006\u0018<6\u00d2eQ\u00e9\u001e\u0089qf\u00d9\u00d7\u00b4\u00e6\u00f4Q\b5\u0017\n\u00f1~\u00a6Xh\u00c5\u00f1\u00c3\u00d2(\u00e4\u0090'\u009b|5\u00d8\u00b1\u00d5J\u00c3,\u00f1\u0000(*f\b\u00c5\u00ff\u00cfv\u0081qU\u0099\u00862P]0\u00d3\u00f8u\u009e\u00f4\u00dd[\u00b1\u00c4\u00b4\u00c6\u00fe@)\u0095D\u00ef\u0085\u00ac\u0092\u00de\u0095<J2wXvv\u00b65\u00ce\u00d4l\u0001\u00b7\u00ad\u0015,L\u00e3\u00e1\u00db/\u00ccZ\u009a2\u00e8\u009ak\u0010\u00d0\u00d2\u008f\u00d3\u00e0~\u00d6\u001c\u00bb\u00d4\u00eb;=@\u009bQ\u0010\u00b1s(\u00f0H\u00f8K\u0082\u00cd\u00c3iCF$\u00985(\u0088\u0004%Y\u00ccz\u00f5\u00db\u00e8\u00c2\u00bb\u00c2\u001a\u0082\u000f\u007fK\u00b5\u00a8i!\u00f6\n\u00ecN[\u0087\u00a6;\u00c2a\u00e3h\u00b8Q\u00d8\u00f6\u00e4\u00b8@";
                var6_6 = "Gm\u00ec\u00d0\u0016!\u00a3\u00f37\u00fd4\u00af\u00d2\u00b5\u00e2\u00af\u00f7\u00e74E\u00f4\u00df3\u008b\u00cfE\u00bbh\u0084\u0010\u00f8\u00f6&\u0014\u0086W^\u008d\u0000\u00c4\u00da\u00f1\u00d9\u008av\u00feQ|\u00ae\u009d-\u00e8*\u0014\u000b\u001d\u00df\u001f\n\u00f0\u00c5\u00b1\u001c\u00d1\u00b1\u00bd\n&O)^\u00ab\u00e7Yn\u00cd\u00a8\u009d\u00d7\u00c6\u00afS9\u00b1\u001b\u00a2\u00f3\u0095\u0010|\u00e7|_\u0003\u00eb\u00d4\u00dd3\u00a9SWh\u00d1\u00e2jh\u00de\u00fa\u0018\u00ca\u00c5\u00d8\u00154\u00ba\u009e0\u00aa/\u00c3\u00d7\u00f9\u0095\u001b.\u00ab\u00b1\u0091\u00f0s\u00bb\u00bas\u00f3E\u00c1\u00d5\u001cow\u00b9\u00a3\u00ee\u001dl5b\u0099\u0094C\u0090\u00f1\u009f{\u0019\u00f1g\u0094j#\u00a2\u00e8\u00fc/\u00bb\u00e8\u00a5O=\u00fd5\u00e9\u009e\u00d7~\u0017\u0090m\u00c3\u00b7sj\u0087\u00a3\u00c6\u001d\u00c8{\u00f6\u00109\u0018\u00a9\u00a8\u0006\u00ef?\r\u0005\u00eeA6K[C\u00d3\u00ff\u00f7\u009d\u00ec\u0018\u00e4\u0017\u008f\u00a9\u00ac1[g\u00e2\u00cfx\u00e7\u00edb\u00a3\u0095\u00b9Ya\u00e4\u00ad\u00bd\u0094\u009c('\u00dar\u00ad\u00c1\u00a5de\u0098\u00df\u001f\u00cb8 \u00c3\u0012\u0012\u00fd\u00a1\u00fa\u0002\u0080M`\u009f\u00be\u00ed\u008aC]*.3\u000fD\u00ef%\u00eaj\u00f6h\u001d\u008b\u00b4$\u00d2\u00cc\u00bd\u00d2w\u0015\u00012\u00b5Yz\u00da\u0006yB\u00cb\u0088\u009a\u00ee\\P\u00a4,\u0082(%\u00dd2\u0006\u00bd_\u00e6^V\u00b2\u00de\u00d9\u00bf\u0005\u009a\u0002&\u00e5)\u00ae6\u00e1\u00da\u00b4\u0097\u00c6w\u00d0\u00adP\u00a5\u00d95\u00a1a\u00a0q\u001dBVT\u001b\u00b81\u0087[\u009c\u007f` \tH\u00c0\tC\u00ca\u00e0\u0086\u00cb\u00a5\u0016\u0088\\\u0092N\u0084Q\u00ee0\u00cc\f0d\u00eaf(\u00ea\u00cf\u00d6\u0087\u00ae\u00b0q\u00f6\u001c[\u00bc\u00aeg\u0007\u001e\u00e4\u00feh(\u0099\u00ee\u0000$J\u00db\u00b9\u00a9#^\u00dc\u000f#\u0080\u00b1Q\u00aa\u00d0\u00b9\u00e5;(\u00cfpb\u000b5\u00bf\u00cc\u000e8DD\u008fG\u0001\u0001\u00c7\u00f9E\u009fb\u00eb\u00b3J\u00c6N<\u00fft.'\u00b4=\u008cX\u00c1\u0010\u00c0\u00ca\u0093\u001b\u0018\u00e0t,\u00c6F[\u00e0;\u00ef>\u0006\u00a7\u00bdT\u000e\u0082B \u00b3\u0094Rlj=\u0010\u00b9_\u00d4\u00bd\u0003\u0091\u00cc\u00a9K\u001b\u00f5\u0013\u0003\u000f\u0000N(\u00eb\u00f0\u0088\u00d4g\u0017\u001a\u00bf\u00b6H\u00ebV\u00f6Z\u00de\u00d5\u008b\u00be\u0013\u00fb&\r\u00a5\u00b6\u0011\u00f3\u0096!\u00ba\u00e4J`S\u00d6\u0086\u00e0H/\u00bf\u0087\u0010@t\u00e9\u00b2+\u00f3\u0085vhmAuL\u0098as(\u0095\u0093\u00f9\u00e8\u00e0\u00be!\u008b\u000b\u00b8\u009d4\u000eyH\u00c9\u0016q\u00b9z[\u00e3\u00aa\u00ce\u001b\u0082\u00bf\u008ch+\u00b9K&2Y\u00bc\u00ab\u00bc\u00b5\u0006\u0018<6\u00d2eQ\u00e9\u001e\u0089qf\u00d9\u00d7\u00b4\u00e6\u00f4Q\b5\u0017\n\u00f1~\u00a6Xh\u00c5\u00f1\u00c3\u00d2(\u00e4\u0090'\u009b|5\u00d8\u00b1\u00d5J\u00c3,\u00f1\u0000(*f\b\u00c5\u00ff\u00cfv\u0081qU\u0099\u00862P]0\u00d3\u00f8u\u009e\u00f4\u00dd[\u00b1\u00c4\u00b4\u00c6\u00fe@)\u0095D\u00ef\u0085\u00ac\u0092\u00de\u0095<J2wXvv\u00b65\u00ce\u00d4l\u0001\u00b7\u00ad\u0015,L\u00e3\u00e1\u00db/\u00ccZ\u009a2\u00e8\u009ak\u0010\u00d0\u00d2\u008f\u00d3\u00e0~\u00d6\u001c\u00bb\u00d4\u00eb;=@\u009bQ\u0010\u00b1s(\u00f0H\u00f8K\u0082\u00cd\u00c3iCF$\u00985(\u0088\u0004%Y\u00ccz\u00f5\u00db\u00e8\u00c2\u00bb\u00c2\u001a\u0082\u000f\u007fK\u00b5\u00a8i!\u00f6\n\u00ecN[\u0087\u00a6;\u00c2a\u00e3h\u00b8Q\u00d8\u00f6\u00e4\u00b8@".length();
                var3_7 = 88;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = loq.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00b7n\u00c4\u00d11\u001e\u00ac\u00e5\u00e3\"E5\u000f\u00a9\u00de\t\u00de\u00ae\u001cm\u00eadn\u00c8\u0010\u0013\u00ebM\u008c\u0018\u00e1M\u001d\u0004\u000erJ\u00a6y\u0002\u00ed";
                    var6_6 = "\u00b7n\u00c4\u00d11\u001e\u00ac\u00e5\u00e3\"E5\u000f\u00a9\u00de\t\u00de\u00ae\u001cm\u00eadn\u00c8\u0010\u0013\u00ebM\u008c\u0018\u00e1M\u001d\u0004\u000erJ\u00a6y\u0002\u00ed".length();
                    var3_7 = 24;
                    var2_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = loq.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        loq.b = var7_3;
        loq.c = new String[19];
        loq.r = m44.a("l", (long)6967447129996763365L, (long)var9);
        loq.Y = m44.a("l", (long)8651855483423082365L, (long)var9);
    }

    public loq(s4 s42, long l10, boolean bl2) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x44DB9AB900D7L;
        int n10 = (int)(l12 >>> 32);
        int n11 = (int)(l12 << 32 >>> 48);
        int n12 = (int)(l12 << 48 >>> 48);
        long l13 = l11 ^ 0xE62390339CEL;
        int n13 = (int)(l13 >>> 48);
        int n14 = (int)(l13 << 16 >>> 32);
        int n15 = (int)(l13 << 48 >>> 48);
        long l14 = l11 ^ 0x7B45B04C0190L;
        long l15 = l11 ^ 0x3462F54D5B6L;
        long l16 = l11 ^ 0x251604009742L;
        int n16 = (int)(l16 >>> 32);
        int n17 = (int)(l16 << 32 >>> 48);
        int n18 = (int)(l16 << 48 >>> 48);
        m44.a("p", (Object)this, (tt)new tt((short)n13, n14, (char)n15), (long)-8219769127891118899L, (long)l10);
        m44.a("p", (Object)this, (sz)new sz(n10, (short)n11, (char)n12), (long)-8515509938872401777L, (long)l10);
        m44.a("p", (Object)this, (ol)new ol(n16, (short)n17, (short)n18), (long)-8422478015650421924L, (long)l10);
        m44.a("p", (Object)this, (ol)new ol(n16, (short)n17, (short)n18), (long)-7624847469514528015L, (long)l10);
        m44.a("p", (Object)this, (s4)s42, (long)-7970471087007187716L, (long)l10);
        this.L = bl2;
        Object[] objectArray = new Object[2];
        objectArray[1] = l15;
        objectArray[0] = this;
        m44.a("s", (Object)m44.a("r", (Object)this, (long)-7970471087007187716L, (long)l10), (Object)objectArray, (long)-8197266685046416067L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l14;
        m44.a("m", (Object)this, (Object)objectArray2, (long)-7636501820472778318L, (long)l10);
    }

    @Override
    public void x(m m10, Object object, Object object2, Object object3, long l10) {
        long l11 = l10 ^ 0x30B2D110B100L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("m", (Object)this, (Object)objectArray, (long)2780403199277011234L, (long)l10);
    }

    private void n(Object[] objectArray) {
        loq loq2;
        long l10;
        long l11;
        block4: {
            long l12;
            long l13;
            block5: {
                l11 = (Long)objectArray[0];
                long l14 = l11 = a ^ l11;
                l13 = l14 ^ 0x42230BBDF844L;
                l10 = l14 ^ 0x3910B39D1A0FL;
                l12 = l14 ^ 0x446761197E23L;
                long l15 = l14 ^ 0x31F64FA1434EL;
                int n10 = (int)(l15 >>> 32);
                int n11 = (int)(l15 << 32 >>> 48);
                int n12 = (int)(l15 << 48 >>> 48);
                CallSite callSite = m44.a("j", (long)-413367236410566129L, (long)l11);
                try {
                    try {
                        loq2 = this;
                        if (callSite != null) break block4;
                        if (m44.a("t", (Object)loq2, (long)-2022010995360201578L, (long)l11) == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-103711874574754674L, (long)l11);
                    }
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = (int)((char)n12);
                    objectArray2[1] = n11;
                    objectArray2[0] = n10;
                    m44.a("u", (Object)m44.a("t", (Object)this, (long)-2022010995360201578L, (long)l11), (Object)objectArray2, (long)-2026095131213882901L, (long)l11);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-103711874574754674L, (long)l11);
                }
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l12;
            m44.a("v", (Object)this, (_g)new _g((String)((Object)m44.a("u", (Object)m44.a("t", (Object)this, (long)-2142225318535475238L, (long)l11), (Object)objectArray3, (long)-80555586100164722L, (long)l11)), l13, (boolean)m44.a("t", (Object)this, (long)-2254886820433580649L, (long)l11)), (long)-2022010995360201578L, (long)l11);
            loq2 = this;
        }
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l10;
        m44.a("v", (Object)loq2, (HashMap)((Object)m44.a("j", (Object)objectArray4, (long)-113789611797407095L, (long)l11)), (long)-168019929335082844L, (long)l11);
    }

    public void U(Object[] objectArray) {
        block18: {
            CallSite callSite;
            long l10;
            long l11;
            block17: {
                loq loq2;
                CallSite callSite2;
                block15: {
                    block16: {
                        int n10;
                        int n11;
                        int n12;
                        block12: {
                            loq loq3;
                            long l12;
                            long l13;
                            long l14;
                            block13: {
                                long l15;
                                block14: {
                                    l11 = (Long)objectArray[0];
                                    long l16 = l11 = a ^ l11;
                                    l10 = l16 ^ 0x6D0B4DC0482DL;
                                    l14 = l16 ^ 0x7410503B816L;
                                    l15 = l16 ^ 0x615555CF0FB4L;
                                    long l17 = l16 ^ 0x809613BD6FCL;
                                    n12 = (int)(l17 >>> 32);
                                    n11 = (int)(l17 << 32 >>> 48);
                                    n10 = (int)(l17 << 48 >>> 48);
                                    callSite2 = m44.a("h", (long)8066322207156735933L, (long)l11);
                                    try {
                                        try {
                                            loq2 = this;
                                            if (callSite2 != null) break block12;
                                            l13 = 7501074193649321238L;
                                            l12 = l11;
                                            if (l11 < 0L) break block13;
                                            if (m44.a("v", (Object)loq2, (long)l13, (long)l12) == null) break block14;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("h", (Object)n92, (long)7727529787687815484L, (long)l11);
                                        }
                                        m44.a("w", (Object)m44.a("v", (Object)this, (long)7501074193649321238L, (long)l11), (long)8507253878432395434L, (long)l11);
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("h", (Object)n93, (long)7727529787687815484L, (long)l11);
                                    }
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l15;
                                m44.a("w", (Object)m44.a("v", (Object)this, (long)7892869010402198984L, (long)l11), (Object)objectArray2, (long)7608363286055723008L, (long)l11);
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l15;
                                m44.a("w", (Object)m44.a("v", (Object)this, (long)8123187277815090277L, (long)l11), (Object)objectArray3, (long)7608363286055723008L, (long)l11);
                                loq3 = this;
                                l13 = 7744434145274311257L;
                                l12 = l11;
                            }
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l14;
                            m44.a("w", (Object)m44.a("v", (Object)loq3, (long)l13, (long)l12), (Object)objectArray4, (long)7648247159277360020L, (long)l11);
                            loq2 = this;
                        }
                        try {
                            try {
                                if (l11 <= 0L || callSite2 != null) break block15;
                                if (m44.a("v", (Object)loq2, (long)8521485910117028132L, (long)l11) == null) break block16;
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)n94, (long)7727529787687815484L, (long)l11);
                            }
                            Object[] objectArray5 = new Object[3];
                            objectArray5[2] = (int)((char)n10);
                            objectArray5[1] = n11;
                            objectArray5[0] = n12;
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)8521485910117028132L, (long)l11), (Object)objectArray5, (long)8526410072828644441L, (long)l11);
                        }
                        catch (n9 n95) {
                            throw m44.a("h", (Object)n95, (long)7727529787687815484L, (long)l11);
                        }
                    }
                    loq2 = this;
                }
                try {
                    try {
                        callSite = m44.a("v", (Object)loq2, (long)8644501786780162664L, (long)l11);
                        if (callSite2 != null) break block17;
                        if (callSite == null) break block18;
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)n96, (long)7727529787687815484L, (long)l11);
                    }
                    callSite = m44.a("v", (Object)this, (long)8644501786780162664L, (long)l11);
                }
                catch (n9 n97) {
                    throw m44.a("h", (Object)n97, (long)7727529787687815484L, (long)l11);
                }
            }
            Object[] objectArray6 = new Object[1];
            objectArray6[0] = l10;
            m44.a("w", (Object)callSite, (Object)objectArray6, (long)8182422786081818495L, (long)l11);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7934;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/loq", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            loq.c[n11] = loq.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = loq.a(n10, l10);
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
            throw new RuntimeException("com/zelix/loq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(loq.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

