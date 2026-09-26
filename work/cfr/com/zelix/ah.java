/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ge;
import com.zelix.loz;
import com.zelix.lqe;
import com.zelix.m44;
import com.zelix.prr;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ah
implements LayoutManager2,
loz {
    private Integer Y;
    private Integer H;
    private ge[] V;
    private boolean y;
    private boolean l;
    private String[] a;
    private Integer L;
    private Integer s;
    private Container O;
    private Integer J;
    private Map z;
    private boolean F;
    private Integer j;
    private Map T;
    private Map U;
    static final String k;
    private static String A;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    @Override
    public void invalidateLayout(Container container) {
        long l10 = b ^ 0x6FC9292E0030L;
        long l11 = l10 ^ 0x734308EC16C0L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("l", (Object)this, (Object)objectArray, (long)5017943582749346542L, (long)l10);
    }

    Dimension k(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l10;
        block7: {
            block8: {
                l10 = (Long)objectArray[0];
                l10 = b ^ l10;
                CallSite callSite3 = m44.a("p", (Object)m44.a("q", (Object)this, (long)8149886295699496860L, (long)l10), (long)7709309516433420007L, (long)l10);
                CallSite callSite4 = callSite2 = m44.a("p", (Object)m44.a("q", (Object)this, (long)8149886295699496860L, (long)l10), (long)7495258936825515127L, (long)l10);
                m44.a("s", (Object)callSite4, (int)(m44.a("q", (Object)callSite4, (long)8640393368107240046L, (long)l10) - (m44.a("q", (Object)callSite3, (long)8067308365798078279L, (long)l10) + m44.a("q", (Object)callSite3, (long)8067308365798078279L, (long)l10))), (long)8640393368107240046L, (long)l10);
                CallSite callSite5 = m44.a("o", (long)8280575160581379484L, (long)l10);
                CallSite callSite6 = callSite2;
                m44.a("s", (Object)callSite6, (int)(m44.a("q", (Object)callSite6, (long)7659817202250144191L, (long)l10) - (m44.a("q", (Object)callSite3, (long)8212861703819797612L, (long)l10) + m44.a("q", (Object)callSite3, (long)8049062634349825868L, (long)l10))), (long)7659817202250144191L, (long)l10);
                CallSite callSite7 = callSite5;
                try {
                    try {
                        callSite = m44.a("q", (Object)this, (long)8582747988219438990L, (long)l10);
                        if (callSite7 == null) break block7;
                        if (callSite == null) break block8;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("o", (Object)numberFormatException, (long)8514746031903509028L, (long)l10);
                    }
                    m44.a("s", (Object)callSite2, (int)Math.max((int)m44.a("q", (Object)callSite2, (long)8640393368107240046L, (long)l10), (Integer)((Object)m44.a("q", (Object)this, (long)8582747988219438990L, (long)l10))), (long)8640393368107240046L, (long)l10);
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("o", (Object)numberFormatException, (long)8514746031903509028L, (long)l10);
                }
            }
            callSite = m44.a("q", (Object)this, (long)7744744977342056281L, (long)l10);
        }
        try {
            if (callSite != null) {
                m44.a("s", (Object)callSite2, (int)Math.max((int)m44.a("q", (Object)callSite2, (long)7659817202250144191L, (long)l10), (Integer)((Object)m44.a("q", (Object)this, (long)7744744977342056281L, (long)l10))), (long)7659817202250144191L, (long)l10);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw m44.a("o", (Object)numberFormatException, (long)8514746031903509028L, (long)l10);
        }
        return callSite2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        ah.b = prr.a(8638270883883916919L, -6310570872411822903L, MethodHandles.lookup().lookupClass()).a(255193862314955L);
                        var20 = ah.b ^ 48442899291818L;
                        ah.e = new HashMap<K, V>(13);
                        m44.a("o", "YQzzCc", (long)-7378990971014695952L, (long)var20);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[54];
                        var16_4 = 0;
                        var15_5 = "\u00c8\u00c3\u00a3\u009a@SF\u00fai2H\u000b\u00e0\u0017RI8\u00c9\u0081\t\u00a0\u00ae\u00c5\u00deT\u0011W\u00cfb\u00ee\u00d8~\u008c\u00fdn\u00a6)\u00b4\u0013)Z\u00aa#\u00eb\u001a\u00c2ZWf^\u000b\u00b8\u0007\u00e0\u00af\u00d4o\u00e0\u00b8Nt\u00d6\u00caUx\u00b5\u00f2\u00d8s+\u00f1x\u0013 +\u00bd\u00cdM4s\u00bb\u00ba]\u00a2C\u00e5\u0011\u00ec7\u00b8@z\u00e3\u00cczj\u00e1\u00f9\u00b48HP;\u00ae\u00e3\u00af \u00ea\u00db\u00bc\u00e1\u00d7\u0084\u0019m\u00c2@\u00bc6\u0099\u009cQ\u00fd\u0003b$\u00c6\u00ff\u00a6\u00c2\u00a2\u009a\u00ac5\u0087\u00dd@\u00aaj\u0010\u00f4\u001e\u0007t!B^\u0083M\u00c7qlp13\u00a8\u00105\u001c\u0012V\u00f2Z\u00fa\u0016.\u0002)k\u0004Q[$\u0018\u00ea\u00fb\u00b2\u009c\u00d8\u0086\u0001u=%\u0089\u00ac\u00da\u00af.\u00c5Zr%\u00d3\u0095\u0017Q\u00e0\u0010Z\u0081\u000e\u00f2\u00a2y\u00884\u00af\u00bc5i\u00c0\u00b3{\u00c1@\u001c\u00e0RO'v Ac\u0001\u00ed\u0000\u00b7\u00c17'\u00b3\u00e5\u009fF\u00f4\u00a0\u00bc\u00a70\u00e3~\u00f9\u00ab\u00d8\u00fe\u0018Q\u00d8\u0003-{\u00ec\u00b1\u00e8I\u00c1\u000fv'\u00e8(\u0006@\u001a\u00f7Z.\u00a5\u00fcv&\u00f3I\u00f4\u0005`C\u00ca\u0010\u00f96]gFe\f\u00fd\u0010\u00c5\u00d8Fm\u0090\u00f0\u00a9 \u00c1\u00dew\u00cbmr\u0015m\u00f9i!g\u008d\u00ca\u0089c\u00f9\u00af\u00c9K\u00c7\u00a5\u00f7\u00adn\u00bb\b\u00c6\u000b\u008f\u00f9\u00f5`*f\u00a1\u00bf[\\j\u00ae\u0011\u0091}\u00eb\u00b4\u00cd5KdJW\u00a9\u00e2\u00c6\u00bc\u00e1+8]EE\u00eel\u00f7\u00ec\u00bc\u00bc\b\u00c2H\u00e26\u00b6\fm\u00ff\f\u00cc\u0089\u00b2\u0017vq\bB\u001a?\u00fb\u00c7o\u00afly\u00c6\u00895r\u00a8AY\u00a6\u001e\u00f8\u0087\u00d1+fp8\u00a8\u00de\u0005\u00c9\u00f435\u001a\u00c1\u00f3\u00f5Oj\u00afP\u00f2\u009bdM\u0018\u00e3\u00f8J\bU\u00ad\u00ff.\u00c0\u00cc_\u00f4\u00e5I(\u00ed5\u0001e\u00c1\u00dc5\u00ac\u00e2\u0010\u00a1\u00bd\u00ed\u00bfi\u00ba7\u0097\u000b\u009c\u00ba\u00a0\u0012T2\u00a6 C;\u00a7\u00a8\u0089($>,\u00d8\u00f8\u0004}\u00eb\u009f\u00915\u00d6\u00ed\u00f3\u00ae}\u000e\u00a3\u00c4\u0093\u0094\u0007&\u0095\u00c2\u0091\u0010\u00cf\u0000V\u00b35\u00a6\u00ee\u0093@\u00f0\u00ef\u0094\u0014d\u00ea\u00c4 \u0089~\u00bb\u00e1\u00d1\u0094p\u0013o1\u0004\u0011\u00b2\u00af3H\u00a6\u0000\u00c7\u00a5\u009e\u00deU\u0014[\u00c8\u00e2\u00a8\u0010\u00e7@\u00e18p\u0083\u0086T\u00a68\u00ea\u00bbU\u00e6\u00fc\u008f\u00de\u00af\f\u0089\u00eb\u00e1Zs`~\u00a6\u0089I<\u000f\u00e0\u00b2\u001b?\u0013&\u00ad.\u0019\u00aa\u001e\u0019^\u00f0\u0018\u008e\u00b3\u001a\\\u00ba\u00a0\u0097\u0093\u00c5`\u00f7J,\u009a\u0010\u0085\u0090\u009f\u00efB\u00ea\u00da0x\u009aa\u00c3Y+\u0005Z(\u00c4\u0087b\u00e1\u00d4Wl<g#u{\u00ea\u00b2.\u0098\u007f\u00fb\u00f5D\u00b7\u0000\u00a1\u008ay\u00f8\u0083\u00a5\u0089\u00fd\u0090\u00fe\u008dM\u00c1S\u00f7\u00a3\u00e6\u00a7 J\u00d42x\u0089\u00f8\u00be\u0084\"\u00c8$\u00c89\u00af\u00e3H\u0088\u0092>\u000f\u0083lk\u0087\u00ad\u001c\u00b4\u000fu\u0019\u00ebl\u0010>\u00ba\u008b\u00c9\u00e7\u009b0>\u001a\u00e6\f7\u00ec\u0005i5\u0010[Y]\u00e7\u00dd\u00b9E\u0089\u001f\u0089\u0012\u00a92-l\u0013\u00108\u0014#=eM+\u00fb\rz\u00da\u0011(\u00ec\u0081\u0085\u0010i~S\u00dc>\u0006A\u0085\u0014\u001ek\u00c2\u00f2:\u00d7\u009d\u0018a\u00dd\u009a\u00cc\u0010\u0093FU\u00f1g\u0005$\u00ef\u0099\u00bf\u00fb<\u00c5\u0014f\f\u0018\u0099i\u0010\u0093\u001d\u00cd\u0018li\u0016~6a}.1\\4)\u0010N\u00fc\u0001;}9\u00bd\u00a6\u000b\u00b7\u00b2I\u00c1\u00f8<\u007f \"\u0016p\u008b\u00d1\u00b6]\u00ff\u00d8\u0098\u00d8\u00c2@\u00b7\u00ab\u009d{\u00fd\u00a9JXl\u001f\u00a0'\u00181J[o\u00a3b 2\u00b2[\u0006\u00e9.\u0011\u00ea]$-\u00ab\u00fb\t\u00aa\u0000%\u00f8?\u000b\u00ee\u00e1\u000e\u00b6\u00e7U\u0011\u00b6\u0086\u00e7\u008c\u00bc \u00a7Q\u00b7\u00f1\u0081=\u0018=n\u00d1lw\u00c9\u0010\u008d\u00e9;\u000e\u00b2\u0083\u00f8\u009d\u0010W\u00a1'\u008b\u0082\u00ed\u0083.\u00df\u0010\u00fc\u0018\u00b3\u0006\u0084#\u00bd{\u00b8\u009bZ\u001a\u0080\u00ec\u0081r \u0093\u0085\u0095\u00c0\u00178\u00ae\u0014V\u00fd\u0084\u008f\u00f0%9\u00ce\u0089\u00f9-\u00ccR\u0088\u00a0\u00a0\u0090\u008fj\u0016\u0090nI\u00ea8\u00e6Csrq\u008d\u00e0\u00fcS\u009a\u00de\u00e3\u00ae\u00f8\u00bd\u00c9t\u00e6@\u0089\u00dem\u008f\u00e9\u00c0\u00d3\u00f7\u0006J\u009ece\u00b1\u0083'\u00b3\u00f9\u001f\u00c2h{\u0082\u0002N\u00ecZ\u0093K\fU\u009e\u00c0\u00a1\u00ed\u00e3\u00c5\u0010\u00f9N\u0013\u00e4\u00f5M]*\u00c1\u00f2\u00fd1\u0001b\u00b7)\u0018\n\u0005\u0090-\u00b7?\u00f2\u001a\u00dc\u00bcs\u00b0k\u00bf\u0013\"\u009e\u00ed\u0089\u008d\u00cf\u00f0\u001e\u00aaPD\u009f\u00d8\u00d1\u008a\u00a8\u0016 (\u00a8\u00c5\u0017\u00eb}QaT\u00e2\u00f5\u008a\u001b\u00f0\u00e5'\u00daND/\u001eM\u001cC\u00cc4\u0001\u00bdf\u00c5\u00a0\u00cbO\u00bd\u00c0\u00a8XQ\u00ae9\u0099=\"\u00b9\u00b7O\u00fa\u00913\u008d\u00c6$\u00e0\n\u00d80a\u00f7\u00d6\u00daLfH\u00e41\u007f\u0092\u00e1\u00e0\u00c7n5 \u00801l\u0087+\bm\u00e8\u00ee\u00f2\u0013\u000b\u0085\u0098\u00fb\u00bd\u00e5\u00134\u00add\u009d\u00a4\u009fU\u00f6D\u0002\u00e8\u00f1S^@&\u00c9c\u00ea\u00bb\u00ba\u00b3\u00f2\u00ca\u0017\u00bd\u00d2\u001e\u00bb\u0082\u00d7\u001e\u0010&\u001f\u00a0\u00e0</\u00b90o^\u00feC\u00a9\u0006\u00f2\u007f\u00a4\u00d3\u00e2\u00fc+\fD\u00fb\u00ca\u008f\"\u00d1\u0084\u0080\u00b5\u00fb\u001f\u00cd\f\u0084\u0001\u00acn\u0080\u00a8\u00adN\u001c\u00f4\u0086\u0010A;\u001d\u00d6\u00fd\u00c2p\u00ec\u00d7C\u00de\u009b3da\u00f1\u0010\u00ff/\u00d0c\u0085\u00bc\u00dc'\u001f\u0005\u00ab\u00c8d,\u0019\u0002 z\u00dd\u0019`\u0015e,b\u00ada\u009c\u00c9\u001f/|\u00e6\u008e\u00ef\u00b9\u00c0\u00b78\u00fb0\u00c5\u00ca\u0018'<\u000b)\u00a9\u0010,\u00fcO\u0082 \u00dax\u00ed\u00ebw\u0017M\u00f5z\u00f7\u00c9HlcJ>\u001a\u00a2\u00ff\u0014\u00e3ma\u00f9\u00ddK\u0088+\u00aaQ\u00ae\u0011\u001f+\u00b2\u008f\u00a7L\u00e3\u0012\u00060\u00ad7\u00e1,\u0016\u00e1\u008a0~j\u00e8e+`\u00aa\u00e2\u00e2s\u00b1\u00a6w\u00a0m*\u00f0\u00f8?rf\u00bfw\u0013B\u009a\u0094\u00f4\u00cc\u0080\u00b2}\u00b0\u00c7 \u0099\u00f1sI\u000f\u00b7\"\u00b7\u00a6e\u00df\u00e7\u00ccU/\t?\u0001\u00ac\u00e4\u0090Yx\u0083\u0082YS\u008c'\u00c8\u00c3\u00d7 \u0099\u00b4\u001f\u00dd\u00b0\u00f4\u009e\u00c5MW\f\f\u0081\u00c6\u00a0\u00cd\r\u000bT\u00dd\u007f\u0094\u00d9\u0096fF\u00dfB\u00ee\u00d2\u008c\u00d6\u0010\u00e4\u00f6\u00b4\u0005\u0013\u00ff\u00cd@lcW\u00ear\u0006\u00d4#\u0010@8\u008b\f\u00ac'p\u00e4\u00cf\u00f0\u00df~W\u00bf\u00ccO \u0002\u0017\u008dk~\u008ae>u\u00da{*\u0007tC\u0018\u00ac+^\b\u00f0g\u00f2\u00c8\u00e7q\u0096,\u00cd\u00e5\u00cdy0p\u00f7PtG\u008c\u00c2C\f\u00ad\u00a0\u008e\u00fd\u00a1\u00d09q\u000e\u0007j\u00b8\u0098\u00f5w\u00f1\u001d\u00a1\\\u00a9\u00dd\f\u0003\u009f\u00f5\u00e6\u00c4Q}\u00d2\u0004\u0088\u0002\u00f2\u00c5Y\u00d51\u0018x`\u0006W\u009f\u00b6g\u00aa\u000e\u00af\u008aSY\b!%y\u00b8\u0000\u00ed\u0098\u00d5\u00d2\u0097!\u00db\u00bc\u00be\u0097\u00c2\u0095\u00a2\u00b9\u0006\u0091\u00a9_\u0094\u00d9C\u00f7|\u00d3\u0099\b\u0015\u00c1\u00c5\u008d8z\u00a3o\u00c7\\2\u0087\u00b4\u00c6\u0007\u00c1'\u0093\u0018-N\u00c3L(\u00e6\u0007\u0080\u00fa)\u00ca\u00a3\u00b2\u00fa\u00af\u00f1\u00fd\u00f4\u00e7\u00d2&\u000b\u009d\u00045\u00e7\u00bb\u009d\u00a6\f\u009e\u00c1M\u008b\u0096Y\u00c1\u00b4K\u00b2L\u00f2Ym\u00a1\u00b8L\u00d9Z\u0083\u00ce\r\u00c0\u0086\u00e6\u0014\u00e3(\u00b4\u00e0\u00f1\u00ae\\\u00b6\u00a61\u00c3Nq\u00aa\u00f4\u00f0\u00f1\u00e2\u009b4\u000b\u00cc\u00cf\u00e9\u00132\u00b9\u0007u\u00c0\\2\u00c5\u000b~\u00c6\u00c7?\u000fB\u00c18";
                        var17_6 = "\u00c8\u00c3\u00a3\u009a@SF\u00fai2H\u000b\u00e0\u0017RI8\u00c9\u0081\t\u00a0\u00ae\u00c5\u00deT\u0011W\u00cfb\u00ee\u00d8~\u008c\u00fdn\u00a6)\u00b4\u0013)Z\u00aa#\u00eb\u001a\u00c2ZWf^\u000b\u00b8\u0007\u00e0\u00af\u00d4o\u00e0\u00b8Nt\u00d6\u00caUx\u00b5\u00f2\u00d8s+\u00f1x\u0013 +\u00bd\u00cdM4s\u00bb\u00ba]\u00a2C\u00e5\u0011\u00ec7\u00b8@z\u00e3\u00cczj\u00e1\u00f9\u00b48HP;\u00ae\u00e3\u00af \u00ea\u00db\u00bc\u00e1\u00d7\u0084\u0019m\u00c2@\u00bc6\u0099\u009cQ\u00fd\u0003b$\u00c6\u00ff\u00a6\u00c2\u00a2\u009a\u00ac5\u0087\u00dd@\u00aaj\u0010\u00f4\u001e\u0007t!B^\u0083M\u00c7qlp13\u00a8\u00105\u001c\u0012V\u00f2Z\u00fa\u0016.\u0002)k\u0004Q[$\u0018\u00ea\u00fb\u00b2\u009c\u00d8\u0086\u0001u=%\u0089\u00ac\u00da\u00af.\u00c5Zr%\u00d3\u0095\u0017Q\u00e0\u0010Z\u0081\u000e\u00f2\u00a2y\u00884\u00af\u00bc5i\u00c0\u00b3{\u00c1@\u001c\u00e0RO'v Ac\u0001\u00ed\u0000\u00b7\u00c17'\u00b3\u00e5\u009fF\u00f4\u00a0\u00bc\u00a70\u00e3~\u00f9\u00ab\u00d8\u00fe\u0018Q\u00d8\u0003-{\u00ec\u00b1\u00e8I\u00c1\u000fv'\u00e8(\u0006@\u001a\u00f7Z.\u00a5\u00fcv&\u00f3I\u00f4\u0005`C\u00ca\u0010\u00f96]gFe\f\u00fd\u0010\u00c5\u00d8Fm\u0090\u00f0\u00a9 \u00c1\u00dew\u00cbmr\u0015m\u00f9i!g\u008d\u00ca\u0089c\u00f9\u00af\u00c9K\u00c7\u00a5\u00f7\u00adn\u00bb\b\u00c6\u000b\u008f\u00f9\u00f5`*f\u00a1\u00bf[\\j\u00ae\u0011\u0091}\u00eb\u00b4\u00cd5KdJW\u00a9\u00e2\u00c6\u00bc\u00e1+8]EE\u00eel\u00f7\u00ec\u00bc\u00bc\b\u00c2H\u00e26\u00b6\fm\u00ff\f\u00cc\u0089\u00b2\u0017vq\bB\u001a?\u00fb\u00c7o\u00afly\u00c6\u00895r\u00a8AY\u00a6\u001e\u00f8\u0087\u00d1+fp8\u00a8\u00de\u0005\u00c9\u00f435\u001a\u00c1\u00f3\u00f5Oj\u00afP\u00f2\u009bdM\u0018\u00e3\u00f8J\bU\u00ad\u00ff.\u00c0\u00cc_\u00f4\u00e5I(\u00ed5\u0001e\u00c1\u00dc5\u00ac\u00e2\u0010\u00a1\u00bd\u00ed\u00bfi\u00ba7\u0097\u000b\u009c\u00ba\u00a0\u0012T2\u00a6 C;\u00a7\u00a8\u0089($>,\u00d8\u00f8\u0004}\u00eb\u009f\u00915\u00d6\u00ed\u00f3\u00ae}\u000e\u00a3\u00c4\u0093\u0094\u0007&\u0095\u00c2\u0091\u0010\u00cf\u0000V\u00b35\u00a6\u00ee\u0093@\u00f0\u00ef\u0094\u0014d\u00ea\u00c4 \u0089~\u00bb\u00e1\u00d1\u0094p\u0013o1\u0004\u0011\u00b2\u00af3H\u00a6\u0000\u00c7\u00a5\u009e\u00deU\u0014[\u00c8\u00e2\u00a8\u0010\u00e7@\u00e18p\u0083\u0086T\u00a68\u00ea\u00bbU\u00e6\u00fc\u008f\u00de\u00af\f\u0089\u00eb\u00e1Zs`~\u00a6\u0089I<\u000f\u00e0\u00b2\u001b?\u0013&\u00ad.\u0019\u00aa\u001e\u0019^\u00f0\u0018\u008e\u00b3\u001a\\\u00ba\u00a0\u0097\u0093\u00c5`\u00f7J,\u009a\u0010\u0085\u0090\u009f\u00efB\u00ea\u00da0x\u009aa\u00c3Y+\u0005Z(\u00c4\u0087b\u00e1\u00d4Wl<g#u{\u00ea\u00b2.\u0098\u007f\u00fb\u00f5D\u00b7\u0000\u00a1\u008ay\u00f8\u0083\u00a5\u0089\u00fd\u0090\u00fe\u008dM\u00c1S\u00f7\u00a3\u00e6\u00a7 J\u00d42x\u0089\u00f8\u00be\u0084\"\u00c8$\u00c89\u00af\u00e3H\u0088\u0092>\u000f\u0083lk\u0087\u00ad\u001c\u00b4\u000fu\u0019\u00ebl\u0010>\u00ba\u008b\u00c9\u00e7\u009b0>\u001a\u00e6\f7\u00ec\u0005i5\u0010[Y]\u00e7\u00dd\u00b9E\u0089\u001f\u0089\u0012\u00a92-l\u0013\u00108\u0014#=eM+\u00fb\rz\u00da\u0011(\u00ec\u0081\u0085\u0010i~S\u00dc>\u0006A\u0085\u0014\u001ek\u00c2\u00f2:\u00d7\u009d\u0018a\u00dd\u009a\u00cc\u0010\u0093FU\u00f1g\u0005$\u00ef\u0099\u00bf\u00fb<\u00c5\u0014f\f\u0018\u0099i\u0010\u0093\u001d\u00cd\u0018li\u0016~6a}.1\\4)\u0010N\u00fc\u0001;}9\u00bd\u00a6\u000b\u00b7\u00b2I\u00c1\u00f8<\u007f \"\u0016p\u008b\u00d1\u00b6]\u00ff\u00d8\u0098\u00d8\u00c2@\u00b7\u00ab\u009d{\u00fd\u00a9JXl\u001f\u00a0'\u00181J[o\u00a3b 2\u00b2[\u0006\u00e9.\u0011\u00ea]$-\u00ab\u00fb\t\u00aa\u0000%\u00f8?\u000b\u00ee\u00e1\u000e\u00b6\u00e7U\u0011\u00b6\u0086\u00e7\u008c\u00bc \u00a7Q\u00b7\u00f1\u0081=\u0018=n\u00d1lw\u00c9\u0010\u008d\u00e9;\u000e\u00b2\u0083\u00f8\u009d\u0010W\u00a1'\u008b\u0082\u00ed\u0083.\u00df\u0010\u00fc\u0018\u00b3\u0006\u0084#\u00bd{\u00b8\u009bZ\u001a\u0080\u00ec\u0081r \u0093\u0085\u0095\u00c0\u00178\u00ae\u0014V\u00fd\u0084\u008f\u00f0%9\u00ce\u0089\u00f9-\u00ccR\u0088\u00a0\u00a0\u0090\u008fj\u0016\u0090nI\u00ea8\u00e6Csrq\u008d\u00e0\u00fcS\u009a\u00de\u00e3\u00ae\u00f8\u00bd\u00c9t\u00e6@\u0089\u00dem\u008f\u00e9\u00c0\u00d3\u00f7\u0006J\u009ece\u00b1\u0083'\u00b3\u00f9\u001f\u00c2h{\u0082\u0002N\u00ecZ\u0093K\fU\u009e\u00c0\u00a1\u00ed\u00e3\u00c5\u0010\u00f9N\u0013\u00e4\u00f5M]*\u00c1\u00f2\u00fd1\u0001b\u00b7)\u0018\n\u0005\u0090-\u00b7?\u00f2\u001a\u00dc\u00bcs\u00b0k\u00bf\u0013\"\u009e\u00ed\u0089\u008d\u00cf\u00f0\u001e\u00aaPD\u009f\u00d8\u00d1\u008a\u00a8\u0016 (\u00a8\u00c5\u0017\u00eb}QaT\u00e2\u00f5\u008a\u001b\u00f0\u00e5'\u00daND/\u001eM\u001cC\u00cc4\u0001\u00bdf\u00c5\u00a0\u00cbO\u00bd\u00c0\u00a8XQ\u00ae9\u0099=\"\u00b9\u00b7O\u00fa\u00913\u008d\u00c6$\u00e0\n\u00d80a\u00f7\u00d6\u00daLfH\u00e41\u007f\u0092\u00e1\u00e0\u00c7n5 \u00801l\u0087+\bm\u00e8\u00ee\u00f2\u0013\u000b\u0085\u0098\u00fb\u00bd\u00e5\u00134\u00add\u009d\u00a4\u009fU\u00f6D\u0002\u00e8\u00f1S^@&\u00c9c\u00ea\u00bb\u00ba\u00b3\u00f2\u00ca\u0017\u00bd\u00d2\u001e\u00bb\u0082\u00d7\u001e\u0010&\u001f\u00a0\u00e0</\u00b90o^\u00feC\u00a9\u0006\u00f2\u007f\u00a4\u00d3\u00e2\u00fc+\fD\u00fb\u00ca\u008f\"\u00d1\u0084\u0080\u00b5\u00fb\u001f\u00cd\f\u0084\u0001\u00acn\u0080\u00a8\u00adN\u001c\u00f4\u0086\u0010A;\u001d\u00d6\u00fd\u00c2p\u00ec\u00d7C\u00de\u009b3da\u00f1\u0010\u00ff/\u00d0c\u0085\u00bc\u00dc'\u001f\u0005\u00ab\u00c8d,\u0019\u0002 z\u00dd\u0019`\u0015e,b\u00ada\u009c\u00c9\u001f/|\u00e6\u008e\u00ef\u00b9\u00c0\u00b78\u00fb0\u00c5\u00ca\u0018'<\u000b)\u00a9\u0010,\u00fcO\u0082 \u00dax\u00ed\u00ebw\u0017M\u00f5z\u00f7\u00c9HlcJ>\u001a\u00a2\u00ff\u0014\u00e3ma\u00f9\u00ddK\u0088+\u00aaQ\u00ae\u0011\u001f+\u00b2\u008f\u00a7L\u00e3\u0012\u00060\u00ad7\u00e1,\u0016\u00e1\u008a0~j\u00e8e+`\u00aa\u00e2\u00e2s\u00b1\u00a6w\u00a0m*\u00f0\u00f8?rf\u00bfw\u0013B\u009a\u0094\u00f4\u00cc\u0080\u00b2}\u00b0\u00c7 \u0099\u00f1sI\u000f\u00b7\"\u00b7\u00a6e\u00df\u00e7\u00ccU/\t?\u0001\u00ac\u00e4\u0090Yx\u0083\u0082YS\u008c'\u00c8\u00c3\u00d7 \u0099\u00b4\u001f\u00dd\u00b0\u00f4\u009e\u00c5MW\f\f\u0081\u00c6\u00a0\u00cd\r\u000bT\u00dd\u007f\u0094\u00d9\u0096fF\u00dfB\u00ee\u00d2\u008c\u00d6\u0010\u00e4\u00f6\u00b4\u0005\u0013\u00ff\u00cd@lcW\u00ear\u0006\u00d4#\u0010@8\u008b\f\u00ac'p\u00e4\u00cf\u00f0\u00df~W\u00bf\u00ccO \u0002\u0017\u008dk~\u008ae>u\u00da{*\u0007tC\u0018\u00ac+^\b\u00f0g\u00f2\u00c8\u00e7q\u0096,\u00cd\u00e5\u00cdy0p\u00f7PtG\u008c\u00c2C\f\u00ad\u00a0\u008e\u00fd\u00a1\u00d09q\u000e\u0007j\u00b8\u0098\u00f5w\u00f1\u001d\u00a1\\\u00a9\u00dd\f\u0003\u009f\u00f5\u00e6\u00c4Q}\u00d2\u0004\u0088\u0002\u00f2\u00c5Y\u00d51\u0018x`\u0006W\u009f\u00b6g\u00aa\u000e\u00af\u008aSY\b!%y\u00b8\u0000\u00ed\u0098\u00d5\u00d2\u0097!\u00db\u00bc\u00be\u0097\u00c2\u0095\u00a2\u00b9\u0006\u0091\u00a9_\u0094\u00d9C\u00f7|\u00d3\u0099\b\u0015\u00c1\u00c5\u008d8z\u00a3o\u00c7\\2\u0087\u00b4\u00c6\u0007\u00c1'\u0093\u0018-N\u00c3L(\u00e6\u0007\u0080\u00fa)\u00ca\u00a3\u00b2\u00fa\u00af\u00f1\u00fd\u00f4\u00e7\u00d2&\u000b\u009d\u00045\u00e7\u00bb\u009d\u00a6\f\u009e\u00c1M\u008b\u0096Y\u00c1\u00b4K\u00b2L\u00f2Ym\u00a1\u00b8L\u00d9Z\u0083\u00ce\r\u00c0\u0086\u00e6\u0014\u00e3(\u00b4\u00e0\u00f1\u00ae\\\u00b6\u00a61\u00c3Nq\u00aa\u00f4\u00f0\u00f1\u00e2\u009b4\u000b\u00cc\u00cf\u00e9\u00132\u00b9\u0007u\u00c0\\2\u00c5\u000b~\u00c6\u00c7?\u000fB\u00c18".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = ah.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "rCp`\u00c8\u0093\u001bq\u00a7\u00df\u00a8\u00dc\u00e7\u00e6\u0004\"\u0018\u0098x\u001ee\u00f6a\u00b7Q,\u0013\u00d1*X\u0090\u00cd:\u0098\u00f2W\u00e5\u00a7\u0091f\u0003";
                            var17_6 = "rCp`\u00c8\u0093\u001bq\u00a7\u00df\u00a8\u00dc\u00e7\u00e6\u0004\"\u0018\u0098x\u001ee\u00f6a\u00b7Q,\u0013\u00d1*X\u0090\u00cd:\u0098\u00f2W\u00e5\u00a7\u0091f\u0003".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = ah.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                ah.c = var18_3;
                ah.d = new String[54];
                ah.h = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[8];
                var3_13 = 0;
                var4_14 = "\u00d6\u00d8u\u00fa\u00d1\u0087\u0095;\u00c0\u0095\u0098\u00bcu|\u000b2\u00c7\u0081\u00e6,\u00d5\u00af\u00ab\u00ce\u00ae)\u0087\u0086\u00ae\u00c8a\u001d\u00e6em\u000e\u00f8WE\u00b13\u00e6j-\u00e8/\u00df\u008b";
                var5_15 = "\u00d6\u00d8u\u00fa\u00d1\u0087\u0095;\u00c0\u0095\u0098\u00bcu|\u000b2\u00c7\u0081\u00e6,\u00d5\u00af\u00ab\u00ce\u00ae)\u0087\u0086\u00ae\u00c8a\u001d\u00e6em\u000e\u00f8WE\u00b13\u00e6j-\u00e8/\u00df\u008b".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl79:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "7\u008b\u0099\u0092J\u00a6W\"\u00b9\u0085=\u00e3\u00ae)\u00c5\u00c4";
                    var5_15 = "7\u008b\u0099\u0092J\u00a6W\"\u00b9\u0085=\u00e3\u00ae)\u00c5\u00c4".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl92:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl105:
                // 1 sources

                ** continue;
            }
        }
        ah.f = var6_12;
        ah.g = new Integer[8];
        ah.k = m44.a("k", (long)-8856506153067819470L, (long)var20);
    }

    /*
     * Exception decompiling
     */
    static String S(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    ge l(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = b ^ l10;
        return (ge)m44.a("v", (Object)this, (long)2220145604981103801L, (long)l10).get(string);
    }

    private void I(Object[] objectArray) {
        block6: {
            long l10 = (Long)objectArray[0];
            long l11 = (l10 = b ^ l10) ^ 0xD53D0CCF549L;
            Iterator iterator = m44.a("q", (Object)this, (long)1957530333695589124L, (long)l10).values().iterator();
            CallSite callSite = m44.a("o", (long)66130456458504092L, (long)l10);
            block2: while (iterator.hasNext()) {
                lqe lqe2 = (lqe)iterator.next();
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l11;
                    m44.a("p", (Object)lqe2, (Object)objectArray2, (long)28891621596797085L, (long)l10);
                    do {
                        CallSite callSite2 = callSite;
                        if (l10 >= 0L) {
                            if (callSite2 == null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 != null) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("o", (Object)numberFormatException, (long)300059024788682788L, (long)l10);
                }
            }
            m44.a("s", (Object)this, (boolean)false, (long)206012106759803266L, (long)l10);
        }
    }

    /*
     * Exception decompiling
     */
    int q(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    @Override
    public float getLayoutAlignmentY(Container container) {
        return 0.5f;
    }

    @Override
    public Dimension maximumLayoutSize(Container container) {
        long l10 = b ^ 0x4D677762E5AFL;
        Dimension dimension = new Dimension((int)ah.b("r", (int)8877, (long)(0x3F87AA20B78C599EL ^ l10)), (int)ah.b("r", (int)11048, (long)(0x5976D0992207D01EL ^ l10)));
        return dimension;
    }

    private String h(Object[] objectArray) {
        block16: {
            String string;
            block17: {
                boolean bl2;
                int n10;
                CallSite callSite;
                String string2;
                long l10;
                block14: {
                    l10 = (Long)objectArray[0];
                    string2 = (String)objectArray[1];
                    String string3 = (String)objectArray[2];
                    l10 = b ^ l10;
                    callSite = m44.a("j", (long)-826432502320147471L, (long)l10);
                    try {
                        n10 = Integer.parseInt(string3);
                    }
                    catch (NumberFormatException numberFormatException) {
                        return (String)((Object)ah.a("n", (int)5359, (long)(0x629862C936243C09L ^ l10))) + string2 + "'";
                    }
                    try {
                        try {
                            block15: {
                                try {
                                    try {
                                        bl2 = string2.equals(ah.a("n", (int)20369, (long)(0x39281F9789296766L ^ l10)));
                                        if (l10 < 0L || callSite == null) break block14;
                                        if (!bl2) break block15;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw m44.a("j", (Object)numberFormatException, (long)-1132906682893464503L, (long)l10);
                                    }
                                    m44.a("v", (Object)this, (Integer)n10, (long)-1602295479564443674L, (long)l10);
                                    if (callSite != null) break block16;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw m44.a("j", (Object)numberFormatException, (long)-1132906682893464503L, (long)l10);
                                }
                            }
                            string = string2;
                            if (callSite == null) break block17;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw m44.a("j", (Object)numberFormatException, (long)-1132906682893464503L, (long)l10);
                        }
                        bl2 = string.equals(ah.a("n", (int)17835, (long)(0x1317093612556D5AL ^ l10)));
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("j", (Object)numberFormatException, (long)-1132906682893464503L, (long)l10);
                    }
                }
                try {
                    block18: {
                        try {
                            if (!bl2) break block18;
                            m44.a("v", (Object)this, (Integer)n10, (long)-1457210752049411772L, (long)l10);
                            if (callSite != null) break block16;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw m44.a("j", (Object)numberFormatException, (long)-1132906682893464503L, (long)l10);
                        }
                    }
                    string = (String)((Object)ah.a("n", (int)28964, (long)(0x27C62605DBDB59E5L ^ l10))) + string2 + (String)((Object)ah.a("n", (int)21219, (long)(0x381FFF9558497A00L ^ l10))) + (String)((Object)ah.a("n", (int)16650, (long)(0x189531B0BC9669D1L ^ l10))) + (String)((Object)ah.a("n", (int)4418, (long)(0x5927B72F6F7AB9A9L ^ l10)));
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("j", (Object)numberFormatException, (long)-1132906682893464503L, (long)l10);
                }
            }
            return string;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private void A(Object[] var1_1) {
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

    public static String L() {
        return A;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @Override
    public void addLayoutComponent(String string, Component component) {
        long l10;
        long l11 = l10 = b ^ 0x5F74712652CDL;
        long l12 = l11 ^ 0x6A53744039E7L;
        long l13 = l11 ^ 0xCC3F20252EBL;
        CallSite callSite = m44.a("w", (Object)component, (long)1494934896794930923L, (long)l10);
        synchronized (callSite) {
            block7: {
                Object object;
                block8: {
                    CallSite callSite2 = m44.a("h", (long)1260307040448165387L, (long)l10);
                    Component component2 = m44.a("v", (Object)this, (long)1567402722410960297L, (long)l10).put(string, component);
                    object = component2;
                    if (callSite2 == null) break block7;
                    try {
                        block9: {
                            if (object == null) break block8;
                            break block9;
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("h", (Object)numberFormatException, (long)1566537748120136115L, (long)l10);
                            }
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l12;
                        objectArray[0] = (String)((Object)ah.a("n", (int)31931, (long)(0x64F372FCC60731A5L ^ l10))) + string + (String)((Object)ah.a("n", (int)8128, (long)(0x6A440FCA5A6ED2F1L ^ l10))) + component2 + (String)((Object)ah.a("n", (int)30618, (long)(0x272B858A5665BAAFL ^ l10))) + component;
                        m44.a("w", (Object)this, (Object)objectArray, (long)1668407247878482645L, (long)l10);
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("h", (Object)numberFormatException, (long)1566537748120136115L, (long)l10);
                    }
                }
                m44.a("v", (Object)this, (long)774048112542427795L, (long)l10).put(component, new lqe(string, component, this, l13));
                object = callSite;
            }
            // ** MonitorExit[v1] (shouldn't be in output)
            return;
        }
    }

    public void w(Object[] objectArray) {
        block6: {
            String string = (String)objectArray[0];
            long l10 = (Long)objectArray[1];
            long l11 = (l10 = b ^ l10) ^ 0x267187D00A3EL;
            StringTokenizer stringTokenizer = new StringTokenizer(string, ";");
            String[] stringArray = new String[stringTokenizer.countTokens()];
            CallSite callSite = m44.a("h", (long)-2966268909142740573L, (long)l10);
            int n10 = 0;
            block2: while (n10 < stringArray.length) {
                try {
                    stringArray[n10] = stringTokenizer.nextToken().trim();
                    ++n10;
                    do {
                        CallSite callSite2 = callSite;
                        if (l10 > 0L) {
                            if (callSite2 == null) break block6;
                            callSite2 = callSite;
                        }
                        if (callSite2 != null) continue block2;
                    } while (l10 < 0L);
                    break;
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("h", (Object)numberFormatException, (long)-3308661935236174309L, (long)l10);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l11;
            objectArray2[0] = stringArray;
            m44.a("w", (Object)this, (Object)objectArray2, (long)-2997815505089510821L, (long)l10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Dimension preferredLayoutSize(Container container) {
        long l10;
        long l11 = l10 = b ^ 0x5FAB94B28110L;
        long l12 = l11 ^ 0x324DFB54837BL;
        long l13 = l11 ^ 0xD4C3E5608D8L;
        CallSite callSite = m44.a("r", (Object)container, (long)-4590152307235227990L, (long)l10);
        synchronized (callSite) {
            Object[] objectArray = new Object[1];
            objectArray[0] = l12;
            m44.a("l", (Object)this, (Object)objectArray, (long)-2834752271142558839L, (long)l10);
            Object[] objectArray2 = new Object[4];
            objectArray2[3] = l13;
            objectArray2[2] = m44.a("s", (Object)this, (long)-4154353558279475173L, (long)l10);
            objectArray2[1] = m44.a("s", (Object)this, (long)-4430999497987144377L, (long)l10);
            objectArray2[0] = container;
            CallSite callSite2 = m44.a("r", (Object)this, (Object)objectArray2, (long)-2318088326488054391L, (long)l10);
            return callSite2;
        }
    }

    public static void k(String string) {
        A = string;
    }

    /*
     * Exception decompiling
     */
    private void o(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [23[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static int p(Object[] var0) {
        block80: {
            block81: {
                block78: {
                    block79: {
                        block76: {
                            block77: {
                                block74: {
                                    block75: {
                                        block72: {
                                            block73: {
                                                block70: {
                                                    block71: {
                                                        block68: {
                                                            block69: {
                                                                block66: {
                                                                    block67: {
                                                                        block64: {
                                                                            block65: {
                                                                                block62: {
                                                                                    block63: {
                                                                                        block60: {
                                                                                            block61: {
                                                                                                block58: {
                                                                                                    block59: {
                                                                                                        var2_1 = (Long)var0[0];
                                                                                                        var1_2 = (String)var0[1];
                                                                                                        var2_1 = ah.b ^ var2_1;
                                                                                                        var4_3 = m44.a("n", (long)8053541226259040437L, (long)var2_1);
                                                                                                        try {
                                                                                                            try {
                                                                                                                v0 = var1_2.equals(ah.a("n", (int)751, (long)(3716463070849511755L ^ var2_1)));
                                                                                                                if (var4_3 == null) break block58;
                                                                                                                if (v0 == 0) break block59;
                                                                                                            }
                                                                                                            catch (NumberFormatException v1) {
                                                                                                                throw m44.a("n", (Object)v1, (long)7711035884484990733L, (long)var2_1);
                                                                                                            }
                                                                                                            return 0;
                                                                                                        }
                                                                                                        catch (NumberFormatException v2) {
                                                                                                            throw m44.a("n", (Object)v2, (long)7711035884484990733L, (long)var2_1);
                                                                                                        }
                                                                                                    }
                                                                                                    v0 = var1_2.equals(ah.a("n", (int)21698, (long)(310789055624963923L ^ var2_1)));
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        v3 = var4_3;
                                                                                                        if (var2_1 > 0L) {
                                                                                                            if (v3 == null) break block60;
                                                                                                            if (v0 == 0) break block61;
                                                                                                        }
                                                                                                        ** GOTO lbl39
                                                                                                    }
                                                                                                    catch (NumberFormatException v4) {
                                                                                                        throw m44.a("n", (Object)v4, (long)7711035884484990733L, (long)var2_1);
                                                                                                    }
                                                                                                    return 1;
                                                                                                }
                                                                                                catch (NumberFormatException v5) {
                                                                                                    throw m44.a("n", (Object)v5, (long)7711035884484990733L, (long)var2_1);
                                                                                                }
                                                                                            }
                                                                                            v0 = var1_2.equals(ah.a("n", (int)6434, (long)(4241766659089672868L ^ var2_1)));
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                v3 = var4_3;
lbl39:
                                                                                                // 2 sources

                                                                                                if (var2_1 >= 0L) {
                                                                                                    if (v3 == null) break block62;
                                                                                                    if (v0 == 0) break block63;
                                                                                                }
                                                                                                ** GOTO lbl55
                                                                                            }
                                                                                            catch (NumberFormatException v6) {
                                                                                                throw m44.a("n", (Object)v6, (long)7711035884484990733L, (long)var2_1);
                                                                                            }
                                                                                            return 2;
                                                                                        }
                                                                                        catch (NumberFormatException v7) {
                                                                                            throw m44.a("n", (Object)v7, (long)7711035884484990733L, (long)var2_1);
                                                                                        }
                                                                                    }
                                                                                    v0 = var1_2.equals(ah.a("n", (int)26159, (long)(693674940213810619L ^ var2_1)));
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        v3 = var4_3;
lbl55:
                                                                                        // 2 sources

                                                                                        if (var2_1 > 0L) {
                                                                                            if (v3 == null) break block64;
                                                                                            if (v0 == 0) break block65;
                                                                                        }
                                                                                        ** GOTO lbl71
                                                                                    }
                                                                                    catch (NumberFormatException v8) {
                                                                                        throw m44.a("n", (Object)v8, (long)7711035884484990733L, (long)var2_1);
                                                                                    }
                                                                                    return 4;
                                                                                }
                                                                                catch (NumberFormatException v9) {
                                                                                    throw m44.a("n", (Object)v9, (long)7711035884484990733L, (long)var2_1);
                                                                                }
                                                                            }
                                                                            v0 = var1_2.equals(ah.a("n", (int)31301, (long)(2833604480903727557L ^ var2_1)));
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v3 = var4_3;
lbl71:
                                                                                // 2 sources

                                                                                if (var2_1 >= 0L) {
                                                                                    if (v3 == null) break block66;
                                                                                    if (v0 == 0) break block67;
                                                                                }
                                                                                ** GOTO lbl87
                                                                            }
                                                                            catch (NumberFormatException v10) {
                                                                                throw m44.a("n", (Object)v10, (long)7711035884484990733L, (long)var2_1);
                                                                            }
                                                                            return 3;
                                                                        }
                                                                        catch (NumberFormatException v11) {
                                                                            throw m44.a("n", (Object)v11, (long)7711035884484990733L, (long)var2_1);
                                                                        }
                                                                    }
                                                                    v0 = var1_2.equals(ah.a("n", (int)24619, (long)(3085891582515827609L ^ var2_1)));
                                                                }
                                                                try {
                                                                    try {
                                                                        v3 = var4_3;
lbl87:
                                                                        // 2 sources

                                                                        if (var2_1 >= 0L) {
                                                                            if (v3 == null) break block68;
                                                                            if (v0 == 0) break block69;
                                                                        }
                                                                        ** GOTO lbl103
                                                                    }
                                                                    catch (NumberFormatException v12) {
                                                                        throw m44.a("n", (Object)v12, (long)7711035884484990733L, (long)var2_1);
                                                                    }
                                                                    return 5;
                                                                }
                                                                catch (NumberFormatException v13) {
                                                                    throw m44.a("n", (Object)v13, (long)7711035884484990733L, (long)var2_1);
                                                                }
                                                            }
                                                            v0 = var1_2.equals(ah.a("n", (int)15646, (long)(2497069287788809856L ^ var2_1)));
                                                        }
                                                        try {
                                                            try {
                                                                v3 = var4_3;
lbl103:
                                                                // 2 sources

                                                                if (var2_1 >= 0L) {
                                                                    if (v3 == null) break block70;
                                                                    if (v0 == 0) break block71;
                                                                }
                                                                ** GOTO lbl119
                                                            }
                                                            catch (NumberFormatException v14) {
                                                                throw m44.a("n", (Object)v14, (long)7711035884484990733L, (long)var2_1);
                                                            }
                                                            return (int)ah.b("r", (int)29856, (long)(228050152879474254L ^ var2_1));
                                                        }
                                                        catch (NumberFormatException v15) {
                                                            throw m44.a("n", (Object)v15, (long)7711035884484990733L, (long)var2_1);
                                                        }
                                                    }
                                                    v0 = var1_2.equals(ah.a("n", (int)31685, (long)(7814661110542616684L ^ var2_1)));
                                                }
                                                try {
                                                    try {
                                                        v3 = var4_3;
lbl119:
                                                        // 2 sources

                                                        if (var2_1 >= 0L) {
                                                            if (v3 == null) break block72;
                                                            if (v0 == 0) break block73;
                                                        }
                                                        ** GOTO lbl135
                                                    }
                                                    catch (NumberFormatException v16) {
                                                        throw m44.a("n", (Object)v16, (long)7711035884484990733L, (long)var2_1);
                                                    }
                                                    return (int)ah.b("r", (int)18929, (long)(2167105931327634205L ^ var2_1));
                                                }
                                                catch (NumberFormatException v17) {
                                                    throw m44.a("n", (Object)v17, (long)7711035884484990733L, (long)var2_1);
                                                }
                                            }
                                            v0 = var1_2.equals(ah.a("n", (int)26761, (long)(9137247178747534093L ^ var2_1)));
                                        }
                                        try {
                                            try {
                                                v3 = var4_3;
lbl135:
                                                // 2 sources

                                                if (var2_1 > 0L) {
                                                    if (v3 == null) break block74;
                                                    if (v0 == 0) break block75;
                                                }
                                                ** GOTO lbl151
                                            }
                                            catch (NumberFormatException v18) {
                                                throw m44.a("n", (Object)v18, (long)7711035884484990733L, (long)var2_1);
                                            }
                                            return (int)ah.b("r", (int)11957, (long)(8066189652230085720L ^ var2_1));
                                        }
                                        catch (NumberFormatException v19) {
                                            throw m44.a("n", (Object)v19, (long)7711035884484990733L, (long)var2_1);
                                        }
                                    }
                                    v0 = var1_2.equals(ah.a("n", (int)833, (long)(2768398338517905639L ^ var2_1)));
                                }
                                try {
                                    try {
                                        v3 = var4_3;
lbl151:
                                        // 2 sources

                                        if (var2_1 >= 0L) {
                                            if (v3 == null) break block76;
                                            if (v0 == 0) break block77;
                                        }
                                        ** GOTO lbl167
                                    }
                                    catch (NumberFormatException v20) {
                                        throw m44.a("n", (Object)v20, (long)7711035884484990733L, (long)var2_1);
                                    }
                                    return (int)ah.b("r", (int)4322, (long)(1600957787424530955L ^ var2_1));
                                }
                                catch (NumberFormatException v21) {
                                    throw m44.a("n", (Object)v21, (long)7711035884484990733L, (long)var2_1);
                                }
                            }
                            v0 = (int)var1_2.equals(ah.a("n", (int)10665, (long)(8484535012661762L ^ var2_1)));
                        }
                        try {
                            try {
                                v3 = var4_3;
lbl167:
                                // 2 sources

                                if (var2_1 >= 0L) {
                                    if (v3 == null) break block78;
                                    if (v0 == 0) break block79;
                                }
                                ** GOTO lbl183
                            }
                            catch (NumberFormatException v22) {
                                throw m44.a("n", (Object)v22, (long)7711035884484990733L, (long)var2_1);
                            }
                            return (int)ah.b("r", (int)3423, (long)(8573059315942834103L ^ var2_1));
                        }
                        catch (NumberFormatException v23) {
                            throw m44.a("n", (Object)v23, (long)7711035884484990733L, (long)var2_1);
                        }
                    }
                    v0 = (int)var1_2.equals(ah.a("n", (int)27248, (long)(1417517321975683562L ^ var2_1)));
                }
                try {
                    try {
                        v3 = var4_3;
lbl183:
                        // 2 sources

                        if (v3 == null) break block80;
                        if (v0 == 0) break block81;
                    }
                    catch (NumberFormatException v24) {
                        throw m44.a("n", (Object)v24, (long)7711035884484990733L, (long)var2_1);
                    }
                    return (int)ah.b("r", (int)28575, (long)(2912642295567539572L ^ var2_1));
                }
                catch (NumberFormatException v25) {
                    throw m44.a("n", (Object)v25, (long)7711035884484990733L, (long)var2_1);
                }
            }
            v0 = -1;
        }
        return v0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void layoutContainer(Container container) {
        long l10;
        long l11 = l10 = b ^ 0x172D0684CADCL;
        long l12 = l11 ^ 0x220A03E2A1F6L;
        long l13 = l11 ^ 0x590D460EDCCEL;
        long l14 = l11 ^ 0x7ACB6962C8B7L;
        long l15 = l11 ^ 0xBA72746DC2CL;
        long l16 = l11 ^ 0x721C0A722CEAL;
        CallSite callSite = m44.a("v", (Object)container, (long)-8394489471231607450L, (long)l10);
        synchronized (callSite) {
            block12: {
                block10: {
                    Object object;
                    block11: {
                        CallSite callSite2 = m44.a("i", (long)-8544231423652614630L, (long)l10);
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l14;
                        m44.a("h", (Object)this, (Object)objectArray, (long)-7825946279444830139L, (long)l10);
                        if (m44.a("w", (Object)this, (long)-7649026316871273738L, (long)l10) == null) {
                            // empty if block
                        }
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l15;
                        m44.a("h", (Object)this, (Object)objectArray2, (long)-8120225431705944062L, (long)l10);
                        ArrayList arrayList = new ArrayList((int)m44.a("v", (Object)container, (long)-8413433861746408761L, (long)l10));
                        try {
                            Object[] objectArray3 = new Object[4];
                            objectArray3[3] = l13;
                            objectArray3[2] = true;
                            objectArray3[1] = arrayList;
                            objectArray3[0] = container;
                            m44.a("h", (Object)this, (Object)objectArray3, (long)-7671014694215901101L, (long)l10);
                            object = arrayList;
                            if (callSite2 == null) break block10;
                            if (((ArrayList)object).size() <= 0) break block11;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw m44.a("i", (Object)numberFormatException, (long)-8238141924241673822L, (long)l10);
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        for (int i10 = 0; i10 < arrayList.size(); ++i10) {
                            lqe lqe2 = (lqe)m44.a("w", (Object)this, (long)-7877727098163055998L, (long)l10).get(arrayList.get(i10));
                            try {
                                Object[] objectArray4 = new Object[1];
                                objectArray4[0] = l16;
                                stringBuffer.append((String)((Object)m44.a("m", (long)-7806386778261083870L, (long)l10)) + (String)((Object)m44.a("v", (Object)lqe2, (Object)objectArray4, (long)-7845662698151846917L, (long)l10)));
                                if (callSite2 != null) {
                                    if (callSite2 != null) continue;
                                    break;
                                }
                                break block12;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("i", (Object)numberFormatException, (long)-8238141924241673822L, (long)l10);
                            }
                        }
                        Object[] objectArray5 = new Object[2];
                        objectArray5[1] = l12;
                        objectArray5[0] = (String)((Object)ah.a("n", (int)23712, (long)(0x1C8D522FC5CA09A2L ^ l10))) + stringBuffer.toString();
                        m44.a("v", (Object)this, (Object)objectArray5, (long)-8127282277943512380L, (long)l10);
                    }
                    object = callSite;
                }
                // ** MonitorExit[v4] (shouldn't be in output)
            }
            return;
        }
    }

    void q(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        long l11 = (l10 = b ^ l10) ^ 0x66E1FC2E1793L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        String string2 = (String)((Object)ah.a("n", (int)24282, (long)(0x7BF576677AC3FF8CL ^ l10))) + (String)((Object)m44.a("r", (Object)this, (Object)objectArray2, (long)7040796240185463394L, (long)l10)) + (String)((Object)ah.a("n", (int)5854, (long)(0xAAC223EC07BB7A5L ^ l10))) + (String)((Object)m44.a("i", (long)7491235221168905598L, (long)l10)) + string;
        m44.a("r", (Object)m44.a("i", (long)6931381145270404160L, (long)l10), (Object)((String)((Object)m44.a("i", (long)7491235221168905598L, (long)l10)) + string2), (long)9061051625841649578L, (long)l10);
        m44.a("m", (int)1, (long)8763985249889383304L, (long)l10);
        throw new RuntimeException(string2);
    }

    @Override
    public float getLayoutAlignmentX(Container container) {
        return 0.5f;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Dimension g(Object[] var1_1) {
        block78: {
            block61: {
                block76: {
                    block77: {
                        block80: {
                            block75: {
                                block73: {
                                    block74: {
                                        block68: {
                                            block66: {
                                                block65: {
                                                    block64: {
                                                        block59: {
                                                            block58: {
                                                                block57: {
                                                                    block55: {
                                                                        block56: {
                                                                            var6_2 = (Container)var1_1[0];
                                                                            var5_3 = (Integer)var1_1[1];
                                                                            var4_4 = (Integer)var1_1[2];
                                                                            var2_5 = (Long)var1_1[3];
                                                                            v0 = var2_5 = ah.b ^ var2_5;
                                                                            var7_6 = v0 ^ 96624629757768L;
                                                                            var9_7 = v0 ^ 96148464051834L;
                                                                            var11_8 = v0 ^ 49368121461360L;
                                                                            var13_9 = v0 ^ 59185027525610L;
                                                                            var15_10 = v0 ^ 25391971165381L;
                                                                            var17_11 = v0 ^ 84616185989533L;
                                                                            var19_12 = v0 ^ 138865018915474L;
                                                                            var21_13 = v0 ^ 85118124188268L;
                                                                            var23_14 = m44.a("o", (long)-6930266727222757212L, (long)var2_5);
                                                                            if (m44.a("q", (Object)this, (long)-8978129281878268856L, (long)var2_5) == null) {
                                                                                // empty if block
                                                                            }
                                                                            v1 = new Object[1];
                                                                            v1[0] = var19_12;
                                                                            m44.a("n", (Object)this, (Object)v1, (long)-7353995470445078852L, (long)var2_5);
                                                                            var24_15 = m44.a("p", (Object)var6_2, (long)-8663584048729259041L, (long)var2_5);
                                                                            var25_16 = -1;
                                                                            var26_17 = -1;
                                                                            try {
                                                                                v2 = var5_3;
                                                                                v3 = var23_14;
                                                                                if (var2_5 >= 0L) {
                                                                                    if (v3 == null) break block55;
                                                                                    if (v2 == null) break block56;
                                                                                }
                                                                                ** GOTO lbl42
                                                                            }
                                                                            catch (NumberFormatException v4) {
                                                                                throw m44.a("o", (Object)v4, (long)-7272670757630810340L, (long)var2_5);
                                                                            }
                                                                            var25_16 = var5_3;
                                                                        }
                                                                        v2 = var4_4;
                                                                    }
                                                                    try {
                                                                        v3 = var23_14;
lbl42:
                                                                        // 2 sources

                                                                        if (v3 == null) break block57;
                                                                        if (v2 == null) break block58;
                                                                    }
                                                                    catch (NumberFormatException v5) {
                                                                        throw m44.a("o", (Object)v5, (long)-7272670757630810340L, (long)var2_5);
                                                                    }
                                                                    v2 = var4_4;
                                                                }
                                                                var26_17 = v2;
                                                            }
                                                            try {
                                                                block60: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v6 /* !! */  = var25_16;
                                                                                if (var23_14 == null) break block59;
                                                                                if (v6 /* !! */  == -1) break block60;
                                                                            }
                                                                            catch (NumberFormatException v7) {
                                                                                throw m44.a("o", (Object)v7, (long)-7272670757630810340L, (long)var2_5);
                                                                            }
                                                                            v6 /* !! */  = var26_17;
                                                                            if (var23_14 == null) break block59;
                                                                        }
                                                                        catch (NumberFormatException v8) {
                                                                            throw m44.a("o", (Object)v8, (long)-7272670757630810340L, (long)var2_5);
                                                                        }
                                                                        if (v6 /* !! */  != -1) break block61;
                                                                    }
                                                                    catch (NumberFormatException v9) {
                                                                        throw m44.a("o", (Object)v9, (long)-7272670757630810340L, (long)var2_5);
                                                                    }
                                                                }
                                                                v6 /* !! */  = (int)m44.a("p", (Object)var6_2, (long)-7096811469978348423L, (long)var2_5);
                                                            }
                                                            catch (NumberFormatException v10) {
                                                                throw m44.a("o", (Object)v10, (long)-7272670757630810340L, (long)var2_5);
                                                            }
                                                        }
                                                        var27_18 = v6 /* !! */ ;
                                                        var28_20 = new ArrayList<E>(var27_18);
                                                        v11 = new Object[4];
                                                        v11[3] = var11_8;
                                                        v11[2] = false;
                                                        v11[1] = var28_20;
                                                        v11[0] = var6_2;
                                                        m44.a("n", (Object)this, (Object)v11, (long)-8992174237570779411L, (long)var2_5);
                                                        block38: while (true) {
                                                            var29_23 = false;
                                                            block39: while (true) {
                                                                var30_24 = 0;
                                                                block40: while (true) {
                                                                    v12 = var30_24;
                                                                    block41: while (true) {
                                                                        if (v12 >= var28_20.size()) ** GOTO lbl116
                                                                        v13 /* !! */  = var28_20.get(var30_24);
                                                                        do {
                                                                            block79: {
                                                                                block62: {
                                                                                    block63: {
                                                                                        var31_25 = (Component)v13 /* !! */ ;
                                                                                        var32_21 = (lqe)m44.a("q", (Object)this, (long)-8929858395195005892L, (long)var2_5).get(var31_25);
                                                                                        v14 = new Object[1];
                                                                                        v14[0] = var21_13;
                                                                                        v15 /* !! */  = m44.a("p", (Object)var32_21, (Object)v14, (long)-7170983488246488675L, (long)var2_5);
                                                                                        if (var23_14 == null) break block79;
                                                                                        try {
                                                                                            if (var23_14 == null) break block62;
                                                                                            if (!v15 /* !! */ ) break block63;
                                                                                        }
                                                                                        catch (NumberFormatException v16) {
                                                                                            throw m44.a("o", (Object)v16, (long)-7272670757630810340L, (long)var2_5);
                                                                                        }
                                                                                        v17 = true;
                                                                                        break block62;
                                                                                    }
                                                                                    v17 = var29_23;
                                                                                }
                                                                                var29_23 = v17;
                                                                                ++var30_24;
                                                                                if (var23_14 != null) continue block40;
lbl116:
                                                                                // 2 sources

                                                                                if (var2_5 < 0L) continue block39;
                                                                                v15 /* !! */  = var29_23;
                                                                            }
                                                                            if (v15 /* !! */ ) continue block38;
                                                                            v12 = 0;
                                                                            if (var2_5 < 0L) continue block41;
                                                                            if (var23_14 == null) break block64;
                                                                            var30_24 = v12;
                                                                            v13 /* !! */  = m44.a("q", (Object)this, (long)-9036802619319012173L, (long)var2_5);
                                                                        } while (var23_14 == null);
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        if (v13 /* !! */  != null) {
                                                            var30_24 = m44.a("q", (Object)this, (long)-9036802619319012173L, (long)var2_5).intValue();
                                                        }
                                                        v18 = false;
                                                    }
                                                    var31_26 = v18;
                                                    try {
                                                        try {
                                                            v19 = m44.a("q", (Object)this, (long)-9181817442014043631L, (long)var2_5);
                                                            if (var23_14 == null) break block65;
                                                            if (v19 == null) break block66;
                                                        }
                                                        catch (NumberFormatException v20) {
                                                            throw m44.a("o", (Object)v20, (long)-7272670757630810340L, (long)var2_5);
                                                        }
                                                        v19 = m44.a("q", (Object)this, (long)-9181817442014043631L, (long)var2_5);
                                                    }
                                                    catch (NumberFormatException v21) {
                                                        throw m44.a("o", (Object)v21, (long)-7272670757630810340L, (long)var2_5);
                                                    }
                                                }
                                                var31_26 = v19.intValue();
                                            }
                                            var32_22 /* !! */  = 0;
                                            var33_27 /* !! */  = 0;
                                            for (var34_28 = 0; var34_28 < var27_18; ++var34_28) {
                                                block72: {
                                                    block70: {
                                                        block71: {
                                                            block67: {
                                                                block69: {
                                                                    var35_29 = m44.a("p", (Object)var6_2, (int)var34_28, (long)-7313083361536282560L, (long)var2_5);
                                                                    var36_30 = (lqe)m44.a("q", (Object)this, (long)-8929858395195005892L, (long)var2_5).get(var35_29);
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v22 = var36_30;
                                                                                if (var23_14 == null) break block67;
                                                                                v23 = new Object[1];
                                                                                v23[0] = var13_9;
                                                                                v24 /* !! */  = (int)m44.a("p", (Object)v22, (Object)v23, (long)-9032461668167158310L, (long)var2_5);
                                                                                if (var2_5 <= 0L || var23_14 == null) break block68;
                                                                            }
                                                                            catch (NumberFormatException v25) {
                                                                                throw m44.a("o", (Object)v25, (long)-7272670757630810340L, (long)var2_5);
                                                                            }
                                                                            if (v24 /* !! */  != 0) break block69;
                                                                        }
                                                                        catch (NumberFormatException v26) {
                                                                            throw m44.a("o", (Object)v26, (long)-7272670757630810340L, (long)var2_5);
                                                                        }
                                                                        v27 = new Object[2];
                                                                        v27[1] = var7_6;
                                                                        v27[0] = (String)ah.a("n", (int)20643, (long)(2795868974433964806L ^ var2_5)) + var36_30 + "'";
                                                                        m44.a("p", (Object)this, (Object)v27, (long)-7383543565302864774L, (long)var2_5);
                                                                    }
                                                                    catch (NumberFormatException v28) {
                                                                        throw m44.a("o", (Object)v28, (long)-7272670757630810340L, (long)var2_5);
                                                                    }
                                                                }
                                                                v22 = var36_30;
                                                            }
                                                            v29 = new Object[1];
                                                            v29[0] = var15_10;
                                                            var37_31 = m44.a("p", (Object)v22, (Object)v29, (long)-7333048620820847238L, (long)var2_5);
                                                            try {
                                                                v30 = var37_31;
                                                                v31 = new Object[1];
                                                                v31[0] = var9_7;
                                                                m44.a("s", (Object)v30, (int)(m44.a("q", (Object)v30, (long)-7333574181368610570L, (long)var2_5) + Math.max((int)m44.a("p", (Object)var36_30, (Object)v31, (long)-8722349101575782706L, (long)var2_5), var30_24)), (long)-7333574181368610570L, (long)var2_5);
                                                                v32 = var37_31;
                                                                v33 = new Object[1];
                                                                v33[0] = var17_11;
                                                                m44.a("s", (Object)v32, (int)(m44.a("q", (Object)v32, (long)-9020623710895568473L, (long)var2_5) + Math.max((int)m44.a("p", (Object)var36_30, (Object)v33, (long)-9204779610532189893L, (long)var2_5), var31_26)), (long)-9020623710895568473L, (long)var2_5);
                                                                v34 = m44.a("q", (Object)var37_31, (long)-7333574181368610570L, (long)var2_5);
                                                                v35 = var32_22 /* !! */ ;
                                                                if (var2_5 <= 0L || var23_14 == null) break block70;
                                                                if (v34 <= v35) break block71;
                                                            }
                                                            catch (NumberFormatException v36) {
                                                                throw m44.a("o", (Object)v36, (long)-7272670757630810340L, (long)var2_5);
                                                            }
                                                            var32_22 /* !! */  = (int)m44.a("q", (Object)var37_31, (long)-7333574181368610570L, (long)var2_5);
                                                        }
                                                        try {
                                                            v34 = m44.a("q", (Object)var37_31, (long)-9020623710895568473L, (long)var2_5);
                                                            if (var23_14 == null) break block72;
                                                            v35 = var33_27 /* !! */ ;
                                                        }
                                                        catch (NumberFormatException v37) {
                                                            throw m44.a("o", (Object)v37, (long)-7272670757630810340L, (long)var2_5);
                                                        }
                                                    }
                                                    try {
                                                        if (v34 <= v35) continue;
                                                        v34 = m44.a("q", (Object)var37_31, (long)-9020623710895568473L, (long)var2_5);
                                                    }
                                                    catch (NumberFormatException v38) {
                                                        throw m44.a("o", (Object)v38, (long)-7272670757630810340L, (long)var2_5);
                                                    }
                                                }
                                                var33_27 /* !! */  = (int)v34;
                                                if (var23_14 != null) continue;
                                            }
                                            if (var2_5 < 0L) break block80;
                                            v24 /* !! */  = var25_16;
                                        }
                                        try {
                                            v39 = -1;
                                            if (var23_14 == null) break block73;
                                            if (v24 /* !! */  != v39) break block74;
                                        }
                                        catch (NumberFormatException v40) {
                                            throw m44.a("o", (Object)v40, (long)-7272670757630810340L, (long)var2_5);
                                        }
                                        var25_16 = var32_22 /* !! */ ;
                                    }
                                    try {
                                        v24 /* !! */  = var26_17;
                                        if (var23_14 == null) break block75;
                                        v39 = -1;
                                    }
                                    catch (NumberFormatException v41) {
                                        throw m44.a("o", (Object)v41, (long)-7272670757630810340L, (long)var2_5);
                                    }
                                }
                                if (v24 /* !! */  != v39) break block80;
                                v24 /* !! */  = var33_27 /* !! */ ;
                            }
                            var26_17 = v24 /* !! */ ;
                        }
                        try {
                            v42 = m44.a("q", (Object)this, (long)-7339680129808250186L, (long)var2_5);
                            if (var23_14 == null) break block76;
                            if (v42 == null) break block77;
                        }
                        catch (NumberFormatException v43) {
                            throw m44.a("o", (Object)v43, (long)-7272670757630810340L, (long)var2_5);
                        }
                        var25_16 = Math.max(var25_16, m44.a("q", (Object)this, (long)-7339680129808250186L, (long)var2_5).intValue());
                    }
                    v42 = m44.a("q", (Object)this, (long)-8772202166745355679L, (long)var2_5);
                }
                if (v42 != null) {
                    var26_17 = Math.max(var26_17, m44.a("q", (Object)this, (long)-8772202166745355679L, (long)var2_5).intValue());
                }
            }
            var27_19 = new Dimension(var25_16 + m44.a("q", (Object)var24_15, (long)-9021578486889604481L, (long)var2_5) + m44.a("q", (Object)var24_15, (long)-7420748444405955417L, (long)var2_5), var26_17 + m44.a("q", (Object)var24_15, (long)-7151208053522871980L, (long)var2_5) + m44.a("q", (Object)var24_15, (long)-9039780203613166988L, (long)var2_5));
            try {
                v44 = var27_19;
                v45 = m44.a("o", (long)-7321126803075062945L, (long)var2_5);
                if (var2_5 >= 0L) {
                    if (v45 != null) break block78;
                    v45 = "E7RLHc";
                }
                m44.a("o", (Object)v45, (long)-7255087865950195400L, (long)var2_5);
            }
            catch (NumberFormatException v46) {
                throw m44.a("o", (Object)v46, (long)-7272670757630810340L, (long)var2_5);
            }
        }
        return v44;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @Override
    public Dimension minimumLayoutSize(Container container) {
        long l10;
        long l11 = l10 = b ^ 0x6A3ED9C1F216L;
        long l12 = l11 ^ 0x7D8B627F07DL;
        long l13 = l11 ^ 0x38D973257BDEL;
        CallSite callSite = m44.a("t", (Object)container, (long)-5527406174707743316L, (long)l10);
        synchronized (callSite) {
            CallSite callSite2;
            CallSite callSite3;
            block16: {
                ah ah2;
                block14: {
                    block15: {
                        CallSite callSite4;
                        CallSite callSite5;
                        block13: {
                            ah ah3;
                            block11: {
                                block12: {
                                    callSite5 = m44.a("k", (long)-5645622936918190384L, (long)l10);
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l12;
                                    m44.a("j", (Object)this, (Object)objectArray, (long)-6075678873207205745L, (long)l10);
                                    ah3 = this;
                                    if (callSite5 == null) break block11;
                                    try {
                                        block17: {
                                            if (m44.a("u", (Object)ah3, (long)-5453789639635278654L, (long)l10) == null) break block12;
                                            break block17;
                                            catch (NumberFormatException numberFormatException) {
                                                throw m44.a("k", (Object)numberFormatException, (long)-5375538175528187544L, (long)l10);
                                            }
                                        }
                                        callSite4 = m44.a("u", (Object)this, (long)-5453789639635278654L, (long)l10);
                                        break block13;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw m44.a("k", (Object)numberFormatException, (long)-5375538175528187544L, (long)l10);
                                    }
                                }
                                ah3 = this;
                            }
                            callSite4 = m44.a("u", (Object)ah3, (long)-5654312232042252735L, (long)l10);
                        }
                        callSite3 = callSite4;
                        ah2 = this;
                        if (callSite5 == null) break block14;
                        try {
                            block18: {
                                if (m44.a("u", (Object)ah2, (long)-6325613111723752427L, (long)l10) == null) break block15;
                                break block18;
                                catch (NumberFormatException numberFormatException) {
                                    throw m44.a("k", (Object)numberFormatException, (long)-5375538175528187544L, (long)l10);
                                }
                            }
                            callSite2 = m44.a("u", (Object)this, (long)-6325613111723752427L, (long)l10);
                            break block16;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw m44.a("k", (Object)numberFormatException, (long)-5375538175528187544L, (long)l10);
                        }
                    }
                    ah2 = this;
                }
                callSite2 = m44.a("u", (Object)ah2, (long)-5377596033290452195L, (long)l10);
            }
            CallSite callSite6 = callSite2;
            Object[] objectArray = new Object[4];
            objectArray[3] = l13;
            objectArray[2] = callSite6;
            objectArray[1] = callSite3;
            objectArray[0] = container;
            CallSite callSite7 = m44.a("t", (Object)this, (Object)objectArray, (long)-5993645245491816817L, (long)l10);
            return callSite7;
        }
    }

    public String e(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return ah.a("n", (int)22268, (long)(0x1C969D5A9ED735AAL ^ l10));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @Override
    public void addLayoutComponent(Component component, Object object) {
        long l10;
        long l11 = l10 = b ^ 0x3C14103E300CL;
        long l12 = l11 ^ 0x93315585B26L;
        long l13 = l11 ^ 0x6FA3931A302AL;
        CallSite callSite = m44.a("v", (Object)component, (long)8538385356688747562L, (long)l10);
        synchronized (callSite) {
            block13: {
                Object object2;
                String string;
                block14: {
                    Object object3;
                    CallSite callSite2;
                    block11: {
                        block12: {
                            callSite2 = m44.a("i", (long)8339789043991467210L, (long)l10);
                            object3 = object;
                            if (callSite2 == null) break block11;
                            try {
                                block15: {
                                    if (object3 instanceof String) break block12;
                                    break block15;
                                    catch (NumberFormatException numberFormatException) {
                                        throw m44.a("i", (Object)numberFormatException, (long)8609781499826834290L, (long)l10);
                                    }
                                }
                                throw new IllegalArgumentException((String)((Object)ah.a("n", (int)3842, (long)(0x312B6426A91AA0F0L ^ l10))));
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("i", (Object)numberFormatException, (long)8609781499826834290L, (long)l10);
                            }
                        }
                        object3 = object;
                    }
                    string = (String)object3;
                    Component component2 = m44.a("w", (Object)this, (long)8575393657431095144L, (long)l10).put(string, component);
                    object2 = component2;
                    if (callSite2 == null) break block13;
                    try {
                        block16: {
                            if (object2 == null) break block14;
                            break block16;
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("i", (Object)numberFormatException, (long)8609781499826834290L, (long)l10);
                            }
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l12;
                        objectArray[0] = (String)((Object)ah.a("n", (int)26334, (long)(0x4F487959FB134926L ^ l10))) + string + (String)((Object)ah.a("n", (int)1648, (long)(0x57326EEA354AA992L ^ l10))) + component2 + (String)((Object)ah.a("n", (int)13766, (long)(0x72C3EDFA82A9A15L ^ l10))) + component;
                        m44.a("v", (Object)this, (Object)objectArray, (long)8495544735809898516L, (long)l10);
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("i", (Object)numberFormatException, (long)8609781499826834290L, (long)l10);
                    }
                }
                m44.a("w", (Object)this, (long)7529063960926963794L, (long)l10).put(component, new lqe(string, component, this, l13));
                object2 = callSite;
            }
            // ** MonitorExit[v4] (shouldn't be in output)
            return;
        }
    }

    public ah(Container container, long l10) {
        long l11 = (l10 = b ^ l10) ^ 0x2399AC547EA4L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("u", (Object)this, (Map)((Object)m44.a("i", (Object)objectArray, (long)-7295648351571739102L, (long)l10)), (long)-8700520188058040536L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l11;
        m44.a("u", (Object)this, (Map)((Object)m44.a("i", (Object)objectArray2, (long)-7295648351571739102L, (long)l10)), (long)-7476826212178741230L, (long)l10);
        m44.a("u", (Object)this, (ge[])new ge[4], (long)-7427057508354825578L, (long)l10);
        m44.a("u", (Object)this, (Container)container, (long)-9219935735766913398L, (long)l10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @Override
    public void removeLayoutComponent(Component component) {
        long l10 = b ^ 0x55450D077B91L;
        long l11 = l10 ^ 0x7995C52ABEC7L;
        CallSite callSite = m44.a("s", (Object)component, (long)4459436021665048503L, (long)l10);
        synchronized (callSite) {
            block7: {
                Object object;
                block8: {
                    CallSite callSite2 = m44.a("l", (long)4044664170022903639L, (long)l10);
                    lqe lqe2 = (lqe)m44.a("r", (Object)this, (long)2585614401088652239L, (long)l10).remove(component);
                    object = lqe2;
                    if (callSite2 == null) break block7;
                    try {
                        block9: {
                            if (object == null) break block8;
                            break block9;
                            catch (NumberFormatException numberFormatException) {
                                throw m44.a("l", (Object)numberFormatException, (long)4386928220798304495L, (long)l10);
                            }
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l11;
                        m44.a("r", (Object)this, (long)4367508991998704885L, (long)l10).remove(m44.a("s", (Object)lqe2, (Object)objectArray, (long)2309722705572571341L, (long)l10));
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("l", (Object)numberFormatException, (long)4386928220798304495L, (long)l10);
                    }
                }
                object = callSite;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    lqe i(Object[] objectArray) {
        Object v10;
        block4: {
            Object v11;
            long l10;
            block5: {
                String string = (String)objectArray[0];
                l10 = (Long)objectArray[1];
                long l11 = (l10 = b ^ l10) ^ 0x596719516753L;
                v11 = m44.a("r", (Object)this, (long)5437176588797496093L, (long)l10).get(string);
                CallSite callSite = m44.a("l", (long)5749321730145872063L, (long)l10);
                try {
                    try {
                        v10 = v11;
                        if (callSite == null) break block4;
                        if (v10 != null) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw m44.a("l", (Object)numberFormatException, (long)5406930877372544775L, (long)l10);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l11;
                    objectArray2[0] = (String)((Object)ah.a("n", (int)20615, (long)(0x5144E821BDDD433BL ^ l10))) + string + (String)((Object)ah.a("n", (int)8930, (long)(0x2432088FC2E8B166L ^ l10)));
                    m44.a("s", (Object)this, (Object)objectArray2, (long)5301700728361497697L, (long)l10);
                }
                catch (NumberFormatException numberFormatException) {
                    throw m44.a("l", (Object)numberFormatException, (long)5406930877372544775L, (long)l10);
                }
            }
            v10 = m44.a("r", (Object)this, (long)6055595045626999847L, (long)l10).get(v11);
        }
        return (lqe)v10;
    }

    /*
     * Unable to fully structure code
     */
    private String I(Object[] var1_1) {
        block65: {
            block70: {
                block68: {
                    block66: {
                        block63: {
                            var2_2 = (String)var1_1[0];
                            var5_3 = (String)var1_1[1];
                            var3_4 = (Long)var1_1[2];
                            var6_5 = (var3_4 = ah.b ^ var3_4) ^ 3431319558834L;
                            var8_6 = m44.a("m", (long)-2481274123448681754L, (long)var3_4);
                            try {
                                var9_7 = Integer.parseInt(var5_3);
                            }
                            catch (NumberFormatException var10_8) {
                                block56: {
                                    block61: {
                                        block59: {
                                            block57: {
                                                block54: {
                                                    try {
                                                        block55: {
                                                            try {
                                                                try {
                                                                    v0 = var2_2.equals(ah.a("n", (int)314, (long)(370599542649454842L ^ var3_4)));
                                                                    v1 = var8_6;
                                                                    if (var3_4 > 0L) {
                                                                        if (v1 == null) break block54;
                                                                        if (!v0) break block55;
                                                                    }
                                                                    ** GOTO lbl39
                                                                }
                                                                catch (NumberFormatException v2) {
                                                                    throw m44.a("m", (Object)v2, (long)-2787647837895252642L, (long)var3_4);
                                                                }
                                                                m44.a("s", (Object)this, (long)-4142761040086254342L, (long)var3_4)[0] = new ge(var6_5, this, var5_3);
                                                                if (var8_6 != null) break block56;
                                                            }
                                                            catch (NumberFormatException v3) {
                                                                throw m44.a("m", (Object)v3, (long)-2787647837895252642L, (long)var3_4);
                                                            }
                                                        }
                                                        v0 = var2_2.equals(ah.a("n", (int)19457, (long)(1121236699893616122L ^ var3_4)));
                                                    }
                                                    catch (NumberFormatException v4) {
                                                        throw m44.a("m", (Object)v4, (long)-2787647837895252642L, (long)var3_4);
                                                    }
                                                }
                                                try {
                                                    block58: {
                                                        try {
                                                            try {
                                                                v1 = var8_6;
lbl39:
                                                                // 2 sources

                                                                if (var3_4 > 0L) {
                                                                    if (v1 == null) break block57;
                                                                    if (!v0) break block58;
                                                                }
                                                                ** GOTO lbl63
                                                            }
                                                            catch (NumberFormatException v5) {
                                                                throw m44.a("m", (Object)v5, (long)-2787647837895252642L, (long)var3_4);
                                                            }
                                                            m44.a("s", (Object)this, (long)-4142761040086254342L, (long)var3_4)[1] = new ge(var6_5, this, var5_3);
                                                            if (var8_6 != null) break block56;
                                                        }
                                                        catch (NumberFormatException v6) {
                                                            throw m44.a("m", (Object)v6, (long)-2787647837895252642L, (long)var3_4);
                                                        }
                                                    }
                                                    v0 = var2_2.equals(ah.a("n", (int)13725, (long)(5872212682252923992L ^ var3_4)));
                                                }
                                                catch (NumberFormatException v7) {
                                                    throw m44.a("m", (Object)v7, (long)-2787647837895252642L, (long)var3_4);
                                                }
                                            }
                                            try {
                                                try {
                                                    block60: {
                                                        try {
                                                            try {
                                                                if (var3_4 < 0L) break block59;
                                                                v1 = var8_6;
lbl63:
                                                                // 2 sources

                                                                if (v1 == null) break block59;
                                                                if (!v0) break block60;
                                                            }
                                                            catch (NumberFormatException v8) {
                                                                throw m44.a("m", (Object)v8, (long)-2787647837895252642L, (long)var3_4);
                                                            }
                                                            m44.a("s", (Object)this, (long)-4142761040086254342L, (long)var3_4)[2] = new ge(var6_5, this, var5_3);
                                                            if (var8_6 != null) break block56;
                                                        }
                                                        catch (NumberFormatException v9) {
                                                            throw m44.a("m", (Object)v9, (long)-2787647837895252642L, (long)var3_4);
                                                        }
                                                    }
                                                    v10 = var2_2;
                                                    if (var8_6 == null) break block61;
                                                }
                                                catch (NumberFormatException v11) {
                                                    throw m44.a("m", (Object)v11, (long)-2787647837895252642L, (long)var3_4);
                                                }
                                                v0 = v10.equals(ah.a("n", (int)13504, (long)(259235165663376671L ^ var3_4)));
                                            }
                                            catch (NumberFormatException v12) {
                                                throw m44.a("m", (Object)v12, (long)-2787647837895252642L, (long)var3_4);
                                            }
                                        }
                                        try {
                                            block62: {
                                                try {
                                                    if (!v0) break block62;
                                                    m44.a("s", (Object)this, (long)-4142761040086254342L, (long)var3_4)[3] = new ge(var6_5, this, var5_3);
                                                    if (var8_6 != null) break block56;
                                                }
                                                catch (NumberFormatException v13) {
                                                    throw m44.a("m", (Object)v13, (long)-2787647837895252642L, (long)var3_4);
                                                }
                                            }
                                            v10 = (String)ah.a("n", (int)28964, (long)(2866106123822133490L ^ var3_4)) + var2_2 + (String)ah.a("n", (int)327, (long)(5915012428622135427L ^ var3_4)) + (String)ah.a("n", (int)19797, (long)(2875404358293900420L ^ var3_4)) + (String)ah.a("n", (int)9338, (long)(1503234772124345778L ^ var3_4));
                                        }
                                        catch (NumberFormatException v14) {
                                            throw m44.a("m", (Object)v14, (long)-2787647837895252642L, (long)var3_4);
                                        }
                                    }
                                    return v10;
                                }
                                return null;
                            }
                            try {
                                block64: {
                                    try {
                                        try {
                                            v15 = var2_2.equals(ah.a("n", (int)314, (long)(370599542649454842L ^ var3_4)));
                                            v16 = var8_6;
                                            if (var3_4 > 0L) {
                                                if (v16 == null) break block63;
                                                if (!v15) break block64;
                                            }
                                            ** GOTO lbl128
                                        }
                                        catch (NumberFormatException v17) {
                                            throw m44.a("m", (Object)v17, (long)-2787647837895252642L, (long)var3_4);
                                        }
                                        m44.a("q", (Object)this, (Integer)var9_7, (long)-2471964413235504521L, (long)var3_4);
                                        if (var8_6 != null) break block65;
                                    }
                                    catch (NumberFormatException v18) {
                                        throw m44.a("m", (Object)v18, (long)-2787647837895252642L, (long)var3_4);
                                    }
                                }
                                v15 = var2_2.equals(ah.a("n", (int)19457, (long)(1121236699893616122L ^ var3_4)));
                            }
                            catch (NumberFormatException v19) {
                                throw m44.a("m", (Object)v19, (long)-2787647837895252642L, (long)var3_4);
                            }
                        }
                        try {
                            block67: {
                                try {
                                    try {
                                        v16 = var8_6;
lbl128:
                                        // 2 sources

                                        if (var3_4 > 0L) {
                                            if (v16 == null) break block66;
                                            if (!v15) break block67;
                                        }
                                        ** GOTO lbl152
                                    }
                                    catch (NumberFormatException v20) {
                                        throw m44.a("m", (Object)v20, (long)-2787647837895252642L, (long)var3_4);
                                    }
                                    m44.a("q", (Object)this, (Integer)var9_7, (long)-2780698530763428053L, (long)var3_4);
                                    if (var8_6 != null) break block65;
                                }
                                catch (NumberFormatException v21) {
                                    throw m44.a("m", (Object)v21, (long)-2787647837895252642L, (long)var3_4);
                                }
                            }
                            v15 = var2_2.equals(ah.a("n", (int)13725, (long)(5872212682252923992L ^ var3_4)));
                        }
                        catch (NumberFormatException v22) {
                            throw m44.a("m", (Object)v22, (long)-2787647837895252642L, (long)var3_4);
                        }
                    }
                    try {
                        try {
                            block69: {
                                try {
                                    try {
                                        if (var3_4 <= 0L) break block68;
                                        v16 = var8_6;
lbl152:
                                        // 2 sources

                                        if (v16 == null) break block68;
                                        if (!v15) break block69;
                                    }
                                    catch (NumberFormatException v23) {
                                        throw m44.a("m", (Object)v23, (long)-2787647837895252642L, (long)var3_4);
                                    }
                                    m44.a("q", (Object)this, (Integer)var9_7, (long)-2853533137682822924L, (long)var3_4);
                                    if (var8_6 != null) break block65;
                                }
                                catch (NumberFormatException v24) {
                                    throw m44.a("m", (Object)v24, (long)-2787647837895252642L, (long)var3_4);
                                }
                            }
                            v25 = var2_2;
                            if (var8_6 == null) break block70;
                        }
                        catch (NumberFormatException v26) {
                            throw m44.a("m", (Object)v26, (long)-2787647837895252642L, (long)var3_4);
                        }
                        v15 = v25.equals(ah.a("n", (int)13504, (long)(259235165663376671L ^ var3_4)));
                    }
                    catch (NumberFormatException v27) {
                        throw m44.a("m", (Object)v27, (long)-2787647837895252642L, (long)var3_4);
                    }
                }
                try {
                    block71: {
                        try {
                            if (!v15) break block71;
                            m44.a("q", (Object)this, (Integer)var9_7, (long)-4323207226913298397L, (long)var3_4);
                            if (var8_6 != null) break block65;
                        }
                        catch (NumberFormatException v28) {
                            throw m44.a("m", (Object)v28, (long)-2787647837895252642L, (long)var3_4);
                        }
                    }
                    v25 = (String)ah.a("n", (int)28964, (long)(2866106123822133490L ^ var3_4)) + var2_2 + (String)ah.a("n", (int)21219, (long)(4044142052381774615L ^ var3_4)) + (String)ah.a("n", (int)19797, (long)(2875404358293900420L ^ var3_4)) + (String)ah.a("n", (int)4418, (long)(6424355727667400894L ^ var3_4));
                }
                catch (NumberFormatException v29) {
                    throw m44.a("m", (Object)v29, (long)-2787647837895252642L, (long)var3_4);
                }
            }
            return v25;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public void f(Object[] var1_1) {
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

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4A5F;
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
                throw new RuntimeException("com/zelix/ah", exception);
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
            ah.d[n11] = ah.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = ah.a(n10, l10);
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
            throw new RuntimeException("com/zelix/ah" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x4B33;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/ah", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ah.g[n11] = n12;
        }
        return g[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = ah.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/ah" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ah.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(ah.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

