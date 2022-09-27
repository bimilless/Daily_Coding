public class Daily5 {
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
