/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._p;
import com.zelix._u;
import com.zelix._x;
import com.zelix.d7;
import com.zelix.g;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.v8;
import com.zelix.yf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dk
extends d7 {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public dk(String string, _u _u2, _6 _62, yf yf2, short s, int n, int n2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ a;
        long l2 = l ^ 0x549B1493F011L;
        int n3 = (int)(l2 >>> 48);
        int n4 = (int)(l2 << 16 >>> 48);
        int n5 = (int)(l2 << 32 >>> 32);
        super(string, _u2, _62, (char)n3, yf2, (char)n4, n5);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void Z(Object[] var1_1) {
        block39: {
            block38: {
                block37: {
                    var3_2 = (g)var1_1[0];
                    var4_3 = (Long)var1_1[1];
                    var2_4 = (List)var1_1[2];
                    v0 = var4_3;
                    var6_5 = v0 ^ 86990437449995L;
                    var8_6 = v0 ^ 88794581239799L;
                    var10_7 = v0 ^ 42473911073173L;
                    var12_8 = v0 ^ 48920400913546L;
                    var14_9 = v0 ^ 92436307029975L;
                    var16_10 = v0 ^ 27331795207821L;
                    var18_11 = v0 ^ 70883236740534L;
                    var20_12 = v0 ^ 112106722428998L;
                    v1 = v0 ^ 31121255949568L;
                    var22_13 = (int)(v1 >>> 48);
                    var23_14 = (int)(v1 << 16 >>> 32);
                    var24_15 = (int)(v1 << 48 >>> 48);
                    v2 = new Object[1];
                    v2[0] = var8_6;
                    var26_16 = m44.a("s", (Object)var3_2, (Object)v2, (long)2854846168187985466L, (long)var4_3);
                    var25_17 = m44.a("l", (long)2600853758383336635L, (long)var4_3);
                    var27_18 = null;
                    v3 = new Object[2];
                    v3[1] = var14_9;
                    v3[0] = 0;
                    var28_19 = m44.a("s", (Object)this, (Object)v3, (long)2507988295117767072L, (long)var4_3);
                    try {
                        v4 = var28_19;
                        if (var25_17 == null) break block37;
                        if (v4 == null) break block38;
                    }
                    catch (n9 v5) {
                        throw m44.a("l", (Object)v5, (long)2625893547001109630L, (long)var4_3);
                    }
                    v4 = var28_19;
                }
                v6 = new Object[1];
                v6[0] = var8_6;
                var27_18 = m44.a("s", (Object)v4, (Object)v6, (long)2854846168187985466L, (long)var4_3);
            }
            v7 = new Object[1];
            v7[0] = var10_7;
            var29_20 = m44.a("s", (Object)var3_2, (Object)v7, (long)2875901081386532426L, (long)var4_3);
            while (var29_20.hasMoreElements()) {
                block46: {
                    block41: {
                        block48: {
                            block47: {
                                block42: {
                                    block44: {
                                        block43: {
                                            block40: {
                                                var30_21 = (String)var29_20.nextElement();
                                                v8 = new Object[2];
                                                v8[1] = var30_21;
                                                v8[0] = var20_12;
                                                var31_22 = m44.a("s", (Object)var3_2, (Object)v8, (long)4555209824173780987L, (long)var4_3);
                                                try {
                                                    try {
                                                        try {
                                                            if (var25_17 == null) break block39;
                                                            v9 = var31_22;
                                                            if (var25_17 == null) break block40;
                                                        }
                                                        catch (n9 v10) {
                                                            throw m44.a("l", (Object)v10, (long)2625893547001109630L, (long)var4_3);
                                                        }
                                                        if (v9 == null) break block41;
                                                    }
                                                    catch (n9 v11) {
                                                        throw m44.a("l", (Object)v11, (long)2625893547001109630L, (long)var4_3);
                                                    }
                                                    v9 = var31_22.t();
                                                }
                                                catch (n9 v12) {
                                                    throw m44.a("l", (Object)v12, (long)2625893547001109630L, (long)var4_3);
                                                }
                                            }
                                            var32_23 = (String)v9;
                                            try {
                                                v13 /* !! */  = var32_23.startsWith((String)dk.d("v", (int)4700, (long)(5925227477140783868L ^ var4_3)));
                                                v14 = var25_17;
                                                if (var4_3 <= 0L) ** GOTO lbl137
                                                if (v14 == null) break block42;
                                                if (v13 /* !! */  != 0) {
                                                }
                                                ** GOTO lbl129
                                            }
                                            catch (n9 v15) {
                                                throw m44.a("l", (Object)v15, (long)2625893547001109630L, (long)var4_3);
                                            }
                                            var33_24 = var32_23.lastIndexOf("/");
                                            try {
                                                try {
                                                    v16 = var33_24;
                                                    v17 = -1;
                                                    if (var25_17 == null) break block43;
                                                    if (v16 <= v17) break block44;
                                                }
                                                catch (n9 v18) {
                                                    throw m44.a("l", (Object)v18, (long)2625893547001109630L, (long)var4_3);
                                                }
                                                v16 = var33_24;
                                                v17 = var32_23.length() - 1;
                                            }
                                            catch (n9 v19) {
                                                throw m44.a("l", (Object)v19, (long)2625893547001109630L, (long)var4_3);
                                            }
                                        }
                                        if (v16 < v17) {
                                            block45: {
                                                var34_25 = var32_23.substring(var33_24 + 1);
                                                v20 = new Object[2];
                                                v20[1] = var16_10;
                                                v20[0] = var34_25;
                                                var35_26 = m44.a("s", (Object)this, (Object)v20, (long)2340296649648818539L, (long)var4_3);
                                                try {
                                                    v21 = var35_26;
                                                    if (var25_17 == null) break block45;
                                                    if (v21 == null) break block44;
                                                }
                                                catch (n9 v22) {
                                                    throw m44.a("l", (Object)v22, (long)2625893547001109630L, (long)var4_3);
                                                }
                                                v21 = var35_26;
                                            }
                                            if (m44.a("s", (Object)v21, (char)((char)var22_13), (int)var23_14, (short)((short)var24_15), (long)2661230061017664697L, (long)var4_3) != false) {
                                                var36_27 = var32_23.substring(0, var33_24 + 1);
                                                v23 = new Object[1];
                                                v23[0] = var6_5;
                                                var37_29 = var36_27 + (String)m44.a("s", (Object)var35_26, (Object)v23, (long)4258109515471129900L, (long)var4_3);
                                                var31_22.Z(var18_11, var37_29);
                                            }
                                        }
                                    }
                                    try {
                                        v24 = var25_17;
                                        if (var4_3 <= 0L) break block46;
                                        if (v24 != null) break block41;
lbl129:
                                        // 2 sources

                                        v13 /* !! */  = (int)var32_23.startsWith((String)dk.d("v", (int)14550, (long)(9159939485837912176L ^ var4_3)));
                                    }
                                    catch (n9 v25) {
                                        throw m44.a("l", (Object)v25, (long)2625893547001109630L, (long)var4_3);
                                    }
                                }
                                try {
                                    try {
                                        v14 = var25_17;
lbl137:
                                        // 2 sources

                                        if (v14 == null) break block47;
                                        if (v13 /* !! */  == 0) break block41;
                                    }
                                    catch (n9 v26) {
                                        throw m44.a("l", (Object)v26, (long)2625893547001109630L, (long)var4_3);
                                    }
                                    v13 /* !! */  = (int)m44.a("s", (Object)var32_23, (Object)"/", (int)dk.d("v", (int)6084, (long)(2516848074954229607L ^ var4_3)).length(), (long)4560748845166450002L, (long)var4_3);
                                }
                                catch (n9 v27) {
                                    throw m44.a("l", (Object)v27, (long)2625893547001109630L, (long)var4_3);
                                }
                            }
                            var33_24 = v13 /* !! */ ;
                            try {
                                try {
                                    v28 = var33_24;
                                    v29 = -1;
                                    if (var25_17 == null) break block48;
                                    if (v28 <= v29) break block41;
                                }
                                catch (n9 v30) {
                                    throw m44.a("l", (Object)v30, (long)2625893547001109630L, (long)var4_3);
                                }
                                v28 = var33_24;
                                v29 = var32_23.length() - 1;
                            }
                            catch (n9 v31) {
                                throw m44.a("l", (Object)v31, (long)2625893547001109630L, (long)var4_3);
                            }
                        }
                        if (v28 < v29) {
                            var34_25 = var32_23.substring(0, var33_24 + 1);
                            var35_26 = var32_23.substring(var33_24 + 1);
                            var36_28 = var35_26.lastIndexOf("/");
                            if (var36_28 > -1) {
                                block49: {
                                    var37_29 = var35_26.substring(0, var36_28);
                                    var38_30 = var35_26.substring(var36_28);
                                    v32 = new Object[2];
                                    v32[1] = var37_29;
                                    v32[0] = var12_8;
                                    var39_31 = m44.a("s", (Object)this, (Object)v32, (long)4536911805956217416L, (long)var4_3);
                                    try {
                                        try {
                                            v33 = var37_29;
                                            if (var25_17 == null) break block49;
                                            if (v33.equals(var39_31)) break block41;
                                        }
                                        catch (n9 v34) {
                                            throw m44.a("l", (Object)v34, (long)2625893547001109630L, (long)var4_3);
                                        }
                                        v33 = var32_23.substring(0, var33_24 + 1) + (String)var39_31 + var38_30;
                                    }
                                    catch (n9 v35) {
                                        throw m44.a("l", (Object)v35, (long)2625893547001109630L, (long)var4_3);
                                    }
                                }
                                var40_32 = v33;
                                var31_22.Z(var18_11, var40_32);
                            }
                        }
                    }
                    v24 = var25_17;
                }
                if (v24 != null) continue;
            }
            var2_4.add(var3_2);
            if (var4_3 >= 0L) {
                // empty if block
            }
        }
    }

    public dk(long l, String string, v8 v82, _p _p2, _p _p3, _x _x2, _u _u2, _6 _62, yf yf2) {
        long l2 = (l = a ^ l) ^ 0x296B323E0637L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 48);
        int n3 = (int)(l2 << 48 >>> 48);
        super(n, string, (char)n2, n3, v82, _p2, _p3, _x2, _u2, _62, yf2);
    }

    void A(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        long l3;
        long l4;
        Map map;
        g g2;
        block18: {
            CallSite callSite3;
            CallSite callSite4;
            long l5;
            block17: {
                g2 = (g)objectArray[0];
                map = (Map)objectArray[1];
                Map map2 = (Map)objectArray[2];
                l4 = (Long)objectArray[3];
                Map map3 = (Map)objectArray[4];
                ol ol2 = (ol)objectArray[5];
                long l6 = l4;
                l5 = l6 ^ 0x44973BC0F33EL;
                l3 = l6 ^ 0x32F418D84D5CL;
                long l7 = l6 ^ 0x404723875B1EL;
                l2 = l6 ^ 0xC8E8F483244L;
                l = l6 ^ 0x71A0C3E7FC8FL;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l5;
                callSite2 = m44.a("r", (Object)g2, (Object)objectArray2, (long)-3217990004458181901L, (long)l4);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l7;
                objectArray3[0] = 0;
                CallSite callSite5 = m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-3024380162341014167L, (long)l4);
                callSite4 = null;
                callSite = m44.a("m", (long)-3399933066493011854L, (long)l4);
                try {
                    callSite3 = callSite5;
                    if (callSite == null) break block17;
                    if (callSite3 == null) break block18;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)((Object)n92), (long)-3406946654324774729L, (long)l4);
                }
                callSite3 = callSite5;
            }
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l5;
            callSite4 = m44.a("r", (Object)callSite3, (Object)objectArray4, (long)-3217990004458181901L, (long)l4);
        }
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l3;
        CallSite callSite6 = m44.a("r", (Object)g2, (Object)objectArray5, (long)-3233491490583000445L, (long)l4);
        while (callSite6.hasMoreElements()) {
            block20: {
                int n;
                int n2;
                int n3;
                String string;
                String string2;
                block22: {
                    int n4;
                    block21: {
                        Object object;
                        block19: {
                            string2 = (String)callSite6.nextElement();
                            Object[] objectArray6 = new Object[2];
                            objectArray6[1] = string2;
                            objectArray6[0] = l;
                            CallSite callSite7 = m44.a("r", (Object)g2, (Object)objectArray6, (long)-3747470538448659662L, (long)l4);
                            try {
                                try {
                                    object = callSite7;
                                    if (callSite == null) break block19;
                                    if (object == null) break block20;
                                }
                                catch (n9 n93) {
                                    throw m44.a("m", (Object)((Object)n93), (long)-3406946654324774729L, (long)l4);
                                }
                                object = callSite7.t();
                            }
                            catch (n9 n94) {
                                throw m44.a("m", (Object)((Object)n94), (long)-3406946654324774729L, (long)l4);
                            }
                        }
                        string = (String)object;
                        try {
                            try {
                                n4 = string.startsWith((String)((Object)dk.d("v", (int)4323, (long)(0x254D499E80A2348BL ^ l4))));
                                if (callSite == null) break block21;
                                if (n4 == 0) break block20;
                            }
                            catch (n9 n95) {
                                throw m44.a("m", (Object)((Object)n95), (long)-3406946654324774729L, (long)l4);
                            }
                            n4 = string.lastIndexOf("/");
                        }
                        catch (n9 n96) {
                            throw m44.a("m", (Object)((Object)n96), (long)-3406946654324774729L, (long)l4);
                        }
                    }
                    n3 = n4;
                    try {
                        try {
                            n2 = n3;
                            n = -1;
                            if (callSite == null) break block22;
                            if (n2 <= n) break block20;
                        }
                        catch (n9 n97) {
                            throw m44.a("m", (Object)((Object)n97), (long)-3406946654324774729L, (long)l4);
                        }
                        n2 = n3;
                        n = string.length();
                    }
                    catch (n9 n98) {
                        throw m44.a("m", (Object)((Object)n98), (long)-3406946654324774729L, (long)l4);
                    }
                }
                if (n2 < n) {
                    String string3 = string.substring(n3 + 1);
                    Object[] objectArray7 = new Object[2];
                    objectArray7[1] = l2;
                    objectArray7[0] = string3;
                    CallSite callSite8 = m44.a("r", (Object)((Object)this), (Object)objectArray7, (long)-3120023456542671454L, (long)l4);
                    if (callSite8 != null) {
                        String string4 = (String)((Object)dk.d("v", (int)21880, (long)(0xFD92E9A0D9A7114L ^ l4))) + (String)((Object)m44.a("s", (Object)((Object)this), (long)-3378416810448268519L, (long)l4)) + (String)((Object)dk.d("v", (int)29905, (long)(0x114F0344869850BCL ^ l4))) + (String)((Object)callSite2) + (String)((Object)dk.d("v", (int)13076, (long)(0x25C1531BB391977FL ^ l4))) + string2 + (String)((Object)dk.d("v", (int)4012, (long)(0x4F039A1E957D2BC2L ^ l4))) + string + "'";
                        map.put(callSite8, string4);
                    }
                }
            }
            if (callSite != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                dk.a = prr.a((long)6142464546456657688L, (long)7547156767625588127L, MethodHandles.lookup().lookupClass()).a(167242003264907L);
                dk.d = new HashMap<K, V>(13);
                var0 = dk.a ^ 7126696479684L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "?0\u009dD\u00b1bUR\u00de\u00b6\u00e5ue\u0011\u0000\u00e9\u00db\u00d4\u00ad\u009b\u0093\u00b6\u00fe\u0094\u0010\u008cb[\u0096B' !\u00a6\u0018L\u0093\u00cd\u00fdrA8\u00cb\u009b8\u00cf7\u0089\u00c67\u00cdW\u0096\u00f4\u00ee\u00a6 \u00abw\u0000H(\u0010\u00d0^X\u00a7\u0081>\u0005\u0098\u00ae\u0001;q\u008al\u0098\u00ca\u009d\u00ec\u0000.\b\u00ae\u00c0\u00f1\u00b0\u00fe\u00c1\u00b5\u00ad\u00b7\u00de\u00a0\u0090)\u00dd(@\u00fd\u000e\u00f8y\u008a\u00af\u0085\u00ecq\u00a0\u00a2Uk\u00b0\u00f3\u00d3\u00a3\u0092>aF]\u0003\u000f\u00f0\u00e9B\u00f2vs\u00df4c\u00beu\u0097\u0007\u009cT\u0018\u0086\u00fdJ\u00d8l\u00e2\u0004\u00a3\u00b6\u00b6N3 2^CZ\u00b0i\u008d\u00a7O\u00dc] \u001d-h\u00b3\u00e7\u00c8\u00d9=ze\u00e5\u00bb\u00aa~4\\\u0093\u00d5\u00bf1L\u00ef\u0013\u00e7\u008f\u00b7#d\u00cd\u00be\u00b8z";
                var8_6 = "?0\u009dD\u00b1bUR\u00de\u00b6\u00e5ue\u0011\u0000\u00e9\u00db\u00d4\u00ad\u009b\u0093\u00b6\u00fe\u0094\u0010\u008cb[\u0096B' !\u00a6\u0018L\u0093\u00cd\u00fdrA8\u00cb\u009b8\u00cf7\u0089\u00c67\u00cdW\u0096\u00f4\u00ee\u00a6 \u00abw\u0000H(\u0010\u00d0^X\u00a7\u0081>\u0005\u0098\u00ae\u0001;q\u008al\u0098\u00ca\u009d\u00ec\u0000.\b\u00ae\u00c0\u00f1\u00b0\u00fe\u00c1\u00b5\u00ad\u00b7\u00de\u00a0\u0090)\u00dd(@\u00fd\u000e\u00f8y\u008a\u00af\u0085\u00ecq\u00a0\u00a2Uk\u00b0\u00f3\u00d3\u00a3\u0092>aF]\u0003\u000f\u00f0\u00e9B\u00f2vs\u00df4c\u00beu\u0097\u0007\u009cT\u0018\u0086\u00fdJ\u00d8l\u00e2\u0004\u00a3\u00b6\u00b6N3 2^CZ\u00b0i\u008d\u00a7O\u00dc] \u001d-h\u00b3\u00e7\u00c8\u00d9=ze\u00e5\u00bb\u00aa~4\\\u0093\u00d5\u00bf1L\u00ef\u0013\u00e7\u008f\u00b7#d\u00cd\u00be\u00b8z".length();
                var5_7 = 24;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = dk.d(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e3\u00b1\u008a\u00f4i\u00d0E\u0004|p|\u0000\u00a2\u0085v\u00e1\u00d4\u00c4\u00cbk\u00b6\u00d43\u00da^[u\u00ebmy5\u00cb\u00c0\u00caMg\u00b2\u00c4\u009f0\u0010E\u008b#~_\u0016#M\u0082\u0004\u00c6\u0098\u00f4\u0092\u0007\u00f4";
                    var8_6 = "\u00e3\u00b1\u008a\u00f4i\u00d0E\u0004|p|\u0000\u00a2\u0085v\u00e1\u00d4\u00c4\u00cbk\u00b6\u00d43\u00da^[u\u00ebmy5\u00cb\u00c0\u00caMg\u00b2\u00c4\u009f0\u0010E\u008b#~_\u0016#M\u0082\u0004\u00c6\u0098\u00f4\u0092\u0007\u00f4".length();
                    var5_7 = 40;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = dk.d(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        dk.b = var9_3;
        dk.c = new String[8];
    }

    private static n9 b(n9 n92) {
        return n92;
    }

    private static String d(byte[] byArray) {
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

    private static String d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7EFE;
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
                throw new RuntimeException("com/zelix/dk", exception);
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
            dk.c[n2] = dk.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dk.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/dk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dk.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
