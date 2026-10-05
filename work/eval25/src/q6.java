package com.zelix;

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
import javax.swing.DefaultListModel;

public class q6 extends q9 {
   private static final long j = ess.a(4899845181057623256L, -5160994751067310140L, MethodHandles.lookup().lookupClass()).a(85711406344876L);
   private static final String[] R;
   private static final String[] V;
   private static final Map ab = new HashMap(13);
   private static final long[] ib;
   private static final Integer[] jb;
   private static final Map kb;

   q6(ig var1, pk var2, q0 var3, u6 var4, _yk var5, long var6) {
      var6 = j ^ var6;
      long var8 = (var6 ^ 91480934032824L) >>> 16;
      int var10 = (int)((var6 ^ 91480934032824L) << 48 >>> 48);
      super(var1, var2, var3, var8, (char)var10, var4, var5);
   }

   void X(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      super.X(new Object[]{var4});
      x44.a<"s">(this, 0, 3291103811164357445L, var2);
      x44.a<"s">(this, 1, 3267071613471081882L, var2);
      x44.a<"s">(this, f<"f">(2100, 7621262346939580685L ^ var2), 3817833767622077644L, var2);
      x44.a<"s">(this, f<"f">(2525, 4800756765863330017L ^ var2), 3419481070826304147L, var2);
      x44.a<"s">(this, f<"f">(7051, 4395593593857561264L ^ var2), 3067437199265812752L, var2);
   }

   void x(Object[] var1) {
      q0 var4 = (q0)var1[0];
      long var2 = (Long)var1[1];
      DefaultListModel var5 = (DefaultListModel)x44.a<"h">(var4, -7053401072140697607L, var2);
      x44.a<"h">(var5, c<"m">(12757, 970530720364166530L ^ var2), -9161727778426999730L, var2);
      x44.a<"h">(var5, c<"m">(30287, 8251413728551549458L ^ var2), -9161727778426999730L, var2);
      x44.a<"h">(var5, c<"m">(8777, 8148552463262346770L ^ var2), -9161727778426999730L, var2);
      x44.a<"h">(var5, c<"m">(23684, 8624839373907464402L ^ var2), -9161727778426999730L, var2);
      x44.a<"h">(var5, c<"m">(16081, 1875593155514331790L ^ var2), -9161727778426999730L, var2);
   }

   int p(Object[] var1) {
      long var2 = (Long)var1[0];
      return f<"f">(27334, 5580242063175988781L ^ var2);
   }

