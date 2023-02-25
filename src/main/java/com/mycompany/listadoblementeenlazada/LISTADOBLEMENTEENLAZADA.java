/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadoblementeenlazada;

/**
 *
 * @author ZenBook Flip 5
 */
public class LISTADOBLEMENTEENLAZADA {

    public static void main(String[] args) {
       class Nodo {
    int valor;
    Nodo previo;
    Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.previo = null;
        this.siguiente = null;
    }
}
       
    }
    class ListaDobleEnlazada {
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int tamaño;

    public ListaDobleEnlazada() {
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.tamaño = 0;
    }

    public void insertarAlInicio(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primerNodo;
            primerNodo.previo = nuevoNodo;
            primerNodo = nuevoNodo;
        }

        tamaño++;
    }

    public void insertarAlFinal(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (ultimoNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.previo = ultimoNodo;
            ultimoNodo.siguiente = nuevoNodo;
            ultimoNodo = nuevoNodo;
        }

        tamaño++;
    }

    public void recorrerHaciaAdelante() {
        Nodo nodoActual = primerNodo;

        while (nodoActual != null) {
            System.out.print(nodoActual.valor + " ");
            nodoActual = nodoActual.siguiente;
        }

        System.out.println();
    }

    public void recorrerHaciaAtras() {
        Nodo nodoActual = ultimoNodo;

        while (nodoActual != null) {
            System.out.print(nodoActual.valor + " ");
            nodoActual = nodoActual.previo;
        }

        System.out.println();
    }

    public int mostrarTamaño() {
        return tamaño;
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

    public Nodo buscarPorValor(int valor) {
        Nodo nodoActual = primerNodo;

              while (nodoActual != null && nodoActual.valor != valor) {
            nodoActual = nodoActual.siguiente;
        }

        return nodoActual;
    }

    public Nodo buscarPorIndice(int indice) {
        if (indice < 0 || indice >= tamaño) {
            return null;
        }

        Nodo nodoActual = primerNodo;
        int indiceActual = 0;

        while 
