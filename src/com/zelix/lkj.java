/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.g1;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
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
public class lkj {
    private g1 k;
    private int M;
    private static final long a = prr.a((long)3205879399397608885L, (long)6281604448732268559L, MethodHandles.lookup().lookupClass()).a(75581211873374L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public List R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        Object object = objectArray[1];
        l = a ^ l;
        return (List)((Object)m44.a("w", (Object)m44.a("v", (Object)this, (long)888603837243234972L, (long)l), (Object)object, (long)1270732434162958811L, (long)l));
    }

    public lkj(int n, int n2, long l) {
        long l2 = (l = a ^ l) ^ 0x28B75499FC31L;
        m44.a("s", (Object)this, (int)lkj.a("q", (int)31431, (long)(0x27B1180060C9941DL ^ l)), (long)-6749437293871907513L, (long)l);
        m44.a("s", (Object)this, (int)n2, (long)-6749437293871907513L, (long)l);
        m44.a("s", (Object)this, (g1)new g1(n, l2), (long)-6916436575388289333L, (long)l);
    }

    public Object clone() {
        lkj lkj2;
        block4: {
            long l;
            long l2 = l = a ^ 0x2B2D410B78C6L;
            long l3 = l2 ^ 0x26E81A1F5DCBL;
            int n = (int)(l3 >>> 32);
            int n2 = (int)(l3 << 32 >>> 48);
            int n3 = (int)(l3 << 48 >>> 48);
            long l4 = l2 ^ 0x5A9CE0C00BDEL;
            CallSite callSite = m44.a("u", (Object)m44.a("t", (Object)this, (long)8628603555884687734L, (long)l), (long)7763701313032158174L, (long)l);
            lkj lkj3 = new lkj(n, (char)n2, (int)callSite, (short)n3);
            CallSite callSite2 = m44.a("j", (long)8449951549186206578L, (long)l);
            Iterator iterator = m44.a("u", (Object)m44.a("t", (Object)this, (long)8628603555884687734L, (long)l), (long)7623371869800846483L, (long)l).iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                ArrayList arrayList = new ArrayList((Collection)entry.getValue());
                try {
                    lkj2 = lkj3;
                    if (callSite2 == null) {
                        Object[] objectArray = new Object[3];
                        objectArray[2] = l4;
                        objectArray[1] = arrayList;
                        objectArray[0] = entry.getKey();
                        m44.a("u", (Object)lkj2, (Object)objectArray, (long)8601547792260647591L, (long)l);
                        if (callSite2 == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)((Object)n92), (long)7503120009743079915L, (long)l);
                }
            }
            lkj2 = lkj3;
        }
        return lkj2;
    }

    public int Q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)m44.a("q", (Object)m44.a("p", (Object)this, (long)-769394556170443878L, (long)l), (long)-1634156061563193038L, (long)l);
    }

    public synchronized Enumeration V(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x361F48724107L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return m44.a("q", (Object)m44.a("p", (Object)this, (long)1149220702232484154L, (long)l), (Object)objectArray2, (long)1165839351451006611L, (long)l);
    }

    public boolean V(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (boolean)m44.a("w", (Object)m44.a("v", (Object)this, (long)6155480821960065956L, (long)l), (Object)object, (long)5779783277182707780L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public void W(Object[] var1_1) {
        block6: {
            block5: {
                var4_2 = (Long)var1_1[0];
                var2_3 = var1_1[1];
                var3_4 = var1_1[2];
                var4_2 = lkj.a ^ var4_2;
                var7_5 = (ArrayList<Object>)m44.a("r", (Object)m44.a("s", (Object)this, (long)-9130623721911347327L, (long)var4_2), (Object)var2_3, (long)-7151722770109346618L, (long)var4_2);
                var6_6 = m44.a("m", (long)-8956756942226416251L, (long)var4_2);
                try {
                    v0 = var7_5;
                    if (var6_6 != null) break block5;
                    if (v0 == null) {
                    }
                    ** GOTO lbl25
                }
                catch (n9 v1) {
                    throw m44.a("m", (Object)v1, (long)-7001099834051956964L, (long)var4_2);
                }
                var7_5 = new ArrayList<Object>((int)m44.a("s", (Object)this, (long)-8998388837714256883L, (long)var4_2));
                try {
                    v0 = var7_5;
                    if (var4_2 <= 0L) break block5;
                    v0.add(var3_4);
                    m44.a("r", (Object)m44.a("s", (Object)this, (long)-9130623721911347327L, (long)var4_2), (Object)var2_3, var7_5, (long)-7244114330770436457L, (long)var4_2);
                    if (var6_6 == null) break block6;
lbl25:
                    // 2 sources

                    v0 = var7_5;
                }
                catch (n9 v2) {
                    throw m44.a("m", (Object)v2, (long)-7001099834051956964L, (long)var4_2);
                }
            }
            v0.add(var3_4);
        }
    }

    public lkj(int n, int n2, char c) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ a;
        long l2 = l ^ 0x4D5313FDCC96L;
        this((int)lkj.a("q", (int)22686, (long)(0x14FA21C6FBF9F910L ^ l)), 5, l2);
    }

    public lkj(int n, char c, int n2, short s) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0x324B86448A76L;
        this(n2, 5, l2);
    }

    public void q(Object[] objectArray) {
        Object object = objectArray[0];
        List list = (List)objectArray[1];
        long l = (Long)objectArray[2];
        l = a ^ l;
        m44.a("p", (Object)m44.a("q", (Object)this, (long)9197446444234107243L, (long)l), (Object)object, (Object)list, (long)7322249035314917501L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x3F361E46534DL;
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
        String string = "\u00e9\u00c3\u00ec[?\u00f6o\u0089k\u00855\u001cI\u00af5\u00ea";
        int n2 = "\u00e9\u00c3\u00ec[?\u00f6o\u0089k\u00855\u001cI\u00af5\u00ea".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4262;
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
                throw new RuntimeException("com/zelix/lkj", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lkj.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = lkj.a(n, l);
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
            throw new RuntimeException("com/zelix/lkj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lkj.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
