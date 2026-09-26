/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.aw;
import com.zelix.h1;
import com.zelix.j0;
import com.zelix.j5;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import com.zelix.xb;
import java.io.PrintWriter;
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

public class jh
extends j0 {
    static final va D;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public va A(long l) {
        return m44.a("i", (long)-6260711240443997254L, (long)l);
    }

    public j5 w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l6q l6q2 = (l6q)objectArray[1];
        l6q l6q3 = (l6q)objectArray[2];
        l6q l6q4 = (l6q)objectArray[3];
        l6q l6q5 = (l6q)objectArray[4];
        PrintWriter printWriter = (PrintWriter)objectArray[5];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x35511050A35DL;
        long l4 = l2 ^ 0x3CC9D5D4DEF0L;
        int n = (int)(l4 >>> 56);
        long l5 = l4 << 8 >>> 8;
        long l6 = l2 ^ 0xA5EB9871E10L;
        long l7 = l2 ^ 0x783CD66E36CFL;
        long l8 = l2 ^ 0xA5EB9871E10L;
        long l9 = l2 ^ 0x580BDF79B5CDL;
        long l10 = l2 ^ 0x5507BA12C61AL;
        CallSite callSite = m44.a("m", (long)-5788821583079618227L, (long)l);
        try {
            j5 j52;
            block10: {
                l6q l6q6;
                js js2;
                block9: {
                    boolean bl;
                    block7: {
                        block8: {
                            js2 = this.l.m(l3, (int)m44.a("s", (Object)((Object)this), (long)-5288124149774407697L, (long)l));
                            try {
                                bl = js2.G();
                                if (callSite != false) break block7;
                                if (!bl) break block8;
                            }
                            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                throw m44.a("m", (Object)arrayIndexOutOfBoundsException, (long)-5301363123065969164L, (long)l);
                            }
                            return null;
                        }
                        bl = js2 instanceof xb;
                    }
                    if (!bl) {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l7;
                        objectArray2[0] = js2.A(l6);
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l7;
                        objectArray3[0] = m44.a("r", (Object)((Object)this), (long)l8, (long)-6275737325126838280L, (long)l);
                        String string = this.l.I((byte)n, l5) + (String)((Object)jh.b("u", (int)5169, (long)(0x53DBF3886698A53EL ^ l))) + (String)((Object)jh.b("u", (int)9799, (long)(0x700DE96B697B1749L ^ l))) + (String)((Object)jh.b("u", (int)26472, (long)(0x4771A433149D661L ^ l))) + (int)m44.a("s", (Object)((Object)this), (long)-5288124149774407697L, (long)l) + (String)((Object)jh.b("u", (int)26472, (long)(0x4771A433149D661L ^ l))) + (String)((Object)m44.a("m", (Object)objectArray2, (long)-5818556279607732492L, (long)l)) + (String)((Object)jh.b("u", (int)26472, (long)(0x4771A433149D661L ^ l))) + (String)((Object)m44.a("m", (Object)objectArray3, (long)-5818556279607732492L, (long)l)) + (String)((Object)jh.b("u", (int)30700, (long)(0x3AEE39E297C946E7L ^ l))) + this.E();
                        throw new aw(string);
                    }
                    j52 = new j5(this.E(), this.l, (int)m44.a("s", (Object)((Object)this), (long)-5701848089611525745L, (long)l), l9, (xb)js2);
                    try {
                        l6q6 = l6q3;
                        if (callSite != false) break block9;
                        if (l6q6 == null) break block10;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw m44.a("m", (Object)arrayIndexOutOfBoundsException, (long)-5301363123065969164L, (long)l);
                    }
                    l6q6 = l6q3;
                }
                l6q6.t((Object)((xb)js2), (Object)j52, l10);
            }
            return j52;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l7;
            objectArray4[0] = m44.a("r", (Object)((Object)this), (long)l8, (long)-6275737325126838280L, (long)l);
            String string = this.l.I((byte)n, l5) + (String)((Object)jh.b("u", (int)26472, (long)(0x4771A433149D661L ^ l))) + (String)((Object)jh.b("u", (int)17790, (long)(0x1C16DD0B6CFDF476L ^ l))) + (String)((Object)jh.b("u", (int)26472, (long)(0x4771A433149D661L ^ l))) + (String)((Object)m44.a("r", (Object)arrayIndexOutOfBoundsException, (long)-5949071079019717481L, (long)l)) + (String)((Object)jh.b("u", (int)26472, (long)(0x4771A433149D661L ^ l))) + (String)((Object)m44.a("m", (Object)objectArray4, (long)-5818556279607732492L, (long)l)) + (String)((Object)jh.b("u", (int)19628, (long)(0x76AF174D80B7FDA6L ^ l)));
            throw new aw(string);
        }
    }

    public js i(l6q l6q2, l6q l6q3, l6q l6q4, l6q l6q5, long l, PrintWriter printWriter) {
        long l2 = l ^ 0x4466AA9787E2L;
        Object[] objectArray = new Object[6];
        objectArray[5] = printWriter;
        objectArray[4] = l6q5;
        objectArray[3] = l6q4;
        objectArray[2] = l6q3;
        objectArray[1] = l6q2;
        objectArray[0] = l2;
        return m44.a("w", (Object)((Object)this), (Object)objectArray, (long)46814837574726866L, (long)l);
    }

    public jh(int n, h1 h12, to to2) {
        super(n, h12, to2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                jh.a = prr.a((long)-8156590521081584281L, (long)-7455511102490870148L, MethodHandles.lookup().lookupClass()).a(28253981786443L);
                var9 = jh.a ^ 52170285602183L;
                jh.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[6];
                var5_4 = 0;
                var4_5 = "\u00b6\u000b\u00d7|iy\u0010=\u00f1\u00b9\u00a4\u00eb@ 7\u00a0\u0018OX\u00da\u00b9@\u00f9\u00d9\u00d4\fnE\u00c1\u00da\u00ff\u0012\u0088\u00f9q(HW\u00a2\u00e3Z@\u0090\u0011\u00c4&!P\u001f]\u00aa\u00a4\u0097\u00f6;\u0085\u008eC\u0007J0+$\u0002\u00beH\u00e6\u00d4\u0082\u00d5d4v\u00eai\u00e3\u000b\u00dc\b\u0010\u0087\u00cdF\u00f7W\u0010\\\u00ee,\u00e9\u0010\u0010u\u00e4H\tk\u00db\u00cc\u00d3\u00f5\u00fe\u0007\u00d9\u001a\u00f0\u0010\u00103-\u00d8\u00c5#\u008b9\u00c9\u00ba\u00ad\u0006\u00f9:O~";
                var6_6 = "\u00b6\u000b\u00d7|iy\u0010=\u00f1\u00b9\u00a4\u00eb@ 7\u00a0\u0018OX\u00da\u00b9@\u00f9\u00d9\u00d4\fnE\u00c1\u00da\u00ff\u0012\u0088\u00f9q(HW\u00a2\u00e3Z@\u0090\u0011\u00c4&!P\u001f]\u00aa\u00a4\u0097\u00f6;\u0085\u008eC\u0007J0+$\u0002\u00beH\u00e6\u00d4\u0082\u00d5d4v\u00eai\u00e3\u000b\u00dc\b\u0010\u0087\u00cdF\u00f7W\u0010\\\u00ee,\u00e9\u0010\u0010u\u00e4H\tk\u00db\u00cc\u00d3\u00f5\u00fe\u0007\u00d9\u001a\u00f0\u0010\u00103-\u00d8\u00c5#\u008b9\u00c9\u00ba\u00ad\u0006\u00f9:O~".length();
                var3_7 = 16;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = jh.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "*\u009d\u00d7\u00da\u0003\u0089\u00fd\u0091\u00b517\u00bb\u00a2G\u00e2\u0091+9\u00e3Y]\u00be\\\u0015\u00e3\u00dc2;y;\u00d1sV\u00e7\u009c\u0087\u00c7\u00c6\u00bf;[\u00f7\u00cd\u00aeYo8\u00e9\u00db\u0013\u001f\u00c9\u0012\u00f7\u0010$\u00d4%\u001c NaI\u00d1\u008f\u00c4\u009e\u00b4\u0084i\u00ae5\u0010\u00c3JYh@=\u0091\u00f6\u00ef\u00bc{r\u00c4q\u00ce7";
                    var6_6 = "*\u009d\u00d7\u00da\u0003\u0089\u00fd\u0091\u00b517\u00bb\u00a2G\u00e2\u0091+9\u00e3Y]\u00be\\\u0015\u00e3\u00dc2;y;\u00d1sV\u00e7\u009c\u0087\u00c7\u00c6\u00bf;[\u00f7\u00cd\u00aeYo8\u00e9\u00db\u0013\u001f\u00c9\u0012\u00f7\u0010$\u00d4%\u001c NaI\u00d1\u008f\u00c4\u009e\u00b4\u0084i\u00ae5\u0010\u00c3JYh@=\u0091\u00f6\u00ef\u00bc{r\u00c4q\u00ce7".length();
                    var3_7 = 72;
                    var2_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = jh.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        jh.b = var7_3;
        jh.c = new String[6];
        jh.D = m44.a("k", (long)8349533478513470775L, (long)var9);
    }

    private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return arrayIndexOutOfBoundsException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA18;
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
                throw new RuntimeException("com/zelix/jh", exception);
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
            jh.c[n2] = jh.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = jh.b(n, l);
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
            throw new RuntimeException("com/zelix/jh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(jh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
