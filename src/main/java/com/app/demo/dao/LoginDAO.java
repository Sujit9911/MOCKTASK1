
package com.app.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.model.User;


@Repository
public interface LoginDAO extends JpaRepository<User, Integer> {

}