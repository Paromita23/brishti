package com.hexaware.MLP178.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {

/**
 * menuId to store menuId.
 */
  private int menuId;
  /**
 * menuCat to store menu category.
 */
  private MenuCat menuCat;
  /**
 * menuItem to store food name.
 */
  private String menuItem;
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
  private String menuReviews;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argMenuId to initialize food id.
 * used to get details through constructor.
  * @param argMenuCat to initialize food price.
 * @param argMenuItem to initialize food Detail.
 * @param argMenuQuantity to initialize food Status.
 * @param argMenuCost to initialize food Rating.
 * @param argMenuCalories to initialize food Rating.
 * @param argMenuReviews to initialize food Rating.
 * used to get details through constructor.
 */
  public Menu(final int argMenuId, final MenuCat argMenuCat, final String argMenuItem,
        final int argMenuQuantity, final int argMenuCost, final int argMenuCalories, final String argMenuReviews) {
    this.menuId = argMenuId;
    this.menuCat = argMenuCat;
    this.menuItem = argMenuItem;
    this.menuQuantity = argMenuQuantity;
    this.menuCost = argMenuCost;
    this.menuCalories = argMenuCalories;
    this.menuReviews = argMenuReviews;
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
    if (Objects.equals(menuId, menu.menuId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(menuId);
  }
  @Override
    public final String toString() {
    return String.format("%15s %15s %15s %15s %15s %15s %15s", menuId, menuCat, menuItem,
     menuQuantity,  menuCost, menuCalories, menuReviews);
  }
    /**
     * @return this food ID.
     */
  public final int getMenuId() {
    return menuId;
  }
    /**
     * @param argMenuId gets the food id.
     */
  public final void setMenuId(final int argMenuId) {
    this.menuId = argMenuId;
  }
  /**
     * @return this menu category.
     */
  public final MenuCat getMenuCat() {
    return menuCat;
  }
  /**
     * @param argMenuCat gets the menu category1.
     */
  public final void setMenuCat(final MenuCat argMenuCat) {
    this.menuCat = argMenuCat;
  }
    /**
     * @return this menu item.
     */
  public final String getMenuItem() {
    return menuItem;
  }
  /**
   * @param argMenuItem gets the menu item.
   */
  public final void setMenuItem(final String argMenuItem) {
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
  public final String getMenuReviews() {
    return menuReviews;
  }
  /**
   * @param argMenuReviews gets the menu reviews.
   */
  public final void setMenuReviews(final String argMenuReviews) {
    this.menuReviews = argMenuReviews;
  }
}
