/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.aw;
import com.zelix.h1;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.lkh;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.xb;
import com.zelix.xm;
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

public abstract class xc
extends js
implements lkh {
    int s;
    int Q;
    private static final String[] a;
    private static final String[] b;
    private static final Map c;

    protected void O(DataOutputStream dataOutputStream, long l) {
        long l2 = l ^ 0x68EC39ED4954L;
        dataOutputStream.writeByte(this.A(l2).g());
        dataOutputStream.writeShort(this.s);
        dataOutputStream.writeShort(this.Q);
    }

    abstract xm P(Object[] var1);

    xc(int n, h1 h12, to to2) {
        super(n, to2);
        this.s = h12.readUnsignedShort();
        this.Q = h12.readUnsignedShort();
    }

    public boolean G() {
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public final js i(l6q var1_1, l6q var2_2, l6q var3_3, l6q var4_4, long var5_5, PrintWriter var7_6) {
        v0 = var5_5;
        v1 = v0 ^ 56128841555569L;
        var8_7 = (int)(v1 >>> 32);
        var9_8 = (int)(v1 << 32 >>> 40);
        var10_9 = (int)(v1 << 56 >>> 56);
        var11_10 = v0 ^ 125555051336240L;
        var13_11 = v0 ^ 84931802541949L;
        var15_12 = v0 ^ 9147404352014L;
        var17_13 = v0 ^ 69667960031138L;
        var19_14 = v0 ^ 20236719781751L;
        var21_15 = m44.a("h", (long)2217105895991572512L, (long)var5_5);
        try {
            block21: {
                block20: {
                    block18: {
                        block19: {
                            block16: {
                                block17: {
                                    block15: {
                                        block14: {
                                            var22_16 = this.l.m(var11_10, this.s);
                                            var23_18 = this.l.m(var11_10, this.Q);
                                            v2 = var22_16.G();
                                            if (var21_15 != false) break block14;
                                            try {
                                                block22: {
                                                    if (v2) break block15;
                                                    break block22;
                                                    catch (ArrayIndexOutOfBoundsException v3) {
                                                        throw m44.a("h", (Object)v3, (long)1965820947970849053L, (long)var5_5);
                                                    }
                                                }
                                                v2 = var23_18.G();
                                            }
                                            catch (ArrayIndexOutOfBoundsException v4) {
                                                throw m44.a("h", (Object)v4, (long)1965820947970849053L, (long)var5_5);
                                            }
                                        }
                                        try {
                                            v5 = var21_15;
                                            if (var5_5 >= 0L) {
                                                if (v5 != false) break block16;
                                                if (!v2) break block17;
                                            }
                                            ** GOTO lbl49
                                        }
                                        catch (ArrayIndexOutOfBoundsException v6) {
                                            throw m44.a("h", (Object)v6, (long)1965820947970849053L, (long)var5_5);
                                        }
                                    }
                                    return null;
                                }
                                v2 = var22_16 instanceof jf;
                            }
                            try {
                                v5 = var21_15;
lbl49:
                                // 2 sources

                                if (v5 != false) break block18;
                                if (v2) break block19;
                            }
                            catch (ArrayIndexOutOfBoundsException v7) {
                                throw m44.a("h", (Object)v7, (long)1965820947970849053L, (long)var5_5);
                            }
                            v8 = new Object[3];
                            v8[2] = (int)((byte)var10_9);
                            v8[1] = var9_8;
                            v8[0] = var8_7;
                            v9 = new Object[2];
                            v9[1] = var17_13;
                            v9[0] = this.A(var13_11);
                            var24_20 = (String)m44.a("w", (Object)this.l, (Object)v8, (long)2038621223880514639L, (long)var5_5) + (String)xc.b("m", (int)13473, (long)(1584934669534976919L ^ var5_5)) + (String)xc.b("m", (int)26381, (long)(975691352525998142L ^ var5_5)) + (String)xc.b("m", (int)32646, (long)(3342892156118569140L ^ var5_5)) + this.s + (String)xc.b("m", (int)32646, (long)(3342892156118569140L ^ var5_5)) + (String)m44.a("h", (Object)v9, (long)2174414554445932441L, (long)var5_5) + (String)xc.b("m", (int)14830, (long)(5179362964308612830L ^ var5_5));
                            throw new aw(var24_20);
                        }
                        v2 = var23_18 instanceof xb;
                    }
                    if (!v2) {
                        v10 = new Object[3];
                        v10[2] = (int)((byte)var10_9);
                        v10[1] = var9_8;
                        v10[0] = var8_7;
                        v11 = new Object[2];
                        v11[1] = var17_13;
                        v11[0] = this.A(var13_11);
                        var24_21 = (String)m44.a("w", (Object)this.l, (Object)v10, (long)2038621223880514639L, (long)var5_5) + (String)xc.b("m", (int)32646, (long)(3342892156118569140L ^ var5_5)) + (String)xc.b("m", (int)31444, (long)(1533827093828310496L ^ var5_5)) + (String)xc.b("m", (int)32646, (long)(3342892156118569140L ^ var5_5)) + this.Q + (String)xc.b("m", (int)32646, (long)(3342892156118569140L ^ var5_5)) + (String)m44.a("h", (Object)v11, (long)2174414554445932441L, (long)var5_5) + (String)xc.b("m", (int)10217, (long)(3432951427391867096L ^ var5_5));
                        throw new aw(var24_21);
                    }
                    v12 = new Object[5];
                    v12[4] = var3_3;
                    v12[3] = var15_12;
                    v12[2] = (xb)var23_18;
                    v12[1] = (jf)var22_16;
                    v12[0] = this;
                    var24_22 = m44.a("w", (Object)this, (Object)v12, (long)310384320188505006L, (long)var5_5);
                    try {
                        v13 = var2_2;
                        if (var21_15 != false) break block20;
                        if (v13 == null) break block21;
                    }
                    catch (ArrayIndexOutOfBoundsException v14) {
                        throw m44.a("h", (Object)v14, (long)1965820947970849053L, (long)var5_5);
                    }
                    v13 = var2_2;
                }
                v13.t((Object)((xb)var23_18), (Object)var24_22, var19_14);
            }
            return var24_22;
        }
        catch (ArrayIndexOutOfBoundsException var22_17) {
            v15 = new Object[3];
            v15[2] = (int)((byte)var10_9);
            v15[1] = var9_8;
            v15[0] = var8_7;
            v16 = new Object[2];
            v16[1] = var17_13;
            v16[0] = this.A(var13_11);
            var23_19 = (String)m44.a("w", (Object)this.l, (Object)v15, (long)2038621223880514639L, (long)var5_5) + (String)xc.b("m", (int)32646, (long)(3342892156118569140L ^ var5_5)) + (String)xc.b("m", (int)19252, (long)(1528379658395558913L ^ var5_5)) + (String)xc.b("m", (int)32646, (long)(3342892156118569140L ^ var5_5)) + (String)m44.a("w", (Object)var22_17, (long)2026021970840546810L, (long)var5_5) + (String)xc.b("m", (int)32646, (long)(3342892156118569140L ^ var5_5)) + (String)m44.a("h", (Object)v16, (long)2174414554445932441L, (long)var5_5) + (String)xc.b("m", (int)10217, (long)(3432951427391867096L ^ var5_5));
            throw new aw(var23_19);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                xc.c = new HashMap<K, V>(13);
                var0 = prr.a((long)3271676199100252368L, (long)-7603914472997953697L, MethodHandles.lookup().lookupClass()).a(226211486281600L) ^ 82606022791020L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "l\u00b5\u00b1\u00e2\u00b9`\u0005\u00ac`\u00fd\u009f\u0088\u0088\u00ab\u00ac\u008d\u0010\u00b2\u00e7\u008c\u00c9\u00d7\u00da\u001f\u00bd\u008b3\u0095\u000b\u008aD\u001a\u00ce\u0010=\u0085\u0006ra\u00b0z\u00841\u00e6|\u007fd\u00c1\u00a7\u0000H\u00df\u00c7\u0007vX\u00a2\u00db#\u0015\u00aao\u00b9\u0007\u00a4:\u00c8B\u007f\u00bfZ\u0096\u0086l\u00aa\u00bfn\u0097\u00b6\rJ\u0081-\u0089\u001d\u00aa(\u00d7\u0011'\u00c9C\u009dmN\u00f7\u0098\u00bb|\u0000\r\u000f\u00ff\u00a7Q\u0019w.4\u00ad\u0089:\u00eb\u00c1i\u00b1\u0007\u009e5\u00e1l'\u0083Pi\u00baV\u00a9i\u0004\u001e\u0014:\u0005\u00dd\u009aK\u00f7\u0010\u0096\u008b\u00a75\u00a7\u00d9\u00cb\u008d]W\u001aLN\u00b7\u00d5\u00c9\u000e\u00ec\u000b?\u00d3\u00e7\u00d4\u00bd\u00efH\u00b00]\u0089\u00c3\u000e\u00f2\f\u00b1fD\u00b8\u00ebP\u00f7\u00b2\u00b6B\u00a8\nQ\b\u0014\u000f\u00e4aV\u008e\u00ab\u008c\u00ef=\u00a5\u000e\u00ba\u00ea\u0012cu";
                var8_6 = "l\u00b5\u00b1\u00e2\u00b9`\u0005\u00ac`\u00fd\u009f\u0088\u0088\u00ab\u00ac\u008d\u0010\u00b2\u00e7\u008c\u00c9\u00d7\u00da\u001f\u00bd\u008b3\u0095\u000b\u008aD\u001a\u00ce\u0010=\u0085\u0006ra\u00b0z\u00841\u00e6|\u007fd\u00c1\u00a7\u0000H\u00df\u00c7\u0007vX\u00a2\u00db#\u0015\u00aao\u00b9\u0007\u00a4:\u00c8B\u007f\u00bfZ\u0096\u0086l\u00aa\u00bfn\u0097\u00b6\rJ\u0081-\u0089\u001d\u00aa(\u00d7\u0011'\u00c9C\u009dmN\u00f7\u0098\u00bb|\u0000\r\u000f\u00ff\u00a7Q\u0019w.4\u00ad\u0089:\u00eb\u00c1i\u00b1\u0007\u009e5\u00e1l'\u0083Pi\u00baV\u00a9i\u0004\u001e\u0014:\u0005\u00dd\u009aK\u00f7\u0010\u0096\u008b\u00a75\u00a7\u00d9\u00cb\u008d]W\u001aLN\u00b7\u00d5\u00c9\u000e\u00ec\u000b?\u00d3\u00e7\u00d4\u00bd\u00efH\u00b00]\u0089\u00c3\u000e\u00f2\f\u00b1fD\u00b8\u00ebP\u00f7\u00b2\u00b6B\u00a8\nQ\b\u0014\u000f\u00e4aV\u008e\u00ab\u008c\u00ef=\u00a5\u000e\u00ba\u00ea\u0012cu".length();
                var5_7 = 16;
                var4_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = xc.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00b9R\u0004+\u0006Q\rSv\u00b3\u00a5/\u00bf\u007f\u001d`4\u00ba\u00d9\u007f\nz\u00d0\u00e3\u00b1?'r\u001a-X\u0086\u001f\u00e6\u0016h#\u0019\u00ac\u00f1i\u008f\u00b1\u0084\u00da9\u00e1e\u00fd\u0097\u00c5Il\u00be1F\u00cfenPN\u0097# \u0010R\u00a0Z\u00ff\u00ddx\u0000\u00c5\u00a9\u0099\b\u008ej\u009d[0";
                    var8_6 = "\u00b9R\u0004+\u0006Q\rSv\u00b3\u00a5/\u00bf\u007f\u001d`4\u00ba\u00d9\u007f\nz\u00d0\u00e3\u00b1?'r\u001a-X\u0086\u001f\u00e6\u0016h#\u0019\u00ac\u00f1i\u008f\u00b1\u0084\u00da9\u00e1e\u00fd\u0097\u00c5Il\u00be1F\u00cfenPN\u0097# \u0010R\u00a0Z\u00ff\u00ddx\u0000\u00c5\u00a9\u0099\b\u008ej\u009d[0".length();
                    var5_7 = 64;
                    var4_8 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = xc.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        xc.a = var9_3;
        xc.b = new String[7];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x654F;
        if (b[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])c.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    c.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/xc", exception);
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
            xc.b[n2] = xc.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return b[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = xc.b(n, l);
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
            throw new RuntimeException("com/zelix/xc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xc.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
