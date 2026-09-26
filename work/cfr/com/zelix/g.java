/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ab;
import com.zelix.lmm;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sz;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g {
    private List V;
    private sz l;
    private Map E;
    private sz J;
    private Map g;
    private String H;
    private static final long a = prr.a(-1005017782306417076L, 7164485722848951915L, MethodHandles.lookup().lookupClass()).a(91652466095581L);
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;

    public String R(Object[] objectArray) {
        block5: {
            Object object;
            block4: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("k", (long)8744387005853807646L, (long)l10);
                try {
                    try {
                        object = m44.a("u", (Object)this, (long)7038941729964151322L, (long)l10);
                        if (callSite != false) break block4;
                        if (object == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)7134912357171972366L, (long)l10);
                    }
                    object = ((sz)((Object)m44.a("u", (Object)this, (long)7038941729964151322L, (long)l10))).t();
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)7134912357171972366L, (long)l10);
                }
            }
            return (String)object;
        }
        return null;
    }

    public void o(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x4FD06A479D59L;
        ((sz)((Object)m44.a("u", (Object)this, (long)-2830666302135899390L, (long)l10))).Z(l11, string);
    }

    public Enumeration q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            if (m44.a("w", (Object)this, (long)-4447899877693739354L, (long)l10) != null) {
                return Collections.enumeration(new ArrayList(m44.a("w", (Object)this, (long)-4447899877693739354L, (long)l10).keySet()));
            }
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)n92, (long)-2493240886245230740L, (long)l10);
        }
        return new lmm();
    }

    public boolean L(Object[] objectArray) {
        block9: {
            block11: {
                sz sz2;
                long l10;
                String string;
                block10: {
                    CallSite callSite;
                    CallSite callSite2;
                    String string2;
                    long l11;
                    block8: {
                        l11 = (Long)objectArray[0];
                        string2 = (String)objectArray[1];
                        string = (String)objectArray[2];
                        l10 = (l11 = a ^ l11) ^ 0x39B7C956297FL;
                        callSite2 = m44.a("m", (long)7583910196615419608L, (long)l11);
                        try {
                            try {
                                callSite = m44.a("s", (Object)this, (long)8149766480744685050L, (long)l11);
                                if (callSite2 == false) break block8;
                                if (callSite == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)n92, (long)7942679929953240112L, (long)l11);
                            }
                            callSite = m44.a("s", (Object)this, (long)8149766480744685050L, (long)l11).remove(string2);
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)n93, (long)7942679929953240112L, (long)l11);
                        }
                    }
                    sz sz3 = (sz)((Object)callSite);
                    try {
                        try {
                            sz2 = sz3;
                            if (callSite2 == false) break block10;
                            if (sz2 == null) break block11;
                        }
                        catch (n9 n94) {
                            throw m44.a("m", (Object)n94, (long)7942679929953240112L, (long)l11);
                        }
                        m44.a("s", (Object)this, (long)8149766480744685050L, (long)l11).put(string, sz3);
                        sz2 = (sz)m44.a("s", (Object)this, (long)8578469859429748286L, (long)l11).get(string2);
                    }
                    catch (n9 n95) {
                        throw m44.a("m", (Object)n95, (long)7942679929953240112L, (long)l11);
                    }
                }
                sz sz4 = sz2;
                sz4.Z(l10, string);
                return true;
            }
            return false;
        }
        return false;
    }

    public void C(Object[] objectArray) {
        block8: {
            Object object;
            sz sz2;
            long l10;
            block9: {
                g g10;
                block6: {
                    String string = (String)objectArray[0];
                    l10 = (Long)objectArray[1];
                    long l11 = (l10 = a ^ l10) ^ 0x6AE7AD042B32L;
                    sz2 = new sz(string, l11);
                    CallSite callSite = m44.a("n", (long)-8043684055412450021L, (long)l10);
                    try {
                        block7: {
                            try {
                                try {
                                    g10 = this;
                                    if (callSite != false) break block6;
                                    if (m44.a("p", (Object)g10, (long)-8599057878702081249L, (long)l10) != null) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("n", (Object)n92, (long)-8502489734829301749L, (long)l10);
                                }
                                m44.a("r", (Object)this, (String)string, (long)-8113293620273742402L, (long)l10);
                                m44.a("r", (Object)this, (sz)sz2, (long)-8599057878702081249L, (long)l10);
                                object = callSite;
                                if (l10 <= 0L) break block8;
                                if (!object) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("n", (Object)n93, (long)-8502489734829301749L, (long)l10);
                            }
                        }
                        g10 = this;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)n94, (long)-8502489734829301749L, (long)l10);
                    }
                }
                m44.a("r", (Object)g10, (sz)sz2, (long)-7532384502220571210L, (long)l10);
            }
            object = m44.a("p", (Object)this, (long)-7535014318254745462L, (long)l10).add(sz2);
        }
    }

    public String K(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("w", (Object)this, (long)-7246062250229700183L, (long)l10);
    }

    public void S(Object[] objectArray) {
        block4: {
            String string = (String)objectArray[0];
            long l10 = (Long)objectArray[1];
            l10 = a ^ l10;
            CallSite callSite = m44.a("m", (long)5953520122122972536L, (long)l10);
            try {
                int n10;
                try {
                    n10 = string.length();
                    if (callSite == false || n10 <= 0) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)n92, (long)6168313515632426896L, (long)l10);
                }
                n10 = m44.a("s", (Object)this, (long)5257133094546917137L, (long)l10).add(string) ? 1 : 0;
            }
            catch (n9 n93) {
                throw m44.a("m", (Object)n93, (long)6168313515632426896L, (long)l10);
            }
        }
    }

    public g(long l10) {
        l10 = a ^ l10;
        m44.a("u", (Object)this, new ArrayList((int)com.zelix.g.a("w", (int)20411, (long)(0xB142B90DB87075FL ^ l10))), (long)-2159093727878451731L, (long)l10);
    }

    public sz P(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                long l10 = (Long)objectArray[0];
                String string = (String)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite2 = m44.a("j", (long)7759735965260026967L, (long)l10);
                try {
                    try {
                        callSite = m44.a("t", (Object)this, (long)8329022631465459573L, (long)l10);
                        if (callSite2 == false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)7833301041559946943L, (long)l10);
                    }
                    callSite = m44.a("t", (Object)this, (long)8329022631465459573L, (long)l10).get(string);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)7833301041559946943L, (long)l10);
                }
            }
            return (sz)((Object)callSite);
        }
        return null;
    }

    public void M(Object[] objectArray) {
        long l10;
        long l11;
        g g10;
        sz sz2;
        block8: {
            long l12;
            block9: {
                Object object;
                String string;
                block10: {
                    l12 = (Long)objectArray[0];
                    String string2 = (String)objectArray[1];
                    long l13 = l12 = a ^ l12;
                    long l14 = l13 ^ 0x3D6293366CD9L;
                    long l15 = l13 ^ 0x1A44B25E51DFL;
                    CallSite callSite = m44.a("m", (long)-3823795419349043960L, (long)l12);
                    try {
                        if (m44.a("s", (Object)this, (long)-3414626057678063011L, (long)l12) == null) {
                            throw new ab(b + string2 + "'");
                        }
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-3609000514027886624L, (long)l12);
                    }
                    if (m44.a("i", (long)-3309631353680629969L, (long)l12) != false) {
                        string2 = string2.trim();
                    }
                    sz2 = new sz(string2, l14);
                    string = (String)((sz)((Object)m44.a("s", (Object)this, (long)-3414626057678063011L, (long)l12))).t();
                    try {
                        try {
                            g10 = this;
                            l11 = -3108459465538392594L;
                            l10 = l12;
                            if (l12 <= 0L) break block8;
                            object = m44.a("s", (Object)g10, (long)l11, (long)l10);
                            if (callSite == false) break block9;
                            if (object != null) break block10;
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)n93, (long)-3609000514027886624L, (long)l12);
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l15;
                        objectArray2[0] = (int)com.zelix.g.a("w", (int)18158, (long)(0x191C861401AB3C87L ^ l12));
                        m44.a("q", (Object)this, (Map)((Object)m44.a("m", (Object)objectArray2, (long)-3089937266618838786L, (long)l12)), (long)-3108459465538392594L, (long)l12);
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l15;
                        objectArray3[0] = (int)com.zelix.g.a("w", (int)19584, (long)(0x78A652361C6EB6EAL ^ l12));
                        m44.a("q", (Object)this, (Map)((Object)m44.a("m", (Object)objectArray3, (long)-3089937266618838786L, (long)l12)), (long)-3257904525365035478L, (long)l12);
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)n94, (long)-3609000514027886624L, (long)l12);
                    }
                }
                m44.a("s", (Object)this, (long)-3108459465538392594L, (long)l12).put(string, m44.a("s", (Object)this, (long)-3414626057678063011L, (long)l12));
                object = m44.a("s", (Object)this, (long)-3257904525365035478L, (long)l12).put(string, sz2);
            }
            g10 = this;
            l11 = -3421302076435341471L;
            l10 = l12;
        }
        m44.a("s", (Object)g10, (long)l11, (long)l10).add(sz2);
    }

    /*
     * Unable to fully structure code
     */
    public String toString() {
        var1_1 = com.zelix.g.a ^ 103427359453742L;
        var4_2 = new StringBuilder();
        var5_3 = m44.a("w", (Object)this, (long)7343508407203686925L, (long)var1_1).size();
        var3_4 = m44.a("i", (long)9188275956531626084L, (long)var1_1);
        for (var6_5 = 0; var6_5 < var5_3; ++var6_5) {
            block8: {
                var7_7 = m44.a("w", (Object)this, (long)7343508407203686925L, (long)var1_1).get(var6_5);
                try {
                    try {
                        if (var3_4 == false) break block8;
                        if (var7_7 instanceof sz) {
                        }
                        ** GOTO lbl23
                    }
                    catch (n9 v0) {
                        throw m44.a("i", (Object)v0, (long)8684689649778676364L, (long)var1_1);
                    }
                    var4_2.append((String)((sz)var7_7).t());
                }
                catch (n9 v1) {
                    throw m44.a("i", (Object)v1, (long)8684689649778676364L, (long)var1_1);
                }
            }
            try {
                if (var3_4 != false) continue;
lbl23:
                // 2 sources

                var4_2.append(var7_7);
                continue;
            }
            catch (n9 v2) {
                throw m44.a("i", (Object)v2, (long)8684689649778676364L, (long)var1_1);
            }
        }
        var6_6 = var4_2.toString();
        return var6_6;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x52339219AB42L;
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
        byte[] byArray3 = cipher.doFinal("\u009c1\u00ed\u0019\u00abc\u00fb\u00b4\u00c5\u008b\u00aa\"r\u0000\u00d8\u00c6N#\r)\u0000hT\u0006\u0089.\u00bb\u008b\u0017\u00abi3\u0095\u00a8ylg\u00f3e\t".getBytes("ISO-8859-1"));
        b = com.zelix.g.a(byArray3).intern();
        e = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        for (int i11 = 1; i11 < 8; ++i11) {
            byArray5 = byArray5;
            byArray5[i11] = (byte)(l10 << i11 * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u001f\u00d6\u00de\u00d9\u0014\\\u00b2I\u00d75%l\u00ee\u0002\u00b8j5\u0081\u00ab\u0004\\\u0099\u0099\u00cc";
        int n11 = "\u001f\u00d6\u00de\u00d9\u0014\\\u00b2I\u00d75%l\u00ee\u0002\u00b8j5\u0081\u00ab\u0004\\\u0099\u0099\u00cc".length();
        int n12 = 0;
        do {
            byte[] byArray6 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n12 < n11);
        c = lArray;
        d = new Integer[3];
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

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x232A;
        if (d[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/g", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            com.zelix.g.d[n11] = n12;
        }
        return d[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = com.zelix.g.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

