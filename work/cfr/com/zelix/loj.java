/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._v;
import com.zelix.ai;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.v7;
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

public class loj {
    private Map w;
    private final _6 v;
    private final ai V;
    private final ol n;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    ai F(Object[] objectArray) {
        return this.V;
    }

    Integer Y(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x479A3ECA3829L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        return (Integer)this.w.get((long)m44.a("m", (Object)objectArray, (long)1687196079938822961L, (long)l10));
    }

    boolean v(Object[] objectArray) {
        boolean bl2;
        block4: {
            long l10;
            String string;
            String string2;
            block5: {
                string2 = (String)objectArray[0];
                long l11 = (Long)objectArray[1];
                string = (String)objectArray[2];
                l10 = (l11 = a ^ l11) ^ 0x467DB9D1831FL;
                CallSite callSite = m44.a("m", (long)-4582528430974290761L, (long)l11);
                try {
                    try {
                        bl2 = string2.equals(string);
                        if (callSite != null) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-2769561446862770688L, (long)l11);
                    }
                    return true;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-2769561446862770688L, (long)l11);
                }
            }
            bl2 = this.V.j(string2, l10, string);
        }
        return bl2;
    }

    public static String A(String string, long l10) {
        String string2;
        block6: {
            block7: {
                l10 = a ^ l10;
                int n10 = string.length();
                CallSite callSite = m44.a("i", (long)5756627503021013811L, (long)l10);
                try {
                    try {
                        try {
                            string2 = string;
                            if (callSite != null) break block6;
                            if (string2.charAt(0) != loj.b("s", (int)29267, (long)(0x7309B12BF806B51BL ^ l10))) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("i", (Object)n92, (long)6202787184664715652L, (long)l10);
                        }
                        string2 = string;
                        if (callSite != null) break block6;
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)n93, (long)6202787184664715652L, (long)l10);
                    }
                    if (string2.charAt(n10 - 1) != loj.b("s", (int)1776, (long)(0xFD4457C5C3A41B0L ^ l10))) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("i", (Object)n94, (long)6202787184664715652L, (long)l10);
                }
                string = string.substring(1, n10 - 1);
            }
            string2 = string;
        }
        return string2;
    }

    String P(Object[] objectArray) {
        v7 v72 = (v7)objectArray[0];
        v7 v73 = (v7)objectArray[1];
        String string = (String)objectArray[2];
        long l10 = (Long)objectArray[3];
        long l11 = (l10 = a ^ l10) ^ 0x23545DE07511L;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 32);
        int n12 = (int)(l11 << 48 >>> 48);
        return m44.a("u", (Object)this, (char)((char)n10), (int)n11, (Object)v72.h(), (short)((short)n12), (Object)v73.h(), (Object)string, (long)3613980907860996957L, (long)l10);
    }

    public static String N(Object[] objectArray) {
        String string;
        block4: {
            String string2;
            block5: {
                long l10 = (Long)objectArray[0];
                string2 = (String)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("o", (long)-16361919217661163L, (long)l10);
                try {
                    try {
                        string = string2;
                        if (callSite != null) break block4;
                        if (string.charAt(string2.length() - 1) == loj.b("s", (int)27258, (long)(0x26A54AB939431D11L ^ l10))) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-1859209524457074270L, (long)l10);
                    }
                    return (char)loj.b("s", (int)1517, (long)(0x4BEB870781A67289L ^ l10)) + string2 + (char)loj.b("s", (int)1776, (long)(0xFD43DA140C5F196L ^ l10));
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-1859209524457074270L, (long)l10);
                }
            }
            string = string2;
        }
        return string;
    }

    boolean C(v7 v72, long l10, v7 v73, String string) {
        long l11 = (l10 = a ^ l10) ^ 0x5408D5E215F5L;
        return this.n(v72.h(), l11, v73.h(), string);
    }

    Integer b(char c10, int n10, char c11) {
        long l10 = ((long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)c11 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x4340F1C85814L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        return (Integer)this.w.remove((long)m44.a("h", (Object)objectArray, (long)8599371973235901196L, (long)l10));
    }

    String b(Object[] objectArray) {
        Object object;
        int n10;
        long l10;
        long l11;
        block52: {
            String string;
            String string2;
            int n11;
            int n12;
            int n13;
            String string3;
            block53: {
                Object object2;
                block50: {
                    int n14;
                    int n15;
                    CallSite callSite;
                    block45: {
                        block46: {
                            block49: {
                                int n16;
                                block47: {
                                    block48: {
                                        String string4;
                                        block40: {
                                            block41: {
                                                String string5;
                                                block43: {
                                                    int n17;
                                                    block44: {
                                                        String string6;
                                                        block54: {
                                                            block42: {
                                                                string4 = (String)objectArray[0];
                                                                l11 = (Long)objectArray[1];
                                                                String string7 = (String)objectArray[2];
                                                                string3 = (String)objectArray[3];
                                                                long l12 = l11 = a ^ l11;
                                                                long l13 = l12 ^ 0x1DCE5CCC586EL;
                                                                n13 = (int)(l13 >>> 48);
                                                                n12 = (int)(l13 << 16 >>> 32);
                                                                n11 = (int)(l13 << 48 >>> 48);
                                                                l10 = l12 ^ 0x1EF580E06687L;
                                                                n10 = string4.lastIndexOf("[") + 1;
                                                                n17 = string7.lastIndexOf("[") + 1;
                                                                callSite = m44.a("m", (long)1760810676669181119L, (long)l11);
                                                                string2 = string4.substring(n10);
                                                                string = string7.substring(n17);
                                                                try {
                                                                    try {
                                                                        n15 = n10;
                                                                        n14 = n17;
                                                                        if (callSite != null) break block40;
                                                                        if (n15 == n14) break block41;
                                                                    }
                                                                    catch (n9 n92) {
                                                                        throw m44.a("m", (Object)n92, (long)115048332674627080L, (long)l11);
                                                                    }
                                                                    if (n10 >= n17) break block42;
                                                                }
                                                                catch (n9 n93) {
                                                                    throw m44.a("m", (Object)n93, (long)115048332674627080L, (long)l11);
                                                                }
                                                                string6 = string2;
                                                                if (l11 < 0L || callSite == null) break block54;
                                                            }
                                                            string6 = string;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        string5 = string6;
                                                                        if (callSite != null) break block43;
                                                                        if (!string5.startsWith("L")) break block44;
                                                                    }
                                                                    catch (n9 n94) {
                                                                        throw m44.a("m", (Object)n94, (long)115048332674627080L, (long)l11);
                                                                    }
                                                                    string5 = string6;
                                                                    if (callSite != null) break block43;
                                                                }
                                                                catch (n9 n95) {
                                                                    throw m44.a("m", (Object)n95, (long)115048332674627080L, (long)l11);
                                                                }
                                                                if (!string5.endsWith(";")) break block44;
                                                            }
                                                            catch (n9 n96) {
                                                                throw m44.a("m", (Object)n96, (long)115048332674627080L, (long)l11);
                                                            }
                                                            Object[] objectArray2 = new Object[5];
                                                            objectArray2[4] = (int)loj.b("s", (int)5078, (long)(0x6E667C14500F8303L ^ l11));
                                                            objectArray2[3] = l10;
                                                            objectArray2[2] = (int)m44.a("m", (int)n10, (int)n17, (long)2102470354502770706L, (long)l11);
                                                            objectArray2[1] = (int)loj.b("s", (int)29267, (long)(0x7309B0E6065DE297L ^ l11));
                                                            objectArray2[0] = "";
                                                            return (String)((Object)m44.a("m", (Object)objectArray2, (long)421233029978858512L, (long)l11)) + (String)((Object)loj.a("d", (int)5587, (long)(0x164EDA69699DD61AL ^ l11)));
                                                        }
                                                        catch (n9 n97) {
                                                            throw m44.a("m", (Object)n97, (long)115048332674627080L, (long)l11);
                                                        }
                                                    }
                                                    Object[] objectArray3 = new Object[5];
                                                    objectArray3[4] = (int)loj.b("s", (int)5078, (long)(0x6E667C14500F8303L ^ l11));
                                                    objectArray3[3] = l10;
                                                    objectArray3[2] = (int)(m44.a("m", (int)n10, (int)n17, (long)2102470354502770706L, (long)l11) - true);
                                                    objectArray3[1] = (int)loj.b("s", (int)29267, (long)(0x7309B0E6065DE297L ^ l11));
                                                    objectArray3[0] = "";
                                                    string5 = (String)((Object)m44.a("m", (Object)objectArray3, (long)421233029978858512L, (long)l11)) + (String)((Object)loj.a("d", (int)23772, (long)(0x48BC082959FD1F11L ^ l11)));
                                                }
                                                return string5;
                                            }
                                            n15 = string2.length();
                                            n14 = 1;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (callSite != null) break block45;
                                                                if (n15 != n14) break block46;
                                                            }
                                                            catch (n9 n98) {
                                                                throw m44.a("m", (Object)n98, (long)115048332674627080L, (long)l11);
                                                            }
                                                            n15 = string.length();
                                                            n14 = 1;
                                                            if (l11 < 0L || callSite != null) break block45;
                                                        }
                                                        catch (n9 n99) {
                                                            throw m44.a("m", (Object)n99, (long)115048332674627080L, (long)l11);
                                                        }
                                                        if (n15 != n14) break block46;
                                                    }
                                                    catch (n9 n910) {
                                                        throw m44.a("m", (Object)n910, (long)115048332674627080L, (long)l11);
                                                    }
                                                    n16 = string2.equals(string);
                                                    if (l11 < 0L || callSite != null) break block47;
                                                }
                                                catch (n9 n911) {
                                                    throw m44.a("m", (Object)n911, (long)115048332674627080L, (long)l11);
                                                }
                                                if (n16 == 0) break block48;
                                            }
                                            catch (n9 n912) {
                                                throw m44.a("m", (Object)n912, (long)115048332674627080L, (long)l11);
                                            }
                                            return string4;
                                        }
                                        catch (n9 n913) {
                                            throw m44.a("m", (Object)n913, (long)115048332674627080L, (long)l11);
                                        }
                                    }
                                    n16 = n10;
                                }
                                try {
                                    if (l11 > 0L) {
                                        if (n16 != 1) break block49;
                                        n16 = 23772;
                                    }
                                    return loj.a("d", (int)n16, (long)(0x48BC082959FD1F11L ^ l11));
                                }
                                catch (n9 n914) {
                                    throw m44.a("m", (Object)n914, (long)115048332674627080L, (long)l11);
                                }
                            }
                            Object[] objectArray4 = new Object[5];
                            objectArray4[4] = (int)loj.b("s", (int)5078, (long)(0x6E667C14500F8303L ^ l11));
                            objectArray4[3] = l10;
                            objectArray4[2] = n10 - 1;
                            objectArray4[1] = (int)loj.b("s", (int)29267, (long)(0x7309B0E6065DE297L ^ l11));
                            objectArray4[0] = "";
                            return (String)((Object)m44.a("m", (Object)objectArray4, (long)421233029978858512L, (long)l11)) + (String)((Object)loj.a("d", (int)23772, (long)(0x48BC082959FD1F11L ^ l11)));
                        }
                        try {
                            object2 = string2;
                            if (callSite != null) break block50;
                            n15 = ((String)object2).length();
                            n14 = 1;
                        }
                        catch (n9 n915) {
                            throw m44.a("m", (Object)n915, (long)115048332674627080L, (long)l11);
                        }
                    }
                    try {
                        block51: {
                            try {
                                try {
                                    if (n15 == n14) break block51;
                                    object = string;
                                    if (callSite != null) break block52;
                                }
                                catch (n9 n916) {
                                    throw m44.a("m", (Object)n916, (long)115048332674627080L, (long)l11);
                                }
                                if (((String)object).length() != 1) break block53;
                            }
                            catch (n9 n917) {
                                throw m44.a("m", (Object)n917, (long)115048332674627080L, (long)l11);
                            }
                        }
                        object2 = loj.a("d", (int)23772, (long)(0x48BC082959FD1F11L ^ l11));
                    }
                    catch (n9 n918) {
                        throw m44.a("m", (Object)n918, (long)115048332674627080L, (long)l11);
                    }
                }
                return object2;
            }
            object = m44.a("r", (Object)this, (char)((char)n13), (int)n12, (Object)string2, (short)((short)n11), (Object)string, (Object)string3, (long)2258641966888984098L, (long)l11);
        }
        String string = object;
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = (int)loj.b("s", (int)5078, (long)(0x6E667C14500F8303L ^ l11));
        objectArray5[3] = l10;
        objectArray5[2] = string.length() + n10;
        objectArray5[1] = (int)loj.b("s", (int)12911, (long)(0x48305FA8276DA2A7L ^ l11));
        objectArray5[0] = string;
        return m44.a("m", (Object)objectArray5, (long)421233029978858512L, (long)l11);
    }

    void a(Object[] objectArray) {
        Integer n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x61C8CBE2DF7L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        this.w.put((long)m44.a("k", (Object)objectArray2, (long)194884467227850479L, (long)l10), n10);
    }

    public _6 E(Object[] objectArray) {
        return this.v;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean n(String var1_1, long var2_2, String var4_3, String var5_4) {
        block56: {
            block57: {
                block58: {
                    block59: {
                        block60: {
                            block61: {
                                block52: {
                                    block53: {
                                        block54: {
                                            block55: {
                                                block62: {
                                                    block51: {
                                                        block45: {
                                                            block46: {
                                                                block49: {
                                                                    block50: {
                                                                        block48: {
                                                                            block47: {
                                                                                block43: {
                                                                                    block44: {
                                                                                        v0 = var2_2 = loj.a ^ var2_2;
                                                                                        var6_5 = v0 ^ 110979575977432L;
                                                                                        var8_6 = v0 ^ 25658886919863L;
                                                                                        var10_7 = v0 ^ 38902658775044L;
                                                                                        var12_8 = v0 ^ 110782695434454L;
                                                                                        var14_9 = v0 ^ 21975942674304L;
                                                                                        var16_10 = v0 ^ 14047709601793L;
                                                                                        var18_11 = v0 ^ 130643708770544L;
                                                                                        var20_12 = m44.a("k", (long)-3868031953185194367L, (long)var2_2);
                                                                                        try {
                                                                                            try {
                                                                                                v1 = var1_1;
                                                                                                if (var20_12 != null) break block43;
                                                                                                if (!v1.equals(var4_3)) break block44;
                                                                                            }
                                                                                            catch (n9 v2) {
                                                                                                throw m44.a("k", (Object)v2, (long)-3195619165816773578L, (long)var2_2);
                                                                                            }
                                                                                            return true;
                                                                                        }
                                                                                        catch (n9 v3) {
                                                                                            throw m44.a("k", (Object)v3, (long)-3195619165816773578L, (long)var2_2);
                                                                                        }
                                                                                    }
                                                                                    var1_1 = loj.A(var1_1, var10_7);
                                                                                    v1 = loj.A(var4_3, var10_7);
                                                                                }
                                                                                var4_3 = v1;
                                                                                var21_13 = null;
                                                                                var22_14 = null;
                                                                                var23_15 = this.Y(var18_11);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v4 = var1_1.charAt(0);
                                                                                                v5 = loj.b("s", (int)27237, (long)(2863671204981844112L ^ var2_2));
                                                                                                if (var20_12 != null) break block45;
                                                                                                if (v4 != v5) break block46;
                                                                                            }
                                                                                            catch (n9 v6) {
                                                                                                throw m44.a("k", (Object)v6, (long)-3195619165816773578L, (long)var2_2);
                                                                                            }
                                                                                            v7 /* !! */  = var4_3.charAt(0);
                                                                                            if (var20_12 != null) break block47;
                                                                                        }
                                                                                        catch (n9 v8) {
                                                                                            throw m44.a("k", (Object)v8, (long)-3195619165816773578L, (long)var2_2);
                                                                                        }
                                                                                        if (v7 /* !! */  != loj.b("s", (int)5078, (long)(7955088130662617405L ^ var2_2))) break block48;
                                                                                    }
                                                                                    catch (n9 v9) {
                                                                                        throw m44.a("k", (Object)v9, (long)-3195619165816773578L, (long)var2_2);
                                                                                    }
                                                                                    v10 = new Object[4];
                                                                                    v10[3] = var12_8;
                                                                                    v10[2] = var5_4;
                                                                                    v10[1] = var4_3;
                                                                                    v10[0] = var1_1;
                                                                                    v7 /* !! */  = m44.a("j", (Object)this, (Object)v10, (long)-3923554054689501835L, (long)var2_2);
                                                                                }
                                                                                catch (n9 v11) {
                                                                                    throw m44.a("k", (Object)v11, (long)-3195619165816773578L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            return v7 /* !! */ ;
                                                                        }
                                                                        var22_14 = this.v.g(var4_3, var23_15, var16_10, var5_4);
                                                                        try {
                                                                            try {
                                                                                v12 = var22_14.t(var6_5);
                                                                                if (var20_12 != null) break block49;
                                                                                if (!v12) break block50;
                                                                            }
                                                                            catch (n9 v13) {
                                                                                throw m44.a("k", (Object)v13, (long)-3195619165816773578L, (long)var2_2);
                                                                            }
                                                                            return var4_3.equals(loj.a("d", (int)10044, (long)(227410413165885130L ^ var2_2)));
                                                                        }
                                                                        catch (n9 v14) {
                                                                            throw m44.a("k", (Object)v14, (long)-3195619165816773578L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    v12 = var4_3.equals(loj.a("d", (int)5548, (long)(5126689374350738520L ^ var2_2)));
                                                                }
                                                                return v12;
                                                            }
                                                            try {
                                                                v4 = var4_3.charAt(0);
                                                                if (var20_12 != null) break block51;
                                                                v5 = loj.b("s", (int)5078, (long)(7955088130662617405L ^ var2_2));
                                                            }
                                                            catch (n9 v15) {
                                                                throw m44.a("k", (Object)v15, (long)-3195619165816773578L, (long)var2_2);
                                                            }
                                                        }
                                                        if (v4 != v5) break block62;
                                                        v4 = '\u0000';
                                                    }
                                                    return (boolean)v4;
                                                }
                                                var21_13 = this.v.g(var1_1, var23_15, var16_10, var5_4);
                                                var22_14 = this.v.g(var4_3, var23_15, var16_10, var5_4);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v16 = var21_13.t(var6_5);
                                                                v17 = var20_12;
                                                                if (var2_2 > 0L) {
                                                                    if (v17 != null) break block52;
                                                                    if (!v16) break block53;
                                                                }
                                                                ** GOTO lbl139
                                                            }
                                                            catch (n9 v18) {
                                                                throw m44.a("k", (Object)v18, (long)-3195619165816773578L, (long)var2_2);
                                                            }
                                                            v19 = var22_14.t(var6_5);
                                                            if (var20_12 != null) break block54;
                                                        }
                                                        catch (n9 v20) {
                                                            throw m44.a("k", (Object)v20, (long)-3195619165816773578L, (long)var2_2);
                                                        }
                                                        if (!v19) break block55;
                                                    }
                                                    catch (n9 v21) {
                                                        throw m44.a("k", (Object)v21, (long)-3195619165816773578L, (long)var2_2);
                                                    }
                                                    v22 = new Object[3];
                                                    v22[2] = var4_3;
                                                    v22[1] = var14_9;
                                                    v22[0] = var1_1;
                                                    return (boolean)m44.a("t", (Object)this, (Object)v22, (long)-3109165011746028258L, (long)var2_2);
                                                }
                                                catch (n9 v23) {
                                                    throw m44.a("k", (Object)v23, (long)-3195619165816773578L, (long)var2_2);
                                                }
                                            }
                                            v19 = var4_3.equals(loj.a("d", (int)15216, (long)(345958238560496261L ^ var2_2)));
                                        }
                                        return v19;
                                    }
                                    v16 = var22_14.t(var6_5);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v17 = var20_12;
lbl139:
                                                        // 2 sources

                                                        if (v17 != null) break block56;
                                                        if (!v16) break block57;
                                                    }
                                                    catch (n9 v24) {
                                                        throw m44.a("k", (Object)v24, (long)-3195619165816773578L, (long)var2_2);
                                                    }
                                                    v25 = m44.a("o", (long)-3247794786341950701L, (long)var2_2);
                                                    if (var20_12 != null) break block58;
                                                }
                                                catch (n9 v26) {
                                                    throw m44.a("k", (Object)v26, (long)-3195619165816773578L, (long)var2_2);
                                                }
                                                if (v25 == false) break block59;
                                            }
                                            catch (n9 v27) {
                                                throw m44.a("k", (Object)v27, (long)-3195619165816773578L, (long)var2_2);
                                            }
                                            v28 = new Object[3];
                                            v28[2] = var4_3;
                                            v28[1] = var14_9;
                                            v28[0] = var1_1;
                                            v29 /* !! */  = m44.a("t", (Object)this, (Object)v28, (long)-3109165011746028258L, (long)var2_2);
                                            if (var20_12 != null) break block60;
                                        }
                                        catch (n9 v30) {
                                            throw m44.a("k", (Object)v30, (long)-3195619165816773578L, (long)var2_2);
                                        }
                                        if (v29 /* !! */  != false) break block61;
                                    }
                                    catch (n9 v31) {
                                        throw m44.a("k", (Object)v31, (long)-3195619165816773578L, (long)var2_2);
                                    }
                                    return var1_1.equals(loj.a("d", (int)15216, (long)(345958238560496261L ^ var2_2)));
                                }
                                catch (n9 v32) {
                                    throw m44.a("k", (Object)v32, (long)-3195619165816773578L, (long)var2_2);
                                }
                            }
                            v29 /* !! */  = (CallSite)true;
                        }
                        return (boolean)v29 /* !! */ ;
                    }
                    v33 = new Object[3];
                    v33[2] = var4_3;
                    v33[1] = var14_9;
                    v33[0] = var1_1;
                    v25 = m44.a("t", (Object)this, (Object)v33, (long)-3109165011746028258L, (long)var2_2);
                }
                return (boolean)v25;
            }
            v16 = this.d(var1_1, var4_3, var8_6);
        }
        return v16;
    }

    public loj(ai ai2, _6 _62, long l10) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x55D7EE1C652EL;
        long l13 = l11 ^ 0x327BF4339B45L;
        int n10 = (int)(l13 >>> 32);
        int n11 = (int)(l13 << 32 >>> 48);
        int n12 = (int)(l13 << 48 >>> 48);
        this.n = new ol(n10, (short)n11, (short)n12);
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        this.w = m44.a("k", (Object)objectArray, (long)-9130256372042111576L, (long)l10);
        this.V = ai2;
        this.v = _62;
    }

    public void S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x17D3DE656F66L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("u", (Object)m44.a("t", (Object)this, (long)1317766446282474105L, (long)l10), (Object)objectArray2, (long)667694514190926034L, (long)l10);
    }

    boolean d(String string, String string2, long l10) {
        boolean bl2;
        block4: {
            long l11;
            block5: {
                l11 = (l10 = a ^ l10) ^ 0x4CF07A63E0CFL;
                CallSite callSite = m44.a("j", (long)7012265154321618304L, (long)l10);
                try {
                    try {
                        bl2 = string.equals(string2);
                        if (callSite != null) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)8694073887454269239L, (long)l10);
                    }
                    return true;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)8694073887454269239L, (long)l10);
                }
            }
            bl2 = this.V.O(l11, string, string2);
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    private String H(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [23[DOLOOP], 22[WHILELOOP]], but top level block is 10[TRYBLOCK]
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean L(Object[] var1_1) {
        block33: {
            block34: {
                block31: {
                    block29: {
                        block30: {
                            block27: {
                                block28: {
                                    block25: {
                                        block26: {
                                            var5_2 = (String)var1_1[0];
                                            var4_3 = (String)var1_1[1];
                                            var6_4 = (String)var1_1[2];
                                            var2_5 = (Long)var1_1[3];
                                            var7_6 = (var2_5 = loj.a ^ var2_5) ^ 110782695434454L;
                                            var10_7 = var5_2.lastIndexOf("[") + 1;
                                            var9_8 = m44.a("k", (long)2247825727385955297L, (long)var2_5);
                                            var11_9 = var4_3.lastIndexOf("[") + 1;
                                            var12_10 = var5_2.substring(var10_7);
                                            var13_11 = var4_3.substring(var11_9);
                                            try {
                                                try {
                                                    v0 = var10_7;
                                                    v1 = var11_9;
                                                    if (var9_8 != null) break block25;
                                                    if (v0 >= v1) break block26;
                                                }
                                                catch (n9 v2) {
                                                    throw m44.a("k", (Object)v2, (long)488356561422676310L, (long)var2_5);
                                                }
                                                return false;
                                            }
                                            catch (n9 v3) {
                                                throw m44.a("k", (Object)v3, (long)488356561422676310L, (long)var2_5);
                                            }
                                        }
                                        v0 = var10_7;
                                        v1 = var11_9;
                                    }
                                    try {
                                        try {
                                            v4 = var9_8;
                                            if (var2_5 >= 0L) {
                                                if (v4 != null) break block27;
                                                if (v0 <= v1) break block28;
                                            }
                                            ** GOTO lbl51
                                        }
                                        catch (n9 v5) {
                                            throw m44.a("k", (Object)v5, (long)488356561422676310L, (long)var2_5);
                                        }
                                        return var13_11.equals(loj.a("d", (int)23772, (long)(5241150122594342991L ^ var2_5)));
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("k", (Object)v6, (long)488356561422676310L, (long)var2_5);
                                    }
                                }
                                v0 = var12_10.length();
                                v1 = 1;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            v4 = var9_8;
lbl51:
                                            // 2 sources

                                            if (v4 != null) break block29;
                                            if (v0 != v1) break block30;
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("k", (Object)v7, (long)488356561422676310L, (long)var2_5);
                                        }
                                        v0 = var13_11.length();
                                        v1 = 1;
                                        if (var2_5 <= 0L || var9_8 != null) break block29;
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("k", (Object)v8, (long)488356561422676310L, (long)var2_5);
                                    }
                                    if (v0 != v1) break block30;
                                }
                                catch (n9 v9) {
                                    throw m44.a("k", (Object)v9, (long)488356561422676310L, (long)var2_5);
                                }
                                return var12_10.equals(var13_11);
                            }
                            catch (n9 v10) {
                                throw m44.a("k", (Object)v10, (long)488356561422676310L, (long)var2_5);
                            }
                        }
                        try {
                            v0 = var12_10.length();
                            if (var9_8 != null) break block31;
                            v1 = 1;
                        }
                        catch (n9 v11) {
                            throw m44.a("k", (Object)v11, (long)488356561422676310L, (long)var2_5);
                        }
                    }
                    try {
                        block32: {
                            try {
                                try {
                                    if (v0 == v1) break block32;
                                    v12 = var13_11.length();
                                    if (var9_8 != null) break block33;
                                }
                                catch (n9 v13) {
                                    throw m44.a("k", (Object)v13, (long)488356561422676310L, (long)var2_5);
                                }
                                if (!v12) break block34;
                            }
                            catch (n9 v14) {
                                throw m44.a("k", (Object)v14, (long)488356561422676310L, (long)var2_5);
                            }
                        }
                        v0 = 0;
                    }
                    catch (n9 v15) {
                        throw m44.a("k", (Object)v15, (long)488356561422676310L, (long)var2_5);
                    }
                }
                return (boolean)v0;
            }
            v12 = this.n(var12_10, var7_6, var13_11, var6_4);
        }
        return v12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String j(char var1_1, int var2_2, String var3_3, short var4_4, String var5_5, String var6_6) {
        block104: {
            block102: {
                block97: {
                    block84: {
                        block103: {
                            block99: {
                                block98: {
                                    block95: {
                                        block96: {
                                            block93: {
                                                block94: {
                                                    block105: {
                                                        block89: {
                                                            block90: {
                                                                block91: {
                                                                    block92: {
                                                                        block79: {
                                                                            block80: {
                                                                                block85: {
                                                                                    block86: {
                                                                                        block87: {
                                                                                            block88: {
                                                                                                block83: {
                                                                                                    block81: {
                                                                                                        block82: {
                                                                                                            block78: {
                                                                                                                block77: {
                                                                                                                    block75: {
                                                                                                                        block76: {
                                                                                                                            v0 = var7_7 = ((long)var1_1 << 48 | (long)var2_2 << 32 >>> 16 | (long)var4_4 << 48 >>> 48) ^ loj.a;
                                                                                                                            var9_8 = v0 ^ 100662952796734L;
                                                                                                                            v1 = v0 ^ 100498702255898L;
                                                                                                                            var11_9 = (int)(v1 >>> 48);
                                                                                                                            var12_10 = (int)(v1 << 16 >>> 48);
                                                                                                                            var13_11 = (int)(v1 << 32 >>> 32);
                                                                                                                            var14_12 = v0 ^ 30801938288610L;
                                                                                                                            var16_13 = v0 ^ 110907840053188L;
                                                                                                                            var18_14 = v0 ^ 22984097651586L;
                                                                                                                            var20_15 = v0 ^ 67867885413083L;
                                                                                                                            var22_16 = v0 ^ 56782236063719L;
                                                                                                                            var24_17 = v0 ^ 15254122994057L;
                                                                                                                            var26_18 = v0 ^ 81036409392918L;
                                                                                                                            var28_19 = v0 ^ 32772157364334L;
                                                                                                                            var31_20 = this.Y(var26_18);
                                                                                                                            var30_21 = m44.a("m", (long)-164449501573674649L, (long)var7_7);
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v2 = var3_3;
                                                                                                                                    if (var30_21 != null) break block75;
                                                                                                                                    if (!v2.equals(var5_5)) break block76;
                                                                                                                                }
                                                                                                                                catch (n9 v3) {
                                                                                                                                    throw m44.a("m", (Object)v3, (long)-1999353941750410288L, (long)var7_7);
                                                                                                                                }
                                                                                                                                return var3_3;
                                                                                                                            }
                                                                                                                            catch (n9 v4) {
                                                                                                                                throw m44.a("m", (Object)v4, (long)-1999353941750410288L, (long)var7_7);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v2 = (String)m44.a("s", (Object)this, (long)-527334314573141858L, (long)var7_7).m(var18_14, var3_3, var5_5);
                                                                                                                    }
                                                                                                                    var32_22 = v2;
                                                                                                                    try {
                                                                                                                        v5 = var32_22;
                                                                                                                        if (var30_21 != null) break block77;
                                                                                                                        if (v5 == null) break block78;
                                                                                                                    }
                                                                                                                    catch (n9 v6) {
                                                                                                                        throw m44.a("m", (Object)v6, (long)-1999353941750410288L, (long)var7_7);
                                                                                                                    }
                                                                                                                    v5 = var32_22;
                                                                                                                }
                                                                                                                return v5;
                                                                                                            }
                                                                                                            var33_23 = null;
                                                                                                            var34_24 = null;
                                                                                                            var35_25 = loj.A(var3_3, var14_12);
                                                                                                            var36_26 = loj.A(var5_5, var14_12);
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v7 = var35_25.charAt(0);
                                                                                                                            v8 = loj.b("s", (int)5078, (long)(7955074258045855451L ^ var7_7));
                                                                                                                            if (var30_21 != null) break block79;
                                                                                                                            if (v7 != v8) break block80;
                                                                                                                        }
                                                                                                                        catch (n9 v9) {
                                                                                                                            throw m44.a("m", (Object)v9, (long)-1999353941750410288L, (long)var7_7);
                                                                                                                        }
                                                                                                                        if (var2_2 <= 0) break block81;
                                                                                                                        v10 = var36_26;
                                                                                                                        if (var30_21 != null) break block82;
                                                                                                                    }
                                                                                                                    catch (n9 v11) {
                                                                                                                        throw m44.a("m", (Object)v11, (long)-1999353941750410288L, (long)var7_7);
                                                                                                                    }
                                                                                                                    if (v10.charAt(0) != loj.b("s", (int)5078, (long)(7955074258045855451L ^ var7_7))) break block83;
                                                                                                                }
                                                                                                                catch (n9 v12) {
                                                                                                                    throw m44.a("m", (Object)v12, (long)-1999353941750410288L, (long)var7_7);
                                                                                                                }
                                                                                                                v13 = new Object[4];
                                                                                                                v13[3] = var6_6;
                                                                                                                v13[2] = var36_26;
                                                                                                                v13[1] = var28_19;
                                                                                                                v13[0] = var35_25;
                                                                                                                v10 = m44.a("r", (Object)this, (Object)v13, (long)-395618689350135598L, (long)var7_7);
                                                                                                            }
                                                                                                            catch (n9 v14) {
                                                                                                                throw m44.a("m", (Object)v14, (long)-1999353941750410288L, (long)var7_7);
                                                                                                            }
                                                                                                        }
                                                                                                        var32_22 = v10;
                                                                                                    }
                                                                                                    if (var30_21 == null) break block84;
                                                                                                }
                                                                                                var34_24 = this.v.g(var36_26, var31_20, var22_16, var6_6);
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var30_21 != null) break block84;
                                                                                                            v15 = var34_24.t(var9_8);
                                                                                                            if (var1_1 < '\u0000') break block85;
                                                                                                            if (v15 == 0) break block86;
                                                                                                        }
                                                                                                        catch (n9 v16) {
                                                                                                            throw m44.a("m", (Object)v16, (long)-1999353941750410288L, (long)var7_7);
                                                                                                        }
                                                                                                        if (var4_4 < 0) break block87;
                                                                                                        v17 = var36_26;
                                                                                                        if (var30_21 != null) break block88;
                                                                                                    }
                                                                                                    catch (n9 v18) {
                                                                                                        throw m44.a("m", (Object)v18, (long)-1999353941750410288L, (long)var7_7);
                                                                                                    }
                                                                                                    v19 = v17.equals(loj.a("d", (int)14289, (long)(4739274803274289605L ^ var7_7)));
                                                                                                    if (var1_1 < '\u0000') ** GOTO lbl115
                                                                                                    if (v19 != 0) {
                                                                                                    }
                                                                                                    ** GOTO lbl114
                                                                                                }
                                                                                                catch (n9 v20) {
                                                                                                    throw m44.a("m", (Object)v20, (long)-1999353941750410288L, (long)var7_7);
                                                                                                }
                                                                                                v17 = loj.a("d", (int)253, (long)(101786675529197290L ^ var7_7));
                                                                                                if (var4_4 <= 0) break block88;
                                                                                                var32_22 = v17;
                                                                                                try {
                                                                                                    if (var30_21 == null) break block84;
lbl114:
                                                                                                    // 2 sources

                                                                                                    v19 = 23772;
lbl115:
                                                                                                    // 2 sources

                                                                                                    v17 = loj.a("d", (int)v19, (long)(5241184870249528009L ^ var7_7));
                                                                                                }
                                                                                                catch (n9 v21) {
                                                                                                    throw m44.a("m", (Object)v21, (long)-1999353941750410288L, (long)var7_7);
                                                                                                }
                                                                                            }
                                                                                            var32_22 = v17;
                                                                                        }
                                                                                        if (var30_21 == null) break block84;
                                                                                    }
                                                                                    v15 = 23772;
                                                                                }
                                                                                var32_22 = loj.a("d", (int)v15, (long)(5241184870249528009L ^ var7_7));
                                                                                break block84;
                                                                            }
                                                                            v7 = var36_26.charAt(0);
                                                                            v8 = loj.b("s", (int)5078, (long)(7955074258045855451L ^ var7_7));
                                                                        }
                                                                        if (v7 != v8) break block105;
                                                                        var33_23 = this.v.g(var35_25, var31_20, var22_16, var6_6);
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var30_21 != null) break block84;
                                                                                    v22 = var33_23.t(var9_8);
                                                                                    if (var4_4 <= 0) break block89;
                                                                                    if (v22 == 0) break block90;
                                                                                }
                                                                                catch (n9 v23) {
                                                                                    throw m44.a("m", (Object)v23, (long)-1999353941750410288L, (long)var7_7);
                                                                                }
                                                                                if (var2_2 < 0) break block91;
                                                                                v24 = var35_25;
                                                                                if (var30_21 != null) break block92;
                                                                            }
                                                                            catch (n9 v25) {
                                                                                throw m44.a("m", (Object)v25, (long)-1999353941750410288L, (long)var7_7);
                                                                            }
                                                                            v26 = v24.equals(loj.a("d", (int)14289, (long)(4739274803274289605L ^ var7_7)));
                                                                            if (var1_1 < '\u0000') ** GOTO lbl164
                                                                            if (v26 != 0) {
                                                                            }
                                                                            ** GOTO lbl163
                                                                        }
                                                                        catch (n9 v27) {
                                                                            throw m44.a("m", (Object)v27, (long)-1999353941750410288L, (long)var7_7);
                                                                        }
                                                                        v24 = loj.a("d", (int)7402, (long)(9210245164166560508L ^ var7_7));
                                                                        if (var2_2 < 0) break block92;
                                                                        var32_22 = v24;
                                                                        try {
                                                                            if (var30_21 == null) break block84;
lbl163:
                                                                            // 2 sources

                                                                            v26 = 23772;
lbl164:
                                                                            // 2 sources

                                                                            v24 = loj.a("d", (int)v26, (long)(5241184870249528009L ^ var7_7));
                                                                        }
                                                                        catch (n9 v28) {
                                                                            throw m44.a("m", (Object)v28, (long)-1999353941750410288L, (long)var7_7);
                                                                        }
                                                                    }
                                                                    var32_22 = v24;
                                                                }
                                                                if (var30_21 == null) break block84;
                                                            }
                                                            v22 = 23772;
                                                        }
                                                        var32_22 = loj.a("d", (int)v22, (long)(5241184870249528009L ^ var7_7));
                                                        break block84;
                                                    }
                                                    var33_23 = this.v.g(var35_25, var31_20, var22_16, var6_6);
                                                    var34_24 = this.v.g(var36_26, var31_20, var22_16, var6_6);
                                                    try {
                                                        try {
                                                            try {
                                                                v29 = var30_21;
                                                                if (var1_1 >= '\u0000') {
                                                                    if (v29 != null) break block93;
                                                                    if (var33_23.t(var9_8)) break block94;
                                                                }
                                                                ** GOTO lbl216
                                                            }
                                                            catch (n9 v30) {
                                                                throw m44.a("m", (Object)v30, (long)-1999353941750410288L, (long)var7_7);
                                                            }
                                                            v31 = var34_24;
                                                            v32 = var30_21;
                                                            if (var1_1 < '\u0000') break block95;
                                                            if (v32 != null) break block96;
                                                        }
                                                        catch (n9 v33) {
                                                            throw m44.a("m", (Object)v33, (long)-1999353941750410288L, (long)var7_7);
                                                        }
                                                        if (v31.t(var9_8)) {
                                                        }
                                                        ** GOTO lbl218
                                                    }
                                                    catch (n9 v34) {
                                                        throw m44.a("m", (Object)v34, (long)-1999353941750410288L, (long)var7_7);
                                                    }
                                                }
                                                v35 = new Object[5];
                                                v35[4] = var34_24;
                                                v35[3] = var36_26;
                                                v35[2] = var33_23;
                                                v35[1] = var35_25;
                                                v35[0] = var24_17;
                                                var32_22 = m44.a("l", (Object)this, (Object)v35, (long)-1936140072664976291L, (long)var7_7);
                                            }
                                            try {
                                                v29 = var30_21;
lbl216:
                                                // 2 sources

                                                if (var2_2 <= 0) break block97;
                                                if (v29 == null) break block84;
lbl218:
                                                // 2 sources

                                                v31 = var33_23;
                                            }
                                            catch (n9 v36) {
                                                throw m44.a("m", (Object)v36, (long)-1999353941750410288L, (long)var7_7);
                                            }
                                        }
                                        v37 = new Object[3];
                                        v37[2] = var31_20;
                                        v37[1] = this.v;
                                        v32 = v37;
                                        v37[0] = var20_15;
                                    }
                                    var37_27 = m44.a("r", (Object)v31, (Object)v32, (long)-545204447577619306L, (long)var7_7);
                                    v38 = new Object[3];
                                    v38[2] = var31_20;
                                    v38[1] = this.v;
                                    v38[0] = var20_15;
                                    var38_28 = m44.a("r", (Object)var34_24, (Object)v38, (long)-545204447577619306L, (long)var7_7);
                                    var39_29 = var37_27.size();
                                    try {
                                        v39 /* !! */  = m44.a("r", (Object)var38_28, (Object)var35_25, (long)-1765469411538988827L, (long)var7_7);
                                        v40 = var30_21;
                                        if (var4_4 <= 0) ** GOTO lbl265
                                        if (v40 != null) break block98;
                                        if (v39 /* !! */  != false) {
                                        }
                                        ** GOTO lbl258
                                    }
                                    catch (n9 v41) {
                                        throw m44.a("m", (Object)v41, (long)-1999353941750410288L, (long)var7_7);
                                    }
                                    v42 = new Object[2];
                                    v42[1] = var35_25;
                                    v42[0] = var16_13;
                                    var32_22 = m44.a("m", (Object)v42, (long)-2087713398880611895L, (long)var7_7);
                                    try {
                                        v29 = var30_21;
                                        if (var4_4 < 0) break block97;
                                        if (v29 == null) break block84;
lbl258:
                                        // 2 sources

                                        v39 /* !! */  = m44.a("r", (Object)var37_27, (Object)var36_26, (long)-1765469411538988827L, (long)var7_7);
                                    }
                                    catch (n9 v43) {
                                        throw m44.a("m", (Object)v43, (long)-1999353941750410288L, (long)var7_7);
                                    }
                                }
                                try {
                                    v40 = var30_21;
lbl265:
                                    // 2 sources

                                    if (v40 != null) break block99;
                                    if (v39 /* !! */  != false) {
                                    }
                                    ** GOTO lbl280
                                }
                                catch (n9 v44) {
                                    throw m44.a("m", (Object)v44, (long)-1999353941750410288L, (long)var7_7);
                                }
                                v45 = new Object[2];
                                v45[1] = var36_26;
                                v45[0] = var16_13;
                                var32_22 = m44.a("m", (Object)v45, (long)-2087713398880611895L, (long)var7_7);
                                try {
                                    v29 = var30_21;
                                    if (var2_2 <= 0) break block97;
                                    if (v29 == null) break block84;
lbl280:
                                    // 2 sources

                                    v39 /* !! */  = (reference)false;
                                }
                                catch (n9 v46) {
                                    throw m44.a("m", (Object)v46, (long)-1999353941750410288L, (long)var7_7);
                                }
                            }
                            var40_30 = v39 /* !! */ ;
                            while (var40_30 < var39_29) {
                                block100: {
                                    block101: {
                                        var41_31 = (String)var37_27.get((int)var40_30);
                                        try {
                                            try {
                                                v47 = var30_21;
                                                if (var2_2 < 0) break block100;
                                                if (v47 != null) break block101;
                                                v48 = var38_28;
                                                if (var30_21 != null) break block102;
                                            }
                                            catch (n9 v49) {
                                                throw m44.a("m", (Object)v49, (long)-1999353941750410288L, (long)var7_7);
                                            }
                                            if (v48.indexOf(var41_31) != -1) {
                                            }
                                            ** GOTO lbl330
                                        }
                                        catch (n9 v50) {
                                            throw m44.a("m", (Object)v50, (long)-1999353941750410288L, (long)var7_7);
                                        }
                                        v51 = new Object[2];
                                        v51[1] = var41_31;
                                        v51[0] = var16_13;
                                        var32_22 = m44.a("m", (Object)v51, (long)-2087713398880611895L, (long)var7_7);
                                        try {
                                            v52 = var32_22;
                                            v53 = var30_21;
                                            if (var1_1 >= '\u0000') {
                                                if (v53 != null) break block103;
                                                if (!v52.equals(loj.a("d", (int)23772, (long)(5241184870249528009L ^ var7_7)))) break;
                                            }
                                            ** GOTO lbl343
                                        }
                                        catch (n9 v54) {
                                            throw m44.a("m", (Object)v54, (long)-1999353941750410288L, (long)var7_7);
                                        }
                                        v55 = new Object[5];
                                        v55[4] = var34_24;
                                        v55[3] = var36_26;
                                        v55[2] = var33_23;
                                        v55[1] = var35_25;
                                        v55[0] = var24_17;
                                        var32_22 = m44.a("l", (Object)this, (Object)v55, (long)-1936140072664976291L, (long)var7_7);
                                        try {
                                            if (var4_4 >= 0) {
                                                if (var30_21 == null) break;
                                            }
                                            break block101;
lbl330:
                                            // 2 sources

                                            ++var40_30;
                                        }
                                        catch (n9 v56) {
                                            throw m44.a("m", (Object)v56, (long)-1999353941750410288L, (long)var7_7);
                                        }
                                    }
                                    v47 = var30_21;
                                }
                                if (v47 == null) continue;
                            }
                            if (var4_4 <= 0) break block102;
                            v52 = var32_22;
                        }
                        try {
                            v53 = var30_21;
lbl343:
                            // 2 sources

                            if (v53 != null) break block104;
                            if (v52 != null) break block84;
                        }
                        catch (n9 v57) {
                            throw m44.a("m", (Object)v57, (long)-1999353941750410288L, (long)var7_7);
                        }
                        var32_22 = loj.a("d", (int)23772, (long)(5241184870249528009L ^ var7_7));
                    }
                    v29 = m44.a("s", (Object)this, (long)-527334314573141858L, (long)var7_7).h((short)var11_9, (char)var12_10, var3_3, var13_11, var5_5, var32_22);
                }
                v48 = m44.a("s", (Object)this, (long)-527334314573141858L, (long)var7_7).h((short)var11_9, (char)var12_10, var5_5, var13_11, var3_3, var32_22);
            }
            v52 = var32_22;
        }
        return v52;
    }

    /*
     * Exception decompiling
     */
    public boolean x(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[TRYBLOCK]], but top level block is 47[SWITCH]
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

    boolean m(Object[] objectArray) {
        String string;
        long l10;
        long l11;
        long l12;
        String string2;
        block5: {
            boolean bl2;
            block4: {
                v7 v72 = (v7)objectArray[0];
                string2 = (String)objectArray[1];
                long l13 = (Long)objectArray[2];
                long l14 = l13 = a ^ l13;
                l12 = l14 ^ 0x3BCFB3CC1D73L;
                long l15 = l14 ^ 0x7C417AD030AFL;
                l11 = l14 ^ 0x53E67D45A8AAL;
                l10 = l14 ^ 0x29F11A22705BL;
                string = loj.A(v72.h(), l15);
                CallSite callSite = m44.a("h", (long)-4397023628480137686L, (long)l13);
                try {
                    try {
                        bl2 = string.charAt(0);
                        if (callSite != null) break block4;
                        if (bl2 != loj.b("s", (int)5078, (long)(0x6E6679A108EA5996L ^ l13))) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-2662262433607340899L, (long)l13);
                    }
                    bl2 = false;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-2662262433607340899L, (long)l13);
                }
            }
            return bl2;
        }
        _v _v2 = this.v.g(string, this.Y(l10), l11, string2);
        return _v2.t(l12);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        loj.a = prr.a(8904844134547705346L, 4305662933353945913L, MethodHandles.lookup().lookupClass()).a(277539443577144L);
                        loj.d = new HashMap<K, V>(13);
                        var11 = loj.a ^ 36617752346625L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[8];
                        var18_4 = 0;
                        var17_5 = "\u00e3\u00e3\u00f1\u00fc\u00e3:\u00c2Wc\u00a9MC\u00bb\u00f4\u00b4\u00e8\u00003=\u00b9\u00b7%\u007f2\u00c1\u00b8-\u00da'#t\u001e&\u0018\u00b9i\u00ea\u0089\u00d7\u00fd(\u0016\u00b4U\u00ee\u009cA\u00ac'\u001e\u00a6Y\u00fd\u00c1\u009fh\u00ael{A\u00b4g6^!\u00e5\\\u00ab\u0014t\u0012\u00c0dJDK?'\u00a5\u00a2E(3\u00daU\u00a0\u0001yH\u00cd\u0085\u00a5\u0003\u0013\u0013\u000f[\u00d5\u0098\u00e7\u00c8#\u0005\u00d4\u00f5F0`\u008e3,\u0084\u00d8n\u00ee\u00fdj\u00db\u00b4-\u00f4\u009f(6\u00fe~Q\u00d8\u000f5\u00b8lx'\u0081\u001f\u001c\u008e\u00e0\u0010C\u0089\u0002\u00b04y\u00aa\u009bar\u0094I-g\u00d4%\u00cb\u008c\u00ff\u00de\n\u0097\u00e9(\u008d^O\u000b\"\u00d0e\u00be\u0001qM\u0086\u00f4\u00be\u0088\r{\u0097\u00bd\u00b1\u00f3\u00e9D5\u0014\u0005\u00ab\u0012\u009f\u00c8\u0019\bU\u00bf\u00cc\u00fb\u00a3\u00cb\u008d\u00b9(\u00df2\u0085\u00d5`\u00d5|6\u00ac&!\u00c8\u00cc\u00f1\u0084\u0099a\u0092MH\u00a4\u008a\u0095X\b\u00ac\u00e8\u00b7\u00ce\u00e6\u008f\u00e2\u00e5o\u00eb\u0016>-A\u00b2";
                        var19_6 = "\u00e3\u00e3\u00f1\u00fc\u00e3:\u00c2Wc\u00a9MC\u00bb\u00f4\u00b4\u00e8\u00003=\u00b9\u00b7%\u007f2\u00c1\u00b8-\u00da'#t\u001e&\u0018\u00b9i\u00ea\u0089\u00d7\u00fd(\u0016\u00b4U\u00ee\u009cA\u00ac'\u001e\u00a6Y\u00fd\u00c1\u009fh\u00ael{A\u00b4g6^!\u00e5\\\u00ab\u0014t\u0012\u00c0dJDK?'\u00a5\u00a2E(3\u00daU\u00a0\u0001yH\u00cd\u0085\u00a5\u0003\u0013\u0013\u000f[\u00d5\u0098\u00e7\u00c8#\u0005\u00d4\u00f5F0`\u008e3,\u0084\u00d8n\u00ee\u00fdj\u00db\u00b4-\u00f4\u009f(6\u00fe~Q\u00d8\u000f5\u00b8lx'\u0081\u001f\u001c\u008e\u00e0\u0010C\u0089\u0002\u00b04y\u00aa\u009bar\u0094I-g\u00d4%\u00cb\u008c\u00ff\u00de\n\u0097\u00e9(\u008d^O\u000b\"\u00d0e\u00be\u0001qM\u0086\u00f4\u00be\u0088\r{\u0097\u00bd\u00b1\u00f3\u00e9D5\u0014\u0005\u00ab\u0012\u009f\u00c8\u0019\bU\u00bf\u00cc\u00fb\u00a3\u00cb\u008d\u00b9(\u00df2\u0085\u00d5`\u00d5|6\u00ac&!\u00c8\u00cc\u00f1\u0084\u0099a\u0092MH\u00a4\u008a\u0095X\b\u00ac\u00e8\u00b7\u00ce\u00e6\u008f\u00e2\u00e5o\u00eb\u0016>-A\u00b2".length();
                        var16_7 = 40;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = loj.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00a1\u0005\u00a7\u00c1\u00ce[h1c\u0089'\u00f0Y\u00db\u0094 {\u00a2\u009f\u001d[\u00ce\u0083\u00e0\u00d4\u00a9\u0098\u00eau\u00b7\u0095\u00c8_,M\u0010\u001bi\u001d\u00da(\u001dw\u0015\u00a9\u00be\u0005^\u001c\u00ec\u00ed\u00d1\u00bf\u0018#\u00e2F\u00a7\u0084\u009c\u00db\u009b\"\u00ef\u00fb\u00ad\u00bd\u00f41\u0088>o\u009c\u0015\u00c9?\u0000*z\u00c3\u00ca";
                            var19_6 = "\u00a1\u0005\u00a7\u00c1\u00ce[h1c\u0089'\u00f0Y\u00db\u0094 {\u00a2\u009f\u001d[\u00ce\u0083\u00e0\u00d4\u00a9\u0098\u00eau\u00b7\u0095\u00c8_,M\u0010\u001bi\u001d\u00da(\u001dw\u0015\u00a9\u00be\u0005^\u001c\u00ec\u00ed\u00d1\u00bf\u0018#\u00e2F\u00a7\u0084\u009c\u00db\u009b\"\u00ef\u00fb\u00ad\u00bd\u00f41\u0088>o\u009c\u0015\u00c9?\u0000*z\u00c3\u00ca".length();
                            var16_7 = 40;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = loj.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                loj.b = var20_3;
                loj.c = new String[8];
                loj.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[20];
                var3_13 = 0;
                var4_14 = "\u0012\u00e2\u00ee\u00ee\u00ee\u008aa\u00c2\u00bc\u00e3\\\u00eb\tT\u00d1\u00c0\u0084\u00e5\u00d1Cy\u0085\u001b\u0084\u00b3\u00ee\n\u008aC\u00ef)$\u00970\u000b\"\u00c3\u00be\b\u00e4\u00923\u001cL\u00c7S\u0080\u00fbPn\u0090\u00e5\u00a5S\u008b\u00a8[\u00da\u00db\u00f8\u00f9\u0099D\u00fb\u001d\u0087\u0010\u007f'\u00d3\u0018\u00ac\u00c4\u0093*\u00b8\u0091\r(1\u00ebs\u0085\u00e6\u00d7R\u009a#\u00f1\u0086\n\u00ecU\u00d0\u00166\u0089\u00a1\u00d0\u0011\u0098\u00a7&7\b\u00bdN6\u0083\u00ee\n^)\u00ae\u00cf\u00ab\u0085\u0010\u001f`@;\u00a2]<\u0019\u001e\u001d:j\u00af\u00b3\u00fdM\u00e8l\t\u0083\u00f9C\u00b4\u00af\u00f4\u00aa";
                var5_15 = "\u0012\u00e2\u00ee\u00ee\u00ee\u008aa\u00c2\u00bc\u00e3\\\u00eb\tT\u00d1\u00c0\u0084\u00e5\u00d1Cy\u0085\u001b\u0084\u00b3\u00ee\n\u008aC\u00ef)$\u00970\u000b\"\u00c3\u00be\b\u00e4\u00923\u001cL\u00c7S\u0080\u00fbPn\u0090\u00e5\u00a5S\u008b\u00a8[\u00da\u00db\u00f8\u00f9\u0099D\u00fb\u001d\u0087\u0010\u007f'\u00d3\u0018\u00ac\u00c4\u0093*\u00b8\u0091\r(1\u00ebs\u0085\u00e6\u00d7R\u009a#\u00f1\u0086\n\u00ecU\u00d0\u00166\u0089\u00a1\u00d0\u0011\u0098\u00a7&7\b\u00bdN6\u0083\u00ee\n^)\u00ae\u00cf\u00ab\u0085\u0010\u001f`@;\u00a2]<\u0019\u001e\u001d:j\u00af\u00b3\u00fdM\u00e8l\t\u0083\u00f9C\u00b4\u00af\u00f4\u00aa".length();
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
                    var4_14 = "\u009bJGpu\u00d00\u008f\u00f5P\u00fe\u0001\u0088\u0099&\u0080";
                    var5_15 = "\u009bJGpu\u00d00\u008f\u00f5P\u00fe\u0001\u0088\u0099&\u0080".length();
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
        loj.e = var6_12;
        loj.f = new Integer[20];
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x48D9;
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
                throw new RuntimeException("com/zelix/loj", exception);
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
            loj.c[n11] = loj.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = loj.a(n10, l10);
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
            throw new RuntimeException("com/zelix/loj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1BD4;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/loj", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            loj.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = loj.b(n10, l10);
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
            throw new RuntimeException("com/zelix/loj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(loj.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(loj.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

