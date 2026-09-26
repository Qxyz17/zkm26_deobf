/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.kw;
import com.zelix.l6q;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.mn;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.zr;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bb
extends kw
implements ni {
    private byte[] D;
    private static final long a = prr.a(8349381281862209400L, -2709738509347432923L, MethodHandles.lookup().lookupClass()).a(150016163343505L);
    private static final String[] c;
    private static final String[] d;
    private static final Map g;
    private static final long h;

    @Override
    protected void N(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        Map map = (Map)objectArray[1];
        long l10 = (Long)objectArray[2];
        lqu lqu2 = (lqu)objectArray[3];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = lqu2;
        objectArray2[2] = l11;
        objectArray2[1] = map;
        objectArray2[0] = dataOutputStream;
        super.N(objectArray2);
        dataOutputStream.write((byte[])m44.a("u", (Object)this, (long)834244156778903412L, (long)l10));
    }

    bb(_4 _42, long l10, int n10, String string, h1 h12, l6q l6q2) {
        long l11 = (l10 = a ^ l10) ^ 0x56C56C1BAAABL;
        super(_42, n10, string, l11, h12, l6q2);
        m44.a("s", (Object)this, (byte[])new byte[this.W], (long)-3332708353010979496L, (long)l10);
        h12.read((byte[])m44.a("q", (Object)this, (long)-3332708353010979496L, (long)l10));
    }

    @Override
    int g(int n10, byte by2, int n11) {
        long l10 = (long)n10 << 32 | (long)by2 << 56 >>> 32 | (long)n11 << 40 >>> 40;
        return ((CallSite)m44.a("p", (Object)this, (long)-2058430744055013495L, (long)l10)).length;
    }

    @Override
    void z(gu gu2, long l10) {
        long l11 = l10 ^ 0x66FDF08525FDL;
        gu2.K(this.b, this, l11, this.H());
    }

    @Override
    protected void c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[1];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = dataOutputStream;
        objectArray2[0] = l11;
        super.c(objectArray2);
        dataOutputStream.write((byte[])m44.a("w", (Object)this, (long)1527261686630148566L, (long)l10));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    void W(Object[] var1_1) {
        block57: {
            block61: {
                block59: {
                    block58: {
                        block55: {
                            var4_2 = (Long)var1_1[0];
                            var3_3 = (Integer)var1_1[1];
                            var7_4 = (Integer)var1_1[2];
                            var2_5 = (HashMap)var1_1[3];
                            var6_6 = (HashMap)var1_1[4];
                            v0 = var4_2;
                            var8_7 = v0 ^ 66758579357032L;
                            var10_8 = v0 ^ 133293470509379L;
                            var12_9 = v0 ^ 82990087713935L;
                            var15_10 = new String((byte[])m44.a("p", (Object)this, (long)8540722083002714721L, (long)var4_2));
                            var14_11 = m44.a("n", (long)8223466915102598904L, (long)var4_2);
                            try {
                                block56: {
                                    try {
                                        try {
                                            try {
                                                v1 /* !! */  = m44.a("j", (long)8348240883320960254L, (long)var4_2);
                                                if (var14_11 != false) break block55;
                                                if (v1 /* !! */  != false) break block56;
                                            }
                                            catch (n9 v2) {
                                                throw m44.a("n", (Object)v2, (long)8217861176532116856L, (long)var4_2);
                                            }
                                            v1 /* !! */  = m44.a("j", (long)7575002561443398272L, (long)var4_2);
                                            v3 /* !! */  = var14_11;
                                            if (var4_2 > 0L) {
                                                if (v3 /* !! */  != false) break block55;
                                            }
                                            ** GOTO lbl45
                                        }
                                        catch (n9 v4) {
                                            throw m44.a("n", (Object)v4, (long)8217861176532116856L, (long)var4_2);
                                        }
                                        if (v1 /* !! */  == false) break block57;
                                    }
                                    catch (n9 v5) {
                                        throw m44.a("n", (Object)v5, (long)8217861176532116856L, (long)var4_2);
                                    }
                                }
                                v1 /* !! */  = (CallSite)var15_10.startsWith((String)bb.b("d", (int)5783, (long)(3750168688531266270L ^ var4_2)));
                            }
                            catch (n9 v6) {
                                throw m44.a("n", (Object)v6, (long)8217861176532116856L, (long)var4_2);
                            }
                        }
                        try {
                            try {
                                v3 /* !! */  = var14_11;
lbl45:
                                // 2 sources

                                if (var4_2 >= 0L) {
                                    if (v3 /* !! */  != false) break block58;
                                    if (v1 /* !! */  == false) break block57;
                                }
                                ** GOTO lbl60
                            }
                            catch (n9 v7) {
                                throw m44.a("n", (Object)v7, (long)8217861176532116856L, (long)var4_2);
                            }
                            v1 /* !! */  = (CallSite)var15_10.indexOf((String)bb.b("d", (int)15260, (long)(4599205666552575956L ^ var4_2)));
                        }
                        catch (n9 v8) {
                            throw m44.a("n", (Object)v8, (long)8217861176532116856L, (long)var4_2);
                        }
                    }
                    try {
                        try {
                            v3 /* !! */  = var14_11;
lbl60:
                            // 2 sources

                            if (var4_2 > 0L) {
                                if (v3 /* !! */  != false) break block59;
                                v3 /* !! */  = (CallSite)-1;
                            }
                            if (v1 /* !! */  <= v3 /* !! */ ) break block57;
                        }
                        catch (n9 v9) {
                            throw m44.a("n", (Object)v9, (long)8217861176532116856L, (long)var4_2);
                        }
                        v1 /* !! */  = (CallSite)false;
                    }
                    catch (n9 v10) {
                        throw m44.a("n", (Object)v10, (long)8217861176532116856L, (long)var4_2);
                    }
                }
                var16_12 /* !! */  = v1 /* !! */ ;
                var17_13 = new StringBuilder();
                var18_14 = new StringTokenizer(var15_10, "\n");
                var19_15 = new zr();
                while (var18_14.hasMoreTokens()) {
                    block68: {
                        block69: {
                            block67: {
                                block66: {
                                    block64: {
                                        block65: {
                                            block63: {
                                                block60: {
                                                    var20_16 = var18_14.nextToken();
                                                    var21_17 = null;
                                                    try {
                                                        block62: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            var19_15.I(false);
                                                                            v11 = var20_16;
                                                                            v12 = var14_11;
                                                                            if (var4_2 > 0L) {
                                                                                if (v12 != false) break block60;
                                                                                v12 = (int)bb.h;
                                                                            }
                                                                            v13 /* !! */  = (CallSite)mn.V(var12_9, (String)v11, (char)v12);
                                                                            if (var4_2 < 0L || var14_11 != false) break block61;
                                                                        }
                                                                        catch (n9 v14) {
                                                                            throw m44.a("n", (Object)v14, (long)8217861176532116856L, (long)var4_2);
                                                                        }
                                                                        if (v13 /* !! */  >= true) break block62;
                                                                    }
                                                                    catch (n9 v15) {
                                                                        throw m44.a("n", (Object)v15, (long)8217861176532116856L, (long)var4_2);
                                                                    }
                                                                    v11 = this.h(var8_7);
                                                                    if (var14_11 != false) break block60;
                                                                }
                                                                catch (n9 v16) {
                                                                    throw m44.a("n", (Object)v16, (long)8217861176532116856L, (long)var4_2);
                                                                }
                                                                if (!v11.equals(var20_16)) break block63;
                                                            }
                                                            catch (n9 v17) {
                                                                throw m44.a("n", (Object)v17, (long)8217861176532116856L, (long)var4_2);
                                                            }
                                                        }
                                                        v18 = new Object[4];
                                                        v18[3] = var10_8;
                                                        v18[2] = var19_15;
                                                        v18[1] = var6_6;
                                                        v18[0] = var20_16;
                                                        v11 = m44.a("n", (Object)v18, (long)7503792819790195400L, (long)var4_2);
                                                    }
                                                    catch (n9 v19) {
                                                        throw m44.a("n", (Object)v19, (long)8217861176532116856L, (long)var4_2);
                                                    }
                                                }
                                                var21_17 = v11;
                                            }
                                            try {
                                                try {
                                                    v20 = var17_13.length();
                                                    if (var4_2 <= 0L || var14_11 != false) break block64;
                                                    if (v20 <= 0) break block65;
                                                }
                                                catch (n9 v21) {
                                                    throw m44.a("n", (Object)v21, (long)8217861176532116856L, (long)var4_2);
                                                }
                                                var17_13.append("\n");
                                            }
                                            catch (n9 v22) {
                                                throw m44.a("n", (Object)v22, (long)8217861176532116856L, (long)var4_2);
                                            }
                                        }
                                        v20 = (int)var19_15.S();
                                    }
                                    try {
                                        try {
                                            if (v20 != 0) {
                                                v23 = var21_17;
                                                if (var4_2 <= 0L || var14_11 != false) break block66;
                                            }
                                            ** GOTO lbl173
                                        }
                                        catch (n9 v24) {
                                            throw m44.a("n", (Object)v24, (long)8217861176532116856L, (long)var4_2);
                                        }
                                        if (v23 != null) {
                                        }
                                        ** GOTO lbl173
                                    }
                                    catch (n9 v25) {
                                        throw m44.a("n", (Object)v25, (long)8217861176532116856L, (long)var4_2);
                                    }
                                    v23 = var21_17;
                                }
                                try {
                                    v26 /* !! */  = (CallSite)v23.equals(var20_16);
                                    if (var4_2 < 0L) ** GOTO lbl171
                                    if (var14_11 != false) break block67;
                                    if (v26 /* !! */  == false) {
                                    }
                                    ** GOTO lbl173
                                }
                                catch (n9 v27) {
                                    throw m44.a("n", (Object)v27, (long)8217861176532116856L, (long)var4_2);
                                }
                                v28 = true;
                            }
                            var16_12 /* !! */  = v28;
                            try {
                                var17_13.append(var21_17);
                                v26 /* !! */  = var14_11;
lbl171:
                                // 2 sources

                                if (var4_2 <= 0L) break block68;
                                if (v26 /* !! */  == false) break block69;
lbl173:
                                // 4 sources

                                var17_13.append(var20_16);
                            }
                            catch (n9 v29) {
                                throw m44.a("n", (Object)v29, (long)8217861176532116856L, (long)var4_2);
                            }
                        }
                        v26 /* !! */  = var14_11;
                    }
                    if (v26 /* !! */  == false) continue;
                }
                if (var4_2 <= 0L) break block57;
                v13 /* !! */  = var16_12 /* !! */ ;
            }
            try {
                if (v13 /* !! */  != false) {
                    m44.a("r", (Object)this, (byte[])m44.a("q", var17_13.toString(), (long)7720739123045976691L, (long)var4_2), (long)8540722083002714721L, (long)var4_2);
                }
            }
            catch (n9 v30) {
                throw m44.a("n", (Object)v30, (long)8217861176532116856L, (long)var4_2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l10 = a ^ 0x21530A126963L;
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
        String string = "\u00bcCB\u00b3\u001d\u00f2\u000f\u00c9\u00c0\u00d0\u0091\u007f\u00e4JMH\u0010fx\u00a0\u009c\u00e2e\u00ebR\u00f6\u00d3\u00b0\u00f1t\u00c6\u00ea\u00b1";
        int n11 = "\u00bcCB\u00b3\u001d\u00f2\u000f\u00c9\u00c0\u00d0\u0091\u007f\u00e4JMH\u0010fx\u00a0\u009c\u00e2e\u00ebR\u00f6\u00d3\u00b0\u00f1t\u00c6\u00ea\u00b1".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = bb.c(byArray3).intern();
            if ((n13 += n12) >= n11) break;
            n12 = string.charAt(n13);
        }
        c = stringArray;
        d = new String[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n15 = 1;
        while (true) {
            if (n15 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = -5310213240597101404L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                h = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n15] = (byte)(l10 << n15 * 8 >>> 56);
            ++n15;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3510;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/bb", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            bb.d[n11] = bb.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = bb.b(n10, l10);
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
            throw new RuntimeException("com/zelix/bb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

