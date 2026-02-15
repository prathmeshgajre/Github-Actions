package org.githubactions.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome..Here !";
    }
   /* echo "# Github-Actions" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/prathmeshgajre/Github-Actions.git
    git push -u origin main*/

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsApplication.class, args);
        System.out.println("hi);
    }

}
