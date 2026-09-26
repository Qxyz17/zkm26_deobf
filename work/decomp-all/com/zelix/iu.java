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

public class iu
extends iw {
    private final int v;
    private final int b;
    private int m;
    private static final long c = prr.a((long)-7376087642677509257L, (long)-1939545006540068079L, MethodHandles.lookup().lookupClass()).a(257693000197430L);
    private static final String[] d;
    private static final String[] e;
    private static final Map h;
    private static final long[] k;
    private static final Integer[] n;
    private static final Map t;

    public String l(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x3926A82327E7L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 56);
        int n3 = (int)(l2 << 40 >>> 40);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n3;
        objectArray2[1] = (int)((byte)n2);
        objectArray2[0] = n;
        return m44.a("s", (Object)((Object)this), (Object)objectArray2, (long)-7550383759637692338L, (long)l);
    }

    iu(h1 h12, long l, int n, l6q l6q2) {
        Integer n2;
        long l2;
        block2: {
            long l3 = l = c ^ l;
            long l4 = l3 ^ 0x7297C7C528C3L;
            long l5 = l3 ^ 0x3D92B1957842L;
            int n3 = (int)(l5 >>> 32);
            int n4 = (int)(l5 << 32 >>> 48);
            int n5 = (int)(l5 << 48 >>> 48);
            l2 = l3 ^ 0xBB94BB462FEL;
            super((int)iu.c("c", (int)29363, (long)(0x431840997FEBDC7CL ^ l)), h12, n3, (char)n4, (char)n5, n);
            CallSite callSite = m44.a("i", (long)1630255005838990659L, (long)l);
            m44.a("u", (Object)((Object)this), (int)-1, (long)945497019918806269L, (long)l);
            CallSite callSite2 = callSite;
            int n6 = h12.readInt();
            this.v = h12.readInt();
            this.b = h12.readInt();
            m44.a("u", (Object)((Object)this), (int)(m44.a("w", (Object)((Object)this), (long)715755750655944696L, (long)l) - m44.a("w", (Object)((Object)this), (long)1084994617650137306L, (long)l) + true), (long)945497019918806269L, (long)l);
            this.g = new iq[m44.a("w", (Object)((Object)this), (long)945497019918806269L, (long)l) + true];
            this.Z = new ArrayList(this.g.length);
            for (int i = 0; i < m44.a("w", (Object)((Object)this), (long)945497019918806269L, (long)l); ++i) {
                int n7 = h12.readInt();
                n2 = m44.a("m", (long)1155954148666978934L, (long)l).e(l4, (int)(m44.a("w", (Object)((Object)this), (long)686214087950562720L, (long)l) + n7));
                if (callSite2 != false) {
                    Integer n8 = n2;
                    l6q2.t((Object)n8, (Object)this, l2);
                    this.Z.add(n8);
                    if (callSite2 != false) continue;
                    m44.a("i", (Object)"ccaRw", (long)749383792221088741L, (long)l);
                    break;
                }
                break block2;
            }
            n2 = m44.a("m", (long)1155954148666978934L, (long)l).e(l4, (int)(m44.a("w", (Object)((Object)this), (long)686214087950562720L, (long)l) + n6));
        }
        Integer n10 = n2;
        l6q2.t((Object)n10, (Object)this, l2);
        this.Z.add(n10);
    }

    public int T(char c, int n, char c2) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48;
        return 1 + m44.a("t", (Object)((Object)this), (long)-3103780059283997398L, (long)l) + iu.c("c", (int)18445, (long)(0x6AB4D569DCC0A19AL ^ l)) + m44.a("t", (Object)((Object)this), (long)-3871843865631413338L, (long)l) * 4;
    }

    public void G(short s, int n, DataOutputStream dataOutputStream, int n2) {
        long l = (long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48;
        long l2 = l ^ 0L;
        int n3 = (int)(l2 >>> 48);
        int n4 = (int)(l2 << 16 >>> 32);
        int n5 = (int)(l2 << 48 >>> 48);
        CallSite callSite = m44.a("m", (long)1757326295451471952L, (long)l);
        super.G((short)n3, n4, dataOutputStream, n5);
        m44.a("r", (Object)dataOutputStream, (int)m44.a("s", (Object)((Object)this), (long)2171540531447159286L, (long)l), (long)2304601887738989656L, (long)l);
        CallSite callSite2 = callSite;
        m44.a("r", (Object)dataOutputStream, (int)m44.a("s", (Object)((Object)this), (long)1784147077940410068L, (long)l), (long)2304601887738989656L, (long)l);
        for (int i = 0; i < m44.a("s", (Object)((Object)this), (long)2032078663272988113L, (long)l); ++i) {
            iq iq2 = this.g[i];
            m44.a("r", (Object)dataOutputStream, (int)(iq2.B() - m44.a("s", (Object)((Object)this), (long)1777123409618232460L, (long)l)), (long)2304601887738989656L, (long)l);
            if (callSite2 == false) continue;
        }
    }

    public iu(iq iq2, int n, long l, int n2, iq[] iqArray) {
        block6: {
            l = c ^ l;
            CallSite callSite = m44.a("n", (long)-729386974882349508L, (long)l);
            super((int)iu.c("c", (int)3068, (long)(0x5D5E2579CC93C64EL ^ l)));
            m44.a("r", (Object)((Object)this), (int)-1, (long)-1269889042888945790L, (long)l);
            CallSite callSite2 = callSite;
            this.v = n;
            this.b = n2;
            m44.a("r", (Object)((Object)this), (int)(m44.a("p", (Object)((Object)this), (long)-1544305641969384313L, (long)l) - m44.a("p", (Object)((Object)this), (long)-1409122040576889947L, (long)l) + true), (long)-1269889042888945790L, (long)l);
            this.g = new iq[m44.a("p", (Object)((Object)this), (long)-1269889042888945790L, (long)l) + true];
            int n3 = 0;
            block2: while (n3 < m44.a("p", (Object)((Object)this), (long)-1269889042888945790L, (long)l)) {
                try {
                    this.g[n3] = iqArray[n3];
                    ++n3;
                    do {
                        CallSite callSite3 = callSite2;
                        if (l > 0L) {
                            if (callSite3 == false) break block6;
                            callSite3 = callSite2;
                        }
                        if (callSite3 != false) continue block2;
                    } while (l <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)((Object)n92), (long)-952868671192971264L, (long)l);
                }
            }
            this.g[this.g.length - 1] = iq2;
        }
    }

    public void h(Object[] objectArray) {
        Object object;
        StringBuilder stringBuilder;
        PrintWriter printWriter;
        CallSite callSite;
        long l;
        StringBuilder stringBuilder2;
        PrintWriter printWriter2;
        long l2;
        block10: {
            iq iq2;
            block6: {
                iq iq3;
                block5: {
                    l2 = (Long)objectArray[0];
                    printWriter2 = (PrintWriter)objectArray[1];
                    stringBuilder2 = (StringBuilder)objectArray[2];
                    long l3 = l2;
                    long l4 = l3 ^ 0x8A9056647FBL;
                    int n = (int)(l4 >>> 32);
                    int n2 = (int)(l4 << 32 >>> 56);
                    int n3 = (int)(l4 << 40 >>> 40);
                    l = l3 ^ 0x1958DC7C99DL;
                    StringBuilder stringBuilder3 = new StringBuilder();
                    CallSite callSite2 = m44.a("h", (long)-1155528826364025814L, (long)l2);
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = n3;
                    objectArray2[1] = (int)((byte)n2);
                    objectArray2[0] = n;
                    stringBuilder3.append((String)((Object)m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-636251684499120046L, (long)l2)));
                    printWriter2.println(stringBuilder2.toString() + stringBuilder3.toString());
                    callSite = callSite2;
                    iq2 = this.g[this.g.length - 1];
                    try {
                        printWriter = printWriter2;
                        stringBuilder = new StringBuilder().append(stringBuilder2.toString()).append((String)((Object)iu.b("d", (int)17667, (long)(0x4FB74C6F1F84F567L ^ l2))));
                        iq3 = iq2;
                        if (callSite == false) break block5;
                        if (iq3 == null) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-1670637329452117482L, (long)l2);
                    }
                    iq3 = iq2;
                }
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l;
                object = m44.a("w", (Object)iq3, (Object)objectArray3, (long)-839484870266077503L, (long)l2);
                break block10;
            }
            object = iq2;
        }
        printWriter.println(stringBuilder.append(object).toString());
        for (int i = 0; i < m44.a("v", (Object)((Object)this), (long)-831340284531993196L, (long)l2); ++i) {
            CallSite callSite3;
            StringBuilder stringBuilder3;
            PrintWriter printWriter3;
            block7: {
                iq iq4;
                block9: {
                    iq iq5;
                    block8: {
                        iq4 = this.g[i];
                        reference var16_14 = m44.a("v", (Object)((Object)this), (long)-691368277331168845L, (long)l2) + i;
                        try {
                            printWriter3 = printWriter2;
                            stringBuilder3 = new StringBuilder().append(stringBuilder2.toString()).append((String)((Object)iu.b("d", (int)23001, (long)(0x249459F286F469BCL ^ l2)))).append((int)var16_14);
                            callSite3 = iu.b("d", (int)5126, (long)(0x362CE129FFC72461L ^ l2));
                            if (l2 < 0L) break block7;
                            stringBuilder3 = stringBuilder3.append((String)((Object)callSite3));
                            iq5 = iq4;
                            if (callSite == false) break block8;
                            if (iq5 == null) break block9;
                        }
                        catch (n9 n93) {
                            throw m44.a("h", (Object)((Object)n93), (long)-1670637329452117482L, (long)l2);
                        }
                        iq5 = iq4;
                    }
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l;
                    callSite3 = m44.a("w", (Object)iq5, (Object)objectArray4, (long)-839484870266077503L, (long)l2);
                    break block7;
                }
                callSite3 = iq4;
            }
            printWriter3.println(stringBuilder3.append(callSite3).toString());
            if (callSite != false) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new HashMap(13);
        long l = c ^ 0x1AE99D28D43L;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\b\t7I0W\u00f8\u00a9t\u00f0\u00d2\u00a0+\\E\u0095 \u00e3uk\u001fi\u0096Or\u008d\u001a\u00ec2\u00f5^\u00d2\u00f6\u00c8\u00c5c\u00e7\u0015\u0012\u00f7\u00c81\u00c9G5K\u0016\u00ed+\u0010\u00e9\u00a4\u009e\u0082s\u0012\u00f9i`\u00fd\u0091\u0003\u00d5\u0095KN";
        int n2 = "\b\t7I0W\u00f8\u00a9t\u00f0\u00d2\u00a0+\\E\u0095 \u00e3uk\u001fi\u0096Or\u008d\u001a\u00ec2\u00f5^\u00d2\u00f6\u00c8\u00c5c\u00e7\u0015\u0012\u00f7\u00c81\u00c9G5K\u0016\u00ed+\u0010\u00e9\u00a4\u009e\u0082s\u0012\u00f9i`\u00fd\u0091\u0003\u00d5\u0095KN".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = iu.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        d = stringArray;
        e = new String[3];
        t = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n6 = 0;
        String string2 = "\u00aa \u00b8\u00f3\f\u009c\u00f5|\u0016\u00c9\u00d5\b\u00e4#\u0017\u00ffe\u00bf\u0084k\u009dy\u00b5\u00eb";
        int n7 = "\u00aa \u00b8\u00f3\f\u009c\u00f5|\u0016\u00c9\u00d5\b\u00e4#\u0017\u00ffe\u00bf\u0084k\u009dy\u00b5\u00eb".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n10 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n10] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        k = lArray;
        iu.n = new Integer[3];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x56FA;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/iu", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            iu.e[n2] = iu.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = iu.b(n, l);
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
            throw new RuntimeException("com/zelix/iu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x313B;
        if (iu.n[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/iu", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iu.n[n2] = n3;
        }
        return iu.n[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = iu.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/iu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(iu.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(iu.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
