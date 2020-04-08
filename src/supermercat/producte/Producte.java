/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package supermercat.producte;
 
public abstract class Producte {
 private String nom;
 private int preu;
 private boolean oferta;
 private int quantitat; // total del producte en magatzem
 
 
public abstract int calcularOferta();
 
}
