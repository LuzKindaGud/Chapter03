public class Ex1_14 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n){
        for ( int row = 1; row<=n; row++ ) {
            for ( int col = row; col<=n; col++){
                System.out.print("  ");
            }
            for ( int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            for ( int col = 1; col<row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
