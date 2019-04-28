package hello.hello2

import org.springframework.web.bind.annotation.{PostMapping, RequestBody, RestController}

/**
  * DO NO WORK
  * A POST request with simple response.
  */
@RestController class Hello2Controller {
  @PostMapping(Array("/hello2"))
  def myHandler(@RequestBody person: Person): String = {
    s"You have send person=$person"
  } 
}

case class Person(name: String)
