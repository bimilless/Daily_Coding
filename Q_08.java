public class Q_08 {
    public static void main(String[] args) {
        Q_08 c = new Q_08();
        String output = c.convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output); // --> "string with double spaces"

    }

    public String convertDoubleSpaceToSingle(String str) {
        // TODO:
        // 두 칸의 공백을 기준으로 문자열 -> 배열 변환
        String[] words = str.split("  ");
        // 바꿔준 배열을 한 칸의 공백을 가진 문자열로 변환
        str = String.join(" ", words);
        // 결과값 리턴
        return str;
    }
}