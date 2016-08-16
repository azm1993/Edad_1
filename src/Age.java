/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pherdinandrew
 */
import java.util.Scanner;
public class age {

	public age() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int edad;
		Scanner can = new Scanner(System.in);
		System.out.println("Contax9000");
		System.out.println("Sea tan Amable de Introducir su edada");
		edad = can.nextInt();
		if (edad >= 18 )
		{
			System.out.println("Ud es Mayor de edad");
		}	
                else 
                {
                    System.out.println("Ud es menor de edad");
		
                }

}
}