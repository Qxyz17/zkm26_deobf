/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.t7;
import java.io.File;
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
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class ZKM_PG_Task
extends Task {
    private StringBuilder n;
    private File Z;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    /*
     * Unable to fully structure code
     */
    public void execute() {
        block23: {
            block29: {
                block28: {
                    v0 = var1_1 = ZKM_PG_Task.a ^ 131257563082971L;
                    var3_2 = v0 ^ 120701615542231L;
                    v1 = v0 ^ 81661895050680L;
                    var5_3 = (int)(v1 >>> 32);
                    var6_4 = (int)(v1 << 32 >>> 48);
                    var7_5 = (int)(v1 << 48 >>> 48);
                    var8_6 = v0 ^ 82230098716424L;
                    var10_7 = v0 ^ 89138553145205L;
                    var12_8 = m44.a("k", (long)-7903492841324558118L, (long)var1_1);
                    v2 = this;
                    if (var12_8 == false) ** GOTO lbl40
                    if (m44.a("u", (Object)v2, (long)-8609191253969306602L, (long)var1_1) != null) break block23;
                    break block28;
                    catch (Exception v3) {
                        throw m44.a("k", (Object)v3, (long)-8547345173359940752L, (long)var1_1);
                    }
                }
                v4 = m44.a("u", (Object)this, (long)-8529642016294356849L, (long)var1_1).length();
                if (var12_8 == false) ** GOTO lbl47
                break block29;
                catch (Exception v5) {
                    throw m44.a("k", (Object)v5, (long)-8547345173359940752L, (long)var1_1);
                }
            }
            try {
                block30: {
                    if (v4 != 0) break block23;
                    break block30;
                    catch (Exception v6) {
                        throw m44.a("k", (Object)v6, (long)-8547345173359940752L, (long)var1_1);
                    }
                }
                throw new BuildException((String)ZKM_PG_Task.a("d", (int)32236, (long)(8923117970746143171L ^ var1_1)));
            }
            catch (Exception v7) {
                throw m44.a("k", (Object)v7, (long)-8547345173359940752L, (long)var1_1);
            }
        }
        try {
            block27: {
                block24: {
                    block26: {
                        block25: {
                            block31: {
                                block32: {
                                    v2 = this;
lbl40:
                                    // 2 sources

                                    try {
                                        if (var12_8 == false) break block24;
                                        v4 = m44.a("u", (Object)v2, (long)-8529642016294356849L, (long)var1_1).length();
                                    }
                                    catch (Exception v8) {
                                        throw m44.a("k", (Object)v8, (long)-8547345173359940752L, (long)var1_1);
                                    }
lbl47:
                                    // 3 sources

                                    if (v4 <= 0) ** GOTO lbl98
                                    v9 = this;
                                    if (var12_8 == false) break block31;
                                    break block32;
                                    catch (Exception v10) {
                                        throw m44.a("k", (Object)v10, (long)-8547345173359940752L, (long)var1_1);
                                    }
                                }
                                try {
                                    block33: {
                                        if (m44.a("u", (Object)v9, (long)-8609191253969306602L, (long)var1_1) != null) break block25;
                                        break block33;
                                        catch (Exception v11) {
                                            throw m44.a("k", (Object)v11, (long)-8547345173359940752L, (long)var1_1);
                                        }
                                    }
                                    v9 = this;
                                }
                                catch (Exception v12) {
                                    throw m44.a("k", (Object)v12, (long)-8547345173359940752L, (long)var1_1);
                                }
                            }
                            var14_9 = m44.a("u", (Object)v9, (long)-8529642016294356849L, (long)var1_1).toString();
                            if (var12_8 != false) break block26;
                        }
                        var15_10 = new StringBuilder();
                        var15_10.append(m44.a("u", (Object)this, (long)-8529642016294356849L, (long)var1_1).toString());
                        var15_10.append((String)m44.a("o", (long)-7855684790991238673L, (long)var1_1));
                        v13 = new Object[2];
                        v13[1] = m44.a("u", (Object)this, (long)-8609191253969306602L, (long)var1_1);
                        v13[0] = var8_6;
                        var15_10.append((String)m44.a("k", (Object)v13, (long)-7637656533342013506L, (long)var1_1));
                        var14_9 = var15_10.toString();
                    }
                    var15_10 = new sz(var5_3, (short)var6_4, (char)var7_5);
                    v14 = new Object[3];
                    v14[2] = var15_10;
                    v14[1] = var14_9;
                    v14[0] = var3_2;
                    var13_11 = m44.a("t", (Object)m44.a("k", (Object)v14, (long)-7794999076200052736L, (long)var1_1), (long)-7710123272936462213L, (long)var1_1);
                    try {
                        if (!var15_10.a(var10_7)) {
                            throw new BuildException((String)var15_10.t());
                        }
                    }
                    catch (Exception v15) {
                        throw m44.a("k", (Object)v15, (long)-8547345173359940752L, (long)var1_1);
                    }
                    try {
                        if (var12_8 != false) break block27;
lbl98:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Exception v16) {
                        throw m44.a("k", (Object)v16, (long)-8547345173359940752L, (long)var1_1);
                    }
                }
                var13_11 = m44.a("t", (Object)m44.a("u", (Object)v2, (long)-8609191253969306602L, (long)var1_1), (long)-7710123272936462213L, (long)var1_1);
            }
            m44.a("k", (Object)var13_11, (Object)m44.a("t", (Object)m44.a("t", (Object)this, (long)-8299710732507747162L, (long)var1_1), (long)-7512530893899853631L, (long)var1_1), (long)-8215220208834774093L, (long)var1_1);
        }
        catch (Exception var13_12) {
            m44.a("t", (Object)var13_12, (long)-7767463618185193097L, (long)var1_1);
            throw new BuildException((String)m44.a("t", (Object)var13_12, (long)-7809420231788316429L, (long)var1_1));
        }
    }

    public void setWarn(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x3791E8A1BD19L;
                CallSite callSite = m44.a("i", (long)-2336409623511464680L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite == false) break block9;
                            if (n11 != 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("i", (Object)((Object)buildException), (long)-4277300167575509326L, (long)l10);
                        }
                        object = m44.a("w", (Object)((Object)this), (long)-4295625671179406003L, (long)l10);
                        if (callSite == false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("i", (Object)((Object)buildException), (long)-4277300167575509326L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("i", (Object)((Object)buildException), (long)-4277300167575509326L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-4295625671179406003L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683FB131582D84CL ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("i", (Object)((Object)buildException), (long)-4277300167575509326L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-4295625671179406003L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)24415, (long)(0x5C5AD6C35CA79E8EL ^ l10))));
        }
    }

    public void addConfiguredLibraryjar(t7 t72) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x6FF357EF89D1L;
                CallSite callSite = m44.a("i", (long)-1171381916177270060L, (long)l10);
                try {
                    try {
                        object = m44.a("w", (Object)((Object)this), (long)-1104921960866692731L, (long)l10);
                        if (callSite != false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("i", (Object)((Object)buildException), (long)-1122625241797930374L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-1104921960866692731L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683A371AACCEC84L ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("i", (Object)((Object)buildException), (long)-1122625241797930374L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-1104921960866692731L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)14904, (long)(0x47A0489C0594F26L ^ l10))));
            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-1104921960866692731L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683A371AACCEC84L ^ l10)));
            object = ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-1104921960866692731L, (long)l10))).append((String)((Object)m44.a("v", (Object)((Object)t72), (long)-1713577507063687412L, (long)l10)));
        }
    }

    public void setFlattenpackagehierarchy(String string) {
        block11: {
            long l10;
            block10: {
                CallSite callSite;
                block8: {
                    Object object;
                    block9: {
                        l10 = a ^ 0x6ED80027235BL;
                        callSite = m44.a("k", (long)4742640715560721242L, (long)l10);
                        try {
                            try {
                                object = m44.a("u", (Object)((Object)this), (long)6494338546945223439L, (long)l10);
                                if (callSite == false) break block8;
                                if (((StringBuilder)object).length() <= 0) break block9;
                            }
                            catch (BuildException buildException) {
                                throw m44.a("k", (Object)((Object)buildException), (long)6548694970339424496L, (long)l10);
                            }
                            ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)6494338546945223439L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683A25AFD04460EL ^ l10)));
                        }
                        catch (BuildException buildException) {
                            throw m44.a("k", (Object)((Object)buildException), (long)6548694970339424496L, (long)l10);
                        }
                    }
                    object = ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)6494338546945223439L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)23441, (long)(0x2EB3468D36D58407L ^ l10))));
                }
                try {
                    try {
                        if (callSite == false) break block10;
                        if (string == null) break block11;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("k", (Object)((Object)buildException), (long)6548694970339424496L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)6494338546945223439L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683A25AFD04460EL ^ l10)));
                    ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)6494338546945223439L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x24968B0FB441BEEFL ^ l10)));
                    ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)6494338546945223439L, (long)l10))).append(string);
                }
                catch (BuildException buildException) {
                    throw m44.a("k", (Object)((Object)buildException), (long)6548694970339424496L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)6494338546945223439L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x24968B0FB441BEEFL ^ l10)));
        }
    }

    public void setObfuscationdictionary(File file) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0xD52DEFB1A9L;
                CallSite callSite = m44.a("i", (long)-2898623279899098452L, (long)l10);
                try {
                    try {
                        object = m44.a("w", (Object)((Object)this), (long)-3975859941200922115L, (long)l10);
                        if (callSite != false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("i", (Object)((Object)buildException), (long)-4029651377209775614L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-3975859941200922115L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683CC57D0CCD4FCL ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("i", (Object)((Object)buildException), (long)-4029651377209775614L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-3975859941200922115L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)7866, (long)(0x6EB4FB698B2553D8L ^ l10))));
            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-3975859941200922115L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683CC57D0CCD4FCL ^ l10)));
            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-3975859941200922115L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496E50299892C1DL ^ l10)));
            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-3975859941200922115L, (long)l10))).append((String)((Object)m44.a("v", (Object)file, (long)-3138353569814402807L, (long)l10)));
            object = ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-3975859941200922115L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496E50299892C1DL ^ l10)));
        }
    }

    public void setShrink(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x667B9159C701L;
                CallSite callSite = m44.a("i", (long)-6814399429427481596L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite != false) break block9;
                            if (n11 != 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("i", (Object)((Object)buildException), (long)-4702976533595611990L, (long)l10);
                        }
                        object = m44.a("w", (Object)((Object)this), (long)-4721304181976789163L, (long)l10);
                        if (callSite != false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("i", (Object)((Object)buildException), (long)-4702976533595611990L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("i", (Object)((Object)buildException), (long)-4702976533595611990L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-4721304181976789163L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683AAF96C7AA254L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("i", (Object)((Object)buildException), (long)-4702976533595611990L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-4721304181976789163L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)21845, (long)(0xFCE00543908EEA6L ^ l10))));
        }
    }

    public void addConfiguredInjar(t7 t72) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x5FC8BE8E743CL;
                CallSite callSite = m44.a("l", (long)1320498490900350777L, (long)l10);
                try {
                    try {
                        object = m44.a("r", (Object)((Object)this), (long)956935134339316840L, (long)l10);
                        if (callSite != false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("l", (Object)((Object)buildException), (long)974627386486075287L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)956935134339316840L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683934A43AD1169L ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("l", (Object)((Object)buildException), (long)974627386486075287L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)956935134339316840L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)13605, (long)(0x6DCB65938E57BDD7L ^ l10))));
            ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)956935134339316840L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683934A43AD1169L ^ l10)));
            object = ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)956935134339316840L, (long)l10))).append((String)((Object)m44.a("s", (Object)((Object)t72), (long)1573188306491894497L, (long)l10)));
        }
    }

    public void setOptimize(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x73D8D7A9371FL;
                CallSite callSite = m44.a("o", (long)5868320546422866970L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite != false) break block9;
                            if (n11 != 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("o", (Object)((Object)buildException), (long)5667145033677663412L, (long)l10);
                        }
                        object = m44.a("q", (Object)((Object)this), (long)5648810803101826891L, (long)l10);
                        if (callSite != false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("o", (Object)((Object)buildException), (long)5667145033677663412L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("o", (Object)((Object)buildException), (long)5667145033677663412L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)5648810803101826891L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683BF5A2A8A524AL ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("o", (Object)((Object)buildException), (long)5667145033677663412L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)5648810803101826891L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)27058, (long)(0x79C226E37B9B2272L ^ l10))));
        }
    }

    public void setIgnorewarnings(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x7568C09E02B6L;
                CallSite callSite = m44.a("n", (long)6934458391464262327L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite == false) break block9;
                            if (n11 == 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("n", (Object)((Object)buildException), (long)8866664977559116061L, (long)l10);
                        }
                        object = m44.a("p", (Object)((Object)this), (long)8920959950305544930L, (long)l10);
                        if (callSite == false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("n", (Object)((Object)buildException), (long)8866664977559116061L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("n", (Object)((Object)buildException), (long)8866664977559116061L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("p", (Object)((Object)this), (long)8920959950305544930L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683B9EA3DBD67E3L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("n", (Object)((Object)buildException), (long)8866664977559116061L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("p", (Object)((Object)this), (long)8920959950305544930L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)2563, (long)(0x438B83C8BF9F444L ^ l10))));
        }
    }

    public void setUsemixedcaseclassnames(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x1CB3A2B299BBL;
                CallSite callSite = m44.a("k", (long)-12357297221997890L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite != false) break block9;
                            if (n11 != 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("k", (Object)((Object)buildException), (long)-2305331690473373168L, (long)l10);
                        }
                        object = m44.a("u", (Object)((Object)this), (long)-2251531445348707857L, (long)l10);
                        if (callSite != false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("k", (Object)((Object)buildException), (long)-2305331690473373168L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("k", (Object)((Object)buildException), (long)-2305331690473373168L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)-2251531445348707857L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683D0315F91FCEEL ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("k", (Object)((Object)buildException), (long)-2305331690473373168L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)-2251531445348707857L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)20213, (long)(0x7A25DA3A238DAB92L ^ l10))));
        }
    }

    public void setAllowaccessmodification(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x642609E6DCF3L;
                CallSite callSite = m44.a("k", (long)-4721685128516147982L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite == false) break block9;
                            if (n11 == 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("k", (Object)((Object)buildException), (long)-6536506883774740648L, (long)l10);
                        }
                        object = m44.a("u", (Object)((Object)this), (long)-6518805970845821785L, (long)l10);
                        if (callSite == false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("k", (Object)((Object)buildException), (long)-6536506883774740648L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("k", (Object)((Object)buildException), (long)-6536506883774740648L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)-6518805970845821785L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683A8A4F4C5B9A6L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("k", (Object)((Object)buildException), (long)-6536506883774740648L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)-6518805970845821785L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)10479, (long)(0x331C66B8E7E88DFL ^ l10))));
        }
    }

    public void setDefaultpackage(String string) {
        long l10 = a ^ 0x50E38C729DB4L;
        m44.a("s", (Object)((Object)this), (Object)string, (long)-413878231500034244L, (long)l10);
    }

    public void setOverloadaggressively(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x7825B75F36F0L;
                CallSite callSite = m44.a("h", (long)6087222272869076721L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite == false) break block9;
                            if (n11 == 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("h", (Object)((Object)buildException), (long)5713578762081135963L, (long)l10);
                        }
                        object = m44.a("v", (Object)((Object)this), (long)5731833840032546468L, (long)l10);
                        if (callSite == false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("h", (Object)((Object)buildException), (long)5713578762081135963L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("h", (Object)((Object)buildException), (long)5713578762081135963L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)5731833840032546468L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683B4A74A7C53A5L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("h", (Object)((Object)buildException), (long)5713578762081135963L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)5731833840032546468L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)28308, (long)(0x6A47D8D91AD724B6L ^ l10))));
        }
    }

    public void setClassobfuscationdictionary(File file) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x35CD95DFCB22L;
                CallSite callSite = m44.a("j", (long)-5959053522667325401L, (long)l10);
                try {
                    try {
                        object = m44.a("t", (Object)((Object)this), (long)-5595197612946685066L, (long)l10);
                        if (callSite != false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("j", (Object)((Object)buildException), (long)-5577434958771842935L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-5595197612946685066L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683F94F68FCAE77L ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("j", (Object)((Object)buildException), (long)-5577434958771842935L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-5595197612946685066L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)24896, (long)(0x1590734774CBD6A7L ^ l10))));
            ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-5595197612946685066L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683F94F68FCAE77L ^ l10)));
            ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-5595197612946685066L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496D01A21B95696L ^ l10)));
            ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-5595197612946685066L, (long)l10))).append((String)((Object)m44.a("u", (Object)file, (long)-5838528690839727230L, (long)l10)));
            object = ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-5595197612946685066L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496D01A21B95696L ^ l10)));
        }
    }

    public void setKeepparameternames(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x13D212FD1A62L;
                CallSite callSite = m44.a("j", (long)8712287767026410083L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite == false) break block9;
                            if (n11 == 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("j", (Object)((Object)buildException), (long)7194744956331606473L, (long)l10);
                        }
                        object = m44.a("t", (Object)((Object)this), (long)7141015168113300022L, (long)l10);
                        if (callSite == false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("j", (Object)((Object)buildException), (long)7194744956331606473L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("j", (Object)((Object)buildException), (long)7194744956331606473L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)7141015168113300022L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683DF50EFDE7F37L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("j", (Object)((Object)buildException), (long)7194744956331606473L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)7141015168113300022L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)11044, (long)(0x377F03A37A154D97L ^ l10))));
        }
    }

    public void setForceprocessing(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x15C843529BD2L;
                CallSite callSite = m44.a("j", (long)-162956000950556457L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite != false) break block9;
                            if (n11 == 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("j", (Object)((Object)buildException), (long)-2132216442475364231L, (long)l10);
                        }
                        object = m44.a("t", (Object)((Object)this), (long)-2113879893690395770L, (long)l10);
                        if (callSite != false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("j", (Object)((Object)buildException), (long)-2132216442475364231L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("j", (Object)((Object)buildException), (long)-2132216442475364231L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-2113879893690395770L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683D94ABE71FE87L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("j", (Object)((Object)buildException), (long)-2132216442475364231L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-2113879893690395770L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)24143, (long)(0xC04AA7C4966B95BL ^ l10))));
        }
    }

    public void setTarget(String string) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x43CFBB53A496L;
                CallSite callSite = m44.a("n", (long)-4397406154811779181L, (long)l10);
                try {
                    try {
                        object = m44.a("p", (Object)((Object)this), (long)-2455117757495153470L, (long)l10);
                        if (callSite != false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("n", (Object)((Object)buildException), (long)-2509474251908350147L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("p", (Object)((Object)this), (long)-2455117757495153470L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x26838F4D4670C1C3L ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("n", (Object)((Object)buildException), (long)-2509474251908350147L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("p", (Object)((Object)this), (long)-2455117757495153470L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)27679, (long)(0x59967371FB94B45DL ^ l10))));
            ((StringBuilder)((Object)m44.a("p", (Object)((Object)this), (long)-2455117757495153470L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x26838F4D4670C1C3L ^ l10)));
            object = ((StringBuilder)((Object)m44.a("p", (Object)((Object)this), (long)-2455117757495153470L, (long)l10))).append(string);
        }
    }

    public void setPrintusage(File file) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x5325372588EAL;
                CallSite callSite = m44.a("j", (long)-1558241728621727509L, (long)l10);
                try {
                    try {
                        object = m44.a("t", (Object)((Object)this), (long)-1039843868523544386L, (long)l10);
                        if (callSite == false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("j", (Object)((Object)buildException), (long)-1058171518532103359L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-1039843868523544386L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x26839FA7CA06EDBFL ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("j", (Object)((Object)buildException), (long)-1058171518532103359L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-1039843868523544386L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)8700, (long)(0x4DB29D283C3BD5D6L ^ l10))));
            ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-1039843868523544386L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x26839FA7CA06EDBFL ^ l10)));
            ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-1039843868523544386L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496B6F28343155EL ^ l10)));
            ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-1039843868523544386L, (long)l10))).append((String)((Object)m44.a("u", (Object)file, (long)-1355293224127164342L, (long)l10)));
            object = ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)-1039843868523544386L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496B6F28343155EL ^ l10)));
        }
    }

    public void setPrintseeds(File file) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x1F6428770E35L;
                CallSite callSite = m44.a("m", (long)7519351995660467504L, (long)l10);
                try {
                    try {
                        object = m44.a("s", (Object)((Object)this), (long)8597081159171294817L, (long)l10);
                        if (callSite != false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("m", (Object)((Object)buildException), (long)8615336459368912286L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("s", (Object)((Object)this), (long)8597081159171294817L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683D3E6D5546B60L ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("m", (Object)((Object)buildException), (long)8615336459368912286L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("s", (Object)((Object)this), (long)8597081159171294817L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)18325, (long)(0x75D18699D140B569L ^ l10))));
            ((StringBuilder)((Object)m44.a("s", (Object)((Object)this), (long)8597081159171294817L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683D3E6D5546B60L ^ l10)));
            ((StringBuilder)((Object)m44.a("s", (Object)((Object)this), (long)8597081159171294817L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496FAB39C119381L ^ l10)));
            ((StringBuilder)((Object)m44.a("s", (Object)((Object)this), (long)8597081159171294817L, (long)l10))).append((String)((Object)m44.a("r", (Object)file, (long)7777236891672942229L, (long)l10)));
            object = ((StringBuilder)((Object)m44.a("s", (Object)((Object)this), (long)8597081159171294817L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496FAB39C119381L ^ l10)));
        }
    }

    public void setApplymapping(File file) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x37457FDA98C4L;
                CallSite callSite = m44.a("l", (long)-410277235951361851L, (long)l10);
                try {
                    try {
                        object = m44.a("r", (Object)((Object)this), (long)-2179777530683830128L, (long)l10);
                        if (callSite == false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("l", (Object)((Object)buildException), (long)-2198043605882748049L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)-2179777530683830128L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683FBC782F9FD91L ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("l", (Object)((Object)buildException), (long)-2198043605882748049L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)-2179777530683830128L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)12486, (long)(0x17A06C8826CCD4D9L ^ l10))));
            ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)-2179777530683830128L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683FBC782F9FD91L ^ l10)));
            ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)-2179777530683830128L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496D292CBBC0570L ^ l10)));
            ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)-2179777530683830128L, (long)l10))).append((String)((Object)m44.a("s", (Object)file, (long)-207337527553097628L, (long)l10)));
            object = ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)-2179777530683830128L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496D292CBBC0570L ^ l10)));
        }
    }

    public void setDump(File file) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x24DCC227D111L;
                CallSite callSite = m44.a("i", (long)-5224701727413394924L, (long)l10);
                try {
                    try {
                        object = m44.a("w", (Object)((Object)this), (long)-6311007098083010235L, (long)l10);
                        if (callSite != false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("i", (Object)((Object)buildException), (long)-6292679430905591110L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-6311007098083010235L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683E85E3F04B444L ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("i", (Object)((Object)buildException), (long)-6292679430905591110L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-6311007098083010235L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)25068, (long)(0x7CE31B45C114CC24L ^ l10))));
            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-6311007098083010235L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683E85E3F04B444L ^ l10)));
            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-6311007098083010235L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)14846, (long)(0x61B1A97565245B48L ^ l10)));
            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-6311007098083010235L, (long)l10))).append((String)((Object)m44.a("v", (Object)file, (long)-5419396023058806351L, (long)l10)));
            object = ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-6311007098083010235L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496C10B76414CA5L ^ l10)));
        }
    }

    public void setPrintconfiguration(File file) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x28828CB0A47FL;
                CallSite callSite = m44.a("o", (long)-4463017565220710534L, (long)l10);
                try {
                    try {
                        object = m44.a("q", (Object)((Object)this), (long)-2520678624372429781L, (long)l10);
                        if (callSite != false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("o", (Object)((Object)buildException), (long)-2466313177103564844L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)-2520678624372429781L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683E4007193C12AL ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("o", (Object)((Object)buildException), (long)-2466313177103564844L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)-2520678624372429781L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)19465, (long)(0x3E34CE1BF90C14ABL ^ l10))));
            ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)-2520678624372429781L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683E4007193C12AL ^ l10)));
            ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)-2520678624372429781L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496CD5538D639CBL ^ l10)));
            ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)-2520678624372429781L, (long)l10))).append((String)((Object)m44.a("p", (Object)file, (long)-4493329802438296353L, (long)l10)));
            object = ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)-2520678624372429781L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496CD5538D639CBL ^ l10)));
        }
    }

    public void setRenamesourcefileattribute(String string) {
        block11: {
            long l10;
            block10: {
                CallSite callSite;
                block8: {
                    Object object;
                    block9: {
                        l10 = a ^ 0x6B693B129949L;
                        callSite = m44.a("i", (long)-305335292393905848L, (long)l10);
                        try {
                            try {
                                object = m44.a("w", (Object)((Object)this), (long)-2291624336253103843L, (long)l10);
                                if (callSite == false) break block8;
                                if (((StringBuilder)object).length() <= 0) break block9;
                            }
                            catch (BuildException buildException) {
                                throw m44.a("i", (Object)((Object)buildException), (long)-2237261176746392862L, (long)l10);
                            }
                            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-2291624336253103843L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683A7EBC631FC1CL ^ l10)));
                        }
                        catch (BuildException buildException) {
                            throw m44.a("i", (Object)((Object)buildException), (long)-2237261176746392862L, (long)l10);
                        }
                    }
                    object = ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-2291624336253103843L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)11774, (long)(0x27F745CAD099C867L ^ l10))));
                }
                try {
                    try {
                        if (callSite == false) break block10;
                        if (string == null) break block11;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("i", (Object)((Object)buildException), (long)-2237261176746392862L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-2291624336253103843L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683A7EBC631FC1CL ^ l10)));
                    ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-2291624336253103843L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x24968EBE8F7404FDL ^ l10)));
                    ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-2291624336253103843L, (long)l10))).append(string);
                }
                catch (BuildException buildException) {
                    throw m44.a("i", (Object)((Object)buildException), (long)-2237261176746392862L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)-2291624336253103843L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x24968EBE8F7404FDL ^ l10)));
        }
    }

    public void setConfiguration(File file) {
        long l10 = a ^ 0x7204C47EC672L;
        m44.a("v", (Object)((Object)this), (File)file, (long)-4742563846918026561L, (long)l10);
    }

    public void setSkipnonpubliclibraryclasses(boolean bl2) {
        block11: {
            int n10;
            CallSite callSite;
            long l10;
            block8: {
                block9: {
                    l10 = a ^ 0x71E014AE4279L;
                    callSite = m44.a("i", (long)2600393692786078076L, (long)l10);
                    try {
                        try {
                            n10 = ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)4252129532326349357L, (long)l10))).length();
                            if (callSite != false) break block8;
                            if (n10 <= 0) break block9;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("i", (Object)((Object)buildException), (long)4306492759637662162L, (long)l10);
                        }
                        ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)4252129532326349357L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683BD62E98D272CL ^ l10)));
                    }
                    catch (BuildException buildException) {
                        throw m44.a("i", (Object)((Object)buildException), (long)4306492759637662162L, (long)l10);
                    }
                }
                n10 = bl2 ? 1 : 0;
            }
            try {
                block10: {
                    try {
                        if (n10 == 0) break block10;
                        ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)4252129532326349357L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)19787, (long)(0x5DD5CD9E5C0673E5L ^ l10))));
                        if (callSite == false) break block11;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("i", (Object)((Object)buildException), (long)4306492759637662162L, (long)l10);
                    }
                }
                ((StringBuilder)((Object)m44.a("w", (Object)((Object)this), (long)4252129532326349357L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)15328, (long)(0x3238390B58250541L ^ l10))));
            }
            catch (BuildException buildException) {
                throw m44.a("i", (Object)((Object)buildException), (long)4306492759637662162L, (long)l10);
            }
        }
    }

    public void setObfuscate(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0xE4B951718D7L;
                CallSite callSite = m44.a("o", (long)9131061312990178258L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite != false) break block9;
                            if (n11 != 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("o", (Object)((Object)buildException), (long)7020482840911922044L, (long)l10);
                        }
                        object = m44.a("q", (Object)((Object)this), (long)7038254220721246339L, (long)l10);
                        if (callSite != false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("o", (Object)((Object)buildException), (long)7020482840911922044L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("o", (Object)((Object)buildException), (long)7020482840911922044L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)7038254220721246339L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683C2C968347D82L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("o", (Object)((Object)buildException), (long)7020482840911922044L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)7038254220721246339L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)19829, (long)(0x75303896FF2D2977L ^ l10))));
        }
    }

    public void addText(String string) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0xE52D6D0C91FL;
                CallSite callSite = m44.a("o", (long)-6082852295748685538L, (long)l10);
                try {
                    try {
                        object = m44.a("q", (Object)((Object)this), (long)-5736206084696440501L, (long)l10);
                        if (callSite == false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("o", (Object)((Object)buildException), (long)-5717948734042533196L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)-5736206084696440501L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683C2D02BF3AC4AL ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("o", (Object)((Object)buildException), (long)-5717948734042533196L, (long)l10);
                }
            }
            object = ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)-5736206084696440501L, (long)l10))).append((String)((Object)m44.a("p", (Object)m44.a("p", (Object)((Object)this), (long)-5398135752936925854L, (long)l10), (Object)string, (long)-5576655422294301942L, (long)l10)));
        }
    }

    public void setUseuniqueclassmembernames(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x7F91C12C38FCL;
                CallSite callSite = m44.a("l", (long)6814925046023998457L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite != false) break block9;
                            if (n11 == 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("l", (Object)((Object)buildException), (long)4703642749067125591L, (long)l10);
                        }
                        object = m44.a("r", (Object)((Object)this), (long)4721908993524560040L, (long)l10);
                        if (callSite != false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("l", (Object)((Object)buildException), (long)4703642749067125591L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("l", (Object)((Object)buildException), (long)4703642749067125591L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)4721908993524560040L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683B3133C0F5DA9L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("l", (Object)((Object)buildException), (long)4703642749067125591L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)4721908993524560040L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)32487, (long)(0x18D7C3BFB573ADAL ^ l10))));
        }
    }

    public void setSkipnonpubliclibraryclassmembers(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x6FB502511AA3L;
                CallSite callSite = m44.a("k", (long)8658522090535330466L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite == false) break block9;
                            if (n11 != 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("k", (Object)((Object)buildException), (long)7140916856780603656L, (long)l10);
                        }
                        object = m44.a("u", (Object)((Object)this), (long)7194648920394158839L, (long)l10);
                        if (callSite == false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("k", (Object)((Object)buildException), (long)7140916856780603656L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("k", (Object)((Object)buildException), (long)7140916856780603656L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)7194648920394158839L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683A337FF727FF6L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("k", (Object)((Object)buildException), (long)7140916856780603656L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)7194648920394158839L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)478, (long)(0x6EC22CF5E30AE7AEL ^ l10))));
        }
    }

    public void setAndroid(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x2C94F7A62094L;
                CallSite callSite = m44.a("l", (long)5114727147497739153L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite != false) break block9;
                            if (n11 != 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("l", (Object)((Object)buildException), (long)6426321305971653439L, (long)l10);
                        }
                        object = m44.a("r", (Object)((Object)this), (long)6480614112304490688L, (long)l10);
                        if (callSite != false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("l", (Object)((Object)buildException), (long)6426321305971653439L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("l", (Object)((Object)buildException), (long)6426321305971653439L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)6480614112304490688L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683E0160A8545C1L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("l", (Object)((Object)buildException), (long)6426321305971653439L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)6480614112304490688L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)30706, (long)(0x6503BDD142462B95L ^ l10))));
        }
    }

    public void setVerbose(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x7F9337A93BDL;
                CallSite callSite = m44.a("m", (long)-733521246259846984L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite != false) break block9;
                            if (n11 == 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("m", (Object)((Object)buildException), (long)-1583074366794872810L, (long)l10);
                        }
                        object = m44.a("s", (Object)((Object)this), (long)-1529271832973779991L, (long)l10);
                        if (callSite != false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("m", (Object)((Object)buildException), (long)-1583074366794872810L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("m", (Object)((Object)buildException), (long)-1583074366794872810L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("s", (Object)((Object)this), (long)-1529271832973779991L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)9420, (long)(0x4B1BBCA7E1B604D4L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("m", (Object)((Object)buildException), (long)-1583074366794872810L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("s", (Object)((Object)this), (long)-1529271832973779991L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)12734, (long)(0x543F6ED26D21DEC1L ^ l10))));
        }
    }

    public void setPrintmapping(File file) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x6205B5C56373L;
                CallSite callSite = m44.a("k", (long)142200147415096178L, (long)l10);
                try {
                    try {
                        object = m44.a("u", (Object)((Object)this), (long)1875901674399836967L, (long)l10);
                        if (callSite == false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("k", (Object)((Object)buildException), (long)1930267140457609432L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)1875901674399836967L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683AE8748E60626L ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("k", (Object)((Object)buildException), (long)1930267140457609432L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)1875901674399836967L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)12955, (long)(0x622D151A61952D1DL ^ l10))));
            ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)1875901674399836967L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683AE8748E60626L ^ l10)));
            ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)1875901674399836967L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x249687D201A3FEC7L ^ l10)));
            ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)1875901674399836967L, (long)l10))).append((String)((Object)m44.a("t", (Object)file, (long)479693690840349651L, (long)l10)));
            object = ((StringBuilder)((Object)m44.a("u", (Object)((Object)this), (long)1875901674399836967L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x249687D201A3FEC7L ^ l10)));
        }
    }

    public void addConfiguredOutjar(t7 t72) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x19A0F08044BAL;
                CallSite callSite = m44.a("j", (long)2509943195975038911L, (long)l10);
                try {
                    try {
                        object = m44.a("t", (Object)((Object)this), (long)4450102919411043566L, (long)l10);
                        if (callSite != false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("j", (Object)((Object)buildException), (long)4395746444344074001L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)4450102919411043566L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683D5220DA321EFL ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("j", (Object)((Object)buildException), (long)4395746444344074001L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)4450102919411043566L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)14668, (long)(0x20D5B3784465013CL ^ l10))));
            ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)4450102919411043566L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683D5220DA321EFL ^ l10)));
            object = ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)4450102919411043566L, (long)l10))).append((String)((Object)m44.a("u", (Object)((Object)t72), (long)2689581387881732711L, (long)l10)));
        }
    }

    public void setPreverify(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x405E9DA105E2L;
                CallSite callSite = m44.a("j", (long)7173466711711119079L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite != false) break block9;
                            if (n11 != 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("j", (Object)((Object)buildException), (long)8960067484429442633L, (long)l10);
                        }
                        object = m44.a("t", (Object)((Object)this), (long)8978393121155829174L, (long)l10);
                        if (callSite != false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("j", (Object)((Object)buildException), (long)8960067484429442633L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("j", (Object)((Object)buildException), (long)8960067484429442633L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)8978393121155829174L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x26838CDC608260B7L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("j", (Object)((Object)buildException), (long)8960067484429442633L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("t", (Object)((Object)this), (long)8978393121155829174L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)3278, (long)(0x398EEFDBA81475F2L ^ l10))));
        }
    }

    public void setMergeinterfacesaggressively(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x49F37AD2A80CL;
                CallSite callSite = m44.a("l", (long)-3853364182787780595L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite == false) break block9;
                            if (n11 == 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("l", (Object)((Object)buildException), (long)-3335333018720898137L, (long)l10);
                        }
                        object = m44.a("r", (Object)((Object)this), (long)-3353034013135708072L, (long)l10);
                        if (callSite == false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("l", (Object)((Object)buildException), (long)-3335333018720898137L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("l", (Object)((Object)buildException), (long)-3335333018720898137L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)-3353034013135708072L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683857187F1CD59L ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("l", (Object)((Object)buildException), (long)-3335333018720898137L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("r", (Object)((Object)this), (long)-3353034013135708072L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)26604, (long)(0x68D09371343D3324L ^ l10))));
        }
    }

    public void setOptimizationpasses(int n10) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x1C1D9B563DE7L;
                CallSite callSite = m44.a("o", (long)6876236181118125542L, (long)l10);
                try {
                    try {
                        object = m44.a("q", (Object)((Object)this), (long)4944095572370585011L, (long)l10);
                        if (callSite == false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("o", (Object)((Object)buildException), (long)4926324072167958092L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)4944095572370585011L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683D09F667558B2L ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("o", (Object)((Object)buildException), (long)4926324072167958092L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)4944095572370585011L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)24131, (long)(0xE9A97BA6D271F68L ^ l10))));
            ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)4944095572370585011L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683D09F667558B2L ^ l10)));
            object = ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)4944095572370585011L, (long)l10))).append(n10);
        }
    }

    public void setNote(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x251DB2E2727FL;
                CallSite callSite = m44.a("o", (long)1445691440417079674L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite != false) break block9;
                            if (n11 != 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("o", (Object)((Object)buildException), (long)848339899050535380L, (long)l10);
                        }
                        object = m44.a("q", (Object)((Object)this), (long)793985634398026283L, (long)l10);
                        if (callSite != false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("o", (Object)((Object)buildException), (long)848339899050535380L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("o", (Object)((Object)buildException), (long)848339899050535380L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)793985634398026283L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683E99F4FC1172AL ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("o", (Object)((Object)buildException), (long)848339899050535380L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)793985634398026283L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)24045, (long)(0x147613603FA5362L ^ l10))));
        }
    }

    public void setPackageobfuscationdictionary(File file) {
        block4: {
            Object object;
            long l10;
            block5: {
                l10 = a ^ 0x75F788A250L;
                CallSite callSite = m44.a("h", (long)-4550236273735722415L, (long)l10);
                try {
                    try {
                        object = m44.a("v", (Object)((Object)this), (long)-2653771566589646332L, (long)l10);
                        if (callSite == false) break block4;
                        if (((StringBuilder)object).length() <= 0) break block5;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("h", (Object)((Object)buildException), (long)-2600039554520417797L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2653771566589646332L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683CCF70AABC705L ^ l10)));
                }
                catch (BuildException buildException) {
                    throw m44.a("h", (Object)((Object)buildException), (long)-2600039554520417797L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2653771566589646332L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)32167, (long)(0x5EA8289D2A34A32DL ^ l10))));
            ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2653771566589646332L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683CCF70AABC705L ^ l10)));
            ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2653771566589646332L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496E5A243EE3FE4L ^ l10)));
            ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2653771566589646332L, (long)l10))).append((String)((Object)m44.a("w", (Object)file, (long)-4068064729786664208L, (long)l10)));
            object = ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2653771566589646332L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496E5A243EE3FE4L ^ l10)));
        }
    }

    public void setMicroedition(boolean n10) {
        block10: {
            Object object;
            int n11;
            long l10;
            block9: {
                l10 = a ^ 0x55A0C561310FL;
                CallSite callSite = m44.a("o", (long)6296120282665009674L, (long)l10);
                try {
                    try {
                        try {
                            n11 = n10;
                            if (callSite != false) break block9;
                            if (n11 != 0) break block10;
                        }
                        catch (BuildException buildException) {
                            throw m44.a("o", (Object)((Object)buildException), (long)5239260978082867876L, (long)l10);
                        }
                        object = m44.a("q", (Object)((Object)this), (long)5221005706740496731L, (long)l10);
                        if (callSite != false) break block10;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("o", (Object)((Object)buildException), (long)5239260978082867876L, (long)l10);
                    }
                    n11 = ((StringBuilder)object).length();
                }
                catch (BuildException buildException) {
                    throw m44.a("o", (Object)((Object)buildException), (long)5239260978082867876L, (long)l10);
                }
            }
            try {
                if (n11 > 0) {
                    ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)5221005706740496731L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x268399223842545AL ^ l10)));
                }
            }
            catch (BuildException buildException) {
                throw m44.a("o", (Object)((Object)buildException), (long)5239260978082867876L, (long)l10);
            }
            object = ((StringBuilder)((Object)m44.a("q", (Object)((Object)this), (long)5221005706740496731L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)27644, (long)(0xBA164D298FD2634L ^ l10))));
        }
    }

    public ZKM_PG_Task() {
        long l10 = a ^ 0x5B7C3DE5ACA7L;
        m44.a("s", (Object)((Object)this), (StringBuilder)new StringBuilder(), (long)-3036354292353506061L, (long)l10);
    }

    public void setRepackageclasses(String string) {
        block11: {
            long l10;
            block10: {
                CallSite callSite;
                block8: {
                    Object object;
                    block9: {
                        l10 = a ^ 0x764993709B28L;
                        callSite = m44.a("h", (long)-458762379071937751L, (long)l10);
                        try {
                            try {
                                object = m44.a("v", (Object)((Object)this), (long)-2138190651175709828L, (long)l10);
                                if (callSite == false) break block8;
                                if (((StringBuilder)object).length() <= 0) break block9;
                            }
                            catch (BuildException buildException) {
                                throw m44.a("h", (Object)((Object)buildException), (long)-2120425832485732221L, (long)l10);
                            }
                            ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2138190651175709828L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683BACB6E53FE7DL ^ l10)));
                        }
                        catch (BuildException buildException) {
                            throw m44.a("h", (Object)((Object)buildException), (long)-2120425832485732221L, (long)l10);
                        }
                    }
                    object = ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2138190651175709828L, (long)l10))).append((String)((Object)ZKM_PG_Task.a("d", (int)7479, (long)(0x3B26C4F89FA1FAC9L ^ l10))));
                }
                try {
                    try {
                        if (callSite == false) break block10;
                        if (string == null) break block11;
                    }
                    catch (BuildException buildException) {
                        throw m44.a("h", (Object)((Object)buildException), (long)-2120425832485732221L, (long)l10);
                    }
                    ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2138190651175709828L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)22257, (long)(0x2683BACB6E53FE7DL ^ l10)));
                    ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2138190651175709828L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496939E2716069CL ^ l10)));
                    ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2138190651175709828L, (long)l10))).append(string);
                }
                catch (BuildException buildException) {
                    throw m44.a("h", (Object)((Object)buildException), (long)-2120425832485732221L, (long)l10);
                }
            }
            ((StringBuilder)((Object)m44.a("v", (Object)((Object)this), (long)-2138190651175709828L, (long)l10))).append((char)ZKM_PG_Task.b("c", (int)11794, (long)(0x2496939E2716069CL ^ l10)));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        ZKM_PG_Task.a = prr.a(3053547747178353235L, 714199733305345037L, MethodHandles.lookup().lookupClass()).a(148295765341935L);
                        ZKM_PG_Task.d = new HashMap<K, V>(13);
                        var11 = ZKM_PG_Task.a ^ 20217174801013L;
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
                        var20_3 = new String[38];
                        var18_4 = 0;
                        var17_5 = "\u0092\u0080\u0093\u0007e\u00f5\u00ca\u00e7\u00a8\u00f7d#\u008b\u001c\u00dd\u00cd*\u0000~^\u00ef\u0006\u00c7\u00c5\u0094g\u008e\u00e9X\u0081U^\u0088\u00f2\u009b\u0005$\u00a6\u00cb\u000b0\u00d6\u00aa\u0002\u00fe\u00d9\u0001\u0004\u00f7\u009c\n\u0010}\u0091\u001d\u00a3\u00bc\u00cc'\u0086\u00be-\u00b5\u00bd\u00cbu%\u00e60\u0090\u0004\u00fe\u00d3\u00df\u0001c\u00f8\u00f1s\u00a3q\u00ad|\u00d9\u00fc\u00995\u0083\u00f1HI+\u00e5EGv\u00bf\u00d1\u001a\u00fa\"\u008b\u00a8.\u00b26\u0097\u0000\b\u00a4\u00ca\u00d8-\u0099\u00cc\u0007'\r\"0\u000e\u00d2\u00c8\u0092%\u001c)\u00bf\u000bc\u0093\n4\u0081\u00e4}\u0013\u00d2\u009d&\u00c6\u00d9\b'\u0087\u00b6\u00e2\u00c3a,\u00a7\u00c2)\u00ba>A\u0089$\u00b5\u00dft\u00a7(`\u00cf\u00cd\rv]\u00a0x9\\\u00a2]P\u0095\u008e\fV\u0003\\\u00ac\u0011\u00b1\u00d1\u00eb|\u00cc\u009a\u00c6\u008fS\u00d1\u00f0\u00d1\u00cf\u00ab<\u00fa\u001a\u00c7\u0087 \u0018\u001e_k\u00b3\u0005\u00fb\u00e3\u00edO\u00e9\u00e1\u00fc\u00b38\u00b1\u0097\u0003\u0084\u00be\u00b0!\u00a5\u00ff;s\u00de\u0004%\u0086V\u00d7\u0010\u00bd\u00c4\r\u009b>D\u00c7&\u00ee\u0013,/\r\u00d4\u00a5Q8\u00c2\u0002\u000f-\u0099\u000f\u008e\u00bb'\u00d0\u00f1)\r\u0096\u00ee$\u00bb\u0013\u0005{\u00a4\u00d4\u00ef\u00da\u00c1\u00b1\u008d\f\u00da\u009f\u0098\u00acC\u00b6\u009d\u00bd\u00a8\u0011N\u00ce\u00cd\u0087rPm\t\u00d3p\u00f8\u00b7\u007fs\u0017\u00e7b}(\u00fb+C\u00a5\u001f\u0081o\u00d5\u00c4~>\u00b8\u00c0ej@\u00ce\\\u00fa:'K\u00bc:1z]2q\u00f0\u00ee,<\u00da\u00e4H\u00bc\u00c6\u0094\u00d2\u0010\u00be\"n\u00b3\u001ff\u00e3D\u00c7\u0089\nJF{\u00fa0@\u0085\u00f0\u00d7\u00fe|&\u00caA'\u00bbo\u00f6\u00a3\u00e6\u0087\u001b\u0088\u00eb\u00b1\u00cd\u000e\u008f5\u0090\u00d6r;\u00ec\u00e9\u008c,!\u0094\u001b\u00c0\u00a39\u007f\u00bepD\u00c3\u000ek/\u0006\u00d2Q\u00a4\u00fe\u0099\tU\u00ff\u00cb\u00e9\u0095@Z\u00cf\u00e3O\u0099:\u0018\u001cs\u00ff\u00fdM\u00a5C\u00cb\u009b\u00e0\u0085\u00c3\u0010\u00e6\u00ed'\u00f8\u00ef\r\u00ea\u00c9\u00d6\u0010\u00818+\u0098\u00e7\u0006\u0015\u00ce\u0082b*\u0091+\u00af\u00d0\u0015\u00f9\u009d\u00eea\u0091G\u00cd\u0095\u00ae\u00e5\u001f\u009b\u0089\u00d3\u00c7\u00f1\u00f4\u00b5\u008ba[\u00ce\u0006o\u0083z\b\u00a1\u000e\"\u00db\bN\u00a7z\u00acTf\u00c3\u0017&\u00c2(\u008fE\u001e\u0096\u00e00\u00f8p\u00d7\n\u00c3O\u00da\u00dcQLHr\u00f1\u00bb=u\u00bf\f\u009dK\u0085\u00b6N$\u001f\u00f39\u00a8\u008c\u001f*\u00e8\u00fe\u00998%\u00b2o\u0095\u0001e\\\u00b4sk\u001b\u0016\u008cr\u00e5\u0080j\u00eaa\t\u00ca\u00fbAi\u00dbe\u0085\u00fdu\u00ee\u00df\u00b8\u0016\u00f0(>\u00f3\u0013\u00c2\u0082C\u008c-\u0010\u000b\u008f\u00db\u000b\u000bHkO\u0096\u00de\r\u00dc \u0083v#\u00e2\u0005\u00cdH\u00e1\u00af\u0093\u00aet\u00a1\u001c2V\u00e5\u008be\u0093&e\u0087\u00fb\u0015\u00d8\u00c4D\u008b\u00fb\u0093\u00d4 \u00ca\u00c6\u00dd\u00b1\u001b\f\u00de\u00a7&(\u009b\u00a75^:\u00f5\u00ac\u00c9\u0012G\u00fd\t\u00d0^%\u0015\r\u001e\u00a3\u00e40\u00e80\u0081\u00ed\u0012\t\u0090\u00b8\u00b6Lot\u00b9\u00eb\u008e>n\b\u0006x<q\u0080\u00f4\"\u00bb\u008b\u00e8\b\u0087$]^\u0006\u0099\u00dc\\\u00dd\u00fd\u00b5\u0095\u00b7\u00b9\u00a7\u00c4k\u00181\u00c5W\u0018\u00d3@C[x+\u009a#&r\u00a0\u0017\u001b\u00c7\u0090\u0080\u00c0\u008f\u00ef\u00e3H\u0017d\u00e80gl\u008b\u00fe\u0083'\u00d6q\u00eb\u00a2h\\\u0086m\u0084>\u00c7\u00cb\u00e0\u00ef\u00f8Y\u00ff\u00f1\u00ce\u00bb$k\u00b2\u008a\u00a8\u009e\u0010W\u00fd\u00d6\u00a8\u00b2N\u00b5n\u00801\u00d3Rx\u008b\u00db \u00e3\u009d\u001e\u00c2p\u0087\u00df\u00df\u009d\u00df\u00edk\u00bdq\tP\u00c5\u00a16\u0093' *\u00bf\u00b1\u00f4u\u0013\u00c5_\u00a8\u00cf8+Qp\u00c5z\u00fc<\u00c4R\u00cdi\u0015\u00e0\u00c9G\u00e4\u00de0\u00bf\u00bfZ\u0082\u0007\b\u00b1\u0016.\u00c3\r\u00dfkLT\u0012\u00e9\u00cfW\u00e4\u0088\u009f\u00bb\u00ff\u00cb?\u009a@\u00b2\u0010\u00f6Z\u0084\u0018\u0093\u008e\u0091Z8\u00c5\u009f\u00c6\u00b0d\u00fd\u00be\u00d43g\u00c1M3\u0099JM}\u00cb\u00ab\u0014uX\u008c\u00db\\\u00f3~Oug+\u0003\u00d2\u00d2\u000e\u00b2\u00c9|\u00bdhf5\u00bb\u00b7\u00c8 :\u0003\u00f4\u00b2\u0080\u00d1\u00cd\u0093;\u008f RZ\u00fe\u0093\u00cb2\u0098\u0017\u000f\u0088>\u00ad\u009c\u0004\u00ac\u00cf\u0006\u00f5,\u0014\u009c\u001bG+\u00f1]\u00dc\u00eb\u00b8\u00e5\u0019\b(\u0017\u00b4\u00ea\u00c9\u0013S\u00cf\u00e2\u00ff\u0019)\u0089?\u00b3fZ\u0093\u00d2\u0092\u00d7\u00af9\u0099\u00b0\u00e1\u00c5q\u00b1\u000b\u00f4\u0089'\u00da\u008f\u00f8\u00df\u0006\u00bfU\u00d1\u0018\u0017M\u00e9r\u00e7\u008a\u00f1\u0012\u00bf\u00acK\u00eb\u00cd\u00d3\u0018\u00f0\u008f~\u00cc\u00cf\u001a\u00adm\u00b1\u0018\u00c2C\u00c8\u00c2&\u009bj\u0089\u000eY\u00e28\u008cq\u0000V\u00abM\u00fbd9\u00fc\u00cb\u00be(v$4\u0092\u00baU\u0011\u00fc\fS;\u00f1\u00c6/\u009a31u\u00f1.\u00f7_\u00a3\b\u00dc\u00bbXE\u00c29\u00be\u00a8\u00ee\u001a\u00c2\u00cc\u00fe\u0096wL \u00dd\u00b7\u008d\u0006\u00fb\u0005F\u00e1CE\u008d\u008b;\u00d8\u00d0\u00c6\u0085\u0096\u0002\u00a5\u00c6#\u00bf\u00ce5+\u00d4bCBl\u00fb8,p\u0004$\t\u0089\u00a3S\u00f5\u00bbn\u00a4I*A\u00ea\u0096\u0086\u0095R\u00e29\u00e5w\u00a5\u00f5!\u00d4\u00d9N\u0000\u00c6\u0002DJx+\u0013\u0091\r\u007f\u00a6+\u00c4;\u00ddi]\u00e9\u001aYa\u00dd}uo(\u00f8Q\u00d2\u001c\u00b2\u0014\u00db\u00a9\u009aJ\u0017<g\u00f4\u0001\u00d4&\u00a3r&\u009fWr\u000bL\u0087*\u00a2A6<\b`0\u00e25\u00c9>\u00d6)\u0018\u00ccSP5\u00d3hC6\u0017rrv\u00b2\u0001\u000b{\b\u00f2\u00ce\u0015\u00e7\u0094\u00e6\u00e1\u0010\u00901t#\u00c5.\u00ca\u00c6\u009b%Iia\u0004\u00eb\u00f1 \u00bddNMp\u00f1\u009d\u00c1d\u00dcL\u008e`\u00d8y\u00a0\u00ab\u00c8B\fm!\u0011\u007fl$T\u00c6\u00d9V\u00e3\u00f4 \u0099\u007f/\u00c6-3K\u00a0\u0098\u00a089\u00b3U\bx\u00b3\u00f8\u00c5O\u00a6\u0017\u00c2e\u00det@w\u0004\u00e2\u00df\u0082 \u00ba>\u00f8\u00a64\u00f8\u009a\"|\u0099\u00c92^\u00c7\u00df\u00cbSx\u00a5\u0099\u00f2P\u0013\u00eb\u0019\u001e\ft\u00109'\u00c9\u0018\u00f4\u00da\u0003\u0089\u00f0gAr\u008b\u00f3k\u0093\u00eb\u00e5\u00f5\u00e3#\u00b8\u00ec\u00ef'O\u001c\u0088";
                        var19_6 = "\u0092\u0080\u0093\u0007e\u00f5\u00ca\u00e7\u00a8\u00f7d#\u008b\u001c\u00dd\u00cd*\u0000~^\u00ef\u0006\u00c7\u00c5\u0094g\u008e\u00e9X\u0081U^\u0088\u00f2\u009b\u0005$\u00a6\u00cb\u000b0\u00d6\u00aa\u0002\u00fe\u00d9\u0001\u0004\u00f7\u009c\n\u0010}\u0091\u001d\u00a3\u00bc\u00cc'\u0086\u00be-\u00b5\u00bd\u00cbu%\u00e60\u0090\u0004\u00fe\u00d3\u00df\u0001c\u00f8\u00f1s\u00a3q\u00ad|\u00d9\u00fc\u00995\u0083\u00f1HI+\u00e5EGv\u00bf\u00d1\u001a\u00fa\"\u008b\u00a8.\u00b26\u0097\u0000\b\u00a4\u00ca\u00d8-\u0099\u00cc\u0007'\r\"0\u000e\u00d2\u00c8\u0092%\u001c)\u00bf\u000bc\u0093\n4\u0081\u00e4}\u0013\u00d2\u009d&\u00c6\u00d9\b'\u0087\u00b6\u00e2\u00c3a,\u00a7\u00c2)\u00ba>A\u0089$\u00b5\u00dft\u00a7(`\u00cf\u00cd\rv]\u00a0x9\\\u00a2]P\u0095\u008e\fV\u0003\\\u00ac\u0011\u00b1\u00d1\u00eb|\u00cc\u009a\u00c6\u008fS\u00d1\u00f0\u00d1\u00cf\u00ab<\u00fa\u001a\u00c7\u0087 \u0018\u001e_k\u00b3\u0005\u00fb\u00e3\u00edO\u00e9\u00e1\u00fc\u00b38\u00b1\u0097\u0003\u0084\u00be\u00b0!\u00a5\u00ff;s\u00de\u0004%\u0086V\u00d7\u0010\u00bd\u00c4\r\u009b>D\u00c7&\u00ee\u0013,/\r\u00d4\u00a5Q8\u00c2\u0002\u000f-\u0099\u000f\u008e\u00bb'\u00d0\u00f1)\r\u0096\u00ee$\u00bb\u0013\u0005{\u00a4\u00d4\u00ef\u00da\u00c1\u00b1\u008d\f\u00da\u009f\u0098\u00acC\u00b6\u009d\u00bd\u00a8\u0011N\u00ce\u00cd\u0087rPm\t\u00d3p\u00f8\u00b7\u007fs\u0017\u00e7b}(\u00fb+C\u00a5\u001f\u0081o\u00d5\u00c4~>\u00b8\u00c0ej@\u00ce\\\u00fa:'K\u00bc:1z]2q\u00f0\u00ee,<\u00da\u00e4H\u00bc\u00c6\u0094\u00d2\u0010\u00be\"n\u00b3\u001ff\u00e3D\u00c7\u0089\nJF{\u00fa0@\u0085\u00f0\u00d7\u00fe|&\u00caA'\u00bbo\u00f6\u00a3\u00e6\u0087\u001b\u0088\u00eb\u00b1\u00cd\u000e\u008f5\u0090\u00d6r;\u00ec\u00e9\u008c,!\u0094\u001b\u00c0\u00a39\u007f\u00bepD\u00c3\u000ek/\u0006\u00d2Q\u00a4\u00fe\u0099\tU\u00ff\u00cb\u00e9\u0095@Z\u00cf\u00e3O\u0099:\u0018\u001cs\u00ff\u00fdM\u00a5C\u00cb\u009b\u00e0\u0085\u00c3\u0010\u00e6\u00ed'\u00f8\u00ef\r\u00ea\u00c9\u00d6\u0010\u00818+\u0098\u00e7\u0006\u0015\u00ce\u0082b*\u0091+\u00af\u00d0\u0015\u00f9\u009d\u00eea\u0091G\u00cd\u0095\u00ae\u00e5\u001f\u009b\u0089\u00d3\u00c7\u00f1\u00f4\u00b5\u008ba[\u00ce\u0006o\u0083z\b\u00a1\u000e\"\u00db\bN\u00a7z\u00acTf\u00c3\u0017&\u00c2(\u008fE\u001e\u0096\u00e00\u00f8p\u00d7\n\u00c3O\u00da\u00dcQLHr\u00f1\u00bb=u\u00bf\f\u009dK\u0085\u00b6N$\u001f\u00f39\u00a8\u008c\u001f*\u00e8\u00fe\u00998%\u00b2o\u0095\u0001e\\\u00b4sk\u001b\u0016\u008cr\u00e5\u0080j\u00eaa\t\u00ca\u00fbAi\u00dbe\u0085\u00fdu\u00ee\u00df\u00b8\u0016\u00f0(>\u00f3\u0013\u00c2\u0082C\u008c-\u0010\u000b\u008f\u00db\u000b\u000bHkO\u0096\u00de\r\u00dc \u0083v#\u00e2\u0005\u00cdH\u00e1\u00af\u0093\u00aet\u00a1\u001c2V\u00e5\u008be\u0093&e\u0087\u00fb\u0015\u00d8\u00c4D\u008b\u00fb\u0093\u00d4 \u00ca\u00c6\u00dd\u00b1\u001b\f\u00de\u00a7&(\u009b\u00a75^:\u00f5\u00ac\u00c9\u0012G\u00fd\t\u00d0^%\u0015\r\u001e\u00a3\u00e40\u00e80\u0081\u00ed\u0012\t\u0090\u00b8\u00b6Lot\u00b9\u00eb\u008e>n\b\u0006x<q\u0080\u00f4\"\u00bb\u008b\u00e8\b\u0087$]^\u0006\u0099\u00dc\\\u00dd\u00fd\u00b5\u0095\u00b7\u00b9\u00a7\u00c4k\u00181\u00c5W\u0018\u00d3@C[x+\u009a#&r\u00a0\u0017\u001b\u00c7\u0090\u0080\u00c0\u008f\u00ef\u00e3H\u0017d\u00e80gl\u008b\u00fe\u0083'\u00d6q\u00eb\u00a2h\\\u0086m\u0084>\u00c7\u00cb\u00e0\u00ef\u00f8Y\u00ff\u00f1\u00ce\u00bb$k\u00b2\u008a\u00a8\u009e\u0010W\u00fd\u00d6\u00a8\u00b2N\u00b5n\u00801\u00d3Rx\u008b\u00db \u00e3\u009d\u001e\u00c2p\u0087\u00df\u00df\u009d\u00df\u00edk\u00bdq\tP\u00c5\u00a16\u0093' *\u00bf\u00b1\u00f4u\u0013\u00c5_\u00a8\u00cf8+Qp\u00c5z\u00fc<\u00c4R\u00cdi\u0015\u00e0\u00c9G\u00e4\u00de0\u00bf\u00bfZ\u0082\u0007\b\u00b1\u0016.\u00c3\r\u00dfkLT\u0012\u00e9\u00cfW\u00e4\u0088\u009f\u00bb\u00ff\u00cb?\u009a@\u00b2\u0010\u00f6Z\u0084\u0018\u0093\u008e\u0091Z8\u00c5\u009f\u00c6\u00b0d\u00fd\u00be\u00d43g\u00c1M3\u0099JM}\u00cb\u00ab\u0014uX\u008c\u00db\\\u00f3~Oug+\u0003\u00d2\u00d2\u000e\u00b2\u00c9|\u00bdhf5\u00bb\u00b7\u00c8 :\u0003\u00f4\u00b2\u0080\u00d1\u00cd\u0093;\u008f RZ\u00fe\u0093\u00cb2\u0098\u0017\u000f\u0088>\u00ad\u009c\u0004\u00ac\u00cf\u0006\u00f5,\u0014\u009c\u001bG+\u00f1]\u00dc\u00eb\u00b8\u00e5\u0019\b(\u0017\u00b4\u00ea\u00c9\u0013S\u00cf\u00e2\u00ff\u0019)\u0089?\u00b3fZ\u0093\u00d2\u0092\u00d7\u00af9\u0099\u00b0\u00e1\u00c5q\u00b1\u000b\u00f4\u0089'\u00da\u008f\u00f8\u00df\u0006\u00bfU\u00d1\u0018\u0017M\u00e9r\u00e7\u008a\u00f1\u0012\u00bf\u00acK\u00eb\u00cd\u00d3\u0018\u00f0\u008f~\u00cc\u00cf\u001a\u00adm\u00b1\u0018\u00c2C\u00c8\u00c2&\u009bj\u0089\u000eY\u00e28\u008cq\u0000V\u00abM\u00fbd9\u00fc\u00cb\u00be(v$4\u0092\u00baU\u0011\u00fc\fS;\u00f1\u00c6/\u009a31u\u00f1.\u00f7_\u00a3\b\u00dc\u00bbXE\u00c29\u00be\u00a8\u00ee\u001a\u00c2\u00cc\u00fe\u0096wL \u00dd\u00b7\u008d\u0006\u00fb\u0005F\u00e1CE\u008d\u008b;\u00d8\u00d0\u00c6\u0085\u0096\u0002\u00a5\u00c6#\u00bf\u00ce5+\u00d4bCBl\u00fb8,p\u0004$\t\u0089\u00a3S\u00f5\u00bbn\u00a4I*A\u00ea\u0096\u0086\u0095R\u00e29\u00e5w\u00a5\u00f5!\u00d4\u00d9N\u0000\u00c6\u0002DJx+\u0013\u0091\r\u007f\u00a6+\u00c4;\u00ddi]\u00e9\u001aYa\u00dd}uo(\u00f8Q\u00d2\u001c\u00b2\u0014\u00db\u00a9\u009aJ\u0017<g\u00f4\u0001\u00d4&\u00a3r&\u009fWr\u000bL\u0087*\u00a2A6<\b`0\u00e25\u00c9>\u00d6)\u0018\u00ccSP5\u00d3hC6\u0017rrv\u00b2\u0001\u000b{\b\u00f2\u00ce\u0015\u00e7\u0094\u00e6\u00e1\u0010\u00901t#\u00c5.\u00ca\u00c6\u009b%Iia\u0004\u00eb\u00f1 \u00bddNMp\u00f1\u009d\u00c1d\u00dcL\u008e`\u00d8y\u00a0\u00ab\u00c8B\fm!\u0011\u007fl$T\u00c6\u00d9V\u00e3\u00f4 \u0099\u007f/\u00c6-3K\u00a0\u0098\u00a089\u00b3U\bx\u00b3\u00f8\u00c5O\u00a6\u0017\u00c2e\u00det@w\u0004\u00e2\u00df\u0082 \u00ba>\u00f8\u00a64\u00f8\u009a\"|\u0099\u00c92^\u00c7\u00df\u00cbSx\u00a5\u0099\u00f2P\u0013\u00eb\u0019\u001e\ft\u00109'\u00c9\u0018\u00f4\u00da\u0003\u0089\u00f0gAr\u008b\u00f3k\u0093\u00eb\u00e5\u00f5\u00e3#\u00b8\u00ec\u00ef'O\u001c\u0088".length();
                        var16_7 = 40;
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
                            var20_3[var18_4++] = ZKM_PG_Task.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "<\u00ce\u008b\u0093\u0001\u0093\u00eb\u001f\u00f4X!4\u0082\u00e2\u00c4i[\u00e6\u00f9\u00d3{\u0088NZ\u00c0`\u00af\u0095>\u001b\u00db\u009f@l\u00c8dMf\u00acJP}A[5 \u00cf\u00c7\u00ee{C>\u0002h\u00cd\u00c7\u00b9I\u00ca\u0084\n\u0002\u00e6\u0081<\u00fdV\u009c?\u00b0\u00a4\u00abE\u00b1\n\u0011\u0092\u0006y\u00bf\u00bdcc\u00a1\u00a9U$aR\u00f4\txH./\u0090\u001c";
                            var19_6 = "<\u00ce\u008b\u0093\u0001\u0093\u00eb\u001f\u00f4X!4\u0082\u00e2\u00c4i[\u00e6\u00f9\u00d3{\u0088NZ\u00c0`\u00af\u0095>\u001b\u00db\u009f@l\u00c8dMf\u00acJP}A[5 \u00cf\u00c7\u00ee{C>\u0002h\u00cd\u00c7\u00b9I\u00ca\u0084\n\u0002\u00e6\u0081<\u00fdV\u009c?\u00b0\u00a4\u00abE\u00b1\n\u0011\u0092\u0006y\u00bf\u00bdcc\u00a1\u00a9U$aR\u00f4\txH./\u0090\u001c".length();
                            var16_7 = 32;
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
                            var20_3[var18_4++] = ZKM_PG_Task.a(var21_9).intern();
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
                ZKM_PG_Task.b = var20_3;
                ZKM_PG_Task.c = new String[38];
                ZKM_PG_Task.g = new HashMap<K, V>(13);
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
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = ">\u008e\u001e\u00e4\u000eu\u007f\u00bc\u00c1\u00a7\u0013[\u00b74Y\u00d1";
                var5_15 = ">\u008e\u001e\u00e4\u000eu\u007f\u00bc\u00c1\u00a7\u0013[\u00b74Y\u00d1".length();
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
                    var4_14 = "\u0005\u0082s\t\u00f9J-\u0082\u008c\u00c0\u00cdJ\u00ccq\u0015W";
                    var5_15 = "\u0005\u0082s\t\u00f9J-\u0082\u008c\u00c0\u00cdJ\u00ccq\u0015W".length();
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
        ZKM_PG_Task.e = var6_12;
        ZKM_PG_Task.f = new Integer[4];
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0xB0E;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ZKM_PG_Task", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            ZKM_PG_Task.c[n11] = ZKM_PG_Task.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ZKM_PG_Task.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ZKM_PG_Task" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x447B;
        if (f[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ZKM_PG_Task", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ZKM_PG_Task.f[n11] = n12;
        }
        return f[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ZKM_PG_Task.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ZKM_PG_Task" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ZKM_PG_Task.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ZKM_PG_Task.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

