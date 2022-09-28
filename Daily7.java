import java.util.HashMap;

public class Daily7 {
    public static void main(String[] args) {

    }

    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:
        // 결과값을 받는 HashMap 생성
        HashMap<String, String> result = new HashMap<>();
        // 빈 배열인 경우, 현재 빈 HashMap인 result 리턴
        if (arr.length == 0) return result;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 0) { // arr의 요소가 존재하고, (길이가 0이 아닌)
                if (!result.containsKey(arr[i][0])) { // result에 arr[i]의 첫번째 요소가 없다면,
                    result.put(arr[i][0], arr[i][1]); // arr[i]의 첫 번째 요소를 키, 두 번째 요소를 값 추가
                }
            }
        }
        return result;
    }
}
