package com.golden.dao;

public class DuplicatedUserException extends RuntimeException {
	public DuplicatedUserException(Exception e) {
		super(e);
	}
}
