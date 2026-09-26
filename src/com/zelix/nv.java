/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class nv
implements Serializable {
    protected transient boolean U;
    protected Map F;
    private static final long b = prr.a((long)-5063047966591878261L, (long)3971443789328598501L, MethodHandles.lookup().lookupClass()).a(72983852463666L);
    private static final String[] j;
    private static final String[] k;
    private static final Map l;

    public final boolean r(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (boolean)m44.a("q", (Object)this, (long)1484145976926716724L, (long)l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void P(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        File file = new File(string, string2);
        if (m44.a("q", (Object)file, (long)-4872108696061101638L, (long)(l = b ^ l)) != false && (m44.a("q", (Object)file, (long)-6821127761811641812L, (long)l) != false || m44.a("q", (Object)file, (long)-6634655935824856236L, (long)l) == false)) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        m44.a("q", (Object)objectOutputStream, (Object)this, (long)-6818658693983592780L, (long)l);
        m44.a("r", (Object)this, (boolean)true, (long)-4978259402185740987L, (long)l);
        if (objectOutputStream == null) return;
        try {
            m44.a("q", (Object)objectOutputStream, (long)-4927547516925240921L, (long)l);
            return;
        }
        catch (IOException iOException) {}
        return;
        catch (IOException iOException) {
            if (objectOutputStream == null) return;
            try {
                m44.a("q", (Object)objectOutputStream, (long)-4927547516925240921L, (long)l);
                return;
            }
            catch (IOException iOException2) {}
            return;
            catch (Throwable throwable) {
                if (objectOutputStream == null) throw throwable;
                try {
                    m44.a("q", objectOutputStream, (long)-4927547516925240921L, (long)l);
                    throw throwable;
                }
                catch (IOException iOException3) {
                    // empty catch block
                }
                throw throwable;
            }
        }
    }

    public final Enumeration H(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = b ^ l) ^ 0x621A831A2626L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = ((StringBuilder)((Object)m44.a("s", (Object)new StringBuilder().append((String)((Object)nv.a("t", (int)7676, (long)(0x50738E44560F7AA6L ^ l)))), (boolean)m44.a("r", (Object)this, (long)4531662957229697359L, (long)l), (long)4258640794382715919L, (long)l))).toString();
        objectArray2[0] = m44.a("r", (Object)this, (long)4202382027197695589L, (long)l);
        m44.a("l", (Object)objectArray2, (long)2780700658962568514L, (long)l);
        Set set = m44.a("r", (Object)this, (long)4202382027197695589L, (long)l).keySet();
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = ((StringBuilder)((Object)m44.a("s", (Object)new StringBuilder().append((String)((Object)nv.a("t", (int)13448, (long)(0x2D866C7430CB53D3L ^ l)))), (boolean)m44.a("r", (Object)this, (long)4531662957229697359L, (long)l), (long)4258640794382715919L, (long)l))).toString();
        objectArray3[0] = set;
        m44.a("l", (Object)objectArray3, (long)2780700658962568514L, (long)l);
        return Collections.enumeration(set);
    }

    public void a(List list) {
        long l = b ^ 0x7CC963DA1D50L;
        m44.a("p", (Object)this, (long)9195205934955463599L, (long)l).clear();
        for (int i = 0; i < list.size(); ++i) {
            String string = (String)list.get(i);
            m44.a("p", (Object)this, (long)9195205934955463599L, (long)l).put(string, string);
        }
    }

    public nv(long l, byte by) {
        long l2 = (l << 8 | (long)by << 56 >>> 56) ^ b;
        m44.a("q", (Object)this, new LinkedHashMap(), (long)4319169464836999108L, (long)l2);
    }

    public final int Q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return m44.a("p", (Object)this, (long)-2620053738467350633L, (long)l).size();
    }

    public final List h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return new ArrayList(m44.a("r", (Object)this, (long)4206800179782796885L, (long)l).keySet());
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        l = new HashMap(13);
        long l = b ^ 0x5F0D3298437CL;
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
        String string = "\b!b;\u00d1`\u00bc\u00efz8\u00c3k\u00d9C\u009f\u00b8\u00cb\u00b1\u00c3x\u0004\u00b7k\u00c1\u00e5=\u00e4\u008810$P'\u00c4m\u00f0c\u008e;<\u0098\u00e5\u00c7\u0099C \u0091 8\u00b9\u0003F\u00db\u0000 \u00c0\u0081\u0084\"d\u0090l\u0084\u0002|\u00b7\u0081\u00d8\u00f9\u008d\u0002\u0018`\u0087\u00ddK~\u008dP\u00135)\u001a\u0001\u00fc\u00cfD\u001cN\u00d6n\u00ef!m\nJ\u00ea`\u00e3\u00d8Z\u0014U\u00a1-";
        int n2 = "\b!b;\u00d1`\u00bc\u00efz8\u00c3k\u00d9C\u009f\u00b8\u00cb\u00b1\u00c3x\u0004\u00b7k\u00c1\u00e5=\u00e4\u008810$P'\u00c4m\u00f0c\u008e;<\u0098\u00e5\u00c7\u0099C \u0091 8\u00b9\u0003F\u00db\u0000 \u00c0\u0081\u0084\"d\u0090l\u0084\u0002|\u00b7\u0081\u00d8\u00f9\u008d\u0002\u0018`\u0087\u00ddK~\u008dP\u00135)\u001a\u0001\u00fc\u00cfD\u001cN\u00d6n\u00ef!m\nJ\u00ea`\u00e3\u00d8Z\u0014U\u00a1-".length();
        int n3 = 48;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = nv.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                j = stringArray;
                k = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String a(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D40;
        if (k[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])nv.l.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    nv.l.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/nv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = j[n2].getBytes("ISO-8859-1");
            nv.k[n2] = nv.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return k[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = nv.a(n, l);
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
            throw new RuntimeException("com/zelix/nv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(nv.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
