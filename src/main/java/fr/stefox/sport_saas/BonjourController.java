   package fr.stefox.sport_saas;

   import org.springframework.web.bind.annotation.GetMapping;
   import org.springframework.web.bind.annotation.RestController;

   @RestController
   public class BonjourController {

       @GetMapping("/bonjour")
       public String bonjour() {
           return "Bonjour le monde !";
       }
   }