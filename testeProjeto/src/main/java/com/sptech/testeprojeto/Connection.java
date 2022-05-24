package com.sptech.testeprojeto;

import org.apache.commons.dbcp2.BasicDataSource;

public class Connection {

    private BasicDataSource dataSource;

    public Connection() {
        dataSource = new BasicDataSource();
        

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://172.18.0:3306/smartsac?autoReconnect=true&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("smartsac");

    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
