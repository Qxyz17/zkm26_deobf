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
import com.zelix.xl;
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

public class x0
extends js
implements lkh {
    static final va e;
    int n;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    protected void O(DataOutputStream dataOutputStream, long l) {
        dataOutputStream.writeByte(m44.a("m", (long)-263777955839088318L, (long)l).g());
        dataOutputStream.writeShort((int)m44.a("w", (Object)((Object)this), (long)-432776866179161242L, (long)l));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                x0.a = prr.a((long)-2907014090615001060L, (long)7724996407694654569L, MethodHandles.lookup().lookupClass()).a(34455057174073L);
                var9 = x0.a ^ 64931989158283L;
                x0.d = new HashMap<K, V>(13);
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
                var7_3 = new String[6];
                var5_4 = 0;
                var4_5 = "\u00db\u00e2\u00f4\u00ec+\u008c\u00a3\u00a4O\u009b9\u00ebl\u00e2t\u00a2@O\u00df\u0090\u00c8\u00b4mP\f\u0083\u00cc\u0017\u0092\u00c4\u00ae\u00fagP\u00e8Kc@\u00a1\u001d\u0095\u00ec\u00ed\u00a0\u001a\u00003\u00d8(\u00dc\u00ec\u00fb\u00b3j\u009b\u001c\rz\u00bb*\u009a\u00a8\u00bcT\u00db\u00c1J\u0083\u00cfTnJ\u00d7\u00e7t\u0017b8\u00bc\u00a52\u0010\u00ba\u001d\u00bb\u0017[\u009b\u0099\u00aa\u00cc\u00c4X\u0085\u00a4\u001f/c\u0010\u00d2\u00c0z\u0093\u0088K\u009e\u00e7\u0013'\u00b8H\u0099\u007f\u00c2Y";
                var6_6 = "\u00db\u00e2\u00f4\u00ec+\u008c\u00a3\u00a4O\u009b9\u00ebl\u00e2t\u00a2@O\u00df\u0090\u00c8\u00b4mP\f\u0083\u00cc\u0017\u0092\u00c4\u00ae\u00fagP\u00e8Kc@\u00a1\u001d\u0095\u00ec\u00ed\u00a0\u001a\u00003\u00d8(\u00dc\u00ec\u00fb\u00b3j\u009b\u001c\rz\u00bb*\u009a\u00a8\u00bcT\u00db\u00c1J\u0083\u00cfTnJ\u00d7\u00e7t\u0017b8\u00bc\u00a52\u0010\u00ba\u001d\u00bb\u0017[\u009b\u0099\u00aa\u00cc\u00c4X\u0085\u00a4\u001f/c\u0010\u00d2\u00c0z\u0093\u0088K\u009e\u00e7\u0013'\u00b8H\u0099\u007f\u00c2Y".length();
                var3_7 = 16;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = x0.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\t\u0001MT\u008b\u00f4\u0081\u00c6\u00c7\u00c4\u00fb\u00ea\u0093~$\u0010\u00da\u0083\u0013\f\u00f5\u00df\u0082\u0003\u00ed)U;C&X\u00d9t\u00f4?\u00a7\u00b5\u00c2\u009f\u00b4\n\u00c2\u00afiK.K\u00f9\u00dfA_\u00b1D\u00b3\u0006\u00b6\u00da\u001fJ%b-\u0018&\u0010\u009d_J\u00e1\u0091\u00acI\u0089k\u0089\u00e0\u0095\u001d\u0001\u00ef\u0091";
                    var6_6 = "\t\u0001MT\u008b\u00f4\u0081\u00c6\u00c7\u00c4\u00fb\u00ea\u0093~$\u0010\u00da\u0083\u0013\f\u00f5\u00df\u0082\u0003\u00ed)U;C&X\u00d9t\u00f4?\u00a7\u00b5\u00c2\u009f\u00b4\n\u00c2\u00afiK.K\u00f9\u00dfA_\u00b1D\u00b3\u0006\u00b6\u00da\u001fJ%b-\u0018&\u0010\u009d_J\u00e1\u0091\u00acI\u0089k\u0089\u00e0\u0095\u001d\u0001\u00ef\u0091".length();
                    var3_7 = 64;
                    var2_8 = -1;
lbl34:
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
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = x0.b(var8_9).intern();
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
lbl51:
                // 1 sources

                ** continue;
            }
        }
        x0.b = var7_3;
        x0.c = new String[6];
        x0.e = m44.a("l", (long)8934832257044511550L, (long)var9);
    }

    x0(long l, int n, h1 h12, to to2) {
        l = a ^ l;
        super(n, to2);
        m44.a("w", (Object)((Object)this), (int)h12.readUnsignedShort(), (long)-1158542012006632076L, (long)l);
    }

    public va A(long l) {
        return m44.a("i", (long)-5403554614953074666L, (long)l);
    }

    public js i(l6q l6q2, l6q l6q3, l6q l6q4, l6q l6q5, long l, PrintWriter printWriter) {
        long l2 = l;
        long l3 = l2 ^ 0x330C83A99E71L;
        int n = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 40);
        int n3 = (int)(l3 << 56 >>> 56);
        long l4 = l2 ^ 0x235B78EA15BFL;
        long l5 = l2 ^ 0x7231103C1230L;
        long l6 = l2 ^ 0x4D3EB9EBAF7DL;
        long l7 = l2 ^ 0x3F5CD60287A2L;
        try {
            js js2 = this.l.m(l5, (int)m44.a("v", (Object)((Object)this), (long)2294393146905494863L, (long)l));
            if (js2 instanceof x8) {
                xl xl2 = new xl(this, l4, (x8)js2, l6q2);
                return xl2;
            }
            Object[] objectArray = new Object[3];
            objectArray[2] = (int)((byte)n3);
            objectArray[1] = n2;
            objectArray[0] = n;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l7;
            objectArray2[0] = m44.a("w", (Object)((Object)this), (long)l6, (long)2240526408544066834L, (long)l);
            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)x0.b("h", (int)2522, (long)(0x5AD3560E46AEE1E3L ^ l))) + (String)((Object)x0.b("h", (int)29969, (long)(0x3DAD50ED2211D29L ^ l))) + (String)((Object)x0.b("h", (int)17247, (long)(0x5A2704BB993B2B64L ^ l))) + (int)m44.a("v", (Object)((Object)this), (long)2294393146905494863L, (long)l) + (String)((Object)x0.b("h", (int)17247, (long)(0x5A2704BB993B2B64L ^ l))) + (String)((Object)m44.a("h", (Object)objectArray2, (long)2174414554445932441L, (long)l)) + (String)((Object)x0.b("h", (int)13644, (long)(0x5F19C8F607A0DD76L ^ l)));
            throw new aw(string);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            Object[] objectArray = new Object[3];
            objectArray[2] = (int)((byte)n3);
            objectArray[1] = n2;
            objectArray[0] = n;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l7;
            objectArray3[0] = m44.a("w", (Object)((Object)this), (long)l6, (long)2240526408544066834L, (long)l);
            String string = (String)((Object)m44.a("w", (Object)this.l, (Object)objectArray, (long)2038621223880514639L, (long)l)) + (String)((Object)x0.b("h", (int)17247, (long)(0x5A2704BB993B2B64L ^ l))) + (String)((Object)x0.b("h", (int)5536, (long)(0x23AF0AF2F8FBFD9DL ^ l))) + (String)((Object)x0.b("h", (int)17247, (long)(0x5A2704BB993B2B64L ^ l))) + (String)((Object)m44.a("w", (Object)arrayIndexOutOfBoundsException, (long)2026021970840546810L, (long)l)) + (String)((Object)x0.b("h", (int)17247, (long)(0x5A2704BB993B2B64L ^ l))) + (String)((Object)m44.a("h", (Object)objectArray3, (long)2174414554445932441L, (long)l)) + (String)((Object)x0.b("h", (int)28733, (long)(0x1351EB8F2D879801L ^ l)));
            throw new aw(string);
        }
    }

    public boolean G() {
        return true;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6246;
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
                throw new RuntimeException("com/zelix/x0", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            x0.c[n2] = x0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = x0.b(n, l);
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
            throw new RuntimeException("com/zelix/x0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(x0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
