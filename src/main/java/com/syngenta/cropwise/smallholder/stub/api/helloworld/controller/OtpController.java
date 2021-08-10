package com.syngenta.cropwise.smallholder.stub.api.helloworld.controller;

import static com.syngenta.cropwise.smallholder.stub.utils.ControllerUtils.jsonStringToMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.syngenta.cropwise.smallholder.stub.api.helloworld.Service.OtpService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/otp")
public class OtpController {

	@Autowired
	private OtpService otpservice;

	@PostMapping("/{langId}")
	public Map<String, Object> sendOtp(@PathVariable String langId, @RequestBody OtpRequest request) {
		// ResponseEntity<String> response = otpservice.sendOtpApiCall(request);
		return jsonStringToMap("{\"message\": \" Otp sent Successfully\"}");
	}

	@GetMapping("/{id}")
	public Map<String, Object> verifyOtp(@PathVariable String id, @RequestParam String token) {
		//ResponseEntity<String> response = otpservice.verifyOtpApiCall(token);
		return jsonStringToMap("{\"message\": \"Verify Otp Successfully\"}");
	}

}
