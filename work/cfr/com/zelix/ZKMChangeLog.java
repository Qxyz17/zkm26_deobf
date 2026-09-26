/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.lke;
import com.zelix.loo;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.nb;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ZKMChangeLog
extends nb {
    private lke f;
    int E;
    int Q;
    int G;
    private String S;
    int i;
    private lqu D;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public String getOldMethodName(String string, String string2) {
        CallSite callSite;
        long l10;
        block8: {
            ZKMChangeLog zKMChangeLog;
            block7: {
                long l11 = l10 = a ^ 0xFBA40203817L;
                long l12 = l11 ^ 0x657EBB4DD592L;
                long l13 = l11 ^ 0x5A0F8F227E15L;
                CallSite callSite2 = m44.a("j", (long)-5610071248509819057L, (long)l10);
                try {
                    if (string == null) {
                        throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)3659, (long)(0x5FA977ECD5FD8DADL ^ l10))));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)-5615302923845739544L, (long)l10);
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l12;
                objectArray[0] = string2;
                callSite = m44.a("k", (Object)this, (Object)objectArray, (long)-5801369785892737152L, (long)l10);
                try {
                    try {
                        zKMChangeLog = this;
                        if (callSite2 != false) break block7;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = string;
                        objectArray2[0] = l13;
                        if (m44.a("u", (Object)m44.a("t", (Object)zKMChangeLog, (long)-5343796627821760215L, (long)l10), (Object)objectArray2, (long)-5195900158721623580L, (long)l10) == false) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)-5615302923845739544L, (long)l10);
                    }
                    zKMChangeLog = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)-5615302923845739544L, (long)l10);
                }
            }
            CallSite callSite3 = m44.a("u", (Object)zKMChangeLog, (Object)string, (Object)m44.a("t", (Object)callSite, (long)-5992996335263692155L, (long)l10), (Object)m44.a("t", (Object)callSite, (long)-5612333086819936185L, (long)l10), (Object)m44.a("t", (Object)callSite, (long)-6285319500048239430L, (long)l10), (long)-5551646169426487518L, (long)l10);
            return callSite3;
        }
        return m44.a("t", (Object)callSite, (long)-5992996335263692155L, (long)l10);
    }

    public List getNewClassNames() {
        long l10;
        long l11 = l10 = a ^ 0x365EA0E1F98L;
        long l12 = l11 ^ 0x5CE66D396CFBL;
        long l13 = l11 ^ 0x745CB05C053AL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = m44.a("r", (Object)m44.a("s", (Object)this, (long)-7901554996759570778L, (long)l10), (Object)objectArray, (long)-7953310110657203842L, (long)l10);
        return m44.a("l", (Object)this, (Object)objectArray2, (long)-8254679931022603764L, (long)l10);
    }

    public String getNewPackageName(String string) {
        String string2;
        block10: {
            String string3;
            block11: {
                Object object;
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = a ^ 0x56CA4BD80BE7L;
                        l11 = l10 ^ 0x384BA6600514L;
                        callSite = m44.a("j", (long)-9091258446484302657L, (long)l10);
                        try {
                            try {
                                object = string;
                                if (callSite != false) break block8;
                                if (object != null) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("j", (Object)illegalArgumentException, (long)-9087640840124340200L, (long)l10);
                            }
                            throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)3807, (long)(0x4ED1BDE0525E3ED3L ^ l10))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("j", (Object)illegalArgumentException, (long)-9087640840124340200L, (long)l10);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l11;
                    objectArray[0] = string;
                    object = m44.a("u", (Object)m44.a("t", (Object)this, (long)-8779947554604793127L, (long)l10), (Object)objectArray, (long)-7150620265462219160L, (long)l10);
                }
                string3 = object;
                try {
                    try {
                        string2 = string3;
                        if (callSite != false) break block10;
                        if (string2 != null) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)-9087640840124340200L, (long)l10);
                    }
                    return string;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)-9087640840124340200L, (long)l10);
                }
            }
            string2 = cf.a(string3);
        }
        return string2;
    }

    public boolean isOldClassPresent(String string) {
        long l10 = a ^ 0xAA25025D880L;
        long l11 = l10 ^ 0x5BBAEDCD1799L;
        try {
            if (string == null) {
                throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC917BE1F8258F46L ^ l10))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("m", (Object)illegalArgumentException, (long)5946276144175364991L, (long)l10);
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = string;
        return (boolean)m44.a("r", (Object)m44.a("s", (Object)this, (long)6142910302016311742L, (long)l10), (Object)objectArray, (long)5502191737647269666L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ArrayList g(Object[] objectArray) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        CallSite callSite = m44.a("m", (long)1150478903091352956L, (long)l10);
        block2: for (int i10 = 0; i10 < arrayList2.size(); ++i10) {
            String string = cf.a((String)arrayList2.get(i10));
            try {
                do {
                    arrayList = arrayList2;
                    Object object = callSite;
                    if (l10 >= 0L) {
                        if (object == false) return arrayList;
                        object = i10;
                    }
                    m44.a("r", (Object)arrayList, (int)object, (Object)string, (long)729082866683305278L, (long)l10);
                    if (callSite != false) continue block2;
                } while (l10 < 0L);
                break;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("m", (Object)illegalArgumentException, (long)803168837607088863L, (long)l10);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    public boolean isOldMethodPresent(String string, String string2, String[] stringArray, String string3) {
        Object object;
        block11: {
            block12: {
                Object object2;
                block13: {
                    block14: {
                        long l10;
                        long l11 = l10 = a ^ 0x16FD12A7FF90L;
                        long l12 = l11 ^ 0x63551C9BAF4L;
                        long l13 = l11 ^ 0x47E5AF4F3089L;
                        CallSite callSite = m44.a("m", (long)8162573390320577484L, (long)l10);
                        try {
                            if (string == null) {
                                throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC9167BEBAA7A856L ^ l10))));
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("m", (Object)illegalArgumentException, (long)8472809093293251695L, (long)l10);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l13;
                                        objectArray[0] = string;
                                        object = m44.a("r", (Object)m44.a("s", (Object)this, (long)8237114508079216302L, (long)l10), (Object)objectArray, (long)7731460534101090354L, (long)l10);
                                        if (callSite == false) break block11;
                                        if (object == false) break block12;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("m", (Object)illegalArgumentException, (long)8472809093293251695L, (long)l10);
                                    }
                                    Object[] objectArray = new Object[5];
                                    objectArray[4] = string3;
                                    objectArray[3] = stringArray;
                                    objectArray[2] = string2;
                                    objectArray[1] = string;
                                    objectArray[0] = l12;
                                    object2 = m44.a("r", (Object)m44.a("s", (Object)this, (long)8237114508079216302L, (long)l10), (Object)objectArray, (long)8362234006578319481L, (long)l10);
                                    if (callSite == false) break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("m", (Object)illegalArgumentException, (long)8472809093293251695L, (long)l10);
                                }
                                if (object2 == false) break block14;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("m", (Object)illegalArgumentException, (long)8472809093293251695L, (long)l10);
                            }
                            return true;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("m", (Object)illegalArgumentException, (long)8472809093293251695L, (long)l10);
                        }
                    }
                    object2 = false;
                }
                return (boolean)object2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public boolean isOldMethodPresent(String string, String string2) {
        Object object;
        block5: {
            block6: {
                long l10;
                long l11 = l10 = a ^ 0x1DCC7812D608L;
                long l12 = l11 ^ 0x7708837F3B8DL;
                long l13 = l11 ^ 0x4CD4C5FA1911L;
                CallSite callSite = m44.a("m", (long)6645650152407320912L, (long)l10);
                try {
                    if (string == null) {
                        throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC916C8FD01281CEL ^ l10))));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)6633096140604880375L, (long)l10);
                }
                try {
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l13;
                    objectArray[0] = string;
                    object = m44.a("r", (Object)m44.a("s", (Object)this, (long)6613561554949513014L, (long)l10), (Object)objectArray, (long)4815369816803707306L, (long)l10);
                    if (callSite != false) break block5;
                    if (object == false) break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)6633096140604880375L, (long)l10);
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l12;
                objectArray[0] = string2;
                CallSite callSite2 = m44.a("l", (Object)this, (Object)objectArray, (long)4711458575071773087L, (long)l10);
                return (boolean)m44.a("r", (Object)this, (Object)string, (Object)m44.a("s", (Object)callSite2, (long)4813094437612758170L, (long)l10), (Object)m44.a("s", (Object)callSite2, (long)6630405570977330776L, (long)l10), (Object)m44.a("s", (Object)callSite2, (long)5105143817678035621L, (long)l10), (long)6819344698457573690L, (long)l10);
            }
            object = false;
        }
        return (boolean)object;
    }

    public String getNewMethodSignature(String string, String string2, String[] stringArray, String string3) {
        loo loo2;
        long l10;
        long l11;
        block26: {
            block28: {
                CallSite callSite;
                block29: {
                    CallSite callSite2;
                    block30: {
                        String string4;
                        String[] stringArray2;
                        String string5;
                        String string6;
                        CallSite callSite3;
                        CallSite callSite4;
                        long l12;
                        long l13;
                        block27: {
                            CallSite callSite5;
                            long l14;
                            block25: {
                                String string7;
                                long l15;
                                long l16;
                                long l17;
                                block23: {
                                    block24: {
                                        block21: {
                                            block22: {
                                                long l18 = l11 = a ^ 0x16C75700B1FBL;
                                                l14 = l18 ^ 0x37A466C75AADL;
                                                l17 = l18 ^ 0x57F87780E59AL;
                                                l16 = l18 ^ 0x60F146EF49FL;
                                                l15 = l18 ^ 0x47DFEAE87EE2L;
                                                l13 = l18 ^ 0x75E3A689D49EL;
                                                l12 = l18 ^ 0x7B30AADB210FL;
                                                l10 = l18 ^ 0x9E41CC9523DL;
                                                callSite4 = m44.a("n", (long)4552094112013772199L, (long)l11);
                                                try {
                                                    try {
                                                        string7 = string;
                                                        if (callSite4 == false) break block21;
                                                        if (string7 != null) break block22;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw m44.a("n", (Object)illegalArgumentException, (long)4323023263536435716L, (long)l11);
                                                    }
                                                    throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC916784FF00E63DL ^ l11))));
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw m44.a("n", (Object)illegalArgumentException, (long)4323023263536435716L, (long)l11);
                                                }
                                            }
                                            string7 = string2;
                                        }
                                        try {
                                            try {
                                                if (callSite4 == false) break block23;
                                                if (string7 != null) break block24;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("n", (Object)illegalArgumentException, (long)4323023263536435716L, (long)l11);
                                            }
                                            throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)28680, (long)(0x6E0ECC574A92FA03L ^ l11))));
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("n", (Object)illegalArgumentException, (long)4323023263536435716L, (long)l11);
                                        }
                                    }
                                    string7 = string3;
                                }
                                try {
                                    if (string7 == null) {
                                        throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)5981, (long)(0x23EBDD8A9B4D9D59L ^ l11))));
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("n", (Object)illegalArgumentException, (long)4323023263536435716L, (long)l11);
                                }
                                loo2 = new loo(this, string3, string2, stringArray, l17);
                                try {
                                    try {
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l15;
                                        objectArray[0] = string;
                                        callSite5 = m44.a("q", (Object)m44.a("p", (Object)this, (long)4340093703514257605L, (long)l11), (Object)objectArray, (long)2675325502845840985L, (long)l11);
                                        if (callSite4 == false) break block25;
                                        if (callSite5 == false) break block26;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("n", (Object)illegalArgumentException, (long)4323023263536435716L, (long)l11);
                                    }
                                    callSite3 = m44.a("p", (Object)this, (long)4340093703514257605L, (long)l11);
                                    string6 = string;
                                    string5 = string2;
                                    stringArray2 = stringArray;
                                    string4 = string3;
                                    if (callSite4 == false) break block27;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("n", (Object)illegalArgumentException, (long)4323023263536435716L, (long)l11);
                                }
                                String string8 = string4;
                                String[] stringArray3 = stringArray2;
                                String string9 = string5;
                                String string10 = string6;
                                Object[] objectArray = new Object[5];
                                objectArray[4] = string8;
                                objectArray[3] = stringArray3;
                                objectArray[2] = string9;
                                objectArray[1] = string10;
                                objectArray[0] = l16;
                                callSite5 = m44.a("q", (Object)callSite3, (Object)objectArray, (long)4208508008338923026L, (long)l11);
                            }
                            try {
                                if (callSite5 == false) break block28;
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l14;
                                m44.a("o", (Object)this, (Object)objectArray, (long)2437905581871175981L, (long)l11);
                                callSite3 = m44.a("p", (Object)this, (long)4340093703514257605L, (long)l11);
                                string6 = string;
                                string5 = string2;
                                stringArray2 = stringArray;
                                string4 = string3;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("n", (Object)illegalArgumentException, (long)4323023263536435716L, (long)l11);
                            }
                        }
                        Object[] objectArray = new Object[5];
                        objectArray[4] = l12;
                        objectArray[3] = string4;
                        objectArray[2] = stringArray2;
                        objectArray[1] = string5;
                        objectArray[0] = string6;
                        callSite2 = m44.a("q", (Object)callSite3, (Object)objectArray, (long)2752444523599672412L, (long)l11);
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l13;
                                m44.a("o", (Object)this, (Object)objectArray2, (long)4472760353196703629L, (long)l11);
                                callSite = callSite2;
                                if (callSite4 == false) break block29;
                                if (callSite != null) break block30;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("n", (Object)illegalArgumentException, (long)4323023263536435716L, (long)l11);
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l10;
                            return m44.a("q", (Object)loo2, (Object)objectArray3, (long)4340717443478310698L, (long)l11);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("n", (Object)illegalArgumentException, (long)4323023263536435716L, (long)l11);
                        }
                    }
                    callSite = callSite2;
                }
                return callSite;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l10;
            return m44.a("q", (Object)loo2, (Object)objectArray, (long)4340717443478310698L, (long)l11);
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l10;
        return m44.a("q", (Object)loo2, (Object)objectArray, (long)4340717443478310698L, (long)l11);
    }

    public String getOldTypeName(String string) {
        String string2;
        block10: {
            String string3;
            block11: {
                Object object;
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = a ^ 0x74E305303CB1L;
                        l11 = l10 ^ 0x139B2F8EF1F7L;
                        callSite = m44.a("l", (long)-5295249420888005655L, (long)l10);
                        try {
                            try {
                                object = string;
                                if (callSite != false) break block8;
                                if (object != null) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("l", (Object)illegalArgumentException, (long)-5281573490679980210L, (long)l10);
                            }
                            throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)16435, (long)(0x6AF56E3C0DB8C77FL ^ l10))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)-5281573490679980210L, (long)l10);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l11;
                    objectArray[0] = string;
                    object = m44.a("s", (Object)m44.a("r", (Object)this, (long)-5660604585760197233L, (long)l10), (Object)objectArray, (long)-5981792317665280271L, (long)l10);
                }
                string3 = object;
                try {
                    try {
                        string2 = string3;
                        if (callSite != false) break block10;
                        if (string2 != null) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-5281573490679980210L, (long)l10);
                    }
                    return string;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)-5281573490679980210L, (long)l10);
                }
            }
            string2 = cf.a(string3);
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private loo m(Object[] objectArray) {
        int n10;
        ArrayList<String> arrayList;
        String string;
        String string2;
        long l10;
        block13: {
            StringTokenizer stringTokenizer;
            CallSite callSite;
            long l11;
            block14: {
                String string3;
                block12: {
                    String string4;
                    block11: {
                        string3 = (String)objectArray[0];
                        l11 = (Long)objectArray[1];
                        l10 = (l11 = a ^ l11) ^ 0x510840522266L;
                        string3 = string3.trim();
                        callSite = m44.a("j", (long)-517826502395911589L, (long)l11);
                        int n11 = string3.indexOf(" ");
                        if (n11 <= -1) {
                            throw new IllegalArgumentException("'" + string3 + (String)((Object)ZKMChangeLog.a("f", (int)8463, (long)(0x617E05D61829ECFBL ^ l11))));
                        }
                        string2 = string3.substring(0, n11);
                        string4 = string3.substring(n11 + 1);
                        int n12 = (string4 = string4.trim()).indexOf("(");
                        if (n12 <= 0) {
                            throw new IllegalArgumentException("'" + string3 + (String)((Object)ZKMChangeLog.a("f", (int)10045, (long)(0x3EF56D1319086ACDL ^ l11))));
                        }
                        string = string4.substring(0, n12);
                        CallSite callSite2 = m44.a("u", string4, (Object)")", (int)n12, (long)-246265060913277300L, (long)l11);
                        try {
                            CallSite callSite3 = callSite;
                            if (l11 >= 0L) {
                                if (callSite3 == false) break block11;
                                callSite3 = callSite2;
                            }
                            if (callSite3 <= -1) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("j", (Object)illegalArgumentException, (long)-287544071297952264L, (long)l11);
                        }
                        string4 = string4.substring(n12 + 1, (int)callSite2);
                    }
                    arrayList = new ArrayList<String>();
                    stringTokenizer = new StringTokenizer(string4, ",");
                    break block14;
                }
                throw new IllegalArgumentException("'" + string3 + (String)((Object)ZKMChangeLog.a("f", (int)3724, (long)(0x4B00840EE6FAC37DL ^ l11))));
            }
            block4: while (stringTokenizer.hasMoreTokens()) {
                try {
                    do {
                        Object object = arrayList.add(stringTokenizer.nextToken().trim());
                        if (l11 > 0L) {
                            if (callSite == false) break block13;
                            object = callSite;
                        }
                        if (object) continue block4;
                    } while (l11 <= 0L);
                    break;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)-287544071297952264L, (long)l11);
                }
            }
            n10 = arrayList.size();
        }
        String[] stringArray = new String[n10];
        stringArray = arrayList.toArray(stringArray);
        return new loo(this, string2, string, stringArray, l10);
    }

    public String getOldFieldName(String string, String string2, String string3) {
        Object object;
        block4: {
            long l10;
            long l11;
            block5: {
                l11 = a ^ 0xDFB33644D72L;
                l10 = l11 ^ 0x230CC7F618BAL;
                CallSite callSite = m44.a("o", (long)-4348979402560857810L, (long)l11);
                try {
                    try {
                        object = string;
                        if (callSite == false) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("o", (Object)illegalArgumentException, (long)-4073666406171660659L, (long)l11);
                    }
                    throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)3807, (long)(0x4ED1E6D12AE27846L ^ l11))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)-4073666406171660659L, (long)l11);
                }
            }
            Object[] objectArray = new Object[4];
            objectArray[3] = l10;
            objectArray[2] = string3;
            objectArray[1] = string2;
            objectArray[0] = string;
            object = m44.a("p", (Object)m44.a("q", (Object)this, (long)-4561575746371025844L, (long)l11), (Object)objectArray, (long)-2680232713109024590L, (long)l11);
        }
        return object;
    }

    public boolean isOldFieldPresent(String string, String string2, String string3) {
        Object object;
        block11: {
            block12: {
                Object object2;
                block13: {
                    block14: {
                        long l10;
                        long l11 = l10 = a ^ 0x16D18E5DD816L;
                        long l12 = l11 ^ 0x26A14A7F3B55L;
                        long l13 = l11 ^ 0x47C933B5170FL;
                        CallSite callSite = m44.a("k", (long)6251358489393171530L, (long)l10);
                        try {
                            if (string == null) {
                                throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC916792265D8FD0L ^ l10))));
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("k", (Object)illegalArgumentException, (long)5914201397759032297L, (long)l10);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l13;
                                        objectArray[0] = string;
                                        object = m44.a("t", (Object)m44.a("u", (Object)this, (long)6185162115032879400L, (long)l10), (Object)objectArray, (long)5534266743707797428L, (long)l10);
                                        if (callSite == false) break block11;
                                        if (object == false) break block12;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("k", (Object)illegalArgumentException, (long)5914201397759032297L, (long)l10);
                                    }
                                    Object[] objectArray = new Object[4];
                                    objectArray[3] = string3;
                                    objectArray[2] = l12;
                                    objectArray[1] = string2;
                                    objectArray[0] = string;
                                    object2 = m44.a("t", (Object)m44.a("u", (Object)this, (long)6185162115032879400L, (long)l10), (Object)objectArray, (long)6200165339409852112L, (long)l10);
                                    if (callSite == false) break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("k", (Object)illegalArgumentException, (long)5914201397759032297L, (long)l10);
                                }
                                if (object2 == false) break block14;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("k", (Object)illegalArgumentException, (long)5914201397759032297L, (long)l10);
                            }
                            return true;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("k", (Object)illegalArgumentException, (long)5914201397759032297L, (long)l10);
                        }
                    }
                    object2 = false;
                }
                return (boolean)object2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public List getOldFieldSignaturesForClass(String string) {
        long l10 = a ^ 0xA201C63FA7DL;
        long l11 = l10 ^ 0x4A820D48ACD6L;
        try {
            if (string == null) {
                throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC917B63B463ADBBL ^ l10))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("h", (Object)illegalArgumentException, (long)8104344248170944898L, (long)l10);
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = string;
        return m44.a("w", (Object)m44.a("v", (Object)this, (long)8628053413697106755L, (long)l10), (Object)objectArray, (long)7989400778228268959L, (long)l10);
    }

    public ZKMChangeLog(String string) {
        long l10;
        long l11 = l10 = a ^ 0x1ACA130E653L;
        long l12 = l11 ^ 0x727E982AD004L;
        long l13 = l11 ^ 0x20CF90F70D05L;
        long l14 = l11 ^ 0x651D8A93C419L;
        long l15 = l11 ^ 0x628850B98336L;
        long l16 = l11 ^ 0x61C8B910A4L;
        m44.a("r", (Object)this, (lqu)new lqu(null, null, false, (String)((Object)ZKMChangeLog.a("f", (int)7693, (long)(0x544C7F308F11C3B6L ^ l10))), null, l14, null, null, null, null, null, false, false), (long)8326127652195363407L, (long)l10);
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        m44.a("q", (Object)m44.a("p", (Object)this, (long)8326127652195363407L, (long)l10), (Object)objectArray, (long)7566800228279711455L, (long)l10);
        m44.a("r", (Object)this, (String)string, (long)8121246395168589211L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l13;
        m44.a("o", (Object)this, (Object)objectArray2, (long)8538043545484775045L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l16;
        m44.a("o", (Object)this, (Object)objectArray3, (long)7524648152477974819L, (long)l10);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l15;
        m44.a("o", (Object)this, (Object)objectArray4, (long)7618534468626491429L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void e(Object[] var1_1) {
        block34: {
            block33: {
                block31: {
                    block32: {
                        block29: {
                            block30: {
                                block27: {
                                    block25: {
                                        block26: {
                                            block23: {
                                                block24: {
                                                    var2_2 = (Long)var1_1[0];
                                                    v0 = var2_2 = ZKMChangeLog.a ^ var2_2;
                                                    var4_3 = v0 ^ 126158431504460L;
                                                    var6_4 = v0 ^ 63671707964944L;
                                                    var8_5 = v0 ^ 125185798340619L;
                                                    var10_6 = v0 ^ 32152666881858L;
                                                    var12_7 = v0 ^ 22985174390875L;
                                                    var15_8 = false;
                                                    var16_9 /* !! */  = false;
                                                    var14_10 = m44.a("j", (long)8418656524987425215L, (long)var2_2);
                                                    try {
                                                        try {
                                                            try {
                                                                v1 /* !! */  = m44.a("t", (Object)this, (long)8407595822037615066L, (long)var2_2);
                                                                if (var14_10 != false) break block23;
                                                                v2 = new Object[1];
                                                                v2[0] = var6_4;
                                                                if (v1 /* !! */  < m44.a("u", (Object)m44.a("t", (Object)this, (long)7725996112216027899L, (long)var2_2), (Object)v2, (long)7581510425223528097L, (long)var2_2)) break block24;
                                                            }
                                                            catch (IllegalArgumentException v3) {
                                                                throw m44.a("j", (Object)v3, (long)8422428190749793560L, (long)var2_2);
                                                            }
                                                            v4 /* !! */  = m44.a("t", (Object)this, (long)7747474369516391021L, (long)var2_2);
                                                            v5 = new Object[1];
                                                            v5[0] = var8_5;
                                                            v6 = m44.a("u", (Object)m44.a("t", (Object)this, (long)7725996112216027899L, (long)var2_2), (Object)v5, (long)7520711351084152834L, (long)var2_2);
                                                            if (var2_2 < 0L || var14_10 != false) break block25;
                                                        }
                                                        catch (IllegalArgumentException v7) {
                                                            throw m44.a("j", (Object)v7, (long)8422428190749793560L, (long)var2_2);
                                                        }
                                                        if (v4 /* !! */  >= v6) break block26;
                                                    }
                                                    catch (IllegalArgumentException v8) {
                                                        throw m44.a("j", (Object)v8, (long)8422428190749793560L, (long)var2_2);
                                                    }
                                                }
                                                var15_8 = true;
                                                v1 /* !! */  = (CallSite)true;
                                            }
                                            var16_9 /* !! */  = v1 /* !! */ ;
                                        }
                                        try {
                                            v4 /* !! */  = m44.a("t", (Object)this, (long)8518256837632653587L, (long)var2_2);
                                            v6 = var14_10;
                                            if (var2_2 < 0L) break block25;
                                            if (v6 != false) break block27;
                                            v9 = new Object[1];
                                            v9[0] = var4_3;
                                            v6 = m44.a("u", (Object)m44.a("t", (Object)this, (long)7725996112216027899L, (long)var2_2), (Object)v9, (long)7612789439529119254L, (long)var2_2);
                                        }
                                        catch (IllegalArgumentException v10) {
                                            throw m44.a("j", (Object)v10, (long)8422428190749793560L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        block28: {
                                            try {
                                                try {
                                                    if (var2_2 > 0L) {
                                                        if (v4 /* !! */  < v6) break block28;
                                                        v11 = m44.a("t", (Object)this, (long)8527376217932534822L, (long)var2_2);
                                                        v6 = var14_10;
                                                    }
                                                    if (var2_2 > 0L) {
                                                        if (v6 != false) break block29;
                                                    }
                                                    ** GOTO lbl90
                                                }
                                                catch (IllegalArgumentException v12) {
                                                    throw m44.a("j", (Object)v12, (long)8422428190749793560L, (long)var2_2);
                                                }
                                                v13 = new Object[1];
                                                v13[0] = var10_6;
                                                if (v11 >= m44.a("u", (Object)m44.a("t", (Object)this, (long)7725996112216027899L, (long)var2_2), (Object)v13, (long)8645775340631481170L, (long)var2_2)) break block30;
                                            }
                                            catch (IllegalArgumentException v14) {
                                                throw m44.a("j", (Object)v14, (long)8422428190749793560L, (long)var2_2);
                                            }
                                        }
                                        v4 /* !! */  = (CallSite)true;
                                    }
                                    catch (IllegalArgumentException v15) {
                                        throw m44.a("j", (Object)v15, (long)8422428190749793560L, (long)var2_2);
                                    }
                                }
                                var16_9 /* !! */  = v4 /* !! */ ;
                            }
                            v11 = var16_9 /* !! */ ;
                        }
                        try {
                            try {
                                v6 = var14_10;
lbl90:
                                // 2 sources

                                if (var2_2 > 0L) {
                                    if (v6 != false) break block31;
                                    if (v11 == false) break block32;
                                }
                                ** GOTO lbl109
                            }
                            catch (IllegalArgumentException v16) {
                                throw m44.a("j", (Object)v16, (long)8422428190749793560L, (long)var2_2);
                            }
                            v17 = new Object[1];
                            v17[0] = var12_7;
                            m44.a("u", (Object)m44.a("n", (long)7961907218985634319L, (long)var2_2), (Object)m44.a("u", (Object)m44.a("t", (Object)this, (long)7725996112216027899L, (long)var2_2), (Object)v17, (long)8194613462446252844L, (long)var2_2), (long)8354182195592260069L, (long)var2_2);
                        }
                        catch (IllegalArgumentException v18) {
                            throw m44.a("j", (Object)v18, (long)8422428190749793560L, (long)var2_2);
                        }
                    }
                    v11 = var15_8;
                }
                try {
                    v6 = var14_10;
lbl109:
                    // 2 sources

                    if (v6 != false) break block33;
                    if (v11 == false) break block34;
                }
                catch (IllegalArgumentException v19) {
                    throw m44.a("j", (Object)v19, (long)8422428190749793560L, (long)var2_2);
                }
                v11 = 1;
            }
            m44.a("j", (int)v11, (long)8633602955804966343L, (long)var2_2);
        }
    }

    public String getNewClassName(String string) {
        String string2;
        block10: {
            String string3;
            block11: {
                Object object;
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = a ^ 0x227E6C3FEA27L;
                        l11 = l10 ^ 0x6364935EDF36L;
                        callSite = m44.a("j", (long)6923484156293772671L, (long)l10);
                        try {
                            try {
                                object = string;
                                if (callSite != false) break block8;
                                if (object != null) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("j", (Object)illegalArgumentException, (long)6927172267561028056L, (long)l10);
                            }
                            throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC91533DC43FBDE1L ^ l10))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("j", (Object)illegalArgumentException, (long)6927172267561028056L, (long)l10);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l11;
                    objectArray[0] = string;
                    object = m44.a("u", (Object)m44.a("t", (Object)this, (long)7486997451767751449L, (long)l10), (Object)objectArray, (long)7254295905337971257L, (long)l10);
                }
                string3 = object;
                try {
                    try {
                        string2 = string3;
                        if (callSite != false) break block10;
                        if (string2 != null) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)6927172267561028056L, (long)l10);
                    }
                    return string;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)6927172267561028056L, (long)l10);
                }
            }
            string2 = cf.a(string3);
        }
        return string2;
    }

    /*
     * Exception decompiling
     */
    private void F(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[CATCHBLOCK]], but top level block is 8[TRYBLOCK]
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

    public String getLogFileName() {
        long l10 = a ^ 0x6820C94DB3AAL;
        return m44.a("q", (Object)this, (long)2687838762512109666L, (long)l10);
    }

    public List getOldPackageNames() {
        long l10;
        long l11 = l10 = a ^ 0x56E171F0FBEFL;
        long l12 = l11 ^ 0x1E0B9FDABA04L;
        long l13 = l11 ^ 0x21D82BA2E14DL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = m44.a("u", (Object)m44.a("t", (Object)this, (long)8516126698512593617L, (long)l10), (Object)objectArray, (long)8176208041812162874L, (long)l10);
        return m44.a("k", (Object)this, (Object)objectArray2, (long)7567782206217973371L, (long)l10);
    }

    public String getNewMethodName(String string, String string2) {
        CallSite callSite;
        long l10;
        block8: {
            ZKMChangeLog zKMChangeLog;
            block7: {
                long l11 = l10 = a ^ 0x44D8C62B974EL;
                long l12 = l11 ^ 0x2E1C3D467ACBL;
                long l13 = l11 ^ 0x15C07BC35857L;
                CallSite callSite2 = m44.a("k", (long)1844535645197910802L, (long)l10);
                try {
                    if (string == null) {
                        throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC91359B6E2BC088L ^ l10))));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)2110821392361321649L, (long)l10);
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l12;
                objectArray[0] = string2;
                callSite = m44.a("j", (Object)this, (Object)objectArray, (long)10185361047568601L, (long)l10);
                try {
                    try {
                        zKMChangeLog = this;
                        if (callSite2 == false) break block7;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l13;
                        objectArray2[0] = string;
                        if (m44.a("t", (Object)m44.a("u", (Object)zKMChangeLog, (long)1913552812781559408L, (long)l10), (Object)objectArray2, (long)258385513285699820L, (long)l10) == false) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)2110821392361321649L, (long)l10);
                    }
                    zKMChangeLog = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)2110821392361321649L, (long)l10);
                }
            }
            return m44.a("t", (Object)zKMChangeLog, (Object)string, (Object)m44.a("u", (Object)callSite, (long)256092713712641500L, (long)l10), (Object)m44.a("u", (Object)callSite, (long)2109293934703720222L, (long)l10), (Object)m44.a("u", (Object)callSite, (long)549232814609030115L, (long)l10), (long)2164392395877946783L, (long)l10);
        }
        return m44.a("u", (Object)callSite, (long)256092713712641500L, (long)l10);
    }

    public boolean isOldFieldPresent(String string, String string2) {
        Object object;
        block8: {
            block9: {
                long l10;
                block11: {
                    int n10;
                    int n11;
                    block10: {
                        l10 = a ^ 0x2FF44596AA45L;
                        long l11 = l10 ^ 0x7EECF87E655CL;
                        CallSite callSite = m44.a("h", (long)2339379910336197917L, (long)l10);
                        try {
                            if (string == null) {
                                throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27854, (long)(0x5AB998422A67D7EL ^ l10))));
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("h", (Object)illegalArgumentException, (long)2323945316715383226L, (long)l10);
                        }
                        try {
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l11;
                            objectArray[0] = string;
                            object = m44.a("w", (Object)m44.a("v", (Object)this, (long)2847723062440649595L, (long)l10), (Object)objectArray, (long)4512205976744326631L, (long)l10);
                            if (callSite != false) break block8;
                            if (object == false) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("h", (Object)illegalArgumentException, (long)2323945316715383226L, (long)l10);
                        }
                        n11 = string2.indexOf(" ");
                        try {
                            n10 = n11;
                            if (callSite != false) break block10;
                            if (n10 <= 0) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("h", (Object)illegalArgumentException, (long)2323945316715383226L, (long)l10);
                        }
                        n10 = n11;
                    }
                    if (n10 < string2.length() - 1) {
                        String string3 = string2.substring(0, n11);
                        String string4 = string2.substring(n11 + 1);
                        return (boolean)m44.a("w", (Object)this, (Object)string, (Object)string4, (Object)string3, (long)2508787668442996222L, (long)l10);
                    }
                }
                throw new IllegalArgumentException("'" + string2 + (String)((Object)ZKMChangeLog.a("f", (int)29331, (long)(0x32AEE1C33186322L ^ l10))));
            }
            object = false;
        }
        return (boolean)object;
    }

    public List getNewPackageNames() {
        long l10;
        long l11 = l10 = a ^ 0x226B19B41230L;
        long l12 = l11 ^ 0x794E16C45E41L;
        long l13 = l11 ^ 0x555243E60892L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = m44.a("r", (Object)m44.a("s", (Object)this, (long)-6921987999079802098L, (long)l10), (Object)objectArray, (long)-8722886971792477111L, (long)l10);
        return m44.a("l", (Object)this, (Object)objectArray2, (long)-9162189332434384988L, (long)l10);
    }

    public String getOldClassName(String string) {
        String string2;
        block10: {
            String string3;
            block11: {
                Object object;
                CallSite callSite;
                long l10;
                block8: {
                    long l11;
                    block9: {
                        l10 = a ^ 0x42F0620B4703L;
                        l11 = l10 ^ 0x38FDD745B288L;
                        callSite = m44.a("n", (long)-3661065142631933861L, (long)l10);
                        try {
                            try {
                                object = string;
                                if (callSite != false) break block8;
                                if (object != null) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("n", (Object)illegalArgumentException, (long)-3673209998334417668L, (long)l10);
                            }
                            throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)3807, (long)(0x4ED1A9DA7B8D7237L ^ l10))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("n", (Object)illegalArgumentException, (long)-3673209998334417668L, (long)l10);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = string;
                    objectArray[0] = l11;
                    object = m44.a("q", (Object)m44.a("p", (Object)this, (long)-3836143233882419651L, (long)l10), (Object)objectArray, (long)-3628957694342106628L, (long)l10);
                }
                string3 = object;
                try {
                    try {
                        string2 = string3;
                        if (callSite != false) break block10;
                        if (string2 != null) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)-3673209998334417668L, (long)l10);
                    }
                    return string;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)-3673209998334417668L, (long)l10);
                }
            }
            string2 = cf.a(string3);
        }
        return string2;
    }

    public String getOldMethodName(String string, String string2, String[] stringArray, String string3) {
        block18: {
            block20: {
                CallSite callSite;
                block21: {
                    CallSite callSite2;
                    block22: {
                        String string4;
                        String[] stringArray2;
                        String string5;
                        String string6;
                        CallSite callSite3;
                        CallSite callSite4;
                        long l10;
                        long l11;
                        long l12;
                        block19: {
                            CallSite callSite5;
                            long l13;
                            block17: {
                                long l14 = l12 = a ^ 0x775BE7C43C26L;
                                l13 = l14 ^ 0x5638D603D770L;
                                long l15 = l14 ^ 0x39786F5C5D64L;
                                long l16 = l14 ^ 0x22EE28C67A24L;
                                l11 = l14 ^ 0x147F164D5943L;
                                l10 = l14 ^ 0x12EAC9923A55L;
                                callSite4 = m44.a("k", (long)-5326494960657849474L, (long)l12);
                                try {
                                    if (string == null) {
                                        throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)3807, (long)(0x4ED19C71FE420912L ^ l12))));
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("k", (Object)illegalArgumentException, (long)-5322384649474646055L, (long)l12);
                                }
                                try {
                                    try {
                                        try {
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = string;
                                            objectArray[0] = l16;
                                            callSite5 = m44.a("t", (Object)m44.a("u", (Object)this, (long)-5627672531610307304L, (long)l12), (Object)objectArray, (long)-5488466603498242603L, (long)l12);
                                            if (callSite4 != false) break block17;
                                            if (callSite5 == false) break block18;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("k", (Object)illegalArgumentException, (long)-5322384649474646055L, (long)l12);
                                        }
                                        callSite3 = m44.a("u", (Object)this, (long)-5627672531610307304L, (long)l12);
                                        string6 = string;
                                        string5 = string2;
                                        stringArray2 = stringArray;
                                        string4 = string3;
                                        if (callSite4 == false) {
                                        }
                                        break block19;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("k", (Object)illegalArgumentException, (long)-5322384649474646055L, (long)l12);
                                    }
                                    Object[] objectArray = new Object[5];
                                    objectArray[4] = string4;
                                    objectArray[3] = stringArray2;
                                    objectArray[2] = l15;
                                    objectArray[1] = string5;
                                    objectArray[0] = string6;
                                    callSite5 = m44.a("t", (Object)callSite3, (Object)objectArray, (long)-5497102971666845148L, (long)l12);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("k", (Object)illegalArgumentException, (long)-5322384649474646055L, (long)l12);
                                }
                            }
                            try {
                                if (callSite5 != false) {
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l13;
                                    m44.a("j", (Object)this, (Object)objectArray, (long)-6050498510030433040L, (long)l12);
                                    callSite3 = m44.a("u", (Object)this, (long)-5627672531610307304L, (long)l12);
                                    string6 = string;
                                    string5 = string2;
                                    stringArray2 = stringArray;
                                    string4 = string3;
                                }
                                break block20;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("k", (Object)illegalArgumentException, (long)-5322384649474646055L, (long)l12);
                            }
                        }
                        Object[] objectArray = new Object[5];
                        objectArray[4] = string4;
                        objectArray[3] = l10;
                        objectArray[2] = stringArray2;
                        objectArray[1] = string5;
                        objectArray[0] = string6;
                        callSite2 = m44.a("t", (Object)callSite3, (Object)objectArray, (long)-5606293260655316202L, (long)l12);
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l11;
                                m44.a("j", (Object)this, (Object)objectArray2, (long)-5490153704357498288L, (long)l12);
                                callSite = callSite2;
                                if (callSite4 != false) break block21;
                                if (callSite != null) break block22;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("k", (Object)illegalArgumentException, (long)-5322384649474646055L, (long)l12);
                            }
                            return string2;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("k", (Object)illegalArgumentException, (long)-5322384649474646055L, (long)l12);
                        }
                    }
                    callSite = callSite2;
                }
                return callSite;
            }
            return string2;
        }
        return string2;
    }

    public String getNewMethodSignature(String string, String string2) {
        block8: {
            ZKMChangeLog zKMChangeLog;
            CallSite callSite;
            long l10;
            block7: {
                long l11 = l10 = a ^ 0x322D00724DA3L;
                long l12 = l11 ^ 0x58E9FB1FA026L;
                long l13 = l11 ^ 0x6335BD9A82BAL;
                CallSite callSite2 = m44.a("n", (long)-4362741672601675265L, (long)l10);
                try {
                    if (string == null) {
                        throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC91436EA8721A65L ^ l10))));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)-4060467670772601252L, (long)l10);
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l12;
                objectArray[0] = string2;
                callSite = m44.a("o", (Object)this, (Object)objectArray, (long)-2681513705732072908L, (long)l10);
                try {
                    try {
                        zKMChangeLog = this;
                        if (callSite2 == false) break block7;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l13;
                        objectArray2[0] = string;
                        if (m44.a("q", (Object)m44.a("p", (Object)zKMChangeLog, (long)-4583757526128753507L, (long)l10), (Object)objectArray2, (long)-2776312263964257791L, (long)l10) == false) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)-4060467670772601252L, (long)l10);
                    }
                    zKMChangeLog = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)-4060467670772601252L, (long)l10);
                }
            }
            return m44.a("q", (Object)zKMChangeLog, (Object)string, (Object)m44.a("p", (Object)callSite, (long)-2783044238664679631L, (long)l10), (Object)m44.a("p", (Object)callSite, (long)-4059782455698166285L, (long)l10), (Object)m44.a("p", (Object)callSite, (long)-2489871979132518130L, (long)l10), (long)-2654392717846714814L, (long)l10);
        }
        return string2;
    }

    public String getNewMethodName(String string, String string2, String[] stringArray, String string3) {
        block15: {
            block17: {
                CallSite callSite;
                block18: {
                    CallSite callSite2;
                    block19: {
                        String string4;
                        String[] stringArray2;
                        String string5;
                        String string6;
                        CallSite callSite3;
                        CallSite callSite4;
                        long l10;
                        long l11;
                        long l12;
                        block16: {
                            CallSite callSite5;
                            long l13;
                            block14: {
                                long l14 = l12 = a ^ 0x565AE386EFB7L;
                                l13 = l14 ^ 0x7739D24104E1L;
                                long l15 = l14 ^ 0x4692A0E8AAD3L;
                                long l16 = l14 ^ 0x7425E6E20AEL;
                                l11 = l14 ^ 0x357E120F8AD2L;
                                l10 = l14 ^ 0x7DBC756BB18FL;
                                callSite4 = m44.a("j", (long)7016619109974293483L, (long)l12);
                                try {
                                    if (string == null) {
                                        throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC9127194B86B871L ^ l12))));
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)7327979318058978376L, (long)l12);
                                }
                                try {
                                    try {
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l16;
                                        objectArray[0] = string;
                                        callSite5 = m44.a("u", (Object)m44.a("t", (Object)this, (long)7095241611170686601L, (long)l12), (Object)objectArray, (long)8893741489455968277L, (long)l12);
                                        if (callSite4 == false) break block14;
                                        if (callSite5 == false) break block15;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("j", (Object)illegalArgumentException, (long)7327979318058978376L, (long)l12);
                                    }
                                    callSite3 = m44.a("t", (Object)this, (long)7095241611170686601L, (long)l12);
                                    string6 = string;
                                    string5 = string2;
                                    stringArray2 = stringArray;
                                    string4 = string3;
                                    if (callSite4 == false) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)7327979318058978376L, (long)l12);
                                }
                                String string7 = string4;
                                String[] stringArray3 = stringArray2;
                                String string8 = string5;
                                String string9 = string6;
                                Object[] objectArray = new Object[5];
                                objectArray[4] = string7;
                                objectArray[3] = stringArray3;
                                objectArray[2] = string8;
                                objectArray[1] = string9;
                                objectArray[0] = l15;
                                callSite5 = m44.a("u", (Object)callSite3, (Object)objectArray, (long)7218108164173709406L, (long)l12);
                            }
                            try {
                                if (callSite5 != false) {
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l13;
                                    m44.a("k", (Object)this, (Object)objectArray, (long)9194501784232118113L, (long)l12);
                                    callSite3 = m44.a("t", (Object)this, (long)7095241611170686601L, (long)l12);
                                    string6 = string;
                                    string5 = string2;
                                    stringArray2 = stringArray;
                                    string4 = string3;
                                }
                                break block17;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("j", (Object)illegalArgumentException, (long)7327979318058978376L, (long)l12);
                            }
                        }
                        Object[] objectArray = new Object[5];
                        objectArray[4] = string4;
                        objectArray[3] = stringArray2;
                        objectArray[2] = l10;
                        objectArray[1] = string5;
                        objectArray[0] = string6;
                        callSite2 = m44.a("u", (Object)callSite3, (Object)objectArray, (long)7477186427742778463L, (long)l12);
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l11;
                                m44.a("k", (Object)this, (Object)objectArray2, (long)6944039671487472065L, (long)l12);
                                callSite = callSite2;
                                if (callSite4 == false) break block18;
                                if (callSite != null) break block19;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("j", (Object)illegalArgumentException, (long)7327979318058978376L, (long)l12);
                            }
                            return string2;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("j", (Object)illegalArgumentException, (long)7327979318058978376L, (long)l12);
                        }
                    }
                    callSite = callSite2;
                }
                return callSite;
            }
            return string2;
        }
        return string2;
    }

    public boolean isOldPackagePresent(String string) {
        long l10 = a ^ 0x6F9EC7B448A1L;
        long l11 = l10 ^ 0x3FDD5707B668L;
        try {
            if (string == null) {
                throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)30429, (long)(0x94B783F069F0595L ^ l10))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("l", (Object)illegalArgumentException, (long)-4421391782581752994L, (long)l10);
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = string;
        objectArray[0] = l11;
        return (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)-4223983499329896033L, (long)l10), (Object)objectArray, (long)-2798324246245215897L, (long)l10);
    }

    private void T(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = a ^ l10;
        long l12 = l11 ^ 0x30FA4C30467FL;
        long l13 = l11 ^ 0x7BAF79C79823L;
        long l14 = l11 ^ 0x339CD7440E38L;
        long l15 = l11 ^ 0x5F79E0073171L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l15;
        m44.a("u", (Object)this, (int)m44.a("v", (Object)m44.a("w", (Object)this, (long)-1942455788796511032L, (long)l10), (Object)objectArray2, (long)-447909586412415647L, (long)l10), (long)-548294310610265579L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l12;
        m44.a("u", (Object)this, (int)m44.a("v", (Object)m44.a("w", (Object)this, (long)-1942455788796511032L, (long)l10), (Object)objectArray3, (long)-1759414390715260891L, (long)l10), (long)-574860750000195808L, (long)l10);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l14;
        m44.a("u", (Object)this, (int)m44.a("v", (Object)m44.a("w", (Object)this, (long)-1942455788796511032L, (long)l10), (Object)objectArray4, (long)-1842626013091006927L, (long)l10), (long)-1893820113988533154L, (long)l10);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l13;
        m44.a("u", (Object)this, (int)m44.a("v", (Object)m44.a("w", (Object)this, (long)-1942455788796511032L, (long)l10), (Object)objectArray5, (long)-1799841333174538094L, (long)l10), (long)-387725608218341399L, (long)l10);
    }

    public List getOldMethodSignaturesForClass(String string) {
        long l10 = a ^ 0x7918C080304EL;
        long l11 = l10 ^ 0x2326623B6C11L;
        try {
            if (string == null) {
                throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC91085B68806788L ^ l10))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("k", (Object)illegalArgumentException, (long)-5022893336632601679L, (long)l10);
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l11;
        objectArray[0] = string;
        return m44.a("t", (Object)m44.a("u", (Object)this, (long)-4787761926088099472L, (long)l10), (Object)objectArray, (long)-6794078895624958562L, (long)l10);
    }

    public List getOldClassNames() {
        long l10;
        long l11 = l10 = a ^ 0x4645F74B1E46L;
        long l12 = l11 ^ 0x317CAD1904E4L;
        long l13 = l11 ^ 0x36369DEC789BL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l13;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l12;
        objectArray2[0] = m44.a("t", (Object)m44.a("u", (Object)this, (long)-7816475749532313736L, (long)l10), (Object)objectArray, (long)-8486367639151260916L, (long)l10);
        return m44.a("j", (Object)this, (Object)objectArray2, (long)-8309359605861905454L, (long)l10);
    }

    public List getOldMethodSignatures(String string, String string2) {
        long l10 = a ^ 0xE47CF88197AL;
        long l11 = l10 ^ 0x2BCD62674237L;
        try {
            if (string == null) {
                throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)3807, (long)(0x4ED1E56DD60E2C4EL ^ l10))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("o", (Object)illegalArgumentException, (long)-7818409205284570491L, (long)l10);
        }
        Object[] objectArray = new Object[3];
        objectArray[2] = l11;
        objectArray[1] = string2;
        objectArray[0] = string;
        return m44.a("p", (Object)m44.a("q", (Object)this, (long)-7729860613091307452L, (long)l10), (Object)objectArray, (long)-8403727408008450206L, (long)l10);
    }

    public String getNewFieldName(String string, String string2) {
        String string3;
        block16: {
            ZKMChangeLog zKMChangeLog;
            String string4;
            long l10;
            block15: {
                int n10;
                CallSite callSite;
                long l11;
                block17: {
                    block14: {
                        int n11;
                        block13: {
                            l10 = a ^ 0x64C03739CCBEL;
                            l11 = l10 ^ 0x35D88AD103A7L;
                            callSite = m44.a("k", (long)5083559670806303718L, (long)l10);
                            try {
                                if (string == null) {
                                    throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC9115839F399B78L ^ l10))));
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("k", (Object)illegalArgumentException, (long)5096672658644250433L, (long)l10);
                            }
                            string3 = null;
                            string4 = null;
                            n10 = string2.indexOf(" ");
                            try {
                                n11 = n10;
                                if (callSite != false) break block13;
                                if (n11 <= 0) break block14;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("k", (Object)illegalArgumentException, (long)5096672658644250433L, (long)l10);
                            }
                            n11 = n10;
                        }
                        if (n11 < string2.length() - 1) break block17;
                    }
                    throw new IllegalArgumentException("'" + string2 + (String)((Object)ZKMChangeLog.a("f", (int)20468, (long)(0x78615D7F64EDB8B8L ^ l10))));
                }
                string4 = string2.substring(0, n10);
                string3 = string2.substring(n10 + 1);
                try {
                    try {
                        zKMChangeLog = this;
                        if (callSite != false) break block15;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l11;
                        objectArray[0] = string;
                        if (m44.a("t", (Object)m44.a("u", (Object)zKMChangeLog, (long)4719330671592015232L, (long)l10), (Object)objectArray, (long)6369735127694709532L, (long)l10) == false) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)5096672658644250433L, (long)l10);
                    }
                    zKMChangeLog = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)5096672658644250433L, (long)l10);
                }
            }
            return m44.a("t", (Object)zKMChangeLog, (Object)string, (Object)string3, (Object)string4, (long)6346479621321160535L, (long)l10);
        }
        return string3;
    }

    public String getNewFieldName(String string, String string2, String string3) {
        block17: {
            block19: {
                CallSite callSite;
                block20: {
                    CallSite callSite2;
                    block21: {
                        String string4;
                        String string5;
                        String string6;
                        CallSite callSite3;
                        CallSite callSite4;
                        long l10;
                        long l11;
                        long l12;
                        block18: {
                            CallSite callSite5;
                            long l13;
                            block16: {
                                long l14 = l12 = a ^ 0x4A58A0F61909L;
                                l13 = l14 ^ 0x6B3B9131F25FL;
                                long l15 = l14 ^ 0x7A2864D4FA4AL;
                                l11 = l14 ^ 0x34D72B7EE722L;
                                long l16 = l14 ^ 0x1B401D1ED610L;
                                l10 = l14 ^ 0x297C517F7C6CL;
                                callSite4 = m44.a("l", (long)-7503535852013957803L, (long)l12);
                                try {
                                    if (string == null) {
                                        throw new IllegalArgumentException((String)((Object)ZKMChangeLog.a("f", (int)27706, (long)(0xC913B1B08F64ECFL ^ l12))));
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)-7850853462683125002L, (long)l12);
                                }
                                try {
                                    try {
                                        try {
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = l16;
                                            objectArray[0] = string;
                                            callSite5 = m44.a("s", (Object)m44.a("r", (Object)this, (long)-7725572606382387145L, (long)l12), (Object)objectArray, (long)-8227242259517684053L, (long)l12);
                                            if (callSite4 == false) break block16;
                                            if (callSite5 == false) break block17;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("l", (Object)illegalArgumentException, (long)-7850853462683125002L, (long)l12);
                                        }
                                        callSite3 = m44.a("r", (Object)this, (long)-7725572606382387145L, (long)l12);
                                        string6 = string;
                                        string5 = string2;
                                        string4 = string3;
                                        if (callSite4 != false) {
                                        }
                                        break block18;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("l", (Object)illegalArgumentException, (long)-7850853462683125002L, (long)l12);
                                    }
                                    Object[] objectArray = new Object[4];
                                    objectArray[3] = string4;
                                    objectArray[2] = l15;
                                    objectArray[1] = string5;
                                    objectArray[0] = string6;
                                    callSite5 = m44.a("s", (Object)callSite3, (Object)objectArray, (long)-7560359533447649329L, (long)l12);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)-7850853462683125002L, (long)l12);
                                }
                            }
                            try {
                                if (callSite5 == false) break block19;
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l13;
                                m44.a("m", (Object)this, (Object)objectArray, (long)-8563750090933980705L, (long)l12);
                                callSite3 = m44.a("r", (Object)this, (long)-7725572606382387145L, (long)l12);
                                string6 = string;
                                string5 = string2;
                                string4 = string3;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("l", (Object)illegalArgumentException, (long)-7850853462683125002L, (long)l12);
                            }
                        }
                        Object[] objectArray = new Object[4];
                        objectArray[3] = l11;
                        objectArray[2] = string4;
                        objectArray[1] = string5;
                        objectArray[0] = string6;
                        callSite2 = m44.a("s", (Object)callSite3, (Object)objectArray, (long)-7710621478930324373L, (long)l12);
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l10;
                                m44.a("m", (Object)this, (Object)objectArray2, (long)-7574998188800878721L, (long)l12);
                                callSite = callSite2;
                                if (callSite4 == false) break block20;
                                if (callSite != null) break block21;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("l", (Object)illegalArgumentException, (long)-7850853462683125002L, (long)l12);
                            }
                            return string2;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)-7850853462683125002L, (long)l12);
                        }
                    }
                    callSite = callSite2;
                }
                return callSite;
            }
            return string2;
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                ZKMChangeLog.a = prr.a(8973195002008529211L, -7908271012603776821L, MethodHandles.lookup().lookupClass()).a(258829139522080L);
                ZKMChangeLog.d = new HashMap<K, V>(13);
                var0 = ZKMChangeLog.a ^ 123915683692494L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[19];
                var7_4 = 0;
                var6_5 = "\u00c8\u00c3b\u00bd\u00ed9\u00d2\u00c9S\u0084v\u00a8\u00e1\u00b7\u0001\u00b48\u00bb\u00f1\u00d4\u00b8u7\u00f3$^\u00ba|L\u00dcY(\u009aU\u0098\u0013SL\u0083\u0090=\u0094\u0018\u00ee5\u00eb\u00d3\u007f\u00f9'f\u001b'\"L\u0089\u00c7a[\u00e7\u00f8yK0%@\u0085\u00d0\u00de\u008f\u00dbk\u00b080\u0084\u00a8v!\u00bf!\u00e2\u00a8=\u000e_f\u00df\u0089\u00ac\u0017\u00c4W\u00a3\u00c4S.Np\u00f9\u00b9\u0080.\u0090\u008b\u0001\u00af\u00e4V\u0007G\u009e\u0005/.u\u00d5\u0081~\u00f9\u00ab\u009f\u0003H\u00b2v\u0016\u00cd \u00ea@k\u00c3\u00f3\u009d\u00ef\u00dd\u0011\u008a=Q\u00f4,\u0083\u00990\u0091\u0091IfB\u0007\u00b9s;\u00a8\u00cc\u0012\u00e2\u00cc\u00b63\u00ae'\u00ec\u009e\u00b5\u00a5\u00dd\u00f9 3=9\u009c\u001d~\u00ae\u0080\u00cb\u00e6\u00fb\u00ae\u00b7p\u00f4\u00de\u00a3\u008c\u00c8\u00eb\u0094\u00e2\u00c0%0\u00ab\u0011\u0082\u00f8\u00d0\u0002r\u00f8\u00c0\u00db\u008e\u008b\u00e0e\u00f0\u00d9M\u00c6Hh;m+\u008a\u0000\u0091\\H\tDB\u0082\u00ab\u0010.\f\u0010Q\u009dr\u000b\u00aa\u0085x(\u00d1\u00a7\u00d0@zF\u00a2\u00a4\u009b\u00d7\u00fe\u00a9\u0090\u00e3m\u00a0<\tBj\u009a<_\u00e1j\u00e3\u0088\u00ce\u00c2*\u00a1X\u0007\u00a3\u009b\u00f0\u00f8;7\u009a^L\u00a4\u00b5W_sq\u00dfAF\u00af\u009f ]\u009c\u0010\u0092W\u00d0\u00d4\u0085\u00e5`\u00ecP\u00f9\u00f1P\u00c2\u00b4\u00fd\u00c7l\u00b5\u001e\u0002\u00c3\u00d3\u0097MZ\u009a\"$9\u00f7\u00ce2+^d\u00a0\b\u00fb`Ym\u0019vv\u00ca9:B\u00e7\u007f\u00b8\u001d\u00e7\u00ef\n\u00d0\u00b4e\u0097D\u00bbK9{\u00b5\\\u00bc\u00e6g\\\u0000k\u008c\u00884$\u00f1\u0085\u0019\u0011\u00b7\u0083\u00d1\u00f2\u0019C`>\u0086\u00e7ps\u0010\u00a4#\u00ce\u0096\u0085X\u00df`\u0087E\u00baw\u00be\u0097\u0092\u001c@\u00bb\u00c2\u00ad\u008d\u0080Jf\u00d8\u00f5\u000e\b\u00ad\f\u0002lql\u00ee\u00cc8\u00ad\u00b3\u00ba\u008c\u00f5\u00f3s0\u00c0t/\u0003\u00ed\u001e\u00e8\u0007\u00a3s\u009c\u00f6\u00879\u00ff\n`f\u0097\u00d8\u00abV1<\u0003&[\u00fe\u0015\u00bd\u00a3\u00b6B\u00bc\u00a8-@\u00fa\u00e0T\u0003\u00c046\u00d2\u00b0T\u00b0\u0083m\u0097U\u0003P\u00dc\u0082\u008fr.\u009f\u00d9:\u00cbr\u0089\u00c6\u0004\u001d\u0086p\u009b\u00fb\u00f8\u00c5?\u00fe\u00b6\u00cd?$\u0007\u0005Wx\u00e6\u00f9\u00e9\u00bb^\u00e3-\u00cdG\u00a3d_b\u000b\u00f5\u001e\u00d7@\u00d9\u00b7:{r\u00d1G;\"\u00ef\u001dA-\u0000#\u00a2!\u00a2\u000b\u00ac\u00b2\u00bf\u00cd\u00bb%\u007f\u00fb\u00a4L\u009fE\t}.(\u00b0\u0005\u00c1\u008c\u0017\u000eC\u0010\u0019\u00ba4~\b*\u00a05\u00a2\u000f\u00a9g\"B\u009b\u008f\u00c0~&\u0010\u00af8gy\u0000\u0099\u008f\u009a\u00ed0\u0097\u00bf ~<\\\u0004\u00fd\u00d0\u00ae\u00aaV\u0081_\u0000\u00b7\f\u000f\u00af\u008b\u00d6\u00c0r\u00eb\u00f7x\u00ad\n`\u00e5\u00b8\u00ef\u0089\u0017\u00cfxn\u00bfW\u00b0\u00adg\f5\u008b\u00c9\u00ef(@,<{\u00fc\u00b9\u00a8\u00fd\u00d7C$RBt\u00d4\u00e7\u00a3\u000b\u00991\u001d\u00e9\u0080\u0011\u00ad\u0082\u00a5\u00e0\u008d>\u00aa+\u00f3(\u0091(\u0086\u00151\u00fc{\u0002\u0011tMt\u00d0\u00ce\u00f6\u0084f;\u0003\u0011\u00ed\u0006\u008f4\u00bb4s\u009a\u001d\u00c3\u00b2@\u00cc\u001d\u0018\u00a9\u00a1cy\u00ddU\u0019\u00aa\u009am\u0098\u009d\u00ec\u00a5\u0085Z;\u001b\u008b$;\u00b5\u00a4\u00ce\u0099V\u00bag\u00c0\u0096O\u00cf\u001d*\u00d5\u0095!#d=9c\u0095F\u00c4\u00df\u008d\u001aL\u001bu\u00dc:\u00903\u0084u\u00b32{\u00cb@5\u00be\u00bc\u00d9\u0083\u00e3\u008c\u00c4\u00d3Q\u00ba\u001e\u00b1j\u0098\u008a\u00f7\\\u00f1\u0082A=n\u00d3V(K\u00c8\u00e8+=\u00e6)\u00cc\u0015u#ZU\u00b9\u0004b\u00ebS\u0095)\u00f8\u00c3F\u001c\u00e0\u008f\u00ee\u00f9\u00eb\u00bb\u00d4\u008f\u007f\u00b1H\u00ecz\u00cfHGh\u0089'\u00c5\u00ea\u00c8JC\u00c3Q W\u0011!f*\u00ca\u00ee\u00d2\"b\u00d0j\u00b8\u009bP\u00e3\u00b5\u00b5+e;U\u00a4\u00ce\u009c\u008ds\u00c2\u0017\u00deS\u00b1f\u00e6\u00d1\u0092_\u00a7\u0019\u0096\u00ddZ\u00d7\u000f\u00b3\u00b6\u00e7\u00f1\u0011+\u00c2\tt\u001e\u007fr\u00924\u00f7\u00a9@\u00d0\u00a3^X\u00d2\u00bf\u0019\u00e6@\u0093\u00ddL\u0088\u001e\u0016U\u00d3\u00c3\u00ce\u00cc\u00ac\u00d3\u00f5\u00c1\u00a9(\u0095\u0098W\u0002\u00fb\u00e2\u00beK\u009c\u00ef\u0099W\u008d\u00c1\u00b2EC\u00ee\u00c6\u00fc\u008c+\u00ce\u00ed\u00be\u00ef_\u009a\u000f'Dw\u00fc\u009bH\u0091\u001e\u0000";
                var8_6 = "\u00c8\u00c3b\u00bd\u00ed9\u00d2\u00c9S\u0084v\u00a8\u00e1\u00b7\u0001\u00b48\u00bb\u00f1\u00d4\u00b8u7\u00f3$^\u00ba|L\u00dcY(\u009aU\u0098\u0013SL\u0083\u0090=\u0094\u0018\u00ee5\u00eb\u00d3\u007f\u00f9'f\u001b'\"L\u0089\u00c7a[\u00e7\u00f8yK0%@\u0085\u00d0\u00de\u008f\u00dbk\u00b080\u0084\u00a8v!\u00bf!\u00e2\u00a8=\u000e_f\u00df\u0089\u00ac\u0017\u00c4W\u00a3\u00c4S.Np\u00f9\u00b9\u0080.\u0090\u008b\u0001\u00af\u00e4V\u0007G\u009e\u0005/.u\u00d5\u0081~\u00f9\u00ab\u009f\u0003H\u00b2v\u0016\u00cd \u00ea@k\u00c3\u00f3\u009d\u00ef\u00dd\u0011\u008a=Q\u00f4,\u0083\u00990\u0091\u0091IfB\u0007\u00b9s;\u00a8\u00cc\u0012\u00e2\u00cc\u00b63\u00ae'\u00ec\u009e\u00b5\u00a5\u00dd\u00f9 3=9\u009c\u001d~\u00ae\u0080\u00cb\u00e6\u00fb\u00ae\u00b7p\u00f4\u00de\u00a3\u008c\u00c8\u00eb\u0094\u00e2\u00c0%0\u00ab\u0011\u0082\u00f8\u00d0\u0002r\u00f8\u00c0\u00db\u008e\u008b\u00e0e\u00f0\u00d9M\u00c6Hh;m+\u008a\u0000\u0091\\H\tDB\u0082\u00ab\u0010.\f\u0010Q\u009dr\u000b\u00aa\u0085x(\u00d1\u00a7\u00d0@zF\u00a2\u00a4\u009b\u00d7\u00fe\u00a9\u0090\u00e3m\u00a0<\tBj\u009a<_\u00e1j\u00e3\u0088\u00ce\u00c2*\u00a1X\u0007\u00a3\u009b\u00f0\u00f8;7\u009a^L\u00a4\u00b5W_sq\u00dfAF\u00af\u009f ]\u009c\u0010\u0092W\u00d0\u00d4\u0085\u00e5`\u00ecP\u00f9\u00f1P\u00c2\u00b4\u00fd\u00c7l\u00b5\u001e\u0002\u00c3\u00d3\u0097MZ\u009a\"$9\u00f7\u00ce2+^d\u00a0\b\u00fb`Ym\u0019vv\u00ca9:B\u00e7\u007f\u00b8\u001d\u00e7\u00ef\n\u00d0\u00b4e\u0097D\u00bbK9{\u00b5\\\u00bc\u00e6g\\\u0000k\u008c\u00884$\u00f1\u0085\u0019\u0011\u00b7\u0083\u00d1\u00f2\u0019C`>\u0086\u00e7ps\u0010\u00a4#\u00ce\u0096\u0085X\u00df`\u0087E\u00baw\u00be\u0097\u0092\u001c@\u00bb\u00c2\u00ad\u008d\u0080Jf\u00d8\u00f5\u000e\b\u00ad\f\u0002lql\u00ee\u00cc8\u00ad\u00b3\u00ba\u008c\u00f5\u00f3s0\u00c0t/\u0003\u00ed\u001e\u00e8\u0007\u00a3s\u009c\u00f6\u00879\u00ff\n`f\u0097\u00d8\u00abV1<\u0003&[\u00fe\u0015\u00bd\u00a3\u00b6B\u00bc\u00a8-@\u00fa\u00e0T\u0003\u00c046\u00d2\u00b0T\u00b0\u0083m\u0097U\u0003P\u00dc\u0082\u008fr.\u009f\u00d9:\u00cbr\u0089\u00c6\u0004\u001d\u0086p\u009b\u00fb\u00f8\u00c5?\u00fe\u00b6\u00cd?$\u0007\u0005Wx\u00e6\u00f9\u00e9\u00bb^\u00e3-\u00cdG\u00a3d_b\u000b\u00f5\u001e\u00d7@\u00d9\u00b7:{r\u00d1G;\"\u00ef\u001dA-\u0000#\u00a2!\u00a2\u000b\u00ac\u00b2\u00bf\u00cd\u00bb%\u007f\u00fb\u00a4L\u009fE\t}.(\u00b0\u0005\u00c1\u008c\u0017\u000eC\u0010\u0019\u00ba4~\b*\u00a05\u00a2\u000f\u00a9g\"B\u009b\u008f\u00c0~&\u0010\u00af8gy\u0000\u0099\u008f\u009a\u00ed0\u0097\u00bf ~<\\\u0004\u00fd\u00d0\u00ae\u00aaV\u0081_\u0000\u00b7\f\u000f\u00af\u008b\u00d6\u00c0r\u00eb\u00f7x\u00ad\n`\u00e5\u00b8\u00ef\u0089\u0017\u00cfxn\u00bfW\u00b0\u00adg\f5\u008b\u00c9\u00ef(@,<{\u00fc\u00b9\u00a8\u00fd\u00d7C$RBt\u00d4\u00e7\u00a3\u000b\u00991\u001d\u00e9\u0080\u0011\u00ad\u0082\u00a5\u00e0\u008d>\u00aa+\u00f3(\u0091(\u0086\u00151\u00fc{\u0002\u0011tMt\u00d0\u00ce\u00f6\u0084f;\u0003\u0011\u00ed\u0006\u008f4\u00bb4s\u009a\u001d\u00c3\u00b2@\u00cc\u001d\u0018\u00a9\u00a1cy\u00ddU\u0019\u00aa\u009am\u0098\u009d\u00ec\u00a5\u0085Z;\u001b\u008b$;\u00b5\u00a4\u00ce\u0099V\u00bag\u00c0\u0096O\u00cf\u001d*\u00d5\u0095!#d=9c\u0095F\u00c4\u00df\u008d\u001aL\u001bu\u00dc:\u00903\u0084u\u00b32{\u00cb@5\u00be\u00bc\u00d9\u0083\u00e3\u008c\u00c4\u00d3Q\u00ba\u001e\u00b1j\u0098\u008a\u00f7\\\u00f1\u0082A=n\u00d3V(K\u00c8\u00e8+=\u00e6)\u00cc\u0015u#ZU\u00b9\u0004b\u00ebS\u0095)\u00f8\u00c3F\u001c\u00e0\u008f\u00ee\u00f9\u00eb\u00bb\u00d4\u008f\u007f\u00b1H\u00ecz\u00cfHGh\u0089'\u00c5\u00ea\u00c8JC\u00c3Q W\u0011!f*\u00ca\u00ee\u00d2\"b\u00d0j\u00b8\u009bP\u00e3\u00b5\u00b5+e;U\u00a4\u00ce\u009c\u008ds\u00c2\u0017\u00deS\u00b1f\u00e6\u00d1\u0092_\u00a7\u0019\u0096\u00ddZ\u00d7\u000f\u00b3\u00b6\u00e7\u00f1\u0011+\u00c2\tt\u001e\u007fr\u00924\u00f7\u00a9@\u00d0\u00a3^X\u00d2\u00bf\u0019\u00e6@\u0093\u00ddL\u0088\u001e\u0016U\u00d3\u00c3\u00ce\u00cc\u00ac\u00d3\u00f5\u00c1\u00a9(\u0095\u0098W\u0002\u00fb\u00e2\u00beK\u009c\u00ef\u0099W\u008d\u00c1\u00b2EC\u00ee\u00c6\u00fc\u008c+\u00ce\u00ed\u00be\u00ef_\u009a\u000f'Dw\u00fc\u009bH\u0091\u001e\u0000".length();
                var5_7 = 16;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = ZKMChangeLog.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0093\u00f1\u00f2\u00a8^i#7\u00fb\u009etS\u00dd\u00bf\u00cf\u00ed\u0085\u00fe\u00e4\u0099\u00fc\u00beD\u00e5\u00a3\u00fe{\u000fT\u00e8\u00ecD@\u00a7\u00cb_\u008b1\u00a7\u00abq\u009fhX\u009c\u00bb#p\u0082VYg\u00b5\u0012X]\u000b\u00e3\u0005\u00f3\u008d\u0099<\u0091\u00c9\u000e\u00cc\u00db%\u00b2T\u00c3P\u00dan\u0096N\u00a8Q\u0000U9\u00f0\u001b_t\u0006H\u0012\u0098\f[\u00db\u0003\u00d8\u0089\u0016";
                    var8_6 = "\u0093\u00f1\u00f2\u00a8^i#7\u00fb\u009etS\u00dd\u00bf\u00cf\u00ed\u0085\u00fe\u00e4\u0099\u00fc\u00beD\u00e5\u00a3\u00fe{\u000fT\u00e8\u00ecD@\u00a7\u00cb_\u008b1\u00a7\u00abq\u009fhX\u009c\u00bb#p\u0082VYg\u00b5\u0012X]\u000b\u00e3\u0005\u00f3\u008d\u0099<\u0091\u00c9\u000e\u00cc\u00db%\u00b2T\u00c3P\u00dan\u0096N\u00a8Q\u0000U9\u00f0\u001b_t\u0006H\u0012\u0098\f[\u00db\u0003\u00d8\u0089\u0016".length();
                    var5_7 = 32;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = ZKMChangeLog.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        ZKMChangeLog.b = var9_3;
        ZKMChangeLog.c = new String[19];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String b(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x207B;
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
                throw new RuntimeException("com/zelix/ZKMChangeLog", exception);
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
            ZKMChangeLog.c[n11] = ZKMChangeLog.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ZKMChangeLog.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ZKMChangeLog" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ZKMChangeLog.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

