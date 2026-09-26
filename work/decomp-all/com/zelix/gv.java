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
    private static final long a = prr.a((long)7623867230624288854L, (long)-6302525059465531849L, MethodHandles.lookup().lookupClass()).a(165701600100152L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public int N(Object[] objectArray) {
        int n;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                Object object = objectArray[1];
                l = a ^ l;
                CallSite callSite = m44.a("k", (long)-1696394812799977917L, (long)l);
                try {
                    try {
                        n = m44.a("u", (Object)this, (long)-722504178872952770L, (long)l).contains(object);
                        if (callSite != null) break block4;
                        if (n == 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-1355684691368230174L, (long)l);
                    }
                    return (int)m44.a("t", (Object)this.D, (Object)object, (long)-1403745593196361416L, (long)l);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)-1355684691368230174L, (long)l);
                }
            }
            n = -1;
        }
        return n;
    }

    @Override
    public int size() {
        return this.D.size();
    }

    @Override
    public synchronized boolean remove(Object object) {
        boolean bl;
        block2: {
            boolean bl2;
            block3: {
                long l = a ^ 0xD5D0AEF9C33L;
                bl2 = m44.a("w", (Object)this, (long)-4937225159476734276L, (long)l).remove(object);
                CallSite callSite = m44.a("i", (long)-6415548912136636223L, (long)l);
                try {
                    bl = bl2;
                    if (callSite != null) break block2;
                    if (!bl) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("i", (Object)illegalArgumentException, (long)-6652390242319758240L, (long)l);
                }
                CallSite callSite2 = m44.a("v", (Object)this.D, (Object)object, (long)-6617266997914847455L, (long)l);
            }
            bl = bl2;
        }
        return bl;
    }

    @Override
    public boolean retainAll(Collection collection) {
        CallSite callSite;
        block4: {
            CallSite callSite2;
            block5: {
                long l = a ^ 0xD0C6F8517E8L;
                callSite2 = m44.a("u", (Object)m44.a("t", (Object)this, (long)3503927714747653479L, (long)l), (Object)collection, (long)3276380864617367803L, (long)l);
                CallSite callSite3 = m44.a("j", (long)3255086650591097626L, (long)l);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block4;
                        if (callSite == false) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)2915788303362623419L, (long)l);
                    }
                    m44.a("u", (Object)this.D, (Object)collection, (long)3985341896593095060L, (long)l);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)2915788303362623419L, (long)l);
                }
            }
            callSite = callSite2;
        }
        return (boolean)callSite;
    }

    @Override
    public boolean isEmpty() {
        long l = a ^ 0x245A1FF618F7L;
        return (boolean)m44.a("r", (Object)m44.a("s", (Object)this, (long)4593490094540526200L, (long)l), (long)2816691151925216610L, (long)l);
    }

    @Override
    public synchronized boolean add(Object object) {
        boolean bl;
        block4: {
            block5: {
                long l = a ^ 0x65DB108A1AD0L;
                CallSite callSite = m44.a("j", (long)2311486559709707810L, (long)l);
                try {
                    try {
                        bl = m44.a("t", (Object)this, (long)4438327559203131487L, (long)l).add(object);
                        if (callSite != null) break block4;
                        if (!bl) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)2688260661244594819L, (long)l);
                    }
                    this.D.add(object);
                    return true;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)2688260661244594819L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public Iterator iterator() {
        long l = a ^ 0x41E58F67BA94L;
        long l2 = l ^ 0x919DD40D09FL;
        return new l6g(this, l2);
    }

    public gv(int n, char c, int n2, short s) {
        long l;
        long l2 = l = ((long)c << 48 | (long)n2 << 32 >>> 16 | (long)s << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x5AD8467326ADL;
        long l4 = l2 ^ 0x1306921406D7L;
        int n3 = (int)(l4 >>> 32);
        int n4 = (int)(l4 << 32 >>> 48);
        int n5 = (int)(l4 << 48 >>> 48);
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = cf.x((int)n, (int)n3, (char)((char)n4), (short)((short)n5));
        m44.a("q", (Object)this, (Set)((Object)m44.a("m", (Object)objectArray, (long)-1536216162278441498L, (long)l)), (long)-979773946882039904L, (long)l);
        this.D = new ArrayList(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public gv(Collection collection, long l) {
        long l2 = (l = a ^ l) ^ 0x14075DFDD3ADL;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        this(collection.size(), (char)n, n2, (short)n3);
        Collection collection2 = collection;
        synchronized (collection2) {
            CallSite callSite = m44.a("m", (long)631467191549040373L, (long)l);
            for (Object e : collection) {
                block10: {
                    boolean bl;
                    block11: {
                        boolean bl2 = m44.a("s", (Object)this, (long)1535582000280189064L, (long)l).add(e);
                        if (callSite != null) return;
                        bl = bl2;
                        if (callSite != null) break block10;
                        break block11;
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("m", (Object)illegalArgumentException, (long)980093686126355028L, (long)l);
                        }
                    }
                    try {
                        block12: {
                            if (!bl) break block10;
                            break block12;
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("m", (Object)illegalArgumentException, (long)980093686126355028L, (long)l);
                            }
                        }
                        bl = this.D.add(e);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)980093686126355028L, (long)l);
                    }
                }
                if (callSite == null) continue;
            }
            // MONITOREXIT @DISABLED, blocks:[0, 4] lbl34 : MonitorExitStatement: MONITOREXIT : var8_6
            if (l <= 0L) return;
        }
    }

    public synchronized Object clone() {
        long l = a ^ 0x7806AAF6F46CL;
        long l2 = l ^ 0x70020B659D6DL;
        return new gv(this, l2);
    }

    @Override
    public synchronized void clear() {
        long l = a ^ 0x78EF889ED86CL;
        m44.a("p", (Object)this, (long)-61917542344174877L, (long)l).clear();
        this.D.clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public gv(gv gv2, long l) {
        long l2 = (l = a ^ l) ^ 0x5270A5D1BC2EL;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        this(gv2.size(), (char)n, n2, (short)n3);
        gv gv3 = gv2;
        synchronized (gv3) {
            m44.a("p", (Object)this, (long)8848515290536040203L, (long)l).addAll(gv2);
            this.D.addAll(gv2);
        }
    }

    @Override
    public boolean containsAll(Collection collection) {
        long l = a ^ 0x1EA984AB29B8L;
        return (boolean)m44.a("u", (Object)m44.a("t", (Object)this, (long)1076465953430053687L, (long)l), (Object)collection, (long)968122383682264353L, (long)l);
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
        long l = a ^ 0x4D92D20EDD8BL;
        return m44.a("w", (Object)this, (long)-377401664234727676L, (long)l).contains(object);
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        return this.D.toArray(objectArray);
    }

    @Override
    public boolean addAll(Collection collection) {
        boolean bl;
        block5: {
            long l = a ^ 0x5A685FFC9EA2L;
            boolean bl2 = false;
            CallSite callSite = m44.a("h", (long)-6600531629718848944L, (long)l);
            for (Object e : collection) {
                block6: {
                    boolean bl3 = m44.a("v", (Object)this, (long)-5050183534554672083L, (long)l).add(e);
                    try {
                        try {
                            bl = bl3;
                            if (callSite != null) break block5;
                            if (callSite != null) break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("h", (Object)illegalArgumentException, (long)-6828405469664342287L, (long)l);
                        }
                        if (!bl) break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)-6828405469664342287L, (long)l);
                    }
                    bl2 = true;
                    this.D.add(e);
                }
                if (callSite == null) continue;
            }
            bl = bl2;
        }
        return bl;
    }

    public gv(long l) {
        long l2 = (l = a ^ l) ^ 0x2F0DE4D198BDL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("v", (Object)this, (Set)((Object)m44.a("j", (Object)objectArray, (long)3790312243972623642L, (long)l)), (long)3947499627327462159L, (long)l);
        this.D = new ArrayList();
    }

    @Override
    public boolean removeAll(Collection collection) {
        CallSite callSite;
        block4: {
            CallSite callSite2;
            block5: {
                long l = a ^ 0x6427FA291A4CL;
                callSite2 = m44.a("q", (Object)m44.a("p", (Object)this, (long)4396668387925823683L, (long)l), (Object)collection, (long)2388075920688871391L, (long)l);
                CallSite callSite3 = m44.a("n", (long)2344138155587092158L, (long)l);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block4;
                        if (callSite == false) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("n", (Object)illegalArgumentException, (long)2725415722880010783L, (long)l);
                    }
                    m44.a("q", (Object)this.D, (Object)collection, (long)2363873122309553862L, (long)l);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("n", (Object)illegalArgumentException, (long)2725415722880010783L, (long)l);
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
        int n;
        int n2;
        long l;
        block4: {
            l = (Long)objectArray[0];
            n2 = (Integer)objectArray[1];
            l = a ^ l;
            CallSite callSite = m44.a("i", (long)-1310704910644022279L, (long)l);
            try {
                n = n2;
                if (callSite != null) break block4;
                if (n < 0) throw new IllegalArgumentException((String)((Object)gv.a("o", (int)16439, (long)(0x8E61589573D18E6L ^ l))) + n2 + (String)((Object)gv.a("o", (int)8702, (long)(0x25E54012CBEF792EL ^ l))) + this.D.size());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("i", (Object)illegalArgumentException, (long)-1687193139241957544L, (long)l);
            }
            n = n2;
        }
        try {
            if (n < this.D.size()) return this.D.get(n2);
            throw new IllegalArgumentException((String)((Object)gv.a("o", (int)16439, (long)(0x8E61589573D18E6L ^ l))) + n2 + (String)((Object)gv.a("o", (int)8702, (long)(0x25E54012CBEF792EL ^ l))) + this.D.size());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("i", (Object)illegalArgumentException, (long)-1687193139241957544L, (long)l);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x66864F94EFA6L;
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
        String string = "\u00ae<\u0090\u009b;\u00e6P\u00d3\u00e7\u00e8\u00ed\u008b\u0018\u00b0\u00fa\u00a3Kw\u00fd\t\u00a1F\u00b4l\u00a6z-\u0085\u0010\u0018.%\u00de\u001f\u00e1x\u00c0H\u00beS\u0010\u00da\u00db\u0089^5\u0082\u00c7D\u00a2\u00ee\u00ff\u00d0\u0082t\u00e0{";
        int n2 = "\u00ae<\u0090\u009b;\u00e6P\u00d3\u00e7\u00e8\u00ed\u008b\u0018\u00b0\u00fa\u00a3Kw\u00fd\t\u00a1F\u00b4l\u00a6z-\u0085\u0010\u0018.%\u00de\u001f\u00e1x\u00c0H\u00beS\u0010\u00da\u00db\u0089^5\u0082\u00c7D\u00a2\u00ee\u00ff\u00d0\u0082t\u00e0{".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = gv.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3B5E;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/gv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            gv.d[n2] = gv.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = gv.a(n, l);
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
