public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;  // масса в кг
        double height = 1.87; // рост в метрах
        int index = service.calculate(weight, height);


        System.out.println(index);
        System.out.println(service.calculate(90, 1.80));
    }
}