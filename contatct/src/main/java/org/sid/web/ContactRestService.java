package org.sid.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.PostConstruct;

import org.sid.dao.ContactRepository;
import org.sid.entites.contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ContactRestService {

	@Autowired
	private ContactRepository contactRespository;
	
	/*@PostConstruct
	public void initDB() throws ParseException {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		Date t=df.parse("09/08/2000");
		List<contact> contacts=IntStream.rangeClosed(29, 120).mapToObj(i->new contact("Nomcontact"+i,"PrenomContact"+i,t,"EmailContact"+i+"@gmail.com",060000000,"PhotoContact")).collect(Collectors.toList());
		contactRespository.saveAll(contacts);
	}*/
	@RequestMapping(value="/contacts",method=RequestMethod.GET)
	public List<contact> getContact(){
		return contactRespository.findAll();
		
		
	}
	
	@RequestMapping(value="/contact/{id}",method=RequestMethod.GET)
	public Optional<contact> getContactById(@PathVariable long id){
		return contactRespository.findById(id);
	}
	
	@RequestMapping(value="/contacts/save",method=RequestMethod.POST)
	public contact PostContact(@RequestBody contact data){
		return contactRespository.save(data);
	}
	
	@RequestMapping(value="/contacts/delete",method=RequestMethod.DELETE)
	public boolean deleteAll(){
		 contactRespository.deleteAll();
		 return true;
	}
	
	@RequestMapping(value="/deleteById/{id}",method=RequestMethod.DELETE)
	public boolean deleteById(@PathVariable long id){
		
		 contactRespository.deleteById(id);
		 return true;
	}
	
	@RequestMapping(value="/contacts/update/{id}",method=RequestMethod.PUT)
	public contact updateContact(@PathVariable long id,@RequestBody contact data){
		data.setId(id);
		
		return contactRespository.save(data);
	}
	
	@RequestMapping(value="/chercherContact",method=RequestMethod.GET)
	public Page<contact> Chercher(@RequestParam(name="mc",defaultValue="") String  mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size){
		return contactRespository.cherche("%"+mc+"%",PageRequest.of(page, size));
	}
	
	
}
