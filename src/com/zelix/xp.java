/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ay;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.hm;
import com.zelix.js;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import com.zelix.x7;
import java.io.DataOutputStream;
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

public class xp
extends x7
implements hm {
    int Z;
    private boolean h;
    static final va y;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public String z(char c, int n, short s) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        return m44.a("m", (int)m44.a("s", (Object)((Object)this), (long)-842388136005052022L, (long)l), (long)-648238145899062641L, (long)l);
    }

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-2128374748582452138L, (long)l).g());
        m44.a("v", (Object)dataOutputStream, (int)m44.a("w", (Object)((Object)this), (long)-1820806065748227202L, (long)l), (long)-182435951260832044L, (long)l);
    }

    public void b(Object[] objectArray) {
        int n;
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l2 = l ^ 0x3C02A3BC840AL;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new ay(string + (String)((Object)xp.b("a", (int)7603, (long)(0x6F9A43159C93B914L ^ l))));
        }
        m44.a("q", (Object)((Object)this), (int)n, (long)3836850506178599162L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)3889767407696488877L, (long)l);
    }

    public String j(long l) {
        return xp.b("a", (int)10524, (long)(0x29CD5A17934599C5L ^ l));
    }

    public xp(int n, to to2, long l, xp xp2) {
        l = a ^ l;
        super(n, to2);
        m44.a("s", (Object)((Object)this), (int)m44.a("q", (Object)((Object)xp2), (long)-1043308014345298880L, (long)l), (long)-1043308014345298880L, (long)l);
        m44.a("s", (Object)((Object)this), (boolean)m44.a("q", (Object)((Object)xp2), (long)-1457527375938459899L, (long)l), (long)-1457527375938459899L, (long)l);
    }

    public String W(long l) {
        return m44.a("h", (int)m44.a("v", (Object)((Object)this), (long)462286883030018991L, (long)l), (long)370876111186159786L, (long)l);
    }

    xp(int n, long l, h1 h12, to to2) {
        l = a ^ l;
        super(n, to2);
        m44.a("s", (Object)((Object)this), (int)h12.readInt(), (long)-2036412994169516424L, (long)l);
        m44.a("s", (Object)((Object)this), (boolean)m44.a("p", (Object)to2, (Object)new Object[0], (long)-476105484962463595L, (long)l), (long)-433036769321028291L, (long)l);
    }

    boolean M(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                int n = (Integer)objectArray[1];
                l = a ^ l;
                CallSite callSite = m44.a("l", (long)8685384726715571820L, (long)l);
                try {
                    try {
                        object = m44.a("r", (Object)((Object)this), (long)7412368778241624859L, (long)l);
                        if (callSite != false) break block4;
                        if (object != n) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("l", (Object)numberFormatException, (long)8802341772198842032L, (long)l);
                    }
                    object = true;
                    break block4;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("l", (Object)numberFormatException, (long)8802341772198842032L, (long)l);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public void E(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        m44.a("r", (Object)((Object)this), (int)n, (long)-7402660429891226495L, (long)l);
    }

    public xp(int n, long l, to to2, int n2, boolean bl) {
        l = a ^ l;
        super(n, to2);
        m44.a("w", (Object)((Object)this), (int)n2, (long)5731208277849334348L, (long)l);
        m44.a("w", (Object)((Object)this), (boolean)bl, (long)6181729118965094665L, (long)l);
    }

    public boolean C(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("s", (Object)((Object)this), (long)-531534000734014369L, (long)l);
    }

    public int B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("w", (Object)((Object)this), (long)-7355703552985779154L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)6261185280696104717L, (long)7632682494226075479L, MethodHandles.lookup().lookupClass()).a(78447187095545L);
        long l = a ^ 0x7F060A31F5E5L;
        d = new HashMap(13);
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
        String string = "\n4\u008a\u00d7;,+\u00e29\u00d3\u00b9G\u0006\u001b\u00bf9\u0082\u001d\u0080TOa\u00c5\u00ab\u00ec\u00bf\u00fb\u00bc\u00bf\u001a\u001b\u00b1\u00f1z\u00e7(\u0085Y\u00a6(\u0010\u0080Qy\u009bi\u00e8n\u00a5\u00f7\u00dc\u0015\u00a4\u001c\u00fdC\u00e1";
        int n2 = "\n4\u008a\u00d7;,+\u00e29\u00d3\u00b9G\u0006\u001b\u00bf9\u0082\u001d\u0080TOa\u00c5\u00ab\u00ec\u00bf\u00fb\u00bc\u00bf\u001a\u001b\u00b1\u00f1z\u00e7(\u0085Y\u00a6(\u0010\u0080Qy\u009bi\u00e8n\u00a5\u00f7\u00dc\u0015\u00a4\u001c\u00fdC\u00e1".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = xp.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                y = m44.a("o", (long)-138542315771970972L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public boolean e(long l, gu gu2, Object object, Object object2) {
        long l2 = l ^ 0xB1C2A58BC7CL;
        return gu2.K((js)this, object, l2, object2);
    }

    public String u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x555E98E15F66L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        return m44.a("t", (Object)((Object)this), (char)((char)n), (int)n2, (short)((short)n3), (long)-5706741013377269177L, (long)l);
    }

    public va A(long l) {
        return m44.a("i", (long)-6115300478835643134L, (long)l);
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1B75;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/xp", exception);
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
            xp.c[n2] = xp.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xp.b(n, l);
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
            throw new RuntimeException("com/zelix/xp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xp.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
