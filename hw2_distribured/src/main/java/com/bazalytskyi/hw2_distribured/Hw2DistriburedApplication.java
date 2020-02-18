package com.bazalytskyi.hw2_distribured;

import com.bazalytskyi.hw2_distribured.entity.nosql.CurriculumVitaeNoSql;
import com.bazalytskyi.hw2_distribured.entity.nosql.UserNoSql;
import com.bazalytskyi.hw2_distribured.entity.sql.CurriculumVitae;
import com.bazalytskyi.hw2_distribured.entity.sql.User;
import com.bazalytskyi.hw2_distribured.repository.NoSqlUserRepository;
import com.bazalytskyi.hw2_distribured.repository.sql.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw2DistriburedApplication implements CommandLineRunner {

	@Autowired
	private NoSqlUserRepository noSqlUserRepository;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Hw2DistriburedApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		CurriculumVitae curriculumVitae = new CurriculumVitae();
		curriculumVitae.setData("Data");

		User userSaveToSql = new User();
		userSaveToSql.setLogin("Login");
		userSaveToSql.setPassword("Password");
		userSaveToSql.setCv(curriculumVitae);

		userRepository.save(userSaveToSql);

		CurriculumVitaeNoSql curriculumVitaeNoSql = new CurriculumVitaeNoSql();
		curriculumVitaeNoSql.setData("NoSqlData");

		UserNoSql userSaveToNosql = new UserNoSql();
		userSaveToNosql.setCv(curriculumVitaeNoSql);
		userSaveToNosql.setLogin("Login");
		userSaveToNosql.setPassword("Password");
		noSqlUserRepository.save(userSaveToNosql);

		System.out.println(noSqlUserRepository.findAll());
		System.out.println(userRepository.findAll());
	}
}
