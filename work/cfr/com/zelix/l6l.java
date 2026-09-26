/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ah;
import com.zelix.ge;
import com.zelix.lkp;
import com.zelix.loz;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l6l
implements lkp,
loz {
    boolean K;
    int d;
    ah T;
    boolean V;
    String f;
    Vector B;
    String n;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map e;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    String R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x15C397EDBBA2L;
        long l13 = l11 ^ 0x6337C7181571L;
        long l14 = l11 ^ 0x76DF708E3AD7L;
        m44.a("t", (Object)this, (boolean)true, (long)-4645228595841153093L, (long)l10);
        StringTokenizer stringTokenizer = new StringTokenizer((String)((Object)m44.a("v", (Object)this, (long)-4614349116668806886L, (long)l10)), (String)((Object)l6l.a("x", (int)19674, (long)(0x46096396EA8E7F3AL ^ l10))));
        CallSite callSite = m44.a("h", (long)-4758673588903241085L, (long)l10);
        m44.a("t", (Object)this, (String)stringTokenizer.nextToken().trim(), (long)-6736004148776549242L, (long)l10);
        String string = stringTokenizer.nextToken();
        StringTokenizer stringTokenizer2 = new StringTokenizer(string, ",");
        while (stringTokenizer2.hasMoreTokens()) {
            block8: {
                ge ge2;
                block7: {
                    CallSite callSite2;
                    block6: {
                        String string2 = stringTokenizer2.nextToken();
                        ge2 = new ge(l14, (ah)((Object)m44.a("v", (Object)this, (long)-6406720732186742875L, (long)l10)), string2);
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l13;
                        CallSite callSite3 = m44.a("w", (Object)ge2, (Object)objectArray2, (long)-6492951337011728990L, (long)l10);
                        try {
                            callSite2 = callSite3;
                            if (callSite == null) break block6;
                            if (callSite2 == null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)n92, (long)-6411867643237234122L, (long)l10);
                        }
                        callSite2 = callSite3;
                    }
                    return callSite2;
                }
                try {
                    if (l10 < 0L) break block8;
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l12;
                    if (m44.a("w", (Object)ge2, (Object)objectArray3, (long)-4746315781882060988L, (long)l10) != false) {
                        return (String)((Object)l6l.a("x", (int)27789, (long)(0x47C300D143FBDF6FL ^ l10))) + (String)((Object)m44.a("v", (Object)this, (long)-4614349116668806886L, (long)l10)) + "'";
                    }
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-6411867643237234122L, (long)l10);
                }
                ((Vector)((Object)m44.a("v", (Object)this, (long)-5024996073940293005L, (long)l10))).addElement(ge2);
            }
            if (callSite != null) continue;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean k(Object[] objectArray) {
        boolean bl2;
        block29: {
            l6l l6l2;
            void var10_10;
            ge ge2;
            CallSite callSite;
            long l10;
            long l11;
            block26: {
                Object object;
                void var10_8;
                long l12;
                boolean bl3;
                block22: {
                    CallSite callSite2;
                    Object object2;
                    block23: {
                        bl3 = (Boolean)objectArray[0];
                        l11 = (Long)objectArray[1];
                        long l13 = l11;
                        l10 = l13 ^ 0x5C89DE38EBA5L;
                        l12 = l13 ^ 0L;
                        callSite = m44.a("l", (long)4022236455885607079L, (long)l11);
                        try {
                            try {
                                object2 = m44.a("r", (Object)this, (long)3596708360978155447L, (long)l11);
                                if (callSite == null) break block22;
                                if (object2 == false) break block23;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)n92, (long)3251714870161539090L, (long)l11);
                            }
                            return true;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)n93, (long)3251714870161539090L, (long)l11);
                        }
                    }
                    object2 = callSite2 = (Object)false;
                }
                while (var10_8 < ((Vector)((Object)m44.a("r", (Object)this, (long)3487951711805235287L, (long)l11))).size()) {
                    CallSite callSite3;
                    block24: {
                        block25: {
                            block27: {
                                ge2 = (ge)((Vector)((Object)m44.a("r", (Object)this, (long)3487951711805235287L, (long)l11))).elementAt((int)var10_8);
                                try {
                                    try {
                                        try {
                                            callSite3 = callSite;
                                            if (l11 < 0L) break block24;
                                            if (callSite3 == null) break block25;
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l12;
                                            objectArray2[0] = bl3;
                                            object = m44.a("s", (Object)ge2, (Object)objectArray2, (long)3228131113560907707L, (long)l11);
                                            if (callSite == null) break block26;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("l", (Object)n94, (long)3251714870161539090L, (long)l11);
                                        }
                                        if (object) break block27;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("l", (Object)n95, (long)3251714870161539090L, (long)l11);
                                    }
                                    return false;
                                }
                                catch (n9 n96) {
                                    throw m44.a("l", (Object)n96, (long)3251714870161539090L, (long)l11);
                                }
                            }
                            ++var10_8;
                        }
                        callSite3 = callSite;
                    }
                    if (callSite3 != null) continue;
                }
                if (l11 >= 0L) {
                    boolean bl4;
                    object = bl4 = false;
                }
            }
            block19: while (var10_10 < ((Vector)((Object)m44.a("r", (Object)this, (long)3487951711805235287L, (long)l11))).size()) {
                l6l2 = ((Vector)((Object)m44.a("r", (Object)this, (long)3487951711805235287L, (long)l11))).elementAt((int)var10_10);
                do {
                    CallSite callSite4;
                    block31: {
                        block32: {
                            l6l l6l3;
                            CallSite callSite5;
                            block28: {
                                ge2 = (ge)((Object)l6l2);
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l10;
                                callSite5 = m44.a("s", (Object)ge2, (Object)objectArray3, (long)3056898500546101611L, (long)l11);
                                try {
                                    block30: {
                                        try {
                                            try {
                                                try {
                                                    l6l3 = this;
                                                    if (callSite == null) break block28;
                                                    bl2 = ((String)((Object)m44.a("r", (Object)l6l3, (long)2927611069974072994L, (long)l11))).equals(l6l.a("x", (int)15194, (long)(0x516F5637FCD18298L ^ l11)));
                                                    if (callSite == null) break block29;
                                                }
                                                catch (n9 n97) {
                                                    throw m44.a("l", (Object)n97, (long)3251714870161539090L, (long)l11);
                                                }
                                                if (!bl2) break block30;
                                            }
                                            catch (n9 n98) {
                                                throw m44.a("l", (Object)n98, (long)3251714870161539090L, (long)l11);
                                            }
                                            m44.a("p", (Object)this, (int)Math.max((int)callSite5, (int)m44.a("r", (Object)this, (long)3532240628533420404L, (long)l11)), (long)3532240628533420404L, (long)l11);
                                            callSite4 = callSite;
                                            if (l11 < 0L) break block31;
                                            if (callSite4 != null) break block32;
                                        }
                                        catch (n9 n99) {
                                            throw m44.a("l", (Object)n99, (long)3251714870161539090L, (long)l11);
                                        }
                                    }
                                    l6l3 = this;
                                }
                                catch (n9 n910) {
                                    throw m44.a("l", (Object)n910, (long)3251714870161539090L, (long)l11);
                                }
                            }
                            m44.a("p", (Object)l6l3, (int)m44.a("l", (int)callSite5, (int)m44.a("r", (Object)this, (long)3532240628533420404L, (long)l11), (long)4031916484594780875L, (long)l11), (long)3532240628533420404L, (long)l11);
                        }
                        ++var10_10;
                        callSite4 = callSite;
                    }
                    if (callSite4 != null) continue block19;
                    l6l2 = this;
                } while (l11 < 0L);
            }
            m44.a("p", (Object)l6l2, (boolean)true, (long)3596708360978155447L, (long)l11);
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public int u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (int)m44.a("w", (Object)this, (long)-2693057285620036911L, (long)l10);
    }

    @Override
    public boolean t(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public boolean P(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public boolean m(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    static boolean Y(Object[] objectArray) {
        boolean bl2;
        block18: {
            block19: {
                boolean bl3;
                block20: {
                    block22: {
                        char c10;
                        CallSite callSite;
                        long l10;
                        block16: {
                            String string = (String)objectArray[0];
                            l10 = (Long)objectArray[1];
                            l10 = a ^ l10;
                            callSite = m44.a("h", (long)5140208531778134051L, (long)l10);
                            try {
                                block17: {
                                    try {
                                        try {
                                            try {
                                                c10 = string.startsWith((String)((Object)l6l.a("x", (int)19793, (long)(0x5EAF92369E978410L ^ l10))));
                                                if (callSite == null) break block16;
                                                if (c10 != false) break block17;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("h", (Object)n92, (long)6747522128401461398L, (long)l10);
                                            }
                                            bl2 = string.startsWith((String)((Object)l6l.a("x", (int)12005, (long)(0x589B9A005D2EE7A6L ^ l10))));
                                            if (callSite == null) break block18;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("h", (Object)n93, (long)6747522128401461398L, (long)l10);
                                        }
                                        if (!bl2) break block19;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("h", (Object)n94, (long)6747522128401461398L, (long)l10);
                                    }
                                }
                                c10 = string.charAt(3);
                            }
                            catch (n9 n95) {
                                throw m44.a("h", (Object)n95, (long)6747522128401461398L, (long)l10);
                            }
                        }
                        boolean bl4 = c10;
                        try {
                            block21: {
                                try {
                                    try {
                                        try {
                                            bl3 = bl4;
                                            if (callSite == null) break block20;
                                            if (bl3 == l6l.b("s", (int)12871, (long)(0x337584063390B3FAL ^ l10))) break block21;
                                        }
                                        catch (n9 n96) {
                                            throw m44.a("h", (Object)n96, (long)6747522128401461398L, (long)l10);
                                        }
                                        bl3 = bl4;
                                        if (callSite == null) break block20;
                                    }
                                    catch (n9 n97) {
                                        throw m44.a("h", (Object)n97, (long)6747522128401461398L, (long)l10);
                                    }
                                    if (bl3 != l6l.b("s", (int)4359, (long)(0x4347385CF6FD10B9L ^ l10))) break block22;
                                }
                                catch (n9 n98) {
                                    throw m44.a("h", (Object)n98, (long)6747522128401461398L, (long)l10);
                                }
                            }
                            bl3 = true;
                            break block20;
                        }
                        catch (n9 n99) {
                            throw m44.a("h", (Object)n99, (long)6747522128401461398L, (long)l10);
                        }
                    }
                    bl3 = false;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        m44.a("q", (Object)this, (boolean)false, (long)-6241015486444642498L, (long)l10);
        CallSite callSite = m44.a("m", (long)-5811687548070229970L, (long)l10);
        for (int i10 = 0; i10 < ((Vector)((Object)m44.a("s", (Object)this, (long)-6273839927161816866L, (long)l10))).size(); ++i10) {
            ge ge2 = (ge)((Vector)((Object)m44.a("s", (Object)this, (long)-6273839927161816866L, (long)l10))).elementAt(i10);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l11;
            m44.a("r", (Object)ge2, (Object)objectArray2, (long)-6068437429200211664L, (long)l10);
            if (callSite != null) continue;
        }
    }

    l6l(long l10, ah ah2, String string) {
        l10 = a ^ l10;
        m44.a("s", (Object)this, new Vector(), (long)-5299440393845643708L, (long)l10);
        m44.a("s", (Object)this, (ah)ah2, (long)-6115331066764467310L, (long)l10);
        m44.a("s", (Object)this, (String)string.trim(), (long)-5493913984888834771L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public String v(Object[] var1_1) {
        block24: {
            block22: {
                block20: {
                    block21: {
                        block19: {
                            block18: {
                                var2_2 = (Long)var1_1[0];
                                v0 = var2_2;
                                var4_3 = v0 ^ 128961840649805L;
                                var6_4 = v0 ^ 22359260858332L;
                                v1 = m44.a("i", (long)-6303728162048339982L, (long)var2_2);
                                v2 = new Object[1];
                                v2[0] = var6_4;
                                m44.a("v", (Object)this, (Object)v2, (long)-5700443140472370347L, (long)var2_2);
                                var8_5 = v1;
                                var9_6 = null;
                                try {
                                    try {
                                        v3 = this;
                                        if (var8_5 == null) break block18;
                                        if (m44.a("w", (Object)v3, (long)-6126665690377170230L, (long)var2_2) != false) break block19;
                                    }
                                    catch (n9 v4) {
                                        throw m44.a("i", (Object)v4, (long)-5587529601860624569L, (long)var2_2);
                                    }
                                    v3 = this;
                                }
                                catch (n9 v5) {
                                    throw m44.a("i", (Object)v5, (long)-5587529601860624569L, (long)var2_2);
                                }
                            }
                            v6 = new Object[1];
                            v6[0] = var4_3;
                            var9_6 = m44.a("v", (Object)v3, (Object)v6, (long)-5448020284140015113L, (long)var2_2);
                        }
                        try {
                            try {
                                v7 = var9_6;
                                v8 = var8_5;
                                if (var2_2 > 0L) {
                                    if (v8 == null) break block20;
                                    if (v7 == null) break block21;
                                }
                                ** GOTO lbl59
                            }
                            catch (n9 v9) {
                                throw m44.a("i", (Object)v9, (long)-5587529601860624569L, (long)var2_2);
                            }
                            return var9_6;
                        }
                        catch (n9 v10) {
                            throw m44.a("i", (Object)v10, (long)-5587529601860624569L, (long)var2_2);
                        }
                    }
                    try {
                        v11 = this;
                        if (var8_5 == null) break block22;
                        v7 = m44.a("w", (Object)v11, (long)-5191096907974979081L, (long)var2_2);
                    }
                    catch (n9 v12) {
                        throw m44.a("i", (Object)v12, (long)-5587529601860624569L, (long)var2_2);
                    }
                }
                try {
                    block23: {
                        try {
                            block25: {
                                if (var2_2 <= 0L) break block25;
                                v8 = l6l.a("x", (int)15194, (long)(5867948609057201613L ^ var2_2));
lbl59:
                                // 2 sources

                                if (!v7.equals(v8)) break block23;
                                m44.a("u", (Object)this, (int)l6l.b("s", (int)10423, (long)(5355095207605159641L ^ var2_2)), (long)-5886072498928976351L, (long)var2_2);
                                v7 = var8_5;
                            }
                            if (v7 != null) break block24;
                        }
                        catch (n9 v13) {
                            throw m44.a("i", (Object)v13, (long)-5587529601860624569L, (long)var2_2);
                        }
                    }
                    v11 = this;
                }
                catch (n9 v14) {
                    throw m44.a("i", (Object)v14, (long)-5587529601860624569L, (long)var2_2);
                }
            }
            m44.a("u", (Object)v11, (int)l6l.b("s", (int)14098, (long)(8526288436994922879L ^ var2_2)), (long)-5886072498928976351L, (long)var2_2);
        }
        return null;
    }

    @Override
    public boolean s(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        l6l.a = prr.a(-7981155399138311853L, 4978019281893796045L, MethodHandles.lookup().lookupClass()).a(25101892697505L);
                        l6l.e = new HashMap<K, V>(13);
                        var11 = l6l.a ^ 104320202645965L;
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
                        var20_3 = new String[5];
                        var18_4 = 0;
                        var17_5 = "&\u0004\u00fc\u00c2\u0011#\u00c4\u00dd)\u00ef-\u001f\u00a9\u00db\u00f2I\u00a5\u008e\u00eey\u00b1_\u00a3\u00d4!\u0093V\u00c7q#\u00f4\u00e5\\\u0019}\u00b1\u0099\u00f1\u00afD\n\u007fF\u000b3\u00a7\u00a8\u008b\u00c2\u00c0\u001a\u00e9D\u00f9\u00ff\u007f\u00f4\u00a7\u00fceT\u00cc7@o4\u00d9\u00c5\u00d4\u00f6r^3Rl\u00918d\u00ac\u00b9\t\u009bX1\u00b0*b\ns\u00fb\u00b7\u009c\u0092\u00cc<\u00cf\u00f3\u0086<\u00aa9\\\u00e5N\u0091]\u00a3-Q\u00e9\u00a8 \u00105z\u00a6\u0082D\u00d3\u00d1\u0088`W\u0006\u00dd\u008aW\u00e1\u00d2\u0010i\u0012\u001f\u001fC\u00f1\u009b\u00ef\u00cf\u00d6\u00c7\u00c2\u0090\u0091\u001d\u00f9";
                        var19_6 = "&\u0004\u00fc\u00c2\u0011#\u00c4\u00dd)\u00ef-\u001f\u00a9\u00db\u00f2I\u00a5\u008e\u00eey\u00b1_\u00a3\u00d4!\u0093V\u00c7q#\u00f4\u00e5\\\u0019}\u00b1\u0099\u00f1\u00afD\n\u007fF\u000b3\u00a7\u00a8\u008b\u00c2\u00c0\u001a\u00e9D\u00f9\u00ff\u007f\u00f4\u00a7\u00fceT\u00cc7@o4\u00d9\u00c5\u00d4\u00f6r^3Rl\u00918d\u00ac\u00b9\t\u009bX1\u00b0*b\ns\u00fb\u00b7\u009c\u0092\u00cc<\u00cf\u00f3\u0086<\u00aa9\\\u00e5N\u0091]\u00a3-Q\u00e9\u00a8 \u00105z\u00a6\u0082D\u00d3\u00d1\u0088`W\u0006\u00dd\u008aW\u00e1\u00d2\u0010i\u0012\u001f\u001fC\u00f1\u009b\u00ef\u00cf\u00d6\u00c7\u00c2\u0090\u0091\u001d\u00f9".length();
                        var16_7 = 112;
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
                            var20_3[var18_4++] = l6l.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "f+\u009b\u00f4\u00ad\u009e\u0012\u0007\u00be\u00ed@\u00a1\u0096\u0003\u0001\u00d6\u0010h\u00ef\u00b7A\u008fH\u00f2R\u00e9\u001d\u0089\u001b@\u00a6\\@";
                            var19_6 = "f+\u009b\u00f4\u00ad\u009e\u0012\u0007\u00be\u00ed@\u00a1\u0096\u0003\u0001\u00d6\u0010h\u00ef\u00b7A\u008fH\u00f2R\u00e9\u001d\u0089\u001b@\u00a6\\@".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = l6l.a(var21_9).intern();
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
                l6l.b = var20_3;
                l6l.c = new String[5];
                l6l.i = new HashMap<K, V>(13);
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
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "|\u0001x\u00ca\u0087\u0013\u00d8\u00b5\u00b7\u0081[JY\u0011\u001a\u00d2";
                var5_15 = "|\u0001x\u00ca\u0087\u0013\u00d8\u00b5\u00b7\u0081[JY\u0011\u001a\u00d2".length();
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
                    var4_14 = "\u00a0&O\u00ce\u00d3\u0003\u0082\u0017\u00efS\u009d\ta\u0004\u00ba\r";
                    var5_15 = "\u00a0&O\u00ce\u00d3\u0003\u0082\u0017\u00efS\u009d\ta\u0004\u00ba\r".length();
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
        l6l.g = var6_12;
        l6l.h = new Integer[4];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x180D;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/l6l", exception);
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
            l6l.c[n11] = l6l.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = l6l.a(n10, l10);
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
            throw new RuntimeException("com/zelix/l6l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x50F0;
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
                throw new RuntimeException("com/zelix/l6l", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            l6l.h[n11] = n12;
        }
        return h[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = l6l.b(n10, l10);
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
            throw new RuntimeException("com/zelix/l6l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(l6l.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(l6l.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

