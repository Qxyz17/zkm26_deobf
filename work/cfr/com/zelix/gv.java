/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.l6g;
import com.zelix.m44;
import com.zelix.prr;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gv
implements Serializable,
Set {
    private List D;
    private Set b;
    private static final long a = prr.a(7623867230624288854L, -6302525059465531849L, MethodHandles.lookup().lookupClass()).a(165701600100152L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public int N(Object[] objectArray) {
        int n10;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                Object object = objectArray[1];
                l10 = a ^ l10;
                CallSite callSite = m44.a("k", (long)-1696394812799977917L, (long)l10);
                try {
                    try {
                        n10 = m44.a("u", (Object)this, (long)-722504178872952770L, (long)l10).contains(object);
                        if (callSite != null) break block4;
                        if (n10 == 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-1355684691368230174L, (long)l10);
                    }
                    return (int)m44.a("t", (Object)this.D, (Object)object, (long)-1403745593196361416L, (long)l10);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)-1355684691368230174L, (long)l10);
                }
            }
            n10 = -1;
        }
        return n10;
    }

    @Override
    public int size() {
        return this.D.size();
    }

    @Override
    public synchronized boolean remove(Object object) {
        boolean bl2;
        block2: {
            boolean bl3;
            block3: {
                long l10 = a ^ 0xD5D0AEF9C33L;
                bl3 = m44.a("w", (Object)this, (long)-4937225159476734276L, (long)l10).remove(object);
                CallSite callSite = m44.a("i", (long)-6415548912136636223L, (long)l10);
                try {
                    bl2 = bl3;
                    if (callSite != null) break block2;
                    if (!bl2) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)-6652390242319758240L, (long)l10);
                }
                CallSite callSite2 = m44.a("v", (Object)this.D, (Object)object, (long)-6617266997914847455L, (long)l10);
            }
            bl2 = bl3;
        }
        return bl2;
    }

    @Override
    public boolean retainAll(Collection collection) {
        CallSite callSite;
        block4: {
            CallSite callSite2;
            block5: {
                long l10 = a ^ 0xD0C6F8517E8L;
                callSite2 = m44.a("u", (Object)m44.a("t", (Object)this, (long)3503927714747653479L, (long)l10), (Object)collection, (long)3276380864617367803L, (long)l10);
                CallSite callSite3 = m44.a("j", (long)3255086650591097626L, (long)l10);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block4;
                        if (callSite == false) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)2915788303362623419L, (long)l10);
                    }
                    m44.a("u", (Object)this.D, (Object)collection, (long)3985341896593095060L, (long)l10);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)2915788303362623419L, (long)l10);
                }
            }
            callSite = callSite2;
        }
        return (boolean)callSite;
    }

    @Override
    public boolean isEmpty() {
        long l10 = a ^ 0x245A1FF618F7L;
        return (boolean)m44.a("r", (Object)m44.a("s", (Object)this, (long)4593490094540526200L, (long)l10), (long)2816691151925216610L, (long)l10);
    }

    @Override
    public synchronized boolean add(Object object) {
        boolean bl2;
        block4: {
            block5: {
                long l10 = a ^ 0x65DB108A1AD0L;
                CallSite callSite = m44.a("j", (long)2311486559709707810L, (long)l10);
                try {
                    try {
                        bl2 = m44.a("t", (Object)this, (long)4438327559203131487L, (long)l10).add(object);
                        if (callSite != null) break block4;
                        if (!bl2) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)2688260661244594819L, (long)l10);
                    }
                    this.D.add(object);
                    return true;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)2688260661244594819L, (long)l10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public Iterator iterator() {
        long l10 = a ^ 0x41E58F67BA94L;
        long l11 = l10 ^ 0x919DD40D09FL;
        return new l6g(this, l11);
    }

    public gv(int n10, char c10, int n11, short s10) {
        long l10;
        long l11 = l10 = ((long)c10 << 48 | (long)n11 << 32 >>> 16 | (long)s10 << 48 >>> 48) ^ a;
        long l12 = l11 ^ 0x5AD8467326ADL;
        long l13 = l11 ^ 0x1306921406D7L;
        int n12 = (int)(l13 >>> 32);
        int n13 = (int)(l13 << 32 >>> 48);
        int n14 = (int)(l13 << 48 >>> 48);
        Object[] objectArray = new Object[2];
        objectArray[1] = l12;
        objectArray[0] = cf.x(n10, n12, (char)n13, (short)n14);
        m44.a("q", (Object)this, (Set)((Object)m44.a("m", (Object)objectArray, (long)-1536216162278441498L, (long)l10)), (long)-979773946882039904L, (long)l10);
        this.D = new ArrayList(n10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public gv(Collection collection, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x14075DFDD3ADL;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 32);
        int n12 = (int)(l11 << 48 >>> 48);
        this(collection.size(), (char)n10, n11, (short)n12);
        Collection collection2 = collection;
        synchronized (collection2) {
            CallSite callSite = m44.a("m", (long)631467191549040373L, (long)l10);
            for (Object e10 : collection) {
                block10: {
                    boolean bl2;
                    block11: {
                        boolean bl3 = m44.a("s", (Object)this, (long)1535582000280189064L, (long)l10).add(e10);
                        if (callSite != null) return;
                        bl2 = bl3;
                        if (callSite != null) break block10;
                        break block11;
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("m", (Object)illegalArgumentException, (long)980093686126355028L, (long)l10);
                        }
                    }
                    try {
                        block12: {
                            if (!bl2) break block10;
                            break block12;
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("m", (Object)illegalArgumentException, (long)980093686126355028L, (long)l10);
                            }
                        }
                        bl2 = this.D.add(e10);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)980093686126355028L, (long)l10);
                    }
                }
                if (callSite == null) continue;
            }
            // MONITOREXIT @DISABLED, blocks:[0, 4] lbl34 : MonitorExitStatement: MONITOREXIT : var8_6
            if (l10 <= 0L) return;
        }
    }

    public synchronized Object clone() {
        long l10 = a ^ 0x7806AAF6F46CL;
        long l11 = l10 ^ 0x70020B659D6DL;
        return new gv(this, l11);
    }

    @Override
    public synchronized void clear() {
        long l10 = a ^ 0x78EF889ED86CL;
        m44.a("p", (Object)this, (long)-61917542344174877L, (long)l10).clear();
        this.D.clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public gv(gv gv2, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x5270A5D1BC2EL;
        int n10 = (int)(l11 >>> 48);
        int n11 = (int)(l11 << 16 >>> 32);
        int n12 = (int)(l11 << 48 >>> 48);
        this(gv2.size(), (char)n10, n11, (short)n12);
        gv gv3 = gv2;
        synchronized (gv3) {
            m44.a("p", (Object)this, (long)8848515290536040203L, (long)l10).addAll(gv2);
            this.D.addAll(gv2);
        }
    }

    @Override
    public boolean containsAll(Collection collection) {
        long l10 = a ^ 0x1EA984AB29B8L;
        return (boolean)m44.a("u", (Object)m44.a("t", (Object)this, (long)1076465953430053687L, (long)l10), (Object)collection, (long)968122383682264353L, (long)l10);
    }

    @Override
    public Object[] toArray() {
        Object[] objectArray = new Object[this.D.size()];
        return this.D.toArray(objectArray);
    }

    static /* synthetic */ List x(Object[] objectArray) {
        gv gv2 = (gv)objectArray[0];
        return gv2.D;
    }

    @Override
    public synchronized boolean contains(Object object) {
        long l10 = a ^ 0x4D92D20EDD8BL;
        return m44.a("w", (Object)this, (long)-377401664234727676L, (long)l10).contains(object);
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        return this.D.toArray(objectArray);
    }

    @Override
    public boolean addAll(Collection collection) {
        boolean bl2;
        block5: {
            long l10 = a ^ 0x5A685FFC9EA2L;
            boolean bl3 = false;
            CallSite callSite = m44.a("h", (long)-6600531629718848944L, (long)l10);
            for (Object e10 : collection) {
                block6: {
                    boolean bl4 = m44.a("v", (Object)this, (long)-5050183534554672083L, (long)l10).add(e10);
                    try {
                        try {
                            bl2 = bl4;
                            if (callSite != null) break block5;
                            if (callSite != null) break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("h", (Object)illegalArgumentException, (long)-6828405469664342287L, (long)l10);
                        }
                        if (!bl2) break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)-6828405469664342287L, (long)l10);
                    }
                    bl3 = true;
                    this.D.add(e10);
                }
                if (callSite == null) continue;
            }
            bl2 = bl3;
        }
        return bl2;
    }

    public gv(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x2F0DE4D198BDL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("v", (Object)this, (Set)((Object)m44.a("j", (Object)objectArray, (long)3790312243972623642L, (long)l10)), (long)3947499627327462159L, (long)l10);
        this.D = new ArrayList();
    }

    @Override
    public boolean removeAll(Collection collection) {
        CallSite callSite;
        block4: {
            CallSite callSite2;
            block5: {
                long l10 = a ^ 0x6427FA291A4CL;
                callSite2 = m44.a("q", (Object)m44.a("p", (Object)this, (long)4396668387925823683L, (long)l10), (Object)collection, (long)2388075920688871391L, (long)l10);
                CallSite callSite3 = m44.a("n", (long)2344138155587092158L, (long)l10);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block4;
                        if (callSite == false) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)2725415722880010783L, (long)l10);
                    }
                    m44.a("q", (Object)this.D, (Object)collection, (long)2363873122309553862L, (long)l10);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)2725415722880010783L, (long)l10);
                }
            }
            callSite = callSite2;
        }
        return (boolean)callSite;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized Object q(Object[] objectArray) {
        int n10;
        int n11;
        long l10;
        block4: {
            l10 = (Long)objectArray[0];
            n11 = (Integer)objectArray[1];
            l10 = a ^ l10;
            CallSite callSite = m44.a("i", (long)-1310704910644022279L, (long)l10);
            try {
                n10 = n11;
                if (callSite != null) break block4;
                if (n10 < 0) throw new IllegalArgumentException((String)((Object)gv.a("o", (int)16439, (long)(0x8E61589573D18E6L ^ l10))) + n11 + (String)((Object)gv.a("o", (int)8702, (long)(0x25E54012CBEF792EL ^ l10))) + this.D.size());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("i", (Object)illegalArgumentException, (long)-1687193139241957544L, (long)l10);
            }
            n10 = n11;
        }
        try {
            if (n10 < this.D.size()) return this.D.get(n11);
            throw new IllegalArgumentException((String)((Object)gv.a("o", (int)16439, (long)(0x8E61589573D18E6L ^ l10))) + n11 + (String)((Object)gv.a("o", (int)8702, (long)(0x25E54012CBEF792EL ^ l10))) + this.D.size());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("i", (Object)illegalArgumentException, (long)-1687193139241957544L, (long)l10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l10 = a ^ 0x66864F94EFA6L;
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
        String string = "\u00ae<\u0090\u009b;\u00e6P\u00d3\u00e7\u00e8\u00ed\u008b\u0018\u00b0\u00fa\u00a3Kw\u00fd\t\u00a1F\u00b4l\u00a6z-\u0085\u0010\u0018.%\u00de\u001f\u00e1x\u00c0H\u00beS\u0010\u00da\u00db\u0089^5\u0082\u00c7D\u00a2\u00ee\u00ff\u00d0\u0082t\u00e0{";
        int n11 = "\u00ae<\u0090\u009b;\u00e6P\u00d3\u00e7\u00e8\u00ed\u008b\u0018\u00b0\u00fa\u00a3Kw\u00fd\t\u00a1F\u00b4l\u00a6z-\u0085\u0010\u0018.%\u00de\u001f\u00e1x\u00c0H\u00beS\u0010\u00da\u00db\u0089^5\u0082\u00c7D\u00a2\u00ee\u00ff\u00d0\u0082t\u00e0{".length();
        int n12 = 40;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = gv.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(byte[] byArray) {
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x3B5E;
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
                throw new RuntimeException("com/zelix/gv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            gv.d[n11] = gv.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = gv.a(n10, l10);
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
            throw new RuntimeException("com/zelix/gv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gv.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

