//array traversal
public class SwordToOffer_ArrayAndString_04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int x = 0;
        int y = matrix.length - 1;
        int current;

        while (x < matrix[0].length && y >= 0) {
            current = matrix[y][x];
            if (current > target) {
                y--;
            } else if (current < target) {
                x++;
            } else {
                return true;
            }
        }

        return false;
    }
}
