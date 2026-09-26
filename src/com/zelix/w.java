/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.loe;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class w {
    public static w z;
    private final String y;
    private final int b;
    private final String s;
    private static final long a;

    public w(String string, String string2) {
        this.y = string;
        this.s = string2;
        this.b = string.hashCode() ^ string2.hashCode();
    }

    public String P(Object[] objectArray) {
        return this.s;
    }

    private w(String string, String string2, int n) {
        this.y = string;
        this.s = string2;
        this.b = n;
    }

    public boolean equals(Object object) {
        boolean bl;
        block12: {
            block13: {
                boolean bl2;
                block17: {
                    block15: {
                        CallSite callSite;
                        long l;
                        block16: {
                            w w2;
                            block14: {
                                l = a ^ 0x10A36792FFD4L;
                                callSite = m44.a("n", (long)6433178743991712011L, (long)l);
                                try {
                                    bl = object instanceof w;
                                    if (callSite != null) break block12;
                                    if (!bl) break block13;
                                }
                                catch (n9 n92) {
                                    throw m44.a("n", (Object)((Object)n92), (long)6757898494832205090L, (long)l);
                                }
                                w2 = (w)object;
                                try {
                                    try {
                                        bl2 = this.b;
                                        if (callSite != null) break block14;
                                        if (bl2 != w2.b) break block15;
                                    }
                                    catch (n9 n93) {
                                        throw m44.a("n", (Object)((Object)n93), (long)6757898494832205090L, (long)l);
                                    }
                                    bl2 = this.y.equals(w2.y);
                                }
                                catch (n9 n94) {
                                    throw m44.a("n", (Object)((Object)n94), (long)6757898494832205090L, (long)l);
                                }
                            }
                            try {
                                try {
                                    if (callSite != null) break block16;
                                    if (!bl2) break block15;
                                }
                                catch (n9 n95) {
                                    throw m44.a("n", (Object)((Object)n95), (long)6757898494832205090L, (long)l);
                                }
                                bl2 = this.s.equals(w2.s);
                            }
                            catch (n9 n96) {
                                throw m44.a("n", (Object)((Object)n96), (long)6757898494832205090L, (long)l);
                            }
                        }
                        try {
                            if (callSite != null) break block17;
                            if (!bl2) break block15;
                        }
                        catch (n9 n97) {
                            throw m44.a("n", (Object)((Object)n97), (long)6757898494832205090L, (long)l);
                        }
                        bl2 = true;
                        break block17;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public String O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Map map = (Map)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x73280A270678L;
        return loe.v((String)this.s, (long)l2, (Map)map) + " " + this.y;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)4806819427434220950L, (long)-7671656348221413839L, MethodHandles.lookup().lookupClass()).a(195603105682701L);
        long l = a ^ 0x263A11ECB69AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("d\u009b\u0088\u0001&\u00bevS\u00fd`|\u0086 \u0001\u0084\u00bf\u00b4\u00bc\u008cY\u0094\u00e8\u00b1\u008d".getBytes("ISO-8859-1"));
                String string = w.a(byArray3).intern();
                m44.a("k", (w)new w(string, "J"), (long)1534337104681991179L, (long)l);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public int hashCode() {
        return this.b;
    }

    public Object clone() {
        return new w(this.y, this.s, this.b);
    }

    public String S(Object[] objectArray) {
        return this.y;
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
}
