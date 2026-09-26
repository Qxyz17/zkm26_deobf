/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._e;
import com.zelix._v;
import com.zelix.cf;
import com.zelix.d1;
import com.zelix.df;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.iq;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.lb6;
import com.zelix.lkv;
import com.zelix.lmt;
import com.zelix.m44;
import com.zelix.m7;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b5
extends _4
implements ni,
lmt,
Comparable {
    private int R;
    private x8 C;
    private boolean L;
    private int j;
    final d1 V;
    private x8 T;
    private iq x;
    private iq p;
    private byte[] o;
    private static final long a;
    private static final String c;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    public x8 T() {
        return this.T;
    }

    public int compareTo(Object object) {
        long l10 = a ^ 0x7765D59BC7BDL;
        long l11 = l10 ^ 0x4EF2835882EFL;
        Object[] objectArray = new Object[2];
        objectArray[1] = (b5)object;
        objectArray[0] = l11;
        return (int)m44.a("v", (Object)this, (Object)objectArray, (long)2802834584563348580L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    void l(Object[] var1_1) {
        block3: {
            var2_2 = (Long)var1_1[0];
            var2_2 = b5.a ^ var2_2;
            var4_3 = m44.a("h", (long)-6196495518835156151L, (long)var2_2);
            if (!_e.vH) ** GOTO lbl10
            var5_4 = this.T().V() + (char)b5.a("z", (int)17353, (long)(2272985067783116135L ^ var2_2)) + "a";
            try {
                this.T().A(var5_4);
                if (var2_2 < 0L || var4_3 != false) break block3;
lbl10:
                // 2 sources

                this.T().A("a");
            }
            catch (n9 v0) {
                throw m44.a("h", (Object)v0, (long)-5337252921488905091L, (long)var2_2);
            }
        }
    }

    public void S(Object[] objectArray) {
        block9: {
            Object object;
            block10: {
                String string;
                CallSite callSite;
                String string2;
                lb6 lb62;
                long l10;
                long l11;
                long l12;
                block8: {
                    int n10 = (Integer)objectArray[0];
                    l12 = (Long)objectArray[1];
                    int n11 = (Integer)objectArray[2];
                    HashMap hashMap = (HashMap)objectArray[3];
                    long l13 = l12;
                    l11 = l13 ^ 0x54FB6F0C2B4L;
                    long l14 = l13 ^ 0x5B0463FB65FAL;
                    long l15 = l13 ^ 0x251D1044B7BCL;
                    l10 = l13 ^ 0x6136368F7C57L;
                    lb62 = new lb6(0);
                    string2 = _v.X(this.O().V(), lb62, l14);
                    callSite = m44.a("m", (long)-9201728108289330940L, (long)l12);
                    try {
                        try {
                            string = string2;
                            if (callSite == false) break block8;
                            if (string == null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("m", (Object)n92, (long)-6943704478997232080L, (long)l12);
                        }
                        string = (String)cf.J(l15, string2, hashMap);
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)n93, (long)-6943704478997232080L, (long)l12);
                    }
                }
                String string3 = string;
                try {
                    try {
                        object = string3;
                        if (callSite == false) break block10;
                        if (((String)object).equals(string2)) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)n94, (long)-6943704478997232080L, (long)l12);
                    }
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = lb62.U(l10);
                    objectArray2[1] = string3;
                    objectArray2[0] = l11;
                    object = m44.a("m", (Object)objectArray2, (long)-7390661379600457783L, (long)l12);
                }
                catch (n9 n95) {
                    throw m44.a("m", (Object)n95, (long)-6943704478997232080L, (long)l12);
                }
            }
            String string = object;
            this.O().A(string);
        }
    }

    @Override
    public void q(x8 x82, long l10, x8 x83) {
        block12: {
            b5 b52;
            block13: {
                x8 x84;
                x8 x85;
                block10: {
                    CallSite callSite = m44.a("n", (long)-5231047857311529425L, (long)l10);
                    try {
                        try {
                            block11: {
                                try {
                                    try {
                                        x85 = this.T();
                                        x84 = x82;
                                        if (callSite == false) break block10;
                                        if (x85 != x84) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("n", (Object)n92, (long)-6302663255913664229L, (long)l10);
                                    }
                                    this.m(x83);
                                    if (callSite != false) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("n", (Object)n93, (long)-6302663255913664229L, (long)l10);
                                }
                            }
                            b52 = this;
                            if (callSite == false) break block13;
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)n94, (long)-6302663255913664229L, (long)l10);
                        }
                        x85 = b52.O();
                        x84 = x82;
                    }
                    catch (n9 n95) {
                        throw m44.a("n", (Object)n95, (long)-6302663255913664229L, (long)l10);
                    }
                }
                if (x85 != x84) break block12;
                b52 = this;
            }
            b52.I(x83);
        }
    }

    iq Y(Object[] objectArray) {
        return this.x;
    }

    @Override
    public void d(Integer n10, iq iq2, long l10) {
        block13: {
            int n11;
            int n12;
            block12: {
                CallSite callSite = m44.a("n", (long)6712518449017588160L, (long)l10);
                try {
                    block11: {
                        try {
                            try {
                                try {
                                    if (this.x != null) break block11;
                                    n12 = n10;
                                    n11 = this.j;
                                    if (l10 < 0L || callSite != false) break block12;
                                }
                                catch (n9 n92) {
                                    throw m44.a("n", (Object)n92, (long)6525772152951538435L, (long)l10);
                                }
                                if (l10 < 0L) break block12;
                                if (n12 != n11) break block11;
                            }
                            catch (n9 n93) {
                                throw m44.a("n", (Object)n93, (long)6525772152951538435L, (long)l10);
                            }
                            this.x = iq2;
                            if (callSite == false) break block13;
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)n94, (long)6525772152951538435L, (long)l10);
                        }
                    }
                    n12 = n10;
                    n11 = this.R;
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)n95, (long)6525772152951538435L, (long)l10);
                }
            }
            try {
                if (n12 == n11) {
                    this.p = iq2;
                }
            }
            catch (n9 n96) {
                throw m44.a("n", (Object)n96, (long)6525772152951538435L, (long)l10);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void J(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (DataOutputStream)var1_1[1];
                var2_2 = b5.a ^ var2_2;
                var5_4 = m44.a("l", (long)8927763492995477250L, (long)var2_2);
                try {
                    try {
                        if (var5_4 != false) break block8;
                        if (this.L) {
                        }
                        ** GOTO lbl25
                    }
                    catch (n9 v0) {
                        throw m44.a("l", (Object)v0, (long)8958325266138080705L, (long)var2_2);
                    }
                    var4_3.writeShort(this.x.B());
                    var4_3.writeShort(this.p.B() - this.x.B());
                    var4_3.writeShort(this.T().E());
                    var4_3.writeShort(this.O().E());
                    var4_3.writeShort(this.V.n());
                }
                catch (n9 v1) {
                    throw m44.a("l", (Object)v1, (long)8958325266138080705L, (long)var2_2);
                }
            }
            try {
                if (var2_2 <= 0L || var5_4 == false) break block9;
lbl25:
                // 2 sources

                var4_3.write((byte[])m44.a("r", (Object)this, (long)9121321079464853768L, (long)var2_2));
            }
            catch (n9 v2) {
                throw m44.a("l", (Object)v2, (long)8958325266138080705L, (long)var2_2);
            }
        }
    }

    private void Q(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = (Integer)objectArray[2];
        int n12 = (Integer)objectArray[3];
        l10 = a ^ l10;
        m44.a("p", (Object)this, (byte[])new byte[b5.a("z", (int)21070, (long)(0xE7765006E349E2AL ^ l10))], (long)7921048731084395120L, (long)l10);
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l10)[0] = (CallSite)((byte)(this.j >>> b5.a("z", (int)5085, (long)(0x41FB362124AF5FB5L ^ l10)) & b5.a("z", (int)11512, (long)(0x741198E2DBF1E091L ^ l10))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l10)[1] = (CallSite)((byte)(this.j >>> 0 & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l10))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l10)[2] = (CallSite)((byte)(this.R >>> b5.a("z", (int)7530, (long)(0x2E5C73C792FDD101L ^ l10)) & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l10))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l10)[3] = (CallSite)((byte)(this.R >>> 0 & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l10))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l10)[4] = (CallSite)((byte)(n10 >>> b5.a("z", (int)7530, (long)(0x2E5C73C792FDD101L ^ l10)) & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l10))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l10)[5] = (CallSite)((byte)(n10 >>> 0 & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l10))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l10)[b5.a("z", (int)367, (long)(0x6E1AAB5B68C04D02L ^ l10))] = (CallSite)((byte)(n11 >>> b5.a("z", (int)7530, (long)(0x2E5C73C792FDD101L ^ l10)) & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l10))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l10)[b5.a("z", (int)16439, (long)(0x66572E221CCC0C5BL ^ l10))] = (CallSite)((byte)(n11 >>> 0 & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l10))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l10)[b5.a("z", (int)7530, (long)(0x2E5C73C792FDD101L ^ l10))] = (CallSite)((byte)(n12 >>> b5.a("z", (int)7530, (long)(0x2E5C73C792FDD101L ^ l10)) & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l10))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l10)[b5.a("z", (int)32467, (long)(0x2A3E5C249B17B2BCL ^ l10))] = (CallSite)((byte)(n12 >>> 0 & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l10))));
    }

    b5(_4 _42, int n10, long l10, int n11, x8 x82, x8 x83, d1 d12, l6q l6q2) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x205E65282DF6L;
        long l13 = l11 ^ 0x5970E95967CBL;
        super(_42);
        this.L = true;
        this.L = true;
        this.j = n10;
        l6q2.t(S.e(l12, n10), this, l13);
        this.R = n11;
        l6q2.t(S.e(l12, n11), this, l13);
        this.V = d12;
        this.m(x82);
        this.I(x83);
    }

    /*
     * Unable to fully structure code
     */
    protected void w(Object[] var1_1) {
        block19: {
            block20: {
                block18: {
                    block17: {
                        block16: {
                            var5_2 = (DataOutputStream)var1_1[0];
                            var2_3 = (Map)var1_1[1];
                            var3_4 = (Long)var1_1[2];
                            var3_4 = b5.a ^ var3_4;
                            var5_2.writeShort(this.x.B());
                            v0 = m44.a("k", (long)-4815809754119680926L, (long)var3_4);
                            var5_2.writeShort(this.p.B() - this.x.B());
                            var6_5 = v0;
                            var7_6 = (x8)var2_3.get(this.T());
                            try {
                                try {
                                    if (var6_5 == false) break block16;
                                    if (var7_6 != null) {
                                    }
                                    ** GOTO lbl26
                                }
                                catch (n9 v1) {
                                    throw m44.a("k", (Object)v1, (long)-6717917011375097002L, (long)var3_4);
                                }
                                var5_2.writeShort(var7_6.E());
                            }
                            catch (n9 v2) {
                                throw m44.a("k", (Object)v2, (long)-6717917011375097002L, (long)var3_4);
                            }
                        }
                        try {
                            if (var3_4 < 0L || var6_5 != false) break block17;
lbl26:
                            // 2 sources

                            var5_2.writeShort(this.T().E());
                        }
                        catch (n9 v3) {
                            throw m44.a("k", (Object)v3, (long)-6717917011375097002L, (long)var3_4);
                        }
                    }
                    var8_7 = (x8)var2_3.get(this.O());
                    try {
                        try {
                            v4 = var6_5;
                            if (var3_4 <= 0L) ** GOTO lbl50
                            if (v4 == false) break block18;
                            if (var8_7 != null) {
                            }
                            ** GOTO lbl51
                        }
                        catch (n9 v5) {
                            throw m44.a("k", (Object)v5, (long)-6717917011375097002L, (long)var3_4);
                        }
                        var5_2.writeShort(var8_7.E());
                    }
                    catch (n9 v6) {
                        throw m44.a("k", (Object)v6, (long)-6717917011375097002L, (long)var3_4);
                    }
                }
                try {
                    if (var3_4 < 0L) break block19;
                    v4 = var6_5;
lbl50:
                    // 2 sources

                    if (v4 != false) break block20;
lbl51:
                    // 2 sources

                    var5_2.writeShort(this.O().E());
                }
                catch (n9 v7) {
                    throw m44.a("k", (Object)v7, (long)-6717917011375097002L, (long)var3_4);
                }
            }
            var5_2.writeShort(this.V.n());
        }
    }

    @Override
    public String R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return c;
    }

    iq m(Object[] objectArray) {
        return this.p;
    }

    @Override
    public m7 i(long l10) {
        return m7.t;
    }

    String S(Object[] objectArray) {
        block5: {
            b5 b52;
            block4: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("j", (long)-2962256975644360188L, (long)l10);
                try {
                    try {
                        b52 = this;
                        if (callSite != false) break block4;
                        if (!b52.L) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)-3362950613831219001L, (long)l10);
                    }
                    b52 = this;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)-3362950613831219001L, (long)l10);
                }
            }
            return b52.T().V();
        }
        return "";
    }

    public void I(x8 x82) {
        this.C = x82;
    }

    int u(Object[] objectArray) {
        return this.V.n();
    }

    public boolean Y(Object[] objectArray) {
        return this.L;
    }

    public void m(x8 x82) {
        this.T = x82;
    }

    public x8 O() {
        return this.C;
    }

    public int y(Object[] objectArray) {
        int n10;
        block11: {
            Object object;
            long l10;
            block9: {
                CallSite callSite;
                b5 b52;
                block10: {
                    l10 = (Long)objectArray[0];
                    b52 = (b5)objectArray[1];
                    l10 = a ^ l10;
                    callSite = m44.a("m", (long)5626332079994444531L, (long)l10);
                    try {
                        try {
                            n10 = this.V.n();
                            object = b52.V.n();
                            if (callSite != false) break block9;
                            if (n10 >= object) break block10;
                        }
                        catch (n9 n92) {
                            throw m44.a("m", (Object)n92, (long)5306133105031450672L, (long)l10);
                        }
                        return -1;
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)n93, (long)5306133105031450672L, (long)l10);
                    }
                }
                try {
                    n10 = this.V.n();
                    object = callSite;
                    if (l10 < 0L) break block9;
                    if (object != 0) break block11;
                    object = b52.V.n();
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)n94, (long)5306133105031450672L, (long)l10);
                }
            }
            try {
                if (n10 == object) {
                    return 0;
                }
            }
            catch (n9 n95) {
                throw m44.a("m", (Object)n95, (long)5306133105031450672L, (long)l10);
            }
            n10 = 1;
        }
        return n10;
    }

    @Override
    public void X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        df df2 = (df)objectArray[1];
        long l11 = l10 ^ 0x6F3E14B71D18L;
        long l12 = l11 >>> 16;
        int n10 = (int)(l11 << 48 >>> 48);
        df2.L(l12, (char)n10, this.x, this);
        df2.L(l12, (char)n10, this.p, this);
    }

    @Override
    void z(gu gu2, long l10) {
        block4: {
            long l11 = l10 ^ 0x6DE1DADD9981L;
            CallSite callSite = m44.a("h", (long)6170399952317654249L, (long)l10);
            try {
                boolean bl2;
                try {
                    bl2 = this.L;
                    if (callSite == false || !bl2) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)5354303359425713117L, (long)l10);
                }
                this.T.e(l11, gu2, this, this.H());
                bl2 = this.C.e(l11, gu2, this, this.H());
            }
            catch (n9 n93) {
                throw m44.a("h", (Object)n93, (long)5354303359425713117L, (long)l10);
            }
        }
    }

    b5(_4 _42, h1 h12, lkv lkv2, l6q l6q2, l6q l6q3, long l10) {
        block17: {
            Object object;
            b5 b52;
            int n10;
            int n11;
            long l11;
            block14: {
                int n12;
                block15: {
                    block12: {
                        long l12 = l10 = a ^ l10;
                        long l13 = l12 ^ 0x12FB4920A3C3L;
                        long l14 = l12 ^ 0x6A2EA899E043L;
                        long l15 = l14 >>> 16;
                        int n13 = (int)(l14 << 48 >>> 48);
                        l11 = l12 ^ 0xDE9B6011D3EL;
                        long l16 = l12 ^ 0xB836F138CB9L;
                        long l17 = l12 ^ 0x6BD5C551E9FEL;
                        super(_42);
                        this.L = true;
                        this.j = h12.readUnsignedShort();
                        int n14 = h12.readUnsignedShort();
                        this.R = this.j + n14;
                        CallSite callSite = m44.a("i", (long)-8653503510560180576L, (long)l10);
                        l6q3.t(S.e(l13, this.j), this, l17);
                        l6q3.t(S.e(l13, this.R), this, l17);
                        n12 = h12.readUnsignedShort();
                        n11 = h12.readUnsignedShort();
                        CallSite callSite2 = callSite;
                        n10 = h12.readUnsignedShort();
                        this.V = lkv2.r(l15, (char)n13, n10);
                        js js2 = this.m(l16, n12);
                        js js3 = this.m(l16, n11);
                        try {
                            block16: {
                                block13: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (callSite2 == false) break block12;
                                                        if (!(js2 instanceof x8)) break block13;
                                                    }
                                                    catch (n9 n92) {
                                                        throw m44.a("i", (Object)n92, (long)-7491895215531376236L, (long)l10);
                                                    }
                                                    if (l10 < 0L) break block12;
                                                    if (!(js3 instanceof x8)) break block13;
                                                }
                                                catch (n9 n93) {
                                                    throw m44.a("i", (Object)n93, (long)-7491895215531376236L, (long)l10);
                                                }
                                                b52 = this;
                                                object = callSite2;
                                                if (l10 < 0L) break block14;
                                                if (object == 0) break block15;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("i", (Object)n94, (long)-7491895215531376236L, (long)l10);
                                            }
                                            if (l10 < 0L) break block16;
                                            if (b52.V == null) break block13;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("i", (Object)n95, (long)-7491895215531376236L, (long)l10);
                                        }
                                        this.m((x8)js2);
                                        this.I((x8)js3);
                                        l6q2.t(this.T(), this, l17);
                                        l6q2.t(this.O(), this, l17);
                                        if (callSite2 != false) break block17;
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("i", (Object)n96, (long)-7491895215531376236L, (long)l10);
                                    }
                                }
                                b5 b53 = this;
                            }
                            b53.L = false;
                        }
                        catch (n9 n97) {
                            throw m44.a("i", (Object)n97, (long)-7491895215531376236L, (long)l10);
                        }
                    }
                    b52 = this;
                }
                object = n12;
            }
            Object[] objectArray = new Object[4];
            objectArray[3] = n10;
            objectArray[2] = n11;
            objectArray[1] = l11;
            objectArray[0] = object;
            m44.a("h", (Object)b52, (Object)objectArray, (long)-7282809297086852004L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    b5.a = prr.a(1925107109260596348L, 3290355846300715209L, MethodHandles.lookup().lookupClass()).a(278702624113752L);
                    var11 = b5.a ^ 136958447902423L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    break block12;
lbl13:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var15_3 = var13_1.doFinal("\u0019\u0016\u0010hO\u001d\u00b7\u00d3\u0003w\u001e\u008dvj\u0098~P\u00a3\u000e\u00a4?M\u0087\u00d1".getBytes("ISO-8859-1"));
                ** while (true)
                b5.c = b5.a(var15_3).intern();
                b5.h = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var11 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v5 = v5;
                    v5[var1_5] = (byte)(var11 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_6 = new long[9];
                var3_7 = 0;
                var4_8 = "\u00f7\u008c\u00beN8\"\u00d7\u00eb\u00e2W\u008f\u00ba\u008b\u0088mm\u001a\u0002\u00aa\u00ab\u008b\u0019\u009d!\u008f[\u00e2*\u00de\u0094\u00b4\u0094\u00f7\u00d5\u00ae\u0003t\u0097\u00c3\u00a3\f\u00b6\u00c7\u00ca[y)\u00bb[\u0084>\u00fc\u00bd\u0017\u00f9\u00f6";
                var5_9 = "\u00f7\u008c\u00beN8\"\u00d7\u00eb\u00e2W\u008f\u00ba\u008b\u0088mm\u001a\u0002\u00aa\u00ab\u008b\u0019\u009d!\u008f[\u00e2*\u00de\u0094\u00b4\u0094\u00f7\u00d5\u00ae\u0003t\u0097\u00c3\u00a3\f\u00b6\u00c7\u00ca[y)\u00bb[\u0084>\u00fc\u00bd\u0017\u00f9\u00f6".length();
                var2_10 = 0;
                while (true) {
                    var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                    v6 = var6_6;
                    v7 = var3_7++;
                    v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                    v9 = -1;
                    break block10;
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    var4_8 = "\u00bf\u0089\u00a9\u0080\u001cc\u00f6\u008e\u0093xi\u00e3\u00dd\u0000\u00caC";
                    var5_9 = "\u00bf\u0089\u00a9\u0080\u001cc\u00f6\u008e\u0093xi\u00e3\u00dd\u0000\u00caC".length();
                    var2_10 = 0;
                    while (true) {
                        var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                        v6 = var6_6;
                        v7 = var3_7++;
                        v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                        v9 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl57:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    break block11;
                    break;
                }
            }
            var8_12 = v8;
            var10_13 = var0_4.doFinal(new byte[]{(byte)(var8_12 >>> 56), (byte)(var8_12 >>> 48), (byte)(var8_12 >>> 40), (byte)(var8_12 >>> 32), (byte)(var8_12 >>> 24), (byte)(var8_12 >>> 16), (byte)(var8_12 >>> 8), (byte)var8_12});
            v10 = ((long)var10_13[0] & 255L) << 56 | ((long)var10_13[1] & 255L) << 48 | ((long)var10_13[2] & 255L) << 40 | ((long)var10_13[3] & 255L) << 32 | ((long)var10_13[4] & 255L) << 24 | ((long)var10_13[5] & 255L) << 16 | ((long)var10_13[6] & 255L) << 8 | (long)var10_13[7] & 255L;
            switch (v9) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl70:
                // 1 sources

                ** continue;
            }
        }
        b5.f = var6_6;
        b5.g = new Integer[9];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x2FB7;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/b5", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b5.g[n11] = n12;
        }
        return g[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = b5.a(n10, l10);
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
            throw new RuntimeException("com/zelix/b5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

