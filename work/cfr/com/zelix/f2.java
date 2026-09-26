/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqk;
import com.zelix.lqo;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.uk;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class f2
extends JComboBox
implements ItemListener,
uk {
    private DefaultComboBoxModel c;
    private static final long a = prr.a(8889009188017176602L, 4027469902271510597L, MethodHandles.lookup().lookupClass()).a(99032308361141L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;

    /*
     * Unable to fully structure code
     */
    public void S(Object[] var1_1) {
        block20: {
            block21: {
                block19: {
                    block17: {
                        var5_2 = (Integer)var1_1[0];
                        var4_3 = (lqo[])var1_1[1];
                        var2_4 = (Long)var1_1[2];
                        var2_4 = f2.a ^ var2_4;
                        v0 = m44.a("l", (long)-1849483394295766318L, (long)var2_4);
                        m44.a("p", (Object)this, new DefaultComboBoxModel<E>(), (long)-29795169579849662L, (long)var2_4);
                        var6_5 = v0;
                        try {
                            block18: {
                                try {
                                    try {
                                        try {
                                            if (var6_5 != null) break block17;
                                            if (var4_3 == null) break block18;
                                        }
                                        catch (n9 v1) {
                                            throw m44.a("l", (Object)v1, (long)-2195071899250983726L, (long)var2_4);
                                        }
                                        v2 = var4_3.length;
                                        if (var6_5 != null) break block19;
                                    }
                                    catch (n9 v3) {
                                        throw m44.a("l", (Object)v3, (long)-2195071899250983726L, (long)var2_4);
                                    }
                                    if (var2_4 <= 0L) break block19;
                                    if (v2 == 0) {
                                    }
                                    ** GOTO lbl38
                                }
                                catch (n9 v4) {
                                    throw m44.a("l", (Object)v4, (long)-2195071899250983726L, (long)var2_4);
                                }
                            }
                            m44.a("s", (Object)m44.a("r", (Object)this, (long)-29795169579849662L, (long)var2_4), (Object)new lqk(), (long)-336393227602497975L, (long)var2_4);
                        }
                        catch (n9 v5) {
                            throw m44.a("l", (Object)v5, (long)-2195071899250983726L, (long)var2_4);
                        }
                    }
                    try {
                        if (var2_4 < 0L) break block20;
                        if (var6_5 == null) break block21;
lbl38:
                        // 2 sources

                        v2 = 0;
                    }
                    catch (n9 v6) {
                        throw m44.a("l", (Object)v6, (long)-2195071899250983726L, (long)var2_4);
                    }
                }
                var7_6 = v2;
                block12: while (var7_6 < var4_3.length) {
                    try {
                        m44.a("s", (Object)m44.a("r", (Object)this, (long)-29795169579849662L, (long)var2_4), (Object)var4_3[var7_6], (long)-336393227602497975L, (long)var2_4);
                        ++var7_6;
                        do {
                            v7 = var6_5;
                            if (var2_4 > 0L) {
                                if (v7 != null) break block20;
                                v7 = var6_5;
                            }
                            if (v7 == null) continue block12;
                        } while (var2_4 < 0L);
                        break;
                    }
                    catch (n9 v8) {
                        throw m44.a("l", (Object)v8, (long)-2195071899250983726L, (long)var2_4);
                    }
                }
            }
            m44.a("s", (Object)this, (Object)m44.a("r", (Object)this, (long)-29795169579849662L, (long)var2_4), (long)-544559229377203554L, (long)var2_4);
            m44.a("s", (Object)this, (int)var5_2, (long)-2200122174151190765L, (long)var2_4);
            m44.a("s", (Object)this, (Object)this, (long)-1899344099189265349L, (long)var2_4);
            m44.a("s", (Object)this, (Object)f2.a("a", (int)3942, (long)(7943440565625810306L ^ var2_4)), (long)-314566583960238875L, (long)var2_4);
        }
    }

    public f2(int n10, long l10, lqo[] lqoArray) {
        long l11 = (l10 = a ^ l10) ^ 0x528FD93056C5L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l11;
        objectArray[1] = lqoArray;
        objectArray[0] = n10;
        m44.a("r", (Object)this, (Object)objectArray, (long)3956389516095260592L, (long)l10);
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        block5: {
            Object object;
            long l10;
            block4: {
                l10 = a ^ 0x5B643C71DBFDL;
                CallSite callSite = m44.a("n", (long)5530204125670721592L, (long)l10);
                try {
                    try {
                        object = itemEvent;
                        if (callSite != null) break block4;
                        if (m44.a("q", (Object)object, (long)5621789021043236531L, (long)l10) != true) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)5432434340778169912L, (long)l10);
                    }
                    object = m44.a("q", (Object)this, (long)5746572753582307597L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)5432434340778169912L, (long)l10);
                }
            }
            lqo lqo2 = (lqo)object;
            m44.a("q", (Object)this, (Object)f2.a("a", (int)24194, (long)(0x71E0BB4DC8DC968DL ^ l10)), null, (Object)lqo2, (long)5394773556939098736L, (long)l10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l10 = a ^ 0x5ACAA5A376E5L;
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
        String[] stringArray = new String[2];
        int n10 = 0;
        String string = "\u009dj\u00eeY\u0015\n/\u001a\u00dd/I\u00a1\u00d9,*\u001e/e}yV\u00eb\u00c3\u00ca\u00c3H\u00d8\u00fc\u00ac\u00d9\u00fd\u00daPu\u00c0\u00caiO\u00ba\u00b4(\u008a3l[\u0016\t\u0010\u00ec\u000e\u00bc\u00e8\b\u00a2O\u0017\u00b2\u00d6\u00b6\u00b9\u00e7\u00a9\u00d5k\u00f7N\u00e5\u00f0l\u0011\u0089W\u00ab\u00d2]\u00eb\u00de\u0005\u00b8Z*";
        int n11 = "\u009dj\u00eeY\u0015\n/\u001a\u00dd/I\u00a1\u00d9,*\u001e/e}yV\u00eb\u00c3\u00ca\u00c3H\u00d8\u00fc\u00ac\u00d9\u00fd\u00daPu\u00c0\u00caiO\u00ba\u00b4(\u008a3l[\u0016\t\u0010\u00ec\u000e\u00bc\u00e8\b\u00a2O\u0017\u00b2\u00d6\u00b6\u00b9\u00e7\u00a9\u00d5k\u00f7N\u00e5\u00f0l\u0011\u0089W\u00ab\u00d2]\u00eb\u00de\u0005\u00b8Z*".length();
        int n12 = 40;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = f2.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                b = stringArray;
                d = new String[2];
                return;
            }
            n12 = string.charAt(n13);
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x9EF;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/f2", exception);
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
            f2.d[n11] = f2.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = f2.a(n10, l10);
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
            throw new RuntimeException("com/zelix/f2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

