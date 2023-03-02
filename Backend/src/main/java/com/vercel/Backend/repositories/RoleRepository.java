package com.vercel.Backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vercel.Backend.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
