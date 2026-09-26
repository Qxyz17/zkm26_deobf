/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqq;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.qf;
import com.zelix.v2;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pf
extends v2 {
    private static final long a = prr.a((long)3576015673774206255L, (long)8013227367056211928L, MethodHandles.lookup().lookupClass()).a(199714559824359L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public pf(short s, int n, short s2, int n2) {
        long l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        long l2 = l ^ 0x18988347D73DL;
        super(l2, n);
    }

    protected void O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lqq lqq2 = (lqq)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x15A687E89667L;
        long l4 = l2 ^ 0x13FAE86461BAL;
        long l5 = l2 ^ 0x88826AB4DA0L;
        long l6 = l2 ^ 0x5E880CC8FCAAL;
        long l7 = l2 ^ 0x31A3D3778ED5L;
        long l8 = l2 ^ 0x48EF352C0649L;
        long l9 = l2 ^ 0x3CFE0AC4F242L;
        long l10 = l2 ^ 0x72C0D0D60A26L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l10;
        CallSite callSite = m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)-2630633816245593429L, (long)l);
        int n4 = 0;
        CallSite callSite2 = m44.a("j", (long)-2447378320742416373L, (long)l);
        while (n4 < callSite) {
            CallSite callSite3;
            block5: {
                block6: {
                    block7: {
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l8;
                        objectArray3[0] = n4;
                        qf qf2 = (qf)m44.a("u", (Object)((Object)this), (Object)objectArray3, (long)-2419197939025966992L, (long)l);
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l5;
                        CallSite callSite4 = m44.a("u", (Object)qf2, (Object)objectArray4, (long)-2755390585885303331L, (long)l);
                        try {
                            try {
                                Object[] objectArray5 = new Object[2];
                                objectArray5[1] = callSite4;
                                objectArray5[0] = l9;
                                m44.a("u", (Object)lqq2, (Object)objectArray5, (long)-4337607265776336360L, (long)l);
                                callSite3 = callSite2;
                                if (l < 0L) break block5;
                                if (callSite3 != null) break block6;
                                Object[] objectArray6 = new Object[1];
                                objectArray6[0] = l7;
                                if (m44.a("u", (Object)qf2, (Object)objectArray6, (long)-2745253452279921282L, (long)l) == false) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("j", (Object)((Object)n92), (long)-2436888121926579159L, (long)l);
                            }
                            Object[] objectArray7 = new Object[1];
                            objectArray7[0] = l6;
                            Object[] objectArray8 = new Object[1];
                            objectArray8[0] = l4;
                            Object[] objectArray9 = new Object[2];
                            objectArray9[1] = l3;
                            objectArray9[0] = (String)((Object)pf.b("p", (int)19546, (long)(0x297F50C61F3BC5CBL ^ l))) + (String)((Object)m44.a("u", (Object)((Object)this), (Object)objectArray7, (long)-2497845677487510802L, (long)l)) + (String)((Object)pf.b("p", (int)5377, (long)(0x69E84F2CC48D1C93L ^ l))) + (String)((Object)m44.a("u", (Object)qf2, (Object)objectArray8, (long)-2537890204607486997L, (long)l)) + "'";
                            m44.a("u", (Object)lqq2, (Object)objectArray9, (long)-4255967806691996554L, (long)l);
                        }
                        catch (n9 n93) {
                            throw m44.a("j", (Object)((Object)n93), (long)-2436888121926579159L, (long)l);
                        }
                    }
                    ++n4;
                }
                callSite3 = callSite2;
            }
            if (callSite3 == null) continue;
        }
    }

    public String m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return pf.b("p", (int)31443, (long)(0x22CC0DFA49590FEAL ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x4302029E0F82L;
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
        String string = "mU\u00bc\u0015\u00c59\u00ed\u0096\u00a3\u0016\u00b5!gH\u00a9\u00e5\u00c60\u0019\u00b9\u00b5\u0098\u0014j \u00f2\u00af\u001d\u00ab\u00e1*\\E+\u00c1\u0010\u00c4!r\u00b6\u00be\"*\u00c2S\u00e5k\u00a2s\u00990X\u0007R\u00c2\u00ddQ@\u00f2\u00ae\u00db\u00f4A($Z\u008ak\u00f9\u00c0\u0001E\u00067\u0010`-\u00e1\u001d\u00feo\u001f\u00e4\u00a3k\u00fdn\u00f7E+5\u0016\u001d}l\u00ab$\u0005\u001e\u00f6\u00dddB\u00cd\u001a\u00b9\u00ca=\u009a\u0005\u00ec\u00fb\u00b2308R\u00ccfjG\u0084";
        int n2 = "mU\u00bc\u0015\u00c59\u00ed\u0096\u00a3\u0016\u00b5!gH\u00a9\u00e5\u00c60\u0019\u00b9\u00b5\u0098\u0014j \u00f2\u00af\u001d\u00ab\u00e1*\\E+\u00c1\u0010\u00c4!r\u00b6\u00be\"*\u00c2S\u00e5k\u00a2s\u00990X\u0007R\u00c2\u00ddQ@\u00f2\u00ae\u00db\u00f4A($Z\u008ak\u00f9\u00c0\u0001E\u00067\u0010`-\u00e1\u001d\u00feo\u001f\u00e4\u00a3k\u00fdn\u00f7E+5\u0016\u001d}l\u00ab$\u0005\u001e\u00f6\u00dddB\u00cd\u001a\u00b9\u00ca=\u009a\u0005\u00ec\u00fb\u00b2308R\u00ccfjG\u0084".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = pf.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x46DE;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/pf", exception);
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
            pf.d[n2] = pf.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = pf.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/pf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(pf.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
