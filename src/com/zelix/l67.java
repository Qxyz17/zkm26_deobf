/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

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
    private static final long b = prr.a((long)8308052216854442946L, (long)4285427414023374541L, MethodHandles.lookup().lookupClass()).a(69847010740350L);
    private static final String c;
    private static final long d;

    public boolean equals(Object object) {
        boolean bl;
        block12: {
            block13: {
                boolean bl2;
                CallSite callSite;
                long l;
                block14: {
                    l67 l672;
                    block15: {
                        block17: {
                            CallSite callSite2;
                            block16: {
                                l = b ^ 0xAB91F7D3DL;
                                CallSite callSite3 = m44.a("i", (long)1070642954299636235L, (long)l);
                                try {
                                    bl = object instanceof l67;
                                    if (callSite3 != null) break block12;
                                    if (!bl) break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l);
                                }
                                l672 = (l67)object;
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite = m44.a("w", (Object)this, (long)1383289016111698135L, (long)l);
                                                if (callSite3 != null) break block14;
                                                if (callSite == null) break block15;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l);
                                            }
                                            callSite2 = m44.a("w", (Object)l672, (long)1383289016111698135L, (long)l);
                                            if (callSite3 != null) break block16;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l);
                                        }
                                        if (callSite2 == null) break block17;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l);
                                    }
                                    callSite2 = m44.a("w", (Object)this, (long)1383289016111698135L, (long)l);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l);
                                }
                            }
                            return callSite2.equals(m44.a("w", (Object)l672, (long)1383289016111698135L, (long)l));
                        }
                        return false;
                    }
                    callSite = m44.a("w", (Object)l672, (long)1383289016111698135L, (long)l);
                }
                try {
                    bl2 = callSite == null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)1369467573724588194L, (long)l);
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    private l67(xt xt2, boolean bl, long l, String string) {
        block4: {
            block5: {
                l = b ^ l;
                CallSite callSite = m44.a("n", (long)-9080126521835162324L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (xt2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)-7195051732540217467L, (long)l);
                    }
                    throw new IllegalArgumentException();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)-7195051732540217467L, (long)l);
                }
            }
            m44.a("r", (Object)this, (xt)xt2, (long)-7199787858948972560L, (long)l);
            m44.a("r", (Object)this, (boolean)bl, (long)-7117123242384779940L, (long)l);
            m44.a("r", (Object)this, (String)string, (long)-7382254264757048545L, (long)l);
        }
    }

    public boolean u(Object[] objectArray) {
        int n;
        block8: {
            block7: {
                CallSite callSite;
                CallSite callSite2;
                long l;
                block6: {
                    l = (Long)objectArray[0];
                    l = b ^ l;
                    callSite2 = m44.a("o", (long)1510307392266625061L, (long)l);
                    try {
                        try {
                            callSite = m44.a("q", (Object)this, (long)902319993466699286L, (long)l);
                            if (callSite2 != null) break block6;
                            if (callSite == null) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("o", (Object)illegalArgumentException, (long)661838976062730892L, (long)l);
                        }
                        callSite = m44.a("q", (Object)this, (long)902319993466699286L, (long)l);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("o", (Object)illegalArgumentException, (long)661838976062730892L, (long)l);
                    }
                }
                try {
                    n = ((String)((Object)callSite)).length();
                    if (callSite2 != null) break block8;
                    if (n <= 0) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("o", (Object)illegalArgumentException, (long)661838976062730892L, (long)l);
                }
                n = 1;
                break block8;
            }
            n = 0;
        }
        return n != 0;
    }

    public final xt E(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return m44.a("w", (Object)this, (long)-5453270688639076425L, (long)l);
    }

    public String B(Object[] objectArray) {
        CallSite callSite;
        block16: {
            Object object;
            block17: {
                int n;
                CallSite callSite2;
                long l;
                block14: {
                    block15: {
                        CallSite callSite3;
                        block12: {
                            block13: {
                                l = (Long)objectArray[0];
                                long l2 = l ^ 0xF10DCA4132EL;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l2;
                                object = m44.a("u", (Object)this, (Object)objectArray2, (long)9189062522456170766L, (long)l);
                                callSite2 = m44.a("j", (long)8962443080938850480L, (long)l);
                                try {
                                    try {
                                        callSite3 = object;
                                        if (callSite2 != null) break block12;
                                        if (callSite3 != null) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l);
                                    }
                                    return null;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l);
                                }
                            }
                            callSite3 = object;
                        }
                        int n2 = ((String)((Object)callSite3)).lastIndexOf((int)d);
                        try {
                            n = n2;
                            if (l < 0L || callSite2 != null) break block14;
                            if (n <= -1) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l);
                        }
                        object = ((String)object).substring(n2 + 1);
                    }
                    try {
                        callSite = object;
                        if (callSite2 != null) break block16;
                        n = ((String)((Object)callSite)).startsWith("L") ? 1 : 0;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l);
                    }
                }
                try {
                    try {
                        if (n == 0) break block17;
                        callSite = object;
                        if (callSite2 != null) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l);
                    }
                    if (!((String)((Object)callSite)).endsWith(";")) break block17;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)7041973848342551065L, (long)l);
                }
                object = ((String)object).substring(1, ((String)object).length() - 1);
            }
            callSite = object;
        }
        return callSite;
    }

    public int n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return -1;
    }

    public l67(long l, xt xt2) {
        long l2 = (l = b ^ l) ^ 0x411B70D7BE74L;
        this(xt2, false, l2, null);
    }

    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public String g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return m44.a("p", (Object)this, (long)-192310220954251321L, (long)l);
    }

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public String U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)8451354442145590209L, (long)l);
    }

    public int hashCode() {
        block5: {
            CallSite callSite;
            block4: {
                long l = b ^ 0x30B4CD64180AL;
                CallSite callSite2 = m44.a("n", (long)7776732108494905148L, (long)l);
                try {
                    try {
                        callSite = m44.a("p", (Object)this, (long)8504307622427686368L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)8518104866701069717L, (long)l);
                    }
                    callSite = m44.a("p", (Object)this, (long)8504307622427686368L, (long)l);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)8518104866701069717L, (long)l);
                }
            }
            return callSite.hashCode();
        }
        return 0;
    }

    public l67(long l, xt xt2, boolean bl) {
        long l2 = (l = b ^ l) ^ 0x1E5E93990AF0L;
        this(xt2, bl, l2, null);
    }

    public l67(long l, xt xt2, String string) {
        long l2 = (l = b ^ l) ^ 0x57047F87D071L;
        this(xt2, false, l2, string);
    }

    public final String x(Object[] objectArray) {
        block5: {
            l67 l672;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = l2 ^ 0x6FBF11526654L;
                CallSite callSite = m44.a("n", (long)1888294398372277988L, (long)l2);
                try {
                    try {
                        l672 = this;
                        if (callSite != null) break block4;
                        if (m44.a("p", (Object)l672, (long)566696951493592120L, (long)l2) == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)571519927779736653L, (long)l2);
                    }
                    l672 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)571519927779736653L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            return m44.a("q", (Object)l672, (Object)objectArray2, (long)1760134528920709435L, (long)l2);
        }
        return c;
    }

    public final String D(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = l2 ^ 0x43B16838DDF7L;
                CallSite callSite2 = m44.a("l", (long)8020613449256049566L, (long)l2);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)8261624200404726082L, (long)l2);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)8256244870699043127L, (long)l2);
                    }
                    callSite = m44.a("r", (Object)this, (long)8261624200404726082L, (long)l2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)8256244870699043127L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            return m44.a("s", (Object)callSite, (Object)objectArray2, (long)8192304535468256353L, (long)l2);
        }
        return null;
    }

    public boolean J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (boolean)m44.a("t", (Object)this, (long)-689463044294640120L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x590BBE55B8CDL;
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
        byte[] byArray3 = cipher.doFinal("I+Z\u00ef:\u001fe\u009c".getBytes("ISO-8859-1"));
        c = l67.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -1174235823821423574L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                d = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
}
