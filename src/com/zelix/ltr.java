/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lo4;
import com.zelix.lqu;
import com.zelix.ltv;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.r5;
import com.zelix.ya;
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

public class ltr
extends l7t
implements r5 {
    private String g;
    private static final long a = prr.a((long)8066955022824672136L, (long)4374530613057646390L, MethodHandles.lookup().lookupClass()).a(281450198343251L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;

    public void M(Object[] objectArray) {
        block8: {
            lo4 lo42;
            int n;
            CallSite callSite;
            ltv ltv2;
            long l;
            long l2;
            long l3;
            long l4;
            long l5;
            block9: {
                block10: {
                    CallSite callSite2;
                    CallSite callSite3;
                    long l6;
                    long l7;
                    block7: {
                        lmu lmu2 = (lmu)objectArray[0];
                        lqu lqu2 = (lqu)objectArray[1];
                        l5 = (Long)objectArray[2];
                        long l8 = l5;
                        l7 = l8 ^ 0x195214C8507DL;
                        l4 = l8 ^ 0x7C7B19E51E83L;
                        l3 = l8 ^ 0x7CB5B7F16076L;
                        long l9 = l8 ^ 0x6A0B933DB81AL;
                        l2 = l8 ^ 0x57FAF25AD6C6L;
                        long l10 = l8 ^ 0x294E7AE5CB77L;
                        l6 = l8 ^ 0x493A0D9722DBL;
                        long l11 = l8 ^ 0x47526B4E5A06L;
                        long l12 = l8 ^ 0L;
                        l = l8 ^ 0x66D038578B90L;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l11;
                        CallSite callSite4 = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l5);
                        callSite3 = m44.a("h", (long)-5113628074367501874L, (long)l5);
                        Object[] objectArray3 = new Object[3];
                        objectArray3[2] = l12;
                        objectArray3[1] = lqu2;
                        objectArray3[0] = this;
                        m44.a("w", (Object)this.V(0), (Object)objectArray3, (long)-6656114929610942631L, (long)l5);
                        ltv2 = (ltv)lmu2;
                        try {
                            try {
                                callSite2 = m44.a("v", (Object)((Object)this), (long)-4698462921347102279L, (long)l5);
                                if (callSite3 == false) break block7;
                                if (callSite2 == null) break block8;
                            }
                            catch (n9 n92) {
                                throw m44.a("h", (Object)((Object)n92), (long)-4688641969983360287L, (long)l5);
                            }
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l9;
                            m44.a("w", (Object)ltv2, (Object)objectArray4, (long)-6436546026379423003L, (long)l5);
                            Object[] objectArray5 = new Object[2];
                            objectArray5[1] = m44.a("v", (Object)((Object)this), (long)-4698462921347102279L, (long)l5);
                            objectArray5[0] = l10;
                            callSite2 = m44.a("h", (Object)objectArray5, (long)-6524231753401867768L, (long)l5);
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-4688641969983360287L, (long)l5);
                        }
                    }
                    CallSite callSite5 = callSite2;
                    Object[] objectArray6 = new Object[2];
                    objectArray6[1] = l6;
                    objectArray6[0] = m44.a("v", (Object)((Object)this), (long)-4698462921347102279L, (long)l5);
                    callSite = m44.a("h", (Object)objectArray6, (long)-5168804988263131306L, (long)l5);
                    try {
                        n = ((String)((Object)callSite5)).length();
                        if (callSite3 == false) break block9;
                        if (n <= 0) break block10;
                    }
                    catch (n9 n94) {
                        throw m44.a("h", (Object)((Object)n94), (long)-4688641969983360287L, (long)l5);
                    }
                    lo42 = new ya(l7, (String)((Object)callSite5));
                    m44.a("w", (Object)ltv2, (Object)new Object[]{lo42}, (long)-4970424352409412414L, (long)l5);
                }
                n = ((String)((Object)callSite)).length();
            }
            if (n > 0) {
                lo42 = new lo4(l, (String)((Object)callSite));
                Object[] objectArray7 = new Object[2];
                objectArray7[1] = lo42;
                objectArray7[0] = l4;
                m44.a("w", (Object)ltv2, (Object)objectArray7, (long)-6406324941748262110L, (long)l5);
            }
            m44.a("w", (Object)ltv2, (Object)new Object[]{ltr.a("h", (int)27490, (long)(0x7A06E6AB1DD23595L ^ l5))}, (long)-4898151629589260817L, (long)l5);
            Object[] objectArray8 = new Object[2];
            objectArray8[1] = l2;
            objectArray8[0] = null;
            m44.a("w", (Object)ltv2, (Object)objectArray8, (long)-5042232872046567712L, (long)l5);
            Object[] objectArray9 = new Object[2];
            objectArray9[1] = ltr.a("h", (int)7608, (long)(0x2C8C61D583C9C34EL ^ l5));
            objectArray9[0] = l3;
            m44.a("w", (Object)ltv2, (Object)objectArray9, (long)-6595143417819150615L, (long)l5);
        }
    }

    public void r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        m44.a("s", (Object)((Object)this), (String)string, (long)-8143397015960340082L, (long)l);
    }

    public ltr(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x379733FEE350L;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x2031BF9C12AFL;
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
        String string = "\u0005\u0007\u009a\u00f2\u00af\u0019\u0003\u007fRL\u00ceA\u00ad\u00ad\u0014\u009b\u0096\u0000\u00baL\u00c9;\u00e5\u0083]`\u00c5\u0093\u00df\u00eb& |j\u00f3\u00f9)0\u00c5\u00dbdZElN\u0081Q\u009dqX\u0092\u00889b\u00e3\u00f9\u0018\u00f4m\u000f\u00e6\u008b{\u00fb\u00fe0H\u00f8\u00f8\u000e\u00b1\u00839:fD]\u00c9\u0084\u00a8\u009d";
        int n2 = "\u0005\u0007\u009a\u00f2\u00af\u0019\u0003\u007fRL\u00ceA\u00ad\u00ad\u0014\u009b\u0096\u0000\u00baL\u00c9;\u00e5\u0083]`\u00c5\u0093\u00df\u00eb& |j\u00f3\u00f9)0\u00c5\u00dbdZElN\u0081Q\u009dqX\u0092\u00889b\u00e3\u00f9\u0018\u00f4m\u000f\u00e6\u008b{\u00fb\u00fe0H\u00f8\u00f8\u000e\u00b1\u00839:fD]\u00c9\u0084\u00a8\u009d".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ltr.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                d = new String[2];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6B60;
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
                throw new RuntimeException("com/zelix/ltr", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            ltr.d[n2] = ltr.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ltr.a(n, l);
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
            throw new RuntimeException("com/zelix/ltr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ltr.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
