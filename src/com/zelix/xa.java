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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class xa
extends x7
implements hm {
    static final va K;
    private boolean s;
    long q;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public long u(Object[] objectArray) {
        return this.q;
    }

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(K.g());
        dataOutputStream.writeLong(this.q);
    }

    public void b(Object[] objectArray) {
        long l;
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l3 = l2 ^ 0x3C02A3BC840AL;
        try {
            l = (Long)((Object)m44.a("m", (Object)string, (long)3564775480080110919L, (long)l2));
        }
        catch (NumberFormatException numberFormatException) {
            throw new ay(string + (String)((Object)xa.b("s", (int)3024, (long)(0x782F5BEE19C7B183L ^ l2))));
        }
        this.q = l;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)3889767407696488877L, (long)l2);
    }

    public String u(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x555E98E15F66L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        return m44.a("t", (Object)((Object)this), (char)((char)n), (int)n2, (short)((short)n3), (long)-5611372705249310609L, (long)l);
    }

    public boolean e(long l, gu gu2, Object object, Object object2) {
        long l2 = l ^ 0xB1C2A58BC7CL;
        return gu2.K((js)this, object, l2, object2);
    }

    public String z(char c, int n, short s) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        return m44.a("m", (long)this.q, (long)-1236900188483468939L, (long)l);
    }

    xa(int n, h1 h12, to to2, long l) {
        l = a ^ l;
        super(n, to2);
        this.q = (long)m44.a("r", (Object)h12, (long)-2884145957346225806L, (long)l);
        m44.a("q", (Object)((Object)this), (boolean)m44.a("r", (Object)to2, (Object)new Object[0], (long)-3166384015503217153L, (long)l), (long)-2941274592526778453L, (long)l);
    }

    protected int x(long l) {
        return 2;
    }

    public boolean v(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("q", (Object)((Object)this), (long)2924020120313380881L, (long)l);
    }

    public xa(int n, to to2, xa xa2, long l) {
        l = a ^ l;
        super(n, to2);
        this.q = xa2.q;
        m44.a("p", (Object)((Object)this), (boolean)m44.a("r", (Object)((Object)xa2), (long)3755753657646636186L, (long)l), (long)3755753657646636186L, (long)l);
    }

    public va A(long l) {
        return K;
    }

    public xa(byte by, int n, int n2, int n3, to to2, long l) {
        long l2 = ((long)by << 56 | (long)n2 << 32 >>> 8 | (long)n3 << 40 >>> 40) ^ a;
        super(n, to2);
        this.q = l;
        m44.a("q", (Object)((Object)this), (boolean)false, (long)3802750416511360067L, (long)l2);
    }

    public xa(int n, int n2, short s, to to2, char c, long l, boolean bl) {
        long l2 = ((long)n2 << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ a;
        super(n, to2);
        this.q = l;
        m44.a("q", (Object)((Object)this), (boolean)bl, (long)5122326724390006675L, (long)l2);
    }

    public void X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        this.q = l;
    }

    public String W(long l) {
        return m44.a("h", (long)this.q, (long)2085385260298515280L, (long)l);
    }

    boolean W(long l, long l2) {
        long l3;
        block2: {
            block3: {
                l2 = a ^ l2;
                CallSite callSite = m44.a("o", (long)-5013690015646032753L, (long)l2);
                try {
                    long l4 = this.q - l;
                    l3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (callSite != false) break block2;
                    if (l3 != false) break block3;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("o", (Object)numberFormatException, (long)-6545033318603541255L, (long)l2);
                }
                l3 = 1;
                break block2;
            }
            l3 = 0;
        }
        return (boolean)l3;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)-3363658344045356809L, (long)-5091946202222449028L, MethodHandles.lookup().lookupClass()).a(160900066721294L);
        long l = a ^ 0x35FC094A973DL;
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
        String string = "\u00a4n'\u0014nc\u00fe\u00f8\u009a\u00dd:\u00f7\u0093o\u001fiP\u00e6\u00b3\u00deG\u00f8\u0095\u0002\u0084z\u00b5U\u00f6t\u000f\u00ffP\u0012\u0013\u00cf\u00f3\u00f9\u0090'\u0010,iE;\u0011\u00a7\u008f\u0011\u0095\u0004\u0088\u00e7\u00c4\u00d7\u00f8\u00eb";
        int n2 = "\u00a4n'\u0014nc\u00fe\u00f8\u009a\u00dd:\u00f7\u0093o\u001fiP\u00e6\u00b3\u00deG\u00f8\u0095\u0002\u0084z\u00b5U\u00f6t\u000f\u00ffP\u0012\u0013\u00cf\u00f3\u00f9\u0090'\u0010,iE;\u0011\u00a7\u008f\u0011\u0095\u0004\u0088\u00e7\u00c4\u00d7\u00f8\u00eb".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = xa.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                K = m44.a("i", (long)-6830170935783717495L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public String j(long l) {
        return xa.b("s", (int)1379, (long)(0x1FCAEA870E35AB4EL ^ l));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x581;
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
                throw new RuntimeException("com/zelix/xa", exception);
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
            xa.c[n2] = xa.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xa.b(n, l);
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
            throw new RuntimeException("com/zelix/xa" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xa.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
