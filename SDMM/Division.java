class Division{//Clase de Division
     int num;//Atributo de la clase
     int num2;//Atributo de la clase
     Division(){}//Constructor de la clase
     public int getNum() {//Metodo getNum
        return num;//Devuelve el valor de num
    }//cierra metodo getNum
    public void setNum(int num) {//Metodo setNum
        this.num = num;//Asigna el valor de num
    }//cierra metodo setNum
    public int getNum2() {//Metodo getNum2
        return num2;//Devuelve el valor de num2
    }//cierra llave del metodo getnum2
    public void setNum2(int num2) {//Metodo setNum2
        this.num2 = num2;//Asigna el valor de num2
    }//cierra llave del metodo setNum2
    @Override//Override
    public String toString() {//Metodo toString
        return "Division [num=" + num + ", num2=" + num2 + "]";//Devuelve la cadena de caracteres
    }//cierra llave del metodo toString
}//cierra clase Division