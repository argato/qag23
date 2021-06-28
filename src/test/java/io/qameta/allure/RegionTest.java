package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
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
}
