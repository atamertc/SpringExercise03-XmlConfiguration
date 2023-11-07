package com.atamertc.xml.database;

public class MySql extends Database {
    @Override
    public void log() {
        System.out.println(url+"e bağlanıldı");
        System.out.println("username===> "+ username);
        System.out.println("Mysql'e  loglandı");
    }
}
