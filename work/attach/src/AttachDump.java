import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;
import java.util.List;

public class AttachDump {
    public static void main(String[] args) throws Exception {
        String agentJar = args[0];
        String targetPid = args.length > 1 ? args[1] : null;

        List<VirtualMachineDescriptor> vms = VirtualMachine.list();
        System.out.println("=== 可附加的 JVM ===");
        for (VirtualMachineDescriptor vmd : vms) {
            System.out.println("  pid=" + vmd.id() + " display=" + vmd.displayName());
        }

        if (targetPid == null) {
            // 自动找 ZKM 进程
            for (VirtualMachineDescriptor vmd : vms) {
                if (vmd.displayName() != null && vmd.displayName().contains("ZKM26.jar")) {
                    targetPid = vmd.id();
                    break;
                }
            }
        }
        if (targetPid == null) {
            System.out.println("找不到 ZKM 进程，请手动传 pid");
            return;
        }
        System.out.println("附加到 pid=" + targetPid);
        VirtualMachine vm = VirtualMachine.attach(targetPid);
        vm.loadAgent(agentJar);
        System.out.println("agent 已加载");
        vm.detach();
    }
}
