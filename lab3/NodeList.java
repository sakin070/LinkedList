// ==========================================================================
// $Id: addTemplate.cpp,v 1.1 2005/11/02 23:13:32 jlang Exp $
// CSI2110 Lab code Node List skeleton class
// ==========================================================================
// (C)opyright:
//
//   Jochen Lang
//   SITE, University of Ottawa
//   800 King Edward Ave.
//   Ottawa, On., K1N 6N5
//   Canada. 
//   http://www.site.uottawa.ca
// 
// Creator: jlang (Jochen Lang)
// Email:   jlang@site.uottawa.ca
// ==========================================================================
// $Log: addTemplate.cpp,v $
//
// ==========================================================================
import java.util.NoSuchElementException;
import java.util.LinkedList;

public class NodeList<E> {
  // The linked list which is to be adapted
  protected LinkedList<E> linkedList = new LinkedList<E>();

  // Directly available
  public int size() {
    return linkedList.size();
  }

  // Directly available
  public boolean isEmpty() {
     return linkedList.isEmpty();
  }

  // fix me!
  public boolean isFirst(E element) {
    return this.first().equals(element);
  }

  // fix me!
  public boolean isLast(E element) {
    return this.last().equals(element);
  }

  // Directly available
  public E first() throws NoSuchElementException {
    return linkedList.element();
  }


  // Directly available
  public E last() throws NoSuchElementException {
    return linkedList.getLast();
  }

  // fix me!
  public E prev(E element)throws NoSuchElementException {
  
    return linkedList.get(this.getIndex(element)-1);
    // return null;
  }


  // fix me!
  E next(E element)throws NoSuchElementException {
    
    return linkedList.get(this.getIndex(element)+1);
    // return null;
  }

  // fix me!
  public void swapElements(E element1, E element2)throws NoSuchElementException {
    //throw new NoSuchElementException();
    int i = this.getIndex(element1);
    int j = this.getIndex(element2);
    linkedList.set(i,element2);
    linkedList.set(j,element1);
  }
  

  // fix me!
  public void set(E currElement, E repElement)throws NoSuchElementException {
    //throw new NoSuchElementException();
    int i = this.getIndex(currElement);
    linkedList.set(i,repElement);
  }


  // Directly available
  public void addFirst(E element) {
    linkedList.addFirst(element);
    return;
  }

  // Directly available
  public void addLast(E element) {
    linkedList.addLast(element);
    return;
  }

  // fix me!
  public void addBefore(E currElement,E addElement)throws NoSuchElementException {
    //throw new NoSuchElementException();
    int i = this.getIndex(currElement);
    if (i==0){
      linkedList.addFirst(addElement);
    }
    else{
      linkedList.add(i-1,addElement);
    }
  }

  // fix me!
  public void addAfter(E currElement,E addElement)throws NoSuchElementException {
    //throw new NoSuchElementException();
    linkedList.add(this.getIndex(currElement)+1,addElement);
  }
  
  // fix me!
  public E remove(E element) throws NoSuchElementException {
    //throw new NoSuchElementException();
    return linkedList.remove(this.getIndex(element));
  }

  private int getIndex(E element)throws NoSuchElementException{
    int i = linkedList.indexOf(element);
    if (i == -1){
      throw new NoSuchElementException();
    }
    return i;
  }
}
