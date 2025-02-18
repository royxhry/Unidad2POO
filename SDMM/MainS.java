class MainS{//Clase MainS
    public static void main (String []args){//Metodo main
        Suma sum=new Suma();//Creamos una nueva instancia de la clase Suma
        Suma sum2=new Suma();//Creamos una nueva instancia de la clase Suma
        sum.setNum(8);//Asignamos el valor 8 a la variable num de la clase Suma
        sum2.setNum(5);//Asignamos el valor 5 a la variable num2 de la clase Suma
        System.out.println(sum.getNum()+sum2.getNum());//Imprimimos el resultado de la suma
        sum2.setNum(10);//Asignamos el valor 10 a la variable num2 de la clase Suma
        sum2.setNum(15);//Asignamos el valor 15 a la variable num2 de la clase Suma
        int r=sum.getNum()+sum2.getNum();//Asignamos el resultado de la suma a la variable r
        System.out.println(r);//Imprimimos el resultado de la suma
    }       //  cierra llave del metodo main
    }//cierra clase MainS