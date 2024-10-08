public class Ex1_13 {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for ( int row = 1; row<n; row++ ) {
            for ( int col = 1; col<=row; col++){
                System.out.print("  ");
            }
            for ( int col = row; col<=n; col++){
                System.out.print("* ");
            }
            for ( int col = row; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for ( int row = 1 + 2; row<=n; row++ ) {
            for ( int col = row; col<=n; col++){
                System.out.print("  ");
            }
            for ( int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            for ( int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
