package com.upwork.reddit;

import java.io.IOException;
import java.io.Writer;

import com.upwork.StreamWriter;

public class RedditStreamWriter implements StreamWriter {

	private boolean firstLine = true;

	private final Writer writer;

	private final String LINE_SEP = System.lineSeparator();

	public RedditStreamWriter(Writer writer) {
		this.writer = writer;
	}

	@Override
	public void append(String line) {
		System.out.println("Append line " + line);
		try {
			if (!firstLine) {
				writer.append(LINE_SEP);
			} else {
				firstLine = false;
			}
			writer.append(line);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void close(boolean appendFinalLineBreak) {
		try {
			if (writer != null) {
				if(appendFinalLineBreak){
					writer.append(LINE_SEP);
				}
				System.out.println("Close");
				writer.flush();
				writer.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
