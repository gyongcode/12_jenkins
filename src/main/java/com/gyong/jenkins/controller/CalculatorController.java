package com.gyong.jenkins.controller;


import com.gyong.jenkins.dto.CalculatorDTO;
import com.gyong.jenkins.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("/health")
    public String healthCheck() {
        return "I'm alive ☠️";
    }

    @GetMapping("/plus")
    public ResponseEntity<CalculatorDTO> plusTwoNumbers(CalculatorDTO calculatorDTO) {
        log.info("핸들러 실행 여부 및 값 확인");
        int result = calculatorService.plusTwoNumbers(calculatorDTO);
        calculatorDTO.setSum(result);
        return ResponseEntity.ok(calculatorDTO);
    }
}
