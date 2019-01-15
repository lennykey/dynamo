package com.acme.dynamo.configuration

import com.amazonaws.auth.AWSCredentials
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.util.StringUtils


@Configuration
@EnableDynamoDBRepositories(basePackages = ["com.acme.dynamo.repository"])
class DynamoDBConfig {

    @Value("\${amazon.dynamodb.endpoint}")
    private val amazonDynamoDBEndpoint: String? = null

    @Value("\${amazon.aws.accesskey}")
    private val amazonAWSAccessKey: String? = null

    @Value("\${amazon.aws.secretkey}")
    private val amazonAWSSecretKey: String? = null

    @Bean
    @SuppressWarnings("deprecation")
    fun amazonDynamoDB(): AmazonDynamoDB {
        val dynamoDB = AmazonDynamoDBClient(amazonAWSCredentials())

        if (!StringUtils.isEmpty(amazonDynamoDBEndpoint)) {
            dynamoDB.setEndpoint(amazonDynamoDBEndpoint)
        }

        return dynamoDB
    }

    @Bean
    fun amazonAWSCredentials(): AWSCredentials {
        return BasicAWSCredentials(amazonAWSAccessKey!!, amazonAWSSecretKey!!)
    }
}