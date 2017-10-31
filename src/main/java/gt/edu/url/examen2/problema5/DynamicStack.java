/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema5;

/**
 *
 * @author Felipe
 */
public class DynamicStack<E> implements Stack<E> {

    public static final int CAPACITY=2;
	private E[] data;
	private int size = 0;
    
    public DynamicStack() {
		this(CAPACITY);
	}

	public DynamicStack(int capacity) {
		data = (E[]) new Object[capacity];
	}
        
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
    return (size == 0);  
    }

    @Override
    public void push(E e) {
        if (size() == data.length) {
            Rezise();
        }
        else{
         data[size] = e;   
        }        
       size++;
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
		return data[size];

  }

    @Override
    public E pop() {
    if (isEmpty()) return null;
		E Res = data[size];
		data[size] = null;
		size--;
		return Res;
    }
   
    protected void Rezise(){
        E[] temp  = (E[])new Object[(data.length)*2];  // MULTIPLICA EL DOBLE DEL ARRRAY
        
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    
    
}
