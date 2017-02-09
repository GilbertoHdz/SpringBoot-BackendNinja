package com.manitos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.manitos.component.ContactConverter;
import com.manitos.entity.Contact;
import com.manitos.model.ContactModel;
import com.manitos.repository.ContactRepository;
import com.manitos.service.ContactService;

@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;
	
	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;

	@Override
	public ContactModel addContact(ContactModel contactModel) {
		Contact contact = contactRepository.save(contactConverter.contactModelToEntity(contactModel));
		
		return contactConverter.contactEntityToModel(contact);
	}

	@Override
	public List<ContactModel> listAllContacts() {
		List<Contact> contacts = contactRepository.findAll();
		List<ContactModel> contactsModel = new ArrayList<ContactModel>();
		
		for(Contact contact : contacts){
			contactsModel.add(contactConverter.contactEntityToModel(contact));
		}
		
		return contactsModel;
	}

	@Override
	public Contact findContactById(int id) {
		return contactRepository.findById(id);
	}
	
	@Override
	public ContactModel findContactByIdModel(int id) {
		return contactConverter.contactEntityToModel(findContactById(id));
	}

	@Override
	public void removeContact(int id) {
		Contact contact = contactRepository.findById(id);
		if(null != contact){
			contactRepository.delete(contact);
		}
	}

}
