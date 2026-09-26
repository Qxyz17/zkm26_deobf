/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cn;
import com.zelix.gs;
import com.zelix.lk0;
import com.zelix.lq0;
import com.zelix.lqw;
import com.zelix.m44;
import com.zelix.nn;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.yf;
import com.zelix.yu;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class _g {
    private static final String E;
    private Set W;
    public static char u;
    private String L;
    private Map F;
    private static final String[] b;
    private static final String c;
    private List j;
    private Set P;
    private Map p;
    private static final char t;
    private static Object X;
    private boolean v;
    public static String q;
    private static final long a;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    /*
     * Unable to fully structure code
     */
    public static boolean d(Object[] var0) {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var2_1 = (String)var0[0];
                        var1_2 = (String)var0[1];
                        var3_3 = (Long)var0[2];
                        var5_4 = (var3_3 = _g.a ^ var3_3) ^ 17959337427120L;
                        var9_5 = null;
                        var7_6 = m44.a("n", (long)1391692451959278950L, (long)var3_3);
                        var10_7 = new File(var2_1);
                        try {
                            var9_5 = new yu(var10_7);
                        }
                        catch (IOException var11_8) {
                            block20: {
                                try {
                                    if (var3_3 < 0L) break block20;
                                    v0 = var9_5;
                                    if (var7_6 == null) {
                                        if (v0 == null) break block20;
                                    }
                                    ** GOTO lbl25
                                }
                                catch (IOException v1) {
                                    throw m44.a("n", (Object)v1, (long)639221913821002971L, (long)var3_3);
                                }
                                try {
                                    v0 = var9_5;
lbl25:
                                    // 2 sources

                                    m44.a("q", (Object)v0, (long)695289445181457410L, (long)var3_3);
                                }
                                catch (IOException var12_10) {
                                    // empty catch block
                                }
                            }
                            return false;
                        }
                        v2 = new Object[3];
                        v2[2] = false;
                        v2[1] = var5_4;
                        v2[0] = var1_2;
                        var11_9 = m44.a("n", (Object)v2, (long)1199637985798214044L, (long)var3_3);
                        var12_11 = m44.a("q", (Object)var9_5, (Object)var11_9, (long)1511431058869204466L, (long)var3_3);
                        try {
                            v3 = var12_11;
                            if (var3_3 < 0L || var7_6 != null) break block21;
                            if (v3 != null) {
                            }
                            ** GOTO lbl59
                        }
                        catch (IOException v4) {
                            throw m44.a("n", (Object)v4, (long)639221913821002971L, (long)var3_3);
                        }
                        v3 = var12_11;
                    }
                    try {
                        v5 = v3.isDirectory();
                        if (var7_6 != null) break block22;
                        if (!v5) {
                        }
                        ** GOTO lbl59
                    }
                    catch (IOException v6) {
                        throw m44.a("n", (Object)v6, (long)639221913821002971L, (long)var3_3);
                    }
                    var8_12 = true;
                    try {
                        if (var3_3 < 0L || var7_6 == null) break block23;
lbl59:
                        // 3 sources

                        v5 = false;
                    }
                    catch (IOException v7) {
                        throw m44.a("n", (Object)v7, (long)639221913821002971L, (long)var3_3);
                    }
                }
                var8_12 = v5;
            }
            try {
                if (var3_3 < 0L) break block24;
                v8 = var9_5;
                if (var7_6 == null) {
                    if (v8 == null) break block24;
                }
                ** GOTO lbl77
            }
            catch (IOException v9) {
                throw m44.a("n", (Object)v9, (long)639221913821002971L, (long)var3_3);
            }
            try {
                v8 = var9_5;
lbl77:
                // 2 sources

                m44.a("q", (Object)v8, (long)695289445181457410L, (long)var3_3);
            }
            catch (IOException var13_13) {
                // empty catch block
            }
        }
        return var8_12;
    }

    private static boolean a(Object[] objectArray) {
        Object object;
        block2: {
            Set set;
            Object object2;
            block3: {
                long l10 = (Long)objectArray[0];
                object2 = (String)objectArray[1];
                set = (Set)objectArray[2];
                l10 = a ^ l10;
                CallSite callSite = m44.a("o", (long)-2332583000457821801L, (long)l10);
                try {
                    object = m44.a("k", (long)-4280060993054107818L, (long)l10);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (nn nn2) {
                    throw m44.a("o", (Object)nn2, (long)-4310032777030733782L, (long)l10);
                }
                object2 = m44.a("p", (Object)object2, (long)-2392807941848845912L, (long)l10);
            }
            object = set.add(object2);
        }
        return (boolean)object;
    }

    private gs X(Object[] objectArray) {
        block8: {
            CallSite callSite;
            File file;
            long l10;
            long l11;
            block7: {
                File file2 = (File)objectArray[0];
                String string = (String)objectArray[1];
                l11 = (Long)objectArray[2];
                long l12 = l11 = a ^ l11;
                l10 = l12 ^ 0x7760F1D01EE5L;
                long l13 = l12 ^ 0x22DD763AB2C8L;
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = true;
                objectArray2[1] = l13;
                objectArray2[0] = string;
                String string2 = (String)((Object)m44.a("q", (Object)file2, (long)4426327966195302422L, (long)l11)) + (String)((Object)m44.a("j", (long)2552586500272881810L, (long)l11)) + (String)((Object)m44.a("n", (Object)objectArray2, (long)2512387283970581476L, (long)l11));
                CallSite callSite2 = m44.a("n", (long)2389294160801120030L, (long)l11);
                file = new File(string2);
                try {
                    try {
                        callSite = m44.a("q", (Object)file, (long)4403068771466033346L, (long)l11);
                        if (callSite2 != null) break block7;
                        if (callSite == false) break block8;
                    }
                    catch (nn nn2) {
                        throw m44.a("n", (Object)nn2, (long)4226287924261752483L, (long)l11);
                    }
                    callSite = m44.a("q", (Object)file, (long)2318897770638863188L, (long)l11);
                }
                catch (nn nn3) {
                    throw m44.a("n", (Object)nn3, (long)4226287924261752483L, (long)l11);
                }
            }
            try {
                if (callSite == false) {
                    return new gs(l10, file);
                }
            }
            catch (nn nn4) {
                throw m44.a("n", (Object)nn4, (long)4226287924261752483L, (long)l11);
            }
        }
        return null;
    }

    public static List o(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        Set set = (Set)objectArray[2];
        File file = (File)objectArray[3];
        yf yf2 = (yf)objectArray[4];
        long l11 = (l10 = a ^ l10) ^ 0x51937F55466BL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = yf2;
        objectArray2[4] = file;
        objectArray2[3] = l11;
        objectArray2[2] = null;
        objectArray2[1] = set;
        objectArray2[0] = string;
        return m44.a("h", (Object)objectArray2, (long)4110062307730763355L, (long)l10);
    }

    private void c(Object[] objectArray) {
        Object object;
        _g _g2;
        long l10;
        block3: {
            long l11;
            block2: {
                l10 = (Long)objectArray[0];
                String string = (String)objectArray[1];
                yf yf2 = (yf)objectArray[2];
                long l12 = l10 = a ^ l10;
                l11 = l12 ^ 0x6044AD7B8ADFL;
                long l13 = l12 ^ 0x6CC6CDBC12B1L;
                try {
                    m44.a("v", (Object)this, (String)string, (long)8478362641204847823L, (long)l10);
                    m44.a("v", (Object)this, new LinkedHashSet(), (long)8634379146828097227L, (long)l10);
                    Object[] objectArray2 = new Object[6];
                    objectArray2[5] = yf2;
                    objectArray2[4] = null;
                    objectArray2[3] = l13;
                    objectArray2[2] = m44.a("t", (Object)this, (long)7919363715938990749L, (long)l10);
                    objectArray2[1] = m44.a("t", (Object)this, (long)8634379146828097227L, (long)l10);
                    objectArray2[0] = string;
                    m44.a("v", (Object)this, (List)((Object)m44.a("j", (Object)objectArray2, (long)7913918220659784321L, (long)l10)), (long)7874671987653219434L, (long)l10);
                    _g2 = this;
                    if (m44.a("n", (long)7507200335988672121L, (long)l10) == false) break block2;
                    object = new ConcurrentHashMap();
                    break block3;
                }
                catch (nn nn2) {
                    throw m44.a("j", (Object)nn2, (long)8381969076643381335L, (long)l10);
                }
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l11;
            object = m44.a("j", (Object)objectArray3, (long)7979223672106322521L, (long)l10);
        }
        m44.a("v", (Object)_g2, object, (long)7717973169842561250L, (long)l10);
    }

    private gs N(Object[] objectArray) {
        block23: {
            CallSite callSite;
            int n10;
            long l10;
            ZipFile zipFile;
            block25: {
                CallSite callSite2;
                long l11;
                long l12;
                Object[] objectArray2;
                Object object;
                long l13;
                long l14;
                long l15;
                block24: {
                    CallSite callSite3;
                    long l16;
                    block22: {
                        CallSite callSite4;
                        block17: {
                            block18: {
                                l15 = (Long)objectArray[0];
                                zipFile = (ZipFile)objectArray[1];
                                String string = (String)objectArray[2];
                                long l17 = l15 = a ^ l15;
                                long l18 = l17 ^ 0x2437BAFDFDF1L;
                                l10 = l18 >>> 8;
                                n10 = (int)(l18 << 56 >>> 56);
                                l14 = l17 ^ 0x34F0B6E16BF1L;
                                l13 = l17 ^ 0x725B03441228L;
                                long l19 = l17 ^ 0x37133DFD280AL;
                                l16 = l17 ^ 0x1E3ECD647BE1L;
                                Object[] objectArray3 = new Object[3];
                                objectArray3[2] = false;
                                objectArray3[1] = l19;
                                objectArray3[0] = string;
                                CallSite callSite5 = m44.a("l", (Object)objectArray3, (long)-5179175708718401242L, (long)l15);
                                callSite4 = m44.a("l", (long)-4905986046158658084L, (long)l15);
                                callSite = m44.a("s", (Object)zipFile, (Object)callSite5, (long)-4880906061865509560L, (long)l15);
                                try {
                                    callSite3 = callSite;
                                    if (callSite4 != null) break block17;
                                    if (callSite3 != null) break block18;
                                }
                                catch (nn nn2) {
                                    throw m44.a("l", (Object)nn2, (long)-6889135549007621023L, (long)l15);
                                }
                                object = m44.a("h", (long)-6356227393352230580L, (long)l15);
                                int n11 = ((CallSite)object).length;
                                int n12 = 0;
                                while (n12 < n11) {
                                    CallSite callSite6;
                                    block19: {
                                        block20: {
                                            Object object2 = object[n12];
                                            String string2 = (String)object2 + (String)((Object)callSite5);
                                            callSite = m44.a("s", (Object)zipFile, (Object)string2, (long)-4880906061865509560L, (long)l15);
                                            try {
                                                block21: {
                                                    try {
                                                        try {
                                                            try {
                                                                callSite6 = callSite4;
                                                                if (l15 < 0L) break block19;
                                                                if (callSite6 != null) break block20;
                                                                callSite3 = callSite;
                                                                if (callSite4 != null) break block17;
                                                            }
                                                            catch (nn nn3) {
                                                                throw m44.a("l", (Object)nn3, (long)-6889135549007621023L, (long)l15);
                                                            }
                                                            if (callSite3 == null) break block21;
                                                        }
                                                        catch (nn nn4) {
                                                            throw m44.a("l", (Object)nn4, (long)-6889135549007621023L, (long)l15);
                                                        }
                                                        if (callSite4 == null) break;
                                                    }
                                                    catch (nn nn5) {
                                                        throw m44.a("l", (Object)nn5, (long)-6889135549007621023L, (long)l15);
                                                    }
                                                }
                                                ++n12;
                                            }
                                            catch (nn nn6) {
                                                throw m44.a("l", (Object)nn6, (long)-6889135549007621023L, (long)l15);
                                            }
                                        }
                                        callSite6 = callSite4;
                                    }
                                    if (callSite6 == null) continue;
                                }
                            }
                            if (l15 <= 0L) break block23;
                            callSite3 = callSite;
                        }
                        try {
                            if (callSite4 != null) break block22;
                            if (callSite3 == null) break block23;
                        }
                        catch (nn nn7) {
                            throw m44.a("l", (Object)nn7, (long)-6889135549007621023L, (long)l15);
                        }
                        callSite3 = callSite;
                    }
                    if (((ZipEntry)((Object)callSite3)).isDirectory()) break block23;
                    object = new File((String)((Object)m44.a("s", (Object)zipFile, (long)-6874195808771929702L, (long)l15)));
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l16;
                    objectArray2 = objectArray4;
                    objectArray4[0] = object;
                    l12 = -5030113564456662387L;
                    l11 = l15;
                    if (l15 < 0L) break block24;
                    if (m44.a("l", (Object)objectArray2, (long)l12, (long)l11) == false) break block25;
                    Object[] objectArray5 = new Object[1];
                    objectArray2 = objectArray5;
                    objectArray5[0] = m44.a("s", (Object)zipFile, (long)-6874195808771929702L, (long)l15);
                    l12 = -6559895263777232909L;
                    l11 = l15;
                }
                if ((callSite2 = m44.a("l", (Object)objectArray2, (long)l12, (long)l11)) != null) {
                    lqw lqw2 = new lqw((String)((Object)m44.a("s", (Object)object, (long)-6363748884430890284L, (long)l15)), (long)m44.a("s", (Object)object, (long)-6483620548671114807L, (long)l15), (String)((Object)callSite2), l14);
                    return new gs(zipFile, (ZipEntry)((Object)callSite), l13, lqw2);
                }
            }
            return new gs(l10, zipFile, (byte)n10, (ZipEntry)((Object)callSite));
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gs F(Object[] var1_1) {
        block40: {
            block43: {
                block55: {
                    block45: {
                        block48: {
                            block49: {
                                block46: {
                                    block47: {
                                        block44: {
                                            block52: {
                                                block51: {
                                                    block42: {
                                                        block41: {
                                                            block39: {
                                                                var2_2 = (Long)var1_1[0];
                                                                var4_3 = (String)var1_1[1];
                                                                v0 = var2_2 = _g.a ^ var2_2;
                                                                var5_4 = v0 ^ 4915360161629L;
                                                                var7_5 = v0 ^ 71170790995293L;
                                                                var9_6 = v0 ^ 19474347214239L;
                                                                var11_7 = v0 ^ 68124537992292L;
                                                                var14_8 = m44.a("p", (Object)this.getClass().getProtectionDomain(), (long)2014613408607135745L, (long)var2_2);
                                                                var13_9 = m44.a("o", (long)1950446948309861671L, (long)var2_2);
                                                                try {
                                                                    v1 = var14_8;
                                                                    if (var13_9 != null) break block39;
                                                                    if (v1 == null) break block40;
                                                                }
                                                                catch (IOException v2) {
                                                                    throw m44.a("o", (Object)v2, (long)44984536543736986L, (long)var2_2);
                                                                }
                                                                v1 = var14_8;
                                                            }
                                                            var15_10 = m44.a("p", (Object)v1, (long)1763415620421922937L, (long)var2_2);
                                                            try {
                                                                v3 = var15_10;
                                                                if (var13_9 != null) break block41;
                                                                if (v3 == null) break block40;
                                                            }
                                                            catch (IOException v4) {
                                                                throw m44.a("o", (Object)v4, (long)44984536543736986L, (long)var2_2);
                                                            }
                                                            v3 = var15_10;
                                                        }
                                                        var16_11 = m44.a("p", (Object)v3, (long)2221244659961781564L, (long)var2_2);
                                                        v5 = new Object[2];
                                                        v5[1] = var7_5;
                                                        v5[0] = m44.a("p", (Object)var15_10, (long)2280523576235725657L, (long)var2_2);
                                                        var17_12 = m44.a("o", (Object)v5, (long)343538982434615576L, (long)var2_2);
                                                        try {
                                                            v6 /* !! */  = m44.a("p", (Object)var16_11, (Object)_g.a("q", (int)27248, (long)(6979877283821949743L ^ var2_2)), (long)2082540871052047354L, (long)var2_2);
                                                            v7 = var13_9;
                                                            if (var2_2 <= 0L) ** GOTO lbl85
                                                            if (v7 != null) break block42;
                                                            if (v6 /* !! */  != false) {
                                                            }
                                                            ** GOTO lbl76
                                                        }
                                                        catch (IOException v8) {
                                                            throw m44.a("o", (Object)v8, (long)44984536543736986L, (long)var2_2);
                                                        }
                                                        var18_13 = new File((String)var17_12);
                                                        if (var2_2 >= 0L && m44.a("p", (Object)var18_13, (long)514480127203017467L, (long)var2_2) != false) {
                                                            var19_14 = null;
                                                            if (m44.a("p", (Object)var18_13, (long)1880106023997002093L, (long)var2_2) != false) {
                                                                v9 = new Object[3];
                                                                v9[2] = var9_6;
                                                                v9[1] = var4_3;
                                                                v9[0] = var18_13;
                                                                var19_14 = m44.a("n", (Object)this, (Object)v9, (long)112360157418640146L, (long)var2_2);
                                                            } else {
                                                                var20_16 = null;
                                                                try {
                                                                    var20_16 = new yu(var18_13);
                                                                    v10 = new Object[3];
                                                                    v10[2] = var4_3;
                                                                    v10[1] = var20_16;
                                                                    v10[0] = var5_4;
                                                                    var19_14 = m44.a("n", (Object)this, (Object)v10, (long)464273607982075955L, (long)var2_2);
                                                                }
                                                                catch (IOException var21_19) {
                                                                    // empty catch block
                                                                }
                                                            }
                                                            return var19_14;
                                                        }
                                                        try {
                                                            block50: {
                                                                v11 = var13_9;
                                                                if (var2_2 > 0L) {
                                                                    if (v11 == null) break block40;
                                                                }
                                                                break block50;
lbl76:
                                                                // 2 sources

                                                                v11 = var16_11;
                                                            }
                                                            v6 /* !! */  = m44.a("p", (Object)v11, (Object)_g.a("q", (int)675, (long)(4971749039344417782L ^ var2_2)), (long)2082540871052047354L, (long)var2_2);
                                                        }
                                                        catch (IOException v12) {
                                                            throw m44.a("o", (Object)v12, (long)44984536543736986L, (long)var2_2);
                                                        }
                                                    }
                                                    v7 = var13_9;
lbl85:
                                                    // 2 sources

                                                    if (v7 != null) break block43;
                                                    if (v6 /* !! */  == false) ** GOTO lbl170
                                                    break block51;
                                                    catch (IOException v13) {
                                                        throw m44.a("o", (Object)v13, (long)44984536543736986L, (long)var2_2);
                                                    }
                                                }
                                                v14 = var17_12.substring(0, 5);
                                                if (var13_9 != null) break block44;
                                                break block52;
                                                catch (IOException v15) {
                                                    throw m44.a("o", (Object)v15, (long)44984536543736986L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                block53: {
                                                    if (m44.a("p", v14, (Object)_g.a("q", (int)28579, (long)(3179641550823495407L ^ var2_2)), (long)2082540871052047354L, (long)var2_2) == false) break block45;
                                                    break block53;
                                                    catch (IOException v16) {
                                                        throw m44.a("o", (Object)v16, (long)44984536543736986L, (long)var2_2);
                                                    }
                                                }
                                                v14 = var17_12.substring(5, var17_12.length());
                                            }
                                            catch (IOException v17) {
                                                throw m44.a("o", (Object)v17, (long)44984536543736986L, (long)var2_2);
                                            }
                                        }
                                        var19_15 = v14;
                                        var20_17 = var19_15.indexOf((int)_g.b("l", (int)30228, (long)(2041172887185074525L ^ var2_2)));
                                        try {
                                            v18 = var20_17;
                                            if (var13_9 != null) break block46;
                                            if (v18 <= 0) break block47;
                                        }
                                        catch (IOException v19) {
                                            throw m44.a("o", (Object)v19, (long)44984536543736986L, (long)var2_2);
                                        }
                                        v18 = 1;
                                        break block46;
                                    }
                                    v18 = 0;
                                }
                                lk0.t((boolean)v18, new String[]{m44.a("p", (Object)var15_10, (long)278725148340715608L, (long)var2_2)}, var11_7);
                                v20 = var20_17;
                                v21 = var13_9;
                                if (var2_2 < 0L) ** GOTO lbl132
                                if (v21 != null) break block48;
                                try {
                                    block54: {
                                        v21 = var19_15;
lbl132:
                                        // 2 sources

                                        if (v20 != v21.lastIndexOf((int)_g.b("l", (int)30228, (long)(2041172887185074525L ^ var2_2)))) break block49;
                                        break block54;
                                        catch (IOException v22) {
                                            throw m44.a("o", (Object)v22, (long)44984536543736986L, (long)var2_2);
                                        }
                                    }
                                    v20 = 1;
                                    break block48;
                                }
                                catch (IOException v23) {
                                    throw m44.a("o", (Object)v23, (long)44984536543736986L, (long)var2_2);
                                }
                            }
                            v20 = 0;
                        }
                        lk0.t((boolean)v20, new String[]{m44.a("p", (Object)var15_10, (long)278725148340715608L, (long)var2_2)}, var11_7);
                        var21_20 = var19_15.substring(0, var20_17);
                        v24 = new File(var21_20);
                        if (var2_2 <= 0L) break block55;
                        var18_13 = v24;
                        if (var13_9 == null) break block55;
                    }
                    v24 = var18_13 = new File((String)var17_12);
                }
                if (m44.a("p", (Object)var18_13, (long)514480127203017467L, (long)var2_2) != false) {
                    var19_15 = null;
                    var20_18 = null;
                    try {
                        var20_18 = new yu(var18_13);
                        v25 = new Object[3];
                        v25[2] = var4_3;
                        v25[1] = var20_18;
                        v25[0] = var5_4;
                        var19_15 = m44.a("n", (Object)this, (Object)v25, (long)464273607982075955L, (long)var2_2);
                    }
                    catch (IOException var21_21) {
                        // empty catch block
                    }
                    return var19_15;
                }
                try {
                    if (var13_9 == null) break block40;
lbl170:
                    // 2 sources

                    v6 /* !! */  = (CallSite)false;
                }
                catch (IOException v26) {
                    throw m44.a("o", (Object)v26, (long)44984536543736986L, (long)var2_2);
                }
            }
            lk0.t((boolean)v6 /* !! */ , new String[]{var16_11}, var11_7);
        }
        return null;
    }

    public static String H(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        boolean bl2 = (Boolean)objectArray[2];
        l10 = a ^ l10;
        try {
            if (bl2) {
                return string.replace((char)_g.b("l", (int)21603, (long)(0x1783BF8A53F8FC7EL ^ l10)), (char)m44.a("l", (long)-705291388019542175L, (long)l10)) + (String)((Object)_g.a("q", (int)30495, (long)(0x79ADE3DB18CA791BL ^ l10)));
            }
        }
        catch (nn nn2) {
            throw m44.a("h", (Object)nn2, (long)-591974475518065715L, (long)l10);
        }
        return string + (String)((Object)_g.a("q", (int)30495, (long)(0x79ADE3DB18CA791BL ^ l10)));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List t(Object[] var0) {
        block47: {
            block46: {
                var7_1 = (String)var0[0];
                var4_2 = (Set)var0[1];
                var6_3 = (Set)var0[2];
                var2_4 = (Long)var0[3];
                var5_5 = (File)var0[4];
                var1_6 = (yf)var0[5];
                v0 = var2_4 = _g.a ^ var2_4;
                var8_7 = v0 ^ 8716256075037L;
                var10_8 = v0 ^ 126293672864512L;
                var12_9 = v0 ^ 38117490357178L;
                var14_10 = v0 ^ 106341860745932L;
                v1 = v0 ^ 132756770358L;
                var16_11 = (int)(v1 >>> 32);
                var17_12 = (int)(v1 << 32 >>> 48);
                var18_13 = (int)(v1 << 48 >>> 48);
                var19_14 = v0 ^ 118199688689821L;
                var21_15 = v0 ^ 7729939132722L;
                var23_16 = v0 ^ 4260135586421L;
                var25_17 = v0 ^ 3965407440192L;
                var27_18 = v0 ^ 2462351942740L;
                var29_19 = v0 ^ 30003083300091L;
                var31_20 = m44.a("m", (long)201371517508328701L, (long)var2_4);
                try {
                    v2 = var5_5;
                    if (var31_20 != null) break block46;
                    if (v2 != null) break block47;
                }
                catch (ZipException v3) {
                    throw m44.a("m", (Object)v3, (long)1821101648364514624L, (long)var2_4);
                }
                v2 = m44.a("i", (long)171912940453318836L, (long)var2_4);
            }
            var5_5 = v2;
        }
        var32_21 = new Vector<E>();
        var33_22 = new StringTokenizer(var7_1, (String)m44.a("i", (long)92304409681483706L, (long)var2_4));
        while (var33_22.hasMoreTokens()) {
            block51: {
                block48: {
                    block49: {
                        block50: {
                            block60: {
                                var34_23 = var33_22.nextToken();
                                try {
                                    v4 = var34_23.trim().length();
                                    if (var31_20 != null) break block48;
                                    if (v4 > 0) {
                                    }
                                    ** GOTO lbl119
                                }
                                catch (ZipException v5) {
                                    throw m44.a("m", (Object)v5, (long)1821101648364514624L, (long)var2_4);
                                }
                                v6 = new Object[2];
                                v6[1] = var25_17;
                                v6[0] = var34_23;
                                var35_24 = m44.a("m", (Object)v6, (long)2240810342958193728L, (long)var2_4);
                                v7 = new Object[3];
                                v7[2] = var5_5;
                                v7[1] = var23_16;
                                v7[0] = var35_24;
                                var35_24 = m44.a("m", (Object)v7, (long)2265292064222693812L, (long)var2_4);
                                try {
                                    v8 = new Object[2];
                                    v8[1] = var12_9;
                                    v8[0] = var35_24;
                                    v9 /* !! */  = m44.a("m", (Object)v8, (long)2196035007672819310L, (long)var2_4);
                                    if (var31_20 != null) break block49;
                                    if (v9 /* !! */  != false) {
                                    }
                                    ** GOTO lbl110
                                }
                                catch (ZipException v10) {
                                    throw m44.a("m", (Object)v10, (long)1821101648364514624L, (long)var2_4);
                                }
                                var36_25 = new sz(var16_11, (short)var17_12, (char)var18_13);
                                v11 = new Object[5];
                                v11[4] = true;
                                v11[3] = var36_25;
                                v11[2] = var5_5;
                                v11[1] = var8_7;
                                v11[0] = var35_24;
                                var37_27 = m44.a("m", (Object)v11, (long)279521864961333024L, (long)var2_4);
                                v12 = var36_25.a(var29_19);
                                if (var31_20 != null) break block50;
                                if (!v12) ** GOTO lbl99
                                break block60;
                                catch (ZipException v13) {
                                    throw m44.a("m", (Object)v13, (long)1821101648364514624L, (long)var2_4);
                                }
                            }
                            try {
                                block61: {
                                    var32_21.addAll(var37_27);
                                    v14 = var31_20;
                                    if (var2_4 <= 0L) ** GOTO lbl107
                                    if (v14 == null) break block50;
                                    break block61;
                                    catch (ZipException v15) {
                                        throw m44.a("m", (Object)v15, (long)1821101648364514624L, (long)var2_4);
                                    }
                                }
                                v12 = var4_2.add(var35_24);
                            }
                            catch (ZipException v16) {
                                throw m44.a("m", (Object)v16, (long)1821101648364514624L, (long)var2_4);
                            }
                        }
                        try {
                            v14 = var31_20;
lbl107:
                            // 2 sources

                            if (var2_4 >= 0L) {
                                if (v14 == null) break block49;
                            }
                            ** GOTO lbl117
lbl110:
                            // 2 sources

                            v9 /* !! */  = (CallSite)var32_21.add(var35_24);
                        }
                        catch (ZipException v17) {
                            throw m44.a("m", (Object)v17, (long)1821101648364514624L, (long)var2_4);
                        }
                    }
                    try {
                        v14 = var31_20;
lbl117:
                        // 2 sources

                        if (var2_4 < 0L) break block51;
                        if (v14 == null) break block48;
lbl119:
                        // 2 sources

                        v4 = (int)var4_2.add(var34_23);
                    }
                    catch (ZipException v18) {
                        throw m44.a("m", (Object)v18, (long)1821101648364514624L, (long)var2_4);
                    }
                }
                v14 = var31_20;
            }
            if (v14 == null) continue;
        }
        var34_23 = new ArrayList<E>(var32_21.size());
        v19 = new Object[1];
        v19[0] = var21_15;
        var35_24 = m44.a("m", (Object)v19, (long)2096087996097520789L, (long)var2_4);
        var36_26 = 0;
        block38: while (var36_26 < var32_21.size()) {
            v20 = var32_21.get(var36_26);
            do {
                block52: {
                    block53: {
                        block54: {
                            block58: {
                                block57: {
                                    block64: {
                                        block63: {
                                            block56: {
                                                block55: {
                                                    var37_27 = (String)v20;
                                                    v21 = var31_20;
                                                    if (var2_4 <= 0L) break block52;
                                                    if (v21 != null) break block53;
                                                    try {
                                                        block62: {
                                                            v22 = new Object[3];
                                                            v22[2] = var35_24;
                                                            v22[1] = var37_27;
                                                            v22[0] = var14_10;
                                                            if (m44.a("m", (Object)v22, (long)2198607394558485492L, (long)var2_4) == false) break block54;
                                                            break block62;
                                                            catch (ZipException v23) {
                                                                throw m44.a("m", (Object)v23, (long)1821101648364514624L, (long)var2_4);
                                                            }
                                                        }
                                                        v24 = new Object[2];
                                                        v24[1] = var27_18;
                                                        v24[0] = var37_27;
                                                        if (m44.a("m", (Object)v24, (long)386650856961133072L, (long)var2_4) == false) break block55;
                                                    }
                                                    catch (ZipException v25) {
                                                        throw m44.a("m", (Object)v25, (long)1821101648364514624L, (long)var2_4);
                                                    }
                                                    var38_28 = new File(var5_5, (String)var37_27);
                                                    if (var2_4 <= 0L || var31_20 == null) break block56;
                                                }
                                                var38_28 = new File((String)var37_27);
                                            }
                                            v26 /* !! */  = m44.a("r", (Object)var38_28, (long)2232034499856243489L, (long)var2_4);
                                            if (var31_20 != null) break block54;
                                            if (v26 /* !! */  == false) ** GOTO lbl237
                                            break block63;
                                            catch (ZipException v27) {
                                                throw m44.a("m", (Object)v27, (long)1821101648364514624L, (long)var2_4);
                                            }
                                        }
                                        if (var2_4 <= 0L) break block57;
                                        v28 /* !! */  = m44.a("r", (Object)var38_28, (long)273999439564097719L, (long)var2_4);
                                        if (var31_20 != null) break block57;
                                        break block64;
                                        catch (ZipException v29) {
                                            throw m44.a("m", (Object)v29, (long)1821101648364514624L, (long)var2_4);
                                        }
                                    }
                                    try {
                                        block65: {
                                            if (v28 /* !! */  == false) break block58;
                                            break block65;
                                            catch (ZipException v30) {
                                                throw m44.a("m", (Object)v30, (long)1821101648364514624L, (long)var2_4);
                                            }
                                        }
                                        v28 /* !! */  = (CallSite)var34_23.add(var38_28);
                                    }
                                    catch (ZipException v31) {
                                        throw m44.a("m", (Object)v31, (long)1821101648364514624L, (long)var2_4);
                                    }
                                }
                                if (var31_20 == null) break block54;
                            }
                            try {
                                block59: {
                                    var39_29 = new yu(var38_28);
                                    v32 /* !! */  = var34_23.add(var39_29);
                                    if (var2_4 < 0L) ** GOTO lbl203
                                    if (var31_20 != null) break block54;
                                    try {
                                        block66: {
                                            v32 /* !! */  = m44.a("i", (long)2049129414603208434L, (long)var2_4);
lbl203:
                                            // 2 sources

                                            if (!v32 /* !! */ ) break block59;
                                            break block66;
                                            catch (ZipException v33) {
                                                throw m44.a("m", (Object)v33, (long)1821101648364514624L, (long)var2_4);
                                            }
                                        }
                                        v34 = new Object[4];
                                        v34[3] = var10_8;
                                        v34[2] = var4_2;
                                        v34[1] = var32_21;
                                        v34[0] = var39_29;
                                        m44.a("m", (Object)v34, (long)2281843631545845037L, (long)var2_4);
                                    }
                                    catch (ZipException v35) {
                                        throw m44.a("m", (Object)v35, (long)1821101648364514624L, (long)var2_4);
                                    }
                                }
                                v36 = new Object[6];
                                v36[5] = var1_6;
                                v36[4] = var19_14;
                                v36[3] = var6_3;
                                v36[2] = var4_2;
                                v36[1] = var34_23;
                                v36[0] = var39_29;
                                m44.a("m", (Object)v36, (long)181046943574522726L, (long)var2_4);
                            }
                            catch (ZipException var39_30) {
                                var4_2.add(m44.a("r", (Object)var38_28, (long)2201813679613338613L, (long)var2_4));
                            }
                            catch (IOException var39_31) {
                                try {
                                    v26 /* !! */  = (CallSite)var4_2.add(m44.a("r", (Object)var38_28, (long)2201813679613338613L, (long)var2_4));
                                    if (var2_4 < 0L || var31_20 == null) break block54;
lbl237:
                                    // 2 sources

                                    v26 /* !! */  = (CallSite)var4_2.add(m44.a("r", (Object)var38_28, (long)2201813679613338613L, (long)var2_4));
                                }
                                catch (ZipException v37) {
                                    throw m44.a("m", (Object)v37, (long)1821101648364514624L, (long)var2_4);
                                }
                            }
                        }
                        ++var36_26;
                    }
                    v21 = var31_20;
                }
                if (v21 == null) continue block38;
                v20 = var34_23;
            } while (var2_4 < 0L);
        }
        return v20;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gs C(Object[] var1_1) {
        block124: {
            block123: {
                block108: {
                    block110: {
                        block109: {
                            block112: {
                                block120: {
                                    block119: {
                                        block135: {
                                            block134: {
                                                block114: {
                                                    block117: {
                                                        block118: {
                                                            block115: {
                                                                block116: {
                                                                    block113: {
                                                                        block131: {
                                                                            block130: {
                                                                                block111: {
                                                                                    block128: {
                                                                                        block102: {
                                                                                            block96: {
                                                                                                block101: {
                                                                                                    block99: {
                                                                                                        block100: {
                                                                                                            block97: {
                                                                                                                block98: {
                                                                                                                    block95: {
                                                                                                                        var2_2 = (String)var1_1[0];
                                                                                                                        var3_3 = (Boolean)var1_1[1];
                                                                                                                        var4_4 = (Long)var1_1[2];
                                                                                                                        v0 = var4_4 = _g.a ^ var4_4;
                                                                                                                        var6_5 = v0 ^ 131775629241897L;
                                                                                                                        var8_6 = v0 ^ 34681076569512L;
                                                                                                                        v1 = v0 ^ 97941659692158L;
                                                                                                                        var10_7 = v1 >>> 8;
                                                                                                                        var12_8 = (int)(v1 << 56 >>> 56);
                                                                                                                        var13_9 = v0 ^ 56193882965033L;
                                                                                                                        var15_10 = v0 ^ 107851667584235L;
                                                                                                                        var17_11 = v0 ^ 86124550341904L;
                                                                                                                        var20_12 = m44.a("u", (Object)this, (long)-1251260379722439333L, (long)var4_4).get(var2_2);
                                                                                                                        var19_13 = m44.a("k", (long)-1556817705987148717L, (long)var4_4);
                                                                                                                        try {
                                                                                                                            v2 = var20_12;
                                                                                                                            if (var19_13 != null) break block95;
                                                                                                                            if (v2 == null) break block96;
                                                                                                                        }
                                                                                                                        catch (IOException v3) {
                                                                                                                            throw m44.a("k", (Object)v3, (long)-1014538536435923474L, (long)var4_4);
                                                                                                                        }
                                                                                                                        v2 = var20_12;
                                                                                                                    }
                                                                                                                    if (var4_4 <= 0L || var19_13 != null) break block97;
                                                                                                                    try {
                                                                                                                        block125: {
                                                                                                                            if (v2 != m44.a("o", (long)-1485718774976501160L, (long)var4_4)) break block98;
                                                                                                                            break block125;
                                                                                                                            catch (IOException v4) {
                                                                                                                                throw m44.a("k", (Object)v4, (long)-1014538536435923474L, (long)var4_4);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        return null;
                                                                                                                    }
                                                                                                                    catch (IOException v5) {
                                                                                                                        throw m44.a("k", (Object)v5, (long)-1014538536435923474L, (long)var4_4);
                                                                                                                    }
                                                                                                                }
                                                                                                                v2 = var20_12;
                                                                                                            }
                                                                                                            v6 = v2 instanceof File;
                                                                                                            if (var19_13 != null) break block99;
                                                                                                            try {
                                                                                                                block126: {
                                                                                                                    if (!v6) break block100;
                                                                                                                    break block126;
                                                                                                                    catch (IOException v7) {
                                                                                                                        throw m44.a("k", (Object)v7, (long)-1014538536435923474L, (long)var4_4);
                                                                                                                    }
                                                                                                                }
                                                                                                                return new gs(var8_6, (File)var20_12);
                                                                                                            }
                                                                                                            catch (IOException v8) {
                                                                                                                throw m44.a("k", (Object)v8, (long)-1014538536435923474L, (long)var4_4);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            v9 = var20_12;
                                                                                                            if (var19_13 != null) break block101;
                                                                                                            v6 = v9 instanceof lq0;
                                                                                                        }
                                                                                                        catch (IOException v10) {
                                                                                                            throw m44.a("k", (Object)v10, (long)-1014538536435923474L, (long)var4_4);
                                                                                                        }
                                                                                                    }
                                                                                                    if (!v6) break block96;
                                                                                                    v9 = var20_12;
                                                                                                }
                                                                                                var21_14 = (lq0)v9;
                                                                                                var22_16 = (ZipFile)var21_14.S();
                                                                                                var23_19 = (ZipEntry)var21_14.D();
                                                                                                return new gs(var10_7, var22_16, (byte)var12_8, var23_19);
                                                                                            }
                                                                                            var21_15 = null;
                                                                                            var22_17 = 0;
                                                                                            while (var22_17 < m44.a("u", (Object)this, (long)-1661429587300347437L, (long)var4_4).size()) {
                                                                                                block107: {
                                                                                                    block105: {
                                                                                                        block106: {
                                                                                                            block103: {
                                                                                                                block104: {
                                                                                                                    var23_20 /* !! */  = m44.a("u", (Object)this, (long)-1661429587300347437L, (long)var4_4).get(var22_17);
                                                                                                                    v11 /* !! */  = var23_20 /* !! */  instanceof File;
                                                                                                                    v12 = var19_13;
                                                                                                                    if (var4_4 <= 0L) ** GOTO lbl141
                                                                                                                    if (v12 != null) break block102;
                                                                                                                    try {
                                                                                                                        block127: {
                                                                                                                            if (var19_13 != null) break block103;
                                                                                                                            break block127;
                                                                                                                            catch (IOException v13) {
                                                                                                                                throw m44.a("k", (Object)v13, (long)-1014538536435923474L, (long)var4_4);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (!v11 /* !! */ ) break block104;
                                                                                                                    }
                                                                                                                    catch (IOException v14) {
                                                                                                                        throw m44.a("k", (Object)v14, (long)-1014538536435923474L, (long)var4_4);
                                                                                                                    }
                                                                                                                    v15 = new Object[3];
                                                                                                                    v15[2] = var15_10;
                                                                                                                    v15[1] = var2_2;
                                                                                                                    v15[0] = (File)var23_20 /* !! */ ;
                                                                                                                    v16 = m44.a("j", (Object)this, (Object)v15, (long)-1082168658014133658L, (long)var4_4);
                                                                                                                    if (var4_4 < 0L) ** GOTO lbl101
                                                                                                                    var21_15 = v16;
                                                                                                                    if (var19_13 != null) break block105;
                                                                                                                    try {
                                                                                                                        v16 = var21_15;
lbl101:
                                                                                                                        // 2 sources

                                                                                                                        if (v16 != null) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break block106;
                                                                                                                        catch (IOException v17) {
                                                                                                                            throw m44.a("k", (Object)v17, (long)-1014538536435923474L, (long)var4_4);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    catch (IOException v18) {
                                                                                                                        throw m44.a("k", (Object)v18, (long)-1014538536435923474L, (long)var4_4);
                                                                                                                    }
                                                                                                                }
                                                                                                                v19 = var23_20 /* !! */  instanceof ZipFile;
                                                                                                            }
                                                                                                            if (v19) {
                                                                                                                v20 = new Object[3];
                                                                                                                v20[2] = var2_2;
                                                                                                                v20[1] = (ZipFile)var23_20 /* !! */ ;
                                                                                                                v20[0] = var6_5;
                                                                                                                var21_15 = m44.a("j", (Object)this, (Object)v20, (long)-647078244083457721L, (long)var4_4);
                                                                                                                v21 = var19_13;
                                                                                                                if (var4_4 <= 0L) break block107;
                                                                                                                if (v21 != null) break block105;
                                                                                                                try {
                                                                                                                    if (var21_15 != null) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break block106;
                                                                                                                    catch (IOException v22) {
                                                                                                                        throw m44.a("k", (Object)v22, (long)-1014538536435923474L, (long)var4_4);
                                                                                                                    }
                                                                                                                }
                                                                                                                catch (IOException v23) {
                                                                                                                    throw m44.a("k", (Object)v23, (long)-1014538536435923474L, (long)var4_4);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        ++var22_17;
                                                                                                    }
                                                                                                    v21 = var19_13;
                                                                                                }
                                                                                                if (v21 == null) continue;
                                                                                            }
                                                                                            if (var4_4 <= 0L) break block123;
                                                                                            v11 /* !! */  = var3_3;
                                                                                        }
                                                                                        v12 = var19_13;
lbl141:
                                                                                        // 2 sources

                                                                                        if (v12 != null) break block108;
                                                                                        if (!v11 /* !! */ ) break block109;
                                                                                        break block128;
                                                                                        catch (IOException v24) {
                                                                                            throw m44.a("k", (Object)v24, (long)-1014538536435923474L, (long)var4_4);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        block129: {
                                                                                            if (var21_15 != null) break block109;
                                                                                            break block129;
                                                                                            catch (IOException v25) {
                                                                                                throw m44.a("k", (Object)v25, (long)-1014538536435923474L, (long)var4_4);
                                                                                            }
                                                                                        }
                                                                                        v26 = this;
                                                                                        if (var19_13 != null) break block110;
                                                                                    }
                                                                                    catch (IOException v27) {
                                                                                        throw m44.a("k", (Object)v27, (long)-1014538536435923474L, (long)var4_4);
                                                                                    }
                                                                                    v28 = var22_18 = v26.getClass().getResource("/" + var2_2.replace((char)_g.b("l", (int)2810, (long)(2372163964876989635L ^ var4_4)), (char)_g.b("l", (int)21603, (long)(1694478535325383261L ^ var4_4))) + (String)_g.a("q", (int)11920, (long)(7401040048404014761L ^ var4_4)));
                                                                                    if (var4_4 < 0L) break block111;
                                                                                    if (v28 == null) break block109;
                                                                                    v28 = var22_18;
                                                                                }
                                                                                var23_20 /* !! */  = m44.a("t", (Object)v28, (long)-1177970995364320184L, (long)var4_4);
                                                                                v29 = new Object[2];
                                                                                v29[1] = var13_9;
                                                                                v29[0] = m44.a("t", (Object)var22_18, (long)-1237786497668160979L, (long)var4_4);
                                                                                var24_21 = m44.a("k", (Object)v29, (long)-743079355166867348L, (long)var4_4);
                                                                                v11 /* !! */  = m44.a("t", var23_20 /* !! */ , (Object)_g.a("q", (int)11357, (long)(8810908016749847664L ^ var4_4)), (long)-1327761160454028658L, (long)var4_4);
                                                                                v30 = var19_13;
                                                                                if (var4_4 < 0L) ** GOTO lbl316
                                                                                if (v30 != null) break block112;
                                                                                if (!v11 /* !! */ ) ** GOTO lbl307
                                                                                break block130;
                                                                                catch (IOException v31) {
                                                                                    throw m44.a("k", (Object)v31, (long)-1014538536435923474L, (long)var4_4);
                                                                                }
                                                                            }
                                                                            v32 = var24_21.substring(0, 5);
                                                                            if (var19_13 != null) break block113;
                                                                            break block131;
                                                                            catch (IOException v33) {
                                                                                throw m44.a("k", (Object)v33, (long)-1014538536435923474L, (long)var4_4);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block132: {
                                                                                if (m44.a("t", v32, (Object)_g.a("q", (int)4087, (long)(6198441959176046558L ^ var4_4)), (long)-1327761160454028658L, (long)var4_4) == false) break block114;
                                                                                break block132;
                                                                                catch (IOException v34) {
                                                                                    throw m44.a("k", (Object)v34, (long)-1014538536435923474L, (long)var4_4);
                                                                                }
                                                                            }
                                                                            v32 = var24_21.substring(5, var24_21.length());
                                                                        }
                                                                        catch (IOException v35) {
                                                                            throw m44.a("k", (Object)v35, (long)-1014538536435923474L, (long)var4_4);
                                                                        }
                                                                    }
                                                                    var26_22 = v32;
                                                                    var27_24 = var26_22.indexOf((int)_g.b("l", (int)11265, (long)(1427206832452108862L ^ var4_4)));
                                                                    try {
                                                                        v36 = var27_24;
                                                                        if (var19_13 != null) break block115;
                                                                        if (v36 <= 0) break block116;
                                                                    }
                                                                    catch (IOException v37) {
                                                                        throw m44.a("k", (Object)v37, (long)-1014538536435923474L, (long)var4_4);
                                                                    }
                                                                    v36 = 1;
                                                                    break block115;
                                                                }
                                                                v36 = 0;
                                                            }
                                                            lk0.t((boolean)v36, new String[]{m44.a("t", (Object)var22_18, (long)-960875672739712724L, (long)var4_4)}, var17_11);
                                                            v38 = var27_24;
                                                            v39 = var19_13;
                                                            if (var4_4 < 0L) ** GOTO lbl221
                                                            if (v39 != null) break block117;
                                                            try {
                                                                block133: {
                                                                    v39 = var26_22;
lbl221:
                                                                    // 2 sources

                                                                    if (v38 != v39.lastIndexOf((int)_g.b("l", (int)30228, (long)(2041186489652140073L ^ var4_4)))) break block118;
                                                                    break block133;
                                                                    catch (IOException v40) {
                                                                        throw m44.a("k", (Object)v40, (long)-1014538536435923474L, (long)var4_4);
                                                                    }
                                                                }
                                                                v38 = 1;
                                                                break block117;
                                                            }
                                                            catch (IOException v41) {
                                                                throw m44.a("k", (Object)v41, (long)-1014538536435923474L, (long)var4_4);
                                                            }
                                                        }
                                                        v38 = 0;
                                                    }
                                                    lk0.t((boolean)v38, new String[]{m44.a("t", (Object)var22_18, (long)-960875672739712724L, (long)var4_4)}, var17_11);
                                                    var28_26 = var26_22.substring(0, var27_24);
                                                    var25_27 = new File(var28_26);
                                                    if (var4_4 < 0L || var19_13 == null) break block134;
                                                }
                                                var25_27 = new File((String)var24_21);
                                            }
                                            v42 = m44.a("t", (Object)var25_27, (long)-695877257486994545L, (long)var4_4);
                                            if (var19_13 != null) break block119;
                                            if (v42 == false) break block120;
                                            break block135;
                                            catch (IOException v43) {
                                                throw m44.a("k", (Object)v43, (long)-1014538536435923474L, (long)var4_4);
                                            }
                                        }
                                        try {
                                            block136: {
                                                v44 = var25_27;
                                                if (var19_13 != null) ** GOTO lbl264
                                                break block136;
                                                catch (IOException v45) {
                                                    throw m44.a("k", (Object)v45, (long)-1014538536435923474L, (long)var4_4);
                                                }
                                            }
                                            v42 = m44.a("t", (Object)v44, (long)-1485332634661806055L, (long)var4_4);
                                        }
                                        catch (IOException v46) {
                                            throw m44.a("k", (Object)v46, (long)-1014538536435923474L, (long)var4_4);
                                        }
                                    }
                                    if (v42 != false) break block120;
                                    try {
                                        block139: {
                                            block122: {
                                                block121: {
                                                    block137: {
                                                        v44 = var25_27;
lbl264:
                                                        // 2 sources

                                                        var27_25 = m44.a("t", (Object)v44, (long)-711549777692783781L, (long)var4_4);
                                                        v47 = m44.a("u", (Object)this, (long)-1106926533707924906L, (long)var4_4);
                                                        if (var4_4 <= 0L) break block121;
                                                        v48 = var27_25;
                                                        if (var19_13 != null) break block137;
                                                        try {
                                                            block138: {
                                                                if (!v47.containsKey(v48)) break block122;
                                                                break block138;
                                                                catch (IOException v49) {
                                                                    throw m44.a("k", (Object)v49, (long)-1014538536435923474L, (long)var4_4);
                                                                }
                                                            }
                                                            v50 = m44.a("u", (Object)this, (long)-1106926533707924906L, (long)var4_4);
                                                            v48 = var27_25;
                                                        }
                                                        catch (IOException v51) {
                                                            throw m44.a("k", (Object)v51, (long)-1014538536435923474L, (long)var4_4);
                                                        }
                                                    }
                                                    v47 = v50.get(v48);
                                                }
                                                var26_22 = (ZipFile)v47;
                                                if (var4_4 < 0L) break block120;
                                                if (var19_13 == null) break block139;
                                            }
                                            var26_22 = new yu(var25_27);
                                            m44.a("u", (Object)this, (long)-1106926533707924906L, (long)var4_4).put(var27_25, var26_22);
                                        }
                                        v52 = new Object[3];
                                        v52[2] = var2_2;
                                        v52[1] = var26_22;
                                        v52[0] = var6_5;
                                        var21_15 = m44.a("j", (Object)this, (Object)v52, (long)-647078244083457721L, (long)var4_4);
                                    }
                                    catch (IOException var26_23) {
                                        // empty catch block
                                    }
                                }
                                try {
                                    block140: {
                                        v53 /* !! */  = var19_13;
                                        if (var4_4 >= 0L) {
                                            if (v53 /* !! */  == null) break block109;
                                        }
                                        break block140;
lbl307:
                                        // 2 sources

                                        v53 /* !! */  = var23_20 /* !! */ ;
                                    }
                                    v11 /* !! */  = m44.a("t", v53 /* !! */ , (Object)_g.a("q", (int)19555, (long)(4882885834018145345L ^ var4_4)), (long)-1327761160454028658L, (long)var4_4);
                                }
                                catch (IOException v54) {
                                    throw m44.a("k", (Object)v54, (long)-1014538536435923474L, (long)var4_4);
                                }
                            }
                            try {
                                v30 = var19_13;
lbl316:
                                // 2 sources

                                if (v30 != null) break block108;
                                if (!v11 /* !! */ ) break block109;
                            }
                            catch (IOException v55) {
                                throw m44.a("k", (Object)v55, (long)-1014538536435923474L, (long)var4_4);
                            }
                            var25_27 = new File((String)var24_21);
                            try {
                                try {
                                    try {
                                        v11 /* !! */  = m44.a("t", (Object)var25_27, (long)-695877257486994545L, (long)var4_4);
                                        if (var19_13 != null) break block108;
                                        if (!v11 /* !! */ ) break block109;
                                    }
                                    catch (IOException v56) {
                                        throw m44.a("k", (Object)v56, (long)-1014538536435923474L, (long)var4_4);
                                    }
                                    v11 /* !! */  = m44.a("t", (Object)var25_27, (long)-1485332634661806055L, (long)var4_4);
                                    if (var4_4 <= 0L || var19_13 != null) break block108;
                                }
                                catch (IOException v57) {
                                    throw m44.a("k", (Object)v57, (long)-1014538536435923474L, (long)var4_4);
                                }
                                if (v11 /* !! */ ) break block109;
                            }
                            catch (IOException v58) {
                                throw m44.a("k", (Object)v58, (long)-1014538536435923474L, (long)var4_4);
                            }
                            var21_15 = new gs(var8_6, var25_27);
                        }
                        v26 = this;
                    }
                    v11 /* !! */  = m44.a("u", (Object)v26, (long)-1009837529923630499L, (long)var4_4);
                }
                try {
                    try {
                        try {
                            if (!v11 /* !! */ ) break block123;
                            v59 = var21_15;
                            if (var19_13 != null) break block124;
                        }
                        catch (IOException v60) {
                            throw m44.a("k", (Object)v60, (long)-1014538536435923474L, (long)var4_4);
                        }
                        if (v59 != null) break block123;
                    }
                    catch (IOException v61) {
                        throw m44.a("k", (Object)v61, (long)-1014538536435923474L, (long)var4_4);
                    }
                    m44.a("u", (Object)this, (long)-1251260379722439333L, (long)var4_4).put(var2_2, m44.a("o", (long)-1485718774976501160L, (long)var4_4));
                }
                catch (IOException v62) {
                    throw m44.a("k", (Object)v62, (long)-1014538536435923474L, (long)var4_4);
                }
            }
            v59 = var21_15;
        }
        return v59;
    }

    private static void q(Object[] objectArray) {
        block12: {
            long l10 = (Long)objectArray[0];
            ZipFile zipFile = (ZipFile)objectArray[1];
            List list = (List)objectArray[2];
            Set set = (Set)objectArray[3];
            String string = (String)objectArray[4];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x5245B4CFF1F5L;
            long l13 = l11 ^ 0x520113A216C0L;
            long l14 = l11 ^ 0x53A7188D5FD4L;
            CallSite callSite = m44.a("m", (long)-5094912795881330819L, (long)l10);
            if (string == null) break block12;
            StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
            File file = new File((String)((Object)m44.a("r", (Object)zipFile, (long)-6757467396941968581L, (long)l10)));
            CallSite callSite2 = m44.a("r", (Object)file, (long)-6672867020629073254L, (long)l10);
            while (stringTokenizer.hasMoreTokens()) {
                CallSite callSite3;
                block11: {
                    block9: {
                        File file2;
                        block14: {
                            CallSite callSite4;
                            block13: {
                                String string2 = stringTokenizer.nextToken().trim();
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l13;
                                objectArray2[0] = string2;
                                callSite4 = m44.a("m", (Object)objectArray2, (long)-6586333344276224064L, (long)l10);
                                Object[] objectArray3 = new Object[3];
                                objectArray3[2] = callSite2;
                                objectArray3[1] = l12;
                                objectArray3[0] = callSite4;
                                callSite4 = m44.a("m", (Object)objectArray3, (long)-6561816420755115468L, (long)l10);
                                Object[] objectArray4 = new Object[2];
                                objectArray4[1] = l14;
                                objectArray4[0] = callSite4;
                                if (m44.a("m", (Object)objectArray4, (long)-4693320918392016496L, (long)l10) == false) break block13;
                                file2 = new File((File)((Object)callSite2), (String)((Object)callSite4));
                                if (l10 < 0L || callSite == null) break block14;
                            }
                            file2 = new File((String)((Object)callSite4));
                        }
                        try {
                            Object object;
                            block10: {
                                try {
                                    try {
                                        object = m44.a("r", (Object)file2, (long)-6523017559383957343L, (long)l10);
                                        if (callSite != null) break block9;
                                        if (object == false) break block10;
                                    }
                                    catch (nn nn2) {
                                        throw m44.a("m", (Object)nn2, (long)-6717809515133888832L, (long)l10);
                                    }
                                    list.add(m44.a("r", (Object)file2, (long)-6553238309296711563L, (long)l10));
                                    callSite3 = callSite;
                                    if (l10 <= 0L) break block11;
                                    if (callSite3 == null) break block9;
                                }
                                catch (nn nn3) {
                                    throw m44.a("m", (Object)nn3, (long)-6717809515133888832L, (long)l10);
                                }
                            }
                            object = set.add((String)((Object)m44.a("r", (Object)file2, (long)-6553238309296711563L, (long)l10)) + (char)m44.a("i", (long)-4989673922426233859L, (long)l10));
                        }
                        catch (nn nn4) {
                            throw m44.a("m", (Object)nn4, (long)-6717809515133888832L, (long)l10);
                        }
                    }
                    callSite3 = callSite;
                }
                if (callSite3 == null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean R(Object[] var1_1) {
        block28: {
            var2_2 = (Long)var1_1[0];
            var4_3 = (String)var1_1[1];
            var2_2 = _g.a ^ var2_2;
            var6_4 = var4_3.replace((char)_g.b("l", (int)3183, (long)(5446614204213085333L ^ var2_2)), (char)m44.a("i", (long)1644751269801498500L, (long)var2_2));
            var7_5 = 0;
            var5_6 = m44.a("m", (long)910655017136951957L, (long)var2_2);
            while (var7_5 < m44.a("s", (Object)this, (long)1024344569528678165L, (long)var2_2).size()) {
                block35: {
                    block36: {
                        block33: {
                            block37: {
                                block34: {
                                    block29: {
                                        block31: {
                                            block32: {
                                                block30: {
                                                    var8_7 = m44.a("s", (Object)this, (long)1024344569528678165L, (long)var2_2).get(var7_5);
                                                    try {
                                                        try {
                                                            v0 = var8_7 instanceof File;
                                                            v1 = var5_6;
                                                            if (var2_2 > 0L) {
                                                                if (v1 != null) break block28;
                                                                v1 = var5_6;
                                                            }
                                                            if (v1 != null) break block29;
                                                        }
                                                        catch (nn v2) {
                                                            throw m44.a("m", (Object)v2, (long)1670268050188935976L, (long)var2_2);
                                                        }
                                                        if (v0) {
                                                        }
                                                        ** GOTO lbl62
                                                    }
                                                    catch (nn v3) {
                                                        throw m44.a("m", (Object)v3, (long)1670268050188935976L, (long)var2_2);
                                                    }
                                                    var9_8 = (File)var8_7;
                                                    var10_9 = (String)m44.a("r", (Object)var9_8, (long)1217740317737217437L, (long)var2_2) + (String)m44.a("i", (long)1074014422490295577L, (long)var2_2) + var6_4;
                                                    var11_10 = new File((String)var10_9);
                                                    try {
                                                        try {
                                                            v4 /* !! */  = m44.a("r", (Object)var11_10, (long)1193988472274031945L, (long)var2_2);
                                                            v5 = var5_6;
                                                            if (var2_2 > 0L) {
                                                                if (v5 != null) break block30;
                                                                if (v4 /* !! */  == false) break block31;
                                                            }
                                                            ** GOTO lbl47
                                                        }
                                                        catch (nn v6) {
                                                            throw m44.a("m", (Object)v6, (long)1670268050188935976L, (long)var2_2);
                                                        }
                                                        v4 /* !! */  = m44.a("r", (Object)var11_10, (long)983280828182742751L, (long)var2_2);
                                                    }
                                                    catch (nn v7) {
                                                        throw m44.a("m", (Object)v7, (long)1670268050188935976L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    v5 = var5_6;
lbl47:
                                                    // 2 sources

                                                    if (v5 != null) break block32;
                                                    if (v4 /* !! */  == false) break block31;
                                                }
                                                catch (nn v8) {
                                                    throw m44.a("m", (Object)v8, (long)1670268050188935976L, (long)var2_2);
                                                }
                                                v4 /* !! */  = (CallSite)true;
                                            }
                                            return (boolean)v4 /* !! */ ;
                                        }
                                        try {
                                            try {
                                                block38: {
                                                    v9 /* !! */  = var5_6;
                                                    if (var2_2 > 0L) {
                                                        if (v9 /* !! */  == null) break block33;
                                                    }
                                                    break block38;
lbl62:
                                                    // 2 sources

                                                    v9 /* !! */  = var8_7;
                                                }
                                                if (var5_6 != null) break block34;
                                            }
                                            catch (nn v10) {
                                                throw m44.a("m", (Object)v10, (long)1670268050188935976L, (long)var2_2);
                                            }
                                            v11 = v9 /* !! */  instanceof ZipFile;
                                        }
                                        catch (nn v12) {
                                            throw m44.a("m", (Object)v12, (long)1670268050188935976L, (long)var2_2);
                                        }
                                    }
                                    if (!v11) break block33;
                                    v9 /* !! */  = var8_7;
                                }
                                var9_8 = (ZipFile)v9 /* !! */ ;
                                var10_9 = m44.a("r", (Object)var9_8, (Object)var4_3, (long)795639095968934401L, (long)var2_2);
                                try {
                                    try {
                                        try {
                                            v13 = var5_6;
                                            if (var2_2 < 0L) break block35;
                                            if (v13 != null) break block36;
                                            if (var10_9 == null) break block33;
                                        }
                                        catch (nn v14) {
                                            throw m44.a("m", (Object)v14, (long)1670268050188935976L, (long)var2_2);
                                        }
                                        v15 = var10_9.isDirectory();
                                        if (var5_6 != null) break block37;
                                    }
                                    catch (nn v16) {
                                        throw m44.a("m", (Object)v16, (long)1670268050188935976L, (long)var2_2);
                                    }
                                    if (!v15) break block33;
                                }
                                catch (nn v17) {
                                    throw m44.a("m", (Object)v17, (long)1670268050188935976L, (long)var2_2);
                                }
                                v15 = true;
                            }
                            return v15;
                        }
                        ++var7_5;
                    }
                    v13 = var5_6;
                }
                if (v13 == null) continue;
            }
            v0 = false;
        }
        return v0;
    }

    private static void C(Object[] objectArray) {
        ZipFile zipFile = (ZipFile)objectArray[0];
        List list = (List)objectArray[1];
        Set set = (Set)objectArray[2];
        Set set2 = (Set)objectArray[3];
        long l10 = (Long)objectArray[4];
        yf yf2 = (yf)objectArray[5];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x1FC3385BA53BL;
        long l13 = l11 ^ 0x4F9A451B76EBL;
        long l14 = l11 ^ 0xAFD0CBA7FA6L;
        long l15 = l11 ^ 0x6F17C4E169CL;
        long l16 = l11 ^ 0x634F7A362B72L;
        CallSite callSite = m44.a("q", (Object)zipFile, (long)-8718916016468445719L, (long)l10);
        CallSite callSite2 = m44.a("n", (long)-8795517799281091642L, (long)l10);
        while (callSite.hasMoreElements()) {
            block21: {
                boolean bl2;
                CallSite callSite3;
                ZipEntry zipEntry;
                block20: {
                    zipEntry = (ZipEntry)callSite.nextElement();
                    callSite3 = m44.a("n", (Object)zipFile, (long)l16, (Object)zipEntry, (long)-7091417411404873235L, (long)l10);
                    try {
                        bl2 = zipEntry.isDirectory();
                        if (callSite2 != null) break block20;
                        if (bl2) break block21;
                    }
                    catch (IOException iOException) {
                        throw m44.a("n", (Object)iOException, (long)-7025972547436172677L, (long)l10);
                    }
                    bl2 = false;
                }
                Object object = bl2;
                try {
                    object = m44.a("n", (Object)zipFile, (Object)zipEntry, (long)l13, (long)-7128959158383749962L, (long)l10);
                }
                catch (IOException iOException) {
                    set.add(callSite3);
                }
                if (object) {
                    boolean bl3;
                    boolean bl4;
                    CallSite callSite4;
                    block25: {
                        block24: {
                            callSite4 = null;
                            bl4 = false;
                            try {
                                CallSite callSite5;
                                Set set3;
                                block22: {
                                    block23: {
                                        Object[] objectArray2 = new Object[3];
                                        objectArray2[2] = l12;
                                        objectArray2[1] = zipEntry;
                                        objectArray2[0] = zipFile;
                                        callSite4 = m44.a("n", (Object)objectArray2, (long)-9088143056250456268L, (long)l10);
                                        try {
                                            set3 = set2;
                                            callSite5 = callSite2;
                                            if (l10 < 0L) break block22;
                                            if (callSite5 != null) break block23;
                                            if (set3 == null) break block24;
                                        }
                                        catch (IOException iOException) {
                                            throw m44.a("n", (Object)iOException, (long)-7025972547436172677L, (long)l10);
                                        }
                                        set3 = set2;
                                    }
                                    callSite5 = m44.a("q", (Object)callSite4, (long)-7370975741695204146L, (long)l10);
                                }
                                set3.add(callSite5);
                            }
                            catch (IOException iOException) {
                                bl3 = true;
                                if (l10 < 0L || callSite2 != null) break block25;
                                bl4 = bl3;
                                try {
                                    yf yf3 = yf2;
                                    if (l10 > 0L) {
                                        if (yf3 == null) break block24;
                                        yf3 = yf2;
                                    }
                                    Object[] objectArray3 = new Object[3];
                                    objectArray3[2] = (String)((Object)_g.a("q", (int)14945, (long)(0x6D559AEC6811DDD0L ^ l10))) + (String)((Object)m44.a("j", (long)-7072155007267437087L, (long)l10)) + (String)((Object)_g.a("q", (int)13979, (long)(0x142CB37D55E95120L ^ l10))) + (String)((Object)callSite3) + (String)((Object)_g.a("q", (int)23693, (long)(0x273D37ADEAB13B32L ^ l10))) + iOException + (String)((Object)_g.a("q", (int)8898, (long)(0x129785C944C2456CL ^ l10)));
                                    objectArray3[1] = l15;
                                    objectArray3[0] = _g.a("q", (int)23062, (long)(0x2E0882137ABDBDA0L ^ l10));
                                    m44.a("q", (Object)yf3, (Object)objectArray3, (long)-9091424002645527439L, (long)l10);
                                }
                                catch (IOException iOException2) {
                                    throw m44.a("n", (Object)iOException2, (long)-7025972547436172677L, (long)l10);
                                }
                            }
                        }
                        bl3 = bl4;
                    }
                    try {
                        if (bl3 || callSite4 == null) break block21;
                    }
                    catch (IOException iOException) {
                        throw m44.a("n", (Object)iOException, (long)-7025972547436172677L, (long)l10);
                    }
                    try {
                        yu yu2 = new yu((File)((Object)callSite4));
                        list.add(yu2);
                        Object[] objectArray4 = new Object[6];
                        objectArray4[5] = yf2;
                        objectArray4[4] = l14;
                        objectArray4[3] = set2;
                        objectArray4[2] = set;
                        objectArray4[1] = list;
                        objectArray4[0] = yu2;
                        m44.a("n", (Object)objectArray4, (long)-8811200028880962467L, (long)l10);
                    }
                    catch (IOException iOException) {
                        CallSite callSite6;
                        yf yf4;
                        block26: {
                            block27: {
                                bl4 = true;
                                try {
                                    yf4 = yf2;
                                    callSite6 = callSite2;
                                    if (l10 < 0L) break block26;
                                    if (callSite6 != null) break block27;
                                    if (yf4 == null) break block21;
                                }
                                catch (IOException iOException3) {
                                    throw m44.a("n", (Object)iOException3, (long)-7025972547436172677L, (long)l10);
                                }
                                yf4 = yf2;
                            }
                            callSite6 = _g.a("q", (int)11246, (long)(0x1AA14871A277CC44L ^ l10));
                        }
                        Object[] objectArray5 = new Object[3];
                        objectArray5[2] = (String)((Object)_g.a("q", (int)3700, (long)(0x245879108D7669DDL ^ l10))) + (String)((Object)m44.a("q", (Object)callSite4, (long)-7370975741695204146L, (long)l10)) + (String)((Object)_g.a("q", (int)16411, (long)(0x39FC49E3390627A6L ^ l10))) + (String)((Object)m44.a("j", (long)-7072155007267437087L, (long)l10)) + (String)((Object)_g.a("q", (int)11155, (long)(0x72EF38757617CC20L ^ l10))) + (String)((Object)callSite3) + (String)((Object)_g.a("q", (int)21697, (long)(0x7BADB203A8043364L ^ l10))) + iOException;
                        objectArray5[1] = l15;
                        objectArray5[0] = callSite6;
                        m44.a("q", (Object)yf4, (Object)objectArray5, (long)-9091424002645527439L, (long)l10);
                    }
                }
            }
            if (callSite2 == null) continue;
        }
    }

    private static void d(Object[] objectArray) {
        ZipFile zipFile = (ZipFile)objectArray[0];
        List list = (List)objectArray[1];
        Set set = (Set)objectArray[2];
        long l10 = (Long)objectArray[3];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x23475E939080L;
        long l13 = l11 ^ 0x4ED057661B4BL;
        long l14 = l11 ^ 0x5B24787A73A1L;
        CallSite callSite = m44.a("t", (Object)zipFile, (Object)_g.a("q", (int)12682, (long)(0x73436F2CF12705BCL ^ l10)), (long)5892102592398061775L, (long)l10);
        if (callSite != null) {
            cn cn2;
            try {
                cn2 = new cn(zipFile, (ZipEntry)((Object)callSite), l13);
            }
            catch (Exception exception) {
                return;
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l14;
            objectArray2[0] = _g.a("q", (int)13825, (long)(0x7D2FC4DC4981822CL ^ l10));
            Object[] objectArray3 = new Object[5];
            objectArray3[4] = m44.a("t", (Object)cn2, (Object)objectArray2, (long)6140481092188594611L, (long)l10);
            objectArray3[3] = set;
            objectArray3[2] = list;
            objectArray3[1] = zipFile;
            objectArray3[0] = l12;
            m44.a("k", (Object)objectArray3, (long)5400804329008761544L, (long)l10);
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l14;
            objectArray4[0] = _g.a("q", (int)17583, (long)(0x4AC84CEF9063709AL ^ l10));
            Object[] objectArray5 = new Object[5];
            objectArray5[4] = m44.a("t", (Object)cn2, (Object)objectArray4, (long)6140481092188594611L, (long)l10);
            objectArray5[3] = set;
            objectArray5[2] = list;
            objectArray5[1] = zipFile;
            objectArray5[0] = l12;
            m44.a("k", (Object)objectArray5, (long)5400804329008761544L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _g.a = prr.a(7882828087449789320L, 1171305016607285498L, MethodHandles.lookup().lookupClass()).a(34301408079499L);
                        var20 = _g.a ^ 6859011989106L;
                        _g.f = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[25];
                        var16_4 = 0;
                        var15_5 = "\u009bW\u0014X&\u00eaA\u00a6\u00afXM(\u00e6f\u0015b\u00107\u0086*\u00a3\u007f\u00cb>\u00f7\\{S\u00a1\u001c\u00f3\u00a9<\u0010\u00ecf\u00b8\u0006\u00f8\u00df~f5\u0016\u00a9\u00fe\u00ae\u0003>+\u0010\u0012UY(\u00f1\u008b\u0007\u00e3\u00d7\u00c4\u00d3\u0002V\u009b+i(\u00f6\u0007\u00c13V\u00cd,|6\u00aas\u001a\u00025\u009ds\u009f9\u00cd\u00d4\u00e2\bK\u0014\u00dc\u0097\u0090a$\u0016\u00d3\u0098\u000f]\u00b5pQf\u00f3\u0015\u0010\u0002\u00d9\u00ad\u00c96\u00a6\u0016\u00ee\u0098I\u0098\u0091\u0093\u00f7\u008dn\u0010\u00ecD=\u00d82\u0088\u0095SG\u0091\u00e1\u00fc\u0003\u00e2)\u00c8(\u00fb\u00a8\u00b1\b\u00a8V\u0090\u0089\u0080'\u008dR\u001e\u00b4]\u00e6\u00fc\u00de\u00fe}\u009f\u009d\u00f6V+9\u008d>\u00bd\u00b8\u00c0c4\u009f\u0001\u00d2\u0091\f\u0087\u0092 \u000f\u00122\u00c7F>\u00e8\nxXh\u00a8\t^^\u008d/\u0001\u008e\u00c6\u00ffm\u0095IH\u00842A6\u00b55\u0080\u0010\u0002\u00a6\u0010Z\u00d4SG?\u009d\u00b1\u00de\u00e0:\u009e\\\u00b9\u0010#\u00b57\u00b3\u001d\u00a7\f\u00b5\u00ff\u00ca.\u00ac\u0001\u00a3'\u00c7\u0018\u00e5\u00dfe\u00bbV\u00f2Y\u00a2\u001de\u00a0\u00f6\u00c4\u00ac@\u00ca\u00195\u0000\u000b\u00a6}\u00e0~H\u00a9L\u00c5[\u009d75P\u001b\u0018\u00abkl\u00f6\u001f\u00803Q^\u008f\u00da\u000f\u00c9k\u00a5\u00bd\u00b3y:\u00c8\u00e2\u0083LP\u00ae\u0000\u00b1\u009cT\u00ce\u00adX\u009c6vN*L\u00e7?%;G\u0015\u00a7\u00a8C\u0013\u00bap\u00db\u009f N\u00be#\f\u0002\u0006,e\u0015\u0018\u0005C\u00fe\u0000$m\u0093\u00e32\u00c5KV\u0098\u00b0z[^[\u001c:\u00f6\u000b\u001c\u0094\u0010T3\u0087\u00e1b\u00f3'\u00ba\u0093U\u0015Q28\u008d4\u0010\u001c\u007f\u00aaM)5\b\u00f2[\u0092\u008e\"\u00d6$\u001b\u0081\u0010\u00d6\u0004L\u008a\u00d5\u0011\u0012E\u00ffW\u0006\u000b<\u0014\u000b\u00e2\u0010\u0083\u00ac\u0011C\u00d4sPB\u00a0\u001dJ\u00fcL\u00da\u00f7\u00d5\u0018=\u0094\u00fb\u0007\u00ba}\u0010x\u00e3M\u001a\u00c1\u00a4\u0091\u00ea\u0001\u00e7\u00f4+\u00b6t(`w\u0010x\u00d6-\u009c\u00b5\u00af\u00fcw]\u00f3\u008d\u008b\u008a\u0001b\u00828s\u00cc\u00e1Eq\u00b50Y\u00c3!\u000b\u0086mX\u00b1\u00fb\u00c7\u009c\u00f2\u00e0m\u0015\u00ad\u00e47'*\u00d1\u0010\u00e7Gs\u00f1\u00e1\u00c7n\u0092\u00f6\u00b9\\\u00a6\u00e4\\\u0015\u00d9.Kd\u00b48\u00d2\u008fW(\u00be\u00e3 Q\u001e\u00fb\u0016\u00aa\u00b9b\r*\u00d5R|[b&x\u00f9\u00dd\u00f1\u00aa\u0002\u00efo\u00cd\u00fb\u0006\u00ae]T\u00d6\u0085\u00a90\u00d8\u0094!e\ndvV\u00fax\u00c4\u00b5\u0007\u00b7\u00c1\u001c\u00adV(}\u00b0=\n\u00ce\"\u0001y\u00e5\u00a5\u00ddd2\ni\u00f1{\u0097\u00d18\u0090\u0005\u00dej\u0002\u0005aIB";
                        var17_6 = "\u009bW\u0014X&\u00eaA\u00a6\u00afXM(\u00e6f\u0015b\u00107\u0086*\u00a3\u007f\u00cb>\u00f7\\{S\u00a1\u001c\u00f3\u00a9<\u0010\u00ecf\u00b8\u0006\u00f8\u00df~f5\u0016\u00a9\u00fe\u00ae\u0003>+\u0010\u0012UY(\u00f1\u008b\u0007\u00e3\u00d7\u00c4\u00d3\u0002V\u009b+i(\u00f6\u0007\u00c13V\u00cd,|6\u00aas\u001a\u00025\u009ds\u009f9\u00cd\u00d4\u00e2\bK\u0014\u00dc\u0097\u0090a$\u0016\u00d3\u0098\u000f]\u00b5pQf\u00f3\u0015\u0010\u0002\u00d9\u00ad\u00c96\u00a6\u0016\u00ee\u0098I\u0098\u0091\u0093\u00f7\u008dn\u0010\u00ecD=\u00d82\u0088\u0095SG\u0091\u00e1\u00fc\u0003\u00e2)\u00c8(\u00fb\u00a8\u00b1\b\u00a8V\u0090\u0089\u0080'\u008dR\u001e\u00b4]\u00e6\u00fc\u00de\u00fe}\u009f\u009d\u00f6V+9\u008d>\u00bd\u00b8\u00c0c4\u009f\u0001\u00d2\u0091\f\u0087\u0092 \u000f\u00122\u00c7F>\u00e8\nxXh\u00a8\t^^\u008d/\u0001\u008e\u00c6\u00ffm\u0095IH\u00842A6\u00b55\u0080\u0010\u0002\u00a6\u0010Z\u00d4SG?\u009d\u00b1\u00de\u00e0:\u009e\\\u00b9\u0010#\u00b57\u00b3\u001d\u00a7\f\u00b5\u00ff\u00ca.\u00ac\u0001\u00a3'\u00c7\u0018\u00e5\u00dfe\u00bbV\u00f2Y\u00a2\u001de\u00a0\u00f6\u00c4\u00ac@\u00ca\u00195\u0000\u000b\u00a6}\u00e0~H\u00a9L\u00c5[\u009d75P\u001b\u0018\u00abkl\u00f6\u001f\u00803Q^\u008f\u00da\u000f\u00c9k\u00a5\u00bd\u00b3y:\u00c8\u00e2\u0083LP\u00ae\u0000\u00b1\u009cT\u00ce\u00adX\u009c6vN*L\u00e7?%;G\u0015\u00a7\u00a8C\u0013\u00bap\u00db\u009f N\u00be#\f\u0002\u0006,e\u0015\u0018\u0005C\u00fe\u0000$m\u0093\u00e32\u00c5KV\u0098\u00b0z[^[\u001c:\u00f6\u000b\u001c\u0094\u0010T3\u0087\u00e1b\u00f3'\u00ba\u0093U\u0015Q28\u008d4\u0010\u001c\u007f\u00aaM)5\b\u00f2[\u0092\u008e\"\u00d6$\u001b\u0081\u0010\u00d6\u0004L\u008a\u00d5\u0011\u0012E\u00ffW\u0006\u000b<\u0014\u000b\u00e2\u0010\u0083\u00ac\u0011C\u00d4sPB\u00a0\u001dJ\u00fcL\u00da\u00f7\u00d5\u0018=\u0094\u00fb\u0007\u00ba}\u0010x\u00e3M\u001a\u00c1\u00a4\u0091\u00ea\u0001\u00e7\u00f4+\u00b6t(`w\u0010x\u00d6-\u009c\u00b5\u00af\u00fcw]\u00f3\u008d\u008b\u008a\u0001b\u00828s\u00cc\u00e1Eq\u00b50Y\u00c3!\u000b\u0086mX\u00b1\u00fb\u00c7\u009c\u00f2\u00e0m\u0015\u00ad\u00e47'*\u00d1\u0010\u00e7Gs\u00f1\u00e1\u00c7n\u0092\u00f6\u00b9\\\u00a6\u00e4\\\u0015\u00d9.Kd\u00b48\u00d2\u008fW(\u00be\u00e3 Q\u001e\u00fb\u0016\u00aa\u00b9b\r*\u00d5R|[b&x\u00f9\u00dd\u00f1\u00aa\u0002\u00efo\u00cd\u00fb\u0006\u00ae]T\u00d6\u0085\u00a90\u00d8\u0094!e\ndvV\u00fax\u00c4\u00b5\u0007\u00b7\u00c1\u001c\u00adV(}\u00b0=\n\u00ce\"\u0001y\u00e5\u00a5\u00ddd2\ni\u00f1{\u0097\u00d18\u0090\u0005\u00dej\u0002\u0005aIB".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _g.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u001dV2\u008c\u00e3\u00df!\u00c8%\\B\u0085}\u00cd\u001c\u00c0\u00df\u00dd\u00e1\u00cez\u0010(\u0018\u0002\u00a9\u0097>\u00a3_\u0011\u00da\u0010ai\u0087\u00bb[\u00b3\u00b6\u0089'\u00ba\u00d6\u00f1\u0084R\u00ad\u00fa";
                            var17_6 = "\u001dV2\u008c\u00e3\u00df!\u00c8%\\B\u0085}\u00cd\u001c\u00c0\u00df\u00dd\u00e1\u00cez\u0010(\u0018\u0002\u00a9\u0097>\u00a3_\u0011\u00da\u0010ai\u0087\u00bb[\u00b3\u00b6\u0089'\u00ba\u00d6\u00f1\u0084R\u00ad\u00fa".length();
                            var14_7 = 32;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _g.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                _g.d = var18_3;
                _g.e = new String[25];
                _g.i = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = ")c\u00c9\u008f9\u00ac\\\u00d1\u0086\u0017\u0003\u000e\u00df\u0000y\u000f\u00ac\u00a6\u00eb\u00da\u00b69\u009dy~\u0017[\f0\u008aF\u00a7";
                var5_15 = ")c\u00c9\u008f9\u00ac\\\u00d1\u0086\u0017\u0003\u000e\u00df\u0000y\u000f\u00ac\u00a6\u00eb\u00da\u00b69\u009dy~\u0017[\f0\u008aF\u00a7".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "z\u00a1\u00e3\u00d5\u0096\u008f\u009a`\u0092\u00ae4\u00d9\u00a0A\u001c\u00c7";
                    var5_15 = "z\u00a1\u00e3\u00d5\u0096\u008f\u009a`\u0092\u00ae4\u00d9\u00a0A\u001c\u00c7".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl104:
                // 1 sources

                ** continue;
            }
        }
        _g.g = var6_12;
        _g.h = new Integer[6];
        _g.c = m44.a("k", (Object)_g.a("q", (int)17958, (long)(8657044600829955062L ^ var20)), (long)8001457911236068533L, (long)var20);
        _g.t = m44.a("o", (long)7913333784784293423L, (long)var20).charAt(0);
        _g.E = m44.a("k", (Object)_g.a("q", (int)16609, (long)(4456229769147141419L ^ var20)), (long)8001457911236068533L, (long)var20);
        _g.b = new String[]{_g.a("q", (int)27467, (long)(9151486076971280023L ^ var20)), _g.a("q", (int)9718, (long)(6596515434555975721L ^ var20))};
        m44.a("h", (Object)new Object(), (long)7967314744599719848L, (long)var20);
        m44.a("h", (char)_g.b("l", (int)1673, (long)(8950241305772895553L ^ var20)), (long)7790958444584095011L, (long)var20);
        m44.a("h", String.valueOf((char)m44.a("o", (long)7790958444584095011L, (long)var20)), (long)7842275254808660395L, (long)var20);
    }

    /*
     * Exception decompiling
     */
    public void Z(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[DOLOOP], 18[WHILELOOP]], but top level block is 5[TRYBLOCK]
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
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public _g(String string, long l10, boolean bl2) {
        long l11 = (l10 = a ^ l10) ^ 0x104C679E5ADCL;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 48);
        int n12 = (int)(l11 << 48 >>> 48);
        this(string, bl2, n10, false, (char)n11, (short)n12, null);
    }

    private _g(String string, boolean bl2, int n10, boolean bl3, char c10, short s10, yf yf2) {
        long l10;
        long l11 = l10 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)s10 << 48 >>> 48) ^ a;
        long l12 = l11 ^ 0x6A077785EE6DL;
        long l13 = l11 ^ 0x6B7FDFBEB897L;
        long l14 = l11 ^ 0x1C67E7F4DEEL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        m44.a("v", (Object)this, (Set)((Object)m44.a("j", (Object)objectArray, (long)4776526923286789066L, (long)l10)), (long)6894782795972610261L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        m44.a("v", (Object)this, (Map)((Object)m44.a("j", (Object)objectArray2, (long)6697959425108097041L, (long)l10)), (long)5139308600439524775L, (long)l10);
        m44.a("v", (Object)this, (boolean)bl3, (long)5047765258419568044L, (long)l10);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = yf2;
        objectArray3[1] = string;
        objectArray3[0] = l14;
        m44.a("k", (Object)this, (Object)objectArray3, (long)5171787565578629084L, (long)l10);
    }

    public static List f(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        Set set = (Set)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x1B29FD8D55L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = null;
        objectArray2[3] = null;
        objectArray2[2] = set;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return m44.a("k", (Object)objectArray2, (long)-3607268992022799430L, (long)l10);
    }

    public Object[] N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)m44.a("u", (Object)this, (long)-1006236721473746133L, (long)l10), (long)-1128949611317859616L, (long)l10);
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6C0C;
        if (e[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_g", exception);
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
            _g.e[n11] = _g.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = _g.a(n10, l10);
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
            throw new RuntimeException("com/zelix/_g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4A19;
        if (h[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = g[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/_g", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _g.h[n11] = n12;
        }
        return h[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = _g.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/_g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_g.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(_g.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

