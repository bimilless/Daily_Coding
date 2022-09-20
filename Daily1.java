package com.codestates.coplit;
import java.util.*;

public class Daily1 {
    public HashMap<String, String> transformFirstAndLast(String[] arr) {
        // TODO:
        // 빈 배열을 입력받는 경우, null 리턴
        if (arr.length == 0) return null;
        // 결과를 받을 HashMap 타입 생성
        HashMap<String, String> arrMap = new HashMap<>();
        // 배열의 첫 요소와 마지막 요소를 키와 값으로 받음
        arrMap.put(arr[0], arr[arr.length -1]);

        return arrMap;
