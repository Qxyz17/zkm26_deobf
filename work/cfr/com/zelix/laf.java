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
    private static final long a = prr.a(-5280257128313351584L, 4764121545817049390L, MethodHandles.lookup().lookupClass()).a(39235722270014L);
    private static final long[] b;
    private static final Integer[] d;
    private static final Map e;

    public laf(byte by2, int n10, int n11, int n12) {
        long l10 = ((long)by2 << 56 | (long)n11 << 32 >>> 8 | (long)n12 << 40 >>> 40) ^ a;
        long l11 = l10 ^ 0x6F4DBB6096E6L;
        int n13 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n13, n10, l12);
    }

    @Override
    public void M(Object[] objectArray) {
        block6: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l10 = (Long)objectArray[2];
            long l11 = l10;
            long l12 = l11 ^ 0x17601E9C00AEL;
            long l13 = l11 ^ 0x47526B4E5A06L;
            long l14 = l11 ^ 0L;
            StringBuilder stringBuilder = new StringBuilder();
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l13;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
            int n10 = 0;
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l10);
            block2: while (n10 < callSite) {
                lmu lmu3 = this.V(n10);
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = l14;
                objectArray3[1] = lqu2;
                objectArray3[0] = this;
                m44.a("w", (Object)lmu3, (Object)objectArray3, (long)-6656114929610942631L, (long)l10);
                dd dd2 = (dd)((Object)lmu3);
                try {
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l12;
                    stringBuilder.append((String)((Object)m44.a("w", (Object)dd2, (Object)objectArray4, (long)-6627114529386709182L, (long)l10)));
                    ++n10;
                    do {
                        CallSite callSite3 = callSite2;
                        if (l10 >= 0L) {
                            if (callSite3 == false) break block6;
                            callSite3 = callSite2;
                        }
                        if (callSite3 != false) continue block2;
                    } while (l10 <= 0L);
                    break;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-4641760014367662836L, (long)l10);
                }
            }
            m44.a("t", (Object)this, (String)stringBuilder.toString(), (long)-5160490464119057025L, (long)l10);
            m44.a("t", (Object)this, (String)((String)((Object)m44.a("v", (Object)this, (long)-5160490464119057025L, (long)l10))).replace((char)laf.a("s", (int)20365, (long)(0x7E27B70BDBAC4F6EL ^ l10)), (char)laf.a("s", (int)26676, (long)(0x89834DCB535E8D6L ^ l10))), (long)-4918583173744384722L, (long)l10);
        }
    }

    @Override
    public String e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return "@" + (String)((Object)m44.a("p", (Object)this, (long)-5130631164105026095L, (long)l10));
    }

    boolean c(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("i", (long)-2979154402316253793L, (long)l10);
                try {
                    try {
                        bl2 = ((String)((Object)m44.a("w", (Object)this, (long)-3723150244596690233L, (long)l10))).indexOf("*");
                        if (callSite != false) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-4000252130179437851L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-4000252130179437851L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public boolean q(short s10, Set set, int n10, int n11) {
        long l10 = (long)s10 << 48 | (long)n10 << 32 >>> 16 | (long)n11 << 48 >>> 48;
        long l11 = l10 ^ 0x5CE700350AE4L;
        Iterator iterator = set.iterator();
        CallSite callSite = m44.a("o", (long)6776100058742951217L, (long)l10);
        while (iterator.hasNext()) {
            boolean bl2 = mn.R((String)iterator.next(), l11, (String)((Object)m44.a("q", (Object)this, (long)4970521898634009193L, (long)l10)));
            while (bl2) {
                bl2 = true;
                if (n11 <= 0 || callSite != false) continue;
                return bl2;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l10 = a ^ 0x460B7894F56BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "&A?\u00dd\u0095T\b!lk\u00d9\tVBF\u0081";
        int n11 = "&A?\u00dd\u0095T\b!lk\u00d9\tVBF\u0081".length();
        int n12 = 0;
        do {
            byte[] byArray3 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n12 < n11);
        b = lArray;
        d = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3575;
        if (d[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
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
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            laf.d[n11] = n12;
        }
        return d[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = laf.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
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

