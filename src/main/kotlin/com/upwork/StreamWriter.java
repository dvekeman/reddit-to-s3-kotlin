package com.upwork;

public interface StreamWriter {
	
	void append(String line);
	void close(boolean appendFinalLinebreak);
}
