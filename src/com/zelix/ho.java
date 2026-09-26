/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.lb6;
import com.zelix.lk9;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ho
implements Collection {
    Map Q;
    private static final long a = prr.a((long)3482617461746805836L, (long)5262856632043424928L, MethodHandles.lookup().lookupClass()).a(42488572880011L);
    private static final long b;

    public synchronized boolean addAll(Collection collection) {
        Object object;
        block4: {
            long l = a ^ 0x1E2DA9AD1D56L;
            Iterator iterator = collection.iterator();
            CallSite callSite = m44.a("j", (long)-4461884773571634142L, (long)l);
            while (iterator.hasNext()) {
                try {
                    object = m44.a("u", (Object)this, iterator.next(), (long)-2749907263106629363L, (long)l);
                    if (callSite == null) {
                        if (callSite == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)-2708962803606245655L, (long)l);
                }
            }
            object = true;
        }
        return object;
    }

    @Override
    public int size() {
        return this.Q.size();
    }

    public synchronized Object clone() {
        ho ho2;
        block4: {
            long l;
            long l2 = l = a ^ 0x4BCE5B2E20FAL;
            long l3 = l2 ^ 0x377DA84D2E9EL;
            long l4 = l2 ^ 0x217728FACD5L;
            long l5 = l2 ^ 0x3633D6221EFCL;
            ho ho3 = new ho(l3, this.Q.size());
            CallSite callSite = m44.a("n", (long)-20153413823438450L, (long)l);
            for (Map.Entry entry : this.Q.entrySet()) {
                lb6 lb62 = (lb6)entry.getValue();
                try {
                    ho2 = ho3;
                    if (callSite == null) {
                        Object[] objectArray = new Object[3];
                        objectArray[2] = lb62.U(l5);
                        objectArray[1] = entry.getKey();
                        objectArray[0] = l4;
                        m44.a("q", (Object)ho2, (Object)objectArray, (long)-313633540350229474L, (long)l);
                        if (callSite == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)((Object)n92), (long)-1744158261892967611L, (long)l);
                }
            }
            ho2 = ho3;
        }
        return ho2;
    }

    public synchronized void R(Object[] objectArray) {
        block8: {
            lb6 lb62;
            int n;
            block6: {
                long l = (Long)objectArray[0];
                Object object = objectArray[1];
                n = (Integer)objectArray[2];
                l = a ^ l;
                lb6 lb63 = (lb6)this.Q.get(object);
                CallSite callSite = m44.a("h", (long)-9048176151116735400L, (long)l);
                try {
                    block7: {
                        try {
                            try {
                                lb62 = lb63;
                                if (callSite != null) break block6;
                                if (lb62 != null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)-7341557454938640749L, (long)l);
                            }
                            this.Q.put(object, new lb6(n));
                            if (callSite == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-7341557454938640749L, (long)l);
                        }
                    }
                    lb62 = lb63;
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)((Object)n94), (long)-7341557454938640749L, (long)l);
                }
            }
            lb62.P(n);
        }
    }

    @Override
    public boolean isEmpty() {
        boolean bl;
        block2: {
            block3: {
                long l = a ^ 0x6C72E1A08AC9L;
                CallSite callSite = m44.a("m", (long)6164092185282366397L, (long)l);
                try {
                    bl = this.Q.size();
                    if (callSite != null) break block2;
                    if (bl) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)((Object)n92), (long)5618424091397601654L, (long)l);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void clear() {
        this.Q.clear();
    }

    public synchronized boolean removeAll(Collection collection) {
        int n;
        block9: {
            block8: {
                long l = a ^ 0x522CE83A3889L;
                int n2 = this.Q.size();
                Iterator iterator = collection.iterator();
                CallSite callSite = m44.a("m", (long)-1744160307315541507L, (long)l);
                while (iterator.hasNext()) {
                    try {
                        this.Q.remove(iterator.next());
                        if (callSite == null) {
                            if (callSite == null) continue;
                            break;
                        }
                        break block8;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)-20098318573335754L, (long)l);
                    }
                }
                try {
                    try {
                        n = n2;
                        if (callSite != null) break block9;
                        if (n == this.Q.size()) break block8;
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)((Object)n93), (long)-20098318573335754L, (long)l);
                    }
                    n = 1;
                    break block9;
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)((Object)n94), (long)-20098318573335754L, (long)l);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    public int X(Object[] objectArray) {
        lb6 lb62;
        long l;
        block4: {
            lb6 lb63;
            block5: {
                long l2 = (Long)objectArray[0];
                Object object = objectArray[1];
                l = (l2 = a ^ l2) ^ 0x293E65DDDB51L;
                lb63 = (lb6)this.Q.get(object);
                CallSite callSite = m44.a("k", (long)4185385148288934947L, (long)l2);
                try {
                    try {
                        lb62 = lb63;
                        if (callSite != null) break block4;
                        if (lb62 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)2478842644981176040L, (long)l2);
                    }
                    return 0;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)2478842644981176040L, (long)l2);
                }
            }
            lb62 = lb63;
        }
        return lb62.U(l);
    }

    public ho(long l) {
        long l2 = (l = a ^ l) ^ 0x3D3E6A9A87D8L;
        this(l2, (int)b);
    }

    @Override
    public synchronized Iterator iterator() {
        return this.Q.keySet().iterator();
    }

    @Override
    public synchronized boolean remove(Object object) {
        block9: {
            block10: {
                lb6 lb62;
                CallSite callSite;
                lb6 lb63;
                long l;
                long l2;
                block8: {
                    l2 = a ^ 0x78D686970D3L;
                    l = l2 ^ 0x7A70E5654ED5L;
                    lb63 = (lb6)this.Q.get(object);
                    callSite = m44.a("o", (long)-5795804170404646489L, (long)l2);
                    try {
                        lb62 = lb63;
                        if (callSite != null) break block8;
                        if (lb62 == null) break block9;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-5196365559808539796L, (long)l2);
                    }
                    lb62 = lb63;
                }
                try {
                    Object object2;
                    block11: {
                        try {
                            try {
                                object2 = lb62.U(l);
                                if (callSite != null) break block10;
                                if (object2 != 1) break block11;
                            }
                            catch (n9 n93) {
                                throw m44.a("o", (Object)((Object)n93), (long)-5196365559808539796L, (long)l2);
                            }
                            this.Q.remove(object);
                            if (callSite == null) break block10;
                        }
                        catch (n9 n94) {
                            throw m44.a("o", (Object)((Object)n94), (long)-5196365559808539796L, (long)l2);
                        }
                    }
                    object2 = m44.a("p", (Object)lb63, (Object)new Object[0], (long)-5577208163027340202L, (long)l2);
                }
                catch (n9 n95) {
                    throw m44.a("o", (Object)((Object)n95), (long)-5196365559808539796L, (long)l2);
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object object) {
        return this.Q.containsKey(object);
    }

    /*
     * Unable to fully structure code
     */
    public synchronized boolean add(Object var1_1) {
        block6: {
            block5: {
                var2_2 = ho.a ^ 23397008909352L;
                var4_3 = var2_2 ^ 105515693563370L;
                var7_4 = (lb6)this.Q.get(var1_1);
                var6_5 = m44.a("l", (long)8892982100148577628L, (long)var2_2);
                try {
                    v0 = var7_4;
                    if (var6_5 != null) break block5;
                    if (v0 == null) {
                    }
                    ** GOTO lbl19
                }
                catch (n9 v1) {
                    throw m44.a("l", (Object)v1, (long)7140984721081046935L, (long)var2_2);
                }
                var7_4 = new lb6(1);
                try {
                    this.Q.put(var1_1, var7_4);
                    if (var6_5 == null) break block6;
lbl19:
                    // 2 sources

                    v0 = var7_4;
                }
                catch (n9 v2) {
                    throw m44.a("l", (Object)v2, (long)7140984721081046935L, (long)var2_2);
                }
            }
            v0.f(var4_3);
        }
        return true;
    }

    public boolean containsAll(Collection collection) {
        long l = a ^ 0x6DB06734C744L;
        Iterator iterator = collection.iterator();
        CallSite callSite = m44.a("h", (long)1731142495771821616L, (long)l);
        while (iterator.hasNext()) {
            boolean bl = this.Q.containsKey(iterator.next());
            while (!bl) {
                bl = false;
                if (callSite != null) continue;
                return bl;
            }
        }
        return true;
    }

    public Object[] toArray(Object[] objectArray) {
        Object[] objectArray2;
        block13: {
            block12: {
                int n;
                CallSite callSite;
                long l;
                block10: {
                    block11: {
                        l = a ^ 0x4C7E00736112L;
                        callSite = m44.a("n", (long)-4733176401466253210L, (long)l);
                        try {
                            n = objectArray.length;
                            if (callSite != null) break block10;
                            if (n >= this.Q.size()) break block11;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)((Object)n92), (long)-6475183416356384083L, (long)l);
                        }
                        objectArray = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), this.Q.size());
                    }
                    n = 0;
                }
                int n2 = n;
                Iterator iterator = this.Q.keySet().iterator();
                while (iterator.hasNext()) {
                    try {
                        objectArray[n2++] = iterator.next();
                        if (callSite == null) {
                            if (callSite == null) continue;
                            break;
                        }
                        break block12;
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)((Object)n93), (long)-6475183416356384083L, (long)l);
                    }
                }
                try {
                    try {
                        objectArray2 = objectArray;
                        if (callSite != null) break block13;
                        if (objectArray2.length <= this.Q.size()) break block12;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)((Object)n94), (long)-6475183416356384083L, (long)l);
                    }
                    objectArray[this.Q.size()] = null;
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)((Object)n95), (long)-6475183416356384083L, (long)l);
                }
            }
            objectArray2 = objectArray;
        }
        return objectArray2;
    }

    @Override
    public Object[] toArray() {
        Object[] objectArray;
        block4: {
            long l = a ^ 0x625B992F38D0L;
            Object[] objectArray2 = new Object[this.Q.size()];
            int n = 0;
            Iterator iterator = this.Q.keySet().iterator();
            CallSite callSite = m44.a("l", (long)-1760257615246657116L, (long)l);
            while (iterator.hasNext()) {
                try {
                    objectArray = objectArray2;
                    if (callSite == null) {
                        objectArray[n++] = iterator.next();
                        if (callSite == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)((Object)n92), (long)-8540074353390737L, (long)l);
                }
            }
            objectArray = objectArray2;
        }
        return objectArray;
    }

    public synchronized boolean retainAll(Collection collection) {
        Object object;
        block11: {
            block12: {
                CallSite callSite;
                long l;
                block9: {
                    l = a ^ 0x4CE40565AE90L;
                    int n = this.Q.size();
                    Iterator iterator = this.Q.keySet().iterator();
                    callSite = m44.a("l", (long)8201725322589204452L, (long)l);
                    while (iterator.hasNext()) {
                        block10: {
                            Object k = iterator.next();
                            try {
                                try {
                                    object = m44.a("s", (Object)collection, k, (long)7731504871765808486L, (long)l);
                                    if (callSite != null) break block9;
                                    if (object != 0) break block10;
                                }
                                catch (n9 n92) {
                                    throw m44.a("l", (Object)((Object)n92), (long)7611512623808716079L, (long)l);
                                }
                                iterator.remove();
                            }
                            catch (n9 n93) {
                                throw m44.a("l", (Object)((Object)n93), (long)7611512623808716079L, (long)l);
                            }
                        }
                        if (callSite == null) continue;
                    }
                    object = n;
                }
                try {
                    try {
                        if (callSite != null) break block11;
                        if (object == this.Q.size()) break block12;
                    }
                    catch (n9 n94) {
                        throw m44.a("l", (Object)((Object)n94), (long)7611512623808716079L, (long)l);
                    }
                    object = 1;
                    break block11;
                }
                catch (n9 n95) {
                    throw m44.a("l", (Object)((Object)n95), (long)7611512623808716079L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    public ho(long l, int n) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x3A56F93286F9L;
        long l4 = l2 ^ 0x7EBEF50EE919L;
        int n2 = (int)(l4 >>> 32);
        int n3 = (int)(l4 << 32 >>> 48);
        int n4 = (int)(l4 << 48 >>> 48);
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = cf.x((int)n, (int)n2, (char)((char)n3), (short)((short)n4));
        this.Q = m44.a("k", (Object)objectArray, (long)160008075000776664L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized List e(Object[] var1_1) {
        block25: {
            block24: {
                block23: {
                    var3_2 = (Long)var1_1[0];
                    var2_3 = ((Boolean)var1_1[1]).booleanValue();
                    var5_4 = (var3_2 = ho.a ^ var3_2) ^ 48799434495457L;
                    var8_5 = this.Q.size();
                    var9_6 = new lk9[var8_5];
                    var7_7 = m44.a("k", (long)-5429796601333962093L, (long)var3_2);
                    var10_8 = 0;
                    block10: for (K var12_10 : this.Q.keySet()) {
                        var13_13 = (lb6)this.Q.get(var12_10);
                        try {
                            var9_6[var10_8++] = new lk9(var13_13.U(var5_4), var12_10);
                            do {
                                v0 = var7_7;
                                if (var3_2 >= 0L) {
                                    if (v0 != null) break block23;
                                    v0 = var7_7;
                                }
                                if (v0 == null) continue block10;
                            } while (var3_2 <= 0L);
                            break;
                        }
                        catch (n9 v1) {
                            throw m44.a("k", (Object)v1, (long)-5992431705697691560L, (long)var3_2);
                        }
                    }
                    m44.a("k", (Object)var9_6, (long)-5405656235310186511L, (long)var3_2);
                }
                var11_9 = new ArrayList<E>(var8_5);
                try {
                    v2 = var2_3;
                    if (var7_7 != null) break block24;
                    if (v2 != 0) {
                    }
                    ** GOTO lbl53
                }
                catch (n9 v3) {
                    throw m44.a("k", (Object)v3, (long)-5992431705697691560L, (long)var3_2);
                }
                var12_11 = 0;
                block12: while (var12_11 < var8_5) {
                    try {
                        var11_9.add(var9_6[var12_11].W());
                        ++var12_11;
                        do {
                            v4 = var7_7;
                            if (var3_2 >= 0L) {
                                if (v4 != null) break block25;
                                v4 = var7_7;
                            }
                            if (v4 == null) continue block12;
                        } while (var3_2 < 0L);
                        break;
                    }
                    catch (n9 v5) {
                        throw m44.a("k", (Object)v5, (long)-5992431705697691560L, (long)var3_2);
                    }
                }
                try {
                    if (var7_7 == null) break block25;
lbl53:
                    // 2 sources

                    v2 = var8_5 - 1;
                }
                catch (n9 v6) {
                    throw m44.a("k", (Object)v6, (long)-5992431705697691560L, (long)var3_2);
                }
            }
            block14: for (var12_12 = v1054620; var12_12 >= 0; --var12_12) {
                try {
                    do {
                        v7 = var11_9;
                        v8 = var7_7;
                        if (var3_2 > 0L) {
                            if (v8 != null) return v7;
                            v8 = var9_6[var12_12].W();
                        }
                        v7.add(v8);
                        if (var7_7 == null) continue block14;
                    } while (var3_2 <= 0L);
                    break;
                }
                catch (n9 v9) {
                    throw m44.a("k", (Object)v9, (long)-5992431705697691560L, (long)var3_2);
                }
            }
        }
        v7 = var11_9;
        return v7;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x3B0388A90F06L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 8764926050521908825L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
