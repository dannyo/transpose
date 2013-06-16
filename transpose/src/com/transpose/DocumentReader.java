package com.transpose;
import java.util.zip.ZipFile; 
import java.util.zip.ZipException; 
import java.util.zip.ZipEntry; 
import java.io.InputStream; 
import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory; 
import javax.xml.parsers.FactoryConfigurationError; 
import javax.xml.parsers.ParserConfigurationException; 
import org.xml.sax.SAXException; 
import org.xml.sax.SAXParseException; 
import java.io.File; 
import java.io.IOException; 
import org.w3c.dom.Document; 
import org.w3c.dom.DOMException; 
import org.w3c.dom.NodeList; 
import org.w3c.dom.Node; 
import java.util.List; 
import java.util.ArrayList;

public class DocumentReader {
	
	public void readDocument(File file) {
		   ZipFile docxfile = null; 
		    try{ 
		      docxfile = new ZipFile(file.getAbsolutePath()); 
		    }catch(Exception e){ 
		      // file corrupt or otherwise could not be found 
		      e.printStackTrace(); 
		      return; 
		    } 
		    InputStream in = null; 
		    try{ 
		      ZipEntry ze = 
		       docxfile.getEntry("word/document.xml"); 
		      in = 
		       docxfile.getInputStream(ze); 
		    }catch(NullPointerException nulle){ 
		      System.err.println("Expected entry word/document.xml does not exist"); 
		      nulle.printStackTrace(); 
		      return; 
		    }catch(IOException ioe){ 
		      ioe.printStackTrace(); 
		      return; 
		    } 
		    Document document = null; 
		    try{ 
		      DocumentBuilderFactory factory = 
		      DocumentBuilderFactory.newInstance(); 
		      DocumentBuilder builder = 
		      factory.newDocumentBuilder(); 
		      document = builder.parse(in); 
		    }catch(ParserConfigurationException pce){ 
		      pce.printStackTrace(); 
		      return; 
		    }catch(SAXException sex){ 
		      sex.printStackTrace(); 
		      return; 
		    }catch(IOException ioe){ 
		      ioe.printStackTrace(); 
		      return; 
		    }finally{ 
		      try{ 
		        docxfile.close(); 
		      }catch(IOException ioe){ 
		        System.err.println("Exception closing file."); 
		        ioe.printStackTrace(); 
		      } 
		    } 
		    NodeList list = document.getElementsByTagName("w:t"); 
		    List<String> content = new ArrayList<String>();
		    ChordTransposer cT = new ChordTransposer();
		    for(int i=0;i< list.getLength(); i++){    
		    	Node aNode = list.item(i); 
		    	content.add(cT.transposeChord(aNode.getFirstChild().getNodeValue(),2));
		    } 
		    for(String s : content){ 
		      System.out.println(s); 
		    } 
	}
}