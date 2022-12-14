package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entites.contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContatctApplication implements CommandLineRunner{
    @Autowired
	private ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(ContatctApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
		/*DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		contact c=new contact("hassani","mmmm",df.parse("09/08/2000"),"hassani@gmail.com",044444444,"jjj");
		
		contactRepository.save(c);
			
		contactRepository.save(new contact("morad","mmmm",df.parse("09/08/2000"),"morad@gmail.com",02222222,"jjj"));
		contactRepository.save(new contact("hanane","ddd",df.parse("09/08/2000"),"hanae@gmail.com",03333,"jjj"));
		contactRepository.save(new contact("Ahmed","mmmm",df.parse("09/08/2000"),"ahmed@gmail.com",055555,"jjj"));
		contactRepository.findAll().forEach(v->{
			System.out.printf(v.getNom());
		});*/
	}

}
