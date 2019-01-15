package com.acme.dynamo.controller

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acme.dynamo.domain.Customer
import com.acme.dynamo.repository.CustomerRepository

@RestController
class CustomerController(val customerRepository: CustomerRepository) {

    @RequestMapping("/delete")
    fun delete(): String {
        customerRepository.deleteAll()
        return "Done"
    }

    @RequestMapping("/save")
    fun save(): String {
        // save a single Customer
        customerRepository.save(Customer("JSA-1", "Jack", "Smith"))

        // save a list of Customers
        customerRepository.saveAll(Arrays.asList(Customer("JSA-2", "Adam", "Johnson"), Customer("JSA-3", "Kim", "Smith"),
                Customer("JSA-4", "David", "Williams"), Customer("JSA-5", "Peter", "Davis")))

        return "Done"
    }

    @RequestMapping("/findall")
    fun findAll(): List<Customer> {
        val customers = mutableListOf<Customer>()
        val findAll = customerRepository.findAll()

        findAll.forEach {
            customers.add(it)
        }
        println("****")
        println(customers)

        return customers
    }

    @RequestMapping("/findbyid")
    fun findById(@RequestParam("id") id: String): String {
        val result = customerRepository.findById(id).toString()
        return result
    }

    /*
    @RequestMapping("/findbylastname")
    fun fetchDataByLastName(@RequestParam("lastname") lastName: String) : String{
        var result = "";


        for (Customer cust : repository.findByLastName(lastName)) {
            result += cust.toString() + "<br>";
        }

        return result;
    }
    */
}