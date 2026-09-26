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
    private static final long a = prr.a((long)7076484578987846030L, (long)-3527009067169693317L, MethodHandles.lookup().lookupClass()).a(158661703163788L);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public _m(File file, lb6 lb62, lb6 lb63, lb6 lb64, String string, ZipOutputStream zipOutputStream, lbo lbo2, boolean bl, long l, boolean bl2) {
        block10: {
            long l2 = l = a ^ l;
            long l3 = l2 ^ 0x44FBCBC1BFEFL;
            long l4 = l2 ^ 0x5FBECBE34767L;
            long l5 = l2 ^ 0x15ACA5DD8EAFL;
            long l6 = l2 ^ 0x36F209A2B0AAL;
            long l7 = l2 ^ 0x2E54153E7677L;
            CallSite callSite = m44.a("m", (long)6532846847005413898L, (long)l);
            CallSite callSite2 = callSite;
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                y5 y52 = new y5(l6, zipOutputStream, (String)((Object)m44.a("r", (Object)file, (long)5034408960137111813L, (long)l)), bl);
                Object[] objectArray = new Object[1];
                objectArray[0] = l4;
                new ye((InputStream)fileInputStream, l5, (OutputStream)((Object)m44.a("r", (Object)y52, (Object)objectArray, (long)6796339752681300839L, (long)l)), lbo2, string, lb62.U(l3), lb63.U(l3), lb64.U(l3), (String)((Object)m44.a("r", (Object)file, (long)5034408960137111813L, (long)l)), bl2);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l7;
                m44.a("r", (Object)y52, (Object)objectArray2, (long)6583105432403178698L, (long)l);
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
                                throw m44.a("m", (Object)iOException, (long)4888622908876042218L, (long)l);
                            }
                            fileInputStream2 = fileInputStream;
                        }
                        m44.a("r", (Object)fileInputStream2, (long)6827105316257075822L, (long)l);
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
                m44.a("r", (Object)fileInputStream3, (long)6827105316257075822L, (long)l);
            }
            catch (IOException iOException) {}
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public _m(File file, lb6 lb62, lb6 lb63, lb6 lb64, String string, File file2, lbo lbo2, boolean bl, long l) {
        block26: {
            FileOutputStream fileOutputStream;
            CallSite callSite;
            block22: {
                long l2;
                long l3;
                block21: {
                    CallSite callSite2;
                    CallSite callSite3;
                    block20: {
                        long l4 = l = a ^ l;
                        l3 = l4 ^ 0x2E8BF9591F5BL;
                        l2 = l4 ^ 0x7FDC97452E1BL;
                        CallSite callSite4 = m44.a("i", (long)-424112522269723970L, (long)l);
                        callSite3 = m44.a("v", (Object)file2, (long)-2003693737906313778L, (long)l);
                        callSite = callSite4;
                        try {
                            callSite2 = callSite3;
                            if (callSite == null) break block20;
                            if (callSite2 == null) break block21;
                        }
                        catch (IOException iOException) {
                            throw m44.a("i", (Object)iOException, (long)-2061651568666865826L, (long)l);
                        }
                        callSite2 = callSite3;
                    }
                    CallSite callSite5 = m44.a("v", (Object)callSite2, (long)-2148828407262091275L, (long)l);
                    if (callSite == null) break block21;
                    try {
                        block27: {
                            if (callSite5 != false) break block21;
                            break block27;
                            catch (IOException iOException) {
                                throw m44.a("i", (Object)iOException, (long)-2061651568666865826L, (long)l);
                            }
                        }
                        callSite5 = m44.a("v", (Object)callSite3, (long)-1921185705316982772L, (long)l);
                    }
                    catch (IOException iOException) {
                        throw m44.a("i", (Object)iOException, (long)-2061651568666865826L, (long)l);
                    }
                }
                FileInputStream fileInputStream = null;
                fileOutputStream = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    fileOutputStream = new FileOutputStream(file2);
                    new ye((InputStream)fileInputStream, l2, (OutputStream)fileOutputStream, lbo2, string, lb62.U(l3), lb63.U(l3), lb64.U(l3), (String)((Object)m44.a("v", (Object)file, (long)-2136256948470538463L, (long)l)), bl);
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
                                    throw m44.a("i", (Object)iOException, (long)-2061651568666865826L, (long)l);
                                }
                                fileInputStream2 = fileInputStream;
                            }
                            m44.a("v", (Object)fileInputStream2, (long)-141113052623293734L, (long)l);
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
                    m44.a("v", (Object)fileInputStream3, (long)-141113052623293734L, (long)l);
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
                        throw m44.a("i", (Object)iOException, (long)-2061651568666865826L, (long)l);
                    }
                    fileOutputStream2 = fileOutputStream;
                }
                m44.a("v", (Object)fileOutputStream2, (long)-2224786490460225070L, (long)l);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public _m(ZipFile zipFile, ZipEntry zipEntry, Long l, long l2, lb6 lb62, lb6 lb63, lb6 lb64, String string, ZipOutputStream zipOutputStream, _x _x2, lbo lbo2, boolean bl, boolean bl2) {
        block10: {
            long l3 = l2 = a ^ l2;
            long l4 = l3 ^ 0x43752FE82E89L;
            long l5 = l3 ^ 0x58302FCAD601L;
            long l6 = l3 ^ 0x5E28663D660BL;
            long l7 = l3 ^ 0x7BB3B5CF614FL;
            long l8 = l3 ^ 0xDD04991B51AL;
            long l9 = l3 ^ 0x122241F41FC9L;
            long l10 = l3 ^ 0x317CED8B21CCL;
            CallSite callSite = m44.a("k", (long)-3760696906638933140L, (long)l2);
            CallSite callSite2 = null;
            CallSite callSite3 = callSite;
            try {
                callSite2 = m44.a("t", (Object)zipFile, (Object)zipEntry, (long)-3330867720119716850L, (long)l2);
                Object[] objectArray = new Object[2];
                objectArray[1] = zipEntry.getName();
                objectArray[0] = l8;
                CallSite callSite4 = m44.a("t", (Object)_x2, (Object)objectArray, (long)-3328686076618499423L, (long)l2);
                y5 y52 = new y5(l10, zipOutputStream, (String)((Object)callSite4), bl);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l5;
                new ye((InputStream)((Object)callSite2), l9, (OutputStream)((Object)m44.a("t", (Object)y52, (Object)objectArray2, (long)-3515211851664788991L, (long)l2)), lbo2, string, lb62.U(l4), lb63.U(l4), lb64.U(l4), (String)((Object)m44.a("k", (Object)zipFile, (long)l7, (Object)zipEntry, (long)-2906192217669891120L, (long)l2)), bl2);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l6;
                objectArray3[0] = l;
                m44.a("t", (Object)y52, (Object)objectArray3, (long)-3213178849581717010L, (long)l2);
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
                                throw m44.a("k", (Object)iOException, (long)-3264574076281340276L, (long)l2);
                            }
                            callSite5 = callSite2;
                        }
                        m44.a("t", (Object)callSite5, (long)-3879466570857583479L, (long)l2);
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
                m44.a("t", (Object)callSite6, (long)-3879466570857583479L, (long)l2);
            }
            catch (IOException iOException) {}
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}