   void D(Object[] param1) {
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
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: pop
      // 017: lload 2
      // 018: dup2
      // 019: ldc2_w 4880139196754
      // 01c: lxor
      // 01d: lstore 5
      // 01f: pop2
      // 020: ldc2_w -2201304977838301975
      // 023: lload 2
      // 024: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029: astore 7
      // 02b: iload 4
      // 02d: sipush 15129
      // 030: ldc2_w 5955309457452383241
      // 033: lload 2
      // 034: lxor
      // 035: invokedynamic f (IJ)I bsm=com/zelix/q6.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: iand
      // 03b: aload 7
      // 03d: ifnull 061
      // 040: ifeq 1ab
      // 043: goto 050
      // 046: ldc2_w -2213343790480563792
      // 049: lload 2
      // 04a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: athrow
      // 050: iload 4
      // 052: bipush 2
      // 053: iand
      // 054: goto 061
      // 057: ldc2_w -2213343790480563792
      // 05a: lload 2
      // 05b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: aload 7
      // 063: lload 2
      // 064: lconst_0
      // 065: lcmp
      // 066: iflt 0ad
      // 069: ifnull 0ab
      // 06c: ifeq 09b
      // 06f: goto 07c
      // 072: ldc2_w -2213343790480563792
      // 075: lload 2
      // 076: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: new com/zelix/_su
      // 07f: dup
      // 080: sipush 18736
      // 083: ldc2_w 5950876375765967945
      // 086: lload 2
      // 087: lxor
      // 088: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/q6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: invokespecial com/zelix/_su.<init> (Ljava/lang/String;)V
      // 090: athrow
      // 091: ldc2_w -2213343790480563792
      // 094: lload 2
      // 095: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: iload 4
      // 09d: sipush 7497
      // 0a0: ldc2_w 4010515876001094231
      // 0a3: lload 2
      // 0a4: lxor
      // 0a5: invokedynamic f (IJ)I bsm=com/zelix/q6.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: iand
      // 0ab: aload 7
      // 0ad: lload 2
      // 0ae: lconst_0
      // 0af: lcmp
      // 0b0: ifle 0f7
      // 0b3: ifnull 0f5
      // 0b6: ifeq 0e5
      // 0b9: goto 0c6
      // 0bc: ldc2_w -2213343790480563792
      // 0bf: lload 2
      // 0c0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: new com/zelix/_su
      // 0c9: dup
      // 0ca: sipush 222
      // 0cd: ldc2_w 2506999022544694691
      // 0d0: lload 2
      // 0d1: lxor
      // 0d2: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/q6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: invokespecial com/zelix/_su.<init> (Ljava/lang/String;)V
      // 0da: athrow
      // 0db: ldc2_w -2213343790480563792
      // 0de: lload 2
      // 0df: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: iload 4
      // 0e7: sipush 15773
      // 0ea: ldc2_w 8101036657396726406
      // 0ed: lload 2
      // 0ee: lxor
      // 0ef: invokedynamic f (IJ)I bsm=com/zelix/q6.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: iand
      // 0f5: aload 7
      // 0f7: lload 2
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: ifle 147
      // 0fd: ifnull 13f
      // 100: ifeq 12f
      // 103: goto 110
      // 106: ldc2_w -2213343790480563792
      // 109: lload 2
      // 10a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: new com/zelix/_su
      // 113: dup
      // 114: sipush 20329
      // 117: ldc2_w 1496815612545163794
      // 11a: lload 2
      // 11b: lxor
      // 11c: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/q6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: invokespecial com/zelix/_su.<init> (Ljava/lang/String;)V
      // 124: athrow
      // 125: ldc2_w -2213343790480563792
      // 128: lload 2
      // 129: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: iload 4
      // 131: sipush 27787
      // 134: ldc2_w 7091609995191905172
      // 137: lload 2
      // 138: lxor
      // 139: invokedynamic f (IJ)I bsm=com/zelix/q6.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: iand
      // 13f: lload 2
      // 140: lconst_0
      // 141: lcmp
      // 142: iflt 189
      // 145: aload 7
      // 147: ifnull 189
      // 14a: ifeq 179
      // 14d: goto 15a
      // 150: ldc2_w -2213343790480563792
      // 153: lload 2
      // 154: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: athrow
      // 15a: new com/zelix/_su
      // 15d: dup
      // 15e: sipush 15021
      // 161: ldc2_w 7001559331798521813
      // 164: lload 2
      // 165: lxor
      // 166: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/q6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: invokespecial com/zelix/_su.<init> (Ljava/lang/String;)V
      // 16e: athrow
      // 16f: ldc2_w -2213343790480563792
      // 172: lload 2
      // 173: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: iload 4
      // 17b: sipush 9682
      // 17e: ldc2_w 1141116592030950094
      // 181: lload 2
      // 182: lxor
      // 183: invokedynamic f (IJ)I bsm=com/zelix/q6.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: iand
      // 189: ifeq 1ab
      // 18c: new com/zelix/_su
      // 18f: dup
      // 190: sipush 17573
      // 193: ldc2_w 1385615871562213850
      // 196: lload 2
      // 197: lxor
      // 198: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/q6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: invokespecial com/zelix/_su.<init> (Ljava/lang/String;)V
      // 1a0: athrow
      // 1a1: ldc2_w -2213343790480563792
      // 1a4: lload 2
      // 1a5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: aload 0
      // 1ac: ldc2_w -1978887657115125578
      // 1af: lload 2
      // 1b0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/pk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: dup
      // 1b6: astore 8
      // 1b8: monitorenter
      // 1b9: aload 0
      // 1ba: ldc2_w -348950420714223055
      // 1bd: lload 2
      // 1be: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/i8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: lload 5
      // 1c5: iload 4
      // 1c7: bipush 2
      // 1c8: anewarray 191
      // 1cb: dup_x1
      // 1cc: swap
      // 1cd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d0: bipush 1
      // 1d1: swap
      // 1d2: aastore
      // 1d3: dup_x2
      // 1d4: dup_x2
      // 1d5: pop
      // 1d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d9: bipush 0
      // 1da: swap
      // 1db: aastore
      // 1dc: ldc2_w -1922615113497894809
      // 1df: lload 2
      // 1e0: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: aload 8
      // 1e7: monitorexit
      // 1e8: goto 1f3
      // 1eb: astore 9
      // 1ed: aload 8
      // 1ef: monitorexit
      // 1f0: aload 9
      // 1f2: athrow
      // 1f3: return
   }

