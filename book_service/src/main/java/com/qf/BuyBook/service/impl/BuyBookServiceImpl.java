package com.qf.BuyBook.service.impl;
import com.qf.BuyBook.exception.ExchangeBookException;
import com.qf.BuyBook.mapper.BuyBookMapper;
import com.qf.BuyBook.model.BookStore;
import com.qf.BuyBook.model.Person;
import com.qf.BuyBook.service.BuyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;

@Service
public class BuyBookServiceImpl implements BuyBookService {
    @Autowired
    BuyBookMapper mapper;
    @Override
    @Transactional
    public void exchangeBook(int fromId, int toId) throws ExchangeBookException {
        Person person = mapper.selectPersonById(fromId);
        BookStore bs = mapper.selectBookStoreById(toId);
        BigDecimal bookPrice = bs.getBookPrice();//单价
        if(bs.getBookPrice().compareTo(person.getBalance())>0){
            System.out.println("余额不足");
            throw new ExchangeBookException("余额不足");
        }
        if(bs.getBookNum()<1){
            System.out.println("库存不足");
            throw new ExchangeBookException("库存不足");
        }
        person.setBalance(person.getBalance().subtract(bookPrice));
        mapper.updatePersonByPerson(person);//修改余额
        bs.setBookNum(bs.getBookNum() - 1);
        mapper.updateBookStoreByBookStore(bs);//修改库存

    }

}
