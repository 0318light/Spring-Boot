package com.inhatc.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class BaseballController {

    @GetMapping("/baseball")
    @ResponseBody
    public String baseball() {
        // 1. 0~9까지 숫자를 리스트에 담기
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            numbers.add(i);
        }

        // 2. 숫자 섞기 (중복 방지)
        Collections.shuffle(numbers);

        // 3. 앞의 4자리만 가져와서 문자열로 합치기
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += numbers.get(i);
        }

        return "baseball number: " + result;
    }
}
