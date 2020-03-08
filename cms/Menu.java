<<<<<<< HEAD
package com.hexaware.MLP178.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {

/**
 * foodId to store foodId.
 */
  private int foodId;
  /**
 * menuCat to store menu category.
 */
  private String menuCat;
  /**
 * menuItem to store food name.
 */
  private int menuItem;
  /**
 * menuQuatity to store quantity.
 */
  private int menuQuantity;
  /**
 * menuCost to store cost.
 */
  private int menuCost;
  /**
 * menuCalories to store calories.
 */
  private int menuCalories;
   /**
 * menuReviews to store food reviews.
 */
  private int menuReviews;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argFoodId to initialize food id.
 * used to get details through constructor.
 */
  public Menu(final int argFoodId) {
    this.foodId = argFoodId;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Menu menu = (Menu) obj;
    if (Objects.equals(foodId, menu.foodId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(foodId);
  }
    /**
     * @return this food ID.
     */
  public final int getFoodId() {
    return foodId;
  }
    /**
     * @param argFoodId gets the food id.
     */
  public final void setFoodId(final int argFoodId) {
    this.foodId = argFoodId;
  }
  /**
     * @return this menu category.
     */
  public final String getMenuCat() {
    return menuCat;
  }
  /**
     * @param argMenuCat gets the menu category1.
     */
  public final void setMenuCat(final String argMenuCat) {
    this.menuCat = argMenuCat;
  }
    /**
     * @return this menu item.
     */
  public final int getMenuItem() {
    return menuItem;
  }
  /**
   * @param argMenuItem gets the menu item.
   */
  public final void setMenuItem(final int argMenuItem) {
    this.menuItem = argMenuItem;
  }
   /**
     * @return this menu quantity.
     */
  public final int getMenuQuantity() {
    return menuQuantity;
  }
  /**
   * @param argMenuQuantity gets the menu Quantity.
   */
  public final void setMenuQuantity(final int argMenuQuantity) {
    this.menuQuantity = argMenuQuantity;
  }
  /**
     * @return this menu cost.
     */
  public final int getMenuCost() {
    return menuCost;
  }
  /**
   * @param argMenuCost gets the menu Quantity.
   */
  public final void setMenuCost(final int argMenuCost) {
    this.menuCost = argMenuCost;
  }
  /**
     * @return this menu calories.
     */
  public final int getMenuCalories() {
    return menuCalories;
  }
  /**
   * @param argMenuCalories gets the menu Quantity.
   */
  public final void setMenuCalories(final int argMenuCalories) {
    this.menuCalories = argMenuCalories;
  }
  /**
     * @return this menu reviews.
     */
  public final int getMenuReviews() {
    return menuReviews;
  }
  /**
   * @param argMenuReviews gets the menu reviews.
   */
  public final void setMenuReviews(final int argMenuReviews) {
    this.menuReviews = argMenuReviews;
  }
}
=======
package com.hexaware.MLP178.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {

/**
 * foodId to store foodId.
 */
  private int foodId;
  /**
 * menuCat to store menu category.
 */
  private String menuCat;
  /**
 * menuItem to store food name.
 */
  private int menuItem;
  /**
 * menuQuatity to store quantity.
 */
  private int menuQuantity;
  /**
 * menuCost to store cost.
 */
  private int menuCost;
  /**
 * menuCalories to store calories.
 */
  private int menuCalories;
   /**
 * menuReviews to store food reviews.
 */
  private int menuReviews;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argFoodId to initialize food id.
 * used to get details through constructor.
 */
  public Menu(final int argFoodId) {
    this.foodId = argFoodId;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Menu menu = (Menu) obj;
    if (Objects.equals(foodId, menu.foodId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(foodId);
  }
    /**
     * @return this food ID.
     */
  public final int getFoodId() {
    return foodId;
  }
    /**
     * @param argFoodId gets the food id.
     */
  public final void setFoodId(final int argFoodId) {
    this.foodId = argFoodId;
  }
  /**
     * @return this menu category.
     */
  public final String getMenuCat() {
    return menuCat;
  }
  /**
     * @param argMenuCat gets the menu category1.
     */
  public final void setMenuCat(final String argMenuCat) {
    this.menuCat = argMenuCat;
  }
    /**
     * @return this menu item.
     */
  public final int getMenuItem() {
    return menuItem;
  }
  /**
   * @param argMenuItem gets the menu item.
   */
  public final void setMenuItem(final int argMenuItem) {
    this.menuItem = argMenuItem;
  }
   /**
     * @return this menu quantity.
     */
  public final int getMenuQuantity() {
    return menuQuantity;
  }
  /**
   * @param argMenuQuantity gets the menu Quantity.
   */
  public final void setMenuQuantity(final int argMenuQuantity) {
    this.menuQuantity = argMenuQuantity;
  }
  /**
     * @return this menu cost.
     */
  public final int getMenuCost() {
    return menuCost;
  }
  /**
   * @param argMenuCost gets the menu Quantity.
   */
  public final void setMenuCost(final int argMenuCost) {
    this.menuCost = argMenuCost;
  }
  /**
     * @return this menu calories.
     */
  public final int getMenuCalories() {
    return menuCalories;
  }
  /**
   * @param argMenuCalories gets the menu Quantity.
   */
  public final void setMenuCalories(final int argMenuCalories) {
    this.menuCalories = argMenuCalories;
  }
  /**
     * @return this menu reviews.
     */
  public final int getMenuReviews() {
    return menuReviews;
  }
  /**
   * @param argMenuReviews gets the menu reviews.
   */
  public final void setMenuReviews(final int argMenuReviews) {
    this.menuReviews = argMenuReviews;
  }
}
>>>>>>> 94efc40dcb80642c275cc9a8e864ed8eee42c31a
