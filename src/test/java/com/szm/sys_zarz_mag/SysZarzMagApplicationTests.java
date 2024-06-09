package com.szm.sys_zarz_mag;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;

@SpringBootTest
class SysZarzMagApplicationTests {

	@Test
	void contextLoad(){}

	@Component
	public class DatabaseConnectionTest implements CommandLineRunner {

		@Autowired
		private DataSource dataSource;

		@Override
		public void run(String... args) throws Exception {
			try (var connection = dataSource.getConnection()) {
				System.out.println("Połączenie z bazą danych udane!");
			} catch (Exception e) {
				System.err.println("Błąd podczas próby nawiązania połączenia z bazą danych:");
				e.printStackTrace();
			}
		}
	}

}
