public class Q_20 {
    public static void main(String[] args) {
        Q_20 c = new Q_20();
        String output = c.compressString("abc");
        System.out.println(output); // --> "abc"

        String output1 = c.compressString("wwwggoppopppp");
        System.out.println(output1); // --> "3wggoppo4p"
    }

    public String compressString(String str) {
        if(str.length() == 0 ) return "";
        // 연속되는 문자를 기록하기 위한 변수를 선언하고
        // 첫 번째 문자로 초기화한다.
        char keep = str.charAt(0);
        // 동일한 문자의 반복 횟수를 저장할 변수를 선언, 초기값은 1로 할당한다.
        int count = 1;
        // 정답으로 리턴할 문자열을 선언한다. 초기값은 공백으로 할당한다.
        String result = "";

        // 마지막 부분이 연속된 문자일 경우를 위해 dummy 문자 추가합니다.
        str = str + ' ';

        for (int i=1; i < str.length(); i++) {
            // 동일한 문자가 반복될 경우
            if ( keep == str.charAt(i)) {
                count++;
            } else {
                // 이전과 다른 문자인 경우
                // 반복 횟수가 3 이상인 경우에만 문자열을 압축한다.
                if (count >= 3 ) {
                    result = result + count + keep;
                } else {
                    // count의 수 만큼 결과에 문자열을 저장한다.
                    for(int j=0; j < count; j++) {
                        result = result + keep;
                    }
                    //자바 11에서 지원하는 String.repeat메소드를 활용하면 조금 더 간단하게 작성이 가능하다.
                    //result = result + Character.toString(keep).repeat(count);
                }
                keep = str.charAt(i);
                count = 1;
            }
        }
        return result;
    }
}
