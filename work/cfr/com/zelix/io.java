/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.a;
import com.zelix.bn;
import com.zelix.c;
import com.zelix.cf;
import com.zelix.eo;
import com.zelix.h1;
import com.zelix.hp;
import com.zelix.hz;
import com.zelix.i_;
import com.zelix.ii;
import com.zelix.j2;
import com.zelix.j5;
import com.zelix.j9;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.lk9;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.mb;
import com.zelix.n9;
import com.zelix.oz;
import com.zelix.prr;
import com.zelix.r8;
import com.zelix.v7;
import com.zelix.x8;
import com.zelix.xp;
import com.zelix.xt;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class io
extends oz
implements r8,
a,
eo,
mb {
    private js a;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    @Override
    public boolean S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public final boolean v(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        v7 v72 = (v7)objectArray[1];
        long l10 = (Long)objectArray[2];
        int n11 = (Integer)objectArray[3];
        return false;
    }

    @Override
    public final boolean T(long l10) {
        return false;
    }

    io(h1 h12, hp hp2, l6q l6q2, l6q l6q3, l6q l6q4, long l10) {
        block17: {
            boolean bl2;
            long l11;
            block18: {
                CallSite callSite;
                block15: {
                    long l12 = l10 = b ^ l10;
                    long l13 = l12 ^ 0x42D3E5CF8FDL;
                    l11 = l12 ^ 0x647B941E9DBAL;
                    super((int)io.c("h", (int)30810, (long)(0x121146BDEB1F5447L ^ l10)));
                    int n10 = h12.read();
                    callSite = m44.a("m", (long)-1595475447834009081L, (long)l10);
                    try {
                        block16: {
                            try {
                                try {
                                    this.a = hp2.m(l13, n10);
                                    bl2 = this.a instanceof xt;
                                    if (callSite == false) break block15;
                                    if (!bl2) break block16;
                                }
                                catch (n9 n92) {
                                    throw m44.a("m", (Object)n92, (long)-860338364571203679L, (long)l10);
                                }
                                l6q2.t((xt)this.a, this, l11);
                                if (callSite != false) break block17;
                            }
                            catch (n9 n93) {
                                throw m44.a("m", (Object)n93, (long)-860338364571203679L, (long)l10);
                            }
                        }
                        bl2 = this.a instanceof xp;
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)n94, (long)-860338364571203679L, (long)l10);
                    }
                }
                try {
                    block19: {
                        try {
                            try {
                                if (l10 <= 0L || callSite == false) break block18;
                                if (!bl2) break block19;
                            }
                            catch (n9 n95) {
                                throw m44.a("m", (Object)n95, (long)-860338364571203679L, (long)l10);
                            }
                            l6q3.t((xp)this.a, this, l11);
                            if (callSite != false) break block17;
                        }
                        catch (n9 n96) {
                            throw m44.a("m", (Object)n96, (long)-860338364571203679L, (long)l10);
                        }
                    }
                    bl2 = this.a instanceof jf;
                }
                catch (n9 n97) {
                    throw m44.a("m", (Object)n97, (long)-860338364571203679L, (long)l10);
                }
            }
            try {
                if (bl2) {
                    l6q4.t((jf)this.a, this, l11);
                }
            }
            catch (n9 n98) {
                throw m44.a("m", (Object)n98, (long)-860338364571203679L, (long)l10);
            }
        }
    }

    public io(long l10, js js2) {
        l10 = b ^ l10;
        super((int)io.c("h", (int)6180, (long)(0x1735C85D006B999CL ^ l10)));
        this.a = js2;
    }

    @Override
    public String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10;
        long l12 = l11 ^ 0x643AFC476936L;
        long l13 = l11 ^ 0x3926A82327E7L;
        int n10 = (int)(l13 >>> 32);
        int n11 = (int)(l13 << 32 >>> 56);
        int n12 = (int)(l13 << 40 >>> 40);
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n12;
        objectArray2[1] = (int)((byte)n11);
        objectArray2[0] = n10;
        stringBuilder.append((String)((Object)m44.a("s", (Object)this, (Object)objectArray2, (long)-7550383759637692338L, (long)l10)));
        stringBuilder.append((char)io.c("h", (int)5225, (long)(0x327989CCC1AFDE43L ^ l10)));
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        stringBuilder.append((String)((Object)m44.a("s", (Object)this.a, (Object)objectArray3, (long)-8351324275647535027L, (long)l10)));
        return stringBuilder.toString();
    }

    @Override
    public boolean a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.a instanceof xp;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public hz n(hz var1_1, boolean var2_2, char var3_3, int var4_4, boolean var5_5, loj var6_6, char var7_7, String var8_8) {
        block51: {
            block56: {
                block55: {
                    block54: {
                        block52: {
                            block45: {
                                block48: {
                                    block49: {
                                        block46: {
                                            v0 = var9_9 = (long)var3_3 << 48 | (long)var4_4 << 32 >>> 16 | (long)var7_7 << 48 >>> 48;
                                            var11_10 = v0 ^ 6215624408093L;
                                            var13_11 = v0 ^ 114161761794490L;
                                            var15_12 = v0 ^ 332116234582L;
                                            v1 = v0 ^ 101946427565099L;
                                            var17_13 = (int)(v1 >>> 56);
                                            var18_14 = (int)(v1 << 8 >>> 32);
                                            var19_15 = (int)(v1 << 40 >>> 40);
                                            var20_16 = v0 ^ 31988536357509L;
                                            var22_17 = v0 ^ 8842354942294L;
                                            var25_18 = var1_1.X();
                                            var26_19 = var25_18.length;
                                            var27_20 = v7.I(var26_19 + 1, var15_12);
                                            var28_21 = var1_1.T();
                                            var24_22 = m44.a("l", (long)-4354173775004039090L, (long)var9_9);
                                            try {
                                                System.arraycopy(var25_18, 0, var27_20, 0, var26_19);
                                                v2 /* !! */  = this.a instanceof c;
                                                if (var24_22 == false) break block45;
                                                if (v2 /* !! */  != 0) {
                                                }
                                                ** GOTO lbl91
                                            }
                                            catch (n9 v3) {
                                                throw m44.a("l", (Object)v3, (long)-2430233657819468312L, (long)var9_9);
                                            }
                                            var29_23 = ((c)this.a).j(var22_17);
                                            try {
                                                block47: {
                                                    try {
                                                        try {
                                                            v2 /* !! */  = (int)var29_23.equals(io.b("u", (int)6010, (long)(1745541117892519409L ^ var9_9)));
                                                            v4 = var24_22;
                                                            if (var7_7 >= '\u0000') {
                                                                if (v4 == false) break block46;
                                                                if (v2 /* !! */  == 0) break block47;
                                                            }
                                                            ** GOTO lbl59
                                                        }
                                                        catch (n9 v5) {
                                                            throw m44.a("l", (Object)v5, (long)-2430233657819468312L, (long)var9_9);
                                                        }
                                                        var27_20[var26_19] = v7.B;
                                                        v2 /* !! */  = (int)var24_22;
                                                        if (var3_3 >= '\u0000') {
                                                            if (v2 /* !! */  != 0) break block48;
                                                        }
                                                        ** GOTO lbl89
                                                    }
                                                    catch (n9 v6) {
                                                        throw m44.a("l", (Object)v6, (long)-2430233657819468312L, (long)var9_9);
                                                    }
                                                }
                                                v2 /* !! */  = (int)var29_23.equals(io.b("u", (int)18920, (long)(1191327332025776996L ^ var9_9)));
                                            }
                                            catch (n9 v7) {
                                                throw m44.a("l", (Object)v7, (long)-2430233657819468312L, (long)var9_9);
                                            }
                                        }
                                        try {
                                            block50: {
                                                try {
                                                    try {
                                                        if (var3_3 < '\u0000') break block49;
                                                        v4 = var24_22;
lbl59:
                                                        // 2 sources

                                                        if (v4 == false) break block49;
                                                        if (v2 /* !! */  == 0) break block50;
                                                    }
                                                    catch (n9 v8) {
                                                        throw m44.a("l", (Object)v8, (long)-2430233657819468312L, (long)var9_9);
                                                    }
                                                    var27_20[var26_19] = v7.Y;
                                                    v2 /* !! */  = (int)var24_22;
                                                    if (var3_3 >= '\u0000') {
                                                        if (v2 /* !! */  != 0) break block48;
                                                    }
                                                    ** GOTO lbl89
                                                }
                                                catch (n9 v9) {
                                                    throw m44.a("l", (Object)v9, (long)-2430233657819468312L, (long)var9_9);
                                                }
                                            }
                                            v2 /* !! */  = (int)var29_23.equals(io.b("u", (int)30108, (long)(7843106675519096596L ^ var9_9)));
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("l", (Object)v10, (long)-2430233657819468312L, (long)var9_9);
                                        }
                                    }
                                    try {
                                        if (var7_7 > '\u0000') {
                                            if (v2 /* !! */  != 0) {
                                                var27_20[var26_19] = v7.V;
                                            }
                                        }
                                        ** GOTO lbl89
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("l", (Object)v11, (long)-2430233657819468312L, (long)var9_9);
                                    }
                                }
                                try {
                                    v2 /* !! */  = (int)var24_22;
lbl89:
                                    // 4 sources

                                    if (var7_7 <= '\u0000') break block45;
                                    if (v2 /* !! */  != 0) break block51;
lbl91:
                                    // 2 sources

                                    v2 /* !! */  = this.a instanceof jf;
                                }
                                catch (n9 v12) {
                                    throw m44.a("l", (Object)v12, (long)-2430233657819468312L, (long)var9_9);
                                }
                            }
                            try {
                                block53: {
                                    try {
                                        try {
                                            v13 = var24_22;
                                            if (var4_4 >= 0) {
                                                if (v13 == false) break block52;
                                                if (v2 /* !! */  == 0) break block53;
                                            }
                                            ** GOTO lbl120
                                        }
                                        catch (n9 v14) {
                                            throw m44.a("l", (Object)v14, (long)-2430233657819468312L, (long)var9_9);
                                        }
                                        var27_20[var26_19] = m44.a("h", (long)-2615269712084233667L, (long)var9_9);
                                        if (var24_22 != false) break block51;
                                    }
                                    catch (n9 v15) {
                                        throw m44.a("l", (Object)v15, (long)-2430233657819468312L, (long)var9_9);
                                    }
                                }
                                v2 /* !! */  = this.a instanceof j2;
                            }
                            catch (n9 v16) {
                                throw m44.a("l", (Object)v16, (long)-2430233657819468312L, (long)var9_9);
                            }
                        }
                        try {
                            v13 = var24_22;
lbl120:
                            // 2 sources

                            if (var3_3 < '\u0000') ** GOTO lbl141
                            if (v13 == false) break block54;
                            if (v2 /* !! */  != 0) {
                            }
                            ** GOTO lbl134
                        }
                        catch (n9 v17) {
                            throw m44.a("l", (Object)v17, (long)-2430233657819468312L, (long)var9_9);
                        }
                        var27_20 = v7.I(var26_19 + 1, var15_12);
                        try {
                            System.arraycopy(var25_18, 0, var27_20, 0, var26_19);
                            var27_20[var26_19] = v7.M((byte)var17_13, var18_14, var19_15, (String)io.b("u", (int)24620, (long)(731301027178582693L ^ var9_9)));
                            v2 /* !! */  = (int)var24_22;
                            if (var3_3 < '\u0000') break block54;
                            if (v2 /* !! */  != 0) break block51;
lbl134:
                            // 2 sources

                            v2 /* !! */  = this.a instanceof j9;
                        }
                        catch (n9 v18) {
                            throw m44.a("l", (Object)v18, (long)-2430233657819468312L, (long)var9_9);
                        }
                    }
                    try {
                        v13 = var24_22;
lbl141:
                        // 2 sources

                        if (var3_3 < '\u0000') ** GOTO lbl163
                        if (v13 == false) break block55;
                        if (v2 /* !! */  != 0) {
                        }
                        ** GOTO lbl155
                    }
                    catch (n9 v19) {
                        throw m44.a("l", (Object)v19, (long)-2430233657819468312L, (long)var9_9);
                    }
                    var27_20 = v7.I(var26_19 + 1, var15_12);
                    try {
                        System.arraycopy(var25_18, 0, var27_20, 0, var26_19);
                        var27_20[var26_19] = v7.M((byte)var17_13, var18_14, var19_15, (String)io.b("u", (int)932, (long)(3381818826768675118L ^ var9_9)));
                        v2 /* !! */  = (int)var24_22;
                        if (var4_4 < 0) break block55;
                        if (v2 /* !! */  != 0) break block51;
lbl155:
                        // 2 sources

                        v2 /* !! */  = this.a instanceof j5;
                    }
                    catch (n9 v20) {
                        throw m44.a("l", (Object)v20, (long)-2430233657819468312L, (long)var9_9);
                    }
                }
                try {
                    try {
                        v13 = var24_22;
lbl163:
                        // 2 sources

                        if (v13 == false) break block56;
                        if (v2 /* !! */  == 0) break block51;
                    }
                    catch (n9 v21) {
                        throw m44.a("l", (Object)v21, (long)-2430233657819468312L, (long)var9_9);
                    }
                    v2 /* !! */  = var26_19 + 1;
                }
                catch (n9 v22) {
                    throw m44.a("l", (Object)v22, (long)-2430233657819468312L, (long)var9_9);
                }
            }
            var27_20 = v7.I(v2 /* !! */ , var15_12);
            System.arraycopy(var25_18, 0, var27_20, 0, var26_19);
            var29_23 = (j5)this.a;
            v23 = new Object[1];
            v23[0] = var20_16;
            var30_24 = m44.a("s", (Object)var29_23, (Object)v23, (long)-2683358755509513721L, (long)var9_9);
            var27_20[var26_19] = v7.M((byte)var17_13, var18_14, var19_15, (String)var30_24);
        }
        return new hz(var27_20, var28_21, var13_11, var1_1.j(), var1_1.k(var11_10));
    }

    @Override
    public final boolean e(long l10, int n10) {
        return true;
    }

    @Override
    public void h(Object[] objectArray) {
        block4: {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            PrintWriter printWriter;
            block5: {
                long l10 = (Long)objectArray[0];
                printWriter = (PrintWriter)objectArray[1];
                stringBuilder2 = (StringBuilder)objectArray[2];
                long l11 = l10;
                long l12 = l11 ^ 0x5D3C6484BBF6L;
                long l13 = l11 ^ 0x7B7D8DE1E476L;
                long l14 = l11 ^ 0x55B55102092AL;
                long l15 = l11 ^ 0x8A9056647FBL;
                int n10 = (int)(l15 >>> 32);
                int n11 = (int)(l15 << 32 >>> 56);
                int n12 = (int)(l15 << 40 >>> 40);
                stringBuilder = new StringBuilder((int)io.c("h", (int)28924, (long)(0x4230D8036885DACFL ^ l10)));
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = n12;
                objectArray2[1] = (int)((byte)n11);
                objectArray2[0] = n10;
                CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-636251684499120046L, (long)l10);
                CallSite callSite2 = m44.a("h", (long)-1155528826364025814L, (long)l10);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l14;
                stringBuilder.append((String)((Object)callSite) + " " + (String)((Object)m44.a("w", (Object)this.a, (Object)objectArray3, (long)-1439441735835203503L, (long)l10)));
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = this.X;
                objectArray4[0] = l13;
                CallSite callSite3 = m44.a("h", (Object)objectArray4, (long)-1509257710096725591L, (long)l10);
                Object[] objectArray5 = new Object[1];
                objectArray5[0] = l14;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = m44.a("w", (Object)this.a, (Object)objectArray5, (long)-1439441735835203503L, (long)l10);
                objectArray6[1] = callSite3;
                objectArray6[0] = l12;
                callSite3 = m44.a("h", (Object)objectArray6, (long)-1214410100789358428L, (long)l10);
                try {
                    try {
                        if (callSite2 == false) break block4;
                        if (((String)((Object)callSite3)).length() <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-999110824034188916L, (long)l10);
                    }
                    stringBuilder.append("\t" + (String)((Object)callSite3));
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-999110824034188916L, (long)l10);
                }
            }
            printWriter.println(stringBuilder2.toString() + stringBuilder2.toString() + stringBuilder);
        }
    }

    @Override
    public void S(Object[] objectArray) {
        block5: {
            jf jf2;
            block4: {
                jf jf3 = (jf)objectArray[0];
                jf2 = (jf)objectArray[1];
                long l10 = (Long)objectArray[2];
                CallSite callSite = m44.a("o", (long)-7218963243841743902L, (long)l10);
                try {
                    io io2;
                    try {
                        io2 = this;
                        if (callSite != false) break block4;
                        if (io2.a != jf3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-7361915844065514885L, (long)l10);
                    }
                    io2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-7361915844065514885L, (long)l10);
                }
            }
            io2.a = jf2;
        }
    }

    @Override
    public void V(Object[] objectArray) {
        block5: {
            xt xt2;
            block4: {
                xt xt3 = (xt)objectArray[0];
                xt2 = (xt)objectArray[1];
                long l10 = (Long)objectArray[2];
                CallSite callSite = m44.a("l", (long)4490842495129154958L, (long)l10);
                try {
                    io io2;
                    try {
                        io2 = this;
                        if (callSite == false) break block4;
                        if (io2.a != xt3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)2559839184236711976L, (long)l10);
                    }
                    io2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)2559839184236711976L, (long)l10);
                }
            }
            io2.a = xt2;
        }
    }

    @Override
    public boolean d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public final boolean Y(long l10, int n10, int n11) {
        return false;
    }

    @Override
    public boolean L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public boolean d(ii ii2, Set set, bn bn2, int n10, long l10) {
        boolean bl2;
        block15: {
            block16: {
                Object object;
                block17: {
                    block18: {
                        long l11 = l10;
                        long l12 = l11 ^ 0x50C52D9B4FCDL;
                        long l13 = l11 ^ 0x50DBEEB0A050L;
                        CallSite callSite = m44.a("k", (long)-6677223770485200759L, (long)l10);
                        try {
                            bl2 = this.a instanceof xt;
                            if (callSite == false) break block15;
                            if (!bl2) break block16;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)-4719366672907530961L, (long)l10);
                        }
                        xt xt2 = (xt)this.a;
                        x8 x82 = xt2.V();
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                object = m44.a("t", (Object)x82, (Object)new Object[0], (long)-4722412079814637109L, (long)l10);
                                                Object object2 = callSite;
                                                if (l10 > 0L) {
                                                    if (object2 == false) break block17;
                                                    object2 = 2;
                                                }
                                                if (object < object2) break block18;
                                            }
                                            catch (n9 n93) {
                                                throw m44.a("k", (Object)n93, (long)-4719366672907530961L, (long)l10);
                                            }
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l13;
                                            object = m44.a("t", (Object)xt2, (Object)objectArray, (long)-6562076652257736268L, (long)l10);
                                            if (callSite == false) break block17;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("k", (Object)n94, (long)-4719366672907530961L, (long)l10);
                                        }
                                        if (object == false) break block18;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("k", (Object)n95, (long)-4719366672907530961L, (long)l10);
                                    }
                                    object = set.contains(xt2);
                                    if (callSite == false) break block17;
                                }
                                catch (n9 n96) {
                                    throw m44.a("k", (Object)n96, (long)-4719366672907530961L, (long)l10);
                                }
                                if (object != false) break block18;
                            }
                            catch (n9 n97) {
                                throw m44.a("k", (Object)n97, (long)-4719366672907530961L, (long)l10);
                            }
                            Object[] objectArray = new Object[5];
                            objectArray[4] = l12;
                            objectArray[3] = new lk9(n10, this);
                            objectArray[2] = xt2;
                            objectArray[1] = bn2;
                            objectArray[0] = bn2.D();
                            m44.a("t", (Object)ii2, (Object)objectArray, (long)-6423987347638458274L, (long)l10);
                            return true;
                        }
                        catch (n9 n98) {
                            throw m44.a("k", (Object)n98, (long)-4719366672907530961L, (long)l10);
                        }
                    }
                    object = false;
                }
                return (boolean)object;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public js s(long l10) {
        return this.a;
    }

    @Override
    public void o(Object[] objectArray) {
        block5: {
            xp xp2;
            block4: {
                xp xp3 = (xp)objectArray[0];
                long l10 = (Long)objectArray[1];
                xp2 = (xp)objectArray[2];
                CallSite callSite = m44.a("k", (long)7272722803229110065L, (long)l10);
                try {
                    io io2;
                    try {
                        io2 = this;
                        if (callSite == false) break block4;
                        if (io2.a != xp3) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)8735060794954369687L, (long)l10);
                    }
                    io2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)8735060794954369687L, (long)l10);
                }
            }
            io2.a = xp2;
        }
    }

    @Override
    public int T(char c10, int n10, char c11) {
        return 2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public oz r(Map var1_1, int var2_2, int var3_3, int var4_4) {
        block10: {
            block9: {
                var5_5 = (long)var2_2 << 32 | (long)var3_3 << 48 >>> 32 | (long)var4_4 << 48 >>> 48;
                var7_6 = var5_5 ^ 46596226632346L;
                var11_7 = (js)cf.J(var7_6, this.a, var1_1);
                var9_8 = m44.a("k", (long)8704658504643637502L, (long)var5_5);
                try {
                    v0 = var11_7;
                    if (var9_8 != false) break block9;
                    if (v0 != null) {
                    }
                    ** GOTO lbl21
                }
                catch (n9 v1) {
                    throw m44.a("k", (Object)v1, (long)8847611105536395623L, (long)var5_5);
                }
                var10_9 = var11_7;
                try {
                    v2 /* !! */  = (int)var9_8;
                    if (var2_2 >= 0) {
                        if (v2 /* !! */  == 0) break block10;
                    }
                    ** GOTO lbl30
lbl21:
                    // 2 sources

                    v0 = this.a;
                }
                catch (n9 v3) {
                    throw m44.a("k", (Object)v3, (long)8847611105536395623L, (long)var5_5);
                }
            }
            var10_9 = v0;
        }
        try {
            v2 /* !! */  = var10_9.E();
lbl30:
            // 2 sources

            if (v2 /* !! */  > io.c("h", (int)6483, (long)(6697786680734268303L ^ var5_5))) {
                return new i_((int)io.c("h", (int)23317, (long)(7026937530690763212L ^ var5_5)), this.a);
            }
        }
        catch (n9 v4) {
            throw m44.a("k", (Object)v4, (long)8847611105536395623L, (long)var5_5);
        }
        return null;
    }

    @Override
    public boolean u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.a instanceof xp;
    }

    @Override
    public boolean r(Object[] objectArray) {
        boolean bl2;
        block10: {
            block11: {
                Object object;
                block12: {
                    block13: {
                        ii ii2 = (ii)objectArray[0];
                        Set set = (Set)objectArray[1];
                        bn bn2 = (bn)objectArray[2];
                        long l10 = (Long)objectArray[3];
                        int n10 = (Integer)objectArray[4];
                        long l11 = l10;
                        long l12 = l11 ^ 0x7520A4869E2FL;
                        long l13 = l11 ^ 0x12A54F469405L;
                        CallSite callSite = m44.a("k", (long)8691382388752823105L, (long)l10);
                        try {
                            bl2 = this.a instanceof xp;
                            if (callSite == false) break block10;
                            if (!bl2) break block11;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)7298421173746554599L, (long)l10);
                        }
                        xp xp2 = (xp)this.a;
                        try {
                            try {
                                try {
                                    try {
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l12;
                                        object = m44.a("t", (Object)xp2, (Object)objectArray2, (long)7320776223038961253L, (long)l10);
                                        if (callSite == false) break block12;
                                        if (object == false) break block13;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("k", (Object)n93, (long)7298421173746554599L, (long)l10);
                                    }
                                    object = set.contains(xp2);
                                    if (callSite == false) break block12;
                                }
                                catch (n9 n94) {
                                    throw m44.a("k", (Object)n94, (long)7298421173746554599L, (long)l10);
                                }
                                if (object != false) break block13;
                            }
                            catch (n9 n95) {
                                throw m44.a("k", (Object)n95, (long)7298421173746554599L, (long)l10);
                            }
                            Object[] objectArray3 = new Object[5];
                            objectArray3[4] = l13;
                            objectArray3[3] = new lk9(n10, this);
                            objectArray3[2] = xp2;
                            objectArray3[1] = bn2;
                            objectArray3[0] = bn2.D();
                            m44.a("t", (Object)ii2, (Object)objectArray3, (long)9012032619352306582L, (long)l10);
                            return true;
                        }
                        catch (n9 n96) {
                            throw m44.a("k", (Object)n96, (long)7298421173746554599L, (long)l10);
                        }
                    }
                    object = false;
                }
                return (boolean)object;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void H(DataOutputStream var1_1, Map var2_2, long var3_3) {
        block9: {
            block8: {
                v0 = var3_3 ^ 109183790174989L;
                var5_4 = (int)(v0 >>> 48);
                var6_5 = (int)(v0 << 16 >>> 32);
                var7_6 = (int)(v0 << 48 >>> 48);
                v1 = m44.a("h", (long)5435323277584221021L, (long)var3_3);
                super.G((short)var5_4, var6_5, var1_1, var7_6);
                var9_7 = (js)var2_2.get(this.a);
                var8_8 = v1;
                try {
                    try {
                        if (var8_8 != false) break block8;
                        if (var9_7 != null) {
                        }
                        ** GOTO lbl26
                    }
                    catch (n9 v2) {
                        throw m44.a("h", (Object)v2, (long)5290051843844504260L, (long)var3_3);
                    }
                    var1_1.writeByte(var9_7.E());
                }
                catch (n9 v3) {
                    throw m44.a("h", (Object)v3, (long)5290051843844504260L, (long)var3_3);
                }
            }
            try {
                if (var3_3 <= 0L || var8_8 == false) break block9;
lbl26:
                // 2 sources

                var1_1.writeByte(this.a.E());
            }
            catch (n9 v4) {
                throw m44.a("h", (Object)v4, (long)5290051843844504260L, (long)var3_3);
            }
        }
    }

    @Override
    public boolean g(long l10) {
        return this.a instanceof xt;
    }

    @Override
    public void G(short s10, int n10, DataOutputStream dataOutputStream, int n11) {
        long l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
        long l11 = l10 ^ 0L;
        int n12 = (int)(l11 >>> 48);
        int n13 = (int)(l11 << 16 >>> 32);
        int n14 = (int)(l11 << 48 >>> 48);
        super.G((short)n12, n13, dataOutputStream, n14);
        dataOutputStream.writeByte(this.a.E());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        io.b = prr.a(8823783820466006387L, 3283564915940199089L, MethodHandles.lookup().lookupClass()).a(112076866595906L);
                        io.e = new HashMap<K, V>(13);
                        var11 = io.b ^ 99543384040760L;
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
                        var17_5 = "JN\u00fb\u00cf\u008f\u00a7\n\u0006\u0003\u0001&\u00a27\u001f\u009cZ0\u008bOe\u0006\u00ad;`W\u008e\u00b3\u00a8\u00e2eHt\u00f2\u00ff\u0088\u000b\u0080\u0094\u00b2\u0003r1?\u00d8\u000e\u0086\u0010\u00df\u0096C\u0000\u00f6\u00ed;\u0015\u0092}Z\u00cd\u00d50d\u0015\u00d3\"8\u009b\u0094\u00a8\u00cf\u00d4\u00b76\u00af\u00f5\u00f9\u00adq6\u0006\u00d4\u000fz\u00e17pDu\u00fd\u00e2\r\u001f\u00ec\u00f5\u0017\u00e2\u00e2\u00e3\u00b6\u000bX\u00d1k\t\u00f3s0\u00ce\u00bc\u0011/Be\r\u00fc\u0090\u00ef-\u00e7G\u00ae\u00ec";
                        var19_6 = "JN\u00fb\u00cf\u008f\u00a7\n\u0006\u0003\u0001&\u00a27\u001f\u009cZ0\u008bOe\u0006\u00ad;`W\u008e\u00b3\u00a8\u00e2eHt\u00f2\u00ff\u0088\u000b\u0080\u0094\u00b2\u0003r1?\u00d8\u000e\u0086\u0010\u00df\u0096C\u0000\u00f6\u00ed;\u0015\u0092}Z\u00cd\u00d50d\u0015\u00d3\"8\u009b\u0094\u00a8\u00cf\u00d4\u00b76\u00af\u00f5\u00f9\u00adq6\u0006\u00d4\u000fz\u00e17pDu\u00fd\u00e2\r\u001f\u00ec\u00f5\u0017\u00e2\u00e2\u00e3\u00b6\u000bX\u00d1k\t\u00f3s0\u00ce\u00bc\u0011/Be\r\u00fc\u0090\u00ef-\u00e7G\u00ae\u00ec".length();
                        var16_7 = 16;
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
                            var20_3[var18_4++] = io.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "0\u001f\u00fe%n\u00c4\u009d\u00ef/`U\u00c6X\u0093\u00d2\u0091\u0010\u00a3\u008a\u001e}\u00d0\u00d3U\u00fdx{\u001c<\u00d5\u00a80\u00f4";
                            var19_6 = "0\u001f\u00fe%n\u00c4\u009d\u00ef/`U\u00c6X\u0093\u00d2\u0091\u0010\u00a3\u008a\u001e}\u00d0\u00d3U\u00fdx{\u001c<\u00d5\u00a80\u00f4".length();
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
                            var20_3[var18_4++] = io.b(var21_9).intern();
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
                io.c = var20_3;
                io.d = new String[5];
                io.i = new HashMap<K, V>(13);
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
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = "\u00c6;T\u007f\r7K\u0012\u00856\u00d2\u0083\u00f6\u008d\u000e\u00b1h\u001a\u0094\u00be\u00bc\u00e0H\u00cbebe96p\u008b<";
                var5_15 = "\u00c6;T\u007f\r7K\u0012\u00856\u00d2\u0083\u00f6\u008d\u000e\u00b1h\u001a\u0094\u00be\u00bc\u00e0H\u00cbebe96p\u008b<".length();
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
                    var4_14 = "\u00ac\u00ad\u00ee$\u00e2\u00ab/\u00c4^mK`\u0004\u00eb\u0090\u00db";
                    var5_15 = "\u00ac\u00ad\u00ee$\u00e2\u00ab/\u00c4^mK`\u0004\u00eb\u0090\u00db".length();
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
        io.g = var6_12;
        io.h = new Integer[6];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3873;
        if (d[n11] == null) {
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
                throw new RuntimeException("com/zelix/io", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            io.d[n11] = io.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = io.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/io" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4CAC;
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
                throw new RuntimeException("com/zelix/io", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            io.h[n11] = n12;
        }
        return h[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = io.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/io" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(io.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(io.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

