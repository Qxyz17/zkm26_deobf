/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lbm;
import com.zelix.lqr;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
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
import javax.swing.Action;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JRootPane;

public abstract class rh
extends JDialog {
    protected static final String Y;
    protected JFrame F;
    private static final long f;
    private static final String[] g;
    private static final String[] i;
    private static final Map o;

    public Action r(Object[] objectArray) {
        return new lbm(this);
    }

    public final void P(Object[] objectArray) {
        Object[] objectArray2;
        long l;
        block13: {
            Object object;
            Object object2;
            long l2;
            block14: {
                CallSite callSite;
                CallSite callSite2;
                int n;
                int n2;
                block11: {
                    CallSite callSite3;
                    Object[] objectArray3;
                    block12: {
                        Object object3;
                        block10: {
                            n2 = (Integer)objectArray[0];
                            n = (Integer)objectArray[1];
                            boolean bl = (Boolean)objectArray[2];
                            l = (Long)objectArray[3];
                            l2 = (l = f ^ l) ^ 0x7E48013C45AL;
                            callSite2 = m44.a("t", (Object)this, (long)-8516226968333163596L, (long)l);
                            objectArray3 = m44.a("k", (long)-8317331871225338890L, (long)l);
                            try {
                                try {
                                    try {
                                        object3 = bl;
                                        if (objectArray3 == null) break block10;
                                        if (!object3) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("k", (Object)((Object)n92), (long)-8174230575186214655L, (long)l);
                                    }
                                    callSite3 = m44.a("u", (Object)this, (long)-8063584240075704506L, (long)l);
                                    if (objectArray3 == null) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("k", (Object)((Object)n93), (long)-8174230575186214655L, (long)l);
                                }
                                object3 = m44.a("t", (Object)callSite3, (long)-8327655251700660464L, (long)l);
                            }
                            catch (n9 n94) {
                                throw m44.a("k", (Object)((Object)n94), (long)-8174230575186214655L, (long)l);
                            }
                        }
                        try {
                            if (!object3) break block11;
                            callSite3 = m44.a("u", (Object)this, (long)-8063584240075704506L, (long)l);
                        }
                        catch (n9 n95) {
                            throw m44.a("k", (Object)((Object)n95), (long)-8174230575186214655L, (long)l);
                        }
                    }
                    callSite = m44.a("t", (Object)callSite3, (long)-7539173109115003108L, (long)l);
                    CallSite callSite4 = m44.a("t", (Object)m44.a("u", (Object)this, (long)-8063584240075704506L, (long)l), (long)-7693418436523530773L, (long)l);
                    object2 = m44.a("u", (Object)callSite4, (long)-8048861315041546806L, (long)l) / 2 - m44.a("u", (Object)callSite2, (long)-8048861315041546806L, (long)l) / 2 + m44.a("u", (Object)callSite, (long)-8023811979154208150L, (long)l);
                    object = m44.a("u", (Object)callSite4, (long)-8220960945959649765L, (long)l) / 2 - m44.a("u", (Object)callSite2, (long)-8220960945959649765L, (long)l) / 2 + m44.a("u", (Object)callSite, (long)-8625494857480436933L, (long)l);
                    object2 = Math.max(0, (int)object2) + n2;
                    object = Math.max(0, (int)object) + n;
                    objectArray2 = objectArray3;
                    if (l < 0L) break block13;
                    if (objectArray2 != null) break block14;
                }
                callSite = m44.a("t", (Object)m44.a("k", (long)-8269044804832831207L, (long)l), (long)-7684789979923740366L, (long)l);
                object2 = m44.a("u", (Object)callSite, (long)-8048861315041546806L, (long)l) / 2 - m44.a("u", (Object)callSite2, (long)-8048861315041546806L, (long)l) / 2;
                object = m44.a("u", (Object)callSite, (long)-8220960945959649765L, (long)l) / 2 - m44.a("u", (Object)callSite2, (long)-8220960945959649765L, (long)l) / 2;
                object2 = Math.max(0, (int)object2) + n2;
                object = Math.max(0, (int)object) + n;
            }
            m44.a("t", (Object)this, (int)object2, (int)object, (long)-7572136914432122997L, (long)l);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = true;
            objectArray4[1] = this;
            objectArray2 = objectArray4;
            objectArray4[0] = l2;
        }
        m44.a("k", (Object)objectArray2, (long)-8330779157928228347L, (long)l);
    }

    public final void l(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = f ^ l) ^ 0x362A21B63C1AL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = bl;
        objectArray2[1] = 0;
        objectArray2[0] = 0;
        m44.a("q", (Object)this, (Object)objectArray2, (long)2923084138823423601L, (long)l);
    }

    @Override
    protected JRootPane createRootPane() {
        long l = f ^ 0x2CE4ED4E51D0L;
        JRootPane jRootPane = new JRootPane();
        CallSite callSite = m44.a("h", (Object)rh.a("o", (int)26708, (long)(0x7E655418F6C3AB73L ^ l)), (long)-4199617242706405349L, (long)l);
        CallSite callSite2 = m44.a("w", (Object)this, (Object)new Object[0], (long)-2445907468519741988L, (long)l);
        CallSite callSite3 = m44.a("w", (Object)jRootPane, (int)2, (long)-2556118617025523412L, (long)l);
        m44.a("w", (Object)callSite3, (Object)callSite, (Object)rh.a("o", (int)31483, (long)(0x1CFCC51BEE67B9DDL ^ l)), (long)-4408128158104514507L, (long)l);
        m44.a("w", (Object)m44.a("w", (Object)jRootPane, (long)-2606941258074762084L, (long)l), (Object)rh.a("o", (int)31483, (long)(0x1CFCC51BEE67B9DDL ^ l)), (Object)callSite2, (long)-2531699383588915587L, (long)l);
        return jRootPane;
    }

    public void S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        m44.a("t", (Object)this, (boolean)false, (long)-4018634977101251204L, (long)l);
        m44.a("t", (Object)this, (long)-3333508072596348812L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = prr.a((long)-1521726426171607132L, (long)8086714119080657533L, MethodHandles.lookup().lookupClass()).a(69667732620333L);
        long l = f ^ 0x57113D90BEA2L;
        o = new HashMap(13);
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
        String string = "\u00c3h>X\u0093\u0081r\u0085\u009e\u00a1\u001bs\u00f8\u008c\u001cN\u0010\u00e4~\u00be\u00af\u0093<\u00ed\u00abl \\\u00a8\u00ea\u00e3\f\u00ea";
        int n2 = "\u00c3h>X\u0093\u0081r\u0085\u009e\u00a1\u001bs\u00f8\u008c\u001cN\u0010\u00e4~\u00be\u00af\u0093<\u00ed\u00abl \\\u00a8\u00ea\u00e3\f\u00ea".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = rh.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                g = stringArray;
                i = new String[2];
                Y = m44.a("n", (long)3062557770409572310L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public final void j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = f ^ l) ^ 0x234BBFD4AA1L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = true;
        objectArray2[1] = 0;
        objectArray2[0] = 0;
        m44.a("r", (Object)this, (Object)objectArray2, (long)6785752111929712842L, (long)l);
    }

    public rh(int n, JFrame jFrame, String string, short s, boolean bl, char c) {
        long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ f;
        super(jFrame, string, bl);
        m44.a("v", (Object)this, (JFrame)jFrame, (long)8730603724980002423L, (long)l);
        lqr lqr2 = new lqr(this);
        m44.a("u", (Object)this, (Object)lqr2, (long)7357208469951828124L, (long)l);
    }

    private static n9 b(n9 n92) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xB69;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])o.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/rh", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            rh.i[n2] = rh.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = rh.a(n, l);
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
            throw new RuntimeException("com/zelix/rh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(rh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
