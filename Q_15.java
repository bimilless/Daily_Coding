public class Q_15 {
    public static void main(String[] args) {
        Q_15 c = new Q_15();
        Integer output = c.modulo(25, 4);
        System.out.println(output); // --> 1

        output = c.modulo(25, 0);
        System.out.println(output); // --> null
    }
    public Integer modulo(int num1, int num2) {
        // 어떤 수도 0으로 나눌 수 없습니다. 이 경우 null를 리턴해야 합니다. (조건)
        if (num2 ==0) return null;
        // `/` `%` 연산자 사용이 금지되기 때문에, num>=num2 인 조건식에 반복으로 num1- num2 를 통해 나머지를 구한다.
        while ( num1 >= num2) {
            num1 = num1 - num2;
        }
        return num1;
    }
}

