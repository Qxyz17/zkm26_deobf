/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ag;
import com.zelix.m44;
import com.zelix.prr;
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

public class y8
implements ag {
    private static final Map v;
    private static final Map c;
    private final String b;
    private static final long a;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public static y8 h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        return (y8)m44.a("m", (long)-5931986342261246778L, (long)l).get(string);
    }

    public static String w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return y8.a("e", (int)3582, (long)(0x96ACBED628C158BL ^ l));
    }

    public static String x(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return y8.a("e", (int)24774, (long)(0x2D7DCA6F9516CE42L ^ l));
    }

    public String f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x7A2230E1358CL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = m44.a("q", (Object)this, (long)7765062489957303967L, (long)l);
        return m44.a("o", (Object)objectArray2, (long)7882179734051596177L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)6993397815037480858L, (long)4894629379106084768L, MethodHandles.lookup().lookupClass()).a(147601980975559L);
        long l = a ^ 0x6FBEF5687746L;
        long l2 = l ^ 0x1866E4213D45L;
        f = new HashMap(13);
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
        String string = "\u007f\u00ae\u00a2\u001av\u00c1\u001d\u00a5\u00e1\"\u0082}p$\u00e5i\u008cx\u00eb\u0081kf\u000f[3\u00c55<'q\u00e4\u00db29\u00d2\u007f\"H\u00e7\u00f3\u0010E\u00192\u0095JA\u0089\u00ff\u00ea\u00e1l\u00bd\u00e9\u00f2\u00f1X";
        int n2 = "\u007f\u00ae\u00a2\u001av\u00c1\u001d\u00a5\u00e1\"\u0082}p$\u00e5i\u008cx\u00eb\u0081kf\u000f[3\u00c55<'q\u00e4\u00db29\u00d2\u007f\"H\u00e7\u00f3\u0010E\u00192\u0095JA\u0089\u00ff\u00ea\u00e1l\u00bd\u00e9\u00f2\u00f1X".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = y8.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                c = m44.a("h", (Object)objectArray, (long)-2800784298052698685L, (long)l);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l2;
                v = m44.a("h", (Object)objectArray2, (long)-2800784298052698685L, (long)l);
                m44.a("l", (long)-2635295987333865495L, (long)l).put("B", m44.a("l", (long)-2451104719370539926L, (long)l));
                m44.a("l", (long)-2635295987333865495L, (long)l).put("Z", m44.a("l", (long)-4099186514899708178L, (long)l));
                m44.a("l", (long)-2635295987333865495L, (long)l).put("S", m44.a("l", (long)-4382318372713246926L, (long)l));
                m44.a("l", (long)-2635295987333865495L, (long)l).put("C", m44.a("l", (long)-2470657250560035718L, (long)l));
                m44.a("l", (long)-2635295987333865495L, (long)l).put("I", m44.a("l", (long)-2545259385160302619L, (long)l));
                m44.a("l", (long)-2635295987333865495L, (long)l).put("J", m44.a("l", (long)-4175704404252261006L, (long)l));
                m44.a("l", (long)-2635295987333865495L, (long)l).put("F", m44.a("l", (long)-4343983398453513060L, (long)l));
                m44.a("l", (long)-2635295987333865495L, (long)l).put("D", m44.a("l", (long)-2803923372707381794L, (long)l));
                m44.a("l", (long)-2635295987333865495L, (long)l).put("V", m44.a("l", (long)-2344168708321258149L, (long)l));
                m44.a("l", (long)-2320392530429753689L, (long)l).put("B", new y8("B"));
                m44.a("l", (long)-2320392530429753689L, (long)l).put("Z", new y8("Z"));
                m44.a("l", (long)-2320392530429753689L, (long)l).put("S", new y8("S"));
                m44.a("l", (long)-2320392530429753689L, (long)l).put("C", new y8("C"));
                m44.a("l", (long)-2320392530429753689L, (long)l).put("I", new y8("I"));
                m44.a("l", (long)-2320392530429753689L, (long)l).put("J", new y8("J"));
                m44.a("l", (long)-2320392530429753689L, (long)l).put("F", new y8("F"));
                m44.a("l", (long)-2320392530429753689L, (long)l).put("D", new y8("D"));
                m44.a("l", (long)-2320392530429753689L, (long)l).put("V", new y8("V"));
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public boolean H(Object[] objectArray) {
        return true;
    }

    private y8(String string) {
        this.b = string;
    }

    public String h(long l) {
        return m44.a("p", (Object)this, (long)-1627450938326186954L, (long)l);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1947;
        if (e[n2] == null) {
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
                throw new RuntimeException("com/zelix/y8", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            y8.e[n2] = y8.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = y8.a(n, l);
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
            throw new RuntimeException("com/zelix/y8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(y8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
