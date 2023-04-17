package com.remousses.social_network_lite.component;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModelMapperCustomize extends ModelMapper {
	
	public <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
	    return source
	      .stream()
	      .map(element -> this.map(element, targetClass))
	      .collect(Collectors.toList());
	}
}