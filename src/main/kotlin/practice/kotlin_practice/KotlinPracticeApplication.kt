package practice.kotlin_practice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
@PropertySource("classpath:secure.properties")
class KotlinPracticeApplication

fun main(args: Array<String>) {
	runApplication<KotlinPracticeApplication>(*args)
}
