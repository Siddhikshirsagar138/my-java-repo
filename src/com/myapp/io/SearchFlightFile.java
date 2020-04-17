package com.myapp.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.myapp.core.Flight;

public class SearchFlightFile {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String sourceCity=scanner.nextLine();
		String destCity=scanner.nextLine();
		
		try {
	     
		// TODO Auto-generated method stub
		
			Stream<String> fileData=
					Stream.of(Files.lines(Paths.get("files/Airindia.csv")),
							Files.lines(Paths.get("files/Indigo.csv")),
							Files.lines(Paths.get("files/Spicejet.csv")))
					.flatMap(s->s);//flatten into one stream representing one stream
			
			
			
			
			fileData.map(s->{  
				String[] tokens=s.split(",");
				
				Flight flight=new Flight(Integer.parseInt(tokens[0]),
					tokens[1],tokens[2],
			        Double.parseDouble(tokens[3]),
				    (tokens[4])
				    );
								
			   		return flight;
								
			}).collect(Collectors.toList()).stream()
			 .filter(f->f.getSource_city().equalsIgnoreCase(sourceCity)&&f.getDest_city().equalsIgnoreCase(destCity)).
		     forEach(System.out::println);
			
		
		}catch(IOException e) {
			e.printStackTrace();
		}
							
	
	}

}
