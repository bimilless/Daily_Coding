public class Q_18 {
    public static void main(String[] args) {
        Q_18 c = new Q_18();
        int output = c.numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = c.numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = c.numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }

    public int numberSearch(String str) {
        // 모든 숫자를 문자열로 선언
        String digit = "0123456789";

        // 빈 문자열일 경우 0을 리턴함
        if (str.length()==0) return 0;

        // 찾는 숫자 값을 저장할 변수, 숫자 제외한 문자열을 받을 변수를 선언
        double number = 0;
        String finalStr= "";

        for(int i=0; i<str.length(); i++) {
            //digit의 값에서 str[i]의 값이 포함되어 있다면 (indefxOf는 값이 존재하면 해당 인덱스를, 없다면 -1을 리턴한다)
            if(digit.indexOf(str.charAt(i)) != -1) {
                // 찾은 숫자 값을 더한다.
                number = number + Character.getNumericValue(str.charAt(i));
                // 숫자가 아니고, 공백이 아니라면
            } else if(str.charAt(i) != ' ') {
                // 해당 문자를 최종 문자열에 더한다.
                finalStr = finalStr + str.charAt(i);
            }
        }
        // 숫자 값의 합을 문자열의 길이로 나눈다.
        double result = number / finalStr.length();
        // Math.round를 활용하여 소수점으로부터 반올림하여 리턴한다.
        return (int)Math.round(result);
    }
}
