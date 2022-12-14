/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Antonio
 */
public class CCuenta {

    /**
     *@hidden nombre establece el nombre de una cuenta
     */
    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  /**
   * Constructor por defecto
   */
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Cuenta elegida por el programa
    * @param sal Cantidad de saldo(dinero) en la cuenta 
    * @param tipo Cantidad de interés aplicado a la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom Nombre del titular
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     *
     * @return devuelve el nombre de la cuenta
     */
    public String obtenerNombre()
    {
        return nombre;
    }

  /**
   * 
   * @return devuelve el saldo de la cuenta
   */  
     public double estado ()
    {
        return saldo;
    }

    /**
     *
     * @param cantidad cantidad de saldo que tiene la cuenta
     * @throws Exception mensaje que imprime si el saldo de la cuenta es de valor negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
     *
     * @param cantidad cantidad de saldo que saca de la cuenta
     * @throws Exception mensaje que imprime si el saldo que se saca de la cuenta es de valor negativa
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * @hidden Cuenta es el parámetro que contiene la información de a que cuenta nos referimos
     * @return devuelve la cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
     *
     * @param cuenta cuenta seleccionada
     */
    public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

    /**
     *
     * @param saldo otorga valor al saldo de la cuenta
     */
    public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * 
  * @hidden tipoInterés Cantidad de interés aplicado a la cuenta
  * @return devuelve el porcentaje de interés de la cuenta
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

    /**
     *
     * @param tipoInterés otorga un valor al tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
