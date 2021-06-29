package io.qameta.allure;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface AllureFeatures {

  @Documented
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.METHOD, ElementType.TYPE})
  @Feature("Issues")
  @Component("Веб-интерфейс")
  @AutoMember("anovikova")
  @ManualMember("ipetrov")
  @interface Issues {

  }

  @Documented
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.METHOD, ElementType.TYPE})
  @Feature("PullRequests")
  @Component("Веб-интерфейс")
  @AutoMember("ivanov")
  @ManualMember("ipetrov")
  @interface PullRequests {

  }


  @Documented
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.METHOD, ElementType.TYPE})
  @Feature("Milestones")
  @Component("Веб-интерфейс")
  @AutoMember("sidorov")
  @ManualMember("sidorov")
  @interface Milestones {

  }
}
