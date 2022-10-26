package dev.tanners.node;

public class Node<T> {
  protected T data;
  protected Node<T> next;

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

  public Node<T> getNext() {
    return next;
  }

  public void setData(T data) {
    this.data = data;
  }

  public T getData() {
    return this.data;
  }
}
