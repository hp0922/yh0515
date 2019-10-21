package com.qf.BuyBook;

import com.qf.BuyBook.mapper.BuyBookMapper;
import com.qf.BuyBook.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dao.xml")
public class AppTest {
    @Autowired
    BuyBookMapper mapper;
    @Test
    public void shouldAnswerWithTrue(){
        System.out.println(mapper.selectPersonById(1));
        System.out.println(mapper.selectBookStoreById(1));
        mapper.updatePersonByPerson(new Person(1,"zhangsan",new BigDecimal(400)));
    }
}
