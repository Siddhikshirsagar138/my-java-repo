package com.myapp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class TestByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path paths=Paths.get("files/data1.txt");//paths is an interface
		//io based on streams nio based on channel
		//channel can encapsulate both input and output string to do concurrent read nd write
		//earlier we use file now we use paths will create channel for input nd output
		Path paths1=Paths.get("files/data3.txt");
		try {
			BufferedReader reader=Files.newBufferedReader(paths);  //bufferedreader read characters 
		//return the line by line
		/*	we need to flush
			try(BufferedWriter writer=Files.newBufferedWriter(paths1,			
			StandardOpenOption.CREATE,StandardOpenOption.WRITE))
			{
			//Stream<String> lines=reader.lines();
			PrintWriter pw=new PrintWriter(writer);
			
			Stream<String> lines=reader.lines();
			//lines.forEach(line->pw.write(line));//To print in one line
			lines.forEach(line->{pw.print(line);pw.append("\n");});//to print line by line
			pw.flush();
		*/
			
			try(BufferedWriter writer=Files.newBufferedWriter(paths1,//try with resource :automatically close the resources which are auto closable
					StandardOpenOption.CREATE,StandardOpenOption.WRITE))
					{
					//Stream<String> lines=reader.lines();
					PrintWriter pw=new PrintWriter(writer);
					Stream<String> lines=reader.lines();
					//lines.forEach(line->pw.write(line));//To print in one line
					lines.forEach(line->{pw.print(line);pw.append("\n");});
					}catch(IOException e) {
						e.printStackTrace();
					}
					//to print line by line
					//pw.flush();
				
			//	lines.forEach(System.out::println);
			//paths :for reading one file
			//paths:reading many files
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
