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
    private static final long a = prr.a((long)8889009188017176602L, (long)4027469902271510597L, MethodHandles.lookup().lookupClass()).a(99032308361141L);
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

    public f2(int n, long l, lqo[] lqoArray) {
        long l2 = (l = a ^ l) ^ 0x528FD93056C5L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = lqoArray;
        objectArray[0] = n;
        m44.a("r", (Object)this, (Object)objectArray, (long)3956389516095260592L, (long)l);
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        block5: {
            Object object;
            long l;
            block4: {
                l = a ^ 0x5B643C71DBFDL;
                CallSite callSite = m44.a("n", (long)5530204125670721592L, (long)l);
                try {
                    try {
                        object = itemEvent;
                        if (callSite != null) break block4;
                        if (m44.a("q", (Object)object, (long)5621789021043236531L, (long)l) != true) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)5432434340778169912L, (long)l);
                    }
                    object = m44.a("q", (Object)this, (long)5746572753582307597L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)5432434340778169912L, (long)l);
                }
            }
            lqo lqo2 = (lqo)object;
            m44.a("q", (Object)this, (Object)f2.a("a", (int)24194, (long)(0x71E0BB4DC8DC968DL ^ l)), null, (Object)lqo2, (long)5394773556939098736L, (long)l);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x5ACAA5A376E5L;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u009dj\u00eeY\u0015\n/\u001a\u00dd/I\u00a1\u00d9,*\u001e/e}yV\u00eb\u00c3\u00ca\u00c3H\u00d8\u00fc\u00ac\u00d9\u00fd\u00daPu\u00c0\u00caiO\u00ba\u00b4(\u008a3l[\u0016\t\u0010\u00ec\u000e\u00bc\u00e8\b\u00a2O\u0017\u00b2\u00d6\u00b6\u00b9\u00e7\u00a9\u00d5k\u00f7N\u00e5\u00f0l\u0011\u0089W\u00ab\u00d2]\u00eb\u00de\u0005\u00b8Z*";
        int n2 = "\u009dj\u00eeY\u0015\n/\u001a\u00dd/I\u00a1\u00d9,*\u001e/e}yV\u00eb\u00c3\u00ca\u00c3H\u00d8\u00fc\u00ac\u00d9\u00fd\u00daPu\u00c0\u00caiO\u00ba\u00b4(\u008a3l[\u0016\t\u0010\u00ec\u000e\u00bc\u00e8\b\u00a2O\u0017\u00b2\u00d6\u00b6\u00b9\u00e7\u00a9\u00d5k\u00f7N\u00e5\u00f0l\u0011\u0089W\u00ab\u00d2]\u00eb\u00de\u0005\u00b8Z*".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = f2.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x9EF;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/f2", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            f2.d[n2] = f2.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f2.a(n, l);
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
