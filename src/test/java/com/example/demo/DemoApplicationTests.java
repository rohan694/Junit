package com.example.demo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	@Tag("IntegrationTest")
	public void testAddEmployeeUsingSimpelJdbcInsert() {
		System.out.println("integration test ran ");
	}

	@Test
	@Tag("UnitTest")
	public void givenNumberOfEmployeeWhenCountEmployeeThenCountMatch() {
		System.out.println("unit test ran ");

	}

}
