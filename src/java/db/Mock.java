/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;

public class Mock {
   private static ArrayList<Produto> lista;

   public static void makeMock(){

      if(lista == null) {
         lista = Produto.getLista();

         Produto caneta = new Produto();
         caneta.setDescricao("Caneta Bic");
         caneta.setPreco(1.5f);
         caneta.setOferta(false);
         lista.add(caneta);

         Produto caderno = new Produto();
         caderno.setDescricao("Caderno de Surfista");
         caderno.setPreco(8f);
         caderno.setOferta(true);
         lista.add(caderno);

         Produto lapis = new Produto();
         lapis.setDescricao("Lapis FaberCastle");
         lapis.setPreco(2f);
         lapis.setOferta(false);
         lista.add(lapis);

         Produto fone = new Produto();
         fone.setDescricao("Fone Razer");
         fone.setPreco(200f);
         fone.setOferta(false);
         lista.add(fone);

         Produto cabelo = new Produto();
         cabelo.setDescricao("Cabelo Artifical");
         cabelo.setPreco(5f);
         cabelo.setOferta(true);
         lista.add(cabelo);

         Produto bandeira = new Produto();
         bandeira.setDescricao("Bandeira do PT");
         bandeira.setPreco(50f);
         bandeira.setOferta(true);
         lista.add(bandeira);




      }

   }

}




