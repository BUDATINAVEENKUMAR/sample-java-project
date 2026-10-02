package naveen.deploy.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		for(int i=0;i< 10; i++){
			System.out.println("Naveen is hero " + i);
		}

		
	}

}
