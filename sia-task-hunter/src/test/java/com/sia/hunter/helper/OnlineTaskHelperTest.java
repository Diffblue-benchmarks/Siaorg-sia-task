package com.sia.hunter.helper;

import com.sia.hunter.helper.OnlineTaskHelper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class OnlineTaskHelperTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void checkParameterTypesInput0OutputZero() {

    // Arrange
    final Class[] input = {};

    // Act and Assert result
    Assert.assertEquals(0, OnlineTaskHelper.checkParameterTypes(input));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkParameterTypesInput1OutputNegative2() {

    // Arrange
    final Class[] input = {null};

    // Act and Assert result
    Assert.assertEquals(-1, OnlineTaskHelper.checkParameterTypes(input));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkParameterTypesInput2OutputNegative2() {

    // Arrange
    final Class[] input = {null, null};

    // Act and Assert result
    Assert.assertEquals(-1, OnlineTaskHelper.checkParameterTypes(input));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkParameterTypesInputNullOutputNegative() {

    // Act and Assert result
    Assert.assertEquals(-1, OnlineTaskHelper.checkParameterTypes(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkRequestMethodInput0OutputTrue() {

    // Arrange
    final RequestMethod[] requestMethod = {};

    // Act and Assert result
    Assert.assertTrue(OnlineTaskHelper.checkRequestMethod(requestMethod));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkRequestMethodInputNullOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(OnlineTaskHelper.checkRequestMethod(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkReturnTypeInputNullOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(OnlineTaskHelper.checkReturnType(null));
  }

  // Test written by Diffblue Cover.

  @Test
  public void toListInput0Output0() {

    // Arrange
    final Object[] obj = {};

    // Act
    final List<String> actual = OnlineTaskHelper.toList(obj);

    // Assert result
    final LinkedList<String> linkedList = new LinkedList<String>();
    Assert.assertEquals(linkedList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void toListInput1Output1() {

    // Arrange
    final Object[] obj = {-10_000_000};

    // Act
    final List<String> actual = OnlineTaskHelper.toList(obj);

    // Assert result
    final LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.add("-10000000");
    Assert.assertEquals(linkedList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void toListInputNullOutput0() {

    // Arrange
    final Object[] obj = null;

    // Act
    final List<String> actual = OnlineTaskHelper.toList(obj);

    // Assert result
    final LinkedList<String> linkedList = new LinkedList<String>();
    Assert.assertEquals(linkedList, actual);
  }
}
