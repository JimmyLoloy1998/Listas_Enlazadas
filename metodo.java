package Listas;

public class metodo {
    nodo primero, fin;
    
    public metodo(){
        primero = fin = null;
    }
    void agregar(alumno alu1){
        nodo newNodo = new nodo (alu1);
        if(primero == null){
            primero = newNodo;
        }else{
            newNodo.sgte = primero;
            primero = newNodo;
        }
    }
    void mostrar(){
        nodo temp = primero;
        while(true){
            if(temp == null) break;
            System.out.println(temp.dato.toString());
            temp = temp.sgte;
        }
    }
    void agregarInicio(alumno alu1){
        nodo temp = primero;
        nodo newNodo = new nodo(alu1);
        while(true){
            if(temp.sgte == null){
                temp.sgte = newNodo;
                break;   
            }
            temp = temp.sgte;
        }
    }
    void insertarNodo(int posA, int posB, alumno alu1){
        nodo temp1, temp2;
        temp1 = temp2 = primero;
        nodo newNodo = new nodo(alu1);
        while(true){
            if(temp1.dato.edad == posA)break;
            temp1 = temp1.sgte;
        }
        while(true){
            if(temp2.dato.edad == posB)break;
            temp2 = temp2.sgte;
        }
        temp1.sgte = newNodo;
        newNodo.sgte = temp2;
    }
}
