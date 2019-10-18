package com.User.Login.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.User.Login.DTO.RoleDTO;
import com.User.Login.Model.Role;

@Component
public class MapperSrvRoleImpl implements MapperServices<RoleDTO, Role> {

	@Override
	public RoleDTO mapToDto(Role entity) {
		
		final RoleDTO roleDto= new RoleDTO();
		
		if(Optional.ofNullable(entity).isPresent()) {
			
			roleDto.setId(entity.getId());
			roleDto.setName(entity.getName());
			roleDto.setDescription(entity.getDescription());
		}
		
		return roleDto;
	}

	@Override
	public Role mapToEntity(RoleDTO dto) {
		
		final Role role=new Role();
		
		if(Optional.of(dto).isPresent()) {
		
			role.setId(dto.getId());
			role.setName(dto.getName());
			role.setDescription(dto.getDescription());
		}
		return role;
	}

	@Override
	public List<RoleDTO> mapListToDto(List<Role> listRole) {
		
		final List<RoleDTO> listRoleDto = new ArrayList<>();
		listRole.forEach((b)-> {
			final RoleDTO roleDto = mapToDto(b);			
			listRoleDto.add(roleDto);		
		});
		return listRoleDto;
	}

	@Override
	public Page<RoleDTO> mapPageToDto(Page<Role> pageEntity) {
		return pageEntity.map(b-> mapToDto(b));
	}

}
