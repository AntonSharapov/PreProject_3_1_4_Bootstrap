package ru.kata.spring.boot_security.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.model.Role;
import ru.kata.spring.boot_security.repository.RoleRepository;
@Service
public class RoleServiceImp implements RoleService {
    private RoleRepository roleRepository;

    public RoleServiceImp(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findById(long role_id) {
        return roleRepository.findById(role_id);
    }
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }


}
