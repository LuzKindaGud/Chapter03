public class Ex1_19 {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.limit(10);
        t2.generateSeries();
    }
}
class Test2{

    int limit;
    public void limit(int limit) {
        this.limit=limit;
    }

    public void generateSeries(){
        int number = 1;
        int j = 1;
        for ( int i=1; i <limit; i++) {
            System.out.print(number);
            if ( i < limit -1 ){
                System.out.print(", ");
            }
            j *= 3;
            number = j;
        }
        System.out.println();
    }
}
