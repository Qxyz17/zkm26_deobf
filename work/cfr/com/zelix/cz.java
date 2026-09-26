/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.IOException;
import java.io.Reader;
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

public class cz {
    public static int I;
    protected static boolean H;
    protected static int[] k;
    protected static int n;
    protected static Reader t;
    protected static int B;
    static int R;
    protected static int V;
    protected static int E;
    static int r;
    protected static int N;
    protected static boolean h;
    protected static char[] d;
    protected static int[] j;
    static int A;
    private static final long a;
    private static final String b;
    private static final long[] c;
    private static final Integer[] e;
    private static final Map f;

    public void z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Reader reader = (Reader)objectArray[1];
        int n10 = (Integer)objectArray[2];
        int n11 = (Integer)objectArray[3];
        long l11 = (l10 = a ^ l10) ^ 0x7FF98C5B53E8L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l11;
        objectArray2[3] = (int)cz.a("a", (int)31114, (long)(0x511CEE5E56DF40A7L ^ l10));
        objectArray2[2] = n11;
        objectArray2[1] = n10;
        objectArray2[0] = reader;
        m44.a("u", (Object)this, (Object)objectArray2, (long)-2642505316698623888L, (long)l10);
    }

    public static char x(Object[] objectArray) {
        CallSite callSite;
        long l10;
        long l11;
        block17: {
            block18: {
                CallSite callSite2;
                long l12;
                block13: {
                    block14: {
                        CallSite callSite3;
                        block15: {
                            block16: {
                                l11 = (Long)objectArray[0];
                                long l13 = l11 = a ^ l11;
                                l12 = l13 ^ 0x42C8AD971F6EL;
                                l10 = l13 ^ 0x71B65FD03D46L;
                                callSite2 = m44.a("i", (long)8976506604763360977L, (long)l11);
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite = m44.a("m", (long)8971772399101142444L, (long)l11);
                                                if (callSite2 == false) break block13;
                                                if (callSite <= 0) break block14;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("i", (Object)n92, (long)8954185898279619287L, (long)l11);
                                            }
                                            m44.a("j", (int)(m44.a("m", (long)8971772399101142444L, (long)l11) - true), (long)8971772399101142444L, (long)l11);
                                            CallSite callSite4 = m44.a("m", (long)9144939539859291311L, (long)l11) + true;
                                            callSite3 = callSite4;
                                            m44.a("j", (int)callSite4, (long)9144939539859291311L, (long)l11);
                                            if (callSite2 == false) break block15;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("i", (Object)n93, (long)8954185898279619287L, (long)l11);
                                        }
                                        if (callSite3 != m44.a("m", (long)6986373478278443841L, (long)l11)) break block16;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("i", (Object)n94, (long)8954185898279619287L, (long)l11);
                                    }
                                    m44.a("j", (int)0, (long)9144939539859291311L, (long)l11);
                                }
                                catch (n9 n95) {
                                    throw m44.a("i", (Object)n95, (long)8954185898279619287L, (long)l11);
                                }
                            }
                            callSite3 = m44.a("m", (long)7470173203769780322L, (long)l11)[m44.a("m", (long)9144939539859291311L, (long)l11)];
                        }
                        return (char)callSite3;
                    }
                    CallSite callSite5 = m44.a("m", (long)9144939539859291311L, (long)l11) + true;
                    callSite = callSite5;
                    m44.a("j", (int)callSite5, (long)9144939539859291311L, (long)l11);
                }
                try {
                    try {
                        CallSite callSite6 = callSite2;
                        if (l11 >= 0L) {
                            if (callSite6 == false) break block17;
                            callSite6 = m44.a("m", (long)8676157067664720336L, (long)l11);
                        }
                        if (callSite < callSite6) break block18;
                    }
                    catch (n9 n96) {
                        throw m44.a("i", (Object)n96, (long)8954185898279619287L, (long)l11);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l12;
                    m44.a("i", (Object)objectArray2, (long)9029790235887891567L, (long)l11);
                }
                catch (n9 n97) {
                    throw m44.a("i", (Object)n97, (long)8954185898279619287L, (long)l11);
                }
            }
            callSite = m44.a("m", (long)7470173203769780322L, (long)l11)[m44.a("m", (long)9144939539859291311L, (long)l11)];
        }
        CallSite callSite7 = callSite;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l10;
        objectArray3[0] = (int)callSite7;
        m44.a("i", (Object)objectArray3, (long)7043782509117698518L, (long)l11);
        return (char)callSite7;
    }

    public static String F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            if (m44.a("i", (long)2156501797769502635L, (long)l10) >= m44.a("i", (long)2118903935296787273L, (long)l10)) {
                return new String((char[])m44.a("i", (long)337583096371120998L, (long)l10), (int)m44.a("i", (long)2118903935296787273L, (long)l10), (int)(m44.a("i", (long)2156501797769502635L, (long)l10) - m44.a("i", (long)2118903935296787273L, (long)l10) + true));
            }
        }
        catch (n9 n92) {
            throw m44.a("m", (Object)n92, (long)2253942043379411411L, (long)l10);
        }
        return new String((char[])m44.a("i", (long)337583096371120998L, (long)l10), (int)m44.a("i", (long)2118903935296787273L, (long)l10), (int)(m44.a("i", (long)283904156002504773L, (long)l10) - m44.a("i", (long)2118903935296787273L, (long)l10))) + new String((char[])m44.a("i", (long)337583096371120998L, (long)l10), 0, (int)(m44.a("i", (long)2156501797769502635L, (long)l10) + true));
    }

    public cz(Reader reader, int n10, long l10, int n11) {
        long l11 = (l10 = a ^ l10) ^ 0x8BB75EFFCFL;
        this(reader, n10, n11, (int)cz.a("a", (int)3771, (long)(0x23B7EBD9B24B8F1AL ^ l10)), l11);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected static void f(Object[] var0) {
        block45: {
            block50: {
                block51: {
                    block49: {
                        block67: {
                            block66: {
                                block46: {
                                    block48: {
                                        block64: {
                                            block47: {
                                                block62: {
                                                    block61: {
                                                        block60: {
                                                            block59: {
                                                                block58: {
                                                                    var1_1 = (Long)var0[0];
                                                                    v0 = var1_1 = cz.a ^ var1_1;
                                                                    var3_2 = v0 ^ 99952883388430L;
                                                                    var5_3 = v0 ^ 132417309559008L;
                                                                    var7_4 = m44.a("h", (long)-7024578354696106816L, (long)var1_1);
                                                                    v1 = m44.a("l", (long)-7316452855936162879L, (long)var1_1);
                                                                    v2 = m44.a("l", (long)-9211551602309926188L, (long)var1_1);
                                                                    if (var7_4 == false) ** GOTO lbl173
                                                                    if (v1 != v2) break block45;
                                                                    break block58;
                                                                    catch (IOException v3) {
                                                                        throw m44.a("h", (Object)v3, (long)-7038296477740160826L, (long)var1_1);
                                                                    }
                                                                }
                                                                v4 = m44.a("l", (long)-9211551602309926188L, (long)var1_1);
                                                                v5 = m44.a("l", (long)-9014570728396041904L, (long)var1_1);
                                                                v6 = var7_4;
                                                                if (var1_1 < 0L) ** GOTO lbl112
                                                                if (v6 == false) break block46;
                                                                break block59;
                                                                catch (IOException v7) {
                                                                    throw m44.a("h", (Object)v7, (long)-7038296477740160826L, (long)var1_1);
                                                                }
                                                            }
                                                            if (var1_1 < 0L) break block46;
                                                            if (v4 != v5) ** GOTO lbl103
                                                            break block60;
                                                            catch (IOException v8) {
                                                                throw m44.a("h", (Object)v8, (long)-7038296477740160826L, (long)var1_1);
                                                            }
                                                        }
                                                        v9 = m44.a("l", (long)-7173472126948453796L, (long)var1_1);
                                                        v10 = var7_4;
                                                        if (var1_1 < 0L) ** GOTO lbl70
                                                        if (v10 == false) break block47;
                                                        break block61;
                                                        catch (IOException v11) {
                                                            throw m44.a("h", (Object)v11, (long)-7038296477740160826L, (long)var1_1);
                                                        }
                                                    }
                                                    if (var1_1 <= 0L) break block47;
                                                    if (v9 <= cz.a("a", (int)10720, (long)(4955264009709702141L ^ var1_1))) ** GOTO lbl61
                                                    break block62;
                                                    catch (IOException v12) {
                                                        throw m44.a("h", (Object)v12, (long)-7038296477740160826L, (long)var1_1);
                                                    }
                                                }
                                                try {
                                                    block63: {
                                                        m44.a("k", (int)0, (long)-7316452855936162879L, (long)var1_1);
                                                        m44.a("k", (int)0, (long)-7135953566785446210L, (long)var1_1);
                                                        m44.a("k", (int)m44.a("l", (long)-7173472126948453796L, (long)var1_1), (long)-9211551602309926188L, (long)var1_1);
                                                        v9 = var7_4;
                                                        if (var1_1 < 0L) ** GOTO lbl171
                                                        if (v9 != false) break block45;
                                                        break block63;
                                                        catch (IOException v13) {
                                                            throw m44.a("h", (Object)v13, (long)-7038296477740160826L, (long)var1_1);
                                                        }
                                                    }
                                                    v9 = m44.a("l", (long)-7173472126948453796L, (long)var1_1);
                                                }
                                                catch (IOException v14) {
                                                    throw m44.a("h", (Object)v14, (long)-7038296477740160826L, (long)var1_1);
                                                }
                                            }
                                            if (var1_1 < 0L) ** GOTO lbl100
                                            v10 = var7_4;
lbl70:
                                            // 2 sources

                                            if (v10 == false) break block48;
                                            if (v9 >= 0) ** GOTO lbl86
                                            break block64;
                                            catch (IOException v15) {
                                                throw m44.a("h", (Object)v15, (long)-7038296477740160826L, (long)var1_1);
                                            }
                                        }
                                        try {
                                            block65: {
                                                m44.a("k", (int)0, (long)-7316452855936162879L, (long)var1_1);
                                                m44.a("k", (int)0, (long)-7135953566785446210L, (long)var1_1);
                                                v9 = var7_4;
                                                if (var1_1 < 0L) ** GOTO lbl171
                                                if (v9 != false) break block45;
                                                break block65;
                                                catch (IOException v16) {
                                                    throw m44.a("h", (Object)v16, (long)-7038296477740160826L, (long)var1_1);
                                                }
                                            }
                                            v17 = false;
                                        }
                                        catch (IOException v18) {
                                            throw m44.a("h", (Object)v18, (long)-7038296477740160826L, (long)var1_1);
                                        }
                                    }
                                    try {
                                        v19 = new Object[2];
                                        v19[1] = v17;
                                        v19[0] = var3_2;
                                        m44.a("h", (Object)v19, (long)-9008467877071868610L, (long)var1_1);
                                        v9 = var7_4;
lbl100:
                                        // 2 sources

                                        if (var1_1 > 0L) {
                                            if (v9 != false) break block45;
                                        }
                                        ** GOTO lbl171
lbl103:
                                        // 2 sources

                                        v4 = m44.a("l", (long)-9211551602309926188L, (long)var1_1);
                                        v5 = m44.a("l", (long)-7173472126948453796L, (long)var1_1);
                                    }
                                    catch (IOException v20) {
                                        throw m44.a("h", (Object)v20, (long)-7038296477740160826L, (long)var1_1);
                                    }
                                }
                                if (var1_1 <= 0L) break block49;
                                v6 = var7_4;
lbl112:
                                // 2 sources

                                if (v6 == false) break block49;
                                if (v4 <= v5) ** GOTO lbl127
                                break block66;
                                catch (IOException v21) {
                                    throw m44.a("h", (Object)v21, (long)-7038296477740160826L, (long)var1_1);
                                }
                            }
                            m44.a("k", (int)m44.a("l", (long)-9014570728396041904L, (long)var1_1), (long)-9211551602309926188L, (long)var1_1);
                            v9 = var7_4;
                            if (var1_1 <= 0L) ** GOTO lbl171
                            if (v9 != false) break block45;
                            break block67;
                            catch (IOException v22) {
                                throw m44.a("h", (Object)v22, (long)-7038296477740160826L, (long)var1_1);
                            }
                        }
                        try {
                            block68: {
                                v4 = m44.a("l", (long)-7173472126948453796L, (long)var1_1);
                                v23 = -9211551602309926188L;
                                v24 = var1_1;
                                if (var1_1 < 0L) break block50;
                                v4 = v4 - m44.a("l", (long)v23, (long)v24);
                                if (var7_4 == false) break block51;
                                break block68;
                                catch (IOException v25) {
                                    throw m44.a("h", (Object)v25, (long)-7038296477740160826L, (long)var1_1);
                                }
                            }
                            v5 = cz.a("a", (int)10720, (long)(4955264009709702141L ^ var1_1));
                        }
                        catch (IOException v26) {
                            throw m44.a("h", (Object)v26, (long)-7038296477740160826L, (long)var1_1);
                        }
                    }
                    if (v4 >= v5) ** GOTO lbl158
                    try {
                        block69: {
                            v27 = new Object[2];
                            v27[1] = true;
                            v27[0] = var3_2;
                            m44.a("h", (Object)v27, (long)-9008467877071868610L, (long)var1_1);
                            v9 = var7_4;
                            if (var1_1 <= 0L) ** GOTO lbl171
                            if (v9 != false) break block45;
                            break block69;
                            catch (IOException v28) {
                                throw m44.a("h", (Object)v28, (long)-7038296477740160826L, (long)var1_1);
                            }
                        }
                        v4 = m44.a("l", (long)-7173472126948453796L, (long)var1_1);
                    }
                    catch (IOException v29) {
                        throw m44.a("h", (Object)v29, (long)-7038296477740160826L, (long)var1_1);
                    }
                }
                v23 = -9211551602309926188L;
                v24 = var1_1;
            }
            m44.a("k", (int)v4, (long)v23, (long)v24);
        }
        try {
            block52: {
                block53: {
                    block54: {
                        v9 = m44.a("w", (Object)m44.a("l", (long)-8897323265656855710L, (long)var1_1), (Object)m44.a("l", (long)-8810667091935360397L, (long)var1_1), (int)m44.a("l", (long)-7316452855936162879L, (long)var1_1), (int)(m44.a("l", (long)-9211551602309926188L, (long)var1_1) - m44.a("l", (long)-7316452855936162879L, (long)var1_1)), (long)-7076368046806513049L, (long)var1_1);
lbl171:
                        // 6 sources

                        v2 = v9;
                        v1 = v9;
lbl173:
                        // 2 sources

                        var8_5 = v2;
                        if (var1_1 <= 0L) break block52;
                        v30 /* !! */  = -1;
                        if (var7_4 == false) break block53;
                        try {
                            block70: {
                                if (v1 != v30 /* !! */ ) break block54;
                                break block70;
                                catch (IOException v31) {
                                    throw m44.a("h", (Object)v31, (long)-7038296477740160826L, (long)var1_1);
                                }
                            }
                            m44.a("w", (Object)m44.a("l", (long)-8897323265656855710L, (long)var1_1), (long)-9160186907368245613L, (long)var1_1);
                            throw new IOException();
                        }
                        catch (IOException v32) {
                            throw m44.a("h", (Object)v32, (long)-7038296477740160826L, (long)var1_1);
                        }
                    }
                    v33 = m44.a("l", (long)-7316452855936162879L, (long)var1_1);
                    v30 /* !! */  = (int)var8_5;
                }
                v1 = v33 + v30 /* !! */ ;
            }
            m44.a("k", (int)v1, (long)-7316452855936162879L, (long)var1_1);
            return;
        }
        catch (IOException var9_6) {
            block57: {
                block55: {
                    block56: {
                        try {
                            try {
                                v34 = m44.a("l", (long)-7135953566785446210L, (long)var1_1) - true;
                                v35 = -7135953566785446210L;
                                v36 = var1_1;
                                if (var1_1 <= 0L) break block55;
                                m44.a("k", (int)v34, (long)v35, (long)v36);
                                v37 = new Object[2];
                                v37[1] = 0;
                                v37[0] = var5_3;
                                m44.a("h", (Object)v37, (long)-9024123590845195593L, (long)var1_1);
                                v34 = m44.a("l", (long)-7173472126948453796L, (long)var1_1);
                                if (var7_4 == false) break block56;
                                if (v34 != -1) break block57;
                            }
                            catch (IOException v38) {
                                throw m44.a("h", (Object)v38, (long)-7038296477740160826L, (long)var1_1);
                            }
                            v34 = m44.a("l", (long)-7135953566785446210L, (long)var1_1);
                        }
                        catch (IOException v39) {
                            throw m44.a("h", (Object)v39, (long)-7038296477740160826L, (long)var1_1);
                        }
                    }
                    v35 = -7173472126948453796L;
                    v36 = var1_1;
                }
                m44.a("k", (int)v34, (long)v35, (long)v36);
            }
            throw var9_6;
        }
    }

    public static void T(Object[] objectArray) {
        block5: {
            reference v22;
            long l10;
            block4: {
                l10 = (Long)objectArray[0];
                int n10 = (Integer)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("o", (long)-6116785955287598753L, (long)l10);
                m44.a("l", (int)(m44.a("k", (long)-6121489412272016862L, (long)l10) + n10), (long)-6121489412272016862L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        reference v22 = m44.a("k", (long)-6239912478145680607L, (long)l10) - n10;
                        v22 = v22;
                        m44.a("l", (int)v12, (long)-6239912478145680607L, (long)l10);
                        if (callSite2 == false) break block4;
                        if (v22 >= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-6067032575159755431L, (long)l10);
                    }
                    v22 = m44.a("k", (long)-6239912478145680607L, (long)l10) + m44.a("k", (long)-5225671935901637425L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-6067032575159755431L, (long)l10);
                }
            }
            m44.a("l", (int)v22, (long)-6239912478145680607L, (long)l10);
        }
    }

    /*
     * Loose catch block
     * Could not resolve type clashes
     */
    protected static void N(Object[] objectArray) {
        long l10;
        block10: {
            l10 = (Long)objectArray[0];
            int n10 = ((Boolean)objectArray[1]).booleanValue();
            l10 = a ^ l10;
            char[] cArray = new char[m44.a("m", (long)-5794851198998414303L, (long)l10) + cz.a("a", (int)28440, (long)(0x1C20C7A940522075L ^ l10))];
            int[] nArray = new int[m44.a("m", (long)-5794851198998414303L, (long)l10) + cz.a("a", (int)10720, (long)(0x44C4E07AA524668CL ^ l10))];
            CallSite callSite = m44.a("i", (long)-5511189255586819399L, (long)l10);
            int[] nArray2 = new int[m44.a("m", (long)-5794851198998414303L, (long)l10) + cz.a("a", (int)10720, (long)(0x44C4E07AA524668CL ^ l10))];
            try {
                Object object;
                block8: {
                    block9: {
                        block11: {
                            object = n10;
                            if (callSite != false) break block8;
                            if (object == 0) break block9;
                            break block11;
                            catch (Throwable throwable) {
                                throw m44.a("i", (Object)throwable, (long)-5538389041620712009L, (long)l10);
                            }
                        }
                        try {
                            block12: {
                                System.arraycopy(m44.a("m", (long)-6283793806112708862L, (long)l10), (int)m44.a("m", (long)-5691433662479827155L, (long)l10), cArray, 0, (int)(m44.a("m", (long)-5794851198998414303L, (long)l10) - m44.a("m", (long)-5691433662479827155L, (long)l10)));
                                System.arraycopy(m44.a("m", (long)-6283793806112708862L, (long)l10), 0, cArray, (int)(m44.a("m", (long)-5794851198998414303L, (long)l10) - m44.a("m", (long)-5691433662479827155L, (long)l10)), (int)m44.a("m", (long)-5653915085271174193L, (long)l10));
                                m44.a("j", (char[])cArray, (long)-6283793806112708862L, (long)l10);
                                System.arraycopy(m44.a("m", (long)-6232517108810785308L, (long)l10), (int)m44.a("m", (long)-5691433662479827155L, (long)l10), nArray, 0, (int)(m44.a("m", (long)-5794851198998414303L, (long)l10) - m44.a("m", (long)-5691433662479827155L, (long)l10)));
                                System.arraycopy(m44.a("m", (long)-6232517108810785308L, (long)l10), 0, nArray, (int)(m44.a("m", (long)-5794851198998414303L, (long)l10) - m44.a("m", (long)-5691433662479827155L, (long)l10)), (int)m44.a("m", (long)-5653915085271174193L, (long)l10));
                                m44.a("j", (int[])nArray, (long)-6232517108810785308L, (long)l10);
                                System.arraycopy(m44.a("m", (long)-6337215157198633240L, (long)l10), (int)m44.a("m", (long)-5691433662479827155L, (long)l10), nArray2, 0, (int)(m44.a("m", (long)-5794851198998414303L, (long)l10) - m44.a("m", (long)-5691433662479827155L, (long)l10)));
                                System.arraycopy(m44.a("m", (long)-6337215157198633240L, (long)l10), 0, nArray2, (int)(m44.a("m", (long)-5794851198998414303L, (long)l10) - m44.a("m", (long)-5691433662479827155L, (long)l10)), (int)m44.a("m", (long)-5653915085271174193L, (long)l10));
                                m44.a("j", (int[])nArray2, (long)-6337215157198633240L, (long)l10);
                                reference v22 = m44.a("m", (long)-5653915085271174193L, (long)l10) + (m44.a("m", (long)-5794851198998414303L, (long)l10) - m44.a("m", (long)-5691433662479827155L, (long)l10));
                                m44.a("j", (int)v22, (long)-5653915085271174193L, (long)l10);
                                m44.a("j", (int)v22, (long)-5257953929879466320L, (long)l10);
                                if (callSite == false) break block10;
                                break block12;
                                catch (Throwable throwable) {
                                    throw m44.a("i", (Object)throwable, (long)-5538389041620712009L, (long)l10);
                                }
                            }
                            m44.a("i", "pgXSBc", (long)-5242684132563265859L, (long)l10);
                        }
                        catch (Throwable throwable) {
                            throw m44.a("i", (Object)throwable, (long)-5538389041620712009L, (long)l10);
                        }
                    }
                    System.arraycopy(m44.a("m", (long)-6283793806112708862L, (long)l10), (int)m44.a("m", (long)-5691433662479827155L, (long)l10), cArray, 0, (int)(m44.a("m", (long)-5794851198998414303L, (long)l10) - m44.a("m", (long)-5691433662479827155L, (long)l10)));
                    m44.a("j", (char[])cArray, (long)-6283793806112708862L, (long)l10);
                    System.arraycopy(m44.a("m", (long)-6232517108810785308L, (long)l10), (int)m44.a("m", (long)-5691433662479827155L, (long)l10), nArray, 0, (int)(m44.a("m", (long)-5794851198998414303L, (long)l10) - m44.a("m", (long)-5691433662479827155L, (long)l10)));
                    m44.a("j", (int[])nArray, (long)-6232517108810785308L, (long)l10);
                    System.arraycopy(m44.a("m", (long)-6337215157198633240L, (long)l10), (int)m44.a("m", (long)-5691433662479827155L, (long)l10), nArray2, 0, (int)(m44.a("m", (long)-5794851198998414303L, (long)l10) - m44.a("m", (long)-5691433662479827155L, (long)l10)));
                    m44.a("j", (int[])nArray2, (long)-6337215157198633240L, (long)l10);
                    reference v52 = m44.a("m", (long)-5653915085271174193L, (long)l10) - m44.a("m", (long)-5691433662479827155L, (long)l10);
                    object = v52;
                    m44.a("j", (int)v52, (long)-5653915085271174193L, (long)l10);
                }
                m44.a("j", (int)object, (long)-5257953929879466320L, (long)l10);
            }
            catch (Throwable throwable) {
                throw new Error((String)((Object)m44.a("v", (Object)throwable, (long)-6204534379601880988L, (long)l10)));
            }
        }
        m44.a("j", (int)(m44.a("m", (long)-5794851198998414303L, (long)l10) + cz.a("a", (int)10720, (long)(0x44C4E07AA524668CL ^ l10))), (long)-5794851198998414303L, (long)l10);
        m44.a("j", (int)m44.a("m", (long)-5794851198998414303L, (long)l10), (long)-5955803003972690011L, (long)l10);
        m44.a("j", (int)0, (long)-5691433662479827155L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    cz.a = prr.a(2146089619304084630L, 2550610306425564352L, MethodHandles.lookup().lookupClass()).a(183020926911197L);
                    var14 = cz.a ^ 19436510761316L;
                    var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                        v2 = v2;
                        v2[var12_2] = (byte)(var14 << var12_2 * 8 >>> 56);
                    }
                    break block12;
lbl13:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var13_3 = var11_1.doFinal("\u00ddR\u00e0st\u00bf\u00b2H\u00d1\u00dd\u00dcX\u0015\u00d1\u0006\u00bd\u000e\u00a9w\u00f498\u00de\u00d2hb\u00d8E\u0015\f{\"'\u00b7<\u0007\u00f5\u009e\u00e0\u001e\u00f3\u0010p\u00a67\u00cf\u0089\u00e1#\u007f9\u0001\u0093\u0018\u0000\u009a\u00b1\u0092\u00b2\rX\u00f8F\n\u00b1\u00cc\u00ef\u00b8\u00ddH\u008e\u0012\u00f1\\\u00f8\u0085\u00b2\u0095\u00af\u00df\u00fcc;\u007f\u00123AF\u0010;\u000b\u0093\u001dR\u00be\u0016\u00e4\u001e\u00dcN'\u00f0\u00bc\u00bbNF\u00ce\u00ded\u00e9\u001d\u001d!\u00b8\u00db\u00c7\u00ae>\u0010\u00f3\u00d4\u00e7\u00b4\u0007G\u00cf*S\u0081z\u00db\u008b\u00ae\u001a\u00a8DAl<\u0000\u0085\u008d1\u0094\u0089\u00db\u0000\u0016\u00be>\u0018\\H\u0017>RP(n\u00c7J\u00fb\u00d4R\u0097\u00f9V3\u000f\u0086+\u00d3nxu\t\u009e(\u00ad\u00ac\u00ee\u00b7\u0003\u000eMN\u00ec\u00e3\u0005\"2jd\u0001\u00a3@\u008c\u00cd\u0097y".getBytes("ISO-8859-1"));
                ** while (true)
                cz.b = cz.a(var13_3).intern();
                cz.f = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var14 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v5 = v5;
                    v5[var1_5] = (byte)(var14 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_6 = new long[6];
                var3_7 = 0;
                var4_8 = ".L\u0080\u001a\u000e\u00bb\f\u0099\u008d\u00a1\u001a\u00c5\u009d(\u0089\u00d8\rT\u00f1e\u008a\u0083X-}\u00f5R\u0011c\u00daT\u00d2";
                var5_9 = ".L\u0080\u001a\u000e\u00bb\f\u0099\u008d\u00a1\u001a\u00c5\u009d(\u0089\u00d8\rT\u00f1e\u008a\u0083X-}\u00f5R\u0011c\u00daT\u00d2".length();
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
                    var4_8 = "\u00fa\u009b\u00a2\u00b60\u00dd\u00d8_\u00dee\u00a6\u00c8X\u00a2\u00a87";
                    var5_9 = "\u00fa\u009b\u00a2\u00b60\u00dd\u00d8_\u00dee\u00a6\u00c8X\u00a2\u00a87".length();
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
        cz.c = var6_6;
        cz.e = new Integer[6];
        m44.a("o", (int)-1, (long)4556569304092179834L, (long)var14);
        m44.a("o", (int)0, (long)4427076828881144316L, (long)var14);
        m44.a("o", (int)1, (long)2532140795209685930L, (long)var14);
        m44.a("o", (boolean)false, (long)4373862044939009901L, (long)var14);
        m44.a("o", (boolean)false, (long)2404723163636226735L, (long)var14);
        m44.a("o", (int)0, (long)4157547370588323845L, (long)var14);
        m44.a("o", (int)0, (long)4420097056668099705L, (long)var14);
        m44.a("o", (int)cz.a("a", (int)21317, (long)(7707664423732908697L ^ var14)), (long)2849312838476793879L, (long)var14);
    }

    public cz(Reader reader, int n10, int n11, int n12, long l10) {
        Object object;
        block4: {
            block5: {
                l10 = a ^ l10;
                CallSite callSite = m44.a("o", (long)9190871461636681167L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        object = m44.a("k", (long)7316515903588631149L, (long)l10);
                        if (callSite2 == false) break block4;
                        if (object == null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)9177726321591830985L, (long)l10);
                    }
                    throw new Error(b);
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)9177726321591830985L, (long)l10);
                }
            }
            object = reader;
        }
        m44.a("l", (Reader)object, (long)7316515903588631149L, (long)l10);
        m44.a("l", (int)n10, (long)7055153641025493345L, (long)l10);
        m44.a("l", (int)(n11 - 1), (long)9203997078207695671L, (long)l10);
        int n13 = n12;
        m44.a("l", (int)n13, (long)7199822579668889695L, (long)l10);
        m44.a("l", (int)n13, (long)7000521595570820059L, (long)l10);
        m44.a("l", (char[])new char[n12], (long)7256740629469326204L, (long)l10);
        m44.a("l", (int[])new int[n12], (long)7349807804703183258L, (long)l10);
        m44.a("l", (int[])new int[n12], (long)7238363874515716758L, (long)l10);
    }

    public static char W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x4B03E620ED16L;
        m44.a("k", (int)-1, (long)7929357696428777508L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        CallSite callSite = m44.a("h", (Object)objectArray2, (long)8013564850930984227L, (long)l10);
        m44.a("k", (int)m44.a("l", (long)7962374873201093830L, (long)l10), (long)7929357696428777508L, (long)l10);
        return (char)callSite;
    }

    public static int Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("m", (long)8522439641927751840L, (long)l10)[m44.a("m", (long)8019660712706810213L, (long)l10)];
    }

    public static int L(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("h", (long)5986612971284998001L, (long)l10)[m44.a("h", (long)5446797327493334456L, (long)l10)];
    }

    public static int w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("k", (long)6413050407193619610L, (long)l10)[m44.a("k", (long)4681315634830279345L, (long)l10)];
    }

    /*
     * WARNING - void declaration
     */
    public void n(Object[] objectArray) {
        long l10;
        long l11;
        int n10;
        block10: {
            void v13;
            int n11;
            long l12;
            block11: {
                boolean bl2;
                boolean bl3;
                block12: {
                    block13: {
                        Object object;
                        int n12;
                        block8: {
                            Reader reader = (Reader)objectArray[0];
                            int n13 = (Integer)objectArray[1];
                            int n14 = (Integer)objectArray[2];
                            n12 = (Integer)objectArray[3];
                            l12 = (Long)objectArray[4];
                            l12 = a ^ l12;
                            m44.a("n", (Reader)reader, (long)8152497084334380743L, (long)l12);
                            m44.a("n", (int)n13, (long)8449580077220220363L, (long)l12);
                            CallSite callSite = m44.a("m", (long)7721008636762012005L, (long)l12);
                            m44.a("n", (int)(n14 - 1), (long)7714993847331233693L, (long)l12);
                            CallSite callSite2 = callSite;
                            try {
                                block9: {
                                    try {
                                        try {
                                            try {
                                                object = m44.a("i", (long)8079211111198818262L, (long)l12);
                                                if (callSite2 == false) break block8;
                                                if (object == null) break block9;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("m", (Object)n92, (long)7779922048330423651L, (long)l12);
                                            }
                                            n10 = n12;
                                            long l10 = 8079211111198818262L;
                                            l10 = l12;
                                            if (l12 < 0L) break block10;
                                            n11 = ((CallSite)m44.a("i", (long)l11, (long)l10)).length;
                                            if (callSite2 == false) break block11;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("m", (Object)n93, (long)7779922048330423651L, (long)l12);
                                        }
                                        if (l12 < 0L) break block12;
                                        if (n10 == n11) break block13;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("m", (Object)n94, (long)7779922048330423651L, (long)l12);
                                    }
                                }
                                int n15 = n12;
                                m44.a("n", (int)n15, (long)8593124179699377397L, (long)l12);
                                m44.a("n", (int)n15, (long)8470384528039217009L, (long)l12);
                                object = new char[n12];
                            }
                            catch (n9 n95) {
                                throw m44.a("m", (Object)n95, (long)7779922048330423651L, (long)l12);
                            }
                        }
                        m44.a("n", (char[])object, (long)8079211111198818262L, (long)l12);
                        m44.a("n", (int[])new int[n12], (long)8166648820184581424L, (long)l12);
                        m44.a("n", (int[])new int[n12], (long)8131764812352495164L, (long)l12);
                    }
                    m44.a("n", (boolean)false, (long)7697246289686522124L, (long)l12);
                    m44.a("n", (boolean)false, (long)8592377797834607822L, (long)l12);
                    boolean bl2 = false;
                    bl2 = false;
                }
                m44.a("n", (int)(bl3 ? 1 : 0), (long)8057955280540178020L, (long)l12);
                n11 = bl2;
                v13 = bl2;
            }
            m44.a("n", (int)n11, (long)7725465798552187416L, (long)l12);
            m44.a("n", (int)v13, (long)7626725425217972217L, (long)l12);
            n10 = -1;
            long l10 = 7592267768088406811L;
            l10 = l12;
        }
        m44.a("n", (int)n10, (long)l11, (long)l10);
    }

    public static char[] j(Object[] objectArray) {
        Object object;
        block9: {
            char[] cArray;
            block10: {
                long l10;
                int n10;
                block6: {
                    n10 = (Integer)objectArray[0];
                    l10 = (Long)objectArray[1];
                    l10 = a ^ l10;
                    cArray = new char[n10];
                    CallSite callSite = m44.a("i", (long)-282467702601474775L, (long)l10);
                    try {
                        long l11;
                        long l12;
                        block7: {
                            block8: {
                                try {
                                    try {
                                        if (callSite != false) break block6;
                                        l12 = -136962164201669537L;
                                        l11 = l10;
                                        if (l10 < 0L) break block7;
                                        if (m44.a("m", (long)l12, (long)l11) + true < n10) break block8;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("i", (Object)n92, (long)-237675870663259609L, (long)l10);
                                    }
                                    object = m44.a("m", (long)-1775736158932866926L, (long)l10);
                                    if (l10 < 0L) break block9;
                                    System.arraycopy(object, (int)(m44.a("m", (long)-136962164201669537L, (long)l10) - n10 + true), cArray, 0, n10);
                                    if (callSite == false) break block10;
                                }
                                catch (n9 n93) {
                                    throw m44.a("i", (Object)n93, (long)-237675870663259609L, (long)l10);
                                }
                            }
                            l12 = -1775736158932866926L;
                            l11 = l10;
                        }
                        System.arraycopy(m44.a("m", (long)l12, (long)l11), (int)(m44.a("m", (long)-2304534565238819919L, (long)l10) - (n10 - m44.a("m", (long)-136962164201669537L, (long)l10) - 1)), cArray, 0, n10 - m44.a("m", (long)-136962164201669537L, (long)l10) - 1);
                    }
                    catch (n9 n94) {
                        throw m44.a("i", (Object)n94, (long)-237675870663259609L, (long)l10);
                    }
                }
                System.arraycopy(m44.a("m", (long)-1775736158932866926L, (long)l10), 0, cArray, n10 - m44.a("m", (long)-136962164201669537L, (long)l10) - 1, (int)(m44.a("m", (long)-136962164201669537L, (long)l10) + true));
            }
            object = cArray;
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    protected static void J(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[CASE]], but top level block is 10[TRYBLOCK]
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

    public static int s(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("l", (long)1890566176899658969L, (long)l10)[m44.a("l", (long)268053958344098302L, (long)l10)];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6DC3;
        if (e[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/cz", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cz.e[n11] = n12;
        }
        return e[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = cz.a(n10, l10);
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
            throw new RuntimeException("com/zelix/cz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

