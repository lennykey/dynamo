package com.acme.dynamo.repository

import com.acme.dynamo.domain.Customer
import org.socialsignin.spring.data.dynamodb.repository.EnableScan
import org.springframework.data.repository.CrudRepository

@EnableScan
interface CustomerRepository : CrudRepository<Customer, String>
