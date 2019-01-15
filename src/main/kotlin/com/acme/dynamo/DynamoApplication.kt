package com.acme.dynamo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DynamoApplication

fun main(args: Array<String>) {
	runApplication<DynamoApplication>(*args)
}

