package io.whatap.week2;

import io.whatap.week2.product.Product;
import io.whatap.week2.product.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
public class JPATest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void givenDatasourceAvailableWhenAccessDetailsThenExpectDetails()
        throws SQLException {
        assertThat(dataSource.getClass().getName()).isEqualTo("com.zaxxer.hikari.HikariDataSource");
        assertThat(dataSource.getConnection().getMetaData().getDatabaseProductName()).isEqualTo("H2");
    }


}
