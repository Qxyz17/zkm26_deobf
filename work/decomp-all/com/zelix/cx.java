// 
// Decompiled by Procyon v0.6.0
// 

package com.zelix;

import java.lang.reflect.UndeclaredThrowableException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import javax.swing.JFrame;
import java.util.Map;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;

public class cx extends ce implements FocusListener, ActionListener
{
    JTextField L;
    JTextField y;
    JTextField p;
    JTextField E;
    static String[] w;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    
    public cx(final JFrame frame, final sn sn, long n, final int n2) {
        final long n3;
        n = (n3 = (cx.a ^ n));
        final long n4 = n3 ^ 0x439BB9278F81L;
        final long l = n3 ^ 0x148636D447E0L;
        super(frame, sn, n2, n4);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_2.invoke(this, new Object[] { l }, 2987185704708931164L, n);
    }
    
    static {
        a = prr.a(-4719107563626519649L, 3803761755659189899L, (Object)MethodHandles.lookup().lookupClass()).a(40866575908600L);
        final long n = cx.a ^ 0x2A6D4E779E39L;
        d = new HashMap(13);
        final Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        final int opmode = 2;
        final SecretKeyFactory instance2 = SecretKeyFactory.getInstance("DES");
        final byte[] key = new byte[8];
        key[0] = (byte)(n >>> 56);
        for (int i = 1; i < 8; ++i) {
            key[i] = (byte)(n << i * 8 >>> 56);
        }
        instance.init(opmode, instance2.generateSecret(new DESKeySpec(key)), new IvParameterSpec(new byte[8]));
        final String[] b2 = new String[52];
        int n2 = 0;
        String s;
        int n3 = (s = "\u0016\u0084\u00d5\u00f5\u00e9htS?\u0082\u00e5\u0006\u0084\u00c5\u0086\u00faF?$\u0098??\u00ee]\tt\u00c1?pd\u00c1\u007f0C\u0088\u00e5\u00e1?T!¡ènV\u00188.yq\u00dda\u0000\u009b\u0002`\b\u00e5\u0081w\u00fe\u00c4F\u0005\u00eb\u008e\u00c6yDA\b\u00f4\u00e1\u0084\u001dQ?Q\u0097co:QPQ\u00f2\u00f4\u0086\u0092\u00fa\u00fa\u0015\u007fV\\uL\r9\u001aV\u00d4\u0096F^\u00cd8!4V\u00c8\u00e2\u0081\u00e7Jp3\f~\u0006O;\u00e9x-s?\u00d1\u0091\u0092\u0006\u0081\u000e?x\u008cxt\u00f8\u001f\u00f7?(\u00ea\u00cf\u00f3Wm\u00cd\u0093\u0017n{4\u00d9\u0085\u001e?\u00c6\u00f2\u0085f\u00c2\u00dbh2\n?\u00d4?Q1H\u00cb\u00f7¡ãBN03j\u00f4\u00ad;\u00d4M?\u00e1\u00c2bVe\u00c4\u0006\u0081\u00fe\u00c2m\u0093j\u001a\u00ec-+]7?\u00ec\u0019?\u0097Ed\u001fd\u0082\u0006 I\u0003z\u00d8\u008eu\u0084i}\u00f3\u0083\"?SY??\u00cf\u00e1\u00c3\u00ec?M?\rW@\u0084\u00d7¡¤Y\u00c7\u00dc\u0002??h@ \u0010\u009c\u00c4\u008e\u00e4\u0088?\u001b4Aw\u00fb@\u00d0\\\u00f9\u008b\"\u00d5>\u0003\u00da\u000e\u00d3\u0096X\u00f3\u00e1t\u00ec¡ì?\u00c9\u0015\u0084&\u00c3]\u00c3\u00de\u00d0\u0015p¡¤\u00c5_@DVGB¡ì\u0085\u00f0?`\u0015M2??\u00de\u00f0\u008b:%\u00f1\u0088\u00e1/\u00dd\u00d1¡À?ge\u00f1\u0018l\u0014¡è\u00c9\u0091\u00e8\u0092p¡è\u0093\u0098¡¤V\u007f\u00c4?\u0012\u0017\u00db*\u00fe/?H0?Z\u00df\u001b iR\u0084Z¡ã\u00d5\u00d2\u0087\u0093\u00c6?k\u00c6\u0085\u0007?4u\u0006=\u00f8\f\u00d0\u00c3¡§X|SC\u00f9?S\u00d2,\u00f4¡ã\u00056r\u008f2S\u0004(`:\u00ad?\u0099u\u0012|G?\u00c1\u009b\u0083\u00df\u0095\u0084Z_\u00e1|\u009b\u0010I\u00c4]\u00e3y\u0085E\u00c6\f\u001a{s\u00e2c\u0019\u00c1\u0082\u00f18\u0010j?i<)\u009a\u00da\u00fa?\u0005L?\u001c. R\u00d6?\u00c9¡§d]m\u001c\u000b\u00c0\u00eby\u0083\u00c4b?2p\u00c2\u00d9V\u00ea?\u0016\u0098W\u0097?\u00fc\u0089\u0092\u00ed\u00c2S\u00c8\u00c2\u009c?\u008d\u0010\u0012e\rd\u00c8\u00e2\u0002p8\u0084\u0002}\u008b3e?8\u00eb?aW\u00cb5\u00c5\r-\u00df¡è+[\u0003\u0088\u00ff\u00c3\u001c(~\u00d9?K1N\u0016\u00da\r\u0087\u0003\u000e8R}\u00e2R?;\b\u00c2S-\u00c2?\u00848U\u001f\u00edp\u001a\u0099\u0016\u0000\u00ad?8\u00f5\u001cx\u00c2\u00fet¡§?\u00e2\u0082?\u009b?\u008e\u00cc1\\?d\u00e18?¡ã\u00f9\u00f4I?7AJ?_4M?¡§\u00e9?\u0018\u0096J71\u001f7\u00ea\u00ca\u0012\u00d6l\u00de?1\u001a\u00fa\u0080@\u0085¡ãi?\u00dc\u0000\u00c5?)\u00f0]\u0096\u00d9\u001d?\u00c5{=?d\u00f5R\u00d3\tA\u0089i\u00f6\u00ea_!\u00c4\u0090?g\u00cf\u00f3]A?\u000e\u0094\u00d9\u001f\u00e7[\u0010\u00d8\u00f7N¡¤:,f?\\\u0010\u0004¡è\u00eb\u001e¡èe\u00c5`#\u0007?\u00ff=?\u007f\u009b_$\u0012G\u00c3*¡¤\u0095\u0002?6n¡¤\u008e\fy\f?\u008d?\r\u0004_\u00c1\u00e9;;\u0099\u00c2\f5\u00f8L\u009ce?Q4\u00cf 3O\u0010h\u00efK\u001d[\u00e8\u0097?n\u0007\u00cfY\u00efXCw\u0092\u0088rKv\u00e6H\u0016\u0017\u001d\u00c3\u00d8\u00ff(\\\u00d3\u009a\u00e1p\u00d6x?\u001e\u00c8??&\u00d5&\u0018?\u00d4a\u00f7&\u008fE\u00ec\u00f9\u00ff\u00ec\u00cd~pf@\u0011S\u000fv\u00f7\u00e9\u00d4j\u0010\u0098\u0098\u0010~\u0092\u00c1\u0098¡¤S?R\u0082\u000b?\"?x\u00d5\u0081?^g\u00fe?\u001a|\u009e\u0081\u00ed?V\u00d4}¡§?\u0003\u00d3`?){?\u0082\u001a\u0091?J\u0083?¡¤\u009e\u0006\u00d6\u0096O\u0091\u00f9\u0014\u0095[{7\u00e6|N\u00fc\u00f3\u00de??GCA,F,\u00ca\u0092@\u00e0\u0018\u0097?\u0001\u008d\u00da\u00eae\u0093H-\u00f5R\u0007\u000f\u00e2\u0094<\u0099\u001f\u00eb\u000b\u00f2\u00fb?¡ã?\u0002\u00ecV\u00e0_\u008d6=m!5\u00e8}\u00cd?L\u00c7\u00eaq\r\u00f4-\u007f\u0091-V\u0093\u0088F?P5\u00c8I\u00d1N?\tSX\u00c4??\u00ec)\u000f4\u008f\\J?\u00c8\u00c2\n\u00cfvi?r¡À\u00d3?\u00fd)+\r\u001d\u00c6\u00f8\u00ca\u0015\u0081W\u00d8M\u0087\u00c3M\u0098\u00da?,\u00e6\u00edhr?B\u00c5\u008b\u00cdo\u0080\u0097u\u009aa\u00d3\u0086\u001d\u0012\u0002\u0003??\u0093\u00f6+;\u0004\u00d9X\u00c9ql\u00c2\u00174\u00e2?\u008c?\u00e9\u00e4\u009803\u00ed7?¡è?\u0003O\u00df\u00cc\u00db?\u00faG\u009eh\u0087\u00c2L?\u0093({\u0013$\u0011\u0088\u00d9Y>&HM\u00f0t=@\u0018y\u0018p'\u00f57\u00f6??\\?\u0085¡À\u00ef)P$\u00cb-\u00c6O\u00d6L[\u0098|Js\u0082}\u00deS7¡§\u0082h\u0018\u00c1\u00c18>>\u0087,7&\u00c1D\u00d2\u001a\u0092#\u001b?\u0093\u00d0?Fl¡§\u00830d\u008f\u00fe\u00e56#?\u000e\u0088\u00df5m\u00fe\u0080\u00dc\u00dbL?¡ì\u00f0E??Yf\u0006$\u009ba\u00daNZ\"-bwpy G\u00db?d\u000fJ?\u00e7\u0088@\u00e3\u00cd\u00edp9\u00da\u009ehU+\u00c6,\u0087\u0081\u00ad\u009eX\u0012\u001b\u00cd\u00f3?\u0012\u00ffp\r??I\u001d\u00c8¡§\u00e5\u00d0\u0095KI\u00ef\u0011\u00d6{G¡ì;zM4h??8n\u0082\u00d7B\u00cb\u0000\u00d7\u00f7¡ãc?DY \u000e?\u00d0\u00ed\u00d7?\u0002\u00e7\u0084\u00cf]\u00e4\u0015J\u00f2;`G?\u00c8Jd\rp\u008c\u0004\u00d6]\u00de?\u00fd?8\u00fa\u0097F\u00d0>:\u00caM\\\u00d1\u00ec¡ì\u0098\u00862\u000b\u0017?\u00c0\u008f\u0089{\u00dcDvZ\u0000xQ?\u0081t|\u007fX\u00e1$\u00f8\u0012\u0089CjGx\u001a\u0000\u0010\u009bi?\u0099\f\u00d9\u00cf\u00f2\u00f68}\u00e5\u009fs\u0006F\u00ef??1\u00d5?Y\u008dA\u00c6\u00f7%\n\u00cb?\u00cb`\u00ea\u00c4\u009d\u00df2¡ì\u0091\u0010?\u00cf5\u00e7\u0091\b\u00ec\u009d?4\t\u0019FfSV+\u00e0gS\u00de?\u0002\u00e3UP\u00adv\f\u00fe¡À\u00f2CC\u0007k$X\u0010\u00fc[\u0093\u0091\u00f8A\u00cf\u00f0\u0006\u00fd?[%H\u00e5D?y5Q\u0007I$\b1r\u00f8\u0089dq\u0013#zz\u0007\u0087$\u00f9\u00d6z?BK?O\t\u0013\u009e¡§k/\u00e2\u0096\u0018\u00c1\u00c9\u00cf\u00ce\u00cb\u0014???\u00c0\u00db\u00d4\u001a\u0010¡ìD\u00f6\u00deF¡è0?o]\u00ff\u00de75\u000f\u00deH}oU\u00813?\n4\u00ecB\u00c1???\u00ebu\u00e0NC\u00fd?\u0010¡è\u0096?\u00d8V?\u0007\u0094\u00f4A?:\u001d6<t?\u00c4-\u0015\r\u000ezU}_\u0001X?\u00cc??!`N\u00f3\u0011(¡ì\u00e2?(\u0013h\u00fa\u00f8w)H? \u0085?\u0090\u00f3r\u009b09¡§?[\u00e8?\u0096L<t\u009a\u00d0/¡¤\u00ef]x'`3M?\u00e4}\u0097HmV\u0083?e6\u0019\u00c8\u0087?\u00ec\u00cdz¡ìiaK\u00ee\u008f\u008d,9f\u00c8\u0015\u007f\u00177kG\u00d9\u00efJ?p\u0003\u0096i:\u00ef\u0016\t\u009c\u001b?\u0095\u009fO\u0095\u009d\u00f9r\u00dd\u0086jZh\u008d?\u008a\u0004¡ã|?N?Im\u0013\u009e?\u009b@\u00f7?}a\u00f3\\\u0090[\u0088B2\u007f~'\"W6\u00f4\u0081\u0099\u009b\u0097P\u00e5\u00e7?2\u0016)\u0003\u00fd2\u0098\u00d3W\u008f=K1\u0084\u0080iO\u00c3b\u0006\u0097A\u0091\u0004\u0007\u00eb?\u001f\u00cb\u00d2\u0092IV?\u00cb-\u00d8\u00d6\u0010?n\u008e'\u0003W\u00cf\u00c0I\r8F/\u008f\u0082O ?m\u00f9s¡ì\u00f8\u0096\f`F\u00eb%DW\u009b\u00da\u00d3~\u00ea\u0017?\u00db\u0099\u00977?\u0003\u00d3?s?¡ì a?\u0082\u00c4k\u009c\u00e0?3\u00d2\u00eet\u009chJ?W?b\u001d\u00da>\u000e??5\u00e4\u00ed\u0098;\u00ffTP;\u00fc*\u00e9\u00e0\u00f1\u00cf\u0093¡ì?6?(\n2\u00f0\u00de\u00d9x\u00fa?z\u00ddt\u0097\u00ca\u0086\u00ec\u0093?\u0016b?\u00ffA\u00f9?\u00fdPD?QkR??q?\u00dc\u00d4/\u0095\u0006lJ<\u000e<%\u00d1?\u00d6?O?\u00ad\u00ef\u00f5\u00f8??\u00f9YB\u00d9/H\u00996?\u0090?\u00e3\u0083¡¤CZ\u0014¡è\u0019_M¡èL\u008dng?¡§mC\u00847#U\u008f\u00da?99?\u0080v\u0083\u00d9Z\u00f9\u001d]\u0014z\u00cb\u00efE\u00dbF)zoe\f\u0099M\u00f4\u00e3\u00ce\u0001-\u0004V:\u00cc\u00c3+\u00c3\u00f6\u001d-4/\u001e~?W\t\u000f??v1I\u008a\u00986\u008a#+\u00c2\n\u0085¡ìh\u00f8\u0099Q@t\u0014\u00e4\u0097\n\u008a@\u00fc\u00e6?\u00c7\u00eb?Dl??V\u00f5\u00fe\u0095a\u0085t\t\u0099l\u0018\u00d4\u00cf\u0000\u00ddu6\u0014\u00cb\u0014%-D\u0085~\u00c2c\u00db\u0093¡ì\u00c6\u00c10\u0000\u0016l\u00ea\u0083\u0089n\u00963R+\u00fa\u00cf¡À\u0002Mi\u00eb\u008d?\b?pf{2\u00e9\\7\u00f3\u000e\u0003H\u0091R\u0011\u00c9L?\u000fC\u001ejZ@\b\u00c8\u00ccH?[\u0001E\u00df\u00de~\u0088\u00e6\u009d\u001c#\u00d7?\u00dbb\u008a\r\u0092>\u0002\u00d1\u00fd\u00adw?\u00dcA\u00df\u008a\u0018?\u00c3)\u00da\u00cf\u009e'\u0088M@l?\u0002j\"qK\u0086\u000f~1?\u0085\u00c2\u0003y\u00df`\u0086GK?n'\u00e0X\u0000??\u00faR0E\u00c8i\u00eeA\u0084cD\u0015u)\u00ca\\\u00d3=L\u0001\u001a?\u009fy?\u0084tn\u000b\u00d46S?\u00e92A?%F,1F\u000eZe\u0011\u00e7\u00e6X$#@?\u0019\u001d\u0087\u008d\u0004\r\u0004??\u00ddmP'\u00f6?\u00e3?u7A\u00d7&???\u008b9\u00ca?y6??K\u0004?\u001e)i>?E'\u00ff!4V\u00d1\u00ce8j\u00e8U\u0090`\u00e6\u0000qSC\u008ak$@R\u00f2\u00d6\u00c4iAp\u00e7\f\u009d\u00f70\u0016\u000e\u001a?\u0084\\E?E<\u00e9W\u009f\u00142\u0094\u0006??c-<\u0007\u00f4\u00fe\u00ad\u009e?\u00e8\u00f5\u008c:p\u00cb.??i¡¤\u00d5?\u00d2\u00d4~p\u0095B0\u00cc?bV8\u0085\u00d8\u00d3¡ã\u0097\u00c0\u00184-\u00cb\u00c1\u00d9'?\u00cf\u0089gGS_?\u0099\u0092d_}k?{\u00e3!:#G*\u0098\u00c0\u000f~\u0012E\u008a\u00c3#'\u0093\u00f0\u00e6\u00f09?\u00e9}\u0014j\u0081\u0010\u0095\r¡§\u009e\u00d9\u00f2\u001f?\f?1sd\u00fe\u001e{ \u0083#&\u009c\u0096\u00f2¡ãn\u00d0jrD?yi\u00103?W\u00ce?\u00e6?G\u0018\r\u00f5\u00e6\u00d8\u0015;q\u00c0\u0004\u00ff\u0089dt\u00ef\u0018\u0017J\u00c3{\u00db?¡À\u0088K@\u00dc\u00e6\u00c9\u008c\\w\u000b\u00c8;?\\_P\u00caUw\u001c;U\u0003\u0090Ku\u008c@\u00c5E\u0092\u00f0??\u00c8U\u001d\u00d1MwN\u00fdHU\u009e\u00e7\u00e5d\u0096\u00d4A\u00dau\u0007\u00e49(\u00d9\u00cd\u00e0y??\u0003;?\u00c4?\u001b?\u009e1\u00ff\u0086\u0000\u00c6\u0018\u001d)?\u00eb\u0082\u0002g-\u008a\u00c6\u00f4}\u00d3\u00d8[\u0001\u0095\u008dRp¡§?yW\u0092\u00d5\u00cakU\u00e0\u00f3\u0007\u00f1\u00fd??\u0006\u0000B\u0014G\u001d\u0096¡è\u009c\u0003\u0093\u008a?8\u0019?dR0?Y?}\u00dcM?9?\u001dC(\u00e8\u00cc\u00dc\u0081\u008f\\y\u00dc\u00c2X\u0000¡À8??j[)\u00f3\u00953\u0097-?\u00d2J?\u0096\u00fa.i\u00fe\u0085\u00c6\u0018\u00ce\u0000¡ã\u00ca/>0=??$\u00d0\u00d2/\u00161\u00db\u00c6\u00d5N\u008bD\u0099\u0082 \u008a\u00e9\u0082?1\u00ca4GP\u00f7\u0082\n\u00c1_3\u00d0x\u00c2\u00fe(C\u00c5R\b\u00ffQU\u00e8?\u00d2\u0096¡§h\u00c3 Dy\u00f9?\u0016\u009cD\u00fd\u000e_/\u001c?\u00059?\u00c9*\u0080\u00fbzw[\u00df~\u0080bwO7\u00e7\u009d?¡ã\n??\u00df\u00cf\u00df?\u00e0\u00fd?b¡èG)\u0012\u0083g\u00d9cg?@?\u000ep\u00c3?\u00fc?c9\b\u00e7\u00c3\u0015\u00c3=\u00ad5\u00da?\u0014\u0017\u009b\u0088b'?\u00fe\u00dd.E\u00c4\u0010\u0091\u00ca^\u001cmw\u0096\u00da\u00f8\u00e0??\u00ef_\u0018Q\u0013\u00db\u00f6\u0007xMVS\u009f¡§D\u001b\u0007\u009a\u0007\u00ef¡ã#F\u001c¡ã\u001d\t02\u00cc?f`\u0094\u00e2v\u0010#q\u00ef\u00f5\u00d4\u00db=?\u0083\u00feM?*H\r?M\u0084c3\u0091\u00eb?T\u008c\u0099?\u008d\u00c6\u00ee\u00ca?\u008dz\u00ecWV\u00e9\u0011").length();
        int n4 = 32;
        int n5 = -1;
    Label_0160:
        while (true) {
            while (true) {
                ++n5;
                final String s2 = s;
                final int beginIndex = n5;
                String s3 = s2.substring(beginIndex, beginIndex + n4);
                int n6 = -1;
                while (true) {
                    final String intern = a(instance.doFinal(s3.getBytes("ISO-8859-1"))).intern();
                    switch (n6) {
                        default: {
                            b2[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                continue Label_0160;
                            }
                            n3 = (s = "\u0082#<\u0085¡¤O\u00dbzw\u0088R?8\u00ebB\u00c3P?\u00c7\u0096IZw\u0090\u0016S\u0013\f\u00c5z\u00c7\u00e8~x\u0099\u0098\\`@$\t\u00d0\u00885#\u00e7yn\u00d6\u0013\u00de\u00d0\u00ca?\u00f0\u00ad\u0093\u00c2¡¤¡ã¡§\u00ad?\u00db[?\u00e7?J\u00ea\"\u00c8?}\u008f:?n\u0080\u00ef\u00da\u00f4\u00ff\u001a\u00ddp\u0082\u00adU\u00ddF?\u001e\u00f0\t¡¤?").length();
                            n4 = 16;
                            n5 = -1;
                            break;
                        }
                        case 0: {
                            b2[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                break;
                            }
                            break Label_0160;
                        }
                    }
                    ++n5;
                    final String s4 = s;
                    final int beginIndex2 = n5;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n4);
                    n6 = 0;
                }
            }
            break;
        }
        b = b2;
        c = new String[52];
        final Cipher instance3 = Cipher.getInstance("DES/CBC/NoPadding");
        final int opmode2 = 2;
        final SecretKeyFactory instance4 = SecretKeyFactory.getInstance("DES");
        final byte[] key2 = new byte[8];
        key2[0] = (byte)(n >>> 56);
        for (int j = 1; j < 8; ++j) {
            key2[j] = (byte)(n << j * 8 >>> 56);
        }
        instance3.init(opmode2, instance4.generateSecret(new DESKeySpec(key2)), new IvParameterSpec(new byte[8]));
        final long[] array = new long[24];
        int n7 = 0;
        String s5;
        int n8 = (s5 = "^sQm\u001c\u00fch?\u00d4\u0088$V{\u008c¡¤\u0087\u00ee\u0015;\u009f\u0019\u009en\u00c4?\u00e2#X\u00famh\u00d8\u001f5\u00de~P\u0006\u00ad\u008c\u008b\u00ed\u00f5L\u0014\u00fbwV\u00eb\u00f21b\u00106\u00cb<?\u00f3\u008a\u00e8K\u00cc\u0004\u007f\u0086\u0013\u00fc?\u009c\u001d;I\u00f8e\u001fo3?\u00c4Y\u00999\u00c3\u00ce|vo\u0003\u0010\u00da\u00c0¡ãRO\u0012'\u00fe\u009a\u00f0@?\u00d3\u00f1\u0018a\u00dfW?.&\u008b\u00fe\u00ade\u000e?\u008e\t4\f\u007ft!q\u00e6\u008f2*?l¡èl\u0019\u00f20G\u00c6C\u000b\u00ee0¡Ày\"\u00cbk???\u0083P\u000f:B\u00adF\u00eb\u0095\u00c8n\u00de\u0017\u007f\u00ad\u001c\u00cc?\u00e5\u00c3\u00f5\u008ed\u0080?]\u00cf").length();
        int n9 = 0;
    Label_0441:
        while (true) {
            while (true) {
                final String s6 = s5;
                final int beginIndex3 = n9;
                n9 += 8;
                final byte[] bytes = s6.substring(beginIndex3, n9).getBytes("ISO-8859-1");
                long[] array3;
                long[] array2 = array3 = array;
                int n11;
                int n10 = n11 = n7;
                ++n7;
                long n12 = ((long)bytes[0] & 0xFFL) << 56 | ((long)bytes[1] & 0xFFL) << 48 | ((long)bytes[2] & 0xFFL) << 40 | ((long)bytes[3] & 0xFFL) << 32 | ((long)bytes[4] & 0xFFL) << 24 | ((long)bytes[5] & 0xFFL) << 16 | ((long)bytes[6] & 0xFFL) << 8 | ((long)bytes[7] & 0xFFL);
                int n13 = -1;
                while (true) {
                    final long n14 = n12;
                    final byte[] doFinal = instance3.doFinal(new byte[] { (byte)(n14 >>> 56), (byte)(n14 >>> 48), (byte)(n14 >>> 40), (byte)(n14 >>> 32), (byte)(n14 >>> 24), (byte)(n14 >>> 16), (byte)(n14 >>> 8), (byte)n14 });
                    final long n15 = ((long)doFinal[0] & 0xFFL) << 56 | ((long)doFinal[1] & 0xFFL) << 48 | ((long)doFinal[2] & 0xFFL) << 40 | ((long)doFinal[3] & 0xFFL) << 32 | ((long)doFinal[4] & 0xFFL) << 24 | ((long)doFinal[5] & 0xFFL) << 16 | ((long)doFinal[6] & 0xFFL) << 8 | ((long)doFinal[7] & 0xFFL);
                    switch (n13) {
                        default: {
                            array3[n11] = n15;
                            if (n9 >= n8) {
                                n8 = (s5 = "3\u0085\u00e4x\u00fd|\u008b,\u0090cr\u009b?\u00f2bv").length();
                                n9 = 0;
                                break;
                            }
                            continue Label_0441;
                        }
                        case 0: {
                            array2[n10] = n15;
                            if (n9 >= n8) {
                                break Label_0441;
                            }
                            break;
                        }
                    }
                    final String s7 = s5;
                    final int beginIndex4 = n9;
                    n9 += 8;
                    final byte[] bytes2 = s7.substring(beginIndex4, n9).getBytes("ISO-8859-1");
                    array2 = (array3 = array);
                    n10 = (n11 = n7);
                    ++n7;
                    n12 = (((long)bytes2[0] & 0xFFL) << 56 | ((long)bytes2[1] & 0xFFL) << 48 | ((long)bytes2[2] & 0xFFL) << 40 | ((long)bytes2[3] & 0xFFL) << 32 | ((long)bytes2[4] & 0xFFL) << 24 | ((long)bytes2[5] & 0xFFL) << 16 | ((long)bytes2[6] & 0xFFL) << 8 | ((long)bytes2[7] & 0xFFL));
                    n13 = 0;
                }
            }
            break;
        }
        final String[] array4 = new String[(int)array[11]];
        array4[0] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_3.invoke(11692, 0x642253B753E71B36L ^ n);
        array4[1] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_4.invoke(25183, 0x7D3A3CDC6F9B54FCL ^ n);
        array4[2] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_5.invoke(13428, 0x47B6D9893ECD82F3L ^ n);
        array4[3] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_6.invoke(5089, 0x144A54ED51E3254EL ^ n);
        array4[4] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_7.invoke(23329, 0x3EB6D4E6575D6D9FL ^ n);
        array4[5] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_8.invoke(15871, 0x1B17C96FFA848B76L ^ n);
        array4[(int)array[7]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_9.invoke(27687, 0x38FC4D12F02DDAB4L ^ n);
        array4[(int)array[21]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_10.invoke(7980, 0x2451B4A8ADC9A9A2L ^ n);
        array4[(int)array[15]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_11.invoke(15701, 0x774FD4E931090BFFL ^ n);
        array4[(int)array[20]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_12.invoke(32051, 0x4737A21801B64BBBL ^ n);
        array4[(int)array[9]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_13.invoke(15595, 0x5114BCEE8C960A73L ^ n);
        array4[(int)array[14]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_14.invoke(29511, 0x65DBDBF51F1345C2L ^ n);
        array4[(int)array[2]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_15.invoke(18245, 0x63A9BB28809471E3L ^ n);
        array4[(int)array[19]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_16.invoke(4181, 0x5C304D45B59426DEL ^ n);
        array4[(int)array[6]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_17.invoke(5000, 0x16DAB90777B8A51CL ^ n);
        array4[(int)array[12]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_18.invoke(28519, 0x112FE155B23459CCL ^ n);
        array4[(int)array[10]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_19.invoke(8674, 0x495AA27FF3F09766L ^ n);
        array4[(int)array[18]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_20.invoke(4460, 0x70CEA19F9BE727F2L ^ n);
        array4[(int)array[23]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_21.invoke(25963, 0x66E11172A90BD3E8L ^ n);
        array4[(int)array[16]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_22.invoke(9531, 0x6820F13521EA1393L ^ n);
        array4[(int)array[4]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_23.invoke(15509, 0x2059B080544C8A07L ^ n);
        array4[(int)array[17]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_24.invoke(10420, 0x10E8D562A3C69E2FL ^ n);
        array4[(int)array[13]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_25.invoke(27681, 0x2B82DB81B21C5A88L ^ n);
        array4[(int)array[8]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_26.invoke(21016, 0x7806E2D365A2E4A4L ^ n);
        array4[(int)array[1]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_27.invoke(14092, 0x68B618ECFD068181L ^ n);
        array4[(int)array[0]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_28.invoke(18254, 0x3CBD5DCC014C71E9L ^ n);
        array4[(int)array[22]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_29.invoke(13171, 0x80D3850C54E05D2L ^ n);
        array4[(int)array[5]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_30.invoke(29919, 0x5150EB551F3E424EL ^ n);
        array4[(int)array[3]] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_31.invoke(2022, 0x177CB0DA5F78B171L ^ n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_32.invoke(array4, -9169564917804493474L, n);
    }
    
    public void focusLost(final FocusEvent focusEvent) {
        final long n = cx.a ^ 0x1711401FEC26L;
        final long l = n ^ 0x20015FA91E9L;
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_34.invoke(ProcyonInvokeDynamicHelper_33.invoke(this, -1582815061842452204L, n), " ", -577513244606236118L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_36.invoke(this, new Object[] { l, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_35.invoke(focusEvent, -1006556534552475063L, n) }, -772502992537091526L, n);
    }
    
    void q(final Object[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: iconst_0       
        //     3: aaload         
        //     4: checkcast       Ljava/lang/Long;
        //     7: invokevirtual   java/lang/Long.longValue:()J
        //    10: lstore_2       
        //    11: dup            
        //    12: iconst_1       
        //    13: aaload         
        //    14: checkcast       Ljava/lang/Object;
        //    17: astore          4
        //    19: pop            
        //    20: getstatic       com/zelix/cx.a:J
        //    23: lload_2        
        //    24: lxor           
        //    25: lstore_2       
        //    26: lload_2        
        //    27: dup2           
        //    28: ldc2_w          36173988862028
        //    31: lxor           
        //    32: lstore          5
        //    34: dup2           
        //    35: ldc2_w          46522218330718
        //    38: lxor           
        //    39: lstore          7
        //    41: dup2           
        //    42: ldc2_w          78208985420978
        //    45: lxor           
        //    46: lstore          9
        //    48: dup2           
        //    49: ldc2_w          78946549504916
        //    52: lxor           
        //    53: lstore          11
        //    55: dup2           
        //    56: ldc2_w          68312601541081
        //    59: lxor           
        //    60: lstore          13
        //    62: dup2           
        //    63: ldc2_w          7841255167007
        //    66: lxor           
        //    67: lstore          15
        //    69: dup2           
        //    70: ldc2_w          127304173233082
        //    73: lxor           
        //    74: lstore          17
        //    76: dup2           
        //    77: ldc2_w          60920224599259
        //    80: lxor           
        //    81: lstore          19
        //    83: pop2           
        //    84: ldc2_w          8378164365231129269
        //    87: lload_2        
        //    88: invokedynamic   BootstrapMethod #6, h:(JJ)[Lcom/zelix/_0;
        //    93: astore          21
        //    95: aload           4
        //    97: aload_0        
        //    98: ldc2_w          8073693693794897814
        //   101: lload_2        
        //   102: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   107: aload           21
        //   109: ifnonnull       602
        //   112: if_acmpne       577
        //   115: goto            128
        //   118: ldc2_w          8106757175173102391
        //   121: lload_2        
        //   122: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   127: athrow         
        //   128: aload_0        
        //   129: ldc2_w          8073693693794897814
        //   132: lload_2        
        //   133: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   138: ldc2_w          8138861610286163043
        //   141: lload_2        
        //   142: invokedynamic   BootstrapMethod #9, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   147: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   150: astore          22
        //   152: aload           22
        //   154: invokevirtual   java/lang/String.length:()I
        //   157: lload_2        
        //   158: lconst_0       
        //   159: lcmp           
        //   160: iflt            356
        //   163: aload           21
        //   165: ifnonnull       356
        //   168: ifne            336
        //   171: goto            184
        //   174: ldc2_w          8106757175173102391
        //   177: lload_2        
        //   178: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   183: athrow         
        //   184: aload_0        
        //   185: ldc2_w          8073693693794897814
        //   188: lload_2        
        //   189: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   194: aload_0        
        //   195: ldc2_w          8205547265796523396
        //   198: lload_2        
        //   199: invokedynamic   BootstrapMethod #10, v:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   204: lload           9
        //   206: iconst_1       
        //   207: anewarray       Ljava/lang/Object;
        //   210: dup_x2         
        //   211: dup_x2         
        //   212: pop            
        //   213: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   216: iconst_0       
        //   217: swap           
        //   218: aastore        
        //   219: ldc2_w          8152027497588285283
        //   222: lload_2        
        //   223: invokedynamic   BootstrapMethod #11, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String;
        //   228: ldc2_w          8160451938057168876
        //   231: lload_2        
        //   232: invokedynamic   BootstrapMethod #12, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   237: aload_0        
        //   238: ldc2_w          8176381461389923584
        //   241: lload_2        
        //   242: invokedynamic   BootstrapMethod #13, v:(Ljava/lang/Object;JJ)Ljavax/swing/JFrame;
        //   247: lload           11
        //   249: sipush          30136
        //   252: ldc2_w          7111299737159608549
        //   255: lload_2        
        //   256: lxor           
        //   257: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //   262: sipush          20666
        //   265: ldc2_w          8851829574121000404
        //   268: lload_2        
        //   269: lxor           
        //   270: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //   275: iconst_4       
        //   276: anewarray       Ljava/lang/Object;
        //   279: dup_x1         
        //   280: swap           
        //   281: iconst_3       
        //   282: swap           
        //   283: aastore        
        //   284: dup_x1         
        //   285: swap           
        //   286: iconst_2       
        //   287: swap           
        //   288: aastore        
        //   289: dup_x2         
        //   290: dup_x2         
        //   291: pop            
        //   292: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   295: iconst_1       
        //   296: swap           
        //   297: aastore        
        //   298: dup_x1         
        //   299: swap           
        //   300: iconst_0       
        //   301: swap           
        //   302: aastore        
        //   303: ldc2_w          8017848895596455115
        //   306: lload_2        
        //   307: invokedynamic   BootstrapMethod #14, h:(Ljava/lang/Object;JJ)V
        //   312: aload           21
        //   314: lload_2        
        //   315: lconst_0       
        //   316: lcmp           
        //   317: ifle            568
        //   320: ifnull          566
        //   323: goto            336
        //   326: ldc2_w          8106757175173102391
        //   329: lload_2        
        //   330: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   335: athrow         
        //   336: aload           22
        //   338: ldc             "*"
        //   340: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   343: goto            356
        //   346: ldc2_w          8106757175173102391
        //   349: lload_2        
        //   350: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   355: athrow         
        //   356: iconst_m1      
        //   357: if_icmpeq       512
        //   360: aload_0        
        //   361: ldc2_w          8073693693794897814
        //   364: lload_2        
        //   365: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   370: aload_0        
        //   371: ldc2_w          8205547265796523396
        //   374: lload_2        
        //   375: invokedynamic   BootstrapMethod #10, v:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   380: lload           9
        //   382: iconst_1       
        //   383: anewarray       Ljava/lang/Object;
        //   386: dup_x2         
        //   387: dup_x2         
        //   388: pop            
        //   389: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   392: iconst_0       
        //   393: swap           
        //   394: aastore        
        //   395: ldc2_w          8152027497588285283
        //   398: lload_2        
        //   399: invokedynamic   BootstrapMethod #11, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String;
        //   404: ldc2_w          8160451938057168876
        //   407: lload_2        
        //   408: invokedynamic   BootstrapMethod #12, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   413: aload_0        
        //   414: ldc2_w          8176381461389923584
        //   417: lload_2        
        //   418: invokedynamic   BootstrapMethod #13, v:(Ljava/lang/Object;JJ)Ljavax/swing/JFrame;
        //   423: lload           11
        //   425: sipush          10283
        //   428: ldc2_w          388029629528044883
        //   431: lload_2        
        //   432: lxor           
        //   433: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //   438: sipush          3827
        //   441: ldc2_w          2249181588511675286
        //   444: lload_2        
        //   445: lxor           
        //   446: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //   451: iconst_4       
        //   452: anewarray       Ljava/lang/Object;
        //   455: dup_x1         
        //   456: swap           
        //   457: iconst_3       
        //   458: swap           
        //   459: aastore        
        //   460: dup_x1         
        //   461: swap           
        //   462: iconst_2       
        //   463: swap           
        //   464: aastore        
        //   465: dup_x2         
        //   466: dup_x2         
        //   467: pop            
        //   468: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   471: iconst_1       
        //   472: swap           
        //   473: aastore        
        //   474: dup_x1         
        //   475: swap           
        //   476: iconst_0       
        //   477: swap           
        //   478: aastore        
        //   479: ldc2_w          8017848895596455115
        //   482: lload_2        
        //   483: invokedynamic   BootstrapMethod #14, h:(Ljava/lang/Object;JJ)V
        //   488: aload           21
        //   490: lload_2        
        //   491: lconst_0       
        //   492: lcmp           
        //   493: iflt            568
        //   496: ifnull          566
        //   499: goto            512
        //   502: ldc2_w          8106757175173102391
        //   505: lload_2        
        //   506: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   511: athrow         
        //   512: aload_0        
        //   513: ldc2_w          8205547265796523396
        //   516: lload_2        
        //   517: invokedynamic   BootstrapMethod #10, v:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   522: aload           22
        //   524: lload           5
        //   526: iconst_2       
        //   527: anewarray       Ljava/lang/Object;
        //   530: dup_x2         
        //   531: dup_x2         
        //   532: pop            
        //   533: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   536: iconst_1       
        //   537: swap           
        //   538: aastore        
        //   539: dup_x1         
        //   540: swap           
        //   541: iconst_0       
        //   542: swap           
        //   543: aastore        
        //   544: ldc2_w          7950510356359878291
        //   547: lload_2        
        //   548: invokedynamic   BootstrapMethod #12, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   553: goto            566
        //   556: ldc2_w          8106757175173102391
        //   559: lload_2        
        //   560: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   565: athrow         
        //   566: aload           21
        //   568: lload_2        
        //   569: lconst_0       
        //   570: lcmp           
        //   571: iflt            579
        //   574: ifnull          1337
        //   577: aload           4
        //   579: aload_0        
        //   580: ldc2_w          8300695288628650048
        //   583: lload_2        
        //   584: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   589: goto            602
        //   592: ldc2_w          8106757175173102391
        //   595: lload_2        
        //   596: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   601: athrow         
        //   602: aload           21
        //   604: lload_2        
        //   605: lconst_0       
        //   606: lcmp           
        //   607: iflt            938
        //   610: ifnonnull       930
        //   613: if_acmpne       905
        //   616: goto            629
        //   619: ldc2_w          8106757175173102391
        //   622: lload_2        
        //   623: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   628: athrow         
        //   629: aload_0        
        //   630: ldc2_w          8300695288628650048
        //   633: lload_2        
        //   634: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   639: ldc2_w          8138861610286163043
        //   642: lload_2        
        //   643: invokedynamic   BootstrapMethod #9, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   648: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   651: astore          22
        //   653: aload           21
        //   655: lload_2        
        //   656: lconst_0       
        //   657: lcmp           
        //   658: iflt            831
        //   661: ifnonnull       829
        //   664: aload           22
        //   666: ldc             "*"
        //   668: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   671: iconst_m1      
        //   672: if_icmpeq       840
        //   675: goto            688
        //   678: ldc2_w          8106757175173102391
        //   681: lload_2        
        //   682: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   687: athrow         
        //   688: aload_0        
        //   689: ldc2_w          8300695288628650048
        //   692: lload_2        
        //   693: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   698: aload_0        
        //   699: ldc2_w          8205547265796523396
        //   702: lload_2        
        //   703: invokedynamic   BootstrapMethod #10, v:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   708: lload           17
        //   710: iconst_1       
        //   711: anewarray       Ljava/lang/Object;
        //   714: dup_x2         
        //   715: dup_x2         
        //   716: pop            
        //   717: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   720: iconst_0       
        //   721: swap           
        //   722: aastore        
        //   723: ldc2_w          7782037179455338312
        //   726: lload_2        
        //   727: invokedynamic   BootstrapMethod #11, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String;
        //   732: ldc2_w          8160451938057168876
        //   735: lload_2        
        //   736: invokedynamic   BootstrapMethod #12, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   741: aload_0        
        //   742: ldc2_w          8176381461389923584
        //   745: lload_2        
        //   746: invokedynamic   BootstrapMethod #13, v:(Ljava/lang/Object;JJ)Ljavax/swing/JFrame;
        //   751: lload           11
        //   753: sipush          10283
        //   756: ldc2_w          388029629528044883
        //   759: lload_2        
        //   760: lxor           
        //   761: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //   766: sipush          10377
        //   769: ldc2_w          1026921370943649233
        //   772: lload_2        
        //   773: lxor           
        //   774: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //   779: iconst_4       
        //   780: anewarray       Ljava/lang/Object;
        //   783: dup_x1         
        //   784: swap           
        //   785: iconst_3       
        //   786: swap           
        //   787: aastore        
        //   788: dup_x1         
        //   789: swap           
        //   790: iconst_2       
        //   791: swap           
        //   792: aastore        
        //   793: dup_x2         
        //   794: dup_x2         
        //   795: pop            
        //   796: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   799: iconst_1       
        //   800: swap           
        //   801: aastore        
        //   802: dup_x1         
        //   803: swap           
        //   804: iconst_0       
        //   805: swap           
        //   806: aastore        
        //   807: ldc2_w          8017848895596455115
        //   810: lload_2        
        //   811: invokedynamic   BootstrapMethod #14, h:(Ljava/lang/Object;JJ)V
        //   816: goto            829
        //   819: ldc2_w          8106757175173102391
        //   822: lload_2        
        //   823: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   828: athrow         
        //   829: aload           21
        //   831: lload_2        
        //   832: lconst_0       
        //   833: lcmp           
        //   834: ifle            896
        //   837: ifnull          894
        //   840: aload_0        
        //   841: ldc2_w          8205547265796523396
        //   844: lload_2        
        //   845: invokedynamic   BootstrapMethod #10, v:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   850: aload           22
        //   852: lload           13
        //   854: iconst_2       
        //   855: anewarray       Ljava/lang/Object;
        //   858: dup_x2         
        //   859: dup_x2         
        //   860: pop            
        //   861: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   864: iconst_1       
        //   865: swap           
        //   866: aastore        
        //   867: dup_x1         
        //   868: swap           
        //   869: iconst_0       
        //   870: swap           
        //   871: aastore        
        //   872: ldc2_w          8348679592228995541
        //   875: lload_2        
        //   876: invokedynamic   BootstrapMethod #12, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   881: goto            894
        //   884: ldc2_w          8106757175173102391
        //   887: lload_2        
        //   888: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   893: athrow         
        //   894: aload           21
        //   896: lload_2        
        //   897: lconst_0       
        //   898: lcmp           
        //   899: iflt            907
        //   902: ifnull          1337
        //   905: aload           4
        //   907: aload_0        
        //   908: ldc2_w          7531564550481248521
        //   911: lload_2        
        //   912: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   917: goto            930
        //   920: ldc2_w          8106757175173102391
        //   923: lload_2        
        //   924: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   929: athrow         
        //   930: lload_2        
        //   931: lconst_0       
        //   932: lcmp           
        //   933: iflt            1258
        //   936: aload           21
        //   938: ifnonnull       1258
        //   941: if_acmpne       1233
        //   944: goto            957
        //   947: ldc2_w          8106757175173102391
        //   950: lload_2        
        //   951: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   956: athrow         
        //   957: aload_0        
        //   958: ldc2_w          7531564550481248521
        //   961: lload_2        
        //   962: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   967: ldc2_w          8138861610286163043
        //   970: lload_2        
        //   971: invokedynamic   BootstrapMethod #9, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //   976: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   979: astore          22
        //   981: aload           21
        //   983: lload_2        
        //   984: lconst_0       
        //   985: lcmp           
        //   986: ifle            1159
        //   989: ifnonnull       1157
        //   992: aload           22
        //   994: ldc             "*"
        //   996: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   999: iconst_m1      
        //  1000: if_icmpeq       1168
        //  1003: goto            1016
        //  1006: ldc2_w          8106757175173102391
        //  1009: lload_2        
        //  1010: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1015: athrow         
        //  1016: aload_0        
        //  1017: ldc2_w          7531564550481248521
        //  1020: lload_2        
        //  1021: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //  1026: aload_0        
        //  1027: ldc2_w          8205547265796523396
        //  1030: lload_2        
        //  1031: invokedynamic   BootstrapMethod #10, v:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //  1036: lload           19
        //  1038: iconst_1       
        //  1039: anewarray       Ljava/lang/Object;
        //  1042: dup_x2         
        //  1043: dup_x2         
        //  1044: pop            
        //  1045: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1048: iconst_0       
        //  1049: swap           
        //  1050: aastore        
        //  1051: ldc2_w          8104821283686989742
        //  1054: lload_2        
        //  1055: invokedynamic   BootstrapMethod #11, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String;
        //  1060: ldc2_w          8160451938057168876
        //  1063: lload_2        
        //  1064: invokedynamic   BootstrapMethod #12, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //  1069: aload_0        
        //  1070: ldc2_w          8176381461389923584
        //  1073: lload_2        
        //  1074: invokedynamic   BootstrapMethod #13, v:(Ljava/lang/Object;JJ)Ljavax/swing/JFrame;
        //  1079: lload           11
        //  1081: sipush          10283
        //  1084: ldc2_w          388029629528044883
        //  1087: lload_2        
        //  1088: lxor           
        //  1089: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //  1094: sipush          25273
        //  1097: ldc2_w          2119926327461363678
        //  1100: lload_2        
        //  1101: lxor           
        //  1102: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //  1107: iconst_4       
        //  1108: anewarray       Ljava/lang/Object;
        //  1111: dup_x1         
        //  1112: swap           
        //  1113: iconst_3       
        //  1114: swap           
        //  1115: aastore        
        //  1116: dup_x1         
        //  1117: swap           
        //  1118: iconst_2       
        //  1119: swap           
        //  1120: aastore        
        //  1121: dup_x2         
        //  1122: dup_x2         
        //  1123: pop            
        //  1124: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1127: iconst_1       
        //  1128: swap           
        //  1129: aastore        
        //  1130: dup_x1         
        //  1131: swap           
        //  1132: iconst_0       
        //  1133: swap           
        //  1134: aastore        
        //  1135: ldc2_w          8017848895596455115
        //  1138: lload_2        
        //  1139: invokedynamic   BootstrapMethod #14, h:(Ljava/lang/Object;JJ)V
        //  1144: goto            1157
        //  1147: ldc2_w          8106757175173102391
        //  1150: lload_2        
        //  1151: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1156: athrow         
        //  1157: aload           21
        //  1159: lload_2        
        //  1160: lconst_0       
        //  1161: lcmp           
        //  1162: iflt            1224
        //  1165: ifnull          1222
        //  1168: aload_0        
        //  1169: ldc2_w          8205547265796523396
        //  1172: lload_2        
        //  1173: invokedynamic   BootstrapMethod #10, v:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //  1178: aload           22
        //  1180: lload           15
        //  1182: iconst_2       
        //  1183: anewarray       Ljava/lang/Object;
        //  1186: dup_x2         
        //  1187: dup_x2         
        //  1188: pop            
        //  1189: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1192: iconst_1       
        //  1193: swap           
        //  1194: aastore        
        //  1195: dup_x1         
        //  1196: swap           
        //  1197: iconst_0       
        //  1198: swap           
        //  1199: aastore        
        //  1200: ldc2_w          8088590635939338644
        //  1203: lload_2        
        //  1204: invokedynamic   BootstrapMethod #12, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //  1209: goto            1222
        //  1212: ldc2_w          8106757175173102391
        //  1215: lload_2        
        //  1216: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1221: athrow         
        //  1222: aload           21
        //  1224: lload_2        
        //  1225: lconst_0       
        //  1226: lcmp           
        //  1227: ifle            1235
        //  1230: ifnull          1337
        //  1233: aload           4
        //  1235: aload_0        
        //  1236: ldc2_w          8067441523677993830
        //  1239: lload_2        
        //  1240: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //  1245: goto            1258
        //  1248: ldc2_w          8106757175173102391
        //  1251: lload_2        
        //  1252: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1257: athrow         
        //  1258: if_acmpne       1337
        //  1261: aload_0        
        //  1262: ldc2_w          8205547265796523396
        //  1265: lload_2        
        //  1266: invokedynamic   BootstrapMethod #10, v:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //  1271: aload_0        
        //  1272: ldc2_w          8067441523677993830
        //  1275: lload_2        
        //  1276: invokedynamic   BootstrapMethod #7, v:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //  1281: ldc2_w          8138861610286163043
        //  1284: lload_2        
        //  1285: invokedynamic   BootstrapMethod #9, w:(Ljava/lang/Object;JJ)Ljava/lang/String;
        //  1290: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1293: lload           7
        //  1295: dup2_x1        
        //  1296: pop2           
        //  1297: iconst_2       
        //  1298: anewarray       Ljava/lang/Object;
        //  1301: dup_x1         
        //  1302: swap           
        //  1303: iconst_1       
        //  1304: swap           
        //  1305: aastore        
        //  1306: dup_x2         
        //  1307: dup_x2         
        //  1308: pop            
        //  1309: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1312: iconst_0       
        //  1313: swap           
        //  1314: aastore        
        //  1315: ldc2_w          8582155470751819347
        //  1318: lload_2        
        //  1319: invokedynamic   BootstrapMethod #12, w:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //  1324: goto            1337
        //  1327: ldc2_w          8106757175173102391
        //  1330: lload_2        
        //  1331: invokedynamic   BootstrapMethod #8, h:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1336: athrow         
        //  1337: return         
        //    StackMapTable: 00 32 FF 00 76 00 0D 07 00 89 07 00 0C 04 07 00 53 04 04 04 04 04 04 04 04 07 00 C7 00 01 07 00 9E 09 FF 00 2D 00 0E 07 00 89 07 00 0C 04 07 00 53 04 04 04 04 04 04 04 04 07 00 C7 07 00 01 00 01 07 00 9E 09 F7 00 8D 07 00 9E 09 49 07 00 9E 49 01 F7 00 91 07 00 9E 09 6B 07 00 9E 09 41 07 00 C7 FA 00 08 41 07 00 53 4C 07 00 9E FF 00 09 00 0D 07 00 89 07 00 0C 04 07 00 53 04 04 04 04 04 04 04 04 07 00 C7 00 02 07 00 53 07 00 41 50 07 00 9E 09 FF 00 30 00 0E 07 00 89 07 00 0C 04 07 00 53 04 04 04 04 04 04 04 04 07 00 C7 07 00 01 00 01 07 00 9E 09 F7 00 82 07 00 9E 09 41 07 00 C7 08 6B 07 00 9E 09 41 07 00 C7 FA 00 08 41 07 00 53 4C 07 00 9E FF 00 09 00 0D 07 00 89 07 00 0C 04 07 00 53 04 04 04 04 04 04 04 04 07 00 C7 00 02 07 00 53 07 00 41 FF 00 07 00 0D 07 00 89 07 00 0C 04 07 00 53 04 04 04 04 04 04 04 04 07 00 C7 00 03 07 00 53 07 00 41 07 00 C7 48 07 00 9E 09 FF 00 30 00 0E 07 00 89 07 00 0C 04 07 00 53 04 04 04 04 04 04 04 04 07 00 C7 07 00 01 00 01 07 00 9E 09 F7 00 82 07 00 9E 09 41 07 00 C7 08 6B 07 00 9E 09 41 07 00 C7 FA 00 08 41 07 00 53 4C 07 00 9E FF 00 09 00 0D 07 00 89 07 00 0C 04 07 00 53 04 04 04 04 04 04 04 04 07 00 C7 00 02 07 00 53 07 00 41 F7 00 44 07 00 9E 09
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type          
        //  -----  -----  -----  -----  --------------
        //  95     115    118    128    Lcom/zelix/n9;
        //  152    171    174    184    Lcom/zelix/n9;
        //  168    323    326    336    Lcom/zelix/n9;
        //  184    343    346    356    Lcom/zelix/n9;
        //  356    499    502    512    Lcom/zelix/n9;
        //  360    553    556    566    Lcom/zelix/n9;
        //  566    589    592    602    Lcom/zelix/n9;
        //  602    616    619    629    Lcom/zelix/n9;
        //  653    675    678    688    Lcom/zelix/n9;
        //  664    816    819    829    Lcom/zelix/n9;
        //  829    881    884    894    Lcom/zelix/n9;
        //  894    917    920    930    Lcom/zelix/n9;
        //  930    944    947    957    Lcom/zelix/n9;
        //  981    1003   1006   1016   Lcom/zelix/n9;
        //  992    1144   1147   1157   Lcom/zelix/n9;
        //  1157   1209   1212   1222   Lcom/zelix/n9;
        //  1222   1245   1248   1258   Lcom/zelix/n9;
        //  1258   1324   1327   1337   Lcom/zelix/n9;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0184:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void focusGained(final FocusEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          95148752661011
        //     6: lxor           
        //     7: lstore_2       
        //     8: ldc2_w          7752704212277468519
        //    11: lload_2        
        //    12: invokedynamic   BootstrapMethod #15, j:(JJ)[Lcom/zelix/_0;
        //    17: aload_1        
        //    18: ldc2_w          8372965432287775868
        //    21: lload_2        
        //    22: invokedynamic   BootstrapMethod #16, u:(Ljava/lang/Object;JJ)Ljava/lang/Object;
        //    27: astore          5
        //    29: astore          4
        //    31: aload           5
        //    33: aload_0        
        //    34: ldc2_w          8059647681892307012
        //    37: lload_2        
        //    38: invokedynamic   BootstrapMethod #17, t:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //    43: aload           4
        //    45: ifnonnull       139
        //    48: if_acmpne       114
        //    51: goto            64
        //    54: ldc2_w          8021728754164540645
        //    57: lload_2        
        //    58: invokedynamic   BootstrapMethod #18, j:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //    63: athrow         
        //    64: aload_0        
        //    65: ldc2_w          7799662321453475617
        //    68: lload_2        
        //    69: invokedynamic   BootstrapMethod #19, t:(Ljava/lang/Object;JJ)Ljavax/swing/JLabel;
        //    74: sipush          2020
        //    77: ldc2_w          274104831924225379
        //    80: lload_2        
        //    81: lxor           
        //    82: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //    87: ldc2_w          8199088287083461663
        //    90: lload_2        
        //    91: invokedynamic   BootstrapMethod #20, u:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //    96: aload           4
        //    98: ifnull          379
        //   101: goto            114
        //   104: ldc2_w          8021728754164540645
        //   107: lload_2        
        //   108: invokedynamic   BootstrapMethod #18, j:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   113: athrow         
        //   114: aload           5
        //   116: aload_0        
        //   117: ldc2_w          7846366887812349842
        //   120: lload_2        
        //   121: invokedynamic   BootstrapMethod #17, t:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   126: goto            139
        //   129: ldc2_w          8021728754164540645
        //   132: lload_2        
        //   133: invokedynamic   BootstrapMethod #18, j:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   138: athrow         
        //   139: aload           4
        //   141: ifnonnull       235
        //   144: if_acmpne       210
        //   147: goto            160
        //   150: ldc2_w          8021728754164540645
        //   153: lload_2        
        //   154: invokedynamic   BootstrapMethod #18, j:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   159: athrow         
        //   160: aload_0        
        //   161: ldc2_w          7799662321453475617
        //   164: lload_2        
        //   165: invokedynamic   BootstrapMethod #19, t:(Ljava/lang/Object;JJ)Ljavax/swing/JLabel;
        //   170: sipush          30915
        //   173: ldc2_w          5740415965306108523
        //   176: lload_2        
        //   177: lxor           
        //   178: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //   183: ldc2_w          8199088287083461663
        //   186: lload_2        
        //   187: invokedynamic   BootstrapMethod #20, u:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   192: aload           4
        //   194: ifnull          379
        //   197: goto            210
        //   200: ldc2_w          8021728754164540645
        //   203: lload_2        
        //   204: invokedynamic   BootstrapMethod #18, j:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   209: athrow         
        //   210: aload           5
        //   212: aload_0        
        //   213: ldc2_w          8599453545270681307
        //   216: lload_2        
        //   217: invokedynamic   BootstrapMethod #17, t:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   222: goto            235
        //   225: ldc2_w          8021728754164540645
        //   228: lload_2        
        //   229: invokedynamic   BootstrapMethod #18, j:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   234: athrow         
        //   235: aload           4
        //   237: ifnonnull       331
        //   240: if_acmpne       306
        //   243: goto            256
        //   246: ldc2_w          8021728754164540645
        //   249: lload_2        
        //   250: invokedynamic   BootstrapMethod #18, j:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   255: athrow         
        //   256: aload_0        
        //   257: ldc2_w          7799662321453475617
        //   260: lload_2        
        //   261: invokedynamic   BootstrapMethod #19, t:(Ljava/lang/Object;JJ)Ljavax/swing/JLabel;
        //   266: sipush          29450
        //   269: ldc2_w          1498760674530472332
        //   272: lload_2        
        //   273: lxor           
        //   274: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //   279: ldc2_w          8199088287083461663
        //   282: lload_2        
        //   283: invokedynamic   BootstrapMethod #20, u:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   288: aload           4
        //   290: ifnull          379
        //   293: goto            306
        //   296: ldc2_w          8021728754164540645
        //   299: lload_2        
        //   300: invokedynamic   BootstrapMethod #18, j:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   305: athrow         
        //   306: aload           5
        //   308: aload_0        
        //   309: ldc2_w          8081520606964155572
        //   312: lload_2        
        //   313: invokedynamic   BootstrapMethod #17, t:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   318: goto            331
        //   321: ldc2_w          8021728754164540645
        //   324: lload_2        
        //   325: invokedynamic   BootstrapMethod #18, j:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   330: athrow         
        //   331: if_acmpne       379
        //   334: aload_0        
        //   335: ldc2_w          7799662321453475617
        //   338: lload_2        
        //   339: invokedynamic   BootstrapMethod #19, t:(Ljava/lang/Object;JJ)Ljavax/swing/JLabel;
        //   344: sipush          25329
        //   347: ldc2_w          2230017207149305943
        //   350: lload_2        
        //   351: lxor           
        //   352: invokedynamic   BootstrapMethod #0, x:(IJ)Ljava/lang/String;
        //   357: ldc2_w          8199088287083461663
        //   360: lload_2        
        //   361: invokedynamic   BootstrapMethod #20, u:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   366: goto            379
        //   369: ldc2_w          8021728754164540645
        //   372: lload_2        
        //   373: invokedynamic   BootstrapMethod #18, j:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   378: athrow         
        //   379: return         
        //    StackMapTable: 00 14 FF 00 36 00 05 07 00 89 07 00 D3 04 07 00 C7 07 00 53 00 01 07 00 9E 09 67 07 00 9E 09 4E 07 00 9E FF 00 09 00 05 07 00 89 07 00 D3 04 07 00 C7 07 00 53 00 02 07 00 53 07 00 41 4A 07 00 9E 09 67 07 00 9E 09 4E 07 00 9E FF 00 09 00 05 07 00 89 07 00 D3 04 07 00 C7 07 00 53 00 02 07 00 53 07 00 41 4A 07 00 9E 09 67 07 00 9E 09 4E 07 00 9E FF 00 09 00 05 07 00 89 07 00 D3 04 07 00 C7 07 00 53 00 02 07 00 53 07 00 41 65 07 00 9E 09
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type          
        //  -----  -----  -----  -----  --------------
        //  31     51     54     64     Lcom/zelix/n9;
        //  48     101    104    114    Lcom/zelix/n9;
        //  64     126    129    139    Lcom/zelix/n9;
        //  139    147    150    160    Lcom/zelix/n9;
        //  144    197    200    210    Lcom/zelix/n9;
        //  160    222    225    235    Lcom/zelix/n9;
        //  235    243    246    256    Lcom/zelix/n9;
        //  240    293    296    306    Lcom/zelix/n9;
        //  256    318    321    331    Lcom/zelix/n9;
        //  331    366    369    379    Lcom/zelix/n9;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:147)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        final long n = cx.a ^ 0x507B46B85896L;
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_38.invoke(this, new Object[] { n ^ 0x456A135D2559L, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_37.invoke(actionEvent, 4731611584051443134L, n) }, 4753483388801857162L, n);
    }
    
    public void R(final Object[] array) {
        final long longValue;
        final long n = longValue = (long)array[0];
        final long l = longValue ^ 0x337FB219733AL;
        final long i = longValue ^ 0x20570581B6ADL;
        final long j = longValue ^ 0xBF498F45521L;
        final long k = longValue ^ 0x3F1DBA392229L;
        final long n2 = longValue ^ 0x4340A1ABC10L;
        final long m = longValue ^ 0x7BBDF267CD48L;
        final ah ah = new ah((Container)this, n2);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_39.invoke(this, ah, 8182126930617868994L, n);
        final JLabel label = new JLabel(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_40.invoke(18973, 0x4C297C31BE016E3L ^ n), 2);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_41.invoke(this, new JTextField(), 8185513833701035525L, n);
        final JLabel label2 = new JLabel(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_42.invoke(16670, 0x4DEE2495CE821DFAL ^ n), 2);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_43.invoke(this, new JTextField(), 8260361166560633299L, n);
        final JLabel label3 = new JLabel(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_44.invoke(21820, 0x7E402076E7D309CEL ^ n), 2);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_45.invoke(this, new JTextField(), 7572295743548096666L, n);
        final JLabel label4 = new JLabel(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_46.invoke(15050, 0x4B8CE2DD040EE605L ^ n), 2);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_47.invoke(this, new JTextField(), 7955049672084495093L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_48.invoke(this, new JLabel(" "), 8249644700257859936L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_51.invoke(this, ProcyonInvokeDynamicHelper_49.invoke(this, 8185513833701035525L, n), ProcyonInvokeDynamicHelper_50.invoke(19883, 0x2BE9D434497C9150L ^ n), 7600953493715158492L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_54.invoke(this, ProcyonInvokeDynamicHelper_52.invoke(this, 8260361166560633299L, n), ProcyonInvokeDynamicHelper_53.invoke(10397, 0x415927B1E2877458L ^ n), 7600953493715158492L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_57.invoke(this, ProcyonInvokeDynamicHelper_55.invoke(this, 7572295743548096666L, n), ProcyonInvokeDynamicHelper_56.invoke(30879, 0x74837EE437CCA468L ^ n), 7600953493715158492L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_60.invoke(this, ProcyonInvokeDynamicHelper_58.invoke(this, 7955049672084495093L, n), ProcyonInvokeDynamicHelper_59.invoke(25524, 0x6DD32A3735033F60L ^ n), 7600953493715158492L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_62.invoke(this, label, ProcyonInvokeDynamicHelper_61.invoke(19264, 0xE3E380BA8E517ADL ^ n), 7600953493715158492L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_64.invoke(this, label2, ProcyonInvokeDynamicHelper_63.invoke(28671, 0x14B925EBCDF9B315L ^ n), 7600953493715158492L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_66.invoke(this, label3, ProcyonInvokeDynamicHelper_65.invoke(21477, 0x1EDB4EA38FBF0F04L ^ n), 7600953493715158492L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_68.invoke(this, label4, ProcyonInvokeDynamicHelper_67.invoke(31583, 0x1FF197B37D7A2796L ^ n), 7600953493715158492L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_71.invoke(this, ProcyonInvokeDynamicHelper_69.invoke(this, 8249644700257859936L, n), ProcyonInvokeDynamicHelper_70.invoke(21205, 0x9B6555AEBE48E03L ^ n), 7600953493715158492L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_73.invoke(ah, new Object[] { /* invokedynamic(!) */ProcyonInvokeDynamicHelper_72.invoke(7697779883593367349L, n), i }, 7707515526044122824L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_77.invoke(ProcyonInvokeDynamicHelper_74.invoke(this, 8185513833701035525L, n), ProcyonInvokeDynamicHelper_76.invoke(ProcyonInvokeDynamicHelper_75.invoke(this, 8092046136887854103L, n), new Object[] { j }, 8120725721607331568L, n), 8119131516215535231L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_81.invoke(ProcyonInvokeDynamicHelper_78.invoke(this, 8260361166560633299L, n), ProcyonInvokeDynamicHelper_80.invoke(ProcyonInvokeDynamicHelper_79.invoke(this, 8092046136887854103L, n), new Object[] { k }, 7668527632349034203L, n), 8119131516215535231L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_85.invoke(ProcyonInvokeDynamicHelper_82.invoke(this, 7572295743548096666L, n), ProcyonInvokeDynamicHelper_84.invoke(ProcyonInvokeDynamicHelper_83.invoke(this, 8092046136887854103L, n), new Object[] { m }, 8208180657727159869L, n), 8119131516215535231L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_89.invoke(ProcyonInvokeDynamicHelper_86.invoke(this, 7955049672084495093L, n), ProcyonInvokeDynamicHelper_88.invoke(ProcyonInvokeDynamicHelper_87.invoke(this, 8092046136887854103L, n), new Object[] { l }, 8577251002349415478L, n), 8119131516215535231L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_91.invoke(ProcyonInvokeDynamicHelper_90.invoke(this, 8185513833701035525L, n), this, 7851088861571820616L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_93.invoke(ProcyonInvokeDynamicHelper_92.invoke(this, 8260361166560633299L, n), this, 7851088861571820616L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_95.invoke(ProcyonInvokeDynamicHelper_94.invoke(this, 7572295743548096666L, n), this, 7851088861571820616L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_97.invoke(ProcyonInvokeDynamicHelper_96.invoke(this, 7955049672084495093L, n), this, 7851088861571820616L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_99.invoke(ProcyonInvokeDynamicHelper_98.invoke(this, 8185513833701035525L, n), this, 8170906219198520857L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_101.invoke(ProcyonInvokeDynamicHelper_100.invoke(this, 8260361166560633299L, n), this, 8170906219198520857L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_103.invoke(ProcyonInvokeDynamicHelper_102.invoke(this, 7572295743548096666L, n), this, 8170906219198520857L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_105.invoke(ProcyonInvokeDynamicHelper_104.invoke(this, 7955049672084495093L, n), this, 8170906219198520857L, n);
    }
    
    private static n9 a(final n9 n9) {
        return n9;
    }
    
    private static String a(final byte[] array) {
        int count = 0;
        final int length;
        final char[] value = new char[length = array.length];
        for (int i = 0; i < length; ++i) {
            final int n;
            if ((n = (0xFF & array[i])) < 192) {
                value[count++] = (char)n;
            }
            else if (n < 224) {
                value[count++] = (char)((char)((char)(n & 0x1F) << 6) | (char)(array[++i] & 0x3F));
            }
            else if (i < length - 2) {
                value[count++] = (char)((char)((char)((char)(n & 0xF) << 12) | (char)(array[++i] & 0x3F) << 6) | (char)(array[++i] & 0x3F));
            }
        }
        return new String(value, 0, count);
    }
    
    private static String a(final int n, final long n2) {
        final int n3 = n ^ (int)(n2 & 0x7FFFL) ^ 0x20B8;
        if (cx.c[n3] == null) {
            Object[] array;
            try {
                final Long value = Thread.currentThread().getId();
                array = cx.d.get(value);
                if (array == null) {
                    array = new Object[] { Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8]) };
                    cx.d.put(value, array);
                }
            }
            catch (final Exception cause) {
                throw new RuntimeException("com/zelix/cx", cause);
            }
            final byte[] key = new byte[8];
            key[0] = (byte)(n2 >>> 56);
            for (int i = 1; i < 8; ++i) {
                key[i] = (byte)(n2 << i * 8 >>> 56);
            }
            ((Cipher)array[0]).init(2, ((SecretKeyFactory)array[1]).generateSecret(new DESKeySpec(key)), (AlgorithmParameterSpec)array[2]);
            cx.c[n3] = a(((Cipher)array[0]).doFinal(cx.b[n3].getBytes("ISO-8859-1")));
        }
        return cx.c[n3];
    }
    
    private static Object a(final MethodHandles.Lookup lookup, final MutableCallSite mutableCallSite, final String s, final Object[] array) {
        final String a = a((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, a), 0, Integer.TYPE, Long.TYPE));
        return a;
    }
    
    private static CallSite a(final MethodHandles.Lookup lookup, final String str, final MethodType methodType) {
        final MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(/* ldc_method_handle(!) */ProcyonConstantHelper_1.HANDLE.asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, str), methodType));
        }
        catch (final Exception cause) {
            throw new RuntimeException("com/zelix/cx" + " : " + str + " : " + methodType.toString(), cause);
        }
        return mutableCallSite;
    }
    
    private static final MethodHandles.Lookup __PROCYON__LOOKUP_1__ = MethodHandles.lookup();
    
    // This helper class was generated by Procyon to approximate the behavior of a
    // MethodHandle constant that cannot (currently) be represented in Java code.
    private static final class ProcyonConstantHelper_1
    {
        static final MethodHandle HANDLE;
        
        static {
            MethodHandle handle;
            final MethodType type = MethodType.methodType(Object.class, MethodHandles.Lookup.class, MutableCallSite.class, String.class, Object[].class);
            try {
                handle = cx.__PROCYON__LOOKUP_1__.findStatic(cx.class, "a", type);
            }
            catch (final ReflectiveOperationException e) {
                handle = MethodHandles.permuteArguments(MethodHandles.insertArguments(MethodHandles.throwException(type.returnType(), e.getClass()), 0, e), type);
            }
            ProcyonConstantHelper_1.HANDLE = handle;
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_2
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_2.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_2.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_2.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_2.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_2.fence = 1;
                ProcyonInvokeDynamicHelper_2.handle = handle;
                ProcyonInvokeDynamicHelper_2.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_2.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_3
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_3.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_3.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_3.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_3.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_3.fence = 1;
                ProcyonInvokeDynamicHelper_3.handle = handle;
                ProcyonInvokeDynamicHelper_3.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_4
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_4.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_4.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_4.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_4.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_4.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_4.fence = 1;
                ProcyonInvokeDynamicHelper_4.handle = handle;
                ProcyonInvokeDynamicHelper_4.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_5
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_5.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_5.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_5.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_5.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_5.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_5.fence = 1;
                ProcyonInvokeDynamicHelper_5.handle = handle;
                ProcyonInvokeDynamicHelper_5.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_6
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_6.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_6.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_6.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_6.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_6.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_6.fence = 1;
                ProcyonInvokeDynamicHelper_6.handle = handle;
                ProcyonInvokeDynamicHelper_6.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_6.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_7
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_7.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_7.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_7.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_7.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_7.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_7.fence = 1;
                ProcyonInvokeDynamicHelper_7.handle = handle;
                ProcyonInvokeDynamicHelper_7.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_7.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_8
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_8.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_8.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_8.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_8.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_8.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_8.fence = 1;
                ProcyonInvokeDynamicHelper_8.handle = handle;
                ProcyonInvokeDynamicHelper_8.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_8.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_9
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_9.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_9.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_9.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_9.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_9.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_9.fence = 1;
                ProcyonInvokeDynamicHelper_9.handle = handle;
                ProcyonInvokeDynamicHelper_9.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_9.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_10
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_10.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_10.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_10.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_10.fence = 1;
                ProcyonInvokeDynamicHelper_10.handle = handle;
                ProcyonInvokeDynamicHelper_10.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_10.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_11
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_11.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_11.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_11.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_11.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_11.fence = 1;
                ProcyonInvokeDynamicHelper_11.handle = handle;
                ProcyonInvokeDynamicHelper_11.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_11.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_12
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_12.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_12.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_12.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_12.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_12.fence = 1;
                ProcyonInvokeDynamicHelper_12.handle = handle;
                ProcyonInvokeDynamicHelper_12.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_12.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_13
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_13.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_13.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_13.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_13.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_13.fence = 1;
                ProcyonInvokeDynamicHelper_13.handle = handle;
                ProcyonInvokeDynamicHelper_13.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_13.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_14
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_14.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_14.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_14.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_14.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_14.fence = 1;
                ProcyonInvokeDynamicHelper_14.handle = handle;
                ProcyonInvokeDynamicHelper_14.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_14.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_15
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_15.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_15.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_15.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_15.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_15.fence = 1;
                ProcyonInvokeDynamicHelper_15.handle = handle;
                ProcyonInvokeDynamicHelper_15.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_15.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_16
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_16.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_16.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_16.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_16.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_16.fence = 1;
                ProcyonInvokeDynamicHelper_16.handle = handle;
                ProcyonInvokeDynamicHelper_16.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_16.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_17
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_17.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_17.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_17.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_17.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_17.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_17.fence = 1;
                ProcyonInvokeDynamicHelper_17.handle = handle;
                ProcyonInvokeDynamicHelper_17.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_17.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_18
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_18.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_18.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_18.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_18.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_18.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_18.fence = 1;
                ProcyonInvokeDynamicHelper_18.handle = handle;
                ProcyonInvokeDynamicHelper_18.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_18.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_19
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_19.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_19.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_19.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_19.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_19.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_19.fence = 1;
                ProcyonInvokeDynamicHelper_19.handle = handle;
                ProcyonInvokeDynamicHelper_19.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_19.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_20
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_20.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_20.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_20.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_20.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_20.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_20.fence = 1;
                ProcyonInvokeDynamicHelper_20.handle = handle;
                ProcyonInvokeDynamicHelper_20.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_20.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_21
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_21.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_21.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_21.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_21.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_21.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_21.fence = 1;
                ProcyonInvokeDynamicHelper_21.handle = handle;
                ProcyonInvokeDynamicHelper_21.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_21.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_22
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_22.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_22.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_22.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_22.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_22.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_22.fence = 1;
                ProcyonInvokeDynamicHelper_22.handle = handle;
                ProcyonInvokeDynamicHelper_22.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_22.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_23
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_23.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_23.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_23.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_23.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_23.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_23.fence = 1;
                ProcyonInvokeDynamicHelper_23.handle = handle;
                ProcyonInvokeDynamicHelper_23.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_23.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_24
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_24.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_24.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_24.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_24.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_24.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_24.fence = 1;
                ProcyonInvokeDynamicHelper_24.handle = handle;
                ProcyonInvokeDynamicHelper_24.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_24.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_25
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_25.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_25.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_25.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_25.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_25.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_25.fence = 1;
                ProcyonInvokeDynamicHelper_25.handle = handle;
                ProcyonInvokeDynamicHelper_25.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_25.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_26
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_26.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_26.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_26.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_26.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_26.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_26.fence = 1;
                ProcyonInvokeDynamicHelper_26.handle = handle;
                ProcyonInvokeDynamicHelper_26.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_26.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_27
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_27.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_27.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_27.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_27.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_27.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_27.fence = 1;
                ProcyonInvokeDynamicHelper_27.handle = handle;
                ProcyonInvokeDynamicHelper_27.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_27.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_28
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_28.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_28.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_28.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_28.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_28.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_28.fence = 1;
                ProcyonInvokeDynamicHelper_28.handle = handle;
                ProcyonInvokeDynamicHelper_28.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_28.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_29
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_29.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_29.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_29.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_29.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_29.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_29.fence = 1;
                ProcyonInvokeDynamicHelper_29.handle = handle;
                ProcyonInvokeDynamicHelper_29.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_29.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_30
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_30.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_30.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_30.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_30.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_30.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_30.fence = 1;
                ProcyonInvokeDynamicHelper_30.handle = handle;
                ProcyonInvokeDynamicHelper_30.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_30.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_31
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_31.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_31.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_31.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_31.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_31.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_31.fence = 1;
                ProcyonInvokeDynamicHelper_31.handle = handle;
                ProcyonInvokeDynamicHelper_31.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_31.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_32
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_32.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_32.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_32.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_32.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_32.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "k", MethodType.methodType(void.class, String[].class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_32.fence = 1;
                ProcyonInvokeDynamicHelper_32.handle = handle;
                ProcyonInvokeDynamicHelper_32.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(String[] p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_32.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_33
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_33.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_33.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_33.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_33.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_33.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "q", MethodType.methodType(JLabel.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_33.fence = 1;
                ProcyonInvokeDynamicHelper_33.handle = handle;
                ProcyonInvokeDynamicHelper_33.fence = 0;
            }
            return handle;
        }
        
        private static JLabel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_33.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_34
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_34.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_34.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_34.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_34.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_34.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "p", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_34.fence = 1;
                ProcyonInvokeDynamicHelper_34.handle = handle;
                ProcyonInvokeDynamicHelper_34.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_34.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_35
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_35.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_35.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_35.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_35.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_35.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "p", MethodType.methodType(Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_35.fence = 1;
                ProcyonInvokeDynamicHelper_35.handle = handle;
                ProcyonInvokeDynamicHelper_35.fence = 0;
            }
            return handle;
        }
        
        private static Object invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_35.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_36
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_36.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_36.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_36.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_36.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_36.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "p", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_36.fence = 1;
                ProcyonInvokeDynamicHelper_36.handle = handle;
                ProcyonInvokeDynamicHelper_36.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_36.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_37
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_37.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_37.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_37.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_37.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_37.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "p", MethodType.methodType(Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_37.fence = 1;
                ProcyonInvokeDynamicHelper_37.handle = handle;
                ProcyonInvokeDynamicHelper_37.fence = 0;
            }
            return handle;
        }
        
        private static Object invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_37.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_38
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_38.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_38.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_38.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_38.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_38.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "p", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_38.fence = 1;
                ProcyonInvokeDynamicHelper_38.handle = handle;
                ProcyonInvokeDynamicHelper_38.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_38.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_39
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_39.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_39.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_39.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_39.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_39.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_39.fence = 1;
                ProcyonInvokeDynamicHelper_39.handle = handle;
                ProcyonInvokeDynamicHelper_39.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_39.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_40
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_40.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_40.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_40.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_40.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_40.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_40.fence = 1;
                ProcyonInvokeDynamicHelper_40.handle = handle;
                ProcyonInvokeDynamicHelper_40.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_40.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_41
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_41.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_41.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_41.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_41.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_41.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, JTextField.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_41.fence = 1;
                ProcyonInvokeDynamicHelper_41.handle = handle;
                ProcyonInvokeDynamicHelper_41.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, JTextField p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_41.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_42
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_42.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_42.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_42.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_42.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_42.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_42.fence = 1;
                ProcyonInvokeDynamicHelper_42.handle = handle;
                ProcyonInvokeDynamicHelper_42.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_42.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_43
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_43.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_43.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_43.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_43.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_43.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, JTextField.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_43.fence = 1;
                ProcyonInvokeDynamicHelper_43.handle = handle;
                ProcyonInvokeDynamicHelper_43.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, JTextField p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_43.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_44
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_44.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_44.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_44.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_44.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_44.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_44.fence = 1;
                ProcyonInvokeDynamicHelper_44.handle = handle;
                ProcyonInvokeDynamicHelper_44.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_44.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_45
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_45.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_45.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_45.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_45.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_45.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, JTextField.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_45.fence = 1;
                ProcyonInvokeDynamicHelper_45.handle = handle;
                ProcyonInvokeDynamicHelper_45.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, JTextField p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_45.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_46
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_46.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_46.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_46.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_46.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_46.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_46.fence = 1;
                ProcyonInvokeDynamicHelper_46.handle = handle;
                ProcyonInvokeDynamicHelper_46.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_46.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_47
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_47.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_47.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_47.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_47.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_47.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, JTextField.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_47.fence = 1;
                ProcyonInvokeDynamicHelper_47.handle = handle;
                ProcyonInvokeDynamicHelper_47.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, JTextField p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_47.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_48
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_48.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_48.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_48.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_48.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_48.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, JLabel.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_48.fence = 1;
                ProcyonInvokeDynamicHelper_48.handle = handle;
                ProcyonInvokeDynamicHelper_48.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, JLabel p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_48.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_49
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_49.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_49.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_49.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_49.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_49.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_49.fence = 1;
                ProcyonInvokeDynamicHelper_49.handle = handle;
                ProcyonInvokeDynamicHelper_49.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_49.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_50
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_50.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_50.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_50.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_50.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_50.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_50.fence = 1;
                ProcyonInvokeDynamicHelper_50.handle = handle;
                ProcyonInvokeDynamicHelper_50.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_50.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_51
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_51.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_51.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_51.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_51.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_51.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_51.fence = 1;
                ProcyonInvokeDynamicHelper_51.handle = handle;
                ProcyonInvokeDynamicHelper_51.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_51.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_52
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_52.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_52.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_52.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_52.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_52.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_52.fence = 1;
                ProcyonInvokeDynamicHelper_52.handle = handle;
                ProcyonInvokeDynamicHelper_52.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_52.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_53
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_53.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_53.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_53.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_53.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_53.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_53.fence = 1;
                ProcyonInvokeDynamicHelper_53.handle = handle;
                ProcyonInvokeDynamicHelper_53.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_53.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_54
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_54.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_54.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_54.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_54.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_54.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_54.fence = 1;
                ProcyonInvokeDynamicHelper_54.handle = handle;
                ProcyonInvokeDynamicHelper_54.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_54.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_55
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_55.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_55.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_55.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_55.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_55.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_55.fence = 1;
                ProcyonInvokeDynamicHelper_55.handle = handle;
                ProcyonInvokeDynamicHelper_55.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_55.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_56
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_56.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_56.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_56.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_56.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_56.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_56.fence = 1;
                ProcyonInvokeDynamicHelper_56.handle = handle;
                ProcyonInvokeDynamicHelper_56.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_56.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_57
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_57.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_57.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_57.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_57.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_57.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_57.fence = 1;
                ProcyonInvokeDynamicHelper_57.handle = handle;
                ProcyonInvokeDynamicHelper_57.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_57.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_58
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_58.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_58.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_58.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_58.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_58.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_58.fence = 1;
                ProcyonInvokeDynamicHelper_58.handle = handle;
                ProcyonInvokeDynamicHelper_58.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_58.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_59
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_59.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_59.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_59.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_59.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_59.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_59.fence = 1;
                ProcyonInvokeDynamicHelper_59.handle = handle;
                ProcyonInvokeDynamicHelper_59.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_59.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_60
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_60.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_60.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_60.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_60.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_60.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_60.fence = 1;
                ProcyonInvokeDynamicHelper_60.handle = handle;
                ProcyonInvokeDynamicHelper_60.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_60.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_61
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_61.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_61.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_61.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_61.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_61.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_61.fence = 1;
                ProcyonInvokeDynamicHelper_61.handle = handle;
                ProcyonInvokeDynamicHelper_61.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_61.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_62
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_62.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_62.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_62.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_62.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_62.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_62.fence = 1;
                ProcyonInvokeDynamicHelper_62.handle = handle;
                ProcyonInvokeDynamicHelper_62.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_62.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_63
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_63.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_63.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_63.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_63.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_63.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_63.fence = 1;
                ProcyonInvokeDynamicHelper_63.handle = handle;
                ProcyonInvokeDynamicHelper_63.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_63.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_64
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_64.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_64.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_64.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_64.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_64.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_64.fence = 1;
                ProcyonInvokeDynamicHelper_64.handle = handle;
                ProcyonInvokeDynamicHelper_64.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_64.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_65
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_65.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_65.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_65.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_65.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_65.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_65.fence = 1;
                ProcyonInvokeDynamicHelper_65.handle = handle;
                ProcyonInvokeDynamicHelper_65.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_65.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_66
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_66.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_66.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_66.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_66.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_66.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_66.fence = 1;
                ProcyonInvokeDynamicHelper_66.handle = handle;
                ProcyonInvokeDynamicHelper_66.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_66.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_67
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_67.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_67.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_67.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_67.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_67.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_67.fence = 1;
                ProcyonInvokeDynamicHelper_67.handle = handle;
                ProcyonInvokeDynamicHelper_67.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_67.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_68
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_68.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_68.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_68.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_68.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_68.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_68.fence = 1;
                ProcyonInvokeDynamicHelper_68.handle = handle;
                ProcyonInvokeDynamicHelper_68.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_68.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_69
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_69.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_69.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_69.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_69.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_69.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JLabel.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_69.fence = 1;
                ProcyonInvokeDynamicHelper_69.handle = handle;
                ProcyonInvokeDynamicHelper_69.fence = 0;
            }
            return handle;
        }
        
        private static JLabel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_69.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_70
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_70.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_70.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_70.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_70.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_70.LOOKUP;
                try {
                    handle = ((CallSite)cx.a(lookup, "x", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_70.fence = 1;
                ProcyonInvokeDynamicHelper_70.handle = handle;
                ProcyonInvokeDynamicHelper_70.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_70.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_71
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_71.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_71.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_71.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_71.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_71.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_71.fence = 1;
                ProcyonInvokeDynamicHelper_71.handle = handle;
                ProcyonInvokeDynamicHelper_71.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_71.handle().invokeExact(p0, p1, p2, p3, p4);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_72
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_72.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_72.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_72.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_72.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_72.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "o", MethodType.methodType(String[].class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_72.fence = 1;
                ProcyonInvokeDynamicHelper_72.handle = handle;
                ProcyonInvokeDynamicHelper_72.fence = 0;
            }
            return handle;
        }
        
        private static String[] invoke(long p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_72.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_73
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_73.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_73.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_73.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_73.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_73.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_73.fence = 1;
                ProcyonInvokeDynamicHelper_73.handle = handle;
                ProcyonInvokeDynamicHelper_73.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_73.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_74
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_74.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_74.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_74.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_74.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_74.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_74.fence = 1;
                ProcyonInvokeDynamicHelper_74.handle = handle;
                ProcyonInvokeDynamicHelper_74.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_74.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_75
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_75.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_75.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_75.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_75.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_75.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_75.fence = 1;
                ProcyonInvokeDynamicHelper_75.handle = handle;
                ProcyonInvokeDynamicHelper_75.fence = 0;
            }
            return handle;
        }
        
        private static sn invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_75.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_76
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_76.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_76.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_76.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_76.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_76.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(String.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_76.fence = 1;
                ProcyonInvokeDynamicHelper_76.handle = handle;
                ProcyonInvokeDynamicHelper_76.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_76.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_77
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_77.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_77.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_77.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_77.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_77.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_77.fence = 1;
                ProcyonInvokeDynamicHelper_77.handle = handle;
                ProcyonInvokeDynamicHelper_77.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_77.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_78
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_78.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_78.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_78.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_78.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_78.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_78.fence = 1;
                ProcyonInvokeDynamicHelper_78.handle = handle;
                ProcyonInvokeDynamicHelper_78.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_78.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_79
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_79.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_79.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_79.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_79.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_79.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_79.fence = 1;
                ProcyonInvokeDynamicHelper_79.handle = handle;
                ProcyonInvokeDynamicHelper_79.fence = 0;
            }
            return handle;
        }
        
        private static sn invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_79.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_80
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_80.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_80.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_80.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_80.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_80.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(String.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_80.fence = 1;
                ProcyonInvokeDynamicHelper_80.handle = handle;
                ProcyonInvokeDynamicHelper_80.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_80.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_81
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_81.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_81.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_81.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_81.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_81.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_81.fence = 1;
                ProcyonInvokeDynamicHelper_81.handle = handle;
                ProcyonInvokeDynamicHelper_81.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_81.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_82
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_82.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_82.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_82.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_82.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_82.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_82.fence = 1;
                ProcyonInvokeDynamicHelper_82.handle = handle;
                ProcyonInvokeDynamicHelper_82.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_82.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_83
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_83.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_83.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_83.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_83.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_83.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_83.fence = 1;
                ProcyonInvokeDynamicHelper_83.handle = handle;
                ProcyonInvokeDynamicHelper_83.fence = 0;
            }
            return handle;
        }
        
        private static sn invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_83.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_84
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_84.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_84.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_84.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_84.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_84.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(String.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_84.fence = 1;
                ProcyonInvokeDynamicHelper_84.handle = handle;
                ProcyonInvokeDynamicHelper_84.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_84.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_85
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_85.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_85.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_85.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_85.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_85.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_85.fence = 1;
                ProcyonInvokeDynamicHelper_85.handle = handle;
                ProcyonInvokeDynamicHelper_85.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_85.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_86
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_86.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_86.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_86.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_86.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_86.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_86.fence = 1;
                ProcyonInvokeDynamicHelper_86.handle = handle;
                ProcyonInvokeDynamicHelper_86.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_86.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_87
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_87.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_87.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_87.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_87.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_87.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_87.fence = 1;
                ProcyonInvokeDynamicHelper_87.handle = handle;
                ProcyonInvokeDynamicHelper_87.fence = 0;
            }
            return handle;
        }
        
        private static sn invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_87.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_88
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_88.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_88.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_88.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_88.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_88.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(String.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_88.fence = 1;
                ProcyonInvokeDynamicHelper_88.handle = handle;
                ProcyonInvokeDynamicHelper_88.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_88.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_89
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_89.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_89.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_89.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_89.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_89.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_89.fence = 1;
                ProcyonInvokeDynamicHelper_89.handle = handle;
                ProcyonInvokeDynamicHelper_89.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_89.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_90
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_90.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_90.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_90.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_90.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_90.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_90.fence = 1;
                ProcyonInvokeDynamicHelper_90.handle = handle;
                ProcyonInvokeDynamicHelper_90.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_90.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_91
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_91.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_91.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_91.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_91.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_91.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_91.fence = 1;
                ProcyonInvokeDynamicHelper_91.handle = handle;
                ProcyonInvokeDynamicHelper_91.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_91.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_92
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_92.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_92.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_92.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_92.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_92.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_92.fence = 1;
                ProcyonInvokeDynamicHelper_92.handle = handle;
                ProcyonInvokeDynamicHelper_92.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_92.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_93
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_93.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_93.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_93.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_93.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_93.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_93.fence = 1;
                ProcyonInvokeDynamicHelper_93.handle = handle;
                ProcyonInvokeDynamicHelper_93.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_93.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_94
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_94.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_94.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_94.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_94.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_94.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_94.fence = 1;
                ProcyonInvokeDynamicHelper_94.handle = handle;
                ProcyonInvokeDynamicHelper_94.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_94.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_95
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_95.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_95.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_95.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_95.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_95.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_95.fence = 1;
                ProcyonInvokeDynamicHelper_95.handle = handle;
                ProcyonInvokeDynamicHelper_95.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_95.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_96
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_96.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_96.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_96.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_96.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_96.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_96.fence = 1;
                ProcyonInvokeDynamicHelper_96.handle = handle;
                ProcyonInvokeDynamicHelper_96.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_96.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_97
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_97.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_97.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_97.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_97.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_97.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_97.fence = 1;
                ProcyonInvokeDynamicHelper_97.handle = handle;
                ProcyonInvokeDynamicHelper_97.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_97.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_98
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_98.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_98.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_98.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_98.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_98.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_98.fence = 1;
                ProcyonInvokeDynamicHelper_98.handle = handle;
                ProcyonInvokeDynamicHelper_98.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_98.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_99
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_99.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_99.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_99.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_99.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_99.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_99.fence = 1;
                ProcyonInvokeDynamicHelper_99.handle = handle;
                ProcyonInvokeDynamicHelper_99.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_99.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_100
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_100.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_100.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_100.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_100.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_100.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_100.fence = 1;
                ProcyonInvokeDynamicHelper_100.handle = handle;
                ProcyonInvokeDynamicHelper_100.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_100.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_101
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_101.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_101.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_101.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_101.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_101.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_101.fence = 1;
                ProcyonInvokeDynamicHelper_101.handle = handle;
                ProcyonInvokeDynamicHelper_101.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_101.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_102
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_102.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_102.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_102.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_102.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_102.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_102.fence = 1;
                ProcyonInvokeDynamicHelper_102.handle = handle;
                ProcyonInvokeDynamicHelper_102.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_102.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_103
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_103.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_103.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_103.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_103.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_103.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_103.fence = 1;
                ProcyonInvokeDynamicHelper_103.handle = handle;
                ProcyonInvokeDynamicHelper_103.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_103.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_104
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_104.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_104.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_104.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_104.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_104.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_104.fence = 1;
                ProcyonInvokeDynamicHelper_104.handle = handle;
                ProcyonInvokeDynamicHelper_104.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_104.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_105
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_105.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_105.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_105.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_105.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_105.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_105.fence = 1;
                ProcyonInvokeDynamicHelper_105.handle = handle;
                ProcyonInvokeDynamicHelper_105.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_105.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
