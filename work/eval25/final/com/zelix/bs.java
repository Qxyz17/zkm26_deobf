package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class bs extends bf {
   ij[] E;
   private static final long d = ess.a(-3317148835076109381L, -6169334608016161634L, MethodHandles.lookup().lookupClass()).a(183992543316115L);
   private static final String[] f;
   private static final String[] g;
   private static final Map i = new HashMap(13);

   public void E(Object[] var1) {
      _yv var7 = (_yv)var1[0];
      _ug var6 = (_ug)var1[1];
      long var4 = (Long)var1[2];
      ei var2 = (ei)var1[3];
      _ur var3 = (_ur)var1[4];
      long var8 = var4 ^ 69512517282039L;
      boolean var10 = x44.a<"u">(-9107203921384787466L, var4);

      byte var10000;
      label28: {
         try {
            var10000 = x44.a<"i">(this, -8981630423852176004L, var4);
            if (!var10) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var12) {
            throw x44.a<"u">(var12, -6959932385541228578L, var4);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < x44.a<"i">(this, -9217116981246260473L, var4).length) {
         x44.a<"m">(x44.a<"i">(this, -9217116981246260473L, var4)[var11], new Object[]{var6, var2, var8, var3}, -7253833923259071475L, var4);
         var11++;
         if (!var10) {
            break;
         }
      }
   }

   public void Y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 82283159740056L;
      boolean var6 = x44.a<"s">(-3069775829819662047L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = x44.a<"o">(this, -3831160656607419150L, var2);
            if (var6) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var8) {
            throw x44.a<"s">(var8, -2961267079521059248L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < x44.a<"o">(this, -3920359382392651127L, var2).length) {
         x44.a<"k">(x44.a<"o">(this, -3920359382392651127L, var2)[var7], new Object[]{var4}, -3105469655126740702L, var2);
         var7++;
         if (var6) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public ij s(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      boolean var5 = (Boolean)var1[2];
      var2 = d ^ var2;
      long var6 = var2 ^ 13323938708436L;
      long var8 = var2 ^ 93093289513048L;
      boolean var10 = x44.a<"r">(-3351905245241220847L, var2);

      byte var10000;
      label65: {
         try {
            var10000 = x44.a<"n">(this, -3189178496043483749L, var2);
            if (!var10) {
               break label65;
            }

            if (var10000 == 0) {
               return null;
            }
         } catch (gj var15) {
            throw x44.a<"r">(var15, -3490764804599863495L, var2);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < x44.a<"n">(this, -3390879249389265952L, var2).length) {
         label55: {
            String var12;
            label54: {
               if (var5) {
                  var12 = x44.a<"j">(x44.a<"n">(this, -3390879249389265952L, var2)[var11], new Object[]{var8}, -3601384782006803887L, var2);
                  var17 = var10;
                  if (var2 <= 0L) {
                     break label55;
                  }

                  if (var10) {
                     break label54;
                  }
               }

               var12 = x44.a<"j">(x44.a<"n">(this, -3390879249389265952L, var2)[var11], new Object[]{var6}, -3587373951573332621L, var2);
            }

            try {
               var17 = var4.equals(var12);
            } catch (gj var14) {
               boolean var10001 = false;
               throw x44.a<"r">(var14, -3490764804599863495L, var2);
            }
         }

         label44: {
            try {
               if (var2 <= 0L) {
                  break label44;
               }

               if (var17) {
                  return x44.a<"n">(this, -3390879249389265952L, var2)[var11];
               }
            } catch (gj var13) {
               boolean var19 = false;
               throw x44.a<"r">(var13, -3490764804599863495L, var2);
            }

            var11++;
            var17 = var10;
         }

         if (!var17) {
            break;
         }
      }

      return null;
   }

   public void G(Object[] var1) {
      Set var4 = (Set)var1[0];
      long var2 = (Long)var1[1];
      long var5 = var2 ^ 31907941211067L;
      boolean var7 = x44.a<"q">(-679861960243362054L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = x44.a<"m">(this, -840266747045520784L, var2);
            if (!var7) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var9) {
            throw x44.a<"q">(var9, -1700872806093848366L, var2);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (var8 < x44.a<"m">(this, -641152032024232949L, var2).length) {
         x44.a<"i">(x44.a<"m">(this, -641152032024232949L, var2)[var8], new Object[]{var5, var4}, -1531721234721476210L, var2);
         var8++;
         if (!var7) {
            break;
         }
      }
   }

   int w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      return x44.a<"j">(this, -3049747813560164676L, var2).length;
   }

   public boolean z(Object[] param1) {
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
      // 004: checkcast com/zelix/_ue
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_ur
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/io/PrintWriter
      // 021: astore 2
      // 022: pop
      // 023: lload 3
      // 024: dup2
      // 025: ldc2_w 135969088811257
      // 028: lxor
      // 029: lstore 7
      // 02b: dup2
      // 02c: ldc2_w 84682767183806
      // 02f: lxor
      // 030: lstore 9
      // 032: dup2
      // 033: ldc2_w 16041231820442
      // 036: lxor
      // 037: lstore 11
      // 039: dup2
      // 03a: ldc2_w 138793644550972
      // 03d: lxor
      // 03e: lstore 13
      // 040: dup2
      // 041: ldc2_w 119829933642006
      // 044: lxor
      // 045: lstore 15
      // 047: dup2
      // 048: ldc2_w 117584872142572
      // 04b: lxor
      // 04c: lstore 17
      // 04e: pop2
      // 04f: ldc2_w -8430189259299046549
      // 052: lload 3
      // 053: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: istore 19
      // 05a: aload 0
      // 05b: ldc2_w -8518678031365494815
      // 05e: lload 3
      // 05f: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: iload 19
      // 066: ifeq 2f1
      // 069: ifeq 2f0
      // 06c: goto 079
      // 06f: ldc2_w -7641447898472121021
      // 072: lload 3
      // 073: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: bipush 0
      // 07a: istore 20
      // 07c: bipush 1
      // 07d: istore 21
      // 07f: new java/util/ArrayList
      // 082: dup
      // 083: invokespecial java/util/ArrayList.<init> ()V
      // 086: astore 22
      // 088: bipush 0
      // 089: istore 23
      // 08b: iload 23
      // 08d: aload 0
      // 08e: ldc2_w -8463533424678633062
      // 091: lload 3
      // 092: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: arraylength
      // 098: if_icmpge 2ed
      // 09b: aload 0
      // 09c: ldc2_w -8463533424678633062
      // 09f: lload 3
      // 0a0: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: iload 23
      // 0a7: aaload
      // 0a8: astore 24
      // 0aa: aload 24
      // 0ac: lload 17
      // 0ae: bipush 1
      // 0af: anewarray 295
      // 0b2: dup_x2
      // 0b3: dup_x2
      // 0b4: pop
      // 0b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b8: bipush 0
      // 0b9: swap
      // 0ba: aastore
      // 0bb: ldc2_w -8418494451053547783
      // 0be: lload 3
      // 0bf: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: astore 25
      // 0c6: aload 5
      // 0c8: aload 25
      // 0ca: lload 15
      // 0cc: bipush 2
      // 0cd: anewarray 295
      // 0d0: dup_x2
      // 0d1: dup_x2
      // 0d2: pop
      // 0d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d6: bipush 1
      // 0d7: swap
      // 0d8: aastore
      // 0d9: dup_x1
      // 0da: swap
      // 0db: bipush 0
      // 0dc: swap
      // 0dd: aastore
      // 0de: ldc2_w -8498332937972078430
      // 0e1: lload 3
      // 0e2: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: iload 19
      // 0e9: lload 3
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: iflt 0f4
      // 0ef: ifeq 2ef
      // 0f2: iload 19
      // 0f4: ifeq 29d
      // 0f7: goto 104
      // 0fa: ldc2_w -7641447898472121021
      // 0fd: lload 3
      // 0fe: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: ifeq 28f
      // 107: goto 114
      // 10a: ldc2_w -7641447898472121021
      // 10d: lload 3
      // 10e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: aload 22
      // 116: aload 24
      // 118: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 11d: pop
      // 11e: bipush 0
      // 11f: istore 21
      // 121: new java/lang/StringBuilder
      // 124: dup
      // 125: invokespecial java/lang/StringBuilder.<init> ()V
      // 128: sipush 6879
      // 12b: ldc2_w 4472085120248682668
      // 12e: lload 3
      // 12f: lxor
      // 130: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 138: aload 0
      // 139: bipush 0
      // 13a: anewarray 295
      // 13d: ldc2_w -8491719658665068397
      // 140: lload 3
      // 141: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 149: sipush 28854
      // 14c: lload 3
      // 14d: lconst_0
      // 14e: lcmp
      // 14f: ifle 172
      // 152: ldc2_w 8175686908270047944
      // 155: lload 3
      // 156: lxor
      // 157: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: iload 19
      // 15e: ifeq 191
      // 161: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 164: aload 0
      // 165: bipush 0
      // 166: anewarray 295
      // 169: ldc2_w -8327307875753977279
      // 16c: lload 3
      // 16d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: ifeq 194
      // 175: goto 182
      // 178: ldc2_w -7641447898472121021
      // 17b: lload 3
      // 17c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: ldc ""
      // 184: goto 191
      // 187: ldc2_w -7641447898472121021
      // 18a: lload 3
      // 18b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: goto 1cf
      // 194: new java/lang/StringBuilder
      // 197: dup
      // 198: invokespecial java/lang/StringBuilder.<init> ()V
      // 19b: ldc "'"
      // 19d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a0: aload 0
      // 1a1: lload 7
      // 1a3: bipush 1
      // 1a4: anewarray 295
      // 1a7: dup_x2
      // 1a8: dup_x2
      // 1a9: pop
      // 1aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ad: bipush 0
      // 1ae: swap
      // 1af: aastore
      // 1b0: ldc2_w -8591897758050952770
      // 1b3: lload 3
      // 1b4: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bc: sipush 20408
      // 1bf: ldc2_w 5444588234594045383
      // 1c2: lload 3
      // 1c3: lxor
      // 1c4: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d2: sipush 26664
      // 1d5: ldc2_w 996842840081328720
      // 1d8: lload 3
      // 1d9: lxor
      // 1da: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e2: aload 0
      // 1e3: lload 13
      // 1e5: invokevirtual com/zelix/bs.o (J)Ljava/lang/String;
      // 1e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1eb: sipush 14734
      // 1ee: ldc2_w 8241389744911629306
      // 1f1: lload 3
      // 1f2: lxor
      // 1f3: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fb: aload 25
      // 1fd: lload 11
      // 1ff: invokevirtual com/zelix/hz.q (J)Ljava/lang/String;
      // 202: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 205: sipush 30004
      // 208: ldc2_w 6925347809205352261
      // 20b: lload 3
      // 20c: lxor
      // 20d: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 215: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 218: astore 26
      // 21a: iload 19
      // 21c: lload 3
      // 21d: lconst_0
      // 21e: lcmp
      // 21f: iflt 286
      // 222: ifeq 284
      // 225: aload 6
      // 227: ldc2_w -7659697782222838752
      // 22a: lload 3
      // 22b: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: ifeq 27e
      // 233: goto 240
      // 236: ldc2_w -7641447898472121021
      // 239: lload 3
      // 23a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: aload 6
      // 242: lload 9
      // 244: bipush 1
      // 245: anewarray 295
      // 248: dup_x2
      // 249: dup_x2
      // 24a: pop
      // 24b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24e: bipush 0
      // 24f: swap
      // 250: aastore
      // 251: ldc2_w -7925170628590340812
      // 254: lload 3
      // 255: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: new java/lang/StringBuilder
      // 25d: dup
      // 25e: invokespecial java/lang/StringBuilder.<init> ()V
      // 261: ldc "\t"
      // 263: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 266: aload 26
      // 268: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 26e: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 271: goto 27e
      // 274: ldc2_w -7641447898472121021
      // 277: lload 3
      // 278: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: athrow
      // 27e: aload 2
      // 27f: aload 26
      // 281: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 284: iload 19
      // 286: lload 3
      // 287: lconst_0
      // 288: lcmp
      // 289: ifle 2a1
      // 28c: ifne 29f
      // 28f: bipush 1
      // 290: goto 29d
      // 293: ldc2_w -7641447898472121021
      // 296: lload 3
      // 297: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29c: athrow
      // 29d: istore 20
      // 29f: iload 20
      // 2a1: iload 19
      // 2a3: ifeq 2ca
      // 2a6: ifeq 2e5
      // 2a9: goto 2b6
      // 2ac: ldc2_w -7641447898472121021
      // 2af: lload 3
      // 2b0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: athrow
      // 2b6: aload 22
      // 2b8: invokeinterface java/util/List.size ()I 1
      // 2bd: goto 2ca
      // 2c0: ldc2_w -7641447898472121021
      // 2c3: lload 3
      // 2c4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c9: athrow
      // 2ca: anewarray 435
      // 2cd: astore 26
      // 2cf: aload 0
      // 2d0: aload 22
      // 2d2: aload 26
      // 2d4: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 2d9: checkcast [Lcom/zelix/ij;
      // 2dc: ldc2_w -8463533424678633062
      // 2df: lload 3
      // 2e0: invokedynamic s (Ljava/lang/Object;[Lcom/zelix/ij;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: iinc 23 1
      // 2e8: iload 19
      // 2ea: ifne 08b
      // 2ed: iload 21
      // 2ef: ireturn
      // 2f0: bipush 0
      // 2f1: ireturn
   }

   public void L(Object[] var1) {
      Set var2 = (Set)var1[0];
      long var5 = (Long)var1[1];
      Set var4 = (Set)var1[2];
      Set var3 = (Set)var1[3];
      Set var7 = (Set)var1[4];
      long var8 = var5 ^ 42185617440804L;
      boolean var10 = x44.a<"q">(-175683018576180789L, var5);

      byte var10000;
      label28: {
         try {
            var10000 = x44.a<"m">(this, -2144041409982739432L, var5);
            if (var10) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var12) {
            throw x44.a<"q">(var12, -140357762660919622L, var5);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < x44.a<"m">(this, -2201631341229118877L, var5).length) {
         x44.a<"i">(x44.a<"m">(this, -2201631341229118877L, var5)[var11], new Object[]{var2, var4, var3, var7, var8}, -573506460239062235L, var5);
         var11++;
         if (var10) {
            break;
         }
      }
   }

   protected void j(Object[] param1) {
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
      // 004: checkcast java/io/DataOutputStream
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_ur
      // 021: astore 2
      // 022: pop
      // 023: lload 3
      // 024: dup2
      // 025: ldc2_w 0
      // 028: lxor
      // 029: lstore 7
      // 02b: dup2
      // 02c: ldc2_w 116287516140676
      // 02f: lxor
      // 030: lstore 9
      // 032: pop2
      // 033: ldc2_w -3106497998795710297
      // 036: lload 3
      // 037: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 0
      // 03d: aload 6
      // 03f: lload 7
      // 041: aload 5
      // 043: aload 2
      // 044: bipush 4
      // 045: anewarray 295
      // 048: dup_x1
      // 049: swap
      // 04a: bipush 3
      // 04b: swap
      // 04c: aastore
      // 04d: dup_x1
      // 04e: swap
      // 04f: bipush 2
      // 050: swap
      // 051: aastore
      // 052: dup_x2
      // 053: dup_x2
      // 054: pop
      // 055: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 058: bipush 1
      // 059: swap
      // 05a: aastore
      // 05b: dup_x1
      // 05c: swap
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: invokespecial com/zelix/bf.j ([Ljava/lang/Object;)V
      // 063: istore 11
      // 065: aload 0
      // 066: ldc2_w -3795817549990238860
      // 069: lload 3
      // 06a: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: iload 11
      // 071: ifne 0a2
      // 074: ifeq 11e
      // 077: goto 084
      // 07a: ldc2_w -2927057298767233066
      // 07d: lload 3
      // 07e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: aload 6
      // 086: aload 0
      // 087: ldc2_w -4026672940928417009
      // 08a: lload 3
      // 08b: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: arraylength
      // 091: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 094: bipush 0
      // 095: goto 0a2
      // 098: ldc2_w -2927057298767233066
      // 09b: lload 3
      // 09c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: istore 12
      // 0a4: iload 12
      // 0a6: aload 0
      // 0a7: ldc2_w -4026672940928417009
      // 0aa: lload 3
      // 0ab: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: arraylength
      // 0b1: if_icmpge 113
      // 0b4: aload 0
      // 0b5: ldc2_w -4026672940928417009
      // 0b8: lload 3
      // 0b9: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: iload 12
      // 0c0: aaload
      // 0c1: aload 6
      // 0c3: lload 9
      // 0c5: aload 5
      // 0c7: aload 2
      // 0c8: bipush 4
      // 0c9: anewarray 295
      // 0cc: dup_x1
      // 0cd: swap
      // 0ce: bipush 3
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: bipush 2
      // 0d4: swap
      // 0d5: aastore
      // 0d6: dup_x2
      // 0d7: dup_x2
      // 0d8: pop
      // 0d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dc: bipush 1
      // 0dd: swap
      // 0de: aastore
      // 0df: dup_x1
      // 0e0: swap
      // 0e1: bipush 0
      // 0e2: swap
      // 0e3: aastore
      // 0e4: ldc2_w -3042284813290867894
      // 0e7: lload 3
      // 0e8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: iinc 12 1
      // 0f0: iload 11
      // 0f2: lload 3
      // 0f3: lconst_0
      // 0f4: lcmp
      // 0f5: iflt 0fd
      // 0f8: ifne 13a
      // 0fb: iload 11
      // 0fd: ifeq 0a4
      // 100: lload 3
      // 101: lconst_0
      // 102: lcmp
      // 103: iflt 0f0
      // 106: goto 113
      // 109: ldc2_w -2927057298767233066
      // 10c: lload 3
      // 10d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: lload 3
      // 114: lconst_0
      // 115: lcmp
      // 116: iflt 12d
      // 119: iload 11
      // 11b: ifeq 13a
      // 11e: aload 6
      // 120: aload 0
      // 121: ldc2_w -4010137101812909442
      // 124: lload 3
      // 125: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: invokevirtual java/io/DataOutputStream.write ([B)V
      // 12d: goto 13a
      // 130: ldc2_w -2927057298767233066
      // 133: lload 3
      // 134: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: return
   }

   public void N(long var1, _8l var3) {
      long var4 = var1 ^ 0L;
      long var6 = var1 ^ 10727274753381L;
      byte var10000 = x44.a<"w">(-6348162585463318644L, var1);
      var3.H(this.c, this, this.x(), var6);
      boolean var8 = (boolean)var10000;

      label28: {
         try {
            var10000 = x44.a<"k">(this, -6548045577707648250L, var1);
            if (!var8) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var10) {
            throw x44.a<"w">(var10, -5110697357179367004L, var1);
         }

         var10000 = 0;
      }

      int var9 = var10000;

      while (var9 < x44.a<"k">(this, -6454707772649853571L, var1).length) {
         x44.a<"o">(x44.a<"k">(this, -6454707772649853571L, var1)[var9], var4, var3, -6619829722399573103L, var1);
         var9++;
         if (!var8) {
            break;
         }
      }
   }

   bs(h8 param1, int param2, String param3, _xx param4, long param5, _y4 param7, PrintWriter param8, String param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/bs.d J
      // 003: lload 5
      // 005: lxor
      // 006: lstore 5
      // 008: lload 5
      // 00a: dup2
      // 00b: ldc2_w 57758872067996
      // 00e: lxor
      // 00f: lstore 10
      // 011: dup2
      // 012: ldc2_w 24207386263947
      // 015: lxor
      // 016: lstore 12
      // 018: dup2
      // 019: ldc2_w 41342514572001
      // 01c: lxor
      // 01d: lstore 14
      // 01f: dup2
      // 020: ldc2_w 121996987094408
      // 023: lxor
      // 024: lstore 16
      // 026: dup2
      // 027: ldc2_w 40190103537383
      // 02a: lxor
      // 02b: lstore 18
      // 02d: dup2
      // 02e: ldc2_w 14330111967018
      // 031: lxor
      // 032: lstore 20
      // 034: pop2
      // 035: ldc2_w 1177918668278473756
      // 038: lload 5
      // 03a: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: aload 0
      // 040: aload 1
      // 041: iload 2
      // 042: aload 3
      // 043: aload 4
      // 045: lload 18
      // 047: aload 7
      // 049: invokespecial com/zelix/bf.<init> (Lcom/zelix/h8;ILjava/lang/String;Lcom/zelix/_xx;JLcom/zelix/_y4;)V
      // 04c: aload 0
      // 04d: getfield com/zelix/bs.C I
      // 050: newarray 8
      // 052: astore 23
      // 054: aload 4
      // 056: aload 23
      // 058: invokevirtual com/zelix/_xx.read ([B)I
      // 05b: pop
      // 05c: istore 22
      // 05e: aload 23
      // 060: lload 16
      // 062: bipush 0
      // 063: bipush 3
      // 064: anewarray 295
      // 067: dup_x1
      // 068: swap
      // 069: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 06c: bipush 2
      // 06d: swap
      // 06e: aastore
      // 06f: dup_x2
      // 070: dup_x2
      // 071: pop
      // 072: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 075: bipush 1
      // 076: swap
      // 077: aastore
      // 078: dup_x1
      // 079: swap
      // 07a: bipush 0
      // 07b: swap
      // 07c: aastore
      // 07d: ldc2_w 578207623031848821
      // 080: lload 5
      // 082: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/_xx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: astore 24
      // 089: aload 0
      // 08a: iload 22
      // 08c: ifne 235
      // 08f: getfield com/zelix/bs.C I
      // 092: bipush 2
      // 093: if_icmplt 21a
      // 096: goto 0a4
      // 099: ldc2_w 1430542331321809773
      // 09c: lload 5
      // 09e: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 24
      // 0a6: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0a9: istore 25
      // 0ab: aload 0
      // 0ac: iload 25
      // 0ae: anewarray 435
      // 0b1: ldc2_w 911182902720661428
      // 0b4: lload 5
      // 0b6: invokedynamic u (Ljava/lang/Object;[Lcom/zelix/ij;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: bipush 0
      // 0bc: istore 26
      // 0be: iload 26
      // 0c0: iload 25
      // 0c2: if_icmpge 207
      // 0c5: aload 0
      // 0c6: ldc2_w 911182902720661428
      // 0c9: lload 5
      // 0cb: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: iload 26
      // 0d2: aload 0
      // 0d3: lload 10
      // 0d5: aload 24
      // 0d7: aload 7
      // 0d9: bipush 4
      // 0da: anewarray 295
      // 0dd: dup_x1
      // 0de: swap
      // 0df: bipush 3
      // 0e0: swap
      // 0e1: aastore
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: bipush 2
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x2
      // 0e8: dup_x2
      // 0e9: pop
      // 0ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed: bipush 1
      // 0ee: swap
      // 0ef: aastore
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: bipush 0
      // 0f3: swap
      // 0f4: aastore
      // 0f5: ldc2_w 1709106043909980857
      // 0f8: lload 5
      // 0fa: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: aastore
      // 100: iload 22
      // 102: lload 5
      // 104: lconst_0
      // 105: lcmp
      // 106: iflt 10e
      // 109: ifne 2a4
      // 10c: iload 22
      // 10e: lload 5
      // 110: lconst_0
      // 111: lcmp
      // 112: ifle 204
      // 115: ifne 202
      // 118: goto 126
      // 11b: ldc2_w 1430542331321809773
      // 11e: lload 5
      // 120: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: aload 0
      // 127: ldc2_w 911182902720661428
      // 12a: lload 5
      // 12c: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: iload 26
      // 133: aaload
      // 134: lload 12
      // 136: bipush 1
      // 137: anewarray 295
      // 13a: dup_x2
      // 13b: dup_x2
      // 13c: pop
      // 13d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 140: bipush 0
      // 141: swap
      // 142: aastore
      // 143: ldc2_w 604661182412126375
      // 146: lload 5
      // 148: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: ifne 1ff
      // 150: goto 15e
      // 153: ldc2_w 1430542331321809773
      // 156: lload 5
      // 158: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: aload 0
      // 15f: bipush 0
      // 160: ldc2_w 1146661171013132751
      // 163: lload 5
      // 165: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: aload 0
      // 16b: aload 23
      // 16d: ldc2_w 928427359362121413
      // 170: lload 5
      // 172: invokedynamic u (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: aload 8
      // 179: new java/lang/StringBuilder
      // 17c: dup
      // 17d: invokespecial java/lang/StringBuilder.<init> ()V
      // 180: sipush 28438
      // 183: ldc2_w 1390012944670190405
      // 186: lload 5
      // 188: lxor
      // 189: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 191: aload 0
      // 192: lload 14
      // 194: invokevirtual com/zelix/bs.j (J)Ljava/lang/String;
      // 197: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19a: sipush 17685
      // 19d: ldc2_w 7567892031630885184
      // 1a0: lload 5
      // 1a2: lxor
      // 1a3: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ab: aload 9
      // 1ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b0: sipush 26172
      // 1b3: ldc2_w 6435296905952453218
      // 1b6: lload 5
      // 1b8: lxor
      // 1b9: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c1: aload 0
      // 1c2: ldc2_w 911182902720661428
      // 1c5: lload 5
      // 1c7: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: iload 26
      // 1ce: aaload
      // 1cf: lload 20
      // 1d1: bipush 1
      // 1d2: anewarray 295
      // 1d5: dup_x2
      // 1d6: dup_x2
      // 1d7: pop
      // 1d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1db: bipush 0
      // 1dc: swap
      // 1dd: aastore
      // 1de: ldc2_w 1490555141518295357
      // 1e1: lload 5
      // 1e3: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ee: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1f1: goto 1ff
      // 1f4: ldc2_w 1430542331321809773
      // 1f7: lload 5
      // 1f9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: athrow
      // 1ff: iinc 26 1
      // 202: iload 22
      // 204: ifeq 0be
      // 207: lload 5
      // 209: lconst_0
      // 20a: lcmp
      // 20b: ifle 2a4
      // 20e: iload 22
      // 210: lload 5
      // 212: lconst_0
      // 213: lcmp
      // 214: ifle 102
      // 217: ifeq 298
      // 21a: aload 0
      // 21b: bipush 0
      // 21c: ldc2_w 1146661171013132751
      // 21f: lload 5
      // 221: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: aload 0
      // 227: goto 235
      // 22a: ldc2_w 1430542331321809773
      // 22d: lload 5
      // 22f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: aload 23
      // 237: ldc2_w 928427359362121413
      // 23a: lload 5
      // 23c: invokedynamic u (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: aload 8
      // 243: new java/lang/StringBuilder
      // 246: dup
      // 247: invokespecial java/lang/StringBuilder.<init> ()V
      // 24a: sipush 16044
      // 24d: ldc2_w 5445251653127191288
      // 250: lload 5
      // 252: lxor
      // 253: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25b: aload 0
      // 25c: lload 14
      // 25e: invokevirtual com/zelix/bs.j (J)Ljava/lang/String;
      // 261: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 264: sipush 25548
      // 267: ldc2_w 7931137961422415760
      // 26a: lload 5
      // 26c: lxor
      // 26d: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 275: aload 9
      // 277: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27a: sipush 4872
      // 27d: ldc2_w 1977259821062821727
      // 280: lload 5
      // 282: lxor
      // 283: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28b: aload 0
      // 28c: getfield com/zelix/bs.C I
      // 28f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 292: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 295: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 298: aload 24
      // 29a: ldc2_w 638982116057982731
      // 29d: lload 5
      // 29f: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a4: goto 337
      // 2a7: astore 25
      // 2a9: aload 0
      // 2aa: bipush 0
      // 2ab: ldc2_w 1146661171013132751
      // 2ae: lload 5
      // 2b0: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: aload 0
      // 2b6: aload 23
      // 2b8: ldc2_w 928427359362121413
      // 2bb: lload 5
      // 2bd: invokedynamic u (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: aload 8
      // 2c4: new java/lang/StringBuilder
      // 2c7: dup
      // 2c8: invokespecial java/lang/StringBuilder.<init> ()V
      // 2cb: sipush 16044
      // 2ce: ldc2_w 5445251653127191288
      // 2d1: lload 5
      // 2d3: lxor
      // 2d4: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2dc: aload 0
      // 2dd: lload 14
      // 2df: invokevirtual com/zelix/bs.j (J)Ljava/lang/String;
      // 2e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e5: sipush 25548
      // 2e8: ldc2_w 7931137961422415760
      // 2eb: lload 5
      // 2ed: lxor
      // 2ee: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f6: aload 9
      // 2f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fb: sipush 17484
      // 2fe: ldc2_w 5720409129131393054
      // 301: lload 5
      // 303: lxor
      // 304: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/bs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 309: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30c: aload 25
      // 30e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 311: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 314: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 317: aload 24
      // 319: ldc2_w 638982116057982731
      // 31c: lload 5
      // 31e: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: goto 337
      // 326: astore 27
      // 328: aload 24
      // 32a: ldc2_w 638982116057982731
      // 32d: lload 5
      // 32f: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: aload 27
      // 336: athrow
      // 337: return
   }

   public void i(Object[] var1) {
      int var5 = (Integer)var1[0];
      int var6 = (Integer)var1[1];
      HashMap var7 = (HashMap)var1[2];
      HashMap var4 = (HashMap)var1[3];
      long var2 = (Long)var1[4];
      long var8 = var2 ^ 101411721701567L;
      boolean var10 = x44.a<"s">(4349794608319891481L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = x44.a<"o">(this, 2588619453896035786L, var2);
            if (var10) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var12) {
            throw x44.a<"s">(var12, 4602418527398483816L, var2);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < x44.a<"o">(this, 2351004257031302065L, var2).length) {
         x44.a<"k">(x44.a<"o">(this, 2351004257031302065L, var2)[var11], new Object[]{var8, var7, var4}, 2761714781533950609L, var2);
         var11++;
         if (var10) {
            break;
         }
      }
   }

   public String[] v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      long var4 = var2 ^ 92079220653557L;
      byte var6 = x44.a<"s">(733400803547496041L, var2);

      label66: {
         try {
            byte var10000 = x44.a<"o">(this, 1557291846321683386L, var2);
            if (var6 != 0) {
               return new String[var10000];
            }

            if (var10000 != 0) {
               break label66;
            }
         } catch (gj var10) {
            throw x44.a<"s">(var10, 697794365853884696L, var2);
         }

         return new String[0];
      }

      String[] var7 = new String[x44.a<"o">(this, 1643940209755561409L, var2).length];
      int var8 = 0;

      while (var8 < x44.a<"o">(this, 1643940209755561409L, var2).length) {
         try {
            int var10001 = var6;
            if (var2 >= 0L) {
               if (var6 != 0) {
                  return var7;
               }

               var10001 = var8;
            }

            var7[var10001] = x44.a<"k">(x44.a<"o">(this, 1643940209755561409L, var2)[var8], new Object[]{var4}, 582734313161075538L, var2);
            var8++;
            if (var6 == 0) {
               continue;
            }
         } catch (gj var9) {
            throw x44.a<"s">(var9, 697794365853884696L, var2);
         }

         if (var2 >= 0L) {
            break;
         }
      }

      return var7;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   int x(long var1) {
      long var3 = var1 ^ 9858694472928L;
      byte var5 = x44.a<"w">(916934895870556413L, var1);

      label76: {
         try {
            byte var10000 = x44.a<"k">(this, 1371513101512654126L, var1);
            if (var5 != 0) {
               return var10000;
            }

            if (var10000 != 0) {
               break label76;
            }
         } catch (gj var13) {
            throw x44.a<"w">(var13, 1097500687800231820L, var1);
         }

         return x44.a<"k">(this, 1153830147368182308L, var1).length;
      }

      int var6 = 2;
      ij[] var7 = x44.a<"k">(this, 1172195539473603413L, var1);
      int var8 = var7.length;
      int var9 = 0;

      label47:
      while (var9 < var8) {
         ij var10 = var7[var9];
         var6 += x44.a<"o">(var10, new Object[]{var3}, 1373687979499687839L, var1);

         try {
            var9++;
         } catch (gj var12) {
            boolean var10001 = false;
            throw x44.a<"w">(var12, 1097500687800231820L, var1);
         }

         do {
            try {
               if (var1 < 0L) {
                  return var5;
               }

               if (var5 != 0) {
                  return var6;
               }

               if (var5 == 0) {
                  continue label47;
               }
            } catch (gj var11) {
               boolean var16 = false;
               throw x44.a<"w">(var11, 1097500687800231820L, var1);
            }
         } while (var1 <= 0L);
         break;
      }

      this.C = var6;
      return var6;
   }

   protected void O(Object[] param1) {
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
      // 00e: checkcast java/io/DataOutputStream
      // 011: astore 4
      // 013: pop
      // 014: lload 2
      // 015: dup2
      // 016: ldc2_w 63022419844887
      // 019: lxor
      // 01a: lstore 5
      // 01c: dup2
      // 01d: ldc2_w 0
      // 020: lxor
      // 021: lstore 7
      // 023: pop2
      // 024: ldc2_w -7740090294292667137
      // 027: lload 2
      // 028: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 0
      // 02e: lload 7
      // 030: aload 4
      // 032: bipush 2
      // 033: anewarray 295
      // 036: dup_x1
      // 037: swap
      // 038: bipush 1
      // 039: swap
      // 03a: aastore
      // 03b: dup_x2
      // 03c: dup_x2
      // 03d: pop
      // 03e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 041: bipush 0
      // 042: swap
      // 043: aastore
      // 044: invokespecial com/zelix/bf.O ([Ljava/lang/Object;)V
      // 047: istore 9
      // 049: aload 0
      // 04a: ldc2_w -7614518121811986315
      // 04d: lload 2
      // 04e: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: iload 9
      // 055: ifeq 086
      // 058: ifeq 0f5
      // 05b: goto 068
      // 05e: ldc2_w -8475703076945141033
      // 061: lload 2
      // 062: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 4
      // 06a: aload 0
      // 06b: ldc2_w -7701399062193070578
      // 06e: lload 2
      // 06f: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: arraylength
      // 075: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 078: bipush 0
      // 079: goto 086
      // 07c: ldc2_w -8475703076945141033
      // 07f: lload 2
      // 080: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: istore 10
      // 088: iload 10
      // 08a: aload 0
      // 08b: ldc2_w -7701399062193070578
      // 08e: lload 2
      // 08f: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: arraylength
      // 095: if_icmpge 0ea
      // 098: aload 0
      // 099: ldc2_w -7701399062193070578
      // 09c: lload 2
      // 09d: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: iload 10
      // 0a4: aaload
      // 0a5: lload 5
      // 0a7: aload 4
      // 0a9: bipush 2
      // 0aa: anewarray 295
      // 0ad: dup_x1
      // 0ae: swap
      // 0af: bipush 1
      // 0b0: swap
      // 0b1: aastore
      // 0b2: dup_x2
      // 0b3: dup_x2
      // 0b4: pop
      // 0b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b8: bipush 0
      // 0b9: swap
      // 0ba: aastore
      // 0bb: ldc2_w -8276908260505217876
      // 0be: lload 2
      // 0bf: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: iinc 10 1
      // 0c7: iload 9
      // 0c9: lload 2
      // 0ca: lconst_0
      // 0cb: lcmp
      // 0cc: iflt 0d4
      // 0cf: ifeq 111
      // 0d2: iload 9
      // 0d4: ifne 088
      // 0d7: lload 2
      // 0d8: lconst_0
      // 0d9: lcmp
      // 0da: iflt 0c7
      // 0dd: goto 0ea
      // 0e0: ldc2_w -8475703076945141033
      // 0e3: lload 2
      // 0e4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: lload 2
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: iflt 104
      // 0f0: iload 9
      // 0f2: ifne 111
      // 0f5: aload 4
      // 0f7: aload 0
      // 0f8: ldc2_w -7685285436080527489
      // 0fb: lload 2
      // 0fc: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: invokevirtual java/io/DataOutputStream.write ([B)V
      // 104: goto 111
      // 107: ldc2_w -8475703076945141033
      // 10a: lload 2
      // 10b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: return
   }

   public void a(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 51011812406161L;
      boolean var6 = x44.a<"s">(-5862902154757497144L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = x44.a<"o">(this, -6024504086329753022L, var2);
            if (!var6) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (gj var8) {
            throw x44.a<"s">(var8, -5740077855177582368L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < x44.a<"o">(this, -5825327828676729799L, var2).length) {
         x44.a<"k">(x44.a<"o">(this, -5825327828676729799L, var2)[var7], new Object[]{var4}, -6324502382300723895L, var2);
         var7++;
         if (!var6) {
            break;
         }
      }
   }

   static {
      long var0 = d ^ 132716519532954L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = "\u009aâ²¥Ú\u0088\u0011\u0006÷Þ\u0016\"+¤pÖ 8àý\u008a\u0006\u0096thÊñè\u009c&ç]X-Ï\u001bÙÿÖh\b\u0011Îg`¼\u0018\u009d\u0006\u0010Fu\u0088»wS4/ö3\u0010/m¾Øå\u00107\f\u0010wº¼>§î\u0097\u0003YìÆâ8(\u0082\u0016#\u0011\u000e/d%~\u0088FZ\u008en\u0015¤®ÇÁgÍØ\u001b»³\u009f´\u0007\u001c\rç0¿ç\u0083\nóh'\u008a\u0010£ØÓP\u009af\r\u0085S\u0082O= wºÈ ¨³\t\u0007Á6<çæ7ªPsÂ¼÷eKØÏNJÑ-\u0094\u0012~XP\u008eË\u009c\u0010ÏÒeö\t\u008bê8¿×)&(.\fÞ\u0010\u001c/Gß ×ø\u0006\u0083áØ'gçMâ\u0010Öa\u0003\u007fìËðBêùF\u008cg~åð\u0010\u00adQÀÎ~a+\u001emþË]j\u0011$×";
      int var8 = "\u009aâ²¥Ú\u0088\u0011\u0006÷Þ\u0016\"+¤pÖ 8àý\u008a\u0006\u0096thÊñè\u009c&ç]X-Ï\u001bÙÿÖh\b\u0011Îg`¼\u0018\u009d\u0006\u0010Fu\u0088»wS4/ö3\u0010/m¾Øå\u00107\f\u0010wº¼>§î\u0097\u0003YìÆâ8(\u0082\u0016#\u0011\u000e/d%~\u0088FZ\u008en\u0015¤®ÇÁgÍØ\u001b»³\u009f´\u0007\u001c\rç0¿ç\u0083\nóh'\u008a\u0010£ØÓP\u009af\r\u0085S\u0082O= wºÈ ¨³\t\u0007Á6<çæ7ªPsÂ¼÷eKØÏNJÑ-\u0094\u0012~XP\u008eË\u009c\u0010ÏÒeö\t\u008bê8¿×)&(.\fÞ\u0010\u001c/Gß ×ø\u0006\u0083áØ'gçMâ\u0010Öa\u0003\u007fìËðBêùF\u008cg~åð\u0010\u00adQÀÎ~a+\u001emþË]j\u0011$×"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     f = var9;
                     g = new String[13];
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

                  var6 = "IIA¸TF*¸ßP³Ú\fZ2¾ð\u0083 \u008f\u0080¿q\u001f@ôh\u0015ðº_ãkÄ²fµ\u0086\u0091\u0084XgÑ\f\u0004Ejd\u0094\u009auá´÷ \u008c\u0083`W\u008e-²n\u0087P%àë±\u000bÊn\u001c¹µ\u0083\u0015\u008d\u009dü\u0093\u007f@CKÿ#\u0003T\u001d\u0086+%°gv14©Z\u009f¿;óÛÃ\\3Õ\u001cW\u0000²'¨ÐØG\u008bp\n\\\t\u009aÙ\u00adb_c";
                  var8 = "IIA¸TF*¸ßP³Ú\fZ2¾ð\u0083 \u008f\u0080¿q\u001f@ôh\u0015ðº_ãkÄ²fµ\u0086\u0091\u0084XgÑ\f\u0004Ejd\u0094\u009auá´÷ \u008c\u0083`W\u008e-²n\u0087P%àë±\u000bÊn\u001c¹µ\u0083\u0015\u008d\u009dü\u0093\u007f@CKÿ#\u0003T\u001d\u0086+%°gv14©Z\u009f¿;óÛÃ\\3Õ\u001cW\u0000²'¨ÐØG\u008bp\n\\\t\u009aÙ\u00adb_c"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1499;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/bs", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/bs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
