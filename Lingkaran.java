public class Lingkaran extends BangunDatar {
    public double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public double luas() {
        return Math.PI * r * r;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * r;
    }
}
