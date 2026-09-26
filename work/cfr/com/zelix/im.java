/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.iq;
import com.zelix.iw;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o9;
import com.zelix.prr;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class im
extends iw {
    private final int[] e;
    private final int G;
    private static final long b = prr.a(5151424063714534290L, 4194196472724580782L, MethodHandles.lookup().lookupClass()).a(189514499570078L);
    private static final String[] c;
    private static final String[] d;
    private static final Map h;
    private static final long[] k;
    private static final Integer[] m;
    private static final Map n;

    @Override
    public void G(short s10, int n10, DataOutputStream dataOutputStream, int n11) {
        long l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
        long l11 = l10 ^ 0L;
        int n12 = (int)(l11 >>> 48);
        int n13 = (int)(l11 << 16 >>> 32);
        int n14 = (int)(l11 << 48 >>> 48);
        CallSite callSite = m44.a("m", (long)554967545379015791L, (long)l10);
        super.G((short)n12, n13, dataOutputStream, n14);
        m44.a("r", (Object)dataOutputStream, (int)m44.a("s", (Object)this, (long)292380030634215886L, (long)l10), (long)2304601887738989656L, (long)l10);
        CallSite callSite2 = callSite;
        block0: for (int i10 = 0; i10 < m44.a("s", (Object)this, (long)292380030634215886L, (long)l10); ++i10) {
            m44.a("r", (Object)dataOutputStream, (int)m44.a("s", (Object)this, (long)2288941599368028805L, (long)l10)[i10], (long)2304601887738989656L, (long)l10);
            do {
                iq iq2 = this.g[i10];
                m44.a("r", (Object)dataOutputStream, (int)(iq2.B() - m44.a("s", (Object)this, (long)1777123409618232460L, (long)l10)), (long)2304601887738989656L, (long)l10);
                if (callSite2 != false) continue block0;
            } while (s10 < 0);
        }
    }

    @Override
    public int T(char c10, int n10, char c11) {
        long l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)c11 << 48 >>> 48;
        return 1 + m44.a("t", (Object)this, (long)-3103780059283997398L, (long)l10) + im.c("z", (int)495, (long)(0x7E0459B186E349F5L ^ l10)) + m44.a("t", (Object)this, (long)-3280405769562611783L, (long)l10) * im.c("z", (int)12751, (long)(0x4BEDCBB4E38CF9D7L ^ l10));
    }

    @Override
    public String l(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0x3926A82327E7L;
        int n10 = (int)(l11 >>> 32);
        int n11 = (int)(l11 << 32 >>> 56);
        int n12 = (int)(l11 << 40 >>> 40);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n12;
        objectArray2[1] = (int)((byte)n11);
        objectArray2[0] = n10;
        return m44.a("s", (Object)this, (Object)objectArray2, (long)-7550383759637692338L, (long)l10);
    }

    im(h1 h12, int n10, long l10, l6q l6q2) {
        Integer n11;
        long l11;
        block2: {
            long l12 = l10 = b ^ l10;
            long l13 = l12 ^ 0x1173491E741BL;
            long l14 = l12 ^ 0x5E763F4E249AL;
            int n12 = (int)(l14 >>> 32);
            int n13 = (int)(l14 << 32 >>> 48);
            int n14 = (int)(l14 << 48 >>> 48);
            l11 = l12 ^ 0x685DC56F3E26L;
            CallSite callSite = m44.a("i", (long)6167492018612723108L, (long)l10);
            super((int)im.c("z", (int)26221, (long)(0x53948F3594A335F7L ^ l10)), h12, n12, (char)n13, (char)n14, n10);
            CallSite callSite2 = callSite;
            int n15 = h12.readInt();
            this.G = h12.readInt();
            this.e = new int[m44.a("w", (Object)this, (long)5330764091914945594L, (long)l10)];
            this.g = new iq[m44.a("w", (Object)this, (long)5330764091914945594L, (long)l10) + true];
            this.Z = new ArrayList(this.g.length);
            for (int i10 = 0; i10 < m44.a("w", (Object)this, (long)5330764091914945594L, (long)l10); ++i10) {
                int n16 = h12.readInt();
                m44.a("w", (Object)this, (long)5924458808973946737L, (long)l10)[i10] = (CallSite)n16;
                int n17 = h12.readInt();
                n11 = ((o9)((Object)m44.a("m", (long)5535669174584766126L, (long)l10))).e(l13, (int)(m44.a("w", (Object)this, (long)6151230958267935096L, (long)l10) + n17));
                if (callSite2 == false) {
                    Integer n18 = n11;
                    l6q2.t(n18, this, l11);
                    this.Z.add(n18);
                    if (callSite2 == false) continue;
                }
                break block2;
            }
            n11 = ((o9)((Object)m44.a("m", (long)5535669174584766126L, (long)l10))).e(l13, (int)(m44.a("w", (Object)this, (long)6151230958267935096L, (long)l10) + n15));
        }
        Integer n19 = n11;
        l6q2.t(n19, this, l11);
        this.Z.add(n19);
    }

    @Override
    public void h(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        PrintWriter printWriter;
        CallSite callSite;
        long l10;
        StringBuilder stringBuilder2;
        PrintWriter printWriter2;
        long l11;
        block10: {
            iq iq2;
            block6: {
                iq iq3;
                block5: {
                    l11 = (Long)objectArray[0];
                    printWriter2 = (PrintWriter)objectArray[1];
                    stringBuilder2 = (StringBuilder)objectArray[2];
                    long l12 = l11;
                    long l13 = l12 ^ 0x8A9056647FBL;
                    int n10 = (int)(l13 >>> 32);
                    int n11 = (int)(l13 << 32 >>> 56);
                    int n12 = (int)(l13 << 40 >>> 40);
                    l10 = l12 ^ 0x1958DC7C99DL;
                    CallSite callSite2 = m44.a("h", (long)-1142121718372861931L, (long)l11);
                    StringBuilder stringBuilder3 = new StringBuilder();
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = n12;
                    objectArray2[1] = (int)((byte)n11);
                    objectArray2[0] = n10;
                    stringBuilder3.append((String)((Object)m44.a("w", (Object)this, (Object)objectArray2, (long)-636251684499120046L, (long)l11)));
                    printWriter2.println(stringBuilder2.toString() + stringBuilder3.toString());
                    callSite = callSite2;
                    iq2 = this.g[this.g.length - 1];
                    try {
                        printWriter = printWriter2;
                        stringBuilder = new StringBuilder().append(stringBuilder2.toString()).append((String)((Object)im.b("u", (int)1278, (long)(0x6EFAAE87614EACC8L ^ l11))));
                        iq3 = iq2;
                        if (callSite != false) break block5;
                        if (iq3 == null) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-887012619855673241L, (long)l11);
                    }
                    iq3 = iq2;
                }
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l10;
                object = m44.a("w", (Object)iq3, (Object)objectArray3, (long)-839484870266077503L, (long)l11);
                break block10;
            }
            object = iq2;
        }
        printWriter.println(stringBuilder.append(object).toString());
        for (int i10 = 0; i10 < m44.a("v", (Object)this, (long)-1419857931428945525L, (long)l11); ++i10) {
            Object object2;
            StringBuilder stringBuilder4;
            PrintWriter printWriter3;
            block7: {
                iq iq4;
                block9: {
                    iq iq5;
                    block8: {
                        iq4 = this.g[i10];
                        try {
                            printWriter3 = printWriter2;
                            stringBuilder4 = new StringBuilder().append(stringBuilder2.toString()).append((String)((Object)im.b("u", (int)2439, (long)(0x2F9A3577E587A1B0L ^ l11)))).append((int)m44.a("v", (Object)this, (long)-610540198806893888L, (long)l11)[i10]);
                            object2 = im.b("u", (int)32523, (long)(0x4BC29EC826CC573FL ^ l11));
                            if (l11 <= 0L) break block7;
                            stringBuilder4 = stringBuilder4.append((String)object2);
                            iq5 = iq4;
                            if (callSite != false) break block8;
                            if (iq5 == null) break block9;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)n93, (long)-887012619855673241L, (long)l11);
                        }
                        iq5 = iq4;
                    }
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l10;
                    object2 = m44.a("w", (Object)iq5, (Object)objectArray4, (long)-839484870266077503L, (long)l11);
                    break block7;
                }
                object2 = iq4;
            }
            printWriter3.println(stringBuilder4.append(object2).toString());
            if (callSite == false) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new HashMap(13);
        long l10 = b ^ 0x471522BA8B9BL;
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
        String string = "[\u0097d\u00ba\u00ff\u009em\u0004\u00e6\u0097\u008d\u00d5\u00ca8!\u00d7\u0000n\u00df;\u00fcc\u00020\u0010\u0098\u0016<\u008c\u00cc\u00ae\u00d2|\u008dS~vH\u0000\u001aD\u0010;\u0091\u00db>\u00a3_]\u00ca\u0016\u00ea\u00dfm\u00ef^!]";
        int n11 = "[\u0097d\u00ba\u00ff\u009em\u0004\u00e6\u0097\u008d\u00d5\u00ca8!\u00d7\u0000n\u00df;\u00fcc\u00020\u0010\u0098\u0016<\u008c\u00cc\u00ae\u00d2|\u008dS~vH\u0000\u001aD\u0010;\u0091\u00db>\u00a3_]\u00ca\u0016\u00ea\u00dfm\u00ef^!]".length();
        int n12 = 24;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = im.b(byArray3).intern();
            if ((n13 += n12) >= n11) break;
            n12 = string.charAt(n13);
        }
        c = stringArray;
        d = new String[3];
        n = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l10 >>> 56);
        for (int i11 = 1; i11 < 8; ++i11) {
            byArray5 = byArray5;
            byArray5[i11] = (byte)(l10 << i11 * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n15 = 0;
        String string2 = "c\u00af\u00e4tC\u000f\n\u00d8\u00d9\nt\u00ec6\u0085\u0016H\u00a3\u009d=\u00dc\u00afv\u0014;";
        int n16 = "c\u00af\u00e4tC\u000f\n\u00d8\u00d9\nt\u00ec6\u0085\u0016H\u00a3\u009d=\u00dc\u00afv\u0014;".length();
        int n17 = 0;
        do {
            byte[] byArray6 = string2.substring(n17, n17 += 8).getBytes("ISO-8859-1");
            int n18 = n15++;
            long l11 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n18] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n17 < n16);
        k = lArray;
        m = new Integer[3];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4EA9;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/im", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            im.d[n11] = im.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = im.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/im" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x10B5;
        if (m[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = k[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])n.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/im", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            im.m[n11] = n12;
        }
        return m[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = im.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/im" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(im.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(im.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

