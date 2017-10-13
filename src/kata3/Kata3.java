package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> h = new Histogram<>();
        h.increment("gmail.com");
        h.increment("gmail.com");
        h.increment("ulpgc.es");
        h.increment("ulpgc.es");
        h.increment("gmail.com");
        h.increment("gmail.com");
        h.increment("ull.es");
        h.increment("ull.es");
        h.increment("ull.es");
        new HistogramDisplay(h).execute();
    }
}
