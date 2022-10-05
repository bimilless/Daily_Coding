public class Q_10 {
    public static void main(String[] args) {
        Q_10 c = new Q_10();
        String output = c.insertDash("454793");
        System.out.println(output); // --> 4547-9-3

    }

    public String insertDash(String str) {
        if (str.length() == 0) return null;

        String result = "" + str.charAt(0);

        // char 타입의 숫자를 int 타입으로 변환
        for (int i = 1; i < str.length(); i++) {
            // 연속된 수
            int prev = Character.getNumericValue(str.charAt(i - 1));
            int cur = Character.getNumericValue(str.charAt(i));
            // 홀수이면 '-' 추가
            if (prev % 2 != 0 && cur % 2 != 0) {
                result = result + '-';
            }
            result = result + str.charAt(i);
        }
        return result;
    }
}
