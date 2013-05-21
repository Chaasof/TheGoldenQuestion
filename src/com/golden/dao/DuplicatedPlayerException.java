package com.golden.dao;

public class DuplicatedPlayerException extends RuntimeException {
	public DuplicatedPlayerException(Exception e) {
		super(e);
	}
}
