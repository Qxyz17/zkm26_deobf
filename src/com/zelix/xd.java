/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.aw;
import com.zelix.h1;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.lkh;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import com.zelix.x8;
import com.zelix.xb;
import java.io.DataOutputStream;
import java.io.PrintWriter;
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

public class xd
extends js
implements lkh {
    int b;
    int W;
    static final va H;
    private static final String[] a;
    private static final String[] c;
    private static final Map d;

    public boolean G() {
        return true;
    }

    xd(int n, h1 h12, to to2) {
        super(n, to2);
        this.b = h12.readUnsignedShort();
        this.W = h12.readUnsignedShort();
    }

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-175163673062695293L, (long)l).g());
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeShort(this.W);
    }

    public va A(long l) {
        return m44.a("i", (long)-5420687443556378665L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = prr.a((long)8577421092582034700L, (long)-2775140317235328108L, MethodHandles.lookup().lookupClass()).a(120968604011056L) ^ 41590298230162L;
                xd.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[8];
                var5_4 = 0;
                var4_5 = "\t\u00d49S-\u00e6\u00b8q6\u001e\u0000\u00fe\u00bd\u0082\u0088;\u0006@\u0019Z\u0012\u00bf\u00cd\u0015\u00e2\u008a~S\u0007\u00fdY\u00b7Q\u00af\u00d4\r5\u00e4\u0006\u000b\u00dfw\u00e0\u00a0D\u00a70\u00db\u0010\f\u0012h\u00eaHS\u00f0\u0000\u00d9\u00f9\u00b7\u00ea\u00a5N(\u00f3\u00107\u00b2\u0003(\u0092{\u00a3L\u0002\u00d1Z\u0081\u0003\u0003\u00bat@m\u000e\u0091lr\u00b7Z\u00aaw\u000eWX\u008d\u00f2\u009d\u009e\u00e6P\u00e9\u00d57\u0003/\u00b4\u0013\u00a9\u000b67\u0085\u00f4\u00f1,\u0088\u007f\u00c9\u009f\u00c6%6\u0088\u00e6\u00c20}\u00d36\u0015\u00c3\u00d6\u00b1\u00b0\u009e[\u00e2\u00a5J\u0002\u009aZ\u00d40\u00e5\u00a9\u0010\u0090\u00c8\u00af9(l\u00e4\u00a4\r\u00b6\u00b6\u00eezo_\u00a4@1\u00a7;\u00cd#\u00e5\u00b09\u00c9\u008f\u00f2k\u009b\u00a7\u0083j*\u0010\u00ca\u00bcM;\u00a7m\u00b1_\u00eb\u00db\u00f02\u00a5\u009e\u00c3\u00f5~\u0018\u00cbd\u00d5r\u00fc\u00afA\u0099\u0000\u0094(\u00fd0^T'K\u008b/\u009a\u00d4\u00d3\u0082\u00ae\u008e \u00cb\u00a4";
                var6_6 = "\t\u00d49S-\u00e6\u00b8q6\u001e\u0000\u00fe\u00bd\u0082\u0088;\u0006@\u0019Z\u0012\u00bf\u00cd\u0015\u00e2\u008a~S\u0007\u00fdY\u00b7Q\u00af\u00d4\r5\u00e4\u0006\u000b\u00dfw\u00e0\u00a0D\u00a70\u00db\u0010\f\u0012h\u00eaHS\u00f0\u0000\u00d9\u00f9\u00b7\u00ea\u00a5N(\u00f3\u00107\u00b2\u0003(\u0092{\u00a3L\u0002\u00d1Z\u0081\u0003\u0003\u00bat@m\u000e\u0091lr\u00b7Z\u00aaw\u000eWX\u008d\u00f2\u009d\u009e\u00e6P\u00e9\u00d57\u0003/\u00b4\u0013\u00a9\u000b67\u0085\u00f4\u00f1,\u0088\u007f\u00c9\u009f\u00c6%6\u0088\u00e6\u00c20}\u00d36\u0015\u00c3\u00d6\u00b1\u00b0\u009e[\u00e2\u00a5J\u0002\u009aZ\u00d40\u00e5\u00a9\u0010\u0090\u00c8\u00af9(l\u00e4\u00a4\r\u00b6\u00b6\u00eezo_\u00a4@1\u00a7;\u00cd#\u00e5\u00b09\u00c9\u008f\u00f2k\u009b\u00a7\u0083j*\u0010\u00ca\u00bcM;\u00a7m\u00b1_\u00eb\u00db\u00f02\u00a5\u009e\u00c3\u00f5~\u0018\u00cbd\u00d5r\u00fc\u00afA\u0099\u0000\u0094(\u00fd0^T'K\u008b/\u009a\u00d4\u00d3\u0082\u00ae\u008e \u00cb\u00a4".length();
                var3_7 = 48;
                var2_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = xd.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u008e\u0093\u00d9\u00ef\u001c^C\u0015\u008b!\u0003\u00e6\u00f4\u00ff\u00be\u00a4\u00e2\u00e3R\u00f1tb\u009b}\nK\u0016\u00a3\u00a0\u00876\u00eda]>\u008cG\u008f\u00f0\u0097\u00cd_V]\u00b2Ea/\u00e5^\u009b\u0010\u00b7\u00b8O\u00cb\u00aa\u00bb\u00a4\u00a2l\u0083c\u00ac\u0010)\u00f6\u00ca\u00ad\u00d6\u0018\u00e9mha\u0015\u0094\u00f4lBF";
                    var6_6 = "\u008e\u0093\u00d9\u00ef\u001c^C\u0015\u008b!\u0003\u00e6\u00f4\u00ff\u00be\u00a4\u00e2\u00e3R\u00f1tb\u009b}\nK\u0016\u00a3\u00a0\u00876\u00eda]>\u008cG\u008f\u00f0\u0097\u00cd_V]\u00b2Ea/\u00e5^\u009b\u0010\u00b7\u00b8O\u00cb\u00aa\u00bb\u00a4\u00a2l\u0083c\u00ac\u0010)\u00f6\u00ca\u00ad\u00d6\u0018\u00e9mha\u0015\u0094\u00f4lBF".length();
                    var3_7 = 64;
                    var2_8 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = xd.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl50:
                // 1 sources

                ** continue;
            }
        }
        xd.a = var7_3;
        xd.c = new String[8];
        xd.H = m44.a("o", (long)-1361198142084694552L, (long)var9);
    }

    /*
     * Loose catch block
     */
    public js i(l6q l6q2, l6q l6q3, l6q l6q4, l6q l6q5, long l, PrintWriter printWriter) {
        long l2 = l;
        long l3 = l2 ^ 0x330C83A99E71L;
        int n = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 40);
        int n3 = (int)(l3 << 56 >>> 56);
        long l4 = l2 ^ 0x4D3EB9EBAF7DL;
        long l5 = l2 ^ 0x7231103C1230L;
        long l6 = l2 ^ 0x454B7038630L;
        long l7 = l2 ^ 0x3F5CD60287A2L;
        long l8 = l2 ^ 0x1267BA7E7777L;
        CallSite callSite = m44.a("h", (long)4348155030231408L, (long)l);
        try {
            xb xb2;
            block21: {
                l6q l6q6;
                js js2;
                block20: {
                    js js3;
                    block19: {
                        Object object;
                        block18: {
                            js js4;
                            block16: {
                                block17: {
                                    js js5;
                                    block14: {
                                        block15: {
                                            js3 = this.l.m(l5, this.b);
                                            try {
                                                js5 = js3;
                                                if (callSite == false) break block14;
                                                if (js5 instanceof x8) break block15;
                                            }
                                            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                                throw m44.a("h", (Object)arrayIndexOutOfBoundsException, (long)2233031006739962993L, (long)l);
                                            }
                                            Object[] objectArray = new Object[3];
                                            objectArray[2] = (int)((byte)n3);
                                            objectArray[1] = n2;
                                            objectArray[0] = n;
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l7;
                                            objectArray2[0] = m44.a("w", (Object)((Object)this), (long)l4, (long)451388892000730180L, (long)l);
                                            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)xd.b("d", (int)953, (long)(0x7721000850AE46A5L ^ l))) + (String)((Object)xd.b("d", (int)8467, (long)(0x67B7DCF4B08E640EL ^ l))) + (String)((Object)xd.b("d", (int)10815, (long)(0x3FD5EF2D9683EF20L ^ l))) + this.b + (String)((Object)xd.b("d", (int)10815, (long)(0x3FD5EF2D9683EF20L ^ l))) + (String)((Object)m44.a("h", (Object)objectArray2, (long)2174414554445932441L, (long)l)) + (String)((Object)xd.b("d", (int)17220, (long)(0x5C760EC0F271865EL ^ l)));
                                            throw new aw(string);
                                        }
                                        js5 = this.l.m(l5, this.W);
                                    }
                                    js2 = js5;
                                    try {
                                        js4 = this.l.m(l5, this.W);
                                        if (callSite == false) break block16;
                                        if (js4 instanceof x8) break block17;
                                    }
                                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                        throw m44.a("h", (Object)arrayIndexOutOfBoundsException, (long)2233031006739962993L, (long)l);
                                    }
                                    Object[] objectArray = new Object[3];
                                    objectArray[2] = (int)((byte)n3);
                                    objectArray[1] = n2;
                                    objectArray[0] = n;
                                    Object[] objectArray3 = new Object[2];
                                    objectArray3[1] = l7;
                                    objectArray3[0] = m44.a("w", (Object)((Object)this), (long)l4, (long)451388892000730180L, (long)l);
                                    String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)xd.b("d", (int)10815, (long)(0x3FD5EF2D9683EF20L ^ l))) + (String)((Object)xd.b("d", (int)19115, (long)(0x67C83E5E8EB90FB0L ^ l))) + (String)((Object)xd.b("d", (int)10815, (long)(0x3FD5EF2D9683EF20L ^ l))) + this.W + (String)((Object)xd.b("d", (int)10815, (long)(0x3FD5EF2D9683EF20L ^ l))) + (String)((Object)m44.a("h", (Object)objectArray3, (long)2174414554445932441L, (long)l)) + (String)((Object)xd.b("d", (int)842, (long)(0x4A430A50DD90C653L ^ l)));
                                    throw new aw(string);
                                }
                                js4 = js2;
                            }
                            String string = ((x8)js4).V();
                            object = m44.a("h", (Object)string, (boolean)true, (long)l6, (long)2005544478461083368L, (long)l);
                            if (callSite == false) break block18;
                            try {
                                block22: {
                                    if (object != null) break block19;
                                    break block22;
                                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                        throw m44.a("h", (Object)arrayIndexOutOfBoundsException, (long)2233031006739962993L, (long)l);
                                    }
                                }
                                Object[] objectArray = new Object[3];
                                objectArray[2] = (int)((byte)n3);
                                objectArray[1] = n2;
                                objectArray[0] = n;
                                Object[] objectArray4 = new Object[2];
                                objectArray4[1] = l7;
                                objectArray4[0] = m44.a("w", (Object)((Object)this), (long)l4, (long)451388892000730180L, (long)l);
                                object = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)xd.b("d", (int)10815, (long)(0x3FD5EF2D9683EF20L ^ l))) + (String)((Object)xd.b("d", (int)31635, (long)(0x72F196A6BF9ABE8BL ^ l))) + (String)((Object)xd.b("d", (int)10815, (long)(0x3FD5EF2D9683EF20L ^ l))) + "'" + string + "'" + (String)((Object)xd.b("d", (int)10815, (long)(0x3FD5EF2D9683EF20L ^ l))) + (String)((Object)m44.a("h", (Object)objectArray4, (long)2174414554445932441L, (long)l)) + (String)((Object)xd.b("d", (int)842, (long)(0x4A430A50DD90C653L ^ l)));
                            }
                            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                throw m44.a("h", (Object)arrayIndexOutOfBoundsException, (long)2233031006739962993L, (long)l);
                            }
                        }
                        CallSite callSite2 = object;
                        throw new aw((String)((Object)callSite2));
                    }
                    xb2 = new xb(this, (x8)js3, (x8)js2);
                    l6q6 = l6q2;
                    if (callSite == false) break block20;
                    try {
                        block23: {
                            if (l6q6 == null) break block21;
                            break block23;
                            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                throw m44.a("h", (Object)arrayIndexOutOfBoundsException, (long)2233031006739962993L, (long)l);
                            }
                        }
                        l6q2.t((Object)((x8)js3), (Object)xb2, l8);
                        l6q6 = l6q2;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw m44.a("h", (Object)arrayIndexOutOfBoundsException, (long)2233031006739962993L, (long)l);
                    }
                }
                l6q6.t((Object)((x8)js2), (Object)xb2, l8);
            }
            return xb2;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            Object[] objectArray = new Object[3];
            objectArray[2] = (int)((byte)n3);
            objectArray[1] = n2;
            objectArray[0] = n;
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = l7;
            objectArray5[0] = m44.a("w", (Object)((Object)this), (long)l4, (long)451388892000730180L, (long)l);
            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)xd.b("d", (int)10815, (long)(0x3FD5EF2D9683EF20L ^ l))) + (String)((Object)xd.b("d", (int)28990, (long)(0x3BC48C9C30D93420L ^ l))) + (String)((Object)xd.b("d", (int)10815, (long)(0x3FD5EF2D9683EF20L ^ l))) + (String)((Object)m44.a("w", (Object)arrayIndexOutOfBoundsException, (long)2026021970840546810L, (long)l)) + (String)((Object)xd.b("d", (int)10815, (long)(0x3FD5EF2D9683EF20L ^ l))) + (String)((Object)m44.a("h", (Object)objectArray5, (long)2174414554445932441L, (long)l)) + (String)((Object)xd.b("d", (int)842, (long)(0x4A430A50DD90C653L ^ l)));
            throw new aw(string);
        }
    }

    private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return arrayIndexOutOfBoundsException;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4F67;
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
                throw new RuntimeException("com/zelix/xd", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = a[n2].getBytes("ISO-8859-1");
            xd.c[n2] = xd.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xd.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/xd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xd.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
