public class Ex1_16 {
    public static void main(String[] args) {
        Test t = new Test();
        t.limit(15);
        t.generateSeries();
    }
}
class Test{
    int limit;

    public void limit(int limit) {
        this.limit=limit;
    }

    public void generateSeries(){
        int number = 0;
        int j = 3;
        for ( int i=0; i <limit; i++) {
            System.out.print(number);
            if ( i < limit -1 ){
                System.out.print(", ");
            }
            number = number + j;
            j = j+ 2;
        }
        System.out.println();
    }
}