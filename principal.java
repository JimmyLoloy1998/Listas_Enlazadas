package Listas;

public class principal {
    public static void main(String[] args) {
        metodo mt1 = new metodo();
        mt1.agregar(new alumno("A",19));
        mt1.agregar(new alumno("B",61));
        mt1.agregar(new alumno("C",4));
        mt1.agregar(new alumno("D",20));
        mt1.agregar(new alumno("E",14));
        
        mt1.mostrar(); 
        //agregar un nodo al inicio de la fila
        System.out.println("");
        mt1.agregarInicio(new alumno("X",30));
        mt1.mostrar();
        //agregar un nodo entre dos posiciones
        System.out.println("");
        mt1.insertarNodo(4,61,new alumno("P",40));
        mt1.mostrar();
        System.out.println("");
        mt1.insertarNodo(61,19,new alumno("Q",50));
        mt1.mostrar();
    }
}
