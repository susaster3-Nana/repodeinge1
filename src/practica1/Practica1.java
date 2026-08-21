package practica1;

import dispositivo.Dispositivo;
import empleado.Empleado;
import empresa.Empresa;
import persona.Persona;
import tren.Tren;

import java.util.*;

public class Practica1 {

    public static void casoA(Scanner entrada, Dispositivo dispositivo1){
        int x,j;
        String nombre1;
        double precio1;
        int id1;
        System.out.println("*****************");
        System.out.println("CASO A");
        System.out.println("*****************");

        do {
            System.out.println("Seleccione una opcion ");
            System.out.println("--------------------------------------------------------");
            System.out.println("1.Ingresar datos\n 2.Editar datos\n 3.Mostrar datos \n 4. Salir");
            System.out.println("--------------------------------------------------------\n\n");

            x = entrada.nextInt();

            switch(x){
                case 1:
                    System.out.println("Ingresa el Id del dispositivo: ");
                    id1 = entrada.nextInt();

                    System.out.println("Ingresa el nombre del dispositivo: ");
                    nombre1 = entrada.next();

                    System.out.println("Ingresa el precio del dispositivo: ");
                    precio1 = entrada.nextDouble();


                    dispositivo1.Registrar(id1, nombre1, precio1);
                    break;

                case 2:
                    do{
                        System.out.println("Seleccione el campo que quiere editar:\n -------------------- \n 1. Id \n 2. Nombre \n 3. Precio \n 4. Dejar de editar \n -------------------- \n\n");
                        j = entrada.nextInt();

                        switch(j){
                            case 1:
                                System.out.println("Campo de id actual: "+ dispositivo1.getId());
                                System.out.println("Nuevo campo: ");
                                id1 = entrada.nextInt();
                                dispositivo1.Editar(id1);
                                System.out.println("Dato guardado correcatemente\n\n");
                                break;

                            case 2:
                                System.out.println("Campo de nombre actual: "+ dispositivo1.getNombre());
                                System.out.println("Nuevo campo: ");
                                nombre1 = entrada.next();
                                dispositivo1.Editar(nombre1);
                                System.out.println("Dato guardado correcatemente\n\n");
                                break;

                            case 3:
                                System.out.println("Campo de precio actual: "+ dispositivo1.getPrecio());
                                System.out.println("Nuevo campo: ");
                                precio1 = entrada.nextDouble();
                                dispositivo1.Editar(precio1);
                                System.out.println("Dato guardado correcatemente\n\n");
                                break;

                            case 4:
                                System.out.println("GRACIAS POR USAR ESTA OPCION");
                                break;

                            default:
                                System.out.println("ESA OPCION NO ESTA DISPONIBLE\n\n");
                                break;
                        }
                    } while(j!=0 && j != 4);
                    break;

                case 3:
                    dispositivo1.Mostrar();
                    break;

                case 4:
                    System.out.println("Gracias por haber usado esto\n\n");
                    break;


                default:
                    System.out.println("ESA OPCION NO ESTA DISPONIBLE \n\n");
                    break;
            }

        } while(x!=0 && x != 4);
    }

