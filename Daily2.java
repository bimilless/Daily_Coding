public class Daily2 {
    public int computeWhenDouble(double interestRate) {
    // 필요변수 이자율, 누적금액, 년
    // (원금+이자율)^년 = 2
    // 처음원금*2 = 시간 리턴
    // !처음원금*2 = 반복 진행

    double rate = 1 + interestRate / 100;
    double principal = 1;
    int year = 0;

    while(principal< 2) {
        principal = principal * rate;
        year++;
    } return year;
}
