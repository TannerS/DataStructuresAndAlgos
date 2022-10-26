package dev.tanners.list.linked;

import dev.tanners.node.Node;

public class LinkedList<T> {
  public Node<T> node;

  public LinkedList() {
    this.node = null;
  }

  public LinkedList(T data) {
    this.node = new Node<T>(data);
  }

  /**
   * Add to end of list (last element)
   */
  public void add(T data) {
    if (this.node == null) {
      this.node = new Node<>(data);
    } else {
      Node<T> curr = this.node;

      while (curr.next != null) {
        curr = curr.next;
      }

      curr.next = new Node<>(data);
    }
  }

  public boolean add(int index, T data) {
    // we can create new list and add it as first element if pos == 0
    if (node == null && index == 0) {
      this.node = new Node<>(data);

      return true;
    }

    int counter = 0;

    for (Node<T> curr = node; curr != null; curr = curr.next, counter++) {
      if (counter + 1 == index) {
        Node<T> newElem = new Node<>(data);
        Node<T> temp = curr.next;

        curr.next = newElem;
        newElem.next = temp;

        return true;
      }
    }

    return false;
  }

  public T get(int index) {
    int counter = 0;

    for (Node<T> curr = node; curr != null; curr = curr.next, counter++) {
      if (counter == index) {
        return curr.data;
      }
    }

    return null;
  }

  //
//  public void addFirst(T data) {
//  }
//
//  public void addLast(T data) {
//  }
//
  public void clear() {
    this.node = null;
  }

  /**
   * find first instance of data
   *
   * @param data
   */
  public boolean contains(T data) {
    for (Node<T> curr = node; curr != null; curr = curr.next) {
      if (curr.data == data) {
        return true;
      }
    }

    return false;
  }

  public String toString() {
    if (node == null) {
      return "";
    }

    StringBuilder builder = new StringBuilder();

    for (Node<T> curr = node; curr != null; curr = curr.next) {
      builder.append(curr.data);
      builder.append(' ');
    }

    return builder.toString().trim();
  }
}
