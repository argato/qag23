package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RegionTest {

  @DisplayName("Проверка региона")
  @ParameterizedTest(name = "{displayName}")
  @CsvSource({
      "Москва, Московская область",
      "Реутов, Московская область",
      "Зея, Амурская область"
  })
  public void testRegion(String city, String region) {
    Allure.parameter("Город", city);
    Allure.parameter("регион", region);
  }


  @Test
  @DisplayName("Проверка аннотаций members")
  @AutoMember("anovikova")
  @ManualMember("ipetrov")
  public void testMembers() {
    assert false;
  }


  @Test
  @Component("База данных")
  @DisplayName("Проверка работы секции Fields")
  public void testCustomFields() {
    assert true;
  }

  @Test
  @Tags({@Tag("critical"), @Tag("web")})
  @DisplayName("Проверка работы Tags")
  public void testTags() {
    assert true;
  }

  @Test
  @AllureFeatures.PullRequests
  @Tags({@Tag("critical"), @Tag("web")})
  @DisplayName("Проверка работы Tags")
  public void testBigAnnotation() {
    assert true;
  }
}
