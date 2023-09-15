package com.design.pattern.creational.builder;

public class UserTest {
	public static void main(String[] args) {
		//User build1 = new User.UserBuilder("naresh", "123").build();
		//System.out.println(build);
		
		//User build2 = new User.UserBuilder("suresh","78").setRole("Developer").build();
		//System.out.println(build2);
		
		User build = new User.UserBuilder().setName("Naresh").setRole("dev").build();
		System.out.println(build);
		User build2 = new User.UserBuilder().build();
		System.out.println(build2);

	}
}
