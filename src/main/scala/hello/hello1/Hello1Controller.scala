package hello.hello1

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
 * A GET request.
 */
@RestController
class Hello1Controller {

  @RequestMapping(Array("/hello1"))
  def myHandler(): String = {
    "Greetings from Spring Boot in scala!"
  }

}
