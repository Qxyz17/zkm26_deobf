/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.dd;
import com.zelix.l7t;
import com.zelix.lmu;
import com.zelix.lqu;
import com.zelix.lt9;
import com.zelix.lyk;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ltx
extends l7t
implements dd {
    private String b;
    private String o;
    private ArrayList k;
    private final String h;
    private static final long a = prr.a(-1670175075661968031L, 1887036323148140386L, MethodHandles.lookup().lookupClass()).a(166257635385624L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    @Override
    public boolean i(char c10, int n10, short s10, String string) {
        Object object;
        block6: {
            boolean bl2;
            block7: {
                long l10;
                long l11 = l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)s10 << 48 >>> 48;
                long l12 = l11 ^ 0x53E882C5A728L;
                long l13 = l11 ^ 0x3737528C0D12L;
                bl2 = mn.R(string, l13, this.o);
                CallSite callSite = m44.a("i", (long)4736006086195462527L, (long)l10);
                try {
                    try {
                        try {
                            object = bl2;
                            if (callSite == false) break block6;
                            if (object) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("i", (Object)n92, (long)6890356708977630510L, (long)l10);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l12;
                        object = m44.a("v", (Object)((lyk)((Object)m44.a("w", (Object)this, (long)5117350790248049916L, (long)l10))), (Object)objectArray, (long)6601329049906866643L, (long)l10);
                        if (callSite == false) break block6;
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)n93, (long)6890356708977630510L, (long)l10);
                    }
                    if (!object) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("i", (Object)n94, (long)6890356708977630510L, (long)l10);
                }
                String string2 = this.o + (String)((Object)ltx.a("e", (int)8696, (long)(0x65B820F88DE0720CL ^ l10)));
                bl2 = mn.R(string, l13, string2);
            }
            object = bl2;
        }
        return object;
    }

    @Override
    public String e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return m44.a("p", (Object)this, (long)-4920642839052450398L, (long)l10);
    }

    @Override
    public void M(Object[] objectArray) {
        block9: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l10 = (Long)objectArray[2];
            long l11 = l10 ^ 0x47526B4E5A06L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l11;
            CallSite callSite = m44.a("w", (Object)this, (Object)objectArray2, (long)-4972914505230991179L, (long)l10);
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            int n10 = 0;
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l10);
            while (n10 < callSite) {
                CallSite callSite3;
                block10: {
                    block11: {
                        block12: {
                            CallSite callSite4 = m44.a("w", (Object)((lt9)this.V(n10)), (Object)new Object[0], (long)-4968184746715213117L, (long)l10);
                            try {
                                try {
                                    try {
                                        ((ArrayList)((Object)m44.a("v", (Object)this, (long)-6351086979674710220L, (long)l10))).add(callSite4);
                                        stringBuilder.append((String)((Object)callSite4));
                                        stringBuilder.append(".");
                                        stringBuilder2.append((String)((Object)callSite4));
                                        callSite3 = callSite2;
                                        if (l10 >= 0L) {
                                            if (callSite3 == false) break block9;
                                            callSite3 = callSite2;
                                        }
                                        if (l10 <= 0L) break block10;
                                        if (callSite3 == false) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)n92, (long)-6400067215083723361L, (long)l10);
                                    }
                                    if (n10 >= callSite - true) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)n93, (long)-6400067215083723361L, (long)l10);
                                }
                                stringBuilder2.append("/");
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)n94, (long)-6400067215083723361L, (long)l10);
                            }
                        }
                        ++n10;
                    }
                    callSite3 = callSite2;
                }
                if (callSite3 != false) continue;
            }
            m44.a("t", (Object)this, (String)stringBuilder.toString(), (long)-4965137188654578420L, (long)l10);
            this.o = stringBuilder2.toString();
            if (l10 >= 0L) {
                // empty if block
            }
        }
    }

    boolean Q(Object[] objectArray) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("o", (long)-5529889167005097863L, (long)l10);
                try {
                    try {
                        bl2 = ((String)((Object)m44.a("q", (Object)this, (long)-6262435642617522429L, (long)l10))).indexOf("*");
                        if (callSite != false) break block4;
                        if (!bl2) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)n92, (long)-5394901994858104944L, (long)l10);
                    }
                    bl2 = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)n93, (long)-5394901994858104944L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public ltx(int n10, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x7879B502BE7EL;
        int n11 = (int)(l11 >>> 56);
        long l12 = l11 << 8 >>> 8;
        super((byte)n11, n10, l12);
        m44.a("v", (Object)this, new ArrayList(), (long)-6724407790958716346L, (long)l10);
        this.h = ltx.a("e", (int)31060, (long)(0x30D90DD4CCF45762L ^ l10));
    }

    List f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x1DEA4F6F28F9L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("u", (Object)this, (long)-3580596412737767769L, (long)l10);
        objectArray2[0] = l11;
        return m44.a("k", (Object)objectArray2, (long)-3066765405321577062L, (long)l10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l10 = a ^ 0x58558A60F98BL;
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
        String string = "\u000e3F\u00dfr\u0015T\u00f5\u00c6\u00d7d/\u0086\u00d0\u0091\u00e4\u0010B\r\u00b7\u0010\u00b5{\u001f~\ra\u00ee\u0018\u00fa\u00d8\u0096\u001f";
        int n11 = "\u000e3F\u00dfr\u0015T\u00f5\u00c6\u00d7d/\u0086\u00d0\u0091\u00e4\u0010B\r\u00b7\u0010\u00b5{\u001f~\ra\u00ee\u0018\u00fa\u00d8\u0096\u001f".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = ltx.b(byArray3).intern();
            if ((n13 += n12) >= n11) {
                d = stringArray;
                e = new String[2];
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1ED2;
        if (e[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ltx", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n11].getBytes("ISO-8859-1");
            ltx.e[n11] = ltx.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ltx.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ltx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ltx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

