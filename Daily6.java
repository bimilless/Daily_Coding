public class Daily6 {
    public static void main(String[] args) {

    }
    public String letterCapitalize(String str) {
    // TODO:
    // split 은 문자열을 배열로 변환, join은 배열을 문자열로 변환
    // 빈 문자열 일 때 빈 문자열 리턴
    if(str.length()==0)return"";
    // 문자열을 공백을 기준으로 분리함
    String[] arr = str.split(" ");
    // 결과값을 받을 result 선언
    String result = "";

    // 반복문을 이용하여 배열의 각 요소의 첫 글자를 대문자로 변환
    for( int i = 0; i<arr.length;i++) {
        if (arr[i].isEmpty()) {
            arr[i] = arr[i];
        } else {
            arr[i] = String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
        }
    }
    // join으로 배열 요소들을 문자열로 변환 각 요소를 공백으로 구분
    result =result.join(" ",arr);

    return result;
}
}