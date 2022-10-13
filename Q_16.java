public class Q_16 {
    public static void main(String[] args) {
        Q_16 c = new Q_16();
        boolean output = c.isIsogram("aba");
        System.out.println(output); // false

        output = c.isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = c.isIsogram("moOse");
        System.out.println(output); // false
    }
    public boolean isIsogram(String str) {
// 빈 문자열을 입력받은 경우, true를 리턴
        if(str.length()==0) return true;
        // 소문자로 변경, 동일하게 만든 후 비교함
        str = str.toLowerCase();
        // char 타입 배열 생성, char으로 비교하기 위함.
        char[] arr = str.toCharArray();

        // for문, indexOf/lastIndexOf 사용해서 인덱스가 다르면 false, 같으면 true 반환
        // indexOf 앞에서부터 / lastIndexOf 뒤에서부터 값을 찾기 시작해서 인덱스가 같으면 그 알파벳은 하나만 사용된 것이기 때문
        for (char param : arr) {
            if (str.indexOf(param) != str.lastIndexOf(param)) {
                return false;
            }
        }
        return true;
    }
}

//향상된 for문
//for (타입 변수이름 : 배열변수)
//배열의 길이만큼 반복하고자 하는 명령문;
//toCharArray(): 문자열을 char형 배열로 바꿔줌
// indexOf(): 앞에서부터 검색할 값을 찾음
//lastIndexOf(): 끝에서부터 검색할 값을 찾음