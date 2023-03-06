public class p93num {
	static long findSumSubsets(int n)
    {
        return (n * (n + 1) / 2) * (1 << (n - 1));
    }
    public static void main(String[] args)
    {
        int n = 25;
        System.out.print(findSumSubsets(n));
    }
}

