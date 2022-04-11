package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
//@Primary //if more than one bean is found by Spring, pleases use this one as primary
public class SuperContraGame implements GamingConsole {
	
	public void up() {
		System.out.println("SuperContraGame up");
	}
	
	public void down() {
		System.out.println("down");
	}	
	
	public void right() {
		System.out.println("right");
	}	
	
	public void left() {
		System.out.println("left");
	}
}