   void A(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
   }

   static {
      long var11 = j ^ 40906707913213L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[10];
      int var18 = 0;
      String var17 = "\u0098\u0094`\u0099\tRH\u001aÂ3ºÕ\\½åïHBvÄá\u001e,\u008dVÉþ\u009aÛ\u0086\u008b®\u000e¸ÃáRÂ\u0004m0{ Tól°\fsm«ø\u0002\u0083\u0094s\u0011çEè\fåÝ\u001a0\b4|\u001f§´¶~Ø\u0012h)(ft~ÖR\u0099\u008a@Aïm\u0010F/Qä\u000bZ|µê¼ïgLsÔ\u001dH\u009f~'ÃÍß{\u0018\u000b\u001a#é\u008f´¡\u0091\u0088B7\u008dOV\u0007b\u0098Æ\u000e¿o¯\u001få\u009a*MR©\u0005õø\u008aTËÁ\u00ad¡\u008fZûÊ\u0084¡¦Üód\u009fÀ\u0080òÄhmæï\u0010\"FÉ\u000bpÿ\u0010ÁnóV\u0085ÅÉÙ\u0094uE\u00903©Nã@ïcA\u0087v÷àúéÇ]ïmävÅÁ@ÿa²,ÄÁÒ\u009eºÜx_Á\u009cÅ§\u0004\rq\u000b\u001dîm\u001bÔ\u001a·ïo÷\bç_\u009d\u001d\u001f\u0097Ã\u008d-\u0092`\u0095¬\u001b\u0085PðêGcHW¤r\u001d\f\u0087§rpg$á?CØ&Ö\u0083N\u009cÕ\u009d\u008dîl\u008cÑÈ·_|È7åªe \u0013\u009d\u0018\u0007u\u0019*,\u0087ÿùå!c\u001e¹dÿô-&J£.¶9\tRòt¦\u0084Cþû\u000e[\u0002Hè\u0093³s`\u0082Â\u0004#\u0017\u00ad°\u0082Y\u0090\u0085\u001c\u008dXùùÈ}ø\u0090n¯ôù\u0086ÃIxD)ëk\u008f\u0018R@Uç\u0089$8¢+G\u0085\u0095Rbx\u000fwÁ.\u0097\u0093\u0085møj4\u001562Áã8À";
      int var19 = "\u0098\u0094`\u0099\tRH\u001aÂ3ºÕ\\½åïHBvÄá\u001e,\u008dVÉþ\u009aÛ\u0086\u008b®\u000e¸ÃáRÂ\u0004m0{ Tól°\fsm«ø\u0002\u0083\u0094s\u0011çEè\fåÝ\u001a0\b4|\u001f§´¶~Ø\u0012h)(ft~ÖR\u0099\u008a@Aïm\u0010F/Qä\u000bZ|µê¼ïgLsÔ\u001dH\u009f~'ÃÍß{\u0018\u000b\u001a#é\u008f´¡\u0091\u0088B7\u008dOV\u0007b\u0098Æ\u000e¿o¯\u001få\u009a*MR©\u0005õø\u008aTËÁ\u00ad¡\u008fZûÊ\u0084¡¦Üód\u009fÀ\u0080òÄhmæï\u0010\"FÉ\u000bpÿ\u0010ÁnóV\u0085ÅÉÙ\u0094uE\u00903©Nã@ïcA\u0087v÷àúéÇ]ïmävÅÁ@ÿa²,ÄÁÒ\u009eºÜx_Á\u009cÅ§\u0004\rq\u000b\u001dîm\u001bÔ\u001a·ïo÷\bç_\u009d\u001d\u001f\u0097Ã\u008d-\u0092`\u0095¬\u001b\u0085PðêGcHW¤r\u001d\f\u0087§rpg$á?CØ&Ö\u0083N\u009cÕ\u009d\u008dîl\u008cÑÈ·_|È7åªe \u0013\u009d\u0018\u0007u\u0019*,\u0087ÿùå!c\u001e¹dÿô-&J£.¶9\tRòt¦\u0084Cþû\u000e[\u0002Hè\u0093³s`\u0082Â\u0004#\u0017\u00ad°\u0082Y\u0090\u0085\u001c\u008dXùùÈ}ø\u0090n¯ôù\u0086ÃIxD)ëk\u008f\u0018R@Uç\u0089$8¢+G\u0085\u0095Rbx\u000fwÁ.\u0097\u0093\u0085møj4\u001562Áã8À"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = d(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     R = var20;
                     V = new String[10];
                     kb = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "\u0096\u007f5ÎÉ\u001e\u0018¨\u0081è0\u0080*Ù\u009el¦aA\u0085CO20\u000f½\u0007ü\u0018É¦µ\u0096Ø\u001czÃ²\u0017{ê¥\u0080Ql®Ò\u0084[\u0081¦\u009eç8×\u008b";
                     int var5 = "\u0096\u007f5ÎÉ\u001e\u0018¨\u0081è0\u0080*Ù\u009el¦aA\u0085CO20\u000f½\u0007ü\u0018É¦µ\u0096Ø\u001czÃ²\u0017{ê¥\u0080Ql®Ò\u0084[\u0081¦\u009eç8×\u008b"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
                           byte[] var10 = var0.doFinal(
                              new byte[]{
                                 (byte)((int)(var8 >>> 56)),
                                 (byte)((int)(var8 >>> 48)),
                                 (byte)((int)(var8 >>> 40)),
                                 (byte)((int)(var8 >>> 32)),
                                 (byte)((int)(var8 >>> 24)),
                                 (byte)((int)(var8 >>> 16)),
                                 (byte)((int)(var8 >>> 8)),
                                 (byte)((int)var8)
                              }
                           );
                           long var45 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    ib = var6;
                                    jb = new Integer[9];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "HÇ¸\u0013w3¥\u0002û»;\u0091\u000eÚ¸â";
                                 var5 = "HÇ¸\u0013w3¥\u0002û»;\u0091\u000eÚ¸â".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "W²Ä\u0083Â\u001c)E3JJ©ãC\u0082\u008a±\u0080³ùpÚ$¤®m\u0005\u008c5\rR/\u0018\u0005×>ÑªO\u0083\u0003âÛ¢\u0007%¤¹\u0012\u0004\nÿ@\u009b\u0098\u0007\u0084";
                  var19 = "W²Ä\u0083Â\u001c)E3JJ©ãC\u0082\u008a±\u0080³ùpÚ$¤®m\u0005\u008c5\rR/\u0018\u0005×>ÑªO\u0083\u0003âÛ¢\u0007%¤¹\u0012\u0004\nÿ@\u009b\u0098\u0007\u0084"
                     .length();
                  var16 = ' ';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22612;
      if (V[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])ab.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               ab.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/q6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = R[var5].getBytes("ISO-8859-1");
         V[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return V[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/q6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int f(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29234;
      if (jb[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = ib[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])kb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               kb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/q6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = f(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/q6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
