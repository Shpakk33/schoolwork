package rectangle;

public class PlPer {
    int square(int x, int t, int s) {
        int plpow = (x * t + x * s + t * s) * 2;
        return plpow;
    }

    int volume(int x, int t, int s) {
        int vol = x * t * s;
        return vol;
    }
}
