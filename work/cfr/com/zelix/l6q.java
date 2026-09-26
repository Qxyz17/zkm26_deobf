/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.f33;
import com.zelix.m44;
import com.zelix.me;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.w9;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.InvocationTargetException;
import java.security.Key;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class l6q
implements me {
    private final boolean L;
    Map o;
    private final boolean J;
    private w9 P;
    private int T;
    private static final long a;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;

    public l6q(long l10, l6q l6q2) {
        l6q l6q3;
        CallSite callSite;
        block17: {
            block18: {
                int n10;
                long l11;
                block19: {
                    l6q l6q4;
                    Object object;
                    block15: {
                        long l12 = l10 = a ^ l10;
                        l11 = l12 ^ 0x72DD698ABC27L;
                        long l13 = l12 ^ 0x363565B6D3C7L;
                        int n11 = (int)(l13 >>> 32);
                        int n12 = (int)(l13 << 32 >>> 48);
                        int n13 = (int)(l13 << 48 >>> 48);
                        this.T = (int)l6q.a("t", (int)26227, (long)(0x537DF9EF3F962128L ^ l10));
                        this.P = null;
                        this.J = l6q2.J;
                        this.L = m44.a("s", (Object)l6q2, (long)4113190578946779837L, (long)l10);
                        this.T = l6q2.T;
                        n10 = cf.x(l6q2.o.size(), n11, (char)n12, (short)n13);
                        callSite = m44.a("m", (long)4250015256102577357L, (long)l10);
                        try {
                            try {
                                block16: {
                                    try {
                                        try {
                                            object = this.J;
                                            if (callSite != null) break block15;
                                            if (!object) break block16;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("m", (Object)n92, (long)2398847079366007162L, (long)l10);
                                        }
                                        l6q3 = this;
                                        if (l10 < 0L) break block17;
                                        l6q3.o = new ConcurrentHashMap(n10);
                                        if (callSite == null) break block18;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("m", (Object)n93, (long)2398847079366007162L, (long)l10);
                                    }
                                }
                                l6q4 = this;
                                if (callSite != null) break block19;
                            }
                            catch (n9 n94) {
                                throw m44.a("m", (Object)n94, (long)2398847079366007162L, (long)l10);
                            }
                            object = m44.a("s", (Object)l6q4, (long)4113190578946779837L, (long)l10);
                        }
                        catch (n9 n95) {
                            throw m44.a("m", (Object)n95, (long)2398847079366007162L, (long)l10);
                        }
                    }
                    try {
                        block20: {
                            try {
                                if (!object) break block20;
                                l6q3 = this;
                                if (l10 < 0L) break block17;
                                l6q3.o = new IdentityHashMap(n10);
                                if (callSite == null) break block18;
                            }
                            catch (n9 n96) {
                                throw m44.a("m", (Object)n96, (long)2398847079366007162L, (long)l10);
                            }
                        }
                        l6q4 = this;
                    }
                    catch (n9 n97) {
                        throw m44.a("m", (Object)n97, (long)2398847079366007162L, (long)l10);
                    }
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l11;
                objectArray[0] = n10;
                l6q4.o = m44.a("m", (Object)objectArray, (long)4100033730727755014L, (long)l10);
            }
            l6q3 = l6q2;
        }
        for (Map.Entry entry : l6q3.o.entrySet()) {
            CallSite callSite2;
            block22: {
                AbstractList abstractList;
                block23: {
                    List list;
                    block21: {
                        list = (List)entry.getValue();
                        if (!this.J) break block21;
                        abstractList = new Vector((Collection)entry.getValue());
                        callSite2 = callSite;
                        if (l10 < 0L) break block22;
                        if (callSite2 == null) break block23;
                    }
                    abstractList = new ArrayList(list);
                }
                this.o.put(entry.getKey(), abstractList);
                callSite2 = callSite;
            }
            if (callSite2 == null) continue;
        }
    }

    @Override
    public int Q(Object[] objectArray) {
        int n10;
        block3: {
            long l10 = (Long)objectArray[0];
            int n11 = 0;
            CallSite callSite = m44.a("o", (long)-3122897539923195233L, (long)l10);
            for (List list : this.o.values()) {
                if (l10 > 0L) {
                    n10 = n11 + list.size();
                    if (callSite != null) break block3;
                    n11 = n10;
                }
                if (callSite == null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    @Override
    public boolean J(short s10, Object object, int n10, char c10) {
        return this.o.containsKey(object);
    }

    private void P(Object object, char c10, Collection collection, long l10, boolean bl2) {
        block21: {
            AbstractList abstractList;
            CallSite callSite;
            long l11;
            block19: {
                Object object2;
                block23: {
                    block20: {
                        w9 w92;
                        block17: {
                            block18: {
                                l11 = ((long)c10 << 48 | l10 << 16 >>> 16) ^ a;
                                long l12 = l11 ^ 0x152BB5FCE275L;
                                callSite = m44.a("h", (long)1641138619563444464L, (long)l11);
                                try {
                                    try {
                                        w92 = this.P;
                                        if (callSite != null) break block17;
                                        if (w92 != null) {
                                        }
                                        break block18;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)n92, (long)970246508297663815L, (long)l11);
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = this.P;
                                    objectArray[0] = l12;
                                    m44.a("h", (Object)objectArray, (long)755153288353251892L, (long)l11);
                                    this.P = null;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)n93, (long)970246508297663815L, (long)l11);
                                }
                            }
                            w92 = this.o.get(object);
                        }
                        abstractList = (ArrayList)((Object)w92);
                        try {
                            if (c10 < '\u0000' || abstractList != null) break block19;
                            if (!this.J) break block20;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)n94, (long)970246508297663815L, (long)l11);
                        }
                        abstractList = new Vector(Math.max(this.T, collection.size()));
                        object2 = callSite;
                        if (c10 < '\u0000') break block19;
                        if (object2 == null) break block23;
                    }
                    abstractList = new ArrayList(Math.max(this.T, collection.size()));
                }
                object2 = this.o.put(object, abstractList);
            }
            try {
                boolean bl3;
                block22: {
                    try {
                        try {
                            bl3 = bl2;
                            if (callSite != null) break block21;
                            if (!bl3) break block22;
                        }
                        catch (n9 n95) {
                            throw m44.a("h", (Object)n95, (long)970246508297663815L, (long)l11);
                        }
                        m44.a("w", abstractList, (int)0, (Object)collection, (long)1299712034028672730L, (long)l11);
                        if (callSite == null) break block21;
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)n96, (long)970246508297663815L, (long)l11);
                    }
                }
                bl3 = abstractList.addAll(collection);
            }
            catch (n9 n97) {
                throw m44.a("h", (Object)n97, (long)970246508297663815L, (long)l11);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean R(Object[] var1_1) {
        block23: {
            block24: {
                block21: {
                    block19: {
                        block20: {
                            var3_2 = (Long)var1_1[0];
                            var5_3 = var1_1[1];
                            var2_4 = var1_1[2];
                            var6_5 = var3_2 ^ 37078418734392L;
                            var8_6 = m44.a("m", (long)-3923960795388979267L, (long)var3_2);
                            try {
                                try {
                                    v0 /* !! */  = this.P;
                                    if (var8_6 != null) break block19;
                                    if (v0 /* !! */  != null) {
                                    }
                                    break block20;
                                }
                                catch (n9 v1) {
                                    throw m44.a("m", (Object)v1, (long)-3298263732116526582L, (long)var3_2);
                                }
                                v2 = new Object[2];
                                v2[1] = this.P;
                                v2[0] = var6_5;
                                m44.a("m", (Object)v2, (long)-3082745309348668039L, (long)var3_2);
                                this.P = null;
                            }
                            catch (n9 v3) {
                                throw m44.a("m", (Object)v3, (long)-3298263732116526582L, (long)var3_2);
                            }
                        }
                        v0 /* !! */  = this.o.get(var5_3);
                    }
                    var9_7 = (List)v0 /* !! */ ;
                    try {
                        if (var9_7 == null) {
                            return false;
                        }
                    }
                    catch (n9 v4) {
                        throw m44.a("m", (Object)v4, (long)-3298263732116526582L, (long)var3_2);
                    }
                    var10_8 = 0;
                    var11_9 = var9_7.iterator();
                    while (var11_9.hasNext()) {
                        block22: {
                            try {
                                try {
                                    v5 = var11_9.next();
lbl42:
                                    // 2 sources

                                    while (true) {
                                        v6 = v5.equals(var2_4);
                                        v7 = var8_6;
                                        if (var3_2 > 0L) {
                                            if (v7 != null) break block21;
                                            if (var8_6 != null) break block22;
                                        }
                                        ** GOTO lbl67
                                        break;
                                    }
                                }
                                catch (n9 v8) {
                                    throw m44.a("m", (Object)v8, (long)-3298263732116526582L, (long)var3_2);
                                }
                                if (v6 == 0) continue;
                            }
                            catch (n9 v9) {
                                throw m44.a("m", (Object)v9, (long)-3298263732116526582L, (long)var3_2);
                            }
                            var11_9.remove();
                            v10 = var10_8 = 1;
                        }
                        if (var8_6 == null) continue;
                    }
                    v5 = var9_7;
                    ** while (var3_2 < 0L)
lbl62:
                    // 1 sources

                    v6 = v5.size();
                }
                try {
                    try {
                        v7 = var8_6;
lbl67:
                        // 2 sources

                        if (v7 != null) break block23;
                        if (v6 != 0) break block24;
                    }
                    catch (n9 v11) {
                        throw m44.a("m", (Object)v11, (long)-3298263732116526582L, (long)var3_2);
                    }
                    this.o.remove(var5_3);
                }
                catch (n9 v12) {
                    throw m44.a("m", (Object)v12, (long)-3298263732116526582L, (long)var3_2);
                }
            }
            v6 = var10_8;
        }
        return (boolean)v6;
    }

    public boolean J(Object[] objectArray) {
        return this.J;
    }

    public List H(Object[] objectArray) {
        Object object;
        block5: {
            List list;
            Object object2;
            block6: {
                int n10 = (Integer)objectArray[0];
                object2 = objectArray[1];
                int n11 = (Integer)objectArray[2];
                list = (List)objectArray[3];
                int n12 = (Integer)objectArray[4];
                long l10 = ((long)n10 << 56 | (long)n11 << 32 >>> 8 | (long)n12 << 40 >>> 40) ^ a;
                long l11 = l10 ^ 0x43B47F18F2D7L;
                CallSite callSite = m44.a("j", (long)460537587097213010L, (long)l10);
                try {
                    try {
                        object = this.P;
                        if (callSite != null) break block5;
                        if (object != null) {
                        }
                        break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)2149717378034902501L, (long)l10);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = this.P;
                    objectArray2[0] = l11;
                    m44.a("j", (Object)objectArray2, (long)1934438383319749270L, (long)l10);
                    this.P = null;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)2149717378034902501L, (long)l10);
                }
            }
            object = this.o.put(object2, list);
        }
        return (List)object;
    }

    /*
     * Unable to fully structure code
     */
    public void f(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var2_2 = l6q.a ^ var2_2;
        var5_3 = this.o.values().iterator();
        var4_4 = m44.a("n", (long)7906197127822537614L, (long)var2_2);
        while (var5_3.hasNext()) {
            block20: {
                block21: {
                    block22: {
                        block19: {
                            block24: {
                                block23: {
                                    var6_5 = (List)var5_3.next();
                                    v0 = var6_5 instanceof Vector;
                                    if (var2_2 <= 0L || var4_4 != null) break block19;
                                    if (!v0) ** GOTO lbl25
                                    break block23;
                                    catch (NoSuchMethodException v1) {
                                        throw m44.a("n", (Object)v1, (long)8505338752446975545L, (long)var2_2);
                                    }
                                }
                                m44.a("q", (Object)((Vector)var6_5), (long)8221917526714914240L, (long)var2_2);
                                v2 = var4_4;
                                if (var2_2 <= 0L) break block20;
                                if (v2 == null) break block21;
                                break block24;
                                catch (NoSuchMethodException v3) {
                                    throw m44.a("n", (Object)v3, (long)8505338752446975545L, (long)var2_2);
                                }
                            }
                            try {
                                block25: {
                                    v4 = var6_5;
                                    if (var4_4 != null) ** GOTO lbl50
                                    break block25;
                                    catch (NoSuchMethodException v5) {
                                        throw m44.a("n", (Object)v5, (long)8505338752446975545L, (long)var2_2);
                                    }
                                }
                                v0 = v4 instanceof ArrayList;
                            }
                            catch (NoSuchMethodException v6) {
                                throw m44.a("n", (Object)v6, (long)8505338752446975545L, (long)var2_2);
                            }
                        }
                        try {
                            if (!v0) break block22;
                            ((ArrayList)var6_5).trimToSize();
                            v2 = var4_4;
                            if (var2_2 < 0L) break block20;
                            if (v2 == null) break block21;
                        }
                        catch (NoSuchMethodException v7) {
                            throw m44.a("n", (Object)v7, (long)8505338752446975545L, (long)var2_2);
                        }
                    }
                    try {
                        v4 = var6_5;
lbl50:
                        // 2 sources

                        var7_6 = v4.getClass();
                        v8 = new Class[]{};
                        v9 = var7_6;
                        var8_10 = v9.getMethod(f33.b(l6q.b, v9, v8), v8);
                        v10 = var8_10;
                        if (var4_4 != null) break block21;
                        try {
                            block26: {
                                if (v10 == null) break block21;
                                break block26;
                                catch (NoSuchMethodException v11) {
                                    throw m44.a("n", (Object)v11, (long)8505338752446975545L, (long)var2_2);
                                }
                            }
                            v10 = var8_10.invoke(var6_5, new Object[0]);
                        }
                        catch (NoSuchMethodException v12) {
                            throw m44.a("n", (Object)v12, (long)8505338752446975545L, (long)var2_2);
                        }
                    }
                    catch (NoSuchMethodException var7_7) {
                    }
                    catch (InvocationTargetException var7_8) {
                    }
                    catch (IllegalAccessException var7_9) {
                        // empty catch block
                    }
                }
                v2 = var4_4;
            }
            if (v2 == null) continue;
        }
    }

    public l6q(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x3342790CEF44L;
        this(false, n10, 5, l11, false);
    }

    l6q(boolean bl2, int n10, int n11, long l10, boolean bl3) {
        block12: {
            boolean bl4;
            int n12;
            CallSite callSite;
            long l11;
            block10: {
                long l12 = l10 = a ^ l10;
                l11 = l12 ^ 0xF5F44D002FEL;
                long l13 = l12 ^ 0x4BB748EC6D1EL;
                int n13 = (int)(l13 >>> 32);
                int n14 = (int)(l13 << 32 >>> 48);
                int n15 = (int)(l13 << 48 >>> 48);
                this.T = (int)l6q.a("t", (int)31279, (long)(0x1C675C6EEB3603AFL ^ l10));
                this.P = null;
                this.T = n11;
                callSite = m44.a("l", (long)-8925452928779118060L, (long)l10);
                this.L = bl2;
                this.J = bl3;
                n12 = cf.x(n10, n13, (char)n14, (short)n15);
                try {
                    block11: {
                        try {
                            try {
                                bl4 = bl3;
                                if (callSite != null) break block10;
                                if (!bl4) break block11;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)n92, (long)-6948184272272185437L, (long)l10);
                            }
                            this.o = new ConcurrentHashMap(n12);
                            if (callSite == null) break block12;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)n93, (long)-6948184272272185437L, (long)l10);
                        }
                    }
                    bl4 = bl2;
                }
                catch (n9 n94) {
                    throw m44.a("l", (Object)n94, (long)-6948184272272185437L, (long)l10);
                }
            }
            try {
                block13: {
                    try {
                        if (!bl4) break block13;
                        this.o = new IdentityHashMap(n12);
                        if (callSite == null) break block12;
                    }
                    catch (n9 n95) {
                        throw m44.a("l", (Object)n95, (long)-6948184272272185437L, (long)l10);
                    }
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l11;
                objectArray[0] = n12;
                this.o = m44.a("l", (Object)objectArray, (long)-8773219372148784161L, (long)l10);
            }
            catch (n9 n96) {
                throw m44.a("l", (Object)n96, (long)-6948184272272185437L, (long)l10);
            }
        }
    }

    @Override
    public int w(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.o.size();
    }

    public l6q(boolean bl2, long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x37B26A02873FL;
        this(bl2, n10, 5, l11, false);
    }

    @Override
    public boolean e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return (boolean)m44.a("u", (Object)this.o, (long)4789035369793381943L, (long)l10);
    }

    public void Q(Object[] objectArray) {
        Object object = objectArray[0];
        Collection collection = (Collection)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x421762555CD6L;
        int n10 = (int)(l11 >>> 48);
        long l12 = l11 << 16 >>> 16;
        this.P(object, (char)n10, collection, l12, true);
    }

    @Override
    public Set H(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.o.keySet();
    }

    public l6q(int n10, int n11, short s10, int n12, boolean bl2, char c10) {
        long l10 = ((long)s10 << 48 | (long)n12 << 32 >>> 16 | (long)c10 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x3950DFE24593L;
        this(false, n10, n11, l11, bl2);
    }

    public l6q(short s10, int n10, int n11) {
        long l10 = ((long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x22A17F4F2563L;
        this(false, (int)l6q.a("t", (int)15996, (long)(0x7812874D530B3993L ^ l10)), 5, l11, false);
    }

    public l6q(long l10, boolean bl2) {
        long l11 = (l10 = a ^ l10) ^ 0x4D2E3F291E60L;
        this(false, (int)l6q.a("t", (int)7559, (long)(0x6D1C584C7E8C2169L ^ l10)), 5, l11, bl2);
    }

    public void u(Object object, Collection collection, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0xD05EA73C5D8L;
        int n10 = (int)(l11 >>> 48);
        long l12 = l11 << 16 >>> 16;
        this.P(object, (char)n10, collection, l12, false);
    }

    @Override
    public Set D(long l10) {
        return this.o.entrySet();
    }

    @Override
    public List u(Object[] objectArray) {
        w9 w92;
        block5: {
            Object object;
            block6: {
                object = objectArray[0];
                long l10 = (Long)objectArray[1];
                long l11 = l10 ^ 0x169D5588ECDEL;
                CallSite callSite = m44.a("k", (long)1760200846252246619L, (long)l10);
                try {
                    try {
                        w92 = this.P;
                        if (callSite != null) break block5;
                        if (w92 != null) {
                        }
                        break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)278099174959954924L, (long)l10);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = this.P;
                    objectArray2[0] = l11;
                    m44.a("k", (Object)objectArray2, (long)347292141362842783L, (long)l10);
                    this.P = null;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)278099174959954924L, (long)l10);
                }
            }
            w92 = this.o.remove(object);
        }
        return (List)((Object)w92);
    }

    @Override
    public boolean w(Object[] objectArray) {
        Object object;
        List list;
        block4: {
            Object object2;
            block5: {
                List list2;
                block6: {
                    Object object3 = objectArray[0];
                    long l10 = (Long)objectArray[1];
                    object2 = objectArray[2];
                    list2 = (List)this.o.get(object3);
                    CallSite callSite = m44.a("o", (long)698414953867253639L, (long)l10);
                    try {
                        try {
                            list = list2;
                            object = callSite;
                            if (l10 < 0L) break block4;
                            if (object != null) break block5;
                            if (list != null) break block6;
                        }
                        catch (n9 n92) {
                            throw m44.a("o", (Object)n92, (long)1297098665419090480L, (long)l10);
                        }
                        return false;
                    }
                    catch (n9 n93) {
                        throw m44.a("o", (Object)n93, (long)1297098665419090480L, (long)l10);
                    }
                }
                list = list2;
            }
            object = object2;
        }
        return list.contains(object);
    }

    @Override
    public synchronized Enumeration U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return Collections.enumeration(this.o.keySet());
    }

    public l6q(int n10, boolean bl2, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x7027CBF98C09L;
        this(false, n10, 5, l11, bl2);
    }

    @Override
    public Enumeration H(Object[] objectArray) {
        List list;
        block4: {
            List list2;
            block5: {
                long l10 = (Long)objectArray[0];
                Object object = objectArray[1];
                CallSite callSite = m44.a("n", (long)468435717504637110L, (long)l10);
                list = list2 = (List)this.o.get(object);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (list != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)2103545116871107841L, (long)l10);
                    }
                    return null;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)2103545116871107841L, (long)l10);
                }
            }
            list = list2;
        }
        return Collections.enumeration(list);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void K(Object[] var1_1) {
        block19: {
            block20: {
                var3_2 = (Long)var1_1[0];
                var2_3 = (l6q)var1_1[1];
                var5_4 = (var3_2 = l6q.a ^ var3_2) ^ 15176814787149L;
                var7_5 = m44.a("h", (long)-8142958895802183480L, (long)var3_2);
                try {
                    try {
                        v0 = this;
                        if (var7_5 != null) break block19;
                        if (v0.P != null) {
                        }
                        break block20;
                    }
                    catch (n9 v1) {
                        throw m44.a("h", (Object)v1, (long)-7687896450549764737L, (long)var3_2);
                    }
                    v2 = new Object[2];
                    v2[1] = this.P;
                    v2[0] = var5_4;
                    m44.a("h", (Object)v2, (long)-7907530344287954420L, (long)var3_2);
                    this.P = null;
                }
                catch (n9 v3) {
                    throw m44.a("h", (Object)v3, (long)-7687896450549764737L, (long)var3_2);
                }
            }
            v0 = var2_3;
        }
        for (Map.Entry<K, V> var9_7 : v0.o.entrySet()) {
            block23: {
                block24: {
                    block21: {
                        block25: {
                            block22: {
                                var10_8 = var9_7.getKey();
                                var11_9 = (List)var9_7.getValue();
                                var12_10 = (List)this.o.get(var10_8);
                                try {
                                    try {
                                        v4 = var12_10;
                                        if (var7_5 != null) break block21;
                                        if (v4 == null) {
                                        }
                                        ** GOTO lbl58
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("h", (Object)v5, (long)-7687896450549764737L, (long)var3_2);
                                    }
                                    if (!this.J) break block22;
                                }
                                catch (n9 v6) {
                                    throw m44.a("h", (Object)v6, (long)-7687896450549764737L, (long)var3_2);
                                }
                                var13_11 /* !! */  = new Vector<E>(var11_9);
                                v7 = var7_5;
                                if (var3_2 < 0L) ** GOTO lbl56
                                if (v7 == null) break block25;
                            }
                            var13_11 /* !! */  = new ArrayList<E>(var11_9);
                        }
                        try {
                            this.o.put(var10_8, var13_11 /* !! */ );
                            v7 = var7_5;
lbl56:
                            // 2 sources

                            if (var3_2 < 0L) break block23;
                            if (v7 == null) break block24;
lbl58:
                            // 2 sources

                            v4 = var12_10;
                        }
                        catch (n9 v8) {
                            throw m44.a("h", (Object)v8, (long)-7687896450549764737L, (long)var3_2);
                        }
                    }
                    v4.addAll(var11_9);
                }
                v7 = var7_5;
            }
            if (v7 == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void h(Object[] objectArray) {
        block11: {
            block9: {
                w9 w92;
                l6q l6q2;
                long l10;
                long l11;
                block10: {
                    CallSite callSite;
                    block8: {
                        l11 = (Long)objectArray[0];
                        l10 = l11 ^ 0x4E748518AAAFL;
                        Iterator iterator = this.o.values().iterator();
                        callSite = m44.a("j", (long)6781336637669720106L, (long)l11);
                        block6: while (iterator.hasNext()) {
                            List list = (List)iterator.next();
                            try {
                                list.clear();
                                while (l11 > 0L && callSite == null) {
                                    if (callSite == null) continue block6;
                                    if (l11 < 0L) continue;
                                    break block6;
                                }
                                break block8;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)n92, (long)5020767360647265693L, (long)l11);
                            }
                        }
                        this.o.clear();
                    }
                    try {
                        try {
                            l6q2 = this;
                            if (l11 <= 0L) break block9;
                            w92 = l6q2.P;
                            if (callSite != null) break block10;
                            if (w92 == null) break block11;
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)n93, (long)5020767360647265693L, (long)l11);
                        }
                        w92 = this.P;
                    }
                    catch (n9 n94) {
                        throw m44.a("j", (Object)n94, (long)5020767360647265693L, (long)l11);
                    }
                }
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = w92;
                objectArray2[0] = l10;
                m44.a("j", (Object)objectArray2, (long)4800991912325008110L, (long)l11);
                l6q2 = this;
            }
            l6q2.P = null;
        }
    }

    public l6q(int n10, long l10, int n11) {
        long l11 = (l10 = a ^ l10) ^ 0x4364C1D1F6C8L;
        this(false, n10, n11, l11, false);
    }

    @Override
    public List t(char c10, Object object, int n10, short s10) {
        return (List)this.o.get(object);
    }

    @Override
    public void t(Object object, Object object2, long l10) {
        Object object3;
        ArrayList<Object> arrayList;
        block15: {
            block16: {
                AbstractList abstractList;
                block17: {
                    Object object4;
                    block19: {
                        block18: {
                            w9 w92;
                            CallSite callSite;
                            block13: {
                                block14: {
                                    long l11 = l10 ^ 0x40E7299287FAL;
                                    callSite = m44.a("o", (long)8307218462119259519L, (long)l10);
                                    try {
                                        try {
                                            w92 = this.P;
                                            if (callSite != null) break block13;
                                            if (w92 != null) {
                                            }
                                            break block14;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("o", (Object)n92, (long)7563892071812780232L, (long)l10);
                                        }
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = this.P;
                                        objectArray[0] = l11;
                                        m44.a("o", (Object)objectArray, (long)8067497410230609851L, (long)l10);
                                        this.P = null;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("o", (Object)n93, (long)7563892071812780232L, (long)l10);
                                    }
                                }
                                w92 = this.o.get(object);
                            }
                            abstractList = (ArrayList<Object>)((Object)w92);
                            try {
                                try {
                                    arrayList = abstractList;
                                    object3 = callSite;
                                    if (l10 <= 0L) break block15;
                                    if (object3 != null) break block16;
                                    if (arrayList != null) break block17;
                                }
                                catch (n9 n94) {
                                    throw m44.a("o", (Object)n94, (long)7563892071812780232L, (long)l10);
                                }
                                if (!this.J) break block18;
                            }
                            catch (n9 n95) {
                                throw m44.a("o", (Object)n95, (long)7563892071812780232L, (long)l10);
                            }
                            abstractList = new Vector(this.T);
                            object4 = callSite;
                            if (l10 < 0L) break block17;
                            if (object4 == null) break block19;
                        }
                        abstractList = new ArrayList<Object>(this.T);
                    }
                    object4 = this.o.put(object, abstractList);
                }
                arrayList = abstractList;
            }
            object3 = object2;
        }
        arrayList.add(object3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public Enumeration p(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        v0 = var2_2;
        var4_3 = v0 ^ 71811910836617L;
        v1 = v0 ^ 117074607214588L;
        var6_4 = (int)(v1 >>> 32);
        var7_5 = (int)(v1 << 32 >>> 56);
        var8_6 = (int)(v1 << 40 >>> 40);
        var9_7 = m44.a("m", (long)-5973085692725710035L, (long)var2_2);
        try {
            v2 = this;
            if (var9_7 != null) break block18;
            if (v2.J) {
            }
            ** GOTO lbl52
        }
        catch (n9 v3) {
            throw m44.a("m", (Object)v3, (long)-5284364090364817766L, (long)var2_2);
        }
        var10_8 = this.o;
        synchronized (var10_8) {
            block23: {
                block21: {
                    block18: {
                        block19: {
                            block20: {
                                block24: {
                                    v4 = this.P;
                                    if (var9_7 != null) break block24;
                                    if (v4 != null) ** GOTO lbl34
                                    try {
                                        block25: {
                                            this.P = new w9(var6_4, this, null, (byte)var7_5, var8_6);
                                            if (var2_2 < 0L) break block19;
                                            if (var9_7 == null) break block20;
                                            break block25;
                                            catch (n9 v5) {
                                                throw m44.a("m", (Object)v5, (long)-5284364090364817766L, (long)var2_2);
                                            }
                                        }
                                        v4 = this.P;
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("m", (Object)v6, (long)-5284364090364817766L, (long)var2_2);
                                    }
                                }
                                v7 = new Object[2];
                                v7[1] = v4;
                                v7[0] = var4_3;
                                m44.a("m", (Object)v7, (long)-5250180737215939186L, (long)var2_2);
                            }
                        }
                        try {
                            if (var9_7 == null) break block21;
lbl52:
                            // 2 sources

                            v2 = this;
                        }
                        catch (n9 v8) {
                            throw m44.a("m", (Object)v8, (long)-5284364090364817766L, (long)var2_2);
                        }
                    }
                    try {
                        block22: {
                            try {
                                try {
                                    v9 = v2.P;
                                    if (var9_7 != null) ** GOTO lbl78
                                    if (v9 != null) break block22;
                                }
                                catch (n9 v10) {
                                    throw m44.a("m", (Object)v10, (long)-5284364090364817766L, (long)var2_2);
                                }
                                v11 = this;
                                if (var2_2 <= 0L) break block23;
                                v11.P = new w9(var6_4, this, null, (byte)var7_5, var8_6);
                                if (var9_7 == null) break block21;
                            }
                            catch (n9 v12) {
                                throw m44.a("m", (Object)v12, (long)-5284364090364817766L, (long)var2_2);
                            }
                        }
                        v9 = this.P;
                    }
                    catch (n9 v13) {
                        throw m44.a("m", (Object)v13, (long)-5284364090364817766L, (long)var2_2);
                    }
lbl78:
                    // 2 sources

                    v14 = new Object[2];
                    v14[1] = v9;
                    v14[0] = var4_3;
                    m44.a("m", (Object)v14, (long)-5250180737215939186L, (long)var2_2);
                }
                v11 = this;
            }
            return v11.P;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    l6q.a = prr.a(-2825637176191731300L, 7652117924282439151L, MethodHandles.lookup().lookupClass()).a(60913710728638L);
                    var11 = l6q.a ^ 86979074366919L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    break block12;
lbl13:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var15_3 = var13_1.doFinal("z\u0001\u00a6\u0000\u00c65\u0083\u0015\u00b3\u0096\u00b8\u00a0\u0097\u0014\u00f6\u00f7".getBytes("ISO-8859-1"));
                ** while (true)
                l6q.b = l6q.a(var15_3).intern();
                l6q.e = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var11 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v5 = v5;
                    v5[var1_5] = (byte)(var11 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_6 = new long[4];
                var3_7 = 0;
                var4_8 = "/\u0082\u008d\u0084\u001c\u00967\u00a5\u00c6(\u0098l\u008eSl\u00cc";
                var5_9 = "/\u0082\u008d\u0084\u001c\u00967\u00a5\u00c6(\u0098l\u008eSl\u00cc".length();
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
                    var4_8 = "\u00a8\u00d0\u0087\t\u00fd\u00cf\u0015k\u0017\u0010{\u00d2]\u00d4S\u0005";
                    var5_9 = "\u00a8\u00d0\u0087\t\u00fd\u00cf\u0015k\u0017\u0010{\u00d2]\u00d4S\u0005".length();
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
        l6q.c = var6_6;
        l6q.d = new Integer[4];
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

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x73E3;
        if (d[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/l6q", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            l6q.d[n11] = n12;
        }
        return d[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = l6q.a(n10, l10);
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
            throw new RuntimeException("com/zelix/l6q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(l6q.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

