class App {
    // Q1: Print numbers from 1 → n.
    //     Example: Input: n=5 → Output: 1 2 3 4 5
    public static void q1(int n) {
        if(n==6) {
            return;
        }
        System.out.println(n);
        q1(n+1);
    }

    public static void main(String args[]) {
        q1(1);
    }
}