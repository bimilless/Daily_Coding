public class Q_02 {
    public static void main(String[] args) {
        Q_02 c = new Q_02();
        int output = c.computeWhenDouble(7);
        System.out.println(output); // --> 11

        int output1 = c.computeWhenDouble(10);
        System.out.println(output1); // --> 8
    }

    public int computeWhenDouble(double interestRate) {
        // 필요변수 이자율, 누적금액, 년
        // (원금+이자율)^년 = 2
        // 처음원금*2 = 시간 리턴
        // !처음원금*2 = 반복 진행

        double rate = 1 + interestRate / 100;
        double principal = 1;
        int year = 0;

        while (principal < 2) {
            principal = principal * rate;
            year++;
        }
        return year;
    }
}
