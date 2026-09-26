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
    private static final long a = prr.a((long)-1670175075661968031L, (long)1887036323148140386L, MethodHandles.lookup().lookupClass()).a(166257635385624L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public boolean i(char c, int n, short s, String string) {
        Object object;
        block6: {
            boolean bl;
            block7: {
                long l;
                long l2 = l = (long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48;
                long l3 = l2 ^ 0x53E882C5A728L;
                long l4 = l2 ^ 0x3737528C0D12L;
                bl = mn.R((String)string, (long)l4, (String)this.o);
                CallSite callSite = m44.a("i", (long)4736006086195462527L, (long)l);
                try {
                    try {
                        try {
                            object = bl;
                            if (callSite == false) break block6;
                            if (object) break block7;
                        }
                        catch (n9 n92) {
                            throw m44.a("i", (Object)((Object)n92), (long)6890356708977630510L, (long)l);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l3;
                        object = m44.a("v", (Object)((lyk)m44.a("w", (Object)((Object)this), (long)5117350790248049916L, (long)l)), (Object)objectArray, (long)6601329049906866643L, (long)l);
                        if (callSite == false) break block6;
                    }
                    catch (n9 n93) {
                        throw m44.a("i", (Object)((Object)n93), (long)6890356708977630510L, (long)l);
                    }
                    if (!object) break block7;
                }
                catch (n9 n94) {
                    throw m44.a("i", (Object)((Object)n94), (long)6890356708977630510L, (long)l);
                }
                String string2 = this.o + (String)((Object)ltx.a("e", (int)8696, (long)(0x65B820F88DE0720CL ^ l)));
                bl = mn.R((String)string, (long)l4, (String)string2);
            }
            object = bl;
        }
        return object;
    }

    public String e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return m44.a("p", (Object)((Object)this), (long)-4920642839052450398L, (long)l);
    }

    public void M(Object[] objectArray) {
        block9: {
            lmu lmu2 = (lmu)objectArray[0];
            lqu lqu2 = (lqu)objectArray[1];
            long l = (Long)objectArray[2];
            long l2 = l ^ 0x47526B4E5A06L;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            CallSite callSite = m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-4972914505230991179L, (long)l);
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            int n = 0;
            CallSite callSite2 = m44.a("h", (long)-5113628074367501874L, (long)l);
            while (n < callSite) {
                CallSite callSite3;
                block10: {
                    block11: {
                        block12: {
                            CallSite callSite4 = m44.a("w", (Object)((lt9)this.V(n)), (Object)new Object[0], (long)-4968184746715213117L, (long)l);
                            try {
                                try {
                                    try {
                                        ((ArrayList)((Object)m44.a("v", (Object)((Object)this), (long)-6351086979674710220L, (long)l))).add(callSite4);
                                        stringBuilder.append((String)((Object)callSite4));
                                        stringBuilder.append(".");
                                        stringBuilder2.append((String)((Object)callSite4));
                                        callSite3 = callSite2;
                                        if (l >= 0L) {
                                            if (callSite3 == false) break block9;
                                            callSite3 = callSite2;
                                        }
                                        if (l <= 0L) break block10;
                                        if (callSite3 == false) break block11;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)((Object)n92), (long)-6400067215083723361L, (long)l);
                                    }
                                    if (n >= callSite - true) break block12;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)((Object)n93), (long)-6400067215083723361L, (long)l);
                                }
                                stringBuilder2.append("/");
                            }
                            catch (n9 n94) {
                                throw m44.a("h", (Object)((Object)n94), (long)-6400067215083723361L, (long)l);
                            }
                        }
                        ++n;
                    }
                    callSite3 = callSite2;
                }
                if (callSite3 != false) continue;
            }
            m44.a("t", (Object)((Object)this), (String)stringBuilder.toString(), (long)-4965137188654578420L, (long)l);
            this.o = stringBuilder2.toString();
            if (l >= 0L) {
                // empty if block
            }
        }
    }

    boolean Q(Object[] objectArray) {
        boolean bl;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                l = a ^ l;
                CallSite callSite = m44.a("o", (long)-5529889167005097863L, (long)l);
                try {
                    try {
                        bl = ((String)((Object)m44.a("q", (Object)((Object)this), (long)-6262435642617522429L, (long)l))).indexOf("*");
                        if (callSite != false) break block4;
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("o", (Object)((Object)n92), (long)-5394901994858104944L, (long)l);
                    }
                    bl = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("o", (Object)((Object)n93), (long)-5394901994858104944L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public ltx(int n, long l) {
        long l2 = (l = a ^ l) ^ 0x7879B502BE7EL;
        int n2 = (int)(l2 >>> 56);
        long l3 = l2 << 8 >>> 8;
        super((byte)n2, n, l3);
        m44.a("v", (Object)((Object)this), new ArrayList(), (long)-6724407790958716346L, (long)l);
        this.h = ltx.a("e", (int)31060, (long)(0x30D90DD4CCF45762L ^ l));
    }

    List f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x1DEA4F6F28F9L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = m44.a("u", (Object)((Object)this), (long)-3580596412737767769L, (long)l);
        objectArray2[0] = l2;
        return m44.a("k", (Object)objectArray2, (long)-3066765405321577062L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = a ^ 0x58558A60F98BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u000e3F\u00dfr\u0015T\u00f5\u00c6\u00d7d/\u0086\u00d0\u0091\u00e4\u0010B\r\u00b7\u0010\u00b5{\u001f~\ra\u00ee\u0018\u00fa\u00d8\u0096\u001f";
        int n2 = "\u000e3F\u00dfr\u0015T\u00f5\u00c6\u00d7d/\u0086\u00d0\u0091\u00e4\u0010B\r\u00b7\u0010\u00b5{\u001f~\ra\u00ee\u0018\u00fa\u00d8\u0096\u001f".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ltx.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1ED2;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ltx", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            ltx.e[n2] = ltx.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ltx.a(n, l);
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
