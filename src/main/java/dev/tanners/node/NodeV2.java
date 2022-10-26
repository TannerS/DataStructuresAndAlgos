package dev.tanners.node;

public class NodeV2<T> {
  public T data;
  public NodeV2<T> next;
  public NodeV2<T> prev;

  public NodeV2() {
    this.prev = null;
    this.next = null;
    this.data = null;
  }

  public NodeV2(T data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }

  public NodeV2(T data, NodeV2<T> next) {
    this.data = data;
    this.next = next;
    this.prev = null;
  }

  public NodeV2(T data, NodeV2<T> next, NodeV2<T> prev) {
    this.data = data;
    this.next = next;
    this.prev = prev;
  }
}
