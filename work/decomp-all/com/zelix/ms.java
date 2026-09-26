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
    private static final long a = prr.a((long)9010682137649546385L, (long)2535884008412673545L, MethodHandles.lookup().lookupClass()).a(200798629192235L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    void w(Object[] objectArray) {
        block6: {
            long l = (Long)objectArray[0];
            long l2 = (l = a ^ l) ^ 0x109CB94F94B6L;
            CallSite callSite = m44.a("l", (long)2962542702164356506L, (long)l);
            m44.a("p", (Object)this, (File[])m44.a("l", (long)3116341791171330669L, (long)l), (long)3250284573045946457L, (long)l);
            m44.a("p", (Object)this, new DefaultComboBoxModel(), (long)3031197399650213842L, (long)l);
            CallSite callSite2 = callSite;
            m44.a("s", (Object)this, (Object)m44.a("r", (Object)this, (long)3031197399650213842L, (long)l), (long)4021724486826619531L, (long)l);
            int n = 0;
            block2: while (n < ((CallSite)m44.a("r", (Object)this, (long)3250284573045946457L, (long)l)).length) {
                try {
                    m44.a("s", (Object)m44.a("r", (Object)this, (long)3031197399650213842L, (long)l), (Object)m44.a("r", (Object)this, (long)3250284573045946457L, (long)l)[n], (long)3755056949873156353L, (long)l);
                    ++n;
                    do {
                        CallSite callSite3 = callSite2;
                        if (l > 0L) {
                            if (callSite3 != null) break block6;
                            callSite3 = callSite2;
                        }
                        if (callSite3 == null) continue block2;
                    } while (l < 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("l", (Object)((Object)n92), (long)2894553370839322849L, (long)l);
                }
            }
            m44.a("s", (Object)this, (Object)new tq(this, l2), (long)3395434404697558655L, (long)l);
            m44.a("s", (Object)this, (Object)ms.a("g", (int)16476, (long)(0x427BD656AF266249L ^ l)), (long)3605287761652799244L, (long)l);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        block15: {
            long l;
            block17: {
                Object object;
                CallSite callSite;
                block16: {
                    CallSite callSite2;
                    block14: {
                        l = a ^ 0x63DF92CB529EL;
                        callSite = m44.a("k", (long)7132085880086718077L, (long)l);
                        try {
                            try {
                                try {
                                    callSite2 = m44.a("t", (Object)itemEvent, (long)6936073787257139446L, (long)l);
                                    if (callSite != null) break block14;
                                    if (callSite2 != true) break block15;
                                }
                                catch (n9 n92) {
                                    throw m44.a("k", (Object)((Object)n92), (long)7191358285302389510L, (long)l);
                                }
                                object = this;
                                if (callSite != null) break block16;
                            }
                            catch (n9 n93) {
                                throw m44.a("k", (Object)((Object)n93), (long)7191358285302389510L, (long)l);
                            }
                            callSite2 = m44.a("u", (Object)object, (long)8828088885011009130L, (long)l);
                        }
                        catch (n9 n94) {
                            throw m44.a("k", (Object)((Object)n94), (long)7191358285302389510L, (long)l);
                        }
                    }
                    try {
                        if (callSite2 != false) break block15;
                        object = m44.a("t", (Object)this, (long)7256109992849990464L, (long)l);
                    }
                    catch (n9 n95) {
                        throw m44.a("k", (Object)((Object)n95), (long)7191358285302389510L, (long)l);
                    }
                }
                File file = (File)object;
                try {
                    block18: {
                        try {
                            try {
                                if (callSite != null) break block17;
                                if (m44.a("t", (Object)file, (long)9067898791921022991L, (long)l) == false) break block18;
                            }
                            catch (n9 n96) {
                                throw m44.a("k", (Object)((Object)n96), (long)7191358285302389510L, (long)l);
                            }
                            m44.a("w", (Object)this, (File)file, (long)6964227093747399978L, (long)l);
                            m44.a("t", (Object)this, (Object)ms.a("g", (int)17065, (long)(0x2531A50177B72B59L ^ l)), null, (Object)file, (long)7032909770896512994L, (long)l);
                            if (callSite == null) break block15;
                        }
                        catch (n9 n97) {
                            throw m44.a("k", (Object)((Object)n97), (long)7191358285302389510L, (long)l);
                        }
                    }
                    m44.a("w", (Object)this, (boolean)true, (long)8828088885011009130L, (long)l);
                    m44.a("t", (Object)this, (Object)m44.a("u", (Object)this, (long)6964227093747399978L, (long)l), (long)7365804398177773614L, (long)l);
                }
                catch (n9 n98) {
                    throw m44.a("k", (Object)((Object)n98), (long)7191358285302389510L, (long)l);
                }
            }
            m44.a("w", (Object)this, (boolean)false, (long)8828088885011009130L, (long)l);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block5: {
            long l;
            block4: {
                l = a ^ 0x3685C051D6C4L;
                long l2 = l ^ 0x3AB60C12341FL;
                CallSite callSite = m44.a("i", (long)-1828436124029197785L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (!((String)((Object)m44.a("v", (Object)propertyChangeEvent, (long)-472310022877719386L, (long)l))).equals(ms.a("g", (int)25163, (long)(0x24693110270D8FE2L ^ l)))) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-1759074465295605924L, (long)l);
                    }
                    m44.a("u", (Object)this, (boolean)true, (long)-82761017507100112L, (long)l);
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l2;
                    objectArray[0] = (File)((Object)m44.a("v", (Object)propertyChangeEvent, (long)-12302415996062654L, (long)l));
                    m44.a("v", (Object)this, (Object)objectArray, (long)-450712370117082982L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)-1759074465295605924L, (long)l);
                }
            }
            m44.a("u", (Object)this, (boolean)false, (long)-82761017507100112L, (long)l);
        }
    }

    public ms(int n, File file, int n2, byte by) {
        long l;
        long l2 = l = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ a;
        long l3 = l2 ^ 0x58BFA5AF7045L;
        long l4 = l2 ^ 0x2C68AE8BB6DDL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        m44.a("t", (Object)this, (Object)objectArray, (long)7144365350236011228L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = file;
        m44.a("t", (Object)this, (Object)objectArray2, (long)8898173478668436056L, (long)l);
        m44.a("t", (Object)this, (Object)this, (long)7204506859050992485L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j(Object[] objectArray) {
        File file;
        CallSite callSite;
        long l;
        block31: {
            CallSite callSite2;
            block30: {
                block29: {
                    File file2 = (File)objectArray[0];
                    l = (Long)objectArray[1];
                    l = a ^ l;
                    CallSite callSite3 = m44.a("l", (long)-1187432755574969598L, (long)l);
                    m44.a("p", (Object)this, (File)file2, (long)-1307519685673521067L, (long)l);
                    m44.a("p", (Object)this, new ArrayList(), (long)-792970665754298767L, (long)l);
                    CallSite callSite4 = m44.a("s", (Object)m44.a("r", (Object)this, (long)-1307519685673521067L, (long)l), (long)-669871605240924341L, (long)l);
                    callSite = callSite3;
                    block16: while (callSite4 != null) {
                        ((ArrayList)((Object)m44.a("r", (Object)this, (long)-792970665754298767L, (long)l))).add(callSite4);
                        callSite4 = m44.a("s", (Object)callSite4, (long)-669871605240924341L, (long)l);
                        try {
                            do {
                                CallSite callSite5 = callSite;
                                if (l > 0L) {
                                    if (callSite5 != null) break block29;
                                    callSite5 = callSite;
                                }
                                if (callSite5 == null) continue block16;
                            } while (l < 0L);
                            break;
                        }
                        catch (n9 n92) {
                            throw m44.a("l", (Object)((Object)n92), (long)-1246388637001755015L, (long)l);
                        }
                    }
                    Collections.reverse(m44.a("r", (Object)this, (long)-792970665754298767L, (long)l));
                }
                file = null;
                try {
                    try {
                        callSite2 = m44.a("r", (Object)this, (long)-792970665754298767L, (long)l);
                        if (callSite != null) break block30;
                        if (((ArrayList)((Object)callSite2)).size() <= 0) break block31;
                    }
                    catch (n9 n93) {
                        throw m44.a("l", (Object)((Object)n93), (long)-1246388637001755015L, (long)l);
                    }
                    callSite2 = ((ArrayList)((Object)m44.a("r", (Object)this, (long)-792970665754298767L, (long)l))).get(0);
                }
                catch (n9 n94) {
                    throw m44.a("l", (Object)((Object)n94), (long)-1246388637001755015L, (long)l);
                }
            }
            file = (File)((Object)callSite2);
        }
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
        int n = 0;
        block18: while (n < ((CallSite)m44.a("r", (Object)this, (long)-1476300732520907071L, (long)l)).length) {
            try {
                try {
                    try {
                        try {
                            m44.a("s", defaultComboBoxModel, (Object)m44.a("r", (Object)this, (long)-1476300732520907071L, (long)l)[n], (long)-971422158500010087L, (long)l);
                        }
                        catch (n9 n95) {
                            throw m44.a("l", (Object)((Object)n95), (long)-1246388637001755015L, (long)l);
                        }
                    }
                    catch (n9 n96) {
                        throw m44.a("l", (Object)((Object)n96), (long)-1246388637001755015L, (long)l);
                    }
                }
                catch (n9 n97) {
                    throw m44.a("l", (Object)((Object)n97), (long)-1246388637001755015L, (long)l);
                }
            }
            catch (n9 n98) {
                throw m44.a("l", (Object)((Object)n98), (long)-1246388637001755015L, (long)l);
            }
            do {
                CallSite callSite6;
                block34: {
                    block33: {
                        block35: {
                            int n2;
                            block36: {
                                callSite6 = callSite;
                                if (l >= 0L) {
                                    if (callSite6 != null) break block18;
                                    callSite6 = callSite;
                                }
                                if (l < 0L) break block34;
                                if (callSite6 != null) break block33;
                                if (file == null) break block35;
                                int n3 = file.equals(m44.a("r", (Object)this, (long)-1476300732520907071L, (long)l)[n]);
                                if (callSite != null) break block36;
                                if (n3 == 0) break block35;
                                n3 = n2 = 1;
                            }
                            block20: while (n2 < ((ArrayList)((Object)m44.a("r", (Object)this, (long)-792970665754298767L, (long)l))).size()) {
                                try {
                                    m44.a("s", defaultComboBoxModel, ((ArrayList)((Object)m44.a("r", (Object)this, (long)-792970665754298767L, (long)l))).get(n2), (long)-971422158500010087L, (long)l);
                                    ++n2;
                                    do {
                                        CallSite callSite7 = callSite;
                                        if (l >= 0L) {
                                            if (callSite7 != null) break block33;
                                            callSite7 = callSite;
                                        }
                                        if (callSite7 == null) continue block20;
                                    } while (l < 0L);
                                    break;
                                }
                                catch (n9 n99) {
                                    throw m44.a("l", (Object)((Object)n99), (long)-1246388637001755015L, (long)l);
                                }
                            }
                            m44.a("s", defaultComboBoxModel, (Object)m44.a("r", (Object)this, (long)-1307519685673521067L, (long)l), (long)-971422158500010087L, (long)l);
                        }
                        ++n;
                    }
                    callSite6 = callSite;
                }
                if (callSite6 == null) continue block18;
                m44.a("p", (Object)this, defaultComboBoxModel, (long)-1402716052783507126L, (long)l);
                m44.a("s", (Object)this, (Object)m44.a("r", (Object)this, (long)-1402716052783507126L, (long)l), (long)-1060459397807950829L, (long)l);
                m44.a("s", (Object)this, (Object)m44.a("r", (Object)this, (long)-1307519685673521067L, (long)l), (long)-1493015353657465519L, (long)l);
            } while (l < 0L);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0xCA615401A69L;
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
        String string = "\b\u0011\ru6\u00bf\u0093=\b%\u00a2\u008b$\u00a8\u00a2\u00dd\u0083\u001a\u00a2z\u0086\"\u00e3\u00e7\u0081-\u00da\u00e0\u008e\u0092^\u00f4^\u00cf\u001d\u0019\u000f6N\u00f0\u00c1U\u00a6\u001d\u00b5b\u00150\u0085\u0005\u00f3\u00c4\u0090\u0003\u0089\u008d(\u00d5\u0002\u0017\n\u00a7\u0098o\u00aa7TU\u00053\u00f5\u00b8\u008d<\u009e\u00ed|\u00f6\u00c8\u007f*O{\u00a8Z\u00e3\u00fb\f\u00d1\u00b9e\u00aa\u0000\u00dd\u00b8\u0087$(\u00e5\u00b3\u00a4Un\u000b\u00e8\u00c1\u00cd\u00c2\u00b6i\u0098\u00aa\u001c\u0082M\u001b\u008d\f\u0005F\u00b3\u0003\u001du\n)\u009c$%\u0004E\u0007\u00c7X\u00bagr\u00c4";
        int n2 = "\b\u0011\ru6\u00bf\u0093=\b%\u00a2\u008b$\u00a8\u00a2\u00dd\u0083\u001a\u00a2z\u0086\"\u00e3\u00e7\u0081-\u00da\u00e0\u008e\u0092^\u00f4^\u00cf\u001d\u0019\u000f6N\u00f0\u00c1U\u00a6\u001d\u00b5b\u00150\u0085\u0005\u00f3\u00c4\u0090\u0003\u0089\u008d(\u00d5\u0002\u0017\n\u00a7\u0098o\u00aa7TU\u00053\u00f5\u00b8\u008d<\u009e\u00ed|\u00f6\u00c8\u007f*O{\u00a8Z\u00e3\u00fb\f\u00d1\u00b9e\u00aa\u0000\u00dd\u00b8\u0087$(\u00e5\u00b3\u00a4Un\u000b\u00e8\u00c1\u00cd\u00c2\u00b6i\u0098\u00aa\u001c\u0082M\u001b\u008d\f\u0005F\u00b3\u0003\u001du\n)\u009c$%\u0004E\u0007\u00c7X\u00bagr\u00c4".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ms.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x656;
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
                throw new RuntimeException("com/zelix/ms", exception);
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
            ms.c[n2] = ms.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ms.a(n, l);
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
