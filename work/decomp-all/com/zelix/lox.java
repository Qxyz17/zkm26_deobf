/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.loc;
import com.zelix.loe;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class lox
extends loc {
    private final int F;
    private final String r;
    private static final long b = prr.a((long)-6582496491087842112L, (long)-4332444234725100013L, MethodHandles.lookup().lookupClass()).a(31150583461768L);

    public final String Q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("p", (Object)((Object)this), (long)-5442522438348925445L, (long)l);
    }

    public boolean o(Object[] objectArray) {
        loe loe2 = (loe)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = b ^ l) ^ 0x5CEDC5F4085L;
        return this.equals((Object)loe2.M(l2));
    }

    /*
     * Unable to fully structure code
     */
    public lox(String var1_1, long var2_2, String var4_3) {
        block9: {
            block10: {
                block8: {
                    var2_2 = lox.b ^ var2_2;
                    super(var1_1, var4_3);
                    var6_4 = var4_3.substring(this.d.length());
                    var5_5 = m44.a("k", (long)1450834475917931630L, (long)var2_2);
                    try {
                        try {
                            if (var5_5 != null) break block8;
                            if (var6_4.length() == 0) {
                            }
                            ** GOTO lbl21
                        }
                        catch (n9 v0) {
                            throw m44.a("k", (Object)v0, (long)1147324190968019750L, (long)var2_2);
                        }
                        this.r = null;
                    }
                    catch (n9 v1) {
                        throw m44.a("k", (Object)v1, (long)1147324190968019750L, (long)var2_2);
                    }
                }
                try {
                    if (var2_2 < 0L) break block9;
                    if (var5_5 == null) break block10;
lbl21:
                    // 2 sources

                    this.r = var6_4.intern();
                }
                catch (n9 v2) {
                    throw m44.a("k", (Object)v2, (long)1147324190968019750L, (long)var2_2);
                }
            }
            this.F = (var1_1 + this.d).hashCode();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String string;
        String string2;
        long l;
        block20: {
            lox lox2;
            lox lox3;
            CallSite callSite;
            block19: {
                Object object2;
                block17: {
                    block18: {
                        block16: {
                            l = b ^ 0x5B81ED6CFA9BL;
                            callSite = m44.a("h", (long)3999576541848360909L, (long)l);
                            try {
                                object2 = object;
                                if (callSite != null) break block16;
                                if (object2 == null) return false;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)3192808789753288837L, (long)l);
                            }
                            object2 = object;
                        }
                        try {
                            try {
                                if (callSite != null) break block17;
                                if (object2 instanceof lox) break block18;
                                return false;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)((Object)n93), (long)3192808789753288837L, (long)l);
                            }
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)((Object)n94), (long)3192808789753288837L, (long)l);
                        }
                    }
                    object2 = object;
                }
                lox3 = (lox)((Object)object2);
                try {
                    try {
                        lox2 = this;
                        if (callSite != null) break block19;
                        if (lox2.F != lox3.F) return false;
                    }
                    catch (n9 n95) {
                        throw m44.a("h", (Object)((Object)n95), (long)3192808789753288837L, (long)l);
                    }
                    lox2 = this;
                }
                catch (n9 n96) {
                    throw m44.a("h", (Object)((Object)n96), (long)3192808789753288837L, (long)l);
                }
            }
            try {
                try {
                    string2 = lox2.O;
                    string = lox3.O;
                    if (callSite != null) break block20;
                    if (string2 != string) return false;
                }
                catch (n9 n97) {
                    throw m44.a("h", (Object)((Object)n97), (long)3192808789753288837L, (long)l);
                }
                string2 = this.d;
                string = lox3.d;
            }
            catch (n9 n98) {
                throw m44.a("h", (Object)((Object)n98), (long)3192808789753288837L, (long)l);
            }
        }
        try {
            if (string2 != string) return false;
            return true;
        }
        catch (n9 n99) {
            throw m44.a("h", (Object)((Object)n99), (long)3192808789753288837L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    public lox(char var1_1, String var2_2, String var3_3, String var4_4, int var5_5, short var6_6) {
        block11: {
            block12: {
                block9: {
                    var7_7 = ((long)var1_1 << 48 | (long)var5_5 << 32 >>> 16 | (long)var6_6 << 48 >>> 48) ^ lox.b;
                    v0 = m44.a("j", (long)-2257652604329819929L, (long)var7_7);
                    super(var2_2, var3_3);
                    var9_8 = v0;
                    try {
                        v1 = var4_4;
                        if (var9_8 != null) break block9;
                        if (v1 != null) {
                        }
                        ** GOTO lbl32
                    }
                    catch (n9 v2) {
                        throw m44.a("j", (Object)v2, (long)-331771122569080913L, (long)var7_7);
                    }
                    v1 = var4_4;
                }
                try {
                    try {
                        block10: {
                            try {
                                if (v1.length() != 0) break block10;
                                this.r = null;
                                if (var6_6 < 0) break block11;
                                if (var9_8 == null) break block12;
                            }
                            catch (n9 v3) {
                                throw m44.a("j", (Object)v3, (long)-331771122569080913L, (long)var7_7);
                            }
                        }
                        this.r = var4_4.intern();
                        if (var5_5 <= 0) break block11;
                        if (var9_8 == null) break block12;
                    }
                    catch (n9 v4) {
                        throw m44.a("j", (Object)v4, (long)-331771122569080913L, (long)var7_7);
                    }
lbl32:
                    // 2 sources

                    this.r = null;
                }
                catch (n9 v5) {
                    throw m44.a("j", (Object)v5, (long)-331771122569080913L, (long)var7_7);
                }
            }
            this.F = (var2_2 + var3_3).hashCode();
        }
    }

    public int hashCode() {
        return this.F;
    }

    public boolean p(Object[] objectArray) {
        boolean bl;
        long l = (Long)objectArray[0];
        l = b ^ l;
        try {
            bl = m44.a("u", (Object)((Object)this), (long)-5335301897571625866L, (long)l) != null;
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)((Object)n92), (long)-5704801547777227746L, (long)l);
        }
        return bl;
    }

    private static n9 b(n9 n92) {
        return n92;
    }
}
