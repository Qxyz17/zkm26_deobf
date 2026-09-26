/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class ob
implements Serializable {
    Object N;
    Object O;
    Object V;
    Object J;
    private static final long a = prr.a((long)-1671777146826398977L, (long)-168805647793076376L, MethodHandles.lookup().lookupClass()).a(137065067134773L);

    public Object G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("q", (Object)this, (long)6921336659093506190L, (long)l);
    }

    public Object p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("t", (Object)this, (long)-7305344592452492750L, (long)l);
    }

    public ob(Object object, long l, Object object2, Object object3, Object object4) {
        l = a ^ l;
        m44.a("r", (Object)this, (Object)object, (long)1843340946348847383L, (long)l);
        m44.a("r", (Object)this, (Object)object2, (long)511722938506608566L, (long)l);
        m44.a("r", (Object)this, (Object)object3, (long)394754065511658628L, (long)l);
        m44.a("r", (Object)this, (Object)object4, (long)1820789337717062643L, (long)l);
    }

    public int hashCode() {
        CallSite callSite;
        int n;
        long l;
        block11: {
            block12: {
                CallSite callSite2;
                block9: {
                    block10: {
                        block7: {
                            block8: {
                                l = a ^ 0x2E082D74C2C6L;
                                n = 0;
                                callSite2 = m44.a("o", (long)-6029979366473616793L, (long)l);
                                try {
                                    callSite = m44.a("q", (Object)this, (long)-5943185858877160186L, (long)l);
                                    if (callSite2 != null) break block7;
                                    if (callSite == null) break block8;
                                }
                                catch (n9 n92) {
                                    throw m44.a("o", (Object)((Object)n92), (long)-6043182037118731917L, (long)l);
                                }
                                n ^= m44.a("q", (Object)this, (long)-5943185858877160186L, (long)l).hashCode();
                            }
                            callSite = m44.a("q", (Object)this, (long)-5545247887105700953L, (long)l);
                        }
                        try {
                            if (callSite2 != null) break block9;
                            if (callSite == null) break block10;
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)((Object)n93), (long)-6043182037118731917L, (long)l);
                        }
                        n ^= m44.a("q", (Object)this, (long)-5545247887105700953L, (long)l).hashCode();
                    }
                    callSite = m44.a("q", (Object)this, (long)-5662395155995950955L, (long)l);
                }
                try {
                    if (callSite2 != null) break block11;
                    if (callSite == null) break block12;
                }
                catch (n9 n94) {
                    throw m44.a("o", (Object)((Object)n94), (long)-6043182037118731917L, (long)l);
                }
                n ^= m44.a("q", (Object)this, (long)-5662395155995950955L, (long)l).hashCode();
            }
            callSite = m44.a("q", (Object)this, (long)-5956593929481678878L, (long)l);
        }
        if (callSite != null) {
            n ^= m44.a("q", (Object)this, (long)-5956593929481678878L, (long)l).hashCode();
        }
        return n;
    }

    public Object v(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("p", (Object)this, (long)6238871324327736355L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public boolean equals(Object var1_1) {
        block83: {
            block84: {
                block106: {
                    block89: {
                        block103: {
                            block105: {
                                block104: {
                                    block101: {
                                        block98: {
                                            block100: {
                                                block99: {
                                                    block96: {
                                                        block93: {
                                                            block95: {
                                                                block94: {
                                                                    block91: {
                                                                        block87: {
                                                                            block90: {
                                                                                block88: {
                                                                                    block85: {
                                                                                        var2_2 = ob.a ^ 85977206617526L;
                                                                                        var4_3 = m44.a("o", (long)-7268434259792591593L, (long)var2_2);
                                                                                        try {
                                                                                            v0 = var1_1 instanceof ob;
                                                                                            if (var4_3 != null) break block83;
                                                                                            if (!v0) break block84;
                                                                                        }
                                                                                        catch (n9 v1) {
                                                                                            throw m44.a("o", (Object)v1, (long)-7254685684384199165L, (long)var2_2);
                                                                                        }
                                                                                        var5_4 = (ob)var1_1;
                                                                                        try {
                                                                                            block86: {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v2 = m44.a("q", (Object)this, (long)-7280649575701958026L, (long)var2_2);
                                                                                                            if (var4_3 != null) break block85;
                                                                                                            if (v2 != null) break block86;
                                                                                                        }
                                                                                                        catch (n9 v3) {
                                                                                                            throw m44.a("o", (Object)v3, (long)-7254685684384199165L, (long)var2_2);
                                                                                                        }
                                                                                                        v2 = m44.a("q", (Object)var5_4, (long)-7280649575701958026L, (long)var2_2);
                                                                                                        if (var4_3 != null) break block87;
                                                                                                    }
                                                                                                    catch (n9 v4) {
                                                                                                        throw m44.a("o", (Object)v4, (long)-7254685684384199165L, (long)var2_2);
                                                                                                    }
                                                                                                    if (v2 != null) {
                                                                                                    }
                                                                                                    ** GOTO lbl68
                                                                                                }
                                                                                                catch (n9 v5) {
                                                                                                    throw m44.a("o", (Object)v5, (long)-7254685684384199165L, (long)var2_2);
                                                                                                }
                                                                                            }
                                                                                            v2 = m44.a("q", (Object)this, (long)-7280649575701958026L, (long)var2_2);
                                                                                        }
                                                                                        catch (n9 v6) {
                                                                                            throw m44.a("o", (Object)v6, (long)-7254685684384199165L, (long)var2_2);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var4_3 != null) break block88;
                                                                                            if (v2 == null) break block89;
                                                                                        }
                                                                                        catch (n9 v7) {
                                                                                            throw m44.a("o", (Object)v7, (long)-7254685684384199165L, (long)var2_2);
                                                                                        }
                                                                                        v2 = m44.a("q", (Object)var5_4, (long)-7280649575701958026L, (long)var2_2);
                                                                                    }
                                                                                    catch (n9 v8) {
                                                                                        throw m44.a("o", (Object)v8, (long)-7254685684384199165L, (long)var2_2);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var4_3 != null) break block90;
                                                                                        if (v2 == null) break block89;
                                                                                    }
                                                                                    catch (n9 v9) {
                                                                                        throw m44.a("o", (Object)v9, (long)-7254685684384199165L, (long)var2_2);
                                                                                    }
                                                                                    v2 = m44.a("q", (Object)this, (long)-7280649575701958026L, (long)var2_2);
                                                                                }
                                                                                catch (n9 v10) {
                                                                                    throw m44.a("o", (Object)v10, (long)-7254685684384199165L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var4_3 != null) break block87;
                                                                                    if (!v2.equals(m44.a("q", (Object)var5_4, (long)-7280649575701958026L, (long)var2_2))) break block89;
                                                                                }
                                                                                catch (n9 v11) {
                                                                                    throw m44.a("o", (Object)v11, (long)-7254685684384199165L, (long)var2_2);
                                                                                }
lbl68:
                                                                                // 2 sources

                                                                                v2 = m44.a("q", (Object)this, (long)-8900464888447796009L, (long)var2_2);
                                                                            }
                                                                            catch (n9 v12) {
                                                                                throw m44.a("o", (Object)v12, (long)-7254685684384199165L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block92: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (var4_3 != null) break block91;
                                                                                            if (v2 != null) break block92;
                                                                                        }
                                                                                        catch (n9 v13) {
                                                                                            throw m44.a("o", (Object)v13, (long)-7254685684384199165L, (long)var2_2);
                                                                                        }
                                                                                        v2 = m44.a("q", (Object)var5_4, (long)-8900464888447796009L, (long)var2_2);
                                                                                        if (var4_3 != null) break block93;
                                                                                    }
                                                                                    catch (n9 v14) {
                                                                                        throw m44.a("o", (Object)v14, (long)-7254685684384199165L, (long)var2_2);
                                                                                    }
                                                                                    if (v2 != null) {
                                                                                    }
                                                                                    ** GOTO lbl129
                                                                                }
                                                                                catch (n9 v15) {
                                                                                    throw m44.a("o", (Object)v15, (long)-7254685684384199165L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            v2 = m44.a("q", (Object)this, (long)-8900464888447796009L, (long)var2_2);
                                                                        }
                                                                        catch (n9 v16) {
                                                                            throw m44.a("o", (Object)v16, (long)-7254685684384199165L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var4_3 != null) break block94;
                                                                            if (v2 == null) break block89;
                                                                        }
                                                                        catch (n9 v17) {
                                                                            throw m44.a("o", (Object)v17, (long)-7254685684384199165L, (long)var2_2);
                                                                        }
                                                                        v2 = m44.a("q", (Object)var5_4, (long)-8900464888447796009L, (long)var2_2);
                                                                    }
                                                                    catch (n9 v18) {
                                                                        throw m44.a("o", (Object)v18, (long)-7254685684384199165L, (long)var2_2);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var4_3 != null) break block95;
                                                                        if (v2 == null) break block89;
                                                                    }
                                                                    catch (n9 v19) {
                                                                        throw m44.a("o", (Object)v19, (long)-7254685684384199165L, (long)var2_2);
                                                                    }
                                                                    v2 = m44.a("q", (Object)this, (long)-8900464888447796009L, (long)var2_2);
                                                                }
                                                                catch (n9 v20) {
                                                                    throw m44.a("o", (Object)v20, (long)-7254685684384199165L, (long)var2_2);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var4_3 != null) break block93;
                                                                    if (!v2.equals(m44.a("q", (Object)var5_4, (long)-8900464888447796009L, (long)var2_2))) break block89;
                                                                }
                                                                catch (n9 v21) {
                                                                    throw m44.a("o", (Object)v21, (long)-7254685684384199165L, (long)var2_2);
                                                                }
lbl129:
                                                                // 2 sources

                                                                v2 = m44.a("q", (Object)this, (long)-8783354487548463131L, (long)var2_2);
                                                            }
                                                            catch (n9 v22) {
                                                                throw m44.a("o", (Object)v22, (long)-7254685684384199165L, (long)var2_2);
                                                            }
                                                        }
                                                        try {
                                                            block97: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var4_3 != null) break block96;
                                                                            if (v2 != null) break block97;
                                                                        }
                                                                        catch (n9 v23) {
                                                                            throw m44.a("o", (Object)v23, (long)-7254685684384199165L, (long)var2_2);
                                                                        }
                                                                        v2 = m44.a("q", (Object)var5_4, (long)-8783354487548463131L, (long)var2_2);
                                                                        if (var4_3 != null) break block98;
                                                                    }
                                                                    catch (n9 v24) {
                                                                        throw m44.a("o", (Object)v24, (long)-7254685684384199165L, (long)var2_2);
                                                                    }
                                                                    if (v2 != null) {
                                                                    }
                                                                    ** GOTO lbl190
                                                                }
                                                                catch (n9 v25) {
                                                                    throw m44.a("o", (Object)v25, (long)-7254685684384199165L, (long)var2_2);
                                                                }
                                                            }
                                                            v2 = m44.a("q", (Object)this, (long)-8783354487548463131L, (long)var2_2);
                                                        }
                                                        catch (n9 v26) {
                                                            throw m44.a("o", (Object)v26, (long)-7254685684384199165L, (long)var2_2);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (var4_3 != null) break block99;
                                                            if (v2 == null) break block89;
                                                        }
                                                        catch (n9 v27) {
                                                            throw m44.a("o", (Object)v27, (long)-7254685684384199165L, (long)var2_2);
                                                        }
                                                        v2 = m44.a("q", (Object)var5_4, (long)-8783354487548463131L, (long)var2_2);
                                                    }
                                                    catch (n9 v28) {
                                                        throw m44.a("o", (Object)v28, (long)-7254685684384199165L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var4_3 != null) break block100;
                                                        if (v2 == null) break block89;
                                                    }
                                                    catch (n9 v29) {
                                                        throw m44.a("o", (Object)v29, (long)-7254685684384199165L, (long)var2_2);
                                                    }
                                                    v2 = m44.a("q", (Object)this, (long)-8783354487548463131L, (long)var2_2);
                                                }
                                                catch (n9 v30) {
                                                    throw m44.a("o", (Object)v30, (long)-7254685684384199165L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var4_3 != null) break block98;
                                                    if (!v2.equals(m44.a("q", (Object)var5_4, (long)-8783354487548463131L, (long)var2_2))) break block89;
                                                }
                                                catch (n9 v31) {
                                                    throw m44.a("o", (Object)v31, (long)-7254685684384199165L, (long)var2_2);
                                                }
lbl190:
                                                // 2 sources

                                                v2 = m44.a("q", (Object)this, (long)-7339304594065835886L, (long)var2_2);
                                            }
                                            catch (n9 v32) {
                                                throw m44.a("o", (Object)v32, (long)-7254685684384199165L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            block102: {
                                                try {
                                                    try {
                                                        try {
                                                            if (var4_3 != null) break block101;
                                                            if (v2 != null) break block102;
                                                        }
                                                        catch (n9 v33) {
                                                            throw m44.a("o", (Object)v33, (long)-7254685684384199165L, (long)var2_2);
                                                        }
                                                        v2 = m44.a("q", (Object)var5_4, (long)-7339304594065835886L, (long)var2_2);
                                                        if (var4_3 != null) break block101;
                                                    }
                                                    catch (n9 v34) {
                                                        throw m44.a("o", (Object)v34, (long)-7254685684384199165L, (long)var2_2);
                                                    }
                                                    if (v2 == null) break block103;
                                                }
                                                catch (n9 v35) {
                                                    throw m44.a("o", (Object)v35, (long)-7254685684384199165L, (long)var2_2);
                                                }
                                            }
                                            v2 = m44.a("q", (Object)this, (long)-7339304594065835886L, (long)var2_2);
                                        }
                                        catch (n9 v36) {
                                            throw m44.a("o", (Object)v36, (long)-7254685684384199165L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var4_3 != null) break block104;
                                            if (v2 == null) break block89;
                                        }
                                        catch (n9 v37) {
                                            throw m44.a("o", (Object)v37, (long)-7254685684384199165L, (long)var2_2);
                                        }
                                        v2 = m44.a("q", (Object)var5_4, (long)-7339304594065835886L, (long)var2_2);
                                    }
                                    catch (n9 v38) {
                                        throw m44.a("o", (Object)v38, (long)-7254685684384199165L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        if (var4_3 != null) break block105;
                                        if (v2 == null) break block89;
                                    }
                                    catch (n9 v39) {
                                        throw m44.a("o", (Object)v39, (long)-7254685684384199165L, (long)var2_2);
                                    }
                                    v2 = m44.a("q", (Object)this, (long)-7339304594065835886L, (long)var2_2);
                                }
                                catch (n9 v40) {
                                    throw m44.a("o", (Object)v40, (long)-7254685684384199165L, (long)var2_2);
                                }
                            }
                            try {
                                v41 = v2.equals(m44.a("q", (Object)var5_4, (long)-7339304594065835886L, (long)var2_2));
                                if (var4_3 != null) break block106;
                                if (!v41) break block89;
                            }
                            catch (n9 v42) {
                                throw m44.a("o", (Object)v42, (long)-7254685684384199165L, (long)var2_2);
                            }
                        }
                        v41 = true;
                        break block106;
                    }
                    v41 = false;
                }
                var6_5 = v41;
                return var6_5;
            }
            v0 = false;
        }
        return v0;
    }

    public Object e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)this, (long)8110781606296928625L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
