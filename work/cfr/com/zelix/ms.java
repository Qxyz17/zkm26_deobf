/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.tq;
import com.zelix.uk;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ms
extends JComboBox
implements ItemListener,
PropertyChangeListener,
uk {
    private File[] J;
    private File W;
    boolean T;
    private ArrayList l;
    private DefaultComboBoxModel p;
    private static final long a = prr.a(9010682137649546385L, 2535884008412673545L, MethodHandles.lookup().lookupClass()).a(200798629192235L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    void w(Object[] objectArray) {
        block6: {
            long l10 = (Long)objectArray[0];
            long l11 = (l10 = a ^ l10) ^ 0x109CB94F94B6L;
            CallSite callSite = m44.a("l", (long)2962542702164356506L, (long)l10);
            m44.a("p", (Object)this, (File[])m44.a("l", (long)3116341791171330669L, (long)l10), (long)3250284573045946457L, (long)l10);
            m44.a("p", (Object)this, new DefaultComboBoxModel(), (long)3031197399650213842L, (long)l10);
            CallSite callSite2 = callSite;
            m44.a("s", (Object)this, (Object)m44.a("r", (Object)this, (long)3031197399650213842L, (long)l10), (long)4021724486826619531L, (long)l10);
            int n10 = 0;
            block2: while (n10 < ((CallSite)m44.a("r", (Object)this, (long)3250284573045946457L, (long)l10)).length) {
                try {
                    m44.a("s", (Object)m44.a("r", (Object)this, (long)3031197399650213842L, (long)l10), (Object)m44.a("r", (Object)this, (long)3250284573045946457L, (long)l10)[n10], (long)3755056949873156353L, (long)l10);
                    ++n10;
                    do {
                        CallSite callSite3 = callSite2;
                        if (l10 > 0L) {
                            if (callSite3 != null) break block6;
                            callSite3 = callSite2;
                        }
                        if (callSite3 == null) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)n92, (long)2894553370839322849L, (long)l10);
                }
            }
            m44.a("s", (Object)this, (Object)new tq(this, l11), (long)3395434404697558655L, (long)l10);
            m44.a("s", (Object)this, (Object)ms.a("g", (int)16476, (long)(0x427BD656AF266249L ^ l10)), (long)3605287761652799244L, (long)l10);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        block15: {
            long l10;
            block17: {
                Object object;
                CallSite callSite;
                block16: {
                    CallSite callSite2;
                    block14: {
                        l10 = a ^ 0x63DF92CB529EL;
                        callSite = m44.a("k", (long)7132085880086718077L, (long)l10);
                        try {
                            try {
                                try {
                                    callSite2 = m44.a("t", (Object)itemEvent, (long)6936073787257139446L, (long)l10);
                                    if (callSite != null) break block14;
                                    if (callSite2 != true) break block15;
                                }
                                catch (n9 n92) {
                                    throw m44.a("k", (Object)n92, (long)7191358285302389510L, (long)l10);
                                }
                                object = this;
                                if (callSite != null) break block16;
                            }
                            catch (n9 n93) {
                                throw m44.a("k", (Object)n93, (long)7191358285302389510L, (long)l10);
                            }
                            callSite2 = m44.a("u", (Object)object, (long)8828088885011009130L, (long)l10);
                        }
                        catch (n9 n94) {
                            throw m44.a("k", (Object)n94, (long)7191358285302389510L, (long)l10);
                        }
                    }
                    try {
                        if (callSite2 != false) break block15;
                        object = m44.a("t", (Object)this, (long)7256109992849990464L, (long)l10);
                    }
                    catch (n9 n95) {
                        throw m44.a("k", (Object)n95, (long)7191358285302389510L, (long)l10);
                    }
                }
                File file = (File)object;
                try {
                    block18: {
                        try {
                            try {
                                if (callSite != null) break block17;
                                if (m44.a("t", (Object)file, (long)9067898791921022991L, (long)l10) == false) break block18;
                            }
                            catch (n9 n96) {
                                throw m44.a("k", (Object)n96, (long)7191358285302389510L, (long)l10);
                            }
                            m44.a("w", (Object)this, (File)file, (long)6964227093747399978L, (long)l10);
                            m44.a("t", (Object)this, (Object)ms.a("g", (int)17065, (long)(0x2531A50177B72B59L ^ l10)), null, (Object)file, (long)7032909770896512994L, (long)l10);
                            if (callSite == null) break block15;
                        }
                        catch (n9 n97) {
                            throw m44.a("k", (Object)n97, (long)7191358285302389510L, (long)l10);
                        }
                    }
                    m44.a("w", (Object)this, (boolean)true, (long)8828088885011009130L, (long)l10);
                    m44.a("t", (Object)this, (Object)m44.a("u", (Object)this, (long)6964227093747399978L, (long)l10), (long)7365804398177773614L, (long)l10);
                }
                catch (n9 n98) {
                    throw m44.a("k", (Object)n98, (long)7191358285302389510L, (long)l10);
                }
            }
            m44.a("w", (Object)this, (boolean)false, (long)8828088885011009130L, (long)l10);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block5: {
            long l10;
            block4: {
                l10 = a ^ 0x3685C051D6C4L;
                long l11 = l10 ^ 0x3AB60C12341FL;
                CallSite callSite = m44.a("i", (long)-1828436124029197785L, (long)l10);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (!((String)((Object)m44.a("v", (Object)propertyChangeEvent, (long)-472310022877719386L, (long)l10))).equals(ms.a("g", (int)25163, (long)(0x24693110270D8FE2L ^ l10)))) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-1759074465295605924L, (long)l10);
                    }
                    m44.a("u", (Object)this, (boolean)true, (long)-82761017507100112L, (long)l10);
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l11;
                    objectArray[0] = (File)((Object)m44.a("v", (Object)propertyChangeEvent, (long)-12302415996062654L, (long)l10));
                    m44.a("v", (Object)this, (Object)objectArray, (long)-450712370117082982L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-1759074465295605924L, (long)l10);
                }
            }
            m44.a("u", (Object)this, (boolean)false, (long)-82761017507100112L, (long)l10);
        }
    }

    public ms(int n10, File file, int n11, byte by2) {
        long l10;
        long l11 = l10 = ((long)n10 << 32 | (long)n11 << 40 >>> 32 | (long)by2 << 56 >>> 56) ^ a;
        long l12 = l11 ^ 0x58BFA5AF7045L;
        long l13 = l11 ^ 0x2C68AE8BB6DDL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l12;
        m44.a("t", (Object)this, (Object)objectArray, (long)7144365350236011228L, (long)l10);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l13;
        objectArray2[0] = file;
        m44.a("t", (Object)this, (Object)objectArray2, (long)8898173478668436056L, (long)l10);
        m44.a("t", (Object)this, (Object)this, (long)7204506859050992485L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j(Object[] objectArray) {
        File file;
        CallSite callSite;
        long l10;
        block31: {
            CallSite callSite2;
            block30: {
                block29: {
                    File file2 = (File)objectArray[0];
                    l10 = (Long)objectArray[1];
                    l10 = a ^ l10;
                    CallSite callSite3 = m44.a("l", (long)-1187432755574969598L, (long)l10);
                    m44.a("p", (Object)this, (File)file2, (long)-1307519685673521067L, (long)l10);
                    m44.a("p", (Object)this, new ArrayList(), (long)-792970665754298767L, (long)l10);
                    CallSite callSite4 = m44.a("s", (Object)m44.a("r", (Object)this, (long)-1307519685673521067L, (long)l10), (long)-669871605240924341L, (long)l10);
                    callSite = callSite3;
                    block16: while (callSite4 != null) {
                        ((ArrayList)((Object)m44.a("r", (Object)this, (long)-792970665754298767L, (long)l10))).add(callSite4);
                        callSite4 = m44.a("s", (Object)callSite4, (long)-669871605240924341L, (long)l10);
                        try {
                            do {
                                CallSite callSite5 = callSite;
                                if (l10 > 0L) {
                                    if (callSite5 != null) break block29;
                                    callSite5 = callSite;
                                }
                                if (callSite5 == null) continue block16;
                            } while (l10 < 0L);
                            break;
                        }
                        catch (n9 n92) {
                            throw m44.a("l", (Object)n92, (long)-1246388637001755015L, (long)l10);
                        }
                    }
                    Collections.reverse(m44.a("r", (Object)this, (long)-792970665754298767L, (long)l10));
                }
                file = null;
                try {
                    try {
                        callSite2 = m44.a("r", (Object)this, (long)-792970665754298767L, (long)l10);
                        if (callSite != null) break block30;
                        if (((ArrayList)((Object)callSite2)).size() <= 0) break block31;
                    }
                    catch (n9 n93) {
                        throw m44.a("l", (Object)n93, (long)-1246388637001755015L, (long)l10);
                    }
                    callSite2 = ((ArrayList)((Object)m44.a("r", (Object)this, (long)-792970665754298767L, (long)l10))).get(0);
                }
                catch (n9 n94) {
                    throw m44.a("l", (Object)n94, (long)-1246388637001755015L, (long)l10);
                }
            }
            file = (File)((Object)callSite2);
        }
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
        int n10 = 0;
        block18: while (n10 < ((CallSite)m44.a("r", (Object)this, (long)-1476300732520907071L, (long)l10)).length) {
            try {
                try {
                    try {
                        try {
                            m44.a("s", defaultComboBoxModel, (Object)m44.a("r", (Object)this, (long)-1476300732520907071L, (long)l10)[n10], (long)-971422158500010087L, (long)l10);
                        }
                        catch (n9 n95) {
                            throw m44.a("l", (Object)n95, (long)-1246388637001755015L, (long)l10);
                        }
                    }
                    catch (n9 n96) {
                        throw m44.a("l", (Object)n96, (long)-1246388637001755015L, (long)l10);
                    }
                }
                catch (n9 n97) {
                    throw m44.a("l", (Object)n97, (long)-1246388637001755015L, (long)l10);
                }
            }
            catch (n9 n98) {
                throw m44.a("l", (Object)n98, (long)-1246388637001755015L, (long)l10);
            }
            do {
                CallSite callSite6;
                block34: {
                    block33: {
                        block35: {
                            int n11;
                            block36: {
                                callSite6 = callSite;
                                if (l10 >= 0L) {
                                    if (callSite6 != null) break block18;
                                    callSite6 = callSite;
                                }
                                if (l10 < 0L) break block34;
                                if (callSite6 != null) break block33;
                                if (file == null) break block35;
                                int n12 = file.equals(m44.a("r", (Object)this, (long)-1476300732520907071L, (long)l10)[n10]);
                                if (callSite != null) break block36;
                                if (n12 == 0) break block35;
                                n12 = n11 = 1;
                            }
                            block20: while (n11 < ((ArrayList)((Object)m44.a("r", (Object)this, (long)-792970665754298767L, (long)l10))).size()) {
                                try {
                                    m44.a("s", defaultComboBoxModel, ((ArrayList)((Object)m44.a("r", (Object)this, (long)-792970665754298767L, (long)l10))).get(n11), (long)-971422158500010087L, (long)l10);
                                    ++n11;
                                    do {
                                        CallSite callSite7 = callSite;
                                        if (l10 >= 0L) {
                                            if (callSite7 != null) break block33;
                                            callSite7 = callSite;
                                        }
                                        if (callSite7 == null) continue block20;
                                    } while (l10 < 0L);
                                    break;
                                }
                                catch (n9 n99) {
                                    throw m44.a("l", (Object)n99, (long)-1246388637001755015L, (long)l10);
                                }
                            }
                            m44.a("s", defaultComboBoxModel, (Object)m44.a("r", (Object)this, (long)-1307519685673521067L, (long)l10), (long)-971422158500010087L, (long)l10);
                        }
                        ++n10;
                    }
                    callSite6 = callSite;
                }
                if (callSite6 == null) continue block18;
                m44.a("p", (Object)this, defaultComboBoxModel, (long)-1402716052783507126L, (long)l10);
                m44.a("s", (Object)this, (Object)m44.a("r", (Object)this, (long)-1402716052783507126L, (long)l10), (long)-1060459397807950829L, (long)l10);
                m44.a("s", (Object)this, (Object)m44.a("r", (Object)this, (long)-1307519685673521067L, (long)l10), (long)-1493015353657465519L, (long)l10);
            } while (l10 < 0L);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0xCA615401A69L;
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
        String string = "\b\u0011\ru6\u00bf\u0093=\b%\u00a2\u008b$\u00a8\u00a2\u00dd\u0083\u001a\u00a2z\u0086\"\u00e3\u00e7\u0081-\u00da\u00e0\u008e\u0092^\u00f4^\u00cf\u001d\u0019\u000f6N\u00f0\u00c1U\u00a6\u001d\u00b5b\u00150\u0085\u0005\u00f3\u00c4\u0090\u0003\u0089\u008d(\u00d5\u0002\u0017\n\u00a7\u0098o\u00aa7TU\u00053\u00f5\u00b8\u008d<\u009e\u00ed|\u00f6\u00c8\u007f*O{\u00a8Z\u00e3\u00fb\f\u00d1\u00b9e\u00aa\u0000\u00dd\u00b8\u0087$(\u00e5\u00b3\u00a4Un\u000b\u00e8\u00c1\u00cd\u00c2\u00b6i\u0098\u00aa\u001c\u0082M\u001b\u008d\f\u0005F\u00b3\u0003\u001du\n)\u009c$%\u0004E\u0007\u00c7X\u00bagr\u00c4";
        int n11 = "\b\u0011\ru6\u00bf\u0093=\b%\u00a2\u008b$\u00a8\u00a2\u00dd\u0083\u001a\u00a2z\u0086\"\u00e3\u00e7\u0081-\u00da\u00e0\u008e\u0092^\u00f4^\u00cf\u001d\u0019\u000f6N\u00f0\u00c1U\u00a6\u001d\u00b5b\u00150\u0085\u0005\u00f3\u00c4\u0090\u0003\u0089\u008d(\u00d5\u0002\u0017\n\u00a7\u0098o\u00aa7TU\u00053\u00f5\u00b8\u008d<\u009e\u00ed|\u00f6\u00c8\u007f*O{\u00a8Z\u00e3\u00fb\f\u00d1\u00b9e\u00aa\u0000\u00dd\u00b8\u0087$(\u00e5\u00b3\u00a4Un\u000b\u00e8\u00c1\u00cd\u00c2\u00b6i\u0098\u00aa\u001c\u0082M\u001b\u008d\f\u0005F\u00b3\u0003\u001du\n)\u009c$%\u0004E\u0007\u00c7X\u00bagr\u00c4".length();
        int n12 = 56;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = ms.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                b = stringArray;
                c = new String[3];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x656;
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
                throw new RuntimeException("com/zelix/ms", exception);
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
            ms.c[n11] = ms.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ms.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ms" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ms.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

