@compare
Feature: Test compare functionality


  Scenario Outline: compare some products
    Given User opens flipkart in firefox
    When User mouse hover on "<top_menu>"
    And Click on "<sub_menu>"
    And Checked checkbox Add to Compare for <product1> and <product2>
    And Click on COMPARE
    Then  User should redirect to Compare page

    Examples:
      | top_menu    | sub_menu | product1 | product2 |
      | Electronics | DSLR     | 0        | 1        |



