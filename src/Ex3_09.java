public class Ex3_09 {
    public static void main(String[] args) {
        int i = 0;
        double j =0;
        while ( i <= 100 ) {
            i++;
            if (i%7==0){
                j = i;
            }
        }
        System.out.println(j);
    }
}
