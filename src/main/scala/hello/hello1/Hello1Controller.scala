package hello.hello1

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
  * A GET request.
  * 
  * GET/POST http://localhost:8080/hello1
  */
@RestController
class Hello1Controller {

  @RequestMapping(Array("/hello1"))
  def myHandler(): String = {
    "Greetings from Spring Boot in scala!"
  }

}
