package com.sia.core.helper;

import com.sia.core.helper.StringHelper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringHelperTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void applyRelativePathInputNotNullNotNullOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("/", StringHelper.applyRelativePath("/", "/"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void applyRelativePathInputNotNullNotNullOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals("/foo", StringHelper.applyRelativePath("/", "foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void applyRelativePathInputNotNullNotNullOutputNotNull3() {

    // Act and Assert result
    Assert.assertEquals("foo", StringHelper.applyRelativePath("foo", "foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void countOccurrencesOfInputNotNullNotNullOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(
        1,
        StringHelper.countOccurrencesOf("&&&&&&&&&&&&&&&&&&&&%%%%%%%%%%%%%%%%%%%%%%%%%%%",
                                        "&&&&&&&&&&&&&&&&&&&&"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void countOccurrencesOfInputNotNullNotNullOutputZero() {

    // Act and Assert result
    Assert.assertEquals(0, StringHelper.countOccurrencesOf("/", "foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void countOccurrencesOfInputNotNullNotNullOutputZero2() {

    // Act and Assert result
    Assert.assertEquals(0, StringHelper.countOccurrencesOf("!!!!!", ""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void countOccurrencesOfInputNotNullNotNullOutputZero3() {

    // Act and Assert result
    Assert.assertEquals(0, StringHelper.countOccurrencesOf("", "!"));
  }

  // Test written by Diffblue Cover.

  @Test
  public void delimitedListToStringArrayInputNotNullNullNullOutput1() {

    // Arrange
    final String str = "?";
    final String delimiter = null;
    final String charsToDelete = null;

    // Act
    final String[] actual = StringHelper.delimitedListToStringArray(str, delimiter, charsToDelete);

    // Assert result
    Assert.assertArrayEquals(new String[] {"?"}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void delimitedListToStringArrayInputNullNullNullOutput0() {

    // Arrange
    final String str = null;
    final String delimiter = null;
    final String charsToDelete = null;

    // Act
    final String[] actual = StringHelper.delimitedListToStringArray(str, delimiter, charsToDelete);

    // Assert result
    Assert.assertArrayEquals(new String[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void dotdecodInputNullOutputNullPointerException() {

    // Act
    thrown.expect(NullPointerException.class);
    StringHelper.dotdecod(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void endsWithIgnoreCaseInputNotNullNotNullOutputFalse() {

    // Arrange
    final String str = "foo";
    final String suffix = "/";

    // Act
    final boolean actual = StringHelper.endsWithIgnoreCase(str, suffix);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void endsWithIgnoreCaseInputNotNullNotNullOutputFalse2() {

    // Arrange
    final String str = "\'";
    final String suffix = "a\'b\'c";

    // Act
    final boolean actual = StringHelper.endsWithIgnoreCase(str, suffix);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void endsWithIgnoreCaseInputNotNullNotNullOutputTrue() {

    // Arrange
    final String str = "\'";
    final String suffix = "\'";

    // Act
    final boolean actual = StringHelper.endsWithIgnoreCase(str, suffix);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void endsWithIgnoreCaseInputNullNullOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(StringHelper.endsWithIgnoreCase(null, null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFilenameExtensionInputNotNullOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals(
        "////////////////////////////////////////////////////////////////////////////////////////////////",
        StringHelper.getFilenameExtension(
            ".////////////////////////////////////////////////////////////////////////////////////////////////"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFilenameExtensionInputNotNullOutputNull() {

    // Act and Assert result
    Assert.assertNull(StringHelper.getFilenameExtension("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFilenameExtensionInputNullOutputNull() {

    // Act and Assert result
    Assert.assertNull(StringHelper.getFilenameExtension(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFilenameInputNotNullOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("", StringHelper.getFilename("/"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFilenameInputNotNullOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals("foo", StringHelper.getFilename("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFilenameInputNullOutputNull() {

    // Act and Assert result
    Assert.assertNull(StringHelper.getFilename(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRandomNumberInputNegativeOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("", StringHelper.getRandomNumber(-999_998));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSubStrBeforeTokenInputNotNullNotNullOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("/", StringHelper.getSubStrBeforeToken("/", "foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSubStrBeforeTokenInputNotNullNotNullOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals("", StringHelper.getSubStrBeforeToken("foo", "foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasLengthInputNotNullOutputFalse() {

    // Arrange
    final CharSequence str = "";

    // Act and Assert result
    Assert.assertFalse(StringHelper.hasLength(str));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasLengthInputNotNullOutputTrue() {

    // Arrange
    final CharSequence str = "?";

    // Act and Assert result
    Assert.assertTrue(StringHelper.hasLength(str));
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasLengthInputNullOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(StringHelper.hasLength(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEmptyInputNotNullOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(StringHelper.isEmpty("/"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEmptyInputNotNullOutputTrue() {

    // Act and Assert result
    Assert.assertTrue(StringHelper.isEmpty(""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEmptyInputNullOutputTrue() {

    // Act and Assert result
    Assert.assertTrue(StringHelper.isEmpty(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isNumericInputNotNullOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(StringHelper.isNumeric(""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isNumericInputNullOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(StringHelper.isNumeric(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void joinInput0NotNullOutputNotNull() {

    // Arrange
    final String[] array = {};

    // Act and Assert result
    Assert.assertEquals("", StringHelper.join(array, "/"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void joinInput2NotNullOutputNotNull() {

    // Arrange
    final String[] array = {null, "??????????????"};

    // Act and Assert result
    Assert.assertEquals("?????????????????????", StringHelper.join(array, "???????"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void joinInput2NullOutputNotNull() {

    // Arrange
    final String[] array = {"??????????????", "???????"};

    // Act and Assert result
    Assert.assertEquals("?????????????????????", StringHelper.join(array, null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void quoteIfStringInputNullOutputNull() {

    // Act and Assert result
    Assert.assertNull(StringHelper.quoteIfString(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void quoteInputNotNullOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("\'/\'", StringHelper.quote("/"));
  }

  // Test written by Diffblue Cover.

  @Test
  public void startsWithIgnoreCaseInputNotNullNotNullOutputFalse() {

    // Arrange
    final String str = "/";
    final String prefix = "foo";

    // Act
    final boolean actual = StringHelper.startsWithIgnoreCase(str, prefix);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void startsWithIgnoreCaseInputNotNullNotNullOutputFalse2() {

    // Arrange
    final String str = "a\'b\'c";
    final String prefix = "a/b/c";

    // Act
    final boolean actual = StringHelper.startsWithIgnoreCase(str, prefix);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void startsWithIgnoreCaseInputNotNullNotNullOutputTrue() {

    // Arrange
    final String str = "/";
    final String prefix = "/";

    // Act
    final boolean actual = StringHelper.startsWithIgnoreCase(str, prefix);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void startsWithIgnoreCaseInputNullNullOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(StringHelper.startsWithIgnoreCase(null, null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void stripFilenameExtensionInputNotNullOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("/", StringHelper.stripFilenameExtension("/"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void stripFilenameExtensionInputNotNullOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals(
        "77777777777777777777777777777777777777777777777777777777777777777777777777777777",
        StringHelper.stripFilenameExtension(
            "77777777777777777777777777777777777777777777777777777777777777777777777777777777.///////////////"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void stripFilenameExtensionInputNullOutputNull() {

    // Act and Assert result
    Assert.assertNull(StringHelper.stripFilenameExtension(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void substringMatchInputNotNullNegativeNotNullOutputStringIndexOutOfBoundsException() {

    // Arrange
    final CharSequence str = "??????????????????????????????????";
    final CharSequence substring = "\u0000\u0000\u0000?????????????";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    StringHelper.substringMatch(str, -2_147_483_451, substring);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void substringMatchInputNotNullPositiveNotNullOutputFalse() {

    // Arrange
    final CharSequence str = "\uffe0";
    final CharSequence substring = "\u0000";

    // Act and Assert result
    Assert.assertFalse(StringHelper.substringMatch(str, 2, substring));
  }

  // Test written by Diffblue Cover.
  @Test
  public void substringMatchInputNotNullPositiveNotNullOutputFalse2() {

    // Arrange
    final CharSequence str =
        "\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe1??????????????????????????";
    final CharSequence substring = "\u0000\u0000";

    // Act and Assert result
    Assert.assertFalse(StringHelper.substringMatch(str, 69, substring));
  }

  // Test written by Diffblue Cover.
  @Test
  public void substringMatchInputNotNullPositiveNotNullOutputFalse3() {

    // Arrange
    final CharSequence str =
        "\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0\uffe0";
    final CharSequence substring = "\uffe0\u0000";

    // Act and Assert result
    Assert.assertFalse(StringHelper.substringMatch(str, 47, substring));
  }

  // Test written by Diffblue Cover.
  @Test
  public void substringMatchInputNotNullPositiveNotNullOutputTrue() {

    // Arrange
    final CharSequence str = "\uffe0";
    final CharSequence substring = "";

    // Act and Assert result
    Assert.assertTrue(StringHelper.substringMatch(str, 2, substring));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tokenizeToStringArrayInputNullNotNullTrueFalseOutputNull() {

    // Act and Assert result
    Assert.assertNull(StringHelper.tokenizeToStringArray(null, "", true, false));
  }

  // Test written by Diffblue Cover.
  @Test
  public void toLanguageTagInputNullOutputNullPointerException() {

    // Act
    thrown.expect(NullPointerException.class);
    StringHelper.toLanguageTag(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void toStringArrayInput1Output1() {

    // Arrange
    final ArrayList<String> collection = new ArrayList<String>();
    collection.add(null);

    // Act
    final String[] actual = StringHelper.toStringArray(collection);

    // Assert result
    Assert.assertArrayEquals(new String[] {null}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void unqualifyInputNotNullNotNullOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("", StringHelper.unqualify("/", '/'));
  }
}