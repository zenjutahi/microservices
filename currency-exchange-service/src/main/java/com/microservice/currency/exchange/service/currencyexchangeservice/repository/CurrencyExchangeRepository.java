package com.microservice.currency.exchange.service.currencyexchangeservice.repository;

import com.microservice.currency.exchange.service.currencyexchangeservice.entity.CurrencyExchange;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);
}
