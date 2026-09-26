/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._x;
import com.zelix.lb6;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.sz;
import com.zelix.v8;
import com.zelix.y5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lk1 {
    private static boolean w;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;

    public static void C(boolean bl2) {
        w = bl2;
    }

    public static boolean U() {
        return w;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public lk1(int n10, File file, lb6 lb62, byte by2, lb6 lb63, lb6 lb64, String string, int n11, File file2, v8 v82) {
        block26: {
            FileOutputStream fileOutputStream;
            CallSite callSite;
            long l10;
            block22: {
                long l11;
                long l12;
                int n12;
                int n13;
                int n14;
                block21: {
                    CallSite callSite2;
                    CallSite callSite3;
                    block20: {
                        long l13 = l10 = ((long)n10 << 32 | (long)by2 << 56 >>> 32 | (long)n11 << 40 >>> 40) ^ a;
                        long l14 = l13 ^ 0xE726E0561E1L;
                        n14 = (int)(l14 >>> 32);
                        n13 = (int)(l14 << 32 >>> 48);
                        n12 = (int)(l14 << 48 >>> 48);
                        l12 = l13 ^ 0x3498E8310C58L;
                        l11 = l13 ^ 0x33C7C3F0E374L;
                        callSite3 = m44.a("u", (Object)file2, (long)-634328898602830131L, (long)l10);
                        callSite = m44.a("j", (long)-792272913131787064L, (long)l10);
                        try {
                            callSite2 = callSite3;
                            if (callSite == false) break block20;
                            if (callSite2 == null) break block21;
                        }
                        catch (IOException iOException) {
                            throw m44.a("j", (Object)iOException, (long)-1191952648098482595L, (long)l10);
                        }
                        callSite2 = callSite3;
                    }
                    CallSite callSite4 = m44.a("u", (Object)callSite2, (long)-1067694090135014154L, (long)l10);
                    if (callSite == false) break block21;
                    try {
                        block27: {
                            if (callSite4 != false) break block21;
                            break block27;
                            catch (IOException iOException) {
                                throw m44.a("j", (Object)iOException, (long)-1191952648098482595L, (long)l10);
                            }
                        }
                        callSite4 = m44.a("u", (Object)callSite3, (long)-696499020672142577L, (long)l10);
                    }
                    catch (IOException iOException) {
                        throw m44.a("j", (Object)iOException, (long)-1191952648098482595L, (long)l10);
                    }
                }
                FileInputStream fileInputStream = null;
                fileOutputStream = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    fileOutputStream = new FileOutputStream(file2);
                    Object[] objectArray = new Object[10];
                    objectArray[9] = l11;
                    objectArray[8] = new sz(n14, (short)n13, (char)n12);
                    objectArray[7] = v82;
                    objectArray[6] = m44.a("u", (Object)file, (long)-1055698783492633566L, (long)l10);
                    objectArray[5] = lb64.U(l12);
                    objectArray[4] = lb63.U(l12);
                    objectArray[3] = lb62.U(l12);
                    objectArray[2] = string;
                    objectArray[1] = fileOutputStream;
                    objectArray[0] = fileInputStream;
                    m44.a("k", (Object)this, (Object)objectArray, (long)-601955724507016717L, (long)l10);
                }
                catch (Throwable throwable) {
                    block24: {
                        try {
                            FileInputStream fileInputStream2;
                            block23: {
                                try {
                                    fileInputStream2 = fileInputStream;
                                    if (callSite == false) break block23;
                                    if (fileInputStream2 == null) break block24;
                                }
                                catch (IOException iOException) {
                                    throw m44.a("j", (Object)iOException, (long)-1191952648098482595L, (long)l10);
                                }
                                fileInputStream2 = fileInputStream;
                            }
                            m44.a("u", (Object)fileInputStream2, (long)-1366366955906293287L, (long)l10);
                        }
                        catch (IOException iOException) {
                            // empty catch block
                        }
                    }
                    throw throwable;
                }
                try {
                    FileInputStream fileInputStream3 = fileInputStream;
                    if (callSite != false) {
                        if (fileInputStream3 == null) break block22;
                        fileInputStream3 = fileInputStream;
                    }
                    m44.a("u", (Object)fileInputStream3, (long)-1366366955906293287L, (long)l10);
                }
                catch (IOException iOException) {}
            }
            try {
                FileOutputStream fileOutputStream2;
                block25: {
                    try {
                        fileOutputStream2 = fileOutputStream;
                        if (callSite == false) break block25;
                        if (fileOutputStream2 == null) break block26;
                    }
                    catch (IOException iOException) {
                        throw m44.a("j", (Object)iOException, (long)-1191952648098482595L, (long)l10);
                    }
                    fileOutputStream2 = fileOutputStream;
                }
                m44.a("u", (Object)fileOutputStream2, (long)-1000676070167424303L, (long)l10);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public lk1(ZipFile zipFile, ZipEntry zipEntry, Long l10, lb6 lb62, long l11, lb6 lb63, lb6 lb64, String string, ZipOutputStream zipOutputStream, _x _x2, boolean bl2, v8 v82) {
        block10: {
            long l12 = l11 = a ^ l11;
            long l13 = l12 ^ 0x73F585F7910BL;
            int n10 = (int)(l13 >>> 32);
            int n11 = (int)(l13 << 32 >>> 48);
            int n12 = (int)(l13 << 48 >>> 48);
            long l14 = l12 ^ 0x491F03C3FCB2L;
            long l15 = l12 ^ 0x525A03E1043AL;
            long l16 = l12 ^ 0x54424A16B430L;
            long l17 = l12 ^ 0x7BA65BA6721L;
            long l18 = l12 ^ 0x4E402802139EL;
            long l19 = l12 ^ 0x3B16C1A0F3F7L;
            CallSite callSite = m44.a("h", (long)406984929317678558L, (long)l11);
            CallSite callSite2 = callSite;
            CallSite callSite3 = null;
            try {
                callSite3 = m44.a("w", (Object)zipFile, (Object)zipEntry, (long)287503731578709557L, (long)l11);
                Object[] objectArray = new Object[2];
                objectArray[1] = zipEntry.getName();
                objectArray[0] = l17;
                CallSite callSite4 = m44.a("w", (Object)_x2, (Object)objectArray, (long)285182308434462874L, (long)l11);
                y5 y52 = new y5(l19, zipOutputStream, (String)((Object)callSite4), bl2);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l15;
                Object[] objectArray3 = new Object[10];
                objectArray3[9] = l18;
                objectArray3[8] = new sz(n10, (short)n11, (char)n12);
                objectArray3[7] = v82;
                objectArray3[6] = zipEntry.getName();
                objectArray3[5] = lb64.U(l14);
                objectArray3[4] = lb63.U(l14);
                objectArray3[3] = lb62.U(l14);
                objectArray3[2] = string;
                objectArray3[1] = m44.a("w", (Object)y52, (Object)objectArray2, (long)2093187684308426810L, (long)l11);
                objectArray3[0] = callSite3;
                m44.a("i", (Object)this, (Object)objectArray3, (long)526659416226652441L, (long)l11);
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l16;
                objectArray4[0] = l10;
                m44.a("w", (Object)y52, (Object)objectArray4, (long)95548343929404373L, (long)l11);
            }
            catch (Throwable throwable) {
                block12: {
                    try {
                        CallSite callSite5;
                        block11: {
                            try {
                                callSite5 = callSite3;
                                if (callSite2 != false) break block11;
                                if (callSite5 == null) break block12;
                            }
                            catch (IOException iOException) {
                                throw m44.a("h", (Object)iOException, (long)2278584906239051447L, (long)l11);
                            }
                            callSite5 = callSite3;
                        }
                        m44.a("w", (Object)callSite5, (long)1734545423561670322L, (long)l11);
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                throw throwable;
            }
            try {
                CallSite callSite6 = callSite3;
                if (callSite2 == false) {
                    if (callSite6 == null) break block10;
                    callSite6 = callSite3;
                }
                m44.a("w", (Object)callSite6, (long)1734545423561670322L, (long)l11);
            }
            catch (IOException iOException) {}
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public lk1(long l10, File file, lb6 lb62, lb6 lb63, lb6 lb64, String string, ZipOutputStream zipOutputStream, boolean bl2, v8 v82, sz sz2) {
        block10: {
            long l11 = l10 = a ^ l10;
            long l12 = l11 ^ 0x1626DA29DC8L;
            long l13 = l11 ^ 0x1A276D806540L;
            long l14 = l11 ^ 0x63D466372E4L;
            long l15 = l11 ^ 0x736BAFC1928DL;
            long l16 = l11 ^ 0x6BCDB35D5450L;
            CallSite callSite = m44.a("j", (long)7268720593758555300L, (long)l10);
            FileInputStream fileInputStream = null;
            CallSite callSite2 = callSite;
            try {
                fileInputStream = new FileInputStream(file);
                y5 y52 = new y5(l15, zipOutputStream, (String)((Object)m44.a("u", (Object)file, (long)7492465716124650274L, (long)l10)), bl2);
                Object[] objectArray = new Object[1];
                objectArray[0] = l13;
                Object[] objectArray2 = new Object[10];
                objectArray2[9] = l14;
                objectArray2[8] = sz2;
                objectArray2[7] = v82;
                objectArray2[6] = m44.a("u", (Object)file, (long)6974196165685255602L, (long)l10);
                objectArray2[5] = lb64.U(l12);
                objectArray2[4] = lb63.U(l12);
                objectArray2[3] = lb62.U(l12);
                objectArray2[2] = string;
                objectArray2[1] = m44.a("u", (Object)y52, (Object)objectArray, (long)8968416622352810304L, (long)l10);
                objectArray2[0] = fileInputStream;
                m44.a("k", (Object)this, (Object)objectArray2, (long)7364891239363936355L, (long)l10);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l16;
                m44.a("u", (Object)y52, (Object)objectArray3, (long)8754054409374586605L, (long)l10);
            }
            catch (Throwable throwable) {
                block12: {
                    try {
                        FileInputStream fileInputStream2;
                        block11: {
                            try {
                                fileInputStream2 = fileInputStream;
                                if (callSite2 != false) break block11;
                                if (fileInputStream2 == null) break block12;
                            }
                            catch (IOException iOException) {
                                throw m44.a("j", (Object)iOException, (long)9143820838231041997L, (long)l10);
                            }
                            fileInputStream2 = fileInputStream;
                        }
                        m44.a("u", (Object)fileInputStream2, (long)8978354137172029513L, (long)l10);
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                throw throwable;
            }
            try {
                FileInputStream fileInputStream3 = fileInputStream;
                if (callSite2 == false) {
                    if (fileInputStream3 == null) break block10;
                    fileInputStream3 = fileInputStream;
                }
                m44.a("u", (Object)fileInputStream3, (long)8978354137172029513L, (long)l10);
            }
            catch (IOException iOException) {}
        }
    }

    /*
     * Exception decompiling
     */
    private void b(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [42[WHILELOOP], 43[DOLOOP], 41[DOLOOP]], but top level block is 9[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static boolean f() {
        boolean bl2 = lk1.U();
        return !bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a(5884345499685647344L, 4947394325692683017L, MethodHandles.lookup().lookupClass()).a(187547528443800L);
        long l10 = a ^ 0x3F58CE1A2A70L;
        d = new HashMap(13);
        m44.a("o", (boolean)true, (long)3012553908649855478L, (long)l10);
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
        String[] stringArray = new String[3];
        int n10 = 0;
        String string = "\u00c5A\u008a\u00f8;\u00ccn\u00ad\u00e6\u00d5\u00a8\u00e7\u00acv\u008e\u00d3\u0018g\u0000t\u0015\fh\u00ba\u000b1\u00ba\"\u00eeC\u00ed\u00b6\u00fe~\u0092R\u007fNus\n\u0010~P\u00d8E\u0086\u00f3UV\u0098YA\u009eq\u00c0~0";
        int n11 = "\u00c5A\u008a\u00f8;\u00ccn\u00ad\u00e6\u00d5\u00a8\u00e7\u00acv\u008e\u00d3\u0018g\u0000t\u0015\fh\u00ba\u000b1\u00ba\"\u00eeC\u00ed\u00b6\u00fe~\u0092R\u007fNus\n\u0010~P\u00d8E\u0086\u00f3UV\u0098YA\u009eq\u00c0~0".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = lk1.a(byArray3).intern();
            if ((n13 += n12) >= n11) break;
            n12 = string.charAt(n13);
        }
        b = stringArray;
        c = new String[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        int n15 = 1;
        while (true) {
            if (n15 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l11 = -6558956323895656613L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                e = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n15] = (byte)(l10 << n15 * 8 >>> 56);
            ++n15;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x6563;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lk1", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            lk1.c[n11] = lk1.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lk1.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lk1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lk1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

