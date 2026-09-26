/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lmg
implements Map {
    private Map f;
    private boolean Z;
    private static final long a = prr.a(4186101345862209071L, 7060858062106901738L, MethodHandles.lookup().lookupClass()).a(95042908837218L);
    private static final long b;

    public final Object get(Object object) {
        lmg lmg2;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0x5FFEA1EE7F39L;
                CallSite callSite = m44.a("m", (long)-2521052506634337483L, (long)l10);
                try {
                    try {
                        lmg2 = this;
                        if (callSite != null) break block4;
                        if (m44.a("s", (Object)lmg2, (long)-2778346179514894727L, (long)l10) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-4118517629846618077L, (long)l10);
                    }
                    return null;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-4118517629846618077L, (long)l10);
                }
            }
            lmg2 = m44.a("s", (Object)this, (long)-4089600925429210071L, (long)l10).get(object);
        }
        return lmg2;
    }

    public Object remove(Object object) {
        lmg lmg2;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0x29D500FA9F3FL;
                CallSite callSite = m44.a("k", (long)4396949411383943987L, (long)l10);
                try {
                    try {
                        lmg2 = this;
                        if (callSite != null) break block4;
                        if (m44.a("u", (Object)lmg2, (long)4140816818520954495L, (long)l10) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)2800781721557786661L, (long)l10);
                    }
                    return null;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)2800781721557786661L, (long)l10);
                }
            }
            lmg2 = m44.a("u", (Object)this, (long)2826192984297047087L, (long)l10).remove(object);
        }
        return lmg2;
    }

    @Override
    public final boolean containsKey(Object object) {
        Object object2;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0x629A04DE8466L;
                CallSite callSite = m44.a("j", (long)2764173875402193002L, (long)l10);
                try {
                    try {
                        object2 = m44.a("t", (Object)this, (long)2463022294335982886L, (long)l10);
                        if (callSite != null) break block4;
                        if (object2 == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)4433560109397834620L, (long)l10);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)4433560109397834620L, (long)l10);
                }
            }
            object2 = m44.a("t", (Object)this, (long)4351019044185186166L, (long)l10).containsKey(object);
        }
        return (boolean)object2;
    }

    public void putAll(Map map) {
        block5: {
            Object object;
            long l10;
            block4: {
                l10 = a ^ 0x72D8CCD501D7L;
                CallSite callSite = m44.a("k", (long)-6634574948536369701L, (long)l10);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block4;
                        if (m44.a("u", (Object)object, (long)-6368237238399530857L, (long)l10) != false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)-5172882047949832499L, (long)l10);
                    }
                    object = m44.a("u", (Object)this, (long)-5057264727678936377L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)-5172882047949832499L, (long)l10);
                }
            }
            m44.a("t", (Object)object, (Object)map, (long)-6385059426360571100L, (long)l10);
        }
    }

    public Set entrySet() {
        Object object;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0x20C50E764E99L;
                CallSite callSite = m44.a("m", (long)-1395250424441998699L, (long)l10);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block4;
                        if (m44.a("s", (Object)object, (long)-1670505723870885927L, (long)l10) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-614625681500327549L, (long)l10);
                    }
                    return m44.a("m", (long)-695130656042303420L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-614625681500327549L, (long)l10);
                }
            }
            object = m44.a("s", (Object)this, (long)-675910910879541879L, (long)l10);
        }
        return object.entrySet();
    }

    @Override
    public final boolean isEmpty() {
        CallSite callSite;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0xEAC0AD5703FL;
                CallSite callSite2 = m44.a("k", (long)-3313174568817341389L, (long)l10);
                try {
                    try {
                        callSite = m44.a("u", (Object)this, (long)-2992917328212493953L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)-3900601766844821723L, (long)l10);
                    }
                    return true;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)-3900601766844821723L, (long)l10);
                }
            }
            callSite = m44.a("t", (Object)m44.a("u", (Object)this, (long)-4019320888048096465L, (long)l10), (long)-3348621405245377082L, (long)l10);
        }
        return (boolean)callSite;
    }

    public lmg(long l10, boolean bl2) {
        block5: {
            int n10;
            lmg lmg2;
            long l11;
            block4: {
                l11 = (l10 = a ^ l10) ^ 0x495077F91511L;
                CallSite callSite = m44.a("k", (long)-7796524980554985989L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        lmg2 = this;
                        n10 = bl2;
                        if (callSite2 != null) break block4;
                        m44.a("w", (Object)lmg2, n10 != 0, (long)-7512262486233499465L, (long)l10);
                        if (bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)n92, (long)-8640622327589810451L, (long)l10);
                    }
                    lmg2 = this;
                    n10 = (int)b;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)n93, (long)-8640622327589810451L, (long)l10);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l11;
            objectArray[0] = n10;
            m44.a("w", (Object)lmg2, (Map)((Object)m44.a("k", (Object)objectArray, (long)-7939840123232447440L, (long)l10)), (long)-8507140900209382681L, (long)l10);
        }
    }

    @Override
    public final int size() {
        Object object;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0x482B5F6252A9L;
                CallSite callSite = m44.a("m", (long)-1111408550560665947L, (long)l10);
                try {
                    try {
                        object = m44.a("s", (Object)this, (long)-801285543022339095L, (long)l10);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-1492941229229134413L, (long)l10);
                    }
                    return 0;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-1492941229229134413L, (long)l10);
                }
            }
            object = m44.a("s", (Object)this, (long)-1536072213849781831L, (long)l10).size();
        }
        return (int)object;
    }

    public Object put(Object object, Object object2) {
        Object object3;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0x3DDC89A74285L;
                CallSite callSite = m44.a("i", (long)-2252065654549315959L, (long)l10);
                try {
                    try {
                        object3 = this;
                        if (callSite != null) break block4;
                        if (m44.a("w", (Object)object3, (long)-1959849804414956603L, (long)l10) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-332012742346654305L, (long)l10);
                    }
                    return null;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-332012742346654305L, (long)l10);
                }
            }
            object3 = m44.a("w", (Object)this, (long)-395556445943768683L, (long)l10).put(object, object2);
        }
        return object3;
    }

    public boolean q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("p", (Object)this, (long)-7045178013216394958L, (long)l10);
    }

    public lmg(lmg lmg2, long l10) {
        block5: {
            lmg lmg3;
            long l11;
            block4: {
                l11 = (l10 = a ^ l10) ^ 0x4F8651E57473L;
                CallSite callSite = m44.a("l", (long)-8641742227289696732L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        m44.a("p", (Object)this, (boolean)m44.a("r", (Object)lmg2, (long)-8331547167312895128L, (long)l10), (long)-8331547167312895128L, (long)l10);
                        lmg3 = this;
                        if (callSite2 != null) break block4;
                        if (m44.a("r", (Object)lmg3, (long)-8331547167312895128L, (long)l10) != false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)n92, (long)-7797658220421753550L, (long)l10);
                    }
                    lmg3 = this;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)n93, (long)-7797658220421753550L, (long)l10);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l11;
            objectArray[0] = lmg2;
            m44.a("p", (Object)lmg3, (Map)((Object)m44.a("l", (Object)objectArray, (long)-7816717564312001782L, (long)l10)), (long)-7912859176102350536L, (long)l10);
        }
    }

    public final synchronized Collection values() {
        ArrayList arrayList;
        block7: {
            long l10 = a ^ 0x39E27E23162DL;
            CallSite callSite = m44.a("i", (long)-5469892197535012319L, (long)l10);
            try {
                if (m44.a("w", (Object)this, (long)-5736122739882844307L, (long)l10) != false) {
                    return m44.a("i", (long)-5343173495974657887L, (long)l10);
                }
            }
            catch (n9 n92) {
                throw m44.a("i", (Object)n92, (long)-5779120984044705481L, (long)l10);
            }
            ArrayList arrayList2 = new ArrayList(m44.a("w", (Object)this, (long)-5896698740225110723L, (long)l10).size());
            Iterator iterator = m44.a("w", (Object)this, (long)-5896698740225110723L, (long)l10).entrySet().iterator();
            while (iterator.hasNext()) {
                try {
                    arrayList = arrayList2;
                    if (callSite == null) {
                        arrayList.add(iterator.next().getValue());
                        if (callSite == null) continue;
                        break;
                    }
                    break block7;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-5779120984044705481L, (long)l10);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override
    public final boolean containsValue(Object object) {
        CallSite callSite;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0x55E8E282A40CL;
                CallSite callSite2 = m44.a("h", (long)447657416618612736L, (long)l10);
                try {
                    try {
                        callSite = m44.a("v", (Object)this, (long)163359703766641996L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)2156410716396182294L, (long)l10);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)2156410716396182294L, (long)l10);
                }
            }
            callSite = m44.a("w", (Object)m44.a("v", (Object)this, (long)2020950434646212380L, (long)l10), (Object)object, (long)2084735080069852261L, (long)l10);
        }
        return (boolean)callSite;
    }

    public Set keySet() {
        Object object;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0xA0DCF116DF9L;
                CallSite callSite = m44.a("m", (long)-3475870812915052043L, (long)l10);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block4;
                        if (m44.a("s", (Object)object, (long)-3769230116789656391L, (long)l10) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-3163703996247436573L, (long)l10);
                    }
                    return m44.a("m", (long)-3082066808531164380L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-3163703996247436573L, (long)l10);
                }
            }
            object = m44.a("s", (Object)this, (long)-3026836406181693719L, (long)l10);
        }
        return object.keySet();
    }

    @Override
    public void clear() {
        block5: {
            Object object;
            block4: {
                long l10 = a ^ 0x36EF8C1E554CL;
                CallSite callSite = m44.a("h", (long)-615298753816696512L, (long)l10);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block4;
                        if (m44.a("v", (Object)object, (long)-935554860785116148L, (long)l10) != false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-1392316966680712618L, (long)l10);
                    }
                    object = m44.a("v", (Object)this, (long)-1347780592793629092L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-1392316966680712618L, (long)l10);
                }
            }
            object.clear();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x3585523B2009L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 4470157691589504592L;
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

