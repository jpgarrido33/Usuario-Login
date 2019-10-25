package com.User.Login.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.User.Login.DTO.UserDTO;
import com.User.Login.Model.User;

@Component
public class MapperSrvUserImpl implements MapperServices <UserDTO, User> {
	
	@Override
	public UserDTO mapToDto(User user) {
		final UserDTO userDto = new UserDTO();
		if (Optional.ofNullable(user).isPresent()) {
			userDto.setId(user.getId());
			userDto.setFirstName(user.getFirstName());
			userDto.setLasName(user.getLastName());
			userDto.setEmail(user.getEmail());
			userDto.setUserName(user.getUsername());
			userDto.setPassword(user.getPassword());
			userDto.setConfirmPasword(user.getConfirmPassword());
		}
			return userDto;
	}

	@Override
	public User mapToEntity(UserDTO dto) {
		final User user = new User();
		if(Optional.of(dto).isPresent()){
			user.setId(dto.getId());
			user.setUsername(dto.getUserName());
			user.setFirstName(dto.getFirstName());
			user.setLastName(dto.getLasName());
			user.setEmail(dto.getEmail());
			user.setPassword(dto.getPassword());
			user.setConfirmPassword(dto.getConfirmPasword());		
			
		}
		return user;
	}

	@Override
	public Page<UserDTO> mapPageToDto(Page<User> pageEntity) {
		return pageEntity.map(b-> mapToDto(b));
	}

	@Override
	public List<UserDTO> mapListToDto(List<User> listUser) {
		final List<UserDTO> listUserDto = new ArrayList<>();
		listUser.forEach((b)-> {
			final UserDTO userDto = mapToDto(b);			
			listUserDto.add(userDto);		
		});
		return listUserDto;
	}

}
