/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._f;
import com.zelix.eo;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.hf;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.x8;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bs
extends _4
implements ni,
eo {
    x8 O;
    jf r;
    byte[] P;
    boolean J;
    int F;
    jf k;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    bs(int var1_1, _4 var2_2, h1 var3_3, l6q var4_4, l6q var5_5, PrintWriter var6_6, long var7_7) {
        block43: {
            block42: {
                block38: {
                    block39: {
                        block36: {
                            block37: {
                                block34: {
                                    block33: {
                                        v0 = var9_8 = ((long)var1_1 << 32 | var7_7 << 32 >>> 32) ^ bs.a;
                                        var11_9 = v0 ^ 104767811640067L;
                                        var13_10 = v0 ^ 60619482753464L;
                                        var15_11 = v0 ^ 60523869899807L;
                                        var17_12 = v0 ^ 96158831480063L;
                                        super(var2_2);
                                        m44.a("t", (Object)this, (boolean)true, (long)7103348575767687565L, (long)var9_8);
                                        var20_13 = var3_3.readUnsignedShort();
                                        var19_14 = m44.a("h", (long)8841085699613601366L, (long)var9_8);
                                        var21_15 = var3_3.readUnsignedShort();
                                        var22_16 = var3_3.readUnsignedShort();
                                        m44.a("t", (Object)this, (int)var3_3.readUnsignedShort(), (long)9115565858170200010L, (long)var9_8);
                                        var23_17 = this.m(var13_10, var20_13);
                                        var24_18 = this.m(var13_10, var21_15);
                                        var25_19 = this.m(var13_10, var22_16);
                                        try {
                                            v1 /* !! */  = var23_17 instanceof jf;
                                            if (var19_14 != false) break block33;
                                            if (v1 /* !! */  != 0) {
                                            }
                                            ** GOTO lbl108
                                        }
                                        catch (n9 v2) {
                                            throw m44.a("h", (Object)v2, (long)9165862597108258027L, (long)var9_8);
                                        }
                                        v1 /* !! */  = var21_15;
                                    }
                                    try {
                                        block35: {
                                            try {
                                                try {
                                                    try {
                                                        if (var19_14 != false) break block34;
                                                        if (v1 /* !! */  == 0) break block35;
                                                    }
                                                    catch (n9 v3) {
                                                        throw m44.a("h", (Object)v3, (long)9165862597108258027L, (long)var9_8);
                                                    }
                                                    v1 /* !! */  = var24_18 instanceof jf;
                                                    v4 = var19_14;
                                                    if (var1_1 > 0) {
                                                        if (v4 != false) break block34;
                                                    }
                                                    ** GOTO lbl60
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("h", (Object)v5, (long)9165862597108258027L, (long)var9_8);
                                                }
                                                if (v1 /* !! */  != 0) {
                                                }
                                                ** GOTO lbl108
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("h", (Object)v6, (long)9165862597108258027L, (long)var9_8);
                                            }
                                        }
                                        m44.a("t", (Object)this, (jf)((jf)var23_17), (long)6962269450314165508L, (long)var9_8);
                                        var5_5.t(m44.a("v", (Object)this, (long)6962269450314165508L, (long)var9_8), this, var17_12);
                                        v1 /* !! */  = var21_15;
                                    }
                                    catch (n9 v7) {
                                        throw m44.a("h", (Object)v7, (long)9165862597108258027L, (long)var9_8);
                                    }
                                }
                                try {
                                    try {
                                        v4 = var19_14;
lbl60:
                                        // 2 sources

                                        if (var7_7 >= 0L) {
                                            if (v4 != false) break block36;
                                            if (v1 /* !! */  == 0) break block37;
                                        }
                                        ** GOTO lbl82
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("h", (Object)v8, (long)9165862597108258027L, (long)var9_8);
                                    }
                                    m44.a("t", (Object)this, (jf)((jf)var24_18), (long)7140499835930714237L, (long)var9_8);
                                    var5_5.t(m44.a("v", (Object)this, (long)7140499835930714237L, (long)var9_8), this, var17_12);
                                }
                                catch (n9 v9) {
                                    throw m44.a("h", (Object)v9, (long)9165862597108258027L, (long)var9_8);
                                }
                            }
                            v1 /* !! */  = var22_16;
                        }
                        try {
                            try {
                                block40: {
                                    block41: {
                                        try {
                                            try {
                                                try {
                                                    if (var1_1 < 0) break block38;
                                                    v4 = var19_14;
lbl82:
                                                    // 2 sources

                                                    if (v4 != false) break block38;
                                                    if (v1 /* !! */  == 0) break block39;
                                                }
                                                catch (n9 v10) {
                                                    throw m44.a("h", (Object)v10, (long)9165862597108258027L, (long)var9_8);
                                                }
                                                v11 /* !! */  = var25_19 instanceof x8;
                                                if (var7_7 <= 0L) break block40;
                                                if (!v11 /* !! */ ) break block41;
                                            }
                                            catch (n9 v12) {
                                                throw m44.a("h", (Object)v12, (long)9165862597108258027L, (long)var9_8);
                                            }
                                            m44.a("t", (Object)this, (x8)((x8)var25_19), (long)8860162606398243090L, (long)var9_8);
                                            var4_4.t(m44.a("v", (Object)this, (long)8860162606398243090L, (long)var9_8), this, var17_12);
                                            if (var1_1 <= 0 || var19_14 == false) break block39;
                                        }
                                        catch (n9 v13) {
                                            throw m44.a("h", (Object)v13, (long)9165862597108258027L, (long)var9_8);
                                        }
                                    }
                                    m44.a("t", (Object)this, (boolean)false, (long)7103348575767687565L, (long)var9_8);
                                    if (var7_7 < 0L) break block39;
                                    v11 /* !! */  = var19_14;
                                }
                                if (!v11 /* !! */ ) break block39;
                            }
                            catch (n9 v14) {
                                throw m44.a("h", (Object)v14, (long)9165862597108258027L, (long)var9_8);
                            }
lbl108:
                            // 3 sources

                            m44.a("t", (Object)this, (boolean)false, (long)7103348575767687565L, (long)var9_8);
                        }
                        catch (n9 v15) {
                            throw m44.a("h", (Object)v15, (long)9165862597108258027L, (long)var9_8);
                        }
                    }
                    try {
                        v16 = this;
                        if (var19_14 != false) break block42;
                        v1 /* !! */  = (int)m44.a("v", (Object)v16, (long)7103348575767687565L, (long)var9_8);
                    }
                    catch (n9 v17) {
                        throw m44.a("h", (Object)v17, (long)9165862597108258027L, (long)var9_8);
                    }
                }
                try {
                    if (v1 /* !! */  == 0) {
                        m44.a("t", (Object)this, (byte[])new byte[bs.a("j", (int)29955, (long)(6512787529466147746L ^ var9_8))], (long)8912935130690246134L, (long)var9_8);
                        v18 = new Object[2];
                        v18[1] = var15_11;
                        v18[0] = var20_13;
                        m44.a("v", (Object)this, (long)8912935130690246134L, (long)var9_8)[0] = (CallSite)((byte)m44.a("h", (Object)v18, (long)9185038371660780227L, (long)var9_8));
                        v19 = new Object[2];
                        v19[1] = var20_13;
                        v19[0] = var11_9;
                        m44.a("v", (Object)this, (long)8912935130690246134L, (long)var9_8)[1] = (CallSite)((byte)m44.a("h", (Object)v19, (long)8949364084360741069L, (long)var9_8));
                        v20 = new Object[2];
                        v20[1] = var15_11;
                        v20[0] = var21_15;
                        m44.a("v", (Object)this, (long)8912935130690246134L, (long)var9_8)[2] = (CallSite)((byte)m44.a("h", (Object)v20, (long)9185038371660780227L, (long)var9_8));
                        v21 = new Object[2];
                        v21[1] = var21_15;
                        v21[0] = var11_9;
                        m44.a("v", (Object)this, (long)8912935130690246134L, (long)var9_8)[3] = (CallSite)((byte)m44.a("h", (Object)v21, (long)8949364084360741069L, (long)var9_8));
                        v22 = new Object[2];
                        v22[1] = var15_11;
                        v22[0] = var22_16;
                        m44.a("v", (Object)this, (long)8912935130690246134L, (long)var9_8)[4] = (CallSite)((byte)m44.a("h", (Object)v22, (long)9185038371660780227L, (long)var9_8));
                        v23 = new Object[2];
                        v23[1] = var22_16;
                        v23[0] = var11_9;
                        m44.a("v", (Object)this, (long)8912935130690246134L, (long)var9_8)[5] = (CallSite)((byte)m44.a("h", (Object)v23, (long)8949364084360741069L, (long)var9_8));
                        v24 = new Object[2];
                        v24[1] = var15_11;
                        v24[0] = (int)m44.a("v", (Object)this, (long)9115565858170200010L, (long)var9_8);
                        m44.a("v", (Object)this, (long)8912935130690246134L, (long)var9_8)[bs.a("j", (int)31164, (long)(4444642641949425436L ^ var9_8))] = (CallSite)((byte)m44.a("h", (Object)v24, (long)9185038371660780227L, (long)var9_8));
                        v16 = this;
                    }
                    break block43;
                }
                catch (n9 v25) {
                    throw m44.a("h", (Object)v25, (long)9165862597108258027L, (long)var9_8);
                }
            }
            v26 = new Object[2];
            v26[1] = (int)m44.a("v", (Object)this, (long)9115565858170200010L, (long)var9_8);
            v26[0] = var11_9;
            m44.a("v", (Object)v16, (long)8912935130690246134L, (long)var9_8)[bs.a("j", (int)22118, (long)(7559228594382557381L ^ var9_8))] = (CallSite)((byte)m44.a("h", (Object)v26, (long)8949364084360741069L, (long)var9_8));
        }
    }

    @Override
    void z(gu gu2, long l10) {
        block19: {
            CallSite callSite;
            long l11;
            block18: {
                bs bs2;
                CallSite callSite2;
                block16: {
                    block17: {
                        CallSite callSite3;
                        long l12;
                        block14: {
                            block15: {
                                long l13 = l10;
                                l12 = l13 ^ 0x6DE1DADD9981L;
                                l11 = l13 ^ 0x6DE1DADD9981L;
                                callSite2 = m44.a("h", (long)5618762033536375070L, (long)l10);
                                try {
                                    try {
                                        callSite3 = m44.a("v", (Object)this, (long)6329512389551430220L, (long)l10);
                                        if (callSite2 != false) break block14;
                                        if (callSite3 == null) break block15;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)n92, (long)5222959159536739235L, (long)l10);
                                    }
                                    ((jf)((Object)m44.a("v", (Object)this, (long)6329512389551430220L, (long)l10))).e(l12, gu2, this, this);
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)n93, (long)5222959159536739235L, (long)l10);
                                }
                            }
                            try {
                                bs2 = this;
                                if (l10 <= 0L || callSite2 != false) break block16;
                                callSite3 = m44.a("v", (Object)bs2, (long)6075395557239592757L, (long)l10);
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)n94, (long)5222959159536739235L, (long)l10);
                            }
                        }
                        try {
                            if (l10 >= 0L) {
                                if (callSite3 == null) break block17;
                                callSite3 = m44.a("v", (Object)this, (long)6075395557239592757L, (long)l10);
                            }
                            ((jf)((Object)callSite3)).e(l12, gu2, this, this);
                        }
                        catch (n9 n95) {
                            throw m44.a("h", (Object)n95, (long)5222959159536739235L, (long)l10);
                        }
                    }
                    bs2 = this;
                }
                try {
                    try {
                        callSite = m44.a("v", (Object)bs2, (long)5601805191070561882L, (long)l10);
                        if (callSite2 != false) break block18;
                        if (callSite == null) break block19;
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)n96, (long)5222959159536739235L, (long)l10);
                    }
                    callSite = m44.a("v", (Object)this, (long)5601805191070561882L, (long)l10);
                }
                catch (n9 n97) {
                    throw m44.a("h", (Object)n97, (long)5222959159536739235L, (long)l10);
                }
            }
            ((x8)((Object)callSite)).e(l11, gu2, this, this);
        }
    }

    boolean N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        HashSet hashSet = (HashSet)objectArray[1];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x303477E9F694L;
        long l13 = l11 ^ 0x7459E8FDBA7BL;
        String string = ((jf)((Object)m44.a("v", (Object)this, (long)6041165299486531148L, (long)l10))).g(l13);
        _f _f2 = l62.B(string, l12);
        if (_f2 != null) {
            CallSite callSite = m44.a("w", (Object)hashSet, (Object)_f2, (long)5855790978805071843L, (long)l10);
            return (boolean)callSite;
        }
        return false;
    }

    public void v(Object[] objectArray) {
        block17: {
            CallSite callSite;
            long l10;
            long l11;
            HashSet hashSet;
            long l12;
            block16: {
                CallSite callSite2;
                block15: {
                    CallSite callSite3;
                    _f _f2;
                    block14: {
                        l12 = (Long)objectArray[0];
                        HashSet hashSet2 = (HashSet)objectArray[1];
                        hashSet = (HashSet)objectArray[2];
                        HashSet hashSet3 = (HashSet)objectArray[3];
                        HashSet hashSet4 = (HashSet)objectArray[4];
                        long l13 = l12 = a ^ l12;
                        l11 = l13 ^ 0x372486081C2BL;
                        l10 = l13 ^ 0x7349191C50C4L;
                        _f2 = null;
                        callSite2 = m44.a("o", (long)-6681464488720795743L, (long)l12);
                        try {
                            try {
                                callSite3 = m44.a("q", (Object)this, (long)-4976665414423840374L, (long)l12);
                                if (callSite2 != false) break block14;
                                if (callSite3 == null) break block15;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)n92, (long)-6429771854251782884L, (long)l12);
                            }
                            callSite3 = m44.a("q", (Object)this, (long)-4976665414423840374L, (long)l12);
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)n93, (long)-6429771854251782884L, (long)l12);
                        }
                    }
                    _f2 = l62.B(((jf)((Object)callSite3)).g(l10), l11);
                    try {
                        if (l12 >= 0L && _f2 != null) {
                            hashSet.add(_f2);
                        }
                    }
                    catch (n9 n94) {
                        throw m44.a("o", (Object)n94, (long)-6429771854251782884L, (long)l12);
                    }
                }
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)-5086392716637604621L, (long)l12);
                        if (callSite2 != false) break block16;
                        if (callSite == null) break block17;
                    }
                    catch (n9 n95) {
                        throw m44.a("o", (Object)n95, (long)-6429771854251782884L, (long)l12);
                    }
                    callSite = m44.a("q", (Object)this, (long)-5086392716637604621L, (long)l12);
                }
                catch (n9 n96) {
                    throw m44.a("o", (Object)n96, (long)-6429771854251782884L, (long)l12);
                }
            }
            _f _f3 = l62.B(((jf)((Object)callSite)).g(l10), l11);
            try {
                if (l12 > 0L && _f3 != null) {
                    hashSet.add(_f3);
                }
            }
            catch (n9 n97) {
                throw m44.a("o", (Object)n97, (long)-6429771854251782884L, (long)l12);
            }
        }
    }

    String g(Object[] objectArray) {
        block9: {
            String string;
            block10: {
                CallSite callSite;
                CallSite callSite2;
                long l10;
                block8: {
                    l10 = (Long)objectArray[0];
                    l10 = a ^ l10;
                    callSite2 = m44.a("k", (long)8044247888451477226L, (long)l10);
                    try {
                        try {
                            callSite = m44.a("u", (Object)this, (long)8628578996874775641L, (long)l10);
                            if (callSite2 == false) break block8;
                            if (callSite == null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)8248605960623511968L, (long)l10);
                        }
                        callSite = m44.a("u", (Object)this, (long)8628578996874775641L, (long)l10);
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)n93, (long)8248605960623511968L, (long)l10);
                    }
                }
                String string2 = ((x8)((Object)callSite)).V();
                try {
                    try {
                        string = string2;
                        if (callSite2 == false) break block10;
                        if (string.equals("")) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)n94, (long)8248605960623511968L, (long)l10);
                    }
                    string = string2;
                }
                catch (n9 n95) {
                    throw m44.a("k", (Object)n95, (long)8248605960623511968L, (long)l10);
                }
            }
            return string;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void X(Object[] var1_1) {
        block60: {
            block58: {
                block59: {
                    block56: {
                        block55: {
                            block54: {
                                block53: {
                                    block52: {
                                        block51: {
                                            block50: {
                                                block49: {
                                                    var5_2 = (DataOutputStream)var1_1[0];
                                                    var4_3 = (Map)var1_1[1];
                                                    var2_4 = (Long)var1_1[2];
                                                    var2_4 = bs.a ^ var2_4;
                                                    var6_5 = m44.a("j", (long)-2507466079314269061L, (long)var2_4);
                                                    try {
                                                        try {
                                                            v0 /* !! */  = this;
                                                            if (var6_5 == false) break block49;
                                                            if (m44.a("t", (Object)v0 /* !! */ , (long)-2500006039931302313L, (long)var2_4) != false) {
                                                            }
                                                            ** GOTO lbl149
                                                        }
                                                        catch (n9 v1) {
                                                            throw m44.a("j", (Object)v1, (long)-4545900741825008847L, (long)var2_4);
                                                        }
                                                        v0 /* !! */  = var4_3.get(m44.a("t", (Object)this, (long)-2358501880889404706L, (long)var2_4));
                                                    }
                                                    catch (n9 v2) {
                                                        throw m44.a("j", (Object)v2, (long)-4545900741825008847L, (long)var2_4);
                                                    }
                                                }
                                                var7_6 = (js)v0 /* !! */ ;
                                                try {
                                                    try {
                                                        v3 = var6_5;
                                                        if (var2_4 <= 0L) ** GOTO lbl40
                                                        if (v3 == false) break block50;
                                                        if (var7_6 != null) {
                                                        }
                                                        ** GOTO lbl41
                                                    }
                                                    catch (n9 v4) {
                                                        throw m44.a("j", (Object)v4, (long)-4545900741825008847L, (long)var2_4);
                                                    }
                                                    var5_2.writeShort(var7_6.E());
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("j", (Object)v5, (long)-4545900741825008847L, (long)var2_4);
                                                }
                                            }
                                            try {
                                                if (var2_4 <= 0L) break block51;
                                                v3 = var6_5;
lbl40:
                                                // 2 sources

                                                if (v3 != false) break block51;
lbl41:
                                                // 2 sources

                                                var5_2.writeShort(m44.a("t", (Object)this, (long)-2358501880889404706L, (long)var2_4).E());
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("j", (Object)v6, (long)-4545900741825008847L, (long)var2_4);
                                            }
                                        }
                                        try {
                                            try {
                                                v7 = m44.a("t", (Object)this, (long)-2539398105328377945L, (long)var2_4);
                                                if (var6_5 == false) break block52;
                                                if (v7 != null) {
                                                }
                                                ** GOTO lbl90
                                            }
                                            catch (n9 v8) {
                                                throw m44.a("j", (Object)v8, (long)-4545900741825008847L, (long)var2_4);
                                            }
                                            v7 = (js)var4_3.get(m44.a("t", (Object)this, (long)-2539398105328377945L, (long)var2_4));
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("j", (Object)v9, (long)-4545900741825008847L, (long)var2_4);
                                        }
                                    }
                                    var8_7 = v7;
                                    try {
                                        try {
                                            v10 = var6_5;
                                            if (var2_4 < 0L) ** GOTO lbl78
                                            if (v10 == false) break block53;
                                            if (var8_7 != null) {
                                            }
                                            ** GOTO lbl81
                                        }
                                        catch (n9 v11) {
                                            throw m44.a("j", (Object)v11, (long)-4545900741825008847L, (long)var2_4);
                                        }
                                        var5_2.writeShort(var8_7.E());
                                    }
                                    catch (n9 v12) {
                                        throw m44.a("j", (Object)v12, (long)-4545900741825008847L, (long)var2_4);
                                    }
                                }
                                try {
                                    v10 = var6_5;
lbl78:
                                    // 2 sources

                                    if (var2_4 >= 0L) {
                                        if (v10 != false) break block54;
                                    }
                                    ** GOTO lbl89
lbl81:
                                    // 2 sources

                                    var5_2.writeShort(m44.a("t", (Object)this, (long)-2539398105328377945L, (long)var2_4).E());
                                }
                                catch (n9 v13) {
                                    throw m44.a("j", (Object)v13, (long)-4545900741825008847L, (long)var2_4);
                                }
                            }
                            try {
                                if (var2_4 < 0L) break block55;
                                v10 = var6_5;
lbl89:
                                // 2 sources

                                if (v10 != false) break block55;
lbl90:
                                // 2 sources

                                var5_2.writeShort(0);
                            }
                            catch (n9 v14) {
                                throw m44.a("j", (Object)v14, (long)-4545900741825008847L, (long)var2_4);
                            }
                        }
                        try {
                            block57: {
                                try {
                                    try {
                                        v15 = m44.a("t", (Object)this, (long)-4238020466668093752L, (long)var2_4);
                                        if (var6_5 == false) break block56;
                                        if (v15 != null) break block57;
                                    }
                                    catch (n9 v16) {
                                        throw m44.a("j", (Object)v16, (long)-4545900741825008847L, (long)var2_4);
                                    }
                                    var5_2.writeShort(0);
                                    v17 = var6_5;
                                    if (var2_4 >= 0L) {
                                        if (v17 != false) break block58;
                                    }
                                    ** GOTO lbl148
                                }
                                catch (n9 v18) {
                                    throw m44.a("j", (Object)v18, (long)-4545900741825008847L, (long)var2_4);
                                }
                            }
                            v15 = (x8)var4_3.get(m44.a("t", (Object)this, (long)-4238020466668093752L, (long)var2_4));
                        }
                        catch (n9 v19) {
                            throw m44.a("j", (Object)v19, (long)-4545900741825008847L, (long)var2_4);
                        }
                    }
                    var8_7 = v15;
                    try {
                        try {
                            v17 = var6_5;
                            if (var2_4 < 0L) ** GOTO lbl136
                            if (v17 == false) break block59;
                            if (var8_7 != null) {
                            }
                            ** GOTO lbl139
                        }
                        catch (n9 v20) {
                            throw m44.a("j", (Object)v20, (long)-4545900741825008847L, (long)var2_4);
                        }
                        var5_2.writeShort(var8_7.E());
                    }
                    catch (n9 v21) {
                        throw m44.a("j", (Object)v21, (long)-4545900741825008847L, (long)var2_4);
                    }
                }
                try {
                    v17 = var6_5;
lbl136:
                    // 2 sources

                    if (var2_4 > 0L) {
                        if (v17 != false) break block58;
                    }
                    ** GOTO lbl148
lbl139:
                    // 2 sources

                    var5_2.writeShort(m44.a("t", (Object)this, (long)-4238020466668093752L, (long)var2_4).E());
                }
                catch (n9 v22) {
                    throw m44.a("j", (Object)v22, (long)-4545900741825008847L, (long)var2_4);
                }
            }
            try {
                var5_2.writeShort((int)m44.a("t", (Object)this, (long)-4514041696059564016L, (long)var2_4));
                if (var2_4 < 0L) break block60;
                v17 = var6_5;
lbl148:
                // 3 sources

                if (v17 != false) break block60;
lbl149:
                // 2 sources

                var5_2.write((byte[])m44.a("t", (Object)this, (long)-4293334095072794068L, (long)var2_4));
            }
            catch (n9 v23) {
                throw m44.a("j", (Object)v23, (long)-4545900741825008847L, (long)var2_4);
            }
        }
    }

    public String R(Object[] objectArray) {
        block9: {
            String string;
            block10: {
                CallSite callSite;
                CallSite callSite2;
                long l10;
                long l11;
                block8: {
                    l11 = (Long)objectArray[0];
                    l10 = (l11 = a ^ l11) ^ 0x12E9A65A55ABL;
                    callSite2 = m44.a("h", (long)-4723789412860244167L, (long)l11);
                    try {
                        try {
                            callSite = m44.a("v", (Object)this, (long)-4897979719336037988L, (long)l11);
                            if (callSite2 == false) break block8;
                            if (callSite == null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("h", (Object)n92, (long)-6653016010120853389L, (long)l11);
                        }
                        callSite = m44.a("v", (Object)this, (long)-4897979719336037988L, (long)l11);
                    }
                    catch (n9 n93) {
                        throw m44.a("h", (Object)n93, (long)-6653016010120853389L, (long)l11);
                    }
                }
                String string2 = ((jf)((Object)callSite)).g(l10);
                try {
                    try {
                        string = string2;
                        if (callSite2 == false) break block10;
                        if (string.equals("")) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("h", (Object)n94, (long)-6653016010120853389L, (long)l11);
                    }
                    string = string2;
                }
                catch (n9 n95) {
                    throw m44.a("h", (Object)n95, (long)-6653016010120853389L, (long)l11);
                }
            }
            return string;
        }
        return null;
    }

    int b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("r", (Object)this, (long)-1451134680717440362L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    String N(Object[] var1_1) {
        block19: {
            block20: {
                block18: {
                    var2_2 = (Long)var1_1[0];
                    var4_3 = (var2_2 = bs.a ^ var2_2) ^ 35771951175236L;
                    var6_4 = m44.a("o", (long)-6501235562819227359L, (long)var2_2);
                    try {
                        try {
                            v0 = m44.a("q", (Object)this, (long)-4868665054634541302L, (long)var2_2);
                            if (var6_4 != false) break block18;
                            if (v0 == null) break block19;
                        }
                        catch (n9 v1) {
                            throw m44.a("o", (Object)v1, (long)-6898231149157839972L, (long)var2_2);
                        }
                        v0 = m44.a("q", (Object)this, (long)-4868665054634541302L, (long)var2_2);
                    }
                    catch (n9 v2) {
                        throw m44.a("o", (Object)v2, (long)-6898231149157839972L, (long)var2_2);
                    }
                }
                var7_5 = v0.g(var4_3);
                var8_6 = m44.a("q", (Object)this, (long)-4617927927688629645L, (long)var2_2).g(var4_3);
                block10: while (var8_6 != null) {
                    try {
                        try {
                            v3 = var7_5;
                            v4 = var6_4;
                            if (var2_2 > 0L) {
                                if (v4 != false) break block20;
                                v4 = var6_4;
                            }
                            if (v4 != false) break block20;
                        }
                        catch (n9 v5) {
                            throw m44.a("o", (Object)v5, (long)-6898231149157839972L, (long)var2_2);
                        }
                        if (!v3.startsWith(var8_6)) {
                        }
                        ** GOTO lbl60
                    }
                    catch (n9 v6) {
                        throw m44.a("o", (Object)v6, (long)-6898231149157839972L, (long)var2_2);
                    }
                    do {
                        block24: {
                            block25: {
                                block23: {
                                    block21: {
                                        block22: {
                                            var9_7 = var8_6.lastIndexOf("$");
                                            try {
                                                v7 = var6_4;
                                                if (var2_2 <= 0L) break block21;
                                                if (v7 != false) break block22;
                                                if (var9_7 <= 0) break block23;
                                            }
                                            catch (n9 v8) {
                                                throw m44.a("o", (Object)v8, (long)-6898231149157839972L, (long)var2_2);
                                            }
                                            var8_6 = var8_6.substring(0, var9_7);
                                        }
                                        v7 = var6_4;
                                    }
                                    if (var2_2 <= 0L) break block24;
                                    if (v7 == false) break block25;
                                }
                                var8_6 = null;
                            }
                            v7 = var6_4;
                        }
                        if (v7 == false) continue block10;
lbl60:
                        // 3 sources

                    } while (var2_2 < 0L);
                }
                v3 = var8_6;
            }
            return v3;
        }
        return null;
    }

    boolean n(Object[] objectArray) {
        boolean bl2;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("j", (long)6637110206357843283L, (long)l10);
                try {
                    bl2 = m44.a("t", (Object)this, (long)4643939701934580024L, (long)l10) & bs.a("j", (int)14898, (long)(0x3851CB420EC38267L ^ l10));
                    if (callSite == false) break block2;
                    if (!bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)n92, (long)4738287290908961305L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    void P(Object[] objectArray) {
        block11: {
            String string;
            long l10;
            block15: {
                String string2;
                block14: {
                    block13: {
                        String string3;
                        int n10;
                        String string4;
                        CallSite callSite;
                        block12: {
                            CallSite callSite2;
                            long l11;
                            block10: {
                                l10 = (Long)objectArray[0];
                                l11 = (l10 = a ^ l10) ^ 0xA7853B5BC82L;
                                callSite = m44.a("i", (long)6293958735179621904L, (long)l10);
                                try {
                                    try {
                                        callSite2 = m44.a("w", (Object)this, (long)5711853141093332131L, (long)l10);
                                        if (callSite == false) break block10;
                                        if (callSite2 == null) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("i", (Object)n92, (long)5369035820616212826L, (long)l10);
                                    }
                                    callSite2 = m44.a("w", (Object)this, (long)5711853141093332131L, (long)l10);
                                }
                                catch (n9 n93) {
                                    throw m44.a("i", (Object)n93, (long)5369035820616212826L, (long)l10);
                                }
                            }
                            try {
                                try {
                                    string4 = ((x8)((Object)callSite2)).V();
                                    if (callSite == false) break block12;
                                    if (string4.length() <= 0) break block11;
                                }
                                catch (n9 n94) {
                                    throw m44.a("i", (Object)n94, (long)5369035820616212826L, (long)l10);
                                }
                                string4 = ((jf)((Object)m44.a("w", (Object)this, (long)6138399646215018677L, (long)l10))).g(l11);
                            }
                            catch (n9 n95) {
                                throw m44.a("i", (Object)n95, (long)5369035820616212826L, (long)l10);
                            }
                        }
                        if ((n10 = (string3 = string4).lastIndexOf((int)bs.a("j", (int)9319, (long)(0x51FED7506DCD1774L ^ l10)))) == -1) break block13;
                        string2 = string3.substring(n10 + 1);
                        if (l10 <= 0L) break block14;
                        string = string2;
                        if (callSite != false) break block15;
                    }
                    string2 = "";
                }
                string = string2;
            }
            ((x8)((Object)m44.a("w", (Object)this, (long)5711853141093332131L, (long)l10))).A(string);
        }
    }

    boolean i(Object[] objectArray) {
        block4: {
            Object object;
            block5: {
                block6: {
                    long l10 = (Long)objectArray[0];
                    hf hf2 = (hf)objectArray[1];
                    long l11 = l10 = a ^ l10;
                    long l12 = l11 ^ 0x5EB5D59356DAL;
                    long l13 = l11 ^ 0x2037E0DE2558L;
                    long l14 = l11 ^ 0x645A7FCA69B7L;
                    String string = ((jf)((Object)m44.a("r", (Object)this, (long)-9215886739691254400L, (long)l10))).g(l14);
                    _f _f2 = l62.B(string, l13);
                    CallSite callSite = m44.a("l", (long)-9048351512389553371L, (long)l10);
                    try {
                        try {
                            if (_f2 == null) break block4;
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l12;
                            objectArray2[0] = _f2;
                            object = m44.a("s", (Object)hf2, (Object)objectArray2, (long)-9222301142251870453L, (long)l10);
                            if (callSite == false) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("l", (Object)n92, (long)-6937852934112496529L, (long)l10);
                        }
                        if (object != false) break block6;
                    }
                    catch (n9 n93) {
                        throw m44.a("l", (Object)n93, (long)-6937852934112496529L, (long)l10);
                    }
                    object = true;
                    break block5;
                }
                object = false;
            }
            CallSite callSite = object;
            return (boolean)callSite;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    protected void V(Object[] var1_1) {
        block23: {
            block22: {
                block20: {
                    block21: {
                        block19: {
                            block17: {
                                block18: {
                                    block16: {
                                        var4_2 = (DataOutputStream)var1_1[0];
                                        var2_3 = (Long)var1_1[1];
                                        var2_3 = bs.a ^ var2_3;
                                        var5_4 = m44.a("l", (long)656897260747841018L, (long)var2_3);
                                        try {
                                            try {
                                                if (var5_4 != false) break block16;
                                                if (m44.a("r", (Object)this, (long)1240800980722024993L, (long)var2_3) != false) {
                                                }
                                                ** GOTO lbl60
                                            }
                                            catch (n9 v0) {
                                                throw m44.a("l", (Object)v0, (long)909642969712240455L, (long)var2_3);
                                            }
                                            var4_2.writeShort(m44.a("r", (Object)this, (long)1383430970938220200L, (long)var2_3).E());
                                        }
                                        catch (n9 v1) {
                                            throw m44.a("l", (Object)v1, (long)909642969712240455L, (long)var2_3);
                                        }
                                    }
                                    try {
                                        try {
                                            v2 = var4_2;
                                            v3 = m44.a("r", (Object)this, (long)1203651643127550929L, (long)var2_3);
                                            if (var5_4 != false) break block17;
                                            if (v3 != null) break block18;
                                        }
                                        catch (n9 v4) {
                                            throw m44.a("l", (Object)v4, (long)909642969712240455L, (long)var2_3);
                                        }
                                        v5 = 0;
                                        break block19;
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("l", (Object)v6, (long)909642969712240455L, (long)var2_3);
                                    }
                                }
                                v3 = m44.a("r", (Object)this, (long)1203651643127550929L, (long)var2_3);
                            }
                            v5 = v3.E();
                        }
                        try {
                            try {
                                v2.writeShort(v5);
                                v7 = var4_2;
                                v8 = m44.a("r", (Object)this, (long)673713640328491710L, (long)var2_3);
                                if (var5_4 != false) break block20;
                                if (v8 != null) break block21;
                            }
                            catch (n9 v9) {
                                throw m44.a("l", (Object)v9, (long)909642969712240455L, (long)var2_3);
                            }
                            v10 = 0;
                            break block22;
                        }
                        catch (n9 v11) {
                            throw m44.a("l", (Object)v11, (long)909642969712240455L, (long)var2_3);
                        }
                    }
                    v8 = m44.a("r", (Object)this, (long)673713640328491710L, (long)var2_3);
                }
                v10 = v8.E();
            }
            try {
                v7.writeShort(v10);
                var4_2.writeShort((int)m44.a("r", (Object)this, (long)949383021703048294L, (long)var2_3));
                if (var2_3 <= 0L || var5_4 == false) break block23;
lbl60:
                // 2 sources

                var4_2.write((byte[])m44.a("r", (Object)this, (long)584631538091042394L, (long)var2_3));
            }
            catch (n9 v12) {
                throw m44.a("l", (Object)v12, (long)909642969712240455L, (long)var2_3);
            }
        }
    }

    public String Z(Object[] objectArray) {
        block9: {
            String string;
            block10: {
                CallSite callSite;
                CallSite callSite2;
                long l10;
                long l11;
                block8: {
                    l11 = (Long)objectArray[0];
                    l10 = (l11 = a ^ l11) ^ 0x775AAA847647L;
                    callSite2 = m44.a("l", (long)-7089264783036715819L, (long)l11);
                    try {
                        try {
                            callSite = m44.a("r", (Object)this, (long)-7175270771041542391L, (long)l11);
                            if (callSite2 == false) break block8;
                            if (callSite == null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("l", (Object)n92, (long)-9203149256035357793L, (long)l11);
                        }
                        callSite = m44.a("r", (Object)this, (long)-7175270771041542391L, (long)l11);
                    }
                    catch (n9 n93) {
                        throw m44.a("l", (Object)n93, (long)-9203149256035357793L, (long)l11);
                    }
                }
                String string2 = ((jf)((Object)callSite)).g(l10);
                try {
                    try {
                        string = string2;
                        if (callSite2 == false) break block10;
                        if (string.equals("")) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("l", (Object)n94, (long)-9203149256035357793L, (long)l11);
                    }
                    string = string2;
                }
                catch (n9 n95) {
                    throw m44.a("l", (Object)n95, (long)-9203149256035357793L, (long)l11);
                }
            }
            return string;
        }
        return null;
    }

    @Override
    public void S(Object[] objectArray) {
        CallSite callSite;
        jf jf2;
        long l10;
        jf jf3;
        block7: {
            jf jf4;
            block8: {
                jf4 = (jf)objectArray[0];
                jf3 = (jf)objectArray[1];
                l10 = (Long)objectArray[2];
                CallSite callSite2 = m44.a("o", (long)-8777896317510626615L, (long)l10);
                try {
                    try {
                        jf2 = jf4;
                        callSite = m44.a("q", (Object)this, (long)-7205321278115851877L, (long)l10);
                        if (l10 <= 0L || callSite2 != false) break block7;
                        if (jf2 != callSite) break block8;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-8958554470757848972L, (long)l10);
                    }
                    m44.a("s", (Object)this, (jf)jf3, (long)-7205321278115851877L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-8958554470757848972L, (long)l10);
                }
            }
            jf2 = jf4;
            callSite = m44.a("q", (Object)this, (long)-6951486822791619358L, (long)l10);
        }
        try {
            if (jf2 == callSite) {
                m44.a("s", (Object)this, (jf)jf3, (long)-6951486822791619358L, (long)l10);
            }
        }
        catch (n9 n94) {
            throw m44.a("o", (Object)n94, (long)-8958554470757848972L, (long)l10);
        }
    }

    @Override
    public void q(x8 x82, long l10, x8 x83) {
        block5: {
            bs bs2;
            block4: {
                CallSite callSite = m44.a("n", (long)-5231047857311529425L, (long)l10);
                try {
                    try {
                        bs2 = this;
                        if (callSite == false) break block4;
                        if (m44.a("p", (Object)bs2, (long)-5801863906118282084L, (long)l10) != x82) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-6143593723565145755L, (long)l10);
                    }
                    bs2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-6143593723565145755L, (long)l10);
                }
            }
            m44.a("r", (Object)bs2, (x8)x83, (long)-5801863906118282084L, (long)l10);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                bs.a = prr.a(-7086208966114247035L, 3209069338418785384L, MethodHandles.lookup().lookupClass()).a(221583539292777L);
                bs.d = new HashMap<K, V>(13);
                var0 = bs.a ^ 54460744278214L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "v\u00a0d0z\u00bf\u001b\u00f5\u008d\u00a3\u00c3.KQ\u00caU\u00cb/\u00f78\u00ff8%(";
                var7_6 = "v\u00a0d0z\u00bf\u001b\u00f5\u008d\u00a3\u00c3.KQ\u00caU\u00cb/\u00f78\u00ff8%(".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00c52\u0098\u0084Z\u008f \u0092\u00b8\u00ad\u00fc<9\u0096U\"";
                    var7_6 = "\u00c52\u0098\u0084Z\u008f \u0092\u00b8\u00ad\u00fc<9\u0096U\"".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        bs.b = var8_3;
        bs.c = new Integer[5];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x7754;
        if (c[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bs", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bs.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = bs.a(n10, l10);
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
            throw new RuntimeException("com/zelix/bs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bs.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

