package com.myapp.core;

public class MarkerImpl implements Marker 
{
		public void checkInterface() throws InterfaceNotFoundException {
			
			if(this instanceof Marker)
				System.out.println("Marker is implemented");
			else
				//System.out.println("Marker is not implemented");
				throw new InterfaceNotFoundException
				("Interface not implemented");
				
			}
		
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MarkerImpl marker = new MarkerImpl();
		//marker.checkInterface();
		try {//eg of try catch block
			marker.checkInterface();
		} catch (InterfaceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside Finally");
		}
	}

}
