public class IndexService {
    public double calculate(double height, double weight) {
        double index = weight / (height * height);

        return index;
    }
}