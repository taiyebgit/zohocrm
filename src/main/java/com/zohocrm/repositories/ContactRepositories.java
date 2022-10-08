package com.zohocrm.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.zohocrm.entities.contact;
public interface ContactRepositories extends JpaRepository<contact, Long> {

}
