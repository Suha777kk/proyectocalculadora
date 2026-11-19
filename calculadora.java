void main(){
System.out.println("1. Sumar dos numeros");
System.out.println("2. Salir");

System.out.println("introduzca una opcion:");

Scanner sc = new Scanner(System.in);
int opcion = sc.nextInt();
if (opcion == 1)
    { System.out.println("Introduce el primer numero");
       int num1 = sc.nextInt();
       System.out.println("Introduce el segundo numero numero");
       int num2 = sc.nextInt(); 
       System.out.println("La suma es: "+ (num1+num2));
       
    }
else { System.out.println("Hasta pronto!!!");
    } 

}