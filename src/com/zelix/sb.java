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
import com.zelix.xa;
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
public class sb
extends sw {
    private xa r;
    private static final long a = prr.a((long)5356017752007998115L, (long)-6836007464210742756L, MethodHandles.lookup().lookupClass()).a(260637023416376L);
    private static final String[] c;
    private static final String[] d;
    private static final Map f;

    sb(_4 _42, long l, int n, h1 h12) {
        block15: {
            StringBuilder stringBuilder;
            Object object;
            sb sb2;
            long l2;
            block16: {
                block17: {
                    CallSite callSite;
                    js js2;
                    int n2;
                    long l3;
                    block13: {
                        long l4 = l = a ^ l;
                        long l5 = l4 ^ 0x45FBC3C30DCBL;
                        l2 = l4 ^ 0x7416A38C4804L;
                        long l6 = l4 ^ 0x30C611BB9DF7L;
                        int n3 = (int)(l6 >>> 48);
                        int n4 = (int)(l6 << 16 >>> 48);
                        int n5 = (int)(l6 << 32 >>> 32);
                        l3 = l4 ^ 0xA898A46FC80L;
                        long l7 = l4 ^ 0x3586239141CDL;
                        super((char)n3, _42, (char)n4, n, n5);
                        n2 = h12.readUnsignedShort();
                        js2 = this.m(l7, n2);
                        callSite = m44.a("m", (long)5964131767365142051L, (long)l);
                        try {
                            block14: {
                                try {
                                    try {
                                        try {
                                            if (callSite != false) break block13;
                                            if (js2 == null) break block14;
                                        }
                                        catch (n9 n92) {
                                            throw m44.a("m", (Object)((Object)n92), (long)5213187462552614612L, (long)l);
                                        }
                                        if (l <= 0L) break block13;
                                        if (!(js2 instanceof xa)) break block14;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("m", (Object)((Object)n93), (long)5213187462552614612L, (long)l);
                                    }
                                    m44.a("q", (Object)((Object)this), (xa)((xa)js2), (long)5760984140278069917L, (long)l);
                                    if (callSite == false) break block15;
                                }
                                catch (n9 n94) {
                                    throw m44.a("m", (Object)((Object)n94), (long)5213187462552614612L, (long)l);
                                }
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = false;
                            objectArray[0] = l5;
                            m44.a("r", (Object)((Object)this), (Object)objectArray, (long)6203495509931407054L, (long)l);
                        }
                        catch (n9 n95) {
                            throw m44.a("m", (Object)((Object)n95), (long)5213187462552614612L, (long)l);
                        }
                    }
                    try {
                        try {
                            sb2 = this;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            int n6 = 4375;
                            if (l > 0L) {
                                object = sb.a("k", (int)n6, (long)(0xC65E0A1B90EC305L ^ l));
                                if (callSite != false) break block16;
                                stringBuilder2 = stringBuilder2.append((String)object);
                                n6 = n2;
                            }
                            stringBuilder = stringBuilder2.append(n6);
                            if (js2 == null) break block17;
                        }
                        catch (n9 n96) {
                            throw m44.a("m", (Object)((Object)n96), (long)5213187462552614612L, (long)l);
                        }
                        object = (String)((Object)sb.a("k", (int)32016, (long)(0x44365131760BAF03L ^ l))) + js2.A(l3);
                        break block16;
                    }
                    catch (n9 n97) {
                        throw m44.a("m", (Object)((Object)n97), (long)5213187462552614612L, (long)l);
                    }
                }
                object = "";
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = stringBuilder.append((String)object).toString();
            objectArray[0] = l2;
            m44.a("r", (Object)((Object)sb2), (Object)objectArray, (long)5586880904915731511L, (long)l);
            return;
        }
    }

    public void I(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        Set set2 = (Set)objectArray[1];
        Set set3 = (Set)objectArray[2];
        Set set4 = (Set)objectArray[3];
        long l = (Long)objectArray[4];
    }

    public void G(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    public void z(Object[] objectArray) {
        _6 _62 = (_6)objectArray[0];
        long l = (Long)objectArray[1];
        l6z l6z2 = (l6z)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
    }

    public void n(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x65CE406CDE83L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        dataOutputStream.writeByte((int)m44.a("p", (Object)((Object)this), (Object)objectArray2, (long)-8955045563159879412L, (long)l));
        dataOutputStream.writeShort(m44.a("q", (Object)((Object)this), (long)-8705095615544413601L, (long)l).E());
    }

    public void z(gu gu2, long l) {
        long l2 = l ^ 0x6DE1DADD9981L;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5822627649987667360L, (long)l), (long)l2, (Object)gu2, (Object)((Object)this), (Object)this.H(), (long)5698856373226330252L, (long)l);
    }

    boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public void q(x8 x82, long l, x8 x83) {
    }

    String G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x48464C26AC71L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return String.valueOf((char)m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)-1059643294945864706L, (long)l));
    }

    public void a(Object[] objectArray) {
        Set set = (Set)objectArray[0];
        long l = (Long)objectArray[1];
    }

    public void B(Object[] objectArray) {
        HashMap hashMap = (HashMap)objectArray[0];
        long l = (Long)objectArray[1];
        HashMap hashMap2 = (HashMap)objectArray[2];
    }

    public int c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return 3;
    }

    public void p(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return null;
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
        dataOutputStream.writeShort(m44.a("t", (Object)((Object)this), (long)-3446282812216941246L, (long)l).E());
    }

    boolean i(Object[] objectArray) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = a ^ 0x43D16A14DF83L;
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
        String string = "\u008f\u0088x\u00e4\u00a42\u00f1\u00e7[\u00a0;\u0010us7<H|\u0011\u00d9Gp\u00df\u0087\u00ff\u00c2\u00b4\u0090!]\u00f6=\u009f\u009f\u0097\u00d9\u001d\u00e1ZB\u00b8\u009bS\u00c8ba\u00a7c\u00a4\u00da}\u00c7\u0089\u0083\u009c\u00f5>n\u00c7\u0099\u00c9\u00ec`T\u00e9Zo.\u00d6\u0013\u0017\u0086Vu\u00a7b\u0092=\t\u0010\u0092\u0004K4\u0091\u00c2g\u00f0\u00d9";
        int n2 = "\u008f\u0088x\u00e4\u00a42\u00f1\u00e7[\u00a0;\u0010us7<H|\u0011\u00d9Gp\u00df\u0087\u00ff\u00c2\u00b4\u0090!]\u00f6=\u009f\u009f\u0097\u00d9\u001d\u00e1ZB\u00b8\u009bS\u00c8ba\u00a7c\u00a4\u00da}\u00c7\u0089\u0083\u009c\u00f5>n\u00c7\u0099\u00c9\u00ec`T\u00e9Zo.\u00d6\u0013\u0017\u0086Vu\u00a7b\u0092=\t\u0010\u0092\u0004K4\u0091\u00c2g\u00f0\u00d9".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = sb.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xB91;
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
                throw new RuntimeException("com/zelix/sb", exception);
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
            sb.d[n2] = sb.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = sb.a(n, l);
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
            throw new RuntimeException("com/zelix/sb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(sb.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
