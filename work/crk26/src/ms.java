package com.zelix;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ms extends JComboBox implements ItemListener, PropertyChangeListener, uk {
   private File[] J;
   private File W;
   boolean T;
   private ArrayList l;
   private DefaultComboBoxModel p;
   private static final long a = prr.a(9010682137649546385L, 2535884008412673545L, MethodHandles.lookup().lookupClass()).a(200798629192235L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   void w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 18265309942966L;
      int[] var10000 = m44.a<"l">(2962542702164356506L, var2);
      m44.a<"p">(this, m44.a<"l">(3116341791171330669L, var2), 3250284573045946457L, var2);
      m44.a<"p">(this, new DefaultComboBoxModel(), 3031197399650213842L, var2);
      int[] var6 = var10000;
      m44.a<"s">(this, m44.a<"r">(this, 3031197399650213842L, var2), 4021724486826619531L, var2);
      int var7 = 0;

      label41:
      while (var7 < m44.a<"r">(this, 3250284573045946457L, var2).length) {
         try {
            m44.a<"s">(m44.a<"r">(this, 3031197399650213842L, var2), m44.a<"r">(this, 3250284573045946457L, var2)[var7], 3755056949873156353L, var2);
            var7++;
         } catch (n9 var9) {
            boolean var10001 = false;
            throw m44.a<"l">(var9, 2894553370839322849L, var2);
         }

         while (true) {
            try {
               var10000 = var6;
               if (var2 > 0L) {
                  if (var6 != null) {
                     return;
                  }

                  var10000 = var6;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (n9 var8) {
               boolean var13 = false;
               throw m44.a<"l">(var8, 2894553370839322849L, var2);
            }

            if (var2 >= 0L) {
               break label41;
            }
         }
      }

      m44.a<"s">(this, new tq(this, var4), 3395434404697558655L, var2);
      m44.a<"s">(this, a<"g">(16476, 4790658296432714313L ^ var2), 3605287761652799244L, var2);
   }

   @Override
   public void itemStateChanged(ItemEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ms.a J
      // 003: ldc2_w 109811891655326
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w 7132085880086718077
      // 00b: lload 2
      // 00c: invokedynamic k (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: astore 4
      // 013: aload 1
      // 014: ldc2_w 6936073787257139446
      // 017: lload 2
      // 018: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01d: aload 4
      // 01f: ifnonnull 05c
      // 022: bipush 1
      // 023: if_icmpne 10a
      // 026: goto 033
      // 029: ldc2_w 7191358285302389510
      // 02c: lload 2
      // 02d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: athrow
      // 033: aload 0
      // 034: aload 4
      // 036: ifnonnull 076
      // 039: goto 046
      // 03c: ldc2_w 7191358285302389510
      // 03f: lload 2
      // 040: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: athrow
      // 046: ldc2_w 8828088885011009130
      // 049: lload 2
      // 04a: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: goto 05c
      // 052: ldc2_w 7191358285302389510
      // 055: lload 2
      // 056: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: ifne 10a
      // 05f: aload 0
      // 060: ldc2_w 7256109992849990464
      // 063: lload 2
      // 064: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: goto 076
      // 06c: ldc2_w 7191358285302389510
      // 06f: lload 2
      // 070: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: checkcast java/io/File
      // 079: astore 5
      // 07b: aload 4
      // 07d: ifnonnull 0ff
      // 080: aload 5
      // 082: ldc2_w 9067898791921022991
      // 085: lload 2
      // 086: invokedynamic t (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: ifeq 0d3
      // 08e: goto 09b
      // 091: ldc2_w 7191358285302389510
      // 094: lload 2
      // 095: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: aload 0
      // 09c: aload 5
      // 09e: ldc2_w 6964227093747399978
      // 0a1: lload 2
      // 0a2: invokedynamic w (Ljava/lang/Object;Ljava/io/File;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: aload 0
      // 0a8: sipush 17065
      // 0ab: ldc2_w 2680104678984199001
      // 0ae: lload 2
      // 0af: lxor
      // 0b0: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/ms.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: aconst_null
      // 0b6: aload 5
      // 0b8: ldc2_w 7032909770896512994
      // 0bb: lload 2
      // 0bc: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: aload 4
      // 0c3: ifnull 10a
      // 0c6: goto 0d3
      // 0c9: ldc2_w 7191358285302389510
      // 0cc: lload 2
      // 0cd: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: bipush 1
      // 0d5: ldc2_w 8828088885011009130
      // 0d8: lload 2
      // 0d9: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: aload 0
      // 0df: aload 0
      // 0e0: ldc2_w 6964227093747399978
      // 0e3: lload 2
      // 0e4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: ldc2_w 7365804398177773614
      // 0ec: lload 2
      // 0ed: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: goto 0ff
      // 0f5: ldc2_w 7191358285302389510
      // 0f8: lload 2
      // 0f9: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: aload 0
      // 100: bipush 0
      // 101: ldc2_w 8828088885011009130
      // 104: lload 2
      // 105: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: return
   }

   @Override
   public void propertyChange(PropertyChangeEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ms.a J
      // 03: ldc2_w 59948085139140
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 64553560978463
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w -1828436124029197785
      // 14: lload 2
      // 15: invokedynamic i (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 6
      // 1e: ifnonnull 8e
      // 21: aload 1
      // 22: ldc2_w -472310022877719386
      // 25: lload 2
      // 26: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: sipush 25163
      // 2e: ldc2_w 2623682203364462562
      // 31: lload 2
      // 32: lxor
      // 33: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/ms.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3b: ifeq 99
      // 3e: goto 4b
      // 41: ldc2_w -1759074465295605924
      // 44: lload 2
      // 45: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 0
      // 4c: bipush 1
      // 4d: ldc2_w -82761017507100112
      // 50: lload 2
      // 51: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: aload 0
      // 57: aload 1
      // 58: ldc2_w -12302415996062654
      // 5b: lload 2
      // 5c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: checkcast java/io/File
      // 64: lload 4
      // 66: bipush 2
      // 67: anewarray 146
      // 6a: dup_x2
      // 6b: dup_x2
      // 6c: pop
      // 6d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 70: bipush 1
      // 71: swap
      // 72: aastore
      // 73: dup_x1
      // 74: swap
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: ldc2_w -450712370117082982
      // 7b: lload 2
      // 7c: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: goto 8e
      // 84: ldc2_w -1759074465295605924
      // 87: lload 2
      // 88: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: aload 0
      // 8f: bipush 0
      // 90: ldc2_w -82761017507100112
      // 93: lload 2
      // 94: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: return
   }

   public ms(int var1, File var2, int var3, byte var4) {
      long var5 = ((long)var1 << 32 | (long)var3 << 40 >>> 32 | (long)var4 << 56 >>> 56) ^ a;
      long var7 = var5 ^ 97580141736005L;
      long var9 = var5 ^ 48828116612829L;
      super();
      m44.a<"t">(this, new Object[]{var7}, 7144365350236011228L, var5);
      m44.a<"t">(this, new Object[]{var2, var9}, 8898173478668436056L, var5);
      m44.a<"t">(this, this, 7204506859050992485L, var5);
   }

   public void j(Object[] param1) {
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
      // 004: checkcast java/io/File
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/ms.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: ldc2_w -1187432755574969598
      // 01c: lload 3
      // 01d: invokedynamic l (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: aload 0
      // 023: aload 2
      // 024: ldc2_w -1307519685673521067
      // 027: lload 3
      // 028: invokedynamic p (Ljava/lang/Object;Ljava/io/File;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 0
      // 02e: new java/util/ArrayList
      // 031: dup
      // 032: invokespecial java/util/ArrayList.<init> ()V
      // 035: ldc2_w -792970665754298767
      // 038: lload 3
      // 039: invokedynamic p (Ljava/lang/Object;Ljava/util/ArrayList;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: aload 0
      // 03f: ldc2_w -1307519685673521067
      // 042: lload 3
      // 043: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: ldc2_w -669871605240924341
      // 04b: lload 3
      // 04c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: astore 6
      // 053: astore 5
      // 055: aload 6
      // 057: ifnull 09a
      // 05a: aload 0
      // 05b: ldc2_w -792970665754298767
      // 05e: lload 3
      // 05f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: aload 6
      // 066: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 069: pop
      // 06a: aload 6
      // 06c: ldc2_w -669871605240924341
      // 06f: lload 3
      // 070: invokedynamic s (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: astore 6
      // 077: aload 5
      // 079: lload 3
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: ifle 084
      // 07f: ifnonnull 0a7
      // 082: aload 5
      // 084: ifnull 055
      // 087: lload 3
      // 088: lconst_0
      // 089: lcmp
      // 08a: iflt 077
      // 08d: goto 09a
      // 090: ldc2_w -1246388637001755015
      // 093: lload 3
      // 094: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: aload 0
      // 09b: ldc2_w -792970665754298767
      // 09e: lload 3
      // 09f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: invokestatic java/util/Collections.reverse (Ljava/util/List;)V
      // 0a7: aconst_null
      // 0a8: astore 7
      // 0aa: aload 0
      // 0ab: ldc2_w -792970665754298767
      // 0ae: lload 3
      // 0af: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: aload 5
      // 0b6: ifnonnull 0e7
      // 0b9: invokevirtual java/util/ArrayList.size ()I
      // 0bc: ifle 0ec
      // 0bf: goto 0cc
      // 0c2: ldc2_w -1246388637001755015
      // 0c5: lload 3
      // 0c6: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: ldc2_w -792970665754298767
      // 0d0: lload 3
      // 0d1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: bipush 0
      // 0d7: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0da: goto 0e7
      // 0dd: ldc2_w -1246388637001755015
      // 0e0: lload 3
      // 0e1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: checkcast java/io/File
      // 0ea: astore 7
      // 0ec: new javax/swing/DefaultComboBoxModel
      // 0ef: dup
      // 0f0: invokespecial javax/swing/DefaultComboBoxModel.<init> ()V
      // 0f3: astore 8
      // 0f5: bipush 0
      // 0f6: istore 9
      // 0f8: iload 9
      // 0fa: aload 0
      // 0fb: ldc2_w -1476300732520907071
      // 0fe: lload 3
      // 0ff: invokedynamic r (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: arraylength
      // 105: if_icmpge 1fb
      // 108: aload 8
      // 10a: aload 0
      // 10b: ldc2_w -1476300732520907071
      // 10e: lload 3
      // 10f: invokedynamic r (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: iload 9
      // 116: aaload
      // 117: ldc2_w -971422158500010087
      // 11a: lload 3
      // 11b: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: aload 5
      // 122: lload 3
      // 123: lconst_0
      // 124: lcmp
      // 125: iflt 12d
      // 128: ifnonnull 235
      // 12b: aload 5
      // 12d: lload 3
      // 12e: lconst_0
      // 12f: lcmp
      // 130: iflt 1f8
      // 133: ifnonnull 1f6
      // 136: goto 143
      // 139: ldc2_w -1246388637001755015
      // 13c: lload 3
      // 13d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: aload 7
      // 145: ifnull 1f3
      // 148: goto 155
      // 14b: ldc2_w -1246388637001755015
      // 14e: lload 3
      // 14f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aload 7
      // 157: aload 0
      // 158: ldc2_w -1476300732520907071
      // 15b: lload 3
      // 15c: invokedynamic r (Ljava/lang/Object;JJ)[Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: iload 9
      // 163: aaload
      // 164: invokevirtual java/io/File.equals (Ljava/lang/Object;)Z
      // 167: aload 5
      // 169: ifnonnull 18a
      // 16c: goto 179
      // 16f: ldc2_w -1246388637001755015
      // 172: lload 3
      // 173: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: ifeq 1f3
      // 17c: goto 189
      // 17f: ldc2_w -1246388637001755015
      // 182: lload 3
      // 183: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: bipush 1
      // 18a: istore 10
      // 18c: iload 10
      // 18e: aload 0
      // 18f: ldc2_w -792970665754298767
      // 192: lload 3
      // 193: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: invokevirtual java/util/ArrayList.size ()I
      // 19b: if_icmpge 1de
      // 19e: aload 8
      // 1a0: aload 0
      // 1a1: ldc2_w -792970665754298767
      // 1a4: lload 3
      // 1a5: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: iload 10
      // 1ac: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 1af: ldc2_w -971422158500010087
      // 1b2: lload 3
      // 1b3: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: iinc 10 1
      // 1bb: aload 5
      // 1bd: lload 3
      // 1be: lconst_0
      // 1bf: lcmp
      // 1c0: iflt 1c8
      // 1c3: ifnonnull 1f6
      // 1c6: aload 5
      // 1c8: ifnull 18c
      // 1cb: lload 3
      // 1cc: lconst_0
      // 1cd: lcmp
      // 1ce: iflt 1bb
      // 1d1: goto 1de
      // 1d4: ldc2_w -1246388637001755015
      // 1d7: lload 3
      // 1d8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: athrow
      // 1de: aload 8
      // 1e0: aload 0
      // 1e1: ldc2_w -1307519685673521067
      // 1e4: lload 3
      // 1e5: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: ldc2_w -971422158500010087
      // 1ed: lload 3
      // 1ee: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: iinc 9 1
      // 1f6: aload 5
      // 1f8: ifnull 0f8
      // 1fb: aload 0
      // 1fc: aload 8
      // 1fe: ldc2_w -1402716052783507126
      // 201: lload 3
      // 202: invokedynamic p (Ljava/lang/Object;Ljavax/swing/DefaultComboBoxModel;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: aload 0
      // 208: aload 0
      // 209: ldc2_w -1402716052783507126
      // 20c: lload 3
      // 20d: invokedynamic r (Ljava/lang/Object;JJ)Ljavax/swing/DefaultComboBoxModel; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: ldc2_w -1060459397807950829
      // 215: lload 3
      // 216: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: aload 0
      // 21c: aload 0
      // 21d: ldc2_w -1307519685673521067
      // 220: lload 3
      // 221: invokedynamic r (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: ldc2_w -1493015353657465519
      // 229: lload 3
      // 22a: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: lload 3
      // 230: lconst_0
      // 231: lcmp
      // 232: iflt 120
      // 235: return
   }

   static {
      long var0 = a ^ 13907460627049L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\b\u0011\ru6¿\u0093=\b%¢\u008b$¨¢Ý\u0083\u001a¢z\u0086\"ãç\u0081-Úà\u008e\u0092^ô^Ï\u001d\u0019\u000f6NðÁU¦\u001dµb\u00150\u0085\u0005óÄ\u0090\u0003\u0089\u008d(Õ\u0002\u0017\n§\u0098oª7TU\u00053õ¸\u008d<\u009eí|öÈ\u007f*O{¨Zãû\fÑ¹eª\u0000Ý¸\u0087$(å³¤Un\u000bèÁÍÂ¶i\u0098ª\u001c\u0082M\u001b\u008d\f\u0005F³\u0003\u001du\n)\u009c$%\u0004E\u0007ÇXºgrÄ";
      int var8 = "\b\u0011\ru6¿\u0093=\b%¢\u008b$¨¢Ý\u0083\u001a¢z\u0086\"ãç\u0081-Úà\u008e\u0092^ô^Ï\u001d\u0019\u000f6NðÁU¦\u001dµb\u00150\u0085\u0005óÄ\u0090\u0003\u0089\u008d(Õ\u0002\u0017\n§\u0098oª7TU\u00053õ¸\u008d<\u009eí|öÈ\u007f*O{¨Zãû\fÑ¹eª\u0000Ý¸\u0087$(å³¤Un\u000bèÁÍÂ¶i\u0098ª\u001c\u0082M\u001b\u008d\f\u0005F³\u0003\u001du\n)\u009c$%\u0004E\u0007ÇXºgrÄ"
         .length();
      char var5 = '8';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1622;
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
            throw new RuntimeException("com/zelix/ms", var10);
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
         throw new RuntimeException("com/zelix/ms" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
