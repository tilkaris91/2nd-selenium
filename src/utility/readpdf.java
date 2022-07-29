package utility;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.bouncycastle.util.io.BufferingOutputStream;

public class readpdf {
public static void main(String[] args) throws IOException {
	URL url=new URL("file:///C:/Users/hp/Desktop/sofwares/CALLING%20PITCH.pdf");
	InputStream is=url.openStream();
	BufferedInputStream bis=new BufferedInputStream(is);
	PDDocument doc=null;
	doc=PDDocument.load(bis);
	String pdfcontent=new PDFTextStripper().getText(doc);
	System.out.println(pdfcontent);
		
	
}
}
