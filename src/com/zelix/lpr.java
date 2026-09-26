/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lpm;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.prr;
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

public class lpr
extends lpm {
    private static final long a = prr.a((long)-8893790954289791261L, (long)-3603654389491830141L, MethodHandles.lookup().lookupClass()).a(225241795931578L);
    private static final String[] k;
    private static final String[] n;
    private static final Map o;

    public lpr(long l, int n) {
        long l2 = (l = a ^ l) ^ 0x364B16CAFB89L;
        super(n, l2);
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3E0224440141L;
        long l4 = l2 ^ 0x42CD8FF92DA7L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = this;
        objectArray2[0] = l4;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-4917933148608194315L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lpr.b("m", (int)4239, (long)(0x565C529523E01FDL ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    protected void l(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x6DF7BA9051C2L;
        long l4 = l2 ^ 0x550B0FC6572DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = m44.a("q", (Object)lqu2, (Object)objectArray2, (long)3638594277050117288L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        String string = (String)((Object)m44.a("n", (Object)objectArray3, (long)3433008837598041604L, (long)l)) + (String)((Object)lpr.b("m", (int)27049, (long)(0x6539B862F6E3F1BBL ^ l)));
        ((PrintWriter)((Object)callSite)).println(string);
        m44.a("q", (Object)m44.a("j", (long)3272723340129604681L, (long)l), (Object)string, (long)3896853000951639041L, (long)l);
    }

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return lpr.b("m", (int)31023, (long)(0x149F2C780D03AE10L ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new HashMap(13);
        long l = a ^ 0x31F91ACD2021L;
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
        String string = "4:\u00c5\u001d\u0095p\u00ca\u0003G\u00d0\u0099\u00a0\u00f4\u0018\u00a3\u00c2\u000e~\u00a4\u00d8\u00a4P;\u00aa\u00a5bBMyi\u00e7\u00ae\u0000R'\u00b3\u00db\u00d9\u00cc\u0005Bd\u00faz\u001fJ\u00c7\u00acH\u00a8\u00f1CX\u00e1a/\u009b\"\u00e8\u00c1\u00ebM\u00e9\u00b70\u00c6\u00adV\u00de\u0081\t\u00d9\u00feM\u0000D\u00db\u00d0i\u0013\u00f9\u0085\u001b\u00feY\u0082\u00d2\u00f8[\u008c\u00a7\u00dfl\u008c\u00ef\u009fZ\u000e\u00b4\u00e4\u00a6\u00d1^0G\u00ed\u00ff@\u00b7\u00b0\u008e\u009f\u00d03\u00e0[\u008d\u00d8f\u00d6\u008c\u0018\u00eb\u00cf\u00b7P\u00edL<M7C\u00fe\u0093\u00b7\u00d1\u001az\u00ee\u00cf,o?\u00b6\u0098\u001a";
        int n2 = "4:\u00c5\u001d\u0095p\u00ca\u0003G\u00d0\u0099\u00a0\u00f4\u0018\u00a3\u00c2\u000e~\u00a4\u00d8\u00a4P;\u00aa\u00a5bBMyi\u00e7\u00ae\u0000R'\u00b3\u00db\u00d9\u00cc\u0005Bd\u00faz\u001fJ\u00c7\u00acH\u00a8\u00f1CX\u00e1a/\u009b\"\u00e8\u00c1\u00ebM\u00e9\u00b70\u00c6\u00adV\u00de\u0081\t\u00d9\u00feM\u0000D\u00db\u00d0i\u0013\u00f9\u0085\u001b\u00feY\u0082\u00d2\u00f8[\u008c\u00a7\u00dfl\u008c\u00ef\u009fZ\u000e\u00b4\u00e4\u00a6\u00d1^0G\u00ed\u00ff@\u00b7\u00b0\u008e\u009f\u00d03\u00e0[\u008d\u00d8f\u00d6\u008c\u0018\u00eb\u00cf\u00b7P\u00edL<M7C\u00fe\u0093\u00b7\u00d1\u001az\u00ee\u00cf,o?\u00b6\u0098\u001a".length();
        int n3 = 48;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lpr.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                k = stringArray;
                lpr.n = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3892;
        if (lpr.n[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])o.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lpr", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n2].getBytes("ISO-8859-1");
            lpr.n[n2] = lpr.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return lpr.n[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lpr.b(n, l);
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
            throw new RuntimeException("com/zelix/lpr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lpr.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
