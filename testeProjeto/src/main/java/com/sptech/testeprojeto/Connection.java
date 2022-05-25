package com.sptech.testeprojeto;

import org.apache.commons.dbcp2.BasicDataSource;

public class Connection {

    private BasicDataSource dataSource;

    public Connection() {
        dataSource = new BasicDataSource();
        

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://0.0.0.0:3306/smartsac");
        dataSource.setUsername("root");
        dataSource.setPassword("smartsac");

    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
