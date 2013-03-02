package com.brianlink.gmusic.login



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    void testUser() {
       User user1 = new User()
	   user1.setEmail("test@example.org")
	   user1.setPassword("f4k3p4ssw0rd")
	   
	   assert user1 instanceof User
	   assert "test@example.org".equals(user1.getEmail())
	   assert "f4k3p4ssw0rd".equals(user1.getPassword())
	   
	   
	   User user2 = new User()
	   user2.setEmail("linky4386@gmail.com")
	   user2.setPassword("abc123")
	   
	   assert user2 instanceof User
	   assert "linky4386@gmail.com".equals(user2.getEmail())
	   assert "abc123".equals(user2.getPassword())
	   
	   assert !user1.equals(user2)
    }
}
