import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;
import java.util.List;

public class AttachHook {
    public static void main(String[] args) throws Exception {
        String agentJar = args[0];
        String targetPid = null;
        for (VirtualMachineDescriptor vmd : VirtualMachine.list()) {
            String disp = vmd.displayName();
            System.out.println("  pid=" + vmd.id() + " " + disp);
            if (disp != null && disp.contains("ZKM26.jar")) { targetPid = vmd.id(); }
        }
        if (targetPid == null) { System.out.println("ZKM 进程未找到"); return; }
        System.out.println("attach -> " + targetPid);
        VirtualMachine vm = VirtualMachine.attach(targetPid);
        vm.loadAgent(agentJar, null);
        System.out.println("agent loaded");
        vm.detach();
    }
}