    public static void casoB(Scanner entrada, Tren tren1){
        int x, j, num_ruedas1, num_vagones1;
        double peso1, precio1;
        String color1, modelo1;

        System.out.println("*****************");
        System.out.println("CASO B");
        System.out.println("*****************");

        do {
            System.out.println("Seleccione una opcion ");
            System.out.println("--------------------------------------------------------");
            System.out.println("1.Ingresar datos\n 2.Editar datos\n 3.Mostrar datos \n 4. Salir");
            System.out.println("--------------------------------------------------------\n\n");

            x = entrada.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Ingresa el numero de ruedas del tren: ");
                    num_ruedas1 = entrada.nextInt();

                    System.out.println("Ingresa el peso del tren: ");
                    peso1 = entrada.nextDouble();

                    System.out.println("Ingresa el color del tren: ");
                    color1 = entrada.next();

                    System.out.println("Ingresa el numero de vagones  del tren: ");
                    num_vagones1 = entrada.nextInt();

                    System.out.println("Ingresa el modelo del tren: ");
                    modelo1 = entrada.next();

                    System.out.println("Ingresa el precio del tren: ");
                    precio1 = entrada.nextDouble();

                    tren1.Registrar(num_ruedas1,peso1,color1,num_vagones1,modelo1,precio1);
                    System.out.println("Tus resultados han sido guardados");
                    break;

                case 2:
                    do{
                        System.out.println("Seleccione el campo que quiere editar:\n -------------------- \n 1. Numero de ruedas \n 2. Peso \n 3. Color \n 4. Numero de vagones \n 5. Modelo  \n 6. Precio \n 7. Dejar de editar \n -------------------- \n\n");
                        j = entrada.nextInt();

                        switch(j){
                            case 1:
                                System.out.println("Campo de numero de ruedas actual: "+ tren1.getNum_ruedas());
                                System.out.println("Nuevo campo: ");
                                num_ruedas1 = entrada.nextInt();
                                tren1.setNum_ruedas(num_ruedas1);
                                System.out.println("Dato guardado correcatemente\n\n");
                                break;

                            case 2:
                                System.out.println("Campo de peso actual: "+ tren1.getPeso());
                                System.out.println("Nuevo campo: ");
                                peso1 = entrada.nextDouble();
                                tren1.setPeso(peso1);
                                System.out.println("Dato guardado correcatemente\n\n");
                                break;

                            case 3:
                                System.out.println("Campo de color actual: "+ tren1.getColor());
                                System.out.println("Nuevo campo: ");
                                color1 = entrada.next();
                                tren1.setColor(color1);
                                System.out.println("Dato guardado correcatemente\n\n");
                                break;

                            case 4:
                                System.out.println("Campo de numero de vagones actual: "+ tren1.getVagones());
                                System.out.println("Nuevo campo: ");
                                num_vagones1 = entrada.nextInt();
                                tren1.setVagones(num_vagones1);
                                System.out.println("Dato guardado correcatemente\n\n");
                                break;

                            case 5:
                                System.out.println("Campo de modelo actual: "+ tren1.getModelo());
                                System.out.println("Nuevo campo: ");
                                modelo1 = entrada.next();
                                tren1.setModelo(modelo1);
                                System.out.println("Dato guardado correcatemente\n\n");
                                break;

                            case 6:
                                System.out.println("Campo de precio actual: "+ tren1.getPrecio());
                                System.out.println("Nuevo campo: ");
                                precio1 = entrada.nextDouble();
                                tren1.setPrecio(precio1);
                                System.out.println("Dato guardado correcatemente\n\n");
                                break;

                            case 7:
                                System.out.println("GRACIAS POR USAR ESTA OPCION");
                                break;

                            default:
                                System.out.println("ESA OPCION NO ESTA DISPONIBLE\n\n");
                                break;
                        }
                    } while(j!=0 && j != 7);
                    break;

                case 3:
                    tren1.Mostrar();
                    break;

                case 4:
                    System.out.println("Gracias por haber usado esto\n\n");
                    break;

                default:
                    System.out.println("ESA OPCION NO ESTA DISPONIBLE \n\n");
                    break;

            }
        }while (x!=0 && x!=4);
    }

    public static void casoC(Scanner entrada, Empleado empleado1, Empresa empresa1){
        int x,j;
        String nombre1, puesto1, nombreEmpresa1, direccion1;
        int edad1, idEmpleado1, antiguedad1, empleados1;
        double altura1, sueldo1, ingresos1;
        boolean activo1;

        System.out.println("*****************");
        System.out.println("CASO C");
        System.out.println("*****************");

        do{
            System.out.println("Seleccione una opcion ");
            System.out.println("--------------------------------------------------------");
            System.out.println("1. Registrar empleado\n 2. Editar empleado\n 3. Registrar empresa\n 4. Editar empresa\n 5. Asociar empresa\n 6. Mostrar empleado\n 7. Mostrar empresa\n 8. Ver asociacion\n 9. Salir");
            System.out.println("--------------------------------------------------------\n\n");

            x = entrada.nextInt();

            switch(x){

                case 1:
                    System.out.println("Ingresa el nombre del empleado: ");
                    nombre1 = entrada.next();

                    System.out.println("Ingresa la edad del empleado: ");
                    edad1 = entrada.nextInt();

                    System.out.println("Ingresa la altura del empleado: ");
                    altura1 = entrada.nextDouble();

                    System.out.println("El empleado esta activo? true/false: ");
                    activo1 = entrada.nextBoolean();

                    System.out.println("Ingresa el id del empleado: ");
                    idEmpleado1 = entrada.nextInt();

                    System.out.println("Ingresa el puesto del empleado: ");
                    puesto1 = entrada.next();

                    System.out.println("Ingresa el sueldo del empleado: ");
                    sueldo1 = entrada.nextDouble();

                    System.out.println("Ingresa la antiguedad del empleado: ");
                    antiguedad1 = entrada.nextInt();

                    empleado1.Registrar(nombre1,edad1,altura1,activo1,idEmpleado1,puesto1,sueldo1,antiguedad1);

                    System.out.println("Tus resultados han sido guardados\n\n");
                    break;

                case 2:
                    do{
                        System.out.println("Seleccione el campo que quiere editar:\n -------------------- \n 1. Nombre \n 2. Edad \n 3. Altura \n 4. Activo \n 5. Id empleado \n 6. Puesto \n 7. Sueldo \n 8. Antiguedad \n 9. Dejar de editar \n -------------------- \n\n");

                        j = entrada.nextInt();

                        switch(j){

                            case 1:
                                System.out.println("Campo de nombre actual: " + empleado1.getNombre());
                                System.out.println("Nuevo campo: ");
                                nombre1 = entrada.next();
                                empleado1.setNombre(nombre1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 2:
                                System.out.println("Campo de edad actual: " + empleado1.getEdad());
                                System.out.println("Nuevo campo: ");
                                edad1 = entrada.nextInt();
                                empleado1.setEdad(edad1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 3:
                                System.out.println("Campo de altura actual: " + empleado1.getAltura());
                                System.out.println("Nuevo campo: ");
                                altura1 = entrada.nextDouble();
                                empleado1.setAltura(altura1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 4:
                                System.out.println("Campo activo actual: " + empleado1.isActivo());
                                System.out.println("Nuevo campo true/false: ");
                                activo1 = entrada.nextBoolean();
                                empleado1.setActivo(activo1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 5:
                                System.out.println("Campo de id actual: " + empleado1.getIdEmpleado());
                                System.out.println("Nuevo campo: ");
                                idEmpleado1 = entrada.nextInt();
                                empleado1.setIdEmpleado(idEmpleado1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 6:
                                System.out.println("Campo de puesto actual: " + empleado1.getPuesto());
                                System.out.println("Nuevo campo: ");
                                puesto1 = entrada.next();
                                empleado1.setPuesto(puesto1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 7:
                                System.out.println("Campo de sueldo actual: " + empleado1.getSueldo());
                                System.out.println("Nuevo campo: ");
                                sueldo1 = entrada.nextDouble();
                                empleado1.setSueldo(sueldo1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 8:
                                System.out.println("Campo de antiguedad actual: " + empleado1.getAntiguedad());
                                System.out.println("Nuevo campo: ");
                                antiguedad1 = entrada.nextInt();
                                empleado1.setAntiguedad(antiguedad1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 9:
                                System.out.println("GRACIAS POR USAR ESTA OPCION");
                                break;

                            default:
                                System.out.println("ESA OPCION NO ESTA DISPONIBLE\n\n");
                                break;
                        }

                    }while(j!=0 && j!=9);

                    break;

                case 3:
                    System.out.println("Ingresa el nombre de la empresa: ");
                    nombreEmpresa1 = entrada.next();

                    System.out.println("Ingresa la direccion de la empresa: ");
                    direccion1 = entrada.next();

                    System.out.println("Ingresa el numero de empleados de la empresa: ");
                    empleados1 = entrada.nextInt();

                    System.out.println("Ingresa los ingresos de la empresa: ");
                    ingresos1 = entrada.nextDouble();

                    empresa1.Registrar(nombreEmpresa1,direccion1,empleados1,ingresos1);

                    System.out.println("Tus resultados han sido guardados\n\n");
                    break;

                case 4:
                    do{
                        System.out.println("Seleccione el campo que quiere editar:\n -------------------- \n 1. Nombre \n 2. Direccion \n 3. Numero de empleados \n 4. Ingresos \n 5. Dejar de editar \n -------------------- \n\n");

                        j = entrada.nextInt();

                        switch(j){

                            case 1:
                                System.out.println("Campo de nombre actual: " + empresa1.getNombre());
                                System.out.println("Nuevo campo: ");
                                nombreEmpresa1 = entrada.next();
                                empresa1.setNombre(nombreEmpresa1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 2:
                                System.out.println("Campo de direccion actual: " + empresa1.getDireccion());
                                System.out.println("Nuevo campo: ");
                                direccion1 = entrada.next();
                                empresa1.setDireccion(direccion1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 3:
                                System.out.println("Campo de empleados actual: " + empresa1.getEmpleados());
                                System.out.println("Nuevo campo: ");
                                empleados1 = entrada.nextInt();
                                empresa1.setEmpleados(empleados1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 4:
                                System.out.println("Campo de ingresos actual: " + empresa1.getIngresos());
                                System.out.println("Nuevo campo: ");
                                ingresos1 = entrada.nextDouble();
                                empresa1.setIngresos(ingresos1);
                                System.out.println("Dato guardado correctamente\n\n");
                                break;

                            case 5:
                                System.out.println("GRACIAS POR USAR ESTA OPCION");
                                break;

                            default:
                                System.out.println("ESA OPCION NO ESTA DISPONIBLE\n\n");
                                break;
                        }

                    }while(j!=0 && j!=5);

                    break;

                case 5:
                    empleado1.setEmpresa(empresa1);
                    System.out.println("Empleado asociado correctamente con la empresa\n\n");
                    break;

                case 6:
                    empleado1.Mostrar();
                    break;

                case 7:
                    empresa1.Mostrar();
                    break;

                case 8:
                    if(empleado1.getEmpresa() != null){
                        System.out.println("El empleado " + empleado1.getNombre() + " esta asociado con la empresa " + empleado1.getEmpresa().getNombre());
                    }
                    else{
                        System.out.println("El empleado no esta asociado con ninguna empresa");
                    }
                    break;

                case 9:
                    System.out.println("Gracias por haber usado esto\n\n");
                    break;

                default:
                    System.out.println("ESA OPCION NO ESTA DISPONIBLE \n\n");
                    break;
            }

        }while(x!=0 && x!=9);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Dispositivo dispositivo1 = new Dispositivo();
        Tren tren1 = new Tren();
        Empleado empleado1 = new Empleado();
        Empresa empresa1 = new Empresa();
        int w;

        do{
            System.out.println("========================================================================================================");
            System.out.println("Bienvenido a la practica1 seleccione el inicio a realizar \n 1. A --- \n 2. B ---- \n 3. C --- \n 4. SALIR");
            System.out.println("========================================================================================================");
            w = entrada.nextInt();
            switch(w){
                case 1:
                    casoA(entrada, dispositivo1);
                    break;

                case 2:
                    casoB(entrada,tren1);
                    break;

                case 3:
                    casoC(entrada,empleado1, empresa1);
                    break;

                case 4:
                    System.out.println("GRACIAS POR USAR EL PROGRAMA");
                    break;

                default:

                    break;
            }

        } while(w!=0 && w!=4);

        System.out.println("FIN DEL PROGRAMA");

    }

}