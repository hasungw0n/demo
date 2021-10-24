package com.trip.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class BoardVO {

    private Long num;
    private String name;
    private String pass;
    private String subject;
    private String content;
    private Date joindate;
    private String ip;
    private int readcount;
    private int re_ref;

}
