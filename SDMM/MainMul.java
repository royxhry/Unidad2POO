class MainMul{//Clase MainMul
    public static void main (String []args){//Metodo main
        Multi multi=new Multi();//Creamos una nueva instancia de la clase Multi
        Multi multi2=new Multi();//Creamos una nueva instancia de la clase Multi
        multi.setNum(8);//Asignamos el valor 8 a la variable num de la clase Multi
        multi2.setNum(5);//Asignamos el valor 5 a la variable num2 de la clase Multi
        System.out.println(multi.getNum()*multi2.getNum());//Imprimimos el resultado de la multiplicación
        multi2.setNum(10);//Asignamos el valor 10 a la variable num2 de la clase Multi
        multi2.setNum(15);//Asignamos el valor 15 a la variable num2 de la clase Multi
        int r=multi.getNum()*multi2.getNum();//Asignamos el resultado de la multiplicación a la variable r
        System.out.println(r);//Imprimimos el resultado de la multiplicación
    }       //cierra llave del metodo main
    }//cierra clase MainMul