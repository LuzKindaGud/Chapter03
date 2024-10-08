public class Ex1_17 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.limit(15);
        t1.generateSeries();
    }
}
class Test1{

    int limit;
    public void limit(int limit) {
        this.limit=limit;
    }

    public void generateSeries(){
        int number = 1;
        int j = 2;
        for ( int i=1; i <limit; i++) {
            System.out.print(number);
            if ( i < limit -1 ){
                System.out.print(", ");
            }
            number += j;
            j *= 2;
        }
        System.out.println();
    }
}
