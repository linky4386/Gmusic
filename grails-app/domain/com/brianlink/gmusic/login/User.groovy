package com.brianlink.gmusic.login

class User {
	String email
	String password

    static constraints = {
		email(nullable: false, blank: false)
		password(nullable: false, blank: false)
    }
}
