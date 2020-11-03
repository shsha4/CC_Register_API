package com.mat.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter
@ToString
public class UserVO {
    private String user_id;
    private String user_pw;
    private String user_name;
    private String user_tel;
    private int user_grade;
    private String user_mail;
    private int use_sms;
    private int use_mail;
}
