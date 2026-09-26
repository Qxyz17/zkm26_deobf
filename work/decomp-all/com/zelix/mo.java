/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bc;
import com.zelix.i_;
import com.zelix.lu3;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class mo {
    private final i_ v;
    private final bc o;
    private List T;
    private final String r;
    private String V;
    private final String I;
    private final lu3 J;
    private static final long a = prr.a((long)-1973324603074543881L, (long)-8203251474744246011L, MethodHandles.lookup().lookupClass()).a(174610177329952L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public lu3 U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)this, (long)-246388811441595645L, (long)l);
    }

    public String X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)-5682039330518047713L, (long)l);
    }

    public i_ U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("q", (Object)this, (long)-7330811025754224794L, (long)l);
    }

    public bc o(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("u", (Object)this, (long)3043384015031002247L, (long)l);
    }

    public List V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)-3209771985277609572L, (long)l);
    }

    public String y(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("r", (Object)this, (long)-8382809687140965921L, (long)l);
    }

    public boolean L(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        block8: {
            block9: {
                l = (Long)objectArray[0];
                l = a ^ l;
                callSite2 = m44.a("l", (long)6723110980870946049L, (long)l);
                try {
                    try {
                        callSite = m44.a("r", (Object)this, (long)6501145723239698640L, (long)l);
                        if (callSite2 != null) break block8;
                        if (callSite != null) break block9;
                    }
                    catch (n9 n92) {
                        throw m44.a("l", (Object)((Object)n92), (long)4987605961874131934L, (long)l);
                    }
                    return false;
                }
                catch (n9 n93) {
                    throw m44.a("l", (Object)((Object)n93), (long)4987605961874131934L, (long)l);
                }
            }
            callSite = m44.a("r", (Object)this, (long)6501145723239698640L, (long)l);
        }
        Iterator iterator = callSite.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            try {
                if (string == null) {
                    return false;
                }
            }
            catch (n9 n94) {
                throw m44.a("l", (Object)((Object)n94), (long)4987605961874131934L, (long)l);
            }
            if (callSite2 == null) continue;
        }
        return true;
    }

    public mo(bc bc2, lu3 lu32, i_ i_2, String string, String string2, long l, List list, String string3) {
        block11: {
            block12: {
                l = a ^ l;
                this.o = bc2;
                this.J = lu32;
                this.v = i_2;
                this.r = string;
                CallSite callSite = m44.a("n", (long)8887602549421906715L, (long)l);
                try {
                    this.I = string2;
                    if (callSite != null) break block11;
                    if (list == null) break block12;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)((Object)n92), (long)7146609584261688772L, (long)l);
                }
                int n = 0;
                while (n < list.size()) {
                    CallSite callSite2;
                    block13: {
                        block14: {
                            block15: {
                                String string4 = (String)list.get(n);
                                try {
                                    try {
                                        try {
                                            callSite2 = callSite;
                                            if (l > 0L) {
                                                if (callSite2 != null) break block11;
                                                callSite2 = callSite;
                                            }
                                            if (l <= 0L) break block13;
                                            if (callSite2 != null) break block14;
                                        }
                                        catch (n9 n93) {
                                            throw m44.a("n", (Object)((Object)n93), (long)7146609584261688772L, (long)l);
                                        }
                                        if (string4 == null) break block15;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("n", (Object)((Object)n94), (long)7146609584261688772L, (long)l);
                                    }
                                    list.set(n, string4.replace((char)mo.a("e", (int)14415, (long)(0x4A0BCC479E23A48L ^ l)), (char)mo.a("e", (int)24909, (long)(0x7922D20571C8634BL ^ l))));
                                }
                                catch (n9 n95) {
                                    throw m44.a("n", (Object)((Object)n95), (long)7146609584261688772L, (long)l);
                                }
                            }
                            ++n;
                        }
                        callSite2 = callSite;
                    }
                    if (callSite2 == null) continue;
                }
            }
            m44.a("r", (Object)this, (List)list, (long)8944965969662555850L, (long)l);
            m44.a("r", (Object)this, (String)string3, (long)9052144750733890841L, (long)l);
            if (l >= 0L) {
                // empty if block
            }
        }
    }

    public String i(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)this, (long)4704538450566851023L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x2E1B06FD872AL;
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
        String string = "\u0089\u00de\u0018\u0003\u00e4\u00b3\u0090G+\u00e5<C3\u00c0\u00c8\t";
        int n2 = "\u0089\u00de\u0018\u0003\u00e4\u00b3\u0090G+\u00e5<C3\u00c0\u00c8\t".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x725F;
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
                throw new RuntimeException("com/zelix/mo", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mo.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = mo.a(n, l);
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
            throw new RuntimeException("com/zelix/mo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mo.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
