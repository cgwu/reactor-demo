package me.gg.reactordemo.service;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by danny on 2018/12/7.
 */
@Data
@AllArgsConstructor
public class User {
    private String id;
    private String firstName;
    private String lastName;
}
