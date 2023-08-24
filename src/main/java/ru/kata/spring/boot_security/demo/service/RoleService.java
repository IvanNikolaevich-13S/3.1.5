package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public Role findRoleByName(String name) {
        return roleRepository.findRoleByName(name);
    }

    public Role findRoleById(Long id) {
        return roleRepository.findRoleById(id);
    }


    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
