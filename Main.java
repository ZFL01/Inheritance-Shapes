public class Main {
    public static void main(String[] args) {
        BangunDatar[] bangunDatars = {
            new Persegi(4),
            new Lingkaran(7),
            new Segitiga(3, 4)
        };

        for (BangunDatar bangun : bangunDatars) {
            System.out.println("Luas: " + bangun.luas());
            System.out.println("Keliling: " + bangun.keliling());
            System.out.println("--------------------");
        }
    }
}
