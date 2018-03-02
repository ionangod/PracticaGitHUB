package Calculadora;

public class Calculadora {
	double op1;
	double op2;
	
	/**
	 * Aqui asignamos los numero que van a operar
	 * @param op1: operando 1
	 * @param op2: operando 2
	 */
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
		/**
		 * Aqui vamos a construirlo
		 */
	}
	
	public double suma() {

		return op1+op2;
		/**
		 * Aqui vamos a sumarlo
		 * @return op+op2: devuelve la suma
		 */
	}
	
	public double resta() {
		return op1-op2;
		/**
		 * Aqui vamos a restarlo
		 * @return op-op2: devuelve la resta
		 */
	}
	
	public double division() {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
			/**
			 * @throw Da error si se divide por 0
			 */
		}
		return op1/op2;
		/**
		 * Aqui vamos a dividirlo
		 * @return op/op2: devuelve la division
		 */
	}
	public double potencia() {
		if (op1==0)
			return 1;
		/**
		 * @return devuelve 1 si el op2 es 0
		 */
		if (op2<0)
			return -Math.pow(op1, op2);
		return Math.pow(op1, op2);
		/**
		 * Aqui vamos a elevarlo
		 * @return Math.pow(op1,op2): devuelve la potencia
		 */
	}

	@Override
	public String toString() {
		return "Calculadora de Ionan:\nOperando1 = " + op1 + "\nOperando2 =" + op2;
	/**
	 * @return devulete el autor y los numero que operan
	 */
	}
	
	//TODO: A�adir la operaci�n potencia, que devuelve
	//op1 elevado a op2 con las siguientes reglas: 
	//-Por convenio cualquier n�mero elevado a 0 es igual a 1.
	//-Un n�mero "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
	//As� 232^0 = 1; y 2^(-3)=1/2^3=1/8
	
	
	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	
}
