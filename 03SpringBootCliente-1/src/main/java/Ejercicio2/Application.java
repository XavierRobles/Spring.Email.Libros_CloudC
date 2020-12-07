package Ejercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Ejercicio2.Entidad.Email;
import Ejercicio2.Entidad.Libro;

/**
 * 
 * @author xavie
 *1) Creamos un proyecto nuevo SpringBoot

2) Crear una serie de entidades y a darlas de alta en el contexto de spring

3) Crear la entidad Email con los campos
	int id
	String remitente
	String destinatario
	
4) Daremos de alta en el contexto de spring un Email por anotaciones de scope Prototype

5) Daremos de alta en el contexto de spring 2 Email mediante XML de scope Singleton,
les daremos el id que estimemos

6) Crear la entidad Libro con los campos
	String isbn
	String editorial
	Autor autor
	
	Crear la entidad Autor con los campos
		int id
		String nombre
		int edad

7) Daremos de alta en el contexto de spring un Libro que tenga un autor mediante anotaciones con scope
prototipado

8) Daremos de alta en contexto de spring un Libro que tenga un autor mediante XML con scope Singleton
OJO AQUI!!! En el contexto de spring va a haber varios autores disponibles para un libro, ojo aqui
porque os puede dar problemas el autorwired
 */

@SpringBootApplication
public class Application {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		context = new ClassPathXmlApplicationContext("Ejercicio2/recursos/beans.xml");
		System.out.println("--------------------Emails-----------------");
		Email e = context.getBean("email1", Email.class);
		Email e2 = context.getBean("email2", Email.class);
		Email e3 = context.getBean("email", Email.class);
		
		System.out.println(e);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e3);

		System.out.println("------------------Libros-------------------");
		Libro l = context.getBean("libro1", Libro.class);
		Libro l2 = context.getBean("libro", Libro.class);
		Libro l3 = context.getBean("libro", Libro.class);
		System.out.println(l);
		System.out.println(l2);
		System.out.println(l3);
		
		
		
		
		
		
		
	}

}
