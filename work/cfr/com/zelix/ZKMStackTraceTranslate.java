/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dn;
import com.zelix.em;
import com.zelix.hn;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.s4;
import com.zelix.sz;
import com.zelix.ur;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.InvocationTargetException;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ZKMStackTraceTranslate
extends dn {
    private Set c;
    private ArrayList n;
    public static final int NO_PARAM_TYPES = 1;
    public static final int UNQUALIFIED_PARAM_TYPES;
    private hn M;
    public static final int FULL_PARAM_TYPES;
    private static final long a;
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    public ZKMStackTraceTranslate(String[] stringArray) {
        this(stringArray, null);
    }

    public void close() {
        block4: {
            long l10;
            long l11;
            block5: {
                long l12 = l11 = a ^ 0x4183C0ABA4EAL;
                long l13 = l12 ^ 0x65EE8053679L;
                l10 = l12 ^ 0x51F8642EF2BCL;
                CallSite callSite = m44.a("k", (long)-5963824458241755050L, (long)l11);
                try {
                    try {
                        if (callSite != false) break block4;
                        if (m44.a("u", (Object)this, (long)-5550851742405332940L, (long)l11) == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-5690272342941738927L, (long)l11);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l13;
                    m44.a("t", (Object)m44.a("u", (Object)this, (long)-5550851742405332940L, (long)l11), (Object)objectArray, (long)-5573041101096180535L, (long)l11);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)-5690272342941738927L, (long)l11);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l10;
            m44.a("k", (Object)objectArray, (long)-5635357074863388356L, (long)l11);
        }
    }

    public String getOldMethodName(String string, String string2, String[] stringArray, String string3) {
        long l10 = a ^ 0x4AC48BEE5F48L;
        long l11 = l10 ^ 0x79E24C3E4D92L;
        try {
            Object[] objectArray = new Object[5];
            objectArray[4] = string3;
            objectArray[3] = stringArray;
            objectArray[2] = string2;
            objectArray[1] = l11;
            objectArray[0] = string;
            return m44.a("v", (Object)m44.a("w", (Object)this, (long)5284238558139747222L, (long)l10), (Object)objectArray, (long)6096401997468672835L, (long)l10);
        }
        catch (ur ur2) {
            return (String)((Object)ZKMStackTraceTranslate.a("t", (int)20826, (long)(0x746D0EC533F4DE10L ^ l10))) + (String)((Object)m44.a("v", (Object)ur2, (long)5362936449819037467L, (long)l10)) + "\"" + (String)((Object)m44.a("m", (long)6249246512624868776L, (long)l10));
        }
    }

    public ZKMStackTraceTranslate(String string, String string2) {
        long l10 = a ^ 0x34DE2E517504L;
        if (string == null) {
            throw new IllegalArgumentException((String)((Object)ZKMStackTraceTranslate.a("t", (int)15097, (long)(0x6499B840951A1FF2L ^ l10))));
        }
        String[] stringArray = new String[]{string};
        m44.a("r", (Object)this, (Object)stringArray, (Object)string2, (long)7377425000756324362L, (long)l10);
    }

    public static void main(String[] stringArray) {
        long l10;
        long l11 = l10 = prr.a(-6679370506395368511L, 1867230016283270934L, MethodHandles.lookup().lookupClass()).a(49878763558691L) ^ 0x25437C8C730AL;
        long l12 = l11 ^ 0x2BA9BF61C094L;
        long l13 = l11 ^ 0x32E032965AE6L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l13;
        m44.a("i", (Object)objectArray, (long)1842345537646371174L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        m44.a("i", (Object)objectArray2, (long)1855639423030936578L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    public String getOldMethodSignatures(String var1_1, String var2_2) {
        var3_3 = ZKMStackTraceTranslate.a ^ 102500277593624L;
        var5_4 = var3_3 ^ 106494500846057L;
        var7_5 = m44.a("i", (long)-5778643912973370716L, (long)var3_3);
        try {
            block13: {
                v0 = new Object[3];
                v0[2] = var2_2;
                v0[1] = var5_4;
                v0[0] = var1_1;
                var9_6 = m44.a("v", (Object)m44.a("w", (Object)this, (long)-5763071483662601530L, (long)var3_3), (Object)v0, (long)-6084650355492091235L, (long)var3_3);
                var10_8 = new StringBuffer();
                var10_8.append("[");
                for (var11_9 = 0; var11_9 < ((CallSite)var9_6).length; ++var11_9) {
                    block14: {
                        block16: {
                            block15: {
                                var10_8.append((String)var9_6[var11_9]);
                                if (var7_5 != false) break block13;
                                v1 = var11_9;
                                v2 = ((CallSite)var9_6).length - 2;
                                if (var7_5 != false) break block14;
                                break block15;
                                catch (ur v3) {
                                    throw m44.a("i", (Object)v3, (long)-5478053038160389469L, (long)var3_3);
                                }
                            }
                            if (v1 >= v2) ** GOTO lbl41
                            break block16;
                            catch (ur v4) {
                                throw m44.a("i", (Object)v4, (long)-5478053038160389469L, (long)var3_3);
                            }
                        }
                        try {
                            block17: {
                                var10_8.append((String)ZKMStackTraceTranslate.a("t", (int)16450, (long)(7112297469737711175L ^ var3_3)));
                                if (var7_5 == false) continue;
                                break block17;
                                catch (ur v5) {
                                    throw m44.a("i", (Object)v5, (long)-5478053038160389469L, (long)var3_3);
                                }
                            }
                            v1 = var11_9;
                            v2 = ((CallSite)var9_6).length - 1;
                        }
                        catch (ur v6) {
                            throw m44.a("i", (Object)v6, (long)-5478053038160389469L, (long)var3_3);
                        }
                    }
                    try {
                        if (v1 >= v2) continue;
                        var10_8.append((String)ZKMStackTraceTranslate.a("t", (int)30120, (long)(4943521371943797686L ^ var3_3)));
                        continue;
                    }
                    catch (ur v7) {
                        throw m44.a("i", (Object)v7, (long)-5478053038160389469L, (long)var3_3);
                    }
                }
                var10_8.append("]");
            }
            var8_10 = var10_8.toString();
        }
        catch (ur var9_7) {
            var8_10 = (String)ZKMStackTraceTranslate.a("t", (int)19507, (long)(7283118301412407841L ^ var3_3)) + (String)m44.a("v", (Object)var9_7, (long)-5531284881692576181L, (long)var3_3) + "\"" + (String)m44.a("m", (long)-5770835799568915208L, (long)var3_3);
        }
        return var8_10;
    }

    public String getTranslatedStackTrace(String string, boolean bl2) {
        long l10 = a ^ 0x1F1812D625AAL;
        return m44.a("t", (Object)this, (Object)string, (boolean)bl2, (int)2, (long)2924587237998297221L, (long)l10);
    }

    public ZKMStackTraceTranslate(String string) {
        this(string, null);
    }

    public String getOldClassName(String string) {
        Object object;
        long l10 = a ^ 0x3E6013A3F3F0L;
        long l11 = l10 ^ 0x6E70D4A5404CL;
        try {
            Object[] objectArray = new Object[2];
            objectArray[1] = l11;
            objectArray[0] = string;
            object = m44.a("v", (Object)m44.a("w", (Object)this, (long)-1878820884377360594L, (long)l10), (Object)objectArray, (long)-1740137569237486976L, (long)l10);
        }
        catch (ur ur2) {
            object = (String)((Object)ZKMStackTraceTranslate.a("t", (int)15928, (long)(0x48A04BC811D91DC0L ^ l10))) + (String)((Object)m44.a("v", (Object)ur2, (long)-1813667597536140381L, (long)l10)) + "\"" + (String)((Object)m44.a("m", (long)-431857159964774128L, (long)l10));
        }
        return object;
    }

    public ZKMStackTraceTranslate(String[] stringArray, String string) {
        long l10 = a ^ 0x51E633EEE18BL;
        m44.a("u", (Object)this, (Object)stringArray, (Object)string, (long)-941668163226616699L, (long)l10);
    }

    public void mandatoryContruction(String[] stringArray, String string) {
        Object object;
        int n10;
        long l10;
        long l11;
        block11: {
            String string2;
            Object object2;
            long l12;
            long l13;
            long l14;
            long l15;
            long l16;
            int n11;
            int n12;
            int n13;
            block10: {
                long l17 = l11 = a ^ 0x6DB137424DC6L;
                long l18 = l17 ^ 0x29FECE0BD71CL;
                n13 = (int)(l18 >>> 32);
                n12 = (int)(l18 << 32 >>> 48);
                n11 = (int)(l18 << 48 >>> 48);
                l16 = l17 ^ 0x2EE7E2A6E818L;
                l15 = l17 ^ 0x6238B7E997AEL;
                long l19 = l17 ^ 0x1C8178661AA7L;
                l10 = l19 >>> 16;
                n10 = (int)(l19 << 48 >>> 48);
                l14 = l17 ^ 0x5BBA5A4C1F07L;
                long l20 = l17 ^ 0x9E5F697022BL;
                l13 = l17 ^ 0x357566ED25BCL;
                l12 = l17 ^ 0x7CE6755BA101L;
                Object[] objectArray = new Object[2];
                objectArray[1] = l20;
                objectArray[0] = string;
                m44.a("o", (Object)objectArray, (long)6528790944443428472L, (long)l11);
                m44.a("s", (Object)this, new ArrayList(stringArray.length), (long)4714208560238772295L, (long)l11);
                int n14 = 0;
                object = stringArray;
                object2 = ((String[])object).length;
                CallSite callSite = m44.a("o", (long)4680722811880544894L, (long)l11);
                int n15 = 0;
                while (n15 < object2) {
                    block8: {
                        String string3;
                        block9: {
                            string3 = object[n15];
                            try {
                                try {
                                    if (callSite == false) break block8;
                                    if (string3 != null) break block9;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("o", (Object)illegalArgumentException, (long)6351266525467619709L, (long)l11);
                                }
                                throw new IllegalArgumentException((String)((Object)ZKMStackTraceTranslate.a("t", (int)15940, (long)(0x49E6B18D661AA39BL ^ l11))) + n14 + (String)((Object)ZKMStackTraceTranslate.a("t", (int)770, (long)(0x2DE33D42378D1ECAL ^ l11))));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("o", (Object)illegalArgumentException, (long)6351266525467619709L, (long)l11);
                            }
                        }
                        ((ArrayList)((Object)m44.a("q", (Object)this, (long)4714208560238772295L, (long)l11))).add(string3);
                        ++n14;
                        ++n15;
                    }
                    if (callSite != false) continue;
                }
                object = null;
                try {
                    string2 = string;
                    if (callSite == false) break block10;
                    if (string2 == null) break block11;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)6351266525467619709L, (long)l11);
                }
                string2 = string;
            }
            if (string2.length() > 0) {
                Object[] objectArray = new Object[1];
                objectArray[0] = l16;
                m44.a("s", (Object)this, (Set)((Object)m44.a("o", (Object)objectArray, (long)4917056739053551039L, (long)l11)), (long)4884051062756632321L, (long)l11);
                object = new s4(string, l12, (Set)((Object)m44.a("q", (Object)this, (long)4884051062756632321L, (long)l11)));
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = new em((s4)object, (boolean)m44.a("k", (long)4673162593623249686L, (long)l11), l14);
                objectArray2[0] = l15;
                m44.a("p", (Object)object, (Object)objectArray2, (long)6547255747661771961L, (long)l11);
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = new sz(n13, (short)n12, (char)n11);
                objectArray3[1] = new sz(n13, (short)n12, (char)n11);
                objectArray3[0] = l13;
                object2 = m44.a("p", (Object)object, (Object)objectArray3, (long)6347333462387361927L, (long)l11);
            }
        }
        m44.a("s", (Object)this, (hn)new hn(l10, (List)((Object)m44.a("q", (Object)this, (long)4714208560238772295L, (long)l11)), (short)n10, (s4)object), (long)6618960549428042008L, (long)l11);
    }

    public String getTranslatedStackTrace(String string) {
        long l10 = a ^ 0x6AFE06D585F8L;
        return m44.a("v", (Object)this, (Object)string, (boolean)true, (int)2, (long)-8591656980731125545L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getTranslatedStackTrace(String string, boolean bl2, int n10) {
        long l10;
        long l11 = l10 = a ^ 0x2C223ED9E905L;
        long l12 = l11 ^ 0x280772212D38L;
        long l13 = l11 ^ 0x53DF47AFA060L;
        long l14 = l11 ^ 0x68747BCCEFC9L;
        CallSite callSite = m44.a("l", (long)-2246362860726454855L, (long)l10);
        try {
            Object[] objectArray = new Object[4];
            objectArray[3] = n10;
            objectArray[2] = bl2;
            objectArray[1] = l14;
            objectArray[0] = string;
            return m44.a("s", (Object)m44.a("r", (Object)this, (long)-65297667644703269L, (long)l10), (Object)objectArray, (long)-2057231215518403165L, (long)l10);
        }
        catch (ur ur2) {
            String string2;
            StringBuilder stringBuilder;
            block17: {
                Object object;
                block15: {
                    CallSite callSite2;
                    block16: {
                        block14: {
                            object = null;
                            try {
                                try {
                                    callSite2 = m44.a("r", (Object)this, (long)-1800064346368130110L, (long)l10);
                                    if (callSite != false) break block14;
                                    if (callSite2 == null) break block15;
                                }
                                catch (ur ur3) {
                                    throw m44.a("l", (Object)ur3, (long)-223074613401741890L, (long)l10);
                                }
                                callSite2 = m44.a("r", (Object)this, (long)-1800064346368130110L, (long)l10);
                            }
                            catch (ur ur4) {
                                throw m44.a("l", (Object)ur4, (long)-223074613401741890L, (long)l10);
                            }
                        }
                        try {
                            try {
                                if (callSite != false) break block16;
                                if (callSite2.size() <= 0) break block15;
                            }
                            catch (ur ur5) {
                                throw m44.a("l", (Object)ur5, (long)-223074613401741890L, (long)l10);
                            }
                            callSite2 = m44.a("r", (Object)this, (long)-1800064346368130110L, (long)l10);
                        }
                        catch (ur ur6) {
                            throw m44.a("l", (Object)ur6, (long)-223074613401741890L, (long)l10);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = callSite2;
                    objectArray[0] = l13;
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l12;
                    objectArray2[0] = m44.a("l", (Object)objectArray, (long)-2039267625928819378L, (long)l10);
                    object = m44.a("l", (Object)objectArray2, (long)-384892623054900899L, (long)l10);
                }
                try {
                    try {
                        stringBuilder = new StringBuilder().append((String)((Object)ZKMStackTraceTranslate.a("t", (int)7540, (long)(0x5DB0B90A0BF32461L ^ l10)))).append((String)((Object)m44.a("s", (Object)ur2, (long)-278769423110440618L, (long)l10))).append("\"").append((String)((Object)m44.a("h", (long)-2236971313066595355L, (long)l10)));
                        string2 = object;
                        if (callSite != false) return stringBuilder.append(string2).toString();
                        if (string2 == null) break block17;
                    }
                    catch (ur ur7) {
                        throw m44.a("l", (Object)ur7, (long)-223074613401741890L, (long)l10);
                    }
                    string2 = (String)((Object)ZKMStackTraceTranslate.a("t", (int)903, (long)(0x183D7015E5753A90L ^ l10))) + (String)object + (String)((Object)m44.a("h", (long)-7576247344202763L, (long)l10));
                    return stringBuilder.append(string2).toString();
                }
                catch (ur ur8) {
                    throw m44.a("l", (Object)ur8, (long)-223074613401741890L, (long)l10);
                }
            }
            string2 = "";
            return stringBuilder.append(string2).toString();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void V(Object[] var0) {
        block35: {
            block30: {
                block31: {
                    block29: {
                        var1_1 = (Long)var0[0];
                        v0 = var1_1 = ZKMStackTraceTranslate.a ^ var1_1;
                        var3_2 = v0 ^ 62764185398059L;
                        var5_3 = v0 ^ 61393828986428L;
                        var7_4 = m44.a("k", (long)-2480223802355758850L, (long)var1_1);
                        v1 /* !! */  = m44.a("o", (long)-4396669350554808639L, (long)var1_1);
                        if (var7_4 != false) break block29;
                        try {
                            block39: {
                                if (v1 /* !! */  == false) break block30;
                                break block39;
                                catch (IllegalAccessException v2) {
                                    throw m44.a("k", (Object)v2, (long)-4494500460567123719L, (long)var1_1);
                                }
                            }
                            v3 = new Object[1];
                            v3[0] = var3_2;
                            v1 /* !! */  = m44.a("k", (Object)v3, (long)-2418050090122334105L, (long)var1_1);
                        }
                        catch (IllegalAccessException v4) {
                            throw m44.a("k", (Object)v4, (long)-4494500460567123719L, (long)var1_1);
                        }
                    }
                    v5 = var7_4;
                    if (var1_1 < 0L) ** GOTO lbl31
                    if (v5 != false) break block31;
                    try {
                        block40: {
                            v5 = ZKMStackTraceTranslate.b("q", (int)15000, (long)(1317771408213260031L ^ var1_1));
lbl31:
                            // 2 sources

                            if (v1 /* !! */  >= v5) break block30;
                            break block40;
                            catch (IllegalAccessException v6) {
                                throw m44.a("k", (Object)v6, (long)-4494500460567123719L, (long)var1_1);
                            }
                        }
                        m44.a("t", (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (Object)((String)m44.a("o", (long)-2471483303556540766L, (long)var1_1) + (String)m44.a("o", (long)-4481017532281554381L, (long)var1_1) + (String)m44.a("o", (long)-2471483303556540766L, (long)var1_1)), (long)-2688246113536786268L, (long)var1_1);
                        v1 /* !! */  = (CallSite)true;
                    }
                    catch (IllegalAccessException v7) {
                        throw m44.a("k", (Object)v7, (long)-4494500460567123719L, (long)var1_1);
                    }
                }
                m44.a("k", (int)v1 /* !! */ , (long)-2408913206622825338L, (long)var1_1);
            }
            try {
                m44.a("k", (long)-4362009468919955457L, (long)var1_1);
            }
            catch (IllegalAccessException var8_5) {
                m44.a("t", (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (Object)((String)m44.a("o", (long)-2471483303556540766L, (long)var1_1) + (String)ZKMStackTraceTranslate.a("t", (int)6870, (long)(108052764920422021L ^ var1_1)) + (String)ZKMStackTraceTranslate.a("t", (int)28091, (long)(3886323674957605364L ^ var1_1)) + (String)m44.a("o", (long)-2471483303556540766L, (long)var1_1)), (long)-2688246113536786268L, (long)var1_1);
            }
            catch (NoClassDefFoundError var8_6) {
                block36: {
                    block33: {
                        block32: {
                            var9_10 = m44.a("k", (Object)ZKMStackTraceTranslate.a("t", (int)24054, (long)(7881014720750999984L ^ var1_1)), (long)-4396948784080836283L, (long)var1_1);
                            try {
                                v8 = var9_10;
                                v9 /* !! */  = var7_4;
                                if (var1_1 < 0L) ** GOTO lbl68
                                if (v9 /* !! */  != false) break block32;
                                if (v8 != null) {
                                }
                                ** GOTO lbl110
                            }
                            catch (IllegalAccessException v10) {
                                throw m44.a("k", (Object)v10, (long)-4494500460567123719L, (long)var1_1);
                            }
                            v8 = var9_10;
                        }
                        try {
                            block34: {
                                try {
                                    try {
                                        v9 /* !! */  = (CallSite)4892;
lbl68:
                                        // 2 sources

                                        v11 /* !! */  = v8.indexOf((String)ZKMStackTraceTranslate.a("t", (int)v9 /* !! */ , (long)(6927154993526937437L ^ var1_1)));
                                        if (var1_1 <= 0L || var7_4 != false) break block33;
                                        if (v11 /* !! */  != -1) break block34;
                                    }
                                    catch (IllegalAccessException v12) {
                                        throw m44.a("k", (Object)v12, (long)-4494500460567123719L, (long)var1_1);
                                    }
                                    m44.a("t", (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (Object)ZKMStackTraceTranslate.a("t", (int)29865, (long)(2889970498200858855L ^ var1_1)), (long)-2688246113536786268L, (long)var1_1);
                                    if (var1_1 < 0L) break block35;
                                    if (var7_4 == false) break block36;
                                }
                                catch (IllegalAccessException v13) {
                                    throw m44.a("k", (Object)v13, (long)-4494500460567123719L, (long)var1_1);
                                }
                            }
                            v14 = new Object[2];
                            v14[1] = var9_10;
                            v14[0] = var5_3;
                            v11 /* !! */  = (int)m44.a("k", (Object)v14, (long)-2541799012271687742L, (long)var1_1);
                        }
                        catch (IllegalAccessException v15) {
                            throw m44.a("k", (Object)v15, (long)-4494500460567123719L, (long)var1_1);
                        }
                    }
                    try {
                        try {
                            block37: {
                                block38: {
                                    try {
                                        if (var1_1 <= 0L) break block37;
                                        if (v11 /* !! */  == 0) break block38;
                                        m44.a("t", (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (Object)((String)m44.a("o", (long)-2471483303556540766L, (long)var1_1) + (String)ZKMStackTraceTranslate.a("t", (int)14600, (long)(2930225509358714193L ^ var1_1)) + (String)ZKMStackTraceTranslate.a("t", (int)15773, (long)(2354767703511087553L ^ var1_1)) + (String)m44.a("o", (long)-2471483303556540766L, (long)var1_1)), (long)-2688246113536786268L, (long)var1_1);
                                        if (var1_1 < 0L) break block35;
                                        if (var7_4 == false) break block36;
                                    }
                                    catch (IllegalAccessException v16) {
                                        throw m44.a("k", (Object)v16, (long)-4494500460567123719L, (long)var1_1);
                                    }
                                }
                                m44.a("t", (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (Object)ZKMStackTraceTranslate.a("t", (int)10355, (long)(8397505957778861110L ^ var1_1)), (long)-2688246113536786268L, (long)var1_1);
                                if (var1_1 < 0L) break block35;
                                v11 /* !! */  = (int)var7_4;
                            }
                            if (v11 /* !! */  == 0) break block36;
                        }
                        catch (IllegalAccessException v17) {
                            throw m44.a("k", (Object)v17, (long)-4494500460567123719L, (long)var1_1);
                        }
lbl110:
                        // 2 sources

                        m44.a("t", (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (Object)ZKMStackTraceTranslate.a("t", (int)231, (long)(7818692905970828448L ^ var1_1)), (long)-2688246113536786268L, (long)var1_1);
                    }
                    catch (IllegalAccessException v18) {
                        throw m44.a("k", (Object)v18, (long)-4494500460567123719L, (long)var1_1);
                    }
                }
                m44.a("t", (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (Object)((String)ZKMStackTraceTranslate.a("t", (int)12060, (long)(4158536452255853389L ^ var1_1)) + (String)var9_10 + "\""), (long)-2688246113536786268L, (long)var1_1);
            }
            catch (InvocationTargetException var8_7) {
                var9_11 = var8_7.getTargetException();
                m44.a("t", (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (Object)((String)m44.a("o", (long)-2471483303556540766L, (long)var1_1) + (String)ZKMStackTraceTranslate.a("t", (int)6411, (long)(7828724341190991176L ^ var1_1)) + (String)ZKMStackTraceTranslate.a("t", (int)15773, (long)(2354767703511087553L ^ var1_1)) + (String)m44.a("o", (long)-2471483303556540766L, (long)var1_1)), (long)-2688246113536786268L, (long)var1_1);
                m44.a("t", (Object)var9_11, (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (long)-2560322300591148848L, (long)var1_1);
            }
            catch (NoSuchMethodException var8_8) {
                m44.a("t", (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (Object)((String)m44.a("o", (long)-2471483303556540766L, (long)var1_1) + (String)ZKMStackTraceTranslate.a("t", (int)31625, (long)(8944810271491129291L ^ var1_1)) + (String)ZKMStackTraceTranslate.a("t", (int)15773, (long)(2354767703511087553L ^ var1_1)) + (String)m44.a("o", (long)-2471483303556540766L, (long)var1_1)), (long)-2688246113536786268L, (long)var1_1);
            }
            catch (Throwable var8_9) {
                m44.a("t", (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (Object)((String)m44.a("o", (long)-2471483303556540766L, (long)var1_1) + (String)ZKMStackTraceTranslate.a("t", (int)5568, (long)(175302536485605789L ^ var1_1)) + (String)ZKMStackTraceTranslate.a("t", (int)15773, (long)(2354767703511087553L ^ var1_1)) + (String)m44.a("o", (long)-2471483303556540766L, (long)var1_1)), (long)-2688246113536786268L, (long)var1_1);
                m44.a("t", (Object)var8_9, (Object)m44.a("o", (long)-4089538424594603186L, (long)var1_1), (long)-2560322300591148848L, (long)var1_1);
            }
        }
    }

    private static boolean Q(Object[] objectArray) {
        boolean bl2;
        block5: {
            long l10 = (Long)objectArray[0];
            String string = (String)objectArray[1];
            l10 = a ^ l10;
            StringTokenizer stringTokenizer = new StringTokenizer(string, (String)((Object)m44.a("m", (long)-557257414427762268L, (long)l10)));
            CallSite callSite = m44.a("i", (long)-302231389528265052L, (long)l10);
            while (stringTokenizer.hasMoreTokens()) {
                block6: {
                    Object object;
                    block7: {
                        String string2 = stringTokenizer.nextToken();
                        try {
                            bl2 = string2.endsWith((String)((Object)ZKMStackTraceTranslate.a("t", (int)30572, (long)(0x5D83705E036FD57FL ^ l10))));
                            if (callSite != false) break block5;
                            if (!bl2) break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("i", (Object)illegalArgumentException, (long)-1730956669929845085L, (long)l10);
                        }
                        File file = new File(string2);
                        try {
                            object = m44.a("v", (Object)file, (long)-572593528721900075L, (long)l10);
                            if (callSite != false) break block7;
                            if (object == false) break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("i", (Object)illegalArgumentException, (long)-1730956669929845085L, (long)l10);
                        }
                        object = true;
                    }
                    return (boolean)object;
                }
                if (callSite == false) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public String getOldMethodName(String string, String string2) {
        long l10 = a ^ 0x5E1D92A0FC4EL;
        long l11 = l10 ^ 0x6D3B5570EE94L;
        CallSite callSite = m44.a("o", (long)-1045548466080076810L, (long)l10);
        try {
            string2 = string2.trim();
            int n10 = string2.indexOf(" ");
            if (n10 > -1) {
                String string3 = string2.substring(0, n10);
                String string4 = string2.substring(n10 + 1);
                int n11 = (string4 = string4.trim()).indexOf("(");
                if (n11 > 0) {
                    String string5 = string4.substring(0, n11);
                    CallSite callSite2 = m44.a("p", string4, (Object)")", (int)n11, (long)-776818688164389087L, (long)l10);
                    if (callSite2 > -1) {
                        int n12;
                        ArrayList arrayList;
                        block9: {
                            String string6 = string4.substring(n11 + 1, (int)callSite2);
                            arrayList = new ArrayList();
                            StringTokenizer stringTokenizer = new StringTokenizer(string6, ",");
                            while (stringTokenizer.hasMoreTokens()) {
                                try {
                                    n12 = arrayList.add(stringTokenizer.nextToken().trim()) ? 1 : 0;
                                    if (callSite != false) {
                                        if (callSite != false) continue;
                                        break;
                                    }
                                    break block9;
                                }
                                catch (ur ur2) {
                                    throw m44.a("o", (Object)ur2, (long)-1608901150701977355L, (long)l10);
                                }
                            }
                            n12 = arrayList.size();
                        }
                        String[] stringArray = new String[n12];
                        stringArray = arrayList.toArray(stringArray);
                        Object[] objectArray = new Object[5];
                        objectArray[4] = string3;
                        objectArray[3] = stringArray;
                        objectArray[2] = string5;
                        objectArray[1] = l11;
                        objectArray[0] = string;
                        return m44.a("p", (Object)m44.a("q", (Object)this, (long)-1561774758723770224L, (long)l10), (Object)objectArray, (long)-604377867621203899L, (long)l10);
                    }
                    return "'" + string2 + (String)((Object)ZKMStackTraceTranslate.a("t", (int)31957, (long)(0x7E3E1D35914AD092L ^ l10)));
                }
                return "'" + string2 + (String)((Object)ZKMStackTraceTranslate.a("t", (int)30917, (long)(0x67FF1DE415F3D491L ^ l10)));
            }
            return "'" + string2 + (String)((Object)ZKMStackTraceTranslate.a("t", (int)12084, (long)(0x1FD7393230A8366L ^ l10)));
        }
        catch (ur ur3) {
            return (String)((Object)ZKMStackTraceTranslate.a("t", (int)13562, (long)(0x851BC9E765418ACL ^ l10))) + (String)((Object)m44.a("p", (Object)ur3, (long)-1627226011399885795L, (long)l10)) + "\"" + (String)((Object)m44.a("k", (long)-738629582079115602L, (long)l10));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        ZKMStackTraceTranslate.a = prr.a(-8678613666945983630L, 3019071263206918278L, MethodHandles.lookup().lookupClass()).a(128156067396934L);
                        ZKMStackTraceTranslate.e = new HashMap<K, V>(13);
                        var11 = ZKMStackTraceTranslate.a ^ 131703703126329L;
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
                        var20_3 = new String[28];
                        var18_4 = 0;
                        var17_5 = "g\u009e\u0080\u00d7\u00f2\u00f7\u00c6v\u00f6\u00fa\u00bc\u00e1\u0005\u00c1|(i\u0011q\u00c44s\u00da\u0084\u00cb\u0001f\u00a6\u00b8\u0015\u00d5%>\u00d2L\u00d9\u008e\u0001\u00a0\u00ffV\u0019\u00fe\u001d{k\u0013\\\u00bf\u0081F+\u00a2\u00147\u0081Ck\u00e2\u0011R\u00e2\u0015\u000b(\u0017\u009b\u00933c\u00a6\u00d2((\u0097\u00a4;\u00f5$\u001f/\u00ecg\t:\u0017\u0001\u00f3\u00c4\u009cPh\u00c8|O\u00f5\u0000\u00d6h)j\u0004\u0090\u00d2\u00c8(\u00d7`~\r\u00b1\u00deU\u00e5c\u0019\u00f3.\u0014\u00d5\u00b0]&\u008a<\u008e\u00fb\u00a8(j\n\u00bd\u00f4\u00ef\u00d3\u00f8Vh!\u0088\rC$\u00f7\u00f1\u008d d(\u00fd9B\u00b6@\u00f6\u00c7#\u009b\u00a3y\u00cf\u00cfX\u00f855\u009d0\u00e6\u00e9\u008e\u0099\u0098o\u001b\u009e\u0015J\u00d1 r\u0004u)I\u00f8MMf8\u0001\u0004d(<\u001f\u0087\u00a6\u00acN\u00ed\u00d8|\u00b1\u00c1{\u00df\"T\u00a5\\<x\u00de\u0018\u00ef\u0090c\"\u007fy\n\u000b\u00f9+\u00f6\u00ad!\u00ae\tIo\u00e1\u0000\u00c3\u00b6\u00e2\u00d1\u00d7K\u00a5\u00fe\u00b2&\u00cd\u00e74CD,\u00f6\u00ef\u008c\u0003fQ\u00a3\u00c8\u009d\u00f4\u00d4\u008esE\u0001\u0090\u0098\u00c6\\\u00b1\u00997<\u00a8\u00db\u00cc\u00d8\u0095A\u00e2\u0017\u00cf\u00f2\u0099\u00f3\u00f7\u0098\u00be\\\u0012s\\\u0014\u00f9C\u0084<\u0017\tl!\u00c7r\u001f5\u00a6\u00fdy3\u00a5\u0094\u00c0\u009e\u00e1Sx\u00bf\f@\u00fd#\u0011\u00d15\u0083Q\\\u00f4\u0080\u00d1\u00f8/\u00d6@\u0004)\u001b4\u00a7\u00a9a$\u00ac\u00eeU\n &6\u001f\u0097T\f\u00bf\bm\u0001\u0096w\u00da\u00c3{\u00b1\u00e8\u00ee/}\u0010\u0085\u00d1t69\u0016W,\u001bP\u0004\u0000\u00ba\u0095\u00ecXIN\u00f6\u00f5p\u00a4\u00c6\u00f5\u0085\u00b0r\u00b6\u00f4\u00bd(M\u00d7\u0097s\u009c\u000e\u00d1\ru}oVF\u00cc\u00d8\u00a3\u00e8\u00f1I\u00bd\u00a8\u00b0\u0007\u0094\u00940d8\u00b6\u0015\u00ec\u00a6\u00ac\u00db))c\u00ff\u00baQXI\u00f8\u00ca\u007f\u00f6W\u0091?N\u009f\u00ff\u00fa\u00c4\u001f\u00b5\u00e6\u001c8<\u008d\u0085P\u00bcs\u0085oaU\u00c2\u001b\u00d6NZ\ffR!\u008ez0\u00155Q\u0093{\u001c\u00ef(O\u00e3[\u008d\u001b\u007fI\u00c4\u00a5/l\u00b0`0\u00cf\"y<X\u00d1\u0087\\\u0096\u008d\u008a\u00e3\u008c\u00e6An\u00e5\u00cc\u00c5\u00db\u0004\u008a\u00dc\u0087\u0080\u00d6P\u0088bV\u00e2\u00ab\u00c7O\u0012\u00d2\u00bez\u001c\u00cf\u0003\u00b4\u009a\u008f\u00df\u00c2\u001d\u00c1\u00ef\u0015\u00a7H\u00ec\u00ba\u0086\u00d5\u00c8\b\u00ab\f\u0005\u00bf\u00e6X\u00c1\u00021l\u00a7=\u00b1\u00f9\u009d\u00c8\u0004\u00d9o\u00f0\u00ebO\u000e\u0094\u009b\u00b5\u00fa\u00cc\u009b\u0095\u00ae\u00e4~A\u00a4^:T\u0003\u009b\u00f3\u007fZ\u0002`\u007fcMN(_Q\u009c/\u001a!j\u00851\u0089,\u00b9\u00cf\u000e\u00e6Qw\u008d\u00dc\u008f\u00bb\r`\u00af\u00ad|\u00de\u00cdD\u009f \u00df\b\u00a3d\u0016\u001a7~~ \u0018Sz\u00cc\u008e\t\u00f15\"\u008f\u001f/\u00b5r\u00bd\u0011\u00cdbes\u001f\u00b8\u00aba\u000bA>\u00c6\u00f4\u00d2\u00e9\u00a2xd\b=\u008a\u00d9\u00b1@J\u0091\u00d0\u00e9\u00ac+\u00f6;]\u0093|\u0019@\u00d4F\u001a\u0092\u0012\u008ci9\"&\u00e7\u00f9TO\u009e\u00d6\u0088\\c\u0083j\u00d4\u00b9\u0004\u0011u'\u00fc\u00e3d\u00bec\u00b3\u00ab\u00d3a\u00ee\u00bd\u00e9\u0011\u00ddgcwO\u00dc\u00ec\u00ab\u0099}\u0014\u00e2\u00ddO\u001f\u00fe\u00bc\u001e$b\u007fg\u00cf\u0097\u0000iw\u00fei4\u00bb\u001e.\u009d\u00ea\u00d3\u009cH\u0085\u008b\u00e8z\u00d9\u0006\u00e0?\u00a9\u00b9p\u00c1\u00ed\u0012\u000b\u0099\u0092\u00bb%\u00beB\u00ca\u0018v\u00d8\u00fd5\u00fb\u00f3P\u0098\u00c1\u00ef/gj\u0081T\b\u00e7N6F\u00c1\u00ac\u00d7\u0084\u0080\u00aa\u00ddh\u00de\u000buT\u00e5\u00dd\u00fb\u00ab]y\u00ba\u0011\u00bbiM\u00fc\b\u000f;\u00c2U\u0002Nf\u00ee\u00a5h\u0010\u00f2\u00b8\u00cf\u00a9d\u00cfW\u00b1\u00ff\u00bb\u008b\u001f\u0098\u00bbGEX\u001dnZW\u0087oH\u00ebOwyN\u00f58 \u00d8\u00a1\u00c7\u00b5\u001ck?\u00d45\u00bd\u0098\u00d1\u0099\u009a4\u008a\u00c3_}R\u00d9\u00b3\u00f2q\u00a9\u00b4\u00f5\u009f|v7\u00e1|W)\u0082\u00b4\u00a0\u00848\u00c1O\u00d3e\u00a3\u00ed\u00db\u00fd?\u0000f\u0011p\u00f9\u00c42\u00a9#\u00de\u00c5\u00b2\u0081\u00c7I\u001d\u00107\u0085O\u00ba\u001b\u00f3\u00ae\u00d8:\u000e\nW\u00fdf\u00d0\u00f7 B\f5E\u00c1\u0003'\u00a8\u00aa\u00ed\u0003\u00867b\u0015jnW\u00e4\u0005\u0091v]\u009d;\u0098\u00a3\u00cb'\u0084V\u00af(\u001a\u00a6\u00d7\u0083\u00db\r'\u00f9\u00a0Dj\u0005\u00feU\n\u00a9\u0016\u00bb\u00e2Uc\u0010\r\u00c2\u008cp\u0001qc\u001e\u00d8>;\u00f5w\u00f3\u007f\u00df \u00fbX\u009c\u0092_\u0085\u00a4\u00deiHv\u00b0\u007f\r\u001d\u00e8\u00edP,\u00efi\u00a2'@\u00feO\u00fc?\u0007\u00f2\u00a8\u0082\u00d2\u00874\u0098\u00a3\u00dd\u00a2\u009b\u00b5\u009a\u00d3\t\u009a\u00e7\u00f0NB\\\u00a7\u00e92\u00b0\u00a4i\u00e7\u00bd\u00eb\u0003p\u0006\u00d7\u00ae\u000fU\u00d8\"\u00c4K\u00a0 \u0005\u0080\u00fd&\u0082\u00a3\u0082\u0019/\u00b0g\u00ea\u00f6\u000b0^\u00dd\u00c3@\u00e9y\u00d6v\u0082\u00c0\u0016\u00ebfI\u00be\u00cax|\u0091O\u00eaU\u0003\u0081\u00c4g\u00bdA\u009f\u00f4\u0097\u0088\u00c8Z9\u00d2\\\u00e1X^3\u00a90o\u0005 \u0003\u00ad5\u00a5\u0095!BUq#+\u00f7\u00e3\u00f4\u00b6\u0014\t\u0088\u00f9\u0012n\u00c5\u0010Pd\u00f2\u00a2\u00c32\u0019w\u00db\u0090Q\u00f9\u0089\u0087\u00d2\u0086@\u00c41\u00aec\r\u0000\u000e=\u0091\u00c0\u0001\u0013\u00da\u0096\u000f8\u0081\u0091\u00af\u00cd\u00d8)Y^\u00d7\u00f4\u00d6\u00dd\u00ec]9t\u00eb\u00ff|\u00e5\n\u0083\u008a\u00bd\u00b2*\u00f7\u00ed\u00a3\u0084\u0088\u00d7YA\b0\u00b7\u008d6\u00d3\u00c6\u00da\u00d2\u00c4\u0096\u00b6\u00d7JP\u00f4\u00fdr\u0013+\u0014\r\u00bd\u00b2\u00a4\f\u0013\u009a\u0087\u001a\\\u00c8r\u00b6cj\u0004T/d\u00c1\u00a6-\u00ed\u0017\u00ca\u00e6\u00a7\u0092f\u00d1\u00e0\u0094\u0094\u00bdkI\u0082',\u00ebg\u0088\u00fa\u00d6\u008a\u0006UX\u00e2{s\u009c\u00f9n\u0093\u0013\u00fbLz\u00e7f#\u00f1\f\u00b3y\u00a1\u001d\"\u0090\u00c8\u00c1.z\u0018\u00ee\u00ffm\u001eJO\u00d6j\u00f8\u00be\u008e\u00ea\u008aZ\u00a7S\u00c5\u00adN\u0013(\u00c3\u0007\u001cX\u00ed\r\u00134k+\u00a3\u00c1\u00aa\u0003\u0086\u0084}\u00dc\u00c0>\u00b8Vj?=\u00fcF+Q\u0001)\u00be\u00ab\b9\u000b\u00a2\u00ae\u0019\u00e0\u009b\u00de]_O\u00e8h\u0017n\u007f\u00efjam\u00df\u00a5b~aX\u0086\u008dk\u0000\u00eb\u0099Z\u00a5\u00ed\u00bb\u00f5(#\u001euWY\u00ea\u00e9=Wgd\u00fdW\u0018\u0016\u0082\u008b^\u00a4A(zBbE2\u00f1v\t\u00df\u00d8\u0019Q/\u00d1\u0003@\u00a0c\u00dc\u009a`Y\u0000\u0090n\u000f[I\t\u0086V'\u0011\u00bet/\u00f5e\u00c9Q";
                        var19_6 = "g\u009e\u0080\u00d7\u00f2\u00f7\u00c6v\u00f6\u00fa\u00bc\u00e1\u0005\u00c1|(i\u0011q\u00c44s\u00da\u0084\u00cb\u0001f\u00a6\u00b8\u0015\u00d5%>\u00d2L\u00d9\u008e\u0001\u00a0\u00ffV\u0019\u00fe\u001d{k\u0013\\\u00bf\u0081F+\u00a2\u00147\u0081Ck\u00e2\u0011R\u00e2\u0015\u000b(\u0017\u009b\u00933c\u00a6\u00d2((\u0097\u00a4;\u00f5$\u001f/\u00ecg\t:\u0017\u0001\u00f3\u00c4\u009cPh\u00c8|O\u00f5\u0000\u00d6h)j\u0004\u0090\u00d2\u00c8(\u00d7`~\r\u00b1\u00deU\u00e5c\u0019\u00f3.\u0014\u00d5\u00b0]&\u008a<\u008e\u00fb\u00a8(j\n\u00bd\u00f4\u00ef\u00d3\u00f8Vh!\u0088\rC$\u00f7\u00f1\u008d d(\u00fd9B\u00b6@\u00f6\u00c7#\u009b\u00a3y\u00cf\u00cfX\u00f855\u009d0\u00e6\u00e9\u008e\u0099\u0098o\u001b\u009e\u0015J\u00d1 r\u0004u)I\u00f8MMf8\u0001\u0004d(<\u001f\u0087\u00a6\u00acN\u00ed\u00d8|\u00b1\u00c1{\u00df\"T\u00a5\\<x\u00de\u0018\u00ef\u0090c\"\u007fy\n\u000b\u00f9+\u00f6\u00ad!\u00ae\tIo\u00e1\u0000\u00c3\u00b6\u00e2\u00d1\u00d7K\u00a5\u00fe\u00b2&\u00cd\u00e74CD,\u00f6\u00ef\u008c\u0003fQ\u00a3\u00c8\u009d\u00f4\u00d4\u008esE\u0001\u0090\u0098\u00c6\\\u00b1\u00997<\u00a8\u00db\u00cc\u00d8\u0095A\u00e2\u0017\u00cf\u00f2\u0099\u00f3\u00f7\u0098\u00be\\\u0012s\\\u0014\u00f9C\u0084<\u0017\tl!\u00c7r\u001f5\u00a6\u00fdy3\u00a5\u0094\u00c0\u009e\u00e1Sx\u00bf\f@\u00fd#\u0011\u00d15\u0083Q\\\u00f4\u0080\u00d1\u00f8/\u00d6@\u0004)\u001b4\u00a7\u00a9a$\u00ac\u00eeU\n &6\u001f\u0097T\f\u00bf\bm\u0001\u0096w\u00da\u00c3{\u00b1\u00e8\u00ee/}\u0010\u0085\u00d1t69\u0016W,\u001bP\u0004\u0000\u00ba\u0095\u00ecXIN\u00f6\u00f5p\u00a4\u00c6\u00f5\u0085\u00b0r\u00b6\u00f4\u00bd(M\u00d7\u0097s\u009c\u000e\u00d1\ru}oVF\u00cc\u00d8\u00a3\u00e8\u00f1I\u00bd\u00a8\u00b0\u0007\u0094\u00940d8\u00b6\u0015\u00ec\u00a6\u00ac\u00db))c\u00ff\u00baQXI\u00f8\u00ca\u007f\u00f6W\u0091?N\u009f\u00ff\u00fa\u00c4\u001f\u00b5\u00e6\u001c8<\u008d\u0085P\u00bcs\u0085oaU\u00c2\u001b\u00d6NZ\ffR!\u008ez0\u00155Q\u0093{\u001c\u00ef(O\u00e3[\u008d\u001b\u007fI\u00c4\u00a5/l\u00b0`0\u00cf\"y<X\u00d1\u0087\\\u0096\u008d\u008a\u00e3\u008c\u00e6An\u00e5\u00cc\u00c5\u00db\u0004\u008a\u00dc\u0087\u0080\u00d6P\u0088bV\u00e2\u00ab\u00c7O\u0012\u00d2\u00bez\u001c\u00cf\u0003\u00b4\u009a\u008f\u00df\u00c2\u001d\u00c1\u00ef\u0015\u00a7H\u00ec\u00ba\u0086\u00d5\u00c8\b\u00ab\f\u0005\u00bf\u00e6X\u00c1\u00021l\u00a7=\u00b1\u00f9\u009d\u00c8\u0004\u00d9o\u00f0\u00ebO\u000e\u0094\u009b\u00b5\u00fa\u00cc\u009b\u0095\u00ae\u00e4~A\u00a4^:T\u0003\u009b\u00f3\u007fZ\u0002`\u007fcMN(_Q\u009c/\u001a!j\u00851\u0089,\u00b9\u00cf\u000e\u00e6Qw\u008d\u00dc\u008f\u00bb\r`\u00af\u00ad|\u00de\u00cdD\u009f \u00df\b\u00a3d\u0016\u001a7~~ \u0018Sz\u00cc\u008e\t\u00f15\"\u008f\u001f/\u00b5r\u00bd\u0011\u00cdbes\u001f\u00b8\u00aba\u000bA>\u00c6\u00f4\u00d2\u00e9\u00a2xd\b=\u008a\u00d9\u00b1@J\u0091\u00d0\u00e9\u00ac+\u00f6;]\u0093|\u0019@\u00d4F\u001a\u0092\u0012\u008ci9\"&\u00e7\u00f9TO\u009e\u00d6\u0088\\c\u0083j\u00d4\u00b9\u0004\u0011u'\u00fc\u00e3d\u00bec\u00b3\u00ab\u00d3a\u00ee\u00bd\u00e9\u0011\u00ddgcwO\u00dc\u00ec\u00ab\u0099}\u0014\u00e2\u00ddO\u001f\u00fe\u00bc\u001e$b\u007fg\u00cf\u0097\u0000iw\u00fei4\u00bb\u001e.\u009d\u00ea\u00d3\u009cH\u0085\u008b\u00e8z\u00d9\u0006\u00e0?\u00a9\u00b9p\u00c1\u00ed\u0012\u000b\u0099\u0092\u00bb%\u00beB\u00ca\u0018v\u00d8\u00fd5\u00fb\u00f3P\u0098\u00c1\u00ef/gj\u0081T\b\u00e7N6F\u00c1\u00ac\u00d7\u0084\u0080\u00aa\u00ddh\u00de\u000buT\u00e5\u00dd\u00fb\u00ab]y\u00ba\u0011\u00bbiM\u00fc\b\u000f;\u00c2U\u0002Nf\u00ee\u00a5h\u0010\u00f2\u00b8\u00cf\u00a9d\u00cfW\u00b1\u00ff\u00bb\u008b\u001f\u0098\u00bbGEX\u001dnZW\u0087oH\u00ebOwyN\u00f58 \u00d8\u00a1\u00c7\u00b5\u001ck?\u00d45\u00bd\u0098\u00d1\u0099\u009a4\u008a\u00c3_}R\u00d9\u00b3\u00f2q\u00a9\u00b4\u00f5\u009f|v7\u00e1|W)\u0082\u00b4\u00a0\u00848\u00c1O\u00d3e\u00a3\u00ed\u00db\u00fd?\u0000f\u0011p\u00f9\u00c42\u00a9#\u00de\u00c5\u00b2\u0081\u00c7I\u001d\u00107\u0085O\u00ba\u001b\u00f3\u00ae\u00d8:\u000e\nW\u00fdf\u00d0\u00f7 B\f5E\u00c1\u0003'\u00a8\u00aa\u00ed\u0003\u00867b\u0015jnW\u00e4\u0005\u0091v]\u009d;\u0098\u00a3\u00cb'\u0084V\u00af(\u001a\u00a6\u00d7\u0083\u00db\r'\u00f9\u00a0Dj\u0005\u00feU\n\u00a9\u0016\u00bb\u00e2Uc\u0010\r\u00c2\u008cp\u0001qc\u001e\u00d8>;\u00f5w\u00f3\u007f\u00df \u00fbX\u009c\u0092_\u0085\u00a4\u00deiHv\u00b0\u007f\r\u001d\u00e8\u00edP,\u00efi\u00a2'@\u00feO\u00fc?\u0007\u00f2\u00a8\u0082\u00d2\u00874\u0098\u00a3\u00dd\u00a2\u009b\u00b5\u009a\u00d3\t\u009a\u00e7\u00f0NB\\\u00a7\u00e92\u00b0\u00a4i\u00e7\u00bd\u00eb\u0003p\u0006\u00d7\u00ae\u000fU\u00d8\"\u00c4K\u00a0 \u0005\u0080\u00fd&\u0082\u00a3\u0082\u0019/\u00b0g\u00ea\u00f6\u000b0^\u00dd\u00c3@\u00e9y\u00d6v\u0082\u00c0\u0016\u00ebfI\u00be\u00cax|\u0091O\u00eaU\u0003\u0081\u00c4g\u00bdA\u009f\u00f4\u0097\u0088\u00c8Z9\u00d2\\\u00e1X^3\u00a90o\u0005 \u0003\u00ad5\u00a5\u0095!BUq#+\u00f7\u00e3\u00f4\u00b6\u0014\t\u0088\u00f9\u0012n\u00c5\u0010Pd\u00f2\u00a2\u00c32\u0019w\u00db\u0090Q\u00f9\u0089\u0087\u00d2\u0086@\u00c41\u00aec\r\u0000\u000e=\u0091\u00c0\u0001\u0013\u00da\u0096\u000f8\u0081\u0091\u00af\u00cd\u00d8)Y^\u00d7\u00f4\u00d6\u00dd\u00ec]9t\u00eb\u00ff|\u00e5\n\u0083\u008a\u00bd\u00b2*\u00f7\u00ed\u00a3\u0084\u0088\u00d7YA\b0\u00b7\u008d6\u00d3\u00c6\u00da\u00d2\u00c4\u0096\u00b6\u00d7JP\u00f4\u00fdr\u0013+\u0014\r\u00bd\u00b2\u00a4\f\u0013\u009a\u0087\u001a\\\u00c8r\u00b6cj\u0004T/d\u00c1\u00a6-\u00ed\u0017\u00ca\u00e6\u00a7\u0092f\u00d1\u00e0\u0094\u0094\u00bdkI\u0082',\u00ebg\u0088\u00fa\u00d6\u008a\u0006UX\u00e2{s\u009c\u00f9n\u0093\u0013\u00fbLz\u00e7f#\u00f1\f\u00b3y\u00a1\u001d\"\u0090\u00c8\u00c1.z\u0018\u00ee\u00ffm\u001eJO\u00d6j\u00f8\u00be\u008e\u00ea\u008aZ\u00a7S\u00c5\u00adN\u0013(\u00c3\u0007\u001cX\u00ed\r\u00134k+\u00a3\u00c1\u00aa\u0003\u0086\u0084}\u00dc\u00c0>\u00b8Vj?=\u00fcF+Q\u0001)\u00be\u00ab\b9\u000b\u00a2\u00ae\u0019\u00e0\u009b\u00de]_O\u00e8h\u0017n\u007f\u00efjam\u00df\u00a5b~aX\u0086\u008dk\u0000\u00eb\u0099Z\u00a5\u00ed\u00bb\u00f5(#\u001euWY\u00ea\u00e9=Wgd\u00fdW\u0018\u0016\u0082\u008b^\u00a4A(zBbE2\u00f1v\t\u00df\u00d8\u0019Q/\u00d1\u0003@\u00a0c\u00dc\u009a`Y\u0000\u0090n\u000f[I\t\u0086V'\u0011\u00bet/\u00f5e\u00c9Q".length();
                        var16_7 = 64;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = ZKMStackTraceTranslate.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\b\u0097\u00c0\u0084\u00cf\u00ac\u00b7\u00e7a\u001d2q<\n\u00a7\u00b6I8\u009fQ\u00c9\t\u008cs\u00da\u00dd\u0012\u001c\u00d1p\u0085>8\u00f7\u00f6)\u0004\u0014\u00cf0\u00d5\u001c(`_\u00fe\u00c1\u0099\u001a\u00e6xC\u0010yc\u00f9\u00dai\b\u00b1I\u00c2\u00a87k\u000b\u0094\u00fa=:\u00f6\r\u00d4\u00e9.k\u00aeR\u00be\u0017\u00cd\u00cd\u00c8\u009d\u0083\u009c\u0088\u00e2R";
                            var19_6 = "\b\u0097\u00c0\u0084\u00cf\u00ac\u00b7\u00e7a\u001d2q<\n\u00a7\u00b6I8\u009fQ\u00c9\t\u008cs\u00da\u00dd\u0012\u001c\u00d1p\u0085>8\u00f7\u00f6)\u0004\u0014\u00cf0\u00d5\u001c(`_\u00fe\u00c1\u0099\u001a\u00e6xC\u0010yc\u00f9\u00dai\b\u00b1I\u00c2\u00a87k\u000b\u0094\u00fa=:\u00f6\r\u00d4\u00e9.k\u00aeR\u00be\u0017\u00cd\u00cd\u00c8\u009d\u0083\u009c\u0088\u00e2R".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = ZKMStackTraceTranslate.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
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
                ZKMStackTraceTranslate.b = var20_3;
                ZKMStackTraceTranslate.d = new String[28];
                ZKMStackTraceTranslate.h = new HashMap<K, V>(13);
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
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "4\u00a5\u009b0\u00f7\u00efS\u0089\u0096\u008aWj\u00df\u009f}\u00beo\"\u0017\u0092\u00cb6\u0084\u0002";
                var5_15 = "4\u00a5\u009b0\u00f7\u00efS\u0089\u0096\u008aWj\u00df\u009f}\u00beo\"\u0017\u0092\u00cb6\u0084\u0002".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        ZKMStackTraceTranslate.f = var6_12;
        ZKMStackTraceTranslate.g = new Integer[3];
        ZKMStackTraceTranslate.FULL_PARAM_TYPES = (int)ZKMStackTraceTranslate.b("q", (int)15286, (long)(var11 ^ 3079636587945566891L));
        ZKMStackTraceTranslate.UNQUALIFIED_PARAM_TYPES = (int)ZKMStackTraceTranslate.b("q", (int)18594, (long)(var11 ^ 4455112250414911932L));
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x486F;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ZKMStackTraceTranslate", exception);
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
            ZKMStackTraceTranslate.d[n11] = ZKMStackTraceTranslate.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ZKMStackTraceTranslate.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ZKMStackTraceTranslate" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4043;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ZKMStackTraceTranslate", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ZKMStackTraceTranslate.g[n11] = n12;
        }
        return g[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ZKMStackTraceTranslate.b(n10, l10);
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
            throw new RuntimeException("com/zelix/ZKMStackTraceTranslate" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ZKMStackTraceTranslate.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ZKMStackTraceTranslate.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

