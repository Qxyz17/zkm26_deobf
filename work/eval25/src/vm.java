package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vm {
   private Set s;
   private _8s g;
   private static String[] I;
   private String[] Q;
   private Map d;
   private static final long a = ess.a(7940362150394908119L, -6091391965160699231L, MethodHandles.lookup().lookupClass()).a(259968505590864L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] h;
   private static final Map i;

   public static String[] M() {
      return I;
   }

   public static String U(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 1
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast com/zelix/_8s
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic com/zelix/vm.a J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: ldc2_w 4893044820097586788
      // 024: lload 1
      // 025: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: astore 5
      // 02c: aload 5
      // 02e: ifnull 054
      // 031: aload 4
      // 033: ifnonnull 04f
      // 036: goto 043
      // 039: ldc2_w 4912966919746369911
      // 03c: lload 1
      // 03d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: athrow
      // 043: aload 3
      // 044: areturn
      // 045: ldc2_w 4912966919746369911
      // 048: lload 1
      // 049: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: athrow
      // 04f: aload 3
      // 050: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 053: astore 3
      // 054: aload 3
      // 055: sipush 7974
      // 058: ldc2_w 6588227978340832520
      // 05b: lload 1
      // 05c: lxor
      // 05d: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: invokevirtual java/lang/String.lastIndexOf (I)I
      // 065: istore 6
      // 067: iload 6
      // 069: ifgt 078
      // 06c: aload 3
      // 06d: areturn
      // 06e: ldc2_w 4912966919746369911
      // 071: lload 1
      // 072: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: aload 3
      // 079: iload 6
      // 07b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 07e: astore 7
      // 080: aload 3
      // 081: bipush 0
      // 082: iload 6
      // 084: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 087: astore 8
      // 089: aload 8
      // 08b: aload 5
      // 08d: ifnull 0fe
      // 090: invokevirtual java/lang/String.length ()I
      // 093: ifle 0ef
      // 096: goto 0a3
      // 099: ldc2_w 4912966919746369911
      // 09c: lload 1
      // 09d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: aload 8
      // 0a5: aload 5
      // 0a7: ifnull 0fe
      // 0aa: goto 0b7
      // 0ad: ldc2_w 4912966919746369911
      // 0b0: lload 1
      // 0b1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: bipush 0
      // 0b8: invokevirtual java/lang/String.charAt (I)C
      // 0bb: sipush 7974
      // 0be: ldc2_w 6588227978340832520
      // 0c1: lload 1
      // 0c2: lxor
      // 0c3: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: if_icmpne 0ef
      // 0cb: goto 0d8
      // 0ce: ldc2_w 4912966919746369911
      // 0d1: lload 1
      // 0d2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: ldc "/"
      // 0da: astore 9
      // 0dc: aload 8
      // 0de: bipush 1
      // 0df: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0e2: lload 1
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: iflt 0f1
      // 0e8: astore 8
      // 0ea: aload 5
      // 0ec: ifnonnull 100
      // 0ef: ldc ""
      // 0f1: goto 0fe
      // 0f4: ldc2_w 4912966919746369911
      // 0f7: lload 1
      // 0f8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: astore 9
      // 100: new java/lang/StringBuilder
      // 103: dup
      // 104: aload 8
      // 106: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 109: astore 10
      // 10b: new java/lang/StringBuilder
      // 10e: dup
      // 10f: invokespecial java/lang/StringBuilder.<init> ()V
      // 112: astore 11
      // 114: aload 10
      // 116: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 119: astore 12
      // 11b: aload 4
      // 11d: aload 12
      // 11f: ldc2_w 6807684701271764193
      // 122: lload 1
      // 123: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: checkcast java/lang/String
      // 12b: astore 13
      // 12d: aload 13
      // 12f: ifnull 243
      // 132: aload 13
      // 134: aload 5
      // 136: ifnull 28a
      // 139: aload 12
      // 13b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 13e: aload 5
      // 140: ifnull 25c
      // 143: goto 150
      // 146: ldc2_w 4912966919746369911
      // 149: lload 1
      // 14a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: ifne 289
      // 153: goto 160
      // 156: ldc2_w 4912966919746369911
      // 159: lload 1
      // 15a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: aload 11
      // 162: bipush 0
      // 163: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 166: aload 11
      // 168: aload 13
      // 16a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16d: pop
      // 16e: aload 8
      // 170: aload 12
      // 172: invokevirtual java/lang/String.length ()I
      // 175: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 178: astore 14
      // 17a: aload 11
      // 17c: invokevirtual java/lang/StringBuilder.length ()I
      // 17f: aload 5
      // 181: ifnull 217
      // 184: ifne 1f8
      // 187: goto 194
      // 18a: ldc2_w 4912966919746369911
      // 18d: lload 1
      // 18e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: aload 14
      // 196: invokevirtual java/lang/String.length ()I
      // 199: aload 5
      // 19b: ifnull 217
      // 19e: goto 1ab
      // 1a1: ldc2_w 4912966919746369911
      // 1a4: lload 1
      // 1a5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: ifle 1f8
      // 1ae: goto 1bb
      // 1b1: ldc2_w 4912966919746369911
      // 1b4: lload 1
      // 1b5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: aload 14
      // 1bd: bipush 0
      // 1be: invokevirtual java/lang/String.charAt (I)C
      // 1c1: aload 5
      // 1c3: ifnull 217
      // 1c6: goto 1d3
      // 1c9: ldc2_w 4912966919746369911
      // 1cc: lload 1
      // 1cd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: athrow
      // 1d3: sipush 7974
      // 1d6: ldc2_w 6588227978340832520
      // 1d9: lload 1
      // 1da: lxor
      // 1db: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: if_icmpne 1f8
      // 1e3: goto 1f0
      // 1e6: ldc2_w 4912966919746369911
      // 1e9: lload 1
      // 1ea: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: athrow
      // 1f0: aload 14
      // 1f2: bipush 1
      // 1f3: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1f6: astore 14
      // 1f8: aload 11
      // 1fa: aload 14
      // 1fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ff: pop
      // 200: aload 11
      // 202: aload 5
      // 204: ifnull 23b
      // 207: invokevirtual java/lang/StringBuilder.length ()I
      // 20a: goto 217
      // 20d: ldc2_w 4912966919746369911
      // 210: lload 1
      // 211: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: athrow
      // 217: ifne 222
      // 21a: aload 7
      // 21c: bipush 1
      // 21d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 220: astore 7
      // 222: new java/lang/StringBuilder
      // 225: dup
      // 226: invokespecial java/lang/StringBuilder.<init> ()V
      // 229: aload 9
      // 22b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22e: aload 11
      // 230: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 233: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 236: aload 7
      // 238: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 23e: astore 15
      // 240: aload 15
      // 242: areturn
      // 243: aload 12
      // 245: aload 5
      // 247: ifnull 28a
      // 24a: ldc "/"
      // 24c: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 24f: goto 25c
      // 252: ldc2_w 4912966919746369911
      // 255: lload 1
      // 256: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: athrow
      // 25c: istore 14
      // 25e: lload 1
      // 25f: lconst_0
      // 260: lcmp
      // 261: ifle 271
      // 264: iload 14
      // 266: bipush -1
      // 267: if_icmple 289
      // 26a: aload 10
      // 26c: iload 14
      // 26e: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 271: aload 5
      // 273: ifnonnull 114
      // 276: lload 1
      // 277: lconst_0
      // 278: lcmp
      // 279: ifle 132
      // 27c: goto 289
      // 27f: ldc2_w 4912966919746369911
      // 282: lload 1
      // 283: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: athrow
      // 289: aload 3
      // 28a: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public vm(_8s var1, long var2, Set var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 80919869030365L;
      long var7 = var2 ^ 65457322113218L;
      long var9 = var2 ^ 43204125496785L;
      super();
      x44.a<"q">(this, x44.a<"r">(new Object[]{var7}, -775018184869276847L, var2), -654250481669960422L, var2);
      String[] var10000 = x44.a<"r">(-1112391372295445236L, var2);
      x44.a<"q">(this, var1, -1518445004857018494L, var2);
      x44.a<"q">(this, x44.a<"r">(new Object[]{var4, var5}, -1014349993911018569L, var2), -1244803439057145880L, var2);
      x44.a<"q">(this, new String[var4.size()], -1103419665096921866L, var2);
      int var12 = 0;
      Iterator var13 = var4.iterator();
      String[] var11 = var10000;

      label43:
      while (var13.hasNext()) {
         String var14 = (String)var13.next();

         try {
            x44.a<"n">(this, -1103419665096921866L, var2)[var12++] = var14;
         } catch (gj var16) {
            boolean var10001 = false;
            throw x44.a<"r">(var16, -628754882456745441L, var2);
         }

         while (true) {
            try {
               var10000 = var11;
               if (var2 >= 0L) {
                  if (var11 == null) {
                     return;
                  }

                  var10000 = var11;
               }

               if (var10000 != null) {
                  break;
               }
            } catch (gj var15) {
               boolean var22 = false;
               throw x44.a<"r">(var15, -628754882456745441L, var2);
            }

            if (var2 >= 0L) {
               break label43;
            }
         }
      }

      x44.a<"r">(x44.a<"n">(this, -1103419665096921866L, var2), x44.a<"r">(new Object[]{var9}, -1256223309238590354L, var2), -808195088060578270L, var2);
   }

   public String a(Object[] var1) {
      String var3 = (String)var1[0];
      String var6 = (String)var1[1];
      long var4 = (Long)var1[2];
      boolean var2 = (Boolean)var1[3];
      var4 = a ^ var4;
      long var7 = var4 ^ 137608415830047L;
      Object[] var10006 = new Object[]{null, null, null, var2, x44.a<"k">(this, 5766942405152230759L, var4)};
      var10006[2] = var7;
      var10006[1] = var6;
      var10006[0] = var3;
      return x44.a<"w">(var10006, 5774291560484219943L, var4);
   }

   public String k(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast com/zelix/_8s
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic com/zelix/vm.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 62209350349325
      // 026: lxor
      // 027: lstore 6
      // 029: pop2
      // 02a: ldc2_w -3366283437137148725
      // 02d: lload 3
      // 02e: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: astore 8
      // 035: aload 5
      // 037: ifnull 1d3
      // 03a: aload 2
      // 03b: sipush 7804
      // 03e: ldc2_w 5079573332571742710
      // 041: lload 3
      // 042: lxor
      // 043: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 04b: istore 9
      // 04d: aload 2
      // 04e: bipush 0
      // 04f: iload 9
      // 051: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 054: astore 10
      // 056: ldc ""
      // 058: astore 11
      // 05a: aload 10
      // 05c: aload 8
      // 05e: ifnull 09e
      // 061: bipush 0
      // 062: invokevirtual java/lang/String.charAt (I)C
      // 065: sipush 7974
      // 068: ldc2_w 6588219981234177959
      // 06b: lload 3
      // 06c: lxor
      // 06d: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: if_icmpne 08e
      // 075: goto 082
      // 078: ldc2_w -2990033668889007144
      // 07b: lload 3
      // 07c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: aload 10
      // 084: bipush 1
      // 085: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 088: astore 10
      // 08a: ldc "/"
      // 08c: astore 11
      // 08e: aload 5
      // 090: aload 10
      // 092: ldc2_w -3686521266355192242
      // 095: lload 3
      // 096: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: checkcast java/lang/String
      // 09e: astore 12
      // 0a0: aload 12
      // 0a2: aload 8
      // 0a4: ifnull 0e2
      // 0a7: ifnull 0e0
      // 0aa: goto 0b7
      // 0ad: ldc2_w -2990033668889007144
      // 0b0: lload 3
      // 0b1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: new java/lang/StringBuilder
      // 0ba: dup
      // 0bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0be: aload 11
      // 0c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c3: aload 12
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: sipush 4505
      // 0cb: ldc2_w 2136577643903512084
      // 0ce: lload 3
      // 0cf: lxor
      // 0d0: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0db: astore 13
      // 0dd: aload 13
      // 0df: areturn
      // 0e0: ldc ""
      // 0e2: astore 13
      // 0e4: aload 0
      // 0e5: ldc2_w -3357240740710085327
      // 0e8: lload 3
      // 0e9: invokedynamic i (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: arraylength
      // 0ef: bipush 1
      // 0f0: isub
      // 0f1: istore 14
      // 0f3: iload 14
      // 0f5: iflt 179
      // 0f8: lload 3
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: iflt 153
      // 0fe: aload 10
      // 100: aload 8
      // 102: ifnull 151
      // 105: aload 0
      // 106: ldc2_w -3357240740710085327
      // 109: lload 3
      // 10a: invokedynamic i (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: iload 14
      // 111: aaload
      // 112: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 115: aload 8
      // 117: ifnull 190
      // 11a: goto 127
      // 11d: ldc2_w -2990033668889007144
      // 120: lload 3
      // 121: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: ifeq 15e
      // 12a: goto 137
      // 12d: ldc2_w -2990033668889007144
      // 130: lload 3
      // 131: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: aload 0
      // 138: ldc2_w -3357240740710085327
      // 13b: lload 3
      // 13c: invokedynamic i (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: iload 14
      // 143: aaload
      // 144: goto 151
      // 147: ldc2_w -2990033668889007144
      // 14a: lload 3
      // 14b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: astore 13
      // 153: lload 3
      // 154: lconst_0
      // 155: lcmp
      // 156: iflt 179
      // 159: aload 8
      // 15b: ifnonnull 179
      // 15e: iinc 14 -1
      // 161: aload 8
      // 163: ifnonnull 0f3
      // 166: lload 3
      // 167: lconst_0
      // 168: lcmp
      // 169: iflt 0f8
      // 16c: goto 179
      // 16f: ldc2_w -2990033668889007144
      // 172: lload 3
      // 173: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: aload 13
      // 17b: aload 8
      // 17d: ifnull 1d4
      // 180: invokevirtual java/lang/String.length ()I
      // 183: goto 190
      // 186: ldc2_w -2990033668889007144
      // 189: lload 3
      // 18a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: athrow
      // 190: ifle 1d3
      // 193: new java/lang/StringBuilder
      // 196: dup
      // 197: invokespecial java/lang/StringBuilder.<init> ()V
      // 19a: aload 11
      // 19c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19f: aload 13
      // 1a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a4: aload 10
      // 1a6: aload 13
      // 1a8: invokevirtual java/lang/String.length ()I
      // 1ab: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1ae: aload 5
      // 1b0: lload 6
      // 1b2: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 1b5: checkcast java/lang/String
      // 1b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bb: sipush 4505
      // 1be: ldc2_w 2136577643903512084
      // 1c1: lload 3
      // 1c2: lxor
      // 1c3: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ce: astore 14
      // 1d0: aload 14
      // 1d2: areturn
      // 1d3: aload 2
      // 1d4: areturn
   }

   public String F(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 13702073354019L;
      return x44.a<"s">(new Object[]{var5, var4, x44.a<"o">(this, 4889860956013354675L, var2)}, 5046926644474540916L, var2);
   }

   public String H(Object[] param1) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/vm.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: ldc2_w 5691301747221224312
      // 01c: lload 3
      // 01d: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: astore 5
      // 024: aload 2
      // 025: aload 5
      // 027: ifnull 19c
      // 02a: sipush 10092
      // 02d: ldc2_w 4526078705635903312
      // 030: lload 3
      // 031: lxor
      // 032: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 03a: bipush -1
      // 03b: if_icmpne 18e
      // 03e: goto 04b
      // 041: ldc2_w 5274379259143468139
      // 044: lload 3
      // 045: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: athrow
      // 04b: aload 2
      // 04c: aload 5
      // 04e: ifnull 19c
      // 051: goto 05e
      // 054: ldc2_w 5274379259143468139
      // 057: lload 3
      // 058: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: lload 3
      // 05f: lconst_0
      // 060: lcmp
      // 061: ifle 18f
      // 064: ldc "\\"
      // 066: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 069: bipush -1
      // 06a: if_icmpne 18e
      // 06d: goto 07a
      // 070: ldc2_w 5274379259143468139
      // 073: lload 3
      // 074: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: aload 2
      // 07b: aload 5
      // 07d: ifnull 19c
      // 080: goto 08d
      // 083: ldc2_w 5274379259143468139
      // 086: lload 3
      // 087: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: lload 3
      // 08e: lconst_0
      // 08f: lcmp
      // 090: ifle 18f
      // 093: ldc ":"
      // 095: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 098: bipush -1
      // 099: if_icmpne 18e
      // 09c: goto 0a9
      // 09f: ldc2_w 5274379259143468139
      // 0a2: lload 3
      // 0a3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: aload 2
      // 0aa: aload 5
      // 0ac: ifnull 19c
      // 0af: goto 0bc
      // 0b2: ldc2_w 5274379259143468139
      // 0b5: lload 3
      // 0b6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: lload 3
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: ifle 18f
      // 0c2: ldc "!"
      // 0c4: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0c7: bipush -1
      // 0c8: if_icmpne 18e
      // 0cb: goto 0d8
      // 0ce: ldc2_w 5274379259143468139
      // 0d1: lload 3
      // 0d2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: aload 2
      // 0d9: aload 5
      // 0db: ifnull 19c
      // 0de: goto 0eb
      // 0e1: ldc2_w 5274379259143468139
      // 0e4: lload 3
      // 0e5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: lload 3
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: iflt 18f
      // 0f1: ldc " "
      // 0f3: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0f6: bipush -1
      // 0f7: if_icmpne 18e
      // 0fa: goto 107
      // 0fd: ldc2_w 5274379259143468139
      // 100: lload 3
      // 101: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 2
      // 108: aload 5
      // 10a: ifnull 19c
      // 10d: goto 11a
      // 110: ldc2_w 5274379259143468139
      // 113: lload 3
      // 114: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: lload 3
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: ifle 18f
      // 120: ldc "'"
      // 122: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 125: bipush -1
      // 126: if_icmpne 18e
      // 129: goto 136
      // 12c: ldc2_w 5274379259143468139
      // 12f: lload 3
      // 130: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: aload 2
      // 137: aload 5
      // 139: ifnull 19c
      // 13c: goto 149
      // 13f: ldc2_w 5274379259143468139
      // 142: lload 3
      // 143: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: lload 3
      // 14a: lconst_0
      // 14b: lcmp
      // 14c: ifle 18f
      // 14f: ldc "["
      // 151: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 154: bipush -1
      // 155: if_icmpne 18e
      // 158: goto 165
      // 15b: ldc2_w 5274379259143468139
      // 15e: lload 3
      // 15f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: aload 2
      // 166: aload 5
      // 168: ifnull 19e
      // 16b: goto 178
      // 16e: ldc2_w 5274379259143468139
      // 171: lload 3
      // 172: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: ldc "("
      // 17a: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 17d: bipush -1
      // 17e: if_icmpeq 19d
      // 181: goto 18e
      // 184: ldc2_w 5274379259143468139
      // 187: lload 3
      // 188: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: aload 2
      // 18f: goto 19c
      // 192: ldc2_w 5274379259143468139
      // 195: lload 3
      // 196: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: athrow
      // 19c: areturn
      // 19d: aload 2
      // 19e: astore 6
      // 1a0: ldc ""
      // 1a2: astore 7
      // 1a4: aload 6
      // 1a6: bipush 0
      // 1a7: invokevirtual java/lang/String.charAt (I)C
      // 1aa: aload 5
      // 1ac: ifnull 1ea
      // 1af: sipush 7974
      // 1b2: ldc2_w 6588221925034465300
      // 1b5: lload 3
      // 1b6: lxor
      // 1b7: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: if_icmpne 1d8
      // 1bf: goto 1cc
      // 1c2: ldc2_w 5274379259143468139
      // 1c5: lload 3
      // 1c6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: aload 6
      // 1ce: bipush 1
      // 1cf: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1d2: astore 6
      // 1d4: ldc "/"
      // 1d6: astore 7
      // 1d8: aload 6
      // 1da: sipush 7974
      // 1dd: ldc2_w 6588221925034465300
      // 1e0: lload 3
      // 1e1: lxor
      // 1e2: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: invokevirtual java/lang/String.lastIndexOf (I)I
      // 1ea: istore 8
      // 1ec: iload 8
      // 1ee: iflt 619
      // 1f1: aload 6
      // 1f3: iload 8
      // 1f5: bipush 1
      // 1f6: iadd
      // 1f7: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1fa: astore 9
      // 1fc: aload 6
      // 1fe: bipush 0
      // 1ff: iload 8
      // 201: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 204: astore 10
      // 206: aload 0
      // 207: ldc2_w 5233129573807272814
      // 20a: lload 3
      // 20b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: aload 10
      // 212: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 217: checkcast java/lang/String
      // 21a: astore 11
      // 21c: aload 11
      // 21e: aload 5
      // 220: ifnull 37b
      // 223: ifnull 379
      // 226: goto 233
      // 229: ldc2_w 5274379259143468139
      // 22c: lload 3
      // 22d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: new java/lang/StringBuilder
      // 236: dup
      // 237: invokespecial java/lang/StringBuilder.<init> ()V
      // 23a: astore 12
      // 23c: aload 12
      // 23e: aload 7
      // 240: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 243: pop
      // 244: aload 12
      // 246: aload 11
      // 248: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24b: pop
      // 24c: aload 11
      // 24e: aload 5
      // 250: ifnull 374
      // 253: invokevirtual java/lang/String.length ()I
      // 256: ifle 367
      // 259: goto 266
      // 25c: ldc2_w 5274379259143468139
      // 25f: lload 3
      // 260: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: athrow
      // 266: aload 11
      // 268: aload 5
      // 26a: ifnull 374
      // 26d: goto 27a
      // 270: ldc2_w 5274379259143468139
      // 273: lload 3
      // 274: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: athrow
      // 27a: aload 11
      // 27c: invokevirtual java/lang/String.length ()I
      // 27f: bipush 1
      // 280: isub
      // 281: invokevirtual java/lang/String.charAt (I)C
      // 284: sipush 7974
      // 287: ldc2_w 6588221925034465300
      // 28a: lload 3
      // 28b: lxor
      // 28c: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: if_icmpeq 367
      // 294: goto 2a1
      // 297: ldc2_w 5274379259143468139
      // 29a: lload 3
      // 29b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: athrow
      // 2a1: aload 9
      // 2a3: invokevirtual java/lang/String.length ()I
      // 2a6: aload 5
      // 2a8: ifnull 327
      // 2ab: goto 2b8
      // 2ae: ldc2_w 5274379259143468139
      // 2b1: lload 3
      // 2b2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: athrow
      // 2b8: ifle 303
      // 2bb: goto 2c8
      // 2be: ldc2_w 5274379259143468139
      // 2c1: lload 3
      // 2c2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: athrow
      // 2c8: aload 9
      // 2ca: bipush 0
      // 2cb: invokevirtual java/lang/String.charAt (I)C
      // 2ce: lload 3
      // 2cf: lconst_0
      // 2d0: lcmp
      // 2d1: iflt 327
      // 2d4: aload 5
      // 2d6: ifnull 327
      // 2d9: goto 2e6
      // 2dc: ldc2_w 5274379259143468139
      // 2df: lload 3
      // 2e0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: athrow
      // 2e6: sipush 7974
      // 2e9: ldc2_w 6588221925034465300
      // 2ec: lload 3
      // 2ed: lxor
      // 2ee: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: if_icmpne 352
      // 2f6: goto 303
      // 2f9: ldc2_w 5274379259143468139
      // 2fc: lload 3
      // 2fd: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 302: athrow
      // 303: aload 9
      // 305: aload 5
      // 307: ifnull 374
      // 30a: goto 317
      // 30d: ldc2_w 5274379259143468139
      // 310: lload 3
      // 311: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: athrow
      // 317: invokevirtual java/lang/String.length ()I
      // 31a: goto 327
      // 31d: ldc2_w 5274379259143468139
      // 320: lload 3
      // 321: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 326: athrow
      // 327: ifne 367
      // 32a: aload 2
      // 32b: aload 5
      // 32d: ifnull 374
      // 330: goto 33d
      // 333: ldc2_w 5274379259143468139
      // 336: lload 3
      // 337: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33c: athrow
      // 33d: ldc "/"
      // 33f: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 342: ifeq 367
      // 345: goto 352
      // 348: ldc2_w 5274379259143468139
      // 34b: lload 3
      // 34c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: athrow
      // 352: aload 12
      // 354: ldc "/"
      // 356: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 359: pop
      // 35a: goto 367
      // 35d: ldc2_w 5274379259143468139
      // 360: lload 3
      // 361: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 366: athrow
      // 367: aload 12
      // 369: aload 9
      // 36b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36e: pop
      // 36f: aload 12
      // 371: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 374: astore 13
      // 376: aload 13
      // 378: areturn
      // 379: ldc ""
      // 37b: astore 12
      // 37d: aload 0
      // 37e: ldc2_w 5682329491205460610
      // 381: lload 3
      // 382: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 387: arraylength
      // 388: bipush 1
      // 389: isub
      // 38a: istore 13
      // 38c: iload 13
      // 38e: iflt 41c
      // 391: aload 10
      // 393: aload 5
      // 395: lload 3
      // 396: lconst_0
      // 397: lcmp
      // 398: ifle 3a8
      // 39b: ifnull 61a
      // 39e: aload 0
      // 39f: ldc2_w 5682329491205460610
      // 3a2: lload 3
      // 3a3: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a8: iload 13
      // 3aa: aaload
      // 3ab: aload 5
      // 3ad: ifnull 3ee
      // 3b0: goto 3bd
      // 3b3: ldc2_w 5274379259143468139
      // 3b6: lload 3
      // 3b7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bc: athrow
      // 3bd: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 3c0: ifeq 401
      // 3c3: goto 3d0
      // 3c6: ldc2_w 5274379259143468139
      // 3c9: lload 3
      // 3ca: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cf: athrow
      // 3d0: aload 0
      // 3d1: ldc2_w 5682329491205460610
      // 3d4: lload 3
      // 3d5: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3da: iload 13
      // 3dc: aaload
      // 3dd: astore 12
      // 3df: aload 10
      // 3e1: aload 0
      // 3e2: ldc2_w 5682329491205460610
      // 3e5: lload 3
      // 3e6: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3eb: iload 13
      // 3ed: aaload
      // 3ee: invokevirtual java/lang/String.length ()I
      // 3f1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3f4: astore 10
      // 3f6: aload 5
      // 3f8: lload 3
      // 3f9: lconst_0
      // 3fa: lcmp
      // 3fb: ifle 406
      // 3fe: ifnonnull 41c
      // 401: iinc 13 -1
      // 404: aload 5
      // 406: ifnonnull 38c
      // 409: lload 3
      // 40a: lconst_0
      // 40b: lcmp
      // 40c: ifle 391
      // 40f: goto 41c
      // 412: ldc2_w 5274379259143468139
      // 415: lload 3
      // 416: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41b: athrow
      // 41c: new java/lang/StringBuilder
      // 41f: dup
      // 420: aload 10
      // 422: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 425: astore 13
      // 427: aload 13
      // 429: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 42c: astore 14
      // 42e: aload 0
      // 42f: ldc2_w 6095916120134863350
      // 432: lload 3
      // 433: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_8s; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 438: aload 14
      // 43a: ldc2_w 6009428858560782845
      // 43d: lload 3
      // 43e: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 443: checkcast java/lang/String
      // 446: astore 15
      // 448: aload 15
      // 44a: ifnull 59b
      // 44d: new java/lang/StringBuilder
      // 450: dup
      // 451: aload 15
      // 453: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 456: astore 16
      // 458: aload 10
      // 45a: aload 14
      // 45c: invokevirtual java/lang/String.length ()I
      // 45f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 462: astore 17
      // 464: aload 16
      // 466: invokevirtual java/lang/StringBuilder.length ()I
      // 469: aload 5
      // 46b: lload 3
      // 46c: lconst_0
      // 46d: lcmp
      // 46e: ifle 476
      // 471: ifnull 5a2
      // 474: aload 5
      // 476: ifnull 55a
      // 479: goto 486
      // 47c: ldc2_w 5274379259143468139
      // 47f: lload 3
      // 480: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 485: athrow
      // 486: ifne 500
      // 489: goto 496
      // 48c: ldc2_w 5274379259143468139
      // 48f: lload 3
      // 490: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 495: athrow
      // 496: aload 17
      // 498: invokevirtual java/lang/String.length ()I
      // 49b: aload 5
      // 49d: ifnull 55a
      // 4a0: goto 4ad
      // 4a3: ldc2_w 5274379259143468139
      // 4a6: lload 3
      // 4a7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ac: athrow
      // 4ad: ifle 500
      // 4b0: goto 4bd
      // 4b3: ldc2_w 5274379259143468139
      // 4b6: lload 3
      // 4b7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bc: athrow
      // 4bd: aload 17
      // 4bf: bipush 0
      // 4c0: invokevirtual java/lang/String.charAt (I)C
      // 4c3: lload 3
      // 4c4: lconst_0
      // 4c5: lcmp
      // 4c6: ifle 55a
      // 4c9: aload 5
      // 4cb: ifnull 55a
      // 4ce: goto 4db
      // 4d1: ldc2_w 5274379259143468139
      // 4d4: lload 3
      // 4d5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4da: athrow
      // 4db: sipush 7974
      // 4de: ldc2_w 6588221925034465300
      // 4e1: lload 3
      // 4e2: lxor
      // 4e3: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e8: if_icmpne 500
      // 4eb: goto 4f8
      // 4ee: ldc2_w 5274379259143468139
      // 4f1: lload 3
      // 4f2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f7: athrow
      // 4f8: aload 17
      // 4fa: bipush 1
      // 4fb: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 4fe: astore 17
      // 500: aload 16
      // 502: aload 17
      // 504: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 507: pop
      // 508: aload 0
      // 509: ldc2_w 5233129573807272814
      // 50c: lload 3
      // 50d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 512: new java/lang/StringBuilder
      // 515: dup
      // 516: invokespecial java/lang/StringBuilder.<init> ()V
      // 519: aload 12
      // 51b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51e: aload 10
      // 520: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 523: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 526: new java/lang/StringBuilder
      // 529: dup
      // 52a: invokespecial java/lang/StringBuilder.<init> ()V
      // 52d: aload 12
      // 52f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 532: aload 16
      // 534: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 537: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 53d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 542: pop
      // 543: aload 16
      // 545: aload 5
      // 547: ifnull 593
      // 54a: invokevirtual java/lang/StringBuilder.length ()I
      // 54d: goto 55a
      // 550: ldc2_w 5274379259143468139
      // 553: lload 3
      // 554: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 559: athrow
      // 55a: ifle 572
      // 55d: aload 16
      // 55f: ldc "/"
      // 561: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 564: pop
      // 565: goto 572
      // 568: ldc2_w 5274379259143468139
      // 56b: lload 3
      // 56c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 571: athrow
      // 572: aload 16
      // 574: aload 9
      // 576: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 579: pop
      // 57a: new java/lang/StringBuilder
      // 57d: dup
      // 57e: invokespecial java/lang/StringBuilder.<init> ()V
      // 581: aload 7
      // 583: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 586: aload 12
      // 588: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 58b: aload 16
      // 58d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 590: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 593: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 596: astore 18
      // 598: aload 18
      // 59a: areturn
      // 59b: aload 14
      // 59d: ldc "/"
      // 59f: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 5a2: istore 16
      // 5a4: aload 5
      // 5a6: lload 3
      // 5a7: lconst_0
      // 5a8: lcmp
      // 5a9: ifle 5d8
      // 5ac: ifnull 5d6
      // 5af: iload 16
      // 5b1: bipush -1
      // 5b2: if_icmple 5db
      // 5b5: goto 5c2
      // 5b8: ldc2_w 5274379259143468139
      // 5bb: lload 3
      // 5bc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c1: athrow
      // 5c2: aload 13
      // 5c4: iload 16
      // 5c6: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 5c9: goto 5d6
      // 5cc: ldc2_w 5274379259143468139
      // 5cf: lload 3
      // 5d0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d5: athrow
      // 5d6: aload 5
      // 5d8: ifnonnull 427
      // 5db: lload 3
      // 5dc: lconst_0
      // 5dd: lcmp
      // 5de: ifle 5a4
      // 5e1: aload 0
      // 5e2: ldc2_w 5233129573807272814
      // 5e5: lload 3
      // 5e6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5eb: new java/lang/StringBuilder
      // 5ee: dup
      // 5ef: invokespecial java/lang/StringBuilder.<init> ()V
      // 5f2: aload 12
      // 5f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f7: aload 10
      // 5f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5fc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5ff: new java/lang/StringBuilder
      // 602: dup
      // 603: invokespecial java/lang/StringBuilder.<init> ()V
      // 606: aload 12
      // 608: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60b: aload 10
      // 60d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 610: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 613: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 618: pop
      // 619: aload 2
      // 61a: areturn
   }

   public static String Z(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Boolean
      // 021: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 024: istore 1
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast com/zelix/_8s
      // 02b: astore 6
      // 02d: pop
      // 02e: getstatic com/zelix/vm.a J
      // 031: lload 2
      // 032: lxor
      // 033: lstore 2
      // 034: ldc2_w 7011456880778376398
      // 037: lload 2
      // 038: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: bipush 0
      // 03e: istore 8
      // 040: astore 7
      // 042: aload 4
      // 044: invokevirtual java/lang/String.length ()I
      // 047: aload 7
      // 049: ifnull 06a
      // 04c: ifne 069
      // 04f: goto 05c
      // 052: ldc2_w 7387163250158345181
      // 055: lload 2
      // 056: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: aload 4
      // 05e: areturn
      // 05f: ldc2_w 7387163250158345181
      // 062: lload 2
      // 063: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: athrow
      // 069: iload 1
      // 06a: aload 7
      // 06c: ifnull 11d
      // 06f: ifeq 0f3
      // 072: goto 07f
      // 075: ldc2_w 7387163250158345181
      // 078: lload 2
      // 079: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: aload 4
      // 081: bipush 0
      // 082: invokevirtual java/lang/String.charAt (I)C
      // 085: sipush 10204
      // 088: ldc2_w 7660290439269617498
      // 08b: lload 2
      // 08c: lxor
      // 08d: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: lload 2
      // 093: lconst_0
      // 094: lcmp
      // 095: ifle 11e
      // 098: aload 7
      // 09a: ifnull 11e
      // 09d: goto 0aa
      // 0a0: ldc2_w 7387163250158345181
      // 0a3: lload 2
      // 0a4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: if_icmpne 0f3
      // 0ad: goto 0ba
      // 0b0: ldc2_w 7387163250158345181
      // 0b3: lload 2
      // 0b4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: bipush 1
      // 0bb: lload 2
      // 0bc: lconst_0
      // 0bd: lcmp
      // 0be: ifle 0cd
      // 0c1: istore 8
      // 0c3: aload 4
      // 0c5: aload 7
      // 0c7: ifnull 0f1
      // 0ca: invokevirtual java/lang/String.length ()I
      // 0cd: bipush 1
      // 0ce: if_icmpne 0eb
      // 0d1: goto 0de
      // 0d4: ldc2_w 7387163250158345181
      // 0d7: lload 2
      // 0d8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 4
      // 0e0: areturn
      // 0e1: ldc2_w 7387163250158345181
      // 0e4: lload 2
      // 0e5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 4
      // 0ed: bipush 1
      // 0ee: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0f1: astore 4
      // 0f3: aload 5
      // 0f5: lload 2
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: ifle 14d
      // 0fb: sipush 16717
      // 0fe: ldc2_w 9208777259698252232
      // 101: lload 2
      // 102: lxor
      // 103: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: aload 7
      // 10a: ifnull 13d
      // 10d: invokevirtual java/lang/String.indexOf (I)I
      // 110: goto 11d
      // 113: ldc2_w 7387163250158345181
      // 116: lload 2
      // 117: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: bipush -1
      // 11e: if_icmple 14f
      // 121: aload 5
      // 123: sipush 26061
      // 126: ldc2_w 3531985854271606090
      // 129: lload 2
      // 12a: lxor
      // 12b: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: goto 13d
      // 133: ldc2_w 7387163250158345181
      // 136: lload 2
      // 137: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: sipush 7974
      // 140: ldc2_w 6588259126033495970
      // 143: lload 2
      // 144: lxor
      // 145: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 14d: astore 5
      // 14f: new java/util/StringTokenizer
      // 152: dup
      // 153: aload 5
      // 155: ldc "/"
      // 157: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 15a: astore 9
      // 15c: new java/util/ArrayList
      // 15f: dup
      // 160: aload 9
      // 162: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 165: invokespecial java/util/ArrayList.<init> (I)V
      // 168: astore 10
      // 16a: aload 9
      // 16c: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 16f: ifeq 184
      // 172: aload 10
      // 174: aload 9
      // 176: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 179: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 17e: pop
      // 17f: aload 7
      // 181: ifnonnull 16a
      // 184: ldc ""
      // 186: astore 11
      // 188: new java/lang/StringBuilder
      // 18b: dup
      // 18c: invokespecial java/lang/StringBuilder.<init> ()V
      // 18f: astore 12
      // 191: aload 10
      // 193: invokeinterface java/util/List.size ()I 1
      // 198: istore 13
      // 19a: iload 13
      // 19c: bipush 1
      // 19d: isub
      // 19e: lload 2
      // 19f: lconst_0
      // 1a0: lcmp
      // 1a1: iflt 17e
      // 1a4: istore 14
      // 1a6: iload 14
      // 1a8: iflt 288
      // 1ab: aload 12
      // 1ad: aload 7
      // 1af: ifnull 1f5
      // 1b2: invokevirtual java/lang/StringBuilder.length ()I
      // 1b5: ifle 1ec
      // 1b8: goto 1c5
      // 1bb: ldc2_w 7387163250158345181
      // 1be: lload 2
      // 1bf: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: aload 12
      // 1c7: bipush 0
      // 1c8: sipush 7974
      // 1cb: ldc2_w 6588259126033495970
      // 1ce: lload 2
      // 1cf: lxor
      // 1d0: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: ldc2_w 7219801021211471985
      // 1d8: lload 2
      // 1d9: invokedynamic h (Ljava/lang/Object;ICJJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: pop
      // 1df: goto 1ec
      // 1e2: ldc2_w 7387163250158345181
      // 1e5: lload 2
      // 1e6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: athrow
      // 1ec: aload 10
      // 1ee: iload 14
      // 1f0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1f5: checkcast java/lang/String
      // 1f8: astore 15
      // 1fa: aload 12
      // 1fc: bipush 0
      // 1fd: aload 15
      // 1ff: ldc2_w 8705638151522655691
      // 202: lload 2
      // 203: invokedynamic h (Ljava/lang/Object;ILjava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: pop
      // 209: aload 6
      // 20b: aload 12
      // 20d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 210: ldc2_w 7164237678328218737
      // 213: lload 2
      // 214: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: lload 2
      // 21a: lconst_0
      // 21b: lcmp
      // 21c: iflt 258
      // 21f: aload 7
      // 221: ifnull 258
      // 224: ifeq 246
      // 227: goto 234
      // 22a: ldc2_w 7387163250158345181
      // 22d: lload 2
      // 22e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: athrow
      // 234: aload 12
      // 236: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 239: astore 11
      // 23b: aload 7
      // 23d: lload 2
      // 23e: lconst_0
      // 23f: lcmp
      // 240: iflt 272
      // 243: ifnonnull 26d
      // 246: aload 11
      // 248: invokevirtual java/lang/String.length ()I
      // 24b: goto 258
      // 24e: ldc2_w 7387163250158345181
      // 251: lload 2
      // 252: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: athrow
      // 258: ifle 26d
      // 25b: aload 7
      // 25d: ifnonnull 288
      // 260: goto 26d
      // 263: ldc2_w 7387163250158345181
      // 266: lload 2
      // 267: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: athrow
      // 26d: iinc 14 -1
      // 270: aload 7
      // 272: ifnonnull 1a6
      // 275: lload 2
      // 276: lconst_0
      // 277: lcmp
      // 278: ifle 1ab
      // 27b: goto 288
      // 27e: ldc2_w 7387163250158345181
      // 281: lload 2
      // 282: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: athrow
      // 288: aconst_null
      // 289: astore 14
      // 28b: aconst_null
      // 28c: astore 15
      // 28e: new java/lang/StringBuilder
      // 291: dup
      // 292: invokespecial java/lang/StringBuilder.<init> ()V
      // 295: astore 16
      // 297: new java/util/StringTokenizer
      // 29a: dup
      // 29b: aload 4
      // 29d: ldc "/"
      // 29f: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 2a2: astore 17
      // 2a4: aload 17
      // 2a6: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 2a9: istore 13
      // 2ab: bipush 0
      // 2ac: istore 18
      // 2ae: iload 18
      // 2b0: iload 13
      // 2b2: if_icmpge 3a3
      // 2b5: aload 12
      // 2b7: bipush 0
      // 2b8: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 2bb: aload 12
      // 2bd: aload 11
      // 2bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c2: pop
      // 2c3: aload 12
      // 2c5: invokevirtual java/lang/StringBuilder.length ()I
      // 2c8: lload 2
      // 2c9: lconst_0
      // 2ca: lcmp
      // 2cb: ifle 734
      // 2ce: aload 7
      // 2d0: ifnull 734
      // 2d3: aload 7
      // 2d5: ifnull 32c
      // 2d8: goto 2e5
      // 2db: ldc2_w 7387163250158345181
      // 2de: lload 2
      // 2df: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: athrow
      // 2e5: ifle 315
      // 2e8: goto 2f5
      // 2eb: ldc2_w 7387163250158345181
      // 2ee: lload 2
      // 2ef: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f4: athrow
      // 2f5: aload 12
      // 2f7: sipush 7974
      // 2fa: ldc2_w 6588259126033495970
      // 2fd: lload 2
      // 2fe: lxor
      // 2ff: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 307: pop
      // 308: goto 315
      // 30b: ldc2_w 7387163250158345181
      // 30e: lload 2
      // 30f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 314: athrow
      // 315: aload 16
      // 317: aload 7
      // 319: ifnull 34e
      // 31c: invokevirtual java/lang/StringBuilder.length ()I
      // 31f: goto 32c
      // 322: ldc2_w 7387163250158345181
      // 325: lload 2
      // 326: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: athrow
      // 32c: ifle 34f
      // 32f: aload 16
      // 331: sipush 7974
      // 334: ldc2_w 6588259126033495970
      // 337: lload 2
      // 338: lxor
      // 339: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 341: goto 34e
      // 344: ldc2_w 7387163250158345181
      // 347: lload 2
      // 348: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34d: athrow
      // 34e: pop
      // 34f: aload 17
      // 351: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 354: aload 7
      // 356: lload 2
      // 357: lconst_0
      // 358: lcmp
      // 359: ifle 3ad
      // 35c: ifnull 3ab
      // 35f: astore 19
      // 361: aload 16
      // 363: aload 19
      // 365: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 368: pop
      // 369: aload 12
      // 36b: aload 16
      // 36d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 370: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 373: pop
      // 374: lload 2
      // 375: lconst_0
      // 376: lcmp
      // 377: ifle 39e
      // 37a: aload 6
      // 37c: aload 12
      // 37e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 381: ldc2_w 7164237678328218737
      // 384: lload 2
      // 385: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38a: ifeq 3a3
      // 38d: aload 12
      // 38f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 392: astore 14
      // 394: aload 16
      // 396: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 399: astore 15
      // 39b: iinc 18 1
      // 39e: aload 7
      // 3a0: ifnonnull 2ae
      // 3a3: lload 2
      // 3a4: lconst_0
      // 3a5: lcmp
      // 3a6: ifle 2c3
      // 3a9: aload 14
      // 3ab: aload 7
      // 3ad: ifnull 3dd
      // 3b0: ifnull 732
      // 3b3: goto 3c0
      // 3b6: ldc2_w 7387163250158345181
      // 3b9: lload 2
      // 3ba: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bf: athrow
      // 3c0: aload 6
      // 3c2: aload 14
      // 3c4: ldc2_w 8994785350393138763
      // 3c7: lload 2
      // 3c8: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cd: checkcast java/lang/String
      // 3d0: goto 3dd
      // 3d3: ldc2_w 7387163250158345181
      // 3d6: lload 2
      // 3d7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dc: athrow
      // 3dd: astore 18
      // 3df: aload 11
      // 3e1: aload 7
      // 3e3: lload 2
      // 3e4: lconst_0
      // 3e5: lcmp
      // 3e6: ifle 643
      // 3e9: ifnull 63b
      // 3ec: invokevirtual java/lang/String.length ()I
      // 3ef: ifle 639
      // 3f2: goto 3ff
      // 3f5: ldc2_w 7387163250158345181
      // 3f8: lload 2
      // 3f9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fe: athrow
      // 3ff: aload 6
      // 401: aload 11
      // 403: ldc2_w 8994785350393138763
      // 406: lload 2
      // 407: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40c: checkcast java/lang/String
      // 40f: astore 19
      // 411: aload 14
      // 413: invokevirtual java/lang/String.length ()I
      // 416: lload 2
      // 417: lconst_0
      // 418: lcmp
      // 419: ifle 607
      // 41c: aload 7
      // 41e: ifnull 607
      // 421: aload 11
      // 423: invokevirtual java/lang/String.length ()I
      // 426: if_icmple 605
      // 429: goto 436
      // 42c: ldc2_w 7387163250158345181
      // 42f: lload 2
      // 430: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 435: athrow
      // 436: ldc ""
      // 438: astore 20
      // 43a: aload 18
      // 43c: aload 7
      // 43e: lload 2
      // 43f: lconst_0
      // 440: lcmp
      // 441: ifle 516
      // 444: ifnull 50e
      // 447: invokevirtual java/lang/String.length ()I
      // 44a: aload 19
      // 44c: invokevirtual java/lang/String.length ()I
      // 44f: if_icmpeq 50c
      // 452: goto 45f
      // 455: ldc2_w 7387163250158345181
      // 458: lload 2
      // 459: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45e: athrow
      // 45f: aload 18
      // 461: aload 7
      // 463: ifnull 50a
      // 466: goto 473
      // 469: ldc2_w 7387163250158345181
      // 46c: lload 2
      // 46d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 472: athrow
      // 473: invokevirtual java/lang/String.length ()I
      // 476: lload 2
      // 477: lconst_0
      // 478: lcmp
      // 479: iflt 4f3
      // 47c: aload 19
      // 47e: invokevirtual java/lang/String.length ()I
      // 481: if_icmple 4f0
      // 484: goto 491
      // 487: ldc2_w 7387163250158345181
      // 48a: lload 2
      // 48b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 490: athrow
      // 491: aload 18
      // 493: aload 19
      // 495: invokevirtual java/lang/String.length ()I
      // 498: aload 18
      // 49a: sipush 7974
      // 49d: ldc2_w 6588259126033495970
      // 4a0: lload 2
      // 4a1: lxor
      // 4a2: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a7: invokevirtual java/lang/String.indexOf (I)I
      // 4aa: aload 7
      // 4ac: ifnull 4db
      // 4af: goto 4bc
      // 4b2: ldc2_w 7387163250158345181
      // 4b5: lload 2
      // 4b6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bb: athrow
      // 4bc: bipush -1
      // 4bd: if_icmpne 4de
      // 4c0: goto 4cd
      // 4c3: ldc2_w 7387163250158345181
      // 4c6: lload 2
      // 4c7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4cc: athrow
      // 4cd: bipush 0
      // 4ce: goto 4db
      // 4d1: ldc2_w 7387163250158345181
      // 4d4: lload 2
      // 4d5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4da: athrow
      // 4db: goto 4df
      // 4de: bipush 1
      // 4df: iadd
      // 4e0: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 4e3: lload 2
      // 4e4: lconst_0
      // 4e5: lcmp
      // 4e6: iflt 4fd
      // 4e9: astore 20
      // 4eb: aload 7
      // 4ed: ifnonnull 50c
      // 4f0: sipush 20522
      // 4f3: ldc2_w 5222835902353514403
      // 4f6: lload 2
      // 4f7: lxor
      // 4f8: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fd: goto 50a
      // 500: ldc2_w 7387163250158345181
      // 503: lload 2
      // 504: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 509: athrow
      // 50a: astore 20
      // 50c: aload 15
      // 50e: lload 2
      // 50f: lconst_0
      // 510: lcmp
      // 511: ifle 52b
      // 514: aload 7
      // 516: ifnull 52b
      // 519: ifnull 5d1
      // 51c: goto 529
      // 51f: ldc2_w 7387163250158345181
      // 522: lload 2
      // 523: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 528: athrow
      // 529: aload 15
      // 52b: invokevirtual java/lang/String.length ()I
      // 52e: lload 2
      // 52f: lconst_0
      // 530: lcmp
      // 531: ifle 5d3
      // 534: aload 7
      // 536: ifnull 5d3
      // 539: aload 4
      // 53b: invokevirtual java/lang/String.length ()I
      // 53e: if_icmpge 5d1
      // 541: goto 54e
      // 544: ldc2_w 7387163250158345181
      // 547: lload 2
      // 548: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54d: athrow
      // 54e: aload 4
      // 550: aload 15
      // 552: invokevirtual java/lang/String.length ()I
      // 555: aload 20
      // 557: invokevirtual java/lang/String.length ()I
      // 55a: aload 7
      // 55c: ifnull 57d
      // 55f: goto 56c
      // 562: ldc2_w 7387163250158345181
      // 565: lload 2
      // 566: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56b: athrow
      // 56c: ifle 580
      // 56f: goto 57c
      // 572: ldc2_w 7387163250158345181
      // 575: lload 2
      // 576: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57b: athrow
      // 57c: bipush 0
      // 57d: goto 581
      // 580: bipush 1
      // 581: iadd
      // 582: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 585: astore 21
      // 587: new java/lang/StringBuilder
      // 58a: dup
      // 58b: invokespecial java/lang/StringBuilder.<init> ()V
      // 58e: aload 20
      // 590: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 593: aload 21
      // 595: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 598: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 59b: astore 22
      // 59d: iload 8
      // 59f: ifeq 5ce
      // 5a2: new java/lang/StringBuilder
      // 5a5: dup
      // 5a6: invokespecial java/lang/StringBuilder.<init> ()V
      // 5a9: sipush 7974
      // 5ac: ldc2_w 6588259126033495970
      // 5af: lload 2
      // 5b0: lxor
      // 5b1: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b6: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 5b9: aload 22
      // 5bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5be: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5c1: goto 5d0
      // 5c4: ldc2_w 7387163250158345181
      // 5c7: lload 2
      // 5c8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cd: athrow
      // 5ce: aload 22
      // 5d0: areturn
      // 5d1: iload 8
      // 5d3: ifeq 602
      // 5d6: new java/lang/StringBuilder
      // 5d9: dup
      // 5da: invokespecial java/lang/StringBuilder.<init> ()V
      // 5dd: sipush 7974
      // 5e0: ldc2_w 6588259126033495970
      // 5e3: lload 2
      // 5e4: lxor
      // 5e5: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ea: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 5ed: aload 20
      // 5ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5f5: goto 604
      // 5f8: ldc2_w 7387163250158345181
      // 5fb: lload 2
      // 5fc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 601: athrow
      // 602: aload 20
      // 604: areturn
      // 605: iload 8
      // 607: ifeq 636
      // 60a: new java/lang/StringBuilder
      // 60d: dup
      // 60e: invokespecial java/lang/StringBuilder.<init> ()V
      // 611: sipush 7974
      // 614: ldc2_w 6588259126033495970
      // 617: lload 2
      // 618: lxor
      // 619: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 621: aload 4
      // 623: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 626: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 629: goto 638
      // 62c: ldc2_w 7387163250158345181
      // 62f: lload 2
      // 630: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 635: athrow
      // 636: aload 4
      // 638: areturn
      // 639: aload 15
      // 63b: lload 2
      // 63c: lconst_0
      // 63d: lcmp
      // 63e: iflt 658
      // 641: aload 7
      // 643: ifnull 658
      // 646: ifnull 6fe
      // 649: goto 656
      // 64c: ldc2_w 7387163250158345181
      // 64f: lload 2
      // 650: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 655: athrow
      // 656: aload 15
      // 658: invokevirtual java/lang/String.length ()I
      // 65b: lload 2
      // 65c: lconst_0
      // 65d: lcmp
      // 65e: ifle 700
      // 661: aload 7
      // 663: ifnull 700
      // 666: aload 4
      // 668: invokevirtual java/lang/String.length ()I
      // 66b: if_icmpge 6fe
      // 66e: goto 67b
      // 671: ldc2_w 7387163250158345181
      // 674: lload 2
      // 675: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67a: athrow
      // 67b: aload 4
      // 67d: aload 15
      // 67f: invokevirtual java/lang/String.length ()I
      // 682: aload 18
      // 684: invokevirtual java/lang/String.length ()I
      // 687: aload 7
      // 689: ifnull 6aa
      // 68c: goto 699
      // 68f: ldc2_w 7387163250158345181
      // 692: lload 2
      // 693: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 698: athrow
      // 699: ifle 6ad
      // 69c: goto 6a9
      // 69f: ldc2_w 7387163250158345181
      // 6a2: lload 2
      // 6a3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a8: athrow
      // 6a9: bipush 0
      // 6aa: goto 6ae
      // 6ad: bipush 1
      // 6ae: iadd
      // 6af: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 6b2: astore 19
      // 6b4: new java/lang/StringBuilder
      // 6b7: dup
      // 6b8: invokespecial java/lang/StringBuilder.<init> ()V
      // 6bb: aload 18
      // 6bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c0: aload 19
      // 6c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6c8: astore 20
      // 6ca: iload 8
      // 6cc: ifeq 6fb
      // 6cf: new java/lang/StringBuilder
      // 6d2: dup
      // 6d3: invokespecial java/lang/StringBuilder.<init> ()V
      // 6d6: sipush 7974
      // 6d9: ldc2_w 6588259126033495970
      // 6dc: lload 2
      // 6dd: lxor
      // 6de: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e3: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 6e6: aload 20
      // 6e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6ee: goto 6fd
      // 6f1: ldc2_w 7387163250158345181
      // 6f4: lload 2
      // 6f5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6fa: athrow
      // 6fb: aload 20
      // 6fd: areturn
      // 6fe: iload 8
      // 700: ifeq 72f
      // 703: new java/lang/StringBuilder
      // 706: dup
      // 707: invokespecial java/lang/StringBuilder.<init> ()V
      // 70a: sipush 7974
      // 70d: ldc2_w 6588259126033495970
      // 710: lload 2
      // 711: lxor
      // 712: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 717: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 71a: aload 18
      // 71c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 71f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 722: goto 731
      // 725: ldc2_w 7387163250158345181
      // 728: lload 2
      // 729: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72e: athrow
      // 72f: aload 18
      // 731: areturn
      // 732: iload 8
      // 734: ifeq 763
      // 737: new java/lang/StringBuilder
      // 73a: dup
      // 73b: invokespecial java/lang/StringBuilder.<init> ()V
      // 73e: sipush 7974
      // 741: ldc2_w 6588259126033495970
      // 744: lload 2
      // 745: lxor
      // 746: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 74e: aload 4
      // 750: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 753: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 756: goto 765
      // 759: ldc2_w 7387163250158345181
      // 75c: lload 2
      // 75d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 762: athrow
      // 763: aload 4
      // 765: areturn
   }

   public String q(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/vm.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: aload 4
      // 01c: astore 6
      // 01e: ldc ""
      // 020: astore 7
      // 022: ldc2_w -1942590837413711735
      // 025: lload 2
      // 026: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: ldc ""
      // 02d: astore 8
      // 02f: astore 5
      // 031: aload 6
      // 033: bipush 0
      // 034: invokevirtual java/lang/String.charAt (I)C
      // 037: sipush 7974
      // 03a: ldc2_w 6588211871868138469
      // 03d: lload 2
      // 03e: lxor
      // 03f: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: aload 5
      // 046: ifnull 090
      // 049: if_icmpne 065
      // 04c: goto 059
      // 04f: ldc2_w -2106755709155172454
      // 052: lload 2
      // 053: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: athrow
      // 059: aload 6
      // 05b: bipush 1
      // 05c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 05f: astore 6
      // 061: ldc "/"
      // 063: astore 7
      // 065: aload 6
      // 067: aload 5
      // 069: ifnull 0be
      // 06c: aload 6
      // 06e: invokevirtual java/lang/String.length ()I
      // 071: bipush 1
      // 072: isub
      // 073: invokevirtual java/lang/String.charAt (I)C
      // 076: sipush 7974
      // 079: ldc2_w 6588211871868138469
      // 07c: lload 2
      // 07d: lxor
      // 07e: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: goto 090
      // 086: ldc2_w -2106755709155172454
      // 089: lload 2
      // 08a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: if_icmpne 0a6
      // 093: aload 6
      // 095: bipush 0
      // 096: aload 6
      // 098: invokevirtual java/lang/String.length ()I
      // 09b: bipush 1
      // 09c: isub
      // 09d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0a0: astore 6
      // 0a2: ldc "/"
      // 0a4: astore 8
      // 0a6: aload 0
      // 0a7: ldc2_w -42753083287019001
      // 0aa: lload 2
      // 0ab: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_8s; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: aload 6
      // 0b2: ldc2_w -534573135335814644
      // 0b5: lload 2
      // 0b6: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: checkcast java/lang/String
      // 0be: astore 9
      // 0c0: aload 9
      // 0c2: aload 5
      // 0c4: ifnull 130
      // 0c7: ifnull 12e
      // 0ca: goto 0d7
      // 0cd: ldc2_w -2106755709155172454
      // 0d0: lload 2
      // 0d1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: new java/lang/StringBuilder
      // 0da: dup
      // 0db: invokespecial java/lang/StringBuilder.<init> ()V
      // 0de: aload 7
      // 0e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e3: aload 9
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: aload 9
      // 0ea: aload 5
      // 0ec: ifnull 11e
      // 0ef: goto 0fc
      // 0f2: ldc2_w -2106755709155172454
      // 0f5: lload 2
      // 0f6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: invokevirtual java/lang/String.length ()I
      // 0ff: ifle 121
      // 102: goto 10f
      // 105: ldc2_w -2106755709155172454
      // 108: lload 2
      // 109: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 8
      // 111: goto 11e
      // 114: ldc2_w -2106755709155172454
      // 117: lload 2
      // 118: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: goto 123
      // 121: ldc ""
      // 123: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 126: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 129: astore 10
      // 12b: aload 10
      // 12d: areturn
      // 12e: aload 4
      // 130: areturn
   }

   public boolean a(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = a ^ var3;
      String[] var10000 = x44.a<"u">(7926542925800045443L, var3);
      String var6 = var2;
      String[] var5 = var10000;

      int var10001;
      label34: {
         label33: {
            try {
               var10 = var6.charAt(0);
               var10001 = b<"y">(7974, 6588270293536651503L ^ var3);
               if (var5 == null) {
                  break label34;
               }

               if (var10 != var10001) {
                  break label33;
               }
            } catch (gj var8) {
               throw x44.a<"u">(var8, 7622755783858656400L, var3);
            }

            var6 = var2.substring(1);
         }

         try {
            var10 = var6.charAt(var6.length() - 1);
            if (var5 == null) {
               return (boolean)var10;
            }

            var10001 = b<"y">(7974, 6588270293536651503L ^ var3);
         } catch (gj var7) {
            throw x44.a<"u">(var7, 7622755783858656400L, var3);
         }
      }

      if (var10 == var10001) {
         var6 = var6.substring(0, var6.length() - 1);
      }

      return x44.a<"m">(x44.a<"i">(this, 8386308799797618957L, var3), var6, 7791634295764290364L, var3);
   }

   public static String t(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/String
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_8s
      // 019: astore 3
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/wp
      // 020: astore 1
      // 021: pop
      // 022: getstatic com/zelix/vm.a J
      // 025: lload 4
      // 027: lxor
      // 028: lstore 4
      // 02a: lload 4
      // 02c: dup2
      // 02d: ldc2_w 121976801881014
      // 030: lxor
      // 031: lstore 6
      // 033: pop2
      // 034: ldc2_w 6933193922183722420
      // 037: lload 4
      // 039: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: aload 1
      // 03f: bipush 0
      // 040: invokevirtual com/zelix/wp.V (I)V
      // 043: astore 8
      // 045: aload 8
      // 047: ifnull 06e
      // 04a: aload 3
      // 04b: ifnonnull 069
      // 04e: goto 05c
      // 051: ldc2_w 7493545679083084455
      // 054: lload 4
      // 056: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: aload 2
      // 05d: areturn
      // 05e: ldc2_w 7493545679083084455
      // 061: lload 4
      // 063: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: athrow
      // 069: aload 2
      // 06a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 06d: astore 2
      // 06e: new java/lang/StringBuilder
      // 071: dup
      // 072: aload 2
      // 073: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 076: astore 9
      // 078: new java/lang/StringBuilder
      // 07b: dup
      // 07c: invokespecial java/lang/StringBuilder.<init> ()V
      // 07f: astore 10
      // 081: aload 9
      // 083: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 086: astore 11
      // 088: aload 3
      // 089: aload 11
      // 08b: ldc2_w 9055032818018094897
      // 08e: lload 4
      // 090: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: checkcast java/lang/String
      // 098: astore 12
      // 09a: aload 12
      // 09c: ifnull 195
      // 09f: aload 12
      // 0a1: aload 8
      // 0a3: ifnull 1e0
      // 0a6: aload 11
      // 0a8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ab: aload 8
      // 0ad: ifnull 1af
      // 0b0: goto 0be
      // 0b3: ldc2_w 7493545679083084455
      // 0b6: lload 4
      // 0b8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: ifne 1df
      // 0c1: goto 0cf
      // 0c4: ldc2_w 7493545679083084455
      // 0c7: lload 4
      // 0c9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: aload 10
      // 0d1: bipush 0
      // 0d2: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 0d5: aload 10
      // 0d7: aload 12
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: pop
      // 0dd: aload 2
      // 0de: aload 11
      // 0e0: invokevirtual java/lang/String.length ()I
      // 0e3: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0e6: astore 13
      // 0e8: aload 10
      // 0ea: aload 8
      // 0ec: ifnull 191
      // 0ef: invokevirtual java/lang/StringBuilder.length ()I
      // 0f2: ifne 16c
      // 0f5: goto 103
      // 0f8: ldc2_w 7493545679083084455
      // 0fb: lload 4
      // 0fd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: aload 13
      // 105: aload 8
      // 107: ifnull 194
      // 10a: goto 118
      // 10d: ldc2_w 7493545679083084455
      // 110: lload 4
      // 112: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: invokevirtual java/lang/String.length ()I
      // 11b: ifle 16c
      // 11e: goto 12c
      // 121: ldc2_w 7493545679083084455
      // 124: lload 4
      // 126: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: aload 13
      // 12e: aload 8
      // 130: ifnull 194
      // 133: goto 141
      // 136: ldc2_w 7493545679083084455
      // 139: lload 4
      // 13b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: bipush 0
      // 142: invokevirtual java/lang/String.charAt (I)C
      // 145: sipush 7974
      // 148: ldc2_w 6588246207940310744
      // 14b: lload 4
      // 14d: lxor
      // 14e: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: if_icmpne 16c
      // 156: goto 164
      // 159: ldc2_w 7493545679083084455
      // 15c: lload 4
      // 15e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: aload 13
      // 166: bipush 1
      // 167: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 16a: astore 13
      // 16c: aload 10
      // 16e: aload 13
      // 170: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 173: pop
      // 174: aload 1
      // 175: lload 6
      // 177: aload 11
      // 179: sipush 7974
      // 17c: ldc2_w 6588246207940310744
      // 17f: lload 4
      // 181: lxor
      // 182: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: invokestatic com/zelix/l_.p (JLjava/lang/String;C)I
      // 18a: bipush 1
      // 18b: iadd
      // 18c: invokevirtual com/zelix/wp.V (I)V
      // 18f: aload 10
      // 191: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 194: areturn
      // 195: aload 11
      // 197: aload 8
      // 199: ifnull 1e0
      // 19c: ldc "/"
      // 19e: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 1a1: goto 1af
      // 1a4: ldc2_w 7493545679083084455
      // 1a7: lload 4
      // 1a9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: istore 13
      // 1b1: lload 4
      // 1b3: lconst_0
      // 1b4: lcmp
      // 1b5: iflt 1c5
      // 1b8: iload 13
      // 1ba: bipush -1
      // 1bb: if_icmple 1df
      // 1be: aload 9
      // 1c0: iload 13
      // 1c2: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 1c5: aload 8
      // 1c7: ifnonnull 081
      // 1ca: lload 4
      // 1cc: lconst_0
      // 1cd: lcmp
      // 1ce: ifle 09f
      // 1d1: goto 1df
      // 1d4: ldc2_w 7493545679083084455
      // 1d7: lload 4
      // 1d9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: aload 2
      // 1e0: areturn
   }

   public static void Y(String[] var0) {
      I = var0;
   }

   public static String G(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast com/zelix/_8s
      // 015: astore 1
      // 016: dup
      // 017: bipush 3
      // 018: aaload
      // 019: checkcast java/lang/Long
      // 01c: invokevirtual java/lang/Long.longValue ()J
      // 01f: lstore 4
      // 021: pop
      // 022: getstatic com/zelix/vm.a J
      // 025: lload 4
      // 027: lxor
      // 028: lstore 4
      // 02a: ldc2_w -8609496730131587833
      // 02d: lload 4
      // 02f: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: aload 2
      // 035: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 038: astore 2
      // 039: aload 3
      // 03a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 03d: astore 3
      // 03e: astore 6
      // 040: aload 2
      // 041: invokevirtual java/lang/String.length ()I
      // 044: aload 6
      // 046: ifnull 0a9
      // 049: ifle 097
      // 04c: goto 05a
      // 04f: ldc2_w -8120791251103518188
      // 052: lload 4
      // 054: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: athrow
      // 05a: aload 2
      // 05b: bipush 0
      // 05c: invokevirtual java/lang/String.charAt (I)C
      // 05f: aload 6
      // 061: ifnull 0a9
      // 064: goto 072
      // 067: ldc2_w -8120791251103518188
      // 06a: lload 4
      // 06c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: sipush 7974
      // 075: ldc2_w 6588322535701372523
      // 078: lload 4
      // 07a: lxor
      // 07b: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: if_icmpne 097
      // 083: goto 091
      // 086: ldc2_w -8120791251103518188
      // 089: lload 4
      // 08b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: aload 2
      // 092: bipush 1
      // 093: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 096: astore 2
      // 097: aload 2
      // 098: sipush 7974
      // 09b: ldc2_w 6588322535701372523
      // 09e: lload 4
      // 0a0: lxor
      // 0a1: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: invokevirtual java/lang/String.lastIndexOf (I)I
      // 0a9: istore 7
      // 0ab: iload 7
      // 0ad: ifgt 0bd
      // 0b0: aload 3
      // 0b1: areturn
      // 0b2: ldc2_w -8120791251103518188
      // 0b5: lload 4
      // 0b7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: aconst_null
      // 0be: astore 8
      // 0c0: aconst_null
      // 0c1: astore 9
      // 0c3: new java/lang/StringBuilder
      // 0c6: dup
      // 0c7: aload 2
      // 0c8: bipush 0
      // 0c9: iload 7
      // 0cb: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ce: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 0d1: astore 10
      // 0d3: aload 10
      // 0d5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d8: astore 11
      // 0da: aload 1
      // 0db: aload 11
      // 0dd: ldc2_w -7702638419837458558
      // 0e0: lload 4
      // 0e2: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: checkcast java/lang/String
      // 0ea: astore 9
      // 0ec: aload 9
      // 0ee: ifnull 116
      // 0f1: aload 11
      // 0f3: astore 8
      // 0f5: lload 4
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: iflt 150
      // 0fc: lload 4
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: iflt 150
      // 103: aload 6
      // 105: ifnull 150
      // 108: goto 150
      // 10b: ldc2_w -8120791251103518188
      // 10e: lload 4
      // 110: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: athrow
      // 116: aload 11
      // 118: ldc "/"
      // 11a: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 11d: istore 12
      // 11f: aload 6
      // 121: ifnull 14d
      // 124: iload 12
      // 126: bipush -1
      // 127: if_icmple 150
      // 12a: goto 138
      // 12d: ldc2_w -8120791251103518188
      // 130: lload 4
      // 132: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: athrow
      // 138: aload 10
      // 13a: iload 12
      // 13c: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 13f: goto 14d
      // 142: ldc2_w -8120791251103518188
      // 145: lload 4
      // 147: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: goto 0d3
      // 150: aload 8
      // 152: aload 6
      // 154: ifnull 352
      // 157: ifnull 351
      // 15a: goto 168
      // 15d: ldc2_w -8120791251103518188
      // 160: lload 4
      // 162: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: aload 8
      // 16a: aload 6
      // 16c: ifnull 352
      // 16f: goto 17d
      // 172: ldc2_w -8120791251103518188
      // 175: lload 4
      // 177: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: aload 9
      // 17f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 182: ifne 351
      // 185: goto 193
      // 188: ldc2_w -8120791251103518188
      // 18b: lload 4
      // 18d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: athrow
      // 193: aload 2
      // 194: aload 8
      // 196: invokevirtual java/lang/String.length ()I
      // 199: bipush 1
      // 19a: iadd
      // 19b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 19e: astore 11
      // 1a0: aload 11
      // 1a2: invokevirtual java/lang/String.length ()I
      // 1a5: aload 6
      // 1a7: ifnull 1e4
      // 1aa: aload 3
      // 1ab: invokevirtual java/lang/String.length ()I
      // 1ae: if_icmplt 1cc
      // 1b1: goto 1bf
      // 1b4: ldc2_w -8120791251103518188
      // 1b7: lload 4
      // 1b9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: athrow
      // 1bf: aload 3
      // 1c0: areturn
      // 1c1: ldc2_w -8120791251103518188
      // 1c4: lload 4
      // 1c6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: aload 3
      // 1cd: aload 6
      // 1cf: ifnull 223
      // 1d2: aload 2
      // 1d3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1d6: goto 1e4
      // 1d9: ldc2_w -8120791251103518188
      // 1dc: lload 4
      // 1de: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: athrow
      // 1e4: ifne 213
      // 1e7: aload 2
      // 1e8: bipush 0
      // 1e9: aload 2
      // 1ea: aload 3
      // 1eb: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 1ee: bipush 1
      // 1ef: isub
      // 1f0: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f3: astore 12
      // 1f5: aload 1
      // 1f6: aload 12
      // 1f8: ldc2_w -7702638419837458558
      // 1fb: lload 4
      // 1fd: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: checkcast java/lang/String
      // 205: astore 13
      // 207: lload 4
      // 209: lconst_0
      // 20a: lcmp
      // 20b: iflt 229
      // 20e: aload 6
      // 210: ifnonnull 229
      // 213: ldc ""
      // 215: goto 223
      // 218: ldc2_w -8120791251103518188
      // 21b: lload 4
      // 21d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: athrow
      // 223: astore 12
      // 225: ldc ""
      // 227: astore 13
      // 229: aload 13
      // 22b: aload 9
      // 22d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 230: aload 6
      // 232: ifnull 27e
      // 235: ifeq 256
      // 238: goto 246
      // 23b: ldc2_w -8120791251103518188
      // 23e: lload 4
      // 240: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: aload 11
      // 248: astore 14
      // 24a: lload 4
      // 24c: lconst_0
      // 24d: lcmp
      // 24e: iflt 256
      // 251: aload 6
      // 253: ifnonnull 34e
      // 256: aload 9
      // 258: aload 6
      // 25a: ifnull 34c
      // 25d: goto 26b
      // 260: ldc2_w -8120791251103518188
      // 263: lload 4
      // 265: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: athrow
      // 26b: aload 13
      // 26d: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 270: goto 27e
      // 273: ldc2_w -8120791251103518188
      // 276: lload 4
      // 278: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: athrow
      // 27e: ifeq 31e
      // 281: new java/lang/StringBuilder
      // 284: dup
      // 285: invokespecial java/lang/StringBuilder.<init> ()V
      // 288: astore 15
      // 28a: aload 13
      // 28c: invokevirtual java/lang/String.length ()I
      // 28f: istore 16
      // 291: aload 6
      // 293: lload 4
      // 295: lconst_0
      // 296: lcmp
      // 297: iflt 2cf
      // 29a: ifnull 2c6
      // 29d: iload 16
      // 29f: ifne 2d2
      // 2a2: goto 2b0
      // 2a5: ldc2_w -8120791251103518188
      // 2a8: lload 4
      // 2aa: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2af: athrow
      // 2b0: aload 15
      // 2b2: aload 9
      // 2b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b7: pop
      // 2b8: goto 2c6
      // 2bb: ldc2_w -8120791251103518188
      // 2be: lload 4
      // 2c0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: athrow
      // 2c6: lload 4
      // 2c8: lconst_0
      // 2c9: lcmp
      // 2ca: ifle 30b
      // 2cd: aload 6
      // 2cf: ifnonnull 2ef
      // 2d2: aload 15
      // 2d4: aload 9
      // 2d6: iload 16
      // 2d8: bipush 1
      // 2d9: iadd
      // 2da: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e0: pop
      // 2e1: goto 2ef
      // 2e4: ldc2_w -8120791251103518188
      // 2e7: lload 4
      // 2e9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ee: athrow
      // 2ef: aload 15
      // 2f1: sipush 7974
      // 2f4: ldc2_w 6588322535701372523
      // 2f7: lload 4
      // 2f9: lxor
      // 2fa: invokedynamic y (IJ)I bsm=com/zelix/vm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 302: pop
      // 303: aload 15
      // 305: aload 11
      // 307: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30a: pop
      // 30b: aload 15
      // 30d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 310: lload 4
      // 312: lconst_0
      // 313: lcmp
      // 314: ifle 33e
      // 317: astore 14
      // 319: aload 6
      // 31b: ifnonnull 34e
      // 31e: new java/lang/StringBuilder
      // 321: dup
      // 322: invokespecial java/lang/StringBuilder.<init> ()V
      // 325: sipush 762
      // 328: ldc2_w 6090019621007107256
      // 32b: lload 4
      // 32d: lxor
      // 32e: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 336: aload 11
      // 338: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 33e: goto 34c
      // 341: ldc2_w -8120791251103518188
      // 344: lload 4
      // 346: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: athrow
      // 34c: astore 14
      // 34e: aload 14
      // 350: areturn
      // 351: aload 3
      // 352: areturn
   }

   public static String s(Object[] var0) {
      long var1 = (Long)var0[0];
      String var4 = (String)var0[1];
      _8s var3 = (_8s)var0[2];
      var1 = a ^ var1;
      long var5 = var1 ^ 130103623040682L;
      return x44.a<"p">(new Object[]{var5, var4, var3, new wp()}, 965467157423727557L, var1);
   }

   static {
      long var20 = a ^ 117121154118297L;
      String[] var10000 = new String[3];
      x44.a<"r">(var10000, 3045699438056200473L, var20);
      Cipher var11;
      Cipher var25 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var25.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "-å\u0002õ\u001c³wë7N\u0097\u0083gyBÌ\u0010ñQ¿â+(Á\u0098è¢$à\u0082D><\u0010¢]\u009d¿E¸kÜH]\u0084hþéç\"";
      int var17 = "-å\u0002õ\u001c³wë7N\u0097\u0083gyBÌ\u0010ñQ¿â+(Á\u0098è¢$à\u0082D><\u0010¢]\u009d¿E¸kÜH]\u0084hþéç\"".length();
      char var14 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var26 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
            String var37 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var37;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[5];
                     i = new HashMap(13);
                     Cipher var0;
                     Cipher var28 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var28.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "Q¬ìwá\u0002j¾\u008eÌÌâ\u009bC\"\u0002";
                     int var5 = "Q¬ìwá\u0002j¾\u008eÌÌâ\u009bC\"\u0002".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var29 = var6;
                        var10001 = var3++;
                        long var41 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var44 = -1;

                        while (true) {
                           long var8 = var41;
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
                           long var46 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var44) {
                              case 0:
                                 var29[var10001] = var46;
                                 if (var2 >= var5) {
                                    f = var6;
                                    h = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var29[var10001] = var46;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "î.³*¥{h\u00837ñÇÞ\u0089Vàé";
                                 var5 = "î.³*¥{h\u00837ñÇÞ\u0089Vàé".length();
                                 var2 = 0;
                           }

                           byte var35 = var2;
                           var2 += 8;
                           var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                           var29 = var6;
                           var10001 = var3++;
                           var41 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var44 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var37;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "3CnK÷YfÓ\u0004\u000e§!Ò\u0002£D\u0010¨0\u0094R\u009f\u009f\u0081!\b\u008ctÁUãû\u0089";
                  var17 = "3CnK÷YfÓ\u0004\u000e§!Ò\u0002£D\u0010¨0\u0094R\u009f\u009f\u0081!\b\u008ctÁUãû\u0089".length();
                  var14 = 16;
                  var24 = -1;
            }

            var26 = var15.substring(++var24, var24 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9592;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/vm", var10);
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
         throw new RuntimeException("com/zelix/vm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17012;
      if (h[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/vm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/vm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
