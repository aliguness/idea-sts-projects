package com.aligunes.soru3;

import java.util.Arrays;

public class MyArrayList<T> {

	private static final int ARRAY_BOYUTU = 10;
	private Object[] array;
	private int index;
	
	
	public MyArrayList() {
		this.array = new Object[ARRAY_BOYUTU];
		this.index = 0;
	}
	
	public void add(T element) {
		if(index == array.length) {
			arrayBoyutArrtırma();
		}
		array[this.index++] = element;
	}
	
	public void add(int index, T element) {
		
		if(index>array.length||index<0) {
			throw new IndexOutOfBoundsException("Array boyutu dışında işlem yapamazsınız!!");
		}
		if(index == array.length) {
			arrayBoyutArrtırma();
		}
		
		for (int i =this.index ; i > index; i--) {
			array[i] = array[i-1];			
		}
		
		array[index] = element;
		this.index++;
	}
	
	public T get(int index) {
		if(index<0 || index>=this.index) {
			throw new IndexOutOfBoundsException("Array boyutu dışında!!!");
		}
		return (T) array[index];
	}
	
	public void set(int index, T element) {
		if(index<0 || index>=this.index) {
			throw new IndexOutOfBoundsException("Array boyutu dışında..!!");
		}
		array[index] = element;
	}
	
	public void remove(int index) {
		if(index<0 || index>=this.index) {
			throw new IndexOutOfBoundsException("Array boyutu dışında!!!");
		}
		
		for (int i = index; i < this.index-1; i++) {
			array[i] = array[i+1];
		}
		
		array[this.index-1]=null;
		this.index--;
	}
	
	public boolean contains(T element) {
		for (Object object : array) {
			if(object ==null) {
				return false;
			}else if(object.equals(element)) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return this.index;
	}
	
	public boolean isEmpty() {
		if(this.index==0) {
			return true;
		}
		return false;
	}
	
	
	private void arrayBoyutArrtırma() {
		int yeniBoyut = array.length * 2;
		array = Arrays.copyOf(array, yeniBoyut);
	}

	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + "]";
	}

	
	
	
}
