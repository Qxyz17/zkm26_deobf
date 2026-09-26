/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lkf;
import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.py;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class pp
extends py {
    private static final long c = prr.a((long)8720468527438053288L, (long)-6264061270204963591L, MethodHandles.lookup().lookupClass()).a(182735433125681L);
    private static final String[] e;
    private static final String[] i;
    private static final Map j;
    private static final long v;

    protected final void O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lqq lqq2 = (lqq)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x40985EB3544BL;
        long l4 = l2 ^ 0x15A687E89667L;
        long l5 = l2 ^ 0x60601A455C2EL;
        long l6 = l2 ^ 0x2C9D7D66CBB7L;
        long l7 = l2 ^ 0x41B8096E4240L;
        long l8 = l2 ^ 0x75A221DFC926L;
        long l9 = l2 ^ 0x5E880CC8FCAAL;
        CallSite callSite = m44.a("j", (long)-2447378320742416373L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = lqq2;
        objectArray2[0] = l6;
        m44.a("v", (Object)((Object)this), (List)((Object)m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)-4295149512212803447L, (long)l)), (long)-4599901609736394633L, (long)l);
        Iterator iterator = m44.a("t", (Object)((Object)this), (long)-4599901609736394633L, (long)l).iterator();
        CallSite callSite2 = callSite;
        block6: while (iterator.hasNext()) {
            Object object = iterator.next();
            block7: while (true) {
                block11: {
                    CallSite callSite3;
                    CallSite callSite4;
                    lkf lkf2;
                    block9: {
                        lkf2 = (lkf)object;
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l7;
                        callSite4 = m44.a("u", (Object)lkf2, (Object)objectArray3, (long)-4263978609570534786L, (long)l);
                        try {
                            block10: {
                                try {
                                    try {
                                        callSite3 = m44.a("t", (Object)((Object)this), (long)-2403472703878838033L, (long)l);
                                        if (callSite2 != null) break block9;
                                        if (callSite3.size() != 0) break block10;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("j", (Object)((Object)n92), (long)-2326139454326234699L, (long)l);
                                    }
                                    Object[] objectArray4 = new Object[1];
                                    objectArray4[0] = l9;
                                    Object[] objectArray5 = new Object[1];
                                    objectArray5[0] = l8;
                                    Object[] objectArray6 = new Object[2];
                                    objectArray6[1] = l4;
                                    objectArray6[0] = (String)((Object)pp.c("o", (int)12404, (long)(0x510639D39836AC98L ^ l))) + (String)((Object)m44.a("u", (Object)((Object)this), (Object)objectArray4, (long)-2411680448351347276L, (long)l)) + (String)((Object)pp.c("o", (int)5162, (long)(0x1F1D2E7A10C508C5L ^ l))) + (int)m44.a("u", (Object)((Object)this), (Object)objectArray5, (long)-4605384312439183340L, (long)l) + (String)((Object)pp.c("o", (int)24005, (long)(0x15B05076996412BL ^ l)));
                                    m44.a("u", (Object)lqq2, (Object)objectArray6, (long)-4255967806691996554L, (long)l);
                                    object = callSite2;
                                    if (l <= 0L) break;
                                    if (object == null) break block11;
                                }
                                catch (n9 n93) {
                                    throw m44.a("j", (Object)((Object)n93), (long)-2326139454326234699L, (long)l);
                                }
                            }
                            callSite3 = m44.a("t", (Object)((Object)this), (long)-2403472703878838033L, (long)l);
                        }
                        catch (n9 n94) {
                            throw m44.a("j", (Object)((Object)n94), (long)-2326139454326234699L, (long)l);
                        }
                    }
                    Iterator iterator2 = callSite3.iterator();
                    while (iterator2.hasNext()) {
                        String string = (String)iterator2.next();
                        String string2 = "";
                        String string3 = (String)((Object)callSite4) + (char)v + string + string2;
                        Object[] objectArray7 = new Object[1];
                        objectArray7[0] = l3;
                        Object[] objectArray8 = new Object[4];
                        objectArray8[3] = (boolean)m44.a("u", (Object)lkf2, (Object)objectArray7, (long)-2329262508123115081L, (long)l);
                        objectArray8[2] = string3;
                        objectArray8[1] = l5;
                        objectArray8[0] = lqq2;
                        m44.a("k", (Object)((Object)this), (Object)objectArray8, (long)-4559304587373871164L, (long)l);
                        if (callSite2 != null) continue block6;
                        object = callSite2;
                        if (l < 0L) continue block7;
                        if (object == null) continue;
                    }
                }
                object = callSite2;
                if (l > 0L) break;
            }
            if (object == null) continue;
        }
    }

    boolean v(Object[] objectArray) {
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void k(Object[] var1_1) {
        block9: {
            block8: {
                var6_2 = (lqq)var1_1[0];
                var4_3 = (Long)var1_1[1];
                var3_4 = (String)var1_1[2];
                var2_5 = (Boolean)var1_1[3];
                v0 = var4_3 = pp.c ^ var4_3;
                var7_6 = v0 ^ 28351915861017L;
                var9_7 = v0 ^ 70667953170684L;
                var11_8 = m44.a("n", (long)1748910024417199687L, (long)var4_3);
                try {
                    try {
                        if (var11_8 != null) break block8;
                        if (var2_5) {
                        }
                        ** GOTO lbl30
                    }
                    catch (n9 v1) {
                        throw m44.a("n", (Object)v1, (long)1872281906468677625L, (long)var4_3);
                    }
                    v2 = new Object[2];
                    v2[1] = var3_4;
                    v2[0] = var9_7;
                    m44.a("q", (Object)var6_2, (Object)v2, (long)473141424784620220L, (long)var4_3);
                }
                catch (n9 v3) {
                    throw m44.a("n", (Object)v3, (long)1872281906468677625L, (long)var4_3);
                }
            }
            try {
                if (var4_3 <= 0L || var11_8 == null) break block9;
lbl30:
                // 2 sources

                v4 = new Object[2];
                v4[1] = var3_4;
                v4[0] = var7_6;
                m44.a("q", (Object)var6_2, (Object)v4, (long)2059749297433710533L, (long)var4_3);
            }
            catch (n9 v5) {
                throw m44.a("n", (Object)v5, (long)1872281906468677625L, (long)var4_3);
            }
        }
    }

    public pp(byte by, int n, int n2, int n3) {
        long l = ((long)by << 56 | (long)n2 << 32 >>> 8 | (long)n3 << 40 >>> 40) ^ c;
        long l2 = l ^ 0x5B2EA78BEB1AL;
        super(l2, n);
    }

    boolean D(Object[] objectArray) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        j = new HashMap(13);
        long l = c ^ 0x189BC754AD81L;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "e)\u00c7ffg\u0014\u00cd\u00e4\u00b85N.\u00aap\u00af\u00a2\u00a5\u001b\f}\u00c9O\u00f8p\u00a7LUL\u0013v'\u00b3\u00d7\u00b3\u00d7.\u00dd\u001d\u0083\u001a.\u00bb\u008e\u008a4$\u008d\u00c9\u0012\u0017\u00f00.|\u00b2\u0091\u00b3O\u00a4D\u00f3\u00b0o\u0018c>\u00e1\u00f3\u00c9\u00b3\u001e\u001eY$>\u008e\u009a\u00b0\u009c\u009bE\u00159\u00d4\u00c66w\u00ad r\u00cfd\u00da\u000bn\u00ab\u00cf\u00d4 \u00c7\u00f0`\u008a(\u0090\u00ae\u00a2\u00ce\u009eS~7\u0004\u00b0\u0011>e^\u0018Eo";
        int n2 = "e)\u00c7ffg\u0014\u00cd\u00e4\u00b85N.\u00aap\u00af\u00a2\u00a5\u001b\f}\u00c9O\u00f8p\u00a7LUL\u0013v'\u00b3\u00d7\u00b3\u00d7.\u00dd\u001d\u0083\u001a.\u00bb\u008e\u008a4$\u008d\u00c9\u0012\u0017\u00f00.|\u00b2\u0091\u00b3O\u00a4D\u00f3\u00b0o\u0018c>\u00e1\u00f3\u00c9\u00b3\u001e\u001eY$>\u008e\u009a\u00b0\u009c\u009bE\u00159\u00d4\u00c66w\u00ad r\u00cfd\u00da\u000bn\u00ab\u00cf\u00d4 \u00c7\u00f0`\u008a(\u0090\u00ae\u00a2\u00ce\u009eS~7\u0004\u00b0\u0011>e^\u0018Eo".length();
        int n3 = 64;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = pp.c(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        e = stringArray;
        i = new String[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 8357581698376980479L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                v = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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

    private static String c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x53A3;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])j.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/pp", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            pp.i[n2] = pp.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = pp.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/pp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(pp.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
