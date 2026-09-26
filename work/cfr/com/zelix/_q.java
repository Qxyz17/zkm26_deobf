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

public class _q
implements Serializable {
    private Object I;
    private Object A;
    private Object m;
    private static final long a = prr.a(-3409976127566577327L, -8529439197022806614L, MethodHandles.lookup().lookupClass()).a(179962382872868L);

    public _q(Object object, Object object2, long l10, Object object3) {
        l10 = a ^ l10;
        m44.a("w", (Object)this, (Object)object, (long)777399680591540754L, (long)l10);
        m44.a("w", (Object)this, (Object)object2, (long)1416244594364481962L, (long)l10);
        m44.a("w", (Object)this, (Object)object3, (long)599240307464501465L, (long)l10);
    }

    public int hashCode() {
        CallSite callSite;
        int n10;
        long l10;
        block7: {
            block8: {
                CallSite callSite2;
                block5: {
                    block6: {
                        l10 = a ^ 0x292D623978B8L;
                        n10 = 0;
                        callSite2 = m44.a("n", (long)-6428761392881026818L, (long)l10);
                        try {
                            callSite = m44.a("p", (Object)this, (long)-4918882071050681497L, (long)l10);
                            if (callSite2 != null) break block5;
                            if (callSite == null) break block6;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)-4885886703256315718L, (long)l10);
                        }
                        n10 ^= m44.a("p", (Object)this, (long)-4918882071050681497L, (long)l10).hashCode();
                    }
                    callSite = m44.a("p", (Object)this, (long)-6714026187808821025L, (long)l10);
                }
                try {
                    if (callSite2 != null) break block7;
                    if (callSite == null) break block8;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-4885886703256315718L, (long)l10);
                }
                n10 ^= m44.a("p", (Object)this, (long)-6714026187808821025L, (long)l10).hashCode();
            }
            callSite = m44.a("p", (Object)this, (long)-5105512050234111572L, (long)l10);
        }
        if (callSite != null) {
            n10 ^= m44.a("p", (Object)this, (long)-5105512050234111572L, (long)l10).hashCode();
        }
        return n10;
    }

    public Object v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("r", (Object)this, (long)3402419356941377470L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public boolean equals(Object var1_1) {
        block62: {
            block63: {
                block80: {
                    block68: {
                        block77: {
                            block79: {
                                block78: {
                                    block75: {
                                        block72: {
                                            block74: {
                                                block73: {
                                                    block70: {
                                                        block66: {
                                                            block69: {
                                                                block67: {
                                                                    block64: {
                                                                        var2_2 = _q.a ^ 35991216918864L;
                                                                        var4_3 = m44.a("n", (long)-3521680749828845290L, (long)var2_2);
                                                                        try {
                                                                            v0 = var1_1 instanceof _q;
                                                                            if (var4_3 != null) break block62;
                                                                            if (!v0) break block63;
                                                                        }
                                                                        catch (n9 v1) {
                                                                            throw m44.a("n", (Object)v1, (long)-3037151863652732590L, (long)var2_2);
                                                                        }
                                                                        var5_4 = (_q)var1_1;
                                                                        try {
                                                                            block65: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v2 = m44.a("p", (Object)this, (long)-3290839092484969841L, (long)var2_2);
                                                                                            if (var4_3 != null) break block64;
                                                                                            if (v2 != null) break block65;
                                                                                        }
                                                                                        catch (n9 v3) {
                                                                                            throw m44.a("n", (Object)v3, (long)-3037151863652732590L, (long)var2_2);
                                                                                        }
                                                                                        v2 = m44.a("p", (Object)var5_4, (long)-3290839092484969841L, (long)var2_2);
                                                                                        if (var4_3 != null) break block66;
                                                                                    }
                                                                                    catch (n9 v4) {
                                                                                        throw m44.a("n", (Object)v4, (long)-3037151863652732590L, (long)var2_2);
                                                                                    }
                                                                                    if (v2 != null) {
                                                                                    }
                                                                                    ** GOTO lbl68
                                                                                }
                                                                                catch (n9 v5) {
                                                                                    throw m44.a("n", (Object)v5, (long)-3037151863652732590L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            v2 = m44.a("p", (Object)this, (long)-3290839092484969841L, (long)var2_2);
                                                                        }
                                                                        catch (n9 v6) {
                                                                            throw m44.a("n", (Object)v6, (long)-3037151863652732590L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var4_3 != null) break block67;
                                                                            if (v2 == null) break block68;
                                                                        }
                                                                        catch (n9 v7) {
                                                                            throw m44.a("n", (Object)v7, (long)-3037151863652732590L, (long)var2_2);
                                                                        }
                                                                        v2 = m44.a("p", (Object)var5_4, (long)-3290839092484969841L, (long)var2_2);
                                                                    }
                                                                    catch (n9 v8) {
                                                                        throw m44.a("n", (Object)v8, (long)-3037151863652732590L, (long)var2_2);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var4_3 != null) break block69;
                                                                        if (v2 == null) break block68;
                                                                    }
                                                                    catch (n9 v9) {
                                                                        throw m44.a("n", (Object)v9, (long)-3037151863652732590L, (long)var2_2);
                                                                    }
                                                                    v2 = m44.a("p", (Object)this, (long)-3290839092484969841L, (long)var2_2);
                                                                }
                                                                catch (n9 v10) {
                                                                    throw m44.a("n", (Object)v10, (long)-3037151863652732590L, (long)var2_2);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var4_3 != null) break block66;
                                                                    if (!v2.equals(m44.a("p", (Object)var5_4, (long)-3290839092484969841L, (long)var2_2))) break block68;
                                                                }
                                                                catch (n9 v11) {
                                                                    throw m44.a("n", (Object)v11, (long)-3037151863652732590L, (long)var2_2);
                                                                }
lbl68:
                                                                // 2 sources

                                                                v2 = m44.a("p", (Object)this, (long)-3802457178808886985L, (long)var2_2);
                                                            }
                                                            catch (n9 v12) {
                                                                throw m44.a("n", (Object)v12, (long)-3037151863652732590L, (long)var2_2);
                                                            }
                                                        }
                                                        try {
                                                            block71: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var4_3 != null) break block70;
                                                                            if (v2 != null) break block71;
                                                                        }
                                                                        catch (n9 v13) {
                                                                            throw m44.a("n", (Object)v13, (long)-3037151863652732590L, (long)var2_2);
                                                                        }
                                                                        v2 = m44.a("p", (Object)var5_4, (long)-3802457178808886985L, (long)var2_2);
                                                                        if (var4_3 != null) break block72;
                                                                    }
                                                                    catch (n9 v14) {
                                                                        throw m44.a("n", (Object)v14, (long)-3037151863652732590L, (long)var2_2);
                                                                    }
                                                                    if (v2 != null) {
                                                                    }
                                                                    ** GOTO lbl129
                                                                }
                                                                catch (n9 v15) {
                                                                    throw m44.a("n", (Object)v15, (long)-3037151863652732590L, (long)var2_2);
                                                                }
                                                            }
                                                            v2 = m44.a("p", (Object)this, (long)-3802457178808886985L, (long)var2_2);
                                                        }
                                                        catch (n9 v16) {
                                                            throw m44.a("n", (Object)v16, (long)-3037151863652732590L, (long)var2_2);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (var4_3 != null) break block73;
                                                            if (v2 == null) break block68;
                                                        }
                                                        catch (n9 v17) {
                                                            throw m44.a("n", (Object)v17, (long)-3037151863652732590L, (long)var2_2);
                                                        }
                                                        v2 = m44.a("p", (Object)var5_4, (long)-3802457178808886985L, (long)var2_2);
                                                    }
                                                    catch (n9 v18) {
                                                        throw m44.a("n", (Object)v18, (long)-3037151863652732590L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var4_3 != null) break block74;
                                                        if (v2 == null) break block68;
                                                    }
                                                    catch (n9 v19) {
                                                        throw m44.a("n", (Object)v19, (long)-3037151863652732590L, (long)var2_2);
                                                    }
                                                    v2 = m44.a("p", (Object)this, (long)-3802457178808886985L, (long)var2_2);
                                                }
                                                catch (n9 v20) {
                                                    throw m44.a("n", (Object)v20, (long)-3037151863652732590L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var4_3 != null) break block72;
                                                    if (!v2.equals(m44.a("p", (Object)var5_4, (long)-3802457178808886985L, (long)var2_2))) break block68;
                                                }
                                                catch (n9 v21) {
                                                    throw m44.a("n", (Object)v21, (long)-3037151863652732590L, (long)var2_2);
                                                }
lbl129:
                                                // 2 sources

                                                v2 = m44.a("p", (Object)this, (long)-3400892537200992188L, (long)var2_2);
                                            }
                                            catch (n9 v22) {
                                                throw m44.a("n", (Object)v22, (long)-3037151863652732590L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            block76: {
                                                try {
                                                    try {
                                                        try {
                                                            if (var4_3 != null) break block75;
                                                            if (v2 != null) break block76;
                                                        }
                                                        catch (n9 v23) {
                                                            throw m44.a("n", (Object)v23, (long)-3037151863652732590L, (long)var2_2);
                                                        }
                                                        v2 = m44.a("p", (Object)var5_4, (long)-3400892537200992188L, (long)var2_2);
                                                        if (var4_3 != null) break block75;
                                                    }
                                                    catch (n9 v24) {
                                                        throw m44.a("n", (Object)v24, (long)-3037151863652732590L, (long)var2_2);
                                                    }
                                                    if (v2 == null) break block77;
                                                }
                                                catch (n9 v25) {
                                                    throw m44.a("n", (Object)v25, (long)-3037151863652732590L, (long)var2_2);
                                                }
                                            }
                                            v2 = m44.a("p", (Object)this, (long)-3400892537200992188L, (long)var2_2);
                                        }
                                        catch (n9 v26) {
                                            throw m44.a("n", (Object)v26, (long)-3037151863652732590L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var4_3 != null) break block78;
                                            if (v2 == null) break block68;
                                        }
                                        catch (n9 v27) {
                                            throw m44.a("n", (Object)v27, (long)-3037151863652732590L, (long)var2_2);
                                        }
                                        v2 = m44.a("p", (Object)var5_4, (long)-3400892537200992188L, (long)var2_2);
                                    }
                                    catch (n9 v28) {
                                        throw m44.a("n", (Object)v28, (long)-3037151863652732590L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        if (var4_3 != null) break block79;
                                        if (v2 == null) break block68;
                                    }
                                    catch (n9 v29) {
                                        throw m44.a("n", (Object)v29, (long)-3037151863652732590L, (long)var2_2);
                                    }
                                    v2 = m44.a("p", (Object)this, (long)-3400892537200992188L, (long)var2_2);
                                }
                                catch (n9 v30) {
                                    throw m44.a("n", (Object)v30, (long)-3037151863652732590L, (long)var2_2);
                                }
                            }
                            try {
                                v31 = v2.equals(m44.a("p", (Object)var5_4, (long)-3400892537200992188L, (long)var2_2));
                                if (var4_3 != null) break block80;
                                if (!v31) break block68;
                            }
                            catch (n9 v32) {
                                throw m44.a("n", (Object)v32, (long)-3037151863652732590L, (long)var2_2);
                            }
                        }
                        v31 = true;
                        break block80;
                    }
                    v31 = false;
                }
                var6_5 = v31;
                return var6_5;
            }
            v0 = false;
        }
        return v0;
    }

    public Object u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)-6209070136450139175L, (long)l10);
    }

    public Object b(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("p", (Object)this, (long)-4065445893538578609L, (long)l10);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

