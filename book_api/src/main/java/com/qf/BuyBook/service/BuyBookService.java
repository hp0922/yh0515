package com.qf.BuyBook.service;

import com.qf.BuyBook.exception.ExchangeBookException;

public interface BuyBookService {
    void exchangeBook(int fromId, int toId) throws ExchangeBookException;
}
