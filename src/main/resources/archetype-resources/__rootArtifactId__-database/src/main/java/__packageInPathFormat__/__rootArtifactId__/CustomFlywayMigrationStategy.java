package com.clickbus.cbo.database;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;

public class CustomFlywayMigrationStategy implements FlywayMigrationStrategy {

	@Override
	public void migrate(Flyway flyway) {
		System.out.println(flyway.isOutOfOrder());
		flyway.repair();
		flyway.migrate();
	}

}
