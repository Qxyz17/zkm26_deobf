/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.js;
import com.zelix.lmw;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.xt;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l67
implements lmw {
    private String M;
    private boolean L;
    xt Z;
    private static final long b = prr.a(8308052216854442946L, 4285427414023374541L, MethodHandles.lookup().lookupClass()).a(69847010740350L);
    private static final String c;
    private static final long d;

    public boolean equals(Object object) {
        boolean bl2;
        block12: {
            block13: {
                boolean bl3;
                CallSite callSite;
                long l10;
                block14: {
                    l67 l672;
                    block15: {
                        block17: {
                            CallSite callSite2;
                            block16: {
                                l10 = b ^ 0xAB91F7D3DL;
                                CallSite callSite3 = m44.a("i", (long)1070642954299636235L, (long)l10);
                                try {
                                    bl2 = object instanceof l67;
                                    if (callSite3 != null) break block12;
                                    if (!bl2) break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l10);
                                }
                                l672 = (l67)object;
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite = m44.a("w", (Object)this, (long)1383289016111698135L, (long)l10);
                                                if (callSite3 != null) break block14;
                                                if (callSite == null) break block15;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l10);
                                            }
                                            callSite2 = m44.a("w", (Object)l672, (long)1383289016111698135L, (long)l10);
                                            if (callSite3 != null) break block16;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l10);
                                        }
                                        if (callSite2 == null) break block17;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l10);
                                    }
                                    callSite2 = m44.a("w", (Object)this, (long)1383289016111698135L, (long)l10);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l10);
                                }
                            }
                            return ((js)((Object)callSite2)).equals(m44.a("w", (Object)l672, (long)1383289016111698135L, (long)l10));
                        }
                        return false;
                    }
                    callSite = m44.a("w", (Object)l672, (long)1383289016111698135L, (long)l10);
                }
                try {
                    bl3 = callSite == null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l10);
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    private l67(xt xt2, boolean bl2, long l10, String string) {
        block4: {
            block5: {
                l10 = b ^ l10;
                CallSite callSite = m44.a("n", (long)-9080126521835162324L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (xt2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)-7195051732540217467L, (long)l10);
                    }
                    throw new IllegalArgumentException();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)-7195051732540217467L, (long)l10);
                }
            }
            m44.a("r", (Object)this, (xt)xt2, (long)-7199787858948972560L, (long)l10);
            m44.a("r", (Object)this, (boolean)bl2, (long)-7117123242384779940L, (long)l10);
            m44.a("r", (Object)this, (String)string, (long)-7382254264757048545L, (long)l10);
        }
    }

    public boolean u(Object[] objectArray) {
        int n10;
        block8: {
            block7: {
                CallSite callSite;
                CallSite callSite2;
                long l10;
                block6: {
                    l10 = (Long)objectArray[0];
                    l10 = b ^ l10;
                    callSite2 = m44.a("o", (long)1510307392266625061L, (long)l10);
                    try {
                        try {
                            callSite = m44.a("q", (Object)this, (long)902319993466699286L, (long)l10);
                            if (callSite2 != null) break block6;
                            if (callSite == null) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("o", (Object)illegalArgumentException, (long)661838976062730892L, (long)l10);
                        }
                        callSite = m44.a("q", (Object)this, (long)902319993466699286L, (long)l10);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("o", (Object)illegalArgumentException, (long)661838976062730892L, (long)l10);
                    }
                }
                try {
                    n10 = ((String)((Object)callSite)).length();
                    if (callSite2 != null) break block8;
                    if (n10 <= 0) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)661838976062730892L, (long)l10);
                }
                n10 = 1;
                break block8;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    public final xt E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return m44.a("w", (Object)this, (long)-5453270688639076425L, (long)l10);
    }

    @Override
    public String B(Object[] objectArray) {
        CallSite callSite;
        block16: {
            Object object;
            block17: {
                int n10;
                CallSite callSite2;
                long l10;
                block14: {
                    block15: {
                        CallSite callSite3;
                        block12: {
                            block13: {
                                l10 = (Long)objectArray[0];
                                long l11 = l10 ^ 0xF10DCA4132EL;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l11;
                                object = m44.a("u", (Object)this, (Object)objectArray2, (long)9189062522456170766L, (long)l10);
                                callSite2 = m44.a("j", (long)8962443080938850480L, (long)l10);
                                try {
                                    try {
                                        callSite3 = object;
                                        if (callSite2 != null) break block12;
                                        if (callSite3 != null) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l10);
                                    }
                                    return null;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l10);
                                }
                            }
                            callSite3 = object;
                        }
                        int n11 = ((String)((Object)callSite3)).lastIndexOf((int)d);
                        try {
                            n10 = n11;
                            if (l10 < 0L || callSite2 != null) break block14;
                            if (n10 <= -1) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l10);
                        }
                        object = ((String)object).substring(n11 + 1);
                    }
                    try {
                        callSite = object;
                        if (callSite2 != null) break block16;
                        n10 = ((String)((Object)callSite)).startsWith("L") ? 1 : 0;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l10);
                    }
                }
                try {
                    try {
                        if (n10 == 0) break block17;
                        callSite = object;
                        if (callSite2 != null) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l10);
                    }
                    if (!((String)((Object)callSite)).endsWith(";")) break block17;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l10);
                }
                object = ((String)object).substring(1, ((String)object).length() - 1);
            }
            callSite = object;
        }
        return callSite;
    }

    @Override
    public int n(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return -1;
    }

    public l67(long l10, xt xt2) {
        long l11 = (l10 = b ^ l10) ^ 0x411B70D7BE74L;
        this(xt2, false, l11, null);
    }

    @Override
    public boolean a(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    public String g(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return m44.a("p", (Object)this, (long)-192310220954251321L, (long)l10);
    }

    @Override
    public boolean S(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return false;
    }

    @Override
    public boolean Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return true;
    }

    @Override
    public String U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)8451354442145590209L, (long)l10);
    }

    public int hashCode() {
        block5: {
            CallSite callSite;
            block4: {
                long l10 = b ^ 0x30B4CD64180AL;
                CallSite callSite2 = m44.a("n", (long)7776732108494905148L, (long)l10);
                try {
                    try {
                        callSite = m44.a("p", (Object)this, (long)8504307622427686368L, (long)l10);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)8518104866701069717L, (long)l10);
                    }
                    callSite = m44.a("p", (Object)this, (long)8504307622427686368L, (long)l10);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)8518104866701069717L, (long)l10);
                }
            }
            return ((js)((Object)callSite)).hashCode();
        }
        return 0;
    }

    public l67(long l10, xt xt2, boolean bl2) {
        long l11 = (l10 = b ^ l10) ^ 0x1E5E93990AF0L;
        this(xt2, bl2, l11, null);
    }

    public l67(long l10, xt xt2, String string) {
        long l11 = (l10 = b ^ l10) ^ 0x57047F87D071L;
        this(xt2, false, l11, string);
    }

    @Override
    public final String x(Object[] objectArray) {
        block5: {
            l67 l672;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                l10 = l11 ^ 0x6FBF11526654L;
                CallSite callSite = m44.a("n", (long)1888294398372277988L, (long)l11);
                try {
                    try {
                        l672 = this;
                        if (callSite != null) break block4;
                        if (m44.a("p", (Object)l672, (long)566696951493592120L, (long)l11) == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)571519927779736653L, (long)l11);
                    }
                    l672 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)571519927779736653L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            return m44.a("q", (Object)l672, (Object)objectArray2, (long)1760134528920709435L, (long)l11);
        }
        return c;
    }

    @Override
    public final String D(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l10;
            long l11;
            block4: {
                l11 = (Long)objectArray[0];
                l10 = l11 ^ 0x43B16838DDF7L;
                CallSite callSite2 = m44.a("l", (long)8020613449256049566L, (long)l11);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)8261624200404726082L, (long)l11);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)8256244870699043127L, (long)l11);
                    }
                    callSite = m44.a("r", (Object)this, (long)8261624200404726082L, (long)l11);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)8256244870699043127L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l10;
            return m44.a("s", (Object)callSite, (Object)objectArray2, (long)8192304535468256353L, (long)l11);
        }
        return null;
    }

    public boolean J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return (boolean)m44.a("t", (Object)this, (long)-689463044294640120L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = b ^ 0x590BBE55B8CDL;
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
        byte[] byArray3 = cipher.doFinal("I+Z\u00ef:\u001fe\u009c".getBytes("ISO-8859-1"));
        c = l67.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = -1174235823821423574L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                d = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(byte[] byArray) {
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
}

