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
        long l10 = (Long)objectArray[0];
        InputStream inputStream = (InputStream)objectArray[1];
        int n10 = (Integer)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x75162A470028L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = true;
        objectArray2[2] = n10;
        objectArray2[1] = inputStream;
        objectArray2[0] = l11;
        return m44.a("m", (Object)objectArray2, (long)6866006412366246073L, (long)l10);
    }

    @Override
    public void reset() {
        long l10 = a ^ 0x5A4D16B2E449L;
        m44.a("r", (Object)m44.a("s", (Object)this, (long)3138509830748862925L, (long)l10), (long)3996801205558353790L, (long)l10);
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
        long l10 = (Long)objectArray[0];
        InputStream inputStream2 = (InputStream)objectArray[1];
        int n10 = (Integer)objectArray[2];
        boolean bl2 = (Boolean)objectArray[3];
        long l11 = (l10 = a ^ l10) ^ 0x2C81E8E0E957L;
        CallSite callSite = m44.a("n", (long)-8723814340256852674L, (long)l10);
        byte[] byArray = new byte[n10];
        int n11 = 0;
        block7: while (n11 < n10) {
            inputStream = inputStream2;
            do {
                block11: {
                    CallSite callSite2;
                    block9: {
                        int n12;
                        Object object;
                        block10: {
                            callSite2 = m44.a("q", (Object)inputStream, (Object)byArray, (int)n11, (int)m44.a("n", (int)((int)c), (int)(n10 - n11), (long)-8834274349155485607L, (long)l10), (long)-8761472311180690662L, (long)l10);
                            if (l10 < 0L) break block9;
                            object = -1;
                            if (callSite == false) break block10;
                            try {
                                CallSite callSite3;
                                block12: {
                                    if (callSite2 == object) break block11;
                                    break block12;
                                    catch (n9 n92) {
                                        throw m44.a("n", (Object)n92, (long)-6996108318676565722L, (long)l10);
                                    }
                                }
                                n12 = n11;
                                object = callSite3;
                            }
                            catch (n9 n93) {
                                throw m44.a("n", (Object)n93, (long)-6996108318676565722L, (long)l10);
                            }
                        }
                        n11 = n12 + object;
                        callSite2 = callSite;
                    }
                    if (callSite2 != false) continue block7;
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
                h1 h12 = new h1(byteArrayInputStream, byArray, bl2, l11);
                inputStream = h12;
            } while (l10 <= 0L);
        }
        return inputStream;
        finally {
            m44.a("q", (Object)inputStream2, (long)-7422988143144157604L, (long)l10);
        }
    }

    private h1(ByteArrayInputStream byteArrayInputStream, byte[] byArray, boolean bl2, long l10) {
        l10 = a ^ l10;
        super(byteArrayInputStream);
        m44.a("v", (Object)this, (ByteArrayInputStream)byteArrayInputStream, (long)-5347708706587023478L, (long)l10);
        if (bl2) {
            try {
                CallSite callSite = m44.a("j", b, (long)-6332593122284813947L, (long)l10);
                m44.a("v", (Object)this, (byte[])m44.a("u", (Object)callSite, (Object)byArray, (long)-5692332561616887436L, (long)l10), (long)-5651022627577835231L, (long)l10);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                m44.a("v", (Object)this, (byte[])new byte[0], (long)-5651022627577835231L, (long)l10);
            }
        }
    }

    public byte[] B(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("q", (Object)this, (long)-286379767593952076L, (long)l10);
    }

    public static void c(int n10) {
        z = n10;
    }

    public static int q() {
        int n10 = h1.u();
        if (n10 == 0) {
            return 16;
        }
        return 0;
    }

    public static h1 O(Object[] objectArray) {
        byte[] byArray = (byte[])objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = (l10 = a ^ l10) ^ 0x12D11B9BC167L;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        return new h1(byteArrayInputStream, byArray, bl2, l11);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a(-2518522498504991044L, 1433341065663874639L, MethodHandles.lookup().lookupClass()).a(113919385741539L);
        long l10 = a ^ 0x543A49DB4B2BL;
        if (m44.a("o", (long)-7054983798552654393L, (long)l10) == false) {
            m44.a("o", (int)39, (long)-7377871643127220276L, (long)l10);
        }
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
        byte[] byArray3 = cipher.doFinal("\u00ceH\u00ea\u00a5\u00d7\u008e\u00db\u00a2".getBytes("ISO-8859-1"));
        b = h1.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = 8208847571047889695L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                c = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
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

