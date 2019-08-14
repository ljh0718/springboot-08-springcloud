package com.atguigu.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * @author Mr.Z
 * @create 2019/8/14 14:33
 */
@Service
public class TicketService {

    public String getTicket(){
        System.out.println("8002");
        return "《流浪地球》";
    }
}
