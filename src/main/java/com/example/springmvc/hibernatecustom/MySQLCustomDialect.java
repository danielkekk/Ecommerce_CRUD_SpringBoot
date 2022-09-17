package com.example.springmvc.hibernatecustom;

import org.hibernate.dialect.MySQL8Dialect;

public class MySQLCustomDialect extends MySQL8Dialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci";
    }
}
