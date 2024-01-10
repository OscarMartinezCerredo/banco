package banco;

import java.util.Scanner;

public class bancoejercicio {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	  Scanner scanner=new Scanner(System.in);
	  boolean inicio1;
	  boolean entrada;
	  String opccion;
	  double saldo=0;
	  boolean control =true;
	  
	do {
		  String comenzar = null;
		  System.out.println("para comenzar pon comenzar");
		  comenzar = scanner.next();
	
		 if (comenzar.equalsIgnoreCase("Comenzar")) {
			 inicio1=true;
		 }else {
			 inicio1=false;
		 }
		 if(inicio1) {
			 
		 System.out.println("Dime tu usuario");
		 String Unombre =scanner.next();
		 
		 System.out.println("Dime tu id de tu usuario");
	     int UID= scanner.nextInt();
	     
	     System.out.println("Dime tu contraseña de tu usuario");
	     int Ucontra=scanner.nextInt();
	   
	    
	    
		if(Cuenta(UID,Ucontra,Unombre)) {
			System.out.println("Bienvenido");
			entrada=true;
		}else {
			System.out.println("error intentalo otra vez");
			entrada=false;//
		}
		if(entrada) {
			do {
			System.out.println("Que operacion quieres hacer :Retirar,Depositar,Consultar o terminar escribe 1 de las opcionesL");
			System.out.println("retirar");
			System.out.println("depositar");
			System.out.println("consultar");
			System.out.println("terminar");
			
			opccion=scanner.next();
			switch (opccion.toLowerCase()) {
			case "retirar": {
				System.out.println("retirando");
				saldo=(Retirar(saldo));
				System.out.println("tienes actualmente "+saldo);
				break;
			}case "depositar":{
				System.out.println("depositando");
				saldo = (Depositar(saldo));
				System.out.println("tienes en la cuenta "+saldo);
				break;
			}case "consultar":{
				System.out.println("consultando");
				System.out.println(saldo);
				break;
			}case "terminado":{
				System.out.println("tu cuenta "+saldo);
				control=false;
				break;
			}
		
			default:{
				System.out.println("Estas seguro que quieres terminar");
				System.out.println("1 para continuar 2 para terminar");
				int decide=scanner.nextInt();
				
				switch(decide) {
				case 1:{
					control=true;
					break;
				}
				case 2:{
					control=false;
					break;
				}
				
				}
			}
			}
			}while(control);
			
		}else {
			System.out.println("Error de cuenta");
		}
		}else {
			System.out.println("Gracias por pasarte");
			inicio1=false;
			
		}
	  }while(inicio1);
		 
	}
	
	
	
	
	
	private static boolean Cuenta(int a,int b, String c) {
		 int contra [] ={8679,4950,2404,4758,3845,5965,3953};
		 int ID [] = {1,2,3,4,5,6,7};
		 String nombre []= {"Lucas","Paco","Ana","Lucia","Laura","Marcos","Pedro"};
	
		for (int i =0; i<ID.length; i++) {
			if (ID[i]==a && contra[i]==b && nombre[i].equals(c)) {
				return true;
			}
		}
			return false;
	}
	private static double Depositar(double saldo) {
		Scanner scanner=new Scanner(System.in);
		double depot = scanner.nextDouble();
		System.out.println("has ingresado "+depot);
		saldo += depot;
		return saldo;
	}
	private static double Retirar(double saldo) {
		Scanner scanner=new Scanner(System.in);
		double rer = scanner.nextDouble();
		if (saldo>=0&&saldo>=rer){
		System.out.println("has sacado "+rer);
		saldo -= rer;
		}else {
			System.out.println("tu cuenta no ha podido hacer la operacion");
	}
		return saldo;
}
}

