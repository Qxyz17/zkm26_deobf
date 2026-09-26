/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._u;
import com.zelix.lb6;
import com.zelix.lbo;
import com.zelix.m44;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.ye;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class an {
    private static final long a = prr.a(-3624269290899587448L, -3042109893922069718L, MethodHandles.lookup().lookupClass()).a(76407888411430L);
    private static final long b;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public an(File file, lb6 lb62, long l10, lb6 lb63, lb6 lb64, String string, _u _u2, lbo lbo2, Map map, Map map2, Map map3, ol ol2) {
        block10: {
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x6BDBB9CC1F97L;
            long l13 = l11 ^ 0x46F2D3BE389EL;
            CallSite callSite = m44.a("m", (long)-373382362500402574L, (long)l10);
            CallSite callSite2 = callSite;
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                new ye(fileInputStream, lbo2, string, l13, lb62.U(l12), lb63.U(l12), lb64.U(l12), map, map2, map3, ol2, (String)((Object)m44.a("r", (Object)file, (long)-2119444108930899987L, (long)l10)));
            }
            catch (Throwable throwable) {
                block12: {
                    try {
                        FileInputStream fileInputStream2;
                        block11: {
                            try {
                                fileInputStream2 = fileInputStream;
                                if (callSite2 == null) break block11;
                                if (fileInputStream2 == null) break block12;
                            }
                            catch (IOException iOException) {
                                throw m44.a("m", (Object)iOException, (long)-1802910722252879147L, (long)l10);
                            }
                            fileInputStream2 = fileInputStream;
                        }
                        m44.a("r", (Object)fileInputStream2, (long)-344678084153975401L, (long)l10);
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                throw throwable;
            }
            try {
                FileInputStream fileInputStream3 = fileInputStream;
                if (callSite2 != null) {
                    if (fileInputStream3 == null) break block10;
                    fileInputStream3 = fileInputStream;
                }
                m44.a("r", (Object)fileInputStream3, (long)-344678084153975401L, (long)l10);
            }
            catch (IOException iOException) {}
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public an(ZipFile zipFile, ZipEntry zipEntry, lb6 lb62, lb6 lb63, lb6 lb64, String string, _u _u2, lbo lbo2, Map map, long l10, Map map2, Map map3, ol ol2) {
        block10: {
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x6402BB77CC4BL;
            long l13 = l11 ^ 0x7D45FB287344L;
            long l14 = l11 ^ 0x506C915A544DL;
            long l15 = l11 ^ 0x29ABF17EEE97L;
            CallSite callSite = m44.a("n", (long)-7637423105603789151L, (long)l10);
            CallSite callSite2 = callSite;
            CallSite callSite3 = null;
            try {
                callSite3 = m44.a("q", (Object)zipFile, (Object)zipEntry, (long)-8355479937579046461L, (long)l10);
                Object[] objectArray = new Object[3];
                objectArray[2] = l15;
                objectArray[1] = zipEntry;
                objectArray[0] = zipFile;
                new ye((InputStream)((Object)callSite3), lbo2, string, l14, lb62.U(l13), lb63.U(l13), lb64.U(l13), map, map2, map3, ol2, (String)((Object)m44.a("n", (Object)objectArray, (long)-7835852969228214234L, (long)l10)));
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l12;
                m44.a("q", (Object)lbo2, (Object)objectArray2, (long)-8078796451191188069L, (long)l10);
            }
            catch (Throwable throwable) {
                block12: {
                    try {
                        CallSite callSite4;
                        block11: {
                            try {
                                callSite4 = callSite3;
                                if (callSite2 == null) break block11;
                                if (callSite4 == null) break block12;
                            }
                            catch (IOException iOException) {
                                throw m44.a("n", (Object)iOException, (long)-8491025969107458554L, (long)l10);
                            }
                            callSite4 = callSite3;
                        }
                        m44.a("q", (Object)callSite4, (long)-7501761653948042940L, (long)l10);
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                throw throwable;
            }
            try {
                CallSite callSite5 = callSite3;
                if (callSite2 != null) {
                    if (callSite5 == null) break block10;
                    callSite5 = callSite3;
                }
                m44.a("q", (Object)callSite5, (long)-7501761653948042940L, (long)l10);
            }
            catch (IOException iOException) {}
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public an(String string, String string2, lb6 lb62, lb6 lb63, long l10, lb6 lb64, String string3, lbo lbo2) {
        block10: {
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x277C7D10B2B9L;
            long l13 = l11 ^ 0x135AEF4ED521L;
            long l14 = l11 ^ 0xA55176295B0L;
            Object[] objectArray = new Object[2];
            objectArray[1] = l13;
            objectArray[0] = (int)b;
            CallSite callSite = m44.a("k", (Object)objectArray, (long)5899820459412804608L, (long)l10);
            Map map = null;
            CallSite callSite2 = m44.a("k", (long)6340846311177772892L, (long)l10);
            Map map2 = null;
            ol ol2 = null;
            ByteArrayInputStream byteArrayInputStream = null;
            try {
                byteArrayInputStream = new ByteArrayInputStream((byte[])m44.a("t", string2, (long)5746839253060152982L, (long)l10));
                new ye(byteArrayInputStream, lbo2, string3, l14, lb62.U(l12), lb63.U(l12), lb64.U(l12), (Map)((Object)callSite), map, map2, ol2, string);
            }
            catch (Throwable throwable) {
                block12: {
                    try {
                        ByteArrayInputStream byteArrayInputStream2;
                        block11: {
                            try {
                                byteArrayInputStream2 = byteArrayInputStream;
                                if (callSite2 == null) break block11;
                                if (byteArrayInputStream2 == null) break block12;
                            }
                            catch (IOException iOException) {
                                throw m44.a("k", (Object)iOException, (long)5464144976181159931L, (long)l10);
                            }
                            byteArrayInputStream2 = byteArrayInputStream;
                        }
                        m44.a("t", (Object)byteArrayInputStream2, (long)6204053441648488633L, (long)l10);
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                throw throwable;
            }
            try {
                ByteArrayInputStream byteArrayInputStream3 = byteArrayInputStream;
                if (callSite2 != null) {
                    if (byteArrayInputStream3 == null) break block10;
                    byteArrayInputStream3 = byteArrayInputStream;
                }
                m44.a("t", (Object)byteArrayInputStream3, (long)6204053441648488633L, (long)l10);
            }
            catch (IOException iOException) {}
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x5FAB1F030C2CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -6056172556422339807L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

