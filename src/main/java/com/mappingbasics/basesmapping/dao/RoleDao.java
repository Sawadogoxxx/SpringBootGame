package com.mappingbasics.basesmapping.dao;
import com.mappingbasics.basesmapping.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Integer> {
}
