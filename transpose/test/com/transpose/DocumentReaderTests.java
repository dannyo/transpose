package com.transpose;

import static org.junit.Assert.assertEquals;
import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DocumentReaderTests {

	private DocumentReader documentReader;

	@Before
	public void setUp(){
		this.documentReader = new DocumentReader();
	}
	
	@After
	public void tearDown(){
		documentReader = null;
	}
	
	@Test
	public void shouldReadWordDocument(){
		File file = new File("resources/GDEmC.docx");
		//assertEquals("G	D	Em	C", documentReader.readDocument(file));
//		System.out.println(file.getAbsolutePath());þÿ
		documentReader.readDocument(file);
	}
	
	
	
}
