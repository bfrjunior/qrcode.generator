package com.fernandorocha.qrcode.generator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernandorocha.qrcode.generator.dto.QrCodeGenerateRequest;
import com.fernandorocha.qrcode.generator.dto.QrCodeGenerateResponse;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {
    
    @PostMapping
     public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request){
    
        return null;
    }
}
