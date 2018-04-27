package com.thejoyrun.webtest.controller

import com.thejoyrun.webtest.dao.UserRepository
import com.thejoyrun.webtest.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestApiController {
    @Autowired
    internal var userRepository: UserRepository? = null

    @GetMapping("/hello")
    fun hello(): Any {
        val user1 = User()
        user1.id = 2
        user1.name = "Wiki"
//        userRepository!!.insert(user1)
        val user2 = userRepository!!.findById(1)
        println(user2.name)
        return user2
    }
}