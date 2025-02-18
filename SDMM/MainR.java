class MainR{//Clase MainR
    public static void main (String []args){//Metodo main
        Resta rest=new Resta();//Creamos una nueva instancia de la clase Resta
        Resta rest2=new Resta();//Creamos una nueva instancia de la clase Resta
        rest.setNum(8);//   Asignamos el valor 8 a la variable num de la clase Resta
        rest2.setNum(5);//Asignamos el valor 5 a la variable num2 de la clase Resta
        System.out.println(rest.getNum()-rest2.getNum());//Imprimimos el resultado de la resta
        rest2.setNum(10);//Asignamos el valor 10 a la variable num2 de la clase Resta
        rest2.setNum(15);//Asignamos el valor 15 a la variable num2 de la clase Resta
        int r=rest.getNum()-rest2.getNum();//Asignamos el resultado de la resta a la variable r
        System.out.println(r);//Imprimimos el resultado de la resta
    }       //cierra llave del metodo main
    }   //cierra clase MainR