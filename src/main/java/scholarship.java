public class scholarship {
    public int scholar(int s, double i) {
        if (s > 1400 && s < 1600)
            return 70;
        if (s > 1600 || s < 0)
            return -1;
        if (s > 1200 && s < 1600 && i >= 6.5 && i < 9.0)
            return 50;
        if (s < 1200 && s > 0 && i >= 0.0 && i <= 9.0)
            return 0;
        if (i < 0.0 || i > 9.0)
            return -1;

        return -1;
    }
}