package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _sw implements we {
   private pk T;
   private _8z k;
   private List m;
   private _ur i;
   private _8z P;
   private static final long a = ess.a(-3762036140029732505L, -5228213096929641742L, MethodHandles.lookup().lookupClass()).a(162404218845677L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public final boolean R(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"h">(x44.a<"l">(this, 966365611007473480L, var2), new Object[]{var4}, 1501306545719439839L, var2);
   }

   private final void X(Object[] param1) {
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
      // 00c: getstatic com/zelix/_sw.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 1914985564386
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 102318567383169
      // 01e: lxor
      // 01f: dup2
      // 020: bipush 32
      // 022: lushr
      // 023: l2i
      // 024: istore 6
      // 026: dup2
      // 027: bipush 32
      // 029: lshl
      // 02a: bipush 56
      // 02c: lushr
      // 02d: l2i
      // 02e: istore 7
      // 030: dup2
      // 031: bipush 40
      // 033: lshl
      // 034: bipush 40
      // 036: lushr
      // 037: l2i
      // 038: istore 8
      // 03a: pop2
      // 03b: pop2
      // 03c: ldc2_w 4711743228626066811
      // 03f: lload 2
      // 040: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: bipush 0
      // 046: istore 10
      // 048: astore 9
      // 04a: aload 0
      // 04b: ldc2_w 5182594690286890269
      // 04e: lload 2
      // 04f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: invokeinterface java/util/List.size ()I 1
      // 059: istore 11
      // 05b: bipush 0
      // 05c: istore 12
      // 05e: iload 12
      // 060: iload 11
      // 062: if_icmpge 149
      // 065: aload 0
      // 066: ldc2_w 5182594690286890269
      // 069: lload 2
      // 06a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: iload 12
      // 071: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 076: checkcast com/zelix/kq
      // 079: astore 13
      // 07b: aload 13
      // 07d: lload 4
      // 07f: bipush 1
      // 080: anewarray 377
      // 083: dup_x2
      // 084: dup_x2
      // 085: pop
      // 086: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 089: bipush 0
      // 08a: swap
      // 08b: aastore
      // 08c: ldc2_w 6475139713042620499
      // 08f: lload 2
      // 090: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: astore 14
      // 097: bipush 0
      // 098: istore 15
      // 09a: iload 15
      // 09c: aload 14
      // 09e: invokevirtual java/util/ArrayList.size ()I
      // 0a1: if_icmpge 13b
      // 0a4: new java/lang/StringBuilder
      // 0a7: dup
      // 0a8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ab: sipush 9943
      // 0ae: ldc2_w 14366642438746357
      // 0b1: lload 2
      // 0b2: lxor
      // 0b3: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_sw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: iload 10
      // 0bd: iinc 10 1
      // 0c0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c6: astore 16
      // 0c8: aload 14
      // 0ca: iload 15
      // 0cc: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0cf: checkcast java/util/ArrayList
      // 0d2: astore 17
      // 0d4: bipush 0
      // 0d5: aload 9
      // 0d7: ifnonnull 060
      // 0da: istore 18
      // 0dc: iload 18
      // 0de: aload 17
      // 0e0: invokevirtual java/util/ArrayList.size ()I
      // 0e3: if_icmpge 133
      // 0e6: aload 17
      // 0e8: iload 18
      // 0ea: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0ed: checkcast com/zelix/za
      // 0f0: astore 19
      // 0f2: aload 0
      // 0f3: ldc2_w 6612156405024274692
      // 0f6: lload 2
      // 0f7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: aload 16
      // 0fe: aload 19
      // 100: aload 19
      // 102: iload 6
      // 104: iload 7
      // 106: i2b
      // 107: iload 8
      // 109: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 10c: pop
      // 10d: iinc 18 1
      // 110: aload 9
      // 112: lload 2
      // 113: lconst_0
      // 114: lcmp
      // 115: ifle 138
      // 118: ifnonnull 136
      // 11b: aload 9
      // 11d: ifnull 0dc
      // 120: lload 2
      // 121: lconst_0
      // 122: lcmp
      // 123: ifle 110
      // 126: goto 133
      // 129: ldc2_w 6798832791041992073
      // 12c: lload 2
      // 12d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: iinc 15 1
      // 136: aload 9
      // 138: ifnull 09a
      // 13b: iinc 12 1
      // 13e: aload 9
      // 140: lload 2
      // 141: lconst_0
      // 142: lcmp
      // 143: iflt 076
      // 146: ifnull 05e
      // 149: lload 2
      // 14a: lconst_0
      // 14b: lcmp
      // 14c: ifle 065
      // 14f: return
   }

   public String S(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 0L;
      return x44.a<"h">(x44.a<"l">(this, 9144964067593651400L, var2), new Object[]{var5, var4}, 7224781828631670604L, var2);
   }

   public PrintWriter G(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 82139473225092L;
      return x44.a<"j">(x44.a<"n">(this, -9087234541393202060L, var2), new Object[]{var4}, -7476497660952871154L, var2);
   }

   public _sw(long param1, pk param3, List param4, _ur param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_sw.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 31313670405914
      // 0b: lxor
      // 0c: lstore 6
      // 0e: dup2
      // 0f: ldc2_w 85359375052116
      // 12: lxor
      // 13: lstore 8
      // 15: dup2
      // 16: ldc2_w 60934429267464
      // 19: lxor
      // 1a: lstore 10
      // 1c: dup2
      // 1d: ldc2_w 98085703906827
      // 20: lxor
      // 21: lstore 12
      // 23: pop2
      // 24: aload 0
      // 25: invokespecial java/lang/Object.<init> ()V
      // 28: aload 0
      // 29: new com/zelix/_8z
      // 2c: dup
      // 2d: lload 12
      // 2f: invokespecial com/zelix/_8z.<init> (J)V
      // 32: ldc2_w -6339278520034768191
      // 35: lload 1
      // 36: invokedynamic q (Ljava/lang/Object;Lcom/zelix/_8z;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: ldc2_w -5573702123738091842
      // 3e: lload 1
      // 3f: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: aload 0
      // 45: new com/zelix/_8z
      // 48: dup
      // 49: lload 12
      // 4b: invokespecial com/zelix/_8z.<init> (J)V
      // 4e: ldc2_w -5715504424904313521
      // 51: lload 1
      // 52: invokedynamic q (Ljava/lang/Object;Lcom/zelix/_8z;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: astore 14
      // 59: aload 0
      // 5a: aload 3
      // 5b: ldc2_w -5891986262394776550
      // 5e: lload 1
      // 5f: invokedynamic q (Ljava/lang/Object;Lcom/zelix/pk;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: aload 0
      // 65: aload 4
      // 67: ldc2_w -5464831605568971048
      // 6a: lload 1
      // 6b: invokedynamic q (Ljava/lang/Object;Ljava/util/List;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: aload 0
      // 71: aload 5
      // 73: ldc2_w -5211890046775983556
      // 76: lload 1
      // 77: invokedynamic q (Ljava/lang/Object;Lcom/zelix/_ur;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: aload 14
      // 7e: ifnonnull d0
      // 81: aload 3
      // 82: lload 6
      // 84: bipush 1
      // 85: anewarray 377
      // 88: dup_x2
      // 89: dup_x2
      // 8a: pop
      // 8b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8e: bipush 0
      // 8f: swap
      // 90: aastore
      // 91: ldc2_w -6221178203120189943
      // 94: lload 1
      // 95: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: ifeq e9
      // 9d: goto aa
      // a0: ldc2_w -5936011951698209204
      // a3: lload 1
      // a4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: athrow
      // aa: aload 0
      // ab: lload 8
      // ad: bipush 1
      // ae: anewarray 377
      // b1: dup_x2
      // b2: dup_x2
      // b3: pop
      // b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b7: bipush 0
      // b8: swap
      // b9: aastore
      // ba: ldc2_w -6269955286767667242
      // bd: lload 1
      // be: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: goto d0
      // c6: ldc2_w -5936011951698209204
      // c9: lload 1
      // ca: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf: athrow
      // d0: aload 0
      // d1: lload 10
      // d3: bipush 1
      // d4: anewarray 377
      // d7: dup_x2
      // d8: dup_x2
      // d9: pop
      // da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // dd: bipush 0
      // de: swap
      // df: aastore
      // e0: ldc2_w -5797071357117224834
      // e3: lload 1
      // e4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e9: return
   }

   public final boolean W(Object[] var1) {
      long var2 = (Long)var1[0];
      String var5 = (String)var1[1];
      String var4 = (String)var1[2];
      ff var6 = (ff)var1[3];
      long var7 = var2 ^ 0L;
      return x44.a<"h">(x44.a<"l">(this, -2114018279125215096L, var2), new Object[]{var7, var5, var4, var6}, -1814106828839459601L, var2);
   }

   public final boolean K(Object[] var1) {
      String var3 = (String)var1[0];
      String var2 = (String)var1[1];
      long var4 = (Long)var1[2];
      long var6 = var4 ^ 0L;
      return x44.a<"m">(x44.a<"i">(this, -7163967306285422923L, var4), new Object[]{var3, var2, var6}, -7364926127263320305L, var4);
   }

   public boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(x44.a<"h">(this, 3219391003591743802L, var2), 3659022518899508052L, var2);
   }

   public final boolean m(long var1, short var3, String var4, String var5) {
      long var6 = var1 << 16 | (long)var3 << 48 >>> 48;
      long var8 = (var6 ^ 0L) >>> 16;
      int var10 = (int)((var6 ^ 0L) << 48 >>> 48);
      return x44.a<"k">(x44.a<"o">(this, 1712040263005040099L, var6), var8, (short)var10, var4, var5, 632802147793851175L, var6);
   }

   public final boolean J(Object[] var1) {
      String var6 = (String)var1[0];
      String var2 = (String)var1[1];
      long var3 = (Long)var1[2];
      ff var5 = (ff)var1[3];
      long var7 = var3 ^ 0L;
      return x44.a<"h">(x44.a<"l">(this, 851562853906313712L, var3), new Object[]{var6, var2, var7, var5}, 832102051253339324L, var3);
   }

   public _ug l(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"h">(x44.a<"l">(this, -1132305452491404696L, var2), new Object[]{var4}, -1634954053363179535L, var2);
   }

   public final boolean p(Object[] var1) {
      String var3 = (String)var1[0];
      String var2 = (String)var1[1];
      long var4 = (Long)var1[2];
      ff var6 = (ff)var1[3];
      long var7 = var4 ^ 0L;
      return x44.a<"o">(x44.a<"k">(this, 4100096717637141191L, var4), new Object[]{var3, var2, var7, var6}, 2314543238384756316L, var4);
   }

   public Enumeration h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 36811859486227L;
      return x44.a<"h">(x44.a<"l">(this, -8610565058742488416L, var2), new Object[]{var4}, -8247628641948665135L, var2);
   }

   public Set v(String var1, long var2, Integer var4, boolean var5) {
      long var6 = var2 ^ 0L;
      return x44.a<"i">(this, 7569436271716635437L, var2).v(var1, var6, var4, var5);
   }

   public final boolean f(Object[] var1) {
      long var3 = (Long)var1[0];
      _fz var2 = (_fz)var1[1];
      long var5 = var3 ^ 0L;
      return x44.a<"k">(x44.a<"o">(this, -6448487253672764253L, var3), new Object[]{var5, var2}, -4666448879615921285L, var3);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void s(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 114226545702202L;
      long var6 = var2 ^ 66276722220326L;
      PrintWriter var9 = x44.a<"l">(x44.a<"h">(this, 1251302520872543434L, var2), new Object[]{var4}, 612500178098515888L, var2);
      hk[] var10000 = x44.a<"t">(1463700581073717320L, var2);
      ArrayList var10 = new ArrayList();
      hk[] var8 = var10000;
      Enumeration var11 = x44.a<"l">(x44.a<"h">(this, 1076495943722789943L, var2), new Object[0], 1374472245529425557L, var2);

      label103: {
         label86:
         while (true) {
            if (var11.hasMoreElements()) {
               String var12 = (String)var11.nextElement();

               try {
                  var23 = var10.add(var12);
                  if (var2 <= 0L) {
                     break label103;
                  }
               } catch (gj var19) {
                  boolean var10001 = false;
                  throw x44.a<"t">(var19, 822236828871471290L, var2);
               }

               do {
                  try {
                     if (var8 != null) {
                        break label86;
                     }

                     if (var8 == null) {
                        continue label86;
                     }
                  } catch (gj var18) {
                     boolean var26 = false;
                     throw x44.a<"t">(var18, 822236828871471290L, var2);
                  }
               } while (var2 < 0L);
            }

            Collections.sort(var10);
            var9.println(a<"x">(25190, 7097315678775255414L ^ var2));
            break;
         }

         var23 = 0;
      }

      int var21 = var23;

      while (var21 < var10.size()) {
         String var13 = (String)var10.get(var21);
         var9.println(a<"x">(32148, 4137633111457414787L ^ var2) + var13 + "\"");
         Map var14 = x44.a<"h">(this, 1076495943722789943L, var2).D(var13);
         Iterator var15 = var14.keySet().iterator();

         label61: {
            label60:
            while (true) {
               if (var15.hasNext()) {
                  try {
                     var9.println(
                        a<"x">(11662, 5229045486378643091L ^ var2) + x44.a<"l">((za)var15.next(), new Object[]{var6}, 832322118817335218L, var2) + "\""
                     );
                  } catch (gj var16) {
                     boolean var27 = false;
                     throw x44.a<"t">(var16, 822236828871471290L, var2);
                  }

                  do {
                     try {
                        var10000 = var8;
                        if (var2 < 0L) {
                           break label61;
                        }

                        if (var8 != null) {
                           break label60;
                        }

                        if (var8 == null) {
                           continue label60;
                        }
                     } catch (gj var17) {
                        boolean var28 = false;
                        throw x44.a<"t">(var17, 822236828871471290L, var2);
                     }
                  } while (var2 < 0L);
               }

               var21++;
               break;
            }

            var10000 = var8;
         }

         if (var10000 != null) {
            break;
         }
      }
   }

   public final boolean h(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"m">(x44.a<"i">(this, -523467652254006627L, var2), new Object[]{var4}, -49760976617909117L, var2);
   }

   public final boolean l(String var1, String var2, long var3) {
      long var5 = var3 ^ 0L;
      return x44.a<"j">(x44.a<"n">(this, 615672231392703146L, var3), var1, var2, var5, 1202372406956122086L, var3);
   }

   public final boolean A(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"k">(x44.a<"o">(this, 3069783806886334651L, var2), new Object[]{var4}, 3928460513411325038L, var2);
   }

   private final void Q(Object[] param1) {
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
      // 00c: getstatic com/zelix/_sw.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 74173308212080
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 20657616210207
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 133414861111130
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 43227720604466
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 135853762902423
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 43738972052445
      // 03a: lxor
      // 03b: dup2
      // 03c: bipush 32
      // 03e: lushr
      // 03f: l2i
      // 040: istore 14
      // 042: dup2
      // 043: bipush 32
      // 045: lshl
      // 046: bipush 56
      // 048: lushr
      // 049: l2i
      // 04a: istore 15
      // 04c: dup2
      // 04d: bipush 40
      // 04f: lshl
      // 050: bipush 40
      // 052: lushr
      // 053: l2i
      // 054: istore 16
      // 056: pop2
      // 057: dup2
      // 058: ldc2_w 38233084355693
      // 05b: lxor
      // 05c: lstore 17
      // 05e: pop2
      // 05f: ldc2_w -414609026360056281
      // 062: lload 2
      // 063: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: new java/util/ArrayList
      // 06b: dup
      // 06c: invokespecial java/util/ArrayList.<init> ()V
      // 06f: astore 20
      // 071: astore 19
      // 073: aload 0
      // 074: ldc2_w -2260978542777793960
      // 077: lload 2
      // 078: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: bipush 0
      // 07e: anewarray 377
      // 081: ldc2_w -181265914519889670
      // 084: lload 2
      // 085: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: astore 21
      // 08c: aload 21
      // 08e: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 093: ifeq 0cd
      // 096: aload 21
      // 098: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 09d: checkcast java/lang/String
      // 0a0: astore 22
      // 0a2: aload 20
      // 0a4: aload 22
      // 0a6: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0a9: lload 2
      // 0aa: lconst_0
      // 0ab: lcmp
      // 0ac: iflt 0d3
      // 0af: pop
      // 0b0: aload 19
      // 0b2: ifnonnull 0d2
      // 0b5: aload 19
      // 0b7: ifnull 08c
      // 0ba: lload 2
      // 0bb: lconst_0
      // 0bc: lcmp
      // 0bd: iflt 0b0
      // 0c0: goto 0cd
      // 0c3: ldc2_w -1943808258822283563
      // 0c6: lload 2
      // 0c7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 20
      // 0cf: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 0d2: bipush 0
      // 0d3: istore 22
      // 0d5: iload 22
      // 0d7: aload 20
      // 0d9: invokevirtual java/util/ArrayList.size ()I
      // 0dc: if_icmpge 3fd
      // 0df: aload 20
      // 0e1: iload 22
      // 0e3: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0e6: checkcast java/lang/String
      // 0e9: astore 23
      // 0eb: aload 0
      // 0ec: ldc2_w -2260978542777793960
      // 0ef: lload 2
      // 0f0: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: aload 23
      // 0f7: invokevirtual com/zelix/_8z.D (Ljava/lang/Object;)Ljava/util/Map;
      // 0fa: astore 24
      // 0fc: aload 24
      // 0fe: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 103: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 108: astore 25
      // 10a: aload 25
      // 10c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 111: ifeq 3ef
      // 114: aload 25
      // 116: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 11b: checkcast com/zelix/za
      // 11e: astore 26
      // 120: aload 26
      // 122: lload 10
      // 124: bipush 1
      // 125: anewarray 377
      // 128: dup_x2
      // 129: dup_x2
      // 12a: pop
      // 12b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12e: bipush 0
      // 12f: swap
      // 130: aastore
      // 131: ldc2_w -1815800733708000445
      // 134: lload 2
      // 135: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: aload 19
      // 13c: ifnonnull 0d7
      // 13f: aload 19
      // 141: lload 2
      // 142: lconst_0
      // 143: lcmp
      // 144: ifle 13c
      // 147: lload 2
      // 148: lconst_0
      // 149: lcmp
      // 14a: ifle 1f3
      // 14d: ifnonnull 1eb
      // 150: ifne 1d7
      // 153: goto 160
      // 156: ldc2_w -1943808258822283563
      // 159: lload 2
      // 15a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: aload 0
      // 161: ldc2_w -57810505818617179
      // 164: lload 2
      // 165: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: new java/lang/StringBuilder
      // 16d: dup
      // 16e: invokespecial java/lang/StringBuilder.<init> ()V
      // 171: sipush 3090
      // 174: ldc2_w 7141050145228398945
      // 177: lload 2
      // 178: lxor
      // 179: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_sw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 181: aload 26
      // 183: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 186: sipush 31696
      // 189: ldc2_w 2765903375510296233
      // 18c: lload 2
      // 18d: lxor
      // 18e: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_sw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 196: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 199: bipush 1
      // 19a: lload 12
      // 19c: bipush 3
      // 19d: anewarray 377
      // 1a0: dup_x2
      // 1a1: dup_x2
      // 1a2: pop
      // 1a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a6: bipush 2
      // 1a7: swap
      // 1a8: aastore
      // 1a9: dup_x1
      // 1aa: swap
      // 1ab: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1ae: bipush 1
      // 1af: swap
      // 1b0: aastore
      // 1b1: dup_x1
      // 1b2: swap
      // 1b3: bipush 0
      // 1b4: swap
      // 1b5: aastore
      // 1b6: ldc2_w -531345296538898830
      // 1b9: lload 2
      // 1ba: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: aload 19
      // 1c1: lload 2
      // 1c2: lconst_0
      // 1c3: lcmp
      // 1c4: iflt 3ec
      // 1c7: ifnull 3e4
      // 1ca: goto 1d7
      // 1cd: ldc2_w -1943808258822283563
      // 1d0: lload 2
      // 1d1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: aload 26
      // 1d9: lload 4
      // 1db: invokevirtual com/zelix/za.M (J)Z
      // 1de: goto 1eb
      // 1e1: ldc2_w -1943808258822283563
      // 1e4: lload 2
      // 1e5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: athrow
      // 1eb: lload 2
      // 1ec: lconst_0
      // 1ed: lcmp
      // 1ee: iflt 2a4
      // 1f1: aload 19
      // 1f3: ifnonnull 2a4
      // 1f6: ifeq 27d
      // 1f9: goto 206
      // 1fc: ldc2_w -1943808258822283563
      // 1ff: lload 2
      // 200: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: athrow
      // 206: aload 0
      // 207: ldc2_w -57810505818617179
      // 20a: lload 2
      // 20b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: new java/lang/StringBuilder
      // 213: dup
      // 214: invokespecial java/lang/StringBuilder.<init> ()V
      // 217: sipush 7001
      // 21a: ldc2_w 7248592019578074659
      // 21d: lload 2
      // 21e: lxor
      // 21f: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_sw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 227: aload 26
      // 229: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 22c: sipush 15811
      // 22f: ldc2_w 7506864880172142783
      // 232: lload 2
      // 233: lxor
      // 234: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_sw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 23f: bipush 1
      // 240: lload 12
      // 242: bipush 3
      // 243: anewarray 377
      // 246: dup_x2
      // 247: dup_x2
      // 248: pop
      // 249: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24c: bipush 2
      // 24d: swap
      // 24e: aastore
      // 24f: dup_x1
      // 250: swap
      // 251: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 254: bipush 1
      // 255: swap
      // 256: aastore
      // 257: dup_x1
      // 258: swap
      // 259: bipush 0
      // 25a: swap
      // 25b: aastore
      // 25c: ldc2_w -531345296538898830
      // 25f: lload 2
      // 260: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: aload 19
      // 267: lload 2
      // 268: lconst_0
      // 269: lcmp
      // 26a: iflt 3ec
      // 26d: ifnull 3e4
      // 270: goto 27d
      // 273: ldc2_w -1943808258822283563
      // 276: lload 2
      // 277: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: athrow
      // 27d: aload 26
      // 27f: lload 6
      // 281: bipush 1
      // 282: anewarray 377
      // 285: dup_x2
      // 286: dup_x2
      // 287: pop
      // 288: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28b: bipush 0
      // 28c: swap
      // 28d: aastore
      // 28e: ldc2_w -2139994960411149219
      // 291: lload 2
      // 292: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: goto 2a4
      // 29a: ldc2_w -1943808258822283563
      // 29d: lload 2
      // 29e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: athrow
      // 2a4: ifeq 328
      // 2a7: aload 0
      // 2a8: ldc2_w -57810505818617179
      // 2ab: lload 2
      // 2ac: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b1: new java/lang/StringBuilder
      // 2b4: dup
      // 2b5: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b8: sipush 7001
      // 2bb: ldc2_w 7248592019578074659
      // 2be: lload 2
      // 2bf: lxor
      // 2c0: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_sw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c8: aload 26
      // 2ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2cd: sipush 5319
      // 2d0: ldc2_w 8459389542906149308
      // 2d3: lload 2
      // 2d4: lxor
      // 2d5: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_sw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2dd: ldc "+"
      // 2df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e2: sipush 26659
      // 2e5: ldc2_w 2689600104085308766
      // 2e8: lload 2
      // 2e9: lxor
      // 2ea: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_sw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f5: bipush 1
      // 2f6: lload 12
      // 2f8: bipush 3
      // 2f9: anewarray 377
      // 2fc: dup_x2
      // 2fd: dup_x2
      // 2fe: pop
      // 2ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 302: bipush 2
      // 303: swap
      // 304: aastore
      // 305: dup_x1
      // 306: swap
      // 307: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 30a: bipush 1
      // 30b: swap
      // 30c: aastore
      // 30d: dup_x1
      // 30e: swap
      // 30f: bipush 0
      // 310: swap
      // 311: aastore
      // 312: ldc2_w -531345296538898830
      // 315: lload 2
      // 316: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31b: goto 328
      // 31e: ldc2_w -1943808258822283563
      // 321: lload 2
      // 322: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 327: athrow
      // 328: lload 8
      // 32a: bipush 1
      // 32b: anewarray 377
      // 32e: dup_x2
      // 32f: dup_x2
      // 330: pop
      // 331: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 334: bipush 0
      // 335: swap
      // 336: aastore
      // 337: ldc2_w -45417979065436526
      // 33a: lload 2
      // 33b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 340: astore 27
      // 342: aload 26
      // 344: aload 0
      // 345: lload 17
      // 347: aload 27
      // 349: bipush 3
      // 34a: anewarray 377
      // 34d: dup_x1
      // 34e: swap
      // 34f: bipush 2
      // 350: swap
      // 351: aastore
      // 352: dup_x2
      // 353: dup_x2
      // 354: pop
      // 355: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 358: bipush 1
      // 359: swap
      // 35a: aastore
      // 35b: dup_x1
      // 35c: swap
      // 35d: bipush 0
      // 35e: swap
      // 35f: aastore
      // 360: ldc2_w -1768419144974321894
      // 363: lload 2
      // 364: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 369: aload 27
      // 36b: aload 19
      // 36d: ifnonnull 398
      // 370: ldc2_w -91291485848947431
      // 373: lload 2
      // 374: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 379: ifle 3e4
      // 37c: goto 389
      // 37f: ldc2_w -1943808258822283563
      // 382: lload 2
      // 383: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 388: athrow
      // 389: aload 27
      // 38b: goto 398
      // 38e: ldc2_w -1943808258822283563
      // 391: lload 2
      // 392: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 397: athrow
      // 398: ldc2_w -2211205984560521701
      // 39b: lload 2
      // 39c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a1: astore 28
      // 3a3: aload 28
      // 3a5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3aa: ifeq 3e4
      // 3ad: aload 28
      // 3af: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3b4: checkcast com/zelix/hy
      // 3b7: astore 29
      // 3b9: aload 0
      // 3ba: ldc2_w -560896913813733930
      // 3bd: lload 2
      // 3be: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c3: aload 23
      // 3c5: aload 29
      // 3c7: aload 29
      // 3c9: iload 14
      // 3cb: iload 15
      // 3cd: i2b
      // 3ce: iload 16
      // 3d0: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 3d3: pop
      // 3d4: aload 19
      // 3d6: ifnonnull 10a
      // 3d9: aload 19
      // 3db: lload 2
      // 3dc: lconst_0
      // 3dd: lcmp
      // 3de: ifle 11b
      // 3e1: ifnull 3a3
      // 3e4: aload 19
      // 3e6: lload 2
      // 3e7: lconst_0
      // 3e8: lcmp
      // 3e9: ifle 3fa
      // 3ec: ifnull 10a
      // 3ef: iinc 22 1
      // 3f2: aload 19
      // 3f4: lload 2
      // 3f5: lconst_0
      // 3f6: lcmp
      // 3f7: iflt 11b
      // 3fa: ifnull 0d5
      // 3fd: lload 2
      // 3fe: lconst_0
      // 3ff: lcmp
      // 400: ifle 0df
      // 403: return
   }

   public final boolean H(Object[] var1) {
      long var4 = (Long)var1[0];
      String var3 = (String)var1[1];
      String var2 = (String)var1[2];
      long var6 = var4 ^ 0L;
      return x44.a<"l">(x44.a<"h">(this, -1880965139580510268L, var4), new Object[]{var6, var3, var2}, -2008856326519406261L, var4);
   }

   public q2 X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var10001 = var2 ^ 73980699055298L;
      int var4 = (int)((var2 ^ 73980699055298L) >>> 32);
      int var5 = (int)((var2 ^ 73980699055298L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return new q2(x44.a<"n">(this, 1521760922727223551L, var2), var4, var5, var6);
   }

   public final boolean M(Object[] var1) {
      String var6 = (String)var1[0];
      String var2 = (String)var1[1];
      ff var5 = (ff)var1[2];
      long var3 = (Long)var1[3];
      long var7 = var3 ^ 0L;
      return x44.a<"h">(x44.a<"l">(this, -6577141136495845736L, var3), new Object[]{var6, var2, var5, var7}, -6875044827797087326L, var3);
   }

   static {
      long var0 = a ^ 110926823573862L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "\u0097vLÍô»Ä\u0002\u0016ç\u0080eM¸Òb\u0001KÞ¸\u0090P\u0095*s¾Ú\u001dÞ/hÉ\u0005º\u0094\u008ey<\u0089\u008eôIØÁ\u0089*Õ\rß\u000e¾ÁÄ\u0081¿\u0092\u0007þÄÑ¿\u0089Æ\u0080\u0002¹0\u0012\u0096¯O\u0017\u0087\u0013°fð\fDð 4ÅcoíÐà3P\u0083é2\u0080Zu\u009c~QP\u0086ÍxfÚúnUZaËvû\u0090\u009e\u0012J~Q\u008e\u0006+ÆntpéêË\u001b\u00adGÜ\u0014V\u0007ÿÚØX\u009f,¿¿9¥Þ?\u008b\u009cÙ\"Èz\u0088\u0086yFYP)8\f+\u0010ÆÏÀ^\u0004Cºð\u008bí\u0082\u00adw\u008cjv\u0000î1hQ\u0096'£s\u0017JV\u000bëßÍ\u0088ÿ\u00952\u009f\u0088z oEÊ\u008a\u0010aù\u008e5VÝ¡÷\u001e6Ü8Þ\u009eð\u009aü=²C}Êþ\u0096\u0089dÙÝl\u0011¯\u009c\u0002äm¢ì\u0099ý1F1\u009f½\u0019³M\\\u0010ôÎ«K·ô#\u000b4}¶¯D\u008cdµ(fýÉ\u0086\u008c\u0002½@5äßT\u009d\u009c\u0098îlÒã\tfõÍz1Å1&[Än²y\u008aQR¸\u008e\u000f\u0011 (\u0085|\u0013^§ÁÆm\u0012L\u0014éFN:g¬¨ï\u000bm\u0019Ë(0à\u0099|ü2÷8\u0015Ì{\u0013 ãËVZl\u008d\u000f½\u008b&\u008d§\u0094ò\tÞ-Ûx.%\u0013Ò¹\u008eu\u0012#\u008d÷\u0088\u000e'Öâ\u008e8ýÉ¦\u0098\u0011áÂ\u0011\nh¥PÆQ\u0088\u0097ð\u009aÔm\u008d\u0089£^¹·Ê\u0019\t-ê\u0016Ië\u0004lÙ:\u001b2Ù±Ò\u0089ÿm\"\u0014\u0007¨\u0016\u0004ÓvK|T\u0015?\u0088\u0005¢Ì\u0016@\u000e k§6\u0000\bñÖeìý8AG8mê\"\u008aÕ9~¯\u0004¹ £ä\u0091Q×\u0092d.[\u0097½\u0087\u001duã\u0010bá\u001d\u009bÿiB\u0005CóC\u0005#9*f6Ø\u001abý!ÅF/\"\u009fõ£[¯RP¬Í1ÞfÐ\u009bÙS~";
      int var8 = "\u0097vLÍô»Ä\u0002\u0016ç\u0080eM¸Òb\u0001KÞ¸\u0090P\u0095*s¾Ú\u001dÞ/hÉ\u0005º\u0094\u008ey<\u0089\u008eôIØÁ\u0089*Õ\rß\u000e¾ÁÄ\u0081¿\u0092\u0007þÄÑ¿\u0089Æ\u0080\u0002¹0\u0012\u0096¯O\u0017\u0087\u0013°fð\fDð 4ÅcoíÐà3P\u0083é2\u0080Zu\u009c~QP\u0086ÍxfÚúnUZaËvû\u0090\u009e\u0012J~Q\u008e\u0006+ÆntpéêË\u001b\u00adGÜ\u0014V\u0007ÿÚØX\u009f,¿¿9¥Þ?\u008b\u009cÙ\"Èz\u0088\u0086yFYP)8\f+\u0010ÆÏÀ^\u0004Cºð\u008bí\u0082\u00adw\u008cjv\u0000î1hQ\u0096'£s\u0017JV\u000bëßÍ\u0088ÿ\u00952\u009f\u0088z oEÊ\u008a\u0010aù\u008e5VÝ¡÷\u001e6Ü8Þ\u009eð\u009aü=²C}Êþ\u0096\u0089dÙÝl\u0011¯\u009c\u0002äm¢ì\u0099ý1F1\u009f½\u0019³M\\\u0010ôÎ«K·ô#\u000b4}¶¯D\u008cdµ(fýÉ\u0086\u008c\u0002½@5äßT\u009d\u009c\u0098îlÒã\tfõÍz1Å1&[Än²y\u008aQR¸\u008e\u000f\u0011 (\u0085|\u0013^§ÁÆm\u0012L\u0014éFN:g¬¨ï\u000bm\u0019Ë(0à\u0099|ü2÷8\u0015Ì{\u0013 ãËVZl\u008d\u000f½\u008b&\u008d§\u0094ò\tÞ-Ûx.%\u0013Ò¹\u008eu\u0012#\u008d÷\u0088\u000e'Öâ\u008e8ýÉ¦\u0098\u0011áÂ\u0011\nh¥PÆQ\u0088\u0097ð\u009aÔm\u008d\u0089£^¹·Ê\u0019\t-ê\u0016Ië\u0004lÙ:\u001b2Ù±Ò\u0089ÿm\"\u0014\u0007¨\u0016\u0004ÓvK|T\u0015?\u0088\u0005¢Ì\u0016@\u000e k§6\u0000\bñÖeìý8AG8mê\"\u008aÕ9~¯\u0004¹ £ä\u0091Q×\u0092d.[\u0097½\u0087\u001duã\u0010bá\u001d\u009bÿiB\u0005CóC\u0005#9*f6Ø\u001abý!ÅF/\"\u009fõ£[¯RP¬Í1ÞfÐ\u009bÙS~"
         .length();
      char var5 = 'P';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[10];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "GÍ#¿\u0019\u009aÇ\u0097Uÿ»PùÀ)\u000e{Éc\u009d\u008f.\u008f \u0010K\u0018Ð\u0004û9Ràí{ÏÀA\u0082$ç";
                  var8 = "GÍ#¿\u0019\u009aÇ\u0097Uÿ»PùÀ)\u000e{Éc\u009d\u008f.\u008f \u0010K\u0018Ð\u0004û9Ràí{ÏÀA\u0082$ç".length();
                  var5 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24115;
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
            throw new RuntimeException("com/zelix/_sw", var10);
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
         throw new RuntimeException("com/zelix/_sw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
