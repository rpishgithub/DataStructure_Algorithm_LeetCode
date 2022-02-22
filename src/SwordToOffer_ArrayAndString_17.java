public class SwordToOffer_ArrayAndString_17 {
    public int[] printNumbers(int n) {
        int pos = 1;
        for (int i = 0; i < n; i++) {
            pos *= 10;
        }
        int[] res = new int[pos - 1];
        for (int i = 0; i < pos - 1; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
