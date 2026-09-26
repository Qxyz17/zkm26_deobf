/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dr;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lyn;
import com.zelix.m44;
import com.zelix.n9;
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

public class lyz
extends lyn {
    private dr R;
    public static String k;
    private static final long a;
    private static final String[] e;
    private static final String[] f;
    private static final Map g;

    public String N(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("n", (long)-2101521388167513159L, (long)l);
    }

    void J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x645B50050BD3L;
        long l3 = l2 >>> 16;
        int n = (int)(l2 << 48 >>> 48);
        m44.a("t", (Object)((Object)this), (long)-6492132841980108031L, (long)l).L(l3, (char)n, string, string2);
    }

    protected void m(Object[] objectArray) {
        lqu lqu2 = (lqu)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l2 = l;
        long l3 = l2 ^ 0x3E0224440141L;
        long l4 = l2 ^ 0x45A087D700B9L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("s", (Object)((Object)this), (long)-6615696013611638058L, (long)l);
        objectArray2[0] = l4;
        m44.a("r", (Object)lqu2, (Object)objectArray2, (long)-6877524383003342305L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = lyz.b("j", (int)8720, (long)(0x2002D526072C5ED2L ^ l));
        objectArray3[4] = n3;
        objectArray3[3] = n2;
        objectArray3[2] = l3;
        objectArray3[1] = n;
        objectArray3[0] = lqu2;
        m44.a("r", (Object)((Object)this), (Object)objectArray3, (long)-4778337559753001233L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)8245195253706422107L, (long)-5858729634415181418L, MethodHandles.lookup().lookupClass()).a(229545978114773L);
        long l = a ^ 0x32847E490FBBL;
        g = new HashMap(13);
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
        String string = "\u000f.\u00cdM_q\u00cf\u000e\u00d1%6\u00dd3\u0080\u0091\u0003\u00c6\u00f6\u00b6\u00aa\u00ee\u00d0\u0081\u001f@\u00a1H\u00e1\u00f3\u00ea\u0019\u00f1\u0084\u00aa\u00ab\u0089\u00e6WF\u00a3\u000f%\u0003N\u00b2\u0095\u00cf\u009bUhr\u00c41\u00fb4X>\fC\\\u00ab\u00c1\u00f9\u00d5_\u008aS\u00f4\u00ff \u00ac\u00db\u0091\u00e9M\u008c\u000f\u00fe\u00e7\u0014\u00d9\u00f9\u0095\u00e5N-\u001c{\u00c98u9R\u00d3\u00ce\u0019\n?\u00eet\u0011\u0092\u00cb\u0005\u0017\u009e\u0082\u00b8\u00ae\u0082\n\u0001\u00f1$\u00c7\u00f7\u000e-Vk\u00877\u0095\u00c0l)u\u0011\u001c\u0000\u00ed\u00c2D\u0080?U\u00d9\u00efQ\u00a0\u0018\u00c9{\u0014\u0014\u0005";
        int n2 = "\u000f.\u00cdM_q\u00cf\u000e\u00d1%6\u00dd3\u0080\u0091\u0003\u00c6\u00f6\u00b6\u00aa\u00ee\u00d0\u0081\u001f@\u00a1H\u00e1\u00f3\u00ea\u0019\u00f1\u0084\u00aa\u00ab\u0089\u00e6WF\u00a3\u000f%\u0003N\u00b2\u0095\u00cf\u009bUhr\u00c41\u00fb4X>\fC\\\u00ab\u00c1\u00f9\u00d5_\u008aS\u00f4\u00ff \u00ac\u00db\u0091\u00e9M\u008c\u000f\u00fe\u00e7\u0014\u00d9\u00f9\u0095\u00e5N-\u001c{\u00c98u9R\u00d3\u00ce\u0019\n?\u00eet\u0011\u0092\u00cb\u0005\u0017\u009e\u0082\u00b8\u00ae\u0082\n\u0001\u00f1$\u00c7\u00f7\u000e-Vk\u00877\u0095\u00c0l)u\u0011\u001c\u0000\u00ed\u00c2D\u0080?U\u00d9\u00efQ\u00a0\u0018\u00c9{\u0014\u0014\u0005".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lyz.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                e = stringArray;
                f = new String[3];
                m44.a("h", (String)((Object)lyz.b("j", (int)25910, (long)(0x12659113CDB4B9A8L ^ l))), (long)-8879812117810586200L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public void M(Object[] objectArray) {
        block6: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l = (Long)objectArray[2];
            long l2 = l;
            long l3 = l2 ^ 0x43EA633718BEL;
            long l4 = l2 ^ 0x1A86BD711C75L;
            long l5 = l2 ^ 0x408CF84350F9L;
            long l6 = l2 ^ 0x2C69CF006FB0L;
            long l7 = l2 ^ 0x3FF9F751C4D4L;
            long l8 = l2 ^ 0x7054207C23BL;
            long l9 = l2 ^ 0x47526B4E5A06L;
            long l10 = l2 ^ 0L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l6;
            CallSite callSite = m44.a("w", (Object)lqu2, (Object)objectArray2, (long)-6410373196425327712L, (long)l);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l3;
            CallSite callSite2 = m44.a("w", (Object)lqu2, (Object)objectArray3, (long)-5092376014320582940L, (long)l);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l5;
            CallSite callSite3 = m44.a("w", (Object)lqu2, (Object)objectArray4, (long)-5139488470093813520L, (long)l);
            CallSite callSite4 = m44.a("h", (long)-5113628074367501874L, (long)l);
            Object[] objectArray5 = new Object[1];
            objectArray5[0] = l7;
            CallSite callSite5 = m44.a("w", (Object)lqu2, (Object)objectArray5, (long)-6383658709572716098L, (long)l);
            Object[] objectArray6 = new Object[1];
            objectArray6[0] = l8;
            String string = (String)((Object)m44.a("h", (Object)objectArray6, (long)-4993879184610737390L, (long)l)) + (String)((Object)lyz.b("j", (int)7274, (long)(0x56536B877B07CDCL ^ l)));
            ((PrintWriter)((Object)callSite5)).println(string);
            m44.a("w", (Object)m44.a("l", (long)-5152858462491803297L, (long)l), (Object)string, (long)-6700734857671952105L, (long)l);
            Object[] objectArray7 = new Object[1];
            objectArray7[0] = l9;
            CallSite callSite6 = m44.a("w", (Object)((Object)this), (Object)objectArray7, (long)-4972914505230991179L, (long)l);
            int n = 0;
            block2: while (n < callSite6) {
                lmu lmu3 = this.V(n);
                try {
                    Object[] objectArray8 = new Object[3];
                    objectArray8[2] = l10;
                    objectArray8[1] = lqu2;
                    objectArray8[0] = this;
                    m44.a("w", (Object)lmu3, (Object)objectArray8, (long)-6656114929610942631L, (long)l);
                    ++n;
                    do {
                        CallSite callSite7 = callSite4;
                        if (l >= 0L) {
                            if (callSite7 == false) break block6;
                            callSite7 = callSite4;
                        }
                        if (callSite7 != false) continue block2;
                    } while (l <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-6541777814239789661L, (long)l);
                }
            }
            Object[] objectArray9 = new Object[5];
            objectArray9[4] = (int)callSite3;
            objectArray9[3] = (int)callSite2;
            objectArray9[2] = l4;
            objectArray9[1] = (int)callSite;
            objectArray9[0] = lqu2;
            m44.a("w", (Object)((Object)this), (Object)objectArray9, (long)-6535305004172108980L, (long)l);
        }
    }

    public lyz(int n, long l) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x1358CAF3DD84L;
        long l4 = l2 ^ 0x5AD62FFFCE3CL;
        super(l4, n);
        m44.a("p", (Object)((Object)this), (dr)new dr(l3), (long)2346701684450879095L, (long)l);
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5520;
        if (f[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lyz", exception);
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
            lyz.f[n2] = lyz.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lyz.b(n, l);
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
            throw new RuntimeException("com/zelix/lyz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lyz.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
