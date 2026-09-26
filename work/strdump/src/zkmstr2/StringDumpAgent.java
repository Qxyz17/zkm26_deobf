package zkmstr2;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.*;
import java.io.*;
import java.util.*;

public class StringDumpAgent {
    public static void agentmain(String args, Instrumentation inst) throws Exception {
        String outFile = args;
        System.out.println("[STRDUMP] attach, out=" + outFile);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile, false)));
        int classesScanned = 0, arraysFound = 0, stringsDumped = 0;

        for (Class<?> c : inst.getAllLoadedClasses()) {
            if (!c.getName().startsWith("com.zelix.")) continue;
            classesScanned++;
            for (Field f : c.getDeclaredFields()) {
                if (f.getType() == String[].class && Modifier.isStatic(f.getModifiers())) {
                    try {
                        f.setAccessible(true);
                        String[] arr = (String[]) f.get(null);
                        if (arr == null) continue;
                        arraysFound++;
                        int nonNull = 0;
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] != null) {
                                nonNull++;
                                pw.println(c.getName() + "." + f.getName() + "[" + i + "]=" + arr[i]);
                                stringsDumped++;
                            }
                        }
                    } catch (Throwable t) {}
                }
            }
        }
        pw.flush(); pw.close();
        System.out.println("[STRDUMP] classesScanned=" + classesScanned + " arraysFound=" + arraysFound + " stringsDumped=" + stringsDumped);
    }
}
