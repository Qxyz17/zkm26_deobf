/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._x;
import com.zelix.lb6;
import com.zelix.lbo;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.y5;
import com.zelix.ye;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class _m {
    private static final long a = prr.a(7076484578987846030L, -3527009067169693317L, MethodHandles.lookup().lookupClass()).a(158661703163788L);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public _m(File file, lb6 lb62, lb6 lb63, lb6 lb64, String string, ZipOutputStream zipOutputStream, lbo lbo2, boolean bl2, long l10, boolean bl3) {
        block10: {
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x44FBCBC1BFEFL;
            long l13 = l11 ^ 0x5FBECBE34767L;
            long l14 = l11 ^ 0x15ACA5DD8EAFL;
            long l15 = l11 ^ 0x36F209A2B0AAL;
            long l16 = l11 ^ 0x2E54153E7677L;
            CallSite callSite = m44.a("m", (long)6532846847005413898L, (long)l10);
            CallSite callSite2 = callSite;
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                y5 y52 = new y5(l15, zipOutputStream, (String)((Object)m44.a("r", (Object)file, (long)5034408960137111813L, (long)l10)), bl2);
                Object[] objectArray = new Object[1];
                objectArray[0] = l13;
                new ye(fileInputStream, l14, (OutputStream)((Object)m44.a("r", (Object)y52, (Object)objectArray, (long)6796339752681300839L, (long)l10)), lbo2, string, lb62.U(l12), lb63.U(l12), lb64.U(l12), (String)((Object)m44.a("r", (Object)file, (long)5034408960137111813L, (long)l10)), bl3);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l16;
                m44.a("r", (Object)y52, (Object)objectArray2, (long)6583105432403178698L, (long)l10);
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
                                throw m44.a("m", (Object)iOException, (long)4888622908876042218L, (long)l10);
                            }
                            fileInputStream2 = fileInputStream;
                        }
                        m44.a("r", (Object)fileInputStream2, (long)6827105316257075822L, (long)l10);
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
                m44.a("r", (Object)fileInputStream3, (long)6827105316257075822L, (long)l10);
            }
            catch (IOException iOException) {}
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public _m(File file, lb6 lb62, lb6 lb63, lb6 lb64, String string, File file2, lbo lbo2, boolean bl2, long l10) {
        block26: {
            FileOutputStream fileOutputStream;
            CallSite callSite;
            block22: {
                long l11;
                long l12;
                block21: {
                    CallSite callSite2;
                    CallSite callSite3;
                    block20: {
                        long l13 = l10 = a ^ l10;
                        l12 = l13 ^ 0x2E8BF9591F5BL;
                        l11 = l13 ^ 0x7FDC97452E1BL;
                        CallSite callSite4 = m44.a("i", (long)-424112522269723970L, (long)l10);
                        callSite3 = m44.a("v", (Object)file2, (long)-2003693737906313778L, (long)l10);
                        callSite = callSite4;
                        try {
                            callSite2 = callSite3;
                            if (callSite == null) break block20;
                            if (callSite2 == null) break block21;
                        }
                        catch (IOException iOException) {
                            throw m44.a("i", (Object)iOException, (long)-2061651568666865826L, (long)l10);
                        }
                        callSite2 = callSite3;
                    }
                    CallSite callSite5 = m44.a("v", (Object)callSite2, (long)-2148828407262091275L, (long)l10);
                    if (callSite == null) break block21;
                    try {
                        block27: {
                            if (callSite5 != false) break block21;
                            break block27;
                            catch (IOException iOException) {
                                throw m44.a("i", (Object)iOException, (long)-2061651568666865826L, (long)l10);
                            }
                        }
                        callSite5 = m44.a("v", (Object)callSite3, (long)-1921185705316982772L, (long)l10);
                    }
                    catch (IOException iOException) {
                        throw m44.a("i", (Object)iOException, (long)-2061651568666865826L, (long)l10);
                    }
                }
                FileInputStream fileInputStream = null;
                fileOutputStream = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    fileOutputStream = new FileOutputStream(file2);
                    new ye(fileInputStream, l11, fileOutputStream, lbo2, string, lb62.U(l12), lb63.U(l12), lb64.U(l12), (String)((Object)m44.a("v", (Object)file, (long)-2136256948470538463L, (long)l10)), bl2);
                }
                catch (Throwable throwable) {
                    block24: {
                        try {
                            FileInputStream fileInputStream2;
                            block23: {
                                try {
                                    fileInputStream2 = fileInputStream;
                                    if (callSite == null) break block23;
                                    if (fileInputStream2 == null) break block24;
                                }
                                catch (IOException iOException) {
                                    throw m44.a("i", (Object)iOException, (long)-2061651568666865826L, (long)l10);
                                }
                                fileInputStream2 = fileInputStream;
                            }
                            m44.a("v", (Object)fileInputStream2, (long)-141113052623293734L, (long)l10);
                        }
                        catch (IOException iOException) {
                            // empty catch block
                        }
                    }
                    throw throwable;
                }
                try {
                    FileInputStream fileInputStream3 = fileInputStream;
                    if (callSite != null) {
                        if (fileInputStream3 == null) break block22;
                        fileInputStream3 = fileInputStream;
                    }
                    m44.a("v", (Object)fileInputStream3, (long)-141113052623293734L, (long)l10);
                }
                catch (IOException iOException) {}
            }
            try {
                FileOutputStream fileOutputStream2;
                block25: {
                    try {
                        fileOutputStream2 = fileOutputStream;
                        if (callSite == null) break block25;
                        if (fileOutputStream2 == null) break block26;
                    }
                    catch (IOException iOException) {
                        throw m44.a("i", (Object)iOException, (long)-2061651568666865826L, (long)l10);
                    }
                    fileOutputStream2 = fileOutputStream;
                }
                m44.a("v", (Object)fileOutputStream2, (long)-2224786490460225070L, (long)l10);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public _m(ZipFile zipFile, ZipEntry zipEntry, Long l10, long l11, lb6 lb62, lb6 lb63, lb6 lb64, String string, ZipOutputStream zipOutputStream, _x _x2, lbo lbo2, boolean bl2, boolean bl3) {
        block10: {
            long l12 = l11 = a ^ l11;
            long l13 = l12 ^ 0x43752FE82E89L;
            long l14 = l12 ^ 0x58302FCAD601L;
            long l15 = l12 ^ 0x5E28663D660BL;
            long l16 = l12 ^ 0x7BB3B5CF614FL;
            long l17 = l12 ^ 0xDD04991B51AL;
            long l18 = l12 ^ 0x122241F41FC9L;
            long l19 = l12 ^ 0x317CED8B21CCL;
            CallSite callSite = m44.a("k", (long)-3760696906638933140L, (long)l11);
            CallSite callSite2 = null;
            CallSite callSite3 = callSite;
            try {
                callSite2 = m44.a("t", (Object)zipFile, (Object)zipEntry, (long)-3330867720119716850L, (long)l11);
                Object[] objectArray = new Object[2];
                objectArray[1] = zipEntry.getName();
                objectArray[0] = l17;
                CallSite callSite4 = m44.a("t", (Object)_x2, (Object)objectArray, (long)-3328686076618499423L, (long)l11);
                y5 y52 = new y5(l19, zipOutputStream, (String)((Object)callSite4), bl2);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l14;
                new ye((InputStream)((Object)callSite2), l18, (OutputStream)((Object)m44.a("t", (Object)y52, (Object)objectArray2, (long)-3515211851664788991L, (long)l11)), lbo2, string, lb62.U(l13), lb63.U(l13), lb64.U(l13), (String)((Object)m44.a("k", (Object)zipFile, (long)l16, (Object)zipEntry, (long)-2906192217669891120L, (long)l11)), bl3);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l15;
                objectArray3[0] = l10;
                m44.a("t", (Object)y52, (Object)objectArray3, (long)-3213178849581717010L, (long)l11);
            }
            catch (Throwable throwable) {
                block12: {
                    try {
                        CallSite callSite5;
                        block11: {
                            try {
                                callSite5 = callSite2;
                                if (callSite3 == null) break block11;
                                if (callSite5 == null) break block12;
                            }
                            catch (IOException iOException) {
                                throw m44.a("k", (Object)iOException, (long)-3264574076281340276L, (long)l11);
                            }
                            callSite5 = callSite2;
                        }
                        m44.a("t", (Object)callSite5, (long)-3879466570857583479L, (long)l11);
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                throw throwable;
            }
            try {
                CallSite callSite6 = callSite2;
                if (callSite3 != null) {
                    if (callSite6 == null) break block10;
                    callSite6 = callSite2;
                }
                m44.a("t", (Object)callSite6, (long)-3879466570857583479L, (long)l11);
            }
            catch (IOException iOException) {}
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

