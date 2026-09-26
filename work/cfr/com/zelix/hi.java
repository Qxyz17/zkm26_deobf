/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._r;
import com.zelix.hs;
import com.zelix.l68;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sh;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class hi
extends hs {
    private Set F;
    private Map N;
    private Set V;
    private static final long g = prr.a(4619154663487469594L, -8638650810640842577L, MethodHandles.lookup().lookupClass()).a(177594012978833L);
    private static final String[] m;
    private static final String[] n;
    private static final Map p;

    public Enumeration D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = g ^ l10) ^ 0x6FF6AFC18559L;
        return new l68(l11, (Collection)((Object)m44.a("s", (Object)this, (long)-7594907642397782519L, (long)l10)));
    }

    public hi(sh sh2, List list, long l10, List list2, lqu lqu2) {
        long l11 = l10 = g ^ l10;
        long l12 = l11 ^ 0x2BEBB1A739BAL;
        long l13 = l11 ^ 0x2A93199C6F40L;
        long l14 = l11 ^ 0x1ABE4E675CC7L;
        super(l14, sh2, list, list2, lqu2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        m44.a("q", (Object)this, (Set)((Object)m44.a("m", (Object)objectArray, (long)-7665443219819467747L, (long)l10)), (long)-7892186009155532055L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        m44.a("q", (Object)this, (Set)((Object)m44.a("m", (Object)objectArray2, (long)-7665443219819467747L, (long)l10)), (long)-7608999636268597215L, (long)l10);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l13;
        m44.a("q", (Object)this, (Map)((Object)m44.a("m", (Object)objectArray3, (long)-8420412504019111994L, (long)l10)), (long)-8036316403371126610L, (long)l10);
    }

    public final void m(Object[] objectArray) {
        block13: {
            CallSite callSite;
            String string;
            block15: {
                hi hi2;
                CallSite callSite2;
                long l10;
                block14: {
                    boolean bl2;
                    long l11;
                    String string2;
                    _r _r2;
                    block12: {
                        l10 = (Long)objectArray[0];
                        _r2 = (_r)objectArray[1];
                        string2 = (String)objectArray[2];
                        l11 = (l10 = g ^ l10) ^ 0x4C0F6BABC5BFL;
                        callSite2 = m44.a("h", (long)2605749454759347301L, (long)l10);
                        try {
                            try {
                                bl2 = m44.a("v", (Object)this, (long)4133273951584690636L, (long)l10).contains(_r2);
                                if (callSite2 != null) break block12;
                                if (!bl2) break block13;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)n92, (long)2776379429812069011L, (long)l10);
                            }
                            m44.a("v", (Object)this, (long)4133273951584690636L, (long)l10).remove(_r2);
                            bl2 = m44.a("v", (Object)this, (long)4414199728708578052L, (long)l10).add(_r2);
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)2776379429812069011L, (long)l10);
                        }
                    }
                    boolean bl3 = bl2;
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    string = (String)((Object)hi.b("b", (int)6991, (long)(0x3ABA32579474F0ECL ^ l10))) + (String)((Object)m44.a("w", (Object)_r2, (Object)objectArray2, (long)2658250268716992691L, (long)l10)) + (String)((Object)hi.b("b", (int)6110, (long)(0x54EB0DDD75DF7C7CL ^ l10))) + string2 + "\"";
                    try {
                        try {
                            hi2 = this;
                            if (l10 <= 0L || callSite2 != null) break block14;
                            if (m44.a("w", (Object)m44.a("v", (Object)hi2, (long)4372095616486778108L, (long)l10), (long)4542141861506409795L, (long)l10) == false) break block13;
                        }
                        catch (n9 n94) {
                            throw m44.a("h", (Object)n94, (long)2776379429812069011L, (long)l10);
                        }
                        hi2 = this;
                    }
                    catch (n9 n95) {
                        throw m44.a("h", (Object)n95, (long)2776379429812069011L, (long)l10);
                    }
                }
                try {
                    try {
                        callSite = m44.a("v", (Object)hi2, (long)4554635643557381567L, (long)l10);
                        if (callSite2 != null) break block15;
                        if (callSite == null) break block13;
                    }
                    catch (n9 n96) {
                        throw m44.a("h", (Object)n96, (long)2776379429812069011L, (long)l10);
                    }
                    callSite = m44.a("v", (Object)this, (long)4554635643557381567L, (long)l10);
                }
                catch (n9 n97) {
                    throw m44.a("h", (Object)n97, (long)2776379429812069011L, (long)l10);
                }
            }
            ((PrintWriter)((Object)callSite)).println("\t" + string);
        }
    }

    void n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 = g ^ l10;
        long l12 = l11 ^ 0x72995FC74300L;
        long l13 = l11 ^ 0xE7E429B805BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        CallSite callSite = m44.a("s", (Object)this.f, (Object)objectArray2, (long)6927548499793181724L, (long)l10);
        CallSite callSite2 = m44.a("l", (long)7047351818311500161L, (long)l10);
        while (callSite.hasMoreElements()) {
            _r _r2 = (_r)callSite.nextElement();
            boolean bl2 = m44.a("r", (Object)this, (long)8986955818178241576L, (long)l10).add(_r2);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l13;
            _r _r3 = m44.a("r", (Object)this, (long)9131051402204135023L, (long)l10).put(m44.a("s", (Object)_r2, (Object)objectArray3, (long)6989660255265672535L, (long)l10), _r2);
            if (callSite2 == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        p = new HashMap(13);
        long l10 = g ^ 0x14F31AC033A0L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n10 = 0;
        String string = "\u009fHg\u008d\u00ba\u00f6\u00c1\u00c4S\u000b@\f\u0083u\u00a0\u00e1\u00b2\u008e\u00ae]d-\u00a9\u0084PL\u00aaaR\u0018-o\u00c8\u00f8-\u009d\u00a1\u0011\u0098K@\u00ca.\u00dc\u0001#\u00f5{\r\u0080P\u0013d6\u0084\u00b3je\u00dc\u00b2\u008f\u00e2\u00fdk@\u009f\u00b1\u00fd5I\u008b\u00d7\u00a1\u00d8K\u0007|\u0001\u00eaH\u0002\n\u0091\f\u0018\u00eainzf\u00ee'\u00b8\u00ab\u001a\u00aay\u00aftn\u0019`\u000fi6";
        int n11 = "\u009fHg\u008d\u00ba\u00f6\u00c1\u00c4S\u000b@\f\u0083u\u00a0\u00e1\u00b2\u008e\u00ae]d-\u00a9\u0084PL\u00aaaR\u0018-o\u00c8\u00f8-\u009d\u00a1\u0011\u0098K@\u00ca.\u00dc\u0001#\u00f5{\r\u0080P\u0013d6\u0084\u00b3je\u00dc\u00b2\u008f\u00e2\u00fdk@\u009f\u00b1\u00fd5I\u008b\u00d7\u00a1\u00d8K\u0007|\u0001\u00eaH\u0002\n\u0091\f\u0018\u00eainzf\u00ee'\u00b8\u00ab\u001a\u00aay\u00aftn\u0019`\u000fi6".length();
        int n12 = 40;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = hi.b(byArray3).intern();
            if ((n13 += n12) >= n11) {
                m = stringArray;
                n = new String[2];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4484;
        if (n[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])p.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    p.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/hi", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = m[n11].getBytes("ISO-8859-1");
            hi.n[n11] = hi.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return n[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = hi.b(n10, l10);
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
            throw new RuntimeException("com/zelix/hi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hi.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

