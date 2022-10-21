import java.util.Arrays;

public class Q_21 {
    public static void main(String[] args) {

        Q_21 c = new Q_21();

        int output = c.largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = c.largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }
    public int largestProductOfThree(int[] arr) {
        // 배열을 오름차순으로 정리
        Arrays.sort(arr);
        // Case 1. 가장 큰 양수 3개를 곱한 값
        int candidate1 = arr[arr.length -1] * arr[arr.length -2] * arr[arr.length -3];
        // Case 2. 가장 작은 음수 2가지 * 가장 큰 양수 == 가장 작은 음수 2개를 곱하면 양수가 되고, 정수로서는 큰 수가 됨.
        int candidate2 = arr[0] * arr[1] * arr[arr.length -1] ;
        // 2가지 케이스를 비교하여 최댓값을 구한다.
        return Math.max(candidate1, candidate2);
    }
}
