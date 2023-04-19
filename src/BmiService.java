public class BmiService {
    public int calculate(double heightm, int weightkg) {
        double index = weightkg / (heightm * heightm);

        return (int) index;

    }
}
