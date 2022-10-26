package dev.tanner.list.linked;

import dev.tanners.list.linked.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
  @Test
  @DisplayName("Creating empty list works as expected")
  void testEmptyListConstructor() {
    LinkedList<Integer> list = new LinkedList<>();

    assertEquals(list.toString(), "");
    assertNull(list.node);
  }

  @Test
  @DisplayName("Creating list with default element via constructor works as expected")
  void testListConstructor() {
    LinkedList<Integer> list = new LinkedList<>(5);

    assertEquals(list.toString(), "5");
    assertNotNull(list.node);
  }

  @Test
  @DisplayName("Add to empty list works as expected")
  void testAddToEmptyList() {
    LinkedList<Integer> list = new LinkedList<>();

    list.add(555);

    assertEquals(list.toString(), "555");
    assertNotNull(list.node);
  }

  @Test
  @DisplayName("Add to non-empty list works as expected")
  void testAddToNoneEmptyList() {
    LinkedList<Integer> list = new LinkedList<>(6);

    list.add(555);

    assertEquals(list.toString(), "6 555");
    assertNotNull(list.node);
  }

  @Test
  @DisplayName("Add to empty list in element 0 works as expected")
  void testAddListElem0() {
    LinkedList<Integer> list = new LinkedList<>();

    boolean result = list.add(0, 555);

    assertTrue(result);
    assertEquals(list.toString(), "555");
    assertNotNull(list.node);
  }

  @Test
  @DisplayName("add works as expected")
  void testListAdd() {
    LinkedList<Integer> list = new LinkedList<>(333);

    list.add(555);
    list.add(777);
    list.add(999);

    assertEquals(list.toString(), "333 555 777 999");
    assertNotNull(list.node);
  }

  @Test
  @DisplayName("Add to list in element 1, 2, and, 3 works as expected")
  void testAddListElem1() {
    LinkedList<Integer> list = new LinkedList<>(333);

    list.add(1, 555);
    list.add(2, 777);
    list.add(3, 999);

    assertEquals(list.toString(), "333 555 777 999");
    assertNotNull(list.node);
  }

  @Test
  @DisplayName("Add to list in non existing element works as expected")
  void testAddListNoneExistingElem() {
    LinkedList<Integer> list = new LinkedList<>(111);

    boolean result = list.add(5, 777);

    assertEquals(list.toString(), "111");
    assertFalse(result);
    assertNotNull(list.node);
  }

  @Test
  @DisplayName("Add to list in already existing element works as expected")
  void testAddListExistingElem() {
    LinkedList<Integer> list = new LinkedList<>(111);

    list.add(1, 222);
    list.add(2, 333);
    list.add(3, 444);
    list.add(1, 555);

    assertEquals(list.toString(), "111 555 222 333 444");
    assertNotNull(list.node);
  }

  @Test
  @DisplayName("Get element at pos x works as expected")
  void testListGetElementAtX() {
    LinkedList<Integer> list = new LinkedList<>(111);

    list.add(1, 222);
    list.add(2, 333);
    list.add(3, 444);
    list.add(4, 555);

    assertEquals(list.toString(), "111 222 333 444 555");
    assertEquals(list.get(0), 111);
    assertEquals(list.get(1), 222);
    assertEquals(list.get(4), 555);
    assertNull(list.get(5));
  }

  @Test
  @DisplayName("clear works as expected")
  void testListClear() {
    LinkedList<Integer> list = new LinkedList<>(111);

    list.add(1, 222);
    list.add(2, 333);
    list.add(3, 444);
    list.add(4, 555);

    assertEquals(list.toString(), "111 222 333 444 555");

    list.clear();

    assertEquals(list.toString(), "");
  }

  @Test
  @DisplayName("contains works as expected")
  void testListContains() {
    LinkedList<Integer> list = new LinkedList<>(111);

    list.add(222);
    list.add(333);
    list.add(444);
    list.add(555);

    assertTrue(list.contains(111));
    assertTrue(list.contains(333));
    assertTrue(list.contains(555));
    assertFalse(list.contains(667));
  }
//
//  @Test
//  @DisplayName("Creating node doesnt include data in constructor")
//  void testEmptyDataNodeConstructor() {
//    Node<Integer> node = new Node<>(null, new Node<>());
//
//    assertNull(node.data);
//    assertNotNull(node.next);
//  }
//
//  @Test
//  @DisplayName("Creating node doesnt include next in constructor")
//  void testEmptyNextNodeConstructor() {
//    Node<Integer> node = new Node<>(5);
//
//    assertEquals(node.data, 5);
//    assertNull(node.next);
//  }
//
//  @Test
//  @DisplayName("Setting data works as expected")
//  void testSettingData() {
//    Node<Integer> node = new Node<>();
//
//    node.data = 54;
//
//    assertEquals(node.data, 54);
//    assertNull(node.next);
//  }
//
//  @Test
//  @DisplayName("Setting next works as expected")
//  void testSettingNext() {
//    Node<Integer> node = new Node<>();
//
//    node.next = new Node<>();
//
//    assertNull(node.data);
//    assertNotNull(node.next);
//  }
}
