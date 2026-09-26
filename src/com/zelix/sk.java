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
import com.zelix.xy;
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
public class sk
extends sw {
    private xy K;
    private static final long a = prr.a((long)4193105639100934358L, (long)-4816549952194240551L, MethodHandles.lookup().lookupClass()).a(144692430161158L);
    private static final String[] c;
    private static final String[] d;
    private static final Map f;

    String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
    }

    sk(long l, int n, _4 _42, int n2, h1 h12) {
        block15: {
            StringBuilder stringBuilder;
            Object object;
            sk sk2;
            long l2;
            long l3;
            block16: {
                block17: {
                    js js2;
                    CallSite callSite;
                    int n3;
                    long l4;
                    block13: {
                        long l5 = l3 = (l << 32 | (long)n << 32 >>> 32) ^ a;
                        long l6 = l5 ^ 0x2F49901B508L;
                        l2 = l5 ^ 0x3319F94EF0C7L;
                        long l7 = l5 ^ 0x77C94B792534L;
                        int n4 = (int)(l7 >>> 48);
                        int n5 = (int)(l7 << 16 >>> 48);
                        int n6 = (int)(l7 << 32 >>> 32);
                        l4 = l5 ^ 0x4D86D0844443L;
                        long l8 = l5 ^ 0x72897953F90EL;
                        super((char)n4, _42, (char)n5, n2, n6);
                        n3 = h12.readUnsignedShort();
                        callSite = m44.a("n", (long)-1583123908579639584L, (long)l3);
                        js2 = this.m(l8, n3);
                        try {
                            block14: {
                                try {
                                    try {
                                        try {
                                            if (callSite != false) break block13;
                                            if (js2 == null) break block14;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("n", (Object)((Object)n92), (long)-879800572553335854L, (long)l3);
                                        }
                                        if (l <= 0L) break block13;
                                        if (!(js2 instanceof xy)) break block14;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("n", (Object)((Object)n93), (long)-879800572553335854L, (long)l3);
                                    }
                                    m44.a("r", (Object)((Object)this), (xy)((xy)js2), (long)-863716351996278244L, (long)l3);
                                    if (callSite == false) break block15;
                                }
                                catch (n9 n94) {
                                    throw m44.a("n", (Object)((Object)n94), (long)-879800572553335854L, (long)l3);
                                }
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = false;
                            objectArray[0] = l6;
                            m44.a("q", (Object)((Object)this), (Object)objectArray, (long)-1237230668380664307L, (long)l3);
                        }
                        catch (n9 n95) {
                            throw m44.a("n", (Object)((Object)n95), (long)-879800572553335854L, (long)l3);
                        }
                    }
                    try {
                        try {
                            sk2 = this;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            int n7 = 21732;
                            if (n > 0) {
                                object = sk.a("m", (int)n7, (long)(0x669E43513D534F50L ^ l3));
                                if (callSite != false) break block16;
                                stringBuilder2 = stringBuilder2.append((String)object);
                                n7 = n3;
                            }
                            stringBuilder = stringBuilder2.append(n7);
                            if (js2 == null) break block17;
                        }
                        catch (n9 n96) {
                            throw m44.a("n", (Object)((Object)n96), (long)-879800572553335854L, (long)l3);
                        }
                        object = (String)((Object)sk.a("m", (int)20693, (long)(0x22728DDC23B44B60L ^ l3))) + js2.A(l4);
                        break block16;
                    }
                    catch (n9 n97) {
                        throw m44.a("n", (Object)((Object)n97), (long)-879800572553335854L, (long)l3);
                    }
                }
                object = "";
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = stringBuilder.append((String)object).toString();
            objectArray[0] = l2;
            m44.a("q", (Object)((Object)sk2), (Object)objectArray, (long)-771292450715534092L, (long)l3);
        }
    }

    String G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x48464C26AC71L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return String.valueOf((char)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1059643294945864706L, (long)l));
    }

    public void p(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    public void q(x8 x82, long l, x8 x83) {
    }

    public void z(gu gu2, long l) {
        long l2 = l ^ 0x6DE1DADD9981L;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6052048383187447266L, (long)l), (long)l2, (Object)gu2, (Object)((Object)this), (Object)this.H(), (long)6311893132924806359L, (long)l);
    }

    public void n(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x65CE406CDE83L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        dataOutputStream.writeByte((int)m44.a("p", (Object)((Object)this), (Object)objectArray2, (long)-8955045563159879412L, (long)l));
        dataOutputStream.writeShort(m44.a("q", (Object)((Object)this), (long)-8934481235525846499L, (long)l).E());
    }

    public void B(Object[] objectArray) {
        HashMap hashMap = (HashMap)objectArray[0];
        long l = (Long)objectArray[1];
        HashMap hashMap2 = (HashMap)objectArray[2];
    }

    public void z(Object[] objectArray) {
        _6 _62 = (_6)objectArray[0];
        long l = (Long)objectArray[1];
        l6z l6z2 = (l6z)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
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
        dataOutputStream.writeShort(m44.a("t", (Object)((Object)this), (long)-3233785719894119168L, (long)l).E());
    }

    public void a(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        long l = (Long)objectArray[1];
    }

    boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public int c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return 3;
    }

    public void I(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        Set set2 = (Set)objectArray[1];
        Set set3 = (Set)objectArray[2];
        Set set4 = (Set)objectArray[3];
        long l = (Long)objectArray[4];
    }

    boolean i(Object[] objectArray) {
        return false;
    }

    public void G(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = a ^ 0x5D6134FEB92L;
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
        String string = "Ic3*k\u00e2oaf\t\u009f\u00f2z\u0093p\u00d0H\u00d1\u00af\u0007\u00f5\u00f2\u0015i\u0092\u0089\u00e9\u00a8\u00e5e\u00ee:\u00bd\u0098jQ0\u00c7vz\u0091\u00e8!\u00fc\u00dc<\u0004\u00f5F\u008bu\u000f\u0099)%x\u00d6\u00b6\u0017\u009d\u0092\u00c2u%]\u00d2\u00a03N\u00ceW\u00ee\u00ae\u008e\u00af\u0019j\u00b5f\u00ae\u00db7\u00fe.\u00c3z\u0096\u00c7\u00a5";
        int n2 = "Ic3*k\u00e2oaf\t\u009f\u00f2z\u0093p\u00d0H\u00d1\u00af\u0007\u00f5\u00f2\u0015i\u0092\u0089\u00e9\u00a8\u00e5e\u00ee:\u00bd\u0098jQ0\u00c7vz\u0091\u00e8!\u00fc\u00dc<\u0004\u00f5F\u008bu\u000f\u0099)%x\u00d6\u00b6\u0017\u009d\u0092\u00c2u%]\u00d2\u00a03N\u00ceW\u00ee\u00ae\u008e\u00af\u0019j\u00b5f\u00ae\u00db7\u00fe.\u00c3z\u0096\u00c7\u00a5".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = sk.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7AF4;
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
                throw new RuntimeException("com/zelix/sk", exception);
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
            sk.d[n2] = sk.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = sk.a(n, l);
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
            throw new RuntimeException("com/zelix/sk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(sk.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
