/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix._6;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.l6z;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sw;
import com.zelix.x8;
import com.zelix.xp;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class s6
extends sw {
    private xp Z;
    private static final long a = prr.a((long)5995941146685568796L, (long)-1848518023990882071L, MethodHandles.lookup().lookupClass()).a(218588837406330L);
    private static final String[] c;
    private static final String[] d;
    private static final Map f;

    public void n(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x65CE406CDE83L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        dataOutputStream.writeByte((int)m44.a("p", (Object)((Object)this), (Object)objectArray2, (long)-8955045563159879412L, (long)l));
        dataOutputStream.writeShort(m44.a("q", (Object)((Object)this), (long)-8657007767347650656L, (long)l).E());
    }

    public void I(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        Set set2 = (Set)objectArray[1];
        Set set3 = (Set)objectArray[2];
        Set set4 = (Set)objectArray[3];
        long l = (Long)objectArray[4];
    }

    public int c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return 3;
    }

    public void q(x8 x82, long l, x8 x83) {
    }

    s6(_4 _42, long l, int n, h1 h12) {
        block15: {
            StringBuilder stringBuilder;
            Object object;
            s6 s62;
            long l2;
            block16: {
                block17: {
                    js js2;
                    int n2;
                    CallSite callSite;
                    long l3;
                    block13: {
                        long l4 = l = a ^ l;
                        long l5 = l4 ^ 0x5EDF91ADE6E8L;
                        l2 = l4 ^ 0x6F32F1E2A327L;
                        long l6 = l4 ^ 0x2BE243D576D4L;
                        int n3 = (int)(l6 >>> 48);
                        int n4 = (int)(l6 << 16 >>> 48);
                        int n5 = (int)(l6 << 32 >>> 32);
                        l3 = l4 ^ 0x11ADD82817A3L;
                        long l7 = l4 ^ 0x2EA271FFAAEEL;
                        CallSite callSite2 = m44.a("n", (long)-5050856137897612032L, (long)l);
                        super((char)n3, _42, (char)n4, n, n5);
                        callSite = callSite2;
                        n2 = h12.readUnsignedShort();
                        js2 = this.m(l7, n2);
                        try {
                            block14: {
                                try {
                                    try {
                                        try {
                                            if (callSite != false) break block13;
                                            if (js2 == null) break block14;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("n", (Object)((Object)n92), (long)-4885454765889640558L, (long)l);
                                        }
                                        if (l <= 0L) break block13;
                                        if (!(js2 instanceof xp)) break block14;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("n", (Object)((Object)n93), (long)-4885454765889640558L, (long)l);
                                    }
                                    m44.a("r", (Object)((Object)this), (xp)((xp)js2), (long)-6612037089656030143L, (long)l);
                                    if (callSite == false) break block15;
                                }
                                catch (n9 n94) {
                                    throw m44.a("n", (Object)((Object)n94), (long)-4885454765889640558L, (long)l);
                                }
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = false;
                            objectArray[0] = l5;
                            m44.a("q", (Object)((Object)this), (Object)objectArray, (long)-4813180972451242515L, (long)l);
                        }
                        catch (n9 n95) {
                            throw m44.a("n", (Object)((Object)n95), (long)-4885454765889640558L, (long)l);
                        }
                    }
                    try {
                        try {
                            s62 = this;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            int n6 = 15706;
                            if (l > 0L) {
                                object = s6.a("r", (int)n6, (long)(0x591C538C68E78CA8L ^ l));
                                if (callSite != false) break block16;
                                stringBuilder2 = stringBuilder2.append((String)object);
                                n6 = n2;
                            }
                            stringBuilder = stringBuilder2.append(n6);
                            if (js2 == null) break block17;
                        }
                        catch (n9 n96) {
                            throw m44.a("n", (Object)((Object)n96), (long)-4885454765889640558L, (long)l);
                        }
                        object = (String)((Object)s6.a("r", (int)26867, (long)(0x4EEB90A48CD65900L ^ l))) + js2.A(l3);
                        break block16;
                    }
                    catch (n9 n97) {
                        throw m44.a("n", (Object)((Object)n97), (long)-4885454765889640558L, (long)l);
                    }
                }
                object = "";
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = stringBuilder.append((String)object).toString();
            objectArray[0] = l2;
            m44.a("q", (Object)((Object)s62), (Object)objectArray, (long)-6436895449813831916L, (long)l);
            return;
        }
    }

    public void a(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        long l = (Long)objectArray[1];
    }

    String G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x48464C26AC71L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return String.valueOf((char)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1059643294945864706L, (long)l));
    }

    String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
    }

    public void G(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    Integer V(Object[] objectArray) {
        block5: {
            CallSite callSite;
            block4: {
                long l = (Long)objectArray[0];
                long l2 = l = a ^ l;
                long l3 = l2 ^ 0x2326CB42BEFCL;
                long l4 = l2 ^ 0x222E1453C257L;
                CallSite callSite2 = m44.a("l", (long)2401984730113144242L, (long)l);
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l4;
                        callSite = m44.a("s", (Object)((Object)this), (Object)objectArray2, (long)2425212528005625700L, (long)l);
                        if (callSite2 != false) break block4;
                        if (callSite == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)2630438353696472864L, (long)l);
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l3;
                    callSite = m44.a("s", (Object)m44.a("r", (Object)((Object)this), (long)4363708986945742067L, (long)l), (Object)objectArray3, (long)4527512842940531819L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)2630438353696472864L, (long)l);
                }
            }
            return (int)callSite;
        }
        return null;
    }

    public void p(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    public void z(gu gu2, long l) {
        long l2 = l ^ 0x6DE1DADD9981L;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5774538424433887327L, (long)l), (long)l2, (Object)gu2, (Object)((Object)this), (Object)this.H(), (long)5576216458285530349L, (long)l);
    }

    boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public void j(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        Map map = (Map)objectArray[1];
        long l = (Long)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
        long l2 = l ^ 0x746C1D80899EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        dataOutputStream.writeByte((int)m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)-3124275330760133103L, (long)l));
        dataOutputStream.writeShort(m44.a("t", (Object)((Object)this), (long)-3404386039377278787L, (long)l).E());
    }

    boolean i(Object[] objectArray) {
        return false;
    }

    public void z(Object[] objectArray) {
        _6 _62 = (_6)objectArray[0];
        long l = (Long)objectArray[1];
        l6z l6z2 = (l6z)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
    }

    public void B(Object[] objectArray) {
        HashMap hashMap = (HashMap)objectArray[0];
        long l = (Long)objectArray[1];
        HashMap hashMap2 = (HashMap)objectArray[2];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = a ^ 0x2BF31AC0BAD1L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00a2\u00c4J\u00a7\u00d1\u00bc\u00c2\u00f8\u00a5t\u00bf[\t\f\u00db\u00d4\u00ddJ\u00cf\u00b9\u00b1\u0014\u00ac\u00ba\u008f\u00db\r\u009e\u00f26}\u00aa?S\u00c7\u00fa\u00fb\u0018\u00ceO\u00bc\u0089\u0087F\u00b5\u0098x\u0016\u0013\u00a2\u00ad;w~\u00c2\u0002\u0010\u00bc\u00c1\u00f6v\u00c6\u00faO\u001e@e\u00ea\u00ffg\u009a*f";
        int n2 = "\u00a2\u00c4J\u00a7\u00d1\u00bc\u00c2\u00f8\u00a5t\u00bf[\t\f\u00db\u00d4\u00ddJ\u00cf\u00b9\u00b1\u0014\u00ac\u00ba\u008f\u00db\r\u009e\u00f26}\u00aa?S\u00c7\u00fa\u00fb\u0018\u00ceO\u00bc\u0089\u0087F\u00b5\u0098x\u0016\u0013\u00a2\u00ad;w~\u00c2\u0002\u0010\u00bc\u00c1\u00f6v\u00c6\u00faO\u001e@e\u00ea\u00ffg\u009a*f".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = s6.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x353;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/s6", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            s6.d[n2] = s6.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = s6.a(n, l);
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
            throw new RuntimeException("com/zelix/s6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(s6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
