/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.f1;
import com.zelix.g6;
import com.zelix.gl;
import com.zelix.l6e;
import com.zelix.lwz;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.yp;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lu3 {
    private final int Y;
    private final String S;
    private final yp N;
    private final boolean g;
    private final f1 W;
    private final boolean Q;
    private final gl O;
    private List f;
    private final l6e t;
    private static final long a = prr.a(166054604520150766L, 5312186045773459624L, MethodHandles.lookup().lookupClass()).a(46676191454828L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;

    public boolean S(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("u", (Object)this, (long)1751469627420646233L, (long)l10) != null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("k", (Object)illegalArgumentException, (long)473411853385619973L, (long)l10);
        }
        return bl2;
    }

    public boolean a(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("u", (Object)this, (long)5864241637238404041L, (long)l10) == m44.a("o", (long)6330772260494597109L, (long)l10);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("k", (Object)illegalArgumentException, (long)5431813858476431349L, (long)l10);
        }
        return bl2;
    }

    public int Z(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("t", (Object)this, (long)-342578995108829083L, (long)l10).size();
    }

    public boolean P(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("r", (Object)this, (long)-2204894942135532594L, (long)l10) == m44.a("h", (long)-173581702454148324L, (long)l10);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("l", (Object)illegalArgumentException, (long)-331306057028950030L, (long)l10);
        }
        return bl2;
    }

    void b(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        g6 g62 = (g6)((Object)objectArray[1]);
        long l10 = (Long)objectArray[2];
        boolean bl2 = (Boolean)objectArray[3];
        long l11 = (l10 = a ^ l10) ^ 0x45E414393412L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = false;
        objectArray2[4] = l11;
        objectArray2[3] = false;
        objectArray2[2] = bl2;
        objectArray2[1] = g62;
        objectArray2[0] = n10;
        m44.a("q", (Object)this, (Object)objectArray2, (long)-4158884283355522221L, (long)l10);
    }

    public yp w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("r", (Object)this, (long)-8722510702475568840L, (long)l10);
    }

    public boolean f(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("u", (Object)this, (long)8881597993804454377L, (long)l10) == m44.a("o", (long)8687426445480070495L, (long)l10);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("k", (Object)illegalArgumentException, (long)7008044189990993365L, (long)l10);
        }
        return bl2;
    }

    public boolean E(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("w", (Object)this, (long)-5002501053027215301L, (long)l10) == m44.a("m", (long)-4666719607616602031L, (long)l10);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("i", (Object)illegalArgumentException, (long)-6875907470743176185L, (long)l10);
        }
        return bl2;
    }

    public List r(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return Collections.unmodifiableList(m44.a("r", (Object)this, (long)7899537895621967611L, (long)l10));
    }

    public boolean x(Object[] objectArray) {
        Object object;
        block6: {
            long l10 = (Long)objectArray[0];
            long l11 = (l10 = a ^ l10) ^ 0x22902EB179C6L;
            Iterator iterator = m44.a("w", (Object)this, (long)4653855602928489422L, (long)l10).iterator();
            CallSite callSite = m44.a("i", (long)6822389197875263561L, (long)l10);
            while (iterator.hasNext()) {
                block8: {
                    boolean bl2;
                    block7: {
                        lwz lwz2 = (lwz)iterator.next();
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l11;
                                object = m44.a("v", (Object)lwz2, (Object)objectArray2, (long)5155010055880120640L, (long)l10);
                                CallSite callSite2 = callSite;
                                if (l10 > 0L) {
                                    if (callSite2 != false) break block6;
                                    callSite2 = callSite;
                                }
                                if (callSite2 != false) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("i", (Object)illegalArgumentException, (long)6474954793856337231L, (long)l10);
                            }
                            if (!object) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("i", (Object)illegalArgumentException, (long)6474954793856337231L, (long)l10);
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                if (callSite == false) continue;
            }
            object = false;
        }
        return object;
    }

    public boolean b(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("s", (Object)this, (long)6421996162033154999L, (long)l10) == m44.a("i", (long)6749799522883761082L, (long)l10);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("m", (Object)illegalArgumentException, (long)4836819983025971083L, (long)l10);
        }
        return bl2;
    }

    public boolean d(Object[] objectArray) {
        Object object;
        block6: {
            long l10 = (Long)objectArray[0];
            long l11 = (l10 = a ^ l10) ^ 0x7004149F687DL;
            Iterator iterator = m44.a("v", (Object)this, (long)5326899457689098935L, (long)l10).iterator();
            CallSite callSite = m44.a("h", (long)6328926380706050352L, (long)l10);
            while (iterator.hasNext()) {
                block8: {
                    boolean bl2;
                    block7: {
                        lwz lwz2 = (lwz)iterator.next();
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l11;
                                object = m44.a("w", (Object)lwz2, (Object)objectArray2, (long)5211285571966692181L, (long)l10);
                                CallSite callSite2 = callSite;
                                if (l10 > 0L) {
                                    if (callSite2 != false) break block6;
                                    callSite2 = callSite;
                                }
                                if (callSite2 != false) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("h", (Object)illegalArgumentException, (long)5810359037803433014L, (long)l10);
                            }
                            if (!object) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("h", (Object)illegalArgumentException, (long)5810359037803433014L, (long)l10);
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                if (callSite == false) continue;
            }
            object = false;
        }
        return object;
    }

    public boolean k(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("q", (Object)this, (long)-7661610972076578056L, (long)l10);
    }

    public boolean I(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("v", (Object)this, (long)-3398237609883941178L, (long)l10);
    }

    public int q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x3D756110929CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (int)m44.a("s", (Object)m44.a("r", (Object)this, (long)5815684161155327805L, (long)l10), (Object)objectArray2, (long)5562930198609761875L, (long)l10);
    }

    public static String a(Object[] objectArray) {
        CallSite callSite;
        lu3 lu32;
        long l10;
        block7: {
            lu3 lu33;
            block8: {
                l10 = (Long)objectArray[0];
                lu33 = (lu3)objectArray[1];
                l10 = a ^ l10;
                CallSite callSite2 = m44.a("l", (long)4987975126591087580L, (long)l10);
                try {
                    try {
                        lu32 = lu33;
                        callSite = m44.a("h", (long)5178456810266671637L, (long)l10);
                        if (callSite2 != false) break block7;
                        if (lu32 != callSite) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)4777913704876744410L, (long)l10);
                    }
                    return "I";
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)4777913704876744410L, (long)l10);
                }
            }
            lu32 = lu33;
            callSite = m44.a("h", (long)4754533200228789406L, (long)l10);
        }
        try {
            if (lu32 == callSite) {
                return "J";
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("l", (Object)illegalArgumentException, (long)4777913704876744410L, (long)l10);
        }
        return null;
    }

    void s(Object[] objectArray) {
        block4: {
            int n10;
            int n11 = (Integer)objectArray[0];
            g6 g62 = (g6)((Object)objectArray[1]);
            boolean bl2 = (Boolean)objectArray[2];
            boolean bl3 = (Boolean)objectArray[3];
            long l10 = (Long)objectArray[4];
            boolean bl4 = (Boolean)objectArray[5];
            long l11 = (l10 = a ^ l10) ^ 0x70E82CD67E9BL;
            if (m44.a("r", (Object)this, (long)8973635397381107667L, (long)l10).size() > 0) {
                lwz lwz2 = (lwz)m44.a("r", (Object)this, (long)8973635397381107667L, (long)l10).get(m44.a("r", (Object)this, (long)8973635397381107667L, (long)l10).size() - 1);
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    n10 = m44.a("s", (Object)lwz2, (Object)objectArray2, (long)7301822403642818995L, (long)l10);
                    if (l10 <= 0L) break block4;
                    if (n10 >= n11) {
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l11;
                        throw new IllegalArgumentException((String)((Object)lu3.a("h", (int)14781, (long)(0x32EADD7EB9EFD4AL ^ l10))) + (int)m44.a("s", (Object)lwz2, (Object)objectArray3, (long)7301822403642818995L, (long)l10) + (String)((Object)lu3.a("h", (int)22400, (long)(0x7848098355999374L ^ l10))) + n11);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)7333753340666526034L, (long)l10);
                }
            }
            n10 = m44.a("r", (Object)this, (long)8973635397381107667L, (long)l10).add(new lwz(n11, g62, bl2, bl3, bl4, null));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean T(Object[] objectArray) {
        CallSite callSite;
        lu3 lu32;
        long l10;
        block6: {
            l10 = (Long)objectArray[0];
            lu3 lu33 = (lu3)objectArray[1];
            l10 = a ^ l10;
            CallSite callSite2 = m44.a("j", (long)-3034010734404596582L, (long)l10);
            try {
                try {
                    lu32 = lu33;
                    callSite = m44.a("n", (long)-3905887257914952701L, (long)l10);
                    if (callSite2 == false) break block6;
                    if (lu32 == callSite) return true;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)-3722053564764090164L, (long)l10);
                }
                lu32 = lu33;
                callSite = m44.a("n", (long)-3463991649014340984L, (long)l10);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("j", (Object)illegalArgumentException, (long)-3722053564764090164L, (long)l10);
            }
        }
        try {
            if (lu32 != callSite) return false;
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("j", (Object)illegalArgumentException, (long)-3722053564764090164L, (long)l10);
        }
    }

    public boolean g(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("q", (Object)this, (long)-7413936999178931L, (long)l10) == m44.a("k", (long)-419369135446507414L, (long)l10);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("o", (Object)illegalArgumentException, (long)-1880819855961573007L, (long)l10);
        }
        return bl2;
    }

    public String u(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)this, (long)288465176117501518L, (long)l10);
    }

    /*
     * WARNING - void declaration
     */
    public static int P(Object[] objectArray) {
        Object object;
        block14: {
            CallSite callSite;
            Object object2;
            CallSite callSite2;
            long l10;
            long l11;
            long l12;
            lu3 lu32;
            long l13;
            block11: {
                block12: {
                    l13 = (Long)objectArray[0];
                    lu32 = (lu3)objectArray[1];
                    long l14 = l13 = a ^ l13;
                    l12 = l14 ^ 0x52820B729976L;
                    l11 = l14 ^ 0x202B69738BD1L;
                    l10 = l14 ^ 0x536B32D5AC36L;
                    long l15 = l14 ^ 0x22EECCB984ACL;
                    callSite2 = m44.a("l", (long)-2805488384472399884L, (long)l13);
                    try {
                        try {
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l15;
                            object2 = m44.a("s", (Object)lu32, (Object)objectArray2, (long)-4341258608271416982L, (long)l13);
                            if (callSite2 != false) break block11;
                            if (object2 == false) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)-2421053214148427022L, (long)l13);
                        }
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l10;
                        return (int)m44.a("s", (Object)lu32, (Object)objectArray3, (long)-4337607120967640573L, (long)l13);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-2421053214148427022L, (long)l13);
                    }
                }
                object2 = false;
            }
            CallSite callSite3 = object2;
            do {
                block13: {
                    void var13_9;
                    block15: {
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l10;
                        if (var13_9 >= m44.a("s", (Object)lu32, (Object)objectArray4, (long)-4337607120967640573L, (long)l13)) break;
                        Object[] objectArray5 = new Object[2];
                        objectArray5[1] = (int)var13_9;
                        objectArray5[0] = l11;
                        CallSite callSite4 = m44.a("s", (Object)lu32, (Object)objectArray5, (long)-2871269995523536186L, (long)l13);
                        try {
                            try {
                                try {
                                    callSite = callSite2;
                                    if (l13 < 0L) continue;
                                    if (callSite != false) break block13;
                                    Object[] objectArray6 = new Object[1];
                                    objectArray6[0] = l12;
                                    object = m44.a("s", (Object)callSite4, (Object)objectArray6, (long)-2854760599893858245L, (long)l13);
                                    if (callSite2 != false) break block14;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)-2421053214148427022L, (long)l13);
                                }
                                if (object == 0) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("l", (Object)illegalArgumentException, (long)-2421053214148427022L, (long)l13);
                            }
                            return (int)var13_9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)-2421053214148427022L, (long)l13);
                        }
                    }
                    ++var13_9;
                }
                callSite = callSite2;
            } while (callSite == false);
            object = -1;
        }
        return object;
    }

    public boolean A(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("s", (Object)this, (long)5778016196729598599L, (long)l10) == m44.a("i", (long)5918880507499850271L, (long)l10);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("m", (Object)illegalArgumentException, (long)5345762038266926779L, (long)l10);
        }
        return bl2;
    }

    public String X(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return ((String)((Object)m44.a("v", (Object)this, (long)-7328012673802551293L, (long)l10))).substring(0, ((String)((Object)m44.a("v", (Object)this, (long)-7328012673802551293L, (long)l10))).indexOf((int)e));
    }

    public boolean q(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("r", (Object)this, (long)3044121387417602198L, (long)l10) == m44.a("h", (long)3723321760120801166L, (long)l10);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("l", (Object)illegalArgumentException, (long)3476410695893675178L, (long)l10);
        }
        return bl2;
    }

    public static int B(Object[] objectArray) {
        Object object;
        block10: {
            long l10 = (Long)objectArray[0];
            lu3 lu32 = (lu3)objectArray[1];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x52686F7095A8L;
            long l13 = l11 ^ 0x492AB46AE002L;
            long l14 = l11 ^ 0x212834D6B24FL;
            long l15 = l11 ^ 0x38686700F8C0L;
            int n10 = 0;
            CallSite callSite = m44.a("m", (long)-4077563685109063283L, (long)l10);
            do {
                block13: {
                    Object object2;
                    block11: {
                        block12: {
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l14;
                            if (n10 >= m44.a("r", (Object)lu32, (Object)objectArray2, (long)-2471127038329109382L, (long)l10)) break;
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = n10;
                            objectArray3[0] = l12;
                            CallSite callSite2 = m44.a("r", (Object)lu32, (Object)objectArray3, (long)-4152809900842019649L, (long)l10);
                            try {
                                try {
                                    try {
                                        try {
                                            Object[] objectArray4 = new Object[1];
                                            objectArray4[0] = l13;
                                            object = m44.a("r", (Object)callSite2, (Object)objectArray4, (long)-2427952641354596220L, (long)l10);
                                            CallSite callSite3 = callSite;
                                            if (l10 > 0L) {
                                                if (callSite3 != false) break block10;
                                                callSite3 = callSite;
                                            }
                                            if (callSite3 != false) break block11;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("m", (Object)illegalArgumentException, (long)-4602746238039843701L, (long)l10);
                                        }
                                        if (object != 0) break block12;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("m", (Object)illegalArgumentException, (long)-4602746238039843701L, (long)l10);
                                    }
                                    Object[] objectArray5 = new Object[1];
                                    objectArray5[0] = l15;
                                    object2 = m44.a("r", (Object)callSite2, (Object)objectArray5, (long)-2814893865143698456L, (long)l10);
                                    if (callSite != false) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("m", (Object)illegalArgumentException, (long)-4602746238039843701L, (long)l10);
                                }
                                if (object2 == 0) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("m", (Object)illegalArgumentException, (long)-4602746238039843701L, (long)l10);
                            }
                        }
                        object2 = n10;
                    }
                    return object2;
                }
                ++n10;
            } while (callSite == false);
            object = -1;
        }
        return object;
    }

    lu3(int n10, f1 f12, gl gl2, boolean bl2, boolean bl3, long l10, String string, l6e l6e2, yp yp2) {
        l10 = a ^ l10;
        m44.a("v", (Object)this, new ArrayList(), (long)6626730305777338541L, (long)l10);
        this.Y = n10;
        this.W = f12;
        this.O = gl2;
        this.Q = bl2;
        this.g = bl3;
        this.t = l6e2;
        this.N = yp2;
        this.S = string;
    }

    lu3(int n10, long l10, f1 f12, gl gl2, boolean bl2, boolean bl3, String string) {
        long l11 = (l10 = a ^ l10) ^ 0x3F864815BADBL;
        this(n10, f12, gl2, bl2, bl3, l11, string, null, (yp)((Object)m44.a("m", (long)8615277429930380610L, (long)l10)));
    }

    /*
     * Exception decompiling
     */
    public boolean i(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    public boolean y(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("s", (Object)this, (long)5505615356212899535L, (long)l10) == m44.a("i", (long)5351904772703102957L, (long)l10);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("m", (Object)illegalArgumentException, (long)6226097434111445747L, (long)l10);
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public boolean U(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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

    public l6e o(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)this, (long)725179919036713223L, (long)l10);
    }

    lu3(int n10, f1 f12, gl gl2, boolean bl2, String string, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x1627F3E8F3B1L;
        this(n10, l11, f12, gl2, bl2, true, string);
    }

    public static int v(Object[] objectArray) {
        Object object;
        block8: {
            CallSite callSite;
            long l10 = (Long)objectArray[0];
            lu3 lu32 = (lu3)objectArray[1];
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x32BD2FB89E41L;
            long l13 = l11 ^ 0x41FD741EB9A6L;
            long l14 = l11 ^ 0x6882B6B45576L;
            int n10 = 0;
            CallSite callSite2 = m44.a("l", (long)-3710695905540527516L, (long)l10);
            do {
                block7: {
                    block9: {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l13;
                        if (n10 >= m44.a("s", (Object)lu32, (Object)objectArray2, (long)-3000052830992085101L, (long)l10)) break;
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = n10;
                        objectArray3[0] = l12;
                        CallSite callSite3 = m44.a("s", (Object)lu32, (Object)objectArray3, (long)-3623390332976226474L, (long)l10);
                        try {
                            try {
                                try {
                                    callSite = callSite2;
                                    if (l10 <= 0L) continue;
                                    if (callSite != false) break block7;
                                    Object[] objectArray4 = new Object[1];
                                    objectArray4[0] = l14;
                                    object = m44.a("s", (Object)callSite3, (Object)objectArray4, (long)-3184390330556080412L, (long)l10);
                                    if (callSite2 != false) break block8;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)-3749630988115339422L, (long)l10);
                                }
                                if (object == 0) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("l", (Object)illegalArgumentException, (long)-3749630988115339422L, (long)l10);
                            }
                            return n10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)-3749630988115339422L, (long)l10);
                        }
                    }
                    ++n10;
                }
                callSite = callSite2;
            } while (callSite == false);
            object = -1;
        }
        return object;
    }

    lu3(int n10, f1 f12, gl gl2, boolean bl2, long l10, String string, l6e l6e2, yp yp2) {
        long l11 = (l10 = a ^ l10) ^ 0xFD47400F48L;
        this(n10, f12, gl2, bl2, true, l11, string, l6e2, yp2);
    }

    void e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        g6 g62 = (g6)((Object)objectArray[2]);
        boolean bl2 = (Boolean)objectArray[3];
        boolean bl3 = (Boolean)objectArray[4];
        long l11 = (l10 = a ^ l10) ^ 0x3556DA9DCED8L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = false;
        objectArray2[4] = l11;
        objectArray2[3] = bl3;
        objectArray2[2] = bl2;
        objectArray2[1] = g62;
        objectArray2[0] = n10;
        m44.a("s", (Object)this, (Object)objectArray2, (long)4360289787035738521L, (long)l10);
    }

    public lwz n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        l10 = a ^ l10;
        return (lwz)m44.a("s", (Object)this, (long)-2532824573491998846L, (long)l10).get(n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0x2D8B7FE23865L;
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
        String string = "\u001c\u0095\u00d3\u00a40;\u0084\nzP7L\u0019\u00a5\u00b4=\u00cd?P\n\u00b55\u00d3\u0085P\u00f6\u0085#\u00b3x\u009aOh{\u0013}\u001bj\u009ex\u00f6\no\u00a9\u00aa\f\u0018\u00aa\u00f7\u0084\u00a8\u0095\u00ca\u009e\u00a4\u0093\u0019\u0085\u00e8\u008d\u00cc\u001f\u00fc\u00aan\u00c5\u00b4\u0016\b\u00a5\\8\u00c23\u00f2'\u001c\u0007\u00e2a\r\u00a5\u001f\u00da;[\u00da\u0001\u0091D\u00aeB+\u00b7\u0005SI9\u00b3\u00ae\u00de`\u00b5=q\u00c2\u009f\u00d5A\u00be\u00bb\u009e\u0082\u00c1\u0019\u00b9\u00fed\u00a6<\u00b8\u00fe,\u00d7D\u00e7(q\u0080H\u0013Mn\u00a2DD\u00e3\u0010\u00bd~\u0081\u009f&\u00fd\u00f5{<?rP\u00e2 \u00a7\u00ce";
        int n11 = "\u001c\u0095\u00d3\u00a40;\u0084\nzP7L\u0019\u00a5\u00b4=\u00cd?P\n\u00b55\u00d3\u0085P\u00f6\u0085#\u00b3x\u009aOh{\u0013}\u001bj\u009ex\u00f6\no\u00a9\u00aa\f\u0018\u00aa\u00f7\u0084\u00a8\u0095\u00ca\u009e\u00a4\u0093\u0019\u0085\u00e8\u008d\u00cc\u001f\u00fc\u00aan\u00c5\u00b4\u0016\b\u00a5\\8\u00c23\u00f2'\u001c\u0007\u00e2a\r\u00a5\u001f\u00da;[\u00da\u0001\u0091D\u00aeB+\u00b7\u0005SI9\u00b3\u00ae\u00de`\u00b5=q\u00c2\u009f\u00d5A\u00be\u00bb\u009e\u0082\u00c1\u0019\u00b9\u00fed\u00a6<\u00b8\u00fe,\u00d7D\u00e7(q\u0080H\u0013Mn\u00a2DD\u00e3\u0010\u00bd~\u0081\u009f&\u00fd\u00f5{<?rP\u00e2 \u00a7\u00ce".length();
        int n12 = 32;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lu3.a(byArray3).intern();
            if ((n13 += n12) >= n11) break;
            n12 = string.charAt(n13);
        }
        b = stringArray;
        c = new String[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n15 = 1;
        while (true) {
            if (n15 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = 334786043704488797L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                e = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n15] = (byte)(l10 << n15 * 8 >>> 56);
            ++n15;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x32FD;
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
                throw new RuntimeException("com/zelix/lu3", exception);
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
            lu3.c[n11] = lu3.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lu3.a(n10, l10);
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
            throw new RuntimeException("com/zelix/lu3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lu3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

