package com.program.demomongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;


@Document(collection = "info")
public class info {
    LocalDateTime now = LocalDateTime.now();
    @Id
    private Integer id;
    private  String first_name;
    private  String last_name;
    private  String email;
    private String password;
    private LocalDateTime created=now;

    public Integer getId(){return id;}

//    public LocalDateTime getNow() {
//        return now;
//    }
//
//    public void setNow(LocalDateTime now) {
//        this.now = now;
//    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
