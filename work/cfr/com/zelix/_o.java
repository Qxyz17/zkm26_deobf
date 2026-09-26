/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._f;
import com.zelix._u;
import com.zelix.bn;
import com.zelix.f5;
import com.zelix.i_;
import com.zelix.js;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.nh;
import com.zelix.prr;
import com.zelix.xk;
import com.zelix.ym;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class _o {
    private final List P = new ArrayList();
    private Long L;
    private _o N;
    private final List X = new ArrayList();
    private _o R;
    private long x;
    private final bn G;
    private long l;
    private final boolean t;
    private List W;
    private f5 M;
    private f5 D;
    private long I;
    private long B;
    private xk p;
    private long y;
    private final boolean n;
    private int J;
    private static final long a = prr.a(7057231982527367698L, 6632972180499710182L, MethodHandles.lookup().lookupClass()).a(28100502819546L);
    private static final long b;

    public boolean I(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("t", (Object)this, (long)7227358904805109496L, (long)l10) != null;
        }
        catch (n9 n92) {
            throw m44.a("j", (Object)n92, (long)8714312319196590512L, (long)l10);
        }
        return bl2;
    }

    public List M(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return Collections.unmodifiableList(m44.a("q", (Object)this, (long)-6026917647764615277L, (long)l10));
    }

    void L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (Long)objectArray[1];
        l11 = a ^ l11;
        m44.a("t", (Object)this, (long)l10, (long)6408529300333954906L, (long)l11);
    }

    void o(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        _o _o2 = (_o)objectArray[1];
        l10 = a ^ l10;
        m44.a("t", (Object)this, (long)9167477644356964503L, (long)l10).add(_o2);
        m44.a("v", (Object)_o2, (_o)this, (long)8910818286923033526L, (long)l10);
    }

    void q(Object[] objectArray) {
        List list = (List)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        m44.a("s", (Object)this, (List)list, (long)161140480623419891L, (long)l10);
    }

    public long H(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x7FF73D8166E2L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        CallSite callSite = m44.a("w", (Object)m44.a("v", (Object)this, (long)2892025894139388437L, (long)l10), (Object)objectArray2, (long)3227411286250456944L, (long)l10);
        return (long)callSite;
    }

    public long w(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        int n12 = (Integer)objectArray[2];
        long l10 = ((long)n10 << 48 | (long)n11 << 32 >>> 16 | (long)n12 << 48 >>> 48) ^ a;
        return (long)m44.a("v", (Object)this, (long)1862462227953847308L, (long)l10);
    }

    boolean A(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("j", (long)-947352217680909711L, (long)l10);
                try {
                    bl2 = m44.a("t", (Object)this, (long)-1177292596359544825L, (long)l10).isEmpty();
                    if (callSite == null) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)n92, (long)-889707964805711112L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    void B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        _o _o2 = (_o)objectArray[1];
        l10 = a ^ l10;
        m44.a("w", (Object)this, (long)3486358076549601068L, (long)l10).add(_o2);
        m44.a("u", (Object)_o2, (_o)this, (long)3699639150108572131L, (long)l10);
    }

    _o(bn bn2, boolean bl2, boolean bl3) {
        this.G = bn2;
        this.n = bl2;
        this.t = bl3;
    }

    List H(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return new ArrayList(m44.a("r", (Object)this, (long)6899325719880232977L, (long)l10));
    }

    _o(bn bn2) {
        this(bn2, false, false);
    }

    public boolean L(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("t", (Object)this, (long)-7889873475328359778L, (long)l10) != null;
        }
        catch (n9 n92) {
            throw m44.a("j", (Object)n92, (long)-8494063280555949248L, (long)l10);
        }
        return bl2;
    }

    public long j(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (long)m44.a("v", (Object)this, (long)6938091199452937322L, (long)l10);
    }

    List A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return new ArrayList(m44.a("w", (Object)this, (long)-7563132004930539452L, (long)l10));
    }

    public boolean j(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("s", (Object)this, (long)8273310058162735509L, (long)l10);
    }

    _o D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)1243994068901970268L, (long)l10);
    }

    public long A(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (long)m44.a("v", (Object)this, (long)4672353482686898018L, (long)l10);
    }

    public f5 p(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)this, (long)-8810313410909295876L, (long)l10);
    }

    public xk e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)this, (long)-2217806249645713612L, (long)l10);
    }

    _o x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)this, (long)-5551891674647037881L, (long)l10);
    }

    public long J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (long)m44.a("v", (Object)this, (long)-6678182504207428507L, (long)l10);
    }

    public bn X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("u", (Object)this, (long)-6713245793749516035L, (long)l10);
    }

    public void I(Object[] objectArray) {
        f5 f52 = (f5)objectArray[0];
        long l10 = (Long)objectArray[1];
        f5 f53 = (f5)objectArray[2];
        long l11 = (Long)objectArray[3];
        long l12 = (Long)objectArray[4];
        long l13 = (l10 = a ^ l10) ^ 0x3DF3BB1A51BDL;
        m44.a("r", (Object)this, (f5)f52, (long)201773332604766459L, (long)l10);
        m44.a("r", (Object)this, (f5)f53, (long)87862344637591167L, (long)l10);
        m44.a("r", (Object)this, (long)l11, (long)1987929725109898818L, (long)l10);
        m44.a("r", (Object)this, (long)l12, (long)325397409764045747L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        m44.a("r", (Object)this, (long)m44.a("q", (Object)m44.a("p", (Object)this, (long)87862344637591167L, (long)l10), (Object)objectArray2, (long)1874838930096330945L, (long)l10), (long)1939734928133956164L, (long)l10);
    }

    public f5 z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)1592804841807338541L, (long)l10);
    }

    void E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (Long)objectArray[1];
        l11 = a ^ l11;
        m44.a("r", (Object)this, (Long)((long)m44.a("p", (Object)this, (long)3404363589439240938L, (long)l11)), (long)3238120109998169500L, (long)l11);
        m44.a("r", (Object)this, (long)l10, (long)3404363589439240938L, (long)l11);
    }

    public boolean E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("t", (Object)this, (long)-6074983501408857278L, (long)l10);
    }

    public int V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("u", (Object)this, (long)-5777562119854272845L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void G(Object[] var1_1) {
        block24: {
            block25: {
                block26: {
                    block23: {
                        block20: {
                            block22: {
                                block21: {
                                    block19: {
                                        var7_2 = (_f)var1_1[0];
                                        var5_3 = (_u)var1_1[1];
                                        var2_4 = (Long)var1_1[2];
                                        var4_5 = (_6)var1_1[3];
                                        var8_6 = (List)var1_1[4];
                                        var6_7 = (ym)var1_1[5];
                                        var9_8 = (nh)var1_1[6];
                                        v0 = var2_4 = _o.a ^ var2_4;
                                        var10_9 = v0 ^ 52003024974854L;
                                        var12_10 = v0 ^ 22542268174316L;
                                        var14_11 = v0 ^ 75606846375107L;
                                        var16_12 = v0 ^ 232629806346L;
                                        var18_13 = v0 ^ 106246830077845L;
                                        var20_14 = v0 ^ 8194952051594L;
                                        var22_15 = v0 ^ 119720860814993L;
                                        v1 = m44.a("m", (long)8470470688756854054L, (long)var2_4);
                                        m44.a("q", (Object)this, (long)m44.a("s", (Object)this, (long)8543413186968669759L, (long)var2_4), (long)8294575699452227391L, (long)var2_4);
                                        var24_16 = v1;
                                        var25_17 = null;
                                        try {
                                            try {
                                                v2 = this;
                                                if (var24_16 == null) break block19;
                                                if (m44.a("s", (Object)v2, (long)8181851865029153699L, (long)var2_4).C(var18_13)) break block20;
                                            }
                                            catch (n9 v3) {
                                                throw m44.a("m", (Object)v3, (long)8426344072350662063L, (long)var2_4);
                                            }
                                            v2 = m44.a("s", (Object)this, (long)7517540262399320807L, (long)var2_4);
                                        }
                                        catch (n9 v4) {
                                            throw m44.a("m", (Object)v4, (long)8426344072350662063L, (long)var2_4);
                                        }
                                    }
                                    try {
                                        try {
                                            v5 = var24_16;
                                            if (var2_4 >= 0L) {
                                                if (v5 == null) break block21;
                                                if (v2 == null) break block20;
                                            }
                                            ** GOTO lbl53
                                        }
                                        catch (n9 v6) {
                                            throw m44.a("m", (Object)v6, (long)8426344072350662063L, (long)var2_4);
                                        }
                                        v2 = m44.a("s", (Object)this, (long)7517540262399320807L, (long)var2_4);
                                    }
                                    catch (n9 v7) {
                                        throw m44.a("m", (Object)v7, (long)8426344072350662063L, (long)var2_4);
                                    }
                                }
                                try {
                                    try {
                                        v5 = var24_16;
lbl53:
                                        // 2 sources

                                        if (v5 == null) break block22;
                                        if (m44.a("s", (Object)v2, (long)8306435767970778037L, (long)var2_4) == false) break block20;
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("m", (Object)v8, (long)8426344072350662063L, (long)var2_4);
                                    }
                                    m44.a("q", (Object)this, (long)(m44.a("s", (Object)this, (long)8543413186968669759L, (long)var2_4) ^ m44.a("s", (Object)m44.a("s", (Object)this, (long)7517540262399320807L, (long)var2_4), (long)8543413186968669759L, (long)var2_4)), (long)8294575699452227391L, (long)var2_4);
                                    v2 = m44.a("s", (Object)this, (long)7517540262399320807L, (long)var2_4);
                                }
                                catch (n9 v9) {
                                    throw m44.a("m", (Object)v9, (long)8426344072350662063L, (long)var2_4);
                                }
                            }
                            var25_17 = v2;
                        }
                        try {
                            try {
                                v10 = new Object[7];
                                v10[6] = var4_5;
                                v10[5] = var5_3;
                                v10[4] = var12_10;
                                v10[3] = var25_17;
                                v10[2] = this;
                                v10[1] = var8_6;
                                v10[0] = var7_2;
                                m44.a("q", (Object)this, (int)m44.a("r", (Object)var9_8, (Object)v10, (long)7819007418948875647L, (long)var2_4), (long)7962287593504214813L, (long)var2_4);
                                v11 /* !! */  = m44.a("s", (Object)this, (long)8153963409345268333L, (long)var2_4);
                                if (var24_16 == null) break block23;
                                if (v11 /* !! */  == false) break block24;
                            }
                            catch (n9 v12) {
                                throw m44.a("m", (Object)v12, (long)8426344072350662063L, (long)var2_4);
                            }
                            v11 /* !! */  = (CallSite)var7_2.t(var10_9);
                        }
                        catch (n9 v13) {
                            throw m44.a("m", (Object)v13, (long)8426344072350662063L, (long)var2_4);
                        }
                    }
                    var26_18 = v11 /* !! */ ;
                    try {
                        v14 = var7_2;
                        v15 = "J";
                        v16 /* !! */  = var26_18;
                        if (var24_16 == null) break block25;
                        if (v16 /* !! */  == false) break block26;
                    }
                    catch (n9 v17) {
                        throw m44.a("m", (Object)v17, (long)8426344072350662063L, (long)var2_4);
                    }
                    v16 /* !! */  = (CallSite)4;
                    break block25;
                }
                v16 /* !! */  = (CallSite)true;
            }
            v18 = new Object[7];
            v18[6] = 5;
            v18[5] = var5_3;
            v18[4] = var6_7;
            v18[3] = var22_15;
            v18[2] = true;
            v18[1] = (int)v16 /* !! */ ;
            v18[0] = v15;
            var27_19 = m44.a("r", (Object)v14, (Object)v18, (long)7977461540334958421L, (long)var2_4);
            v19 = new Object[6];
            v19[5] = var27_19;
            v19[4] = var8_6;
            v19[3] = var27_19.V();
            v19[2] = var27_19.d(var16_12);
            v19[1] = var7_2.h(var14_11);
            v19[0] = var20_14;
            m44.a("q", (Object)this, (xk)m44.a("r", (Object)m44.a("r", (Object)var7_2, (Object)new Object[0], (long)8471786367778248399L, (long)var2_4), (Object)v19, (long)8342605730296303635L, (long)var2_4), (long)7554983084425699028L, (long)var2_4);
            m44.a("s", (Object)this, (long)8509112907031959001L, (long)var2_4).add(new i_((int)_o.b, (js)m44.a("s", (Object)this, (long)7554983084425699028L, (long)var2_4)));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x1645B32E7361L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -1658878846193057129L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

