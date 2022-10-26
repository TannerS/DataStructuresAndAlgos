package dev.tanner.node;

import static org.junit.jupiter.api.Assertions.*;

import dev.tanners.node.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NodeTest {
  @Test
  @DisplayName("Creating empty list doesnt via constructor doesnt set next or data")
  void testEmptyNodeConstructor() {
    Node<Integer> node = new Node<>();

    assertNull(node.data);
    assertNull(node.next);
  }

  @Test
  @DisplayName("Creating node doesnt include data in constructor")
  void testEmptyDataNodeConstructor() {
    Node<Integer> node = new Node<>(null, new Node<>());

    assertNull(node.data);
    assertNotNull(node.next);
  }

  @Test
  @DisplayName("Creating node doesnt include next in constructor")
  void testEmptyNextNodeConstructor() {
    Node<Integer> node = new Node<>(5);

    assertEquals(node.data, 5);
    assertNull(node.next);
  }

  @Test
  @DisplayName("Setting data works as expected")
  void testSettingData() {
    Node<Integer> node = new Node<>();

    node.data = 54;

    assertEquals(node.data, 54);
    assertNull(node.next);
  }

  @Test
  @DisplayName("Setting next works as expected")
  void testSettingNext() {
    Node<Integer> node = new Node<>();

    node.next = new Node<>();

    assertNull(node.data);
    assertNotNull(node.next);
  }
}
