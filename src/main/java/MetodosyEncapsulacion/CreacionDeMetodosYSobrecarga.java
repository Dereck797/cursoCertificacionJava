package MetodosyEncapsulacion;

public class CreacionDeMetodosYSobrecarga {

  // Una clase puede contener varios métodos con el mismo nombre, pero deben diferenciarse en el número o tipo de parámetros
  // El tipo de devolución no afecta a la sobrecarga


  public int sumar(){
    return 1;
  }

  public int sumar(int a){
    return 1;
  }

  public double sumar(int a,int b){
    return 1;
  }

  public int sumar(int a,double b){
    return 1;
  }

  // Precaución
  // Cuando hay varios posibles métodos que se pueden ejecutar en una llamada: primero se intenta coincidencia exacta, después promoción de tipos y en ultimo autoboxing
  // Coincidencia exacta se refierer a que el llamado sea a un método que reciba el mismo tipo de dato
  // Promoción de tipos es que si no encuentra una cincidencia exacta, automáticamente castea el valor a un tipo mayor, puede ser long o double
  // Y autoboxing, cuando no encuentra ningún tipo primitivo, y debe castearlo a un método que reciba un tipo envoltorio
}
