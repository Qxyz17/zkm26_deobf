import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Trigger {
    public static void main(String[] args) throws Exception {
        String classesRoot = args[0];
        List<Path> classes = new ArrayList<>();
        Files.walk(Paths.get(classesRoot)).filter(p -> p.toString().endsWith(".class")).forEach(classes::add);
        int ok = 0, fail = 0;
        for (Path p : classes) {
            String rel = Paths.get(classesRoot).relativize(p).toString().replace('\\', '/');
            String cn = rel.substring(0, rel.length() - 6).replace('/', '.');
            try { Class.forName(cn); ok++; }
            catch (Throwable t) { fail++; }
        }
        System.err.println("[TRIGGER] ok=" + ok + " fail=" + fail);
    }
}
