package hello.hello3

import org.springframework.web.bind.annotation.{PostMapping, RequestBody, RestController}

/**
  * A POST request with simple response.
  */
@RestController
class Hello3Controller {
  @PostMapping(Array("/hello3"))
  def myHandler(@RequestBody person: Person): Greeting = {
    Greeting(s"Hello ${person.name}")
  }
}

case class Person(name: String)
case class Greeting(greet: String)
