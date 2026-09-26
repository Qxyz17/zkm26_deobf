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
    private static final long a = prr.a(3482617461746805836L, 5262856632043424928L, MethodHandles.lookup().lookupClass()).a(42488572880011L);
    private static final long b;

    public synchronized boolean addAll(Collection collection) {
        Object object;
        block4: {
            long l10 = a ^ 0x1E2DA9AD1D56L;
            Iterator iterator = collection.iterator();
            CallSite callSite = m44.a("j", (long)-4461884773571634142L, (long)l10);
            while (iterator.hasNext()) {
                try {
                    object = m44.a("u", (Object)this, iterator.next(), (long)-2749907263106629363L, (long)l10);
                    if (callSite == null) {
                        if (callSite == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)n92, (long)-2708962803606245655L, (long)l10);
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
            long l10;
            long l11 = l10 = a ^ 0x4BCE5B2E20FAL;
            long l12 = l11 ^ 0x377DA84D2E9EL;
            long l13 = l11 ^ 0x217728FACD5L;
            long l14 = l11 ^ 0x3633D6221EFCL;
            ho ho3 = new ho(l12, this.Q.size());
            CallSite callSite = m44.a("n", (long)-20153413823438450L, (long)l10);
            for (Map.Entry entry : this.Q.entrySet()) {
                lb6 lb62 = (lb6)entry.getValue();
                try {
                    ho2 = ho3;
                    if (callSite == null) {
                        Object[] objectArray = new Object[3];
                        objectArray[2] = lb62.U(l14);
                        objectArray[1] = entry.getKey();
                        objectArray[0] = l13;
                        m44.a("q", (Object)ho2, (Object)objectArray, (long)-313633540350229474L, (long)l10);
                        if (callSite == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)-1744158261892967611L, (long)l10);
                }
            }
            ho2 = ho3;
        }
        return ho2;
    }

    public synchronized void R(Object[] objectArray) {
        block8: {
            lb6 lb62;
            int n10;
            block6: {
                long l10 = (Long)objectArray[0];
                Object object = objectArray[1];
                n10 = (Integer)objectArray[2];
                l10 = a ^ l10;
                lb6 lb63 = (lb6)this.Q.get(object);
                CallSite callSite = m44.a("h", (long)-9048176151116735400L, (long)l10);
                try {
                    block7: {
                        try {
                            try {
                                lb62 = lb63;
                                if (callSite != null) break block6;
                                if (lb62 != null) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)n92, (long)-7341557454938640749L, (long)l10);
                            }
                            this.Q.put(object, new lb6(n10));
                            if (callSite == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)-7341557454938640749L, (long)l10);
                        }
                    }
                    lb62 = lb63;
                }
                catch (n9 n94) {
                    throw m44.a("h", (Object)n94, (long)-7341557454938640749L, (long)l10);
                }
            }
            lb62.P(n10);
        }
    }

    @Override
    public boolean isEmpty() {
        boolean bl2;
        block2: {
            block3: {
                long l10 = a ^ 0x6C72E1A08AC9L;
                CallSite callSite = m44.a("m", (long)6164092185282366397L, (long)l10);
                try {
                    bl2 = this.Q.size();
                    if (callSite != null) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)n92, (long)5618424091397601654L, (long)l10);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void clear() {
        this.Q.clear();
    }

    public synchronized boolean removeAll(Collection collection) {
        int n10;
        block9: {
            block8: {
                long l10 = a ^ 0x522CE83A3889L;
                int n11 = this.Q.size();
                Iterator iterator = collection.iterator();
                CallSite callSite = m44.a("m", (long)-1744160307315541507L, (long)l10);
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
                        throw m44.a("m", (Object)n92, (long)-20098318573335754L, (long)l10);
                    }
                }
                try {
                    try {
                        n10 = n11;
                        if (callSite != null) break block9;
                        if (n10 == this.Q.size()) break block8;
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)n93, (long)-20098318573335754L, (long)l10);
                    }
                    n10 = 1;
                    break block9;
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)n94, (long)-20098318573335754L, (long)l10);
                }
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    public int X(Object[] objectArray) {
        lb6 lb62;
        long l10;
        block4: {
            lb6 lb63;
            block5: {
                long l11 = (Long)objectArray[0];
                Object object = objectArray[1];
                l10 = (l11 = a ^ l11) ^ 0x293E65DDDB51L;
                lb63 = (lb6)this.Q.get(object);
                CallSite callSite = m44.a("k", (long)4185385148288934947L, (long)l11);
                try {
                    try {
                        lb62 = lb63;
                        if (callSite != null) break block4;
                        if (lb62 != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)2478842644981176040L, (long)l11);
                    }
                    return 0;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)2478842644981176040L, (long)l11);
                }
            }
            lb62 = lb63;
        }
        return lb62.U(l10);
    }

    public ho(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x3D3E6A9A87D8L;
        this(l11, (int)b);
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
                long l10;
                long l11;
                block8: {
                    l11 = a ^ 0x78D686970D3L;
                    l10 = l11 ^ 0x7A70E5654ED5L;
                    lb63 = (lb6)this.Q.get(object);
                    callSite = m44.a("o", (long)-5795804170404646489L, (long)l11);
                    try {
                        lb62 = lb63;
                        if (callSite != null) break block8;
                        if (lb62 == null) break block9;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-5196365559808539796L, (long)l11);
                    }
                    lb62 = lb63;
                }
                try {
                    Object object2;
                    block11: {
                        try {
                            try {
                                object2 = lb62.U(l10);
                                if (callSite != null) break block10;
                                if (object2 != 1) break block11;
                            }
                            catch (n9 n93) {
                                throw m44.a("o", (Object)n93, (long)-5196365559808539796L, (long)l11);
                            }
                            this.Q.remove(object);
                            if (callSite == null) break block10;
                        }
                        catch (n9 n94) {
                            throw m44.a("o", (Object)n94, (long)-5196365559808539796L, (long)l11);
                        }
                    }
                    object2 = m44.a("p", (Object)lb63, (Object)new Object[0], (long)-5577208163027340202L, (long)l11);
                }
                catch (n9 n95) {
                    throw m44.a("o", (Object)n95, (long)-5196365559808539796L, (long)l11);
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
        long l10 = a ^ 0x6DB06734C744L;
        Iterator iterator = collection.iterator();
        CallSite callSite = m44.a("h", (long)1731142495771821616L, (long)l10);
        while (iterator.hasNext()) {
            boolean bl2 = this.Q.containsKey(iterator.next());
            while (!bl2) {
                bl2 = false;
                if (callSite != null) continue;
                return bl2;
            }
        }
        return true;
    }

    public Object[] toArray(Object[] objectArray) {
        Object[] objectArray2;
        block13: {
            block12: {
                int n10;
                CallSite callSite;
                long l10;
                block10: {
                    block11: {
                        l10 = a ^ 0x4C7E00736112L;
                        callSite = m44.a("n", (long)-4733176401466253210L, (long)l10);
                        try {
                            n10 = objectArray.length;
                            if (callSite != null) break block10;
                            if (n10 >= this.Q.size()) break block11;
                        }
                        catch (n9 n92) {
                            throw m44.a("n", (Object)n92, (long)-6475183416356384083L, (long)l10);
                        }
                        objectArray = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), this.Q.size());
                    }
                    n10 = 0;
                }
                int n11 = n10;
                Iterator iterator = this.Q.keySet().iterator();
                while (iterator.hasNext()) {
                    try {
                        objectArray[n11++] = iterator.next();
                        if (callSite == null) {
                            if (callSite == null) continue;
                            break;
                        }
                        break block12;
                    }
                    catch (n9 n93) {
                        throw m44.a("n", (Object)n93, (long)-6475183416356384083L, (long)l10);
                    }
                }
                try {
                    try {
                        objectArray2 = objectArray;
                        if (callSite != null) break block13;
                        if (objectArray2.length <= this.Q.size()) break block12;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)n94, (long)-6475183416356384083L, (long)l10);
                    }
                    objectArray[this.Q.size()] = null;
                }
                catch (n9 n95) {
                    throw m44.a("n", (Object)n95, (long)-6475183416356384083L, (long)l10);
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
            long l10 = a ^ 0x625B992F38D0L;
            Object[] objectArray2 = new Object[this.Q.size()];
            int n10 = 0;
            Iterator iterator = this.Q.keySet().iterator();
            CallSite callSite = m44.a("l", (long)-1760257615246657116L, (long)l10);
            while (iterator.hasNext()) {
                try {
                    objectArray = objectArray2;
                    if (callSite == null) {
                        objectArray[n10++] = iterator.next();
                        if (callSite == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)n92, (long)-8540074353390737L, (long)l10);
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
                long l10;
                block9: {
                    l10 = a ^ 0x4CE40565AE90L;
                    int n10 = this.Q.size();
                    Iterator iterator = this.Q.keySet().iterator();
                    callSite = m44.a("l", (long)8201725322589204452L, (long)l10);
                    while (iterator.hasNext()) {
                        block10: {
                            Object k10 = iterator.next();
                            try {
                                try {
                                    object = m44.a("s", (Object)collection, k10, (long)7731504871765808486L, (long)l10);
                                    if (callSite != null) break block9;
                                    if (object != 0) break block10;
                                }
                                catch (n9 n92) {
                                    throw m44.a("l", (Object)n92, (long)7611512623808716079L, (long)l10);
                                }
                                iterator.remove();
                            }
                            catch (n9 n93) {
                                throw m44.a("l", (Object)n93, (long)7611512623808716079L, (long)l10);
                            }
                        }
                        if (callSite == null) continue;
                    }
                    object = n10;
                }
                try {
                    try {
                        if (callSite != null) break block11;
                        if (object == this.Q.size()) break block12;
                    }
                    catch (n9 n94) {
                        throw m44.a("l", (Object)n94, (long)7611512623808716079L, (long)l10);
                    }
                    object = 1;
                    break block11;
                }
                catch (n9 n95) {
                    throw m44.a("l", (Object)n95, (long)7611512623808716079L, (long)l10);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    public ho(long l10, int n10) {
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x3A56F93286F9L;
        long l13 = l11 ^ 0x7EBEF50EE919L;
        int n11 = (int)(l13 >>> 32);
        int n12 = (int)(l13 << 32 >>> 48);
        int n13 = (int)(l13 << 48 >>> 48);
        Object[] objectArray = new Object[2];
        objectArray[1] = l12;
        objectArray[0] = cf.x(n10, n11, (char)n12, (short)n13);
        this.Q = m44.a("k", (Object)objectArray, (long)160008075000776664L, (long)l10);
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
            block14: for (var12_12 = v8119780; var12_12 >= 0; --var12_12) {
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
        long l10 = a ^ 0x3B0388A90F06L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 8764926050521908825L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

