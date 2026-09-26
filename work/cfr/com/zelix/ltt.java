/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.l7t;
import com.zelix.l7w;
import com.zelix.lbt;
import com.zelix.lkx;
import com.zelix.lmu;
import com.zelix.lqu;
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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ltt
extends l7t
implements lbt,
lkx {
    private LinkedList u;
    private static final long a = prr.a(-1427029012812615426L, 1213126538907100690L, MethodHandles.lookup().lookupClass()).a(207966596625459L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;

    public void U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l7w l7w2 = (l7w)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x5CE6C5F6AC02L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = l7w2;
        m44.a("r", (Object)this, (Object)objectArray2, (long)4546725741868565320L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void M(Object[] var1_1) {
        var2_2 = (lmu)var1_1[0];
        var5_3 = (lqu)var1_1[1];
        var3_4 = (Long)var1_1[2];
        v0 = var3_4;
        var6_5 = v0 ^ 78419313187334L;
        var8_6 = v0 ^ 0L;
        v1 = new Object[1];
        v1[0] = var6_5;
        var11_7 = m44.a("w", (Object)this, (Object)v1, (long)-4972914505230991179L, (long)var3_4);
        var12_8 = 0;
        var10_9 = m44.a("h", (long)-6823249310977527178L, (long)var3_4);
        while (var12_8 < var11_7) {
            v2 = new Object[3];
            v2[2] = var8_6;
            v2[1] = var5_3;
            v2[0] = this;
            m44.a("w", (Object)this.V(var12_8), (Object)v2, (long)-6656114929610942631L, (long)var3_4);
            ++var12_8;
lbl23:
            // 2 sources

            ** while (var10_9 != false)
lbl24:
            // 1 sources

        }
lbl25:
        // 2 sources

        if (var3_4 < 0L) ** GOTO lbl23
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String p(Object[] objectArray) {
        StringBuilder stringBuilder;
        block24: {
            long l10 = (Long)objectArray[0];
            long l11 = l10 ^ 0L;
            stringBuilder = new StringBuilder();
            CallSite callSite = m44.a("n", (long)7579247942499953128L, (long)l10);
            stringBuilder.append("{");
            boolean bl2 = true;
            CallSite callSite2 = m44.a("q", (Object)m44.a("p", (Object)this, (long)8212913481258669743L, (long)l10), (long)8364072678222258679L, (long)l10);
            block14: while (true) {
                Object object = callSite2.hasNext();
                block15: while (object) {
                    CallSite callSite3;
                    CallSite callSite4;
                    Object object2;
                    List list = (List)callSite2.next();
                    try {
                        try {
                            try {
                                try {
                                    object2 = callSite;
                                    if (l10 > 0L) {
                                        if (object2 == false) break block24;
                                        object2 = callSite4;
                                    }
                                    callSite3 = callSite;
                                }
                                catch (n9 n92) {
                                    throw m44.a("n", (Object)n92, (long)8212656845719545662L, (long)l10);
                                }
                            }
                            catch (n9 n93) {
                                throw m44.a("n", (Object)n93, (long)8212656845719545662L, (long)l10);
                            }
                        }
                        catch (n9 n94) {
                            throw m44.a("n", (Object)n94, (long)8212656845719545662L, (long)l10);
                        }
                    }
                    catch (n9 n95) {
                        throw m44.a("n", (Object)n95, (long)8212656845719545662L, (long)l10);
                    }
                    block16: while (true) {
                        Object object3;
                        block32: {
                            block33: {
                                block30: {
                                    block31: {
                                        if (callSite3 == false || l10 <= 0L) break block30;
                                        if (object2 != false) break block31;
                                        stringBuilder.append((String)((Object)ltt.a("o", (int)22902, (long)(0x494CAF4DD86E222L ^ l10))));
                                        object3 = callSite;
                                        if (l10 <= 0L) break block32;
                                        if (object3) break block33;
                                    }
                                    object2 = false;
                                }
                                callSite4 = object2;
                            }
                            object3 = 1;
                        }
                        Object object4 = object3;
                        for (l7w l7w2 : list) {
                            CallSite callSite5;
                            block28: {
                                block29: {
                                    boolean bl3;
                                    block26: {
                                        object = object4;
                                        if (callSite == false) continue block15;
                                        try {
                                            block27: {
                                                try {
                                                    try {
                                                        callSite3 = callSite;
                                                        if (l10 < 0L) continue block16;
                                                        if (callSite3 == false) break block26;
                                                        if (object) break block27;
                                                    }
                                                    catch (n9 n96) {
                                                        throw m44.a("n", (Object)n96, (long)8212656845719545662L, (long)l10);
                                                    }
                                                    stringBuilder.append((String)((Object)ltt.a("o", (int)5290, (long)(0x4CA9F64E0F752FFFL ^ l10))));
                                                    callSite5 = callSite;
                                                    if (l10 <= 0L) break block28;
                                                    if (callSite5 != false) break block29;
                                                }
                                                catch (n9 n97) {
                                                    throw m44.a("n", (Object)n97, (long)8212656845719545662L, (long)l10);
                                                }
                                            }
                                            bl3 = false;
                                        }
                                        catch (n9 n98) {
                                            throw m44.a("n", (Object)n98, (long)8212656845719545662L, (long)l10);
                                        }
                                    }
                                    object4 = bl3;
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l11;
                                stringBuilder.append((String)((Object)m44.a("q", (Object)l7w2, (Object)objectArray2, (long)7934927217291019597L, (long)l10)));
                                callSite5 = callSite;
                            }
                            if (callSite5 != false) continue;
                        }
                        break;
                    }
                    object = callSite;
                    if (l10 < 0L) continue;
                    if (object) continue block14;
                }
                break;
            }
            stringBuilder.append("}");
            if (l10 >= 0L) {
                // empty if block
            }
        }
        return stringBuilder.toString();
    }

    public ltt(long l10, int n10) {
        long l11 = (l10 = a ^ l10) ^ 0x6F5503F773D7L;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
        m44.a("w", (Object)this, new LinkedList(), (long)7568052141082840658L, (long)l10);
    }

    @Override
    public void z(Object[] objectArray) {
        l7w l7w2 = (l7w)objectArray[0];
        long l10 = (Long)objectArray[1];
        LinkedList<l7w> linkedList = new LinkedList<l7w>();
        linkedList.add(l7w2);
        m44.a("p", (Object)m44.a("q", (Object)this, (long)-7686752556396285434L, (long)l10), linkedList, (long)-8587601585711186665L, (long)l10);
    }

    @Override
    public boolean e(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = l10 ^ 0L;
        boolean bl2 = false;
        CallSite callSite = m44.a("w", (Object)m44.a("v", (Object)this, (long)3896806018441793857L, (long)l10), (long)3746215234598053401L, (long)l10);
        CallSite callSite2 = m44.a("h", (long)3929025923230197182L, (long)l10);
        block4: while (callSite.hasNext()) {
            Object object;
            block7: {
                List list = (List)callSite.next();
                while (true) {
                    for (l7w l7w2 : list) {
                        block8: {
                            try {
                                try {
                                    if (l10 < 0L) break block4;
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l11;
                                    objectArray2[0] = string;
                                    object = m44.a("w", (Object)l7w2, (Object)objectArray2, (long)3602769201817000850L, (long)l10);
                                    if (callSite2 != false) break block7;
                                    if (object) break block8;
                                }
                                catch (n9 n92) {
                                    throw m44.a("h", (Object)n92, (long)3897631015592026320L, (long)l10);
                                }
                                if (callSite2 == false) continue block4;
                                if (l10 <= 0L) continue;
                            }
                            catch (n9 n93) {
                                throw m44.a("h", (Object)n93, (long)3897631015592026320L, (long)l10);
                            }
                        }
                        if (callSite2 == false) continue;
                    }
                    break;
                }
                if (l10 < 0L) break;
                object = true;
            }
            bl2 = object;
            break;
        }
        return bl2;
    }

    public void x(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l7w l7w2 = (l7w)objectArray[1];
        l10 = a ^ l10;
        ((List)((Object)m44.a("v", (Object)m44.a("w", (Object)this, (long)1573222499689099904L, (long)l10), (long)839633957815099914L, (long)l10))).add(l7w2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l10 = a ^ 0x4796077D0A97L;
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
        String[] stringArray = new String[2];
        int n10 = 0;
        String string = "2\u0082\u00a1\u009e\u001c%\u0015\u00c00^\u00ae\u00e0\u00b9\u000f\u000bt\u0010\u00e1qj\u00b7\u00aa5\u00b5\u0007\u00db\u0087\u00e1]\u0013\u00f4\u0010F";
        int n11 = "2\u0082\u00a1\u009e\u001c%\u0015\u00c00^\u00ae\u00e0\u00b9\u000f\u000bt\u0010\u00e1qj\u00b7\u00aa5\u00b5\u0007\u00db\u0087\u00e1]\u0013\u00f4\u0010F".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = ltt.b(byArray3).intern();
            if ((n13 += n12) >= n11) {
                b = stringArray;
                d = new String[2];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x5EE4;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ltt", exception);
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
            ltt.d[n11] = ltt.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ltt.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ltt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ltt.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

