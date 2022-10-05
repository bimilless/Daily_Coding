import java.util.HashMap;

public class Q_01 {
    public static void main(String[] args) {
        Q_01 c = new Q_01();
        String[] arr = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
        HashMap<String, String> output = c.transformFirstAndLast(arr);
        System.out.println(output); // --> { Queen : 'Beyonce' }

        String[] arr1 = new String[]{"Kevin", "Bacon", "Love", "Hart", "Costner", "Spacey"};
        HashMap<String, String> output1 = c.transformFirstAndLast(arr);
        System.out.println(output1); // --> { Kevin : 'Spacey' }
    }

    public HashMap<String, String> transformFirstAndLast(String[] arr) {
// 빈 배열을 입력받는 경우, null 리턴
        if (arr.length == 0) return null;
        // 결과를 받을 HashMap 타입 생성
        HashMap<String, String> arrMap = new HashMap<>();
        // 배열의 첫 요소와 마지막 요소를 키와 값으로 받음
        arrMap.put(arr[0], arr[arr.length - 1]);

        return arrMap;
    }
}