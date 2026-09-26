/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._6;
import com.zelix._p;
import com.zelix.ai;
import com.zelix.loe;
import com.zelix.lqu;
import com.zelix.lyt;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ol;
import com.zelix.prr;
import com.zelix.sh;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class l6n
implements ai {
    private List i;
    private ol B;
    private sh L;
    private ol F;
    private lqu O;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    @Override
    public final boolean v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        lyt lyt2 = (lyt)objectArray[3];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = lyt2;
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = l11;
        return (boolean)m44.a("p", (Object)m44.a("q", (Object)this, (long)-2670712759473924849L, (long)l10), (Object)objectArray2, (long)-4409807138191073663L, (long)l10);
    }

    @Override
    public final boolean R(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        lyt lyt2 = (lyt)objectArray[3];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = lyt2;
        objectArray2[2] = l11;
        objectArray2[1] = string2;
        objectArray2[0] = string;
        return (boolean)m44.a("s", (Object)m44.a("r", (Object)this, (long)-2633311303215278956L, (long)l10), (Object)objectArray2, (long)-2872742164421866511L, (long)l10);
    }

    @Override
    public Set I(int n10, String string, Integer n11, boolean bl2, long l10) {
        long l11 = (long)n10 << 32 | l10 << 32 >>> 32;
        long l12 = l11 ^ 0L;
        int n12 = (int)(l12 >>> 32);
        long l13 = l12 << 32 >>> 32;
        return ((sh)((Object)m44.a("u", (Object)this, (long)-5049759818786638325L, (long)l11))).I(n12, string, n11, bl2, l13);
    }

    @Override
    public final boolean J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("t", (Object)m44.a("u", (Object)this, (long)1548098127159548571L, (long)l10), (Object)objectArray2, (long)1202966579629165281L, (long)l10);
    }

    @Override
    public final boolean G(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        loe loe2 = (loe)objectArray[1];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = loe2;
        objectArray2[0] = l11;
        return (boolean)m44.a("w", (Object)m44.a("v", (Object)this, (long)990985863802831392L, (long)l10), (Object)objectArray2, (long)927881635674657621L, (long)l10);
    }

    @Override
    public final boolean y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("v", (Object)m44.a("w", (Object)this, (long)5310198668786239057L, (long)l10), (Object)objectArray2, (long)5642954935516076992L, (long)l10);
    }

    public l6n(sh sh2, long l10, List list, lqu lqu2) {
        block5: {
            long l11;
            block4: {
                long l12 = l10 = a ^ l10;
                long l13 = l12 ^ 0x91AE5ACEE99L;
                long l14 = l12 ^ 0x69FC670B6380L;
                long l15 = l12 ^ 0x707595930160L;
                int n10 = (int)(l15 >>> 32);
                int n11 = (int)(l15 << 32 >>> 48);
                int n12 = (int)(l15 << 48 >>> 48);
                l11 = l12 ^ 0x2291C3EAADE7L;
                m44.a("r", (Object)this, (ol)new ol(n10, (short)n11, (short)n12), (long)2211173204949292373L, (long)l10);
                CallSite callSite = m44.a("n", (long)2253843228058418955L, (long)l10);
                m44.a("r", (Object)this, (ol)new ol(n10, (short)n11, (short)n12), (long)1924344411826257724L, (long)l10);
                m44.a("r", (Object)this, (sh)sh2, (long)1893466280508904870L, (long)l10);
                m44.a("r", (Object)this, (List)list, (long)1997653380185641951L, (long)l10);
                m44.a("r", (Object)this, (lqu)lqu2, (long)2102249994101593345L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l13;
                        if (m44.a("q", (Object)sh2, (Object)objectArray, (long)1903775160628571161L, (long)l10) == false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)1737805019017417138L, (long)l10);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l14;
                    m44.a("o", (Object)this, (Object)objectArray, (long)1815187165906749264L, (long)l10);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)1737805019017417138L, (long)l10);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l11;
            m44.a("o", (Object)this, (Object)objectArray, (long)25493430304607978L, (long)l10);
        }
    }

    @Override
    public final boolean Z(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = string2;
        objectArray2[0] = string;
        return (boolean)m44.a("u", (Object)m44.a("t", (Object)this, (long)4745355506286890554L, (long)l10), (Object)objectArray2, (long)4982584624270769586L, (long)l10);
    }

    @Override
    public String E(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l11;
        return m44.a("p", (Object)m44.a("q", (Object)this, (long)975012964380951143L, (long)l10), (Object)objectArray2, (long)1362443035715971078L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    private final void F(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public final boolean O(long l10, String string, String string2) {
        long l11 = l10 ^ 0L;
        return (boolean)m44.a("r", (Object)m44.a("s", (Object)this, (long)-7138872382974110963L, (long)l10), (long)l11, (Object)string, (Object)string2, (long)-8721257326477019735L, (long)l10);
    }

    @Override
    public final boolean j(String string, long l10, String string2) {
        long l11 = l10 ^ 0L;
        return (boolean)m44.a("u", (Object)m44.a("t", (Object)this, (long)6776421293121049066L, (long)l10), (Object)string, (long)l11, (Object)string2, (long)5000789231140913199L, (long)l10);
    }

    @Override
    public final boolean K(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = l11;
        return (boolean)m44.a("v", (Object)m44.a("w", (Object)this, (long)-792167451073496351L, (long)l10), (Object)objectArray2, (long)-1170359217708483389L, (long)l10);
    }

    @Override
    public final boolean b(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        lyt lyt2 = (lyt)objectArray[3];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = lyt2;
        objectArray2[2] = string2;
        objectArray2[1] = l11;
        objectArray2[0] = string;
        return (boolean)m44.a("w", (Object)m44.a("v", (Object)this, (long)-143957693466267168L, (long)l10), (Object)objectArray2, (long)-300033787295437526L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    public void a(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[DOLOOP]], but top level block is 9[SIMPLE_IF_TAKEN]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public PrintWriter T(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x69B657EFB6B7L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("t", (Object)m44.a("u", (Object)this, (long)-3561805698799909188L, (long)l10), (Object)objectArray2, (long)-3095126922659066915L, (long)l10);
    }

    /*
     * Exception decompiling
     */
    private final void Q(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public final boolean p(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return (boolean)m44.a("q", (Object)m44.a("p", (Object)this, (long)-601592577566295994L, (long)l10), (Object)objectArray2, (long)-1476676147422732836L, (long)l10);
    }

    @Override
    public _6 Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("p", (Object)m44.a("q", (Object)this, (long)-155382577525018057L, (long)l10), (Object)objectArray2, (long)-1838115007293849850L, (long)l10);
    }

    public _p a(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        int n11 = (Integer)objectArray[1];
        int n12 = (Integer)objectArray[2];
        long l10 = ((long)n10 << 56 | (long)n11 << 32 >>> 8 | (long)n12 << 40 >>> 40) ^ a;
        long l11 = l10 ^ 0x53D3B65EF117L;
        return new _p(l11, (ol)((Object)m44.a("s", (Object)this, (long)-7203525354721117809L, (long)l10)));
    }

    public Enumeration D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0xBCDC9868CAAL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        return m44.a("w", (Object)m44.a("v", (Object)this, (long)-3375285606678585656L, (long)l10), (Object)objectArray2, (long)-3571092904932693765L, (long)l10);
    }

    @Override
    public final boolean n(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l10 = (Long)objectArray[2];
        lyt lyt2 = (lyt)objectArray[3];
        long l11 = l10 ^ 0L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = lyt2;
        objectArray2[2] = l11;
        objectArray2[1] = string2;
        objectArray2[0] = string;
        return (boolean)m44.a("r", (Object)m44.a("s", (Object)this, (long)-2930208697800845131L, (long)l10), (Object)objectArray2, (long)-2987620073948038502L, (long)l10);
    }

    public boolean D(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (boolean)m44.a("v", (Object)m44.a("w", (Object)this, (long)332011684978756790L, (long)l10), (long)2148761538121779098L, (long)l10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                l6n.a = prr.a(562090608997077924L, 2334324880217109048L, MethodHandles.lookup().lookupClass()).a(267420210222168L);
                l6n.d = new HashMap<K, V>(13);
                var0 = l6n.a ^ 41425292352466L;
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
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "\u009c\u008b:L\u0089\u00ff\u00eb\u00b8\u0083**\u00f6\u00ff,4\u00bet2\u00dfl\u007f\u001d\u0082\u00af,C\u00ee+f\u0017\u0005\u0010\\\u0097\u00db\u0083\u00dbq\u00cf\"\u0018V\u009a%\u00a1zx`\u00c1\u00b6\u00dd'1\\\u00cb\b\u00fdH\u00fcC\u0086\u0087>_+\u008888\u00bfu\u00993\u008e\u00b1!H!\u00e3#\u00f8\u00db\u00bc\u00c7.\u00d6\u00df\u0019\u00cbO(l\u0095\u0099\u000bk\u0087;E\u00e8\u0012\u00cf\u00fa4\u00c6\u0003\u00c93\u00c3`1Y\u00ed\u00a9\u00a2\u00e4\u0006\u00e0\u00b0\u00b3\u00f0l\u00e3\u00e2[\u00f8\u0083^\u00b0Pu\u0097v\u009d\u00fc\u0084\u00f1\u00f7W\u00c3\u00f0\u008c&\u00bb\u00dfT5U\u00c5\u008f\u0098\u00bd\u0004\u00b2O\u00a1\u00dd\u00e7\u00e1\u00f1\u00e7\u00df\u00f1,\u0084W\u00de\u00bdI\u009d\u0083_\u00c6\u000bw\u0007;@\u00e5\u00f9[T\u00a0\u0014\u00fasO\u00f6\u001c\u00182\u009b]\u00da\u00f9\u00ed\u00cc\u00a3iN\u00d3\u00f9\u009b \u00d0\u00e0\u00a7\b\u0092\u00b7s|g\u001dY\u00e7\u00e9\u0082;{S\u00ecm\u00b6\u00bes\u00da\u00c4\u00ce7\u0094v\u00ebBS~\u0010\u00a2`\tf\u008b\u00136\u00afy:\u0014]\u00e7\u0091\u0095\u00028\u0099\u00f73\u001e_8\u0003\u00e7\u0082|\u00e9|SB\u00e1\u00b7\u00d6\u0004\u00a9[\u00a3\u00ed-S\u00f1\tp\u00e1\u00f7\u0090[\u00b6o\u00ffU,\u00f8\u0000\u00a7v\u00e0w(4\u00847\u00eb\u0098\u0092\u00cb\u00bf\u001a'\u00b3Q\u00b2\u0010\u0013\u00d6\u00da1=\u00ba/`M\u00d1\u00ed\u0001LK/\u0085 7?{\u00ef\u00e6F\u00be\u001a\u00d9\u009d?J\u00cb\nx\u0015\u0084\u008eD\u00cd9\u00ca\u0087\u00f8\u00d09\u001c\"\u009c\u008a\u00f2\u00af";
                var8_6 = "\u009c\u008b:L\u0089\u00ff\u00eb\u00b8\u0083**\u00f6\u00ff,4\u00bet2\u00dfl\u007f\u001d\u0082\u00af,C\u00ee+f\u0017\u0005\u0010\\\u0097\u00db\u0083\u00dbq\u00cf\"\u0018V\u009a%\u00a1zx`\u00c1\u00b6\u00dd'1\\\u00cb\b\u00fdH\u00fcC\u0086\u0087>_+\u008888\u00bfu\u00993\u008e\u00b1!H!\u00e3#\u00f8\u00db\u00bc\u00c7.\u00d6\u00df\u0019\u00cbO(l\u0095\u0099\u000bk\u0087;E\u00e8\u0012\u00cf\u00fa4\u00c6\u0003\u00c93\u00c3`1Y\u00ed\u00a9\u00a2\u00e4\u0006\u00e0\u00b0\u00b3\u00f0l\u00e3\u00e2[\u00f8\u0083^\u00b0Pu\u0097v\u009d\u00fc\u0084\u00f1\u00f7W\u00c3\u00f0\u008c&\u00bb\u00dfT5U\u00c5\u008f\u0098\u00bd\u0004\u00b2O\u00a1\u00dd\u00e7\u00e1\u00f1\u00e7\u00df\u00f1,\u0084W\u00de\u00bdI\u009d\u0083_\u00c6\u000bw\u0007;@\u00e5\u00f9[T\u00a0\u0014\u00fasO\u00f6\u001c\u00182\u009b]\u00da\u00f9\u00ed\u00cc\u00a3iN\u00d3\u00f9\u009b \u00d0\u00e0\u00a7\b\u0092\u00b7s|g\u001dY\u00e7\u00e9\u0082;{S\u00ecm\u00b6\u00bes\u00da\u00c4\u00ce7\u0094v\u00ebBS~\u0010\u00a2`\tf\u008b\u00136\u00afy:\u0014]\u00e7\u0091\u0095\u00028\u0099\u00f73\u001e_8\u0003\u00e7\u0082|\u00e9|SB\u00e1\u00b7\u00d6\u0004\u00a9[\u00a3\u00ed-S\u00f1\tp\u00e1\u00f7\u0090[\u00b6o\u00ffU,\u00f8\u0000\u00a7v\u00e0w(4\u00847\u00eb\u0098\u0092\u00cb\u00bf\u001a'\u00b3Q\u00b2\u0010\u0013\u00d6\u00da1=\u00ba/`M\u00d1\u00ed\u0001LK/\u0085 7?{\u00ef\u00e6F\u00be\u001a\u00d9\u009d?J\u00cb\nx\u0015\u0084\u008eD\u00cd9\u00ca\u0087\u00f8\u00d09\u001c\"\u009c\u008a\u00f2\u00af".length();
                var5_7 = 40;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = l6n.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "@1\u00e6{)\u00ff\u00db\u00ad\u00c8:~\u00a3\u001a\u00b2`\u00d4\u00f6[\u00cb\u00ae)\u00a3\u00dd\u001a\u0099\u001b-\u00ee\u0089hA\u0099@\u0007\u00e1 \u00c9\u00ea*\u00ecui/Y\u00f94\u008dNQ\u0015\u0016\u00bd}Ix\u009a\r\u00ae\u00e8[dO\u00b8\u00f4\u00b0\u00eb\u00d6V0u\u0012\u0016gv\u009f\u00c2p\u00d5!Sx!\u00c3\u0005\u00f9P\u00c5\u00933=\u0010\u00e7z\u008c'\u001d\u00cc\u00ddn\u009c\u008c\u00dc\u00f4\u00ad>gh\u00ee\u009e\\\u00e8\u00d4\u00d2\u00f1\u0097qN\u00a0\u00a8\u0005\t\u00b1lm5Q+\u00f2\u00fe\u00eb\u0085\u00c3b\u00c7#\u00e7\u00d57\u0081w4`\u00dc1=|@]-<\u009eE\u00cc<:\u000eR\u00bd\u00a2\f\u00b6f \u00d7\u00c5\u00b3\u009cr\u00ea\u0085y-\u00b3\u00b8\u00be4wK\u0011A\u00c3\r?\u00a1\u00f6\u0012\u000f'5\u00a9\u001d\u00a1\u008a\u00e5\u00f6\u007f\u00be\u0084\u00f4\u00f1\u009c";
                    var8_6 = "@1\u00e6{)\u00ff\u00db\u00ad\u00c8:~\u00a3\u001a\u00b2`\u00d4\u00f6[\u00cb\u00ae)\u00a3\u00dd\u001a\u0099\u001b-\u00ee\u0089hA\u0099@\u0007\u00e1 \u00c9\u00ea*\u00ecui/Y\u00f94\u008dNQ\u0015\u0016\u00bd}Ix\u009a\r\u00ae\u00e8[dO\u00b8\u00f4\u00b0\u00eb\u00d6V0u\u0012\u0016gv\u009f\u00c2p\u00d5!Sx!\u00c3\u0005\u00f9P\u00c5\u00933=\u0010\u00e7z\u008c'\u001d\u00cc\u00ddn\u009c\u008c\u00dc\u00f4\u00ad>gh\u00ee\u009e\\\u00e8\u00d4\u00d2\u00f1\u0097qN\u00a0\u00a8\u0005\t\u00b1lm5Q+\u00f2\u00fe\u00eb\u0085\u00c3b\u00c7#\u00e7\u00d57\u0081w4`\u00dc1=|@]-<\u009eE\u00cc<:\u000eR\u00bd\u00a2\f\u00b6f \u00d7\u00c5\u00b3\u009cr\u00ea\u0085y-\u00b3\u00b8\u00be4wK\u0011A\u00c3\r?\u00a1\u00f6\u0012\u000f'5\u00a9\u001d\u00a1\u008a\u00e5\u00f6\u007f\u00be\u0084\u00f4\u00f1\u009c".length();
                    var5_7 = 80;
                    var4_8 = -1;
lbl34:
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
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = l6n.a(var10_9).intern();
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
lbl51:
                // 1 sources

                ** continue;
            }
        }
        l6n.b = var9_3;
        l6n.c = new String[10];
    }

    private static n9 a(n9 n92) {
        return n92;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x399;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/l6n", exception);
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
            l6n.c[n11] = l6n.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = l6n.a(n10, l10);
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
            throw new RuntimeException("com/zelix/l6n" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(l6n.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

