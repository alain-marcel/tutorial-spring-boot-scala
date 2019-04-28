package hello.hello2

import org.springframework.web.bind.annotation.{PostMapping, RequestBody, RestController}

/**
  * A POST request with simple response.
  * 
  * POST http://localhost:8080/hello2       { "name: "bob" }
  */
@RestController class Hello2Controller {
  @PostMapping(Array("/hello2"))
  def myHandler(@RequestBody person: Person): String = {
    s"You have send person=$person"
  } 
}

case class Person(name: String)
