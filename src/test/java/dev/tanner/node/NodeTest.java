package dev.tanner.node;

import static org.junit.jupiter.api.Assertions.*;

import dev.tanners.node.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class NodeTest {
  @Test
  @DisplayName("Creating empty node doesnt include data or next in constructor")
  void testEmptyNodeConstructor() {
    Node<Integer> node = new Node<>();

    assertNull(node.getData());
    assertNull(node.getNext());
  }

  @Test
  @DisplayName("Creating node doesnt include data in constructor")
  void testEmptyDataNodeConstructor() {
    Node<Integer> node = new Node<>(null, new Node<Integer>());

    assertNull(node.getData());
    assertNotNull(node.getNext());
  }

  @Test
  @DisplayName("Creating node doesnt include next in constructor")
  void testEmptyNextNodeConstructor() {
    Node<Integer> node = new Node<>(5);

    assertNotNull(node.getData());
    assertEquals(node.getData(), 5);
    assertNull(node.getNext());
  }
}
