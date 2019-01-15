# Spring Boot 2 Application using Kotlin and DynamoDb
## Prerequisits
* Download a Docker Container with DynamoDB Local
* Start Docker Container
* Configure the Spring Boot Application with the connection with the URL of your running DynamoDB
* Configure aws configure so that the region is e.g. us-east-1
* Create via aws cli a table on the running DynamoDB local
* Startup Spring Boot
* Go to http://localhost:8080/findall to verify if the application is running properly. You should see no error
* Go to http://localhost:8080/save to create a couple of customers
* Go to http://localhost:8080/findall to see if the created customers are available

## Links
* https://grokonez.com/spring-framework/spring-data/how-to-use-spring-data-dynamodb-example-spring-boot
* https://hub.docker.com/r/amazon/dynamodb-local
* https://github.com/derjust/spring-data-dynamodb
* https://www.baeldung.com/spring-data-dynamodb
* https://docs.aws.amazon.com/de_de/cli/latest/userguide/install-virtualenv.html
* https://www.digitalocean.com/community/tutorials/how-to-install-python-3-and-set-up-a-local-programming-environment-on-ubuntu-16-04
* https://docs.aws.amazon.com/de_de/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html
* https://stackoverflow.com/questions/51957980/you-have-defined-query-method-in-the-repository-but-you-dont-have-any-query-loo