public class Main {
    public static void main(String[] args) {
        IndexService service = new IndexService();
        double height = 1.67;
        double weight = 59;
        double index = service.calculate(height, weight);
        System.out.println(index);
    }
}
