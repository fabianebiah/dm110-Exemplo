package br.inatel.dm110.hello.rest;
import br.inatel.dm110.hello.impl.HelloServiceImpl;
import javax.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class RestApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(HelloServiceImpl.class);
		return classes;
	}

	

}
