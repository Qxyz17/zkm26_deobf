package com.zelix;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.lang.invoke.MethodHandles;
import javax.swing.JPanel;

public class d4 extends JPanel {
   Image e;
   int G;
   boolean q;
   int m;
   private static final long a = ess.a(4729311614858323260L, -6754767185649565554L, MethodHandles.lookup().lookupClass()).a(6650265728243L);

   @Override
   public void update(Graphics var1) {
      long var2 = a ^ 129769074066866L;
      x44.a<"m">(
         var1,
         x44.a<"i">(this, 3284899625130247843L, var2),
         0,
         0,
         x44.a<"i">(this, 3783820383702696467L, var2),
         x44.a<"i">(this, 3234940572268352392L, var2),
         this,
         3534690136418179915L,
         var2
      );
   }

   public d4(Image param1, Image param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/d4.a J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 32640237773544
      // 00b: lxor
      // 00c: lstore 5
      // 00e: pop2
      // 00f: ldc2_w -1451881408771800074
      // 012: lload 3
      // 013: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 018: aload 0
      // 019: invokespecial javax/swing/JPanel.<init> ()V
      // 01c: aload 0
      // 01d: aload 1
      // 01e: ldc2_w -1090714290354185240
      // 021: lload 3
      // 022: invokedynamic u (Ljava/lang/Object;Ljava/awt/Image;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: astore 7
      // 029: aload 0
      // 02a: lload 5
      // 02c: bipush 1
      // 02d: anewarray 6
      // 030: dup_x2
      // 031: dup_x2
      // 032: pop
      // 033: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 036: bipush 0
      // 037: swap
      // 038: aastore
      // 039: ldc2_w -1445587114123810472
      // 03c: lload 3
      // 03d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: aload 0
      // 043: bipush 1
      // 044: ldc2_w -1600805750710688691
      // 047: lload 3
      // 048: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: aload 0
      // 04e: aload 0
      // 04f: ldc2_w -1090714290354185240
      // 052: lload 3
      // 053: invokedynamic j (Ljava/lang/Object;JJ)Ljava/awt/Image; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: aload 0
      // 059: ldc2_w -1606403014514896550
      // 05c: lload 3
      // 05d: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: istore 8
      // 064: aload 7
      // 066: ifnull 113
      // 069: iload 8
      // 06b: ifne 0cd
      // 06e: goto 07b
      // 071: ldc2_w -1525801088468174955
      // 074: lload 3
      // 075: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: aload 0
      // 07c: aload 2
      // 07d: ldc2_w -1090714290354185240
      // 080: lload 3
      // 081: invokedynamic u (Ljava/lang/Object;Ljava/awt/Image;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: aload 0
      // 087: bipush 0
      // 088: ldc2_w -1600805750710688691
      // 08b: lload 3
      // 08c: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: aload 0
      // 092: lload 5
      // 094: bipush 1
      // 095: anewarray 6
      // 098: dup_x2
      // 099: dup_x2
      // 09a: pop
      // 09b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09e: bipush 0
      // 09f: swap
      // 0a0: aastore
      // 0a1: ldc2_w -1445587114123810472
      // 0a4: lload 3
      // 0a5: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: aload 0
      // 0ab: aload 0
      // 0ac: ldc2_w -1090714290354185240
      // 0af: lload 3
      // 0b0: invokedynamic j (Ljava/lang/Object;JJ)Ljava/awt/Image; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: aload 0
      // 0b6: ldc2_w -1606403014514896550
      // 0b9: lload 3
      // 0ba: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: pop
      // 0c0: goto 0cd
      // 0c3: ldc2_w -1525801088468174955
      // 0c6: lload 3
      // 0c7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: aload 0
      // 0cf: ldc2_w -1090714290354185240
      // 0d2: lload 3
      // 0d3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/awt/Image; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: aload 0
      // 0d9: ldc2_w -1562719169006400846
      // 0dc: lload 3
      // 0dd: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: ldc2_w -1600577249143709864
      // 0e5: lload 3
      // 0e6: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: aload 0
      // 0ec: aload 0
      // 0ed: ldc2_w -1090714290354185240
      // 0f0: lload 3
      // 0f1: invokedynamic j (Ljava/lang/Object;JJ)Ljava/awt/Image; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: aload 0
      // 0f7: ldc2_w -672137854602716642
      // 0fa: lload 3
      // 0fb: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: ldc2_w -1031431378895302973
      // 103: lload 3
      // 104: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: aload 0
      // 10a: ldc2_w -1698093299758231046
      // 10d: lload 3
      // 10e: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: return
   }

   private void u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      MediaTracker var4 = new MediaTracker(this);
      x44.a<"j">(var4, x44.a<"n">(this, -1166107095688870684L, var2), 0, -590600898140061408L, var2);

      try {
         x44.a<"j">(var4, 0, -1599095099932123703L, var2);
      } catch (InterruptedException var6) {
      }
   }

   @Override
   public Dimension getMinimumSize() {
      long var1 = a ^ 110405618118658L;
      return x44.a<"m">(this, 2085722081012202167L, var1);
   }

   public boolean c(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -6437393857151440084L, var2);
   }

   @Override
   public Dimension getPreferredSize() {
      long var1 = a ^ 27309527048640L;
      return new Dimension(x44.a<"k">(this, -8002691723173829023L, var1), x44.a<"k">(this, -8604479344821831686L, var1));
   }

   @Override
   public void paint(Graphics var1) {
      long var2 = a ^ 23272558847365L;
      x44.a<"j">(this, var1, 5992406237893758340L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
