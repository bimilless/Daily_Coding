public class Daily4 {
    public static void main(String[] args) {

        public String firstCharacter(String str) {
            // TODO:
            // 빈 문자열을 입력받은 경우, 빈 문자열을 리턴
            if (str.length()==0) return "";
            // 공백 제거
            String[] words = str.split(" ");
            String result = "";
            // 반복문으로 배열 요소의 첫번째 값을 result에 더해줌
            for (int i=0; i<words.length; i++) {
                result = result + words[i].charAt(0);
            } return result;
    }
}
