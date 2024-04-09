package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}