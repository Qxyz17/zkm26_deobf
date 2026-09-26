/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.h;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.mn;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class laf
extends l7t
implements h {
    private String Y;
    private String k;
    private static final long a = prr.a((long)-5280257128313351584L, (long)4764121545817049390L, MethodHandles.lookup().lookupClass()).a(39235722270014L);
    private static final long[] b;
    private static final Integer[] d;
    private static final Map e;

    public laf(byte by, int n, int n2, int n3) {
        long l = ((long)by << 56 | (long)n2 << 32 >>> 8 | (long)n3 << 40 >>> 40) ^ a;
        long l2 = l ^ 0x6F4DBB6096E6L;
        int n4 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n4, n, l3);
    }

    public void M(Object[] objectArray) {
        block6: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l = (Long)objectArray[2];
            long l2 = l;
            long l3 = l2 ^ 0x17601E9C00AEL;
            long l4 = l2 ^ 0x47526B4E5A06L;
            long l5 = l2 ^ 0L;
            StringBuilder stringBuilder = new StringBuilder();
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
            int n = 0;
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l);
            block2: while (n < callSite) {
                lmu lmu3 = this.V(n);
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = l5;
                objectArray3[1] = lqu2;
                objectArray3[0] = this;
                m44.a("w", (Object)lmu3, (Object)objectArray3, (long)-6656114929610942631L, (long)l);
                dd dd2 = (dd)lmu3;
                try {
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l3;
                    stringBuilder.append((String)((Object)m44.a("w", (Object)dd2, (Object)objectArray4, (long)-6627114529386709182L, (long)l)));
                    ++n;
                    do {
                        CallSite callSite3 = callSite2;
                        if (l >= 0L) {
                            if (callSite3 == false) break block6;
                            callSite3 = callSite2;
                        }
                        if (callSite3 != false) continue block2;
                    } while (l <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)((Object)n92), (long)-4641760014367662836L, (long)l);
                }
            }
            m44.a("t", (Object)((Object)this), (String)stringBuilder.toString(), (long)-5160490464119057025L, (long)l);
            m44.a("t", (Object)((Object)this), (String)((String)((Object)m44.a("v", (Object)((Object)this), (long)-5160490464119057025L, (long)l))).replace((char)laf.a("s", (int)20365, (long)(0x7E27B70BDBAC4F6EL ^ l)), (char)laf.a("s", (int)26676, (long)(0x89834DCB535E8D6L ^ l))), (long)-4918583173744384722L, (long)l);
        }
    }

    public String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return "@" + (String)((Object)m44.a("p", (Object)((Object)this), (long)-5130631164105026095L, (long)l));
    }

    boolean c(Object[] objectArray) {
        boolean bl;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("i", (long)-2979154402316253793L, (long)l);
                try {
                    try {
                        bl = ((String)((Object)m44.a("w", (Object)((Object)this), (long)-3723150244596690233L, (long)l))).indexOf("*");
                        if (callSite != false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)-4000252130179437851L, (long)l);
                    }
                    bl = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)-4000252130179437851L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean q(short s, Set set, int n, int n2) {
        long l = (long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48;
        long l2 = l ^ 0x5CE700350AE4L;
        Iterator iterator = set.iterator();
        CallSite callSite = m44.a("o", (long)6776100058742951217L, (long)l);
        while (iterator.hasNext()) {
            boolean bl = mn.R((String)((String)iterator.next()), (long)l2, (String)((Object)m44.a("q", (Object)((Object)this), (long)4970521898634009193L, (long)l)));
            while (bl) {
                bl = true;
                if (n2 <= 0 || callSite != false) continue;
                return bl;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x460B7894F56BL;
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
        String string = "&A?\u00dd\u0095T\b!lk\u00d9\tVBF\u0081";
        int n2 = "&A?\u00dd\u0095T\b!lk\u00d9\tVBF\u0081".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        d = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3575;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/laf", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            laf.d[n2] = n3;
        }
        return d[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = laf.a(n, l);
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
            throw new RuntimeException("com/zelix/laf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(laf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
