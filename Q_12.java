// Arrays.copyOf(원본배열, 복사할 길이);
// Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) 인덱스는 0부터 시작하는것 기준
// System.arraycopy(src, srcPos, dest, destPos, length)
// src = 복사하고자 하는 소스, 즉 원본
// srcPos = src에서 어느 부분부터 읽어올지 위치를 정함. 처음부터면 0을 설정
// dest = 복사하려는 대상
// destPos = 복사본에서 자료를 받을 때, 어느 부분부터 쓸 것인지 위치를 정함.
// length = 원본에서 복사본까지 얼만큼 읽어올지 입력함.

import java.util.Arrays;

public class Q_12 {
    public static void main(String[] args) {
        Q_12 c = new Q_12();

        int[] output = c.reverseArr([1, 2, 3]);
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }
    public int[] reverseArr(int[] arr) {
        // 빈 배열은 빈 배열 리턴
        if (arr.length == 0) return new int[]{};
        // arr 배열의 마지막 인덱스 요소를 복사
        int[] head = Arrays.copyOfRange(arr, arr.length - 1, arr.length);
        // arr 배열의 마지막 인덱스 요소를 제외한 reverseArr
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length - 1));
        // result 배열 생성
        int[] result = new int[head.length + tail.length];
        // result 에 head 배열의 0번째 인덱스부터 인덱스 0 ~ head.length 만큼의 내용을 복사
        System.arraycopy(head, 0, result, 0, head.length);
        // result 에 tail 배열의 0번째 인덱스부터 head.length ~ tail.length 만큼의 내용을 복사
        System.arraycopy(tail, 0, result, head.length, tail.length);
        return result;

    }
}