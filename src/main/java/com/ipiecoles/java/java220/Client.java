
package com.ipiecoles.java.java220;
public class Client {
 public String nom;
 public String prenom;
 public int numero;
 //Attribut Nom
 String nom;// => null
 //Prénom
 String prenom; // => null
 //Numéro
 Integer numero = 1; // => 1
 //int numero;
 Integer calculReduction(){
  if(this.numero < 200000){
   return 10;
  }
  return 0;
 }
}