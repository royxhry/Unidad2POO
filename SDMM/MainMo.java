class MainMo{//Clase MainMo
    public static void main (String []args){//Metodo main
        Modulo mod=new Modulo();//Creamos una nueva instancia de la clase Modulo
        Modulo mod2=new Modulo();//Creamos una nueva instancia de la clase Modulo
        mod.setNum(8);//Asignamos el valor 8 a la variable num de la clase Modulo
        mod2.setNum(5);//Asignamos el valor 5 a la variable num2 de la clase Modulo
        System.out.println(mod.getNum()%mod2.getNum());//Imprimimos el resultado de la división
        mod2.setNum(10);//Asignamos el valor 10 a la variable num2 de la clase Modulo
        mod2.setNum(15);//Asignamos el valor 15 a la variable num2 de la clase Modulo
        int r=mod.getNum()%mod2.getNum();//Asignamos el resultado de la división a la variable r
        System.out.println(r);//Imprimimos el resultado de la división
    }       //cierra llave del metodo main
    }   //cierra clase MainMo