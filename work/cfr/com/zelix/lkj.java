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
    private static final long a = prr.a(3205879399397608885L, 6281604448732268559L, MethodHandles.lookup().lookupClass()).a(75581211873374L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public List R(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        l10 = a ^ l10;
        return (List)((Object)m44.a("w", (Object)m44.a("v", (Object)this, (long)888603837243234972L, (long)l10), (Object)object, (long)1270732434162958811L, (long)l10));
    }

    public lkj(int n10, int n11, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x28B75499FC31L;
        m44.a("s", (Object)this, (int)lkj.a("q", (int)31431, (long)(0x27B1180060C9941DL ^ l10)), (long)-6749437293871907513L, (long)l10);
        m44.a("s", (Object)this, (int)n11, (long)-6749437293871907513L, (long)l10);
        m44.a("s", (Object)this, (g1)new g1(n10, l11), (long)-6916436575388289333L, (long)l10);
    }

    public Object clone() {
        lkj lkj2;
        block4: {
            long l10;
            long l11 = l10 = a ^ 0x2B2D410B78C6L;
            long l12 = l11 ^ 0x26E81A1F5DCBL;
            int n10 = (int)(l12 >>> 32);
            int n11 = (int)(l12 << 32 >>> 48);
            int n12 = (int)(l12 << 48 >>> 48);
            long l13 = l11 ^ 0x5A9CE0C00BDEL;
            CallSite callSite = m44.a("u", (Object)m44.a("t", (Object)this, (long)8628603555884687734L, (long)l10), (long)7763701313032158174L, (long)l10);
            lkj lkj3 = new lkj(n10, (char)n11, (int)callSite, (short)n12);
            CallSite callSite2 = m44.a("j", (long)8449951549186206578L, (long)l10);
            Iterator iterator = m44.a("u", (Object)m44.a("t", (Object)this, (long)8628603555884687734L, (long)l10), (long)7623371869800846483L, (long)l10).iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                ArrayList arrayList = new ArrayList((Collection)entry.getValue());
                try {
                    lkj2 = lkj3;
                    if (callSite2 == null) {
                        Object[] objectArray = new Object[3];
                        objectArray[2] = l13;
                        objectArray[1] = arrayList;
                        objectArray[0] = entry.getKey();
                        m44.a("u", (Object)lkj2, (Object)objectArray, (long)8601547792260647591L, (long)l10);
                        if (callSite2 == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)n92, (long)7503120009743079915L, (long)l10);
                }
            }
            lkj2 = lkj3;
        }
        return lkj2;
    }

    public int Q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("q", (Object)m44.a("p", (Object)this, (long)-769394556170443878L, (long)l10), (long)-1634156061563193038L, (long)l10);
    }

    public synchronized Enumeration V(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x361F48724107L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("q", (Object)m44.a("p", (Object)this, (long)1149220702232484154L, (long)l10), (Object)objectArray2, (long)1165839351451006611L, (long)l10);
    }

    public boolean V(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = a ^ l10;
        return (boolean)m44.a("w", (Object)m44.a("v", (Object)this, (long)6155480821960065956L, (long)l10), (Object)object, (long)5779783277182707780L, (long)l10);
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

    public lkj(int n10, int n11, char c10) {
        long l10 = ((long)n10 << 32 | (long)n11 << 48 >>> 32 | (long)c10 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x4D5313FDCC96L;
        this((int)lkj.a("q", (int)22686, (long)(0x14FA21C6FBF9F910L ^ l10)), 5, l11);
    }

    public lkj(int n10, char c10, int n11, short s10) {
        long l10 = ((long)n10 << 32 | (long)c10 << 48 >>> 32 | (long)s10 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x324B86448A76L;
        this(n11, 5, l11);
    }

    public void q(Object[] objectArray) {
        Object object = objectArray[0];
        List list = (List)objectArray[1];
        long l10 = (Long)objectArray[2];
        l10 = a ^ l10;
        m44.a("p", (Object)m44.a("q", (Object)this, (long)9197446444234107243L, (long)l10), (Object)object, (Object)list, (long)7322249035314917501L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l10 = a ^ 0x3F361E46534DL;
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
        String string = "\u00e9\u00c3\u00ec[?\u00f6o\u0089k\u00855\u001cI\u00af5\u00ea";
        int n11 = "\u00e9\u00c3\u00ec[?\u00f6o\u0089k\u00855\u001cI\u00af5\u00ea".length();
        int n12 = 0;
        do {
            byte[] byArray3 = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n13] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4262;
        if (c[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
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
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lkj.c[n11] = n12;
        }
        return c[n11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lkj.a(n10, l10);
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

