public class Ex1_21 {
    public static void main(String[] args) {
        HexPrinter hexPrinter = new HexPrinter();
        hexPrinter.printHexNumbers();
    }
}
class HexPrinter {

    public void printHexNumbers() {
        for (int i = 0; i <= 0xFFFF; i++) {
            System.out.println(String.format("%04X", i));
        }
    }
}
