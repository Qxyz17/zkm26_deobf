/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class h1
extends DataInputStream {
    private ByteArrayInputStream N;
    private byte[] A;
    private static int z;
    private static final long a;
    private static final String b;
    private static final long c;

    public static h1 C(Object[] objectArray) {
        long l = (Long)objectArray[0];
        InputStream inputStream = (InputStream)objectArray[1];
        int n = (Integer)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x75162A470028L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = true;
        objectArray2[2] = n;
        objectArray2[1] = inputStream;
        objectArray2[0] = l2;
        return m44.a("m", (Object)objectArray2, (long)6866006412366246073L, (long)l);
    }

    @Override
    public void reset() {
        long l = a ^ 0x5A4D16B2E449L;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)3138509830748862925L, (long)l), (long)3996801205558353790L, (long)l);
    }

    public static int u() {
        return z;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static h1 l(Object[] objectArray) {
        InputStream inputStream;
        long l = (Long)objectArray[0];
        InputStream inputStream2 = (InputStream)objectArray[1];
        int n = (Integer)objectArray[2];
        boolean bl = (Boolean)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x2C81E8E0E957L;
        CallSite callSite = m44.a("n", (long)-8723814340256852674L, (long)l);
        byte[] byArray = new byte[n];
        int n2 = 0;
        block7: while (n2 < n) {
            inputStream = inputStream2;
            do {
                block11: {
                    CallSite callSite2;
                    block9: {
                        int n3;
                        Object object;
                        block10: {
                            callSite2 = m44.a("q", (Object)inputStream, (Object)byArray, (int)n2, (int)m44.a("n", (int)((int)c), (int)(n - n2), (long)-8834274349155485607L, (long)l), (long)-8761472311180690662L, (long)l);
                            if (l < 0L) break block9;
                            object = -1;
                            if (callSite == false) break block10;
                            try {
                                CallSite callSite3;
                                block12: {
                                    if (callSite2 == object) break block11;
                                    break block12;
                                    catch (n9 n92) {
                                        throw m44.a("n", (Object)((Object)n92), (long)-6996108318676565722L, (long)l);
                                    }
                                }
                                n3 = n2;
                                object = callSite3;
                            }
                            catch (n9 n93) {
                                throw m44.a("n", (Object)((Object)n93), (long)-6996108318676565722L, (long)l);
                            }
                        }
                        n2 = n3 + object;
                        callSite2 = callSite;
                    }
                    if (callSite2 != false) continue block7;
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
                h1 h12 = new h1(byteArrayInputStream, byArray, bl, l2);
                inputStream = h12;
            } while (l <= 0L);
        }
        return inputStream;
        finally {
            m44.a("q", (Object)inputStream2, (long)-7422988143144157604L, (long)l);
        }
    }

    private h1(ByteArrayInputStream byteArrayInputStream, byte[] byArray, boolean bl, long l) {
        l = a ^ l;
        super(byteArrayInputStream);
        m44.a("v", (Object)this, (ByteArrayInputStream)byteArrayInputStream, (long)-5347708706587023478L, (long)l);
        if (bl) {
            try {
                CallSite callSite = m44.a("j", (Object)b, (long)-6332593122284813947L, (long)l);
                m44.a("v", (Object)this, (byte[])m44.a("u", (Object)callSite, (Object)byArray, (long)-5692332561616887436L, (long)l), (long)-5651022627577835231L, (long)l);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                m44.a("v", (Object)this, (byte[])new byte[0], (long)-5651022627577835231L, (long)l);
            }
        }
    }

    public byte[] B(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("q", (Object)this, (long)-286379767593952076L, (long)l);
    }

    public static void c(int n) {
        z = n;
    }

    public static int q() {
        int n = h1.u();
        if (n == 0) {
            return 16;
        }
        return 0;
    }

    public static h1 O(Object[] objectArray) {
        byte[] byArray = (byte[])objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x12D11B9BC167L;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        return new h1(byteArrayInputStream, byArray, bl, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)-2518522498504991044L, (long)1433341065663874639L, MethodHandles.lookup().lookupClass()).a(113919385741539L);
        long l = a ^ 0x543A49DB4B2BL;
        if (m44.a("o", (long)-7054983798552654393L, (long)l) == false) {
            m44.a("o", (int)39, (long)-7377871643127220276L, (long)l);
        }
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
        byte[] byArray3 = cipher.doFinal("\u00ceH\u00ea\u00a5\u00d7\u008e\u00db\u00a2".getBytes("ISO-8859-1"));
        b = h1.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 8208847571047889695L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
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
}
