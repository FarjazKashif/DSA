class App {
    // Q1: Print numbers from 1 → n.
    //     Example: Input: n=5 → Output: 1 2 3 4 5
    // public static void q1(int n) {
    //     if(n==6) {
    //         return;
    //     }
    //     System.out.println(n);
    //     q1(n+1);
    // }

    public static void nNumbers(int n, int sum) {
        if(n==0) {
            return;
        }
        sum+=n;
        nNumbers(n-1, sum);

        System.out.println(sum == 15 ? sum : "");
    }
    public static void main(String args[]) {
        nNumbers(5, 0);
        // q1(1);
    }
}