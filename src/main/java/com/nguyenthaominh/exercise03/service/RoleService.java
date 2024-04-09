package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.Role;

public interface RoleService {
    Role createRole(Role role);
    Role getRoleById(String roleId);
    List<Role> getAllRoles();
    Role updateRole(Role role);
    void deleteRole(String roleId);
}