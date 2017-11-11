package br.inatel.dm110.beans;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.dm110.hello.interfaces.*;

@Stateless
@Remote(HelloRemote.class)
@Local(HelloLocal.class)
public class HelloBean implements HelloLocal, HelloRemote {

	@Override
	public String sayHello(String name) {
		System.out.println("Inside EJB!");
		return "Hello " + name;
	}
	

}
