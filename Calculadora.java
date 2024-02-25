/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.calculadora;

import java.util.ArrayList;

/**
 * Todas las funciones para la funcionalidad de una calculadora
 * @author nuria, Mario, Paola y Nicolas
 */
public class Calculadora extends PilaA{
    
    /**
     *Revisa que los parentesís escritos por el usuario esten puestos correctamente
     * @param cadena ingresa la operación del usuario
     * @return regresa si los parentesis estan correctamente balanceados o no
     */    
    public static boolean revicionParentesis(String cadena){
        boolean res=false;
        PilaA m = new PilaA();
        int i=0;
        char carac;
        int cant=0;
        int cant2=0;
        boolean resp=false;
        while(!m.isEmpty())
           m. pop();
        while(i<cadena.length()){
            carac=cadena.charAt(i);
            if(carac=='(' || carac=='[' || carac=='{'){
                if(carac=='[')
                    cant++;
                else if(carac=='{')
                    cant2++;
                m.push(carac);
            }else if(carac==')' || carac==']' || carac=='}'){
                if(carac==']')
                    cant--;
                else if(carac=='}')
                    cant2--;
                if(m.isEmpty()){
                    resp=true;
                    break;
                }
                m.pop();
            }
            i++;
        }if(m.isEmpty() && !resp && cant==0 && cant2==0)
            res=true;
        else
            res=false;
        return res;
    }
      
   
    /**
     * Revisa que no haya dos o mas operadores juntos que imposibiliten hacer una operacion
     * @param cadena  ingresa la operación del usuario
     * @return regresa si hay operadores juntos o no
     */
    public static boolean operadoresJuntos(String cadena){
        boolean res = true; 
        for (int i = 0; i < cadena.length() - 1; i++) {
            char currentChar = cadena.charAt(i);
            char nextChar = cadena.charAt(i + 1);
            if ((currentChar == '+' || currentChar == '-' || currentChar == '^' || currentChar == '*' || currentChar == '/') && (nextChar == '+' || nextChar == '-' || nextChar == '^' || nextChar == '*' || nextChar == '/')) {
                res = false; 
                break;
        }
            if (nextChar == '-' && (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/' || currentChar == '^')) {
                continue;
            }
        }
        return res;
    }
    
    /**
     * Junta las dos funciones anteriores para ver que la operación no tenga errores
     * @param cadena  ingresa la operación del usuario
     * @return devuelve si la operacion esta bien escrita sin errores
     */  
    public static boolean RevisionErrores(String cadena){
       boolean res=false;
       if(revicionParentesis(cadena)==true  && operadoresJuntos(cadena)==true ){
           res=true;
       }
       return res;
       
        
    }
    
    /**
     * Pasa la operacion del usuario de infija a postfija,es decir lo rescribe de forma que se consideren las jerarquias de las operaciones
     * @param cadena ingresa la operación del usuario
     * @return devuelve la operación convertido a postfijo y en formato de ArrayList
     */
   public static ArrayList<String> conversionFija(String cadena) {
        PilaA<Character> p1 = new PilaA<>();
        ArrayList<String> infija = new ArrayList<>();
        ArrayList<String> post = new ArrayList<>();
          ArrayList<String> postFinal = new ArrayList<>();
            ArrayList<String> postfinal2 = new ArrayList<>();
        char carac;
        String num = "";
        boolean operando = false;

        for (int j = 0; j < cadena.length(); j++) {
            carac = cadena.charAt(j);
            if (carac == '+' || carac == '-' || carac == '*' || carac == '/' || carac == '^' || carac == '(' || carac == ')' || carac=='~') {
                if (!num.equals("")) {
                    infija.add(num);
                    num = "";
                }
                if (carac != '(' && carac != ')') {
                    infija.add("" + carac);
                }
                operando = true;
            } else if (Character.isLetterOrDigit(carac) || carac=='.') {
                if (operando) {
                    if (!num.equals("")) {
                        infija.add(num);
                        num = "";
                    }
                    operando = false;
                }
              num += carac;  
            }
        }

        if (!num.isEmpty()) {
            infija.add(num);
        }

        for (int i = 0; i < infija.size(); i++) {
            String token = infija.get(i);
            char caracter = token.charAt(0);
            if (Character.isLetterOrDigit(caracter)) {
                post.add(token);
            } else if (token.equals("(")) {
                p1.push(caracter);
            } else if (token.equals(")")) {
                while (!p1.isEmpty() && p1.peek() != '(') {
                    post.add("" + p1.pop());
                }
                if (!p1.isEmpty() && p1.peek() == '(') {
                    p1.pop();
                }
            } else {
                while (!p1.isEmpty() && jerarquia(caracter) <= jerarquia(p1.peek())) {
                    post.add("" + p1.pop());
                }
                p1.push(caracter);
            }
        }

        while (!p1.isEmpty()) {
            post.add("" + p1.pop());
        }

        // Eliminar espacios en blanco de la lista post
      
        for (String elemento : post) {
            if (!elemento.equals(" ")) {
                postFinal.add(elemento);
            }
        }
        postfinal2=encuentraGusanito(postFinal);

        return postfinal2;
    }
   
   /**
     * Sirve para encontrar signos negativos en la operación diferentes del signo de menos
     * @param cadena ingresa la operación del usario
     * @return devuelve la cadena con un simbolo que distingue los números negativos
     */
    public static ArrayList<String> encuentraGusanito(ArrayList<String> cadena){
        for(int i=0; i<cadena.size(); i++){
            if(cadena.get(i).equals("~")){
                cadena.remove(i);
                cadena.set(i-1, "-"+cadena.get(i-1));
            }
        }
        return cadena;
    }
    
    /**
     * Establece la jerarquia que tiene cada operación según su caso
     * @param operador ingresa un operador
     * @return regresa el numero (jerarquía) de operador
     */
    public static int jerarquia(char operador){
        int res=-1;
        switch(operador){
            case '+':
            case '-':
                res=1;
                break;
            case '*':
            case '/' :
                res=2;
                break;
            case '^':
                res=3;
                break;
            case '~':
                res=4;
            //case '(':
            //case ')':
                //res=0;
                //break;
        }
        return res;
    }

    
    /**
     * Indentifica todos los posibles operadores que pueden llegar a presentarse
     * @param mario ingresa un string con la cadena de operadores
     * @return devuelve si la cadena está correctamente hecha con sus operadores
     */
    private static boolean Numeros(String mario) {
        
        return mario.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * Revisa si la cadena tien operadores para porceder con la operación
     * @param mario ingresa una cadena con la operación
     * @return regresa si la caena tien operadores para proceder
     */
    private static boolean Revisar(String mario) {
        return mario.equals("+") || mario.equals("-") || mario.equals("*") || mario.equals("/") || mario.equals("^");
    }

    /**
     * Revisa que tipo de operador ingreso el usario y procede a hacer la operación correspondiente
     * @param operand1 el primer digito que se toma para hacer la operación
     * @param operand2 el segundo digito que se toma para hacer la operación
     * @param operator cadena que contine la operación a realizar
     * @return regresa el valor de la operación segun el caso
     */
    private static double Operacion(double operand1, double operand2, String operator) {
        double res = 0.00;
        switch (operator) {
            case "+":
                res= operand1 + operand2;
                break;
            case "-":
                res= operand1 - operand2;
                break;
            case "*":
                res= operand1 * operand2;
                break;
            case "^":
                res = Math.pow(operand1, operand2);
                break;
            case "/":
                if(operand2 == 0){
                    res=-0.0;
                }
                else{
                    res =  operand1 / operand2;
                }
                break;
           
        }
        return res;
    }
    
    /**
     * Función que hace todas las operaciones correspondientes de la operación que ingreso el usario
     * @param expression ingresa el ArrayList con la operación del usario de forma postfija
     * @return regresa el valor de toda la operación hecha por el usario
     */
    public static double evaluar(ArrayList<String> expression) {
        PilaA<Double> stack = new PilaA<>();

        for (String mario : expression) {
            if (Numeros(mario)) {
                stack.push(Double.parseDouble(mario));
            } else if (Revisar(mario)) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = Operacion(operand1, operand2, mario);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid token in expression: " + mario);
            }
        }



        return stack.pop();
          
    }
    
     /**
     * Función que junta los pasos de revisión de errores, conversión a postfija y calcular el valor de la operación
     * @param cadena ingresa la operación del usario
     * @return el valor de la operación ingresada
     */
    public static String Calcular(String cadena){
        boolean res;
        double resFinal=0.00;
        String resp="";
        res = RevisionErrores(cadena);
        ArrayList<String> res1;
        if(res == true){
            res1 = conversionFija(cadena);
            resFinal = evaluar(res1);
            if(resFinal==-0.0)
                resp="No se puede hacer";
            else
                resp=""+resFinal;
        }else{
            resp="No se puede hacer";
        }
        return resp;
    }
    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String[] args) {
        // TODO code application logic here
     ArrayList<String>  a = new ArrayList<String>();
    a.add("2");
    a.add("~");
    a.add("3");
    a.add("+");
     
     String cadena = "3/~2";
        System.out.println(Calculadora.Calcular(cadena));
    }
    */
}