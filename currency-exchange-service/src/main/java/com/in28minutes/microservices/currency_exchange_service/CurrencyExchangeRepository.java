package com.in28minutes.microservices.currency_exchange_service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends
	JpaRepository<CurrenyExchange, Long>{
	//spring data JPA will write the impl.
	CurrenyExchange findByFromAndTo(String from, String to);

}
