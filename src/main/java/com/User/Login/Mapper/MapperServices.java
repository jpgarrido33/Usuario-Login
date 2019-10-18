package com.User.Login.Mapper;

import java.util.List;

import org.springframework.data.domain.Page;

public interface MapperServices<T,S> {

	 
	
	T mapToDto (S entity);

	S mapToEntity (T dto) ;

	List<T> mapListToDto(List<S> listUser);

	Page<T> mapPageToDto(Page<S> pageEntity);
}	