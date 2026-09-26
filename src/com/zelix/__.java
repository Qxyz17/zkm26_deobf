/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.df;
import com.zelix.lqw;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ur;
import com.zelix.w1;
import com.zelix.y5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class __ {
    private final ArrayList v;
    private lqw p;
    private boolean q;
    private String e;
    private final String o;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long f;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public __(lqw var1_1, long var2_2, ZipFile var4_3, ZipEntry var5_4) {
        block57: {
            block53: {
                block47: {
                    block48: {
                        v0 = var2_2 = __.a ^ var2_2;
                        var6_5 = v0 ^ 132050687184883L;
                        var8_6 = v0 ^ 129321051246548L;
                        v1 = v0 ^ 124786864322741L;
                        var10_7 = (int)(v1 >>> 32);
                        var11_8 = (int)(v1 << 32 >>> 48);
                        var12_9 = (int)(v1 << 48 >>> 48);
                        var13_10 = v0 ^ 38481329179445L;
                        var15_11 = v0 ^ 87621946884715L;
                        v2 = m44.a("k", (long)-7862459309018227068L, (long)var2_2);
                        super();
                        var17_12 = v2;
                        this.v = new ArrayList<E>();
                        var18_13 = null;
                        var19_14 = null;
                        m44.a("w", (Object)this, (lqw)var1_1, (long)-7677626964598689168L, (long)var2_2);
                        m44.a("w", (Object)this, (String)m44.a("t", (Object)var4_3, (long)-7660959365306467155L, (long)var2_2), (long)-8017713084956658482L, (long)var2_2);
                        v3 = this;
                        v4 /* !! */  = m44.a("t", (Object)var5_4, (long)-8134554211191661380L, (long)var2_2);
                        if (var17_12 == null) break block47;
                        try {
                            block59: {
                                if (v4 /* !! */  != (int)__.f) break block48;
                                break block59;
                                catch (IOException v5) {
                                    throw m44.a("k", (Object)v5, (long)-7569170831715588593L, (long)var2_2);
                                }
                            }
                            v4 /* !! */  = (CallSite)true;
                            break block47;
                        }
                        catch (IOException v6) {
                            throw m44.a("k", (Object)v6, (long)-7569170831715588593L, (long)var2_2);
                        }
                    }
                    v4 /* !! */  = (CallSite)false;
                }
                m44.a("w", (Object)v3, (boolean)v4 /* !! */ , (long)-8247198659136591970L, (long)var2_2);
                try {
                    block51: {
                        block52: {
                            block49: {
                                block50: {
                                    var18_13 = m44.a("t", (Object)var4_3, (Object)var5_4, (long)-8010179357691759330L, (long)var2_2);
                                    v7 = new Object[4];
                                    v7[3] = null;
                                    v7[2] = __.a("w", (int)22889, (long)(5185050903608901671L ^ var2_2));
                                    v7[1] = var18_13;
                                    v7[0] = var8_6;
                                    var19_14 = m44.a("k", (Object)v7, (long)-7678839932385756014L, (long)var2_2);
                                    this.o = var19_14.readLine();
                                    v8 = m44.a("u", (Object)this, (long)-7801019489944223310L, (long)var2_2);
                                    if (var2_2 < 0L || var17_12 == null) break block49;
                                    try {
                                        block60: {
                                            if (v8 != null) break block50;
                                            break block60;
                                            catch (IOException v9) {
                                                throw m44.a("k", (Object)v9, (long)-7569170831715588593L, (long)var2_2);
                                            }
                                        }
                                        throw new ur((String)__.a("w", (int)12101, (long)(6162340033608791561L ^ var2_2)));
                                    }
                                    catch (IOException v10) {
                                        throw m44.a("k", (Object)v10, (long)-7569170831715588593L, (long)var2_2);
                                    }
                                }
                                v8 = m44.a("u", (Object)this, (long)-7801019489944223310L, (long)var2_2);
                            }
                            v11 = v8.startsWith((String)__.a("w", (int)28771, (long)(4114351586426743082L ^ var2_2)));
                            if (var17_12 == null) break block51;
                            try {
                                block61: {
                                    if (v11) break block52;
                                    break block61;
                                    catch (IOException v12) {
                                        throw m44.a("k", (Object)v12, (long)-7569170831715588593L, (long)var2_2);
                                    }
                                }
                                throw new ur((String)__.a("w", (int)7929, (long)(3518364388319823793L ^ var2_2)));
                            }
                            catch (IOException v13) {
                                throw m44.a("k", (Object)v13, (long)-7569170831715588593L, (long)var2_2);
                            }
                        }
                        v11 = var20_15 /* !! */  = false;
                    }
                    while (!var20_15 /* !! */ ) {
                        block54: {
                            block55: {
                                block56: {
                                    block64: {
                                        block63: {
                                            block62: {
                                                var21_18 = new w1(var10_7, (BufferedReader)var19_14, (char)var11_8, (char)var12_9);
                                                if (var2_2 < 0L || var17_12 == null) break block53;
                                                v14 = new Object[1];
                                                v14[0] = var15_11;
                                                v15 /* !! */  = m44.a("t", (Object)var21_18, (Object)v14, (long)-7846266661679608383L, (long)var2_2);
                                                if (var17_12 == null) break block54;
                                                break block62;
                                                catch (IOException v16) {
                                                    throw m44.a("k", (Object)v16, (long)-7569170831715588593L, (long)var2_2);
                                                }
                                            }
                                            if (v15 /* !! */  != false) break block55;
                                            break block63;
                                            catch (IOException v17) {
                                                throw m44.a("k", (Object)v17, (long)-7569170831715588593L, (long)var2_2);
                                            }
                                        }
                                        v18 /* !! */  = m44.a("t", (Object)m44.a("u", (Object)this, (long)-7715941986298208847L, (long)var2_2), (long)-7678379151846285143L, (long)var2_2);
                                        if (var17_12 == null) break block55;
                                        break block64;
                                        catch (IOException v19) {
                                            throw m44.a("k", (Object)v19, (long)-7569170831715588593L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        block65: {
                                            if (v18 /* !! */  == false) break block56;
                                            break block65;
                                            catch (IOException v20) {
                                                throw m44.a("k", (Object)v20, (long)-7569170831715588593L, (long)var2_2);
                                            }
                                        }
                                        v21 = new Object[1];
                                        v21[0] = var13_10;
                                        m44.a("t", (Object)var21_18, (Object)v21, (long)-8370815478681623449L, (long)var2_2);
                                    }
                                    catch (IOException v22) {
                                        throw m44.a("k", (Object)v22, (long)-7569170831715588593L, (long)var2_2);
                                    }
                                }
                                v18 /* !! */  = (CallSite)m44.a("u", (Object)this, (long)-7715941986298208847L, (long)var2_2).add(var21_18);
                            }
                            v23 = new Object[1];
                            v23[0] = var6_5;
                            var20_15 /* !! */  = m44.a("t", (Object)var21_18, (Object)v23, (long)-8334512452655857021L, (long)var2_2);
                            v15 /* !! */  = (CallSite)var20_15 /* !! */ ;
                        }
                        if (var17_12 != null) continue;
                    }
                }
                catch (Throwable var22_19) {
                    block58: {
                        try {
                            if (var2_2 <= 0L) break block58;
                            v24 = var19_14;
                            if (var17_12 == null) ** GOTO lbl140
                            if (v24 != null) {
                            }
                            ** GOTO lbl146
                        }
                        catch (IOException v25) {
                            throw m44.a("k", (Object)v25, (long)-7569170831715588593L, (long)var2_2);
                        }
                        try {
                            v24 = var19_14;
lbl140:
                            // 2 sources

                            m44.a("t", v24, (long)-8462829654157051185L, (long)var2_2);
                            break block58;
                        }
                        catch (IOException var23_20) {
                            try {
                                try {
                                    if (var2_2 > 0L && var17_12 != null) break block58;
lbl146:
                                    // 2 sources

                                    if (var2_2 < 0L) break block58;
                                    v26 = var18_13;
                                    if (var17_12 != null) {
                                    }
                                    ** GOTO lbl159
                                }
                                catch (IOException v27) {
                                    throw m44.a("k", (Object)v27, (long)-7569170831715588593L, (long)var2_2);
                                }
                                if (v26 == null) break block58;
                            }
                            catch (IOException v28) {
                                throw m44.a("k", (Object)v28, (long)-7569170831715588593L, (long)var2_2);
                            }
                        }
                        try {
                            v26 = var18_13;
lbl159:
                            // 2 sources

                            m44.a("t", (Object)v26, (long)-8414663016046875239L, (long)var2_2);
                        }
                        catch (IOException var23_21) {
                            // empty catch block
                        }
                    }
                    throw var22_19;
                }
                try {
                    if (var2_2 <= 0L) break block53;
                    if (var2_2 <= 0L) break block57;
                    v29 = var19_14;
                    if (var17_12 != null) {
                        if (v29 == null) break block53;
                    }
                    ** GOTO lbl177
                }
                catch (IOException v30) {
                    throw m44.a("k", (Object)v30, (long)-7569170831715588593L, (long)var2_2);
                }
                try {
                    v29 = var19_14;
lbl177:
                    // 2 sources

                    m44.a("t", (Object)v29, (long)-8462829654157051185L, (long)var2_2);
                }
                catch (IOException var20_16) {}
                break block57;
            }
            try {
                if (var2_2 <= 0L) break block57;
                v31 = var18_13;
                if (var17_12 != null) {
                    if (v31 == null) break block57;
                }
                ** GOTO lbl193
            }
            catch (IOException v32) {
                throw m44.a("k", (Object)v32, (long)-7569170831715588593L, (long)var2_2);
            }
            try {
                v31 = var18_13;
lbl193:
                // 2 sources

                m44.a("t", (Object)v31, (long)-8414663016046875239L, (long)var2_2);
            }
            catch (IOException var20_17) {}
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void G(Object[] var1_1) {
        block15: {
            block14: {
                var7_2 = (ZipOutputStream)var1_1[0];
                var2_3 = (Long)var1_1[1];
                var5_4 = (Long)var1_1[2];
                var6_5 = (df)var1_1[3];
                var4_6 = (df)var1_1[4];
                var8_7 = (Boolean)var1_1[5];
                v0 = var2_3 = __.a ^ var2_3;
                var9_8 = v0 ^ 91258149826862L;
                var11_9 = v0 ^ 36857432600657L;
                var13_10 = v0 ^ 36587104850440L;
                var15_11 = v0 ^ 43288179827202L;
                var17_12 = v0 ^ 15552263212312L;
                v1 = v0 ^ 82244448527096L;
                var19_13 = (int)(v1 >>> 32);
                var20_14 = (int)(v1 << 32 >>> 48);
                var21_15 = (int)(v1 << 48 >>> 48);
                var22_16 = v0 ^ 49135557132171L;
                var24_17 = v0 ^ 79209315870149L;
                v2 = new Object[1];
                v2[0] = var9_8;
                v3 = new Object[1];
                v3[0] = var9_8;
                v4 = new Object[2];
                v4[1] = var17_12;
                v4[0] = cf.x((int)(m44.a("u", (Object)var6_5, (Object)v2, (long)6206321615043409341L, (long)var2_3) + m44.a("u", (Object)var4_6, (Object)v3, (long)6206321615043409341L, (long)var2_3)), (int)var19_13, (char)((char)var20_14), (short)((short)var21_15));
                var27_18 = m44.a("j", (Object)v4, (long)5321357057875561529L, (long)var2_3);
                v5 = new Object[1];
                v5[0] = var22_16;
                var28_19 /* !! */  = m44.a("u", (Object)var6_5, (Object)v5, (long)5198139995219678973L, (long)var2_3).iterator();
                var26_20 = m44.a("j", (long)6339896987395529629L, (long)var2_3);
                block6: while (var28_19 /* !! */ .hasNext()) {
                    v6 /* !! */  = var28_19 /* !! */ ;
                    if (var2_3 > 0L) {
                        var29_21 = (lqw)v6 /* !! */ .next();
                        try {
                            var27_18.put(var29_21.A(), var29_21);
                            while (var26_20 != null) {
                                if (var26_20 != null) continue block6;
                                if (var2_3 < 0L) continue;
                                break block6;
                            }
                            break block14;
                        }
                        catch (n9 v7) {
                            throw m44.a("j", (Object)v7, (long)6047735518641185558L, (long)var2_3);
                        }
                    }
                    ** GOTO lbl60
                }
                v8 = new Object[1];
                v8[0] = var22_16;
                var28_19 /* !! */  = m44.a("u", (Object)var4_6, (Object)v8, (long)5198139995219678973L, (long)var2_3).iterator();
            }
            block8: while (true) {
                block16: {
                    v6 /* !! */  = var28_19 /* !! */ ;
lbl60:
                    // 2 sources

                    if (var2_3 < 0L) break block16;
                    if (!v6 /* !! */ .hasNext()) ** GOTO lbl69
                    v6 /* !! */  = var28_19 /* !! */ .next();
                }
                do {
                    var29_21 = (lqw)v6 /* !! */ ;
                    var27_18.put(var29_21.A(), var29_21);
                    if (var26_20 != null) continue block8;
lbl69:
                    // 2 sources

                    v6 /* !! */  = new y5(var24_17, var7_2, (String)__.a("w", (int)30158, (long)(4337579778693015960L ^ var2_3)), var8_7);
                } while (var2_3 < 0L);
                break;
            }
            var28_19 /* !! */  = v6 /* !! */ ;
            v9 = new Object[1];
            v9[0] = var13_10;
            var29_21 = new PrintWriter(new OutputStreamWriter((OutputStream)m44.a("u", (Object)var28_19 /* !! */ , (Object)v9, (long)5421784226845390344L, (long)var2_3), (String)__.a("w", (int)5315, (long)(5953786870068136087L ^ var2_3))));
            var29_21.println((String)m44.a("t", (Object)this, (long)6243130689479181483L, (long)var2_3));
            m44.a("u", (Object)var29_21, (long)5343754210996896259L, (long)var2_3);
            var30_22 = m44.a("t", (Object)this, (long)5904869982779119784L, (long)var2_3).iterator();
            block10: while (var30_22.hasNext()) {
                var31_23 = (w1)var30_22.next();
                try {
                    v10 = new Object[6];
                    v10[5] = var4_6;
                    v10[4] = var6_5;
                    v10[3] = var27_18;
                    v10[2] = var11_9;
                    v10[1] = m44.a("t", (Object)this, (long)5794635899600156521L, (long)var2_3);
                    v10[0] = var29_21;
                    m44.a("u", (Object)var31_23, (Object)v10, (long)6088652503702433611L, (long)var2_3);
                    while (var2_3 >= 0L && var26_20 != null) {
                        if (var26_20 != null) continue block10;
                        if (var2_3 < 0L) continue;
                        break block10;
                    }
                    break block15;
                }
                catch (n9 v11) {
                    throw m44.a("j", (Object)v11, (long)6047735518641185558L, (long)var2_3);
                }
            }
            m44.a("u", (Object)var29_21, (long)5343754210996896259L, (long)var2_3);
            m44.a("u", (Object)var29_21, (long)6084135437849729154L, (long)var2_3);
            v12 = new Object[2];
            v12[1] = var15_11;
            v12[0] = var5_4;
            m44.a("u", (Object)var28_19 /* !! */ , (Object)v12, (long)6296322184797990375L, (long)var2_3);
        }
        try {
            if (var2_3 > 0L && m44.a("j", (long)6209122282253872914L, (long)var2_3) == null) {
                m44.a("j", (Object)new int[3], (long)5830983246317550508L, (long)var2_3);
            }
        }
        catch (n9 v13) {
            throw m44.a("j", (Object)v13, (long)6047735518641185558L, (long)var2_3);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    __.a = prr.a((long)-2333672508162901830L, (long)8160579975421909224L, MethodHandles.lookup().lookupClass()).a(215417892696265L);
                    __.d = new HashMap<K, V>(13);
                    var5 = __.a ^ 101592729063213L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[6];
                    var12_4 = 0;
                    var11_5 = "\u0014\u00f9B5\u00b3\u0006\u0080\u00c3\u00e1d3\t\u00a8\u00f4\u00c1\u0003(\u00b6f\u00df.P;\u00d5\u0014\u00a3\u00a7@\u00ber\u00ed\u00d9$\u0006\u001d\u00bd\u008aG\u0097\u0018\u00d3\u00da\u00b4\u0018\u00e60B6\u0011F\u00be\u00b8\u00cc\u00b9\u00aa\u0011O #\u009c\u00f9\u00ae\u000eB${4|\u000f\u0013\u00b9\u00c7O\u0016\u00cf4\u00f5\u008b\u00b4\u009e\u00e7\u00ce\u00b3\u00a2\u0084-\u0091\u00ac\n\u0004\u0010\u0006\u00eb\u00e9\u00bf}t\u0014\u00c2\u00bd\u00b1\u00fc\u00fd\\\u008a\u00b4\u00c7";
                    var13_6 = "\u0014\u00f9B5\u00b3\u0006\u0080\u00c3\u00e1d3\t\u00a8\u00f4\u00c1\u0003(\u00b6f\u00df.P;\u00d5\u0014\u00a3\u00a7@\u00ber\u00ed\u00d9$\u0006\u001d\u00bd\u008aG\u0097\u0018\u00d3\u00da\u00b4\u0018\u00e60B6\u0011F\u00be\u00b8\u00cc\u00b9\u00aa\u0011O #\u009c\u00f9\u00ae\u000eB${4|\u000f\u0013\u00b9\u00c7O\u0016\u00cf4\u00f5\u008b\u00b4\u009e\u00e7\u00ce\u00b3\u00a2\u0084-\u0091\u00ac\n\u0004\u0010\u0006\u00eb\u00e9\u00bf}t\u0014\u00c2\u00bd\u00b1\u00fc\u00fd\\\u008a\u00b4\u00c7".length();
                    var10_7 = 16;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = __.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "Y\u00c7,\u00f9\u00c5\u00bf\u00c0\u009a\u00c1\u00cf\u00cc\u00cd\"aG\u000f\u00f33p\u00e5\u00e2\u00b0\u00e5F\u00a5\\\u00b42\u0018\u00ca\u00bc\u0011\u0082C\u008c\u001d\u00ccr\u00d4\u0012(\u00a1,\u00beG\u0016\u00c4\u001b2:\u00a9\u0012\u00bf\u0086'\u0088Uww\u0018\u0013\u00ba\u00ca;\u009e\u00da\u008fi\u009cH,V\u00e9\u00d5\u0084\u00a9\u00fe\u00b0G\u009b\u00cf";
                        var13_6 = "Y\u00c7,\u00f9\u00c5\u00bf\u00c0\u009a\u00c1\u00cf\u00cc\u00cd\"aG\u000f\u00f33p\u00e5\u00e2\u00b0\u00e5F\u00a5\\\u00b42\u0018\u00ca\u00bc\u0011\u0082C\u008c\u001d\u00ccr\u00d4\u0012(\u00a1,\u00beG\u0016\u00c4\u001b2:\u00a9\u0012\u00bf\u0086'\u0088Uww\u0018\u0013\u00ba\u00ca;\u009e\u00da\u008fi\u009cH,V\u00e9\u00d5\u0084\u00a9\u00fe\u00b0G\u009b\u00cf".length();
                        var10_7 = 40;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = __.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            __.b = var14_3;
            __.c = new String[6];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = -2661428343707911391L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        __.f = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x19D1;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/__", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            __.c[n2] = __.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = __.a(n, l);
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
            throw new RuntimeException("com/zelix/__" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(__.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
