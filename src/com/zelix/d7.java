/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._p;
import com.zelix._u;
import com.zelix._x;
import com.zelix.ab;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.v8;
import com.zelix.xn;
import com.zelix.yf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class d7
extends xn {
    private static final long k;
    private static final String[] H;
    private static final String[] O;
    private static final Map Q;

    public d7(int n, String string, char c, int n2, v8 v82, _p _p2, _p _p3, _x _x2, _u _u2, _6 _62, yf yf2) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ k;
        long l2 = l ^ 0x4062519C2986L;
        super(string, v82, _p2, l2, _p3, _x2, _u2, _62, yf2);
    }

    public d7(String string, _u _u2, _6 _62, char c, yf yf2, char c2, int n) {
        long l = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ k;
        long l2 = l ^ 0x36FB0C5EFB18L;
        int n2 = (int)(l2 >>> 32);
        int n3 = (int)(l2 << 32 >>> 48);
        int n4 = (int)(l2 << 48 >>> 48);
        super(n2, string, (char)n3, _u2, _62, yf2, (short)n4);
    }

    public final void s(Object[] objectArray) {
        block4: {
            long l;
            List list;
            String string;
            long l2;
            String string2;
            block5: {
                string2 = (String)objectArray[0];
                l2 = (Long)objectArray[1];
                string = (String)objectArray[2];
                list = (List)objectArray[3];
                long l3 = l2;
                long l4 = l3 ^ 0x5D57E3DF30DCL;
                l = l3 ^ 0x66CF477D9327L;
                CallSite callSite = m44.a("k", (long)7372176884749954796L, (long)l2);
                try {
                    try {
                        if (callSite == null) break block4;
                        if (string != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)7015895298037684587L, (long)l2);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l4;
                    objectArray2[0] = string2;
                    throw new ab((String)((Object)d7.c("r", (int)12943, (long)(0x5D222FA11296FCA1L ^ l2))) + (String)((Object)m44.a("k", (Object)objectArray2, (long)7069471435243001748L, (long)l2)) + (String)((Object)d7.c("r", (int)6261, (long)(0x2D63A1A9755A565CL ^ l2))));
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)7015895298037684587L, (long)l2);
                }
            }
            Object[] objectArray3 = new Object[4];
            objectArray3[3] = l;
            objectArray3[2] = true;
            objectArray3[1] = string;
            objectArray3[0] = string2;
            list.add(m44.a("t", (Object)((Object)this), (Object)objectArray3, (long)7039753105076786999L, (long)l2));
        }
    }

    public final void v(Object[] objectArray) {
        String string;
        long l;
        Map map;
        String string2;
        long l2;
        String string3;
        block4: {
            block5: {
                string3 = (String)objectArray[0];
                l2 = (Long)objectArray[1];
                string2 = (String)objectArray[2];
                map = (Map)objectArray[3];
                Map map2 = (Map)objectArray[4];
                Map map3 = (Map)objectArray[5];
                ol ol2 = (ol)objectArray[6];
                long l3 = l2;
                long l4 = l3 ^ 0x78D8F8B65159L;
                l = l3 ^ 0x492393C58BBCL;
                CallSite callSite = m44.a("n", (long)561294493437169513L, (long)l2);
                try {
                    try {
                        string = string2;
                        if (callSite == null) break block4;
                        if (string != null) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)60888845515225326L, (long)l2);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l4;
                    objectArray2[0] = string3;
                    throw new ab((String)((Object)d7.c("r", (int)19519, (long)(0x222D53AAB146395L ^ l2))) + (String)((Object)m44.a("n", (Object)objectArray2, (long)260904624172004881L, (long)l2)) + (String)((Object)d7.c("r", (int)29132, (long)(0xEA3DA218492DE63L ^ l2))));
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)60888845515225326L, (long)l2);
                }
            }
            string = (String)((Object)d7.c("r", (int)27862, (long)(0x6CF7E753D9E0437BL ^ l2))) + (String)((Object)m44.a("p", (Object)((Object)this), (long)434156953500189698L, (long)l2)) + (String)((Object)d7.c("r", (int)23226, (long)(0x29BB1C004F437512L ^ l2))) + string2 + (String)((Object)d7.c("r", (int)1759, (long)(0x4FC6E50E1DC02971L ^ l2)));
        }
        String string4 = string;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = true;
        objectArray3[4] = string2;
        objectArray3[3] = string4;
        objectArray3[2] = l;
        objectArray3[1] = map;
        objectArray3[0] = string3;
        m44.a("q", (Object)((Object)this), (Object)objectArray3, (long)1817139738518539806L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                d7.k = prr.a((long)4486689700365434884L, (long)-7527421366516905668L, MethodHandles.lookup().lookupClass()).a(50780020431007L);
                d7.Q = new HashMap<K, V>(13);
                var0 = d7.k ^ 36041789462506L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "\u0014\u009b\u0097\u0007\u0083dw#\u0089*^\u00ba~M\u000b\u00b8\u0010@\u00c9\u00b1\u00a8 \u0096\u00f4SaH}\u00ad\u00b0\u00edl\u0012\u0010\u00cd\u008c\"\u008c#\u00d5\u0010&T\u00e4\u00ce\u00d6K\u0001\u00de\u00e0\u0018\nTi\u00bb\u00dc.\u00adkV^\u00fb\u009d\u00fe\u00b5mH\u001a\u0015D^4\u00b8\u00b5\u00ac@\u00ee\u0018\u00a1\u0096\u0005\u00fd\u00d6<\u00a1\u00f0#\u0006\u00fe\u0006%\u00a3\u0089\u00a7\u008f\u00f985L\u000b\u00e0fv[\u00a9+\u00d0H4\u00f8\u00dc\u007f\u0095\u00aco(#\u000e\u0011f\u00dciS(Dr\u0084Z\u00edG9\u00af\u0097\u00f5\u00ee\u0006K\u00ffP~";
                var8_6 = "\u0014\u009b\u0097\u0007\u0083dw#\u0089*^\u00ba~M\u000b\u00b8\u0010@\u00c9\u00b1\u00a8 \u0096\u00f4SaH}\u00ad\u00b0\u00edl\u0012\u0010\u00cd\u008c\"\u008c#\u00d5\u0010&T\u00e4\u00ce\u00d6K\u0001\u00de\u00e0\u0018\nTi\u00bb\u00dc.\u00adkV^\u00fb\u009d\u00fe\u00b5mH\u001a\u0015D^4\u00b8\u00b5\u00ac@\u00ee\u0018\u00a1\u0096\u0005\u00fd\u00d6<\u00a1\u00f0#\u0006\u00fe\u0006%\u00a3\u0089\u00a7\u008f\u00f985L\u000b\u00e0fv[\u00a9+\u00d0H4\u00f8\u00dc\u007f\u0095\u00aco(#\u000e\u0011f\u00dciS(Dr\u0084Z\u00edG9\u00af\u0097\u00f5\u00ee\u0006K\u00ffP~".length();
                var5_7 = 16;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = d7.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0080\u00ad\u00cc\u00ae\u001a\r\u00f1XK E\u0015\u00bc\u00f2[S\u001ef\u0094)Bw\u00e9zG\u00ee\u0001\u001b$x\u008f\u0096y\u00b2C[{\u00ef\u0007\u00ef\u00ce\u0011\u00cf5\u00b2\t\t\u000b6GpB\u00b8M>dt\u00eeQ\u00b8\u00161+\u0081\u0010\u00f8\bL\u00cf0\u00b3<\u0089\u000b\u00c8686\u00e1\u0013\n";
                    var8_6 = "\u0080\u00ad\u00cc\u00ae\u001a\r\u00f1XK E\u0015\u00bc\u00f2[S\u001ef\u0094)Bw\u00e9zG\u00ee\u0001\u001b$x\u008f\u0096y\u00b2C[{\u00ef\u0007\u00ef\u00ce\u0011\u00cf5\u00b2\t\t\u000b6GpB\u00b8M>dt\u00eeQ\u00b8\u00161+\u0081\u0010\u00f8\bL\u00cf0\u00b3<\u0089\u000b\u00c8686\u00e1\u0013\n".length();
                    var5_7 = 64;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = d7.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        d7.H = var9_3;
        d7.O = new String[7];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2227;
        if (O[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])Q.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    Q.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/d7", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = H[n2].getBytes("ISO-8859-1");
            d7.O[n2] = d7.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return O[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = d7.c(n, l);
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
            throw new RuntimeException("com/zelix/d7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d7.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
