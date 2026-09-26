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
    private static final long a = prr.a((long)-1005017782306417076L, (long)7164485722848951915L, MethodHandles.lookup().lookupClass()).a(91652466095581L);
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;

    public String R(Object[] objectArray) {
        block5: {
            Object object;
            block4: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("k", (long)8744387005853807646L, (long)l);
                try {
                    try {
                        object = m44.a("u", (Object)this, (long)7038941729964151322L, (long)l);
                        if (callSite != false) break block4;
                        if (object == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)7134912357171972366L, (long)l);
                    }
                    object = m44.a("u", (Object)this, (long)7038941729964151322L, (long)l).t();
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)7134912357171972366L, (long)l);
                }
            }
            return (String)object;
        }
        return null;
    }

    public void o(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x4FD06A479D59L;
        m44.a("u", (Object)this, (long)-2830666302135899390L, (long)l).Z(l2, string);
    }

    public Enumeration q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        try {
            if (m44.a("w", (Object)this, (long)-4447899877693739354L, (long)l) != null) {
                return Collections.enumeration(new ArrayList(m44.a("w", (Object)this, (long)-4447899877693739354L, (long)l).keySet()));
            }
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)((Object)n92), (long)-2493240886245230740L, (long)l);
        }
        return new lmm();
    }

    public boolean L(Object[] objectArray) {
        block9: {
            block11: {
                sz sz2;
                long l;
                String string;
                block10: {
                    CallSite callSite;
                    CallSite callSite2;
                    String string2;
                    long l2;
                    block8: {
                        l2 = (Long)objectArray[0];
                        string2 = (String)objectArray[1];
                        string = (String)objectArray[2];
                        l = (l2 = a ^ l2) ^ 0x39B7C956297FL;
                        callSite2 = m44.a("m", (long)7583910196615419608L, (long)l2);
                        try {
                            try {
                                callSite = m44.a("s", (Object)this, (long)8149766480744685050L, (long)l2);
                                if (callSite2 == false) break block8;
                                if (callSite == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)((Object)n92), (long)7942679929953240112L, (long)l2);
                            }
                            callSite = m44.a("s", (Object)this, (long)8149766480744685050L, (long)l2).remove(string2);
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)((Object)n93), (long)7942679929953240112L, (long)l2);
                        }
                    }
                    sz sz3 = (sz)callSite;
                    try {
                        try {
                            sz2 = sz3;
                            if (callSite2 == false) break block10;
                            if (sz2 == null) break block11;
                        }
                        catch (n9 n94) {
                            throw m44.a("m", (Object)((Object)n94), (long)7942679929953240112L, (long)l2);
                        }
                        m44.a("s", (Object)this, (long)8149766480744685050L, (long)l2).put(string, sz3);
                        sz2 = (sz)m44.a("s", (Object)this, (long)8578469859429748286L, (long)l2).get(string2);
                    }
                    catch (n9 n95) {
                        throw m44.a("m", (Object)((Object)n95), (long)7942679929953240112L, (long)l2);
                    }
                }
                sz sz4 = sz2;
                sz4.Z(l, (Object)string);
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
            long l;
            block9: {
                g g2;
                block6: {
                    String string = (String)objectArray[0];
                    l = (Long)objectArray[1];
                    long l2 = (l = a ^ l) ^ 0x6AE7AD042B32L;
                    sz2 = new sz((Object)string, l2);
                    CallSite callSite = m44.a("n", (long)-8043684055412450021L, (long)l);
                    try {
                        block7: {
                            try {
                                try {
                                    g2 = this;
                                    if (callSite != false) break block6;
                                    if (m44.a("p", (Object)g2, (long)-8599057878702081249L, (long)l) != null) break block7;
                                }
                                catch (n9 n92) {
                                    throw m44.a("n", (Object)((Object)n92), (long)-8502489734829301749L, (long)l);
                                }
                                m44.a("r", (Object)this, (String)string, (long)-8113293620273742402L, (long)l);
                                m44.a("r", (Object)this, (sz)sz2, (long)-8599057878702081249L, (long)l);
                                object = callSite;
                                if (l <= 0L) break block8;
                                if (!object) break block9;
                            }
                            catch (n9 n93) {
                                throw m44.a("n", (Object)((Object)n93), (long)-8502489734829301749L, (long)l);
                            }
                        }
                        g2 = this;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)((Object)n94), (long)-8502489734829301749L, (long)l);
                    }
                }
                m44.a("r", (Object)g2, (sz)sz2, (long)-7532384502220571210L, (long)l);
            }
            object = m44.a("p", (Object)this, (long)-7535014318254745462L, (long)l).add(sz2);
        }
    }

    public String K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("w", (Object)this, (long)-7246062250229700183L, (long)l);
    }

    public void S(Object[] objectArray) {
        block4: {
            String string = (String)objectArray[0];
            long l = (Long)objectArray[1];
            l = a ^ l;
            CallSite callSite = m44.a("m", (long)5953520122122972536L, (long)l);
            try {
                int n;
                try {
                    n = string.length();
                    if (callSite == false || n <= 0) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)((Object)n92), (long)6168313515632426896L, (long)l);
                }
                n = m44.a("s", (Object)this, (long)5257133094546917137L, (long)l).add(string) ? 1 : 0;
            }
            catch (n9 n93) {
                throw m44.a("m", (Object)((Object)n93), (long)6168313515632426896L, (long)l);
            }
        }
    }

    public g(long l) {
        l = a ^ l;
        m44.a("u", (Object)this, new ArrayList((int)com.zelix.g.a("w", (int)20411, (long)(0xB142B90DB87075FL ^ l))), (long)-2159093727878451731L, (long)l);
    }

    public sz P(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                long l = (Long)objectArray[0];
                String string = (String)objectArray[1];
                l = a ^ l;
                CallSite callSite2 = m44.a("j", (long)7759735965260026967L, (long)l);
                try {
                    try {
                        callSite = m44.a("t", (Object)this, (long)8329022631465459573L, (long)l);
                        if (callSite2 == false) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)7833301041559946943L, (long)l);
                    }
                    callSite = m44.a("t", (Object)this, (long)8329022631465459573L, (long)l).get(string);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)7833301041559946943L, (long)l);
                }
            }
            return (sz)callSite;
        }
        return null;
    }

    public void M(Object[] objectArray) {
        long l;
        long l2;
        g g2;
        sz sz2;
        block8: {
            long l3;
            block9: {
                CallSite callSite;
                String string;
                block10: {
                    l3 = (Long)objectArray[0];
                    String string2 = (String)objectArray[1];
                    long l4 = l3 = a ^ l3;
                    long l5 = l4 ^ 0x3D6293366CD9L;
                    long l6 = l4 ^ 0x1A44B25E51DFL;
                    CallSite callSite2 = m44.a("m", (long)-3823795419349043960L, (long)l3);
                    try {
                        if (m44.a("s", (Object)this, (long)-3414626057678063011L, (long)l3) == null) {
                            throw new ab(b + string2 + "'");
                        }
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)-3609000514027886624L, (long)l3);
                    }
                    if (m44.a("i", (long)-3309631353680629969L, (long)l3) != false) {
                        string2 = string2.trim();
                    }
                    sz2 = new sz((Object)string2, l5);
                    string = (String)m44.a("s", (Object)this, (long)-3414626057678063011L, (long)l3).t();
                    try {
                        try {
                            g2 = this;
                            l2 = -3108459465538392594L;
                            l = l3;
                            if (l3 <= 0L) break block8;
                            callSite = m44.a("s", (Object)g2, (long)l2, (long)l);
                            if (callSite2 == false) break block9;
                            if (callSite != null) break block10;
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)((Object)n93), (long)-3609000514027886624L, (long)l3);
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l6;
                        objectArray2[0] = (int)com.zelix.g.a("w", (int)18158, (long)(0x191C861401AB3C87L ^ l3));
                        m44.a("q", (Object)this, (Map)((Object)m44.a("m", (Object)objectArray2, (long)-3089937266618838786L, (long)l3)), (long)-3108459465538392594L, (long)l3);
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l6;
                        objectArray3[0] = (int)com.zelix.g.a("w", (int)19584, (long)(0x78A652361C6EB6EAL ^ l3));
                        m44.a("q", (Object)this, (Map)((Object)m44.a("m", (Object)objectArray3, (long)-3089937266618838786L, (long)l3)), (long)-3257904525365035478L, (long)l3);
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)((Object)n94), (long)-3609000514027886624L, (long)l3);
                    }
                }
                m44.a("s", (Object)this, (long)-3108459465538392594L, (long)l3).put(string, m44.a("s", (Object)this, (long)-3414626057678063011L, (long)l3));
                callSite = m44.a("s", (Object)this, (long)-3257904525365035478L, (long)l3).put(string, sz2);
            }
            g2 = this;
            l2 = -3421302076435341471L;
            l = l3;
        }
        m44.a("s", (Object)g2, (long)l2, (long)l).add(sz2);
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
        long l = a ^ 0x52339219AB42L;
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
        byte[] byArray3 = cipher.doFinal("\u009c1\u00ed\u0019\u00abc\u00fb\u00b4\u00c5\u008b\u00aa\"r\u0000\u00d8\u00c6N#\r)\u0000hT\u0006\u0089.\u00bb\u008b\u0017\u00abi3\u0095\u00a8ylg\u00f3e\t".getBytes("ISO-8859-1"));
        b = com.zelix.g.a(byArray3).intern();
        e = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u001f\u00d6\u00de\u00d9\u0014\\\u00b2I\u00d75%l\u00ee\u0002\u00b8j5\u0081\u00ab\u0004\\\u0099\u0099\u00cc";
        int n2 = "\u001f\u00d6\u00de\u00d9\u0014\\\u00b2I\u00d75%l\u00ee\u0002\u00b8j5\u0081\u00ab\u0004\\\u0099\u0099\u00cc".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[3];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x232A;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            com.zelix.g.d[n2] = n3;
        }
        return d[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = com.zelix.g.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
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
