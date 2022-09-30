public class Daily9 {
    public static void main(String[] args) {
        Daily9 c = new Daily9();
        boolean output = c.ABCheck("lane Borrowed");
        System.out.println(output); // --> true
    }

    public boolean ABCheck(String str) {
        // 예외는 false 반환
        if (str.length() == 0) return false;
        // 대소문자를 구분하지 않고, a와 b를 찾으므로 toLowerCase 사용
        str = str.toLowerCase();
        // 길이 5의 문자열
        // i = 0 으로 설정하면 java.lang.StringIndexOutOfBoundsException 에러 발생
        for (int i = 4; i < str.length(); i++) {
            if (str.charAt(i) == 'a' && str.charAt(i - 4) == 'b' || str.charAt(i) == 'b' && str.charAt(i - 4) == 'a') {
                return true;
            }
        }
        return false;
    }
}
