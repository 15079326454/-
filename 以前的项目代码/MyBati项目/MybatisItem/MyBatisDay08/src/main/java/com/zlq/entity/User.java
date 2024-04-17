package com.zlq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
public class User implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private String address;

    private String phone;


}