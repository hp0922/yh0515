package com.qf.BuyBook.mapper;
import com.qf.BuyBook.model.BookStore;
import com.qf.BuyBook.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyBookMapper {

     //根据id查询人账户信息

    Person selectPersonById(int fromId);

    // 根据账户中的id和余额对数据库进行修改

    void updatePersonByPerson(Person person);

     //根据id查询书信息

    BookStore selectBookStoreById(int toId);

     //根据书中的id和库存对数据库进行修改

    void updateBookStoreByBookStore(BookStore bookStore);
}
