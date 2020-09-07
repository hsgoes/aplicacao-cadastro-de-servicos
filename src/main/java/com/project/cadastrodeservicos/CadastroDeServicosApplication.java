package com.project.cadastrodeservicos;

import com.project.cadastrodeservicos.domain.entity.Cliente;
import com.project.cadastrodeservicos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class CadastroDeServicosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroDeServicosApplication.class, args);
	}
}
