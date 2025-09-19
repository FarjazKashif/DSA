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

    // Q2: Print numbers from n → 1.
    //     Example: Input: n=5 → Output: 5 4 3 2 1
    // public static void nNumbers(int n, int sum) {
    //     if(n==0) {
    //         return;
    //     }
    //     sum+=n;
    //     nNumbers(n-1, sum);

    //     System.out.println(sum == 15 ? sum : "");
    // }
    
    /* 
    Q3: Factorial
    public static int factorial(int n) {
        if(n==1) {
            return 1;
        }
        return n * factorial(n-1); 
    }
    */

    /* Q4: Fibonacci Series */
    // public static void fSeries(int a, int b, int n) {
    //     if(n == 0) {
    //         return;
    //     }

    //     System.out.print(a + " ");
    //     fSeries(b, a+b, n-1);
    // }
    
    /*
    Reverse a string using recursion.
    Example: "hello" → "olleh"
     */
    // Using for Loop
    public static void reverseFunc(String letter) {
        System.out.println("Previous String: " + letter);
        System.out.print("New String: ");
        for(int i=letter.length()-1; i>=0; i--) {
            System.out.print(letter.charAt(i));
        }
    }

    public static void main(String args[]) {
        // nNumbers(5, 0);
        // q1(1);
        // System.out.println(factorial(5));
        // fSeries(0, 1, 6);
        reverseFunc("Farjaz");
    }

}