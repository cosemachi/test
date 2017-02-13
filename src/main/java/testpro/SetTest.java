package testpro;

import java.util.NoSuchElementException;

//Implement Set using array
public class SetTest<E> {
	private E arrayElement[];
	private int size =0;
	
	public SetTest(){
		this.arrayElement = null;
	}
	
	public SetTest(E[] element){

        arrayElement = element;
        size = arrayElement.length;
    }
	
	private void incrementArray(){
		
		if(arrayElement == null) {
			arrayElement = (E[]) new Object[5];
		} else {

	        E[] temparray = arrayElement;
	
	        int tempsize=size+5;
	        arrayElement =(E[]) new Object[tempsize];
	        
	        System.arraycopy(temparray, 0, arrayElement, 0, size);
		}
    }
	
	public int getSize(){
		return size;
	}
	
	public void addElement(E element) {
		// TODO Auto-generated method stub
		if(!contains(element))
		{
			if(arrayElement == null || size == arrayElement.length){
				incrementArray();
			}
			arrayElement[size++] = element;
		}
	}
	
	public void remove(E element) throws EmptySetException, NoSuchElementException
	{
		if(arrayElement == null || size == 0)
			throw new EmptySetException();
		else if (!contains(element))
			throw new NoSuchElementException();
		
		
		for(int i = 0; i < arrayElement.length; i++)
		{
			if((element == null && arrayElement[i] == null) || element.equals(arrayElement[i]) )
			{
				if(i+1 == size)
				{
					size--;
					break;
				}
				else
				{
					arrayElement[i] = arrayElement[i+1];
					size--;
					break;
				}
			}
		}
	}
	
	public boolean contains(E element)
	{
		if(arrayElement == null || size == 0)
			return false;
		
		if(element == null)
		{
			for(E a : arrayElement)
			{
				if(a == null)
					return true;
			}
		}
		else {
			for(E a : arrayElement)
			{
				if(element.equals(a))
					return true;
			}
		}
		return false;
	}
}
