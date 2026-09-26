// 
// Decompiled by Procyon v0.6.0
// 

package com.zelix;

import java.lang.reflect.UndeclaredThrowableException;
import java.lang.invoke.MethodHandle;
import javax.crypto.SecretKey;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.awt.event.FocusEvent;
import javax.swing.JFrame;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import java.awt.event.ItemEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ItemListener;

public class ci extends ce implements ItemListener, ListSelectionListener, FocusListener, ActionListener
{
    JTextField j;
    DefaultListModel N;
    static String[] S;
    JComboBox c;
    DefaultComboBoxModel b;
    JTextField v;
    JTextField O;
    o4 l;
    private static final long a;
    private static final String[] d;
    private static final String[] f;
    private static final Map g;
    private static final long[] i;
    private static final Integer[] k;
    private static final Map m;
    
    public void actionPerformed(final ActionEvent actionEvent) {
        final long n = ci.a ^ 0x3F55CAAEEDEDL;
        final long n2 = n ^ 0x4B161EDADFDBL;
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_4.invoke(this, new Object[] { (int)(n2 >>> 32), (int)(char)(n2 << 32 >>> 48), /* invokedynamic(!) */ProcyonInvokeDynamicHelper_3.invoke(actionEvent, 3942916540596093612L, n), (int)(n2 << 48 >>> 48) }, 3038375148986773250L, n);
    }
    
