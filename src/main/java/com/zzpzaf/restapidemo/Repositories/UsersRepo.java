package com.zzpzaf.restapidemo.Repositories;

import java.util.List;

import com.zzpzaf.restapidemo.dataObjects.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Repository
public class UsersRepo {

    private final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${USERS_TABLE}")
    private String USERS_TABLE; // = "USERS";

    @Value("${ROLES_TABLE}")
    private String ROLES_TABLE; // = "AUTHORITIES";

    public List<UserDTO> getUsers() {
        List<UserDTO> users = jdbcTemplate.query("SELECT * FROM " + USERS_TABLE, BeanPropertyRowMapper.newInstance(UserDTO.class));
        logger.info("UsersRepo.getUsers() users.size() = " + users) ;
        return users;
    }  

}
