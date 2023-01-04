package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    private HashMap<Furniture, Integer> order;

  public FurnitureOrder() {
    order = new HashMap<Furniture, Integer>();
  }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        if (order.containsKey(type)) {
            order.put(type, order.get(type) + count);
          } else {
            order.put(type, count);
          }
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return order;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float totalCost = 0;
    for (Furniture type : order.keySet()) {
      totalCost += getTypeCost(type);
    }
    return totalCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        if (order.containsKey(type)) {
            return order.get(type);
          } else {
            return 0;
        }
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if (order.containsKey(type)) {
            return type.getCost() * order.get(type);
          } else {
            return 0;
          }
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int totalQuantity = 0;
    for (Furniture type : order.keySet()) {
      totalQuantity += getTypeCount(type);
    }
    return totalQuantity;
    }
}
