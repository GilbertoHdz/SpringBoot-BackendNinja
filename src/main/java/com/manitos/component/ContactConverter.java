package com.manitos.component;

import org.springframework.stereotype.Component;

import com.manitos.entity.Contact;
import com.manitos.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {
	
	//Model To Entity
	public Contact contactModelToEntity(ContactModel contactModel){
		Contact contact = new Contact();
		
		contact.setId(contactModel.getId());
		contact.setFirstname(contactModel.getFirstname());
		contact.setLastname(contactModel.getLastname());
		contact.setCity(contactModel.getCity());
		contact.setTelephone(contactModel.getTelephone());
		
		return contact;
	}
	
	//Entity To Model
	public ContactModel contactEntityToModel(Contact contact){
		ContactModel contactModel = new ContactModel();
		
		contactModel.setId(contact.getId());
		contactModel.setFirstname(contact.getFirstname());
		contactModel.setLastname(contact.getLastname());
		contactModel.setCity(contact.getCity());
		contactModel.setTelephone(contact.getTelephone());
		
		return contactModel;
	}

}
