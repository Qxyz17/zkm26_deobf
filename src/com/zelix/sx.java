/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.df;
import com.zelix.h1;
import com.zelix.ic;
import com.zelix.iq;
import com.zelix.l6q;
import com.zelix.lk0;
import com.zelix.lmt;
import com.zelix.m44;
import com.zelix.m7;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.ss;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class sx
extends ss
implements lmt {
    private ic L;
    private iq J;
    private static final long b = prr.a((long)-2721799449841106948L, (long)-4349152013544608410L, MethodHandles.lookup().lookupClass()).a(269424116676253L);
    private static final String h;

    public m7 i(long l) {
        return m44.a("k", (long)-5829862097247894580L, (long)l);
    }

    sx(_4 _42, int n, long l, ic ic2) {
        l = b ^ l;
        super(_42, n);
        m44.a("w", (Object)((Object)this), (ic)ic2, (long)6039230475900815235L, (long)l);
    }

    sx(_4 _42, int n, h1 h12, l6q l6q2, long l, l6q l6q3, PrintWriter printWriter) {
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x4E9DA8A15915L;
        long l4 = l2 ^ 0x37B324D01328L;
        super(_42, n);
        int n2 = h12.readUnsignedShort();
        l6q2.t((Object)S.e(l3, n2), (Object)this, l4);
    }

    protected void r(DataOutputStream dataOutputStream, long l, Map map) {
        block15: {
            Object object;
            DataOutputStream dataOutputStream2;
            block13: {
                sx sx2;
                CallSite callSite;
                block11: {
                    block12: {
                        long l2 = l;
                        long l3 = l2 ^ 0x2254A3129629L;
                        long l4 = l2 ^ 0x66E0C7A2184DL;
                        callSite = m44.a("n", (long)3620787434600556248L, (long)l);
                        try {
                            try {
                                sx2 = this;
                                if (callSite != false) break block11;
                                if (sx2.c) break block12;
                            }
                            catch (n9 n92) {
                                throw m44.a("n", (Object)((Object)n92), (long)3514622851600654478L, (long)l);
                            }
                            String[] stringArray = new String[1];
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            stringArray[0] = h + (String)((Object)m44.a("q", (Object)((Object)this), (Object)objectArray, (long)3793153905972666927L, (long)l));
                            lk0.t((boolean)false, (String[])stringArray, (long)l4);
                        }
                        catch (n9 n93) {
                            throw m44.a("n", (Object)((Object)n93), (long)3514622851600654478L, (long)l);
                        }
                    }
                    try {
                        if (l > 0L) {
                            dataOutputStream2 = dataOutputStream;
                            object = this.R;
                            if (callSite != false) break block13;
                            dataOutputStream2.writeByte((int)object);
                        }
                        sx2 = this;
                    }
                    catch (n9 n94) {
                        throw m44.a("n", (Object)((Object)n94), (long)3514622851600654478L, (long)l);
                    }
                }
                try {
                    block14: {
                        try {
                            if (m44.a("p", (Object)((Object)sx2), (long)2902038862904257816L, (long)l) == null) break block14;
                            dataOutputStream.writeShort(m44.a("p", (Object)((Object)this), (long)2902038862904257816L, (long)l).B());
                            if (callSite == false) break block15;
                        }
                        catch (n9 n95) {
                            throw m44.a("n", (Object)((Object)n95), (long)3514622851600654478L, (long)l);
                        }
                    }
                    dataOutputStream2 = dataOutputStream;
                    object = m44.a("q", (Object)m44.a("p", (Object)((Object)this), (long)4008921536513795054L, (long)l), (Object)new Object[0], (long)3898386423277823191L, (long)l);
                }
                catch (n9 n96) {
                    throw m44.a("n", (Object)((Object)n96), (long)3514622851600654478L, (long)l);
                }
            }
            dataOutputStream2.writeShort((int)object);
        }
    }

    public void d(Integer n, iq iq2, long l) {
        m44.a("r", (Object)((Object)this), (iq)iq2, (long)5142589553074897408L, (long)l);
    }

    public boolean h(short s, short s2, int n, ss ss2) {
        int n2;
        block4: {
            block5: {
                boolean bl;
                long l = (long)s << 48 | (long)s2 << 48 >>> 16 | (long)n << 32 >>> 32;
                CallSite callSite = m44.a("j", (long)-97956903315664917L, (long)l);
                try {
                    n2 = this.R;
                    if (callSite == false) break block4;
                    if (n2 != ss2.R) break block5;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)-2016943254813379510L, (long)l);
                }
                sx sx2 = (sx)ss2;
                try {
                    bl = m44.a("t", (Object)((Object)this), (long)-2060785013803469014L, (long)l) == m44.a("t", (Object)((Object)sx2), (long)-2060785013803469014L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-2016943254813379510L, (long)l);
                }
                return bl;
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    public void X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        df df2 = (df)objectArray[1];
        long l2 = l ^ 0x6F3E14B71D18L;
        long l3 = l2 >>> 16;
        int n = (int)(l2 << 48 >>> 48);
        try {
            if (m44.a("w", (Object)((Object)this), (long)-5782240245961921889L, (long)l) != null) {
                df2.L(l3, (char)n, (Object)m44.a("w", (Object)((Object)this), (long)-5782240245961921889L, (long)l), (Object)this);
            }
        }
        catch (n9 n92) {
            throw m44.a("i", (Object)((Object)n92), (long)-5241850195094722807L, (long)l);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x75A07F350D1FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00cc\u00ee5\u00b2\u00ed\u00da\u00dfJ\u00b1\u0085\u00fc\u00e2\u00cb\u0094\u00d05B\u0099\u0011\u00fb\u00d21\u00cc\u00a1vF\u00d8\u00a59lS\u00fc".getBytes("ISO-8859-1"));
                h = sx.c(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
}
