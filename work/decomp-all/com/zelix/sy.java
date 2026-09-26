/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.kt;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.x6;
import com.zelix.x8;
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

public class sy
extends _4
implements ni {
    private final kt n;
    private x8 X;
    private x6 k;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    sy(_4 _42, h1 h12, long l, l6q l6q2) {
        int n;
        int n2;
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block18: {
            js js2;
            block19: {
                js js3;
                int n3;
                block16: {
                    block17: {
                        long l6 = l = a ^ l;
                        l5 = l6 ^ 0x451ED5BE1FDFL;
                        l4 = l6 ^ 0x46987462B4B5L;
                        l3 = l6 ^ 0x44D9B1E7196L;
                        l2 = l6 ^ 0x641B315C14D1L;
                        CallSite callSite2 = m44.a("n", (long)8847211143991331727L, (long)l);
                        super(_42);
                        n3 = h12.readUnsignedShort();
                        callSite = callSite2;
                        js2 = _42.m(l3, n3);
                        try {
                            try {
                                js3 = js2;
                                if (callSite == false) break block16;
                                if (js3 != null) break block17;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)((Object)n92), (long)7180023481207583041L, (long)l);
                            }
                            throw new aw((String)((Object)m44.a("q", (Object)_42.G(l4), (long)l5, (long)8683905336336746531L, (long)l)) + (String)((Object)sy.a("m", (int)13654, (long)(0x76AE7838E7B106AFL ^ l))) + n3 + (String)((Object)sy.a("m", (int)25239, (long)(0x13C7D769DB10D16BL ^ l))));
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)((Object)n93), (long)7180023481207583041L, (long)l);
                        }
                    }
                    js3 = js2;
                }
                try {
                    try {
                        n2 = js3 instanceof x6;
                        if (callSite == false) break block18;
                        if (n2 != 0) break block19;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)((Object)n94), (long)7180023481207583041L, (long)l);
                    }
                    throw new aw((String)((Object)m44.a("q", (Object)_42.G(l4), (long)l5, (long)8683905336336746531L, (long)l)) + (String)((Object)sy.a("m", (int)17037, (long)(0x20F0849EAB9DF17DL ^ l))) + n3 + (String)((Object)sy.a("m", (int)6058, (long)(0x2E4253F885BF2450L ^ l))) + js2.getClass().getName() + (String)((Object)sy.a("m", (int)30617, (long)(0x68EE22D3312DC467L ^ l))));
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)((Object)n95), (long)7180023481207583041L, (long)l);
                }
            }
            m44.a("r", (Object)((Object)this), (x6)((x6)js2), (long)8977109358534434460L, (long)l);
            this.n = new kt((_4)this, h12);
            n2 = h12.readUnsignedShort();
        }
        if ((n = n2) != 0) {
            js js4;
            js js5;
            block20: {
                block21: {
                    js5 = _42.m(l3, n);
                    try {
                        try {
                            js4 = js5;
                            if (l <= 0L || callSite == false) break block20;
                            if (js4 != null) break block21;
                        }
                        catch (n9 n96) {
                            throw m44.a("n", (Object)((Object)n96), (long)7180023481207583041L, (long)l);
                        }
                        throw new aw((String)((Object)m44.a("q", (Object)_42.G(l4), (long)l5, (long)8683905336336746531L, (long)l)) + (String)((Object)sy.a("m", (int)29939, (long)(0x625E28F42DFD470EL ^ l))) + n + (String)((Object)sy.a("m", (int)6856, (long)(0x1C0557DEBBCF2930L ^ l))));
                    }
                    catch (n9 n97) {
                        throw m44.a("n", (Object)((Object)n97), (long)7180023481207583041L, (long)l);
                    }
                }
                js4 = js5;
            }
            try {
                if (!(js4 instanceof x8)) {
                    throw new aw((String)((Object)m44.a("q", (Object)_42.G(l4), (long)l5, (long)8683905336336746531L, (long)l)) + (String)((Object)sy.a("m", (int)31296, (long)(0x14E97D9EC86B49BBL ^ l))) + n + (String)((Object)sy.a("m", (int)19380, (long)(0x12FE1415D1A8F84BL ^ l))) + js5.getClass().getName() + (String)((Object)sy.a("m", (int)31459, (long)(0x32CA5785A1F0C912L ^ l))));
                }
            }
            catch (n9 n98) {
                throw m44.a("n", (Object)((Object)n98), (long)7180023481207583041L, (long)l);
            }
            m44.a("r", (Object)((Object)this), (x8)((x8)js5), (long)7421430684520545145L, (long)l);
            l6q2.t((Object)m44.a("p", (Object)((Object)this), (long)7421430684520545145L, (long)l), (Object)this, l2);
        }
    }

    void z(gu gu2, long l) {
        block5: {
            long l2 = l ^ 0x66FDF08525FDL;
            CallSite callSite = m44.a("h", (long)5618762033536375070L, (long)l);
            try {
                boolean bl;
                try {
                    bl = gu2.K((js)m44.a("v", (Object)((Object)this), (long)6049223664153899514L, (long)l), (Object)this, l2, (Object)this.H());
                    if (callSite == false && m44.a("v", (Object)((Object)this), (long)5302995546213438495L, (long)l) != null) {
                    }
                    break block5;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)5531160218606984743L, (long)l);
                }
                bl = gu2.K((js)m44.a("v", (Object)((Object)this), (long)5302995546213438495L, (long)l), (Object)this, l2, (Object)this.H());
            }
            catch (n9 n93) {
                throw m44.a("h", (Object)((Object)n93), (long)5531160218606984743L, (long)l);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    void e(Object[] var1_1) {
        block17: {
            block14: {
                block16: {
                    block15: {
                        var4_2 = (Long)var1_1[0];
                        var3_3 = (DataOutputStream)var1_1[1];
                        var2_4 = (Map)var1_1[2];
                        var4_2 = sy.a ^ var4_2;
                        v0 = m44.a("h", (long)8140797144392279070L, (long)var4_2);
                        var3_3.writeShort(m44.a("v", (Object)this, (long)7994761583737736442L, (long)var4_2).E());
                        var6_5 = v0;
                        try {
                            v1 = var3_3;
                            v2 = m44.a("v", (Object)this, (long)7579043071819464716L, (long)var4_2).G();
                            if (var6_5 != false) break block14;
                            v1.writeShort(v2);
                            if (m44.a("v", (Object)this, (long)8401526438668331295L, (long)var4_2) != null) {
                            }
                            ** GOTO lbl48
                        }
                        catch (n9 v3) {
                            throw m44.a("h", (Object)v3, (long)8197274233188934439L, (long)var4_2);
                        }
                        var7_6 = (js)var2_4.get(m44.a("v", (Object)this, (long)8401526438668331295L, (long)var4_2));
                        try {
                            try {
                                v4 = var6_5;
                                if (var4_2 <= 0L) ** GOTO lbl37
                                if (v4 != false) break block15;
                                if (var7_6 != null) {
                                }
                                ** GOTO lbl40
                            }
                            catch (n9 v5) {
                                throw m44.a("h", (Object)v5, (long)8197274233188934439L, (long)var4_2);
                            }
                            var3_3.writeShort(var7_6.E());
                        }
                        catch (n9 v6) {
                            throw m44.a("h", (Object)v6, (long)8197274233188934439L, (long)var4_2);
                        }
                    }
                    try {
                        v4 = var6_5;
lbl37:
                        // 2 sources

                        if (var4_2 >= 0L) {
                            if (v4 == false) break block16;
                        }
                        ** GOTO lbl47
lbl40:
                        // 2 sources

                        var3_3.writeShort(m44.a("v", (Object)this, (long)8401526438668331295L, (long)var4_2).E());
                    }
                    catch (n9 v7) {
                        throw m44.a("h", (Object)v7, (long)8197274233188934439L, (long)var4_2);
                    }
                }
                try {
                    v4 = var6_5;
lbl47:
                    // 2 sources

                    if (v4 == false) break block17;
lbl48:
                    // 2 sources

                    v1 = var3_3;
                    v2 = 0;
                }
                catch (n9 v8) {
                    throw m44.a("h", (Object)v8, (long)8197274233188934439L, (long)var4_2);
                }
            }
            v1.writeShort(v2);
        }
    }

    void c(Object[] objectArray) {
        int n;
        DataOutputStream dataOutputStream;
        block6: {
            CallSite callSite;
            block4: {
                long l;
                block5: {
                    DataOutputStream dataOutputStream2 = (DataOutputStream)objectArray[0];
                    l = (Long)objectArray[1];
                    l = a ^ l;
                    CallSite callSite2 = m44.a("k", (long)-467609449658677046L, (long)l);
                    dataOutputStream2.writeShort(m44.a("u", (Object)((Object)this), (long)-13452104122884647L, (long)l).E());
                    dataOutputStream2.writeShort(m44.a("u", (Object)((Object)this), (long)-572793158802747089L, (long)l).G());
                    CallSite callSite3 = callSite2;
                    try {
                        try {
                            dataOutputStream = dataOutputStream2;
                            callSite = m44.a("u", (Object)((Object)this), (long)-1892888548201826244L, (long)l);
                            if (callSite3 == false) break block4;
                            if (callSite != null) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)((Object)n92), (long)-2242302955991141884L, (long)l);
                        }
                        n = 0;
                        break block6;
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)((Object)n93), (long)-2242302955991141884L, (long)l);
                    }
                }
                callSite = m44.a("u", (Object)((Object)this), (long)-1892888548201826244L, (long)l);
            }
            n = callSite.E();
        }
        dataOutputStream.writeShort(n);
    }

    public void q(x8 x82, long l, x8 x83) {
        block9: {
            sy sy2;
            block10: {
                CallSite callSite;
                block8: {
                    CallSite callSite2 = m44.a("n", (long)-5231047857311529425L, (long)l);
                    try {
                        try {
                            try {
                                callSite = m44.a("p", (Object)((Object)this), (long)-6098373098239936807L, (long)l);
                                if (l <= 0L || callSite2 == false) break block8;
                                if (callSite == null) break block9;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)((Object)n92), (long)-5907421672036844319L, (long)l);
                            }
                            sy2 = this;
                            if (callSite2 == false) break block10;
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)((Object)n93), (long)-5907421672036844319L, (long)l);
                        }
                        callSite = m44.a("p", (Object)((Object)sy2), (long)-6098373098239936807L, (long)l);
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)((Object)n94), (long)-5907421672036844319L, (long)l);
                    }
                }
                try {
                    if (callSite != x82) break block9;
                    sy2 = this;
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)((Object)n95), (long)-5907421672036844319L, (long)l);
                }
            }
            m44.a("r", (Object)((Object)sy2), (x8)x83, (long)-6098373098239936807L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                sy.a = prr.a((long)-7040618358614435484L, (long)3195317424705782208L, MethodHandles.lookup().lookupClass()).a(124297506163922L);
                sy.d = new HashMap<K, V>(13);
                var0 = sy.a ^ 135153490961057L;
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
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "J\u00db\u001fT\u00f3\u0091\u00ea\u00f6OH\u00ee4K\u009f\u00e7\u0098\u00c4X\u00f2\u00d4|#\u00df\u0084\u00ff\u00bcA\u00f52\u00cf\u00b2\u00fd\u0096\u00fc'(\u0002\u00d2\t\u00b3\u00b5\u000eh\u00a7\u00f6\u0090C\t\u008a\u00bbf\u001e\u009e\u00b3\u00cb\u00e7\\)f\u00df\u00c5\u00a2\u001f\u0018\b\u00ae]\u00ae\u00fc\u008c\u00beZPzF\u000e_\u0095\u00b2\u001ci`\u008c!\u0083\u00fc\u00bbe\u0084,\u00fc\u00d8\u001cK\u00ad\u0017\u00cd{\u0005\u00cd\u00ee\u0010\u0014\u00fc\u0084\u00efO\u00aa\u00b6DiZ\u00e7\u00f4\u00afhc\u00e62}C5\u00d8\u00e6&\u00a9\u0087\u00e1'\u008a\u00b7d\u00c9\u00a7\u00ac9\u0016\u00aa\b<s\u00aeX`PJ@o\u00d4\u00c6\u00e4\u00f3\u00fd\u0010\u00d1\u00d0\u00ba\u00c2s\u00fe\u009bWR\u000f(\u00044\u0080\u00e7\u0011(G\u0018\u00ad\u009d\u00a9'\u00b9\u00e7\u00b6\u00bf\u00f5\u00da\u00c2\u00ed\u0090\u009e\u0081\u00bchf\u00c8#\u00d4'\u00dd\u00e7s~dH\t\u00c8\u00bbD7\u0090;\u00c27\u00e8H\u00f4YZg\rnp\u0007\u00986\u001a\u00fe\u00da\u00e8]\u0097dM\u00a5MD\u00df\u00b0\u00f0\u000bD\u0091d\u00e4\u0093\u009d\u0088\u0006%X,\u00ea?\u00dd\u00ebAOvq\u00ca\u0081,\u00f4\u0004\u00f6\u00ab\u0004w\u0012fS:\u00ff&Z'\u00e6\u00bd\u0087\u0003~6P\u00a41\u00abYH8SB\u00a6\u00bb\u00ac+\u00f4\u0089\u0095+\u0014\u00b1\u008avV*$M3G\u00e0a\u00b9:\u00ff\u008e\u00f4\u009e\u001a\u00107\u00cf\u00b4\u0081\u00ce\u00df\\S\u0002sj/\u0096\u00dd\u0093`L\u009f\u00db\u0098M\u009c\u00b0*m\u0014?\r\u00ec`\u0002e?a\u00ea\u00d1\u0014\u0091Ru\u008d@T\u0010\u00c8\u00e6\u00b5V\u009d\u000f\u00f0\u009c\u00eb\u008d[JT\u00de\u00d4#\u00b3=$:\u0090\u00ecd\u0084\u009dP\u0095\u00eb\u0007\u00e8fQ*H!\u00b4u\u00c3\u00ef\u00e1\u00b5\u008b7\u0083\u0093\\\u00fc\u00e6\u00b7\u007f\u00b9\u0091\u00c8\u0092\u00dc\u00b4\u00e3\u00f34\u00b7\u0092a\u0010\u00e0A\u00c0M\u00b3WQ)\u00d2\r\u00adJf \u00ae\\";
                var8_6 = "J\u00db\u001fT\u00f3\u0091\u00ea\u00f6OH\u00ee4K\u009f\u00e7\u0098\u00c4X\u00f2\u00d4|#\u00df\u0084\u00ff\u00bcA\u00f52\u00cf\u00b2\u00fd\u0096\u00fc'(\u0002\u00d2\t\u00b3\u00b5\u000eh\u00a7\u00f6\u0090C\t\u008a\u00bbf\u001e\u009e\u00b3\u00cb\u00e7\\)f\u00df\u00c5\u00a2\u001f\u0018\b\u00ae]\u00ae\u00fc\u008c\u00beZPzF\u000e_\u0095\u00b2\u001ci`\u008c!\u0083\u00fc\u00bbe\u0084,\u00fc\u00d8\u001cK\u00ad\u0017\u00cd{\u0005\u00cd\u00ee\u0010\u0014\u00fc\u0084\u00efO\u00aa\u00b6DiZ\u00e7\u00f4\u00afhc\u00e62}C5\u00d8\u00e6&\u00a9\u0087\u00e1'\u008a\u00b7d\u00c9\u00a7\u00ac9\u0016\u00aa\b<s\u00aeX`PJ@o\u00d4\u00c6\u00e4\u00f3\u00fd\u0010\u00d1\u00d0\u00ba\u00c2s\u00fe\u009bWR\u000f(\u00044\u0080\u00e7\u0011(G\u0018\u00ad\u009d\u00a9'\u00b9\u00e7\u00b6\u00bf\u00f5\u00da\u00c2\u00ed\u0090\u009e\u0081\u00bchf\u00c8#\u00d4'\u00dd\u00e7s~dH\t\u00c8\u00bbD7\u0090;\u00c27\u00e8H\u00f4YZg\rnp\u0007\u00986\u001a\u00fe\u00da\u00e8]\u0097dM\u00a5MD\u00df\u00b0\u00f0\u000bD\u0091d\u00e4\u0093\u009d\u0088\u0006%X,\u00ea?\u00dd\u00ebAOvq\u00ca\u0081,\u00f4\u0004\u00f6\u00ab\u0004w\u0012fS:\u00ff&Z'\u00e6\u00bd\u0087\u0003~6P\u00a41\u00abYH8SB\u00a6\u00bb\u00ac+\u00f4\u0089\u0095+\u0014\u00b1\u008avV*$M3G\u00e0a\u00b9:\u00ff\u008e\u00f4\u009e\u001a\u00107\u00cf\u00b4\u0081\u00ce\u00df\\S\u0002sj/\u0096\u00dd\u0093`L\u009f\u00db\u0098M\u009c\u00b0*m\u0014?\r\u00ec`\u0002e?a\u00ea\u00d1\u0014\u0091Ru\u008d@T\u0010\u00c8\u00e6\u00b5V\u009d\u000f\u00f0\u009c\u00eb\u008d[JT\u00de\u00d4#\u00b3=$:\u0090\u00ecd\u0084\u009dP\u0095\u00eb\u0007\u00e8fQ*H!\u00b4u\u00c3\u00ef\u00e1\u00b5\u008b7\u0083\u0093\\\u00fc\u00e6\u00b7\u007f\u00b9\u0091\u00c8\u0092\u00dc\u00b4\u00e3\u00f34\u00b7\u0092a\u0010\u00e0A\u00c0M\u00b3WQ)\u00d2\r\u00adJf \u00ae\\".length();
                var5_7 = 72;
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
                    var9_3[var7_4++] = sy.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "^1$\u00f5\u0016\u00ad\u00de\u009c\u00afZ(.\u0017l@\u00aa\u00c6\u00a7\u0002{\u00f6\u00de\u00b8BJA\u00ddj\u00b3\u00fa1\u00f9\u0007=Q\u0092\u00ee\u0099\u0097w@\u00cd\\\u0085\n\u001b\u00dc.T\u00f2\u00cc\u00e9\u00f7\u00ba\u00d3\u00f9\f~\u00e0\u00f6\u00e6\u0014I\u00a8v\u0086\u00ff\u000f\u000fS\u00fe\u00e5\u00b5\u00e65\u00d6{E>\u008b\u0017\u00dc x\u00fd9\u0092?K\u00ab\u0093k\u00925W\u00efO*\u00b37a;\u0092X\u00a7";
                    var8_6 = "^1$\u00f5\u0016\u00ad\u00de\u009c\u00afZ(.\u0017l@\u00aa\u00c6\u00a7\u0002{\u00f6\u00de\u00b8BJA\u00ddj\u00b3\u00fa1\u00f9\u0007=Q\u0092\u00ee\u0099\u0097w@\u00cd\\\u0085\n\u001b\u00dc.T\u00f2\u00cc\u00e9\u00f7\u00ba\u00d3\u00f9\f~\u00e0\u00f6\u00e6\u0014I\u00a8v\u0086\u00ff\u000f\u000fS\u00fe\u00e5\u00b5\u00e65\u00d6{E>\u008b\u0017\u00dc x\u00fd9\u0092?K\u00ab\u0093k\u00925W\u00efO*\u00b37a;\u0092X\u00a7".length();
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
                    var9_3[var7_4++] = sy.a(var10_9).intern();
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
        sy.b = var9_3;
        sy.c = new String[10];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5A21;
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
                throw new RuntimeException("com/zelix/sy", exception);
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
            sy.c[n2] = sy.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = sy.a(n, l);
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
            throw new RuntimeException("com/zelix/sy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(sy.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
