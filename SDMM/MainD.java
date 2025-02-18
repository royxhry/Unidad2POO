class MainD{//Clase MainD
    public static void main (String []args){//Metodo main
        Division div=new Division();//Creamos una nueva instancia de la clase Division
        Division div2=new Division();//Creamos una nueva instancia de la clase Division
        div.setNum(8);//Asignamos el valor 8 a la variable num de la clase Division
        div2.setNum(5);//Asignamos el valor 5 a la variable num2 de la clase Division
        System.out.println(div.getNum()/div2.getNum());//Imprimimos el resultado de la división
        div2.setNum(10);//Asignamos el valor 10 a la variable num2 de la clase Division
        div2.setNum(15);//Asignamos el valor 15 a la variable num2 de la clase Division
        int r=div.getNum()/div2.getNum();//Asignamos el resultado de la división a la variable r
        System.out.println(r);//Imprimimos el resultado de la división
    }       //cierra llave del metodo main
    }   //cierra clase MainD