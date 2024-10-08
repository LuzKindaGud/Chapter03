public class Ex1_22 {
    public static void main(String[] args) {
        OctalPrinter octalPrinter = new OctalPrinter();
        octalPrinter.printOctalNumbers();
    }
}

class OctalPrinter {
    public void printOctalNumbers() {
        for (int i = 0; i <= 777; i++) {
            System.out.println(Integer.toOctalString(i));
        }
    }
}
