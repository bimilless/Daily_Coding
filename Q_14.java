public class Q_14 {
    public static void main(String[] args) {
        Q_14 c = new Q_14();
        boolean output = c.superIncreasing(new int[]{1, 3, 6, 13, 54});
        System.out.println(output); // --> true

        output = c.superIncreasing(new int[]{1, 3, 5, 9});
        System.out.println(output); // --> false
    }
    public boolean superIncreasing(int[] arr) {
        // 초기값 설정
        int sum = arr[0];

        // for문 i 번의 인덱스 요소가 이전 요소들의 합보다 작으면 false, 크면 true
        for (int i=1; i< arr.length; i++) {
            if (arr[i] <= sum) {
                return false;
            }
            sum += arr[i];
        }
        return true;
    }
}
