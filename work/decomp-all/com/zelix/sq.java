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
import com.zelix.xj;
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
public class sq
extends sw {
    private xj G;
    private static final long a = prr.a((long)-2756660280886738248L, (long)63415803917166784L, MethodHandles.lookup().lookupClass()).a(43842047508381L);
    private static final String[] c;
    private static final String[] d;
    private static final Map f;

    String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
    }

    public void I(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        Set set2 = (Set)objectArray[1];
        Set set3 = (Set)objectArray[2];
        Set set4 = (Set)objectArray[3];
        long l = (Long)objectArray[4];
    }

    public void a(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        long l = (Long)objectArray[1];
    }

    public void n(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x65CE406CDE83L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        dataOutputStream.writeByte((int)m44.a("p", (Object)((Object)this), (Object)objectArray2, (long)-8955045563159879412L, (long)l));
        dataOutputStream.writeShort(m44.a("q", (Object)((Object)this), (long)-8989296144475175993L, (long)l).E());
    }

    public void G(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    public void B(Object[] objectArray) {
        HashMap hashMap = (HashMap)objectArray[0];
        long l = (Long)objectArray[1];
        HashMap hashMap2 = (HashMap)objectArray[2];
    }

    boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public int c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return 3;
    }

    boolean i(Object[] objectArray) {
        return false;
    }

    String G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x48464C26AC71L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return String.valueOf((char)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1059643294945864706L, (long)l));
    }

    public void q(x8 x82, long l, x8 x83) {
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
        dataOutputStream.writeShort(m44.a("t", (Object)((Object)this), (long)-3160810697015126822L, (long)l).E());
    }

    public void z(gu gu2, long l) {
        long l2 = l ^ 0x6DE1DADD9981L;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6107148962908542008L, (long)l), (long)l2, (Object)gu2, (Object)((Object)this), (Object)this.H(), (long)5812237388723424867L, (long)l);
    }

    sq(_4 _42, int n, h1 h12, long l) {
        block15: {
            StringBuilder stringBuilder;
            Object object;
            sq sq2;
            long l2;
            block16: {
                block17: {
                    js js2;
                    CallSite callSite;
                    int n2;
                    long l3;
                    block13: {
                        long l4 = l = a ^ l;
                        long l5 = l4 ^ 0x24EC374F0143L;
                        l2 = l4 ^ 0x15015700448CL;
                        long l6 = l4 ^ 0x51D1E537917FL;
                        int n3 = (int)(l6 >>> 48);
                        int n4 = (int)(l6 << 16 >>> 48);
                        int n5 = (int)(l6 << 32 >>> 32);
                        l3 = l4 ^ 0x6B9E7ECAF008L;
                        long l7 = l4 ^ 0x5491D71D4D45L;
                        super((char)n3, _42, (char)n4, n, n5);
                        n2 = h12.readUnsignedShort();
                        callSite = m44.a("m", (long)6795011726050855595L, (long)l);
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
                                            throw m44.a("m", (Object)((Object)n92), (long)6446233227283152412L, (long)l);
                                        }
                                        if (l <= 0L) break block13;
                                        if (!(js2 instanceof xj)) break block14;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("m", (Object)((Object)n93), (long)6446233227283152412L, (long)l);
                                    }
                                    m44.a("q", (Object)((Object)this), (xj)((xj)js2), (long)5149183355384498061L, (long)l);
                                    if (callSite == false) break block15;
                                }
                                catch (n9 n94) {
                                    throw m44.a("m", (Object)((Object)n94), (long)6446233227283152412L, (long)l);
                                }
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = false;
                            objectArray[0] = l5;
                            m44.a("r", (Object)((Object)this), (Object)objectArray, (long)6530042831568714310L, (long)l);
                        }
                        catch (n9 n95) {
                            throw m44.a("m", (Object)((Object)n95), (long)6446233227283152412L, (long)l);
                        }
                    }
                    try {
                        try {
                            sq2 = this;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            int n6 = 3726;
                            if (l > 0L) {
                                object = sq.a("j", (int)n6, (long)(0x6D27A574D2069101L ^ l));
                                if (callSite != false) break block16;
                                stringBuilder2 = stringBuilder2.append((String)object);
                                n6 = n2;
                            }
                            stringBuilder = stringBuilder2.append(n6);
                            if (js2 == null) break block17;
                        }
                        catch (n9 n96) {
                            throw m44.a("m", (Object)((Object)n96), (long)6446233227283152412L, (long)l);
                        }
                        object = (String)((Object)sq.a("j", (int)22764, (long)(0x6089352ABDDC762L ^ l))) + js2.A(l3);
                        break block16;
                    }
                    catch (n9 n97) {
                        throw m44.a("m", (Object)((Object)n97), (long)6446233227283152412L, (long)l);
                    }
                }
                object = "";
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = stringBuilder.append((String)object).toString();
            objectArray[0] = l2;
            m44.a("r", (Object)((Object)sq2), (Object)objectArray, (long)4684015754199582911L, (long)l);
            return;
        }
    }

    public void z(Object[] objectArray) {
        _6 _62 = (_6)objectArray[0];
        long l = (Long)objectArray[1];
        l6z l6z2 = (l6z)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
    }

    public void p(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = a ^ 0x7206FFCD0316L;
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
        String string = "$\u00f0\u0094\u009a\u0003\u00e2B(\u0090\u00ca#Y'\u00d6\u001f\u0089\u00c7\u0016\u00b5\u00ccb\u00bc\u00d0\u0018\u0096\u0002\u008cE3E\u00da\u0098\u0002\u0086M\u00f2m}I\u00c7\u00be\u00e2\u00d8\r9iZ\u00c2|\u000b\u00bcUB\u00b8\u00a0\b\u00d7\u0013\u0013v\u00d4D\u00ff\u00cbA;\u00ca\u009f\u00af\u00ad\u00dfR\u0003\\{ fxR\u0092\u0010%\u00ad\u00ed\u00b1\u00b1\u0011\u00f4\u00d7\u0097\u00f8\u00c7\u0002\u00da\u00d2w\u00ee";
        int n2 = "$\u00f0\u0094\u009a\u0003\u00e2B(\u0090\u00ca#Y'\u00d6\u001f\u0089\u00c7\u0016\u00b5\u00ccb\u00bc\u00d0\u0018\u0096\u0002\u008cE3E\u00da\u0098\u0002\u0086M\u00f2m}I\u00c7\u00be\u00e2\u00d8\r9iZ\u00c2|\u000b\u00bcUB\u00b8\u00a0\b\u00d7\u0013\u0013v\u00d4D\u00ff\u00cbA;\u00ca\u009f\u00af\u00ad\u00dfR\u0003\\{ fxR\u0092\u0010%\u00ad\u00ed\u00b1\u00b1\u0011\u00f4\u00d7\u0097\u00f8\u00c7\u0002\u00da\u00d2w\u00ee".length();
        int n3 = 80;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = sq.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4A85;
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
                throw new RuntimeException("com/zelix/sq", exception);
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
            sq.d[n2] = sq.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = sq.a(n, l);
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
            throw new RuntimeException("com/zelix/sq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(sq.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
