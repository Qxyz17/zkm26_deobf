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
        long l = a ^ 0x7765D59BC7BDL;
        long l2 = l ^ 0x4EF2835882EFL;
        Object[] objectArray = new Object[2];
        objectArray[1] = (b5)object;
        objectArray[0] = l2;
        return (int)m44.a("v", (Object)this, (Object)objectArray, (long)2802834584563348580L, (long)l);
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
                long l;
                long l2;
                long l3;
                block8: {
                    int n = (Integer)objectArray[0];
                    l3 = (Long)objectArray[1];
                    int n2 = (Integer)objectArray[2];
                    HashMap hashMap = (HashMap)objectArray[3];
                    long l4 = l3;
                    l2 = l4 ^ 0x54FB6F0C2B4L;
                    long l5 = l4 ^ 0x5B0463FB65FAL;
                    long l6 = l4 ^ 0x251D1044B7BCL;
                    l = l4 ^ 0x6136368F7C57L;
                    lb62 = new lb6(0);
                    string2 = _v.X((String)this.O().V(), (lb6)lb62, (long)l5);
                    callSite = m44.a("m", (long)-9201728108289330940L, (long)l3);
                    try {
                        try {
                            string = string2;
                            if (callSite == false) break block8;
                            if (string == null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("m", (Object)((Object)n92), (long)-6943704478997232080L, (long)l3);
                        }
                        string = (String)cf.J((long)l6, (Object)string2, (Map)hashMap);
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)((Object)n93), (long)-6943704478997232080L, (long)l3);
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
                        throw m44.a("m", (Object)((Object)n94), (long)-6943704478997232080L, (long)l3);
                    }
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = lb62.U(l);
                    objectArray2[1] = string3;
                    objectArray2[0] = l2;
                    object = m44.a("m", (Object)objectArray2, (long)-7390661379600457783L, (long)l3);
                }
                catch (n9 n95) {
                    throw m44.a("m", (Object)((Object)n95), (long)-6943704478997232080L, (long)l3);
                }
            }
            String string = object;
            this.O().A(string);
        }
    }

    public void q(x8 x82, long l, x8 x83) {
        block12: {
            b5 b52;
            block13: {
                x8 x84;
                x8 x85;
                block10: {
                    CallSite callSite = m44.a("n", (long)-5231047857311529425L, (long)l);
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
                                        throw m44.a("n", (Object)((Object)n92), (long)-6302663255913664229L, (long)l);
                                    }
                                    this.m(x83);
                                    if (callSite != false) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("n", (Object)((Object)n93), (long)-6302663255913664229L, (long)l);
                                }
                            }
                            b52 = this;
                            if (callSite == false) break block13;
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)((Object)n94), (long)-6302663255913664229L, (long)l);
                        }
                        x85 = b52.O();
                        x84 = x82;
                    }
                    catch (n9 n95) {
                        throw m44.a("n", (Object)((Object)n95), (long)-6302663255913664229L, (long)l);
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

    public void d(Integer n, iq iq2, long l) {
        block13: {
            int n2;
            int n3;
            block12: {
                CallSite callSite = m44.a("n", (long)6712518449017588160L, (long)l);
                try {
                    block11: {
                        try {
                            try {
                                try {
                                    if (this.x != null) break block11;
                                    n3 = n;
                                    n2 = this.j;
                                    if (l < 0L || callSite != false) break block12;
                                }
                                catch (n9 n92) {
                                    throw m44.a("n", (Object)((Object)n92), (long)6525772152951538435L, (long)l);
                                }
                                if (l < 0L) break block12;
                                if (n3 != n2) break block11;
                            }
                            catch (n9 n93) {
                                throw m44.a("n", (Object)((Object)n93), (long)6525772152951538435L, (long)l);
                            }
                            this.x = iq2;
                            if (callSite == false) break block13;
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)((Object)n94), (long)6525772152951538435L, (long)l);
                        }
                    }
                    n3 = n;
                    n2 = this.R;
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)((Object)n95), (long)6525772152951538435L, (long)l);
                }
            }
            try {
                if (n3 == n2) {
                    this.p = iq2;
                }
            }
            catch (n9 n96) {
                throw m44.a("n", (Object)((Object)n96), (long)6525772152951538435L, (long)l);
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
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        l = a ^ l;
        m44.a("p", (Object)this, (byte[])new byte[b5.a("z", (int)21070, (long)(0xE7765006E349E2AL ^ l))], (long)7921048731084395120L, (long)l);
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l)[0] = (CallSite)((byte)(this.j >>> b5.a("z", (int)5085, (long)(0x41FB362124AF5FB5L ^ l)) & b5.a("z", (int)11512, (long)(0x741198E2DBF1E091L ^ l))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l)[1] = (CallSite)((byte)(this.j >>> 0 & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l)[2] = (CallSite)((byte)(this.R >>> b5.a("z", (int)7530, (long)(0x2E5C73C792FDD101L ^ l)) & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l)[3] = (CallSite)((byte)(this.R >>> 0 & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l)[4] = (CallSite)((byte)(n >>> b5.a("z", (int)7530, (long)(0x2E5C73C792FDD101L ^ l)) & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l)[5] = (CallSite)((byte)(n >>> 0 & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l)[b5.a("z", (int)367, (long)(0x6E1AAB5B68C04D02L ^ l))] = (CallSite)((byte)(n2 >>> b5.a("z", (int)7530, (long)(0x2E5C73C792FDD101L ^ l)) & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l)[b5.a("z", (int)16439, (long)(0x66572E221CCC0C5BL ^ l))] = (CallSite)((byte)(n2 >>> 0 & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l)[b5.a("z", (int)7530, (long)(0x2E5C73C792FDD101L ^ l))] = (CallSite)((byte)(n3 >>> b5.a("z", (int)7530, (long)(0x2E5C73C792FDD101L ^ l)) & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l))));
        m44.a("r", (Object)this, (long)7921048731084395120L, (long)l)[b5.a("z", (int)32467, (long)(0x2A3E5C249B17B2BCL ^ l))] = (CallSite)((byte)(n3 >>> 0 & b5.a("z", (int)1850, (long)(0x1BA7FB15692E4B54L ^ l))));
    }

    b5(_4 _42, int n, long l, int n2, x8 x82, x8 x83, d1 d12, l6q l6q2) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x205E65282DF6L;
        long l4 = l2 ^ 0x5970E95967CBL;
        super(_42);
        this.L = true;
        this.L = true;
        this.j = n;
        l6q2.t((Object)S.e(l3, n), (Object)this, l4);
        this.R = n2;
        l6q2.t((Object)S.e(l3, n2), (Object)this, l4);
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

    public String R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return c;
    }

    iq m(Object[] objectArray) {
        return this.p;
    }

    public m7 i(long l) {
        return m7.t;
    }

    String S(Object[] objectArray) {
        block5: {
            b5 b52;
            block4: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("j", (long)-2962256975644360188L, (long)l);
                try {
                    try {
                        b52 = this;
                        if (callSite != false) break block4;
                        if (!b52.L) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-3362950613831219001L, (long)l);
                    }
                    b52 = this;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-3362950613831219001L, (long)l);
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
        int n;
        block11: {
            Object object;
            long l;
            block9: {
                CallSite callSite;
                b5 b52;
                block10: {
                    l = (Long)objectArray[0];
                    b52 = (b5)objectArray[1];
                    l = a ^ l;
                    callSite = m44.a("m", (long)5626332079994444531L, (long)l);
                    try {
                        try {
                            n = this.V.n();
                            object = b52.V.n();
                            if (callSite != false) break block9;
                            if (n >= object) break block10;
                        }
                        catch (n9 n92) {
                            throw m44.a("m", (Object)((Object)n92), (long)5306133105031450672L, (long)l);
                        }
                        return -1;
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)((Object)n93), (long)5306133105031450672L, (long)l);
                    }
                }
                try {
                    n = this.V.n();
                    object = callSite;
                    if (l < 0L) break block9;
                    if (object != 0) break block11;
                    object = b52.V.n();
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)((Object)n94), (long)5306133105031450672L, (long)l);
                }
            }
            try {
                if (n == object) {
                    return 0;
                }
            }
            catch (n9 n95) {
                throw m44.a("m", (Object)((Object)n95), (long)5306133105031450672L, (long)l);
            }
            n = 1;
        }
        return n;
    }

    public void X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        df df2 = (df)objectArray[1];
        long l2 = l ^ 0x6F3E14B71D18L;
        long l3 = l2 >>> 16;
        int n = (int)(l2 << 48 >>> 48);
        df2.L(l3, (char)n, (Object)this.x, (Object)this);
        df2.L(l3, (char)n, (Object)this.p, (Object)this);
    }

    void z(gu gu2, long l) {
        block4: {
            long l2 = l ^ 0x6DE1DADD9981L;
            CallSite callSite = m44.a("h", (long)6170399952317654249L, (long)l);
            try {
                boolean bl;
                try {
                    bl = this.L;
                    if (callSite == false || !bl) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)5354303359425713117L, (long)l);
                }
                this.T.e(l2, gu2, (Object)this, (Object)this.H());
                bl = this.C.e(l2, gu2, (Object)this, (Object)this.H());
            }
            catch (n9 n93) {
                throw m44.a("h", (Object)((Object)n93), (long)5354303359425713117L, (long)l);
            }
        }
    }

    b5(_4 _42, h1 h12, lkv lkv2, l6q l6q2, l6q l6q3, long l) {
        block17: {
            Object object;
            b5 b52;
            int n;
            int n2;
            long l2;
            block14: {
                int n3;
                block15: {
                    block12: {
                        long l3 = l = a ^ l;
                        long l4 = l3 ^ 0x12FB4920A3C3L;
                        long l5 = l3 ^ 0x6A2EA899E043L;
                        long l6 = l5 >>> 16;
                        int n4 = (int)(l5 << 48 >>> 48);
                        l2 = l3 ^ 0xDE9B6011D3EL;
                        long l7 = l3 ^ 0xB836F138CB9L;
                        long l8 = l3 ^ 0x6BD5C551E9FEL;
                        super(_42);
                        this.L = true;
                        this.j = h12.readUnsignedShort();
                        int n5 = h12.readUnsignedShort();
                        this.R = this.j + n5;
                        CallSite callSite = m44.a("i", (long)-8653503510560180576L, (long)l);
                        l6q3.t((Object)S.e(l4, this.j), (Object)this, l8);
                        l6q3.t((Object)S.e(l4, this.R), (Object)this, l8);
                        n3 = h12.readUnsignedShort();
                        n2 = h12.readUnsignedShort();
                        CallSite callSite2 = callSite;
                        n = h12.readUnsignedShort();
                        this.V = lkv2.r(l6, (char)n4, n);
                        js js2 = this.m(l7, n3);
                        js js3 = this.m(l7, n2);
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
                                                        throw m44.a("i", (Object)((Object)n92), (long)-7491895215531376236L, (long)l);
                                                    }
                                                    if (l < 0L) break block12;
                                                    if (!(js3 instanceof x8)) break block13;
                                                }
                                                catch (n9 n93) {
                                                    throw m44.a("i", (Object)((Object)n93), (long)-7491895215531376236L, (long)l);
                                                }
                                                b52 = this;
                                                object = callSite2;
                                                if (l < 0L) break block14;
                                                if (object == 0) break block15;
                                            }
                                            catch (n9 n94) {
                                                throw m44.a("i", (Object)((Object)n94), (long)-7491895215531376236L, (long)l);
                                            }
                                            if (l < 0L) break block16;
                                            if (b52.V == null) break block13;
                                        }
                                        catch (n9 n95) {
                                            throw m44.a("i", (Object)((Object)n95), (long)-7491895215531376236L, (long)l);
                                        }
                                        this.m((x8)js2);
                                        this.I((x8)js3);
                                        l6q2.t((Object)this.T(), (Object)this, l8);
                                        l6q2.t((Object)this.O(), (Object)this, l8);
                                        if (callSite2 != false) break block17;
                                    }
                                    catch (n9 n96) {
                                        throw m44.a("i", (Object)((Object)n96), (long)-7491895215531376236L, (long)l);
                                    }
                                }
                                b5 b53 = this;
                            }
                            b53.L = false;
                        }
                        catch (n9 n97) {
                            throw m44.a("i", (Object)((Object)n97), (long)-7491895215531376236L, (long)l);
                        }
                    }
                    b52 = this;
                }
                object = n3;
            }
            Object[] objectArray = new Object[4];
            objectArray[3] = n;
            objectArray[2] = n2;
            objectArray[1] = l2;
            objectArray[0] = object;
            m44.a("h", (Object)b52, (Object)objectArray, (long)-7282809297086852004L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    b5.a = prr.a((long)1925107109260596348L, (long)3290355846300715209L, MethodHandles.lookup().lookupClass()).a(278702624113752L);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2FB7;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b5.g[n2] = n3;
        }
        return g[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = b5.a(n, l);
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
