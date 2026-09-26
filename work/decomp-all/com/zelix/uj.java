/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.uk;
import java.awt.Insets;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
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
import javax.swing.JButton;

public class uj
extends JButton
implements PropertyChangeListener,
uk {
    private static String M;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)6160797036099112162L, (long)-7696510794025324428L, MethodHandles.lookup().lookupClass()).a(269133589969165L);
        long l = a ^ 0x32A467441C6L;
        d = new HashMap(13);
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
        String string = "e\u001b\u0012,\u00c8B\u008f\u0088\u0013&\u00dd\u0000\u00f9]\u00e8\u00a0\u00ad'\u00fe;\u00ebg'\u0084\u0010\u00f5\u00d7\u00d5\u009d_\u0080\u0090\u00bd+l\u00bf2T\u00a9\u00e3\u0083";
        int n2 = "e\u001b\u0012,\u00c8B\u008f\u0088\u0013&\u00dd\u0000\u00f9]\u00e8\u00a0\u00ad'\u00fe;\u00ebg'\u0084\u0010\u00f5\u00d7\u00d5\u009d_\u0080\u0090\u00bd+l\u00bf2T\u00a9\u00e3\u0083".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = uj.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                m44.a("o", (String)((Object)uj.a("i", (int)32062, (long)(0x609110A6B1C88EB1L ^ l))), (long)-6179508753258809983L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    @Override
    public float getAlignmentY() {
        return 0.5f;
    }

    /*
     * Unable to fully structure code
     */
    public uj(int var1_1, char var2_2, int var3_3) {
        block9: {
            block10: {
                block8: {
                    var4_4 = ((long)var1_1 << 32 | (long)var2_2 << 48 >>> 32 | (long)var3_3 << 48 >>> 48) ^ uj.a;
                    var6_5 = var4_4 ^ 42687450661034L;
                    v0 = m44.a("n", (long)6660682279663098088L, (long)var4_4);
                    super();
                    v1 = new Object[1];
                    v1[0] = var6_5;
                    var9_6 = m44.a("n", (Object)v1, (long)5167552043929653537L, (long)var4_4);
                    var8_7 = v0;
                    try {
                        try {
                            if (var8_7 != null) break block8;
                            if (var9_6 != null) {
                            }
                            ** GOTO lbl27
                        }
                        catch (n9 v2) {
                            throw m44.a("n", (Object)v2, (long)6824885737791821724L, (long)var4_4);
                        }
                        m44.a("q", (Object)this, (Object)var9_6, (long)4806061086072989963L, (long)var4_4);
                    }
                    catch (n9 v3) {
                        throw m44.a("n", (Object)v3, (long)6824885737791821724L, (long)var4_4);
                    }
                }
                try {
                    if (var1_1 <= 0) break block9;
                    if (var8_7 == null) break block10;
lbl27:
                    // 2 sources

                    m44.a("q", (Object)this, (Object)m44.a("j", (long)5023678118049651211L, (long)var4_4), (long)4618647856372832615L, (long)var4_4);
                }
                catch (n9 v4) {
                    throw m44.a("n", (Object)v4, (long)6824885737791821724L, (long)var4_4);
                }
            }
            m44.a("q", (Object)this, (Object)uj.a("i", (int)30272, (long)(1388954315097696836L ^ var4_4)), (long)6744654237289866674L, (long)var4_4);
        }
    }

    @Override
    public Insets getMargin() {
        return new Insets(1, 1, 1, 1);
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D35;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/uj", exception);
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
            uj.c[n2] = uj.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = uj.a(n, l);
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
            throw new RuntimeException("com/zelix/uj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(uj.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
