package com.oop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oop.binding.Contact;

public interface  ContactRepository extends JpaRepository<Contact, Integer>{

}
