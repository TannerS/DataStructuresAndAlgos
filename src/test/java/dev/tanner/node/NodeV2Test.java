package dev.tanner.node;

import dev.tanners.node.NodeV2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeV2Test {
  @Test
  @DisplayName("Creating empty node doesnt include data, next, or prev in constructor")
  void testEmptyNodeConstructor() {
    NodeV2<Integer> node = new NodeV2<>();

    assertNull(node.data);
    assertNull(node.next);
    assertNull(node.prev);
  }

  @Test
  @DisplayName("Creating node with data works as expected")
  void testDataInConstructor() {
    NodeV2<Integer> node = new NodeV2<>(5);

    assertEquals(node.data, 5);
    assertNull(node.next);
    assertNull(node.prev);
  }

  @Test
  @DisplayName("Creating node with data and next works as expected")
  void testDataNextInConstructor() {
    NodeV2<Integer> node = new NodeV2<>(5, new NodeV2<>());

    assertEquals(node.data, 5);
    assertNotNull(node.next);
    assertNull(node.prev);
  }

  @Test
  @DisplayName("Creating node with data, next, and prev works as expected")
  void testDataNextPrevInConstructor() {
    NodeV2<Integer> node = new NodeV2<>(5, new NodeV2<>(), new NodeV2<>());

    assertEquals(node.data, 5);
    assertNotNull(node.next);
    assertNotNull(node.prev);
  }

  @Test
  @DisplayName("Setting data works as expected")
  void testSettingData() {
    NodeV2<Integer> node = new NodeV2<>();

    node.data = 54;

    assertNull(node.next);
    assertEquals(node.data, 54);
    assertNull(node.prev);
  }

  @Test
  @DisplayName("Setting next works as expected")
  void testSettingNext() {
    NodeV2<Integer> node = new NodeV2<>();

    node.next = new NodeV2<>();

    assertNull(node.data);
    assertNull(node.prev);
    assertNotNull(node.next);
  }

  @Test
  @DisplayName("Setting prev works as expected")
  void testSettingPrev() {
    NodeV2<Integer> node = new NodeV2<>();

    node.prev = new NodeV2<Integer>();

    assertNull(node.data);
    assertNull(node.next);
    assertNotNull(node.prev);
  }
}
