package com.in28minutes.microservices.currency_conversion_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//without eureka-
//@FeignClient(name = "currency-exchange", url="http://localhost:8000")
@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {
	//currency conversion has same fields as currency exchange.
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeRate(
			@PathVariable String from, @PathVariable String to);
}
