import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;
import java.lang.management.ManagementFactory;
import java.util.List;

public class AttachLoad {
    public static void main(String[] args) throws Exception {
        String agentJar = args[0];
        String agentArgs = args.length > 1 ? args[1] : null;
        String myPid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        System.out.println("我的 pid = " + myPid);
        String targetPid = null;
        List<VirtualMachineDescriptor> vms = VirtualMachine.list();
        for (VirtualMachineDescriptor vmd : vms) {
            String disp = vmd.displayName();
            System.out.println("  候选 pid=" + vmd.id() + " " + disp);
            if (vmd.id().equals(myPid)) continue;              // 跳过自己
            if (disp != null && disp.contains("ZKM26.jar") && !disp.contains("AttachLoad")) {
                targetPid = vmd.id();
            }
        }
        if (targetPid == null) { System.out.println("找不到 ZKM 进程"); return; }
        System.out.println("附加到 pid=" + targetPid);
        VirtualMachine vm = VirtualMachine.attach(targetPid);
        vm.loadAgent(agentJar, agentArgs);
        System.out.println("agent 已加载");
        vm.detach();
    }
}
