package ru.cft.migration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MigrationServie {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int count() {
        return jdbcTemplate
                .queryForObject("select count(*) from dual", Integer.class);
    }
}
