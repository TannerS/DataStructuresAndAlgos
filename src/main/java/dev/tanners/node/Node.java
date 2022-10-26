package dev.tanners.node;

public class Node<T> {
  public T data;
  public Node<T> next;

  public Node() {
    this.next = null;
    this.data = null;
  }

  public Node(T data) {
    this.data = data;
    this.next = null;
  }

  public Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }
}
