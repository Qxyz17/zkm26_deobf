/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqt;
import com.zelix.m;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.us;
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
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JRootPane;

public class tx
extends JFrame
implements us {
    protected static final String Q;
    private static String[] i;
    private static final long eb;
    private static final String[] fb;
    private static final String[] gb;
    private static final Map hb;

    public Action r(Object[] objectArray) {
        return new lqt(this);
    }

    public void x(m m2, Object object, Object object2, Object object3, long l) {
    }

    protected void L(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }

    @Override
    public void validateTree() {
        super.validateTree();
    }

    @Override
    public void doLayout() {
        super.doLayout();
    }

    public static String[] v() {
        return i;
    }

    @Override
    protected JRootPane createRootPane() {
        long l = eb ^ 0x4FCE1443D815L;
        JRootPane jRootPane = new JRootPane();
        CallSite callSite = m44.a("h", (Object)tx.a("d", (int)15345, (long)(0x7701B38AFCE9B542L ^ l)), (long)6482880981853570139L, (long)l);
        CallSite callSite2 = m44.a("w", (Object)this, (Object)new Object[0], (long)6355887360853550309L, (long)l);
        CallSite callSite3 = m44.a("w", (Object)jRootPane, (int)2, (long)4667682019068333420L, (long)l);
        m44.a("w", (Object)callSite3, (Object)callSite, (Object)tx.a("d", (int)3893, (long)(0x6997BFD6E3830187L ^ l)), (long)6814801047860350069L, (long)l);
        m44.a("w", (Object)m44.a("w", (Object)jRootPane, (long)5157306590847650012L, (long)l), (Object)tx.a("d", (int)3893, (long)(0x6997BFD6E3830187L ^ l)), (Object)callSite2, (long)4656088056061684285L, (long)l);
        return jRootPane;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        eb = prr.a((long)-4759885201548292734L, (long)8576051930414628847L, MethodHandles.lookup().lookupClass()).a(65497758346296L);
        long l = eb ^ 0x44A8F504833AL;
        hb = new HashMap(13);
        m44.a("o", (Object)new String[1], (long)122726496008628516L, (long)l);
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
        String string = "\u00fdI \u0081\u008e\u001d!,\u00c3e|*Pf\u00c2\u00ba\u0010X\u007f\u00e3\u0094\u00b6\u008b\u001f}\u00e3!\u00e3\u00bc\f,`{";
        int n2 = "\u00fdI \u0081\u008e\u001d!,\u00c3e|*Pf\u00c2\u00ba\u0010X\u007f\u00e3\u0094\u00b6\u008b\u001f}\u00e3!\u00e3\u00bc\f,`{".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = tx.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                fb = stringArray;
                gb = new String[2];
                Q = m44.a("k", (long)188363084218490827L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    @Override
    public void validate() {
        super.validate();
    }

    private void s(Object[] objectArray) {
    }

    @Override
    public void setVisible(boolean bl) {
        block5: {
            tx tx2;
            long l;
            long l2;
            block4: {
                l2 = eb ^ 0x63BBD1A52E3BL;
                l = l2 ^ 0x6C4F052FD19CL;
                CallSite callSite = m44.a("n", (long)-5915596672277216637L, (long)l2);
                try {
                    try {
                        tx2 = this;
                        if (callSite == null) break block4;
                        super.setVisible(bl);
                        if (!bl) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-5189859633465284414L, (long)l2);
                    }
                    tx2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-5189859633465284414L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            m44.a("q", (Object)tx2, (Object)objectArray, (long)-6077270182246227710L, (long)l2);
        }
    }

    public static void r(String[] stringArray) {
        i = stringArray;
    }

    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        m44.a("q", (Object)this, (boolean)false, (long)-8705733422748389886L, (long)l);
        m44.a("q", (Object)this, (long)-7455593184842224669L, (long)l);
    }

    public tx(String string, long l) {
        l = eb ^ l;
        super(string);
        m44.a("k", (Object)this, (Object)new Object[0], (long)5495256233901454278L, (long)l);
    }

    public tx(long l) {
        l = eb ^ l;
        m44.a("k", (Object)this, (Object)new Object[0], (long)-2086450045884703602L, (long)l);
    }

    private static n9 d(n9 n92) {
        return n92;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5ABC;
        if (gb[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])hb.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/tx", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = fb[n2].getBytes("ISO-8859-1");
            tx.gb[n2] = tx.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return gb[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = tx.a(n, l);
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
            throw new RuntimeException("com/zelix/tx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(tx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
