/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema2;

/**
 * @author Felipe
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public  class DemostracionLista<E> implements List<E> {

    public static final int Cap = 25;   // init cap of array
	private E[ ] data;
	private int size = 0;
	//private int contCapacidad = 0; 
        
	public DemostracionLista() {
		this(Cap); //  da la capacidad del array 25
	}

	public DemostracionLista(int capacity) {
		data = (E[]) new Object[capacity];
	}
    
    @Override
        public int size() {
		return size;
	}
@Override
	public boolean isEmpty() { 
		return size == 0;
	}

    @Override
    public E get(int i) {
        return data[i];    }

    @Override
    public E set(int i, E e) {
        
                E temp = data[i];
                data[i] = null; 
		data[i] = e;
		return temp;    }

    @Override
    public void add(int i, E e) {

        if (size >= data.length) // not enough capacity	
            throw new IllegalStateException("Array is full");
                 else{
                       data[size] = e; 
                       size++;                                     
        }    
    }

    @Override
    public E remove(int i, E e) throws IndexOutOfBoundsException {
E temp = data[i];
                data[i] = null; 
		for (int k=i; k < size-1; k++) {                    
                   data[k] = data[k+1];
                   data[size-1] = null; 
                }			
		size--;
		return temp;    }
}

