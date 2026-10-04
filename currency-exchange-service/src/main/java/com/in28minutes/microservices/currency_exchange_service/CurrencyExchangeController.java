package com.in28minutes.microservices.currency_exchange_service;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController 
{
	//spring auto provides this
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeRepository repository; 
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrenyExchange retrieveExchangeRate(
			@PathVariable String from, @PathVariable String to)
	{
		//CurrenyExchange currencyExchange = new CurrenyExchange(
				//1000L, from, to, BigDecimal.valueOf(50));
		CurrenyExchange currencyExchange = repository.findByFromAndTo(from, to);
		
		if(currencyExchange == null)
		{
			throw new RuntimeException(
					"Unable to find currency exchange from - " + from + " to "+ to);
		}
		
		currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
		return currencyExchange;
	}
}
