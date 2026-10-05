package com.zelix;

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
import org.apache.tools.ant.Task;

public class ZKM_PG_Task extends Task {
   private File D;
   private StringBuilder K;
   private static final long a = ess.a(-6311740717589334071L, 5929535195085321771L, MethodHandles.lookup().lookupClass()).a(261325901139193L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public void addConfiguredInjar(_r3 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 84739166186796
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 1195439195343088155
      // 0b: lload 2
      // 0c: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w 735654329084929403
      // 17: lload 2
      // 18: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull aa
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w 1143916454897692383
      // 2e: lload 2
      // 2f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w 735654329084929403
      // 39: lload 2
      // 3a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000607011508458686
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w 1143916454897692383
      // 56: lload 2
      // 57: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w 735654329084929403
      // 61: lload 2
      // 62: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 10841
      // 6a: ldc2_w 7420913552519922743
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w 735654329084929403
      // 7c: lload 2
      // 7d: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000607011508458686
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w 735654329084929403
      // 97: lload 2
      // 98: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: aload 1
      // 9e: ldc2_w 979122937393949683
      // a1: lload 2
      // a2: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // aa: pop
      // ab: return
   }

   public void setOverloadaggressively(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 78979901620206
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -4443637381146593063
      // 0b: lload 2
      // 0c: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifeq 9b
      // 1c: goto 29
      // 1f: ldc2_w -2512433335595533283
      // 22: lload 2
      // 23: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w -2812608520329283655
      // 2d: lload 2
      // 2e: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w -2512433335595533283
      // 3e: lload 2
      // 3f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w -2512433335595533283
      // 4e: lload 2
      // 4f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w -2812608520329283655
      // 5c: lload 2
      // 5d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000618303330109052
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w -2512433335595533283
      // 79: lload 2
      // 7a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w -2812608520329283655
      // 84: lload 2
      // 85: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 15168
      // 8d: ldc2_w 8763811175990085580
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setObfuscationdictionary(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 58261449273672
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -3678468439298918785
      // 0b: lload 2
      // 0c: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -3003364002671675105
      // 17: lload 2
      // 18: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull e0
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w -3205304987454508357
      // 2e: lload 2
      // 2f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w -3003364002671675105
      // 39: lload 2
      // 3a: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000494154012215514
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w -3205304987454508357
      // 56: lload 2
      // 57: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w -3003364002671675105
      // 61: lload 2
      // 62: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 30152
      // 6a: ldc2_w 2036008890783696883
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w -3003364002671675105
      // 7c: lload 2
      // 7d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000494154012215514
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w -3003364002671675105
      // 97: lload 2
      // 98: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: sipush 2323
      // a0: ldc2_w 2518810431383080444
      // a3: lload 2
      // a4: lxor
      // a5: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // ad: pop
      // ae: aload 0
      // af: ldc2_w -3003364002671675105
      // b2: lload 2
      // b3: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 1
      // b9: ldc2_w -3027233652425318914
      // bc: lload 2
      // bd: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c5: pop
      // c6: aload 0
      // c7: ldc2_w -3003364002671675105
      // ca: lload 2
      // cb: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: sipush 2323
      // d3: ldc2_w 2518810431383080444
      // d6: lload 2
      // d7: lxor
      // d8: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // e0: pop
      // e1: return
   }

   public void setClassobfuscationdictionary(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 43666271540843
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -6066235198012632740
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -5660185727092564420
      // 17: lload 2
      // 18: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull e0
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w -5429252819438135912
      // 2e: lload 2
      // 2f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w -5660185727092564420
      // 39: lload 2
      // 3a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000513170720075769
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w -5429252819438135912
      // 56: lload 2
      // 57: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w -5660185727092564420
      // 61: lload 2
      // 62: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 4702
      // 6a: ldc2_w 4876337601199769421
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w -5660185727092564420
      // 7c: lload 2
      // 7d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000513170720075769
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w -5660185727092564420
      // 97: lload 2
      // 98: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: sipush 17874
      // a0: ldc2_w 553201047190971935
      // a3: lload 2
      // a4: lxor
      // a5: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // ad: pop
      // ae: aload 0
      // af: ldc2_w -5660185727092564420
      // b2: lload 2
      // b3: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 1
      // b9: ldc2_w -5557995802456818979
      // bc: lload 2
      // bd: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c5: pop
      // c6: aload 0
      // c7: ldc2_w -5660185727092564420
      // ca: lload 2
      // cb: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: sipush 2323
      // d3: ldc2_w 2518796379124755167
      // d6: lload 2
      // d7: lxor
      // d8: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // e0: pop
      // e1: return
   }

   public void setNote(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 52383371853079
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 4660221935880485408
      // 0b: lload 2
      // 0c: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifne 9b
      // 1c: goto 29
      // 1f: ldc2_w 6907223587837837028
      // 22: lload 2
      // 23: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w 6489391308794672448
      // 2d: lload 2
      // 2e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w 6907223587837837028
      // 3e: lload 2
      // 3f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w 6907223587837837028
      // 4e: lload 2
      // 4f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w 6489391308794672448
      // 5c: lload 2
      // 5d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000504433065936005
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w 6907223587837837028
      // 79: lload 2
      // 7a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w 6489391308794672448
      // 84: lload 2
      // 85: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 4308
      // 8d: ldc2_w 5568722755757665963
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void addConfiguredLibraryjar(_r3 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 130637125189605
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -4441052410527991598
      // 0b: lload 2
      // 0c: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -2811184637194061902
      // 17: lload 2
      // 18: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull aa
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w -2510411313840096234
      // 2e: lload 2
      // 2f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w -2811184637194061902
      // 39: lload 2
      // 3a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000566606394607223
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w -2510411313840096234
      // 56: lload 2
      // 57: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w -2811184637194061902
      // 61: lload 2
      // 62: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 16751
      // 6a: ldc2_w 10558056613527029
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w -2811184637194061902
      // 7c: lload 2
      // 7d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000566606394607223
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w -2811184637194061902
      // 97: lload 2
      // 98: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: aload 1
      // 9e: ldc2_w -2350966012022916806
      // a1: lload 2
      // a2: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // aa: pop
      // ab: return
   }

   public void setUseuniqueclassmembernames(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 136627206065082
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -5331913621608641395
      // 0b: lload 2
      // 0c: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifeq 9b
      // 1c: goto 29
      // 1f: ldc2_w -6235743141755549623
      // 22: lload 2
      // 23: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w -6006780576107445267
      // 2d: lload 2
      // 2e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w -6235743141755549623
      // 3e: lload 2
      // 3f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w -6235743141755549623
      // 4e: lload 2
      // 4f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w -6006780576107445267
      // 5c: lload 2
      // 5d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000555133750850088
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w -6235743141755549623
      // 79: lload 2
      // 7a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w -6006780576107445267
      // 84: lload 2
      // 85: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 15933
      // 8d: ldc2_w 985092106127521527
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setMicroedition(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 119923077425982
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 1622753394521861129
      // 0b: lload 2
      // 0c: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifne 9b
      // 1c: goto 29
      // 1f: ldc2_w 716672624195709133
      // 22: lload 2
      // 23: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w 875864051700065129
      // 2d: lload 2
      // 2e: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w 716672624195709133
      // 3e: lload 2
      // 3f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w 716672624195709133
      // 4e: lload 2
      // 4f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w 875864051700065129
      // 5c: lload 2
      // 5d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000571827278451372
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w 716672624195709133
      // 79: lload 2
      // 7a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w 875864051700065129
      // 84: lload 2
      // 85: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 31673
      // 8d: ldc2_w 695025097151337409
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setSkipnonpubliclibraryclassmembers(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 136942758638724
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -8557054792346799181
      // 0b: lload 2
      // 0c: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifne 9b
      // 1c: goto 29
      // 1f: ldc2_w -7617785538451654793
      // 22: lload 2
      // 23: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w -7809910070819914541
      // 2d: lload 2
      // 2e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w -7617785538451654793
      // 3e: lload 2
      // 3f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w -7617785538451654793
      // 4e: lload 2
      // 4f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w -7809910070819914541
      // 5c: lload 2
      // 5d: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000555938383367446
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w -7617785538451654793
      // 79: lload 2
      // 7a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w -7809910070819914541
      // 84: lload 2
      // 85: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 2642
      // 8d: ldc2_w 899606985980329384
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setDump(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 15387512032350
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 8207051049011678057
      // 0b: lload 2
      // 0c: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w 7730377467772503049
      // 17: lload 2
      // 18: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull e0
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w 7967502275162722221
      // 2e: lload 2
      // 2f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w 7730377467772503049
      // 39: lload 2
      // 3a: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000537050514224588
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w 7967502275162722221
      // 56: lload 2
      // 57: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w 7730377467772503049
      // 61: lload 2
      // 62: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 5789
      // 6a: ldc2_w 503476475810306436
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w 7730377467772503049
      // 7c: lload 2
      // 7d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000537050514224588
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w 7730377467772503049
      // 97: lload 2
      // 98: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: sipush 2323
      // a0: ldc2_w 2518820328561422570
      // a3: lload 2
      // a4: lxor
      // a5: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // ad: pop
      // ae: aload 0
      // af: ldc2_w 7730377467772503049
      // b2: lload 2
      // b3: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 1
      // b9: ldc2_w 7560173832608686312
      // bc: lload 2
      // bd: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c5: pop
      // c6: aload 0
      // c7: ldc2_w 7730377467772503049
      // ca: lload 2
      // cb: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: sipush 2323
      // d3: ldc2_w 2518820328561422570
      // d6: lload 2
      // d7: lxor
      // d8: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // e0: pop
      // e1: return
   }

   public void setPrintusage(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 97098724942027
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 2121222650790733820
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w 563659038067386524
      // 17: lload 2
      // 18: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull e0
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w 146108233994642232
      // 2e: lload 2
      // 2f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w 563659038067386524
      // 39: lload 2
      // 3a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000594701320329561
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w 146108233994642232
      // 56: lload 2
      // 57: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w 563659038067386524
      // 61: lload 2
      // 62: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 21196
      // 6a: ldc2_w 8673835767443124606
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w 563659038067386524
      // 7c: lload 2
      // 7d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000594701320329561
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w 563659038067386524
      // 97: lload 2
      // 98: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: sipush 2323
      // a0: ldc2_w 2518902040849931391
      // a3: lload 2
      // a4: lxor
      // a5: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // ad: pop
      // ae: aload 0
      // af: ldc2_w 563659038067386524
      // b2: lload 2
      // b3: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 1
      // b9: ldc2_w 323827867000130685
      // bc: lload 2
      // bd: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c5: pop
      // c6: aload 0
      // c7: ldc2_w 563659038067386524
      // ca: lload 2
      // cb: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: sipush 2323
      // d3: ldc2_w 2518902040849931391
      // d6: lload 2
      // d7: lxor
      // d8: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // e0: pop
      // e1: return
   }

   public void setPrintconfiguration(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 115416348619118
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -3686996237416712615
      // 0b: lload 2
      // 0c: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -2992725105722377927
      // 17: lload 2
      // 18: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull e0
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w -3196953074959289699
      // 2e: lload 2
      // 2f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w -2992725105722377927
      // 39: lload 2
      // 3a: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000577705177630972
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w -3196953074959289699
      // 56: lload 2
      // 57: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w -2992725105722377927
      // 61: lload 2
      // 62: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 22484
      // 6a: ldc2_w 256410209575577043
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w -2992725105722377927
      // 7c: lload 2
      // 7d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000577705177630972
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w -2992725105722377927
      // 97: lload 2
      // 98: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: sipush 2323
      // a0: ldc2_w 2518849990288870874
      // a3: lload 2
      // a4: lxor
      // a5: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // ad: pop
      // ae: aload 0
      // af: ldc2_w -2992725105722377927
      // b2: lload 2
      // b3: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 1
      // b9: ldc2_w -3036755401268945448
      // bc: lload 2
      // bd: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c5: pop
      // c6: aload 0
      // c7: ldc2_w -2992725105722377927
      // ca: lload 2
      // cb: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: sipush 2323
      // d3: ldc2_w 2518849990288870874
      // d6: lload 2
      // d7: lxor
      // d8: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // e0: pop
      // e1: return
   }

   public void setAndroid(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 9033153692665
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -125457868881394482
      // 0b: lload 2
      // 0c: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifne 9b
      // 1c: goto 29
      // 1f: ldc2_w -2218791570177900534
      // 22: lload 2
      // 23: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w -1954328522858624082
      // 2d: lload 2
      // 2e: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w -2218791570177900534
      // 3e: lload 2
      // 3f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w -2218791570177900534
      // 4e: lload 2
      // 4f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w -1954328522858624082
      // 5c: lload 2
      // 5d: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000542300678322795
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w -2218791570177900534
      // 79: lload 2
      // 7a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w -1954328522858624082
      // 84: lload 2
      // 85: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 24853
      // 8d: ldc2_w 7315219375977046440
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setRenamesourcefileattribute(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 83541733918147
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -542671147192745228
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -2100199853779055212
      // 17: lload 2
      // 18: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull 77
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w -1797209897807428048
      // 2e: lload 2
      // 2f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w -2100199853779055212
      // 39: lload 2
      // 3a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000613991692893265
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w -1797209897807428048
      // 56: lload 2
      // 57: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w -2100199853779055212
      // 61: lload 2
      // 62: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 23511
      // 6a: ldc2_w 5439755216073006449
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 4
      // 7a: ifnonnull e0
      // 7d: aload 1
      // 7e: ifnull fb
      // 81: goto 8e
      // 84: ldc2_w -1797209897807428048
      // 87: lload 2
      // 88: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: aload 0
      // 8f: ldc2_w -2100199853779055212
      // 92: lload 2
      // 93: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: sipush 19510
      // 9b: ldc2_w 6000613991692893265
      // 9e: lload 2
      // 9f: lxor
      // a0: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // a8: pop
      // a9: aload 0
      // aa: ldc2_w -2100199853779055212
      // ad: lload 2
      // ae: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: sipush 2323
      // b6: ldc2_w 2518888487738947959
      // b9: lload 2
      // ba: lxor
      // bb: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // c3: pop
      // c4: aload 0
      // c5: ldc2_w -2100199853779055212
      // c8: lload 2
      // c9: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: aload 1
      // cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d2: pop
      // d3: goto e0
      // d6: ldc2_w -1797209897807428048
      // d9: lload 2
      // da: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // df: athrow
      // e0: aload 0
      // e1: ldc2_w -2100199853779055212
      // e4: lload 2
      // e5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ea: sipush 2323
      // ed: ldc2_w 2518888487738947959
      // f0: lload 2
      // f1: lxor
      // f2: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f7: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // fa: pop
      // fb: return
   }

   public void setWarn(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 96874209299733
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 8119454218675522082
      // 0b: lload 2
      // 0c: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifne 9b
      // 1c: goto 29
      // 1f: ldc2_w 8059496093300674278
      // 22: lload 2
      // 23: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w 7641628612435019074
      // 2d: lload 2
      // 2e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w 8059496093300674278
      // 3e: lload 2
      // 3f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w 8059496093300674278
      // 4e: lload 2
      // 4f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w 7641628612435019074
      // 5c: lload 2
      // 5d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000594889180279943
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w 8059496093300674278
      // 79: lload 2
      // 7a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w 7641628612435019074
      // 84: lload 2
      // 85: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 2788
      // 8d: ldc2_w 5341750771851150514
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setPrintmapping(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 43328826237709
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -2398615518993112006
      // 0b: lload 2
      // 0c: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -4317549274482594982
      // 17: lload 2
      // 18: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull e0
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w -4485185496753151746
      // 2e: lload 2
      // 2f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w -4317549274482594982
      // 39: lload 2
      // 3a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000512352699800223
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w -4485185496753151746
      // 56: lload 2
      // 57: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w -4317549274482594982
      // 61: lload 2
      // 62: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 20098
      // 6a: ldc2_w 3879617617585450729
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w -4317549274482594982
      // 7c: lload 2
      // 7d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000512352699800223
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w -4317549274482594982
      // 97: lload 2
      // 98: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: sipush 2323
      // a0: ldc2_w 2518795496530911161
      // a3: lload 2
      // a4: lxor
      // a5: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // ad: pop
      // ae: aload 0
      // af: ldc2_w -4317549274482594982
      // b2: lload 2
      // b3: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 1
      // b9: ldc2_w -4055481991953150021
      // bc: lload 2
      // bd: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c5: pop
      // c6: aload 0
      // c7: ldc2_w -4317549274482594982
      // ca: lload 2
      // cb: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: sipush 2323
      // d3: ldc2_w 2518795496530911161
      // d6: lload 2
      // d7: lxor
      // d8: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // e0: pop
      // e1: return
   }

   public ZKM_PG_Task() {
      long var1 = a ^ 100374135604594L;
      super();
      x44.a<"u">(this, new StringBuilder(), -6743146565050741467L, var1);
   }

   public void setUsemixedcaseclassnames(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 46203586912099
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -6712498107709106092
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifne 9a
      // 1c: goto 29
      // 1f: ldc2_w -4778487566395368304
      // 22: lload 2
      // 23: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w -5153535644956272844
      // 2d: lload 2
      // 2e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 99
      // 38: goto 45
      // 3b: ldc2_w -4778487566395368304
      // 3e: lload 2
      // 3f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w -4778487566395368304
      // 4e: lload 2
      // 4f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w -5153535644956272844
      // 5c: lload 2
      // 5d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000509239807354609
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w -4778487566395368304
      // 79: lload 2
      // 7a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w -5153535644956272844
      // 84: lload 2
      // 85: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: bipush 98
      // 8c: ldc2_w 2822914311355997309
      // 8f: lload 2
      // 90: lxor
      // 91: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 99: pop
      // 9a: return
   }

   public void setConfiguration(File var1) {
      long var2 = a ^ 42966376592820L;
      x44.a<"s">(this, var1, 1250298103864839512L, var2);
   }

   public void setMergeinterfacesaggressively(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 52343495650319
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -3335919276286530760
      // 0b: lload 2
      // 0c: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifeq 9b
      // 1c: goto 29
      // 1f: ldc2_w -3547882686230663172
      // 22: lload 2
      // 23: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w -3812592595397958568
      // 2d: lload 2
      // 2e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w -3547882686230663172
      // 3e: lload 2
      // 3f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w -3547882686230663172
      // 4e: lload 2
      // 4f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w -3812592595397958568
      // 5c: lload 2
      // 5d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000504178911139229
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w -3547882686230663172
      // 79: lload 2
      // 7a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w -3812592595397958568
      // 84: lload 2
      // 85: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 12930
      // 8d: ldc2_w 8637850783636250108
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setTarget(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 30474043198989
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 3726266054287280442
      // 0b: lload 2
      // 0c: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w 2960209728366888538
      // 17: lload 2
      // 18: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull a1
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w 3224954821891427838
      // 2e: lload 2
      // 2f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w 2960209728366888538
      // 39: lload 2
      // 3a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000526358651680671
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w 3224954821891427838
      // 56: lload 2
      // 57: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w 2960209728366888538
      // 61: lload 2
      // 62: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 17432
      // 6a: ldc2_w 4433039518469867898
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w 2960209728366888538
      // 7c: lload 2
      // 7d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000526358651680671
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w 2960209728366888538
      // 97: lload 2
      // 98: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: aload 1
      // 9e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a1: pop
      // a2: return
   }

   public void setObfuscate(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 24843788952799
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 1829681996676326376
      // 0b: lload 2
      // 0c: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifne 9b
      // 1c: goto 29
      // 1f: ldc2_w 437793084927354668
      // 22: lload 2
      // 23: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w 272127200646720648
      // 2d: lload 2
      // 2e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w 437793084927354668
      // 3e: lload 2
      // 3f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w 437793084927354668
      // 4e: lload 2
      // 4f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w 272127200646720648
      // 5c: lload 2
      // 5d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000531663451266381
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w 437793084927354668
      // 79: lload 2
      // 7a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w 272127200646720648
      // 84: lload 2
      // 85: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 29966
      // 8d: ldc2_w 1924313411400815295
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setDefaultpackage(String var1) {
      long var2 = a ^ 15735185227185L;
      x44.a<"m">(this, var1, 2254678756951575062L, var2);
   }

   public void setOptimize(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 84285583837075
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -421073212799057756
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifne 9b
      // 1c: goto 29
      // 1f: ldc2_w -1918814581744450464
      // 22: lload 2
      // 23: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w -2266841066563235900
      // 2d: lload 2
      // 2e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w -1918814581744450464
      // 3e: lload 2
      // 3f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w -1918814581744450464
      // 4e: lload 2
      // 4f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w -2266841066563235900
      // 5c: lload 2
      // 5d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000608834861727233
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w -1918814581744450464
      // 79: lload 2
      // 7a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w -2266841066563235900
      // 84: lload 2
      // 85: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 22946
      // 8d: ldc2_w 6864671826061565270
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void addConfiguredOutjar(_r3 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 138801771265311
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 46230829812415016
      // 0b: lload 2
      // 0c: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w 1875365078819599688
      // 17: lload 2
      // 18: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull aa
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w 2293232542503255788
      // 2e: lload 2
      // 2f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w 1875365078819599688
      // 39: lload 2
      // 3a: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000557651837912205
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w 2293232542503255788
      // 56: lload 2
      // 57: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w 1875365078819599688
      // 61: lload 2
      // 62: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 1338
      // 6a: ldc2_w 4014345523866680145
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w 1875365078819599688
      // 7c: lload 2
      // 7d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000557651837912205
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w 1875365078819599688
      // 97: lload 2
      // 98: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: aload 1
      // 9e: ldc2_w 2136316128168688576
      // a1: lload 2
      // a2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // aa: pop
      // ab: return
   }

   public void setFlattenpackagehierarchy(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 38278933957923
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -1110029160591128044
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -1568661730191407756
      // 17: lload 2
      // 18: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull 77
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w -1157585404639949104
      // 2e: lload 2
      // 2f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w -1568661730191407756
      // 39: lload 2
      // 3a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000518229205382321
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w -1157585404639949104
      // 56: lload 2
      // 57: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w -1568661730191407756
      // 61: lload 2
      // 62: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 15018
      // 6a: ldc2_w 6116306930809959653
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 4
      // 7a: ifnonnull e0
      // 7d: aload 1
      // 7e: ifnull fb
      // 81: goto 8e
      // 84: ldc2_w -1157585404639949104
      // 87: lload 2
      // 88: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: aload 0
      // 8f: ldc2_w -1568661730191407756
      // 92: lload 2
      // 93: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: sipush 19510
      // 9b: ldc2_w 6000518229205382321
      // 9e: lload 2
      // 9f: lxor
      // a0: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // a8: pop
      // a9: aload 0
      // aa: ldc2_w -1568661730191407756
      // ad: lload 2
      // ae: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: sipush 2323
      // b6: ldc2_w 2518790444660109719
      // b9: lload 2
      // ba: lxor
      // bb: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // c3: pop
      // c4: aload 0
      // c5: ldc2_w -1568661730191407756
      // c8: lload 2
      // c9: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: aload 1
      // cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d2: pop
      // d3: goto e0
      // d6: ldc2_w -1157585404639949104
      // d9: lload 2
      // da: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // df: athrow
      // e0: aload 0
      // e1: ldc2_w -1568661730191407756
      // e4: lload 2
      // e5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ea: sipush 2323
      // ed: ldc2_w 2518790444660109719
      // f0: lload 2
      // f1: lxor
      // f2: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f7: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // fa: pop
      // fb: return
   }

   public void setPreverify(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 126808769853004
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 5473900876597342587
      // 0b: lload 2
      // 0c: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifne 9b
      // 1c: goto 29
      // 1f: ldc2_w 6088936727033869759
      // 22: lload 2
      // 23: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w 5860783951976447515
      // 2d: lload 2
      // 2e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w 6088936727033869759
      // 3e: lload 2
      // 3f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w 6088936727033869759
      // 4e: lload 2
      // 4f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w 5860783951976447515
      // 5c: lload 2
      // 5d: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000569375116382174
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w 6088936727033869759
      // 79: lload 2
      // 7a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w 5860783951976447515
      // 84: lload 2
      // 85: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 3142
      // 8d: ldc2_w 1604215174469679484
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setPackageobfuscationdictionary(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 71481222339970
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -6901483237756151115
      // 0b: lload 2
      // 0c: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -5000229632865315371
      // 17: lload 2
      // 18: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull e0
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w -4661773280072622479
      // 2e: lload 2
      // 2f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w -5000229632865315371
      // 39: lload 2
      // 3a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000620279885571088
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w -4661773280072622479
      // 56: lload 2
      // 57: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w -5000229632865315371
      // 61: lload 2
      // 62: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 1423
      // 6a: ldc2_w 5329100490890189686
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w -5000229632865315371
      // 7c: lload 2
      // 7d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000620279885571088
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w -5000229632865315371
      // 97: lload 2
      // 98: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: sipush 2323
      // a0: ldc2_w 2518894569656049974
      // a3: lload 2
      // a4: lxor
      // a5: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // ad: pop
      // ae: aload 0
      // af: ldc2_w -5000229632865315371
      // b2: lload 2
      // b3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 1
      // b9: ldc2_w -5100486049072287436
      // bc: lload 2
      // bd: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c5: pop
      // c6: aload 0
      // c7: ldc2_w -5000229632865315371
      // ca: lload 2
      // cb: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: sipush 2323
      // d3: ldc2_w 2518894569656049974
      // d6: lload 2
      // d7: lxor
      // d8: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // e0: pop
      // e1: return
   }

   public void addText(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 73213207034797
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -8784831708859695974
      // 0b: lload 2
      // 0c: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -7154919972911614982
      // 17: lload 2
      // 18: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull 7e
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w -7394613222286673826
      // 2e: lload 2
      // 2f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w -7154919972911614982
      // 39: lload 2
      // 3a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 30821
      // 42: ldc2_w 3536234842846017133
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w -7394613222286673826
      // 56: lload 2
      // 57: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w -7154919972911614982
      // 61: lload 2
      // 62: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: aload 0
      // 68: ldc2_w -8788648389373189589
      // 6b: lload 2
      // 6c: invokedynamic i (Ljava/lang/Object;JJ)Lorg/apache/tools/ant/Project; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: aload 1
      // 72: ldc2_w -8701499019194236137
      // 75: lload 2
      // 76: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e: pop
      // 7f: return
   }

   public void setKeepparameternames(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 46855567845395
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 1560613896352231204
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifeq 9b
      // 1c: goto 29
      // 1f: ldc2_w 783457529198455776
      // 22: lload 2
      // 23: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w 1083949390446059588
      // 2d: lload 2
      // 2e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w 783457529198455776
      // 3e: lload 2
      // 3f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w 783457529198455776
      // 4e: lload 2
      // 4f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w 1083949390446059588
      // 5c: lload 2
      // 5d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000509686165672321
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w 783457529198455776
      // 79: lload 2
      // 7a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w 1083949390446059588
      // 84: lload 2
      // 85: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 11801
      // 8d: ldc2_w 8581558297971393912
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setShrink(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 11720915537182
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -1106396613092898263
      // 0b: lload 2
      // 0c: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifne 9b
      // 1c: goto 29
      // 1f: ldc2_w -1165792055532630291
      // 22: lload 2
      // 23: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w -1583061380587453111
      // 2d: lload 2
      // 2e: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w -1165792055532630291
      // 3e: lload 2
      // 3f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w -1165792055532630291
      // 4e: lload 2
      // 4f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w -1583061380587453111
      // 5c: lload 2
      // 5d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000545065759011980
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w -1165792055532630291
      // 79: lload 2
      // 7a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w -1583061380587453111
      // 84: lload 2
      // 85: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 13681
      // 8d: ldc2_w 8080923901695949570
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setRepackageclasses(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 97845619911209
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -2913239131460195042
      // 0b: lload 2
      // 0c: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -3661280973492247938
      // 17: lload 2
      // 18: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull 77
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w -3970745399648818726
      // 2e: lload 2
      // 2f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w -3661280973492247938
      // 39: lload 2
      // 3a: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000595310297142203
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w -3970745399648818726
      // 56: lload 2
      // 57: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w -3661280973492247938
      // 61: lload 2
      // 62: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 15022
      // 6a: ldc2_w 4499184701552415716
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 4
      // 7a: ifnonnull e0
      // 7d: aload 1
      // 7e: ifnull fb
      // 81: goto 8e
      // 84: ldc2_w -3970745399648818726
      // 87: lload 2
      // 88: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: aload 0
      // 8f: ldc2_w -3661280973492247938
      // 92: lload 2
      // 93: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: sipush 19510
      // 9b: ldc2_w 6000595310297142203
      // 9e: lload 2
      // 9f: lxor
      // a0: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // a8: pop
      // a9: aload 0
      // aa: ldc2_w -3661280973492247938
      // ad: lload 2
      // ae: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: sipush 2323
      // b6: ldc2_w 2518902788339340957
      // b9: lload 2
      // ba: lxor
      // bb: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // c3: pop
      // c4: aload 0
      // c5: ldc2_w -3661280973492247938
      // c8: lload 2
      // c9: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: aload 1
      // cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d2: pop
      // d3: goto e0
      // d6: ldc2_w -3970745399648818726
      // d9: lload 2
      // da: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // df: athrow
      // e0: aload 0
      // e1: ldc2_w -3661280973492247938
      // e4: lload 2
      // e5: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ea: sipush 2323
      // ed: ldc2_w 2518902788339340957
      // f0: lload 2
      // f1: lxor
      // f2: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f7: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // fa: pop
      // fb: return
   }

   public void setApplymapping(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 94860616738810
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 1891818379199373517
      // 0b: lload 2
      // 0c: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w 64047520165064621
      // 17: lload 2
      // 18: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull e0
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w 375516909809804297
      // 2e: lload 2
      // 2f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w 64047520165064621
      // 39: lload 2
      // 3a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000601336135360104
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w 375516909809804297
      // 56: lload 2
      // 57: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w 64047520165064621
      // 61: lload 2
      // 62: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 4705
      // 6a: ldc2_w 7690831043445569279
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w 64047520165064621
      // 7c: lload 2
      // 7d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000601336135360104
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w 64047520165064621
      // 97: lload 2
      // 98: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: sipush 2323
      // a0: ldc2_w 2518917395519822670
      // a3: lload 2
      // a4: lxor
      // a5: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // ad: pop
      // ae: aload 0
      // af: ldc2_w 64047520165064621
      // b2: lload 2
      // b3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 1
      // b9: ldc2_w 238543116300536652
      // bc: lload 2
      // bd: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c5: pop
      // c6: aload 0
      // c7: ldc2_w 64047520165064621
      // ca: lload 2
      // cb: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: sipush 2323
      // d3: ldc2_w 2518917395519822670
      // d6: lload 2
      // d7: lxor
      // d8: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // e0: pop
      // e1: return
   }

   public void setAllowaccessmodification(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 58619468968661
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -3499730268464794142
      // 0b: lload 2
      // 0c: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifeq 9b
      // 1c: goto 29
      // 1f: ldc2_w -3451593817656954586
      // 22: lload 2
      // 23: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w -3040798400142624126
      // 2d: lload 2
      // 2e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w -3451593817656954586
      // 3e: lload 2
      // 3f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w -3451593817656954586
      // 4e: lload 2
      // 4f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w -3040798400142624126
      // 5c: lload 2
      // 5d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000492390326455111
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w -3451593817656954586
      // 79: lload 2
      // 7a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w -3040798400142624126
      // 84: lload 2
      // 85: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 12538
      // 8d: ldc2_w 3683397451216699726
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setIgnorewarnings(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 47717319009967
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 6562989212423922072
      // 0b: lload 2
      // 0c: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifeq 9b
      // 1c: goto 29
      // 1f: ldc2_w 4927896232444683612
      // 22: lload 2
      // 23: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w 4735244467075460856
      // 2d: lload 2
      // 2e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w 4927896232444683612
      // 3e: lload 2
      // 3f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w 4927896232444683612
      // 4e: lload 2
      // 4f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w 4735244467075460856
      // 5c: lload 2
      // 5d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000508013886136125
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w 4927896232444683612
      // 79: lload 2
      // 7a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w 4735244467075460856
      // 84: lload 2
      // 85: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 1242
      // 8d: ldc2_w 4600838407395598607
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setVerbose(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 58887359028498
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -2258145085172803035
      // 0b: lload 2
      // 0c: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifeq 9b
      // 1c: goto 29
      // 1f: ldc2_w -9436646909059359
      // 22: lload 2
      // 23: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w -428992973331622587
      // 2d: lload 2
      // 2e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w -9436646909059359
      // 3e: lload 2
      // 3f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w -9436646909059359
      // 4e: lload 2
      // 4f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w -428992973331622587
      // 5c: lload 2
      // 5d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000493276691817600
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w -9436646909059359
      // 79: lload 2
      // 7a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w -428992973331622587
      // 84: lload 2
      // 85: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 948
      // 8d: ldc2_w 1440098771954687459
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void execute() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ZKM_PG_Task.a J
      // 003: ldc2_w 132893864283579
      // 006: lxor
      // 007: lstore 1
      // 008: lload 1
      // 009: dup2
      // 00a: ldc2_w 43874857340812
      // 00d: lxor
      // 00e: lstore 3
      // 00f: dup2
      // 010: ldc2_w 23811879754622
      // 013: lxor
      // 014: lstore 5
      // 016: dup2
      // 017: ldc2_w 46974297660077
      // 01a: lxor
      // 01b: lstore 7
      // 01d: dup2
      // 01e: ldc2_w 37057918791186
      // 021: lxor
      // 022: lstore 9
      // 024: pop2
      // 025: ldc2_w -1152859582696781172
      // 028: lload 1
      // 029: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: astore 11
      // 030: aload 0
      // 031: aload 11
      // 033: ifnonnull 09e
      // 036: ldc2_w -1632928362119121577
      // 039: lload 1
      // 03a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: ifnonnull 09d
      // 042: goto 04f
      // 045: ldc2_w -1191426159572529592
      // 048: lload 1
      // 049: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: athrow
      // 04f: aload 0
      // 050: ldc2_w -1539487274706598420
      // 053: lload 1
      // 054: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: invokevirtual java/lang/StringBuilder.length ()I
      // 05c: aload 11
      // 05e: ifnonnull 0bc
      // 061: goto 06e
      // 064: ldc2_w -1191426159572529592
      // 067: lload 1
      // 068: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: ifne 09d
      // 071: goto 07e
      // 074: ldc2_w -1191426159572529592
      // 077: lload 1
      // 078: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: new org/apache/tools/ant/BuildException
      // 081: dup
      // 082: sipush 9104
      // 085: ldc2_w 3467444170122161472
      // 088: lload 1
      // 089: lxor
      // 08a: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: invokespecial org/apache/tools/ant/BuildException.<init> (Ljava/lang/String;)V
      // 092: athrow
      // 093: ldc2_w -1191426159572529592
      // 096: lload 1
      // 097: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: aload 0
      // 09e: aload 11
      // 0a0: ifnonnull 1df
      // 0a3: ldc2_w -1539487274706598420
      // 0a6: lload 1
      // 0a7: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: invokevirtual java/lang/StringBuilder.length ()I
      // 0af: goto 0bc
      // 0b2: ldc2_w -1191426159572529592
      // 0b5: lload 1
      // 0b6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: ifle 1d1
      // 0bf: aload 0
      // 0c0: aload 11
      // 0c2: ifnonnull 0f9
      // 0c5: goto 0d2
      // 0c8: ldc2_w -1191426159572529592
      // 0cb: lload 1
      // 0cc: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: ldc2_w -1632928362119121577
      // 0d5: lload 1
      // 0d6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: ifnonnull 10c
      // 0de: goto 0eb
      // 0e1: ldc2_w -1191426159572529592
      // 0e4: lload 1
      // 0e5: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: goto 0f9
      // 0ef: ldc2_w -1191426159572529592
      // 0f2: lload 1
      // 0f3: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: ldc2_w -1539487274706598420
      // 0fc: lload 1
      // 0fd: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 105: astore 13
      // 107: aload 11
      // 109: ifnull 16d
      // 10c: new java/lang/StringBuilder
      // 10f: dup
      // 110: invokespecial java/lang/StringBuilder.<init> ()V
      // 113: astore 14
      // 115: aload 14
      // 117: aload 0
      // 118: ldc2_w -1539487274706598420
      // 11b: lload 1
      // 11c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: pop
      // 128: aload 14
      // 12a: ldc2_w -684380167249581852
      // 12d: lload 1
      // 12e: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 136: pop
      // 137: aload 14
      // 139: aload 0
      // 13a: ldc2_w -1632928362119121577
      // 13d: lload 1
      // 13e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: lload 5
      // 145: dup2_x1
      // 146: pop2
      // 147: bipush 2
      // 148: anewarray 53
      // 14b: dup_x1
      // 14c: swap
      // 14d: bipush 1
      // 14e: swap
      // 14f: aastore
      // 150: dup_x2
      // 151: dup_x2
      // 152: pop
      // 153: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 156: bipush 0
      // 157: swap
      // 158: aastore
      // 159: ldc2_w -1497813904259560055
      // 15c: lload 1
      // 15d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 165: pop
      // 166: aload 14
      // 168: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16b: astore 13
      // 16d: new com/zelix/pg
      // 170: dup
      // 171: lload 9
      // 173: invokespecial com/zelix/pg.<init> (J)V
      // 176: astore 14
      // 178: lload 7
      // 17a: aload 13
      // 17c: aload 14
      // 17e: bipush 3
      // 17f: anewarray 53
      // 182: dup_x1
      // 183: swap
      // 184: bipush 2
      // 185: swap
      // 186: aastore
      // 187: dup_x1
      // 188: swap
      // 189: bipush 1
      // 18a: swap
      // 18b: aastore
      // 18c: dup_x2
      // 18d: dup_x2
      // 18e: pop
      // 18f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 192: bipush 0
      // 193: swap
      // 194: aastore
      // 195: ldc2_w -731338980246622226
      // 198: lload 1
      // 199: invokedynamic w (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: ldc2_w -1653288179719298803
      // 1a1: lload 1
      // 1a2: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: astore 12
      // 1a9: aload 14
      // 1ab: lload 3
      // 1ac: invokevirtual com/zelix/pg.n (J)Z
      // 1af: ifne 1cc
      // 1b2: new org/apache/tools/ant/BuildException
      // 1b5: dup
      // 1b6: aload 14
      // 1b8: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 1bb: checkcast java/lang/String
      // 1be: invokespecial org/apache/tools/ant/BuildException.<init> (Ljava/lang/String;)V
      // 1c1: athrow
      // 1c2: ldc2_w -1191426159572529592
      // 1c5: lload 1
      // 1c6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: aload 11
      // 1ce: ifnull 1f3
      // 1d1: aload 0
      // 1d2: goto 1df
      // 1d5: ldc2_w -1191426159572529592
      // 1d8: lload 1
      // 1d9: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: ldc2_w -1632928362119121577
      // 1e2: lload 1
      // 1e3: invokedynamic k (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: ldc2_w -1653288179719298803
      // 1eb: lload 1
      // 1ec: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: astore 12
      // 1f3: aload 12
      // 1f5: aload 0
      // 1f6: ldc2_w -1144397467107044291
      // 1f9: lload 1
      // 1fa: invokedynamic o (Ljava/lang/Object;JJ)Lorg/apache/tools/ant/Project; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: ldc2_w -951425930886050031
      // 202: lload 1
      // 203: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Hashtable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: ldc2_w -761222195263114694
      // 20b: lload 1
      // 20c: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: goto 234
      // 214: astore 12
      // 216: aload 12
      // 218: ldc2_w -994176364394025396
      // 21b: lload 1
      // 21c: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: new org/apache/tools/ant/BuildException
      // 224: dup
      // 225: aload 12
      // 227: ldc2_w -1655644409336414823
      // 22a: lload 1
      // 22b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: invokespecial org/apache/tools/ant/BuildException.<init> (Ljava/lang/String;)V
      // 233: athrow
      // 234: return
   }

   public void setPrintseeds(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 102317452094042
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -2890997040781447827
      // 0b: lload 2
      // 0c: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w -3655935907261767155
      // 17: lload 2
      // 18: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull e0
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w -3992984318495266391
      // 2e: lload 2
      // 2f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w -3655935907261767155
      // 39: lload 2
      // 3a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000589483268559816
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w -3992984318495266391
      // 56: lload 2
      // 57: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w -3655935907261767155
      // 61: lload 2
      // 62: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 16759
      // 6a: ldc2_w 6185874294651463760
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w -3655935907261767155
      // 7c: lload 2
      // 7d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000589483268559816
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w -3655935907261767155
      // 97: lload 2
      // 98: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: sipush 2323
      // a0: ldc2_w 2518907808384882414
      // a3: lload 2
      // a4: lxor
      // a5: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // ad: pop
      // ae: aload 0
      // af: ldc2_w -3655935907261767155
      // b2: lload 2
      // b3: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 1
      // b9: ldc2_w -3535480757540976916
      // bc: lload 2
      // bd: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c5: pop
      // c6: aload 0
      // c7: ldc2_w -3655935907261767155
      // ca: lload 2
      // cb: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: sipush 2323
      // d3: ldc2_w 2518907808384882414
      // d6: lload 2
      // d7: lxor
      // d8: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // e0: pop
      // e1: return
   }

   public void setForceprocessing(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 4411515816342
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 8371422666278801057
      // 0b: lload 2
      // 0c: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: iload 1
      // 14: aload 4
      // 16: ifnonnull 55
      // 19: ifeq 9b
      // 1c: goto 29
      // 1f: ldc2_w 7735575464920861285
      // 22: lload 2
      // 23: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: athrow
      // 29: aload 0
      // 2a: ldc2_w 7966824464990503361
      // 2d: lload 2
      // 2e: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 4
      // 35: ifnonnull 9a
      // 38: goto 45
      // 3b: ldc2_w 7735575464920861285
      // 3e: lload 2
      // 3f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: invokevirtual java/lang/StringBuilder.length ()I
      // 48: goto 55
      // 4b: ldc2_w 7735575464920861285
      // 4e: lload 2
      // 4f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: ifle 80
      // 58: aload 0
      // 59: ldc2_w 7966824464990503361
      // 5c: lload 2
      // 5d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: sipush 19510
      // 65: ldc2_w 6000546613043228676
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 72: pop
      // 73: goto 80
      // 76: ldc2_w 7735575464920861285
      // 79: lload 2
      // 7a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 0
      // 81: ldc2_w 7966824464990503361
      // 84: lload 2
      // 85: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: sipush 31487
      // 8d: ldc2_w 8868277296841895964
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: pop
      // 9b: return
   }

   public void setSkipnonpubliclibraryclasses(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 55481855865501
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 5703372393807459754
      // 0b: lload 2
      // 0c: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w 6162312779303533258
      // 17: lload 2
      // 18: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: invokevirtual java/lang/StringBuilder.length ()I
      // 20: aload 4
      // 22: ifnonnull 5e
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w 5787546154251055470
      // 2e: lload 2
      // 2f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w 6162312779303533258
      // 39: lload 2
      // 3a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000500239231306511
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w 5787546154251055470
      // 56: lload 2
      // 57: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: iload 1
      // 5e: ifeq 8e
      // 61: aload 0
      // 62: ldc2_w 6162312779303533258
      // 65: lload 2
      // 66: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: sipush 1993
      // 6e: ldc2_w 523784275334788670
      // 71: lload 2
      // 72: lxor
      // 73: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7b: pop
      // 7c: aload 4
      // 7e: ifnull b6
      // 81: goto 8e
      // 84: ldc2_w 5787546154251055470
      // 87: lload 2
      // 88: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: aload 0
      // 8f: ldc2_w 6162312779303533258
      // 92: lload 2
      // 93: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: sipush 21155
      // 9b: ldc2_w 437697229450224478
      // 9e: lload 2
      // 9f: lxor
      // a0: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a8: pop
      // a9: goto b6
      // ac: ldc2_w 5787546154251055470
      // af: lload 2
      // b0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: athrow
      // b6: return
   }

   public void setOptimizationpasses(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ZKM_PG_Task.a J
      // 03: ldc2_w 95135457367067
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 7611107606249247532
      // 0b: lload 2
      // 0c: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 0
      // 14: ldc2_w 8287338140236487756
      // 17: lload 2
      // 18: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 4
      // 1f: ifnonnull a1
      // 22: invokevirtual java/lang/StringBuilder.length ()I
      // 25: ifle 5d
      // 28: goto 35
      // 2b: ldc2_w 8563342232565110760
      // 2e: lload 2
      // 2f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: athrow
      // 35: aload 0
      // 36: ldc2_w 8287338140236487756
      // 39: lload 2
      // 3a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: sipush 19510
      // 42: ldc2_w 6000602160674139529
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: goto 5d
      // 53: ldc2_w 8563342232565110760
      // 56: lload 2
      // 57: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc2_w 8287338140236487756
      // 61: lload 2
      // 62: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: sipush 891
      // 6a: ldc2_w 154563276900946967
      // 6d: lload 2
      // 6e: lxor
      // 6f: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ZKM_PG_Task.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 0
      // 79: ldc2_w 8287338140236487756
      // 7c: lload 2
      // 7d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: sipush 19510
      // 85: ldc2_w 6000602160674139529
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic b (IJ)I bsm=com/zelix/ZKM_PG_Task.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 0
      // 94: ldc2_w 8287338140236487756
      // 97: lload 2
      // 98: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: iload 1
      // 9e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // a1: pop
      // a2: return
   }

   static {
      long var11 = a ^ 27272129675311L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[38];
      int var18 = 0;
      String var17 = "\u0007»ë7\u0002ÇôCÏ\u0001cAeûÛ\u0014G¢*,Ê8N\u0082\u0098ÚÎ8Æ\n?¥\u0018´¨®\\\u0012&9=\u0097aØðçå\u000b+®RphD\u0005\u001en ?¡\u0007Ì\u009cÅàÁWÈ¹G×ùp¿*è¨\u0098â\u0010F\u0013\u008c\u0089(¬^\rÔ`8Zô?Ò0Ì\u001a\"\u0006tkPã¹«èc\u0018b)°Í4á\u001d\u0004Üç ¤ë\u0012/®r:\u008aûö\u0011^bK?àë\u001f<p\u0094j\\è>õU(\u009d~ýýâ\u007f¦>\u00925¥\f\u0013ÌÐ{(\u0012ö´\u0087(¶xº¹\u0084)÷Vç;\u0086,º-¼êMQ(\u0014:3¦)\u0012Î¹ Ügá\u001f\u0003âóèic\u001eg±\u0004ë]>\u0085¢ì4\u0011¤\u009aWQOÞ\u009cX¨@~QÎKN«Ïäö©\u008b®ûJ»\u00ad\u009c\u00ad\u008d\u0014\u009c¥º\u0080W'FTsÑú9\\¥BamÿYÖpÍô\u001f×%c\u0081ÝGx\u0098}\u0089\u0005¡¬aÇ.Û\u0099\u0091ú0\u001a\u0001¯\u0089ÀJ\u0010®¤\u0082n\u008cbù«\u0007\u0004!\u001b·è£Á`\u001a´\u0084\u0019D\u0006\tòã\u0018ný.\u008f\u0088\u0084\u0004µñud$Þ, ü\u0088Õm\n\u001e\u00021{(ß8ù\u0000\"\tvÞö \u009aÑ\u009fØÜA6w\u0086\u008b\u0089Y\u0010å\u0085\u0012H°\u0085Äë#rg\u0091\u0011ð\u008eÆ8\u000fø¡\u009aüYtÒàÌ<Åm¹v×0È\u0086t\u008c`¾pyì«ð\u0006\u0014Ù:JyIb\u001e0÷¼fD3A®3\u008e·\u009a\u009e0\"\fÊ·ü ~*E|wÙÈâ-¸\\\u0016\u009c\u0092\u0010xGèê´:²þ\u009f\u001cª2\u0017V\u009b\u0005ð8F !\nÜ°«Ò6û\u0005°%ó\u0091 I¢°¾_³ï\u0083ù\u0003';D÷Ð¼J¥Ò\"º\"&!@2¶oh$]kN×\u0091Û\bÕ\u0097¡HJ³\u0082º<\u0087ãÊ#\u0087ø6Â|¡øÀ'là}Ôã\u009eÇdÜoO\u0099|¸F\u001f[ÐªDº^\u0099tµY©NS\u0007\u0096\u0089^!\u0087\\LÄa^\u0097\u0095Y!QW\u0086+|\u0087\u009dv;O ½Îï\u0089®<\u0089ô\u0084P\u0096´\u009e\u0002C²sãi\u009aè)£sµ\u0092\u0091\u0010K@¢É(öà?Áa\u0013z\u0089É\u009cáe\"\u0098r¶ç¿ÃZ·ìÁª7Ïây\u008aÅ\u0094\u001e\n»íÛ¼\u001cÊ8 \u0082\u0018/s¾\u001a\u009aûe²\u0093Õ¿ó\u0093Ø\u0086¡ó\u0081\u0017\u008aíÊ+*\u001bÎ»º¨\u0005(!Nu©þe*D5tvR\u0084\u0007Î²«\u0006¾g^|Þ\u0013©\u007fL\u0013±\u0085p\"\u008a\u000f³:ßCDÁ QP9Ïªõl\u008dU\u009aJ\u0089\u0087ý*5Ë\u0004Õ_\u008büI\u0015f?Ú\\Mðü\u0099(îE¯`\u001f\u0014\u000fCY\u008cFZ¤Åß7\u0085o(§\u0091µÁ_ÃÃGe\u009b¸ìÞ-Õ\u00ad*ÄöEQ(Ä\u0096g\u001cfë·e\u009bU\u0013\u0090\u001dÛq_Aù¬7\u0019E¡\u0015\u008bl|½ró8\u009b£\u0082~Óa1¨`(W\u009eià\u0083çÆM°\u0088\t\u00000\n÷!ë±#v$\u0097÷/ð×«ÖG\b=\u008bÒÉU\f Úeq8ò\u008b´\u0014&®Í÷î/[YI>\u0099\u0087³%\u0080\u00837b`¬î\u0084ß\fî§Lyk=\u0080\u0015-Â><#ú/Æã\u0087ÓÇU³î\u0005,8Þé0\u009eÊ¯à\u0093éÁ\\\u0006:\u0017,F\u009f\u0014DãÈý\u008b\u0084 uDs9\u000bôÜ\bÍÓÔÂ§\u0083\u008f=¤æÐ\u007fÎÍ\u008f\tî´@-G\u0087\u0004J\u007fÇóÉ\u0006B\blÊ#<\u001e\fM\u0096kÔ£\u0087\u0089\u008bE\u0086L\u0017\u0090+\u0094\u008fÚê\u0089c7\u001c'@=1\u0019¢\b\u0007z|×ã\\¤¥\u0082æ\u000b\b(üw²k g\u0096D¥\u001aø\u000fLÐ©\u0084kÐúw7ïÝú°\u0086*l¿\u0003\u0001ÙÍ©©\u009bí8+\f\u0089ÚO\u0010î\u00119Y ÷ÝòÞ:¾¶Îe\u0005\u0088Üf\u0010\u0093\u0081Ía\u0012².\\p8|l\u0096+ ÛwN¡}\u0001Ð/·\u009dÚ· Ä§X ;Û\u009eÎ#ÑØ}\u0010õ®rÌÁ8ßâ[í¡\u008f\u008c\u0004äÏ\u0004\u0090\u0081û/\u008a\u000e\u0018Q#°7Å?h-#\u0019Ü\u0019Øðl\tP&M\u000fø\u000e÷\\0¿«\u0087C+hµyEõíø\u0015b¹\u0082>aµ$£,\u0093\"\t~\u000fÒ~¡\táÕ¥úP:§\u0001-§KsÄ¢¸¾e8\u0015\"\u0096\u0093ÝUA4}z\u008czxïðì}\u0097ñÜzCÕ\\\u000e>\u001c\u0088Lb5;Â\u001fÐÎ\u0099\u001d\u0084þvóU>Ô\u0087\u00adI#`\u0006¡fv;ê 1'CöÑylv\u008f\u008eh1[~ \u0003\u00ad^\u0013çªEí·ZúÓ\u0086«wçÙ d\u0005ÓÒµD\u0003¶ÜiHÊYùA\u0090EæâPóì'0\u0011\u0014V'Ô\u0001å\u0013\u0010lï\btû©!l\u009eH©\u008cs\u0004O\u0086 \u0007K*ìXâ\u0095\"ìqÏD\u0081x»arÊ'=y@á\u000e¡_ùISÎz\u0090\u0018{v3\u0014B\u0096\u0091rôMÈ\t\u001bFD%õ\u0085Y_Po¹t";
      int var19 = "\u0007»ë7\u0002ÇôCÏ\u0001cAeûÛ\u0014G¢*,Ê8N\u0082\u0098ÚÎ8Æ\n?¥\u0018´¨®\\\u0012&9=\u0097aØðçå\u000b+®RphD\u0005\u001en ?¡\u0007Ì\u009cÅàÁWÈ¹G×ùp¿*è¨\u0098â\u0010F\u0013\u008c\u0089(¬^\rÔ`8Zô?Ò0Ì\u001a\"\u0006tkPã¹«èc\u0018b)°Í4á\u001d\u0004Üç ¤ë\u0012/®r:\u008aûö\u0011^bK?àë\u001f<p\u0094j\\è>õU(\u009d~ýýâ\u007f¦>\u00925¥\f\u0013ÌÐ{(\u0012ö´\u0087(¶xº¹\u0084)÷Vç;\u0086,º-¼êMQ(\u0014:3¦)\u0012Î¹ Ügá\u001f\u0003âóèic\u001eg±\u0004ë]>\u0085¢ì4\u0011¤\u009aWQOÞ\u009cX¨@~QÎKN«Ïäö©\u008b®ûJ»\u00ad\u009c\u00ad\u008d\u0014\u009c¥º\u0080W'FTsÑú9\\¥BamÿYÖpÍô\u001f×%c\u0081ÝGx\u0098}\u0089\u0005¡¬aÇ.Û\u0099\u0091ú0\u001a\u0001¯\u0089ÀJ\u0010®¤\u0082n\u008cbù«\u0007\u0004!\u001b·è£Á`\u001a´\u0084\u0019D\u0006\tòã\u0018ný.\u008f\u0088\u0084\u0004µñud$Þ, ü\u0088Õm\n\u001e\u00021{(ß8ù\u0000\"\tvÞö \u009aÑ\u009fØÜA6w\u0086\u008b\u0089Y\u0010å\u0085\u0012H°\u0085Äë#rg\u0091\u0011ð\u008eÆ8\u000fø¡\u009aüYtÒàÌ<Åm¹v×0È\u0086t\u008c`¾pyì«ð\u0006\u0014Ù:JyIb\u001e0÷¼fD3A®3\u008e·\u009a\u009e0\"\fÊ·ü ~*E|wÙÈâ-¸\\\u0016\u009c\u0092\u0010xGèê´:²þ\u009f\u001cª2\u0017V\u009b\u0005ð8F !\nÜ°«Ò6û\u0005°%ó\u0091 I¢°¾_³ï\u0083ù\u0003';D÷Ð¼J¥Ò\"º\"&!@2¶oh$]kN×\u0091Û\bÕ\u0097¡HJ³\u0082º<\u0087ãÊ#\u0087ø6Â|¡øÀ'là}Ôã\u009eÇdÜoO\u0099|¸F\u001f[ÐªDº^\u0099tµY©NS\u0007\u0096\u0089^!\u0087\\LÄa^\u0097\u0095Y!QW\u0086+|\u0087\u009dv;O ½Îï\u0089®<\u0089ô\u0084P\u0096´\u009e\u0002C²sãi\u009aè)£sµ\u0092\u0091\u0010K@¢É(öà?Áa\u0013z\u0089É\u009cáe\"\u0098r¶ç¿ÃZ·ìÁª7Ïây\u008aÅ\u0094\u001e\n»íÛ¼\u001cÊ8 \u0082\u0018/s¾\u001a\u009aûe²\u0093Õ¿ó\u0093Ø\u0086¡ó\u0081\u0017\u008aíÊ+*\u001bÎ»º¨\u0005(!Nu©þe*D5tvR\u0084\u0007Î²«\u0006¾g^|Þ\u0013©\u007fL\u0013±\u0085p\"\u008a\u000f³:ßCDÁ QP9Ïªõl\u008dU\u009aJ\u0089\u0087ý*5Ë\u0004Õ_\u008büI\u0015f?Ú\\Mðü\u0099(îE¯`\u001f\u0014\u000fCY\u008cFZ¤Åß7\u0085o(§\u0091µÁ_ÃÃGe\u009b¸ìÞ-Õ\u00ad*ÄöEQ(Ä\u0096g\u001cfë·e\u009bU\u0013\u0090\u001dÛq_Aù¬7\u0019E¡\u0015\u008bl|½ró8\u009b£\u0082~Óa1¨`(W\u009eià\u0083çÆM°\u0088\t\u00000\n÷!ë±#v$\u0097÷/ð×«ÖG\b=\u008bÒÉU\f Úeq8ò\u008b´\u0014&®Í÷î/[YI>\u0099\u0087³%\u0080\u00837b`¬î\u0084ß\fî§Lyk=\u0080\u0015-Â><#ú/Æã\u0087ÓÇU³î\u0005,8Þé0\u009eÊ¯à\u0093éÁ\\\u0006:\u0017,F\u009f\u0014DãÈý\u008b\u0084 uDs9\u000bôÜ\bÍÓÔÂ§\u0083\u008f=¤æÐ\u007fÎÍ\u008f\tî´@-G\u0087\u0004J\u007fÇóÉ\u0006B\blÊ#<\u001e\fM\u0096kÔ£\u0087\u0089\u008bE\u0086L\u0017\u0090+\u0094\u008fÚê\u0089c7\u001c'@=1\u0019¢\b\u0007z|×ã\\¤¥\u0082æ\u000b\b(üw²k g\u0096D¥\u001aø\u000fLÐ©\u0084kÐúw7ïÝú°\u0086*l¿\u0003\u0001ÙÍ©©\u009bí8+\f\u0089ÚO\u0010î\u00119Y ÷ÝòÞ:¾¶Îe\u0005\u0088Üf\u0010\u0093\u0081Ía\u0012².\\p8|l\u0096+ ÛwN¡}\u0001Ð/·\u009dÚ· Ä§X ;Û\u009eÎ#ÑØ}\u0010õ®rÌÁ8ßâ[í¡\u008f\u008c\u0004äÏ\u0004\u0090\u0081û/\u008a\u000e\u0018Q#°7Å?h-#\u0019Ü\u0019Øðl\tP&M\u000fø\u000e÷\\0¿«\u0087C+hµyEõíø\u0015b¹\u0082>aµ$£,\u0093\"\t~\u000fÒ~¡\táÕ¥úP:§\u0001-§KsÄ¢¸¾e8\u0015\"\u0096\u0093ÝUA4}z\u008czxïðì}\u0097ñÜzCÕ\\\u000e>\u001c\u0088Lb5;Â\u001fÐÎ\u0099\u001d\u0084þvóU>Ô\u0087\u00adI#`\u0006¡fv;ê 1'CöÑylv\u008f\u008eh1[~ \u0003\u00ad^\u0013çªEí·ZúÓ\u0086«wçÙ d\u0005ÓÒµD\u0003¶ÜiHÊYùA\u0090EæâPóì'0\u0011\u0014V'Ô\u0001å\u0013\u0010lï\btû©!l\u009eH©\u008cs\u0004O\u0086 \u0007K*ìXâ\u0095\"ìqÏD\u0081x»arÊ'=y@á\u000e¡_ùISÎz\u0090\u0018{v3\u0014B\u0096\u0091rôMÈ\t\u001bFD%õ\u0085Y_Po¹t"
         .length();
      char var16 = ' ';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[38];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "UÍìz\u0006Aü£¹AÙ¢0Èò\u0019";
                     int var5 = "UÍìz\u0006Aü£¹AÙ¢0Èò\u0019".length();
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
                                    e = var6;
                                    f = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "S».ªþÃ±\u0013ÉªÝ²?ø\u0005\u0019";
                                 var5 = "S».ªþÃ±\u0013ÉªÝ²?ø\u0005\u0019".length();
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

                  var17 = "ÚÍF«\u009eª\u0081h\u008aÍ³tÕï¨ú lÜâuøy·y/\nn\u0010ôÛ,NûBrÈ\u0001;¨ã{¹\u0007ø\u009dúÏK";
                  var19 = "ÚÍF«\u009eª\u0081h\u008aÍ³tÕï¨ú lÜâuøy·y/\nn\u0010ôÛ,NûBrÈ\u0001;¨ã{¹\u0007ø\u009dúÏK".length();
                  var16 = 16;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10929;
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
            throw new RuntimeException("com/zelix/ZKM_PG_Task", var10);
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
         throw new RuntimeException("com/zelix/ZKM_PG_Task" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23664;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ZKM_PG_Task", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("com/zelix/ZKM_PG_Task" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
