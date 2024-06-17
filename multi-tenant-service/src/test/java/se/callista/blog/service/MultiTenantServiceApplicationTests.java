package se.callista.blog.service;

import org.junit.jupiter.api.Test;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import se.callista.blog.service.annotation.SpringBootIntegrationTest;
import se.callista.blog.service.persistence.MySQLTestContainer;
import se.callista.blog.service.persistence.PostgresqlTestContainer;

@Testcontainers
@SpringBootIntegrationTest
class MultiTenantServiceApplicationTests {

	@Container
	private static final MySQLTestContainer POSTGRESQL_CONTAINER = MySQLTestContainer.getInstance();

	@Test
	void contextLoads() {
	}

}
