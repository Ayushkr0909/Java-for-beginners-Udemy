package com.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.learnspringframework.game.GameRunner;

@SpringBootApplication

/*@ComponentScan({"com.spring.springframework"})  ---> @ComponentScan is added by default for default package,
            i.e. com.spring.springframework , if need to add additional package then have to explicitly mention
            It scans through the mentioned package and finds if any class consists of @Component,if yes, it
            creates instances of those classes*/

public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		
//		MarioGame game = new MarioGame();
		
		//SupercontraGame game = new SupercontraGame();
		
//		GameRunner runner = new GameRunner(game);
		
		runner.runGame();	
		
	}

}
/*At once spring framework can only manage one class,
 we can have @Primary after @component for MarioGame or SupercontraGame which we want to manage*/