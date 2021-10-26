public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double massIndex = service.calculate(52, 155);
        System.out.printf("%.1f", massIndex);
    }
}
