/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.kx;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.x8;
import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

public class ba
extends kx
implements ni {
    private int d;
    private static final long a = prr.a((long)576292017992739658L, (long)7819408476690946931L, MethodHandles.lookup().lookupClass()).a(109638237504262L);

    public void W(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        HashMap hashMap = (HashMap)objectArray[3];
        HashMap hashMap2 = (HashMap)objectArray[4];
    }

    /*
     * Unable to fully structure code
     */
    ba(_4 var1_1, int var2_2, String var3_3, long var4_4, h1 var6_5, l6q var7_6) {
        block16: {
            v0 = var4_4 = ba.a ^ var4_4;
            var8_7 = v0 ^ 20179139122838L;
            var10_8 = v0 ^ 46560685130601L;
            super(var1_1, var2_2, var10_8, var3_3, var6_5, var7_6);
            m44.a("w", (Object)this, (byte[])new byte[this.W], (long)2630277027284258975L, (long)var4_4);
            v1 = m44.a("k", (long)4497669160860274466L, (long)var4_4);
            var6_5.read((byte[])m44.a("u", (Object)this, (long)2630277027284258975L, (long)var4_4));
            v2 = new Object[3];
            v2[2] = var8_7;
            v2[1] = false;
            v2[0] = m44.a("u", (Object)this, (long)2630277027284258975L, (long)var4_4);
            var13_9 = m44.a("k", (Object)v2, (long)2659915984814528545L, (long)var4_4);
            var14_10 = null;
            var12_11 = v1;
            m44.a("w", (Object)this, (int)var13_9.readUnsignedShort(), (long)2483744870190695221L, (long)var4_4);
            if (var13_9 == null) break block16;
            if (var14_10 == null) ** GOTO lbl29
            try {
                m44.a("t", (Object)var13_9, (long)4092085764881397217L, (long)var4_4);
            }
            catch (Throwable var15_12) {
                try {
                    m44.a("t", (Object)var14_10, (Object)var15_12, (long)2822491701667404627L, (long)var4_4);
                    if (var4_4 < 0L || var12_11 != false) ** GOTO lbl62
lbl29:
                    // 2 sources

                    m44.a("t", (Object)var13_9, (long)4092085764881397217L, (long)var4_4);
                }
                catch (Throwable v3) {
                    throw m44.a("k", (Object)v3, (long)4548737545895068614L, (long)var4_4);
                }
            }
            catch (Throwable var15_13) {
                try {
                    var14_10 = var15_13;
                    throw var15_13;
                }
                catch (Throwable var16_14) {
                    block18: {
                        block17: {
                            try {
                                if (var13_9 == null) break block17;
                                if (var14_10 != null) {
                                }
                                ** GOTO lbl54
                            }
                            catch (Throwable v4) {
                                throw m44.a("k", (Object)v4, (long)4548737545895068614L, (long)var4_4);
                            }
                            try {
                                m44.a("t", (Object)var13_9, (long)4092085764881397217L, (long)var4_4);
                            }
                            catch (Throwable var17_15) {
                                try {
                                    v5 = var14_10;
                                    if (var4_4 < 0L) break block18;
                                    m44.a("t", (Object)v5, (Object)var17_15, (long)2822491701667404627L, (long)var4_4);
                                    if (var12_11 != false) break block17;
lbl54:
                                    // 2 sources

                                    m44.a("t", (Object)var13_9, (long)4092085764881397217L, (long)var4_4);
                                }
                                catch (Throwable v6) {
                                    throw m44.a("k", (Object)v6, (long)4548737545895068614L, (long)var4_4);
                                }
                            }
                        }
                        v5 = var16_14;
                    }
                    throw v5;
                }
            }
        }
    }

    public void q(x8 x82, long l, x8 x83) {
        long l2 = l ^ 0L;
        super.q(x82, l2, x83);
    }

    /*
     * Unable to fully structure code
     */
    public void N(Object[] var1_1) {
        block9: {
            block8: {
                var4_2 = (DataOutputStream)var1_1[0];
                var3_3 = (Map)var1_1[1];
                var5_4 = (Long)var1_1[2];
                var2_5 = (lqu)var1_1[3];
                var7_6 = var5_4 ^ 62442288127650L;
                v0 = m44.a("k", (long)1680553024964027930L, (long)var5_4);
                v1 = new Object[2];
                v1[1] = var4_2;
                v1[0] = var7_6;
                super.c(v1);
                var9_7 = v0;
                try {
                    try {
                        if (var9_7 == false) break block8;
                        if (m44.a("u", (Object)this, (long)1009829788873835733L, (long)var5_4) != false) {
                        }
                        ** GOTO lbl30
                    }
                    catch (n9 v2) {
                        throw m44.a("k", (Object)v2, (long)1592080627684928254L, (long)var5_4);
                    }
                    var4_2.writeShort((int)m44.a("u", (Object)this, (long)810754152183654925L, (long)var5_4));
                }
                catch (n9 v3) {
                    throw m44.a("k", (Object)v3, (long)1592080627684928254L, (long)var5_4);
                }
            }
            try {
                if (var5_4 <= 0L || var9_7 != false) break block9;
lbl30:
                // 2 sources

                var4_2.write((byte[])m44.a("u", (Object)this, (long)988812052272789927L, (long)var5_4));
            }
            catch (n9 v4) {
                throw m44.a("k", (Object)v4, (long)1592080627684928254L, (long)var5_4);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void c(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (Long)var1_1[0];
                var4_3 = (DataOutputStream)var1_1[1];
                var5_4 = var2_2 ^ 0L;
                v0 = m44.a("i", (long)1272493964096652623L, (long)var2_2);
                v1 = new Object[2];
                v1[1] = var4_3;
                v1[0] = var5_4;
                super.c(v1);
                var7_5 = v0;
                try {
                    try {
                        if (var7_5 != false) break block8;
                        if (m44.a("w", (Object)this, (long)1198408428474194551L, (long)var2_2) != false) {
                        }
                        ** GOTO lbl28
                    }
                    catch (n9 v2) {
                        throw m44.a("i", (Object)v2, (long)628828494789866588L, (long)var2_2);
                    }
                    var4_3.writeShort((int)m44.a("w", (Object)this, (long)1576919926117201071L, (long)var2_2));
                }
                catch (n9 v3) {
                    throw m44.a("i", (Object)v3, (long)628828494789866588L, (long)var2_2);
                }
            }
            try {
                if (var2_2 <= 0L || var7_5 == false) break block9;
lbl28:
                // 2 sources

                var4_3.write((byte[])m44.a("w", (Object)this, (long)1376640891870979845L, (long)var2_2));
            }
            catch (n9 v4) {
                throw m44.a("i", (Object)v4, (long)628828494789866588L, (long)var2_2);
            }
        }
    }

    void z(gu gu2, long l) {
        long l2 = l ^ 0x6DE1DADD9981L;
        this.b.e(l2, gu2, (Object)this, (Object)this.H());
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}
