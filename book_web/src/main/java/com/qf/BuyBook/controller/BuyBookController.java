package com.qf.BuyBook.controller;
import com.qf.BuyBook.service.BuyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BuyBookController {

        @Autowired
        BuyBookService service;
        @RequestMapping("/index")
        public String toindex(){
            return "index";
        }
        @PostMapping("/index")
        public  String update(int fromId, int toId){
            service.exchangeBook(fromId,toId);
            return "index";
        }

    }
