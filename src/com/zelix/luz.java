/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
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

public class luz {
    private final boolean N;
    private final String B;
    private final String D;
    private final boolean H;
    private final boolean x;
    private String b;
    private final String Y;
    private static final long a = prr.a((long)-6532170898996907435L, (long)-5085382741669106104L, MethodHandles.lookup().lookupClass()).a(212566845335560L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long f;

    luz(String string, long l, String string2) {
        long l2 = (l = a ^ l) ^ 0x2F860B73025BL;
        this(string, string2, l2, false, null, null, false, false);
    }

    luz(String string, String string2, long l, boolean bl, String string3, String string4, boolean bl2, boolean bl3) {
        l = a ^ l;
        this.B = string;
        this.D = string2;
        this.Y = string3;
        this.H = bl2;
        m44.a("v", (Object)this, (String)string4, (long)4743616424839628709L, (long)l);
        this.x = bl;
        this.N = bl3;
    }

    public boolean m(Object[] objectArray) {
        boolean bl;
        long l = (Long)objectArray[0];
        l = a ^ l;
        try {
            bl = m44.a("w", (Object)this, (long)4557559998930551176L, (long)l) != null;
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)((Object)n92), (long)2602044098516978265L, (long)l);
        }
        return bl;
    }

    public String j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("q", (Object)this, (long)-7860232215752238983L, (long)l);
    }

    luz(long l, String string) {
        long l2 = (l = a ^ l) ^ 0x3F5908EFE84CL;
        this(string, "", l2, false, null, null, false, false);
    }

    public String I(Object[] objectArray) {
        luz luz2;
        long l;
        block4: {
            block5: {
                l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("o", (long)-5178204667098226579L, (long)l);
                try {
                    try {
                        luz2 = this;
                        if (callSite != null) break block4;
                        if (m44.a("q", (Object)luz2, (long)-5059750774053952851L, (long)l) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-6802009163308527649L, (long)l);
                    }
                    return luz.a("f", (int)25894, (long)(0xF4F393155397691L ^ l));
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)-6802009163308527649L, (long)l);
                }
            }
            luz2 = this;
        }
        return m44.a("q", (Object)luz2, (long)-6401156281497637447L, (long)l);
    }

    public int hashCode() {
        Object object;
        block6: {
            int n;
            block7: {
                luz luz2;
                CallSite callSite;
                long l;
                block4: {
                    block5: {
                        l = a ^ 0x545E8954CADDL;
                        n = ((String)((Object)m44.a("r", (Object)this, (long)4738622388535684336L, (long)l))).hashCode() ^ ((String)((Object)m44.a("r", (Object)this, (long)4961240730221170250L, (long)l))).hashCode();
                        callSite = m44.a("l", (long)6615799003161150366L, (long)l);
                        try {
                            luz2 = this;
                            if (callSite != null) break block4;
                            if (m44.a("r", (Object)luz2, (long)6434189369344092157L, (long)l) == null) break block5;
                        }
                        catch (n9 n92) {
                            throw m44.a("l", (Object)((Object)n92), (long)4785409792146533420L, (long)l);
                        }
                        n ^= ((String)((Object)m44.a("r", (Object)this, (long)6434189369344092157L, (long)l))).hashCode();
                    }
                    luz2 = this;
                }
                try {
                    object = m44.a("r", (Object)luz2, (long)6501930214658621790L, (long)l);
                    if (callSite != null) break block6;
                    if (object == false) break block7;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)4785409792146533420L, (long)l);
                }
                n ^= ((String)((Object)luz.a("f", (int)22980, (long)(0x37B2AD24295A981L ^ l)))).hashCode();
            }
            object = n;
        }
        return (int)object;
    }

    String w(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        long l2 = (l << 16 | (long)n << 48 >>> 48) ^ a;
        return m44.a("t", (Object)this, (long)7044987269971011509L, (long)l2);
    }

    public String F(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("s", (Object)this, (long)-2388034863208041495L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean equals(Object var1_1) {
        block65: {
            block51: {
                block55: {
                    block63: {
                        block64: {
                            block62: {
                                block61: {
                                    block58: {
                                        block59: {
                                            block56: {
                                                block54: {
                                                    block52: {
                                                        var2_2 = luz.a ^ 134569779879369L;
                                                        var4_3 = m44.a("h", (long)-3691786103427935094L, (long)var2_2);
                                                        try {
                                                            v0 = var1_1 instanceof luz;
                                                            if (var4_3 != null) break block51;
                                                            if (v0) {
                                                            }
                                                            ** GOTO lbl155
                                                        }
                                                        catch (n9 v1) {
                                                            throw m44.a("h", (Object)v1, (long)-3063258192123757768L, (long)var2_2);
                                                        }
                                                        var6_4 = (luz)var1_1;
                                                        try {
                                                            block53: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v2 = m44.a("v", (Object)this, (long)-2965943844046603292L, (long)var2_2).equals(m44.a("v", (Object)var6_4, (long)-2965943844046603292L, (long)var2_2));
                                                                            if (var4_3 != null) break block52;
                                                                            if (!v2) break block53;
                                                                        }
                                                                        catch (n9 v3) {
                                                                            throw m44.a("h", (Object)v3, (long)-3063258192123757768L, (long)var2_2);
                                                                        }
                                                                        v4 = m44.a("v", (Object)this, (long)-3184625384390796962L, (long)var2_2);
                                                                        if (var4_3 != null) break block54;
                                                                    }
                                                                    catch (n9 v5) {
                                                                        throw m44.a("h", (Object)v5, (long)-3063258192123757768L, (long)var2_2);
                                                                    }
                                                                    if (!v4.equals(m44.a("v", (Object)var6_4, (long)-3184625384390796962L, (long)var2_2))) {
                                                                    }
                                                                    ** GOTO lbl41
                                                                }
                                                                catch (n9 v6) {
                                                                    throw m44.a("h", (Object)v6, (long)-3063258192123757768L, (long)var2_2);
                                                                }
                                                            }
                                                            v2 = false;
                                                        }
                                                        catch (n9 v7) {
                                                            throw m44.a("h", (Object)v7, (long)-3063258192123757768L, (long)var2_2);
                                                        }
                                                    }
                                                    var5_5 /* !! */  = v2;
                                                    try {
                                                        if (var4_3 == null) break block55;
lbl41:
                                                        // 2 sources

                                                        v4 = m44.a("v", (Object)this, (long)-3576144968221134615L, (long)var2_2);
                                                    }
                                                    catch (n9 v8) {
                                                        throw m44.a("h", (Object)v8, (long)-3063258192123757768L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    block57: {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var4_3 != null) break block56;
                                                                    if (v4 == null) break block57;
                                                                }
                                                                catch (n9 v9) {
                                                                    throw m44.a("h", (Object)v9, (long)-3063258192123757768L, (long)var2_2);
                                                                }
                                                                v4 = m44.a("v", (Object)var6_4, (long)-3576144968221134615L, (long)var2_2);
                                                                if (var4_3 != null) break block56;
                                                            }
                                                            catch (n9 v10) {
                                                                throw m44.a("h", (Object)v10, (long)-3063258192123757768L, (long)var2_2);
                                                            }
                                                            if (v4 == null) break block58;
                                                        }
                                                        catch (n9 v11) {
                                                            throw m44.a("h", (Object)v11, (long)-3063258192123757768L, (long)var2_2);
                                                        }
                                                    }
                                                    v4 = m44.a("v", (Object)this, (long)-3576144968221134615L, (long)var2_2);
                                                }
                                                catch (n9 v12) {
                                                    throw m44.a("h", (Object)v12, (long)-3063258192123757768L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                try {
                                                    block60: {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var4_3 != null) break block59;
                                                                    if (v4 != null) break block60;
                                                                }
                                                                catch (n9 v13) {
                                                                    throw m44.a("h", (Object)v13, (long)-3063258192123757768L, (long)var2_2);
                                                                }
                                                                v4 = m44.a("v", (Object)var6_4, (long)-3576144968221134615L, (long)var2_2);
                                                                if (var4_3 != null) break block59;
                                                            }
                                                            catch (n9 v14) {
                                                                throw m44.a("h", (Object)v14, (long)-3063258192123757768L, (long)var2_2);
                                                            }
                                                            if (v4 != null) break block58;
                                                        }
                                                        catch (n9 v15) {
                                                            throw m44.a("h", (Object)v15, (long)-3063258192123757768L, (long)var2_2);
                                                        }
                                                    }
                                                    v16 = this;
                                                    if (var4_3 != null) break block61;
                                                }
                                                catch (n9 v17) {
                                                    throw m44.a("h", (Object)v17, (long)-3063258192123757768L, (long)var2_2);
                                                }
                                                v4 = m44.a("v", (Object)v16, (long)-3576144968221134615L, (long)var2_2);
                                            }
                                            catch (n9 v18) {
                                                throw m44.a("h", (Object)v18, (long)-3063258192123757768L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (v4 != null) {
                                                            v16 = var6_4;
                                                            if (var4_3 != null) break block61;
                                                        }
                                                        ** GOTO lbl130
                                                    }
                                                    catch (n9 v19) {
                                                        throw m44.a("h", (Object)v19, (long)-3063258192123757768L, (long)var2_2);
                                                    }
                                                    if (m44.a("v", (Object)v16, (long)-3576144968221134615L, (long)var2_2) != null) {
                                                    }
                                                    ** GOTO lbl130
                                                }
                                                catch (n9 v20) {
                                                    throw m44.a("h", (Object)v20, (long)-3063258192123757768L, (long)var2_2);
                                                }
                                                v21 /* !! */  = (CallSite)m44.a("v", (Object)this, (long)-3576144968221134615L, (long)var2_2).equals(m44.a("v", (Object)var6_4, (long)-3576144968221134615L, (long)var2_2));
                                                if (var4_3 != null) break block62;
                                            }
                                            catch (n9 v22) {
                                                throw m44.a("h", (Object)v22, (long)-3063258192123757768L, (long)var2_2);
                                            }
                                            if (v21 /* !! */  == false) {
                                            }
                                            ** GOTO lbl130
                                        }
                                        catch (n9 v23) {
                                            throw m44.a("h", (Object)v23, (long)-3063258192123757768L, (long)var2_2);
                                        }
                                    }
                                    var5_5 /* !! */  = false;
                                    try {
                                        if (var4_3 == null) break block55;
lbl130:
                                        // 4 sources

                                        v16 = this;
                                    }
                                    catch (n9 v24) {
                                        throw m44.a("h", (Object)v24, (long)-3063258192123757768L, (long)var2_2);
                                    }
                                }
                                v21 /* !! */  = m44.a("v", (Object)v16, (long)-3661618732781611446L, (long)var2_2);
                            }
                            try {
                                try {
                                    if (var4_3 != null) break block63;
                                    if (v21 /* !! */  != m44.a("v", (Object)var6_4, (long)-3661618732781611446L, (long)var2_2)) break block64;
                                }
                                catch (n9 v25) {
                                    throw m44.a("h", (Object)v25, (long)-3063258192123757768L, (long)var2_2);
                                }
                                v21 /* !! */  = (CallSite)true;
                                break block63;
                            }
                            catch (n9 v26) {
                                throw m44.a("h", (Object)v26, (long)-3063258192123757768L, (long)var2_2);
                            }
                        }
                        v21 /* !! */  = (CallSite)false;
                    }
                    var5_5 /* !! */  = v21 /* !! */ ;
                }
                try {
                    if (var4_3 == null) break block65;
lbl155:
                    // 2 sources

                    v0 = false;
                }
                catch (n9 v27) {
                    throw m44.a("h", (Object)v27, (long)-3063258192123757768L, (long)var2_2);
                }
            }
            var5_5 /* !! */  = v0;
        }
        return var5_5 /* !! */ ;
    }

    String X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("q", (Object)this, (long)-517383968507312538L, (long)l);
    }

    public boolean Z(Object[] objectArray) {
        boolean bl;
        long l = (Long)objectArray[0];
        l = a ^ l;
        try {
            bl = m44.a("p", (Object)this, (long)-301501903887139423L, (long)l) != null;
        }
        catch (n9 n92) {
            throw m44.a("n", (Object)((Object)n92), (long)-2187831919876616218L, (long)l);
        }
        return bl;
    }

    public boolean E(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("p", (Object)this, (long)-3915584977247087924L, (long)l);
    }

    boolean U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("t", (Object)this, (long)7820767727925549300L, (long)l);
    }

    public final String Y(Object[] objectArray) {
        Object object;
        block14: {
            StringBuilder stringBuilder;
            block15: {
                block12: {
                    long l = (Long)objectArray[0];
                    long l2 = (l = a ^ l) ^ 0x35100130E0F3L;
                    stringBuilder = new StringBuilder();
                    CallSite callSite = m44.a("l", (long)4882031671525628814L, (long)l);
                    stringBuilder.append((String)((Object)m44.a("r", (Object)this, (long)6472385288102606048L, (long)l)));
                    CallSite callSite2 = callSite;
                    try {
                        block13: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (callSite2 != null) break block12;
                                                Object[] objectArray2 = new Object[1];
                                                objectArray2[0] = l2;
                                                if (m44.a("s", (Object)this, (Object)objectArray2, (long)6803078244888664509L, (long)l) != false) break block13;
                                            }
                                            catch (n9 n92) {
                                                throw m44.a("l", (Object)((Object)n92), (long)6519328858588705852L, (long)l);
                                            }
                                            object = m44.a("r", (Object)this, (long)6686053229030561370L, (long)l);
                                            if (callSite2 != null) break block14;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("l", (Object)((Object)n93), (long)6519328858588705852L, (long)l);
                                        }
                                        if (object == null) break block15;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("l", (Object)((Object)n94), (long)6519328858588705852L, (long)l);
                                    }
                                    object = m44.a("r", (Object)this, (long)6686053229030561370L, (long)l);
                                    if (callSite2 != null) break block14;
                                }
                                catch (n9 n95) {
                                    throw m44.a("l", (Object)((Object)n95), (long)6519328858588705852L, (long)l);
                                }
                                if (((String)object).length() <= 0) break block15;
                            }
                            catch (n9 n96) {
                                throw m44.a("l", (Object)((Object)n96), (long)6519328858588705852L, (long)l);
                            }
                        }
                        stringBuilder.append((char)f);
                        stringBuilder.append((String)((Object)m44.a("r", (Object)this, (long)6686053229030561370L, (long)l)));
                    }
                    catch (n9 n97) {
                        throw m44.a("l", (Object)((Object)n97), (long)6519328858588705852L, (long)l);
                    }
                }
                stringBuilder.append(")");
            }
            object = stringBuilder.toString();
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x71D2F0C27493L;
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
        String string = "V\u0013eqerrbl\u00a7\u00d7\u00871\u00e8\u00e08T\u00d7\u009e\u0099\u0081\u00e5\u00a3\u009b\u0097\u008bA\u0016\u0086@+)\\C\u0001^5\u0083\u0097\u00a0(c\u00f2O\u00c3\u00a2\u00df\u00a0\u00b4\u00d3\u00e5\u0091Y\u00dd\u00cd\t\u0099\u008d\u0094.\u00f6\u0092\u0003\u00d3\u00fc\u009b\u0094^}\u00d7\u0097\u00fc\u00bf\u00e7\u00da\u00d7\u001c\u0091^\u0087=";
        int n2 = "V\u0013eqerrbl\u00a7\u00d7\u00871\u00e8\u00e08T\u00d7\u009e\u0099\u0081\u00e5\u00a3\u009b\u0097\u008bA\u0016\u0086@+)\\C\u0001^5\u0083\u0097\u00a0(c\u00f2O\u00c3\u00a2\u00df\u00a0\u00b4\u00d3\u00e5\u0091Y\u00dd\u00cd\t\u0099\u008d\u0094.\u00f6\u0092\u0003\u00d3\u00fc\u009b\u0094^}\u00d7\u0097\u00fc\u00bf\u00e7\u00da\u00d7\u001c\u0091^\u0087=".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = luz.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        c = stringArray;
        d = new String[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -2348983617381494704L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                f = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x240F;
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
                throw new RuntimeException("com/zelix/luz", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            luz.d[n2] = luz.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = luz.a(n, l);
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
            throw new RuntimeException("com/zelix/luz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(luz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
