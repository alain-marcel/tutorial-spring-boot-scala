package hello.config

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import org.springframework.stereotype.Component

import com.fasterxml.jackson.module.scala.DefaultScalaModule

@Component
class JacksonConfiguration extends Jackson2ObjectMapperBuilderCustomizer {
  override def customize(objectMapperBuilder: Jackson2ObjectMapperBuilder): Unit = {
    objectMapperBuilder
      .modulesToInstall(DefaultScalaModule)
  }
}
