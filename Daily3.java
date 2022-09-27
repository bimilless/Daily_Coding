public class Daily3 {
    public boolean powerOfTwo(long num) {
            // num 값을 반복해서 2로 나누게 되면 2의 거듭제곱일 경우 최종적으로 1이 된다.
            // while 문의 조건이 num이 1이 아니면 계속해서 반복한다.
            // if 문 = num 을 2로 나눈 나머지가 0이 아니면 홀수라는 뜻, 즉 2의 거듭제곱이 아닌 수이기 때문에 false 리턴한다.

            while (num != 1) {
                if(num % 2 !=0) {
                    return false;
                }
                num = num / 2;
            } return true;
}
}
