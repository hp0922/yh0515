package com.qf.BuyBook.model;

import java.math.BigDecimal;

public class BookStore {
    private int id;
    private String bookName;
    private BigDecimal bookPrice;
    private int bookNum;

    public BookStore() {
    }

    public BookStore(int id, String bookName, BigDecimal bookPrice, int bookNum) {
        this.id = id;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookNum = bookNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookNum=" + bookNum +
                '}';
    }
}
