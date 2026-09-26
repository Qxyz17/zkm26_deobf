/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.j2;
import com.zelix.lmw;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ok
implements lmw {
    j2 F;
    private static final long a = prr.a((long)7094526742916838212L, (long)7760980142102461014L, MethodHandles.lookup().lookupClass()).a(43997691754470L);
    private static final String b;

    public ok(long l, j2 j22) {
        block4: {
            block5: {
                l = a ^ l;
                CallSite callSite = m44.a("m", (long)-4098403492151348273L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (j22 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)-2481510285839087511L, (long)l);
                    }
                    throw new IllegalArgumentException();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)-2481510285839087511L, (long)l);
                }
            }
            m44.a("q", (Object)this, (j2)j22, (long)-4607655388288206399L, (long)l);
        }
    }

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    public String B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0xF10DCA4132EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)7272901243923132442L, (long)l);
    }

    public String x(Object[] objectArray) {
        block5: {
            ok ok2;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = l2 ^ 0x6FBF11526654L;
                CallSite callSite = m44.a("n", (long)1888294398372277988L, (long)l2);
                try {
                    try {
                        ok2 = this;
                        if (callSite != null) break block4;
                        if (m44.a("p", (Object)ok2, (long)2100167998578189546L, (long)l2) == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)46441130196899138L, (long)l2);
                    }
                    ok2 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)46441130196899138L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            return m44.a("q", (Object)ok2, (Object)objectArray2, (long)1805323066279379247L, (long)l2);
        }
        return b;
    }

    public boolean equals(Object object) {
        boolean bl;
        block12: {
            block13: {
                boolean bl2;
                CallSite callSite;
                long l;
                block14: {
                    ok ok2;
                    block15: {
                        block17: {
                            CallSite callSite2;
                            block16: {
                                l = a ^ 0x37DAA4AEB91BL;
                                CallSite callSite3 = m44.a("k", (long)-1492484344771043431L, (long)l);
                                try {
                                    bl = object instanceof ok;
                                    if (callSite3 != null) break block12;
                                    if (!bl) break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("k", (Object)illegalArgumentException, (long)-1019558082929531841L, (long)l);
                                }
                                ok2 = (ok)object;
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite = m44.a("u", (Object)this, (long)-1416246776026589801L, (long)l);
                                                if (callSite3 != null) break block14;
                                                if (callSite == null) break block15;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("k", (Object)illegalArgumentException, (long)-1019558082929531841L, (long)l);
                                            }
                                            callSite2 = m44.a("u", (Object)ok2, (long)-1416246776026589801L, (long)l);
                                            if (callSite3 != null) break block16;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("k", (Object)illegalArgumentException, (long)-1019558082929531841L, (long)l);
                                        }
                                        if (callSite2 == null) break block17;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("k", (Object)illegalArgumentException, (long)-1019558082929531841L, (long)l);
                                    }
                                    callSite2 = m44.a("u", (Object)this, (long)-1416246776026589801L, (long)l);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("k", (Object)illegalArgumentException, (long)-1019558082929531841L, (long)l);
                                }
                            }
                            return callSite2.equals(m44.a("u", (Object)ok2, (long)-1416246776026589801L, (long)l));
                        }
                        return false;
                    }
                    callSite = m44.a("u", (Object)ok2, (long)-1416246776026589801L, (long)l);
                }
                try {
                    bl2 = callSite == null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)-1019558082929531841L, (long)l);
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public String D(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = l2 ^ 0x200F4F4FD1AAL;
                CallSite callSite2 = m44.a("l", (long)8020613449256049566L, (long)l2);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)7520777203979850128L, (long)l2);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)8493398956899622968L, (long)l2);
                    }
                    callSite = m44.a("r", (Object)this, (long)7520777203979850128L, (long)l2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)8493398956899622968L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            return m44.a("s", (Object)callSite, (Object)objectArray2, (long)8144185315712521624L, (long)l2);
        }
        return null;
    }

    public int n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return -1;
    }

    public String U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2AABF27F19E1L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("r", (Object)this, (Object)objectArray2, (long)7935813817107479253L, (long)l);
    }

    public int hashCode() {
        block5: {
            CallSite callSite;
            block4: {
                long l = a ^ 0x1EAAB19F6CFEL;
                CallSite callSite2 = m44.a("n", (long)4516134151331957372L, (long)l);
                try {
                    try {
                        callSite = m44.a("p", (Object)this, (long)4160572338415681650L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)2611212724455780826L, (long)l);
                    }
                    callSite = m44.a("p", (Object)this, (long)4160572338415681650L, (long)l);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)2611212724455780826L, (long)l);
                }
            }
            return callSite.hashCode();
        }
        return 0;
    }

    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x357259296933L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("e\u00e2Rf\u00c0r\u000bn".getBytes("ISO-8859-1"));
                b = ok.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
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
