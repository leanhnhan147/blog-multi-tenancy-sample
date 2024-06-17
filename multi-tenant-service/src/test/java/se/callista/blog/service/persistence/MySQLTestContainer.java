package se.callista.blog.service.persistence;

import org.testcontainers.containers.MySQLContainer;

public class MySQLTestContainer extends MySQLContainer<MySQLTestContainer> {
    private static final String IMAGE_VERSION = "mysql:8.0.20"; // Bạn có thể chọn phiên bản MySQL mà bạn muốn
    private static MySQLTestContainer container;

    private MySQLTestContainer() {
        super(IMAGE_VERSION);
    }

    public static MySQLTestContainer getInstance() {
        if (container == null) {
            container = new MySQLTestContainer();
        }
        return container;
    }

    @Override
    public void start() {
        super.start();
        System.setProperty("DB_HOST", container.getHost() + ":" + container.getMappedPort(MYSQL_PORT));
        System.setProperty("DB_NAME", container.getDatabaseName());
        System.setProperty("DB_URL", container.getJdbcUrl());
        System.setProperty("DB_USERNAME", container.getUsername());
        System.setProperty("DB_PASSWORD", container.getPassword());
    }

    @Override
    public void stop() {
        //do nothing, JVM handles shut down
    }
}
