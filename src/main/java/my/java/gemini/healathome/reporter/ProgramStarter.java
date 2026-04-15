package my.java.gemini.healathome.reporter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
/**
 * 
 */
public class ProgramStarter {
	/**
	 * @param args - Command Line Arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bayers App");
		
		//Reporter Window
		//ReporterWindow sw = new ReporterWindow();
        //sw.setVisible(true);

		ReporterWindow myReportApp = new ReporterWindow();
		
		myReportApp.invokeMyWindow();
		
		SpringApplication.run(ProgramStarter.class, args);
	}

}
