public class N2Calc {
    public static void main(String[] args) {
        long bc_a = 0x749795a53e5bL;
        long seedL = 4835523846951461191L;
        int n = 17687;
        long[] vars = {
            seedL ^ bc_a,         // var = bc.a (原0)
            seedL,                // var = 0
            seedL ^ bc_a ^ bc_a,  // 原值
        };
        for (long l2 : vars) {
            int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x629F;
            System.out.println("seed=0x" + Long.toHexString(l2) + " -> n2=" + n2);
        }
    }
}
