/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e;
import com.zelix.lmm;
import com.zelix.lq0;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o8;
import com.zelix.ot;
import com.zelix.oz;
import com.zelix.prr;
import com.zelix.xx;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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
public class nc
extends xx
implements Comparable {
    private nc f;
    private List P;
    private String B;
    private List v;
    private int L = -1;
    private int i;
    private List R;
    private int a;
    private int K;
    static int q;
    private nc w;
    private List O;
    private List p;
    private static final long b;
    private static final String[] j;
    private static final String[] k;
    private static final Map l;
    private static final long n;

    void m(Object[] objectArray) {
        nc nc2 = (nc)objectArray[0];
        this.w = nc2;
    }

    public List y(long l10) {
        l10 = b ^ l10;
        try {
            if (this.O != null) {
                return new ArrayList(this.O);
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)n92, (long)6539843624070728851L, (long)l10);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean N(int n10, int n11, int n12, byte by2) {
        int n13;
        boolean bl2;
        block6: {
            long l10 = ((long)n11 << 32 | (long)n12 << 40 >>> 32 | (long)by2 << 56 >>> 56) ^ b;
            CallSite callSite = m44.a("k", (long)-5980247007080719919L, (long)l10);
            try {
                try {
                    try {
                        bl2 = n10;
                        n13 = this.K;
                        if (callSite != null) break block6;
                        if (bl2 < n13) return false;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)-5981807442051188051L, (long)l10);
                    }
                    bl2 = n10;
                    if (callSite != null) return bl2;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)-5981807442051188051L, (long)l10);
                }
                n13 = this.i;
            }
            catch (n9 n94) {
                throw m44.a("k", (Object)n94, (long)-5981807442051188051L, (long)l10);
            }
        }
        if (bl2 > n13) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private boolean w(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        lqu lqu2 = (lqu)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 = b ^ l10;
        long l12 = l11 ^ 0x5EE84767FB17L;
        long l13 = l11 ^ 0x33B9E508F817L;
        long l14 = l11 ^ 0x2CAE9192D9BBL;
        Class<?> clazz = this.getClass();
        synchronized (clazz) {
            Object object;
            block28: {
                block29: {
                    CallSite callSite;
                    block20: {
                        block21: {
                            Object object2;
                            block26: {
                                int n10;
                                block22: {
                                    block23: {
                                        block30: {
                                            callSite = m44.a("k", (long)-2917799170220547247L, (long)l10);
                                            object = m44.a("o", (long)-3567274512302200504L, (long)l10);
                                            if (callSite != null) break block20;
                                            if (object != false) break block21;
                                            break block30;
                                            catch (n9 n92) {
                                                throw m44.a("k", (Object)n92, (long)-2991417345390460883L, (long)l10);
                                            }
                                        }
                                        try {
                                            block31: {
                                                n10 = set.size();
                                                if (callSite != null) break block22;
                                                break block31;
                                                catch (n9 n93) {
                                                    throw m44.a("k", (Object)n93, (long)-2991417345390460883L, (long)l10);
                                                }
                                            }
                                            if (n10 == 5) break block23;
                                        }
                                        catch (n9 n94) {
                                            throw m44.a("k", (Object)n94, (long)-2991417345390460883L, (long)l10);
                                        }
                                        m44.a("h", (int)-1, (long)-3567274512302200504L, (long)l10);
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l13;
                                        m44.a("t", (Object)lqu2, (Object)objectArray2, (long)-3148301457975466014L, (long)l10);
                                        return false;
                                    }
                                    n10 = 0;
                                }
                                int n11 = n10;
                                for (String string : set) {
                                    CallSite callSite2;
                                    block24: {
                                        block25: {
                                            block27: {
                                                callSite2 = callSite;
                                                if (l10 < 0L) break block24;
                                                if (callSite2 != null) break block25;
                                                try {
                                                    block32: {
                                                        Object[] objectArray3 = new Object[3];
                                                        objectArray3[2] = nc.b("i", (int)8331, (long)(0x30AEFA1F7FF337A9L ^ l10));
                                                        objectArray3[1] = l14;
                                                        objectArray3[0] = string;
                                                        Object[] objectArray4 = new Object[2];
                                                        objectArray4[1] = n11;
                                                        objectArray4[0] = l12;
                                                        object2 = m44.a("t", (Object)m44.a("k", (Object)objectArray3, (long)-2969539761388500395L, (long)l10), (Object)m44.a("t", (Object)this, (Object)objectArray4, (long)-3406503318733693689L, (long)l10), (long)-3653868182660193706L, (long)l10);
                                                        if (callSite != null) break block26;
                                                        break block32;
                                                        catch (n9 n95) {
                                                            throw m44.a("k", (Object)n95, (long)-2991417345390460883L, (long)l10);
                                                        }
                                                    }
                                                    if (object2 != 0) break block27;
                                                }
                                                catch (n9 n96) {
                                                    throw m44.a("k", (Object)n96, (long)-2991417345390460883L, (long)l10);
                                                }
                                                m44.a("h", (int)-1, (long)-3567274512302200504L, (long)l10);
                                                Object[] objectArray5 = new Object[1];
                                                objectArray5[0] = l13;
                                                m44.a("t", (Object)lqu2, (Object)objectArray5, (long)-3148301457975466014L, (long)l10);
                                                return false;
                                            }
                                            ++n11;
                                        }
                                        callSite2 = callSite;
                                    }
                                    if (callSite2 == null) continue;
                                }
                                if (l10 <= 0L) break block21;
                                object2 = 1;
                            }
                            m44.a("h", (int)object2, (long)-3567274512302200504L, (long)l10);
                        }
                        object = m44.a("o", (long)-3567274512302200504L, (long)l10);
                    }
                    if (callSite != null) break block28;
                    try {
                        block33: {
                            if (object != true) break block29;
                            break block33;
                            catch (n9 n97) {
                                throw m44.a("k", (Object)n97, (long)-2991417345390460883L, (long)l10);
                            }
                        }
                        object = true;
                        break block28;
                    }
                    catch (n9 n98) {
                        throw m44.a("k", (Object)n98, (long)-2991417345390460883L, (long)l10);
                    }
                }
                object = false;
            }
            return (boolean)object;
        }
    }

    void x(int n10) {
        this.a = n10;
    }

    void N(String string) {
        this.B = string;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    public boolean F(Object[] objectArray) {
        boolean bl2;
        e e10 = (e)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = b ^ l10) ^ 0x61AF4052283AL;
        int n10 = this.i;
        CallSite callSite = m44.a("h", (long)-4385797834250766350L, (long)l10);
        block0: while (true) {
            Object[] objectArray2;
            oz oz2 = (oz)e10.get(n10);
            --n10;
            if (!oz2.o()) {
                objectArray2 = new Object[1];
                objectArray2[0] = l11;
                bl2 = (boolean)m44.a("w", (Object)oz2, (Object)objectArray2, (long)-2355707017896277736L, (long)l10);
                if (l10 >= 0L && callSite == null) {
                    return bl2;
                }
            } else {
                bl2 = n10;
            }
            do {
                if (bl2 > this.K) continue block0;
                objectArray2 = new Object[1];
                objectArray2[0] = l11;
                bl2 = (boolean)m44.a("w", (Object)oz2, (Object)objectArray2, (long)-2355707017896277736L, (long)l10);
            } while (l10 < 0L || callSite != null);
            break;
        }
        return bl2;
    }

    public int compareTo(Object object) {
        long l10 = b ^ 0x6840F90D2622L;
        long l11 = l10 ^ 0x75E46B6A04D2L;
        return this.m((nc)object, l11);
    }

    public boolean D(Object[] objectArray) {
        boolean bl2;
        block13: {
            block11: {
                List list;
                nc nc2;
                long l10;
                block12: {
                    CallSite callSite;
                    block10: {
                        l10 = (Long)objectArray[0];
                        nc2 = (nc)objectArray[1];
                        l10 = b ^ l10;
                        callSite = m44.a("i", (long)-2255215737509374877L, (long)l10);
                        try {
                            try {
                                list = this.O;
                                if (callSite != null) break block10;
                                if (list == null) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)n92, (long)-2211722720381602017L, (long)l10);
                            }
                            list = this.O;
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)n93, (long)-2211722720381602017L, (long)l10);
                        }
                    }
                    try {
                        try {
                            if (l10 < 0L || callSite != null) break block12;
                            if (list.size() != 2) break block11;
                        }
                        catch (n9 n94) {
                            throw m44.a("i", (Object)n94, (long)-2211722720381602017L, (long)l10);
                        }
                        list = this.O.get(0);
                    }
                    catch (n9 n95) {
                        throw m44.a("i", (Object)n95, (long)-2211722720381602017L, (long)l10);
                    }
                }
                try {
                    if (list != nc2) break block11;
                    bl2 = true;
                    break block13;
                }
                catch (n9 n96) {
                    throw m44.a("i", (Object)n96, (long)-2211722720381602017L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    int v() {
        return this.a;
    }

    int N(int n10, int n11, int n12) {
        int n13;
        block13: {
            block14: {
                int n14;
                block15: {
                    nc nc2;
                    block16: {
                        int n15;
                        block19: {
                            int n16;
                            block20: {
                                int n17;
                                int n18;
                                CallSite callSite;
                                int n19;
                                int n20;
                                int n21;
                                long l10;
                                block22: {
                                    l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)n12 << 48 >>> 48) ^ b;
                                    long l11 = l10 ^ 0x3C6F14D0C7BFL;
                                    n21 = (int)(l11 >>> 32);
                                    n20 = (int)(l11 << 32 >>> 48);
                                    n19 = (int)(l11 << 48 >>> 48);
                                    callSite = m44.a("n", (long)-973624307854997844L, (long)l10);
                                    try {
                                        n13 = this.L;
                                        if (callSite != null) break block13;
                                        if (n13 != -1) break block14;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("n", (Object)n92, (long)-900366971143297584L, (long)l10);
                                    }
                                    n14 = this.i();
                                    try {
                                        try {
                                            nc2 = this;
                                            if (callSite != null) break block15;
                                            if (nc2.R == null) break block16;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("n", (Object)n93, (long)-900366971143297584L, (long)l10);
                                        }
                                        nc2 = this;
                                        if (callSite != null) break block15;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("n", (Object)n94, (long)-900366971143297584L, (long)l10);
                                    }
                                    n17 = n18 = nc2.R.size();
                                    if (n12 < 0) break block22;
                                    if (n17 <= 0) break block16;
                                    n17 = (int)n;
                                }
                                int n22 = n17;
                                int n23 = 0;
                                while (n23 < n18) {
                                    CallSite callSite2;
                                    block17: {
                                        block18: {
                                            block21: {
                                                nc nc3 = (nc)this.R.get(n23);
                                                int n24 = nc3.N(n21, n20, n19);
                                                try {
                                                    try {
                                                        callSite2 = callSite;
                                                        if (n11 <= 0) break block17;
                                                        if (callSite2 != null) break block18;
                                                        n15 = n24;
                                                        if (n11 < 0) break block19;
                                                        n16 = n22;
                                                        if (callSite != null) break block20;
                                                    }
                                                    catch (n9 n95) {
                                                        throw m44.a("n", (Object)n95, (long)-900366971143297584L, (long)l10);
                                                    }
                                                    if (n15 >= n16) break block21;
                                                }
                                                catch (n9 n96) {
                                                    throw m44.a("n", (Object)n96, (long)-900366971143297584L, (long)l10);
                                                }
                                                n22 = n24;
                                            }
                                            ++n23;
                                        }
                                        callSite2 = callSite;
                                    }
                                    if (callSite2 == null) continue;
                                }
                                n15 = n14;
                                if (n10 < 0) break block19;
                                n16 = n22;
                            }
                            n15 = n15 + n16;
                        }
                        n14 = n15;
                    }
                    nc2 = this;
                }
                nc2.L = n14;
            }
            n13 = this.L;
        }
        return n13;
    }

    void u(Object[] objectArray) {
        CallSite callSite;
        nc nc2;
        block4: {
            long l10;
            block5: {
                nc2 = (nc)objectArray[0];
                l10 = (Long)objectArray[1];
                l10 = b ^ l10;
                CallSite callSite2 = m44.a("l", (long)-8064103630380768058L, (long)l10);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)-8505592772063135158L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)-7932192846018574406L, (long)l10);
                    }
                    m44.a("p", (Object)this, new ArrayList(), (long)-8505592772063135158L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)-7932192846018574406L, (long)l10);
                }
            }
            callSite = m44.a("r", (Object)this, (long)-8505592772063135158L, (long)l10);
        }
        callSite.add(nc2);
    }

    void V(Object[] objectArray) {
        nc nc2 = (nc)objectArray[0];
        this.f = nc2;
    }

    void D(Object[] objectArray) {
        CallSite callSite;
        nc nc2;
        block4: {
            long l10;
            block5: {
                l10 = (Long)objectArray[0];
                nc2 = (nc)objectArray[1];
                l10 = b ^ l10;
                CallSite callSite2 = m44.a("m", (long)-2790103376300397161L, (long)l10);
                try {
                    try {
                        callSite = m44.a("s", (Object)this, (long)-2654220083030732292L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-2829893237057827093L, (long)l10);
                    }
                    m44.a("q", (Object)this, new ArrayList(), (long)-2654220083030732292L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-2829893237057827093L, (long)l10);
                }
            }
            callSite = m44.a("s", (Object)this, (long)-2654220083030732292L, (long)l10);
        }
        callSite.add(nc2);
    }

    List E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return Collections.unmodifiableList(m44.a("s", (Object)this, (long)8299927865479200915L, (long)l10));
    }

    nc J(long l10) {
        block5: {
            List list;
            block4: {
                l10 = b ^ l10;
                CallSite callSite = m44.a("i", (long)-2061619533101656141L, (long)l10);
                try {
                    try {
                        list = this.O;
                        if (callSite != null) break block4;
                        if (list == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-2117224890176867121L, (long)l10);
                    }
                    list = this.O.get(this.O.size() - 1);
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-2117224890176867121L, (long)l10);
                }
            }
            return (nc)((Object)list);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static BitSet I(nc var0, int var1_1, ot var2_2, nc var3_3, Map var4_4, Set var5_5, char var6_6, Map var7_7, e var8_8, short var9_9) {
        block18: {
            block19: {
                block24: {
                    block20: {
                        block23: {
                            block21: {
                                block22: {
                                    v0 = var10_10 = ((long)var1_1 << 32 | (long)var6_6 << 48 >>> 32 | (long)var9_9 << 48 >>> 48) ^ nc.b;
                                    var12_11 = v0 ^ 100824784712595L;
                                    var14_12 = v0 ^ 65062006531686L;
                                    var16_13 = m44.a("n", (long)-6961225271371076684L, (long)var10_10);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v1 = var5_5.contains(var3_3);
                                                        if (var16_13 != null) break block18;
                                                        if (!v1) break block19;
                                                    }
                                                    catch (n9 v2) {
                                                        throw m44.a("n", (Object)v2, (long)-7018439299856594744L, (long)var10_10);
                                                    }
                                                    v3 = var2_2.S;
                                                    v4 = var3_3.v();
                                                    if (var16_13 != null) break block20;
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("n", (Object)v5, (long)-7018439299856594744L, (long)var10_10);
                                                }
                                                if (var1_1 <= 0) break block20;
                                                if (v3.get(v4)) {
                                                }
                                                ** GOTO lbl65
                                            }
                                            catch (n9 v6) {
                                                throw m44.a("n", (Object)v6, (long)-7018439299856594744L, (long)var10_10);
                                            }
                                            v7 = var4_4;
                                            if (var1_1 <= 0) break block21;
                                            v8 = var3_3;
                                            if (var16_13 != null) break block22;
                                        }
                                        catch (n9 v9) {
                                            throw m44.a("n", (Object)v9, (long)-7018439299856594744L, (long)var10_10);
                                        }
                                        if (!v7.containsKey(v8)) {
                                        }
                                        ** GOTO lbl49
                                    }
                                    catch (n9 v10) {
                                        throw m44.a("n", (Object)v10, (long)-7018439299856594744L, (long)var10_10);
                                    }
                                    var17_14 = new o8(var3_3, var0, var14_12);
                                    try {
                                        var4_4.put(var3_3, var17_14);
                                        v11 /* !! */  = var16_13;
                                        if (var1_1 >= 0) {
                                            if (v11 /* !! */  == null) break block23;
                                        }
                                        ** GOTO lbl62
lbl49:
                                        // 2 sources

                                        v12 = var4_4;
                                        v8 = var3_3;
                                    }
                                    catch (n9 v13) {
                                        throw m44.a("n", (Object)v13, (long)-7018439299856594744L, (long)var10_10);
                                    }
                                }
                                v7 = v12.get(v8);
                            }
                            var17_14 = (o8)v7;
                            m44.a("q", (Object)var17_14, (Object)new Object[]{var0}, (long)-9054100895244618190L, (long)var10_10);
                        }
                        try {
                            block25: {
                                v11 /* !! */  = var16_13;
lbl62:
                                // 2 sources

                                if (var9_9 > 0) {
                                    if (v11 /* !! */  == null) break block24;
                                }
                                break block25;
lbl65:
                                // 2 sources

                                var3_3.L(var12_11, var0);
                                v11 /* !! */  = var7_7.get(var3_3);
                            }
                            v3 = ((ot)v11 /* !! */ ).S;
                            v4 = var0.v();
                        }
                        catch (n9 v14) {
                            throw m44.a("n", (Object)v14, (long)-7018439299856594744L, (long)var10_10);
                        }
                    }
                    v3.set(v4);
                }
                return null;
            }
            v1 = var5_5.add(var3_3);
        }
        var3_3.L(var12_11, var0);
        var17_15 = (BitSet)var2_2.S.clone();
        var17_15.set(var0.v());
        var17_15.set(var3_3.v());
        return var17_15;
    }

    void b(nc nc2, long l10) {
        block10: {
            List list;
            CallSite callSite;
            block8: {
                block9: {
                    l10 = b ^ l10;
                    callSite = m44.a("j", (long)220915076347721664L, (long)l10);
                    try {
                        try {
                            list = this.O;
                            if (callSite != null) break block8;
                            if (list != null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("j", (Object)n92, (long)210936685597791420L, (long)l10);
                        }
                        this.O = new ArrayList();
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)n93, (long)210936685597791420L, (long)l10);
                    }
                }
                list = this.O;
            }
            try {
                boolean bl2;
                try {
                    bl2 = list.contains(nc2);
                    if (callSite != null || bl2) break block10;
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)n94, (long)210936685597791420L, (long)l10);
                }
                bl2 = this.O.add(nc2);
            }
            catch (n9 n95) {
                throw m44.a("j", (Object)n95, (long)210936685597791420L, (long)l10);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public int U(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    boolean T(Object[] objectArray) {
        boolean bl2;
        block8: {
            block7: {
                String string;
                CallSite callSite;
                long l10;
                block6: {
                    l10 = (Long)objectArray[0];
                    l10 = b ^ l10;
                    callSite = m44.a("k", (long)626560355047570529L, (long)l10);
                    try {
                        try {
                            string = this.B;
                            if (callSite != null) break block6;
                            if (string == null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)669982505212813085L, (long)l10);
                        }
                        string = this.B;
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)n93, (long)669982505212813085L, (long)l10);
                    }
                }
                try {
                    bl2 = string.equals(nc.b("i", (int)8884, (long)(0x61B0E1B9F2346AA5L ^ l10)));
                    if (callSite != null) break block8;
                    if (!bl2) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("k", (Object)n94, (long)669982505212813085L, (long)l10);
                }
                bl2 = true;
                break block8;
            }
            bl2 = false;
        }
        return bl2;
    }

    boolean P(long l10) {
        int n10;
        block8: {
            block7: {
                List list;
                CallSite callSite;
                block6: {
                    l10 = b ^ l10;
                    callSite = m44.a("o", (long)-4017776562981094163L, (long)l10);
                    try {
                        try {
                            list = this.O;
                            if (callSite != null) break block6;
                            if (list == null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("o", (Object)n92, (long)-3909052613625946223L, (long)l10);
                        }
                        list = this.O;
                    }
                    catch (n9 n93) {
                        throw m44.a("o", (Object)n93, (long)-3909052613625946223L, (long)l10);
                    }
                }
                try {
                    n10 = list.size();
                    if (callSite != null) break block8;
                    if (n10 <= 0) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("o", (Object)n94, (long)-3909052613625946223L, (long)l10);
                }
                n10 = 1;
                break block8;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    private boolean f(Object[] objectArray) {
        int n10;
        BitSet bitSet;
        Object[] objectArray2;
        long l10;
        BitSet bitSet2;
        long l11;
        nc nc2;
        block18: {
            block19: {
                nc2 = (nc)objectArray[0];
                l11 = (Long)objectArray[1];
                bitSet2 = (BitSet)objectArray[2];
                l10 = (l11 = b ^ l11) ^ 0x3C6F14D0C7BFL;
                objectArray2 = m44.a("i", (long)4148850855339150659L, (long)l11);
                try {
                    try {
                        bitSet = bitSet2;
                        n10 = nc2.v();
                        if (objectArray2 != null) break block18;
                        if (!bitSet.get(n10)) break block19;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)4066206223489084991L, (long)l11);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)4066206223489084991L, (long)l11);
                }
            }
            bitSet = bitSet2;
            n10 = nc2.v();
        }
        try {
            bitSet.set(n10);
            if (nc2.R == null) {
                return false;
            }
        }
        catch (n9 n94) {
            throw m44.a("i", (Object)n94, (long)4066206223489084991L, (long)l11);
        }
        Object object = false;
        int n11 = nc2.R.size();
        int n12 = 0;
        while (n12 < n11) {
            Object[] objectArray3;
            block23: {
                block24: {
                    Object[] objectArray4;
                    nc nc3;
                    nc nc4;
                    block20: {
                        block21: {
                            nc nc5;
                            block22: {
                                nc5 = (nc)nc2.R.get(n12);
                                try {
                                    try {
                                        nc4 = nc5;
                                        nc3 = this;
                                        objectArray4 = objectArray2;
                                        if (l11 < 0L) break block20;
                                        if (objectArray4 != null) break block21;
                                        if (nc4 != nc3) break block22;
                                    }
                                    catch (n9 n95) {
                                        throw m44.a("i", (Object)n95, (long)4066206223489084991L, (long)l11);
                                    }
                                    return true;
                                }
                                catch (n9 n96) {
                                    throw m44.a("i", (Object)n96, (long)4066206223489084991L, (long)l11);
                                }
                            }
                            nc4 = this;
                            nc3 = nc5;
                        }
                        Object[] objectArray5 = new Object[3];
                        objectArray5[2] = bitSet2;
                        objectArray4 = objectArray5;
                        objectArray5[1] = l10;
                    }
                    objectArray4[0] = nc3;
                    object = m44.a("h", (Object)nc4, (Object)objectArray4, (long)2605447891089866199L, (long)l11);
                    try {
                        block25: {
                            try {
                                try {
                                    objectArray3 = objectArray2;
                                    if (l11 < 0L) break block23;
                                    if (objectArray3 != null) break block24;
                                    if (!object) break block25;
                                }
                                catch (n9 n97) {
                                    throw m44.a("i", (Object)n97, (long)4066206223489084991L, (long)l11);
                                }
                                if (objectArray2 == null) break;
                            }
                            catch (n9 n98) {
                                throw m44.a("i", (Object)n98, (long)4066206223489084991L, (long)l11);
                            }
                        }
                        ++n12;
                    }
                    catch (n9 n99) {
                        throw m44.a("i", (Object)n99, (long)4066206223489084991L, (long)l11);
                    }
                }
                objectArray3 = objectArray2;
            }
            if (objectArray3 == null) continue;
        }
        return object;
    }

    nc Z() {
        return this.w;
    }

    List U() {
        return this.R;
    }

    public nc N(Object[] objectArray) {
        block9: {
            List list;
            block10: {
                CallSite callSite;
                long l10;
                block8: {
                    l10 = (Long)objectArray[0];
                    l10 = b ^ l10;
                    callSite = m44.a("o", (long)-7456347112404521899L, (long)l10);
                    try {
                        try {
                            list = this.O;
                            if (callSite != null) break block8;
                            if (list == null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("o", (Object)n92, (long)-7388147398989443287L, (long)l10);
                        }
                        list = this.O;
                    }
                    catch (n9 n93) {
                        throw m44.a("o", (Object)n93, (long)-7388147398989443287L, (long)l10);
                    }
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (list.size() <= 0) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("o", (Object)n94, (long)-7388147398989443287L, (long)l10);
                    }
                    list = this.O.get(0);
                }
                catch (n9 n95) {
                    throw m44.a("o", (Object)n95, (long)-7388147398989443287L, (long)l10);
                }
            }
            return (nc)((Object)list);
        }
        return null;
    }

    public nc F(Object[] objectArray) {
        return this.f;
    }

    boolean o(Object[] objectArray) {
        boolean bl2;
        block8: {
            block7: {
                String string;
                CallSite callSite;
                long l10;
                block6: {
                    l10 = (Long)objectArray[0];
                    l10 = b ^ l10;
                    callSite = m44.a("j", (long)3366663858235628136L, (long)l10);
                    try {
                        try {
                            string = this.B;
                            if (callSite != null) break block6;
                            if (string == null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("j", (Object)n92, (long)3406258616881887508L, (long)l10);
                        }
                        string = this.B;
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)n93, (long)3406258616881887508L, (long)l10);
                    }
                }
                try {
                    bl2 = string.startsWith((String)((Object)nc.b("i", (int)5112, (long)(0x163387A70210FDE1L ^ l10))));
                    if (callSite != null) break block8;
                    if (!bl2) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)n94, (long)3406258616881887508L, (long)l10);
                }
                bl2 = true;
                break block8;
            }
            bl2 = false;
        }
        return bl2;
    }

    public int P() {
        return this.i;
    }

    public Enumeration F(long l10) {
        block5: {
            List list;
            block4: {
                l10 = b ^ l10;
                CallSite callSite = m44.a("o", (long)-6438536522782256523L, (long)l10);
                try {
                    try {
                        list = this.O;
                        if (callSite != null) break block4;
                        if (list == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-6388349482505654007L, (long)l10);
                    }
                    list = this.O;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-6388349482505654007L, (long)l10);
                }
            }
            return Collections.enumeration(list);
        }
        return null;
    }

    void D(int n10) {
        this.K = n10;
    }

    public int i() {
        return this.i - this.K + 1;
    }

    List x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return m44.a("s", (Object)this, (long)5486082681718916852L, (long)l10);
    }

    public int F() {
        return this.K;
    }

    /*
     * Exception decompiling
     */
    void w(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[DOLOOP]], but top level block is 14[SIMPLE_IF_TAKEN]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    oz Q(long l10, e e10) {
        oz oz2;
        l10 = b ^ l10;
        int n10 = this.i;
        while ((oz2 = (oz)e10.get(n10)).o() && --n10 > this.K) {
        }
        return oz2;
    }

    /*
     * Exception decompiling
     */
    public oz S(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    void K(nc nc2, long l10) {
        List list;
        block4: {
            block5: {
                l10 = b ^ l10;
                CallSite callSite = m44.a("l", (long)1262896391966287190L, (long)l10);
                try {
                    try {
                        list = this.p;
                        if (callSite != null) break block4;
                        if (list != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)1187553135398848042L, (long)l10);
                    }
                    this.p = new ArrayList();
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)1187553135398848042L, (long)l10);
                }
            }
            list = this.p;
        }
        list.add(nc2);
    }

    public static int B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return (int)m44.a("j", (long)2293287313903384805L, (long)l10);
    }

    List M(long l10) {
        block5: {
            List list;
            block4: {
                l10 = b ^ l10;
                CallSite callSite = m44.a("i", (long)-6772403522057775405L, (long)l10);
                try {
                    try {
                        list = this.R;
                        if (callSite != null) break block4;
                        if (list == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-6629815165125118545L, (long)l10);
                    }
                    list = Collections.unmodifiableList(this.R);
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-6629815165125118545L, (long)l10);
                }
            }
            return list;
        }
        return null;
    }

    boolean u(Object[] objectArray) {
        nc nc2 = (nc)objectArray[0];
        long l10 = (Long)objectArray[1];
        BitSet bitSet = (BitSet)objectArray[2];
        long l11 = (l10 = b ^ l10) ^ 0xDEC76080BC0L;
        m44.a("q", (Object)bitSet, (long)-1208879087704925205L, (long)l10);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = bitSet;
        objectArray2[1] = l11;
        objectArray2[0] = nc2;
        CallSite callSite = m44.a("o", (Object)this, (Object)objectArray2, (long)-1704796566492319320L, (long)l10);
        return (boolean)callSite;
    }

    boolean R(long l10) {
        int n10;
        block8: {
            block7: {
                List list;
                CallSite callSite;
                block6: {
                    l10 = b ^ l10;
                    callSite = m44.a("m", (long)-9000478419362678841L, (long)l10);
                    try {
                        try {
                            list = this.R;
                            if (callSite != null) break block6;
                            if (list == null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("m", (Object)n92, (long)-9013290225940753221L, (long)l10);
                        }
                        list = this.R;
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)n93, (long)-9013290225940753221L, (long)l10);
                    }
                }
                try {
                    n10 = list.size();
                    if (callSite != null) break block8;
                    if (n10 <= 0) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)n94, (long)-9013290225940753221L, (long)l10);
                }
                n10 = 1;
                break block8;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static void C(int var0, ot var1_1, short var2_2, Map var3_3, short var4_4, Set var5_5, Map var6_6, e var7_7) {
        block43: {
            block44: {
                v0 = var8_8 = ((long)var0 << 32 | (long)var2_2 << 48 >>> 32 | (long)var4_4 << 48 >>> 48) ^ nc.b;
                v1 = v0 ^ 97343642972014L;
                var10_9 = (int)(v1 >>> 32);
                var11_10 = v1 << 32 >>> 32;
                v2 = v0 ^ 6920962859373L;
                var13_11 = (int)(v2 >>> 32);
                var14_12 = (int)(v2 << 32 >>> 48);
                var15_13 = (int)(v2 << 48 >>> 48);
                var17_14 = new LinkedList<Object>();
                var16_15 = m44.a("l", (long)4158784375903538534L, (long)var8_8);
                var18_16 = new LinkedList<Object>();
                var19_17 = var1_1.B;
                try {
                    v3 = var19_17;
                    if (var16_15 != null) break block43;
                    if (v3.O == null) break block44;
                }
                catch (n9 v4) {
                    throw m44.a("l", (Object)v4, (long)4056411206514159130L, (long)var8_8);
                }
                var20_18 = var19_17.O.size();
                var21_21 = 0;
                while (var21_21 < var20_18) {
                    block46: {
                        block47: {
                            block45: {
                                var22_23 = (nc)var19_17.O.get(var21_21);
                                var23_24 = new lq0(var19_17, var10_9, var11_10, var22_23);
                                try {
                                    try {
                                        try {
                                            v5 = var16_15;
                                            if (var2_2 >= 0) ** GOTO lbl52
                                            if (v5 != null) break block45;
                                            v6 = var21_21;
                                            if (var4_4 <= 0 && var16_15 == null) {
                                            }
                                            ** GOTO lbl74
                                        }
                                        catch (n9 v7) {
                                            throw m44.a("l", (Object)v7, (long)4056411206514159130L, (long)var8_8);
                                        }
                                        if (v6 == var20_18 - 1) {
                                        }
                                        ** GOTO lbl54
                                    }
                                    catch (n9 v8) {
                                        throw m44.a("l", (Object)v8, (long)4056411206514159130L, (long)var8_8);
                                    }
                                    var17_14.addFirst(var23_24);
                                }
                                catch (n9 v9) {
                                    throw m44.a("l", (Object)v9, (long)4056411206514159130L, (long)var8_8);
                                }
                            }
                            try {
                                v5 = var16_15;
lbl52:
                                // 2 sources

                                if (var4_4 > 0) break block46;
                                if (v5 == null) break block47;
lbl54:
                                // 2 sources

                                var18_16.addFirst(var23_24);
                            }
                            catch (n9 v10) {
                                throw m44.a("l", (Object)v10, (long)4056411206514159130L, (long)var8_8);
                            }
                        }
                        ++var21_21;
                        v5 = var16_15;
                    }
                    if (v5 == null) continue;
                }
            }
            v11 = var19_17;
            if (var4_4 >= 0) ** GOTO lbl116
            v3 = v11.w;
        }
        if (v3 != null) {
            var20_19 = new lq0(var19_17, var10_9, var11_10, var19_17.w);
            var17_14.addFirst(var20_19);
        }
        do {
            block53: {
                block54: {
                    block51: {
                        block52: {
                            block50: {
                                block49: {
                                    v6 = var17_14.isEmpty();
lbl74:
                                    // 2 sources

                                    try {
                                        try {
                                            block48: {
                                                try {
                                                    try {
                                                        try {
                                                            if (var0 >= 0) {
                                                                if (v6 == 0) break block48;
                                                                v6 = var18_16.isEmpty();
                                                            }
                                                            if (var16_15 != null) break block49;
                                                        }
                                                        catch (n9 v12) {
                                                            throw m44.a("l", (Object)v12, (long)4056411206514159130L, (long)var8_8);
                                                        }
                                                        if (var16_15 != null) break block49;
                                                    }
                                                    catch (n9 v13) {
                                                        throw m44.a("l", (Object)v13, (long)4056411206514159130L, (long)var8_8);
                                                    }
                                                    if (v6 != 0) break;
                                                }
                                                catch (n9 v14) {
                                                    throw m44.a("l", (Object)v14, (long)4056411206514159130L, (long)var8_8);
                                                }
                                            }
lbl95:
                                            // 2 sources

                                            while (true) {
                                                v11 = var17_14;
                                                if (var16_15 != null) break block50;
                                                break;
                                            }
                                        }
                                        catch (n9 v15) {
                                            throw m44.a("l", (Object)v15, (long)4056411206514159130L, (long)var8_8);
                                        }
                                        v6 = v11.isEmpty();
                                    }
                                    catch (n9 v16) {
                                        throw m44.a("l", (Object)v16, (long)4056411206514159130L, (long)var8_8);
                                    }
                                }
                                if (v6 != 0) ** GOTO lbl112
                                var20_20 = (lq0)var17_14.remove();
                                try {
                                    v17 = var16_15;
                                    if (var4_4 >= 0) break block51;
                                    if (v17 == null) break block52;
lbl112:
                                    // 2 sources

                                    v11 = var18_16.remove();
                                }
                                catch (n9 v18) {
                                    throw m44.a("l", (Object)v18, (long)4056411206514159130L, (long)var8_8);
                                }
                            }
                            var20_20 = (lq0)v11;
                        }
                        v17 = var20_20.S();
                    }
                    var21_22 = (nc)v17;
                    var22_23 = (nc)var20_20.D();
                    var23_24 = (ot)var6_6.get(var21_22);
                    var24_25 = nc.I(var21_22, var13_11, (ot)var23_24, var22_23, var3_3, var5_5, (char)var14_12, var6_6, var7_7, (short)var15_13);
                    if (var24_25 == null) continue;
                    var25_26 = new ot(var22_23, var24_25);
                    var26_27 = var6_6.put(var22_23, var25_26);
                    try {
                        v19 = var22_23;
                        if (var16_15 != null) break block53;
                        if (v19.O == null) break block54;
                    }
                    catch (n9 v20) {
                        throw m44.a("l", (Object)v20, (long)4056411206514159130L, (long)var8_8);
                    }
                    var27_28 = var22_23.O.size();
                    var28_30 = 0;
                    block33: while (true) {
                        v21 = var28_30;
                        v22 = var27_28;
                        while (v21 < v22) {
                            block56: {
                                block55: {
                                    var29_31 = (nc)var22_23.O.get(var28_30);
                                    var30_32 = new lq0(var22_23, var10_9, var11_10, var29_31);
                                    try {
                                        v23 = var16_15;
                                        if (var0 >= 0) {
                                            if (v23 != null) break block55;
                                            v21 = var28_30;
                                            v22 = var27_28 - 1;
                                            if (var16_15 != null || var0 <= 0) continue;
                                        }
                                        ** GOTO lbl164
                                    }
                                    catch (n9 v24) {
                                        throw m44.a("l", (Object)v24, (long)4056411206514159130L, (long)var8_8);
                                    }
                                    try {
                                        if (v21 == v22) {
                                            var17_14.addFirst(var30_32);
                                        }
                                        ** GOTO lbl166
                                    }
                                    catch (n9 v25) {
                                        throw m44.a("l", (Object)v25, (long)4056411206514159130L, (long)var8_8);
                                    }
                                }
                                try {
                                    v23 = var16_15;
lbl164:
                                    // 2 sources

                                    if (var2_2 >= 0) continue block33;
                                    if (v23 == null) break block56;
lbl166:
                                    // 2 sources

                                    var18_16.addFirst(var30_32);
                                }
                                catch (n9 v26) {
                                    throw m44.a("l", (Object)v26, (long)4056411206514159130L, (long)var8_8);
                                }
                            }
                            ++var28_30;
                            v23 = var16_15;
                            if (v23 == null) continue block33;
                        }
                        break;
                    }
                }
                v19 = var22_23.w;
            }
            if (v19 == null) continue;
            var27_29 = new lq0(var22_23, var10_9, var11_10, var22_23.w);
            var17_14.addFirst(var27_29);
        } while (var16_15 == null);
        ** while (var4_4 > 0)
lbl183:
        // 1 sources

    }

    public void h() {
        this.R = null;
        this.O = null;
        this.w = null;
        this.f = null;
        this.p = null;
    }

    boolean L(Object[] objectArray) {
        int n10;
        block8: {
            block7: {
                CallSite callSite;
                CallSite callSite2;
                long l10;
                block6: {
                    l10 = (Long)objectArray[0];
                    l10 = b ^ l10;
                    callSite2 = m44.a("o", (long)2872626742754005773L, (long)l10);
                    try {
                        try {
                            callSite = m44.a("q", (Object)this, (long)2715743056600117094L, (long)l10);
                            if (callSite2 != null) break block6;
                            if (callSite == null) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("o", (Object)n92, (long)2747233251960533105L, (long)l10);
                        }
                        callSite = m44.a("q", (Object)this, (long)2715743056600117094L, (long)l10);
                    }
                    catch (n9 n93) {
                        throw m44.a("o", (Object)n93, (long)2747233251960533105L, (long)l10);
                    }
                }
                try {
                    n10 = callSite.size();
                    if (callSite2 != null) break block8;
                    if (n10 <= 0) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("o", (Object)n94, (long)2747233251960533105L, (long)l10);
                }
                n10 = 1;
                break block8;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    public nc u(Object[] objectArray) {
        block9: {
            List list;
            block10: {
                CallSite callSite;
                long l10;
                block8: {
                    l10 = (Long)objectArray[0];
                    l10 = b ^ l10;
                    callSite = m44.a("o", (long)-8345787261428795139L, (long)l10);
                    try {
                        try {
                            list = this.O;
                            if (callSite != null) break block8;
                            if (list == null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("o", (Object)n92, (long)-8227950697273746559L, (long)l10);
                        }
                        list = this.O;
                    }
                    catch (n9 n93) {
                        throw m44.a("o", (Object)n93, (long)-8227950697273746559L, (long)l10);
                    }
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (list.size() != 2) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("o", (Object)n94, (long)-8227950697273746559L, (long)l10);
                    }
                    list = this.O.get(1);
                }
                catch (n9 n95) {
                    throw m44.a("o", (Object)n95, (long)-8227950697273746559L, (long)l10);
                }
            }
            return (nc)((Object)list);
        }
        return null;
    }

    Enumeration a(Object[] objectArray) {
        block5: {
            List list;
            block4: {
                long l10 = (Long)objectArray[0];
                l10 = b ^ l10;
                CallSite callSite = m44.a("l", (long)-1707167369118671714L, (long)l10);
                try {
                    try {
                        list = this.p;
                        if (callSite != null) break block4;
                        if (list == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)-1606852089687343134L, (long)l10);
                    }
                    list = this.p;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)-1606852089687343134L, (long)l10);
                }
            }
            return Collections.enumeration(list);
        }
        return new lmm();
    }

    void G(int n10) {
        this.i = n10;
    }

    void L(long l10, nc nc2) {
        block10: {
            List list;
            CallSite callSite;
            block8: {
                block9: {
                    l10 = b ^ l10;
                    callSite = m44.a("j", (long)7730610882025004952L, (long)l10);
                    try {
                        try {
                            list = this.R;
                            if (callSite != null) break block8;
                            if (list != null) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("j", (Object)n92, (long)7689079943397047524L, (long)l10);
                        }
                        this.R = new ArrayList();
                    }
                    catch (n9 n93) {
                        throw m44.a("j", (Object)n93, (long)7689079943397047524L, (long)l10);
                    }
                }
                list = this.R;
            }
            try {
                boolean bl2;
                try {
                    bl2 = list.contains(nc2);
                    if (callSite != null || bl2) break block10;
                }
                catch (n9 n94) {
                    throw m44.a("j", (Object)n94, (long)7689079943397047524L, (long)l10);
                }
                bl2 = this.R.add(nc2);
            }
            catch (n9 n95) {
                throw m44.a("j", (Object)n95, (long)7689079943397047524L, (long)l10);
            }
        }
    }

    public int m(nc nc2, long l10) {
        int n10;
        block11: {
            int n11;
            block9: {
                CallSite callSite;
                block10: {
                    l10 = b ^ l10;
                    callSite = m44.a("o", (long)3570732371767969117L, (long)l10);
                    try {
                        try {
                            n10 = this.K;
                            n11 = nc2.K;
                            if (callSite != null) break block9;
                            if (n10 >= n11) break block10;
                        }
                        catch (n9 n92) {
                            throw m44.a("o", (Object)n92, (long)3490420515568068129L, (long)l10);
                        }
                        return -1;
                    }
                    catch (n9 n93) {
                        throw m44.a("o", (Object)n93, (long)3490420515568068129L, (long)l10);
                    }
                }
                try {
                    n10 = this.K;
                    if (callSite != null) break block11;
                    n11 = nc2.K;
                }
                catch (n9 n94) {
                    throw m44.a("o", (Object)n94, (long)3490420515568068129L, (long)l10);
                }
            }
            try {
                if (n10 == n11) {
                    return 0;
                }
            }
            catch (n9 n95) {
                throw m44.a("o", (Object)n95, (long)3490420515568068129L, (long)l10);
            }
            n10 = 1;
        }
        return n10;
    }

    public String V() {
        return this.B;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = prr.a(-5161008688385376676L, -2452054543076485921L, MethodHandles.lookup().lookupClass()).a(228364312962715L);
        l = new HashMap(13);
        long l10 = b ^ 0x6628B991E3C1L;
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
        String[] stringArray = new String[3];
        int n10 = 0;
        String string = "Xe\u00bd\u00eaU\u00a6\u0081\u00efY\u000e\u0085fa\u0084\r[\u0090s\n\u00f0\u00d0r\u00ccL\u00aa\u00a3FVJ|\u0091\u00a4\u0010\u0082R\u001e\u00a47*\u0010\u0099t\u0016\u00ac\"1\u00d25\u00f0(\u009c1.Vq3#b\u0005\u0010\u0091\u009e\u00c7wd\u0001F\u000b\u00d5\u00f5\u00107\u00ce\u00d1\t*\u00f0Lc\u00d4\u00cf:1\u00bb7\u00c6\u008f\u00fb\u009a\u00b7";
        int n11 = "Xe\u00bd\u00eaU\u00a6\u0081\u00efY\u000e\u0085fa\u0084\r[\u0090s\n\u00f0\u00d0r\u00ccL\u00aa\u00a3FVJ|\u0091\u00a4\u0010\u0082R\u001e\u00a47*\u0010\u0099t\u0016\u00ac\"1\u00d25\u00f0(\u009c1.Vq3#b\u0005\u0010\u0091\u009e\u00c7wd\u0001F\u000b\u00d5\u00f5\u00107\u00ce\u00d1\t*\u00f0Lc\u00d4\u00cf:1\u00bb7\u00c6\u008f\u00fb\u009a\u00b7".length();
        int n12 = 32;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = nc.b(byArray3).intern();
            if ((n13 += n12) >= n11) break;
            n12 = string.charAt(n13);
        }
        j = stringArray;
        k = new String[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n15 = 1;
        while (true) {
            if (n15 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = -925978564550488036L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                n = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n15] = (byte)(l10 << n15 * 8 >>> 56);
            ++n15;
        }
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x53DC;
        if (k[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])l.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/nc", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = j[n11].getBytes("ISO-8859-1");
            nc.k[n11] = nc.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = nc.b(n10, l10);
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
            throw new RuntimeException("com/zelix/nc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(nc.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

