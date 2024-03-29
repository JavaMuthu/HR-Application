/**
 * 
 */
package com.changepond.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.changepond.hrms.domain.Customer;

/**
 * @author muthukumar.m
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	public Customer findByClientName(String clientName);
}
