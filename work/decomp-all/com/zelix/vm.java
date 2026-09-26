/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.tn;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class vm
implements MouseListener,
ListSelectionListener,
KeyListener {
    final tn v;
    private static final long a = prr.a((long)2301487361425829802L, (long)-6502753523676446255L, MethodHandles.lookup().lookupClass()).a(197269502904808L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block8: {
            long l;
            long l2;
            block6: {
                long l3 = l2 = a ^ 0x2056631F5D3AL;
                l = l3 ^ 0x7037241F1BDDL;
                long l4 = l3 ^ 0x19CF968FEF71L;
                CallSite callSite = m44.a("o", (long)-6326858617458794814L, (long)l2);
                try {
                    block7: {
                        try {
                            try {
                                if (callSite != null) break block6;
                                if (m44.a("p", (Object)keyEvent, (long)-6044687993952290488L, (long)l2) == vm.a("m", (int)8723, (long)(0x361DDC00DA400873L ^ l2))) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("o", (Object)((Object)n92), (long)-6043748621322973026L, (long)l2);
                            }
                            if (m44.a("p", (Object)keyEvent, (long)-6044687993952290488L, (long)l2) != vm.a("m", (int)13922, (long)(0x2D5D96C2336E1C03L ^ l2))) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("o", (Object)((Object)n93), (long)-6043748621322973026L, (long)l2);
                        }
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l4;
                    m44.a("p", (Object)m44.a("q", (Object)this, (long)-6061927679441258300L, (long)l2), (Object)objectArray, (long)-5579121864252772763L, (long)l2);
                }
                catch (n9 n94) {
                    throw m44.a("o", (Object)((Object)n94), (long)-6043748621322973026L, (long)l2);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = false;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)-6061927679441258300L, (long)l2), (Object)objectArray, (long)-6060304744155038210L, (long)l2);
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block5: {
            long l;
            long l2;
            block4: {
                long l3 = l2 = a ^ 0x717F881AF7B1L;
                l = l3 ^ 0x211ECF1AB156L;
                long l4 = l3 ^ 0x48E67D8A45FAL;
                CallSite callSite = m44.a("l", (long)196235003317351497L, (long)l2);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (m44.a("s", (Object)mouseEvent, (long)1958988635298739540L, (long)l2) != 2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)480508088408619541L, (long)l2);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l4;
                    m44.a("s", (Object)m44.a("r", (Object)this, (long)95954162722673231L, (long)l2), (Object)objectArray, (long)1736607219649905902L, (long)l2);
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)480508088408619541L, (long)l2);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = false;
            m44.a("s", (Object)m44.a("r", (Object)this, (long)95954162722673231L, (long)l2), (Object)objectArray, (long)103065850323638133L, (long)l2);
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    vm(tn tn2) {
        this.v = tn2;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        block8: {
            CallSite callSite;
            long l;
            long l2;
            block6: {
                long l3 = l2 = a ^ 0x225373BBF26CL;
                l = l3 ^ 0x723234BBB48BL;
                long l4 = l3 ^ 0x1055AFD62DDBL;
                CallSite callSite2 = m44.a("i", (long)532684379115975060L, (long)l2);
                try {
                    block7: {
                        try {
                            try {
                                callSite = m44.a("w", (Object)this, (long)326993527801059218L, (long)l2);
                                if (callSite2 != null) break block6;
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l4;
                                if (m44.a("v", (Object)callSite, (Object)objectArray, (long)2072246711159903795L, (long)l2) != false) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("i", (Object)((Object)n92), (long)249466696344879048L, (long)l2);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l;
                            objectArray[0] = false;
                            m44.a("v", (Object)m44.a("w", (Object)this, (long)326993527801059218L, (long)l2), (Object)objectArray, (long)338749588571853480L, (long)l2);
                            if (callSite2 == null) break block8;
                        }
                        catch (n9 n93) {
                            throw m44.a("i", (Object)((Object)n93), (long)249466696344879048L, (long)l2);
                        }
                    }
                    callSite = m44.a("w", (Object)this, (long)326993527801059218L, (long)l2);
                }
                catch (n9 n94) {
                    throw m44.a("i", (Object)((Object)n94), (long)249466696344879048L, (long)l2);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = true;
            m44.a("v", (Object)callSite, (Object)objectArray, (long)338749588571853480L, (long)l2);
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x6405E86EF176L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00810\u0010@c\u00cb9\u00ee\u00fb\u00d2\u000f\u000f\u0014@\u00d6\u00d3";
        int n2 = "\u00810\u0010@c\u00cb9\u00ee\u00fb\u00d2\u000f\u000f\u0014@\u00d6\u00d3".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xBD8;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/vm", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            vm.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = vm.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/vm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(vm.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
