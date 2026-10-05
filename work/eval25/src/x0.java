package com.zelix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

public class x0 extends JTextField implements ActionListener, PropertyChangeListener, DocumentListener, yz {
   private int j;
   private Document l;
   private File R;
   private boolean x;
   private boolean P;
   private static String E;
   private File[] i;
   private static final long a = ess.a(-1834474735794612754L, 3135701734936231134L, MethodHandles.lookup().lookupClass()).a(42085586690742L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public File[] I(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: pop
      // 00c: getstatic com/zelix/x0.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 133138712715441
      // 017: lxor
      // 018: lstore 4
      // 01a: pop2
      // 01b: ldc2_w 4233262782207334549
      // 01e: lload 2
      // 01f: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: astore 6
      // 026: aload 0
      // 027: aload 6
      // 029: ifnull 0fd
      // 02c: ldc2_w 4422958593557394776
      // 02f: lload 2
      // 030: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: ifeq 0fc
      // 038: goto 045
      // 03b: ldc2_w 2617125711093588856
      // 03e: lload 2
      // 03f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: athrow
      // 045: aload 0
      // 046: ldc2_w 4542947139426129180
      // 049: lload 2
      // 04a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 052: astore 7
      // 054: aload 7
      // 056: invokevirtual java/lang/String.length ()I
      // 059: aload 6
      // 05b: ifnull 06f
      // 05e: ifle 0fa
      // 061: goto 06e
      // 064: ldc2_w 2617125711093588856
      // 067: lload 2
      // 068: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: bipush 1
      // 06f: anewarray 74
      // 072: astore 8
      // 074: aload 6
      // 076: lload 2
      // 077: lconst_0
      // 078: lcmp
      // 079: ifle 0da
      // 07c: ifnull 0d2
      // 07f: aload 7
      // 081: lload 4
      // 083: bipush 2
      // 084: anewarray 241
      // 087: dup_x2
      // 088: dup_x2
      // 089: pop
      // 08a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08d: bipush 1
      // 08e: swap
      // 08f: aastore
      // 090: dup_x1
      // 091: swap
      // 092: bipush 0
      // 093: swap
      // 094: aastore
      // 095: ldc2_w 4107246168464904301
      // 098: lload 2
      // 099: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: ifeq 0dd
      // 0a1: goto 0ae
      // 0a4: ldc2_w 2617125711093588856
      // 0a7: lload 2
      // 0a8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 8
      // 0b0: bipush 0
      // 0b1: new java/io/File
      // 0b4: dup
      // 0b5: aload 0
      // 0b6: ldc2_w 4100900489735644174
      // 0b9: lload 2
      // 0ba: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: aload 7
      // 0c1: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0c4: aastore
      // 0c5: goto 0d2
      // 0c8: ldc2_w 2617125711093588856
      // 0cb: lload 2
      // 0cc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: lload 2
      // 0d3: lconst_0
      // 0d4: lcmp
      // 0d5: ifle 0ea
      // 0d8: aload 6
      // 0da: ifnonnull 0f7
      // 0dd: aload 8
      // 0df: bipush 0
      // 0e0: new java/io/File
      // 0e3: dup
      // 0e4: aload 7
      // 0e6: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0e9: aastore
      // 0ea: goto 0f7
      // 0ed: ldc2_w 2617125711093588856
      // 0f0: lload 2
      // 0f1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: aload 8
      // 0f9: areturn
      // 0fa: aconst_null
      // 0fb: areturn
      // 0fc: aload 0
      // 0fd: ldc2_w 2762982213046398006
      // 100: lload 2
      // 101: invokedynamic i (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: areturn
   }

   static {
      long var9 = a ^ 69201911577203L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "Á\u001b\u009a\u0092÷\u009e!\u0096Û\u009c Âw\u0082x\u009cM\u0089\u000f\u0084ÐÑ\u001f\u009b\u0018\u0099ã\u0011$ÿ¡¥ýL¾^21Ç_Ð\u0002ä<(\u009e\u0010ø,(6xxù8À\u0000Û4×i÷¤\u0002}\u009fÁ5ÔZ\u0002/*\u001bþÇ;Ôw,n¼2Y¼ ê.ó\u0001";
      int var6 = "Á\u001b\u009a\u0092÷\u009e!\u0096Û\u009c Âw\u0082x\u009cM\u0089\u000f\u0084ÐÑ\u001f\u009b\u0018\u0099ã\u0011$ÿ¡¥ýL¾^21Ç_Ð\u0002ä<(\u009e\u0010ø,(6xxù8À\u0000Û4×i÷¤\u0002}\u009fÁ5ÔZ\u0002/*\u001bþÇ;Ôw,n¼2Y¼ ê.ó\u0001"
         .length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[5];
                     x44.a<"p">("\"", 5877620922982415558L, var9);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "Æ(\u001fd^¹\u0098eU+\u0016n\u0001ßv´á¸®û3/ò\u009d->ÈJ¸»Þ\u0019\u008c$¸°ãz\u008cü(&\\¿¶qvwUmy<;\u0082D\u0097bÕ{\fç\u0080T=N²îxoð%\u0097iÔ£ó\u008abýÅM";
                  var6 = "Æ(\u001fd^¹\u0098eU+\u0016n\u0001ßv´á¸®û3/ò\u009d->ÈJ¸»Þ\u0019\u008c$¸°ãz\u008cü(&\\¿¶qvwUmy<;\u0082D\u0097bÕ{\fç\u0080T=N²îxoð%\u0097iÔ£ó\u008abýÅM"
                     .length();
                  var3 = '(';
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      long var2 = a ^ 81483328651392L;
      long var4 = var2 ^ 30059386711551L;
      x44.a<"j">(this, new Object[]{var1, var4}, 3418642818161523871L, var2);
   }

   @Override
   public void actionPerformed(ActionEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/x0.a J
      // 03: ldc2_w 36705510696273
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 44369408194092
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 1615000666342143043
      // 14: lload 2
      // 15: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 0
      // 1d: aload 6
      // 1f: ifnull 77
      // 22: ldc2_w 745404032505507798
      // 25: lload 2
      // 26: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: bipush 1
      // 2c: if_icmpeq 69
      // 2f: goto 3c
      // 32: ldc2_w 614694521733140398
      // 35: lload 2
      // 36: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 6
      // 3f: ifnull 77
      // 42: goto 4f
      // 45: ldc2_w 614694521733140398
      // 48: lload 2
      // 49: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: ldc2_w 745404032505507798
      // 52: lload 2
      // 53: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: bipush 3
      // 59: if_icmpne a7
      // 5c: goto 69
      // 5f: ldc2_w 614694521733140398
      // 62: lload 2
      // 63: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: aload 0
      // 6a: goto 77
      // 6d: ldc2_w 614694521733140398
      // 70: lload 2
      // 71: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: sipush 2564
      // 7a: ldc2_w 737390139883780813
      // 7d: lload 2
      // 7e: lxor
      // 7f: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/x0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: aconst_null
      // 85: aload 0
      // 86: lload 4
      // 88: bipush 1
      // 89: anewarray 241
      // 8c: dup_x2
      // 8d: dup_x2
      // 8e: pop
      // 8f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 92: bipush 0
      // 93: swap
      // 94: aastore
      // 95: ldc2_w 1710450379377577040
      // 98: lload 2
      // 99: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: ldc2_w 1061419281883221787
      // a1: lload 2
      // a2: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: return
   }

   public x0(File var1, boolean var2, int var3, boolean var4, long var5) {
      var5 = a ^ var5;
      super();
      x44.a<"r">(this, var1, 4917094172500842714L, var5);
      x44.a<"r">(this, new PlainDocument(), 5033899950126614071L, var5);
      x44.a<"i">(this, x44.a<"m">(this, 5033899950126614071L, var5), 6364293297546524899L, var5);
      x44.a<"i">(x44.a<"m">(this, 5033899950126614071L, var5), this, 6448362947979348481L, var5);
      x44.a<"i">(this, var2, 6664410658276078162L, var5);
      x44.a<"r">(this, var3, 6510606130120048596L, var5);
      x44.a<"r">(this, var4, 6415915442724237188L, var5);
      x44.a<"i">(this, this, 5062214001936794591L, var5);
      x44.a<"i">(this, "", 5088519999636899155L, var5);
   }

   void n(Object[] var1) {
      long var3 = (Long)var1[0];
      File var2 = (File)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 19997509868237L;
      File[] var7 = new File[]{var2};
      x44.a<"l">(this, new Object[]{var7, var5}, 9192846237856985577L, var3);
   }

   private void G(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast [Ljava/io/File;
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/x0.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: ldc2_w -8920336282040523234
      // 01c: lload 3
      // 01d: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: astore 5
      // 024: aload 5
      // 026: ifnull 08b
      // 029: aload 2
      // 02a: ifnull 064
      // 02d: goto 03a
      // 030: ldc2_w -7288250760407687693
      // 033: lload 3
      // 034: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: athrow
      // 03a: aload 2
      // 03b: arraylength
      // 03c: aload 5
      // 03e: ifnull 0b0
      // 041: goto 04e
      // 044: ldc2_w -7288250760407687693
      // 047: lload 3
      // 048: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: athrow
      // 04e: lload 3
      // 04f: lconst_0
      // 050: lcmp
      // 051: ifle 0a3
      // 054: ifne 096
      // 057: goto 064
      // 05a: ldc2_w -7288250760407687693
      // 05d: lload 3
      // 05e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: aload 0
      // 065: bipush 0
      // 066: anewarray 74
      // 069: ldc2_w -7434564661544889667
      // 06c: lload 3
      // 06d: invokedynamic u (Ljava/lang/Object;[Ljava/io/File;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: aload 0
      // 073: ldc ""
      // 075: ldc2_w -8880725882103478516
      // 078: lload 3
      // 079: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: goto 08b
      // 081: ldc2_w -7288250760407687693
      // 084: lload 3
      // 085: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: lload 3
      // 08c: lconst_0
      // 08d: lcmp
      // 08e: ifle 0a1
      // 091: aload 5
      // 093: ifnonnull 1e3
      // 096: aload 0
      // 097: aload 2
      // 098: ldc2_w -7434564661544889667
      // 09b: lload 3
      // 09c: invokedynamic u (Ljava/lang/Object;[Ljava/io/File;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: aload 2
      // 0a2: arraylength
      // 0a3: goto 0b0
      // 0a6: ldc2_w -7288250760407687693
      // 0a9: lload 3
      // 0aa: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: istore 6
      // 0b2: new java/util/ArrayList
      // 0b5: dup
      // 0b6: invokespecial java/util/ArrayList.<init> ()V
      // 0b9: astore 7
      // 0bb: new java/lang/StringBuffer
      // 0be: dup
      // 0bf: invokespecial java/lang/StringBuffer.<init> ()V
      // 0c2: astore 8
      // 0c4: bipush 0
      // 0c5: istore 9
      // 0c7: iload 9
      // 0c9: iload 6
      // 0cb: if_icmpge 1b1
      // 0ce: aload 2
      // 0cf: iload 9
      // 0d1: aaload
      // 0d2: astore 10
      // 0d4: aload 5
      // 0d6: ifnull 1d4
      // 0d9: iload 6
      // 0db: bipush 1
      // 0dc: aload 5
      // 0de: lload 3
      // 0df: lconst_0
      // 0e0: lcmp
      // 0e1: iflt 13c
      // 0e4: ifnull 134
      // 0e7: goto 0f4
      // 0ea: ldc2_w -7288250760407687693
      // 0ed: lload 3
      // 0ee: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: if_icmple 120
      // 0f7: goto 104
      // 0fa: ldc2_w -7288250760407687693
      // 0fd: lload 3
      // 0fe: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 8
      // 106: ldc2_w -7138586520388701767
      // 109: lload 3
      // 10a: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 112: pop
      // 113: goto 120
      // 116: ldc2_w -7288250760407687693
      // 119: lload 3
      // 11a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: aload 8
      // 122: aload 10
      // 124: ldc2_w -8968304427902407145
      // 127: lload 3
      // 128: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 130: pop
      // 131: iload 6
      // 133: bipush 1
      // 134: lload 3
      // 135: lconst_0
      // 136: lcmp
      // 137: iflt 189
      // 13a: aload 5
      // 13c: ifnull 189
      // 13f: if_icmple 16b
      // 142: goto 14f
      // 145: ldc2_w -7288250760407687693
      // 148: lload 3
      // 149: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: aload 8
      // 151: ldc2_w -7138586520388701767
      // 154: lload 3
      // 155: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 15d: pop
      // 15e: goto 16b
      // 161: ldc2_w -7288250760407687693
      // 164: lload 3
      // 165: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: lload 3
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: iflt 1ac
      // 171: iload 9
      // 173: aload 5
      // 175: ifnull 1a8
      // 178: iload 6
      // 17a: bipush 1
      // 17b: isub
      // 17c: goto 189
      // 17f: ldc2_w -7288250760407687693
      // 182: lload 3
      // 183: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: if_icmpge 1a1
      // 18c: aload 8
      // 18e: ldc " "
      // 190: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 193: pop
      // 194: goto 1a1
      // 197: ldc2_w -7288250760407687693
      // 19a: lload 3
      // 19b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: aload 7
      // 1a3: aload 10
      // 1a5: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1a8: pop
      // 1a9: iinc 9 1
      // 1ac: aload 5
      // 1ae: ifnonnull 0c7
      // 1b1: aload 0
      // 1b2: aload 7
      // 1b4: aload 7
      // 1b6: invokevirtual java/util/ArrayList.size ()I
      // 1b9: anewarray 74
      // 1bc: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 1bf: checkcast [Ljava/io/File;
      // 1c2: checkcast [Ljava/io/File;
      // 1c5: ldc2_w -7434564661544889667
      // 1c8: lload 3
      // 1c9: invokedynamic u (Ljava/lang/Object;[Ljava/io/File;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: lload 3
      // 1cf: lconst_0
      // 1d0: lcmp
      // 1d1: ifle 1d4
      // 1d4: aload 0
      // 1d5: aload 8
      // 1d7: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1da: ldc2_w -8880725882103478516
      // 1dd: lload 3
      // 1de: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      long var2 = a ^ 91792940603732L;
      long var4 = var2 ^ 7344700362481L;
      int[] var6 = x44.a<"v">(3057047575684483142L, var2);

      boolean var10000;
      label52: {
         label47: {
            try {
               var10000 = x44.a<"n">(var1, 3647388277676065226L, var2).equals(a<"w">(17567, 1859034566887639127L ^ var2));
               if (var6 == null) {
                  break label52;
               }

               if (!var10000) {
                  break label47;
               }
            } catch (gj var14) {
               throw x44.a<"v">(var14, 3783770767464559531L, var2);
            }

            File[] var7 = x44.a<"j">(this, 3930330963433192677L, var2);
            Object[] var8 = (Object[])x44.a<"n">(var1, 3762854745581848775L, var2);
            int var9 = var8.length;
            File[] var10 = new File[var9];

            try {
               System.arraycopy(var8, 0, var10, 0, var9);
               x44.a<"h">(this, new Object[]{var10, var4}, 3147902256468796885L, var2);
               x44.a<"u">(this, false, 3292909682473231755L, var2);
               x44.a<"n">(this, a<"w">(1539, 8403792151896541901L ^ var2), var7, var10, 3656809821825757982L, var2);
               if (var6 != null) {
                  return;
               }
            } catch (gj var13) {
               boolean var10001 = false;
               throw x44.a<"v">(var13, 3783770767464559531L, var2);
            }
         }

         try {
            var10000 = x44.a<"n">(var1, 3647388277676065226L, var2).equals(a<"w">(26740, 1354996728711161019L ^ var2));
         } catch (gj var12) {
            boolean var16 = false;
            throw x44.a<"v">(var12, 3783770767464559531L, var2);
         }
      }

      try {
         if (var10000) {
            x44.a<"u">(this, (File)x44.a<"n">(var1, 3762854745581848775L, var2), 2898648845717484765L, var2);
         }
      } catch (gj var11) {
         throw x44.a<"v">(var11, 3783770767464559531L, var2);
      }
   }

   public void x(Object[] var1) {
      DocumentEvent var2 = (DocumentEvent)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      x44.a<"w">(this, true, 4120950395160162569L, var3);
      x44.a<"l">(this, a<"w">(11096, 5346492576707998487L ^ var3), null, x44.a<"l">(this, 4276948217174036813L, var3).trim(), 2755591972802619292L, var3);
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      long var2 = a ^ 135844924087575L;
      long var4 = var2 ^ 47011432558696L;
      x44.a<"m">(this, new Object[]{var1, var4}, -943992232974163704L, var2);
   }

   public File w(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: pop
      // 00c: getstatic com/zelix/x0.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 51160709077730
      // 017: lxor
      // 018: lstore 4
      // 01a: pop2
      // 01b: ldc2_w 4678331280772883142
      // 01e: lload 2
      // 01f: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: astore 6
      // 026: aload 0
      // 027: aload 6
      // 029: ifnull 0ce
      // 02c: ldc2_w 5130399291327024907
      // 02f: lload 2
      // 030: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: ifeq 0cd
      // 038: goto 045
      // 03b: ldc2_w 6774172944232814891
      // 03e: lload 2
      // 03f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: athrow
      // 045: aload 0
      // 046: ldc2_w 4996917284130156367
      // 049: lload 2
      // 04a: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 052: astore 7
      // 054: aload 7
      // 056: invokevirtual java/lang/String.length ()I
      // 059: aload 6
      // 05b: ifnull 09a
      // 05e: ifle 0cb
      // 061: goto 06e
      // 064: ldc2_w 6774172944232814891
      // 067: lload 2
      // 068: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: aload 7
      // 070: lload 4
      // 072: bipush 2
      // 073: anewarray 241
      // 076: dup_x2
      // 077: dup_x2
      // 078: pop
      // 079: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07c: bipush 1
      // 07d: swap
      // 07e: aastore
      // 07f: dup_x1
      // 080: swap
      // 081: bipush 0
      // 082: swap
      // 083: aastore
      // 084: ldc2_w 4804365741986294334
      // 087: lload 2
      // 088: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: goto 09a
      // 090: ldc2_w 6774172944232814891
      // 093: lload 2
      // 094: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: ifeq 0bd
      // 09d: new java/io/File
      // 0a0: dup
      // 0a1: aload 0
      // 0a2: ldc2_w 4808160867589971549
      // 0a5: lload 2
      // 0a6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: aload 7
      // 0ad: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0b0: lload 2
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: ifle 0c6
      // 0b6: astore 8
      // 0b8: aload 6
      // 0ba: ifnonnull 0c8
      // 0bd: new java/io/File
      // 0c0: dup
      // 0c1: aload 7
      // 0c3: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0c6: astore 8
      // 0c8: aload 8
      // 0ca: areturn
      // 0cb: aconst_null
      // 0cc: areturn
      // 0cd: aload 0
      // 0ce: ldc2_w 6632467710608610917
      // 0d1: lload 2
      // 0d2: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: aload 6
      // 0d9: lload 2
      // 0da: lconst_0
      // 0db: lcmp
      // 0dc: ifle 10b
      // 0df: ifnull 109
      // 0e2: ifnull 139
      // 0e5: goto 0f2
      // 0e8: ldc2_w 6774172944232814891
      // 0eb: lload 2
      // 0ec: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: ldc2_w 6632467710608610917
      // 0f6: lload 2
      // 0f7: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: goto 109
      // 0ff: ldc2_w 6774172944232814891
      // 102: lload 2
      // 103: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: aload 6
      // 10b: ifnull 136
      // 10e: arraylength
      // 10f: ifle 139
      // 112: goto 11f
      // 115: ldc2_w 6774172944232814891
      // 118: lload 2
      // 119: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: aload 0
      // 120: ldc2_w 6632467710608610917
      // 123: lload 2
      // 124: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: goto 136
      // 12c: ldc2_w 6774172944232814891
      // 12f: lload 2
      // 130: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: bipush 0
      // 137: aaload
      // 138: areturn
      // 139: aconst_null
      // 13a: areturn
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      long var2 = a ^ 135442711626711L;
      long var4 = var2 ^ 46601896455848L;
      x44.a<"m">(this, new Object[]{var1, var4}, -1430380295514751032L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30001;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/x0", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/x0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
