public class Q_05 {
    public static void main(String[] args) {
        Q_05 c = new Q_05();
        String output = c.firstReverse("codestates");
        System.out.println(output); // "setatsedoc"

        String output1 = c.firstReverse("I love codestates");
        System.out.println(output1); // "setatsedoc evol I"
    }

    public String firstReverse(String str) {
        // TODO:
        // 문자열은 StringBuilder.reverse()를 통해 쉽게 뒤집을 수 있다.
        // toString() - 자신이 가진 값을 그대로 리턴
        // StringBuilder에서 출력이나 변수에 넣을 때에 toString 사용해야한다.
        StringBuilder sb = new StringBuilder(str);
        String output = sb.reverse().toString();
        return output;
    }
}
