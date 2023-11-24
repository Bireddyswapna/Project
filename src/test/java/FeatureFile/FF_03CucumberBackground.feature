Feature:CreateAnAccount

  Background:
    Given open browser and enter url and navigate to GoodGuys website
    Then Click on signup link from homepage
  @Regression @Smoke
  @First
  Scenario:
    Given from the signup page click on CrateAnAccount button
    Then enter FirstName as MyName
  Scenario:
    Given from the signup page click on catalogues
    Then click on the image

