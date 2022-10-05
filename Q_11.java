public class Q_11 {
    public static void main(String[] args) {
        Q_11 c = new Q_11();
        String[] output = c.removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(output); // --> ["a"', "b"]

        output = c.removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
        System.out.println(output); // --> ["where", "the", "word"]
    }

    public String[] removeExtremes(String[] arr) {
        // 공백 입력받을 시 null 리턴
        if (arr.length == 0) return null;

        // 최소, 최대 문자열 변수 및 인덱스 선언
        int shortestLen = 20;
        int longestLen = 0;
        int shortestIdx = 0;
        int longestIdx = 0;

        // i번의 문자열이 shortestLen 보다 작을 때 shortestLen에 i번의 문자열 대입
        for (int i = 0; i < arr.length; i++) {
            // i 번의 문자열이 반복하면서 최소값을 갱신해줌
            if (arr[i].length() <= shortestLen) {
                // 반복문을 통해 shortestLen 을 갱신하면서 최소값을 찾음
                shortestLen = arr[i].length();
                shortestIdx = i;
            }
            // i번의 문자열이 longestLen 보다 클 때 longestLen에 i번의 문자열 대입
            if (arr[i].length() >= longestLen) {
                longestLen = arr[i].length();
                longestIdx = i;
            }
        }
        // 결과값은 최소 최장 문자열을 제외한 배열
        String[] result = new String[arr.length - 2];
        int curIndex = 0;

        // 반복문을 통해, 최소/최장 문자열에 해당하는 인덱스가 아닐 경우 배열에 값 추가
        for (int i = 0; i < arr.length; i++) {
            if (i != shortestIdx && i != longestIdx) {
                result[curIndex] = arr[i];
                curIndex++;
            }
        }
        return result;
    }
}