/*THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING A TUTOR OR CODE WRITTEN BY OTHER STUDENTS - Elijah Chou
*/

public class Problem5 {
    public static int merge(int n) {
        if (n<=1) {
            return 0;
        }
        else
        {
            return merge(n/2) + merge((n+1)/2) + n - 1;
        }
    }

    public static int select(int n) {
        if (n<140) {
            return merge(n);
        }
        else {
            return 6 * (n+4)/5 + select(Math.ceil(n/5)) + select(6 + Math.floor(7*n/10));
        }
    }
    public static void main(String[] args) {
        double i = 140;
        boolean notFound = true;
        double finalS = 0;
        double finalM = 0;
        double currentS = 0;
        double currentM = 0;
        while(notFound) {
            currentS = select(i);
            currentM = merge(i);
            if (2 * currentS < currentM) {
                finalM = currentM;
                finalS = currentS;
                notFound = false;
            }
            else {
                i++;
            }
        }
        System.out.println("n is equal to " + i);
        System.out.println("S(n) is equal to " + finalS);
        System.out.println("M(n) is equal to " + finalM);
    }
}