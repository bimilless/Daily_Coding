public class Q_04 {
    public static void main(String[] args) {
        Q_04 c = new Q_04();
        String output = c.firstCharacter("hello world");
        System.out.println(output); // --> "hw"

        String output1 = c.firstCharacter("The community at Code States might be the biggest asset");
        System.out.println(output1); // --> "TcaCSmbtba"

    }

    public String firstCharacter(String str) {
        // TODO:
        // 빈 문자열을 입력받은 경우, 빈 문자열을 리턴
        if (str.length() == 0) return "";
        // 문자열을 공백을 기준으로 하는 배열 생성
        String[] words = str.split(" ");
        String result = "";
        // 반복문으로 배열 요소의 첫번째 값을 result에 더해줌
        for (int i = 0; i < words.length; i++) {
            result = result + words[i].charAt(0);
        }
        return result;
    }
}
