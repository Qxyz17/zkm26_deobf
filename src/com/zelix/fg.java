/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e8;
import com.zelix.ec;
import com.zelix.l65;
import com.zelix.lb8;
import com.zelix.lbc;
import com.zelix.lbg;
import com.zelix.m44;
import com.zelix.mv;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Window;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fg {
    public static Class[] A;
    public static final String s;
    public static String G;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public static boolean D(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        long l = (Long)objectArray[1];
        Color color2 = (Color)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x1499BA87EFL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = (int)fg.b("d", (int)8732, (long)(0x6289D35BF9B9F63AL ^ l));
        objectArray2[2] = l2;
        objectArray2[1] = color2;
        objectArray2[0] = color;
        return (boolean)m44.a("j", (Object)objectArray2, (long)-8548802849263364449L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        fg.a = prr.a((long)-5603114764422044409L, (long)1199432791359558560L, MethodHandles.lookup().lookupClass()).a(73405770751790L);
                        var20 = fg.a ^ 13132093445390L;
                        fg.d = new HashMap<K, V>(13);
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
                        var18_3 = new String[4];
                        var16_4 = 0;
                        var15_5 = "\u0000F{J?\u00e4\u009b\u007f\u00b1!m\t\u00b8\u00ea\u009e\u00dc\u00aa\\\u009d\u0089\u00f4\u00bf\u00f4\u001d\u0011\u00da\u00f9\u00be\u00c1\u00a8\u0095\u0007\u00d6\u0094N\u008c\u000f\u0001\u00c0\f(\u0099\u00eb:\u00f6\u0092\u008c\u00b7\u00a6\u00fb\u00e9\u00a2r\u00a4\u00a6\u00ee,2\u00c8^\u00f1@\u00b1\u0096\u00bcN,p\u00f5[\u00a6\u00d5m\u00b4\u00cc<\u00f8\u00c5=`@";
                        var17_6 = "\u0000F{J?\u00e4\u009b\u007f\u00b1!m\t\u00b8\u00ea\u009e\u00dc\u00aa\\\u009d\u0089\u00f4\u00bf\u00f4\u001d\u0011\u00da\u00f9\u00be\u00c1\u00a8\u0095\u0007\u00d6\u0094N\u008c\u000f\u0001\u00c0\f(\u0099\u00eb:\u00f6\u0092\u008c\u00b7\u00a6\u00fb\u00e9\u00a2r\u00a4\u00a6\u00ee,2\u00c8^\u00f1@\u00b1\u0096\u00bcN,p\u00f5[\u00a6\u00d5m\u00b4\u00cc<\u00f8\u00c5=`@".length();
                        var14_7 = 40;
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
                            var18_3[var16_4++] = fg.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u0093c\u009b\u009b\u00fb\u0000\u00cf\u000eKq\u00a3\u0006\u00a1\u00c9^\u00dd9\u00fb0\u00bc\u00982S\u00b5\u0018\u007f\u00df\u00142\u00e7M\u00bf\u001d\u00f7WzyE\u001d\u00af]\u00ccg\u00e3\u00e9dE\u00fe\u00fe";
                            var17_6 = "\u0093c\u009b\u009b\u00fb\u0000\u00cf\u000eKq\u00a3\u0006\u00a1\u00c9^\u00dd9\u00fb0\u00bc\u00982S\u00b5\u0018\u007f\u00df\u00142\u00e7M\u00bf\u001d\u00f7WzyE\u001d\u00af]\u00ccg\u00e3\u00e9dE\u00fe\u00fe".length();
                            var14_7 = 24;
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
                            var18_3[var16_4++] = fg.a(var19_9).intern();
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
                fg.b = var18_3;
                fg.c = new String[4];
                fg.g = new HashMap<K, V>(13);
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
                var4_14 = "\u00ee\u009bgmz\u0014\u00d0\u00e8\u00f1',E\u00a3\u00fa\u00a2#\u00e1\u0000\u008e7\u0091Yq\u00dfZau+\u00d9\u00bdg\u00e6";
                var5_15 = "\u00ee\u009bgmz\u0014\u00d0\u00e8\u00f1',E\u00a3\u00fa\u00a2#\u00e1\u0000\u008e7\u0091Yq\u00dfZau+\u00d9\u00bdg\u00e6".length();
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
                    var4_14 = "\u001b\u00fc]\u0014\u00e9]\u008dA\u001a\u00ed\u00ac\u00e0\u00ee\u0001\u0012\u00c7";
                    var5_15 = "\u001b\u00fc]\u0014\u00e9]\u008dA\u001a\u00ed\u00ac\u00e0\u00ee\u0001\u0012\u00c7".length();
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
        fg.e = var6_12;
        fg.f = new Integer[6];
        m44.a("i", (Class[])new Class[0], (long)-7019164898977180251L, (long)var20);
        m44.a("i", (String)fg.a("d", (int)11888, (long)(4267855468660066831L ^ var20)), (long)-9202119409705098132L, (long)var20);
        fg.s = m44.a("j", (Object)fg.a("d", (int)5359, (long)(1743513789668798610L ^ var20)), (Object)"\n", (long)-6942954734328120135L, (long)var20);
    }

    public static lb8 g(Object[] objectArray) {
        JFrame jFrame = (JFrame)objectArray[0];
        String string = (String)objectArray[1];
        long l = (Long)objectArray[2];
        String string2 = (String)objectArray[3];
        String string3 = (String)objectArray[4];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x516F5C6BFCA8L;
        long l4 = l2 ^ 0x5B7E73E39B5BL;
        try {
            if (string3.length() > fg.b("d", (int)3981, (long)(0xA11EAB255E09A09L ^ l))) {
                return new lbg(jFrame, l3, string, string2, string3);
            }
        }
        catch (n9 n92) {
            throw m44.a("j", (Object)((Object)n92), (long)6112771292632692052L, (long)l);
        }
        return new lbc((Frame)jFrame, string, l4, string3);
    }

    /*
     * Loose catch block
     */
    public static void u(Object[] objectArray) {
        block7: {
            boolean bl;
            Window window;
            long l;
            block8: {
                l = (Long)objectArray[0];
                window = (Window)objectArray[1];
                bl = (Boolean)objectArray[2];
                l = a ^ l;
                CallSite callSite = m44.a("j", (long)654013937980909175L, (long)l);
                if (callSite == null) break block7;
                try {
                    block9: {
                        if (m44.a("j", (long)651455714057823707L, (long)l) == false) break block8;
                        break block9;
                        catch (InterruptedException interruptedException) {
                            throw m44.a("j", (Object)interruptedException, (long)1658711593991730820L, (long)l);
                        }
                    }
                    m44.a("u", (Object)window, (boolean)bl, (long)690232552456596859L, (long)l);
                    if (callSite != null) break block7;
                }
                catch (InterruptedException interruptedException) {
                    throw m44.a("j", (Object)interruptedException, (long)1658711593991730820L, (long)l);
                }
            }
            try {
                m44.a("j", (Object)new mv(window, bl), (long)1328833421048123804L, (long)l);
            }
            catch (InterruptedException interruptedException) {
                throw new n9((String)((Object)m44.a("u", (Object)interruptedException, (long)1004517484354108840L, (long)l)) + " " + window.getClass().getName());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new n9((String)((Object)m44.a("u", (Object)invocationTargetException.getTargetException(), (long)981255825859623967L, (long)l)) + " " + window.getClass().getName());
            }
        }
    }

    public static void s(Object[] objectArray) {
        block8: {
            String string;
            JEditorPane jEditorPane;
            long l;
            block7: {
                CallSite callSite;
                block6: {
                    l = (Long)objectArray[0];
                    jEditorPane = (JEditorPane)objectArray[1];
                    string = (String)objectArray[2];
                    long l2 = (l = a ^ l) ^ 0x16B9E698F2CDL;
                    callSite = m44.a("k", (long)5150702227913173022L, (long)l);
                    try {
                        try {
                            if (callSite == null) break block6;
                            if (m44.a("k", (long)5143974792663329714L, (long)l) == false) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)((Object)n92), (long)6443968531194231021L, (long)l);
                        }
                        Object[] objectArray2 = new Object[3];
                        objectArray2[2] = string;
                        objectArray2[1] = jEditorPane;
                        objectArray2[0] = l2;
                        m44.a("k", (Object)objectArray2, (long)6540330022630014436L, (long)l);
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)((Object)n93), (long)6443968531194231021L, (long)l);
                    }
                }
                if (callSite != null) break block8;
            }
            l65 l652 = new l65(jEditorPane, string);
            m44.a("k", (Object)l652, (long)4691918168981129024L, (long)l);
        }
    }

    public static boolean P(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                Color color = (Color)objectArray[0];
                long l = (Long)objectArray[1];
                l = a ^ l;
                reference var5_3 = m44.a("u", (Object)color, (long)177041704255122270L, (long)l) + m44.a("u", (Object)color, (long)1760766934962211646L, (long)l) + m44.a("u", (Object)color, (long)194806774232334299L, (long)l);
                CallSite callSite = m44.a("j", (long)2052377172131820319L, (long)l);
                try {
                    try {
                        object = fg.b("d", (int)1307, (long)(0x13904913721C624L ^ l)) - var5_3;
                        if (callSite == null) break block4;
                        if (object >= fg.b("d", (int)10352, (long)(0x48D7AF6B3C666B49L ^ l))) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)174771170812027884L, (long)l);
                    }
                    object = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)174771170812027884L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private static void D(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Component component = (Component)objectArray[1];
        l = a ^ l;
        try {
            Method method = component.getClass().getMethod((String)((Object)fg.a("d", (int)2228, (long)(0x54FECE30E3FB3FF6L ^ l))), (Class<?>)((Object)m44.a("j", (long)-8238539606083303783L, (long)l)));
            method.invoke(component, (Object[])m44.a("j", (long)-8238539606083303783L, (long)l));
        }
        catch (Throwable throwable) {
            m44.a("q", (Object)component, (long)-8497815398477269580L, (long)l);
        }
    }

    public static boolean M(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                Color color = (Color)objectArray[0];
                long l = (Long)objectArray[1];
                l = a ^ l;
                reference var5_3 = m44.a("r", (Object)color, (long)8884455175721259617L, (long)l) + m44.a("r", (Object)color, (long)7012270260289827329L, (long)l) + m44.a("r", (Object)color, (long)8902210386695309028L, (long)l);
                CallSite callSite = m44.a("m", (long)7297120843857447456L, (long)l);
                try {
                    try {
                        object = var5_3;
                        if (callSite == null) break block4;
                        if (object >= fg.b("d", (int)10435, (long)(0x4063A9EEE0FD92C1L ^ l))) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)8886727830860962515L, (long)l);
                    }
                    object = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)((Object)n93), (long)8886727830860962515L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    private static void b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        JEditorPane jEditorPane = (JEditorPane)objectArray[1];
        String string = (String)objectArray[2];
        l = a ^ l;
        m44.a("r", (Object)jEditorPane, (Object)fg.a("d", (int)24320, (long)(0x4EA4975AA69E9403L ^ l)), (long)-614066012829640046L, (long)l);
        m44.a("r", (Object)jEditorPane, (Object)string, (long)-782655150454455992L, (long)l);
        m44.a("r", (Object)jEditorPane, (int)0, (long)-1495730690475490504L, (long)l);
    }

    public static boolean q(Object[] objectArray) {
        Object object;
        block16: {
            block18: {
                int n;
                Object object2;
                CallSite callSite;
                int n2;
                long l;
                block14: {
                    reference var13_14;
                    block15: {
                        CallSite callSite2;
                        block12: {
                            CallSite callSite22;
                            CallSite callSite3;
                            block13: {
                                Color color = (Color)objectArray[0];
                                Color color2 = (Color)objectArray[1];
                                l = (Long)objectArray[2];
                                n2 = (Integer)objectArray[3];
                                l = a ^ l;
                                CallSite callSite4 = m44.a("q", (Object)color, (long)6005703509672147570L, (long)l);
                                CallSite callSite5 = m44.a("q", (Object)color, (long)5279329042362817042L, (long)l);
                                callSite3 = m44.a("q", (Object)color, (long)6023676937764368119L, (long)l);
                                CallSite callSite6 = m44.a("q", (Object)color2, (long)6005703509672147570L, (long)l);
                                callSite = m44.a("n", (long)5573191148082881075L, (long)l);
                                CallSite callSite7 = m44.a("q", (Object)color2, (long)5279329042362817042L, (long)l);
                                callSite22 = m44.a("q", (Object)color2, (long)6023676937764368119L, (long)l);
                                CallSite callSite8 = m44.a("n", (int)(callSite4 - callSite6), (long)5209912076928316956L, (long)l);
                                reference var13_14 = callSite8 + m44.a("n", (int)(callSite5 - callSite7), (long)5209912076928316956L, (long)l);
                                var13_14 = var13_14 + m44.a("n", (int)(callSite3 - callSite22), (long)5209912076928316956L, (long)l);
                                object2 = false;
                                CallSite callSite9 = m44.a("n", (int)(callSite4 - callSite6), (long)5209912076928316956L, (long)l);
                                object2 = callSite9;
                                reference var15_17 = m44.a("n", (int)(callSite5 - callSite7), (long)5209912076928316956L, (long)l);
                                try {
                                    object = var15_17;
                                    n = object2;
                                    if (callSite == null) break block12;
                                    if (object <= n) break block13;
                                }
                                catch (n9 n92) {
                                    throw m44.a("n", (Object)((Object)n92), (long)5998962430819414720L, (long)l);
                                }
                                object2 = var15_17;
                            }
                            callSite2 = m44.a("n", (int)(callSite3 - callSite22), (long)5209912076928316956L, (long)l);
                            object = callSite2;
                            n = object2;
                        }
                        try {
                            if (l <= 0L || callSite == null) break block14;
                            if (object <= n) break block15;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)((Object)n93), (long)5998962430819414720L, (long)l);
                        }
                        object2 = callSite2;
                    }
                    try {
                        object = var13_14;
                        if (callSite == null) break block16;
                        n = n2;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)((Object)n94), (long)5998962430819414720L, (long)l);
                    }
                }
                try {
                    block17: {
                        try {
                            try {
                                if (object >= n) break block17;
                                object = object2;
                                if (callSite == null) break block16;
                            }
                            catch (n9 n95) {
                                throw m44.a("n", (Object)((Object)n95), (long)5998962430819414720L, (long)l);
                            }
                            if (object <= n2 * 2 / 3) break block18;
                        }
                        catch (n9 n96) {
                            throw m44.a("n", (Object)((Object)n96), (long)5998962430819414720L, (long)l);
                        }
                    }
                    object = true;
                    break block16;
                }
                catch (n9 n97) {
                    throw m44.a("n", (Object)((Object)n97), (long)5998962430819414720L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    public static void i(Object[] var0) {
        block9: {
            block8: {
                var1_1 = (Component)var0[0];
                var2_2 = (Long)var0[1];
                var4_3 = (var2_2 = fg.a ^ var2_2) ^ 111218454684233L;
                var6_4 = m44.a("l", (long)3151881449376941273L, (long)var2_2);
                try {
                    try {
                        if (var6_4 == null) break block8;
                        if (m44.a("l", (long)3144729465210308469L, (long)var2_2) != false) {
                        }
                        ** GOTO lbl26
                    }
                    catch (n9 v0) {
                        throw m44.a("l", (Object)v0, (long)3867132085897712682L, (long)var2_2);
                    }
                    v1 = new Object[2];
                    v1[1] = var1_1;
                    v1[0] = var4_3;
                    m44.a("l", (Object)v1, (long)3863972349156804042L, (long)var2_2);
                }
                catch (n9 v2) {
                    throw m44.a("l", (Object)v2, (long)3867132085897712682L, (long)var2_2);
                }
            }
            try {
                if (var2_2 < 0L || var6_4 != null) break block9;
lbl26:
                // 2 sources

                m44.a("l", (Object)new e8(var1_1), (long)3304034293327604615L, (long)var2_2);
            }
            catch (n9 v3) {
                throw m44.a("l", (Object)v3, (long)3867132085897712682L, (long)var2_2);
            }
        }
    }

    public static boolean N(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                Color color = (Color)objectArray[1];
                l = a ^ l;
                reference var5_3 = m44.a("p", (Object)color, (long)2583241241199856371L, (long)l) + m44.a("p", (Object)color, (long)4162168796338465427L, (long)l) + m44.a("p", (Object)color, (long)2529169212696436342L, (long)l);
                CallSite callSite = m44.a("o", (long)4456026435275756210L, (long)l);
                try {
                    try {
                        object = var5_3;
                        if (callSite == null) break block4;
                        if (object >= fg.b("d", (int)915, (long)(0x1CFA92F777BE106L ^ l))) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)2576506699136352833L, (long)l);
                    }
                    object = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)2576506699136352833L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Loose catch block
     */
    public static void g(Object[] objectArray) {
        block7: {
            long l;
            Window window;
            block8: {
                window = (Window)objectArray[0];
                l = (Long)objectArray[1];
                l = a ^ l;
                CallSite callSite = m44.a("k", (long)7530848797014345702L, (long)l);
                if (callSite == null) break block7;
                try {
                    block9: {
                        if (m44.a("k", (long)7537647709116089418L, (long)l) == false) break block8;
                        break block9;
                        catch (InterruptedException interruptedException) {
                            throw m44.a("k", (Object)interruptedException, (long)8544903314150823701L, (long)l);
                        }
                    }
                    m44.a("t", (Object)window, (long)8506541427604478331L, (long)l);
                    if (callSite != null) break block7;
                }
                catch (InterruptedException interruptedException) {
                    throw m44.a("k", (Object)interruptedException, (long)8544903314150823701L, (long)l);
                }
            }
            try {
                m44.a("k", (Object)new ec(window), (long)8350100140132659213L, (long)l);
            }
            catch (InterruptedException interruptedException) {
                throw new n9((String)((Object)m44.a("t", (Object)interruptedException, (long)7809723850940095545L, (long)l)) + " " + window.getClass().getName());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new n9((String)((Object)m44.a("t", (Object)invocationTargetException.getTargetException(), (long)7786560869333425550L, (long)l)) + " " + window.getClass().getName());
            }
        }
    }

    static /* synthetic */ void H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Component component = (Component)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x7F2145029EEAL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = component;
        objectArray2[0] = l2;
        m44.a("o", (Object)objectArray2, (long)5277247238590249321L, (long)l);
    }

    static /* synthetic */ void I(Object[] objectArray) {
        JEditorPane jEditorPane = (JEditorPane)objectArray[0];
        String string = (String)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x6E1501E68001L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = string;
        objectArray2[1] = jEditorPane;
        objectArray2[0] = l2;
        m44.a("o", (Object)objectArray2, (long)2886687703486779176L, (long)l);
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x30AA;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/fg", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            fg.c[n2] = fg.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fg.a(n, l);
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
            throw new RuntimeException("com/zelix/fg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5080;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/fg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fg.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fg.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/fg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
