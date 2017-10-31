/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema3;

/**
 *
 * @author Felipe
 */
public class Node<E> implements Position {
    
    private E element;
	private Node<E> prev;// NODO ANTERIOR
	private Node<E> next;// NODO SIGUIENTE 

	public Node(E e, Node<E> p, Node<E> n) {
		element = e;
		prev = p;
		next = n;
	}

	public E getElement() throws IllegalStateException {
		if (next == null) // Nodo no valido
			throw new IllegalStateException("Posicion invalida");
		return element;
	}
	
	public void setElement(E e) {
		element = e;
	}

	public Node<E> getPrev() {
		return prev;
	}

	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

}
