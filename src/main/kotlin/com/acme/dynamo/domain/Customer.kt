package com.acme.dynamo.domain


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable

@DynamoDBTable(tableName = "Customer")
class Customer {

    @get:DynamoDBHashKey(attributeName = "Id")
    var id: String? = null
    @get:DynamoDBAttribute(attributeName = "FirstName")
    var firstName: String? = null
    @get:DynamoDBAttribute(attributeName = "LastName")
    var lastName: String? = null

    constructor() {}

    constructor(id: String, firstName: String, lastName: String) {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
    }

    override fun toString(): String {
        return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id, firstName, lastName)
    }
}
