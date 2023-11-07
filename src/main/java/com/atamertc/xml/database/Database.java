package com.atamertc.xml.database;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Database {

    String password;
    String username;
    String url;
    public abstract  void log();
}
