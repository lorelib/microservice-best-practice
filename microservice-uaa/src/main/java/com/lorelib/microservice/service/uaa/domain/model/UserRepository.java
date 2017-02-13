package com.lorelib.microservice.service.uaa.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by listening on 2017/1/3.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