    public void R(final Object[] array) {
        final long longValue;
        final long n = longValue = (long)array[0];
        final long n2 = longValue ^ 0x43DD34935E17L;
        final long l = longValue ^ 0x5B17F8A55C1DL;
        final long i = longValue ^ 0x108A392BB35CL;
        final long j = longValue ^ 0x562167868D41L;
        final long k = longValue ^ 0x20570581B6ADL;
        final long m = longValue ^ 0x1E9C3BC00D40L;
        final long n3 = longValue ^ 0x4340A1ABC10L;
        final long n4 = longValue ^ 0x3258F37341DFL;
        final ah ah = new ah((Container)this, n3);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_5.invoke(this, ah, 7650684368438045230L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_6.invoke(this, new DefaultComboBoxModel(), 7545977193723322029L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_8.invoke(this, new JComboBox(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_7.invoke(this, 7545977193723322029L, n)), 7823465243896829367L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_9.invoke(this, new DefaultListModel(), 7529147282948331277L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_11.invoke(this, new o4(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_10.invoke(this, 7529147282948331277L, n), n2), 7895375391550667926L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_13.invoke(ProcyonInvokeDynamicHelper_12.invoke(this, 7895375391550667926L, n), 2, 7599727870558943456L, n);
        final JLabel label = new JLabel(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_14.invoke(23049, 0x48BC74CF8EFB5DA1L ^ n), 2);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_15.invoke(this, new JTextField(), 8506294055662215524L, n);
        final JLabel label2 = new JLabel(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_16.invoke(6652, 0x4C9FBB3F65F29E51L ^ n), 2);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_17.invoke(this, new JTextField(), 7622980102660857663L, n);
        final JLabel label3 = new JLabel(/* invokedynamic(!) */ProcyonInvokeDynamicHelper_18.invoke(23431, 0x5679FA15D4EC5C3CL ^ n), 2);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_19.invoke(this, new JTextField(), 7630588854659953900L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_20.invoke(this, new JLabel(" "), 8249644700257859936L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_23.invoke(this, ProcyonInvokeDynamicHelper_21.invoke(this, 7823465243896829367L, n), ProcyonInvokeDynamicHelper_22.invoke(24188, 0x1E55FCA2CDDF59F2L ^ n), 8300437427491943472L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_26.invoke(this, new v(n4, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_24.invoke(this, 7895375391550667926L, n)), ProcyonInvokeDynamicHelper_25.invoke(32755, 0x7786783D2A78F869L ^ n), 8300437427491943472L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_29.invoke(this, ProcyonInvokeDynamicHelper_27.invoke(this, 8506294055662215524L, n), ProcyonInvokeDynamicHelper_28.invoke(2263, 0x6C5CC1408678F47L ^ n), 8300437427491943472L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_32.invoke(this, ProcyonInvokeDynamicHelper_30.invoke(this, 7622980102660857663L, n), ProcyonInvokeDynamicHelper_31.invoke(4513, 0x7950840E7E4A163FL ^ n), 8300437427491943472L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_35.invoke(this, ProcyonInvokeDynamicHelper_33.invoke(this, 7630588854659953900L, n), ProcyonInvokeDynamicHelper_34.invoke(13744, 0x3C14804C1907B235L ^ n), 8300437427491943472L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_38.invoke(this, ProcyonInvokeDynamicHelper_36.invoke(this, 8249644700257859936L, n), ProcyonInvokeDynamicHelper_37.invoke(1249, 0x1370F1E245B78368L ^ n), 8300437427491943472L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_40.invoke(this, label, ProcyonInvokeDynamicHelper_39.invoke(5076, 0x77742524336C1459L ^ n), 8300437427491943472L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_42.invoke(this, label2, ProcyonInvokeDynamicHelper_41.invoke(512, 0x94387FDABD305BEL ^ n), 8300437427491943472L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_44.invoke(this, label3, ProcyonInvokeDynamicHelper_43.invoke(24057, 0x12D5E45E93B25A4FL ^ n), 8300437427491943472L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_46.invoke(ah, new Object[] { /* invokedynamic(!) */ProcyonInvokeDynamicHelper_45.invoke(8164982455482730468L, n), k }, 7707515526044122824L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_49.invoke(ProcyonInvokeDynamicHelper_47.invoke(this, 7545977193723322029L, n), ProcyonInvokeDynamicHelper_48.invoke(25148, 0x38DC2121AC2E65ADL ^ n), 7783211120481827102L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_52.invoke(ProcyonInvokeDynamicHelper_50.invoke(this, 7545977193723322029L, n), ProcyonInvokeDynamicHelper_51.invoke(3035, 0x16EAA2792AB08C7AL ^ n), 7783211120481827102L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_55.invoke(ProcyonInvokeDynamicHelper_53.invoke(this, 7545977193723322029L, n), ProcyonInvokeDynamicHelper_54.invoke(16628, 0x4A70C2558A1DC77EL ^ n), 7783211120481827102L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_58.invoke(ProcyonInvokeDynamicHelper_56.invoke(this, 7545977193723322029L, n), ProcyonInvokeDynamicHelper_57.invoke(2135, 0x433DF43317C30FDBL ^ n), 7783211120481827102L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_61.invoke(ProcyonInvokeDynamicHelper_59.invoke(this, 7545977193723322029L, n), ProcyonInvokeDynamicHelper_60.invoke(16006, 0x9CD9CF28205B92AL ^ n), 7783211120481827102L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_64.invoke(ProcyonInvokeDynamicHelper_62.invoke(this, 7529147282948331277L, n), ProcyonInvokeDynamicHelper_63.invoke(15439, 0x5E90DFC94B233BFDL ^ n), 8350766511505510592L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_67.invoke(ProcyonInvokeDynamicHelper_65.invoke(this, 7529147282948331277L, n), ProcyonInvokeDynamicHelper_66.invoke(6244, 0x2D16390C36139FCBL ^ n), 8350766511505510592L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_70.invoke(ProcyonInvokeDynamicHelper_68.invoke(this, 7529147282948331277L, n), ProcyonInvokeDynamicHelper_69.invoke(28111, 0x39E569F7FC16A78L ^ n), 8350766511505510592L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_73.invoke(ProcyonInvokeDynamicHelper_71.invoke(this, 7529147282948331277L, n), ProcyonInvokeDynamicHelper_72.invoke(28496, 0x2FBD8DD9049BE8D4L ^ n), 8350766511505510592L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_76.invoke(ProcyonInvokeDynamicHelper_74.invoke(this, 7529147282948331277L, n), ProcyonInvokeDynamicHelper_75.invoke(14907, 0xBBA6271C0053DA0L ^ n), 8350766511505510592L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_79.invoke(ProcyonInvokeDynamicHelper_77.invoke(this, 7529147282948331277L, n), ProcyonInvokeDynamicHelper_78.invoke(7349, 0x40BBBBE4AF459B01L ^ n), 8350766511505510592L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_82.invoke(ProcyonInvokeDynamicHelper_80.invoke(this, 7529147282948331277L, n), ProcyonInvokeDynamicHelper_81.invoke(20091, 0x3DECDA9A0FF6C9EDL ^ n), 8350766511505510592L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_85.invoke(ProcyonInvokeDynamicHelper_83.invoke(this, 7529147282948331277L, n), ProcyonInvokeDynamicHelper_84.invoke(15448, 0x3103FEDADBCD3BF6L ^ n), 8350766511505510592L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_86.invoke(this, new Object[] { m }, 7525749319157995441L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_90.invoke(ProcyonInvokeDynamicHelper_87.invoke(this, 8506294055662215524L, n), ProcyonInvokeDynamicHelper_89.invoke(ProcyonInvokeDynamicHelper_88.invoke(this, 8092046136887854103L, n), new Object[] { i }, 8007959293382231224L, n), 8119131516215535231L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_94.invoke(ProcyonInvokeDynamicHelper_91.invoke(this, 7622980102660857663L, n), ProcyonInvokeDynamicHelper_93.invoke(ProcyonInvokeDynamicHelper_92.invoke(this, 8092046136887854103L, n), new Object[] { l }, 7867483088562122687L, n), 8119131516215535231L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_98.invoke(ProcyonInvokeDynamicHelper_95.invoke(this, 7630588854659953900L, n), ProcyonInvokeDynamicHelper_97.invoke(ProcyonInvokeDynamicHelper_96.invoke(this, 8092046136887854103L, n), new Object[] { j }, 7830763453172461985L, n), 8119131516215535231L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_100.invoke(ProcyonInvokeDynamicHelper_99.invoke(this, 7823465243896829367L, n), this, 8646022211772383134L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_102.invoke(ProcyonInvokeDynamicHelper_101.invoke(this, 7895375391550667926L, n), this, 8488333361200273631L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_104.invoke(ProcyonInvokeDynamicHelper_103.invoke(this, 8506294055662215524L, n), this, 7851088861571820616L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_106.invoke(ProcyonInvokeDynamicHelper_105.invoke(this, 7622980102660857663L, n), this, 7851088861571820616L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_108.invoke(ProcyonInvokeDynamicHelper_107.invoke(this, 7630588854659953900L, n), this, 7851088861571820616L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_110.invoke(ProcyonInvokeDynamicHelper_109.invoke(this, 8506294055662215524L, n), this, 8170906219198520857L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_112.invoke(ProcyonInvokeDynamicHelper_111.invoke(this, 7622980102660857663L, n), this, 8170906219198520857L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_114.invoke(ProcyonInvokeDynamicHelper_113.invoke(this, 7630588854659953900L, n), this, 8170906219198520857L, n);
    }
    
    public void valueChanged(final ListSelectionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          81987533750958
        //     6: lxor           
        //     7: lstore_2       
        //     8: lload_2        
        //     9: dup2           
        //    10: ldc2_w          87755028339477
        //    13: lxor           
        //    14: lstore          4
        //    16: dup2           
        //    17: ldc2_w          68220980794649
        //    20: lxor           
        //    21: lstore          6
        //    23: dup2           
        //    24: ldc2_w          39338657325038
        //    27: lxor           
        //    28: dup2           
        //    29: bipush          32
        //    31: lushr          
        //    32: l2i            
        //    33: istore          8
        //    35: dup2           
        //    36: bipush          32
        //    38: lshl           
        //    39: bipush          56
        //    41: lushr          
        //    42: l2i            
        //    43: istore          9
        //    45: dup2           
        //    46: bipush          40
        //    48: lshl           
        //    49: bipush          40
        //    51: lushr          
        //    52: l2i            
        //    53: istore          10
        //    55: pop2           
        //    56: dup2           
        //    57: ldc2_w          129200771058299
        //    60: lxor           
        //    61: lstore          11
        //    63: dup2           
        //    64: ldc2_w          128245107089077
        //    67: lxor           
        //    68: lstore          13
        //    70: dup2           
        //    71: ldc2_w          78570212976382
        //    74: lxor           
        //    75: lstore          15
        //    77: dup2           
        //    78: ldc2_w          103995224218707
        //    81: lxor           
        //    82: lstore          17
        //    84: dup2           
        //    85: ldc2_w          59264656990185
        //    88: lxor           
        //    89: lstore          19
        //    91: pop2           
        //    92: ldc2_w          -9132365118634788941
        //    95: lload_2        
        //    96: invokedynamic   BootstrapMethod #22, n:(JJ)[Lcom/zelix/_0;
        //   101: aload_1        
        //   102: ldc2_w          -8815599462735102188
        //   105: lload_2        
        //   106: invokedynamic   BootstrapMethod #23, q:(Ljava/lang/Object;JJ)Ljava/lang/Object;
        //   111: checkcast       Lcom/zelix/o4;
        //   114: astore          22
        //   116: aload_0        
        //   117: ldc2_w          -7139963444917279848
        //   120: lload_2        
        //   121: invokedynamic   BootstrapMethod #24, p:(Ljava/lang/Object;JJ)Ljavax/swing/DefaultListModel;
        //   126: ldc2_w          -8848143297076988278
        //   129: lload_2        
        //   130: invokedynamic   BootstrapMethod #25, q:(Ljava/lang/Object;JJ)I
        //   135: istore          23
        //   137: iconst_0       
        //   138: istore          24
        //   140: astore          21
        //   142: iload           24
        //   144: iload           23
        //   146: if_icmpge       883
        //   149: iload           24
        //   151: tableswitch {
        //                0: 196
        //                1: 278
        //                2: 362
        //                3: 446
        //                4: 528
        //                5: 630
        //                6: 712
        //                7: 796
        //          default: 875
        //        }
        //   196: aload_0        
        //   197: ldc2_w          -8873886124187045758
        //   200: lload_2        
        //   201: invokedynamic   BootstrapMethod #26, p:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   206: aload           22
        //   208: iload           24
        //   210: ldc2_w          -7470344333521155798
        //   213: lload_2        
        //   214: invokedynamic   BootstrapMethod #27, q:(Ljava/lang/Object;IJJ)Z
        //   219: iconst_2       
        //   220: lload           4
        //   222: iconst_3       
        //   223: anewarray       Ljava/lang/Object;
        //   226: dup_x2         
        //   227: dup_x2         
        //   228: pop            
        //   229: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   232: iconst_2       
        //   233: swap           
        //   234: aastore        
        //   235: dup_x1         
        //   236: swap           
        //   237: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   240: iconst_1       
        //   241: swap           
        //   242: aastore        
        //   243: dup_x1         
        //   244: swap           
        //   245: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   248: iconst_0       
        //   249: swap           
        //   250: aastore        
        //   251: ldc2_w          -8656238287097190821
        //   254: lload_2        
        //   255: invokedynamic   BootstrapMethod #28, q:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   260: aload           21
        //   262: ifnull          875
        //   265: goto            278
        //   268: ldc2_w          -8650751221863098681
        //   271: lload_2        
        //   272: invokedynamic   BootstrapMethod #29, n:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   277: athrow         
        //   278: aload_0        
        //   279: ldc2_w          -8873886124187045758
        //   282: lload_2        
        //   283: invokedynamic   BootstrapMethod #26, p:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   288: aload           22
        //   290: iload           24
        //   292: ldc2_w          -7470344333521155798
        //   295: lload_2        
        //   296: invokedynamic   BootstrapMethod #27, q:(Ljava/lang/Object;IJJ)Z
        //   301: lload           15
        //   303: dup2_x1        
        //   304: pop2           
        //   305: iconst_2       
        //   306: iconst_3       
        //   307: anewarray       Ljava/lang/Object;
        //   310: dup_x1         
        //   311: swap           
        //   312: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   315: iconst_2       
        //   316: swap           
        //   317: aastore        
        //   318: dup_x1         
        //   319: swap           
        //   320: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   323: iconst_1       
        //   324: swap           
        //   325: aastore        
        //   326: dup_x2         
        //   327: dup_x2         
        //   328: pop            
        //   329: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   332: iconst_0       
        //   333: swap           
        //   334: aastore        
        //   335: ldc2_w          -8906260468518171635
        //   338: lload_2        
        //   339: invokedynamic   BootstrapMethod #28, q:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   344: aload           21
        //   346: ifnull          875
        //   349: goto            362
        //   352: ldc2_w          -8650751221863098681
        //   355: lload_2        
        //   356: invokedynamic   BootstrapMethod #29, n:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   361: athrow         
        //   362: aload_0        
        //   363: ldc2_w          -8873886124187045758
        //   366: lload_2        
        //   367: invokedynamic   BootstrapMethod #26, p:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   372: aload           22
        //   374: iload           24
        //   376: ldc2_w          -7470344333521155798
        //   379: lload_2        
        //   380: invokedynamic   BootstrapMethod #27, q:(Ljava/lang/Object;IJJ)Z
        //   385: lload           17
        //   387: dup2_x1        
        //   388: pop2           
        //   389: iconst_2       
        //   390: iconst_3       
        //   391: anewarray       Ljava/lang/Object;
        //   394: dup_x1         
        //   395: swap           
        //   396: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   399: iconst_2       
        //   400: swap           
        //   401: aastore        
        //   402: dup_x1         
        //   403: swap           
        //   404: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   407: iconst_1       
        //   408: swap           
        //   409: aastore        
        //   410: dup_x2         
        //   411: dup_x2         
        //   412: pop            
        //   413: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   416: iconst_0       
        //   417: swap           
        //   418: aastore        
        //   419: ldc2_w          -8917416433754226609
        //   422: lload_2        
        //   423: invokedynamic   BootstrapMethod #28, q:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   428: aload           21
        //   430: ifnull          875
        //   433: goto            446
        //   436: ldc2_w          -8650751221863098681
        //   439: lload_2        
        //   440: invokedynamic   BootstrapMethod #29, n:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   445: athrow         
        //   446: aload_0        
        //   447: ldc2_w          -8873886124187045758
        //   450: lload_2        
        //   451: invokedynamic   BootstrapMethod #26, p:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   456: aload           22
        //   458: iload           24
        //   460: ldc2_w          -7470344333521155798
        //   463: lload_2        
        //   464: invokedynamic   BootstrapMethod #27, q:(Ljava/lang/Object;IJJ)Z
        //   469: lload           19
        //   471: iconst_2       
        //   472: iconst_3       
        //   473: anewarray       Ljava/lang/Object;
        //   476: dup_x1         
        //   477: swap           
        //   478: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   481: iconst_2       
        //   482: swap           
        //   483: aastore        
        //   484: dup_x2         
        //   485: dup_x2         
        //   486: pop            
        //   487: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   490: iconst_1       
        //   491: swap           
        //   492: aastore        
        //   493: dup_x1         
        //   494: swap           
        //   495: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   498: iconst_0       
        //   499: swap           
        //   500: aastore        
        //   501: ldc2_w          -7097011891908495639
        //   504: lload_2        
        //   505: invokedynamic   BootstrapMethod #28, q:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   510: aload           21
        //   512: ifnull          875
        //   515: goto            528
        //   518: ldc2_w          -8650751221863098681
        //   521: lload_2        
        //   522: invokedynamic   BootstrapMethod #29, n:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   527: athrow         
        //   528: aload_0        
        //   529: ldc2_w          -8873886124187045758
        //   532: lload_2        
        //   533: invokedynamic   BootstrapMethod #26, p:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   538: aload           22
        //   540: iload           24
        //   542: ldc2_w          -7470344333521155798
        //   545: lload_2        
        //   546: invokedynamic   BootstrapMethod #27, q:(Ljava/lang/Object;IJJ)Z
        //   551: iconst_2       
        //   552: iload           8
        //   554: iload           9
        //   556: i2b            
        //   557: iload           10
        //   559: iconst_5       
        //   560: anewarray       Ljava/lang/Object;
        //   563: dup_x1         
        //   564: swap           
        //   565: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   568: iconst_4       
        //   569: swap           
        //   570: aastore        
        //   571: dup_x1         
        //   572: swap           
        //   573: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   576: iconst_3       
        //   577: swap           
        //   578: aastore        
        //   579: dup_x1         
        //   580: swap           
        //   581: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   584: iconst_2       
        //   585: swap           
        //   586: aastore        
        //   587: dup_x1         
        //   588: swap           
        //   589: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   592: iconst_1       
        //   593: swap           
        //   594: aastore        
        //   595: dup_x1         
        //   596: swap           
        //   597: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   600: iconst_0       
        //   601: swap           
        //   602: aastore        
        //   603: ldc2_w          -7240244224604364704
        //   606: lload_2        
        //   607: invokedynamic   BootstrapMethod #28, q:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   612: aload           21
        //   614: ifnull          875
        //   617: goto            630
        //   620: ldc2_w          -8650751221863098681
        //   623: lload_2        
        //   624: invokedynamic   BootstrapMethod #29, n:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   629: athrow         
        //   630: aload_0        
        //   631: ldc2_w          -8873886124187045758
        //   634: lload_2        
        //   635: invokedynamic   BootstrapMethod #26, p:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   640: aload           22
        //   642: iload           24
        //   644: ldc2_w          -7470344333521155798
        //   647: lload_2        
        //   648: invokedynamic   BootstrapMethod #27, q:(Ljava/lang/Object;IJJ)Z
        //   653: lload           11
        //   655: iconst_2       
        //   656: iconst_3       
        //   657: anewarray       Ljava/lang/Object;
        //   660: dup_x1         
        //   661: swap           
        //   662: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   665: iconst_2       
        //   666: swap           
        //   667: aastore        
        //   668: dup_x2         
        //   669: dup_x2         
        //   670: pop            
        //   671: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   674: iconst_1       
        //   675: swap           
        //   676: aastore        
        //   677: dup_x1         
        //   678: swap           
        //   679: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   682: iconst_0       
        //   683: swap           
        //   684: aastore        
        //   685: ldc2_w          -7487172283134880481
        //   688: lload_2        
        //   689: invokedynamic   BootstrapMethod #28, q:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   694: aload           21
        //   696: ifnull          875
        //   699: goto            712
        //   702: ldc2_w          -8650751221863098681
        //   705: lload_2        
        //   706: invokedynamic   BootstrapMethod #29, n:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   711: athrow         
        //   712: aload_0        
        //   713: ldc2_w          -8873886124187045758
        //   716: lload_2        
        //   717: invokedynamic   BootstrapMethod #26, p:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   722: aload           22
        //   724: iload           24
        //   726: ldc2_w          -7470344333521155798
        //   729: lload_2        
        //   730: invokedynamic   BootstrapMethod #27, q:(Ljava/lang/Object;IJJ)Z
        //   735: lload           13
        //   737: dup2_x1        
        //   738: pop2           
        //   739: iconst_2       
        //   740: iconst_3       
        //   741: anewarray       Ljava/lang/Object;
        //   744: dup_x1         
        //   745: swap           
        //   746: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   749: iconst_2       
        //   750: swap           
        //   751: aastore        
        //   752: dup_x1         
        //   753: swap           
        //   754: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   757: iconst_1       
        //   758: swap           
        //   759: aastore        
        //   760: dup_x2         
        //   761: dup_x2         
        //   762: pop            
        //   763: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   766: iconst_0       
        //   767: swap           
        //   768: aastore        
        //   769: ldc2_w          -9149063842375027143
        //   772: lload_2        
        //   773: invokedynamic   BootstrapMethod #28, q:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   778: aload           21
        //   780: ifnull          875
        //   783: goto            796
        //   786: ldc2_w          -8650751221863098681
        //   789: lload_2        
        //   790: invokedynamic   BootstrapMethod #29, n:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   795: athrow         
        //   796: aload_0        
        //   797: ldc2_w          -8873886124187045758
        //   800: lload_2        
        //   801: invokedynamic   BootstrapMethod #26, p:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   806: aload           22
        //   808: iload           24
        //   810: ldc2_w          -7470344333521155798
        //   813: lload_2        
        //   814: invokedynamic   BootstrapMethod #27, q:(Ljava/lang/Object;IJJ)Z
        //   819: lload           6
        //   821: dup2_x1        
        //   822: pop2           
        //   823: iconst_2       
        //   824: iconst_3       
        //   825: anewarray       Ljava/lang/Object;
        //   828: dup_x1         
        //   829: swap           
        //   830: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   833: iconst_2       
        //   834: swap           
        //   835: aastore        
        //   836: dup_x1         
        //   837: swap           
        //   838: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   841: iconst_1       
        //   842: swap           
        //   843: aastore        
        //   844: dup_x2         
        //   845: dup_x2         
        //   846: pop            
        //   847: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   850: iconst_0       
        //   851: swap           
        //   852: aastore        
        //   853: ldc2_w          -8880946158452558820
        //   856: lload_2        
        //   857: invokedynamic   BootstrapMethod #28, q:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   862: goto            875
        //   865: ldc2_w          -8650751221863098681
        //   868: lload_2        
        //   869: invokedynamic   BootstrapMethod #29, n:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   874: athrow         
        //   875: iinc            24, 1
        //   878: aload           21
        //   880: ifnull          142
        //   883: return         
        //    StackMapTable: 00 13 FF 00 8E 00 11 07 00 22 07 00 CA 04 04 04 01 01 01 04 04 04 04 04 07 01 C9 07 01 9F 01 01 00 00 35 F7 00 47 07 00 E5 09 F7 00 49 07 00 E5 09 F7 00 49 07 00 E5 09 F7 00 47 07 00 E5 09 F7 00 5B 07 00 E5 09 F7 00 47 07 00 E5 09 F7 00 49 07 00 E5 09 F7 00 44 07 00 E5 09 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type          
        //  -----  -----  -----  -----  --------------
        //  149    265    268    278    Lcom/zelix/n9;
        //  196    349    352    362    Lcom/zelix/n9;
        //  278    433    436    446    Lcom/zelix/n9;
        //  362    515    518    528    Lcom/zelix/n9;
        //  446    617    620    630    Lcom/zelix/n9;
        //  528    699    702    712    Lcom/zelix/n9;
        //  630    783    786    796    Lcom/zelix/n9;
        //  712    865    865    875    Lcom/zelix/n9;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0196:
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
    
    void f(final Object[] array) {
        final int intValue = (int)array[0];
        final int intValue2 = (int)array[1];
        final Object o = array[2];
        final int intValue3 = (int)array[3];
        final long n2;
        final long n = n2 = (((long)intValue << 32 | (long)intValue2 << 48 >>> 32 | (long)intValue3 << 48 >>> 48) ^ ci.a);
        final long l = n2 ^ 0x7690930B1277L;
        final long i = n2 ^ 0x3D0D5285FD36L;
        final long j = n2 ^ 0x29885D9B8224L;
        final long k = n2 ^ 0xF6F9D735244L;
        final long n3 = n2 ^ 0x269FAC9B546DL;
        final long m = n2 ^ 0x688BB44F2C74L;
        final _0[] array2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_115.invoke(4304413523773050188L, n);
        Label_0813: {
            Object o5 = null;
            JTextField textField3 = null;
            Label_0474: {
                Object o2 = null;
                JTextField textField = null;
                Label_0448: {
                    try {
                        final Object o3;
                        o2 = (o3 = o);
                        final JTextField textField2;
                        textField = (textField2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_116.invoke(this, 4064007076734381838L, n));
                        if (array2 != null) {
                            break Label_0474;
                        }
                        if (o2 != textField) {
                            break Label_0448;
                        }
                    }
                    catch (final n9 n4) {
                        throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_117.invoke(n4, 4399261046232673336L, n);
                    }
                    final String trim = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_119.invoke(ProcyonInvokeDynamicHelper_118.invoke(this, 4064007076734381838L, n), 4542560623606295450L, n).trim();
                    Label_0440: {
                        Label_0381: {
                            Object o4 = null;
                            Label_0221: {
                                try {
                                    final Object o3;
                                    final _0[] array3;
                                    o4 = (array3 = (_0[])(o3 = array2));
                                    if (intValue2 <= 0) {
                                        break Label_0381;
                                    }
                                    if (o4 != null) {
                                        break Label_0381;
                                    }
                                    final String s = trim;
                                    final int n5 = s.length();
                                    if (n5 == 0) {
                                        break Label_0221;
                                    }
                                    break Label_0381;
                                }
                                catch (final n9 n6) {
                                    throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_120.invoke(n6, 4399261046232673336L, n);
                                }
                                try {
                                    final String s = trim;
                                    final int n5 = s.length();
                                    if (n5 != 0) {
                                        break Label_0381;
                                    }
                                    /* invokedynamic(!) */ProcyonInvokeDynamicHelper_124.invoke(ProcyonInvokeDynamicHelper_121.invoke(this, 4064007076734381838L, n), ProcyonInvokeDynamicHelper_123.invoke(ProcyonInvokeDynamicHelper_122.invoke(this, 4478430233932565117L, n), new Object[] { i }, 2399241075076647634L, n), 4523547653427619861L, n);
                                    /* invokedynamic(!) */ProcyonInvokeDynamicHelper_128.invoke(new Object[] { /* invokedynamic(!) */ProcyonInvokeDynamicHelper_125.invoke(this, 4503941356102425337L, n), n3, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_126.invoke(12935, 0x6DF7645999E0FB4EL ^ n), /* invokedynamic(!) */ProcyonInvokeDynamicHelper_127.invoke(2611, 0x624D2C41E233C3FBL ^ n) }, 2358899142158822194L, n);
                                }
                                catch (final n9 n7) {
                                    throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_129.invoke(n7, 4399261046232673336L, n);
                                }
                            }
                            try {
                                final _0[] array3 = array2;
                                if (intValue < 0) {
                                    break Label_0440;
                                }
                                if (o4 != null) {
                                    /* invokedynamic(!) */ProcyonInvokeDynamicHelper_131.invoke(ProcyonInvokeDynamicHelper_130.invoke(this, 4478430233932565117L, n), new Object[] { trim, k }, 2358299074623699006L, n);
                                }
                            }
                            catch (final n9 n8) {
                                throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_132.invoke(n8, 4399261046232673336L, n);
                            }
                        }
                        try {
                            final _0[] array3 = array2;
                            if (intValue > 0) {
                                if (array3 == null) {
                                    return;
                                }
                                o5 = o;
                            }
                            textField3 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_133.invoke(this, 2855398182485414229L, n);
                        }
                        catch (final n9 n9) {
                            throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_134.invoke(n9, 4399261046232673336L, n);
                        }
                    }
                }
                try {
                    if (intValue2 < 0 || array2 != null) {
                        break Label_0813;
                    }
                    if (o2 != textField) {
                        goto Label_0787;
                    }
                }
                catch (final n9 n10) {
                    throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_135.invoke(n10, 4399261046232673336L, n);
                }
            }
            final String trim2 = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_137.invoke(ProcyonInvokeDynamicHelper_136.invoke(this, 2855398182485414229L, n), 4542560623606295450L, n).trim();
            Label_0780: {
                Label_0721: {
                    Label_0562: {
                        try {
                            final _0[] array6;
                            final _0[] array5;
                            final _0[] array4 = array5 = (array6 = array2);
                            if (intValue2 < 0) {
                                break Label_0721;
                            }
                            if (array4 != null) {
                                break Label_0721;
                            }
                            final String s2 = trim2;
                            final String s3 = "*";
                            final int n11 = s2.indexOf(s3);
                            final int n12 = -1;
                            if (n11 != n12) {
                                break Label_0562;
                            }
                            break Label_0721;
                        }
                        catch (final n9 n13) {
                            throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_138.invoke(n13, 4399261046232673336L, n);
                        }
                        try {
                            final String s2 = trim2;
                            final String s3 = "*";
                            final int n11 = s2.indexOf(s3);
                            final int n12 = -1;
                            if (n11 == n12) {
                                break Label_0721;
                            }
                            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_142.invoke(ProcyonInvokeDynamicHelper_139.invoke(this, 2855398182485414229L, n), ProcyonInvokeDynamicHelper_141.invoke(ProcyonInvokeDynamicHelper_140.invoke(this, 4478430233932565117L, n), new Object[] { l }, 2541375614540915157L, n), 4523547653427619861L, n);
                            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_146.invoke(new Object[] { /* invokedynamic(!) */ProcyonInvokeDynamicHelper_143.invoke(this, 4503941356102425337L, n), n3, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_144.invoke(20384, 0x218997040A48672L ^ n), /* invokedynamic(!) */ProcyonInvokeDynamicHelper_145.invoke(5387, 0x7A495D8BE0ABDCF3L ^ n) }, 2358899142158822194L, n);
                        }
                        catch (final n9 n14) {
                            throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_147.invoke(n14, 4399261046232673336L, n);
                        }
                    }
                    try {
                        final _0[] array5;
                        final _0[] array6 = array5 = array2;
                        if (intValue3 <= 0) {
                            break Label_0780;
                        }
                        if (array5 != null) {
                            /* invokedynamic(!) */ProcyonInvokeDynamicHelper_149.invoke(ProcyonInvokeDynamicHelper_148.invoke(this, 4478430233932565117L, n), new Object[] { trim2, j }, 2345000543895661527L, n);
                        }
                    }
                    catch (final n9 n15) {
                        throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_150.invoke(n15, 4399261046232673336L, n);
                    }
                }
                try {
                    final _0[] array6 = array2;
                    if (intValue3 >= 0 && array6 == null) {
                        return;
                    }
                    /* invokedynamic(!) */ProcyonInvokeDynamicHelper_151.invoke(this, 2850604450826025606L, n);
                }
                catch (final n9 n16) {
                    throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_152.invoke(n16, 4399261046232673336L, n);
                }
            }
            try {
                if (o5 == textField3) {
                    /* invokedynamic(!) */ProcyonInvokeDynamicHelper_156.invoke(ProcyonInvokeDynamicHelper_153.invoke(this, 4478430233932565117L, n), new Object[] { m, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_155.invoke(ProcyonInvokeDynamicHelper_154.invoke(this, 2850604450826025606L, n), 4542560623606295450L, n).trim() }, 4036984809742789186L, n);
                }
            }
            catch (final n9 n17) {
                throw /* invokedynamic(!) */ProcyonInvokeDynamicHelper_157.invoke(n17, 4399261046232673336L, n);
            }
        }
    }
    
    public void itemStateChanged(final ItemEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          85697306648579
        //     6: lxor           
        //     7: lstore_2       
        //     8: lload_2        
        //     9: dup2           
        //    10: ldc2_w          104320886705035
        //    13: lxor           
        //    14: lstore          4
        //    16: dup2           
        //    17: ldc2_w          57210686142066
        //    20: lxor           
        //    21: lstore          6
        //    23: dup2           
        //    24: ldc2_w          87378132818242
        //    27: lxor           
        //    28: lstore          8
        //    30: dup2           
        //    31: ldc2_w          103130605230870
        //    34: lxor           
        //    35: lstore          10
        //    37: dup2           
        //    38: ldc2_w          75853228899811
        //    41: lxor           
        //    42: lstore          12
        //    44: pop2           
        //    45: ldc2_w          -6634271542449744610
        //    48: lload_2        
        //    49: invokedynamic   BootstrapMethod #39, k:(JJ)[Lcom/zelix/_0;
        //    54: aload_1        
        //    55: ldc2_w          -4884956713421780919
        //    58: lload_2        
        //    59: invokedynamic   BootstrapMethod #40, t:(Ljava/lang/Object;JJ)Ljava/lang/Object;
        //    64: astore          15
        //    66: astore          14
        //    68: aload           15
        //    70: aload_0        
        //    71: ldc2_w          -4995994113203108977
        //    74: lload_2        
        //    75: invokedynamic   BootstrapMethod #15, u:(Ljava/lang/Object;JJ)Ljavax/swing/JComboBox;
        //    80: if_acmpne       499
        //    83: aload_1        
        //    84: ldc2_w          -6520737096722156234
        //    87: lload_2        
        //    88: invokedynamic   BootstrapMethod #41, t:(Ljava/lang/Object;JJ)I
        //    93: aload           14
        //    95: ifnonnull       178
        //    98: goto            111
        //   101: ldc2_w          -6530398709396212630
        //   104: lload_2        
        //   105: invokedynamic   BootstrapMethod #42, k:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   110: athrow         
        //   111: iconst_1       
        //   112: if_icmpne       499
        //   115: goto            128
        //   118: ldc2_w          -6530398709396212630
        //   121: lload_2        
        //   122: invokedynamic   BootstrapMethod #42, k:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   127: athrow         
        //   128: aload_0        
        //   129: aload           14
        //   131: ifnonnull       213
        //   134: goto            147
        //   137: ldc2_w          -6530398709396212630
        //   140: lload_2        
        //   141: invokedynamic   BootstrapMethod #42, k:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   146: athrow         
        //   147: ldc2_w          -4995994113203108977
        //   150: lload_2        
        //   151: invokedynamic   BootstrapMethod #15, u:(Ljava/lang/Object;JJ)Ljavax/swing/JComboBox;
        //   156: ldc2_w          -6543007137387577462
        //   159: lload_2        
        //   160: invokedynamic   BootstrapMethod #41, t:(Ljava/lang/Object;JJ)I
        //   165: goto            178
        //   168: ldc2_w          -6530398709396212630
        //   171: lload_2        
        //   172: invokedynamic   BootstrapMethod #42, k:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   177: athrow         
        //   178: tableswitch {
        //                0: 212
        //                1: 260
        //                2: 321
        //                3: 382
        //                4: 443
        //          default: 499
        //        }
        //   212: aload_0        
        //   213: ldc2_w          -6452364191322467793
        //   216: lload_2        
        //   217: invokedynamic   BootstrapMethod #20, u:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   222: iconst_2       
        //   223: lload           10
        //   225: iconst_2       
        //   226: anewarray       Ljava/lang/Object;
        //   229: dup_x2         
        //   230: dup_x2         
        //   231: pop            
        //   232: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   235: iconst_1       
        //   236: swap           
        //   237: aastore        
        //   238: dup_x1         
        //   239: swap           
        //   240: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   243: iconst_0       
        //   244: swap           
        //   245: aastore        
        //   246: ldc2_w          -5023635764537439166
        //   249: lload_2        
        //   250: invokedynamic   BootstrapMethod #4, t:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   255: aload           14
        //   257: ifnull          499
        //   260: aload_0        
        //   261: ldc2_w          -6452364191322467793
        //   264: lload_2        
        //   265: invokedynamic   BootstrapMethod #20, u:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   270: lload           12
        //   272: iconst_2       
        //   273: iconst_2       
        //   274: anewarray       Ljava/lang/Object;
        //   277: dup_x1         
        //   278: swap           
        //   279: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   282: iconst_1       
        //   283: swap           
        //   284: aastore        
        //   285: dup_x2         
        //   286: dup_x2         
        //   287: pop            
        //   288: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   291: iconst_0       
        //   292: swap           
        //   293: aastore        
        //   294: ldc2_w          -4700059903518825814
        //   297: lload_2        
        //   298: invokedynamic   BootstrapMethod #4, t:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   303: aload           14
        //   305: ifnull          499
        //   308: goto            321
        //   311: ldc2_w          -6530398709396212630
        //   314: lload_2        
        //   315: invokedynamic   BootstrapMethod #42, k:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   320: athrow         
        //   321: aload_0        
        //   322: ldc2_w          -6452364191322467793
        //   325: lload_2        
        //   326: invokedynamic   BootstrapMethod #20, u:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   331: iconst_2       
        //   332: lload           4
        //   334: iconst_2       
        //   335: anewarray       Ljava/lang/Object;
        //   338: dup_x2         
        //   339: dup_x2         
        //   340: pop            
        //   341: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   344: iconst_1       
        //   345: swap           
        //   346: aastore        
        //   347: dup_x1         
        //   348: swap           
        //   349: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   352: iconst_0       
        //   353: swap           
        //   354: aastore        
        //   355: ldc2_w          -6876287517234126032
        //   358: lload_2        
        //   359: invokedynamic   BootstrapMethod #4, t:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   364: aload           14
        //   366: ifnull          499
        //   369: goto            382
        //   372: ldc2_w          -6530398709396212630
        //   375: lload_2        
        //   376: invokedynamic   BootstrapMethod #42, k:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   381: athrow         
        //   382: aload_0        
        //   383: ldc2_w          -6452364191322467793
        //   386: lload_2        
        //   387: invokedynamic   BootstrapMethod #20, u:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   392: iconst_2       
        //   393: lload           8
        //   395: iconst_2       
        //   396: anewarray       Ljava/lang/Object;
        //   399: dup_x2         
        //   400: dup_x2         
        //   401: pop            
        //   402: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   405: iconst_1       
        //   406: swap           
        //   407: aastore        
        //   408: dup_x1         
        //   409: swap           
        //   410: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   413: iconst_0       
        //   414: swap           
        //   415: aastore        
        //   416: ldc2_w          -4660808694909438646
        //   419: lload_2        
        //   420: invokedynamic   BootstrapMethod #4, t:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   425: aload           14
        //   427: ifnull          499
        //   430: goto            443
        //   433: ldc2_w          -6530398709396212630
        //   436: lload_2        
        //   437: invokedynamic   BootstrapMethod #42, k:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   442: athrow         
        //   443: aload_0        
        //   444: ldc2_w          -6452364191322467793
        //   447: lload_2        
        //   448: invokedynamic   BootstrapMethod #20, u:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   453: iconst_2       
        //   454: lload           6
        //   456: iconst_2       
        //   457: anewarray       Ljava/lang/Object;
        //   460: dup_x2         
        //   461: dup_x2         
        //   462: pop            
        //   463: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   466: iconst_1       
        //   467: swap           
        //   468: aastore        
        //   469: dup_x1         
        //   470: swap           
        //   471: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   474: iconst_0       
        //   475: swap           
        //   476: aastore        
        //   477: ldc2_w          -4626002347617714895
        //   480: lload_2        
        //   481: invokedynamic   BootstrapMethod #4, t:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   486: goto            499
        //   489: ldc2_w          -6530398709396212630
        //   492: lload_2        
        //   493: invokedynamic   BootstrapMethod #42, k:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   498: athrow         
        //   499: return         
        //    StackMapTable: 00 13 FF 00 65 00 0A 07 00 22 07 01 89 04 04 04 04 04 04 07 01 C9 07 00 26 00 01 07 00 E5 49 01 46 07 00 E5 09 48 07 00 E5 49 07 00 22 54 07 00 E5 49 01 21 40 07 00 22 2E 72 07 00 E5 09 72 07 00 E5 09 72 07 00 E5 09 6D 07 00 E5 09
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type          
        //  -----  -----  -----  -----  --------------
        //  68     98     101    111    Lcom/zelix/n9;
        //  83     115    118    128    Lcom/zelix/n9;
        //  111    134    137    147    Lcom/zelix/n9;
        //  128    165    168    178    Lcom/zelix/n9;
        //  213    308    311    321    Lcom/zelix/n9;
        //  260    369    372    382    Lcom/zelix/n9;
        //  321    430    433    443    Lcom/zelix/n9;
        //  382    489    489    499    Lcom/zelix/n9;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0111:
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
    
    static {
        a = prr.a(-5542117537237891635L, -6123716291148732963L, (Object)MethodHandles.lookup().lookupClass()).a(198487943382883L);
        final long n = ci.a ^ 0x4D13BA468169L;
        g = new HashMap(13);
        final Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        final int opmode = 2;
        final SecretKeyFactory instance2 = SecretKeyFactory.getInstance("DES");
        final byte[] key = new byte[8];
        key[0] = (byte)(n >>> 56);
        for (int j = 1; j < 8; ++j) {
            key[j] = (byte)(n << j * 8 >>> 56);
        }
        instance.init(opmode, instance2.generateSecret(new DESKeySpec(key)), new IvParameterSpec(new byte[8]));
        final String[] d2 = new String[63];
        int n2 = 0;
        String s;
        int n3 = (s = "{\u0097BH,\u009b\u00db\u009e\u00ad\u008c\u00c5\u0086\u00ff\u0000\u0014\u0015\u0001\u00e8>\u001e\u00965\u0083B\u0087\u009fa5p\u0006,q\u0092\u00df$$\u0094i \u00e9%°„\u00de\u00dd\u0001°¿\u001a?*\u00e8\u00df\u00d2H?i\u008a \u0085\u00d2V°§.n\f\u0084\u0013kDC\u009d\u00e6\u00fc\u00ce\u0096i5k\u0003-iR\u0018?\u0013\u00d8\u00d8<\u00e6?h\u009bp?\u008cL\u00fa\u0090~\u0017.r?\u00e7\f\u001e?\u0017\u009e\u00dd4\u009a\u00e5\u00fd;\u00cf?e\u0086?8)\u000b\u0091')g?^#N\u00fd1v\u0019H°§\n?;\u008f7q\u007f\u000f\u00dc\u009f\b?\u008c\u00d0\u0001\u0094\\\u0015D\u00e0\n<\u0096\u000f?'\u001f[\u0092M$4\u00c8>G(\u009a\u0094\u00c3\u0018?\u00d9\u001a\u00ccR\u00ce\u00ea\u0006\u0094\u0019\u0097!\u0089\u00d7\u001f!\u00c9|P\u00c3M\u00c5!\u00977\u00edj>F\n\u00f7\u001c&\u00f5\u008f\u00fa\u0082\u00c0,?\u0098°Ë\u00d7m]\u00edD?8\u00f1k\u0019\u00ff\u00ccX9\u009aD\u00e4\u0082D{\u00df$\u0099\u001b?K}\u0017>°„,\u00ccz\u0082\u00d8\u00813\u00eb\u00e8\u0007\u00d2\u009f\u0000|L\u0014\u00ca\u0093\u0014.?\u00cf$p>\u0002\u00cb\u0010\u0014V\u00e6\u00d1\u00e2?b\u0091\u0081\"{\u0015°Ï\u00e2]?H\u0014?\u00e5\u00fd$Q\u0004\u00d2?\u00fc\u009e\u00e9L>\u00c2\u00c3\u00ce\u00c3\u00d0\u000f?\u001e~\u0086\u00f8\u00c0\u00cd°§\u00d3\u00d1z\u00db°Ï\u00cf|\u001d\u0015\u00d2\u00fc&\u0015;\u008c\u00d9lc\u00d3?\u0007?\u00daK\u00ddO'\u0012\u0092?\u00cd\u00f9?\u0093[BD\u0004 \u00dc\u0010\u0096\u00eb\u0098\u0010U?L\u00ed\u00e3\u00d1\u00d0a\u009c\u008c\u00c2?-\u00d5\u0095[8^\u009e°ËgEB\u00cbXtBl\u00d9\f\u00df\u0000\u00d9?zl?-\u00ca\u0084Q°„\u0091Rpi\u00f6??\u00d3\u009fazh\u00e6UU\u00d1>\u00e6!4`\u00ce\u00e6\u00cfie\f,#?\u0003\u0010\u00e2\u001a2\u00ed^°ß?\u00f44E.?t\u0019\u00e4\u00ea DV?\u00ec?\u00fd\u00f6N?\u00f4v?|x\u0097OZ?\u00f6N??\u00d0\u00f8;d\u00eeB\u0014qz\u00f0\u0010\u00cc\u0092q#\u00ebq\u0019°ße+7\u00fd\u0081\u00ca?\u00c4\u0010\u000e\n\u0090\u00c1\u00f01\u001f[\u00ad]?)te]\u00adH\u00f1)\u00da\u00846\u00c8\u0092y\u00e6\u00ff/\u00daS\b\u00d5'?\u0011°ß\\\u0088\u0005\u00f3\u00c9u\u0085°¿$°§WE[\u001fk\u00eclSl$D?0\u000e?*\u00c0eJD\u0001(\u00e5??TK]°¿\u0001\u0098\u00fdW\u00e9\u0003?\u00c3wp\u00d1??\u000e0F\u00de\u000e?\t\u00fb\u00cd\u00f5\u0004 \u00fb°¿v\u0091\u009d\u00e6?\u00c0\u00ff@bT*fm*E\u009d/\u0004\u007f\u0081\u00f6Ab0\u00edQfwKO\u0017.?\u0013?u8\u00dfQc,#\u00d6\u00d4\u00e048?\u0019Gx\u00d1\u00d0g\u009cd?{\u00f8riLk\u00c9lA\u0015?z\u00db\u00d3\u008eu\u00df\u00ca\u0099\u0000\u00dd\u00e8?\u00efDw?\u00d3\u00e1/hqV\u00d9\u00f8?\u0010\u009b(\u00d24\u00df°Ï?\u0083T\u0004\u0013w\u00c8wJ\u001d \u00939\u00fd\u001c\u0003\u00e7 \u0099?mFQ°Ï?4|q\u0094\u0004\f\u0089\u001a\u001c\u0092%\u009d\u00c0?\u00eb°§?\u00e2 \u001a\u009c\u00f2\u007f\u00d0?\u00d1\u00e2\u00daX.8jb\u000eo?,sQ|\u00fcw\u0089|\u00c6S\u009a\u000e?0\u00c9P\u0090?\u00f2\u008d\u009d\u0003\u008b\u00dc\u00c1?\u0000%?Q\u00f4\u009f\u00df\u0007%(\u008b\u00d4\u001b\u001a\u00eb\u00d2?\u00e4\u0083\u0013?{??\u008f?O\u00daj^\u0093\u00ad{°Ë\u0013&L\u00d9\u00f6\u009b\u00f9Gr\u0013\u00dd?\u00f8\u000b(\u00d0nV0;'\u00cfR@R34\u0089\u00db\u00fd?°ß,\u008c8;\u0010\u00cb\u000b?r\u000b?\\\u00d0e\u00ed\u00ea\u0083\u00e1v\u00d8\u0011P\u00df??\u00ef6\u00cd!:y\u00df\u001f\u0014\u00eb[P\u00d1[!\u000e\u00e5\u00c4\u00c3f°„3=GVN4\u00c1\u00f5-\u0099!\u001f?\u00cc?\u0001?\u0013\u0081Jr?i\u00c8\u00c6\u00fd\u0083D\u0010O\u00129o\u00d9\u0004\u001f°§\u000fG\u00cb%\u00c9\u0012VJBqQm?T?\u00d3F\u0086\u00c2\u0010{\u000by{?2\u00c0?\u00c0\u00f4z\u00fe\u00cfD\r\u00ad\u0088\u00dbc>°¿5K\u0099\u0095?\u009bT\u00df\u00fe\u00e1\u00e8\u009f\u00f4V\u00fb°ß\u009e\u00dc0\u0098\u000b\u0095>\u0016\u008eIhn.\u0088U??h\u0005\u00c3\u0094\u000e\u001a\u00e7?\u00048\u0000°ß4c_\r\u0002°Ëlh_\u0091O\u00e0l1\u0085G\u00e4\u00c2?X\u00d6\u00d2\u00d6?\u00dd\u008b??\u00e8?\u001f\u00d2\u00d7-\u00f9\u00d3\u0090\u00fc\u00c2\u00ad?D\u00f3\u00ad(L;\u00e8b6N?\u00f3U\u00f1k\u00ffe\u00cb\u00d1^\u0084\u0003?\u00c6Z\u000b:\u00f4\u00cc'\u0017d\u00c4\u00fa\u0088%?\u0015\u00c9\u0016\u0012?\u00884\t\u00fbP\f\u008e\u00c9\u0012\u00caT\u0085\u0095?\u00feBxWv\u00d7Y%\t\u00df\u00dbr\u00e9\u00dd\u00ed\u0092\u00e7\u0091*h\u00df\n\u00f7\u009c\u00c8?A-\u00e0\u00d5\u0092:rVZ0*?\u0016\u00d2,\u0007?KxiJH\u009a?\u00e4\u0019;\u0018\u00c6\\r\u0097\u00e7\u00e67\u00db°„°§w\u001b1?+\u0000P(?A~\u00c0\u00f5\u00d7\t\u00e7\b\u00d7\u00fdyZ\u00edQ\u00ca\u0088?,\u0095\u00f9\u008dR°ßP\u00f3\u00d7\u0013Q?v\u0093\u0095`\u001b\u00d4N8\u00890\u0010?-\u00ecJ\u00da\u0007\u0007?°§\u0007?\u0095\u00d2\u00cb\u0084\u00148\u00fc\u00f1\u0092_\u00cb\u00f4JV%D\u00f7\u009a?\u00d8\u00d2\u00c66\u0010\u0002\u00f2??#W'\u00ce\u0018\u0087\u0091\u008a\u00d45??P?q7b\u0098\u008f\u0083\u00ea\u00fd<\u0001\u0081\u00d2\u00c2x\u00c2\t\u00dc\u00dd\u009e\u00fc8\u008b+\u00f1\u0099\u0099\u008d?\u00c8?\u00c4\u009c0\u00ca\u009a<+\u0089j=%\u00c2e?\u0000\u00e3\u008f°Ë\u0087pk}\u0084e?\u00e6]H\u001c,\u00ca\u0017z?\u00d0N`\u008dN0w\u00e3\u0004\u0000\u00e8\u0085?\u0018\u001eK\t\u0016\u00f6K\u0090\u0086<a\u00ec\u0094msc°ß\u0089°„2?\u00ee?\u0095\u00988\u00d8W\u00c3\u0005\u00cev$\u009a5z?\u00e8?°„f\u001eq\u0084\u00f6\u00f2f°ß°§SD\u0095\u008d\\u=g?\u00cfn\u009c\u00fa\u00f1\u0016\u00cd\u0003?\u001a\u00ec?°ßBsWmmj\u0093\u00e77?$\u0088V^4>\u001c\u008d!\u0097\u0099^\u0093?`?\u00d4%°ËV\u00ec?\u00fc\u00e4\u00e0?\u00ee[>?°ß|°Ë\b??;~\u00db\u001b5\u00cf;Z\u0005\u0084\u00c5J\u0095,~\u00c3\u00d0s\u009e\u00c7?\u00e22\u00eb\u0081\u0014\u001bI\u001d6\u00e7?\u0019?o\u007fu\u00e2a\u00e3\u00ce\u0095\u00dd\u0093\\N\u00f5>\u00d3E\u00ed~J°¿xU{\u0010\u00fb\u00ec?\u001c\u0019jI?3R\u00f9V?R\u009f;\u00d8\"7\u00fe5\u00d1\u00f6\u00c1\u009d\u00f25{B\u00ce\u009a]\u00d1\u0016\u0085\u00d9\u00d8?\u00ad\u00f9\u001d\u00cef(\u0010phM\\?\u00ea\u00ddK?l\u00153\tY\u00e5i8e\u00ceb3\u00eb?/@\u0092\u0089x\u00f4\u00e0\u00f4\u00e8\u00e9\u009c-\u00c7\u008c\u00d6;?\u00df?\u000b1u8\u009an\u00eet\u00dcR\u0092\u00cd\u0086\u00d9\u00ff*\u00c6\u00df\u00c5\u00f0?g%\u00f1[X\u0019DgN\u007f8°„W?,\u00c6b\u009c\u00e9\u0082\u00ef%Ms\u0097\u0094\u000b\u00db\u00e0\u00f5\u00e4\\?\u00e4\u00d2`\u0099\u0095?\u00eb\u00db\u00e2a\u00cf.\u00e9\u0004?D\"\u00c9\u0018\u00d6°Ïfg0ej\u00c3'\u00c0m7\u0090\u001c\u00c2\u0018\u00c6?4\u00ee@?!\u00d8?_OT\u00de\u00f3=g?\u0012-\u00d86\u00ff\u001d?\u0018\u000e\u008b\u00ad\u00e2\u00c6 p\u00c4\u00c6\u00cb\u0017\u008bq\u00e3\u0093\u001c\u001f\u00e7?\u001e~?\u00fb\u00dd\u0018t\u00ca\u00c5\u00e3\u0019h\u001f\u00f0\u00d4\u00cd\u00deJ;Z\u00e8\u008c\u00c6\u00f1j\u0095h[\u00c6\u0017x\f\u00c2?°ß\u00e4\u0007\u00d1??\u00c1\u00c2]S's??\u0004\u009c?&\u0087|\u000e\u000b{\u001e'l\u0083%\u0014?;D]\u00c3J\u0095?\u0007\u0082\u00d4?\u0080?J%E\u00c3\u0013e,?<wm\u0087\u00f1\u00cf0\u00fc?*}\u0099\u00db??\u0098|9g\u0010?cc\u00f6\b?k\u008a&<\u00d8?\r\u0010\u000ex\u00e7\u00d4\u0016?\u00dd\u00ed*8\\+\u0087\u001f\u00d70<Us0\u00e8\u0011P\u00fb\u00f5?\u00d6\u00eb\u00c8\u0091\u00ea\u009e8i\u0085\u00de>\u00fbG\u00957w]R\u0090H?8\u0083H\u00e4\u00e7\u0094NJ\u00de?\u0098\u0016?\u00d4\u0001\u0081v\u009f\u0004\u0093l?Gd\u00d7\u00e0?#j?Fv6?6\u0012\u00cf~??\u009cs8:/\u00f5\u00dc4WL\u00de3j\u0095\u00d6-\u00ea\r\u0091\u00cd\u00fb\u009az.l\u00fa\u001c\u00e7\u00ef?\u008e\u00d9t\u0001@\u0080e\u00f2\u00e9)\u0097o\u0017A\u00d8°ß\u0000S\u00d76\u00e1\u00dcH@\u00ed\u00f9;\u00d37`\u00f0\u00e20\u0015\u000b\u00c7°Ï°„?T[\u00c2x\u00f5?/\u00fa\u00f6Y\u0012/°„:\u00ff\u000b$}°Ï\u00fd:?\u0002\u00e6R\\\u00fahun\u00ea\u00c2\u00f3\u007f\u009f\u0096x\u00e3\u00d3\u00ed\u0098\t\u0017>>l?\u00d5O\u001a\u00ea%\u0012\u00c1\u0083?P\u0084°„\u001c\u00db4?i\u00c7\u0091\u0016s\u00c1\u0018\fx?\\\u00c2\u00ea+\u009f?\u0087\u00c2\u009b?\u000b,kW0\\p\u00104?\u008b\u00cd\u0095\u008e?\u00c9?R\u00c3?q\u00e11^Q°Ë\u008d\u0098?\u00f7M<\u00167\u0006Ab\u00f4qT?+\u00e2\u007f\u00ed\u00dc\u0080\u00e4\u0084n\u009b\u008a!\u0010\u00fd\u009b\u0091s\u00d2?\u0085\u00f9\u00d1\u00f1\u0017<\u00c1\u0098\u00d3h\u0010?\u00e5C5\u000b?\u0016°„\u0014\u007ff1+L??`t\u00ebn\u00c5VX*9\u0017Z?\u00de#b\u0092\u00f8~??{\u00f92\u00f4\u00e3\u00e2o\u00e3Te\u0086\u0090?\u0007jQ\u00c1\u00f8r??c~1\u00d0/\u001d\u0089\u00cc\u0013y\u00fe+LA\u00c232\u0083~b?_+\u009d\u00ff6\u00e5\u00f5\u0006[P\u000e>\u00e7\u001e \u0019\u00daN*\u00d57\u00cb\u00d0\u0094\u00fd|\u00e9\u008a\u001b_\u0005eX\u00f8^\u0018°§I\u00c0\u009do\u00f7\u008d\u0086\u00c4\u00eeH\u0001\u008a?\u00ed\u00d5Uo?\u008c\u001bq?2\u0010\u00d8x?H8°Ë??\u0086K\u00f0\u0094=°„\u0018\u00eeP\u00e06M\u001e\u00adA\u00ee\r\u0013\u00fd;\u009eP?\u00c2E\u0017rpD.\u00ee\u001f\u0086j\u00c3 \u00cai#l\u00f3ud8\n?\u00cf1]°¿\u009b\u0012??\\,\u00ea/°§??\u00e5\u008b\u00d0\u00cd\u0001\u00e7\nT\u00ec?\u00f3p\u00ee?k5\u0007>\u00c5\u00f6ks\u00986\u00d4\u00d7\u001b\u008f0\u00c2\u00ee_\u000e?-j[1tN\u00ea\u00f4?e7\u001b=\u0086y\u00da_S\u001d\u001f?\u0005\"?\u001c??\u0085\u001b\u00f0°§5\u00d5\u0084\u00e3°ß\u0092\u009eG\u00d0\u00ca\u007f\u009b \u00f00\u00c9ro\u00d4~7\"\u00ce\u00c2>f\u00c1\u0019\u0092\u00cd\u0092\u0081\f>?L\u00d2\u0098p[\u0086A\u00e5>\u00e38\u0006\u00f3°„_\u0099e\u0089b\u0007C{:°Ë?S\u0080?0?\u0016 \u008e\u00f8\u00d2\u0084\u00ee\u00e5\u0001\u00e6\u008f\u00e6\u00cb\u009a\u008c?\u008b\u00c4?\u00eeu\u00f3 Ub\u00fc\u00cc)R\u00ed°§8B\u00e4*s}H#a\u00e7\u00eb\u00e8+%\u0080\u00f6\u007f\u00e7\u0099\u001a2\u00c8?Q\u00ef\u00f8\n\u00ff\u0083b\u00f9\u00eb\u00e9\u00e0H\u008d\u0087\u0005\u00c5)\u00dd?\u00d5\u0010X?\u0017\u00efb?\u0091L\u0082@\u008a\u0086#?b_\\\u00fdTx\u00f2\"V?U \u00125m\u0014\u0005JS?=0\u00c8*\u00c1°„\u0004\u00c9\u00f0\u00d5\u0016-1?o\u00f1\u00e2\u0010\u000blC:\u00fb?\u0095\u0007 \u00f3$\u00e1/r\u0080\u000bm\u00efY\u00df\u0095\u0080\u00db\u008a!\u001b?\u00c2\u00c7\u009ey?X\u00f46\u0093\u0093\u0099\u009b_h \u00f2\u00f20\u0010?\u0089\u00dec\u0016\u00cf\u001b\u00cd\u0094?\u00c6\u0087?=\u00d0?Q\u00db\u0085?\u008d\u00e7\u00c0\u0018UI\u0013O\u00152_\u0083,\u00c4m\u000e?\u00cd?y\u00965?k\u0011/8\u0013\u00ef'\u0090\u00ed?(\f\u00f8#\u00c6l\u0090H\u00e4hu\u00c3\u00fd\u00c6}\u00e0°Ï\u0097\u00d6I\u00f1\u0090(N<\u0090T\u00d5\u0006\u0003o\u00f9h\u00ddm@\u00d9°„\u0014\u00f7\u00cfw\u00cf\u00c8\u0005\u00c7?\u00ca?\u001aoE\u00c9}\u0095W\u0010A\u0095B^\u008f\u001b\u0010\tr9BRZt}\u00e8\u00ec\u00f6\u00d5\u00d9\u0093L\u00d7h\u00de\u008fr~\u00e9\u0089\u000e°Ë6?\u0013\u0085\n\u0091??\u00e9\u00c6D\t\u000e?D\u00e8\u00e3\u00f0\u00c8d\"\u00cdKV\u00dd?O3\u0017?yE\u008aR\u0019P\u00c2\rx\u0014\u0094\u0000\u00d9b\u0097\u0090*\u00cd\u00de\u00d2\u00fd2?\u001aNj\u0091\"z\u00c78\u0089\u00de\u0097\u0080O\u00f5y\u0087}S1\u008fp3v>d\u00e2\u0015?F7\u009d\u00fas°¿|\u0013Z\u00det?\b\u0082\u00dd\u0010?\u00c6\u001c\u0099)\u001a?\u00c9[}\u0084\u001a\u00e5\f\u0003\u00d2@z\u00e6?\u00862\u0013\u00fe\u000e\u00f7\u00d3@D\u00df{1\u00daq?\u00de~\u0092\u00e7r^\u0018w\u0084\u00fb%\u0095G\u00fbm\u00d8J?g6\u008f\u0011\u00db(\u00fc\u00e4?z\u008d\u00f1\u00e1\u001d\r\u00d8\u00dd\u00cb\u00db\u00c7\u00c4U\u00ef°„°Ï(\u00e0?0\u00f4$\u001f\"\u0015*?&\u00f6B\u001d\u0007^)om8\u00f9\u00cd\u00c2z(3'\u00d9qf\u0099v°„D<\u008d?\u00e6?\u00c21\u000f\u00d0+j[\u00c9\u001b\u00e9\u00ad°Ï\u0010/\u00d3F\u008a?/Q' \u000f1Q\u00cb\u00fbDf").length();
        int n4 = 56;
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
                            d2[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                continue Label_0160;
                            }
                            n3 = (s = "?}e\u0083\u00d2\u001b\u00ea\u00df\u00f0?\u0014\u000e\u00da\u008f\u00df°ß\u00c5\u008dX?;\u000b\u00d1\u0086°¿\u00ad\u00e1\u0091$\u001b\u007f\u00c5@\u00dfP?\u00d9\u0004\u0082Xz;Y\u00ed?\u001d\u00e2\u00dd\u0007%{\"?\u00cc\u00f7\n\u008d.(\u0089\u0011#\u00fc\b-\u00dd\u00f5\u001d??\u00d1°ß\u00f9?b\u00d09°Ï\u00ee\u00cd\u00f0??9??\u00f6\u00e2\rj?2\u00fa\u00f7?\u00d7\u009a").length();
                            n4 = 32;
                            n5 = -1;
                            break;
                        }
                        case 0: {
                            d2[n2++] = intern;
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
        d = d2;
        f = new String[63];
        m = new HashMap(13);
        final Cipher instance3 = Cipher.getInstance("DES/CBC/NoPadding");
        final int opmode2 = 2;
        final SecretKeyFactory instance4 = SecretKeyFactory.getInstance("DES");
        final byte[] key2 = new byte[8];
        key2[0] = (byte)(n >>> 56);
        for (int l = 1; l < 8; ++l) {
            key2[l] = (byte)(n << l * 8 >>> 56);
        }
        instance3.init(opmode2, instance4.generateSecret(new DESKeySpec(key2)), new IvParameterSpec(new byte[8]));
        final long[] i2 = new long[28];
        int n7 = 0;
        String s5;
        int n8 = (s5 = "\u00e9N\u001cp%\u0086\u0007\u0099\u00e3\u0093~?<\u001c\u00f4\u00eb\u00c9M\u0011!F?\u00e1Wd\u00e8?\u00c2x2??[\u0096\u00e5?\u00e0\u0083°¿\u0083\u00e4m\u001a\u00cb#?x{\u00db\u00de?\u0099?\u0096!\u00cb?vI\u00c5oZz?\u0094?\u0095\u00cd\u00ceY\u001e?\u008f\u0010\u00e4`\u008d\u00cc\u00fb\u0005\u00e1\u0006\b?\u000f?`\u008a\u0011^\u0003?>M\u00e8\u00cfC\u00c3\u00f31+\u00dc\u0095_\u007f\u0083\u0097By%??\u00e2\u00ed°¿\u00dc\u009e?q(\u0012n\u00c3G\u0087\u0085W\u0005y-°§°Ï?\u00f5\u0093\u00cd\u00c6\u0090\u00feT\u0018\t\u00c0\u001cmr\u00f6\u00d0\u00fdM\u009f4\u000f\u009c?\u0090?|?°„\u0018\u00d2?UQ\u00f8m\u00c5\u00eeV?\u00f0\u00d1\u0085\u0083\u0007?q?-p]°ËB\u009c?\u001c\u000e8\u001e\u00c2?\u00ebvs\u0088\u00ec\u00fe°„\u00d3\u0018\u00ccT\u00e2?H\u00c9\u00f4").length();
        int n9 = 0;
    Label_0453:
        while (true) {
            while (true) {
                final String s6 = s5;
                final int beginIndex3 = n9;
                n9 += 8;
                final byte[] bytes = s6.substring(beginIndex3, n9).getBytes("ISO-8859-1");
                long[] array2;
                long[] array = array2 = i2;
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
                            array2[n11] = n15;
                            if (n9 >= n8) {
                                n8 = (s5 = "L\u008ez\tPS<I>\u00e8IwN\u0084\u00df\u00dc").length();
                                n9 = 0;
                                break;
                            }
                            continue Label_0453;
                        }
                        case 0: {
                            array[n10] = n15;
                            if (n9 >= n8) {
                                break Label_0453;
                            }
                            break;
                        }
                    }
                    final String s7 = s5;
                    final int beginIndex4 = n9;
                    n9 += 8;
                    final byte[] bytes2 = s7.substring(beginIndex4, n9).getBytes("ISO-8859-1");
                    array = (array2 = i2);
                    n10 = (n11 = n7);
                    ++n7;
                    n12 = (((long)bytes2[0] & 0xFFL) << 56 | ((long)bytes2[1] & 0xFFL) << 48 | ((long)bytes2[2] & 0xFFL) << 40 | ((long)bytes2[3] & 0xFFL) << 32 | ((long)bytes2[4] & 0xFFL) << 24 | ((long)bytes2[5] & 0xFFL) << 16 | ((long)bytes2[6] & 0xFFL) << 8 | ((long)bytes2[7] & 0xFFL));
                    n13 = 0;
                }
            }
            break;
        }
        i = i2;
        k = new Integer[28];
        final String[] array3 = new String[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_158.invoke(29516, 0x28618C5EECD37AA8L ^ n)];
        array3[0] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_159.invoke(2070, 0x25C7C99BB5B6B8E3L ^ n);
        array3[1] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_160.invoke(30903, 0x6BEC07A5CD03C854L ^ n);
        array3[2] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_161.invoke(11848, 0x24C611C921B61E9AL ^ n);
        array3[3] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_162.invoke(14898, 0x78143AF86B408AE7L ^ n);
        array3[4] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_163.invoke(10848, 0x104BD0C516889A99L ^ n);
        array3[5] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_164.invoke(31999, 0x6397C873AE18CC12L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_165.invoke(8935, 0x64B0E2C5365FAB1BL ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_166.invoke(18109, 0x31CD2C0DA6BF667L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_167.invoke(14333, 0x1BFCBFABD2F43E1AL ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_168.invoke(23571, 0x41CA67CEAD92ECFCL ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_169.invoke(20227, 0x38C695CB5BBF46E6L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_170.invoke(17903, 0x785DE59F9F9D7518L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_171.invoke(11190, 0x78513F932378224EL ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_172.invoke(31376, 0x7401B59C39264A7BL ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_173.invoke(1831, 0x7C1BA445BCB20ED1L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_174.invoke(27725, 0x3025422FEBCD5C88L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_175.invoke(11023, 0x5555F9EE78522FCL ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_176.invoke(32148, 0x607BF7B16EE14D73L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_177.invoke(13714, 0x14D1E63E5D67BC60L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_178.invoke(231, 0x604FEB3CCF6DB026L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_179.invoke(2733, 0x5E9DE649A2DB0356L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_180.invoke(25436, 0x5B5040E64242D3A4L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_181.invoke(25417, 0x6B417D5C5D8AEAAAL ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_182.invoke(22131, 0x4E9FC5971EE1E687L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_183.invoke(3463, 0x918EF5338540466L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_184.invoke(14236, 0x366AF0D29B7D8772L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_185.invoke(9509, 0x65E8773172252CD2L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_186.invoke(22643, 0x7CED8CA668D2E888L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_187.invoke(19296, 0x1D16AC4DFCBFC29EL ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_188.invoke(7094, 0x8BFD6C8D8782B57L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_189.invoke(10526, 0xE88B91B203FA0EAL ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_190.invoke(19749, 0x5AFB969FD868FDD7L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_191.invoke(18750, 0x5F4B9D28994C0D8L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_192.invoke(21556, 0x46772EACB98AE4DCL ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_193.invoke(8819, 0x71BFD10FCC30AB89L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_194.invoke(19911, 0x27D88F884B04FD14L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_195.invoke(2454, 0x6B0CEC48C8F08063L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_196.invoke(24661, 0x51E18451D38AD092L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_197.invoke(27304, 0x15F04EF29BDAE343L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_198.invoke(7672, 0x70C9D97BCC6CAD1AL ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_199.invoke(12944, 0x63EFC04B6CA7BB7AL ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_200.invoke(15592, 0x2F2155E54BB48C35L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_201.invoke(13294, 0x796D4649650B3A06L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_202.invoke(28403, 0x13C3AC54E8EC5E3DL ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_203.invoke(13516, 0x611FD7DA97FFBD31L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_204.invoke(10068, 0xFAF5578CB5597A2L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_205.invoke(28523, 0x169A2CCD86CCE692L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_206.invoke(5404, 0x4A16B583F308A5DAL ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_207.invoke(10896, 0x4974E43EB0EB2372L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_208.invoke(15450, 0x109DAEE072678C95L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_209.invoke(6085, 0x7092E1359A7A1E25L ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_210.invoke(6481, 0x5477BFB502ED2980L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_211.invoke(30207, 0x2656F5E8F27BFC0EL ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_212.invoke(24075, 0x2254D34FECBA6EC0L ^ n);
        array3[/* invokedynamic(!) */ProcyonInvokeDynamicHelper_213.invoke(31526, 0x355C4315874CF2CFL ^ n)] = /* invokedynamic(!) */ProcyonInvokeDynamicHelper_214.invoke(28429, 0x1DEE1AE748E6DFD9L ^ n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_215.invoke(array3, 5052468451023024310L, n);
    }
    
    public ci(final char c, final char c2, final JFrame frame, final sn sn, final int n, final int n2) {
        final long n4;
        final long n3 = n4 = (((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ ci.a);
        final long n5 = n4 ^ 0x6854A2B694B0L;
        final long l = n4 ^ 0x3F492D455CD1L;
        super(frame, sn, n, n5);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_216.invoke(this, new Object[] { l }, 3945713831951196066L, n3);
    }
    
    public void focusLost(final FocusEvent focusEvent) {
        final long n = ci.a ^ 0x2A96CA42C404L;
        final long n2 = n ^ 0x5ED51E36F632L;
        final int i = (int)(n2 >>> 32);
        final int n3 = (int)(n2 << 32 >>> 48);
        final int j = (int)(n2 << 48 >>> 48);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_218.invoke(ProcyonInvokeDynamicHelper_217.invoke(this, 19112406836431711L, n), " ", 2141200437999472737L, n);
        /* invokedynamic(!) */ProcyonInvokeDynamicHelper_220.invoke(this, new Object[] { i, (int)(char)n3, /* invokedynamic(!) */ProcyonInvokeDynamicHelper_219.invoke(focusEvent, 1750966346861060098L, n), j }, 271183387238532843L, n);
    }
    
    public void focusGained(final FocusEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc2_w          17191321630377
        //     6: lxor           
        //     7: lstore_2       
        //     8: ldc2_w          -5385153429732080716
        //    11: lload_2        
        //    12: invokedynamic   BootstrapMethod #30, i:(JJ)[Lcom/zelix/_0;
        //    17: aload_1        
        //    18: ldc2_w          -6133467655533915473
        //    21: lload_2        
        //    22: invokedynamic   BootstrapMethod #48, v:(Ljava/lang/Object;JJ)Ljava/lang/Object;
        //    27: astore          5
        //    29: astore          4
        //    31: aload           5
        //    33: aload_0        
        //    34: ldc2_w          -5287772621937860106
        //    37: lload_2        
        //    38: invokedynamic   BootstrapMethod #31, w:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //    43: aload           4
        //    45: ifnonnull       139
        //    48: if_acmpne       114
        //    51: goto            64
        //    54: ldc2_w          -5479439649894047040
        //    57: lload_2        
        //    58: invokedynamic   BootstrapMethod #32, i:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //    63: athrow         
        //    64: aload_0        
        //    65: ldc2_w          -5553286243156657678
        //    68: lload_2        
        //    69: invokedynamic   BootstrapMethod #49, w:(Ljava/lang/Object;JJ)Ljavax/swing/JLabel;
        //    74: sipush          15593
        //    77: ldc2_w          2904056813874707440
        //    80: lload_2        
        //    81: lxor           
        //    82: invokedynamic   BootstrapMethod #0, r:(IJ)Ljava/lang/String;
        //    87: ldc2_w          -5829286018401819956
        //    90: lload_2        
        //    91: invokedynamic   BootstrapMethod #36, v:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //    96: aload           4
        //    98: ifnull          283
        //   101: goto            114
        //   104: ldc2_w          -5479439649894047040
        //   107: lload_2        
        //   108: invokedynamic   BootstrapMethod #32, i:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   113: athrow         
        //   114: aload           5
        //   116: aload_0        
        //   117: ldc2_w          -6244197232617168979
        //   120: lload_2        
        //   121: invokedynamic   BootstrapMethod #31, w:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   126: goto            139
        //   129: ldc2_w          -5479439649894047040
        //   132: lload_2        
        //   133: invokedynamic   BootstrapMethod #32, i:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   138: athrow         
        //   139: aload           4
        //   141: ifnonnull       235
        //   144: if_acmpne       210
        //   147: goto            160
        //   150: ldc2_w          -5479439649894047040
        //   153: lload_2        
        //   154: invokedynamic   BootstrapMethod #32, i:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   159: athrow         
        //   160: aload_0        
        //   161: ldc2_w          -5553286243156657678
        //   164: lload_2        
        //   165: invokedynamic   BootstrapMethod #49, w:(Ljava/lang/Object;JJ)Ljavax/swing/JLabel;
        //   170: sipush          2806
        //   173: ldc2_w          3945407986878369254
        //   176: lload_2        
        //   177: lxor           
        //   178: invokedynamic   BootstrapMethod #0, r:(IJ)Ljava/lang/String;
        //   183: ldc2_w          -5829286018401819956
        //   186: lload_2        
        //   187: invokedynamic   BootstrapMethod #36, v:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   192: aload           4
        //   194: ifnull          283
        //   197: goto            210
        //   200: ldc2_w          -5479439649894047040
        //   203: lload_2        
        //   204: invokedynamic   BootstrapMethod #32, i:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   209: athrow         
        //   210: aload           5
        //   212: aload_0        
        //   213: ldc2_w          -6235462852349037442
        //   216: lload_2        
        //   217: invokedynamic   BootstrapMethod #31, w:(Ljava/lang/Object;JJ)Ljavax/swing/JTextField;
        //   222: goto            235
        //   225: ldc2_w          -5479439649894047040
        //   228: lload_2        
        //   229: invokedynamic   BootstrapMethod #32, i:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   234: athrow         
        //   235: if_acmpne       283
        //   238: aload_0        
        //   239: ldc2_w          -5553286243156657678
        //   242: lload_2        
        //   243: invokedynamic   BootstrapMethod #49, w:(Ljava/lang/Object;JJ)Ljavax/swing/JLabel;
        //   248: sipush          5853
        //   251: ldc2_w          6393531929082286544
        //   254: lload_2        
        //   255: lxor           
        //   256: invokedynamic   BootstrapMethod #0, r:(IJ)Ljava/lang/String;
        //   261: ldc2_w          -5829286018401819956
        //   264: lload_2        
        //   265: invokedynamic   BootstrapMethod #36, v:(Ljava/lang/Object;Ljava/lang/Object;JJ)V
        //   270: goto            283
        //   273: ldc2_w          -5479439649894047040
        //   276: lload_2        
        //   277: invokedynamic   BootstrapMethod #32, i:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   282: athrow         
        //   283: return         
        //    StackMapTable: 00 0E FF 00 36 00 05 07 00 22 07 01 7F 04 07 01 C9 07 00 26 00 01 07 00 E5 09 67 07 00 E5 09 4E 07 00 E5 FF 00 09 00 05 07 00 22 07 01 7F 04 07 01 C9 07 00 26 00 02 07 00 26 07 00 33 4A 07 00 E5 09 67 07 00 E5 09 4E 07 00 E5 FF 00 09 00 05 07 00 22 07 01 7F 04 07 01 C9 07 00 26 00 02 07 00 26 07 00 33 65 07 00 E5 09
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
        //  235    270    273    283    Lcom/zelix/n9;
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
    
    void o(final Object[] p0) {
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
        //    11: pop            
        //    12: getstatic       com/zelix/ci.a:J
        //    15: lload_2        
        //    16: lxor           
        //    17: lstore_2       
        //    18: lload_2        
        //    19: dup2           
        //    20: ldc2_w          32053774923168
        //    23: lxor           
        //    24: dup2           
        //    25: bipush          48
        //    27: lushr          
        //    28: l2i            
        //    29: istore          4
        //    31: dup2           
        //    32: bipush          16
        //    34: lshl           
        //    35: bipush          32
        //    37: lushr          
        //    38: l2i            
        //    39: istore          5
        //    41: dup2           
        //    42: bipush          48
        //    44: lshl           
        //    45: bipush          48
        //    47: lushr          
        //    48: l2i            
        //    49: istore          6
        //    51: pop2           
        //    52: dup2           
        //    53: ldc2_w          96417224403219
        //    56: lxor           
        //    57: lstore          7
        //    59: dup2           
        //    60: ldc2_w          72543475041026
        //    63: lxor           
        //    64: lstore          9
        //    66: dup2           
        //    67: ldc2_w          69361111510481
        //    70: lxor           
        //    71: lstore          11
        //    73: dup2           
        //    74: ldc2_w          34791136713365
        //    77: lxor           
        //    78: lstore          13
        //    80: dup2           
        //    81: ldc2_w          117675203472598
        //    84: lxor           
        //    85: lstore          15
        //    87: dup2           
        //    88: ldc2_w          81947848512084
        //    91: lxor           
        //    92: lstore          17
        //    94: dup2           
        //    95: ldc2_w          111606776566859
        //    98: lxor           
        //    99: lstore          19
        //   101: dup2           
        //   102: ldc2_w          9418338101270
        //   105: lxor           
        //   106: dup2           
        //   107: bipush          32
        //   109: lushr          
        //   110: l2i            
        //   111: istore          21
        //   113: dup2           
        //   114: bipush          32
        //   116: lshl           
        //   117: bipush          48
        //   119: lushr          
        //   120: l2i            
        //   121: istore          22
        //   123: dup2           
        //   124: bipush          48
        //   126: lshl           
        //   127: bipush          48
        //   129: lushr          
        //   130: l2i            
        //   131: istore          23
        //   133: pop2           
        //   134: dup2           
        //   135: ldc2_w          94006640737670
        //   138: lxor           
        //   139: lstore          24
        //   141: dup2           
        //   142: ldc2_w          51688415497897
        //   145: lxor           
        //   146: lstore          26
        //   148: dup2           
        //   149: ldc2_w          131023228428797
        //   152: lxor           
        //   153: lstore          28
        //   155: pop2           
        //   156: ldc2_w          -5552551832526273535
        //   159: lload_2        
        //   160: invokedynamic   BootstrapMethod #50, l:(JJ)[Lcom/zelix/_0;
        //   165: aload_0        
        //   166: ldc2_w          -5229925617094819024
        //   169: lload_2        
        //   170: invokedynamic   BootstrapMethod #51, r:(Ljava/lang/Object;JJ)Lcom/zelix/sn;
        //   175: lload           13
        //   177: iconst_1       
        //   178: anewarray       Ljava/lang/Object;
        //   181: dup_x2         
        //   182: dup_x2         
        //   183: pop            
        //   184: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   187: iconst_0       
        //   188: swap           
        //   189: aastore        
        //   190: ldc2_w          -5428072370919438756
        //   193: lload_2        
        //   194: invokedynamic   BootstrapMethod #52, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/uf;
        //   199: astore          31
        //   201: astore          30
        //   203: aload           31
        //   205: aload           30
        //   207: ifnonnull       228
        //   210: ifnull          1412
        //   213: goto            226
        //   216: ldc2_w          -5458267840914397835
        //   219: lload_2        
        //   220: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   225: athrow         
        //   226: aload           31
        //   228: lload           19
        //   230: iconst_1       
        //   231: anewarray       Ljava/lang/Object;
        //   234: dup_x2         
        //   235: dup_x2         
        //   236: pop            
        //   237: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   240: iconst_0       
        //   241: swap           
        //   242: aastore        
        //   243: ldc2_w          -6287325669824447106
        //   246: lload_2        
        //   247: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   252: aload           30
        //   254: lload_2        
        //   255: lconst_0       
        //   256: lcmp           
        //   257: iflt            364
        //   260: ifnonnull       362
        //   263: ifeq            323
        //   266: goto            279
        //   269: ldc2_w          -5458267840914397835
        //   272: lload_2        
        //   273: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   278: athrow         
        //   279: aload_0        
        //   280: ldc2_w          -6073768775389736304
        //   283: lload_2        
        //   284: invokedynamic   BootstrapMethod #55, r:(Ljava/lang/Object;JJ)Ljavax/swing/JComboBox;
        //   289: iconst_1       
        //   290: ldc2_w          -5376166724747608129
        //   293: lload_2        
        //   294: invokedynamic   BootstrapMethod #56, s:(Ljava/lang/Object;IJJ)V
        //   299: lload_2        
        //   300: lconst_0       
        //   301: lcmp           
        //   302: iflt            651
        //   305: aload           30
        //   307: ifnull          651
        //   310: goto            323
        //   313: ldc2_w          -5458267840914397835
        //   316: lload_2        
        //   317: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   322: athrow         
        //   323: aload           31
        //   325: lload           15
        //   327: iconst_1       
        //   328: anewarray       Ljava/lang/Object;
        //   331: dup_x2         
        //   332: dup_x2         
        //   333: pop            
        //   334: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   337: iconst_0       
        //   338: swap           
        //   339: aastore        
        //   340: ldc2_w          -5446352798651623551
        //   343: lload_2        
        //   344: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   349: goto            362
        //   352: ldc2_w          -5458267840914397835
        //   355: lload_2        
        //   356: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   361: athrow         
        //   362: aload           30
        //   364: lload_2        
        //   365: lconst_0       
        //   366: lcmp           
        //   367: iflt            480
        //   370: ifnonnull       472
        //   373: ifeq            433
        //   376: goto            389
        //   379: ldc2_w          -5458267840914397835
        //   382: lload_2        
        //   383: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   388: athrow         
        //   389: aload_0        
        //   390: ldc2_w          -6073768775389736304
        //   393: lload_2        
        //   394: invokedynamic   BootstrapMethod #55, r:(Ljava/lang/Object;JJ)Ljavax/swing/JComboBox;
        //   399: iconst_2       
        //   400: ldc2_w          -5376166724747608129
        //   403: lload_2        
        //   404: invokedynamic   BootstrapMethod #56, s:(Ljava/lang/Object;IJJ)V
        //   409: lload_2        
        //   410: lconst_0       
        //   411: lcmp           
        //   412: ifle            651
        //   415: aload           30
        //   417: ifnull          651
        //   420: goto            433
        //   423: ldc2_w          -5458267840914397835
        //   426: lload_2        
        //   427: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   432: athrow         
        //   433: aload           31
        //   435: lload           9
        //   437: iconst_1       
        //   438: anewarray       Ljava/lang/Object;
        //   441: dup_x2         
        //   442: dup_x2         
        //   443: pop            
        //   444: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   447: iconst_0       
        //   448: swap           
        //   449: aastore        
        //   450: ldc2_w          -5290817323480289061
        //   453: lload_2        
        //   454: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   459: goto            472
        //   462: ldc2_w          -5458267840914397835
        //   465: lload_2        
        //   466: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   471: athrow         
        //   472: lload_2        
        //   473: lconst_0       
        //   474: lcmp           
        //   475: ifle            571
        //   478: aload           30
        //   480: ifnonnull       571
        //   483: ifeq            543
        //   486: goto            499
        //   489: ldc2_w          -5458267840914397835
        //   492: lload_2        
        //   493: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   498: athrow         
        //   499: aload_0        
        //   500: ldc2_w          -6073768775389736304
        //   503: lload_2        
        //   504: invokedynamic   BootstrapMethod #55, r:(Ljava/lang/Object;JJ)Ljavax/swing/JComboBox;
        //   509: iconst_3       
        //   510: ldc2_w          -5376166724747608129
        //   513: lload_2        
        //   514: invokedynamic   BootstrapMethod #56, s:(Ljava/lang/Object;IJJ)V
        //   519: lload_2        
        //   520: lconst_0       
        //   521: lcmp           
        //   522: iflt            651
        //   525: aload           30
        //   527: ifnull          651
        //   530: goto            543
        //   533: ldc2_w          -5458267840914397835
        //   536: lload_2        
        //   537: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   542: athrow         
        //   543: aload           31
        //   545: iconst_0       
        //   546: anewarray       Ljava/lang/Object;
        //   549: ldc2_w          -5848344165608004317
        //   552: lload_2        
        //   553: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   558: goto            571
        //   561: ldc2_w          -5458267840914397835
        //   564: lload_2        
        //   565: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   570: athrow         
        //   571: ifeq            618
        //   574: aload_0        
        //   575: ldc2_w          -6073768775389736304
        //   578: lload_2        
        //   579: invokedynamic   BootstrapMethod #55, r:(Ljava/lang/Object;JJ)Ljavax/swing/JComboBox;
        //   584: iconst_4       
        //   585: ldc2_w          -5376166724747608129
        //   588: lload_2        
        //   589: invokedynamic   BootstrapMethod #56, s:(Ljava/lang/Object;IJJ)V
        //   594: lload_2        
        //   595: lconst_0       
        //   596: lcmp           
        //   597: iflt            651
        //   600: aload           30
        //   602: ifnull          651
        //   605: goto            618
        //   608: ldc2_w          -5458267840914397835
        //   611: lload_2        
        //   612: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   617: athrow         
        //   618: aload_0        
        //   619: ldc2_w          -6073768775389736304
        //   622: lload_2        
        //   623: invokedynamic   BootstrapMethod #55, r:(Ljava/lang/Object;JJ)Ljavax/swing/JComboBox;
        //   628: iconst_0       
        //   629: ldc2_w          -5376166724747608129
        //   632: lload_2        
        //   633: invokedynamic   BootstrapMethod #56, s:(Ljava/lang/Object;IJJ)V
        //   638: goto            651
        //   641: ldc2_w          -5458267840914397835
        //   644: lload_2        
        //   645: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   650: athrow         
        //   651: aload           31
        //   653: lload           24
        //   655: iconst_1       
        //   656: anewarray       Ljava/lang/Object;
        //   659: dup_x2         
        //   660: dup_x2         
        //   661: pop            
        //   662: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   665: iconst_0       
        //   666: swap           
        //   667: aastore        
        //   668: ldc2_w          -6242850001595877398
        //   671: lload_2        
        //   672: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   677: aload           30
        //   679: lload_2        
        //   680: lconst_0       
        //   681: lcmp           
        //   682: iflt            766
        //   685: ifnonnull       764
        //   688: ifeq            738
        //   691: goto            704
        //   694: ldc2_w          -5458267840914397835
        //   697: lload_2        
        //   698: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   703: athrow         
        //   704: aload_0        
        //   705: ldc2_w          -6145960639121572943
        //   708: lload_2        
        //   709: invokedynamic   BootstrapMethod #57, r:(Ljava/lang/Object;JJ)Lcom/zelix/o4;
        //   714: iconst_0       
        //   715: iconst_0       
        //   716: ldc2_w          -5189626537405271914
        //   719: lload_2        
        //   720: invokedynamic   BootstrapMethod #58, s:(Ljava/lang/Object;IIJJ)V
        //   725: goto            738
        //   728: ldc2_w          -5458267840914397835
        //   731: lload_2        
        //   732: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   737: athrow         
        //   738: aload           31
        //   740: lload           26
        //   742: iconst_1       
        //   743: anewarray       Ljava/lang/Object;
        //   746: dup_x2         
        //   747: dup_x2         
        //   748: pop            
        //   749: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   752: iconst_0       
        //   753: swap           
        //   754: aastore        
        //   755: ldc2_w          -5891061036527635461
        //   758: lload_2        
        //   759: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   764: aload           30
        //   766: lload_2        
        //   767: lconst_0       
        //   768: lcmp           
        //   769: iflt            853
        //   772: ifnonnull       851
        //   775: ifeq            825
        //   778: goto            791
        //   781: ldc2_w          -5458267840914397835
        //   784: lload_2        
        //   785: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   790: athrow         
        //   791: aload_0        
        //   792: ldc2_w          -6145960639121572943
        //   795: lload_2        
        //   796: invokedynamic   BootstrapMethod #57, r:(Ljava/lang/Object;JJ)Lcom/zelix/o4;
        //   801: iconst_1       
        //   802: iconst_1       
        //   803: ldc2_w          -5189626537405271914
        //   806: lload_2        
        //   807: invokedynamic   BootstrapMethod #58, s:(Ljava/lang/Object;IIJJ)V
        //   812: goto            825
        //   815: ldc2_w          -5458267840914397835
        //   818: lload_2        
        //   819: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   824: athrow         
        //   825: aload           31
        //   827: lload           17
        //   829: iconst_1       
        //   830: anewarray       Ljava/lang/Object;
        //   833: dup_x2         
        //   834: dup_x2         
        //   835: pop            
        //   836: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   839: iconst_0       
        //   840: swap           
        //   841: aastore        
        //   842: ldc2_w          -5810448043410249137
        //   845: lload_2        
        //   846: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   851: aload           30
        //   853: lload_2        
        //   854: lconst_0       
        //   855: lcmp           
        //   856: iflt            940
        //   859: ifnonnull       938
        //   862: ifeq            912
        //   865: goto            878
        //   868: ldc2_w          -5458267840914397835
        //   871: lload_2        
        //   872: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   877: athrow         
        //   878: aload_0        
        //   879: ldc2_w          -6145960639121572943
        //   882: lload_2        
        //   883: invokedynamic   BootstrapMethod #57, r:(Ljava/lang/Object;JJ)Lcom/zelix/o4;
        //   888: iconst_2       
        //   889: iconst_2       
        //   890: ldc2_w          -5189626537405271914
        //   893: lload_2        
        //   894: invokedynamic   BootstrapMethod #58, s:(Ljava/lang/Object;IIJJ)V
        //   899: goto            912
        //   902: ldc2_w          -5458267840914397835
        //   905: lload_2        
        //   906: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   911: athrow         
        //   912: aload           31
        //   914: lload           28
        //   916: iconst_1       
        //   917: anewarray       Ljava/lang/Object;
        //   920: dup_x2         
        //   921: dup_x2         
        //   922: pop            
        //   923: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   926: iconst_0       
        //   927: swap           
        //   928: aastore        
        //   929: ldc2_w          -5345858434444222302
        //   932: lload_2        
        //   933: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //   938: aload           30
        //   940: lload_2        
        //   941: lconst_0       
        //   942: lcmp           
        //   943: ifle            1027
        //   946: ifnonnull       1025
        //   949: ifeq            999
        //   952: goto            965
        //   955: ldc2_w          -5458267840914397835
        //   958: lload_2        
        //   959: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   964: athrow         
        //   965: aload_0        
        //   966: ldc2_w          -6145960639121572943
        //   969: lload_2        
        //   970: invokedynamic   BootstrapMethod #57, r:(Ljava/lang/Object;JJ)Lcom/zelix/o4;
        //   975: iconst_3       
        //   976: iconst_3       
        //   977: ldc2_w          -5189626537405271914
        //   980: lload_2        
        //   981: invokedynamic   BootstrapMethod #58, s:(Ljava/lang/Object;IIJJ)V
        //   986: goto            999
        //   989: ldc2_w          -5458267840914397835
        //   992: lload_2        
        //   993: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //   998: athrow         
        //   999: aload           31
        //  1001: lload           7
        //  1003: iconst_1       
        //  1004: anewarray       Ljava/lang/Object;
        //  1007: dup_x2         
        //  1008: dup_x2         
        //  1009: pop            
        //  1010: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1013: iconst_0       
        //  1014: swap           
        //  1015: aastore        
        //  1016: ldc2_w          -5468378443484488680
        //  1019: lload_2        
        //  1020: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //  1025: aload           30
        //  1027: lload_2        
        //  1028: lconst_0       
        //  1029: lcmp           
        //  1030: iflt            1135
        //  1033: ifnonnull       1133
        //  1036: ifeq            1086
        //  1039: goto            1052
        //  1042: ldc2_w          -5458267840914397835
        //  1045: lload_2        
        //  1046: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1051: athrow         
        //  1052: aload_0        
        //  1053: ldc2_w          -6145960639121572943
        //  1056: lload_2        
        //  1057: invokedynamic   BootstrapMethod #57, r:(Ljava/lang/Object;JJ)Lcom/zelix/o4;
        //  1062: iconst_4       
        //  1063: iconst_4       
        //  1064: ldc2_w          -5189626537405271914
        //  1067: lload_2        
        //  1068: invokedynamic   BootstrapMethod #58, s:(Ljava/lang/Object;IIJJ)V
        //  1073: goto            1086
        //  1076: ldc2_w          -5458267840914397835
        //  1079: lload_2        
        //  1080: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1085: athrow         
        //  1086: aload           31
        //  1088: iload           4
        //  1090: i2c            
        //  1091: iload           5
        //  1093: iload           6
        //  1095: i2c            
        //  1096: iconst_3       
        //  1097: anewarray       Ljava/lang/Object;
        //  1100: dup_x1         
        //  1101: swap           
        //  1102: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1105: iconst_2       
        //  1106: swap           
        //  1107: aastore        
        //  1108: dup_x1         
        //  1109: swap           
        //  1110: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1113: iconst_1       
        //  1114: swap           
        //  1115: aastore        
        //  1116: dup_x1         
        //  1117: swap           
        //  1118: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1121: iconst_0       
        //  1122: swap           
        //  1123: aastore        
        //  1124: ldc2_w          -5905876706203223146
        //  1127: lload_2        
        //  1128: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //  1133: aload           30
        //  1135: lload_2        
        //  1136: lconst_0       
        //  1137: lcmp           
        //  1138: ifle            1248
        //  1141: ifnonnull       1240
        //  1144: ifeq            1194
        //  1147: goto            1160
        //  1150: ldc2_w          -5458267840914397835
        //  1153: lload_2        
        //  1154: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1159: athrow         
        //  1160: aload_0        
        //  1161: ldc2_w          -6145960639121572943
        //  1164: lload_2        
        //  1165: invokedynamic   BootstrapMethod #57, r:(Ljava/lang/Object;JJ)Lcom/zelix/o4;
        //  1170: iconst_5       
        //  1171: iconst_5       
        //  1172: ldc2_w          -5189626537405271914
        //  1175: lload_2        
        //  1176: invokedynamic   BootstrapMethod #58, s:(Ljava/lang/Object;IIJJ)V
        //  1181: goto            1194
        //  1184: ldc2_w          -5458267840914397835
        //  1187: lload_2        
        //  1188: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1193: athrow         
        //  1194: aload           31
        //  1196: iload           21
        //  1198: iload           22
        //  1200: i2s            
        //  1201: iload           23
        //  1203: iconst_3       
        //  1204: anewarray       Ljava/lang/Object;
        //  1207: dup_x1         
        //  1208: swap           
        //  1209: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1212: iconst_2       
        //  1213: swap           
        //  1214: aastore        
        //  1215: dup_x1         
        //  1216: swap           
        //  1217: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1220: iconst_1       
        //  1221: swap           
        //  1222: aastore        
        //  1223: dup_x1         
        //  1224: swap           
        //  1225: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1228: iconst_0       
        //  1229: swap           
        //  1230: aastore        
        //  1231: ldc2_w          -5292542424060034345
        //  1234: lload_2        
        //  1235: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //  1240: lload_2        
        //  1241: lconst_0       
        //  1242: lcmp           
        //  1243: ifle            1351
        //  1246: aload           30
        //  1248: ifnonnull       1351
        //  1251: ifeq            1325
        //  1254: goto            1267
        //  1257: ldc2_w          -5458267840914397835
        //  1260: lload_2        
        //  1261: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1266: athrow         
        //  1267: aload_0        
        //  1268: ldc2_w          -6145960639121572943
        //  1271: lload_2        
        //  1272: invokedynamic   BootstrapMethod #57, r:(Ljava/lang/Object;JJ)Lcom/zelix/o4;
        //  1277: sipush          1266
        //  1280: ldc2_w          8655724286304091511
        //  1283: lload_2        
        //  1284: lxor           
        //  1285: invokedynamic   BootstrapMethod #1, a:(IJ)I
        //  1290: sipush          8935
        //  1293: ldc2_w          7255554696411306862
        //  1296: lload_2        
        //  1297: lxor           
        //  1298: invokedynamic   BootstrapMethod #1, a:(IJ)I
        //  1303: ldc2_w          -5189626537405271914
        //  1306: lload_2        
        //  1307: invokedynamic   BootstrapMethod #58, s:(Ljava/lang/Object;IIJJ)V
        //  1312: goto            1325
        //  1315: ldc2_w          -5458267840914397835
        //  1318: lload_2        
        //  1319: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1324: athrow         
        //  1325: aload           31
        //  1327: lload           11
        //  1329: iconst_1       
        //  1330: anewarray       Ljava/lang/Object;
        //  1333: dup_x2         
        //  1334: dup_x2         
        //  1335: pop            
        //  1336: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1339: iconst_0       
        //  1340: swap           
        //  1341: aastore        
        //  1342: ldc2_w          -5851970485089156921
        //  1345: lload_2        
        //  1346: invokedynamic   BootstrapMethod #54, s:(Ljava/lang/Object;Ljava/lang/Object;JJ)Z
        //  1351: ifeq            1412
        //  1354: aload_0        
        //  1355: ldc2_w          -6145960639121572943
        //  1358: lload_2        
        //  1359: invokedynamic   BootstrapMethod #57, r:(Ljava/lang/Object;JJ)Lcom/zelix/o4;
        //  1364: sipush          24322
        //  1367: ldc2_w          3798560323831932552
        //  1370: lload_2        
        //  1371: lxor           
        //  1372: invokedynamic   BootstrapMethod #1, a:(IJ)I
        //  1377: sipush          14333
        //  1380: ldc2_w          2016686710802927215
        //  1383: lload_2        
        //  1384: lxor           
        //  1385: invokedynamic   BootstrapMethod #1, a:(IJ)I
        //  1390: ldc2_w          -5189626537405271914
        //  1393: lload_2        
        //  1394: invokedynamic   BootstrapMethod #58, s:(Ljava/lang/Object;IIJJ)V
        //  1399: goto            1412
        //  1402: ldc2_w          -5458267840914397835
        //  1405: lload_2        
        //  1406: invokedynamic   BootstrapMethod #53, l:(Ljava/lang/Object;JJ)Lcom/zelix/n9;
        //  1411: athrow         
        //  1412: return         
        //    StackMapTable: 00 46 FF 00 D8 00 15 07 00 22 07 00 0C 04 01 01 01 04 04 04 04 04 04 04 01 01 01 04 04 04 07 01 C9 07 02 12 00 01 07 00 E5 09 41 07 02 12 68 07 00 E5 09 61 07 00 E5 09 5C 07 00 E5 49 01 FF 00 01 00 15 07 00 22 07 00 0C 04 01 01 01 04 04 04 04 04 04 04 01 01 01 04 04 04 07 01 C9 07 02 12 00 02 01 07 01 C9 4E 07 00 E5 09 61 07 00 E5 09 5C 07 00 E5 49 01 FF 00 07 00 15 07 00 22 07 00 0C 04 01 01 01 04 04 04 04 04 04 04 01 01 01 04 04 04 07 01 C9 07 02 12 00 02 01 07 01 C9 48 07 00 E5 09 61 07 00 E5 09 51 07 00 E5 49 01 64 07 00 E5 09 56 07 00 E5 09 6A 07 00 E5 09 57 07 00 E5 09 59 01 FF 00 01 00 15 07 00 22 07 00 0C 04 01 01 01 04 04 04 04 04 04 04 01 01 01 04 04 04 07 01 C9 07 02 12 00 02 01 07 01 C9 4E 07 00 E5 09 57 07 00 E5 09 59 01 FF 00 01 00 15 07 00 22 07 00 0C 04 01 01 01 04 04 04 04 04 04 04 01 01 01 04 04 04 07 01 C9 07 02 12 00 02 01 07 01 C9 4E 07 00 E5 09 57 07 00 E5 09 59 01 FF 00 01 00 15 07 00 22 07 00 0C 04 01 01 01 04 04 04 04 04 04 04 01 01 01 04 04 04 07 01 C9 07 02 12 00 02 01 07 01 C9 4E 07 00 E5 09 57 07 00 E5 09 59 01 FF 00 01 00 15 07 00 22 07 00 0C 04 01 01 01 04 04 04 04 04 04 04 01 01 01 04 04 04 07 01 C9 07 02 12 00 02 01 07 01 C9 4E 07 00 E5 09 57 07 00 E5 09 6E 01 FF 00 01 00 15 07 00 22 07 00 0C 04 01 01 01 04 04 04 04 04 04 04 01 01 01 04 04 04 07 01 C9 07 02 12 00 02 01 07 01 C9 4E 07 00 E5 09 57 07 00 E5 09 6D 01 FF 00 07 00 15 07 00 22 07 00 0C 04 01 01 01 04 04 04 04 04 04 04 01 01 01 04 04 04 07 01 C9 07 02 12 00 02 01 07 01 C9 48 07 00 E5 09 6F 07 00 E5 09 59 01 72 07 00 E5 09
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type          
        //  -----  -----  -----  -----  --------------
        //  203    213    216    226    Lcom/zelix/n9;
        //  228    266    269    279    Lcom/zelix/n9;
        //  263    310    313    323    Lcom/zelix/n9;
        //  279    349    352    362    Lcom/zelix/n9;
        //  362    376    379    389    Lcom/zelix/n9;
        //  373    420    423    433    Lcom/zelix/n9;
        //  389    459    462    472    Lcom/zelix/n9;
        //  472    486    489    499    Lcom/zelix/n9;
        //  483    530    533    543    Lcom/zelix/n9;
        //  499    558    561    571    Lcom/zelix/n9;
        //  571    605    608    618    Lcom/zelix/n9;
        //  574    638    641    651    Lcom/zelix/n9;
        //  651    691    694    704    Lcom/zelix/n9;
        //  688    725    728    738    Lcom/zelix/n9;
        //  764    778    781    791    Lcom/zelix/n9;
        //  775    812    815    825    Lcom/zelix/n9;
        //  851    865    868    878    Lcom/zelix/n9;
        //  862    899    902    912    Lcom/zelix/n9;
        //  938    952    955    965    Lcom/zelix/n9;
        //  949    986    989    999    Lcom/zelix/n9;
        //  1025   1039   1042   1052   Lcom/zelix/n9;
        //  1036   1073   1076   1086   Lcom/zelix/n9;
        //  1133   1147   1150   1160   Lcom/zelix/n9;
        //  1144   1181   1184   1194   Lcom/zelix/n9;
        //  1240   1254   1257   1267   Lcom/zelix/n9;
        //  1251   1312   1315   1325   Lcom/zelix/n9;
        //  1351   1399   1402   1412   Lcom/zelix/n9;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0279:
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
        final int n3 = n ^ (int)(n2 & 0x7FFFL) ^ 0x7BFB;
        if (ci.f[n3] == null) {
            Object[] array;
            try {
                final Long value = Thread.currentThread().getId();
                array = ci.g.get(value);
                if (array == null) {
                    array = new Object[] { Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8]) };
                    ci.g.put(value, array);
                }
            }
            catch (final Exception cause) {
                throw new RuntimeException("com/zelix/ci", cause);
            }
            final byte[] key = new byte[8];
            key[0] = (byte)(n2 >>> 56);
            for (int i = 1; i < 8; ++i) {
                key[i] = (byte)(n2 << i * 8 >>> 56);
            }
            ((Cipher)array[0]).init(2, ((SecretKeyFactory)array[1]).generateSecret(new DESKeySpec(key)), (AlgorithmParameterSpec)array[2]);
            ci.f[n3] = a(((Cipher)array[0]).doFinal(ci.d[n3].getBytes("ISO-8859-1")));
        }
        return ci.f[n3];
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
            throw new RuntimeException("com/zelix/ci" + " : " + str + " : " + methodType.toString(), cause);
        }
        return mutableCallSite;
    }
    
    private static int b(final int n, final long n2) {
        final int n3 = n ^ (int)(n2 & 0x7FFFL) ^ 0x42FF;
        if (ci.k[n3] == null) {
            final byte[] key = { (byte)(n2 >>> 56), (byte)(n2 >>> 48), (byte)(n2 >>> 40), (byte)(n2 >>> 32), (byte)(n2 >>> 24), (byte)(n2 >>> 16), (byte)(n2 >>> 8), (byte)n2 };
            final long n4 = ci.i[n3];
            final byte[] input = { (byte)(n4 >>> 56), (byte)(n4 >>> 48), (byte)(n4 >>> 40), (byte)(n4 >>> 32), (byte)(n4 >>> 24), (byte)(n4 >>> 16), (byte)(n4 >>> 8), (byte)n4 };
            final Long value = Thread.currentThread().getId();
            Object[] array = ci.m.get(value);
            byte[] doFinal;
            try {
                if (array == null) {
                    array = new Object[] { Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8]) };
                    ci.m.put(value, array);
                }
                final SecretKey generateSecret = ((SecretKeyFactory)array[1]).generateSecret(new DESKeySpec(key));
                final Cipher cipher = (Cipher)array[0];
                cipher.init(2, generateSecret, (AlgorithmParameterSpec)array[2]);
                doFinal = cipher.doFinal(input);
            }
            catch (final Exception cause) {
                throw new RuntimeException("com/zelix/ci", cause);
            }
            ci.k[n3] = ((doFinal[4] & 0xFF) << 24 | (doFinal[5] & 0xFF) << 16 | (doFinal[6] & 0xFF) << 8 | (doFinal[7] & 0xFF));
        }
        return ci.k[n3];
    }
    
    private static int b(final MethodHandles.Lookup lookup, final MutableCallSite mutableCallSite, final String s, final Object[] array) {
        final int b = b((int)array[0], (long)array[1]);
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, b), 0, Integer.TYPE, Long.TYPE));
        return b;
    }
    
    private static CallSite b(final MethodHandles.Lookup lookup, final String str, final MethodType methodType) {
        final MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(/* ldc_method_handle(!) */ProcyonConstantHelper_2.HANDLE.asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, str), methodType));
        }
        catch (final Exception cause) {
            throw new RuntimeException("com/zelix/ci" + " : " + str + " : " + methodType.toString(), cause);
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
                handle = ci.__PROCYON__LOOKUP_1__.findStatic(ci.class, "a", type);
            }
            catch (final ReflectiveOperationException e) {
                handle = MethodHandles.permuteArguments(MethodHandles.insertArguments(MethodHandles.throwException(type.returnType(), e.getClass()), 0, e), type);
            }
            ProcyonConstantHelper_1.HANDLE = handle;
        }
    }
    
    private static final MethodHandles.Lookup __PROCYON__LOOKUP_2__ = MethodHandles.lookup();
    
    // This helper class was generated by Procyon to approximate the behavior of a
    // MethodHandle constant that cannot (currently) be represented in Java code.
    private static final class ProcyonConstantHelper_2
    {
        static final MethodHandle HANDLE;
        
        static {
            MethodHandle handle;
            final MethodType type = MethodType.methodType(int.class, MethodHandles.Lookup.class, MutableCallSite.class, String.class, Object[].class);
            try {
                handle = ci.__PROCYON__LOOKUP_2__.findStatic(ci.class, "b", type);
            }
            catch (final ReflectiveOperationException e) {
                handle = MethodHandles.permuteArguments(MethodHandles.insertArguments(MethodHandles.throwException(type.returnType(), e.getClass()), 0, e), type);
            }
            ProcyonConstantHelper_2.HANDLE = handle;
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
                    handle = ((CallSite)m44.a(lookup, "r", MethodType.methodType(Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static Object invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_3.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)m44.a(lookup, "r", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_4.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_5.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, DefaultComboBoxModel.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, DefaultComboBoxModel p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_6.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultComboBoxModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultComboBoxModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_7.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, JComboBox.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, JComboBox p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_8.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, DefaultListModel.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, DefaultListModel p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_9.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultListModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultListModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_10.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, o4.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, o4 p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_11.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(o4.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static o4 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_12.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, int.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, int p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_13.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, JTextField.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, JTextField p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_15.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, JTextField.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, JTextField p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_17.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, JTextField.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, JTextField p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_19.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(void.class, Object.class, JLabel.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, JLabel p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_20.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JComboBox.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static JComboBox invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_21.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_23.handle().invokeExact(p0, p1, p2, p3, p4);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(o4.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static o4 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_24.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_26.handle().invokeExact(p0, p1, p2, p3, p4);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_27.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_29.handle().invokeExact(p0, p1, p2, p3, p4);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_30.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_32.handle().invokeExact(p0, p1, p2, p3, p4);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static JTextField invoke(Object p0, long p1, long p2) {
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_34.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_35.handle().invokeExact(p0, p1, p2, p3, p4);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JLabel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static JLabel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_36.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_37.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_38.handle().invokeExact(p0, p1, p2, p3, p4);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_39.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_40.handle().invokeExact(p0, p1, p2, p3, p4);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_41.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_42.handle().invokeExact(p0, p1, p2, p3, p4);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_43.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, Object p2, long p3, long p4) {
            try {
                return ProcyonInvokeDynamicHelper_44.handle().invokeExact(p0, p1, p2, p3, p4);
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
                    handle = ((CallSite)m44.a(lookup, "o", MethodType.methodType(String[].class, long.class, long.class))).dynamicInvoker();
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
        
        private static String[] invoke(long p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_45.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_46.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultComboBoxModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultComboBoxModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_47.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_48.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_49.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultComboBoxModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultComboBoxModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_50.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_51.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_52.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultComboBoxModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultComboBoxModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_53.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_54.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_55.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultComboBoxModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultComboBoxModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_56.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_57.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_58.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultComboBoxModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultComboBoxModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_59.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_60.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_61.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultListModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultListModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_62.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_64.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultListModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultListModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_65.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_66.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_67.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultListModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultListModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_68.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_69.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_70.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultListModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultListModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_71.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultListModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultListModel invoke(Object p0, long p1, long p2) {
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_75.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultListModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultListModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_77.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_78.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_79.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultListModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultListModel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_80.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_81.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_82.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(DefaultListModel.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static DefaultListModel invoke(Object p0, long p1, long p2) {
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
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_84.handle().invokeExact(p0, p1);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_86.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static JTextField invoke(Object p0, long p1, long p2) {
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static sn invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_88.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(String.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(Object p0, Object p1, long p2, long p3) {
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_90.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_91.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static sn invoke(Object p0, long p1, long p2) {
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(String.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(Object p0, Object p1, long p2, long p3) {
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_94.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_95.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static sn invoke(Object p0, long p1, long p2) {
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(String.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static String invoke(Object p0, Object p1, long p2, long p3) {
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_98.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JComboBox.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static JComboBox invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_99.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_100.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(o4.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static o4 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_101.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_102.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_103.handle().invokeExact(p0, p1, p2);
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
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_104.handle().invokeExact(p0, p1, p2, p3);
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
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
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
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_105.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_106
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_106.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_106.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_106.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_106.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_106.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_106.fence = 1;
                ProcyonInvokeDynamicHelper_106.handle = handle;
                ProcyonInvokeDynamicHelper_106.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_106.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_107
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_107.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_107.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_107.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_107.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_107.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_107.fence = 1;
                ProcyonInvokeDynamicHelper_107.handle = handle;
                ProcyonInvokeDynamicHelper_107.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_107.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_108
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_108.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_108.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_108.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_108.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_108.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_108.fence = 1;
                ProcyonInvokeDynamicHelper_108.handle = handle;
                ProcyonInvokeDynamicHelper_108.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_108.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_109
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_109.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_109.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_109.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_109.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_109.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_109.fence = 1;
                ProcyonInvokeDynamicHelper_109.handle = handle;
                ProcyonInvokeDynamicHelper_109.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_109.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_110
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_110.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_110.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_110.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_110.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_110.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_110.fence = 1;
                ProcyonInvokeDynamicHelper_110.handle = handle;
                ProcyonInvokeDynamicHelper_110.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_110.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_111
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_111.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_111.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_111.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_111.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_111.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_111.fence = 1;
                ProcyonInvokeDynamicHelper_111.handle = handle;
                ProcyonInvokeDynamicHelper_111.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_111.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_112
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_112.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_112.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_112.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_112.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_112.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_112.fence = 1;
                ProcyonInvokeDynamicHelper_112.handle = handle;
                ProcyonInvokeDynamicHelper_112.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_112.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_113
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_113.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_113.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_113.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_113.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_113.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_113.fence = 1;
                ProcyonInvokeDynamicHelper_113.handle = handle;
                ProcyonInvokeDynamicHelper_113.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_113.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_114
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_114.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_114.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_114.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_114.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_114.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "t", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_114.fence = 1;
                ProcyonInvokeDynamicHelper_114.handle = handle;
                ProcyonInvokeDynamicHelper_114.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_114.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_115
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_115.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_115.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_115.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_115.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_115.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(_0[].class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_115.fence = 1;
                ProcyonInvokeDynamicHelper_115.handle = handle;
                ProcyonInvokeDynamicHelper_115.fence = 0;
            }
            return handle;
        }
        
        private static _0[] invoke(long p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_115.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_116
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_116.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_116.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_116.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_116.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_116.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_116.fence = 1;
                ProcyonInvokeDynamicHelper_116.handle = handle;
                ProcyonInvokeDynamicHelper_116.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_116.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_117
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_117.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_117.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_117.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_117.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_117.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(n9.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_117.fence = 1;
                ProcyonInvokeDynamicHelper_117.handle = handle;
                ProcyonInvokeDynamicHelper_117.fence = 0;
            }
            return handle;
        }
        
        private static n9 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_117.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_118
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_118.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_118.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_118.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_118.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_118.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_118.fence = 1;
                ProcyonInvokeDynamicHelper_118.handle = handle;
                ProcyonInvokeDynamicHelper_118.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_118.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_119
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_119.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_119.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_119.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_119.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_119.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_119.fence = 1;
                ProcyonInvokeDynamicHelper_119.handle = handle;
                ProcyonInvokeDynamicHelper_119.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_119.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_120
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_120.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_120.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_120.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_120.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_120.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(n9.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_120.fence = 1;
                ProcyonInvokeDynamicHelper_120.handle = handle;
                ProcyonInvokeDynamicHelper_120.fence = 0;
            }
            return handle;
        }
        
        private static n9 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_120.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_121
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_121.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_121.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_121.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_121.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_121.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_121.fence = 1;
                ProcyonInvokeDynamicHelper_121.handle = handle;
                ProcyonInvokeDynamicHelper_121.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_121.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_122
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_122.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_122.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_122.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_122.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_122.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_122.fence = 1;
                ProcyonInvokeDynamicHelper_122.handle = handle;
                ProcyonInvokeDynamicHelper_122.fence = 0;
            }
            return handle;
        }
        
        private static sn invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_122.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_123
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_123.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_123.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_123.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_123.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_123.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(String.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_123.fence = 1;
                ProcyonInvokeDynamicHelper_123.handle = handle;
                ProcyonInvokeDynamicHelper_123.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_123.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_124
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_124.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_124.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_124.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_124.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_124.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_124.fence = 1;
                ProcyonInvokeDynamicHelper_124.handle = handle;
                ProcyonInvokeDynamicHelper_124.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_124.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_125
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_125.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_125.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_125.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_125.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_125.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(JFrame.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_125.fence = 1;
                ProcyonInvokeDynamicHelper_125.handle = handle;
                ProcyonInvokeDynamicHelper_125.fence = 0;
            }
            return handle;
        }
        
        private static JFrame invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_125.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_126
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_126.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_126.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_126.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_126.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_126.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_126.fence = 1;
                ProcyonInvokeDynamicHelper_126.handle = handle;
                ProcyonInvokeDynamicHelper_126.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_126.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_127
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_127.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_127.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_127.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_127.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_127.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_127.fence = 1;
                ProcyonInvokeDynamicHelper_127.handle = handle;
                ProcyonInvokeDynamicHelper_127.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_127.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_128
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_128.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_128.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_128.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_128.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_128.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_128.fence = 1;
                ProcyonInvokeDynamicHelper_128.handle = handle;
                ProcyonInvokeDynamicHelper_128.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_128.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_129
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_129.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_129.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_129.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_129.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_129.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(n9.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_129.fence = 1;
                ProcyonInvokeDynamicHelper_129.handle = handle;
                ProcyonInvokeDynamicHelper_129.fence = 0;
            }
            return handle;
        }
        
        private static n9 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_129.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_130
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_130.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_130.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_130.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_130.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_130.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_130.fence = 1;
                ProcyonInvokeDynamicHelper_130.handle = handle;
                ProcyonInvokeDynamicHelper_130.fence = 0;
            }
            return handle;
        }
        
        private static sn invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_130.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_131
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_131.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_131.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_131.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_131.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_131.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_131.fence = 1;
                ProcyonInvokeDynamicHelper_131.handle = handle;
                ProcyonInvokeDynamicHelper_131.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_131.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_132
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_132.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_132.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_132.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_132.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_132.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(n9.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_132.fence = 1;
                ProcyonInvokeDynamicHelper_132.handle = handle;
                ProcyonInvokeDynamicHelper_132.fence = 0;
            }
            return handle;
        }
        
        private static n9 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_132.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_133
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_133.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_133.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_133.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_133.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_133.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_133.fence = 1;
                ProcyonInvokeDynamicHelper_133.handle = handle;
                ProcyonInvokeDynamicHelper_133.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_133.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_134
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_134.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_134.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_134.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_134.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_134.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(n9.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_134.fence = 1;
                ProcyonInvokeDynamicHelper_134.handle = handle;
                ProcyonInvokeDynamicHelper_134.fence = 0;
            }
            return handle;
        }
        
        private static n9 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_134.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_135
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_135.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_135.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_135.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_135.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_135.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(n9.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_135.fence = 1;
                ProcyonInvokeDynamicHelper_135.handle = handle;
                ProcyonInvokeDynamicHelper_135.fence = 0;
            }
            return handle;
        }
        
        private static n9 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_135.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_136
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_136.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_136.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_136.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_136.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_136.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_136.fence = 1;
                ProcyonInvokeDynamicHelper_136.handle = handle;
                ProcyonInvokeDynamicHelper_136.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_136.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_137
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_137.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_137.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_137.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_137.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_137.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_137.fence = 1;
                ProcyonInvokeDynamicHelper_137.handle = handle;
                ProcyonInvokeDynamicHelper_137.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_137.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_138
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_138.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_138.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_138.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_138.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_138.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(n9.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_138.fence = 1;
                ProcyonInvokeDynamicHelper_138.handle = handle;
                ProcyonInvokeDynamicHelper_138.fence = 0;
            }
            return handle;
        }
        
        private static n9 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_138.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_139
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_139.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_139.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_139.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_139.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_139.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_139.fence = 1;
                ProcyonInvokeDynamicHelper_139.handle = handle;
                ProcyonInvokeDynamicHelper_139.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_139.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_140
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_140.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_140.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_140.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_140.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_140.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_140.fence = 1;
                ProcyonInvokeDynamicHelper_140.handle = handle;
                ProcyonInvokeDynamicHelper_140.fence = 0;
            }
            return handle;
        }
        
        private static sn invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_140.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_141
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_141.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_141.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_141.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_141.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_141.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(String.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_141.fence = 1;
                ProcyonInvokeDynamicHelper_141.handle = handle;
                ProcyonInvokeDynamicHelper_141.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_141.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_142
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_142.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_142.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_142.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_142.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_142.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_142.fence = 1;
                ProcyonInvokeDynamicHelper_142.handle = handle;
                ProcyonInvokeDynamicHelper_142.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_142.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_143
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_143.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_143.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_143.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_143.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_143.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(JFrame.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_143.fence = 1;
                ProcyonInvokeDynamicHelper_143.handle = handle;
                ProcyonInvokeDynamicHelper_143.fence = 0;
            }
            return handle;
        }
        
        private static JFrame invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_143.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_144
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_144.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_144.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_144.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_144.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_144.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_144.fence = 1;
                ProcyonInvokeDynamicHelper_144.handle = handle;
                ProcyonInvokeDynamicHelper_144.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_144.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_145
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_145.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_145.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_145.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_145.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_145.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_145.fence = 1;
                ProcyonInvokeDynamicHelper_145.handle = handle;
                ProcyonInvokeDynamicHelper_145.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_145.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_146
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_146.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_146.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_146.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_146.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_146.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(void.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_146.fence = 1;
                ProcyonInvokeDynamicHelper_146.handle = handle;
                ProcyonInvokeDynamicHelper_146.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_146.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_147
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_147.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_147.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_147.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_147.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_147.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(n9.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_147.fence = 1;
                ProcyonInvokeDynamicHelper_147.handle = handle;
                ProcyonInvokeDynamicHelper_147.fence = 0;
            }
            return handle;
        }
        
        private static n9 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_147.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_148
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_148.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_148.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_148.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_148.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_148.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_148.fence = 1;
                ProcyonInvokeDynamicHelper_148.handle = handle;
                ProcyonInvokeDynamicHelper_148.fence = 0;
            }
            return handle;
        }
        
        private static sn invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_148.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_149
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_149.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_149.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_149.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_149.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_149.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_149.fence = 1;
                ProcyonInvokeDynamicHelper_149.handle = handle;
                ProcyonInvokeDynamicHelper_149.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_149.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_150
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_150.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_150.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_150.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_150.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_150.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(n9.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_150.fence = 1;
                ProcyonInvokeDynamicHelper_150.handle = handle;
                ProcyonInvokeDynamicHelper_150.fence = 0;
            }
            return handle;
        }
        
        private static n9 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_150.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_151
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_151.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_151.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_151.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_151.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_151.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_151.fence = 1;
                ProcyonInvokeDynamicHelper_151.handle = handle;
                ProcyonInvokeDynamicHelper_151.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_151.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_152
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_152.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_152.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_152.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_152.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_152.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(n9.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_152.fence = 1;
                ProcyonInvokeDynamicHelper_152.handle = handle;
                ProcyonInvokeDynamicHelper_152.fence = 0;
            }
            return handle;
        }
        
        private static n9 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_152.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_153
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_153.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_153.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_153.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_153.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_153.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(sn.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_153.fence = 1;
                ProcyonInvokeDynamicHelper_153.handle = handle;
                ProcyonInvokeDynamicHelper_153.fence = 0;
            }
            return handle;
        }
        
        private static sn invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_153.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_154
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_154.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_154.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_154.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_154.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_154.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "w", MethodType.methodType(JTextField.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_154.fence = 1;
                ProcyonInvokeDynamicHelper_154.handle = handle;
                ProcyonInvokeDynamicHelper_154.fence = 0;
            }
            return handle;
        }
        
        private static JTextField invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_154.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_155
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_155.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_155.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_155.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_155.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_155.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(String.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_155.fence = 1;
                ProcyonInvokeDynamicHelper_155.handle = handle;
                ProcyonInvokeDynamicHelper_155.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_155.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_156
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_156.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_156.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_156.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_156.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_156.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "v", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_156.fence = 1;
                ProcyonInvokeDynamicHelper_156.handle = handle;
                ProcyonInvokeDynamicHelper_156.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_156.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_157
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_157.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_157.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_157.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_157.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_157.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "i", MethodType.methodType(n9.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_157.fence = 1;
                ProcyonInvokeDynamicHelper_157.handle = handle;
                ProcyonInvokeDynamicHelper_157.fence = 0;
            }
            return handle;
        }
        
        private static n9 invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_157.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_158
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_158.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_158.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_158.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_158.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_158.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_158.fence = 1;
                ProcyonInvokeDynamicHelper_158.handle = handle;
                ProcyonInvokeDynamicHelper_158.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_158.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_159
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_159.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_159.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_159.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_159.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_159.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_159.fence = 1;
                ProcyonInvokeDynamicHelper_159.handle = handle;
                ProcyonInvokeDynamicHelper_159.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_159.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_160
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_160.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_160.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_160.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_160.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_160.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_160.fence = 1;
                ProcyonInvokeDynamicHelper_160.handle = handle;
                ProcyonInvokeDynamicHelper_160.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_160.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_161
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_161.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_161.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_161.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_161.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_161.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_161.fence = 1;
                ProcyonInvokeDynamicHelper_161.handle = handle;
                ProcyonInvokeDynamicHelper_161.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_161.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_162
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_162.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_162.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_162.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_162.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_162.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_162.fence = 1;
                ProcyonInvokeDynamicHelper_162.handle = handle;
                ProcyonInvokeDynamicHelper_162.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_162.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_163
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_163.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_163.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_163.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_163.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_163.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_163.fence = 1;
                ProcyonInvokeDynamicHelper_163.handle = handle;
                ProcyonInvokeDynamicHelper_163.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_163.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_164
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_164.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_164.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_164.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_164.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_164.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_164.fence = 1;
                ProcyonInvokeDynamicHelper_164.handle = handle;
                ProcyonInvokeDynamicHelper_164.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_164.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_165
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_165.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_165.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_165.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_165.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_165.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_165.fence = 1;
                ProcyonInvokeDynamicHelper_165.handle = handle;
                ProcyonInvokeDynamicHelper_165.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_165.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_166
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_166.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_166.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_166.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_166.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_166.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_166.fence = 1;
                ProcyonInvokeDynamicHelper_166.handle = handle;
                ProcyonInvokeDynamicHelper_166.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_166.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_167
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_167.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_167.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_167.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_167.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_167.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_167.fence = 1;
                ProcyonInvokeDynamicHelper_167.handle = handle;
                ProcyonInvokeDynamicHelper_167.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_167.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_168
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_168.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_168.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_168.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_168.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_168.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_168.fence = 1;
                ProcyonInvokeDynamicHelper_168.handle = handle;
                ProcyonInvokeDynamicHelper_168.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_168.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_169
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_169.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_169.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_169.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_169.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_169.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_169.fence = 1;
                ProcyonInvokeDynamicHelper_169.handle = handle;
                ProcyonInvokeDynamicHelper_169.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_169.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_170
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_170.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_170.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_170.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_170.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_170.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_170.fence = 1;
                ProcyonInvokeDynamicHelper_170.handle = handle;
                ProcyonInvokeDynamicHelper_170.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_170.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_171
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_171.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_171.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_171.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_171.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_171.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_171.fence = 1;
                ProcyonInvokeDynamicHelper_171.handle = handle;
                ProcyonInvokeDynamicHelper_171.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_171.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_172
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_172.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_172.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_172.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_172.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_172.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_172.fence = 1;
                ProcyonInvokeDynamicHelper_172.handle = handle;
                ProcyonInvokeDynamicHelper_172.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_172.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_173
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_173.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_173.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_173.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_173.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_173.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_173.fence = 1;
                ProcyonInvokeDynamicHelper_173.handle = handle;
                ProcyonInvokeDynamicHelper_173.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_173.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_174
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_174.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_174.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_174.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_174.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_174.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_174.fence = 1;
                ProcyonInvokeDynamicHelper_174.handle = handle;
                ProcyonInvokeDynamicHelper_174.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_174.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_175
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_175.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_175.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_175.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_175.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_175.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_175.fence = 1;
                ProcyonInvokeDynamicHelper_175.handle = handle;
                ProcyonInvokeDynamicHelper_175.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_175.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_176
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_176.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_176.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_176.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_176.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_176.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_176.fence = 1;
                ProcyonInvokeDynamicHelper_176.handle = handle;
                ProcyonInvokeDynamicHelper_176.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_176.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_177
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_177.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_177.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_177.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_177.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_177.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_177.fence = 1;
                ProcyonInvokeDynamicHelper_177.handle = handle;
                ProcyonInvokeDynamicHelper_177.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_177.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_178
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_178.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_178.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_178.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_178.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_178.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_178.fence = 1;
                ProcyonInvokeDynamicHelper_178.handle = handle;
                ProcyonInvokeDynamicHelper_178.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_178.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_179
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_179.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_179.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_179.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_179.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_179.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_179.fence = 1;
                ProcyonInvokeDynamicHelper_179.handle = handle;
                ProcyonInvokeDynamicHelper_179.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_179.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_180
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_180.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_180.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_180.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_180.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_180.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_180.fence = 1;
                ProcyonInvokeDynamicHelper_180.handle = handle;
                ProcyonInvokeDynamicHelper_180.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_180.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_181
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_181.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_181.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_181.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_181.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_181.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_181.fence = 1;
                ProcyonInvokeDynamicHelper_181.handle = handle;
                ProcyonInvokeDynamicHelper_181.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_181.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_182
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_182.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_182.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_182.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_182.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_182.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_182.fence = 1;
                ProcyonInvokeDynamicHelper_182.handle = handle;
                ProcyonInvokeDynamicHelper_182.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_182.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_183
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_183.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_183.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_183.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_183.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_183.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_183.fence = 1;
                ProcyonInvokeDynamicHelper_183.handle = handle;
                ProcyonInvokeDynamicHelper_183.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_183.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_184
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_184.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_184.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_184.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_184.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_184.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_184.fence = 1;
                ProcyonInvokeDynamicHelper_184.handle = handle;
                ProcyonInvokeDynamicHelper_184.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_184.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_185
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_185.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_185.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_185.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_185.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_185.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_185.fence = 1;
                ProcyonInvokeDynamicHelper_185.handle = handle;
                ProcyonInvokeDynamicHelper_185.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_185.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_186
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_186.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_186.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_186.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_186.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_186.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_186.fence = 1;
                ProcyonInvokeDynamicHelper_186.handle = handle;
                ProcyonInvokeDynamicHelper_186.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_186.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_187
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_187.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_187.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_187.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_187.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_187.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_187.fence = 1;
                ProcyonInvokeDynamicHelper_187.handle = handle;
                ProcyonInvokeDynamicHelper_187.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_187.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_188
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_188.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_188.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_188.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_188.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_188.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_188.fence = 1;
                ProcyonInvokeDynamicHelper_188.handle = handle;
                ProcyonInvokeDynamicHelper_188.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_188.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_189
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_189.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_189.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_189.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_189.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_189.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_189.fence = 1;
                ProcyonInvokeDynamicHelper_189.handle = handle;
                ProcyonInvokeDynamicHelper_189.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_189.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_190
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_190.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_190.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_190.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_190.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_190.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_190.fence = 1;
                ProcyonInvokeDynamicHelper_190.handle = handle;
                ProcyonInvokeDynamicHelper_190.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_190.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_191
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_191.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_191.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_191.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_191.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_191.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_191.fence = 1;
                ProcyonInvokeDynamicHelper_191.handle = handle;
                ProcyonInvokeDynamicHelper_191.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_191.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_192
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_192.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_192.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_192.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_192.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_192.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_192.fence = 1;
                ProcyonInvokeDynamicHelper_192.handle = handle;
                ProcyonInvokeDynamicHelper_192.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_192.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_193
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_193.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_193.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_193.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_193.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_193.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_193.fence = 1;
                ProcyonInvokeDynamicHelper_193.handle = handle;
                ProcyonInvokeDynamicHelper_193.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_193.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_194
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_194.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_194.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_194.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_194.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_194.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_194.fence = 1;
                ProcyonInvokeDynamicHelper_194.handle = handle;
                ProcyonInvokeDynamicHelper_194.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_194.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_195
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_195.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_195.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_195.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_195.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_195.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_195.fence = 1;
                ProcyonInvokeDynamicHelper_195.handle = handle;
                ProcyonInvokeDynamicHelper_195.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_195.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_196
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_196.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_196.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_196.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_196.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_196.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_196.fence = 1;
                ProcyonInvokeDynamicHelper_196.handle = handle;
                ProcyonInvokeDynamicHelper_196.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_196.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_197
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_197.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_197.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_197.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_197.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_197.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_197.fence = 1;
                ProcyonInvokeDynamicHelper_197.handle = handle;
                ProcyonInvokeDynamicHelper_197.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_197.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_198
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_198.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_198.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_198.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_198.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_198.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_198.fence = 1;
                ProcyonInvokeDynamicHelper_198.handle = handle;
                ProcyonInvokeDynamicHelper_198.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_198.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_199
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_199.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_199.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_199.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_199.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_199.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_199.fence = 1;
                ProcyonInvokeDynamicHelper_199.handle = handle;
                ProcyonInvokeDynamicHelper_199.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_199.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_200
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_200.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_200.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_200.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_200.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_200.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_200.fence = 1;
                ProcyonInvokeDynamicHelper_200.handle = handle;
                ProcyonInvokeDynamicHelper_200.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_200.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_201
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_201.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_201.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_201.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_201.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_201.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_201.fence = 1;
                ProcyonInvokeDynamicHelper_201.handle = handle;
                ProcyonInvokeDynamicHelper_201.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_201.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_202
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_202.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_202.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_202.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_202.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_202.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_202.fence = 1;
                ProcyonInvokeDynamicHelper_202.handle = handle;
                ProcyonInvokeDynamicHelper_202.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_202.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_203
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_203.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_203.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_203.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_203.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_203.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_203.fence = 1;
                ProcyonInvokeDynamicHelper_203.handle = handle;
                ProcyonInvokeDynamicHelper_203.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_203.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_204
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_204.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_204.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_204.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_204.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_204.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_204.fence = 1;
                ProcyonInvokeDynamicHelper_204.handle = handle;
                ProcyonInvokeDynamicHelper_204.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_204.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_205
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_205.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_205.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_205.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_205.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_205.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_205.fence = 1;
                ProcyonInvokeDynamicHelper_205.handle = handle;
                ProcyonInvokeDynamicHelper_205.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_205.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_206
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_206.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_206.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_206.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_206.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_206.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_206.fence = 1;
                ProcyonInvokeDynamicHelper_206.handle = handle;
                ProcyonInvokeDynamicHelper_206.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_206.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_207
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_207.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_207.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_207.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_207.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_207.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_207.fence = 1;
                ProcyonInvokeDynamicHelper_207.handle = handle;
                ProcyonInvokeDynamicHelper_207.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_207.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_208
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_208.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_208.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_208.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_208.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_208.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_208.fence = 1;
                ProcyonInvokeDynamicHelper_208.handle = handle;
                ProcyonInvokeDynamicHelper_208.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_208.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_209
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_209.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_209.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_209.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_209.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_209.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_209.fence = 1;
                ProcyonInvokeDynamicHelper_209.handle = handle;
                ProcyonInvokeDynamicHelper_209.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_209.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_210
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_210.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_210.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_210.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_210.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_210.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_210.fence = 1;
                ProcyonInvokeDynamicHelper_210.handle = handle;
                ProcyonInvokeDynamicHelper_210.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_210.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_211
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_211.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_211.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_211.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_211.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_211.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_211.fence = 1;
                ProcyonInvokeDynamicHelper_211.handle = handle;
                ProcyonInvokeDynamicHelper_211.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_211.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_212
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_212.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_212.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_212.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_212.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_212.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_212.fence = 1;
                ProcyonInvokeDynamicHelper_212.handle = handle;
                ProcyonInvokeDynamicHelper_212.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_212.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_213
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_213.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_213.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_213.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_213.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_213.LOOKUP;
                try {
                    handle = ((CallSite)ci.b(lookup, "a", MethodType.methodType(int.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_213.fence = 1;
                ProcyonInvokeDynamicHelper_213.handle = handle;
                ProcyonInvokeDynamicHelper_213.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_213.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_214
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_214.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_214.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_214.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_214.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_214.LOOKUP;
                try {
                    handle = ((CallSite)ci.a(lookup, "r", MethodType.methodType(String.class, int.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_214.fence = 1;
                ProcyonInvokeDynamicHelper_214.handle = handle;
                ProcyonInvokeDynamicHelper_214.fence = 0;
            }
            return handle;
        }
        
        private static String invoke(int p0, long p1) {
            try {
                return ProcyonInvokeDynamicHelper_214.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_215
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_215.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_215.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_215.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_215.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_215.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "j", MethodType.methodType(void.class, String[].class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_215.fence = 1;
                ProcyonInvokeDynamicHelper_215.handle = handle;
                ProcyonInvokeDynamicHelper_215.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(String[] p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_215.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_216
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_216.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_216.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_216.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_216.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_216.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "u", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_216.fence = 1;
                ProcyonInvokeDynamicHelper_216.handle = handle;
                ProcyonInvokeDynamicHelper_216.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_216.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_217
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_217.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_217.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_217.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_217.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_217.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "r", MethodType.methodType(JLabel.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_217.fence = 1;
                ProcyonInvokeDynamicHelper_217.handle = handle;
                ProcyonInvokeDynamicHelper_217.fence = 0;
            }
            return handle;
        }
        
        private static JLabel invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_217.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_218
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_218.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_218.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_218.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_218.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_218.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "s", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_218.fence = 1;
                ProcyonInvokeDynamicHelper_218.handle = handle;
                ProcyonInvokeDynamicHelper_218.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_218.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_219
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_219.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_219.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_219.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_219.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_219.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "s", MethodType.methodType(Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_219.fence = 1;
                ProcyonInvokeDynamicHelper_219.handle = handle;
                ProcyonInvokeDynamicHelper_219.fence = 0;
            }
            return handle;
        }
        
        private static Object invoke(Object p0, long p1, long p2) {
            try {
                return ProcyonInvokeDynamicHelper_219.handle().invokeExact(p0, p1, p2);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_220
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_220.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_220.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_220.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_220.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_220.LOOKUP;
                try {
                    handle = ((CallSite)m44.a(lookup, "s", MethodType.methodType(void.class, Object.class, Object.class, long.class, long.class))).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_220.fence = 1;
                ProcyonInvokeDynamicHelper_220.handle = handle;
                ProcyonInvokeDynamicHelper_220.fence = 0;
            }
            return handle;
        }
        
        private static void invoke(Object p0, Object p1, long p2, long p3) {
            try {
                return ProcyonInvokeDynamicHelper_220.handle().invokeExact(p0, p1, p2, p3);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
