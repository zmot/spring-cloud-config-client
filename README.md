# Spring Cloud Config client
Sample application using Spring Cloud Config server <http://http://localhost:8090> to load its configuration (list of lucky words).

Exposes an endpoint at <http://localhost:8080/lucky-word>

## Dynamic configuration refresh
Requires RabbitMQ server and running. 

In order to refresh the configuration of Lucky Client service you need to make a POST request to Spring Cloud Configuration server, i.e.:
<http://localhost:8090/bus/refresh>
