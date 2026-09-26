/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.mn;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.t_;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ya
implements t_ {
    private String r;
    private static final long a = prr.a((long)1952717311825525219L, (long)3635764700489644958L, MethodHandles.lookup().lookupClass()).a(14687338588292L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double p(Object[] var1_1) {
        block8: {
            block9: {
                var2_2 = (Long)var1_1[0];
                var5_3 = m44.a("w", (Object)this, (long)-7264405344178195235L, (long)var2_2).lastIndexOf("*");
                var4_4 = m44.a("i", (long)-8894147198881954729L, (long)var2_2);
                try {
                    try {
                        v0 = m44.a("w", (Object)this, (long)-7264405344178195235L, (long)var2_2).equals("*");
                        v1 /* !! */  = var4_4;
                        if (var2_2 > 0L) {
                            if (v1 /* !! */  == false) break block8;
                            if (v0 == 0) break block9;
                        }
                        ** GOTO lbl24
                    }
                    catch (n9 v2) {
                        throw m44.a("i", (Object)v2, (long)-7295785652510798008L, (long)var2_2);
                    }
                    return 1.0;
                }
                catch (n9 v3) {
                    throw m44.a("i", (Object)v3, (long)-7295785652510798008L, (long)var2_2);
                }
            }
            v0 = var5_3;
        }
        try {
            v1 /* !! */  = (CallSite)-1;
lbl24:
            // 2 sources

            if (v0 > v1 /* !! */ ) {
                return 0.5;
            }
        }
        catch (n9 v4) {
            throw m44.a("i", (Object)v4, (long)-7295785652510798008L, (long)var2_2);
        }
        return 0.1;
    }

    public boolean V(Object[] objectArray) {
        boolean bl;
        block5: {
            block6: {
                long l = (Long)objectArray[0];
                CallSite callSite = m44.a("j", (long)-3577336447021134180L, (long)l);
                try {
                    try {
                        bl = ((String)((Object)m44.a("t", (Object)this, (long)-3322321059068543466L, (long)l))).indexOf("*");
                        Object object = callSite;
                        if (l >= 0L) {
                            if (object == false) break block5;
                            object = -1;
                        }
                        if (bl != object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)-3455612420023155325L, (long)l);
                    }
                    bl = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)-3455612420023155325L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean i(char c, int n, short s, String string) {
        long l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
        long l2 = l ^ 0x3737528C0D12L;
        return mn.R((String)string, (long)l2, (String)((Object)m44.a("w", (Object)this, (long)6775575051951469045L, (long)l)));
    }

    ya(long l, String string) {
        l = a ^ l;
        m44.a("r", (Object)this, (String)string, (long)5674745479514022194L, (long)l);
    }

    public String Y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2EEE0D7ABCFCL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("u", (Object)this, (Object)objectArray2, (long)537774540087005104L, (long)l);
    }

    public boolean T(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List a(Object[] objectArray) {
        ArrayList<String> arrayList;
        long l = (Long)objectArray[0];
        ArrayList<String> arrayList2 = new ArrayList<String>();
        CallSite callSite = m44.a("o", (long)-2544037991069446263L, (long)l);
        StringTokenizer stringTokenizer = new StringTokenizer("/");
        block2: while (stringTokenizer.hasMoreTokens()) {
            try {
                do {
                    if (l >= 0L) {
                        arrayList = arrayList2;
                        if (callSite != false) return arrayList;
                        arrayList.add(stringTokenizer.nextToken());
                    }
                    if (callSite == false) continue block2;
                } while (l < 0L);
                break;
            }
            catch (n9 n92) {
                throw m44.a("o", (Object)((Object)n92), (long)-2691459387687399634L, (long)l);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    public boolean c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ((String)((Object)m44.a("p", (Object)this, (long)-6478242448201741846L, (long)l))).replace((char)ya.a("b", (int)17724, (long)(0x6B5CE13EE50FB402L ^ l)), (char)ya.a("b", (int)16069, (long)(0x2E402B8DE1B7CFF8L ^ l))) + (char)ya.a("b", (int)25684, (long)(0x4D2EC7F651A9956BL ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x6573F18543DAL;
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
        long[] lArray = new long[3];
        int n = 0;
        String string = "QO\u00a4\u001bV\"E\u00f9\u00b1\u00c5\u00ce\u00f0e\u00ac\u00c5\u00ea\u0011\u00b3\u0098\u0011I\u001c\u00b6w";
        int n2 = "QO\u00a4\u001bV\"E\u00f9\u00b1\u00c5\u00ce\u00f0e\u00ac\u00c5\u00ea\u0011\u00b3\u0098\u0011I\u001c\u00b6w".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[3];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4406;
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
                throw new RuntimeException("com/zelix/ya", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ya.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ya.a(n, l);
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
            throw new RuntimeException("com/zelix/ya" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ya.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
