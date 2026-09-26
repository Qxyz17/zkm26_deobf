/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e_;
import com.zelix.gs;
import com.zelix.lqw;
import com.zelix.lu4;
import com.zelix.prr;
import com.zelix.wa;
import com.zelix.yf;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class e5
implements Runnable {
    final gs[] t;
    final yf B;
    final gs[] v;
    final gs[] A;
    final lqw[] T;
    final gs[] V;
    final boolean x;
    final gs[] W;
    final wa z;
    final lu4 b;
    final e_ I;
    final Set P;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    e5(wa wa2, yf yf2, gs[] gsArray, lqw[] lqwArray, Set set, gs[] gsArray2, gs[] gsArray3, gs[] gsArray4, gs[] gsArray5, boolean bl, e_ e_2, lu4 lu42) {
        this.z = wa2;
        this.B = yf2;
        this.W = gsArray;
        this.T = lqwArray;
        this.P = set;
        this.t = gsArray2;
        this.A = gsArray3;
        this.V = gsArray4;
        this.v = gsArray5;
        this.x = bl;
        this.I = e_2;
        this.b = lu42;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [65[CATCHBLOCK]], but top level block is 20[TRYBLOCK]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrList.lambda$main$0(CfrList.java:27)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                e5.a = prr.a((long)-8028971361109431252L, (long)-5358049606052645342L, MethodHandles.lookup().lookupClass()).a(272563098830800L);
                e5.e = new HashMap<K, V>(13);
                var0 = e5.a ^ 104411592984479L;
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
                var9_3 = new String[21];
                var7_4 = 0;
                var6_5 = "\u0015\"\u00b1\u008b%\th\u00af+\u00ee\u00eb\u0090\u00a4\u000e\u00f1\u00f0\u0083i9\u008e\u0092\r\u00adp\u00c5\u00c2\u00d4\u00bfM\u0086\u00cb\u001a\u00b8\u00b2\u00e81\u00c0\u0019\u00d6\u0090r\u00fb\r\u001b\u0097\u00d9\u00de\u0004\u001f\u00a2\u00bf\u0002\u00e7\u00b3\u0004%\u0010`\u00a4\u009f\"\u00a0\t\u00aa\u00ad}\u00cf\u00f3\u00f4>p\u00d0\u00bd\u0018\u00cf\u00dbS WG\u00ae\u00ef6UW\u00b0\u009e\u00d1\u0084\u00e6t`\u0002\u00dc\u00bf\u0007\u00c9\u00a0 \u00ec\u00cf\u008a\u000f\u00b5Kd(\u00b4\u00e1\u0000\u00f2\u00a9\rm\u00aa\u0095\u00cfcW\u0005I\u00a6\u0099\u00e5M\u00fc5\u00c9MNv@\u00b5\u00c4X%\u000e\u00a5\u00b3X\u00ad\u001e\u0088mU-O\u00ca\u00c6\u00a8^\u00d5W|\u00daJ\u00de\u00a3\u00ac\u00e6\u0001\u00c2HY\u00b0;\u00e8w\u00bd\u0080\u00d6\u00fd\u00fe\u00a9\u0000\u00b0\u00f0J\\\u0085\u00a55\u00da\u00e5\u009c\u009fS\u00ce\u00a6\u0087#\u00cfE\u00133$\u0010\u00d7Sc\u00a9\u008c\u0004\u000e\u00b8\u0002\u009c\u00b6&(\u0090\u0085XHh\u00a6\u0017W\u0012\u00a4\u00d2\u00f2:\u00cb\u00a9\"\u009cH\u00ed\u00d7\u00bcC\u00e3,\u008c\u000f\u0090\u00e2M&\u0092Gx\u00d0\u00d8^\u00b4\u00fa\u00c7\u00c9o'\u008a\u00ae4k\u0098\u00d4~\u00e2\u00cb}\u00ccI\u00a2\u0085\u00bc\u00f1\u00c7\u0093A\u008am\u008ejF\u00d2\u00d9\u00d0\u00e2\u00cb\u00f4\u00eb\u00b3\u009f\u00d4\u0108\u00df@\u0091\u00eb>\u00b2\u00b0\u0018\u009eO\u0018`d\u00b4\u00fc\u00fd\u00e8d\"6\u0080\u00f1>\u00faA'2\u00ac\u00a0.t\u00bb4M\u00b8\u00db\u0090x%kL%\u000f\u0096\u00ac\u009e\u00c9\u00c8\\\u007f\u00af9b\u00b9\u0013x\u00ce4F\u007f\u0098\u00c9.F\u00e6\u00ef\u00bc0\u00f4=T\u0094\u0014\u0098\u0005\u007f\"%\u00c8\u0016H\u00de\u00ad\u0081\u0083@\u00ec\u0011\u00b4gh\u00aa\u00d2\u0005! ~\u0007j\u008boto4\u00fc\u0095\u0016\u00c7\u00d5\u00d94\u00bb\u00c1\u001c\u00a9\u008d^\u008e8\u00fb\u00bc\u00a7\u00f8\u0006\u0098\u0004\u0094\u00e2z\u0002\u00f70\u00de+t\u00d7\u00e6\u001b;\u00b75\u00de\u009b\u00e8f\u00e35\u0084X+\u009c\u008a\u00fe\u00ee\u001d\u00aeARc\u0016/\u0092\u00cd\u0014\u00e5\u00a2\u00ed\u0097rS*\u00da\u00a6\u00bb<X\u00e7y\u0087\u00a3\u00b6T\u00d3i\u0081\"\u0010\u0087Q:\u00a5\u00c2\u0000\u008c\u0091\u0087\u008d{\u001c\u00ef\u00a9\u0098\u00a9H<\u00c8\u00fd=e\u00afiO\u009b\u00f4\u00de}\u0083\u00fd\u0012\t\u00bd\u00cc)\u00db/\u0095\u00870\u00d5\u00b9\u00d8P4\u001d)\u0092)\u00a9\u0081\u00d3L&_\u00a7\u00fe\u00ccw\u00b0\u00b9\u0016\u00c1\u00f3\u00ee\u0085\u0014'\u0014r\bm\u00e6\u0004[_0x\u0084W\u00e8\u001e\u00a3\u00a8\u0084\u00de\u00d7\u00ff~\u00b5\u00b3\u00a2\u00fe\u001cGg\u00a2\u00a2\u001cDu\u001a\u00a5\u00e6D\u0016s\u00d7\u0088_\u00a3\u00bd\u00d2\f\u0093C\u007fm\u0016\u00ae|\u00e1M\u00cdK \u00cc\u00e6\u00f0\u00c8R\u00e57s7Baf3\u00be\u00c7\u00fd\u0016\u008d\u00b1\u00d1\u00d3\b*\u00f2%&\u00f8\u000b\f%\u0098;@Zl\u00fd\u00ae\u00d4\u00a3KT\u0084\u00cd\u0015\u00dc1\u0010\u009e\u001dEx^\u0001\u00f1H\u0087\u00db\u008d\u00c1_\u00f0g\u00a2$\u00bd8\u008c\u00c3\f\r\u00c1fIOL\u00ab\u00f9\u0084\\\u00d5,\u00f5\u00a7\u00e3\u00b5\u00bd\u0080S?\u00b3\u00faF\u00a0\u0012\u00f9\u00907 \u00a4\u00a9\u0089\u0089\u00e8\u0018\u00ddJ\u0083o:9\u0006\u008f\u00b6\r\u0018\u0006$\u00c7\u0090\u00edG\u00d2b1\u00e4\u00a8\u00d6[\u00f7d@w\u00fe\u00a5\u00ce\u009b\u00a3\tl\u00ac\u00a3[\u000b\u0084\u008b\u0015\u0007\u00db\u0011\u0084+\u00d01\u00e3=\u00d3Eh\u0001\u00edS\u00d9\u00d3\u00939J8\u0016\u009f,\u0007\u00a0\u00a5\u0007\u00c0}\u00d0}U\u00c5\u0091~\u0005\u00bd\u00a2\u00a3\u00d9\u00d2^\u00ca^\u0093\u00d6f\u00a8\u0010\u0095\u00e72\u00ee\u00e2^\u00fca\u0004\u0018\\+S\u0012\u00d1\u00ef(b\u00f2M&\u0094\u00d8\u000e\u0007\u00b5Qa\u001eb\u0090\u00945\u00eb\u00b5\u00d0\u00e3}~\u0099d\u00ff\u009f\u00f7\u0007\u000e\u00a6\u00f0\u00a4\u0013\u00e0\u00b8}\u0089\u00bb\u0088s(H\u00e3\u0090\u00ac\u00e1\u009f\u00abK\r\u000e\u00f1\u00f6ja\u00ae\u009c\u0012\u0006L\u00a5e\u0004,\u00c7\u00c9\u00f5V\u000e\u00b1\u00cc-\u00d5l\u00ae\u0000\u00d8\u00c8\u00e2\u0014f(@\u00ed\u00bah\u00ec\u000e \\\u00ff\u00eaij\u00fdp\u00d6\u0095\u00f2rf\u00d5\u0084\u00b3l\u0017d\u00a6\u0094\r\u00d6\u00a5n.G\u0099\u00d9\u00b9w`&\u00a6\u0010\u00f6\u00c2Y!^\u0088g\u00d5rp\u000b:R9\u00dc\u00820L\u00ea~\u00df+\u008eOpTM\u00876\u00b0.?nBi\u001c.\u0005\u0011\u00d9IXHC\u00ea\u0089\u0094;\u0094\u00e7R&jz\u001cm\u00b2\u0011\u001b.%\u00d2\u00cd\u0000\f";
                var8_6 = "\u0015\"\u00b1\u008b%\th\u00af+\u00ee\u00eb\u0090\u00a4\u000e\u00f1\u00f0\u0083i9\u008e\u0092\r\u00adp\u00c5\u00c2\u00d4\u00bfM\u0086\u00cb\u001a\u00b8\u00b2\u00e81\u00c0\u0019\u00d6\u0090r\u00fb\r\u001b\u0097\u00d9\u00de\u0004\u001f\u00a2\u00bf\u0002\u00e7\u00b3\u0004%\u0010`\u00a4\u009f\"\u00a0\t\u00aa\u00ad}\u00cf\u00f3\u00f4>p\u00d0\u00bd\u0018\u00cf\u00dbS WG\u00ae\u00ef6UW\u00b0\u009e\u00d1\u0084\u00e6t`\u0002\u00dc\u00bf\u0007\u00c9\u00a0 \u00ec\u00cf\u008a\u000f\u00b5Kd(\u00b4\u00e1\u0000\u00f2\u00a9\rm\u00aa\u0095\u00cfcW\u0005I\u00a6\u0099\u00e5M\u00fc5\u00c9MNv@\u00b5\u00c4X%\u000e\u00a5\u00b3X\u00ad\u001e\u0088mU-O\u00ca\u00c6\u00a8^\u00d5W|\u00daJ\u00de\u00a3\u00ac\u00e6\u0001\u00c2HY\u00b0;\u00e8w\u00bd\u0080\u00d6\u00fd\u00fe\u00a9\u0000\u00b0\u00f0J\\\u0085\u00a55\u00da\u00e5\u009c\u009fS\u00ce\u00a6\u0087#\u00cfE\u00133$\u0010\u00d7Sc\u00a9\u008c\u0004\u000e\u00b8\u0002\u009c\u00b6&(\u0090\u0085XHh\u00a6\u0017W\u0012\u00a4\u00d2\u00f2:\u00cb\u00a9\"\u009cH\u00ed\u00d7\u00bcC\u00e3,\u008c\u000f\u0090\u00e2M&\u0092Gx\u00d0\u00d8^\u00b4\u00fa\u00c7\u00c9o'\u008a\u00ae4k\u0098\u00d4~\u00e2\u00cb}\u00ccI\u00a2\u0085\u00bc\u00f1\u00c7\u0093A\u008am\u008ejF\u00d2\u00d9\u00d0\u00e2\u00cb\u00f4\u00eb\u00b3\u009f\u00d4\u0108\u00df@\u0091\u00eb>\u00b2\u00b0\u0018\u009eO\u0018`d\u00b4\u00fc\u00fd\u00e8d\"6\u0080\u00f1>\u00faA'2\u00ac\u00a0.t\u00bb4M\u00b8\u00db\u0090x%kL%\u000f\u0096\u00ac\u009e\u00c9\u00c8\\\u007f\u00af9b\u00b9\u0013x\u00ce4F\u007f\u0098\u00c9.F\u00e6\u00ef\u00bc0\u00f4=T\u0094\u0014\u0098\u0005\u007f\"%\u00c8\u0016H\u00de\u00ad\u0081\u0083@\u00ec\u0011\u00b4gh\u00aa\u00d2\u0005! ~\u0007j\u008boto4\u00fc\u0095\u0016\u00c7\u00d5\u00d94\u00bb\u00c1\u001c\u00a9\u008d^\u008e8\u00fb\u00bc\u00a7\u00f8\u0006\u0098\u0004\u0094\u00e2z\u0002\u00f70\u00de+t\u00d7\u00e6\u001b;\u00b75\u00de\u009b\u00e8f\u00e35\u0084X+\u009c\u008a\u00fe\u00ee\u001d\u00aeARc\u0016/\u0092\u00cd\u0014\u00e5\u00a2\u00ed\u0097rS*\u00da\u00a6\u00bb<X\u00e7y\u0087\u00a3\u00b6T\u00d3i\u0081\"\u0010\u0087Q:\u00a5\u00c2\u0000\u008c\u0091\u0087\u008d{\u001c\u00ef\u00a9\u0098\u00a9H<\u00c8\u00fd=e\u00afiO\u009b\u00f4\u00de}\u0083\u00fd\u0012\t\u00bd\u00cc)\u00db/\u0095\u00870\u00d5\u00b9\u00d8P4\u001d)\u0092)\u00a9\u0081\u00d3L&_\u00a7\u00fe\u00ccw\u00b0\u00b9\u0016\u00c1\u00f3\u00ee\u0085\u0014'\u0014r\bm\u00e6\u0004[_0x\u0084W\u00e8\u001e\u00a3\u00a8\u0084\u00de\u00d7\u00ff~\u00b5\u00b3\u00a2\u00fe\u001cGg\u00a2\u00a2\u001cDu\u001a\u00a5\u00e6D\u0016s\u00d7\u0088_\u00a3\u00bd\u00d2\f\u0093C\u007fm\u0016\u00ae|\u00e1M\u00cdK \u00cc\u00e6\u00f0\u00c8R\u00e57s7Baf3\u00be\u00c7\u00fd\u0016\u008d\u00b1\u00d1\u00d3\b*\u00f2%&\u00f8\u000b\f%\u0098;@Zl\u00fd\u00ae\u00d4\u00a3KT\u0084\u00cd\u0015\u00dc1\u0010\u009e\u001dEx^\u0001\u00f1H\u0087\u00db\u008d\u00c1_\u00f0g\u00a2$\u00bd8\u008c\u00c3\f\r\u00c1fIOL\u00ab\u00f9\u0084\\\u00d5,\u00f5\u00a7\u00e3\u00b5\u00bd\u0080S?\u00b3\u00faF\u00a0\u0012\u00f9\u00907 \u00a4\u00a9\u0089\u0089\u00e8\u0018\u00ddJ\u0083o:9\u0006\u008f\u00b6\r\u0018\u0006$\u00c7\u0090\u00edG\u00d2b1\u00e4\u00a8\u00d6[\u00f7d@w\u00fe\u00a5\u00ce\u009b\u00a3\tl\u00ac\u00a3[\u000b\u0084\u008b\u0015\u0007\u00db\u0011\u0084+\u00d01\u00e3=\u00d3Eh\u0001\u00edS\u00d9\u00d3\u00939J8\u0016\u009f,\u0007\u00a0\u00a5\u0007\u00c0}\u00d0}U\u00c5\u0091~\u0005\u00bd\u00a2\u00a3\u00d9\u00d2^\u00ca^\u0093\u00d6f\u00a8\u0010\u0095\u00e72\u00ee\u00e2^\u00fca\u0004\u0018\\+S\u0012\u00d1\u00ef(b\u00f2M&\u0094\u00d8\u000e\u0007\u00b5Qa\u001eb\u0090\u00945\u00eb\u00b5\u00d0\u00e3}~\u0099d\u00ff\u009f\u00f7\u0007\u000e\u00a6\u00f0\u00a4\u0013\u00e0\u00b8}\u0089\u00bb\u0088s(H\u00e3\u0090\u00ac\u00e1\u009f\u00abK\r\u000e\u00f1\u00f6ja\u00ae\u009c\u0012\u0006L\u00a5e\u0004,\u00c7\u00c9\u00f5V\u000e\u00b1\u00cc-\u00d5l\u00ae\u0000\u00d8\u00c8\u00e2\u0014f(@\u00ed\u00bah\u00ec\u000e \\\u00ff\u00eaij\u00fdp\u00d6\u0095\u00f2rf\u00d5\u0084\u00b3l\u0017d\u00a6\u0094\r\u00d6\u00a5n.G\u0099\u00d9\u00b9w`&\u00a6\u0010\u00f6\u00c2Y!^\u0088g\u00d5rp\u000b:R9\u00dc\u00820L\u00ea~\u00df+\u008eOpTM\u00876\u00b0.?nBi\u001c.\u0005\u0011\u00d9IXHC\u00ea\u0089\u0094;\u0094\u00e7R&jz\u001cm\u00b2\u0011\u001b.%\u00d2\u00cd\u0000\f".length();
                var5_7 = 56;
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
                    var9_3[var7_4++] = e5.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "O\u00fb)\u0013+ZT+\u00af\u0089\u0091d[:\u008d\u00c0\u00ceg\u00e1\u00b8\u00b0G\u00db\u00d4*8ha\u00c8\u00bcM\u008dS\u00cdV|m\u0015\u00ee\u00c5\u0004N\u0002\u009f\b\u0082T\u00ee\u001cC\u00ed\u00d3o\u0001R\u0097\u00e3\u00de\f\u0014=\u00cf$;\u00f2z^^\u00cbTAWeS\u00b7\u00ab' \t\u001e\u00dd\u00f8H\u00ff\u0003\u0083\u0094v\u009e\u001c\u0086\u00fa5\r\u00eb\u00c1\u0004\u0006q\u00dd\u000f\u00b4WT@\u00d7\u00a4\u00c9\u0093\u00b8p\u00edA\u0081\u0001\rbd\u0098\u0015Q\u00d8\u00938\u00ae\u008b\u0087_~\u0017\t\u00b7\u0004F\u0096\u009e`+\u00bf\u00c1\u00e8z\u00b0n[\u00876t%\u007f\u00b3\u00fd\u00a71\u00e5\u00b8\u00bc\u00ea\u0090)9\u009e\u0093r\u00e3\u00f7s\u0007\u0006";
                    var8_6 = "O\u00fb)\u0013+ZT+\u00af\u0089\u0091d[:\u008d\u00c0\u00ceg\u00e1\u00b8\u00b0G\u00db\u00d4*8ha\u00c8\u00bcM\u008dS\u00cdV|m\u0015\u00ee\u00c5\u0004N\u0002\u009f\b\u0082T\u00ee\u001cC\u00ed\u00d3o\u0001R\u0097\u00e3\u00de\f\u0014=\u00cf$;\u00f2z^^\u00cbTAWeS\u00b7\u00ab' \t\u001e\u00dd\u00f8H\u00ff\u0003\u0083\u0094v\u009e\u001c\u0086\u00fa5\r\u00eb\u00c1\u0004\u0006q\u00dd\u000f\u00b4WT@\u00d7\u00a4\u00c9\u0093\u00b8p\u00edA\u0081\u0001\rbd\u0098\u0015Q\u00d8\u00938\u00ae\u008b\u0087_~\u0017\t\u00b7\u0004F\u0096\u009e`+\u00bf\u00c1\u00e8z\u00b0n[\u00876t%\u007f\u00b3\u00fd\u00a71\u00e5\u00b8\u00bc\u00ea\u0090)9\u009e\u0093r\u00e3\u00f7s\u0007\u0006".length();
                    var5_7 = 104;
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
                    var9_3[var7_4++] = e5.a(var10_9).intern();
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
        e5.c = var9_3;
        e5.d = new String[21];
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x34BB;
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
                throw new RuntimeException("com/zelix/e5", exception);
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
            e5.d[n2] = e5.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e5.a(n, l);
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
            throw new RuntimeException("com/zelix/e5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
